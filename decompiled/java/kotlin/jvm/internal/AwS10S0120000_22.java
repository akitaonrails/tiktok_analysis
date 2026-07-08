package kotlin.jvm.internal;

import X.C09AY;
import X.C1409790mn3;
import X.C1409810mn5;
import X.C1417330mzD;
import X.C1418670n1N;
import X.C1421230n5V;
import X.C1462070o9N;
import X.InterfaceC1461350o8D;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.creative.model.stickers.PovItemInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public class AwS10S0120000_22 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public boolean z1;
    public boolean z2;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS10S0120000_22 awS10S0120000_22, Object obj) {
        boolean z;
        C1418670n1N c1418670n1N = (C1418670n1N) obj;
        if (awS10S0120000_22.z1 && awS10S0120000_22.z2 && !((C1417330mzD) awS10S0120000_22.l0).T2().LJIILL) {
            z = true;
        } else {
            z = false;
        }
        return C1418670n1N.LIZ(c1418670n1N, null, null, false, false, false, null, null, null, null, null, null, z, 0, null, false, 4177919);
    }

    public static final Object invoke$1(AwS10S0120000_22 awS10S0120000_22, Object obj) {
        InterfaceC1461350o8D interfaceC1461350o8D = (InterfaceC1461350o8D) obj;
        C1462070o9N c1462070o9N = (C1462070o9N) awS10S0120000_22.l0;
        boolean z = awS10S0120000_22.z1;
        boolean z2 = awS10S0120000_22.z2;
        c1462070o9N.getClass();
        if (z2) {
            interfaceC1461350o8D.CQ0().setValue(Boolean.valueOf(z));
        } else {
            interfaceC1461350o8D.zP1().setValue(Boolean.valueOf(z));
        }
        if (z) {
            MutableLiveData<Boolean> mutableLiveDataRb = interfaceC1461350o8D.rb();
            Boolean bool = Boolean.FALSE;
            mutableLiveDataRb.setValue(bool);
            interfaceC1461350o8D.Mk0().setValue(bool);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS10S0120000_22 awS10S0120000_22, Object obj) {
        return C1421230n5V.LIZ((C1421230n5V) obj, false, null, new C1409810mn5((List) awS10S0120000_22.l0, awS10S0120000_22.z1, awS10S0120000_22.z2), null, 11);
    }

    public static final Object invoke$3(AwS10S0120000_22 awS10S0120000_22, Object obj) {
        List list = (List) awS10S0120000_22.l0;
        return C1421230n5V.LIZ((C1421230n5V) obj, false, null, new C1409790mn3(System.currentTimeMillis(), awS10S0120000_22.z1, list, awS10S0120000_22.z2), null, 11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS10S0120000_22(C1462070o9N c1462070o9N, boolean z, boolean z2, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1462070o9N;
        this.z1 = z;
        this.z2 = z2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS10S0120000_22(List list, List<PovItemInfo> list2, boolean z, boolean z2) {
        super(1);
        this.$t = z2 ? 1 : 0;
        this.l0 = list;
        this.z1 = list2;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS10S0120000_22(boolean z, boolean z2, C1417330mzD c1417330mzD, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.z2 = z2;
        this.l0 = c1417330mzD;
    }
}
