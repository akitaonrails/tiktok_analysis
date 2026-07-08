package kotlin.jvm.internal;

import X.C09AY;
import X.C0KW4;
import X.C1623710sM5;
import X.C1645730svb;
import X.C1668880tWw;
import X.C1685910tyP;
import X.C19GS;
import X.C201955140j;
import X.C2341909Fp;
import X.C2344009Gk;
import X.C785410UrT;
import X.InterfaceC1631620sYq;
import X.InterfaceC2342209Fs;
import Y.ARunnableS12S2100000_25;
import android.os.Handler;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes26.dex */
public class AwS55S0200100_25 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC1631620sYq
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS55S0200100_25(C1645730svb c1645730svb, Effect effect, long j, int i) {
        super(3);
        this.$t = i;
        this.l0 = c1645730svb;
        this.l1 = effect;
        this.j2 = j;
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS55S0200100_25 awS55S0200100_25, Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        String str = (String) obj2;
        String str2 = (String) obj3;
        C19GS c19gs = ((C1645730svb) awS55S0200100_25.l0).LIZ;
        if (c19gs != null && !c19gs.isFinishing()) {
            C0KW4 c0kw4 = (C0KW4) ((C1645730svb) awS55S0200100_25.l0).LJIILLIIL.getValue();
            c0kw4.dismiss();
            C785410UrT.LIZ(c0kw4);
            if (zBooleanValue) {
                ((C1645730svb) awS55S0200100_25.l0).LJIIL = C1623710sM5.LIZ((Effect) awS55S0200100_25.l1);
                ((Handler) ((C1645730svb) awS55S0200100_25.l0).LJIJI.getValue()).post(new ARunnableS12S2100000_25((C1645730svb) awS55S0200100_25.l0, str, str2, 1));
                long jCurrentTimeMillis = System.currentTimeMillis() - awS55S0200100_25.j2;
                ((C1645730svb) awS55S0200100_25.l0).getClass();
                List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("api_type", "green_screen_video_upload_info");
                c2344009Gk.LIZLLL(jCurrentTimeMillis, "duration");
                C2341909Fp.LIZ("tool_performance_api", c2344009Gk.LIZ);
            } else {
                C201955140j.LJ("BackgroundVideo default video parse fail");
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS55S0200100_25 r13, java.lang.Object r14, java.lang.Object r15, java.lang.Object r16) {
        /*
            r0 = r16
            r10 = r15
            X.0tpg r10 = (X.InterfaceC1680500tpg) r10
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r1 = r0 & 17
            r0 = 16
            if (r1 != r0) goto L1d
            boolean r0 = r10.LIZ()
            if (r0 == 0) goto L1d
            r10.LIZJ()
        L1a:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1d:
            java.lang.Object r2 = r13.l0
            X.0tWw r2 = (X.C1668880tWw) r2
            r3 = 0
            X.0tyA r1 = X.InterfaceC1685750ty9.LIZ
            r0 = 38
            float r0 = (float) r0
            X.0ty9 r4 = androidx.compose.foundation.layout.c.LJIILIIL(r1, r0)
            long r5 = r13.j2
            r7 = 0
            r9 = 0
            r11 = 432(0x1b0, float:6.05E-43)
            r12 = 112(0x70, float:1.57E-43)
            r8 = r7
            X.C1668930tX1.LIZIZ(r2, r3, r4, r5, r7, r8, r9, r10, r11, r12)
            java.lang.Object r0 = r13.l1
            X.0tyP r0 = (X.C1685910tyP) r0
            if (r0 == 0) goto L1a
            androidx.compose.foundation.layout.FillElement r3 = androidx.compose.foundation.layout.c.LIZJ
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r10.LJJIIJZLJL(r0)
            java.lang.Object r0 = r13.l1
            X.0tyP r0 = (X.C1685910tyP) r0
            boolean r0 = r10.LJJIIJ(r0)
            java.lang.Object r2 = r13.l1
            X.0tyP r2 = (X.C1685910tyP) r2
            java.lang.Object r1 = r10.LJJ()
            if (r0 != 0) goto L60
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r1 != r0) goto L6a
        L60:
            kotlin.jvm.internal.AwS604S0100000_25 r1 = new kotlin.jvm.internal.AwS604S0100000_25
            r0 = 956(0x3bc, float:1.34E-42)
            r1.<init>(r2, r0)
            r10.LJJIJIIJI(r1)
        L6a:
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            r10.LJ()
            X.0ty9 r0 = X.C1680910tqL.LIZ(r3, r1)
            o0.k.LIZ(r0, r10, r9)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS55S0200100_25.invoke$1(kotlin.jvm.internal.AwS55S0200100_25, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS55S0200100_25(C1668880tWw c1668880tWw, long j, C1685910tyP c1685910tyP, int i) {
        super(3);
        this.$t = i;
        this.l0 = c1668880tWw;
        this.j2 = j;
        this.l1 = c1685910tyP;
    }
}
