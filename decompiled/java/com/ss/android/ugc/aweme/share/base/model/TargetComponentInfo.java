package com.ss.android.ugc.aweme.share.base.model;

import X.C09CT;
import X.C1697810uHb;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class TargetComponentInfo {

    @C09CT("enable_share_modes")
    public final List<Integer> shareModes;

    @C09CT("target_class_name")
    public final String targetClassName;

    @C09CT("target_class_name_list")
    public final List<TargetClassItem> targetClassNameList;

    public TargetComponentInfo() {
        this("", C1697810uHb.LJ(0), new ArrayList());
    }

    public TargetComponentInfo(String str, List<Integer> list, List<TargetClassItem> list2) {
        this.targetClassName = str;
        this.shareModes = list;
        this.targetClassNameList = list2;
    }
}
