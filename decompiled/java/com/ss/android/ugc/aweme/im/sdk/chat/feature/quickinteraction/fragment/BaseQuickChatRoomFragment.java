package com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.fragment;

import X.AbstractC1110520f0M;
import X.AbstractC1136060ffY;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C09RB;
import X.C09RD;
import X.C09U0;
import X.C0HV6;
import X.C0HYH;
import X.C0I0B;
import X.C0I20;
import X.C0I4X;
import X.C0NJG;
import X.C0NZW;
import X.C0PEM;
import X.C0QSJ;
import X.C0ZH3;
import X.C0ZP4;
import X.C0ZZ4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C127G;
import X.C1308910kAL;
import X.C1360890lWB;
import X.C1365870leD;
import X.C1389910mGz;
import X.C1391190mJ3;
import X.C13BV;
import X.C13LE;
import X.C1483410ohn;
import X.C14EU;
import X.C14KI;
import X.C1554610qYd;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1608506Rn;
import X.C1619106Vp;
import X.C1622206Wu;
import X.C1631106a5;
import X.C1631206a6;
import X.C1710306mr;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C20684815ws;
import X.C2217381BqS;
import X.C2250591D6z;
import X.C23250099c;
import X.C289800BXm;
import X.C338490DOt;
import X.C345280DgE;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C452501pT;
import X.C457640Hx4;
import X.C497820Jfg;
import X.C673150Qan;
import X.C687700QyG;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C817570W5j;
import X.C895830ZCj;
import X.C899550ZQr;
import X.C907170ZiN;
import X.C908950ZlF;
import X.C912980Zrk;
import X.C913190Zs5;
import X.C913310ZsH;
import X.C913340ZsK;
import X.C960203pA;
import X.C987103tV;
import X.InterfaceC0148002o;
import X.InterfaceC1058150ddt;
import X.InterfaceC1146704e9;
import X.InterfaceC1602806Pi;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1655706e3;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1693006k4;
import X.InterfaceC1743706sF;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC441960HUs;
import X.InterfaceC451590HnJ;
import X.InterfaceC456460HvA;
import X.InterfaceC456500HvE;
import X.InterfaceC456680HvW;
import X.InterfaceC456690HvX;
import X.InterfaceC457860HxQ;
import X.InterfaceC459890I1r;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import X.InterfaceC744180THc;
import X.InterfaceC889250YuZ;
import X.InterfaceC903640Zcg;
import X.InterfaceC904700ZeO;
import X.InterfaceC911210Zot;
import X.ViewOnLayoutChangeListenerC1767506w5;
import Y.ACListenerS117S0200000_14;
import Y.AObjectS378S0100000_2;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.GroupChatProtocol;
import com.ss.android.ugc.aweme.IShareMessageToastHelper;
import com.ss.android.ugc.aweme.analysis.Analysis;
import com.ss.android.ugc.aweme.base.component.AnalysisActivityComponent;
import com.ss.android.ugc.aweme.chatroom.assembler.ChatRoomAssembler;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.actionbar.api.ability.ActionBarDataAssemUnloadAbility;
import com.ss.android.ugc.aweme.im.actionbar.api.ability.ActionBarViewInfoAbility;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.IInputFieldAbility;
import com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.InputFieldVM;
import com.ss.android.ugc.aweme.im.common.perfmonitor.api.IStopwatchFactory;
import com.ss.android.ugc.aweme.im.common.perfmonitor.api.Stopwatch;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.ChatroomEventAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListHasRenderedProvider;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListInteractionAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessageListScrollAbility;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.MessagePowerListAbility;
import com.ss.android.ugc.aweme.im.messagelist.perf.MessageListCLSTracker;
import com.ss.android.ugc.aweme.im.push.api.IMPushApi;
import com.ss.android.ugc.aweme.im.saas.host.api.share.IMShareService;
import com.ss.android.ugc.aweme.im.sdk.chat.analytics.IMChatRoomAnalytics;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.viewmodel.QuickChatViewModel;
import com.ss.android.ugc.aweme.im.sdk.common.controller.analytics.IMAnalyticsUtil;
import com.ss.android.ugc.aweme.im.sdk.performance.IMResourceLogger;
import com.ss.android.ugc.aweme.im.service.analytics.IIMChatPerfLogger;
import com.ss.android.ugc.aweme.im.service.viewmodel.ChatRoomStreakViewModel;
import com.ss.android.ugc.aweme.im.viewmodel.InputPanelSizeViewModel;
import com.ss.android.ugc.aweme.im.viewmodel.PanelStateViewModel;
import com.ss.android.ugc.aweme.utils.IChatCustomizeHelper;
import com.ss.android.ugc.aweme.viewmodel.GreetingCardViewModel;
import com.ss.android.ugc.aweme.viewmodel.Photo2StickerCreateEventAbility;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.AwS616S0100000_2;
import kotlin.jvm.internal.AwS626S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes15.dex */
public final class BaseQuickChatRoomFragment extends BaseFragment implements InterfaceC1058150ddt, InterfaceC744180THc, InterfaceC724530SbT, InterfaceC457860HxQ, C0QSJ, InterfaceC1146704e9 {
    public static final C913190Zs5 LLLLJI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLL;
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiwhZzw3I2svIS4nZiMpKDsmOiBiODo6HELIOSKy4lJzs2OiQvPSY8JmsqOy40JSAiPWERKTYpGDo6Ky4PIS4nGiojJAkhKSIhLCEn";
    public final AssemVMLazy LLIZ;
    public SessionInfo LLIZLLLIL;
    public EnterChatParams LLJ;
    public View LLJI;
    public final C01GW LLJIJIL;
    public AnalysisActivityComponent LLJILJIL;
    public final C2250591D6z LLJILJILJ;
    public WeakReference<DefaultLifecycleObserver> LLJILLL;
    public final C912980Zrk LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final Stopwatch LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final AssemVMLazy LLJJIJIL;
    public final AssemVMLazy LLJJJ;
    public final AssemVMLazy LLJJJIL;
    public final AssemVMLazy LLJJJJ;
    public final AssemVMLazy LLJJJJJIL;
    public int LLJJJJLIIL;
    public String LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public ValueAnimator LLJL;
    public boolean LLJLIL;
    public volatile C09U0 LLJLILLLLZIIL;
    public C127G LLJLL;
    public InterfaceC1655706e3 LLJLLIL;
    public ActionBarDataAssemUnloadAbility LLJLLL;
    public InterfaceC456500HvE LLJZ;
    public InterfaceC1743706sF LLJZIJLIL;
    public SessionInfo LLL;
    public IInputFieldAbility LLLF;
    public C0HV6 LLLFF;
    public InterfaceC1602806Pi LLLFFI;
    public InterfaceC459890I1r LLLFZ;
    public InterfaceC904700ZeO LLLI;
    public MessageListInteractionAbility LLLII;
    public InterfaceC911210Zot LLLIIII;
    public MessageListCLSTracker LLLIIIIL;
    public C0ZZ4 LLLIIIL;
    public MessagePowerListAbility LLLIIL;
    public MessageListScrollAbility LLLIILIL;
    public MessageListHasRenderedProvider LLLIL;
    public ChatroomEventAbility LLLILZ;
    public C0NZW LLLILZJ;
    public InterfaceC903640Zcg LLLILZLLLI;
    public C0I4X LLLIZZ;
    public C899550ZQr LLLJ;
    public InterfaceC456680HvW LLLJIL;
    public C0I20 LLLJL;
    public InterfaceC456460HvA LLLL;
    public InterfaceC889250YuZ LLLLII;
    public InterfaceC441960HUs LLLLIIIILLL;
    public InterfaceC1693006k4 LLLLIIL;
    public InterfaceC456690HvX LLLLIILL;
    public Photo2StickerCreateEventAbility LLLLIILLL;
    public List<InterfaceC687730QyJ> LLLLIL;
    public InterfaceC665370Q7z LLLLILI;
    public C0QSJ LLLLJ;

    /* JADX WARN: Type inference failed for: r0v15, types: [X.0Zs5] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BaseQuickChatRoomFragment.class, "ttDispatchers", "getTtDispatchers()Lcom/ss/android/ugc/aweme/utils/dispatchers/TTDispatchers;", 0);
        C13LE.LIZ.getClass();
        LLLLL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(BaseQuickChatRoomFragment.class, "quickChatViewModel", "getQuickChatViewModel()Lcom/ss/android/ugc/aweme/im/sdk/chat/feature/quickinteraction/viewmodel/QuickChatViewModel;", 0), new C2217381BqS(BaseQuickChatRoomFragment.class, "inputFieldVM", "getInputFieldVM()Lcom/ss/android/ugc/aweme/im/chatroom/input/components/inputfield/InputFieldVM;", 0), new C2217381BqS(BaseQuickChatRoomFragment.class, "inputSizeVM", "getInputSizeVM()Lcom/ss/android/ugc/aweme/im/viewmodel/InputPanelSizeViewModel;", 0), new C2217381BqS(BaseQuickChatRoomFragment.class, "streakChatRoomVM", "getStreakChatRoomVM()Lcom/ss/android/ugc/aweme/im/service/viewmodel/ChatRoomStreakViewModel;", 0), new C2217381BqS(BaseQuickChatRoomFragment.class, "panelStateVm", "getPanelStateVm()Lcom/ss/android/ugc/aweme/im/viewmodel/PanelStateViewModel;", 0), new C2217381BqS(BaseQuickChatRoomFragment.class, "greetingCardVM", "getGreetingCardVM()Lcom/ss/android/ugc/aweme/viewmodel/GreetingCardViewModel;", 0)};
        LLLLJI = new Object() { // from class: X.0Zs5
        };
    }

    @Override // X.InterfaceC1058150ddt
    public final void LLLFFI(TuxSheet tuxSheet, float f) {
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == InterfaceC1655706e3.class) {
            this.LLJLLIL = (InterfaceC1655706e3) obj;
        } else if (cls == ActionBarDataAssemUnloadAbility.class) {
            this.LLJLLL = (ActionBarDataAssemUnloadAbility) obj;
        } else if (cls == InterfaceC456500HvE.class) {
            this.LLJZ = (InterfaceC456500HvE) obj;
        } else if (cls == InterfaceC1743706sF.class) {
            this.LLJZIJLIL = (InterfaceC1743706sF) obj;
        } else if (cls == SessionInfo.class) {
            this.LLL = (SessionInfo) obj;
        } else if (cls == IInputFieldAbility.class) {
            this.LLLF = (IInputFieldAbility) obj;
        } else if (cls == C0HV6.class) {
            this.LLLFF = (C0HV6) obj;
        } else if (cls == InterfaceC1602806Pi.class) {
            this.LLLFFI = (InterfaceC1602806Pi) obj;
        } else if (cls == InterfaceC459890I1r.class) {
            this.LLLFZ = (InterfaceC459890I1r) obj;
        } else if (cls == InterfaceC904700ZeO.class) {
            this.LLLI = (InterfaceC904700ZeO) obj;
        } else if (cls == MessageListInteractionAbility.class) {
            this.LLLII = (MessageListInteractionAbility) obj;
        } else if (cls == InterfaceC911210Zot.class) {
            this.LLLIIII = (InterfaceC911210Zot) obj;
        } else if (cls == MessageListCLSTracker.class) {
            this.LLLIIIIL = (MessageListCLSTracker) obj;
        } else if (cls == C0ZZ4.class) {
            this.LLLIIIL = (C0ZZ4) obj;
        } else if (cls == MessagePowerListAbility.class) {
            this.LLLIIL = (MessagePowerListAbility) obj;
        } else if (cls == MessageListScrollAbility.class) {
            this.LLLIILIL = (MessageListScrollAbility) obj;
        } else {
            if (cls == MessageListHasRenderedProvider.class) {
                this.LLLIL = (MessageListHasRenderedProvider) obj;
            } else if (cls == ChatroomEventAbility.class) {
                this.LLLILZ = (ChatroomEventAbility) obj;
            } else if (cls == C0NZW.class) {
                this.LLLILZJ = (C0NZW) obj;
            } else if (cls == InterfaceC903640Zcg.class) {
                this.LLLILZLLLI = (InterfaceC903640Zcg) obj;
            } else if (cls == C0I4X.class) {
                this.LLLIZZ = (C0I4X) obj;
            } else if (cls == C899550ZQr.class) {
                this.LLLJ = (C899550ZQr) obj;
            } else if (cls == InterfaceC456680HvW.class) {
                this.LLLJIL = (InterfaceC456680HvW) obj;
            } else if (cls == C0I20.class) {
                this.LLLJL = (C0I20) obj;
            } else if (cls == InterfaceC456460HvA.class) {
                this.LLLL = (InterfaceC456460HvA) obj;
            } else if (cls == InterfaceC889250YuZ.class) {
                this.LLLLII = (InterfaceC889250YuZ) obj;
            } else if (cls == InterfaceC441960HUs.class) {
                this.LLLLIIIILLL = (InterfaceC441960HUs) obj;
            } else if (cls == InterfaceC1693006k4.class) {
                this.LLLLIIL = (InterfaceC1693006k4) obj;
            } else if (cls == InterfaceC456690HvX.class) {
                this.LLLLIILL = (InterfaceC456690HvX) obj;
            } else if (cls == Photo2StickerCreateEventAbility.class) {
                this.LLLLIILLL = (Photo2StickerCreateEventAbility) obj;
            }
            C687700QyG.LJFF(this, this.LLLLIL, obj, cls);
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
            return this.LLJLLIL;
        }
        if (cls == ActionBarDataAssemUnloadAbility.class) {
            return this.LLJLLL;
        }
        if (cls == InterfaceC456500HvE.class) {
            return this.LLJZ;
        }
        if (cls == InterfaceC1743706sF.class) {
            return this.LLJZIJLIL;
        }
        if (cls == SessionInfo.class) {
            return this.LLL;
        }
        if (cls == IInputFieldAbility.class) {
            return this.LLLF;
        }
        if (cls == C0HV6.class) {
            return this.LLLFF;
        }
        if (cls == InterfaceC1602806Pi.class) {
            return this.LLLFFI;
        }
        if (cls == InterfaceC459890I1r.class) {
            return this.LLLFZ;
        }
        if (cls == InterfaceC904700ZeO.class) {
            return this.LLLI;
        }
        if (cls == MessageListInteractionAbility.class) {
            return this.LLLII;
        }
        if (cls == InterfaceC911210Zot.class) {
            return this.LLLIIII;
        }
        if (cls == MessageListCLSTracker.class) {
            return this.LLLIIIIL;
        }
        if (cls == C0ZZ4.class) {
            return this.LLLIIIL;
        }
        if (cls == MessagePowerListAbility.class) {
            return this.LLLIIL;
        }
        if (cls == MessageListScrollAbility.class) {
            return this.LLLIILIL;
        }
        if (cls == MessageListHasRenderedProvider.class) {
            return this.LLLIL;
        }
        if (cls == ChatroomEventAbility.class) {
            return this.LLLILZ;
        }
        if (cls == C0NZW.class) {
            return this.LLLILZJ;
        }
        if (cls == InterfaceC903640Zcg.class) {
            return this.LLLILZLLLI;
        }
        if (cls == C0I4X.class) {
            return this.LLLIZZ;
        }
        if (cls == C899550ZQr.class) {
            return this.LLLJ;
        }
        if (cls == InterfaceC456680HvW.class) {
            return this.LLLJIL;
        }
        if (cls == C0I20.class) {
            return this.LLLJL;
        }
        if (cls == InterfaceC456460HvA.class) {
            return this.LLLL;
        }
        if (cls == InterfaceC889250YuZ.class) {
            return this.LLLLII;
        }
        if (cls == InterfaceC441960HUs.class) {
            return this.LLLLIIIILLL;
        }
        if (cls == InterfaceC1693006k4.class) {
            return this.LLLLIIL;
        }
        if (cls == InterfaceC456690HvX.class) {
            return this.LLLLIILL;
        }
        if (cls == Photo2StickerCreateEventAbility.class) {
            return this.LLLLIILLL;
        }
        return null;
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ChatRoomScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ChatRoomScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b A[PHI: r1
      0x002b: PHI (r1v1 boolean) = (r1v0 boolean), (r1v4 boolean) binds: [B:3:0x000c, B:12:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC1058150ddt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onBackPress() {
        /*
            r3 = this;
            r0 = 0
            X.0Q7z r2 = X.C1558360qeg.LJFF(r3, r0)
            java.lang.Class<com.ss.android.ugc.aweme.im.chatroom.api.gesture.ChatroomBackPressProtocol> r0 = com.ss.android.ugc.aweme.im.chatroom.api.gesture.ChatroomBackPressProtocol.class
            r1 = 0
            java.util.List r0 = X.C1554610qYd.LIZIZ(r2, r0, r1)
            if (r0 == 0) goto L2b
            java.util.Iterator r2 = r0.iterator()
        L12:
            r1 = 0
        L13:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L29
            java.lang.Object r0 = r2.next()
            com.ss.android.ugc.aweme.im.chatroom.api.gesture.ChatroomBackPressProtocol r0 = (com.ss.android.ugc.aweme.im.chatroom.api.gesture.ChatroomBackPressProtocol) r0
            boolean r0 = r0.LLZLL()
            if (r0 != 0) goto L27
            if (r1 == 0) goto L12
        L27:
            r1 = 1
            goto L13
        L29:
            if (r1 != 0) goto L2f
        L2b:
            java.lang.String r0 = "back_press"
            r3.LLJJL = r0
        L2f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.fragment.BaseQuickChatRoomFragment.onBackPress():boolean");
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == InterfaceC1655706e3.class) {
            this.LLJLLIL = null;
        } else if (cls == ActionBarDataAssemUnloadAbility.class) {
            this.LLJLLL = null;
        } else if (cls == InterfaceC456500HvE.class) {
            this.LLJZ = null;
        } else if (cls == InterfaceC1743706sF.class) {
            this.LLJZIJLIL = null;
        } else if (cls == SessionInfo.class) {
            this.LLL = null;
        } else if (cls == IInputFieldAbility.class) {
            this.LLLF = null;
        } else if (cls == C0HV6.class) {
            this.LLLFF = null;
        } else if (cls == InterfaceC1602806Pi.class) {
            this.LLLFFI = null;
        } else if (cls == InterfaceC459890I1r.class) {
            this.LLLFZ = null;
        } else if (cls == InterfaceC904700ZeO.class) {
            this.LLLI = null;
        } else if (cls == MessageListInteractionAbility.class) {
            this.LLLII = null;
        } else if (cls == InterfaceC911210Zot.class) {
            this.LLLIIII = null;
        } else if (cls == MessageListCLSTracker.class) {
            this.LLLIIIIL = null;
        } else if (cls == C0ZZ4.class) {
            this.LLLIIIL = null;
        } else if (cls == MessagePowerListAbility.class) {
            this.LLLIIL = null;
        } else if (cls == MessageListScrollAbility.class) {
            this.LLLIILIL = null;
        } else if (cls == MessageListHasRenderedProvider.class) {
            this.LLLIL = null;
        } else if (cls == ChatroomEventAbility.class) {
            this.LLLILZ = null;
        } else if (cls == C0NZW.class) {
            this.LLLILZJ = null;
        } else if (cls == InterfaceC903640Zcg.class) {
            this.LLLILZLLLI = null;
        } else if (cls == C0I4X.class) {
            this.LLLIZZ = null;
        } else if (cls == C899550ZQr.class) {
            this.LLLJ = null;
        } else if (cls == InterfaceC456680HvW.class) {
            this.LLLJIL = null;
        } else if (cls == C0I20.class) {
            this.LLLJL = null;
        } else if (cls == InterfaceC456460HvA.class) {
            this.LLLL = null;
        } else if (cls == InterfaceC889250YuZ.class) {
            this.LLLLII = null;
        } else if (cls == InterfaceC441960HUs.class) {
            this.LLLLIIIILLL = null;
        } else if (cls == InterfaceC1693006k4.class) {
            this.LLLLIIL = null;
        } else if (cls == InterfaceC456690HvX.class) {
            this.LLLLIILL = null;
        } else if (cls == Photo2StickerCreateEventAbility.class) {
            this.LLLLIILLL = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
        List<InterfaceC687730QyJ> list = this.LLLLIL;
        if (list == null) {
            return;
        }
        ((ArrayList) list).remove(interfaceC687730QyJ);
    }

    public BaseQuickChatRoomFragment() {
        AssemVMLazy assemVMLazy;
        boolean z;
        AssemVMLazy assemVMLazy2;
        boolean z2;
        AssemVMLazy assemVMLazy3;
        boolean z3;
        AssemVMLazy assemVMLazy4;
        boolean z4;
        AssemVMLazy assemVMLazy5;
        boolean z5;
        boolean z6;
        AssemVMLazy assemVMLazy6;
        IIMChatPerfLogger.LIZ.getClass();
        IIMChatPerfLogger iIMChatPerfLoggerLIZ = C907170ZiN.LIZ();
        if (iIMChatPerfLoggerLIZ != null) {
            iIMChatPerfLoggerLIZ.LIZLLL();
        }
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        AwS546S0100000_2 awS546S0100000_2 = new AwS546S0100000_2(this, 382);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(QuickChatViewModel.class);
        AwS546S0100000_2 awS546S0100000_22 = new AwS546S0100000_2(c19719912DlLIZ, 386);
        AFwS248S0000000_14 aFwS248S0000000_14 = AFwS248S0000000_14.get$arr$(152);
        C01D1 c01d1 = C01D1.LIZ;
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS546S0100000_22, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), awS546S0100000_2, aFwS248S0000000_14, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
            z = true;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS546S0100000_22, awS546S0100000_2, aFwS248S0000000_14, null, null, null);
            z = true;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z = true;
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), awS546S0100000_22, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), awS546S0100000_2, aFwS248S0000000_14, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLIZ = assemVMLazy;
        this.LLJIJIL = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(197));
        this.LLJILJILJ = new C2250591D6z(new AwS558S0100000_14(this, 602));
        this.LLJJ = new C912980Zrk();
        this.LLJJI = C452501pT.LIZIZ(new AwS546S0100000_2(this, 380));
        this.LLJJIII = C452501pT.LIZIZ(new AwS546S0100000_2(this, 384));
        this.LLJJIJI = ((IStopwatchFactory) ServiceManager.get().getService(IStopwatchFactory.class)).LIZ();
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 379));
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(InputFieldVM.class);
        AwS546S0100000_2 awS546S0100000_23 = new AwS546S0100000_2(c19719912DlLIZ2, 381);
        AFwS248S0000000_14 aFwS248S0000000_142 = AFwS248S0000000_14.get$arr$(153);
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS546S0100000_23, new C452070Ho5(), new C1622206Wu(this, z), new C338490DOt(this, z), new AwS558S0100000_14((HasDefaultViewModelProviderFactory) this, 599), aFwS248S0000000_142, new C451460Hn6(this, z), new C451620HnM(this, z), new C987103tV(this, z));
            z2 = true;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy2 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS546S0100000_23, new AwS558S0100000_14((Fragment) this, 600), aFwS248S0000000_142, null, null, null);
            z2 = true;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z2 = true;
            assemVMLazy2 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ2), awS546S0100000_23, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS558S0100000_14((HasDefaultViewModelProviderFactory) this, 601), aFwS248S0000000_142, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJJIJIL = assemVMLazy2;
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(InputPanelSizeViewModel.class);
        AwS546S0100000_2 awS546S0100000_24 = new AwS546S0100000_2(c19719912DlLIZ3, 383);
        AFwS248S0000000_14 aFwS248S0000000_143 = AFwS248S0000000_14.get$arr$(154);
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy3 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ3), awS546S0100000_24, new C452070Ho5(), new C1622206Wu(this, z2), new C338490DOt(this, z2), new AwS558S0100000_14((HasDefaultViewModelProviderFactory) this, 603), aFwS248S0000000_143, new C451460Hn6(this, z2), new C451620HnM(this, z2), new C987103tV(this, z2));
            z3 = true;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy3 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), awS546S0100000_24, new AwS558S0100000_14((Fragment) this, 604), aFwS248S0000000_143, null, null, null);
            z3 = true;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z3 = true;
            assemVMLazy3 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ3), awS546S0100000_24, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS558S0100000_14((HasDefaultViewModelProviderFactory) this, 605), aFwS248S0000000_143, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJJJ = assemVMLazy3;
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(ChatRoomStreakViewModel.class);
        AwS546S0100000_2 awS546S0100000_25 = new AwS546S0100000_2(c19719912DlLIZ4, 385);
        AFwS248S0000000_14 aFwS248S0000000_144 = AFwS248S0000000_14.get$arr$(155);
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy4 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ4), awS546S0100000_25, new C452070Ho5(), new C1622206Wu(this, z3), new C338490DOt(this, z3), new AwS558S0100000_14((HasDefaultViewModelProviderFactory) this, 606), aFwS248S0000000_144, new C451460Hn6(this, z3), new C451620HnM(this, z3), new C987103tV(this, z3));
            z4 = true;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy4 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ4), awS546S0100000_25, new AwS558S0100000_14((Fragment) this, 607), aFwS248S0000000_144, null, null, null);
            z4 = true;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z4 = true;
            assemVMLazy4 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ4), awS546S0100000_25, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS558S0100000_14((HasDefaultViewModelProviderFactory) this, 608), aFwS248S0000000_144, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJJJIL = assemVMLazy4;
        C19719912Dl c19719912DlLIZ5 = C13LE.LIZ(PanelStateViewModel.class);
        AwS546S0100000_2 awS546S0100000_26 = new AwS546S0100000_2(c19719912DlLIZ5, 387);
        AFwS248S0000000_14 aFwS248S0000000_145 = AFwS248S0000000_14.get$arr$(156);
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy5 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ5), awS546S0100000_26, new C452070Ho5(), new C1622206Wu(this, z4), new C338490DOt(this, z4), new AwS558S0100000_14((HasDefaultViewModelProviderFactory) this, 609), aFwS248S0000000_145, new C451460Hn6(this, z4), new C451620HnM(this, z4), new C987103tV(this, z4));
            z6 = true;
            z5 = false;
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy5 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ5), awS546S0100000_26, new AwS558S0100000_14((Fragment) this, 610), aFwS248S0000000_145, null, null, null);
            z5 = false;
            z6 = true;
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            z5 = false;
            z6 = true;
            assemVMLazy5 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ5), awS546S0100000_26, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS558S0100000_14((HasDefaultViewModelProviderFactory) this, 595), aFwS248S0000000_145, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJJJJ = assemVMLazy5;
        C19719912Dl c19719912DlLIZ6 = C13LE.LIZ(GreetingCardViewModel.class);
        AwS546S0100000_2 awS546S0100000_27 = new AwS546S0100000_2(c19719912DlLIZ6, 378);
        AFwS248S0000000_14 aFwS248S0000000_146 = AFwS248S0000000_14.get$arr$(151);
        if (Intrinsics.LJFF(interfaceC724760Sbq, c01d1)) {
            assemVMLazy6 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ6), awS546S0100000_27, new C452070Ho5(), new C1622206Wu(this, z6), new C338490DOt(this, z6), new AwS558S0100000_14((HasDefaultViewModelProviderFactory) this, 596), aFwS248S0000000_146, new C451460Hn6(this, z6), new C451620HnM(this, z6), new C987103tV(this, z6));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy6 = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ6), awS546S0100000_27, new AwS558S0100000_14((Fragment) this, 597), aFwS248S0000000_146, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy6 = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ6), awS546S0100000_27, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS558S0100000_14((HasDefaultViewModelProviderFactory) this, 598), aFwS248S0000000_146, new C451460Hn6(this, z5), new C451620HnM(this, z5), new C987103tV(this, z5));
        }
        this.LLJJJJJIL = assemVMLazy6;
        this.LLJJL = "layer";
    }

    public final void SR() {
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJIIZILJ(this, false);
        Context context = getContext();
        if (context == null || !C960203pA.LIZIZ(context)) {
            View view = this.LLJI;
            if (view == null) {
                view = null;
            }
            int systemUiVisibility = view.getSystemUiVisibility();
            View view2 = this.LLJI;
            (view2 != null ? view2 : null).setSystemUiVisibility(systemUiVisibility | 8192);
        }
    }

    public final QuickChatViewModel UR() {
        AssemVMLazy assemVMLazy = this.LLIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLLL;
        return (QuickChatViewModel) assemVMLazy.getValue();
    }

    public final int VR() {
        int iLIZ;
        int iLIZJ;
        if (Build.VERSION.SDK_INT >= 35) {
            iLIZ = C497820Jfg.LIZ(requireContext()) - C497820Jfg.LIZJ(requireContext());
            iLIZJ = C1710306mr.LIZ(requireContext());
        } else {
            if (((Number) this.LLJJIII.getValue()).intValue() > 0) {
                return C497820Jfg.LIZ(requireContext());
            }
            iLIZ = C497820Jfg.LIZ(requireContext());
            iLIZJ = C497820Jfg.LIZJ(requireContext());
        }
        return iLIZ - iLIZJ;
    }

    @Override // X.InterfaceC744180THc
    public final Analysis getAnalysis() {
        String str;
        SessionInfo sessionInfo = this.LLIZLLLIL;
        if (sessionInfo == null || !sessionInfo.isSingleChat()) {
            SessionInfo sessionInfo2 = this.LLIZLLLIL;
            str = (sessionInfo2 == null || !sessionInfo2.isGroupChat()) ? null : "group";
        } else {
            str = "private";
        }
        Analysis analysis = new Analysis();
        analysis.setLabelName("chat");
        analysis.setCategory(str);
        IMChatRoomAnalytics iMChatRoomAnalytics = IMChatRoomAnalytics.LIZIZ;
        SessionInfo sessionInfo3 = this.LLIZLLLIL;
        iMChatRoomAnalytics.getClass();
        analysis.setExt_json(IMChatRoomAnalytics.LJII(sessionInfo3));
        return analysis;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLJLL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLJLL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{ChatRoomStreakViewModel.class, new AObjectS378S0100000_2(this, 2)}, defaultViewModelProviderFactory);
                    this.LLJLL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        DefaultLifecycleObserver defaultLifecycleObserver;
        super.onDestroy();
        IMAnalyticsUtil.LJIIIIZZ();
        this.LLJILJIL = null;
        WeakReference<DefaultLifecycleObserver> weakReference = this.LLJILLL;
        if (weakReference == null || (defaultLifecycleObserver = weakReference.get()) == null) {
            return;
        }
        getLifecycle().removeObserver(defaultLifecycleObserver);
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        String conversationId;
        super.onDestroyView();
        EnterChatParams enterChatParams = this.LLJ;
        if (enterChatParams != null) {
            C895830ZCj c895830ZCj = C895830ZCj.LIZ;
            int i = this.LLJJJJLIIL;
            String str = this.LLJJL;
            C0I0B.LJFF.LIZIZ();
            c895830ZCj.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("panel_height", String.valueOf(i));
            linkedHashMap.put("close_method", str);
            linkedHashMap.putAll(C895830ZCj.LIZJ(enterChatParams));
            C20684815ws.LJIILLIIL("chat_panel_close", linkedHashMap);
        }
        if (this.LLJLIL) {
            C1483410ohn.LJLJJI().LJIILLIIL();
        }
        IMPushApi.LIZ.getClass();
        C817570W5j.LIZ().LIZLLL().LIZLLL(0, "BaseQuickChatRoomFragment", "quick_chat_close", false);
        EventBus.LIZLLL().LJJI(this);
        this.LLJJIJI.stop();
        IMResourceLogger.LJFF(IMResourceLogger.LIZIZ, "leave_chat");
        SessionInfo sessionInfo = this.LLIZLLLIL;
        if (sessionInfo != null && (conversationId = sessionInfo.getConversationId()) != null) {
            IChatCustomizeHelper.LIZ.getClass();
            IChatCustomizeHelper iChatCustomizeHelperLIZ = C1619106Vp.LIZ();
            if (iChatCustomizeHelperLIZ != null) {
                iChatCustomizeHelperLIZ.onChatroomExit(conversationId);
            }
        }
        SessionInfo sessionInfo2 = this.LLIZLLLIL;
        if (sessionInfo2 != null) {
            IMChatRoomAnalytics.LJIIJ(IMChatRoomAnalytics.LIZIZ, sessionInfo2, this.LLJJIJI.LIZ(), sessionInfo2.getQuickChatViewType());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C0NJG.LIZ.setValue(Boolean.FALSE);
        this.LLJILJILJ.LIZ();
        IShareMessageToastHelper.LIZ.getClass();
        IShareMessageToastHelper iShareMessageToastHelperLIZ = C913340ZsK.LIZ();
        if (iShareMessageToastHelperLIZ != null) {
            iShareMessageToastHelperLIZ.As().remove(Integer.valueOf(System.identityHashCode(this)));
            iShareMessageToastHelperLIZ.Bs();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C0NJG.LIZ.setValue(Boolean.TRUE);
        this.LLJILJILJ.LIZIZ();
        IShareMessageToastHelper.LIZ.getClass();
        IShareMessageToastHelper iShareMessageToastHelperLIZ = C913340ZsK.LIZ();
        if (iShareMessageToastHelperLIZ != null) {
            iShareMessageToastHelperLIZ.As().add(Integer.valueOf(System.identityHashCode(this)));
            iShareMessageToastHelperLIZ.ws(new AwS593S0100000_14(this, 75));
        }
        if (C289800BXm.LIZ()) {
            AssemVMLazy assemVMLazy = this.LLJJJJJIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLLL;
            if (((C908950ZlF) assemVMLazy.getValue().getState()).LL != null) {
                return;
            }
        }
        this.LLJJ.LIZIZ(Collections.singletonList(getView()));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        SessionInfo sessionInfo;
        super.onStart();
        Context context = getContext();
        if (context == null || (sessionInfo = this.LLIZLLLIL) == null) {
            return;
        }
        IMPushApi.LIZ.getClass();
        C817570W5j.LIZ().LIZJ().LJ(context, sessionInfo.getConversationId(), sessionInfo.getChatType(), sessionInfo.getEnterFromForMob());
        if (sessionInfo.getChatType() == 3) {
            C20684815ws.onEventV3("tiktok_dm_groupquickchat");
        } else {
            C20684815ws.onEventV3("tiktok_dm_singlequickchat");
        }
    }

    @Override // X.InterfaceC457860HxQ
    public final void WI(List<? extends View> list) {
        if (list == null) {
            this.LLJJ.LIZIZ(Collections.singletonList(getView()));
        } else {
            this.LLJJ.LIZIZ(WR(list));
        }
    }

    public final List<View> WR(List<? extends View> list) {
        ViewGroup viewGroup;
        List<View> listLJJII;
        View view = getView();
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null && (listLJJII = C09RB.LJJII(C09RB.LJIIIZ(new C09RD(viewGroup), new AwS591S0100000_12(list, (List<? extends AbstractC1110520f0M<? extends AbstractC1136060ffY>>) 613)))) != null) {
            return listLJJII;
        }
        return C13BV.INSTANCE;
    }

    @Override // X.InterfaceC457860HxQ
    public final void ok(List<? extends View> list) {
        if (list == null) {
            this.LLJJ.LIZ(Collections.singletonList(getView()));
        } else {
            this.LLJJ.LIZ(WR(list));
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i = this.LLJJLIIIJLLLLLLLZ;
        int i2 = configuration.orientation;
        if (i == i2) {
            return;
        }
        this.LLJJLIIIJLLLLLLLZ = i2;
        View view = this.LLJI;
        if (view == null) {
            view = null;
        }
        view.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1767506w5(this, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x017f  */
    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r8) {
        /*
            Method dump skipped, instruction units count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.fragment.BaseQuickChatRoomFragment.onCreate(android.os.Bundle):void");
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
        ACListenerS117S0200000_14 aCListenerS117S0200000_14 = null;
        if (!c1365870leD.LIZJ) {
            SessionInfo sessionInfo = this.LLIZLLLIL;
            if (sessionInfo != null && sessionInfo.isGroupChat()) {
                IMContact iMContact = c1365870leD.LIZ;
                if ((iMContact instanceof IMConversation) && (iMConversation = (IMConversation) iMContact) != null) {
                    conversationId = iMConversation.getConversationId();
                } else {
                    conversationId = null;
                }
                SessionInfo sessionInfo2 = this.LLIZLLLIL;
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
                SessionInfo sessionInfo3 = this.LLIZLLLIL;
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
        Context context = getContext();
        if (context == null || (strLIZ = C345280DgE.LIZ(context, c1365870leD)) == null) {
            strLIZ = "";
        }
        AssemVMLazy assemVMLazy = this.LLJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLLL;
        int i = ((C457640Hx4) assemVMLazy.getValue().getState()).LLILLJJLI;
        ActionBarViewInfoAbility actionBarViewInfoAbility = (ActionBarViewInfoAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), ActionBarViewInfoAbility.class, null);
        if (actionBarViewInfoAbility != null) {
            iVR0 = actionBarViewInfoAbility.vR0();
        } else {
            iVR0 = 0;
        }
        int iLIZIZ = C14KI.LIZIZ(requireContext()) + i + iVR0;
        C1389910mGz c1389910mGz = new C1389910mGz(this);
        c1389910mGz.LJIIJ(strLIZ);
        c1389910mGz.LJI(R.style.y0);
        c1389910mGz.LJ(3000L);
        c1389910mGz.LIZ.LIZIZ = 0;
        c1389910mGz.LIZIZ(iLIZIZ);
        View view = this.LLJI;
        if (view == null) {
            view = null;
        }
        c1389910mGz.LIZ.LJIIIZ = view;
        Context context2 = getContext();
        if (context2 != null) {
            aCListenerS117S0200000_14 = new ACListenerS117S0200000_14(c1365870leD, context2, 15);
        }
        C1360890lWB c1360890lWB = c1389910mGz.LIZ;
        c1360890lWB.LJIIIIZZ = aCListenerS117S0200000_14;
        c1360890lWB.LIZLLL = 0;
        c1389910mGz.LJIIJJI();
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onLeaveGroup(C0HYH c0hyh) {
        List listLIZIZ = C1554610qYd.LIZIZ(C1558360qeg.LJFF(this, null), GroupChatProtocol.class, false);
        if (listLIZIZ != null) {
            Iterator it2 = listLIZIZ.iterator();
            while (it2.hasNext()) {
                ((GroupChatProtocol) it2.next()).onActivityResult(16, 2097, null);
            }
        }
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
        if (this.LLLLIL == null) {
            this.LLLLIL = new ArrayList();
        }
        ((ArrayList) this.LLLLIL).add(interfaceC687730QyJ);
    }

    @Override // X.InterfaceC1058150ddt
    public final void LLLLIIIILLL(TuxSheet tuxSheet, int i) {
        if (i == 5) {
            this.LLJJL = "header_slide";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ZR(android.view.View r6, java.lang.Integer r7) {
        /*
            r5 = this;
            r4 = 1
            if (r7 == 0) goto L61
            int r0 = r7.intValue()
            if (r0 != r4) goto L31
            X.0Zrd r0 = X.EnumC912910Zrd.NINETY
            double r2 = r0.getRatio()
            int r0 = r5.VR()
            double r0 = (double) r0
            double r2 = r2 * r0
            int r1 = X.C814420VxA.LIZ(r2)
        L19:
            int r4 = r7.intValue()
        L1d:
            r5.LLJJJJLIIL = r4
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            int r0 = r0.height
            if (r0 == r1) goto L30
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            r0.height = r1
            X.C786410Ut5.W5(r6, r0)
        L30:
            return
        L31:
            int r1 = r7.intValue()
            r0 = 2
            if (r1 != r0) goto L49
            X.0Zrd r0 = X.EnumC912910Zrd.SEVEN
            double r2 = r0.getRatio()
            int r0 = r5.VR()
            double r0 = (double) r0
            double r2 = r2 * r0
            int r1 = X.C814420VxA.LIZ(r2)
            goto L19
        L49:
            int r1 = r7.intValue()
            r0 = 3
            if (r1 != r0) goto L61
            X.0Zrd r0 = X.EnumC912910Zrd.SIX
            double r2 = r0.getRatio()
            int r0 = r5.VR()
            double r0 = (double) r0
            double r2 = r2 * r0
            int r1 = X.C814420VxA.LIZ(r2)
            goto L19
        L61:
            X.0Zrd r0 = X.EnumC912910Zrd.NINETY
            double r2 = r0.getRatio()
            int r0 = r5.VR()
            double r0 = (double) r0
            double r2 = r2 * r0
            int r1 = X.C814420VxA.LIZ(r2)
            if (r7 == 0) goto L1d
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.fragment.BaseQuickChatRoomFragment.ZR(android.view.View, java.lang.Integer):void");
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        super.onViewCreated(view, bundle);
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.t0f);
        if (viewStub != null) {
            viewStub.setLayoutResource(R.layout.cqs);
        }
        C786410Ut5.LJLLLL(viewStub);
        SessionInfo sessionInfo = this.LLIZLLLIL;
        boolean z2 = false;
        if (sessionInfo != null && sessionInfo.getShowKeyBoardByDefault()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            AssemVMLazy assemVMLazy = this.LLJJIJIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLLL;
            ((InputFieldVM) assemVMLazy.getValue()).LLJZIJLIL();
        }
        UR();
        Integer numLIZJ = C1308910kAL.LIZJ(((Number) this.LLJIJIL.getValue()).intValue(), requireContext());
        if (numLIZJ != null) {
            view.setBackgroundColor(numLIZJ.intValue());
        }
        ChatRoomAssembler chatRoomAssembler = (ChatRoomAssembler) this.LLJJIJIIJIL.getValue();
        if (chatRoomAssembler != null) {
            chatRoomAssembler.LIZ();
        }
        C0ZH3.LIZ();
        C736680Sv4.LJIIIIZZ(this, UR(), new C2217381BqS() { // from class: X.06di
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1653306df) obj).LLILLJJLI;
            }
        }, null, new AwS616S0100000_2(this, 76), 6);
        C736680Sv4.LJIIIIZZ(this, UR(), new C2217381BqS() { // from class: X.06dj
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1653306df) obj).LLILLL;
            }
        }, null, new AwS626S0100000_12(this, 38), 6);
        Bundle arguments = getArguments();
        if (arguments != null && arguments.getBoolean("key_expand_to_fullscreen", false)) {
            z2 = true;
        }
        if (z2) {
            AssemVMLazy assemVMLazy2 = this.LLJJJIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLLLL;
            ChatRoomStreakViewModel chatRoomStreakViewModel = (ChatRoomStreakViewModel) assemVMLazy2.getValue();
            chatRoomStreakViewModel.LLJI = true;
            chatRoomStreakViewModel.vQ2(null);
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1631206a6(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C1631106a5(this, null), 2);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C913310ZsH.LIZ(i, i2, intent, this);
        List listLIZIZ = C1554610qYd.LIZIZ(C1558360qeg.LJFF(this, null), GroupChatProtocol.class, false);
        if (listLIZIZ != null) {
            Iterator it2 = ((ArrayList) listLIZIZ).iterator();
            while (it2.hasNext()) {
                ((GroupChatProtocol) it2.next()).onActivityResult(i, i2, intent);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0138  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r12, android.view.ViewGroup r13, android.os.Bundle r14) {
        /*
            Method dump skipped, instruction units count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.fragment.BaseQuickChatRoomFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
