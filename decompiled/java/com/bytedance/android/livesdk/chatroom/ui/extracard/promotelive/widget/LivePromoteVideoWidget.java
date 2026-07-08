package com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget;

import X.C098200Yq;
import X.C0IJT;
import X.C1161920gLG;
import X.C1324720kZq;
import X.C1479130oat;
import X.C189200o6;
import X.C20441214yg;
import X.C2188811AlT;
import X.C470020Ibw;
import X.C474500IjA;
import X.C500260Jjc;
import X.C786410Ut5;
import X.C804420Vh2;
import X.InterfaceC470090Ic3;
import X.InterfaceC588410N5z;
import Y.ARunnableS76S0200000_7;
import android.graphics.Color;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.LivePromoteVideoWidget;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePromoteGoLiveOptimizeSetting;
import com.bytedance.android.livesdkapi.host.IHostWatch;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import webcast.api.room.EncourageGoLiveCard;

/* JADX INFO: loaded from: classes8.dex */
public final class LivePromoteVideoWidget extends LivePromoteParentWidget {
    public final String LLJJJJ;
    public final String LLJJJJJIL;
    public final String LLJJJJLIIL;
    public final String LLJJL;
    public TextView LLJJLIIIJLLLLLLLZ;
    public TextView LLJL;
    public InterfaceC470090Ic3 LLJLIL;
    public C1324720kZq LLJLILLLLZIIL;
    public long LLJLL;
    public long LLJLLIL;
    public long LLJLLL;
    public long LLJZ;
    public long LLJZIJLIL;
    public long LLL;

    @Override // com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.LivePromoteParentWidget
    public final int E1() {
        return R.layout.hjy;
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.LivePromoteParentWidget, com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.ILiveNewStyleCardWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final Map<String, String> T1() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.LLILLJJLI;
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("enter_from", str);
        linkedHashMap.put("card_id", this.LLILZLL.cardId);
        linkedHashMap.put("card_type", String.valueOf(this.LLILZLL.cardType));
        linkedHashMap.put("video_url", this.LLILZLL.videoUrl);
        linkedHashMap.put("video_duration", String.valueOf(this.LLILZLL.videoLength));
        linkedHashMap.put("network_type", C804420Vh2.LJ(this.context).toString());
        linkedHashMap.put("network_speed", String.valueOf(C1479130oat.LJII()));
        return linkedHashMap;
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.LivePromoteParentWidget
    public final void L1() {
        InterfaceC470090Ic3 interfaceC470090Ic3;
        InterfaceC470090Ic3 interfaceC470090Ic32;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mutePlayer: isPlaying=");
        InterfaceC470090Ic3 interfaceC470090Ic33 = this.LLJLIL;
        sbLIZ.append(interfaceC470090Ic33 != null ? Boolean.valueOf(interfaceC470090Ic33.isPlaying()) : null);
        sbLIZ.append(", ");
        sbLIZ.append(this.LLJJIJIIJIL);
        C20441214yg.LIZIZ("LivePromoteVideoWidget", C2188811AlT.LIZIZ(sbLIZ));
        if (!this.LLJJIJIIJIL || (interfaceC470090Ic3 = this.LLJLIL) == null || !interfaceC470090Ic3.isPlaying() || (interfaceC470090Ic32 = this.LLJLIL) == null) {
            return;
        }
        interfaceC470090Ic32.pause();
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.LivePromoteParentWidget
    public final void N1() {
        InterfaceC470090Ic3 interfaceC470090Ic3;
        InterfaceC470090Ic3 interfaceC470090Ic32;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("resumePlayer: isPlaying=");
        InterfaceC470090Ic3 interfaceC470090Ic33 = this.LLJLIL;
        sbLIZ.append(interfaceC470090Ic33 != null ? Boolean.valueOf(interfaceC470090Ic33.isPlaying()) : null);
        sbLIZ.append(", ");
        sbLIZ.append(this.LLJJIJIIJIL);
        C20441214yg.LIZIZ("LivePromoteVideoWidget", C2188811AlT.LIZIZ(sbLIZ));
        if (!this.LLJJIJIIJIL || (interfaceC470090Ic3 = this.LLJLIL) == null || interfaceC470090Ic3.isPlaying() || (interfaceC470090Ic32 = this.LLJLIL) == null) {
            return;
        }
        interfaceC470090Ic32.resume();
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.LivePromoteParentWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        InterfaceC470090Ic3 interfaceC470090Ic3 = this.LLJLIL;
        if (interfaceC470090Ic3 != null) {
            interfaceC470090Ic3.release();
        }
        if (this.LLL <= 0) {
            C470020Ibw.LIZJ(S1(this.LLJJJJJIL), "widget_destroy", "widget_destroy", S1(this.LLJJJJ), T1());
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLL;
        this.LLJZIJLIL += jCurrentTimeMillis >= 0 ? jCurrentTimeMillis : 0L;
        Map<String, String> mapT1 = T1();
        long jS1 = S1(this.LLJJL);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_golive_video_play_duration");
        c474500IjALIZ.LJJIIZI(mapT1);
        c474500IjALIZ.LJJII(Long.valueOf(jS1), "play_duration");
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.LivePromoteParentWidget, com.bytedance.android.widget.Widget
    public final void onPause() {
        super.onPause();
        L1();
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.LivePromoteParentWidget, com.bytedance.android.widget.Widget
    public final void onResume() {
        super.onResume();
        N1();
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.LivePromoteParentWidget, com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.ILiveNewStyleCardWidget, X.InterfaceC464250IIl
    public final void t0() {
        super.t0();
        this.LLJZ = System.currentTimeMillis();
        if (LivePromoteGoLiveOptimizeSetting.INSTANCE.enablePreloadVideo()) {
            N1();
            return;
        }
        InterfaceC470090Ic3 interfaceC470090Ic3 = this.LLJLIL;
        if (interfaceC470090Ic3 != null) {
            interfaceC470090Ic3.start();
        }
        this.LLJLL = System.currentTimeMillis();
    }

    public LivePromoteVideoWidget(EncourageGoLiveCard encourageGoLiveCard) {
        super(encourageGoLiveCard);
        this.LLJJJJ = "load";
        this.LLJJJJJIL = "user_wait";
        this.LLJJJJLIIL = "block";
        this.LLJJL = "video_play";
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.LivePromoteParentWidget
    public final void O1(View view) {
        Object c098200Yq;
        try {
            c098200Yq = Integer.valueOf(Color.parseColor(this.LLILZLL.videoBgColor));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            view.setBackgroundColor(num.intValue());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
    
        if (r3 > 0) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long S1(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = r7.LLJJJJ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r8, r0)
            r5 = 0
            if (r0 == 0) goto L1f
            long r1 = r7.LLJLLIL
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 > 0) goto L1c
            long r1 = java.lang.System.currentTimeMillis()
            long r3 = r7.LLJLL
        L16:
            long r1 = r1 - r3
        L17:
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 >= 0) goto L6c
            return r5
        L1c:
            long r3 = r7.LLJLL
            goto L16
        L1f:
            java.lang.String r0 = r7.LLJJJJJIL
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r8, r0)
            if (r0 == 0) goto L50
            long r1 = r7.LLJLLIL
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 > 0) goto L45
            boolean r0 = r7.LLJJIJIIJIL
            if (r0 == 0) goto L3e
            long r1 = r7.LLJZ
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 <= 0) goto L3e
            long r1 = java.lang.System.currentTimeMillis()
            long r3 = r7.LLJZ
            goto L16
        L3e:
            long r1 = java.lang.System.currentTimeMillis()
            long r3 = r7.LLJLL
            goto L16
        L45:
            boolean r0 = r7.LLJJIJIIJIL
            if (r0 == 0) goto L6a
            long r3 = r7.LLJZ
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L6a
            goto L16
        L50:
            java.lang.String r0 = r7.LLJJJJLIIL
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r8, r0)
            if (r0 == 0) goto L5f
            long r1 = java.lang.System.currentTimeMillis()
            long r3 = r7.LLJLLL
            goto L16
        L5f:
            java.lang.String r0 = r7.LLJJL
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r8, r0)
            if (r0 == 0) goto L6a
            long r1 = r7.LLJZIJLIL
            goto L17
        L6a:
            r1 = 0
        L6c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.LivePromoteVideoWidget.S1(java.lang.String):long");
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.LivePromoteParentWidget, com.bytedance.android.widget.Widget
    public final void setContentView(View view) {
        TextView textView;
        TextView textView2;
        TextureView textureView;
        ViewGroup.LayoutParams layoutParams;
        super.setContentView(view);
        C1324720kZq c1324720kZq = null;
        if (view != null) {
            textView = (TextView) view.findViewById(R.id.tv_title);
        } else {
            textView = null;
        }
        this.LLJJLIIIJLLLLLLLZ = textView;
        if (view != null) {
            textView2 = (TextView) view.findViewById(R.id.tv_sub_title);
        } else {
            textView2 = null;
        }
        this.LLJL = textView2;
        if (view != null) {
            c1324720kZq = (C1324720kZq) view.findViewById(R.id.video_first_frame);
        }
        this.LLJLILLLLZIIL = c1324720kZq;
        TextView textView3 = this.LLJJLIIIJLLLLLLLZ;
        if (textView3 != null) {
            textView3.setText(this.LLILZLL.title);
        }
        TextView textView4 = this.LLJL;
        if (textView4 != null) {
            textView4.setText(this.LLILZLL.subTitle);
        }
        if (view != null && (textureView = (TextureView) view.findViewById(R.id.video_big_photo)) != null) {
            HandlerHook.viewPost(textureView, new ARunnableS76S0200000_7(textureView, this, 10));
            LivePromoteGoLiveOptimizeSetting livePromoteGoLiveOptimizeSetting = LivePromoteGoLiveOptimizeSetting.INSTANCE;
            if (livePromoteGoLiveOptimizeSetting.useFirstFrameImage() && this.LLILZLL.videoCover.length() > 0) {
                C1324720kZq c1324720kZq2 = this.LLJLILLLLZIIL;
                if (c1324720kZq2 != null) {
                    C500260Jjc.LLFFF(c1324720kZq2);
                }
                C1324720kZq c1324720kZq3 = this.LLJLILLLLZIIL;
                if (c1324720kZq3 != null && (layoutParams = c1324720kZq3.getLayoutParams()) != null) {
                    layoutParams.height = (int) (textureView.getWidth() * this.LLILZLL.videoRatio);
                    C1324720kZq c1324720kZq4 = this.LLJLILLLLZIIL;
                    if (c1324720kZq4 != null) {
                        C786410Ut5.u6(c1324720kZq4, layoutParams);
                    }
                }
                H1(this.LLILZLL.videoCover, this.LLJLILLLLZIIL, ImageView.ScaleType.FIT_XY);
            }
            InterfaceC588410N5z interfaceC588410N5z = new InterfaceC588410N5z() { // from class: X.0IcB
                @Override // X.InterfaceC588410N5z
                public final void onBufferedPercent(String str, long j, int i) {
                }

                @Override // X.InterfaceC588410N5z
                public final void onPlayCompleted(String str) {
                }

                @Override // X.InterfaceC588410N5z
                public final void onPlayProgressChange(float f) {
                }

                @Override // X.InterfaceC588410N5z
                public final void onPreparePlay(String str) {
                }

                @Override // X.InterfaceC588410N5z
                public final void LJII() {
                    InterfaceC470090Ic3 interfaceC470090Ic3;
                    this.LL.LLJLLIL = System.currentTimeMillis();
                    C1324720kZq c1324720kZq5 = this.LL.LLJLILLLLZIIL;
                    if (c1324720kZq5 != null) {
                        C500260Jjc.LJIILIIL(c1324720kZq5);
                    }
                    this.LL.LLL = System.currentTimeMillis();
                    Map<String, String> mapT1 = this.LL.T1();
                    LivePromoteVideoWidget livePromoteVideoWidget = this.LL;
                    long jS1 = livePromoteVideoWidget.S1(livePromoteVideoWidget.LLJJJJJIL);
                    LivePromoteVideoWidget livePromoteVideoWidget2 = this.LL;
                    C470020Ibw.LIZJ(jS1, CardStruct.IStatusCode.DEFAULT, "success", livePromoteVideoWidget2.S1(livePromoteVideoWidget2.LLJJJJ), mapT1);
                    if (LivePromoteGoLiveOptimizeSetting.INSTANCE.enablePreloadVideo()) {
                        LivePromoteVideoWidget livePromoteVideoWidget3 = this.LL;
                        if (livePromoteVideoWidget3.LLJJIJIIJIL || (interfaceC470090Ic3 = livePromoteVideoWidget3.LLJLIL) == null) {
                            return;
                        }
                        interfaceC470090Ic3.pause();
                    }
                }

                @Override // X.InterfaceC588410N5z
                public final void LJLLI(String str) {
                    this.LL.LLJLLIL = System.currentTimeMillis();
                }

                @Override // X.InterfaceC588410N5z
                public final void LL(String str) {
                    Map<String, String> mapT1 = this.LL.T1();
                    LivePromoteVideoWidget livePromoteVideoWidget = this.LL;
                    long jS1 = livePromoteVideoWidget.S1(livePromoteVideoWidget.LLJJJJJIL);
                    LivePromoteVideoWidget livePromoteVideoWidget2 = this.LL;
                    C470020Ibw.LIZJ(jS1, str, "retry_error", livePromoteVideoWidget2.S1(livePromoteVideoWidget2.LLJJJJ), mapT1);
                }

                @Override // X.InterfaceC588410N5z
                public final void onBuffering(boolean z) {
                    if (z) {
                        this.LL.LLJLLL = System.currentTimeMillis();
                        return;
                    }
                    Map<String, String> mapT1 = this.LL.T1();
                    LivePromoteVideoWidget livePromoteVideoWidget = this.LL;
                    long jS1 = livePromoteVideoWidget.S1(livePromoteVideoWidget.LLJJJJLIIL);
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_golive_video_block");
                    c474500IjALIZ.LJJIIZI(mapT1);
                    c474500IjALIZ.LJJII(Long.valueOf(jS1), "block_duration");
                    c474500IjALIZ.LIZ();
                    this.LL.LLJLLL = 0L;
                }

                @Override // X.InterfaceC588410N5z
                public final void onPausePlay(String str) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    LivePromoteVideoWidget livePromoteVideoWidget = this.LL;
                    long j = jCurrentTimeMillis - livePromoteVideoWidget.LLL;
                    long j2 = livePromoteVideoWidget.LLJZIJLIL;
                    if (j < 0) {
                        j = 0;
                    }
                    livePromoteVideoWidget.LLJZIJLIL = j2 + j;
                }

                @Override // X.InterfaceC588410N5z
                public final void onResumePlay(String str) {
                    this.LL.LLL = System.currentTimeMillis();
                }
            };
            IHostWatch iHostWatch = (IHostWatch) C1161920gLG.LIZJ(IHostWatch.class);
            EncourageGoLiveCard encourageGoLiveCard = this.LLILZLL;
            this.LLJLIL = iHostWatch.getVideoCleanPlayerController(textureView, encourageGoLiveCard.videoUrl, encourageGoLiveCard.videoLength, null, "inner_promote_live", interfaceC588410N5z);
            if (livePromoteGoLiveOptimizeSetting.enablePreloadVideo()) {
                InterfaceC470090Ic3 interfaceC470090Ic3 = this.LLJLIL;
                if (interfaceC470090Ic3 != null) {
                    interfaceC470090Ic3.start();
                }
                this.LLJLL = System.currentTimeMillis();
            }
        }
    }
}
