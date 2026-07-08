package com.ss.android.ugc.aweme.im.sdk.chat.ui.singleactivity;

import X.AbstractC21673619ry;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C06GX;
import X.C098200Yq;
import X.C0HSJ;
import X.C0HV6;
import X.C0I0B;
import X.C0I20;
import X.C0I4X;
import X.C0NZW;
import X.C0PEM;
import X.C0QSJ;
import X.C0TVI;
import X.C0VWN;
import X.C0Z53;
import X.C0ZH3;
import X.C0ZZ4;
import X.C1308910kAL;
import X.C1366690lfX;
import X.C1383370m6R;
import X.C13LE;
import X.C14K9;
import X.C1512805w6;
import X.C1554610qYd;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1622206Wu;
import X.C1661806f2;
import X.C1685300txQ;
import X.C1697810uHb;
import X.C1716106nn;
import X.C1716806nu;
import X.C1766560w4U;
import X.C189200o6;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20097313kJ;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2250591D6z;
import X.C2296808zG;
import X.C23250099c;
import X.C283830BAn;
import X.C288960BUg;
import X.C289880BXu;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C549720LhC;
import X.C673150Qan;
import X.C687700QyG;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C817570W5j;
import X.C876310YZh;
import X.C876340YZk;
import X.C883540YlM;
import X.C894660Z7w;
import X.C895630ZBp;
import X.C899550ZQr;
import X.C907170ZiN;
import X.C907190ZiP;
import X.C912070ZqH;
import X.C912930Zrf;
import X.C913160Zs2;
import X.C913300ZsG;
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
import X.InterfaceC550020Lhg;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC724760Sbq;
import X.InterfaceC744180THc;
import X.InterfaceC889250YuZ;
import X.InterfaceC903640Zcg;
import X.InterfaceC904700ZeO;
import X.InterfaceC911210Zot;
import X.InterfaceC913150Zs1;
import X.InterfaceC913290ZsF;
import Y.ARunnableS114S0100000_14;
import Y.AUListenerS263S0100000_14;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.SAFTikTokFragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.deeplink.glue.LinkPhase;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.system.TuxImmersionBar;
import com.ss.android.ugc.aweme.GroupChatProtocol;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.base.component.AnalysisActivityComponent;
import com.ss.android.ugc.aweme.chatroom.assembler.ChatRoomAssembler;
import com.ss.android.ugc.aweme.deeplink.IDeeplinkTrackingService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.actionbar.api.ability.ActionBarDataAssemUnloadAbility;
import com.ss.android.ugc.aweme.im.ai.api.smartreply.SmartReplyChatRoomAbility;
import com.ss.android.ugc.aweme.im.chatroom.api.gesture.ChatroomBackPressProtocol;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.IInputFieldAbility;
import com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.InputFieldVM;
import com.ss.android.ugc.aweme.im.common.api.ChatRoomAdaptiveRequestManager;
import com.ss.android.ugc.aweme.im.common.perfmonitor.api.DurationPerfMon;
import com.ss.android.ugc.aweme.im.common.protocol.ChatBackgroundColorProtocol;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.lightinteract.api.platform.service.ILightInteractionPlatformService;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.ChatroomEventAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListHasRenderedProvider;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListInteractionAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListScrollAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessagePowerListAbility;
import com.ss.android.ugc.aweme.im.messagelist.perf.MessageListCLSTracker;
import com.ss.android.ugc.aweme.im.messagelist.perf.OnChatRoomTouchListener;
import com.ss.android.ugc.aweme.im.push.api.IMPushApi;
import com.ss.android.ugc.aweme.im.saas.host.api.foundation.IMFoundationBridgeApi;
import com.ss.android.ugc.aweme.im.saas.host.api.im.utils.IMALogApi;
import com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMChatFunnelAnalytics;
import com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMChatRoomAnalytics;
import com.ss.android.ugc.aweme.im.sdk.common.controller.analytics.IMAnalyticsUtil;
import com.ss.android.ugc.aweme.im.service.IAwemeImManager;
import com.ss.android.ugc.aweme.im.service.analytics.IIMChatPerfLogger;
import com.ss.android.ugc.aweme.im.service.network.IMChatRoomNetDispatchConfigService;
import com.ss.android.ugc.aweme.im.service.resourcemanage.IDMResourceManagementService;
import com.ss.android.ugc.aweme.offline.dm.tools.debug.IDmToolsDebugService;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioEntranceControl;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository;
import com.ss.android.ugc.aweme.theater.service.IAITheaterFeatureService;
import com.ss.android.ugc.aweme.viewmodel.Photo2StickerCreateEventAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public abstract class BaseChatRootFragment extends SAFTikTokFragment implements InterfaceC744180THc, C0QSJ, InterfaceC1146704e9 {
    public static final C912930Zrf LLLLIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLILI;
    public View LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public AnalysisActivityComponent LLJJIJIIJIL;
    public final C2250591D6z LLJJIJIL;
    public SessionInfo LLJJJ;
    public Integer LLJJJIL;
    public final AssemVMLazy LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public boolean LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final AUListenerS263S0100000_14 LLJLIL;
    public final BPEAHandler LLJLILLLLZIIL;
    public InterfaceC1655706e3 LLJLL;
    public ActionBarDataAssemUnloadAbility LLJLLIL;
    public InterfaceC456500HvE LLJLLL;
    public InterfaceC1743706sF LLJZ;
    public SessionInfo LLJZIJLIL;
    public IInputFieldAbility LLL;
    public C0HV6 LLLF;
    public InterfaceC1602806Pi LLLFF;
    public InterfaceC459890I1r LLLFFI;
    public InterfaceC904700ZeO LLLFZ;
    public MessageListInteractionAbility LLLI;
    public InterfaceC911210Zot LLLII;
    public MessageListCLSTracker LLLIIII;
    public C0ZZ4 LLLIIIIL;
    public MessagePowerListAbility LLLIIIL;
    public MessageListScrollAbility LLLIIL;
    public MessageListHasRenderedProvider LLLIILIL;
    public ChatroomEventAbility LLLIL;
    public C0NZW LLLILZ;
    public InterfaceC903640Zcg LLLILZJ;
    public C0I4X LLLILZLLLI;
    public C899550ZQr LLLIZZ;
    public InterfaceC456680HvW LLLJ;
    public C0I20 LLLJIL;
    public InterfaceC456460HvA LLLJL;
    public InterfaceC889250YuZ LLLL;
    public InterfaceC441960HUs LLLLII;
    public InterfaceC1693006k4 LLLLIIIILLL;
    public InterfaceC456690HvX LLLLIIL;
    public Photo2StickerCreateEventAbility LLLLIILL;
    public List<InterfaceC687730QyJ> LLLLIILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BaseChatRootFragment.class, "ttDispatchers", "getTtDispatchers()Lcom/ss/android/ugc/aweme/utils/dispatchers/TTDispatchers;", 0);
        C13LE.LIZ.getClass();
        LLLLILI = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(BaseChatRootFragment.class, "inputFieldVM", "getInputFieldVM()Lcom/ss/android/ugc/aweme/im/chatroom/input/components/inputfield/InputFieldVM;", 0)};
        LLLLIL = new C912930Zrf();
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == InterfaceC1655706e3.class) {
            this.LLJLL = (InterfaceC1655706e3) obj;
        } else if (cls == ActionBarDataAssemUnloadAbility.class) {
            this.LLJLLIL = (ActionBarDataAssemUnloadAbility) obj;
        } else if (cls == InterfaceC456500HvE.class) {
            this.LLJLLL = (InterfaceC456500HvE) obj;
        } else if (cls == InterfaceC1743706sF.class) {
            this.LLJZ = (InterfaceC1743706sF) obj;
        } else if (cls == SessionInfo.class) {
            this.LLJZIJLIL = (SessionInfo) obj;
        } else if (cls == IInputFieldAbility.class) {
            this.LLL = (IInputFieldAbility) obj;
        } else if (cls == C0HV6.class) {
            this.LLLF = (C0HV6) obj;
        } else if (cls == InterfaceC1602806Pi.class) {
            this.LLLFF = (InterfaceC1602806Pi) obj;
        } else if (cls == InterfaceC459890I1r.class) {
            this.LLLFFI = (InterfaceC459890I1r) obj;
        } else if (cls == InterfaceC904700ZeO.class) {
            this.LLLFZ = (InterfaceC904700ZeO) obj;
        } else if (cls == MessageListInteractionAbility.class) {
            this.LLLI = (MessageListInteractionAbility) obj;
        } else if (cls == InterfaceC911210Zot.class) {
            this.LLLII = (InterfaceC911210Zot) obj;
        } else if (cls == MessageListCLSTracker.class) {
            this.LLLIIII = (MessageListCLSTracker) obj;
        } else if (cls == C0ZZ4.class) {
            this.LLLIIIIL = (C0ZZ4) obj;
        } else if (cls == MessagePowerListAbility.class) {
            this.LLLIIIL = (MessagePowerListAbility) obj;
        } else if (cls == MessageListScrollAbility.class) {
            this.LLLIIL = (MessageListScrollAbility) obj;
        } else {
            if (cls == MessageListHasRenderedProvider.class) {
                this.LLLIILIL = (MessageListHasRenderedProvider) obj;
            } else if (cls == ChatroomEventAbility.class) {
                this.LLLIL = (ChatroomEventAbility) obj;
            } else if (cls == C0NZW.class) {
                this.LLLILZ = (C0NZW) obj;
            } else if (cls == InterfaceC903640Zcg.class) {
                this.LLLILZJ = (InterfaceC903640Zcg) obj;
            } else if (cls == C0I4X.class) {
                this.LLLILZLLLI = (C0I4X) obj;
            } else if (cls == C899550ZQr.class) {
                this.LLLIZZ = (C899550ZQr) obj;
            } else if (cls == InterfaceC456680HvW.class) {
                this.LLLJ = (InterfaceC456680HvW) obj;
            } else if (cls == C0I20.class) {
                this.LLLJIL = (C0I20) obj;
            } else if (cls == InterfaceC456460HvA.class) {
                this.LLLJL = (InterfaceC456460HvA) obj;
            } else if (cls == InterfaceC889250YuZ.class) {
                this.LLLL = (InterfaceC889250YuZ) obj;
            } else if (cls == InterfaceC441960HUs.class) {
                this.LLLLII = (InterfaceC441960HUs) obj;
            } else if (cls == InterfaceC1693006k4.class) {
                this.LLLLIIIILLL = (InterfaceC1693006k4) obj;
            } else if (cls == InterfaceC456690HvX.class) {
                this.LLLLIIL = (InterfaceC456690HvX) obj;
            } else if (cls == Photo2StickerCreateEventAbility.class) {
                this.LLLLIILL = (Photo2StickerCreateEventAbility) obj;
            }
            C687700QyG.LJFF(this, this.LLLLIILLL, obj, cls);
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
            return this.LLJLL;
        }
        if (cls == ActionBarDataAssemUnloadAbility.class) {
            return this.LLJLLIL;
        }
        if (cls == InterfaceC456500HvE.class) {
            return this.LLJLLL;
        }
        if (cls == InterfaceC1743706sF.class) {
            return this.LLJZ;
        }
        if (cls == SessionInfo.class) {
            return this.LLJZIJLIL;
        }
        if (cls == IInputFieldAbility.class) {
            return this.LLL;
        }
        if (cls == C0HV6.class) {
            return this.LLLF;
        }
        if (cls == InterfaceC1602806Pi.class) {
            return this.LLLFF;
        }
        if (cls == InterfaceC459890I1r.class) {
            return this.LLLFFI;
        }
        if (cls == InterfaceC904700ZeO.class) {
            return this.LLLFZ;
        }
        if (cls == MessageListInteractionAbility.class) {
            return this.LLLI;
        }
        if (cls == InterfaceC911210Zot.class) {
            return this.LLLII;
        }
        if (cls == MessageListCLSTracker.class) {
            return this.LLLIIII;
        }
        if (cls == C0ZZ4.class) {
            return this.LLLIIIIL;
        }
        if (cls == MessagePowerListAbility.class) {
            return this.LLLIIIL;
        }
        if (cls == MessageListScrollAbility.class) {
            return this.LLLIIL;
        }
        if (cls == MessageListHasRenderedProvider.class) {
            return this.LLLIILIL;
        }
        if (cls == ChatroomEventAbility.class) {
            return this.LLLIL;
        }
        if (cls == C0NZW.class) {
            return this.LLLILZ;
        }
        if (cls == InterfaceC903640Zcg.class) {
            return this.LLLILZJ;
        }
        if (cls == C0I4X.class) {
            return this.LLLILZLLLI;
        }
        if (cls == C899550ZQr.class) {
            return this.LLLIZZ;
        }
        if (cls == InterfaceC456680HvW.class) {
            return this.LLLJ;
        }
        if (cls == C0I20.class) {
            return this.LLLJIL;
        }
        if (cls == InterfaceC456460HvA.class) {
            return this.LLLJL;
        }
        if (cls == InterfaceC889250YuZ.class) {
            return this.LLLL;
        }
        if (cls == InterfaceC441960HUs.class) {
            return this.LLLLII;
        }
        if (cls == InterfaceC1693006k4.class) {
            return this.LLLLIIIILLL;
        }
        if (cls == InterfaceC456690HvX.class) {
            return this.LLLLIIL;
        }
        if (cls == Photo2StickerCreateEventAbility.class) {
            return this.LLLLIILL;
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

    public abstract EnterChatParams mS();

    public final boolean nS() {
        boolean z = false;
        List listLIZIZ = C1554610qYd.LIZIZ(C1558360qeg.LJFF(this, null), ChatroomBackPressProtocol.class, false);
        if (listLIZIZ != null) {
            Iterator it2 = listLIZIZ.iterator();
            loop0: while (true) {
                while (it2.hasNext()) {
                    z = ((ChatroomBackPressProtocol) it2.next()).LLZLL() || z;
                }
            }
        }
        return z;
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == InterfaceC1655706e3.class) {
            this.LLJLL = null;
        } else if (cls == ActionBarDataAssemUnloadAbility.class) {
            this.LLJLLIL = null;
        } else if (cls == InterfaceC456500HvE.class) {
            this.LLJLLL = null;
        } else if (cls == InterfaceC1743706sF.class) {
            this.LLJZ = null;
        } else if (cls == SessionInfo.class) {
            this.LLJZIJLIL = null;
        } else if (cls == IInputFieldAbility.class) {
            this.LLL = null;
        } else if (cls == C0HV6.class) {
            this.LLLF = null;
        } else if (cls == InterfaceC1602806Pi.class) {
            this.LLLFF = null;
        } else if (cls == InterfaceC459890I1r.class) {
            this.LLLFFI = null;
        } else if (cls == InterfaceC904700ZeO.class) {
            this.LLLFZ = null;
        } else if (cls == MessageListInteractionAbility.class) {
            this.LLLI = null;
        } else if (cls == InterfaceC911210Zot.class) {
            this.LLLII = null;
        } else if (cls == MessageListCLSTracker.class) {
            this.LLLIIII = null;
        } else if (cls == C0ZZ4.class) {
            this.LLLIIIIL = null;
        } else if (cls == MessagePowerListAbility.class) {
            this.LLLIIIL = null;
        } else if (cls == MessageListScrollAbility.class) {
            this.LLLIIL = null;
        } else if (cls == MessageListHasRenderedProvider.class) {
            this.LLLIILIL = null;
        } else if (cls == ChatroomEventAbility.class) {
            this.LLLIL = null;
        } else if (cls == C0NZW.class) {
            this.LLLILZ = null;
        } else if (cls == InterfaceC903640Zcg.class) {
            this.LLLILZJ = null;
        } else if (cls == C0I4X.class) {
            this.LLLILZLLLI = null;
        } else if (cls == C899550ZQr.class) {
            this.LLLIZZ = null;
        } else if (cls == InterfaceC456680HvW.class) {
            this.LLLJ = null;
        } else if (cls == C0I20.class) {
            this.LLLJIL = null;
        } else if (cls == InterfaceC456460HvA.class) {
            this.LLLJL = null;
        } else if (cls == InterfaceC889250YuZ.class) {
            this.LLLL = null;
        } else if (cls == InterfaceC441960HUs.class) {
            this.LLLLII = null;
        } else if (cls == InterfaceC1693006k4.class) {
            this.LLLLIIIILLL = null;
        } else if (cls == InterfaceC456690HvX.class) {
            this.LLLLIIL = null;
        } else if (cls == Photo2StickerCreateEventAbility.class) {
            this.LLLLIILL = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
        List<InterfaceC687730QyJ> list = this.LLLLIILLL;
        if (list == null) {
            return;
        }
        ((ArrayList) list).remove(interfaceC687730QyJ);
    }

    public BaseChatRootFragment() {
        AssemVMLazy assemVMLazy;
        C0VWN.LIZ("enter_chat_fps", false).start();
        IIMChatPerfLogger.LIZ.getClass();
        IIMChatPerfLogger iIMChatPerfLoggerLIZ = C907170ZiN.LIZ();
        if (iIMChatPerfLoggerLIZ != null) {
            iIMChatPerfLoggerLIZ.LIZLLL();
        }
        aS(AFwS264S0000000_24.get$arr$(181));
        this.LLJJ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(216));
        this.LLJJI = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(217));
        this.LLJJIII = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(214));
        this.LLJJIJI = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(215));
        this.LLJJIJIL = new C2250591D6z(new AwS558S0100000_14(this, 849));
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(InputFieldVM.class);
        AwS546S0100000_2 awS546S0100000_2 = new AwS546S0100000_2(c19719912DlLIZ, 558);
        AFwS248S0000000_14 aFwS248S0000000_14 = AFwS248S0000000_14.get$arr$(240);
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS546S0100000_2, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new AwS558S0100000_14((HasDefaultViewModelProviderFactory) this, 846), aFwS248S0000000_14, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS546S0100000_2, new AwS558S0100000_14((Fragment) this, 847), aFwS248S0000000_14, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS546S0100000_2, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS558S0100000_14((HasDefaultViewModelProviderFactory) this, 848), aFwS248S0000000_14, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJJJJ = assemVMLazy;
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 557));
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 845));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 843));
        this.LLJL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 844));
        this.LLJLIL = new AUListenerS263S0100000_14(this, 1);
        this.LLJLILLLLZIIL = new BPEAHandler(Looper.getMainLooper());
    }

    @Override // X.InterfaceC744180THc
    public final Analysis getAnalysis() {
        String str;
        SessionInfo sessionInfo = this.LLJJJ;
        if (sessionInfo == null || !sessionInfo.isSingleChat()) {
            SessionInfo sessionInfo2 = this.LLJJJ;
            str = (sessionInfo2 == null || !sessionInfo2.isGroupChat()) ? null : "group";
        } else {
            str = "private";
        }
        Analysis analysis = new Analysis();
        analysis.setLabelName("chat");
        analysis.setCategory(str);
        IMChatRoomAnalytics iMChatRoomAnalytics = IMChatRoomAnalytics.LIZIZ;
        SessionInfo sessionInfo3 = this.LLJJJ;
        iMChatRoomAnalytics.getClass();
        analysis.setExt_json(IMChatRoomAnalytics.LJII(sessionInfo3));
        return analysis;
    }

    public final View getRootView() {
        View view = this.LLJILLL;
        if (view != null) {
            return view;
        }
        return null;
    }

    public void hS() {
        if (C913300ZsG.LIZ.LIZIZ()) {
            return;
        }
        aS(new AwS593S0100000_14(this, 97));
    }

    public final void iS() {
        Map<String, String> extras;
        SessionInfo sessionInfo;
        String conversationId;
        C19EG activity;
        MixStudioEntranceControl mixStudioEntranceControl = (MixStudioEntranceControl) this.LLJJ.getValue();
        if (mixStudioEntranceControl == null || !mixStudioEntranceControl.LJIIJJI()) {
            return;
        }
        MixStudioStatusRepository mixStudioStatusRepository = (MixStudioStatusRepository) this.LLJJI.getValue();
        if (mixStudioStatusRepository != null) {
            mixStudioStatusRepository.LJIIIIZZ();
        }
        EnterChatParams enterChatParamsMS = mS();
        if (enterChatParamsMS == null || (extras = enterChatParamsMS.getExtras()) == null || extras.get("mix_sticker_id") == null || (sessionInfo = this.LLJJJ) == null || (conversationId = sessionInfo.getConversationId()) == null || (activity = getActivity()) == null) {
            return;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0HSJ(conversationId, this, activity, null), 3);
    }

    public final int kS() {
        return ((Number) this.LLJJIII.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.ss.android.ugc.aweme.im.sdk.chat.ui.singleactivity.BaseChatRootFragment$initChatPanel$1] */
    public final void oS() {
        if (this.LLJJJ == null) {
            finish();
            return;
        }
        C0ZH3.LIZ();
        final InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(this, null);
        final ?? r3 = new ChatBackgroundColorProtocol() { // from class: com.ss.android.ugc.aweme.im.sdk.chat.ui.singleactivity.BaseChatRootFragment$initChatPanel$1
            @Override // com.ss.android.ugc.aweme.im.common.protocol.ChatBackgroundColorProtocol
            public final void Bp1() {
                ValueAnimator valueAnimator;
                if (C913300ZsG.LIZ.LIZ() || (valueAnimator = (ValueAnimator) this.LL.LLJL.getValue()) == null) {
                    return;
                }
                BaseChatRootFragment baseChatRootFragment = this.LL;
                if (valueAnimator.isRunning()) {
                    return;
                }
                valueAnimator.start();
                baseChatRootFragment.LLJJL = false;
            }

            @Override // com.ss.android.ugc.aweme.im.common.protocol.ChatBackgroundColorProtocol
            public final void SZ() {
                Integer num;
                if (C913300ZsG.LIZ.LIZ() || (num = (Integer) this.LL.LLJJJJLIIL.getValue()) == null) {
                    return;
                }
                BaseChatRootFragment baseChatRootFragment = this.LL;
                num.intValue();
                C786410Ut5.LJJZZIII(baseChatRootFragment.LLJLILLLLZIIL, new ARunnableS114S0100000_14(baseChatRootFragment, 20));
            }
        };
        C1554610qYd.LIZJ(interfaceC665370Q7zLJFF, ChatBackgroundColorProtocol.class, C1697810uHb.LJIILJJIL(r3));
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle != null) {
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.im.sdk.chat.ui.singleactivity.BaseChatRootFragment$initChatPanel$$inlined$registerProtocol$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        C1554610qYd.LIZLLL(interfaceC665370Q7zLJFF, ChatBackgroundColorProtocol.class, r3);
                    }
                }
            });
        }
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        ((InterfaceC1602960roc) this.LLJJIJI.getValue()).stop();
        super.onStop();
    }

    public final void qS() {
        C0I0B c0i0b = C0I0B.LJFF;
        c0i0b.LIZJ();
        if (!C894660Z7w.LIZJ()) {
            c0i0b.LIZJ();
            if (!TextUtils.equals(C894660Z7w.LIZIZ(), "local_test")) {
                return;
            }
        }
        ((IDmToolsDebugService) ServiceManager.get().getService(IDmToolsDebugService.class)).LJIIZILJ();
    }

    public final void rS() {
        C0I0B c0i0b = C0I0B.LJFF;
        c0i0b.LIZJ();
        if (!C894660Z7w.LIZJ()) {
            c0i0b.LIZJ();
            if (!TextUtils.equals(C894660Z7w.LIZIZ(), "local_test")) {
                return;
            }
        }
        ((IDmToolsDebugService) ServiceManager.get().getService(IDmToolsDebugService.class)).LJIJ();
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        Window window;
        super.onDestroy();
        ((IDMResourceManagementService) ServiceManager.get().getService(IDMResourceManagementService.class)).LIZJ();
        Integer num = this.LLJJJIL;
        if (num != null) {
            int iIntValue = num.intValue();
            C19EG activity = getActivity();
            if (activity != null && (window = activity.getWindow()) != null) {
                window.setSoftInputMode(iIntValue);
            }
        }
        LLLLIL.getClass();
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
        this.LLJJIJIIJIL = null;
        ((InterfaceC913290ZsF) ServiceManager.get().getService(ILightInteractionPlatformService.class)).LJJJJL();
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public void onPause() {
        RecyclerView recyclerView;
        AbstractC21673619ry adapter;
        super.onPause();
        int itemCount = (this.LLJILLL == null || (recyclerView = (RecyclerView) getRootView().findViewById(R.id.t0e)) == null || (adapter = recyclerView.getAdapter()) == null) ? 0 : adapter.getItemCount();
        IMALogApi.LIZ.getClass();
        IMALogApi iMALogApiLIZ = C0Z53.LIZ();
        if (iMALogApiLIZ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("leave chatroom, conversationId=");
            SessionInfo sessionInfo = this.LLJJJ;
            sbLIZ.append(sessionInfo != null ? sessionInfo.getConversationId() : null);
            sbLIZ.append(", displaySize=");
            sbLIZ.append(itemCount);
            iMALogApiLIZ.LIZ(4, "BaseChatRootFragment", C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LLJJIJIL.LIZ();
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        IMALogApi.LIZ.getClass();
        IMALogApi iMALogApiLIZ = C0Z53.LIZ();
        if (iMALogApiLIZ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("enter chat, conversationId=");
            SessionInfo sessionInfo = this.LLJJJ;
            sbLIZ.append(sessionInfo != null ? sessionInfo.getConversationId() : null);
            iMALogApiLIZ.LIZ(4, "BaseChatRootFragment", C2188811AlT.LIZIZ(sbLIZ));
        }
        IMFoundationBridgeApi.LIZ.getClass();
        IMFoundationBridgeApi iMFoundationBridgeApiLIZ = C895630ZBp.LIZ();
        if (iMFoundationBridgeApiLIZ != null) {
            iMFoundationBridgeApiLIZ.LJIIIZ("ChatPage");
        }
        this.LLJJIJIL.LIZIZ();
        if (((Boolean) C283830BAn.LIZ.getValue()).booleanValue()) {
            SessionInfo sessionInfo2 = this.LLJJJ;
            if (sessionInfo2 == null || sessionInfo2.isFullScreen()) {
                uS();
            }
        }
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public void onStart() {
        SessionInfo sessionInfo;
        super.onStart();
        Context context = getContext();
        if (context == null || (sessionInfo = this.LLJJJ) == null) {
            return;
        }
        IMPushApi.LIZ.getClass();
        C817570W5j.LIZ().LIZJ().LJ(context, sessionInfo.getConversationId(), sessionInfo.getChatType(), sessionInfo.getEnterFromForMob());
        ((InterfaceC1602960roc) this.LLJJIJI.getValue()).start();
        InterfaceC1602960roc interfaceC1602960roc = (InterfaceC1602960roc) this.LLJJIJI.getValue();
        SessionInfo sessionInfo2 = this.LLJJJ;
        interfaceC1602960roc.LJIIJJI(Integer.valueOf(sessionInfo2 != null ? sessionInfo2.getChatType() : -1), "chat_type");
    }

    public final void uS() {
        Context context = getContext();
        boolean z = context != null && C960203pA.LIZIZ(context);
        TuxImmersionBar tuxImmersionBarLIZLLL = C1766560w4U.LIZLLL(this);
        tuxImmersionBarLIZLLL.LIZIZ.LJIIL();
        boolean z2 = !z;
        tuxImmersionBarLIZLLL.LIZIZ.LJIIJ(z2);
        tuxImmersionBarLIZLLL.LIZ(false);
        if (C913300ZsG.LIZ.LIZIZ()) {
            tuxImmersionBarLIZLLL.LIZIZ.LJIIJJI();
            tuxImmersionBarLIZLLL.LJI(z2);
        } else {
            Integer num = (Integer) this.LLJJJJLIIL.getValue();
            if (num != null) {
                num.intValue();
                if (this.LLJJL) {
                    tuxImmersionBarLIZLLL.LJFF(num.intValue());
                }
            }
        }
        tuxImmersionBarLIZLLL.LIZLLL();
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final Boolean dispatchTouchEvent(MotionEvent motionEvent) {
        List listLIZIZ = C1554610qYd.LIZIZ(C1558360qeg.LJFF(this, null), OnChatRoomTouchListener.class, false);
        if (listLIZIZ != null) {
            Iterator it2 = listLIZIZ.iterator();
            while (it2.hasNext()) {
                ((OnChatRoomTouchListener) it2.next()).vx(motionEvent);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Bundle arguments;
        super.onCreate(bundle);
        IMChatFunnelAnalytics.LIZIZ.LIZJ(C0I0B.LJFF.LIZIZ());
        IDeeplinkTrackingService iDeeplinkTrackingService = (IDeeplinkTrackingService) PluggableExtentionKt.pluggableSpiForReal(IDeeplinkTrackingService.class);
        if (iDeeplinkTrackingService != null) {
            iDeeplinkTrackingService.LIZJ(LinkPhase.PAGE_OPEN);
        }
        IDeeplinkTrackingService iDeeplinkTrackingService2 = (IDeeplinkTrackingService) PluggableExtentionKt.pluggableSpiForReal(IDeeplinkTrackingService.class);
        if (iDeeplinkTrackingService2 != null) {
            iDeeplinkTrackingService2.LIZJ(LinkPhase.PAGE_UI_READY);
        }
        IDeeplinkTrackingService iDeeplinkTrackingService3 = (IDeeplinkTrackingService) PluggableExtentionKt.pluggableSpiForReal(IDeeplinkTrackingService.class);
        if (iDeeplinkTrackingService3 != null) {
            iDeeplinkTrackingService3.LIZJ(LinkPhase.TARGET_ACTIVATION);
        }
        IDeeplinkTrackingService iDeeplinkTrackingService4 = (IDeeplinkTrackingService) PluggableExtentionKt.pluggableSpiForReal(IDeeplinkTrackingService.class);
        if (iDeeplinkTrackingService4 != null) {
            iDeeplinkTrackingService4.LIZJ(LinkPhase.TOTAL);
        }
        IDeeplinkTrackingService iDeeplinkTrackingService5 = (IDeeplinkTrackingService) PluggableExtentionKt.pluggableSpiForReal(IDeeplinkTrackingService.class);
        if (iDeeplinkTrackingService5 != null) {
            iDeeplinkTrackingService5.LIZ();
        }
        if (bundle == null) {
            DurationPerfMon.LIZ.LIZJ(new C1512805w6("chatroom_navigation"), C1661806f2.LIZLLL);
        }
        ((C876310YZh) C876340YZk.LIZ(C876340YZk.LIZ)).LIZJ(EnumC883570YlP.ENTER_CHAT_ROOM);
        if (bundle != null && (arguments = getArguments()) != null) {
            C786410Ut5.LJJIIJZLJL(arguments, bundle);
        }
        sS(false);
        C19EG activity = getActivity();
        if (activity != null) {
            this.LLJJJIL = Integer.valueOf(activity.getWindow().getAttributes().softInputMode);
            activity.getWindow().setSoftInputMode(48);
        }
        this.LLJJIJIIJIL = new AnalysisActivityComponent(this);
        ((IAwemeImManager) ServiceManager.get().getService(IAwemeImManager.class)).LJ();
        SessionInfo sessionInfo = this.LLJJJ;
        if (sessionInfo == null || sessionInfo.isFullScreen()) {
            hS();
        }
        if (C1716106nn.LIZ() || C06GX.LIZ()) {
            C1716806nu.LIZ();
        }
        if (!C289880BXu.LIZIZ()) {
            ChatRoomAdaptiveRequestManager.LIZ.LJLL(AFwS201S0000000_14.get$arr$(218));
            if (C288960BUg.LIZ()) {
                C912070ZqH.LIZIZ.LJIIZILJ().LIZ();
            }
        }
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        SessionInfo sessionInfo = this.LLJJJ;
        if (sessionInfo != null) {
            C786410Ut5.LJJIZ(bundle, "key_session_info", sessionInfo);
        }
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
        if (this.LLLLIILLL == null) {
            this.LLLLIILLL = new ArrayList();
        }
        ((ArrayList) this.LLLLIILLL).add(interfaceC687730QyJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0174  */
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
    /* JADX WARN: Removed duplicated region for block: B:186:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03c2  */
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
    public final void sS(boolean r18) {
        /*
            Method dump skipped, instruction units count: 965
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.ui.singleactivity.BaseChatRootFragment.sS(boolean):void");
    }

    public final void wS(View view) {
        if (C913300ZsG.LIZ.LIZ()) {
            final View viewFindViewById = getRootView().findViewById(R.id.dpa);
            if (viewFindViewById == null) {
                viewFindViewById = view;
            }
            final int paddingLeft = viewFindViewById.getPaddingLeft();
            final int paddingTop = viewFindViewById.getPaddingTop();
            final int paddingRight = viewFindViewById.getPaddingRight();
            final int paddingBottom = viewFindViewById.getPaddingBottom();
            C14K9.LJIJJ(view, new C0TVI() { // from class: X.0Zrg
                @Override // X.C0TVI
                public final C20246014Ju onApplyWindowInsets(View view2, C20246014Ju c20246014Ju) {
                    int i;
                    C20244914Jj c20244914JjLIZ = c20246014Ju.LIZ(7);
                    View view3 = viewFindViewById;
                    int i2 = paddingLeft + c20244914JjLIZ.LIZ;
                    SessionInfo sessionInfo = this.LLJJJ;
                    if (sessionInfo != null && !sessionInfo.isFullScreen()) {
                        i = paddingTop;
                    } else {
                        i = paddingTop + c20244914JjLIZ.LIZIZ;
                    }
                    view3.setPadding(i2, i, paddingRight + c20244914JjLIZ.LIZJ, paddingBottom);
                    return c20246014Ju;
                }
            });
            C20097313kJ.LIZJ(view);
            return;
        }
        if (Build.VERSION.SDK_INT < 35) {
            return;
        }
        C14K9.LJIJJ(view, new C0TVI() { // from class: X.0DLj
            @Override // X.C0TVI
            public final C20246014Ju onApplyWindowInsets(View view2, C20246014Ju c20246014Ju) {
                C20244914Jj c20244914JjLIZ = c20246014Ju.LIZ(7);
                view2.setPadding(c20244914JjLIZ.LIZ, view2.getPaddingTop(), c20244914JjLIZ.LIZJ, c20244914JjLIZ.LIZLLL);
                return c20246014Ju;
            }
        });
    }

    @Override // androidx.fragment.app.SAFTikTokFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) throws Exception {
        final View viewFindViewById;
        super.onViewCreated(view, bundle);
        try {
            wS(view);
            ViewStub viewStub = (ViewStub) view.findViewById(R.id.t0f);
            if (viewStub != null) {
                viewStub.setLayoutResource(R.layout.cqs);
            }
            C786410Ut5.LJLLLL(viewStub);
            oS();
            qS();
            rS();
            Integer numLIZJ = C1308910kAL.LIZJ(kS(), view.getContext());
            if (numLIZJ != null) {
                getRootView().setBackgroundColor(numLIZJ.intValue());
            }
            FrameLayout frameLayout = (FrameLayout) getRootView().findViewById(R.id.dpp);
            if (frameLayout != null && (viewFindViewById = getRootView().findViewById(R.id.w28)) != null) {
                viewFindViewById.setBackgroundColor(C1383370m6R.LJFF(R.attr.zm));
                C14K9.LJIJJ(frameLayout, new C0TVI() { // from class: X.0Zre
                    @Override // X.C0TVI
                    public final C20246014Ju onApplyWindowInsets(View view2, C20246014Ju c20246014Ju) {
                        int i = c20246014Ju.LIZ(1).LIZIZ;
                        SessionInfo sessionInfo = this.LL.LLJJJ;
                        if (sessionInfo != null && !sessionInfo.isFullScreen()) {
                            i = 0;
                        }
                        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
                        if (layoutParams.height != i) {
                            layoutParams.height = i;
                            C786410Ut5.W5(viewFindViewById, layoutParams);
                        }
                        return c20246014Ju;
                    }
                });
                frameLayout.requestApplyInsets();
            }
            C1512805w6 c1512805w6 = new C1512805w6("chatroom_assemble");
            C1366690lfX c1366690lfX = DurationPerfMon.LIZ;
            c1366690lfX.LIZIZ(c1512805w6, true);
            try {
                ChatRoomAssembler chatRoomAssembler = (ChatRoomAssembler) this.LLJJJJJIL.getValue();
                if (chatRoomAssembler != null) {
                    chatRoomAssembler.LIZ();
                }
                c1366690lfX.LIZJ(c1512805w6, C1661806f2.LIZLLL);
                SessionInfo sessionInfo = this.LLJJJ;
                if (sessionInfo != null && sessionInfo.getShowKeyBoardByDefault()) {
                    AssemVMLazy assemVMLazy = this.LLJJJJ;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLLILI;
                    ((InputFieldVM) assemVMLazy.getValue()).LLJZIJLIL();
                }
                iS();
                C1512805w6 c1512805w62 = new C1512805w6("im_message_list_render_delay");
                c1366690lfX.LIZIZ(c1512805w62, true);
                C907190ZiP c907190ZiP = (C907190ZiP) view.findViewById(R.id.t0e);
                if (c907190ZiP != null) {
                    c907190ZiP.LLILZIL = new AwS558S0100000_14(c1512805w62, 6);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                DurationPerfMon.LIZ.LIZJ(c1512805w6, C1661806f2.LIZLLL);
                throw th;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            IMALogApi.LIZ.getClass();
            IMALogApi iMALogApiLIZ = C0Z53.LIZ();
            if (iMALogApiLIZ != null) {
                iMALogApiLIZ.LIZJ("BaseChatRootFragmentException", e);
            }
            throw e;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        C1512805w6 c1512805w6 = new C1512805w6("charoom_fragment_inflate");
        C1366690lfX c1366690lfX = DurationPerfMon.LIZ;
        c1366690lfX.LIZIZ(c1512805w6, true);
        if (C913300ZsG.LIZ.LIZ()) {
            i = R.layout.ch6;
        } else {
            i = R.layout.ch5;
        }
        this.LLJILLL = C786410Ut5.Td(layoutInflater, i, viewGroup, false);
        Integer num = (Integer) this.LLJJLIIIJLLLLLLLZ.getValue();
        if (num != null) {
            getRootView().setBackgroundColor(num.intValue());
        }
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

    @Override // androidx.fragment.app.SAFTikTokFragment, X.InterfaceC214902198i
    public final boolean onResult(int i, int i2, Intent intent) {
        InterfaceC550020Lhg interfaceC550020LhgLJIIIZ;
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
        IAITheaterFeatureService.LIZ.getClass();
        IAITheaterFeatureService iAITheaterFeatureServiceLIZ = C549720LhC.LIZ();
        if (iAITheaterFeatureServiceLIZ != null && (interfaceC550020LhgLJIIIZ = iAITheaterFeatureServiceLIZ.LJIIIZ()) != null) {
            interfaceC550020LhgLJIIIZ.LIZIZ(i, i2, intent, this);
        }
        C913310ZsH.LIZ(i, i2, intent, this);
        return false;
    }
}
