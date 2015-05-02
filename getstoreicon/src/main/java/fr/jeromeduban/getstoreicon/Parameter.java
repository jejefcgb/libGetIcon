package fr.jeromeduban.getstoreicon;

/**
 * Created by jduban on 02/05/15.
 */
public class Parameter {

    private boolean cache;
    private int size = 300;

    public Parameter(){

    }

    public Parameter setSize(int size){
        this.size = size;
        return this;
    }

    public Parameter setCache(boolean cache){
        this.cache = cache;
        return this;
    }

    public boolean getCache() {
        return cache;
    }

    public int getSize() {
        return size;
    }




}