package com.ss.android.ugc.aweme.model;

import X.C09CT;
import X.C13BV;
import com.ss.android.ugc.aweme.im.common.model.IMEffect;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
public final class TypingRecommendationResponse {

    @C09CT("effects")
    public final List<IMEffect> effectList;

    @C09CT("hit_effect_cache")
    public final boolean hitEffectCache;

    @C09CT("hit_sticker_cache")
    public final boolean hitStickerCache;

    @C09CT("stickers")
    public final List<StickerItem> stickerList;

    public TypingRecommendationResponse() {
        this(null, null, false, false, 15, null);
    }

    public TypingRecommendationResponse(List<StickerItem> list, List<IMEffect> list2, boolean z, boolean z2) {
        this.stickerList = list;
        this.effectList = list2;
        this.hitStickerCache = z;
        this.hitEffectCache = z2;
    }

    public TypingRecommendationResponse(List list, List list2, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2);
    }
}
