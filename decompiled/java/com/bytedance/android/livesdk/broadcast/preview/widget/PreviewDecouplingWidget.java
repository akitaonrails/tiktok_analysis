package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.AnonymousClass0956;
import X.C0IJT;
import X.C1161920gLG;
import X.C16F5;
import X.C474500IjA;
import X.C500260Jjc;
import X.C751980Tee;
import X.C760180Trs;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.livesdk.broadcast.PreviewMoreClickEvent;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class PreviewDecouplingWidget extends PreviewWidget {
    public C16F5 LLILZ;
    public C16F5 LLILZIL;
    public AnonymousClass0956 LLILZLL;
    public View LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public boolean LLIZ = true;
    public String LLJIJIL = "";

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hha;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void G1() {
        LiveMode liveModeLIZJ;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_decoupling_entrance_show");
        c474500IjALIZ.LJJII("live_take_page", "entrance_page");
        c474500IjALIZ.LJJII(this.LLJIJIL, "exposure_period");
        DataChannel dataChannel = this.dataChannel;
        c474500IjALIZ.LJJII((dataChannel == null || (liveModeLIZJ = C751980Tee.LIZJ(dataChannel)) == null) ? null : liveModeLIZJ.logStreamingType, "live_type");
        c474500IjALIZ.LIZ();
    }

    public final void I1() {
        if (this.LLJ) {
            if (C500260Jjc.LJJJI(getView() != null ? Boolean.valueOf(!C500260Jjc.LJJJJIZL(r0)) : null)) {
                AnonymousClass0956 anonymousClass0956 = this.LLILZLL;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                this.LLILZLL = null;
                show();
                G1();
                this.LLJI = true;
            }
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void C1() {
        super.C1();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.EQ2(this, RoomCreateInfoChannel.class, new AwS591S0100000_12(this, 263));
            dataChannel.BQ2(this, PreviewMoreClickEvent.class, new AwS591S0100000_12(this, 264));
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        super.E1();
        this.LLILZ = (C16F5) findViewById(R.id.fhz);
        this.LLILZIL = (C16F5) findViewById(R.id.fhv);
        if (C760180Trs.LJ()) {
            View viewFindViewById = findViewById(R.id.z0m);
            if (viewFindViewById != null) {
                C500260Jjc.LLFFF(viewFindViewById);
            }
        } else {
            View viewFindViewById2 = findViewById(R.id.fhx);
            if (viewFindViewById2 != null) {
                C500260Jjc.LLFFF(viewFindViewById2);
            }
        }
        hide();
        C500260Jjc.LJIILLIIL(getView());
    }

    public final void H1(View view) {
        this.LLIZLLLIL = view;
    }

    public final void J1(String str) {
        String str2;
        LiveMode liveModeLIZJ;
        if (str == null) {
            return;
        }
        IActionHandlerService iActionHandlerService = (IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class);
        Context context = this.context;
        Uri.Builder builderAppendQueryParameter = UriProtector.parse(str).buildUpon().appendQueryParameter("enter_from", "live_take_page");
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (liveModeLIZJ = C751980Tee.LIZJ(dataChannel)) != null) {
            str2 = liveModeLIZJ.logStreamingType;
        } else {
            str2 = null;
        }
        iActionHandlerService.handle(context, builderAppendQueryParameter.appendQueryParameter("live_type", str2).build().toString());
    }
}
