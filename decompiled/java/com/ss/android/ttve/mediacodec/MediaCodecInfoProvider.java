package com.ss.android.ttve.mediacodec;

import X.C1284430jWr;
import X.C2188811AlT;
import X.C2484209oO;
import X.C2484309oP;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.vesdk.VEConfigCenter;
import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes21.dex */
public class MediaCodecInfoProvider {
    public String TAG = "MediaCodecInfoProvider";
    public MediaCodecInfo.CodecCapabilities m_codecCapabilities;
    public String m_codecInfoName;
    public String m_encoderName;
    public MediaCodec m_mediaCodec;
    public MediaCodecInfo m_mediaCodecInfo;
    public MediaCodecInfo.CodecProfileLevel m_profileLevel;

    public static MediaCodecInfoProvider createCodecObject() {
        return new MediaCodecInfoProvider();
    }

    public int getProfile() {
        return this.m_profileLevel.profile;
    }

    public int getMaxFPS(int i, int i2) {
        try {
            return ((Double) this.m_codecCapabilities.getVideoCapabilities().getSupportedFrameRatesFor(i2, i).getUpper()).intValue();
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            C2484209oO.LJIIIIZZ(this.TAG, "getSupportedFrameRate unsupported size");
            return Integer.MAX_VALUE;
        }
    }

    public void getProfileAndLevel(int i, int i2) {
        MediaCodecInfo.CodecProfileLevel codecProfileLevelLIZIZ = C1284430jWr.LIZIZ(this.m_codecCapabilities, i, i2);
        this.m_profileLevel = codecProfileLevelLIZIZ;
        if (codecProfileLevelLIZIZ == null) {
            C2484209oO.LIZJ(this.TAG, "profile level not found");
        }
    }

    public String getCodecInfo(String str, int i, int i2) {
        try {
            MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(str);
            this.m_mediaCodec = mediaCodecCreateEncoderByType;
            MediaCodecInfo codecInfo = mediaCodecCreateEncoderByType.getCodecInfo();
            this.m_mediaCodecInfo = codecInfo;
            this.m_codecCapabilities = codecInfo.getCapabilitiesForType(str);
            this.m_codecInfoName = this.m_mediaCodecInfo.getName().toLowerCase();
            String str2 = this.TAG;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Codec name: ");
            sbLIZ.append(this.m_codecInfoName);
            C2484209oO.LIZ(str2, C2188811AlT.LIZIZ(sbLIZ));
            return this.m_codecInfoName;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            String str3 = this.TAG;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("MediaCodecInfoProvider getCodecInfo Exception");
            sbLIZ2.append(stringWriter);
            C2484209oO.LJIIIIZZ(this.TAG, C2484209oO.LJ(str3, C2188811AlT.LIZIZ(sbLIZ2), new C2484309oP[0]));
            return null;
        }
    }

    public int getLevel(int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT < 24) {
            return 0;
        }
        if (VEConfigCenter.getInstance().getValue("ve_enable_adaptive_encode_level", false).booleanValue()) {
            return C1284430jWr.LIZ(this.m_profileLevel, i, i2, i3, i4);
        }
        MediaCodec mediaCodec = this.m_mediaCodec;
        if (mediaCodec != null) {
            mediaCodec.release();
            this.m_mediaCodec = null;
        }
        return this.m_profileLevel.level;
    }
}
