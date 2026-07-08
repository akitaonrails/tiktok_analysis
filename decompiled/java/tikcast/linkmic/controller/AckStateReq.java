package tikcast.linkmic.controller;

import X.C09CT;
import tikcast.linkmic.common.StateReqCommon;

/* JADX INFO: loaded from: classes.dex */
public final class AckStateReq {

    @C09CT("client_receive_time")
    public long clientReceiveTime;

    @C09CT("common")
    public StateReqCommon common;

    @C09CT("msg_id")
    public long msgId;

    @C09CT("msg_type")
    public int msgType;
}
