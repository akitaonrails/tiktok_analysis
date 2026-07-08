package com.bytedance.android.livesdk.widget;

import X.C0IEB;
import X.C0IJT;
import X.C0ILW;
import X.C1124870fNV;
import X.C1133830fbx;
import X.C1291830jin;
import X.C1320810kTX;
import X.C1322200kVm;
import X.C1324610kZf;
import X.C1324720kZq;
import X.C1325700kbQ;
import X.C16F5;
import X.C1819620xS4;
import X.C464500IJk;
import X.C474500IjA;
import X.C497740JfY;
import X.C500260Jjc;
import X.C520010KaN;
import X.C784440Upu;
import X.C786410Ut5;
import X.InterfaceC463390IFd;
import Y.AfS176S0100000_7;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.model.MaskLayer;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public class LiveMaskLayerWidget extends LiveWidget implements View.OnClickListener {
    public InterfaceC463390IFd LL;
    public Room LLILLJJLI;
    public MaskLayer LLILLL;
    public C0IEB LLILZ;
    public EnterRoomConfig LLILZIL;
    public C16F5 LLILZLL;
    public C16F5 LLIZ;
    public C1324720kZq LLIZLLLIL;
    public LiveIconView LLJ;
    public boolean LLJI;

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [REQUEST, X.0kbR] */
    public final void x1() {
        LiveIconView liveIconView = this.LLJ;
        if (liveIconView == null || this.LLILZLL == null || this.LLIZ == null || this.LLIZLLLIL == null) {
            return;
        }
        liveIconView.setIconAttr(R.attr.dmz);
        this.LLJ.setIconWidthRatio(0.67f);
        this.LLJ.setIconHeightRatio(0.67f);
        y1(this.LLILZLL, this.LLILLL.title);
        y1(this.LLIZ, this.LLILLL.subTitle);
        float fLJIIZILJ = C497740JfY.LJIIZILJ() / C497740JfY.LJIILLIIL();
        C1291830jin c1291830jin = new C1291830jin(5, fLJIIZILJ);
        User owner = this.LLILLJJLI.getOwner();
        if (owner != null && owner.getAvatarThumb() != null) {
            C1324610kZf c1324610kZfLIZJ = C1819620xS4.LIZ().LIZJ(owner.getAvatarThumb().getUrls());
            c1324610kZfLIZJ.LJJIIZI(fLJIIZILJ);
            c1324610kZfLIZJ.LJJI(this.LLIZLLLIL);
            return;
        }
        C1324720kZq c1324720kZq = this.LLIZLLLIL;
        C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
        C1325700kbQ c1325700kbQLIZJ = C1325700kbQ.LIZJ(R.drawable.eej);
        c1325700kbQLIZJ.LJIILIIL = c1291830jin;
        c1320810kTXLIZJ.LIZLLL = c1325700kbQLIZJ.LIZ();
        c1320810kTXLIZJ.LJIILJJIL = this.LLIZLLLIL.getController();
        c1324720kZq.setController(c1320810kTXLIZJ.LIZ());
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        Activity activityLJIJ = C520010KaN.LJIJ(getContext(), false);
        return (activityLJIJ == null || !C500260Jjc.LJJII(activityLJIJ.getRequestedOrientation())) ? R.layout.i09 : R.layout.i0_;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        super.hide();
        C0IEB c0ieb = this.LLILZ;
        if (c0ieb != null) {
            c0ieb.start();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        this.LLILZLL = (C16F5) findViewById(R.id.o1f);
        this.LLIZ = (C16F5) findViewById(R.id.o1d);
        C786410Ut5.I7(this, findViewById(R.id.o1g));
        C786410Ut5.I7(this, findViewById(R.id.o1c));
        this.LLIZLLLIL = (C1324720kZq) findViewById(R.id.jqa);
        this.LLJ = (LiveIconView) findViewById(R.id.o1e);
        C784440Upu.LIZ().LJ(C464500IJk.class).LJJLJLI(new AfS176S0100000_7(this, 139));
        x1();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        super.show();
        C0IEB c0ieb = this.LLILZ;
        if (c0ieb != null) {
            c0ieb.stop(false);
        }
        if (this.LLJI) {
            return;
        }
        if (this.LLILLL.isR2OrUnknownMask()) {
            DataChannel dataChannelProvideDataChannel = provideDataChannel();
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_mask_layer_show");
            c474500IjALIZ.LJ("show");
            c474500IjALIZ.LJIJJLI(dataChannelProvideDataChannel);
            c474500IjALIZ.LIZ();
        }
        this.LLJI = true;
        C0ILW.LIZIZ("show", this.LLILLL.punishInfo, Long.valueOf(this.LLILZIL.mRoomsData.roomId));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id == R.id.o1g) {
            hide();
            this.LL.hp();
            if (this.LLILLL.isR2OrUnknownMask()) {
                C0ILW.LIZ("click", "watch");
            }
            C0ILW.LIZIZ("watch_live", this.LLILLL.punishInfo, Long.valueOf(this.LLILZIL.mRoomsData.roomId));
            return;
        }
        if (id != R.id.o1c) {
            return;
        }
        this.LL.g3();
        if (this.LLILLL.isR2OrUnknownMask()) {
            C0ILW.LIZ("click", "skip");
        }
        C0ILW.LIZIZ("skip", this.LLILLL.punishInfo, Long.valueOf(this.LLILZIL.mRoomsData.roomId));
    }

    public final void y1(C16F5 c16f5, Text text) {
        String strLIZIZ;
        if (c16f5 != null && text != null) {
            String str = text.defaultPattern;
            if (!TextUtils.isEmpty(text.key)) {
                C1124870fNV c1124870fNVLIZJ = C1124870fNV.LIZJ();
                String str2 = text.key;
                c1124870fNVLIZJ.getClass();
                strLIZIZ = C1124870fNV.LIZIZ(str2);
            } else {
                strLIZIZ = null;
            }
            if (!TextUtils.isEmpty(strLIZIZ)) {
                str = strLIZIZ;
            }
            c16f5.setText(C1133830fbx.LJIILJJIL(str, text, null));
        }
    }

    public LiveMaskLayerWidget(Room room, MaskLayer maskLayer, C0IEB c0ieb, InterfaceC463390IFd interfaceC463390IFd, EnterRoomConfig enterRoomConfig) {
        this.LLILLJJLI = room;
        this.LLILLL = maskLayer;
        this.LLILZ = c0ieb;
        this.LL = interfaceC463390IFd;
        this.LLILZIL = enterRoomConfig;
    }
}
