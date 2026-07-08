package com.ss.android.ugc.aweme.feed.adapter.widget.videobottomblock;

import X.C01GW;
import X.C13LE;
import X.C188S;
import X.C188T;
import X.C19719912Dl;
import X.C2318921Fpq;
import X.C452501pT;
import X.EnumC494740Jai;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.videobottomblock.VideoBottomBarBlockWidget;

/* JADX INFO: loaded from: classes33.dex */
public final class VideoBottomBarBlockWidget extends LiveWatchPreviewWidget {
    public final C01GW LLJ = C452501pT.LIZIZ(new C188S(this));
    public final C01GW LLJI;

    public VideoBottomBarBlockWidget() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoBottomBlockVM.class);
        this.LLJI = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ, EnumC494740Jai.WIDGET, new C188T(c19719912DlLIZ), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), WidgetWithoutSyncConfig.INSTANCE.getInitVmWithoutSync());
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

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        MutableLiveData<C2318921Fpq> mutableLiveData;
        super.onLoad(objArr);
        VideoBottomBlockVM videoBottomBlockVM = (VideoBottomBlockVM) this.LLJI.getValue();
        if (videoBottomBlockVM != null && (mutableLiveData = videoBottomBlockVM.LL) != null) {
            mutableLiveData.observe(this, new Observer() { // from class: X.17tb
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    VideoBottomBarBlockWidget videoBottomBarBlockWidget = this.LL;
                    obj.getClass();
                    View view = (View) videoBottomBarBlockWidget.LLJ.getValue();
                    if (view != null) {
                        C786410Ut5.LJLLLLLL(8, view);
                    }
                }
            });
        }
    }
}
