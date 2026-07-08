package com.ss.android.ugc.aweme.im.sdk.chat.ui.singleactivity;

import X.AbstractC1387200mCc;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C09R3;
import X.C09RB;
import X.C09RD;
import X.C0PEM;
import X.C0TVI;
import X.C0WZX;
import X.C0YAE;
import X.C1336205Ku;
import X.C1360890lWB;
import X.C1365870leD;
import X.C1366690lfX;
import X.C1389910mGz;
import X.C13BV;
import X.C13LE;
import X.C13LQ;
import X.C1479605qk;
import X.C14EU;
import X.C14K9;
import X.C14KI;
import X.C1512805w6;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1608506Rn;
import X.C1619106Vp;
import X.C1622206Wu;
import X.C1631506a9;
import X.C1631606aA;
import X.C1661806f2;
import X.C1701330uNH;
import X.C18ZN;
import X.C1903920ze2;
import X.C1906580ziK;
import X.C19252910Tv;
import X.C19719912Dl;
import X.C19EG;
import X.C20684815ws;
import X.C2204961BRm;
import X.C2217381BqS;
import X.C2296808zG;
import X.C23250099c;
import X.C338490DOt;
import X.C345280DgE;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C457640Hx4;
import X.C484220Iyq;
import X.C622680Oba;
import X.C724750Sbp;
import X.C890330YwJ;
import X.C912980Zrk;
import X.C913020Zro;
import X.C913060Zrs;
import X.C913080Zru;
import X.C913300ZsG;
import X.C913340ZsK;
import X.C987103tV;
import X.EnumC1781820wT6;
import X.EnumC894560Z7m;
import X.InterfaceC1385905bd;
import X.InterfaceC21500319Cf;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC457860HxQ;
import X.InterfaceC724760Sbq;
import Y.ACListenerS117S0200000_14;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.arg.RouteArgInjector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IShareMessageToastHelper;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.actionbar.api.ability.ActionBarViewInfoAbility;
import com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.common.perfmonitor.api.DurationPerfMon;
import com.ss.android.ugc.aweme.im.common.perfmonitor.api.IStopwatchFactory;
import com.ss.android.ugc.aweme.im.common.perfmonitor.api.Stopwatch;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.saas.host.api.share.IMShareService;
import com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMChatRoomAnalytics;
import com.ss.android.ugc.aweme.im.sdk.performance.IMResourceLogger;
import com.ss.android.ugc.aweme.im.viewmodel.InputPanelSizeViewModel;
import com.ss.android.ugc.aweme.services.IMainService;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.aweme.utils.IChatCustomizeHelper;
import com.ss.android.ugc.aweme.viewmodel.GreetingCardViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;

/* JADX INFO: loaded from: classes15.dex */
@InterfaceC21500319Cf(featureKey = "tiktok_dm_chatroom")
public final class ChatRootFragment extends BaseChatRootFragment implements C18ZN, View.OnAttachStateChangeListener, InterfaceC1385905bd, InterfaceC457860HxQ {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLLJIL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiwhZzw3I2svIS4nHELIOSZjAlZzw6JiIgLC4wPCw6IDsqZgYkKDsBJyo4Dz0yLygpJzs=";
    public final C01GW LLLLJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 850));
    public final Stopwatch LLLLJI = ((IStopwatchFactory) ServiceManager.get().getService(IStopwatchFactory.class)).LIZ();
    public final AssemVMLazy LLLLL;
    public final AssemVMLazy LLLLLIL;
    public final C912980Zrk LLLLLILLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ChatRootFragment.class, "inputSizeVM", "getInputSizeVM()Lcom/ss/android/ugc/aweme/im/viewmodel/InputPanelSizeViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(ChatRootFragment.class, "greetingCardVM", "getGreetingCardVM()Lcom/ss/android/ugc/aweme/viewmodel/GreetingCardViewModel;", 0);
        c09r3.getClass();
        LLLLLJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.C18ZN
    public final void onAppBackground() {
    }

    @Override // X.C18ZN
    public final void onAppForeground() {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    public ChatRootFragment() {
        AssemVMLazy assemVMLazy;
        boolean z;
        boolean z2;
        AssemVMLazy assemVMLazy2;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(InputPanelSizeViewModel.class);
        AwS558S0100000_14 awS558S0100000_14 = new AwS558S0100000_14(c19719912DlLIZ, 852);
        AFwS248S0000000_14 aFwS248S0000000_14 = AFwS248S0000000_14.get$arr$(241);
        C01D1 c01d1 = C01D1.LIZ;
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS558S0100000_14, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS558S0100000_14((HasDefaultViewModelProviderFactory) this, 853), aFwS248S0000000_14, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
            z2 = true;
            z = false;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS558S0100000_14, new AwS558S0100000_14((Fragment) this, 854), aFwS248S0000000_14, null, null, null);
            z = false;
            z2 = true;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z = false;
            z2 = true;
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS558S0100000_14, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS558S0100000_14((HasDefaultViewModelProviderFactory) this, 855), aFwS248S0000000_14, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLLLL = assemVMLazy;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(GreetingCardViewModel.class);
        AwS558S0100000_14 awS558S0100000_142 = new AwS558S0100000_14(c19719912DlLIZ2, 856);
        AFwS248S0000000_14 aFwS248S0000000_142 = AFwS248S0000000_14.get$arr$(242);
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS558S0100000_142, new C452070Ho5(), new C1622206Wu(this, z2), new C338490DOt(this, z2), new AwS558S0100000_14((HasDefaultViewModelProviderFactory) this, 857), aFwS248S0000000_142, new C451460Hn6(this, z2), new C451620HnM(this, z2), new C987103tV(this, z2));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy2 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS558S0100000_142, new AwS558S0100000_14((Fragment) this, 858), aFwS248S0000000_142, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS558S0100000_142, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS558S0100000_14((HasDefaultViewModelProviderFactory) this, 851), aFwS248S0000000_142, new C451460Hn6(this, z), new C451620HnM(this, z), new C987103tV(this, z));
        }
        this.LLLLLIL = assemVMLazy2;
        this.LLLLLILLIL = new C912980Zrk();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.singleactivity.BaseChatRootFragment
    public final void hS() {
        aS(new AwS593S0100000_14(this, 98));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004e A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:3:0x000d, B:5:0x001b, B:6:0x0034, B:8:0x003a, B:11:0x005b, B:15:0x0074, B:17:0x0085, B:18:0x008d, B:20:0x0096, B:22:0x00a6, B:23:0x00a9, B:25:0x00af, B:27:0x00b5, B:30:0x00c1, B:10:0x004e), top: B:37:0x000d }] */
    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.singleactivity.BaseChatRootFragment, androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.ui.singleactivity.ChatRootFragment.onResume():void");
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.singleactivity.BaseChatRootFragment, androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        C1512805w6 c1512805w6 = new C1512805w6("chatroom_onstart");
        C1366690lfX c1366690lfX = DurationPerfMon.LIZ;
        c1366690lfX.LIZIZ(c1512805w6, true);
        try {
            super.onStart();
            C20684815ws.onEventV3("tiktok_dm_chatroom");
            c1366690lfX.LIZJ(c1512805w6, C1661806f2.LIZLLL);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            DurationPerfMon.LIZ.LIZJ(c1512805w6, C1661806f2.LIZLLL);
            throw th;
        }
    }

    public final EnterChatParams zS() {
        return (EnterChatParams) this.LLLLJ.getValue();
    }

    public final void ES() throws Throwable {
        C19EG activity = getActivity();
        if (activity == null) {
            return;
        }
        C2204961BRm.LLJJJ(activity, 11, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOlLYzK13yjN1rdG6KMeb29IBUL3h3e9ZuZ16tfEXzMQG/vcyZ0EvAMaaoxBgg=", null));
        EnterChatParams enterChatParamsZS = zS();
        if ((enterChatParamsZS != null ? enterChatParamsZS.getReturnPage() : null) == null) {
            AbstractC1387200mCc abstractC1387200mCc = (AbstractC1387200mCc) C13LQ.LJJIFFI(C1906580ziK.LJII());
            if (Intrinsics.LJFF(abstractC1387200mCc != null ? abstractC1387200mCc.LIZ : null, this)) {
                C1336205Ku.LIZ(false).getImChatService().LJIIL(activity, null, false, null);
                return;
            }
            return;
        }
        EnterChatParams enterChatParamsZS2 = zS();
        String returnPage = enterChatParamsZS2 != null ? enterChatParamsZS2.getReturnPage() : null;
        if (!Intrinsics.LJFF(returnPage, "feed_fyp")) {
            if (Intrinsics.LJFF(returnPage, "inbox")) {
                C1336205Ku.LIZ(false).getImChatService().LJIIL(activity, null, false, null);
                return;
            }
            return;
        }
        Intent mainActivityIntent = ((IMainService) ServiceManager.get().getService(IMainService.class)).getMainActivityIntent(getContext());
        if (mainActivityIntent != null) {
            mainActivityIntent.setFlags(67108864);
        } else {
            mainActivityIntent = null;
        }
        C19EG c19egRequireActivity = requireActivity();
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(c19egRequireActivity, mainActivityIntent, "Context_startActivity_1");
        C1701330uNH.LIZ(mainActivityIntent, c19egRequireActivity);
        C2204961BRm.LLJJJJ(c19egRequireActivity, mainActivityIntent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOlLYzK13yjN1rdG6KMeb29IBUL3h3e9ZuZ16tfEXzMQG/vcyZ0EvAMaaoxBgg=", null));
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.singleactivity.BaseChatRootFragment
    public final EnterChatParams mS() {
        return zS();
    }

    @Override // X.InterfaceC1385905bd
    public final boolean onBackPress() throws Throwable {
        ES();
        return nS();
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final boolean onBackPressed() throws Throwable {
        ES();
        if (nS()) {
            return true;
        }
        return super.onBackPressed();
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.singleactivity.BaseChatRootFragment, androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C1903920ze2.LIZIZ.LIZ(EnumC1781820wT6.CHAT_ROOM);
        C622680Oba.LIZLLL(this);
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        String conversationId;
        super.onDestroyView();
        ActivityStack.removeAppBackGroundListener(this);
        this.LLLLJI.stop();
        IMResourceLogger.LJFF(IMResourceLogger.LIZIZ, "leave_chat");
        SessionInfo sessionInfo = this.LLJJJ;
        if (sessionInfo != null && (conversationId = sessionInfo.getConversationId()) != null) {
            IChatCustomizeHelper.LIZ.getClass();
            IChatCustomizeHelper iChatCustomizeHelperLIZ = C1619106Vp.LIZ();
            if (iChatCustomizeHelperLIZ != null) {
                iChatCustomizeHelperLIZ.onChatroomExit(conversationId);
            }
        }
        SessionInfo sessionInfo2 = this.LLJJJ;
        if (sessionInfo2 != null) {
            IMChatRoomAnalytics.LJIIJ(IMChatRoomAnalytics.LIZIZ, sessionInfo2, this.LLLLJI.LIZ(), 0);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.singleactivity.BaseChatRootFragment, androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C913020Zro c913020Zro = C913060Zrs.LIZ;
        if (c913020Zro != null && c913020Zro.LJIILJJIL <= 0) {
            c913020Zro.LJIILJJIL = jCurrentTimeMillis;
        }
        IShareMessageToastHelper.LIZ.getClass();
        IShareMessageToastHelper iShareMessageToastHelperLIZ = C913340ZsK.LIZ();
        if (iShareMessageToastHelperLIZ != null) {
            iShareMessageToastHelperLIZ.As().remove(Integer.valueOf(System.identityHashCode(this)));
            iShareMessageToastHelperLIZ.Bs();
        }
    }

    public final void yS() {
        IMUser imUser;
        if (C1336205Ku.LIZJ().LIZJ()) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this, "aweme://user/profile/");
            EnterChatParams enterChatParamsZS = zS();
            smartRouteBuildRoute.withParam("uid", (enterChatParamsZS == null || (imUser = enterChatParamsZS.getImUser()) == null) ? null : imUser.getUid());
            EnterChatParams enterChatParamsZS2 = zS();
            smartRouteBuildRoute.withParam("enter_from", enterChatParamsZS2 != null ? enterChatParamsZS2.getEnterFromForMob() : null);
            smartRouteBuildRoute.open();
            C913080Zru.LIZ(this);
        }
    }

    public final List<View> BS(List<? extends View> list) {
        ViewGroup viewGroup;
        List<View> listLJJII;
        View view = getView();
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null && (listLJJII = C09RB.LJJII(C09RB.LJIIIZ(new C09RD(viewGroup), new AwS593S0100000_14(list, (List<C0YAE>) 99)))) != null) {
            return listLJJII;
        }
        return C13BV.INSTANCE;
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final void LLLLIILLL(Bundle bundle) {
        super.LLLLIILLL(bundle);
        RouteArgInjector.INSTANCE.inject(this);
        sS(true);
    }

    @Override // X.InterfaceC457860HxQ
    public final void WI(List<? extends View> list) {
        if (list == null) {
            this.LLLLLILLIL.LIZIZ(Collections.singletonList(getView()));
        } else {
            this.LLLLLILLIL.LIZIZ(BS(list));
        }
    }

    @Override // X.InterfaceC457860HxQ
    public final void ok(List<? extends View> list) {
        if (list == null) {
            this.LLLLLILLIL.LIZ(Collections.singletonList(getView()));
        } else {
            this.LLLLLILLIL.LIZ(BS(list));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C19252910Tv.LIZIZ.LIZIZ(requireActivity());
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onBlockUserSuccessEvent(C1479605qk c1479605qk) {
        C19EG activity = getActivity();
        if (activity != null) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1631606aA(this, activity, null), 3);
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.singleactivity.BaseChatRootFragment, androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String sourceBtmToken;
        C1512805w6 c1512805w6 = new C1512805w6("charoom_oncreate");
        C1366690lfX c1366690lfX = DurationPerfMon.LIZ;
        c1366690lfX.LIZIZ(c1512805w6, true);
        try {
            super.onCreate(bundle);
            C622680Oba.LIZJ(this);
            yS();
            aS(new AwS603S0100000_24(bundle, 112));
            C1903920ze2.LIZIZ.LIZIZ(EnumC1781820wT6.CHAT_ROOM);
            BtmSDK btmSDK = BtmSDK.INSTANCE;
            EnterChatParams enterChatParamsZS = zS();
            if (enterChatParamsZS != null) {
                sourceBtmToken = enterChatParamsZS.getSourceBtmToken();
            } else {
                sourceBtmToken = null;
            }
            btmSDK.registerBtmPageOnCreate(this, "a2270.b7711", sourceBtmToken);
            c1366690lfX.LIZJ(c1512805w6, C1661806f2.LIZLLL);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            DurationPerfMon.LIZ.LIZJ(c1512805w6, C1661806f2.LIZLLL);
            throw th;
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onEvent(C1365870leD c1365870leD) {
        String strLIZ;
        int iVR0;
        IMUser singleChatFromUser;
        boolean zLJFF;
        String conversationId;
        String conversationId2;
        IMConversation iMConversation;
        if ((Intrinsics.LJFF(c1365870leD.LIZLLL, "video_sticker") && (Intrinsics.LJFF(c1365870leD.LJ, "personal_homepage") || Intrinsics.LJFF(c1365870leD.LJ, "others_homepage"))) || c1365870leD.LJIILIIL) {
            return;
        }
        ACListenerS117S0200000_14 aCListenerS117S0200000_14 = null;
        if (!c1365870leD.LIZJ) {
            SessionInfo sessionInfo = this.LLJJJ;
            if (sessionInfo != null && sessionInfo.isGroupChat()) {
                IMContact iMContact = c1365870leD.LIZ;
                if ((iMContact instanceof IMConversation) && (iMConversation = (IMConversation) iMContact) != null) {
                    conversationId = iMConversation.getConversationId();
                } else {
                    conversationId = null;
                }
                SessionInfo sessionInfo2 = this.LLJJJ;
                if (sessionInfo2 != null) {
                    conversationId2 = sessionInfo2.getConversationId();
                } else {
                    conversationId2 = null;
                }
                zLJFF = Intrinsics.LJFF(conversationId, conversationId2);
            } else {
                IMContact iMContact2 = c1365870leD.LIZ;
                if (!(iMContact2 instanceof IMUser)) {
                    iMContact2 = null;
                }
                SessionInfo sessionInfo3 = this.LLJJJ;
                if (sessionInfo3 != null) {
                    singleChatFromUser = sessionInfo3.getSingleChatFromUser();
                } else {
                    singleChatFromUser = null;
                }
                zLJFF = Intrinsics.LJFF(iMContact2, singleChatFromUser);
            }
            if (zLJFF) {
                return;
            }
        }
        IMShareService.LIZ.getClass();
        IMShareService iMShareServiceLIZ = C1608506Rn.LIZ();
        if (iMShareServiceLIZ != null && iMShareServiceLIZ.LJJIIJ(c1365870leD)) {
            return;
        }
        C19EG activity = getActivity();
        if (activity != null) {
            strLIZ = C345280DgE.LIZ(activity, c1365870leD);
        } else {
            strLIZ = null;
        }
        AssemVMLazy assemVMLazy = this.LLLLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLLLJIL;
        int i = ((C457640Hx4) assemVMLazy.getValue().getState()).LLILLJJLI;
        ActionBarViewInfoAbility actionBarViewInfoAbility = (ActionBarViewInfoAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), ActionBarViewInfoAbility.class, null);
        if (actionBarViewInfoAbility != null) {
            iVR0 = actionBarViewInfoAbility.vR0();
        } else {
            iVR0 = 0;
        }
        int iLIZIZ = C14KI.LIZIZ(requireContext()) + i + iVR0;
        if (strLIZ != null) {
            C1389910mGz c1389910mGz = new C1389910mGz(this);
            c1389910mGz.LJIIJ(strLIZ);
            c1389910mGz.LIZ.LIZIZ = 0;
            c1389910mGz.LJI(R.style.y0);
            c1389910mGz.LJ(3000L);
            c1389910mGz.LIZIZ(iLIZIZ);
            Context context = getContext();
            if (context != null) {
                aCListenerS117S0200000_14 = new ACListenerS117S0200000_14(c1365870leD, context, 2);
            }
            C1360890lWB c1360890lWB = c1389910mGz.LIZ;
            c1360890lWB.LJIIIIZZ = aCListenerS117S0200000_14;
            c1360890lWB.LIZLLL = 0;
            c1389910mGz.LJIIJJI();
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onJsBroadCastEvent(C484220Iyq c484220Iyq) {
        FragmentManager fragmentManager;
        try {
            IMChatListApi.LJJIII.getClass();
            IMChatListApi iMChatListApiLIZ = C890330YwJ.LIZ();
            if (iMChatListApiLIZ.LJIL(JSONObjectProtectorUtils.getString(c484220Iyq.LIZ, "eventName"), getLifecycle().getCurrentState()) && (fragmentManager = getFragmentManager()) != null) {
                iMChatListApiLIZ.LIZJ(fragmentManager, EnumC894560Z7m.REPORT, null);
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008a  */
    @X.C14EU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onVideoPlayerStatusEvent(X.C581630MrZ r31) {
        /*
            Method dump skipped, instruction units count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.ui.singleactivity.ChatRootFragment.onVideoPlayerStatusEvent(X.0MrZ):void");
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.chat.ui.singleactivity.BaseChatRootFragment, androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        View viewFindViewById;
        C1512805w6 c1512805w6 = new C1512805w6("charoom_onview_created");
        C1366690lfX c1366690lfX = DurationPerfMon.LIZ;
        c1366690lfX.LIZIZ(c1512805w6, true);
        try {
            super.onViewCreated(view, bundle);
            ActivityStack.addAppBackGroundListener(this);
            this.LLLLJI.start();
            view.addOnAttachStateChangeListener(this);
            if (!C913300ZsG.LIZ.LIZ() && (viewFindViewById = view.findViewById(R.id.k_g)) != null) {
                C14K9.LJIJJ(viewFindViewById, new C0TVI() { // from class: X.0Zrr
                    @Override // X.C0TVI
                    public final C20246014Ju onApplyWindowInsets(View view2, C20246014Ju c20246014Ju) {
                        C426750GoL.LJIIIZ(view2, null, Integer.valueOf(c20246014Ju.LIZ(7).LIZIZ), null, null, false, 29);
                        return c20246014Ju;
                    }
                });
            }
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C1631506a9(this, null), 2);
            c1366690lfX.LIZJ(c1512805w6, C1661806f2.LIZLLL);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            DurationPerfMon.LIZ.LIZJ(c1512805w6, C1661806f2.LIZLLL);
            throw th;
        }
    }
}
