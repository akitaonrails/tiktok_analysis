package com.bytedance.android.livesdk.game.partnership.widget;

import X.AbstractC1387200mCc;
import X.C01GW;
import X.C020Z;
import X.C098200Yq;
import X.C09AE;
import X.C09R3;
import X.C0IJT;
import X.C0IXW;
import X.C1105940esy;
import X.C1161920gLG;
import X.C13LE;
import X.C1548820qPI;
import X.C168K;
import X.C1697810uHb;
import X.C1784380wXE;
import X.C1869740yku;
import X.C1870140ylY;
import X.C1870150ylZ;
import X.C1871910yoP;
import X.C1878380yyq;
import X.C1878390yyr;
import X.C1878400yys;
import X.C1878410yyt;
import X.C1878430yyv;
import X.C1881050z39;
import X.C189200o6;
import X.C19EG;
import X.C19ME;
import X.C20441214yg;
import X.C204600qa;
import X.C204800qc;
import X.C2188811AlT;
import X.C2217371BqR;
import X.C23250099c;
import X.C262100zr;
import X.C452501pT;
import X.C473410IhP;
import X.C474500IjA;
import X.C497740JfY;
import X.C500260Jjc;
import X.C520040KaQ;
import X.C781520UlC;
import X.C786410Ut5;
import X.C789300Uxk;
import X.C789310Uxl;
import X.C805330ViV;
import X.C817503Hh;
import X.InterfaceC1107590evd;
import X.InterfaceC1141530foN;
import X.InterfaceC1878370yyp;
import X.InterfaceC2217461Bqa;
import Y.ARunnableS124S0100000_24;
import Y.ARunnableS30S1200000_27;
import Y.ARunnableS31S1100000_27;
import android.content.Context;
import android.os.Looper;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.android.livesdk.dataChannel.HighPrioritySlotVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.HighPriorityTooltipVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.LockScreenChannel;
import com.bytedance.android.livesdk.game.model.BriefGame;
import com.bytedance.android.livesdk.game.model.BriefGameTask;
import com.bytedance.android.livesdk.game.model.DropsRoomInfo;
import com.bytedance.android.livesdk.game.model.GameCTAInfo;
import com.bytedance.android.livesdk.game.model.PartnershipTask;
import com.bytedance.android.livesdk.game.model.UserInfo;
import com.bytedance.android.livesdk.livesetting.game.partnership.GameLivePartnershipGameCardShowConfig;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.RecycleSource;
import com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import com.zhiliaoapp.musically.R;
import java.net.URLDecoder;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.AwS9S3100000_28;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import qo2.w;
import webcast.api.partnership.AudienceRoomInfoResponse;

/* JADX INFO: loaded from: classes29.dex */
public final class GamePartnershipGamePinCardWidget extends RoomRecycleWidget implements InterfaceC1141530foN, OnIMMessageListener {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJ;
    public FrameLayout LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public Room LLILZ;
    public IMessageManager LLILZLL;
    public AudienceRoomInfoResponse.EsportsBriefTournamentInfo LLJIJIL;
    public UserInfo LLJILJIL;
    public boolean LLJJ;
    public C1878380yyq LLJJI;
    public final BPEAHandler LLILZIL = new BPEAHandler(Looper.getMainLooper());
    public long LLIZ = System.currentTimeMillis();
    public final C1878410yyt LLIZLLLIL = new C1878410yyt(C204600qa.class);
    public long LLJ = System.currentTimeMillis();
    public long LLJI = -1;
    public final C1878390yyr LLJILJILJ = new C1878390yyr();
    public final C01GW LLJILLL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(46));
    public String LLJJIII = "";
    public final C1878410yyt LLJJIJI = new C1878410yyt(C805330ViV.class);
    public final C1878410yyt LLJJIJIIJIL = new C1878410yyt(C789300Uxk.class);
    public final C1878410yyt LLJJIJIL = new C1878410yyt(C789310Uxl.class);
    public final C1878410yyt LLJJJ = new C1878410yyt(C204800qc.class);
    public final C1878410yyt LLJJJIL = new C1878410yyt(C1870140ylY.class);

    static {
        C2217371BqR c2217371BqR = new C2217371BqR(GamePartnershipGamePinCardWidget.class, "gameTaskRawJsonData", "getGameTaskRawJsonData()Lcom/bytedance/android/livesdk/game/partnership/widget/GameTaskRawJsonData;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217371BqR c2217371BqR2 = new C2217371BqR(GamePartnershipGamePinCardWidget.class, "timeOutReplayCardTask", "getTimeOutReplayCardTask()Lcom/bytedance/android/livesdk/game/partnership/widget/TimeOutReplayCardJob;", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR3 = new C2217371BqR(GamePartnershipGamePinCardWidget.class, "updateDownloadedCount", "getUpdateDownloadedCount()Lcom/bytedance/android/livesdk/game/partnership/widget/UpdateDownloadedCount;", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR4 = new C2217371BqR(GamePartnershipGamePinCardWidget.class, "cardCloseRunnable", "getCardCloseRunnable()Lcom/bytedance/android/livesdk/game/partnership/widget/CloseCardRunnable;", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR5 = new C2217371BqR(GamePartnershipGamePinCardWidget.class, "pendingShowDropsTask", "getPendingShowDropsTask()Lcom/bytedance/android/livesdk/game/partnership/widget/RoomNextShowingDropsData;", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR6 = new C2217371BqR(GamePartnershipGamePinCardWidget.class, "currentRoomShowingGameTask", "getCurrentRoomShowingGameTask()Lcom/bytedance/android/livesdk/game/partnership/widget/RoomShowingGameTask;", 0);
        c09r3.getClass();
        LLJJJJ = new InterfaceC2217461Bqa[]{c2217371BqR, c2217371BqR2, c2217371BqR3, c2217371BqR4, c2217371BqR5, c2217371BqR6};
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hz5;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final String messageListenerBizTag() {
        return "game_partnership";
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return false;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void A1() {
        C805330ViV c805330ViVD1;
        C09AE c09ae;
        C09AE c09ae2;
        C20441214yg.LIZIZ("PartnershipAudience", "closeTimeOutReplayCardJob");
        if (D1() == null) {
            return;
        }
        C805330ViV c805330ViVD12 = D1();
        if (((c805330ViVD12 == null || (c09ae2 = c805330ViVD12.LIZIZ) == null || c09ae2.isCancelled()) ? false : true) && (c805330ViVD1 = D1()) != null && (c09ae = c805330ViVD1.LIZIZ) != null) {
            c09ae.LIZIZ(null);
        }
        C1878410yyt c1878410yyt = this.LLJJIJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        c1878410yyt.LIZIZ(null);
    }

    public final C1870140ylY C1() {
        C1878410yyt c1878410yyt = this.LLJJJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        return (C1870140ylY) c1878410yyt.LIZ();
    }

    public final C805330ViV D1() {
        C1878410yyt c1878410yyt = this.LLJJIJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        return (C805330ViV) c1878410yyt.LIZ();
    }

    public final C789300Uxk E1() {
        C1878410yyt c1878410yyt = this.LLJJIJIIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        return (C789300Uxk) c1878410yyt.LIZ();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        C20441214yg.LIZIZ("PartnershipAudience", "show");
        super.show();
    }

    public final void x1() {
        String str;
        C1878410yyt c1878410yyt = this.LLJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        C204800qc c204800qc = (C204800qc) c1878410yyt.LIZ();
        if (c204800qc == null || (str = c204800qc.LIZ) == null) {
            str = "";
        }
        if (str.length() <= 0 || str.length() <= 3) {
            return;
        }
        this.LLJJJ.LIZIZ(null);
        C786410Ut5.LJJZZIII(this.LLILZIL, new ARunnableS31S1100000_27(this, str, 0));
    }

    public final void z1() {
        H1("conflict");
        y1("conflict");
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
    public final IMListenerType messageListenerType() {
        return IMListenerType.ASYNC;
    }

    public final void H1(String str) {
        String str2;
        String str3;
        Long l;
        String str4;
        String str5;
        BriefGame briefGame;
        BriefGame briefGame2;
        C1870140ylY c1870140ylYC1 = C1();
        if (c1870140ylYC1 != null && c1870140ylYC1.LIZ.LIZ == 0) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gamepad_module_duration");
            c474500IjALIZ.LJIJJLI(this.dataChannel);
            if (C0IXW.LIZLLL(this.dataChannel)) {
                str2 = "ad";
            } else {
                str2 = "normal";
            }
            c474500IjALIZ.LJJII(str2, "live_traffic_source");
            BriefGameTask briefGameTask = c1870140ylYC1.LIZ.LJ;
            String str6 = null;
            if (briefGameTask != null && (briefGame2 = briefGameTask.briefGame) != null) {
                str3 = briefGame2.name;
            } else {
                str3 = null;
            }
            c474500IjALIZ.LJJII(str3, "game_name");
            BriefGameTask briefGameTask2 = c1870140ylYC1.LIZ.LJ;
            if (briefGameTask2 != null && (briefGame = briefGameTask2.briefGame) != null) {
                l = briefGame.id;
            } else {
                l = null;
            }
            c474500IjALIZ.LJJII(l, "game_id");
            c474500IjALIZ.LJJII("intro_card", "module_name");
            c474500IjALIZ.LJJII("live_detail", "page_name");
            c474500IjALIZ.LJJII(Integer.valueOf(this.LLILLJJLI ? 1 : 0), "is_fullscreen");
            if (c1870140ylYC1.LIZJ) {
                str4 = "enter";
            } else {
                str4 = "live";
            }
            c474500IjALIZ.LJJII(str4, "show_time");
            c474500IjALIZ.LJJII("user", "user_type");
            c474500IjALIZ.LJJII(String.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
            w.LIZ.getClass();
            c474500IjALIZ.LJJII(String.valueOf(w.LJ()), "host_id");
            c474500IjALIZ.LJJII(String.valueOf(w.LJIJJ()), "content_id");
            if (Intrinsics.LJFF(str, "click")) {
                str5 = "active";
            } else {
                str5 = "passive";
            }
            c474500IjALIZ.LJJII(str5, "intro_card_close_type");
            c474500IjALIZ.LJJII(str, "intro_card_close_sub_type");
            c474500IjALIZ.LJJII(Long.valueOf((System.currentTimeMillis() - c1870140ylYC1.LIZIZ) / ((long) LSPassThroughRecordSizeConfig.DEFAULT)), "duration");
            try {
                BriefGameTask briefGameTask3 = c1870140ylYC1.LIZ.LJ;
                if (briefGameTask3 != null) {
                    str6 = briefGameTask3.logExtra;
                }
                c474500IjALIZ.LJJIIJZLJL(new JSONObject(URLDecoder.decode(String.valueOf(str6), "UTF-8")));
                C189200o6.m2constructorimpl(c474500IjALIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            c474500IjALIZ.LIZ();
        }
    }

    public final void I1(C1870150ylZ c1870150ylZ) {
        boolean z;
        char c;
        BriefGameTask briefGameTask;
        PartnershipTask partnershipTask;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        BriefGameTask briefGameTask2;
        PartnershipTask partnershipTask2;
        if (c1870150ylZ != null && (briefGameTask2 = c1870150ylZ.LJ) != null && (partnershipTask2 = briefGameTask2.task) != null && partnershipTask2.taskMode == 40) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            c = 2;
        } else if (c1870150ylZ == null || c1870150ylZ.LIZ != 0 || ((briefGameTask = c1870150ylZ.LJ) != null && (partnershipTask = briefGameTask.task) != null && partnershipTask.taskType == 4)) {
            c = 3;
        } else {
            c = 1;
        }
        FrameLayout frameLayout = this.LL;
        if (frameLayout == null) {
            return;
        }
        if (this.LLILLJJLI) {
            if (c == 1) {
                ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                if ((layoutParams instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    marginLayoutParams.height = (int) C497740JfY.LIZIZ(178.0f);
                    marginLayoutParams.width = (int) C497740JfY.LIZIZ(120.0f);
                    C786410Ut5.a6(frameLayout, marginLayoutParams);
                    return;
                }
                return;
            }
            if (c == 2) {
                frameLayout.getLayoutParams().height = (int) C497740JfY.LIZIZ(164.0f);
                frameLayout.getLayoutParams().width = (int) C497740JfY.LIZIZ(120.0f);
                return;
            } else {
                frameLayout.getLayoutParams().height = (int) C497740JfY.LIZIZ(138.0f);
                frameLayout.getLayoutParams().width = (int) C497740JfY.LIZIZ(108.0f);
                return;
            }
        }
        if (c == 1) {
            frameLayout.getLayoutParams().height = (int) C497740JfY.LIZIZ(94.0f);
            frameLayout.getLayoutParams().width = -1;
        } else if (c == 2) {
            frameLayout.getLayoutParams().height = (int) C497740JfY.LIZIZ(84.0f);
            frameLayout.getLayoutParams().width = -1;
        } else {
            frameLayout.getLayoutParams().height = (int) C497740JfY.LIZIZ(90.0f);
            frameLayout.getLayoutParams().width = -1;
        }
    }

    public final void J1(String str) {
        Room room;
        DropsRoomInfo dropsRoomInfo;
        C1105940esy c1105940esyEU0;
        String str2;
        if (this.LLILLJJLI || !C1697810uHb.LJIIJJI("enter_room", "click", "timeout", "unpin", "task_hide").contains(str)) {
            return;
        }
        C1878410yyt c1878410yyt = this.LLJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        C204800qc c204800qc = (C204800qc) c1878410yyt.LIZ();
        if ((c204800qc == null || (str2 = c204800qc.LIZ) == null || str2.length() <= 0) && (room = this.LLILZ) != null && (dropsRoomInfo = room.dropsInfo) != null && (c1105940esyEU0 = ((IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class)).EU0()) != null) {
            c1105940esyEU0.LJII(this.dataChannel, dropsRoomInfo);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        Context context;
        String strLJFF;
        Context context2;
        C19EG c19egLJ;
        String strLJFF2;
        String str = c262100zr.LIZ;
        String str2 = "";
        switch (str.hashCode()) {
            case -1825482305:
                if (str.equals("gamePartnershipAgeNotMatch") && (context = this.context) != null) {
                    IGamePartnershipService iGamePartnershipService = (IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class);
                    InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
                    if (interfaceC1107590evd != null && (strLJFF = C1871910yoP.LJFF(interfaceC1107590evd, "request_page", "")) != null) {
                        str2 = strLJFF;
                    }
                    iGamePartnershipService.bO(context, "user", str2);
                    break;
                }
                break;
            case -1664409398:
                if (str.equals("closeGamePartnershipCard") && System.currentTimeMillis() - this.LLIZ >= 500) {
                    this.LLIZ = System.currentTimeMillis();
                    H1("click");
                    y1("click");
                    x1();
                    break;
                }
                break;
            case -1649822732:
                if (str.equals("gamePartnershipNeedFillAge") && (context2 = this.context) != null && (c19egLJ = C500260Jjc.LJ(context2)) != null) {
                    IGamePartnershipService iGamePartnershipService2 = (IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class);
                    InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
                    if (interfaceC1107590evd2 != null && (strLJFF2 = C1871910yoP.LJFF(interfaceC1107590evd2, "request_page", "")) != null) {
                        str2 = strLJFF2;
                    }
                    iGamePartnershipService2.BP0(c19egLJ, "user", str2, new C020Z(this, c262100zr, 4));
                    break;
                }
                break;
            case 2136166378:
                if (str.equals("closeGameRewardsCard")) {
                    y1("click");
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014c  */
    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMessage(com.ss.ugc.live.sdk.message.data.IMessage r20) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1015
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.game.partnership.widget.GamePartnershipGamePinCardWidget.onMessage(com.ss.ugc.live.sdk.message.data.IMessage):void");
    }

    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public final void onUnload(RecycleSource recycleSource) {
        super.onUnload(recycleSource);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUnload ");
        sbLIZ.append(recycleSource);
        C20441214yg.LIZIZ("PartnershipAudience", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJJ = true;
        C1548820qPI.LJIIIIZZ("closeGameRewardsCard", this);
        C1548820qPI.LJIIIIZZ("closeGamePartnershipCard", this);
        C1548820qPI.LJIIIIZZ("gamePartnershipNeedFillAge", this);
        C1548820qPI.LJIIIIZZ("gamePartnershipAgeNotMatch", this);
        IMessageManager iMessageManager = this.LLILZLL;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener((OnIMMessageListener) this);
        }
        this.LLILZLL = null;
        this.LLILLJJLI = false;
        this.LLILZIL.removeMessages(0);
        if (recycleSource == RecycleSource.FROM_ROOM_CHANGE) {
            InterfaceC1878370yyp interfaceC1878370yyp = C1878400yys.LIZ;
            if (interfaceC1878370yyp != null) {
                interfaceC1878370yyp.LIZ();
            }
            C1878400yys.LIZ = null;
            if (C1() != null) {
                H1("leave");
            }
            C1878410yyt c1878410yyt = this.LLJJJIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
            c1878410yyt.LIZIZ(null);
            this.LLJJJ.LIZIZ(null);
            A1();
            C789310Uxl c789310Uxl = (C789310Uxl) this.LLJJIJIL.LIZ();
            if (c789310Uxl != null) {
                C473410IhP.LIZ().removeCallbacks(c789310Uxl.LIZ);
            }
            this.LLJJIJIL.LIZIZ(null);
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
            dataChannelGlobal.zQ2(this);
            dataChannelGlobal.JQ2(C168K.class, null);
        }
    }

    public final void y1(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("closeCurrentPiningCard source=");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("PartnershipAudience", C2188811AlT.LIZIZ(sbLIZ));
        F1(null, false, str);
        J1(str);
    }

    public final void L1(C1870150ylZ c1870150ylZ, String str) {
        Integer numValueOf;
        if (Intrinsics.LJFF(str, "from_message")) {
            C1878410yyt c1878410yyt = this.LLJJJ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
            c1878410yyt.LIZIZ(null);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showGamePromotingPinCard pinCardType=$");
        sbLIZ.append(c1870150ylZ.LIZ);
        C20441214yg.LIZIZ("PartnershipAudience", C2188811AlT.LIZIZ(sbLIZ));
        int i = c1870150ylZ.LIZ;
        if (i != -1) {
            if (i != 0) {
                if (i == 1) {
                    P1(c1870150ylZ, str);
                    return;
                }
                return;
            }
            BriefGameTask briefGameTask = c1870150ylZ.LJ;
            if ((briefGameTask == null || (numValueOf = Integer.valueOf(briefGameTask.showStatus)) == null || numValueOf.intValue() != 0) && !this.LLILLL) {
                y1(str);
                x1();
                return;
            } else {
                P1(c1870150ylZ, str);
                return;
            }
        }
        y1(str);
    }

    public final void P1(C1870150ylZ c1870150ylZ, String str) {
        boolean z;
        if (C1() != null) {
            z = true;
            y1(str);
        } else {
            z = false;
        }
        long j = c1870150ylZ.LIZLLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showDurationMillis = ");
        sbLIZ.append(j);
        C20441214yg.LIZIZ("PartnershipAudience", C2188811AlT.LIZIZ(sbLIZ));
        long j2 = 0;
        if (j <= 0) {
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("updateShowGameCard  source =  ");
        sbLIZ2.append(str);
        C20441214yg.LIZIZ("PartnershipAudience", C2188811AlT.LIZIZ(sbLIZ2));
        G1(c1870150ylZ, false, str);
        BPEAHandler bPEAHandler = this.LLILZIL;
        ARunnableS30S1200000_27 aRunnableS30S1200000_27 = new ARunnableS30S1200000_27(this, c1870150ylZ, str, 0);
        if (z) {
            j2 = 1000;
        }
        C786410Ut5.LJLIIL(j2, bPEAHandler, aRunnableS30S1200000_27);
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x01ab  */
    @Override // com.bytedance.ies.sdk.widgets.widgetloadpriority.RoomRecycleWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLoad(com.bytedance.ies.sdk.widgets.RecycleSource r8, java.lang.Object[] r9) {
        /*
            Method dump skipped, instruction units count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.game.partnership.widget.GamePartnershipGamePinCardWidget.onLoad(com.bytedance.ies.sdk.widgets.RecycleSource, java.lang.Object[]):void");
    }

    public final void B1(int i, String str, Map map) {
        Context context;
        FrameLayout frameLayout;
        LifecycleOwner lifecycleOwnerLJFF;
        C1881050z39 c1881050z39Cg2;
        if (i != -1 && (context = this.context) != null && (frameLayout = this.LL) != null) {
            AbstractC1387200mCc abstractC1387200mCcLIZIZ = C520040KaQ.LIZIZ(this.widgetCallback.getFragment());
            if (abstractC1387200mCcLIZIZ == null || (lifecycleOwnerLJFF = abstractC1387200mCcLIZIZ.LJFF()) == null) {
                lifecycleOwnerLJFF = this;
            }
            Room room = this.LLILZ;
            DataChannel dataChannel = this.dataChannel;
            AwS603S0100000_24 awS603S0100000_24 = new AwS603S0100000_24(this, 479);
            AwS607S0100000_28 awS607S0100000_28 = new AwS607S0100000_28(this, 195);
            if (C1878400yys.LIZ == null) {
                IGamePartnershipService iGamePartnershipService = (IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class);
                if (iGamePartnershipService != null) {
                    c1881050z39Cg2 = iGamePartnershipService.cg2(context, room, dataChannel, i, map, str, awS603S0100000_24, awS607S0100000_28);
                } else {
                    c1881050z39Cg2 = null;
                }
                C1878400yys.LIZ = c1881050z39Cg2;
                if (c1881050z39Cg2 != null) {
                    c1881050z39Cg2.LIZJ(frameLayout, lifecycleOwnerLJFF);
                }
            }
        }
    }

    public final void F1(C1870150ylZ c1870150ylZ, boolean z, String str) {
        Integer numValueOf;
        if (c1870150ylZ != null) {
            numValueOf = Integer.valueOf(c1870150ylZ.LIZ);
        } else {
            numValueOf = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("playPinCardAnimation show=");
        sbLIZ.append(z);
        sbLIZ.append(", landscape=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", pinCard=");
        sbLIZ.append(numValueOf);
        C20441214yg.LIZIZ("PartnershipAudience", C2188811AlT.LIZIZ(sbLIZ));
        C1878430yyv c1878430yyv = new C1878430yyv(this, c1870150ylZ, str, z);
        if (z) {
            C786410Ut5.LJJZZIII(this.LLILZIL, new ARunnableS124S0100000_24(c1878430yyv, 9));
        } else {
            C786410Ut5.LJL(this.LLILZIL, new ARunnableS124S0100000_24(c1878430yyv, 9));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x024f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G1(X.C1870150ylZ r13, boolean r14, java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 781
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.game.partnership.widget.GamePartnershipGamePinCardWidget.G1(X.0ylZ, boolean, java.lang.String):void");
    }

    public final void M1(int i, String str, String str2, String str3) {
        Room room;
        if (this.LLJJ || this.context == null || this.dataChannel == null || (room = this.LLILZ) == null) {
            return;
        }
        if (!this.LLILLL) {
            List<Class> listLJIIJJI = C1697810uHb.LJIIJJI(HighPrioritySlotVisibilityChannel.class, HighPriorityTooltipVisibilityChannel.class);
            if (!(listLJIIJJI instanceof Collection) || !listLJIIJJI.isEmpty()) {
                for (Class cls : listLJIIJJI) {
                    DataChannel dataChannel = this.dataChannel;
                    if (dataChannel != null && Intrinsics.LJFF(dataChannel.gg0(cls), Boolean.TRUE)) {
                        C20441214yg.LIZIZ("PartnershipAudience", "high priority tooltips showing, reject pin");
                        return;
                    }
                }
            }
        }
        if (this.LLILLL) {
            Room room2 = this.LLILZ;
            if (room2 != null) {
                long id = room2.getId();
                if (i == 1) {
                    L1(new C1870150ylZ(1, str, str2, this.LLJILJILJ.LIZ * ((long) LSPassThroughRecordSizeConfig.DEFAULT), (BriefGameTask) null, (GameCTAInfo) null, 112), str3);
                    return;
                } else {
                    ((IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class)).Wo2(id, new AwS9S3100000_28(this, str, str2, str3, 0));
                    return;
                }
            }
            return;
        }
        N1(room, i, str, str2, str3);
    }

    public final void O1(int i, String str, long j, String str2) {
        if (this.LLILLL || i != 0 || C781520UlC.LJIIL(this.LLILZ) || str2.length() > 0 || !GameLivePartnershipGameCardShowConfig.INSTANCE.getConfig().enable || j <= 0) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("try delay show again , delayTime = ");
        sbLIZ.append(j);
        C20441214yg.LIZIZ("PartnershipAudience", C2188811AlT.LIZIZ(sbLIZ));
        C805330ViV c805330ViV = new C805330ViV(str, C23250099c.LIZLLL(C817503Hh.LL, null, null, new C1784380wXE(j, this, str, str2, null), 3));
        C1878410yyt c1878410yyt = this.LLJJIJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJ;
        c1878410yyt.LIZIZ(c805330ViV);
    }

    public final void N1(Room room, int i, String str, String str2, String str3) {
        Boolean bool;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            bool = (Boolean) dataChannel.gg0(LockScreenChannel.class);
        } else {
            bool = null;
        }
        if (C500260Jjc.LJJJI(bool)) {
            this.LLJJI = new C1878380yyq(i, str, str2, System.currentTimeMillis(), str3);
        } else {
            ((IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class)).Nq0(this.context, room, this.dataChannel, new C1869740yku(this, i, str, str2, str3));
        }
    }
}
