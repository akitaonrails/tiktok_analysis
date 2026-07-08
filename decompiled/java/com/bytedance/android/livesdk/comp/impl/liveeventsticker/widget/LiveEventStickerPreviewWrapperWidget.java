package com.bytedance.android.livesdk.comp.impl.liveeventsticker.widget;

import X.AbstractC19664311wf;
import X.C0PEM;
import X.C1085140eLQ;
import X.C1085160eLS;
import X.C1117480fBa;
import X.C1548820qPI;
import X.C19662511wN;
import X.C19662711wP;
import X.C19663611wY;
import X.C19664111wd;
import X.C19664211we;
import X.C19665211wo;
import X.C19665411wq;
import X.C19665511wr;
import X.C23250099c;
import X.C262100zr;
import X.C786410Ut5;
import X.EnumC19663011wS;
import X.InterfaceC1141530foN;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.livesdk.chatroom.viewmodule.PreviewDecorationWrapperWidget;
import com.bytedance.android.livesdk.dataChannel.LiveEventStickerDraggingChannel;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEventStickerApiOptSetting;
import com.bytedance.android.livesdk.model.Sticker;
import com.bytedance.android.livesdk.model.message.RoomEventMessage;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes30.dex */
public final class LiveEventStickerPreviewWrapperWidget extends PreviewDecorationWrapperWidget implements InterfaceC1141530foN {
    public C19665511wr LLILZLL;

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.PreviewDecorationWrapperWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.11wr] */
    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.PreviewDecorationWrapperWidget, com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void E1() {
        super.E1();
        this.LLILZLL = new AbstractC19664311wf(this) { // from class: X.11wr
            @Override // X.AbstractC19664311wf
            public final int LIZ() {
                return 6;
            }

            @Override // X.AbstractC19664311wf
            public final int LIZJ() {
                return 2;
            }

            @Override // X.AbstractC19664311wf
            public final int LIZLLL() {
                return 4;
            }
        };
        C1548820qPI.LIZLLL("live_event_display_sticker", this);
        if (!LiveEventStickerApiOptSetting.INSTANCE.enable()) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C1117480fBa(this, null), 2);
            return;
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.EQ2(this, RoomCreateInfoChannel.class, new C19665411wq(this));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        this.LLILZLL = null;
        C1548820qPI.LJIIIIZZ("live_event_display_sticker", this);
    }

    public final void G1(RoomEventMessage roomEventMessage) {
        if (roomEventMessage == null) {
            hide();
            return;
        }
        C19663611wY c19663611wY = new C19663611wY(roomEventMessage.eventId, roomEventMessage.title, roomEventMessage.startTime * ((long) LSPassThroughRecordSizeConfig.DEFAULT), roomEventMessage.subscribedCount, roomEventMessage.eventUserInfo, roomEventMessage.posX, roomEventMessage.posY);
        if (c19663611wY.LJFF - System.currentTimeMillis() > 7200000) {
            c19663611wY.LJIIL = roomEventMessage.configOpt;
            H1(c19663611wY);
        } else {
            hide();
        }
    }

    public final void H1(final C19663611wY c19663611wY) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        View view = getView();
        if ((view instanceof ViewGroup) && (viewGroup2 = (ViewGroup) view) != null) {
            C786410Ut5.LJJJJI(viewGroup2);
            ((ArrayList) this.LLILZIL).clear();
        }
        C19662711wP c19662711wP = new C19662711wP(this.context, c19663611wY, EnumC19663011wS.PREVIEW, this.LLILZ, this, null, null);
        c19662711wP.setShowMaskOnDragging(true);
        View view2 = getView();
        if ((view2 instanceof ViewGroup) && (viewGroup = (ViewGroup) view2) != null) {
            viewGroup.addView(c19662711wP, -1, -1);
            ((ArrayList) this.LLILZIL).add(c19662711wP);
        }
        this.dataChannel.SX0(C1085140eLQ.class, Long.valueOf(c19663611wY.LIZLLL));
        HandlerHook.viewPost(c19662711wP, new Runnable() { // from class: X.11wb
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("LiveEventStickerPreviewWrapperWidget@c9d8.onAddStickerSuccess$1");
                try {
                    C19662511wN.LJ(c19663611wY, "live_take_page");
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("LiveEventStickerPreviewWrapperWidget@c9d8.onAddStickerSuccess$1");
            }
        });
        show();
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.PreviewDecorationWrapperWidget, X.InterfaceC2177361AJi
    public final void LJIJI(boolean z) {
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(LiveEventStickerDraggingChannel.class, Boolean.valueOf(z));
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.PreviewDecorationWrapperWidget, X.InterfaceC2177361AJi
    public final void LLLLLJLJLL(Sticker sticker) {
        C19663611wY c19663611wY;
        C19665511wr c19665511wr;
        ViewGroup viewGroup;
        View view = getView();
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
            C786410Ut5.LJJJJI(viewGroup);
            ((ArrayList) this.LLILZIL).clear();
        }
        hide();
        this.dataChannel.SX0(C1085140eLQ.class, null);
        if ((sticker instanceof C19663611wY) && (c19663611wY = (C19663611wY) sticker) != null && (c19665511wr = this.LLILZLL) != null) {
            c19665511wr.LJII(c19663611wY, new C1085160eLS(this), new C19665211wo(this));
        }
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        if (this.LLILZLL != null) {
            AbstractC19664311wf.LJ(c262100zr, new C19664211we(this), new C19664111wd(this));
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.PreviewDecorationWrapperWidget, X.InterfaceC2177361AJi
    public final void o0(Sticker sticker) {
        if (!(sticker instanceof C19663611wY)) {
            return;
        }
        C19665511wr c19665511wr = this.LLILZLL;
        if (c19665511wr != null) {
            c19665511wr.LJFF((C19663611wY) sticker);
        }
        C19662511wN.LIZLLL((C19663611wY) sticker, "live_take_page");
    }
}
