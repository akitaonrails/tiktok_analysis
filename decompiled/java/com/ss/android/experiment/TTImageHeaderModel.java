package com.ss.android.experiment;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public final class TTImageHeaderModel {

    @C09CT("batteryCheckTimeGap")
    public final Long batteryCheckTimeGap;

    @C09CT("enable")
    public final Boolean enable;

    @C09CT("h5_anim_format")
    public final String h5_anim_format;

    @C09CT("h5_static_format")
    public final String h5_static_format;

    @C09CT("lynx_anim_format")
    public final String lynx_anim_format;

    @C09CT("lynx_static_format")
    public final String lynx_static_format;

    @C09CT("memoryCheckTimeGap")
    public final Long memoryCheckTimeGap;

    @C09CT("native_anim_format")
    public final String native_anim_format;

    @C09CT("native_static_format")
    public final String native_static_format;

    @C09CT("networkQualityCheckTimeGap")
    public final Long networkQualityCheckTimeGap;

    @C09CT("pathList")
    public final List<String> pathList;

    public TTImageHeaderModel() {
        this(Boolean.FALSE, null, null, null, null, null, null, null, null, null, null);
    }

    public TTImageHeaderModel(Boolean bool, Long l, Long l2, Long l3, String str, String str2, String str3, String str4, String str5, String str6, List<String> list) {
        this.enable = bool;
        this.batteryCheckTimeGap = l;
        this.networkQualityCheckTimeGap = l2;
        this.memoryCheckTimeGap = l3;
        this.lynx_static_format = str;
        this.lynx_anim_format = str2;
        this.native_static_format = str3;
        this.native_anim_format = str4;
        this.h5_static_format = str5;
        this.h5_anim_format = str6;
        this.pathList = list;
    }
}
