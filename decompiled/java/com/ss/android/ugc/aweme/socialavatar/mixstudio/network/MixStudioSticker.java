package com.ss.android.ugc.aweme.socialavatar.mixstudio.network;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes7.dex */
public final class MixStudioSticker {

    @C09CT("animation_task_id")
    public final String animatedTaskId;

    @C09CT("animation_task_status")
    public final Integer animationTaskStatus;

    @C09CT("generation_progress")
    public final MixStudioStickerProgress generationProgress;

    @C09CT("static_task_id")
    public final String staticTaskId;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final int status;

    @C09CT("sticker_id")
    public final Long stickerId;

    public MixStudioSticker() {
        this(null, 0, null, null, null, null);
    }

    public MixStudioSticker(Long l, int i, MixStudioStickerProgress mixStudioStickerProgress, String str, String str2, Integer num) {
        this.stickerId = l;
        this.status = i;
        this.generationProgress = mixStudioStickerProgress;
        this.staticTaskId = str;
        this.animatedTaskId = str2;
        this.animationTaskStatus = num;
    }
}
