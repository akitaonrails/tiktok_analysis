package com.bytedance.ies.xbridge.base.runtime.depend;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ActionSheetBuilder {
    public final List<ActionSheetBuilderAction> actions;
    public final Context context;
    public final String subtitle;
    public final String title;

    public ActionSheetBuilder(Context context, String str, String str2, List<ActionSheetBuilderAction> list) {
        this.context = context;
        this.title = str;
        this.subtitle = str2;
        this.actions = list;
    }
}
