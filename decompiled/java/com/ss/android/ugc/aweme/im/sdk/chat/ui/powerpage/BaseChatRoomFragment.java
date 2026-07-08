package com.ss.android.ugc.aweme.im.sdk.chat.ui.powerpage;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C06GX;
import X.C098200Yq;
import X.C0HV6;
import X.C0I0B;
import X.C0I20;
import X.C0I4X;
import X.C0NZW;
import X.C0QSJ;
import X.C0VWN;
import X.C0ZZ4;
import X.C1308910kAL;
import X.C1366690lfX;
import X.C13LE;
import X.C1512805w6;
import X.C1554610qYd;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1622206Wu;
import X.C1661806f2;
import X.C1685300txQ;
import X.C1716106nn;
import X.C1716806nu;
import X.C1766560w4U;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C2217381BqS;
import X.C2250591D6z;
import X.C283830BAn;
import X.C288960BUg;
import X.C289880BXu;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C673150Qan;
import X.C687700QyG;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C817570W5j;
import X.C876310YZh;
import X.C876340YZk;
import X.C883540YlM;
import X.C895630ZBp;
import X.C899550ZQr;
import X.C907170ZiN;
import X.C912070ZqH;
import X.C913160Zs2;
import X.C913170Zs3;
import X.C913310ZsH;
import X.C960203pA;
import X.C987103tV;
import X.EnumC883570YlP;
import X.InterfaceC1146704e9;
import X.InterfaceC1602806Pi;
import X.InterfaceC1602960roc;
import X.InterfaceC1655706e3;
import X.InterfaceC1693006k4;
import X.InterfaceC1743706sF;
import X.InterfaceC2217461Bqa;
import X.InterfaceC441960HUs;
import X.InterfaceC451590HnJ;
import X.InterfaceC456460HvA;
import X.InterfaceC456500HvE;
import X.InterfaceC456680HvW;
import X.InterfaceC456690HvX;
import X.InterfaceC459890I1r;
import X.InterfaceC687730QyJ;
import X.InterfaceC724760Sbq;
import X.InterfaceC744180THc;
import X.InterfaceC889250YuZ;
import X.InterfaceC903640Zcg;
import X.InterfaceC904700ZeO;
import X.InterfaceC911210Zot;
import X.InterfaceC913150Zs1;
import X.InterfaceC913290ZsF;
import Y.AUListenerS263S0100000_14;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.GroupChatProtocol;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.base.component.AnalysisActivityComponent;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.actionbar.api.ability.ActionBarDataAssemUnloadAbility;
import com.ss.android.ugc.aweme.im.ai.api.smartreply.SmartReplyChatRoomAbility;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.IInputFieldAbility;
import com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.InputFieldVM;
import com.ss.android.ugc.aweme.im.common.api.ChatRoomAdaptiveRequestManager;
import com.ss.android.ugc.aweme.im.common.perfmonitor.api.DurationPerfMon;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.ChatroomEventAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListHasRenderedProvider;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListInteractionAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListScrollAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessagePowerListAbility;
import com.ss.android.ugc.aweme.im.messagelist.perf.MessageListCLSTracker;
import com.ss.android.ugc.aweme.im.push.api.IMPushApi;
import com.ss.android.ugc.aweme.im.saas.host.api.foundation.IMFoundationBridgeApi;
import com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMChatFunnelAnalytics;
import com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMChatRoomAnalytics;
import com.ss.android.ugc.aweme.im.sdk.common.controller.analytics.IMAnalyticsUtil;
import com.ss.android.ugc.aweme.im.service.IAwemeImManager;
import com.ss.android.ugc.aweme.im.service.analytics.IIMChatPerfLogger;
import com.ss.android.ugc.aweme.im.service.network.IMChatRoomNetDispatchConfigService;
import com.ss.android.ugc.aweme.im.service.resourcemanage.IDMResourceManagementService;
import com.ss.android.ugc.aweme.viewmodel.Photo2StickerCreateEventAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public abstract class BaseChatRoomFragment extends BaseFragment implements InterfaceC744180THc, C0QSJ, InterfaceC1146704e9 {
    public static final C913170Zs3 LLLIZZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLJ;
    public View LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public AnalysisActivityComponent LLJI;
    public final C2250591D6z LLJIJIL;
    public SessionInfo LLJILJIL;
    public Integer LLJILJILJ;
    public final AssemVMLazy LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final AUListenerS263S0100000_14 LLJJIJIIJIL;
    public final BPEAHandler LLJJIJIL;
    public InterfaceC1655706e3 LLJJJ;
    public ActionBarDataAssemUnloadAbility LLJJJIL;
    public InterfaceC456500HvE LLJJJJ;
    public InterfaceC1743706sF LLJJJJJIL;
    public SessionInfo LLJJJJLIIL;
    public IInputFieldAbility LLJJL;
    public C0HV6 LLJJLIIIJLLLLLLLZ;
    public InterfaceC1602806Pi LLJL;
    public InterfaceC459890I1r LLJLIL;
    public InterfaceC904700ZeO LLJLILLLLZIIL;
    public MessageListInteractionAbility LLJLL;
    public InterfaceC911210Zot LLJLLIL;
    public MessageListCLSTracker LLJLLL;
    public C0ZZ4 LLJZ;
    public MessagePowerListAbility LLJZIJLIL;
    public MessageListScrollAbility LLL;
    public MessageListHasRenderedProvider LLLF;
    public ChatroomEventAbility LLLFF;
    public C0NZW LLLFFI;
    public InterfaceC903640Zcg LLLFZ;
    public C0I4X LLLI;
    public C899550ZQr LLLII;
    public InterfaceC456680HvW LLLIIII;
    public C0I20 LLLIIIIL;
    public InterfaceC456460HvA LLLIIIL;
    public InterfaceC889250YuZ LLLIIL;
    public InterfaceC441960HUs LLLIILIL;
    public InterfaceC1693006k4 LLLIL;
    public InterfaceC456690HvX LLLILZ;
    public Photo2StickerCreateEventAbility LLLILZJ;
    public List<InterfaceC687730QyJ> LLLILZLLLI;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0Zs3] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BaseChatRoomFragment.class, "ttDispatchers", "getTtDispatchers()Lcom/ss/android/ugc/aweme/utils/dispatchers/TTDispatchers;", 0);
        C13LE.LIZ.getClass();
        LLLJ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(BaseChatRoomFragment.class, "inputFieldVM", "getInputFieldVM()Lcom/ss/android/ugc/aweme/im/chatroom/input/components/inputfield/InputFieldVM;", 0)};
        LLLIZZ = new Object() { // from class: X.0Zs3
        };
    }

    public abstract EnterChatParams SR();

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == InterfaceC1655706e3.class) {
            this.LLJJJ = (InterfaceC1655706e3) obj;
        } else if (cls == ActionBarDataAssemUnloadAbility.class) {
            this.LLJJJIL = (ActionBarDataAssemUnloadAbility) obj;
        } else if (cls == InterfaceC456500HvE.class) {
            this.LLJJJJ = (InterfaceC456500HvE) obj;
        } else if (cls == InterfaceC1743706sF.class) {
            this.LLJJJJJIL = (InterfaceC1743706sF) obj;
        } else if (cls == SessionInfo.class) {
            this.LLJJJJLIIL = (SessionInfo) obj;
        } else if (cls == IInputFieldAbility.class) {
            this.LLJJL = (IInputFieldAbility) obj;
        } else if (cls == C0HV6.class) {
            this.LLJJLIIIJLLLLLLLZ = (C0HV6) obj;
        } else if (cls == InterfaceC1602806Pi.class) {
            this.LLJL = (InterfaceC1602806Pi) obj;
        } else if (cls == InterfaceC459890I1r.class) {
            this.LLJLIL = (InterfaceC459890I1r) obj;
        } else if (cls == InterfaceC904700ZeO.class) {
            this.LLJLILLLLZIIL = (InterfaceC904700ZeO) obj;
        } else if (cls == MessageListInteractionAbility.class) {
            this.LLJLL = (MessageListInteractionAbility) obj;
        } else if (cls == InterfaceC911210Zot.class) {
            this.LLJLLIL = (InterfaceC911210Zot) obj;
        } else if (cls == MessageListCLSTracker.class) {
            this.LLJLLL = (MessageListCLSTracker) obj;
        } else if (cls == C0ZZ4.class) {
            this.LLJZ = (C0ZZ4) obj;
        } else if (cls == MessagePowerListAbility.class) {
            this.LLJZIJLIL = (MessagePowerListAbility) obj;
        } else if (cls == MessageListScrollAbility.class) {
            this.LLL = (MessageListScrollAbility) obj;
        } else {
            if (cls == MessageListHasRenderedProvider.class) {
                this.LLLF = (MessageListHasRenderedProvider) obj;
            } else if (cls == ChatroomEventAbility.class) {
                this.LLLFF = (ChatroomEventAbility) obj;
            } else if (cls == C0NZW.class) {
                this.LLLFFI = (C0NZW) obj;
            } else if (cls == InterfaceC903640Zcg.class) {
                this.LLLFZ = (InterfaceC903640Zcg) obj;
            } else if (cls == C0I4X.class) {
                this.LLLI = (C0I4X) obj;
            } else if (cls == C899550ZQr.class) {
                this.LLLII = (C899550ZQr) obj;
            } else if (cls == InterfaceC456680HvW.class) {
                this.LLLIIII = (InterfaceC456680HvW) obj;
            } else if (cls == C0I20.class) {
                this.LLLIIIIL = (C0I20) obj;
            } else if (cls == InterfaceC456460HvA.class) {
                this.LLLIIIL = (InterfaceC456460HvA) obj;
            } else if (cls == InterfaceC889250YuZ.class) {
                this.LLLIIL = (InterfaceC889250YuZ) obj;
            } else if (cls == InterfaceC441960HUs.class) {
                this.LLLIILIL = (InterfaceC441960HUs) obj;
            } else if (cls == InterfaceC1693006k4.class) {
                this.LLLIL = (InterfaceC1693006k4) obj;
            } else if (cls == InterfaceC456690HvX.class) {
                this.LLLILZ = (InterfaceC456690HvX) obj;
            } else if (cls == Photo2StickerCreateEventAbility.class) {
                this.LLLILZJ = (Photo2StickerCreateEventAbility) obj;
            }
            C687700QyG.LJFF(this, this.LLLILZLLLI, obj, cls);
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{ChatRoomScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == InterfaceC1655706e3.class) {
            return this.LLJJJ;
        }
        if (cls == ActionBarDataAssemUnloadAbility.class) {
            return this.LLJJJIL;
        }
        if (cls == InterfaceC456500HvE.class) {
            return this.LLJJJJ;
        }
        if (cls == InterfaceC1743706sF.class) {
            return this.LLJJJJJIL;
        }
        if (cls == SessionInfo.class) {
            return this.LLJJJJLIIL;
        }
        if (cls == IInputFieldAbility.class) {
            return this.LLJJL;
        }
        if (cls == C0HV6.class) {
            return this.LLJJLIIIJLLLLLLLZ;
        }
        if (cls == InterfaceC1602806Pi.class) {
            return this.LLJL;
        }
        if (cls == InterfaceC459890I1r.class) {
            return this.LLJLIL;
        }
        if (cls == InterfaceC904700ZeO.class) {
            return this.LLJLILLLLZIIL;
        }
        if (cls == MessageListInteractionAbility.class) {
            return this.LLJLL;
        }
        if (cls == InterfaceC911210Zot.class) {
            return this.LLJLLIL;
        }
        if (cls == MessageListCLSTracker.class) {
            return this.LLJLLL;
        }
        if (cls == C0ZZ4.class) {
            return this.LLJZ;
        }
        if (cls == MessagePowerListAbility.class) {
            return this.LLJZIJLIL;
        }
        if (cls == MessageListScrollAbility.class) {
            return this.LLL;
        }
        if (cls == MessageListHasRenderedProvider.class) {
            return this.LLLF;
        }
        if (cls == ChatroomEventAbility.class) {
            return this.LLLFF;
        }
        if (cls == C0NZW.class) {
            return this.LLLFFI;
        }
        if (cls == InterfaceC903640Zcg.class) {
            return this.LLLFZ;
        }
        if (cls == C0I4X.class) {
            return this.LLLI;
        }
        if (cls == C899550ZQr.class) {
            return this.LLLII;
        }
        if (cls == InterfaceC456680HvW.class) {
            return this.LLLIIII;
        }
        if (cls == C0I20.class) {
            return this.LLLIIIIL;
        }
        if (cls == InterfaceC456460HvA.class) {
            return this.LLLIIIL;
        }
        if (cls == InterfaceC889250YuZ.class) {
            return this.LLLIIL;
        }
        if (cls == InterfaceC441960HUs.class) {
            return this.LLLIILIL;
        }
        if (cls == InterfaceC1693006k4.class) {
            return this.LLLIL;
        }
        if (cls == InterfaceC456690HvX.class) {
            return this.LLLILZ;
        }
        if (cls == Photo2StickerCreateEventAbility.class) {
            return this.LLLILZJ;
        }
        return null;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ChatRoomScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ChatRoomScope.class);
        return arrayList;
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == InterfaceC1655706e3.class) {
            this.LLJJJ = null;
        } else if (cls == ActionBarDataAssemUnloadAbility.class) {
            this.LLJJJIL = null;
        } else if (cls == InterfaceC456500HvE.class) {
            this.LLJJJJ = null;
        } else if (cls == InterfaceC1743706sF.class) {
            this.LLJJJJJIL = null;
        } else if (cls == SessionInfo.class) {
            this.LLJJJJLIIL = null;
        } else if (cls == IInputFieldAbility.class) {
            this.LLJJL = null;
        } else if (cls == C0HV6.class) {
            this.LLJJLIIIJLLLLLLLZ = null;
        } else if (cls == InterfaceC1602806Pi.class) {
            this.LLJL = null;
        } else if (cls == InterfaceC459890I1r.class) {
            this.LLJLIL = null;
        } else if (cls == InterfaceC904700ZeO.class) {
            this.LLJLILLLLZIIL = null;
        } else if (cls == MessageListInteractionAbility.class) {
            this.LLJLL = null;
        } else if (cls == InterfaceC911210Zot.class) {
            this.LLJLLIL = null;
        } else if (cls == MessageListCLSTracker.class) {
            this.LLJLLL = null;
        } else if (cls == C0ZZ4.class) {
            this.LLJZ = null;
        } else if (cls == MessagePowerListAbility.class) {
            this.LLJZIJLIL = null;
        } else if (cls == MessageListScrollAbility.class) {
            this.LLL = null;
        } else if (cls == MessageListHasRenderedProvider.class) {
            this.LLLF = null;
        } else if (cls == ChatroomEventAbility.class) {
            this.LLLFF = null;
        } else if (cls == C0NZW.class) {
            this.LLLFFI = null;
        } else if (cls == InterfaceC903640Zcg.class) {
            this.LLLFZ = null;
        } else if (cls == C0I4X.class) {
            this.LLLI = null;
        } else if (cls == C899550ZQr.class) {
            this.LLLII = null;
        } else if (cls == InterfaceC456680HvW.class) {
            this.LLLIIII = null;
        } else if (cls == C0I20.class) {
            this.LLLIIIIL = null;
        } else if (cls == InterfaceC456460HvA.class) {
            this.LLLIIIL = null;
        } else if (cls == InterfaceC889250YuZ.class) {
            this.LLLIIL = null;
        } else if (cls == InterfaceC441960HUs.class) {
            this.LLLIILIL = null;
        } else if (cls == InterfaceC1693006k4.class) {
            this.LLLIL = null;
        } else if (cls == InterfaceC456690HvX.class) {
            this.LLLILZ = null;
        } else if (cls == Photo2StickerCreateEventAbility.class) {
            this.LLLILZJ = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
        List<InterfaceC687730QyJ> list = this.LLLILZLLLI;
        if (list == null) {
            return;
        }
        ((ArrayList) list).remove(interfaceC687730QyJ);
    }

    public BaseChatRoomFragment() {
        AssemVMLazy assemVMLazy;
        C0VWN.LIZ("enter_chat_fps", false).start();
        IIMChatPerfLogger.LIZ.getClass();
        IIMChatPerfLogger iIMChatPerfLoggerLIZ = C907170ZiN.LIZ();
        if (iIMChatPerfLoggerLIZ != null) {
            iIMChatPerfLoggerLIZ.LIZLLL();
        }
        this.LLIZLLLIL = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(211));
        this.LLJ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(212));
        this.LLJIJIL = new C2250591D6z(new AwS558S0100000_14(this, 842));
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(InputFieldVM.class);
        AwS546S0100000_2 awS546S0100000_2 = new AwS546S0100000_2(c19719912DlLIZ, 556);
        AFwS248S0000000_14 aFwS248S0000000_14 = AFwS248S0000000_14.get$arr$(238);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS546S0100000_2, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS558S0100000_14((HasDefaultViewModelProviderFactory) this, 839), aFwS248S0000000_14, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS546S0100000_2, new AwS558S0100000_14((Fragment) this, 840), aFwS248S0000000_14, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS546S0100000_2, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS558S0100000_14((HasDefaultViewModelProviderFactory) this, 841), aFwS248S0000000_14, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJILLL = assemVMLazy;
        this.LLJJ = C452501pT.LIZIZ(new AwS546S0100000_2(this, 555));
        this.LLJJI = C452501pT.LIZIZ(new AwS546S0100000_2(this, 554));
        this.LLJJIII = C452501pT.LIZIZ(new AwS558S0100000_14(this, 837));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS558S0100000_14(this, 838));
        this.LLJJIJIIJIL = new AUListenerS263S0100000_14(this, 0);
        this.LLJJIJIL = new BPEAHandler(Looper.getMainLooper());
    }

    @Override // X.InterfaceC744180THc
    public final Analysis getAnalysis() {
        String str;
        SessionInfo sessionInfo = this.LLJILJIL;
        if (sessionInfo == null || !sessionInfo.isSingleChat()) {
            SessionInfo sessionInfo2 = this.LLJILJIL;
            str = (sessionInfo2 == null || !sessionInfo2.isGroupChat()) ? null : "group";
        } else {
            str = "private";
        }
        Analysis analysis = new Analysis();
        analysis.setLabelName("chat");
        analysis.setCategory(str);
        IMChatRoomAnalytics iMChatRoomAnalytics = IMChatRoomAnalytics.LIZIZ;
        SessionInfo sessionInfo3 = this.LLJILJIL;
        iMChatRoomAnalytics.getClass();
        analysis.setExt_json(IMChatRoomAnalytics.LJII(sessionInfo3));
        return analysis;
    }

    public final View getRootView() {
        View view = this.LLIZ;
        if (view != null) {
            return view;
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        ((InterfaceC1602960roc) this.LLJ.getValue()).stop();
        super.onStop();
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        Window window;
        super.onDestroy();
        ((IDMResourceManagementService) ServiceManager.get().getService(IDMResourceManagementService.class)).LIZJ();
        Integer num = this.LLJILJILJ;
        if (num != null) {
            int iIntValue = num.intValue();
            C19EG activity = getActivity();
            if (activity != null && (window = activity.getWindow()) != null) {
                window.setSoftInputMode(iIntValue);
            }
        }
        LLLIZZ.getClass();
        IMAnalyticsUtil.LJIIIIZZ();
        IMChatRoomNetDispatchConfigService.LIZ.getClass();
        IMChatRoomNetDispatchConfigService iMChatRoomNetDispatchConfigServiceLIZ = C883540YlM.LIZ();
        if (iMChatRoomNetDispatchConfigServiceLIZ != null) {
            iMChatRoomNetDispatchConfigServiceLIZ.LIZ();
        }
        InterfaceC913150Zs1.LIZ.getClass();
        InterfaceC913150Zs1 value = C913160Zs2.LIZIZ.getValue();
        if (value != null) {
            value.LIZ();
        }
        ChatRoomAdaptiveRequestManager.LIZ.LJLJL();
        this.LLJI = null;
        ((InterfaceC913290ZsF) ServiceManager.get().getService(ILightInteractionPlatformService.class)).LJJJJL();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.LLJIJIL.LIZ();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        IMFoundationBridgeApi.LIZ.getClass();
        IMFoundationBridgeApi iMFoundationBridgeApiLIZ = C895630ZBp.LIZ();
        if (iMFoundationBridgeApiLIZ != null) {
            iMFoundationBridgeApiLIZ.LJIIIZ("ChatPage");
        }
        this.LLJIJIL.LIZIZ();
        if (((Boolean) C283830BAn.LIZ.getValue()).booleanValue()) {
            Context context = getContext();
            boolean z = context != null && C960203pA.LIZIZ(context);
            TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(this);
            tuxImmersionBarLIZLLL.LIZIZ.LJIIL();
            tuxImmersionBarLIZLLL.LIZIZ.LJIIJ(!z);
            tuxImmersionBarLIZLLL.LIZ(false);
            tuxImmersionBarLIZLLL.LIZLLL();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        SessionInfo sessionInfo;
        super.onStart();
        Context context = getContext();
        if (context == null || (sessionInfo = this.LLJILJIL) == null) {
            return;
        }
        IMPushApi.LIZ.getClass();
        C817570W5j.LIZ().LIZJ().LJ(context, sessionInfo.getConversationId(), sessionInfo.getChatType(), sessionInfo.getEnterFromForMob());
        ((InterfaceC1602960roc) this.LLJ.getValue()).start();
        InterfaceC1602960roc interfaceC1602960roc = (InterfaceC1602960roc) this.LLJ.getValue();
        SessionInfo sessionInfo2 = this.LLJILJIL;
        interfaceC1602960roc.LJIIJJI(Integer.valueOf(sessionInfo2 != null ? sessionInfo2.getChatType() : -1), "chat_type");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0169  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void UR(boolean r18) {
        /*
            Method dump skipped, instruction units count: 954
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.ui.powerpage.BaseChatRoomFragment.UR(boolean):void");
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Bundle arguments;
        super.onCreate(bundle);
        IMChatFunnelAnalytics.LIZIZ.LIZJ(C0I0B.LJFF.LIZIZ());
        if (bundle == null) {
            DurationPerfMon.LIZ.LIZJ(new C1512805w6("chatroom_navigation"), C1661806f2.LIZLLL);
        }
        ((C876310YZh) C876340YZk.LIZ(C876340YZk.LIZ)).LIZJ(EnumC883570YlP.ENTER_CHAT_ROOM);
        if (bundle != null && (arguments = getArguments()) != null) {
            C786410Ut5.LJJIIJZLJL(arguments, bundle);
        }
        UR(false);
        C19EG activity = getActivity();
        if (activity != null) {
            this.LLJILJILJ = Integer.valueOf(activity.getWindow().getAttributes().softInputMode);
            activity.getWindow().setSoftInputMode(48);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zm, activity);
            if (numLIZJ != null) {
                activity.getWindow().getDecorView().setBackgroundColor(numLIZJ.intValue());
            }
        }
        this.LLJI = new AnalysisActivityComponent(this);
        ((IAwemeImManager) ServiceManager.get().getService(IAwemeImManager.class)).LJ();
        C1766560w4U.LIZLLL(this).LJ(((Number) this.LLIZLLLIL.getValue()).intValue());
        NR(new AwS593S0100000_14(this, 356));
        if (C1716106nn.LIZ() || C06GX.LIZ()) {
            C1716806nu.LIZ();
        }
        if (!C289880BXu.LIZIZ()) {
            ChatRoomAdaptiveRequestManager.LIZ.LJLL(AFwS201S0000000_14.get$arr$(213));
            if (C288960BUg.LIZ()) {
                C912070ZqH.LIZIZ.LJIIZILJ().LIZ();
            }
        }
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        SessionInfo sessionInfo = this.LLJILJIL;
        if (sessionInfo != null) {
            C786410Ut5.LJJIZ(bundle, "key_session_info", sessionInfo);
        }
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
        if (this.LLLILZLLLI == null) {
            this.LLLILZLLLI = new ArrayList();
        }
        ((ArrayList) this.LLLILZLLLI).add(interfaceC687730QyJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.ss.android.ugc.aweme.im.sdk.chat.ui.powerpage.BaseChatRoomFragment$initChatPanel$1] */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r9, android.os.Bundle r10) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.ui.powerpage.BaseChatRoomFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        List listLIZIZ = C1554610qYd.LIZIZ(C1558360qeg.LJFF(this, null), GroupChatProtocol.class, false);
        if (listLIZIZ != null) {
            Iterator it2 = ((ArrayList) listLIZIZ).iterator();
            while (it2.hasNext()) {
                ((GroupChatProtocol) it2.next()).onActivityResult(i, i2, intent);
            }
        }
        SmartReplyChatRoomAbility smartReplyChatRoomAbility = (SmartReplyChatRoomAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), SmartReplyChatRoomAbility.class, null);
        if (smartReplyChatRoomAbility != null) {
            smartReplyChatRoomAbility.onActivityResult(i, i2, intent);
        }
        C913310ZsH.LIZ(i, i2, intent, this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C1512805w6 c1512805w6 = new C1512805w6("charoom_fragment_inflate");
        C1366690lfX c1366690lfX = DurationPerfMon.LIZ;
        c1366690lfX.LIZIZ(c1512805w6, true);
        this.LLIZ = C786410Ut5.Td(layoutInflater, R.layout.ch5, viewGroup, false);
        c1366690lfX.LIZJ(c1512805w6, C1661806f2.LIZLLL);
        View rootView = getRootView();
        C19GS c19gs = null;
        if (!(rootView instanceof View)) {
            rootView = null;
        }
        if (rootView != null) {
            try {
                ViewTreeLifecycleOwner.set(rootView, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(rootView, this);
                rootView.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return rootView;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return rootView;
    }
}
