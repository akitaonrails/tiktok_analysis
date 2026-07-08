package com.bytedance.android.livesdkapi.host.dummy;

import X.C0IIC;
import X.C0IJH;
import android.app.Activity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.model.GoLiveECIconInfo;
import com.bytedance.android.livesdkapi.host.IHostCommerce;
import com.google.gson.n;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveHostCommerceDummy implements IHostCommerce {
    public static final LiveHostCommerceDummy LL = new LiveHostCommerceDummy();

    @Override // com.bytedance.android.livesdkapi.host.IHostCommerce
    public final boolean Ba() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCommerce
    public final String Bb(String str, JSONObject jSONObject) {
        return "";
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCommerce
    public final boolean Ch() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCommerce
    public final boolean GD1(Activity activity) {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCommerce
    public final void Gi(String str, JSONObject jSONObject) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCommerce
    public final boolean K6() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCommerce
    public final LifecycleObserver Nf() {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCommerce
    public final boolean Pf(int i, String str, boolean z, boolean z2) {
        return z2;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCommerce
    public final String Tv(int i, GoLiveECIconInfo goLiveECIconInfo) {
        return "";
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCommerce
    public final boolean Wh() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCommerce
    public final String Xh(GoLiveECIconInfo goLiveECIconInfo) {
        return "";
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCommerce
    public final void Xt(int i, long j, HashMap map) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCommerce
    public final void Yt(long j, HashMap<String, String> map, LifecycleOwner lifecycleOwner) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCommerce
    public final void fw(Integer num, String str, Map map) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCommerce
    public final boolean hitTopTabExpExperiment() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCommerce
    public final String il(String str, Map<String, String> map) {
        return "";
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCommerce
    public final boolean kp() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCommerce
    public final void ld(String str) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCommerce
    public final int ln() {
        return 0;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCommerce
    public final void nj(Long l) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCommerce
    public final C0IIC rC(Fragment fragment, C0IJH c0ijh) {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCommerce
    public final boolean s7() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCommerce
    public final void setCurrentRoomId(Long l) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCommerce
    public final boolean tz() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCommerce
    public final boolean wg(String str) {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCommerce
    public final boolean zs() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostCommerce
    public final n tl() {
        return new n();
    }
}
