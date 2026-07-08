package com.bytedance.pipo.verify.base.model;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes27.dex */
public final class OCRVerifySteps {

    @C09CT("all_steps")
    public final List<OCRVerifyStepItem> allSteps;

    @C09CT("title")
    public final String title;

    public OCRVerifySteps(String str, List<OCRVerifyStepItem> list) {
        this.title = str;
        this.allSteps = list;
    }
}
