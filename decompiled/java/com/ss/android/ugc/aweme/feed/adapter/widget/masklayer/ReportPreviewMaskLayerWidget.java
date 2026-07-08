package com.ss.android.ugc.aweme.feed.adapter.widget.masklayer;

import X.C01GW;
import X.C1210880hcE;
import X.C1308910kAL;
import X.C13LE;
import X.C1440005kM;
import X.C1548820qPI;
import X.C19719912Dl;
import X.C1ACA;
import X.C262100zr;
import X.C452501pT;
import X.EnumC494740Jai;
import X.InterfaceC1107590evd;
import X.InterfaceC1141530foN;
import Y.AObserverS211S0100000_7;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class ReportPreviewMaskLayerWidget extends LiveWatchPreviewWidget implements InterfaceC1141530foN {
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;

    public ReportPreviewMaskLayerWidget() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FeedLiveViewHolderVM.class);
        AwS551S0100000_7 awS551S0100000_7 = new AwS551S0100000_7(c19719912DlLIZ, 157);
        WidgetWithoutSyncConfig widgetWithoutSyncConfig = WidgetWithoutSyncConfig.INSTANCE;
        boolean initVmWithoutSync = widgetWithoutSyncConfig.getInitVmWithoutSync();
        EnumC494740Jai enumC494740Jai = EnumC494740Jai.WIDGET;
        this.LLJ = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ, enumC494740Jai, awS551S0100000_7, WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), initVmWithoutSync);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(LivePreviewPlayerVM.class);
        this.LLJI = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ2, enumC494740Jai, new AwS551S0100000_7(c19719912DlLIZ2, 158), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        this.LLJIJIL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 156));
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void E1() {
        this.LLJILJIL = true;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void L1() {
        this.LLJILJIL = false;
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
        if (this.LLJILJILJ) {
            C1548820qPI.LJIIIIZZ("ttlive_report_preview", this);
            C1548820qPI.LJIIIIZZ("ttlive_report_success", this);
            this.LLJILJILJ = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void B1() {
        hide();
        if (this.LLJILJILJ) {
            return;
        }
        C1548820qPI.LIZLLL("ttlive_report_preview", this);
        C1548820qPI.LIZLLL("ttlive_report_success", this);
        this.LLJILJILJ = true;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void H1() {
        hide();
        if (this.LLJILJILJ) {
            C1548820qPI.LJIIIIZZ("ttlive_report_preview", this);
            C1548820qPI.LJIIIIZZ("ttlive_report_success", this);
            this.LLJILJILJ = false;
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void LJJIJIIJIL(int i) {
        this.LLJILJIL = true;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void LJLIIIL(int i) {
        this.LLJILJIL = false;
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        InterfaceC1107590evd interfaceC1107590evd;
        String string;
        Aweme aweme;
        if (!this.LLJILJIL) {
            return;
        }
        String str = c262100zr.LIZ;
        String string2 = null;
        if (Intrinsics.LJFF(str, "ttlive_report_preview")) {
            InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
            if (interfaceC1107590evd2 != null) {
                String string3 = interfaceC1107590evd2.getString("source");
                InterfaceC1107590evd interfaceC1107590evd3 = c262100zr.LIZIZ;
                if (interfaceC1107590evd3 != null) {
                    string2 = interfaceC1107590evd3.getString("action");
                }
                if (TextUtils.equals(string3, "anchor")) {
                    int iIntValue = 0;
                    if (TextUtils.equals(string2, "hide")) {
                        View view = (View) this.LLJIJIL.getValue();
                        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.e1, this.context);
                        if (numLIZJ != null) {
                            iIntValue = numLIZJ.intValue();
                        }
                        view.setBackgroundColor(iIntValue);
                        show();
                        LivePreviewPlayerVM livePreviewPlayerVM = (LivePreviewPlayerVM) this.LLJI.getValue();
                        if (livePreviewPlayerVM != null) {
                            livePreviewPlayerVM.LJIILJJIL(true);
                            return;
                        }
                        return;
                    }
                    if (!TextUtils.equals(string2, "unhide")) {
                        return;
                    }
                    hide();
                    LivePreviewPlayerVM livePreviewPlayerVM2 = (LivePreviewPlayerVM) this.LLJI.getValue();
                    if (livePreviewPlayerVM2 == null) {
                        return;
                    }
                    livePreviewPlayerVM2.LJIILJJIL(false);
                    return;
                }
                return;
            }
            return;
        }
        if (!Intrinsics.LJFF(str, "ttlive_report_success") || (interfaceC1107590evd = c262100zr.LIZIZ) == null) {
            return;
        }
        String string4 = interfaceC1107590evd.getString("source");
        InterfaceC1107590evd interfaceC1107590evd4 = c262100zr.LIZIZ;
        if (interfaceC1107590evd4 != null) {
            string = interfaceC1107590evd4.getString("action");
        } else {
            string = null;
        }
        if (!TextUtils.equals(string4, "anchor") || !TextUtils.equals(string, "remove")) {
            return;
        }
        C1ACA c1acaZ1 = z1();
        if (c1acaZ1 != null) {
            aweme = c1acaZ1.LIZIZ;
        } else {
            aweme = null;
        }
        C1ACA c1acaZ12 = z1();
        if (c1acaZ12 != null) {
            string2 = c1acaZ12.LJ;
        }
        C1440005kM.LIZ(new C1210880hcE(string2, "FUNCTION_FROM_DEFAULT", "report_delete", aweme));
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        NextLiveData<Unit> nextLiveData;
        super.onLoad(objArr);
        FeedLiveViewHolderVM feedLiveViewHolderVM = (FeedLiveViewHolderVM) this.LLJ.getValue();
        if (feedLiveViewHolderVM != null && (nextLiveData = feedLiveViewHolderVM.LLJJLIIIJLLLLLLLZ) != null) {
            nextLiveData.observe(this, new AObserverS211S0100000_7(this, 15));
        }
    }
}
