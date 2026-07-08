package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C0IJT;
import X.C1161920gLG;
import X.C1CC2;
import X.C20441214yg;
import X.C2188811AlT;
import X.C474500IjA;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLayoutTrackSetting;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.p;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@SettingsKey("live_ab_label")
public final class LiveAbLabelSetting {
    public static final String DEFAULT = "";
    public static n cache;
    public static final LiveAbLabelSetting INSTANCE = new LiveAbLabelSetting();
    public static String last = "";
    public static String hostABParams = "";

    public final String fallbackValue() {
        return SettingsManager.INSTANCE.getStringValue("live_ab_label", DEFAULT);
    }

    public final String getValue() {
        String str = hostABParams;
        return str.length() == 0 ? SettingsManager.INSTANCE.getStringValue("live_ab_label", DEFAULT) : str;
    }

    public final void release() {
        hostABParams = "";
    }

    public final boolean getBooleanValue(String str) {
        k kVarLJJIIZ;
        try {
            String value = getValue();
            if (Intrinsics.LJFF(value, "")) {
                if (str != null) {
                    LiveAbLabelSetting liveAbLabelSetting = INSTANCE;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("value=");
                    sbLIZ.append(hostABParams);
                    sbLIZ.append(", fallback=");
                    sbLIZ.append(liveAbLabelSetting.fallbackValue());
                    liveAbLabelSetting.log(str, -1, C2188811AlT.LIZIZ(sbLIZ), null);
                }
                return false;
            }
            if (!Intrinsics.LJFF(value, last)) {
                last = value;
                new p();
                cache = p.LIZJ(value).LJIILIIL();
            }
            n nVar = cache;
            if (nVar == null || (kVarLJJIIZ = nVar.LJJIIZ(str)) == null) {
                return false;
            }
            return kVarLJJIIZ.LJ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (str != null) {
                LiveAbLabelSetting liveAbLabelSetting2 = INSTANCE;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("value=");
                sbLIZ2.append(hostABParams);
                sbLIZ2.append(", fallback=");
                sbLIZ2.append(liveAbLabelSetting2.fallbackValue());
                liveAbLabelSetting2.log(str, -2, C2188811AlT.LIZIZ(sbLIZ2), null);
            }
            C1CC2.LIZ("getBooleanValue error", th);
            return false;
        }
    }

    public final int getIntValue(String str) {
        k kVarLJJIIZ;
        try {
            String value = getValue();
            if (Intrinsics.LJFF(value, "")) {
                if (str != null) {
                    LiveAbLabelSetting liveAbLabelSetting = INSTANCE;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("value=");
                    sbLIZ.append(hostABParams);
                    sbLIZ.append(", fallback=");
                    sbLIZ.append(liveAbLabelSetting.fallbackValue());
                    liveAbLabelSetting.log(str, -1, C2188811AlT.LIZIZ(sbLIZ), null);
                }
                return 0;
            }
            if (!Intrinsics.LJFF(value, last)) {
                last = value;
                new p();
                cache = p.LIZJ(value).LJIILIIL();
            }
            n nVar = cache;
            if (nVar == null || (kVarLJJIIZ = nVar.LJJIIZ(str)) == null) {
                return 0;
            }
            return kVarLJJIIZ.LJIIJJI();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (str != null) {
                LiveAbLabelSetting liveAbLabelSetting2 = INSTANCE;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("value=");
                sbLIZ2.append(hostABParams);
                sbLIZ2.append(", fallback=");
                sbLIZ2.append(liveAbLabelSetting2.fallbackValue());
                liveAbLabelSetting2.log(str, -2, C2188811AlT.LIZIZ(sbLIZ2), null);
            }
            C1CC2.LIZ("getIntValue error", th);
            return 0;
        }
    }

    public final String getStringValue(String str) {
        k kVarLJJIIZ;
        String strLJIL;
        try {
            String value = getValue();
            if (Intrinsics.LJFF(value, "")) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("value=");
                sbLIZ.append(hostABParams);
                sbLIZ.append(", fallback=");
                sbLIZ.append(fallbackValue());
                log(str, -1, C2188811AlT.LIZIZ(sbLIZ), null);
                return "";
            }
            if (!Intrinsics.LJFF(value, last)) {
                last = value;
                new p();
                cache = p.LIZJ(value).LJIILIIL();
            }
            n nVar = cache;
            if (nVar == null || (kVarLJJIIZ = nVar.LJJIIZ(str)) == null || (strLJIL = kVarLJJIIZ.LJIL()) == null) {
                return "";
            }
            return strLJIL;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LiveAbLabelSetting liveAbLabelSetting = INSTANCE;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("value=");
            sbLIZ2.append(hostABParams);
            sbLIZ2.append(", fallback=");
            sbLIZ2.append(liveAbLabelSetting.fallbackValue());
            liveAbLabelSetting.log(str, -2, C2188811AlT.LIZIZ(sbLIZ2), null);
            C1CC2.LIZ("getBooleanValue error", th);
            return "";
        }
    }

    public final void updateHostABParams(String str) {
        String string;
        k kVarLJJIIZ;
        try {
            new p();
            kVarLJJIIZ = p.LIZJ(str).LJIILIIL().LJJIIZ("linkmic_ab_params");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1CC2.LIZ("parse abParams error", e);
        }
        if (kVarLJJIIZ != null) {
            string = kVarLJJIIZ.toString();
            if (string == null) {
                string = "";
            }
        } else {
            string = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateHostABParams: ");
        sbLIZ.append(string);
        C20441214yg.LJIIIZ("LiveAbLabelSetting", C2188811AlT.LIZIZ(sbLIZ));
        hostABParams = string;
    }

    private final C474500IjA sendLog(String str, Map<String, String> map) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
        return c474500IjALIZ;
    }

    public final void log(String str, int i, String str2, String str3) {
        if (!MultiGuestLayoutTrackSetting.INSTANCE.isTrackEnable()) {
            return;
        }
        HashMap map = new HashMap();
        map.put("user_id", String.valueOf(((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).getCurUserId()));
        map.put("function_name", str);
        map.put("action_detail", str2);
        map.put("to_user_type", "anchor");
        map.put("drop_reason", "");
        map.put("error_code", String.valueOf(i));
        if (str3 == null) {
            str3 = "";
        }
        map.put("error_msg", str3);
        map.put("is_moderator", CardStruct.IStatusCode.DEFAULT);
        sendLog("livesdk_multi_function_call_result", map);
    }
}
