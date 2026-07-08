package com.ss.android.ugc.aweme.im.chatroom.common.titlebar;

import X.C013C;
import X.C019F;
import X.C01GW;
import X.C06IF;
import X.C06IG;
import X.C09R3;
import X.C0I0B;
import X.C0I20;
import X.C0NYY;
import X.C0PEM;
import X.C0QSJ;
import X.C0ZE7;
import X.C0ZE8;
import X.C0ZK1;
import X.C0ZKF;
import X.C0ZQW;
import X.C0ZQY;
import X.C0ZQZ;
import X.C0ZVS;
import X.C1243340iSa;
import X.C1256620io0;
import X.C1257180iou;
import X.C127G;
import X.C1308910kAL;
import X.C1371505Yj;
import X.C1383370m6R;
import X.C13LE;
import X.C1400340mXo;
import X.C1496105tP;
import X.C1496205tQ;
import X.C1496405tS;
import X.C1496905tX;
import X.C1509305vX;
import X.C1559260qg8;
import X.C1606750ruj;
import X.C1606770rul;
import X.C1607280rva;
import X.C1607310rvd;
import X.C1608750rxx;
import X.C1630806a2;
import X.C1637806bA;
import X.C1637906bB;
import X.C1661506ez;
import X.C1668706g9;
import X.C1705506m5;
import X.C1770206wW;
import X.C1908030zkf;
import X.C1954807lC;
import X.C19719912Dl;
import X.C20684815ws;
import X.C21646519nb;
import X.C21646719nd;
import X.C21647019ng;
import X.C2201941BFw;
import X.C2217381BqS;
import X.C23250099c;
import X.C289680BXa;
import X.C343820Dds;
import X.C418440Gaw;
import X.C419060Gbw;
import X.C426750GoL;
import X.C427660Gpo;
import X.C452501pT;
import X.C457780HxI;
import X.C687700QyG;
import X.C723580SZw;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737760Swo;
import X.C786410Ut5;
import X.C830490Whz;
import X.C876890Yad;
import X.C879360Yec;
import X.C894700Z8a;
import X.C895650ZBr;
import X.C896370ZEl;
import X.C897370ZIh;
import X.C897520ZIw;
import X.C898250ZLr;
import X.C898270ZLt;
import X.C899360ZPy;
import X.C909290Zln;
import X.EnumC1605470rsf;
import X.EnumC1606080rte;
import X.EnumC1606090rtf;
import X.EnumC1994907rf;
import X.EnumC21568119ax;
import X.EnumC452301pR;
import X.EnumC896490ZEx;
import X.InterfaceC1146704e9;
import X.InterfaceC1398730mVD;
import X.InterfaceC1669006gC;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC897380ZIi;
import X.InterfaceC899120ZPa;
import X.InterfaceC899440ZQg;
import Y.ACListenerS137S0100000_2;
import Y.ACListenerS149S0100000_14;
import Y.AObjectS67S0000000_14;
import Y.AObserverS206S0100000_2;
import Y.ARunnableS114S0100000_14;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.common.EventLiveData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.avatarloader.api.IDMAvatarLoader;
import com.ss.android.ugc.aweme.im.b2c.api.IIMBusinessChatService;
import com.ss.android.ugc.aweme.im.chatroom.api.IIMChatAnalytics;
import com.ss.android.ugc.aweme.im.chatroom.api.viewmodel.ChatCommonViewModel;
import com.ss.android.ugc.aweme.im.chatroom.common.titlebar.SingleTitleBarCenterViewModel;
import com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.InputFieldVM;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.saas.host.api.friends.IMFriendsService;
import com.ss.android.ugc.aweme.im.saas.host.api.friends.IMHostApiRelationService;
import com.ss.android.ugc.aweme.im.saas.host.api.live.IMLiveService;
import com.ss.android.ugc.aweme.im.saas.host.api.profile.IMHostApiIProfileExService;
import com.ss.android.ugc.aweme.im.saas.host.api.profile.IMHostApiIUserProfilePreload;
import com.ss.android.ugc.aweme.im.service.IDmHelper;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.social.thought.api.ISocialThoughtDataCenterService;
import com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo;
import com.ss.android.ugc.aweme.social.thought.view.SocialThoughtBaseBubbleBackgroundView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS368S0200000_2;
import kotlin.jvm.internal.AwS380S0200000_14;
import kotlin.jvm.internal.AwS415S0200000_14;
import kotlin.jvm.internal.AwS53S1000000_2;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.AwS616S0100000_2;
import kotlin.jvm.internal.AwS628S0100000_14;
import kotlin.jvm.internal.AwS90S0110000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
public class SingleTitleBarCenterAssem extends UISlotAssem implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLILZLLLI;
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723580SZw(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final C01GW LLJJIII = C1509305vX.LIZ(new AwS558S0100000_14(this, 493));
    public final AssemVMLazy LLJJIJI;
    public final AssemVMLazy LLJJIJIIJIL;
    public final AssemVMLazy LLJJIJIL;
    public final C01GW LLJJJ;
    public ConstraintLayout LLJJJIL;
    public TextSwitcher LLJJJJ;
    public TuxTextView LLJJJJJIL;
    public C419060Gbw LLJJJJLIIL;
    public ConstraintLayout LLJJL;
    public ViewSwitcher LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C01GW<C21646519nb> LLJLLIL;
    public AvatarComponentView LLJLLL;
    public final C01GW LLJZ;
    public InterfaceC1398730mVD LLJZIJLIL;
    public EnumC1605470rsf LLL;
    public User LLLF;
    public Long LLLFF;
    public String LLLFFI;
    public final C01GW LLLFZ;
    public final C01GW LLLI;
    public final C01GW LLLII;
    public InterfaceC899440ZQg LLLIIII;
    public final C0ZQY LLLIIIIL;
    public final C01GW LLLIIIL;
    public String LLLIIL;
    public volatile C0I20 LLLIILIL;
    public C127G LLLIL;
    public InterfaceC665370Q7z LLLILZ;
    public C0QSJ LLLILZJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SingleTitleBarCenterAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/im/chatroom/common/titlebar/SingleTitleBarCenterViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(SingleTitleBarCenterAssem.class, "chatCommonViewModel", "getChatCommonViewModel()Lcom/ss/android/ugc/aweme/im/chatroom/api/viewmodel/ChatCommonViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(SingleTitleBarCenterAssem.class, "inputFieldVM", "getInputFieldVM()Lcom/ss/android/ugc/aweme/im/chatroom/input/components/inputfield/InputFieldVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(SingleTitleBarCenterAssem.class, "replyVM", "getReplyVM()Lcom/ss/android/ugc/aweme/im/replyarea/ability/IReplyStateAbility;", 0);
        c09r3.getClass();
        LLLILZLLLI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    /* JADX WARN: Type inference failed for: r0v37, types: [X.0ZQY] */
    public SingleTitleBarCenterAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SingleTitleBarCenterViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJIJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ, 344), AFwS229S0000000_2.get$arr$(249), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(ChatCommonViewModel.class);
        this.LLJJIJIIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ2, 345), AFwS248S0000000_14.get$arr$(126), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(InputFieldVM.class);
        this.LLJJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS546S0100000_2(c19719912DlLIZ3, 346), AFwS248S0000000_14.get$arr$(127), null, true);
        this.LLJJJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 492));
        this.LLJL = C1509305vX.LIZ(new AwS558S0100000_14(this, 491));
        this.LLJLIL = C1509305vX.LIZ(new AwS558S0100000_14(this, 489));
        this.LLJLILLLLZIIL = C1509305vX.LIZ(new AwS558S0100000_14(this, 488));
        this.LLJLL = C1509305vX.LIZ(new AwS558S0100000_14(this, 490));
        this.LLJLLIL = C452501pT.LIZ(EnumC452301pR.NONE, new AwS558S0100000_14(this, 487));
        this.LLJZ = C1509305vX.LIZ(new AwS546S0100000_2(this, 342));
        this.LLL = EnumC1605470rsf.NONE;
        this.LLLFZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 494));
        this.LLLI = C452501pT.LIZIZ(new AwS546S0100000_2(this, 343));
        this.LLLII = C1509305vX.LIZ(AFwS201S0000000_14.get$arr$(121));
        this.LLLIIIIL = new C0NYY() { // from class: X.0ZQY
            @Override // X.C0NYY
            public final Object k3(Map<String, C595660NXw> map, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
                String uid;
                IMUser iMUser = this.LL.sp().getState().LL;
                if (iMUser != null && (uid = iMUser.getUid()) != null) {
                    this.LL.sp().setState(new AwS368S0200000_2(C896480ZEw.LIZIZ(map.get(uid)), C896480ZEw.LIZ(map.get(uid), null, 3), 105));
                }
                return Unit.LIZ;
            }
        };
        this.LLLIIIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 486));
        this.LLLIIL = "";
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.cqc;
    }

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
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStart_isOnStartEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onStop_isOnStopEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public void zp() {
        EventLiveData<C1243340iSa> eventLiveDataLIZ;
        C736680Sv4.LJIIIIZZ(this, sp(), new C2217381BqS() { // from class: X.0ZQb
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1639906bV) obj).LL;
            }
        }, null, new AwS628S0100000_14(this, 18), 6);
        SingleTitleBarCenterViewModel singleTitleBarCenterViewModelSp = sp();
        selectSubscribe(singleTitleBarCenterViewModelSp, new C2217381BqS() { // from class: X.06bl
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1639906bV) obj).LLILLJJLI;
            }
        }, new C2217381BqS() { // from class: X.06bm
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1639906bV) obj).LLILLL;
            }
        }, new C2217381BqS() { // from class: X.06db
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1639906bV) obj).LLILZIL);
            }
        }, C736820SvI.LIZIZ(singleTitleBarCenterViewModelSp.usedInReusedScene), null, new C1770206wW(this, 2));
        AssemVMLazy assemVMLazy = this.LLJJIJIIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLILZLLLI;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.06ac
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1593606Lu) obj).LLILLJJLI;
            }
        }, null, new AwS616S0100000_2(this, 37), 6);
        IMHostApiIProfileExService.LIZ.getClass();
        IMHostApiIProfileExService value = C895650ZBr.LIZIZ.getValue();
        if ((value == null || value.LIZLLL()) && C289680BXa.LIZ()) {
            IMHostApiRelationService.LIZ.getClass();
            IMHostApiRelationService iMHostApiRelationServiceLIZ = C898250ZLr.LIZ();
            if (iMHostApiRelationServiceLIZ == null || (eventLiveDataLIZ = iMHostApiRelationServiceLIZ.LIZ()) == null) {
                return;
            }
            eventLiveDataLIZ.observe(this, new AObserverS206S0100000_2(this, 4));
        }
    }

    public final void Ap() {
        TuxTextView tuxTextView = this.LLJJJJJIL;
        if (tuxTextView != null) {
            tuxTextView.setTuxFont(102);
        }
        TuxTextView tuxTextView2 = this.LLJJJJJIL;
        if (tuxTextView2 != null) {
            tuxTextView2.setTextColor(C1383370m6R.LJFF(R.attr.a1h));
        }
        ConstraintLayout constraintLayout = this.LLJJL;
        if (constraintLayout != null) {
            C786410Ut5.Y7(constraintLayout, new ACListenerS149S0100000_14(this, 22));
        }
    }

    public final void Jp() {
        if (((Boolean) this.LLLI.getValue()).booleanValue()) {
            if (C1661506ez.LIZ() == 2 || C1661506ez.LIZ() == 3) {
                C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C1496105tP(this, null), 2);
            }
        }
    }

    public final String Qp() {
        InterfaceC1669006gC interfaceC1669006gCLJIIJJI;
        String strLIZ;
        if (this.LLLIIL.length() > 0) {
            return this.LLLIIL;
        }
        C909290Zln c909290ZlnLp = lp();
        String str = "";
        if (c909290ZlnLp == null) {
            return "";
        }
        IIMBusinessChatService.LIZ.getClass();
        IIMBusinessChatService iIMBusinessChatService = C1668706g9.LIZIZ;
        if (iIMBusinessChatService != null && (interfaceC1669006gCLJIIJJI = iIMBusinessChatService.LJIIJJI()) != null && (strLIZ = interfaceC1669006gCLJIIJJI.LIZ(c909290ZlnLp, sp().getState().LL)) != null) {
            str = strLIZ;
        }
        this.LLLIIL = str;
        return str;
    }

    public final C0I20 hp() throws IllegalAccessException {
        C0QSJ c0qsjLIZLLL = this.LLLILZJ;
        if (c0qsjLIZLLL == null) {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIIZ = this.LLLILZ;
            if (interfaceC665370Q7zLJIIIZ == null) {
                interfaceC665370Q7zLJIIIZ = C687700QyG.LJIIIZ(this);
                this.LLLILZ = interfaceC665370Q7zLJIIIZ;
            }
            c0qsjLIZLLL = C687700QyG.LIZLLL(interfaceC665370Q7zLJIIIZ, new Class[]{ChatRoomScope.class});
            this.LLLILZJ = c0qsjLIZLLL;
            if (c0qsjLIZLLL == null) {
                return null;
            }
        }
        C0I20 c0i20 = (C0I20) c0qsjLIZLLL.getAbility(C0I20.class);
        C687700QyG.LJ(c0i20, C0I20.class);
        return c0i20;
    }

    public final C897520ZIw kp() {
        return (C897520ZIw) this.LLLII.getValue();
    }

    public final C909290Zln lp() {
        return (C909290Zln) this.LLJJIII.getValue();
    }

    public final C0ZQZ<SocialThoughtBaseBubbleBackgroundView> mp() {
        return (C0ZQZ) this.LLJLILLLLZIIL.getValue();
    }

    public final C21646719nd op() {
        return (C21646719nd) this.LLJL.getValue();
    }

    public final SingleTitleBarCenterViewModel sp() {
        AssemVMLazy assemVMLazy = this.LLJJIJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLILZLLLI;
        return (SingleTitleBarCenterViewModel) assemVMLazy.getValue();
    }

    public final void tp() {
        C01GW c01gw = C899360ZPy.LIZ;
        AvatarComponentView avatarComponentView = this.LLJLLL;
        if (avatarComponentView == null) {
            return;
        }
        C1608750rxx config = avatarComponentView.getConfig();
        new AwS380S0200000_14(this, avatarComponentView, 89).invoke(config.LIZ);
        C737760Swo c737760Swo = new C737760Swo(new C1606750ruj(EnumC1606080rte.DM, new C1606770rul(null, null, new AwS593S0100000_14(this, 240), null, new AwS415S0200000_14(this, avatarComponentView, 88), AFwS201S0000000_14.get$arr$(417), new AwS593S0100000_14(this, 242), null, null, 395), 4));
        C1607280rva c1607280rva = new C1607280rva(new C1607310rvd(EnumC1606090rtf.DM, (C0ZE7) this.LLLIIIL.getValue(), false, false, kp(), 14));
        C909290Zln c909290ZlnLp = lp();
        config.LIZLLL(c737760Swo, c1607280rva, (c909290ZlnLp != null && c909290ZlnLp.getEntranceType() == 3) ^ true ? new C1256620io0(new C1257180iou(8, EnumC1994907rf.ANIM_BADGE, null, null, 124), 2) : null);
        config.LIZIZ(AFwS248S0000000_14.get$arr$(427));
        avatarComponentView.LJFF(avatarComponentView.getConfig());
    }

    public final void up() {
        C909290Zln c909290ZlnLp;
        final String singleChatFromUserId;
        ISocialThoughtDataCenterService iSocialThoughtDataCenterService;
        EventLiveData<FollowStatus> relationObservable;
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorAnimate2;
        final SingleTitleBarCenterAssem singleTitleBarCenterAssem = this;
        C21646719nd c21646719ndOp = singleTitleBarCenterAssem.op();
        if (c21646719ndOp != null) {
            c21646719ndOp.LIZJ(singleTitleBarCenterAssem.getContext());
        }
        C21646719nd c21646719ndOp2 = singleTitleBarCenterAssem.op();
        if (c21646719ndOp2 != null) {
            c21646719ndOp2.LJIIJ(singleTitleBarCenterAssem.sp().getState().LLILZLL);
        }
        C736680Sv4.LJIIIIZZ(singleTitleBarCenterAssem, singleTitleBarCenterAssem.sp(), new C2217381BqS() { // from class: X.0ZQd
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1639906bV) obj).LLILZLL;
            }
        }, C736820SvI.LIZLLL(), new AwS628S0100000_14(singleTitleBarCenterAssem, 17), 4);
        if (!((Boolean) singleTitleBarCenterAssem.LLLI.getValue()).booleanValue() || (C1661506ez.LIZ() != 1 && C1661506ez.LIZ() != 3)) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(singleTitleBarCenterAssem), null, null, new C1496405tS(singleTitleBarCenterAssem, null), 3);
        }
        singleTitleBarCenterAssem.Tp(singleTitleBarCenterAssem.sp().getState().LLILLL, false);
        if (!C343820Dds.LIZ() || (c909290ZlnLp = singleTitleBarCenterAssem.lp()) == null || (singleChatFromUserId = c909290ZlnLp.getSingleChatFromUserId()) == null || (iSocialThoughtDataCenterService = (ISocialThoughtDataCenterService) PluggableExtentionKt.pluggableSpiForReal(ISocialThoughtDataCenterService.class)) == null) {
            return;
        }
        boolean z = singleTitleBarCenterAssem.sp().getState().LLIZLLLIL != null;
        C0ZQZ<SocialThoughtBaseBubbleBackgroundView> c0zqzMp = singleTitleBarCenterAssem.mp();
        ACListenerS137S0100000_2 aCListenerS137S0100000_2 = new ACListenerS137S0100000_2(singleTitleBarCenterAssem, 66);
        if (c0zqzMp.LIZIZ.LIZIZ()) {
            View viewLIZ = c0zqzMp.LIZ();
            if (viewLIZ != null) {
                C786410Ut5.I7(aCListenerS137S0100000_2, viewLIZ);
            }
        } else {
            c0zqzMp.LIZJ = aCListenerS137S0100000_2;
        }
        String str = singleTitleBarCenterAssem.sp().getState().LLJ;
        if (str.length() > 0) {
            singleTitleBarCenterAssem.Ip(str, true);
        }
        C736680Sv4.LJIIIIZZ(singleTitleBarCenterAssem, singleTitleBarCenterAssem.sp(), new C2217381BqS() { // from class: X.0ZQf
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1639906bV) obj).LLJ;
            }
        }, C736820SvI.LIZLLL(), new AwS628S0100000_14(singleTitleBarCenterAssem, 58), 4);
        C736680Sv4.LJIIIIZZ(singleTitleBarCenterAssem, singleTitleBarCenterAssem.sp(), new C2217381BqS() { // from class: X.06bX
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1639906bV) obj).LLJI;
            }
        }, C736820SvI.LIZLLL(), new AwS628S0100000_14(singleTitleBarCenterAssem, 59), 4);
        if (z) {
            C21646519nb value = singleTitleBarCenterAssem.LLJLLIL.getValue();
            C06IF c06if = singleTitleBarCenterAssem.sp().getState().LLJI;
            value.LJIJ = false;
            value.LJIJJ = null;
            value.LJIJI = c06if;
            ValueAnimator valueAnimator = value.LJJII;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            value.LJJII = null;
            View viewInvoke = value.LIZLLL.invoke();
            if (viewInvoke != null && (viewPropertyAnimatorAnimate2 = viewInvoke.animate()) != null) {
                viewPropertyAnimatorAnimate2.cancel();
            }
            View view = value.LJIIL;
            if (view != null && (viewPropertyAnimatorAnimate = view.animate()) != null) {
                viewPropertyAnimatorAnimate.cancel();
            }
            int i = C06IG.LIZ[c06if.ordinal()];
            if (i == 1) {
                View view2 = value.LJIILIIL;
                if (view2 != null) {
                    C786410Ut5.LJLLLLLL(8, view2);
                }
                View view3 = value.LJIIL;
                if (view3 != null) {
                    C786410Ut5.LJLLLLLL(8, view3);
                    value.LJIIIZ(view3);
                }
                FrameLayout frameLayout = value.LJIILJJIL;
                if (frameLayout != null) {
                    C786410Ut5.LJZ(8, frameLayout);
                }
                View viewInvoke2 = value.LIZLLL.invoke();
                if (viewInvoke2 != null) {
                    value.LJIIJ(viewInvoke2);
                    C786410Ut5.T4(viewInvoke2, 0.0f);
                    C21646719nd c21646719ndInvoke = value.LJI.invoke();
                    if (c21646719ndInvoke != null) {
                        c21646719ndInvoke.LJ(viewInvoke2, value.LJFF.invoke());
                    }
                }
                value.LJIIL(0);
            } else if (i == 2) {
                View view4 = value.LJIILIIL;
                if (view4 != null) {
                    C786410Ut5.LJLLLLLL(8, view4);
                }
                View view5 = value.LJIIL;
                if (view5 != null) {
                    ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view5.animate();
                    if (viewPropertyAnimatorAnimate3 != null) {
                        viewPropertyAnimatorAnimate3.cancel();
                    }
                    C21647019ng c21647019ng = value.LJIIZILJ;
                    if (c21647019ng != null) {
                        c21647019ng.LIZ();
                    }
                    value.LJIIZILJ = null;
                    C786410Ut5.LJLLLLLL(8, view5);
                    value.LJIIIZ(view5);
                }
                FrameLayout frameLayout2 = value.LJIILJJIL;
                if (frameLayout2 != null) {
                    C786410Ut5.LJZ(8, frameLayout2);
                }
                value.LJIIL(0);
                View viewInvoke3 = value.LIZLLL.invoke();
                if (viewInvoke3 != null) {
                    value.LJIIJ(viewInvoke3);
                    C786410Ut5.T4(viewInvoke3, 1.0f);
                    C21646719nd c21646719ndInvoke2 = value.LJI.invoke();
                    if (c21646719ndInvoke2 != null) {
                        c21646719ndInvoke2.LJIIIIZZ(viewInvoke3, false);
                    }
                }
            } else {
                if (i != 3) {
                    throw new C1954807lC();
                }
                View viewInvoke4 = value.LIZLLL.invoke();
                if (viewInvoke4 != null) {
                    value.LJIIJ(viewInvoke4);
                    C786410Ut5.T4(viewInvoke4, 0.0f);
                    C21646719nd c21646719ndInvoke3 = value.LJI.invoke();
                    if (c21646719ndInvoke3 != null) {
                        c21646719ndInvoke3.LJFF(viewInvoke4);
                    }
                }
                value.LJIILIIL(true);
            }
        }
        if (C343820Dds.LIZ()) {
            C013C c013c = new C013C();
            c013c.element = z;
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(singleTitleBarCenterAssem);
            singleTitleBarCenterAssem = singleTitleBarCenterAssem;
            C23250099c.LIZLLL(lifecycleScope, null, null, new C1371505Yj(iSocialThoughtDataCenterService, singleChatFromUserId, c013c, singleTitleBarCenterAssem, null), 3);
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(singleTitleBarCenterAssem), null, null, new C1496205tQ(singleTitleBarCenterAssem, null), 3);
        IMFriendsService.LIZ.getClass();
        IMFriendsService iMFriendsServiceLIZ = C898270ZLt.LIZ();
        if (iMFriendsServiceLIZ != null && (relationObservable = iMFriendsServiceLIZ.getRelationObservable()) != null) {
            relationObservable.observe(singleTitleBarCenterAssem, new Observer() { // from class: X.05tV
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    boolean z2;
                    FollowStatus followStatus = (FollowStatus) obj;
                    if (Intrinsics.LJFF(followStatus.getUserId(), singleChatFromUserId)) {
                        SingleTitleBarCenterViewModel singleTitleBarCenterViewModelSp = singleTitleBarCenterAssem.sp();
                        if (followStatus.getFollowStatus() == 2) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (C343820Dds.LIZ() && singleTitleBarCenterViewModelSp.getState().LLIZ != z2) {
                            singleTitleBarCenterViewModelSp.setState(new AwS90S0110000_2(singleTitleBarCenterViewModelSp, z2, 5));
                        }
                    }
                }
            });
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(singleTitleBarCenterAssem), null, null, new C1630806a2(singleTitleBarCenterAssem, null), 3);
    }

    public final void yp() {
        String conversationId;
        InterfaceC899120ZPa interfaceC899120ZPa = (InterfaceC899120ZPa) this.LLLFZ.getValue();
        if (interfaceC899120ZPa != null) {
            C909290Zln c909290ZlnLp = lp();
            if (c909290ZlnLp == null || (conversationId = c909290ZlnLp.getConversationId()) == null) {
                conversationId = "";
            }
            interfaceC899120ZPa.LIZLLL(1, conversationId, null, true);
        }
    }

    public final void Fp() {
        IMUser fromUser;
        C909290Zln c909290ZlnLp = lp();
        String singleChatFromUserId = c909290ZlnLp != null ? c909290ZlnLp.getSingleChatFromUserId() : null;
        C909290Zln c909290ZlnLp2 = lp();
        if (c909290ZlnLp2 == null || (fromUser = c909290ZlnLp2.getFromUser()) == null) {
            return;
        }
        IMHostApiIUserProfilePreload.LIZ.getClass();
        IMHostApiIUserProfilePreload value = C879360Yec.LIZIZ.getValue();
        if (value != null) {
            IMUser.Companion.getClass();
            value.LIZ(C2201941BFw.LJII(fromUser));
        }
        IDmHelper.LIZ.getClass();
        IDmHelper iDmHelperLIZ = C876890Yad.LIZ();
        if (iDmHelperLIZ != null) {
            C909290Zln c909290ZlnLp3 = lp();
            String enterMethod = c909290ZlnLp3 != null ? c909290ZlnLp3.getEnterMethod() : null;
            C909290Zln c909290ZlnLp4 = lp();
            iDmHelperLIZ.LJIIIZ(singleChatFromUserId, null, enterMethod, c909290ZlnLp4 != null ? c909290ZlnLp4.getConversationId() : null);
        }
        IIMChatAnalytics.LIZ.getClass();
        IIMChatAnalytics iIMChatAnalyticsLIZ = C1705506m5.LIZ();
        if (iIMChatAnalyticsLIZ != null) {
            iIMChatAnalyticsLIZ.LJ(C0I0B.LJFF.LIZIZ(), null, singleChatFromUserId, "chat", "click_name", String.valueOf(System.currentTimeMillis()));
        }
    }

    public void Gp() {
        Ap();
        up();
        tp();
        yp();
        zp();
        Jp();
    }

    @Override // X.AbstractC738140SxQ, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        ViewModelProvider.Factory defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        C127G c127g = this.LLLIL;
        if (c127g == null) {
            synchronized (this) {
                c127g = this.LLLIL;
                if (c127g == null) {
                    C127G c127g2 = new C127G(new Object[]{ChatCommonViewModel.class, new AObjectS67S0000000_14(this, 15)}, defaultViewModelProviderFactory);
                    this.LLLIL = c127g2;
                    return c127g2;
                }
            }
        }
        return c127g;
    }

    public final SocialThoughtBaseBubbleBackgroundView ip() {
        SocialThoughtBaseBubbleBackgroundView socialThoughtBaseBubbleBackgroundView = (SocialThoughtBaseBubbleBackgroundView) mp().LIZ();
        if (socialThoughtBaseBubbleBackgroundView == null) {
            return null;
        }
        socialThoughtBaseBubbleBackgroundView.setBodyMinWidthOverrideDp(C418440Gaw.LIZIZ(12));
        socialThoughtBaseBubbleBackgroundView.setBubbleShape(C426750GoL.LIZLLL(socialThoughtBaseBubbleBackgroundView.getContext()) ? EnumC21568119ax.RIGHT_BOTTOM_SMALL : EnumC21568119ax.LEFT_BOTTOM_SMALL);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zo, socialThoughtBaseBubbleBackgroundView.getContext());
        socialThoughtBaseBubbleBackgroundView.setFillColor(numLIZJ != null ? numLIZJ.intValue() : -1);
        socialThoughtBaseBubbleBackgroundView.LIZJ();
        return socialThoughtBaseBubbleBackgroundView;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorAnimate2;
        super.onDestroy();
        C897520ZIw c897520ZIwKp = kp();
        if (c897520ZIwKp != null) {
            c897520ZIwKp.destroy();
        }
        if (this.LLJLLIL.isInitialized()) {
            C21646519nb value = this.LLJLLIL.getValue();
            View viewInvoke = value.LIZLLL.invoke();
            if (viewInvoke != null && (viewPropertyAnimatorAnimate2 = viewInvoke.animate()) != null) {
                viewPropertyAnimatorAnimate2.cancel();
            }
            View view = value.LJIIL;
            if (view != null && (viewPropertyAnimatorAnimate = view.animate()) != null) {
                viewPropertyAnimatorAnimate.cancel();
            }
            C21647019ng c21647019ng = value.LJIILLIIL;
            if (c21647019ng != null) {
                c21647019ng.LIZ();
            }
            value.LJIILLIIL = null;
            C21647019ng c21647019ng2 = value.LJIIZILJ;
            if (c21647019ng2 != null) {
                c21647019ng2.LIZ();
            }
            value.LJIIZILJ = null;
            ValueAnimator valueAnimator = value.LJJII;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            value.LJJII = null;
            ValueAnimator valueAnimator2 = value.LJJIII;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            value.LJJIII = null;
            value.LJJIIJ = 0;
            View view2 = value.LJIILIIL;
            if (view2 != null) {
                ViewParent parent = view2.getParent();
                if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
                    C786410Ut5.LJJJLZIJ(view2, viewGroup2);
                }
            }
            FrameLayout frameLayout = value.LJIILJJIL;
            if (frameLayout != null) {
                ViewParent parent2 = frameLayout.getParent();
                if ((parent2 instanceof ViewGroup) && (viewGroup = (ViewGroup) parent2) != null) {
                    C786410Ut5.LJJJLZIJ(frameLayout, viewGroup);
                }
            }
            value.LJIILIIL = null;
            value.LJIILJJIL = null;
            value.LJIILL = null;
            value.LJIIL = null;
            value.LJIJJ = null;
            value.LJIJ = false;
            value.LJJ = null;
            value.LJJIFFI = false;
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
        SingleTitleBarCenterViewModel singleTitleBarCenterViewModelSp = sp();
        if (singleTitleBarCenterViewModelSp.getState().LL == null) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(singleTitleBarCenterViewModelSp), null, null, new C1496905tX(singleTitleBarCenterViewModelSp, null), 3);
        }
        Long l = this.LLLFF;
        if (l != null) {
            Bp(Long.valueOf(l.longValue()));
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onStart() {
        super.onStart();
        C897520ZIw c897520ZIwKp = kp();
        if (c897520ZIwKp != null) {
            c897520ZIwKp.LJ();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onStop() {
        super.onStop();
        C897520ZIw c897520ZIwKp = kp();
        if (c897520ZIwKp != null) {
            c897520ZIwKp.LJII();
        }
    }

    public final void Bp(Long l) {
        String string;
        String uid;
        String string2;
        String uid2;
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("enter_from_merge", "chat");
        c830490Whz.put("enter_method", "chat_head");
        c830490Whz.put("action_type", "click");
        String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
        String str = "";
        if (curUserId == null) {
            curUserId = "";
        }
        c830490Whz.put("user_id", curUserId);
        if (l == null || (string = l.toString()) == null) {
            string = "";
        }
        c830490Whz.put("room_id", string);
        User user = this.LLLF;
        if (user == null || (uid = user.getUid()) == null) {
            uid = "";
        }
        c830490Whz.put("anchor_id", uid);
        User user2 = this.LLLF;
        if (user2 == null || (string2 = Integer.valueOf(user2.getFollowStatus()).toString()) == null) {
            string2 = "";
        }
        c830490Whz.put("follow_status", string2);
        c830490Whz.put("mg_distribution_type", "anchor");
        User user3 = this.LLLF;
        if (user3 != null && (uid2 = user3.getUid()) != null) {
            str = uid2;
        }
        c830490Whz.put("distribution_user_list", str);
        IMLiveService.LIZ.getClass();
        IMLiveService iMLiveServiceLIZ = C0ZVS.LIZ();
        if (iMLiveServiceLIZ != null) {
            iMLiveServiceLIZ.LJIILL(c830490Whz);
        }
    }

    public final void Ep(ThoughtInfo thoughtInfo) {
        String singleChatFromUserId;
        C909290Zln c909290ZlnLp = lp();
        String conversationId = null;
        if (c909290ZlnLp != null) {
            conversationId = c909290ZlnLp.getConversationId();
        }
        String str = "";
        if (conversationId == null) {
            conversationId = "";
        }
        C909290Zln c909290ZlnLp2 = lp();
        if (c909290ZlnLp2 == null || (singleChatFromUserId = c909290ZlnLp2.getSingleChatFromUserId()) == null) {
            singleChatFromUserId = "";
        }
        String str2 = thoughtInfo.thoughtId;
        if (str2 != null) {
            str = str2;
        }
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("ttsocial_chat_header_thought_bubble_click", C0ZQW.LIZ(conversationId, "private", singleChatFromUserId, CardStruct.IStatusCode.DEFAULT, str));
    }

    public final void Up(IMUser iMUser) {
        ViewGroup.LayoutParams layoutParams;
        C427660Gpo avatar;
        ConstraintLayout constraintLayout = this.LLJJJIL;
        String strLIZIZ = null;
        if (constraintLayout != null) {
            layoutParams = constraintLayout.getLayoutParams();
        } else {
            layoutParams = null;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (C896370ZEl.LIZ()) {
            layoutParams2.gravity = 16;
        } else {
            layoutParams2.gravity = 17;
        }
        UrlModel displayAvatar = iMUser.getDisplayAvatar();
        String uid = iMUser.getUid();
        if (iMUser.isBlocked()) {
            AvatarComponentView avatarComponentView = this.LLJLLL;
            if (avatarComponentView != null && (avatar = avatarComponentView.getAvatar()) != null) {
                avatar.setActualImageResource(R.raw.icon_color_default_avatar);
            }
        } else {
            IDMAvatarLoader iDMAvatarLoader = (IDMAvatarLoader) this.LLJZ.getValue();
            if (iDMAvatarLoader != null) {
                if (uid == null) {
                    uid = "";
                }
                iDMAvatarLoader.LIZIZ(uid, displayAvatar, new C0ZKF(0, 0, 0, 0, 0, (C0ZK1) null, 127));
            }
        }
        ConstraintLayout constraintLayout2 = this.LLJJJIL;
        if (constraintLayout2 != null) {
            C786410Ut5.m6(constraintLayout2, layoutParams2);
        }
        IMFriendsService.LIZ.getClass();
        IMFriendsService iMFriendsServiceLIZ = C898270ZLt.LIZ();
        if (iMFriendsServiceLIZ != null) {
            strLIZIZ = iMFriendsServiceLIZ.LIZIZ(iMUser.getUid(), iMUser.getDisplayName());
        }
        TuxTextView tuxTextView = this.LLJJJJJIL;
        if (tuxTextView != null) {
            tuxTextView.setText(strLIZIZ);
        }
        AvatarComponentView avatarComponentView2 = this.LLJLLL;
        if (avatarComponentView2 != null) {
            avatarComponentView2.setContentDescription(strLIZIZ);
        }
        C1908030zkf.LJI(getContext(), iMUser.getCustomVerify(), iMUser.getEnterpriseVerifyReason(), this.LLJJJJJIL);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJJJIL = (ConstraintLayout) view;
        this.LLJLLL = (AvatarComponentView) view.findViewById(R.id.l9h);
        this.LLJJJJJIL = (TuxTextView) view.findViewById(R.id.i0q);
        this.LLJJJJ = (TextSwitcher) view.findViewById(R.id.ugr);
        this.LLJJL = (ConstraintLayout) view.findViewById(R.id.xl7);
        this.LLJJLIIIJLLLLLLLZ = (ViewSwitcher) view.findViewById(R.id.uhd);
        this.LLJJJJLIIL = (C419060Gbw) view.findViewById(R.id.i0r);
        C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS114S0100000_14(this, 15));
    }

    public final void Ip(String str, boolean z) {
        SocialThoughtBaseBubbleBackgroundView socialThoughtBaseBubbleBackgroundViewIp = ip();
        if (socialThoughtBaseBubbleBackgroundViewIp == null) {
            return;
        }
        TextView textView = (TextView) ((C0ZQZ) this.LLJLL.getValue()).LIZ();
        if (textView != null) {
            textView.setText(str);
        }
        if (z) {
            C21646719nd c21646719ndOp = op();
            if (c21646719ndOp != null) {
                c21646719ndOp.LJIIIIZZ(socialThoughtBaseBubbleBackgroundViewIp, false);
                return;
            }
            return;
        }
        C21646719nd c21646719ndOp2 = op();
        if (c21646719ndOp2 == null) {
            return;
        }
        c21646719ndOp2.LJIIIIZZ(socialThoughtBaseBubbleBackgroundViewIp, true);
    }

    public final void Tp(C894700Z8a c894700Z8a, boolean z) {
        String conversationId;
        String string;
        String strQp = "";
        if (z) {
            Context context = getContext();
            if (context != null && (string = context.getString(2131832181)) != null) {
                strQp = string;
            }
        } else if (c894700Z8a != null) {
            InterfaceC897380ZIi.LIZIZ.getClass();
            C897370ZIh.LIZ().LJIIJJI();
            C909290Zln c909290ZlnLp = lp();
            if (c909290ZlnLp != null && (conversationId = c909290ZlnLp.getConversationId()) != null) {
                strQp = conversationId;
            }
            C0ZE8.LJII(strQp, c894700Z8a.LIZIZ);
            strQp = c894700Z8a.LIZIZ != EnumC896490ZEx.NO_STATUS ? c894700Z8a.LIZ : Qp();
        } else {
            strQp = Qp();
        }
        sp().setState(new AwS53S1000000_2(strQp, 13));
    }
}
