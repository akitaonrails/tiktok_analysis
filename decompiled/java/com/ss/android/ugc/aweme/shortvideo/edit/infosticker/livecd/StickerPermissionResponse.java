package com.ss.android.ugc.aweme.shortvideo.edit.infosticker.livecd;

import X.C09CT;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class StickerPermissionResponse extends BaseResponse {

    @C09CT("sticker_list")
    public final ArrayList<StickerPublishStruct> stickerList;

    public StickerPermissionResponse() {
        this(null);
    }

    public final ArrayList<StickerPublishStruct> getStickerList() {
        return this.stickerList;
    }

    public StickerPermissionResponse(ArrayList<StickerPublishStruct> arrayList) {
        this.stickerList = arrayList;
    }
}
