package com.ss.android.ugc.aweme.diagnosis;

import X.AbstractC19994813Le;
import X.C01GW;
import X.C07KH;
import X.C07KI;
import X.C0CCZ;
import X.C0S78;
import X.C0VZ0;
import X.C1496910p3Z;
import X.C1C8C;
import X.C1C8D;
import X.C1C8G;
import X.C1C8H;
import X.C1C8V;
import X.C1C8Y;
import X.C1C8Z;
import X.C1EOW;
import X.C2097608Jq;
import X.C2225151C7d;
import X.C2407009bw;
import X.C2554309zh;
import X.C278250AvP;
import X.C452501pT;
import X.C786410Ut5;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import com.bytedance.otis.protos.DropFrameInfo;
import com.bytedance.otis.protos.PerfData;
import com.bytedance.otis.resource.diagnose.server.IHippoReportAPI;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS200S0000000_13;
import kotlin.jvm.internal.AFwS225S0000000_34;
import kotlin.jvm.internal.AwS578S0100000_34;
import okio.ByteString;

/* JADX INFO: loaded from: classes35.dex */
public final class DiagnosisDropFrameMonitorTask implements C0CCZ {
    public static volatile boolean LLILLJJLI;
    public static long LLILLL;
    public static final DiagnosisDropFrameMonitorTask LL = new DiagnosisDropFrameMonitorTask();
    public static final C1C8H LLILZ = new C1C8H();
    public static C1C8H LLILZIL = new C1C8H();
    public static Map<String, ? extends Object> LLILZLL = C2097608Jq.LJ();
    public static final C01GW LLIZ = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(49));
    public static final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(109));
    public static final C01GW LLJ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(110));
    public static final C01GW LLJI = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(50));
    public static final C01GW LLJIJIL = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(112));

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "DiagnosisDropFrameMonitorTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    public final Handler LIZ() {
        return (Handler) LLIZLLLIL.getValue();
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BACKGROUND;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return;
        }
        C2407009bw.LIZ();
        C0S78.LIZJ(AFwS200S0000000_13.get$arr$(111), true);
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [X.1C8V] */
    public final void LJ(String str, String str2) {
        if (SystemClock.uptimeMillis() - LLILLL < 100) {
            return;
        }
        Handler handlerLIZ = LIZ();
        C01GW c01gw = LLJ;
        handlerLIZ.removeCallbacks((Runnable) c01gw.getValue());
        Handler handlerLIZ2 = LIZ();
        Runnable runnable = (Runnable) c01gw.getValue();
        C01GW c01gw2 = C278250AvP.LIZ;
        C786410Ut5.LJLIIL(((Number) c01gw2.getValue()).longValue(), handlerLIZ2, runnable);
        if (AbstractC19994813Le.Default.nextFloat() < ((Number) C2554309zh.LIZ.getValue()).floatValue()) {
            long j = LLILLL;
            C1C8H c1c8h = LLILZ;
            C1C8H c1c8hLIZ = C1C8H.LIZ(c1c8h);
            C1C8H c1c8hLIZ2 = C1C8H.LIZ(LLILZIL);
            LLILLL = SystemClock.uptimeMillis();
            LLILZIL = C1C8H.LIZ(c1c8h);
            long j2 = c1c8hLIZ.LIZ - c1c8hLIZ2.LIZ;
            if (j2 <= 0) {
                return;
            }
            C1C8C c1c8c = new C1C8C();
            c1c8c.LIZLLL = Long.valueOf(Math.min(SystemClock.uptimeMillis() - j, ((Number) c01gw2.getValue()).longValue()));
            c1c8c.LJ = Long.valueOf(c1c8hLIZ.LIZIZ - c1c8hLIZ2.LIZIZ);
            c1c8c.LJFF = Long.valueOf(j2);
            long j3 = 16;
            c1c8c.LJI = Integer.valueOf(((int) (c1c8hLIZ.LIZIZ / j3)) - ((int) (c1c8hLIZ2.LIZIZ / j3)));
            c1c8c.LJII = Integer.valueOf(c1c8hLIZ.LIZJ - c1c8hLIZ2.LIZJ);
            c1c8c.LJIIIIZZ = Integer.valueOf(c1c8hLIZ.LIZLLL - c1c8hLIZ2.LIZLLL);
            c1c8c.LJIIIZ = Integer.valueOf(c1c8hLIZ.LJ - c1c8hLIZ2.LJ);
            c1c8c.LJIIJ = Integer.valueOf(c1c8hLIZ.LJFF - c1c8hLIZ2.LJFF);
            C2225151C7d c2225151C7d = new C2225151C7d();
            c2225151C7d.LIZLLL = str;
            c2225151C7d.LJ = str2;
            c1c8c.LJIIJJI = c2225151C7d.build();
            long jCurrentTimeMillis = System.currentTimeMillis();
            DropFrameInfo dropFrameInfoBuild = c1c8c.build();
            C1C8G c1c8g = new C1C8G();
            c1c8g.LJ = Long.valueOf(C07KH.LIZIZ);
            c1c8g.LJFF = C07KH.LJII;
            List<PerfData> list = c1c8g.LIZLLL;
            C1C8D c1c8d = new C1C8D();
            c1c8d.LIZLLL = Long.valueOf(jCurrentTimeMillis);
            c1c8d.LJ = Integer.valueOf(C1EOW.TypeFpsDrop.getValue());
            C1496910p3Z c1496910p3Z = ByteString.Companion;
            byte[] bArrEncode = dropFrameInfoBuild.encode();
            byte[] bArrCopyOf = Arrays.copyOf(bArrEncode, bArrEncode.length);
            c1496910p3Z.getClass();
            c1c8d.LJFF = C1496910p3Z.LIZIZ(bArrCopyOf);
            list.add(c1c8d.build());
            C1C8Y c1c8y = IHippoReportAPI.LIZ;
            ?? r2 = new C1C8Z(c1c8g.build()) { // from class: X.1C8V
                public final C1C8W LIZ;

                @Override // X.C1C8Z
                public final void LIZIZ() {
                }

                @Override // X.C1C8Z
                public final void LIZJ() {
                }

                @Override // X.C1C8Z
                public final C1C8W LIZ() {
                    return this.LIZ;
                }

                {
                    C1C8W c1c8w = new C1C8W();
                    c1c8w.LIZ = perfDataRequest.encode();
                    this.LIZ = c1c8w;
                }
            };
            c1c8y.getClass();
            C07KI.LIZ(new AwS578S0100000_34((C1C8V) r2, 24));
            return;
        }
        LLILLL = SystemClock.uptimeMillis();
        LLILZIL = C1C8H.LIZ(LLILZ);
    }
}
