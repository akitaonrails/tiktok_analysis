package com.bytedance.android.livesdk.function;

import X.C470590Icr;
import X.InterfaceC1364105Vn;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import webcast.api.room.CheckMuteRuleResponse;
import webcast.api.room.MuteRuleAddResponse;
import webcast.api.room.MuteRuleDeleteResponse;
import webcast.api.room.MuteRuleListResponse;

/* JADX INFO: loaded from: classes13.dex */
public interface MuteRuleApi {
    @InterfaceC1501170pAR("/webcast/room/mute_rule/add/")
    Object addMuteRule(@InterfaceC1501070pAH("anchor_id") long j, @InterfaceC1501070pAH("room_id") long j2, @InterfaceC1501070pAH("content") String str, @InterfaceC1501070pAH("mute_rule_id") long j3, @InterfaceC1501070pAH("duration_second") long j4, InterfaceC1364105Vn<? super C470590Icr<MuteRuleAddResponse.ResponseData>> interfaceC1364105Vn);

    @InterfaceC1501170pAR("/webcast/room/mute_rule/delete/")
    Object deleteMuteRule(@InterfaceC1501070pAH("anchor_id") long j, @InterfaceC1501070pAH("room_id") long j2, @InterfaceC1501070pAH("mute_rule_id") long j3, InterfaceC1364105Vn<? super C470590Icr<MuteRuleDeleteResponse>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/webcast/room/mute_rule/list/")
    Object getMuteRule(@InterfaceC1501070pAH("anchor_id") long j, @InterfaceC1501070pAH("room_id") long j2, InterfaceC1364105Vn<? super C470590Icr<MuteRuleListResponse.ResponseData>> interfaceC1364105Vn);

    @InterfaceC1501160pAQ("/webcast/room/mute_rule/check/")
    Object muteRuleCheck(@InterfaceC1501070pAH("anchor_id") long j, @InterfaceC1501070pAH("room_id") long j2, @InterfaceC1501070pAH("content") String str, InterfaceC1364105Vn<? super C470590Icr<CheckMuteRuleResponse.ResponseData>> interfaceC1364105Vn);
}
