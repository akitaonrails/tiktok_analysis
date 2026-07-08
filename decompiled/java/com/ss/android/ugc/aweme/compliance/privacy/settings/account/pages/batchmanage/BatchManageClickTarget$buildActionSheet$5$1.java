package com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.batchmanage;

import X.C356901a3;
import X.EnumC19280010bm;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import kotlin.Pair;

/* JADX INFO: loaded from: classes29.dex */
public final class BatchManageClickTarget$buildActionSheet$5$1 implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public final /* synthetic */ EnumC19280010bm LL;
    public final /* synthetic */ TuxActionSheet LLILLJJLI;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        this.LL.uploadEvent("show_privacy_permission_sheet", new Pair[0]);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner lifecycleOwner) {
        if (this.LL.shouldPopup.invoke().booleanValue()) {
            this.LL.overrideAutoDismissAfterViewCreated(this.LLILLJJLI);
        }
    }

    public BatchManageClickTarget$buildActionSheet$5$1(EnumC19280010bm enumC19280010bm, TuxActionSheet tuxActionSheet) {
        this.LL = enumC19280010bm;
        this.LLILLJJLI = tuxActionSheet;
    }
}
