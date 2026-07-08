package com.bytedance.android.livesdk.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Paragraph {

    @C09CT("editable")
    public boolean editable;

    @C09CT("max_char_limit")
    public long maxCharLimit;

    @C09CT("paragraph_id")
    public long paragraphId;

    @C09CT("spans")
    public List<TextSpan> spans = new ArrayList();

    @C09CT("style_ref")
    public String styleRef = "";

    public static final class TextSpan {

        @C09CT("text")
        public String text = "";

        @C09CT("style_ref")
        public String styleRef = "";
    }
}
