package com.ss.android.ttf.tasks.applog;

import X.C08Q1;
import X.C1602860roS;
import X.C1BWL;
import X.C844470XAv;
import android.app.Application;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.app.services.IHybridABInfoService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.tiktok.ttf.applog.init.IAppLogAppContext;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class AppLogAppContextImpl implements IAppLogAppContext {
    @Override // com.tiktok.ttf.applog.init.IAppLogAppContext
    public final boolean LIZ() {
        IAccountUserService iAccountUserService = (IAccountUserService) PluggableExtentionKt.pluggableSpi$default(IAccountUserService.class, false, false, false, 14, null);
        return iAccountUserService != null && iAccountUserService.LIZ();
    }

    @Override // com.tiktok.ttf.applog.init.IAppLogAppContext
    public final String LIZIZ() {
        C844470XAv.LIZ.getClass();
        String str = C844470XAv.LJII;
        if (str == null) {
            return null;
        }
        return str;
    }

    @Override // com.tiktok.ttf.applog.init.IAppLogAppContext
    public final Integer LJFF() {
        IHybridABInfoService iHybridABInfoService = (IHybridABInfoService) PluggableExtentionKt.pluggableSpi$default(IHybridABInfoService.class, false, false, false, 14, null);
        if (iHybridABInfoService != null) {
            return iHybridABInfoService.LIZIZ();
        }
        return null;
    }

    @Override // com.tiktok.ttf.applog.init.IAppLogAppContext
    public final boolean isNewUser() {
        C1602860roS.LIZ.getClass();
        return C1602860roS.LJ();
    }

    @Override // com.tiktok.ttf.applog.init.IAppLogAppContext
    public final List<String> LIZJ() {
        return ComplianceServiceProvider.LJII().LIZJ();
    }

    @Override // com.tiktok.ttf.applog.init.IAppLogAppContext
    public final boolean LIZLLL() {
        return ComplianceServiceProvider.LJII().LIZLLL();
    }

    @Override // com.tiktok.ttf.applog.init.IAppLogAppContext
    public final boolean LJ() {
        return C08Q1.LIZJ();
    }

    @Override // com.tiktok.ttf.applog.init.IAppLogAppContext
    public final Application getApplication() {
        return C1BWL.LIZ();
    }
}
