package com.bytedance.ies.ugc.aweme.commercialize.search.setting;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchAdHybridCardStayDurationSettingModel {

    @C09CT("card_list")
    public final List<String> cardList;

    public SearchAdHybridCardStayDurationSettingModel() {
        this(null, 1, null);
    }

    public SearchAdHybridCardStayDurationSettingModel(List<String> list) {
        this.cardList = list;
    }

    public SearchAdHybridCardStayDurationSettingModel(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
