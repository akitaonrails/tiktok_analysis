package com.bytedance.touchpoint.api.model;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class Video {

    @C09CT("material_id")
    public final String materialId;

    @C09CT("multi_show_count")
    public final int multiShowCount;

    @C09CT("popup_view")
    public PopupView popupView;

    @C09CT("refresh_count")
    public int refreshCount;

    @C09CT("show_popup_after_video_time")
    public int showAfterVideoTime;

    @C09CT("video_cover")
    public String videoCover;

    @C09CT("video_url")
    public String videoUrl;

    public Video(String str, int i, String str2, String str3, int i2, int i3, PopupView popupView) {
        this.materialId = str;
        this.multiShowCount = i;
        this.videoUrl = str2;
        this.videoCover = str3;
        this.showAfterVideoTime = i2;
        this.refreshCount = i3;
        this.popupView = popupView;
    }
}
