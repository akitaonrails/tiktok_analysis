package com.ss.android.ugc.aweme.feed.model.banner;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class StandardComponentStruct implements Serializable {

    @C09CT("customized_info")
    public String customizedInfo;

    @C09CT("key")
    public StandardComponentKey key;

    @C09CT("signal")
    public StandardSignalStruct signal;

    @C09CT("tracer_info")
    public String traceInfo;

    @C09CT("ui")
    public StandardComponentUi ui;

    public StandardComponentStruct() {
        this(null, null, null, null, null);
    }

    public final boolean isCustomized() {
        StandardSignalStruct standardSignalStruct = this.signal;
        boolean z = false;
        if (standardSignalStruct != null && standardSignalStruct.code == SignalCodeEnum.NONE.getType()) {
            z = true;
        }
        return !z;
    }

    public final void setSignal(StandardSignalStruct standardSignalStruct) {
        this.signal = standardSignalStruct;
    }

    public StandardComponentStruct(StandardComponentKey standardComponentKey, StandardSignalStruct standardSignalStruct, StandardComponentUi standardComponentUi, String str, String str2) {
        this.key = standardComponentKey;
        this.signal = standardSignalStruct;
        this.ui = standardComponentUi;
        this.customizedInfo = str;
        this.traceInfo = str2;
    }
}
