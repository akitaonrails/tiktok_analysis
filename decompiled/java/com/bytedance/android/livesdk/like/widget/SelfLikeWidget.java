package com.bytedance.android.livesdk.like.widget;

import X.C01GW;
import X.C098200Yq;
import X.C0IK5;
import X.C0IPN;
import X.C0KXJ;
import X.C0TZM;
import X.C1086420eNU;
import X.C1086430eNV;
import X.C1086440eNW;
import X.C1087890ePr;
import X.C1143680frq;
import X.C1161920gLG;
import X.C1295960jpS;
import X.C13LP;
import X.C189200o6;
import X.C1CC2;
import X.C292401Bi;
import X.C418440Gaw;
import X.C497740JfY;
import X.C500260Jjc;
import X.C750280Tbu;
import X.C776250Uch;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1085480eLy;
import X.InterfaceC1086350eNN;
import X.InterfaceC1086410eNT;
import X.InterfaceC1086450eNX;
import X.InterfaceC1086480eNa;
import X.InterfaceC1087920ePu;
import Y.ARunnableS117S0100000_17;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.dynamicstrategy.LikeFactorChannel;
import com.bytedance.android.livesdk.IBarrageService;
import com.bytedance.android.livesdk.dataChannel.LiveHostAutoAdaptiveChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.SelfLikeWidgetReadyEvent;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.dataChannel.WeakLikeGuideEvent;
import com.bytedance.android.livesdk.like.LikeHelper;
import com.bytedance.android.livesdk.livesetting.barrage.DiggParamsSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveBottomLikeViewAnimationOptSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveStrategyParamsSwitchSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveTapLikeViewAnimationOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveBottomLikeAnimationMergeSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveHostAutoAdaptiveParams;
import com.bytedance.android.livesdk.livesetting.performance.LiveHostPerfAutoAdaptiveSetting;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveLikeDegradeSettings;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.R;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS596S0100000_17;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public final class SelfLikeWidget extends LiveRecyclableWidget implements InterfaceC1087920ePu, InterfaceC1086480eNa, InterfaceC1086410eNT {
    public static final int LLJJL = (int) C497740JfY.LIZIZ(85.0f);
    public static final float LLJJLIIIJLLLLLLLZ;
    public static final float LLJL;
    public FrameLayout LL;
    public InterfaceC1086450eNX LLILLJJLI;
    public InterfaceC1086350eNN LLILLL;
    public C1086440eNW LLILZ;
    public final C01GW LLILZIL = C292401Bi.LIZ(new AwS561S0100000_17(this, 227));
    public C1086430eNV LLILZLL;
    public long LLIZ;
    public Room LLIZLLLIL;
    public boolean LLJ;
    public IMessageManager LLJI;
    public LikeHelper LLJIJIL;
    public long LLJILJIL;
    public long LLJILJILJ;
    public float LLJILLL;
    public float LLJJ;
    public float LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public final boolean LLJJIJIIJIL;
    public final boolean LLJJIJIL;
    public final boolean LLJJJ;
    public Bitmap LLJJJIL;
    public int LLJJJJ;
    public boolean LLJJJJJIL;
    public final ARunnableS117S0100000_17 LLJJJJLIIL;

    @Override // X.InterfaceC1087920ePu
    public final String JA() {
        return "SelfLikeWidget";
    }

    @Override // X.InterfaceC1087920ePu
    public final /* synthetic */ void onResult(String str) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    static {
        C497740JfY.LIZ(32.0f);
        LLJJLIIIJLLLLLLLZ = 134.0f;
        LLJL = 236.0f;
    }

    public final void B1() {
        InterfaceC1086350eNN interfaceC1086350eNN = this.LLILLL;
        if (interfaceC1086350eNN != null) {
            ViewGroup.LayoutParams layoutParams = interfaceC1086350eNN.getLayoutParams();
            LikeHelper likeHelper = this.LLJIJIL;
            layoutParams.width = likeHelper != null ? likeHelper.LJJIJ() : C497740JfY.LJIIIZ(R.dimen.akg);
            if (interfaceC1086350eNN.getLayoutParams().height > 0) {
                interfaceC1086350eNN.getLayoutParams().height = (int) (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(272)) * interfaceC1086350eNN.getSelfLikeAnimationDistanceRatio());
            }
            interfaceC1086350eNN.setLayoutParams(interfaceC1086350eNN.getLayoutParams());
            this.LLJILLL = LLJL * interfaceC1086350eNN.getSelfLikeAnimationDistanceRatio();
            this.LLJJ = LLJJLIIIJLLLLLLLZ * interfaceC1086350eNN.getSelfLikeAnimationDistanceRatio();
            this.LLJJI = interfaceC1086350eNN.getSelfLikeAnimationDistanceRatio() * 55.0f;
        }
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return !C500260Jjc.LJIIZILJ(this.dataChannel) ? this.LLJJIJIL ? this.LLJJJ ? R.layout.h4g : R.layout.h4h : this.LLJJJ ? R.layout.h4f : R.layout.h4e : R.layout.h4e;
    }

    public SelfLikeWidget() {
        LiveStrategyParamsSwitchSetting.getValue();
        this.LLJILJIL = 300L;
        this.LLJILLL = LLJL;
        this.LLJJ = LLJJLIIIJLLLLLLLZ;
        this.LLJJI = 55.0f;
        this.LLJJIJIIJIL = DiggParamsSetting.INSTANCE.getValue().diggShowEastereggDirect != 0;
        this.LLJJIJIL = LiveTapLikeViewAnimationOptSetting.enable();
        this.LLJJJ = LiveBottomLikeViewAnimationOptSetting.enable();
        this.LLJJJJLIIL = new ARunnableS117S0100000_17(this, 106);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        C1086420eNU c1086420eNU;
        InterfaceC1086350eNN interfaceC1086350eNN;
        C0IK5.LIZ().removeCallbacks(this.LLJJJJLIIL);
        this.LLJJJJJIL = false;
        this.LLJJJIL = null;
        this.LLJJJJ = 0;
        C1087890ePr c1087890ePr = (C1087890ePr) this.LLILZIL.getValue();
        InterfaceC1086450eNX interfaceC1086450eNX = c1087890ePr.LIZJ.LLILLJJLI;
        if (interfaceC1086450eNX != null) {
            interfaceC1086450eNX.clear();
        }
        c1087890ePr.LIZ.clear();
        c1087890ePr.LIZIZ.clear();
        C1086430eNV c1086430eNV = this.LLILZLL;
        if (c1086430eNV != null && (interfaceC1086350eNN = c1086430eNV.LIZ.LLILLL) != null) {
            interfaceC1086350eNN.clear();
        }
        C1086440eNW c1086440eNW = this.LLILZ;
        if (c1086440eNW != null) {
            C1295960jpS c1295960jpS = c1086440eNW.LIZ;
            if (c1295960jpS == null) {
                c1295960jpS = null;
            }
            c1295960jpS.cancelAnimation();
        }
        C1086440eNW c1086440eNW2 = this.LLILZ;
        if (c1086440eNW2 != null) {
            C1295960jpS c1295960jpS2 = c1086440eNW2.LIZ;
            if (c1295960jpS2 == null) {
                c1295960jpS2 = null;
            }
            C786410Ut5.LLD(8, c1295960jpS2);
        }
        LikeHelper likeHelper = this.LLJIJIL;
        if (likeHelper != null) {
            if (likeHelper.LLJJJJLIIL && likeHelper.LLJJJJ) {
                likeHelper.LJIL(this);
                likeHelper.LLJLL = null;
                likeHelper.LLLII = null;
            }
            LikeHelper likeHelper2 = this.LLJIJIL;
            if (likeHelper2 != null && (c1086420eNU = likeHelper2.LLLJ) != null) {
                c1086420eNU.LIZIZ = null;
            }
        }
        this.LLILZIL.getValue().getClass();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.LC0(SelfLikeWidgetReadyEvent.class, Boolean.FALSE);
        }
        this.LLJJIII = false;
        this.LLJJIJI = false;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        C1086430eNV c1086430eNV;
        this.LL = (FrameLayout) findViewById(R.id.xdl);
        this.LLILLJJLI = (InterfaceC1086450eNX) findViewById(R.id.xds);
        if (!LiveBottomLikeAnimationMergeSetting.INSTANCE.enable()) {
            this.LLILLL = (InterfaceC1086350eNN) findViewById(R.id.uo3);
        }
        InterfaceC1086350eNN interfaceC1086350eNN = this.LLILLL;
        if (interfaceC1086350eNN != null) {
            interfaceC1086350eNN.setVisibility(4);
        }
        View view = getView();
        if (view != null) {
            this.LLILZ = new C1086440eNW(view);
        }
        if (LiveLikeDegradeSettings.INSTANCE.disableAvatarAnim(this.dataChannel)) {
            c1086430eNV = null;
        } else {
            c1086430eNV = new C1086430eNV(this);
        }
        this.LLILZLL = c1086430eNV;
        this.LLILZIL.getValue().getClass();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        Room room;
        boolean zBooleanValue;
        long id;
        IMessageManager iMessageManager;
        long j;
        LikeHelper likeHelper;
        InterfaceC1086350eNN interfaceC1086350eNN;
        C1086420eNU c1086420eNU;
        Boolean bool;
        Boolean bool2;
        DataChannel dataChannel = this.dataChannel;
        View view = null;
        if (dataChannel != null) {
            room = (Room) dataChannel.gg0(RoomChannel.class);
        } else {
            room = null;
        }
        this.LLIZLLLIL = room;
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null && (bool2 = (Boolean) dataChannel2.gg0(C0TZM.class)) != null) {
            bool2.booleanValue();
        }
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null && (bool = (Boolean) dataChannel3.gg0(UserIsAnchorChannel.class)) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.LLJ = zBooleanValue;
        C0KXJ.LIZIZ();
        Room room2 = this.LLIZLLLIL;
        if (room2 != null) {
            id = room2.getId();
        } else {
            id = 0;
        }
        this.LLIZ = id;
        DataChannel dataChannel4 = this.dataChannel;
        if (dataChannel4 != null) {
            iMessageManager = (IMessageManager) dataChannel4.gg0(C776250Uch.class);
        } else {
            iMessageManager = null;
        }
        this.LLJI = iMessageManager;
        LikeHelper likeHelper2 = this.LLJIJIL;
        if (likeHelper2 != null) {
            j = likeHelper2.LLJILJIL;
        } else {
            j = 300;
        }
        this.LLJILJIL = j;
        C1087890ePr c1087890ePr = (C1087890ePr) this.LLILZIL.getValue();
        boolean z = this.LLJ;
        InterfaceC1086450eNX interfaceC1086450eNX = c1087890ePr.LIZJ.LLILLJJLI;
        if (interfaceC1086450eNX != null) {
            interfaceC1086450eNX.LIZJ(z);
        }
        C1086440eNW c1086440eNW = this.LLILZ;
        if (c1086440eNW != null) {
            C1295960jpS c1295960jpS = c1086440eNW.LIZ;
            if (c1295960jpS == null) {
                c1295960jpS = null;
            }
            C786410Ut5.LLD(8, c1295960jpS);
        }
        InterfaceC1085480eLy interfaceC1085480eLyO41 = ((IBarrageService) C1161920gLG.LIZJ(IBarrageService.class)).O41(this.LLIZ);
        if (interfaceC1085480eLyO41 instanceof LikeHelper) {
            likeHelper = (LikeHelper) interfaceC1085480eLyO41;
        } else {
            likeHelper = null;
        }
        this.LLJIJIL = likeHelper;
        if (likeHelper != null && likeHelper.LLJJJJLIIL && likeHelper.LLJJJJ) {
            likeHelper.LJIIJ(this);
            Object obj = this.LLILLJJLI;
            if (obj instanceof View) {
                view = (View) obj;
            }
            likeHelper.LLJLL = view;
            likeHelper.LLLII = this;
        }
        LikeHelper likeHelper3 = this.LLJIJIL;
        if (likeHelper3 != null && (c1086420eNU = likeHelper3.LLLJ) != null) {
            c1086420eNU.LIZIZ = this;
        }
        if (!LiveBottomLikeAnimationMergeSetting.INSTANCE.enable() && (interfaceC1086350eNN = this.LLILLL) != null) {
            interfaceC1086350eNN.LIZJ(this.dataChannel, new AwS561S0100000_17(this, 226));
            B1();
        }
        InterfaceC1086450eNX interfaceC1086450eNX2 = this.LLILLJJLI;
        if (interfaceC1086450eNX2 != null) {
            interfaceC1086450eNX2.setDataChannel(this.dataChannel);
        }
        DataChannel dataChannel5 = this.dataChannel;
        if (dataChannel5 != null) {
            dataChannel5.LC0(SelfLikeWidgetReadyEvent.class, Boolean.TRUE);
        }
        DataChannel dataChannel6 = this.dataChannel;
        if (dataChannel6 != null) {
            dataChannel6.BQ2(this, WeakLikeGuideEvent.class, new AwS596S0100000_17(this, 196));
        }
        if (this.LLJ && LiveHostPerfAutoAdaptiveSetting.enable()) {
            this.LLJJIII = false;
            this.LLJJIJI = false;
            DataChannel dataChannel7 = this.dataChannel;
            if (dataChannel7 != null) {
                dataChannel7.BQ2(this, LiveHostAutoAdaptiveChannel.class, new AwS596S0100000_17(this, 197));
            }
        }
        if (isCrossActivityReuse()) {
            z1("hit");
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void setCrossActivityReuse(boolean z) {
        super.setCrossActivityReuse(z);
        if (z) {
            z1("set");
        }
    }

    public final void x1(Bitmap bitmap) {
        C1086430eNV c1086430eNV;
        if (bitmap != null && !bitmap.isRecycled() && isViewValid() && (c1086430eNV = this.LLILZLL) != null) {
            c1086430eNV.LIZ(bitmap);
        }
    }

    public final void z1(String str) {
        int i;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("stage", str);
            jSONObject.put("room_id", this.LLIZ);
            if (this.LLJ) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("is_anchor", i);
            C1CC2.LIZJ("ttlive_self_like_cross_activity_reuse", jSONObject, new JSONObject(), new JSONObject());
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void A1(int i, Bitmap bitmap) {
        if (!bitmap.isRecycled() && isViewValid()) {
            if (i > 0) {
                this.LLJJJIL = bitmap;
                this.LLJJJJ += i;
            }
            if (!this.LLJJJJJIL && this.LLJJJJ > 0) {
                this.LLJJJJJIL = true;
                long jCurrentTimeMillis = this.LLJILJIL - (System.currentTimeMillis() - this.LLJILJILJ);
                if (jCurrentTimeMillis < 0) {
                    jCurrentTimeMillis = 0;
                }
                C786410Ut5.LJLIIL(jCurrentTimeMillis, C0IK5.LIZ(), this.LLJJJJLIIL);
            }
        }
    }

    @Override // X.InterfaceC1087920ePu
    public final void Py(LikeHelper likeHelper, int i) {
        boolean z;
        if (!likeHelper.LJJIIJ() && !this.LLJJIJIIJIL) {
            if (i >= likeHelper.LLJJJ) {
                z = true;
            } else {
                z = false;
            }
            y1(likeHelper, z);
        }
    }

    public final void y1(InterfaceC1085480eLy interfaceC1085480eLy, boolean z) {
        if (interfaceC1085480eLy.LJIJJ() && z) {
            C1086440eNW c1086440eNW = this.LLILZ;
            C1295960jpS c1295960jpS = null;
            if (c1086440eNW != null) {
                C1295960jpS c1295960jpS2 = c1086440eNW.LIZ;
                if (c1295960jpS2 == null) {
                    c1295960jpS2 = null;
                }
                C786410Ut5.LLD(0, c1295960jpS2);
            }
            C1086440eNW c1086440eNW2 = this.LLILZ;
            if (c1086440eNW2 != null) {
                C1295960jpS c1295960jpS3 = c1086440eNW2.LIZ;
                if (c1295960jpS3 == null) {
                    c1295960jpS3 = null;
                }
                if (!c1295960jpS3.isAnimating()) {
                    C1295960jpS c1295960jpS4 = c1086440eNW2.LIZ;
                    if (c1295960jpS4 != null) {
                        c1295960jpS = c1295960jpS4;
                    }
                    C1143680frq.LJIILJJIL(c1295960jpS, C0IPN.LIZ("tiktok_live_lottie_resource", "tiktok_live_watch_resource_normal_1"), c1086440eNW2.LIZIZ, true);
                }
            }
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                dataChannel.SX0(C750280Tbu.class, Boolean.TRUE);
            }
        }
    }

    @Override // X.InterfaceC1086410eNT
    public final void LLLZZ(int i, int i2, Bitmap bitmap) {
        attachAndShow();
        float f = i / 2;
        PointF pointF = new PointF(f, (int) C497740JfY.LIZIZ(this.LLJILLL));
        float f2 = f + i2;
        PointF pointF2 = new PointF(f2, (int) C497740JfY.LIZIZ(this.LLJJ));
        PointF pointF3 = new PointF(f2, (int) C497740JfY.LIZIZ(this.LLJJI));
        InterfaceC1086350eNN interfaceC1086350eNN = this.LLILLL;
        if (interfaceC1086350eNN != null) {
            interfaceC1086350eNN.LIZIZ(bitmap, pointF, pointF2, pointF3);
        }
    }

    @Override // X.InterfaceC1087920ePu
    public final void Pb(InterfaceC1085480eLy interfaceC1085480eLy, int i, int i2, float f, float f2, float f3, float f4) {
        Room room;
        C1086430eNV c1086430eNV;
        int iLJIIIZ;
        boolean z;
        View view;
        C1295960jpS c1295960jpS;
        RoomAuthStatus roomAuthStatus;
        show();
        boolean z2 = false;
        if (UserService.getInstance().user().isLogin() && ((room = this.LLIZLLLIL) == null || (roomAuthStatus = room.getRoomAuthStatus()) == null || roomAuthStatus.enableDigg)) {
            Bitmap bitmapLJIILJJIL = interfaceC1085480eLy.LJIILJJIL(Boolean.TRUE);
            if (bitmapLJIILJJIL != null && !bitmapLJIILJJIL.isRecycled()) {
                C1087890ePr c1087890ePr = (C1087890ePr) this.LLILZIL.getValue();
                LikeHelper likeHelper = c1087890ePr.LIZJ.LLJIJIL;
                if (likeHelper != null) {
                    iLJIIIZ = likeHelper.LLLIIL;
                    if (iLJIIIZ < 0) {
                        iLJIIIZ = C497740JfY.LJIIIZ(R.dimen.asp);
                        likeHelper.LLLIIL = iLJIIIZ;
                    }
                } else {
                    iLJIIIZ = 0;
                }
                SelfLikeWidget selfLikeWidget = c1087890ePr.LIZJ;
                if (selfLikeWidget.LLJ && selfLikeWidget.LLJJIII) {
                    LiveHostAutoAdaptiveParams.INSTANCE.setDisableLikeBoomLastTime(SystemClock.uptimeMillis());
                }
                LikeHelper likeHelper2 = c1087890ePr.LIZJ.LLJIJIL;
                if (likeHelper2 != null && !likeHelper2.LJ()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    SelfLikeWidget selfLikeWidget2 = c1087890ePr.LIZJ;
                    if (selfLikeWidget2.LLJ && !selfLikeWidget2.LLJJIII) {
                        int[] iArr = new int[2];
                        FrameLayout frameLayout = selfLikeWidget2.LL;
                        if (frameLayout == null) {
                            frameLayout = null;
                        }
                        frameLayout.getLocationOnScreen(iArr);
                        int i3 = LLJJL;
                        float f5 = i3 / 2;
                        PointF pointF = new PointF((f - iArr[0]) - f5, ((f2 - iArr[1]) - f5) - iLJIIIZ);
                        HashSet<C1295960jpS> hashSet = c1087890ePr.LIZ;
                        if ((!hashSet.isEmpty()) && (c1295960jpS = (C1295960jpS) C13LP.LJJJLIIL(hashSet)) != null) {
                            c1087890ePr.LIZ.remove(c1295960jpS);
                            c1087890ePr.LIZ(c1295960jpS, pointF);
                        } else {
                            c1295960jpS = new C1295960jpS(c1087890ePr.LIZJ.context);
                            c1087890ePr.LIZ(c1295960jpS, pointF);
                            FrameLayout frameLayout2 = c1087890ePr.LIZJ.LL;
                            if (frameLayout2 == null) {
                                frameLayout2 = null;
                            }
                            frameLayout2.addView(c1295960jpS, new FrameLayout.LayoutParams(i3, i3));
                            C1143680frq.LJIIJJI(c1295960jpS, C0IPN.LIZ("tiktok_live_lottie_resource", "tiktok_live_watch_resource_normal_1"), "digg_tap_lottie.zip");
                        }
                        c1295960jpS.playAnimation();
                    }
                }
                int[] iArr2 = new int[2];
                Object obj = c1087890ePr.LIZJ.LLILLJJLI;
                if ((obj instanceof View) && (view = (View) obj) != null) {
                    view.getLocationOnScreen(iArr2);
                }
                PointF pointF2 = new PointF(f - iArr2[0], (f2 - iArr2[1]) - iLJIIIZ);
                if (f3 > 0.0f && f4 > 0.0f) {
                    PointF pointF3 = new PointF(f3, f4);
                    SelfLikeWidget selfLikeWidget3 = c1087890ePr.LIZJ;
                    InterfaceC1086450eNX interfaceC1086450eNX = selfLikeWidget3.LLILLJJLI;
                    if (interfaceC1086450eNX != null) {
                        interfaceC1086450eNX.LIZIZ(bitmapLJIILJJIL, pointF2, pointF3, selfLikeWidget3.LLJ);
                    }
                } else {
                    InterfaceC1086450eNX interfaceC1086450eNX2 = c1087890ePr.LIZJ.LLILLJJLI;
                    if (interfaceC1086450eNX2 != null) {
                        interfaceC1086450eNX2.LIZ(pointF2, bitmapLJIILJJIL);
                    }
                }
                DataChannel dataChannel = c1087890ePr.LIZJ.dataChannel;
                if (dataChannel != null) {
                    dataChannel.FQ2(LikeFactorChannel.class);
                }
            }
            Bitmap bitmapLJIILJJIL2 = interfaceC1085480eLy.LJIILJJIL(Boolean.FALSE);
            if (bitmapLJIILJJIL2 != null && !bitmapLJIILJJIL2.isRecycled() && (c1086430eNV = this.LLILZLL) != null) {
                c1086430eNV.LIZ(bitmapLJIILJJIL2);
            }
        }
        if (this.LLJJIJIIJIL) {
            if (i2 % interfaceC1085480eLy.LJIIJJI() == 0 && i2 > 0) {
                z2 = true;
            }
            y1(interfaceC1085480eLy, z2);
        }
    }
}
