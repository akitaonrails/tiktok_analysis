package com.ss.android.ugc.aweme.legoImp.task;

import X.C0BX7;
import X.C0CCZ;
import X.C0VU1;
import X.C0VZ0;
import X.C1608090rwt;
import X.C18ZN;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import X.InterfaceC799590VYf;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.FeedCommonService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class NewUserJourneyDialogCleanTask implements C0CCZ, C18ZN, InterfaceC799590VYf {
    public final FeedCommonService LL = (FeedCommonService) ServiceManager.get().getService(FeedCommonService.class);

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "NewUserJourneyDialogCleanTask";
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int level() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int priority() {
        return 1;
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

    @Override // X.C18ZN
    public final void onAppBackground() {
        this.LL.LJIIL();
    }

    @Override // X.C18ZN
    public final void onAppForeground() {
        if (((Number) C0BX7.LIZ.getValue()).intValue() == 0) {
            this.LL.LJII();
        }
    }

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.CPU;
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        ((FeedCommonService) ServiceManager.get().getService(FeedCommonService.class)).LJIJJ();
        ActivityStack.addNonWeakAppBackGroundListener(this);
        C1608090rwt.LIZIZ.LJIIJ("NewUserJourneyDialogCleanTask");
    }
}
