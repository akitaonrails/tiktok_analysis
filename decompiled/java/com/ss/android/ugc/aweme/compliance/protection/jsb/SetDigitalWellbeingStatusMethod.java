package com.ss.android.ugc.aweme.compliance.protection.jsb;

import X.C1051660dTQ;
import X.C1388190mED;
import X.C15Y6;
import X.C15Y7;
import X.C15Y8;
import X.C15YD;
import X.C15YW;
import X.C20536115Xj;
import X.C297270Bkz;
import X.EnumC20536615Xo;
import X.InterfaceC1019840ce6;
import X.InterfaceC20537915Yb;
import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.compliance.api.model.FamilyPairingBean;
import com.ss.android.ugc.aweme.compliance.api.model.GuardianRestrictionBean;
import com.ss.android.ugc.aweme.compliance.api.model.ScreenTimeManagementDaySetting;
import com.ss.android.ugc.aweme.compliance.api.model.SleepHourConfigSettings;
import com.ss.android.ugc.aweme.compliance.protection.familypairing.FamilyPairingManager;
import com.ss.android.ugc.aweme.compliance.protection.familypairing.FamilyPairingManagerV2;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pns.service.IPNSProtectionDataLayerServiceFactory;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public final class SetDigitalWellbeingStatusMethod extends BaseBridgeMethod {
    public static final int $stable = 8;
    public final String name;

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    private final InterfaceC20537915Yb getDigitalWellbeingManager() {
        return C297270Bkz.LIZ() ? C15Y6.LL : C15Y7.LL;
    }

    private final C15YD getFamilyParingManager() {
        return C297270Bkz.LIZ() ? FamilyPairingManagerV2.LIZ : FamilyPairingManager.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, com.bytedance.ies.bullet.ui.common.bridge.ContainerBridgeMethod, X.InterfaceC1051460dT6
    public String getName() {
        return this.name;
    }

    private final List<ScreenTimeManagementDaySetting> getWeekSettings(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(jSONObject.optString("self_timelock_week_settings"))) {
            JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObject, "self_timelock_week_settings");
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = (JSONObject) jSONArray.get(i);
                arrayList.add(new ScreenTimeManagementDaySetting(Integer.valueOf(JSONObjectProtectorUtils.getInt(jSONObject2, "screen_time_limit")), Integer.valueOf(JSONObjectProtectorUtils.getInt(jSONObject2, "screen_time_setting_type")), Integer.valueOf(JSONObjectProtectorUtils.getInt(jSONObject2, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)), Integer.valueOf(JSONObjectProtectorUtils.getInt(jSONObject2, "day"))));
            }
            return arrayList;
        }
        return null;
    }

    public SetDigitalWellbeingStatusMethod(C1051660dTQ c1051660dTQ, String str) {
        super(c1051660dTQ);
        this.name = str;
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public void handle(JSONObject jSONObject, InterfaceC1019840ce6 interfaceC1019840ce6) {
        boolean z;
        GuardianRestrictionBean guardianRestrictionBeanLIZ;
        C15Y8 c15y8LIZ;
        int iOptInt;
        try {
            if (!TextUtils.isEmpty(jSONObject.optString("self_timelock_enable"))) {
                boolean z2 = JSONObjectProtectorUtils.getBoolean(jSONObject, "self_timelock_enable");
                if (!TextUtils.isEmpty(jSONObject.optString("max_use_duration_in_minutes")) && !TextUtils.isEmpty(jSONObject.optString("self_timelock_type"))) {
                    int i = JSONObjectProtectorUtils.getInt(jSONObject, "max_use_duration_in_minutes");
                    int i2 = JSONObjectProtectorUtils.getInt(jSONObject, "self_timelock_type");
                    if (!TextUtils.isEmpty(jSONObject.optString("self_timelock_repeat_type"))) {
                        iOptInt = jSONObject.optInt("self_timelock_repeat_type");
                    } else {
                        iOptInt = 1;
                    }
                    InterfaceC20537915Yb digitalWellbeingManager = getDigitalWellbeingManager();
                    getContext();
                    Context context = getContext();
                    if (context != null) {
                        C1388190mED.LIZIZ(context);
                    }
                    digitalWellbeingManager.LJJIFFI(i, z2, i2, iOptInt, getWeekSettings(jSONObject));
                }
            } else if (!TextUtils.isEmpty(jSONObject.optString("self_restricted_mode_enable")) && (z = JSONObjectProtectorUtils.getBoolean(jSONObject, "self_restricted_mode_enable")) != getDigitalWellbeingManager().LJIIL()) {
                if (z) {
                    getDigitalWellbeingManager().LIZJ();
                } else {
                    getDigitalWellbeingManager().LJIIJ();
                }
            }
            if (!TextUtils.isEmpty(jSONObject.optString("restrict_mode_has_password"))) {
                getDigitalWellbeingManager().LJIJ(JSONObjectProtectorUtils.getBoolean(jSONObject, "restrict_mode_has_password"));
            }
            if (!TextUtils.isEmpty(jSONObject.optString("self_weekly_update"))) {
                getDigitalWellbeingManager().LJIJI(JSONObjectProtectorUtils.getBoolean(jSONObject, "self_weekly_update"));
            }
            if (!TextUtils.isEmpty(jSONObject.optString("session_duration_reminder")) && !TextUtils.isEmpty(jSONObject.optString("session_duration_type"))) {
                getDigitalWellbeingManager().LIZLLL(JSONObjectProtectorUtils.getInt(jSONObject, "session_duration_reminder"), JSONObjectProtectorUtils.getInt(jSONObject, "session_duration_type"));
            }
            if (!TextUtils.isEmpty(jSONObject.optString("sleep_time_settings"))) {
                JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, "sleep_time_settings");
                int i3 = JSONObjectProtectorUtils.getInt(jSONObject2, "sleep_time_start_hour");
                int i4 = JSONObjectProtectorUtils.getInt(jSONObject2, "sleep_time_start_minute");
                int i5 = JSONObjectProtectorUtils.getInt(jSONObject2, "sleep_time_end_hour");
                int i6 = JSONObjectProtectorUtils.getInt(jSONObject2, "sleep_time_end_minute");
                boolean z3 = JSONObjectProtectorUtils.getBoolean(jSONObject2, "sleep_reminder_enabled");
                boolean zOptBoolean = jSONObject2.optBoolean("skip_sleep_hours", false);
                long jOptLong = jSONObject2.optLong("next_start_timestmap", 0L);
                C20536115Xj c20536115Xj = C20536115Xj.LIZ;
                SleepHourConfigSettings sleepHourConfigSettings = new SleepHourConfigSettings(Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Boolean.valueOf(z3), Boolean.FALSE, "", 0, Boolean.valueOf(zOptBoolean));
                c20536115Xj.getClass();
                C20536115Xj.LJIIJJI(sleepHourConfigSettings);
                C15YW.LIZ.getClass();
                C15YW.LJFF(jOptLong);
            }
            if (!TextUtils.isEmpty(jSONObject.optString("self_timelock_block_type"))) {
                int i7 = JSONObjectProtectorUtils.getInt(jSONObject, "self_timelock_block_type");
                if (C297270Bkz.LIZ()) {
                    IPNSProtectionDataLayerServiceFactory iPNSProtectionDataLayerServiceFactory = (IPNSProtectionDataLayerServiceFactory) PluggableExtentionKt.pluggableSpi$default(IPNSProtectionDataLayerServiceFactory.class, false, false, false, 14, null);
                    if (iPNSProtectionDataLayerServiceFactory != null && (c15y8LIZ = iPNSProtectionDataLayerServiceFactory.LIZ()) != null) {
                        c15y8LIZ.LIZLLL(EnumC20536615Xo.SCREEN_TIME_MANAGEMENT_BLOCK_TYPE, Integer.valueOf(i7));
                    }
                } else {
                    FamilyPairingBean familyPairingBeanLJIIZILJ = getFamilyParingManager().LJIIZILJ();
                    if (familyPairingBeanLJIIZILJ != null) {
                        GuardianRestrictionBean guardianRestrictionBean = familyPairingBeanLJIIZILJ.restriction;
                        if (guardianRestrictionBean != null) {
                            guardianRestrictionBeanLIZ = GuardianRestrictionBean.LIZ(guardianRestrictionBean, Integer.valueOf(i7));
                        } else {
                            guardianRestrictionBeanLIZ = null;
                            if (familyPairingBeanLJIIZILJ != null) {
                            }
                        }
                        getFamilyParingManager().LJIILJJIL(new FamilyPairingBean(familyPairingBeanLJIIZILJ.userIdentity, guardianRestrictionBeanLIZ, familyPairingBeanLJIIZILJ.childrenCount, familyPairingBeanLJIIZILJ.linkCount, familyPairingBeanLJIIZILJ.duration));
                    }
                }
            }
            interfaceC1019840ce6.onSuccess(null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            interfaceC1019840ce6.LIZ(-1, e.getMessage());
        }
    }
}
