package com.bytedance.android.livestrategy.config;

import X.C09CT;
import X.C13BV;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes18.dex */
public final class FeatureCenter {
    public static final TypeAdapter ADAPTER = new FeatureCenter_OptTypeAdapter(NormalGson.singleton());

    @C09CT("pitayaNativeBusiness")
    public List<String> pitayaNativeBusiness;

    @C09CT("pitayaPythonBusiness")
    public List<String> pitayaPythonBusiness;

    @C09CT("portraitConfig")
    public List<String> portraitConfig;

    @C09CT("pspBusiness")
    public List<String> pspBusiness;

    public FeatureCenter() {
        this(null, null, null, null, 15, null);
    }

    public FeatureCenter(List<String> list, List<String> list2, List<String> list3, List<String> list4) {
        this.pitayaPythonBusiness = list;
        this.pitayaNativeBusiness = list2;
        this.pspBusiness = list3;
        this.portraitConfig = list4;
    }

    public FeatureCenter(List list, List list2, List list3, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2, (i & 4) != 0 ? C13BV.INSTANCE : list3, (i & 8) != 0 ? C13BV.INSTANCE : list4);
    }
}
