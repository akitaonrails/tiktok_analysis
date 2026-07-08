package kotlin.jvm.internal;

import X.C09AY;
import X.C1023640ckE;
import X.C1050580dRg;
import com.ss.android.ugc.aweme.commercialize.anchor.model.MapExtra;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes17.dex */
public class AwS5S3400000_16 extends C09AY implements Function1 {
    public final int $t;
    public Object l3;
    public Object l4;
    public Object l5;
    public Object l6;
    public String s0;
    public String s1;
    public String s2;

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

    public static final Object invoke$0(AwS5S3400000_16 awS5S3400000_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        c1023640ckE.withContext((Aweme) awS5S3400000_16.l3);
        c1023640ckE.withContext((AnchorCommonStruct) awS5S3400000_16.l4);
        c1023640ckE.withContext((MapExtra) awS5S3400000_16.l5);
        C1050580dRg.LIZ.getClass();
        c1023640ckE.withParam(C1050580dRg.LJI, awS5S3400000_16.s0);
        c1023640ckE.withParam(C1050580dRg.LJIIIIZZ, awS5S3400000_16.s1);
        c1023640ckE.withParam(C1050580dRg.LJIIIZ, (Integer) awS5S3400000_16.l6);
        c1023640ckE.withParam(C1050580dRg.LJIIL, awS5S3400000_16.s2);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS5S3400000_16 awS5S3400000_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        c1023640ckE.withContext((Aweme) awS5S3400000_16.l3);
        c1023640ckE.withContext((AnchorCommonStruct) awS5S3400000_16.l4);
        c1023640ckE.withContext((MapExtra) awS5S3400000_16.l5);
        C1050580dRg.LIZ.getClass();
        c1023640ckE.withParam(C1050580dRg.LJI, awS5S3400000_16.s0);
        c1023640ckE.withParam(C1050580dRg.LJIIIIZZ, awS5S3400000_16.s1);
        c1023640ckE.withParam(C1050580dRg.LJIIIZ, (Integer) awS5S3400000_16.l6);
        c1023640ckE.withParam(C1050580dRg.LJIIL, awS5S3400000_16.s2);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS5S3400000_16(Aweme aweme, AnchorCommonStruct anchorCommonStruct, MapExtra mapExtra, String str, String str2, Integer num, String str3, int i) {
        super(1);
        this.$t = i;
        this.l3 = aweme;
        this.l4 = anchorCommonStruct;
        this.l5 = mapExtra;
        this.s0 = str;
        this.s1 = str2;
        this.l6 = num;
        this.s2 = str3;
    }
}
