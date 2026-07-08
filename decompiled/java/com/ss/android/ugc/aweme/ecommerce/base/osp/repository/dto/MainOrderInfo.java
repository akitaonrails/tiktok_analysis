package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticPanelModule;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.WarehouseTag;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class MainOrderInfo {
    public int LIZ;
    public int LIZIZ;

    @C09CT("available_info")
    public MainOrderAvailableInfo availableInfo;

    @C09CT("free_shipping_addon_panel")
    public AddonPanelInfo freeShippingAddonPanel;

    @C09CT("is_pudo_logistics_service_selected")
    public Boolean isPudoLogisticsServiceSelected;

    @C09CT("logistics")
    public List<LogisticDTO> logistics;

    @C09CT("logistic_expression_module")
    public LogisticPanelModule logisticsExpressionModule;

    @C09CT("logistic_panel_module")
    public LogisticPanelModule logisticsPanelModule;

    @C09CT("main_order_id")
    public String mainOrderId;

    @C09CT("multi_logistics_panel_info")
    public MultiLogisticsPanelInfo multiLogisticsPanelInfo;

    @C09CT("packed_skus")
    public List<PackedSku> packedSkus;

    @C09CT("reachable")
    public Boolean reachable;

    @C09CT("selected_logistics_service_id")
    public String selectedLogisticsServiceId;

    @C09CT("selected_pudo_id")
    public String selectedPudoId;

    @C09CT("logistics_title")
    public String shippingTitle;

    @C09CT("unreachable_reason")
    public String unreachableReason;

    @C09CT("warehouse_id")
    public String warehouseId;

    @C09CT("warehouse_tag")
    public WarehouseTag warehouseTag;

    public MainOrderInfo() {
    }

    public static MainOrderInfo LIZ(String str, List list, Boolean bool, String str2, List list2, String str3, MultiLogisticsPanelInfo multiLogisticsPanelInfo, WarehouseTag warehouseTag, String str4, String str5, MainOrderAvailableInfo mainOrderAvailableInfo, LogisticPanelModule logisticPanelModule, LogisticPanelModule logisticPanelModule2, AddonPanelInfo addonPanelInfo, Boolean bool2, String str6) {
        return new MainOrderInfo(str, list, bool, str2, list2, str3, multiLogisticsPanelInfo, warehouseTag, str4, str5, mainOrderAvailableInfo, logisticPanelModule, logisticPanelModule2, addonPanelInfo, bool2, str6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MainOrderInfo)) {
            return false;
        }
        MainOrderInfo mainOrderInfo = (MainOrderInfo) obj;
        return Intrinsics.LJFF(this.warehouseId, mainOrderInfo.warehouseId) && Intrinsics.LJFF(this.packedSkus, mainOrderInfo.packedSkus) && Intrinsics.LJFF(this.reachable, mainOrderInfo.reachable) && Intrinsics.LJFF(this.unreachableReason, mainOrderInfo.unreachableReason) && Intrinsics.LJFF(this.logistics, mainOrderInfo.logistics) && Intrinsics.LJFF(this.selectedLogisticsServiceId, mainOrderInfo.selectedLogisticsServiceId) && Intrinsics.LJFF(this.multiLogisticsPanelInfo, mainOrderInfo.multiLogisticsPanelInfo) && Intrinsics.LJFF(this.warehouseTag, mainOrderInfo.warehouseTag) && Intrinsics.LJFF(this.shippingTitle, mainOrderInfo.shippingTitle) && Intrinsics.LJFF(this.mainOrderId, mainOrderInfo.mainOrderId) && Intrinsics.LJFF(this.availableInfo, mainOrderInfo.availableInfo) && Intrinsics.LJFF(this.logisticsExpressionModule, mainOrderInfo.logisticsExpressionModule) && Intrinsics.LJFF(this.logisticsPanelModule, mainOrderInfo.logisticsPanelModule) && Intrinsics.LJFF(this.freeShippingAddonPanel, mainOrderInfo.freeShippingAddonPanel) && Intrinsics.LJFF(this.isPudoLogisticsServiceSelected, mainOrderInfo.isPudoLogisticsServiceSelected) && Intrinsics.LJFF(this.selectedPudoId, mainOrderInfo.selectedPudoId);
    }

    public MainOrderInfo(String str, List<PackedSku> list, Boolean bool, String str2, List<LogisticDTO> list2, String str3, MultiLogisticsPanelInfo multiLogisticsPanelInfo, WarehouseTag warehouseTag, String str4, String str5, MainOrderAvailableInfo mainOrderAvailableInfo, LogisticPanelModule logisticPanelModule, LogisticPanelModule logisticPanelModule2, AddonPanelInfo addonPanelInfo, Boolean bool2, String str6) {
        this.warehouseId = str;
        this.packedSkus = list;
        this.reachable = bool;
        this.unreachableReason = str2;
        this.logistics = list2;
        this.selectedLogisticsServiceId = str3;
        this.multiLogisticsPanelInfo = multiLogisticsPanelInfo;
        this.warehouseTag = warehouseTag;
        this.shippingTitle = str4;
        this.mainOrderId = str5;
        this.availableInfo = mainOrderAvailableInfo;
        this.logisticsExpressionModule = logisticPanelModule;
        this.logisticsPanelModule = logisticPanelModule2;
        this.freeShippingAddonPanel = addonPanelInfo;
        this.isPudoLogisticsServiceSelected = bool2;
        this.selectedPudoId = str6;
        this.LIZIZ = -1;
    }
}
