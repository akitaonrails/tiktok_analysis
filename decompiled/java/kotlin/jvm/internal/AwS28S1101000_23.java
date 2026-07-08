package kotlin.jvm.internal;

import X.C09AY;
import X.C1550720qSM;
import X.C957403oi;
import com.lynx.tasm.LynxError;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes24.dex */
public class AwS28S1101000_23 extends C09AY implements Function1 {
    public final int $t;
    public int i2;
    public Object l1;
    public String s0;

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

    public static final Object invoke$0(AwS28S1101000_23 awS28S1101000_23, Object obj) {
        C1550720qSM c1550720qSM = (C1550720qSM) obj;
        c1550720qSM.LIZIZ = true;
        c1550720qSM.LIZJ = awS28S1101000_23.s0;
        c1550720qSM.LIZLLL = ((File) awS28S1101000_23.l1).getName();
        c1550720qSM.LJ = awS28S1101000_23.i2;
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS28S1101000_23 awS28S1101000_23, Object obj) {
        int iLIZIZ;
        String strLIZJ;
        C957403oi c957403oi = (C957403oi) obj;
        LynxError lynxError = (LynxError) awS28S1101000_23.l1;
        if (lynxError != null) {
            iLIZIZ = lynxError.LIZIZ();
        } else {
            iLIZIZ = -1;
        }
        c957403oi.LIZJ("err_code", Integer.valueOf(iLIZIZ));
        LynxError lynxError2 = (LynxError) awS28S1101000_23.l1;
        String str = "";
        if (lynxError2 == null || (strLIZJ = lynxError2.LIZJ()) == null) {
            strLIZJ = "";
        }
        c957403oi.LIZJ("err_msg", strLIZJ);
        c957403oi.LIZJ("brick_name", Integer.valueOf(awS28S1101000_23.i2));
        String str2 = awS28S1101000_23.s0;
        if (str2 != null) {
            str = str2;
        }
        c957403oi.LIZJ("brick_schema", str);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS28S1101000_23(LynxError lynxError, int i, String str, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = lynxError;
        this.i2 = i;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS28S1101000_23(String str, File file, int i, int i2) {
        super(1);
        this.$t = i2;
        this.s0 = str;
        this.l1 = file;
        this.i2 = i;
    }
}
