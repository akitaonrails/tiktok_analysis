package com.ss.android.ugc.aweme.feed.adapter.widget;

import X.C01GW;
import X.C07IN;
import X.C1ABT;
import X.C1ACA;
import X.C2174941AAa;
import X.C2174951AAb;
import X.C2174961AAc;
import X.C418440Gaw;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes34.dex */
public final class TitleWidget extends LiveWatchPreviewWidget {
    public static final C2174961AAc LLJIJIL = new Object() { // from class: X.1AAc
    };
    public final C01GW LLJ = C452501pT.LIZIZ(new C2174941AAa(this));
    public final C01GW LLJI = C452501pT.LIZIZ(new C2174951AAb(this));

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.df3;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00c0  */
    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J1() {
        /*
            Method dump skipped, instruction units count: 579
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.widget.TitleWidget.J1():void");
    }

    public final TuxTextView M1() {
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.zvr);
        C1ACA c1acaZ1 = z1();
        if (c1acaZ1 != null && C1ABT.LJIILIIL(c1acaZ1)) {
            C1ACA c1acaZ12 = z1();
            if (c1acaZ12 != null && TextUtils.equals(c1acaZ12.LIZLLL, "homepage_hot")) {
                return tuxTextView;
            }
            C1ACA c1acaZ13 = z1();
            if (c1acaZ13 != null && TextUtils.equals(c1acaZ13.LIZLLL, "homepage_follow")) {
                return tuxTextView;
            }
        }
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) tuxTextView.getLayoutParams();
        marginLayoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(87)));
        C786410Ut5.R6(tuxTextView, marginLayoutParams);
        return tuxTextView;
    }

    public final TuxTextView N1() {
        return C07IN.LIZ() ? M1() : (TuxTextView) this.LLJI.getValue();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        super.hide();
        C786410Ut5.LJZI(8, (ImageView) this.LLJ.getValue());
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        super.onLoad(objArr);
    }
}
