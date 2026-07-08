package com.bytedance.android.livesdk.gift.assets;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class VideoResource {

    @C09CT("video_md5")
    public String videoMd5;

    @C09CT("video_type_name")
    public String videoTypeName;

    @C09CT("video_url")
    public ResourceModel videoUrl;

    public VideoResource() {
        this("", new ResourceModel(null, null, 3, null), "");
    }

    public VideoResource(String str, ResourceModel resourceModel, String str2) {
        this.videoTypeName = str;
        this.videoUrl = resourceModel;
        this.videoMd5 = str2;
    }
}
