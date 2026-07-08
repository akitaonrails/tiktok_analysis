package kotlin.jvm.internal;

import X.C013C;
import X.C03JV;
import X.C03K4;
import X.C03ME;
import X.C03MJ;
import X.C03XN;
import X.C09AY;
import X.C118300cf;
import X.C2262851Dhb;
import X.C2262991Dhp;
import X.C259800zU;
import X.C722302rt;
import X.C833003Ng;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoSetting;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ButtonAreaSetting;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PriceSubText;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes2.dex */
public class AwS2S0800000_1 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public Object l6;
    public Object l7;

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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, X.02rt] */
    /* JADX WARN: Type inference failed for: r0v43, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r1v11, types: [T, X.1Dhp] */
    public static final Object invoke$0(AwS2S0800000_1 awS2S0800000_1, Object obj) {
        T t;
        CharSequence charSequence;
        BillInfoSetting billInfoSetting;
        ButtonAreaSetting buttonAreaSetting;
        String priceStr;
        Summary summary;
        Price price;
        String priceStr2;
        Summary summary2;
        Price price2;
        Price price3;
        C722302rt c722302rt;
        PriceSubText priceSubText;
        C03JV c03jv = (C03JV) obj;
        ((C259800zU) awS2S0800000_1.l0).element = c03jv.LLILLL;
        C259800zU c259800zU = (C259800zU) awS2S0800000_1.l1;
        String str = null;
        str = null;
        if (!((C03ME) awS2S0800000_1.l2).LIZ().LLILZIL && (c722302rt = (C722302rt) ((C259800zU) awS2S0800000_1.l0).element) != null && (priceSubText = c722302rt.LLJJIII) != null) {
            t = priceSubText.richText;
        } else {
            t = 0;
        }
        c259800zU.element = t;
        C722302rt c722302rt2 = (C722302rt) ((C259800zU) awS2S0800000_1.l0).element;
        if (c722302rt2 != null && (price3 = c722302rt2.LLIZ) != null) {
            String priceStr3 = price3.getPriceStr();
            str = priceStr3;
            if (priceStr3 != null) {
                ((ArrayList) ((C03ME) awS2S0800000_1.l2).LIZ().LLJI).add(priceStr3);
                str = priceStr3;
            }
        }
        Boolean bool = ((OrderSubmitAssemViewModel) awS2S0800000_1.l3).LLLLZLLIL;
        Boolean bool2 = Boolean.TRUE;
        String str2 = "";
        if (Intrinsics.LJFF(bool, bool2)) {
            BillInfoData billInfoData = ((OrderSubmitAssemViewModel) awS2S0800000_1.l3).LLJJI;
            if (billInfoData == null || (summary2 = billInfoData.summary) == null || (price2 = summary2.total) == null || (priceStr = price2.getPriceStr()) == null) {
                priceStr = "";
            }
            BillInfoData billInfoData2 = ((OrderSubmitAssemViewModel) awS2S0800000_1.l3).LLJJI;
            if (billInfoData2 != null && (summary = billInfoData2.summary) != null && (price = summary.origin) != null && (priceStr2 = price.getPriceStr()) != null) {
                str2 = priceStr2;
            }
            ((C259800zU) awS2S0800000_1.l4).element = new C2262991Dhp(priceStr, str2, 4);
        } else {
            C259800zU c259800zU2 = (C259800zU) awS2S0800000_1.l5;
            T t2 = str;
            if (str == null) {
                t2 = "";
            }
            c259800zU2.element = t2;
        }
        BillInfoData billInfoData3 = ((OrderSubmitAssemViewModel) awS2S0800000_1.l3).LLJJI;
        boolean z = false;
        if (billInfoData3 != null && (billInfoSetting = billInfoData3.settings) != null && (buttonAreaSetting = billInfoSetting.buttonAreaSetting) != null && Intrinsics.LJFF(buttonAreaSetting.highlightTotalPrice, bool2)) {
            ((C259800zU) awS2S0800000_1.l6).element = Integer.valueOf(R.attr.a1q);
        }
        C013C c013c = (C013C) awS2S0800000_1.l7;
        if (Intrinsics.LJFF(c03jv.LLIZLLLIL, bool2) && !((C03ME) awS2S0800000_1.l2).LIZ().LLILZIL && (charSequence = (CharSequence) ((C259800zU) awS2S0800000_1.l5).element) != null && !a0.LJJJIL(charSequence)) {
            z = true;
        }
        c013c.element = z;
        ((C03ME) awS2S0800000_1.l2).LIZ().setState(new AwS26S0600000_1((C013C) awS2S0800000_1.l7, (C259800zU) awS2S0800000_1.l5, (C259800zU) awS2S0800000_1.l6, (C259800zU) awS2S0800000_1.l1, (C259800zU) awS2S0800000_1.l4, (C259800zU) awS2S0800000_1.l0, 4));
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$1(AwS2S0800000_1 awS2S0800000_1, Object obj) {
        return C2262851Dhb.LIZ((C2262851Dhb) obj, null, null, null, null, null, null, new C03XN(new C833003Ng(((C013C) awS2S0800000_1.l0).element, 2), (String) ((C259800zU) awS2S0800000_1.l1).element, Integer.valueOf(((C118300cf) awS2S0800000_1.l2).element), Integer.valueOf(((C118300cf) awS2S0800000_1.l3).element), Integer.valueOf(((C118300cf) awS2S0800000_1.l4).element), Integer.valueOf(((C118300cf) awS2S0800000_1.l5).element), (C03K4) ((C259800zU) awS2S0800000_1.l6).element, (C03MJ) ((C259800zU) awS2S0800000_1.l7).element), null, null, null, null, 1983);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS2S0800000_1(C259800zU c259800zU, C259800zU c259800zU2, C03ME c03me, OrderSubmitAssemViewModel orderSubmitAssemViewModel, C259800zU c259800zU3, C259800zU c259800zU4, C259800zU c259800zU5, C013C c013c, int i) {
        super(1);
        this.$t = i;
        this.l0 = c259800zU;
        this.l1 = c259800zU2;
        this.l2 = c03me;
        this.l3 = orderSubmitAssemViewModel;
        this.l4 = c259800zU3;
        this.l5 = c259800zU4;
        this.l6 = c259800zU5;
        this.l7 = c013c;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS2S0800000_1(C013C c013c, C013C c013c2, C259800zU<String> c259800zU, C118300cf c118300cf, C118300cf c118300cf2, C118300cf c118300cf3, C118300cf c118300cf4, C259800zU<C03K4> c259800zU2, C259800zU<C03MJ> c259800zU3) {
        super(1);
        this.$t = c259800zU3;
        this.l0 = c013c;
        this.l1 = c013c2;
        this.l2 = c259800zU;
        this.l3 = c118300cf;
        this.l4 = c118300cf2;
        this.l5 = c118300cf3;
        this.l6 = c118300cf4;
        this.l7 = c259800zU2;
    }
}
