package webcast.api.room_live_studio;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes23.dex */
public final class ListContactHistoryResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("items")
        public List<ContactHistoryItem> items = new ArrayList();
    }
}
