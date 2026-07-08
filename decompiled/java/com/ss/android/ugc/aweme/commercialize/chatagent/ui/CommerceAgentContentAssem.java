package com.ss.android.ugc.aweme.commercialize.chatagent.ui;

import X.AbstractC329610Cw3;
import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0Q4Y;
import X.C13LE;
import X.C1558520qew;
import X.C15E1;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C20600815jK;
import X.C2217381BqS;
import X.C321610Cj9;
import X.C336540DHg;
import X.C336550DHh;
import X.C346580DiK;
import X.C452501pT;
import X.C481090Itn;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C844470XAv;
import X.EnumC322640Cko;
import X.InterfaceC1467705op;
import X.InterfaceC1554640qYg;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import X.ViewOnLayoutChangeListenerC336530DHf;
import Y.AsS31S0100000_4;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.commercialize.chatagent.arch.protocol.ICommerceAgentCardProtocol;
import com.ss.android.ugc.aweme.commercialize.chatagent.botpage.cards.p004default.CommerceAgentDefaultAnswerCell;
import com.ss.android.ugc.aweme.commercialize.chatagent.botpage.cards.p004default.CommerceAgentDefaultSendCell;
import com.ss.android.ugc.aweme.commercialize.chatagent.botpage.cards.sug.CommerceAgentSugDataVM;
import com.ss.android.ugc.aweme.commercialize.chatagent.botpage.vm.MessageViewModel;
import com.ss.android.ugc.aweme.commercialize.chatagent.vm.CommerceAgentFragmentViewModel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AwS405S0200000_4;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.AwS618S0100000_4;

/* JADX INFO: loaded from: classes5.dex */
public final class CommerceAgentContentAssem extends UISlotAssem implements CommerceAgentChatUIAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLF;
    public final AssemVMLazy LLJJI;
    public final AssemVMLazy LLJJIII;
    public final AssemVMLazy LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public ViewOnAttachStateChangeListenerC20604515jv LLJJIJIL;
    public C481090Itn LLJJJ;
    public View LLJJJIL;
    public final boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public List<? extends InterfaceC1467705op> LLJJJJLIIL;
    public String LLJJL;
    public final CommerceAgentContentAssem$layoutManager$1 LLJJLIIIJLLLLLLLZ;
    public final ViewOnLayoutChangeListenerC336530DHf LLJL;
    public final C15E1 LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public List<InterfaceC1891350zJl> LLJLLIL;
    public View LLJLLL;
    public boolean LLJZ;
    public boolean LLJZIJLIL;
    public boolean LLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CommerceAgentContentAssem.class, "messageModel", "getMessageModel()Lcom/ss/android/ugc/aweme/commercialize/chatagent/botpage/vm/MessageViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(CommerceAgentContentAssem.class, "fragmentVM", "getFragmentVM()Lcom/ss/android/ugc/aweme/commercialize/chatagent/vm/CommerceAgentFragmentViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(CommerceAgentContentAssem.class, "sugVM", "getSugVM()Lcom/ss/android/ugc/aweme/commercialize/chatagent/botpage/cards/sug/CommerceAgentSugDataVM;", 0);
        c09r3.getClass();
        LLLF = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [com.ss.android.ugc.aweme.commercialize.chatagent.ui.CommerceAgentContentAssem$layoutManager$1] */
    public CommerceAgentContentAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MessageViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS548S0100000_4(c19719912DlLIZ, 72), AFwS232S0000000_4.get$arr$(23), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(CommerceAgentFragmentViewModel.class);
        this.LLJJIII = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS548S0100000_4(c19719912DlLIZ2, 73), AFwS232S0000000_4.get$arr$(24), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(CommerceAgentSugDataVM.class);
        this.LLJJIJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS548S0100000_4(c19719912DlLIZ3, 74), AFwS232S0000000_4.get$arr$(25), null, true);
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS548S0100000_4(this, 71));
        this.LLJJJJ = true;
        C844470XAv.LIZ.getClass();
        final Context contextLIZ = C844470XAv.LIZ();
        this.LLJJLIIIJLLLLLLLZ = new CommerceAgentLinearLayoutManager(contextLIZ) { // from class: com.ss.android.ugc.aweme.commercialize.chatagent.ui.CommerceAgentContentAssem$layoutManager$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public final boolean canScrollVertically() {
                return this.LL.LLJJJJ;
            }
        };
        this.LLJL = new ViewOnLayoutChangeListenerC336530DHf();
        this.LLJLIL = new C15E1();
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS548S0100000_4(this, 70));
        this.LLJLL = C452501pT.LIZIZ(new AwS548S0100000_4(this, 69));
        this.LLL = true;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.ajr;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1044828709) {
            return null;
        }
        return this;
    }

    public final MessageViewModel hp() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLF;
        return (MessageViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJIJIL;
        if (viewOnAttachStateChangeListenerC20604515jv != null) {
            ViewOnLayoutChangeListenerC336530DHf viewOnLayoutChangeListenerC336530DHf = this.LLJL;
            viewOnLayoutChangeListenerC336530DHf.LL = null;
            viewOnAttachStateChangeListenerC20604515jv.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC336530DHf);
        }
        super.onDestroy();
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        C1558520qew.LIZLLL(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        View viewTd;
        C336550DHh c336550DHhLIZ;
        C20600815jK<InterfaceC1891350zJl> state;
        this.LLJJIJIL = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.efm);
        this.LLJJJ = (C481090Itn) view.findViewById(R.id.efp);
        this.LLJJJIL = view.findViewById(R.id.efo);
        this.LLJLLL = view.findViewById(R.id.efu);
        List<ICommerceAgentCardProtocol> list = (List) this.LLJLILLLLZIIL.getValue();
        if (list != null) {
            for (ICommerceAgentCardProtocol iCommerceAgentCardProtocol : list) {
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJIJIL;
                if (viewOnAttachStateChangeListenerC20604515jv != null) {
                    viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(iCommerceAgentCardProtocol.T2());
                }
            }
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJJIJIL;
        if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
            viewOnAttachStateChangeListenerC20604515jv2.LJIILJJIL(CommerceAgentDefaultAnswerCell.class);
            viewOnAttachStateChangeListenerC20604515jv2.LJIILJJIL(CommerceAgentDefaultSendCell.class);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLJJIJIL;
        if (viewOnAttachStateChangeListenerC20604515jv3 != null && (state = viewOnAttachStateChangeListenerC20604515jv3.getState()) != null) {
            state.LIZLLL = C0Q4Y.BUFFER;
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv4 = this.LLJJIJIL;
        if (viewOnAttachStateChangeListenerC20604515jv4 != null) {
            viewOnAttachStateChangeListenerC20604515jv4.LJIIL((AbstractC329610Cw3) hp().LLILZLL.getValue());
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv5 = this.LLJJIJIL;
        if (viewOnAttachStateChangeListenerC20604515jv5 != null) {
            viewOnAttachStateChangeListenerC20604515jv5.setLayoutManager(this.LLJJLIIIJLLLLLLLZ);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv6 = this.LLJJIJIL;
        if (viewOnAttachStateChangeListenerC20604515jv6 != null) {
            viewOnAttachStateChangeListenerC20604515jv6.setItemAnimator(this.LLJLIL);
        }
        final ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv7 = this.LLJJIJIL;
        if (viewOnAttachStateChangeListenerC20604515jv7 != null) {
            ViewOnLayoutChangeListenerC336530DHf viewOnLayoutChangeListenerC336530DHf = this.LLJL;
            Fragment fragmentLJI = C724240Sb0.LJI(this);
            viewOnLayoutChangeListenerC336530DHf.getClass();
            viewOnLayoutChangeListenerC336530DHf.LL = new C336550DHh(null, -1, null, viewOnAttachStateChangeListenerC20604515jv7, fragmentLJI, 0, 0, false, new C321610Cj9(EnumC322640Cko.NORMAL, 6), false);
            viewOnLayoutChangeListenerC336530DHf.LIZJ();
            viewOnAttachStateChangeListenerC20604515jv7.addOnLayoutChangeListener(viewOnLayoutChangeListenerC336530DHf);
            ViewOnLayoutChangeListenerC336530DHf viewOnLayoutChangeListenerC336530DHf2 = this.LLJL;
            C336550DHh c336550DHh = viewOnLayoutChangeListenerC336530DHf2.LL;
            if (c336550DHh == null || (viewTd = c336550DHh.LIZ) == null) {
                viewTd = C786410Ut5.Td(C786410Ut5.ne(viewOnAttachStateChangeListenerC20604515jv7.getContext()), R.layout.ajo, viewOnAttachStateChangeListenerC20604515jv7, false);
                C336550DHh c336550DHh2 = viewOnLayoutChangeListenerC336530DHf2.LL;
                if (c336550DHh2 != null) {
                    c336550DHhLIZ = C336550DHh.LIZ(c336550DHh2, viewTd, 0, null, 0, 0, null, 1022);
                } else {
                    c336550DHhLIZ = null;
                }
                viewOnLayoutChangeListenerC336530DHf2.LL = c336550DHhLIZ;
                C336540DHg.LIZ(viewOnLayoutChangeListenerC336530DHf2.LL, viewOnLayoutChangeListenerC336530DHf2.LLILZIL, new AwS583S0100000_4(viewOnLayoutChangeListenerC336530DHf2, 332));
            }
            viewOnAttachStateChangeListenerC20604515jv7.LIZLLL(viewTd);
            new Runnable(viewOnAttachStateChangeListenerC20604515jv7) { // from class: X.01j4
                public final WeakReference<RecyclerView> LL;

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("CommerceAgentMarkDownSelectHelper$CommerceAgentChatAutoScrollTask@b28.run");
                    try {
                        this.LL.get();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("CommerceAgentMarkDownSelectHelper$CommerceAgentChatAutoScrollTask@b28.run");
                }

                {
                    this.LL = new WeakReference<>(viewOnAttachStateChangeListenerC20604515jv7);
                }
            };
            viewOnAttachStateChangeListenerC20604515jv7.addOnScrollListener(new AsS31S0100000_4(this, 2));
            C481090Itn c481090Itn = this.LLJJJ;
            if (c481090Itn != null) {
                c481090Itn.setOnRefreshListener(new AwS405S0200000_4(this, c481090Itn, 11));
            }
        }
        MessageViewModel messageViewModelHp = hp();
        selectSubscribe(messageViewModelHp, new C2217381BqS() { // from class: X.0Cki
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C321700CjI) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0Ckj
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C321700CjI) obj).LLILLL);
            }
        }, new C2217381BqS() { // from class: X.0Ckh
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C321700CjI) obj).LLIZ;
            }
        }, new C2217381BqS() { // from class: X.0Ckf
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C321700CjI) obj).LLIZLLLIL);
            }
        }, C736820SvI.LIZIZ(messageViewModelHp.usedInReusedScene), null, new C346580DiK(this, 2));
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0Ckg
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C321700CjI) obj).LLILZLL);
            }
        }, null, new AwS618S0100000_4(this, 8), 6);
        AssemVMLazy assemVMLazy = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLF;
        AssemViewModel.selectSubscribe$default(assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0DHz
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0DI0) obj).LLILLJJLI;
            }
        }, null, null, null, new AwS583S0100000_4(new AwS583S0100000_4(this, 46), 260), 14, null);
    }
}
