package com.ss.android.ugc.aweme.services.popsuite;

import X.C1150504el;
import X.C15O7;
import X.C19EG;
import X.C1C7U;
import X.C2214201BlK;
import X.C446900Hfk;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C848230XPh;
import X.InterfaceC1055110dYz;
import android.app.Activity;
import android.os.Bundle;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.IPopSuiteManagerService;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class PopSuiteTabSwitchAssem extends BaseMainContainerAssem {
    public static final int $stable = 8;
    public final IPopSuiteManagerService popSuiteManagerService = (IPopSuiteManagerService) ServiceManager.get().getService(IPopSuiteManagerService.class);
    public final PopSuiteTabSwitchAssem$fypVisibleObserver$1 fypVisibleObserver = new InterfaceC1055110dYz() { // from class: com.ss.android.ugc.aweme.services.popsuite.PopSuiteTabSwitchAssem$fypVisibleObserver$1
        @Override // X.InterfaceC1583780rJg
        public String getHoxNodeTag() {
            return "";
        }

        @Override // X.InterfaceC1055110dYz
        public void onNodeHide(Bundle bundle) {
        }

        @Override // X.InterfaceC1055110dYz
        public void onNodeShow(Bundle bundle) {
            if (!C848230XPh.LL.LJI()) {
                return;
            }
            final PopSuiteTabSwitchAssem popSuiteTabSwitchAssem = this.this$0;
            C15O7.LIZJ(new Callable() { // from class: com.ss.android.ugc.aweme.services.popsuite.PopSuiteTabSwitchAssem$fypVisibleObserver$1$onNodeShow$1
                @Override // java.util.concurrent.Callable
                public final void call() {
                    Activity activityLJFF;
                    if (popSuiteTabSwitchAssem.popSuiteManagerService.getPassportPopupConfig() || !popSuiteTabSwitchAssem.popSuiteManagerService.isPopupConfigPresent("HOME") || (activityLJFF = C2214201BlK.LJFF()) == null) {
                        return;
                    }
                    popSuiteTabSwitchAssem.popSuiteManagerService.popSuiteTriggerPopup(activityLJFF, AFwS213S0000000_24.get$arr$(343));
                }

                @Override // java.util.concurrent.Callable
                public /* bridge */ /* synthetic */ Object call() {
                    C1C7U.LIZ("PopSuiteTabSwitchAssem@90d.fypVisibleObserver$1$onNodeShow$1");
                    call();
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("PopSuiteTabSwitchAssem@90d.fypVisibleObserver$1$onNodeShow$1");
                    return unit;
                }
            });
        }
    };
    public final PopSuiteTabSwitchAssem$inboxVisibleObserver$1 inboxVisibleObserver = new InterfaceC1055110dYz() { // from class: com.ss.android.ugc.aweme.services.popsuite.PopSuiteTabSwitchAssem$inboxVisibleObserver$1
        @Override // X.InterfaceC1583780rJg
        public String getHoxNodeTag() {
            return "";
        }

        @Override // X.InterfaceC1055110dYz
        public void onNodeHide(Bundle bundle) {
        }

        @Override // X.InterfaceC1055110dYz
        public void onNodeShow(Bundle bundle) {
            Activity activityLJFF;
            if (this.this$0.popSuiteManagerService.shouldShowPopSuitePopup("NOTIFICATION") && (activityLJFF = C2214201BlK.LJFF()) != null) {
                this.this$0.popSuiteManagerService.popSuiteTriggerPopup(activityLJFF, AFwS213S0000000_24.get$arr$(344));
            }
        }
    };

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.AbstractC738140SxQ
    public void onCreate() {
        com_ss_android_ugc_aweme_services_popsuite_PopSuiteTabSwitchAssem_com_ss_android_ugc_aweme_main_assems_AssemPerformanceTrackLancet_proxyOnCreate(this);
    }

    public void com_ss_android_ugc_aweme_services_popsuite_PopSuiteTabSwitchAssem__onCreate$___twin___() {
        super.onCreate();
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            C446900Hfk c446900Hfk = Hox.LLJILJIL;
            c446900Hfk.LIZ(c19egLIZ).wQ2("HOME", this.fypVisibleObserver);
            c446900Hfk.LIZ(c19egLIZ).wQ2("NOTIFICATION", this.inboxVisibleObserver);
        }
    }

    public static void com_ss_android_ugc_aweme_services_popsuite_PopSuiteTabSwitchAssem_com_ss_android_ugc_aweme_main_assems_AssemPerformanceTrackLancet_proxyOnCreate(PopSuiteTabSwitchAssem popSuiteTabSwitchAssem) {
        String strJ4 = C786410Ut5.j4("main_act_assem_lifecycle_%s_%s", new Object[]{popSuiteTabSwitchAssem.getClass().getSimpleName(), "onCreate"});
        C1150504el.LIZ().LIZLLL(strJ4, false);
        popSuiteTabSwitchAssem.com_ss_android_ugc_aweme_services_popsuite_PopSuiteTabSwitchAssem__onCreate$___twin___();
        C1150504el.LIZ().LJI(strJ4, false);
    }
}
