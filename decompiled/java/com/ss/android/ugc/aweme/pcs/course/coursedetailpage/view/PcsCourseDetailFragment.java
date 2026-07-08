package com.ss.android.ugc.aweme.pcs.course.coursedetailpage.view;

import X.C011Z;
import X.C019F;
import X.C01D1;
import X.C098200Yq;
import X.C1308910kAL;
import X.C13LE;
import X.C14K9;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1622206Wu;
import X.C1685300txQ;
import X.C1826730xdX;
import X.C1836920xty;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C1A6V;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C490570JLr;
import X.C490580JLs;
import X.C517510KRh;
import X.C517520KRi;
import X.C522010Kdb;
import X.C723850SaN;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C987103tV;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC517590KRp;
import X.InterfaceC665370Q7z;
import X.InterfaceC724760Sbq;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.provider.impl.GScope;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.pcs.course.coursedetailpage.viewmodel.PcsCourseDetailVM;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class PcsCourseDetailFragment extends BaseFragment {
    public static final C490570JLr LLILZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjUvOmEwJzA+Oip9Kyo5OzHELIOSw2LCA4KCY/OCQrLGElISA7Zx8wOwYjPD0gLQEpPS46JAM+KCg+LSs4";
    public final AssemVMLazy LL;
    public InterfaceC665370Q7z LLILLJJLI;
    public C1836920xty LLILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PcsCourseDetailFragment.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/pcs/course/coursedetailpage/viewmodel/PcsCourseDetailVM;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLILZ = new C490570JLr();
    }

    public PcsCourseDetailFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PcsCourseDetailVM.class);
        AwS551S0100000_7 awS551S0100000_7 = new AwS551S0100000_7(c19719912DlLIZ, 368);
        AFwS237S0000000_7 aFwS237S0000000_7 = AFwS237S0000000_7.get$arr$(125);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS551S0100000_7, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS551S0100000_7((HasDefaultViewModelProviderFactory) this, 369), aFwS237S0000000_7, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS551S0100000_7, new AwS551S0100000_7((Fragment) this, 370), aFwS237S0000000_7, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS551S0100000_7, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS551S0100000_7((HasDefaultViewModelProviderFactory) this, 371), aFwS237S0000000_7, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LL = assemVMLazy;
    }

    public final C1836920xty NR() {
        InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ;
        if (this.LLILLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7z = this.LLILLJJLI;
            C1836920xty c1836920xty = null;
            if (interfaceC665370Q7z != null && (interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(interfaceC665370Q7z, "source_default_key", C1836920xty.class, null)) != null) {
                c1836920xty = (C1836920xty) interfaceC1555100qZQLIZIZ.getSource();
            }
            this.LLILLL = c1836920xty;
        }
        return this.LLILLL;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C1554960qZC.LIZLLL(GScope.LL, C490580JLs.class, null);
        InterfaceC517590KRp interfaceC517590KRpLIZ = C1826730xdX.LIZ();
        if (interfaceC517590KRpLIZ != null) {
            interfaceC517590KRpLIZ.LJIIJJI(new C517520KRi(hashCode()));
        }
        super.onDestroy();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        Window window;
        Context context;
        Integer numLIZJ;
        super.onResume();
        C19EG activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null || (context = getContext()) == null || (numLIZJ = C1308910kAL.LIZJ(R.attr.bx, context)) == null) {
            return;
        }
        int iIntValue = numLIZJ.intValue();
        window.setStatusBarColor(iIntValue);
        window.setNavigationBarColor(iIntValue);
        new C1A6V(window, window.getDecorView()).LIZJ(!C011Z.LIZ.LJIJ(getContext()));
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        long j;
        String string;
        String string2;
        String string3;
        boolean z;
        boolean z2;
        boolean z3;
        super.onCreate(bundle);
        Long lValueOf = null;
        InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(this, null);
        Bundle arguments = getArguments();
        String str2 = "";
        if (arguments != null) {
            long j2 = arguments.getLong("course_id");
            this.LLILLJJLI = interfaceC665370Q7zLJFF;
            AssemVMLazy assemVMLazy = this.LL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZIL;
            ((PcsCourseDetailVM) assemVMLazy.getValue()).LL = interfaceC665370Q7zLJFF;
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                j = arguments2.getLong("anchor_id");
            } else {
                j = -1;
            }
            long currentUserId = UserService.getInstance().user().getCurrentUserId();
            Bundle arguments3 = getArguments();
            if (arguments3 == null || (string = arguments3.getString("sec_anchor_id")) == null) {
                string = "";
            }
            Bundle arguments4 = getArguments();
            if (arguments4 == null || (string2 = arguments4.getString("show_entrance")) == null) {
                string2 = "";
            }
            Bundle arguments5 = getArguments();
            if (arguments5 == null || (string3 = arguments5.getString("enter_from")) == null) {
                string3 = "";
            }
            Bundle arguments6 = getArguments();
            if (arguments6 != null) {
                lValueOf = Long.valueOf(arguments6.getLong("room_id"));
            }
            Bundle arguments7 = getArguments();
            if (arguments7 != null) {
                z = arguments7.getBoolean("is_full_screen_page");
            } else {
                z = true;
            }
            Bundle arguments8 = getArguments();
            if (arguments8 != null) {
                z2 = arguments8.getBoolean("has_purchased");
            } else {
                z2 = false;
            }
            Bundle arguments9 = getArguments();
            if (arguments9 != null) {
                z3 = arguments9.getBoolean("is_single_sku");
            } else {
                z3 = false;
            }
            C1554960qZC.LIZ(interfaceC665370Q7zLJFF, new C1836920xty(j2, j, currentUserId, lValueOf, string, string3, string2, z, z2, z3, hashCode()), C1836920xty.class, "source_default_key");
        }
        InterfaceC517590KRp interfaceC517590KRpLIZ = C1826730xdX.LIZ();
        if (interfaceC517590KRpLIZ != null) {
            int iHashCode = hashCode();
            C1836920xty c1836920xtyNR = NR();
            if (c1836920xtyNR != null && (str = c1836920xtyNR.LLIZ) != null) {
                str2 = str;
            }
            interfaceC517590KRpLIZ.LJIIIIZZ("PCSCourseDetailPage", new C517510KRh(iHashCode, str2, 1019));
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (Build.VERSION.SDK_INT >= 35) {
            C14K9.LJIJJ(view, new C522010Kdb(this, 0));
        }
        C723850SaN.LIZ(this, false, null, new AwS581S0100000_2(this, 0), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.dd0, viewGroup, false);
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
