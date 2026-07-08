package com.bytedance.android.pgcsdk.subscribe.model;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.chatroom.api.SOVMaskInfo;

/* JADX INFO: loaded from: classes8.dex */
public final class SOPBriefInfo {

    @C09CT("aweme_id")
    public String awemeId = "";

    @C09CT("aweme_type")
    public int awemeType;

    @C09CT("cover")
    public ImageModel cover;

    @C09CT("create_time")
    public long createTime;

    @C09CT("lock_info")
    public int lockInfo;

    @C09CT("mask_info")
    public SOVMaskInfo maskInfo;
}
