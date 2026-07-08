package kotlin.jvm.internal;

import X.C09AY;
import X.C21674119s3;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes22.dex */
public class AwS0S0202010_21 extends C09AY implements Function0 {
    public final int $t;
    public double d4;
    public int i2;
    public int i3;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS0S0202010_21 awS0S0202010_21) {
        final Context context = (Context) awS0S0202010_21.l0;
        final double d = awS0S0202010_21.d4;
        final int i = awS0S0202010_21.i2;
        C21674119s3 c21674119s3 = new C21674119s3(context, d, i) { // from class: X.0l1W
            public final double LJIILL;
            public final int LJIILLIIL;

            @Override // X.C21674119s3
            public final int LJIILL() {
                return 1;
            }

            @Override // X.C21674119s3
            public final int LJIILIIL(int i2) {
                return this.LJIILLIIL;
            }

            @Override // X.C21674119s3
            public final int LJIIJ(int i2, View view) {
                return super.LJIIJ(i2, view) - C341940Daq.LIZ(this.LJIILL);
            }

            {
                this.LJIILL = d;
                this.LJIILLIIL = i;
            }
        };
        c21674119s3.LIZ = awS0S0202010_21.i3;
        ((LinearLayoutManager) awS0S0202010_21.l1).startSmoothScroll(c21674119s3);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S0202010_21 awS0S0202010_21) {
        final Context context = (Context) awS0S0202010_21.l0;
        final double d = awS0S0202010_21.d4;
        final int i = awS0S0202010_21.i2;
        C21674119s3 c21674119s3 = new C21674119s3(context, d, i) { // from class: X.0l1X
            public final double LJIILL;
            public final int LJIILLIIL;

            @Override // X.C21674119s3
            public final int LJIILL() {
                return -1;
            }

            @Override // X.C21674119s3
            public final int LJIILIIL(int i2) {
                return this.LJIILLIIL;
            }

            @Override // X.C21674119s3
            public final int LJIIJ(int i2, View view) {
                return super.LJIIJ(i2, view) + C341940Daq.LIZ(this.LJIILL);
            }

            {
                this.LJIILL = d;
                this.LJIILLIIL = i;
            }
        };
        c21674119s3.LIZ = awS0S0202010_21.i3;
        ((LinearLayoutManager) awS0S0202010_21.l1).startSmoothScroll(c21674119s3);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S0202010_21(double d, int i, int i2, Context context, LinearLayoutManager linearLayoutManager, int i3) {
        super(0);
        this.$t = i3;
        this.l0 = context;
        this.d4 = d;
        this.i2 = i;
        this.i3 = i2;
        this.l1 = linearLayoutManager;
    }
}
