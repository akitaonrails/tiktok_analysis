package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class PolicyStatement {

    @C09CT("icons")
    public List<Icon> icons;

    @C09CT("module_name")
    public String moduleName;

    @C09CT("policy_statement")
    public LinkRichText statementText;

    @C09CT("title")
    public String title;

    public PolicyStatement() {
    }

    public PolicyStatement(LinkRichText linkRichText, String str, List<Icon> list, String str2) {
        this.statementText = linkRichText;
        this.title = str;
        this.icons = list;
        this.moduleName = str2;
    }
}
