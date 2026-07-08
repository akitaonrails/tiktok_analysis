package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class BillCpfInfo {

    @C09CT("elems")
    public List<CpfElem> cpfElems;

    @C09CT("rsa_pub_key")
    public String rsaPubKey;

    public BillCpfInfo() {
    }

    public BillCpfInfo(String str, List<CpfElem> list) {
        this.rsaPubKey = str;
        this.cpfElems = list;
    }
}
