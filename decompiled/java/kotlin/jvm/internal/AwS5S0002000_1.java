package kotlin.jvm.internal;

import X.C09AY;
import X.C197039127h;
import X.C418440Gaw;
import X.C426750GoL;
import X.C814420VxA;
import X.C957003oe;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public class AwS5S0002000_1 extends C09AY implements Function1 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f1018i0;
    public int i1;

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

    public static final Object invoke$0(AwS5S0002000_1 awS5S0002000_1, Object obj) {
        Paint circlePaint;
        C957003oe c957003oe = (C957003oe) obj;
        c957003oe.setTextFont(92);
        c957003oe.setGravity(16);
        C426750GoL.LJIIIZ(c957003oe, Integer.valueOf(awS5S0002000_1.f1018i0), 0, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), 0, false, 16);
        if (awS5S0002000_1.i1 != 0 && (circlePaint = c957003oe.getCirclePaint()) != null) {
            circlePaint.setColor(awS5S0002000_1.i1);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS5S0002000_1 awS5S0002000_1, Object obj) {
        C197039127h c197039127h = (C197039127h) obj;
        GradientDrawable gradientDrawable = new GradientDrawable();
        int i = awS5S0002000_1.i1;
        gradientDrawable.setColors(new int[]{i, i});
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        c197039127h.setBackground(gradientDrawable);
        c197039127h.LJJLI(true);
        c197039127h.setTextColor(awS5S0002000_1.f1018i0);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS5S0002000_1(int i, int i2, int i3) {
        super(1);
        this.$t = i3;
        this.f1018i0 = i;
        this.i1 = i2;
    }
}
