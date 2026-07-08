package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import com.ss.android.ugc.aweme.tux.theme.darkmode.TuxImageModel;

/* JADX INFO: loaded from: classes10.dex */
public final class ContentTitleExtra {

    @C09CT("icon_url")
    public final TuxImageModel iconUrl;

    @C09CT("text")
    public final MissionTextStruct text;

    public ContentTitleExtra() {
        this(null, null);
    }

    public ContentTitleExtra(MissionTextStruct missionTextStruct, TuxImageModel tuxImageModel) {
        this.text = missionTextStruct;
        this.iconUrl = tuxImageModel;
    }
}
