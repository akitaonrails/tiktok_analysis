package com.bytedance.android.livesdk.chatroom.model;

import X.C09CT;
import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import java.util.List;
import webcast.data.RechargeCustomError;

/* JADX INFO: loaded from: classes8.dex */
public class EnterRoomExtra extends Extra {

    @C09CT("cache_version")
    public long cacheVersion;

    @C09CT("deprectae")
    public RechargeCustomError customErrorForGiftSetting;

    @C09CT("enter_boost_cache_version")
    public long enterBoostCacheVersion;

    @C09CT("finished_perception_msg")
    public String finishedPerceptionMsg;

    @C09CT("is_official_channel")
    public boolean isOfficialChannel;

    @C09CT("is_same_app_language")
    public boolean isSameAppLanguage;

    @C09CT("punish_info")
    public PunishEventInfo punishInfo;

    @C09CT("region")
    public String region;

    @C09CT("room_data")
    public byte[] roomData;

    @C09CT("room_diff_fields_index")
    public List<Long> roomDiffFieldsIndex;

    @C09CT("use_enter_boost_cache")
    public long useEnterBoostCache;

    @C09CT("use_room_cache")
    public boolean useRoomCache;

    @C09CT("user_restricted_mode")
    public long userRestrictedMode;

    @C09CT("smart_do_enter_token")
    public String smartDoEnterToken = "";

    @C09CT("room_base64_data")
    public String roomBase64Data = "";
}
