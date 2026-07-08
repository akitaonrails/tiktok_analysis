package kotlin.jvm.internal;

import X.C09AY;
import X.C1002850cCh;
import X.C2510609se;
import X.InterfaceC1002840cCg;
import Y.ARunnableS27S0101000_16;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.ecommerce.base.sku.powercells.salepropselection.SkuTextSpecCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes17.dex */
public class AwS156S0101000_16 extends C09AY implements Function0 {
    public final int $t;
    public int i1;
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
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS156S0101000_16 awS156S0101000_16) {
        SkuTextSpecCell skuTextSpecCell = (SkuTextSpecCell) awS156S0101000_16.l0;
        if (skuTextSpecCell.LLJJ != awS156S0101000_16.i1) {
            HandlerHook.viewPost(skuTextSpecCell.U5(), new ARunnableS27S0101000_16(awS156S0101000_16.i1, (SkuTextSpecCell) awS156S0101000_16.l0, 6));
            SkuTextSpecCell skuTextSpecCell2 = (SkuTextSpecCell) awS156S0101000_16.l0;
            skuTextSpecCell2.LLJJ = skuTextSpecCell2.LLJILLL;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS156S0101000_16 awS156S0101000_16) {
        InterfaceC1002840cCg interfaceC1002840cCg = ((C1002850cCh) awS156S0101000_16.l0).LLILZLL;
        if (interfaceC1002840cCg != null) {
            interfaceC1002840cCg.LIZ(interfaceC1002840cCg.getContext(), ((C1002850cCh) awS156S0101000_16.l0).LLILZ, awS156S0101000_16.i1);
        }
        int i = C2510609se.LIZ;
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS156S0101000_16 awS156S0101000_16) {
        return ((View) awS156S0101000_16.l0).findViewById(awS156S0101000_16.i1);
    }

    public static final Object invoke$3(AwS156S0101000_16 awS156S0101000_16) {
        ((Function2) awS156S0101000_16.l0).invoke(Integer.valueOf(awS156S0101000_16.i1), "video");
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS156S0101000_16 awS156S0101000_16) {
        ((Function2) awS156S0101000_16.l0).invoke(Integer.valueOf(awS156S0101000_16.i1), "play");
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS156S0101000_16(int i, View view, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = view;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS156S0101000_16(int i, AwS462S0200000_27 awS462S0200000_27, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = awS462S0200000_27;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS156S0101000_16(C1002850cCh c1002850cCh, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c1002850cCh;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS156S0101000_16(SkuTextSpecCell skuTextSpecCell, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = skuTextSpecCell;
        this.i1 = i;
    }
}
