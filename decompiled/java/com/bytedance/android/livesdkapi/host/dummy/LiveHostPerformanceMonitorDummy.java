package com.bytedance.android.livesdkapi.host.dummy;

import X.InterfaceC1101100elA;
import X.InterfaceC1162920gMs;
import X.InterfaceC21605719h1;
import X.InterfaceC2184031Adl;
import X.InterfaceC466620IRo;
import android.content.Context;
import android.view.Window;
import com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class LiveHostPerformanceMonitorDummy implements IHostPerformanceMonitor {
    @Override // com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor
    public final void IN0() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor
    public final String OL0() {
        return "";
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor
    public final double Sb2() {
        return 0.0d;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor
    public final void Zg1() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor
    public final void cH() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor
    public final String getAppVersion() {
        return "";
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor
    public final InterfaceC466620IRo r62(InterfaceC21605719h1 interfaceC21605719h1) {
        return null;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor
    public final InterfaceC1101100elA OK1() {
        return new InterfaceC1101100elA() { // from class: X.0gO0
            @Override // X.InterfaceC1101100elA
            public final float LIZ() {
                return 0.0f;
            }

            @Override // X.InterfaceC1101100elA
            public final float LIZIZ() {
                return 0.0f;
            }

            @Override // X.InterfaceC1101100elA
            public final float LIZJ() {
                return 0.0f;
            }

            @Override // X.InterfaceC1101100elA
            public final void LIZLLL(HashMap<String, String> map) {
            }

            @Override // X.InterfaceC1101100elA
            public final float LJ() {
                return 0.0f;
            }

            @Override // X.InterfaceC1101100elA
            public final float LJFF() {
                return 0.0f;
            }
        };
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor
    public final HashMap<String, Double> getCpuRate() {
        return new HashMap<>();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor
    public final HashMap<String, Long> getMemory() {
        return new HashMap<>();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor
    public final InterfaceC2184031Adl q81() {
        return new InterfaceC2184031Adl() { // from class: X.0gO1
            @Override // X.InterfaceC2184031Adl
            public final int LIZ() {
                return 0;
            }

            @Override // X.InterfaceC2184031Adl
            public final void LIZJ(C2184011Adj c2184011Adj) {
            }

            @Override // X.InterfaceC2184031Adl
            public final float LJI() {
                return 0.0f;
            }

            @Override // X.InterfaceC2184031Adl
            public final void start() {
            }

            @Override // X.InterfaceC2184031Adl
            public final void stop() {
            }
        };
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor
    public final Map<String, String> fI(Context context) {
        return new HashMap();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor
    public final InterfaceC1162920gMs nt0(String str) {
        return new InterfaceC1162920gMs() { // from class: X.0gMu
            @Override // X.InterfaceC1162920gMs
            public final int LIZ() {
                return 0;
            }

            @Override // X.InterfaceC1162920gMs
            public final void LIZIZ(C0VVO c0vvo) {
            }

            @Override // X.InterfaceC1162920gMs
            public final void LIZJ(Window window) {
            }

            @Override // X.InterfaceC1162920gMs
            public final void LIZLLL(C1163640gO2 c1163640gO2) {
            }

            @Override // X.InterfaceC1162920gMs
            public final void LJ(C0VVN c0vvn) {
            }

            @Override // X.InterfaceC1162920gMs
            public final void start() {
            }

            @Override // X.InterfaceC1162920gMs
            public final void stop() {
            }
        };
    }
}
