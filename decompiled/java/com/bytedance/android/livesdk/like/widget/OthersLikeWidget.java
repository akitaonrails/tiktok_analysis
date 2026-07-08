package com.bytedance.android.livesdk.like.widget;

import X.AbstractC19994813Le;
import X.C001A;
import X.C01GW;
import X.C0IFW;
import X.C0IJT;
import X.C0IK5;
import X.C0KXJ;
import X.C0TZM;
import X.C1083560eIs;
import X.C1086360eNO;
import X.C1086370eNP;
import X.C1086420eNU;
import X.C1087930ePv;
import X.C1120240fG2;
import X.C1161920gLG;
import X.C1276840jKc;
import X.C20441214yg;
import X.C2188811AlT;
import X.C292401Bi;
import X.C418440Gaw;
import X.C473410IhP;
import X.C474500IjA;
import X.C497740JfY;
import X.C500260Jjc;
import X.C776250Uch;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1085480eLy;
import X.InterfaceC1086350eNN;
import X.InterfaceC1086400eNS;
import X.InterfaceC1086410eNT;
import X.InterfaceC1087920ePu;
import X.InterfaceC2262081DgM;
import X.InterfaceC500940Jki;
import X.RunnableC473680Ihq;
import Y.ARunnableS117S0100000_17;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.dynamicstrategy.LiveLikeParamsMapChanel;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.IBarrageService;
import com.bytedance.android.livesdk.dataChannel.FirstFrameChannelEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.like.LikeHelper;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterMockToolSwitch;
import com.bytedance.android.livesdk.livesetting.other.LiveBottomLikeViewAnimationOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveLikeDegradeSettings;
import com.bytedance.android.livesdk.model.LikeEffect;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS383S0200000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;
import qo2.w;

/* JADX INFO: loaded from: classes18.dex */
public final class OthersLikeWidget extends LiveRecyclableWidget implements OnMessageListener, InterfaceC1087920ePu, Handler.Callback, C0IFW, InterfaceC1086410eNT {
    public static final float LLJJJJ;
    public static final float LLJJJJJIL;
    public InterfaceC1086350eNN LL;
    public long LLILLL;
    public Room LLILZ;
    public boolean LLILZIL;
    public IMessageManager LLILZLL;
    public boolean LLIZ;
    public LikeHelper LLJIJIL;
    public int LLJILJIL;
    public int LLJILJILJ;
    public int LLJILLL;
    public long LLJJIJI;
    public final C01GW LLILLJJLI = C292401Bi.LIZ(new AwS561S0100000_17(this, 224));
    public int LLIZLLLIL = 1;
    public long LLJ = 300;
    public final BPEAHandler LLJI = new BPEAHandler(Looper.getMainLooper(), this);
    public C1086360eNO<Bitmap> LLJJ = new C1086360eNO<>(100);
    public C1086360eNO<Integer> LLJJI = new C1086360eNO<>(100);
    public boolean LLJJIII = true;
    public float LLJJIJIIJIL = LLJJJJJIL;
    public float LLJJIJIL = LLJJJJ;
    public float LLJJJ = 55.0f;
    public final ARunnableS117S0100000_17 LLJJJIL = new ARunnableS117S0100000_17(this, 105);

    @Override // X.InterfaceC1087920ePu
    public final String JA() {
        return "OthersLikeWidget";
    }

    @Override // X.InterfaceC1087920ePu
    public final void Pb(InterfaceC1085480eLy interfaceC1085480eLy, int i, int i2, float f, float f2, float f3, float f4) {
    }

    @Override // X.InterfaceC1087920ePu
    public final void Py(LikeHelper likeHelper, int i) {
    }

    @Override // X.C0IFW
    public final void W() {
    }

    @Override // X.InterfaceC1087920ePu
    public final /* synthetic */ void onResult(String str) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // X.C0IFW
    public final void resume() {
    }

    static {
        C497740JfY.LIZ(32.0f);
        LLJJJJ = 134.0f;
        LLJJJJJIL = 236.0f;
    }

    public final void B1() {
        InterfaceC1086350eNN interfaceC1086350eNN = this.LL;
        if (interfaceC1086350eNN != null) {
            ViewGroup.LayoutParams layoutParams = interfaceC1086350eNN.getLayoutParams();
            LikeHelper likeHelper = this.LLJIJIL;
            layoutParams.width = likeHelper != null ? likeHelper.LJJIJ() : C497740JfY.LJIIIZ(R.dimen.akg);
            if (interfaceC1086350eNN.getLayoutParams().height > 0) {
                interfaceC1086350eNN.getLayoutParams().height = (int) (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(272)) * interfaceC1086350eNN.getOthersLikeAnimationDistanceRatio());
            }
            interfaceC1086350eNN.setLayoutParams(interfaceC1086350eNN.getLayoutParams());
            this.LLJJIJIIJIL = LLJJJJJIL * interfaceC1086350eNN.getOthersLikeAnimationDistanceRatio();
            this.LLJJIJIL = LLJJJJ * interfaceC1086350eNN.getOthersLikeAnimationDistanceRatio();
            this.LLJJJ = interfaceC1086350eNN.getOthersLikeAnimationDistanceRatio() * 55.0f;
        }
    }

    @Override // X.C0IFW
    public final void cancel() {
        this.LLJI.removeMessages(1);
        this.LLJI.removeMessages(2);
        C0IK5.LIZ().removeCallbacks(this.LLJJJIL);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        C1086420eNU c1086420eNU;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && Intrinsics.LJFF(dataChannel.gg0(C1083560eIs.class), Boolean.TRUE)) {
            C0IK5.LIZ().removeCallbacks(this.LLJJJIL);
        }
        InterfaceC1086350eNN interfaceC1086350eNN = ((C1086370eNP) this.LLILLJJLI.getValue()).LIZ.LL;
        if (interfaceC1086350eNN != null) {
            interfaceC1086350eNN.clear();
        }
        IMessageManager iMessageManager = this.LLILZLL;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        LikeHelper likeHelper = this.LLJIJIL;
        if (likeHelper != null) {
            if (likeHelper.LLJJJJLIIL) {
                likeHelper.LLLIIII = null;
                if (likeHelper.LLJJJJ) {
                    likeHelper.LJIL(this);
                }
            }
            LikeHelper likeHelper2 = this.LLJIJIL;
            if (likeHelper2 != null && (c1086420eNU = likeHelper2.LLLJ) != null) {
                c1086420eNU.LIZJ = null;
            }
        }
        this.LLJI.removeCallbacksAndMessages(null);
        y1();
        this.LLJILJIL = 0;
        this.LLJILJILJ = 0;
        this.LLJJ.clear();
        this.LLJJI.clear();
        this.LLILLJJLI.getValue().getClass();
    }

    @Override // X.C0IFW
    public final void pause() {
        InterfaceC1086350eNN interfaceC1086350eNN;
        C20441214yg.LJIIIZ("matao-test", "OthersLike pause");
        this.LLJI.removeMessages(1);
        if (!isInitialized() || (interfaceC1086350eNN = this.LL) == null) {
            return;
        }
        interfaceC1086350eNN.clear();
    }

    public final void y1() {
        String str;
        InterfaceC2262081DgM currentUser;
        UserAttr userAttr;
        if (this.LLJILJILJ > 0) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_like_special_effect_show");
            InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
            Room room = (Room) this.dataChannel.gg0(RoomChannel.class);
            Boolean boolValueOf = null;
            if (Intrinsics.LJFF(interfaceC500940JkiUser != null ? Long.valueOf(interfaceC500940JkiUser.getCurrentUserId()) : null, room != null ? Long.valueOf(room.getOwnerUserId()) : null)) {
                str = "anchor";
            } else {
                if (interfaceC500940JkiUser != null && (currentUser = interfaceC500940JkiUser.getCurrentUser()) != null && (userAttr = currentUser.getUserAttr()) != null) {
                    boolValueOf = Boolean.valueOf(userAttr.isAdmin);
                }
                str = C500260Jjc.LJJJI(boolValueOf) ? "admin" : "user";
            }
            c474500IjALIZ.LJJII(str, "admin_type");
            c474500IjALIZ.LJJII(Integer.valueOf(this.LLJILJILJ), "special_effect_amount");
            w wVar = w.LIZ;
            wVar.getClass();
            c474500IjALIZ.LJJII(w.LIZLLL(), "action_type");
            if (Intrinsics.LJFF(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getConnectionType(), "manual_pk")) {
                if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).Nt()) {
                    c474500IjALIZ.LJJII("pk_phase", "match_status");
                } else {
                    c474500IjALIZ.LJJII(LiveCenterMockToolSwitch.PUNISH, "match_status");
                }
            }
            if (BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZ.LJIJ())) {
                c474500IjALIZ.LJJIJLIJ();
                c474500IjALIZ.LJIIIIZZ();
                c474500IjALIZ.LJJII(wVar.LIZJ(), "live_type");
                c474500IjALIZ.LJJIJL();
            } else {
                c474500IjALIZ.LJIJJLI(this.dataChannel);
                c474500IjALIZ.LIZ();
            }
            this.LLJILJILJ = 0;
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return (!LiveBottomLikeViewAnimationOptSetting.enable() || C500260Jjc.LJIIZILJ(this.dataChannel)) ? R.layout.h38 : R.layout.h39;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            if (!LiveLikeDegradeSettings.INSTANCE.isScalableDowngrade(this.dataChannel)) {
                A1(this.LLJJ.poll(), this.LLJJI.poll());
                if (!this.LLJJ.isEmpty()) {
                    C786410Ut5.LJLJJI(1, this.LLJ, this.LLJI);
                }
            }
            return true;
        }
        if (i == 2) {
            y1();
            C786410Ut5.LJLJJI(2, 60000L, this.LLJI);
            return false;
        }
        return false;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        InterfaceC1086350eNN interfaceC1086350eNN = (InterfaceC1086350eNN) findViewById(R.id.uo3);
        this.LL = interfaceC1086350eNN;
        if (interfaceC1086350eNN != null) {
            interfaceC1086350eNN.setVisibility(4);
        }
        this.LLILLJJLI.getValue().getClass();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Room room;
        long id;
        IMessageManager iMessageManager;
        int i;
        long j;
        LikeEffect likeEffect;
        int iLJIIIZ;
        C1086420eNU c1086420eNU;
        Boolean bool;
        Boolean bool2;
        boolean zBooleanValue = false;
        this.LLIZ = false;
        DataChannel dataChannel = this.dataChannel;
        LikeHelper likeHelper = null;
        if (dataChannel != null) {
            room = (Room) dataChannel.gg0(RoomChannel.class);
        } else {
            room = null;
        }
        this.LLILZ = room;
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null && (bool2 = (Boolean) dataChannel2.gg0(C0TZM.class)) != null) {
            bool2.booleanValue();
        }
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null && (bool = (Boolean) dataChannel3.gg0(UserIsAnchorChannel.class)) != null) {
            zBooleanValue = bool.booleanValue();
        }
        this.LLILZIL = zBooleanValue;
        this.LLJJ = new C1086360eNO<>(100);
        this.LLJJI = new C1086360eNO<>(100);
        C0KXJ.LIZIZ();
        Room room2 = this.LLILZ;
        if (room2 != null) {
            id = room2.getId();
        } else {
            id = 0;
        }
        this.LLILLL = id;
        DataChannel dataChannel4 = this.dataChannel;
        if (dataChannel4 != null) {
            iMessageManager = (IMessageManager) dataChannel4.gg0(C776250Uch.class);
        } else {
            iMessageManager = null;
        }
        this.LLILZLL = iMessageManager;
        this.LLILLJJLI.getValue().getClass();
        InterfaceC1085480eLy interfaceC1085480eLyO41 = ((IBarrageService) C1161920gLG.LIZJ(IBarrageService.class)).O41(this.LLILLL);
        if (interfaceC1085480eLyO41 instanceof LikeHelper) {
            likeHelper = (LikeHelper) interfaceC1085480eLyO41;
        }
        this.LLJIJIL = likeHelper;
        if (likeHelper != null && (c1086420eNU = likeHelper.LLLJ) != null) {
            c1086420eNU.LIZJ = this;
        }
        if (likeHelper != null) {
            i = likeHelper.LLJIJIL;
        } else {
            i = 1;
        }
        this.LLIZLLLIL = i;
        if (likeHelper != null) {
            j = likeHelper.LLJILJIL;
        } else {
            j = 300;
        }
        this.LLJ = j;
        C786410Ut5.LJLJJI(2, 60000L, this.LLJI);
        InterfaceC1086350eNN interfaceC1086350eNN = this.LL;
        if (interfaceC1086350eNN != null) {
            ViewGroup.LayoutParams layoutParams = interfaceC1086350eNN.getLayoutParams();
            LikeHelper likeHelper2 = this.LLJIJIL;
            if (likeHelper2 != null) {
                iLJIIIZ = likeHelper2.LJJIJ();
            } else {
                iLJIIIZ = C497740JfY.LJIIIZ(R.dimen.akg);
            }
            layoutParams.width = iLJIIIZ;
            interfaceC1086350eNN.setLayoutParams(interfaceC1086350eNN.getLayoutParams());
        }
        Room room3 = (Room) this.dataChannel.gg0(RoomChannel.class);
        this.LLJJIII = true;
        if (room3 != null && (likeEffect = room3.likeEffect) != null) {
            this.LLJ = likeEffect.effectIntervalMs;
            if (likeEffect.effectCnt > 0) {
                this.dataChannel.EQ2(this, FirstFrameChannelEvent.class, new AwS383S0200000_17(this, likeEffect, 26));
            }
        }
        LikeHelper likeHelper3 = this.LLJIJIL;
        if (likeHelper3 != null && likeHelper3.LLJJJJLIIL && !LiveLikeDegradeSettings.INSTANCE.disableOtherLike(this.dataChannel)) {
            IMessageManager iMessageManager2 = this.LLILZLL;
            if (iMessageManager2 != null) {
                iMessageManager2.addMessageListener(C001A.LIKE.getIntType(), this);
            }
            likeHelper3.LLLIIII = this;
            if (likeHelper3.LLJJJJ) {
                likeHelper3.LJIIJ(this);
            }
        }
        C786410Ut5.LJLJJI(2, 60000L, this.LLJI);
        InterfaceC1086350eNN interfaceC1086350eNN2 = this.LL;
        if (interfaceC1086350eNN2 != null) {
            interfaceC1086350eNN2.LIZJ(this.dataChannel, new AwS561S0100000_17(this, 225));
            B1();
        }
        this.dataChannel.EQ2(this, LiveLikeParamsMapChanel.class, new AwS596S0100000_17(this, 195));
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0105 A[PHI: r7 r10
      0x0105: PHI (r7v1 long) = (r7v0 long), (r7v2 long) binds: [B:36:0x0094, B:62:0x0101] A[DONT_GENERATE, DONT_INLINE]
      0x0105: PHI (r10v2 int) = (r10v1 int), (r10v5 int) binds: [B:36:0x0094, B:62:0x0101] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMessage(com.ss.ugc.live.sdk.message.data.IMessage r22) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.like.widget.OthersLikeWidget.onMessage(com.ss.ugc.live.sdk.message.data.IMessage):void");
    }

    public final void A1(Bitmap bitmap, Integer num) {
        int iLJIIIZ;
        C1086420eNU c1086420eNU;
        List<InterfaceC1086400eNS> list;
        attachAndShow();
        if (bitmap != null) {
            if (num != null) {
                if (num.intValue() != -1) {
                    int iIntValue = num.intValue();
                    LikeHelper likeHelper = this.LLJIJIL;
                    if (likeHelper != null && (list = likeHelper.LLLIIIIL) != null) {
                        Iterator it2 = ((ArrayList) list).iterator();
                        while (it2.hasNext()) {
                            ((InterfaceC1086400eNS) it2.next()).LIZ(iIntValue);
                        }
                    }
                } else {
                    int i = this.LLJILJILJ + 1;
                    this.LLJILJILJ = i;
                    C1087930ePv.LIZIZ = i;
                }
            }
            OthersLikeWidget othersLikeWidget = ((C1086370eNP) this.LLILLJJLI.getValue()).LIZ;
            LikeHelper likeHelper2 = othersLikeWidget.LLJIJIL;
            if (likeHelper2 != null) {
                iLJIIIZ = likeHelper2.LJJIJ();
            } else {
                iLJIIIZ = C497740JfY.LJIIIZ(R.dimen.akg);
            }
            int i2 = (iLJIIIZ - C1120240fG2.LLJJIJI) / 2;
            if (i2 > 0) {
                AbstractC19994813Le.Default.nextInt(-i2, i2);
            }
            C1276840jKc.LIZ.getClass();
            C1276840jKc.LJIIL.put("use_like", "true");
            Handler handlerLIZ = C473410IhP.LIZ();
            RunnableC473680Ihq runnableC473680Ihq = C1276840jKc.LJJIIJ;
            handlerLIZ.removeCallbacks(runnableC473680Ihq);
            C786410Ut5.LJLIIL(Mp4ScreenVideoLoadTimeout.CONTROL, handlerLIZ, runnableC473680Ihq);
            LikeHelper likeHelper3 = othersLikeWidget.LLJIJIL;
            if (likeHelper3 != null && (c1086420eNU = likeHelper3.LLLJ) != null) {
                c1086420eNU.LIZIZ(false, bitmap, iLJIIIZ, i2);
            }
        }
    }

    public final void x1(String str, String str2) {
        if (str != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("like_opt_");
            sbLIZ.append(str2);
            C20441214yg.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), str);
        }
    }

    public final void z1(int i, Bitmap bitmap) {
        if (i == -1) {
            int i2 = this.LLJILJIL + this.LLIZLLLIL;
            this.LLJILJIL = i2;
            C1087930ePv.LIZ = i2;
        }
        int i3 = 0;
        if (this.LLJ < 0) {
            if (i == -1) {
                int i4 = this.LLIZLLLIL;
                while (i3 < i4) {
                    A1(bitmap, Integer.valueOf(i));
                    i3++;
                }
                return;
            }
            A1(bitmap, Integer.valueOf(i));
            return;
        }
        if (i == -1) {
            int i5 = this.LLIZLLLIL;
            while (i3 < i5) {
                this.LLJJ.offer(bitmap);
                this.LLJJI.offer(Integer.valueOf(i));
                i3++;
            }
        } else {
            this.LLJJ.offer(bitmap);
            this.LLJJI.offer(Integer.valueOf(i));
        }
        if (!this.LLJI.hasMessages(1) && (!this.LLJJ.isEmpty())) {
            C786410Ut5.LJLJJI(1, this.LLJ, this.LLJI);
        }
    }

    @Override // X.InterfaceC1086410eNT
    public final void LLLZZ(int i, int i2, Bitmap bitmap) {
        attachAndShow();
        float f = i / 2;
        PointF pointF = new PointF(f, (int) C497740JfY.LIZIZ(this.LLJJIJIIJIL));
        float f2 = f + i2;
        PointF pointF2 = new PointF(f2, (int) C497740JfY.LIZIZ(this.LLJJIJIL));
        PointF pointF3 = new PointF(f2, (int) C497740JfY.LIZIZ(this.LLJJJ));
        InterfaceC1086350eNN interfaceC1086350eNN = this.LL;
        if (interfaceC1086350eNN != null) {
            interfaceC1086350eNN.LIZIZ(bitmap, pointF, pointF2, pointF3);
        }
    }
}
