package com.heytap.mcssdk.liquid;

import X.C2188191AkT;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C2408409cA;
import X.C788530UwV;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.heytap.mcssdk.utils.e;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes14.dex */
public class LiquidSettingChangeObserver extends BroadcastReceiver {
    public static final String a = "LiquidSettingChangeObserver";
    public final Context b;
    public final OnLiquidSettingChangeListener c;

    public LiquidSettingChangeObserver(Context context, OnLiquidSettingChangeListener onLiquidSettingChangeListener) {
        this.b = context;
        this.c = onLiquidSettingChangeListener;
    }

    private void a(Bundle bundle) {
        String string;
        int i;
        int i2;
        if (bundle == null) {
            if (e.g()) {
                e.b(a, "parseContent() extras is null .");
                return;
            }
            return;
        }
        try {
            i = bundle.getInt("liquidSettingType");
            try {
                string = bundle.getString("liquid_package_name");
            } catch (Exception e) {
                e = e;
                string = "";
            }
        } catch (Exception e2) {
            e = e2;
            string = "";
            i = -1;
        }
        try {
            i2 = bundle.getInt("liquidSwitchStatusValue");
        } catch (Exception e3) {
            e = e3;
            TryCatchGuardChecker.doCheck(e);
            if (e.g()) {
                e.b(a, "Error happened in parseContent:" + e.toString());
            }
            i2 = -2;
        }
        if (e.g()) {
            e.b(a, "parseContent() : changeType:" + i + " packageName: " + string + " isOpen:" + i2);
        }
        if (i == -1) {
            return;
        }
        SettingChangeBean settingChangeBean = new SettingChangeBean();
        settingChangeBean.setChangeType(i);
        settingChangeBean.setSwitchStatus(i2);
        if (e.g()) {
            e.b(a, "parseContent SettingChangeBean is :" + settingChangeBean);
        }
        if (i != 1) {
            if (i != 2) {
                return;
            }
            Context context = this.b;
            String packageName = context != null ? context.getPackageName() : "";
            if (!TextUtils.equals(packageName, string) || TextUtils.isEmpty(packageName)) {
                return;
            }
        }
        OnLiquidSettingChangeListener onLiquidSettingChangeListener = this.c;
        if (onLiquidSettingChangeListener != null) {
            onLiquidSettingChangeListener.onSettingChange(settingChangeBean);
        }
    }

    public final void com_heytap_mcssdk_liquid_LiquidSettingChangeObserver__onReceive$___twin___(Context context, Intent intent) {
        if (e.g()) {
            String str = a;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onReceive() :");
            sbLIZ.append(this);
            e.b(str, C2188811AlT.LIZIZ(sbLIZ));
        }
        if (intent == null) {
            if (e.g()) {
                e.b(a, "parseContent() intent is null ");
                return;
            }
            return;
        }
        String action = intent.getAction();
        if (e.g()) {
            String str2 = a;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("parseContent() action :");
            sbLIZ2.append(action);
            sbLIZ2.append(" -- ");
            sbLIZ2.append(this);
            e.b(str2, C2188811AlT.LIZIZ(sbLIZ2));
        }
        if (TextUtils.equals(action, "com.heytap.mcs.liquid.third.switch_change_kk")) {
            a(INVOKEVIRTUAL_com_heytap_mcssdk_liquid_LiquidSettingChangeObserver_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(intent));
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        com_heytap_mcssdk_liquid_LiquidSettingChangeObserver_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(this, context, intent);
    }

    public static Bundle INVOKEVIRTUAL_com_heytap_mcssdk_liquid_LiquidSettingChangeObserver_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static void com_heytap_mcssdk_liquid_LiquidSettingChangeObserver_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(LiquidSettingChangeObserver liquidSettingChangeObserver, Context context, Intent intent) {
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            liquidSettingChangeObserver.com_heytap_mcssdk_liquid_LiquidSettingChangeObserver__onReceive$___twin___(context, intent);
        } else {
            C2408409cA.LIZ();
            liquidSettingChangeObserver.com_heytap_mcssdk_liquid_LiquidSettingChangeObserver__onReceive$___twin___(context, intent);
        }
    }

    public static void com_heytap_mcssdk_liquid_LiquidSettingChangeObserver_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_onBroadcastReceiverReceive(LiquidSettingChangeObserver liquidSettingChangeObserver, Context context, Intent intent) {
        if (!C2214201BlK.LJIIJJI && intent != null) {
            if (!((ArrayList) C788530UwV.LIZ).contains(intent.getAction()) && C788530UwV.LIZ("onBroadcastReceiverReceive")) {
                C2188191AkT.LIZIZ();
            }
        }
        com_heytap_mcssdk_liquid_LiquidSettingChangeObserver_com_bytedance_otis_optimise_lancet_NetworkInfoManager_onReceive(liquidSettingChangeObserver, context, intent);
    }
}
