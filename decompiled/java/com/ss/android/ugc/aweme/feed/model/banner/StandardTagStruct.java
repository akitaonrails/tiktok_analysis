package com.ss.android.ugc.aweme.feed.model.banner;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class StandardTagStruct implements Serializable {

    @C09CT("customized_info")
    public String customizedInfo;

    @C09CT("key")
    public StandardTagKey key;

    @C09CT("signal")
    public StandardSignalStruct signal;

    @C09CT("tracer_info")
    public String traceInfo;

    @C09CT("ui")
    public StandardTagUiWrapper ui;

    public StandardTagStruct() {
        this(null, null, null, null, null);
    }

    public final void setSignal(StandardSignalStruct standardSignalStruct) {
        this.signal = standardSignalStruct;
    }

    public StandardTagStruct(StandardTagKey standardTagKey, StandardSignalStruct standardSignalStruct, StandardTagUiWrapper standardTagUiWrapper, String str, String str2) {
        this.key = standardTagKey;
        this.signal = standardSignalStruct;
        this.ui = standardTagUiWrapper;
        this.customizedInfo = str;
        this.traceInfo = str2;
    }
}
