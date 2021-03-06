package org.hello.springmvc.domain.item;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*

@Repository
public class ItemRepository {

    private static final Map<Long, Item> store = new HashMap<>(); // ConcurrentHashMap
    public static long seq = 0L; //AtomicLong

    public Item save(Item item) {
        item.setId(++seq);
        store.put(item.getId(), item);

        return item;
    }

    public Item findById(Long id) {
        return store.get(id);
    }

    public List<Item> findAll() {
        return new ArrayList<>(store.values());
    }

    public boolean update(Long itemId, Item updateParams) { // ItemParamDto
        Item itemFound = findById(itemId);
        itemFound.setItemName(updateParams.getItemName());
        itemFound.setPrice(updateParams.getPrice());
        itemFound.setQuantity(updateParams.getQuantity());

        return itemFound.getId().equals(itemId);
    }

    public void clear() {
        store.clear();
    }
}
*/
