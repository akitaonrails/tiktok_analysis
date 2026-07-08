package kotlin.jvm.internal;

import X.C09AY;
import X.C1160304gL;
import X.C118300cf;
import X.C1186970gzf;
import X.C259800zU;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.UIAssem;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiShopBookingInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public class AwS8S0302000_2 extends C09AY implements Function1 {
    public final int $t;
    public int i3;
    public int i4;
    public Object l0;
    public Object l1;
    public Object l2;

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

    public static final Object invoke$0(AwS8S0302000_2 awS8S0302000_2, Object obj) {
        Assembler assembler = (Assembler) obj;
        assembler.EQ2((UIAssem) awS8S0302000_2.l0, new AwS368S0200000_2((PoiShopBookingInfo) awS8S0302000_2.l1, (C1186970gzf) awS8S0302000_2.l2, 7));
        assembler.RQ2((UIAssem) awS8S0302000_2.l0, new C1160304gL(awS8S0302000_2.i3, awS8S0302000_2.i4));
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$1(AwS8S0302000_2 awS8S0302000_2, Object obj) {
        byte[] bArr = (byte[]) obj;
        C259800zU c259800zU = (C259800zU) awS8S0302000_2.l0;
        T t = c259800zU.element;
        T tValueOf = t;
        if (t == 0) {
            tValueOf = Integer.valueOf(bArr.length);
        }
        c259800zU.element = tValueOf;
        int iIntValue = ((Number) ((C259800zU) awS8S0302000_2.l0).element).intValue();
        C118300cf c118300cf = (C118300cf) awS8S0302000_2.l1;
        int i = c118300cf.element;
        int i2 = i - awS8S0302000_2.i3;
        if (iIntValue > i2) {
            iIntValue = i2;
        }
        if (iIntValue > 0) {
            c118300cf.element = i - iIntValue;
            System.arraycopy(bArr, ((Number) ((C259800zU) awS8S0302000_2.l0).element).intValue() - iIntValue, (byte[]) awS8S0302000_2.l2, (awS8S0302000_2.i4 + ((C118300cf) awS8S0302000_2.l1).element) - awS8S0302000_2.i3, iIntValue);
            ((C259800zU) awS8S0302000_2.l0).element = null;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS8S0302000_2(C259800zU c259800zU, C259800zU<Integer> c259800zU2, C118300cf c118300cf, int i, byte[] bArr, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c259800zU;
        this.l1 = c259800zU2;
        this.i3 = c118300cf;
        this.l2 = i;
        this.i4 = bArr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS8S0302000_2(UIAssem uIAssem, PoiShopBookingInfo poiShopBookingInfo, C1186970gzf c1186970gzf, int i, int i2, int i3) {
        super(1);
        this.$t = i3;
        this.l0 = uIAssem;
        this.l1 = poiShopBookingInfo;
        this.l2 = c1186970gzf;
        this.i3 = i;
        this.i4 = i2;
    }
}
