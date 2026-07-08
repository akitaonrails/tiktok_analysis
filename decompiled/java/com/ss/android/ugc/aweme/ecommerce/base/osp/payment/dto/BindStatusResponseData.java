package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class BindStatusResponseData {

    @C09CT("bind_status_map")
    public final Map<String, BindStatus> bindStatusMap;

    public BindStatusResponseData(Map<String, BindStatus> map) {
        this.bindStatusMap = map;
    }
}
