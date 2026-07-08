package com.ss.android.ugc.aweme.ecommerce.base.osp.module.extrafee;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ExtraFeeDialog {

    @C09CT("button")
    public ExtraFeeButton button;

    @C09CT("contents")
    public List<String> content;

    @C09CT("title")
    public String title;

    public ExtraFeeDialog() {
    }

    public ExtraFeeDialog(String str, List<String> list, ExtraFeeButton extraFeeButton) {
        this.title = str;
        this.content = list;
        this.button = extraFeeButton;
    }
}
