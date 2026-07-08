package com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.locationservices;

import X.C019F;
import X.C01BN;
import X.C01D1;
import X.C01GW;
import X.C098200Yq;
import X.C0HXK;
import X.C0OM1;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C13LE;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20600815jK;
import X.C2217381BqS;
import X.C294550Bgb;
import X.C338490DOt;
import X.C431350Gvl;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C987103tV;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import X.InterfaceC836760Ws6;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@InterfaceC836760Ws6
public final class LocationServicesFragment extends BaseFragment {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJD8/ISQiKip9ODclPy4wMWs/LDsnISsrOmEyHELIOSKyYjPCEnZjUtLiogZikjKi4nISoiOiohPiwvLDx9BCovKDs6JysfLD0lISYpOgkhKSIhLCEn";
    public ViewOnAttachStateChangeListenerC20604515jv LLIZ;
    public final C01GW LLIZLLLIL = RouteArgExtension.INSTANCE.optionalArg(this, AFwS256S0000000_18.get$arr$(45), "enter_from", String.class);
    public final AssemVMLazy LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(LocationServicesFragment.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/compliance/privacy/settings/account/pages/locationservices/LocationServicesVM;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public LocationServicesFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LocationServicesVM.class);
        AwS562S0100000_18 awS562S0100000_18 = new AwS562S0100000_18(c19719912DlLIZ, 135);
        AFwS256S0000000_18 aFwS256S0000000_18 = AFwS256S0000000_18.get$arr$(47);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 136), aFwS256S0000000_18, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new AwS562S0100000_18((Fragment) this, 137), aFwS256S0000000_18, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS562S0100000_18, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS562S0100000_18((HasDefaultViewModelProviderFactory) this, 138), aFwS256S0000000_18, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJ = assemVMLazy;
    }

    public final ViewOnAttachStateChangeListenerC20604515jv SR() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.rn0) : null;
            this.LLIZ = (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
        }
        return (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLIZ = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        InterfaceC1891350zJl interfaceC1891350zJlLJIJI;
        LocationServicesVM locationServicesVM;
        super.onResume();
        Context context = getContext();
        if (context != null) {
            LocationServicesManager.LIZ.getClass();
            WeakReference<LocationServicesVM> weakReference = LocationServicesManager.LJ;
            if (weakReference != null && (locationServicesVM = weakReference.get()) != null) {
                locationServicesVM.setState(new AwS597S0100000_18(context, 1136));
            }
        }
        LocationServicesManager locationServicesManager = LocationServicesManager.LIZ;
        Context context2 = getContext();
        locationServicesManager.getClass();
        if (!LocationServicesManager.LJIIIZ(context2) || (interfaceC1891350zJlLJIJI = ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).LJIJI()) == null || ((ArrayList) SR().getState().LJII()).contains(interfaceC1891350zJlLJIJI)) {
            return;
        }
        C20600815jK.LIZIZ(SR().getState(), 2, new C01BN(getResources().getString(2131844795)));
        C20600815jK.LIZIZ(SR().getState(), 3, interfaceC1891350zJlLJIJI);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C19EG activity = getActivity();
        if (activity != null) {
            activity.setTheme(R.style.my);
        }
        super.onCreate(bundle);
        NR(AFwS256S0000000_18.get$arr$(46));
        C19EG activity2 = getActivity();
        if (activity2 != null) {
            LocationServicesManager.LIZ.getClass();
            LocationServicesManager.LIZJ(activity2);
        }
        LocationServicesManager locationServicesManager = LocationServicesManager.LIZ;
        Context context = getContext();
        locationServicesManager.getClass();
        LocationServicesManager.LJIIJ(context, bundle);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        LocationServicesManager.LIZ.getClass();
        LocationServicesManager.LJ(bundle);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C0HXK c0hxk;
        InterfaceC1891350zJl interfaceC1891350zJlLJIJI;
        Class<? extends PowerCell<?>> clsLJIIIZ;
        Integer numLIZJ;
        TuxNavBar tuxNavBar = (TuxNavBar) view.findViewById(R.id.p2j);
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_offset_ltr;
        c1251150ifB.LIZLLL = true;
        c1251150ifB.LIZJ(new AwS562S0100000_18(this, 134));
        c0om1.LJ(c1251150ifB);
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = getResources().getString(2131844783);
        c0om1.LIZJ = c1250250idj;
        tuxNavBar.setNavActions(c0om1);
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.zp, context)) != null) {
            tuxNavBar.setNavBackground(numLIZJ.intValue());
        }
        SR().LJIILJJIL(LocationServicesHeaderCell.class);
        SR().LJIILJJIL(GPSPermissionCell.class);
        SR().LJIILJJIL(LocationServicesHistoryCell.class);
        SR().LJIILJJIL(LocationServicesFooterCell.class);
        if (!C294550Bgb.LIZ() && (clsLJIIIZ = ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).LJIIIZ()) != null) {
            SR().LJIILJJIL(clsLJIIIZ);
        }
        C20600815jK.LIZJ(SR().getState(), new C01BN(getResources().getString(2131839196)));
        C20600815jK<InterfaceC1891350zJl> state = SR().getState();
        Context context2 = getContext();
        C431350Gvl c431350Gvl = null;
        if (context2 != null) {
            LocationServicesManager.LIZ.getClass();
            SpannableStringBuilder spannableStringBuilderLIZ = LocationServicesManager.LIZ(context2, this, context2.getString(2131839200), context2.getString(2131844779), LocationServicesManager.LIZJ);
            String str = (String) this.LLIZLLLIL.getValue();
            Context context3 = getContext();
            AssemVMLazy assemVMLazy = this.LLJ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
            c0hxk = new C0HXK(spannableStringBuilderLIZ, str, context3, (LocationServicesVM) assemVMLazy.getValue());
        } else {
            c0hxk = null;
        }
        C20600815jK.LIZJ(state, c0hxk);
        LocationServicesManager locationServicesManager = LocationServicesManager.LIZ;
        Context context4 = getContext();
        locationServicesManager.getClass();
        if (LocationServicesManager.LJIIIZ(context4) && (interfaceC1891350zJlLJIJI = ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).LJIJI()) != null) {
            C20600815jK.LIZJ(SR().getState(), new C01BN(getResources().getString(2131844795)));
            C20600815jK.LIZJ(SR().getState(), interfaceC1891350zJlLJIJI);
        }
        C20600815jK.LIZJ(SR().getState(), new C01BN(getResources().getString(2131844780)));
        C20600815jK.LIZJ(SR().getState(), new InterfaceC1891350zJl() { // from class: X.00EI
            public final boolean LL = true;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C00EI) && this.LL == ((C00EI) obj).LL;
            }

            @Override // X.InterfaceC1891350zJl
            public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
                return null;
            }

            public final int hashCode() {
                return C786410Ut5.Z2(this.LL);
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("LocationServicesHistoryItem(placeholder=");
                sbLIZ.append(this.LL);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.InterfaceC1891350zJl
            public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                return Intrinsics.LJFF(interfaceC1891350zJl, this);
            }

            @Override // X.InterfaceC1891350zJl
            public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                return Intrinsics.LJFF(interfaceC1891350zJl, this);
            }
        });
        C20600815jK<InterfaceC1891350zJl> state2 = SR().getState();
        Context context5 = getContext();
        if (context5 != null) {
            c431350Gvl = new C431350Gvl(LocationServicesManager.LIZ(context5, this, context5.getString(2131839193), context5.getString(2131844778), LocationServicesManager.LIZLLL));
        }
        C20600815jK.LIZJ(state2, c431350Gvl);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.f880bdp, viewGroup, false);
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
