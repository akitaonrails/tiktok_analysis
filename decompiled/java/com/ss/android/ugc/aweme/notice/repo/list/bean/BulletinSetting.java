package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinSetting {

    @C09CT("extra")
    public final Map<String, String> extra;

    @C09CT("setting_type")
    public final Integer settingType;

    @C09CT("setting_ui")
    public final BulletinSettingUI settingUI;

    @C09CT("value")
    public final BulletinSettingValue value;

    public BulletinSetting() {
        this(null, null, null, new LinkedHashMap());
    }

    public BulletinSetting(Integer num, BulletinSettingValue bulletinSettingValue, BulletinSettingUI bulletinSettingUI, Map<String, String> map) {
        this.settingType = num;
        this.value = bulletinSettingValue;
        this.settingUI = bulletinSettingUI;
        this.extra = map;
    }
}
