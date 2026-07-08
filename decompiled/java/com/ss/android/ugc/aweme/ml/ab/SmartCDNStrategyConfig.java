package com.ss.android.ugc.aweme.ml.ab;

import X.C09CT;

/* JADX INFO: loaded from: classes24.dex */
public final class SmartCDNStrategyConfig {

    @C09CT("score_min_threshold")
    public int score_min_threshold;

    @C09CT("name")
    public String name = "basic";

    @C09CT("n_records")
    public int n_records = 2;

    @C09CT("n_samples")
    public int n_samples = 1;

    @C09CT("mu")
    public int mu = 2000;

    @C09CT("sigma")
    public int sigma = 500;

    @C09CT("exploration_ratio")
    public float exploration_ratio = 0.1f;

    @C09CT("score_norm_ratio")
    public float score_norm_ratio = 0.001f;

    @C09CT("score_max_threshold")
    public int score_max_threshold = 10000;

    public final float getExploration_ratio() {
        return this.exploration_ratio;
    }

    public final int getMu() {
        return this.mu;
    }

    public final int getN_records() {
        return this.n_records;
    }

    public final int getN_samples() {
        return this.n_samples;
    }

    public final String getName() {
        return this.name;
    }

    public final int getScore_max_threshold() {
        return this.score_max_threshold;
    }

    public final int getScore_min_threshold() {
        return this.score_min_threshold;
    }

    public final float getScore_norm_ratio() {
        return this.score_norm_ratio;
    }

    public final int getSigma() {
        return this.sigma;
    }

    public final void setExploration_ratio(float f) {
        this.exploration_ratio = f;
    }

    public final void setMu(int i) {
        this.mu = i;
    }

    public final void setN_records(int i) {
        this.n_records = i;
    }

    public final void setN_samples(int i) {
        this.n_samples = i;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setScore_max_threshold(int i) {
        this.score_max_threshold = i;
    }

    public final void setScore_min_threshold(int i) {
        this.score_min_threshold = i;
    }

    public final void setScore_norm_ratio(float f) {
        this.score_norm_ratio = f;
    }

    public final void setSigma(int i) {
        this.sigma = i;
    }
}
