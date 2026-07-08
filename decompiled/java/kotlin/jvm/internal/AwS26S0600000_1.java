package kotlin.jvm.internal;

import X.C013C;
import X.C03DB;
import X.C03JL;
import X.C09AY;
import X.C10465047j;
import X.C1063304Dv;
import X.C1397620mTQ;
import X.C13BV;
import X.C13LP;
import X.C2262851Dhb;
import X.C2262861Dhc;
import X.C2262991Dhp;
import X.C259800zU;
import X.C722302rt;
import X.C833003Ng;
import X.C875203bS;
import X.C875803bY;
import X.C877303bn;
import X.C996103ux;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.api.model.DialogButton;
import com.ss.android.ugc.aweme.ecommerce.api.model.DialogContent;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Price;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.payment.PaymentInfoViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PriceSubText;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BuyButton;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductUnavailableInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.vm.PdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpMainState;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.Skc;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuCommonConfig;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public class AwS26S0600000_1 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS26S0600000_1 awS26S0600000_1, Object obj) {
        DialogButton dialogButton;
        DialogButton dialogButton2;
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        List list = (List) awS26S0600000_1.l0;
        String str = "";
        if (list != null && (dialogButton2 = (DialogButton) C13LP.LJJJLL(list)) != null) {
            C03DB c03db = (C03DB) awS26S0600000_1.l1;
            Context context = (Context) awS26S0600000_1.l2;
            HashMap map = (HashMap) awS26S0600000_1.l3;
            Address address = (Address) awS26S0600000_1.l4;
            DialogContent dialogContent = (DialogContent) awS26S0600000_1.l5;
            String str2 = dialogButton2.text;
            if (str2 == null) {
                str2 = "";
            }
            c1397620mTQ.LIZJ(0, str2, new C03JL(c03db, context, dialogButton2.buttonAction, AFwS185S0000000_1.get$arr$(13), null, null, null, null, null, null, null, map, new AwS402S0200000_1(address, dialogContent, 0), new AwS130S0400000_1(dialogButton2, context, dialogContent, address, 0), null, null, 116704));
        }
        List list2 = (List) awS26S0600000_1.l0;
        boolean z = true;
        if (list2 != null && (dialogButton = (DialogButton) C13LP.LJJJLZIJ(1, list2)) != null) {
            C03DB c03db2 = (C03DB) awS26S0600000_1.l1;
            Context context2 = (Context) awS26S0600000_1.l2;
            HashMap map2 = (HashMap) awS26S0600000_1.l3;
            Address address2 = (Address) awS26S0600000_1.l4;
            DialogContent dialogContent2 = (DialogContent) awS26S0600000_1.l5;
            String str3 = dialogButton.text;
            if (str3 != null) {
                str = str3;
            }
            z = true;
            c1397620mTQ.LIZJ(1, str, new C03JL(c03db2, context2, dialogButton.buttonAction, AFwS185S0000000_1.get$arr$(14), null, null, null, null, null, null, null, map2, new AwS402S0200000_1(address2, dialogContent2, 1), new AwS130S0400000_1(dialogButton, context2, dialogContent2, address2, 1), null, null, 116704));
        }
        c1397620mTQ.LJFF = z;
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$1(AwS26S0600000_1 awS26S0600000_1, Object obj) throws JSONException {
        C1063304Dv c1063304DvLIZ;
        SkuCommonConfig skuCommonConfig;
        String str;
        Integer num;
        BuyButton buyButton;
        PdpMainState pdpMainState = (PdpMainState) obj;
        PdpViewModel pdpViewModel = (PdpViewModel) awS26S0600000_1.l0;
        List<Object> listXR2 = pdpViewModel.xR2(pdpViewModel.LLJILLL, false, false, false, false, false);
        ProductPackStruct productPackStruct = ((PdpViewModel) awS26S0600000_1.l0).LLJILLL;
        String strNR2 = null;
        if (productPackStruct != null) {
            C996103ux c996103ux = (C996103ux) awS26S0600000_1.l1;
            if (c996103ux != null) {
                num = c996103ux.LIZIZ;
            } else {
                num = null;
            }
            ProductUnavailableInfo productUnavailableInfo = (ProductUnavailableInfo) ((C259800zU) awS26S0600000_1.l2).element;
            SkuItem skuItem = (SkuItem) awS26S0600000_1.l3;
            if (skuItem != null) {
                buyButton = skuItem.buyButton;
            } else {
                buyButton = null;
            }
            c1063304DvLIZ = C10465047j.LIZ(productPackStruct, num, productUnavailableInfo, null, buyButton, null, null, true);
        } else {
            c1063304DvLIZ = null;
        }
        Integer num2 = (Integer) awS26S0600000_1.l4;
        SkuItem skuItem2 = (SkuItem) awS26S0600000_1.l3;
        Skc skc = (Skc) awS26S0600000_1.l5;
        PdpViewModel pdpViewModel2 = (PdpViewModel) awS26S0600000_1.l0;
        if (num2 != null && num2.intValue() == 2 && skuItem2 == null) {
            if (skc != null && (str = skc.bottomAreaId) != null) {
                strNR2 = str;
            } else {
                ProductPackStruct productPackStruct2 = pdpViewModel2.LLJILLL;
                if (productPackStruct2 != null && (skuCommonConfig = productPackStruct2.skuCommonConfig) != null) {
                    strNR2 = skuCommonConfig.bottomAreaId;
                }
            }
        } else {
            strNR2 = pdpViewModel2.NR2();
        }
        return pdpMainState.copy(pdpMainState.isFullScreen, c1063304DvLIZ, pdpMainState.dismiss, pdpMainState.sheetState, listXR2, pdpMainState.bottomSheetSlideOffset, pdpMainState.creatorSheetVO, pdpMainState.scrollOrientation, pdpMainState.creatorSheetSlideOffset, pdpMainState.scrollOffset, pdpMainState.currentFocusModule, pdpMainState.loadingStatus, pdpMainState.flashSaleState, pdpMainState.flashSaleCountDown, pdpMainState.cartTip, pdpMainState.cartEntry, pdpMainState.bodyContent, pdpMainState.shareInfo, pdpMainState.blockInfo, pdpMainState.showFavoriteGuide, pdpMainState.shopInfo, pdpViewModel2.MR2(strNR2), pdpMainState.protectionProgramText, pdpMainState.bizEnvChange, pdpMainState.userRight, pdpMainState.exceptionUX, pdpMainState.lynxPopupState, pdpMainState.bottomFloatingState, pdpMainState.openSkuOnInit, pdpMainState.addCartData);
    }

    public static final Object invoke$2(AwS26S0600000_1 awS26S0600000_1, Object obj) {
        List list = (List) obj;
        C875203bS c875203bS = C875203bS.LIZ;
        Context context = (Context) awS26S0600000_1.l0;
        FragmentManager fragmentManager = (FragmentManager) awS26S0600000_1.l1;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        String string = context.getString(2131833165);
        C877303bn c877303bn = (C877303bn) awS26S0600000_1.l2;
        c875203bS.getClass();
        String str = C875203bS.LIZJ;
        C875203bS.LIZJ = null;
        C875203bS.LJI(context, fragmentManager, list, string, c877303bn, str, new AwS162S0400000_1((C875803bY) awS26S0600000_1.l3, (PaymentViewModel) awS26S0600000_1.l4, (LifecycleOwner) awS26S0600000_1.l5, (Context) awS26S0600000_1.l0, 4));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS26S0600000_1 awS26S0600000_1, Object obj) {
        List list = (List) obj;
        C875203bS c875203bS = C875203bS.LIZ;
        Context context = (Context) awS26S0600000_1.l0;
        FragmentManager fragmentManager = (FragmentManager) awS26S0600000_1.l1;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        String string = context.getString(2131833165);
        C877303bn c877303bn = (C877303bn) awS26S0600000_1.l2;
        c875203bS.getClass();
        String str = C875203bS.LIZJ;
        C875203bS.LIZJ = null;
        C875203bS.LJI(context, fragmentManager, list, string, c877303bn, str, new AwS89S0500000_1((Context) awS26S0600000_1.l0, (C875803bY) awS26S0600000_1.l3, (PaymentInfoViewModel) awS26S0600000_1.l4, (FragmentManager) awS26S0600000_1.l1, (OrderSubmitAssemViewModel) awS26S0600000_1.l5, 1));
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$4(AwS26S0600000_1 awS26S0600000_1, Object obj) {
        Integer num;
        PriceSubText priceSubText;
        C2262851Dhb c2262851Dhb = (C2262851Dhb) obj;
        C833003Ng c833003Ng = new C833003Ng(((C013C) awS26S0600000_1.l0).element, 2);
        String str = (String) ((C259800zU) awS26S0600000_1.l1).element;
        Integer num2 = (Integer) ((C259800zU) awS26S0600000_1.l2).element;
        ECRichText eCRichText = (ECRichText) ((C259800zU) awS26S0600000_1.l3).element;
        Boolean bool = Boolean.FALSE;
        C2262991Dhp c2262991Dhp = (C2262991Dhp) ((C259800zU) awS26S0600000_1.l4).element;
        Boolean bool2 = Boolean.TRUE;
        C722302rt c722302rt = (C722302rt) ((C259800zU) awS26S0600000_1.l5).element;
        if (c722302rt != null && (priceSubText = c722302rt.LLJJIII) != null) {
            num = priceSubText.subTextType;
        } else {
            num = null;
        }
        return C2262851Dhb.LIZ(c2262851Dhb, null, null, new C2262861Dhc(c833003Ng, str, (Price) null, (Integer) null, (Integer) 22, num2, eCRichText, (String) null, bool, c2262991Dhp, bool2, num, 396), null, null, null, null, null, null, null, null, 2043);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS26S0600000_1(C013C c013c, C259800zU c259800zU, C259800zU c259800zU2, C259800zU c259800zU3, C259800zU c259800zU4, C259800zU c259800zU5, int i) {
        super(1);
        this.$t = i;
        this.l0 = c013c;
        this.l1 = c259800zU;
        this.l2 = c259800zU2;
        this.l3 = c259800zU3;
        this.l4 = c259800zU4;
        this.l5 = c259800zU5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS26S0600000_1(Context context, FragmentManager fragmentManager, C877303bn c877303bn, C875803bY c875803bY, PaymentInfoViewModel paymentInfoViewModel, OrderSubmitAssemViewModel orderSubmitAssemViewModel, int i) {
        super(1);
        this.$t = i;
        this.l0 = context;
        this.l1 = fragmentManager;
        this.l2 = c877303bn;
        this.l3 = c875803bY;
        this.l4 = paymentInfoViewModel;
        this.l5 = orderSubmitAssemViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS26S0600000_1(Context context, FragmentManager fragmentManager, C877303bn c877303bn, C875803bY c875803bY, PaymentViewModel paymentViewModel, LifecycleOwner lifecycleOwner, int i) {
        super(1);
        this.$t = i;
        this.l0 = context;
        this.l1 = fragmentManager;
        this.l2 = c877303bn;
        this.l3 = c875803bY;
        this.l4 = paymentViewModel;
        this.l5 = lifecycleOwner;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS26S0600000_1(PdpViewModel pdpViewModel, PdpViewModel pdpViewModel2, C996103ux c996103ux, C259800zU<ProductUnavailableInfo> c259800zU, SkuItem skuItem, Integer num, Skc skc) {
        super(1);
        this.$t = skc;
        this.l0 = pdpViewModel;
        this.l1 = pdpViewModel2;
        this.l2 = c996103ux;
        this.l3 = c259800zU;
        this.l4 = skuItem;
        this.l5 = num;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS26S0600000_1(List list, List<DialogButton> list2, C03DB c03db, Context context, HashMap<String, Object> map, Address address, DialogContent dialogContent) {
        super(1);
        this.$t = dialogContent;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = c03db;
        this.l3 = context;
        this.l4 = map;
        this.l5 = address;
    }
}
