package com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.model;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes29.dex */
public final class MixTabModel {
    public int LIZ;

    @C09CT("cards")
    public final List<MixCardModel> cards;

    @C09CT("tab_class")
    public final String tabClass;

    @C09CT("tab_id")
    public final String tabId;

    @C09CT("tab_name")
    public final String tabName;

    public MixTabModel() {
        this(null, null, null, null, 15, null);
    }

    public MixTabModel(String str) {
        this(str, null, null, null, 14, null);
    }

    public MixTabModel(String str, String str2) {
        this(str, str2, null, null, 12, null);
    }

    public MixTabModel(String str, String str2, List<MixCardModel> list) {
        this(str, str2, list, null, 8, null);
    }

    public MixTabModel(String str, String str2, List<MixCardModel> list, String str3) {
        this.tabClass = str;
        this.tabName = str2;
        this.cards = list;
        this.tabId = str3;
    }

    public MixTabModel(String str, String str2, List list, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? C13BV.INSTANCE : list, (i & 8) != 0 ? "" : str3);
    }
}
