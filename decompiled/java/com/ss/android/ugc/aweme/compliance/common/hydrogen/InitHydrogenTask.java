package com.ss.android.ugc.aweme.compliance.common.hydrogen;

import X.C04TD;
import X.C0CCZ;
import X.C0TVF;
import X.C0VZ0;
import X.C1697810uHb;
import X.C850670XYr;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.compliance.api.services.hydrogen.IHydrogenService;
import com.ss.android.ugc.aweme.compliance.common.hydrogen.HydrogenSettings;
import com.ss.android.ugc.aweme.compliance.common.hydrogen.configs.AccountDeleteLibraSetting;
import com.ss.android.ugc.aweme.compliance.common.hydrogen.configs.ActivityCenterLibraSetting;
import com.ss.android.ugc.aweme.compliance.common.serviceimpl.HydrogenServiceImpl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes14.dex */
public final class InitHydrogenTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "InitHydrogenTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        IHydrogenService iHydrogenService;
        Object objLIZ = C04TD.LIZ(IHydrogenService.class, false);
        if (objLIZ != null) {
            iHydrogenService = (IHydrogenService) objLIZ;
        } else {
            if (C04TD.LLLLJI == null) {
                synchronized (IHydrogenService.class) {
                    if (C04TD.LLLLJI == null) {
                        C04TD.LLLLJI = new HydrogenServiceImpl();
                    }
                }
            }
            iHydrogenService = C04TD.LLLLJI;
        }
        iHydrogenService.LIZ(C1697810uHb.LJIIJJI(new C0TVF() { // from class: X.1EPJ
            @Override // X.C0TVF
            public final Map<String, String> getConfig() {
                return C2097608Jq.LJI(new Pair("ad_delete_confirm", AccountDeleteLibraSetting.LIZ().deleteConfirm), new Pair("ad_delete_confirm_child", AccountDeleteLibraSetting.LIZ().deleteConfirmChild), new Pair("ad_delete_confirm_download", AccountDeleteLibraSetting.LIZ().deleteConfirmDownload), new Pair("ad_delete_confirm_check", AccountDeleteLibraSetting.LIZ().deleteConfirmCheck), new Pair("ad_delete_passport", AccountDeleteLibraSetting.LIZ().deletePassport), new Pair("ad_delete_mobile", AccountDeleteLibraSetting.LIZ().deleteMobile), new Pair("ad_delete_oauth", AccountDeleteLibraSetting.LIZ().deleteOauth), new Pair("ad_delete_status", AccountDeleteLibraSetting.LIZ().deleteStatus), new Pair("ad_deactive_options", AccountDeleteLibraSetting.LIZ().deactiveOptions), new Pair("ad_deactive_delete", AccountDeleteLibraSetting.LIZ().deactiveDelete), new Pair("ad_deactive_reminder", AccountDeleteLibraSetting.LIZ().deactiveReminder), new Pair("ad_deactive_mobile", AccountDeleteLibraSetting.LIZ().deactiveMobile), new Pair("ad_deactive_passport", AccountDeleteLibraSetting.LIZ().deactivePassport), new Pair("ad_deactive_oauth", AccountDeleteLibraSetting.LIZ().deactiveOauth));
            }
        }, new C0TVF() { // from class: X.0WWk
            @Override // X.C0TVF
            public final Map<String, String> getConfig() {
                SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
                ActivityCenterLibraSetting.ActivityCenterSettingModel activityCenterSettingModel = ActivityCenterLibraSetting.LIZ;
                ActivityCenterLibraSetting.ActivityCenterSettingModel activityCenterSettingModel2 = (ActivityCenterLibraSetting.ActivityCenterSettingModel) settingsManagerLIZLLL.LJIIIIZZ("activity_center", ActivityCenterLibraSetting.ActivityCenterSettingModel.class, activityCenterSettingModel);
                if (activityCenterSettingModel2 != null) {
                    activityCenterSettingModel = activityCenterSettingModel2;
                }
                Pair[] pairArr = new Pair[1];
                String str = activityCenterSettingModel.acEntry;
                if (str == null) {
                    str = "aweme://webview?_pia_=1&hide_nav_bar=1&use_spark=1&show_loading=1&should_full_screen=1&allow_webview_gesture=1&url=https%3A%2F%2Finapp.tiktokv.com%2Ftpp%2Finapp%2Fpns_product_poseidon%2Factivity_center.html%3F_pia_%3D1%26hide_nav_bar%3D1%26use_spark%3D1%26show_loading%3D1%26should_full_screen%3D1%26allow_webview_gesture%3D1";
                }
                pairArr[0] = new Pair("ac_entry_uri", str);
                return C2097608Jq.LJI(pairArr);
            }
        }, new C850670XYr(), new C0TVF() { // from class: X.0TVE
            public final C01GW LIZ = C452501pT.LIZIZ(new C0TVD());

            @Override // X.C0TVF
            public final Map<String, String> getConfig() {
                SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
                HydrogenSettings.HydrogenSettingModel hydrogenSettingModel = HydrogenSettings.LIZ;
                HydrogenSettings.HydrogenSettingModel hydrogenSettingModel2 = (HydrogenSettings.HydrogenSettingModel) settingsManagerLIZLLL.LJIIIIZZ("hydrogen_setting", HydrogenSettings.HydrogenSettingModel.class, hydrogenSettingModel);
                if (hydrogenSettingModel2 != null) {
                    hydrogenSettingModel = hydrogenSettingModel2;
                }
                HashMap<String, String> map = hydrogenSettingModel.actionMap;
                if (map != null) {
                    ((HashMap) this.LIZ.getValue()).putAll(map);
                }
                return (HashMap) this.LIZ.getValue();
            }
        }));
    }
}
