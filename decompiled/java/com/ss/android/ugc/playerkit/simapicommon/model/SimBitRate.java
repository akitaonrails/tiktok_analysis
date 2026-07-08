package com.ss.android.ugc.playerkit.simapicommon.model;

import X.C09CT;
import X.C1472900oQq;
import X.C1474810oTv;
import X.C1480850odf;
import X.C2188811AlT;
import X.InterfaceC1477220oXo;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class SimBitRate implements Serializable, InterfaceC1477220oXo {
    public static final long serialVersionUID = 1609388073496567510L;
    public int LL;
    public long LLILLJJLI;
    public String LLILLL;
    public float LLILZ;
    public float LLILZIL;
    public float LLILZLL;
    public String LLIZ;
    public String LLIZLLLIL;
    public int LLJ;
    public C1472900oQq LLJI;

    @C09CT("bit_rate")
    public int bitRate;

    @C09CT("fid_profile_labels")
    public String fidProfileLabels;

    @C09CT("gear_name")
    public String gearName;

    @C09CT("HDR_bit")
    public String hdrBit;

    @C09CT("HDR_type")
    public String hdrType;
    public Object origin;

    @C09CT("play_addr")
    public SimUrlModel playAddr;

    @C09CT("play_addr_bytevc1")
    public SimUrlModel playAddrBytevc1;

    @C09CT("quality_type")
    public int qualityType;

    @C09CT("video_extra")
    public String videoExtra;

    @Override // X.InterfaceC1477220oXo
    public int getHdrBit() {
        int i = 0;
        try {
            if (!TextUtils.isEmpty(this.hdrBit)) {
                i = CastIntegerProtector.parseInt(this.hdrBit);
                return i;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return i;
    }

    @Override // X.InterfaceC1477220oXo
    public int getHdrType() {
        int i = 0;
        try {
            if (!TextUtils.isEmpty(this.hdrType)) {
                i = CastIntegerProtector.parseInt(this.hdrType);
                return i;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return i;
    }

    @Override // X.InterfaceC1477220oXo
    public String getAudioFileId() {
        if (!TextUtils.isEmpty(this.LLIZLLLIL)) {
            return this.LLIZLLLIL;
        }
        if (TextUtils.isEmpty(this.videoExtra)) {
            this.LLIZLLLIL = "";
        } else {
            try {
                this.LLIZLLLIL = new JSONObject(this.videoExtra).optString("audio_file_id");
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC1477220oXo
    public String getChecksum() {
        SimUrlModel simUrlModel = this.playAddr;
        if (simUrlModel == null || TextUtils.isEmpty(simUrlModel.getFileCheckSum())) {
            return null;
        }
        return this.playAddr.getFileCheckSum();
    }

    public C1472900oQq getSimVideoExtra() {
        if (this.LLJI == null && !C1480850odf.LIZJ.optSpecialAppAnr()) {
            this.LLJI = C1472900oQq.from(this.videoExtra);
        }
        return this.LLJI;
    }

    @Override // X.InterfaceC1477220oXo
    public int getSize() {
        SimUrlModel simUrlModel = this.playAddr;
        if (simUrlModel != null) {
            return (int) simUrlModel.getSize();
        }
        return 0;
    }

    @Override // X.InterfaceC1477220oXo
    public String getUrlKey() {
        SimUrlModel simUrlModel = this.playAddr;
        if (simUrlModel == null || TextUtils.isEmpty(simUrlModel.getUrlKey())) {
            return null;
        }
        return this.playAddr.getUrlKey();
    }

    @Override // X.InterfaceC1477220oXo
    public int getVideoHeight() {
        SimUrlModel simUrlModel = this.playAddr;
        if (simUrlModel == null) {
            return -1;
        }
        return simUrlModel.getHeight();
    }

    @Override // X.InterfaceC1477220oXo
    public int getVideoWidth() {
        SimUrlModel simUrlModel = this.playAddr;
        if (simUrlModel == null) {
            return -1;
        }
        return simUrlModel.getWidth();
    }

    public int hashCode() {
        int i = this.bitRate * 31;
        String str = this.gearName;
        int iHashCode = (((i + (str != null ? str.hashCode() : 0)) * 31) + this.qualityType) * 31;
        SimUrlModel simUrlModel = this.playAddr;
        int iHashCode2 = (((iHashCode + (simUrlModel != null ? simUrlModel.hashCode() : 0)) * 31) + this.LL) * 31;
        SimUrlModel simUrlModel2 = this.playAddrBytevc1;
        return iHashCode2 + (simUrlModel2 != null ? simUrlModel2.hashCode() : 0);
    }

    @Override // X.InterfaceC1477220oXo
    public int getBitRate() {
        if (isDash()) {
            if (this.LLJ > 0 && C1474810oTv.LJIJJLI()) {
                return this.LLJ;
            }
            C1472900oQq c1472900oQq = this.LLJI;
            if (c1472900oQq != null && c1472900oQq.getRealBitrate() > 0) {
                return this.LLJI.getRealBitrate();
            }
        }
        return this.bitRate;
    }

    public int getIsBytevc1() {
        return isBytevc1();
    }

    public boolean isDash() {
        if (C1474810oTv.LJJI()) {
            return TextUtils.equals("dash", this.LLILLL);
        }
        getSimVideoExtra();
        C1472900oQq c1472900oQq = this.LLJI;
        if (c1472900oQq != null) {
            return TextUtils.equals(c1472900oQq.getFormat(), "dash");
        }
        return false;
    }

    public boolean isHdr() {
        return getHdrType() == 1 || getHdrType() == 2;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SimBitRate{origin=");
        sbLIZ.append(this.origin);
        sbLIZ.append(", bitRate=");
        sbLIZ.append(this.bitRate);
        sbLIZ.append(", gearName='");
        sbLIZ.append(this.gearName);
        sbLIZ.append('\'');
        sbLIZ.append(", qualityType=");
        sbLIZ.append(this.qualityType);
        sbLIZ.append(", quality=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", playAddr=");
        sbLIZ.append(this.playAddr);
        sbLIZ.append(", codecType=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", fps=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", hdrType=");
        sbLIZ.append(this.hdrType);
        sbLIZ.append(", hdrBit=");
        sbLIZ.append(this.hdrBit);
        sbLIZ.append(", qualityScore=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", qualityScoreSr1d5=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", qualityScoreSr2=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", playAddrBytevc1=");
        sbLIZ.append(this.playAddrBytevc1);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1477220oXo
    public List<String> urlList() {
        return getPlayAddr() != null ? getPlayAddr().getUrlList() : Collections.emptyList();
    }

    public int getBitRateWithAudio() {
        return this.LLJ;
    }

    public int getCodecType() {
        return this.LL;
    }

    public String getFidProfileLabels() {
        return this.fidProfileLabels;
    }

    public String getFormat() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1477220oXo
    public long getFps() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1477220oXo
    public String getGearName() {
        return this.gearName;
    }

    public SimUrlModel getPlayAddr() {
        return this.playAddr;
    }

    public String getQuality() {
        return this.LLIZ;
    }

    public float getQualityScore() {
        return this.LLILZ;
    }

    public float getQualityScoreSr1d5() {
        return this.LLILZIL;
    }

    public float getQualityScoreSr2() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1477220oXo
    public int getQualityType() {
        return this.qualityType;
    }

    public String getVideoExtra() {
        return this.videoExtra;
    }

    @Override // X.InterfaceC1477220oXo
    public int isBytevc1() {
        return this.LL;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SimBitRate simBitRate = (SimBitRate) obj;
        if (this.bitRate != simBitRate.bitRate || this.qualityType != simBitRate.qualityType || this.LL != simBitRate.LL) {
            return false;
        }
        String str = this.gearName;
        if (str != null) {
            if (!str.equals(simBitRate.gearName)) {
                return false;
            }
        } else if (simBitRate.gearName != null) {
            return false;
        }
        SimUrlModel simUrlModel = this.playAddr;
        if (simUrlModel != null) {
            if (!simUrlModel.equals(simBitRate.playAddr)) {
                return false;
            }
        } else if (simBitRate.playAddr != null) {
            return false;
        }
        SimUrlModel simUrlModel2 = this.playAddrBytevc1;
        SimUrlModel simUrlModel3 = simBitRate.playAddrBytevc1;
        if (simUrlModel2 != null) {
            return simUrlModel2.equals(simUrlModel3);
        }
        if (simUrlModel3 == null) {
            return true;
        }
        return false;
    }

    public void setBitRate(int i) {
        this.bitRate = i;
    }

    public void setBitRateWithAudio(int i) {
        this.LLJ = i;
    }

    public void setBytevc1(int i) {
        setCodecType(i);
    }

    public void setCodecType(int i) {
        this.LL = i;
    }

    public void setFidProfileLabels(String str) {
        this.fidProfileLabels = str;
    }

    public void setFormat(String str) {
        this.LLILLL = str;
    }

    public void setFps(long j) {
        this.LLILLJJLI = j;
    }

    public void setGearName(String str) {
        this.gearName = str;
    }

    public void setHdrBit(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i);
        sbLIZ.append("");
        this.hdrBit = C2188811AlT.LIZIZ(sbLIZ);
    }

    public void setHdrType(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i);
        sbLIZ.append("");
        this.hdrType = C2188811AlT.LIZIZ(sbLIZ);
    }

    public void setPlayAddr(SimUrlModel simUrlModel) {
        this.playAddr = simUrlModel;
    }

    public void setQuality(String str) {
        this.LLIZ = str;
    }

    public void setQualityScore(float f) {
        this.LLILZ = f;
    }

    public void setQualityScoreSr1d5(float f) {
        this.LLILZIL = f;
    }

    public void setQualityScoreSr2(float f) {
        this.LLILZLL = f;
    }

    public void setQualityType(int i) {
        this.qualityType = i;
    }

    public void setVideoExtra(String str) {
        this.videoExtra = str;
    }
}
