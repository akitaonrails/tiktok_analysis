package com.ss.android.ugc.profile.business.ur.aigc;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C098200Yq;
import X.C11NJ;
import X.C1221150hsn;
import X.C1221530htP;
import X.C1221610htX;
import X.C1221880hty;
import X.C1265780j2m;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C13LE;
import X.C1622206Wu;
import X.C1685300txQ;
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
import X.C497820Jfg;
import X.C723850SaN;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C985403tE;
import X.C987103tV;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import X.InterfaceC836760Ws6;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AsS46S0100000_19;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
@InterfaceC836760Ws6
public final class ProfileAigcChooseAvatarFragment extends BaseFragment {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjU+Jik6JCBiKzogISspOjx9PTHELIOSdiKCY0K2scOyA1ISkpCCY0KwYkJiAgLQQ6KDsyOgM+KCg+LSs4";
    public ViewOnAttachStateChangeListenerC20604515jv LLIZ;
    public TuxNavBar LLIZLLLIL;
    public View LLJ;
    public final C01GW LLJI = RouteArgExtension.INSTANCE.navArg(this);
    public final AssemVMLazy LLJIJIL;
    public boolean LLJILJIL;
    public C1221530htP LLJILJILJ;
    public final C01GW LLJILLL;
    public C1221610htX LLJJ;
    public final C11NJ LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ProfileAigcChooseAvatarFragment.class, "vm", "getVm()Lcom/ss/android/ugc/profile/business/ur/aigc/ProfileAigcAvatarViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ProfileAigcChooseAvatarFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ProfileAigcAvatarViewModel.class);
        AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c19719912DlLIZ, 2225);
        AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(366);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS563S0100000_19, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 2226), aFwS257S0000000_19, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS563S0100000_19, new AwS563S0100000_19((Fragment) this, 2227), aFwS257S0000000_19, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS563S0100000_19, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 2228), aFwS257S0000000_19, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJIJIL = assemVMLazy;
        this.LLJILLL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(409));
        this.LLJJI = new C11NJ();
    }

    public final ProfileAigcAvatarViewModel SR() {
        AssemVMLazy assemVMLazy = this.LLJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        return (ProfileAigcAvatarViewModel) assemVMLazy.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onBackPressed() {
        String str;
        C1221880hty c1221880hty = C1221880hty.LIZ;
        String string = ((C1221150hsn) SR().getState()).LLILZIL.LIZ.toString();
        C1221530htP c1221530htP = this.LLJILJILJ;
        String str2 = null;
        if (c1221530htP != null) {
            str = c1221530htP.LLILLJJLI;
            str2 = c1221530htP.LLILLL;
        } else {
            str = null;
        }
        C1221880hty.LIZLLL(c1221880hty, string, "back", str, str2, 0, null, null, 112);
        if (!this.LLJILJIL) {
            C19EG activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        Context context = getContext();
        if (context != null) {
            C1397580mTM c1397580mTM = new C1397580mTM(context);
            c1397580mTM.LIZIZ(getResources().getString(2131820603));
            C985403tE.LIZ(c1397580mTM, new AwS598S0100000_19(this, 349));
            new C1397510mTF(c1397580mTM).LIZLLL();
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.LLJJI.LJ();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        OnBackPressedDispatcher onBackPressedDispatcher;
        super.onResume();
        C19EG activity = getActivity();
        if (activity == null || (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) == null) {
            return;
        }
        onBackPressedDispatcher.LIZIZ(new C1265780j2m(this, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d7  */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r18) {
        /*
            Method dump skipped, instruction units count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.ur.aigc.ProfileAigcChooseAvatarFragment.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        List<String> avatarUris;
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.w0u);
        Context context = viewFindViewById.getContext();
        if (context != null) {
            viewFindViewById.getLayoutParams().height = C497820Jfg.LIZJ(context);
        }
        Integer numValueOf = null;
        C723850SaN.LIZ(this, false, null, new AwS598S0100000_19(this, 350), 3);
        View viewFindViewById2 = this.LLIZ;
        if (viewFindViewById2 == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById2 = view2.findViewById(R.id.evr);
            } else {
                viewFindViewById2 = null;
            }
            this.LLIZ = (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById2;
        }
        ((RecyclerView) viewFindViewById2).addOnScrollListener(new AsS46S0100000_19(this, 11));
        ProfileAigcAvatarViewModel.yQ2(SR(), new C2217381BqS() { // from class: X.0hsz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1221150hsn) obj).LLJ;
            }
        }, this, new AwS598S0100000_19(this, 351));
        C1221880hty c1221880hty = C1221880hty.LIZ;
        String string = ((C1221150hsn) SR().getState()).LLILZIL.LIZ.toString();
        C1221530htP c1221530htP = this.LLJILJILJ;
        if (c1221530htP != null) {
            str = c1221530htP.LLILLJJLI;
            str2 = c1221530htP.LLILLL;
        } else {
            str = null;
            str2 = null;
        }
        C1221610htX c1221610htX = this.LLJJ;
        if (c1221610htX != null && (avatarUris = c1221610htX.getAvatarUris()) != null) {
            numValueOf = Integer.valueOf(avatarUris.size());
        }
        C1221880hty.LIZLLL(c1221880hty, string, "show", str, str2, 0, null, numValueOf, 48);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.eb7, viewGroup, false);
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
