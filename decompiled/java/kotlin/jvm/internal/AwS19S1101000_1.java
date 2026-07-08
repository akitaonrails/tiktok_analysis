package kotlin.jvm.internal;

import X.C04AW;
import X.C09AY;
import X.C259800zU;
import X.C936903lP;
import X.C937303lT;
import X.EnumC1012103xX;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductUnavailableInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.StaticSellingPoint;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.SeaSkuSpecViewModel;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public class AwS19S1101000_1 extends C09AY implements Function1 {
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

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS19S1101000_1 r7, java.lang.Object r8) {
        /*
            r3 = r8
            com.bytedance.tux.input.TuxTextView r3 = (com.bytedance.tux.input.TuxTextView) r3
            java.lang.String r0 = r7.s0
            r3.setText(r0)
            int r0 = r7.i2
            if (r0 <= 0) goto L20
            android.content.Context r0 = r3.getContext()
            int r1 = X.C418440Gaw.LIZLLL(r0)
            r0 = 92
            int r0 = X.C0H9H.LIZIZ(r0)
            int r1 = r1 - r0
            int r0 = r1 / 2
            r3.setMaxWidth(r0)
        L20:
            r0 = 51
            r3.setTuxFont(r0)
            java.lang.Object r0 = r7.l1
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.StaticSellingPoint r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.StaticSellingPoint) r0
            com.ss.android.ugc.aweme.ecommerce.base.common.model.CommonColor r2 = r0.labelColor
            android.content.Context r1 = r3.getContext()
            r0 = 0
            boolean r0 = X.C1744700vVE.LJ(r1, r0)
            if (r0 == 0) goto L68
            if (r2 == 0) goto L6f
            java.lang.String r0 = r2.getDarkColor()
        L3c:
            if (r0 == 0) goto L6f
            int r0 = X.C0HEZ.LIZIZ(r0)
            r3.setTextColor(r0)
        L45:
            java.lang.Object r0 = r7.l1
            com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.StaticSellingPoint r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.StaticSellingPoint) r0
            com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon r0 = r0.icon
            if (r0 == 0) goto L65
            r0 = 6
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r1 = 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r0 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            r8 = 16
            X.C426750GoL.LJIIL(r3, r4, r5, r6, r7, r8)
        L65:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L68:
            if (r2 == 0) goto L6f
            java.lang.String r0 = r2.getColor()
            goto L3c
        L6f:
            r0 = 2131100622(0x7f0603ce, float:1.781363E38)
            r3.setTextColorRes(r0)
            goto L45
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS19S1101000_1.invoke$0(kotlin.jvm.internal.AwS19S1101000_1, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [T, X.03xX] */
    public static final Object invoke$1(AwS19S1101000_1 awS19S1101000_1, Object obj) {
        int i;
        String str;
        String str2;
        List<String> list = ((C936903lP) obj).LL;
        if (!list.isEmpty() && (i = awS19S1101000_1.i2) >= 0 && i < list.size()) {
            ArrayList arrayList = new ArrayList(list);
            int i2 = awS19S1101000_1.i2;
            if (Intrinsics.LJFF(ListProtector.get(arrayList, i2), awS19S1101000_1.s0)) {
                str = "";
            } else {
                str = awS19S1101000_1.s0;
            }
            ListProtector.set(arrayList, i2, str);
            SeaSkuSpecViewModel seaSkuSpecViewModel = (SeaSkuSpecViewModel) awS19S1101000_1.l1;
            Pair<Image, Integer> pairWQ2 = seaSkuSpecViewModel.wQ2(seaSkuSpecViewModel.LLILZ, arrayList, seaSkuSpecViewModel.LLILZIL);
            Image first = pairWQ2.getFirst();
            int iIntValue = pairWQ2.getSecond().intValue();
            SkuItem skuItemZQ2 = ((SeaSkuSpecViewModel) awS19S1101000_1.l1).zQ2(arrayList);
            String str3 = null;
            if (skuItemZQ2 != null) {
                str2 = skuItemZQ2.skuId;
            } else {
                str2 = null;
            }
            C259800zU c259800zU = new C259800zU();
            if (C04AW.LIZJ(((SeaSkuSpecViewModel) awS19S1101000_1.l1).LLILLJJLI, (String[]) arrayList.toArray(new String[0])) <= 0) {
                c259800zU.element = EnumC1012103xX.CUR_COMBO_STOCK_OUT;
            }
            ProductUnavailableInfo productUnavailableInfoXQ2 = ((SeaSkuSpecViewModel) awS19S1101000_1.l1).xQ2(arrayList);
            if (productUnavailableInfoXQ2 != null) {
                str3 = productUnavailableInfoXQ2.text;
            }
            ((SeaSkuSpecViewModel) awS19S1101000_1.l1).setState(new C937303lT(arrayList, str2, first, iIntValue, c259800zU, str3));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS19S1101000_1(int i, String str, SeaSkuSpecViewModel seaSkuSpecViewModel, int i2) {
        super(1);
        this.$t = i2;
        this.i2 = i;
        this.s0 = str;
        this.l1 = seaSkuSpecViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS19S1101000_1(String str, int i, StaticSellingPoint staticSellingPoint, int i2) {
        super(1);
        this.$t = i2;
        this.s0 = str;
        this.i2 = i;
        this.l1 = staticSellingPoint;
    }
}
