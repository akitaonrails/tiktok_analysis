package com.ss.android.ugc.aweme.search.pages.result.topsearch.horizontal.ng.model;

import X.C09CT;
import X.C13BV;
import X.C2097608Jq;
import X.C651720PhK;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.poi.PoiDataStruct;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchAwemePoolEnterInnerFlowRequestNG {
    public static final C651720PhK LIZIZ = new Object() { // from class: X.0PhK
    };
    public Map<String, String> LIZ;

    @C09CT("autoSyncProgress")
    public final Boolean autoSyncProgress;

    @C09CT("awemeIDs")
    public final List<String> awemeIDs;

    @C09CT("backToEnterAweme")
    public final Boolean backToEnterAweme;

    @C09CT("containerID")
    public final String containerID;

    @C09CT("continueToPlay")
    public final Boolean continueToPlay;

    @C09CT("entryAwemeID")
    public final String entryAwemeID;

    @C09CT("is_enable_inner_flow_lynx_container")
    public final String isEnableLynxContainer;

    @C09CT("is_show_collect_banner")
    public final Boolean isShowCollectionBanner;

    @C09CT("load_empty_text")
    public final String loadEmptyText;

    @C09CT("loadMoreRequest")
    public final LoadMoreRequest loadMoreRequest;

    @C09CT("poi_data")
    public final PoiDataStruct poiData;

    @C09CT("seekTime")
    public final Long seekTime;

    @C09CT("tab_count")
    public final String tabShowCount;

    @C09CT("tab_show_name")
    public final String tabShowName;

    public SearchAwemePoolEnterInnerFlowRequestNG() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static final class LoadMoreRequest {

        @C09CT("awemeListPath")
        public final String awemeListPath;

        @C09CT("params")
        public final Map<String, String> params;

        @C09CT("url")
        public final String url;

        public LoadMoreRequest() {
            this("", C2097608Jq.LJ(), null);
        }

        public LoadMoreRequest(String str, Map<String, String> map, String str2) {
            this.url = str;
            this.params = map;
            this.awemeListPath = str2;
        }
    }

    public SearchAwemePoolEnterInnerFlowRequestNG(List<String> list, String str, Long l, Boolean bool, Boolean bool2, Boolean bool3, String str2, LoadMoreRequest loadMoreRequest, String str3, PoiDataStruct poiDataStruct, Boolean bool4, String str4, String str5, String str6) {
        this.awemeIDs = list;
        this.entryAwemeID = str;
        this.seekTime = l;
        this.continueToPlay = bool;
        this.backToEnterAweme = bool2;
        this.autoSyncProgress = bool3;
        this.containerID = str2;
        this.loadMoreRequest = loadMoreRequest;
        this.isEnableLynxContainer = str3;
        this.poiData = poiDataStruct;
        this.isShowCollectionBanner = bool4;
        this.tabShowName = str4;
        this.tabShowCount = str5;
        this.loadEmptyText = str6;
        this.LIZ = C2097608Jq.LJ();
    }

    public SearchAwemePoolEnterInnerFlowRequestNG(List list, String str, Long l, Boolean bool, Boolean bool2, Boolean bool3, String str2, LoadMoreRequest loadMoreRequest, String str3, PoiDataStruct poiDataStruct, Boolean bool4, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : bool2, (i & 32) != 0 ? null : bool3, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? null : loadMoreRequest, (i & 256) != 0 ? CardStruct.IStatusCode.DEFAULT : str3, (i & 512) != 0 ? null : poiDataStruct, (i & 1024) != 0 ? null : bool4, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : str4, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? null : str5, (i & 8192) == 0 ? str6 : null);
    }
}
