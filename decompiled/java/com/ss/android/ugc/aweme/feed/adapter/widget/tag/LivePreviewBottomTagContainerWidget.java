package com.ss.android.ugc.aweme.feed.adapter.widget.tag;

import X.C01GW;
import X.C1ACA;
import X.C452501pT;
import X.C488730JEp;
import X.C786410Ut5;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: loaded from: classes17.dex */
public final class LivePreviewBottomTagContainerWidget extends LiveWatchPreviewWidget {
    public static final /* synthetic */ int LLJILJIL = 0;
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 286));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS560S0100000_16(this, 285));
    public final List<Integer> LLJIJIL = new ArrayList();

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dg0;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0044 A[PHI: r2
      0x0044: PHI (r2v11 java.lang.String) = (r2v9 java.lang.String), (r2v5 java.lang.String) binds: [B:58:0x00db, B:21:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x013c  */
    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J1() {
        /*
            Method dump skipped, instruction units count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.widget.tag.LivePreviewBottomTagContainerWidget.J1():void");
    }

    public final TuxTextView M1() {
        return (TuxTextView) this.LLJI.getValue();
    }

    public final TuxTextView N1() {
        return (TuxTextView) this.LLJ.getValue();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        C786410Ut5.LLLLZLL(N1(), 8);
        N1().setText("");
        C786410Ut5.LLLLZLL(M1(), 8);
        M1().setText("");
        View view = getView();
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void H1() {
        onUnload();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void LJJIJIIJIL(int i) {
        super.LJJIJIIJIL(i);
        Iterator it2 = ((ArrayList) this.LLJIJIL).iterator();
        while (it2.hasNext()) {
            int iIntValue = ((Number) it2.next()).intValue();
            if (iIntValue != 1) {
                if (iIntValue != 2) {
                    if (iIntValue == 3) {
                        C488730JEp c488730JEp = C488730JEp.LIZ;
                        C1ACA c1acaZ1 = z1();
                        c488730JEp.getClass();
                        C488730JEp.LIZJ(c1acaZ1);
                    }
                } else {
                    C488730JEp c488730JEp2 = C488730JEp.LIZ;
                    C1ACA c1acaZ12 = z1();
                    c488730JEp2.getClass();
                    C488730JEp.LIZIZ(c1acaZ12);
                }
            } else {
                C488730JEp c488730JEp3 = C488730JEp.LIZ;
                C1ACA c1acaZ13 = z1();
                c488730JEp3.getClass();
                C488730JEp.LIZ(c1acaZ13, 1);
            }
        }
    }
}
