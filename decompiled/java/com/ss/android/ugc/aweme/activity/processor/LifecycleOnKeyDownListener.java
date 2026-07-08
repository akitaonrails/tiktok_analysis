package com.ss.android.ugc.aweme.activity.processor;

import X.C19DJ;
import X.C2146008aw;
import android.content.Intent;
import android.view.KeyEvent;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes4.dex */
public final class LifecycleOnKeyDownListener implements C19DJ, LifecycleEventObserver {
    public boolean LL;

    @Override // X.C19DJ
    public final void u1(int i, Intent intent) {
    }

    @Override // X.C19DJ
    public final boolean xM() {
        if (this.LL) {
            throw null;
        }
        return false;
    }

    @Override // X.C19DJ
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        throw null;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        int i = C2146008aw.LIZ[event.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    throw null;
                }
                return;
            } else {
                this.LL = false;
                return;
            }
        }
        this.LL = true;
    }
}
