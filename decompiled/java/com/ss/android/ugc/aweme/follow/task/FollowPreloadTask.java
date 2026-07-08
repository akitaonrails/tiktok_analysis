package com.ss.android.ugc.aweme.follow.task;

import X.C0VU1;
import X.InterfaceC799590VYf;
import android.content.Context;
import com.ss.android.ugc.aweme.task.ExtendedPreloadTask;

/* JADX INFO: loaded from: classes22.dex */
public final class FollowPreloadTask extends ExtendedPreloadTask implements InterfaceC799590VYf {
    @Override // com.ss.android.ugc.aweme.task.ExtendedPreloadTask
    public final String LIZ() {
        return "enter_homepage_follow_label";
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "FollowPreloadTask";
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int level() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final boolean meetTrigger() {
        return false;
    }

    @Override // X.InterfaceC799590VYf
    public final int priority() {
        return 2;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return 1;
    }

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.CPU;
    }
}
