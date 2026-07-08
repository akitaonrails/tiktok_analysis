package com.ss.android.ugc.aweme.aigc.asynctask;

import X.C09CT;
import X.C09JG;
import X.C13BV;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class I2VTaskInput extends C09JG {
    public final CreativeInfo LIZ;
    public final INLEMediaSession LIZIZ;
    public final NLEEditor LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final Source LJIIIZ;
    public final int LJIIJ;
    public final String LJIIJJI;
    public final NLETrackSlot LJIIL;
    public final String LJIILIIL;
    public final String LJIILJJIL;

    @C09CT("algo_param")
    public final String algoParam;

    @C09CT("algo_req")
    public final String algoReq;

    @C09CT("extra")
    public final String extra;

    @C09CT("image_local_path_list")
    public final List<String> imageLocalPathList;

    @C09CT("prompt")
    public final String prompt;

    @C09CT("req_json")
    public final String reqJson;

    @C09CT("req_key")
    public final String reqKey;

    @C09CT("time_out_second")
    public final Long timeOutSecond;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I2VTaskInput)) {
            return false;
        }
        I2VTaskInput i2VTaskInput = (I2VTaskInput) obj;
        return Intrinsics.LJFF(this.LIZ, i2VTaskInput.LIZ) && Intrinsics.LJFF(this.LIZIZ, i2VTaskInput.LIZIZ) && Intrinsics.LJFF(this.LIZJ, i2VTaskInput.LIZJ) && Intrinsics.LJFF(this.LIZLLL, i2VTaskInput.LIZLLL) && Intrinsics.LJFF(this.LJ, i2VTaskInput.LJ) && Intrinsics.LJFF(this.LJFF, i2VTaskInput.LJFF) && Intrinsics.LJFF(this.LJI, i2VTaskInput.LJI) && Intrinsics.LJFF(this.LJII, i2VTaskInput.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, i2VTaskInput.LJIIIIZZ) && Intrinsics.LJFF(this.prompt, i2VTaskInput.prompt) && this.LJIIIZ == i2VTaskInput.LJIIIZ && this.LJIIJ == i2VTaskInput.LJIIJ && Intrinsics.LJFF(this.algoReq, i2VTaskInput.algoReq) && Intrinsics.LJFF(this.reqKey, i2VTaskInput.reqKey) && Intrinsics.LJFF(this.reqJson, i2VTaskInput.reqJson) && Intrinsics.LJFF(this.algoParam, i2VTaskInput.algoParam) && Intrinsics.LJFF(this.extra, i2VTaskInput.extra) && Intrinsics.LJFF(this.timeOutSecond, i2VTaskInput.timeOutSecond) && Intrinsics.LJFF(this.LJIIJJI, i2VTaskInput.LJIIJJI) && Intrinsics.LJFF(this.imageLocalPathList, i2VTaskInput.imageLocalPathList) && Intrinsics.LJFF(this.LJIIL, i2VTaskInput.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, i2VTaskInput.LJIILIIL) && Intrinsics.LJFF(this.LJIILJJIL, i2VTaskInput.LJIILJJIL);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        INLEMediaSession iNLEMediaSession = this.LIZIZ;
        int iHashCode2 = (iHashCode + (iNLEMediaSession == null ? 0 : iNLEMediaSession.hashCode())) * 31;
        NLEEditor nLEEditor = this.LIZJ;
        int iHashCode3 = (((((((((((((((((((((((((((((iHashCode2 + (nLEEditor == null ? 0 : nLEEditor.hashCode())) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ.hashCode()) * 31) + this.prompt.hashCode()) * 31) + this.LJIIIZ.hashCode()) * 31) + this.LJIIJ) * 31) + this.algoReq.hashCode()) * 31) + this.reqKey.hashCode()) * 31) + this.reqJson.hashCode()) * 31) + this.algoParam.hashCode()) * 31) + this.extra.hashCode()) * 31;
        Long l = this.timeOutSecond;
        int iHashCode4 = (((((iHashCode3 + (l == null ? 0 : l.hashCode())) * 31) + this.LJIIJJI.hashCode()) * 31) + this.imageLocalPathList.hashCode()) * 31;
        NLETrackSlot nLETrackSlot = this.LJIIL;
        return ((((iHashCode4 + (nLETrackSlot != null ? nLETrackSlot.hashCode() : 0)) * 31) + this.LJIILIIL.hashCode()) * 31) + this.LJIILJJIL.hashCode();
    }

    public final String toString() {
        return "I2VTaskInput(creativeInfo=" + this.LIZ + ", nleSession=" + this.LIZIZ + ", nleEditor=" + this.LIZJ + ", videoSlotId=" + this.LIZLLL + ", name=" + this.LJ + ", iconUrl=" + this.LJFF + ", effectId=" + this.LJI + ", effectResourceId=" + this.LJII + ", templateId=" + this.LJIIIIZZ + ", prompt=" + this.prompt + ", source=" + this.LJIIIZ + ", seekCount=" + this.LJIIJ + ", algoReq=" + this.algoReq + ", reqKey=" + this.reqKey + ", reqJson=" + this.reqJson + ", algoParam=" + this.algoParam + ", extra=" + this.extra + ", timeOutSecond=" + this.timeOutSecond + ", aiCreationId=" + this.LJIIJJI + ", imageLocalPathList=" + this.imageLocalPathList + ", freezeSlot=" + this.LJIIL + ", businessScene=" + this.LJIILIIL + ", taskType=" + this.LJIILJJIL + ')';
    }

    public I2VTaskInput(CreativeInfo creativeInfo, INLEMediaSession iNLEMediaSession, NLEEditor nLEEditor, String str, String str2, String str3, String str4, String str5, String str6, String str7, Source source, int i, String str8, String str9, String str10, String str11, String str12, Long l, String str13, List<String> list, NLETrackSlot nLETrackSlot, String str14, String str15) {
        this.LIZ = creativeInfo;
        this.LIZIZ = iNLEMediaSession;
        this.LIZJ = nLEEditor;
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = str3;
        this.LJI = str4;
        this.LJII = str5;
        this.LJIIIIZZ = str6;
        this.prompt = str7;
        this.LJIIIZ = source;
        this.LJIIJ = i;
        this.algoReq = str8;
        this.reqKey = str9;
        this.reqJson = str10;
        this.algoParam = str11;
        this.extra = str12;
        this.timeOutSecond = l;
        this.LJIIJJI = str13;
        this.imageLocalPathList = list;
        this.LJIIL = nLETrackSlot;
        this.LJIILIIL = str14;
        this.LJIILJJIL = str15;
    }

    public I2VTaskInput(CreativeInfo creativeInfo, INLEMediaSession iNLEMediaSession, NLEEditor nLEEditor, String str, String str2, String str3, String str4, String str5, String str6, String str7, Source source, int i, String str8, String str9, String str10, String str11, String str12, Long l, String str13, List list, NLETrackSlot nLETrackSlot, String str14, String str15, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(creativeInfo, (i2 & 2) != 0 ? null : iNLEMediaSession, (i2 & 4) != 0 ? null : nLEEditor, str, (i2 & 16) != 0 ? "" : str2, (i2 & 32) != 0 ? "" : str3, (i2 & 64) != 0 ? "" : str4, (i2 & 128) != 0 ? "" : str5, (i2 & 256) != 0 ? "" : str6, (i2 & 512) != 0 ? "" : str7, (i2 & 1024) != 0 ? Source.EDITOR_PRO : source, (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? 20 : i, (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? "" : str8, (i2 & 8192) != 0 ? "" : str9, (i2 & 16384) != 0 ? "" : str10, (32768 & i2) != 0 ? "" : str11, (65536 & i2) != 0 ? "" : str12, (131072 & i2) != 0 ? null : l, (262144 & i2) != 0 ? "" : str13, (524288 & i2) != 0 ? C13BV.INSTANCE : list, (1048576 & i2) == 0 ? nLETrackSlot : null, (2097152 & i2) != 0 ? "" : str14, (i2 & 4194304) == 0 ? str15 : "");
    }
}
