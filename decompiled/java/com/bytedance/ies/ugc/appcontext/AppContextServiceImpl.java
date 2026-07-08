package com.bytedance.ies.ugc.appcontext;

import X.C1BWL;
import X.C2214201BlK;
import X.C844470XAv;
import android.app.Activity;
import android.app.Application;
import android.content.Context;

/* JADX INFO: loaded from: classes14.dex */
public final class AppContextServiceImpl implements IAppContextService {
    @Override // com.bytedance.ies.ugc.appcontext.IAppContextService
    public final boolean LIZLLL() {
        return false;
    }

    @Override // com.bytedance.ies.ugc.appcontext.IAppContextService
    public final boolean isOffline() {
        return false;
    }

    @Override // com.bytedance.ies.ugc.appcontext.IAppContextService
    public final boolean isRegressionTest() {
        return false;
    }

    @Override // com.bytedance.ies.ugc.appcontext.IAppContextService
    public final String LIZ() {
        C844470XAv.LIZ.getClass();
        return C844470XAv.LJIILLIIL;
    }

    @Override // com.bytedance.ies.ugc.appcontext.IAppContextService
    public final long LIZIZ() {
        C844470XAv.LIZ.getClass();
        return C844470XAv.LIZIZ();
    }

    @Override // com.bytedance.ies.ugc.appcontext.IAppContextService
    public final String LIZJ() {
        C844470XAv.LIZ.getClass();
        return C844470XAv.LIZJ();
    }

    @Override // com.bytedance.ies.ugc.appcontext.IAppContextService
    public final String LJFF() {
        C844470XAv.LIZ.getClass();
        return C844470XAv.LJIIL;
    }

    @Override // com.bytedance.ies.ugc.appcontext.IAppContextService
    public final int getAppId() {
        C844470XAv.LIZ.getClass();
        return C844470XAv.LJIIJ;
    }

    @Override // com.bytedance.ies.ugc.appcontext.IAppContextService
    public final String getAppName() {
        C844470XAv.LIZ.getClass();
        String str = C844470XAv.LJ;
        if (str == null) {
            return null;
        }
        return str;
    }

    @Override // com.bytedance.ies.ugc.appcontext.IAppContextService
    public final Context getApplicationContext() {
        C844470XAv.LIZ.getClass();
        return C844470XAv.LIZ();
    }

    @Override // com.bytedance.ies.ugc.appcontext.IAppContextService
    public final String getChannel() {
        C844470XAv.LIZ.getClass();
        return C844470XAv.LJIILL;
    }

    @Override // com.bytedance.ies.ugc.appcontext.IAppContextService
    public final long getUpdateVersionCode() {
        C844470XAv.LIZ.getClass();
        return C844470XAv.LIZLLL();
    }

    @Override // com.bytedance.ies.ugc.appcontext.IAppContextService
    public final long getVersionCode() {
        C844470XAv.LIZ.getClass();
        return C844470XAv.LJ();
    }

    @Override // com.bytedance.ies.ugc.appcontext.IAppContextService
    public final String getVersionName() {
        C844470XAv.LIZ.getClass();
        return C844470XAv.LJFF();
    }

    @Override // com.bytedance.ies.ugc.appcontext.IAppContextService
    public final Application getApplication() {
        return C1BWL.LIZ();
    }

    @Override // com.bytedance.ies.ugc.appcontext.IAppContextService
    public final Activity getCurrentActivity() {
        return C2214201BlK.LJFF();
    }

    @Override // com.bytedance.ies.ugc.appcontext.IAppContextService
    public final int LJ() {
        return C844470XAv.LJIIZILJ;
    }

    @Override // com.bytedance.ies.ugc.appcontext.IAppContextService
    public final boolean isAppBackground() {
        return C2214201BlK.LJIIJJI;
    }

    @Override // com.bytedance.ies.ugc.appcontext.IAppContextService
    public final boolean isDebug() {
        return false;
    }
}
