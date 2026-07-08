package com.ss.android.ugc.aweme.tools.draft.monitor;

import X.C09CT;
import X.C570430MYv;

/* JADX INFO: loaded from: classes9.dex */
public final class DataBaseParams extends C570430MYv {

    @C09CT("dbOperation")
    public final String dbOperation;

    @C09CT("exception")
    public final Exception exception;

    @C09CT("occurrenceClass")
    public final String occurrenceClass;

    public DataBaseParams() {
        this("", "", null);
    }

    public DataBaseParams(String str, String str2, Exception exc) {
        this.dbOperation = str;
        this.occurrenceClass = str2;
        this.exception = exc;
    }
}
