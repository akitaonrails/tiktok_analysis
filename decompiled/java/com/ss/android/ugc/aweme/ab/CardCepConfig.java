package com.ss.android.ugc.aweme.ab;

import X.C09CT;
import X.C13BV;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes25.dex */
public final class CardCepConfig {

    @C09CT("async_event")
    public final boolean asyncEvent;

    @C09CT("cep_engine_value")
    public final int cepEngineValue;

    @C09CT("default_slate_group_type")
    public final String defaultSlateGroupType;

    @C09CT("error_handle")
    public final int errorHandle;

    @C09CT("fix_init")
    public final boolean fixCepInit;

    @C09CT("frequency_control")
    public final int frequencyControl;

    @C09CT("gap_block_list")
    public final List<String> gapBlockList;

    @C09CT("gap_block_real_time")
    public final int gapBlockRealTime;

    @C09CT("gap_block_replace")
    public final int gapBlockReplace;

    @C09CT("log_cep_enable")
    public final boolean logCepEnable;

    @C09CT("real_time_enable")
    public final boolean realTimeEnable;

    @C09CT("cep_rule_list")
    public final List<String> ruleList;

    @C09CT("selected_gap")
    public final int selectedGap;

    public CardCepConfig() {
        this(0, 0, null, false, 0, false, 0, false, false, null, 0, null, 0, 8191, null);
    }

    public CardCepConfig(int i, int i2, List<String> list, boolean z, int i3, boolean z2, int i4, boolean z3, boolean z4, List<String> list2, int i5, String str, int i6) {
        this.gapBlockRealTime = i;
        this.gapBlockReplace = i2;
        this.gapBlockList = list;
        this.asyncEvent = z;
        this.frequencyControl = i3;
        this.fixCepInit = z2;
        this.cepEngineValue = i4;
        this.logCepEnable = z3;
        this.realTimeEnable = z4;
        this.ruleList = list2;
        this.selectedGap = i5;
        this.defaultSlateGroupType = str;
        this.errorHandle = i6;
    }

    public CardCepConfig(int i, int i2, List list, boolean z, int i3, boolean z2, int i4, boolean z3, boolean z4, List list2, int i5, String str, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0 : i, (i7 & 2) != 0 ? 0 : i2, (i7 & 4) != 0 ? C13BV.INSTANCE : list, (i7 & 8) != 0 ? true : z, (i7 & 16) != 0 ? 0 : i3, (i7 & 32) != 0 ? false : z2, (i7 & 64) != 0 ? 0 : i4, (i7 & 128) == 0 ? z3 : true, (i7 & 256) == 0 ? z4 : false, (i7 & 512) != 0 ? Collections.singletonList("delte_trigger") : list2, (i7 & 1024) != 0 ? 120 : i5, (i7 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? "100005" : str, (i7 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? 7 : i6);
    }
}
