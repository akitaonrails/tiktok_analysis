package com.ss.android.ugc.tools.infosticker.repository.internal.repository;

import X.C09CT;
import X.C13BV;
import com.ss.android.ugc.effectmanager.effect.model.StickerSetCategory;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes26.dex */
public final class InfoStickerSetListResp {

    @C09CT("has_more")
    public final boolean hasMore;

    @C09CT("message")
    public final String message;

    @C09CT("next_cursor")
    public final int nextCursor;

    @C09CT("set_list")
    public final List<StickerSetCategory> setList;

    @C09CT("status_code")
    public final int statusCode;

    public InfoStickerSetListResp() {
        this(null, 0, null, false, 0, 31, null);
    }

    public InfoStickerSetListResp(String str, int i, List<StickerSetCategory> list, boolean z, int i2) {
        this.message = str;
        this.statusCode = i;
        this.setList = list;
        this.hasMore = z;
        this.nextCursor = i2;
    }

    public InfoStickerSetListResp(String str, int i, List list, boolean z, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? -1 : i, (i3 & 4) != 0 ? C13BV.INSTANCE : list, (i3 & 8) != 0 ? false : z, (i3 & 16) != 0 ? 0 : i2);
    }
}
