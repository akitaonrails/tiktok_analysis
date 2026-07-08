package com.bytedance.android.pgc.wallet.base;

import X.C09CT;
import com.bytedance.android.livesdk.chatroom.api.SubInfo;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes.dex */
public final class PGCPolingContractStatusResult {

    @C09CT("create_contract_intent")
    public int createContractIntent;

    @C09CT("pay_channel")
    public int payChannel;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("sub_circle")
    public int subCircle;

    @C09CT("sub_info")
    public SubInfo subInfo;

    @C09CT("toast")
    public String toast = "";

    @C09CT("tpl_type")
    public int tplType;
}
