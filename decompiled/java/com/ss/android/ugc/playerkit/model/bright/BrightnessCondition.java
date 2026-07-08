package com.ss.android.ugc.playerkit.model.bright;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class BrightnessCondition {
    public List<Integer> dividingOther;
    public int dividingStep = 20;
    public int dividingMax = 255;

    public int getDividingMax() {
        return this.dividingMax;
    }

    public List<Integer> getDividingOther() {
        return this.dividingOther;
    }

    public int getDividingStep() {
        return this.dividingStep;
    }

    public void setDividingMax(int i) {
        this.dividingMax = i;
    }

    public void setDividingOther(List<Integer> list) {
        this.dividingOther = list;
    }

    public void setDividingStep(int i) {
        this.dividingStep = i;
    }
}
