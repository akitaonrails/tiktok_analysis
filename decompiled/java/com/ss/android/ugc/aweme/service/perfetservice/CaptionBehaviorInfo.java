package com.ss.android.ugc.aweme.service.perfetservice;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes32.dex */
public final class CaptionBehaviorInfo implements Serializable {

    @C09CT("aweme_id")
    public final String awemeId;

    @C09CT("caption_display_switch_records")
    public final List<CaptionDisplaySwitchRecord> captionDisplaySwitchRecords;

    @C09CT("caption_lang_switch_records")
    public final List<CaptionLangSwitchRecord> captionLangSwitchRecords;

    @C09CT("caption_load_records")
    public final List<CaptionLoadInfo> captionLoadRecords;

    @C09CT("error_info")
    public final String extraErrorInfo;

    @C09CT("first_frame_rendered_timestamp")
    public final long firstFrameRenderedTimestamp;

    @C09CT("offline_caption_hit_lazy_load")
    public final int offlineCaptionHitLazyLoad;

    @C09CT("offline_caption_hit_preload")
    public final int offlineCaptionHitPreload;

    @C09CT("offline_captions_info")
    public final List<OfflineCaptionInfo> offlineCaptionsInfo;

    @C09CT("original_lang_name")
    public final String originalLangName;

    @C09CT("realtime_caption_count")
    public final int realtimeCaptionCount;

    public CaptionBehaviorInfo() {
        this(null, null, null, 0, 0, 0, null, null, null, null, 0L, 2047, null);
    }

    public final CaptionBehaviorInfo copy(String str, String str2, List<OfflineCaptionInfo> list, int i, int i2, int i3, List<CaptionLoadInfo> list2, List<CaptionDisplaySwitchRecord> list3, List<CaptionLangSwitchRecord> list4, String str3, long j) {
        return new CaptionBehaviorInfo(str, str2, list, i, i2, i3, list2, list3, list4, str3, j);
    }

    public CaptionBehaviorInfo(String str, String str2, List<OfflineCaptionInfo> list, int i, int i2, int i3, List<CaptionLoadInfo> list2, List<CaptionDisplaySwitchRecord> list3, List<CaptionLangSwitchRecord> list4, String str3, long j) {
        this.awemeId = str;
        this.originalLangName = str2;
        this.offlineCaptionsInfo = list;
        this.offlineCaptionHitLazyLoad = i;
        this.offlineCaptionHitPreload = i2;
        this.realtimeCaptionCount = i3;
        this.captionLoadRecords = list2;
        this.captionDisplaySwitchRecords = list3;
        this.captionLangSwitchRecords = list4;
        this.extraErrorInfo = str3;
        this.firstFrameRenderedTimestamp = j;
    }

    public CaptionBehaviorInfo(String str, String str2, List list, int i, int i2, int i3, List list2, List list3, List list4, String str3, long j, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? "" : str2, (i4 & 4) != 0 ? C13BV.INSTANCE : list, (i4 & 8) != 0 ? -1 : i, (i4 & 16) != 0 ? -1 : i2, (i4 & 32) == 0 ? i3 : -1, (i4 & 64) != 0 ? C13BV.INSTANCE : list2, (i4 & 128) != 0 ? C13BV.INSTANCE : list3, (i4 & 256) != 0 ? C13BV.INSTANCE : list4, (i4 & 512) == 0 ? str3 : "", (i4 & 1024) != 0 ? -1L : j);
    }
}
