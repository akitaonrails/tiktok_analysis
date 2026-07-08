package com.ss.android.ugc.playerkit.simapicommon;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import com.bytedance.bpea.basics.Cert;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public interface IAppConfig {
    Sensor createBpeaLightSensor(SensorManager sensorManager);

    String defaultHost();

    int getAppID();

    String getAppName();

    String getAppVersion();

    CopyOnWriteArrayList<String> getBusinessLog(String str);

    String getChannel();

    float getDeviceScore();

    String getExtraBusinessLog(String str, int i);

    int getLastInfo(int i);

    Cert getLightSensorCert(boolean z);

    String getNetworkTypeDetail(Context context);

    Cert getVideoFrameCert();

    boolean isAppBackground();

    boolean isDebug();

    List<String> redirectHosts();

    void resetLastInfo(int i);

    void saveLastInfo(int i, int i2);

    void setBusinessLog(String str, String str2);

    void setBusinessLogOtherInfo(String str, String str2, int i);

    void setExtraBusinessLog(JSONObject jSONObject, String str, int i);
}
