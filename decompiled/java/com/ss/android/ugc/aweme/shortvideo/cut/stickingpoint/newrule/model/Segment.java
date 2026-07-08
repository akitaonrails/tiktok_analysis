package com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.newrule.model;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes31.dex */
public final class Segment {

    @C09CT("chorus_prob")
    public final Double chorusProb;

    @C09CT("decision")
    public final String decision;

    @C09CT("duration")
    public final double duration;

    @C09CT("end_prob")
    public final double endProb;

    @C09CT("function_label")
    public final int functionLabel;

    @C09CT("function_name")
    public final String functionName;

    @C09CT("function_prob")
    public final Double functionProb;

    @C09CT("interval")
    public final List<Double> interval;

    @C09CT("res_duration")
    public final Double restDuration;

    @C09CT("start_prob")
    public final double startProb;

    public Segment() {
        this(0.0d, 0.0d, 0.0d, null, null, null, null, 0, null, null, 1023, null);
    }

    public Segment(double d, double d2, double d3, List<Double> list, Double d4, Double d5, Double d6, int i, String str, String str2) {
        this.startProb = d;
        this.endProb = d2;
        this.duration = d3;
        this.interval = list;
        this.restDuration = d4;
        this.chorusProb = d5;
        this.functionProb = d6;
        this.functionLabel = i;
        this.functionName = str;
        this.decision = str2;
    }

    public Segment(double d, double d2, double d3, List list, Double d4, Double d5, Double d6, int i, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0.0d : d, (i2 & 2) != 0 ? 0.0d : d2, (i2 & 4) == 0 ? d3 : 0.0d, (i2 & 8) != 0 ? C13BV.INSTANCE : list, (i2 & 16) != 0 ? null : d4, (i2 & 32) != 0 ? null : d5, (i2 & 64) != 0 ? null : d6, (i2 & 128) != 0 ? 0 : i, (i2 & 256) != 0 ? null : str, (i2 & 512) == 0 ? str2 : null);
    }
}
