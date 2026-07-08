package com.bytedance.android.livesdk.gift.base.platform.business.tray;

import X.C01R9;
import X.C0J1N;
import X.C0KVU;
import X.C0TZJ;
import X.C1091250eVH;
import X.C1104160eq6;
import X.C1128450fTH;
import X.C1131800fYg;
import X.C1133680fbi;
import X.C1133690fbj;
import X.C1133910fc5;
import X.C1134960fdm;
import X.C1134970fdn;
import X.C1134980fdo;
import X.C1135040fdu;
import X.C1135280feI;
import X.C1135790ff7;
import X.C1135810ff9;
import X.C1135890ffH;
import X.C1135910ffJ;
import X.C1135920ffK;
import X.C1135930ffL;
import X.C1135940ffM;
import X.C1135950ffN;
import X.C1136080ffa;
import X.C1136370fg3;
import X.C1137480fhq;
import X.C1138230fj3;
import X.C1138360fjG;
import X.C1138630fjh;
import X.C1140890fnL;
import X.C1161920gLG;
import X.C11NJ;
import X.C11RD;
import X.C13LP;
import X.C158B;
import X.C1697810uHb;
import X.C1701940uOG;
import X.C20441214yg;
import X.C2188811AlT;
import X.C473130Igx;
import X.C497740JfY;
import X.C500260Jjc;
import X.C784440Upu;
import X.C786410Ut5;
import X.EnumC1083260eIO;
import X.EnumC1101430elh;
import X.EnumC1133520fbS;
import X.EnumC1136250ffr;
import X.EnumC743790TFp;
import X.InterfaceC1136220ffo;
import X.InterfaceC1137720fiE;
import X.InterfaceC482090IvP;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ARunnableS112S0100000_12;
import Y.AfS186S0100000_17;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.api.CoHostAndMultiGuestSceneGiftPanelChangeChannel;
import com.bytedance.android.live.liveinteract.api.CohostGuestListChangeChannel;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.livesdk.dataChannel.LiveExtendedScreenStatus;
import com.bytedance.android.livesdk.dataChannel.LiveExtendedScreenType;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.livesetting.gift.GiftReceiveFlowFluencyOptSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftCrossScreenSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftReceivingRefactorSetting;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftThroughputQueueSetting;
import com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom.LiveInnerDowngradeAdaptExp;
import com.bytedance.android.livesdk.model.message.AssetMessage;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.model.message.LiveTrayMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.android.performanhtune.IPTFService;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveGiftTrayWidgetV2 extends AbsNormalGiftAnimWidget {
    public C1135910ffJ LLILLJJLI;
    public InterfaceC1136220ffo LLILLL;
    public C1135930ffL LLILZ;
    public final C11NJ LLILZIL = new C11NJ();
    public C1091250eVH LLILZLL;
    public C1104160eq6 LLIZ;
    public int LLIZLLLIL;
    public Boolean LLJ;

    @Override // com.bytedance.android.livesdk.gift.base.platform.business.tray.AbsNormalGiftAnimWidget
    public final void E1(int i) {
    }

    @Override // com.bytedance.android.livesdk.gift.base.platform.business.tray.AbsNormalGiftAnimWidget
    public final void F1() {
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hzl;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return true;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.android.livesdk.gift.base.platform.business.tray.AbsNormalGiftAnimWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        C1091250eVH c1091250eVH;
        Boolean bool;
        Boolean bool2;
        this.LLILZIL.LJ();
        C1135930ffL c1135930ffL = this.LLILZ;
        if (c1135930ffL != null) {
            c1135930ffL.LJI.removeCallbacks(c1135930ffL.LJIIIIZZ);
            c1135930ffL.LJII = false;
            Iterator<C1135940ffM> it2 = c1135930ffL.LIZJ.iterator();
            while (it2.hasNext()) {
                it2.next().LJIJI();
            }
            c1135930ffL.LIZJ.clear();
            C1135950ffN c1135950ffN = c1135930ffL.LJIIJJI;
            c1135950ffN.getClass();
            C20441214yg.LIZIZ("LiveGiftTrayBlockMonitor", "release");
            C20441214yg.LIZIZ("LiveGiftTrayBlockMonitor", "resetMonitor");
            c1135950ffN.LIZIZ = false;
            c1135950ffN.LIZJ = false;
            c1135950ffN.LJ = 0L;
            c1135950ffN.LJFF = 0L;
            c1135950ffN.LJI = 0L;
            c1135950ffN.LJIILJJIL.LJ();
            c1135950ffN.LJIILL.LJ();
            c1135930ffL.LJFF = 0;
        }
        C1135910ffJ c1135910ffJ = this.LLILLJJLI;
        if (c1135910ffJ != null) {
            C1134960fdm c1134960fdm = C1134980fdo.LIZ;
            DataChannel dataChannel = c1135910ffJ.LIZJ;
            c1134960fdm.LIZJ(c1135910ffJ.LIZ.size(), (dataChannel == null || (bool2 = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class)) == null) ? false : bool2.booleanValue());
            c1135910ffJ.LJIILIIL();
            DataChannel dataChannel2 = c1135910ffJ.LIZJ;
            boolean zBooleanValue = (dataChannel2 == null || (bool = (Boolean) dataChannel2.gg0(UserIsAnchorChannel.class)) == null) ? false : bool.booleanValue();
            IInteractService iInteractService = C1128450fTH.LIZ;
            boolean zLJJII = C1128450fTH.LJJII(UserService.getInstance().user().getCurrentUserId());
            if (zBooleanValue) {
                c1134960fdm.LIZIZ("_anchor", true);
            } else if (zLJJII) {
                c1134960fdm.LIZIZ("_guest", true);
            }
            c1134960fdm.LIZIZ("_self", false);
            C1135890ffH.LIZIZ.LJ();
            c1135910ffJ.LIZ.clear();
            c1135910ffJ.LIZIZ.clear();
            c1135910ffJ.LIZLLL.clear();
            c1135910ffJ.LJ.clear();
            C1136080ffa.LJII();
            c1135910ffJ.LIZJ = null;
            c1135910ffJ.LJII = null;
        }
        this.LLILLL = null;
        C1091250eVH c1091250eVH2 = this.LLILZLL;
        if (c1091250eVH2 instanceof ViewGroup) {
            C786410Ut5.LJJJJI(c1091250eVH2);
        }
        if (C497740JfY.LJJ() && (c1091250eVH = this.LLILZLL) != null) {
            C500260Jjc.LJLJJLL(this.LLIZLLLIL, c1091250eVH);
        }
        C1136080ffa.LJII();
        C1137480fhq.LIZ.getClass();
        C1137480fhq.LIZIZ = null;
        C01R9.LIZ.getClass();
        C1128450fTH.LIZ.S0("gift_sync_sei");
        C1131800fYg.LIZ.getClass();
        if (LiveInnerDowngradeAdaptExp.INSTANCE.getExpValue().getGiftTrayComboDowngrade()) {
            ((IPTFService) C1161920gLG.LIZJ(IPTFService.class)).ph1(EnumC1101430elh.GIFT_TRAY_COMBO_DOWNGRADE);
            C1131800fYg.LIZIZ = false;
        }
        C1104160eq6 c1104160eq6 = this.LLIZ;
        if (c1104160eq6 != null) {
            synchronized (c1104160eq6) {
                c1104160eq6.LIZ.clear();
                c1104160eq6.LIZIZ.clear();
            }
        }
    }

    @Override // com.bytedance.android.livesdk.gift.base.platform.business.tray.AbsNormalGiftAnimWidget
    public final void y1() {
        C1135910ffJ c1135910ffJ = this.LLILLJJLI;
        if (c1135910ffJ != null) {
            C1134960fdm c1134960fdm = C1134980fdo.LIZ;
            c1134960fdm.LJFF += c1135910ffJ.LIZ.size();
            c1134960fdm.LIZLLL = c1134960fdm.LIZLLL;
            int i = c1134960fdm.LIZJ;
            c1134960fdm.LJ = c1134960fdm.LJ;
            c1134960fdm.LIZJ = i;
            c1135910ffJ.LJIILIIL();
            c1135910ffJ.LIZ.clear();
            c1135910ffJ.LIZIZ.clear();
            c1135910ffJ.LIZLLL.clear();
            c1135910ffJ.LJ.clear();
            C1136080ffa.LJII();
            c1135910ffJ.LJII = null;
        }
    }

    public static final boolean G1() {
        IInteractService iInteractService;
        return C1128450fTH.LJJIIJ() && (iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class)) != null && iInteractService.L6();
    }

    @Override // com.bytedance.android.livesdk.gift.base.platform.business.tray.AbsNormalGiftAnimWidget
    public final void A1(AssetMessage assetMessage) {
        if (assetMessage == null || assetMessage.assets == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("receiveAssetMessage. asset id = ");
        sbLIZ.append(assetMessage.assetId);
        C1133910fc5.LJI("AssetMessage", C2188811AlT.LIZIZ(sbLIZ));
        C1138360fjG c1138360fjGLIZLLL = C1140890fnL.LIZLLL();
        AssetsModel assetsModel = assetMessage.assets;
        c1138360fjGLIZLLL.getClass();
        C1138630fjh.LIZ.LIZ(assetsModel, false);
        C1135040fdu.LIZ.getClass();
        GiftMessage giftMessage = new GiftMessage();
        giftMessage.giftId = assetMessage.assetId;
        giftMessage.comboCount = 0;
        giftMessage.repeatCount = 0;
        giftMessage.fromUser = assetMessage.fromUser;
        giftMessage.toUser = assetMessage.toUser;
        giftMessage.LL = true;
        C1135810ff9 c1135810ff9 = new C1135810ff9(giftMessage);
        c1135810ff9.LJIIIIZZ = EnumC743790TFp.VIDEO_ONLY;
        c1135810ff9.LJJIII = C158B.LIZ();
        c1135810ff9.LJJIIJ = System.currentTimeMillis();
        c1135810ff9.LIZJ = true;
        C1133690fbj.LIZ.getClass();
        c1135810ff9.LIZLLL = C1133690fbj.LIZIZ(giftMessage);
        c1135810ff9.LJJJJIZL.LJFF(giftMessage);
        C1134970fdn.LIZIZ(c1135810ff9);
        if (!this.LL) {
            C1135910ffJ c1135910ffJ = this.LLILLJJLI;
            if (c1135910ffJ != null) {
                c1135910ffJ.LJIJ(c1135810ff9, false);
            }
            C1104160eq6 c1104160eq6 = this.LLIZ;
            if (c1104160eq6 != null) {
                synchronized (c1104160eq6) {
                    if (LiveGiftThroughputQueueSetting.INSTANCE.isEnabled()) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("msg arrival, ");
                        sbLIZ2.append(C13LP.LJJJLL(c1104160eq6.LIZ));
                        C1138230fj3.LIZJ("LiveGiftThroughputQueue", C2188811AlT.LIZIZ(sbLIZ2));
                        c1104160eq6.LIZ.add(Long.valueOf(C158B.LIZ()));
                    }
                }
                return;
            }
            return;
        }
        C1135790ff7.LJIIIIZZ(c1135810ff9, EnumC1133520fbS.SCREEN_CLEAR_MODE, EnumC1136250ffr.ENQUEUE);
    }

    @Override // com.bytedance.android.livesdk.gift.base.platform.business.tray.AbsNormalGiftAnimWidget
    public final void B1(GiftMessage giftMessage) {
        C1(giftMessage, null, null);
    }

    @Override // com.bytedance.android.livesdk.gift.base.platform.business.tray.AbsNormalGiftAnimWidget
    public final void D1(LiveTrayMessage liveTrayMessage) {
        C1135040fdu.LIZ.getClass();
        GiftMessage giftMessage = new GiftMessage();
        giftMessage.giftId = -999L;
        int i = liveTrayMessage.comboCount;
        giftMessage.comboCount = i;
        giftMessage.repeatCount = i;
        giftMessage.fromUser = liveTrayMessage.user;
        giftMessage.LLILLL = true;
        C1135810ff9 c1135810ff9 = new C1135810ff9(giftMessage);
        c1135810ff9.LJIIIIZZ = EnumC743790TFp.TRAY_ONLY;
        C1133690fbj c1133690fbj = C1133690fbj.LIZ;
        Text text = liveTrayMessage.title;
        c1133690fbj.getClass();
        c1135810ff9.LJJJJL = C1133690fbj.LIZJ(text);
        c1135810ff9.LJJJJLI = liveTrayMessage.image;
        c1135810ff9.LJJJJZI = liveTrayMessage.user;
        Text text2 = liveTrayMessage.describe;
        c1133690fbj.getClass();
        c1135810ff9.LJJJJLL = C1133690fbj.LIZJ(text2);
        c1135810ff9.LJJJLIIL = true;
        c1135810ff9.LJJJJIZL.LIZ = true;
        c1135810ff9.LJIIIZ = liveTrayMessage.comboCount;
        c1135810ff9.LJJIII = C158B.LIZ();
        C1134970fdn.LIZIZ(c1135810ff9);
        if (!this.LL) {
            C1135910ffJ c1135910ffJ = this.LLILLJJLI;
            if (c1135910ffJ != null) {
                c1135910ffJ.LJIJ(c1135810ff9, false);
                return;
            }
            return;
        }
        C1135790ff7.LJIIIIZZ(c1135810ff9, EnumC1133520fbS.SCREEN_CLEAR_MODE, EnumC1136250ffr.ENQUEUE);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        ViewGroup viewGroup;
        boolean zLJFF;
        EnumC1083260eIO enumC1083260eIO;
        C1134960fdm c1134960fdm = C1134980fdo.LIZ;
        c1134960fdm.LIZIZ = true;
        int marginStart = 0;
        c1134960fdm.LIZ = 0;
        c1134960fdm.LIZJ = 0;
        c1134960fdm.LIZLLL = 0;
        c1134960fdm.LJ = 0;
        c1134960fdm.LJFF = 0;
        c1134960fdm.LJI = 0;
        c1134960fdm.LJII = 0;
        c1134960fdm.LJIIIIZZ = 0;
        c1134960fdm.LJIIIZ = 0;
        c1134960fdm.LJIIJ = 0;
        c1134960fdm.LJIIJJI = 0;
        C1136080ffa.LJII();
        C1091250eVH c1091250eVH = (C1091250eVH) this.contentView.findViewById(R.id.ix8);
        this.LLILZLL = c1091250eVH;
        if (c1091250eVH != null) {
            c1091250eVH.setEnableSizeChange(true);
        }
        C1091250eVH c1091250eVH2 = this.LLILZLL;
        if (c1091250eVH2 != null) {
            c1091250eVH2.setEnableFixedSize(true);
        }
        LiveGiftReceivingRefactorSetting liveGiftReceivingRefactorSetting = LiveGiftReceivingRefactorSetting.INSTANCE;
        if (!liveGiftReceivingRefactorSetting.isEnableQueue()) {
            C1135910ffJ c1135910ffJ = new C1135910ffJ();
            this.LLILLJJLI = c1135910ffJ;
            c1135910ffJ.LIZJ = this.dataChannel;
        }
        this.LLILZ = new C1135930ffL();
        if (!liveGiftReceivingRefactorSetting.isEnableQueue()) {
            C1135910ffJ c1135910ffJ2 = this.LLILLJJLI;
            if (c1135910ffJ2 != null) {
                c1135910ffJ2.LJFF = this.LLILZ;
            }
            C1135930ffL c1135930ffL = this.LLILZ;
            if (c1135930ffL != null) {
                c1135930ffL.LIZ = c1135910ffJ2;
            }
        } else {
            InterfaceC1136220ffo interfaceC1136220ffo = this.LLILLL;
            if (interfaceC1136220ffo != null) {
                interfaceC1136220ffo.LIZLLL(this.LLILZ);
                C1135930ffL c1135930ffL2 = this.LLILZ;
                if (c1135930ffL2 != null) {
                    c1135930ffL2.LIZIZ = interfaceC1136220ffo;
                }
            }
        }
        C1135930ffL c1135930ffL3 = this.LLILZ;
        C1091250eVH c1091250eVH3 = null;
        if (c1135930ffL3 != null) {
            DataChannel dataChannel = this.dataChannel;
            c1135930ffL3.LJ = dataChannel;
            if (dataChannel != null) {
                enumC1083260eIO = (EnumC1083260eIO) dataChannel.gg0(LiveExtendedScreenStatus.class);
            } else {
                enumC1083260eIO = null;
            }
            c1135930ffL3.LJIIIZ = enumC1083260eIO;
            if (dataChannel != null) {
                dataChannel.gg0(LiveExtendedScreenType.class);
            }
            c1135930ffL3.LJIILIIL();
            if (dataChannel != null) {
                dataChannel.BQ2(this, LiveExtendedScreenStatus.class, new AwS596S0100000_17(c1135930ffL3, 704));
                dataChannel.BQ2(this, LiveExtendedScreenType.class, new AwS596S0100000_17(c1135930ffL3, 706));
            }
        }
        this.LLIZ = new C1104160eq6();
        C1135930ffL c1135930ffL4 = this.LLILZ;
        if (c1135930ffL4 != null) {
            C1091250eVH c1091250eVH4 = this.LLILZLL;
            if (c1091250eVH4 instanceof ViewGroup) {
                c1091250eVH3 = c1091250eVH4;
            }
            DataChannel dataChannel2 = this.dataChannel;
            if (dataChannel2 != null) {
                zLJFF = Intrinsics.LJFF(dataChannel2.gg0(C0TZJ.class), Boolean.TRUE);
            } else {
                zLJFF = false;
            }
            c1135930ffL4.LJIILL(c1091250eVH3, zLJFF, this.LLIZ, false);
        }
        C1135930ffL c1135930ffL5 = this.LLILZ;
        if (c1135930ffL5 != null && (viewGroup = c1135930ffL5.LIZLLL) != null) {
            HandlerHook.viewPost(viewGroup, new ARunnableS112S0100000_12(c1135930ffL5, 496));
        }
        C1131800fYg.LIZ.getClass();
        if (LiveInnerDowngradeAdaptExp.INSTANCE.getExpValue().getGiftTrayComboDowngrade()) {
            ((IPTFService) C1161920gLG.LIZJ(IPTFService.class)).FA2(EnumC1101430elh.GIFT_TRAY_COMBO_DOWNGRADE, new InterfaceC482090IvP() { // from class: X.0fZ5
                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.InterfaceC482090IvP
                public final void LIZ(C0IS4 c0is4) {
                    boolean z;
                    if (((Number) c0is4.LIZ).intValue() != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C1131800fYg.LIZIZ = z;
                }
            });
        }
        C01R9.LIZ.getClass();
        IInteractService iInteractService = C1128450fTH.LIZ;
        C1128450fTH.LIZ.m00("gift_sync_sei", new WeakReference<>(C01R9.LIZIZ));
        if (!liveGiftReceivingRefactorSetting.isEnableQueue()) {
            if (GiftReceiveFlowFluencyOptSetting.INSTANCE.getEnabled()) {
                C1137480fhq c1137480fhq = C1137480fhq.LIZ;
                WeakReference<InterfaceC1137720fiE> weakReference = new WeakReference<>(this.LLILLJJLI);
                c1137480fhq.getClass();
                C1137480fhq.LIZJ = weakReference;
            } else {
                C1137480fhq c1137480fhq2 = C1137480fhq.LIZ;
                C1135910ffJ c1135910ffJ3 = this.LLILLJJLI;
                c1137480fhq2.getClass();
                C1137480fhq.LIZIZ = c1135910ffJ3;
            }
        }
        this.LLILZIL.LIZ(((C0J1N) C784440Upu.LIZ().LJ(C473130Igx.class).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LJ(this))).LIZJ(new AfS186S0100000_17(this, 197)));
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            dataChannel3.EQ2(this, CoHostAndMultiGuestSceneGiftPanelChangeChannel.class, new AwS596S0100000_17(this, 712));
        }
        DataChannel dataChannel4 = this.dataChannel;
        if (dataChannel4 != null) {
            dataChannel4.EQ2(this, CohostGuestListChangeChannel.class, new AwS596S0100000_17(this, 713));
        }
        DataChannel dataChannel5 = this.dataChannel;
        if (dataChannel5 != null) {
            dataChannel5.EQ2(this, LinkCrossRoomStateChangeEvent.class, new AwS596S0100000_17(this, 703));
        }
        if (C497740JfY.LJJ()) {
            C1091250eVH c1091250eVH5 = this.LLILZLL;
            if (c1091250eVH5 != null) {
                ViewGroup.LayoutParams layoutParams = c1091250eVH5.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginStart = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
                }
            }
            this.LLIZLLLIL = marginStart;
            DataChannel dataChannel6 = this.dataChannel;
            if (dataChannel6 != null) {
                dataChannel6.EQ2(this, LinkCrossRoomStateChangeEvent.class, new AwS596S0100000_17(this, 705));
            }
        }
        C1091250eVH c1091250eVH6 = this.LLILZLL;
        if (c1091250eVH6 != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1091250eVH6);
            c1091250eVH6.setAlpha(1.0f);
        }
    }

    @Override // com.bytedance.android.livesdk.gift.base.platform.business.tray.AbsNormalGiftAnimWidget
    public final void x1(C1135920ffK c1135920ffK) {
        C1135930ffL c1135930ffL;
        this.LLILLL = c1135920ffK;
        if (c1135920ffK != null && (c1135930ffL = this.LLILZ) != null) {
            c1135920ffK.LJIIIIZZ = c1135930ffL;
            c1135930ffL.LIZIZ = c1135920ffK;
        }
    }

    @Override // com.bytedance.android.livesdk.gift.base.platform.business.tray.AbsNormalGiftAnimWidget
    public final void z1(Function1<? super GiftMessage, Boolean> function1) {
        C1135910ffJ c1135910ffJ = this.LLILLJJLI;
        if (c1135910ffJ != null) {
            Iterator<C1135810ff9> it2 = c1135910ffJ.LIZIZ.iterator();
            while (it2.hasNext()) {
                GiftMessage giftMessage = it2.next().LIZ;
                if (giftMessage != null && function1.invoke(giftMessage).booleanValue()) {
                    return;
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdk.gift.base.platform.business.tray.AbsNormalGiftAnimWidget
    public final void C1(GiftMessage giftMessage, C1135280feI c1135280feI, ConcurrentHashMap<String, String> concurrentHashMap) {
        long ownerUserId;
        boolean z;
        long jLIZ;
        Integer numValueOf;
        if (giftMessage != null) {
            Room room = null;
            if (LiveGiftCrossScreenSetting.INSTANCE.shouldIgnoreExtraTrays()) {
                List listLJIIJJI = C1697810uHb.LJIIJJI(1, 3);
                GiftMessage.InteractiveGiftInfo interactiveGiftInfo = giftMessage.interactiveGiftInfo;
                if (interactiveGiftInfo != null) {
                    numValueOf = Integer.valueOf(interactiveGiftInfo.ignoreConfig);
                } else {
                    numValueOf = null;
                }
                if (C13LP.LJJJJ(numValueOf, listLJIIJJI)) {
                    C1136370fg3.LIZ.getClass();
                    C1136370fg3.LJI(giftMessage, "component");
                    return;
                }
            }
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                room = (Room) dataChannel.gg0(RoomChannel.class);
            }
            C1135040fdu c1135040fdu = C1135040fdu.LIZ;
            if (room != null) {
                ownerUserId = room.getOwnerUserId();
            } else {
                ownerUserId = 0;
            }
            c1135040fdu.getClass();
            C1135810ff9 c1135810ff9 = new C1135810ff9(giftMessage);
            C1133690fbj.LIZ.getClass();
            c1135810ff9.LIZLLL = C1133690fbj.LIZIZ(giftMessage);
            if (ownerUserId == UserService.getInstance().user().getCurrentUserId()) {
                z = true;
            } else {
                z = false;
            }
            c1135810ff9.LJJJJL = C0KVU.LIZ(giftMessage.fromUser);
            boolean z2 = giftMessage.LLILLL;
            c1135810ff9.LJJJLIIL = z2;
            c1135810ff9.LJJJJIZL.LIZ = z2;
            c1135810ff9.LJJJLL = z;
            c1135810ff9.LJIIIZ = giftMessage.comboCount;
            c1135810ff9.LJJJJLL = C1135040fdu.LIZIZ(giftMessage, ownerUserId, room);
            c1135810ff9.LJ = C1133680fbi.LIZ(giftMessage);
            CommonMessageData commonMessageData = giftMessage.baseMessage;
            if (commonMessageData != null) {
                jLIZ = commonMessageData.createTime;
            } else {
                jLIZ = C158B.LIZ();
            }
            c1135810ff9.LJJIII = jLIZ;
            c1135810ff9.LJJIIJ = jLIZ;
            c1135810ff9.LJJJJIZL.LJFF(giftMessage);
            C1134970fdn.LIZIZ(c1135810ff9);
            c1135810ff9.LJJLIIJ = c1135280feI;
            c1135810ff9.LJJLIL = concurrentHashMap;
            c1135810ff9.LJJLJ = true;
            if (!this.LL) {
                C1135910ffJ c1135910ffJ = this.LLILLJJLI;
                if (c1135910ffJ != null) {
                    c1135910ffJ.LJIJ(c1135810ff9, false);
                }
                C1104160eq6 c1104160eq6 = this.LLIZ;
                if (c1104160eq6 != null) {
                    synchronized (c1104160eq6) {
                        if (LiveGiftThroughputQueueSetting.INSTANCE.isEnabled()) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("msg arrival, ");
                            sbLIZ.append(C13LP.LJJJLL(c1104160eq6.LIZ));
                            C1138230fj3.LIZJ("LiveGiftThroughputQueue", C2188811AlT.LIZIZ(sbLIZ));
                            c1104160eq6.LIZ.add(Long.valueOf(C158B.LIZ()));
                        }
                    }
                    return;
                }
                return;
            }
            C1135790ff7.LJIIIIZZ(c1135810ff9, EnumC1133520fbS.SCREEN_CLEAR_MODE, EnumC1136250ffr.ENQUEUE);
        }
    }
}
