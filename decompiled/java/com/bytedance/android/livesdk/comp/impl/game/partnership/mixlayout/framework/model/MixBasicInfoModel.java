package com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.model;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes19.dex */
public final class MixBasicInfoModel {

    @C09CT("cards")
    public final List<MixCardModel> cards;

    public MixBasicInfoModel() {
        this(null, 1, null);
    }

    public MixBasicInfoModel(List<MixCardModel> list) {
        this.cards = list;
    }

    public MixBasicInfoModel(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
