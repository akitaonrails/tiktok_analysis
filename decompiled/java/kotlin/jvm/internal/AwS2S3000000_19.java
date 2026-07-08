package kotlin.jvm.internal;

import X.C09AY;
import X.C0R93;
import X.C1262310ixB;
import X.C1262590ixd;
import X.EnumC1262370ixH;
import X.EnumC1262560ixa;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public class AwS2S3000000_19 extends C09AY implements Function1 {
    public final int $t;
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

    public static final Object invoke$0(AwS2S3000000_19 awS2S3000000_19, Object obj) {
        EnumC1262370ixH enumC1262370ixH;
        C1262590ixd c1262590ixd = (C1262590ixd) obj;
        if (C0R93.LIZLLL(awS2S3000000_19.s0)) {
            enumC1262370ixH = EnumC1262370ixH.FYP_VIDEO;
        } else {
            enumC1262370ixH = EnumC1262370ixH.FRIENDS_TAB_VIDEO;
        }
        c1262590ixd.LIZ = enumC1262370ixH;
        c1262590ixd.LJIILIIL = EnumC1262560ixa.RECOMMEND_MORE;
        c1262590ixd.LIZLLL = 3;
        c1262590ixd.LIZJ = 3;
        c1262590ixd.LIZIZ = 1;
        c1262590ixd.LJFF = awS2S3000000_19.s1;
        c1262590ixd.LJI = awS2S3000000_19.s2;
        c1262590ixd.LJII = false;
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS2S3000000_19 awS2S3000000_19, Object obj) {
        C1262310ixB c1262310ixB = (C1262310ixB) obj;
        new AwS2S3000000_19(awS2S3000000_19.s0, awS2S3000000_19.s1, awS2S3000000_19.s2, 0).invoke(c1262310ixB.LJFF);
        c1262310ixB.LIZLLL(AFwS257S0000000_19.get$arr$(636));
        new AwS18S2000000_19(awS2S3000000_19.s0, awS2S3000000_19.s1, 3).invoke(c1262310ixB.LJ);
        c1262310ixB.LIZIZ(AFwS257S0000000_19.get$arr$(637));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS2S3000000_19(String str, String str2, String str3, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.s2 = str3;
    }
}
