package com.example.itemstore.repository;

import com.itemstore.store.Item;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.stream.Collectors;

@Repository
public class ItemRepository {

    private Map<Long, Item> itemStore = new HashMap<>();

    public ItemRepository() {
        Item phone = new Item();
        phone.setId(1L);
        phone.setName("Phone");
        phone.setPrice(8500);
        phone.setCount(12);

        Item tv = new Item();
        tv.setId(2L);
        tv.setName("TV");
        tv.setPrice(14200);
        tv.setCount(5);

        Item laptop = new Item();
        laptop.setId(3L);
        laptop.setName("Laptop");
        laptop.setPrice(41200);
        laptop.setCount(7);

        itemStore.put(phone.getId(), phone);
        itemStore.put(tv.getId(), tv);
        itemStore.put(laptop.getId(), laptop);
    }

    public List<Item> findAllItems() {
        return new ArrayList<Item>(itemStore.values());
    }

    public Item findItemById(long id) {
        if (!itemStore.containsKey(id)) {
            throw new NoSuchElementException("Item with id= " + id + " does not exist");
        }
        return itemStore.get(id);
    }

    public String addItem(Item item) {
            long lastId = itemStore.keySet()
                    .stream()
                    .max(Comparator.comparing(Long::longValue))
                    .orElse(0L);
            long id = lastId + 1L;
            item.setId(id);
            itemStore.put(id, item);
            return "Item with id = " + id + " added successfully";
    }

    public String updateItem(long id, Item item) {
        if (!itemStore.containsKey(id)) {
            throw new NoSuchElementException("Item with id= " + id + " does not exist");
        }
        Item oldItem = itemStore.get(id);
        oldItem.setName(item.getName());
        oldItem.setPrice(item.getPrice());
        oldItem.setCount(item.getCount());
        itemStore.put(id, oldItem);
        return "Item with id = " + id + " updated successfully";
    }

    public String deleteItem(long id) {
        if (!itemStore.containsKey(id)) {
            throw new NoSuchElementException("Item with id= " + id + " does not exist");
        }
        itemStore.remove(id);
        return "Item with id = " + id + " deleted successfully";
    }
}
