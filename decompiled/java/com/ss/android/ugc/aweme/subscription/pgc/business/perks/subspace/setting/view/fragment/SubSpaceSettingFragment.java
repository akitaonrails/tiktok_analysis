package com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.setting.view.fragment;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C098200Yq;
import X.C0JCK;
import X.C0K4J;
import X.C0K4Y;
import X.C0TCF;
import X.C0UJ2;
import X.C11NZ;
import X.C11S5;
import X.C1390410mHn;
import X.C13LE;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1701940uOG;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C511510K4f;
import X.C511520K4g;
import X.C723850SaN;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C987103tV;
import X.EnumC499440JiI;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import Y.AfS176S0100000_7;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.common.fragment.SubSpaceBaseFragment;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.setting.vm.SubSpaceSettingVM;
import com.ss.android.ugc.aweme.subscription.pgc.data.network.DataResponse;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.pgc_sub.PGCSettingsResponse;

/* JADX INFO: loaded from: classes8.dex */
public final class SubSpaceSettingFragment extends SubSpaceBaseFragment {
    public static final C0K4Y LLJILJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjY5KzwwOiw8PSY8Jms8Lix9KjA/ICE2OzZiOSohIzHELIOSZiOjoxOzUtKip9OyA4PSY9L2s6ICokZiM+KCg+LSs4ZxwmKhY8KCw2GyA4PSY9LwM+KCg+LSs4";
    public ConstraintLayout LLIZ;
    public TextView LLIZLLLIL;
    public final AssemVMLazy LLJ;
    public FrameLayout LLJI;
    public final C01GW LLJIJIL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0K4Y] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SubSpaceSettingFragment.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/subscription/pgc/business/perks/subspace/setting/vm/SubSpaceSettingVM;", 0);
        C13LE.LIZ.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJILJIL = new Object() { // from class: X.0K4Y
        };
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.common.fragment.SubSpaceBaseFragment
    public final void clearFromXmlViewCache() {
        this.LLILLJJLI = null;
        this.LLIZ = null;
        this.LLIZLLLIL = null;
    }

    public SubSpaceSettingFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubSpaceSettingVM.class);
        AwS551S0100000_7 awS551S0100000_7 = new AwS551S0100000_7(c19719912DlLIZ, 519);
        AFwS237S0000000_7 aFwS237S0000000_7 = AFwS237S0000000_7.get$arr$(232);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS551S0100000_7, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS551S0100000_7((HasDefaultViewModelProviderFactory) this, 520), aFwS237S0000000_7, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS551S0100000_7, new AwS551S0100000_7((Fragment) this, 521), aFwS237S0000000_7, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS551S0100000_7, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS551S0100000_7((HasDefaultViewModelProviderFactory) this, 522), aFwS237S0000000_7, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJ = assemVMLazy;
        this.LLJIJIL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(185));
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.common.fragment.SubSpaceBaseFragment
    public final String OR() {
        return C511520K4g.LJII(2131839584);
    }

    public final void RR() {
        C11NZ c11nz;
        Context context = getContext();
        if (context != null) {
            FrameLayout frameLayout = this.LLJI;
            if (frameLayout != null && frameLayout.getChildCount() == 0) {
                int i = (int) (36 * context.getResources().getDisplayMetrics().density);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
                layoutParams.gravity = 17;
                C1390410mHn c1390410mHn = new C1390410mHn(context, null, 6);
                C786410Ut5.V6(c1390410mHn, layoutParams);
                c1390410mHn.LIZJ();
                FrameLayout frameLayout2 = this.LLJI;
                if (frameLayout2 != null) {
                    frameLayout2.addView(c1390410mHn, layoutParams);
                }
            }
            FrameLayout frameLayout3 = this.LLJI;
            if (frameLayout3 != null) {
                C786410Ut5.LJZ(0, frameLayout3);
            }
        }
        C11NZ<DataResponse<PGCSettingsResponse.ResponseData>> spaceSettings = C0K4J.LIZ().getSpaceSettings();
        if (spaceSettings == null || (c11nz = (C11NZ) C0JCK.LIZ(spaceSettings, EnumC499440JiI.GENERAL, "SubSpaceSettingFragment", "sub/space/settings", null, 8).LJL(C11S5.LIZ()).LJIILIIL(new C0UJ2()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(new C0TCF(this))) == null) {
            return;
        }
        c11nz.LJJLL(new AfS176S0100000_7(this, 125), new AfS176S0100000_7(this, 126));
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.common.fragment.SubSpaceBaseFragment, com.ss.android.ugc.aweme.subscription.pgc.commonui.fragment.PgcBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        clearFromXmlViewCache();
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.common.fragment.SubSpaceBaseFragment
    public final void NR(ImageView imageView) {
        C786410Ut5.LJZI(8, imageView);
    }

    @Override // com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.common.fragment.SubSpaceBaseFragment, com.ss.android.ugc.aweme.subscription.pgc.commonui.fragment.PgcBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLJI = (FrameLayout) view.findViewById(R.id.nlo);
        C723850SaN.LIZ(this, false, null, new AwS581S0100000_2(this, 388), 3);
        RR();
        ((C511510K4f) this.LLJIJIL.getValue()).LIZIZ(view, new AwS551S0100000_7(this, 518));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ffs, viewGroup, false);
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
