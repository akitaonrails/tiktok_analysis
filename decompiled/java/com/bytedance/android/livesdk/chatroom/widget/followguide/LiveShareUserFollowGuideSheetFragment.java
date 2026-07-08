package com.bytedance.android.livesdk.chatroom.widget.followguide;

import X.C01GW;
import X.C0IJT;
import X.C0JBN;
import X.C0KVU;
import X.C1161920gLG;
import X.C11NJ;
import X.C1324610kZf;
import X.C1324720kZq;
import X.C16FS;
import X.C1819620xS4;
import X.C20736316Cj;
import X.C2188811AlT;
import X.C452501pT;
import X.C466310IQj;
import X.C473410IhP;
import X.C474500IjA;
import X.C475500Ikm;
import X.C475510Ikn;
import X.C497740JfY;
import X.C786410Ut5;
import X.InterfaceC466320IQk;
import Y.ACListenerS111S0200000_7;
import Y.ACListenerS142S0100000_7;
import Y.ARunnableS107S0100000_7;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.room.LiveEndEvent;
import com.bytedance.android.livesdk.chatroom.widget.followguide.LiveShareUserFollowGuideSheetFragment;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.dataChannel.EnterLiveSourceChannel;
import com.bytedance.android.livesdkapi.depend.share.ShareFromInfo;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.host.IHostSetting;
import com.bytedance.android.livesdkapi.host.IHostShare;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.AwS586S0100000_7;
import qo2.w;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveShareUserFollowGuideSheetFragment extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9Ky0tPT08JyhiPiY3LyA4Zyk8HELIOSJCkjPigmISEpZwM6PiAfIS4hLRA/LD0VJykgJjgUPSwoLBw7LSA4Dz0yLygpJzs=";
    public C466310IQj LLJZ;
    public boolean LLJZIJLIL;
    public C16FS LLL;
    public ARunnableS107S0100000_7 LLLFF;
    public ShareFromInfo LLLFFI;
    public final C11NJ LLJLLL = new C11NJ();
    public final C01GW LLLF = C452501pT.LIZIZ(new AwS551S0100000_7(this, 43));

    public final User wS() {
        return (User) this.LLLF.getValue();
    }

    public final void o1() {
        User userWS = wS();
        if (userWS != null) {
            IHostAction iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
            long id = userWS.getId();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            DataChannel dataChannelLJ = C475510Ikn.LJ(this);
            linkedHashMap.put("log_enter_live_source", dataChannelLJ != null ? dataChannelLJ.gg0(EnterLiveSourceChannel.class) : null);
            linkedHashMap.put("uid", String.valueOf(userWS.getId()));
            linkedHashMap.put("sec_user_id", userWS.getSecUid());
            linkedHashMap.put("sec_user_id", userWS.getSecUid());
            w.LIZ.getClass();
            linkedHashMap.put("room_id", String.valueOf(w.LJIJJ()));
            linkedHashMap.put("from_request_id", w.LJIJI());
            linkedHashMap.put("enter_from", "live");
            linkedHashMap.put("return_live", "1");
            linkedHashMap.put("extra_from_pre_page", w.LJIIIZ());
            linkedHashMap.put("is_from_live", "true");
            linkedHashMap.put("from_anchor_id", String.valueOf(w.LJ()));
            linkedHashMap.put("room_request_id", w.LJIJI());
            linkedHashMap.put("page_user_id", String.valueOf(userWS.getId()));
            linkedHashMap.put("enter_from_merge", w.LJIIIZ());
            linkedHashMap.put("enter_method", w.LJIIL());
            linkedHashMap.put("room_request_id", w.LJIJI());
            linkedHashMap.put("action_type", w.LIZLLL());
            iHostAction.openShareUserProfilePage(id, linkedHashMap, getContext(), "live_reflow_sharer_sheet");
            zS("click_profile", null, true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C473410IhP.LJ(this.LLLFF);
        C466310IQj c466310IQj = this.LLJZ;
        if (c466310IQj != null) {
            c466310IQj.LIZ();
        }
    }

    public final void yS() {
        User userWS = wS();
        if (userWS != null) {
            int i = 1;
            if (userWS.getSecret() == 1) {
                i = 4;
            } else {
                Long l = userWS.followStatus;
                if (l == null || l.longValue() != 0) {
                    i = 2;
                }
            }
            ((IHostShare) C1161920gLG.LIZJ(IHostShare.class)).postFollowStatus(String.valueOf(userWS.getId()), i);
        }
    }

    public final void ES(TextView textView) {
        textView.setText("");
        C466310IQj c466310IQj = this.LLJZ;
        if (c466310IQj != null) {
            c466310IQj.LIZ();
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.LLLFFI = (ShareFromInfo) C475500Ikm.LIZ(arguments, "share_from_info", ShareFromInfo.class);
        }
    }

    public final void uS(long j) {
        Long l;
        Long l2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("follow status of sharer: ");
        User userWS = wS();
        if (userWS != null) {
            l = userWS.followStatus;
        } else {
            l = null;
        }
        sbLIZ.append(l);
        C2188811AlT.LIZIZ(sbLIZ);
        User userWS2 = wS();
        if (userWS2 != null && (l2 = userWS2.followStatus) != null && l2.longValue() == j) {
            return;
        }
        if (j != 1 && j != 2) {
            C16FS c16fs = this.LLL;
            if (c16fs != null) {
                c16fs.j0(R.style.a7h);
                c16fs.setText(C497740JfY.LJIJI(2131841701));
                c16fs.setIcon(C20736316Cj.LJ(R.attr.e_6, c16fs.getContext()));
                User userWS3 = wS();
                if (userWS3 != null) {
                    userWS3.followStatus = Long.valueOf(j);
                    return;
                }
                return;
            }
            return;
        }
        C16FS c16fs2 = this.LLL;
        if (c16fs2 != null) {
            c16fs2.j0(R.style.a85);
            c16fs2.setText(C497740JfY.LJIJI(2131856122));
            c16fs2.setIcon(C20736316Cj.LJ(R.attr.e8e, c16fs2.getContext()));
            User userWS4 = wS();
            if (userWS4 != null) {
                userWS4.followStatus = Long.valueOf(j);
            }
        }
        yS();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void x1(int i) {
        if (i == 2) {
            zS("close", "click_blank", true);
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        List urls;
        ImageModel avatarThumb;
        super.onViewCreated(view, bundle);
        C1324720kZq c1324720kZq = (C1324720kZq) view.findViewById(R.id.v2e);
        TextView textView = (TextView) view.findViewById(R.id.v2h);
        LiveIconView liveIconView = (LiveIconView) view.findViewById(R.id.e26);
        this.LLL = (C16FS) view.findViewById(R.id.ifd);
        final TextView textView2 = (TextView) view.findViewById(R.id.e22);
        TextView textView3 = (TextView) view.findViewById(R.id.if3);
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null) {
            dataChannelLJ.BQ2(this, LiveEndEvent.class, new AwS586S0100000_7(this, 88));
        }
        C786410Ut5.g8(liveIconView, new ACListenerS142S0100000_7(this, 46));
        User userWS = wS();
        if (userWS != null) {
            C786410Ut5.e8(c1324720kZq, new ACListenerS111S0200000_7(this, textView2, 3));
            C786410Ut5.T7(textView, new ACListenerS111S0200000_7(this, textView2, 4));
            C16FS c16fs = this.LLL;
            if (c16fs != null) {
                C786410Ut5.h8(c16fs, new ACListenerS111S0200000_7(this, textView2, 5));
            }
            C786410Ut5.T7(textView3, new ACListenerS111S0200000_7(this, textView2, 6));
            C786410Ut5.T7(textView2, new ACListenerS111S0200000_7(this, textView2, 7));
            textView.setText(C0KVU.LIZ(userWS));
        }
        C0JBN c0jbnLIZ = C1819620xS4.LIZ();
        User userWS2 = wS();
        if (userWS2 != null && (avatarThumb = userWS2.getAvatarThumb()) != null) {
            urls = avatarThumb.getUrls();
        } else {
            urls = null;
        }
        C1324610kZf c1324610kZfLIZJ = c0jbnLIZ.LIZJ(urls);
        c1324610kZfLIZJ.LJIIIZ = R.drawable.ela;
        c1324610kZfLIZJ.LJJI(c1324720kZq);
        C466310IQj c466310IQj = new C466310IQj(((long) (((IHostSetting) C1161920gLG.LIZJ(IHostSetting.class)).Pp1() + 2)) * 1000, 1000L, new InterfaceC466320IQk() { // from class: X.0IiP
            @Override // X.InterfaceC466320IQk
            public final void LIZLLL() {
                LiveShareUserFollowGuideSheetFragment liveShareUserFollowGuideSheetFragment = this.LIZ;
                liveShareUserFollowGuideSheetFragment.zS("close", "auto_close", false);
                liveShareUserFollowGuideSheetFragment.close(1);
            }

            @Override // X.InterfaceC466320IQk
            public final void onStart() {
                textView2.setText(C497740JfY.LJIJJ(2131836559, "(5s)"));
            }

            @Override // X.InterfaceC466320IQk
            public final void LJJI(long j) {
                TextView textView4 = textView2;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('(');
                sbLIZ.append(j / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
                sbLIZ.append("s)");
                textView4.setText(C497740JfY.LJIJJ(2131836559, C2188811AlT.LIZIZ(sbLIZ)));
            }
        });
        this.LLJZ = c466310IQj;
        c466310IQj.LJ();
        zS("show", null, true);
        ((IHostShare) C1161920gLG.LIZJ(IHostShare.class)).postFollowRecommendEvent("share_link", "live_reflow_sharer_sheet", "show");
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.i2_, viewGroup, false);
    }

    public final void zS(String str, String str2, boolean z) {
        Object objValueOf;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_reflow_sharer_sheet");
        c474500IjALIZ.LJIJJLI(C475510Ikn.LJ(this));
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        User userWS = wS();
        if (userWS != null) {
            objValueOf = Long.valueOf(userWS.getId());
        } else {
            objValueOf = null;
        }
        c474500IjALIZ.LJJII(objValueOf, "sharer_id");
        c474500IjALIZ.LJJII(str2, "close_type");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LJJII(Integer.valueOf(z ? 1 : 0), "has_interaction");
        c474500IjALIZ.LIZ();
    }
}
