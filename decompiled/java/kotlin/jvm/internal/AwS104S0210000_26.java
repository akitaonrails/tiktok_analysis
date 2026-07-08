package kotlin.jvm.internal;

import X.AbstractC1760060vu0;
import X.C03DZ;
import X.C09AY;
import X.C1741570vQB;
import X.C1745480vWU;
import X.C1746460vY4;
import X.C1753490vjP;
import X.C1754020vkG;
import X.C1760040vty;
import X.C1762410vxn;
import X.C1762420vxo;
import X.C1763410vzP;
import X.C1763440vzS;
import X.C1763460vzU;
import X.C1764050w0R;
import X.C1765290w2R;
import X.C1765300w2S;
import X.C2097908Jt;
import X.C259800zU;
import X.C7726030a;
import X.InterfaceC1760220vuG;
import X.InterfaceC1762910vyb;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputData;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.LocationUseBarV2ViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.LocationUseBarV3ViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PDPBenefitInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.image.ISeaHeadImageHelper;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.carousel.assem.carouselpowercells.PdpCarouselImageReusedAssem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.cartbenefit.model.CartBenefitInfo;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes27.dex */
public class AwS104S0210000_26 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$0(AwS104S0210000_26 awS104S0210000_26) {
        ISeaHeadImageHelper iSeaHeadImageHelperA6;
        ISeaHeadImageHelper iSeaHeadImageHelperA62 = ((C1764050w0R) awS104S0210000_26.l0).a6();
        if (iSeaHeadImageHelperA62 != null) {
            iSeaHeadImageHelperA62.et(((Image) ((C259800zU) awS104S0210000_26.l1).element).getUri());
        }
        if (awS104S0210000_26.z2 && (iSeaHeadImageHelperA6 = ((C1764050w0R) awS104S0210000_26.l0).a6()) != null) {
            iSeaHeadImageHelperA6.mY0((Image) ((C259800zU) awS104S0210000_26.l1).element, true, true);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS104S0210000_26 awS104S0210000_26) {
        LocationUseBarV2ViewHolder locationUseBarV2ViewHolder = (LocationUseBarV2ViewHolder) awS104S0210000_26.l0;
        locationUseBarV2ViewHolder.LLJJJJ = true;
        locationUseBarV2ViewHolder.a6().eS2(0, ((LocationUseBarV2ViewHolder) awS104S0210000_26.l0).itemView.getContext(), "location_authorization", "location_sug", true, false);
        LocationUseBarV2ViewHolder locationUseBarV2ViewHolder2 = (LocationUseBarV2ViewHolder) awS104S0210000_26.l0;
        CandInputData candInputData = (CandInputData) awS104S0210000_26.l1;
        boolean z = awS104S0210000_26.z2;
        C1745480vWU c1745480vWU = locationUseBarV2ViewHolder2.a6().LLJJIJIL;
        HashMap<String, Object> map = locationUseBarV2ViewHolder2.a6().LLJJIJIIJIL;
        C1746460vY4.LIZ.getClass();
        c1745480vWU.LJII("location_sug", "grant", map, C1746460vY4.LJ(candInputData, z));
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS104S0210000_26 awS104S0210000_26) {
        final AbstractC1760060vu0 abstractC1760060vu0 = (AbstractC1760060vu0) awS104S0210000_26.l0;
        final boolean z = awS104S0210000_26.z2;
        C1741570vQB c1741570vQB = abstractC1760060vu0.LJ.LJI;
        if (c1741570vQB != null) {
            C1741570vQB.LIZIZ(c1741570vQB, "load_start", null, C2097908Jt.LIZJ(new Pair("is_pending", Boolean.valueOf(z))), 2);
        }
        if (!abstractC1760060vu0.LJI && !abstractC1760060vu0.LJII && !abstractC1760060vu0.LJIIIIZZ) {
            abstractC1760060vu0.LJI = true;
            C03DZ.LIZ(abstractC1760060vu0.LIZLLL);
            View viewLJFF = abstractC1760060vu0.LJFF(abstractC1760060vu0.LIZLLL.getContext(), new InterfaceC1760220vuG() { // from class: X.0vtx
                @Override // X.InterfaceC1760220vuG
                public final void LIZ() {
                    C1741570vQB c1741570vQB2 = abstractC1760060vu0.LJ.LJI;
                    if (c1741570vQB2 != null) {
                        C1741570vQB.LIZIZ(c1741570vQB2, "load_success", null, C2097908Jt.LIZJ(new Pair("is_pending", Boolean.valueOf(z))), 2);
                    }
                }

                @Override // X.InterfaceC1760220vuG
                public final void LIZIZ() {
                    C313201Ji.LIZ(new C1757930vqZ(abstractC1760060vu0, null));
                    AbstractC1760060vu0.LJI(abstractC1760060vu0, "show_success", true, null, C2097608Jq.LJIIJ(new Pair("is_pending", Boolean.valueOf(z))), 4);
                }

                @Override // X.InterfaceC1760220vuG
                public final void LIZJ(String str, String str2, Map<String, Object> map) {
                    AbstractC1760060vu0 abstractC1760060vu02 = abstractC1760060vu0;
                    abstractC1760060vu02.LJIIIZ = true;
                    C1741570vQB c1741570vQB2 = abstractC1760060vu02.LJ.LJI;
                    if (c1741570vQB2 != null) {
                        c1741570vQB2.LIZ("load_fail", str2, map, false);
                    }
                    abstractC1760060vu02.LJ.LJI = null;
                    C313201Ji.LIZ(new C1757940vqa(abstractC1760060vu0, str, str2, null));
                }
            });
            if (viewLJFF == null) {
                return null;
            }
            ((C1760040vty) awS104S0210000_26.l1).LIZJ.addView(viewLJFF, new ViewGroup.LayoutParams(-1, -1));
            return Unit.LIZ;
        }
        AbstractC1760060vu0.LJI(abstractC1760060vu0, "load_fail", false, "repeat invoke", null, 8);
        return null;
    }

    public static final Object invoke$2(AwS104S0210000_26 awS104S0210000_26) {
        String str;
        LocationUseBarV2ViewHolder locationUseBarV2ViewHolder = (LocationUseBarV2ViewHolder) awS104S0210000_26.l0;
        locationUseBarV2ViewHolder.a6().LLLL = true;
        C1745480vWU.LIZIZ = "default_rec";
        locationUseBarV2ViewHolder.withState(locationUseBarV2ViewHolder.a6(), new AwS605S0100000_26(locationUseBarV2ViewHolder, 549));
        CandInputData candInputData = (CandInputData) awS104S0210000_26.l1;
        if (candInputData != null) {
            str = candInputData.LIZ;
        } else {
            str = null;
        }
        C1745480vWU.LJ = str;
        LocationUseBarV2ViewHolder locationUseBarV2ViewHolder2 = (LocationUseBarV2ViewHolder) awS104S0210000_26.l0;
        boolean z = awS104S0210000_26.z2;
        C1745480vWU c1745480vWU = locationUseBarV2ViewHolder2.a6().LLJJIJIL;
        HashMap<String, Object> map = locationUseBarV2ViewHolder2.a6().LLJJIJIIJIL;
        C1746460vY4.LIZ.getClass();
        c1745480vWU.LJII("location_sug", "use", map, C1746460vY4.LJ(candInputData, z));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS104S0210000_26 awS104S0210000_26) {
        LocationUseBarV3ViewHolder locationUseBarV3ViewHolder = (LocationUseBarV3ViewHolder) awS104S0210000_26.l0;
        if (!((Boolean) locationUseBarV3ViewHolder.withState(locationUseBarV3ViewHolder.a6(), AFwS268S0000000_26.get$arr$(563))).booleanValue()) {
            LocationUseBarV3ViewHolder locationUseBarV3ViewHolder2 = (LocationUseBarV3ViewHolder) awS104S0210000_26.l0;
            locationUseBarV3ViewHolder2.withState(locationUseBarV3ViewHolder2.a6(), new AwS77S0210000_26((LocationUseBarV3ViewHolder) awS104S0210000_26.l0, (CandInputData) awS104S0210000_26.l1, awS104S0210000_26.z2, 2));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS104S0210000_26 awS104S0210000_26) {
        LocationUseBarV3ViewHolder locationUseBarV3ViewHolder = (LocationUseBarV3ViewHolder) awS104S0210000_26.l0;
        if (!((Boolean) locationUseBarV3ViewHolder.withState(locationUseBarV3ViewHolder.a6(), AFwS268S0000000_26.get$arr$(564))).booleanValue()) {
            LocationUseBarV3ViewHolder locationUseBarV3ViewHolder2 = (LocationUseBarV3ViewHolder) awS104S0210000_26.l0;
            locationUseBarV3ViewHolder2.withState(locationUseBarV3ViewHolder2.a6(), new AwS112S0110000_26(locationUseBarV3ViewHolder2, true, 11));
            LocationUseBarV3ViewHolder locationUseBarV3ViewHolder3 = (LocationUseBarV3ViewHolder) awS104S0210000_26.l0;
            CandInputData candInputData = (CandInputData) awS104S0210000_26.l1;
            boolean z = awS104S0210000_26.z2;
            C1745480vWU c1745480vWU = locationUseBarV3ViewHolder3.a6().LLJJIJIL;
            HashMap<String, Object> map = locationUseBarV3ViewHolder3.a6().LLJJIJIIJIL;
            C1746460vY4.LIZ.getClass();
            c1745480vWU.LJII("location_sug", "use", map, C1746460vY4.LJFF(candInputData, z));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS104S0210000_26 awS104S0210000_26) {
        if (awS104S0210000_26.z2) {
            ((C1753490vjP) awS104S0210000_26.l0).LJI((PDPBenefitInfo) awS104S0210000_26.l1, false);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS104S0210000_26 awS104S0210000_26) {
        if (awS104S0210000_26.z2) {
            ((C1754020vkG) awS104S0210000_26.l0).LJIILIIL((CartBenefitInfo) awS104S0210000_26.l1);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$7(AwS104S0210000_26 awS104S0210000_26) {
        C1765300w2S c1765300w2SLJJIZ;
        C1763440vzS c1763440vzSMR2;
        String uri;
        C1763410vzP c1763410vzP;
        SeaPdpViewModel seaPdpViewModel = ((C1762420vxo) awS104S0210000_26.l0).LLILZLL;
        if (seaPdpViewModel != null && (c1763440vzSMR2 = seaPdpViewModel.MR2()) != null && (uri = ((Image) ((C259800zU) awS104S0210000_26.l1).element).getUri()) != null && (c1763410vzP = (C1763410vzP) C7726030a.LIZ(uri, c1763440vzSMR2.LIZJ)) != null) {
            c1763410vzP.LIZ = true;
        }
        if (awS104S0210000_26.z2 && (c1765300w2SLJJIZ = ((C1762420vxo) awS104S0210000_26.l0).LJJIZ()) != null) {
            c1765300w2SLJJIZ.LIZ((Image) ((C259800zU) awS104S0210000_26.l1).element, true, true);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$8(AwS104S0210000_26 awS104S0210000_26) {
        C1765290w2R c1765290w2RLJJJ;
        C1763460vzU c1763460vzU;
        PdpViewModel pdpViewModel = ((C1762410vxn) awS104S0210000_26.l0).LLILZLL;
        if (pdpViewModel != null && (c1763460vzU = (C1763460vzU) pdpViewModel.LLLLILI.getValue()) != null) {
            c1763460vzU.et(((Image) ((C259800zU) awS104S0210000_26.l1).element).getUri());
        }
        if (awS104S0210000_26.z2 && (c1765290w2RLJJJ = ((C1762410vxn) awS104S0210000_26.l0).LJJJ()) != null) {
            c1765290w2RLJJJ.LIZ((Image) ((C259800zU) awS104S0210000_26.l1).element, true, true);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$9(AwS104S0210000_26 awS104S0210000_26) {
        C1765290w2R c1765290w2RTp;
        InterfaceC1762910vyb interfaceC1762910vybSp = ((PdpCarouselImageReusedAssem) awS104S0210000_26.l0).sp();
        if (interfaceC1762910vybSp != null) {
            interfaceC1762910vybSp.et(((Image) ((C259800zU) awS104S0210000_26.l1).element).getUri());
        }
        if (awS104S0210000_26.z2 && (c1765290w2RTp = ((PdpCarouselImageReusedAssem) awS104S0210000_26.l0).tp()) != null) {
            c1765290w2RTp.LIZ((Image) ((C259800zU) awS104S0210000_26.l1).element, true, true);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS104S0210000_26(AbstractC1760060vu0 abstractC1760060vu0, boolean z, C1760040vty c1760040vty, int i) {
        super(0);
        this.$t = i;
        this.l0 = abstractC1760060vu0;
        this.z2 = z;
        this.l1 = c1760040vty;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS104S0210000_26(C1762410vxn c1762410vxn, C1762410vxn c1762410vxn2, C259800zU<Image> c259800zU, boolean z) {
        super(0);
        this.$t = z ? 1 : 0;
        this.l0 = c1762410vxn;
        this.l1 = c1762410vxn2;
        this.z2 = c259800zU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS104S0210000_26(C1762420vxo c1762420vxo, C1762420vxo c1762420vxo2, C259800zU<Image> c259800zU, boolean z) {
        super(0);
        this.$t = z ? 1 : 0;
        this.l0 = c1762420vxo;
        this.l1 = c1762420vxo2;
        this.z2 = c259800zU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS104S0210000_26(C1764050w0R c1764050w0R, C1764050w0R c1764050w0R2, C259800zU<Image> c259800zU, boolean z) {
        super(0);
        this.$t = z ? 1 : 0;
        this.l0 = c1764050w0R;
        this.l1 = c1764050w0R2;
        this.z2 = c259800zU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS104S0210000_26(LocationUseBarV2ViewHolder locationUseBarV2ViewHolder, CandInputData candInputData, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = locationUseBarV2ViewHolder;
        this.l1 = candInputData;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS104S0210000_26(LocationUseBarV3ViewHolder locationUseBarV3ViewHolder, CandInputData candInputData, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = locationUseBarV3ViewHolder;
        this.l1 = candInputData;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS104S0210000_26(PDPBenefitInfo pDPBenefitInfo, C1753490vjP c1753490vjP, boolean z, int i) {
        super(0);
        this.$t = i;
        this.z2 = z;
        this.l0 = c1753490vjP;
        this.l1 = pDPBenefitInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS104S0210000_26(PdpCarouselImageReusedAssem pdpCarouselImageReusedAssem, PdpCarouselImageReusedAssem pdpCarouselImageReusedAssem2, C259800zU<Image> c259800zU, boolean z) {
        super(0);
        this.$t = z ? 1 : 0;
        this.l0 = pdpCarouselImageReusedAssem;
        this.l1 = pdpCarouselImageReusedAssem2;
        this.z2 = c259800zU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS104S0210000_26(boolean z, C1754020vkG c1754020vkG, CartBenefitInfo cartBenefitInfo, int i) {
        super(0);
        this.$t = i;
        this.z2 = z;
        this.l0 = c1754020vkG;
        this.l1 = cartBenefitInfo;
    }
}
