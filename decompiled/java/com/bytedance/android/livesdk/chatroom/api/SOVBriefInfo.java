package com.bytedance.android.livesdk.chatroom.api;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: loaded from: classes.dex */
public final class SOVBriefInfo {

    @C09CT("aweme_id")
    public String awemeId = "";

    @C09CT("cover")
    public ImageModel cover;

    @C09CT("create_time")
    public long createTime;

    @C09CT("lock_info")
    public int lockInfo;

    @C09CT("mask_info")
    public SOVMaskInfo maskInfo;
}
