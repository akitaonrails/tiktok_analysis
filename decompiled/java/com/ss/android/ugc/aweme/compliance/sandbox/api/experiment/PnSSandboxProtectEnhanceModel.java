package com.ss.android.ugc.aweme.compliance.sandbox.api.experiment;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes14.dex */
public final class PnSSandboxProtectEnhanceModel {

    @C09CT("ignoreList")
    public final List<ExceptionInfo> ignoreList;

    public PnSSandboxProtectEnhanceModel() {
        this(null, 1, null);
    }

    public PnSSandboxProtectEnhanceModel(List<ExceptionInfo> list) {
        this.ignoreList = list;
    }

    public PnSSandboxProtectEnhanceModel(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list);
    }
}
