package lf2.plp.functional2.declaration;

import static lf2.plp.expressions1.util.ToStringProvider.listToString;

import java.util.ArrayList;
import java.util.List;

import lf2.plp.expressions2.expression.Id;
import lf2.plp.expressions2.memory.AmbienteCompilacao;
import lf2.plp.expressions2.memory.AmbienteExecucao;
import lf2.plp.expressions2.memory.VariavelJaDeclaradaException;
import lf2.plp.expressions2.memory.VariavelNaoDeclaradaException;
import lf2.plp.functional1.declaration.DeclaracaoFuncional;

/**
 * DecRequisito
 */
public class DecRequisito implements DeclaracaoFuncional {

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

    @Override
    public boolean checaTipo(AmbienteCompilacao ambiente)
            throws VariavelNaoDeclaradaException, VariavelJaDeclaradaException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'checaTipo'");
    }

    @Override
    public void elabora(AmbienteExecucao amb, AmbienteExecucao aux) throws VariavelJaDeclaradaException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'elabora'");
    }

    @Override
    public void elabora(AmbienteCompilacao amb, AmbienteCompilacao aux) throws VariavelJaDeclaradaException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'elabora'");
    }

    @Override
    public void incluir(AmbienteExecucao amb, AmbienteExecucao aux) throws VariavelJaDeclaradaException {

    }

    @Override
    public void incluir(AmbienteCompilacao amb, AmbienteCompilacao aux, boolean incluirCuringa)
            throws VariavelJaDeclaradaException {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'incluir'");
    }

    @Override
    public void reduzir(AmbienteExecucao amb) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'reduzir'");
    }

    public DecRequisito clone() {
        List<Id> novaLista = new ArrayList<Id>(this.argsId.size());

        for (Id id : this.argsId) {
            novaLista.add(id.clone());
        }

        return new DecRequisito(novaLista);
    }

}