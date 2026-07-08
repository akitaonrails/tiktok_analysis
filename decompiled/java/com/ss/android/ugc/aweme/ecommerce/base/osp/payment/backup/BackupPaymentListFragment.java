package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.backup;

import X.C034S;
import X.C098200Yq;
import X.C0OM1;
import X.C1018503yZ;
import X.C1120604Zw;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1326790kdB;
import X.C1331670kl3;
import X.C13BV;
import X.C13LP;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C1AQS;
import X.C786410Ut5;
import X.C877103bl;
import X.C877303bn;
import X.C877703br;
import X.InterfaceC1164530gPT;
import X.InterfaceC883003ci;
import X.InterfaceC911603hK;
import android.app.Dialog;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.backup.BackupPaymentListFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dialogfragmentcontainer.OSPHalfDialogContainerFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentTip;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import g1c.AjS4S0201000_1;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes2.dex */
public final class BackupPaymentListFragment extends Fragment implements InterfaceC883003ci, InterfaceC1164530gPT {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiAvJiI+LTcvLGExKTYpZyAgHELIOSOGs8KDY+LSs4Zy0yKy45OWERKSYnPD8DKTwhLCEnBCw/PQkhKSIhLCEn";
    public TuxNavBar LL;
    public TuxTextView LLILLJJLI;
    public LinearLayout LLILLL;
    public Function2<? super PaymentMethod, ? super BackupPaymentListFragment, Unit> LLIZ;
    public long LLIZLLLIL;
    public List<PaymentMethod> LLILZ = C13BV.INSTANCE;
    public String LLILZIL = "";
    public C877303bn LLILZLL = new C877303bn("order_submit", null, null, null, null, 62);
    public String LLJ = "return";

    @Override // X.InterfaceC883003ci
    public final boolean uH() {
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter != null) {
            iEventCenter.LIZJ("ec_payment_change", this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        IECommerceHostService iECommerceHostService;
        super.onStop();
        if (this.LLIZLLLIL > 0) {
            C877303bn c877303bn = this.LLILZLL;
            long jCurrentTimeMillis = System.currentTimeMillis() - this.LLIZLLLIL;
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            InterfaceC911603hK rootPageMonitor = ((IApplicationDependencyService) iECommerceHostService).getRootPageMonitor();
            String str = (rootPageMonitor == null || !rootPageMonitor.LJFF()) ? this.LLJ : "close";
            LinkedHashMap linkedHashMapLIZ = C877103bl.LIZ(c877303bn);
            linkedHashMapLIZ.put("page_name", "add_a_backup_payment");
            linkedHashMapLIZ.put("previous_page", c877303bn.LIZ);
            linkedHashMapLIZ.put("is_fullscreen", Integer.valueOf(c877303bn.LIZJ));
            linkedHashMapLIZ.put("quit_type", str);
            linkedHashMapLIZ.put("stay_time", Long.valueOf(jCurrentTimeMillis));
            C1018503yZ.LIZIZ("tiktokec_stay_page", linkedHashMapLIZ, true);
            this.LLIZLLLIL = 0L;
        }
    }

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        if (Intrinsics.LJFF(str, "ec_payment_change")) {
            C877103bl.LJI(this.LLILZLL, "backup_payment_added", "order_submit");
            this.LLJ = "next";
            OSPHalfDialogContainerFragment oSPHalfDialogContainerFragmentLIZ = C877703br.LIZ(this);
            if (oSPHalfDialogContainerFragmentLIZ != null) {
                oSPHalfDialogContainerFragmentLIZ.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r13v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v3, types: [boolean] */
    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(final View view, Bundle bundle) {
        PaymentTip paymentTip;
        Integer numLIZIZ;
        String str;
        super.onViewCreated(view, bundle);
        this.LLIZLLLIL = System.currentTimeMillis();
        C0OM1 c0om1 = new C0OM1();
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = this.LLILZIL;
        c0om1.LIZJ = c1250250idj;
        boolean z = true;
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS545S0100000_1(this, 1504));
        ?? r13 = 0;
        r13 = 0;
        c0om1.LIZIZ(c1251150ifB);
        c0om1.LIZLLL = true;
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.p12);
            } else {
                viewFindViewById = null;
            }
            this.LL = (TuxNavBar) viewFindViewById;
        }
        TuxNavBar tuxNavBar = (TuxNavBar) viewFindViewById;
        if (tuxNavBar != null) {
            tuxNavBar.setNavActions(c0om1);
        }
        View viewFindViewById2 = this.LLILLJJLI;
        if (viewFindViewById2 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById2 = view3.findViewById(R.id.bpj);
            } else {
                viewFindViewById2 = null;
            }
            this.LLILLJJLI = (TuxTextView) viewFindViewById2;
        }
        TuxTextView tuxTextView = (TuxTextView) viewFindViewById2;
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 0);
            tuxTextView.setText(getString(2131833164));
        }
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(view.getContext());
        View viewFindViewById3 = this.LLILLL;
        if (viewFindViewById3 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById3 = view4.findViewById(R.id.bpe);
            } else {
                viewFindViewById3 = null;
            }
            this.LLILLL = (LinearLayout) viewFindViewById3;
        }
        LinearLayout linearLayout = (LinearLayout) viewFindViewById3;
        if (linearLayout != null) {
            C786410Ut5.LJJJJJL(linearLayout);
            int i = 0;
            for (PaymentMethod paymentMethod : this.LLILZ) {
                int i2 = i + 1;
                if (i >= 0) {
                    PaymentMethod paymentMethod2 = paymentMethod;
                    C877303bn c877303bn = this.LLILZLL;
                    LinkedHashMap linkedHashMapLIZ = C877103bl.LIZ(c877303bn);
                    linkedHashMapLIZ.put("page_name", "add_a_backup_payment");
                    linkedHashMapLIZ.put("previous_page", c877303bn.LIZ);
                    linkedHashMapLIZ.put("option_type", "payment_type");
                    linkedHashMapLIZ.put("option_name", paymentMethod2.LJJIIZ());
                    linkedHashMapLIZ.put("rank", Integer.valueOf(i));
                    String str2 = paymentMethod2.id;
                    if (str2 == null) {
                        str2 = "";
                    }
                    linkedHashMapLIZ.put("payment_method_id", str2);
                    Availability availability = paymentMethod2.availability;
                    if (availability != null && (str = availability.statusCode) != null) {
                        linkedHashMapLIZ.put("status_code", str);
                    }
                    C1018503yZ.LIZIZ("tiktokec_option_show", linkedHashMapLIZ, z);
                    View viewTd = C786410Ut5.Td(layoutInflaterNe, R.layout.akt, linearLayout, r13);
                    TuxTextView tuxTextView2 = (TuxTextView) viewTd.findViewById(R.id.bpi);
                    TuxTextView tuxTextView3 = (TuxTextView) viewTd.findViewById(R.id.bph);
                    SmartImageView smartImageView = (SmartImageView) viewTd.findViewById(R.id.bpg);
                    ImageView imageView = (ImageView) viewTd.findViewById(R.id.bpf);
                    tuxTextView2.setText(paymentMethod2.displayName);
                    String str3 = paymentMethod2.iconUrl;
                    if (str3 != null) {
                        C1326790kdB.LIZ.getClass();
                        C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(str3);
                        c1331670kl3LIZLLL.LJJ(smartImageView);
                        C786410Ut5.h3(c1331670kl3LIZLLL);
                    }
                    C786410Ut5.Cb(imageView, 0.0f);
                    Availability availability2 = paymentMethod2.availability;
                    if (availability2 != null && Intrinsics.LJFF(availability2.isAvailable(), Boolean.FALSE)) {
                        tuxTextView2.setTextColorRes(R.attr.a1p);
                        C786410Ut5.u5(smartImageView, 0.3f);
                        C786410Ut5.V4(imageView, 0.3f);
                        viewTd.setEnabled(false);
                        String str4 = paymentMethod2.installationTips;
                        if (((str4 != null && (!a0.LJJJIL(str4))) || (((paymentTip = paymentMethod2.paymentTip) != null && (str4 = paymentTip.tips) != null && (!a0.LJJJIL(str4))) || ((str4 = paymentMethod2.balance) != null && (!a0.LJJJIL(str4))))) && str4 != null) {
                            C786410Ut5.LLLLZLL(tuxTextView3, 0);
                            tuxTextView3.setText(str4);
                            PaymentTip paymentTip2 = paymentMethod2.paymentTip;
                            if (paymentTip2 != null && (numLIZIZ = PaymentTip.LIZIZ(paymentTip2, false, 3)) != null) {
                                tuxTextView3.setTextColor(numLIZIZ.intValue());
                            }
                        }
                    } else {
                        C786410Ut5.I7(new AjS4S0201000_1(this, paymentMethod2, i, 1), viewTd);
                    }
                    linearLayout.addView(viewTd);
                    r13 = 0;
                    i = i2;
                    z = true;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        HandlerHook.viewPost(view, new Runnable() { // from class: X.03bq
            public final void LIZ() {
                String string;
                Dialog dialog;
                View view5;
                ViewGroup.LayoutParams layoutParams;
                BackupPaymentListFragment backupPaymentListFragment = this.LL;
                View view6 = view;
                backupPaymentListFragment.getClass();
                OSPHalfDialogContainerFragment oSPHalfDialogContainerFragmentLIZ = C877703br.LIZ(backupPaymentListFragment);
                if (oSPHalfDialogContainerFragmentLIZ != null) {
                    View view7 = oSPHalfDialogContainerFragmentLIZ.getView();
                    Object parent = view7 != null ? view7.getParent() : null;
                    if ((parent instanceof View) && (view5 = (View) parent) != null) {
                        Integer numValueOf = Integer.valueOf(view6.getHeight());
                        if (numValueOf.intValue() > 0) {
                            int iIntValue = numValueOf.intValue();
                            View view8 = oSPHalfDialogContainerFragmentLIZ.getView();
                            if (view8 != null) {
                                View view9 = oSPHalfDialogContainerFragmentLIZ.getView();
                                if (view9 == null || (layoutParams = view9.getLayoutParams()) == null) {
                                    layoutParams = null;
                                } else {
                                    layoutParams.height = iIntValue;
                                }
                                C786410Ut5.W5(view8, layoutParams);
                            }
                            try {
                                BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(view5);
                                bottomSheetBehaviorFrom.setPeekHeight(iIntValue);
                                bottomSheetBehaviorFrom.setState(3);
                                C189200o6.m2constructorimpl(bottomSheetBehaviorFrom);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                C189200o6.m2constructorimpl(new C098200Yq(th));
                            }
                        }
                    }
                }
                BackupPaymentListFragment backupPaymentListFragment2 = this.LL;
                Bundle arguments = backupPaymentListFragment2.getArguments();
                if (arguments == null || (string = arguments.getString("key_pending_success_toast")) == null || !(true ^ a0.LJJJIL(string))) {
                    return;
                }
                Bundle arguments2 = backupPaymentListFragment2.getArguments();
                if (arguments2 != null) {
                    arguments2.remove("key_pending_success_toast");
                }
                OSPHalfDialogContainerFragment oSPHalfDialogContainerFragmentLIZ2 = C877703br.LIZ(backupPaymentListFragment2);
                C1389880mGw c1389880mGw = (oSPHalfDialogContainerFragmentLIZ2 == null || (dialog = oSPHalfDialogContainerFragmentLIZ2.getDialog()) == null) ? new C1389880mGw(backupPaymentListFragment2) : new C1389880mGw(dialog);
                c1389880mGw.LJIIIZ(string);
                c1389880mGw.LJ(R.raw.icon_tick_circle_fill);
                c1389880mGw.LJI(R.attr.a1h);
                c1389880mGw.LJIIJ();
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("BackupPaymentListFragment@6485.onViewCreated$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("BackupPaymentListFragment@6485.onViewCreated$1");
            }
        });
        C877303bn c877303bn2 = this.LLILZLL;
        List<PaymentMethod> list = this.LLILZ;
        LinkedHashMap linkedHashMapLIZ2 = C877103bl.LIZ(c877303bn2);
        linkedHashMapLIZ2.put("page_name", "add_a_backup_payment");
        linkedHashMapLIZ2.put("previous_page", c877303bn2.LIZ);
        linkedHashMapLIZ2.put("is_fullscreen", Integer.valueOf(c877303bn2.LIZJ));
        linkedHashMapLIZ2.put("payment_option", C13LP.LJJLIIIJ(list, ",", null, null, r13, null, AFwS228S0000000_1.get$arr$(382), 30));
        C1018503yZ.LIZIZ("tiktokec_enter_page", linkedHashMapLIZ2, true);
        C877303bn c877303bn3 = this.LLILZLL;
        LinkedHashMap linkedHashMapLIZ3 = C877103bl.LIZ(c877303bn3);
        linkedHashMapLIZ3.put("page_name", "add_a_backup_payment");
        linkedHashMapLIZ3.put("previous_page", c877303bn3.LIZ);
        linkedHashMapLIZ3.put("button_name", "close");
        linkedHashMapLIZ3.put("button_type", "backup_payment");
        C1018503yZ.LIZIZ("tiktokec_button_show", linkedHashMapLIZ3, true);
        IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, r13, r13, r13, 14, null);
        if (iEventCenter != null) {
            iEventCenter.LIZLLL("ec_payment_change", this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.aks, viewGroup, false);
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
