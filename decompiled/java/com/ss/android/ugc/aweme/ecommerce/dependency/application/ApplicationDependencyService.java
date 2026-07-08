package com.ss.android.ugc.aweme.ecommerce.dependency.application;

import X.AbstractC1387200mCc;
import X.C1400380mXs;
import X.C1514430pVp;
import X.C1724400uyU;
import X.C19252910Tv;
import X.C1BWL;
import X.C2214201BlK;
import X.C844470XAv;
import X.C928103jz;
import X.InterfaceC911603hK;
import Y.AfS171S0100000_2;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.app.IAwemeApplicationService;
import com.ss.android.ugc.aweme.ecommerce.dependency.application.ApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS263S0000000_23;
import kotlin.jvm.internal.AwS1S1300100_1;

/* JADX INFO: loaded from: classes27.dex */
public final class ApplicationDependencyService implements IApplicationDependencyService {
    public final IMainService mainService = (IMainService) ServiceManager.get().getService(IMainService.class);
    public final InterfaceC911603hK rootPageMonitor = new InterfaceC911603hK() { // from class: X.06mc
        @Override // X.InterfaceC911603hK
        public final C928103jz[] LIZ() {
            AbstractC1387200mCc[] abstractC1387200mCcArrLJII = C1906580ziK.LJII();
            ApplicationDependencyService applicationDependencyService = this.LIZ;
            ArrayList arrayList = new ArrayList(abstractC1387200mCcArrLJII.length);
            for (AbstractC1387200mCc abstractC1387200mCc : abstractC1387200mCcArrLJII) {
                arrayList.add(applicationDependencyService.toECRootPage(abstractC1387200mCc));
            }
            return (C928103jz[]) arrayList.toArray(new C928103jz[0]);
        }

        @Override // X.InterfaceC911603hK
        public final C928103jz LIZJ() {
            AbstractC1387200mCc abstractC1387200mCcLJFF = C1906580ziK.LJFF();
            if (abstractC1387200mCcLJFF != null) {
                return this.LIZ.toECRootPage(abstractC1387200mCcLJFF);
            }
            return null;
        }

        @Override // X.InterfaceC911603hK
        public final boolean LJFF() {
            return C1906580ziK.LJI();
        }

        @Override // X.InterfaceC911603hK
        public final C928103jz getTop() {
            AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
            if (abstractC1387200mCcLJ != null) {
                return this.LIZ.toECRootPage(abstractC1387200mCcLJ);
            }
            return null;
        }

        @Override // X.InterfaceC911603hK
        public final C928103jz LIZIZ(View view) {
            AbstractC1387200mCc abstractC1387200mCcLIZ = C520040KaQ.LIZ(view);
            if (abstractC1387200mCcLIZ != null) {
                return this.LIZ.toECRootPage(abstractC1387200mCcLIZ);
            }
            return null;
        }

        @Override // X.InterfaceC911603hK
        public final C11JF LIZLLL(AwS1S1300100_1 awS1S1300100_1) {
            return C1906580ziK.LIZJ().LIZ().LJLLLLLL(new AfS171S0100000_2(awS1S1300100_1, 12));
        }

        @Override // X.InterfaceC911603hK
        public final C928103jz LJ(Fragment fragment) {
            AbstractC1387200mCc abstractC1387200mCcLIZIZ = C520040KaQ.LIZIZ(fragment);
            if (abstractC1387200mCcLIZIZ != null) {
                return this.LIZ.toECRootPage(abstractC1387200mCcLIZIZ);
            }
            return null;
        }

        @Override // X.InterfaceC911603hK
        public final C11JF LJI(final AFwS263S0000000_23 aFwS263S0000000_23) {
            return (C11JF) C1906580ziK.LIZJ().LIZ().LJJLJLI(new C09JN() { // from class: X.06md
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("ApplicationDependencyService@918b.rootPageMonitor$1$subscribeBackgroundSwitch$1");
                    aFwS263S0000000_23.invoke(Boolean.valueOf(((C606810Nr5) obj).LIZIZ));
                    C1C7U.LIZIZ("ApplicationDependencyService@918b.rootPageMonitor$1$subscribeBackgroundSwitch$1");
                }
            });
        }
    };

    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService
    public boolean isLocalTest() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService
    public boolean isOffline() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService
    public boolean isRegressionTest() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService
    public int getAppId() {
        C844470XAv.LIZ.getClass();
        return C844470XAv.LJIIJ;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService
    public String getAppName() {
        C844470XAv.LIZ.getClass();
        String str = C844470XAv.LJ;
        if (str == null) {
            return null;
        }
        return str;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService
    public Context getApplicationContext() {
        C844470XAv.LIZ.getClass();
        return C844470XAv.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService
    public String getChannel() {
        C844470XAv.LIZ.getClass();
        return C844470XAv.LJIILL;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService
    public C1724400uyU getVersionInfo() {
        C844470XAv.LIZ.getClass();
        return new C1724400uyU(C844470XAv.LJFF(), C844470XAv.LJ(), C844470XAv.LIZLLL(), C844470XAv.LIZJ());
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService
    public boolean isPad() {
        return C19252910Tv.LIZIZ.LIZLLL().LJIIJ().isPad() == 1;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService
    public Application getApplication() {
        return C1BWL.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService
    public Activity getCurrentActivity() {
        return C2214201BlK.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService
    public Resources getResources() {
        return C1BWL.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService
    public boolean isAppHot() {
        return ((IAwemeApplicationService) ServiceManager.get().getService(IAwemeApplicationService.class)).isAppHot();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService
    public boolean isColdStart() {
        return C1400380mXs.LIZ().LIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService
    public boolean isFirstInstallAndFirstLaunch() {
        Boolean boolLIZLLL = C1514430pVp.LIZLLL();
        if (boolLIZLLL != null) {
            return boolLIZLLL.booleanValue();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService
    public boolean boeCanUse() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService
    public InterfaceC911603hK getRootPageMonitor() {
        return this.rootPageMonitor;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService
    public boolean isDebug() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService
    public boolean isHippo() {
        return false;
    }

    public final C928103jz toECRootPage(AbstractC1387200mCc abstractC1387200mCc) {
        return new C928103jz(abstractC1387200mCc.LIZIZ(), abstractC1387200mCc.LJIIIIZZ(), abstractC1387200mCc.LJFF(), abstractC1387200mCc.LIZ, abstractC1387200mCc.LJ());
    }
}
