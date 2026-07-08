package com.ss.android.ugc.aweme.creativedetail;

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
import X.C627730Ojj;
import X.C627830Ojt;
import X.C627870Ojx;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C987103tV;
import X.InterfaceC1401270mZJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import X.InterfaceC836760Ws6;
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
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creativedetail.viewmodel.CreativeToolDetailViewModel;
import com.ss.android.ugc.aweme.detail.base.DetailBaseFragment;
import com.ss.android.ugc.aweme.prefab.ability.RefreshAbility;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC836760Ws6
public final class CreativeToolDetailFragment extends DetailBaseFragment implements RefreshAbility, InterfaceC1401270mZJ {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJI;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiY+LC4nITMpHELIOSLSonKSwgZwwhLSQ4IDk2HCojJQs2PCQlJQkhKSIhLCEn";
    public final C01GW LLIZ = RouteArgExtension.INSTANCE.requiredArg(this, AFwS195S0000000_9.get$arr$(68), "enterFrom", String.class);
    public final C01GW LLIZLLLIL = RouteArgExtension.INSTANCE.requiredArg(this, AFwS195S0000000_9.get$arr$(73), "fromGroupId", String.class);
    public final C01GW LLJ = RouteArgExtension.INSTANCE.requiredArg(this, AFwS195S0000000_9.get$arr$(69), "detailPageId", String.class);
    public final C01GW LLJI = RouteArgExtension.INSTANCE.requiredArg(this, AFwS195S0000000_9.get$arr$(70), "anchorType", Integer.class);
    public final C01GW LLJIJIL = RouteArgExtension.INSTANCE.requiredArg(this, AFwS195S0000000_9.get$arr$(71), "resourceId", String.class);
    public final C01GW LLJILJIL = RouteArgExtension.INSTANCE.requiredArg(this, AFwS195S0000000_9.get$arr$(72), "extra", String.class);
    public final C01GW LLJILJILJ = RouteArgExtension.INSTANCE.requiredArg(this, AFwS195S0000000_9.get$arr$(67), "startTime", Long.class);
    public final AssemVMLazy LLJILLL;
    public C627830Ojt LLJJ;
    public final long LLJJI;
    public long LLJJIII;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CreativeToolDetailFragment.class, "templateDetailVM", "getTemplateDetailVM()Lcom/ss/android/ugc/aweme/creativedetail/viewmodel/CreativeToolDetailViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1401270mZJ
    public final void LJFF() {
    }

    @Override // X.InterfaceC1401270mZJ
    public final void V() {
    }

    public CreativeToolDetailFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CreativeToolDetailViewModel.class);
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(c19719912DlLIZ, 85);
        AFwS240S0000000_9 aFwS240S0000000_9 = AFwS240S0000000_9.get$arr$(65);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS553S0100000_9, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 86), aFwS240S0000000_9, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS553S0100000_9, new AwS553S0100000_9((Fragment) this, 87), aFwS240S0000000_9, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS553S0100000_9, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 88), aFwS240S0000000_9, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJILLL = assemVMLazy;
        this.LLJJI = System.currentTimeMillis();
        this.LLJJIII = System.currentTimeMillis();
    }

    public final long UR() {
        return ((Number) this.LLJILJILJ.getValue()).longValue();
    }

    public final int VR() {
        return ((Number) this.LLJI.getValue()).intValue();
    }

    public final CreativeToolDetailViewModel WR() {
        AssemVMLazy assemVMLazy = this.LLJILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJI;
        return (CreativeToolDetailViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.detail.prefab.ability.DetailPageNameAbility
    public final String MP() {
        return C627870Ojx.LIZIZ(C627870Ojx.LIZ(VR()));
    }

    @Override // com.ss.android.ugc.aweme.prefab.ability.RefreshAbility
    public final void refresh() {
        this.LLJJIII = System.currentTimeMillis();
        CreativeToolDetailViewModel creativeToolDetailViewModelWR = WR();
        creativeToolDetailViewModelWR.setState(AFwS240S0000000_9.get$arr$(890));
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(creativeToolDetailViewModelWR), null, null, new C627730Ojj(creativeToolDetailViewModelWR, true, null), 3);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // com.ss.android.ugc.aweme.detail.base.DetailBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        C327850CtD.LIZIZ(MP());
        super.onCreate(bundle);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to com.ss.android.ugc.aweme.creativedetail.CreativeToolDetailFragment for r19v4 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(android.view.View r20, android.os.Bundle r21) {
        /*
            Method dump skipped, instruction units count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creativedetail.CreativeToolDetailFragment.onViewCreated(android.view.View, android.os.Bundle):void");
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

    public final void ZR(String str, String str2, String str3, long j, long j2, String str4) {
        try {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ(Scene.SCENE_SERVICE, String.valueOf(VR()));
            c2344009Gk.LJIIIIZZ("third_id", (String) this.LLJ.getValue());
            c2344009Gk.LIZLLL(System.currentTimeMillis() - j2, "cost");
            c2344009Gk.LIZLLL(System.currentTimeMillis() - j, "total_cost");
            c2344009Gk.LJIIIIZZ("cost_type", str);
            c2344009Gk.LIZJ(0, "is_list_first_load");
            c2344009Gk.LJIIIIZZ("error_stage", str2);
            c2344009Gk.LJIIIIZZ("error_msg", str3);
            c2344009Gk.LJIIIIZZ("log_id", str4);
            C20684815ws.LJIILLIIL("creative_tool_anchor_detail_page", c2344009Gk.LIZ);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
