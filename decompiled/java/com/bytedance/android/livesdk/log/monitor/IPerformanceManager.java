package com.bytedance.android.livesdk.log.monitor;

import X.C006A;
import X.C1273980jG0;
import X.InterfaceC1089980eTE;
import X.InterfaceC1100800ekg;
import X.InterfaceC1300390jwb;
import X.InterfaceC1300420jwe;
import X.InterfaceC1300440jwg;
import Y.AObjectS390S0100000_15;
import android.hardware.SensorEventListener;
import android.os.HandlerThread;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes13.dex */
public interface IPerformanceManager extends C006A, SensorEventListener {
    void BF1(Function0<String> function0);

    void Bl0();

    void CN(long j);

    void Dm0(Map<String, String> map);

    void Dy1(int i, String str);

    void Ef0(JSONObject jSONObject);

    void FM0();

    void Gp0(double d);

    void JG2(InterfaceC1300420jwe interfaceC1300420jwe);

    boolean JI2();

    JSONObject JR();

    void JV(InterfaceC1100800ekg interfaceC1100800ekg);

    void Jp2(long j);

    void Jw(List<String> list);

    void L11(Function1<Map<String, String>, Unit> function1);

    void LF(Pair<String, String> pair);

    void LO1();

    void MG(C1273980jG0 c1273980jG0);

    void NE1();

    void Ox2();

    void PB2(InterfaceC1300390jwb interfaceC1300390jwb);

    void PM0();

    void Pe1(String str);

    void T82(boolean z);

    void TV1(InterfaceC1300440jwg interfaceC1300440jwg);

    void V42();

    void Vu2();

    HandlerThread XD1();

    void Y10(AObjectS390S0100000_15 aObjectS390S0100000_15);

    void YR(boolean z);

    void Ym2();

    void Za1();

    void c02(Pair<Float, Float> pair);

    void d01(float f);

    boolean dF0();

    void eC(Function0<String> function0);

    void fA0(LiveMode liveMode);

    void gV();

    String getBroadcastScene();

    void gj2();

    void ml0(String str);

    void o11(Map<String, String> map);

    void o41(String str);

    void oB1();

    void qu1();

    void rN1(String str);

    void release();

    void s51(InterfaceC1089980eTE interfaceC1089980eTE);

    float sF2(int i);

    void setConnectionType(String str);

    void setExtraParams(Map<String, String> map);

    void setIsAnchor(boolean z);

    float sl2(int i);

    void sw0(String str);

    void sx0(boolean z);

    void t10(String str, Map<String, String> map);

    String uD(LiveMode liveMode);

    void v6(boolean z);

    void wR0();

    void yL0();

    void zO1(Function1<Map<String, String>, Unit> function1);
}
