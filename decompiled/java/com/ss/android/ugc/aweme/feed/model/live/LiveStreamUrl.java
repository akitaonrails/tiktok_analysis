package com.ss.android.ugc.aweme.feed.model.live;

import X.C09CT;
import X.C2188811AlT;
import X.C616570OGh;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.live.LiveCoreSDKData;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes34.dex */
public class LiveStreamUrl implements Serializable {

    @C09CT("alive_timestamp")
    public long aliveTimestamp;
    public String bindNodeRtmpUrl;

    @C09CT("candidate_resolution")
    public ArrayList<String> candidateResolution;

    @C09CT("rtmp_pull_url_params")
    public String defaultPullSdkParams;

    @C09CT("default_resolution")
    public String defaultResolution;

    @C09CT("drm_type")
    public int drmType;

    @C09CT("extra")
    public LiveStreamUrlExtra extra;

    @C09CT("flv_pull_url")
    public HashMap<String, String> flvPullUrl;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("id_str")
    public String idStr;

    @C09CT("live_core_sdk_data")
    public LiveCoreSDKData liveCoreSDKData;
    public String ngbRTMPUrl;

    @C09CT("provider")
    public int provider;

    @C09CT("flv_pull_url_params")
    public Map<String, String> pullSdkParams;

    @C09CT("rtmp_push_url_params")
    public String pushSdkParams;

    @C09CT("push_urls")
    public List<String> pushUrlList;

    @C09CT("resolution_name")
    public Map<String, String> resolutionName;

    @C09CT("rtmp_pull_url")
    public String rtmp_pull_url;

    @C09CT("rtmp_push_url")
    public String rtmp_push_url;

    @C09CT("stream_language")
    public String streamLanguage;

    @C09CT("stream_size_height")
    public long streamSizeHeight;

    @C09CT("stream_size_width")
    public long streamSizeWidth;
    public final LinkedHashMap<String, String> qualityMap = new LinkedHashMap<>();
    public final LinkedHashMap<String, String> sdkParamsMap = new LinkedHashMap<>();
    public final LinkedList<LiveCoreSDKData.Quality> qualityList = new LinkedList<>();
    public String defaultQualityName = null;
    public String lowestQualityName = null;
    public LiveCoreSDKData.Quality multiDefaultQuality = null;
    public LiveCoreSDKData.Quality multiLowestQuality = null;

    public void validateMultiPullData() {
        this.multiDefaultQuality = null;
        this.multiLowestQuality = null;
        this.qualityList.clear();
        LiveCoreSDKData liveCoreSDKData = this.liveCoreSDKData;
        if (liveCoreSDKData == null) {
            return;
        }
        if (!C616570OGh.LIZ(liveCoreSDKData.getQualityList())) {
            for (LiveCoreSDKData.Quality quality : this.liveCoreSDKData.getQualityList()) {
                this.qualityList.add(quality);
                if (this.multiLowestQuality == null) {
                    this.multiLowestQuality = quality;
                }
            }
        }
        this.multiDefaultQuality = this.liveCoreSDKData.getDefaultQuality();
        if (this.qualityList.isEmpty()) {
            LiveCoreSDKData.Quality quality2 = this.multiDefaultQuality;
            this.multiLowestQuality = quality2;
            this.qualityList.add(quality2);
        }
    }

    public String getMultiStreamData() {
        LiveCoreSDKData liveCoreSDKData = this.liveCoreSDKData;
        if (liveCoreSDKData == null || liveCoreSDKData.getPullData() == null) {
            return null;
        }
        return this.liveCoreSDKData.getPullData().getStreamData();
    }

    public String getMultiStreamDefaultPreviewQualitySdkKey() {
        LiveCoreSDKData liveCoreSDKData = this.liveCoreSDKData;
        if (liveCoreSDKData == null || liveCoreSDKData.getDefaultPreviewQuality() == null) {
            return null;
        }
        return this.liveCoreSDKData.getDefaultPreviewQuality().sdkKey;
    }

    public String getMultiStreamDefaultQualityName() {
        LiveCoreSDKData.Quality quality = this.multiDefaultQuality;
        return quality == null ? "" : quality.name;
    }

    public String getMultiStreamDefaultQualitySdkKey() {
        LiveCoreSDKData liveCoreSDKData = this.liveCoreSDKData;
        if (liveCoreSDKData == null || liveCoreSDKData.getDefaultQuality() == null) {
            return null;
        }
        return this.liveCoreSDKData.getDefaultQuality().sdkKey;
    }

    public String getMultiStreamLowestQualityName() {
        LiveCoreSDKData.Quality quality = this.multiLowestQuality;
        return quality == null ? "" : quality.name;
    }

    public String getPullSdkParams() {
        Map<String, String> map = this.pullSdkParams;
        if (map != null) {
            return map.get("ORIGIN");
        }
        return null;
    }

    public Set<String> getQualities() {
        return this.qualityMap.keySet();
    }

    public String getRtmpPushUrl() {
        String str = this.ngbRTMPUrl;
        return (str == null || str.length() == 0) ? this.rtmp_push_url : this.ngbRTMPUrl;
    }

    public boolean isMultiPullDataValid() {
        if (this.liveCoreSDKData == null) {
            return false;
        }
        validateMultiPullData();
        return !this.qualityList.isEmpty();
    }

    public void validatePullUrl() {
        String str;
        this.qualityMap.clear();
        this.sdkParamsMap.clear();
        this.defaultQualityName = null;
        this.lowestQualityName = null;
        ArrayList<String> arrayList = this.candidateResolution;
        if (arrayList != null && this.resolutionName != null && this.flvPullUrl != null) {
            for (String str2 : arrayList) {
                String str3 = this.resolutionName.get(str2);
                if (str3 != null && (str = this.flvPullUrl.get(str2)) != null) {
                    Map<String, String> map = this.pullSdkParams;
                    String str4 = map == null ? null : map.get(str2);
                    this.qualityMap.put(str3, str);
                    this.sdkParamsMap.put(str3, str4);
                    if (str2.equals(this.defaultResolution) || this.defaultQualityName == null) {
                        this.defaultQualityName = str3;
                    }
                    if (this.lowestQualityName == null) {
                        this.lowestQualityName = str3;
                    }
                }
            }
        }
        if (!this.qualityMap.isEmpty() || TextUtils.isEmpty(this.rtmp_pull_url)) {
            return;
        }
        this.defaultQualityName = "default";
        this.lowestQualityName = "default";
        this.qualityMap.put("default", this.rtmp_pull_url);
        this.sdkParamsMap.put(this.defaultQualityName, this.defaultPullSdkParams);
    }

    public boolean isPullUrlValid() {
        validatePullUrl();
        return !this.qualityMap.isEmpty();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveStreamUrl{id=");
        sbLIZ.append(this.id);
        sbLIZ.append(", idStr='");
        sbLIZ.append(this.idStr);
        sbLIZ.append('\'');
        sbLIZ.append(", provider=");
        sbLIZ.append(this.provider);
        sbLIZ.append(", rtmpPushUrl='");
        sbLIZ.append(this.rtmp_push_url);
        sbLIZ.append('\'');
        sbLIZ.append(", pushUrlList=");
        sbLIZ.append(this.pushUrlList);
        sbLIZ.append(", rtmp_pull_url='");
        sbLIZ.append(this.rtmp_pull_url);
        sbLIZ.append('\'');
        sbLIZ.append(", flvPullUrl=");
        sbLIZ.append(this.flvPullUrl);
        sbLIZ.append(", resolutionName=");
        sbLIZ.append(this.resolutionName);
        sbLIZ.append(", pullSdkParams=");
        sbLIZ.append(this.pullSdkParams);
        sbLIZ.append(", candidateResolution=");
        sbLIZ.append(this.candidateResolution);
        sbLIZ.append(", defaultResolution='");
        sbLIZ.append(this.defaultResolution);
        sbLIZ.append('\'');
        sbLIZ.append(", extra=");
        sbLIZ.append(this.extra);
        sbLIZ.append(", defaultPullSdkParams='");
        sbLIZ.append(this.defaultPullSdkParams);
        sbLIZ.append('\'');
        sbLIZ.append(", pushSdkParams='");
        sbLIZ.append(this.pushSdkParams);
        sbLIZ.append('\'');
        sbLIZ.append(", liveCoreSDKData=");
        sbLIZ.append(this.liveCoreSDKData);
        sbLIZ.append(", ngbRTMPUrl='");
        sbLIZ.append(this.ngbRTMPUrl);
        sbLIZ.append('\'');
        sbLIZ.append(", bindNodeRtmpUrl='");
        sbLIZ.append(this.bindNodeRtmpUrl);
        sbLIZ.append('\'');
        sbLIZ.append(", qualityMap=");
        sbLIZ.append(this.qualityMap);
        sbLIZ.append(", sdkParamsMap=");
        sbLIZ.append(this.sdkParamsMap);
        sbLIZ.append(", qualityList=");
        sbLIZ.append(this.qualityList);
        sbLIZ.append(", defaultQualityName='");
        sbLIZ.append(this.defaultQualityName);
        sbLIZ.append('\'');
        sbLIZ.append(", lowestQualityName='");
        sbLIZ.append(this.lowestQualityName);
        sbLIZ.append('\'');
        sbLIZ.append(", multiDefaultQuality=");
        sbLIZ.append(this.multiDefaultQuality);
        sbLIZ.append(", multiLowestQuality=");
        sbLIZ.append(this.multiLowestQuality);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public String getBindNodeRtmpUrl() {
        return this.bindNodeRtmpUrl;
    }

    public String getDefaultQuality() {
        return this.defaultQualityName;
    }

    public LiveStreamUrlExtra getExtra() {
        return this.extra;
    }

    public HashMap<String, String> getFlvPullUrl() {
        return this.flvPullUrl;
    }

    public long getId() {
        return this.id;
    }

    public String getIdStr() {
        return this.idStr;
    }

    public LiveCoreSDKData getLiveCoreSDKData() {
        return this.liveCoreSDKData;
    }

    public String getLowestQuality() {
        return this.lowestQualityName;
    }

    public int getProvider() {
        return this.provider;
    }

    public String getPushSdkParams() {
        return this.pushSdkParams;
    }

    public List<String> getPushUrlList() {
        return this.pushUrlList;
    }

    public List<LiveCoreSDKData.Quality> getQualityList() {
        return this.qualityList;
    }

    public String getRtmpPullUrl() {
        return this.rtmp_pull_url;
    }

    public void setBindNodeRtmpUrl(String str) {
        this.bindNodeRtmpUrl = str;
    }

    public void setCandidateResolution(ArrayList<String> arrayList) {
        this.candidateResolution = arrayList;
    }

    public void setDefaultResolution(String str) {
        this.defaultResolution = str;
    }

    public void setExtra(LiveStreamUrlExtra liveStreamUrlExtra) {
        this.extra = liveStreamUrlExtra;
    }

    public void setFlvPullUrl(HashMap<String, String> map) {
        this.flvPullUrl = map;
    }

    public void setId(long j) {
        this.id = j;
    }

    public void setIdStr(String str) {
        this.idStr = str;
    }

    @C09CT("live_core_sdk_data")
    public void setLiveCoreSDKData(LiveCoreSDKData liveCoreSDKData) {
        this.liveCoreSDKData = liveCoreSDKData;
    }

    public void setNgbRTMPUrl(String str) {
        this.ngbRTMPUrl = str;
    }

    public void setProvider(int i) {
        this.provider = i;
    }

    @C09CT("rtmp_push_url_params")
    public void setPushSdkParams(String str) {
        this.pushSdkParams = str;
    }

    @C09CT("push_urls")
    public void setPushUrlList(List<String> list) {
        this.pushUrlList = list;
    }

    public void setResolutionName(Map<String, String> map) {
        this.resolutionName = map;
    }

    public void setRtmpPullUrl(String str) {
        this.rtmp_pull_url = str;
    }

    public void setRtmpPushUrl(String str) {
        this.rtmp_push_url = str;
    }
}
