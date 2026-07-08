package com.ss.android.ugc.aweme.inbox.newfollowerpage;

import X.AbstractC480470Isn;
import X.C098200Yq;
import X.C0OM1;
import X.C0VWN;
import X.C1246860iYG;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1266190j3R;
import X.C1308910kAL;
import X.C15438062q;
import X.C1581030rFF;
import X.C1685300txQ;
import X.C1846060y8i;
import X.C189200o6;
import X.C1900870zZ7;
import X.C1902480zbi;
import X.C1905930zhH;
import X.C19EG;
import X.C19GS;
import X.C20277814Wa;
import X.C20642515q3;
import X.C21594419fC;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1253240iiY;
import X.InterfaceC1581830rGX;
import X.InterfaceC21503819Do;
import X.InterfaceC836760Ws6;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.inbox.followerv2.InboxFollowerFragmentV2;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.IGatekeeperService;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.networkservice.DecisionMakerNetworkApi;
import com.ss.android.ugc.aweme.service.IAutomaticPageStayTimeService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
@InterfaceC836760Ws6
public final class InboxNewFollowerTabFragment extends BaseFragment implements InterfaceC21503819Do, InterfaceC1581830rGX, InterfaceC1253240iiY {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiwiKyArZispPik8JCHELIOSkjPiohOCQrLGEaJicjMQE2PwMjJSM8PyA+HS4xDjctLiI2JjE=";
    public C21594419fC LLIZ;
    public TuxNavBar LLIZLLLIL;
    public C1846060y8i LLJ;
    public boolean LLJILJIL;
    public final List<C1902480zbi> LLJI = new ArrayList();
    public final String LLJIJIL = C20642515q3.LJI(2131834932);
    public String LLJILJILJ = "click";

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void FE(Bundle bundle) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void Q9(Activity activity) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void WK(boolean z) {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ap() {
    }

    @Override // X.InterfaceC1581830rGX
    public final String getPageName() {
        return "new_followers";
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void onActivityFinish() {
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyDown(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyLongPress(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ Boolean onActivityKeyUp(int i, KeyEvent keyEvent) {
        return null;
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void tv() {
        C20277814Wa.LIZIZ(this);
    }

    @Override // X.InterfaceC21503819Do
    public final /* synthetic */ void ur(int i, int i2, Intent intent) {
        C20277814Wa.LIZ(this, i, i2, intent);
    }

    public final C21594419fC SR() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.viewpager) : null;
            this.LLIZ = (C21594419fC) viewFindViewById;
        }
        return (C21594419fC) viewFindViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C1900870zZ7.LIZ = null;
        C1900870zZ7.LIZIZ = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C1900870zZ7.LIZ = "new_followers";
        C1900870zZ7.LIZIZ = "new_followers";
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        activityConfiguration(AFwS271S0000000_28.get$arr$(110));
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        NR(AFwS271S0000000_28.get$arr$(111));
        C1246860iYG c1246860iYG = C1246860iYG.LIZ;
        Bundle arguments = getArguments();
        c1246860iYG.getClass();
        C1246860iYG.LIZIZ(this, arguments, 0);
        IAutomaticPageStayTimeService.LIZ.getClass();
        C1581030rFF.LIZIZ(this, "new_follower_page");
    }

    @Override // X.InterfaceC21503819Do
    public final void qO(Intent intent) {
        C1246860iYG c1246860iYG = C1246860iYG.LIZ;
        Bundle arguments = getArguments();
        c1246860iYG.getClass();
        C1246860iYG.LIZIZ(this, arguments, 0);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        DecisionMakerNetworkApi.EligibilityModel eligibilityModelLIZ;
        Integer numLIZJ;
        super.onViewCreated(view, bundle);
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_arrow_left_ltr;
        c1251150ifB.LIZJ(new AwS572S0100000_28(this, 698));
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = getString(2131836049);
        IGatekeeperService iGatekeeperService = (IGatekeeperService) PluggableExtentionKt.pluggableSpi$default(IGatekeeperService.class, false, false, false, 14, null);
        View viewFindViewById = null;
        if (iGatekeeperService != null) {
            eligibilityModelLIZ = iGatekeeperService.LIZ("follower_request_transparency");
        } else {
            eligibilityModelLIZ = null;
        }
        C1905930zhH.LIZ.getClass();
        if (C1905930zhH.LIZ(eligibilityModelLIZ)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(getString(2131836049));
            sbLIZ.append(' ');
            c1250250idj.LIZJ = C2188811AlT.LIZIZ(sbLIZ);
            c1250250idj.LJFF = R.raw.icon_info_circle;
            c1250250idj.LJI = null;
            c1250250idj.LIZ(new AwS572S0100000_28(eligibilityModelLIZ, 697));
        }
        View viewFindViewById2 = this.LLIZLLLIL;
        if (viewFindViewById2 == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById2 = view2.findViewById(R.id.p15);
            } else {
                viewFindViewById2 = null;
            }
            this.LLIZLLLIL = (TuxNavBar) viewFindViewById2;
        }
        TuxNavBar tuxNavBar = (TuxNavBar) viewFindViewById2;
        C0OM1 c0om1 = new C0OM1();
        c0om1.LJ(c1251150ifB);
        c0om1.LIZJ = c1250250idj;
        c0om1.LIZLLL = false;
        tuxNavBar.setNavActions(c0om1);
        Context context = getContext();
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.uk, context)) != null) {
            tuxNavBar.setNavBackground(numLIZJ.intValue());
        }
        List<C1902480zbi> list = this.LLJI;
        InboxFollowerFragmentV2 inboxFollowerFragmentV2 = new InboxFollowerFragmentV2();
        inboxFollowerFragmentV2.setArguments(getArguments());
        ((ArrayList) list).add(new C1902480zbi(inboxFollowerFragmentV2, getString(R.string.jqq)));
        View viewFindViewById3 = this.LLJ;
        if (viewFindViewById3 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById3 = view3.findViewById(R.id.wx3);
            } else {
                viewFindViewById3 = null;
            }
            this.LLJ = (C1846060y8i) viewFindViewById3;
        }
        C786410Ut5.LLZLI((C1846060y8i) viewFindViewById3, 8);
        SR().setScrollContainer(false);
        List<C1902480zbi> list2 = this.LLJI;
        final ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
        Iterator it2 = ((ArrayList) list2).iterator();
        while (it2.hasNext()) {
            arrayList.add(((C1902480zbi) it2.next()).LIZ);
        }
        List<C1902480zbi> list3 = this.LLJI;
        final ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list3, 10));
        Iterator it3 = ((ArrayList) list3).iterator();
        while (it3.hasNext()) {
            arrayList2.add(((C1902480zbi) it3.next()).LIZIZ);
        }
        final FragmentManager fragmentManagerRequireFragmentManager = requireFragmentManager();
        getLifecycle();
        SR().setAdapter(new AbstractC480470Isn(arrayList, arrayList2, fragmentManagerRequireFragmentManager) { // from class: X.0HFO
            public final List<Fragment> LLIZ;
            public final List<String> LLIZLLLIL;

            @Override // androidx.viewpager.widget.PagerAdapter
            public final int getCount() {
                return this.LLIZ.size();
            }

            @Override // androidx.viewpager.widget.PagerAdapter
            public final CharSequence LJIJJLI(int i) {
                return (CharSequence) ListProtector.get(this.LLIZLLLIL, i);
            }

            @Override // X.AbstractC480470Isn
            public final Fragment LJJIJIL(int i) {
                return (Fragment) ListProtector.get(this.LLIZ, i);
            }

            {
                super(fragmentManagerRequireFragmentManager, 0);
                this.LLIZ = arrayList;
                this.LLIZLLLIL = arrayList2;
            }
        });
        View view4 = this.LLJ;
        if (view4 == null) {
            View view5 = getView();
            if (view5 != null) {
                viewFindViewById = view5.findViewById(R.id.wx3);
            }
            this.LLJ = (C1846060y8i) viewFindViewById;
            view4 = viewFindViewById;
        }
        C1846060y8i.LJIJI((C1846060y8i) view4, SR());
        SR().addOnPageChangeListener(new C1266190j3R(this, 4));
        C0VWN.LIZ("inbox_follower_tab_page", false).LJIIIZ(SR());
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.a5l, viewGroup, false);
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
