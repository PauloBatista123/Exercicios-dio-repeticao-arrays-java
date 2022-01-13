package com.dio.fila;

public class Fila<T> {

    private No<T> refNoEntradaFila;

    public Fila() {
        this.refNoEntradaFila = null;
    }

    public boolean isEmpty(){
        return refNoEntradaFila == null ? true : false;
    }

    public void enqueue(T obj){
        No<T> novoNo = new No(obj);
        novoNo.setReferenciaNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    public T first(){
        if(!isEmpty()){
            No<T> primeiroNo = refNoEntradaFila;
            while (true){
                if(primeiroNo.getReferenciaNo() != null){
                    primeiroNo = primeiroNo.getReferenciaNo();
                }else{
                    break;
                }
            }
            return primeiroNo.getObject();
        }

        return null;
    }

    public T dequeue(){
        if(!isEmpty()){
            No<T> primeiroNo = refNoEntradaFila;
            No<T> noAuxiliar = refNoEntradaFila;
            while (true){
                if(primeiroNo.getReferenciaNo() != null){
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getReferenciaNo();
                }else{
                    noAuxiliar.setReferenciaNo(null);
                    break;
                }
            }

            return primeiroNo.getObject();
        }

        return null;
    }

    @Override
    public String toString() {
        String retornoString = "";
        No<T> noAuxiliar = refNoEntradaFila;

        if (refNoEntradaFila != null){
            while (true) {
                retornoString += "[No{objeto=" + noAuxiliar.getObject() + "}] -->";

                if(noAuxiliar.getReferenciaNo() != null){
                    noAuxiliar = noAuxiliar.getReferenciaNo();
                }else{
                    retornoString += "null";
                    break;
                }
            }
        }else{
            retornoString += "null";
        }
        return retornoString;
    }
}
