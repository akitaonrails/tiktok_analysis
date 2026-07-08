package com.bytedance.android.livesdk.livesetting.privilege;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class UserLevelGiftConfig {
    public static final TypeAdapter ADAPTER = new UserLevelGiftConfig_OptTypeAdapter(NormalGson.singleton());

    @C09CT("grade_gift_list")
    public List<UserLevelGift> gradeGiftConfigList;

    public UserLevelGiftConfig() {
        this(null);
    }

    public UserLevelGiftConfig(List<UserLevelGift> list) {
        this.gradeGiftConfigList = list;
    }
}
