package com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.base.view;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.sheet.LiveSheetDialog;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes29.dex */
public final class MixPageInnerDialog extends LiveSheetDialog {
    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetDialog, com.bytedance.android.live.design.app.LifecycleAwareDialog, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetDialog
    public final int LJLIIIL() {
        return getContext().getResources().getConfiguration().getLayoutDirection() == 1 ? R.style.au : R.style.at;
    }

    public MixPageInnerDialog(Context context, int i) {
        super(context, i);
    }
}
