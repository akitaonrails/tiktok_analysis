package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class PrivacyPopup {

    @C09CT("consent_infos")
    public List<ConsentInfo> consentInfos;

    @C09CT("da_info")
    public String daInfo;

    @C09CT("popup")
    public PrivacyDialog popup;

    public PrivacyPopup() {
    }

    public PrivacyPopup(PrivacyDialog privacyDialog, List<ConsentInfo> list, String str) {
        this.popup = privacyDialog;
        this.consentInfos = list;
        this.daInfo = str;
    }
}
