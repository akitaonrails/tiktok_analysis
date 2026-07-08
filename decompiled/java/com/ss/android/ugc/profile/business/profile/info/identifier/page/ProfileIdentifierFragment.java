package com.ss.android.ugc.profile.business.profile.info.identifier.page;

import X.C098200Yq;
import X.C0HTI;
import X.C13LE;
import X.C1685300txQ;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C1766560w4U;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2217381BqS;
import X.C337680DLq;
import X.C418440Gaw;
import X.C452070Ho5;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import com.ss.android.ugc.profile.business.profile.info.identifier.page.viewmodel.ProfileIdentifierViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AwS370S0200000_4;
import kotlin.jvm.internal.AwS548S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class ProfileIdentifierFragment extends CommonPageFragment {
    public static final C337680DLq LLJILJIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZjU+Jik6JCBiKzogISspOjx9ODcjLyY/LWslHELIOSJyk8ZiwoLCEnISMlLD19OCQrLGEDOioqICM2ASEpJzs6LiwpOwkhKSIhLCEn";
    public String LL;
    public String LLILLJJLI;
    public String LLILLL;
    public Integer LLILZ;
    public final AssemVMLazy LLILZIL;
    public TuxNavBar LLILZLL;
    public int LLIZ;
    public C1749280vcc LLIZLLLIL;
    public LinearLayout LLJ;
    public int LLJI;
    public int LLJIJIL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0DLq] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ProfileIdentifierFragment.class, "pageViewModel", "getPageViewModel()Lcom/ss/android/ugc/profile/business/profile/info/identifier/page/viewmodel/ProfileIdentifierViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJILJIL = new Object() { // from class: X.0DLq
        };
    }

    public final ProfileIdentifierViewModel MR() {
        AssemVMLazy assemVMLazy = this.LLILZIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        return (ProfileIdentifierViewModel) assemVMLazy.getValue();
    }

    public final void OR() {
        String string;
        String string2;
        C1749280vcc c1749280vcc = this.LLIZLLLIL;
        if (c1749280vcc != null) {
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.nj;
            Drawable drawableLIZ = c0hti.LIZ(c1749280vcc.getContext());
            c1722300uv6.LIZJ = 2;
            c1722300uv6.LIZ = drawableLIZ;
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(130));
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(96));
            c1722300uv6.LIZLLL = iLIZIZ;
            c1722300uv6.LJ = iLIZIZ2;
            Context context = c1749280vcc.getContext();
            String str = "";
            if (context == null || (string = context.getString(2131822154)) == null) {
                string = "";
            }
            c1722300uv6.LJI = string;
            Context context2 = c1749280vcc.getContext();
            if (context2 != null && (string2 = context2.getString(2131858352)) != null) {
                str = string2;
            }
            c1722300uv6.LJIIIIZZ = str;
            c1722300uv6.LJIIIZ = new AwS370S0200000_4(c1749280vcc, this, 35);
            c1749280vcc.setStatus(c1722300uv6);
            if (c1749280vcc.getVisibility() != 0) {
                C786410Ut5.LLLZLZ(c1749280vcc, 0);
            }
        }
    }

    public final void PR() {
        String string;
        String string2;
        C1749280vcc c1749280vcc = this.LLIZLLLIL;
        if (c1749280vcc != null) {
            C1722300uv6 c1722300uv6 = new C1722300uv6();
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.nl;
            Drawable drawableLIZ = c0hti.LIZ(c1749280vcc.getContext());
            c1722300uv6.LIZJ = 2;
            c1722300uv6.LIZ = drawableLIZ;
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(130));
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(96));
            c1722300uv6.LIZLLL = iLIZIZ;
            c1722300uv6.LJ = iLIZIZ2;
            Context context = c1749280vcc.getContext();
            String str = "";
            if (context == null || (string = context.getString(R.string.m25)) == null) {
                string = "";
            }
            c1722300uv6.LJI = string;
            Context context2 = c1749280vcc.getContext();
            if (context2 != null && (string2 = context2.getString(2131824791)) != null) {
                str = string2;
            }
            c1722300uv6.LJIIIIZZ = str;
            c1722300uv6.LJIIIZ = new AwS370S0200000_4(c1749280vcc, this, 36);
            c1749280vcc.setStatus(c1722300uv6);
            if (c1749280vcc.getVisibility() != 0) {
                C786410Ut5.LLLZLZ(c1749280vcc, 0);
            }
        }
    }

    public ProfileIdentifierFragment() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ProfileIdentifierViewModel.class);
        this.LLILZIL = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), new AwS548S0100000_4(c19719912DlLIZ, 318), new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS548S0100000_4((HasDefaultViewModelProviderFactory) this, 319), AFwS232S0000000_4.get$arr$(106));
        this.LLJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(98));
    }

    public final void NR(int i) {
        TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(this);
        tuxImmersionBarLIZLLL.LJIIIIZZ(i);
        tuxImmersionBarLIZLLL.LJ(i);
        tuxImmersionBarLIZLLL.LIZ(true);
        tuxImmersionBarLIZLLL.LIZLLL();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00ed  */
    @Override // com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r9, android.os.Bundle r10) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.profile.business.profile.info.identifier.page.ProfileIdentifierFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.eht, viewGroup, false);
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
