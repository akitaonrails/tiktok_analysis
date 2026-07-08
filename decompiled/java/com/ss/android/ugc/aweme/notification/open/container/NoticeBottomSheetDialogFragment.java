package com.ss.android.ugc.aweme.notification.open.container;

import X.C01GW;
import X.C098200Yq;
import X.C0DTR;
import X.C0H53;
import X.C0OM1;
import X.C1250250idj;
import X.C1251150ifB;
import X.C14KQ;
import X.C1685300txQ;
import X.C1749280vcc;
import X.C189200o6;
import X.C1901860zai;
import X.C1901910zan;
import X.C1901980zau;
import X.C19EG;
import X.C19GS;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1902000zaw;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService;
import com.ss.android.ugc.aweme.notice.api.bean.NoticeContainerParam;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class NoticeBottomSheetDialogFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZisjPSY1ISYtPSY8JmsjOSo9HELIOSZiYjJzsyISspO2EdJzElKioRJzE4JiIAICApPQs6KSkjLgkhKSIhLCEn";
    public C1749280vcc LLIZ;
    public ViewOnAttachStateChangeListenerC20604515jv LLIZLLLIL;
    public TuxNavBar LLJ;
    public ValueAnimator LLJI;
    public C1901980zau LLJIJIL;
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 327));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 325));
    public final C01GW LLJILLL = C0DTR.LIZJ(new AwS572S0100000_28(this, 326));
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 324));

    public final NoticeContainerParam SR() {
        return (NoticeContainerParam) this.LLJILJILJ.getValue();
    }

    public final C1749280vcc UR() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.w28) : null;
            this.LLIZ = (C1749280vcc) viewFindViewById;
        }
        return (C1749280vcc) viewFindViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((C0H53) this.LLJILLL.getValue()).LIZJ();
        ValueAnimator valueAnimator = this.LLJI;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LLJI = null;
        if (SR().biz == EnumC1902000zaw.FRIENDS) {
            ((IFriendsFeedService) ServiceManager.get().getService(IFriendsFeedService.class)).R1(false);
        }
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((C0H53) this.LLJILLL.getValue()).LIZ();
        C1251150ifB c1251150ifB = new C1251150ifB();
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_chevron_expand;
        c419910GdJ.LJI = getString(2131834298);
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22));
        c1251150ifB.LIZLLL();
        c1251150ifB.LJ = c419910GdJ;
        c1251150ifB.LJI = true;
        c1251150ifB.LIZIZ = "expand";
        c1251150ifB.LIZJ(new AwS550S0100000_6(this, 1458));
        C1251150ifB c1251150ifB2 = new C1251150ifB();
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZ = R.raw.icon_x_mark;
        c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        c1251150ifB2.LIZLLL();
        c1251150ifB2.LJ = c419910GdJ2;
        c1251150ifB2.LIZLLL = true;
        c1251150ifB2.LIZIZ = "close";
        c1251150ifB2.LIZJ(new AwS550S0100000_6(this, 1459));
        View viewFindViewById = this.LLJ;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.p15);
            } else {
                viewFindViewById = null;
            }
            this.LLJ = (TuxNavBar) viewFindViewById;
        }
        C0OM1 c0om1 = new C0OM1();
        c0om1.LJ(c1251150ifB);
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = C1901910zan.LIZ(SR().biz).LIZJ;
        c0om1.LIZJ = c1250250idj;
        c0om1.LIZIZ(c1251150ifB2);
        ((TuxNavBar) viewFindViewById).setNavActions(c0om1);
        C1901980zau c1901980zau = new C1901980zau(this, (C1901860zai) this.LLJJ.getValue());
        View view3 = this.LLIZLLLIL;
        if (view3 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById2 = view4.findViewById(R.id.rn0);
            }
            this.LLIZLLLIL = (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById2;
            view3 = viewFindViewById2;
        }
        ((ViewOnAttachStateChangeListenerC20604515jv) view3).LIZJ(c1901980zau);
        this.LLJIJIL = c1901980zau;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.a8w, viewGroup, false);
        ViewGroup.LayoutParams layoutParams = viewTd.getLayoutParams();
        Context context = getContext();
        int iLJIIIIZZ = C14KQ.LJIIIIZZ(context);
        int iLJ = C14KQ.LJ(context);
        if (iLJIIIIZZ <= iLJ) {
            iLJIIIIZZ = iLJ;
        }
        layoutParams.height = (int) (0.73d * ((double) iLJIIIIZZ));
        try {
            ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewTd, this);
            viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            } else {
                c19gs = null;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewTd;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return viewTd;
        }
    }
}
