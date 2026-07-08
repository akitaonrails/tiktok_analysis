package com.bytedance.android.livesdk.broadcast.preview.widget;

import X.C01GW;
import X.C0IJT;
import X.C13BV;
import X.C15438062q;
import X.C23250099c;
import X.C312201Iy;
import X.C418701k1;
import X.C418801k2;
import X.C419301k7;
import X.C445980HeG;
import X.C452501pT;
import X.C474500IjA;
import X.C500260Jjc;
import X.C5182020e;
import X.C5183020f;
import X.C781270Ukn;
import X.InterfaceC769410UGd;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.broadcast.api.LiveInviteGuestSelectedChannel;
import com.bytedance.android.live.broadcast.api.PanelLayoutTypeChangeEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.PreviewMgGuideInviteUidListChannel;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.LiveInviteGuestViewModel;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestGuideEnableInviteModuleSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class MultiPreviewInviteGuestWidget extends MultiGuestPreviewSubWidget {
    public C445980HeG LLILZIL;
    public TuxTextView LLILZLL;
    public boolean LLIZ;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new C5182020e(this, 76));

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void D1() {
        this.LLILLL = false;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        DataChannelGlobal.LLILZ.zQ2(this);
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.i0j;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onHide() {
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.MultiGuestPreviewSubWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final boolean z1() {
        return false;
    }

    @Override // com.bytedance.android.livesdk.broadcast.preview.widget.MultiGuestPreviewSubWidget
    public final boolean G1() {
        if (MultiGuestGuideEnableInviteModuleSetting.INSTANCE.isEnable()) {
            return this.LLIZ;
        }
        InterfaceC769410UGd interfaceC769410UGdM70 = C781270Ukn.LJIILJJIL().M70();
        return (interfaceC769410UGdM70 == null || interfaceC769410UGdM70.u7().LIZIZ() == 1) ? false : true;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_auto_invite_setting_entrance");
        c474500IjALIZ.LJJII("show", "action_type");
        c474500IjALIZ.LJJIIZI(C419301k7.LIZ());
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        super.E1();
        View view = getView();
        this.LLILZIL = view != null ? (C445980HeG) view.findViewById(R.id.bje) : null;
        View view2 = getView();
        this.LLILZLL = view2 != null ? (TuxTextView) view2.findViewById(R.id.f842zrj) : null;
        View view3 = getView();
        if (view3 != null) {
            C500260Jjc.LJLIIIL(500L, view3, new C5183020f(this, 88));
        }
        InterfaceC769410UGd interfaceC769410UGdM70 = C781270Ukn.LJIILJJIL().M70();
        boolean z = true;
        if (!MultiGuestGuideEnableInviteModuleSetting.INSTANCE.isEnable() && (interfaceC769410UGdM70 == null || interfaceC769410UGdM70.getPanelLayoutType() == 1)) {
            z = false;
        }
        List list = (List) DataChannelGlobal.LLILZ.gg0(PreviewMgGuideInviteUidListChannel.class);
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(((C418801k2) it2.next()).LIZ));
        }
        LiveInviteGuestViewModel liveInviteGuestViewModel = (LiveInviteGuestViewModel) this.LLIZLLLIL.getValue();
        String str = z ? "go_live_page_suggest_preload" : "go_live_page_suggest_refresh";
        liveInviteGuestViewModel.getClass();
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(liveInviteGuestViewModel), null, null, new C312201Iy(liveInviteGuestViewModel, str, arrayList, null), 3);
        DataChannelGlobal.LLILZ.DQ2(LiveInviteGuestSelectedChannel.class, this, new C5183020f(this, 257));
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.CQ2(PanelLayoutTypeChangeEvent.class, this.widgetCallback.getFragment(), new C5183020f(this, 258));
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C418701k1(this, null), 3);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void C1() {
        super.C1();
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        super.hide();
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        super.show();
    }

    public final void H1(boolean z) {
        if (z) {
            super.show();
        } else {
            super.hide();
        }
        Function1<? super Boolean, Unit> function1 = this.LLILZ;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z));
        }
    }
}
