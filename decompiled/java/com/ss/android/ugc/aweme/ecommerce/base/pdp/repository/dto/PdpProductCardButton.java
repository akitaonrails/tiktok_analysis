package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes27.dex */
public final class PdpProductCardButton {

    @C09CT("btm_code")
    public final String btmCode;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public final Integer buttonStatus;

    @C09CT("da_info")
    public final String daInfo;

    public PdpProductCardButton() {
        this(null, null, null);
    }

    public PdpProductCardButton(Integer num, String str, String str2) {
        this.buttonStatus = num;
        this.btmCode = str;
        this.daInfo = str2;
    }
}
