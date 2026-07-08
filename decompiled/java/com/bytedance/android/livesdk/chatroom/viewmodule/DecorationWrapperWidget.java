package com.bytedance.android.livesdk.chatroom.viewmodule;

import X.C0IJT;
import X.C1152540g68;
import X.C12ES;
import X.C1AJL;
import X.C1AJN;
import X.C1AJR;
import X.C1AJT;
import X.C2177281AJa;
import X.C2177301AJc;
import X.C2177321AJe;
import X.C2177381AJk;
import X.C465900IOu;
import X.C474500IjA;
import X.C497740JfY;
import X.C500260Jjc;
import X.C766270U4b;
import X.C784440Upu;
import X.C786410Ut5;
import X.InterfaceC1874790yt3;
import X.InterfaceC2177361AJi;
import Y.ARunnableS133S0100000_33;
import Y.AfS202S0100000_33;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.livesdk.comp.impl.liveeventsticker.widget.LiveEventStickerWrapperWidget;
import com.bytedance.android.livesdk.dataChannel.PaidEventStatusChannel;
import com.bytedance.android.livesdk.dataChannel.PauseLiveChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.SubOnlyLiveAudienceStatusChannel;
import com.bytedance.android.livesdk.dataChannel.UpdateStickerPositionEvent;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.model.RoomDecoration;
import com.bytedance.android.livesdk.model.RoomSticker;
import com.bytedance.android.livesdk.model.Sticker;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public abstract class DecorationWrapperWidget extends LiveWidget implements InterfaceC1874790yt3, InterfaceC2177361AJi {
    public boolean LLILZ;
    public boolean LLILZIL;
    public Room LLILZLL;
    public boolean LLIZ;
    public boolean LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public int[] LL = new int[4];
    public int[] LLILLJJLI = new int[4];
    public final List<C1AJN<?>> LLILLL = new ArrayList();
    public final int LLIZLLLIL = ((int) C497740JfY.LIZIZ(130.0f)) + ((int) C497740JfY.LIZIZ(148.0f));

    @Override // X.InterfaceC2177361AJi
    public void LJZL(RoomDecoration roomDecoration) {
    }

    @Override // X.InterfaceC2177361AJi
    public void Q(String str, RoomSticker roomSticker) {
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hy6;
    }

    @Override // X.InterfaceC2177361AJi
    public void o0(Sticker sticker) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public abstract void y1(Sticker sticker);

    public abstract void z1();

    @Override // X.InterfaceC2177361AJi
    public final void i1() {
        C1AJN<?> next;
        Iterator<C1AJN<?>> it2 = this.LLILLL.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            } else {
                next = it2.next();
                if (next.getType() == 3) {
                    break;
                }
            }
        }
        C1AJN<?> c1ajn = next;
        if (c1ajn != null) {
            c1ajn.z0(false);
        }
    }

    @Override // X.InterfaceC2177361AJi
    public final void j1() {
        RoomSticker roomSticker;
        C2177381AJk c2177381AJk = C1AJL.LIZLLL;
        DataChannel dataChannel = this.dataChannel;
        C2177381AJk c2177381AJk2 = C1AJL.LIZLLL;
        if (c2177381AJk2 != null && (roomSticker = c2177381AJk2.LIZ) != null) {
            int i = !Intrinsics.LJFF(c2177381AJk2.LIZIZ, Boolean.TRUE) ? 1 : 0;
            long jElapsedRealtime = C1AJL.LIZJ > 0 ? SystemClock.elapsedRealtime() - C1AJL.LIZJ : 0L;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_host_character_prop_use_time");
            c474500IjALIZ.LJIJJLI(dataChannel);
            c474500IjALIZ.LJIILJJIL("live_take_detail");
            c474500IjALIZ.LJJII(Integer.valueOf(roomSticker.LIZLLL ? 1 : 0), "is_remember");
            c474500IjALIZ.LJJIIZ("character", "prop_type", new AwS577S0100000_33(roomSticker, 4166));
            c474500IjALIZ.LJJIIZ("picture", "prop_type", new AwS577S0100000_33(roomSticker, 4167));
            c474500IjALIZ.LJJII(C1AJL.LIZIZ(Integer.valueOf(roomSticker.type)), "tab");
            c474500IjALIZ.LJJII(Long.valueOf(roomSticker.id), "prop_id");
            c474500IjALIZ.LJJII(roomSticker.name, "prop_name");
            c474500IjALIZ.LJJII("video_live", "live_type");
            c474500IjALIZ.LJJII(Long.valueOf(jElapsedRealtime), "use_time");
            c474500IjALIZ.LJJII(roomSticker.LIZ, "resource_id");
            c474500IjALIZ.LJJII(Integer.valueOf(i), "is_origin_words");
            c474500IjALIZ.LIZ();
        }
        C1AJL.LIZJ = 0L;
        C1AJL.LIZLLL = null;
    }

    public final void A1() {
        View view = getView();
        if (view != null) {
            HandlerHook.viewPost(view, new ARunnableS133S0100000_33(this, 24));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onCreate() {
        Context context;
        super.onCreate();
        if (isViewValid() && (context = this.context) != null) {
            int[] iArr = this.LL;
            iArr[0] = 0;
            iArr[1] = (((C12ES.LJIIIIZZ(context) - C497740JfY.LJIIIZ(R.dimen.azs)) - C1152540g68.LJIIIIZZ(C500260Jjc.LJIIZILJ(this.dataChannel))) - ((int) C497740JfY.LIZIZ(10.0f))) - C497740JfY.LJIIIZ(R.dimen.ajh);
            int[] iArr2 = this.LL;
            iArr2[2] = 0;
            iArr2[3] = C12ES.LJIIJ(this.context);
            int[] iArr3 = this.LL;
            this.LLILLJJLI = Arrays.copyOf(iArr3, iArr3.length);
        }
        this.LLIZ = false;
        this.LLILZ = Intrinsics.LJFF(this.dataChannel.gg0(UserIsAnchorChannel.class), Boolean.TRUE);
        this.LLILZLL = (Room) this.dataChannel.gg0(RoomChannel.class);
        DataChannel dataChannel = this.dataChannel;
        dataChannel.CQ2(LinkCrossRoomStateChangeEvent.class, this, new C1AJT(this));
        dataChannel.EQ2(this, UpdateStickerPositionEvent.class, new C1AJR(this));
        dataChannel.EQ2(this, SubOnlyLiveAudienceStatusChannel.class, new C2177301AJc(this));
        if (this.LLILZ) {
            DataChannel dataChannel2 = this.dataChannel;
            if (dataChannel2 != null) {
                dataChannel2.BQ2(this, PauseLiveChannel.class, new C2177281AJa(this));
                return;
            }
            return;
        }
        C784440Upu.LIZ().LIZJ(this, C465900IOu.class).LIZJ(new AfS202S0100000_33(this, 10));
        if (!(this instanceof LiveEventStickerWrapperWidget)) {
            this.dataChannel.EQ2(this, PaidEventStatusChannel.class, new C2177321AJe(this));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onDestroy() {
        super.onDestroy();
        this.LLIZ = false;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onPause() {
        super.onPause();
        boolean zLJFF = Intrinsics.LJFF(Build.BRAND, "HUAWEI");
        if (this.LLILZ || !zLJFF) {
            return;
        }
        if (this.LLILZIL) {
            this.LLILZIL = false;
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            C786410Ut5.LJJJJI(viewGroup);
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onResume() {
        super.onResume();
        boolean zLJFF = Intrinsics.LJFF(Build.BRAND, "HUAWEI");
        if (this.LLILZ || !zLJFF || this.LLILZIL) {
            return;
        }
        z1();
    }

    @Override // X.InterfaceC1874790yt3
    public final List<C1AJN<?>> qo2() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC2177361AJi
    public void LLLLLJLJLL(Sticker sticker) {
        if (!isViewValid()) {
            return;
        }
        y1(sticker);
    }

    @Override // X.InterfaceC1874790yt3
    public final void bu(String str) {
        if (isViewValid() && str != null) {
            C766270U4b.LJIIIZ(this.context, str);
        }
    }

    public final void onEventPause(C465900IOu c465900IOu) {
        int i = c465900IOu.LIZ;
        if (i != 36) {
            if (i == 37) {
                this.LLJ = false;
                A1();
                return;
            }
            return;
        }
        this.LLJ = true;
        A1();
    }

    public final void x1(C1AJN c1ajn) {
        View view = getView();
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).addView(c1ajn, new ViewGroup.LayoutParams(-1, -1));
        }
    }
}
