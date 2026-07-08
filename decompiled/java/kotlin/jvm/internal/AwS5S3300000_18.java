package kotlin.jvm.internal;

import X.C09AY;
import X.C1206950hVt;
import X.C1207120hWA;
import X.C1397620mTQ;
import X.C19741112Lp;
import X.C849850XVn;
import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes19.dex */
public class AwS5S3300000_18 extends C09AY implements Function1 {
    public final int $t;
    public Object l3;
    public Object l4;
    public Object l5;
    public String s0;
    public String s1;
    public String s2;

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
            case 4:
                return invoke$4(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS5S3300000_18 awS5S3300000_18, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(2131845028, new AwS5S3300000_18((Activity) awS5S3300000_18.l3, (C1206950hVt) awS5S3300000_18.l4, awS5S3300000_18.s0, awS5S3300000_18.s1, awS5S3300000_18.s2, (Function0) awS5S3300000_18.l5, 3));
        c1397620mTQ.LJFF(2131845029, new AwS5S3300000_18((Activity) awS5S3300000_18.l3, (C1206950hVt) awS5S3300000_18.l4, awS5S3300000_18.s0, awS5S3300000_18.s1, awS5S3300000_18.s2, (Function0) awS5S3300000_18.l5, 4));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS5S3300000_18 awS5S3300000_18, Object obj) {
        C849850XVn.LIZIZ.LIZJ().LJIJI("location", ((Activity) awS5S3300000_18.l3).getResources().getString(2131844825), true);
        ((C1206950hVt) awS5S3300000_18.l4).LIZIZ(true);
        Function0 function0 = (Function0) awS5S3300000_18.l5;
        if (function0 != null) {
            function0.invoke();
        }
        C1207120hWA c1207120hWA = C1207120hWA.LIZ;
        String str = awS5S3300000_18.s0;
        String str2 = awS5S3300000_18.s1;
        String str3 = awS5S3300000_18.s2;
        c1207120hWA.getClass();
        C1207120hWA.LIZ(str, str2, str3, true, true, true);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS5S3300000_18 awS5S3300000_18, Object obj) {
        C849850XVn.LIZIZ.LIZJ().LJIJI("location", ((Activity) awS5S3300000_18.l3).getResources().getString(2131844824), false);
        ((C1206950hVt) awS5S3300000_18.l4).LIZIZ(false);
        Function0 function0 = (Function0) awS5S3300000_18.l5;
        if (function0 != null) {
            function0.invoke();
        }
        C1207120hWA c1207120hWA = C1207120hWA.LIZ;
        String str = awS5S3300000_18.s0;
        String str2 = awS5S3300000_18.s1;
        String str3 = awS5S3300000_18.s2;
        c1207120hWA.getClass();
        C1207120hWA.LIZ(str, str2, str3, true, true, false);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS5S3300000_18 awS5S3300000_18, Object obj) {
        C849850XVn.LIZIZ.LIZJ().LJIJI("location", ((Activity) awS5S3300000_18.l3).getResources().getString(2131845028), true);
        ((C1206950hVt) awS5S3300000_18.l4).LIZIZ(true);
        C1207120hWA c1207120hWA = C1207120hWA.LIZ;
        String str = awS5S3300000_18.s0;
        String str2 = awS5S3300000_18.s1;
        String str3 = awS5S3300000_18.s2;
        c1207120hWA.getClass();
        C1207120hWA.LIZ(str, str2, str3, true, true, true);
        Function0 function0 = (Function0) awS5S3300000_18.l5;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS5S3300000_18 awS5S3300000_18, Object obj) {
        C849850XVn.LIZIZ.LIZJ().LJIJI("location", ((Activity) awS5S3300000_18.l3).getResources().getString(2131845029), true);
        ((C1206950hVt) awS5S3300000_18.l4).LIZIZ(true);
        C1207120hWA c1207120hWA = C1207120hWA.LIZ;
        String str = awS5S3300000_18.s0;
        String str2 = awS5S3300000_18.s1;
        String str3 = awS5S3300000_18.s2;
        c1207120hWA.getClass();
        C1207120hWA.LIZ(str, str2, str3, true, true, true);
        C19741112Lp c19741112Lp = C19741112Lp.LIZ;
        Activity activity = (Activity) awS5S3300000_18.l3;
        c19741112Lp.getClass();
        C19741112Lp.LJIIIZ(activity, "android.permission.ACCESS_COARSE_LOCATION");
        Function0 function0 = (Function0) awS5S3300000_18.l5;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS5S3300000_18(android.app.Activity r3, android.app.Activity r4, X.C1206950hVt r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, kotlin.jvm.functions.Function0<kotlin.Unit> r9) {
        /*
            r2 = this;
            r2.$t = r9
            switch(r9) {
                case 0: goto L17;
                case 1: goto L5;
                case 2: goto L5;
                case 3: goto L17;
                case 4: goto L17;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.l3 = r3
            r1.l4 = r4
            r1.l5 = r8
            r1.s0 = r5
            r1.s1 = r6
            r1.s2 = r7
            r0 = 1
        L13:
            r1.<init>(r0)
            return
        L17:
            r1 = r2
            r1.l3 = r3
            r1.l4 = r4
            r1.s0 = r5
            r1.s1 = r6
            r1.s2 = r7
            r1.l5 = r8
            r0 = 1
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS5S3300000_18.<init>(android.app.Activity, X.0hVt, java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, int):void");
    }
}
