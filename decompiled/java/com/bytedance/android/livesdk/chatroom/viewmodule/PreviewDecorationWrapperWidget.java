package com.bytedance.android.livesdk.chatroom.viewmodule;

import X.C12ES;
import X.C1AJN;
import X.C497740JfY;
import X.InterfaceC2177361AJi;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.livesdk.model.RoomDecoration;
import com.bytedance.android.livesdk.model.RoomSticker;
import com.bytedance.android.livesdk.model.Sticker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public abstract class PreviewDecorationWrapperWidget extends PreviewWidget implements InterfaceC2177361AJi {
    public final int[] LLILZ = new int[4];
    public final List<C1AJN<?>> LLILZIL = new ArrayList();

    @Override // X.InterfaceC2177361AJi
    public void LJIJI(boolean z) {
    }

    @Override // X.InterfaceC2177361AJi
    public final void LJZL(RoomDecoration roomDecoration) {
    }

    @Override // X.InterfaceC2177361AJi
    public void LLLLLJLJLL(Sticker sticker) {
    }

    @Override // X.InterfaceC2177361AJi
    public final void Q(String str, RoomSticker roomSticker) {
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hy6;
    }

    @Override // X.InterfaceC2177361AJi
    public final void i1() {
    }

    @Override // X.InterfaceC2177361AJi
    public final void j1() {
    }

    @Override // X.InterfaceC2177361AJi
    public void o0(Sticker sticker) {
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public void E1() {
        Context context;
        super.E1();
        if (!isViewValid() || (context = this.context) == null) {
            return;
        }
        int[] iArr = this.LLILZ;
        iArr[0] = 0;
        iArr[1] = (((C12ES.LJIIIIZZ(context) - C497740JfY.LJIIIZ(R.dimen.azs)) - C497740JfY.LJIIIZ(R.dimen.au8)) - ((int) C497740JfY.LIZIZ(10.0f))) - C497740JfY.LJIIIZ(R.dimen.ajh);
        int[] iArr2 = this.LLILZ;
        iArr2[2] = 0;
        iArr2[3] = C12ES.LJIIJ(this.context);
        int[] iArr3 = this.LLILZ;
        Arrays.copyOf(iArr3, iArr3.length);
    }
}
