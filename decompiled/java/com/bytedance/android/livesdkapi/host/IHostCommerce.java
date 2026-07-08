package com.bytedance.android.livesdkapi.host;

import X.C006A;
import X.C0IIC;
import X.C0IJH;
import android.app.Activity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.model.GoLiveECIconInfo;
import com.google.gson.n;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public interface IHostCommerce extends C006A {
    boolean Ba();

    String Bb(String str, JSONObject jSONObject);

    boolean Ch();

    boolean GD1(Activity activity);

    void Gi(String str, JSONObject jSONObject);

    boolean K6();

    LifecycleObserver Nf();

    boolean Pf(int i, String str, boolean z, boolean z2);

    String Tv(int i, GoLiveECIconInfo goLiveECIconInfo);

    boolean Wh();

    String Xh(GoLiveECIconInfo goLiveECIconInfo);

    void Xt(int i, long j, HashMap map);

    void Yt(long j, HashMap<String, String> map, LifecycleOwner lifecycleOwner);

    void fw(Integer num, String str, Map map);

    boolean hitTopTabExpExperiment();

    String il(String str, Map<String, String> map);

    boolean kp();

    void ld(String str);

    int ln();

    void nj(Long l);

    C0IIC rC(Fragment fragment, C0IJH c0ijh);

    boolean s7();

    void setCurrentRoomId(Long l);

    n tl();

    boolean tz();

    boolean wg(String str);

    boolean zs();
}
