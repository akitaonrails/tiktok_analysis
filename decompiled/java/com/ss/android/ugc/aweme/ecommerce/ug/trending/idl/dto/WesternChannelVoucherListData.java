package com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes27.dex */
public final class WesternChannelVoucherListData implements Serializable {

    @C09CT("voucher")
    public final ChannelVoucherModule voucher;

    public WesternChannelVoucherListData() {
        this(null);
    }

    public WesternChannelVoucherListData(ChannelVoucherModule channelVoucherModule) {
        this.voucher = channelVoucherModule;
    }
}
