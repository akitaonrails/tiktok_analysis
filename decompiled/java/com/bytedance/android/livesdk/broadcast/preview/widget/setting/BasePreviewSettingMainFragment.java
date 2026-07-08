package com.bytedance.android.livesdk.broadcast.preview.widget.setting;

import X.C098200Yq;
import X.C0IJT;
import X.C0UVE;
import X.C1133830fbx;
import X.C1548820qPI;
import X.C1685300txQ;
import X.C16F5;
import X.C1871910yoP;
import X.C189200o6;
import X.C19EG;
import X.C19GO;
import X.C19GS;
import X.C20337914i1;
import X.C20743716Ff;
import X.C2097608Jq;
import X.C262100zr;
import X.C2843018f;
import X.C354201Zc;
import X.C474500IjA;
import X.C475510Ikn;
import X.C497740JfY;
import X.C500980Jkm;
import X.C758920Tpq;
import X.C786410Ut5;
import X.DialogInterfaceOnClickListenerC786020UsS;
import X.EnumC2636010g;
import X.InterfaceC1106030et7;
import X.InterfaceC1107590evd;
import X.InterfaceC1141530foN;
import X.InterfaceC1294060jmO;
import X.InterfaceC500940Jki;
import Y.ACListenerS147S0100000_12;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.broadcast.ViolationStatusChannel;
import com.bytedance.android.livesdk.broadcast.preview.base.BasePreviewFragment;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.livesetting.roomfunction.LowAgeAnchorLimitSetting;
import com.bytedance.android.livesdk.model.message.PerceptionDialogInfo;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.u;
import tikcast.api.perception.ViolationStatusResponse;

/* JADX INFO: loaded from: classes13.dex */
@InterfaceC1294060jmO
public final class BasePreviewSettingMainFragment extends BasePreviewFragment implements InterfaceC1141530foN {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KjcjKCswKTY4Zz8hLTMlLDHELIOSh9PywoLionZjYpPTs6JiJiCy4gLRU+LDk6LTIfLDsnISsrBC46JgM+KCg+LSs4";
    public LinearLayout LL;
    public LinearLayout LLILLJJLI;
    public C20743716Ff LLILLL;
    public C16F5 LLILZ;
    public LinearLayout LLILZIL;
    public C20743716Ff LLILZLL;
    public LiveIconView LLIZ;
    public LinearLayout LLIZLLLIL;
    public View LLJ;
    public LinearLayout LLJI;
    public LinearLayout LLJIJIL;
    public View LLJILJIL;
    public LinearLayout LLJILJILJ;
    public View LLJILLL;
    public LinearLayout LLJJ;
    public C16F5 LLJJI;
    public C16F5 LLJJIII;
    public View LLJJIJI;
    public C20743716Ff LLJJIJIIJIL;
    public LiveIconView LLJJIJIL;
    public C16F5 LLJJJ;
    public C16F5 LLJJJIL;
    public LinearLayout LLJJJJ;
    public C20743716Ff LLJJJJJIL;
    public LinearLayout LLJJJJLIIL;
    public LinearLayout LLJJL;
    public View LLJJLIIIJLLLLLLLZ;
    public LinearLayout LLJL;
    public View LLJLIL;
    public LinearLayout LLJLILLLLZIIL;
    public C20743716Ff LLJLL;
    public LiveIconView LLJLLIL;
    public C16F5 LLJLLL;
    public C16F5 LLJZ;
    public LinearLayout LLJZIJLIL;
    public C20743716Ff LLL;
    public int LLLF;
    public boolean LLLFF;
    public boolean LLLFFI;
    public boolean LLLFZ = true;
    public boolean LLLI;

    public static final class NotionFragment extends LiveDialogFragment {
        public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KjcjKCswKTY4Zz8hLTMlLDh9PywoLionHELIOSZjYpPTs6JiJiCy4gLRU+LDk6LTIfLDsnISsrBC46JgM+KCg+LSs4bQE8PCwjJwkhKSIhLCEn";
        public View LL;
        public LiveIconView LLILLJJLI;

        @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
        public final boolean isSheet() {
            return true;
        }

        @Override // com.bytedance.android.livesdk.LiveDialogFragment
        public final C500980Jkm createParams() {
            C500980Jkm c500980Jkm = new C500980Jkm(R.layout.hlu);
            c500980Jkm.LJII = 80;
            c500980Jkm.LJIIJ = -1;
            c500980Jkm.LJIIIZ = -1;
            return c500980Jkm;
        }

        @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
        public final void onDestroyView() {
            super.onDestroyView();
            this.LL = null;
            this.LLILLJJLI = null;
        }

        @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
        public final void onViewCreated(View view, Bundle bundle) {
            super.onViewCreated(view, bundle);
            View viewFindViewById = this.LL;
            View viewFindViewById2 = null;
            if (viewFindViewById == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById = view2.findViewById(R.id.fy1);
                } else {
                    viewFindViewById = null;
                }
                this.LL = viewFindViewById;
            }
            C786410Ut5.I7(new ACListenerS147S0100000_12(this, 160), viewFindViewById);
            View view3 = this.LLILLJJLI;
            if (view3 == null) {
                View view4 = getView();
                if (view4 != null) {
                    viewFindViewById2 = view4.findViewById(R.id.e26);
                }
                this.LLILLJJLI = (LiveIconView) viewFindViewById2;
                view3 = viewFindViewById2;
            }
            C786410Ut5.g8((LiveIconView) view3, new ACListenerS147S0100000_12(this, 161));
        }
    }

    public final Map<String, String> OR() {
        HashMap map = new HashMap();
        map.put("anchor_id", String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        map.put("event_page", "live_take_page");
        return map;
    }

    public final C20743716Ff RR() {
        View viewFindViewById = this.LLJJIJIIJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ako) : null;
            this.LLJJIJIIJIL = (C20743716Ff) viewFindViewById;
        }
        return (C20743716Ff) viewFindViewById;
    }

    public final View SR() {
        View viewFindViewById = this.LLJJIJI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.akt) : null;
            this.LLJJIJI = viewFindViewById;
        }
        return viewFindViewById;
    }

    public final C20743716Ff UR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ao2) : null;
            this.LLILLL = (C20743716Ff) viewFindViewById;
        }
        return (C20743716Ff) viewFindViewById;
    }

    public final C20743716Ff VR() {
        View viewFindViewById = this.LLILZLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.dcu) : null;
            this.LLILZLL = (C20743716Ff) viewFindViewById;
        }
        return (C20743716Ff) viewFindViewById;
    }

    public final View WR() {
        View viewFindViewById = this.LLJJLIIIJLLLLLLLZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ef8) : null;
            this.LLJJLIIIJLLLLLLLZ = viewFindViewById;
        }
        return viewFindViewById;
    }

    public final LinearLayout ZR() {
        View viewFindViewById = this.LLJJJJLIIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.g2l) : null;
            this.LLJJJJLIIL = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    public final C20743716Ff aS() {
        View viewFindViewById = this.LLJLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.ix6) : null;
            this.LLJLL = (C20743716Ff) viewFindViewById;
        }
        return (C20743716Ff) viewFindViewById;
    }

    public final LinearLayout bS() {
        View viewFindViewById = this.LLJIJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.kxf) : null;
            this.LLJIJIL = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    public final C20743716Ff cS() {
        View viewFindViewById = this.LLJJJJJIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.nz2) : null;
            this.LLJJJJJIL = (C20743716Ff) viewFindViewById;
        }
        return (C20743716Ff) viewFindViewById;
    }

    public final LinearLayout dS() {
        View viewFindViewById = this.LLJLILLLLZIIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.sr_) : null;
            this.LLJLILLLLZIIL = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    public final LinearLayout gS() {
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.video_quality_group) : null;
            this.LLILZIL = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        DataChannelGlobal.LLILZ.zQ2(this);
        C1548820qPI.LJIIIIZZ("live_goal_update_event", this);
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
        this.LLJILJILJ = null;
        this.LLJILLL = null;
        this.LLJJ = null;
        this.LLJJI = null;
        this.LLJJIII = null;
        this.LLJJIJI = null;
        this.LLJJIJIIJIL = null;
        this.LLJJIJIL = null;
        this.LLJJJ = null;
        this.LLJJJIL = null;
        this.LLJJJJ = null;
        this.LLJJJJJIL = null;
        this.LLJJJJLIIL = null;
        this.LLJJL = null;
        this.LLJJLIIIJLLLLLLLZ = null;
        this.LLJL = null;
        this.LLJLIL = null;
        this.LLJLILLLLZIIL = null;
        this.LLJLL = null;
        this.LLJLLIL = null;
        this.LLJLLL = null;
        this.LLJZ = null;
        this.LLJZIJLIL = null;
    }

    public final void NR(boolean z) {
        String str;
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        C0UVE.LIZLLL(str);
        String strValueOf = String.valueOf(UserService.getInstance().user().getCurrentUserId());
        C20337914i1<Map<String, Boolean>> c20337914i1 = InterfaceC1106030et7.O8;
        Map<String, Boolean> mapLIZIZ = c20337914i1.LIZIZ();
        mapLIZIZ.put(strValueOf, Boolean.valueOf(z));
        c20337914i1.LJFF(mapLIZIZ);
    }

    public final void PR(C758920Tpq c758920Tpq) {
        LiveMode liveMode;
        Integer numValueOf;
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        View viewFindViewById = null;
        if (dataChannelLJ != null) {
            liveMode = (LiveMode) dataChannelLJ.gg0(LiveModeChannel.class);
        } else {
            liveMode = null;
        }
        IntRange intRange = new IntRange(0, 2);
        if (liveMode != null && (numValueOf = Integer.valueOf(c758920Tpq.LIZ(liveMode))) != null && intRange.LJLJL(numValueOf.intValue())) {
            View viewFindViewById2 = this.LLJL;
            if (viewFindViewById2 == null) {
                View view = getView();
                if (view != null) {
                    viewFindViewById2 = view.findViewById(R.id.buf);
                } else {
                    viewFindViewById2 = null;
                }
                this.LLJL = (LinearLayout) viewFindViewById2;
            }
            C786410Ut5.LJZL(0, (LinearLayout) viewFindViewById2);
            View view2 = this.LLJL;
            if (view2 == null) {
                View view3 = getView();
                if (view3 != null) {
                    viewFindViewById = view3.findViewById(R.id.buf);
                }
                this.LLJL = (LinearLayout) viewFindViewById;
                view2 = viewFindViewById;
            }
            C786410Ut5.R7((LinearLayout) view2, new ACListenerS147S0100000_12(this, 317));
        }
    }

    public final void iS(String str) {
        HashMap mapLJI = C2097608Jq.LJI(new Pair("action_type", "click"), new Pair("click_type", str));
        C474500IjA c474500IjALIZ = C0IJT.LIZ("gpppa_popup");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJIILJJIL("start_broadcast");
        c474500IjALIZ.LJIILIIL("start_broadcast");
        c474500IjALIZ.LJIIJJI("live");
        c474500IjALIZ.LJIILL("click");
        c474500IjALIZ.LJJIIZI(mapLJI);
        c474500IjALIZ.LIZ();
    }

    public final void kS(String str) {
        LiveMode liveMode;
        String str2;
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ == null || (liveMode = (LiveMode) dataChannelLJ.gg0(LiveModeChannel.class)) == null) {
            liveMode = LiveMode.VIDEO;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_moderator_icon");
        c474500IjALIZ.LJIJJLI(C475510Ikn.LJ(this));
        c474500IjALIZ.LJIILJJIL("live_take_page");
        int i = C2843018f.LIZ[liveMode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                str2 = "third_party";
            } else {
                str2 = "screen_share";
            }
        } else {
            str2 = "video_live";
        }
        c474500IjALIZ.LJJII(str2, "live_type");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LIZ();
    }

    public final void mS(boolean z) {
        ViolationStatusResponse.ResponseData responseData;
        PerceptionDialogInfo perceptionDialogInfo;
        if (z) {
            aS().setEnabled(false);
            View viewFindViewById = this.LLJLLIL;
            Text text = null;
            if (viewFindViewById == null) {
                View view = getView();
                if (view != null) {
                    viewFindViewById = view.findViewById(R.id.ix4);
                } else {
                    viewFindViewById = null;
                }
                this.LLJLLIL = (LiveIconView) viewFindViewById;
            }
            C786410Ut5.LLJJIJIL((LiveIconView) viewFindViewById, 0);
            View viewFindViewById2 = this.LLJLLL;
            if (viewFindViewById2 == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById2 = view2.findViewById(R.id.ix7);
                } else {
                    viewFindViewById2 = null;
                }
                this.LLJLLL = (C16F5) viewFindViewById2;
            }
            ((TextView) viewFindViewById2).setTextColor(C497740JfY.LJFF(R.color.f571dc));
            View viewFindViewById3 = this.LLJZ;
            if (viewFindViewById3 == null) {
                View view3 = getView();
                if (view3 != null) {
                    viewFindViewById3 = view3.findViewById(R.id.ix3);
                } else {
                    viewFindViewById3 = null;
                }
                this.LLJZ = (C16F5) viewFindViewById3;
            }
            TextView textView = (TextView) viewFindViewById3;
            textView.setTextColor(C497740JfY.LJFF(R.color.f571dc));
            DataChannel dataChannelLJ = C475510Ikn.LJ(this);
            if (dataChannelLJ != null && (responseData = (ViolationStatusResponse.ResponseData) dataChannelLJ.gg0(ViolationStatusChannel.class)) != null && (perceptionDialogInfo = responseData.perceptionDialog) != null) {
                text = perceptionDialogInfo.subTitle;
            }
            textView.setText(C1133830fbx.LJIILIIL(text, "").toString());
        }
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        Integer numValueOf;
        if (Intrinsics.LJFF("live_goal_update_event", c262100zr.LIZ)) {
            InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
            if (interfaceC1107590evd != null) {
                numValueOf = Integer.valueOf(C1871910yoP.LIZLLL(interfaceC1107590evd, "goalStatus", 0));
            } else {
                numValueOf = null;
            }
            int code = EnumC2636010g.ONGOING.getCode();
            if (numValueOf != null && numValueOf.intValue() == code) {
                return;
            }
            EnumC2636010g.DELETED.getCode();
            if (numValueOf == null) {
                return;
            }
            numValueOf.intValue();
        }
    }

    public final void nS(int i) {
        String string = getString(2131840922);
        String string2 = "";
        if (i != 5) {
            if (i == 8) {
                string = getString(2131840922);
                string2 = getString(2131840923);
            }
        } else {
            string = u.LJJIFFI(getString(2131840917), "{0}", LowAgeAnchorLimitSetting.INSTANCE.getValue(), false);
        }
        C19GO c19go = new C19GO(getContext());
        c19go.LJJIIJ = true;
        c19go.LJII = string;
        c19go.LIZLLL = string2;
        c19go.LJ(2131851997, new DialogInterfaceOnClickListenerC786020UsS(this, 0), false);
        c19go.LIZJ(2131851998, new DialogInterface.OnClickListener() { // from class: X.0TiP
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                dialogInterface.dismiss();
            }
        }, false);
        C786410Ut5.M4(c19go.LIZ());
    }

    public final void hS(boolean z, boolean z2) {
        String str;
        LiveMode liveMode;
        Long lValueOf;
        String str2;
        Pair[] pairArr = new Pair[5];
        if (z) {
            str = "open";
        } else {
            str = "close";
        }
        pairArr[0] = new Pair("send_gift_type", str);
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ == null || (liveMode = (LiveMode) dataChannelLJ.gg0(LiveModeChannel.class)) == null) {
            liveMode = LiveMode.VIDEO;
        }
        pairArr[1] = new Pair("live_type", C354201Zc.LIZ(liveMode));
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        Long lValueOf2 = null;
        if (interfaceC500940JkiUser != null) {
            lValueOf = Long.valueOf(interfaceC500940JkiUser.getCurrentUserId());
        } else {
            lValueOf = null;
        }
        pairArr[2] = new Pair("anchor_id", String.valueOf(lValueOf));
        if (z2) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[3] = new Pair("is_gpppa_account", str2);
        InterfaceC500940Jki interfaceC500940JkiUser2 = UserService.getInstance().user();
        if (interfaceC500940JkiUser2 != null) {
            lValueOf2 = Long.valueOf(interfaceC500940JkiUser2.getCurrentUserId());
        }
        pairArr[4] = new Pair("user_id", String.valueOf(lValueOf2));
        HashMap mapLJI = C2097608Jq.LJI(pairArr);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("anchor_click_gift_icon");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJIILJJIL("live_take_page");
        c474500IjALIZ.LJIILIIL("start_broadcast");
        c474500IjALIZ.LJIIJJI("live");
        c474500IjALIZ.LJIILL("click");
        c474500IjALIZ.LJJIIZI(mapLJI);
        c474500IjALIZ.LIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x08ed  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x08f4  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x08f7  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x0924  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x098c  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x0992 A[PHI: r13
      0x0992: PHI (r13v1 webcast.data.AnchorReminderWordStatus) = (r13v0 webcast.data.AnchorReminderWordStatus), (r13v15 webcast.data.AnchorReminderWordStatus) binds: [B:158:0x0309, B:171:0x033c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:511:0x0a6b  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x0ac1  */
    /* JADX WARN: Type inference failed for: r0v120, types: [X.0JiL] */
    /* JADX WARN: Type inference failed for: r0v204, types: [X.16Ff, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v205, types: [X.16Ff, android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r0v207, types: [X.16Ff, X.18qp] */
    /* JADX WARN: Type inference failed for: r0v208, types: [X.16Ff, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v209, types: [X.16Ff, android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r2v21, types: [X.16Ff] */
    /* JADX WARN: Type inference failed for: r2v24, types: [X.16Ff, android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r2v28, types: [X.16Ff, X.18qp] */
    /* JADX WARN: Type inference failed for: r2v49, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r20, android.os.Bundle r21) {
        /*
            Method dump skipped, instruction units count: 2893
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gl4, viewGroup, false);
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
