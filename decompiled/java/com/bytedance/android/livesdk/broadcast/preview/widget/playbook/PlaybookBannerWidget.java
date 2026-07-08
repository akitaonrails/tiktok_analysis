package com.bytedance.android.livesdk.broadcast.preview.widget.playbook;

import X.C0IJT;
import X.C13LE;
import X.C19R6;
import X.C20743416Fc;
import X.C474500IjA;
import X.C770220UJg;
import X.C786410Ut5;
import X.InterfaceC500940Jki;
import Y.ACListenerS147S0100000_12;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.playbook.ActivePlaybookChannel;
import com.bytedance.android.livesdk.dataChannel.PlaybookBannerOthersCanShowChannel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS591S0100000_12;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: loaded from: classes13.dex */
public final class PlaybookBannerWidget extends PreviewWidget {
    public C19R6 LLILZ;
    public C20743416Fc LLILZIL;
    public C20743416Fc LLILZLL;
    public Playbook LLIZ;
    public boolean LLIZLLLIL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.gl2;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final boolean z1() {
        return false;
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onHide() {
        C770220UJg c770220UJg = C770220UJg.LIZ;
        new PlaybookBannerOthersCanShowChannel();
        C770220UJg.LJ(C13LE.LIZ(PlaybookBannerOthersCanShowChannel.class));
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void onShow() {
        User userLJIJJLI;
        if (!this.LLIZLLLIL) {
            this.LLIZLLLIL = true;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_takepage_playbook_banner_show");
            InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
            c474500IjALIZ.LJJII((interfaceC500940JkiUser == null || (userLJIJJLI = interfaceC500940JkiUser.LJIJJLI()) == null) ? null : Long.valueOf(userLJIJJLI.getId()), "anchor_id");
            c474500IjALIZ.LIZ();
        }
        C770220UJg c770220UJg = C770220UJg.LIZ;
        new PlaybookBannerOthersCanShowChannel();
        C770220UJg.LIZLLL(C13LE.LIZ(PlaybookBannerOthersCanShowChannel.class));
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void C1() {
        super.C1();
        View view = getView();
        this.LLILZ = view != null ? (C19R6) view.findViewById(R.id.lrc) : null;
        View view2 = getView();
        this.LLILZIL = view2 != null ? (C20743416Fc) view2.findViewById(R.id.tv_playbook_title) : null;
        View view3 = getView();
        this.LLILZLL = view3 != null ? (C20743416Fc) view3.findViewById(R.id.tv_playbook_desc) : null;
        View view4 = getView();
        if (view4 != null) {
            C786410Ut5.I7(new ACListenerS147S0100000_12(this, 154), view4);
        }
        this.dataChannel.EQ2(this, ActivePlaybookChannel.class, new AwS591S0100000_12(this, 372));
    }
}
