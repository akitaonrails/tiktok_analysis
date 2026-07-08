package com.ss.android.ugc.aweme.im.reminduser.impl;

import X.AbstractC1711506n3;
import X.C0YNP;
import X.C1529105yj;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C830490Whz;
import X.C869590Y9l;
import X.EnumC1672106gh;
import X.InterfaceC1493105sv;
import com.ss.android.ugc.aweme.im.reminduser.api.IRemindUsersAnalytics;
import com.ss.android.ugc.aweme.im.saas.host.api.feature.privacy.PrivacySettingsFeature;
import kotlin.Pair;

/* JADX INFO: loaded from: classes35.dex */
public final class RemindUsersAnalytics implements IRemindUsersAnalytics {
    public static final RemindUsersAnalytics LIZIZ = new RemindUsersAnalytics();

    public static final class Service implements IRemindUsersAnalytics {
        public final /* synthetic */ RemindUsersAnalytics LIZIZ = RemindUsersAnalytics.LIZIZ;

        @Override // com.ss.android.ugc.aweme.im.reminduser.api.IRemindUsersAnalytics
        public final void LIZ(String str, String str2, InterfaceC1493105sv interfaceC1493105sv) {
            this.LIZIZ.LIZ(str, str2, interfaceC1493105sv);
        }

        @Override // com.ss.android.ugc.aweme.im.reminduser.api.IRemindUsersAnalytics
        public final void LIZIZ(InterfaceC1493105sv interfaceC1493105sv) {
            this.LIZIZ.LIZIZ(interfaceC1493105sv);
        }

        @Override // com.ss.android.ugc.aweme.im.reminduser.api.IRemindUsersAnalytics
        public final void LIZJ(C869590Y9l c869590Y9l, boolean z, PrivacySettingsFeature privacySettingsFeature, InterfaceC1493105sv interfaceC1493105sv) {
            this.LIZIZ.LIZJ(c869590Y9l, z, privacySettingsFeature, interfaceC1493105sv);
        }

        @Override // com.ss.android.ugc.aweme.im.reminduser.api.IRemindUsersAnalytics
        public final void LIZLLL(String str, InterfaceC1493105sv interfaceC1493105sv) {
            this.LIZIZ.LIZLLL(str, interfaceC1493105sv);
        }

        @Override // com.ss.android.ugc.aweme.im.reminduser.api.IRemindUsersAnalytics
        public final void LJ(int i, InterfaceC1493105sv interfaceC1493105sv, String str, String str2) {
            this.LIZIZ.LJ(i, interfaceC1493105sv, str, str2);
        }

        @Override // com.ss.android.ugc.aweme.im.reminduser.api.IRemindUsersAnalytics
        public final void LJFF(C869590Y9l c869590Y9l, Integer num, InterfaceC1493105sv interfaceC1493105sv) {
            this.LIZIZ.LJFF(c869590Y9l, num, interfaceC1493105sv);
        }

        @Override // com.ss.android.ugc.aweme.im.reminduser.api.IRemindUsersAnalytics
        public final void LJI(String str, String str2, EnumC1672106gh enumC1672106gh, String str3, InterfaceC1493105sv interfaceC1493105sv) {
            this.LIZIZ.LJI(str, str2, enumC1672106gh, str3, interfaceC1493105sv);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.reminduser.api.IRemindUsersAnalytics
    public final void LIZIZ(InterfaceC1493105sv interfaceC1493105sv) {
        interfaceC1493105sv.sendEvent("chat_room_dm_permission_update_banner_show", C2097608Jq.LJIIIIZZ(new Pair("enter_from", "notification_page"), new Pair("hint_type", "business_outreach")));
    }

    @Override // com.ss.android.ugc.aweme.im.reminduser.api.IRemindUsersAnalytics
    public final void LIZLLL(String str, InterfaceC1493105sv interfaceC1493105sv) {
        interfaceC1493105sv.sendEvent("chat_room_dm_permission_update_banner_click", C2097608Jq.LJIIIIZZ(new Pair("enter_from", "notification_page"), new Pair("hint_type", "business_outreach"), new Pair("action_type", str)));
    }

    public final void LJIIIIZZ(boolean z, InterfaceC1493105sv interfaceC1493105sv) {
        String str;
        if (z) {
            str = "show_permission_setting_toast";
        } else {
            str = "click_permission_setting_toast";
        }
        interfaceC1493105sv.sendEvent(str, C2097908Jt.LIZJ(new Pair("enter_from", "light_interactions")));
    }

    @Override // com.ss.android.ugc.aweme.im.reminduser.api.IRemindUsersAnalytics
    public final void LIZ(String str, String str2, InterfaceC1493105sv interfaceC1493105sv) {
        interfaceC1493105sv.sendEvent("show_dm_permissions_button", C1529105yj.LIZ(new Pair("enter_from", str), new Pair("position", str2)));
    }

    @Override // com.ss.android.ugc.aweme.im.reminduser.api.IRemindUsersAnalytics
    public final void LJFF(C869590Y9l c869590Y9l, Integer num, InterfaceC1493105sv interfaceC1493105sv) {
        if (c869590Y9l != null && c869590Y9l.getConversationType() == AbstractC1711506n3.LIZ) {
            RemindUsersViewHelper.LIZIZ.getClass();
            if (RemindUsersViewHelper.LIZJ > -1) {
                RemindUsersViewHelper.LIZIZ.getClass();
                C830490Whz<String, String> c830490WhzLIZ = C1529105yj.LIZ(new Pair("to_user_id", String.valueOf(C0YNP.LJII(c869590Y9l.getConversationId()))), new Pair("message_id", c869590Y9l.getUuid()), new Pair("conversation_id", c869590Y9l.getConversationId()), new Pair("relation_tag", String.valueOf(RemindUsersViewHelper.LIZJ)));
                if (num != null) {
                    c830490WhzLIZ.put("click_on", String.valueOf(num.intValue()));
                    interfaceC1493105sv.sendEvent("click_resend_panel", c830490WhzLIZ);
                } else {
                    interfaceC1493105sv.sendEvent("show_resend_panel", c830490WhzLIZ);
                }
            }
        }
    }

    public final void LJII(String str, EnumC1672106gh enumC1672106gh, InterfaceC1493105sv interfaceC1493105sv) {
        C830490Whz<String, String> c830490WhzLIZ = C1529105yj.LIZ(new Pair("enter_from", str), new Pair("enter_method", "greeting_button"));
        if (enumC1672106gh != null) {
            c830490WhzLIZ.put("panel_version", String.valueOf(enumC1672106gh.getEventTrackingConstant()));
        }
        interfaceC1493105sv.sendEvent("permissions_toast_click", c830490WhzLIZ);
    }

    public final void LJIIIZ(String str, EnumC1672106gh enumC1672106gh, InterfaceC1493105sv interfaceC1493105sv) {
        C830490Whz<String, String> c830490WhzLIZ = C1529105yj.LIZ(new Pair("enter_from", str), new Pair("enter_method", "greeting_button"));
        if (enumC1672106gh != null) {
            c830490WhzLIZ.put("panel_version", String.valueOf(enumC1672106gh.getEventTrackingConstant()));
        }
        interfaceC1493105sv.sendEvent("permissions_toast_show", c830490WhzLIZ);
    }

    @Override // com.ss.android.ugc.aweme.im.reminduser.api.IRemindUsersAnalytics
    public final void LIZJ(C869590Y9l c869590Y9l, boolean z, PrivacySettingsFeature privacySettingsFeature, InterfaceC1493105sv interfaceC1493105sv) {
        if (c869590Y9l != null && c869590Y9l.getConversationType() == AbstractC1711506n3.LIZ) {
            RemindUsersViewHelper.LIZIZ.getClass();
            if (RemindUsersViewHelper.LIZJ > -1) {
                String string = null;
                if (1 != 0) {
                    Pair[] pairArr = new Pair[6];
                    pairArr[0] = new Pair("chat_type", "private");
                    pairArr[1] = new Pair("to_user_id", String.valueOf(C0YNP.LJII(c869590Y9l.getConversationId())));
                    pairArr[2] = new Pair("message_id", c869590Y9l.getUuid());
                    pairArr[3] = new Pair("conversation_id", c869590Y9l.getConversationId());
                    RemindUsersViewHelper.LIZIZ.getClass();
                    pairArr[4] = new Pair("relation_tag", String.valueOf(RemindUsersViewHelper.LIZJ));
                    if (privacySettingsFeature != null) {
                        string = Integer.valueOf(privacySettingsFeature.LJIIJJI()).toString();
                    }
                    pairArr[5] = new Pair("sender_permission", string);
                    C830490Whz<String, String> c830490WhzLIZ = C1529105yj.LIZ(pairArr);
                    if (z) {
                        interfaceC1493105sv.sendEvent("click_dm_message_fail_icon", c830490WhzLIZ);
                    } else {
                        interfaceC1493105sv.sendEvent("show_dm_message_fail_icon", c830490WhzLIZ);
                    }
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.im.reminduser.api.IRemindUsersAnalytics
    public final void LJ(int i, InterfaceC1493105sv interfaceC1493105sv, String str, String str2) {
        interfaceC1493105sv.sendEvent("click_dm_permissions_button", C1529105yj.LIZ(new Pair("enter_from", str), new Pair("position", str2), new Pair("state", String.valueOf(i))));
    }

    @Override // com.ss.android.ugc.aweme.im.reminduser.api.IRemindUsersAnalytics
    public final void LJI(String str, String str2, EnumC1672106gh enumC1672106gh, String str3, InterfaceC1493105sv interfaceC1493105sv) {
        Integer numValueOf;
        Pair[] pairArr = new Pair[5];
        pairArr[0] = new Pair("enter_from", "permissions_button");
        pairArr[1] = new Pair("enter_method", str3);
        if (enumC1672106gh != null) {
            numValueOf = Integer.valueOf(enumC1672106gh.getEventTrackingConstant());
        } else {
            numValueOf = null;
        }
        pairArr[2] = new Pair("panel_version", String.valueOf(numValueOf));
        pairArr[3] = new Pair("from_status", str2);
        pairArr[4] = new Pair("to_status", str);
        interfaceC1493105sv.sendEvent("change_message_permission", C1529105yj.LIZ(pairArr));
    }
}
