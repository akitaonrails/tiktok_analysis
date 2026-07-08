package kotlin.jvm.internal;

import X.C09AY;
import X.C1002190cBd;
import X.C1023640ckE;
import X.C1040740dBo;
import X.C1043500dGG;
import com.ss.android.ugc.aweme.feed.model.commercialize.adshopifycheckout.ShopifyCheckoutEntity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes17.dex */
public class AwS5S2400000_16 extends C09AY implements Function1 {
    public final int $t;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public String s0;
    public String s1;

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

    public static final Object invoke$0(AwS5S2400000_16 awS5S2400000_16, Object obj) {
        String shopifyDomain;
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1043500dGG.LIZ.getClass();
        C1002190cBd c1002190cBd = C1043500dGG.LLFII;
        ShopifyCheckoutEntity shopifyCheckoutEntity = (ShopifyCheckoutEntity) awS5S2400000_16.l2;
        if (shopifyCheckoutEntity != null) {
            shopifyDomain = shopifyCheckoutEntity.getShopifyDomain();
        } else {
            shopifyDomain = null;
        }
        c1023640ckE.withParam(c1002190cBd, shopifyDomain);
        c1023640ckE.withParam(C1043500dGG.LLFFF, ((C1040740dBo) awS5S2400000_16.l3).LLJI);
        c1023640ckE.withParam(C1043500dGG.LLI, (Integer) awS5S2400000_16.l4);
        c1023640ckE.withParam(C1043500dGG.LLIFFJFJJ, (Integer) awS5S2400000_16.l5);
        c1023640ckE.withParam(C1043500dGG.LLIIII, awS5S2400000_16.s0);
        c1023640ckE.withParam(C1043500dGG.LLIIIILZ, awS5S2400000_16.s1);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS5S2400000_16 awS5S2400000_16, Object obj) {
        String shopifyDomain;
        C1023640ckE c1023640ckE = (C1023640ckE) obj;
        C1043500dGG.LIZ.getClass();
        C1002190cBd c1002190cBd = C1043500dGG.LLFII;
        ShopifyCheckoutEntity shopifyCheckoutEntity = (ShopifyCheckoutEntity) awS5S2400000_16.l2;
        if (shopifyCheckoutEntity != null) {
            shopifyDomain = shopifyCheckoutEntity.getShopifyDomain();
        } else {
            shopifyDomain = null;
        }
        c1023640ckE.withParam(c1002190cBd, shopifyDomain);
        c1023640ckE.withParam(C1043500dGG.LLFFF, ((C1040740dBo) awS5S2400000_16.l3).LLJI);
        c1023640ckE.withParam(C1043500dGG.LLI, (Integer) awS5S2400000_16.l4);
        c1023640ckE.withParam(C1043500dGG.LLIFFJFJJ, (Integer) awS5S2400000_16.l5);
        c1023640ckE.withParam(C1043500dGG.LLII, awS5S2400000_16.s0);
        c1023640ckE.withParam(C1043500dGG.LLFZ, awS5S2400000_16.s1);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS5S2400000_16(ShopifyCheckoutEntity shopifyCheckoutEntity, C1040740dBo c1040740dBo, Integer num, Integer num2, String str, String str2, int i) {
        super(1);
        this.$t = i;
        this.l2 = shopifyCheckoutEntity;
        this.l3 = c1040740dBo;
        this.l4 = num;
        this.l5 = num2;
        this.s0 = str;
        this.s1 = str2;
    }
}
