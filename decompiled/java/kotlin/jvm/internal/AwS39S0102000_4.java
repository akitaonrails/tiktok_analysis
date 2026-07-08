package kotlin.jvm.internal;

import X.C09AY;
import X.C1389890mGx;
import X.C20642515q3;
import X.C418440Gaw;
import X.C814420VxA;
import android.app.Activity;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public class AwS39S0102000_4 extends C09AY implements Function0 {
    public final int $t;
    public int i1;
    public int i2;
    public Object l0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS39S0102000_4 awS39S0102000_4) {
        TuxTextView tuxTextView = (TuxTextView) awS39S0102000_4.l0;
        int i = awS39S0102000_4.i1;
        int i2 = awS39S0102000_4.i2;
        tuxTextView.getLayoutParams().width = -2;
        tuxTextView.getLayoutParams().height = -2;
        tuxTextView.setMinWidth(i);
        tuxTextView.setMinHeight(i);
        tuxTextView.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
        tuxTextView.setText(String.valueOf(i2 + 1));
        tuxTextView.setTuxFont(92);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS39S0102000_4 awS39S0102000_4) {
        String strValueOf;
        TuxTextView tuxTextView = (TuxTextView) awS39S0102000_4.l0;
        int i = awS39S0102000_4.i1;
        int i2 = awS39S0102000_4.i2;
        tuxTextView.getLayoutParams().width = -2;
        tuxTextView.getLayoutParams().height = -2;
        tuxTextView.setMinWidth(i);
        tuxTextView.setMinHeight(i);
        Double dValueOf = Double.valueOf(5.5d);
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(dValueOf));
        Double dValueOf2 = Double.valueOf(1.5d);
        tuxTextView.setPadding(iLIZIZ, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(dValueOf2)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(dValueOf)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(dValueOf2)));
        if (i2 == 0) {
            strValueOf = C20642515q3.LJI(2131839850);
        } else {
            strValueOf = String.valueOf(i2 + 1);
        }
        tuxTextView.setText(strValueOf);
        tuxTextView.setTuxFont(62);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS39S0102000_4 awS39S0102000_4) {
        C1389890mGx c1389890mGx = new C1389890mGx((Activity) awS39S0102000_4.l0);
        c1389890mGx.LJFF(awS39S0102000_4.i1);
        c1389890mGx.LJII(R.attr.a1h);
        c1389890mGx.LJIIIZ(awS39S0102000_4.i2);
        c1389890mGx.LJIIJJI();
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS39S0102000_4(int i, int i2, TuxTextView tuxTextView, int i3) {
        super(0);
        this.$t = i3;
        this.l0 = tuxTextView;
        this.i1 = i;
        this.i2 = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS39S0102000_4(int i, Activity activity, int i2, int i3) {
        super(0);
        this.$t = i3;
        this.l0 = activity;
        this.i1 = i;
        this.i2 = i2;
    }
}
