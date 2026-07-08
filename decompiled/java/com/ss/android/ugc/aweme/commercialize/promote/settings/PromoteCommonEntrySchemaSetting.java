package com.ss.android.ugc.aweme.commercialize.promote.settings;

import X.C09CT;

/* JADX INFO: loaded from: classes29.dex */
public final class PromoteCommonEntrySchemaSetting {
    public static final PromoteCommonEntrySchema LIZ;

    static {
        new PromoteCommonEntrySchemaSetting();
        LIZ = new PromoteCommonEntrySchema(null, null);
    }

    public static final class PromoteCommonEntrySchema {

        @C09CT("normal")
        public final String normal;

        @C09CT("popup")
        public final String popup;

        public PromoteCommonEntrySchema(String str, String str2) {
            this.normal = str;
            this.popup = str2;
        }
    }
}
