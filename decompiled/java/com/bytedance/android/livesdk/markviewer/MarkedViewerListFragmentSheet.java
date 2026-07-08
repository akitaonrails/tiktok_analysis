package com.bytedance.android.livesdk.markviewer;

import X.AbstractC21673619ry;
import X.C01GW;
import X.C036E;
import X.C0IJT;
import X.C0J1N;
import X.C0UO0;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1119170fEJ;
import X.C11RD;
import X.C11RK;
import X.C14KS;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C19475711Hn;
import X.C292401Bi;
import X.C474500IjA;
import X.C475510Ikn;
import X.C476130Iln;
import X.C482260Ivg;
import X.C500260Jjc;
import X.C766270U4b;
import X.C786410Ut5;
import X.EnumC748580TYa;
import Y.ACListenerS147S0100000_12;
import Y.AfS181S0100000_12;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdk.chatroom.ui.SSLinearLayoutManager;
import com.bytedance.android.livesdk.dataChannel.BroadcastDialogPageChannel;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.usermanage.MarkUserApi;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AwS556S0100000_12;
import wh6.AbS694S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class MarkedViewerListFragmentSheet extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9JSQ+Ijk6HELIOSLTIpO2EeKTcnLCsFISA7LD0fITY4Dz0yLygpJzsAICApPQ==";
    public View LLL;
    public final C01GW LLJLLL = C292401Bi.LIZ(new AwS556S0100000_12(this, 318));
    public final C01GW LLJZ = C292401Bi.LIZ(new AwS556S0100000_12(this, 314));
    public final C01GW LLJZIJLIL = C292401Bi.LIZ(new AwS556S0100000_12(this, 319));
    public boolean LLLF = true;
    public final C01GW LLLFF = C292401Bi.LIZ(new AwS556S0100000_12(this, 316));
    public final C01GW LLLFFI = C292401Bi.LIZ(new AwS556S0100000_12(this, 315));
    public final C01GW LLLFZ = C292401Bi.LIZ(new AwS556S0100000_12(this, 317));

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        return null;
    }

    public final void refresh() {
        RecyclerView recyclerView = (RecyclerView) this.LLJLLL.getValue();
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new SSLinearLayoutManager(getContext(), 1));
        }
        RecyclerView recyclerView2 = (RecyclerView) this.LLJLLL.getValue();
        if (recyclerView2 != null) {
            recyclerView2.setAdapter((AbstractC21673619ry) this.LLLFZ.getValue());
        }
        uS();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_admin_list_show");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
    }

    public final void yS() {
        LiveMode liveMode;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_mark_viewer_pannel_add_click");
        c474500IjALIZ.LJIJJLI(C475510Ikn.LJ(this));
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        c474500IjALIZ.LJJ((dataChannelLJ == null || (liveMode = (LiveMode) dataChannelLJ.gg0(LiveModeChannel.class)) == null) ? null : liveMode.logStreamingType);
        c474500IjALIZ.LIZ();
        if (this.LLJL != null) {
            this.LLJJIJIL.LJIIIZ(AddMarkedViewerFragmentSheet.class, "add_marked_viewer", null, null);
            return;
        }
        DataChannel dataChannelLJ2 = C475510Ikn.LJ(this);
        if (dataChannelLJ2 != null) {
            EnumC748580TYa enumC748580TYa = EnumC748580TYa.ADD_MARKED_VIEWER;
            enumC748580TYa.next();
            dataChannelLJ2.zW(BroadcastDialogPageChannel.class, enumC748580TYa);
        }
    }

    public final void uS() {
        getContext();
        try {
            if (C036E.LIZ.LIZIZ()) {
                ((C0J1N) ((MarkUserApi) C482260Ivg.LIZJ(MarkUserApi.class)).fetchMarkedUserList().LJIILIIL(new C0UO0()).LIZJ(C11RD.LIZLLL(this))).LIZ(new AfS181S0100000_12(this, 110), new AfS181S0100000_12(this, 111));
                return;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C766270U4b.LJFF(2131843092, getContext());
    }

    public final void BS(boolean z) {
        if (z) {
            C500260Jjc.LLFFF((View) this.LLJZIJLIL.getValue());
            C1749280vcc c1749280vcc = (C1749280vcc) this.LLJZIJLIL.getValue();
            if (c1749280vcc != null) {
                c1749280vcc.setStatus((C1722300uv6) this.LLLFFI.getValue());
            }
        } else {
            C500260Jjc.LJIILIIL((View) this.LLJZIJLIL.getValue());
        }
        zS(true);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(2, null);
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        getActivity();
        return layoutInflaterOnGetLayoutInflater;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10501, "com/bytedance/android/livesdk/markviewer/MarkedViewerListFragmentSheet", "onHiddenChanged", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl5ith3F5psQjtNhRrRgwoRcFOTXy2/TjNaddiu5eN2ScjOn8aEGAVMQ==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.onHiddenChanged(z);
        if (!z) {
            C500260Jjc.LJIILIIL((View) this.LLJLLL.getValue());
            refresh();
        }
    }

    public final void wS(String str) {
        String str2;
        LiveMode liveMode;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_empty_mark_viewer");
        c474500IjALIZ.LJIJJLI(C475510Ikn.LJ(this));
        c474500IjALIZ.LJ(str);
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null && (liveMode = (LiveMode) dataChannelLJ.gg0(LiveModeChannel.class)) != null) {
            str2 = liveMode.logStreamingType;
        } else {
            str2 = null;
        }
        c474500IjALIZ.LJJ(str2);
        c474500IjALIZ.LJJII("mark_viewer_page", "enter_from_page");
        c474500IjALIZ.LIZ();
    }

    public final void zS(boolean z) {
        if (!C500260Jjc.LJJJIL(C475510Ikn.LJ(this)) && z) {
            C500260Jjc.LLFFF((View) this.LLJZ.getValue());
        } else {
            C500260Jjc.LJIILLIIL((View) this.LLJZ.getValue());
        }
        View view = (View) this.LLJZ.getValue();
        if (view != null) {
            C786410Ut5.I7(new ACListenerS147S0100000_12(this, 211), view);
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        ViewGroup.LayoutParams layoutParams;
        LiveMode liveMode;
        super.onViewCreated(view, bundle);
        this.LLL = view.findViewById(R.id.bmy);
        zS(false);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_mark_viewer_panel_show");
        c474500IjALIZ.LJIJJLI(C475510Ikn.LJ(this));
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null && (liveMode = (LiveMode) dataChannelLJ.gg0(LiveModeChannel.class)) != null) {
            str = liveMode.logStreamingType;
        } else {
            str = null;
        }
        c474500IjALIZ.LJJ(str);
        c474500IjALIZ.LIZ();
        C786410Ut5.I7(new AbS694S0100000_12(this, 23), view.findViewById(R.id.cq9));
        View view2 = this.LLL;
        if (view2 != null) {
            C786410Ut5.I7(new AbS694S0100000_12(this, 24), view2);
        }
        if (this.LLJL == null && (layoutParams = view.findViewById(R.id.tqy).getLayoutParams()) != null) {
            layoutParams.height = (int) (((double) C14KS.LIZLLL()) * 0.6d);
            C786410Ut5.W5(view, layoutParams);
        }
        refresh();
        C11RK<Pair<Long, Boolean>> c11rk = C476130Iln.LIZ;
        c11rk.getClass();
        ((C0J1N) new C19475711Hn(c11rk).LIZJ(C11RD.LIZLLL(this))).LIZJ(new AfS181S0100000_12(this, 112));
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.g8e, viewGroup, false);
    }
}
