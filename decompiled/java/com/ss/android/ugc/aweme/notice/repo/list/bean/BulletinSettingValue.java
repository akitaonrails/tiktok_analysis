package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinSettingValue {

    @C09CT("bool_value")
    public final Boolean boolValue;

    @C09CT("custom_value")
    public final Integer customValue;

    @C09CT("value_type")
    public final Integer valueType;

    public BulletinSettingValue() {
        this(null, null, null);
    }

    public BulletinSettingValue(Integer num, Boolean bool, Integer num2) {
        this.valueType = num;
        this.boolValue = bool;
        this.customValue = num2;
    }
}
