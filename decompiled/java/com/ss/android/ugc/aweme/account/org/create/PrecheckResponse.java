package com.ss.android.ugc.aweme.account.org.create;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public final class PrecheckResponse implements Serializable {
    public static final int $stable = 0;

    @C09CT("data")
    public final Data data;

    @C09CT("message")
    public final String message;

    public PrecheckResponse() {
        this("", new Data(null, null));
    }

    public static final class Data implements Serializable {
        public static final int $stable = 0;

        @C09CT("description")
        public final String description;

        @C09CT("error_code")
        public final Integer errorCode;

        public Data() {
            this(null, null);
        }

        public Data(String str, Integer num) {
            this.description = str;
            this.errorCode = num;
        }
    }

    public PrecheckResponse(String str, Data data) {
        this.message = str;
        this.data = data;
    }
}
