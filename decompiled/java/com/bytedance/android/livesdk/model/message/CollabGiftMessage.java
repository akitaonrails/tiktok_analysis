package com.bytedance.android.livesdk.model.message;

import X.AbstractC1136060ffY;
import X.C001A;
import X.C09CT;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;

/* JADX INFO: loaded from: classes.dex */
public final class CollabGiftMessage extends AbstractC1136060ffY {

    @C09CT("active_info")
    public CollabGiftActiveInfo activeInfo;

    @C09CT("base_info")
    public CollabGiftBaseInfo baseInfo;

    @C09CT("effect")
    public AssetsModel effect;

    @C09CT("finish_info")
    public CollabGiftFinishInfo finishInfo;

    @C09CT("full_info")
    public CollabGiftFullInfo fullInfo;

    @C09CT("type")
    public int msgType;

    @C09CT("update_info")
    public CollabGiftUpdateInfo updateInfo;

    public CollabGiftMessage() {
        this.type = C001A.COLLAB_GIFT_MESSAGE;
    }
}
