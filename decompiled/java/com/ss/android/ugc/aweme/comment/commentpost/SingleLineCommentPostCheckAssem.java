package com.ss.android.ugc.aweme.comment.commentpost;

import X.C01GW;
import X.C0HZQ;
import X.C0P0T;
import X.C1344030l4z;
import X.C1348410lC3;
import X.C1350650lFf;
import X.C13BV;
import X.C13LE;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1637806bA;
import X.C1637906bB;
import X.C1697810uHb;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C452230HoL;
import X.C452250HoN;
import X.C452501pT;
import X.C726120Se2;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.InterfaceC1347800lB4;
import X.InterfaceC1348430lC5;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardProtocol;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.KeyboardVMV2;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.comment.model.CommentKeyboardModel;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentPublishViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CommentPersonalizedEmoji;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS23S0600000_19;
import kotlin.jvm.internal.AwS34S0010000_21;
import kotlin.jvm.internal.AwS635S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public class SingleLineCommentPostCheckAssem extends UIContentAssem implements InterfaceC1347800lB4, ICommentPostCheckAssemVAbility, IKeyboardProtocol, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public final C01GW LLIZLLLIL;
    public boolean LLJ;
    public final C726120Se2 LLJI;
    public final C01GW LLJIJIL;
    public C0P0T LLJILJIL;
    public LinearLayout LLJILJILJ;
    public final C01GW LLJILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SingleLineCommentPostCheckAssem.class, "contextSource", "getContextSource()Lcom/ss/android/ugc/aweme/comment/model/CommentContextSource;", 0);
        C13LE.LIZ.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SingleLineCommentPostCheckAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(KeyboardVMV2.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        C452230HoL c452230HoL = new C452230HoL(c19719912DlLIZ);
        C452250HoN c452250HoN = new C452250HoN();
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS23S0600000_19(this, c19719912DlLIZ, c1637906bB, c452230HoL, c452250HoN, (Function0) null, 12));
        this.LLJI = new C726120Se2();
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(CommentPublishViewModel.class);
        this.LLJIJIL = C452501pT.LIZIZ(new AwS23S0600000_19(this, c19719912DlLIZ2, c1637906bB, new C452230HoL(c19719912DlLIZ2), c452250HoN, (Function0) null, 14));
        this.LLJILLL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(101));
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardProtocol
    public final void g20() {
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1137527149) {
            return null;
        }
        return this;
    }

    public final KeyboardVMV2 Go() {
        return (KeyboardVMV2) this.LLIZLLLIL.getValue();
    }

    public final void Ho() {
        String aid;
        Aweme aweme;
        C1348410lC3 c1348410lC3 = (C1348410lC3) this.LLJILLL.getValue();
        LinearLayout linearLayout = this.LLJILJILJ;
        if (linearLayout == null) {
            linearLayout = null;
        }
        C726120Se2 c726120Se2 = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJ;
        CommentContextSource commentContextSourceLIZ = c726120Se2.LIZ(this);
        if (commentContextSourceLIZ == null || (aweme = CommentContextSourceKt.aweme(commentContextSourceLIZ)) == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        c1348410lC3.LIZ(linearLayout, aid, new InterfaceC1348430lC5() { // from class: X.0lC2
            @Override // X.InterfaceC1348430lC5
            public final void LIZ(boolean z) {
                KeyboardVMV2 keyboardVMV2Go = this.LIZ.Go();
                keyboardVMV2Go.getClass();
                keyboardVMV2Go.setState(new AwS34S0010000_21(z, 27));
            }
        });
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), IKeyboardProtocol.class, C1697810uHb.LJIILJJIL(this));
        C1558520qew.LIZLLL(this);
    }

    @Override // com.bytedance.assem.arch.view.UIContentAssem, com.bytedance.assem.arch.core.UIAssem
    public final void xo() {
        super.xo();
        this.LLJ = true;
        System.out.println((Object) "SingleLineRepostCheckAssem.onCreateView");
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardProtocol
    public final void p50() {
        Ho();
    }

    @Override // X.InterfaceC1347800lB4
    public final List<CommentPersonalizedEmoji> pP() {
        return C13BV.INSTANCE;
    }

    public final void Jo(boolean z) {
        CommentKeyboardModel keyboardModel;
        LinearLayout linearLayout = this.LLJILJILJ;
        if (linearLayout == null) {
            linearLayout = null;
        }
        C0HZQ c0hzq = (C0HZQ) linearLayout.findViewById(R.id.aev);
        if (c0hzq != null) {
            c0hzq.setChecked(z);
        }
        C726120Se2 c726120Se2 = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJ;
        CommentContextSource commentContextSourceLIZ = c726120Se2.LIZ(this);
        if (commentContextSourceLIZ != null && (keyboardModel = commentContextSourceLIZ.getKeyboardModel()) != null) {
            keyboardModel.setCommentPostChecked(z);
        }
        KeyboardVMV2 keyboardVMV2Go = Go();
        keyboardVMV2Go.getClass();
        keyboardVMV2Go.setState(new AwS34S0010000_21(z, 27));
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJILJILJ = (LinearLayout) view.findViewById(R.id.nak);
        Ho();
        C1350650lFf.LIZ.getClass();
        LinearLayout linearLayout = this.LLJILJILJ;
        if (linearLayout == null) {
            linearLayout = null;
        }
        C786410Ut5.LJZL(4, linearLayout);
        C1344030l4z.LIZJ("SingleLineCommentPostCheckAssem", "onViewCreated");
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0lAJ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1346950l9h) obj).LLJJJJJIL);
            }
        }, null, new AwS635S0100000_21(this, 13), 6);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0lAK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1346950l9h) obj).LLJJJJLIIL);
            }
        }, null, new AwS635S0100000_21(this, 14), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJIJIL.getValue(), new C2217381BqS() { // from class: X.0l9G
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C722650SWh) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS635S0100000_21(this, 15), 4);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0l9H
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1346950l9h) obj).LLJL);
            }
        }, C736820SvI.LIZLLL(), new AwS635S0100000_21(this, 16), 4);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0lC1
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1346950l9h) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS635S0100000_21(this, 12), 4);
    }
}
