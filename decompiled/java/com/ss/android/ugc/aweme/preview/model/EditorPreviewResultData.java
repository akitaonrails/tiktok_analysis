package com.ss.android.ugc.aweme.preview.model;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes29.dex */
public final class EditorPreviewResultData implements Serializable {
    public static final int $stable = 8;

    @C09CT("app_result")
    public final EditorPreviewAppResult appResult;

    public EditorPreviewResultData(EditorPreviewAppResult editorPreviewAppResult) {
        this.appResult = editorPreviewAppResult;
    }
}
