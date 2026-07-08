package com.ss.android.ugc.aweme.im.sdk.chatdetail.analytics;

import X.C0I0B;
import X.C0PEM;
import X.C0Y8T;
import X.C0YSQ;
import X.C0ZDX;
import X.C0ZFW;
import X.C1229100i5c;
import X.C1461005nk;
import X.C1527905yX;
import X.C1528605ye;
import X.C1528705yf;
import X.C1528805yg;
import X.C1529205yk;
import X.C1529305yl;
import X.C1529405ym;
import X.C1529805yq;
import X.C1530005ys;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2296808zG;
import X.C23250099c;
import X.C461720I8s;
import X.C830490Whz;
import X.C869590Y9l;
import X.C892250YzP;
import X.InterfaceC1493105sv;
import X.InterfaceC1493505sz;
import X.InterfaceC876950Yaj;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.service.analytics.IIMChatDetailAnalytics;
import com.ss.android.ugc.aweme.im.service.analytics.IMessageAnalyticsUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class IMGroupChatDetailAnalytics implements IIMChatDetailAnalytics {
    public static final IMGroupChatDetailAnalytics LIZ = new IMGroupChatDetailAnalytics();
    public static String LIZIZ = "";
    public static String LIZJ = "";
    public static String LIZLLL = "";
    public static String LJ = "";
    public static String LJFF = "";

    public static final class Service implements IIMChatDetailAnalytics {
        public final /* synthetic */ IMGroupChatDetailAnalytics LIZ = IMGroupChatDetailAnalytics.LIZ;

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMChatDetailAnalytics
        public final void LIZ(String str) {
            this.LIZ.LIZ("share");
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMChatDetailAnalytics
        public final void LIZJ(int i, C0Y8T c0y8t, String str, List<String> list, String str2, String str3, String str4, String str5, Map<String, String> map, String str6, boolean z, InterfaceC1493105sv interfaceC1493105sv) {
            this.LIZ.LIZJ(i, c0y8t, str, list, str2, str3, str4, str5, map, str6, z, interfaceC1493105sv);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMChatDetailAnalytics
        public final void LIZLLL(String str, IMContact iMContact, String str2, String str3, Map<String, String> map, InterfaceC1493105sv interfaceC1493105sv) {
            this.LIZ.LIZLLL(str, iMContact, str2, str3, map, interfaceC1493105sv);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMChatDetailAnalytics
        public final void LJ(String str, InterfaceC1493105sv interfaceC1493105sv) {
            this.LIZ.LJ(str, interfaceC1493105sv);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMChatDetailAnalytics
        public final void LJFF(String str, Pair<? extends Object, String>[] pairArr, InterfaceC1493105sv interfaceC1493105sv) {
            this.LIZ.LJFF(str, pairArr, interfaceC1493105sv);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMChatDetailAnalytics
        public final void LJII(int i, int i2, int i3, InterfaceC1493105sv interfaceC1493105sv) {
            this.LIZ.LJII(i, i2, i3, interfaceC1493105sv);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMChatDetailAnalytics
        public final void LJIIIZ(String str, String str2) {
            this.LIZ.LJIIIZ(str, str2);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMChatDetailAnalytics
        public final void LJIIIIZZ() {
            this.LIZ.getClass();
            IMGroupChatDetailAnalytics.LIZJ = "share_post_and_group_chat_panel";
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMChatDetailAnalytics
        public final void LIZIZ(String str) {
            this.LIZ.getClass();
            IMGroupChatDetailAnalytics.LIZLLL = str;
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMChatDetailAnalytics
        public final void LJI(String str) {
            this.LIZ.getClass();
            IMGroupChatDetailAnalytics.LIZIZ = str;
        }
    }

    public static String LJIIJJI() {
        return C1529305yl.LIZ(Boolean.valueOf(C0ZFW.LJIJ(LJFF)));
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMChatDetailAnalytics
    public final void LJIIIIZZ() {
        LIZJ = "share_post_and_group_chat_panel";
    }

    public static String LJIIJ(List list) {
        String strLIZIZ = "";
        if (list != null) {
            Iterator it2 = list.iterator();
            int i = 0;
            while (it2.hasNext()) {
                String str = (String) it2.next();
                if (i == 0) {
                    strLIZIZ = str;
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(strLIZIZ);
                    sbLIZ.append(',');
                    sbLIZ.append(str);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
                i++;
            }
        }
        return strLIZIZ;
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMChatDetailAnalytics
    public final void LIZ(String str) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1529405ym(str, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMChatDetailAnalytics
    public final void LIZIZ(String str) {
        LIZLLL = str;
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMChatDetailAnalytics
    public final void LJI(String str) {
        LIZIZ = str;
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMChatDetailAnalytics
    public final void LJ(String str, InterfaceC1493105sv interfaceC1493105sv) {
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("conversation_id", LJFF);
        c830490Whz.put("is_master", LJIIJJI());
        c830490Whz.put("member_type", str);
        if (LIZJ.length() > 0) {
            c830490Whz.put("enter_method", LIZJ);
        }
        if (LIZLLL.length() > 0) {
            c830490Whz.put("enter_from", LIZLLL);
        }
        interfaceC1493105sv.sendEvent("choose_group_inv", c830490Whz);
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMChatDetailAnalytics
    public final void LJIIIZ(String str, String str2) {
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("search_group_member", C2097608Jq.LJIIIIZZ(new Pair(LIZIZ, "enter_from"), new Pair(str2, "type"), new Pair(str, "enter_method")));
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMChatDetailAnalytics
    public final void LJFF(String str, Pair<? extends Object, String>[] pairArr, InterfaceC1493105sv interfaceC1493105sv) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1528705yf(pairArr, interfaceC1493105sv, str, null), 3);
    }

    public final void LJIILIIL(String str, Map<String, String> map, InterfaceC1493105sv interfaceC1493105sv) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1528605ye(map, interfaceC1493105sv, str, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMChatDetailAnalytics
    public final void LJII(int i, int i2, int i3, InterfaceC1493105sv interfaceC1493105sv) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1528805yg(i, i2, i3, interfaceC1493105sv, null), 3);
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMChatDetailAnalytics
    public final void LIZLLL(String str, IMContact iMContact, String str2, String str3, Map<String, String> map, InterfaceC1493105sv interfaceC1493105sv) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1529805yq(str, str2, str3, iMContact, map, interfaceC1493105sv, null), 3);
    }

    public static void LJIIL(String str, String str2, String str3, String str4, C869590Y9l c869590Y9l, String str5, int i) {
        InterfaceC1493505sz interfaceC1493505szLIZIZ;
        String strLJIILJJIL;
        Map<String, String> mapLJ;
        List<Pair<String, String>> listLJIIIZ;
        String strLJ = null;
        if ((i & 8) != 0) {
            str4 = null;
        }
        if ((i & 16) != 0) {
            c869590Y9l = null;
        }
        if ((i & 32) != 0) {
            interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
        } else {
            interfaceC1493505szLIZIZ = null;
        }
        if ((i & 64) != 0) {
            str5 = null;
        }
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("enter_from", str);
        c830490Whz.put("chat_type", C1229100i5c.LIZLLL(LJFF));
        c830490Whz.put("group_type", C1229100i5c.LJI(LJFF));
        c830490Whz.put("group_role", String.valueOf(C1527905yX.LIZ(Integer.valueOf(C1461005nk.LIZ.LJFF(Long.valueOf(C461720I8s.LIZJ()), LJFF)))));
        if (str4 != null) {
            c830490Whz.put("enter_method", str4);
        }
        c830490Whz.put("conversation_id", LJFF);
        if (str5 != null && str5.length() > 0) {
            c830490Whz.put("process_id", str5);
        }
        c830490Whz.putAll(C1530005ys.LIZ(C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(LJFF)));
        c830490Whz.put("is_master", LJIIJJI());
        c830490Whz.put("object_type", str3);
        c830490Whz.put("object_id", str2);
        if (c869590Y9l == null || (strLJIILJJIL = C0ZDX.LJIILJJIL(c869590Y9l)) == null) {
            strLJIILJJIL = "";
        }
        c830490Whz.put("sticker_id", strLJIILJJIL);
        if (c869590Y9l != null) {
            IMessageAnalyticsUtils.LIZ.getClass();
            IMessageAnalyticsUtils iMessageAnalyticsUtilsLIZ = C892250YzP.LIZ();
            if (iMessageAnalyticsUtilsLIZ != null) {
                strLJ = iMessageAnalyticsUtilsLIZ.LJ(c869590Y9l);
            }
            if (Intrinsics.LJFF(c869590Y9l.getScene(), "aimoji_sticker")) {
                strLJ = "aimoji";
            }
            c830490Whz.put("message_type", strLJ);
            IMessageAnalyticsUtils iMessageAnalyticsUtilsLIZ2 = C892250YzP.LIZ();
            if (iMessageAnalyticsUtilsLIZ2 != null && (listLJIIIZ = iMessageAnalyticsUtilsLIZ2.LJIIIZ(c869590Y9l)) != null) {
                for (Pair<String, String> pair : listLJIIIZ) {
                    c830490Whz.put(pair.getFirst(), pair.getSecond());
                }
            }
            IMessageAnalyticsUtils.LIZ.getClass();
            IMessageAnalyticsUtils iMessageAnalyticsUtilsLIZ3 = C892250YzP.LIZ();
            if (iMessageAnalyticsUtilsLIZ3 == null || (mapLJ = iMessageAnalyticsUtilsLIZ3.LIZ(c869590Y9l)) == null) {
                mapLJ = C2097608Jq.LJ();
            }
            c830490Whz.putAll(mapLJ);
            String str6 = mapLJ.get("business_scenario");
            if (str6 != null && str6.length() > 0) {
                c830490Whz.put("dm_business_scenario", str6);
            }
            String str7 = mapLJ.get("business_source");
            if (str7 != null && str7.length() > 0) {
                c830490Whz.put("dm_business_source", str7);
            }
        }
        interfaceC1493505szLIZIZ.getClass();
        C20684815ws.LJIILLIIL("click_report", c830490Whz);
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMChatDetailAnalytics
    public final void LIZJ(int i, C0Y8T c0y8t, String str, List<String> list, String str2, String str3, String str4, String str5, Map<String, String> map, String str6, boolean z, InterfaceC1493105sv interfaceC1493105sv) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1529205yk(c0y8t, str4, str, i, str2, str6, str3, str5, z, map, list, interfaceC1493105sv, null), 3);
    }
}
