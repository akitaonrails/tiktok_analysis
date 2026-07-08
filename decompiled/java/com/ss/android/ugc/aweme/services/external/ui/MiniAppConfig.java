package com.ss.android.ugc.aweme.services.external.ui;

import com.ss.android.ugc.aweme.creative.model.MicroAppModel;
import java.io.Serializable;

/* JADX INFO: loaded from: classes32.dex */
public final class MiniAppConfig implements Serializable {
    public Serializable appClass;
    public MicroAppModel appInfo;
    public String stickerId;

    public final Serializable getAppClass() {
        return this.appClass;
    }

    public final MicroAppModel getAppInfo() {
        return this.appInfo;
    }

    public final String getStickerId() {
        return this.stickerId;
    }

    public final void setAppClass(Serializable serializable) {
        this.appClass = serializable;
    }

    public final void setAppInfo(MicroAppModel microAppModel) {
        this.appInfo = microAppModel;
    }

    public final void setStickerId(String str) {
        this.stickerId = str;
    }
}
