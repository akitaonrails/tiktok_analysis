package com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.ui.assem;

import X.AbstractC1250290idn;
import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0OM1;
import X.C1250250idj;
import X.C1250300ido;
import X.C1251150ifB;
import X.C1383370m6R;
import X.C13LE;
import X.C13LP;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1637906bB;
import X.C1697810uHb;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C300860Bqm;
import X.C452501pT;
import X.C723580SZw;
import X.C724750Sbp;
import X.C736820SvI;
import X.C885630Yoj;
import X.C887750Ys9;
import X.EnumC638250P1r;
import X.EnumC871430YGn;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.MessageRequestListVMV2;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.MessageRequestNavBarVM;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.MessageRequestPageVM;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.vm.MessageRequestRootPageVM;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS132S0110000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS628S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class MessageRequestNavBarAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 302));
    public final C1559260qg8 LLJ = new C1559260qg8(new C723580SZw(this, C887750Ys9.class, "message_request_fragment_config"), checkSupervisorPrepared());
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS558S0100000_14(this, 303));
    public final AssemVMLazy LLJIJIL;
    public final AssemVMLazy LLJILJIL;
    public final AssemVMLazy LLJILJILJ;
    public final List<String> LLJILLL;
    public boolean LLJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MessageRequestNavBarAssem.class, "newPageVM", "getNewPageVM()Lcom/ss/android/ugc/aweme/im/chatlist/impl/feature/messagerequest/vm/MessageRequestPageVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(MessageRequestNavBarAssem.class, "newListVM", "getNewListVM()Lcom/ss/android/ugc/aweme/im/chatlist/impl/feature/messagerequest/vm/MessageRequestListVMV2;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(MessageRequestNavBarAssem.class, "navBarVM", "getNavBarVM()Lcom/ss/android/ugc/aweme/im/chatlist/impl/feature/messagerequest/vm/MessageRequestNavBarVM;", 0);
        c09r3.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    public MessageRequestNavBarAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MessageRequestPageVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJIJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS558S0100000_14(c19719912DlLIZ, 304), AFwS248S0000000_14.get$arr$(93), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(MessageRequestListVMV2.class);
        this.LLJILJIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS558S0100000_14(c19719912DlLIZ2, 305), AFwS248S0000000_14.get$arr$(94), null, true);
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(MessageRequestNavBarVM.class);
        this.LLJILJILJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS558S0100000_14(c19719912DlLIZ3, 306), AFwS248S0000000_14.get$arr$(95), null, true);
        this.LLJILLL = C1697810uHb.LJIIJJI("tag_right_risky", "tag_right_cancel", "tag_right_option", "tag_right_edit");
    }

    public final TuxNavBar Go() {
        return (TuxNavBar) this.LLIZLLLIL.getValue();
    }

    public final MessageRequestListVMV2 Ho() {
        AssemVMLazy assemVMLazy = this.LLJILJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJI;
        return (MessageRequestListVMV2) assemVMLazy.getValue();
    }

    public final MessageRequestPageVM Jo() {
        AssemVMLazy assemVMLazy = this.LLJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJI;
        return (MessageRequestPageVM) assemVMLazy.getValue();
    }

    public final MessageRequestRootPageVM Lo() {
        return (MessageRequestRootPageVM) this.LLJI.getValue();
    }

    public final void Oo(List<String> list) {
        Iterator it2 = C13LP.LJLLLLLL(this.LLJILLL, C13LP.LLIIJI(list)).iterator();
        while (it2.hasNext()) {
            Go().LJJ(AFwS248S0000000_14.get$arr$(96), it2.next());
        }
        Iterator<String> it3 = list.iterator();
        while (it3.hasNext()) {
            Go().LJJ(AFwS248S0000000_14.get$arr$(97), it3.next());
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        TuxNavBar tuxNavBarGo = Go();
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_chevron_left_ltr;
        c1251150ifB.LIZJ(new AwS558S0100000_14(this, 1741));
        c0om1.LJ(c1251150ifB);
        C1250250idj c1250250idj = new C1250250idj();
        c1250250idj.LIZJ = "";
        c0om1.LIZJ = c1250250idj;
        AbstractC1250290idn[] abstractC1250290idnArr = new AbstractC1250290idn[4];
        C1251150ifB c1251150ifB2 = new C1251150ifB();
        c1251150ifB2.LIZLLL();
        c1251150ifB2.LIZJ = R.raw.icon_bubble_left_eye;
        c1251150ifB2.LIZIZ = "tag_right_risky";
        c1251150ifB2.LIZJ(new AwS558S0100000_14(this, 1742));
        c1251150ifB2.LJI = false;
        abstractC1250290idnArr[0] = c1251150ifB2;
        C1251150ifB c1251150ifB3 = new C1251150ifB();
        c1251150ifB3.LIZIZ = "tag_right_option";
        boolean zLIZJ = C885630Yoj.LIZJ(false);
        if (!zLIZJ && C885630Yoj.LIZIZ()) {
            c1251150ifB3.LIZLLL();
            c1251150ifB3.LIZJ = R.raw.icon_lines_horizontal_decrease_alt;
            c1251150ifB3.LIZJ(new AwS558S0100000_14(this, 1738));
        } else {
            c1251150ifB3.LIZLLL();
            c1251150ifB3.LIZJ = R.raw.icon_ellipsis_horizontal;
            c1251150ifB3.LIZJ(new AwS132S0110000_14(this, zLIZJ, 11));
        }
        abstractC1250290idnArr[1] = c1251150ifB3;
        C1250300ido c1250300ido = new C1250300ido();
        c1250300ido.LIZJ = C1383370m6R.LJIIJ(2131821865);
        c1250300ido.LIZLLL = EnumC638250P1r.SECONDARY;
        c1250300ido.LIZ(new AwS558S0100000_14(this, 1743));
        c1250300ido.LIZIZ = "tag_right_cancel";
        c1250300ido.LJFF = false;
        abstractC1250290idnArr[2] = c1250300ido;
        C1251150ifB c1251150ifB4 = new C1251150ifB();
        c1251150ifB4.LIZLLL();
        c1251150ifB4.LIZJ = R.raw.icon_lines_horizontal_decrease_alt;
        c1251150ifB4.LIZJ(new AwS558S0100000_14(this, 1744));
        c1251150ifB4.LIZIZ = "tag_right_edit";
        c1251150ifB4.LJI = false;
        abstractC1250290idnArr[3] = c1251150ifB4;
        c0om1.LIZIZ(abstractC1250290idnArr);
        c0om1.LIZLLL = false;
        tuxNavBarGo.setNavActions(c0om1);
        if (C300860Bqm.LIZ()) {
            subscribe(Jo(), C736820SvI.LIZLLL(), null, new AwS628S0100000_14(this, 108));
            subscribe(Ho(), C736820SvI.LIZLLL(), null, new AwS628S0100000_14(this, 109));
            AssemVMLazy assemVMLazy = this.LLJILJILJ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJI;
            subscribe(assemVMLazy.getValue(), C736820SvI.LIZLLL(), null, new AwS628S0100000_14(this, 111));
            return;
        }
        subscribe(Lo(), C736820SvI.LIZLLL(), null, new AwS628S0100000_14(this, 112));
    }

    public final boolean No(int i, List<? extends EnumC871430YGn> list) {
        Object objLJJJLZIJ;
        Boolean bool;
        if (!C1697810uHb.LJIIIZ(list).LJLJL(i) || (objLJJJLZIJ = C13LP.LJJJLZIJ(i, list)) == null || (bool = Lo().getState().LLILZLL.get(objLJJJLZIJ)) == null) {
            return true;
        }
        return bool.booleanValue();
    }
}
