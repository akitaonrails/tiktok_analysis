package com.bytedance.pumbaa.app2app;

import X.C09CT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class SandboxApp2AppConfigData {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("enableAsyncUpload")
    public final boolean enableAsyncUpload;

    @C09CT("enableCollectAutoDFIDALL")
    public final boolean enableCollectAutoDFIDALL;

    @C09CT("enableSelfPackageFilter")
    public final boolean enableSelfPackageFilter;

    @C09CT("enableUploadValue")
    public final boolean enableUploadValue;

    @C09CT("schemeSkipList")
    public final List<String> schemeSkipList;

    public SandboxApp2AppConfigData() {
        this(false, true, false, null, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SandboxApp2AppConfigData)) {
            return false;
        }
        SandboxApp2AppConfigData sandboxApp2AppConfigData = (SandboxApp2AppConfigData) obj;
        return this.enable == sandboxApp2AppConfigData.enable && this.enableSelfPackageFilter == sandboxApp2AppConfigData.enableSelfPackageFilter && this.enableUploadValue == sandboxApp2AppConfigData.enableUploadValue && Intrinsics.LJFF(this.schemeSkipList, sandboxApp2AppConfigData.schemeSkipList) && this.enableAsyncUpload == sandboxApp2AppConfigData.enableAsyncUpload && this.enableCollectAutoDFIDALL == sandboxApp2AppConfigData.enableCollectAutoDFIDALL;
    }

    public SandboxApp2AppConfigData(boolean z, boolean z2, boolean z3, List<String> list, boolean z4, boolean z5) {
        this.enable = z;
        this.enableSelfPackageFilter = z2;
        this.enableUploadValue = z3;
        this.schemeSkipList = list;
        this.enableAsyncUpload = z4;
        this.enableCollectAutoDFIDALL = z5;
    }
}
