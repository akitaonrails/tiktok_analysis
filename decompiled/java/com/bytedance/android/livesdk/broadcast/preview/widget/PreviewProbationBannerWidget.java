package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.C1119920fFW;
import X.C13LE;
import X.C16F5;
import X.C19322110iZ;
import X.C20736316Cj;
import X.C2188811AlT;
import X.C497740JfY;
import X.C748880TZe;
import X.C770220UJg;
import X.C786410Ut5;
import Y.ACListenerS147S0100000_12;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.broadcast.preview.EcommerceBlockSheetFragment;
import com.bytedance.android.livesdk.dataChannel.ProbationBannerChannel;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class PreviewProbationBannerWidget extends PreviewWidget {
    public C16F5 LLILZ;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hi1;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void C1() {
        LiveIconView liveIconView;
        super.C1();
        hide();
        View view = getView();
        C16F5 c16f5 = view != null ? (C16F5) view.findViewById(R.id.brk) : null;
        this.LLILZ = c16f5;
        if (c16f5 != null) {
            String strLJIJI = C497740JfY.LJIJI(2131852038);
            String strLJIJI2 = C497740JfY.LJIJI(2131852046);
            int length = strLJIJI != null ? strLJIJI.length() : 0;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLJIJI);
            sbLIZ.append(' ');
            sbLIZ.append(strLJIJI2);
            SpannableString spannableString = new SpannableString(C2188811AlT.LIZIZ(sbLIZ));
            C1119920fFW.LJ(this.context, spannableString, 0, length, 17, 10, 400);
            C1119920fFW.LJ(this.context, spannableString, length, spannableString.length(), 17, 10, 500);
            C786410Ut5.p2(spannableString, new ForegroundColorSpan(C20736316Cj.LIZIZ(R.attr.c9k, this.context)), 0, spannableString.length(), 17);
            c16f5.setText(spannableString);
            c16f5.setLinksClickable(true);
            c16f5.setMovementMethod(LinkMovementMethod.getInstance());
            c16f5.setHighlightColor(0);
        }
        View view2 = getView();
        if (view2 != null && (liveIconView = (LiveIconView) view2.findViewById(R.id.e1y)) != null) {
            C786410Ut5.g8(liveIconView, new ACListenerS147S0100000_12(this, 143));
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.EQ2(this, RoomCreateInfoChannel.class, new AwS591S0100000_12(this, 305));
        }
        View view3 = getView();
        if (view3 != null) {
            C786410Ut5.I7(new ACListenerS147S0100000_12(this, 144), view3);
        }
        C16F5 c16f52 = this.LLILZ;
        if (c16f52 != null) {
            C786410Ut5.l8(c16f52, new ACListenerS147S0100000_12(this, 145));
        }
    }

    public final void G1() {
        FragmentManager fragmentManager;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel == null || (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) == null) {
            return;
        }
        C19322110iZ.LJFF(fragmentManager, new EcommerceBlockSheetFragment(this.dataChannel), EcommerceBlockSheetFragment.class.getName(), null, 0);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onHide() {
        C770220UJg c770220UJg = C770220UJg.LIZ;
        C770220UJg.LJ(C13LE.LIZ(ProbationBannerChannel.class));
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() {
        C770220UJg c770220UJg = C770220UJg.LIZ;
        C770220UJg.LIZLLL(C13LE.LIZ(ProbationBannerChannel.class));
    }
}
