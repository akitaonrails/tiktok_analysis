package com.ss.videoarch.liveplayer.config;

import X.C1698940uJQ;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1467440oI2;
import X.InterfaceC1476500oWe;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttm.player.TTPlayer;
import com.ss.videoarch.liveio.LiveIOManager;
import com.tiktok.ttkmedia.configcenter.BaseConfigV2;
import com.tiktok.ttkmedia.configcenter.ConfigCenter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public final class LiveConfigCenterWrapper {
    public static boolean sDIDParserRulesRegistered;
    public static volatile LiveConfigCenterWrapper sInstance;
    public static boolean sParserRulesRegistered;
    public ConfigCenter mConfigCenter = ConfigCenter.LJI();
    public String mManagedConfigUniqueId;

    public synchronized void registerDIDParserRules() {
        if (sDIDParserRulesRegistered) {
            C1698940uJQ.LIZJ();
            return;
        }
        ConfigCenter.LJI().LJIIJ(new InterfaceC1476500oWe() { // from class: X.0oWa
            @Override // X.InterfaceC1476500oWe
            public final void LIZ() {
            }

            @Override // X.InterfaceC1476500oWe
            public final int getSource() {
                return 1;
            }

            @Override // X.InterfaceC1476500oWe
            public final List<C1476430oWX> LIZIZ() {
                ArrayList arrayList = new ArrayList();
                C1476450oWZ.LIZ(3001, 0, arrayList, Arrays.asList("mediabox.audio_metric", "enable"));
                C1476450oWZ.LIZ(3002, 0, arrayList, Arrays.asList("mediabox.audio_metric", "detect_after_ae"));
                C1476450oWZ.LIZ(3003, 0, arrayList, Arrays.asList("mediabox.audio_metric", "use_v2"));
                C1476450oWZ.LIZ(3004, 0, arrayList, Arrays.asList("mediabox.audio_metric", "get_res_in_stop"));
                C1476450oWZ.LIZ(3005, 90000, arrayList, Arrays.asList("mediabox.audio_metric", "interval"));
                C1476450oWZ.LIZ(3006, 10000, arrayList, Arrays.asList("mediabox.audio_metric", "delay_time"));
                C1476450oWZ.LIZ(3007, 10, arrayList, Arrays.asList("mediabox.audio_metric", "detect_buffer_time"));
                return arrayList;
            }
        });
        sDIDParserRulesRegistered = true;
        C1698940uJQ.LIZJ();
    }

    public synchronized void registerParserRules() {
        if (sParserRulesRegistered) {
            C1698940uJQ.LIZJ();
            return;
        }
        ConfigCenter.LJI().LJIIJ(new InterfaceC1476500oWe() { // from class: X.0oWY
            @Override // X.InterfaceC1476500oWe
            public final void LIZ() {
            }

            @Override // X.InterfaceC1476500oWe
            public final int getSource() {
                return 2;
            }

            @Override // X.InterfaceC1476500oWe
            public final List<C1476430oWX> LIZIZ() {
                ArrayList arrayList = new ArrayList();
                C1476430oWX c1476430oWX = new C1476430oWX();
                c1476430oWX.LIZ = Arrays.asList("mediabox.video_sharpen", "bmfasf_enabled");
                c1476430oWX.LIZIZ = 2101;
                c1476430oWX.LIZJ = 1;
                c1476430oWX.LIZLLL = 0;
                arrayList.add(c1476430oWX);
                return arrayList;
            }
        });
        ConfigCenter.LJI().LJIIJ(new InterfaceC1476500oWe() { // from class: X.0oWb
            @Override // X.InterfaceC1476500oWe
            public final void LIZ() {
            }

            @Override // X.InterfaceC1476500oWe
            public final int getSource() {
                return 2;
            }

            @Override // X.InterfaceC1476500oWe
            public final List<C1476430oWX> LIZIZ() {
                ArrayList arrayList = new ArrayList();
                C1476490oWd.LIZ(2201, arrayList, Arrays.asList("mediabox.cmaf", "cmaf_media_first"));
                C1476490oWd.LIZ(2202, arrayList, Arrays.asList("mediabox.cmaf", "enable_mio_cmaf"));
                C1476490oWd.LIZ(2203, arrayList, Arrays.asList("mediabox.cmaf", "enable_cmaf_seamless_ao"));
                C1476490oWd.LIZ(2204, arrayList, Arrays.asList("mediabox.cmaf", "enable_ao_hint"));
                return arrayList;
            }
        });
        ConfigCenter.LJI().LJIIJ(new InterfaceC1476500oWe() { // from class: X.0oWc
            @Override // X.InterfaceC1476500oWe
            public final void LIZ() {
            }

            @Override // X.InterfaceC1476500oWe
            public final int getSource() {
                return 2;
            }

            @Override // X.InterfaceC1476500oWe
            public final List<C1476430oWX> LIZIZ() {
                ArrayList arrayList = new ArrayList();
                C1476490oWd.LIZ(2301, arrayList, Arrays.asList("mediabox.demuxer", "enable_mio_demuxer"));
                return arrayList;
            }
        });
        try {
            TTPlayer._registerPlayerCoreConfig();
        } catch (ExceptionInInitializerError | NoClassDefFoundError | UnsatisfiedLinkError e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[ConfigCenter][Rule] skip TTPlayer.registerPlayerCoreConfig: ");
            sbLIZ.append(e);
            C2188811AlT.LIZIZ(sbLIZ);
            C1698940uJQ.LIZJ();
        }
        C1698940uJQ.LIZJ();
        sParserRulesRegistered = true;
    }

    public static LiveConfigCenterWrapper getInstance() {
        if (sInstance == null) {
            synchronized (LiveConfigCenterWrapper.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new LiveConfigCenterWrapper();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return sInstance;
    }

    public InterfaceC1467440oI2 getDIDConfig() {
        registerDIDParserRules();
        this.mConfigCenter.getClass();
        return new BaseConfigV2(7, "", 2);
    }

    public void registerConfigRulesAll() {
        LiveIOManager.getInstance().setIntValueForce(2310, 1);
        registerParserRules();
        registerDIDParserRules();
    }

    public InterfaceC1467440oI2 getVVConfig(String str) {
        if (TextUtils.isEmpty(str)) {
            C1698940uJQ.LIZIZ();
            this.mConfigCenter.getClass();
            return new BaseConfigV2(7, "default", 2);
        }
        this.mConfigCenter.getClass();
        return new BaseConfigV2(7, str, 2);
    }

    public void removeVVConfigs(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[ConfigCenter] remove configs for config_unique_id:");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        C1698940uJQ.LIZJ();
        if (!TextUtils.isEmpty(str)) {
            this.mConfigCenter.LJIIJJI(str);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("[ConfigCenter] removed configs for config_unique_id:");
            sbLIZ2.append(str);
            sbLIZ2.append(" on close");
            C2188811AlT.LIZIZ(sbLIZ2);
            C1698940uJQ.LIZJ();
        }
    }

    public void setConfigCenter(ConfigCenter configCenter) {
        if (configCenter == null) {
            configCenter = ConfigCenter.LJI();
        }
        this.mConfigCenter = configCenter;
    }

    private void logPayloadShape(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[ConfigCenter][Shape] ");
            sbLIZ.append(str);
            sbLIZ.append(": null");
            C2188811AlT.LIZIZ(sbLIZ);
            C1698940uJQ.LIZJ();
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> itKeys = jSONObject.keys();
        int i = 0;
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            arrayList.add(next);
            if (next.startsWith("playercore_") || next.startsWith("playercore.")) {
                i = 1;
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[ConfigCenter][Shape] ");
        sbLIZ2.append(str);
        sbLIZ2.append(" topKeyCount=");
        sbLIZ2.append(arrayList.size());
        sbLIZ2.append(" hasPlayerCoreScope=");
        sbLIZ2.append(i);
        sbLIZ2.append(" keys=");
        sbLIZ2.append(arrayList);
        C2188811AlT.LIZIZ(sbLIZ2);
        C1698940uJQ.LIZJ();
    }

    public void addPlayStopParseMetrics(JSONObject jSONObject, String str) {
        if (jSONObject != null && !TextUtils.isEmpty(str)) {
            String strLJII = this.mConfigCenter.LJII(str);
            if (TextUtils.isEmpty(strLJII)) {
                return;
            }
            try {
                JSONObject jSONObject2 = new JSONObject(strLJII);
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject.put(next, jSONObject2.opt(next));
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public void switchVVConfigActiveVariant(String str, String str2) {
        this.mConfigCenter.LJIIL(str, str2);
    }

    public boolean updateConfigs(JSONObject jSONObject, JSONObject jSONObject2, String str, String str2) {
        String strJ3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[ConfigCenter] update configs for config_unique_id:");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        C1698940uJQ.LIZJ();
        if (TextUtils.isEmpty(str)) {
            C1698940uJQ.LIZJ();
            return false;
        }
        boolean zLJIIIZ = this.mConfigCenter.LJIIIZ(7, 2, str);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("[ConfigCenter] hasConfig exists=");
        sbLIZ2.append(zLJIIIZ ? 1 : 0);
        sbLIZ2.append(" for config_unique_id:");
        sbLIZ2.append(str);
        C2188811AlT.LIZIZ(sbLIZ2);
        C1698940uJQ.LIZJ();
        if (zLJIIIZ) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("[ConfigCenter] skip update, configs already exist for config_unique_id:");
            sbLIZ3.append(str);
            C2188811AlT.LIZIZ(sbLIZ3);
            C1698940uJQ.LIZJ();
            return false;
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("[ConfigCenter] update configs for config_unique_id:");
        sbLIZ4.append(str);
        C2188811AlT.LIZIZ(sbLIZ4);
        C1698940uJQ.LIZJ();
        String strJ32 = null;
        if (jSONObject != null) {
            strJ3 = C786410Ut5.J3(jSONObject);
        } else {
            strJ3 = null;
        }
        if (jSONObject2 != null) {
            strJ32 = C786410Ut5.J3(jSONObject2);
        }
        logPayloadShape("main", jSONObject);
        logPayloadShape("backup", jSONObject2);
        if (strJ3 != null) {
            this.mConfigCenter.LJIILLIIL(2, strJ3, "main", str);
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("[ConfigCenter][Data] main:");
            sbLIZ5.append(strJ3);
            C2188811AlT.LIZIZ(sbLIZ5);
            C1698940uJQ.LIZJ();
            this.mConfigCenter.LJIILLIIL(1, strJ3, "main", str);
            C1698940uJQ.LIZJ();
        } else {
            C1698940uJQ.LIZJ();
        }
        if (strJ32 != null) {
            this.mConfigCenter.LJIILLIIL(2, strJ32, "backup", str);
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("[ConfigCenter][Data] backup:");
            sbLIZ6.append(strJ32);
            C2188811AlT.LIZIZ(sbLIZ6);
            C1698940uJQ.LIZJ();
            this.mConfigCenter.LJIILLIIL(1, strJ32, "backup", str);
            C1698940uJQ.LIZJ();
        } else {
            C1698940uJQ.LIZJ();
        }
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append("[ConfigCenter] manages lifetime for config_unique_id:");
        sbLIZ7.append(str);
        C2188811AlT.LIZIZ(sbLIZ7);
        C1698940uJQ.LIZJ();
        return true;
    }
}
