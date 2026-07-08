package com.bytedance.android.livesdk.broadcast.interaction.config;

import X.C780620Ujk;
import androidx.lifecycle.ViewModel;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public final class WidgetLoadViewModel extends ViewModel {
    public volatile C780620Ujk LL;

    public final void vQ2() {
        C780620Ujk c780620Ujk = this.LL;
        if (c780620Ujk != null) {
            c780620Ujk.LIZ.clear();
            c780620Ujk.LIZIZ.clear();
            c780620Ujk.LIZJ.clear();
            ((ArrayList) c780620Ujk.LIZLLL).clear();
            ((ArrayList) c780620Ujk.LJ).clear();
            c780620Ujk.LJFF = null;
        }
        this.LL = null;
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        vQ2();
    }
}
