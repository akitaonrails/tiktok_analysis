package com.bytedance.android.livesdk.shorttouch.ui;

import X.AbstractC1101760emE;
import X.C1101640em2;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.livesetting.roomfunction.ShortTouchPriority;
import com.bytedance.android.livesdk.livesetting.shorttouch.LiveShortTouchNewFrameworkSetting;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public final class PortraitShortTouchViewWidget extends ShortTouchViewWidget {
    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hgy;
    }

    @Override // com.bytedance.android.livesdk.shorttouch.ui.ShortTouchViewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.shorttouch.ui.ShortTouchViewWidget
    public final int y1(String str) {
        Object obj = null;
        if (LiveShortTouchNewFrameworkSetting.INSTANCE.enableNewFramework()) {
            List<AbstractC1101760emE> list = this.LLIZ;
            if (list == null) {
                return -1;
            }
            Iterator<AbstractC1101760emE> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                AbstractC1101760emE next = it2.next();
                ShortTouchPriority shortTouchPriority = ShortTouchPriority.INSTANCE;
                if (shortTouchPriority.getPriority(next.LJIILL()) >= shortTouchPriority.getPriority(str)) {
                    obj = next;
                    break;
                }
            }
            return list.indexOf(obj);
        }
        List<C1101640em2> list2 = this.LLILZLL;
        if (list2 == null) {
            return -1;
        }
        Iterator<C1101640em2> it3 = list2.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            C1101640em2 next2 = it3.next();
            ShortTouchPriority shortTouchPriority2 = ShortTouchPriority.INSTANCE;
            if (shortTouchPriority2.getPriority(next2.LJ) >= shortTouchPriority2.getPriority(str)) {
                obj = next2;
                break;
            }
        }
        return list2.indexOf(obj);
    }
}
