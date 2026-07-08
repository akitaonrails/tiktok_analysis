package com.bytedance.android.livesdkapi.host.dummy;

import X.C1090520eU6;
import X.C1090540eU8;
import X.C467390IUn;
import X.InterfaceC1090510eU5;
import com.bytedance.android.livesdkapi.host.IHostConfig;
import com.google.gson.k;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes18.dex */
public class LiveHostConfigDummy implements IHostConfig {
    public final C1090520eU6 LL = new InterfaceC1090510eU5() { // from class: X.0eU6
        @Override // X.InterfaceC1090510eU5
        public final float LIZIZ() {
            return 0.0f;
        }

        @Override // X.InterfaceC1090510eU5
        public final float LIZJ() {
            return 0.0f;
        }

        @Override // X.InterfaceC1090510eU5
        public final boolean LIZLLL() {
            return false;
        }

        @Override // X.InterfaceC1090510eU5
        public final void isMockPopup() {
        }

        @Override // X.InterfaceC1090510eU5
        public final Map<String, k> LIZ() {
            return new HashMap();
        }
    };

    @Override // com.bytedance.android.livesdkapi.host.IHostConfig
    public final /* synthetic */ void AO0(String str, String str2, boolean z) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostConfig
    public final void L80(String str, String str2) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostConfig
    public final void Rt0(String str, String str2) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostConfig
    public final int Ve() {
        return 0;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostConfig
    public final synchronized void d40() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostConfig
    public final void dz1() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostConfig
    public final /* synthetic */ void pK1(String str, Object obj, int i) {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostConfig
    public final boolean qD2() {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostConfig
    public final Set<String> Sa2() {
        return new HashSet();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostConfig
    public final C1090540eU8 VQ() {
        C1090540eU8 c1090540eU8 = new C1090540eU8();
        c1090540eU8.LIZ = 0.0d;
        c1090540eU8.LIZIZ = 0;
        return c1090540eU8;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostConfig
    public final C467390IUn mB2() {
        return new C467390IUn(false, false, false);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostConfig
    public final InterfaceC1090510eU5 i32() {
        return this.LL;
    }
}
