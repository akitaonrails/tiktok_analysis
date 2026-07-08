package com.ss.android.ugc.aweme.shortvideo.ui;

import X.C0BMP;
import X.C19A3;
import X.C201955140j;
import X.C294080Bfq;
import X.C786410Ut5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.shortvideo.x2;
import com.zhiliaoapp.musically.R;
import lth.o;

/* JADX INFO: loaded from: classes26.dex */
public class kg extends C19A3 {
    public x2 LLJILLL;
    public boolean LLJJ;

    public final void LLLLIIIILLL() {
        C201955140j.LIZ("VideoRecordContainerScene loadInternal() add PlanC to layout");
        x2 x2Var = this.LLJILLL;
        if (x2Var != null) {
            Scene sceneFindSceneByTag = findSceneByTag("PlanC");
            if (sceneFindSceneByTag != null) {
                remove(sceneFindSceneByTag);
            }
            add(R.id.szh, x2Var, "PlanC");
            this.LLJJ = true;
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroy() {
        super.onDestroy();
        o.LJI.Ok();
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        if (C294080Bfq.LIZ()) {
            this.LLJILLL = null;
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onStart() {
        super.onStart();
        C201955140j.LIZ("VideoRecordContainerScene onStart()");
        if (this.LLJJ) {
            return;
        }
        LLLLIIIILLL();
    }

    public final void LLLLIILL(x2 x2Var) {
        this.LLJILLL = x2Var;
        this.LLJJ = false;
        C201955140j.LIZ("VideoRecordContainerScene loadPlanC");
        if (getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            LLLLIIIILLL();
        }
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (C0BMP.LIZ()) {
            FrameLayout frameLayout = new FrameLayout(requireSceneContext());
            frameLayout.setId(R.id.szh);
            C786410Ut5.a6(frameLayout, new FrameLayout.LayoutParams(-1, -1));
            return frameLayout;
        }
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.es4, viewGroup, false);
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }
}
