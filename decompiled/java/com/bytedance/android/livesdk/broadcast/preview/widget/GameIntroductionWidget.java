package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.C1119920fFW;
import X.C2188811AlT;
import X.C497740JfY;
import X.C521550Kcr;
import X.C786410Ut5;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public final class GameIntroductionWidget extends PreviewWidget {
    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.i18;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void C1() {
        TextView textView;
        super.C1();
        View view = getView();
        if (view == null || (textView = (TextView) view.findViewById(R.id.wgz)) == null) {
            return;
        }
        String strLJIJI = C497740JfY.LJIJI(2131853802);
        String strLJIJI2 = C497740JfY.LJIJI(2131853803);
        if (strLJIJI2 == null) {
            strLJIJI2 = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLJIJI);
        sbLIZ.append(' ');
        sbLIZ.append(strLJIJI2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C2188811AlT.LIZIZ(sbLIZ));
        C786410Ut5.q2(spannableStringBuilder, new C521550Kcr(this, 3), spannableStringBuilder.length() - strLJIJI2.length(), spannableStringBuilder.length(), 17);
        C1119920fFW.LJIIIIZZ(spannableStringBuilder, spannableStringBuilder.length() - strLJIJI2.length(), spannableStringBuilder.length(), 17, 500);
        textView.setHighlightColor(0);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(spannableStringBuilder);
    }
}
