package webcast.data;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes8.dex */
public final class CurrentSuperFanContract {

    @C09CT("contract_action_info")
    public SuperFanContractActionInfo contractActionInfo;

    @C09CT("contract_exchange_type")
    public int contractExchangeType;

    @C09CT("contract_id")
    public String contractId = "";

    @C09CT("current_pkg")
    public SuperFanPackage currentPkg;

    @C09CT("expire_time")
    public long expireTime;

    @C09CT("is_gift_super_fan")
    public long isGiftSuperFan;

    @C09CT("pay_status")
    public int payStatus;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;
}
