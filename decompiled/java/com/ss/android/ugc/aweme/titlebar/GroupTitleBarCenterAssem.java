package com.ss.android.ugc.aweme.titlebar;

import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0I0B;
import X.C0Y8T;
import X.C0YSQ;
import X.C0Z6T;
import X.C0ZE7;
import X.C0ZE8;
import X.C0ZFW;
import X.C0ZPJ;
import X.C0ZPK;
import X.C0ZPM;
import X.C0ZPP;
import X.C0ZPX;
import X.C13LE;
import X.C1462005nu;
import X.C1509305vX;
import X.C1559260qg8;
import X.C15606069c;
import X.C1637806bA;
import X.C1637906bB;
import X.C1689706jX;
import X.C1727806pg;
import X.C19719912Dl;
import X.C19727912Gn;
import X.C19EG;
import X.C21646719nd;
import X.C2217381BqS;
import X.C417390GYf;
import X.C418440Gaw;
import X.C426750GoL;
import X.C452501pT;
import X.C461720I8s;
import X.C723580SZw;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C814420VxA;
import X.C888950Yu5;
import X.C894700Z8a;
import X.C897370ZIh;
import X.C897490ZIt;
import X.C899360ZPy;
import X.C913140Zs0;
import X.EnumC1910440zoY;
import X.EnumC899300ZPs;
import X.InterfaceC2217461Bqa;
import X.InterfaceC876950Yaj;
import X.InterfaceC897380ZIi;
import X.InterfaceC899120ZPa;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ARunnableS114S0100000_14;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.group.ChatConvUpdateVM;
import com.ss.android.ugc.aweme.group.MockedConvVM;
import com.ss.android.ugc.aweme.im.avatarloader.api.IDMAvatarLoader;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.group.GroupChatVM;
import com.ss.android.ugc.aweme.publicgroup.preview.ChatPreviewModeVM;
import com.ss.android.ugc.aweme.titlebar.viewmodel.GroupTitleBarViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS616S0100000_2;
import kotlin.jvm.internal.AwS628S0100000_14;
import wh6.AbS695S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public class GroupTitleBarCenterAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJZ;
    public final C1559260qg8 LLJJI = new C1559260qg8(new C723580SZw(this, C15606069c.class, null), checkSupervisorPrepared());
    public final C01GW LLJJIII = C1509305vX.LIZ(new AwS558S0100000_14(this, 1133));
    public final C01GW LLJJIJI = C1509305vX.LIZ(new AwS558S0100000_14(this, 1132));
    public final AssemVMLazy LLJJIJIIJIL;
    public final AssemVMLazy LLJJIJIL;
    public final AssemVMLazy LLJJJ;
    public final AssemVMLazy LLJJJIL;
    public final AssemVMLazy LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public C19727912Gn LLJLL;
    public final C01GW LLJLLIL;
    public final C01GW LLJLLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(GroupTitleBarCenterAssem.class, "chatConvUpdateVM", "getChatConvUpdateVM()Lcom/ss/android/ugc/aweme/group/ChatConvUpdateVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(GroupTitleBarCenterAssem.class, "groupTitleBarVM", "getGroupTitleBarVM()Lcom/ss/android/ugc/aweme/titlebar/viewmodel/GroupTitleBarViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(GroupTitleBarCenterAssem.class, "groupChatVM", "getGroupChatVM()Lcom/ss/android/ugc/aweme/im/sdk/chat/ui/base/assems/group/GroupChatVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(GroupTitleBarCenterAssem.class, "mockedConvVM", "getMockedConvVM()Lcom/ss/android/ugc/aweme/group/MockedConvVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(GroupTitleBarCenterAssem.class, "previewModeVM", "getPreviewModeVM()Lcom/ss/android/ugc/aweme/publicgroup/preview/ChatPreviewModeVM;", 0);
        c09r3.getClass();
        LLJZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
    }

    public GroupTitleBarCenterAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ChatConvUpdateVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJIJIIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS558S0100000_14(c19719912DlLIZ, 1142), AFwS248S0000000_14.get$arr$(334), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(GroupTitleBarViewModel.class);
        this.LLJJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS558S0100000_14(c19719912DlLIZ2, 1125), AFwS248S0000000_14.get$arr$(335), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(GroupChatVM.class);
        this.LLJJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS558S0100000_14(c19719912DlLIZ3, 1128), AFwS248S0000000_14.get$arr$(336), null, true);
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(MockedConvVM.class);
        this.LLJJJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ4), c019f, c1637906bB, new AwS558S0100000_14(c19719912DlLIZ4, 1131), AFwS248S0000000_14.get$arr$(337), null, true);
        C19719912Dl c19719912DlLIZ5 = C13LE.LIZ(ChatPreviewModeVM.class);
        this.LLJJJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ5), c019f, c1637906bB, new AwS558S0100000_14(c19719912DlLIZ5, 1134), AFwS248S0000000_14.get$arr$(338), null, true);
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1135));
        this.LLJJJJLIIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1137));
        this.LLJJL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1139));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1127));
        this.LLJL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1126));
        this.LLJLIL = C1509305vX.LIZ(new AwS558S0100000_14(this, 1129));
        this.LLJLILLLLZIIL = C1509305vX.LIZ(new AwS558S0100000_14(this, 1130));
        this.LLJLLIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1136));
        this.LLJLLL = C1509305vX.LIZ(new AwS558S0100000_14(this, 1138));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public int Co() {
        return R.layout.cq8;
    }

    public final void Fp() {
        ((TuxTextView) this.LLJJJJLIIL.getValue()).setTuxFont(102);
        ((C21646719nd) this.LLJLLL.getValue()).LIZJ(getContext());
        ((C21646719nd) this.LLJLLL.getValue()).LJIIJ(Ap().getState().LLILLJJLI);
        C736680Sv4.LJIIIIZZ(this, Ap(), new C2217381BqS() { // from class: X.0ZPN
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0ZPR) obj).LLILLJJLI;
            }
        }, C736820SvI.LIZLLL(), new AwS628S0100000_14(this, 35), 4);
    }

    public void Gp() {
        AssemVMLazy assemVMLazy = this.LLJJIJIIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJZ;
        ChatConvUpdateVM chatConvUpdateVM = (ChatConvUpdateVM) assemVMLazy.getValue();
        chatConvUpdateVM.LLILZLL.put(this, new C0ZPX(Ap()));
        C736680Sv4.LJIIIIZZ(this, Ap(), new C2217381BqS() { // from class: X.0ZPQ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0ZPR) obj).LL;
            }
        }, null, new AwS628S0100000_14(this, 36), 6);
        C736680Sv4.LJIIIIZZ(this, this.LLJJJ.getValue(), new C2217381BqS() { // from class: X.0ZP9
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1657506eL) obj).LL;
            }
        }, null, new AwS616S0100000_2(this, 65), 6);
        C736680Sv4.LJIIIIZZ(this, this.LLJJJ.getValue(), new C2217381BqS() { // from class: X.0ZHW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1657506eL) obj).LLIZ;
            }
        }, null, new AwS616S0100000_2(this, 66), 6);
        SessionInfo sessionInfo = (SessionInfo) this.LLJJIII.getValue();
        if (sessionInfo == null || !sessionInfo.isPreviewMode()) {
            return;
        }
        C736680Sv4.LJIIIIZZ(this, this.LLJJJJ.getValue(), new C2217381BqS() { // from class: X.0ZPV
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C899290ZPr) obj).LL;
            }
        }, null, new AwS628S0100000_14(this, 42), 6);
    }

    public void Tp(List<C1462005nu> list) {
    }

    public final GroupTitleBarViewModel Ap() {
        AssemVMLazy assemVMLazy = this.LLJJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJZ;
        return (GroupTitleBarViewModel) assemVMLazy.getValue();
    }

    public void Bp() {
        String conversationId;
        InterfaceC897380ZIi.LIZIZ.getClass();
        if (C897370ZIh.LIZ().LJ().LIZ() || C1689706jX.LIZ()) {
            C1727806pg c1727806pg = C1727806pg.LIZ;
            SessionInfo sessionInfo = (SessionInfo) this.LLJJIII.getValue();
            if (sessionInfo == null || (conversationId = sessionInfo.getConversationId()) == null) {
                conversationId = "";
            }
            if (c1727806pg.LIZ("group_chat_operation_enable_activity_status", conversationId, C461720I8s.LIZIZ(), false) && C0ZFW.LIZ.LJIIIZ(yp())) {
                Ip();
                C736680Sv4.LJIIIIZZ(this, Ap(), new C2217381BqS() { // from class: X.0ZPO
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((C0ZPR) obj).LLILLL;
                    }
                }, null, new AwS628S0100000_14(this, 34), 6);
            }
        }
    }

    public Boolean Jp() {
        C19727912Gn c19727912Gn = this.LLJLL;
        if (c19727912Gn != null) {
            return Boolean.valueOf(c19727912Gn.LLJ);
        }
        return null;
    }

    public final void mp() {
        InterfaceC899120ZPa interfaceC899120ZPa = (InterfaceC899120ZPa) this.LLJLLIL.getValue();
        if (interfaceC899120ZPa != null) {
            interfaceC899120ZPa.LIZLLL(1, zp(), null, true);
        }
    }

    public final C417390GYf sp() {
        return (C417390GYf) this.LLJL.getValue();
    }

    public final FrameLayout tp() {
        return (FrameLayout) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public IDMAvatarLoader up() {
        return (IDMAvatarLoader) this.LLJLILLLLZIIL.getValue();
    }

    public final C0Y8T yp() {
        return C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(zp());
    }

    public final String zp() {
        return (String) this.LLJJIJI.getValue();
    }

    public final void Ep() {
        View viewHp = hp();
        if (viewHp != null) {
            C786410Ut5.I7(new AbS695S0100000_14(this, 9), viewHp);
        }
        C786410Ut5.I7(new AbS695S0100000_14(this, 10), getContentView());
    }

    public void Ip() {
        ViewStub viewStub = (ViewStub) getContentView().findViewById(R.id.a5t);
        if (viewStub != null) {
            View viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
            C19727912Gn c19727912Gn = viewLJLLLL instanceof C19727912Gn ? (C19727912Gn) viewLJLLLL : null;
            this.LLJLL = c19727912Gn;
            if (c19727912Gn != null) {
                C426750GoL.LJIIIZ(c19727912Gn, 0, 0, 0, 0, false, 16);
            }
        }
        C0ZPM c0zpm = (C0ZPM) this.LLJLIL.getValue();
        if (c0zpm != null) {
            C19727912Gn c19727912Gn2 = this.LLJLL;
            C0ZPP c0zpp = c0zpm.LIZIZ;
            if (c0zpp != null) {
                if (c0zpp.LIZ) {
                    if (c19727912Gn2 == null) {
                        c0zpp.LIZJ = null;
                    } else {
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19727912Gn2);
                        c19727912Gn2.setAlpha(0.0f);
                    }
                    c0zpp.LIZIZ = c19727912Gn2;
                } else {
                    c0zpp.LIZIZ = c19727912Gn2;
                }
            }
        }
        C0ZPM c0zpm2 = (C0ZPM) this.LLJLIL.getValue();
        if (c0zpm2 != null) {
            c0zpm2.LIZIZ(Ap().getState().LLILLL.LIZ);
        }
    }

    public final void Up() {
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            C01GW<C0Z6T> c01gw = GroupTitleBarViewModel.LLJILLL;
            C0ZPK.LIZIZ(c19egLIZ, "name", C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(zp()), (C913140Zs0) this.LLJJIII.getValue());
            getOwnLifecycleOwner();
            String strZp = zp();
            EnumC1910440zoY enumC1910440zoY = EnumC1910440zoY.CHAT_ROOM;
            String value = enumC1910440zoY.getValue();
            Boolean boolJp = Jp();
            boolean zBooleanValue = boolJp != null ? boolJp.booleanValue() : false;
            InterfaceC897380ZIi.LIZIZ.getClass();
            C0ZE8 c0ze8LJIIJJI = C897370ZIh.LIZ().LJIIJJI();
            C0ZE7 c0ze7 = new C0ZE7(this);
            c0ze7.LJIIIZ = strZp;
            c0ze7.LIZIZ(enumC1910440zoY);
            c0ze7.LIZLLL = value;
            c0ze7.LJII = Boolean.valueOf(zBooleanValue);
            c0ze7.LJFF = "group_setting";
            c0ze8LJIIJJI.LIZ(c0ze7, false, C0I0B.LJFF.LIZIZ());
        }
    }

    public View hp() {
        return tp();
    }

    public void init() {
        Ep();
        Bp();
        Fp();
        Gp();
        mp();
    }

    public ImageView kp() {
        return sp();
    }

    public void op() {
        FrameLayout frameLayoutTp = tp();
        ViewGroup.LayoutParams layoutParams = frameLayoutTp.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        C01GW c01gw = C899360ZPy.LIZ;
        marginLayoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
        marginLayoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
        C786410Ut5.W5(frameLayoutTp, marginLayoutParams);
        C417390GYf c417390GYfSp = sp();
        if (c417390GYfSp != null) {
            ViewGroup.LayoutParams layoutParams2 = c417390GYfSp.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams2;
            layoutParams3.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
            layoutParams3.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
            C786410Ut5.W5(c417390GYfSp, layoutParams3);
        }
    }

    public void ip() {
        C01GW c01gw = C899360ZPy.LIZ;
    }

    public void Qp(View view) {
        if ((view instanceof ViewGroup) && view != null) {
            C786410Ut5.Sd(R.layout.cq9, C786410Ut5.ne(view.getContext()), (ViewGroup) view.findViewById(R.id.bi2));
        }
    }

    public final void Wp(EnumC899300ZPs enumC899300ZPs) {
        boolean z = !enumC899300ZPs.isLoadingOrPreview();
        ((View) this.LLJJL.getValue()).setEnabled(z);
        getContentView().setEnabled(z);
        tp().setEnabled(z);
        int childCount = ((ViewGroup) this.LLJJL.getValue()).getChildCount();
        for (int i = 0; i < childCount; i++) {
            ((ViewGroup) this.LLJJL.getValue()).getChildAt(i).setEnabled(z);
        }
    }

    public void lp(C0ZPJ c0zpj) {
        boolean z = c0zpj.LIZ;
        C894700Z8a c894700Z8a = c0zpj.LIZIZ;
        if (z) {
            C0ZPM c0zpm = (C0ZPM) this.LLJLIL.getValue();
            if (c0zpm != null) {
                c0zpm.LIZIZ(true);
            }
            C19727912Gn c19727912Gn = this.LLJLL;
            if (c19727912Gn != null) {
                c19727912Gn.LIZ(R.attr.zm);
            }
        } else {
            C0ZPM c0zpm2 = (C0ZPM) this.LLJLIL.getValue();
            if (c0zpm2 != null) {
                c0zpm2.LIZIZ(false);
            }
        }
        Vp(c894700Z8a, z);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        super.onViewCreated(view);
        Qp(view);
        op();
        C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS114S0100000_14(this, 40));
    }

    public final void Vp(C894700Z8a c894700Z8a, boolean z) {
        getOwnLifecycleOwner();
        C0ZE7 c0ze7 = new C0ZE7(this);
        EnumC1910440zoY enumC1910440zoY = EnumC1910440zoY.CHAT_ROOM;
        c0ze7.LIZIZ(enumC1910440zoY);
        c0ze7.LIZLLL = enumC1910440zoY.getValue();
        c0ze7.LJIIJ = C888950Yu5.LIZ(c894700Z8a);
        c0ze7.LJIIIZ = zp();
        c0ze7.LJII = Boolean.valueOf(z);
        C897490ZIt.LIZLLL(c0ze7);
    }
}
