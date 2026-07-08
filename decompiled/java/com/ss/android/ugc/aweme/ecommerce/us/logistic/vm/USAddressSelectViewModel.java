package com.ss.android.ugc.aweme.ecommerce.us.logistic.vm;

import X.C03FV;
import X.C123100dR;
import X.C13LP;
import X.C259800zU;
import X.C703302op;
import X.C7949038p;
import X.C799703Al;
import X.C969703qh;
import X.C969903qj;
import X.C970803qs;
import X.C973103rF;
import X.C973303rH;
import X.EnumC969803qi;
import X.InterfaceC1891350zJl;
import X.InterfaceC746802vq;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ChangeLocationData;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.DeliveryData;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticArea;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticPanelModule;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcDeliveryAddressDataModel;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class USAddressSelectViewModel extends AddressSelectViewModel {
    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectViewModel
    public final void hR2(ReachableAddress reachableAddress) {
        String str;
        Address address;
        DeliveryPanelStarter.EnterParam enterParam = this.LLILZIL;
        if (enterParam != null && Intrinsics.LJFF(enterParam.updateCache, Boolean.TRUE)) {
            C973303rH c973303rH = C973303rH.LL;
            if (reachableAddress != null && (address = reachableAddress.address) != null) {
                str = address.id;
            } else {
                str = null;
            }
            c973303rH.LIZIZ(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectViewModel
    public final void jR2(List<? extends Object> list) {
        String str;
        String str2;
        ChangeLocationData changeLocationDataLR2;
        String str3;
        LogisticPanelModule logisticPanelModule;
        LogisticArea logisticArea;
        this.LLJILLL = list;
        this.LLJIJIL = 0;
        ArrayList arrayList = new ArrayList();
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EcDeliveryAddressDataModel ecDeliveryAddressDataModel = C969903qj.LIZ;
        EcDeliveryAddressDataModel ecDeliveryAddressDataModel2 = (EcDeliveryAddressDataModel) settingsManagerLIZLLL.LJIIIIZZ("ec_delivery_address_data", EcDeliveryAddressDataModel.class, ecDeliveryAddressDataModel);
        if (ecDeliveryAddressDataModel2 != null) {
            ecDeliveryAddressDataModel = ecDeliveryAddressDataModel2;
        }
        Iterator<Integer> it2 = ecDeliveryAddressDataModel.dataTemplateList.iterator();
        while (it2.hasNext()) {
            int iIntValue = it2.next().intValue();
            ECRichText eCRichText = null;
            eCRichText = null;
            eCRichText = null;
            ECRichText eCRichText2 = null;
            String str4 = null;
            if (iIntValue == EnumC969803qi.TEMPLATE_DESCRIPTION.getTemplate()) {
                ChangeLocationData changeLocationDataLR22 = lR2();
                if (changeLocationDataLR22 != null) {
                    str = changeLocationDataLR22.description;
                } else {
                    str = null;
                }
                if (C703302op.LIZ(str) || ((changeLocationDataLR2 = lR2()) != null && changeLocationDataLR2.richDescription != null)) {
                    ChangeLocationData changeLocationDataLR23 = lR2();
                    if (changeLocationDataLR23 != null) {
                        str2 = changeLocationDataLR23.description;
                    } else {
                        str2 = null;
                    }
                    ChangeLocationData changeLocationDataLR24 = lR2();
                    if (changeLocationDataLR24 != null) {
                        eCRichText = changeLocationDataLR24.richDescription;
                    }
                    arrayList.add(new C7949038p(str2, eCRichText));
                    this.LLJIJIL++;
                }
            } else if (iIntValue == EnumC969803qi.TEMPLATE_ZIPCODE.getTemplate()) {
                ChangeLocationData changeLocationDataLR25 = lR2();
                if (changeLocationDataLR25 != null) {
                    str3 = changeLocationDataLR25.zipcodeTitle;
                } else {
                    str3 = null;
                }
                if (C123100dR.LIZ(str3)) {
                    ChangeLocationData changeLocationDataLR26 = lR2();
                    if (changeLocationDataLR26 != null) {
                        str4 = changeLocationDataLR26.zipcodePlaceHolderHint;
                    }
                    if (C123100dR.LIZ(str4)) {
                        arrayList.add(new C973103rF(this.LLIZLLLIL));
                        this.LLJIJIL++;
                    }
                }
            } else if (iIntValue == EnumC969803qi.TEMPLATE_DISTRICT.getTemplate()) {
                C259800zU c259800zU = new C259800zU();
                if ((!list.isEmpty()) && (ListProtector.get(list, 0) instanceof C03FV)) {
                    ((C03FV) ListProtector.get(list, 0)).LIZLLL(new AwS580S0100000_1(c259800zU, (C259800zU<String>) 349));
                }
                arrayList.add(new C969703qh((List) c259800zU.element));
                this.LLJIJIL++;
            } else if (iIntValue == EnumC969803qi.TEMPLATE_ADDRESS.getTemplate()) {
                if (list.size() > 1) {
                    DeliveryData deliveryData = this.LLIZ;
                    if (deliveryData != null && (logisticPanelModule = deliveryData.logisticPanelModule) != null && (logisticArea = logisticPanelModule.logisticArea) != null) {
                        eCRichText2 = logisticArea.title;
                    }
                    arrayList.add(new C799703Al(eCRichText2));
                    this.LLJIJIL++;
                    arrayList.addAll(C13LP.LJJJJIZL(list, 1));
                    arrayList.add(new C970803qs(0));
                } else {
                    arrayList.add(new InterfaceC1891350zJl() { // from class: X.03qy
                        @Override // X.InterfaceC1891350zJl
                        public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
                            return null;
                        }

                        @Override // X.InterfaceC1891350zJl
                        public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                            return Intrinsics.LJFF(interfaceC1891350zJl, this);
                        }

                        @Override // X.InterfaceC1891350zJl
                        public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
                            return Intrinsics.LJFF(interfaceC1891350zJl, this);
                        }
                    });
                }
            }
        }
        setStateImmediate(new AwS580S0100000_1(arrayList, (List<InterfaceC746802vq>) 348));
    }
}
