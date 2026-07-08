package kotlin.jvm.internal;

import X.C09AY;
import X.C0NOB;
import X.C0OFE;
import X.C0WZX;
import X.C1322100kVc;
import X.C1708610uZ1;
import X.C1709070uZl;
import X.C1709230ua1;
import X.C1709570uaZ;
import X.C1744320vUc;
import X.C1745480vWU;
import X.C1747740va8;
import X.C1748720vbi;
import X.C1755400vmU;
import X.C1761290vvz;
import X.C1761430vwD;
import X.C1761470vwH;
import X.C1763540vzc;
import X.C1763560vze;
import X.C1774670wHZ;
import X.C1774690wHb;
import X.C19719612Di;
import X.C19EG;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C21649619o6;
import X.C2204961BRm;
import X.C786410Ut5;
import X.EnumC1709200uZy;
import X.InterfaceC1320380kSq;
import X.InterfaceC1457205n8;
import X.InterfaceC1709310ua9;
import Y.ARunnableS126S0100000_26;
import android.content.Context;
import android.os.SystemClock;
import android.widget.EditText;
import android.widget.PopupWindow;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pipo.ttpay.recharge.RechargeViewmodel;
import com.bytedance.pipo.ttpay.recharge.network.Amount;
import com.bytedance.pipo.ttpay.recharge.network.SubmitPaymentResponse;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditFragment;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.lazyload.PdpLynxItemVM;
import com.ss.android.ugc.aweme.ecommerce.base.review.gallery.GalleryViewerViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.sea.vm.SeaSkuPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.SeaSkuSpecViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.DistrictOptionView;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.DistrictOptionViewItem;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.SearchDistrictsData;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.maincashier.CashierAssem;
import com.ss.android.ugc.aweme.pipo.cashier.cashier.maincashier.CashierEnterParams;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PODaInfo;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption;
import com.ss.android.ugc.aweme.pipo.common.network.model.BaseResponse;
import com.ss.android.ugc.aweme.pipo.payments.IPipoExternalPaymentsService;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import defpackage.RegionCandHelper;
import defpackage.s7;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes27.dex */
public class AwS62S1300000_26 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS62S1300000_26 awS62S1300000_26, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C1774670wHZ c1774670wHZ = (C1774670wHZ) awS62S1300000_26.l1;
        String str = awS62S1300000_26.s0;
        String str2 = ((C1774690wHb) awS62S1300000_26.l2).LIZ;
        c1774670wHZ.getClass();
        Map<String, ? extends Object> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("did_execute", Boolean.valueOf(zBooleanValue)), new Pair("type", str));
        if (str2 != null && !a0.LJJJIL(str2)) {
            mapLJIIJ.put("biz_key", str2);
        }
        if (zBooleanValue) {
            ((C0NOB) awS62S1300000_26.l3).LIZ(1, "success", mapLJIIJ);
        } else {
            ((C0NOB) awS62S1300000_26.l3).LIZ(0, "Onboarding animation did not finish", mapLJIIJ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS62S1300000_26 awS62S1300000_26, Object obj) {
        ((RechargeViewmodel) awS62S1300000_26.l1).setState(new AwS109S1200000_26((BaseResponse) awS62S1300000_26.l2, (BaseResponse<SubmitPaymentResponse>) awS62S1300000_26.s0, (String) awS62S1300000_26.l3, (Amount) 1));
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS62S1300000_26 awS62S1300000_26, Object obj) {
        Object obj2;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("button_name", awS62S1300000_26.s0);
        laneParams.plusAssign("page_name", ((C1745480vWU) awS62S1300000_26.l1).LIZ.getPageName());
        HashMap<String, Object> map = ((C1745480vWU) awS62S1300000_26.l1).LIZ.LLJJIJIIJIL;
        Object obj3 = null;
        if (map != null) {
            obj2 = map.get("entrance_info");
        } else {
            obj2 = null;
        }
        C0OFE.LIZ("entrance_info", obj2);
        HashMap<String, Object> map2 = ((C1745480vWU) awS62S1300000_26.l1).LIZ.LLJJIJIIJIL;
        if (map2 != null) {
            obj3 = map2.get("previous_page");
        }
        C0OFE.LIZ("previous_page", obj3);
        C0OFE.LIZ("is_fullscreen", Integer.valueOf(((C1745480vWU) awS62S1300000_26.l1).LIZ.LLLLLIL ? 1 : 0));
        for (Map.Entry entry : ((Map) awS62S1300000_26.l2).entrySet()) {
            laneParams.plusAssign((String) entry.getKey(), entry.getValue());
        }
        Map<String, ? extends Object> map3 = (Map) awS62S1300000_26.l3;
        if (map3 != null) {
            laneParams.withNotCheckParams(map3);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS62S1300000_26 awS62S1300000_26, Object obj) {
        Object obj2;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("button_name", awS62S1300000_26.s0);
        laneParams.plusAssign("page_name", ((C1745480vWU) awS62S1300000_26.l1).LIZ.getPageName());
        HashMap<String, Object> map = ((C1745480vWU) awS62S1300000_26.l1).LIZ.LLJJIJIIJIL;
        Object obj3 = null;
        if (map != null) {
            obj2 = map.get("entrance_info");
        } else {
            obj2 = null;
        }
        C0OFE.LIZ("entrance_info", obj2);
        HashMap<String, Object> map2 = ((C1745480vWU) awS62S1300000_26.l1).LIZ.LLJJIJIIJIL;
        if (map2 != null) {
            obj3 = map2.get("previous_page");
        }
        C0OFE.LIZ("previous_page", obj3);
        C0OFE.LIZ("is_fullscreen", Integer.valueOf(((C1745480vWU) awS62S1300000_26.l1).LIZ.LLLLLIL ? 1 : 0));
        for (Map.Entry entry : ((Map) awS62S1300000_26.l2).entrySet()) {
            laneParams.plusAssign((String) entry.getKey(), entry.getValue());
        }
        Map<String, ? extends Object> map3 = (Map) awS62S1300000_26.l3;
        if (map3 != null) {
            laneParams.withNotCheckParams(map3);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS62S1300000_26 awS62S1300000_26, Object obj) {
        ((Boolean) obj).booleanValue();
        C1761470vwH c1761470vwH = (C1761470vwH) awS62S1300000_26.l1;
        C1761470vwH.LIZJ(c1761470vwH, awS62S1300000_26.s0, c1761470vwH.getWidth(), 0, false, 28);
        GalleryViewerViewModel galleryViewerViewModel = ((C1761430vwD) awS62S1300000_26.l2).LLILLJJLI;
        if (galleryViewerViewModel != null) {
            galleryViewerViewModel.yQ2((C1761470vwH) awS62S1300000_26.l1, true, ((C1761290vvz) awS62S1300000_26.l3).LIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS62S1300000_26 awS62S1300000_26, Object obj) {
        Object obj2;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("page_name", ((C1745480vWU) awS62S1300000_26.l1).LIZ.getPageName());
        HashMap map = (HashMap) awS62S1300000_26.l2;
        Object obj3 = null;
        if (map != null) {
            obj2 = map.get("previous_page");
        } else {
            obj2 = null;
        }
        laneParams.plusAssign("previous_page", obj2);
        HashMap map2 = (HashMap) awS62S1300000_26.l2;
        if (map2 != null) {
            obj3 = map2.get("entrance_info");
        }
        laneParams.plusAssign("entrance_info", obj3);
        laneParams.plusAssign("module_name", awS62S1300000_26.s0);
        laneParams.plusAssign("fill_type", ((C1745480vWU) awS62S1300000_26.l1).LIZ.LLLLL.type());
        Map<String, ? extends Object> map3 = (Map) awS62S1300000_26.l3;
        if (map3 != null) {
            laneParams.withNotCheckParams(map3);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$3(kotlin.jvm.internal.AwS62S1300000_26 r9, java.lang.Object r10) throws org.json.JSONException {
        /*
            java.lang.Object r0 = r9.l1
            com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.lazyload.PdpLynxItemVM r0 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.lazyload.PdpLynxItemVM) r0
            java.lang.String r1 = r0.LLILLL
            java.lang.String r0 = r9.s0
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L74
            java.lang.Object r2 = r9.l1
            com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.lazyload.PdpLynxItemVM r2 = (com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.lazyload.PdpLynxItemVM) r2
            java.lang.Object r3 = r9.l2
            X.0vmU r3 = (X.C1755400vmU) r3
            java.lang.Object r0 = r9.l3
            X.05n8 r0 = (X.InterfaceC1457205n8) r0
            X.05n7 r0 = (X.C1457105n7) r0
            org.json.JSONObject r1 = r0.LIZ
            r2.getClass()
            java.lang.String r0 = r3.LLILLJJLI
            if (r0 == 0) goto L45
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L2e
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L2e
            X.C189200o6.m2constructorimpl(r2)     // Catch: java.lang.Throwable -> L2e
            goto L3a
        L2e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r2 = new X.00Yq
            r2.<init>(r0)
            X.C189200o6.m2constructorimpl(r2)
        L3a:
            boolean r0 = X.C189200o6.m7isFailureimpl(r2)
            if (r0 == 0) goto L41
            r2 = 0
        L41:
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            if (r2 != 0) goto L4a
        L45:
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
        L4a:
            java.lang.String r0 = "lazy_load_response"
            r2.put(r0, r1)
            java.lang.String r1 = "loading_status"
            r2.remove(r1)
            java.lang.String r0 = "success"
            r2.put(r1, r0)
            java.lang.String r5 = X.C786410Ut5.J3(r2)
            java.lang.String r4 = r3.LL
            java.lang.String r6 = r3.LLILLL
            int r7 = r3.LLILZ
            X.0qPn r8 = r3.LLILZIL
            java.lang.String r9 = r3.LLILZLL
            X.0vmU r3 = new X.0vmU
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r10.getClass()
            X.0vmk r10 = new X.0vmk
            r10.<init>(r3)
        L74:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS62S1300000_26.invoke$3(kotlin.jvm.internal.AwS62S1300000_26, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$4(AwS62S1300000_26 awS62S1300000_26, Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            C1763540vzc c1763540vzc = C1763540vzc.LIZ;
            SeaSkuSpecViewModel seaSkuSpecViewModel = (SeaSkuSpecViewModel) awS62S1300000_26.l1;
            String str = seaSkuSpecViewModel.LLJI;
            if (str == null) {
                str = "";
            }
            C1763540vzc.LIZ(c1763540vzc, str, (C1322100kVc) awS62S1300000_26.l2, awS62S1300000_26.s0, new C1763560vze((Image) awS62S1300000_26.l3, InterfaceC1320380kSq.LIZJ, ViewModelKt.getViewModelScope(seaSkuSpecViewModel)), null, 48);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS62S1300000_26 awS62S1300000_26, Object obj) {
        String str;
        String str2;
        Map<String, String> mapLJ;
        C1709570uaZ c1709570uaZ;
        PaymentOption paymentOptionLJJIJIIJI;
        PODaInfo pODaInfo;
        String str3;
        int i;
        C1709070uZl c1709070uZl;
        Context context = ((CashierAssem) awS62S1300000_26.l1).getContext();
        if (context != null) {
            ((CashierAssem) awS62S1300000_26.l1).Jo().xQ2(context);
        }
        CashierEnterParams cashierEnterParams = (CashierEnterParams) awS62S1300000_26.l2;
        EnumC1709200uZy enumC1709200uZy = null;
        if (cashierEnterParams != null) {
            str = cashierEnterParams.payRequestId;
        } else {
            str = null;
        }
        InterfaceC1709310ua9 interfaceC1709310ua9LIZIZ = C1708610uZ1.LIZIZ(str);
        String str4 = awS62S1300000_26.s0;
        CashierAssem cashierAssem = (CashierAssem) awS62S1300000_26.l1;
        CashierEnterParams cashierEnterParams2 = (CashierEnterParams) awS62S1300000_26.l2;
        if (cashierEnterParams2 != null && (c1709070uZl = cashierEnterParams2.LIZIZ) != null) {
            enumC1709200uZy = c1709070uZl.LIZIZ;
        }
        cashierAssem.getClass();
        if (enumC1709200uZy != null && (i = C1709230ua1.LIZIZ[enumC1709200uZy.ordinal()]) != 1 && i == 2) {
            str2 = "pay";
        } else {
            str2 = "continue";
        }
        Boolean bool = (Boolean) awS62S1300000_26.l3;
        CashierEnterParams cashierEnterParams3 = (CashierEnterParams) awS62S1300000_26.l2;
        if (cashierEnterParams3 == null || (c1709570uaZ = cashierEnterParams3.paymentData) == null || (paymentOptionLJJIJIIJI = c1709570uaZ.LJJIJIIJI()) == null || (pODaInfo = paymentOptionLJJIJIIJI.trackInfo) == null || (str3 = pODaInfo.optionName) == null || (mapLJ = C2097908Jt.LIZJ(new Pair("payment_method", str3))) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        interfaceC1709310ua9LIZIZ.LJIIL(str4, str2, bool, mapLJ);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS62S1300000_26 awS62S1300000_26, Object obj) {
        List<C1744320vUc<District>> list;
        int size;
        PopupWindow popupWindow;
        int i;
        int i2;
        String str;
        List<DistrictOptionViewItem> list2;
        DistrictOptionViewItem districtOptionViewItem;
        SearchDistrictsData searchDistrictsData = (SearchDistrictsData) obj;
        RegionCandHelper regionCandHelper = (RegionCandHelper) awS62S1300000_26.l1;
        EditText editText = (EditText) awS62S1300000_26.l2;
        String str2 = awS62S1300000_26.s0;
        AddressEditViewModel addressEditViewModel = (AddressEditViewModel) awS62S1300000_26.l3;
        if (editText.hasFocus() || (!editText.hasFocus() && Intrinsics.LJFF(str2, "zipcode"))) {
            String string = a0.LJLIIIL(C2204961BRm.LLJILLL(editText, new C0WZX("Rjp5VQ00fMvSUX8kSQKBdA==", null))).toString();
            regionCandHelper.getClass();
            List<District> list3 = searchDistrictsData.districts;
            if (list3 != null && !list3.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                if (list3 != null) {
                    C19719612Di.LJJIIJ(list3, AFwS268S0000000_26.get$arr$(665), true);
                    for (District district : list3) {
                        DistrictOptionView districtOptionView = district.optionView;
                        if (districtOptionView == null || (list2 = districtOptionView.viewItems) == null || (districtOptionViewItem = (DistrictOptionViewItem) ListProtector.get(list2, 0)) == null || (str = districtOptionViewItem.text) == null) {
                            str = "";
                        }
                        arrayList.add(new C1744320vUc(district, str, null, "", true, null, 224));
                    }
                }
                s7 s7Var = regionCandHelper.LJ;
                if (s7Var != null) {
                    s7Var.LL = arrayList;
                    s7Var.LLILLJJLI = string;
                    s7Var.notifyDataSetChanged();
                }
                PopupWindow popupWindow2 = regionCandHelper.LIZJ;
                if (popupWindow2 != null && !popupWindow2.isShowing() && (popupWindow = regionCandHelper.LIZJ) != null) {
                    EditText editText2 = regionCandHelper.LIZIZ;
                    if (!Intrinsics.LJFF(str2, "address") && !Intrinsics.LJFF(str2, "road_name")) {
                        i = -10;
                    } else {
                        i = RegionCandHelper.LJIIJJI;
                    }
                    if (!Intrinsics.LJFF(str2, "address") && !Intrinsics.LJFF(str2, "road_name")) {
                        i2 = 0;
                    } else {
                        i2 = RegionCandHelper.LJIIL;
                    }
                    C786410Ut5.i3(popupWindow, editText2, i, i2);
                }
                EditText editText3 = regionCandHelper.LIZIZ;
                if (editText3 != null) {
                    HandlerHook.viewPost(editText3, new ARunnableS126S0100000_26(regionCandHelper, 102));
                }
                s7 s7Var2 = regionCandHelper.LJ;
                if (s7Var2 != null && (list = s7Var2.LL) != null && (size = ((ArrayList) list).size()) > 0) {
                    addressEditViewModel.LLLLJ = SystemClock.elapsedRealtime();
                    addressEditViewModel.LLLLJI = size;
                    if (!regionCandHelper.LJFF) {
                        regionCandHelper.LJFF = true;
                        AddressEditFragment addressEditFragment = AddressEditFragment.LLLII;
                        if (addressEditFragment != null) {
                            C1748720vbi.LIZIZ(addressEditFragment, new C1747740va8(), new AwS12S1001000_26(str2, size, 2));
                        }
                    }
                }
            } else {
                regionCandHelper.LIZ(addressEditViewModel, str2, false);
            }
        } else {
            int i3 = RegionCandHelper.LJIIJJI;
            regionCandHelper.LIZ(null, str2, false);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS62S1300000_26 awS62S1300000_26, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            Function1 function1 = (Function1) awS62S1300000_26.l1;
            String str = awS62S1300000_26.s0;
            Function2 function2 = (Function2) awS62S1300000_26.l2;
            C19EG c19eg = (C19EG) awS62S1300000_26.l3;
            Object objPluggableSpi$default = PluggableExtentionKt.pluggableSpi$default(IPipoExternalPaymentsService.class, false, false, false, 14, null);
            if (objPluggableSpi$default == null) {
                function1.invoke(str);
            } else {
                function2.invoke(c19eg, objPluggableSpi$default);
            }
        } else {
            ((Function1) awS62S1300000_26.l1).invoke(awS62S1300000_26.s0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS62S1300000_26 awS62S1300000_26, Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            C1763540vzc.LIZ(C1763540vzc.LIZ, ((SeaSkuPanelViewModel) awS62S1300000_26.l1).getProductId(), (C1322100kVc) awS62S1300000_26.l2, awS62S1300000_26.s0, new C1763560vze((Image) awS62S1300000_26.l3, InterfaceC1320380kSq.LIZJ, ViewModelKt.getViewModelScope((SeaSkuPanelViewModel) awS62S1300000_26.l1)), null, 48);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS62S1300000_26 awS62S1300000_26, Object obj) {
        Object obj2;
        LaneParams laneParams = (LaneParams) obj;
        laneParams.plusAssign("page_name", ((C1745480vWU) awS62S1300000_26.l1).LIZ.getPageName());
        HashMap map = (HashMap) awS62S1300000_26.l2;
        Object obj3 = null;
        if (map != null) {
            obj2 = map.get("previous_page");
        } else {
            obj2 = null;
        }
        laneParams.plusAssign("previous_page", obj2);
        HashMap map2 = (HashMap) awS62S1300000_26.l2;
        if (map2 != null) {
            obj3 = map2.get("entrance_info");
        }
        laneParams.plusAssign("entrance_info", obj3);
        laneParams.plusAssign("module_name", awS62S1300000_26.s0);
        laneParams.plusAssign("fill_type", ((C1745480vWU) awS62S1300000_26.l1).LIZ.LLLLL.type());
        Map<String, ? extends Object> map3 = (Map) awS62S1300000_26.l3;
        if (map3 != null) {
            laneParams.withNotCheckParams(map3);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS62S1300000_26(C1745480vWU c1745480vWU, C1745480vWU c1745480vWU2, HashMap<String, Object> map, String str, Map<String, ? extends Object> map2) {
        super(1);
        this.$t = map2;
        this.l1 = c1745480vWU;
        this.l2 = c1745480vWU2;
        this.s0 = map;
        this.l3 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS62S1300000_26(C1761470vwH c1761470vwH, String str, C1761430vwD c1761430vwD, C1761290vvz c1761290vvz, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1761470vwH;
        this.s0 = str;
        this.l2 = c1761430vwD;
        this.l3 = c1761290vvz;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS62S1300000_26(C1774670wHZ c1774670wHZ, String str, C1774690wHb c1774690wHb, C0NOB c0nob, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1774670wHZ;
        this.s0 = str;
        this.l2 = c1774690wHb;
        this.l3 = c0nob;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS62S1300000_26(RechargeViewmodel rechargeViewmodel, RechargeViewmodel rechargeViewmodel2, BaseResponse<SubmitPaymentResponse> baseResponse, String str, Amount amount) {
        super(1);
        this.$t = amount;
        this.l1 = rechargeViewmodel;
        this.l2 = rechargeViewmodel2;
        this.s0 = baseResponse;
        this.l3 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS62S1300000_26(PdpLynxItemVM pdpLynxItemVM, String str, C1755400vmU c1755400vmU, InterfaceC1457205n8 interfaceC1457205n8, int i) {
        super(1);
        this.$t = i;
        this.l1 = pdpLynxItemVM;
        this.s0 = str;
        this.l2 = c1755400vmU;
        this.l3 = interfaceC1457205n8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS62S1300000_26(SeaSkuPanelViewModel seaSkuPanelViewModel, C21649619o6 c21649619o6, String str, Image image, int i) {
        super(1);
        this.$t = i;
        this.l1 = seaSkuPanelViewModel;
        this.l2 = c21649619o6;
        this.s0 = str;
        this.l3 = image;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS62S1300000_26(SeaSkuSpecViewModel seaSkuSpecViewModel, C21649619o6 c21649619o6, String str, Image image, int i) {
        super(1);
        this.$t = i;
        this.l1 = seaSkuSpecViewModel;
        this.l2 = c21649619o6;
        this.s0 = str;
        this.l3 = image;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS62S1300000_26(CashierAssem cashierAssem, CashierEnterParams cashierEnterParams, String str, Boolean bool, int i) {
        super(1);
        this.$t = i;
        this.l1 = cashierAssem;
        this.l2 = cashierEnterParams;
        this.s0 = str;
        this.l3 = bool;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS62S1300000_26(String str, String str2, C1745480vWU c1745480vWU, Map<String, ? extends Object> map, Map<String, ? extends Object> map2) {
        super(1);
        this.$t = map2;
        this.s0 = str;
        this.l1 = str2;
        this.l2 = c1745480vWU;
        this.l3 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS62S1300000_26(Function1 function1, Function1<? super String, Unit> function12, String str, Function2<? super C19EG, ? super IPipoExternalPaymentsService, Unit> function2, C19EG c19eg) {
        super(1);
        this.$t = c19eg;
        this.l1 = function1;
        this.s0 = function12;
        this.l2 = str;
        this.l3 = function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS62S1300000_26(int i, RegionCandHelper regionCandHelper, EditText editText, AddressEditViewModel addressEditViewModel, String str, int i2) {
        super(1);
        this.$t = i2;
        this.l1 = regionCandHelper;
        this.l2 = editText;
        this.s0 = str;
        this.l3 = addressEditViewModel;
    }
}
