package com.ss.android.ugc.aweme.explore.api;

import X.C09CT;
import X.C1583440rJ8;
import X.C1DC8;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes32.dex */
public final class ExploreFeedRequestParams {

    @C09CT("aweme_ids")
    public final List<String> awemeIds;

    @C09CT("aweme_infos")
    public final ExploreAwemeReqInfo awemeInfos;

    @C09CT("count")
    public final int count;

    @C09CT("custom_feed_scene")
    public final Integer customFeedScene;

    @C09CT("enter_from")
    public final int enterFrom;

    @C09CT("include_preview")
    public final Boolean includePreview;

    @C09CT("interacted_ids")
    public final String interactIds;

    @C09CT("interest_id")
    public final Long interestId;

    @C09CT("mock_info")
    public final List<Map<String, String>> mockInfo;

    @C09CT("need_chunk")
    public final boolean needChunk;

    @C09CT("non_personalized")
    public final boolean nonPersonalized;

    @C09CT("pull_type")
    public final int pullType;

    @C09CT("real_time_client_info")
    public final C1DC8 realTimeClientInfo;

    @C09CT("screen_reader_enable")
    public final boolean screenReaderEnable;

    @C09CT("tab_type")
    public final int tabType;

    public final List<String> getAwemeIds() {
        return this.awemeIds;
    }

    public final ExploreAwemeReqInfo getAwemeInfos() {
        return this.awemeInfos;
    }

    public final int getCount() {
        return this.count;
    }

    public final Integer getCustomFeedScene() {
        return this.customFeedScene;
    }

    public final int getEnterFrom() {
        return this.enterFrom;
    }

    public final Boolean getIncludePreview() {
        return this.includePreview;
    }

    public final String getInteractIds() {
        return this.interactIds;
    }

    public final Long getInterestId() {
        return this.interestId;
    }

    public final List<Map<String, String>> getMockInfo() {
        return this.mockInfo;
    }

    public final boolean getNeedChunk() {
        return this.needChunk;
    }

    public final boolean getNonPersonalized() {
        return this.nonPersonalized;
    }

    public final int getPullType() {
        return this.pullType;
    }

    public final C1DC8 getRealTimeClientInfo() {
        return this.realTimeClientInfo;
    }

    public final boolean getScreenReaderEnable() {
        return this.screenReaderEnable;
    }

    public final int getTabType() {
        return this.tabType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ExploreFeedRequestParams(int i, int i2, String str, boolean z, int i3, boolean z2, int i4, boolean z3, C1DC8 c1dc8, List<? extends Map<String, String>> list, Boolean bool, Integer num, ExploreAwemeReqInfo exploreAwemeReqInfo, List<String> list2, Long l) {
        this.count = i;
        this.tabType = i2;
        this.interactIds = str;
        this.needChunk = z;
        this.pullType = i3;
        this.nonPersonalized = z2;
        this.enterFrom = i4;
        this.screenReaderEnable = z3;
        this.realTimeClientInfo = c1dc8;
        this.mockInfo = list;
        this.includePreview = bool;
        this.customFeedScene = num;
        this.awemeInfos = exploreAwemeReqInfo;
        this.awemeIds = list2;
        this.interestId = l;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ExploreFeedRequestParams(int i, int i2, String str, boolean z, int i3, boolean z2, int i4, boolean z3, C1DC8 c1dc8, List list, Boolean bool, Integer num, ExploreAwemeReqInfo exploreAwemeReqInfo, List list2, Long l, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        List list3 = list2;
        Boolean bool2 = bool;
        List list4 = list;
        C1DC8 c1dc82 = c1dc8;
        boolean z4 = z2;
        int i6 = i3;
        boolean z5 = z;
        String str2 = str;
        ExploreAwemeReqInfo exploreAwemeReqInfo2 = exploreAwemeReqInfo;
        int i7 = i2;
        Integer num2 = num;
        int i8 = (i5 & 1) != 0 ? 12 : i;
        if ((i5 & 2) != 0) {
            int i9 = C1583440rJ8.LIZ;
            i7 = C1583440rJ8.LIZ;
        }
        this(i8, i7, (i5 & 4) != 0 ? "" : str2, (i5 & 8) != 0 ? false : z5, (i5 & 16) != 0 ? 1 : i6, (i5 & 32) != 0 ? false : z4, (i5 & 64) == 0 ? i4 : 0, (i5 & 128) == 0 ? z3 : true, (i5 & 256) != 0 ? null : c1dc82, (i5 & 512) != 0 ? null : list4, (i5 & 1024) != 0 ? null : bool2, (i5 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : num2, (i5 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : exploreAwemeReqInfo2, (i5 & 8192) != 0 ? null : list3, (i5 & 16384) == 0 ? l : null);
    }
}
