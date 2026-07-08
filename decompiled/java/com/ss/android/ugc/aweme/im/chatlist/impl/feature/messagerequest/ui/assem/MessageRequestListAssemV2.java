package com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.ui.assem;

import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0VWN;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C23250099c;
import X.C300860Bqm;
import X.C427201lO;
import X.C452501pT;
import X.C723580SZw;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C885630Yoj;
import X.C887750Ys9;
import X.C887960YsU;
import X.C894460Z7c;
import X.C894470Z7d;
import X.C914210Ztj;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.BaseMessageRequestListVM;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.MessageRequestListVM;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.MessageRequestListVMV2;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.MessageRequestPageVM;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS628S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class MessageRequestListAssemV2 extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public final AssemVMLazy LLIZLLLIL;
    public final AssemVMLazy LLJ;
    public final AssemVMLazy LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C1559260qg8 LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MessageRequestListAssemV2.class, "newListVM", "getNewListVM()Lcom/ss/android/ugc/aweme/im/chatlist/impl/feature/messagerequest/vm/MessageRequestListVMV2;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(MessageRequestListAssemV2.class, "listVM", "getListVM()Lcom/ss/android/ugc/aweme/im/chatlist/impl/feature/messagerequest/vm/MessageRequestListVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(MessageRequestListAssemV2.class, "newPageVM", "getNewPageVM()Lcom/ss/android/ugc/aweme/im/chatlist/impl/feature/messagerequest/vm/MessageRequestPageVM;", 0);
        c09r3.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public MessageRequestListAssemV2() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MessageRequestListVMV2.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS558S0100000_14(c19719912DlLIZ, 298), AFwS248S0000000_14.get$arr$(90), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(MessageRequestListVM.class);
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS558S0100000_14(c19719912DlLIZ2, 299), AFwS248S0000000_14.get$arr$(91), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(MessageRequestPageVM.class);
        this.LLJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS558S0100000_14(c19719912DlLIZ3, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL), AFwS248S0000000_14.get$arr$(92), null, true);
        this.LLJIJIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 296));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 295));
        this.LLJILJILJ = new C1559260qg8(new C723580SZw(this, C887750Ys9.class, "message_request_fragment_config"), checkSupervisorPrepared());
        this.LLJILLL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 297));
        this.LLJJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 301));
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final BaseMessageRequestListVM Go() {
        if (C300860Bqm.LIZ()) {
            AssemVMLazy assemVMLazy = this.LLIZLLLIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJI;
            return (BaseMessageRequestListVM) assemVMLazy.getValue();
        }
        AssemVMLazy assemVMLazy2 = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = LLJJI;
        return (BaseMessageRequestListVM) assemVMLazy2.getValue();
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        super.onResume();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        int i;
        super.onViewCreated(view);
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) this.LLJILLL.getValue();
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            viewOnAttachStateChangeListenerC20604515jv.setItemAnimator(null);
            if (C885630Yoj.LIZJ(false)) {
                viewOnAttachStateChangeListenerC20604515jv.LIZJ(new C894470Z7d());
            }
            viewOnAttachStateChangeListenerC20604515jv.LIZJ(new C894460Z7c(viewOnAttachStateChangeListenerC20604515jv.getLayoutManager()));
            C0VWN.LIZ("im_message_request_page_fluency", false).LIZIZ(viewOnAttachStateChangeListenerC20604515jv);
        }
        selectSubscribe(Go(), new C2217381BqS() { // from class: X.0YsA
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C885430YoP) obj).LLILLJJLI;
            }
        }, new C2217381BqS() { // from class: X.0YsE
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C885430YoP) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0YsY
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C885430YoP) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), null, new C914210Ztj(this, 10));
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C427201lO(this, null), 3);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0YoW
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C885430YoP) obj).LLIZ;
            }
        }, C736820SvI.LIZLLL(), new AwS628S0100000_14(this, 119), 4);
        if (C300860Bqm.LIZ()) {
            AssemVMLazy assemVMLazy = this.LLJI;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJI;
            i = 4;
            C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0YsX
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C885570Yod) obj).LLILZIL;
                }
            }, C736820SvI.LIZLLL(), new AwS628S0100000_14(this, 106), 4);
        } else {
            i = 4;
            C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0YoV
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C885430YoP) obj).LLILZLL);
                }
            }, C736820SvI.LIZLLL(), new AwS628S0100000_14(this, 110), 4);
            C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJIJIL.getValue(), new C2217381BqS() { // from class: X.0YsW
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C887820YsG) obj).LLJ;
                }
            }, C736820SvI.LIZLLL(), new AwS628S0100000_14(this, 113), 4);
        }
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0YsZ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C885430YoP) obj).LLILZIL;
            }
        }, C736820SvI.LIZLLL(), new AwS628S0100000_14(this, 115), i);
        Ho(C887960YsU.LIZ, null);
        Go().refreshData();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ho(X.AbstractC887940YsS r12, X.C878960Ydy r13) {
        /*
            Method dump skipped, instruction units count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.ui.assem.MessageRequestListAssemV2.Ho(X.0YsS, X.0Ydy):void");
    }
}
