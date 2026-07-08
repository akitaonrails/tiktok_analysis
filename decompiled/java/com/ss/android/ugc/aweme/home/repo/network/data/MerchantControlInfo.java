package com.ss.android.ugc.aweme.home.repo.network.data;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class MerchantControlInfo {

    @C09CT("target_payment_method_id_list")
    public final List<String> methodList;

    @C09CT("pms_params")
    public final PmsParams pmsParams;

    public MerchantControlInfo() {
        this(null, null);
    }

    public MerchantControlInfo(List<String> list, PmsParams pmsParams) {
        this.methodList = list;
        this.pmsParams = pmsParams;
    }
}
