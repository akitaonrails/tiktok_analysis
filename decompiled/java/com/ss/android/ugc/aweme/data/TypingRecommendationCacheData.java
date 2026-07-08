package com.ss.android.ugc.aweme.data;

import X.C09CT;
import X.C13BV;
import com.ss.android.ugc.aweme.im.common.model.IMEffect;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
public final class TypingRecommendationCacheData {

    @C09CT("effect_list")
    public final List<IMEffect> effectList;

    @C09CT("sticker_list")
    public final List<StickerItem> stickerList;

    public TypingRecommendationCacheData() {
        this(null, null, 3, null);
    }

    public TypingRecommendationCacheData(List<StickerItem> list, List<IMEffect> list2) {
        this.stickerList = list;
        this.effectList = list2;
    }

    public TypingRecommendationCacheData(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2);
    }
}
