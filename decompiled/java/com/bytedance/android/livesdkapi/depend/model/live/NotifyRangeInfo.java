package com.bytedance.android.livesdkapi.depend.model.live;

import X.C09CT;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class NotifyRangeInfo {
    public static final TypeAdapter ADAPTER = new NotifyRangeInfo_OptTypeAdapter(NormalGson.singleton());

    @C09CT("vertical_range")
    public List<Long> verticalRange = new ArrayList();

    @C09CT("horizontal_range")
    public List<Long> horizontalRange = new ArrayList();
}
