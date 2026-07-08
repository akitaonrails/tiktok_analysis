package kotlin.jvm.internal;

import X.C09AY;
import X.C1861330yXL;
import X.C21674119s3;
import X.C322710Ckv;
import X.C334410D9b;
import X.C336230DGb;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public class AwS131S0201000_4 extends C09AY implements Function0 {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS131S0201000_4 awS131S0201000_4) {
        ((C336230DGb) awS131S0201000_4.l0).LLILLJJLI.Zk(awS131S0201000_4.i2, Math.max(1, ((C334410D9b) awS131S0201000_4.l1).quantity - 1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS131S0201000_4 awS131S0201000_4) {
        ((C336230DGb) awS131S0201000_4.l0).LLILLJJLI.ep(awS131S0201000_4.i2, Math.min(9999, ((C334410D9b) awS131S0201000_4.l1).quantity + 1));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS131S0201000_4 awS131S0201000_4) {
        C1861330yXL.LJI((LinearLayoutManager) awS131S0201000_4.l0, awS131S0201000_4.i2, (Context) awS131S0201000_4.l1, 0.0d, 12);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS131S0201000_4 awS131S0201000_4) {
        C322710Ckv.LIZIZ((LinearLayoutManager) awS131S0201000_4.l0, awS131S0201000_4.i2, (Context) awS131S0201000_4.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS131S0201000_4 awS131S0201000_4) {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) awS131S0201000_4.l0;
        int i = awS131S0201000_4.i2;
        final Context context = (Context) awS131S0201000_4.l1;
        final double d = 100.0d;
        C21674119s3 c21674119s3 = new C21674119s3(d, context) { // from class: X.0DTH
            public final double LJIILL;

            @Override // X.C21674119s3
            public final int LJIILIIL(int i2) {
                return 100;
            }

            @Override // X.C21674119s3
            public final int LJIILL() {
                return 1;
            }

            {
                super(context);
                this.LJIILL = d;
            }

            @Override // X.C21674119s3
            public final int LJIIJ(int i2, View view) {
                return super.LJIIJ(i2, view) - C341940Daq.LIZ(this.LJIILL);
            }
        };
        c21674119s3.LIZ = i;
        linearLayoutManager.startSmoothScroll(c21674119s3);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS131S0201000_4 awS131S0201000_4) {
        C322710Ckv.LIZIZ((LinearLayoutManager) awS131S0201000_4.l0, awS131S0201000_4.i2, (Context) awS131S0201000_4.l1);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS131S0201000_4(int i, Context context, LinearLayoutManager linearLayoutManager, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = linearLayoutManager;
        this.i2 = i;
        this.l1 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS131S0201000_4(C336230DGb c336230DGb, int i, C334410D9b c334410D9b, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c336230DGb;
        this.i2 = i;
        this.l1 = c334410D9b;
    }
}
