package webcast.api.room_live_studio;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ListProductsResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("items")
        public List<ProductCard> items = new ArrayList();

        @C09CT("next_cursor")
        public String nextCursor = "";
    }
}
