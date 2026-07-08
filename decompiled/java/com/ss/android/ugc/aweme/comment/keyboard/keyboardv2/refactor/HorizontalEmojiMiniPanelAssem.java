package com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor;

import X.C01GW;
import X.C0I2X;
import X.C0SYU;
import X.C1344030l4z;
import X.C1345700l7g;
import X.C1346550l93;
import X.C1347610lAl;
import X.C1347810lB5;
import X.C1350920lG6;
import X.C1351410lGt;
import X.C1351440lGw;
import X.C1353500lKG;
import X.C1353700lKa;
import X.C13LE;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1637806bA;
import X.C1637906bB;
import X.C1697810uHb;
import X.C19719912Dl;
import X.C19EG;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2279851ELn;
import X.C295780Bia;
import X.C295880Bik;
import X.C452230HoL;
import X.C452250HoN;
import X.C452501pT;
import X.C460000I2c;
import X.C724240Sb0;
import X.C726120Se2;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.EnumC1346360l8k;
import X.EnumC1347820lB6;
import X.InterfaceC1347800lB4;
import X.InterfaceC1351520lH4;
import X.InterfaceC2217461Bqa;
import X.InterfaceC460010I2d;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.comment.experiment.PersonalizedEmojiExperiment;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.comment.model.CommentKeyboardModel;
import com.ss.android.ugc.aweme.comment.quickmention.QuickMentionVM;
import com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol;
import com.ss.android.ugc.aweme.emoji.model.Emoji;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CommentPersonalizedEmoji;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS23S0600000_19;
import kotlin.jvm.internal.AwS635S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public class HorizontalEmojiMiniPanelAssem extends UISlotAssem implements InterfaceC460010I2d, InterfaceC1347800lB4, ICommentPageVisibilityProtocol, IKeyboardProtocol, InterfaceC1351520lH4 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public C1351440lGw LLJJI;
    public final C726120Se2 LLJJIII = new C726120Se2();
    public C1351440lGw LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(HorizontalEmojiMiniPanelAssem.class, "commentContextSource", "getCommentContextSource()Lcom/ss/android/ugc/aweme/comment/model/CommentContextSource;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public HorizontalEmojiMiniPanelAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(KeyboardVMV2.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        C452230HoL c452230HoL = new C452230HoL(c19719912DlLIZ);
        C452250HoN c452250HoN = new C452250HoN();
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS23S0600000_19(this, c19719912DlLIZ, c1637906bB, c452230HoL, c452250HoN, (Function0) null, 36));
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(QuickMentionVM.class);
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS23S0600000_19(this, c19719912DlLIZ2, c1637906bB, new C452230HoL(c19719912DlLIZ2), c452250HoN, (Function0) null, 38));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.a2q;
    }

    @Override // X.InterfaceC460010I2d
    public final void E0() {
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol
    public final void LJLLLLLL() {
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol
    public final void LLFF() {
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol
    public final void P61() {
    }

    @Override // X.InterfaceC460010I2d
    public final void Qu(Emoji emoji) {
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol
    public final void onPagePause() {
    }

    @Override // X.InterfaceC1351520lH4
    public final void gJ() {
        ((QuickMentionVM) this.LLJJIJIL.getValue()).vQ2(EnumC1347820lB6.HIDE);
    }

    public final CommentContextSource hp() {
        C726120Se2 c726120Se2 = this.LLJJIII;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJ;
        return c726120Se2.LIZ(this);
    }

    public final KeyboardVMV2 ip() {
        return (KeyboardVMV2) this.LLJJIJIIJIL.getValue();
    }

    @Override // X.InterfaceC1351520lH4
    public final void ma() {
        ((QuickMentionVM) this.LLJJIJIL.getValue()).vQ2(EnumC1347820lB6.HIDE);
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardProtocol
    public final void p50() {
        C1351440lGw c1351440lGw = this.LLJJIJI;
        if (c1351440lGw != null) {
            int iLIZIZ = C1347610lAl.LIZIZ() ? (int) C1347610lAl.LIZ().maxInputLimit : C1353700lKa.LIZIZ();
            C460000I2c c460000I2c = c1351440lGw.LLILLJJLI;
            if (c460000I2c != null) {
                c460000I2c.LIZ = iLIZIZ;
            }
        }
    }

    @Override // X.InterfaceC1351520lH4
    public final void p9() {
        ((QuickMentionVM) this.LLJJIJIL.getValue()).vQ2(EnumC1347820lB6.SHOW);
    }

    @Override // X.InterfaceC1347800lB4
    public final List<CommentPersonalizedEmoji> pP() {
        C0I2X c0i2x = C0I2X.LIZ;
        CommentContextSource commentContextSourceHp = hp();
        Aweme aweme = commentContextSourceHp != null ? CommentContextSourceKt.aweme(commentContextSourceHp) : null;
        c0i2x.getClass();
        return C0I2X.LIZLLL(aweme);
    }

    @Override // com.ss.android.ugc.aweme.commentv2.commentpage.ICommentPageVisibilityProtocol
    public final void LJJJJZI() {
        mp();
        C1351440lGw c1351440lGw = this.LLJJIJI;
        if (c1351440lGw != null) {
            c1351440lGw.LJIIL(CommentContextSourceKt.aweme(hp()), hp(), true);
        }
    }

    @Override // X.InterfaceC460010I2d
    public final boolean RF() {
        C19EG c19egLJIILLIIL = C1345700l7g.LJIILLIIL(this);
        CommentContextSource commentContextSourceHp = hp();
        Aweme aweme = commentContextSourceHp != null ? CommentContextSourceKt.aweme(commentContextSourceHp) : null;
        CommentContextSource commentContextSourceHp2 = hp();
        return C0SYU.LIZIZ(c19egLJIILLIIL, aweme, commentContextSourceHp2 != null ? CommentContextSourceKt.enterFrom(commentContextSourceHp2) : null, "click_expose_emoji", hp());
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardProtocol
    public final void g20() {
        mp();
        C1351440lGw c1351440lGw = this.LLJJIJI;
        if (c1351440lGw != null) {
            c1351440lGw.LJIIL(CommentContextSourceKt.aweme(hp()), hp(), true);
        }
    }

    public final void mp() {
        if (C2279851ELn.LIZIZ()) {
            if (((C1347810lB5) ((AssemViewModel) this.LLJJIJIL.getValue()).getState()).LL == EnumC1347820lB6.HIDE) {
                C1351440lGw c1351440lGw = this.LLJJIJI;
                if (c1351440lGw != null) {
                    c1351440lGw.LJIILIIL(CommentContextSourceKt.aweme(hp()), null);
                    return;
                }
                return;
            }
            C1351440lGw c1351440lGw2 = this.LLJJIJI;
            if (c1351440lGw2 != null) {
                c1351440lGw2.LJIILIIL(CommentContextSourceKt.aweme(hp()), C1351410lGt.LIZJ(CommentContextSourceKt.aweme(hp())));
            }
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), ICommentPageVisibilityProtocol.class, C1697810uHb.LJIILJJIL(this));
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), IKeyboardProtocol.class, C1697810uHb.LJIILJJIL(this));
    }

    @Override // X.InterfaceC1351520lH4
    public final void tk() {
        User userLIZJ;
        ICommentMentionAssemAbility iCommentMentionAssemAbility;
        Aweme aweme = CommentContextSourceKt.aweme(hp());
        if (aweme == null || (userLIZJ = C1351410lGt.LIZJ(aweme)) == null || (iCommentMentionAssemAbility = (ICommentMentionAssemAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ICommentMentionAssemAbility.class, null)) == null) {
            return;
        }
        iCommentMentionAssemAbility.Sa(userLIZJ);
    }

    @Override // X.InterfaceC1351520lH4
    public final void tt() {
        User userLIZLLL;
        ICommentMentionAssemAbility iCommentMentionAssemAbility;
        Aweme aweme = CommentContextSourceKt.aweme(hp());
        if (aweme == null || (userLIZLLL = C1351410lGt.LIZLLL(aweme)) == null || (iCommentMentionAssemAbility = (ICommentMentionAssemAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ICommentMentionAssemAbility.class, null)) == null) {
            return;
        }
        iCommentMentionAssemAbility.By2(userLIZLLL);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final Context Eo(Context context) {
        C01GW c01gw = C295880Bik.LIZ;
        if (C295880Bik.LIZLLL) {
            C01GW c01gw2 = C295780Bia.LIZ;
            if (C295780Bia.LIZIZ) {
                return LJJIJL().getContext();
            }
        }
        super.Eo(context);
        return context;
    }

    public final void kp(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hidePanel ");
        sbLIZ.append(z);
        C1344030l4z.LIZJ("HorizontalEmojiAssem", C2188811AlT.LIZIZ(sbLIZ));
        C1351440lGw c1351440lGw = this.LLJJIJI;
        if (c1351440lGw != null) {
            c1351440lGw.LJII(z);
        }
    }

    public final void lp(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("showPanel ");
        sbLIZ.append(z);
        C1344030l4z.LIZJ("HorizontalEmojiAssem", C2188811AlT.LIZIZ(sbLIZ));
        C1351440lGw c1351440lGw = this.LLJJIJI;
        if (c1351440lGw != null) {
            c1351440lGw.LJIIJ(z);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        C1353500lKG c1353500lKGZy1;
        int iLIZIZ;
        EnumC1346360l8k inputServiceType;
        CommentKeyboardModel keyboardModel;
        String strEnterFrom;
        C786410Ut5.LJLLLLLL(0, LJJIJL());
        View viewFindViewById = this.LLJJI;
        LifecycleOwner viewLifecycleOwner = null;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            if (viewLJJIJL != null) {
                viewFindViewById = viewLJJIJL.findViewById(R.id.jrb);
            } else {
                viewFindViewById = null;
            }
            this.LLJJI = (C1351440lGw) viewFindViewById;
        }
        this.LLJJIJI = (C1351440lGw) viewFindViewById;
        IKeyboardEditAbility iKeyboardEditAbilityLIZIZ = C1346550l93.LIZIZ(C1558520qew.LJIIL(this));
        if (iKeyboardEditAbilityLIZIZ != null && (c1353500lKGZy1 = iKeyboardEditAbilityLIZIZ.Zy1()) != null) {
            C1351440lGw c1351440lGw = this.LLJJIJI;
            if (c1351440lGw != null) {
                CommentContextSource commentContextSourceHp = hp();
                if (commentContextSourceHp == null || (strEnterFrom = CommentContextSourceKt.enterFrom(commentContextSourceHp)) == null) {
                    strEnterFrom = "";
                }
                c1351440lGw.setMEnterFrom(strEnterFrom);
            }
            C1351440lGw c1351440lGw2 = this.LLJJIJI;
            if (c1351440lGw2 != null) {
                KeyboardVMV2 keyboardVMV2Ip = ip();
                CommentContextSource commentContextSourceHp2 = hp();
                if (commentContextSourceHp2 != null && (keyboardModel = commentContextSourceHp2.getKeyboardModel()) != null) {
                    inputServiceType = keyboardModel.getInputServiceType();
                } else {
                    inputServiceType = null;
                }
                c1351440lGw2.setPublishScenario(keyboardVMV2Ip.EQ2(inputServiceType));
            }
            mp();
            C1351440lGw c1351440lGw3 = this.LLJJIJI;
            if (c1351440lGw3 != null) {
                View viewLJJIJL2 = LJJIJL();
                if (C1347610lAl.LIZIZ()) {
                    iLIZIZ = (int) C1347610lAl.LIZ().maxInputLimit;
                } else {
                    iLIZIZ = C1353700lKa.LIZIZ();
                }
                Fragment fragmentLJI = C724240Sb0.LJI(this);
                if (fragmentLJI != null) {
                    viewLifecycleOwner = fragmentLJI.getViewLifecycleOwner();
                }
                c1351440lGw3.LIZJ(viewLJJIJL2, c1353500lKGZy1, iLIZIZ, this, this, viewLifecycleOwner, this, CommentContextSourceKt.aweme(hp()), this instanceof HorizontalEmojiMiniPanelAssemForKeyboard, hp());
            }
            if (PersonalizedEmojiExperiment.LIZ()) {
                kp(false);
            }
            C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0lAg
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C1346950l9h) obj).LLJJI;
                }
            }, null, new AwS635S0100000_21(this, 27), 6);
            if (C2279851ELn.LIZIZ()) {
                C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJIJIL.getValue(), new C2217381BqS() { // from class: X.0lB0
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((C1347810lB5) obj).LL;
                    }
                }, C736820SvI.LIZLLL(), new AwS635S0100000_21(this, 28), 4);
            }
        }
    }

    @Override // X.InterfaceC460010I2d
    public final void onEmojiClick(String str, int i, int i2) {
        C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
        CommentContextSource commentContextSourceHp = hp();
        c1350920lG6.getClass();
        C1350920lG6.LJLJJL(commentContextSourceHp, str, i, true, i2);
        ip().LLJJI = true;
    }
}
