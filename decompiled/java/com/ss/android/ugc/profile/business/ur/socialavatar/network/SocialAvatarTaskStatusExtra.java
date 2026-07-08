package com.ss.android.ugc.profile.business.ur.socialavatar.network;

import X.C09CT;

/* JADX INFO: loaded from: classes7.dex */
public final class SocialAvatarTaskStatusExtra {

    @C09CT("ai_self_preview_url")
    public final String aiSelfPreviewUrl;

    @C09CT("is_aiself_side_task")
    public final boolean isAISelfSideTask;

    @C09CT("social_avatar_preview_url")
    public final String socialAvatarPreviewUrl;

    public SocialAvatarTaskStatusExtra() {
        this(false, null, null);
    }

    public SocialAvatarTaskStatusExtra(boolean z, String str, String str2) {
        this.isAISelfSideTask = z;
        this.socialAvatarPreviewUrl = str;
        this.aiSelfPreviewUrl = str2;
    }
}
