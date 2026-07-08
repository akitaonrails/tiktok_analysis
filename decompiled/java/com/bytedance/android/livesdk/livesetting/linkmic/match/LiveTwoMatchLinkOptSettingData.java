package com.bytedance.android.livesdk.livesetting.linkmic.match;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: loaded from: classes36.dex */
public final class LiveTwoMatchLinkOptSettingData {
    public static final TypeAdapter ADAPTER;

    @C09CT("cancel_invite_info_retry_duration")
    public int cancel_invite_info_retry_duration;

    @C09CT("invitee_battle_info_retry_duration")
    public int invitee_battle_info_retry_duration;

    @C09CT("invitee_open_delay")
    public int invitee_open_delay;

    @C09CT("inviter_battle_info_retry_count")
    public int inviter_battle_info_retry_count;

    @C09CT("inviter_battle_info_retry_duration")
    public int inviter_battle_info_retry_duration;

    @C09CT("inviter_open_delay")
    public int inviter_open_delay;

    @C09CT("permission_retry_count")
    public int permission_retry_count;

    @C09CT("permission_retry_duration")
    public int permission_retry_duration;

    static {
        NormalGson.singleton();
        ADAPTER = new LiveTwoMatchLinkOptSettingData_OptTypeAdapter();
    }

    public LiveTwoMatchLinkOptSettingData() {
        this(2000, 6000, 2000, LSPassThroughRecordSizeConfig.DEFAULT, LSPassThroughRecordSizeConfig.DEFAULT, 3, 3, LSPassThroughRecordSizeConfig.DEFAULT);
    }

    public LiveTwoMatchLinkOptSettingData(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.invitee_open_delay = i;
        this.inviter_open_delay = i2;
        this.inviter_battle_info_retry_duration = i3;
        this.invitee_battle_info_retry_duration = i4;
        this.cancel_invite_info_retry_duration = i5;
        this.inviter_battle_info_retry_count = i6;
        this.permission_retry_count = i7;
        this.permission_retry_duration = i8;
    }
}
