package com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget;

import X.C011Z;
import X.C018Q;
import X.C098200Yq;
import X.C0IJT;
import X.C1161920gLG;
import X.C1324610kZf;
import X.C1324720kZq;
import X.C1548820qPI;
import X.C1819620xS4;
import X.C189200o6;
import X.C1942307jB;
import X.C20441214yg;
import X.C2188811AlT;
import X.C262100zr;
import X.C474500IjA;
import X.C497740JfY;
import X.C500260Jjc;
import X.C521890KdP;
import X.C766270U4b;
import X.C786410Ut5;
import X.InterfaceC1141530foN;
import X.InterfaceC2262081DgM;
import X.InterfaceC465210IMd;
import X.InterfaceC470090Ic3;
import Y.ACListenerS142S0100000_7;
import Y.ARunnableS107S0100000_7;
import android.content.Context;
import android.os.Looper;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.SwipeNextEvent;
import com.bytedance.android.livesdk.chatroom.ui.extracard.LiveExtraCardFrequencyManager;
import com.bytedance.android.livesdk.chatroom.ui.extracard.LiveInnerWatchHistoryExtraCountSetting;
import com.bytedance.android.livesdk.dataChannel.GoLiveCardShowing;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveEventPageLynxUrl;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveHostBackToInnerSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostStrategy;
import com.bytedance.android.livesdkapi.host.IHostWatch;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import webcast.api.room.EncourageGoLiveCard;

/* JADX INFO: loaded from: classes8.dex */
public abstract class LivePromoteParentWidget extends ILiveNewStyleCardWidget implements InterfaceC1141530foN {
    public final EncourageGoLiveCard LLILZLL;
    public ViewGroup LLIZ;
    public View LLIZLLLIL;
    public View LLJ;
    public View LLJI;
    public View LLJIJIL;
    public FrameLayout LLJILJIL;
    public InterfaceC465210IMd LLJILJILJ;
    public InterfaceC470090Ic3 LLJILLL;
    public TextureView LLJJ;
    public long LLJJI = System.currentTimeMillis();
    public long LLJJIII;
    public long LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;

    public abstract int E1();

    public int F1() {
        return 0;
    }

    public void M1(boolean z) {
    }

    public abstract void O1(View view);

    public boolean P1() {
        return this instanceof LivePromote3PhotoWidget;
    }

    public boolean Q1() {
        return false;
    }

    public boolean R1() {
        return this instanceof LivePromoteTextWidget;
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        return R.layout.hjt;
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.ILiveNewStyleCardWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public void z1() {
    }

    public final void A1() {
        Room room = (Room) this.dataChannel.gg0(RoomChannel.class);
        if (room != null) {
            this.dataChannel.zW(SwipeNextEvent.class, Long.valueOf(room.getId()));
        }
        this.LLJJIJIL = true;
        if (this.LLILZLL.isLynxCard) {
            this.LLJJI = -1L;
            return;
        }
        I1("not_interested");
        LiveExtraCardFrequencyManager.LIZ.getClass();
        LiveExtraCardFrequencyManager.LJIIIIZZ(2);
    }

    public final void B1() {
        String str = this.LLILZLL.notifyLaterToast;
        C766270U4b.LJIIJJI(str);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_toast_msg_show");
        c474500IjALIZ.LJJIIZI(D1());
        c474500IjALIZ.LJJII(str, "msg_id");
        c474500IjALIZ.LIZ();
        Room room = (Room) this.dataChannel.gg0(RoomChannel.class);
        if (room != null) {
            this.dataChannel.zW(SwipeNextEvent.class, Long.valueOf(room.getId()));
        }
        this.LLJJIJIL = true;
        if (this.LLILZLL.isLynxCard) {
            return;
        }
        I1("get_notified_later");
        LiveExtraCardFrequencyManager.LIZ.getClass();
        LiveExtraCardFrequencyManager.LJIIIIZZ(4);
    }

    public final void C1() {
        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(this.context, UriProtector.parse(LiveEventPageLynxUrl.INSTANCE.getLiveEventGuideSchema()).buildUpon().appendQueryParameter("enter_from", "inner_shaped_card").build().toString());
        I1("get_notified_later");
        this.LLJJIJIL = true;
    }

    public final Map<String, String> D1() {
        InterfaceC2262081DgM interfaceC2262081DgMAuthor;
        HashMap map = new HashMap();
        Room room = (Room) this.dataChannel.gg0(RoomChannel.class);
        map.put("anchor_id", String.valueOf((room == null || (interfaceC2262081DgMAuthor = room.author()) == null) ? null : Long.valueOf(interfaceC2262081DgMAuthor.getId())));
        String str = this.LLILLJJLI;
        if (str == null) {
            str = "";
        }
        map.put("enter_from", str);
        map.put("card_id", this.LLILZLL.cardId);
        map.put("card_type", String.valueOf(this.LLILZLL.cardType));
        map.put("content_type", String.valueOf(this.LLILZLL.style));
        String str2 = this.LLILZ;
        map.put("request_id", str2 != null ? str2 : "");
        return map;
    }

    public final boolean G1() {
        int i = this.LLILZLL.style;
        return i >= 101 && i <= 199;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void onDestroy() {
        C20441214yg.LIZIZ("LivePromoteParentWidget ", "onDestroy");
        super.onDestroy();
        ((IHostStrategy) C1161920gLG.LIZJ(IHostStrategy.class)).Gg0();
        InterfaceC465210IMd interfaceC465210IMd = this.LLJILJILJ;
        if (interfaceC465210IMd != null) {
            interfaceC465210IMd.stop();
        }
        InterfaceC465210IMd interfaceC465210IMd2 = this.LLJILJILJ;
        if (interfaceC465210IMd2 != null) {
            interfaceC465210IMd2.release();
        }
        InterfaceC470090Ic3 interfaceC470090Ic3 = this.LLJILLL;
        if (interfaceC470090Ic3 != null) {
            interfaceC470090Ic3.release();
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public void onPause() {
        C20441214yg.LIZIZ("LivePromoteParentWidget ", "onPause");
        super.onPause();
        L1();
        C1548820qPI.LJIIIIZZ("live_event_detail_base_close", this);
    }

    @Override // com.bytedance.android.widget.Widget
    public void onResume() {
        C20441214yg.LIZIZ("LivePromoteParentWidget ", "onResume");
        super.onResume();
        N1();
        C1548820qPI.LIZLLL("live_event_detail_base_close", this);
        if (this.LLJJJIL) {
            LiveHostBackToInnerSetting liveHostBackToInnerSetting = LiveHostBackToInnerSetting.INSTANCE;
            if (liveHostBackToInnerSetting.enableAutoDraw()) {
                z1();
                C786410Ut5.LJLIIL(liveHostBackToInnerSetting.autoDrawDelay(), new BPEAHandler(Looper.getMainLooper()), new ARunnableS107S0100000_7(this, 40));
            }
            this.LLJJI = System.currentTimeMillis();
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_back_to_special_card_show");
            c474500IjALIZ.LJJIIZI(D1());
            c474500IjALIZ.LIZ();
        }
        this.LLJJJIL = false;
    }

    @Override // com.bytedance.android.widget.Widget
    public final void onStop() {
        C20441214yg.LIZIZ("LivePromoteParentWidget ", "onStop");
        this.LLJJJIL = true;
        super.onStop();
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.ILiveNewStyleCardWidget
    public final void y1() {
        I1("draw");
        if (!this.LLJJIJIIJIL || this.LLJJIJIL) {
            return;
        }
        LiveExtraCardFrequencyManager.LIZ.getClass();
        LiveExtraCardFrequencyManager.LJIIIIZZ(5);
    }

    public void L1() {
        InterfaceC470090Ic3 interfaceC470090Ic3;
        InterfaceC465210IMd interfaceC465210IMd;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mutePlayer audio=");
        InterfaceC465210IMd interfaceC465210IMd2 = this.LLJILJILJ;
        sbLIZ.append(interfaceC465210IMd2 != null ? Boolean.valueOf(interfaceC465210IMd2.isPlaying()) : null);
        sbLIZ.append(", video=");
        InterfaceC470090Ic3 interfaceC470090Ic32 = this.LLJILLL;
        sbLIZ.append(interfaceC470090Ic32 != null ? Boolean.valueOf(interfaceC470090Ic32.isPlaying()) : null);
        C20441214yg.LIZIZ("LivePromoteParentWidget ", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC465210IMd interfaceC465210IMd3 = this.LLJILJILJ;
        if (interfaceC465210IMd3 != null && interfaceC465210IMd3.isPlaying() && (interfaceC465210IMd = this.LLJILJILJ) != null) {
            interfaceC465210IMd.stop();
        }
        InterfaceC470090Ic3 interfaceC470090Ic33 = this.LLJILLL;
        if (interfaceC470090Ic33 == null || !interfaceC470090Ic33.isPlaying() || (interfaceC470090Ic3 = this.LLJILLL) == null) {
            return;
        }
        interfaceC470090Ic3.pause();
    }

    public void N1() {
        InterfaceC470090Ic3 interfaceC470090Ic3;
        InterfaceC465210IMd interfaceC465210IMd;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("resumePlayer isFirstShown=");
        sbLIZ.append(this.LLJJIJIIJIL);
        sbLIZ.append("  audio=");
        InterfaceC465210IMd interfaceC465210IMd2 = this.LLJILJILJ;
        sbLIZ.append(interfaceC465210IMd2 != null ? Boolean.valueOf(interfaceC465210IMd2.isPlaying()) : null);
        sbLIZ.append(", video=");
        InterfaceC470090Ic3 interfaceC470090Ic32 = this.LLJILLL;
        sbLIZ.append(interfaceC470090Ic32 != null ? Boolean.valueOf(interfaceC470090Ic32.isPlaying()) : null);
        C20441214yg.LIZIZ("LivePromoteParentWidget ", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLJJIJIIJIL) {
            InterfaceC465210IMd interfaceC465210IMd3 = this.LLJILJILJ;
            if (interfaceC465210IMd3 != null && !interfaceC465210IMd3.isPlaying() && (interfaceC465210IMd = this.LLJILJILJ) != null) {
                interfaceC465210IMd.resume();
            }
            InterfaceC470090Ic3 interfaceC470090Ic33 = this.LLJILLL;
            if (interfaceC470090Ic33 == null || interfaceC470090Ic33.isPlaying() || (interfaceC470090Ic3 = this.LLJILLL) == null) {
                return;
            }
            interfaceC470090Ic3.resume();
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.ILiveNewStyleCardWidget, X.InterfaceC464250IIl
    public void t0() {
        InterfaceC465210IMd interfaceC465210IMd;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onRealShow isFirstShown=");
        sbLIZ.append(this.LLJJIJIIJIL);
        sbLIZ.append("  audio=");
        sbLIZ.append(this.LLJILJILJ);
        sbLIZ.append(", video=");
        sbLIZ.append(this.LLJILLL);
        C20441214yg.LIZIZ("LivePromoteParentWidget", C2188811AlT.LIZIZ(sbLIZ));
        String str = "";
        if (!this.LLJJIJIIJIL) {
            this.LLJJIJIIJIL = true;
            if (P1()) {
                String str2 = G1() ? this.LLILZLL.lynxBgMusic : this.LLILZLL.bgMusicUrl;
                if (str2.length() != 0) {
                    if (this.LLJILJILJ == null) {
                        this.LLJILJILJ = ((IHostWatch) C1161920gLG.LIZJ(IHostWatch.class)).getAudioPlayerController();
                    }
                    FrameLayout frameLayout = this.LLJILJIL;
                    if (frameLayout != null && (interfaceC465210IMd = this.LLJILJILJ) != null) {
                        interfaceC465210IMd.LIZ(frameLayout);
                    }
                    InterfaceC465210IMd interfaceC465210IMd2 = this.LLJILJILJ;
                    if (interfaceC465210IMd2 != null) {
                        interfaceC465210IMd2.Lf(str2);
                    }
                }
            }
            InterfaceC470090Ic3 interfaceC470090Ic3 = this.LLJILLL;
            if (interfaceC470090Ic3 != null) {
                interfaceC470090Ic3.start();
            }
            try {
                String str3 = this.LLILZLL.landingSchema;
                Unit unit = null;
                if (C500260Jjc.LJJIIZ(str3) && str3 != null) {
                    String strLIZIZ = C1942307jB.LIZIZ(UriProtector.parse(str3), "source_params");
                    if (strLIZIZ != null) {
                        ((IHostStrategy) C1161920gLG.LIZJ(IHostStrategy.class)).wr2(new JSONObject(strLIZIZ).optString("popup_panel_url", ""));
                    }
                    unit = Unit.LIZ;
                }
                C189200o6.m2constructorimpl(unit);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        this.LLJJI = System.currentTimeMillis();
        LiveExtraCardFrequencyManager liveExtraCardFrequencyManager = LiveExtraCardFrequencyManager.LIZ;
        String str4 = this.LLILZLL.cardId;
        liveExtraCardFrequencyManager.getClass();
        LiveExtraCardFrequencyManager.LJII(str4);
        if (this.LLILZLL.isLynxCard) {
            return;
        }
        LiveExtraCardFrequencyManager.LJIIIIZZ(1);
        int value = LiveInnerWatchHistoryExtraCountSetting.INSTANCE.getValue();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_special_card_show");
        c474500IjALIZ.LJJIIZI(D1());
        c474500IjALIZ.LJJII(C018Q.LIZ(value), "extra");
        c474500IjALIZ.LIZ();
        if (Intrinsics.LJFF(this.LLILLJJLI, "homepage_hot")) {
            str = "homepage_hot_draw_card";
        } else if (Intrinsics.LJFF(this.LLILLJJLI, "live_merge")) {
            str = "live_merge_draw_card";
        }
        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_live_entrance_show");
        c474500IjALIZ2.LJJIIZI(D1());
        c474500IjALIZ2.LJJII(str, "live_entrance_name");
        c474500IjALIZ2.LJJII(this.LLILZLL.cardId, "item_id");
        c474500IjALIZ2.LIZ();
    }

    public LivePromoteParentWidget(EncourageGoLiveCard encourageGoLiveCard) {
        this.LLILZLL = encourageGoLiveCard;
    }

    public final void I1(String str) {
        if (this.LLJJI == -1) {
            return;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_special_card_button_click");
        c474500IjALIZ.LJJIIZI(D1());
        c474500IjALIZ.LJJII(str, "button_name");
        c474500IjALIZ.LJJII(Long.valueOf(System.currentTimeMillis() - this.LLJJI), "stay_duration");
        c474500IjALIZ.LIZ();
        this.LLJJI = -1L;
    }

    public final void J1(String str) {
        if (this.LLJJJ) {
            return;
        }
        this.LLJJJ = true;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_golive_special_card_image_monitor");
        c474500IjALIZ.LJJII(this.LLILZLL.cardId, "card_id");
        c474500IjALIZ.LJJII(Integer.valueOf(this.LLILZLL.style), "card_type");
        c474500IjALIZ.LJJII(str, "image_url");
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getThemeOverlay(Context context) {
        return C011Z.LIZ.LJ();
    }

    public void mh2(C262100zr c262100zr) {
        if (Intrinsics.LJFF(c262100zr.LIZ, "live_event_detail_base_close")) {
            String str = this.LLILZLL.notifyLaterToast;
            C766270U4b.LJIIJJI(str);
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_toast_msg_show");
            c474500IjALIZ.LJJIIZI(D1());
            c474500IjALIZ.LJJII(str, "msg_id");
            c474500IjALIZ.LIZ();
            Room room = (Room) this.dataChannel.gg0(RoomChannel.class);
            if (room != null) {
                this.dataChannel.zW(SwipeNextEvent.class, Long.valueOf(room.getId()));
            }
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public void setContentView(View view) {
        FrameLayout frameLayout;
        ViewGroup viewGroup;
        View viewFindViewById;
        View viewFindViewById2;
        View viewFindViewById3;
        View viewFindViewById4;
        TextureView textureView;
        String str;
        int i;
        String str2;
        int i2;
        int i3;
        C20441214yg.LIZIZ("LivePromoteParentWidget ", "setContentView");
        super.setContentView(view);
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.BQ2(this.widgetCallback.getRootLifeCycleOwner(), GoLiveCardShowing.class, new AwS586S0100000_7(this, 68));
        }
        if (this.LLILZLL.isLynxCard) {
            return;
        }
        if (view != null) {
            frameLayout = (FrameLayout) view.findViewById(R.id.ci6);
        } else {
            frameLayout = null;
        }
        this.LLJILJIL = frameLayout;
        if (view != null) {
            viewGroup = (ViewGroup) view.findViewById(R.id.ded);
        } else {
            viewGroup = null;
        }
        this.LLIZ = viewGroup;
        if (view != null) {
            viewFindViewById = view.findViewById(R.id.csh);
        } else {
            viewFindViewById = null;
        }
        this.LLIZLLLIL = viewFindViewById;
        if (view != null && (viewFindViewById2 = view.findViewById(R.id.cqm)) != null) {
            Context context = viewFindViewById2.getContext();
            if (F1() == 0) {
                i3 = R.attr.exp;
            } else {
                i3 = R.attr.eya;
            }
            viewFindViewById2.setBackgroundColor(C497740JfY.LIZLLL(i3, context));
        } else {
            viewFindViewById2 = null;
        }
        this.LLJ = viewFindViewById2;
        if (view != null) {
            TextView textView = (TextView) view.findViewById(R.id.znz);
            if (textView != null) {
                String str3 = this.LLILZLL.buttonText;
                if (C500260Jjc.LJJIIZ(str3) && str3 != null) {
                    textView.setText(str3);
                }
                Context context2 = textView.getContext();
                if (F1() == 0) {
                    i2 = R.attr.eyv;
                } else {
                    i2 = R.attr.ezq;
                }
                textView.setTextColor(C497740JfY.LIZLLL(i2, context2));
            }
            viewFindViewById3 = view.findViewById(R.id.zzr);
        } else {
            viewFindViewById3 = null;
        }
        this.LLJI = viewFindViewById3;
        if (view != null) {
            viewFindViewById4 = view.findViewById(R.id.nfw);
        } else {
            viewFindViewById4 = null;
        }
        this.LLJIJIL = viewFindViewById4;
        if (view != null) {
            textureView = (TextureView) view.findViewById(R.id.video_bg);
        } else {
            textureView = null;
        }
        this.LLJJ = textureView;
        int i4 = 0;
        if (view != null) {
            C1324720kZq c1324720kZq = (C1324720kZq) view.findViewById(R.id.lcz);
            if (c1324720kZq != null && Q1()) {
                C786410Ut5.LLJJIII(c1324720kZq, 0);
                if (G1()) {
                    str2 = this.LLILZLL.lynxBgImg;
                } else {
                    str2 = this.LLILZLL.bgImgUrl;
                }
                H1(str2, c1324720kZq, null);
            }
            O1(view);
        }
        ViewGroup viewGroup2 = this.LLIZ;
        if (viewGroup2 != null) {
            LayoutInflater layoutInflaterNe = C786410Ut5.ne(this.context);
            Context context3 = this.context;
            C786410Ut5.Td(layoutInflaterNe.cloneInContext(new ContextThemeWrapper(context3, getThemeOverlay(context3))), E1(), viewGroup2, true);
        }
        View view2 = this.LLJI;
        if (view2 != null) {
            if (this.LLILZLL.showNotifyLaterButton) {
                i = 0;
            } else {
                i = 4;
            }
            C786410Ut5.LJLLLLLL(i, view2);
        }
        View view3 = this.LLJIJIL;
        if (view3 != null) {
            if (!this.LLILZLL.showNotifyLaterButtonV2) {
                i4 = 4;
            }
            C786410Ut5.LJLLLLLL(i4, view3);
        }
        if (R1()) {
            IHostWatch iHostWatch = (IHostWatch) C1161920gLG.LIZJ(IHostWatch.class);
            TextureView textureView2 = this.LLJJ;
            if (G1()) {
                str = this.LLILZLL.lynxBgMusic;
            } else {
                str = this.LLILZLL.videoUrl;
            }
            this.LLJILLL = iHostWatch.getVideoCleanPlayerController(textureView2, str, this.LLILZLL.videoLength, null, "extra card", null);
        }
        View view4 = this.LLJ;
        if (view4 != null) {
            C786410Ut5.I7(new ACListenerS142S0100000_7(this, 205), view4);
        }
        View view5 = this.LLIZLLLIL;
        if (view5 != null) {
            C786410Ut5.I7(new ACListenerS142S0100000_7(this, 206), view5);
        }
        View view6 = this.LLJI;
        if (view6 != null) {
            C786410Ut5.I7(new ACListenerS142S0100000_7(this, 207), view6);
        }
        View view7 = this.LLJIJIL;
        if (view7 != null) {
            C786410Ut5.I7(new ACListenerS142S0100000_7(this, 208), view7);
        }
    }

    public final void H1(String str, View view, ImageView.ScaleType scaleType) {
        C1324610kZf c1324610kZfLIZLLL = C1819620xS4.LIZ().LIZLLL(new C521890KdP(this, 2));
        c1324610kZfLIZLLL.setUrl(str);
        if (scaleType != null) {
            c1324610kZfLIZLLL.LJIJJ = scaleType;
        }
        c1324610kZfLIZLLL.LJJI(view);
    }
}
