package com.ss.android.ugc.aweme.feed.model.banner;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class StandardElementStruct implements Serializable {

    @C09CT("customized_info")
    public String customizedInfo;

    @C09CT("key")
    public StandardElementKey key;

    @C09CT("signal")
    public StandardSignalStruct signal;

    @C09CT("tracer_info")
    public String traceInfo;

    @C09CT("ui")
    public StandardElementUi ui;

    public StandardElementStruct() {
        this(null, null, null, null, null);
    }

    public final void setSignal(StandardSignalStruct standardSignalStruct) {
        this.signal = standardSignalStruct;
    }

    public StandardElementStruct(StandardElementKey standardElementKey, StandardSignalStruct standardSignalStruct, StandardElementUi standardElementUi, String str, String str2) {
        this.key = standardElementKey;
        this.signal = standardSignalStruct;
        this.ui = standardElementUi;
        this.customizedInfo = str;
        this.traceInfo = str2;
    }
}
