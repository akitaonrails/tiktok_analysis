package com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.model;

import X.C09CT;
import X.C0PA3;
import X.C0PA4;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.EntityCardTitle;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeedList;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchHubEntityCard implements Serializable {
    public SearchMixFeed searchMixFeed;

    @C09CT("style_type")
    public final int styleType;

    @C09CT("top_card_info")
    public final EntityCardTitle topCardInfo;

    @C09CT("use_mix_entity_style")
    public final boolean useMixEntityStyle;
    public static final C0PA3 Companion = new C0PA3();
    public static final int $stable = 8;

    public SearchHubEntityCard() {
        this(1, null, false);
    }

    public static final void handleNativeHubData(SearchMixFeedList searchMixFeedList, SearchMixFeed searchMixFeed) {
        Companion.getClass();
        C0PA3.LIZ(searchMixFeedList, searchMixFeed);
    }

    public final void setSearchMixFeed(SearchMixFeed searchMixFeed) {
        this.searchMixFeed = searchMixFeed;
    }

    public static final Pair<SearchMixFeed, List<SearchMixFeed>> handleLynxSearchEntity(List<? extends SearchMixFeed> list, C0PA4 c0pa4) {
        ArrayList arrayList;
        SearchHubEntityCard entityCard;
        SearchHubEntityCard entityCard2;
        EntityCardTitle entityCardTitle;
        Companion.getClass();
        SearchMixFeed searchMixFeed = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (SearchMixFeed searchMixFeed2 : list) {
                SearchMixFeed searchMixFeed3 = searchMixFeed2;
                if (searchMixFeed3 != null && searchMixFeed3.getFeedType() == 200 && (entityCard2 = searchMixFeed3.getEntityCard()) != null && (entityCardTitle = entityCard2.topCardInfo) != null && entityCardTitle.dynamicPatch != null) {
                    searchMixFeed = searchMixFeed3;
                } else {
                    arrayList2.add(searchMixFeed2);
                }
            }
            arrayList = new ArrayList(arrayList2);
        } else {
            arrayList = null;
        }
        c0pa4.getClass();
        if (searchMixFeed != null && (entityCard = searchMixFeed.getEntityCard()) != null && c0pa4.LIZ == null) {
            entityCard.setSearchMixFeed(searchMixFeed);
            c0pa4.LIZ = entityCard;
        }
        return new Pair<>(searchMixFeed, arrayList);
    }

    public SearchHubEntityCard(int i, EntityCardTitle entityCardTitle, boolean z) {
        this.styleType = i;
        this.topCardInfo = entityCardTitle;
        this.useMixEntityStyle = z;
    }
}
