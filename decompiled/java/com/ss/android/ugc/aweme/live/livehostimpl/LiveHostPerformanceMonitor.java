package com.ss.android.ugc.aweme.live.livehostimpl;

import X.C0VGK;
import X.C0VGL;
import X.C0VVF;
import X.C0WZX;
import X.C20441214yg;
import X.C20644086w;
import X.C21602919gZ;
import X.C2204961BRm;
import X.C798360VTm;
import X.C844470XAv;
import X.InterfaceC1101100elA;
import X.InterfaceC1162920gMs;
import X.InterfaceC21605719h1;
import X.InterfaceC2184031Adl;
import X.InterfaceC466620IRo;
import aa3.a;
import android.content.Context;
import android.os.BatteryManager;
import android.os.Bundle;
import android.view.Window;
import com.bytedance.android.livesdk.livesetting.performance.LiveHostJavaMaxCacheFix;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor;
import com.bytedance.common.graphics.GraphicsMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import duo.b;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class LiveHostPerformanceMonitor implements IHostPerformanceMonitor {
    public long LL = -999;

    @Override // com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor
    public final InterfaceC1101100elA OK1() {
        return new InterfaceC1101100elA() { // from class: X.0jGQ
            public float LIZ = -1.0f;
            public float LIZIZ = -1.0f;
            public float LIZJ = -1.0f;
            public float LIZLLL = -1.0f;
            public float LJ = -1.0f;

            @Override // X.InterfaceC1101100elA
            public final float LIZ() {
                float f = this.LIZIZ;
                if (f > 0.0f) {
                    return f;
                }
                LJII();
                return this.LIZIZ;
            }

            @Override // X.InterfaceC1101100elA
            public final float LIZIZ() {
                float f = this.LIZJ;
                if (f > 0.0f) {
                    return f;
                }
                LJII();
                return this.LIZJ;
            }

            @Override // X.InterfaceC1101100elA
            public final float LIZJ() {
                float f = this.LIZLLL;
                if (f > 0.0f) {
                    return f;
                }
                LJII();
                return this.LIZLLL;
            }

            @Override // X.InterfaceC1101100elA
            public final float LJ() {
                float f = this.LIZ;
                if (f > 0.0f) {
                    return f;
                }
                LJII();
                return this.LIZ;
            }

            @Override // X.InterfaceC1101100elA
            public final float LJFF() {
                float f = this.LJ;
                if (f > 0.0f) {
                    return f;
                }
                LJII();
                return this.LJ;
            }

            public final void LJII() {
                C09GA c09gaLIZIZ = C212350188e.LIZJ().LIZIZ(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).appId());
                C1300610jwx c1300610jwx = C1300610jwx.LIZJ;
                C1300610jwx c1300610jwx2 = C1300610jwx.LIZLLL;
                C1300610jwx c1300610jwx3 = C1300610jwx.LJ;
                C1300610jwx c1300610jwx4 = C1300610jwx.LJI;
                C1300610jwx c1300610jwx5 = C1300610jwx.LJIIJ;
                C1300610jwx[] c1300610jwxArr = {c1300610jwx, c1300610jwx2, c1300610jwx3, c1300610jwx4, c1300610jwx5};
                Bundle bundle = new Bundle();
                if (c09gaLIZIZ != null) {
                    c09gaLIZIZ.LJIILJJIL(c1300610jwxArr, bundle);
                }
                Object objLJI = LJI(bundle, c1300610jwx.LIZ);
                if (objLJI instanceof Float) {
                    this.LIZ = ((Float) objLJI).floatValue();
                }
                Object objLJI2 = LJI(bundle, c1300610jwx2.LIZ);
                if (objLJI2 instanceof Float) {
                    this.LIZLLL = ((Float) objLJI2).floatValue();
                }
                Object objLJI3 = LJI(bundle, c1300610jwx3.LIZ);
                if (objLJI3 instanceof Float) {
                    this.LJ = ((Float) objLJI3).floatValue();
                }
                Object objLJI4 = LJI(bundle, c1300610jwx4.LIZ);
                if (objLJI4 instanceof Float) {
                    this.LIZIZ = ((Float) objLJI4).floatValue();
                }
                Object objLJI5 = LJI(bundle, c1300610jwx5.LIZ);
                if (objLJI5 instanceof Float) {
                    this.LIZJ = ((Float) objLJI5).floatValue();
                }
            }

            @Override // X.InterfaceC1101100elA
            public final void LIZLLL(HashMap<String, String> map) {
                C09GA c09gaLIZIZ = C212350188e.LIZJ().LIZIZ(((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).appId());
                if (c09gaLIZIZ != null) {
                    c09gaLIZIZ.LJIILL(map);
                }
            }

            public static Object LJI(Bundle bundle, String str) {
                try {
                    return bundle.get(str);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return null;
                } catch (OutOfMemoryError e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    return null;
                }
            }
        };
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor
    public final String OL0() {
        C844470XAv.LIZ.getClass();
        return C844470XAv.LJIILL;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor
    public final String getAppVersion() {
        C844470XAv.LIZ.getClass();
        return C844470XAv.LJFF();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor
    public final HashMap<String, Double> getCpuRate() {
        HashMap<String, Double> map = new HashMap<>();
        C798360VTm c798360VTm = new C798360VTm(true, true, true, null, false);
        c798360VTm.LIZ();
        a aVarLIZ = C0VGK.LIZ();
        c798360VTm.LIZ();
        map.put("cpu_rate", Double.valueOf(aVarLIZ.LIZ));
        map.put("cpu_speed", Double.valueOf(aVarLIZ.LIZIZ));
        map.put("cpu_speed_otis", Double.valueOf(c798360VTm.LJI.LIZIZ));
        map.put("cpu_rate_otis", Double.valueOf(c798360VTm.LJI.LIZ));
        map.put("normalizer_cpu_usage", Double.valueOf(c798360VTm.LJI.LIZJ));
        return map;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor
    public final InterfaceC2184031Adl q81() {
        return new C0VVF(0);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor
    public final double Sb2() {
        return GraphicsMonitor.getByteGpu();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor
    public final void Zg1() {
        try {
            GraphicsMonitor.start();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C20441214yg.LJII(th);
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor
    public final void cH() {
        try {
            if (GraphicsMonitor.isStart()) {
                GraphicsMonitor.stop();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C20441214yg.LJII(th);
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor
    public final HashMap<String, Long> getMemory() {
        if (LiveHostJavaMaxCacheFix.isEnable() || this.LL == -999) {
            this.LL = Runtime.getRuntime().maxMemory();
        }
        HashMap<String, Long> map = new HashMap<>();
        C844470XAv.LIZ.getClass();
        C0VGL c0vglLIZIZ = C0VGK.LIZIZ(C844470XAv.LIZ());
        map.put("mem_java_total", Long.valueOf(c0vglLIZIZ.LIZ));
        map.put("mem_java_free", Long.valueOf(c0vglLIZIZ.LIZIZ));
        map.put("mem_java_used", Long.valueOf(c0vglLIZIZ.LIZJ));
        map.put("mem_pss_dalvik", Long.valueOf(c0vglLIZIZ.LIZLLL));
        map.put("mem_pss_native", Long.valueOf(c0vglLIZIZ.LJ));
        map.put("mem_pss_total", Long.valueOf(c0vglLIZIZ.LJFF));
        map.put("mem_graphics", Long.valueOf(c0vglLIZIZ.LJI));
        map.put("mem_vmsize", Long.valueOf(c0vglLIZIZ.LJII));
        map.put("mem_app_allocate", Long.valueOf((c0vglLIZIZ.LJFF - c0vglLIZIZ.LIZLLL) + c0vglLIZIZ.LIZ));
        map.put("mem_java_max", Long.valueOf(this.LL));
        return map;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor
    public final void IN0() {
        GraphicsMonitor.init();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor
    public final Map<String, String> fI(Context context) {
        double dLLD;
        HashMap map = new HashMap(4);
        if (context == null) {
            return map;
        }
        try {
            map.put("thor_galvanic_now", String.valueOf(b.LIZJ(context)));
            BatteryManager batteryManagerLIZ = b.LIZ(context);
            float f = -1.0f;
            if (batteryManagerLIZ != null) {
                float fLLD = C2204961BRm.LLD(batteryManagerLIZ, 3, new C0WZX("dzBzEhEpEd7UWkVvcRqLdNhewgBO", null));
                if (!C20644086w.LIZJ() && !C20644086w.LIZIZ()) {
                    if (C20644086w.LIZ()) {
                        if (fLLD > 10000.0f) {
                            fLLD /= 1000.0f;
                        }
                        f = fLLD;
                    } else {
                        f = fLLD / 1000.0f;
                    }
                } else if (fLLD >= -1.0E7f && fLLD <= 1.0E7f) {
                    if (fLLD < -10000.0f) {
                        fLLD /= 1000.0f;
                    }
                    f = -fLLD;
                }
            }
            map.put("thor_galvanic_avg", String.valueOf(f));
            map.put("thor_use_battery", String.valueOf((((double) b.LIZJ(context)) * 0.5d) / 3600.0d));
            if (b.LIZ(context) == null) {
                dLLD = -1.0d;
            } else {
                dLLD = (C2204961BRm.LLD(r2, 5, new C0WZX("dzBzEhEpEd7UWkVvcRqLdNhewgBO", null)) / 1.0E9d) / 1000.0d;
            }
            map.put("thor_energy", String.valueOf(dLLD));
            return map;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return map;
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor
    public final InterfaceC1162920gMs nt0(final String str) {
        return new InterfaceC1162920gMs(str) { // from class: X.0VVK
            public final C0V2A LIZ;

            @Override // X.InterfaceC1162920gMs
            public final int LIZ() {
                int i = C0VXC.LIZIZ;
                if (i == 0) {
                    return 60;
                }
                return i;
            }

            @Override // X.InterfaceC1162920gMs
            public final void start() {
                this.LIZ.LJFF();
            }

            @Override // X.InterfaceC1162920gMs
            public final void stop() {
                this.LIZ.LJ(null);
                this.LIZ.LJI();
            }

            {
                this.LIZ = new C0V2A(str, true);
            }

            @Override // X.InterfaceC1162920gMs
            public final void LIZIZ(final C0VVO c0vvo) {
                this.LIZ.LIZLLL(new C0V22() { // from class: X.0VVL
                    @Override // X.C0V22
                    public final void LIZIZ(double d) {
                        c0vvo.LIZIZ(d);
                    }
                });
            }

            @Override // X.InterfaceC1162920gMs
            public final void LIZJ(Window window) {
                this.LIZ.LJ(window);
                this.LIZ.LJFF();
            }

            @Override // X.InterfaceC1162920gMs
            public final void LIZLLL(final C1163640gO2 c1163640gO2) {
                C0V2A c0v2a = this.LIZ;
                C0V2B c0v2b = new C0V2B() { // from class: X.0VVP
                    @Override // X.C0V2B
                    public final void onEmpty() {
                        c1163640gO2.onEmpty();
                    }
                };
                C0V29 c0v29 = c0v2a.LJFF;
                if (c0v29 != null) {
                    c0v29.LJFF = c0v2b;
                }
                c0v2a.LJ = c0v2b;
            }

            @Override // X.InterfaceC1162920gMs
            public final void LJ(final C0VVN c0vvn) {
                this.LIZ.LIZJ(new InterfaceC791210V1z() { // from class: X.0VVM
                    @Override // X.InterfaceC791210V1z
                    public final void LIZLLL(JSONObject jSONObject) {
                        c0vvn.LIZLLL(jSONObject);
                    }
                });
            }
        };
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor
    public final InterfaceC466620IRo r62(InterfaceC21605719h1 interfaceC21605719h1) {
        return new C21602919gZ(interfaceC21605719h1);
    }
}
