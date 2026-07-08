package com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class AlgorithmData {

    @C09CT("C3FeatureData")
    public C3FeatureData c3FeatureData;

    @C09CT("ClassifyFeatureData")
    public ClassifyData classifyData;

    @C09CT("FacedFeatureData")
    public FacedFeatureData facedFeatureData;

    @C09CT("NhFeatureData")
    public NhFeatureData nhFeatureData;
    public List<String> vAlgorithmList;

    public AlgorithmData() {
        this(new ArrayList(), new FacedFeatureData(new ArrayList()), new C3FeatureData(null, 1, null), new NhFeatureData(null, 1, null), new ClassifyData(null, null, 3, null));
    }

    public final void setC3FeatureData(C3FeatureData c3FeatureData) {
        this.c3FeatureData = c3FeatureData;
    }

    public final void setClassifyData(ClassifyData classifyData) {
        this.classifyData = classifyData;
    }

    public final void setFacedFeatureData(FacedFeatureData facedFeatureData) {
        this.facedFeatureData = facedFeatureData;
    }

    public final void setNhFeatureData(NhFeatureData nhFeatureData) {
        this.nhFeatureData = nhFeatureData;
    }

    public final void setVAlgorithmList(List<String> list) {
        this.vAlgorithmList = list;
    }

    public AlgorithmData(List<String> list, FacedFeatureData facedFeatureData, C3FeatureData c3FeatureData, NhFeatureData nhFeatureData, ClassifyData classifyData) {
        this.vAlgorithmList = list;
        this.facedFeatureData = facedFeatureData;
        this.c3FeatureData = c3FeatureData;
        this.nhFeatureData = nhFeatureData;
        this.classifyData = classifyData;
    }
}
