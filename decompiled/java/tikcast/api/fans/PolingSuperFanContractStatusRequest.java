package tikcast.api.fans;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class PolingSuperFanContractStatusRequest {

    @C09CT("is_sandbox")
    public boolean isSandbox;

    @C09CT("polling_type")
    public int pollingType;

    @C09CT("to_uid")
    public String toUid = "";

    @C09CT("contract_id")
    public String contractId = "";
}
