package com.ss.android.ugc.aweme.live.settings;

import X.C09CT;
import com.google.gson.n;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class LiveSDKSettingData {

    @C09CT("delete_keys")
    public final List<String> deletedKeys;

    @C09CT("tikcast_data")
    public n fullSettings;

    @C09CT("webcast_data")
    public n incrementSettings;

    @C09CT("setting_desc")
    public final String settingDesc;

    @C09CT("setting_version")
    public final String settingVersion;

    @C09CT("settings")
    public n settings;

    @C09CT("update_method")
    public final String updateType;

    public LiveSDKSettingData(n nVar, String str, String str2, String str3, List<String> list, n nVar2, n nVar3) {
        this.settings = nVar;
        this.settingDesc = str;
        this.settingVersion = str2;
        this.updateType = str3;
        this.deletedKeys = list;
        this.incrementSettings = nVar2;
        this.fullSettings = nVar3;
    }
}
