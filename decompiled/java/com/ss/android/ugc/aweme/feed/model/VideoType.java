package com.ss.android.ugc.aweme.feed.model;

import X.C08FF;

/* JADX INFO: loaded from: classes10.dex */
public enum VideoType {
    FEATURE_VIDEO_CLIENT_SELECTED,
    FEATURE_VIDEO_TIKTOK_SELECTED,
    NO_FEATURE_VIDEO_SELECTED,
    DEFAULT;

    public static VideoType valueOf(String str) {
        return (VideoType) C08FF.LIZ(VideoType.class, str);
    }
}
