package com.ss.android.ugc.aweme.im.messagelist.ui;

import X.AbstractC19994813Le;
import X.AbstractC21673719rz;
import X.AbstractC2238408pq;
import X.C019F;
import X.C01GW;
import X.C08SN;
import X.C08SO;
import X.C09R3;
import X.C0BCV;
import X.C0BQN;
import X.C0DXR;
import X.C0I0B;
import X.C0IDG;
import X.C0NZW;
import X.C0PEM;
import X.C0QSJ;
import X.C0Y8T;
import X.C0YNP;
import X.C0ZDX;
import X.C0ZLS;
import X.C127G;
import X.C1366690lfX;
import X.C13BV;
import X.C13DV;
import X.C13LE;
import X.C13LP;
import X.C13LZ;
import X.C1509305vX;
import X.C1512805w6;
import X.C1554610qYd;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1634806ag;
import X.C1637806bA;
import X.C1637906bB;
import X.C1660106el;
import X.C1661806f2;
import X.C1697810uHb;
import X.C1697820uHc;
import X.C1704806ly;
import X.C1807750x8v;
import X.C19719912Dl;
import X.C1DFH;
import X.C20603715jn;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2107308Nj;
import X.C21648719nx;
import X.C2217381BqS;
import X.C23250099c;
import X.C452501pT;
import X.C457780HxI;
import X.C687700QyG;
import X.C723590SZx;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C830490Whz;
import X.C869590Y9l;
import X.C893230Z2j;
import X.C898030ZKv;
import X.C902650Zb5;
import X.C902930ZbX;
import X.C903510ZcT;
import X.C903520ZcU;
import X.C903530ZcV;
import X.C903540ZcW;
import X.C903550ZcX;
import X.C903560ZcY;
import X.C903570ZcZ;
import X.C903580Zca;
import X.C903590Zcb;
import X.C903620Zce;
import X.C903680Zck;
import X.C903930Zd9;
import X.C904680ZeM;
import X.C905120Zf4;
import X.C907030Zi9;
import X.C907160ZiM;
import X.C907190ZiP;
import X.C914170Ztf;
import X.EnumC738160SxS;
import X.InterfaceC1146704e9;
import X.InterfaceC1755906uD;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC459890I1r;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import X.InterfaceC893240Z2k;
import X.InterfaceC902770ZbH;
import X.InterfaceC902800ZbK;
import X.InterfaceC903640Zcg;
import X.InterfaceC903650Zch;
import X.InterfaceC904660ZeK;
import X.InterfaceC904700ZeO;
import X.InterfaceC905150Zf7;
import X.InterfaceC911210Zot;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import Y.AComparatorS33S0000000_14;
import Y.AObjectS67S0000000_14;
import Y.ATListenerS339S0200000_12;
import Y.AsS31S0200000_14;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.ies.powerlist.page.config.OptimizeAbility;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.common.experiment.MessageListPreloadData;
import com.ss.android.ugc.aweme.im.common.perfmonitor.api.DurationPerfMon;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.ChatroomEventAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.EasterEggShareMessageAnimatorAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessagePowerAdapterProtocol;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListAnimatorControllerAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListHasRenderedProvider;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListInteractionAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListScrollAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageOnScreenAnalyticsAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessagePowerListAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.cell.IMMessageListProtocol;
import com.ss.android.ugc.aweme.im.messagelist.api.select.IMSelectTextAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.viewmodel.IIMessageListViewModel;
import com.ss.android.ugc.aweme.im.messagelist.perf.OnChatRoomTouchListener;
import com.ss.android.ugc.aweme.im.messagelist.provider.MessageListAbilityHolder;
import com.ss.android.ugc.aweme.im.messagelist.ui.IMMessagePowerListAssem;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IIMSendMsgUxAnalytics;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.ability.ScrollToMessageViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.messagelist.skeleton.protocol.SkeletonMessageListProtocol;
import com.ss.android.ugc.aweme.im.service.analytics.IIMChatFunnelAnalytics;
import com.ss.android.ugc.aweme.im.service.analytics.IIMClickOutPushAnalytics;
import com.ss.android.ugc.aweme.im.viewmodel.PanelStateViewModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes15.dex */
public final class IMMessagePowerListAssem extends UIContentAssem implements MessageOnScreenAnalyticsAbility, MessageListAnimatorControllerAbility, MessageListInteractionAbility, InterfaceC737790Swr, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIL;
    public final C01GW LLIZLLLIL = C1509305vX.LIZ(AFwS201S0000000_14.get$arr$(146));
    public final C1559260qg8 LLJ = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final C01GW LLJI = C1509305vX.LIZ(new AwS558S0100000_14(this, 568));
    public final AssemVMLazy LLJIJIL;
    public final C1634806ag LLJILJIL;
    public final AssemVMLazy LLJILJILJ;
    public final AssemVMLazy LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C903580Zca LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C902650Zb5 LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW<C907160ZiM> LLJLL;
    public final C01GW LLJLLIL;
    public final C01GW LLJLLL;
    public final C914170Ztf LLJZ;
    public final C903680Zck LLJZIJLIL;
    public final C01GW LLL;
    public volatile C907030Zi9 LLLF;
    public volatile C903930Zd9 LLLFF;
    public volatile C893230Z2j LLLFFI;
    public volatile C903570ZcZ LLLFZ;
    public volatile InterfaceC911210Zot LLLI;
    public volatile C1807750x8v LLLII;
    public C127G LLLIIII;
    public InterfaceC665370Q7z LLLIIIIL;
    public C0QSJ LLLIIIL;

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{ChatRoomScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ChatRoomScope.class);
        return arrayList;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(IMMessagePowerListAssem.class, "messageListViewModel", "getMessageListViewModel()Lcom/ss/android/ugc/aweme/im/messagelist/api/viewmodel/IIMessageListViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(IMMessagePowerListAssem.class, "panelStateVM", "getPanelStateVM()Lcom/ss/android/ugc/aweme/im/viewmodel/PanelStateViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(IMMessagePowerListAssem.class, "scrollToMessageViewModel", "getScrollToMessageViewModel()Lcom/ss/android/ugc/aweme/im/sdk/chat/messagelist/skeleton/ability/ScrollToMessageViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(IMMessagePowerListAssem.class, "imMessageModelManager", "getImMessageModelManager()Lcom/ss/android/ugc/aweme/im/messagelist/api/data/IMMessageModelManager;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(IMMessagePowerListAssem.class, "imConversationRepositoryProvider", "getImConversationRepositoryProvider()Lcom/ss/android/ugc/aweme/im/sdk/chat/data/repository/IMConversationRepositoryProvider;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(IMMessagePowerListAssem.class, "loadMoreAbilityFactory", "getLoadMoreAbilityFactory()Lcom/ss/android/ugc/aweme/im/messagelist/api/data/IMLoadMoreAbilityProvider;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(IMMessagePowerListAssem.class, "scrollToBottomAbility", "getScrollToBottomAbility()Lcom/ss/android/ugc/aweme/im/messagelist/impl/ability/IMScrollToBottomAbilityImpl;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(IMMessagePowerListAssem.class, "conversationRepositoryProvider", "getConversationRepositoryProvider()Lcom/ss/android/ugc/aweme/im/sdk/chat/data/repository/IMConversationRepositoryProvider;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS9 = new C2217381BqS(IMMessagePowerListAssem.class, "imScrollToBottomAbilityFactory", "getImScrollToBottomAbilityFactory()Lcom/ss/android/ugc/aweme/im/messagelist/impl/ability/IMScrollToBottomAbilityFactory;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS10 = new C2217381BqS(IMMessagePowerListAssem.class, "messageListFMPTracker", "getMessageListFMPTracker()Lcom/ss/android/ugc/aweme/im/messagelist/perf/IMMessageListFMPTracker;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS11 = new C2217381BqS(IMMessagePowerListAssem.class, "messageListItemAnimatorFactory", "getMessageListItemAnimatorFactory()Lcom/ss/android/ugc/aweme/im/messagelist/ui/MessageListItemAnimatorFactory;", 0);
        c09r3.getClass();
        LLLIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8, c2217381BqS9, c2217381BqS10, c2217381BqS11};
    }

    /* JADX WARN: Type inference failed for: r0v25, types: [X.0Zca] */
    /* JADX WARN: Type inference failed for: r0v46, types: [X.0Zb5] */
    public IMMessagePowerListAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(IIMessageListViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS558S0100000_14(c19719912DlLIZ, 550), AFwS248S0000000_14.get$arr$(143), null, true);
        this.LLJILJIL = new C1634806ag("MessagePowerListAssem");
        C1637906bB c1637906bBLIZ = C1637806bA.LIZ(AFwS248S0000000_14.get$arr$(146));
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(PanelStateViewModel.class);
        this.LLJILJILJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bBLIZ, new AwS558S0100000_14(c19719912DlLIZ2, 552), AFwS248S0000000_14.get$arr$(144), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(ScrollToMessageViewModel.class);
        this.LLJILLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS558S0100000_14(c19719912DlLIZ3, 555), AFwS248S0000000_14.get$arr$(145), null, true);
        this.LLJJ = C1509305vX.LIZ(new AwS558S0100000_14(this, 561));
        this.LLJJI = C1509305vX.LIZ(new AwS558S0100000_14(this, 551));
        this.LLJJIII = new InterfaceC905150Zf7() { // from class: X.0Zca
            @Override // X.InterfaceC905150Zf7
            public final InterfaceC1755906uD get() {
                IMMessagePowerListAssem iMMessagePowerListAssem = this.LIZ;
                C907030Zi9 c907030Zi9LIZ = iMMessagePowerListAssem.LLLF;
                if (c907030Zi9LIZ == null) {
                    synchronized (iMMessagePowerListAssem) {
                        c907030Zi9LIZ = iMMessagePowerListAssem.LLLF;
                        if (c907030Zi9LIZ == null) {
                            C907030Zi9.LJFF.getClass();
                            c907030Zi9LIZ = C907050ZiB.LIZ();
                            iMMessagePowerListAssem.LLLF = c907030Zi9LIZ;
                        }
                    }
                }
                return c907030Zi9LIZ.LIZ(this.LIZ.Oo(), true);
            }
        };
        this.LLJJIJI = C452501pT.LIZIZ(new AwS558S0100000_14(this, 558));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 565));
        this.LLJJIJIL = C1509305vX.LIZ(new AwS558S0100000_14(this, 554));
        this.LLJJJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 559));
        this.LLJJJIL = C1509305vX.LIZ(new AwS558S0100000_14(this, 569));
        this.LLJJJJ = C1509305vX.LIZ(new AwS558S0100000_14(this, 557));
        this.LLJJJJJIL = C1509305vX.LIZ(new AwS558S0100000_14(this, 563));
        this.LLJJJJLIIL = C1509305vX.LIZ(new AwS558S0100000_14(this, 567));
        this.LLJJL = C1509305vX.LIZ(new AwS558S0100000_14(this, 553));
        this.LLJJLIIIJLLLLLLLZ = C1509305vX.LIZ(new AwS558S0100000_14(this, 560));
        this.LLJL = new InterfaceC904660ZeK() { // from class: X.0Zb5
            public final AwS593S0100000_14 LIZ;

            @Override // X.InterfaceC904660ZeK
            public final List<IMessageEventProtocol> LIZ() {
                Iterable iterableLIZIZ;
                IMMessagePowerListAssem iMMessagePowerListAssem = this.LIZIZ;
                Collection collection = (Collection) iMMessagePowerListAssem.LLJJLIIIJLLLLLLLZ.getValue();
                Fragment fragmentLJI = C724240Sb0.LJI(iMMessagePowerListAssem);
                if (fragmentLJI == null || (iterableLIZIZ = C1554610qYd.LIZIZ(C1558360qeg.LJFF(fragmentLJI, null), IMessageEventProtocol.class, false)) == null) {
                    iterableLIZIZ = C13BV.INSTANCE;
                }
                return C13LP.LJLIL(iterableLIZIZ, collection);
            }

            @Override // X.InterfaceC904660ZeK
            public final List<IMessagePowerAdapterProtocol> LIZIZ() {
                List<IMessagePowerAdapterProtocol> listLIZIZ = C1554610qYd.LIZIZ(C1558520qew.LJIIL(this.LIZIZ), IMessagePowerAdapterProtocol.class, false);
                return listLIZIZ == null ? C13BV.INSTANCE : listLIZIZ;
            }

            @Override // X.InterfaceC904660ZeK
            public final Function1<Function0<? extends List<? extends C869590Y9l>>, List<InterfaceC904610ZeF<?>>> LIZJ() {
                return this.LIZ;
            }

            {
                this.LIZ = new AwS593S0100000_14(this.LIZIZ, 59);
            }
        };
        this.LLJLIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 562));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 566));
        this.LLJLL = C1509305vX.LIZ(new AwS558S0100000_14(this, 556));
        this.LLJLLIL = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(145));
        this.LLJLLL = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(144));
        this.LLJZ = new C914170Ztf(CoroutineExceptionHandler.LJJLIL, 1);
        this.LLJZIJLIL = new C903680Zck();
        this.LLL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 564));
    }

    public final InterfaceC911210Zot Go() throws IllegalAccessException {
        C0QSJ c0qsjLIZLLL = this.LLLIIIL;
        if (c0qsjLIZLLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLLIIIIL;
            if (interfaceC665370Q7zLJIIIZ == null) {
                interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
                this.LLLIIIIL = interfaceC665370Q7zLJIIIZ;
            }
            c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{ChatRoomScope.class});
            this.LLLIIIL = c0qsjLIZLLL;
            if (c0qsjLIZLLL == null) {
                return null;
            }
        }
        InterfaceC911210Zot interfaceC911210Zot = (InterfaceC911210Zot) c0qsjLIZLLL.getAbility(InterfaceC911210Zot.class);
        C687700QyG.LJ(interfaceC911210Zot, InterfaceC911210Zot.class);
        return interfaceC911210Zot;
    }

    public final InterfaceC893240Z2k Ho() {
        C893230Z2j c893230Z2j = this.LLLFFI;
        if (c893230Z2j == null) {
            synchronized (this) {
                c893230Z2j = this.LLLFFI;
                if (c893230Z2j == null) {
                    C893230Z2j c893230Z2j2 = new C893230Z2j((InterfaceC1755906uD) ((C905120Zf4) this.LLJJIJIIJIL.getValue()).LJIIIZ.getValue());
                    this.LLLFFI = c893230Z2j2;
                    return c893230Z2j2;
                }
            }
        }
        return c893230Z2j;
    }

    public final ViewOnAttachStateChangeListenerC20604515jv Jo() {
        return (ViewOnAttachStateChangeListenerC20604515jv) this.LLJJ.getValue();
    }

    public final C904680ZeM Lo() {
        return (C904680ZeM) this.LLJLIL.getValue();
    }

    public final IIMessageListViewModel No() {
        AssemVMLazy assemVMLazy = this.LLJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLIIL;
        return (IIMessageListViewModel) assemVMLazy.getValue();
    }

    public final SessionInfo Oo() {
        return (SessionInfo) this.LLJI.getValue();
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListAnimatorControllerAbility
    public final void Ir() {
        Jo().setItemAnimator(null);
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListInteractionAbility
    public final void NB2() {
        C907190ZiP c907190ZiP;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvJo = Jo();
        if (!(viewOnAttachStateChangeListenerC20604515jvJo instanceof C907190ZiP) || (c907190ZiP = (C907190ZiP) viewOnAttachStateChangeListenerC20604515jvJo) == null) {
            return;
        }
        c907190ZiP.setInteractionBlocked(false);
    }

    public final MessageListAbilityHolder So() {
        return Lo().LIZ();
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLLIIII;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLLIIII;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{IIMessageListViewModel.class, new AObjectS67S0000000_14(this, 13)}, defaultViewModelProviderFactory);
                    this.LLLIIII = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        Function1<UIContentAssem, Unit> function1;
        super.onCreate();
        C903590Zcb c903590Zcb = (C903590Zcb) this.LLJJL.getValue();
        if (c903590Zcb != null && (function1 = c903590Zcb.LIZ) != null) {
            function1.invoke(this);
        }
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, MessageOnScreenAnalyticsAbility.class, null, this);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        EasterEggShareMessageAnimatorAbility easterEggShareMessageAnimatorAbility = (EasterEggShareMessageAnimatorAbility) this.LLJJJJ.getValue();
        if (easterEggShareMessageAnimatorAbility != null) {
            easterEggShareMessageAnimatorAbility.LLILLJJLI = null;
        }
        C903680Zck c903680Zck = this.LLJZIJLIL;
        String enterFromForMob = Oo().getEnterFromForMob();
        C0I0B c0i0b = C0I0B.LJFF;
        c0i0b.LIZIZ();
        c903680Zck.getClass();
        if (C13LZ.LJIIJ(AbstractC19994813Le.Default, new IntRange(1, LSPassThroughRecordSizeConfig.DEFAULT)) == 42) {
            C830490Whz c830490Whz = new C830490Whz();
            c830490Whz.put("enter_from", enterFromForMob);
            c830490Whz.put("list_size", String.valueOf(c903680Zck.LIZ));
            C20684815ws.LJIILLIIL("message_list_loaded", c830490Whz);
        }
        IIMChatFunnelAnalytics iIMChatFunnelAnalytics = (IIMChatFunnelAnalytics) PluggableExtentionKt.pluggableSpiForReal(IIMChatFunnelAnalytics.class);
        if (iIMChatFunnelAnalytics != null) {
            iIMChatFunnelAnalytics.LIZ(Lo().LIZ().LIZLLL(), Lo().LIZ().LIZ(), Jo().getChildCount(), c0i0b.LIZIZ());
        }
        IIMClickOutPushAnalytics iIMClickOutPushAnalytics = (IIMClickOutPushAnalytics) PluggableExtentionKt.pluggableSpiForReal(IIMClickOutPushAnalytics.class);
        if (iIMClickOutPushAnalytics != null) {
            iIMClickOutPushAnalytics.LIZLLL(Oo(), Lo().LIZ().vi2());
        }
        if (((Boolean) this.LLJLLIL.getValue()).booleanValue()) {
            ((ExecutorService) this.LLJLLL.getValue()).shutdown();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        super.onPause();
        IMSelectTextAbility iMSelectTextAbility = (IMSelectTextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IMSelectTextAbility.class, null);
        if (iMSelectTextAbility != null) {
            iMSelectTextAbility.dl0(C0ZLS.PAGE_INVISIBLE);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onStop() {
        super.onStop();
        IIMClickOutPushAnalytics iIMClickOutPushAnalytics = (IIMClickOutPushAnalytics) PluggableExtentionKt.pluggableSpiForReal(IIMClickOutPushAnalytics.class);
        if (iIMClickOutPushAnalytics != null) {
            iIMClickOutPushAnalytics.LIZIZ(Oo(), Lo().LIZ().vi2());
        }
        IIMSendMsgUxAnalytics iIMSendMsgUxAnalytics = (IIMSendMsgUxAnalytics) PluggableExtentionKt.pluggableSpiForReal(IIMSendMsgUxAnalytics.class);
        if (iIMSendMsgUxAnalytics != null) {
            iIMSendMsgUxAnalytics.LIZIZ(SystemClock.uptimeMillis());
        }
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListAnimatorControllerAbility
    public final void xs() {
        Jo().setItemAnimator((AbstractC21673719rz) this.LLL.getValue());
    }

    @Override // com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageOnScreenAnalyticsAbility
    public final boolean A41(String str) {
        if (this.LLJLL.getValue().LJ && !((List) this.LLJLL.getValue().LJFF.getValue()).contains(str)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C0QSJ c0qsjLIZIZ = C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{ChatRoomScope.class});
        c0qsjLIZIZ.unbindAbility(this.LLIZLLLIL.getValue(), InterfaceC459890I1r.class);
        c0qsjLIZIZ.unbindAbility(this.LLJJJ.getValue(), InterfaceC904700ZeO.class);
        c0qsjLIZIZ.unbindAbility(this, MessageListInteractionAbility.class);
        c0qsjLIZIZ.unbindAbility(So(), MessagePowerListAbility.class);
        c0qsjLIZIZ.unbindAbility(So(), MessageListScrollAbility.class);
        c0qsjLIZIZ.unbindAbility(So(), MessageListHasRenderedProvider.class);
        c0qsjLIZIZ.unbindAbility(So(), ChatroomEventAbility.class);
        c0qsjLIZIZ.unbindAbility(So(), C0NZW.class);
        c0qsjLIZIZ.unbindAbility(So(), InterfaceC903640Zcg.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13, types: [com.ss.android.ugc.aweme.im.messagelist.ui.IMMessagePowerListAssem$registerOutsideTapToDismissSelection$1] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Map mapLIZ;
        Class clsGr;
        C0Y8T c0y8tLJ;
        C869590Y9l lastShowMessage;
        Executor executor;
        Function2<UIContentAssem, ViewOnAttachStateChangeListenerC20604515jv, Unit> function2;
        Fragment fragmentLJI;
        C907190ZiP c907190ZiP;
        List<C0DXR> list;
        DurationPerfMon.LIZ.LIZIZ(this.LLJILJIL, false);
        super.onViewCreated(view);
        this.LLJZIJLIL.LIZ = Lo().LIZ().OM0().size();
        C904680ZeM c904680ZeMLo = Lo();
        ((InterfaceC903650Zch) c904680ZeMLo.LJII.getValue()).init();
        Fragment fragmentLJI2 = C724240Sb0.LJI(this);
        if (fragmentLJI2 != null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJI2, null);
            C1558520qew.LJII(interfaceC665370Q7zLJFF, Lo().LIZ(), MessageListAbilityHolder.class, null, null);
            C1558520qew.LJII(interfaceC665370Q7zLJFF, Lo().LIZ(), MessagePowerListAbility.class, null, null);
            C1558520qew.LJII(interfaceC665370Q7zLJFF, Lo().LIZ(), MessageListScrollAbility.class, null, null);
            C1558520qew.LJII(interfaceC665370Q7zLJFF, Lo().LIZ(), MessageListHasRenderedProvider.class, null, null);
            C1558520qew.LJII(interfaceC665370Q7zLJFF, Lo().LIZ(), ChatroomEventAbility.class, null, null);
        }
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C23250099c.LIZLLL(lifecycleScope, abstractC2238408pq.LLIILII(), null, new C903530ZcV(c904680ZeMLo, this, null), 2);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), abstractC2238408pq.LLIILII(), null, new C903540ZcW(c904680ZeMLo, this, null), 2);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), abstractC2238408pq.LLIILII(), null, new C903560ZcY(c904680ZeMLo, this, null), 2);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), abstractC2238408pq.LLIILII(), null, new C903550ZcX(c904680ZeMLo, this, null), 2);
        Jo().setLifecycleOwner(this);
        if (C1704806ly.LIZ()) {
            mapLIZ = C2097608Jq.LJ();
        } else {
            List<C869590Y9l> listLIZLLL = ((InterfaceC1755906uD) Lo().LIZ.LJIIIZ.getValue()).LIZLLL();
            if (listLIZLLL.isEmpty() && ((c0y8tLJ = C0YNP.LIZIZ(Oo().getConversationId()).LJ()) == null || (lastShowMessage = c0y8tLJ.getLastShowMessage()) == null || (listLIZLLL = Collections.singletonList(lastShowMessage)) == null)) {
                listLIZLLL = C13BV.INSTANCE;
            }
            C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
            List listLIZIZ = C1554610qYd.LIZIZ(C1558520qew.LJIIL(this), IMMessageListProtocol.class, false);
            if (listLIZIZ != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : (ArrayList) listLIZIZ) {
                    if (((InterfaceC902770ZbH) obj).isEnabled()) {
                        arrayList.add(obj);
                    }
                }
                c13dvLIZIZ.addAll(arrayList);
            }
            List listLIZIZ2 = C1554610qYd.LIZIZ(C1558520qew.LJIIL(this), SkeletonMessageListProtocol.class, false);
            if (listLIZIZ2 != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : (ArrayList) listLIZIZ2) {
                    if (((InterfaceC902770ZbH) obj2).isEnabled()) {
                        arrayList2.add(obj2);
                    }
                }
                c13dvLIZIZ.addAll(arrayList2);
            }
            List<InterfaceC902770ZbH> listLJLLLL = C13LP.LJLLLL(new AComparatorS33S0000000_14(18), C1697820uHc.LIZ(c13dvLIZIZ));
            List<C869590Y9l> listLL = C13LP.LL(listLIZLLL, ((MessageListPreloadData) C903620Zce.LIZIZ.getValue()).preloadSize);
            final ArrayList arrayList3 = new ArrayList();
            for (C869590Y9l c869590Y9l : listLL) {
                for (InterfaceC902770ZbH interfaceC902770ZbH : listLJLLLL) {
                    if (interfaceC902770ZbH.getMsgHandlerCheck().LIZ(c869590Y9l)) {
                        if (interfaceC902770ZbH instanceof SkeletonMessageListProtocol) {
                            SkeletonMessageListProtocol skeletonMessageListProtocol = (SkeletonMessageListProtocol) interfaceC902770ZbH;
                            if (C0ZDX.LJJJJIZL(c869590Y9l)) {
                                clsGr = skeletonMessageListProtocol.da();
                            } else {
                                clsGr = skeletonMessageListProtocol.gr();
                            }
                        } else if (interfaceC902770ZbH instanceof IMMessageListProtocol) {
                            clsGr = ((InterfaceC902800ZbK) interfaceC902770ZbH).getWithCell();
                        }
                        if (clsGr != null) {
                            arrayList3.add(clsGr);
                        }
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            mapLIZ = C08SO.LIZ(new C08SN<Class<? extends PowerCell<? extends InterfaceC1891350zJl>>, Class<? extends PowerCell<? extends InterfaceC1891350zJl>>>() { // from class: X.0HkW
                @Override // X.C08SN
                public final Iterator<Class<? extends PowerCell<? extends InterfaceC1891350zJl>>> LIZ() {
                    return arrayList3.iterator();
                }

                @Override // X.C08SN
                public final Class<? extends PowerCell<? extends InterfaceC1891350zJl>> LIZIZ(Class<? extends PowerCell<? extends InterfaceC1891350zJl>> cls) {
                    return cls;
                }
            });
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvJo = Jo();
        C20603715jn c20603715jn = new C20603715jn();
        c20603715jn.LIZJ = false;
        c20603715jn.LIZ = 0;
        c20603715jn.LJ = ((Boolean) this.LLJLLIL.getValue()).booleanValue();
        c20603715jn.LJI = true;
        c20603715jn.LJFF = C1704806ly.LIZ();
        c20603715jn.LJIJJ = C1704806ly.LIZ();
        c20603715jn.LJIL = C0BQN.LIZ();
        c20603715jn.LJIIIZ = "im_powerlist";
        if (c20603715jn.LJ) {
            executor = (Executor) this.LLJLLL.getValue();
        } else {
            executor = null;
        }
        c20603715jn.LJII = executor;
        if (!mapLIZ.isEmpty()) {
            if (C0BQN.LIZ()) {
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvJo2 = Jo();
                Class[] clsArr = (Class[]) mapLIZ.keySet().toArray(new Class[0]);
                viewOnAttachStateChangeListenerC20604515jvJo2.LJIILJJIL((Class[]) Arrays.copyOf(clsArr, clsArr.length));
            }
            c20603715jn.LJIIIIZZ = new OptimizeAbility(0, true, mapLIZ);
        }
        viewOnAttachStateChangeListenerC20604515jvJo.setListConfig(c20603715jn);
        final ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvJo3 = Jo();
        viewOnAttachStateChangeListenerC20604515jvJo3.setClickable(true);
        viewOnAttachStateChangeListenerC20604515jvJo3.setLayoutManager((RecyclerView.LayoutManager) this.LLJJIJIL.getValue());
        viewOnAttachStateChangeListenerC20604515jvJo3.setClipChildren(false);
        viewOnAttachStateChangeListenerC20604515jvJo3.setVerticalScrollBarEnabled(true);
        viewOnAttachStateChangeListenerC20604515jvJo3.setScrollBarStyle(33554432);
        viewOnAttachStateChangeListenerC20604515jvJo3.setItemAnimator((AbstractC21673719rz) this.LLL.getValue());
        viewOnAttachStateChangeListenerC20604515jvJo3.addItemDecoration(new C0IDG(10));
        C902930ZbX c902930ZbX = (C902930ZbX) this.LLJJJJLIIL.getValue();
        if (c902930ZbX != null && (list = c902930ZbX.LIZIZ) != null) {
            Iterator<C0DXR> it2 = list.iterator();
            while (it2.hasNext()) {
                viewOnAttachStateChangeListenerC20604515jvJo3.addItemDecoration(it2.next());
            }
        }
        EasterEggShareMessageAnimatorAbility easterEggShareMessageAnimatorAbility = (EasterEggShareMessageAnimatorAbility) this.LLJJJJ.getValue();
        if (easterEggShareMessageAnimatorAbility != null && ((Number) C0BCV.LIZ.getValue()).intValue() == 0) {
            easterEggShareMessageAnimatorAbility.LLILLJJLI = viewOnAttachStateChangeListenerC20604515jvJo3;
        }
        viewOnAttachStateChangeListenerC20604515jvJo3.requestDisallowInterceptTouchEvent(true);
        viewOnAttachStateChangeListenerC20604515jvJo3.setOnTouchListener(new ATListenerS339S0200000_12(viewOnAttachStateChangeListenerC20604515jvJo3, new GestureDetector(viewOnAttachStateChangeListenerC20604515jvJo3.getContext(), new C21648719nx() { // from class: X.0ZXN
            @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                AssemVMLazy assemVMLazy = this.LL.LLJILJILJ;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = IMMessagePowerListAssem.LLLIIL;
                PanelStateViewModel panelStateViewModel = (PanelStateViewModel) assemVMLazy.getValue();
                panelStateViewModel.jt(C1629106Zl.LL, panelStateViewModel.Ke().getValue().intValue());
                IMSelectTextAbility iMSelectTextAbility = (IMSelectTextAbility) C1558520qew.LIZ(C1558360qeg.LJ(viewOnAttachStateChangeListenerC20604515jvJo3, null), IMSelectTextAbility.class, null);
                if (iMSelectTextAbility != null) {
                    iMSelectTextAbility.dl0(C0ZLS.TAP_OUTSIDE);
                }
                return super.onSingleTapUp(motionEvent);
            }
        }), 1));
        viewOnAttachStateChangeListenerC20604515jvJo3.addOnScrollListener(new AsS31S0200000_14(this, viewOnAttachStateChangeListenerC20604515jvJo3, 0));
        if (Oo().isChatroomInteractionBlocked()) {
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvJo4 = Jo();
            if ((viewOnAttachStateChangeListenerC20604515jvJo4 instanceof C907190ZiP) && (c907190ZiP = (C907190ZiP) viewOnAttachStateChangeListenerC20604515jvJo4) != null) {
                c907190ZiP.setInteractionBlocked(true);
            }
        }
        if (C898030ZKv.LIZ() && (fragmentLJI = C724240Sb0.LJI(this)) != null) {
            final InterfaceC665370Q7z interfaceC665370Q7zLJFF2 = C1558360qeg.LJFF(fragmentLJI, null);
            final ?? r2 = new OnChatRoomTouchListener() { // from class: com.ss.android.ugc.aweme.im.messagelist.ui.IMMessagePowerListAssem$registerOutsideTapToDismissSelection$1
                @Override // com.ss.android.ugc.aweme.im.messagelist.perf.OnChatRoomTouchListener
                public final void vx(MotionEvent motionEvent) {
                    IMSelectTextAbility iMSelectTextAbility;
                    if (motionEvent.getActionMasked() != 0) {
                        return;
                    }
                    IMMessagePowerListAssem iMMessagePowerListAssem = this.LL;
                    int[] iArr = new int[2];
                    iMMessagePowerListAssem.Jo().getLocationOnScreen(iArr);
                    int i = iArr[0];
                    if (!new Rect(i, iArr[1], iMMessagePowerListAssem.Jo().getWidth() + i, iArr[1] + iMMessagePowerListAssem.Jo().getHeight()).contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY()) && (iMSelectTextAbility = (IMSelectTextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), IMSelectTextAbility.class, null)) != null) {
                        iMSelectTextAbility.dl0(C0ZLS.TAP_OUTSIDE);
                    }
                }
            };
            C1554610qYd.LIZJ(interfaceC665370Q7zLJFF2, OnChatRoomTouchListener.class, C1697810uHb.LJIILJJIL(r2));
            Lifecycle lifecycle = getLifecycle();
            if (lifecycle != null) {
                lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.im.messagelist.ui.IMMessagePowerListAssem$registerOutsideTapToDismissSelection$$inlined$registerProtocol$1
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        if (event == Lifecycle.Event.ON_DESTROY) {
                            C1554610qYd.LIZLLL(interfaceC665370Q7zLJFF2, OnChatRoomTouchListener.class, r2);
                        }
                    }
                });
            }
        }
        C1512805w6 c1512805w6 = new C1512805w6("im_message_power_list_biz_logic_on_view_created");
        C1366690lfX c1366690lfX = DurationPerfMon.LIZ;
        c1366690lfX.LIZIZ(c1512805w6, false);
        if (C1704806ly.LIZ()) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), this.LLJZ, null, new C903510ZcT(this, null), 2);
        } else {
            C903590Zcb c903590Zcb = (C903590Zcb) this.LLJJL.getValue();
            if (c903590Zcb != null && (function2 = c903590Zcb.LIZIZ) != null) {
                function2.invoke(this, Jo());
            }
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), this.LLJZ, null, new C903520ZcU(this, null), 2);
        c1366690lfX.LIZJ(c1512805w6, C1661806f2.LIZLLL);
        Map mapLIZJ = C2097908Jt.LIZJ(new Pair("unread_count", String.valueOf(Oo().getUnreadCount())));
        C1634806ag c1634806ag = this.LLJILJIL;
        c1366690lfX.LIZJ(c1634806ag, new C1660106el(c1634806ag.LJ, EnumC738160SxS.ON_VIEW_CREATED, mapLIZJ));
        IIMSendMsgUxAnalytics iIMSendMsgUxAnalytics = (IIMSendMsgUxAnalytics) PluggableExtentionKt.pluggableSpiForReal(IIMSendMsgUxAnalytics.class);
        if (iIMSendMsgUxAnalytics != null) {
            iIMSendMsgUxAnalytics.LIZLLL();
        }
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C0QSJ c0qsjLIZIZ = C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{ChatRoomScope.class});
        c0qsjLIZIZ.bindAbility(this.LLIZLLLIL.getValue(), InterfaceC459890I1r.class);
        c0qsjLIZIZ.bindAbility(this.LLJJJ.getValue(), InterfaceC904700ZeO.class);
        c0qsjLIZIZ.bindAbility(this, MessageListInteractionAbility.class);
        c0qsjLIZIZ.bindAbility(So(), MessagePowerListAbility.class);
        c0qsjLIZIZ.bindAbility(So(), MessageListScrollAbility.class);
        c0qsjLIZIZ.bindAbility(So(), MessageListHasRenderedProvider.class);
        c0qsjLIZIZ.bindAbility(So(), ChatroomEventAbility.class);
        c0qsjLIZIZ.bindAbility(So(), C0NZW.class);
        c0qsjLIZIZ.bindAbility(So(), InterfaceC903640Zcg.class);
    }
}
