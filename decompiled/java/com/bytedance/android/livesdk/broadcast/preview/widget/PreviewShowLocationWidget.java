package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.AnonymousClass0956;
import X.C0PEM;
import X.C1161920gLG;
import X.C16F5;
import X.C23250099c;
import X.C752820Tg0;
import X.C760180Trs;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.livesdk.dataChannel.LocationSwitchType;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class PreviewShowLocationWidget extends PreviewWidget {
    public Map<String, String> LLILZ;
    public TuxIconView LLILZIL;
    public C16F5 LLILZLL;
    public AnonymousClass0956 LLIZ;
    public boolean LLIZLLLIL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hi7;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final boolean z1() {
        return false;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() {
        C760180Trs.LJIIL(this.dataChannel, this.LLILZ);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void C1() {
        super.C1();
        if (this.LLIZLLLIL) {
            this.LLIZLLLIL = false;
            if (((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).yU0()) {
                this.LLIZ = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C752820Tg0(false, this, null), 2);
                return;
            }
            C16F5 c16f5 = this.LLILZLL;
            if (c16f5 != null) {
                c16f5.setText(((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).Fq1());
            }
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        super.E1();
        View view = getView();
        this.LLILZLL = view != null ? (C16F5) view.findViewById(R.id.no9) : null;
        View view2 = getView();
        this.LLILZIL = view2 != null ? (TuxIconView) view2.findViewById(R.id.noc) : null;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.EQ2(this, RoomCreateInfoChannel.class, new AwS591S0100000_12(this, 326));
            dataChannel.EQ2(this, LocationSwitchType.class, new AwS591S0100000_12(this, 327));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        AnonymousClass0956 anonymousClass0956 = this.LLIZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
    }
}
