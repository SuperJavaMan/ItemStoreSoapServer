package com.example.itemstore.endpoint;

import com.example.itemstore.repository.ItemRepository;
import com.itemstore.store.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class ItemStoreEndpoint {

    private final String NAMESPACE_URI = "http://www.itemstore.com/store";
    private ItemRepository repository;

    @Autowired
    public ItemStoreEndpoint(ItemRepository repository) {
        this.repository = repository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetAllItemsRequest")
    @ResponsePayload
    public GetAllItemsResponse getAllItems() {
        GetAllItemsResponse response = new GetAllItemsResponse();
        response.getAllItemsList().addAll(repository.findAllItems());
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetItemByIdRequest")
    @ResponsePayload
    public GetItemByIdResponse getItemById(@RequestPayload long id) {
        GetItemByIdResponse response = new GetItemByIdResponse();
        response.setItem(repository.findItemById(id));
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "AddItemRequest")
    @ResponsePayload
    public AddItemResponse addItem(@RequestPayload Item item) {
        AddItemResponse response = new AddItemResponse();
        String message = repository.addItem(item);
        response.setMessage(message);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "UpdateItemRequest")
    @ResponsePayload
    public UpdateItemResponse updateItem(@RequestPayload long id,
                                         @RequestPayload Item item) {
        UpdateItemResponse response = new UpdateItemResponse();
        String message = repository.updateItem(id, item);
        response.setMessage(message);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "DeleteItemRequest")
    @ResponsePayload
    public DeleteItemResponse deleteItem(@RequestPayload long id) {
        DeleteItemResponse response = new DeleteItemResponse();
        String message = repository.deleteItem(id);
        response.setMessage(message);
        return response;
    }
}
