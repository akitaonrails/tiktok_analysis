package com.ss.android.ugc.aweme.account.login.auth.ui.login;

import X.AbstractC845670XFl;
import X.C01GW;
import X.C098200Yq;
import X.C0XGR;
import X.C13LE;
import X.C13LZ;
import X.C1685300txQ;
import X.C1867980yi4;
import X.C1868550yiz;
import X.C189200o6;
import X.C1913610ztf;
import X.C19306410g2;
import X.C19306510g3;
import X.C19306710g5;
import X.C19306810g6;
import X.C19306910g7;
import X.C1954807lC;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C336720DHy;
import X.C452501pT;
import X.C786410Ut5;
import X.C845590XFd;
import X.C845650XFj;
import X.C845680XFm;
import X.C845720XFq;
import X.C960203pA;
import X.EnumC1913590ztd;
import X.EnumC19307010g8;
import X.EnumC19307110g9;
import X.EnumC452301pR;
import X.InterfaceC1913620ztg;
import X.ViewOnLayoutChangeListenerC19332110kB;
import Y.ARunnableS96S0200000_27;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.login.auth.SignupViewModel;
import com.ss.android.ugc.aweme.account.login.auth.ui.login.SOTLFragment;
import com.ss.android.ugc.aweme.changeregionapi.api.IPNSChangeRegionService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.compliance.api.services.policy.ICompliancePolicyService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.zhiliaoapp.musically.R;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS428S0200000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class SOTLFragment extends Fragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiQvKiAmJjFiHELIOSJSA0IStiKDonIGs5IGE/JyIlJ2EABxEADz0yLygpJzs=";
    public final C01GW LL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 100));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS572S0100000_28(this, 97));
    public final ViewModelLazy LLILLL;
    public EnumC19307110g9 LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public AbstractC845670XFl LLIZ;

    public final SignupViewModel SR() {
        return (SignupViewModel) this.LLILLJJLI.getValue();
    }

    public final C1868550yiz WR() {
        return (C1868550yiz) this.LL.getValue();
    }

    public final SOTLViewModel ZR() {
        return (SOTLViewModel) this.LLILLL.getValue();
    }

    public final int dS() {
        int i = C19306810g6.LIZ[this.LLILZ.ordinal()];
        if (i == 1 || i == 2) {
            return hS(this, R.dimen.iq);
        }
        if (i == 3 || i == 4) {
            return hS(this, R.dimen.f598io);
        }
        throw new C1954807lC();
    }

    public final boolean mS() {
        int i = C19306810g6.LIZ[this.LLILZ.ordinal()];
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return UR().LIZIZ;
        }
        if (i == 3) {
            return UR().LIZJ;
        }
        if (i == 4) {
            return UR().LIZLLL;
        }
        throw new C1954807lC();
    }

    public SOTLFragment() {
        C01GW c01gwLIZ = C452501pT.LIZ(EnumC452301pR.NONE, new AwS572S0100000_28(new AwS572S0100000_28((Fragment) this, 98), (Function0<Unit>) 99));
        this.LLILLL = C336720DHy.LIZ(this, C13LE.LIZ(SOTLViewModel.class), new AwS571S0100000_27(c01gwLIZ, 205), new AwS428S0200000_27((Function0) null, c01gwLIZ, 7), new AwS428S0200000_27(this, c01gwLIZ, 8));
        this.LLILZ = EnumC19307110g9.FULL_SCREEN;
        this.LLIZ = C845680XFm.LIZ;
    }

    public final C19306710g5 UR() {
        return VR().LIZ;
    }

    public final C19306410g2 VR() {
        C19306410g2 c19306410g2MergeInto;
        C19306510g3 c19306510g3 = (C19306510g3) SR().LLJJJJJIL.getValue();
        return (c19306510g3 == null || (c19306410g2MergeInto = c19306510g3.mergeInto(WR().LIZJ)) == null) ? WR().LIZJ : c19306410g2MergeInto;
    }

    public final float bS() {
        float f;
        C19306910g7 c19306910g7 = VR().LJIIIZ;
        int i = C19306810g6.LIZ[this.LLILZ.ordinal()];
        if (i == 1) {
            f = 0.0f;
        } else if (i == 2) {
            f = c19306910g7.nineScreen;
        } else if (i == 3) {
            f = c19306910g7.sevenScreen;
        } else {
            if (i != 4) {
                throw new C1954807lC();
            }
            f = c19306910g7.fiveScreen;
        }
        return C13LZ.LIZLLL(f, 0.0f, 1.0f);
    }

    public static void kS(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.height = 0;
            layoutParams2.weight = 1.0f;
            C786410Ut5.W5(view, layoutParams2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    public final void MR(final View view) {
        int height;
        EnumC19307010g8 enumC19307010g8;
        final View viewFindViewById = view.findViewById(R.id.vq9);
        View viewFindViewById2 = view.findViewById(R.id.vpp);
        int height2 = 0;
        if (this.LLILZ == EnumC19307110g9.FULL_SCREEN) {
            if (view.isLaidOut() && !view.isLayoutRequested()) {
                View viewFindViewById3 = view.findViewById(R.id.vq8);
                View viewFindViewById4 = view.findViewById(R.id.vpo);
                if (viewFindViewById3.getVisibility() == 0) {
                    height = viewFindViewById3.getHeight();
                } else {
                    height = 0;
                }
                int height3 = (view.getHeight() - height) - viewFindViewById4.getHeight();
                if (height3 >= 0) {
                    height2 = height3;
                }
                int iCS = cS(height2);
                if (VR().LJIIL == null) {
                    enumC19307010g8 = EnumC19307010g8.TOP;
                } else {
                    enumC19307010g8 = VR().LJIIJ;
                }
                int i = C19306810g6.LIZIZ[enumC19307010g8.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        kS(viewFindViewById);
                        iS(iCS, viewFindViewById2);
                        return;
                    }
                    throw new C1954807lC();
                }
                iS(iCS, viewFindViewById);
                kS(viewFindViewById2);
                return;
            }
            view.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC19332110kB(view, this, viewFindViewById, viewFindViewById2, 0));
            return;
        }
        kS(viewFindViewById2);
        if (view.isLaidOut() && !view.isLayoutRequested()) {
            View viewFindViewById5 = view.findViewById(R.id.vq8);
            View viewFindViewById6 = view.findViewById(R.id.vpo);
            if (viewFindViewById5.getVisibility() == 0) {
                height2 = viewFindViewById5.getHeight();
            }
            iS(height2 + ((int) (((view.getHeight() - height2) - viewFindViewById6.getHeight()) * bS())), viewFindViewById);
            return;
        }
        view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.10gA
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                int height4;
                view2.removeOnLayoutChangeListener(this);
                View viewFindViewById7 = view.findViewById(R.id.vq8);
                View viewFindViewById8 = view.findViewById(R.id.vpo);
                if (viewFindViewById7.getVisibility() == 0) {
                    height4 = viewFindViewById7.getHeight();
                } else {
                    height4 = 0;
                }
                int height5 = (view.getHeight() - height4) - viewFindViewById8.getHeight();
                float fBS = this.bS();
                SOTLFragment sOTLFragment = this;
                View view3 = viewFindViewById;
                sOTLFragment.getClass();
                SOTLFragment.iS(height4 + ((int) (height5 * fBS)), view3);
            }
        });
    }

    public final void NR(TuxTextView tuxTextView) {
        int i = C19306810g6.LIZ[this.LLILZ.ordinal()];
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            throw new C1954807lC();
        }
        tuxTextView.setTuxFont(123);
        Float f = VR().LJI;
        if (f != null) {
            tuxTextView.LJJJJI(f.floatValue());
        }
    }

    public final int PR(float f) {
        return (int) ((f * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final void RR(String str) {
        String str2;
        C0XGR c0xgr = new C0XGR();
        if (ZR().LLILZ.getValue() instanceof C845650XFj) {
            str2 = "SOTL_in_app";
        } else {
            str2 = "SOTL";
        }
        c0xgr.LIZLLL("login_panel_type", str2);
        c0xgr.LIZLLL("button_type", str);
        c0xgr.LIZLLL("enter_from", SR().getEnterFrom());
        c0xgr.LIZLLL("enter_method", SR().getEnterMethod());
        C20684815ws.LJIILLIIL("sotl_panel_click", c0xgr.LIZ);
    }

    public final void aS(String str) {
        ICompliancePolicyService iCompliancePolicyServiceLJIIIIZZ;
        String upperCase;
        String storeRegion;
        C19EG activity = getActivity();
        if (activity != null && (iCompliancePolicyServiceLJIIIIZZ = ComplianceServiceProvider.LJIIIIZZ()) != null) {
            String value = EnumC1913590ztd.ACCOUNT_SIGNUP_OR_LOGIN.getValue();
            IPNSChangeRegionService iPNSChangeRegionService = (IPNSChangeRegionService) PluggableExtentionKt.pluggableSpi$default(IPNSChangeRegionService.class, false, false, false, 14, null);
            if (iPNSChangeRegionService != null && (storeRegion = iPNSChangeRegionService.getStoreRegion()) != null) {
                upperCase = storeRegion.toUpperCase(Locale.ROOT);
            } else {
                upperCase = null;
            }
            iCompliancePolicyServiceLJIIIIZZ.LIZ(new C1913610ztf(value, str, false, true, true, upperCase, C960203pA.LIZIZ(activity), 4), new InterfaceC1913620ztg() { // from class: X.10gC
                @Override // X.InterfaceC1913620ztg
                public final void onComplete() {
                }
            });
        }
    }

    public final int cS(int i) {
        Float f = VR().LJIIL;
        if (f != null) {
            float fFloatValue = f.floatValue();
            int i2 = C19306810g6.LIZJ[VR().LJIIJJI.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    return (int) (C13LZ.LIZLLL(fFloatValue, 0.0f, 1.0f) * i);
                }
                throw new C1954807lC();
            }
            return PR(fFloatValue);
        }
        return PR(210.0f);
    }

    public final int gS(int i) {
        Float f = VR().LJII;
        if (f != null) {
            return PR(f.floatValue());
        }
        return i;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        View view = getView();
        if (view == null) {
            return;
        }
        HandlerHook.viewPost(view, new ARunnableS96S0200000_27(this, view, 6));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C19EG c19egRequireActivity = requireActivity();
        C1867980yi4 c1867980yi4 = WR().LIZIZ;
        ZR().LLJI = new C845720XFq(c19egRequireActivity, c1867980yi4.LIZ, c1867980yi4.LIZIZ, c1867980yi4.LIZJ);
        ZR().getClass();
        C845590XFd.LIZ.getClass();
        C845590XFd.LJII = SystemClock.uptimeMillis();
        this.LLIZ = (AbstractC845670XFl) ZR().LLILZ.getValue();
        SOTLViewModel sOTLViewModelZR = ZR();
        Context contextRequireContext = requireContext();
        sOTLViewModelZR.getClass();
        C845590XFd.LIZ(contextRequireContext, true);
    }

    public static int hS(SOTLFragment sOTLFragment, int i) {
        sOTLFragment.getClass();
        try {
            return sOTLFragment.getResources().getDimensionPixelSize(i);
        } catch (Resources.NotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            return 0;
        }
    }

    public static void iS(int i, View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.height = i;
            layoutParams2.weight = 0.0f;
            C786410Ut5.W5(view, layoutParams2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    public final int OR(float f, int i) {
        return (C13LZ.LJ((int) ((f * 255) + 0.5f), 0, 255) << 24) | (i & 16777215);
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0210  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r26, android.os.Bundle r27) {
        /*
            Method dump skipped, instruction units count: 1840
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.auth.ui.login.SOTLFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.zy, viewGroup, false);
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
