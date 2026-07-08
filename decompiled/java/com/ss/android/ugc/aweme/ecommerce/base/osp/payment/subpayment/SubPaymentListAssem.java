package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.subpayment;

import X.C01D1;
import X.C0I7D;
import X.C13LE;
import X.C14EU;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1744700vVE;
import X.C197039127h;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C723590SZx;
import X.C724750Sbp;
import X.C847403Su;
import X.C926403ji;
import X.C926503jj;
import X.C927003jo;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentCacheHelper;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes2.dex */
public final class SubPaymentListAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public C0I7D LLIZLLLIL;
    public TuxTextView LLJ;
    public TuxIconView LLJI;
    public ViewOnAttachStateChangeListenerC20604515jv LLJIJIL;
    public C197039127h LLJILJIL;
    public TuxTextView LLJILJILJ;
    public final AssemVMLazy LLJILLL;
    public final C1559260qg8 LLJJ;
    public long LLJJI;
    public String LLJJIII;
    public List<C926403ji> LLJJIJI;
    public String LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public int LLJJJ;
    public boolean LLJJJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SubPaymentListAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/payment/subpayment/SubPaymentListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SubPaymentListAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubPaymentListViewModel.class);
        this.LLJILLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS545S0100000_1(c19719912DlLIZ, 1205), AFwS228S0000000_1.get$arr$(245), null, true);
        this.LLJJ = new C1559260qg8(new C723590SZx(this, C926503jj.class, null), checkSupervisorPrepared());
        this.LLJJI = System.currentTimeMillis();
        this.LLJJIII = "";
        this.LLJJIJI = new ArrayList();
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final C197039127h Go() {
        View viewFindViewById = this.LLJILJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.cal) : null;
            this.LLJILJIL = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final C0I7D Ho() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.hch) : null;
            this.LLIZLLLIL = (C0I7D) viewFindViewById;
        }
        return (C0I7D) viewFindViewById;
    }

    public final C926503jj Jo() {
        return (C926503jj) this.LLJJ.getValue();
    }

    public final TuxIconView Lo() {
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.jxq) : null;
            this.LLJI = (TuxIconView) viewFindViewById;
        }
        return (TuxIconView) viewFindViewById;
    }

    public final TuxTextView No() {
        View viewFindViewById = this.LLJILJILJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.q5r) : null;
            this.LLJILJILJ = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxTextView Oo() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.z2q) : null;
            this.LLJ = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final SubPaymentListViewModel So() {
        AssemVMLazy assemVMLazy = this.LLJILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        return (SubPaymentListViewModel) assemVMLazy.getValue();
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        if (this.LLJJJIL) {
            SubPaymentListViewModel subPaymentListViewModelSo = So();
            C926503jj c926503jjJo = Jo();
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("ecom_tts_cashier_payment_seconed_installation_check", true)) {
                PaymentMethod paymentMethod = c926503jjJo.LLILLJJLI;
                PaymentCacheHelper.LIZ.getClass();
                PaymentCacheHelper.LJIIL();
                if (paymentMethod != null) {
                    List<PaymentMethod> list = paymentMethod.subPaymentMethods;
                    if (list != null) {
                        for (PaymentMethod paymentMethod2 : list) {
                            Availability availability = paymentMethod2.LJIL;
                            if (availability != null) {
                                paymentMethod2.availability = availability.copy(availability.isAvailable, availability.unavailableCode, availability.unavailableReason, availability.unavailablePopupTitle, availability.statusCode);
                            }
                        }
                    }
                    EnterParams enterParams = c926503jjJo.LLILZ;
                    C927003jo c927003jo = c926503jjJo.LLIZ;
                    subPaymentListViewModelSo.wQ2(paymentMethod, null, enterParams, !((c927003jo == null || c927003jo.LIZJ) ? false : true), c926503jjJo.LLJ);
                }
            }
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        EventBus.LIZLLL().LJJI(this);
        So().setState(AFwS228S0000000_1.get$arr$(630));
    }

    @Override // X.AbstractC738140SxQ
    public final void onStop() {
        super.onStop();
        this.LLJJJIL = true;
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onSubPaymentItemClickEvent$ecommerce_transaction_release(C847403Su c847403Su) {
        Ho().clearFocus();
        C1744700vVE.LIZJ(Ho());
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x029f  */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r17) {
        /*
            Method dump skipped, instruction units count: 696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.subpayment.SubPaymentListAssem.onViewCreated(android.view.View):void");
    }
}
