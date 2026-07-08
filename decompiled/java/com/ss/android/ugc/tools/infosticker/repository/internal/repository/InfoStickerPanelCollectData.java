package com.ss.android.ugc.tools.infosticker.repository.internal.repository;

import X.C09CT;
import X.C13BV;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes23.dex */
public final class InfoStickerPanelCollectData {

    @C09CT("asset_list")
    public final List<Asset> assetList;

    @C09CT("has_more")
    public final boolean hasMore;

    @C09CT("im_sticker_next_cursor")
    public final long imStickerNextCursor;

    @C09CT("message")
    public final String message;

    @C09CT("next_cursor")
    public final int nextCursor;

    @C09CT("status_code")
    public final int statusCode;

    public InfoStickerPanelCollectData() {
        this(null, false, 0, 0L, 0, null, 63, null);
    }

    public InfoStickerPanelCollectData(List<Asset> list, boolean z, int i, long j, int i2, String str) {
        this.assetList = list;
        this.hasMore = z;
        this.nextCursor = i;
        this.imStickerNextCursor = j;
        this.statusCode = i2;
        this.message = str;
    }

    public InfoStickerPanelCollectData(List list, boolean z, int i, long j, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? C13BV.INSTANCE : list, (i3 & 2) != 0 ? false : z, (i3 & 4) == 0 ? i : 0, (i3 & 8) != 0 ? 0L : j, (i3 & 16) != 0 ? -1 : i2, (i3 & 32) != 0 ? "" : str);
    }
}
