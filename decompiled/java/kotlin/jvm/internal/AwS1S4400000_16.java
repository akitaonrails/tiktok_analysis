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
public class AwS1S4400000_16 extends C09AY implements Function1 {
    public final int $t;
    public Object l4;
    public Object l5;
    public Object l6;
    public Object l7;
    public String s0;
    public String s1 = null;
    public String s2 = "profile_card";
    public String s3;

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

    public static final Object invoke$0(AwS1S4400000_16 awS1S4400000_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        c1023640ckE.withContext((Aweme) awS1S4400000_16.l4);
        c1023640ckE.withContext((AnchorCommonStruct) awS1S4400000_16.l5);
        c1023640ckE.withContext((MapExtra) awS1S4400000_16.l6);
        C1050580dRg.LIZ.getClass();
        c1023640ckE.withParam(C1050580dRg.LJI, awS1S4400000_16.s0);
        c1023640ckE.withParam(C1050580dRg.LJIIIIZZ, awS1S4400000_16.s1);
        c1023640ckE.withParam(C1050580dRg.LJIIIZ, (Integer) awS1S4400000_16.l7);
        c1023640ckE.withParam(C1050580dRg.LJIIL, awS1S4400000_16.s2);
        c1023640ckE.withParam(C1050580dRg.LJIILIIL, awS1S4400000_16.s3);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS1S4400000_16 awS1S4400000_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        c1023640ckE.withContext((Aweme) awS1S4400000_16.l4);
        c1023640ckE.withContext((AnchorCommonStruct) awS1S4400000_16.l5);
        c1023640ckE.withContext((MapExtra) awS1S4400000_16.l6);
        C1050580dRg.LIZ.getClass();
        c1023640ckE.withParam(C1050580dRg.LJI, awS1S4400000_16.s0);
        c1023640ckE.withParam(C1050580dRg.LJIIIIZZ, awS1S4400000_16.s1);
        c1023640ckE.withParam(C1050580dRg.LJIIIZ, (Integer) awS1S4400000_16.l7);
        c1023640ckE.withParam(C1050580dRg.LJIIL, awS1S4400000_16.s2);
        c1023640ckE.withParam(C1050580dRg.LJIILJJIL, awS1S4400000_16.s3);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS1S4400000_16(Aweme aweme, AnchorCommonStruct anchorCommonStruct, MapExtra mapExtra, String str, Integer num, String str2, int i) {
        super(1);
        this.$t = i;
        this.l4 = aweme;
        this.l5 = anchorCommonStruct;
        this.l6 = mapExtra;
        this.s0 = str;
        this.l7 = num;
        this.s3 = str2;
    }
}
