package com.ss.android.ugc.aweme.ecommerce.base.delivery.vm;

import X.AnonymousClass0378;
import X.AnonymousClass0488;
import X.C004I;
import X.C03CA;
import X.C03CI;
import X.C03F6;
import X.C03FC;
import X.C03FV;
import X.C13BV;
import X.C13LP;
import X.C1697810uHb;
import X.C1741890vQh;
import X.C1748720vbi;
import X.C2097908Jt;
import X.C2188811AlT;
import X.C238400w2;
import X.C756302xN;
import X.C770702zh;
import X.C807003Dg;
import X.C811603Fa;
import X.C817603Hi;
import X.C919503ib;
import X.C965303pz;
import X.C973303rH;
import X.EnumC804103Cd;
import X.EnumC966703qD;
import android.content.Context;
import android.os.Parcelable;
import android.os.SystemClock;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.address.AddressPageStarter;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ChangeOnOrderStruct;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ChangeOrderShippingAddressResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Error;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.logistic.LogisticSelectFragment;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.AppendixArea;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ChangeLocationData;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.DeliveryData;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.DeliveryRequest;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticArea;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticExpressionArea;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticPanelModule;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticsExpressionAreaExtraInfo;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.SelectAddressInfo;
import com.ss.android.ugc.aweme.ecommerce.core.ab.AddressConfig;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS3S1310000_1;
import kotlin.jvm.internal.AwS52S1000000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS5S1001000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public class DeliveryPanelViewModel extends JediViewModel<DeliveryPanelState> {
    public DeliveryPanelStarter.EnterParam LLILZIL;
    public Parcelable LLILZLL;
    public int LLIZ;
    public DeliveryData LLJI;
    public Integer LLJIJIL;
    public String LLJILJILJ;
    public String LLJILLL;
    public Integer LLJJ;
    public boolean LLJJI;
    public int LLJJJIL;
    public boolean LLJJJJJIL;
    public String LLJJL;
    public Integer LLJL;
    public Function0<Unit> LLIZLLLIL = AFwS185S0000000_1.get$arr$(34);
    public Function0<Boolean> LLJ = AFwS185S0000000_1.get$arr$(33);
    public String LLJILJIL = "continue";
    public int LLJJIII = -1;
    public final boolean LLJJIJI = true;
    public final boolean LLJJIJIIJIL = true;
    public long LLJJIJIL = -1;
    public SelectAddressInfo LLJJJ = new SelectAddressInfo(null, null, 0);
    public int LLJJJJ = 1;
    public final C817603Hi LLJJJJLIIL = new C817603Hi();
    public DeliveryRequest LLJJLIIIJLLLLLLLZ = new DeliveryRequest(null, null, null, null, null, null, null);

    public void CR2() {
        this.LLJJI = false;
    }

    public void jR2(List<Object> list) {
    }

    public void kR2(List<Object> list) {
    }

    public void lR2() {
    }

    public final String sR2() {
        DeliveryPanelStarter.EnterParam enterParam = this.LLILZIL;
        if (enterParam == null) {
            return "click_other_area";
        }
        String str = enterParam.enterMethod;
        if (str != null) {
            return str;
        }
        if (enterParam == null) {
            return "click_other_area";
        }
        Integer num = enterParam.selectTab;
        return (num == null || num.intValue() != EnumC804103Cd.PICKUP.getValue()) ? "click_other_area" : "click_pickup_location";
    }

    public final String yR2() {
        List<LogisticDTO> list;
        Parcelable parcelable = this.LLILZLL;
        boolean z = parcelable instanceof DeliveryPanelStarter.EnterParamForProductDetailPage;
        String str = CardStruct.IStatusCode.DEFAULT;
        if (z) {
            DeliveryData deliveryData = this.LLJI;
            if (deliveryData != null && (list = deliveryData.logistics) != null) {
                Iterator<LogisticDTO> it2 = list.iterator();
                while (it2.hasNext()) {
                    Map<String, String> map = it2.next().eventTrackInfo;
                    if (Intrinsics.LJFF(map != null ? map.get("is_next_day_delivery") : null, "1")) {
                        str = "1";
                    }
                }
            }
        } else if (parcelable instanceof DeliveryPanelStarter.EnterParamForOrderSubmitPage) {
            Iterator<LogisticDTO> it3 = ((DeliveryPanelStarter.EnterParamForOrderSubmitPage) parcelable).logisticList.iterator();
            while (it3.hasNext()) {
                Map<String, String> map2 = it3.next().eventTrackInfo;
                if (Intrinsics.LJFF(map2 != null ? map2.get("is_next_day_delivery") : null, "1")) {
                    str = "1";
                }
            }
        }
        return str;
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final C004I zQ2() {
        return new DeliveryPanelState(null, false, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, false, 0, null, null, null, 0, null, 0, null, null, null, null, 268435455, null);
    }

    public final boolean zR2() {
        DeliveryPanelStarter.EnterParam enterParam = this.LLILZIL;
        return Intrinsics.LJFF(enterParam != null ? enterParam.fromScene : null, "order_detail");
    }

    public boolean pR2() {
        return rR2();
    }

    public boolean rR2() {
        return this.LLJJIJI;
    }

    public boolean wR2() {
        return this.LLJJIJIIJIL;
    }

    public final void DR2(LogisticDTO logisticDTO) {
        if (!((AddressConfig) C965303pz.LIZIZ.getValue()).pdpDeliveryClickable && (this.LLILZLL instanceof DeliveryPanelStarter.EnterParamForProductDetailPage)) {
            return;
        }
        setState(new AwS580S0100000_1(logisticDTO, 76));
    }

    public void iR2(List<Object> list) {
        LogisticPanelModule logisticPanelModule;
        LogisticArea logisticArea;
        List<LogisticExpressionArea> list2;
        List<LogisticDTO> list3;
        LogisticDTO next;
        String str;
        List list4;
        if (C811603Fa.LIZ()) {
            DeliveryData deliveryData = this.LLJI;
            if (deliveryData == null || (list4 = deliveryData.logistics) == null) {
                list4 = C13BV.INSTANCE;
            }
            ((ArrayList) list).add(new C03F6(list4, null, 6));
            return;
        }
        DeliveryData deliveryData2 = this.LLJI;
        if (deliveryData2 == null || (logisticPanelModule = deliveryData2.logisticPanelModule) == null || (logisticArea = logisticPanelModule.logisticArea) == null || (list2 = logisticArea.logisticExpressionAreas) == null) {
            return;
        }
        int size = list2.size();
        int i = 0;
        for (LogisticExpressionArea logisticExpressionArea : list2) {
            int i2 = i + 1;
            if (i >= 0) {
                LogisticExpressionArea logisticExpressionArea2 = logisticExpressionArea;
                DeliveryData deliveryData3 = this.LLJI;
                if (deliveryData3 != null && (list3 = deliveryData3.logistics) != null) {
                    Iterator<LogisticDTO> it2 = list3.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            String str2 = next.logisticsServiceId;
                            LogisticsExpressionAreaExtraInfo logisticsExpressionAreaExtraInfo = logisticExpressionArea2.extraInfo;
                            if (logisticsExpressionAreaExtraInfo != null) {
                                str = logisticsExpressionAreaExtraInfo.logisticsServiceId;
                            } else {
                                str = null;
                            }
                            if (Intrinsics.LJFF(str2, str)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    LogisticDTO logisticDTO = next;
                    if (logisticDTO != null) {
                        ((ArrayList) list).add(new C03FC(logisticDTO, i, size, logisticExpressionArea2, false, false, null, 112));
                    }
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    public final boolean mR2(DeliveryPanelState deliveryPanelState) {
        Parcelable parcelable = this.LLILZLL;
        if (parcelable instanceof DeliveryPanelStarter.EnterParamForProductDetailPage) {
            DeliveryData deliveryData = this.LLJI;
            if ((deliveryData == null || !Intrinsics.LJFF(deliveryData.isDeliverySelectable, Boolean.TRUE)) && (!deliveryPanelState.canSelectLogistic(this.LLILZLL) || C03CI.LIZ())) {
                return false;
            }
            return true;
        }
        return deliveryPanelState.canSelectLogistic(parcelable);
    }

    public final void oR2(String str) {
        String str2 = str;
        DeliveryPanelStarter.EnterParam enterParam = this.LLILZIL;
        if (enterParam != null && Intrinsics.LJFF(enterParam.updateCache, Boolean.TRUE) && str2 != null) {
            C973303rH.LL.LIZIZ(str2);
        }
        IEventCenter iEventCenter = (IEventCenter) ServiceManager.get().getService(IEventCenter.class);
        if (str2 == null) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        iEventCenter.LIZ("ec_address_select", C1741890vQh.LJIIIIZZ(new AddressPageStarter.AddressEvent(str2, 3, null, null, null, null)));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticExpressionArea tR2(int r7) {
        /*
            r6 = this;
            int r1 = r6.LLIZ
            r5 = 0
            if (r1 == 0) goto L53
            r0 = 1
            if (r1 != r0) goto L4d
            android.os.Parcelable r1 = r6.LLILZLL
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter.EnterParamForOrderSubmitPage
            if (r0 == 0) goto L4d
            com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter$EnterParamForOrderSubmitPage r1 = (com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter.EnterParamForOrderSubmitPage) r1
            if (r1 == 0) goto L4d
            com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticPanelModule r4 = r1.logisticsPanelModule
            if (r4 == 0) goto L4d
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.SelectionBar> r0 = r4.selectionBar
            if (r0 == 0) goto L50
            java.util.Iterator r3 = r0.iterator()
        L1e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L4e
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.SelectionBar r0 = (com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.SelectionBar) r0
            java.lang.Integer r1 = r0.selectionType
            X.03Cd r0 = X.EnumC804103Cd.DOORSTEP
            int r0 = r0.getValue()
            if (r1 == 0) goto L1e
            int r1 = r1.intValue()
            if (r1 != r0) goto L1e
        L3b:
            com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.SelectionBar r2 = (com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.SelectionBar) r2
            if (r2 == 0) goto L50
            com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticArea r0 = r2.logisticArea
        L41:
            if (r0 == 0) goto L4d
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticExpressionArea> r0 = r0.logisticExpressionAreas
        L45:
            if (r0 == 0) goto L4d
            java.lang.Object r5 = X.C13LP.LJJJLZIJ(r7, r0)
            com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticExpressionArea r5 = (com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticExpressionArea) r5
        L4d:
            return r5
        L4e:
            r2 = r5
            goto L3b
        L50:
            com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticArea r0 = r4.logisticArea
            goto L41
        L53:
            com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.DeliveryData r0 = r6.LLJI
            if (r0 == 0) goto L4d
            com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticPanelModule r0 = r0.logisticPanelModule
            if (r0 == 0) goto L4d
            com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticArea r0 = r0.logisticArea
            if (r0 == 0) goto L4d
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticExpressionArea> r0 = r0.logisticExpressionAreas
            goto L45
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel.tR2(int):com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticExpressionArea");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01ac A[PHI: r8 r16
      0x01ac: PHI (r8v3 com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.SelectionBar) = 
      (r8v2 com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.SelectionBar)
      (r8v6 com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.SelectionBar)
     binds: [B:118:0x01aa, B:152:0x01ac] A[DONT_GENERATE, DONT_INLINE]
      0x01ac: PHI (r16v2 X.03F3) = (r16v0 X.03F3), (r16v4 X.03F3) binds: [B:118:0x01aa, B:152:0x01ac] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void uR2(android.content.Context r23) {
        /*
            Method dump skipped, instruction units count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel.uR2(android.content.Context):void");
    }

    public DeliveryPanelStarter.PackedDeliverySelectResult vR2(DeliveryPanelState deliveryPanelState) {
        boolean zLJFF;
        String str;
        Address address;
        DeliveryData deliveryData = this.LLJI;
        if (deliveryData != null) {
            zLJFF = Intrinsics.LJFF(deliveryData.isDeliverySelectable, Boolean.FALSE);
        } else {
            zLJFF = false;
        }
        if (zLJFF) {
            LogisticDTO selectedLogistic = deliveryPanelState.getSelectedLogistic();
            ReachableAddress reachableAddressLIZ = deliveryPanelState.getSelectedShipToInfo().LIZ();
            if (reachableAddressLIZ != null && (address = reachableAddressLIZ.address) != null) {
                str = address.id;
            } else {
                str = null;
            }
            DeliveryPanelStarter.PackedDeliverySelectResult packedDeliverySelectResult = new DeliveryPanelStarter.PackedDeliverySelectResult(selectedLogistic, str, deliveryPanelState.getSelectedShipToInfo().LIZIZ(), deliveryPanelState.getShippingToAddressInfo(), deliveryPanelState.getLogistics(), deliveryPanelState.getPdpLogisticModule(), Boolean.FALSE, null, null);
            if (this.LLJJIII == 1) {
                return packedDeliverySelectResult;
            }
        }
        return null;
    }

    public final void xR2(Response<ChangeOrderShippingAddressResponseData> response) {
        String str;
        ChangeOrderShippingAddressResponseData changeOrderShippingAddressResponseData = response.data;
        if (response.isCodeOK() && changeOrderShippingAddressResponseData != null) {
            Integer num = changeOrderShippingAddressResponseData.resultCode;
            if (num != null && num.intValue() != 0) {
                Integer num2 = changeOrderShippingAddressResponseData.resultCode;
                if (num2 != null && num2.intValue() == 10032406 && C770702zh.LIZ(changeOrderShippingAddressResponseData.scheme)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(changeOrderShippingAddressResponseData.scheme);
                    sbLIZ.append("&source=");
                    sbLIZ.append("addressSubmit");
                    sbLIZ.append("&actionFrom=");
                    sbLIZ.append(changeOrderShippingAddressResponseData.otpBizScene);
                    setState(new AwS52S1000000_1(C2188811AlT.LIZIZ(sbLIZ), 5));
                    return;
                }
                setState(new AwS5S1001000_1(changeOrderShippingAddressResponseData.toastMessage, 0));
                return;
            }
            List<Error> list = changeOrderShippingAddressResponseData.errors;
            if (list != null && !list.isEmpty()) {
                Error error = (Error) C13LP.LJJJLL(changeOrderShippingAddressResponseData.errors);
                if (error != null) {
                    str = error.error;
                } else {
                    str = null;
                }
                setState(new AwS5S1001000_1(str, 0));
                return;
            }
            Integer num3 = changeOrderShippingAddressResponseData.resultCode;
            String str2 = changeOrderShippingAddressResponseData.toastMessage;
            if (str2 == null) {
                str2 = "";
            }
            AnonymousClass0378.LIZ().LIZ("ec_change_address_on_order", C1741890vQh.LJIIIIZZ(new ChangeOnOrderStruct(num3, str2)));
            setState(AFwS228S0000000_1.get$arr$(53));
            return;
        }
        setState(new AwS5S1001000_1(response.message, 0));
    }

    public static List FR2(List list, C03FV c03fv) {
        if (list.isEmpty()) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ReachableAddress reachableAddress = (ReachableAddress) it2.next();
            if (Intrinsics.LJFF(reachableAddress.reachable, Boolean.TRUE)) {
                arrayList.add(reachableAddress);
            } else {
                arrayList2.add(reachableAddress);
            }
        }
        ListProtector.add(arrayList, 0, c03fv);
        if (!arrayList2.isEmpty()) {
            arrayList.add(new Object() { // from class: X.03FS
            });
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }

    public final void AR2(Context context, String str) {
        HashMap<String, Object> mapLJIIJ;
        Parcelable parcelable = this.LLILZLL;
        if (parcelable instanceof DeliveryPanelStarter.EnterParamForProductDetailPage) {
            mapLJIIJ = C1741890vQh.LJIIJ(((DeliveryPanelStarter.EnterParamForProductDetailPage) parcelable).trackParams);
        } else if (parcelable instanceof DeliveryPanelStarter.EnterParamForOrderSubmitPage) {
            mapLJIIJ = C1741890vQh.LJIIJ(((DeliveryPanelStarter.EnterParamForOrderSubmitPage) parcelable).trackParams);
        } else {
            return;
        }
        if (mapLJIIJ != null) {
            mapLJIIJ.put("start_click_time", Long.valueOf(System.currentTimeMillis()));
            C919503ib.LIZIZ(context, str, C2097908Jt.LIZJ(new Pair("trackParams", mapLJIIJ)), false).open();
        }
    }

    public final void nR2(EnumC966703qD enumC966703qD, String str) {
        this.LLJJL = str;
        setState(new AwS580S0100000_1(enumC966703qD, 75));
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0049, code lost:
    
        if (r6 == null) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0017 A[PHI: r6
      0x0017: PHI (r6v3 java.lang.Object) = (r6v2 java.lang.Object), (r6v18 java.lang.Object) binds: [B:9:0x000f, B:12:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004d A[PHI: r6
      0x004d: PHI (r6v12 java.lang.Object) = (r6v3 java.lang.Object), (r6v16 java.lang.Object) binds: [B:18:0x0021, B:33:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006f A[PHI: r6
      0x006f: PHI (r6v7 java.lang.Object) = (r6v3 java.lang.Object), (r6v12 java.lang.Object), (r6v13 java.lang.Object), (r6v16 java.lang.Object) binds: [B:16:0x001d, B:35:0x004f, B:42:0x006d, B:33:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C03FV qR2(com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.DeliveryData r7, X.C03FV r8, com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter.EnterParamForProductDetailPage r9) {
        /*
            r4 = 0
            if (r8 == 0) goto L45
            java.lang.Object r6 = r8.LIZ
            if (r6 != 0) goto Lb1
        L7:
            if (r9 == 0) goto L43
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region> r0 = r9.selectedArea
        Lb:
            boolean r0 = X.C756302xN.LIZ(r0)
            if (r0 == 0) goto L17
            if (r9 == 0) goto L47
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region> r6 = r9.selectedArea
            if (r6 != 0) goto Lb1
        L17:
            if (r9 == 0) goto L4b
            java.lang.String r3 = r9.selectedBuyerAddressId
            if (r3 == 0) goto L4b
            if (r7 == 0) goto L6f
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress> r0 = r7.addresses
            if (r0 == 0) goto L4d
            java.util.Iterator r2 = r0.iterator()
        L27:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L49
            java.lang.Object r1 = r2.next()
            com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress r1 = (com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress) r1
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address r0 = r1.address
            if (r0 == 0) goto L41
            java.lang.String r0 = r0.id
        L39:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r3)
            if (r0 == 0) goto L27
            r6 = r1
            goto L27
        L41:
            r0 = r4
            goto L39
        L43:
            r0 = r4
            goto Lb
        L45:
            r6 = r4
            goto L7
        L47:
            r6 = r4
            goto L4b
        L49:
            if (r6 != 0) goto Lb1
        L4b:
            if (r7 == 0) goto L6f
        L4d:
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress> r0 = r7.addresses
            if (r0 == 0) goto L6f
            java.util.Iterator r3 = r0.iterator()
        L55:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L6d
            java.lang.Object r2 = r3.next()
            com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress r2 = (com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress) r2
            java.lang.Boolean r1 = r2.addressDefaultSelect
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L55
            r6 = r2
            goto L55
        L6d:
            if (r6 != 0) goto Lb1
        L6f:
            X.03rH r0 = X.C973303rH.LL
            r0.getClass()
            java.lang.String r5 = X.C973303rH.LLILLJJLI
            if (r5 == 0) goto Laa
            if (r7 == 0) goto Laa
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress> r0 = r7.addresses
            if (r0 == 0) goto Laa
            java.util.Iterator r3 = r0.iterator()
        L82:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto La8
            java.lang.Object r2 = r3.next()
            com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress r2 = (com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress) r2
            com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address r0 = r2.address
            if (r0 == 0) goto La6
            java.lang.String r0 = r0.id
        L94:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r5)
            if (r0 == 0) goto L82
            java.lang.Boolean r1 = r2.reachable
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L82
            r6 = r2
            goto L82
        La6:
            r0 = r4
            goto L94
        La8:
            if (r6 != 0) goto Lb1
        Laa:
            X.03rH r0 = X.C973303rH.LL
            r0.getClass()
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region> r6 = X.C973303rH.LLILLL
        Lb1:
            X.03FV r0 = new X.03FV
            r0.<init>(r6)
            if (r7 == 0) goto Lba
            com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.DispatchTo r4 = r7.dispatchTo
        Lba:
            r0.LIZIZ = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel.qR2(com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.DeliveryData, X.03FV, com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter$EnterParamForProductDetailPage):X.03FV");
    }

    public final void BR2(long j, String str, boolean z) {
        if (this.LLJJJJJIL) {
            return;
        }
        C238400w2 c238400w2 = new C238400w2();
        c238400w2.element = SystemClock.elapsedRealtime() - j;
        C238400w2 c238400w22 = new C238400w2();
        c238400w22.element = SystemClock.elapsedRealtime() - this.LLJJIJIL;
        if (!z) {
            c238400w22.element = 0L;
            c238400w2.element = 0L;
        }
        LogisticSelectFragment logisticSelectFragment = LogisticSelectFragment.LLJJIJI;
        if (logisticSelectFragment != null) {
            C1748720vbi.LIZIZ(logisticSelectFragment, new AnonymousClass0488(), new AwS3S1310000_1(z, str, c238400w2, c238400w22, this, 0));
        }
    }

    public final void ER2(Context context, Object obj, String str, ChangeLocationData changeLocationData) {
        setState(new AwS580S0100000_1(obj, 77));
        this.LLJJJJJIL = true;
        uR2(context);
        if (C770702zh.LIZ(str)) {
            C973303rH.LL.getClass();
            C973303rH.LLILZLL = changeLocationData;
            C973303rH.LLILZIL = str;
        }
    }

    public static void hR2(DeliveryPanelStarter.EnterParamForOrderSubmitPage enterParamForOrderSubmitPage, LogisticArea logisticArea, AppendixArea appendixArea, boolean z, List list) {
        List<LogisticExpressionArea> list2;
        LogisticDTO next;
        boolean z2;
        String str;
        if (logisticArea != null && (list2 = logisticArea.logisticExpressionAreas) != null) {
            int i = 0;
            for (LogisticExpressionArea logisticExpressionArea : list2) {
                int i2 = i + 1;
                if (i >= 0) {
                    LogisticExpressionArea logisticExpressionArea2 = logisticExpressionArea;
                    if (logisticExpressionArea2.logisticsExpressionSubArea != null && (!r0.isEmpty())) {
                        ((ArrayList) list).add(new C807003Dg(logisticExpressionArea2, 2));
                    } else {
                        Iterator<LogisticDTO> it2 = enterParamForOrderSubmitPage.logisticList.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                String str2 = next.logisticsServiceId;
                                LogisticsExpressionAreaExtraInfo logisticsExpressionAreaExtraInfo = logisticExpressionArea2.extraInfo;
                                if (logisticsExpressionAreaExtraInfo != null) {
                                    str = logisticsExpressionAreaExtraInfo.logisticsServiceId;
                                } else {
                                    str = null;
                                }
                                if (Intrinsics.LJFF(str2, str)) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        LogisticDTO logisticDTO = next;
                        if (logisticDTO != null) {
                            int size = list2.size();
                            if (z && i == 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            ((ArrayList) list).add(new C03FC(logisticDTO, i, size, logisticExpressionArea2, z2, false, null, 96));
                        }
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        if (appendixArea != null && C756302xN.LIZ(appendixArea.additionalLogisticsDescriptions)) {
            ((ArrayList) list).add(new C03CA(appendixArea));
        }
    }
}
