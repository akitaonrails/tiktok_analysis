package kotlin.jvm.internal;

import X.AbstractC1033200cze;
import X.AbstractC1033330czr;
import X.AbstractC1033380czw;
import X.AbstractC1033390czx;
import X.C09AY;
import X.C1002190cBd;
import X.C1015350cWr;
import X.C1019070ccr;
import X.C1023640ckE;
import X.C1029470ctd;
import X.C1032800cz0;
import X.C1032810cz1;
import X.C1032880cz8;
import X.C1032890cz9;
import X.C1033050czP;
import X.C1033110czV;
import X.C1033190czd;
import X.C1033370czv;
import X.C1040740dBo;
import X.C1040770dBr;
import X.C1040820dBw;
import X.C1040970dCB;
import X.C1041480dD0;
import X.C1050610dRj;
import X.C1050760dRy;
import X.C1054200dXW;
import X.C1954807lC;
import X.C2188811AlT;
import X.C2266071Dmn;
import X.C2274351E0j;
import X.C625790Ogb;
import android.content.Context;
import com.google.gson.n;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;

/* JADX INFO: loaded from: classes17.dex */
public class AwS40S2100000_16 extends C09AY implements Function1 {
    public final int $t;
    public Object l2;
    public String s0;
    public String s1;

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
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS40S2100000_16 awS40S2100000_16, Object obj) {
        new C1050610dRj().LJIJJ(1, awS40S2100000_16.s0);
        C1050760dRy c1050760dRy = C1050760dRy.LIZ;
        Context context = (Context) awS40S2100000_16.l2;
        String str = awS40S2100000_16.s1;
        c1050760dRy.getClass();
        C1050760dRy.LIZJ(context, str);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS40S2100000_16 awS40S2100000_16, Object obj) {
        new C1050610dRj().LJIJJ(2, awS40S2100000_16.s0);
        C1050760dRy c1050760dRy = C1050760dRy.LIZ;
        Context context = (Context) awS40S2100000_16.l2;
        String str = awS40S2100000_16.s1;
        c1050760dRy.getClass();
        C1050760dRy.LIZLLL(context, str);
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS40S2100000_16 awS40S2100000_16, Object obj) throws JSONException {
        AbstractC1033390czx abstractC1033390czx = (AbstractC1033390czx) obj;
        if (abstractC1033390czx instanceof C1033370czv) {
            C1033110czV c1033110czVLJI = C1032880cz8.LJI((C1032800cz0) awS40S2100000_16.l2, ((C1033370czv) abstractC1033390czx).LIZ, awS40S2100000_16.s0);
            if (c1033110czVLJI != null) {
                C1032880cz8.LJII(awS40S2100000_16.s1, c1033110czVLJI, (C1032800cz0) awS40S2100000_16.l2);
            }
        } else if (abstractC1033390czx instanceof AbstractC1033330czr) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("preloadFromStart callback.Failure, result: ");
            sbLIZ.append(abstractC1033390czx);
            C2188811AlT.LIZIZ(sbLIZ);
            C1032880cz8.LIZLLL(null, (AbstractC1033330czr) abstractC1033390czx);
        } else {
            throw new C1954807lC();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS40S2100000_16 awS40S2100000_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        c1023640ckE.withContext((Aweme) awS40S2100000_16.l2);
        C1029470ctd.LIZ.getClass();
        c1023640ckE.withParam(C1029470ctd.LIZIZ, awS40S2100000_16.s0);
        if (Intrinsics.LJFF(awS40S2100000_16.s1, "slide")) {
            String str = C1019070ccr.LIZ;
            C1019070ccr.LIZ = null;
            if (str == null) {
                str = "others";
            }
            c1023640ckE.withParam(C1029470ctd.LIZJ, str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS40S2100000_16 awS40S2100000_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1040970dCB.LIZ.getClass();
        c1023640ckE.withParam(C1040970dCB.LIZJ, awS40S2100000_16.s0);
        c1023640ckE.withParam(C1040970dCB.LIZIZ, awS40S2100000_16.s1);
        C1040820dBw.LIZ.getClass();
        c1023640ckE.withParam(C1040820dBw.LIZLLL, ((C1040740dBo) awS40S2100000_16.l2).LL.getCurrentUrl());
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS40S2100000_16 awS40S2100000_16, Object obj) throws JSONException {
        AbstractC1033380czw abstractC1033380czw = (AbstractC1033380czw) obj;
        if (abstractC1033380czw instanceof C1033190czd) {
            C1032890cz9 c1032890cz9 = C1032890cz9.LIZ;
            C1032810cz1 c1032810cz1 = (C1032810cz1) awS40S2100000_16.l2;
            n nVar = ((C1033190czd) abstractC1033380czw).LIZ;
            String str = awS40S2100000_16.s0;
            c1032890cz9.getClass();
            C1033050czP c1033050czPLJI = C1032890cz9.LJI(nVar, c1032810cz1, str);
            if (c1033050czPLJI == null) {
                C625790Ogb.LIZ();
            } else {
                C625790Ogb.LIZ();
                C1032890cz9.LJIIIIZZ(awS40S2100000_16.s1, c1033050czPLJI);
            }
        } else if (abstractC1033380czw instanceof AbstractC1033200cze) {
            C1032890cz9 c1032890cz92 = C1032890cz9.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("preloadFromStart callback.Failure, result: ");
            sbLIZ.append(abstractC1033380czw);
            C2188811AlT.LIZIZ(sbLIZ);
            c1032890cz92.getClass();
            C625790Ogb.LIZ();
            C1032890cz9.LIZLLL(null, (AbstractC1033200cze) abstractC1033380czw);
        } else {
            throw new C1954807lC();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS40S2100000_16 awS40S2100000_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1041480dD0.LIZ.getClass();
        c1023640ckE.withParam(C1041480dD0.LJIIJ, ((C1040770dBr) awS40S2100000_16.l2).LIZ);
        c1023640ckE.withParam(C1041480dD0.LJIILJJIL, awS40S2100000_16.s0);
        c1023640ckE.withParam(C1041480dD0.LJIL, awS40S2100000_16.s1);
        c1023640ckE.withParam(C1041480dD0.LJIIIZ, "boc");
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS40S2100000_16 awS40S2100000_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1041480dD0.LIZ.getClass();
        c1023640ckE.withParam(C1041480dD0.LJIIJ, ((C1040770dBr) awS40S2100000_16.l2).LIZ);
        c1023640ckE.withParam(C1041480dD0.LJIILJJIL, awS40S2100000_16.s0);
        c1023640ckE.withParam(C1041480dD0.LJIL, awS40S2100000_16.s1);
        c1023640ckE.withParam(C1041480dD0.LJIIIZ, "boc");
        c1023640ckE.withParam(C1041480dD0.LIZIZ, 3L);
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS40S2100000_16 awS40S2100000_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C2274351E0j.LIZ.getClass();
        c1023640ckE.withParam(C2274351E0j.LJJJJL, ((C1040770dBr) awS40S2100000_16.l2).LIZ);
        c1023640ckE.withParam(C2274351E0j.LJJIJIIJIL, awS40S2100000_16.s0);
        c1023640ckE.withParam(C2274351E0j.LJJJLL, awS40S2100000_16.s1);
        c1023640ckE.withParam(C2274351E0j.LJJI, Long.valueOf(System.currentTimeMillis() - ((C1040770dBr) awS40S2100000_16.l2).LIZIZ));
        c1023640ckE.withParam(C2274351E0j.LJJIZ, Long.valueOf(System.currentTimeMillis() - ((C1040770dBr) awS40S2100000_16.l2).LIZIZ));
        c1023640ckE.withParam(C2274351E0j.LJIIIIZZ, "boc");
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS40S2100000_16 awS40S2100000_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1015350cWr.LIZ.getClass();
        C1002190cBd c1002190cBd = C1015350cWr.LIZJ;
        c1023640ckE.withParam(c1002190cBd, Long.valueOf(((AnoleComponentModel) awS40S2100000_16.l2).getID()));
        c1023640ckE.withParam(c1002190cBd, Long.valueOf(((AnoleComponentModel) awS40S2100000_16.l2).getID()));
        c1023640ckE.withParam(C1015350cWr.LIZLLL, ((AnoleComponentModel) awS40S2100000_16.l2).type);
        c1023640ckE.withParam(C1015350cWr.LJ, awS40S2100000_16.s0);
        c1023640ckE.withParam(C1015350cWr.LJFF, awS40S2100000_16.s1);
        c1023640ckE.withParam(C1015350cWr.LJI, ((AnoleComponentModel) awS40S2100000_16.l2).containerType);
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS40S2100000_16 awS40S2100000_16, Object obj) {
        long j;
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C2266071Dmn.LIZ.getClass();
        c1023640ckE.withParam(C2266071Dmn.LJ, awS40S2100000_16.s0);
        C1002190cBd c1002190cBd = C2266071Dmn.LIZIZ;
        if (((C1054200dXW) awS40S2100000_16.l2).LIZ.LIZJ) {
            j = 1;
        } else {
            j = 0;
        }
        c1023640ckE.withParam(c1002190cBd, Long.valueOf(j));
        c1023640ckE.withParam(C2266071Dmn.LIZLLL, "gp_card");
        c1023640ckE.withParam(C2266071Dmn.LIZJ, awS40S2100000_16.s1);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS40S2100000_16(C1032800cz0 c1032800cz0, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = c1032800cz0;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS40S2100000_16(C1032810cz1 c1032810cz1, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = c1032810cz1;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS40S2100000_16(C1040770dBr c1040770dBr, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = c1040770dBr;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS40S2100000_16(Context context, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l2 = context;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS40S2100000_16(AnoleComponentModel anoleComponentModel, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = anoleComponentModel;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS40S2100000_16(Aweme aweme, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = aweme;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS40S2100000_16(String str, C1054200dXW c1054200dXW, String str2, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l2 = c1054200dXW;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS40S2100000_16(String str, String str2, C1040740dBo c1040740dBo, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = c1040740dBo;
    }
}
