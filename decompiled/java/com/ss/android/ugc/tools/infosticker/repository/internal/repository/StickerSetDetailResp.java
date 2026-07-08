package com.ss.android.ugc.tools.infosticker.repository.internal.repository;

import X.C09CT;
import X.C13BV;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes23.dex */
public final class StickerSetDetailResp {

    @C09CT("asset_list")
    public final List<Asset> assetList;

    @C09CT("count")
    public final int count;

    @C09CT("cursor")
    public final int cursor;

    @C09CT("message")
    public final String message;

    @C09CT("set_id")
    public final String setId;

    @C09CT("status_code")
    public final int statusCode;

    public StickerSetDetailResp() {
        this(null, 0, null, 0, 0, null, 63, null);
    }

    public StickerSetDetailResp(String str, int i, List<Asset> list, int i2, int i3, String str2) {
        this.message = str;
        this.statusCode = i;
        this.assetList = list;
        this.cursor = i2;
        this.count = i3;
        this.setId = str2;
    }

    public StickerSetDetailResp(String str, int i, List list, int i2, int i3, String str2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? -1 : i, (i4 & 4) != 0 ? C13BV.INSTANCE : list, (i4 & 8) != 0 ? 0 : i2, (i4 & 16) != 0 ? 0 : i3, (i4 & 32) == 0 ? str2 : "");
    }
}
