package com.bytedance.android.livesdk.shorttouch.ui.view;

import X.C1083740eJA;
import X.C16F5;
import X.C500260Jjc;
import X.InterfaceC1085330eLj;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public abstract class ShortTouchNativeView implements InterfaceC1085330eLj, GenericLifecycleObserver {
    @Override // X.InterfaceC1085330eLj
    public final void JG1(String str, JSONObject jSONObject) {
    }

    public abstract C16F5 LIZ();

    public abstract void LIZIZ();

    @Override // X.InterfaceC1085330eLj
    public final void Pl() {
    }

    @Override // X.InterfaceC1085330eLj
    public final String dT1() {
        return null;
    }

    @Override // X.InterfaceC1085330eLj
    public final void kk0(Map<String, String> map) {
    }

    @Override // X.InterfaceC1085330eLj
    public final String mP0() {
        return null;
    }

    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // X.InterfaceC1085330eLj
    public final void Ec2() {
        LIZIZ();
        C500260Jjc.LJLJLJ(LIZ(), false);
    }

    @Override // X.InterfaceC1085330eLj
    public final String Sr() {
        return C1083740eJA.LIZ(this);
    }

    @Override // X.InterfaceC1085330eLj
    public void LJLJL() {
        throw null;
    }

    @Override // X.InterfaceC1085330eLj
    public final void LLLZI() {
        throw null;
    }
}
