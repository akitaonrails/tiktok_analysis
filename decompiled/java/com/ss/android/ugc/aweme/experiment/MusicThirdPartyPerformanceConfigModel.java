package com.ss.android.ugc.aweme.experiment;

import X.C09CT;
import X.C13BV;
import java.util.List;

/* JADX INFO: loaded from: classes29.dex */
public final class MusicThirdPartyPerformanceConfigModel {

    @C09CT("enable")
    public final boolean enable;

    @C09CT("host")
    public final List<String> host;

    @C09CT("sub_type")
    public final List<String> subType;

    public MusicThirdPartyPerformanceConfigModel() {
        C13BV c13bv = C13BV.INSTANCE;
        this.host = c13bv;
        this.subType = c13bv;
    }
}
