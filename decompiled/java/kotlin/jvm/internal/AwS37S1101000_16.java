package kotlin.jvm.internal;

import X.C09AY;
import X.C1007900cKq;
import X.C1008100cLA;
import X.C1008420cLg;
import X.C1554300qY8;
import X.InterfaceC1007930cKt;
import android.content.Context;
import com.bytedance.hybrid.spark.security.ThirdPartyBizCert;
import com.bytedance.hybrid.spark.third.router.SparkThirdContext;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes17.dex */
public class AwS37S1101000_16 extends C09AY implements Function0 {
    public final int $t;
    public int i2;
    public Object l1;
    public String s0;

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

    public static final Object invoke$0(AwS37S1101000_16 awS37S1101000_16) {
        Context context = (Context) awS37S1101000_16.l1;
        SparkThirdContext sparkThirdContext = new SparkThirdContext();
        sparkThirdContext.url = awS37S1101000_16.s0;
        sparkThirdContext.bizCert = new ThirdPartyBizCert(awS37S1101000_16.i2);
        C1554300qY8.LIZIZ(context, sparkThirdContext);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS37S1101000_16 awS37S1101000_16) {
        AnoleComponentModel anoleComponentModelAk;
        String str;
        InterfaceC1007930cKt interfaceC1007930cKt = ((C1007900cKq) awS37S1101000_16.l1).LJII.get(awS37S1101000_16.s0);
        if (interfaceC1007930cKt != null && (anoleComponentModelAk = interfaceC1007930cKt.Ak()) != null && (str = anoleComponentModelAk.slotID) != null) {
            ((C1007900cKq) awS37S1101000_16.l1).LJIIJJI.offer(new C1008420cLg(awS37S1101000_16.s0, str, new C1008100cLA(awS37S1101000_16.i2)));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS37S1101000_16(C1007900cKq c1007900cKq, String str, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l1 = c1007900cKq;
        this.s0 = str;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS37S1101000_16(Context context, int i, String str, int i2) {
        super(0);
        this.$t = i2;
        this.l1 = context;
        this.s0 = str;
        this.i2 = i;
    }
}
