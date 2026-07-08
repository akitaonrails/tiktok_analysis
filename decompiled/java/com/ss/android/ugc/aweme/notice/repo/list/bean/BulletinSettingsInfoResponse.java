package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinSettingsInfoResponse {

    @C09CT("setting_map")
    public final Map<String, BulletinSettingList> settingMap;

    @C09CT("status_code")
    public final int statusCode;

    @C09CT("status_msg")
    public final String statusMsg;

    public BulletinSettingsInfoResponse() {
        this(-1, null, new LinkedHashMap());
    }

    public BulletinSettingsInfoResponse(int i, String str, Map<String, BulletinSettingList> map) {
        this.statusCode = i;
        this.statusMsg = str;
        this.settingMap = map;
    }
}
