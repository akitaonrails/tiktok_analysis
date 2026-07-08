package com.ss.android.ugc.aweme.im.sdk.chat.feature.matchedfriends.analytics;

import X.C0I0B;
import X.C1260910iuv;
import X.C1400340mXo;
import X.C20684815ws;
import X.C2097608Jq;
import X.C830490Whz;
import X.EnumC1260920iuw;
import X.EnumC1260930iux;
import X.InterfaceC1493105sv;
import X.InterfaceC1493505sz;
import com.ss.android.ugc.aweme.im.service.service.IMatchedFriendsAnalytics;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class MatchedFriendsAnalytics implements IMatchedFriendsAnalytics {
    public static final MatchedFriendsAnalytics LIZIZ = new MatchedFriendsAnalytics();

    public static final class Service implements IMatchedFriendsAnalytics {
        public final /* synthetic */ MatchedFriendsAnalytics LIZIZ = MatchedFriendsAnalytics.LIZIZ;

        @Override // com.ss.android.ugc.aweme.im.service.service.IMatchedFriendsAnalytics
        public final void LIZ(boolean z) {
            this.LIZIZ.LIZ(z);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IMatchedFriendsAnalytics
        public final void LIZIZ(String str) {
            this.LIZIZ.LIZIZ(str);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IMatchedFriendsAnalytics
        public final void LIZJ(User user, String str) {
            this.LIZIZ.LIZJ(user, str);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IMatchedFriendsAnalytics
        public final void LIZLLL(int i, String str, String str2) {
            this.LIZIZ.LIZLLL(i, str, str2);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IMatchedFriendsAnalytics
        public final void LJ(String str, String str2, String str3, String str4, String str5, InterfaceC1493105sv interfaceC1493105sv) {
            this.LIZIZ.LJ(str, str2, str3, str4, str5, interfaceC1493105sv);
        }

        @Override // com.ss.android.ugc.aweme.im.service.service.IMatchedFriendsAnalytics
        public final void LJFF(String str, String str2, String str3, InterfaceC1493105sv interfaceC1493105sv) {
            this.LIZIZ.LJFF(str, str2, str3, interfaceC1493105sv);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IMatchedFriendsAnalytics
    public final void LIZ(boolean z) {
        String str;
        C0I0B.LJFF.LIZIZ();
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("enter_from", "notification_page");
        pairArr[1] = new Pair("enter_method", "guide_dm");
        if (z) {
            str = "single";
        } else {
            str = "";
        }
        pairArr[2] = new Pair("follow_type", str);
        C20684815ws.LJIILLIIL("follow", C2097608Jq.LJIIJ(pairArr));
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IMatchedFriendsAnalytics
    public final void LIZIZ(String str) {
        C0I0B c0i0b = C0I0B.LJFF;
        InterfaceC1493505sz interfaceC1493505szLIZIZ = c0i0b.LIZIZ();
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("enter_from", "notification_page");
        String curUserId = c0i0b.LIZ().getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        pairArr[1] = new Pair("from_user_id", curUserId);
        pairArr[2] = new Pair("to_user_id", str);
        interfaceC1493505szLIZIZ.sendEvent("show_follow_send_popup", C2097608Jq.LJIIJ(pairArr));
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IMatchedFriendsAnalytics
    public final void LIZJ(User user, String str) {
        for (EnumC1260930iux enumC1260930iux : EnumC1260930iux.values()) {
            if (Intrinsics.LJFF(enumC1260930iux.getType(), str)) {
                C1260910iuv c1260910iuv = new C1260910iuv(0);
                c1260910iuv.LJJIJLIJ("notification_page");
                c1260910iuv.LJJIL("guide_dm");
                c1260910iuv.LJJLIIIJILLIZJL = EnumC1260920iuw.CARD;
                c1260910iuv.LJJJJLL();
                c1260910iuv.LJJLIIIJJI = enumC1260930iux;
                c1260910iuv.LJJJJZI(user);
                c1260910iuv.LJJJJLI(user.getRequestId());
                c1260910iuv.LJJJJIZL("inbox_first_page");
                c1260910iuv.LJIILJJIL();
                return;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IMatchedFriendsAnalytics
    public final void LIZLLL(int i, String str, String str2) {
        C0I0B c0i0b = C0I0B.LJFF;
        c0i0b.LIZIZ();
        Pair[] pairArr = new Pair[5];
        pairArr[0] = new Pair("enter_from", "notification_page");
        String curUserId = ((C1400340mXo) c0i0b.LIZ()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        pairArr[1] = new Pair("from_user_id", curUserId);
        pairArr[2] = new Pair("to_user_id", str);
        pairArr[3] = new Pair("ask_again", String.valueOf(i));
        pairArr[4] = new Pair("action", str2);
        C20684815ws.LJIILLIIL("click_follow_send_popup", C2097608Jq.LJIIJ(pairArr));
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IMatchedFriendsAnalytics
    public final void LJFF(String str, String str2, String str3, InterfaceC1493105sv interfaceC1493105sv) {
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("enter_from", "chat");
        c830490Whz.put("to_user_id", str);
        c830490Whz.put("follow_type", str2);
        if (str3 == null) {
            str3 = "";
        }
        c830490Whz.put("rec_type", str3);
        interfaceC1493105sv.sendEvent("show_follow_pop_up", c830490Whz);
    }

    @Override // com.ss.android.ugc.aweme.im.service.service.IMatchedFriendsAnalytics
    public final void LJ(String str, String str2, String str3, String str4, String str5, InterfaceC1493105sv interfaceC1493105sv) {
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("enter_from", "chat");
        c830490Whz.put("to_user_id", str);
        c830490Whz.put("follow_type", str2);
        if (str3 == null) {
            str3 = "";
        }
        c830490Whz.put("rec_type", str3);
        c830490Whz.put("action_type", str4);
        if (str5 == null) {
            str5 = "";
        }
        c830490Whz.put("to_user_type", str5);
        interfaceC1493105sv.sendEvent("close_follow_pop_up", c830490Whz);
    }
}
