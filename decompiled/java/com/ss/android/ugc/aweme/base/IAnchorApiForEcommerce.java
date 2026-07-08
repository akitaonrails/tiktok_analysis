package com.ss.android.ugc.aweme.base;

import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes17.dex */
public interface IAnchorApiForEcommerce {
    void LIZ(Dialog dialog);

    View commonAnchorItemProduceOne(ViewGroup viewGroup, Function0<Integer> function0, Function0<String> function02);

    boolean containAnchors(List<Integer> list);
}
