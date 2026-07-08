package com.bytedance.android.livesdk.broadcast.voicechat.layer;

import X.AbstractC765580U1k;
import X.C01GW;
import X.C0U3P;
import X.C0U3Q;
import X.C0UDM;
import X.C0UDN;
import X.C0UDP;
import X.C0UEE;
import X.C0UHD;
import X.C0UR2;
import X.C1548820qPI;
import X.C452501pT;
import X.C761830TuX;
import X.C768460UCm;
import X.C768660UDg;
import X.C769130UFb;
import X.C769140UFc;
import X.EnumC1102750enp;
import X.InterfaceC1141530foN;
import X.InterfaceC761840TuY;
import X.InterfaceC769170UFf;
import X.InterfaceC769460UGi;
import X.InterfaceC769940UIe;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.BroadcastSchemaOpenPanelWithDataEvent;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.dataChannel.BGMDialogShowEvent;
import com.bytedance.android.livesdk.dataChannel.BroadcastEnableSubOnlyLiveEvent;
import com.bytedance.android.livesdk.dataChannel.ECLiveStatusChangeChannel;
import com.bytedance.android.livesdk.dataChannel.LiveTalkStateEvent;
import com.bytedance.android.livesdk.dataChannel.MuteMicChannel;
import com.bytedance.android.livesdk.dataChannel.PauseLiveChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAutoPostLivingSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.voicechat.VoiceChatAnchorPushVideoSetting;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import javax.microedition.khronos.egl.EGLContext;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class VoiceChatWidget extends LiveWidget {
    public static final /* synthetic */ int LLJI = 0;
    public InterfaceC769170UFf LL;
    public final InterfaceC769940UIe LLILLJJLI;
    public final FragmentManager LLILLL;
    public final AbstractC765580U1k LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public LiveDialogFragment LLIZ;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 977));
    public final C769140UFc LLJ = new C0UHD() { // from class: X.0UFc
        @Override // X.C0UHD
        public final void u(EGLContext eGLContext, int i, boolean z, int i2, int i3, long j, float[] fArr, Object[] objArr) {
            InterfaceC769170UFf interfaceC769170UFf = this.LL.LL;
            if (interfaceC769170UFf != null) {
                interfaceC769170UFf.LIZ(i2, i3);
            }
        }

        @Override // X.C0UHD
        public final void LLLLZLL(EGLContext eGLContext, int i, boolean z, InterfaceC1272490jDb interfaceC1272490jDb, int i2, int i3, long j, float[] fArr, long j2, Object... objArr) {
            u(eGLContext, i, z, i2, i3, j, fArr, objArr);
        }
    };

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        InterfaceC769940UIe interfaceC769940UIe;
        super.onCreate();
        if (!this.LLILZIL) {
            this.LLILZIL = true;
        }
        C1548820qPI.LIZLLL("live_goal_update_event", (InterfaceC1141530foN) this.LLIZLLLIL.getValue());
        this.dataChannel.gg0(RoomChannel.class);
        EnumC1102750enp.MUSIC.load(this.dataChannel, new C0UDP(new InterfaceC769460UGi() { // from class: X.0UFd
            @Override // X.InterfaceC769460UGi
            public final LiveDialogFragment LIZ() {
                return this.LIZ.LLIZ;
            }

            @Override // X.InterfaceC769460UGi
            public final FragmentManager getFragmentManager() {
                return this.LIZ.LLILLL;
            }

            @Override // X.InterfaceC769460UGi
            public final void LIZIZ(LiveDialogFragment liveDialogFragment) {
                this.LIZ.LLIZ = liveDialogFragment;
            }
        }));
        EnumC1102750enp.VOICE_EFFECT.load(this.dataChannel, new C0UDM());
        EnumC1102750enp.SOUND_EFFECT.load(this.dataChannel, new C0UDN());
        EnumC1102750enp.ECHO_MODE.load(this.dataChannel, new C768660UDg());
        EnumC1102750enp.MUTE_MIC.load(this.dataChannel, new C0UR2(this));
        if (LiveAutoPostLivingSetting.INSTANCE.getValue()) {
            ConcurrentHashSet<C0U3Q> concurrentHashSet = C0U3P.LIZ;
            if (!C0U3P.LIZIZ(C0U3Q.COMMERCE)) {
                EnumC1102750enp.LIVE_HIGHLIGHT.load(this.dataChannel, new C0UEE());
            }
        }
        DataChannel dataChannel = this.dataChannel;
        dataChannel.BQ2(this, ECLiveStatusChangeChannel.class, AFwS245S0000000_12.get$arr$(241));
        dataChannel.BQ2(this, LiveTalkStateEvent.class, new AwS591S0100000_12(this, 1181));
        dataChannel.BQ2(this, BroadcastEnableSubOnlyLiveEvent.class, new AwS591S0100000_12(this, 1182));
        dataChannel.BQ2(this, MuteMicChannel.class, new AwS591S0100000_12(this, 1183));
        dataChannel.BQ2(this, BGMDialogShowEvent.class, new AwS591S0100000_12(this, 1184));
        this.dataChannel.BQ2(this, PauseLiveChannel.class, new AwS591S0100000_12(this, 1185));
        DataChannelGlobal.LLILZ.BQ2(this, this, BroadcastSchemaOpenPanelWithDataEvent.class, new AwS591S0100000_12(this, 1186));
        if (this.LLILZ != null) {
            InterfaceC761840TuY interfaceC761840TuYLJIIIIZZ = C768460UCm.LJIIIIZZ();
            DataChannel dataChannel2 = this.dataChannel;
            AbstractC765580U1k abstractC765580U1k = this.LLILZ;
            interfaceC761840TuYLJIIIIZZ.getClass();
            C761830TuX.LIZLLL = dataChannel2;
            C761830TuX.LIZIZ = abstractC765580U1k;
        }
        if (VoiceChatAnchorPushVideoSetting.INSTANCE.getValue() && (interfaceC769940UIe = this.LLILLJJLI) != null) {
            interfaceC769940UIe.z3(CertProviderManagerKt.findCert("bpea-voice-startVideoCapture-355", 1476788492));
        }
        InterfaceC769940UIe interfaceC769940UIe2 = this.LLILLJJLI;
        if (interfaceC769940UIe2 != null) {
            interfaceC769940UIe2.LJIJI(this.LLJ);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        C1548820qPI.LJIIIIZZ("live_goal_update_event", (InterfaceC1141530foN) this.LLIZLLLIL.getValue());
        C768460UCm.LJIIIIZZ();
        C761830TuX.LJ();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0UFc] */
    public VoiceChatWidget(C769130UFb c769130UFb, InterfaceC769940UIe interfaceC769940UIe, FragmentManager fragmentManager) {
        AbstractC765580U1k abstractC765580U1kLJII;
        this.LL = c769130UFb;
        this.LLILLJJLI = interfaceC769940UIe;
        this.LLILLL = fragmentManager;
        if (interfaceC769940UIe != null) {
            abstractC765580U1kLJII = interfaceC769940UIe.LJII();
        } else {
            abstractC765580U1kLJII = null;
        }
        this.LLILZ = abstractC765580U1kLJII;
    }
}
