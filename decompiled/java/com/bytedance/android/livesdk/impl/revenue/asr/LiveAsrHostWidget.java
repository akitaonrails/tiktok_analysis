package com.bytedance.android.livesdk.impl.revenue.asr;

import X.AnonymousClass0956;
import X.C001A;
import X.C0IKA;
import X.C0Z0Y;
import X.C1161920gLG;
import X.C1302010jzD;
import X.C1333220knY;
import X.C2097608Jq;
import X.C2239011CkF;
import X.C2239021CkG;
import X.C2239031CkH;
import X.C2239041CkI;
import X.C2239051CkJ;
import X.C2239071CkL;
import X.C23250099c;
import X.C500260Jjc;
import X.C589930NBv;
import X.C930890aKd;
import X.InterfaceC2239061CkK;
import X.InterfaceC2239081CkM;
import X.InterfaceC769940UIe;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.impl.revenue.asr.LiveAsrHostWidget;
import com.bytedance.android.livesdk.livesetting.strategy.GiftGuideASRBlockListSetting;
import com.bytedance.android.livesdk.livesetting.strategy.GiftGuideASRConfig;
import com.bytedance.android.livesdk.livesetting.strategy.GiftGuideASRSetting;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.rank.api.IRankService;
import com.bytedance.android.livesdk.rank.api.MemberCountChannel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.jvm.internal.AwS613S0100000_34;

/* JADX INFO: loaded from: classes35.dex */
public final class LiveAsrHostWidget extends LiveRecyclableWidget {
    public C0Z0Y LLILLL;
    public C2239071CkL<C589930NBv> LLILZ;
    public volatile long LLIZ;
    public volatile long LLIZLLLIL;
    public volatile boolean LLJ;
    public volatile boolean LLJI;
    public volatile boolean LLJIJIL;
    public volatile boolean LLJILJIL;
    public volatile boolean LLJILJILJ;
    public volatile boolean LLJJ;
    public volatile long LLJJI;
    public volatile int LLJJIII;
    public volatile long LLJJIJI;
    public volatile long LLJJIJIIJIL;
    public volatile long LLJJIJIL;
    public volatile int LLJJJIL;
    public AnonymousClass0956 LLJJJJLIIL;
    public AnonymousClass0956 LLJJL;
    public final ByteArrayOutputStream LL = new ByteArrayOutputStream(576000);
    public final Object LLILLJJLI = new Object();
    public final String LLILZIL = "48000";
    public final String LLILZLL = "2";
    public volatile int LLJILLL = -1;
    public volatile boolean LLJJJ = true;
    public volatile GiftGuideASRConfig LLJJJJ = GiftGuideASRSetting.INSTANCE.getValue();
    public final AtomicInteger LLJJJJJIL = new AtomicInteger(0);
    public final C2239021CkG LLJJLIIIJLLLLLLLZ = new C2239021CkG(this);
    public final AwS613S0100000_34 LLJL = new AwS613S0100000_34(this, 3);
    public final C2239051CkJ LLJLIL = new OnIMMessageListener() { // from class: X.1CkJ
        @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
        public final String messageListenerBizTag() {
            return "host asr widget gift listener";
        }

        @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
        public final IMListenerType messageListenerType() {
            return IMListenerType.SYNC;
        }

        @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
        public final void onMessage(IMessage iMessage) {
            this.LL.LLJJ = true;
            LiveAsrHostWidget liveAsrHostWidget = this.LL;
            System.currentTimeMillis();
            liveAsrHostWidget.getClass();
            this.LL.B1();
        }
    };

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        IMessageManager iMessageManagerLJJJJLL;
        this.LLJIJIL = true;
        AnonymousClass0956 anonymousClass0956 = this.LLJJJJLIIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJJJJLIIL = null;
        AnonymousClass0956 anonymousClass09562 = this.LLJJL;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
        this.LLJJL = null;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.GQ2(this, MemberCountChannel.class, this.LLJL);
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null && (iMessageManagerLJJJJLL = C500260Jjc.LJJJJLL(dataChannel2)) != null) {
            iMessageManagerLJJJJLL.removeMessageListener(C001A.GIFT.getIntType(), this.LLJLIL);
        }
        InterfaceC769940UIe interfaceC769940UIe = (InterfaceC769940UIe) DataChannelGlobal.LLILZ.gg0(C930890aKd.class);
        if (interfaceC769940UIe != null) {
            AudioDeviceModule audioDeviceModuleE3 = interfaceC769940UIe.E3();
            if (audioDeviceModuleE3 != null) {
                audioDeviceModuleE3.enableAsyncProcess(false);
            }
            interfaceC769940UIe.w3(new C1333220knY(this.LLJJLIIIJLLLLLLLZ));
        }
        this.LLJI = false;
        C1(false);
    }

    public final void B1() {
        if (this.LLJ || this.LLJILJIL) {
            return;
        }
        this.LLJJJJ = GiftGuideASRSetting.INSTANCE.getValue();
        this.LLJJIJI = ((long) this.LLJJJJ.seiMinIntervalSec) * 1000;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.LLJJIJIIJIL < ((long) (this.LLJJJJ.taskDelayMin * 60)) * 1000) {
            return;
        }
        if (this.LLJJJ) {
            this.LLJJJ = false;
            y1();
        } else if (this.LLJJIJIL > 0 && jCurrentTimeMillis - this.LLJJIJIL > ((long) this.LLJJJJ.durationAfterSuccessSec) * 1000) {
            y1();
        } else {
            if (this.LLJJIJIL != 0 || this.LLJJJJJIL.get() >= 3) {
                return;
            }
            y1();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y1() {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.impl.revenue.asr.LiveAsrHostWidget.y1():void");
    }

    public final boolean z1() {
        RoomAuthStatus roomAuthStatus;
        String strValueOf = String.valueOf(UserService.getInstance().user().getCurrentUserId());
        DataChannel dataChannel = this.dataChannel;
        Room room = dataChannel != null ? (Room) dataChannel.gg0(RoomChannel.class) : null;
        return (!GiftGuideASRSetting.INSTANCE.isEnable() || room == null || (roomAuthStatus = room.mRoomAuthStatus) == null || !roomAuthStatus.enableGift || GiftGuideASRBlockListSetting.INSTANCE.getValue().contains(strValueOf)) ? false : true;
    }

    public final void A1(byte[] bArr) {
        C2239071CkL<C589930NBv> c2239071CkL;
        if (!this.LLJILJILJ) {
            return;
        }
        synchronized (this) {
            try {
                c2239071CkL = this.LLILZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (c2239071CkL == null) {
            return;
        }
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("audio_data", bArr), new Pair("audio_length", Integer.valueOf(bArr.length)), new Pair("sample_rate", this.LLILZIL), new Pair("channel", this.LLILZLL));
        this.LLIZ = System.currentTimeMillis();
        InterfaceC2239081CkM<C589930NBv> interfaceC2239081CkM = c2239071CkL.LIZIZ;
        if (interfaceC2239081CkM != null) {
            interfaceC2239081CkM.LIZJ(new C589930NBv((Map<String, ? extends Object>) mapLJIIIIZZ, (Map<String, ? extends Object>) C2097608Jq.LJ(), (Throwable) null, false));
        }
    }

    public final void C1(boolean z) {
        InterfaceC2239081CkM<C589930NBv> interfaceC2239081CkM;
        synchronized (this) {
            try {
                try {
                    C2239071CkL<C589930NBv> c2239071CkL = this.LLILZ;
                    if (c2239071CkL != null && (interfaceC2239081CkM = c2239071CkL.LIZIZ) != null) {
                        interfaceC2239081CkM.LJFF();
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                C0Z0Y c0z0y = this.LLILLL;
                if (c0z0y != null) {
                    c0z0y.release();
                }
                this.LLILLL = null;
                this.LLILZ = null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        this.LLJ = false;
        if (!z) {
            this.LLJILJIL = false;
        }
        synchronized (this.LLILLJJLI) {
            try {
                this.LL.reset();
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }

    public final void E1(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.hasArray()) {
            this.LL.write(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            return;
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        this.LL.write(bArr);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        IMessageManager iMessageManagerLJJJJLL;
        LifecycleCoroutineScope lifecycleScope;
        this.LLJIJIL = false;
        this.LLJJJ = true;
        this.LLJJJJJIL.set(0);
        this.LLJILLL = -1;
        this.LLJJ = false;
        this.LLJJI = 0L;
        this.LLJJJIL = 0;
        this.LLJJIJIL = 0L;
        this.LLJJIII = 0;
        this.LLJI = false;
        this.LLJJIJIIJIL = System.currentTimeMillis();
        this.LLIZLLLIL = this.LLJJIJIIJIL;
        this.LLJILJILJ = z1();
        Fragment fragment = this.widgetCallback.getFragment();
        AnonymousClass0956 anonymousClass0956LIZLLL = null;
        if (fragment != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(fragment)) != null) {
            anonymousClass0956LIZLLL = C23250099c.LIZLLL(lifecycleScope, null, null, new C1302010jzD(this, null), 3);
        }
        this.LLJJL = anonymousClass0956LIZLLL;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.EQ2(this, MemberCountChannel.class, this.LLJL);
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null && (iMessageManagerLJJJJLL = C500260Jjc.LJJJJLL(dataChannel2)) != null) {
            iMessageManagerLJJJJLL.addMessageListener(C001A.GIFT.getIntType(), (OnIMMessageListener) this.LLJLIL);
        }
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            dataChannel3.BQ2(this, RoomChannel.class, new AwS613S0100000_34(this, 4));
        }
    }

    public final void D1(C2239071CkL<C589930NBv> c2239071CkL, float f) {
        if (this.LLJIJIL) {
            this.LLJILJIL = false;
            return;
        }
        if (c2239071CkL != null && c2239071CkL.LIZ != null) {
            InterfaceC2239061CkK<C589930NBv> interfaceC2239061CkK = c2239071CkL.LIZ;
            if (interfaceC2239061CkK != null) {
                interfaceC2239061CkK.LIZIZ(new C2239011CkF(this, f));
                interfaceC2239061CkK.LIZ(new AwS613S0100000_34(this, 5));
                interfaceC2239061CkK.subscribe();
            }
            synchronized (this) {
                try {
                    if (this.LLILLL == null) {
                        this.LLJILJIL = false;
                        return;
                    }
                    this.LLJ = true;
                    this.LLJILJIL = false;
                    this.LLJJJJJIL.set(0);
                    this.LLJILJILJ = z1();
                    return;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        x1("stream not available", C0IKA.DOWNLOAD);
    }

    public final void x1(String str, C0IKA c0ika) {
        long id;
        Room room;
        int iYy2 = ((IRankService) C1161920gLG.LIZJ(IRankService.class)).yy2();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        C2239031CkH.LIZ(new C2239041CkI(false, c0ika, (Long) null, str, (Float) null, Integer.valueOf(iYy2), Long.valueOf(id), 52));
        C1(false);
        if (c0ika == C0IKA.DOWNLOAD) {
            this.LLJJJJJIL.incrementAndGet();
        }
    }
}
