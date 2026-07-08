package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class BindInfoResponseData {

    @C09CT("bind_info_list")
    public final List<BindInfoItem> bindInfoList;

    @C09CT("pipo_error_action")
    public final String pipoErrorAction;

    public BindInfoResponseData(List<BindInfoItem> list, String str) {
        this.bindInfoList = list;
        this.pipoErrorAction = str;
    }
}
