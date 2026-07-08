package com.ss.android.ugc.aweme.tako.otherpage.share.ui;

import X.AbstractC329610Cw3;
import X.C019F;
import X.C01GW;
import X.C07ID;
import X.C09R3;
import X.C0H9Q;
import X.C0Q4Y;
import X.C0R3K;
import X.C13LC;
import X.C13LE;
import X.C14GD;
import X.C1558520qew;
import X.C15EO;
import X.C1637806bA;
import X.C1637906bB;
import X.C1723500ux2;
import X.C1749280vcc;
import X.C1861290yXH;
import X.C1864530ycV;
import X.C1864540ycW;
import X.C19719912Dl;
import X.C20039913b3;
import X.C20600815jK;
import X.C2217371BqR;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C436650HAh;
import X.C452501pT;
import X.C724750Sbp;
import X.C814420VxA;
import X.C844470XAv;
import X.EnumC1863020ya4;
import X.InterfaceC1554640qYg;
import X.InterfaceC1858000yRy;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.RunnableC1843540y4e;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.tako.arch.protocol.ITakoCardProtocol;
import com.ss.android.ugc.aweme.tako.botpage.cards.p010default.TakoDefaultAnswerCell;
import com.ss.android.ugc.aweme.tako.botpage.cards.p010default.TakoDefaultSendCell;
import com.ss.android.ugc.aweme.tako.botpage.components.action.multiple.TakoMultipleSelectVM;
import com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel;
import com.ss.android.ugc.aweme.tako.otherpage.share.vm.TakoShareVM;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.ss.android.ugc.aweme.tako.ui.TakoChatUIAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS606S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class ShareContentAssem extends UISlotAssem implements TakoChatUIAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJL;
    public final AssemVMLazy LLJJI;
    public ViewOnAttachStateChangeListenerC20604515jv LLJJIII;
    public RunnableC1843540y4e LLJJIJI;
    public C1749280vcc LLJJIJIIJIL;
    public final ShareContentAssem$layoutManager$1 LLJJIJIL;
    public final C15EO LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public List<InterfaceC1891350zJl> LLJJJJJIL;
    public List<? extends InterfaceC1858000yRy> LLJJJJLIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ShareContentAssem.class, "takoShareVM", "getTakoShareVM()Lcom/ss/android/ugc/aweme/tako/otherpage/share/vm/TakoShareVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(ShareContentAssem.class, "messageVM", "getMessageVM()Lcom/ss/android/ugc/aweme/tako/botpage/vm/MessageViewModel;", 0);
        c09r3.getClass();
        LLJJL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.aweme.tako.otherpage.share.ui.ShareContentAssem$layoutManager$1] */
    public ShareContentAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoShareVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS568S0100000_24(c19719912DlLIZ, 1357), AFwS269S0000000_27.get$arr$(282), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(MessageViewModel.class);
        C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS568S0100000_24(c19719912DlLIZ2, 1358), AFwS269S0000000_27.get$arr$(283), null, true);
        C844470XAv.LIZ.getClass();
        final Context contextLIZ = C844470XAv.LIZ();
        this.LLJJIJIL = new LinearLayoutManager(contextLIZ) { // from class: com.ss.android.ugc.aweme.tako.otherpage.share.ui.ShareContentAssem$layoutManager$1
        };
        this.LLJJJ = new C15EO(false);
        this.LLJJJIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 905));
        this.LLJJJJ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1356));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fr3;
    }

    @Override // com.ss.android.ugc.aweme.tako.ui.TakoChatUIAbility
    public final C1861290yXH EV0() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.tako.ui.TakoChatUIAbility
    public final boolean Gx1() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.tako.ui.TakoChatUIAbility
    public final boolean Sb0() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.tako.ui.TakoChatUIAbility
    public final String Ts1() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.tako.ui.TakoChatUIAbility
    public final /* bridge */ /* synthetic */ TakoMultipleSelectVM V81() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.tako.ui.TakoChatUIAbility
    public final boolean Ve0() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.tako.ui.TakoChatUIAbility
    public final C436650HAh fm0() {
        return null;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.tako.ui.TakoChatUIAbility
    public final void iS1(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.tako.ui.TakoChatUIAbility
    public final EnumC1863020ya4 jS1() {
        return null;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -2132909044) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.tako.ui.TakoChatUIAbility
    public final String uN0() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.tako.ui.TakoChatUIAbility
    public final void w01(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.tako.ui.TakoChatUIAbility
    public final C0H9Q wN2() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.tako.ui.TakoChatUIAbility
    public final void wS0(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.tako.ui.TakoChatUIAbility
    public final void x4() {
    }

    @Override // com.ss.android.ugc.aweme.tako.ui.TakoChatUIAbility
    public final int FM2() {
        return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(78));
    }

    public final TakoShareVM hp() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJL;
        return (TakoShareVM) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.tako.ui.TakoChatUIAbility
    public final RunnableC1843540y4e PH1() {
        return this.LLJJIJI;
    }

    @Override // com.ss.android.ugc.aweme.tako.ui.TakoChatUIAbility
    public final ViewOnAttachStateChangeListenerC20604515jv cM() {
        return this.LLJJIII;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        C1558520qew.LIZLLL(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        String str;
        C13LC<C14GD> c13lcAP2;
        C14GD c14gd;
        C20600815jK<InterfaceC1891350zJl> state;
        this.LLJJIII = (ViewOnAttachStateChangeListenerC20604515jv) view.findViewById(R.id.x5m);
        this.LLJJIJIIJIL = (C1749280vcc) view.findViewById(R.id.w28);
        List<ITakoCardProtocol> list = (List) this.LLJJJIL.getValue();
        if (list != null) {
            for (ITakoCardProtocol iTakoCardProtocol : list) {
                if (iTakoCardProtocol.qO2() == 1) {
                    C20039913b3.LIZ.getClass();
                    Iterator it2 = ((ArrayList) C20039913b3.LIZJ()).iterator();
                    while (it2.hasNext()) {
                        int iIntValue = ((Number) it2.next()).intValue();
                        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LLJJIII;
                        if (viewOnAttachStateChangeListenerC20604515jv != null) {
                            viewOnAttachStateChangeListenerC20604515jv.LJIJ(new C1723500ux2(iIntValue, iTakoCardProtocol.T2()));
                        }
                    }
                } else if (iTakoCardProtocol.qO2() == 2) {
                    Iterator it3 = ((ArrayList) C0R3K.LIZ()).iterator();
                    while (it3.hasNext()) {
                        int iIntValue2 = ((Number) it3.next()).intValue();
                        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = this.LLJJIII;
                        if (viewOnAttachStateChangeListenerC20604515jv2 != null) {
                            viewOnAttachStateChangeListenerC20604515jv2.LJIJ(new C1723500ux2(iIntValue2, iTakoCardProtocol.T2()));
                        }
                    }
                } else {
                    ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv3 = this.LLJJIII;
                    if (viewOnAttachStateChangeListenerC20604515jv3 != null) {
                        viewOnAttachStateChangeListenerC20604515jv3.LJIILJJIL(iTakoCardProtocol.T2());
                    }
                }
            }
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv4 = this.LLJJIII;
        if (viewOnAttachStateChangeListenerC20604515jv4 != null) {
            viewOnAttachStateChangeListenerC20604515jv4.LJIILJJIL(TakoDefaultAnswerCell.class);
            viewOnAttachStateChangeListenerC20604515jv4.LJIILJJIL(TakoDefaultSendCell.class);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv5 = this.LLJJIII;
        if (viewOnAttachStateChangeListenerC20604515jv5 != null && (state = viewOnAttachStateChangeListenerC20604515jv5.getState()) != null) {
            state.LIZLLL = C0Q4Y.BUFFER;
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv6 = this.LLJJIII;
        if (viewOnAttachStateChangeListenerC20604515jv6 != null) {
            viewOnAttachStateChangeListenerC20604515jv6.setLayoutManager(this.LLJJIJIL);
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv7 = this.LLJJIII;
        if (viewOnAttachStateChangeListenerC20604515jv7 != null) {
            viewOnAttachStateChangeListenerC20604515jv7.setItemAnimator(this.LLJJJ);
        }
        TakoShareVM takoShareVMHp = hp();
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ITakoContextAbility.class, null);
        if (iTakoContextAbility == null || (c13lcAP2 = iTakoContextAbility.aP2()) == null || (c14gd = (C14GD) c13lcAP2.LIZIZ()) == null || (str = c14gd.LLILZ) == null) {
            str = "";
        }
        takoShareVMHp.LLILLL = str;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv8 = this.LLJJIII;
        if (viewOnAttachStateChangeListenerC20604515jv8 != null) {
            viewOnAttachStateChangeListenerC20604515jv8.LJIIL((AbstractC329610Cw3) hp().LLILZ.getValue());
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv9 = this.LLJJIII;
        if (viewOnAttachStateChangeListenerC20604515jv9 != null) {
            if (C07ID.LIZ()) {
                viewOnAttachStateChangeListenerC20604515jv9.addItemDecoration(new C1864530ycV(this, 3));
            } else {
                viewOnAttachStateChangeListenerC20604515jv9.addItemDecoration(new C1864540ycW(2));
            }
            this.LLJJIJI = new RunnableC1843540y4e(viewOnAttachStateChangeListenerC20604515jv9);
        }
        AssemViewModel.asyncSubscribe$default(hp(), new C2217371BqR() { // from class: X.0yXt
            @Override // X.C2217371BqR, X.AbstractC2217331BqN, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1158910gGP) obj).LL;
            }

            @Override // X.C2217371BqR, X.AbstractC2217331BqN
            public final void set(Object obj, Object obj2) {
                ((C1158910gGP) obj).LL = (AbstractC1623806Xk) obj2;
            }
        }, this, null, new AwS606S0100000_27(this, 268), new AwS571S0100000_27(this, 906), new AwS606S0100000_27(this, 269), 4, null);
    }
}
