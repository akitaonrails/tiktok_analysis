package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: loaded from: classes.dex */
public final class MemberInfo {

    @C09CT("avatar")
    public ImageModel avatar;

    @C09CT("is_staged")
    public boolean isStaged;

    @C09CT("nickname")
    public String nickname = "";

    @C09CT("user_id")
    public long userId;
}
