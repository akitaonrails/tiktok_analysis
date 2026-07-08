package com.ss.android.ugc.aweme.main.assems;

import X.C0QSJ;
import X.C0RUJ;
import X.C1150504el;
import X.C1239204t4;
import X.C13LE;
import X.C1585000rLe;
import X.C1602860roS;
import X.C19EG;
import X.C2217381BqS;
import X.C584360Mvy;
import X.C687700QyG;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C799890VZj;
import X.C799900VZk;
import X.InterfaceC1146704e9;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.RunnableC1582670rHt;
import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.interfaces.IConsistentContentAndAdChoiceService;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.base.BaseMainContainerAssem;
import com.ss.android.ugc.aweme.base.MainBusinessAbility;
import com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class NewUserOptAssem extends BaseMainContainerAssem implements C0RUJ, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public RunnableC1582670rHt LL = new RunnableC1582670rHt(this);
    public volatile MainBusinessAbility LLILLJJLI;
    public InterfaceC665370Q7z LLILLL;
    public C0QSJ LLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(NewUserOptAssem.class, "mainBusinessAbility", "getMainBusinessAbility()Lcom/ss/android/ugc/aweme/base/MainBusinessAbility;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.C0RUJ
    public final void Ie() {
    }

    @Override // X.C0RUJ
    public final String T1() {
        return "coldboot_degrade_newuseroptassem";
    }

    @Override // X.C0RUJ
    public final void a6() {
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{MainActivityScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MainActivityScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.C0RUJ
    public final void lj() {
    }

    @Override // X.C0RUJ
    public final boolean m8() {
        return true;
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        ArrayList arrayList;
        IComplianceBusinessService iComplianceBusinessService;
        String strJ4 = C786410Ut5.j4("main_act_assem_lifecycle_%s_%s", new Object[]{"NewUserOptAssem", "onResume"});
        C1150504el.LIZ().LIZLLL(strJ4, false);
        super.onResume();
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null && !c19egLIZ.getIntent().getBooleanExtra("pre_mainactivity_first_enter", false) && (arrayList = (ArrayList) ((LinkedHashMap) C1239204t4.LIZ).get("nuj_premain")) != null && (!arrayList.isEmpty())) {
            C1239204t4.LIZIZ("nuj_premain");
            this.LL = null;
            C799900VZk.LIZ.getClass();
            C799890VZj c799890VZj = new C799890VZj();
            c799890VZj.LIZ(C1585000rLe.LIZIZ.LIZJ());
            c799890VZj.LIZIZ();
            IConsistentContentAndAdChoiceService iConsistentContentAndAdChoiceService = (IConsistentContentAndAdChoiceService) PluggableExtentionKt.pluggableSpi$default(IConsistentContentAndAdChoiceService.class, false, false, false, 14, null);
            if (!TextUtils.isEmpty(iConsistentContentAndAdChoiceService != null ? iConsistentContentAndAdChoiceService.LJFF() : null)) {
                if (TextUtils.equals(iConsistentContentAndAdChoiceService != null ? iConsistentContentAndAdChoiceService.LJFF() : null, "VIDEO_PERSONALIZED")) {
                    IComplianceBusinessService iComplianceBusinessService2 = (IComplianceBusinessService) PluggableExtentionKt.pluggableSpi$default(IComplianceBusinessService.class, false, false, false, 14, null);
                    if (iComplianceBusinessService2 != null) {
                        iComplianceBusinessService2.LJIJJ(false);
                    }
                } else {
                    if (TextUtils.equals(iConsistentContentAndAdChoiceService != null ? iConsistentContentAndAdChoiceService.LJFF() : null, "VIDEO_GENERIC") && (iComplianceBusinessService = (IComplianceBusinessService) PluggableExtentionKt.pluggableSpi$default(IComplianceBusinessService.class, false, false, false, 14, null)) != null) {
                        iComplianceBusinessService.LJIJJ(true);
                    }
                }
                if (iConsistentContentAndAdChoiceService != null) {
                    iConsistentContentAndAdChoiceService.LJI(null);
                }
            }
        }
        C1150504el.LIZ().LJI(strJ4, false);
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        boolean zLJI = MethodIDManager.LJI(72015);
        String strJ4 = C786410Ut5.j4("main_act_assem_lifecycle_%s_%s", new Object[]{"NewUserOptAssem", "onCreate"});
        C1150504el.LIZ().LIZLLL(strJ4, false);
        super.onCreate();
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        C1239204t4.LIZ(new Runnable() { // from class: X.0rHu
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("NewUserOptAssem@ed8b.onCreate$1");
                try {
                    RunnableC1582670rHt runnableC1582670rHt = this.LL.LL;
                    if (runnableC1582670rHt != null) {
                        runnableC1582670rHt.run();
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("NewUserOptAssem@ed8b.onCreate$1");
            }
        }, "nuj_premain", c19egLIZ.getIntent().getBooleanExtra("pre_mainactivity_first_enter", false));
        C1150504el.LIZ().LJI(strJ4, false);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.base.BaseMainContainerAssem, X.InterfaceC1593530rZP
    public final void onWindowFocusChanged(boolean z, boolean z2) {
        super.onWindowFocusChanged(z, z2);
        if (z && z2) {
            C1602860roS.LIZ.getClass();
            if (C1602860roS.LJI() != 1) {
                C584360Mvy.LJ(1);
            }
        }
    }
}
