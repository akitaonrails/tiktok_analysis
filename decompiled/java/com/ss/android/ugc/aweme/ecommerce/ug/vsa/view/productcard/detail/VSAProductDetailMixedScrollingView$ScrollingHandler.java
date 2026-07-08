package com.ss.android.ugc.aweme.ecommerce.ug.vsa.view.productcard.detail;

import X.C08CG;
import X.C18Q3;
import X.C1C7U;
import android.os.Looper;
import android.os.Message;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes33.dex */
public final class VSAProductDetailMixedScrollingView$ScrollingHandler extends BPEAHandler implements LifecycleEventObserver {
    public final WeakReference<C18Q3> LL;

    public VSAProductDetailMixedScrollingView$ScrollingHandler(WeakReference<C18Q3> weakReference) {
        super(Looper.getMainLooper());
        this.LL = weakReference;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C1C7U.LIZ("VSAProductDetailMixedScrollingView$ScrollingHandler@3afa.handleMessage");
        C18Q3 c18q3 = this.LL.get();
        if (c18q3 != null) {
            int i = c18q3.LLILZ + 1;
            c18q3.LLILZ = i;
            if (i > ((ArrayList) c18q3.LLILLL).size() - 1) {
                c18q3.LLILZ = 0;
            }
            c18q3.LIZ(c18q3.getNextView());
            c18q3.showNext();
            c18q3.LL.sendEmptyMessageDelayed(0, 2000L);
        }
        C1C7U.LIZIZ("VSAProductDetailMixedScrollingView$ScrollingHandler@3afa.handleMessage");
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        C18Q3 c18q3;
        int i = C08CG.LIZ[event.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3 && (c18q3 = this.LL.get()) != null) {
                    c18q3.LL.removeCallbacksAndMessages(null);
                    return;
                }
                return;
            }
            C18Q3 c18q32 = this.LL.get();
            if (c18q32 == null || !c18q32.LLILZIL || !c18q32.LLILZLL) {
                return;
            }
            c18q32.LLILZLL = false;
            c18q32.LL.removeCallbacksAndMessages(null);
            return;
        }
        C18Q3 c18q33 = this.LL.get();
        if (c18q33 == null || !c18q33.LLILZIL || c18q33.LLILZLL) {
            return;
        }
        c18q33.LLILZLL = true;
        c18q33.LL.removeCallbacksAndMessages(null);
        c18q33.LL.sendEmptyMessageDelayed(0, 2000L);
    }
}
