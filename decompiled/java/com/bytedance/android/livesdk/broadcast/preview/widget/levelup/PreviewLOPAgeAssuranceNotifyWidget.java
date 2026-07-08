package com.bytedance.android.livesdk.broadcast.preview.widget.levelup;

import X.C0IJT;
import X.C0UOA;
import X.C0UOC;
import X.C0UOD;
import X.C13LE;
import X.C16F5;
import X.C16GF;
import X.C20736316Cj;
import X.C20743516Fd;
import X.C2188811AlT;
import X.C354201Zc;
import X.C474500IjA;
import X.C497740JfY;
import X.C500260Jjc;
import X.C770220UJg;
import X.C786410Ut5;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.livesdk.broadcast.CppAgeVerifyResponse;
import com.bytedance.android.livesdk.dataChannel.LOPAgeAssuranceNotifyBannerChannel;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.message.proto.CppAgeVerificationInfo;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class PreviewLOPAgeAssuranceNotifyWidget extends PreviewWidget {
    public C16F5 LLILZ;
    public C0UOA LLILZIL;
    public CppAgeVerificationInfo LLILZLL;
    public boolean LLIZ;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.h24;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void G1() {
        C0UOA c0uoa = this.LLILZIL;
        if (c0uoa != null && c0uoa.getStage() == C0UOA.AGE_VERIFIED.getStage()) {
            hide();
            return;
        }
        C0UOA c0uoa2 = this.LLILZIL;
        if (c0uoa2 != null && c0uoa2.getStage() == C0UOA.AGE_REVIEWING_STAGE.getStage()) {
            hide();
            return;
        }
        C0UOA c0uoa3 = this.LLILZIL;
        int i = c0uoa3 == null ? -1 : C0UOC.LIZ[c0uoa3.ordinal()];
        String strLJIJI = i != 1 ? i != 2 ? i != 3 ? "" : C497740JfY.LJIJI(2131851089) : C497740JfY.LJIJI(2131851090) : C497740JfY.LJIJI(2131851088);
        if (strLJIJI.length() <= 0) {
            hide();
            return;
        }
        show();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLJIJI);
        sbLIZ.append("  ");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C2188811AlT.LIZIZ(sbLIZ));
        C20743516Fd c20743516FdLIZLLL = C20736316Cj.LIZLLL(C497740JfY.LJJ() ? R.attr.d2z : R.attr.d3b, this.context);
        if (c20743516FdLIZLLL != null) {
            C16GF.LJI(c20743516FdLIZLLL, C20736316Cj.LIZIZ(R.attr.c9i, this.context));
            int iLIZIZ = (int) C497740JfY.LIZIZ(12.0f);
            c20743516FdLIZLLL.setBounds(0, 0, iLIZIZ, iLIZIZ);
            C786410Ut5.q2(spannableStringBuilder, Build.VERSION.SDK_INT >= 29 ? new ImageSpan(c20743516FdLIZLLL, 2) : new ImageSpan(c20743516FdLIZLLL), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 17);
        }
        C16F5 c16f5 = this.LLILZ;
        if (c16f5 != null) {
            c16f5.setText(spannableStringBuilder);
        }
        if (this.LLIZ) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("banner_show");
            c474500IjALIZ.LJIJJLI(this.dataChannel);
            c474500IjALIZ.LJJII("live_take_page", "banner_page");
            c474500IjALIZ.LJJII(C0UOD.LIZIZ(this.LLILZIL), "banner_content_starling_key");
            LiveMode liveMode = (LiveMode) this.dataChannel.gg0(LiveModeChannel.class);
            c474500IjALIZ.LJJII(liveMode != null ? C354201Zc.LIZ(liveMode) : null, "live_type");
            c474500IjALIZ.LIZ();
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onHide() {
        C770220UJg c770220UJg = C770220UJg.LIZ;
        C770220UJg.LJ(C13LE.LIZ(LOPAgeAssuranceNotifyBannerChannel.class));
        this.LLIZ = false;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() {
        C770220UJg c770220UJg = C770220UJg.LIZ;
        C770220UJg.LIZLLL(C13LE.LIZ(LOPAgeAssuranceNotifyBannerChannel.class));
        this.LLIZ = true;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        super.E1();
        hide();
        View view = getView();
        if (view != null) {
            view.setBackgroundResource(R.drawable.dlu);
        }
        View view2 = getView();
        this.LLILZ = view2 != null ? (C16F5) view2.findViewById(R.id.rrd) : null;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.EQ2(this, RoomCreateInfoChannel.class, new AwS591S0100000_12(this, 350));
        }
        View view3 = this.contentView;
        if (view3 != null) {
            C500260Jjc.LJLIIIL(500L, view3, new AwS591S0100000_12(this, 351));
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.EQ2(this, CppAgeVerifyResponse.class, new AwS591S0100000_12(this, 352));
        }
    }
}
