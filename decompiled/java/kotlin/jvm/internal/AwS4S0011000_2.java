package kotlin.jvm.internal;

import X.C09AY;
import X.C0SZ4;
import X.C13LE;
import X.C332430D1l;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.cta.PoiDetailHeaderPoiShopFirstCtaAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.cta.PoiDetailHeaderPoiShopSecondCtaAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public class AwS4S0011000_2 extends C09AY implements Function1 {
    public final int $t;
    public int i1;
    public boolean z0;

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

    public static final Object invoke$0(AwS4S0011000_2 awS4S0011000_2, Object obj) {
        Class cls;
        C0SZ4 c0sz4 = (C0SZ4) obj;
        if (awS4S0011000_2.z0) {
            cls = PoiDetailHeaderPoiShopFirstCtaAssem.class;
        } else {
            cls = PoiDetailHeaderPoiShopSecondCtaAssem.class;
        }
        c0sz4.LL = C13LE.LIZ(cls);
        c0sz4.LLIZLLLIL = awS4S0011000_2.i1;
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS4S0011000_2 awS4S0011000_2, Object obj) {
        return C332430D1l.LIZ((C332430D1l) obj, awS4S0011000_2.i1, awS4S0011000_2.z0, null, 9);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS4S0011000_2(int i, boolean z, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.z0 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS4S0011000_2(boolean z, int i, int i2) {
        super(1);
        this.$t = i2;
        this.z0 = z;
        this.i1 = i;
    }
}
