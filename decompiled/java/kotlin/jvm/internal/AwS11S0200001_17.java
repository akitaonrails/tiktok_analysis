package kotlin.jvm.internal;

import X.C09AY;
import X.C1126240fPi;
import X.C1126380fPw;
import X.C1126390fPx;
import X.C1126400fPy;
import X.C817403Hg;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes18.dex */
public class AwS11S0200001_17 extends C09AY implements Function1 {
    public final int $t;
    public float f2;
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
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS11S0200001_17 awS11S0200001_17, Object obj) {
        C1126390fPx c1126390fPx = (C1126390fPx) obj;
        c1126390fPx.LIZJ = Collections.singletonList(((C1126240fPi) awS11S0200001_17.l0).LLILLJJLI);
        C1126390fPx.LJ(c1126390fPx, awS11S0200001_17.f2, ((C817403Hg) awS11S0200001_17.l1).element);
        c1126390fPx.LIZLLL = 50L;
        c1126390fPx.LJ = C1126400fPy.LIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS11S0200001_17 awS11S0200001_17, Object obj) {
        C1126390fPx c1126390fPx = (C1126390fPx) obj;
        c1126390fPx.LIZJ = Collections.singletonList(((C1126240fPi) awS11S0200001_17.l0).LLILLJJLI);
        C1126390fPx.LJ(c1126390fPx, ((C817403Hg) awS11S0200001_17.l1).element, awS11S0200001_17.f2);
        c1126390fPx.LIZLLL = 50L;
        c1126390fPx.LJ = C1126400fPy.LIZ();
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS11S0200001_17 awS11S0200001_17, Object obj) {
        C1126380fPw c1126380fPw = (C1126380fPw) obj;
        c1126380fPw.LIZ(new AwS11S0200001_17(awS11S0200001_17.f2, (C1126240fPi) awS11S0200001_17.l0, (C817403Hg) awS11S0200001_17.l1, 0));
        c1126380fPw.LIZ(new AwS11S0200001_17(awS11S0200001_17.f2, (C1126240fPi) awS11S0200001_17.l0, (C817403Hg) awS11S0200001_17.l1, 1));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS11S0200001_17 awS11S0200001_17, Object obj) {
        ((C1126380fPw) obj).LIZIZ(new AwS11S0200001_17(awS11S0200001_17.f2, (C1126240fPi) awS11S0200001_17.l0, (C817403Hg) awS11S0200001_17.l1, 2));
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS11S0200001_17(float r3, X.C1126240fPi r4, X.C817403Hg r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            switch(r6) {
                case 0: goto L11;
                case 1: goto L5;
                case 2: goto L11;
                case 3: goto L11;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l0 = r4
            r1.l1 = r5
            r1.f2 = r3
            r0 = 1
        Ld:
            r1.<init>(r0)
            return
        L11:
            r1 = r2
            r1.l0 = r4
            r1.f2 = r3
            r1.l1 = r5
            r0 = 1
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS11S0200001_17.<init>(float, X.0fPi, X.03Hg, int):void");
    }
}
