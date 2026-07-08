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
public final class LandscapeShortTouchViewWidget extends ShortTouchViewWidget {
    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.gx5;
    }

    @Override // com.bytedance.android.livesdk.shorttouch.ui.ShortTouchViewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0012  */
    @Override // com.bytedance.android.livesdk.shorttouch.ui.ShortTouchViewWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A1() {
        /*
            r1 = this;
            com.bytedance.android.livesdk.livesetting.shorttouch.LiveShortTouchNewFrameworkSetting r0 = com.bytedance.android.livesdk.livesetting.shorttouch.LiveShortTouchNewFrameworkSetting.INSTANCE
            boolean r0 = r0.enableNewFramework()
            if (r0 == 0) goto L16
            java.util.List<X.0emE> r0 = r1.LLIZ
            if (r0 == 0) goto L1f
            int r0 = r0.size()
        L10:
            if (r0 <= 0) goto L1f
            r1.show()
            return
        L16:
            java.util.List<X.0em2> r0 = r1.LLILZLL
            if (r0 == 0) goto L1f
            int r0 = r0.size()
            goto L10
        L1f:
            r1.hide()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.shorttouch.ui.LandscapeShortTouchViewWidget.A1():void");
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
                if (shortTouchPriority.getPriority(next.LJIILL()) < shortTouchPriority.getPriority(str)) {
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
            if (shortTouchPriority2.getPriority(str) < shortTouchPriority2.getPriority(str)) {
                obj = next2;
                break;
            }
        }
        return list2.indexOf(obj);
    }
}
