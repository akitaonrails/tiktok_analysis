package com.ss.android.ugc.aweme.feed.adapter.widget.bottom;

import X.C01GW;
import X.C13LE;
import X.C19719912Dl;
import X.C418440Gaw;
import X.EnumC494740Jai;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public abstract class AbsLivePreviewBottomCardWidget extends LiveWatchPreviewWidget {
    public static final float LLJI = C418440Gaw.LIZIZ(12);
    public final C01GW LLJ;

    public AbsLivePreviewBottomCardWidget() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LivePreviewBottomCardVM.class);
        this.LLJ = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ, EnumC494740Jai.WIDGET, new AwS551S0100000_7(c19719912DlLIZ, 144), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), WidgetWithoutSyncConfig.INSTANCE.getInitVmWithoutSync());
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final LivePreviewBottomCardVM M1() {
        return (LivePreviewBottomCardVM) this.LLJ.getValue();
    }
}
