package com.bytedance.android.livesdk.game.broadcast.fragment;

import X.C098200Yq;
import X.C0IGR;
import X.C0IP3;
import X.C0JDJ;
import X.C1143680frq;
import X.C1685300txQ;
import X.C189200o6;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C465220IMe;
import X.C475510Ikn;
import X.C786410Ut5;
import Y.ACListenerS142S0100000_7;
import Y.ACListenerS71S0110000_7;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.livesdk.dataChannel.LiveDualDeviceRetryFromClick;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final class GameDualDeviceWrongFragment extends BaseFragment implements C0JDJ, C0IGR {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LyQhLGExOiotLSHELIOSwyOzFiLz0yLygpJzt9DyQhLAsmKSkILDk6KyAbOyA9LwM+KCg+LSs4";
    public View LL;
    public View LLILLJJLI;
    public View LLILLL;
    public View LLILZ;
    public DataChannel LLILZIL;
    public int LLILZLL;
    public Function1<? super Context, Unit> LLIZ;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, X.InterfaceC513210KAt
    public final /* synthetic */ int getThemeOverlay(Context context) {
        return C465220IMe.LIZ();
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment
    public final /* synthetic */ boolean isLight(Context context) {
        throw null;
    }

    @Override // X.C0IGR
    public final boolean onBackPressed() {
        return false;
    }

    public final void NR() {
        FragmentManager supportFragmentManager;
        C19EH c19ehLJIIJ;
        DataChannel dataChannel = this.LLILZIL;
        if (dataChannel != null) {
            dataChannel.LC0(LiveDualDeviceRetryFromClick.class, Boolean.TRUE);
        }
        C19EG activity = getActivity();
        if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null || (c19ehLJIIJ = supportFragmentManager.LJIIJ()) == null) {
            return;
        }
        c19ehLJIIJ.LJIIZILJ(this);
        c19ehLJIIJ.LJIIIZ();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        DataChannel dataChannelProvideDataChannel;
        String string;
        TextView textView;
        FragmentManager supportFragmentManager;
        List<Fragment> listLJJLIIIJL;
        super.onViewCreated(view, bundle);
        this.LL = view.findViewById(R.id.epc);
        this.LLILLL = view.findViewById(R.id.wrong_back);
        this.LLILLJJLI = view.findViewById(R.id.wrong_btn);
        this.LLILZ = view.findViewById(R.id.wrong_icon);
        C0IP3 c0ip3LIZIZ = C475510Ikn.LIZIZ(getActivity());
        if (c0ip3LIZIZ != null) {
            dataChannelProvideDataChannel = c0ip3LIZIZ.provideDataChannel();
        } else {
            dataChannelProvideDataChannel = null;
        }
        this.LLILZIL = dataChannelProvideDataChannel;
        C19EG activity = getActivity();
        boolean z = false;
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null && (listLJJLIIIJL = supportFragmentManager.LJJLIIIJL()) != null && listLJJLIIIJL.size() == 1) {
            z = true;
        }
        View view2 = this.LLILLJJLI;
        if (view2 != null) {
            C786410Ut5.I7(new ACListenerS71S0110000_7(this, z, 0), view2);
        }
        View view3 = this.LLILLL;
        if (view3 != null) {
            C786410Ut5.I7(new ACListenerS142S0100000_7(this, 63), view3);
        }
        C1143680frq.LIZLLL(this.LLILZ, "tiktok_live_game_demand_2", "ttlive_dual_device_wrong_icon.png");
        Bundle arguments = getArguments();
        if (arguments != null && (string = arguments.getString("error_msg")) != null && (textView = (TextView) view.findViewById(R.id.wrong_tip)) != null) {
            textView.setText(string);
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            this.LLILZLL = Integer.valueOf(arguments2.getInt("cast_scene_key")).intValue();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.ge0, viewGroup, false);
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
