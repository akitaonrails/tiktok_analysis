package com.ss.android.ugc.feed.platform.componentmanager;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class ContractMetaFcpData {

    @C09CT("avoid_componentIds")
    public final List<String> avoidRegisterComponentIds;

    @C09CT("contract_key")
    public final String contractKey;

    @C09CT("invalid_componentIds")
    public final List<String> invalidComponentIds;

    @C09CT("show_componentIds")
    public final List<String> showRegisterComponentIds;

    @C09CT("total_componentIds")
    public final List<String> totalRegisterComponentIds;

    public ContractMetaFcpData(String str, List<String> list, List<String> list2, List<String> list3, List<String> list4) {
        this.contractKey = str;
        this.showRegisterComponentIds = list;
        this.avoidRegisterComponentIds = list2;
        this.invalidComponentIds = list3;
        this.totalRegisterComponentIds = list4;
    }
}
