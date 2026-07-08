package com.bytedance.scene.group;

import X.C19A3;
import X.C20736016Cg;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;

/* JADX INFO: loaded from: classes32.dex */
public abstract class UserVisibleHintGroupScene extends C19A3 {
    public final C20736016Cg LLJILLL = new C20736016Cg();
    public boolean LLJJ = true;
    public boolean LLJJI = false;
    public boolean LLJJIII = false;
    public final LifecycleObserver LLJJIJI = new GenericLifecycleObserver() { // from class: com.bytedance.scene.group.UserVisibleHintGroupScene.1
        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_PAUSE) {
                onPause();
                return;
            }
            if (event == Lifecycle.Event.ON_RESUME) {
                onResume();
                return;
            }
            if (event == Lifecycle.Event.ON_STOP) {
                onStop();
            } else if (event == Lifecycle.Event.ON_START) {
                onStart();
            } else if (event == Lifecycle.Event.ON_DESTROY) {
                onDestroy();
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        public void onDestroy() {
            UserVisibleHintGroupScene.this.LLJILLL.LIZ(Lifecycle.Event.ON_DESTROY);
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
        public void onPause() {
            UserVisibleHintGroupScene userVisibleHintGroupScene = UserVisibleHintGroupScene.this;
            userVisibleHintGroupScene.LLJJI = false;
            if (userVisibleHintGroupScene.LLJJ) {
                userVisibleHintGroupScene.LLJILLL.LIZ(Lifecycle.Event.ON_PAUSE);
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
        public void onResume() {
            UserVisibleHintGroupScene userVisibleHintGroupScene = UserVisibleHintGroupScene.this;
            userVisibleHintGroupScene.LLJJI = true;
            if (userVisibleHintGroupScene.LLJJ) {
                userVisibleHintGroupScene.LLJILLL.LIZ(Lifecycle.Event.ON_RESUME);
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_START)
        public void onStart() {
            UserVisibleHintGroupScene userVisibleHintGroupScene = UserVisibleHintGroupScene.this;
            userVisibleHintGroupScene.LLJJIII = true;
            if (userVisibleHintGroupScene.LLJJ) {
                userVisibleHintGroupScene.LLJILLL.LIZ(Lifecycle.Event.ON_START);
            }
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
        public void onStop() {
            UserVisibleHintGroupScene userVisibleHintGroupScene = UserVisibleHintGroupScene.this;
            userVisibleHintGroupScene.LLJJIII = false;
            if (userVisibleHintGroupScene.LLJJ) {
                userVisibleHintGroupScene.LLJILLL.LIZ(Lifecycle.Event.ON_STOP);
            }
        }
    };

    @Override // com.bytedance.scene.Scene
    public final boolean isVisible() {
        return super.isVisible() && this.LLJJ;
    }

    @Override // com.bytedance.scene.Scene
    public void onDestroyView() {
        super.onDestroyView();
        getLifecycle().removeObserver(this.LLJJIJI);
    }

    public void LLLLIIIILLL(boolean z) {
        if (this.LLJJ == z) {
            return;
        }
        this.LLJJ = z;
        boolean zIsVisible = isVisible();
        if (zIsVisible != this.LLILZLL) {
            this.LLILZLL = zIsVisible;
            LLJJL(zIsVisible);
        }
        if (this.LLJJ) {
            if (this.LLJJIII) {
                this.LLJILLL.LIZ(Lifecycle.Event.ON_START);
            }
            if (this.LLJJI) {
                this.LLJILLL.LIZ(Lifecycle.Event.ON_RESUME);
                return;
            }
            return;
        }
        if (this.LLJJI) {
            this.LLJILLL.LIZ(Lifecycle.Event.ON_PAUSE);
        }
        if (!this.LLJJIII) {
            return;
        }
        this.LLJILLL.LIZ(Lifecycle.Event.ON_STOP);
    }

    @Override // com.bytedance.scene.Scene
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.LLJILLL.LIZ(Lifecycle.Event.ON_CREATE);
        getLifecycle().addObserver(this.LLJJIJI);
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.LLJJ = bundle.getBoolean("bd-scene-nav:scene_user_visible_hint");
        }
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("bd-scene-nav:scene_user_visible_hint", this.LLJJ);
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }
}
