package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import X.C1474810oTv;
import X.C2188811AlT;
import X.InterfaceC1477220oXo;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class VideoUrlModel extends UrlModel {
    public static final long serialVersionUID = 4566748102483196885L;
    public float aspectRatio;
    public List<BitrateAudioStruct> audioBitrate;

    @C09CT("bit_rate")
    public List<BitRate> bitRate;

    @C09CT("cdn_url_expired")
    public long cdnUrlExpired;
    public int codecType;
    public long createTime = SystemClock.elapsedRealtime();
    public String didProfileLabels;

    @C09CT("duration")
    public double duration;

    @C09CT("file_cs")
    public String fileCheckSum;
    public String format;
    public Boolean hasDashBitrate;
    public transient InterfaceC1477220oXo hitBitrate;
    public BitrateAudioStruct hitDashAudioBitrate;
    public BitRate hitDashVideoBitrate;
    public String mDashVideoId;
    public Map<String, Object> mDashVideoModelMap;
    public String mDashVideoModelString;
    public boolean mIsTranslatedVideo;
    public boolean mVr;
    public String meta;

    @C09CT("feed_born_time")
    public long pb2AwemeMillis;
    public String ratio;
    public String ratioUri;
    public String sourceId;
    public String vidProfileLabels;
    public String videoAdTag;

    public String getBitRatedRatioUri() {
        InterfaceC1477220oXo interfaceC1477220oXo = this.hitBitrate;
        if (interfaceC1477220oXo == null) {
            return getUri();
        }
        String urlKey = interfaceC1477220oXo.getUrlKey();
        if (!TextUtils.isEmpty(urlKey)) {
            return urlKey;
        }
        String str = interfaceC1477220oXo.isBytevc1() == 1 ? "bytevc1" : "";
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getUri());
        sbLIZ.append(str);
        sbLIZ.append("T");
        sbLIZ.append(interfaceC1477220oXo.getBitRate());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public String getRatioUri() {
        String strLIZIZ;
        if (this.ratioUri == null) {
            int i = this.codecType;
            strLIZIZ = "";
            String str = i == 2 ? "bytevc2" : i == 1 ? "bytevc1" : "";
            if (this.uri != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.uri);
                String str2 = this.ratio;
                sbLIZ.append(str2 != null ? str2 : "");
                sbLIZ.append(str);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            this.ratioUri = strLIZIZ;
        }
        return this.ratioUri;
    }

    public boolean isBytevc1() {
        return this.codecType == 1;
    }

    public boolean isHaveHdr() {
        List<BitRate> list = this.bitRate;
        if (list == null) {
            return false;
        }
        for (BitRate bitRate : list) {
            if (bitRate != null && (bitRate.getHdrType() == 1 || bitRate.getHdrType() == 2)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        List arrayList = this.urlList;
        if (arrayList != null && !arrayList.isEmpty()) {
            arrayList = new ArrayList(this.urlList);
        }
        List arrayList2 = this.bitRate;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            arrayList2 = new ArrayList(this.bitRate);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoUrlModel{uri='");
        sbLIZ.append(this.uri);
        sbLIZ.append('\'');
        sbLIZ.append("aK='");
        sbLIZ.append(this.aK);
        sbLIZ.append('\'');
        sbLIZ.append(", urlList=");
        sbLIZ.append(arrayList);
        sbLIZ.append("sourceId='");
        sbLIZ.append(this.sourceId);
        sbLIZ.append('\'');
        sbLIZ.append(", ratio='");
        sbLIZ.append(this.ratio);
        sbLIZ.append('\'');
        sbLIZ.append(", mVr=");
        sbLIZ.append(this.mVr);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.duration);
        sbLIZ.append(", bitRate=");
        sbLIZ.append(arrayList2);
        sbLIZ.append(", createTime=");
        sbLIZ.append(this.createTime);
        sbLIZ.append(", codecType=");
        sbLIZ.append(this.codecType);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    private void calculateHasDashBitrate() {
        if (C1474810oTv.LJJI()) {
            return;
        }
        if (!TextUtils.isEmpty(this.meta)) {
            try {
                if (TextUtils.equals(new JSONObject(this.meta).optString("format"), "dash")) {
                    this.hasDashBitrate = Boolean.TRUE;
                    return;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        this.hasDashBitrate = Boolean.FALSE;
    }

    public List<BitRate> getBitRate() {
        if (hasDashBitrate()) {
            return Collections.emptyList();
        }
        List<BitRate> list = this.bitRate;
        return list == null ? Collections.emptyList() : list;
    }

    @Override // com.ss.android.ugc.aweme.base.model.UrlModel
    public String getUri() {
        return !TextUtils.isEmpty(getUrlKey()) ? getUrlKey() : getRatioUri();
    }

    public boolean hasDashBitrate() {
        Boolean bool;
        if (C1474810oTv.LJJI()) {
            return TextUtils.equals("dash", this.format);
        }
        if (((Boolean) C1474810oTv.F0.getValue()).booleanValue() && (bool = this.hasDashBitrate) != null) {
            return bool.booleanValue();
        }
        calculateHasDashBitrate();
        return this.hasDashBitrate.booleanValue();
    }

    public float getAspectRatio() {
        return this.aspectRatio;
    }

    public List<BitrateAudioStruct> getAudioBitrate() {
        return this.audioBitrate;
    }

    public long getCdnUrlExpired() {
        return this.cdnUrlExpired;
    }

    public int getCodecType() {
        return this.codecType;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public String getDashVideoId() {
        return this.mDashVideoId;
    }

    public Map<String, Object> getDashVideoModelMap() {
        return this.mDashVideoModelMap;
    }

    public String getDashVideoModelStr() {
        return this.mDashVideoModelString;
    }

    public String getDidProfileLabels() {
        return this.didProfileLabels;
    }

    public double getDuration() {
        return this.duration;
    }

    public String getFileCheckSum() {
        return this.fileCheckSum;
    }

    public String getFormat() {
        return this.format;
    }

    public InterfaceC1477220oXo getHitBitrate() {
        return this.hitBitrate;
    }

    public BitrateAudioStruct getHitDashAudioBitrate() {
        return this.hitDashAudioBitrate;
    }

    public BitRate getHitDashVideoBitrate() {
        return this.hitDashVideoBitrate;
    }

    public boolean getIsTranslatedVideo() {
        return this.mIsTranslatedVideo;
    }

    public String getMeta() {
        return this.meta;
    }

    public String getOriginUri() {
        return this.uri;
    }

    public long getPb2AwemeMillis() {
        return this.pb2AwemeMillis;
    }

    public String getRatio() {
        return this.ratio;
    }

    public List<BitRate> getRawBitRate() {
        return this.bitRate;
    }

    public String getSourceId() {
        return this.sourceId;
    }

    public String getVidProfileLabels() {
        return this.vidProfileLabels;
    }

    public String getVideoAdTag() {
        return this.videoAdTag;
    }

    @Override // com.ss.android.ugc.aweme.base.model.UrlModel
    public String getaK() {
        return this.aK;
    }

    public boolean isVr() {
        return this.mVr;
    }

    public void setAspectRatio(float f) {
        this.aspectRatio = f;
    }

    public void setAudioBitrate(List<BitrateAudioStruct> list) {
        this.audioBitrate = list;
    }

    public void setBitRate(List<BitRate> list) {
        this.bitRate = list;
    }

    public void setBytevc1(boolean z) {
        this.codecType = z ? 1 : 0;
    }

    public void setCdnUrlExpired(long j) {
        this.cdnUrlExpired = j;
    }

    public void setCodecType(int i) {
        this.codecType = i;
    }

    public void setDashVideoId(String str) {
        this.mDashVideoId = str;
    }

    public void setDashVideoModelMap(Map<String, Object> map) {
        this.mDashVideoModelMap = map;
    }

    public void setDashVideoModelStr(String str) {
        this.mDashVideoModelString = str;
    }

    public void setDidProfileLabels(String str) {
        this.didProfileLabels = str;
    }

    public void setDuration(double d) {
        this.duration = d;
    }

    public void setFileCheckSum(String str) {
        this.fileCheckSum = str;
    }

    public void setFormat(String str) {
        this.format = str;
    }

    public void setHitBitrate(InterfaceC1477220oXo interfaceC1477220oXo) {
        this.hitBitrate = interfaceC1477220oXo;
    }

    public void setHitDashAudioBitrate(BitrateAudioStruct bitrateAudioStruct) {
        this.hitDashAudioBitrate = bitrateAudioStruct;
    }

    public void setHitDashVideoBitrate(BitRate bitRate) {
        this.hitDashVideoBitrate = bitRate;
    }

    public void setIsTranslatedVideo(boolean z) {
        this.mIsTranslatedVideo = z;
    }

    public void setMeta(String str) {
        this.meta = str;
    }

    public void setPb2AwemeMillis(long j) {
        if (0 == this.pb2AwemeMillis) {
            this.pb2AwemeMillis = j;
        }
    }

    public VideoUrlModel setRatio(String str) {
        this.ratio = str;
        return this;
    }

    public VideoUrlModel setSourceId(String str) {
        this.sourceId = str;
        return this;
    }

    public void setVidProfileLabels(String str) {
        this.vidProfileLabels = str;
    }

    public void setVideoAdTag(String str) {
        this.videoAdTag = str;
    }

    public void setVr(boolean z) {
        this.mVr = z;
    }

    @Override // com.ss.android.ugc.aweme.base.model.UrlModel
    public void setaK(String str) {
        this.aK = str;
    }
}
