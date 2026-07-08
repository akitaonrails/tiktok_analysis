package com.bytedance.android.livesdk.sheet;

import X.C01GW;
import X.C0IJT;
import X.C0IPN;
import X.C1143680frq;
import X.C162100jj;
import X.C452501pT;
import X.C474500IjA;
import X.C475510Ikn;
import X.C786410Ut5;
import X.InterfaceC474360Iiw;
import Y.ACListenerS142S0100000_7;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.keva.Keva;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveRepostGuideFragment extends LiveSheetFragment {
    public static final C01GW<Keva> LLL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(90));
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9HELIOSOy0pLDt9BCw6LB02OCo/PQgmISEpDz0yLygpJzs=";
    public final InterfaceC474360Iiw LLJLLL;
    public final String LLJZ;
    public final Map<String, String> LLJZIJLIL;

    public final void uS(String str) {
        long followStatus;
        User owner;
        FollowInfo followInfo;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_repost_educate_panel_click");
        c474500IjALIZ.LJJII(this.LLJZ, "panel_source");
        c474500IjALIZ.LJJII(str, "action");
        Map<String, String> map = this.LLJZIJLIL;
        if (map != null) {
            c474500IjALIZ.LJJIIZI(map);
        } else {
            DataChannel dataChannelLJ = C475510Ikn.LJ(this);
            Room roomLIZ = C162100jj.LIZ(dataChannelLJ);
            if (roomLIZ != null && (owner = roomLIZ.getOwner()) != null && (followInfo = owner.getFollowInfo()) != null) {
                followStatus = followInfo.getFollowStatus();
            } else {
                followStatus = 0;
            }
            c474500IjALIZ.LJJII(String.valueOf(followStatus), "follow_status");
            c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
            c474500IjALIZ.LJIJJLI(dataChannelLJ);
        }
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        long followStatus;
        User owner;
        FollowInfo followInfo;
        super.onViewCreated(view, bundle);
        C786410Ut5.I7(new ACListenerS142S0100000_7(this, 104), view.findViewById(R.id.ta9));
        C786410Ut5.I7(new ACListenerS142S0100000_7(this, 105), view.findViewById(R.id.ta8));
        View viewFindViewById = view.findViewById(R.id.taa);
        if (viewFindViewById != null) {
            C1143680frq.LIZLLL(viewFindViewById, C0IPN.LIZ("tiktok_live_interaction_resource", "tiktok_live_interaction_demand_11"), "ttlive_repost_guide_bg.png");
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_repost_educate_panel_show");
        c474500IjALIZ.LJJII(this.LLJZ, "panel_source");
        Map<String, String> map = this.LLJZIJLIL;
        if (map != null) {
            c474500IjALIZ.LJJIIZI(map);
        } else {
            DataChannel dataChannelLJ = C475510Ikn.LJ(this);
            Room roomLIZ = C162100jj.LIZ(dataChannelLJ);
            if (roomLIZ != null && (owner = roomLIZ.getOwner()) != null && (followInfo = owner.getFollowInfo()) != null) {
                followStatus = followInfo.getFollowStatus();
            } else {
                followStatus = 0;
            }
            c474500IjALIZ.LJJII(String.valueOf(followStatus), "follow_status");
            c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
            c474500IjALIZ.LJIJJLI(dataChannelLJ);
        }
        c474500IjALIZ.LIZ();
    }

    public LiveRepostGuideFragment(InterfaceC474360Iiw interfaceC474360Iiw, String str, Map<String, String> map) {
        this.LLJLLL = interfaceC474360Iiw;
        this.LLJZ = str;
        this.LLJZIJLIL = map;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.hku, viewGroup, false);
    }
}
