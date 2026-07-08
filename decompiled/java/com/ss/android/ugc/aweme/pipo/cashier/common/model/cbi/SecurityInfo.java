package com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class SecurityInfo {

    @C09CT("pci_security_info")
    public final SecurityInfoItem pciSecurityInfo;

    @C09CT("retention_security_info")
    public final RetentionSecurityInfo retentionSecurityInfo;

    @C09CT("save_card_info")
    public final SaveCardInfo saveCardInfo;

    @C09CT("top_security_info")
    public final SecurityInfoItem topSecurityInfo;

    public SecurityInfo() {
        this(null, null, null, null);
    }

    public SecurityInfo(SecurityInfoItem securityInfoItem, SecurityInfoItem securityInfoItem2, SaveCardInfo saveCardInfo, RetentionSecurityInfo retentionSecurityInfo) {
        this.topSecurityInfo = securityInfoItem;
        this.pciSecurityInfo = securityInfoItem2;
        this.saveCardInfo = saveCardInfo;
        this.retentionSecurityInfo = retentionSecurityInfo;
    }
}
