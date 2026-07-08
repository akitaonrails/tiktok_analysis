package com.bytedance.android.livesdk.broadcast.preview.widget.playbook;

import X.C500260Jjc;
import X.C757990ToL;
import X.C760180Trs;
import X.C781270Ukn;
import X.C978370bZD;
import X.EnumC20429314wl;
import X.InterfaceC774000UXu;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.broadcast.PreviewInteractHasEntranceEvent;
import com.bytedance.android.livesdk.broadcast.interaction.event.MultiGuestShowPlaybookEvent;
import com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolWidget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public class PreviewPlaybookWidget extends PreviewToolWidget {
    public final int LLILZLL = 2131854143;
    public final int LLIZ = R.attr.e66;
    public final int LLIZLLLIL = R.attr.c9i;
    public Boolean LLJ;

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolWidget, com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() {
        C978370bZD c978370bZDLIZLLL;
        if (!Intrinsics.LJFF(this.LLJ, Boolean.TRUE)) {
            hide();
            return;
        }
        C760180Trs.LJIIJJI(this.dataChannel, "playbook");
        InterfaceC774000UXu interfaceC774000UXuG20 = C781270Ukn.LJIILL().G20("livesdk_anchor_playbook_entrance_show");
        if (interfaceC774000UXuG20 == null || (c978370bZDLIZLLL = interfaceC774000UXuG20.LIZLLL(this.dataChannel)) == null) {
            return;
        }
        c978370bZDLIZLLL.LIZIZ.LJJII("go_live", "enter_from");
        c978370bZDLIZLLL.LIZ();
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void C1() {
        super.C1();
        if (C500260Jjc.LJJJJIZL(getView())) {
            C760180Trs.LJIIJJI(this.dataChannel, "playbook");
        }
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        super.E1();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.EQ2(this, PreviewInteractHasEntranceEvent.class, new AwS591S0100000_12(this, 376));
        }
    }

    @Override // X.InterfaceC782830UnJ
    public final boolean LLLII() {
        return B1();
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final int O1() {
        return this.LLILZLL;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolWidget
    public final int W1() {
        return this.LLIZLLLIL;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolWidget
    public final int X1() {
        return this.LLIZ;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.base.PreviewToolBaseWidget
    public final void onClick(View view) {
        C760180Trs.LJIIIZ(this.dataChannel, "playbook");
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.LC0(MultiGuestShowPlaybookEvent.class, new C757990ToL("go_live", EnumC20429314wl.INTERACT));
        }
    }
}
