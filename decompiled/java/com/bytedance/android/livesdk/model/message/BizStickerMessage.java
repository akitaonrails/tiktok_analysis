package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.livesdk.model.RoomSticker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class BizStickerMessage extends AbstractC1136060ffY {

    @C09CT("biz_sticker")
    public List<RoomSticker> bizSticker;

    public BizStickerMessage() {
        this.type = C001A.BIZ_STICKER_MESSAGE;
        this.bizSticker = new ArrayList();
    }
}
