package com.bytedance.ies.ugc.statisticlogger.btm;

import X.C09CT;
import X.C13BV;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes25.dex */
public final class FixErrorModel implements Serializable {

    @C09CT("fix_back2main_tabpage_whitelist")
    public final List<String> fixBack2MainTabPageWhiteList;

    @C09CT("fix_back2main_toppage_whitelist")
    public final List<String> fixBack2MainTopPageWhiteList;

    @C09CT("fix_fragment")
    public final boolean fixFragment;

    @C09CT("fix_fragment_pre_white_list")
    public final List<String> fixFragmentPreWhiteList;

    @C09CT("fix_fragment_target_white_list")
    public final List<String> fixFragmentTargetWhiteList;

    @C09CT("fix_fragment_target_white_list2")
    public final List<String> fixFragmentTargetWhiteList2;

    @C09CT("fix_intent")
    public final boolean fixIntent;

    public FixErrorModel() {
        this(false, false, null, null, null, null, null, 127, null);
    }

    public FixErrorModel(boolean z, boolean z2, List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5) {
        this.fixIntent = z;
        this.fixFragment = z2;
        this.fixFragmentPreWhiteList = list;
        this.fixFragmentTargetWhiteList = list2;
        this.fixFragmentTargetWhiteList2 = list3;
        this.fixBack2MainTabPageWhiteList = list4;
        this.fixBack2MainTopPageWhiteList = list5;
    }

    public FixErrorModel(boolean z, boolean z2, List list, List list2, List list3, List list4, List list5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) == 0 ? z2 : false, (i & 4) != 0 ? C13BV.INSTANCE : list, (i & 8) != 0 ? C13BV.INSTANCE : list2, (i & 16) != 0 ? C13BV.INSTANCE : list3, (i & 32) != 0 ? C13BV.INSTANCE : list4, (i & 64) != 0 ? C13BV.INSTANCE : list5);
    }
}
