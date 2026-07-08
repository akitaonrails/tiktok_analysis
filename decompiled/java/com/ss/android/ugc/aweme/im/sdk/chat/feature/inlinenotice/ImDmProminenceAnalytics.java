package com.ss.android.ugc.aweme.im.sdk.chat.feature.inlinenotice;

import X.C01GW;
import X.C1709506mj;
import X.C1709606mk;
import X.C830490Whz;
import X.C909290Zln;
import X.InterfaceC1490905sZ;
import X.InterfaceC1493105sv;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.sdk.common.controller.analytics.IMAnalyticsUtil;
import com.ss.android.ugc.aweme.im.service.analytics.IImDmProminenceAnalytics;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ImDmProminenceAnalytics implements IImDmProminenceAnalytics {
    public static final ImDmProminenceAnalytics LIZIZ = new ImDmProminenceAnalytics();

    public static final class Service implements IImDmProminenceAnalytics {
        public final /* synthetic */ ImDmProminenceAnalytics LIZIZ = ImDmProminenceAnalytics.LIZIZ;

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IImDmProminenceAnalytics
        public final String LIZ(String str) {
            return this.LIZIZ.LIZ(str);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IImDmProminenceAnalytics
        public final void LIZIZ(InterfaceC1490905sZ<?> interfaceC1490905sZ, String str, IMUser iMUser, String str2, InterfaceC1493105sv interfaceC1493105sv) {
            this.LIZIZ.LIZIZ(interfaceC1490905sZ, str, iMUser, str2, interfaceC1493105sv);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IImDmProminenceAnalytics
        public final void LIZJ(IMUser iMUser, InterfaceC1493105sv interfaceC1493105sv, String str, String str2, String str3) {
            this.LIZIZ.LIZJ(iMUser, interfaceC1493105sv, str, str2, str3);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IImDmProminenceAnalytics
        public final void LIZLLL(InterfaceC1493105sv interfaceC1493105sv, Integer num, String str) {
            this.LIZIZ.LIZLLL(interfaceC1493105sv, num, str);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IImDmProminenceAnalytics
        public final void LJ(SessionInfo sessionInfo, InterfaceC1493105sv interfaceC1493105sv) {
            this.LIZIZ.LJ(sessionInfo, interfaceC1493105sv);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IImDmProminenceAnalytics
        public final void LJFF(Integer num, InterfaceC1493105sv interfaceC1493105sv, boolean z, String str, String str2, String str3, boolean z2, IMUser iMUser) {
            this.LIZIZ.LJFF(num, interfaceC1493105sv, z, str, str2, str3, z2, iMUser);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IImDmProminenceAnalytics
        public final void LJI(SessionInfo sessionInfo, String str, String str2, InterfaceC1493105sv interfaceC1493105sv) {
            this.LIZIZ.LJI(sessionInfo, str, str2, interfaceC1493105sv);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IImDmProminenceAnalytics
        public final void LJII(InterfaceC1493105sv interfaceC1493105sv, boolean z, String str, String str2, String str3, boolean z2, IMUser iMUser) {
            this.LIZIZ.LJII(interfaceC1493105sv, z, str, str2, str3, z2, iMUser);
        }
    }

    public static int LJIIIIZZ(IMUser iMUser) {
        if (iMUser.getFollowStatus() == 0 && iMUser.getFollowerStatus() == 1) {
            return iMUser.getFollowerStatus();
        }
        return iMUser.getFollowStatus();
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IImDmProminenceAnalytics
    public final String LIZ(String str) {
        C01GW c01gw = C1709606mk.LIZ;
        if (((Number) c01gw.getValue()).intValue() != 0 && ((Number) c01gw.getValue()).intValue() != 2) {
            int iIntValue = ((Number) c01gw.getValue()).intValue();
            if (iIntValue != 3 && iIntValue != 4 && iIntValue != 5 && iIntValue != 6) {
                return "new chat";
            }
            return "report_prediction_model";
        }
        if (str == null) {
            return "new chat";
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -2140634290) {
            if (iHashCode != -1495853829) {
                if (iHashCode != -318810992 || !str.equals("high_risk_report_notice")) {
                    return "new chat";
                }
                return "high_risk_model";
            }
            if (!str.equals("predator_report_notice")) {
                return "new chat";
            }
            return "predator_model";
        }
        if (!str.equals("high_risk_predator_report_notice")) {
            return "new chat";
        }
        return "high_risk_model,predator_model";
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IImDmProminenceAnalytics
    public final void LJ(SessionInfo sessionInfo, InterfaceC1493105sv interfaceC1493105sv) {
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("enter_from", IMAnalyticsUtil.LIZIZ.LIZLLL(sessionInfo));
        c830490Whz.put("enter_method", "follow_button");
        interfaceC1493105sv.sendEvent("follow", c830490Whz);
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IImDmProminenceAnalytics
    public final void LIZLLL(InterfaceC1493105sv interfaceC1493105sv, Integer num, String str) {
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("enter_from", "dm_block_action");
        c830490Whz.put("enter_method", "block_notice");
        if (num != null) {
            num.intValue();
            c830490Whz.put("relation_tag", num.toString());
        }
        if (str != null) {
            c830490Whz.put("rec_type", str);
        }
        c830490Whz.put("chat_type", "private");
        interfaceC1493105sv.sendEvent("click_report", c830490Whz);
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IImDmProminenceAnalytics
    public final void LJI(SessionInfo sessionInfo, String str, String str2, InterfaceC1493105sv interfaceC1493105sv) {
        IMUser fromUser;
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("conversation_id", sessionInfo.getConversationId());
        if (sessionInfo.isMessageRequest()) {
            c830490Whz.put("chat_type", "stranger");
        } else if (sessionInfo.isSingleChat()) {
            c830490Whz.put("chat_type", "private");
        }
        if ((sessionInfo instanceof C909290Zln) && (fromUser = ((C909290Zln) sessionInfo).getFromUser()) != null) {
            c830490Whz.put("relation_tag", String.valueOf(fromUser.getFollowStatus()));
        }
        c830490Whz.put(Scene.SCENE_SERVICE, str);
        c830490Whz.put("user_type", str2);
        interfaceC1493105sv.sendEvent("dm_block_interaction_popup", c830490Whz);
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IImDmProminenceAnalytics
    public final void LIZIZ(InterfaceC1490905sZ<?> interfaceC1490905sZ, String str, IMUser iMUser, String str2, InterfaceC1493105sv interfaceC1493105sv) {
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("enter_from", str);
        c830490Whz.put("enter_method", str2);
        if (Intrinsics.LJFF(interfaceC1490905sZ, C1709506mj.INSTANCE)) {
            c830490Whz.put("chat_type", "private");
            if (iMUser != null) {
                String recType = iMUser.getRecType();
                if (recType == null) {
                    recType = "";
                }
                c830490Whz.put("rec_type", recType);
                c830490Whz.put("relation_tag", String.valueOf(iMUser.getFollowStatus()));
            }
        } else {
            c830490Whz.put("chat_type", "group");
        }
        c830490Whz.put("enter_method", "button");
        interfaceC1493105sv.sendEvent("click_report", c830490Whz);
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IImDmProminenceAnalytics
    public final void LIZJ(IMUser iMUser, InterfaceC1493105sv interfaceC1493105sv, String str, String str2, String str3) {
        String strValueOf;
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("enter_from", "chat");
        c830490Whz.put("enter_method", "pop_up");
        c830490Whz.put("safety_flag_source", LIZ(str3));
        c830490Whz.put("conversation_id", str);
        if (str2 == null) {
            str2 = "";
        }
        c830490Whz.put("chat_type", str2);
        if (iMUser != null) {
            strValueOf = String.valueOf(LJIIIIZZ(iMUser));
        } else {
            strValueOf = "-1";
        }
        c830490Whz.put("relation_tag", strValueOf);
        interfaceC1493105sv.sendEvent("click_report", c830490Whz);
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IImDmProminenceAnalytics
    public final void LJII(InterfaceC1493105sv interfaceC1493105sv, boolean z, String str, String str2, String str3, boolean z2, IMUser iMUser) {
        String str4;
        String strValueOf;
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("enter_from", "chat");
        c830490Whz.put("safety_flag_source", LIZ(str));
        c830490Whz.put("conversation_id", str2);
        if (str3 != null) {
            c830490Whz.put("chat_type", str3);
        }
        if (z2) {
            str4 = "safe_conversation_banner_block_notice_show";
        } else if (z) {
            str4 = "report_group_notice_show";
        } else {
            str4 = "report_notice_show";
        }
        if (iMUser != null) {
            strValueOf = String.valueOf(LJIIIIZZ(iMUser));
        } else {
            strValueOf = "-1";
        }
        c830490Whz.put("relation_tag", strValueOf);
        interfaceC1493105sv.sendEvent(str4, c830490Whz);
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IImDmProminenceAnalytics
    public final void LJFF(Integer num, InterfaceC1493105sv interfaceC1493105sv, boolean z, String str, String str2, String str3, boolean z2, IMUser iMUser) {
        String str4;
        String str5;
        String strValueOf;
        if (num != null) {
            if (num.intValue() == 1) {
                str4 = "close";
            } else if (num.intValue() == 2) {
                str4 = "make_safe";
            } else if (num.intValue() == 3) {
                str4 = "report";
            } else if (num.intValue() != 5) {
                return;
            } else {
                str4 = "block";
            }
            String strLIZ = LIZ(str);
            C830490Whz c830490Whz = new C830490Whz();
            c830490Whz.put("action_type", str4);
            c830490Whz.put("enter_from", "chat");
            c830490Whz.put("conversation_id", str2);
            if (str3 != null) {
                c830490Whz.put("chat_type", str3);
            }
            if (z2) {
                str5 = "safe_conversation_banner_block_notice_click";
            } else if (z) {
                str5 = "report_group_notice_click";
            } else {
                str5 = "report_notice_click";
            }
            c830490Whz.put("safety_flag_source", strLIZ);
            if (iMUser != null) {
                strValueOf = String.valueOf(LJIIIIZZ(iMUser));
            } else {
                strValueOf = "-1";
            }
            c830490Whz.put("relation_tag", strValueOf);
            interfaceC1493105sv.sendEvent(str5, c830490Whz);
        }
    }
}
