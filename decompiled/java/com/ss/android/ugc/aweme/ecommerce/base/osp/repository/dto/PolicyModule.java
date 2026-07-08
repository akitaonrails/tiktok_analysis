package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class PolicyModule {

    @C09CT("policy_statements")
    public List<PolicyStatement> policyStatements;

    public PolicyModule() {
    }

    public PolicyModule(List<PolicyStatement> list) {
        this.policyStatements = list;
    }
}
