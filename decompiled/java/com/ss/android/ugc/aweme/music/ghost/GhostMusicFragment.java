package com.ss.android.ugc.aweme.music.ghost;

import X.C01GW;
import X.C098200Yq;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1252710ihh;
import X.C13LE;
import X.C1537050q6J;
import X.C15438062q;
import X.C1551950qUL;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20533215Wg;
import X.C2097908Jt;
import X.C2200821BBo;
import X.C2277881EDy;
import X.C632410OrH;
import X.C723850SaN;
import X.C786410Ut5;
import X.InterfaceC633950Otl;
import X.InterfaceC633960Otm;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.geckox.OptionCheckUpdateParams;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.ui.ProfileListFragment;
import com.ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS588S0100000_9;

/* JADX INFO: loaded from: classes10.dex */
public final class GhostMusicFragment extends ProfileListFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2Zig5OiHELIOSYwZiIkJjwnZgIkJjwnBTA/ICwVOiQrJCo9PA==";
    public ScrollView LLILZLL;
    public final C01GW LLIZ = RouteArgExtension.INSTANCE.navArg(this);

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void Bp() {
    }

    @Override // X.InterfaceC1206550hVF
    public final void Ii(boolean z) {
    }

    @Override // X.InterfaceC1206550hVF
    public final boolean LJLLL() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final boolean isEmpty() {
        return false;
    }

    public final void LLLZ() {
        InterfaceC633960Otm interfaceC633960Otm = (InterfaceC633960Otm) C1252710ihh.LJII(this, C13LE.LIZ(InterfaceC633960Otm.class));
        if (interfaceC633960Otm != null) {
            interfaceC633960Otm.LLLZ();
        }
        InterfaceC633950Otl interfaceC633950Otl = (InterfaceC633950Otl) C1252710ihh.LJII(this, C13LE.LIZ(InterfaceC633950Otl.class));
        if (interfaceC633950Otl != null) {
            interfaceC633950Otl.LLLZ();
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final int UR() {
        ScrollView scrollView = this.LLILZLL;
        return scrollView != null ? C2277881EDy.LIZIZ.getViewRawBottomY(scrollView) : super.UR();
    }

    @Override // X.InterfaceC1258040iqI
    public final View LJJLIIIJILLIZJL() {
        if (isViewValid()) {
            return this.LLILZLL;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment
    public final void cS(boolean z) {
        ScrollView scrollView = this.LLILZLL;
        if (scrollView != null) {
            scrollView.scrollTo(0, 0);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/ss/android/ugc/aweme/music/ghost/GhostMusicFragment", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOe9cJbNkjUR944trBQp3aySvbDILg1QPeDf/aHMCA==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.setUserVisibleHint(z);
        if (z) {
            LLLZ();
        }
        C2200821BBo.LIZ.getClass();
        if (!C2200821BBo.LIZ() && C2200821BBo.LJI && z) {
            C20533215Wg.LIZ(GhostMusicFragment.class);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment, com.bytedance.ies.uikit.base.AbsFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        try {
            OptionCheckUpdateParams optionCheckUpdateParams = new OptionCheckUpdateParams();
            optionCheckUpdateParams.setLazyUpdate(true);
            String accessKey = ((IMainService) ServiceManager.get().getService(IMainService.class)).getAccessKey();
            C1537050q6J.LIZ.getClass();
            C1551950qUL c1551950qULLIZ = C1537050q6J.LIZ(accessKey);
            if (c1551950qULLIZ != null) {
                List<String> list = C632410OrH.LIZJ().preloadChannels;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new CheckRequestBodyModel.TargetChannel(it2.next()));
                }
                c1551950qULLIZ.LIZ(null, C2097908Jt.LIZJ(new Pair(accessKey, arrayList)), optionCheckUpdateParams);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        C723850SaN.LIZ(this, false, null, new AwS588S0100000_9(this, 291), 3);
    }

    @Override // com.ss.android.ugc.aweme.profile.ui.ProfileListFragment, com.ss.android.ugc.common.component.fragment.ComponentFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ee4, viewGroup, false);
        C19GS c19gs = null;
        if (viewTd != null) {
            this.LLILZLL = (ScrollView) viewTd.findViewById(R.id.iv8);
        } else {
            viewTd = null;
        }
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
