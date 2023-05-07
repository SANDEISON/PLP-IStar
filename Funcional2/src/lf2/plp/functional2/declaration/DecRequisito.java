package lf2.plp.functional2.declaration;

import static lf2.plp.expressions1.util.ToStringProvider.listToString;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import lf2.plp.expressions2.expression.Id;
import lf2.plp.expressions2.memory.AmbienteCompilacao;
import lf2.plp.expressions2.memory.VariavelJaDeclaradaException;
import lf2.plp.expressions2.memory.VariavelNaoDeclaradaException;

/**
 * DecRequisito
 */
public class DecRequisito{

	private List<Id> argsId;

	public DecRequisito(List<Id> argsId) {
		this.argsId = argsId;
	}

	public List<Id> getListaId() {
		return argsId;
	}

	/**
	 * Retorna a aridade desta funcao.
	 * 
	 * @return a aridade desta funcao.
	 */
	public int getAridade() {
		return argsId.size();
	}

	@Override
	public String toString() {
		return String.format("req %s", listToString(argsId, ","));
	}

	public boolean checaTipo(AmbienteCompilacao ambiente)
			throws VariavelNaoDeclaradaException, VariavelJaDeclaradaException {
		Long distinctCount = Stream.of(argsId).distinct().count();
		return getAridade() != distinctCount;

	}

	public DecRequisito clone() {
		List<Id> novaLista = new ArrayList<Id>(this.argsId.size());

		for (Id id : this.argsId) {
			novaLista.add(id.clone());
		}

		return new DecRequisito(novaLista);
	}

}