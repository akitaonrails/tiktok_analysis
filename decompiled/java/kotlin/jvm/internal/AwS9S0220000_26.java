package kotlin.jvm.internal;

import X.C09AY;
import X.C1753490vjP;
import X.C1753590vjZ;
import X.C1754020vkG;
import X.C1754070vkL;
import X.C1764250w0l;
import X.C1765430w2f;
import X.C786410Ut5;
import X.InterfaceC1753620vjc;
import X.InterfaceC1754200vkY;
import Y.ARunnableS126S0100000_26;
import android.os.Handler;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPBenefitContentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPBenefitInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPBenefitItem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.pendant.tab.TabIndicatorItemData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.CommonParamsContext;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitContentInfo;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitInfo;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitItem;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes27.dex */
public class AwS9S0220000_26 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;
    public boolean z3;

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS9S0220000_26 awS9S0220000_26, Object obj) {
        int iIntValue;
        PDPBenefitContentInfo pDPBenefitContentInfo;
        Integer num;
        int iIntValue2;
        PDPBenefitContentInfo pDPBenefitContentInfo2;
        Integer num2;
        C1753490vjP c1753490vjP = (C1753490vjP) awS9S0220000_26.l0;
        if (c1753490vjP.LIZLLL == null) {
            c1753490vjP.LIZLLL = new C1753590vjZ(c1753490vjP.LIZ);
        }
        final C1753490vjP c1753490vjP2 = (C1753490vjP) awS9S0220000_26.l0;
        C1753590vjZ c1753590vjZ = c1753490vjP2.LIZLLL;
        if (c1753590vjZ != null) {
            final PDPBenefitInfo pDPBenefitInfo = (PDPBenefitInfo) awS9S0220000_26.l1;
            final boolean z = awS9S0220000_26.z3;
            c1753590vjZ.LJFF = new InterfaceC1753620vjc() { // from class: X.0vjT
                @Override // X.InterfaceC1753620vjc
                public final void LIZIZ() {
                    c1753490vjP2.LJIILL.getClass();
                    c1753490vjP2.getClass();
                }

                @Override // X.InterfaceC1753620vjc
                public final void LIZ(C1753580vjY c1753580vjY) {
                    C1753560vjW c1753560vjW = c1753490vjP2.LJIILL;
                    PDPBenefitInfo pDPBenefitInfo2 = pDPBenefitInfo;
                    boolean z2 = z;
                    C1753490vjP c1753490vjP3 = c1753560vjW.LIZ;
                    c1753490vjP3.LJIIJJI = true;
                    if (pDPBenefitInfo2 != null) {
                        c1753490vjP3.LJ(EnumC1753520vjS.BUBBLE_SHOW, pDPBenefitInfo2, z2);
                    }
                    c1753490vjP2.getClass();
                }
            };
        }
        if (awS9S0220000_26.z2) {
            c1753490vjP2.LIZ(((PDPBenefitInfo) awS9S0220000_26.l1).staticItem);
        }
        C1753490vjP c1753490vjP3 = (C1753490vjP) awS9S0220000_26.l0;
        C1753590vjZ c1753590vjZ2 = c1753490vjP3.LIZLLL;
        if (c1753590vjZ2 != null) {
            PDPBenefitInfo pDPBenefitInfo2 = (PDPBenefitInfo) awS9S0220000_26.l1;
            boolean z2 = awS9S0220000_26.z2;
            c1753590vjZ2.LJIIIZ = c1753490vjP3.LJFF;
            PDPBenefitItem pDPBenefitItem = pDPBenefitInfo2.dynamicItem;
            if (pDPBenefitItem != null && (pDPBenefitContentInfo2 = pDPBenefitItem.contentInfo) != null && (num2 = pDPBenefitContentInfo2.dynamicDurationSecond) != null) {
                iIntValue2 = num2.intValue();
            } else {
                iIntValue2 = 3;
            }
            c1753590vjZ2.LJIIIIZZ = ((long) iIntValue2) * 1000;
            c1753590vjZ2.LJIIJ = new AwS142S0110000_26(z2, c1753490vjP3, 3);
            c1753590vjZ2.LJI = c1753490vjP3.LJIIIZ;
            c1753590vjZ2.LJII = c1753490vjP3.LJIIJ;
            c1753590vjZ2.LJIIJJI = pDPBenefitInfo2.dynamicItem;
            c1753590vjZ2.LJIIL = new AwS104S0210000_26(pDPBenefitInfo2, c1753490vjP3, z2, 5);
        }
        Handler handler = (Handler) ((C1753490vjP) awS9S0220000_26.l0).LJ.getValue();
        ARunnableS126S0100000_26 aRunnableS126S0100000_26 = ((C1753490vjP) awS9S0220000_26.l0).LJIILLIIL;
        PDPBenefitItem pDPBenefitItem2 = ((PDPBenefitInfo) awS9S0220000_26.l1).dynamicItem;
        if (pDPBenefitItem2 != null && (pDPBenefitContentInfo = pDPBenefitItem2.contentInfo) != null && (num = pDPBenefitContentInfo.delayShowSecond) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        C786410Ut5.LJLIIL(((long) iIntValue) * 1000, handler, aRunnableS126S0100000_26);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS9S0220000_26 awS9S0220000_26, Object obj) {
        String str;
        String str2;
        Map<String, ? extends Object> mapLIZ;
        LaneParams laneParams = (LaneParams) obj;
        CommonParamsContext commonParamsContext = (CommonParamsContext) ((C1764250w0l) awS9S0220000_26.l0).LLIZLLLIL.getValue();
        if (commonParamsContext != null && (mapLIZ = C1765430w2f.LIZ(commonParamsContext.LL)) != null) {
            laneParams.withNotCheckParams(mapLIZ);
        }
        laneParams.plusAssign("page_name", "product_detail");
        laneParams.plusAssign("module_name", "head_pic");
        if (awS9S0220000_26.z2) {
            str = "full_screen";
        } else {
            str = "half_screen";
        }
        laneParams.plusAssign("page_show_type", str);
        laneParams.plusAssign("photo_show_type", "main");
        if (awS9S0220000_26.z3) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        laneParams.plusAssign("video_is_showing", str2);
        Map<String, ? extends Object> map = ((TabIndicatorItemData) awS9S0220000_26.l1).daInfo;
        if (map != null) {
            laneParams.withNotCheckParams(map);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS9S0220000_26 awS9S0220000_26, Object obj) {
        String str;
        String str2;
        Map<String, ? extends Object> mapLIZ;
        LaneParams laneParams = (LaneParams) obj;
        CommonParamsContext commonParamsContext = (CommonParamsContext) ((C1764250w0l) awS9S0220000_26.l0).LLIZLLLIL.getValue();
        if (commonParamsContext != null && (mapLIZ = C1765430w2f.LIZ(commonParamsContext.LL)) != null) {
            laneParams.withNotCheckParams(mapLIZ);
        }
        laneParams.plusAssign("page_name", "product_detail");
        laneParams.plusAssign("module_name", "head_pic");
        if (awS9S0220000_26.z2) {
            str = "full_screen";
        } else {
            str = "half_screen";
        }
        laneParams.plusAssign("page_show_type", str);
        laneParams.plusAssign("photo_show_type", "main");
        if (awS9S0220000_26.z3) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        laneParams.plusAssign("video_is_showing", str2);
        Map<String, ? extends Object> map = ((TabIndicatorItemData) awS9S0220000_26.l1).daInfo;
        if (map != null) {
            laneParams.withNotCheckParams(map);
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(AwS9S0220000_26 awS9S0220000_26, Object obj) {
        int iIntValue;
        CartBenefitContentInfo cartBenefitContentInfo;
        Integer num;
        int iIntValue2;
        CartBenefitContentInfo cartBenefitContentInfo2;
        Integer num2;
        C1754020vkG c1754020vkG = (C1754020vkG) awS9S0220000_26.l0;
        if (c1754020vkG.LJ == null) {
            c1754020vkG.LJ = new C1754070vkL(c1754020vkG.LIZ);
        }
        final C1754020vkG c1754020vkG2 = (C1754020vkG) awS9S0220000_26.l0;
        C1754070vkL c1754070vkL = c1754020vkG2.LJ;
        if (c1754070vkL != null) {
            final CartBenefitInfo cartBenefitInfo = (CartBenefitInfo) awS9S0220000_26.l1;
            c1754070vkL.LJFF = new InterfaceC1754200vkY() { // from class: X.0vkV
                @Override // X.InterfaceC1754200vkY
                public final void LIZ(C1754060vkK c1754060vkK) {
                    c1754020vkG2.LJJII.LIZ(cartBenefitInfo);
                    InterfaceC1754210vkZ interfaceC1754210vkZ = c1754020vkG2.LJIILJJIL;
                    if (interfaceC1754210vkZ != null) {
                        interfaceC1754210vkZ.LIZ(cartBenefitInfo);
                    }
                }

                @Override // X.InterfaceC1754200vkY
                public final void onClick(View view) {
                    c1754020vkG2.LJJII.LIZIZ(cartBenefitInfo);
                    InterfaceC1754210vkZ interfaceC1754210vkZ = c1754020vkG2.LJIILJJIL;
                    if (interfaceC1754210vkZ != null) {
                        interfaceC1754210vkZ.LIZIZ(cartBenefitInfo);
                    }
                }
            };
        }
        if (awS9S0220000_26.z2) {
            c1754020vkG2.LJIIIIZZ(((CartBenefitInfo) awS9S0220000_26.l1).staticItem);
        }
        C1754020vkG c1754020vkG3 = (C1754020vkG) awS9S0220000_26.l0;
        C1754070vkL c1754070vkL2 = c1754020vkG3.LJ;
        if (c1754070vkL2 != null) {
            CartBenefitInfo cartBenefitInfo2 = (CartBenefitInfo) awS9S0220000_26.l1;
            boolean z = awS9S0220000_26.z3;
            boolean z2 = awS9S0220000_26.z2;
            c1754070vkL2.LJIIIZ = c1754020vkG3.LJI;
            CartBenefitItem cartBenefitItem = cartBenefitInfo2.dynamicItem;
            if (cartBenefitItem != null && (cartBenefitContentInfo2 = cartBenefitItem.contentInfo) != null && (num2 = cartBenefitContentInfo2.dynamicDurationSecond) != null) {
                iIntValue2 = num2.intValue();
            } else {
                iIntValue2 = 3;
            }
            c1754070vkL2.LJIIIIZZ = ((long) iIntValue2) * 1000;
            c1754070vkL2.LJIIJ = new AwS142S0110000_26(z2, c1754020vkG3, 6);
            c1754070vkL2.LJI = c1754020vkG3.LJIIJJI;
            c1754070vkL2.LJII = c1754020vkG3.LJIIL;
            c1754070vkL2.LJIIJJI = cartBenefitInfo2.dynamicItem;
            c1754070vkL2.LJIILJJIL = z;
            c1754070vkL2.LJIIL = new AwS104S0210000_26(z2, c1754020vkG3, cartBenefitInfo2, 6);
        }
        Handler handler = (Handler) ((C1754020vkG) awS9S0220000_26.l0).LJFF.getValue();
        ARunnableS126S0100000_26 aRunnableS126S0100000_26 = ((C1754020vkG) awS9S0220000_26.l0).LJJIII;
        CartBenefitItem cartBenefitItem2 = ((CartBenefitInfo) awS9S0220000_26.l1).dynamicItem;
        if (cartBenefitItem2 != null && (cartBenefitContentInfo = cartBenefitItem2.contentInfo) != null && (num = cartBenefitContentInfo.delayShowSecond) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        C786410Ut5.LJLIIL(((long) iIntValue) * 1000, handler, aRunnableS126S0100000_26);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS9S0220000_26(C1753490vjP c1753490vjP, boolean z, PDPBenefitInfo pDPBenefitInfo, boolean z2, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1753490vjP;
        this.z2 = z;
        this.l1 = pDPBenefitInfo;
        this.z3 = z2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS9S0220000_26(C1754020vkG c1754020vkG, boolean z, CartBenefitInfo cartBenefitInfo, boolean z2, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1754020vkG;
        this.z2 = z;
        this.l1 = cartBenefitInfo;
        this.z3 = z2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS9S0220000_26(C1764250w0l c1764250w0l, boolean z, boolean z2, TabIndicatorItemData tabIndicatorItemData, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1764250w0l;
        this.z2 = z;
        this.z3 = z2;
        this.l1 = tabIndicatorItemData;
    }
}
