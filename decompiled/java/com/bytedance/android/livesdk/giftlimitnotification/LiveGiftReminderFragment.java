package com.bytedance.android.livesdk.giftlimitnotification;

import X.C098200Yq;
import X.C0IJT;
import X.C0IPN;
import X.C1143680frq;
import X.C1685300txQ;
import X.C16F5;
import X.C16FS;
import X.C16FZ;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C20743716Ff;
import X.C250000xu;
import X.C474500IjA;
import X.C475510Ikn;
import X.C497740JfY;
import X.C500260Jjc;
import X.C513601zK;
import X.C748880TZe;
import X.C766270U4b;
import X.C786410Ut5;
import X.ViewOnClickListenerC512201z6;
import Y.ACListenerS147S0100000_12;
import Y.AObserverS216S0100000_12;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveGiftReminderFragment extends BaseFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LywqPSM6JSw4HELIOSJyAnISMlKi4nISoiZwM6PiALICknGiAhICE3LTcKOy40JSAiPQ==";
    public C20743716Ff LL;
    public LinearLayout LLILLJJLI;
    public C16F5 LLILLL;
    public C16F5 LLILZ;
    public C16FZ LLILZIL;
    public ScrollView LLILZLL;
    public ScrollView LLIZ;
    public C16FS LLIZLLLIL;
    public FrameLayout LLJ;
    public FrameLayout LLJI;
    public AppCompatImageView LLJIJIL;
    public AppCompatImageView LLJILJIL;
    public int LLJILJILJ;
    public int LLJILLL;
    public final String LLJJ = "sslocal://webcast_webview_popup?height=718rpx&radius=16rpx&use_spark=1&url=https%3A%2F%2Finapp.tiktokv.com%2Flive%2Fmonetization%2Fgift%2Fgifting-prompt%2Ffaq";

    public final void NR() {
        FragmentManager fragmentManager;
        C250000xu.LIZ.getClass();
        if (C250000xu.LJJIIZ) {
            C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131841958));
            return;
        }
        GiftLimitSettingAmountDialog giftLimitSettingAmountDialog = new GiftLimitSettingAmountDialog();
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ == null || (fragmentManager = (FragmentManager) dataChannelLJ.gg0(C748880TZe.class)) == null) {
            return;
        }
        giftLimitSettingAmountDialog.show(fragmentManager, "GiftLimitSettingAmountDialog");
    }

    public final C16FZ OR() {
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.j03) : null;
            this.LLILZIL = (C16FZ) viewFindViewById;
        }
        return (C16FZ) viewFindViewById;
    }

    public final C20743716Ff PR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.j05) : null;
            this.LL = (C20743716Ff) viewFindViewById;
        }
        return (C20743716Ff) viewFindViewById;
    }

    public final C16F5 RR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.t5l) : null;
            this.LLILLL = (C16F5) viewFindViewById;
        }
        return (C16F5) viewFindViewById;
    }

    public final LinearLayout SR() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.uus) : null;
            this.LLILLJJLI = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLILZLL = null;
        this.LLIZ = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
        this.LLJI = null;
        this.LLJIJIL = null;
        this.LLJILJIL = null;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        getActivity();
        return layoutInflaterOnGetLayoutInflater;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        super.onViewCreated(view, bundle);
        C20743716Ff c20743716FfPR = PR();
        C250000xu.LIZ.getClass();
        Integer value = C250000xu.LJJIIZI.getValue();
        int i = 0;
        if (value != null && value.intValue() == 1) {
            z = true;
        } else {
            z = false;
        }
        c20743716FfPR.setChecked(z);
        LinearLayout linearLayoutSR = SR();
        if (!PR().isChecked()) {
            i = 8;
        }
        C786410Ut5.LJZL(i, linearLayoutSR);
        View viewFindViewById = this.LLJIJIL;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.t5s);
            } else {
                viewFindViewById = null;
            }
            this.LLJIJIL = (AppCompatImageView) viewFindViewById;
        }
        C1143680frq.LIZLLL(viewFindViewById, C0IPN.LIZ("tiktok_live_interaction_resource", "tiktok_live_revenue_demand_1"), "ttlive_gift_limit_notification.png");
        View viewFindViewById3 = this.LLJILJIL;
        if (viewFindViewById3 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById3 = view3.findViewById(R.id.iya);
            } else {
                viewFindViewById3 = null;
            }
            this.LLJILJIL = (AppCompatImageView) viewFindViewById3;
        }
        C1143680frq.LIZLLL(viewFindViewById3, C0IPN.LIZ("tiktok_live_interaction_resource", "tiktok_live_revenue_demand_1"), "ttlive_gift_limit_error_refresh.png");
        C786410Ut5.k8(PR(), new ViewOnClickListenerC512201z6(this, 35));
        PR().setOnTouchListener(new View.OnTouchListener() { // from class: X.0TXs
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view4, MotionEvent motionEvent) {
                if (motionEvent.getActionMasked() == 2) {
                    return true;
                }
                return false;
            }
        });
        View viewFindViewById4 = this.LLJ;
        if (viewFindViewById4 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById4 = view4.findViewById(R.id.bmy);
            } else {
                viewFindViewById4 = null;
            }
            this.LLJ = (FrameLayout) viewFindViewById4;
        }
        FrameLayout frameLayout = (FrameLayout) viewFindViewById4;
        int i2 = this.LLJILJILJ;
        if (i2 != 0) {
            if (i2 == 1) {
                C500260Jjc.LLFFF(frameLayout);
                C786410Ut5.O7(frameLayout, new ACListenerS147S0100000_12(this, 400));
            }
        } else {
            C786410Ut5.LJZ(4, frameLayout);
        }
        C786410Ut5.R7(SR(), new ViewOnClickListenerC512201z6(this, 52));
        View view5 = this.LLJI;
        if (view5 == null) {
            View view6 = getView();
            if (view6 != null) {
                viewFindViewById2 = view6.findViewById(R.id.hof);
            }
            this.LLJI = (FrameLayout) viewFindViewById2;
            view5 = viewFindViewById2;
        }
        C786410Ut5.O7((FrameLayout) view5, new ViewOnClickListenerC512201z6(this, 53));
        C250000xu.LJJIIZI.observe(this, new AObserverS216S0100000_12(this, 104));
        C250000xu.LJJ.observe(this, new C513601zK(this, 48));
        C250000xu.LJJIJ.observe(this, new AObserverS216S0100000_12(this, 103));
        boolean zLJ = C250000xu.LJ();
        String str = C250000xu.LJJIJIIJI;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gift_limit_notification_panel_show");
        c474500IjALIZ.LJJII(Integer.valueOf(zLJ ? 1 : 0), "is_anchor");
        c474500IjALIZ.LJJII(str, "first_panel_from");
        c474500IjALIZ.LJJII("basic", "reminder_type");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19GS c19gs;
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.goa, viewGroup, false);
        if (this.LLJILJILJ == 0) {
            this.LLJILLL = 359;
        } else {
            this.LLJILLL = 440;
        }
        C786410Ut5.W5(viewTd, new ViewGroup.LayoutParams(-1, (int) C497740JfY.LIZIZ(this.LLJILLL)));
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
