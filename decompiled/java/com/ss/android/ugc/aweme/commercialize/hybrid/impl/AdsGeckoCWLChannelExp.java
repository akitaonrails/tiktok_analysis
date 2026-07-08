package com.ss.android.ugc.aweme.commercialize.hybrid.impl;

import X.C01GW;
import X.C09CT;
import X.C13BV;
import X.C13LP;
import X.C1552050qUV;
import X.C20684815ws;
import X.C2188811AlT;
import X.C452501pT;
import com.bytedance.geckox.listener.IAdsGeckoWhiteListCleanCallback;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class AdsGeckoCWLChannelExp implements IAdsGeckoWhiteListCleanCallback {
    public static final AdsGeckoCWLChannelExp LIZ = new AdsGeckoCWLChannelExp();
    public static final AdsGeckoCWLChannelExpModel LIZIZ = new AdsGeckoCWLChannelExpModel(null, null);
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(135));

    @Override // com.bytedance.geckox.listener.IAdsGeckoWhiteListCleanCallback
    public final void LIZ() {
    }

    @Override // com.bytedance.geckox.listener.IAdsGeckoWhiteListCleanCallback
    public final List<String> LIZJ(String str) {
        String str2;
        boolean z;
        C01GW c01gw = LIZJ;
        AdsGeckoCWLChannelExpModel adsGeckoCWLChannelExpModel = (AdsGeckoCWLChannelExpModel) c01gw.getValue();
        if (adsGeckoCWLChannelExpModel != null) {
            str2 = adsGeckoCWLChannelExpModel.accessKey;
        } else {
            str2 = null;
        }
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z && str2 != null && str2.length() != 0) {
            if (!Intrinsics.LJFF(str, str2)) {
                return C13BV.INSTANCE;
            }
            List<String> list = ((AdsGeckoCWLChannelExpModel) c01gw.getValue()).channelList;
            if (list == null) {
                list = C13BV.INSTANCE;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getAdChannelChannelListByAK return list = ");
            sbLIZ.append(C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62));
            LIZLLL("getAdChannelChannelListByAK", str, "", C2188811AlT.LIZIZ(sbLIZ), true);
            return list;
        }
        LIZLLL("getAdChannelChannelListByAK", str, null, "getAdChannelChannelListByAK params illegal", false);
        return C13BV.INSTANCE;
    }

    public static final class AdsGeckoCWLChannelExpModel {

        @C09CT("access_key")
        public final String accessKey;

        @C09CT("channel_list")
        public final List<String> channelList;

        public AdsGeckoCWLChannelExpModel() {
            this(null, null);
        }

        public AdsGeckoCWLChannelExpModel(String str, List<String> list) {
            this.accessKey = str;
            this.channelList = list;
        }
    }

    @Override // com.bytedance.geckox.listener.IAdsGeckoWhiteListCleanCallback
    public final void LIZIZ(int i, int i2, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("listSize", i);
            jSONObject.put("channelLimit", i2);
            jSONObject.put("channelList", str2);
            jSONObject.put("accessKey", str);
            C20684815ws.LJIJ("ads_gecko_channel_snapshot_event", jSONObject);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    public static void LIZLLL(String str, String str2, String str3, String str4, boolean z) {
        ?? LIZIZ2;
        if (str2 != null && str2.length() != 0 && str3 != null && str3.length() != 0) {
            LIZIZ2 = C1552050qUV.LIZIZ(str2, str3);
        } else {
            LIZIZ2 = -1;
        }
        try {
            ?? jSONObject = new JSONObject();
            jSONObject.put("accessKey", str2);
            jSONObject.put("channel", str3);
            jSONObject.put("is_contained", z);
            jSONObject.put("msg", str4);
            jSONObject.put("gecko_status", LIZIZ2);
            jSONObject.put("from", str);
            C20684815ws.LJIJ("ads_gecko_cwl_channel_event", jSONObject);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
