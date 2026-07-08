package com.bytedance.android.livesdk.widget.preload;

import X.C0IJT;
import X.C0JBN;
import X.C0KVU;
import X.C1099610eil;
import X.C1161920gLG;
import X.C1324610kZf;
import X.C1602160rnK;
import X.C16F5;
import X.C1819620xS4;
import X.C1834150xpV;
import X.C20736316Cj;
import X.C20743516Fd;
import X.C472860IgW;
import X.C474500IjA;
import X.C497740JfY;
import X.C521890KdP;
import X.C786410Ut5;
import Y.ACListenerS142S0100000_7;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.live.programmedlive.IProgrammedLiveService;
import com.bytedance.android.livesdk.IBarrageService;
import com.bytedance.android.livesdk.dataChannel.PreloadAnchorInfoShowStatus;
import com.bytedance.android.livesdk.livesetting.LiveMainFrameworkUpdateTopOneLineSizeConfigSetting;
import com.bytedance.android.livesdk.livesetting.performance.LivePreloadRoomImageSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveUserNameShowOptSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public final class LivePreloadUserInfoWidget extends LiveRecyclableWidget {
    public C1099610eil LL;
    public C16F5 LLILLJJLI;
    public C472860IgW LLILLL;
    public C20743516Fd LLILZ;
    public View LLILZIL;
    public Room LLILZLL;
    public C0JBN LLIZ;
    public boolean LLIZLLLIL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.h8z;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        this.LLILZLL = null;
        this.dataChannel.zW(PreloadAnchorInfoShowStatus.class, Boolean.FALSE);
        this.LLIZ = null;
        this.LLIZLLLIL = false;
    }

    @Override // com.bytedance.android.widget.Widget
    public final Object token() {
        return Integer.valueOf(hashCode());
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) throws Throwable {
        this.LL = (C1099610eil) findViewById(R.id.jhk);
        this.LLILLJJLI = (C16F5) findViewById(R.id.user_name);
        this.LLILZIL = findViewById(R.id.p0o);
        C472860IgW c472860IgW = (C472860IgW) findViewById(R.id.mnh);
        C20743516Fd c20743516Fd = null;
        if (c472860IgW != null) {
            c472860IgW.setTextSize(0, (int) C497740JfY.LIZIZ(11.0f));
            c472860IgW.setTextColor(C20736316Cj.LIZIZ(R.attr.ezs, C1834150xpV.LJII(c472860IgW.getContext())));
            c472860IgW.setFontFeatureSettings("tnum");
            c472860IgW.setEnableMeasureOpt(false);
        } else {
            c472860IgW = null;
        }
        this.LLILLL = c472860IgW;
        C20743516Fd c20743516FdLIZLLL = C20736316Cj.LIZLLL(R.attr.dz8, this.context);
        if (c20743516FdLIZLLL != null) {
            c20743516FdLIZLLL.setTint(C20736316Cj.LIZIZ(R.attr.ezs, C1834150xpV.LJII(this.context)));
            c20743516FdLIZLLL.setBounds(0, (int) C497740JfY.LIZIZ(0.0f), (int) C497740JfY.LIZIZ(10.0f), (int) C497740JfY.LIZIZ(10.0f));
            c20743516Fd = c20743516FdLIZLLL;
        }
        this.LLILZ = c20743516Fd;
        C16F5 c16f5 = this.LLILLJJLI;
        if (c16f5 != null) {
            c16f5.setMaxWidth((int) C497740JfY.LIZIZ(90.0f));
            c16f5.LJJJI(R.style.a90);
            LiveMainFrameworkUpdateTopOneLineSizeConfigSetting.INSTANCE.updateUserNameSize(c16f5);
            LiveUserNameShowOptSetting liveUserNameShowOptSetting = LiveUserNameShowOptSetting.INSTANCE;
            if (liveUserNameShowOptSetting.enable()) {
                c16f5.setMinEms(liveUserNameShowOptSetting.value());
            }
            if (!((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad() && !((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).Yd2()) {
                if (((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad()) {
                    c16f5.setMaxWidth((int) C497740JfY.LIZIZ(136.0f));
                    return;
                }
                return;
            }
            c16f5.setMaxWidth((int) C497740JfY.LIZIZ(140.0f));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Object obj;
        Room room;
        long j;
        C0JBN c0jbn;
        C1324610kZf c1324610kZfLJIILJJIL;
        if (objArr != null) {
            obj = objArr[0];
        } else {
            obj = null;
        }
        if ((obj instanceof Room) && (room = (Room) obj) != null) {
            this.LLILZLL = room;
            IProgrammedLiveService iProgrammedLiveService = (IProgrammedLiveService) C1161920gLG.LIZJ(IProgrammedLiveService.class);
            IMicRoomService iMicRoomService = (IMicRoomService) C1161920gLG.LIZJ(IMicRoomService.class);
            if (iProgrammedLiveService != null && iProgrammedLiveService.hU(this.LLILZLL)) {
                return;
            }
            if (iMicRoomService != null && iMicRoomService.n42(this.LLILZLL)) {
                return;
            }
            User owner = room.getOwner();
            if (owner != null) {
                if (TextUtils.isEmpty(C0KVU.LIZ(owner))) {
                    return;
                }
                show();
                C1099610eil c1099610eil = this.LL;
                if (c1099610eil != null) {
                    c1099610eil.setImageResource(R.drawable.ela);
                }
                C16F5 c16f5 = this.LLILLJJLI;
                if (c16f5 != null) {
                    c16f5.setText(C0KVU.LIZ(owner));
                }
                C1099610eil c1099610eil2 = this.LL;
                ImageModel avatarThumb = room.getOwner().getAvatarThumb();
                this.LLIZLLLIL = false;
                C521890KdP c521890KdP = new C521890KdP(this, 9);
                if (avatarThumb != null) {
                    C1324610kZf c1324610kZfLIZJ = C1819620xS4.LIZ().LIZJ(avatarThumb.getUrls());
                    Boolean bool = Boolean.TRUE;
                    c1324610kZfLIZJ.LJIILIIL = bool;
                    c1324610kZfLIZJ.LJIJJ = ImageView.ScaleType.CENTER_CROP;
                    this.LLIZ = c1324610kZfLIZJ;
                    if (!LivePreloadRoomImageSetting.INSTANCE.getConfig().preloadAvatar && (c0jbn = this.LLIZ) != null && (c1324610kZfLJIILJJIL = c0jbn.LJIILJJIL((int) C497740JfY.LIZIZ(32.0f), (int) C497740JfY.LIZIZ(32.0f))) != null) {
                        c1324610kZfLJIILJJIL.LJIIL = c521890KdP;
                        c1324610kZfLJIILJJIL.LJJ = bool;
                    }
                    C0JBN c0jbn2 = this.LLIZ;
                    if (c0jbn2 != null) {
                        c0jbn2.LJJI(c1099610eil2);
                    }
                }
                C472860IgW c472860IgW = this.LLILLL;
                if (c472860IgW != null) {
                    Room room2 = this.LLILZLL;
                    if (room2 != null) {
                        j = room2.likeCount;
                    } else {
                        j = 0;
                    }
                    c472860IgW.setText(((IBarrageService) C1161920gLG.LIZJ(IBarrageService.class)).Ao2(j));
                    c472860IgW.setCompoundDrawablePadding((int) C497740JfY.LIZIZ(2.0f));
                    c472860IgW.setCompoundDrawablesRelative(this.LLILZ, null, null, null);
                    int visibility = c472860IgW.getVisibility();
                    c472860IgW.setVisibility(0);
                    C1602160rnK.LIZIZ(visibility, 0, c472860IgW);
                }
                this.dataChannel.zW(PreloadAnchorInfoShowStatus.class, Boolean.TRUE);
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_preload_widget_show");
                c474500IjALIZ.LJIIIIZZ();
                c474500IjALIZ.LJJII("LivePreloadUserInfoWidget", "widget_name");
                c474500IjALIZ.LIZ();
            }
            View view = getView();
            if (view == null) {
                return;
            }
            C786410Ut5.I7(new ACListenerS142S0100000_7(this, 118), view);
        }
    }
}
