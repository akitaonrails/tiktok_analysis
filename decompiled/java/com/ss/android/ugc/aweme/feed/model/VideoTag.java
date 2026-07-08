package com.ss.android.ugc.aweme.feed.model;

import X.C08FF;

/* JADX INFO: loaded from: classes22.dex */
public enum VideoTag {
    DEFAULT(-1),
    FEATURED_VIDEO(1),
    FRIENDS_VIDEO(2),
    FOLLOWERS_VIDEO(3),
    EFFECT(4),
    OFFICIAL(5),
    MDP_SQUARE_MUSIC(6),
    MDP_SQUARE_TEMPLATE(7),
    MDP_SQUARE_EFFECT(8);

    public final int videoTag;

    public int getVideoTag() {
        return this.videoTag;
    }

    public static VideoTag getTag(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return DEFAULT;
                        }
                        return OFFICIAL;
                    }
                    return EFFECT;
                }
                return FOLLOWERS_VIDEO;
            }
            return FRIENDS_VIDEO;
        }
        return FEATURED_VIDEO;
    }

    public static VideoTag valueOf(String str) {
        return (VideoTag) C08FF.LIZ(VideoTag.class, str);
    }

    VideoTag(int i) {
        this.videoTag = i;
    }
}
