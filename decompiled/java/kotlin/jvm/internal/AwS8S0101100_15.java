package kotlin.jvm.internal;

import X.C09AY;
import X.C917930Zzj;
import X.C932690aNX;
import X.InterfaceC954180awC;
import X.InterfaceC954910axN;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
public class AwS8S0101100_15 extends C09AY implements Function1 {
    public final int $t;
    public int i1;
    public long j2;
    public Object l0;

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

    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074 A[PHI: r10
      0x0074: PHI (r10v4 java.lang.String) = (r10v0 java.lang.String), (r10v5 java.lang.String) binds: [B:27:0x0072, B:25:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0078 A[PHI: r10
      0x0078: PHI (r10v3 java.lang.String) = (r10v0 java.lang.String), (r10v4 java.lang.String) binds: [B:27:0x0072, B:29:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007b A[PHI: r10 r11
      0x007b: PHI (r10v1 java.lang.String) = (r10v3 java.lang.String), (r10v4 java.lang.String) binds: [B:31:0x0079, B:29:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x007b: PHI (r11v1 java.lang.String) = (r11v3 java.lang.String), (r11v4 java.lang.String) binds: [B:31:0x0079, B:29:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008a A[PHI: r8
      0x008a: PHI (r8v1 java.util.Map<java.lang.String, java.lang.String>) = 
      (r8v0 java.util.Map<java.lang.String, java.lang.String>)
      (r8v3 java.util.Map<java.lang.String, java.lang.String>)
      (r8v3 java.util.Map<java.lang.String, java.lang.String>)
     binds: [B:38:0x0087, B:18:0x0062, B:20:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS8S0101100_15 r11, java.lang.Object r12) {
        /*
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r1 = r12.booleanValue()
            java.lang.Object r0 = r11.l0
            X.0aNX r0 = (X.C932690aNX) r0
            r2 = 1
            r0.L5(r2)
            if (r1 != 0) goto L1d
            java.lang.Object r0 = r11.l0
            X.0aNX r0 = (X.C932690aNX) r0
            X.0KUm r3 = r0.LLILLJJLI
            if (r3 == 0) goto L1d
            long r0 = r11.j2
            r3.LIZ(r0)
        L1d:
            r0 = 2131852856(0x7f117e38, float:1.9339342E38)
            X.C766270U4b.LIZLLL(r0)
            java.lang.Object r0 = r11.l0
            X.0aNX r0 = (X.C932690aNX) r0
            X.0aNj r0 = r0.LLJI
            r0.getClass()
            X.C932810aNj.LIZJ()
            java.lang.String r3 = "invite"
            long r0 = r11.j2
            java.lang.String r4 = java.lang.String.valueOf(r0)
            java.lang.Object r0 = r11.l0
            X.0aNX r0 = (X.C932690aNX) r0
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r0.LL
            if (r1 == 0) goto L8c
            java.lang.Class<X.0TjU> r0 = X.C754980TjU.class
            java.lang.Object r0 = r1.gg0(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L8c
            int r5 = r0.intValue()
        L4d:
            int r0 = r11.i1
            int r6 = r0 + 1
            r7 = 0
            java.lang.Object r0 = r11.l0
            X.0aNX r0 = (X.C932690aNX) r0
            X.0aNW r1 = r0.LLJIJIL
            if (r1 == 0) goto L86
            com.bytedance.android.live.liveinteract.multilive.social.model.GuestInvitePanelResp$ListUser r0 = r1.LIZ
            if (r0 == 0) goto L86
            java.util.Map<java.lang.String, java.lang.String> r8 = r0.trackMap
        L60:
            com.bytedance.android.live.liveinteract.multilive.social.model.GuestInvitePanelResp$ListUser r0 = r1.LIZ
            if (r0 == 0) goto L8a
            int r0 = r0.onlineStatus
            if (r0 != r2) goto L8a
            r9 = 1
        L69:
            java.lang.String r12 = ""
            if (r1 == 0) goto L71
            java.lang.String r10 = r1.LIZJ
            if (r10 != 0) goto L74
        L71:
            r10 = r12
            if (r1 == 0) goto L78
        L74:
            java.lang.String r11 = r1.LIZLLL
            if (r11 != 0) goto L7b
        L78:
            r11 = r12
            if (r1 == 0) goto L80
        L7b:
            java.lang.String r0 = r1.LJ
            if (r0 == 0) goto L80
            r12 = r0
        L80:
            X.C923300a8O.LIZIZ(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L86:
            r8 = 0
            if (r1 == 0) goto L8a
            goto L60
        L8a:
            r9 = 0
            goto L69
        L8c:
            r5 = 0
            goto L4d
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS8S0101100_15.invoke$0(kotlin.jvm.internal.AwS8S0101100_15, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$1(AwS8S0101100_15 awS8S0101100_15, Object obj) {
        InterfaceC954910axN interfaceC954910axN = (InterfaceC954910axN) obj;
        interfaceC954910axN.LJIILIIL(Integer.valueOf(awS8S0101100_15.i1), "permit_status");
        interfaceC954910axN.LJIILIIL(Long.valueOf(awS8S0101100_15.j2), "from_uid");
        interfaceC954910axN.LJIILL((InterfaceC954180awC) awS8S0101100_15.l0);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS8S0101100_15 awS8S0101100_15, Object obj) {
        return C917930Zzj.LIZ((C917930Zzj) obj, awS8S0101100_15.i1, (Integer) awS8S0101100_15.l0, awS8S0101100_15.j2, 0, null, 24);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS8S0101100_15(int i, long j, InterfaceC954180awC interfaceC954180awC, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.j2 = j;
        this.l0 = interfaceC954180awC;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS8S0101100_15(int i, Integer num, long j, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = num;
        this.j2 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS8S0101100_15(C932690aNX c932690aNX, long j, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c932690aNX;
        this.j2 = j;
        this.i1 = i;
    }
}
