package com.ss.android.ugc.aweme.pipo.probe.core.infoupload;

import X.AnonymousClass1489;
import X.C09CT;

/* JADX INFO: loaded from: classes31.dex */
public final class ProbeUploadDataContent {

    @C09CT("fp_session_id")
    public String fpSessionId;

    @C09CT("mode")
    public String mode;

    @C09CT("sampled_at")
    public String sampledAt;

    @C09CT("snapshot")
    public AnonymousClass1489 snapshot;

    @C09CT("ttuid")
    public String ttUid;

    public ProbeUploadDataContent(String str, String str2, String str3, AnonymousClass1489 anonymousClass1489, String str4) {
        this.fpSessionId = str;
        this.mode = str2;
        this.sampledAt = str3;
        this.snapshot = anonymousClass1489;
        this.ttUid = str4;
    }
}
