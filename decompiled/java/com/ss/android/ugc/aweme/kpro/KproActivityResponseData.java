package com.ss.android.ugc.aweme.kpro;

import X.C09CT;
import com.ss.android.ugc.aweme.specact.api.MesEntraSetting;
import com.ss.android.ugc.aweme.specact.model.UniversalActivityVideoResource;

/* JADX INFO: loaded from: classes.dex */
public final class KproActivityResponseData {

    @C09CT("activity_video_resource")
    public final UniversalActivityVideoResource[] activityVideoResource;

    @C09CT("round_robin_interval")
    public final Long interval;

    @C09CT("notice")
    public final MesEntraSetting[] mesEntraSettings;

    @C09CT("popups")
    public final KproPopupSetting[] popupSettings;

    @C09CT("rand_time")
    public final Long randTime;

    public KproActivityResponseData() {
        this(null, null, null, null, null);
    }

    public KproActivityResponseData(Long l, Long l2, KproPopupSetting[] kproPopupSettingArr, MesEntraSetting[] mesEntraSettingArr, UniversalActivityVideoResource[] universalActivityVideoResourceArr) {
        this.interval = l;
        this.randTime = l2;
        this.popupSettings = kproPopupSettingArr;
        this.mesEntraSettings = mesEntraSettingArr;
        this.activityVideoResource = universalActivityVideoResourceArr;
    }
}
