package com.squareup.wire;

import X.C08FF;

/* JADX INFO: loaded from: classes24.dex */
public @interface WireField {

    public enum Label {
        REQUIRED,
        OPTIONAL,
        REPEATED,
        ONE_OF,
        PACKED;

        public final boolean LJJLJ() {
            return this == REPEATED || this == PACKED;
        }

        public static Label valueOf(String str) {
            return (Label) C08FF.LIZ(Label.class, str);
        }
    }

    String adapter();

    String keyAdapter() default "";

    Label label() default Label.OPTIONAL;

    boolean redacted() default false;

    int tag();
}
