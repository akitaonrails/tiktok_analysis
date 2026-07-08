package kotlin.jvm.internal;

import X.C09AY;
import X.C0I0B;
import X.C1397620mTQ;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2431509ft;
import android.content.Context;
import com.ss.android.ugc.aweme.im.whee.ug.impl.interceptor.IMWheeUGRouterInterceptor;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public class AwS4S3300000_3 extends C09AY implements Function1 {
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS4S3300000_3 awS4S3300000_3, Object obj) {
        IMWheeUGRouterInterceptor iMWheeUGRouterInterceptor = (IMWheeUGRouterInterceptor) awS4S3300000_3.l3;
        Context context = (Context) awS4S3300000_3.l4;
        String str = awS4S3300000_3.s0;
        iMWheeUGRouterInterceptor.getClass();
        if (!IMWheeUGRouterInterceptor.LIZIZ(context, str)) {
            ((Function0) awS4S3300000_3.l5).invoke();
        }
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("ttsocial_whee_open_app_popup_click", C2097608Jq.LJIIIIZZ(new Pair("enter_from", awS4S3300000_3.s1), new Pair("enter_method", awS4S3300000_3.s2), new Pair("button_name", "open")));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS4S3300000_3 awS4S3300000_3, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        String string = ((Context) awS4S3300000_3.l3).getString(2131845559);
        IMWheeUGRouterInterceptor iMWheeUGRouterInterceptor = (IMWheeUGRouterInterceptor) awS4S3300000_3.l4;
        c1397620mTQ.LIZJ(0, string, new AwS4S3300000_3((Context) awS4S3300000_3.l3, iMWheeUGRouterInterceptor, awS4S3300000_3.s0, awS4S3300000_3.s1, awS4S3300000_3.s2, (Function0) awS4S3300000_3.l5, 0));
        c1397620mTQ.LIZJ(1, ((Context) awS4S3300000_3.l3).getString(2131828203), new C2431509ft(awS4S3300000_3.s1, awS4S3300000_3.s2));
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS4S3300000_3(android.content.Context r3, com.ss.android.ugc.aweme.im.whee.ug.impl.interceptor.IMWheeUGRouterInterceptor r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, kotlin.jvm.functions.Function0 r8, int r9) {
        /*
            r2 = this;
            r2.$t = r9
            if (r9 == 0) goto L16
            r1 = r2
            r1.l3 = r3
            r1.l4 = r4
            r1.s0 = r5
            r1.l5 = r8
            r1.s1 = r6
            r1.s2 = r7
            r0 = 1
        L12:
            r1.<init>(r0)
            return
        L16:
            r1 = r2
            r1.l3 = r4
            r1.l4 = r3
            r1.s0 = r5
            r1.l5 = r8
            r1.s1 = r6
            r1.s2 = r7
            r0 = 1
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS4S3300000_3.<init>(android.content.Context, com.ss.android.ugc.aweme.im.whee.ug.impl.interceptor.IMWheeUGRouterInterceptor, java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, int):void");
    }
}
