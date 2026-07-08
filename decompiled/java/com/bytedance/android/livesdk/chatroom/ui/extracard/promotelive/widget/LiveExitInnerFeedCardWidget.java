package com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget;

import X.C011Z;
import X.C0IJT;
import X.C1161920gLG;
import X.C474500IjA;
import X.C786410Ut5;
import X.InterfaceC465210IMd;
import Y.ACListenerS142S0100000_7;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdkapi.host.IHostWatch;
import com.zhiliaoapp.musically.R;
import webcast.api.room.EncourageGoLiveCard;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveExitInnerFeedCardWidget extends ILiveExitParentCardWidget {
    public ViewGroup LLIZ;
    public ViewGroup LLIZLLLIL;
    public InterfaceC465210IMd LLJ;
    public FrameLayout LLJI;
    public long LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.gft;
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.ILiveExitParentCardWidget, com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.ILiveNewStyleCardWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.ILiveNewStyleCardWidget, X.InterfaceC464250IIl
    public final void t0() {
        InterfaceC465210IMd interfaceC465210IMd;
        String str = this.LLILZLL.bgMusicUrl;
        if (str.length() != 0) {
            if (this.LLJ == null) {
                this.LLJ = ((IHostWatch) C1161920gLG.LIZJ(IHostWatch.class)).getAudioPlayerController();
            }
            FrameLayout frameLayout = this.LLJI;
            if (frameLayout != null && (interfaceC465210IMd = this.LLJ) != null) {
                interfaceC465210IMd.LIZ(frameLayout);
            }
            InterfaceC465210IMd interfaceC465210IMd2 = this.LLJ;
            if (interfaceC465210IMd2 != null) {
                interfaceC465210IMd2.Lf(str);
            }
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_exit_card_show");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII("exit_live_feed_intention", "question");
        c474500IjALIZ.LIZ();
        this.LLJILJILJ = true;
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.ILiveNewStyleCardWidget
    public final void x1() {
        if (!this.LLJILJIL) {
            z1(System.currentTimeMillis() - this.LLJIJIL, null, "swip_back");
        }
        this.LLJILJIL = true;
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.ILiveNewStyleCardWidget
    public final void y1() {
        if (!this.LLJILJIL) {
            z1(System.currentTimeMillis() - this.LLJIJIL, null, "swip");
        }
        this.LLJILJIL = true;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        this.LLJILJILJ = false;
        this.LLJILJIL = false;
        InterfaceC465210IMd interfaceC465210IMd = this.LLJ;
        if (interfaceC465210IMd != null) {
            interfaceC465210IMd.stop();
        }
        InterfaceC465210IMd interfaceC465210IMd2 = this.LLJ;
        if (interfaceC465210IMd2 != null) {
            interfaceC465210IMd2.release();
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onPause() {
        super.onPause();
        if (!this.LLJILJIL && this.LLJILJILJ) {
            z1(System.currentTimeMillis() - this.LLJIJIL, null, "cancel");
        }
        InterfaceC465210IMd interfaceC465210IMd = this.LLJ;
        if (interfaceC465210IMd != null) {
            interfaceC465210IMd.stop();
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onResume() {
        super.onResume();
        InterfaceC465210IMd interfaceC465210IMd = this.LLJ;
        if (interfaceC465210IMd != null) {
            interfaceC465210IMd.resume();
        }
    }

    public LiveExitInnerFeedCardWidget(EncourageGoLiveCard encourageGoLiveCard) {
        super(encourageGoLiveCard);
        this.LLJIJIL = -1L;
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getThemeOverlay(Context context) {
        return C011Z.LIZ.LJ();
    }

    @Override // com.bytedance.android.widget.Widget
    public final void setContentView(View view) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        super.setContentView(view);
        this.LLJIJIL = System.currentTimeMillis();
        FrameLayout frameLayout = null;
        if (view != null) {
            viewGroup = (ViewGroup) view.findViewById(R.id.cwx);
        } else {
            viewGroup = null;
        }
        this.LLIZ = viewGroup;
        if (view != null) {
            viewGroup2 = (ViewGroup) view.findViewById(R.id.cww);
        } else {
            viewGroup2 = null;
        }
        this.LLIZLLLIL = viewGroup2;
        if (view != null) {
            frameLayout = (FrameLayout) view.findViewById(R.id.ci6);
        }
        this.LLJI = frameLayout;
        ViewGroup viewGroup3 = this.LLIZ;
        if (viewGroup3 != null) {
            C786410Ut5.K7(viewGroup3, new ACListenerS142S0100000_7(this, 34));
        }
        ViewGroup viewGroup4 = this.LLIZLLLIL;
        if (viewGroup4 != null) {
            C786410Ut5.K7(viewGroup4, new ACListenerS142S0100000_7(this, 35));
        }
    }

    public static void z1(long j, String str, String str2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_exit_card_click");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(str, "option");
        c474500IjALIZ.LJJII(str2, "exit_method");
        c474500IjALIZ.LJJII("exit_live_feed_intention", "question");
        c474500IjALIZ.LJJII(Long.valueOf(j), "stay_time");
        c474500IjALIZ.LIZ();
    }
}
