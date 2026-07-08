package com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes27.dex */
public final class ChannelVoucherModule implements Serializable {

    @C09CT("voucher_list")
    public List<? extends Map<String, Object>> voucherList;

    public ChannelVoucherModule() {
        this(null, 1, null);
    }

    public ChannelVoucherModule(List<? extends Map<String, Object>> list) {
        this.voucherList = list;
    }

    public final void setVoucherList(List<? extends Map<String, Object>> list) {
        this.voucherList = list;
    }

    public ChannelVoucherModule(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
