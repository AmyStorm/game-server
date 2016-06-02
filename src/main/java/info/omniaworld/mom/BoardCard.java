package info.omniaworld.mom;

import info.omniaworld.core.Element;

/**
 * Created by Omnia on 2016/6/2.
 */
public class BoardCard implements Element{
    private Integer id;
    private String name;

    public BoardCard(Integer id, String name){
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
