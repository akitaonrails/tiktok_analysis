package com.ss.android.ugc.playerkit.simapicommon.model;

import X.C09CT;
import X.C13BV;
import X.C1473210oRL;
import X.C1474810oTv;
import X.C1475930oVj;
import X.C1479380obI;
import X.C2188811AlT;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.k;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class SimVideo implements Serializable {
    public SimVideoUrlModel LL;
    public SimVideoUrlModel LLILLJJLI;
    public boolean LLILLL;
    public String LLILZ;
    public String LLILZIL = "";
    public Boolean LLILZLL;
    public Object LLIZ;
    public C1473210oRL LLIZLLLIL;

    @C09CT("bit_rate_audio")
    public List<SimAudioBitrate> audioBitrate;

    @C09CT("bit_rate")
    public List<SimBitRate> bitRate;

    @C09CT("cdn_url_expired")
    public long cdnUrlExpired;

    @C09CT("cla_info")
    public C1479380obI claInfo;

    @C09CT("video_model")
    public String dVideoModel;

    @C09CT("video_model_v2")
    public Map<String, Object> dVideoModelV2;

    @C09CT("did_profile_labels")
    public String didProfileLabels;

    @C09CT("token_auth")
    public SimPlayTokenAuth drmTokenAuth;

    @C09CT("is_drm_source")
    public boolean enableIntertrustDrm;

    @C09CT("play_addr_h264")
    public SimVideoUrlModel h264PlayAddr;

    @C09CT("height")
    public int height;

    @C09CT("is_bytevc1")
    public Integer isBytevc1;

    @C09CT("is_long_video")
    public Integer isLongVideo;

    @C09CT("meta")
    public String meta;

    @C09CT("need_set_token")
    public boolean needSetCookie;
    public Object origin;

    @C09CT("aweme_born_time")
    public long pb2AwemeMillis;

    @C09CT("play_addr_lowbr")
    public SimUrlModel playAddrLowbr;

    @C09CT("ratio")
    public String ratio;

    @C09CT("trans_params")
    public String transParams;

    @C09CT("vid_profile_labels")
    public String vidProfileLabels;

    @C09CT("duration")
    public int videoLength;

    @C09CT("big_thumbs")
    public List<k> videoThumbs;

    @C09CT("width")
    public int width;

    public boolean isLowBr() {
        return false;
    }

    public final void LIZIZ() {
        SimVideoUrlModel simVideoUrlModel = this.LLILLJJLI;
        if (simVideoUrlModel != null) {
            List<SimBitRate> bitRate = simVideoUrlModel.getBitRate();
            List<SimBitRate> list = this.bitRate;
            if (bitRate != list) {
                this.LLILLJJLI.setBitRate(list);
                this.LLILLJJLI.setAudioBitRate(this.audioBitrate);
                this.LLILLJJLI.setDuration(this.videoLength);
                this.LLILLJJLI.setCodecType(1);
                this.LLILLJJLI.setMeta(this.meta);
                this.LLILLJJLI.setFormat(this.LLILZ);
                this.LLILLJJLI.setDashVideoModelStr(getVideoModelStr());
                this.LLILLJJLI.setDashVideoModelMap(getVideoModelMap());
                this.LLILLJJLI.setDidProfileLabels(getDidProfileLabels());
                this.LLILLJJLI.setVidProfileLabels(getVidProfileLabels());
                this.LLILLJJLI.setTransParams(getTransParams());
            }
        }
        SimVideoUrlModel simVideoUrlModel2 = this.LL;
        if (simVideoUrlModel2 != null) {
            List<SimBitRate> bitRate2 = simVideoUrlModel2.getBitRate();
            List<SimBitRate> list2 = this.bitRate;
            if (bitRate2 != list2) {
                this.LL.setBitRate(list2);
                this.LL.setAudioBitRate(this.audioBitrate);
                this.LL.setDuration(this.videoLength);
                this.LL.setCodecType(0);
                this.LL.setMeta(this.meta);
                this.LL.setFormat(this.LLILZ);
                this.LL.setDashVideoModelStr(getVideoModelStr());
                this.LL.setDashVideoModelMap(getVideoModelMap());
                this.LL.setDidProfileLabels(getDidProfileLabels());
                this.LL.setVidProfileLabels(getVidProfileLabels());
                this.LL.setTransParams(getTransParams());
            }
        }
    }

    public C1473210oRL getMetaInfo() {
        C1473210oRL c1473210oRL = this.LLIZLLLIL;
        if (c1473210oRL != null) {
            return c1473210oRL;
        }
        C1473210oRL metaInfo = getMetaInfo(this);
        this.LLIZLLLIL = metaInfo;
        return metaInfo;
    }

    public int getVidPlayVersion() {
        SimPlayTokenAuth simPlayTokenAuth = this.drmTokenAuth;
        if (simPlayTokenAuth != null && simPlayTokenAuth.isValid()) {
            return this.drmTokenAuth.getVersion();
        }
        if (getMetaInfo().getVidToken() != null) {
            return getMetaInfo().getVidToken().version;
        }
        return 1;
    }

    public String getVideoId() {
        SimPlayTokenAuth simPlayTokenAuth = this.drmTokenAuth;
        if (simPlayTokenAuth != null && simPlayTokenAuth.isValid()) {
            return this.drmTokenAuth.getVid();
        }
        if (getMetaInfo().getVidToken() != null) {
            return getMetaInfo().getVidToken().vid;
        }
        return null;
    }

    public String getVideoIdApiHost() {
        SimPlayTokenAuth simPlayTokenAuth = this.drmTokenAuth;
        if (simPlayTokenAuth != null && simPlayTokenAuth.isValid()) {
            return this.drmTokenAuth.tryGetHost();
        }
        if (getMetaInfo().getVidToken() != null) {
            return getMetaInfo().getVidToken().tryGetHost();
        }
        return null;
    }

    public String getVideoIdAuth() {
        SimPlayTokenAuth simPlayTokenAuth = this.drmTokenAuth;
        if (simPlayTokenAuth != null) {
            return simPlayTokenAuth.getAuth();
        }
        return null;
    }

    public String getVideoIdPToken() {
        SimPlayTokenAuth simPlayTokenAuth = this.drmTokenAuth;
        if (simPlayTokenAuth != null && simPlayTokenAuth.isValid()) {
            return this.drmTokenAuth.getToken();
        }
        if (getMetaInfo().getVidToken() != null) {
            return getMetaInfo().getVidToken().token;
        }
        return null;
    }

    public final void LIZ() {
        if (C1474810oTv.LJJI()) {
            return;
        }
        if (!TextUtils.isEmpty(this.meta)) {
            try {
                if (TextUtils.equals(new JSONObject(this.meta).optString("format"), "dash")) {
                    this.LLILZLL = Boolean.TRUE;
                    return;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        this.LLILZLL = Boolean.FALSE;
    }

    public List<SimBitRate> getBitRate() {
        return hasDashBitrate() ? Collections.emptyList() : this.bitRate;
    }

    public List<SimBitRate> getDashVideoBitRate() {
        if (hasDashBitrate()) {
            return this.bitRate;
        }
        return null;
    }

    public SimVideoUrlModel getPlayAddr() {
        LIZIZ();
        SimVideoUrlModel simVideoUrlModel = this.LLILLJJLI;
        if (simVideoUrlModel != null) {
            simVideoUrlModel.setCodecType(1);
            this.LLILLJJLI.setRatio(this.ratio);
        }
        SimVideoUrlModel simVideoUrlModel2 = this.LL;
        if (simVideoUrlModel2 != null) {
            simVideoUrlModel2.setCodecType(0);
            this.LL.setRatio(this.ratio);
        }
        return checkVideo(this.LLILLJJLI) ? this.LLILLJJLI : this.LL;
    }

    public SimVideoUrlModel getPlayAddrBytevc1() {
        LIZIZ();
        SimVideoUrlModel simVideoUrlModel = this.LLILLJJLI;
        if (simVideoUrlModel != null) {
            simVideoUrlModel.setCodecType(1);
            this.LLILLJJLI.setRatio(this.ratio);
        }
        return this.LLILLJJLI;
    }

    public SimVideoUrlModel getPlayAddrH264() {
        LIZIZ();
        SimVideoUrlModel simVideoUrlModel = this.LL;
        if (simVideoUrlModel != null) {
            simVideoUrlModel.setCodecType(0);
            this.LL.setRatio(this.ratio);
        }
        return this.LL;
    }

    public SimVideoUrlModel getProperPlayAddr() {
        return getPlayAddr();
    }

    public Map<String, Object> getVideoModelMap() {
        if (!C1474810oTv.LJLLI() || !hasDashBitrate()) {
            return this.dVideoModelV2;
        }
        Map<String, Object> map = this.dVideoModelV2;
        if (map != null) {
            return map;
        }
        Map<String, Object> mapLIZ = null;
        if (hasDashBitrate()) {
            List<SimBitRate> rawBitrate = getRawBitrate();
            if (rawBitrate == null) {
                rawBitrate = C13BV.INSTANCE;
            }
            List<SimAudioBitrate> audioBitRate = getAudioBitRate();
            if (audioBitRate == null) {
                audioBitRate = C13BV.INSTANCE;
            }
            String str = this.meta;
            SimVideoUrlModel simVideoUrlModel = this.LL;
            String originUri = simVideoUrlModel != null ? simVideoUrlModel.getOriginUri() : null;
            int duration = getDuration();
            String didProfileLabels = getDidProfileLabels();
            String vidProfileLabels = getVidProfileLabels();
            String transParams = getTransParams();
            if ((!rawBitrate.isEmpty()) || (!audioBitRate.isEmpty())) {
                try {
                    mapLIZ = C1475930oVj.LIZ(rawBitrate, audioBitRate, str, originUri, duration, didProfileLabels, vidProfileLabels, transParams);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
        this.dVideoModelV2 = mapLIZ;
        return mapLIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:211:0x03d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String getVideoModelStr() {
        /*
            Method dump skipped, instruction units count: 987
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.playerkit.simapicommon.model.SimVideo.getVideoModelStr():java.lang.String");
    }

    public boolean hasDashBitrate() {
        Boolean bool;
        if (C1474810oTv.LJJI()) {
            return TextUtils.equals("dash", this.LLILZ);
        }
        if (((Boolean) C1474810oTv.LJFF.getValue()).booleanValue() && (bool = this.LLILZLL) != null) {
            return bool.booleanValue();
        }
        LIZ();
        return this.LLILZLL.booleanValue();
    }

    public boolean hasDashBitrateAndSelectAsMp4() {
        return hasDashBitrate() && C1474810oTv.LJJJ();
    }

    public boolean hasVideoModel() {
        return (TextUtils.isEmpty(getVideoModelStr()) && getVideoModelMap() == null) ? false : true;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SimVideo{playAddr=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", playAddrBytevc1=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", height=");
        sbLIZ.append(this.height);
        sbLIZ.append(", width=");
        sbLIZ.append(this.width);
        sbLIZ.append(", ratio='");
        sbLIZ.append(this.ratio);
        sbLIZ.append('\'');
        sbLIZ.append(", downloadAddr=, hasWaterMark=, videoLength=");
        sbLIZ.append(this.videoLength);
        sbLIZ.append(", bitRate=");
        sbLIZ.append(this.bitRate);
        sbLIZ.append(", newDownloadAddr=, suffixLogoAddr=, hasSuffixWaterMark=, needSetCookie=");
        sbLIZ.append(this.needSetCookie);
        sbLIZ.append(", misc_download_addrs=, isCallback=");
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public boolean enableIntertrustDrm() {
        return this.enableIntertrustDrm;
    }

    public List<SimAudioBitrate> getAudioBitRate() {
        return this.audioBitrate;
    }

    public C1479380obI getClaInfo() {
        return this.claInfo;
    }

    public String getDidProfileLabels() {
        return this.didProfileLabels;
    }

    public SimPlayTokenAuth getDrmTokenAuth() {
        return this.drmTokenAuth;
    }

    public int getDuration() {
        return this.videoLength;
    }

    public String getFormat() {
        return this.LLILZ;
    }

    public SimVideoUrlModel getH264PlayAddr() {
        return this.h264PlayAddr;
    }

    public int getHeight() {
        return this.height;
    }

    public Integer getIsBytevc1() {
        return this.isBytevc1;
    }

    public String getMeta() {
        return this.meta;
    }

    public long getPb2AwemeMillis() {
        return this.pb2AwemeMillis;
    }

    public String getRatio() {
        return this.ratio;
    }

    public List<SimBitRate> getRawBitrate() {
        return this.bitRate;
    }

    public String getSourceId() {
        return this.LLILZIL;
    }

    public String getTransParams() {
        return this.transParams;
    }

    public String getVidProfileLabels() {
        return this.vidProfileLabels;
    }

    public int getVideoLength() {
        return this.videoLength;
    }

    public Object getVideoModel() {
        return this.LLIZ;
    }

    public List<k> getVideoThumbs() {
        return this.videoThumbs;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isColdBoot() {
        return this.LLILLL;
    }

    public boolean isNeedSetCookie() {
        return this.needSetCookie;
    }

    public static C1473210oRL getMetaInfo(SimVideo simVideo) {
        if (simVideo == null) {
            return C1473210oRL.from(null);
        }
        if (TextUtils.isEmpty(simVideo.getMeta())) {
            return C1473210oRL.from(null);
        }
        return C1473210oRL.from(simVideo.getMeta());
    }

    public boolean checkVideo(SimUrlModel simUrlModel) {
        List<String> urlList;
        if (simUrlModel == null || (urlList = simUrlModel.getUrlList()) == null || urlList.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : urlList) {
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        simUrlModel.setUrlList(arrayList);
        if (urlList.isEmpty() || TextUtils.isEmpty(simUrlModel.getUri())) {
            return false;
        }
        return true;
    }

    public void setAudioBitRate(List<SimAudioBitrate> list) {
        this.audioBitrate = list;
    }

    public void setBitRate(List<SimBitRate> list) {
        this.bitRate = list;
    }

    public void setClaInfo(C1479380obI c1479380obI) {
        this.claInfo = c1479380obI;
    }

    public void setColdBoot(boolean z) {
        this.LLILLL = z;
    }

    public void setDidProfileLabels(String str) {
        this.didProfileLabels = str;
    }

    public void setDrmTokenAuth(SimPlayTokenAuth simPlayTokenAuth) {
        this.drmTokenAuth = simPlayTokenAuth;
    }

    public void setDuration(double d) {
        this.videoLength = (int) d;
    }

    public void setEnableIntertrustDrm(boolean z) {
        this.enableIntertrustDrm = z;
    }

    public void setFormat(String str) {
        this.LLILZ = str;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setIsBytevc1(Integer num) {
        this.isBytevc1 = num;
    }

    public void setMeta(String str) {
        this.meta = str;
        LIZ();
    }

    public void setNeedSetCookie(boolean z) {
        this.needSetCookie = z;
    }

    public void setPb2AwemeMillis(long j) {
        this.pb2AwemeMillis = j;
    }

    public void setPlayAddr(SimVideoUrlModel simVideoUrlModel) {
        this.LL = simVideoUrlModel;
    }

    public void setPlayAddrBytevc1(SimVideoUrlModel simVideoUrlModel) {
        this.LLILLJJLI = simVideoUrlModel;
    }

    public void setPlayAddrH264(SimVideoUrlModel simVideoUrlModel) {
        this.h264PlayAddr = simVideoUrlModel;
    }

    public void setRatio(String str) {
        this.ratio = str;
    }

    public void setRationAndSourceId(String str) {
        SimVideoUrlModel simVideoUrlModel = this.LLILLJJLI;
        if (simVideoUrlModel != null) {
            simVideoUrlModel.setRatio(this.ratio);
            simVideoUrlModel.setSourceId(str);
            this.LLILLJJLI.setCodecType(1);
        }
        SimVideoUrlModel simVideoUrlModel2 = this.LL;
        if (simVideoUrlModel2 != null) {
            simVideoUrlModel2.setRatio(this.ratio);
            simVideoUrlModel2.setSourceId(str);
            this.LL.setCodecType(0);
        }
        this.LLILZIL = str;
    }

    public void setSourceId(String str) {
        setRationAndSourceId(str);
    }

    public void setTransParams(String str) {
        this.transParams = str;
    }

    public void setVidProfileLabels(String str) {
        this.vidProfileLabels = str;
    }

    public void setVideoLength(int i) {
        this.videoLength = i;
    }

    public void setVideoModel(Object obj) {
        this.LLIZ = obj;
    }

    public void setVideoModelMap(Map<String, Object> map) {
        this.dVideoModelV2 = map;
    }

    public void setVideoModelStr(String str) {
        this.dVideoModel = str;
    }

    public void setVideoThumbs(List<k> list) {
        this.videoThumbs = list;
    }

    public void setWidth(int i) {
        this.width = i;
    }
}
