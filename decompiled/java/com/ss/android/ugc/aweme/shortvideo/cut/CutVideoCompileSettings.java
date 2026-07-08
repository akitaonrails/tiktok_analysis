package com.ss.android.ugc.aweme.shortvideo.cut;

import X.C09CT;
import X.C13BV;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes9.dex */
public final class CutVideoCompileSettings {
    public final int LIZ;
    public final int LIZIZ;
    public int LIZJ;
    public final boolean LIZLLL;
    public final VEVideoEncodeSettings.ENCODE_STANDARD LJ;
    public final VEVideoEncodeSettings.ENCODE_PROFILE LJFF;
    public final VEVideoEncodeSettings.ENCODE_BITRATE_MODE LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;
    public final String LJIIJ;
    public final Float LJIIJJI;
    public final Float LJIIL;
    public List<Pair<Integer, Integer>> LJIILIIL;
    public final Integer LJIILJJIL;

    @C09CT("audioOutputPath")
    public final String audioOutputPath;

    @C09CT("segments")
    public final List<VideoSegment> segments;

    @C09CT("videoOutputPath")
    public final String videoOutputPath;

    public final String toString() {
        return "CutVideoCompileSettings(segments=" + this.segments + ", videoOutputPath=" + this.videoOutputPath + ", audioOutputPath=" + this.audioOutputPath + ", videoWidth=" + this.LIZ + ", videoHeight=" + this.LIZIZ + ", fps=" + this.LIZJ + ", isHWEncode=" + this.LIZLLL + ", encodeStandard=" + this.LJ + ", encodeProfile=" + this.LJFF + ", videoEncodeBitrateMode=" + this.LJI + ", videoBitrate=" + this.LJII + ", resizeMode=" + this.LJIIIIZZ + ", rotate=" + this.LJIIIZ + ", externalSettings=" + this.LJIIJ + ", resizeX=" + this.LJIIJJI + ", resizeY=" + this.LJIIL + ", trimInAndTrimOuts=" + this.LJIILIIL + ", veEditorPageMode=" + this.LJIILJJIL + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CutVideoCompileSettings(List<? extends VideoSegment> list, String str, String str2, int i, int i2, int i3, boolean z, VEVideoEncodeSettings.ENCODE_STANDARD encode_standard, VEVideoEncodeSettings.ENCODE_PROFILE encode_profile, VEVideoEncodeSettings.ENCODE_BITRATE_MODE encode_bitrate_mode, int i4, int i5, int i6, String str3, Float f, Float f2, List<Pair<Integer, Integer>> list2, Integer num) {
        this.segments = list;
        this.videoOutputPath = str;
        this.audioOutputPath = str2;
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = z;
        this.LJ = encode_standard;
        this.LJFF = encode_profile;
        this.LJI = encode_bitrate_mode;
        this.LJII = i4;
        this.LJIIIIZZ = i5;
        this.LJIIIZ = i6;
        this.LJIIJ = str3;
        this.LJIIJJI = f;
        this.LJIIL = f2;
        this.LJIILIIL = list2;
        this.LJIILJJIL = num;
    }

    public CutVideoCompileSettings(List list, String str, String str2, int i, int i2, int i3, boolean z, VEVideoEncodeSettings.ENCODE_STANDARD encode_standard, VEVideoEncodeSettings.ENCODE_PROFILE encode_profile, VEVideoEncodeSettings.ENCODE_BITRATE_MODE encode_bitrate_mode, int i4, int i5, int i6, String str3, Float f, Float f2, List list2, Integer num, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, str, str2, (i7 & 8) != 0 ? 720 : i, (i7 & 16) != 0 ? 1280 : i2, (i7 & 32) != 0 ? 30 : i3, (i7 & 64) != 0 ? false : z, (i7 & 128) != 0 ? VEVideoEncodeSettings.ENCODE_STANDARD.ENCODE_STANDARD_H264 : encode_standard, (i7 & 256) != 0 ? VEVideoEncodeSettings.ENCODE_PROFILE.ENCODE_PROFILE_BASELINE : encode_profile, (i7 & 512) != 0 ? VEVideoEncodeSettings.ENCODE_BITRATE_MODE.ENCODE_BITRATE_CRF : encode_bitrate_mode, (i7 & 1024) != 0 ? 19 : i4, (i7 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? 1 : i5, (i7 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? 0 : i6, (i7 & 8192) != 0 ? "" : str3, (i7 & 16384) != 0 ? null : f, (32768 & i7) != 0 ? null : f2, (65536 & i7) != 0 ? C13BV.INSTANCE : list2, (i7 & 131072) == 0 ? num : null);
    }
}
