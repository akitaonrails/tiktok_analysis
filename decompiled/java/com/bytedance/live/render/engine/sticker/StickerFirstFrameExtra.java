package com.bytedance.live.render.engine.sticker;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
public final class StickerFirstFrameExtra {

    @C09CT("resource_added")
    public final List<StickerResource> resourceAdded;

    public StickerFirstFrameExtra() {
        this(null, 1, null);
    }

    public StickerFirstFrameExtra(List<StickerResource> list) {
        this.resourceAdded = list;
    }

    public StickerFirstFrameExtra(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
