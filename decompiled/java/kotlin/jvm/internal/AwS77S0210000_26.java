package kotlin.jvm.internal;

import X.C09AY;
import X.C1177960gl8;
import X.C1397630mTR;
import X.C15438062q;
import X.C1715940ukq;
import X.C1716020uky;
import X.C1745480vWU;
import X.C1745680vWo;
import X.C1746310vXp;
import X.C1746460vY4;
import X.C1747430vZd;
import X.C1759460vt2;
import X.C1759590vtF;
import X.C197039127h;
import X.C19EG;
import X.C2327809Ae;
import X.C259800zU;
import X.C786410Ut5;
import X.EnumC1746980vYu;
import X.EnumC1759580vtE;
import Y.ACListenerS128S0200000_26;
import Y.ACListenerS160S0100000_26;
import com.bytedance.pipo.ttpay.recharge.qrcode.QrCodeFragment;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputData;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditState;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.delivery.DeliveryInstructionState;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.delivery.DeliveryInstructionViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.LocationUseBarV3ViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.address.map.AddressMapDetailState;
import com.ss.android.ugc.aweme.ecommerce.base.address.map.AddressMapDetailViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpMainState;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpMainState;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.home.WalletHomeViewAssem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes27.dex */
public class AwS77S0210000_26 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

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
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS77S0210000_26 awS77S0210000_26, Object obj) {
        PdpMainState pdpMainState = (PdpMainState) obj;
        return pdpMainState.copy(pdpMainState.isFullScreen, pdpMainState.bottomBarVO, pdpMainState.dismiss, pdpMainState.sheetState, pdpMainState.contentList, pdpMainState.bottomSheetSlideOffset, pdpMainState.creatorSheetVO, pdpMainState.scrollOrientation, pdpMainState.creatorSheetSlideOffset, pdpMainState.scrollOffset, pdpMainState.currentFocusModule, pdpMainState.loadingStatus, pdpMainState.flashSaleState, pdpMainState.flashSaleCountDown, pdpMainState.cartTip, pdpMainState.cartEntry, pdpMainState.bodyContent, pdpMainState.shareInfo, pdpMainState.blockInfo, pdpMainState.showFavoriteGuide, pdpMainState.shopInfo, pdpMainState.bottomAreaElem, pdpMainState.protectionProgramText, pdpMainState.bizEnvChange, pdpMainState.userRight, pdpMainState.exceptionUX, new C1759460vt2(EnumC1759580vtE.BOTTOM, (C1759590vtF) awS77S0210000_26.l0, null, false, awS77S0210000_26.z2, (Function0) awS77S0210000_26.l1, null, 64), pdpMainState.bottomFloatingState, pdpMainState.openSkuOnInit, pdpMainState.addCartData);
    }

    public static final Object invoke$1(AwS77S0210000_26 awS77S0210000_26, Object obj) {
        SeaPdpMainState seaPdpMainState = (SeaPdpMainState) obj;
        return seaPdpMainState.copy(seaPdpMainState.isFullScreen, seaPdpMainState.bottomBarVO, seaPdpMainState.bottomBarData, seaPdpMainState.tabs, seaPdpMainState.dismiss, seaPdpMainState.sheetState, seaPdpMainState.contentList, seaPdpMainState.bottomSheetSlideOffset, seaPdpMainState.creatorSheetVO, seaPdpMainState.scrollOrientation, seaPdpMainState.creatorSheetSlideOffset, seaPdpMainState.scrollOffset, seaPdpMainState.seaFocusTabAction, seaPdpMainState.seaFocusTabActionNew, seaPdpMainState.selectedTabName, seaPdpMainState.loadingStatus, seaPdpMainState.flashSaleState, seaPdpMainState.flashSaleCountDown, seaPdpMainState.cartTip, seaPdpMainState.cartEntry, seaPdpMainState.bodyContent, seaPdpMainState.shareInfo, seaPdpMainState.showLoadingDialog, seaPdpMainState.blockInfo, seaPdpMainState.showFloatShop, seaPdpMainState.bizEnvChange, seaPdpMainState.slideToPaymentModule, seaPdpMainState.lynxAirItemName, seaPdpMainState.exceptionUX, new C1759460vt2(EnumC1759580vtE.BOTTOM, (C1759590vtF) awS77S0210000_26.l0, null, false, awS77S0210000_26.z2, (Function0) awS77S0210000_26.l1, null, 64), seaPdpMainState.bottomFloatingState, seaPdpMainState.seaEntranceBubble, seaPdpMainState.bottomMynaBannerState, seaPdpMainState.mediaWindow);
    }

    public static final Object invoke$2(AwS77S0210000_26 awS77S0210000_26, Object obj) {
        if (((AddressEditState) obj).getRecommendCandInputData() != null) {
            LocationUseBarV3ViewHolder locationUseBarV3ViewHolder = (LocationUseBarV3ViewHolder) awS77S0210000_26.l0;
            int i = LocationUseBarV3ViewHolder.LLJJJIL;
            locationUseBarV3ViewHolder.withState(locationUseBarV3ViewHolder.a6(), new AwS112S0110000_26(locationUseBarV3ViewHolder, false, 11));
        } else {
            LocationUseBarV3ViewHolder locationUseBarV3ViewHolder2 = (LocationUseBarV3ViewHolder) awS77S0210000_26.l0;
            locationUseBarV3ViewHolder2.LLJJIII = true;
            locationUseBarV3ViewHolder2.a6().eS2(1, ((LocationUseBarV3ViewHolder) awS77S0210000_26.l0).itemView.getContext(), "location_authorization", "location_sug", true, true);
            LocationUseBarV3ViewHolder locationUseBarV3ViewHolder3 = (LocationUseBarV3ViewHolder) awS77S0210000_26.l0;
            CandInputData candInputData = (CandInputData) awS77S0210000_26.l1;
            boolean z = awS77S0210000_26.z2;
            C1745480vWU c1745480vWU = locationUseBarV3ViewHolder3.a6().LLJJIJIL;
            HashMap<String, Object> map = locationUseBarV3ViewHolder3.a6().LLJJIJIIJIL;
            C1746460vY4.LIZ.getClass();
            c1745480vWU.LJII("location_sug", "grant", map, C1746460vY4.LJFF(candInputData, z));
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(AwS77S0210000_26 awS77S0210000_26, Object obj) {
        C197039127h c197039127h = (C197039127h) obj;
        c197039127h.setButtonVariant(1);
        c197039127h.setButtonSize(3);
        if (awS77S0210000_26.z2) {
            c197039127h.setText(2131840386);
            C786410Ut5.U8(c197039127h, new ACListenerS128S0200000_26((C19EG) awS77S0210000_26.l0, (QrCodeFragment) awS77S0210000_26.l1, 21));
        } else {
            c197039127h.setText(R.string.rvr);
            C786410Ut5.U8(c197039127h, new ACListenerS160S0100000_26((QrCodeFragment) awS77S0210000_26.l1, 57));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS77S0210000_26 awS77S0210000_26, Object obj) {
        String str;
        int i;
        Integer numValueOf;
        LaneParams laneParams = (LaneParams) obj;
        boolean z = awS77S0210000_26.z2;
        Response response = (Response) awS77S0210000_26.l0;
        Map<String, ? extends Object> map = (Map) awS77S0210000_26.l1;
        if (z) {
            str = "save";
        } else {
            str = "unsave";
        }
        laneParams.plusAssign("save_type", str);
        if (response != null && response.isCodeOK()) {
            i = 1;
        } else {
            i = 0;
        }
        laneParams.plusAssign("is_success", Integer.valueOf(i));
        if (response != null) {
            if (!response.isCodeOK()) {
                numValueOf = Integer.valueOf(response.code);
            }
            laneParams.withParamsGroup(map);
            return Unit.LIZ;
        }
        numValueOf = null;
        laneParams.plusAssign("error_code", numValueOf);
        laneParams.withParamsGroup(map);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS77S0210000_26 awS77S0210000_26, Object obj) {
        Double dLJII;
        Double dLJII2;
        AddressMapDetailState addressMapDetailState = (AddressMapDetailState) obj;
        Address address = ((AddressMapDetailViewModel) awS77S0210000_26.l0).LLIZ;
        C1177960gl8 c1177960gl8 = null;
        if (address != null) {
            String str = address.latitude;
            if (str != null) {
                dLJII = C2327809Ae.LJII(str);
            } else {
                dLJII = null;
            }
            String str2 = address.longitude;
            if (str2 != null) {
                dLJII2 = C2327809Ae.LJII(str2);
            } else {
                dLJII2 = null;
            }
            if (dLJII != null && dLJII2 != null) {
                c1177960gl8 = new C1177960gl8(dLJII.doubleValue(), dLJII2.doubleValue());
            }
        }
        return addressMapDetailState.copy(EnumC1746980vYu.SUCCESS, new C1747430vZd(c1177960gl8, awS77S0210000_26.z2), (List) awS77S0210000_26.l1, addressMapDetailState.isReturnFromAssociate, addressMapDetailState.saveLoadingStatus);
    }

    public static final Object invoke$6(AwS77S0210000_26 awS77S0210000_26, Object obj) {
        if (awS77S0210000_26.z2) {
            C19EG c19eg = (C19EG) awS77S0210000_26.l0;
            if (c19eg != null) {
                C1716020uky.LIZJ(c19eg);
            }
        } else {
            ((C1715940ukq) awS77S0210000_26.l1).LIZ(Unit.LIZ);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [T, X.0vXp] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    public static final Object invoke$7(AwS77S0210000_26 awS77S0210000_26, Object obj) {
        boolean z;
        boolean z2;
        C259800zU c259800zU = new C259800zU();
        List<Object> itemList = ((DeliveryInstructionState) obj).getItemList();
        C1746310vXp c1746310vXp = (C1746310vXp) awS77S0210000_26.l1;
        boolean z3 = awS77S0210000_26.z2;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(itemList, 10));
        for (?? LIZ : itemList) {
            if (LIZ instanceof C1746310vXp) {
                C1746310vXp c1746310vXp2 = (C1746310vXp) LIZ;
                if (Intrinsics.LJFF(c1746310vXp2.LIZ.instructionType, c1746310vXp.LIZ.instructionType)) {
                    if (z3) {
                        z2 = true;
                    } else {
                        z2 = c1746310vXp2.LIZIZ;
                    }
                    LIZ = C1746310vXp.LIZ(c1746310vXp, z2, null, 13);
                } else {
                    if (z3) {
                        z = false;
                    } else {
                        z = c1746310vXp2.LIZIZ;
                    }
                    LIZ = C1746310vXp.LIZ(c1746310vXp2, z, null, 13);
                }
                if (LIZ.LIZIZ) {
                    c259800zU.element = LIZ;
                }
            }
            arrayList.add(LIZ);
        }
        ((DeliveryInstructionViewModel) awS77S0210000_26.l0).setStateImmediate(new AwS392S0200000_26(arrayList, (List<? extends Object>) c259800zU, (C259800zU<C1746310vXp>) 263));
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS77S0210000_26 awS77S0210000_26, Object obj) {
        C1397630mTR c1397630mTR = (C1397630mTR) obj;
        if (awS77S0210000_26.z2) {
            c1397630mTR.LJ(2131846531, new AwS605S0100000_26((Function0) awS77S0210000_26.l0, (Function0<Unit>) 925));
            c1397630mTR.LJI(R.string.f1_, new AwS605S0100000_26((WalletHomeViewAssem) awS77S0210000_26.l1, 926));
        } else {
            c1397630mTR.LJ(2131840316, new AwS603S0100000_24((WalletHomeViewAssem) awS77S0210000_26.l1, 692));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS77S0210000_26(C1759590vtF c1759590vtF, boolean z, AwS570S0100000_26 awS570S0100000_26, int i) {
        super(1);
        this.$t = i;
        this.l0 = c1759590vtF;
        this.z2 = z;
        this.l1 = awS570S0100000_26;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS77S0210000_26(DeliveryInstructionViewModel deliveryInstructionViewModel, C1746310vXp c1746310vXp, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = deliveryInstructionViewModel;
        this.l1 = c1746310vXp;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS77S0210000_26(LocationUseBarV3ViewHolder locationUseBarV3ViewHolder, CandInputData candInputData, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = locationUseBarV3ViewHolder;
        this.l1 = candInputData;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS77S0210000_26(AddressMapDetailViewModel addressMapDetailViewModel, AddressMapDetailViewModel addressMapDetailViewModel2, boolean z, List<C1745680vWo> list) {
        super(1);
        this.$t = list;
        this.l0 = addressMapDetailViewModel;
        this.z2 = addressMapDetailViewModel2;
        this.l1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS77S0210000_26(boolean z, boolean z2, C19EG c19eg, C1715940ukq<Unit> c1715940ukq) {
        super(1);
        this.$t = c1715940ukq;
        this.z2 = z;
        this.l0 = z2;
        this.l1 = c19eg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS77S0210000_26(boolean z, C19EG c19eg, QrCodeFragment qrCodeFragment, int i) {
        super(1);
        this.$t = i;
        this.z2 = z;
        this.l0 = c19eg;
        this.l1 = qrCodeFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS77S0210000_26(boolean z, boolean z2, Response<n> response, Map<String, ? extends Object> map) {
        super(1);
        this.$t = map;
        this.z2 = z;
        this.l0 = z2;
        this.l1 = response;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS77S0210000_26(boolean z, boolean z2, Function0<Unit> function0, WalletHomeViewAssem walletHomeViewAssem) {
        super(1);
        this.$t = walletHomeViewAssem;
        this.z2 = z;
        this.l0 = z2;
        this.l1 = function0;
    }
}
