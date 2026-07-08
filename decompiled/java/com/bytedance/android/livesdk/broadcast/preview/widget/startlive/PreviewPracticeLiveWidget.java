package com.bytedance.android.livesdk.broadcast.preview.widget.startlive;

import X.C011Z;
import X.C0IJT;
import X.C16FS;
import X.C474500IjA;
import X.C474650IjP;
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
public final class PreviewPracticeLiveWidget extends PreviewWidget {
    public C16FS LLILZ;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.i0w;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        C16FS c16fs;
        super.E1();
        View view = getView();
        if (!(view instanceof C16FS) || (c16fs = (C16FS) view) == null) {
            return;
        }
        this.LLILZ = c16fs;
        G1("livesdk_practice_icon_show");
        View view2 = getView();
        if (view2 != null) {
            C500260Jjc.LJLIIIL(500L, view2, new AwS591S0100000_12(this, 432));
        }
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
        return C011Z.LIZ.LJ();
    }
}
