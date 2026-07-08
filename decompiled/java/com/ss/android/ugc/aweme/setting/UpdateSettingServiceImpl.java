package com.ss.android.ugc.aweme.setting;

import X.C08JS;
import X.C1217100hmG;
import X.C1245240iVe;
import X.C19296910eV;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2252408s6;
import X.C2344809Gs;
import X.C786410Ut5;
import X.C824420WVs;
import X.C891310Yxt;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.push.api.alerttone.service.IMessageAlertToneService;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.setting.serverpush.model.InAppPushSetting;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.ss.android.ugc.aweme.setting.services.IUpdateSettingService;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS32S1101000_2;
import kotlin.jvm.internal.AwS403S0200000_2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public final class UpdateSettingServiceImpl implements IUpdateSettingService {
    public Pair<String, ? extends JSONObject> LIZ;
    public Pair<String, ? extends PushSettings> LIZIZ;

    @Override // com.ss.android.ugc.aweme.setting.services.IUpdateSettingService
    public final int LJIIIZ() {
        int iLIZLLL = LIZLLL("other_channel");
        boolean zLIZ = C824420WVs.LIZ("other_channel");
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getCachedItemStatusWithSystemCheck(");
        sbLIZ.append("other_channel");
        sbLIZ.append(", app: ");
        sbLIZ.append(iLIZLLL);
        sbLIZ.append(", system: ");
        sbLIZ.append(zLIZ);
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        if (zLIZ) {
            return iLIZLLL;
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IUpdateSettingService
    public final boolean LIZJ() {
        PushSettings pushSettingsLJ = LJ();
        return pushSettingsLJ != null && pushSettingsLJ.imPush == 1;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IUpdateSettingService
    public final PushSettings LJ() {
        String currentUserID = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID();
        Pair<String, ? extends PushSettings> pair = this.LIZIZ;
        if (pair != null && Intrinsics.LJFF(pair.getFirst(), currentUserID) && pair.getSecond() != null) {
            return pair.getSecond();
        }
        String currentUserID2 = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID();
        Keva kevaLIZ = C1217100hmG.LIZ();
        if (kevaLIZ == null) {
            return null;
        }
        String string = kevaLIZ.getString(C1217100hmG.LIZIZ(currentUserID2), "");
        if (string.isEmpty()) {
            return null;
        }
        return (PushSettings) C08JS.LIZ(string, PushSettings.class);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IUpdateSettingService
    public final boolean LJFF() {
        InAppPushSetting inAppPushSetting;
        PushSettings pushSettingsLJ = LJ();
        return (pushSettingsLJ == null || (inAppPushSetting = pushSettingsLJ.inAppPushSetting) == null || inAppPushSetting.inAppImPush != 1) ? false : true;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IUpdateSettingService
    public final int LIZ(String str) {
        JSONObject jSONObject;
        try {
            String currentUserID = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID();
            Keva kevaLIZ = C1217100hmG.LIZ();
            String string = "";
            if (kevaLIZ != null) {
                string = kevaLIZ.getString(C1217100hmG.LIZIZ(currentUserID), "");
            }
            JSONObject jSONObject2 = new JSONObject(string);
            JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("in_app_push_setting");
            int iOptInt = jSONObject2.optInt("live_inner_push", 0);
            if (jSONObjectOptJSONObject == null) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = jSONObjectOptJSONObject.put("live_inner_push", iOptInt);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            jSONObject = new JSONObject();
        }
        return jSONObject.optInt(str, 1);
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IUpdateSettingService
    public final void LIZIZ(PushSettings pushSettings) {
        String currentUserID = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID();
        if (currentUserID != null && !a0.LJJJIL(currentUserID)) {
            this.LIZIZ = new Pair<>(currentUserID, pushSettings);
            try {
                String strLIZLLL = C08JS.LIZLLL(pushSettings);
                C1217100hmG.LIZJ(strLIZLLL);
                this.LIZ = new Pair<>(currentUserID, new JSONObject(strLIZLLL));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IUpdateSettingService
    public final int LIZLLL(String str) {
        Pair<String, ? extends JSONObject> pair = this.LIZ;
        if (pair == null) {
            return -1;
        }
        if (Intrinsics.LJFF(pair.getFirst(), ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID())) {
            JSONObject second = pair.getSecond();
            if (second.has(str)) {
                return second.optInt(str, 0);
            }
            JSONObject jSONObjectOptJSONObject = second.optJSONObject("in_app_push_setting");
            if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.has(str)) {
                return jSONObjectOptJSONObject.optInt(str, 0);
            }
            JSONObject jSONObjectOptJSONObject2 = second.optJSONObject("shop_push_setting");
            if (jSONObjectOptJSONObject2 != null && jSONObjectOptJSONObject2.has(str)) {
                return jSONObjectOptJSONObject2.optInt(str, 0);
            }
            JSONArray jSONArrayOptJSONArray = second.optJSONArray("push_settings");
            if (jSONArrayOptJSONArray == null) {
                return -1;
            }
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    JSONObject jSONObject = JSONArrayProtectorUtils.getJSONObject(jSONArrayOptJSONArray, i);
                    if (jSONObject == null) {
                        return -1;
                    }
                    if (Intrinsics.LJFF(str, jSONObject.optString("field"))) {
                        return jSONObject.optInt(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, 0);
                    }
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IUpdateSettingService
    public final void LJI(Map<String, Integer> map) {
        C2252408s6.LIZ(new AwS403S0200000_2((Map) map, (Map<String, Integer>) this, (UpdateSettingServiceImpl) 28));
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IUpdateSettingService
    public final boolean LJIIIIZZ(String str) {
        if (LIZLLL(str) == 1) {
            HashMap<String, Map<String, Integer>> map = C19296910eV.LIZ;
            if (C19296910eV.LIZIZ(str, null)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void LJIIJ(JSONObject jSONObject) {
        String currentUserID = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID();
        if (currentUserID != null && !a0.LJJJIL(currentUserID)) {
            this.LIZ = new Pair<>(currentUserID, jSONObject);
            try {
                this.LIZIZ = new Pair<>(currentUserID, C08JS.LIZ(C786410Ut5.J3(jSONObject), PushSettings.class));
                C1217100hmG.LIZJ(C786410Ut5.J3(jSONObject));
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                C2344809Gs.LJI(e);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IUpdateSettingService
    public final void LJII(int i, int i2) throws JSONException {
        String currentUserID;
        JSONObject jSONObject;
        String first = null;
        IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
        JSONObject second = null;
        if (iUserService != null && (currentUserID = iUserService.getCurrentUserID()) != null && !a0.LJJJIL(currentUserID)) {
            Pair<String, ? extends JSONObject> pair = this.LIZ;
            if (pair != null) {
                first = pair.getFirst();
            }
            if (Intrinsics.LJFF(first, currentUserID)) {
                Pair<String, ? extends JSONObject> pair2 = this.LIZ;
                if (pair2 != null) {
                    second = pair2.getSecond();
                }
                jSONObject = new JSONObject(String.valueOf(second));
            } else {
                PushSettings pushSettingsLJ = LJ();
                if (pushSettingsLJ == null) {
                    return;
                } else {
                    jSONObject = new JSONObject(C08JS.LIZLLL(pushSettingsLJ));
                }
            }
            jSONObject.putOpt("im_voice_call_push", Integer.valueOf(i));
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("in_app_push_setting");
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            }
            jSONObjectOptJSONObject.putOpt("in_app_im_voice_call_push", Integer.valueOf(i2));
            jSONObject.putOpt("in_app_push_setting", jSONObjectOptJSONObject);
            LJIIJ(jSONObject);
        }
    }

    @Override // com.ss.android.ugc.aweme.setting.services.IUpdateSettingService
    public final void f6(int i, String str) {
        C2252408s6.LIZ(new AwS32S1101000_2(str, this, i, 0));
    }

    public static boolean LJIIJJI(int i, String str, JSONObject jSONObject) {
        if (jSONObject.has(str)) {
            jSONObject.putOpt(str, Integer.valueOf(i));
            return true;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("in_app_push_setting");
        if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.has(str)) {
            jSONObjectOptJSONObject.putOpt(str, Integer.valueOf(i));
            jSONObject.putOpt("in_app_push_setting", jSONObjectOptJSONObject);
            return true;
        }
        if (Intrinsics.LJFF(str, "in_app_im_voice_call_push")) {
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            }
            jSONObjectOptJSONObject.putOpt(str, Integer.valueOf(i));
            jSONObject.putOpt("in_app_push_setting", jSONObjectOptJSONObject);
            return true;
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("shop_push_setting");
        if (jSONObjectOptJSONObject2 != null && jSONObjectOptJSONObject2.has(str)) {
            jSONObjectOptJSONObject2.putOpt(str, Integer.valueOf(i));
            jSONObject.putOpt("shop_push_setting", jSONObjectOptJSONObject2);
            return true;
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("push_settings");
        if (jSONArrayOptJSONArray == null) {
            return false;
        }
        int length = jSONArrayOptJSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            try {
                JSONObject jSONObject2 = JSONArrayProtectorUtils.getJSONObject(jSONArrayOptJSONArray, i2);
                if (jSONObject2 == null) {
                    return false;
                }
                if (Intrinsics.LJFF(str, jSONObject2.optString("field"))) {
                    jSONObject2.putOpt(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, Integer.valueOf(i));
                    jSONArrayOptJSONArray.put(i2, jSONObject2);
                    jSONObject.putOpt("push_settings", jSONArrayOptJSONArray);
                    if (Intrinsics.LJFF(str, "in_app_im_msg_sound") && i == 1) {
                        IMessageAlertToneService.LIZ.getClass();
                        IMessageAlertToneService iMessageAlertToneServiceLIZ = C891310Yxt.LIZ();
                        if (iMessageAlertToneServiceLIZ != null) {
                            iMessageAlertToneServiceLIZ.LJI();
                            return true;
                        }
                    }
                    return true;
                }
                continue;
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                C1245240iVe c1245240iVe = C1245240iVe.LIZ;
                e.toString();
                c1245240iVe.getClass();
            }
        }
        return false;
    }
}
