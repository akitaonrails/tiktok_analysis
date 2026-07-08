package com.ss.android.ugc.aweme.services.story.forward;

import java.util.List;

/* JADX INFO: loaded from: classes32.dex */
public final class CelebrationRenderVideoInfo {
    public final String coverUrl;
    public final String localPath;
    public final List<Long> originalItemIds;
    public final String templateId;
    public final int videoHeight;
    public final String videoId;
    public final String videoUrl;
    public final int videoWidth;

    public CelebrationRenderVideoInfo(String str, String str2, String str3, String str4, List<Long> list, String str5, int i, int i2) {
        this.videoId = str;
        this.videoUrl = str2;
        this.coverUrl = str3;
        this.localPath = str4;
        this.originalItemIds = list;
        this.templateId = str5;
        this.videoWidth = i;
        this.videoHeight = i2;
    }
}
