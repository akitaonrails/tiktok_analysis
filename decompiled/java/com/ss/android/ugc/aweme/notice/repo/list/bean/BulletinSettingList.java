package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinSettingList {

    @C09CT("settings")
    public final List<BulletinSetting> settings;

    public BulletinSettingList() {
        this(new ArrayList());
    }

    public BulletinSettingList(List<BulletinSetting> list) {
        this.settings = list;
    }
}
