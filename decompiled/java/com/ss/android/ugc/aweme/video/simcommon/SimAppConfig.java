package com.ss.android.ugc.aweme.video.simcommon;

import X.C0RRP;
import X.C0WZX;
import X.C1906580ziK;
import X.C2204961BRm;
import X.C603820NmG;
import X.C786410Ut5;
import X.C842130X1v;
import X.C844470XAv;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.text.TextUtils;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.ss.android.ugc.playerkit.simapicommon.IAppConfig;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class SimAppConfig implements IAppConfig {
    public int mLivePos = -1;
    public int mLastAwemeType = -1;
    public int mLastTopView = -1;
    public int mSlideInfo = -1;
    public C603820NmG<String, CopyOnWriteArrayList<String>> sessionLogs = new C603820NmG<>(20);
    public C603820NmG<String, String> mImageError = new C603820NmG<>(20);
    public volatile C603820NmG<String, JSONArray> mImageErrorJson = new C603820NmG<>(20);

    @Override // com.ss.android.ugc.playerkit.simapicommon.IAppConfig
    public String defaultHost() {
        return "tiktokv.com";
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.IAppConfig
    public /* bridge */ /* synthetic */ float getDeviceScore() {
        return -1.0f;
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.IAppConfig
    public boolean isDebug() {
        return false;
    }

    public /* bridge */ /* synthetic */ void setBusinessPeriod(String str, String str2) {
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.IAppConfig
    public int getAppID() {
        C844470XAv.LIZ.getClass();
        return C844470XAv.LJIIJ;
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.IAppConfig
    public String getAppName() {
        C844470XAv.LIZ.getClass();
        String str = C844470XAv.LJ;
        if (str == null) {
            return null;
        }
        return str;
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.IAppConfig
    public String getAppVersion() {
        C844470XAv.LIZ.getClass();
        return C844470XAv.LJFF();
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.IAppConfig
    public String getChannel() {
        C844470XAv.LIZ.getClass();
        return C844470XAv.LJIILL;
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.IAppConfig
    public Cert getVideoFrameCert() {
        return CertProviderManagerKt.findCert("bpea-player_get_video_frame", 1476435992);
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.IAppConfig
    public List<String> redirectHosts() {
        List<String> list = C842130X1v.LIZ;
        return C842130X1v.LIZ;
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.IAppConfig
    public boolean isAppBackground() {
        return C1906580ziK.LJI();
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.IAppConfig
    public Sensor createBpeaLightSensor(SensorManager sensorManager) {
        if (sensorManager == null) {
            return null;
        }
        return C2204961BRm.LJJL(sensorManager, 5, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPyhZ5rBkiEBihZZkOd3ku3QRqN2yTeWDFepCrM=", null));
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.IAppConfig
    public CopyOnWriteArrayList<String> getBusinessLog(String str) {
        if (!TextUtils.isEmpty(str)) {
            CopyOnWriteArrayList<String> copyOnWriteArrayListLIZJ = this.sessionLogs.LIZJ(str);
            this.sessionLogs.LJ(str);
            return copyOnWriteArrayListLIZJ;
        }
        return null;
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.IAppConfig
    public int getLastInfo(int i) {
        if (i == 0) {
            return this.mLivePos;
        }
        if (i == 1) {
            return this.mLastAwemeType;
        }
        if (i == 2) {
            return this.mLastTopView;
        }
        if (i == 3) {
            return this.mSlideInfo;
        }
        return -1;
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.IAppConfig
    public Cert getLightSensorCert(boolean z) {
        if (z) {
            return CertProviderManagerKt.findCert("bpea-player_light_register_sensor", 1476415494);
        }
        return CertProviderManagerKt.findCert("bpea-player_light_unregister_sensor", 1476415494);
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.IAppConfig
    public String getNetworkTypeDetail(Context context) {
        C844470XAv.LIZ.getClass();
        return C786410Ut5.d3(C844470XAv.LIZ());
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.IAppConfig
    public void resetLastInfo(int i) {
        if (i == 0) {
            this.mLivePos = -1;
        } else {
            if (i != 2) {
                return;
            }
            this.mLastTopView = -1;
        }
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.IAppConfig
    public String getExtraBusinessLog(String str, int i) {
        JSONArray jSONArrayLIZJ;
        if (i == 0) {
            if (!TextUtils.isEmpty(str)) {
                String strLIZJ = this.mImageError.LIZJ(str);
                this.mImageError.LJ(str);
                return strLIZJ;
            }
            return null;
        }
        if (i == 4 && (jSONArrayLIZJ = this.mImageErrorJson.LIZJ(str)) != null) {
            this.mImageErrorJson.LJ(str);
            return jSONArrayLIZJ.toString();
        }
        return null;
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.IAppConfig
    public void saveLastInfo(int i, int i2) {
        if (i == 1) {
            this.mLastAwemeType = i2;
        } else {
            if (i != 2) {
                return;
            }
            this.mLastTopView = i2;
        }
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.IAppConfig
    public void setBusinessLog(String str, String str2) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            CopyOnWriteArrayList<String> copyOnWriteArrayListLIZJ = this.sessionLogs.LIZJ(str2);
            if (copyOnWriteArrayListLIZJ == null) {
                copyOnWriteArrayListLIZJ = new CopyOnWriteArrayList<>();
                this.sessionLogs.LIZLLL(str2, copyOnWriteArrayListLIZJ);
            }
            copyOnWriteArrayListLIZJ.add(str);
        }
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.IAppConfig
    public void setBusinessLogOtherInfo(String str, String str2, int i) {
        if (!TextUtils.isEmpty(str) && str.equals("slider_info")) {
            this.mSlideInfo = i;
        }
        if (!TextUtils.isEmpty(str) && str.compareTo(C0RRP.G_LAST_LIVE_POS.toString()) == 0) {
            this.mLivePos = i;
        }
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.IAppConfig
    public void setExtraBusinessLog(JSONObject jSONObject, String str, int i) {
        if (!TextUtils.isEmpty(str) && jSONObject != null && i == 4) {
            JSONArray jSONArrayLIZJ = this.mImageErrorJson.LIZJ(str);
            if (jSONArrayLIZJ == null) {
                jSONArrayLIZJ = new JSONArray();
            }
            jSONArrayLIZJ.put(jSONObject);
            this.mImageErrorJson.LIZLLL(str, jSONArrayLIZJ);
        }
    }

    public void setExtraBusinessLog(String str, String str2, int i) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str) && i == 0) {
            this.mImageError.LIZLLL(str2, str);
        }
    }
}
