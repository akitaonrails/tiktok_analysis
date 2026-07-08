package com.ss.android.ugc.aweme.openauthorize.entity;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes35.dex */
public final class CheckResultInfo implements Serializable {

    @C09CT("message_starling_key")
    public final String messageStarlingKey;

    @C09CT("result_code")
    public final Integer resultCode;

    @C09CT("show_switch_account_modal")
    public final Boolean showSwitchAccountModal;

    public CheckResultInfo() {
        this(null, null, null);
    }

    public CheckResultInfo(Integer num, String str, Boolean bool) {
        this.resultCode = num;
        this.messageStarlingKey = str;
        this.showSwitchAccountModal = bool;
    }
}
