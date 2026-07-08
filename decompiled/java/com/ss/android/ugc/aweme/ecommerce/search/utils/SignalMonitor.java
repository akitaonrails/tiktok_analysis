package com.ss.android.ugc.aweme.ecommerce.search.utils;

import X.AnonymousClass0378;
import X.C09CT;
import X.C0PEM;
import X.C12869051v;
import X.C1312105Bn;
import X.C1312205Bo;
import X.C1312305Bp;
import X.C20684815ws;
import X.C2188811AlT;
import X.C23250099c;
import X.C276360AsM;
import X.C5185020h;
import X.C817503Hh;
import X.InterfaceC1164530gPT;
import X.InterfaceC20685415wy;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.search.utils.SignalMonitor;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class SignalMonitor {
    public static boolean LIZIZ;
    public static final SignalMonitor LIZ = new SignalMonitor();
    public static final String LIZJ = String.valueOf(new Date().getTime());
    public static final Map<String, SignalRecord> LIZLLL = new LinkedHashMap();
    public static final ConcurrentHashMap<String, Map<String, SignalRecord>> LJ = new ConcurrentHashMap<>();
    public static final Keva LJFF = Keva.getRepo("signal_monitor_sp");
    public static final List<String> LJI = new ArrayList();

    static {
        LIZJ();
    }

    public static void LIZJ() {
        if (((Boolean) C276360AsM.LIZ.getValue()).booleanValue() && !LIZIZ) {
            C20684815ws.LIZ(new InterfaceC20685415wy() { // from class: X.05Bq
                @Override // X.InterfaceC20685415wy
                public void onEvent(String str) {
                    SignalMonitor signalMonitor = SignalMonitor.LIZ;
                    JSONObject jSONObject = new JSONObject();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    signalMonitor.getClass();
                    SignalMonitor.LJ(jSONObject, str, linkedHashMap);
                }

                @Override // X.InterfaceC20685415wy
                public final void LIZ(String str, Map<String, String> map) {
                    SignalMonitor signalMonitor = SignalMonitor.LIZ;
                    JSONObject jSONObject = new JSONObject();
                    signalMonitor.getClass();
                    SignalMonitor.LJ(jSONObject, str, map);
                }

                @Override // X.InterfaceC20685415wy
                public final void onEvent(String str, JSONObject jSONObject) {
                    SignalMonitor signalMonitor = SignalMonitor.LIZ;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    signalMonitor.getClass();
                    SignalMonitor.LJ(jSONObject, str, linkedHashMap);
                }
            });
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C1312105Bn(null), 2);
            LIZ("cold_start_cnt");
            AnonymousClass0378.LIZ().LIZLLL("ec_search_card_signal", new InterfaceC1164530gPT() { // from class: X.0DYr
                public static void LIZ(String str, String str2) {
                    if (Intrinsics.LJFF(str2, "show")) {
                        SignalMonitor signalMonitor = SignalMonitor.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("search_card_show_cnt");
                        sbLIZ.append(str);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        signalMonitor.getClass();
                        if (SignalMonitor.LJFF(strLIZIZ)) {
                            SignalMonitor.LIZ("search_card_show_cnt");
                            return;
                        }
                        return;
                    }
                    if (!Intrinsics.LJFF(str2, "click")) {
                        return;
                    }
                    SignalMonitor.LIZ.getClass();
                    SignalMonitor.LIZ("search_card_click_cnt");
                }

                @Override // X.InterfaceC1164530gPT
                public final void onEvent(String str, String str2) {
                    try {
                        JSONObject jSONObject = new JSONObject(str2);
                        LIZ(jSONObject.optString("aweme_id"), jSONObject.optString("signal"));
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            });
            LIZIZ = true;
        }
    }

    public static final class SignalRecord implements Serializable {
        public static final int $stable = 8;

        @C09CT("cnt")
        public int cnt;

        @C09CT("extra")
        public final String extra;

        public SignalRecord() {
            this(0, "");
        }

        public final void setCnt(int i) {
            this.cnt = i;
        }

        public SignalRecord(int i, String str) {
            this.cnt = i;
            this.extra = str;
        }
    }

    public static void LIZ(String str) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) LIZLLL;
        SignalRecord signalRecord = (SignalRecord) linkedHashMap.get(str);
        if (signalRecord != null) {
            signalRecord.setCnt(signalRecord.cnt + 1);
        } else {
            linkedHashMap.put(str, new SignalRecord(1, ""));
        }
        if (C1312305Bp.LIZ.contains(str)) {
            C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C1312205Bo(null), 2);
        }
    }

    public static boolean LJFF(String str) {
        ArrayList arrayList = (ArrayList) LJI;
        if (arrayList.contains(str)) {
            return false;
        }
        arrayList.add(str);
        if (arrayList.size() > 200) {
            ListProtector.remove(arrayList, 0);
            return true;
        }
        return true;
    }

    public static int LIZIZ(int i, String str) {
        int i2;
        long time = new Date().getTime() - ((long) ((((i * 24) * 60) * 60) * LSPassThroughRecordSizeConfig.DEFAULT));
        int i3 = 0;
        int i4 = 0;
        for (Map.Entry<String, Map<String, SignalRecord>> entry : LJ.entrySet()) {
            if (CastLongProtector.parseLong(entry.getKey()) > time) {
                SignalRecord signalRecord = entry.getValue().get(str);
                if (signalRecord != null) {
                    i2 = signalRecord.cnt;
                } else {
                    i2 = 0;
                }
                i4 += i2;
            }
        }
        SignalRecord signalRecord2 = (SignalRecord) ((LinkedHashMap) LIZLLL).get(str);
        if (signalRecord2 != null) {
            i3 = signalRecord2.cnt;
        }
        return i4 + i3;
    }

    public static Map LIZLLL(JSONObject jSONObject, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (jSONObject != null) {
            C12869051v.LIZIZ(jSONObject, new C5185020h(linkedHashMap, (Map<String, Object>) 27));
        }
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void LJ(JSONObject jSONObject, String str, Map map) {
        if (str == null) {
            return;
        }
        switch (str.hashCode()) {
            case -1748259885:
                if (str.equals("tiktokec_stay_mall") && !Intrinsics.LJFF(((LinkedHashMap) LIZLLL(jSONObject, map)).get("quit_type"), "not_in_front")) {
                    LIZ("visit_mall_cnt");
                    break;
                }
                break;
            case -1617968008:
                if (str.equals("video_play")) {
                    LinkedHashMap linkedHashMap = (LinkedHashMap) LIZLLL(jSONObject, map);
                    if (Intrinsics.LJFF(linkedHashMap.get("enter_from"), "homepage_hot")) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("video_play");
                        sbLIZ.append(linkedHashMap.get("aweme_id"));
                        if (LJFF(C2188811AlT.LIZIZ(sbLIZ))) {
                            LIZ("video_play_cnt");
                            if (Intrinsics.LJFF(linkedHashMap.get("is_ecom"), "1")) {
                                LIZ("ecom_video_play_cnt");
                            } else if (Intrinsics.LJFF(linkedHashMap.get("is_ad"), "1")) {
                                LIZ("ad_video_play_cnt");
                            }
                        }
                    }
                }
                break;
            case -1433950432:
                if (str.equals("tiktokec_card_click") && Intrinsics.LJFF(((LinkedHashMap) LIZLLL(jSONObject, map)).get("card_subtype"), 3)) {
                    LIZ("search_card_click_cnt");
                    break;
                }
                break;
            case -1410566554:
                if (str.equals("special_shaped_card")) {
                    LinkedHashMap linkedHashMap2 = (LinkedHashMap) LIZLLL(jSONObject, map);
                    if (Intrinsics.LJFF(linkedHashMap2.get("action_type"), "show")) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("card_show_cnt");
                        sbLIZ2.append(linkedHashMap2.get("aweme_id"));
                        if (LJFF(C2188811AlT.LIZIZ(sbLIZ2))) {
                            LIZ("card_show_cnt");
                        }
                    } else if (Intrinsics.LJFF(linkedHashMap2.get("action_type"), "click")) {
                        LIZ("card_click_cnt");
                    }
                }
                break;
            case -979093463:
                if (str.equals("tiktokec_bubble_show")) {
                    LinkedHashMap linkedHashMap3 = (LinkedHashMap) LIZLLL(jSONObject, map);
                    if (Intrinsics.LJFF(linkedHashMap3.get("bubble_position"), "mall_tab") || Intrinsics.LJFF(linkedHashMap3.get("bubble_position"), "mall_top_tab")) {
                        LIZ("show_bubble_cnt");
                    }
                }
                break;
            case -45783451:
                if (str.equals("tiktokec_card_show")) {
                    LinkedHashMap linkedHashMap4 = (LinkedHashMap) LIZLLL(jSONObject, map);
                    if (Intrinsics.LJFF(linkedHashMap4.get("card_subtype"), 3)) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("search_card_show_cnt");
                        sbLIZ3.append(linkedHashMap4.get("aweme_id"));
                        if (LJFF(C2188811AlT.LIZIZ(sbLIZ3))) {
                            LIZ("search_card_show_cnt");
                        }
                    }
                }
                break;
            case 1009601000:
                if (str.equals("tiktokec_red_dot_show")) {
                    LinkedHashMap linkedHashMap5 = (LinkedHashMap) LIZLLL(jSONObject, map);
                    if (Intrinsics.LJFF(linkedHashMap5.get("position"), "mall_tab") || Intrinsics.LJFF(linkedHashMap5.get("position"), "mall_top_tab")) {
                        LIZ("show_red_dot_cnt");
                    }
                }
                break;
            case 1499265855:
                if (str.equals("livesdk_live_show")) {
                    LinkedHashMap linkedHashMap6 = (LinkedHashMap) LIZLLL(jSONObject, map);
                    if (Intrinsics.LJFF(linkedHashMap6.get("enter_from_merge"), "homepage_hot")) {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("livesdk_live_show");
                        sbLIZ4.append(linkedHashMap6.get("room_id"));
                        if (LJFF(C2188811AlT.LIZIZ(sbLIZ4))) {
                            LIZ("video_play_cnt");
                            if (Intrinsics.LJFF(linkedHashMap6.get("is_ecom"), "1")) {
                                LIZ("ecom_live_show_cnt");
                            }
                        }
                    }
                }
                break;
            case 1634636144:
                if (str.equals("tiktokec_icon_effect")) {
                    LinkedHashMap linkedHashMap7 = (LinkedHashMap) LIZLLL(jSONObject, map);
                    if (Intrinsics.LJFF(linkedHashMap7.get("icon_zone"), "mall_tab") || Intrinsics.LJFF(linkedHashMap7.get("icon_zone"), "mall_top_tab")) {
                        LIZ("show_red_dot_cnt");
                    }
                }
                break;
        }
    }
}
