package kotlin.jvm.internal;

import X.C09AY;
import X.C1132700fa8;
import X.C1135810ff9;
import X.C1136970fh1;
import X.C1137000fh4;
import X.C1146350fw9;
import X.C1146360fwA;
import X.C1146430fwH;
import X.C1146530fwR;
import X.C15438062q;
import X.C1687430u0r;
import X.C16F5;
import X.C20441214yg;
import X.EnumC1136790fgj;
import X.EnumC1146490fwN;
import X.InterfaceC1137410fhj;
import X.InterfaceC1665500tRU;
import android.text.Spannable;
import android.view.View;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.center.GiftAnchorPanelGiftPageCenterViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes18.dex */
public class AwS51S0500000_17 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

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

    public static final Object invoke$0(AwS51S0500000_17 awS51S0500000_17, Object obj) {
        C16F5 c16f5;
        boolean z;
        CharSequence charSequence = (CharSequence) obj;
        if ((charSequence instanceof Spannable) && (c16f5 = (C16F5) awS51S0500000_17.l0) != null) {
            C1137000fh4 c1137000fh4 = C1137000fh4.LIZ;
            EnumC1136790fgj enumC1136790fgj = (EnumC1136790fgj) awS51S0500000_17.l1;
            List list = (List) awS51S0500000_17.l2;
            Spannable spannable = (Spannable) charSequence;
            InterfaceC1137410fhj interfaceC1137410fhj = (InterfaceC1137410fhj) awS51S0500000_17.l3;
            boolean zLJIILIIL = C1132700fa8.LJIILIIL((C1135810ff9) awS51S0500000_17.l4);
            c1137000fh4.getClass();
            C20441214yg.LJIIIZ("RightTagViewUtils", "getSponsoredAnimation");
            if (enumC1136790fgj == EnumC1136790fgj.MULTI_HOST_MEDIUM) {
                z = true;
            } else {
                z = false;
            }
            C1136970fh1.LIZJ(spannable, c16f5, interfaceC1137410fhj, list, z, zLJIILIIL).start();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS51S0500000_17 awS51S0500000_17, Object obj) {
        C1146530fwR c1146530fwR = (C1146530fwR) obj;
        GiftAnchorPanelGiftPageCenterViewModel giftAnchorPanelGiftPageCenterViewModel = (GiftAnchorPanelGiftPageCenterViewModel) awS51S0500000_17.l0;
        C1146430fwH c1146430fwH = (C1146430fwH) awS51S0500000_17.l1;
        C1146350fw9 c1146350fw9 = (C1146350fw9) awS51S0500000_17.l2;
        C1146350fw9 c1146350fw92 = (C1146350fw9) awS51S0500000_17.l3;
        C1146360fwA c1146360fwA = (C1146360fwA) awS51S0500000_17.l4;
        EnumC1146490fwN enumC1146490fwN = EnumC1146490fwN.FE_UPDATE_ITEM_EVENT;
        giftAnchorPanelGiftPageCenterViewModel.getClass();
        InterfaceC1665500tRU<C1146350fw9> interfaceC1665500tRU = c1146430fwH.LIZIZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(interfaceC1665500tRU, 10));
        for (C1146350fw9 c1146350fw93 : interfaceC1665500tRU) {
            if (c1146350fw93.LL == c1146350fw9.LL) {
                c1146350fw93 = c1146350fw92;
            }
            arrayList.add(c1146350fw93);
        }
        return C1146530fwR.LIZ(c1146530fwR, null, new C1146430fwH(c1146360fwA, C1687430u0r.LIZ(arrayList), enumC1146490fwN), false, 13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS51S0500000_17(C16F5 c16f5, C16F5 c16f52, EnumC1136790fgj enumC1136790fgj, List<View> list, InterfaceC1137410fhj interfaceC1137410fhj, C1135810ff9 c1135810ff9) {
        super(1);
        this.$t = c1135810ff9;
        this.l0 = c16f5;
        this.l1 = c16f52;
        this.l2 = enumC1136790fgj;
        this.l3 = list;
        this.l4 = interfaceC1137410fhj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS51S0500000_17(GiftAnchorPanelGiftPageCenterViewModel giftAnchorPanelGiftPageCenterViewModel, C1146430fwH c1146430fwH, C1146350fw9 c1146350fw9, C1146350fw9 c1146350fw92, C1146360fwA c1146360fwA, int i) {
        super(1);
        this.$t = i;
        this.l0 = giftAnchorPanelGiftPageCenterViewModel;
        this.l1 = c1146430fwH;
        this.l2 = c1146350fw9;
        this.l3 = c1146350fw92;
        this.l4 = c1146360fwA;
    }
}
