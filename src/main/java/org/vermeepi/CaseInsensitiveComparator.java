package org.vermeepi;

import org.springframework.stereotype.Service;

import java.util.Comparator;

/**
 * Created by piet.vermeersch on 18/02/2016.
 */
@Service
public class CaseInsensitiveComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        assert o1 != null && o2 != null;
        return String.CASE_INSENSITIVE_ORDER.compare(o1, o2);
    }
}

