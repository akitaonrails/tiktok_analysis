package com.bytedance.android.livesdk.programmedlive.ui;

import X.C16F5;
import X.C1834150xpV;
import X.C1850730yGF;
import X.C20736316Cj;
import X.C21627319kV;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes18.dex */
public final class ProgrammedLiveOnlineAudienceCollapseWidget extends ProgrammedLiveOnlineAudienceWidget {
    @Override // com.bytedance.android.livesdk.programmedlive.ui.ProgrammedLiveOnlineAudienceWidget, com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hjm;
    }

    @Override // com.bytedance.android.livesdk.programmedlive.ui.ProgrammedLiveOnlineAudienceWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.programmedlive.ui.ProgrammedLiveOnlineAudienceWidget
    public final void x1() {
        TextView textView;
        View view = getView();
        if (!(view instanceof TextView) || (textView = (TextView) view) == null) {
            return;
        }
        textView.setText(textView.getContext().getResources().getQuantityString(2131755590, this.LLILLJJLI, C21627319kV.LIZJ().LJFF(C1850730yGF.LIZJ(this.LLILLJJLI))));
    }

    @Override // com.bytedance.android.livesdk.programmedlive.ui.ProgrammedLiveOnlineAudienceWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        TextView textView;
        C16F5 c16f5;
        super.onLoad(objArr);
        attachAndShow();
        View view = getView();
        if ((view instanceof TextView) && (textView = (TextView) view) != null) {
            if ((textView instanceof C16F5) && (c16f5 = (C16F5) textView) != null) {
                c16f5.LJJJI(R.style.a9f);
            }
            textView.setTextColor(C20736316Cj.LIZIZ(R.attr.ezt, C1834150xpV.LJII(textView.getContext())));
            textView.setShadowLayer(1.0f, 0.0f, 0.5f, C20736316Cj.LIZIZ(R.attr.exj, textView.getContext()));
        }
    }
}
