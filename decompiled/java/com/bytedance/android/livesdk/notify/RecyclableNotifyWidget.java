package com.bytedance.android.livesdk.notify;

import X.C0K9J;
import X.C0K9T;
import X.C0KAJ;
import X.C1102070emj;
import X.C1161920gLG;
import X.C512820K9g;
import X.EnumC512800K9e;
import X.InterfaceC1096630edx;
import X.InterfaceC1102150emr;
import X.InterfaceC512830K9h;
import X.InterfaceC512840K9i;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.programmedlive.ui.ProgrammedLiveFollowCardWidget;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.IHiddenChangeAwareWidget;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public abstract class RecyclableNotifyWidget extends LiveRecyclableWidget implements InterfaceC1102150emr, InterfaceC512840K9i, InterfaceC512830K9h, IHiddenChangeAwareWidget {
    @Override // X.InterfaceC1102150emr
    public List<String> Q0() {
        return null;
    }

    @Override // X.InterfaceC1102150emr
    public final boolean e() {
        return true;
    }

    @Override // X.InterfaceC1102150emr
    public C0K9J getUiInfo() {
        return null;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        x1(EnumC512800K9e.OTHERS, false);
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest() && ((ProgrammedLiveFollowCardWidget) this).LLJJJIL != null) {
            throw new IllegalStateException("You must pass hide reason for notify widget.");
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public void onUnload() {
        C1102070emj.LJIILJJIL(C1102070emj.LIZ, this.dataChannel, this, ((ProgrammedLiveFollowCardWidget) this).LLJJJIL, C0KAJ.AUTO_TERMINATE, null, null, 112);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        if (!isShowing()) {
            C1102070emj.LIZ.LJIIJ(this.dataChannel, this, ((ProgrammedLiveFollowCardWidget) this).LLJJJIL, null);
        }
        super.show();
    }

    @Override // com.bytedance.ies.sdk.widgets.IHiddenChangeAwareWidget
    public void onHide() {
        IHiddenChangeAwareWidget.DefaultImpls.onHide(this);
    }

    @Override // com.bytedance.ies.sdk.widgets.IHiddenChangeAwareWidget
    public final void onShow() {
        IHiddenChangeAwareWidget.DefaultImpls.onShow(this);
    }

    public void x1(EnumC512800K9e enumC512800K9e, boolean z) {
        if (isShowing()) {
            C0KAJ.Companion.getClass();
            C0KAJ c0kajLIZ = C512820K9g.LIZ(enumC512800K9e);
            if (c0kajLIZ != null) {
                C1102070emj.LJIILJJIL(C1102070emj.LIZ, this.dataChannel, this, ((ProgrammedLiveFollowCardWidget) this).LLJJJIL, c0kajLIZ, null, null, 112);
            }
        }
        super.hide();
        if (z) {
            super.hide();
            onHide();
        } else {
            super.hide();
            onHide();
        }
    }

    @Override // X.InterfaceC512830K9h
    public final void LLIILII(boolean z, boolean z2, boolean z3, InterfaceC1096630edx interfaceC1096630edx, C0KAJ c0kaj) {
        C0KAJ c0kaj2 = c0kaj;
        if (z) {
            x1(EnumC512800K9e.CONFLICT_CONTROLLED, z2);
        }
        C1102070emj c1102070emj = C1102070emj.LIZ;
        ProgrammedLiveFollowCardWidget programmedLiveFollowCardWidget = (ProgrammedLiveFollowCardWidget) this;
        C1102070emj.LJIJI(c1102070emj, this.dataChannel, this, programmedLiveFollowCardWidget.LLJJJIL, interfaceC1096630edx);
        if (z3) {
            DataChannel dataChannel = this.dataChannel;
            C0K9T c0k9t = programmedLiveFollowCardWidget.LLJJJIL;
            if (c0kaj2 == null) {
                c0kaj2 = C0KAJ.AUTO_TERMINATE;
            }
            C1102070emj.LJIILJJIL(c1102070emj, dataChannel, this, c0k9t, c0kaj2, null, null, 112);
        }
    }
}
