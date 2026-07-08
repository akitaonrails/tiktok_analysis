package com.ss.android.ugc.aweme.music.assem.report.compose;

import X.C019F;
import X.C01D1;
import X.C05P0;
import X.C05P1;
import X.C098200Yq;
import X.C0ODF;
import X.C1220000hqw;
import X.C127G;
import X.C1389890mGx;
import X.C13LE;
import X.C13ZC;
import X.C1622206Wu;
import X.C1669670tYD;
import X.C1680510tph;
import X.C1680520tpi;
import X.C1680540tpk;
import X.C1685300txQ;
import X.C189200o6;
import X.C19719212De;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20028913Yh;
import X.C20030013Ys;
import X.C20088213iq;
import X.C2217381BqS;
import X.C291001Au;
import X.C338490DOt;
import X.C338520DOw;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C597100NbQ;
import X.C631850OqN;
import X.C632090Oql;
import X.C632250Or1;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736950SvV;
import X.C987103tV;
import X.EnumC1427810nG7;
import X.EnumC597760NcU;
import X.InterfaceC1680500tpg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import Y.AObjectS62S0000000_9;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.music.vm.MusicPlayViewModel;
import com.ss.android.ugc.aweme.music.vm.ReportViewModel;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS157S1200000_25;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class ReportDetailsFragmentCompose extends AmeBaseFragment {
    public static final C632250Or1 LLILZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2Zig5OiYwZiQ/Oio+ZjcpOSHELIOSAhPGsvJiIjJzYpZx02OCo+PQs2PCQlJTwVOiQrJCo9PAYjJD88OyA=";
    public final C736950SvV LL;
    public final AssemVMLazy LLILLJJLI;
    public C127G LLILLL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0Or1] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ReportDetailsFragmentCompose.class, "reportViewModel", "getReportViewModel()Lcom/ss/android/ugc/aweme/music/vm/ReportViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLILZ = new Object() { // from class: X.0Or1
        };
    }

    public ReportDetailsFragmentCompose() {
        AssemVMLazy assemVMLazy;
        AFwS195S0000000_9 aFwS195S0000000_9 = AFwS195S0000000_9.get$arr$(239);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MusicPlayViewModel.class);
        AFwS240S0000000_9 aFwS240S0000000_9 = AFwS240S0000000_9.get$arr$(471);
        C451460Hn6 c451460Hn6 = new C451460Hn6(this, false);
        C451620HnM c451620HnM = new C451620HnM(this, true);
        C338520DOw c338520DOw = new C338520DOw(this);
        C452070Ho5 c452070Ho5 = new C452070Ho5();
        this.LL = new C736950SvV(c19719912DlLIZ, aFwS195S0000000_9, c452070Ho5, C724750Sbp.LJII(this), C1220000hqw.LIZ(this), aFwS240S0000000_9, c451460Hn6, c451620HnM, c338520DOw);
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(ReportViewModel.class);
        AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(c19719912DlLIZ2, 1138);
        AFwS240S0000000_9 aFwS240S0000000_92 = AFwS240S0000000_9.get$arr$(470);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS553S0100000_9, c452070Ho5, new C1622206Wu(this, true), new C338490DOt(this, true), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 1139), aFwS240S0000000_92, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS553S0100000_9, new AwS553S0100000_9((Fragment) this, 1140), aFwS240S0000000_92, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS553S0100000_9, c452070Ho5, C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS553S0100000_9((HasDefaultViewModelProviderFactory) this, 1141), aFwS240S0000000_92, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLILLJJLI = assemVMLazy;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLILLL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLILLL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{MusicPlayViewModel.class, new AObjectS62S0000000_9(this, 48), ReportViewModel.class, new AObjectS62S0000000_9(this, 47)}, defaultViewModelProviderFactory);
                    this.LLILLL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((MusicPlayViewModel) this.LL.getValue()).CQ2();
    }

    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C723850SaN.LIZ(this, false, null, new AwS588S0100000_9(this, 275), 3);
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Serializable serializable;
        C632090Oql c632090Oql;
        C19GS c19gs = null;
        ComposeView composeView = new ComposeView(requireContext(), null, 6);
        composeView.setViewCompositionStrategy(C20088213iq.LIZIZ);
        Bundle arguments = getArguments();
        if (arguments != null) {
            serializable = arguments.getSerializable("music_item_extra");
        } else {
            serializable = null;
        }
        if (serializable instanceof C632090Oql) {
            c632090Oql = (C632090Oql) serializable;
        } else {
            c632090Oql = null;
        }
        if (c632090Oql != null) {
            C1669670tYD.LJ(composeView, EnumC1427810nG7.Auto, new C19719212De(110756795, new AwS157S1200000_25(this, c632090Oql.getMusicModel().getMusicId(), c632090Oql, 0), true));
        }
        try {
            ViewTreeLifecycleOwner.set(composeView, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(composeView, this);
            composeView.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return composeView;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return composeView;
        }
    }

    public final void MR(C05P1<C597100NbQ> c05p1, String str, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1218882307);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c05p1)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(str)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJII(this)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 147) == 146 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = C20028913Yh.LJI(Boolean.FALSE);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            C05P0 c05p0 = (C05P0) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(1180180164);
            if (((Boolean) c05p0.getValue()).booleanValue()) {
                C1389890mGx c1389890mGx = new C1389890mGx(this);
                c1389890mGx.LJIIIZ(2131846320);
                c13zcLJIIJ.LJJIIJZLJL(5004770);
                Object objLJJ2 = c13zcLJIIJ.LJJ();
                if (objLJJ2 == c1680520tpi) {
                    objLJJ2 = new AwS553S0100000_9(c05p0, (C05P0<Boolean>) 1137);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ2);
                }
                c13zcLJIIJ.LJJJJL(false);
                c1389890mGx.LIZJ((Function0) objLJJ2);
                c1389890mGx.LJIIJJI();
            }
            c13zcLJIIJ.LJJJJL(false);
            C291001Au<EnumC597760NcU> c291001Au = c05p1.getValue().LL;
            c13zcLJIIJ.LJJIIJZLJL(-1224400529);
            boolean z2 = true;
            if ((i2 & 14) == 4) {
                z = true;
            } else {
                z = false;
            }
            if ((i2 & 112) != 32) {
                z2 = false;
            }
            boolean zLJII = z | z2 | c13zcLJIIJ.LJII(this);
            Object objLJJ3 = c13zcLJIIJ.LJJ();
            if (zLJII || objLJJ3 == c1680520tpi) {
                objLJJ3 = new C0ODF(c05p1, str, this, c05p0, null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ3);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1680540tpk.LJFF(c291001Au, (Function2) objLJJ3, c13zcLJIIJ);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new C631850OqN(this, c05p1, str, i);
        }
    }
}
