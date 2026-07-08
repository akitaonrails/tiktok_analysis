package com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.assem;

import X.C019F;
import X.C0KD9;
import X.C13LE;
import X.C1554960qZC;
import X.C1558520qew;
import X.C1637806bA;
import X.C19719912Dl;
import X.C19EG;
import X.C19EH;
import X.C2217381BqS;
import X.C500260Jjc;
import X.C513700KCq;
import X.C513710KCr;
import X.C513730KCt;
import X.C724750Sbp;
import X.C736680Sv4;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.viewmodel.SubPackagePageAssemVM;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public final class SubPackageAbnormalSubStatusAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public final String LLJJI = "";
    public final AssemVMLazy LLJJIII;
    public C513700KCq LLJJIJI;
    public ViewGroup LLJJIJIIJIL;
    public View LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SubPackageAbnormalSubStatusAssem.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/subscription/business/foundation/packagepage/viewmodel/SubPackagePageAssemVM;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SubPackageAbnormalSubStatusAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubPackagePageAssemVM.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C513730KCt(c19719912DlLIZ), new C0KD9(), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.hpp;
    }

    public final C513700KCq hp() {
        if (this.LLJJIJI == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C513700KCq.class, null);
            this.LLJJIJI = interfaceC1555100qZQLIZIZ != null ? (C513700KCq) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJJIJI;
    }

    public final void ip(Fragment fragment) {
        Context baseContext;
        Activity activity;
        C19EG c19eg;
        FragmentManager supportFragmentManager;
        C19EH c19ehLJIIJ;
        try {
            View view = this.LLJJIJIL;
            if (view != null) {
                baseContext = view.getContext();
            } else {
                baseContext = null;
            }
            while (true) {
                if (baseContext instanceof ContextWrapper) {
                    if (baseContext instanceof Activity) {
                        activity = (Activity) baseContext;
                        break;
                    }
                    baseContext = ((ContextWrapper) baseContext).getBaseContext();
                } else if (baseContext instanceof Activity) {
                    activity = (Activity) baseContext;
                } else {
                    activity = null;
                }
            }
            if ((activity instanceof C19EG) && (c19eg = (C19EG) activity) != null && (supportFragmentManager = c19eg.getSupportFragmentManager()) != null && (c19ehLJIIJ = supportFragmentManager.LJIIJ()) != null) {
                c19ehLJIIJ.LJIJ(R.id.f659yd, fragment, null);
                c19ehLJIIJ.LJIIIZ();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ViewGroup viewGroup;
        super.onViewCreated(view);
        if (view != null && (viewGroup = (ViewGroup) view.findViewById(R.id.f659yd)) != null) {
            C500260Jjc.LJIILIIL(viewGroup);
        } else {
            viewGroup = null;
        }
        this.LLJJIJIIJIL = viewGroup;
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0KID
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0KGF) obj).LLILLJJLI;
            }
        }, null, new C513710KCr(this), 6);
        this.LLJJIJIL = view;
    }
}
