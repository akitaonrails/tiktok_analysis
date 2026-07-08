package com.ss.android.ugc.aweme.live.root.tab.room.skylight;

import X.C09AY;
import X.C0IEG;
import X.C0PEM;
import X.C1AF0;
import X.C2188811AlT;
import X.C23250099c;
import X.C2450709iz;
import X.C356901a3;
import X.C472280Ifa;
import X.C476830Imv;
import X.C477210InX;
import X.C794260VDs;
import X.C817503Hh;
import X.EnumC471720Ieg;
import X.EnumC471750Iej;
import X.EnumC471790Ien;
import X.EnumC473310IhF;
import X.InterfaceC475140IkC;
import X.InterfaceC475300IkS;
import X.InterfaceC476860Imy;
import X.InterfaceC477100InM;
import X.InterfaceC477170InT;
import X.InterfaceC477230InZ;
import X.InterfaceC479780Irg;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.feed.api.TopLiveSkylightVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.TopLiveSkylightTransYChannel;
import com.bytedance.android.livesdk.livesetting.skylight.LiveTopLiveNotificationSetting;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.live.toplives.notifications.LiveNotificationFragment;
import webcast.api.feed.TopliveNoticeUnreadCountData;

/* JADX INFO: loaded from: classes8.dex */
public class SkylightController implements DefaultLifecycleObserver, GenericLifecycleObserver {
    public static final String LLJJI = SkylightController.class.getName();
    public C476830Imv LL;
    public InterfaceC476860Imy LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public final InterfaceC479780Irg<?> LLILZLL;
    public C472280Ifa LLIZ;
    public final LifecycleOwner LLIZLLLIL;
    public final InterfaceC475300IkS LLJ;
    public final InterfaceC477100InM LLJJ;
    public final BPEAHandler LLILZIL = new BPEAHandler(Looper.myLooper());
    public boolean LLJI = false;
    public C09AY LLJIJIL = null;
    public boolean LLJILJIL = false;
    public View LLJILJILJ = null;
    public InterfaceC477170InT LLJILLL = null;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    public final C0IEG LIZ() {
        return this.LLJ.LJIILLIIL();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(com.bytedance.android.livesdkapi.session.EnterRoomConfig r6) {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.root.tab.room.skylight.SkylightController.LIZIZ(com.bytedance.android.livesdkapi.session.EnterRoomConfig):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01f5  */
    /* JADX WARN: Type inference failed for: r0v50, types: [X.0Imx] */
    /* JADX WARN: Type inference failed for: r1v13, types: [X.0IVA, X.0InH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(com.bytedance.android.livesdkapi.session.EnterRoomConfig r13) {
        /*
            Method dump skipped, instruction units count: 773
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.root.tab.room.skylight.SkylightController.LIZJ(com.bytedance.android.livesdkapi.session.EnterRoomConfig):void");
    }

    public final void LJ(EnumC471750Iej enumC471750Iej) {
        InterfaceC477100InM interfaceC477100InM;
        InterfaceC476860Imy interfaceC476860Imy = this.LLILLJJLI;
        if (interfaceC476860Imy != null && !interfaceC476860Imy.LIZLLL() && !this.LLILLJJLI.LJI() && (interfaceC477100InM = this.LLJJ) != null && interfaceC477100InM.getPage() == EnumC471790Ien.ROOM) {
            this.LLILLJJLI.LJIJ(enumC471750Iej);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        InterfaceC475140IkC interfaceC475140IkCLJ;
        try {
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            dataChannelGlobal.HQ2(TopLiveSkylightTransYChannel.class, Float.valueOf(0.0f));
            dataChannelGlobal.HQ2(TopLiveSkylightVisibilityChannel.class, Boolean.FALSE);
            InterfaceC476860Imy interfaceC476860Imy = this.LLILLJJLI;
            if (interfaceC476860Imy != null) {
                interfaceC476860Imy.LJII();
            }
            C476830Imv c476830Imv = this.LL;
            if (c476830Imv != null && (interfaceC475140IkCLJ = c476830Imv.LJ()) != null) {
                interfaceC475140IkCLJ.LJI("onDestroy");
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C794260VDs.LIZJ(C2450709iz.LIZLLL(this.LLILZLL.U6()));
            String strLJFF = C2450709iz.LJFF(this.LLILZLL.U6());
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("LIVE_PLAY_ON_DESTROY:");
            sbLIZ.append(strLJFF);
            C1AF0.LJFF(th, C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LLILZIL.removeCallbacksAndMessages(null);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
        InterfaceC475140IkC interfaceC475140IkCLJ;
        InterfaceC476860Imy interfaceC476860Imy = this.LLILLJJLI;
        if (interfaceC476860Imy != null) {
            interfaceC476860Imy.LJII();
        }
        C476830Imv c476830Imv = this.LL;
        if (c476830Imv != null && (interfaceC475140IkCLJ = c476830Imv.LJ()) != null) {
            interfaceC475140IkCLJ.LJI("onPause");
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        if (this.LLILLJJLI != null) {
            InterfaceC477100InM interfaceC477100InM = this.LLJJ;
            if (interfaceC477100InM != null && interfaceC477100InM.getPage() == EnumC471790Ien.ROOM) {
                this.LLILLJJLI.LJIIJJI(this.LLILZLL.xL(), true, EnumC471720Ieg.TOP_LIVE);
            }
            if (LIZ() != null && LIZ().getCurrentFragment() != null) {
                LIZLLL(EnumC473310IhF.RESUME, LIZ().getCurrentFragment().Eq());
            }
            if (LiveNotificationFragment.LLJJI) {
                LiveNotificationFragment.LLJJI = false;
                InterfaceC477230InZ interfaceC477230InZ = new InterfaceC477230InZ() { // from class: X.0In6
                    @Override // X.InterfaceC477230InZ
                    public final void LIZ(TopliveNoticeUnreadCountData topliveNoticeUnreadCountData) {
                        boolean z;
                        C476830Imv c476830Imv = this.LIZ.LL;
                        boolean z2 = true;
                        if (c476830Imv != null) {
                            if (topliveNoticeUnreadCountData.unreadCount > 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            C477430Int c477430Int = c476830Imv.LJIJJ;
                            if (c477430Int != null) {
                                C477400Inq c477400Inq = (C477400Inq) c477430Int.LIZIZ.getValue();
                                if (z) {
                                    C339190DRl.LIZLLL(c477400Inq.getAlertDot());
                                } else {
                                    C339190DRl.LIZIZ(c477400Inq.getAlertDot());
                                }
                            }
                        }
                        InterfaceC475300IkS interfaceC475300IkS = this.LIZ.LLJ;
                        if (interfaceC475300IkS != null && interfaceC475300IkS.LIZLLL() != null && this.LIZ.LLJ.LIZLLL().getVisibility() == 0) {
                            C477070InJ c477070InJLIZLLL = this.LIZ.LLJ.LIZLLL();
                            if (topliveNoticeUnreadCountData.unreadCount <= 0) {
                                z2 = false;
                            }
                            C477400Inq liveNotificationBell = c477070InJLIZLLL.getLiveNotificationBell();
                            if (liveNotificationBell != null) {
                                if (z2) {
                                    C339190DRl.LIZLLL(liveNotificationBell.getAlertDot());
                                } else {
                                    C339190DRl.LIZIZ(liveNotificationBell.getAlertDot());
                                }
                            }
                        }
                    }
                };
                if (LiveTopLiveNotificationSetting.INSTANCE.getEnable()) {
                    C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C477210InX(interfaceC477230InZ, null), 2);
                }
            }
        }
    }

    public final void LIZLLL(EnumC473310IhF enumC473310IhF, EnterRoomConfig enterRoomConfig) {
        C476830Imv c476830Imv;
        InterfaceC475140IkC interfaceC475140IkCLJ;
        EnumC471720Ieg enumC471720Ieg;
        InterfaceC477100InM interfaceC477100InM = this.LLJJ;
        if ((interfaceC477100InM == null || interfaceC477100InM.getPage() != EnumC471790Ien.NEARBY) && (c476830Imv = this.LL) != null && (interfaceC475140IkCLJ = c476830Imv.LJ()) != null) {
            InterfaceC477100InM interfaceC477100InM2 = this.LLJJ;
            if (interfaceC477100InM2 != null && interfaceC477100InM2.getPage() == EnumC471790Ien.ROOM) {
                enumC471720Ieg = EnumC471720Ieg.TOP_LIVE;
            } else {
                enumC471720Ieg = EnumC471720Ieg.NEARBY_PAGE;
            }
            Context contextJh = this.LLILZLL.Jh();
            EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
            interfaceC475140IkCLJ.LIZLLL(contextJh, enumC471720Ieg, enumC473310IhF, roomsData.enterFromMerge, roomsData.enterMethod, enterRoomConfig.drawParams.openLiveFromDrawer);
        }
    }

    public SkylightController(InterfaceC479780Irg interfaceC479780Irg, LifecycleOwner lifecycleOwner, InterfaceC475300IkS interfaceC475300IkS, InterfaceC477100InM interfaceC477100InM) {
        this.LLILZLL = interfaceC479780Irg;
        this.LLIZLLLIL = lifecycleOwner;
        lifecycleOwner.getLifecycle().addObserver(this);
        this.LLJ = interfaceC475300IkS;
        this.LLJJ = interfaceC477100InM;
    }
}
