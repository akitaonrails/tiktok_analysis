package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc;

import X.C019F;
import X.C01GW;
import X.C1120604Zw;
import X.C1121904a9;
import X.C1388190mED;
import X.C13LE;
import X.C13LP;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1741890vQh;
import X.C197039127h;
import X.C19719912Dl;
import X.C1AF0;
import X.C2174021A6m;
import X.C2217381BqS;
import X.C2341109Fh;
import X.C2371409Qy;
import X.C452501pT;
import X.C723590SZx;
import X.C724750Sbp;
import X.C785410UrT;
import X.C888203dY;
import X.C888603dc;
import X.C890103dr;
import X.C904203g8;
import X.DialogC1389620mGW;
import X.InterfaceC1164530gPT;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.billingaddress.dto.SelectRegionDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.cci.AddCCICardFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.DirectCheckoutBottomWidget;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS10S1210000_1;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.Intrinsics;
import p8b.c;

/* JADX INFO: loaded from: classes2.dex */
public final class CCDCAddCardAssem extends UIContentAssem implements InterfaceC1164530gPT, c {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public ViewOnAttachStateChangeListenerC20604515jv LLIZLLLIL;
    public C197039127h LLJ;
    public DirectCheckoutBottomWidget LLJI;
    public View LLJIJIL;
    public final AssemVMLazy LLJILJIL;
    public final C1559260qg8 LLJILJILJ;
    public final C01GW LLJILLL;
    public final C2174021A6m LLJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CCDCAddCardAssem.class, "viewModel", "getViewModel()Lcom/ss/android/ugc/aweme/ecommerce/base/osp/payment/ccdc/CCDCAddCardViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public CCDCAddCardAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CCDCAddCardViewModel.class);
        this.LLJILJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS545S0100000_1(c19719912DlLIZ, 1038), AFwS228S0000000_1.get$arr$(185), null, true);
        this.LLJILJILJ = new C1559260qg8(new C723590SZx(this, C888203dY.class, null), checkSupervisorPrepared());
        this.LLJILLL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1037));
        this.LLJJ = new C2174021A6m();
    }

    @Override // p8b.c
    public final String getViewName() {
        return "CCDCAddCardAssem";
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

    public final C197039127h Go() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.ckd) : null;
            this.LLJ = (C197039127h) viewFindViewById;
        }
        return (C197039127h) viewFindViewById;
    }

    public final DirectCheckoutBottomWidget No() {
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.fui) : null;
            this.LLJI = (DirectCheckoutBottomWidget) viewFindViewById;
        }
        return (DirectCheckoutBottomWidget) viewFindViewById;
    }

    public final C888203dY So() {
        return (C888203dY) this.LLJILJILJ.getValue();
    }

    public final ViewOnAttachStateChangeListenerC20604515jv Vo() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.qjt) : null;
            this.LLIZLLLIL = (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
        }
        return (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
    }

    public final CCDCAddCardViewModel Zo() {
        AssemVMLazy assemVMLazy = this.LLJILJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJI;
        return (CCDCAddCardViewModel) assemVMLazy.getValue();
    }

    public final PaymentMethod Ho() {
        return So().LL;
    }

    public final AddCCICardFragment Jo() {
        LifecycleOwner parent = getParent();
        if (parent instanceof AddCCICardFragment) {
            return (AddCCICardFragment) parent;
        }
        return null;
    }

    public final String Lo() {
        return Intrinsics.LJFF(So().LLILZ, "ADD_NEW_CCI_US") ? "continue" : So().LLIZ;
    }

    public final CCDCAddCardHalfFragment Oo() {
        LifecycleOwner parent = getParent();
        if (parent instanceof CCDCAddCardHalfFragment) {
            return (CCDCAddCardHalfFragment) parent;
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZLLL("payment_bindcard_3ds_result", Zo());
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        Activity activityLIZ;
        super.onDestroy();
        try {
            DialogC1389620mGW dialogC1389620mGW = (DialogC1389620mGW) this.LLJILLL.getValue();
            if (dialogC1389620mGW != null) {
                dialogC1389620mGW.dismiss();
                C785410UrT.LIZ(dialogC1389620mGW);
            }
            C2341109Fh.LIZ.getClass();
            C2341109Fh.LIZ("stopListenScreenshot");
            Context context = getContext();
            if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
                this.LLJJ.LIZJ(activityLIZ);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZJ("ec_district_panel_changed_v2", this);
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZJ("payment_bindcard_3ds_result", Zo());
        C888603dc.LIZ.getClass();
        C888603dc.LIZIZ = 0L;
        C888603dc.LIZJ = 0L;
        C888603dc.LIZLLL = 0L;
        C888603dc.LJ = 0L;
        C888603dc.LJFF = 0L;
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        Activity activityLIZ;
        super.onPause();
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LIZ("stopListenScreenshot");
        Context context = getContext();
        if (context == null || (activityLIZ = C1388190mED.LIZ(context)) == null) {
            return;
        }
        this.LLJJ.LIZJ(activityLIZ);
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        Activity activityLIZ;
        super.onResume();
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LIZ("startListenScreenshot");
        Context context = getContext();
        if (context == null || (activityLIZ = C1388190mED.LIZ(context)) == null) {
            return;
        }
        this.LLJJ.LJI = new AwS545S0100000_1(this, 1598);
        this.LLJJ.LIZIZ(activityLIZ);
    }

    @Override // X.AbstractC738140SxQ
    public final void onStop() {
        super.onStop();
        if (C904203g8.LJIIJ) {
            return;
        }
        Pair<Boolean, List<String>> pairQQ2 = Zo().QQ2();
        C890103dr.LIZ.getClass();
        C890103dr.LJIILL(C890103dr.LIZ("stay_duration"), Boolean.valueOf(Zo().KQ2().LJI), Zo().KQ2().LJII.toString(), Zo().KQ2().LJIIIIZZ, C13LP.LJJLIIIJ(pairQQ2.getSecond(), ",", null, null, 0, null, null, 62), pairQQ2.getFirst().booleanValue(), Zo().LLJJIJI.LIZ("a2270.b8168"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0623  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0659  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x06a0  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x06c8  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x06ea  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x0995  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x099b  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x09d4  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x09da  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x09e0  */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v4, types: [boolean, int] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r25) {
        /*
            Method dump skipped, instruction units count: 2549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardAssem.onViewCreated(android.view.View):void");
    }

    public static final void ap(CCDCAddCardAssem cCDCAddCardAssem, String str) {
        CCDCAddCardViewModel cCDCAddCardViewModelZo = cCDCAddCardAssem.Zo();
        View viewFindViewById = null;
        cCDCAddCardViewModelZo.withState(new AwS10S1210000_1(cCDCAddCardViewModelZo, (CCDCAddCardViewModel) true, (boolean) str, (String) null, (Function1<? super PaymentInfo, Unit>) 2));
        View view = cCDCAddCardAssem.LLJIJIL;
        if (view == null) {
            View viewLJJIJL = cCDCAddCardAssem.LJJIJL();
            if (viewLJJIJL != null) {
                viewFindViewById = viewLJJIJL.findViewById(R.id.fz3);
            }
            cCDCAddCardAssem.LLJIJIL = viewFindViewById;
            view = viewFindViewById;
        }
        view.requestFocus();
    }

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        Type type;
        Integer num;
        List<Region> list;
        AwS367S0200000_1 awS367S0200000_1;
        if (Intrinsics.LJFF(str, "ec_district_panel_changed_v2")) {
            try {
                Gson gsonLJFF = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                    type = C2371409Qy.LIZJ(C13LE.LJII(SelectRegionDTO.class));
                } else {
                    type = new TypeToken<SelectRegionDTO>() { // from class: X.03e4
                    }.getType();
                }
                Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, str2, type);
                if (!(objFromJson instanceof SelectRegionDTO)) {
                    objFromJson = null;
                }
                SelectRegionDTO selectRegionDTO = (SelectRegionDTO) objFromJson;
                if (selectRegionDTO != null && (num = selectRegionDTO.status) != null && num.intValue() == 2 && (list = selectRegionDTO.districts) != null && (awS367S0200000_1 = Zo().LLJILJILJ) != null) {
                    awS367S0200000_1.invoke(list);
                }
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
