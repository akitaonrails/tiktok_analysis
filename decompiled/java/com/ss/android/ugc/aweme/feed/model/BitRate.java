package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import X.C1474810oTv;
import X.C2188811AlT;
import X.InterfaceC1477220oXo;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.a;
import com.google.gson.b;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes24.dex */
public class BitRate implements Serializable, InterfaceC1477220oXo {
    public static final long serialVersionUID = 4166900069421013042L;

    @C09CT("bit_rate")
    public int bitRate;

    @C09CT("fid_profile_labels")
    public String fidProfileLabels;

    @C09CT("format")
    public String format;

    @C09CT("fps")
    public String fps;

    @C09CT("gear_name")
    public String gearName;

    @C09CT("HDR_bit")
    public String hdrBit;

    @C09CT("HDR_type")
    public String hdrType;

    @C09CT("is_bytevc1")
    public int isBytevc1;

    @C09CT("play_addr")
    public UrlModel playAddr;

    @C09CT("quality_type")
    public int qualityType;
    public VideoExtra simVideoExtra;

    @C09CT("video_extra")
    public String videoExtra;

    @Override // X.InterfaceC1477220oXo
    public /* bridge */ /* synthetic */ String getAudioFileId() {
        return null;
    }

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
    public /* bridge */ /* synthetic */ int getVideoHeight() {
        return -1;
    }

    @Override // X.InterfaceC1477220oXo
    public /* bridge */ /* synthetic */ int getVideoWidth() {
        return -1;
    }

    @Override // X.InterfaceC1477220oXo
    public String getChecksum() {
        UrlModel urlModel = this.playAddr;
        if (urlModel == null || !(urlModel instanceof VideoUrlModel) || TextUtils.isEmpty(((VideoUrlModel) urlModel).getFileCheckSum())) {
            return null;
        }
        return ((VideoUrlModel) this.playAddr).getFileCheckSum();
    }

    @Override // X.InterfaceC1477220oXo
    public long getFps() {
        long j = 0;
        try {
            if (!TextUtils.isEmpty(this.fps)) {
                j = CastLongProtector.parseLong(this.fps);
                return j;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return j;
    }

    public VideoExtra getSimVideoExtra() {
        if (this.simVideoExtra == null) {
            this.simVideoExtra = VideoExtra.from(this.videoExtra);
        }
        return this.simVideoExtra;
    }

    @Override // X.InterfaceC1477220oXo
    public int getSize() {
        UrlModel urlModel = this.playAddr;
        if (urlModel != null) {
            return (int) urlModel.getSize();
        }
        return 0;
    }

    @Override // X.InterfaceC1477220oXo
    public String getUrlKey() {
        UrlModel urlModel = this.playAddr;
        if (urlModel == null || TextUtils.isEmpty(urlModel.getUrlKey())) {
            return null;
        }
        return urlModel.getUrlKey();
    }

    @Override // X.InterfaceC1477220oXo
    public int getBitRate() {
        VideoExtra videoExtra;
        return (!isDash() || (videoExtra = this.simVideoExtra) == null || videoExtra.getRealBitrate() <= 0) ? this.bitRate : this.simVideoExtra.getRealBitrate();
    }

    public boolean isDash() {
        if (C1474810oTv.LJJI()) {
            return TextUtils.equals("dash", this.format);
        }
        getSimVideoExtra();
        VideoExtra videoExtra = this.simVideoExtra;
        if (videoExtra != null) {
            return TextUtils.equals(videoExtra.getFormat(), "dash");
        }
        return false;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BitRate{bitRate=");
        sbLIZ.append(this.bitRate);
        sbLIZ.append(", gearName='");
        sbLIZ.append(this.gearName);
        sbLIZ.append('\'');
        sbLIZ.append(", qualityType=");
        sbLIZ.append(this.qualityType);
        sbLIZ.append(", playAddr=");
        sbLIZ.append(this.playAddr);
        sbLIZ.append(", isBytevc1=");
        sbLIZ.append(this.isBytevc1);
        sbLIZ.append(", hdrType=");
        sbLIZ.append(this.hdrType);
        sbLIZ.append(", hdrBit=");
        sbLIZ.append(this.hdrBit);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1477220oXo
    public List<String> urlList() {
        return getPlayAddr() != null ? getPlayAddr().getUrlList() : Collections.emptyList();
    }

    public String getFidProfileLabels() {
        return this.fidProfileLabels;
    }

    public String getFormat() {
        return this.format;
    }

    @Override // X.InterfaceC1477220oXo
    public String getGearName() {
        return this.gearName;
    }

    public UrlModel getPlayAddr() {
        return this.playAddr;
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
        return this.isBytevc1;
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static class ExcludeStrategy implements a {
        @Override // com.google.gson.a
        public boolean shouldSkipClass(Class<?> cls) {
            return false;
        }

        @Override // com.google.gson.a
        public boolean shouldSkipField(b bVar) {
            if (bVar.LIZ.getDeclaringClass() == BitRate.class) {
                if (bVar.LIZIZ().equals("playAddr") || bVar.LIZIZ().equals("playAddrBytevc1") || bVar.LIZIZ().equals("gear_name")) {
                    return true;
                }
                return false;
            }
            return false;
        }
    }

    public void setBitRate(int i) {
        this.bitRate = i;
    }

    public void setBytevc1(int i) {
        this.isBytevc1 = i;
    }

    public void setFidProfileLabels(String str) {
        this.fidProfileLabels = str;
    }

    public void setFormat(String str) {
        this.format = str;
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

    public void setPlayAddr(UrlModel urlModel) {
        this.playAddr = urlModel;
    }

    public void setQualityType(int i) {
        this.qualityType = i;
    }
}
