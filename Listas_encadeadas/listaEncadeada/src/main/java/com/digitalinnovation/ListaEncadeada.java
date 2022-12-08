package com.digitalinnovation;

public class ListaEncadeada<T> {
    No<T> referenciaEntrada;

    public ListaEncadeada(){
        this.referenciaEntrada = null;
    }

    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);
        if(this.isEmpty()){
            referenciaEntrada = novoNo;
            return;
        }
        No<T> noAuxiliar = referenciaEntrada;
        for(int i = 0; i < this.size()-1; i++ ){
            noAuxiliar = noAuxiliar.getProxNo();
        }
        noAuxiliar.setProxNo(novoNo);

    }

    public T get(int index){
        return getNo(index).getConteudo();
    }

    private No<T> getNo(int index){
        validaIndice(index);
        No<T> noAuxiliar = referenciaEntrada;
        No<T> noRetorno = null;
        for(int i = 0; i <= index; i++ ){
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProxNo();
        }
        return noRetorno;
    }

    public T remove(int index){
        No<T> noPivor = this.getNo(index);
        if(index == 0){
            referenciaEntrada = noPivor.getProxNo();
            return noPivor.getConteudo();
        }

        No<T> noAnterior = getNo(index -1);
        noAnterior.setProxNo(noAnterior.getProxNo());
        return noPivor.getConteudo();

    }

    public int size(){
        int tamanhoLista = 0;
        No<T> referenciaAux = referenciaEntrada;
        while (true){
            if(referenciaAux != null){
                tamanhoLista++;
                if(referenciaAux.getProxNo() != null){
                    referenciaAux = referenciaAux.getProxNo();
                }else{
                    break;
                }
            }else{
                break;
            }
        }
        return tamanhoLista;
    }

    public void validaIndice(int index){
        if(index >= size()){
            int tamanhoIndex = size() -1;
            throw new IndexOutOfBoundsException("Nao existe conteudo no indice" + index + "desta lista. \n Esta lista so vai ate:" + tamanhoIndex );
        }
    }

    public boolean isEmpty(){
        return referenciaEntrada == null ? true : false;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        No<T> noAuxiliar = referenciaEntrada;
        for(int i = 0; i < this.size(); i++){
            strRetorno += "[No{Conteudo=" + noAuxiliar.getConteudo() + "}]--->";
            noAuxiliar = noAuxiliar.getProxNo();
        }
        strRetorno += "null";

        return strRetorno;
    }

}
