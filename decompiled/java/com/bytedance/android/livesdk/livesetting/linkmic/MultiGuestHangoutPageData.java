package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C09CT;
import X.C13BV;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
public final class MultiGuestHangoutPageData {
    public static final TypeAdapter ADAPTER = new MultiGuestHangoutPageData_OptTypeAdapter(NormalGson.singleton());

    @C09CT("interaction_module_array")
    public List<InteractionModule> interactionModuleArray;

    @C09CT("tab_module_array")
    public List<TabModule> tabModuleArray;

    public MultiGuestHangoutPageData() {
        this(null, null, 3, null);
    }

    public MultiGuestHangoutPageData(List<InteractionModule> list, List<TabModule> list2) {
        this.interactionModuleArray = list;
        this.tabModuleArray = list2;
    }

    public MultiGuestHangoutPageData(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2);
    }
}
