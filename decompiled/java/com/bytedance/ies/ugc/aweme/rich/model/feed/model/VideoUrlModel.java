package com.bytedance.ies.ugc.aweme.rich.model.feed.model;

import X.C09CT;
import X.C2188811AlT;
import android.os.SystemClock;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public class VideoUrlModel extends UrlModel {
    public static final long serialVersionUID = 4566748102483196885L;
    public String LL;
    public String LLILLJJLI;
    public boolean LLILLL;
    public int LLILZ;
    public List<BitrateAudioStruct> LLILZIL;
    public String LLILZLL;
    public String LLIZ;
    public String LLIZLLLIL;
    public transient BitRate LLJ;
    public String LLJI;
    public final long LLJIJIL = SystemClock.elapsedRealtime();
    public String LLJILJIL;
    public Map<String, Object> LLJILJILJ;
    public String LLJILLL;
    public String LLJJ;
    public float LLJJI;
    public BitRate LLJJIII;
    public BitrateAudioStruct LLJJIJI;
    public Boolean LLJJIJIIJIL;
    public String LLJJIJIL;

    @C09CT("bit_rate")
    public List<BitRate> bitRate;

    @C09CT("cdn_url_expired")
    public long cdnUrlExpired;

    @C09CT("duration")
    public double duration;

    @C09CT("file_cs")
    public String fileCheckSum;

    @C09CT("feed_born_time")
    public long pb2AwemeMillis;

    public String getBitRatedRatioUri() {
        BitRate bitRate = this.LLJ;
        if (bitRate == null) {
            return getUri();
        }
        String urlKey = bitRate.getUrlKey();
        if (!TextUtils.isEmpty(urlKey)) {
            return urlKey;
        }
        String str = bitRate.isBytevc1() == 1 ? "bytevc1" : "";
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getUri());
        sbLIZ.append(str);
        sbLIZ.append("T");
        sbLIZ.append(bitRate.getBitRate());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public String getRatioUri() {
        String strLIZIZ;
        if (this.LLJI == null) {
            int i = this.LLILZ;
            strLIZIZ = "";
            String str = i == 2 ? "bytevc2" : i == 1 ? "bytevc1" : "";
            if (this.uri != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.uri);
                String str2 = this.LLILLJJLI;
                sbLIZ.append(str2 != null ? str2 : "");
                sbLIZ.append(str);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            this.LLJI = strLIZIZ;
        }
        return this.LLJI;
    }

    public boolean isBytevc1() {
        return this.LLILZ == 1;
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
        sbLIZ.append(this.LL);
        sbLIZ.append('\'');
        sbLIZ.append(", ratio='");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append('\'');
        sbLIZ.append(", mVr=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.duration);
        sbLIZ.append(", bitRate=");
        sbLIZ.append(arrayList2);
        sbLIZ.append(", createTime=");
        sbLIZ.append(this.LLJIJIL);
        sbLIZ.append(", codecType=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
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

    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean hasDashBitrate() {
        /*
            r3 = this;
            com.bytedance.ies.ugc.aweme.rich.model.fake.IGmtPlayerDepend r0 = X.C1481260oeK.LIZ()
            boolean r0 = r0.LIZIZ()
            java.lang.String r2 = "dash"
            if (r0 == 0) goto L13
            java.lang.String r0 = r3.LLJJIJIL
            boolean r0 = android.text.TextUtils.equals(r2, r0)
            return r0
        L13:
            com.bytedance.ies.ugc.aweme.rich.model.fake.IGmtPlayerDepend r0 = X.C1481260oeK.LIZ()
            boolean r0 = r0.LIZ()
            if (r0 == 0) goto L26
            java.lang.Boolean r0 = r3.LLJJIJIIJIL
            if (r0 == 0) goto L26
            boolean r0 = r0.booleanValue()
            return r0
        L26:
            com.bytedance.ies.ugc.aweme.rich.model.fake.IGmtPlayerDepend r0 = X.C1481260oeK.LIZ()
            boolean r0 = r0.LIZIZ()
            if (r0 != 0) goto L58
            java.lang.String r0 = r3.LLILZLL
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L54
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L50
            java.lang.String r0 = r3.LLILZLL     // Catch: java.lang.Throwable -> L50
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L50
            java.lang.String r0 = "format"
            java.lang.String r0 = r1.optString(r0)     // Catch: java.lang.Throwable -> L50
            boolean r0 = android.text.TextUtils.equals(r0, r2)     // Catch: java.lang.Throwable -> L50
            if (r0 == 0) goto L54
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L50
            r3.LLJJIJIIJIL = r0     // Catch: java.lang.Throwable -> L50
            goto L58
        L50:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L54:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r3.LLJJIJIIJIL = r0
        L58:
            java.lang.Boolean r0 = r3.LLJJIJIIJIL
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.aweme.rich.model.feed.model.VideoUrlModel.hasDashBitrate():boolean");
    }

    public float getAspectRatio() {
        return this.LLJJI;
    }

    public List<BitrateAudioStruct> getAudioBitrate() {
        return this.LLILZIL;
    }

    public long getCdnUrlExpired() {
        return this.cdnUrlExpired;
    }

    public int getCodecType() {
        return this.LLILZ;
    }

    public long getCreateTime() {
        return this.LLJIJIL;
    }

    public String getDashVideoId() {
        return this.LLJILLL;
    }

    public Map<String, Object> getDashVideoModelMap() {
        return this.LLJILJILJ;
    }

    public String getDashVideoModelStr() {
        return this.LLJILJIL;
    }

    public String getDidProfileLabels() {
        return this.LLIZ;
    }

    public double getDuration() {
        return this.duration;
    }

    public String getFileCheckSum() {
        return this.fileCheckSum;
    }

    public String getFormat() {
        return this.LLJJIJIL;
    }

    public BitRate getHitBitrate() {
        return this.LLJ;
    }

    public BitrateAudioStruct getHitDashAudioBitrate() {
        return this.LLJJIJI;
    }

    public BitRate getHitDashVideoBitrate() {
        return this.LLJJIII;
    }

    public String getMeta() {
        return this.LLILZLL;
    }

    public String getOriginUri() {
        return this.uri;
    }

    public long getPb2AwemeMillis() {
        return this.pb2AwemeMillis;
    }

    public String getRatio() {
        return this.LLILLJJLI;
    }

    public List<BitRate> getRawBitRate() {
        return this.bitRate;
    }

    public String getSourceId() {
        return this.LL;
    }

    public String getVidProfileLabels() {
        return this.LLIZLLLIL;
    }

    public String getVideoAdTag() {
        return this.LLJJ;
    }

    @Override // com.ss.android.ugc.aweme.base.model.UrlModel
    public String getaK() {
        return this.aK;
    }

    public boolean isVr() {
        return this.LLILLL;
    }

    public void setAspectRatio(float f) {
        this.LLJJI = f;
    }

    public void setAudioBitrate(List<BitrateAudioStruct> list) {
        this.LLILZIL = list;
    }

    public void setBitRate(List<BitRate> list) {
        this.bitRate = list;
    }

    public void setBytevc1(boolean z) {
        this.LLILZ = z ? 1 : 0;
    }

    public void setCdnUrlExpired(long j) {
        this.cdnUrlExpired = j;
    }

    public void setCodecType(int i) {
        this.LLILZ = i;
    }

    public void setDashVideoId(String str) {
        this.LLJILLL = str;
    }

    public void setDashVideoModelMap(Map<String, Object> map) {
        this.LLJILJILJ = map;
    }

    public void setDashVideoModelStr(String str) {
        this.LLJILJIL = str;
    }

    public void setDidProfileLabels(String str) {
        this.LLIZ = str;
    }

    public void setDuration(double d) {
        this.duration = d;
    }

    public void setFileCheckSum(String str) {
        this.fileCheckSum = str;
    }

    public void setFormat(String str) {
        this.LLJJIJIL = str;
    }

    public void setHitBitrate(BitRate bitRate) {
        this.LLJ = bitRate;
    }

    public void setHitDashAudioBitrate(BitrateAudioStruct bitrateAudioStruct) {
        this.LLJJIJI = bitrateAudioStruct;
    }

    public void setHitDashVideoBitrate(BitRate bitRate) {
        this.LLJJIII = bitRate;
    }

    public void setMeta(String str) {
        this.LLILZLL = str;
    }

    public void setPb2AwemeMillis(long j) {
        if (0 == this.pb2AwemeMillis) {
            this.pb2AwemeMillis = j;
        }
    }

    public VideoUrlModel setRatio(String str) {
        this.LLILLJJLI = str;
        return this;
    }

    public VideoUrlModel setSourceId(String str) {
        this.LL = str;
        return this;
    }

    public void setVidProfileLabels(String str) {
        this.LLIZLLLIL = str;
    }

    public void setVideoAdTag(String str) {
        this.LLJJ = str;
    }

    public void setVr(boolean z) {
        this.LLILLL = z;
    }

    @Override // com.ss.android.ugc.aweme.base.model.UrlModel
    public void setaK(String str) {
        this.aK = str;
    }
}
