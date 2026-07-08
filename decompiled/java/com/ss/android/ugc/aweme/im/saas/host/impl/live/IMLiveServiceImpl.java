package com.ss.android.ugc.aweme.im.saas.host.impl.live;

import X.C098200Yq;
import X.C09C2;
import X.C0IVT;
import X.C0J5O;
import X.C0J7X;
import X.C0JG5;
import X.C0K77;
import X.C11IR;
import X.C11NZ;
import X.C1440005kM;
import X.C16E3;
import X.C189200o6;
import X.C1908030zkf;
import X.C1ACD;
import X.C292940Be0;
import X.C293020Be8;
import X.C486660J6q;
import X.C830490Whz;
import X.C901730ZZb;
import X.EnumC1913520ztW;
import X.InterfaceC20314214eC;
import X.InterfaceC20673515v3;
import X.InterfaceC2175541ACi;
import X.InterfaceC2183451Acp;
import Y.AObserverS178S0200000_14;
import Y.AObserverS208S0100000_4;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.bytedance.android.live.settings.LiveChatListAddLivePreviewSetting;
import com.bytedance.android.live.settings.LiveChatListNeverHideCoverSetting;
import com.bytedance.android.live.settings.LiveChatListPlayerDelayTimeSetting;
import com.bytedance.android.live.settings.LiveChatListPlayerReuseEnableSetting;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.live.NewLiveRoomStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.chatroom.common.titlebar.SingleTitleBarCenterAssem;
import com.ss.android.ugc.aweme.im.saas.host.api.live.IMLiveService;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.liveevent.ILiveEventOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes32.dex */
public final class IMLiveServiceImpl implements IMLiveService {
    @Override // com.ss.android.ugc.aweme.im.saas.host.api.live.IMLiveService
    public final Boolean LIZ() {
        C0K77 c0k77C3;
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService == null || (c0k77C3 = iLiveOuterService.C3()) == null) {
            return null;
        }
        return Boolean.valueOf(c0k77C3.LIZ());
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.live.IMLiveService
    public final boolean LIZIZ() {
        InterfaceC20314214eC interfaceC20314214eCE4;
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService != null && (interfaceC20314214eCE4 = iLiveOuterService.e4()) != null) {
            interfaceC20314214eCE4.LIZIZ();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.live.IMLiveService
    public final String LJ() {
        String strLJ;
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        return (iLiveOuterService == null || (strLJ = iLiveOuterService.LJ()) == null) ? "" : strLJ;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.live.IMLiveService
    public final boolean LJIIIIZZ() {
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        return (iLiveOuterService == null || iLiveOuterService.k4() == null) ? false : true;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.live.IMLiveService
    public final boolean LJIIIZ() {
        return LiveChatListAddLivePreviewSetting.INSTANCE.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.live.IMLiveService
    public final boolean LJIIJJI() {
        return LiveChatListPlayerReuseEnableSetting.INSTANCE.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.live.IMLiveService
    public final void LJIIL() {
        C1440005kM.LIZ(C0JG5.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.live.IMLiveService
    public final boolean LJIILIIL() {
        return ((Number) C293020Be8.LIZ.getValue()).intValue() != 0;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.live.IMLiveService
    public final long LJIIZILJ() {
        return LiveChatListPlayerDelayTimeSetting.INSTANCE.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.live.IMLiveService
    public final boolean LJIJ() {
        return LiveChatListNeverHideCoverSetting.INSTANCE.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.live.IMLiveService
    public final boolean enableCreateLiveEventInGroupChat() {
        ILiveEventOuterService iLiveEventOuterServiceK5;
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService == null || (iLiveEventOuterServiceK5 = iLiveOuterService.K5()) == null) {
            return false;
        }
        return iLiveEventOuterServiceK5.enableCreateLiveEventInGroupChat();
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.live.IMLiveService
    public final void isEnableLive() {
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.live.IMLiveService
    public final String LJII(String str) {
        return ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LJJJJZ(str);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.live.IMLiveService
    public final void LJIILL(C830490Whz c830490Whz) {
        C486660J6q.LJIIJ(c830490Whz);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.live.IMLiveService
    public final C16E3 LJIILLIIL(final C901730ZZb c901730ZZb) {
        C1ACD c1acdGenerateLivePlayHelper;
        InterfaceC2175541ACi interfaceC2175541ACi = new InterfaceC2175541ACi() { // from class: X.14fQ
            @Override // X.InterfaceC2175541ACi
            public final Integer Dk() {
                return null;
            }

            @Override // X.InterfaceC2175541ACi
            public final boolean LLILLIZIL() {
                return false;
            }

            @Override // X.InterfaceC2175541ACi
            public final void LLLIL() {
            }

            @Override // X.InterfaceC2175541ACi
            public final void LLLLJ(EnumC1913550ztZ enumC1913550ztZ, Object obj) {
            }

            @Override // X.InterfaceC2175541ACi
            public final void LLLLLLIL() {
            }

            @Override // X.InterfaceC2175541ACi
            public final Object Md() {
                return null;
            }

            @Override // X.InterfaceC2175541ACi
            public final void T5() {
            }

            @Override // X.InterfaceC2175541ACi
            public final boolean U1() {
                return true;
            }

            @Override // X.InterfaceC2175541ACi
            public final boolean We() {
                return false;
            }

            @Override // X.InterfaceC2175541ACi
            public final Object Y7() {
                return null;
            }

            @Override // X.InterfaceC2175541ACi
            /* JADX INFO: renamed from: if */
            public final void mo29if(String str) {
            }

            @Override // X.InterfaceC2175541ACi
            public final void o() {
            }

            @Override // X.InterfaceC2175541ACi
            public final void oc(C945320ahu c945320ahu) {
            }

            @Override // X.InterfaceC2175541ACi
            public final void oe(String str) {
            }

            @Override // X.InterfaceC2175541ACi
            public final void sk(String str) {
            }

            @Override // X.InterfaceC2175541ACi
            public final void v() {
                c901730ZZb.v();
            }

            @Override // X.InterfaceC2175541ACi
            public final void w9(String str) {
                c901730ZZb.w();
            }

            @Override // X.InterfaceC2175541ACi
            public final void Th(int i, int i2, View view) {
                c901730ZZb.LIZ(i, i2);
            }
        };
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService != null) {
            c1acdGenerateLivePlayHelper = iLiveOuterService.generateLivePlayHelper(interfaceC2175541ACi, EnumC1913520ztW.SEARCH);
        } else {
            c1acdGenerateLivePlayHelper = null;
        }
        return new C16E3(c1acdGenerateLivePlayHelper);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.live.IMLiveService
    public final C11NZ LJFF(long j, String str) {
        InterfaceC20673515v3 interfaceC20673515v3K4;
        C11NZ c11nzLJJZ;
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService == null || (interfaceC20673515v3K4 = iLiveOuterService.k4()) == null || (c11nzLJJZ = interfaceC20673515v3K4.LJJZ(j, str)) == null) {
            return C11IR.LL;
        }
        return c11nzLJJZ;
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.live.IMLiveService
    public final boolean LJIIJ(String str, String str2) {
        return C1908030zkf.LJ(str, str2);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.live.IMLiveService
    public final void LJI(Context context, TuxTextView tuxTextView, boolean z) {
        C1908030zkf.LIZ.getClass();
        C1908030zkf.LJFF(context, tuxTextView, z, null);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.live.IMLiveService
    public final void LJIILJJIL(long j, Context context, String str) {
        C0J5O c0j5oZ5;
        Unit unit;
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
        roomsData.roomId = j;
        roomsData.enterFromMerge = "chat";
        roomsData.enterMethod = "chat_head";
        roomsData.actionType = "click";
        if (((Boolean) C292940Be0.LIZ.getValue()).booleanValue()) {
            if (str == null) {
                unit = null;
            } else {
                try {
                    C0IVT.LIZJ((SlimRoom) C09C2.LIZ().LJII(str, SlimRoom.class), enterRoomConfig);
                    unit = Unit.LIZ;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
            C189200o6.m2constructorimpl(unit);
        }
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService != null && (c0j5oZ5 = iLiveOuterService.z5()) != null) {
            c0j5oZ5.watchLive(context, enterRoomConfig);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.live.IMLiveService
    public final void LJIJI(String str, SingleTitleBarCenterAssem singleTitleBarCenterAssem, AObserverS178S0200000_14 aObserverS178S0200000_14) {
        C0J7X c0j7xK3;
        AObserverS208S0100000_4 aObserverS208S0100000_4 = new AObserverS208S0100000_4(aObserverS178S0200000_14, this, 12);
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService != null && (c0j7xK3 = iLiveOuterService.k3()) != null) {
            c0j7xK3.LIZJ(str, singleTitleBarCenterAssem, aObserverS208S0100000_4);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.live.IMLiveService
    public final void i3(long j, Function0 function0, Function1 function1) {
        InterfaceC2183451Acp interfaceC2183451AcpX3;
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService != null && (interfaceC2183451AcpX3 = iLiveOuterService.X3()) != null) {
            interfaceC2183451AcpX3.i3(j, function0, function1);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.live.IMLiveService
    public final void LIZJ(Context context, User user, NewLiveRoomStruct newLiveRoomStruct, Bundle bundle) {
        C0J5O c0j5oZ5;
        ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
        if (iLiveOuterService != null && (c0j5oZ5 = iLiveOuterService.z5()) != null) {
            c0j5oZ5.LIZJ(context, user, newLiveRoomStruct, bundle);
        }
    }
}
