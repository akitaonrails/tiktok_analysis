package com.ss.android.ugc.aweme.im.sharepanel.api.model;

import com.ss.android.ugc.aweme.sharer.model.SharePackage;

/* JADX INFO: loaded from: classes22.dex */
public final class ScreenShotShareContent {
    public final String imagePath;
    public final ScreenShotShareMobEventParam mobParam;
    public final Object shareModel;
    public final SharePackage sharePackage;

    public ScreenShotShareContent(String str, Object obj, SharePackage sharePackage, ScreenShotShareMobEventParam screenShotShareMobEventParam) {
        this.imagePath = str;
        this.shareModel = obj;
        this.sharePackage = sharePackage;
        this.mobParam = screenShotShareMobEventParam;
    }
}
