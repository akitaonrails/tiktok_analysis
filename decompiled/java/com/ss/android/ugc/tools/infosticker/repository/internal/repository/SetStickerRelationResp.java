package com.ss.android.ugc.tools.infosticker.repository.internal.repository;

import X.C09CT;

/* JADX INFO: loaded from: classes23.dex */
public final class SetStickerRelationResp {

    @C09CT("data")
    public final SetStickerRelationData data;

    @C09CT("message")
    public final String message;

    @C09CT("status_code")
    public final int statusCode;

    public SetStickerRelationResp() {
        this(null, -1, "");
    }

    public SetStickerRelationResp(SetStickerRelationData setStickerRelationData, int i, String str) {
        this.data = setStickerRelationData;
        this.statusCode = i;
        this.message = str;
    }
}
