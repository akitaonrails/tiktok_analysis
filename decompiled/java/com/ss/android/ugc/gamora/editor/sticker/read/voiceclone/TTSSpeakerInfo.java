package com.ss.android.ugc.gamora.editor.sticker.read.voiceclone;

import X.C09CT;
import com.ss.android.ugc.aweme.editSticker.text.bean.ReadTextEffectSpeakerExtra;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class TTSSpeakerInfo {
    public ReadTextEffectSpeakerExtra LIZ;
    public Effect LIZIZ;

    @C09CT("build_status")
    public final String buildStatus;

    @C09CT("record_status")
    public final TTSRecordStatus recordStatus;

    @C09CT("speaker_id")
    public final String speakerId;

    @C09CT("stage")
    public final String stage;

    public TTSSpeakerInfo() {
        this("", null, "", "");
    }

    public final boolean LIZ() {
        return Intrinsics.LJFF(this.buildStatus.toLowerCase(Locale.getDefault()), "completed");
    }

    public final boolean LIZIZ() {
        return Intrinsics.LJFF(this.stage.toLowerCase(Locale.getDefault()), "private");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TTSSpeakerInfo(String str, TTSRecordStatus tTSRecordStatus, String str2, String str3) {
        this.speakerId = str;
        this.recordStatus = tTSRecordStatus;
        this.stage = str2;
        this.buildStatus = str3;
        this.LIZ = new ReadTextEffectSpeakerExtra(false, null, null, null, 0, 0, null, null, null, null, false, 0L, 0L, null, 16383, null);
        long j = 0;
        int i = -1;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        Object[] objArr3 = 0 == true ? 1 : 0;
        Object[] objArr4 = 0 == true ? 1 : 0;
        Object[] objArr5 = 0 == true ? 1 : 0;
        Object[] objArr6 = 0 == true ? 1 : 0;
        Object[] objArr7 = 0 == true ? 1 : 0;
        Object[] objArr8 = 0 == true ? 1 : 0;
        Object[] objArr9 = 0 == true ? 1 : 0;
        Object[] objArr10 = 0 == true ? 1 : 0;
        Object[] objArr11 = 0 == true ? 1 : 0;
        Object[] objArr12 = 0 == true ? 1 : 0;
        Object[] objArr13 = 0 == true ? 1 : 0;
        Object[] objArr14 = 0 == true ? 1 : 0;
        Object[] objArr15 = 0 == true ? 1 : 0;
        Object[] objArr16 = 0 == true ? 1 : 0;
        Object[] objArr17 = 0 == true ? 1 : 0;
        Object[] objArr18 = 0 == true ? 1 : 0;
        Object[] objArr19 = 0 == true ? 1 : 0;
        Object[] objArr20 = 0 == true ? 1 : 0;
        Object[] objArr21 = 0 == true ? 1 : 0;
        Object[] objArr22 = 0 == true ? 1 : 0;
        Object[] objArr23 = 0 == true ? 1 : 0;
        Object[] objArr24 = 0 == true ? 1 : 0;
        Object[] objArr25 = 0 == true ? 1 : 0;
        Object[] objArr26 = 0 == true ? 1 : 0;
        Object[] objArr27 = 0 == true ? 1 : 0;
        Object[] objArr28 = 0 == true ? 1 : 0;
        Object[] objArr29 = 0 == true ? 1 : 0;
        Object[] objArr30 = 0 == true ? 1 : 0;
        Object[] objArr31 = 0 == true ? 1 : 0;
        Object[] objArr32 = 0 == true ? 1 : 0;
        Object[] objArr33 = 0 == true ? 1 : 0;
        Object[] objArr34 = 0 == true ? 1 : 0;
        Object[] objArr35 = 0 == true ? 1 : 0;
        Object[] objArr36 = 0 == true ? 1 : 0;
        Object[] objArr37 = 0 == true ? 1 : 0;
        Object[] objArr38 = 0 == true ? 1 : 0;
        Object[] objArr39 = 0 == true ? 1 : 0;
        Object[] objArr40 = 0 == true ? 1 : 0;
        Object[] objArr41 = 0 == true ? 1 : 0;
        Object[] objArr42 = 0 == true ? 1 : 0;
        Object[] objArr43 = 0 == true ? 1 : 0;
        Object[] objArr44 = 0 == true ? 1 : 0;
        Object[] objArr45 = 0 == true ? 1 : 0;
        Object[] objArr46 = 0 == true ? 1 : 0;
        Object[] objArr47 = 0 == true ? 1 : 0;
        Object[] objArr48 = 0 == true ? 1 : 0;
        Object[] objArr49 = 0 == true ? 1 : 0;
        Object[] objArr50 = 0 == true ? 1 : 0;
        Object[] objArr51 = 0 == true ? 1 : 0;
        Object[] objArr52 = 0 == true ? 1 : 0;
        Object[] objArr53 = 0 == true ? 1 : 0;
        Object[] objArr54 = 0 == true ? 1 : 0;
        this.LIZIZ = new Effect(null, objArr, objArr2, objArr3, objArr4, objArr5, objArr6, objArr7, objArr8, objArr9, 0, objArr10, objArr11, objArr12, objArr13, objArr14, objArr15, objArr16, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr17, objArr18, objArr19, objArr20, objArr21, objArr22, objArr23, objArr24, objArr25, objArr26, 0 == true ? 1 : 0, objArr27, 0 == true ? 1 : 0, objArr28, objArr29, j, objArr30, objArr31, j, objArr32, objArr33, objArr34, objArr35, objArr36, 0 == true ? 1 : 0, objArr37, objArr38, objArr39, objArr40, objArr41, objArr42, objArr43, objArr44, objArr45, j, objArr46, objArr47, objArr48, j, j, objArr49, objArr50, objArr51, objArr52, objArr53, 0 == true ? 1 : 0, 0 == true ? 1 : 0, i, i, 15, objArr54);
    }
}
