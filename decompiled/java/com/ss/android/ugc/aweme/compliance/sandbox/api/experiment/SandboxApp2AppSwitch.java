package com.ss.android.ugc.aweme.compliance.sandbox.api.experiment;

import X.C09CT;

/* JADX INFO: loaded from: classes14.dex */
public final class SandboxApp2AppSwitch {
    public static final SandboxApp2AppConfigData LIZ = new SandboxApp2AppConfigData(true, false);

    public static final class SandboxApp2AppConfigData {

        @C09CT("enable")
        public final boolean enable;

        @C09CT("useAutoDFID")
        public final boolean useAutoDFID;

        public SandboxApp2AppConfigData() {
            this(true, false);
        }

        public SandboxApp2AppConfigData(boolean z, boolean z2) {
            this.enable = z;
            this.useAutoDFID = z2;
        }
    }
}
