package com.ss.android.ugc.aweme.aigc;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes29.dex */
public final class C2paMinorEditConfig {

    @C09CT("minor_edit_digital_source_type_list")
    public final List<String> digitalSourceTypeList;

    @C09CT("minor_edit_software_agent_list")
    public final List<String> softWareAgentList;

    public C2paMinorEditConfig() {
        this(null, null, 3, null);
    }

    public C2paMinorEditConfig(List<String> list, List<String> list2) {
        this.softWareAgentList = list;
        this.digitalSourceTypeList = list2;
    }

    public C2paMinorEditConfig(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? C13BV.INSTANCE : list2);
    }
}
