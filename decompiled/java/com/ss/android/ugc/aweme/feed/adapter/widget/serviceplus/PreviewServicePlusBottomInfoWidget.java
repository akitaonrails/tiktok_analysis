package com.ss.android.ugc.aweme.feed.adapter.widget.serviceplus;

import X.C01GW;
import X.C0IJT;
import X.C13LE;
import X.C13LP;
import X.C19719912Dl;
import X.C1ACA;
import X.C2248361CzK;
import X.C2252261DDk;
import X.C292401Bi;
import X.C474500IjA;
import X.C698190Ra5;
import X.EnumC494740Jai;
import X.InterfaceC500940Jki;
import Y.AObserverS235S0100000_33;
import Y.ARunnableS133S0100000_33;
import android.os.Looper;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.widgets.WidgetViewModelLazyKt;
import com.bytedance.ies.sdk.widgets.WidgetWithoutSyncConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.ss.android.ugc.aweme.feed.adapter.viewholdervm.FeedLiveViewHolderVM;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerVM;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.SMBLivePreview;
import com.ss.android.ugc.aweme.feed.model.live.SMBLivePreviewKt;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class PreviewServicePlusBottomInfoWidget extends LiveWatchPreviewWidget {
    public static final /* synthetic */ int LLJJJJLIIL = 0;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public int LLJJ;
    public final BPEAHandler LLJJI;
    public final AObserverS235S0100000_33 LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public SMBLivePreview LLJJJJJIL;

    public PreviewServicePlusBottomInfoWidget() {
        EnumC494740Jai enumC494740Jai = EnumC494740Jai.WIDGET;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(LivePreviewPlayerVM.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 2143);
        WidgetWithoutSyncConfig widgetWithoutSyncConfig = WidgetWithoutSyncConfig.INSTANCE;
        this.LLJ = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ, enumC494740Jai, awS577S0100000_33, WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(FeedLiveViewHolderVM.class);
        this.LLJI = WidgetViewModelLazyKt.provideViewModelDelegate(this, c19719912DlLIZ2, enumC494740Jai, new AwS577S0100000_33(c19719912DlLIZ2, 2144), WidgetViewModelLazyKt.getDefaultViewModelProviderFactoryProducer(this), widgetWithoutSyncConfig.getInitVmWithoutSync());
        this.LLJILLL = true;
        this.LLJJI = new BPEAHandler(Looper.getMainLooper());
        this.LLJJIII = new AObserverS235S0100000_33(this, 42);
        this.LLJJIJI = C292401Bi.LIZ(new AwS577S0100000_33(this, 2145));
        this.LLJJIJIIJIL = C292401Bi.LIZ(new AwS577S0100000_33(this, 2141));
        this.LLJJIJIL = C292401Bi.LIZ(new AwS577S0100000_33(this, 2140));
        this.LLJJJ = C292401Bi.LIZ(new AwS577S0100000_33(this, 2138));
        this.LLJJJIL = C292401Bi.LIZ(new AwS577S0100000_33(this, 2139));
        this.LLJJJJ = C292401Bi.LIZ(new AwS577S0100000_33(this, 2142));
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.dgj;
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

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void F1() {
        if (this.LLJILLL) {
            this.LLJILLL = false;
        }
        P1();
    }

    public final C2252261DDk M1() {
        return (C2252261DDk) this.LLJJJJ.getValue();
    }

    public final void P1() {
        List<SMBLivePreview.PreviewItem> list;
        SMBLivePreview.PreviewItem previewItem;
        MutableLiveData<Integer> mutableLiveData;
        LiveRoomStruct liveRoomStruct;
        LiveRoomStruct liveRoomStruct2;
        List<SMBLivePreview.PreviewItem> list2;
        if (!this.LLJILJIL) {
            hide();
            return;
        }
        SMBLivePreview sMBLivePreview = this.LLJJJJJIL;
        if (sMBLivePreview != null && (list2 = sMBLivePreview.previewItem) != null && list2.isEmpty()) {
            hide();
        }
        SMBLivePreview sMBLivePreview2 = this.LLJJJJJIL;
        if (sMBLivePreview2 == null || (list = sMBLivePreview2.previewItem) == null || (previewItem = (SMBLivePreview.PreviewItem) C13LP.LJJJLL(list)) == null) {
            return;
        }
        show();
        this.LLJJI.removeCallbacksAndMessages(null);
        if (isShowing()) {
            C1ACA c1acaZ1 = z1();
            if (c1acaZ1 != null) {
                c1acaZ1.LJLIL = previewItem;
            }
            try {
                C01GW c01gw = C2248361CzK.LIZ;
                C698190Ra5 c698190Ra5LJFF = C2248361CzK.LJFF(this.context, previewItem.iconToken);
                if (c698190Ra5LJFF != null) {
                    ((TuxIconView) this.LLJJIJIIJIL.getValue()).setIconRes(c698190Ra5LJFF.LIZ);
                    Integer num = c698190Ra5LJFF.LIZIZ;
                    if (num != null) {
                        ((TuxIconView) this.LLJJIJIIJIL.getValue()).setTintColor(num.intValue());
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            ((TextView) this.LLJJIJI.getValue()).setText(previewItem.title);
            ((TextView) this.LLJJJ.getValue()).setText(previewItem.content);
            ((TextView) this.LLJJJIL.getValue()).setText("");
            if (!this.LLJILLL && this.LLJILJIL) {
                ((TextView) this.LLJJJIL.getValue()).setText("");
                M1().scrollTo(0, 0);
                ((View) this.LLJJIJIL.getValue()).scrollTo(0, 0);
                HandlerHook.viewPost(M1(), new ARunnableS133S0100000_33(this, 93));
            }
            int i = previewItem.type;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_service_plus_preview_info_msg");
            C1ACA c1acaZ12 = z1();
            c474500IjALIZ.LJI((c1acaZ12 == null || (liveRoomStruct2 = c1acaZ12.LIZJ) == null) ? null : Long.valueOf(liveRoomStruct2.ownerUserId));
            C1ACA c1acaZ13 = z1();
            c474500IjALIZ.LJJIJIIJI((c1acaZ13 == null || (liveRoomStruct = c1acaZ13.LIZJ) == null) ? null : Long.valueOf(liveRoomStruct.id));
            InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
            c474500IjALIZ.LJJII(String.valueOf(interfaceC500940JkiUser != null ? Long.valueOf(interfaceC500940JkiUser.getCurrentUserId()) : null), "user_id");
            c474500IjALIZ.LJJII(Integer.valueOf(SMBLivePreviewKt.convertPreviewType2SmbMsgType(i)), "smb_msg_type");
            if (SMBLivePreviewKt.isServiceSkuType(i)) {
                c474500IjALIZ.LJJII(Integer.valueOf(previewItem.type), "smb_service_type");
            }
            String str = previewItem.content;
            c474500IjALIZ.LJJII(str != null ? str : "", "smb_msg_text");
            c474500IjALIZ.LIZ();
        }
        FeedLiveViewHolderVM feedLiveViewHolderVM = (FeedLiveViewHolderVM) this.LLJI.getValue();
        if (feedLiveViewHolderVM == null || (mutableLiveData = feedLiveViewHolderVM.LLLIL) == null) {
            return;
        }
        mutableLiveData.postValue(1);
    }

    public final void Q1() {
        MutableLiveData<Integer> mutableLiveData;
        this.LLJJI.removeCallbacksAndMessages(null);
        M1().LIZIZ();
        FeedLiveViewHolderVM feedLiveViewHolderVM = (FeedLiveViewHolderVM) this.LLJI.getValue();
        if (feedLiveViewHolderVM != null && (mutableLiveData = feedLiveViewHolderVM.LLLIL) != null) {
            mutableLiveData.postValue(0);
        }
        hide();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void B1() {
        LiveRoomStruct liveRoomStruct;
        C1ACA c1acaZ1 = z1();
        this.LLJJJJJIL = (c1acaZ1 == null || (liveRoomStruct = c1acaZ1.LIZJ) == null) ? null : liveRoomStruct.smbLivePreview;
        P1();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void L1() {
        super.L1();
        this.LLJILJILJ = false;
        this.LLJIJIL = false;
        this.LLJILJIL = false;
        Q1();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void H1() {
        Q1();
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void LJJIJIIJIL(int i) {
        super.LJJIJIIJIL(i);
        this.LLJILJILJ = true;
        if (isShowing() && !this.LLJIJIL && this.LLJILJIL) {
            P1();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void LJLIIIL(int i) {
        this.LL = false;
        this.LLJILLL = true;
        this.LLJILJIL = false;
        Q1();
    }

    public final void N1(int i) {
        C1ACA c1acaZ1;
        LiveRoomStruct liveRoomStruct;
        int i2 = (~i) & this.LLJJ;
        this.LLJJ = i2;
        if (i2 == 0 && (c1acaZ1 = z1()) != null && (liveRoomStruct = c1acaZ1.LIZJ) != null && liveRoomStruct.smbLivePreview != null) {
            P1();
        }
    }

    public final void O1(int i) {
        this.LLJJ = i | this.LLJJ;
        if (isShowing()) {
            Q1();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        MutableLiveData<Unit> mutableLiveData;
        super.onLoad(objArr);
        LivePreviewPlayerVM livePreviewPlayerVM = (LivePreviewPlayerVM) this.LLJ.getValue();
        if (livePreviewPlayerVM != null && (mutableLiveData = livePreviewPlayerVM.LLILZIL) != null) {
            mutableLiveData.observe(this, this.LLJJIII);
        }
        FeedLiveViewHolderVM feedLiveViewHolderVM = (FeedLiveViewHolderVM) this.LLJI.getValue();
        if (feedLiveViewHolderVM != null) {
            feedLiveViewHolderVM.LLJLL.observe(this, new AObserverS235S0100000_33(this, 49));
            feedLiveViewHolderVM.LLJLLIL.observe(this, new AObserverS235S0100000_33(this, 50));
            feedLiveViewHolderVM.LLLIILIL.observe(this, new AObserverS235S0100000_33(this, 51));
            feedLiveViewHolderVM.LLLIIL.observe(this, new AObserverS235S0100000_33(this, 52));
            feedLiveViewHolderVM.LLJLLL.observe(this, new AObserverS235S0100000_33(this, 53));
        }
    }
}
