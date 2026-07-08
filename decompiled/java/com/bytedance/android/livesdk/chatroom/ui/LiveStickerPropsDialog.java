package com.bytedance.android.livesdk.chatroom.ui;

import X.C0IJT;
import X.C0U56;
import X.C0U6J;
import X.C0UN6;
import X.C0UN7;
import X.C0UN8;
import X.C0UNG;
import X.C1161920gLG;
import X.C1276840jKc;
import X.C1766560w4U;
import X.C1AJL;
import X.C1C7U;
import X.C1EOY;
import X.C2177381AJk;
import X.C342601Uq;
import X.C342701Ur;
import X.C422470GhR;
import X.C474500IjA;
import X.C500980Jkm;
import X.C766270U4b;
import X.C766720U5u;
import X.C770910ULx;
import X.C772770UTb;
import X.C781710UlV;
import X.C946050aj5;
import X.C946060aj6;
import X.EnumC761940Tui;
import X.RunnableC781530UlD;
import X.ViewOnClickListenerC1836610xtT;
import Y.ARunnableS112S0100000_12;
import android.app.Dialog;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.effect.api.StickerPropsDataQueryStatus;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.chatroom.event.SelectRoomStickerEvent;
import com.bytedance.android.livesdk.dataChannel.LiveDialogStatusChannel;
import com.bytedance.android.livesdk.model.PropsEffectChannel;
import com.bytedance.android.livesdk.model.RoomEffect;
import com.bytedance.android.livesdk.model.RoomSticker;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tux.system.TuxImmersionBar;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS626S0100000_12;
import u4.q0;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveStickerPropsDialog extends LiveDialogFragment implements View.OnLayoutChangeListener {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9Ky0tHELIOSPT08JyhiPCZ9BCw6LBwnISYnLD0DOio8Ogs6KSkjLg==";
    public final boolean LL;
    public LinearLayout LLILLJJLI;
    public RunnableC781530UlD LLILLL;
    public ViewOnClickListenerC1836610xtT LLILZ;
    public C0U6J LLILZIL;
    public boolean LLILZLL;
    public int LLIZ;
    public final AwS626S0100000_12 LLIZLLLIL = new AwS626S0100000_12(this, 14);
    public int LLJ;
    public final LiveStickerPropsDialog$handlerPageShow$1 LLJI;
    public C781710UlV LLJIJIL;

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final boolean enablePadAdapter() {
        return false;
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    public final void MR() {
        ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveEffectDataProvider();
        C766720U5u.LJIIL(this.dataChannel);
        ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveEffectDataProvider();
        C766720U5u.LJIIJJI(this.dataChannel);
    }

    public final C946060aj6<RoomEffect> NR() {
        DataChannel dataChannel;
        if (this.LL && (dataChannel = this.dataChannel) != null) {
            return (C946060aj6) dataChannel.gg0(PropsEffectChannel.class);
        }
        return null;
    }

    public final RunnableC781530UlD OR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.se0) : null;
            this.LLILLL = (RunnableC781530UlD) viewFindViewById;
        }
        return (RunnableC781530UlD) viewFindViewById;
    }

    public final LinearLayout PR() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.trr) : null;
            this.LLILLJJLI = (LinearLayout) viewFindViewById;
        }
        return (LinearLayout) viewFindViewById;
    }

    public final ViewOnClickListenerC1836610xtT RR() {
        View viewFindViewById = this.LLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.w72) : null;
            this.LLILZ = (ViewOnClickListenerC1836610xtT) viewFindViewById;
        }
        return (ViewOnClickListenerC1836610xtT) viewFindViewById;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g_l);
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIJJI = 50;
        c500980Jkm.LJI = 0.0f;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        C946050aj5 c946050aj5LIZIZ;
        super.onDestroyView();
        removeMessages(1);
        PR().removeOnLayoutChangeListener(this);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(LiveDialogStatusChannel.class, new C770910ULx(false, 0, hashCode(), EnumC761940Tui.DIALOG_BIZ_SECONDARY_EFFECT_PANEL));
        }
        C946060aj6<RoomEffect> c946060aj6NR = NR();
        if (c946060aj6NR != null && (c946050aj5LIZIZ = c946060aj6NR.LIZIZ()) != null) {
            c946050aj5LIZIZ.LIZIZ(1);
        }
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        super.onStart();
        TuxImmersionBar tuxImmersionBarLIZJ = C1766560w4U.LIZJ(this, false);
        tuxImmersionBarLIZJ.LIZJ(false, false);
        tuxImmersionBarLIZJ.LIZIZ.LJIIL();
        tuxImmersionBarLIZJ.LJFF(-16777216);
        tuxImmersionBarLIZJ.LIZIZ.LJII(false);
        tuxImmersionBarLIZJ.LIZLLL();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C0U56 getPanelType() {
        return C0U56.PANEL_STICKER;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final boolean requireE2EAdaption() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.livesdk.chatroom.ui.LiveStickerPropsDialog$handlerPageShow$1] */
    public LiveStickerPropsDialog(boolean z) {
        this.LL = z;
        final Looper mainLooper = Looper.getMainLooper();
        this.LLJI = new BPEAHandler(mainLooper) { // from class: com.bytedance.android.livesdk.chatroom.ui.LiveStickerPropsDialog$handlerPageShow$1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                C781710UlV c781710UlV;
                C1C7U.LIZ("LiveStickerPropsDialog@b2ac.handlerPageShow$1");
                super.handleMessage(message);
                if (message.what == 1 && (c781710UlV = this.LL.LLJIJIL) != null) {
                    c781710UlV.LJIIIIZZ = true;
                    c781710UlV.LIZLLL();
                }
                C1C7U.LIZIZ("LiveStickerPropsDialog@b2ac.handlerPageShow$1");
            }
        };
    }

    public final void SR(RoomSticker roomSticker) {
        RoomSticker roomSticker2;
        C946050aj5 c946050aj5LIZIZ;
        if (this.LLILZLL) {
            C766270U4b.LJFF(2131844170, getContext());
            return;
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.LC0(SelectRoomStickerEvent.class, roomSticker);
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            roomSticker2 = (RoomSticker) dataChannel2.gg0(C0UN7.class);
        } else {
            roomSticker2 = null;
        }
        if (roomSticker2 != null) {
            C2177381AJk c2177381AJk = C1AJL.LIZLLL;
            C1AJL.LJIIIZ(this.dataChannel, roomSticker2, Boolean.valueOf(!C342601Uq.LIZIZ(roomSticker2.content, roomSticker2)));
            if (roomSticker2.type == 4 && C0UNG.LIZ(roomSticker2) && !C342701Ur.LIZ(roomSticker)) {
                C1AJL.LJIIIIZZ(this.dataChannel, roomSticker2, Boolean.valueOf(!C342601Uq.LIZIZ(roomSticker2.content, roomSticker2)));
            }
        }
        C2177381AJk c2177381AJk2 = C1AJL.LIZLLL;
        C1AJL.LIZ = SystemClock.elapsedRealtime();
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            dataChannel3.SX0(C0UN7.class, roomSticker);
        }
        DataChannel dataChannel4 = this.dataChannel;
        int i = roomSticker.type;
        if (i != 4) {
            if (i != 5) {
                if (i == 6) {
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_picture_prop_select");
                    c474500IjALIZ.LJIJJLI(dataChannel4);
                    c474500IjALIZ.LJJII("event", "tab");
                    c474500IjALIZ.LJJII("video_live", "live_type");
                    c474500IjALIZ.LJJII(Long.valueOf(roomSticker.id), "prop_id");
                    c474500IjALIZ.LJJII(roomSticker.name, "prop_name");
                    c474500IjALIZ.LJJII(roomSticker.LIZ, "resource_id");
                    c474500IjALIZ.LJJII(((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getBroadcastScene(), "select_scene");
                    c474500IjALIZ.LIZ();
                }
            } else {
                C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_live_picture_prop_select");
                c474500IjALIZ2.LJIJJLI(dataChannel4);
                c474500IjALIZ2.LJJII("image", "tab");
                c474500IjALIZ2.LJJII("video_live", "live_type");
                c474500IjALIZ2.LJJII(Long.valueOf(roomSticker.id), "prop_id");
                c474500IjALIZ2.LJJII(roomSticker.name, "prop_name");
                c474500IjALIZ2.LJJII(roomSticker.LIZ, "resource_id");
                c474500IjALIZ2.LJJII(((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getBroadcastScene(), "select_scene");
                c474500IjALIZ2.LIZ();
            }
        } else {
            C474500IjA c474500IjALIZ3 = C0IJT.LIZ("livesdk_live_character_prop_select");
            c474500IjALIZ3.LJIJJLI(dataChannel4);
            c474500IjALIZ3.LJJII("text", "tab");
            c474500IjALIZ3.LJJII("video_live", "live_type");
            c474500IjALIZ3.LJJII(Long.valueOf(roomSticker.id), "prop_id");
            c474500IjALIZ3.LJJII(roomSticker.name, "prop_name");
            c474500IjALIZ3.LJJII(roomSticker.LIZ, "resource_id");
            c474500IjALIZ3.LJJII(((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getBroadcastScene(), "select_scene");
            c474500IjALIZ3.LIZ();
        }
        C1276840jKc c1276840jKc = C1276840jKc.LIZ;
        String str = roomSticker.LIZ;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        c1276840jKc.getClass();
        C1276840jKc.LJJIZ(str);
        C946060aj6<RoomEffect> c946060aj6NR = NR();
        if (c946060aj6NR == null || (c946050aj5LIZIZ = c946060aj6NR.LIZIZ()) == null) {
            return;
        }
        String str3 = roomSticker.LIZ;
        if (str3 != null) {
            str2 = str3;
        }
        c946050aj5LIZIZ.LIZ(new RoomEffect(str2, roomSticker));
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C946050aj5 c946050aj5LIZIZ;
        super.onViewCreated(view, bundle);
        HandlerHook.viewPost(PR(), new ARunnableS112S0100000_12(this, 124));
        PR().addOnLayoutChangeListener(this);
        q0.LJIJI(PR().findViewById(R.id.title), true);
        if (((ArrayList) C342601Uq.LJFF()).isEmpty()) {
            MR();
        }
        DataChannel dataChannel = this.dataChannel;
        Window window = null;
        if (dataChannel == null || dataChannel.gg0(StickerPropsDataQueryStatus.class) == null) {
            MR();
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null) {
            dataChannel2.EQ2(this, StickerPropsDataQueryStatus.class, new C0UN6(this));
        }
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            dataChannel3.EQ2(this, LinkCrossRoomStateChangeEvent.class, new C0UN8(this));
        }
        this.LLILZIL = new C0U6J(this.LLIZLLLIL, false);
        RunnableC781530UlD runnableC781530UlDOR = OR();
        runnableC781530UlDOR.setLayoutManager(new GridLayoutManager(runnableC781530UlDOR.getContext(), 3));
        C0U6J c0u6j = this.LLILZIL;
        if (c0u6j == null) {
            c0u6j = null;
        }
        runnableC781530UlDOR.setAdapter(c0u6j);
        runnableC781530UlDOR.addItemDecoration(new C422470GhR());
        this.LLJIJIL = new C781710UlV(1, 0.0d, OR(), new AwS626S0100000_12(this, 16));
        C1EOY c1eoy = C1EOY.LIZ;
        RunnableC781530UlD runnableC781530UlDOR2 = OR();
        Dialog dialog = getDialog();
        if (dialog != null) {
            window = dialog.getWindow();
        }
        runnableC781530UlDOR2.addOnScrollListener(new C772770UTb(c1eoy.LIZIZ("panel_sticker_slide"), window));
        LiveStickerPropsDialog$handlerPageShow$1 liveStickerPropsDialog$handlerPageShow$1 = this.LLJI;
        liveStickerPropsDialog$handlerPageShow$1.sendMessageDelayed(liveStickerPropsDialog$handlerPageShow$1.obtainMessage(1), 1000L);
        C946060aj6<RoomEffect> c946060aj6NR = NR();
        if (c946060aj6NR != null && (c946050aj5LIZIZ = c946060aj6NR.LIZIZ()) != null) {
            c946050aj5LIZIZ.LJFF(0);
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.LLJ != PR().getHeight()) {
            int height = PR().getHeight();
            this.LLJ = height;
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.zW(LiveDialogStatusChannel.class, new C770910ULx(true, height, hashCode(), EnumC761940Tui.DIALOG_BIZ_SECONDARY_EFFECT_PANEL));
            }
        }
    }
}
