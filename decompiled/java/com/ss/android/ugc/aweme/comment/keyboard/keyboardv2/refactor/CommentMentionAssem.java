package com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor;

import X.C01GW;
import X.C1350920lG6;
import X.C1353500lKG;
import X.C1389890mGx;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1637806bA;
import X.C19719912Dl;
import X.C19EG;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C259560AFe;
import X.C316530Cax;
import X.C452230HoL;
import X.C452250HoN;
import X.C452501pT;
import X.C687700QyG;
import X.C724240Sb0;
import X.C726120Se2;
import X.InterfaceC1348870lCn;
import X.InterfaceC20613315lL;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import X.InterfaceC737790Swr;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.CommentKeyboardScope;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS23S0600000_19;
import kotlin.jvm.internal.AwS34S0010000_21;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentMentionAssem extends UIContentAssem implements IKeyboardProtocol, ICommentMentionAssemAbility, InterfaceC20613315lL, InterfaceC737790Swr {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public final CommentMentionAssem LLIZLLLIL = this;
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 133));
    public final C726120Se2 LLJI = new C726120Se2();
    public final C01GW LLJIJIL;
    public InterfaceC1348870lCn LLJILJIL;
    public C1353500lKG LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public int LLJJIJI;
    public String LLJJIJIIJIL;
    public int LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public final C01GW LLJJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CommentMentionAssem.class, "commentContextSource", "getCommentContextSource()Lcom/ss/android/ugc/aweme/comment/model/CommentContextSource;", 0);
        C13LE.LIZ.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public CommentMentionAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(KeyboardVMV2.class);
        this.LLJIJIL = C452501pT.LIZIZ(new AwS23S0600000_19(this, c19719912DlLIZ, C1637806bA.LIZ, new C452230HoL(c19719912DlLIZ), new C452250HoN(), (Function0) null, 30));
        this.LLJILLL = true;
        this.LLJJIJIIJIL = "";
        this.LLJJIJIL = -1;
        this.LLJJJJ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 134));
    }

    @Override // X.InterfaceC20613315lL
    public final void Af() {
    }

    @Override // X.InterfaceC20613315lL
    public final void LLJI() {
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardProtocol
    public final void g20() {
    }

    @Override // X.InterfaceC20613315lL
    public final String getCreationId() {
        return null;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC20613315lL
    public final int lk() {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardProtocol
    public final void p50() {
    }

    @Override // X.InterfaceC20613315lL
    public final void r6(int i) {
    }

    public final CommentContextSource Go() {
        C726120Se2 c726120Se2 = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJJJIL;
        return c726120Se2.LIZ(this);
    }

    public final IKeyboardV2Ability Ho() {
        return (IKeyboardV2Ability) this.LLJJJJ.getValue();
    }

    public final KeyboardVMV2 Jo() {
        return (KeyboardVMV2) this.LLJIJIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.ICommentMentionAssemAbility
    public final boolean f40() {
        InterfaceC1348870lCn interfaceC1348870lCn = this.LLJILJIL;
        return interfaceC1348870lCn != null && interfaceC1348870lCn.Hn();
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.ICommentMentionAssemAbility
    public final boolean tS() {
        InterfaceC1348870lCn interfaceC1348870lCn = this.LLJILJIL;
        return interfaceC1348870lCn != null && interfaceC1348870lCn.Hn();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        this.LLJILJIL = null;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, ICommentMentionAssemAbility.class, null, null);
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.ICommentMentionAssemAbility
    public final void A51(boolean z) {
        this.LLJJJ = false;
        InterfaceC1348870lCn interfaceC1348870lCn = this.LLJILJIL;
        if (interfaceC1348870lCn != null) {
            interfaceC1348870lCn.Ym(z);
        }
        IKeyboardV2Ability iKeyboardV2AbilityHo = Ho();
        if (iKeyboardV2AbilityHo != null) {
            iKeyboardV2AbilityHo.il2();
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.ICommentMentionAssemAbility
    public final void By2(User user) throws Throwable {
        InterfaceC1348870lCn interfaceC1348870lCn = this.LLJILJIL;
        if (interfaceC1348870lCn != null) {
            interfaceC1348870lCn.Sa(user);
        }
        Lo(-1, user, "", true);
        KeyboardVMV2 keyboardVMV2Jo = Jo();
        keyboardVMV2Jo.getClass();
        keyboardVMV2Jo.setState(new AwS34S0010000_21(false, 29));
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.ICommentMentionAssemAbility
    public final void Sa(User user) {
        InterfaceC1348870lCn interfaceC1348870lCn = this.LLJILJIL;
        if (interfaceC1348870lCn != null) {
            interfaceC1348870lCn.Sa(user);
        }
    }

    @Override // X.InterfaceC737790Swr
    public final void be(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{CommentKeyboardScope.class}).unbindAbility(this.LLIZLLLIL, ICommentMentionAssemAbility.class);
    }

    @Override // X.InterfaceC20613315lL
    public final void ld(int i) {
        InterfaceC1348870lCn interfaceC1348870lCn;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    this.LLJJJ = true;
                    InterfaceC1348870lCn interfaceC1348870lCn2 = this.LLJILJIL;
                    if (interfaceC1348870lCn2 != null) {
                        interfaceC1348870lCn2.Ym(true);
                    }
                    IKeyboardV2Ability iKeyboardV2AbilityHo = Ho();
                    if (iKeyboardV2AbilityHo != null) {
                        iKeyboardV2AbilityHo.il2();
                    }
                }
            } else {
                InterfaceC1348870lCn interfaceC1348870lCn3 = this.LLJILJIL;
                if (interfaceC1348870lCn3 != null) {
                    interfaceC1348870lCn3.Ym(true);
                }
                IKeyboardV2Ability iKeyboardV2AbilityHo2 = Ho();
                if (iKeyboardV2AbilityHo2 != null) {
                    iKeyboardV2AbilityHo2.il2();
                }
            }
        } else if (!tS() && ((Number) C259560AFe.LIZ.getValue()).intValue() != 0 && (interfaceC1348870lCn = this.LLJILJIL) != null) {
            interfaceC1348870lCn.Sg();
        }
        HandlerHook.viewPost(LJJIJL(), new Runnable() { // from class: X.0HgR
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("CommentMentionAssem@5627.onRefreshEnd$1");
                try {
                    C2211751BhN.LJ(C2211751BhN.LJIIIZ(), false);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("CommentMentionAssem@5627.onRefreshEnd$1");
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x011e  */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r17) {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.CommentMentionAssem.onViewCreated(android.view.View):void");
    }

    @Override // X.InterfaceC737790Swr
    public final void pQ(InterfaceC665370Q7z interfaceC665370Q7z) {
        C687700QyG.LIZIZ(interfaceC665370Q7z, new Class[]{CommentKeyboardScope.class}).bindAbility(this.LLIZLLLIL, ICommentMentionAssemAbility.class);
    }

    @Override // X.InterfaceC20613315lL
    public final void qj(User user) {
        C1353500lKG c1353500lKG = this.LLJILJILJ;
        if (c1353500lKG != null) {
            c1353500lKG.LJIIJJI(user.getUid());
        }
        KeyboardVMV2 keyboardVMV2Jo = Jo();
        keyboardVMV2Jo.getClass();
        keyboardVMV2Jo.setState(new AwS34S0010000_21(false, 29));
    }

    @Override // X.InterfaceC20613315lL
    public final void g1(String str, boolean z) {
        C19EG c19egLIZ;
        if (z && (c19egLIZ = C724240Sb0.LIZ(this)) != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZ);
            c1389890mGx.LJIIJ(str);
            c1389890mGx.LJIIJJI();
        }
    }

    @Override // X.InterfaceC20613315lL
    public final void Wj(String str, C316530Cax c316530Cax, String str2) {
        String str3;
        CommentCommonModel commonModel;
        C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
        String str4 = c316530Cax.LIZ;
        String str5 = "";
        if (str4 == null) {
            str4 = "";
        }
        String str6 = c316530Cax.LIZIZ;
        if (str6 != null) {
            str5 = str6;
        }
        CommentContextSource commentContextSourceGo = Go();
        String str7 = c316530Cax.LIZJ;
        c1350920lG6.getClass();
        if (commentContextSourceGo != null && (commonModel = commentContextSourceGo.getCommonModel()) != null) {
            str3 = commonModel.enterFrom;
        } else {
            str3 = null;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str3);
        c2344009Gk.LJIIIIZZ("enter_method", "comment_mention");
        c2344009Gk.LJIIIIZZ("search_keyword", str2);
        c2344009Gk.LJIIIIZZ("conversation_id", str);
        c2344009Gk.LJIIIIZZ("chat_type", str4);
        c2344009Gk.LJIIIIZZ("group_type", str5);
        c2344009Gk.LJIIIIZZ("group_owner_account_type", str7);
        C1350920lG6.LJJJ(c2344009Gk, "ttsocial_mention_group_show");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x007d, code lost:
    
        if (X.C1351950lHl.LJIIJJI(r1, r9) == true) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007f, code lost:
    
        r0 = X.C946803n0.LIZ(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
    
        if (r0 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0085, code lost:
    
        r1 = new X.C1389890mGx(r0);
        r1.LJIIIZ(2131828516);
        r1.LJIIJJI();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0093, code lost:
    
        r1 = r17.LLJILJIL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0095, code lost:
    
        if (r1 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0097, code lost:
    
        r1.f4(r19.getUid());
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c4, code lost:
    
        if ((r1.length() + r9.length()) > X.C1347610lAl.LIZ().maxInputLimit) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Lo(int r18, com.ss.android.ugc.aweme.profile.model.User r19, java.lang.String r20, boolean r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.CommentMentionAssem.Lo(int, com.ss.android.ugc.aweme.profile.model.User, java.lang.String, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00c3  */
    @Override // X.InterfaceC20613315lL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M8(java.lang.String r9, java.lang.String r10, X.C316530Cax r11, java.lang.String r12) {
        /*
            r8 = this;
            X.0lCn r1 = r8.LLJILJIL
            if (r1 == 0) goto L8
            r0 = 1
            r1.Ym(r0)
        L8:
            com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardV2Ability r0 = r8.Ho()
            if (r0 == 0) goto L11
            r0.il2()
        L11:
            X.0lKG r2 = r8.LLJILJILJ
            r5 = 0
            java.lang.String r4 = ""
            if (r2 == 0) goto L53
            X.0WZX r1 = new X.0WZX
            java.lang.String r0 = "dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaKbbdaD49xe/0lWmck1vanN0SfY25hH5gUcEME/B/iQQ75hZhZaVW1D8XkvfSCWGm"
            r1.<init>(r0, r5)
            android.text.Editable r7 = X.C2204961BRm.LLLZZIL(r2, r1)
            if (r7 == 0) goto L53
            int r6 = r2.getSelectionStart()
            X.0I1T r0 = X.C0I1T.LIZ
            r0.getClass()
            r0 = 0
            java.lang.String r0 = X.C0I1T.LIZJ(r6, r7, r0)
            if (r0 != 0) goto L36
            r0 = r4
        L36:
            int r0 = r0.length()
            int r3 = r6 - r0
            if (r3 < 0) goto L53
            int r0 = r7.length()
            if (r3 > r0) goto L53
            if (r3 <= 0) goto Lc3
            int r2 = r3 + (-1)
            char r1 = r7.charAt(r2)
            r0 = 64
            if (r1 != r0) goto Lc3
            r7.delete(r2, r6)
        L53:
            java.lang.Long r0 = X.C2095008Iq.LJIILIIL(r9)
            if (r0 == 0) goto Lc0
            long r0 = r0.longValue()
            X.01GW r2 = r8.LLJ
            java.lang.Object r3 = r2.getValue()
            com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.groupchat.ICommentGroupChatAssemAbility r3 = (com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.groupchat.ICommentGroupChatAssemAbility) r3
            if (r3 == 0) goto L6c
            X.0iTo r2 = X.EnumC1244100iTo.CLICK_COMMENT_PANEL_MENTION_AND_SELECT_GROUP
            r3.jY(r10, r0, r2)
        L6c:
            X.0lG6 r1 = X.C1350920lG6.LIZ
            if (r11 == 0) goto L74
            java.lang.String r6 = r11.LIZ
            if (r6 != 0) goto L75
        L74:
            r6 = r4
        L75:
            if (r11 == 0) goto L7c
            java.lang.String r0 = r11.LIZIZ
            if (r0 == 0) goto L7c
            r4 = r0
        L7c:
            com.ss.android.ugc.aweme.comment.model.CommentContextSource r0 = r8.Go()
            if (r11 == 0) goto Lc1
            java.lang.String r3 = r11.LIZJ
        L84:
            r1.getClass()
            if (r0 == 0) goto L91
            com.ss.android.ugc.aweme.comment.model.CommentCommonModel r0 = r0.getCommonModel()
            if (r0 == 0) goto L91
            java.lang.String r5 = r0.enterFrom
        L91:
            X.09Gk r2 = new X.09Gk
            r2.<init>()
            java.lang.String r0 = "enter_from"
            r2.LJIIIIZZ(r0, r5)
            java.lang.String r1 = "enter_method"
            java.lang.String r0 = "comment_mention"
            r2.LJIIIIZZ(r1, r0)
            java.lang.String r0 = "search_keyword"
            r2.LJIIIIZZ(r0, r12)
            java.lang.String r0 = "conversation_id"
            r2.LJIIIIZZ(r0, r9)
            java.lang.String r0 = "chat_type"
            r2.LJIIIIZZ(r0, r6)
            java.lang.String r0 = "group_type"
            r2.LJIIIIZZ(r0, r4)
            java.lang.String r0 = "group_owner_account_type"
            r2.LJIIIIZZ(r0, r3)
            java.lang.String r0 = "ttsocial_mention_group_click"
            X.C1350920lG6.LJJJ(r2, r0)
        Lc0:
            return
        Lc1:
            r3 = r5
            goto L84
        Lc3:
            r7.delete(r3, r6)
            goto L53
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.CommentMentionAssem.M8(java.lang.String, java.lang.String, X.0Cax, java.lang.String):void");
    }

    @Override // X.InterfaceC20613315lL
    public final void Mi(User user, boolean z, String str, String str2, int i) throws Throwable {
        if (z) {
            InterfaceC1348870lCn interfaceC1348870lCn = this.LLJILJIL;
            if (interfaceC1348870lCn != null) {
                interfaceC1348870lCn.Ym(true);
            }
            IKeyboardV2Ability iKeyboardV2AbilityHo = Ho();
            if (iKeyboardV2AbilityHo != null) {
                iKeyboardV2AbilityHo.il2();
            }
        }
        Lo(i, user, str, false);
        KeyboardVMV2 keyboardVMV2Jo = Jo();
        keyboardVMV2Jo.getClass();
        keyboardVMV2Jo.setState(new AwS34S0010000_21(false, 29));
    }
}
