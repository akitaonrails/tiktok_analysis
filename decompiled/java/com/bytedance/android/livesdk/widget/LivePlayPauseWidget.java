package com.bytedance.android.livesdk.widget;

import X.C01GW;
import X.C0IFP;
import X.C1324720kZq;
import X.C439101nJ;
import X.C452501pT;
import X.C786410Ut5;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class LivePlayPauseWidget extends LiveRecyclableWidget {
    public final List<String> LL;
    public final List<String> LLILLJJLI;
    public boolean LLILLL;
    public C0IFP LLIZLLLIL;
    public int LLJI;
    public int LLJIJIL;
    public boolean LLJILJIL;
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 117));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 116));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 115));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 114));
    public int LLJ = -1;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.i06;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
    }

    public final C1324720kZq x1() {
        return (C1324720kZq) this.LLILZIL.getValue();
    }

    public final LinearLayout y1() {
        return (LinearLayout) this.LLILZ.getValue();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        show();
        C0IFP c0ifp = this.LLIZLLLIL;
        if (c0ifp != null) {
            B1(c0ifp, this.LLJ);
        }
        int i = this.LLJI;
        if (i != 0) {
            A1(this.LLJ, i, this.LLJIJIL);
        }
        z1(this.LL, this.LLILLJJLI, this.LLILLL);
    }

    public final void B1(C0IFP c0ifp, int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) y1().getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) x1().getLayoutParams();
        if (i == 1) {
            if (c0ifp.LJ) {
                layoutParams.width = -1;
                layoutParams.height = -1;
                layoutParams.topMargin = c0ifp.LIZLLL;
                layoutParams.setMarginStart(c0ifp.LIZJ);
                layoutParams2.width = -1;
                layoutParams2.height = -1;
                layoutParams2.topMargin = c0ifp.LIZLLL;
                layoutParams2.setMarginStart(c0ifp.LIZJ);
                y1().setGravity(17);
                y1().setPadding(0, 0, 0, 0);
            } else {
                layoutParams.width = c0ifp.LIZ;
                layoutParams.height = c0ifp.LIZIZ;
                layoutParams.topMargin = c0ifp.LIZLLL;
                layoutParams.setMarginStart(c0ifp.LIZJ);
                y1().setGravity(49);
                y1().setPadding(0, 3, 0, 0);
                layoutParams2.width = c0ifp.LIZ;
                layoutParams2.height = c0ifp.LIZIZ;
                layoutParams2.topMargin = c0ifp.LIZLLL;
                layoutParams2.setMarginStart(c0ifp.LIZJ);
            }
            C786410Ut5.d6(y1(), layoutParams);
            C786410Ut5.u6(x1(), layoutParams);
        }
    }

    public LivePlayPauseWidget(List<String> list, List<String> list2, boolean z) {
        this.LL = list;
        this.LLILLJJLI = list2;
        this.LLILLL = z;
    }

    public final void A1(int i, int i2, int i3) {
        FrameLayout.LayoutParams layoutParams;
        FrameLayout.LayoutParams layoutParams2;
        FrameLayout.LayoutParams layoutParams3;
        if (i2 == 0) {
            ViewGroup.LayoutParams layoutParams4 = y1().getLayoutParams();
            if ((layoutParams4 instanceof FrameLayout.LayoutParams) && (layoutParams3 = (FrameLayout.LayoutParams) layoutParams4) != null) {
                layoutParams3.width = -1;
                layoutParams3.height = -1;
                layoutParams3.topMargin = 0;
                y1().setGravity(1);
                y1().setPadding(0, C439101nJ.LIZ(150), 0, 0);
                C786410Ut5.d6(y1(), layoutParams3);
                return;
            }
            return;
        }
        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) y1().getLayoutParams();
        if (i == 1) {
            layoutParams5.width = i2;
            layoutParams5.height = i3;
            int i4 = LivePlayFragment.v2;
            layoutParams5.topMargin = i4;
            ViewGroup.LayoutParams layoutParams6 = x1().getLayoutParams();
            if ((layoutParams6 instanceof FrameLayout.LayoutParams) && (layoutParams2 = (FrameLayout.LayoutParams) layoutParams6) != null) {
                layoutParams2.width = i2;
                layoutParams2.height = i3;
                layoutParams2.topMargin = i4;
                C786410Ut5.u6(x1(), layoutParams2);
            }
        } else {
            layoutParams5.width = -1;
            layoutParams5.height = -1;
            layoutParams5.topMargin = 0;
            ViewGroup.LayoutParams layoutParams7 = x1().getLayoutParams();
            if ((layoutParams7 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams7) != null) {
                layoutParams.width = -1;
                layoutParams.height = -1;
                layoutParams.topMargin = 0;
                C786410Ut5.u6(x1(), layoutParams);
            }
        }
        y1().setGravity(17);
        y1().setPadding(0, 0, 0, 0);
        C786410Ut5.d6(y1(), layoutParams5);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z1(java.util.List<java.lang.String> r8, java.util.List<java.lang.String> r9, boolean r10) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.widget.LivePlayPauseWidget.z1(java.util.List, java.util.List, boolean):void");
    }
}
