package com.bytedance.ies.sdk.widgets.recycleelement;

import android.view.View;
import java.util.HashMap;

/* JADX INFO: loaded from: classes18.dex */
public final class RecycleLayeredElementManger {
    public static final RecycleLayeredElementManger INSTANCE = new RecycleLayeredElementManger();
    public static final HashMap<View, IRecycleLayeredElementManager> managerMap = new HashMap<>();

    public final void release() {
        managerMap.clear();
    }

    public final IRecycleLayeredElementManager getManagerByView(View view) {
        if (view == null) {
            return null;
        }
        return managerMap.get(view);
    }

    public final void recycle(View view, IRecycleLayeredElementManager iRecycleLayeredElementManager) {
        if (iRecycleLayeredElementManager == null) {
            return;
        }
        iRecycleLayeredElementManager.recycle();
        managerMap.put(view, iRecycleLayeredElementManager);
    }
}
