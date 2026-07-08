package com.bytedance.android.livesdk.dialog;

import X.C786410Ut5;
import android.app.Dialog;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes29.dex */
public final class BroadcastDialogDispatcher extends PriorityTaskDispatcher {
    public final ArrayList<Dialog> LLILZLL = new ArrayList<>();

    @Override // com.bytedance.android.livesdk.dialog.PriorityTaskDispatcher, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        Iterator<Dialog> it2 = this.LLILZLL.iterator();
        while (it2.hasNext()) {
            C786410Ut5.LIZIZ(it2.next());
        }
        this.LLILZLL.clear();
    }

    @Override // com.bytedance.android.livesdk.dialog.PriorityTaskDispatcher, X.InterfaceC777420Uea
    public final void addDialogToManager(Dialog dialog) {
        this.LLILZLL.add(dialog);
    }
}
