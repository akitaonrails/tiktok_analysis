package com.ss.android.ugc.aweme.ecommerce.us.logistic.vm;

import X.C03FU;
import X.C799703Al;
import X.C801703Bf;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.AppendixArea;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.DeliveryData;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticArea;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticPanelModule;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MultiLogisticsPanelInfo;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcDeliveryConfigModel;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS580S0100000_1;

/* JADX INFO: loaded from: classes2.dex */
public final class USDeliveryPanelViewModel extends DeliveryPanelViewModel {
    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel
    public final boolean rR2() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel
    public final boolean wR2() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel
    public final void CR2() {
        this.LLJJI = this.LLJJIII == 1;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel
    public final void lR2() {
        if (this.LLJJIII == 1) {
            withState(new AwS580S0100000_1((DeliveryPanelViewModel) this, 376));
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel
    public final boolean pR2() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        EcDeliveryConfigModel ecDeliveryConfigModel = C03FU.LIZ;
        EcDeliveryConfigModel ecDeliveryConfigModel2 = (EcDeliveryConfigModel) settingsManagerLIZLLL.LJIIIIZZ("ec_delivery_config", EcDeliveryConfigModel.class, ecDeliveryConfigModel);
        if (ecDeliveryConfigModel2 != null) {
            ecDeliveryConfigModel = ecDeliveryConfigModel2;
        }
        Boolean bool = ecDeliveryConfigModel.enableOpenDistrictSelectPage;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0022 A[PHI: r2
      0x0022: PHI (r2v1 java.util.List) = (r2v0 java.util.List), (r2v3 java.util.List), (r2v3 java.util.List) binds: [B:7:0x000c, B:9:0x0010, B:11:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x000e A[PHI: r2
      0x000e: PHI (r2v3 java.util.List) = (r2v0 java.util.List), (r2v4 java.util.List) binds: [B:7:0x000c, B:5:0x0008] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void iR2(java.util.List<java.lang.Object> r5) {
        /*
            r4 = this;
            X.03F6 r3 = new X.03F6
            com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.DeliveryData r0 = r4.LLJI
            if (r0 == 0) goto La
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO> r2 = r0.logistics
            if (r2 != 0) goto Le
        La:
            X.13BV r2 = X.C13BV.INSTANCE
            if (r0 == 0) goto L22
        Le:
            com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticPanelModule r0 = r0.logisticPanelModule
            if (r0 == 0) goto L22
            com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticArea r0 = r0.logisticArea
            if (r0 == 0) goto L22
            java.util.List<com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticExpressionArea> r1 = r0.logisticExpressionAreas
        L18:
            r0 = 2
            r3.<init>(r2, r1, r0)
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            r5.add(r3)
            return
        L22:
            r1 = 0
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.us.logistic.vm.USDeliveryPanelViewModel.iR2(java.util.List):void");
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel
    public final void jR2(List<Object> list) {
        AppendixArea appendixArea;
        DeliveryData deliveryData = this.LLJI;
        if (deliveryData != null) {
            LogisticPanelModule logisticPanelModule = deliveryData.logisticPanelModule;
            if (logisticPanelModule != null && (appendixArea = logisticPanelModule.appendixArea) != null) {
                ((ArrayList) list).add(new C801703Bf(appendixArea.additionalLogisticsDescriptions));
                return;
            }
            MultiLogisticsPanelInfo multiLogisticsPanelInfo = deliveryData.multiLogisticsPanelInfo;
            if (multiLogisticsPanelInfo == null) {
                return;
            }
            ((ArrayList) list).add(multiLogisticsPanelInfo);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel
    public final void kR2(List<Object> list) {
        ECRichText eCRichText;
        LogisticPanelModule logisticPanelModule;
        LogisticArea logisticArea;
        DeliveryData deliveryData = this.LLJI;
        if (deliveryData != null && (logisticPanelModule = deliveryData.logisticPanelModule) != null && (logisticArea = logisticPanelModule.logisticArea) != null) {
            eCRichText = logisticArea.title;
        } else {
            eCRichText = null;
        }
        ((ArrayList) list).add(new C799703Al(eCRichText));
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel
    public final DeliveryPanelStarter.PackedDeliverySelectResult vR2(DeliveryPanelState deliveryPanelState) {
        String str;
        Address address;
        LogisticDTO selectedLogistic = deliveryPanelState.getSelectedLogistic();
        ReachableAddress reachableAddressLIZ = deliveryPanelState.getSelectedShipToInfo().LIZ();
        if (reachableAddressLIZ != null && (address = reachableAddressLIZ.address) != null) {
            str = address.id;
        } else {
            str = null;
        }
        DeliveryPanelStarter.PackedDeliverySelectResult packedDeliverySelectResult = new DeliveryPanelStarter.PackedDeliverySelectResult(selectedLogistic, str, deliveryPanelState.getSelectedShipToInfo().LIZIZ(), deliveryPanelState.getShippingToAddressInfo(), deliveryPanelState.getLogistics(), deliveryPanelState.getPdpLogisticModule(), Boolean.FALSE, null, null);
        if (this.LLJJIII != 1) {
            return null;
        }
        return packedDeliverySelectResult;
    }
}
