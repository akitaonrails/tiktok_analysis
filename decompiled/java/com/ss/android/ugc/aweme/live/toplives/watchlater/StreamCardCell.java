package com.ss.android.ugc.aweme.live.toplives.watchlater;

import X.C01GW;
import X.C0IJT;
import X.C0KVU;
import X.C1099420eiS;
import X.C1161920gLG;
import X.C13LP;
import X.C1548820qPI;
import X.C1812120xFy;
import X.C1819620xS4;
import X.C1842310y2f;
import X.C1842320y2g;
import X.C1871910yoP;
import X.C197039127h;
import X.C2097608Jq;
import X.C21569419bA;
import X.C23250099c;
import X.C262100zr;
import X.C339190DRl;
import X.C452501pT;
import X.C474500IjA;
import X.C475420Ike;
import X.C485350J1p;
import X.C786410Ut5;
import X.C993630bxp;
import X.InterfaceC1107590evd;
import X.InterfaceC1141530foN;
import X.InterfaceC1891350zJl;
import X.InterfaceC500940Jki;
import Y.ACListenerS161S0100000_27;
import Y.AfS161S0200000_27;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.LiveEventInfo;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.audience.WatchLaterHistoryResp;

/* JADX INFO: loaded from: classes28.dex */
public final class StreamCardCell extends PowerCell<C993630bxp> implements InterfaceC1141530foN {
    public final C01GW LL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 592));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 597));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 594));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 596));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 595));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 598));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 599));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 593));
    public String LLJ;

    public final C197039127h N5() {
        return (C197039127h) this.LLIZLLLIL.getValue();
    }

    public final void I5() {
        WatchLaterHistoryResp.Item item;
        LiveEventInfo liveEventInfo;
        Long l;
        C993630bxp item2 = getItem();
        if (item2 == null || (item = item2.LL) == null || (liveEventInfo = item.upcomingLiveEvent) == null || (l = liveEventInfo.eventId) == null) {
            return;
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1842310y2f(l.longValue(), this, null), 3);
    }

    public final void L5() {
        WatchLaterHistoryResp.Item item;
        User user;
        C993630bxp item2 = getItem();
        if (item2 == null || (item = item2.LL) == null || (user = item.anchor) == null) {
            return;
        }
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        C1099420eiS c1099420eiS = new C1099420eiS();
        c1099420eiS.LIZIZ(user.getId());
        interfaceC500940JkiUser.LIZ(c1099420eiS.LIZJ()).LJJLJLI(new AfS161S0200000_27(user, this, 16));
    }

    public final void P5() {
        WatchLaterHistoryResp.Item item;
        Room room;
        WatchLaterHistoryResp.Item item2;
        User user;
        C993630bxp item3 = getItem();
        if (item3 == null || (item = item3.LL) == null || (room = item.livingRoom) == null) {
            return;
        }
        long id = room.getId();
        C993630bxp item4 = getItem();
        if (item4 == null || (item2 = item4.LL) == null || (user = item2.anchor) == null) {
            return;
        }
        long id2 = user.getId();
        if (id > 0 || id2 > 0) {
            EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
            EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
            roomsData.enterFromMerge = "live_merge";
            roomsData.enterMethod = "watch_later_history";
            roomsData.roomId = id;
            roomsData.userId = String.valueOf(id2);
            enterRoomConfig.mRoomsData.enterType = "click";
            C475420Ike.LIZ.watchLive(this.itemView.getContext(), enterRoomConfig);
        }
    }

    public final void R5() {
        WatchLaterHistoryResp.Item item;
        User user;
        C993630bxp item2 = getItem();
        if (item2 == null || (item = item2.LL) == null || (user = item.anchor) == null) {
            return;
        }
        ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).openUserProfilePage(user.getId(), C2097608Jq.LJIIJ(new Pair("uid", String.valueOf(user.getId())), new Pair("room_id", String.valueOf(user.getLiveRoomId())), new Pair("sec_uid", user.getSecUid()), new Pair("is_from_live", "true"), new Pair("action_type", "click"), new Pair("enter_from_merge", "live_merge"), new Pair("enter_method", "watch_later_history")));
    }

    public final void S5() {
        WatchLaterHistoryResp.Item item;
        User user;
        C993630bxp item2 = getItem();
        if (item2 == null || (item = item2.LL) == null || (user = item.anchor) == null) {
            return;
        }
        InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
        C485350J1p c485350J1p = new C485350J1p();
        c485350J1p.LIZIZ(user.getId());
        c485350J1p.getClass();
        interfaceC500940JkiUser.LJI(new C1812120xFy(c485350J1p)).LJJLJLI(new AfS161S0200000_27(user, this, 7));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        C1548820qPI.LIZLLL("live_event_update_result", this);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        C1548820qPI.LJIIIIZZ("live_event_update_result", this);
    }

    public final void register() {
        WatchLaterHistoryResp.Item item;
        LiveEventInfo liveEventInfo;
        Long l;
        C993630bxp item2 = getItem();
        if (item2 == null || (item = item2.LL) == null || (liveEventInfo = item.upcomingLiveEvent) == null || (l = liveEventInfo.eventId) == null) {
            return;
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1842320y2g(l.longValue(), this, null), 3);
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        InterfaceC1107590evd interfaceC1107590evd;
        InterfaceC1107590evd interfaceC1107590evdLJ;
        WatchLaterHistoryResp.Item item;
        LiveEventInfo liveEventInfo;
        if (!Intrinsics.LJFF(c262100zr.LIZ, "live_event_update_result") || (interfaceC1107590evd = c262100zr.LIZIZ) == null || (interfaceC1107590evdLJ = C1871910yoP.LJ(interfaceC1107590evd, "live_event")) == null || !Intrinsics.LJFF(C1871910yoP.LJFF(interfaceC1107590evdLJ, FollowStatusChangeMethod.PARAM_UID, ""), this.LLJ)) {
            return;
        }
        boolean zLIZIZ = C1871910yoP.LIZIZ(interfaceC1107590evdLJ, "has_subscribed", false);
        C993630bxp item2 = getItem();
        if (item2 != null && (item = item2.LL) != null && (liveEventInfo = item.upcomingLiveEvent) != null) {
            liveEventInfo.subscribed = Boolean.valueOf(zLIZIZ);
        }
        if (zLIZIZ) {
            N5().setText(this.itemView.getContext().getString(2131856894));
            N5().setButtonVariant(1);
            C786410Ut5.U8(N5(), new ACListenerS161S0100000_27(this, 48));
        } else {
            N5().setText(this.itemView.getContext().getString(2131856893));
            N5().setButtonVariant(0);
            C786410Ut5.U8(N5(), new ACListenerS161S0100000_27(this, 49));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        boolean z;
        boolean z2;
        boolean zLJFF;
        int i;
        boolean z3;
        String str;
        int i2;
        String string;
        ImageModel avatarThumb;
        List urls;
        Long l;
        FollowInfo followInfo;
        FollowInfo followInfo2;
        C993630bxp c993630bxp = (C993630bxp) interfaceC1891350zJl;
        super.onBindItemView(c993630bxp);
        WatchLaterHistoryResp.Item item = c993630bxp.LL;
        Room room = item.livingRoom;
        User user = item.anchor;
        LiveEventInfo liveEventInfo = item.upcomingLiveEvent;
        if (room != null) {
            z = true;
        } else {
            z = false;
        }
        if (user != null && (((followInfo = user.getFollowInfo()) != null && ((int) followInfo.getFollowStatus()) == 1) || ((followInfo2 = user.getFollowInfo()) != null && ((int) followInfo2.getFollowStatus()) == 2))) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (liveEventInfo != null) {
            zLJFF = Intrinsics.LJFF(liveEventInfo.subscribed, Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        String string2 = null;
        if (liveEventInfo != null && (l = liveEventInfo.eventId) != null) {
            string2 = l.toString();
        }
        this.LLJ = string2;
        C786410Ut5.I7(new ACListenerS161S0100000_27(this, 213), this.itemView);
        if (z) {
            C786410Ut5.I7(new ACListenerS161S0100000_27(this, 214), (View) this.LL.getValue());
            C339190DRl.LIZLLL((View) this.LLILLJJLI.getValue());
            C339190DRl.LIZLLL((View) this.LLILZ.getValue());
            C21569419bA c21569419bA = (C21569419bA) this.LLILZ.getValue();
            if (c21569419bA != null) {
                c21569419bA.LJFF();
            }
            C339190DRl.LIZIZ((View) this.LLILZIL.getValue());
        } else {
            C786410Ut5.I7(new ACListenerS161S0100000_27(this, 215), (View) this.LL.getValue());
            C339190DRl.LIZIZ((View) this.LLILLJJLI.getValue());
            C339190DRl.LIZIZ((View) this.LLILZ.getValue());
            C21569419bA c21569419bA2 = (C21569419bA) this.LLILZ.getValue();
            if (c21569419bA2 != null) {
                c21569419bA2.LIZIZ();
            }
            TuxIconView tuxIconView = (TuxIconView) this.LLILZIL.getValue();
            if (tuxIconView != null) {
                if (liveEventInfo != null) {
                    i = 0;
                } else {
                    i = 8;
                }
                C786410Ut5.LLLLLLZZ(tuxIconView, i);
            }
        }
        if (user != null && (avatarThumb = user.getAvatarThumb()) != null && (urls = avatarThumb.getUrls()) != null && (!urls.isEmpty())) {
            C1819620xS4.LIZ().LJIJJLI((String) C13LP.LJJJJZI(user.getAvatarThumb().getUrls()), "toplive_window").LJJI((View) this.LLILLL.getValue());
        }
        ((TextView) this.LLILZLL.getValue()).setText(C0KVU.LIZ(user));
        TextView textView = (TextView) this.LLIZ.getValue();
        if (z) {
            string = room.getTitle();
            if (string == null || string.length() <= 0) {
                string = this.itemView.getContext().getString(2131841447);
            }
        } else {
            long j = c993630bxp.LL.lastRoomFinishTime;
            if (j <= 0) {
                string = "";
            } else {
                if (j < 1000000000000L) {
                    j *= (long) LSPassThroughRecordSizeConfig.DEFAULT;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jMin = Math.min(j, jCurrentTimeMillis);
                if (jCurrentTimeMillis - jMin <= 86400000) {
                    z3 = true;
                    str = "h:mm a";
                } else {
                    z3 = false;
                    str = "yyyy-MM-dd";
                }
                String str2 = new SimpleDateFormat(str, Locale.getDefault()).format(new Date(jMin));
                if (z3) {
                    i2 = 2131856902;
                } else {
                    i2 = 2131856901;
                }
                string = this.itemView.getContext().getString(i2, str2);
            }
        }
        textView.setText(string);
        if (z) {
            N5().setText(this.itemView.getContext().getString(2131856897));
            N5().setButtonVariant(0);
            C786410Ut5.U8(N5(), new ACListenerS161S0100000_27(this, 216));
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_show");
            c474500IjALIZ.LJJII("live_merge", "enter_from_merge");
            c474500IjALIZ.LJJII("watch_later_history", "enter_method");
            c474500IjALIZ.LJJII("click", "action_type");
            c474500IjALIZ.LJJII(Long.valueOf(room.getId()), "room_id");
            c474500IjALIZ.LJJII(Long.valueOf(room.getOwner().getId()), "anchor_id");
            c474500IjALIZ.LJJII(Integer.valueOf(getLayoutPosition()), "room_position");
            c474500IjALIZ.LIZ();
            return;
        }
        if (liveEventInfo != null) {
            if (zLJFF) {
                N5().setText(this.itemView.getContext().getString(2131856894));
                N5().setButtonVariant(1);
                C786410Ut5.U8(N5(), new ACListenerS161S0100000_27(this, 217));
                return;
            } else {
                N5().setText(this.itemView.getContext().getString(2131856893));
                N5().setButtonVariant(0);
                C786410Ut5.U8(N5(), new ACListenerS161S0100000_27(this, 218));
                return;
            }
        }
        if (z2) {
            N5().setText(this.itemView.getContext().getString(2131856890));
            N5().setButtonVariant(1);
            C786410Ut5.U8(N5(), new ACListenerS161S0100000_27(this, 219));
        } else {
            N5().setText(this.itemView.getContext().getString(2131856889));
            N5().setButtonVariant(0);
            C786410Ut5.U8(N5(), new ACListenerS161S0100000_27(this, 220));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gw8, viewGroup, false);
    }
}
