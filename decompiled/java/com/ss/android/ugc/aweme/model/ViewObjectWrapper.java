package com.ss.android.ugc.aweme.model;

import X.C09CT;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ViewObjectWrapper implements Serializable {

    @C09CT("commonLogParams")
    public final CommonLogParams commonLogParams;

    @C09CT("dynamicData")
    public final Map<String, Object> dynamicData;

    @C09CT("extraData")
    public final ExtraData extraData;

    @C09CT("renderInfo")
    public final ViewObject renderInfo;

    public ViewObjectWrapper(ViewObject viewObject, Map<String, ? extends Object> map, CommonLogParams commonLogParams, ExtraData extraData) {
        this.renderInfo = viewObject;
        this.dynamicData = map;
        this.commonLogParams = commonLogParams;
        this.extraData = extraData;
    }
}
