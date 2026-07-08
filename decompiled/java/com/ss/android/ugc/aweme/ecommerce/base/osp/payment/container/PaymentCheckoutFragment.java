package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.container;

import X.AnonymousClass0317;
import X.C034S;
import X.C03WK;
import X.C03XU;
import X.C04JN;
import X.C04JS;
import X.C098200Yq;
import X.C1077504Jh;
import X.C1120604Zw;
import X.C1121904a9;
import X.C1257480ipO;
import X.C1308910kAL;
import X.C1388190mED;
import X.C1390920mIc;
import X.C13LE;
import X.C1685300txQ;
import X.C1741890vQh;
import X.C1748770vbn;
import X.C1766560w4U;
import X.C189200o6;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C1AF0;
import X.C1AQS;
import X.C2188811AlT;
import X.C2371409Qy;
import X.C299110Bnx;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C842503Qx;
import X.C924503jP;
import X.C960203pA;
import X.C960603pE;
import X.InterfaceC1058150ddt;
import X.InterfaceC1164530gPT;
import X.InterfaceC1364105Vn;
import X.InterfaceC1631630sYr;
import X.InterfaceC1748810vbr;
import Y.ARunnableS101S0100000_1;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.als.extensions.LifecycleOwnerExtensionsKt;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.bytedance.tux.system.TuxImmersionBar;
import com.google.android.material.bottomsheet.PaymentCheckoutSheetBehavior;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.event.PaymentResultReceivedEvent;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ChangeInfo;
import com.ss.android.ugc.aweme.ecommerce.dependency.localtest.PipoOfflineDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.localtest.IPipoOfflineDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.ecommerce.slark.impl.TrackNodeStore;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS471S0200000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class PaymentCheckoutFragment extends BaseFragment implements InterfaceC1164530gPT, InterfaceC1058150ddt, InterfaceC1748810vbr {
    public static final float LLJJIJI;
    public static final float LLJJIJIIJIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExKTYpZyAgOGHELIOSs8KDY+LSs4Zyw8JjEtICE2OmscKDY+LSs4Cic2Ky4jPDsVOiQrJCo9PA==";
    public Function2<? super ChangeInfo, ? super InterfaceC1364105Vn<? super C842503Qx>, ? extends Object> LLIZLLLIL;
    public Function0<Unit> LLJILJIL;
    public String LLJILJILJ;
    public TuxSheet LLJILLL;
    public PaymentFragment LLJJ;
    public EnterParams LLIZ = new EnterParams(null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, Boolean.FALSE, null, null, Boolean.FALSE, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, false, null, false, false, false);
    public InterfaceC1631630sYr<? super PaymentInfo, ? super Boolean, ? super Map<String, ? extends Object>, ? super Fragment, Unit> LLJ = C1077504Jh.get$arr$(0);
    public Function0<Unit> LLJI = AFwS185S0000000_1.get$arr$(72);
    public Function1<? super PaymentMethod, Unit> LLJIJIL = AFwS228S0000000_1.get$arr$(209);
    public final PaymentCheckoutSheetBehavior<FrameLayout> LLJJI = new PaymentCheckoutSheetBehavior<>();
    public final TuxPaymentCheckoutSheetBehavior<FrameLayout> LLJJIII = new TuxPaymentCheckoutSheetBehavior<>();

    @Override // X.InterfaceC1748810vbr, X.InterfaceC1748860vbw
    public final void Q3(C1748770vbn c1748770vbn) {
    }

    @Override // X.InterfaceC1058150ddt
    public final boolean onBackPress() {
        return false;
    }

    static {
        new C924503jP();
        LLJJIJI = C03XU.LIZIZ().newSheetContainerPeekHeightRatio;
        LLJJIJIIJIL = C03XU.LIZIZ().newSheetContainerMaxHeightRatio;
    }

    @Override // X.InterfaceC1748810vbr
    public final InterfaceC1748810vbr d8() {
        return TrackNodeStore.LIZLLL(this.LLJILJILJ, this);
    }

    public final void UR() {
        C19EG c19egLIZIZ;
        FragmentManager supportFragmentManager;
        try {
            Context context = getContext();
            if (context == null || (c19egLIZIZ = C1388190mED.LIZIZ(context)) == null || (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) == null) {
                return;
            }
            C19EH c19ehLJIIJ = supportFragmentManager.LJIIJ();
            c19ehLJIIJ.LJIIZILJ(this);
            if (supportFragmentManager.LJLJJI()) {
                c19ehLJIIJ.LJIIJ();
            } else {
                c19ehLJIIJ.LJIIIZ();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PaymentCheckoutFragment#onSheetClose error: ");
            sbLIZ.append(e);
            C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter != null) {
            iEventCenter.LIZJ("ec_payment_change", this);
            iEventCenter.LIZJ("ec_payment_page_refresh_data", this);
            iEventCenter.LIZJ("ec_order_result_received", this);
            iEventCenter.LIZJ("ec_payment_refresh_cashier", this);
        }
    }

    public final void SR(float f) {
        View viewFindViewById;
        int i;
        int expandedOffset;
        TuxSheet tuxSheet = this.LLJILLL;
        if (tuxSheet == null || f < 0.0f) {
            return;
        }
        View view = tuxSheet.getView();
        if (view != null) {
            viewFindViewById = view.findViewById(R.id.eqx);
        } else {
            viewFindViewById = null;
        }
        if (C299110Bnx.LIZ()) {
            TuxPaymentCheckoutSheetBehavior<FrameLayout> tuxPaymentCheckoutSheetBehavior = this.LLJJIII;
            i = tuxPaymentCheckoutSheetBehavior.LJIILLIIL;
            expandedOffset = tuxPaymentCheckoutSheetBehavior.getExpandedOffset();
        } else {
            PaymentCheckoutSheetBehavior<FrameLayout> paymentCheckoutSheetBehavior = this.LLJJI;
            i = paymentCheckoutSheetBehavior.collapsedOffset;
            expandedOffset = paymentCheckoutSheetBehavior.getExpandedOffset();
        }
        int i2 = (int) ((i - expandedOffset) * (1 - f));
        if (viewFindViewById != null) {
            viewFindViewById.setPadding(viewFindViewById.getPaddingLeft(), viewFindViewById.getPaddingTop(), viewFindViewById.getPaddingRight(), i2);
        }
    }

    public final void VR(boolean z) {
        Integer numLIZJ;
        C19EG activity;
        boolean z2 = false;
        if (z && ((activity = getActivity()) == null || !C960203pA.LIZIZ(activity))) {
            z2 = true;
        }
        TuxSheet tuxSheet = this.LLJILLL;
        if (tuxSheet != null) {
            if (z) {
                Context context = tuxSheet.getContext();
                if (context != null) {
                    numLIZJ = C1308910kAL.LIZJ(R.attr.bx, context);
                } else {
                    return;
                }
            } else {
                Context context2 = tuxSheet.getContext();
                if (context2 == null) {
                    return;
                } else {
                    numLIZJ = C1308910kAL.LIZJ(R.attr.bx, context2);
                }
            }
            if (numLIZJ != null) {
                int iIntValue = numLIZJ.intValue();
                TuxImmersionBar tuxImmersionBarLIZJ = C1766560w4U.LIZJ(tuxSheet, true);
                tuxImmersionBarLIZJ.LJIIIZ(iIntValue);
                tuxImmersionBarLIZJ.LIZIZ.LJIIJ(z2);
                tuxImmersionBarLIZJ.LIZLLL();
            }
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        IECommerceHostService iECommerceHostService;
        AnonymousClass0317 anonymousClass0317CreateIPipoOfflineDependencyServicebyMonsterPlugin;
        boolean z;
        IECommerceHostService iECommerceHostService2;
        boolean z2;
        String name;
        boolean z3;
        String name2;
        super.onCreate(bundle);
        NR(AFwS228S0000000_1.get$arr$(210));
        String name3 = null;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            String name4 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService != null) {
                name2 = iECommerceHostService.getClass().getName();
            } else {
                name2 = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name4, name2, z3);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        if (!((IApplicationDependencyService) iECommerceHostService).isOffline()) {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                iECommerceHostService2 = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                if (iECommerceHostService2 != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                String name5 = IApplicationDependencyService.class.getName();
                if (iECommerceHostService2 != null) {
                    name = iECommerceHostService2.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime2, 1, name5, name, z2);
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            if (!((IApplicationDependencyService) iECommerceHostService2).isRegressionTest()) {
                return;
            }
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime3 = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIPipoOfflineDependencyServicebyMonsterPlugin = PipoOfflineDependencyService.createIPipoOfflineDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIPipoOfflineDependencyServicebyMonsterPlugin != null) {
                z = true;
            } else {
                z = false;
            }
            String name6 = IPipoOfflineDependencyService.class.getName();
            if (anonymousClass0317CreateIPipoOfflineDependencyServicebyMonsterPlugin != null) {
                name3 = anonymousClass0317CreateIPipoOfflineDependencyServicebyMonsterPlugin.getClass().getName();
            }
            C1AQS.LIZJ(jElapsedRealtime3, 1, name6, name3, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIPipoOfflineDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IPipoOfflineDependencyService.class);
        }
        ((IPipoOfflineDependencyService) anonymousClass0317CreateIPipoOfflineDependencyServicebyMonsterPlugin).postPipoCashierShowWindowLaterEvent();
    }

    @Override // X.InterfaceC1058150ddt
    public final void LLLFFI(TuxSheet tuxSheet, float f) {
        SR(f);
    }

    @Override // X.InterfaceC1058150ddt
    public final void LLLLIIIILLL(TuxSheet tuxSheet, int i) {
        if (i != 3) {
            if (i == 4) {
                SR(0.0f);
                VR(false);
                return;
            }
            return;
        }
        SR(1.0f);
        VR(true);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        TuxSheet tuxSheet;
        TuxSheet tuxSheet2;
        TuxSheet tuxSheet3;
        Type type;
        TuxSheet tuxSheet4;
        switch (str.hashCode()) {
            case -1342066716:
                if (str.equals("ec_payment_page_refresh_data") && C03WK.LIZ(this.LLIZ) && (tuxSheet = this.LLJILLL) != null) {
                    tuxSheet.dismissAllowingStateLoss();
                    break;
                }
                break;
            case 412057034:
                if (str.equals("ec_payment_change") && !this.LLIZ.LIZLLL() && (tuxSheet2 = this.LLJILLL) != null) {
                    tuxSheet2.dismissAllowingStateLoss();
                    break;
                }
                break;
            case 935586949:
                if (str.equals("ec_payment_refresh_cashier") && C03WK.LIZ(this.LLIZ) && (tuxSheet3 = this.LLJILLL) != null) {
                    tuxSheet3.dismissAllowingStateLoss();
                    break;
                }
                break;
            case 1256753137:
                if (str.equals("ec_order_result_received")) {
                    try {
                        Gson gsonLJFF = C1741890vQh.LJFF();
                        C1120604Zw.LIZ.getClass();
                        C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                        if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                            type = C2371409Qy.LIZJ(C13LE.LJII(PaymentResultReceivedEvent.class));
                        } else {
                            type = new TypeToken<PaymentResultReceivedEvent>() { // from class: X.03jQ
                            }.getType();
                        }
                        Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, str2, type);
                        if (!(objFromJson instanceof PaymentResultReceivedEvent)) {
                            objFromJson = null;
                        }
                        PaymentResultReceivedEvent paymentResultReceivedEvent = (PaymentResultReceivedEvent) objFromJson;
                        if (paymentResultReceivedEvent != null && paymentResultReceivedEvent.closePage && C03WK.LIZ(this.LLIZ) && (tuxSheet4 = this.LLJILLL) != null) {
                            tuxSheet4.dismissAllowingStateLoss();
                            break;
                        }
                    } catch (s e) {
                        TryCatchGuardChecker.doCheck(e);
                        return;
                    }
                }
                break;
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String strLIZLLL;
        int iLIZJ;
        super.onViewCreated(view, bundle);
        IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter != null) {
            iEventCenter.LIZLLL("ec_payment_change", this);
            iEventCenter.LIZLLL("ec_payment_page_refresh_data", this);
            iEventCenter.LIZLLL("ec_order_result_received", this);
            iEventCenter.LIZLLL("ec_payment_refresh_cashier", this);
        }
        PaymentFragment paymentFragment = new PaymentFragment();
        C1257480ipO.LIZ.erase("PAYMENT_STATE");
        paymentFragment.LLL = this.LLIZLLLIL;
        paymentFragment.LLJJL = new AwS471S0200000_1(this, paymentFragment, 20);
        paymentFragment.LLJJLIIIJLLLLLLLZ = new AwS545S0100000_1(this, 1718);
        paymentFragment.LLJL = new AwS580S0100000_1(this, 872);
        View view2 = getView();
        if (view2 != null) {
            strLIZLLL = C960603pE.LIZLLL(view2);
        } else {
            strLIZLLL = null;
        }
        paymentFragment.LLJZIJLIL = strLIZLLL;
        EnterParams enterParams = this.LLIZ;
        enterParams.LIZ = true;
        paymentFragment.LLJJJJLIIL = enterParams;
        paymentFragment.LLJLL = new AwS545S0100000_1(this, 1719);
        paymentFragment.LLLIZZ = this;
        this.LLJJ = paymentFragment;
        Context context = getContext();
        if (context != null) {
            iLIZJ = C418440Gaw.LIZJ(context);
        } else {
            iLIZJ = 0;
        }
        float f = iLIZJ;
        int i = (int) (LLJJIJI * f);
        int i2 = (int) (f * LLJJIJIIJIL);
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJI = paymentFragment;
        tuxSheet.LLJJIJIIJIL = true;
        tuxSheet.LLJLILLLLZIIL = false;
        tuxSheet.LLJLL = true;
        c1390920mIc.LJIIIIZZ(2);
        c1390920mIc.LIZIZ(i, i2);
        if (C299110Bnx.LIZ()) {
            c1390920mIc.LIZ.LLLIIIIL = this.LLJJIII;
        } else {
            c1390920mIc.LIZ.LLLIIII = this.LLJJI;
        }
        C04JS c04js = new C04JS(this, 4);
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.LLILLJJLI = c04js;
        tuxSheet2.LL = new C04JN(this, 3);
        this.LLJILLL = tuxSheet2;
        tuxSheet2.show(getChildFragmentManager(), "payment_fragment");
        C19EG activity = getActivity();
        if (activity != null) {
            LifecycleOwnerExtensionsKt.LIZIZ(activity, 300L, new ARunnableS101S0100000_1(this, 76));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.aqc, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
