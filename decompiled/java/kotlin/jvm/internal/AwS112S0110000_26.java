package kotlin.jvm.internal;

import X.AbstractC1250290idn;
import X.C062P;
import X.C09AY;
import X.C0PEM;
import X.C1177960gl8;
import X.C1250280idm;
import X.C13BV;
import X.C15438062q;
import X.C1556000qas;
import X.C1556630qbt;
import X.C1710230ubd;
import X.C1728990v5t;
import X.C1730750v8j;
import X.C1736630vID;
import X.C1736640vIE;
import X.C1736830vIX;
import X.C1736840vIY;
import X.C1741890vQh;
import X.C1745480vWU;
import X.C1745680vWo;
import X.C1746000vXK;
import X.C1746460vY4;
import X.C1754870vld;
import X.C1DFH;
import X.C2107308Nj;
import X.C23250099c;
import X.C2327809Ae;
import X.C259800zU;
import X.C291001Au;
import X.C948503nH;
import X.C984203t2;
import X.EnumC1236410iHP;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.biz.wallet.biz.finish.WalletAccountFinishFragment;
import com.ss.android.ugc.aweme.component.guide.GuidePageAssem;
import com.ss.android.ugc.aweme.component.phone.PhoneNumberVM;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ClientConfig;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemData;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditState;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.LocationUseBarV3ViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.address.map2.AddressMapDetailViewModel2;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RootData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.TemplateItem;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.subcashier.SubCashierViewModel;
import com.ss.android.ugc.aweme.prop.mobileefffect.EffectEditVM;
import com.ss.android.ugc.aweme.prop.mobileefffect.edit.EffectEditV2VM;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.verify.id.IDVerifyVM;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes27.dex */
public class AwS112S0110000_26 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public boolean z1;

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
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            case 16:
                return invoke$16(this, obj);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj);
            case 19:
                return invoke$19(this, obj);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj);
            case 21:
                return invoke$21(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS112S0110000_26 awS112S0110000_26, Object obj) {
        Assembler assembler = (Assembler) obj;
        WalletAccountFinishFragment walletAccountFinishFragment = (WalletAccountFinishFragment) awS112S0110000_26.l0;
        assembler.DQ2(walletAccountFinishFragment, new AwS112S0110000_26(walletAccountFinishFragment, awS112S0110000_26.z1, 1));
        assembler.QQ2((WalletAccountFinishFragment) awS112S0110000_26.l0, AFwS236S0000000_6.get$arr$(38));
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS112S0110000_26 r18, java.lang.Object r19) {
        /*
            r1 = r19
            X.062P r1 = (X.C062P) r1
            X.0upW r4 = new X.0upW
            r0 = r18
            java.lang.Object r2 = r0.l0
            com.ss.android.ugc.aweme.biz.wallet.biz.finish.WalletAccountFinishFragment r2 = (com.ss.android.ugc.aweme.biz.wallet.biz.finish.WalletAccountFinishFragment) r2
            java.lang.String r5 = r2.LLIZ
            java.lang.String r6 = r2.LLJ
            java.lang.String r7 = r2.LLJI
            java.lang.String r8 = r2.LLJIJIL
            java.lang.String r9 = r2.LLJILJIL
            java.lang.String r10 = r2.LLJILJILJ
            android.os.Bundle r3 = r2.getArguments()
            if (r3 == 0) goto Lbf
            java.lang.String r2 = "title"
            java.lang.String r11 = r3.getString(r2)
        L24:
            java.lang.Object r2 = r0.l0
            com.ss.android.ugc.aweme.biz.wallet.biz.finish.WalletAccountFinishFragment r2 = (com.ss.android.ugc.aweme.biz.wallet.biz.finish.WalletAccountFinishFragment) r2
            android.os.Bundle r3 = r2.getArguments()
            if (r3 == 0) goto Lbc
            java.lang.String r2 = "description"
            java.lang.String r12 = r3.getString(r2)
        L34:
            java.lang.Object r2 = r0.l0
            com.ss.android.ugc.aweme.biz.wallet.biz.finish.WalletAccountFinishFragment r2 = (com.ss.android.ugc.aweme.biz.wallet.biz.finish.WalletAccountFinishFragment) r2
            android.os.Bundle r3 = r2.getArguments()
            if (r3 == 0) goto Lba
            java.lang.String r2 = "result_btn_text"
            java.lang.String r13 = r3.getString(r2)
        L44:
            java.lang.Object r2 = r0.l0
            com.ss.android.ugc.aweme.biz.wallet.biz.finish.WalletAccountFinishFragment r2 = (com.ss.android.ugc.aweme.biz.wallet.biz.finish.WalletAccountFinishFragment) r2
            android.os.Bundle r3 = r2.getArguments()
            if (r3 == 0) goto Lb8
            java.lang.String r2 = "bold_tux_color"
            java.lang.String r14 = r3.getString(r2)
        L54:
            java.lang.Object r2 = r0.l0
            com.ss.android.ugc.aweme.biz.wallet.biz.finish.WalletAccountFinishFragment r2 = (com.ss.android.ugc.aweme.biz.wallet.biz.finish.WalletAccountFinishFragment) r2
            android.os.Bundle r3 = r2.getArguments()
            if (r3 == 0) goto Lb6
            java.lang.String r2 = "hit_marketing"
            java.lang.String r2 = r3.getString(r2)
            if (r2 == 0) goto Lb6
            boolean r2 = java.lang.Boolean.parseBoolean(r2)
            r15 = 1
            if (r2 != r15) goto Lb6
        L6d:
            java.lang.Object r2 = r0.l0
            com.ss.android.ugc.aweme.biz.wallet.biz.finish.WalletAccountFinishFragment r2 = (com.ss.android.ugc.aweme.biz.wallet.biz.finish.WalletAccountFinishFragment) r2
            android.os.Bundle r3 = r2.getArguments()
            if (r3 == 0) goto Lb3
            java.lang.String r2 = "finish_page_image_url"
            java.lang.String r16 = r3.getString(r2)
        L7d:
            java.lang.Object r2 = r0.l0
            com.ss.android.ugc.aweme.biz.wallet.biz.finish.WalletAccountFinishFragment r2 = (com.ss.android.ugc.aweme.biz.wallet.biz.finish.WalletAccountFinishFragment) r2
            android.os.Bundle r2 = r2.getArguments()
            if (r2 == 0) goto Lb0
            java.lang.String r3 = "finish_page_image_dark_url"
            java.lang.String r17 = r2.getString(r3)
        L8d:
            java.lang.Object r2 = r0.l0
            com.ss.android.ugc.aweme.biz.wallet.biz.finish.WalletAccountFinishFragment r2 = (com.ss.android.ugc.aweme.biz.wallet.biz.finish.WalletAccountFinishFragment) r2
            android.os.Bundle r2 = r2.getArguments()
            if (r2 == 0) goto Lad
            java.lang.String r3 = "post_guide_jump_schema"
            java.lang.String r18 = r2.getString(r3)
        L9d:
            boolean r0 = r0.z1
            r19 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r1.LIZ = r4
            java.lang.String r0 = "SOURCE_DATA"
            r1.LIZIZ = r0
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        Lad:
            r18 = 0
            goto L9d
        Lb0:
            r17 = 0
            goto L8d
        Lb3:
            r16 = 0
            goto L7d
        Lb6:
            r15 = 0
            goto L6d
        Lb8:
            r14 = 0
            goto L54
        Lba:
            r13 = 0
            goto L44
        Lbc:
            r12 = 0
            goto L34
        Lbf:
            r11 = 0
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS112S0110000_26.invoke$1(kotlin.jvm.internal.AwS112S0110000_26, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$10(AwS112S0110000_26 awS112S0110000_26, Object obj) {
        ((PhoneNumberVM) awS112S0110000_26.l0).setState(new AwS38S0010000_26(awS112S0110000_26.z1, 8));
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayList] */
    public static final Object invoke$11(AwS112S0110000_26 awS112S0110000_26, Object obj) {
        Address address;
        ?? arrayList;
        String str;
        List listLJJLIIIJ;
        AddressEditState addressEditState = (AddressEditState) obj;
        CandInputData recommendCandInputData = addressEditState.getRecommendCandInputData();
        if (recommendCandInputData != null && (address = recommendCandInputData.address) != null) {
            ClientConfig clientConfig = addressEditState.getClientConfig();
            if (clientConfig != null && (str = clientConfig.recAddrUnRewriteItems) != null && (listLJJLIIIJ = a0.LJJLIIIJ(str, new char[]{','}, false, 0, 6)) != null) {
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJ, 10));
                Iterator it2 = listLJJLIIIJ.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(a0.LJLIIIL((String) it2.next()).toString());
                }
                arrayList = new ArrayList();
                for (Object obj2 : arrayList2) {
                    if (((String) obj2).length() > 0) {
                        arrayList.add(obj2);
                    }
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            ((LocationUseBarV3ViewHolder) awS112S0110000_26.l0).a6().LLLL = true;
            C1745480vWU.LIZIZ = "default_rec";
            for (String str2 : arrayList) {
                C1746460vY4 c1746460vY4 = C1746460vY4.LIZ;
                C1746460vY4.LJI(c1746460vY4, str2);
                C1746460vY4.LJII(c1746460vY4, str2);
            }
            AddressEditViewModel.tS2(((LocationUseBarV3ViewHolder) awS112S0110000_26.l0).a6(), address, arrayList, null, null, false, true, Boolean.valueOf(awS112S0110000_26.z1), C1741890vQh.LJIIJ(recommendCandInputData.daInfo), "latitude_longitude", null, 4156);
            ((LocationUseBarV3ViewHolder) awS112S0110000_26.l0).a6().LLJJIJI = true;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS112S0110000_26 awS112S0110000_26, Object obj) {
        ((IDVerifyVM) awS112S0110000_26.l0).setState(new AwS38S0010000_26(awS112S0110000_26.z1, 10));
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS112S0110000_26 awS112S0110000_26, Object obj) {
        Object obj2;
        String str;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("page_name", "suggested_address_list");
        laneParams.plusAssign("popup_name", "allow_tt_access_location");
        HashMap map = (HashMap) awS112S0110000_26.l0;
        if (map != null) {
            obj2 = map.get("previous_page");
        } else {
            obj2 = null;
        }
        laneParams.plusAssign("previous_page", obj2);
        if (awS112S0110000_26.z1) {
            str = "allow";
        } else {
            str = "no_allow";
        }
        laneParams.plusAssign("action_type", str);
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS112S0110000_26 awS112S0110000_26, Object obj) {
        String str;
        LaneParams laneParams = (LaneParams) obj;
        if (awS112S0110000_26.z1) {
            str = "save";
        } else {
            str = "unsave";
        }
        laneParams.plusAssign("save_type", str);
        laneParams.withParamsGroup((Map) awS112S0110000_26.l0);
        return Unit.LIZ;
    }

    public static final Object invoke$15(AwS112S0110000_26 awS112S0110000_26, Object obj) {
        return C1754870vld.LIZ((C1754870vld) obj, null, 0, null, 0, 0.0f, awS112S0110000_26.z1, null, null, (SellerInfo) awS112S0110000_26.l0, 223);
    }

    public static final Object invoke$16(AwS112S0110000_26 awS112S0110000_26, Object obj) {
        Double dLJII;
        Double dLJII2;
        C1556630qbt c1556630qbt = (C1556630qbt) obj;
        Address address = ((AddressMapDetailViewModel2) awS112S0110000_26.l0).LLILLJJLI;
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
        return C1556630qbt.LIZ(c1556630qbt, EnumC1236410iHP.SUCCESS, new C1556000qas(c1177960gl8, awS112S0110000_26.z1), 4);
    }

    public static final Object invoke$17(AwS112S0110000_26 awS112S0110000_26, Object obj) {
        AddressEditState addressEditState = (AddressEditState) obj;
        return addressEditState.copy(addressEditState.inputItemFirstTimeLoadingStatus, addressEditState.changeRegionLoadingStatus, addressEditState.deleteLoadingStatus, addressEditState.saveLoadingStatus, addressEditState.previewLoadingStatus, addressEditState.pudoAddressVO, addressEditState.inputItemVOList, addressEditState.inputItemPreviewVOList, addressEditState.emailHintVisible, addressEditState.privacyPolicyStatement, addressEditState.showExceptionUX, addressEditState.addressRightStatement, addressEditState.isAllKeyItemFilled, addressEditState.editDeliveryInstruction, addressEditState.scrollerPos, addressEditState.noticeBubbles, addressEditState.topText, addressEditState.changeOrderData, addressEditState.clientConfig, addressEditState.toastMessage, addressEditState.locationPermissionStatus, (CandInputData) awS112S0110000_26.l0, addressEditState.currentLocation, addressEditState.isClickUseLocation, addressEditState.hasFineLocationPermission, awS112S0110000_26.z1, addressEditState.needToastGetLocationError, addressEditState.isUseMyLocationLoading, addressEditState.isDontKnowZipCode);
    }

    public static final Object invoke$18(AwS112S0110000_26 awS112S0110000_26, Object obj) {
        C1746000vXK c1746000vXK;
        C1745680vWo c1745680vWo = (C1745680vWo) obj;
        Object obj2 = c1745680vWo.LIZIZ;
        C1746000vXK c1746000vXK2 = null;
        if ((obj2 instanceof C1746000vXK) && (c1746000vXK = (C1746000vXK) obj2) != null) {
            c1746000vXK2 = new C1746000vXK(c1746000vXK.LIZ, Boolean.valueOf(awS112S0110000_26.z1), (CandInputData) awS112S0110000_26.l0);
        }
        return C1745680vWo.LIZ(c1745680vWo, c1746000vXK2, null, false, null, null, null, 16381);
    }

    public static final Object invoke$19(AwS112S0110000_26 awS112S0110000_26, Object obj) {
        ClientConfig clientConfig;
        AddressEditState addressEditState = (AddressEditState) obj;
        if (((AddressEditViewModel) awS112S0110000_26.l0).oR2(addressEditState)) {
            Address addressTR2 = ((AddressEditViewModel) awS112S0110000_26.l0).tR2(addressEditState.getInputItemVOList(), false);
            if (addressTR2 != null) {
                AddressEditViewModel addressEditViewModel = (AddressEditViewModel) awS112S0110000_26.l0;
                boolean z = awS112S0110000_26.z1;
                InputItemData inputItemData = addressEditViewModel.LLJJJJ;
                if (inputItemData != null && (clientConfig = inputItemData.config) != null && Intrinsics.LJFF(clientConfig.enableConcatenateAddressCheck, Boolean.TRUE) && !z) {
                    Integer numValueOf = Integer.valueOf(addressEditViewModel.yR2());
                    Integer num = addressEditViewModel.LLLIIL;
                    C1DFH c1dfh = C0PEM.LIZ;
                    C948503nH.LJFF(addressEditViewModel, C2107308Nj.LIZ, new C984203t2(addressTR2, numValueOf, num, addressEditViewModel, null));
                } else {
                    addressEditViewModel.UR2(addressTR2);
                }
            }
        } else {
            AddressEditViewModel addressEditViewModel2 = (AddressEditViewModel) awS112S0110000_26.l0;
            addressEditViewModel2.getClass();
            addressEditViewModel2.setState(new AwS605S0100000_26(addressEditViewModel2, 835));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS112S0110000_26 awS112S0110000_26, Object obj) {
        AbstractC1250290idn abstractC1250290idn = (AbstractC1250290idn) obj;
        if ((abstractC1250290idn instanceof C1250280idm) && abstractC1250290idn != null) {
            ((TextView) ((GuidePageAssem) awS112S0110000_26.l0).LLJJJIL.getValue()).setEnabled(!awS112S0110000_26.z1);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$20(AwS112S0110000_26 awS112S0110000_26, Object obj) {
        C1746000vXK c1746000vXK;
        C1745680vWo c1745680vWo = (C1745680vWo) obj;
        Object obj2 = c1745680vWo.LIZIZ;
        C1746000vXK c1746000vXK2 = null;
        if ((obj2 instanceof C1746000vXK) && (c1746000vXK = (C1746000vXK) obj2) != null) {
            c1746000vXK2 = new C1746000vXK(c1746000vXK.LIZ, Boolean.valueOf(awS112S0110000_26.z1), (CandInputData) awS112S0110000_26.l0);
        }
        return C1745680vWo.LIZ(c1745680vWo, c1746000vXK2, null, false, null, null, null, 16381);
    }

    public static final Object invoke$21(AwS112S0110000_26 awS112S0110000_26, Object obj) {
        C1746000vXK c1746000vXK;
        C1745680vWo c1745680vWo = (C1745680vWo) obj;
        Object obj2 = c1745680vWo.LIZIZ;
        C1746000vXK c1746000vXK2 = null;
        if ((obj2 instanceof C1746000vXK) && (c1746000vXK = (C1746000vXK) obj2) != null) {
            c1746000vXK2 = new C1746000vXK(c1746000vXK.LIZ, Boolean.valueOf(awS112S0110000_26.z1), (CandInputData) awS112S0110000_26.l0);
        }
        return C1745680vWo.LIZ(c1745680vWo, c1746000vXK2, null, false, null, null, null, 16381);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$3(AwS112S0110000_26 awS112S0110000_26, Object obj) {
        AddressEditState addressEditState = (AddressEditState) obj;
        return addressEditState.copy(addressEditState.inputItemFirstTimeLoadingStatus, addressEditState.changeRegionLoadingStatus, addressEditState.deleteLoadingStatus, addressEditState.saveLoadingStatus, addressEditState.previewLoadingStatus, addressEditState.pudoAddressVO, addressEditState.inputItemVOList, addressEditState.inputItemPreviewVOList, addressEditState.emailHintVisible, addressEditState.privacyPolicyStatement, addressEditState.showExceptionUX, addressEditState.addressRightStatement, addressEditState.isAllKeyItemFilled, addressEditState.editDeliveryInstruction, addressEditState.scrollerPos, addressEditState.noticeBubbles, addressEditState.topText, addressEditState.changeOrderData, addressEditState.clientConfig, addressEditState.toastMessage, awS112S0110000_26.z1, addressEditState.recommendCandInputData, addressEditState.currentLocation, addressEditState.isClickUseLocation, (Boolean) ((C259800zU) awS112S0110000_26.l0).element, addressEditState.autoFillLocation, addressEditState.needToastGetLocationError, addressEditState.isUseMyLocationLoading, addressEditState.isDontKnowZipCode);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003a A[EDGE_INSN: B:22:0x003a->B:17:0x003a BREAK  A[LOOP:0: B:11:0x0020->B:23:0x0020]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$4(kotlin.jvm.internal.AwS112S0110000_26 r5, java.lang.Object r6) {
        /*
            com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditState r6 = (com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditState) r6
            java.util.List r1 = r6.getInputItemVOList()
            boolean r0 = r1 instanceof java.util.Collection
            r3 = 1
            if (r0 == 0) goto L1c
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L1c
        L11:
            java.lang.Object r0 = r5.l0
            com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel r0 = (com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel) r0
            boolean r0 = r0.LLLF
            if (r0 != 0) goto L3a
        L19:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1c:
            java.util.Iterator r2 = r1.iterator()
        L20:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L11
            java.lang.Object r0 = r2.next()
            X.0vWo r0 = (X.C1745680vWo) r0
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.InputItemDTO r0 = r0.LIZ
            java.lang.Integer r0 = r0.type
            if (r0 == 0) goto L20
            int r1 = r0.intValue()
            r0 = 18
            if (r1 != r0) goto L20
        L3a:
            java.lang.Object r0 = r5.l0
            com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel r0 = (com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel) r0
            r0.LLLF = r3
            com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment r4 = com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment.LLLII
            if (r4 == 0) goto L19
            X.0vaE r3 = new X.0vaE
            r3.<init>()
            kotlin.jvm.internal.AwS38S0010000_26 r2 = new kotlin.jvm.internal.AwS38S0010000_26
            boolean r1 = r5.z1
            r0 = 16
            r2.<init>(r1, r0)
            X.C1748720vbi.LIZIZ(r4, r3, r2)
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS112S0110000_26.invoke$4(kotlin.jvm.internal.AwS112S0110000_26, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$5(AwS112S0110000_26 awS112S0110000_26, Object obj) {
        ((C062P) obj).LIZ = new C1730750v8j((TemplateItem) awS112S0110000_26.l0, 0L, 0L, awS112S0110000_26.z1);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS112S0110000_26 awS112S0110000_26, Object obj) {
        return C1728990v5t.LIZ((C1728990v5t) obj, (RootData) awS112S0110000_26.l0, awS112S0110000_26.z1, false, null, null, null, null, 0, null, false, false, null, 4092);
    }

    public static final Object invoke$7(AwS112S0110000_26 awS112S0110000_26, Object obj) {
        return C1710230ubd.LIZ((C1710230ubd) obj, new C291001Au(((SubCashierViewModel) awS112S0110000_26.l0).vQ2()), awS112S0110000_26.z1, null, null, 48);
    }

    public static final Object invoke$8(AwS112S0110000_26 awS112S0110000_26, Object obj) {
        C23250099c.LIZLLL(((EffectEditVM) awS112S0110000_26.l0).getAssemVMScope(), null, null, new C1736630vID((EffectEditVM) awS112S0110000_26.l0, awS112S0110000_26.z1, (C1736830vIX) obj, null), 3);
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS112S0110000_26 awS112S0110000_26, Object obj) {
        C23250099c.LIZLLL(((EffectEditV2VM) awS112S0110000_26.l0).getAssemVMScope(), null, null, new C1736640vIE((EffectEditV2VM) awS112S0110000_26.l0, awS112S0110000_26.z1, (C1736840vIY) obj, null), 3);
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS112S0110000_26(com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputData r3, boolean r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            int r5 = 17 - r5
            if (r5 == 0) goto L10
            r1 = r2
            r1.z1 = r4
            r1.l0 = r3
            r0 = 1
        Lc:
            r1.<init>(r0)
            return
        L10:
            r1 = r2
            r1.l0 = r3
            r1.z1 = r4
            r0 = 1
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS112S0110000_26.<init>(com.ss.android.ugc.aweme.ecommerce.base.address.dto.CandInputData, boolean, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS112S0110000_26(C259800zU c259800zU, boolean z, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = c259800zU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS112S0110000_26(WalletAccountFinishFragment walletAccountFinishFragment, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = walletAccountFinishFragment;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS112S0110000_26(GuidePageAssem guidePageAssem, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = guidePageAssem;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS112S0110000_26(PhoneNumberVM phoneNumberVM, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = phoneNumberVM;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS112S0110000_26(AddressEditViewModel addressEditViewModel, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = addressEditViewModel;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS112S0110000_26(LocationUseBarV3ViewHolder locationUseBarV3ViewHolder, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = locationUseBarV3ViewHolder;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS112S0110000_26(AddressMapDetailViewModel2 addressMapDetailViewModel2, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = addressMapDetailViewModel2;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS112S0110000_26(SellerInfo sellerInfo, boolean z, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = sellerInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS112S0110000_26(RootData rootData, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = rootData;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS112S0110000_26(TemplateItem templateItem, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = templateItem;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS112S0110000_26(SubCashierViewModel subCashierViewModel, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = subCashierViewModel;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS112S0110000_26(EffectEditVM effectEditVM, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = effectEditVM;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS112S0110000_26(EffectEditV2VM effectEditV2VM, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = effectEditV2VM;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS112S0110000_26(IDVerifyVM iDVerifyVM, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = iDVerifyVM;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS112S0110000_26(HashMap map, HashMap<String, Object> map2, boolean z) {
        super(1);
        this.$t = z ? 1 : 0;
        this.l0 = map;
        this.z1 = map2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS112S0110000_26(Map map, Map<String, ? extends Object> map2, boolean z) {
        super(1);
        this.$t = z ? 1 : 0;
        this.l0 = map;
        this.z1 = map2;
    }
}
