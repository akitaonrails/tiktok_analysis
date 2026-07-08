package com.bytedance.android.livesdk.game.preview.widget;

import X.AnonymousClass0206;
import X.C01GW;
import X.C11JF;
import X.C20337914i1;
import X.C452501pT;
import X.C486790J7d;
import X.C5182020e;
import X.InterfaceC1097170eep;
import X.InterfaceC772390URp;
import X.RunnableC514801zW;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes.dex */
public final class GameAutoCoverWidget extends LiveWidget {
    public final String LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new C5182020e(this, 87));
    public final C01GW LLILLL = C452501pT.LIZIZ(new C5182020e(this, 86));
    public final C01GW LLILZ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(75));
    public C11JF LLILZIL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hyp;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        C486790J7d.LIZ.post(new RunnableC514801zW(this, 39), this);
    }

    public GameAutoCoverWidget(String str) {
        this.LL = str;
    }

    public final void x1(boolean z) {
        Fragment fragment;
        FragmentManager childFragmentManager;
        C20337914i1<Boolean> c20337914i1 = InterfaceC772390URp.y;
        if (!c20337914i1.LIZIZ().booleanValue() && z) {
            InterfaceC1097170eep interfaceC1097170eep = this.widgetCallback;
            if (interfaceC1097170eep != null && (fragment = interfaceC1097170eep.getFragment()) != null && (childFragmentManager = fragment.getChildFragmentManager()) != null) {
                new GameAutoCoverAnimationDialog().show(childFragmentManager, "GameAutoCoverAnimationDialog");
            }
            c20337914i1.LJFF(Boolean.TRUE);
        }
    }
}
