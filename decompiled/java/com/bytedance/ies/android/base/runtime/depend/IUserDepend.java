package com.bytedance.ies.android.base.runtime.depend;

import X.C1AFD;
import android.content.Context;

/* JADX INFO: loaded from: classes34.dex */
public interface IUserDepend {
    String getAvatarURL();

    String getNickname();

    String getSecUid();

    String getUniqueID();

    String getUserId();

    boolean hasBoundPhone();

    boolean hasLogin();

    void login(Context context, C1AFD c1afd);

    void logout(Context context);
}
