package com.ss.android.ugc.aweme.affinity.model;

import X.C09CT;

/* JADX INFO: loaded from: classes3.dex */
public final class SocialAffinityItem {

    @C09CT("extras")
    public final String extra;

    @C09CT("score")
    public final double score;

    @C09CT("to_user_id")
    public final String toUserId;

    public SocialAffinityItem() {
        this("", 0.0d, null);
    }

    public SocialAffinityItem(String str, double d, String str2) {
        this.toUserId = str;
        this.score = d;
        this.extra = str2;
    }
}
