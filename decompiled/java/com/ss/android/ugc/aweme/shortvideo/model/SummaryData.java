package com.ss.android.ugc.aweme.shortvideo.model;

import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class SummaryData {
    public final TemplateSlot audioSlot;
    public List<Integer> featureCodes;
    public List<String> featuresList;
    public List<String> fusionMusicIds;
    public final boolean isUsingServerMagic;
    public final List<TemplateSlot> slots;
    public final boolean usingMagic;
    public final boolean usingMatting;

    public final boolean isUsingServerMagic() {
        return this.isUsingServerMagic;
    }

    public final void setFeatureCodes(List<Integer> list) {
        this.featureCodes = list;
    }

    public final void setFeaturesList(List<String> list) {
        this.featuresList = list;
    }

    public final void setFusionMusicIds(List<String> list) {
        this.fusionMusicIds = list;
    }

    public SummaryData(List<TemplateSlot> list, TemplateSlot templateSlot, boolean z, boolean z2, boolean z3, List<String> list2, List<Integer> list3, List<String> list4) {
        this.slots = list;
        this.audioSlot = templateSlot;
        this.usingMatting = z;
        this.usingMagic = z2;
        this.isUsingServerMagic = z3;
        this.featuresList = list2;
        this.featureCodes = list3;
        this.fusionMusicIds = list4;
    }
}
