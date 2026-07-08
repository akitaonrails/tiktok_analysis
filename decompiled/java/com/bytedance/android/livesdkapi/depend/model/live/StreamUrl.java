package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CT;
import X.C786410Ut5;
import android.text.TextUtils;
import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class StreamUrl {
    public JSONObject LIZ;
    public transient boolean LIZIZ;
    public String LIZJ;
    public String LIZLLL;

    @C09CT("alive_timestamp")
    public long aliveTimestamp;

    @C09CT("candidate_resolution")
    public List<String> candidateResolution;

    @C09CT("complete_push_urls")
    public List<String> completePushUrls;

    @C09CT("rtmp_pull_url_params")
    public String defaultPullSdkParams;

    @C09CT("default_resolution")
    public String defaultResolution;

    @C09CT("drm_type")
    public int drmType;

    @C09CT("extra")
    public StreamUrlExtra extra;

    @C09CT("flv_pull_url")
    public Map<String, String> flvPullUrl;

    @C09CT("hls_pull_url")
    public String hlsPullUrl;

    @C09CT("hls_pull_url_map")
    public Map<String, String> hlsPullUrlMap;

    @C09CT("hls_pull_url_params")
    public String hlsPullUrlParams;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public long id;

    @C09CT("id_str")
    public String idStr;

    @C09CT("live_core_sdk_data")
    public LiveCoreSDKData liveCoreSDKData;

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
    public String rtmpPullUrl;

    @C09CT("rtmp_push_url")
    public String rtmpPushUrl;

    @C09CT("stream_app_id")
    public long streamAppId;

    @C09CT("stream_control_type")
    public Integer streamControlType;

    @C09CT("stream_delay_ms")
    public long streamDelayMs;

    @C09CT("stream_size_height")
    public long streamSizeHeight;

    @C09CT("stream_size_width")
    public long streamSizeWidth;

    @C09CT("stream_language")
    public String streamLanguage = "";
    public final LinkedHashMap<String, String> qualityMap = new LinkedHashMap<>();
    public final LinkedHashMap<String, String> sdkParamsMap = new LinkedHashMap<>();
    public final LinkedList<LiveCoreSDKData.Quality> qualityList = new LinkedList<>();
    public String LJ = null;
    public String LJFF = null;
    public LiveCoreSDKData.Quality LJI = null;
    public LiveCoreSDKData.Quality LJII = null;

    @C09CT("push_resolution")
    public String pushResolution = "";

    public final synchronized String LIZIZ() {
        JSONObject jSONObject;
        if (this.LIZIZ && (jSONObject = this.LIZ) != null) {
            this.pushSdkParams = C786410Ut5.J3(jSONObject);
            this.LIZIZ = false;
        }
        return this.pushSdkParams;
    }

    public final synchronized JSONObject LIZJ() {
        if (this.LIZ == null) {
            try {
                this.LIZ = new JSONObject(this.pushSdkParams);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return this.LIZ;
    }

    public final synchronized void LJ() {
        if (this.LIZ != null) {
            this.LIZIZ = true;
        }
    }

    public final void LJII() {
        this.LJI = null;
        this.LJII = null;
        this.qualityList.clear();
        LiveCoreSDKData liveCoreSDKData = this.liveCoreSDKData;
        if (liveCoreSDKData == null) {
            return;
        }
        if (liveCoreSDKData.getQualityList() != null && this.liveCoreSDKData.getQualityList().size() > 0) {
            for (LiveCoreSDKData.Quality quality : this.liveCoreSDKData.getQualityList()) {
                this.qualityList.add(quality);
                if (this.LJII == null) {
                    this.LJII = quality;
                }
            }
        }
        this.LJI = this.liveCoreSDKData.getDefaultQuality();
        if (this.qualityList.isEmpty()) {
            LiveCoreSDKData.Quality quality2 = this.LJI;
            this.LJII = quality2;
            this.qualityList.add(quality2);
        }
    }

    public final String LIZ() {
        JSONObject jSONObjectOptJSONObject;
        Object objOpt = null;
        try {
            JSONObject jSONObjectLIZJ = LIZJ();
            jSONObjectOptJSONObject = jSONObjectLIZJ != null ? jSONObjectLIZJ.optJSONObject("PushBase") : null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Object objOpt2 = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.opt("vCodec") : null;
        if (objOpt2 == null) {
            return "";
        }
        try {
            JSONObject jSONObjectLIZJ2 = LIZJ();
            JSONObject jSONObjectOptJSONObject2 = jSONObjectLIZJ2 != null ? jSONObjectLIZJ2.optJSONObject("PushBase") : null;
            if (jSONObjectOptJSONObject2 != null) {
                objOpt = jSONObjectOptJSONObject2.opt("vCodec");
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        return String.valueOf(objOpt);
    }

    public final String LIZLLL() {
        return TextUtils.isEmpty(this.LIZJ) ? this.rtmpPushUrl : this.LIZJ;
    }

    public final void LJIIIIZZ() {
        String str;
        this.qualityMap.clear();
        this.sdkParamsMap.clear();
        this.LJ = null;
        this.LJFF = null;
        List<String> list = this.candidateResolution;
        if (list != null && this.resolutionName != null && this.flvPullUrl != null) {
            for (String str2 : list) {
                String str3 = this.resolutionName.get(str2);
                if (str3 != null && (str = this.flvPullUrl.get(str2)) != null) {
                    Map<String, String> map = this.pullSdkParams;
                    String str4 = map == null ? null : map.get(str2);
                    this.qualityMap.put(str3, str);
                    this.sdkParamsMap.put(str3, str4);
                    if (str2.equals(this.defaultResolution) || this.LJ == null) {
                        this.LJ = str3;
                    }
                    if (this.LJFF == null) {
                        this.LJFF = str3;
                    }
                }
            }
        }
        if (!this.qualityMap.isEmpty() || TextUtils.isEmpty(this.rtmpPullUrl)) {
            return;
        }
        this.LJ = "default";
        this.LJFF = "default";
        this.qualityMap.put("default", this.rtmpPullUrl);
        this.sdkParamsMap.put(this.LJ, this.defaultPullSdkParams);
    }

    @C09CT("rtmp_push_url_params")
    public final synchronized void LJFF(String str) {
        this.pushSdkParams = str;
        this.LIZ = null;
        this.LIZIZ = false;
    }

    public final void LJI(List<LiveCoreSDKData.Quality> list) {
        this.qualityList.clear();
        this.qualityList.addAll(list);
    }
}
