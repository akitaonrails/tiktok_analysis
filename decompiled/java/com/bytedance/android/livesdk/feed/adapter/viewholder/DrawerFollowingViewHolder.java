package com.bytedance.android.livesdk.feed.adapter.viewholder;

import X.C480430Isj;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.livesdk.model.FeedItem;

/* JADX INFO: loaded from: classes8.dex */
public abstract class DrawerFollowingViewHolder extends RecyclerView.ViewHolder implements LifecycleOwner, LifecycleEventObserver {
    public boolean LL;
    public boolean LLILLJJLI;
    public final LifecycleOwner LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public final LifecycleRegistry LLILZLL;

    public abstract void I5(FeedItem feedItem, FeedExtra feedExtra, String str, int i);

    public abstract void L5();

    public abstract void clearAnimation();

    public final void moveToResumeState() {
        this.LLILZ = true;
        int i = C480430Isj.LIZIZ[getLifecycle().getCurrentState().ordinal()];
        if (i != 1) {
            if (i == 2 && this.LLILZ) {
                this.LLILZLL.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
                return;
            }
            return;
        }
        if (this.LLILZ) {
            this.LLILZLL.handleLifecycleEvent(Lifecycle.Event.ON_START);
        }
        if (this.LLILZ) {
            this.LLILZLL.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
        }
    }

    public final void moveToStopState() {
        int i = C480430Isj.LIZIZ[getLifecycle().getCurrentState().ordinal()];
        if (i == 1 || i == 2) {
            if (this.LLILZ) {
                this.LLILZLL.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
            }
        } else if (i == 3) {
            if (this.LLILZ) {
                this.LLILZLL.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
            }
            if (this.LLILZ) {
                this.LLILZLL.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
            }
        }
        this.LLILZ = false;
    }

    public void onViewAttachedToWindow() {
        Lifecycle lifecycle;
        moveToResumeState();
        if (this.LLILZIL) {
            return;
        }
        LifecycleOwner lifecycleOwner = this.LLILLL;
        if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.addObserver(this);
        }
        this.LLILZIL = true;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLILZLL;
    }

    public void onViewDetachedFromWindow() {
        moveToStopState();
    }

    public DrawerFollowingViewHolder(View view, LifecycleOwner lifecycleOwner) {
        super(view);
        this.LLILLL = lifecycleOwner;
        this.LLILZLL = new LifecycleRegistry(this);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Lifecycle lifecycle;
        switch (C480430Isj.LIZ[event.ordinal()]) {
            case 1:
                this.LLILZLL.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
                break;
            case 2:
                if (this.LLILZ) {
                    this.LLILZLL.handleLifecycleEvent(Lifecycle.Event.ON_START);
                }
                break;
            case 3:
                if (this.LLILZ) {
                    this.LLILZLL.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
                }
                break;
            case 4:
                if (this.LLILZ) {
                    this.LLILZLL.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
                }
                break;
            case 5:
                if (this.LLILZ) {
                    this.LLILZLL.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
                }
                break;
            case 6:
                moveToStopState();
                this.LLILZLL.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
                LifecycleOwner lifecycleOwner2 = this.LLILLL;
                if (lifecycleOwner2 != null && (lifecycle = lifecycleOwner2.getLifecycle()) != null) {
                    lifecycle.removeObserver(this);
                    break;
                }
                break;
        }
    }
}
