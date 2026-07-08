package com.ss.android.ugc.aweme.legoImp.task.mainProcessTask;

import X.C04TD;
import X.C07OX;
import X.C0CCZ;
import X.C0VZ0;
import X.C1209450hZv;
import X.C792860V8i;
import X.C799900VZk;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC799850VZf;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.CommonFeedLaunchServiceImpl;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.ui.X2CFragmentMainPageIconService;
import com.ss.android.ugc.aweme.homepage.experiment.HomepageExperimentServiceImpl;
import com.ss.android.ugc.aweme.main.experiment.IHomepageExperimentService;
import com.ss.android.ugc.aweme.notice.api.services.INoticeService;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes14.dex */
public final class InitLegoInflate implements C0CCZ {
    public static final C792860V8i LL = new C792860V8i();
    public static final AtomicBoolean LLILLJJLI = new AtomicBoolean(false);

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "InitLegoInflate";
    }

    @Override // X.InterfaceC800080Va2
    public final boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.MAIN;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        IHomepageExperimentService homepageExperimentServiceImpl;
        InterfaceC799850VZf interfaceC799850VZfLIZ;
        if (!C07OX.LIZIZ()) {
            LL.LIZ(context);
        }
        Object objLIZ = C04TD.LIZ(IHomepageExperimentService.class, false);
        if (objLIZ != null) {
            homepageExperimentServiceImpl = (IHomepageExperimentService) objLIZ;
        } else {
            homepageExperimentServiceImpl = new HomepageExperimentServiceImpl();
        }
        homepageExperimentServiceImpl.initLegoInflate();
        CommonFeedLaunchServiceImpl.LJ().LIZLLL();
        ((INoticeService) ServiceManager.get().getService(INoticeService.class)).initLegoInflate();
        C1209450hZv.LIZ.getClass();
        C1209450hZv.LIZ().initLegoInflate();
        X2CFragmentMainPageIconService x2CFragmentMainPageIconService = (X2CFragmentMainPageIconService) PluggableExtentionKt.pluggableSpi$default(X2CFragmentMainPageIconService.class, false, false, false, 14, null);
        if (x2CFragmentMainPageIconService != null && (interfaceC799850VZfLIZ = x2CFragmentMainPageIconService.LIZ()) != null) {
            C799900VZk.LIZ.getClass();
            C799900VZk.LIZLLL.LIZ(interfaceC799850VZfLIZ.key(), interfaceC799850VZfLIZ);
        }
    }
}
