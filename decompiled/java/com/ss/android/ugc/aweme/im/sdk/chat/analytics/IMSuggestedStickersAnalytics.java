package com.ss.android.ugc.aweme.im.sdk.chat.analytics;

import X.AbstractC1645706cR;
import X.C13LP;
import X.C1645806cS;
import X.C823170WQx;
import X.EnumC1644606cG;
import X.EnumC454490Hrz;
import X.InterfaceC1493105sv;
import android.util.ArrayMap;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.service.analytics.IIMSuggestedStickersAnalytics;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class IMSuggestedStickersAnalytics implements IIMSuggestedStickersAnalytics {
    public static final IMSuggestedStickersAnalytics LIZIZ = new IMSuggestedStickersAnalytics();
    public static final C823170WQx<String> LIZJ = new C823170WQx<>();
    public static Map<String, String> LIZLLL;

    public static final class Service implements IIMSuggestedStickersAnalytics {
        public final /* synthetic */ IMSuggestedStickersAnalytics LIZIZ = IMSuggestedStickersAnalytics.LIZIZ;

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMSuggestedStickersAnalytics
        public final void LIZ(InterfaceC1493105sv interfaceC1493105sv) {
            this.LIZIZ.LIZ(interfaceC1493105sv);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMSuggestedStickersAnalytics
        public final void LIZIZ(String str, InterfaceC1493105sv interfaceC1493105sv) {
            this.LIZIZ.LIZIZ(str, interfaceC1493105sv);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMSuggestedStickersAnalytics
        public final void LIZJ(String str) {
            this.LIZIZ.LIZJ(str);
        }

        @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMSuggestedStickersAnalytics
        public final void LIZLLL(String str, String str2, EnumC1644606cG enumC1644606cG, String str3, int i, Set<String> set, boolean z) {
            this.LIZIZ.LIZLLL(str, str2, enumC1644606cG, str3, i, set, z);
        }
    }

    public static ArrayMap LJ(Pair... pairArr) {
        ArrayMap arrayMap = new ArrayMap();
        for (Pair pair : pairArr) {
            arrayMap.put(pair.getFirst(), pair.getSecond());
        }
        return arrayMap;
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMSuggestedStickersAnalytics
    public final void LIZ(InterfaceC1493105sv interfaceC1493105sv) {
        Map<String, String> map = LIZLLL;
        if (map != null) {
            C823170WQx<String> c823170WQx = LIZJ;
            ArrayMap arrayMapLJ = LJ(new Pair("sticker_id_list", C13LP.LJJLIIIJ(c823170WQx, ",", null, null, 0, null, null, 62)));
            arrayMapLJ.putAll(map);
            interfaceC1493105sv.sendEvent("show_suggested_stickers_panel", arrayMapLJ);
            LIZLLL = null;
            c823170WQx.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMSuggestedStickersAnalytics
    public final void LIZJ(String str) {
        LIZJ.add(str);
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMSuggestedStickersAnalytics
    public final void LIZIZ(String str, InterfaceC1493105sv interfaceC1493105sv) {
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put("enter_from", "chat");
        arrayMap.put("enter_method", EnumC454490Hrz.KEYWORD_SUGGESTION.getValue());
        if (str != null) {
            arrayMap.put("sticker_id", str);
        }
        interfaceC1493105sv.sendEvent("click_report", arrayMap);
    }

    @Override // com.ss.android.ugc.aweme.im.service.analytics.IIMSuggestedStickersAnalytics
    public final void LIZLLL(String str, String str2, EnumC1644606cG enumC1644606cG, String str3, int i, Set<String> set, boolean z) {
        String str4;
        LIZJ.clear();
        Pair[] pairArr = new Pair[8];
        pairArr[0] = new Pair("enter_from", "chat");
        pairArr[1] = new Pair("conversation_id", String.valueOf(str));
        pairArr[2] = new Pair("to_user_id", String.valueOf(str2));
        pairArr[3] = new Pair("chat_type", enumC1644606cG.getValue());
        pairArr[4] = new Pair("suggested_chat_type", str3);
        pairArr[5] = new Pair("num_stickers", String.valueOf(i));
        pairArr[6] = new Pair("panel_type", C13LP.LJJLIIIJ(set, ",", null, null, 0, null, null, 62));
        if (z) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[7] = new Pair("is_sa_duo", str4);
        LIZLLL = LJ(pairArr);
    }

    public final void LJFF(String str, String str2, EnumC1644606cG enumC1644606cG, String str3, int i, AbstractC1645706cR abstractC1645706cR, Set<String> set, boolean z, InterfaceC1493105sv interfaceC1493105sv) {
        String str4;
        Pair[] pairArr = new Pair[9];
        pairArr[0] = new Pair("enter_from", "chat");
        pairArr[1] = new Pair("conversation_id", String.valueOf(str));
        pairArr[2] = new Pair("to_user_id", String.valueOf(str2));
        pairArr[3] = new Pair("chat_type", enumC1644606cG.getValue());
        pairArr[4] = new Pair("suggested_chat_type", str3);
        pairArr[5] = new Pair("action", abstractC1645706cR.LIZ);
        pairArr[6] = new Pair("num_stickers", String.valueOf(i));
        pairArr[7] = new Pair("panel_type", C13LP.LJJLIIIJ(set, ",", null, null, 0, null, null, 62));
        if (z) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[8] = new Pair("is_sa_duo", str4);
        ArrayMap arrayMapLJ = LJ(pairArr);
        if (abstractC1645706cR instanceof C1645806cS) {
            C1645806cS c1645806cS = (C1645806cS) abstractC1645706cR;
            String str5 = c1645806cS.LIZJ;
            if (str5 != null) {
                LIZJ.add(str5);
            }
            arrayMapLJ.put("message_type", c1645806cS.LIZIZ.getValue());
            arrayMapLJ.put("sticker_id", c1645806cS.LIZJ);
        }
        arrayMapLJ.put("sticker_id_list", C13LP.LJJLIIIJ(LIZJ, ",", null, null, 0, null, null, 62));
        interfaceC1493105sv.sendEvent("click_suggested_stickers_panel", arrayMapLJ);
    }
}
