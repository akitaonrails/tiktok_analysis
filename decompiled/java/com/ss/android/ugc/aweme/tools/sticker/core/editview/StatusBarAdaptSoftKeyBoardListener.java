package com.ss.android.ugc.aweme.tools.sticker.core.editview;

import X.C12YW;
import X.C786410Ut5;
import X.InterfaceC1391500mJY;
import X.InterfaceC1463990oCT;
import android.app.Activity;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.SoftKeyBoardListener;

/* JADX INFO: loaded from: classes30.dex */
public final class StatusBarAdaptSoftKeyBoardListener extends SoftKeyBoardListener {
    public final InterfaceC1463990oCT LLIZ;
    public final C12YW LLIZLLLIL;

    @Override // com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.SoftKeyBoardListener, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public StatusBarAdaptSoftKeyBoardListener(Activity activity) {
        super(activity, null, null, null);
        this.LLIZ = null;
        this.LLIZLLLIL = new C12YW(this, 17);
    }

    @Override // com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.SoftKeyBoardListener
    public final void LIZIZ(InterfaceC1391500mJY interfaceC1391500mJY) {
        View view;
        this.LLILZ = interfaceC1391500mJY;
        if (this.LLIZLLLIL != null && (view = this.LLILLJJLI) != null) {
            C786410Ut5.x3(view.getViewTreeObserver(), this.LLIZLLLIL);
        }
    }
}
