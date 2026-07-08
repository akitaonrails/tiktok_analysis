package kotlin.jvm.internal;

import X.C09AY;
import X.C259800zU;
import android.content.Context;
import androidx.fragment.app.DialogFragment;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.commercialize.quickconversion.shopify.ShopifySkuCheckoutServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes31.dex */
public class AwS42S1400000_30 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
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

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$0(AwS42S1400000_30 awS42S1400000_30) {
        DialogFragment dialogFragment = (DialogFragment) ((C259800zU) awS42S1400000_30.l1).element;
        if (dialogFragment != null) {
            dialogFragment.dismiss();
        }
        ShopifySkuCheckoutServiceImpl shopifySkuCheckoutServiceImpl = (ShopifySkuCheckoutServiceImpl) awS42S1400000_30.l2;
        Context context = (Context) awS42S1400000_30.l3;
        Aweme aweme = (Aweme) awS42S1400000_30.l4;
        String str = awS42S1400000_30.s0;
        shopifySkuCheckoutServiceImpl.getClass();
        ShopifySkuCheckoutServiceImpl.LJI(context, aweme, str);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$1(AwS42S1400000_30 awS42S1400000_30) {
        DialogFragment dialogFragment = (DialogFragment) ((C259800zU) awS42S1400000_30.l1).element;
        if (dialogFragment != null) {
            dialogFragment.dismiss();
        }
        ShopifySkuCheckoutServiceImpl shopifySkuCheckoutServiceImpl = (ShopifySkuCheckoutServiceImpl) awS42S1400000_30.l2;
        Context context = (Context) awS42S1400000_30.l3;
        Aweme aweme = (Aweme) awS42S1400000_30.l4;
        String str = awS42S1400000_30.s0;
        shopifySkuCheckoutServiceImpl.getClass();
        ShopifySkuCheckoutServiceImpl.LJI(context, aweme, str);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS42S1400000_30(C259800zU c259800zU, C259800zU<TuxSheet> c259800zU2, ShopifySkuCheckoutServiceImpl shopifySkuCheckoutServiceImpl, Context context, Aweme aweme, String str) {
        super(0);
        this.$t = str;
        this.l1 = c259800zU;
        this.l2 = c259800zU2;
        this.l3 = shopifySkuCheckoutServiceImpl;
        this.l4 = context;
        this.s0 = aweme;
    }
}
