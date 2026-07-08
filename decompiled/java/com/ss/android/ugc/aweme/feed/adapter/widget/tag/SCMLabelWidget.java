package com.ss.android.ugc.aweme.feed.adapter.widget.tag;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C07BA;
import X.C0XQ7;
import X.C1308910kAL;
import X.C1ACA;
import X.C2097608Jq;
import X.C384050F3z;
import X.C418440Gaw;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC20673515v3;
import X.InterfaceC488740JEq;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class SCMLabelWidget extends LiveWatchPreviewWidget {
    public static final /* synthetic */ int LLJIJIL = 0;
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 173));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS551S0100000_7(this, 172));

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dex;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final View M1() {
        return (View) this.LLJ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void H1() {
        C786410Ut5.LJLLLLLL(8, M1());
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void J1() {
        LiveRoomStruct liveRoomStruct;
        InterfaceC20673515v3 interfaceC20673515v3K4;
        InterfaceC488740JEq interfaceC488740JEqLJJJJLL;
        LiveRoomStruct liveRoomStruct2;
        C1ACA c1acaZ1 = z1();
        if (c1acaZ1 == null || (liveRoomStruct = c1acaZ1.LIZJ) == null || TextUtils.isEmpty(liveRoomStruct.scmLabel)) {
            return;
        }
        TextView textView = (TextView) this.LLJI.getValue();
        C1ACA c1acaZ12 = z1();
        textView.setText((c1acaZ12 == null || (liveRoomStruct2 = c1acaZ12.LIZJ) == null) ? null : liveRoomStruct2.scmLabel);
        if (this.context != null) {
            if (C07BA.LIZ()) {
                ((TuxTextView) this.LLJI.getValue()).setTuxFont(72);
                TextView textView2 = (TextView) this.LLJI.getValue();
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zi, this.context);
                textView2.setTextColor(numLIZJ != null ? numLIZJ.intValue() : 0);
                if (M1().getBackground() == null) {
                    View viewM1 = M1();
                    C384050F3z c384050F3z = new C384050F3z();
                    c384050F3z.LIZIZ = Integer.valueOf(R.attr.in);
                    c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
                    viewM1.setBackground(c384050F3z.LIZ(this.context));
                }
            } else {
                ((TuxTextView) this.LLJI.getValue()).setTuxFont(62);
                TextView textView3 = (TextView) this.LLJI.getValue();
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.ee, this.context);
                textView3.setTextColor(numLIZJ2 != null ? numLIZJ2.intValue() : 0);
                if (M1().getBackground() == null) {
                    View viewM12 = M1();
                    C384050F3z c384050F3z2 = new C384050F3z();
                    c384050F3z2.LIZIZ = Integer.valueOf(R.attr.e4);
                    c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(2));
                    viewM12.setBackground(c384050F3z2.LIZ(this.context));
                }
            }
            C786410Ut5.LJLLLLLL(0, M1());
            ILiveOuterService iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
            if (iLiveOuterService != null && (interfaceC20673515v3K4 = iLiveOuterService.k4()) != null && (interfaceC488740JEqLJJJJLL = interfaceC20673515v3K4.LJJJJLL("scm_page_view")) != null) {
                C0XQ7.LJFF();
                interfaceC488740JEqLJJJJLL.LIZIZ(C2097608Jq.LJIIIIZZ(new Pair("object_id", ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID()), new Pair("page_name", "live_preview_page"), new Pair("country_code", AbstractC848400XPy.LJJIJ())));
                interfaceC488740JEqLJJJJLL.LIZ();
            }
        }
        super.show();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        C786410Ut5.LJLLLLLL(8, M1());
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        super.onLoad(objArr);
    }
}
