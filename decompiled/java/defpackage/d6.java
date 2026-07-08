package defpackage;

import X.C01GW;
import X.C452501pT;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.style.PromotionLabelSingleConfig;
import java.util.Map;
import kotlin.jvm.internal.AFwS207S0000000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class d6 {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(588));

    public static final PromotionLabelSingleConfig LIZ(int i) {
        C01GW c01gw = LIZ;
        PromotionLabelSingleConfig promotionLabelSingleConfig = (PromotionLabelSingleConfig) ((Map) c01gw.getValue()).get(String.valueOf(i));
        if (promotionLabelSingleConfig == null) {
            return (PromotionLabelSingleConfig) ((Map) c01gw.getValue()).get("-1");
        }
        return promotionLabelSingleConfig;
    }
}
