package com.ss.android.ugc.aweme.im.sdk.chat.analytics;

import X.C0I0B;
import X.C1673406gu;
import X.C20684815ws;
import X.C830490Whz;
import X.InterfaceC1493105sv;
import com.ss.android.ugc.aweme.im.service.analytics.IImDmProminenceAnalytics;
import com.ss.android.ugc.aweme.im.service.analytics.IImImproveBlockExperienceAnalytics;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ImImproveBlockExperienceAnalytics implements IImImproveBlockExperienceAnalytics {
    public static final ImImproveBlockExperienceAnalytics LIZIZ = new ImImproveBlockExperienceAnalytics();

    public static final class Service implements IImImproveBlockExperienceAnalytics {
        public final /* synthetic */ ImImproveBlockExperienceAnalytics LIZIZ = ImImproveBlockExperienceAnalytics.LIZIZ;

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IImImproveBlockExperienceAnalytics
        public final void LIZ(InterfaceC1493105sv interfaceC1493105sv) {
            this.LIZIZ.LIZ(interfaceC1493105sv);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IImImproveBlockExperienceAnalytics
        public final void LIZIZ(InterfaceC1493105sv interfaceC1493105sv, Integer num, String str, String str2, String str3, String str4, String str5, String str6) {
            this.LIZIZ.LIZIZ(interfaceC1493105sv, num, str, str2, str3, str4, str5, str6);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IImImproveBlockExperienceAnalytics
        public final void LIZJ(String str, InterfaceC1493105sv interfaceC1493105sv) {
            this.LIZIZ.LIZJ(str, interfaceC1493105sv);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IImImproveBlockExperienceAnalytics
        public final void LIZLLL(String str, String str2, String str3, String str4, InterfaceC1493105sv interfaceC1493105sv) {
            this.LIZIZ.LIZLLL(str, str2, str3, str4, interfaceC1493105sv);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IImImproveBlockExperienceAnalytics
        public final void LJ(InterfaceC1493105sv interfaceC1493105sv, Integer num, String str, String str2, String str3, String str4, String str5) {
            this.LIZIZ.LJ(interfaceC1493105sv, num, str, str2, str3, str4, str5);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IImImproveBlockExperienceAnalytics
        public final void LJFF(InterfaceC1493105sv interfaceC1493105sv, String str, String str2, String str3, String str4, boolean z) {
            this.LIZIZ.LJFF(interfaceC1493105sv, str, str2, str3, str4, z);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IImImproveBlockExperienceAnalytics
        public final void LJI(String str, boolean z) {
            this.LIZIZ.LJI(str, z);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IImImproveBlockExperienceAnalytics
        public final void LJII(InterfaceC1493105sv interfaceC1493105sv, Integer num, String str, String str2, String str3, String str4, String str5, String str6) {
            this.LIZIZ.LJII(interfaceC1493105sv, num, str, str2, str3, str4, str5, str6);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IImImproveBlockExperienceAnalytics
    public final void LIZ(InterfaceC1493105sv interfaceC1493105sv) {
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("enter_from", "chat_list_page");
        interfaceC1493105sv.sendEvent("block_warning_show", c830490Whz);
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IImImproveBlockExperienceAnalytics
    public final void LIZJ(String str, InterfaceC1493105sv interfaceC1493105sv) {
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("enter_from", "chat_list_page");
        c830490Whz.put("target", str);
        interfaceC1493105sv.sendEvent("block_warning_click", c830490Whz);
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IImImproveBlockExperienceAnalytics
    public final void LJI(String str, boolean z) {
        if (z) {
            C0I0B.LJFF.LIZIZ();
            C830490Whz c830490Whz = new C830490Whz();
            c830490Whz.put("enter_from", "chat_list_page");
            c830490Whz.put("to_user_id", str);
            C20684815ws.LJIILLIIL("unblock", c830490Whz);
            return;
        }
        C0I0B.LJFF.LIZIZ();
        C830490Whz c830490Whz2 = new C830490Whz();
        c830490Whz2.put("enter_from", "chat_list_page");
        c830490Whz2.put("to_user_id", str);
        C20684815ws.LJIILLIIL("block", c830490Whz2);
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IImImproveBlockExperienceAnalytics
    public final void LIZLLL(String str, String str2, String str3, String str4, InterfaceC1493105sv interfaceC1493105sv) {
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("enter_from", str);
        c830490Whz.put("enter_method", str2);
        if (str3 != null && str3.length() != 0) {
            c830490Whz.put("chat_type", str3);
        }
        if (str4 != null) {
            c830490Whz.put("conversation_id", str4);
        }
        interfaceC1493105sv.sendEvent("unblock_popup_show", c830490Whz);
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IImImproveBlockExperienceAnalytics
    public final void LJFF(InterfaceC1493105sv interfaceC1493105sv, String str, String str2, String str3, String str4, boolean z) {
        String str5;
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("enter_from", str);
        if (z) {
            str5 = "unblock";
        } else {
            str5 = "cancel";
        }
        c830490Whz.put("target", str5);
        c830490Whz.put("enter_method", str2);
        if (str3 != null && str3.length() != 0) {
            c830490Whz.put("chat_type", str3);
        }
        if (str4 != null) {
            c830490Whz.put("conversation_id", str4);
        }
        interfaceC1493105sv.sendEvent("unblock_confirm", c830490Whz);
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IImImproveBlockExperienceAnalytics
    public final void LJ(InterfaceC1493105sv interfaceC1493105sv, Integer num, String str, String str2, String str3, String str4, String str5) {
        boolean z;
        int iIntValue;
        String strLIZ;
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("enter_from", str);
        c830490Whz.put("enter_method", str2);
        if (str3 != null && str3.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        String str6 = "";
        if (!z) {
            if (str3 == null) {
                str3 = "";
            }
            c830490Whz.put("chat_type", str3);
        }
        if (str4 != null) {
            c830490Whz.put("conversation_id", str4);
        }
        if (Intrinsics.LJFF(str, "banner")) {
            IImDmProminenceAnalytics.LIZ.getClass();
            IImDmProminenceAnalytics iImDmProminenceAnalyticsLIZ = C1673406gu.LIZ();
            if (iImDmProminenceAnalyticsLIZ != null && (strLIZ = iImDmProminenceAnalyticsLIZ.LIZ(str5)) != null) {
                str6 = strLIZ;
            }
            c830490Whz.put("safety_flag_source", str6);
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = -1;
            }
            c830490Whz.put("relation_tag", String.valueOf(iIntValue));
        }
        interfaceC1493105sv.sendEvent("block_popup_show", c830490Whz);
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IImImproveBlockExperienceAnalytics
    public final void LIZIZ(InterfaceC1493105sv interfaceC1493105sv, Integer num, String str, String str2, String str3, String str4, String str5, String str6) {
        boolean z;
        int iIntValue;
        String strLIZ;
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("enter_from", str);
        c830490Whz.put("enter_method", str2);
        c830490Whz.put("target", "block");
        c830490Whz.put("to_user_id", str3);
        if (str4 != null && str4.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        String str7 = "";
        if (!z) {
            if (str4 == null) {
                str4 = "";
            }
            c830490Whz.put("chat_type", str4);
        }
        if (str5 != null) {
            c830490Whz.put("conversation_id", str5);
        }
        if (Intrinsics.LJFF(str, "banner")) {
            IImDmProminenceAnalytics.LIZ.getClass();
            IImDmProminenceAnalytics iImDmProminenceAnalyticsLIZ = C1673406gu.LIZ();
            if (iImDmProminenceAnalyticsLIZ != null && (strLIZ = iImDmProminenceAnalyticsLIZ.LIZ(str6)) != null) {
                str7 = strLIZ;
            }
            c830490Whz.put("safety_flag_source", str7);
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = -1;
            }
            c830490Whz.put("relation_tag", String.valueOf(iIntValue));
        }
        interfaceC1493105sv.sendEvent("block_confirm", c830490Whz);
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IImImproveBlockExperienceAnalytics
    public final void LJII(InterfaceC1493105sv interfaceC1493105sv, Integer num, String str, String str2, String str3, String str4, String str5, String str6) {
        boolean z;
        int iIntValue;
        String strLIZ;
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("enter_from", str);
        c830490Whz.put("enter_method", str2);
        c830490Whz.put("target", "cancel");
        c830490Whz.put("to_user_id", str3);
        if (str4 != null && str4.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        String str7 = "";
        if (!z) {
            if (str4 == null) {
                str4 = "";
            }
            c830490Whz.put("chat_type", str4);
        }
        if (str5 != null) {
            c830490Whz.put("conversation_id", str5);
        }
        if (Intrinsics.LJFF(str, "banner")) {
            IImDmProminenceAnalytics.LIZ.getClass();
            IImDmProminenceAnalytics iImDmProminenceAnalyticsLIZ = C1673406gu.LIZ();
            if (iImDmProminenceAnalyticsLIZ != null && (strLIZ = iImDmProminenceAnalyticsLIZ.LIZ(str6)) != null) {
                str7 = strLIZ;
            }
            c830490Whz.put("safety_flag_source", str7);
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = -1;
            }
            c830490Whz.put("relation_tag", String.valueOf(iIntValue));
        }
        interfaceC1493105sv.sendEvent("block_confirm", c830490Whz);
    }
}
