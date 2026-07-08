package com.ss.android.ugc.aweme.commercialize.model;

import X.C09CT;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes17.dex */
public final class AnoleModel implements Serializable {

    @C09CT("component_relation")
    public final Map<String, AnoleComponentRelationModel> componentRelations;

    @C09CT("component_data")
    public final Map<String, AnoleComponentModel> components;

    @C09CT("template_id")
    public final long templateID;

    public AnoleModel(long j, Map<String, AnoleComponentRelationModel> map, Map<String, AnoleComponentModel> map2) {
        this.templateID = j;
        this.componentRelations = map;
        this.components = map2;
    }
}
