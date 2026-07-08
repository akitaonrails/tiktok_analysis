package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.C0IJ7;
import X.C0UPW;
import X.C1161920gLG;
import X.C20441214yg;
import X.C500260Jjc;
import X.C786410Ut5;
import X.InterfaceC948540an6;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.LivePreviewGuestLayoutZoomOutFinish;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.live.liveinteract.api.AbsMultiGuestPreviewLiveLayoutWidget;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.widget.previewlive.layoutwidiget.MultiGuestPreviewLiveLayoutWidget;
import com.bytedance.android.livesdk.broadcast.LivePreviewGuestLayoutRefresh;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class PreviewGuestLayoutRootWidget extends PreviewWidget {
    public AbsMultiGuestPreviewLiveLayoutWidget LLILZ;

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void D1() {
        RecyclableWidgetManager recyclableWidgetManager;
        this.LLILLL = false;
        C20441214yg.LIZIZ("PreviewGuestLayoutRootWidget", "unLoadMultiGuestPreviewLiveLayoutWidget");
        AbsMultiGuestPreviewLiveLayoutWidget absMultiGuestPreviewLiveLayoutWidget = this.LLILZ;
        if (absMultiGuestPreviewLiveLayoutWidget != null && (recyclableWidgetManager = this.subWidgetManager) != null) {
            recyclableWidgetManager.unload(absMultiGuestPreviewLiveLayoutWidget);
        }
        this.LLILZ = null;
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.i1_;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onHide() {
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() {
        C20441214yg.LIZIZ("PreviewGuestLayoutRootWidget", "onShow");
        this.dataChannel.FQ2(LivePreviewGuestLayoutZoomOutFinish.class);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void C1() {
        ViewGroup viewGroup;
        super.C1();
        C20441214yg.LIZIZ("PreviewGuestLayoutRootWidget", "onAttach");
        enableSubWidgetManager(C0IJ7.LIZLLL(getContext()));
        C20441214yg.LIZIZ("PreviewGuestLayoutRootWidget", "loadMultiGuestPreviewLiveLayoutWidget");
        View view = getView();
        if (!(view instanceof ViewGroup) || (viewGroup = (ViewGroup) view) == null) {
            return;
        }
        Context context = this.context;
        C20441214yg.LIZIZ("GuestLayoutContainerHelper", "generateGuestContainer");
        C0UPW.LJ();
        C0UPW.LIZLLL = "livePreview";
        FrameLayout frameLayout = new FrameLayout(new MutableContextWrapper(context));
        C786410Ut5.a6(frameLayout, new ViewGroup.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(new MutableContextWrapper(context));
        frameLayout2.setId(R.id.j__);
        C786410Ut5.a6(frameLayout2, new ViewGroup.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2);
        viewGroup.addView(frameLayout);
        C0UPW.LIZ = new WeakReference<>(frameLayout);
        C0UPW.LIZIZ = new WeakReference<>(frameLayout2);
        C500260Jjc.LLFFF(frameLayout);
        InterfaceC948540an6 interfaceC948540an6E32 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).e32();
        MultiGuestPreviewLiveLayoutWidget multiGuestPreviewLiveLayoutWidgetLJIIJJI = interfaceC948540an6E32 != null ? interfaceC948540an6E32.LJIIJJI(frameLayout, this.dataChannel) : null;
        this.LLILZ = multiGuestPreviewLiveLayoutWidgetLJIIJJI;
        try {
            RecyclableWidgetManager recyclableWidgetManager = this.subWidgetManager;
            if (recyclableWidgetManager != null) {
                recyclableWidgetManager.load(multiGuestPreviewLiveLayoutWidgetLJIIJJI);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJ("PreviewGuestLayoutRootWidget", String.valueOf(e));
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        super.E1();
        this.dataChannel.BQ2(this, LivePreviewGuestLayoutRefresh.class, new AwS591S0100000_12(this, 270));
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        super.hide();
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        super.show();
    }
}
