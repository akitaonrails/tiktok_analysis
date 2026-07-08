package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.C011Z;
import X.C0IJT;
import X.C16F5;
import X.C16FS;
import X.C474500IjA;
import X.C474650IjP;
import X.C497740JfY;
import X.C500260Jjc;
import X.C770730ULf;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class PreviewRevisionPracticeModelEntranceWidget extends PreviewWidget {
    public C16F5 LLILZ;
    public C16F5 LLILZIL;
    public C16FS LLILZLL;

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void D1() {
        this.LLILLL = false;
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hkx;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onHide() {
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() {
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        super.E1();
        View view = getView();
        this.LLILZ = view != null ? (C16F5) view.findViewById(R.id.y3b) : null;
        View view2 = getView();
        this.LLILZIL = view2 != null ? (C16F5) view2.findViewById(R.id.wh1) : null;
        View view3 = getView();
        this.LLILZLL = view3 != null ? (C16FS) view3.findViewById(R.id.vz6) : null;
        C16F5 c16f5 = this.LLILZ;
        if (c16f5 != null) {
            c16f5.setText(C497740JfY.LJIJI(2131855360));
        }
        C16F5 c16f52 = this.LLILZIL;
        if (c16f52 != null) {
            c16f52.setText(C497740JfY.LJIJI(2131855359));
        }
        C16FS c16fs = this.LLILZLL;
        if (c16fs != null) {
            c16fs.setText(C497740JfY.LJIJI(2131851458));
        }
        G1("livesdk_practice_icon_show");
        C16FS c16fs2 = this.LLILZLL;
        if (c16fs2 != null) {
            C500260Jjc.LJLIIIL(500L, c16fs2, new AwS591S0100000_12(this, 322));
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void C1() {
        super.C1();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
    }

    public final void G1(String str) {
        String str2;
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        C770730ULf.LIZLLL(c474500IjALIZ);
        c474500IjALIZ.LJJII("1", "is_new_anchor");
        if (C474650IjP.LIZ()) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        } else {
            str2 = null;
        }
        c474500IjALIZ.LJJII(str2, "has_enter_trymode");
        c474500IjALIZ.LJJIJL();
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getThemeOverlay(Context context) {
        return C011Z.LIZ.LJIIIZ();
    }
}
