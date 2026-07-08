package com.bytedance.android.livesdk.adminsetting;

import X.C01GW;
import X.C0IJT;
import X.C1119170fEJ;
import X.C1143680frq;
import X.C1911200zpm;
import X.C20736316Cj;
import X.C292401Bi;
import X.C474500IjA;
import X.C475510Ikn;
import X.C497740JfY;
import X.C500060JjI;
import X.C510160Jza;
import X.C758170Tod;
import X.C786180Usi;
import X.C786410Ut5;
import Y.ACListenerS147S0100000_12;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class MarkViewerNotionFragment extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KSEhICHELIOSEgLTE4ICE0ZggtOyQFISA7LD0dJzElJiEVOiQrJCo9PA==";
    public final C01GW LLJLLL = C292401Bi.LIZ(AFwS199S0000000_12.get$arr$(44));

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        return null;
    }

    public final boolean uS() {
        return ((Boolean) this.LLJLLL.getValue()).booleanValue();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C500060JjI cS() {
        if (!uS()) {
            return null;
        }
        C500060JjI c500060JjI = new C500060JjI();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C510160Jza(C497740JfY.LJIJI(2131853655), R.style.a7g, new C786180Usi(this, 4)));
        c500060JjI.LIZ(arrayList);
        return c500060JjI;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        if (!uS()) {
            return null;
        }
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        c1119170fEJ.LJI = false;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C758170Tod(R.attr.eo4, new ACListenerS147S0100000_12(this, 125)));
        c1119170fEJ.LJFF = arrayList;
        return c1119170fEJ;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        if (!uS()) {
            return C20736316Cj.LIZIZ(R.attr.exj, context);
        }
        return C1911200zpm.LIZ(context);
    }

    public final void wS(String str) {
        String str2;
        LiveMode liveMode;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_mark_viewer_guide_sheet");
        c474500IjALIZ.LJIJJLI(C475510Ikn.LJ(this));
        c474500IjALIZ.LJJII(str, "action_type");
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        String string = null;
        if (dataChannelLJ != null && (liveMode = (LiveMode) dataChannelLJ.gg0(LiveModeChannel.class)) != null) {
            str2 = liveMode.logStreamingType;
        } else {
            str2 = null;
        }
        c474500IjALIZ.LJJ(str2);
        Bundle arguments = getArguments();
        if (arguments != null) {
            string = arguments.getString("enter_from");
        }
        c474500IjALIZ.LJJII(string, "enter_from_page");
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (uS()) {
            C1143680frq.LIZLLL(view.findViewById(R.id.l_c), "tiktok_live_broadcast_demand_7", "ttlive_mark_viewer_notion.png");
        }
        wS("show");
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (uS()) {
            return C786410Ut5.Td(layoutInflater, R.layout.hlt, viewGroup, false);
        }
        return C786410Ut5.Td(layoutInflater, R.layout.hls, viewGroup, false);
    }
}
