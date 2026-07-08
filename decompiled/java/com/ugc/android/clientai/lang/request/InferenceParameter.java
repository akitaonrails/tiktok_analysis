package com.ugc.android.clientai.lang.request;

import X.C09CT;
import X.C2097608Jq;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes15.dex */
public final class InferenceParameter {
    public static final /* synthetic */ int LIZIZ = 0;
    public final Map<String, String> LIZ;

    @C09CT("diversity_penalty")
    public final float diversityPenalty;

    @C09CT("do_sample")
    public final boolean doSample;

    @C09CT("is_stream")
    public final boolean isStream;

    @C09CT("length_penalty")
    public final float lengthPenalty;

    @C09CT("max_new_length")
    public final int maxLength;

    @C09CT("num_beams")
    public final int numBeams;

    @C09CT("penalty_alpha")
    public final float penaltyAlpha;

    @C09CT("random_seed")
    public final int randomSeed;

    @C09CT("repeat_last_n")
    public final int repeatLastN;

    @C09CT("repetition_penalty")
    public final float repetitionPenalty;

    @C09CT("temperature")
    public final float temperature;

    @C09CT("top_k")
    public final int topK;

    @C09CT("top_p")
    public final float topP;

    @C09CT("typical_p")
    public final float typicalP;

    public InferenceParameter() {
        this(1, 100, false, 0.0f, 1.0f, 50, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0, false, 64, new LinkedHashMap());
    }

    public final Map<String, String> LIZ() {
        return C2097608Jq.LJIIL(C2097608Jq.LJIIIIZZ(new Pair("max_new_length", String.valueOf(this.maxLength)), new Pair("do_sample", String.valueOf(this.doSample)), new Pair("num_beams", String.valueOf(this.numBeams)), new Pair("penalty_alpha", String.valueOf(this.penaltyAlpha)), new Pair("temperature", String.valueOf(this.temperature)), new Pair("top_k", String.valueOf(this.topK)), new Pair("top_p", String.valueOf(this.topP)), new Pair("typical_p", String.valueOf(this.typicalP)), new Pair("diversity_penalty", String.valueOf(this.diversityPenalty)), new Pair("repetition_penalty", String.valueOf(this.repetitionPenalty)), new Pair("length_penalty", String.valueOf(this.lengthPenalty)), new Pair("random_seed", String.valueOf(this.randomSeed)), new Pair("is_stream", String.valueOf(this.isStream)), new Pair("repeat_last_n", String.valueOf(this.repeatLastN))), this.LIZ);
    }

    public InferenceParameter(int i, int i2, boolean z, float f, float f2, int i3, float f3, float f4, float f5, float f6, float f7, int i4, boolean z2, int i5, Map<String, String> map) {
        this.numBeams = i;
        this.maxLength = i2;
        this.doSample = z;
        this.penaltyAlpha = f;
        this.temperature = f2;
        this.topK = i3;
        this.topP = f3;
        this.typicalP = f4;
        this.diversityPenalty = f5;
        this.repetitionPenalty = f6;
        this.lengthPenalty = f7;
        this.randomSeed = i4;
        this.isStream = z2;
        this.repeatLastN = i5;
        this.LIZ = map;
    }
}
