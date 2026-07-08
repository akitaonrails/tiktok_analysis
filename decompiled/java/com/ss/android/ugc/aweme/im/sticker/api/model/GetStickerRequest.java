package com.ss.android.ugc.aweme.im.sticker.api.model;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class GetStickerRequest {

    @C09CT("in_house_tenor")
    public final boolean inHouseTenor;

    @C09CT("params")
    public final List<GetStickerParam> params;

    public GetStickerRequest(List<GetStickerParam> list, boolean z) {
        this.params = list;
        this.inHouseTenor = z;
    }

    public GetStickerRequest(List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, z);
    }
}
