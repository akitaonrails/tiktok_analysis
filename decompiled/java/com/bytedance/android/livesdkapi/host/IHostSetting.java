package com.bytedance.android.livesdkapi.host;

import X.C006A;
import X.C443120HZe;
import android.content.Context;
import com.bytedance.android.livesdk.livesetting.performance.LiveColdBootApiOptConfig;
import com.bytedance.android.livesdk.performance.LiveColdBootOptConfig;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public interface IHostSetting extends C006A {
    boolean B72();

    int BO2(float f);

    boolean CI0();

    boolean Cg2();

    LiveColdBootOptConfig JL();

    boolean Ji2();

    JSONObject KF();

    boolean Kx1();

    void L61();

    boolean LO2();

    boolean Lc1();

    void Nl1(String str);

    C443120HZe<Boolean, Boolean, Integer> Ou0(String str);

    int Pp1();

    boolean Sl1();

    boolean Sv0();

    String TS1();

    boolean Tt2();

    boolean Xy2();

    int ZJ0();

    void deleteUselessExposedVids(String str);

    boolean eR1();

    boolean enableDonationPercentService();

    String ga1();

    boolean hW();

    boolean jL1();

    boolean kc1();

    String ms1();

    void nB2(Context context, String str, long j, String str2);

    boolean nK();

    long o90();

    String oB();

    boolean oI0();

    boolean oV1();

    LiveColdBootApiOptConfig pO2();

    boolean pc1();

    boolean r72();

    void setExposedVids(String str);

    void setExposedVidsByUid(String str);

    String tA0();

    boolean vx2();

    boolean wJ2();

    boolean wS();

    boolean xP();

    Map<String, String> yM1(String str);
}
