package com.ss.android.ugc.playerkit.simapicommon.model;

import X.C09CT;
import X.C0NI4;
import X.C1473210oRL;
import X.C1474810oTv;
import X.C1475370oUp;
import X.C1475940oVk;
import X.C1476750oX3;
import X.C1477400oY6;
import X.C2188811AlT;
import X.C589480NAc;
import X.EnumC2281141EQm;
import X.InterfaceC1477220oXo;
import Y.AComparatorS42S0000000_23;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class SimVideoUrlModel extends SimUrlModel {
    public static final long serialVersionUID = 4566748102483196885L;
    public String LL;
    public String LLILLJJLI;
    public boolean LLILLL;
    public int LLILZ;
    public String LLILZIL;
    public boolean LLILZLL;
    public int LLIZ;
    public List<C1476750oX3> LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public long LLJIJIL;
    public boolean LLJILJIL;
    public List<SimAudioBitrate> LLJILJILJ;
    public transient InterfaceC1477220oXo LLJILLL;
    public String LLJJ;
    public String LLJJI;
    public String LLJJIII;
    public JSONObject LLJJIJI;
    public String LLJJIJIIJIL;
    public String LLJJIJIL;
    public final long LLJJJ;
    public int LLJJJIL;
    public long LLJJJJ;
    public long LLJJJJJIL;
    public float LLJJJJLIIL;
    public int LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public String LLJLIL;
    public String LLJLILLLLZIIL;
    public Map<String, Object> LLJLL;
    public String LLJLLIL;
    public boolean LLJLLL;
    public int LLJZ;
    public String LLJZIJLIL;
    public String LLL;
    public String LLLF;
    public boolean LLLFF;
    public EnumC2281141EQm LLLFFI;
    public int LLLFZ;
    public String LLLI;
    public String LLLII;
    public Map<Integer, C1475370oUp> LLLIIII;
    public C589480NAc LLLIIIIL;
    public long LLLIIIL;
    public transient C0NI4 LLLIIL;
    public transient Map<String, String> LLLIILIL;
    public boolean LLLIL;
    public String LLLILZ;
    public String LLLILZJ;
    public int LLLILZLLLI;
    public boolean LLLIZZ;
    public String LLLJ;
    public String LLLJIL;
    public boolean LLLJL;
    public SimBitRate LLLL;
    public SimAudioBitrate LLLLII;
    public Boolean LLLLIIIILLL;

    @C09CT("bit_rate")
    public List<SimBitRate> bitRate;

    @C09CT("duration")
    public double duration;
    public int isLive;

    @C09CT("feed_born_time")
    public long pb2AwemeMillis;

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
    
        if (r2 != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String getBitRatedRatioUri() {
        /*
            r5 = this;
            X.0oXo r3 = r5.LLJILLL
            if (r3 == 0) goto L77
            java.lang.String r4 = r3.getUrlKey()
            X.01GW r0 = X.C1474810oTv.LJLIIIL
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L53
            boolean r0 = r5.LLLIL
            if (r0 != 0) goto L53
        L1a:
            java.lang.String r1 = r3.getUrlKey()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L52
            int r0 = r3.isBytevc1()
            java.lang.String r2 = X.C1475940oVk.LIZ(r0)
            int r0 = r3.isBytevc1()
            if (r0 != 0) goto L34
            java.lang.String r2 = ""
        L34:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = r5.getUri()
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "T"
            r1.append(r0)
            int r0 = r3.getBitRate()
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
        L52:
            return r1
        L53:
            java.util.List<com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate> r0 = r5.bitRate
            r2 = 0
            if (r0 == 0) goto L77
            java.util.Iterator r1 = r0.iterator()
        L5c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L74
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate r0 = (com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate) r0
            java.lang.String r0 = r0.getUrlKey()
            boolean r0 = android.text.TextUtils.equals(r0, r4)
            if (r0 == 0) goto L5c
            r2 = 1
            goto L5c
        L74:
            if (r2 == 0) goto L77
            goto L1a
        L77:
            java.lang.String r1 = r5.getUri()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel.getBitRatedRatioUri():java.lang.String");
    }

    public String getRatioUri() {
        String strLIZIZ;
        if (this.LLJJIJIL == null) {
            String strLIZ = C1475940oVk.LIZ(this.LLILZ);
            strLIZIZ = "";
            if (this.LLILZ == 0) {
                strLIZ = "";
            }
            if (this.uri != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.uri);
                String str = this.LLILLJJLI;
                sbLIZ.append(str != null ? str : "");
                sbLIZ.append(strLIZ);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            this.LLJJIJIL = strLIZIZ;
        }
        return this.LLJJIJIL;
    }

    public JSONObject getVidProfileLabelsJson() {
        if (this.LLJJIJI == null) {
            try {
                if (this.LLJJIII != null) {
                    this.LLJJIJI = new JSONObject(this.LLJJIII);
                } else {
                    this.LLJJIJI = new JSONObject();
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LLJJIJI = new JSONObject();
            }
        }
        return this.LLJJIJI;
    }

    public boolean hasVideoModel() {
        if (!TextUtils.isEmpty(this.LLJLILLLLZIIL)) {
            return true;
        }
        Map<String, Object> map = this.LLJLL;
        return (map == null || map.isEmpty()) ? false : true;
    }

    public boolean isBytevc1() {
        return this.LLILZ == 1;
    }

    public boolean isHaveHdr() {
        List<SimBitRate> list = this.bitRate;
        if (list == null) {
            return false;
        }
        for (SimBitRate simBitRate : list) {
            if (simBitRate != null && (simBitRate.getHdrType() == 1 || simBitRate.getHdrType() == 2)) {
                return true;
            }
        }
        return false;
    }

    public SimVideoUrlModel() {
        this.LLIZ = -1;
        this.LLJ = true;
        this.LLJJJIL = -1;
        this.LLJJLIIIJLLLLLLLZ = -1;
        this.LLLF = "";
        this.LLLFF = true;
        this.LLLFFI = EnumC2281141EQm.Undefine;
        this.LLJJJ = SystemClock.elapsedRealtime();
    }

    public final void LIZ() {
        List<SimBitRate> list;
        List<SimAudioBitrate> list2;
        if (!C1474810oTv.LJIJJLI() || (list = this.bitRate) == null || list.isEmpty() || (list2 = this.LLJILJILJ) == null || list2.isEmpty()) {
            return;
        }
        HashMap map = new HashMap();
        for (SimAudioBitrate simAudioBitrate : this.LLJILJILJ) {
            if (simAudioBitrate.getAudioMeta() != null && simAudioBitrate.getAudioMeta().getFileId() != null) {
                map.put(simAudioBitrate.getAudioMeta().getFileId(), Integer.valueOf(simAudioBitrate.getBitRate()));
            }
        }
        for (SimBitRate simBitRate : this.bitRate) {
            if (map.get(simBitRate.getAudioFileId()) != null && simBitRate.getBitRateWithAudio() == 0) {
                simBitRate.setBitRateWithAudio(simBitRate.bitRate + ((Integer) map.get(simBitRate.getAudioFileId())).intValue());
            }
        }
    }

    public final void LIZIZ() {
        if (C1474810oTv.LJJI()) {
            return;
        }
        if (!TextUtils.isEmpty(this.LLJJ)) {
            try {
                if (TextUtils.equals(C1473210oRL.from(this.LLJJ).getJson().optString("format"), "dash")) {
                    this.LLLLIIIILLL = Boolean.TRUE;
                    return;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        this.LLLLIIIILLL = Boolean.FALSE;
    }

    public boolean getAdaptive() {
        if (!hasDashBitrate()) {
            return false;
        }
        int i = this.LLJJJIL;
        if (i != -1) {
            return i != 0;
        }
        if (!TextUtils.isEmpty(this.LLJJ)) {
            try {
                String strOptString = C1473210oRL.from(this.LLJJ).getJson().optString("video_meta");
                if (TextUtils.isEmpty(strOptString)) {
                    this.LLJJJIL = 0;
                } else {
                    this.LLJJJIL = new JSONObject(strOptString).optBoolean("enable_adaptive") ? 1 : 0;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LLJJJIL = 0;
            }
        }
        return this.LLJJJIL != 0;
    }

    public List<SimBitRate> getBitRate() {
        if (hasDashBitrate()) {
            return Collections.emptyList();
        }
        List<SimBitRate> list = this.bitRate;
        return list == null ? Collections.emptyList() : list;
    }

    public List<SimBitRate> getDashBitRate() {
        return hasDashBitrate() ? this.bitRate : Collections.emptyList();
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.model.SimUrlModel
    public String getUri() {
        return !TextUtils.isEmpty(getUrlKey()) ? getUrlKey() : getRatioUri();
    }

    public boolean hasDashBitrate() {
        Boolean bool;
        if (C1474810oTv.LJJI()) {
            return TextUtils.equals("dash", this.LLJLIL);
        }
        if (((Boolean) C1474810oTv.LJFF.getValue()).booleanValue() && (bool = this.LLLLIIIILLL) != null) {
            return bool.booleanValue();
        }
        LIZIZ();
        return this.LLLLIIIILLL.booleanValue();
    }

    public boolean hasDashBitrateAndSelectAsMp4() {
        return hasDashBitrate() && C1474810oTv.LJJJ();
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.model.SimUrlModel
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.LL;
        int iHashCode2 = (((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.LLILZ) * 31;
        List<SimBitRate> list = this.bitRate;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.LLJJIJIL;
        int iHashCode4 = (iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.LLJLILLLLZIIL;
        int iHashCode5 = (iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.LLJLLIL;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SimVideoUrlModel{uri='");
        sbLIZ.append(this.uri);
        sbLIZ.append('\'');
        sbLIZ.append(", urlList=");
        sbLIZ.append(this.urlList);
        sbLIZ.append("sourceId='");
        sbLIZ.append(this.LL);
        sbLIZ.append('\'');
        sbLIZ.append(",dashVideoID=");
        sbLIZ.append(this.LLJLLIL);
        sbLIZ.append('\'');
        sbLIZ.append(", ratio='");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append('\'');
        sbLIZ.append(", mVr=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.duration);
        sbLIZ.append(", bitRate=");
        sbLIZ.append(this.bitRate);
        sbLIZ.append(", createTime=");
        sbLIZ.append(this.LLJJJ);
        sbLIZ.append(", codecType=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public int getAdSrBizPriority() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public float getAspectRatio() {
        return this.LLJJJJLIIL;
    }

    public List<SimAudioBitrate> getAudioBitrate() {
        return this.LLJILJILJ;
    }

    public String getAuthorLiveRoomId() {
        return this.LLLILZJ;
    }

    public long getAwemeCreateTimeFromServer() {
        return this.LLLIIIL;
    }

    public int getBizHadCache() {
        return this.LLJL;
    }

    public long getBusinessUrlExpiredTime() {
        return this.LLJJJJJIL;
    }

    public long getCdnUrlExpired() {
        return this.LLJJJJ;
    }

    public String getClaVideoId() {
        return this.LLLJ;
    }

    public int getCodecType() {
        return this.LLILZ;
    }

    public long getCreateTime() {
        return this.LLJJJ;
    }

    public String getDashVideoId() {
        return this.LLJLLIL;
    }

    public Map<String, Object> getDashVideoModelMap() {
        return this.LLJLL;
    }

    public String getDashVideoModelStr() {
        return this.LLJLILLLLZIIL;
    }

    public String getDidProfileLabels() {
        return this.LLJJI;
    }

    public long getDubbedAudioPreloadSize() {
        return this.LLJIJIL;
    }

    public double getDuration() {
        return this.duration;
    }

    public String getFeedRequestId() {
        return this.LLLJIL;
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.model.SimUrlModel
    public String getFileCheckSum() {
        return this.fileCheckSum;
    }

    public String getFileKey() {
        return this.LLJZIJLIL;
    }

    public String getFirstSubMediaId() {
        return this.LLILZIL;
    }

    public String getFormat() {
        return this.LLJLIL;
    }

    public int getHVideoIndex() {
        return this.LLIZ;
    }

    public InterfaceC1477220oXo getHitBitrate() {
        return this.LLJILLL;
    }

    public SimAudioBitrate getHitDashAudioBitrate() {
        return this.LLLLII;
    }

    public SimBitRate getHitDashVideoBitrate() {
        return this.LLLL;
    }

    public int getInfoId() {
        return this.LLJZ;
    }

    public boolean getIsFirstSubMedia() {
        return this.LLILZLL;
    }

    public int getIsLive() {
        return this.isLive;
    }

    public boolean getIsLocalCache() {
        return this.LLLJL;
    }

    public int getIsScAvatorLive() {
        return this.LLLILZLLLI;
    }

    public boolean getIsTranslatedVideo() {
        return this.LLJILJIL;
    }

    public String getLiveJsonStringData() {
        return this.LLLILZ;
    }

    public String getMeta() {
        return this.LLJJ;
    }

    public String getOriginUri() {
        return this.uri;
    }

    public String getOriginalCaptionLanguageCode() {
        return this.LLLI;
    }

    public long getPb2AwemeMillis() {
        return this.pb2AwemeMillis;
    }

    public EnumC2281141EQm getPreferredResolution() {
        return this.LLLFFI;
    }

    public C0NI4 getPreloadTaskInfo() {
        return this.LLLIIL;
    }

    public String getRatio() {
        return this.LLILLJJLI;
    }

    public List<SimBitRate> getRawBitRate() {
        return this.bitRate;
    }

    public int getScCategory() {
        return this.LLJJL;
    }

    public boolean getShouldPlayTranslatedAudio() {
        return this.LLJ;
    }

    public List<C1476750oX3> getSimAudios() {
        return this.LLIZLLLIL;
    }

    public C589480NAc getSimCover() {
        return this.LLLIIIIL;
    }

    public Map<Integer, C1475370oUp> getSimSubtitleUrlModelMap() {
        return this.LLLIIII;
    }

    public String getSourceId() {
        return this.LL;
    }

    public String getSubTag() {
        return this.LLLF;
    }

    public int getSubtitleId() {
        return this.LLLFZ;
    }

    public String getTag() {
        return this.LLL;
    }

    public String getTransParams() {
        return this.LLJJIJIIJIL;
    }

    public String getTranslationTargetLanguageCode() {
        return this.LLLII;
    }

    public String getVidProfileLabels() {
        return this.LLJJIII;
    }

    public Map<String, String> getVodSceneTag() {
        return this.LLLIILIL;
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.model.SimUrlModel
    public String getaK() {
        return this.aK;
    }

    public boolean isColdBoot() {
        return this.LLJLLL;
    }

    public boolean isEcommerce() {
        return this.LLLIZZ;
    }

    public boolean isIsEnablePreloadDubbedAudio() {
        return this.LLJI;
    }

    public boolean isUseMdlAndVideoCache() {
        return this.LLLFF;
    }

    public boolean isVr() {
        return this.LLILLL;
    }

    public SimVideoUrlModel(String str) {
        this();
        this.LL = str;
        if (C1474810oTv.LJJLIIIIJ()) {
            C1477400oY6 c1477400oY6 = C1477400oY6.LJJJJI;
            c1477400oY6.getClass();
            if (TextUtils.isEmpty(str) || !((HashSet) c1477400oY6.LJJJIL).contains(str)) {
                if (getHitBitrate() == null) {
                    setHitBitrate(c1477400oY6.LJIJI(getSourceId()));
                }
                if (getHitDashVideoBitrate() == null) {
                    setHitDashVideoBitrate(c1477400oY6.LJIJJLI(getSourceId()));
                }
                if (getHitDashAudioBitrate() == null) {
                    setHitDashAudioBitrate(c1477400oY6.LJIJJ(getSourceId()));
                }
                if (TextUtils.isEmpty(getDashVideoId())) {
                    setDashVideoId(c1477400oY6.LJIIJJI(getSourceId()));
                }
            }
        }
    }

    public static SimVideoUrlModel fromUrl(String str) {
        SimVideoUrlModel simVideoUrlModel = new SimVideoUrlModel();
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        simVideoUrlModel.urlList = arrayList;
        return simVideoUrlModel;
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.model.SimUrlModel
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        SimVideoUrlModel simVideoUrlModel = (SimVideoUrlModel) obj;
        if (this.LLILZ != simVideoUrlModel.LLILZ) {
            return false;
        }
        String str = this.LL;
        if (str != null) {
            if (!str.equals(simVideoUrlModel.LL)) {
                return false;
            }
        } else if (simVideoUrlModel.LL != null) {
            return false;
        }
        List<SimBitRate> list = this.bitRate;
        if (list != null) {
            if (!list.equals(simVideoUrlModel.bitRate)) {
                return false;
            }
        } else if (simVideoUrlModel.bitRate != null) {
            return false;
        }
        String str2 = this.LLJJIJIL;
        if (str2 != null) {
            if (!str2.equals(simVideoUrlModel.LLJJIJIL)) {
                return false;
            }
        } else if (simVideoUrlModel.LLJJIJIL != null) {
            return false;
        }
        String str3 = this.LLJLILLLLZIIL;
        if (str3 != null) {
            if (!str3.equals(simVideoUrlModel.LLJLILLLLZIIL)) {
                return false;
            }
        } else if (simVideoUrlModel.LLJLILLLLZIIL != null) {
            return false;
        }
        String str4 = this.LLJLLIL;
        String str5 = simVideoUrlModel.LLJLLIL;
        if (str4 != null) {
            return str4.equals(str5);
        }
        if (str5 == null) {
            return true;
        }
        return false;
    }

    public void setAdSrBizPriority(int i) {
        this.LLJJLIIIJLLLLLLLZ = i;
    }

    public void setAspectRatio(float f) {
        this.LLJJJJLIIL = f;
    }

    public void setAudioBitRate(List<SimAudioBitrate> list) {
        this.LLJILJILJ = list;
        LIZ();
    }

    public void setAuthorLiveRoomId(String str) {
        this.LLLILZJ = str;
    }

    public void setAwemeCreateTimeFromServer(long j) {
        this.LLLIIIL = j;
    }

    public void setBitRate(List<SimBitRate> list) {
        this.bitRate = list;
        if (((Boolean) C1474810oTv.LJIIJ.getValue()).booleanValue() && this.bitRate != null) {
            ArrayList arrayList = new ArrayList(this.bitRate);
            Collections.sort(arrayList, new AComparatorS42S0000000_23(7));
            ArrayList arrayList2 = new ArrayList();
            int i = 0;
            while (i < arrayList.size() - 1) {
                SimBitRate simBitRate = (SimBitRate) ListProtector.get(arrayList, i);
                i++;
                SimBitRate simBitRate2 = (SimBitRate) ListProtector.get(arrayList, i);
                int videoWidth = simBitRate.getVideoWidth();
                int videoWidth2 = simBitRate2.getVideoWidth();
                if (videoWidth > 0 && videoWidth2 > 0 && videoWidth < videoWidth2) {
                    arrayList2.add(simBitRate);
                }
            }
            if (arrayList2.size() > 0) {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList.remove(it2.next());
                }
            }
            this.bitRate = arrayList;
        }
        LIZ();
    }

    public void setBizHadCache(int i) {
        this.LLJL = i;
    }

    public void setBusinessUrlExpiredTime(long j) {
        this.LLJJJJJIL = j;
    }

    public void setBytevc1(boolean z) {
        this.LLILZ = z ? 1 : 0;
    }

    public void setCdnUrlExpired(long j) {
        this.LLJJJJ = j;
    }

    public void setClaVideoId(String str) {
        this.LLLJ = str;
    }

    public void setCodecType(int i) {
        this.LLILZ = i;
    }

    public void setColdBoot(boolean z) {
        this.LLJLLL = z;
    }

    public void setDashVideoId(String str) {
        this.LLJLLIL = str;
    }

    public void setDashVideoModelMap(Map<String, Object> map) {
        this.LLJLL = map;
    }

    public void setDashVideoModelStr(String str) {
        this.LLJLILLLLZIIL = str;
    }

    public void setDidProfileLabels(String str) {
        this.LLJJI = str;
    }

    public void setDubbedAudioPreloadSize(long j) {
        this.LLJIJIL = j;
    }

    public void setDuration(double d) {
        this.duration = d;
    }

    public void setEcommerce(boolean z) {
        this.LLLIZZ = z;
    }

    public void setEnablePreciseCacheKey(boolean z) {
        this.LLLIL = z;
    }

    public void setFeedRequestId(String str) {
        this.LLLJIL = str;
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.model.SimUrlModel
    public void setFileCheckSum(String str) {
        this.fileCheckSum = str;
    }

    public void setFileKey(String str) {
        this.LLJZIJLIL = str;
    }

    public void setFirstSubMediaId(String str) {
        this.LLILZIL = str;
    }

    public void setFormat(String str) {
        this.LLJLIL = str;
    }

    public void setHVideoIndex(int i) {
        this.LLIZ = i;
    }

    public void setHitBitrate(InterfaceC1477220oXo interfaceC1477220oXo) {
        this.LLJILLL = interfaceC1477220oXo;
    }

    public void setHitDashAudioBitrate(SimAudioBitrate simAudioBitrate) {
        this.LLLLII = simAudioBitrate;
    }

    public void setHitDashVideoBitrate(SimBitRate simBitRate) {
        this.LLLL = simBitRate;
    }

    public void setInfoId(int i) {
        this.LLJZ = i;
    }

    public void setIsEnablePreloadDubbedAudio(boolean z) {
        this.LLJI = z;
    }

    public void setIsFirstSubMedia(boolean z) {
        this.LLILZLL = z;
    }

    public void setIsLive(int i) {
        this.isLive = i;
    }

    public void setIsLocalCache(boolean z) {
        this.LLLJL = z;
    }

    public void setIsScAvatorLive(int i) {
        this.LLLILZLLLI = i;
    }

    public void setIsTranslatedVideo(boolean z) {
        this.LLJILJIL = z;
    }

    public void setLiveJsonStringData(String str) {
        this.LLLILZ = str;
    }

    public void setMeta(String str) {
        this.LLJJ = str;
        LIZIZ();
    }

    public void setOriginalCaptionLanguageCode(String str) {
        this.LLLI = str;
    }

    public void setPb2AwemeMillis(long j) {
        this.pb2AwemeMillis = j;
    }

    public void setPreferredResolution(EnumC2281141EQm enumC2281141EQm) {
        this.LLLFFI = enumC2281141EQm;
    }

    public void setPreloadTaskInfo(C0NI4 c0ni4) {
        this.LLLIIL = c0ni4;
    }

    public SimVideoUrlModel setRatio(String str) {
        this.LLILLJJLI = str;
        return this;
    }

    public void setScCategory(int i) {
        this.LLJJL = i;
    }

    public void setShouldPlayTranslatedAudio(boolean z) {
        this.LLJ = z;
    }

    public void setSimAudios(List<C1476750oX3> list) {
        this.LLIZLLLIL = list;
    }

    public void setSimCover(C589480NAc c589480NAc) {
        this.LLLIIIIL = c589480NAc;
    }

    public void setSimSubtitleUrlModelMap(Map<Integer, C1475370oUp> map) {
        this.LLLIIII = map;
    }

    public SimVideoUrlModel setSourceId(String str) {
        this.LL = str;
        return this;
    }

    public void setSubTag(String str) {
        this.LLLF = str;
    }

    public void setSubtitleId(int i) {
        this.LLLFZ = i;
    }

    public void setTag(String str) {
        this.LLL = str;
    }

    public void setTransParams(String str) {
        this.LLJJIJIIJIL = str;
    }

    public void setTranslationTargetLanguageCode(String str) {
        this.LLLII = str;
    }

    public void setUseMdlAndVideoCache(boolean z) {
        this.LLLFF = z;
    }

    public void setVidProfileLabels(String str) {
        this.LLJJIII = str;
    }

    public void setVodSceneTag(Map<String, String> map) {
        this.LLLIILIL = map;
    }

    public void setVr(boolean z) {
        this.LLILLL = z;
    }

    @Override // com.ss.android.ugc.playerkit.simapicommon.model.SimUrlModel
    public void setaK(String str) {
        this.aK = str;
    }
}
