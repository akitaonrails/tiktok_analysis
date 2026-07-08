package com.bytedance.android.livesdk.broadcast.preview.widget.levelup;

import X.C0IJT;
import X.C0UO9;
import X.C0UOA;
import X.C0UOD;
import X.C13LP;
import X.C1697810uHb;
import X.C16F5;
import X.C16GF;
import X.C20736316Cj;
import X.C20743516Fd;
import X.C2188811AlT;
import X.C354201Zc;
import X.C474500IjA;
import X.C497740JfY;
import X.C500260Jjc;
import X.C760180Trs;
import X.C786410Ut5;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.banner.BannerWidget;
import com.bytedance.android.livesdk.broadcast.CppAgeVerifyResponse;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.livesetting.watchlive.TtliveGameSwitchAgeAssuranceBannerHideOptSetting;
import com.bytedance.android.livesdk.message.proto.CppAgeVerificationInfo;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class GamePreviewLOPAgeAssuranceNotifyWidget extends BannerWidget {
    public C16F5 LLJI;
    public C0UOA LLJIJIL;
    public CppAgeVerificationInfo LLJILJIL;
    public boolean LLJILJILJ;
    public final String LLJILLL = "lop_age_assurance_banner";

    public final void N1() {
        ArrayList arrayListLJ = C1697810uHb.LJ(Integer.valueOf(C0UOA.AGE_VERIFIED.getStage()));
        if (TtliveGameSwitchAgeAssuranceBannerHideOptSetting.INSTANCE.getValue()) {
            arrayListLJ.add(Integer.valueOf(C0UOA.AGE_REVIEWING_STAGE.getStage()));
        }
        C0UOA c0uoa = this.LLJIJIL;
        if (C13LP.LJJJJ(c0uoa != null ? Integer.valueOf(c0uoa.getStage()) : null, arrayListLJ)) {
            I1(false);
            return;
        }
        C0UOA c0uoa2 = this.LLJIJIL;
        int i = c0uoa2 == null ? -1 : C0UO9.LIZ[c0uoa2.ordinal()];
        String strLJIJI = i != 1 ? i != 2 ? i != 3 ? "" : C497740JfY.LJIJI(2131851089) : C497740JfY.LJIJI(2131851090) : C497740JfY.LJIJI(2131851088);
        if (strLJIJI.length() <= 0) {
            I1(false);
            return;
        }
        this.LLJILJILJ = true;
        show();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLJIJI);
        sbLIZ.append("  ");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C2188811AlT.LIZIZ(sbLIZ));
        if (!C760180Trs.LJI()) {
            C20743516Fd c20743516FdLIZLLL = C20736316Cj.LIZLLL(C497740JfY.LJJ() ? R.attr.d2z : R.attr.d3b, this.context);
            if (c20743516FdLIZLLL != null) {
                C16GF.LJI(c20743516FdLIZLLL, C20736316Cj.LIZIZ(R.attr.c9i, this.context));
                int iLIZIZ = (int) C497740JfY.LIZIZ(12.0f);
                c20743516FdLIZLLL.setBounds(0, 0, iLIZIZ, iLIZIZ);
                C786410Ut5.q2(spannableStringBuilder, Build.VERSION.SDK_INT >= 29 ? new ImageSpan(c20743516FdLIZLLL, 2) : new ImageSpan(c20743516FdLIZLLL), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 17);
            }
        }
        C16F5 c16f5 = this.LLJI;
        if (c16f5 != null) {
            c16f5.setText(spannableStringBuilder);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("banner_show");
        c474500IjALIZ.LJIJJLI(this.dataChannel);
        c474500IjALIZ.LJJII("live_take_page", "banner_page");
        c474500IjALIZ.LJJII(C0UOD.LIZIZ(this.LLJIJIL), "banner_content_starling_key");
        LiveMode liveMode = (LiveMode) this.dataChannel.gg0(LiveModeChannel.class);
        c474500IjALIZ.LJJII(liveMode != null ? C354201Zc.LIZ(liveMode) : null, "live_type");
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() throws Exception {
        if (this.LLJILJILJ) {
            super.show();
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        View view;
        super.E1();
        hide();
        if (!C760180Trs.LJI() && (view = getView()) != null) {
            view.setBackgroundResource(R.drawable.dlu);
        }
        View view2 = getView();
        this.LLJI = view2 != null ? (C16F5) view2.findViewById(R.id.rrd) : null;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.EQ2(this, RoomCreateInfoChannel.class, new AwS591S0100000_12(this, 343));
        }
        View view3 = getView();
        if (view3 != null) {
            C500260Jjc.LJLIIIL(500L, view3, new AwS591S0100000_12(this, 344));
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.EQ2(this, CppAgeVerifyResponse.class, new AwS591S0100000_12(this, 345));
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return C760180Trs.LJI() ? R.layout.h25 : R.layout.h24;
    }

    @Override // com.bytedance.android.live.broadcast.banner.BannerWidget
    public final String H1() {
        return this.LLJILLL;
    }
}
