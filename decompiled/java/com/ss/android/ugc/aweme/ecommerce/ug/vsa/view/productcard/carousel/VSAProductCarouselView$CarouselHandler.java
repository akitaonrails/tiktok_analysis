package com.ss.android.ugc.aweme.ecommerce.ug.vsa.view.productcard.carousel;

import X.C08CC;
import X.C18Q6;
import X.C18QA;
import X.C1C7U;
import X.C21278918Pb;
import android.os.Looper;
import android.os.Message;
import android.view.KeyEvent;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes33.dex */
public final class VSAProductCarouselView$CarouselHandler extends BPEAHandler implements LifecycleEventObserver {
    public final WeakReference<C18Q6> LL;

    public VSAProductCarouselView$CarouselHandler(WeakReference<C18Q6> weakReference) {
        super(Looper.getMainLooper());
        this.LL = weakReference;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C18QA c18qa;
        C18QA c18qa2;
        C1C7U.LIZ("VSAProductCarouselView$CarouselHandler@64d6.handleMessage");
        C18Q6 c18q6 = this.LL.get();
        if (c18q6 != null) {
            int i = c18q6.LLILZ + 1;
            c18q6.LLILZ = i;
            if (i > ((ArrayList) c18q6.LLILLJJLI).size() - 1) {
                c18q6.LLILZ = 0;
            }
            c18q6.LIZIZ(c18q6.getNextView());
            KeyEvent.Callback currentView = c18q6.getCurrentView();
            if ((currentView instanceof C18QA) && (c18qa2 = (C18QA) currentView) != null) {
                c18qa2.hide();
            }
            c18q6.showNext();
            KeyEvent.Callback currentView2 = c18q6.getCurrentView();
            if ((currentView2 instanceof C18QA) && (c18qa = (C18QA) currentView2) != null) {
                c18qa.show();
            }
            c18q6.LL.sendEmptyMessageDelayed(0, 2000L);
        }
        C1C7U.LIZIZ("VSAProductCarouselView$CarouselHandler@64d6.handleMessage");
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        C18Q6 c18q6;
        C18Q6 c18q62;
        int i = C08CC.LIZ[event.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3 && (c18q62 = this.LL.get()) != null) {
                    c18q62.LL.removeCallbacksAndMessages(null);
                    return;
                }
                return;
            }
            C18Q6 c18q63 = this.LL.get();
            if (c18q63 == null || !c18q63.LLILZIL || !c18q63.LLILZLL) {
                return;
            }
            c18q63.LLILZLL = false;
            c18q63.LL.removeCallbacksAndMessages(null);
            return;
        }
        C21278918Pb.LIZ.getClass();
        if (!C21278918Pb.LIZIZ || (c18q6 = this.LL.get()) == null || !c18q6.LLILZIL || c18q6.LLILZLL) {
            return;
        }
        c18q6.LLILZLL = true;
        c18q6.LL.removeCallbacksAndMessages(null);
        c18q6.LL.sendEmptyMessageDelayed(0, 2000L);
    }
}
