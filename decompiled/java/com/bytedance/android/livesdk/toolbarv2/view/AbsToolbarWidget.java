package com.bytedance.android.livesdk.toolbarv2.view;

import X.C0IJT;
import X.C1088840eRO;
import X.C1161920gLG;
import X.C474500IjA;
import X.C497740JfY;
import X.C500260Jjc;
import X.EnumC1088870eRR;
import X.InterfaceC1088880eRS;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.setting.LiveToolbarLoadOptimizeSetting;
import com.bytedance.android.live.toolbar.IToolbarService;
import com.bytedance.android.livesdk.dataChannel.ToolbarCanShowEvent;
import com.bytedance.android.livesdk.toolbarv2.ToolbarShowEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public abstract class AbsToolbarWidget extends LiveRecyclableWidget {
    public LinearLayout LL;

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public abstract void x1();

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public void onInit(Object[] objArr) {
        LinearLayout linearLayout;
        View view = getView();
        if (view instanceof LinearLayout) {
            linearLayout = (LinearLayout) view;
        } else {
            linearLayout = null;
        }
        this.LL = linearLayout;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public void onLoad(Object[] objArr) {
        if (LiveToolbarLoadOptimizeSetting.INSTANCE.enableTogetherShowOptimize(this.dataChannel)) {
            show();
            this.dataChannel.BQ2(this, ToolbarShowEvent.class, new AwS596S0100000_17(this, 244));
            this.dataChannel.BQ2(this, ToolbarCanShowEvent.class, new AwS596S0100000_17(this, 245));
        } else {
            this.dataChannel.BQ2(this, ToolbarShowEvent.class, new AwS596S0100000_17(this, 246));
        }
        x1();
    }

    public final void y1(ViewGroup viewGroup, EnumC1088870eRR enumC1088870eRR) {
        Object objLLFF;
        Object obj;
        Object obj2;
        InterfaceC1088880eRS interfaceC1088880eRSMn1 = ((IToolbarService) C1161920gLG.LIZJ(IToolbarService.class)).Mn1(this.dataChannel);
        if (interfaceC1088880eRSMn1 != null) {
            interfaceC1088880eRSMn1.LJII(this.dataChannel, enumC1088870eRR, viewGroup);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_toolbar_load_finished");
        c474500IjALIZ.LJIJJLI(this.dataChannel);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            objLLFF = C500260Jjc.LLFF(dataChannel);
        } else {
            objLLFF = null;
        }
        c474500IjALIZ.LJJII(objLLFF, "user_type");
        if (C497740JfY.LJIL()) {
            obj = "portrait";
        } else {
            obj = "landscape";
        }
        c474500IjALIZ.LJJII(obj, "room_orientation");
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJIIZILJ(this.dataChannel) ? 1 : 0), "is_anchor");
        int i = C1088840eRO.LIZ[enumC1088870eRR.ordinal()];
        if (i != 1) {
            if (i != 2) {
                obj2 = "";
            } else if (C500260Jjc.LJIIZILJ(this.dataChannel)) {
                obj2 = "AnchorRightBottom";
            } else {
                obj2 = "AudienceRightBottom";
            }
        } else if (C500260Jjc.LJIIZILJ(this.dataChannel)) {
            obj2 = "AnchorLeftBottom";
        } else {
            obj2 = "AudienceLeftBottom";
        }
        c474500IjALIZ.LJJII(obj2, "button_scene");
        c474500IjALIZ.LIZ();
    }
}
