package com.ss.android.ugc.aweme.aime;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C098200Yq;
import X.C13LE;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2217381BqS;
import X.C23250099c;
import X.C327850CtD;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C615660OCu;
import X.C627330Oj5;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C987103tV;
import X.InterfaceC1401270mZJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aime.model.FragmentInitParam;
import com.ss.android.ugc.aweme.detail.base.DetailBaseFragment;
import com.ss.android.ugc.aweme.prefab.ability.RefreshAbility;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class AIMEDetailFragment extends DetailBaseFragment implements RefreshAbility, InterfaceC1401270mZJ {
    public static final C627330Oj5 LLJIJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public static final String LLJILJILJ;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2HELIOSZiQlJCp9CQwBDAs2PCQlJQkhKSIhLCEn";
    public final AssemVMLazy LLIZ;
    public boolean LLIZLLLIL;
    public FragmentInitParam LLJ;
    public final C01GW LLJI;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0Oj5] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AIMEDetailFragment.class, "aimeDetailVM", "getAimeDetailVM()Lcom/ss/android/ugc/aweme/aime/AIMEDetailViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJIJIL = new Object() { // from class: X.0Oj5
        };
        LLJILJILJ = "aime_detail_fragment_init_param";
    }

    @Override // X.InterfaceC1401270mZJ
    public final void LJFF() {
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.ability.DetailPageNameAbility
    public final String MP() {
        return "aime_detial";
    }

    @Override // X.InterfaceC1401270mZJ
    public final void V() {
    }

    public AIMEDetailFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(AIMEDetailViewModel.class);
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(c19719912DlLIZ, 51);
        AFwS240S0000000_9 aFwS240S0000000_9 = AFwS240S0000000_9.get$arr$(50);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS553S0100000_9, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 52), aFwS240S0000000_9, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS553S0100000_9, new AwS553S0100000_9((Fragment) this, 53), aFwS240S0000000_9, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS553S0100000_9, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 54), aFwS240S0000000_9, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLIZ = assemVMLazy;
        this.LLJI = C452501pT.LIZIZ(new AwS553S0100000_9(this, 49));
    }

    public final AIMEDetailViewModel UR() {
        AssemVMLazy assemVMLazy = this.LLIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
        return (AIMEDetailViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.prefab.ability.RefreshAbility
    public final void refresh() {
        AIMEDetailViewModel aIMEDetailViewModelUR = UR();
        aIMEDetailViewModelUR.setState(AFwS240S0000000_9.get$arr$(25));
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(aIMEDetailViewModelUR), null, null, new C615660OCu(aIMEDetailViewModelUR, true, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.detail.base.DetailBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C327850CtD.LIZIZ("aime_detial");
        super.onCreate(bundle);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.ss.android.ugc.aweme.aime.AIMEDetailFragment for r14v4 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(android.view.View r15, android.os.Bundle r16) {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.aime.AIMEDetailFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout;
        C19GS c19gs = null;
        try {
            frameLayout = new FrameLayout(requireContext());
            frameLayout.setFitsSystemWindows(false);
            FrameLayout frameLayout2 = new FrameLayout(requireContext());
            C786410Ut5.a6(frameLayout2, new ViewGroup.LayoutParams(-1, -2));
            frameLayout2.setId(R.id.evm);
            frameLayout.addView(frameLayout2);
            LinearLayout linearLayout = new LinearLayout(requireContext());
            linearLayout.setOrientation(1);
            Space space = new Space(requireContext());
            space.setId(R.id.w0u);
            linearLayout.addView(space);
            FrameLayout frameLayout3 = new FrameLayout(requireContext());
            frameLayout3.setFitsSystemWindows(true);
            frameLayout3.setId(R.id.ex3);
            linearLayout.addView(frameLayout3);
            frameLayout.addView(linearLayout);
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
            frameLayout = null;
        }
        if (!(frameLayout instanceof View)) {
            frameLayout = null;
        }
        if (frameLayout != null) {
            try {
                ViewTreeLifecycleOwner.set(frameLayout, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(frameLayout, this);
                frameLayout.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return frameLayout;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return frameLayout;
    }
}
