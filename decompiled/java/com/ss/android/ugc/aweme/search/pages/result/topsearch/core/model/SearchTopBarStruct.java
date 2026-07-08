package com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model;

import X.C09CT;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchTopBarStruct {
    public String LIZ;

    @C09CT("dynamic_patch")
    public final DynamicPatch dynamicPatch;

    @C09CT("top_bar_display")
    public final TopBarDisplay topBarDisplay;

    @C09CT("top_bar_id")
    public final String topBarId;

    @C09CT("top_bar_type")
    public final Integer topBarType;

    @C09CT("top_card_info")
    public final EntityCardTitle topCardInfo;

    public SearchTopBarStruct() {
        this(null, null, null, null, null, null);
    }

    public static SearchTopBarStruct LIZ(SearchTopBarStruct searchTopBarStruct, EntityCardTitle entityCardTitle, TopBarDisplay topBarDisplay, int i) {
        Integer num;
        String str;
        DynamicPatch dynamicPatch;
        TopBarDisplay topBarDisplay2 = topBarDisplay;
        EntityCardTitle entityCardTitle2 = entityCardTitle;
        String str2 = null;
        if ((i & 1) != 0) {
            num = searchTopBarStruct.topBarType;
        } else {
            num = null;
        }
        if ((i & 2) != 0) {
            str = searchTopBarStruct.topBarId;
        } else {
            str = null;
        }
        if ((i & 4) != 0) {
            dynamicPatch = searchTopBarStruct.dynamicPatch;
        } else {
            dynamicPatch = null;
        }
        if ((i & 8) != 0) {
            entityCardTitle2 = searchTopBarStruct.topCardInfo;
        }
        if ((i & 16) != 0) {
            topBarDisplay2 = searchTopBarStruct.topBarDisplay;
        }
        if ((i & 32) != 0) {
            str2 = searchTopBarStruct.LIZ;
        }
        return new SearchTopBarStruct(num, str, dynamicPatch, entityCardTitle2, topBarDisplay2, str2);
    }

    public SearchTopBarStruct(Integer num, String str, DynamicPatch dynamicPatch, EntityCardTitle entityCardTitle, TopBarDisplay topBarDisplay, String str2) {
        this.topBarType = num;
        this.topBarId = str;
        this.dynamicPatch = dynamicPatch;
        this.topCardInfo = entityCardTitle;
        this.topBarDisplay = topBarDisplay;
        this.LIZ = str2;
    }
}
