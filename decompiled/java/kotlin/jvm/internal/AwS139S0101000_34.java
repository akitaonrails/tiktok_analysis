package kotlin.jvm.internal;

import X.C09AY;
import X.C2192231Aqz;
import com.ss.bduploader.BDImageXUploaderBase;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes35.dex */
public class AwS139S0101000_34 extends C09AY implements Function1 {
    public final int $t;
    public int i1;
    public Object l0;

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

    public static final Object invoke$0(AwS139S0101000_34 awS139S0101000_34, Object obj) {
        super/*X.1Ar1*/.LIZJ((String) obj, awS139S0101000_34.i1);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS139S0101000_34 awS139S0101000_34, Object obj) {
        ((BDImageXUploaderBase) obj).setFilePath(awS139S0101000_34.i1, (String[]) awS139S0101000_34.l0);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS139S0101000_34(int i, C2192231Aqz c2192231Aqz, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c2192231Aqz;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS139S0101000_34(int i, String[] strArr, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = strArr;
    }
}
