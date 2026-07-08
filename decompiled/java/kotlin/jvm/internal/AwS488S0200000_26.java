package kotlin.jvm.internal;

import X.AbstractC1764180w0e;
import X.AbstractC1764240w0k;
import X.C04BO;
import X.C04H5;
import X.C09AY;
import X.C0DD3;
import X.C1068804Fy;
import X.C1177960gl8;
import X.C1233040iBy;
import X.C1338430kvx;
import X.C140W;
import X.C1697810uHb;
import X.C1708640uZ4;
import X.C1712870uft;
import X.C1716570ulr;
import X.C1717190umr;
import X.C1737720vJy;
import X.C1737900vKG;
import X.C1742730vS3;
import X.C1748720vbi;
import X.C1759650vtL;
import X.C1764200w0g;
import X.C1764300w0q;
import X.C1764360w0w;
import X.C1954807lC;
import X.C19EG;
import X.C201963140r;
import X.C201964140s;
import X.C420310Gdx;
import X.C724240Sb0;
import X.C786410Ut5;
import X.EnumC1737230vJB;
import X.EnumC1737480vJa;
import X.EnumC336190DFx;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1716260ulM;
import X.InterfaceC1737050vIt;
import X.InterfaceC1737080vIw;
import X.InterfaceC1764710w1V;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.EffectImgCreator$Input;
import com.ss.android.ugc.aweme.EffectImgCreator$Output;
import com.ss.android.ugc.aweme.data.EffectImgPageConfig;
import com.ss.android.ugc.aweme.data.IconSelectData;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.container.ISeaHeadContainerHelper;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.list.ISeaListHelper;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.pendant.ISeaPendantHelper;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.di.track.ISeaTrackHelper;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.card.head.dto.SeaPdpHeadFeatures;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.PageStateContext;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.widget.SeaPdpBodyWidget;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.productrecommend.ProductRecommendFeedCell;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.dto.PdpComponent;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.business.promotion.pcc.dto.PdpComponentAction;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POPayElement;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption;
import com.ss.android.ugc.aweme.prop.mobileefffect.EditImageEffectImgCreatorData;
import com.ss.android.ugc.aweme.prop.mobileefffect.EffectEditIconAssem;
import com.ss.android.ugc.aweme.prop.mobileefffect.EffectEditVM;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes27.dex */
public class AwS488S0200000_26 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            case 3:
                return invoke$3(this, obj, obj2, obj3);
            case 4:
                return invoke$4(this, obj, obj2, obj3);
            case 5:
                return invoke$5(this, obj, obj2, obj3);
            case 6:
                return invoke$6(this, obj, obj2, obj3);
            case 7:
                return invoke$7(this, obj, obj2, obj3);
            case 8:
                return invoke$8(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS488S0200000_26(InterfaceC1631630sYr interfaceC1631630sYr, InterfaceC1631630sYr<? super EnumC336190DFx, ? super List<POPayElement>, ? super String, ? super String, Unit> interfaceC1631630sYr2, PaymentOption paymentOption) {
        super(3);
        this.$t = paymentOption;
        this.l0 = interfaceC1631630sYr;
        this.l1 = interfaceC1631630sYr2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS488S0200000_26(C1712870uft c1712870uft, C1712870uft c1712870uft2, InterfaceC1631620sYq<? super EnumC336190DFx, ? super C0DD3, ? super String, Unit> interfaceC1631620sYq) {
        super(3);
        this.$t = interfaceC1631620sYq;
        this.l0 = c1712870uft;
        this.l1 = c1712870uft2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS488S0200000_26(C1716570ulr c1716570ulr, C1717190umr c1717190umr, int i) {
        super(3);
        this.$t = i;
        this.l0 = c1716570ulr;
        this.l1 = c1717190umr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS488S0200000_26(C1764200w0g c1764200w0g, C1764360w0w c1764360w0w, int i) {
        super(3);
        this.$t = i;
        this.l0 = c1764200w0g;
        this.l1 = c1764360w0w;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS488S0200000_26(AddressEditViewModel addressEditViewModel, AddressEditViewModel addressEditViewModel2, Function1<? super Boolean, Unit> function1) {
        super(3);
        this.$t = function1;
        this.l0 = addressEditViewModel;
        this.l1 = addressEditViewModel2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS488S0200000_26(SeaPdpBodyWidget seaPdpBodyWidget, C1338430kvx c1338430kvx, int i) {
        super(3);
        this.$t = i;
        this.l0 = seaPdpBodyWidget;
        this.l1 = c1338430kvx;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS488S0200000_26(PdpComponent pdpComponent, PdpViewModel pdpViewModel, int i) {
        super(3);
        this.$t = i;
        this.l0 = pdpComponent;
        this.l1 = pdpViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS488S0200000_26(EffectEditIconAssem effectEditIconAssem, C19EG c19eg, int i) {
        super(3);
        this.$t = i;
        this.l0 = effectEditIconAssem;
        this.l1 = c19eg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS488S0200000_26(ProductRecommendFeedCell productRecommendFeedCell, PromotionLabel promotionLabel, Integer num, int i) {
        super(3);
        this.$t = i;
        this.l0 = productRecommendFeedCell;
        this.l1 = num;
    }

    public static final Object invoke$0(AwS488S0200000_26 awS488S0200000_26, Object obj, Object obj2, Object obj3) {
        ((C1712870uft) awS488S0200000_26.l0).LJIIZILJ((EnumC336190DFx) obj, (String) obj2, (String) obj3, false, (InterfaceC1631620sYq) awS488S0200000_26.l1);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [X.0vIp] */
    public static final Object invoke$1(AwS488S0200000_26 awS488S0200000_26, Object obj, Object obj2, Object obj3) {
        if (((Boolean) obj).booleanValue()) {
            int i = C420310Gdx.LIZ[((EffectEditIconAssem) awS488S0200000_26.l0).hp().iconViewType.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    EffectEditIconAssem effectEditIconAssem = (EffectEditIconAssem) awS488S0200000_26.l0;
                    effectEditIconAssem.getClass();
                    C201964140s c201964140s = new C201964140s(new C1737720vJy(C724240Sb0.LIZ(effectEditIconAssem)), C140W.ofImage());
                    C201963140r c201963140r = c201964140s.LIZIZ;
                    c201963140r.LIZJ = true;
                    c201963140r.LJFF = false;
                    c201963140r.LJ = -1;
                    c201963140r.LIZLLL = R.style.k2;
                    c201963140r.LJIIIZ = 0.85f;
                    c201964140s.LIZIZ(10000);
                } else {
                    throw new C1954807lC();
                }
            } else {
                final EffectEditIconAssem effectEditIconAssem2 = (EffectEditIconAssem) awS488S0200000_26.l0;
                effectEditIconAssem2.getClass();
                C19EG c19egLIZ = C724240Sb0.LIZ(effectEditIconAssem2);
                if (c19egLIZ != null) {
                    EffectImgCreator$Input effectImgCreator$Input = new EffectImgCreator$Input(C1737900vKG.LJI(effectEditIconAssem2.hp(), null, EnumC1737480vJa.PUBLISH.getTag()).LIZ, new EffectImgPageConfig(EnumC1737230vJB.ICON_EDIT, false, 0, false, null, 126));
                    ?? r1 = new InterfaceC1737050vIt() { // from class: X.0vIp
                        @Override // X.InterfaceC1737050vIt
                        public final void LIZ(EffectImgCreator$Output effectImgCreator$Output) {
                            EnumC1737340vJM enumC1737340vJM;
                            EffectEditIconAssem effectEditIconAssem3 = effectEditIconAssem2;
                            effectEditIconAssem3.getClass();
                            if (effectImgCreator$Output.resultCode == -1) {
                                String str = effectImgCreator$Output.effectIconId;
                                boolean z = effectImgCreator$Output.applyEffectChecked;
                                IconSelectData iconSelectData = effectImgCreator$Output.originIconData;
                                if (iconSelectData != null) {
                                    enumC1737340vJM = iconSelectData.selectType;
                                } else {
                                    enumC1737340vJM = null;
                                }
                                EditImageEffectImgCreatorData editImageEffectImgCreatorData = new EditImageEffectImgCreatorData(str, z, enumC1737340vJM, (EnumC1736950vIj) null, 0, 56);
                                AssemVMLazy assemVMLazy = effectEditIconAssem3.LLJJI;
                                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = EffectEditIconAssem.LLJJJIL;
                                ((EffectEditVM) assemVMLazy.getValue()).IQ2(effectImgCreator$Output.effectIconUri, editImageEffectImgCreatorData);
                            }
                        }
                    };
                    InterfaceC1737080vIw interfaceC1737080vIw = (InterfaceC1737080vIw) effectEditIconAssem2.LLJJJ.getValue();
                    if (interfaceC1737080vIw != 0) {
                        interfaceC1737080vIw.LJI(c19egLIZ, effectImgCreator$Input, r1);
                    }
                }
            }
        } else {
            C1233040iBy c1233040iBy = new C1233040iBy((C19EG) awS488S0200000_26.l1);
            c1233040iBy.LIZJ(((C19EG) awS488S0200000_26.l1).getString(2131839204));
            c1233040iBy.LIZLLL();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS488S0200000_26 awS488S0200000_26, Object obj, Object obj2, Object obj3) {
        ((Number) obj2).floatValue();
        ((Number) obj3).intValue();
        ((SeaPdpBodyWidget) awS488S0200000_26.l0).LJIILL((C1338430kvx) awS488S0200000_26.l1);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS488S0200000_26 awS488S0200000_26, Object obj, Object obj2, Object obj3) {
        C04H5 c04h5;
        View view = (View) obj;
        PdpComponentAction pdpComponentAction = (PdpComponentAction) obj2;
        String str = (String) obj3;
        PdpComponent pdpComponent = (PdpComponent) awS488S0200000_26.l0;
        if (pdpComponent != null && (pdpComponentAction != null || (pdpComponentAction = pdpComponent.action) != null)) {
            C1759650vtL c1759650vtL = C1759650vtL.LIZ;
            PdpViewModel pdpViewModel = (PdpViewModel) awS488S0200000_26.l1;
            c1759650vtL.getClass();
            C1759650vtL.LIZIZ(pdpComponent, pdpViewModel, view, str);
            PdpViewModel pdpViewModel2 = (PdpViewModel) awS488S0200000_26.l1;
            if (pdpViewModel2 != null && (c04h5 = pdpViewModel2.LLLLL) != null) {
                c04h5.LIZ(pdpComponentAction, view, true);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$4(AwS488S0200000_26 awS488S0200000_26, Object obj, Object obj2, Object obj3) {
        C1764360w0w c1764360w0w;
        SeaPdpHeadFeatures seaPdpHeadFeatures;
        List<String> list;
        String str = (String) obj;
        Object objLIZ = null;
        switch (str.hashCode()) {
            case -1433717972:
                if (str.equals("onCompleted")) {
                    ((C1764200w0g) awS488S0200000_26.l0).c6(true);
                }
                break;
            case -1340212393:
                if (str.equals("onPause")) {
                    ISeaHeadContainerHelper iSeaHeadContainerHelperP5 = ((C1764200w0g) awS488S0200000_26.l0).P5();
                    if (iSeaHeadContainerHelperP5 != null) {
                        iSeaHeadContainerHelperP5.jc1(((C1764360w0w) awS488S0200000_26.l1).LIZIZ());
                    }
                    ((C1764200w0g) awS488S0200000_26.l0).c6(false);
                }
                break;
            case -1138330660:
                if (str.equals("onFirstFrame")) {
                    ISeaPendantHelper iSeaPendantHelper = (ISeaPendantHelper) ((C1764200w0g) awS488S0200000_26.l0).LLJILJIL.getValue();
                    if (iSeaPendantHelper != null) {
                        iSeaPendantHelper.Dz();
                    }
                    C1764200w0g c1764200w0g = (C1764200w0g) awS488S0200000_26.l0;
                    c1764200w0g.LLJILLL = "video_hidden";
                    Iterator<T> it2 = c1764200w0g.LL.LLILLL.getCurrentPendantMap().values().iterator();
                    while (it2.hasNext()) {
                        AbstractC1764240w0k abstractC1764240w0k = (AbstractC1764240w0k) it2.next();
                        C1068804Fy c1068804Fy = abstractC1764240w0k.LLILZ;
                        if (c1068804Fy != null && (seaPdpHeadFeatures = c1068804Fy.LJIL) != null && (list = seaPdpHeadFeatures.tags) != null && list.contains("video_hidden")) {
                            if (abstractC1764240w0k instanceof InterfaceC1764710w1V) {
                                ((InterfaceC1764710w1V) abstractC1764240w0k).LIZIZ();
                            }
                            abstractC1764240w0k.LLILLL = true;
                            C786410Ut5.LJLLLLLL(8, abstractC1764240w0k.LL);
                        }
                    }
                    ISeaTrackHelper iSeaTrackHelperS5 = ((C1764200w0g) awS488S0200000_26.l0).S5();
                    if (iSeaTrackHelperS5 != null) {
                        iSeaTrackHelperS5.ka2(((C1764200w0g) awS488S0200000_26.l0).getBindingAdapterPosition(), "video", Boolean.valueOf(((C1764200w0g) awS488S0200000_26.l0).LLJJIJI), ((C1764360w0w) awS488S0200000_26.l1).getVideoId());
                    }
                }
                break;
            case -1013054029:
                if (str.equals("onPlay")) {
                    ISeaHeadContainerHelper iSeaHeadContainerHelperP52 = ((C1764200w0g) awS488S0200000_26.l0).P5();
                    if (iSeaHeadContainerHelperP52 != null) {
                        iSeaHeadContainerHelperP52.jc1(((C1764360w0w) awS488S0200000_26.l1).LIZIZ());
                    }
                    C1764200w0g c1764200w0g2 = (C1764200w0g) awS488S0200000_26.l0;
                    AbstractC1764180w0e abstractC1764180w0e = c1764200w0g2.LL;
                    if ((abstractC1764180w0e instanceof C1764360w0w) && (c1764360w0w = (C1764360w0w) abstractC1764180w0e) != null) {
                        int bindingAdapterPosition = c1764200w0g2.getBindingAdapterPosition();
                        PageStateContext pageStateContext = (PageStateContext) c1764200w0g2.LLILZIL.getValue();
                        if (pageStateContext != null) {
                            objLIZ = PageStateContext.LIZ(pageStateContext, "page_show_type");
                        }
                        C1748720vbi.LIZLLL(c1764200w0g2.itemView, new C04BO(), new C1764300w0q(c1764200w0g2, bindingAdapterPosition, Intrinsics.LJFF(objLIZ, 2), c1764360w0w));
                    }
                    ISeaListHelper iSeaListHelperR5 = ((C1764200w0g) awS488S0200000_26.l0).R5();
                    if (iSeaListHelperR5 != null) {
                        iSeaListHelperR5.AS();
                    }
                }
                break;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS488S0200000_26 awS488S0200000_26, Object obj, Object obj2, Object obj3) {
        Map map = (Map) obj2;
        if (((Boolean) obj).booleanValue()) {
            String str = (String) map.get("client_token");
            String str2 = (String) map.get("client_meta_data_id");
            if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
                C1708640uZ4 c1708640uZ4 = C1708640uZ4.LIZ;
                PaymentOption paymentOption = (PaymentOption) awS488S0200000_26.l1;
                c1708640uZ4.getClass();
                List listLJIIJJI = C1697810uHb.LJIIJJI(C1708640uZ4.LIZLLL(paymentOption, "access_token", str, "eg_pi_ew_paypal_c_d_global_paypal_payin_paypal_access_token"), C1708640uZ4.LIZLLL((PaymentOption) awS488S0200000_26.l1, "client_metadata_id", str2, "eg_pi_ew_paypal_c_d_global_paypal_payin_paypal_client_metadata_id"));
                InterfaceC1631630sYr interfaceC1631630sYr = (InterfaceC1631630sYr) awS488S0200000_26.l0;
                if (interfaceC1631630sYr != null) {
                    interfaceC1631630sYr.invoke(EnumC336190DFx.SUCCESS, listLJIIJJI, null, null);
                }
            } else {
                InterfaceC1631630sYr interfaceC1631630sYr2 = (InterfaceC1631630sYr) awS488S0200000_26.l0;
                if (interfaceC1631630sYr2 != null) {
                    interfaceC1631630sYr2.invoke(EnumC336190DFx.PAYMENT_ERROR, null, null, "PAYPAL_ERROR_INVALID_PARAM");
                }
            }
        } else {
            InterfaceC1631630sYr interfaceC1631630sYr3 = (InterfaceC1631630sYr) awS488S0200000_26.l0;
            if (interfaceC1631630sYr3 != null) {
                interfaceC1631630sYr3.invoke(EnumC336190DFx.PAYMENT_ERROR, null, null, "PAYPAL_ERROR_CANCEL");
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS488S0200000_26 awS488S0200000_26, Object obj, Object obj2, Object obj3) {
        if (Intrinsics.LJFF(obj2, "sparkPageBackEvent")) {
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("pipo_pa_kyc_step_back_cancel_or_not", false) && Intrinsics.LJFF(((C1716570ulr) awS488S0200000_26.l0).LJIIJ, Boolean.FALSE)) {
                ((InterfaceC1716260ulM) awS488S0200000_26.l1).LIZ(null);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS488S0200000_26 awS488S0200000_26, Object obj, Object obj2, Object obj3) {
        Double d;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C1742730vS3 c1742730vS3 = (C1742730vS3) obj2;
        Double d2 = null;
        if (c1742730vS3 != null) {
            d = c1742730vS3.LIZIZ;
            d2 = c1742730vS3.LIZ;
        } else {
            d = null;
        }
        if (zBooleanValue && d != null && d2 != null) {
            C1177960gl8 c1177960gl8 = new C1177960gl8(d.doubleValue(), d2.doubleValue());
            AddressEditViewModel addressEditViewModel = (AddressEditViewModel) awS488S0200000_26.l0;
            addressEditViewModel.LLLLII = false;
            addressEditViewModel.oS2(c1177960gl8, true);
            addressEditViewModel.vS2("address_map", AFwS268S0000000_26.get$arr$(734));
            Function1 function1 = (Function1) awS488S0200000_26.l1;
            if (function1 != null) {
                function1.invoke(Boolean.TRUE);
            }
        } else {
            Function1 function12 = (Function1) awS488S0200000_26.l1;
            if (function12 != null) {
                function12.invoke(Boolean.FALSE);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS488S0200000_26 awS488S0200000_26, Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj).intValue();
        ((Number) obj2).intValue();
        ((ProductRecommendFeedCell) awS488S0200000_26.l0).S5(iIntValue, ((Number) obj3).longValue(), (Integer) awS488S0200000_26.l1);
        return Unit.LIZ;
    }
}
