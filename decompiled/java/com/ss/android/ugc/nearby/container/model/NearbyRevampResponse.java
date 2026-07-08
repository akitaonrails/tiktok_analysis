package com.ss.android.ugc.nearby.container.model;

import X.C09CT;
import X.C1164160gOs;
import X.InterfaceC1196330hEl;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.tiktok.location_api.service.LocationRegion;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class NearbyRevampResponse extends C1164160gOs implements InterfaceC1196330hEl {
    public String LL;
    public transient long LLILLJJLI;

    @C09CT("aweme_list")
    public final List<Aweme> awemeList;

    @C09CT("cache_has_been_consumed")
    public Boolean cacheHasBeenConsumed;

    @C09CT("cache_save_time")
    public Long cacheSaveTime;

    @C09CT("data_type")
    public final String dataType;

    @C09CT("fallback_content_type")
    public final String fallbackContentType;

    @C09CT("geo_expansion_type")
    public final String geoExpansionType;

    @C09CT("entry_guidance")
    public final NearbyNoticeModel guideEntry;

    @C09CT("has_more")
    public final Integer hasMore;

    @C09CT("is_nearby_current_region")
    public final Integer isNearbyCurrentRegion;

    @C09CT("log_pb")
    public final LogPbBean logPb;

    @C09CT("manual_selection_region")
    public final LocationRegion manualRegion;

    @C09CT("stage_trace_data")
    public final String stageTraceData;

    @C09CT("tool_zone")
    public final NearbyToolZoneModel toolZone;

    public NearbyRevampResponse() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyRevampResponse)) {
            return false;
        }
        NearbyRevampResponse nearbyRevampResponse = (NearbyRevampResponse) obj;
        return Intrinsics.LJFF(this.awemeList, nearbyRevampResponse.awemeList) && Intrinsics.LJFF(this.hasMore, nearbyRevampResponse.hasMore) && Intrinsics.LJFF(this.logPb, nearbyRevampResponse.logPb) && Intrinsics.LJFF(this.guideEntry, nearbyRevampResponse.guideEntry) && Intrinsics.LJFF(this.toolZone, nearbyRevampResponse.toolZone) && Intrinsics.LJFF(this.manualRegion, nearbyRevampResponse.manualRegion) && Intrinsics.LJFF(this.cacheSaveTime, nearbyRevampResponse.cacheSaveTime) && Intrinsics.LJFF(this.cacheHasBeenConsumed, nearbyRevampResponse.cacheHasBeenConsumed) && Intrinsics.LJFF(this.geoExpansionType, nearbyRevampResponse.geoExpansionType) && Intrinsics.LJFF(this.fallbackContentType, nearbyRevampResponse.fallbackContentType) && Intrinsics.LJFF(this.isNearbyCurrentRegion, nearbyRevampResponse.isNearbyCurrentRegion) && Intrinsics.LJFF(this.dataType, nearbyRevampResponse.dataType) && Intrinsics.LJFF(this.stageTraceData, nearbyRevampResponse.stageTraceData);
    }

    public final int hashCode() {
        List<Aweme> list = this.awemeList;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.hasMore;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        LogPbBean logPbBean = this.logPb;
        int iHashCode3 = (iHashCode2 + (logPbBean == null ? 0 : logPbBean.hashCode())) * 31;
        NearbyNoticeModel nearbyNoticeModel = this.guideEntry;
        int iHashCode4 = (iHashCode3 + (nearbyNoticeModel == null ? 0 : nearbyNoticeModel.hashCode())) * 31;
        NearbyToolZoneModel nearbyToolZoneModel = this.toolZone;
        int iHashCode5 = (iHashCode4 + (nearbyToolZoneModel == null ? 0 : nearbyToolZoneModel.hashCode())) * 31;
        LocationRegion locationRegion = this.manualRegion;
        int iHashCode6 = (iHashCode5 + (locationRegion == null ? 0 : locationRegion.hashCode())) * 31;
        Long l = this.cacheSaveTime;
        int iHashCode7 = (iHashCode6 + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.cacheHasBeenConsumed;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.geoExpansionType;
        int iHashCode9 = (iHashCode8 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.fallbackContentType;
        int iHashCode10 = (iHashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.isNearbyCurrentRegion;
        int iHashCode11 = (iHashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.dataType;
        int iHashCode12 = (iHashCode11 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.stageTraceData;
        return iHashCode12 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "NearbyRevampResponse(awemeList=" + this.awemeList + ", hasMore=" + this.hasMore + ", logPb=" + this.logPb + ", guideEntry=" + this.guideEntry + ", toolZone=" + this.toolZone + ", manualRegion=" + this.manualRegion + ", cacheSaveTime=" + this.cacheSaveTime + ", cacheHasBeenConsumed=" + this.cacheHasBeenConsumed + ", geoExpansionType=" + this.geoExpansionType + ", fallbackContentType=" + this.fallbackContentType + ", isNearbyCurrentRegion=" + this.isNearbyCurrentRegion + ", dataType=" + this.dataType + ", stageTraceData=" + this.stageTraceData + ')';
    }

    @Override // X.InterfaceC1196330hEl
    public final String getPreloadFlag() {
        String str = this.LL;
        return str == null ? "normal" : str;
    }

    @Override // X.InterfaceC1196330hEl
    public final void setPreloadFlag(String str) {
        this.LL = str;
    }

    @Override // X.InterfaceC1196330hEl
    public final void setPreloadRealNetDurationMs(long j) {
        this.LLILLJJLI = j;
    }

    public static NearbyRevampResponse LJ(NearbyRevampResponse nearbyRevampResponse, List list, Long l, Boolean bool, int i) {
        Integer num;
        LogPbBean logPbBean;
        NearbyNoticeModel nearbyNoticeModel;
        NearbyToolZoneModel nearbyToolZoneModel;
        LocationRegion locationRegion;
        String str;
        String str2;
        Integer num2;
        String str3;
        Boolean bool2 = bool;
        Long l2 = l;
        List list2 = list;
        if ((i & 1) != 0) {
            list2 = nearbyRevampResponse.awemeList;
        }
        String str4 = null;
        if ((i & 2) != 0) {
            num = nearbyRevampResponse.hasMore;
        } else {
            num = null;
        }
        if ((i & 4) != 0) {
            logPbBean = nearbyRevampResponse.logPb;
        } else {
            logPbBean = null;
        }
        if ((i & 8) != 0) {
            nearbyNoticeModel = nearbyRevampResponse.guideEntry;
        } else {
            nearbyNoticeModel = null;
        }
        if ((i & 16) != 0) {
            nearbyToolZoneModel = nearbyRevampResponse.toolZone;
        } else {
            nearbyToolZoneModel = null;
        }
        if ((i & 32) != 0) {
            locationRegion = nearbyRevampResponse.manualRegion;
        } else {
            locationRegion = null;
        }
        if ((i & 64) != 0) {
            l2 = nearbyRevampResponse.cacheSaveTime;
        }
        if ((i & 128) != 0) {
            bool2 = nearbyRevampResponse.cacheHasBeenConsumed;
        }
        if ((i & 256) != 0) {
            str = nearbyRevampResponse.geoExpansionType;
        } else {
            str = null;
        }
        if ((i & 512) != 0) {
            str2 = nearbyRevampResponse.fallbackContentType;
        } else {
            str2 = null;
        }
        if ((i & 1024) != 0) {
            num2 = nearbyRevampResponse.isNearbyCurrentRegion;
        } else {
            num2 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            str3 = nearbyRevampResponse.dataType;
        } else {
            str3 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str4 = nearbyRevampResponse.stageTraceData;
        }
        nearbyRevampResponse.getClass();
        return new NearbyRevampResponse(list2, num, logPbBean, nearbyNoticeModel, nearbyToolZoneModel, locationRegion, l2, bool2, str, str2, num2, str3, str4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NearbyRevampResponse(List<? extends Aweme> list, Integer num, LogPbBean logPbBean, NearbyNoticeModel nearbyNoticeModel, NearbyToolZoneModel nearbyToolZoneModel, LocationRegion locationRegion, Long l, Boolean bool, String str, String str2, Integer num2, String str3, String str4) {
        this.awemeList = list;
        this.hasMore = num;
        this.logPb = logPbBean;
        this.guideEntry = nearbyNoticeModel;
        this.toolZone = nearbyToolZoneModel;
        this.manualRegion = locationRegion;
        this.cacheSaveTime = l;
        this.cacheHasBeenConsumed = bool;
        this.geoExpansionType = str;
        this.fallbackContentType = str2;
        this.isNearbyCurrentRegion = num2;
        this.dataType = str3;
        this.stageTraceData = str4;
        this.LLILLJJLI = -1L;
    }
}
