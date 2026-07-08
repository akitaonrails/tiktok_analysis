package com.ss.android.ugc.aweme.commercialize.model;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public final class AnoleComponentRelationModel implements Serializable {

    @C09CT("dependencies")
    public final List<String> dependencies;

    @C09CT("hide")
    public final List<AnoleComponentAppearModel> hideModels;

    @C09CT("show")
    public final List<AnoleComponentAppearModel> showModels;

    public AnoleComponentRelationModel(List<AnoleComponentAppearModel> list, List<AnoleComponentAppearModel> list2, List<String> list3) {
        this.showModels = list;
        this.hideModels = list2;
        this.dependencies = list3;
    }
}
