package com.ss.android.ugc.aweme.feed.model.banner;

import X.C09CT;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class StandardSignalStruct implements Serializable {

    @C09CT("auto_display")
    public Boolean autoDisplay;

    @C09CT("code")
    public int code;

    @C09CT("releasable")
    public Boolean releasable;

    @C09CT("timing_keys")
    public List<String> timingKeys;

    public StandardSignalStruct() {
        this(SignalCodeEnum.NONE.getType(), null, null, null);
    }

    public StandardSignalStruct(int i, List<String> list, Boolean bool, Boolean bool2) {
        this.code = i;
        this.timingKeys = list;
        this.autoDisplay = bool;
        this.releasable = bool2;
    }
}
