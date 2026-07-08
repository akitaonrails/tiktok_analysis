package kotlin.jvm.internal;

import X.C09AY;
import X.C20425214w6;
import X.C20425514w9;
import X.C20426214wG;
import X.C20426914wN;
import X.C20427014wO;
import X.C20441214yg;
import X.C2188811AlT;
import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.SymphonyEngine;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes32.dex */
public class AwS35S0200100_31 extends C09AY implements Function1 {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS35S0200100_31 awS35S0200100_31, Object obj) {
        C20426914wN c20426914wNLIZLLL = ((SymphonyEngine) obj).LIZLLL(awS35S0200100_31.j2, (C20425214w6) awS35S0200100_31.l0);
        if (C20427014wO.LIZ(c20426914wNLIZLLL.LIZ)) {
            C20426214wG c20426214wG = c20426914wNLIZLLL.LIZIZ;
            ((C20425514w9) awS35S0200100_31.l1).LIZLLL = c20426214wG;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("appendState, success, newRootFlow=");
            sbLIZ.append(c20426914wNLIZLLL.LIZIZ);
            C20441214yg.LIZIZ("SymphonyEngineInstance", C2188811AlT.LIZIZ(sbLIZ));
            return c20426214wG;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("appendState, error=");
        sbLIZ2.append(c20426914wNLIZLLL.LIZ);
        C20441214yg.LIZIZ("SymphonyEngineInstance", C2188811AlT.LIZIZ(sbLIZ2));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS35S0200100_31 r5, java.lang.Object r6) {
        /*
            com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.SymphonyEngine r6 = (com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.SymphonyEngine) r6
            long r1 = r5.j2
            java.lang.Object r0 = r5.l0
            X.14w6 r0 = (X.C20425214w6) r0
            X.14wM r4 = r6.LIZIZ(r1, r0)
            X.14wP r0 = r4.LIZ
            if (r0 == 0) goto L39
            boolean r1 = X.C20427014wO.LIZ(r0)
            r0 = 1
            if (r1 != r0) goto L39
        L17:
            java.lang.String r3 = "SymphonyEngineInstance"
            if (r0 == 0) goto L3b
            X.14wG r2 = r4.LIZIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "appendSingleStateBranch, success, newRootFlow="
            r1.append(r0)
            X.14wG r0 = r4.LIZIZ
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C20441214yg.LIZIZ(r3, r0)
            java.lang.Object r0 = r5.l1
            X.14w9 r0 = (X.C20425514w9) r0
            r0.LIZLLL = r2
            return r2
        L39:
            r0 = 0
            goto L17
        L3b:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "appendSingleStateBranch, error="
            r1.append(r0)
            X.14wP r0 = r4.LIZ
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C20441214yg.LIZIZ(r3, r0)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS35S0200100_31.invoke$1(kotlin.jvm.internal.AwS35S0200100_31, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(kotlin.jvm.internal.AwS35S0200100_31 r5, java.lang.Object r6) {
        /*
            com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.SymphonyEngine r6 = (com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.SymphonyEngine) r6
            long r1 = r5.j2
            java.lang.Object r0 = r5.l0
            java.util.List r0 = (java.util.List) r0
            X.14wN r4 = r6.LJIIZILJ(r1, r0)
            X.14wP r0 = r4.LIZ
            if (r0 == 0) goto L39
            boolean r1 = X.C20427014wO.LIZ(r0)
            r0 = 1
            if (r1 != r0) goto L39
        L17:
            java.lang.String r3 = "SymphonyEngineInstance"
            if (r0 == 0) goto L3b
            X.14wG r2 = r4.LIZIZ
            java.lang.Object r0 = r5.l1
            X.14w9 r0 = (X.C20425514w9) r0
            r0.LIZLLL = r2
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "moveState, success, newRootFlow="
            r1.append(r0)
            X.14wG r0 = r4.LIZIZ
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C20441214yg.LIZIZ(r3, r0)
            return r2
        L39:
            r0 = 0
            goto L17
        L3b:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "moveState, error="
            r1.append(r0)
            X.14wP r0 = r4.LIZ
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C20441214yg.LIZIZ(r3, r0)
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS35S0200100_31.invoke$2(kotlin.jvm.internal.AwS35S0200100_31, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS35S0200100_31(long j, C20425214w6 c20425214w6, C20425514w9 c20425514w9, int i) {
        super(1);
        this.$t = i;
        this.j2 = j;
        this.l0 = c20425214w6;
        this.l1 = c20425514w9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0003: IPUT (r3 I:long), (r1 I:kotlin.jvm.internal.AwS35S0200100_31) (LINE:67174403) kotlin.jvm.internal.AwS35S0200100_31.j2 long, block:B:2:0x0000 */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0005: IPUT (r5 I:java.lang.Object), (r1 I:kotlin.jvm.internal.AwS35S0200100_31) (LINE:67174405) kotlin.jvm.internal.AwS35S0200100_31.l0 java.lang.Object, block:B:2:0x0000 */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.09AY, kotlin.jvm.internal.AwS35S0200100_31] */
    public AwS35S0200100_31(long j, long j2, List<Long> list, C20425514w9 c20425514w9) {
        long j3;
        Object obj;
        c09ay.$t = c20425514w9;
        c09ay.j2 = j3;
        c09ay.l0 = obj;
        c09ay.l1 = list;
        ?? c09ay = new C09AY(1);
    }
}
