package com.bytedance.android.livesdk.chatroom.ui.extracard;

import X.C08CX;
import X.C093Y;
import X.C09CT;
import X.C09JN;
import X.C0IJT;
import X.C11S5;
import X.C1701940uOG;
import X.C20441214yg;
import X.C2188811AlT;
import X.C465410IMx;
import X.C469620IbI;
import X.C474500IjA;
import X.C480460Ism;
import X.C786410Ut5;
import com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.ILiveNewStyleCardWidget;
import com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.LivePromoteParentWidget;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePromoteGoLiveOptimizeSetting;
import com.bytedance.android.strategy.StrategyApi;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.room.EncourageGoLiveCard;
import webcast.api.room.StrategyData;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveExtraCardFrequencyManager {
    public static final LiveExtraCardFrequencyManager LIZ = new LiveExtraCardFrequencyManager();
    public static final Keva LIZIZ = KevaImpl.getRepo("repo_live_extra_card", 0);
    public static Map<String, Set<String>> LIZJ;
    public static C465410IMx LIZLLL;

    public static Map LIZIZ() {
        Map<String, Set<String>> map = LIZJ;
        if (map == null || map.isEmpty()) {
            LIZJ = new LinkedHashMap();
            for (String str : LIZIZ.getStringSet("KEY_CARD_IDS", C08CX.INSTANCE)) {
                Set<String> stringSet = LIZIZ.getStringSet(str, C08CX.INSTANCE);
                Map<String, Set<String>> map2 = LIZJ;
                if (map2 != null) {
                    map2.put(str, stringSet);
                }
            }
        }
        return LIZJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZJ(com.bytedance.android.livesdk.chatroom.ui.extracard.LiveExtraCardFrequencyManager r7) throws org.json.JSONException {
        /*
            r7.getClass()
            com.bytedance.android.livesdk.livesetting.broadcast.LivePromoteGoLiveOptimizeSetting r0 = com.bytedance.android.livesdk.livesetting.broadcast.LivePromoteGoLiveOptimizeSetting.INSTANCE
            boolean r0 = r0.optimizeShowCardsRecord()
            r6 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r5 = "currentTime"
            if (r0 == 0) goto L4d
            java.util.Map r0 = LIZIZ()
            if (r0 == 0) goto L4a
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L4a
            com.ss.android.ugc.aweme.utils.GsonProvider r0 = X.C7740030o.LIZ()
            com.google.gson.Gson r1 = r0.getGson()
            java.util.Map r0 = LIZIZ()
            com.google.gson.k r0 = com.bytedance.mt.protector.impl.GsonProtectorUtils.toJsonTree(r1, r0)
            com.google.gson.n r4 = r0.LJIILIIL()
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = (long) r6
            long r2 = r2 / r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r4.LJJIII(r0, r5)
            com.ss.android.ugc.aweme.utils.GsonProvider r0 = X.C7740030o.LIZ()
            com.google.gson.Gson r0 = r0.getGson()
            java.lang.String r0 = com.bytedance.mt.protector.impl.GsonProtectorUtils.toJson(r0, r4)
        L48:
            if (r0 != 0) goto L4c
        L4a:
            java.lang.String r0 = ""
        L4c:
            return r0
        L4d:
            com.bytedance.keva.Keva r2 = com.bytedance.android.livesdk.chatroom.ui.extracard.LiveExtraCardFrequencyManager.LIZIZ
            X.08CX r1 = X.C08CX.INSTANCE
            java.lang.String r0 = "KEY_CARD_IDS"
            java.util.Set r1 = r2.getStringSet(r0, r1)
            if (r1 == 0) goto L4a
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L4a
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            java.util.Iterator r7 = r1.iterator()
        L68:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto La3
            java.lang.Object r3 = r7.next()
            java.lang.String r3 = (java.lang.String) r3
            com.bytedance.keva.Keva r1 = com.bytedance.android.livesdk.chatroom.ui.extracard.LiveExtraCardFrequencyManager.LIZIZ
            X.08CX r0 = X.C08CX.INSTANCE
            java.util.Set r1 = r1.getStringSet(r3, r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L88
            java.lang.Object r0 = org.json.JSONObject.NULL
            r4.put(r3, r0)
            goto L68
        L88:
            org.json.JSONArray r2 = new org.json.JSONArray
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L91:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L9f
            java.lang.Object r0 = r1.next()
            r2.put(r0)
            goto L91
        L9f:
            r4.put(r3, r2)
            goto L68
        La3:
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = (long) r6
            long r2 = r2 / r0
            r4.put(r5, r2)
            java.lang.String r0 = X.C786410Ut5.J3(r4)
            goto L48
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.ui.extracard.LiveExtraCardFrequencyManager.LIZJ(com.bytedance.android.livesdk.chatroom.ui.extracard.LiveExtraCardFrequencyManager):java.lang.String");
    }

    public static void LJII(String str) {
        Set set;
        if (str == null) {
            C20441214yg.LIZIZ("LiveExtraCardFrequencyManager", "recordCardShowTime: cardId is null");
            return;
        }
        String strValueOf = String.valueOf(System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("recordCardShowTime: cardId=");
        sbLIZ.append(str);
        sbLIZ.append(", showTime=");
        sbLIZ.append(strValueOf);
        sbLIZ.append(", optimizeShowCardsRecord=");
        LivePromoteGoLiveOptimizeSetting livePromoteGoLiveOptimizeSetting = LivePromoteGoLiveOptimizeSetting.INSTANCE;
        sbLIZ.append(livePromoteGoLiveOptimizeSetting.optimizeShowCardsRecord());
        C20441214yg.LIZIZ("LiveExtraCardFrequencyManager", C2188811AlT.LIZIZ(sbLIZ));
        Keva keva = LIZIZ;
        C08CX c08cx = C08CX.INSTANCE;
        Set<String> stringSet = keva.getStringSet("KEY_CARD_IDS", c08cx);
        if (stringSet.add(str)) {
            keva.storeStringSet("KEY_CARD_IDS", stringSet);
        }
        Set<String> stringSet2 = keva.getStringSet(str, c08cx);
        stringSet2.add(strValueOf);
        keva.storeStringSet(str, stringSet2);
        if (livePromoteGoLiveOptimizeSetting.optimizeShowCardsRecord()) {
            if (LIZJ == null) {
                LIZJ = new LinkedHashMap();
            }
            Map<String, Set<String>> map = LIZJ;
            if (map != null && map.containsKey(str)) {
                Map<String, Set<String>> map2 = LIZJ;
                if (map2 != null && (set = (Set) ((LinkedHashMap) map2).get(str)) != null) {
                    set.add(strValueOf);
                    return;
                }
                return;
            }
            Map<String, Set<String>> map3 = LIZJ;
            if (map3 == null) {
                return;
            }
            map3.put(str, C093Y.LJ(strValueOf));
        }
    }

    public static void LJIIIIZZ(int i) {
        String str;
        C469620IbI.LIZ.getClass();
        StrategyData strategyDataLIZIZ = C469620IbI.LIZIZ(6, null, true, false, false);
        if (strategyDataLIZIZ != null && (str = strategyDataLIZIZ.strategyId) != null) {
            C480460Ism.LIZ().getClass();
            StrategyApi strategyApi = (StrategyApi) C480460Ism.LIZIZ(StrategyApi.class);
            if (strategyApi == null) {
                return;
            }
            strategyApi.strategyReport(6, i, str).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new C09JN() { // from class: X.0Ibu
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("LiveExtraCardFrequencyManager@260.reportCardEvent$1");
                    C1C7U.LIZIZ("LiveExtraCardFrequencyManager@260.reportCardEvent$1");
                }
            });
        }
    }

    public final void LJFF(ILiveNewStyleCardWidget iLiveNewStyleCardWidget) {
        EncourageGoLiveCard encourageGoLiveCard;
        if (iLiveNewStyleCardWidget instanceof LivePromoteParentWidget) {
            encourageGoLiveCard = ((LivePromoteParentWidget) iLiveNewStyleCardWidget).LLILZLL;
        } else {
            encourageGoLiveCard = null;
        }
        LIZLLL(encourageGoLiveCard, 5, true, 0, "scroll up", null);
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class CardDisplayResult {

        @C09CT("displayable")
        public final boolean displayable;

        @C09CT("reason")
        public final String reason;

        public CardDisplayResult() {
            this(false, "");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CardDisplayResult)) {
                return false;
            }
            CardDisplayResult cardDisplayResult = (CardDisplayResult) obj;
            return this.displayable == cardDisplayResult.displayable && Intrinsics.LJFF(this.reason, cardDisplayResult.reason);
        }

        public final int hashCode() {
            return (C786410Ut5.Z2(this.displayable) * 31) + this.reason.hashCode();
        }

        public final String toString() {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CardDisplayResult(displayable=");
            sbLIZ.append(this.displayable);
            sbLIZ.append(", reason=");
            sbLIZ.append(this.reason);
            sbLIZ.append(')');
            return C2188811AlT.LIZIZ(sbLIZ);
        }

        public CardDisplayResult(boolean z, String str) {
            this.displayable = z;
            this.reason = str;
        }
    }

    public static void LJ(String str, String str2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_ug_node_filter");
        c474500IjALIZ.LJJII("in_feed_card", "biz_name");
        c474500IjALIZ.LJJII(str, "biz_id");
        c474500IjALIZ.LJJII(2, "node_seq");
        c474500IjALIZ.LJJII(str2, "filter_code");
        c474500IjALIZ.LJJII(1, "filter_side");
        c474500IjALIZ.LIZ();
    }

    public static boolean LIZ(long j, long j2, String str) {
        Set<String> stringSet;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("freqCanShow: cardId=");
        sbLIZ.append(str);
        sbLIZ.append(", intervalSecond=");
        sbLIZ.append(j);
        sbLIZ.append(", maxCount=");
        sbLIZ.append(j2);
        C20441214yg.LIZIZ("LiveExtraCardFrequencyManager", C2188811AlT.LIZIZ(sbLIZ));
        if (LivePromoteGoLiveOptimizeSetting.INSTANCE.optimizeShowCardsRecord()) {
            Map mapLIZIZ = LIZIZ();
            if (mapLIZIZ == null || (stringSet = (Set) ((LinkedHashMap) mapLIZIZ).get(str)) == null) {
                stringSet = C08CX.INSTANCE;
            }
        } else {
            stringSet = LIZIZ.getStringSet(str, C08CX.INSTANCE);
        }
        long jCurrentTimeMillis = (System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) - j;
        Iterator<String> it2 = stringSet.iterator();
        boolean z = false;
        int i = 0;
        while (it2.hasNext()) {
            if (CastLongProtector.parseLong(it2.next()) > jCurrentTimeMillis) {
                i++;
            }
        }
        if (i < j2) {
            z = true;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("freqCanShow: cardId=");
        sbLIZ2.append(str);
        sbLIZ2.append(", count=");
        sbLIZ2.append(i);
        sbLIZ2.append(", thresholdTime=");
        sbLIZ2.append(jCurrentTimeMillis);
        sbLIZ2.append(", result=");
        sbLIZ2.append(z);
        C20441214yg.LIZIZ("LiveExtraCardFrequencyManager", C2188811AlT.LIZIZ(sbLIZ2));
        return z;
    }

    public static void LJI(EncourageGoLiveCard encourageGoLiveCard, int i, String str) {
        String str2;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_golive_special_card_ttm_monitor");
        Object objValueOf = "";
        if (encourageGoLiveCard == null || (str2 = encourageGoLiveCard.cardId) == null) {
            str2 = "";
        }
        c474500IjALIZ.LJJII(str2, "card_id");
        if (encourageGoLiveCard != null) {
            objValueOf = Integer.valueOf(encourageGoLiveCard.style);
        }
        c474500IjALIZ.LJJII(objValueOf, "card_type");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "result");
        c474500IjALIZ.LJJII(str, "description");
        c474500IjALIZ.LIZ();
    }

    public static final class ExtraCardData {

        @C09CT("enter_from")
        public String enterFrom;

        @C09CT("pos")
        public Integer pos;

        @C09CT("room_id")
        public List<Long> roomIds;

        @C09CT("watch_duration")
        public List<Long> watchDurations;

        public ExtraCardData() {
            this(null, null, null, null);
        }

        public ExtraCardData(List<Long> list, List<Long> list2, String str, Integer num) {
            this.roomIds = list;
            this.watchDurations = list2;
            this.enterFrom = str;
            this.pos = num;
        }
    }

    public static void LIZLLL(EncourageGoLiveCard encourageGoLiveCard, int i, boolean z, Integer num, String str, String str2) {
        String str3;
        Object objValueOf;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_golive_special_card_monitor");
        if (encourageGoLiveCard == null || (str3 = encourageGoLiveCard.cardId) == null) {
            str3 = "";
        }
        c474500IjALIZ.LJJII(str3, "card_id");
        if (encourageGoLiveCard == null) {
            objValueOf = "";
        } else {
            objValueOf = Integer.valueOf(encourageGoLiveCard.style);
        }
        c474500IjALIZ.LJJII(objValueOf, "card_type");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "stage");
        c474500IjALIZ.LJJII(Integer.valueOf(z ? 1 : 0), "stage_result");
        c474500IjALIZ.LJJII(num, "sub_stage_code");
        c474500IjALIZ.LJJII(str, "description");
        if (str2 == null) {
            str2 = "";
        }
        c474500IjALIZ.LJJII(str2, "extra");
        c474500IjALIZ.LIZ();
    }
}
