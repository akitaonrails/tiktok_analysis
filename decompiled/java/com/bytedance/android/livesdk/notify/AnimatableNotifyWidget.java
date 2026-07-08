package com.bytedance.android.livesdk.notify;

import X.C0K9J;
import X.C0KAJ;
import X.C1102070emj;
import X.C1161920gLG;
import X.C512820K9g;
import X.EnumC512800K9e;
import X.InterfaceC1096630edx;
import X.InterfaceC1102120emo;
import X.InterfaceC1102150emr;
import X.InterfaceC512830K9h;
import X.InterfaceC512840K9i;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.IHiddenChangeAwareWidget;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.bytedance.ies.sdk.widgets.RecycleSource;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public abstract class AnimatableNotifyWidget extends AnimatableRecyclableWidget implements InterfaceC1102150emr, InterfaceC512840K9i, InterfaceC512830K9h, IHiddenChangeAwareWidget {
    public EnumC512800K9e LL;

    public List<String> Q0() {
        return null;
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget, com.bytedance.ies.sdk.widgets.IAnimatableWidget
    public final void animateShow() {
        this.LL = null;
        C1102070emj.LIZ.LJIIJ(this.dataChannel, this, LJJLIIIIJ(), null);
        super.animateShow();
    }

    @Override // X.InterfaceC1102150emr
    public final boolean e() {
        return true;
    }

    public C0K9J getUiInfo() {
        return null;
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void show() {
        this.LL = null;
        if (!isShowing()) {
            C1102070emj.LIZ.LJIIJ(this.dataChannel, this, LJJLIIIIJ(), null);
        }
        super.show();
        onShow();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        z1(EnumC512800K9e.OTHERS, false);
        ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest();
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget, com.bytedance.ies.sdk.widgets.IAnimatableWidget
    public final void animateHide() {
        super.animateHide();
        this.LL = EnumC512800K9e.OTHERS;
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isLocalTest() && LJJLIIIIJ() != null) {
            throw new IllegalStateException("You must pass hide reason for notify widget.");
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final boolean isShowing() {
        ConstraintProperty constraintPropertyById;
        LayeredElementContext layeredElementContext = getLayeredElementContext();
        return (layeredElementContext == null || (constraintPropertyById = layeredElementContext.getConstraintPropertyById(getId())) == null) ? super.isShowing() : constraintPropertyById.visibility() == 0;
    }

    public void onHide() {
        IHiddenChangeAwareWidget.DefaultImpls.onHide(this);
    }

    @Override // com.bytedance.ies.sdk.widgets.IHiddenChangeAwareWidget
    public final void onShow() {
        IHiddenChangeAwareWidget.DefaultImpls.onShow(this);
    }

    public final void A1(EnumC512800K9e enumC512800K9e) {
        super.hide();
        this.LL = enumC512800K9e;
        onHide();
    }

    public final void B1(EnumC512800K9e enumC512800K9e) {
        C0KAJ.Companion.getClass();
        C0KAJ c0kajLIZ = C512820K9g.LIZ(enumC512800K9e);
        if (c0kajLIZ != null) {
            C1102070emj.LJIILJJIL(C1102070emj.LIZ, this.dataChannel, this, LJJLIIIIJ(), c0kajLIZ, null, null, 112);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public void onUnload(RecycleSource recycleSource) {
        this.LL = null;
        C1102070emj.LJIILJJIL(C1102070emj.LIZ, this.dataChannel, this, LJJLIIIIJ(), C0KAJ.AUTO_TERMINATE, null, null, 112);
    }

    public void x1(EnumC512800K9e enumC512800K9e) {
        super.animateHide();
        this.LL = enumC512800K9e;
    }

    public final void y1(Set<String> set) {
        C1102070emj.LIZ.LJIILL(this.dataChannel, this, LJJLIIIIJ(), set);
    }

    @Override // com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public void onLoad(RecycleSource recycleSource, Object[] objArr) {
        this.LL = null;
    }

    public void z1(EnumC512800K9e enumC512800K9e, boolean z) {
        this.LL = enumC512800K9e;
        if (isShowing()) {
            C0KAJ.Companion.getClass();
            C0KAJ c0kajLIZ = C512820K9g.LIZ(enumC512800K9e);
            if (c0kajLIZ != null) {
                C1102070emj.LJIILJJIL(C1102070emj.LIZ, this.dataChannel, this, LJJLIIIIJ(), c0kajLIZ, null, null, 112);
            }
        }
        if (z) {
            A1(enumC512800K9e);
        } else {
            super.hide();
            onHide();
        }
    }

    public void LLIILII(boolean z, boolean z2, boolean z3, InterfaceC1096630edx interfaceC1096630edx, C0KAJ c0kaj) {
        C0KAJ c0kaj2 = c0kaj;
        if (z) {
            z1(EnumC512800K9e.CONFLICT_CONTROLLED, z2);
        }
        C1102070emj c1102070emj = C1102070emj.LIZ;
        C1102070emj.LJIJI(c1102070emj, this.dataChannel, this, LJJLIIIIJ(), interfaceC1096630edx);
        if (z3) {
            DataChannel dataChannel = this.dataChannel;
            InterfaceC1102120emo interfaceC1102120emoLJJLIIIIJ = LJJLIIIIJ();
            if (c0kaj2 == null) {
                c0kaj2 = C0KAJ.AUTO_TERMINATE;
            }
            C1102070emj.LJIILJJIL(c1102070emj, dataChannel, this, interfaceC1102120emoLJJLIIIIJ, c0kaj2, null, null, 112);
        }
    }
}
