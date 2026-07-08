package com.bytedance.android.livesdk.model;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class BuriedFieldData {
    public static final TypeAdapter ADAPTER = new BuriedFieldData_OptTypeAdapter(NormalGson.singleton());

    @C09CT("ttlive_buried_field_reduction_is_buried_field")
    public boolean isBuriedField;

    @C09CT("ttlive_buried_field_reduction_unburied_field_list")
    public List<String> unBuriedFieldList = new ArrayList();
}
