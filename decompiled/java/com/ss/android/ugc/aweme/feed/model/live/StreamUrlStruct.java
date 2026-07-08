package com.ss.android.ugc.aweme.feed.model.live;

import X.C09CT;
import X.C2188811AlT;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes34.dex */
public class StreamUrlStruct implements Serializable {

    @C09CT("alive_timestamp")
    public long aliveTimestamp;

    @C09CT("drm_type")
    public int drmType;

    @C09CT("live_core_sdk_data")
    public LiveCoreSDKData liveCoreSDKData;
    public LiveStreamUrlExtra liveStreamUrlExtra;

    @C09CT("candidate_resolution")
    public ArrayList<String> mCandidateResolutionList;

    @C09CT("default_resolution")
    public String mDefaultResolution;

    @C09CT("flv_pull_url")
    public HashMap<String, String> mFlvPullUrlMap;

    @C09CT("provider")
    public int provider;

    @C09CT("rtmp_pull_url")
    public String rtmp_pull_url;

    @C09CT("rtmp_push_url")
    public String rtmp_push_url;
    public String sdkParams = "";

    @C09CT("sid")
    public long sid;

    @C09CT("stream_language")
    public String streamLanguage;

    @C09CT("stream_size_height")
    public long streamSizeHeight;

    @C09CT("stream_size_width")
    public long streamSizeWidth;

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StreamUrlStruct{sid=");
        sbLIZ.append(this.sid);
        sbLIZ.append(", rtmp_pull_url='");
        sbLIZ.append(this.rtmp_pull_url);
        sbLIZ.append('\'');
        sbLIZ.append(", rtmp_push_url='");
        sbLIZ.append(this.rtmp_push_url);
        sbLIZ.append('\'');
        sbLIZ.append(", provider=");
        sbLIZ.append(this.provider);
        sbLIZ.append(", mFlvPullUrlMap=");
        sbLIZ.append(this.mFlvPullUrlMap);
        sbLIZ.append(", mCandidateResolutionList=");
        sbLIZ.append(this.mCandidateResolutionList);
        sbLIZ.append(", mDefaultResolution='");
        sbLIZ.append(this.mDefaultResolution);
        sbLIZ.append('\'');
        sbLIZ.append(", liveCoreSDKData=");
        sbLIZ.append(this.liveCoreSDKData);
        sbLIZ.append(", liveStreamUrlExtra=");
        sbLIZ.append(this.liveStreamUrlExtra);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
