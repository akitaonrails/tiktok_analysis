package com.bytedance.android.livestrategy;

import X.C006A;
import X.C1093020eY8;
import X.C1093030eY9;
import X.C1093040eYA;
import X.InterfaceC1092770eXj;
import com.bytedance.android.livestrategy.config.FinalStrategyConfig;
import com.bytedance.android.livestrategy.config.TriggerStrategyConfig;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public interface ILiveStrategyCenterService extends C006A {
    void G2(InterfaceC1092770eXj interfaceC1092770eXj, TriggerStrategyConfig triggerStrategyConfig);

    void Hv1(String str);

    void Mf0(InterfaceC1092770eXj interfaceC1092770eXj, FinalStrategyConfig finalStrategyConfig);

    void T4(TriggerStrategyConfig triggerStrategyConfig);

    void nU0(TriggerStrategyConfig triggerStrategyConfig, FinalStrategyConfig finalStrategyConfig, C1093020eY8 c1093020eY8);

    void onAppLogEvent(String str, JSONObject jSONObject, String str2);

    void uY0(String str, C1093030eY9 c1093030eY9);

    C1093040eYA wX(FinalStrategyConfig finalStrategyConfig);
}
