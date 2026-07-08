package com.bytedance.ies.ugc.statisticlogger.btm;

import X.C09CT;
import X.C13BV;
import X.C1697810uHb;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes24.dex */
public final class BackupConfigData implements Serializable {

    @C09CT("add_compressed_chain_to_header_list")
    public final List<String> addChainToHeader;

    @C09CT("monitor_list")
    public final List<MonitorItem> monitorList;

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    @C09CT("switch")
    public final int f46switch;

    public BackupConfigData() {
        this(0, null, null, 7, null);
    }

    public BackupConfigData(int i, List<MonitorItem> list, List<String> list2) {
        this.f46switch = i;
        this.monitorList = list;
        this.addChainToHeader = list2;
    }

    public BackupConfigData(int i, List list, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 1 : i, (i2 & 2) != 0 ? C1697810uHb.LJIIJJI(new MonitorItem(Collections.singletonList("/api/v1/trade/order/create"), Collections.singletonList("order_shop[].order_sku[].bcm_chain"), null, 0, 12, null), new MonitorItem(Collections.singletonList("/api/v1/shop/cart/add_item_to_cart"), Collections.singletonList("bcm_chain"), Collections.singletonList("traffic_diversion_info"), 20000), new MonitorItem(Collections.singletonList("/api/v1/affiliate/sample/order/create"), Collections.singletonList("bcm_chain"), null, 0, 12, null), new MonitorItem(Collections.singletonList("/api/v1/shop/cart/madd_items_to_cart"), Collections.singletonList("cart_item_data[].bcm_chain"), Collections.singletonList("traffic_diversion_info"), 20000), new MonitorItem(C1697810uHb.LJIIJJI("[start]/api/v1/affiliate/sample/activity", "[end]/order/create"), Collections.singletonList("bcm_chain"), null, 0, 12, null)) : list, (i2 & 4) != 0 ? C13BV.INSTANCE : list2);
    }
}
