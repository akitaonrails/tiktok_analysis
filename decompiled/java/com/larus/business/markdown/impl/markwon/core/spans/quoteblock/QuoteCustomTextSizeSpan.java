package com.larus.business.markdown.impl.markwon.core.spans.quoteblock;

import android.text.style.AbsoluteSizeSpan;

/* JADX INFO: loaded from: classes33.dex */
public final class QuoteCustomTextSizeSpan extends AbsoluteSizeSpan {
    public final boolean dip;
    public final int textSize;

    public QuoteCustomTextSizeSpan(int i) {
        super(i, true);
        this.textSize = i;
        this.dip = true;
    }
}
