//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.19 at 08:52:24 PM EET 
//


package com.itemstore.store;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.itemstore.store package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.itemstore.store
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetItemByIdRequest }
     * 
     */
    public GetItemByIdRequest createGetItemByIdRequest() {
        return new GetItemByIdRequest();
    }

    /**
     * Create an instance of {@link AddItemRequest }
     * 
     */
    public AddItemRequest createAddItemRequest() {
        return new AddItemRequest();
    }

    /**
     * Create an instance of {@link Item }
     * 
     */
    public Item createItem() {
        return new Item();
    }

    /**
     * Create an instance of {@link UpdateItemRequest }
     * 
     */
    public UpdateItemRequest createUpdateItemRequest() {
        return new UpdateItemRequest();
    }

    /**
     * Create an instance of {@link GetItemByIdResponse }
     * 
     */
    public GetItemByIdResponse createGetItemByIdResponse() {
        return new GetItemByIdResponse();
    }

    /**
     * Create an instance of {@link DeleteItemRequest }
     * 
     */
    public DeleteItemRequest createDeleteItemRequest() {
        return new DeleteItemRequest();
    }

    /**
     * Create an instance of {@link DeleteItemResponse }
     * 
     */
    public DeleteItemResponse createDeleteItemResponse() {
        return new DeleteItemResponse();
    }

    /**
     * Create an instance of {@link UpdateItemResponse }
     * 
     */
    public UpdateItemResponse createUpdateItemResponse() {
        return new UpdateItemResponse();
    }

    /**
     * Create an instance of {@link GetAllItemsResponse }
     * 
     */
    public GetAllItemsResponse createGetAllItemsResponse() {
        return new GetAllItemsResponse();
    }

    /**
     * Create an instance of {@link AddItemResponse }
     * 
     */
    public AddItemResponse createAddItemResponse() {
        return new AddItemResponse();
    }

    /**
     * Create an instance of {@link GetAllItemsRequest }
     * 
     */
    public GetAllItemsRequest createGetAllItemsRequest() {
        return new GetAllItemsRequest();
    }

}
