package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.C1119920fFW;
import X.C1148240fzC;
import X.C16F5;
import X.C2188811AlT;
import X.C474650IjP;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import X.InterfaceC772600USk;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.livesdk.broadcast.preview.widget.TryModeIntroductionWidget;
import com.bytedance.android.livesdk.livesetting.broadcast.AnchorPreviewNoPermissionOptABSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveNoPermissionDisplaySwitch;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.room.EntranceConditionsPopup;

/* JADX INFO: loaded from: classes8.dex */
public final class TryModeIntroductionWidget extends PreviewWidget {
    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.i22;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void C1() {
        C16F5 c16f5;
        C16F5 c16f52;
        C16F5 c16f53;
        View view;
        TextView textView;
        super.C1();
        if (LiveNoPermissionDisplaySwitch.INSTANCE.enable() && Intrinsics.LJFF(DataChannelGlobal.LLILZ.gg0(C1148240fzC.class), Boolean.TRUE) && (view = getView()) != null && (textView = (TextView) view.findViewById(R.id.wgz)) != null) {
            String strLJIJI = C497740JfY.LJIJI(2131842604);
            String strLJIJI2 = C497740JfY.LJIJI(2131853238);
            if (strLJIJI2 == null) {
                strLJIJI2 = "";
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLJIJI);
            sbLIZ.append(' ');
            sbLIZ.append(strLJIJI2);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C2188811AlT.LIZIZ(sbLIZ));
            C786410Ut5.q2(spannableStringBuilder, new ClickableSpan() { // from class: X.0Jj5
                public long LL = -1;
                public final long LLILLJJLI = 1000;

                @Override // android.text.style.ClickableSpan
                public final void onClick(View view2) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long j = this.LL;
                    if (j != -1 && jCurrentTimeMillis - j <= this.LLILLJJLI) {
                        return;
                    }
                    this.LL = jCurrentTimeMillis;
                    EntranceConditionsPopup entranceConditionsPopup = (EntranceConditionsPopup) DataChannelGlobal.LLILZ.gg0(C931330aLL.class);
                    if (entranceConditionsPopup != null) {
                        TryModeIntroductionWidget tryModeIntroductionWidget = this.LLILLL;
                        C770730ULf.LJIIIIZZ(tryModeIntroductionWidget.getContext(), tryModeIntroductionWidget.dataChannel, entranceConditionsPopup);
                        C0UQX.LJJIIJ(LiveMode.VIDEO, tryModeIntroductionWidget.dataChannel);
                    }
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                    textPaint.setColor(C497740JfY.LIZLLL(R.attr.fxd, this.LLILLL.context));
                    C444890HcV c444890HcV = new C444890HcV();
                    c444890HcV.LIZ(83);
                    textPaint.setTypeface(c444890HcV.getTypeface());
                    textPaint.setUnderlineText(false);
                }
            }, spannableStringBuilder.length() - strLJIJI2.length(), spannableStringBuilder.length(), 17);
            C1119920fFW.LJIIIIZZ(spannableStringBuilder, spannableStringBuilder.length() - strLJIJI2.length(), spannableStringBuilder.length(), 17, 500);
            textView.setHighlightColor(0);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            textView.setText(spannableStringBuilder);
        }
        if (AnchorPreviewNoPermissionOptABSetting.INSTANCE.enable() && C500260Jjc.LJJIFFI(InterfaceC772600USk.If.LIZIZ()) && C474650IjP.LIZ()) {
            View view2 = getView();
            if (view2 != null && (c16f53 = (C16F5) view2.findViewById(R.id.wgz)) != null) {
                C786410Ut5.LLJJJJ(c16f53, 8);
            }
            View view3 = getView();
            if (view3 != null && (c16f52 = (C16F5) view3.findViewById(R.id.title)) != null) {
                C786410Ut5.LLJJJJ(c16f52, 8);
            }
            View view4 = getView();
            if (view4 == null || (c16f5 = (C16F5) view4.findViewById(R.id.hzz)) == null) {
                return;
            }
            C786410Ut5.LLJJJJ(c16f5, 0);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(C497740JfY.LJIJI(2131855369));
            sbLIZ2.append('\n');
            sbLIZ2.append(C497740JfY.LJIJI(2131855368));
            c16f5.setText(C2188811AlT.LIZIZ(sbLIZ2));
        }
    }
}
