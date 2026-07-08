package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.audience;

import X.C1094430eaP;
import X.C1145170fuF;
import X.C1161920gLG;
import X.C1165504hB;
import X.C13LE;
import X.C1839560xyE;
import X.C500260Jjc;
import X.C723850SaN;
import X.C786410Ut5;
import X.InterfaceC1097170eep;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.comp.api.pcs.IPcsService;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.LivePcsFontDownloadOnDemandSetting;
import com.bytedance.android.livesdk.comp.api.pcs.ui.decoration.audiencerender.AudienceDecorationRoomExitEvent;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.audience.message.AudienceDecorationMessageAssem;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.RecycleSource;
import com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes18.dex */
public final class PcsAudienceDecorationWidget extends LiveRecycleSourceWidget {
    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hfp;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public final void onUnload(RecycleSource recycleSource) {
        Fragment fragment;
        ViewGroup viewGroup;
        DataChannel dataChannel = this.dataChannel;
        String strName = null;
        if (recycleSource != null) {
            strName = recycleSource.name();
        }
        dataChannel.LC0(AudienceDecorationRoomExitEvent.class, new C1165504hB(strName));
        View view = this.contentView;
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
            C786410Ut5.LJJJJI(viewGroup);
        }
        InterfaceC1097170eep interfaceC1097170eep = this.widgetCallback;
        if (interfaceC1097170eep != null && (fragment = interfaceC1097170eep.getFragment()) != null) {
            C723850SaN.LJIIIIZZ(fragment, C13LE.LIZ(PcsAudienceDecorationAssem.class));
            C723850SaN.LJIIIIZZ(fragment, C13LE.LIZ(AudienceDecorationMessageAssem.class));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public final void onLoad(RecycleSource recycleSource, Object[] objArr) {
        ViewGroup viewGroup;
        View viewLIZLLL;
        InterfaceC1097170eep interfaceC1097170eep;
        Fragment fragment;
        if (!LivePcsFontDownloadOnDemandSetting.INSTANCE.getValue()) {
            C1839560xyE.LJIIIIZZ(this.context, new C1094430eaP());
        }
        long jLJJLIIIJ = C500260Jjc.LJJLIIIJ(this.dataChannel);
        View view = this.contentView;
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null && (viewLIZLLL = ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).ZI2().LIZLLL(viewGroup)) != null && (interfaceC1097170eep = this.widgetCallback) != null && (fragment = interfaceC1097170eep.getFragment()) != null) {
            C723850SaN.LIZ(fragment, false, null, new C1145170fuF(fragment, this, jLJJLIIIJ, viewLIZLLL), 3);
        }
    }
}
