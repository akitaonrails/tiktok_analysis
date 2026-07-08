package com.ss.android.ugc.aweme.verify.ocr;

import X.C09CT;

/* JADX INFO: loaded from: classes27.dex */
public final class MicroblinkFakeCheckResult {

    @C09CT("back_photo_copy_check_pass")
    public final String backPhotoCopyCheckPass;

    @C09CT("back_screen_check_pass")
    public final String backScreenCheckPass;

    @C09CT("front_photo_copy_check_pass")
    public final String frontPhotoCopyCheckPass;

    @C09CT("front_screen_check_pass")
    public final String frontScreenCheckPass;

    public MicroblinkFakeCheckResult() {
        this(null, null, null, null);
    }

    public MicroblinkFakeCheckResult(String str, String str2, String str3, String str4) {
        this.frontPhotoCopyCheckPass = str;
        this.backPhotoCopyCheckPass = str2;
        this.frontScreenCheckPass = str3;
        this.backScreenCheckPass = str4;
    }
}
