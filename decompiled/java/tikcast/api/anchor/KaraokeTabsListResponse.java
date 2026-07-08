package tikcast.api.anchor;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public final class KaraokeTabsListResponse {

    @C09CT("data")
    public Data data;

    public static final class Data {

        @C09CT("all_tabs")
        public List<KaraokeTab> allTabs = new ArrayList();

        @C09CT("favorite_tab")
        public KaraokeTab favoriteTab;
    }
}
