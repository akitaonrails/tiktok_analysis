package com.ss.android.ugc.aweme.template;

import X.C019F;
import X.C01D1;
import X.C098200Yq;
import X.C13LE;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C2217381BqS;
import X.C23250099c;
import X.C2344009Gk;
import X.C327850CtD;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C628110OkL;
import X.C628260Oka;
import X.C723850SaN;
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
import com.ss.android.ugc.aweme.detail.base.DetailBaseFragment;
import com.ss.android.ugc.aweme.prefab.ability.RefreshAbility;
import com.ss.android.ugc.aweme.template.viewmodel.TemplateDetailViewModel;
import com.ss.android.ugc.aweme.template.viewmodel.TemplateFavoriteViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS8S0120000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class TemplateDetailFragment extends DetailBaseFragment implements RefreshAbility, InterfaceC1401270mZJ {
    public static final C628260Oka LLJILJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjEpJDHELIOS8/KTEpZxs2JTUgKDs2DCA4KCY/DjctLiI2JjE=";
    public long LLIZ;
    public final AssemVMLazy LLIZLLLIL;
    public final AssemVMLazy LLJ;
    public TemplateAnchorConfig LLJI;
    public boolean LLJIJIL;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0Oka] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TemplateDetailFragment.class, "templateDetailVM", "getTemplateDetailVM()Lcom/ss/android/ugc/aweme/template/viewmodel/TemplateDetailViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(TemplateDetailFragment.class, "templateFavoriteVM", "getTemplateFavoriteVM()Lcom/ss/android/ugc/aweme/template/viewmodel/TemplateFavoriteViewModel;", 0)};
        LLJILJIL = new Object() { // from class: X.0Oka
        };
    }

    @Override // X.InterfaceC1401270mZJ
    public final void LJFF() {
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.ability.DetailPageNameAbility
    public final String MP() {
        return "template_page";
    }

    @Override // X.InterfaceC1401270mZJ
    public final void V() {
    }

    public TemplateDetailFragment() {
        AssemVMLazy assemVMLazy;
        boolean z;
        boolean z2;
        AssemVMLazy assemVMLazy2;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TemplateDetailViewModel.class);
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(c19719912DlLIZ, 1483);
        AFwS240S0000000_9 aFwS240S0000000_9 = AFwS240S0000000_9.get$arr$(615);
        C01D1 c01d1 = C01D1.LIZ;
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS553S0100000_9, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 1484), aFwS240S0000000_9, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
            z2 = true;
            z = false;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS553S0100000_9, new AwS553S0100000_9((Fragment) this, 1485), aFwS240S0000000_9, null, null, null);
            z = false;
            z2 = true;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z = false;
            z2 = true;
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS553S0100000_9, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 1486), aFwS240S0000000_9, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLIZLLLIL = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(TemplateFavoriteViewModel.class);
        AwS553S0100000_9 awS553S0100000_92 = new AwS553S0100000_9(c19719912DlLIZ2, 1487);
        AFwS240S0000000_9 aFwS240S0000000_92 = AFwS240S0000000_9.get$arr$(616);
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS553S0100000_92, new C452070Ho5(), new C1622206Wu(this, z2), new C338490DOt(this, z2), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 1488), aFwS240S0000000_92, new C451460Hn6(this, z2), new C451620HnM(this, z2), new C987103tV(this, z2));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy2 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS553S0100000_92, new AwS553S0100000_9((Fragment) this, 1489), aFwS240S0000000_92, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS553S0100000_92, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 1482), aFwS240S0000000_92, new C451460Hn6(this, z), new C451620HnM(this, z), new C987103tV(this, z));
        }
        this.LLJ = assemVMLazy2;
    }

    public final TemplateDetailViewModel UR() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        return (TemplateDetailViewModel) assemVMLazy.getValue();
    }

    public final TemplateFavoriteViewModel VR() {
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        return (TemplateFavoriteViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "template_page");
        TemplateAnchorConfig templateAnchorConfig = this.LLJI;
        c2344009Gk.LJIIIIZZ("enter_method", templateAnchorConfig != null ? templateAnchorConfig.getEnterMethod() : null);
        C20684815ws.LJIILLIIL("close_detail_page", c2344009Gk.LIZ);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (VR().LL) {
            VR().LL = false;
        } else {
            refresh();
        }
    }

    @Override // com.ss.android.ugc.aweme.prefab.ability.RefreshAbility
    public final void refresh() {
        C723850SaN.LIZ(this, false, null, new AwS8S0120000_9(this, VR().LLILZ, 1), 3);
        TemplateDetailViewModel templateDetailViewModelUR = UR();
        long jCurrentTimeMillis = System.currentTimeMillis();
        templateDetailViewModelUR.setState(AFwS240S0000000_9.get$arr$(866));
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(templateDetailViewModelUR), null, null, new C628110OkL(templateDetailViewModelUR, jCurrentTimeMillis, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.detail.base.DetailBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C327850CtD.LIZIZ("template_page");
        super.onCreate(bundle);
        this.LLIZ = System.currentTimeMillis();
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.putLong("startTime", this.LLIZ);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.ss.android.ugc.aweme.template.TemplateDetailFragment for r12v4 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(android.view.View r13, android.os.Bundle r14) {
        /*
            Method dump skipped, instruction units count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.template.TemplateDetailFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        FrameLayout frameLayout = new FrameLayout(requireContext());
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
        try {
            ViewTreeLifecycleOwner.set(frameLayout, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(frameLayout, this);
            frameLayout.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return frameLayout;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return frameLayout;
        }
    }
}
