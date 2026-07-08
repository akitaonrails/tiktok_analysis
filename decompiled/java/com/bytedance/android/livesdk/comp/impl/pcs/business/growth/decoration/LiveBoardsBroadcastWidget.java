package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration;

import X.C1092090eWd;
import X.InterfaceC1097170eep;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.BoardsDisplayView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveBoardsBroadcastWidget extends LiveWidget {
    public BoardsDisplayView LL;
    public C1092090eWd LLILLJJLI;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.gxu;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        Fragment fragment;
        BoardsDisplayView boardsDisplayView;
        super.onCreate();
        this.LL = (BoardsDisplayView) findViewById(R.id.c7b);
        InterfaceC1097170eep interfaceC1097170eep = this.widgetCallback;
        if (interfaceC1097170eep != null && (fragment = interfaceC1097170eep.getFragment()) != null && (boardsDisplayView = this.LL) != null) {
            boardsDisplayView.LJFF(fragment, this.dataChannel, "anchor_live");
        }
        C1092090eWd c1092090eWd = (C1092090eWd) findViewById(R.id.mu8);
        this.LLILLJJLI = c1092090eWd;
        if (c1092090eWd != null) {
            c1092090eWd.setLifecycleOwner(this);
        }
        C1092090eWd c1092090eWd2 = this.LLILLJJLI;
        if (c1092090eWd2 != null) {
            c1092090eWd2.setDataChannel(this.dataChannel);
        }
        C1092090eWd c1092090eWd3 = this.LLILLJJLI;
        if (c1092090eWd3 != null) {
            c1092090eWd3.setFitsSystemWindows(false);
        }
        C1092090eWd c1092090eWd4 = this.LLILLJJLI;
        if (c1092090eWd4 != null) {
            c1092090eWd4.setFragment(this.widgetCallback.getFragment());
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onResume() {
        super.onResume();
        final View view = getView();
        if (view != null) {
            HandlerHook.viewPost(view, new Runnable() { // from class: X.0INP
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("LiveBoardsBroadcastWidget@da04.setFullScreen$1$1");
                    try {
                        C500260Jjc.LJLJL(-C497740JfY.LJIJ(), view);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("LiveBoardsBroadcastWidget@da04.setFullScreen$1$1");
                }
            });
        }
    }
}
