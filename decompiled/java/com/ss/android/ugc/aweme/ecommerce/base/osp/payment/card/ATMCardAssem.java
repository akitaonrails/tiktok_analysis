package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.card;

import X.C019F;
import X.C1388190mED;
import X.C13LE;
import X.C13LP;
import X.C1559260qg8;
import X.C1637806bA;
import X.C197039127h;
import X.C19719912Dl;
import X.C2174021A6m;
import X.C2217381BqS;
import X.C723590SZx;
import X.C724750Sbp;
import X.C888303dZ;
import X.C890103dr;
import X.C904203g8;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC896803ew;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardHalfFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS545S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class ATMCardAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public C197039127h LLIZLLLIL;
    public ViewOnAttachStateChangeListenerC20604515jv LLJ;
    public View LLJI;
    public final AssemVMLazy LLJIJIL;
    public final C1559260qg8 LLJILJIL;
    public final C2174021A6m LLJILJILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ATMCardAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/payment/card/ATMCardViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ATMCardAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ATMCardViewModel.class);
        this.LLJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS545S0100000_1(c19719912DlLIZ, 939), AFwS228S0000000_1.get$arr$(179), null, true);
        this.LLJILJIL = new C1559260qg8(new C723590SZx(this, C888303dZ.class, null), checkSupervisorPrepared());
        this.LLJILJILJ = new C2174021A6m();
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final ATMCardViewModel Ho() {
        AssemVMLazy assemVMLazy = this.LLJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        return (ATMCardViewModel) assemVMLazy.getValue();
    }

    @Override // X.AbstractC738140SxQ
    public final void onStop() {
        Activity activityLIZ;
        super.onStop();
        if (!C904203g8.LJIIJ) {
            List<InterfaceC1891350zJl> list = Ho().getState().LL;
            ArrayList<InterfaceC896803ew> arrayList = new ArrayList();
            for (InterfaceC1891350zJl interfaceC1891350zJl : list) {
                if (interfaceC1891350zJl instanceof InterfaceC896803ew) {
                    arrayList.add(interfaceC1891350zJl);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (InterfaceC896803ew interfaceC896803ew : arrayList) {
                if (interfaceC896803ew.getElementDTO().id != null) {
                    interfaceC896803ew.LJJLIIIJJIZ();
                    throw null;
                }
                C890103dr c890103dr = C890103dr.LIZ;
                String str = interfaceC896803ew.getElementDTO().paramName;
                c890103dr.getClass();
                arrayList2.add(C890103dr.LJIIZILJ(str));
            }
            Pair pair = new Pair(true, arrayList2);
            C890103dr c890103dr2 = C890103dr.LIZ;
            c890103dr2.getClass();
            long jLIZ = C890103dr.LIZ("stay_duration");
            Boolean boolValueOf = Boolean.valueOf(Ho().yQ2().LJI);
            String string = Ho().yQ2().LJII.toString();
            Integer num = Ho().yQ2().LJIIIIZZ;
            String strLJJLIIIJ = C13LP.LJJLIIIJ((Iterable) pair.getSecond(), ",", null, null, 0, null, null, 62);
            boolean zBooleanValue = ((Boolean) pair.getFirst()).booleanValue();
            c890103dr2.getClass();
            C890103dr.LJIILL(jLIZ, boolValueOf, string, num, strLJJLIIIJ, zBooleanValue, null);
        }
        Context context = getContext();
        if (context == null || (activityLIZ = C1388190mED.LIZ(context)) == null) {
            return;
        }
        this.LLJILJILJ.LIZJ(activityLIZ);
    }

    public final CCDCAddCardHalfFragment Go() {
        LifecycleOwner parent = getParent();
        if (parent instanceof CCDCAddCardHalfFragment) {
            return (CCDCAddCardHalfFragment) parent;
        }
        return null;
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        Activity activityLIZ;
        super.onPause();
        Context context = getContext();
        if (context == null || (activityLIZ = C1388190mED.LIZ(context)) == null) {
            return;
        }
        this.LLJILJILJ.LIZJ(activityLIZ);
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        Activity activityLIZ;
        super.onResume();
        Context context = getContext();
        if (context == null || (activityLIZ = C1388190mED.LIZ(context)) == null) {
            return;
        }
        this.LLJILJILJ.LJI = new AwS545S0100000_1(this, 1535);
        this.LLJILJILJ.LIZIZ(activityLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x01c0 A[PHI: r1
      0x01c0: PHI (r1v1 com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo) = 
      (r1v0 com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo)
      (r1v12 com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo)
      (r1v12 com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo)
      (r1v12 com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo)
     binds: [B:43:0x01ae, B:45:0x01b4, B:47:0x01b8, B:49:0x01be] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r17) {
        /*
            Method dump skipped, instruction units count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.card.ATMCardAssem.onViewCreated(android.view.View):void");
    }
}
