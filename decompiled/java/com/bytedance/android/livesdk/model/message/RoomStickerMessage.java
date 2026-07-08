package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.livesdk.model.RoomSticker;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class RoomStickerMessage extends AbstractC1136060ffY {

    @C09CT("sticker")
    public List<RoomSticker> stickerList;

    public RoomStickerMessage() {
        this.type = C001A.MODIFY_STICKER;
    }
}
