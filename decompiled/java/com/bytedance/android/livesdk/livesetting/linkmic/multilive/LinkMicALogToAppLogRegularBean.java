package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C09CT;
import X.C13BV;
import X.C1697810uHb;
import com.bytedance.android.live_settings.NormalGson;
import com.google.gson.TypeAdapter;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes34.dex */
public final class LinkMicALogToAppLogRegularBean {
    public static final TypeAdapter ADAPTER = new LinkMicALogToAppLogRegularBean_OptTypeAdapter(NormalGson.singleton());

    @C09CT("block_list")
    public List<String> blockList;

    @C09CT("level_allow_list")
    public List<String> levelAllowList;

    @C09CT("role_allow_list")
    public List<String> roleAllowList;

    @C09CT("tag_module_allow_list")
    public List<String> tagModuleAllowList;

    @C09CT("white_list")
    public List<String> whiteList;

    public LinkMicALogToAppLogRegularBean() {
        this(null, null, null, null, null, 31, null);
    }

    public LinkMicALogToAppLogRegularBean(List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5) {
        this.tagModuleAllowList = list;
        this.whiteList = list2;
        this.blockList = list3;
        this.levelAllowList = list4;
        this.roleAllowList = list5;
    }

    public LinkMicALogToAppLogRegularBean(List list, List list2, List list3, List list4, List list5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2, (i & 4) != 0 ? C13BV.INSTANCE : list3, (i & 8) != 0 ? C13BV.INSTANCE : list4, (i & 16) != 0 ? C1697810uHb.LJIIJJI("a", "g", "v") : list5);
    }
}
