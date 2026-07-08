package com.bytedance.android.livesdk.model.message;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class AtmosphereTagInfo {

    @C09CT("atmosphere_tags")
    public List<ProductAtmosphereTag> atmosphereTags = new ArrayList();

    @C09CT("pin_atmosphere_tags")
    public List<ProductAtmosphereTag> pinAtmosphereTags = new ArrayList();

    @C09CT("tag_type")
    public int tagType;
}
