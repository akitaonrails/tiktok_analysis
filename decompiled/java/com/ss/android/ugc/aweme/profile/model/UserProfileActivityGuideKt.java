package com.ss.android.ugc.aweme.profile.model;

import com.google.gson.n;

/* JADX INFO: loaded from: classes20.dex */
public final class UserProfileActivityGuideKt {
    public static final n toJsonObject(IconImageModel iconImageModel) {
        n nVar = new n();
        nVar.LJJIIJ("icon_url", iconImageModel.iconUrl);
        nVar.LJJIIJ("icon_url_dark", iconImageModel.iconUrlDark);
        return nVar;
    }
}
