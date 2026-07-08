package com.bytedance.android.livesdk.userservice;

import X.AbstractC19484711Kz;
import X.C09SO;
import X.C11NZ;
import X.C470590Icr;
import X.EnumC1846380y9E;
import X.InterfaceC1501050pAF;
import X.InterfaceC1501070pAH;
import X.InterfaceC1501130pAN;
import X.InterfaceC1501160pAQ;
import X.InterfaceC1501170pAR;
import X.InterfaceC1501300pAe;
import X.InterfaceC1501350pAj;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.model.UserAttrResponse;
import java.util.HashMap;
import webcast.api.user.UserExtra;

/* JADX INFO: loaded from: classes8.dex */
public interface UserApi {
    @InterfaceC1501160pAQ("/webcast/user/attr/")
    AbstractC19484711Kz<C470590Icr<UserAttrResponse>> getUserAttr(@InterfaceC1501070pAH("attr_types") String str);

    @InterfaceC1501160pAQ("/webcast/user/")
    @C09SO(settingKey = "live_optimization_user_serialization_type", value = EnumC1846380y9E.ROOM)
    AbstractC19484711Kz<C470590Icr<User>> queryUser(@InterfaceC1501070pAH("target_uid") long j, @InterfaceC1501070pAH("packed_level") long j2, @InterfaceC1501070pAH("sec_target_uid") String str, @InterfaceC1501070pAH("request_from_type") String str2);

    @InterfaceC1501160pAQ("/webcast/user/")
    @C09SO(settingKey = "live_optimization_user_serialization_type", value = EnumC1846380y9E.ROOM)
    AbstractC19484711Kz<C470590Icr<User>> queryUser(@InterfaceC1501070pAH("target_uid") long j, @InterfaceC1501070pAH("packed_level") long j2, @InterfaceC1501070pAH("sec_target_uid") String str, @InterfaceC1501070pAH("request_from_type") String str2, @InterfaceC1501350pAj("live-trace-tag") String str3);

    @InterfaceC1501160pAQ("/webcast/user/")
    @C09SO(settingKey = "live_optimization_user_serialization_type", value = EnumC1846380y9E.ROOM)
    AbstractC19484711Kz<C470590Icr<User>> queryUser(@InterfaceC1501070pAH("target_uid") long j, @InterfaceC1501070pAH("packed_level") long j2, @InterfaceC1501070pAH("sec_target_uid") String str, @InterfaceC1501070pAH("current_room_id") String str2, @InterfaceC1501070pAH("anchor_id") String str3, @InterfaceC1501070pAH("request_from_type") String str4);

    @InterfaceC1501160pAQ("/webcast/user/")
    @C09SO(settingKey = "live_optimization_user_serialization_type", value = EnumC1846380y9E.ROOM)
    AbstractC19484711Kz<C470590Icr<User>> queryUser(@InterfaceC1501070pAH("target_uid") long j, @InterfaceC1501070pAH("packed_level") long j2, @InterfaceC1501070pAH("sec_target_uid") String str, @InterfaceC1501070pAH("request_from_type") String str2, @InterfaceC1501070pAH("current_room_id") String str3, @InterfaceC1501070pAH("anchor_id") String str4, @InterfaceC1501350pAj("live-trace-tag") String str5);

    @InterfaceC1501160pAQ("/webcast/user/")
    @C09SO(settingKey = "live_optimization_user_serialization_type", value = EnumC1846380y9E.ROOM)
    AbstractC19484711Kz<BaseResponse<User, UserExtra>> queryUser(@InterfaceC1501130pAN HashMap<String, String> map);

    @InterfaceC1501160pAQ("/webcast/user/")
    @C09SO(settingKey = "live_optimization_user_serialization_type", value = EnumC1846380y9E.ROOM)
    AbstractC19484711Kz<BaseResponse<User, UserExtra>> queryUser(@InterfaceC1501130pAN HashMap<String, String> map, @InterfaceC1501350pAj("live-trace-tag") String str);

    @InterfaceC1501300pAe
    @InterfaceC1501170pAR("/webcast/user/attr/update/")
    C11NZ<C470590Icr<Object>> updateSwitch(@InterfaceC1501050pAF("attr_type") long j, @InterfaceC1501050pAF("value") long j2);
}
