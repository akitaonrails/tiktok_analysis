package kotlin.jvm.internal;

import X.C037Y;
import X.C03EF;
import X.C049S;
import X.C049Y;
import X.C09AY;
import X.C0H9H;
import X.C1054004Ag;
import X.C1697810uHb;
import X.C1748720vbi;
import X.C7736030k;
import X.C786410Ut5;
import X.C7971039l;
import X.C808003Dq;
import X.InterfaceC1748810vbr;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticLinkRichText;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticsDescription;
import com.ss.android.ugc.aweme.ecommerce.us.logistic.module.USLogisticVH;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public class AwS30S2200000_1 extends C09AY implements Function0 {
    public final int $t;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;

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

    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [android.util.AttributeSet, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r12v2 */
    public static final Object invoke$0(AwS30S2200000_1 awS30S2200000_1) {
        String priceStr;
        Integer priceTextColor;
        String str;
        List<LogisticLinkRichText> list;
        int iLIZIZ;
        LogisticLinkRichText logisticLinkRichText;
        C1748720vbi.LIZLLL(((USLogisticVH) awS30S2200000_1.l2).itemView, new C049Y(), new AwS115S1100000_1((LogisticDTO) awS30S2200000_1.l3, awS30S2200000_1.s0, 47));
        FragmentManager fragmentManager = ((USLogisticVH) awS30S2200000_1.l2).LLJILJIL.getFragmentManager();
        if (fragmentManager != null) {
            USLogisticVH uSLogisticVH = (USLogisticVH) awS30S2200000_1.l2;
            LogisticDTO logisticDTO = (LogisticDTO) awS30S2200000_1.l3;
            String str2 = awS30S2200000_1.s1;
            String str3 = awS30S2200000_1.s0;
            C7971039l c7971039l = new C7971039l(uSLogisticVH.itemView.getContext());
            c7971039l.getUsOrderSubmitNextDayDeliveryTitleFromXml().setText(logisticDTO.deliveryName);
            TuxTextView usOrderSubmitNextDayDeliveryPriceFromXml = c7971039l.getUsOrderSubmitNextDayDeliveryPriceFromXml();
            Price price = logisticDTO.shippingFee;
            ?? r12 = 0;
            if (price != null) {
                priceStr = price.getPriceStr();
            } else {
                priceStr = null;
            }
            usOrderSubmitNextDayDeliveryPriceFromXml.setText(priceStr);
            Price price2 = logisticDTO.shippingFee;
            if (price2 != null) {
                priceTextColor = price2.getPriceTextColor();
            } else {
                priceTextColor = null;
            }
            usOrderSubmitNextDayDeliveryPriceFromXml.setTextColorRes(C7736030k.LIZ(priceTextColor, null));
            C03EF usOrderSubmitNextDayDeliveryTimeFromXml = c7971039l.getUsOrderSubmitNextDayDeliveryTimeFromXml();
            LogisticsDescription logisticsDescription = logisticDTO.logisticsDescription;
            if (logisticsDescription != null && (logisticLinkRichText = logisticsDescription.logisticsRichText) != null) {
                C03EF.LJJJJJ(usOrderSubmitNextDayDeliveryTimeFromXml, usOrderSubmitNextDayDeliveryTimeFromXml.getContext(), logisticLinkRichText, 7, 3, null, null, 496);
            }
            TuxTextView usOrderSubmitNextDayDeliveryExplainTitleFromXml = c7971039l.getUsOrderSubmitNextDayDeliveryExplainTitleFromXml();
            LogisticsDescription logisticsDescription2 = logisticDTO.logisticsDescription;
            if (logisticsDescription2 != null) {
                str = logisticsDescription2.descriptionTitle;
            } else {
                str = null;
            }
            usOrderSubmitNextDayDeliveryExplainTitleFromXml.setText(str);
            LinearLayout usOrderSubmitNextDayDeliveryExplainBodyFromXml = c7971039l.getUsOrderSubmitNextDayDeliveryExplainBodyFromXml();
            if (usOrderSubmitNextDayDeliveryExplainBodyFromXml != null && usOrderSubmitNextDayDeliveryExplainBodyFromXml.getChildCount() > 0) {
                C786410Ut5.LJJJJJL(usOrderSubmitNextDayDeliveryExplainBodyFromXml);
            }
            LogisticsDescription logisticsDescription3 = logisticDTO.logisticsDescription;
            int i = 0;
            if (logisticsDescription3 != null && (list = logisticsDescription3.descriptions) != null) {
                int i2 = 0;
                for (LogisticLinkRichText logisticLinkRichText2 : list) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        LogisticLinkRichText logisticLinkRichText3 = logisticLinkRichText2;
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                        if (i2 == 0) {
                            iLIZIZ = C0H9H.LIZIZ(i);
                        } else {
                            iLIZIZ = C0H9H.LIZIZ(16);
                        }
                        layoutParams.topMargin = iLIZIZ;
                        LinearLayout usOrderSubmitNextDayDeliveryExplainBodyFromXml2 = c7971039l.getUsOrderSubmitNextDayDeliveryExplainBodyFromXml();
                        C03EF c03ef = new C03EF(c7971039l.getContext(), r12, 6);
                        c03ef.setTuxFont(51);
                        c03ef.setTextColorRes(R.attr.a1h);
                        C03EF.LJJJJJ(c03ef, c03ef.getContext(), logisticLinkRichText3, 1, 1, null, null, 496);
                        usOrderSubmitNextDayDeliveryExplainBodyFromXml2.addView(c03ef, layoutParams);
                        i2 = i3;
                        i = 0;
                        r12 = 0;
                    } else {
                        C1697810uHb.LJIJI();
                        throw r12;
                    }
                }
            }
            C786410Ut5.LJLLLLLL(8, c7971039l.getUsCommerceNextDayDeliveryFooterSeparatorFromXml());
            C786410Ut5.LLLLZLL(c7971039l.getUsCommerceNextDayDeliveryFooterFromXml(), 8);
            C808003Dq.LJFF(C808003Dq.LIZLLL(c7971039l, str2, false, new C037Y(uSLogisticVH, logisticDTO, str3), 28), fragmentManager, null, new AwS118S1200000_1(uSLogisticVH, logisticDTO, str3, 8), 4);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS30S2200000_1 awS30S2200000_1) {
        InterfaceC1748810vbr interfaceC1748810vbrLJJIJLIJ = ((C1054004Ag) awS30S2200000_1.l2).LJJIJLIJ();
        if (interfaceC1748810vbrLJJIJLIJ != null) {
            C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIJLIJ, new C049S(), new AwS17S2200000_1((C1054004Ag) awS30S2200000_1.l2, (C1054004Ag) awS30S2200000_1.s0, awS30S2200000_1.s1, (String) awS30S2200000_1.l3, (Map<String, ? extends Object>) 11));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS30S2200000_1(C1054004Ag c1054004Ag, C1054004Ag c1054004Ag2, String str, String str2, Map<String, ? extends Object> map) {
        super(0);
        this.$t = map;
        this.l2 = c1054004Ag;
        this.s0 = c1054004Ag2;
        this.s1 = str;
        this.l3 = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS30S2200000_1(USLogisticVH uSLogisticVH, LogisticDTO logisticDTO, String str, String str2, int i) {
        super(0);
        this.$t = i;
        this.l2 = uSLogisticVH;
        this.l3 = logisticDTO;
        this.s0 = str;
        this.s1 = str2;
    }
}
