package kotlin.jvm.internal;

import X.C09AY;
import X.C0LQ5;
import X.C10Y9;
import X.C1397620mTQ;
import X.C1397660mTU;
import X.C20684815ws;
import X.C2344009Gk;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public class AwS0S4200000_8 extends C09AY implements Function1 {
    public final int $t;
    public Object l4;
    public Object l5;
    public String s0;
    public String s1;
    public String s2;
    public String s3;

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

    public static final Object invoke$0(AwS0S4200000_8 awS0S4200000_8, Object obj) {
        ((C1397660mTU) obj).LIZ().LIZIZ(null);
        String strValueOf = String.valueOf(2131845693);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("rule_id", awS0S4200000_8.s0);
        c2344009Gk.LJIIIIZZ("push_label", awS0S4200000_8.s1);
        c2344009Gk.LJIIIIZZ("anchor_id", awS0S4200000_8.s2);
        c2344009Gk.LJIIIIZZ("room_id", awS0S4200000_8.s3);
        C20684815ws.LJIILLIIL(strValueOf, c2344009Gk.LIZ);
        Context context = (Context) awS0S4200000_8.l4;
        if (context instanceof Activity) {
            C10Y9.LJI((Activity) context, (Intent) awS0S4200000_8.l5);
            ((Activity) ((Context) awS0S4200000_8.l4)).finish();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S4200000_8 awS0S4200000_8, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(2131845693, new AwS0S4200000_8(awS0S4200000_8.s0, awS0S4200000_8.s1, awS0S4200000_8.s2, awS0S4200000_8.s3, (Context) awS0S4200000_8.l4, (Intent) awS0S4200000_8.l5, 0));
        c1397620mTQ.LJII(2131845692, new C0LQ5(awS0S4200000_8.s0, awS0S4200000_8.s1, awS0S4200000_8.s2, awS0S4200000_8.s3));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S4200000_8(String str, String str2, String str3, String str4, Context context, Intent intent, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
        this.s3 = str4;
        this.l4 = context;
        this.l5 = intent;
    }
}
