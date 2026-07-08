package kotlin.jvm.internal;

import X.AbstractC1033200cze;
import X.AbstractC1033330czr;
import X.AbstractC1033380czw;
import X.AbstractC1033390czx;
import X.C09AY;
import X.C1002190cBd;
import X.C1023640ckE;
import X.C1032880cz8;
import X.C1032890cz9;
import X.C1033050czP;
import X.C1033110czV;
import X.C1033190czd;
import X.C1033370czv;
import X.C1040740dBo;
import X.C1040780dBs;
import X.C1043500dGG;
import X.C1071110dyn;
import X.C1954807lC;
import X.C2188811AlT;
import X.C625790Ogb;
import X.EnumC1071030dyf;
import X.InterfaceC1033130czX;
import X.InterfaceC1033150czZ;
import X.InterfaceC497601wk;
import com.google.gson.n;
import com.ss.android.ugc.aweme.feed.model.commercialize.adshopifycheckout.ShopifyCheckoutEntity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;

/* JADX INFO: loaded from: classes17.dex */
public class AwS23S2200000_16 extends C09AY implements Function1 {
    public final int $t;
    public Object l2;
    public Object l3;
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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS23S2200000_16 awS23S2200000_16, Object obj) {
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1043500dGG.LIZ.getClass();
        c1023640ckE.withParam(C1043500dGG.LJFF, awS23S2200000_16.s0);
        c1023640ckE.withParam(C1043500dGG.LJIILJJIL, Integer.valueOf(((C1040740dBo) awS23S2200000_16.l2).LL.getFirstPage()));
        if (Intrinsics.LJFF((Boolean) awS23S2200000_16.l3, Boolean.TRUE)) {
            C1040780dBs.LIZ.getClass();
            c1023640ckE.withParam(C1040780dBs.LIZIZ, awS23S2200000_16.s1);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS23S2200000_16 awS23S2200000_16, Object obj) {
        String shopifyDomain;
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1043500dGG.LIZ.getClass();
        C1002190cBd c1002190cBd = C1043500dGG.LLFII;
        ShopifyCheckoutEntity shopifyCheckoutEntity = (ShopifyCheckoutEntity) awS23S2200000_16.l2;
        if (shopifyCheckoutEntity != null) {
            shopifyDomain = shopifyCheckoutEntity.getShopifyDomain();
        } else {
            shopifyDomain = null;
        }
        c1023640ckE.withParam(c1002190cBd, shopifyDomain);
        c1023640ckE.withParam(C1043500dGG.LLFFF, ((C1040740dBo) awS23S2200000_16.l3).LLJI);
        c1023640ckE.withParam(C1043500dGG.LLIIIJ, awS23S2200000_16.s0);
        c1023640ckE.withParam(C1043500dGG.LLIIIL, awS23S2200000_16.s1);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS23S2200000_16 awS23S2200000_16, Object obj) {
        String shopifyDomain;
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1043500dGG.LIZ.getClass();
        C1002190cBd c1002190cBd = C1043500dGG.LLFII;
        ShopifyCheckoutEntity shopifyCheckoutEntity = (ShopifyCheckoutEntity) awS23S2200000_16.l2;
        if (shopifyCheckoutEntity != null) {
            shopifyDomain = shopifyCheckoutEntity.getShopifyDomain();
        } else {
            shopifyDomain = null;
        }
        c1023640ckE.withParam(c1002190cBd, shopifyDomain);
        c1023640ckE.withParam(C1043500dGG.LLFFF, ((C1040740dBo) awS23S2200000_16.l3).LLJI);
        c1023640ckE.withParam(C1043500dGG.LLIIIJ, awS23S2200000_16.s0);
        c1023640ckE.withParam(C1043500dGG.LLIIIL, awS23S2200000_16.s1);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS23S2200000_16 awS23S2200000_16, Object obj) {
        String shopifyDomain;
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1043500dGG.LIZ.getClass();
        C1002190cBd c1002190cBd = C1043500dGG.LLFII;
        ShopifyCheckoutEntity shopifyCheckoutEntity = (ShopifyCheckoutEntity) awS23S2200000_16.l2;
        if (shopifyCheckoutEntity != null) {
            shopifyDomain = shopifyCheckoutEntity.getShopifyDomain();
        } else {
            shopifyDomain = null;
        }
        c1023640ckE.withParam(c1002190cBd, shopifyDomain);
        c1023640ckE.withParam(C1043500dGG.LLFFF, ((C1040740dBo) awS23S2200000_16.l3).LLJI);
        c1023640ckE.withParam(C1043500dGG.LLIIIJ, awS23S2200000_16.s0);
        c1023640ckE.withParam(C1043500dGG.LLIIIL, awS23S2200000_16.s1);
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS23S2200000_16 awS23S2200000_16, Object obj) throws JSONException {
        AbstractC1033380czw abstractC1033380czw = (AbstractC1033380czw) obj;
        ((Function1) awS23S2200000_16.l2).invoke(abstractC1033380czw);
        if (abstractC1033380czw instanceof C1033190czd) {
            C1032890cz9 c1032890cz9 = C1032890cz9.LIZ;
            InterfaceC1033130czX interfaceC1033130czX = (InterfaceC1033130czX) awS23S2200000_16.l3;
            n nVar = ((C1033190czd) abstractC1033380czw).LIZ;
            String str = awS23S2200000_16.s0;
            c1032890cz9.getClass();
            C1033050czP c1033050czPLJI = C1032890cz9.LJI(nVar, interfaceC1033130czX, str);
            if (c1033050czPLJI == null) {
                C625790Ogb.LIZ();
            } else {
                C1032890cz9.LJIIIIZZ(awS23S2200000_16.s1, c1033050czPLJI);
            }
        } else if (abstractC1033380czw instanceof AbstractC1033200cze) {
            C1032890cz9 c1032890cz92 = C1032890cz9.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("RequestFromPreload, callback.Failure, result: ");
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

    public static final Object invoke$5(AwS23S2200000_16 awS23S2200000_16, Object obj) {
        C1071110dyn c1071110dyn = (C1071110dyn) obj;
        c1071110dyn.LIZJ = (InterfaceC497601wk) awS23S2200000_16.l2;
        c1071110dyn.LIZJ(new AwS595S0100000_16((EnumC1071030dyf) awS23S2200000_16.l3, 179));
        new AwS16S2000000_16(awS23S2200000_16.s0, awS23S2200000_16.s1, 2).invoke(c1071110dyn.LJ);
        c1071110dyn.LIZIZ(AFwS252S0000000_16.get$arr$(376));
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS23S2200000_16 awS23S2200000_16, Object obj) throws JSONException {
        AbstractC1033390czx abstractC1033390czx = (AbstractC1033390czx) obj;
        ((Function1) awS23S2200000_16.l2).invoke(abstractC1033390czx);
        if (abstractC1033390czx instanceof C1033370czv) {
            C1033110czV c1033110czVLJI = C1032880cz8.LJI((InterfaceC1033150czZ) awS23S2200000_16.l3, ((C1033370czv) abstractC1033390czx).LIZ, awS23S2200000_16.s0);
            if (c1033110czVLJI != null) {
                C1032880cz8.LJII(awS23S2200000_16.s1, c1033110czVLJI, (InterfaceC1033150czZ) awS23S2200000_16.l3);
            }
        } else if (abstractC1033390czx instanceof AbstractC1033330czr) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("RequestFromPreload, callback.Failure, result: ");
            sbLIZ.append(abstractC1033390czx);
            C2188811AlT.LIZIZ(sbLIZ);
            C1032880cz8.LIZLLL(null, (AbstractC1033330czr) abstractC1033390czx);
        } else {
            throw new C1954807lC();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS23S2200000_16(InterfaceC497601wk interfaceC497601wk, EnumC1071030dyf enumC1071030dyf, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = interfaceC497601wk;
        this.l3 = enumC1071030dyf;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS23S2200000_16(ShopifyCheckoutEntity shopifyCheckoutEntity, C1040740dBo c1040740dBo, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = shopifyCheckoutEntity;
        this.l3 = c1040740dBo;
        this.s0 = str;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS23S2200000_16(String str, C1040740dBo c1040740dBo, Boolean bool, String str2, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l2 = c1040740dBo;
        this.l3 = bool;
        this.s1 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS23S2200000_16(Function1 function1, Function1<? super AbstractC1033380czw, Unit> function12, InterfaceC1033130czX interfaceC1033130czX, String str, String str2) {
        super(1);
        this.$t = str2;
        this.l2 = function1;
        this.l3 = function12;
        this.s0 = interfaceC1033130czX;
        this.s1 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS23S2200000_16(Function1 function1, Function1<? super AbstractC1033390czx, Unit> function12, InterfaceC1033150czZ interfaceC1033150czZ, String str, String str2) {
        super(1);
        this.$t = str2;
        this.l2 = function1;
        this.l3 = function12;
        this.s0 = interfaceC1033150czZ;
        this.s1 = str;
    }
}
