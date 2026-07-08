package com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor;

import X.C041J;
import X.C0SYU;
import X.C0WZX;
import X.C1216310hkz;
import X.C1340780kzk;
import X.C1341800l1O;
import X.C1344030l4z;
import X.C1345700l7g;
import X.C1345760l7m;
import X.C1346810l9T;
import X.C1346920l9e;
import X.C1347720lAw;
import X.C1347740lAy;
import X.C1348710lCX;
import X.C1349280lDS;
import X.C1350920lG6;
import X.C1353500lKG;
import X.C1354660lM8;
import X.C1401770ma7;
import X.C1402120mag;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1697810uHb;
import X.C19EG;
import X.C20642515q3;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C301010Br1;
import X.C523420Kfs;
import X.C724240Sb0;
import X.C736680Sv4;
import X.C736820SvI;
import X.C786410Ut5;
import X.C960203pA;
import X.EnumC1341660l1A;
import X.EnumC1341670l1B;
import X.EnumC1341680l1C;
import X.InterfaceC1215160hj8;
import X.InterfaceC737440SwI;
import Y.ACListenerS155S0100000_21;
import Y.ARunnableS121S0100000_21;
import Y.ATListenerS454S0100000_21;
import android.content.Context;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.api.ICommentPageReusedProtocol;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.BaseFakeInput;
import com.ss.android.ugc.aweme.comment.model.AudioCommentModel;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentContextSourceKt;
import com.ss.android.ugc.aweme.comment.model.CommentImageModel;
import com.ss.android.ugc.aweme.comment.model.CommentInputContent;
import com.ss.android.ugc.aweme.comment.model.CommentKeyboardModel;
import com.ss.android.ugc.aweme.comment.model.CommentStickerStruct;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.comment.services.IAIPhotoCommentService;
import com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.experiment.CommentWithStickerExp;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.offline.tools.debug.gp.IToolsDebugGpService;
import com.zhiliaoapp.musically.R;
import g1c.AjS67S0100000_21;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.AwS635S0100000_21;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes22.dex */
public abstract class BaseFakeInput extends BaseInputAssem {
    public static final /* synthetic */ int LLLII = 0;
    public TuxTextView LLJZ;
    public View LLJZIJLIL;
    public View LLL;
    public InterfaceC737440SwI LLLF;
    public Comment LLLFF;
    public EnumC1341660l1A LLLFFI;
    public C1402120mag LLLFZ;
    public AwS600S0100000_21 LLLI;

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.BaseInputAssem, com.bytedance.assem.arch.view.UISlotAssem
    public int Co() {
        return R.layout.a1m;
    }

    public final void Qp() {
        C1350920lG6.LJJLIIIJJI(CommentContextSourceKt.enterFrom(kp()), CommentContextSourceKt.aweme(kp()), true, sp().HQ2(), false, C1347720lAw.LJIILL(this.LLLFF));
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("shoot_way", "photo_comment");
        CommentContextSource commentContextSourceKp = kp();
        C1347720lAw.LJFF(c2344009Gk, commentContextSourceKp != null ? CommentContextSourceKt.aweme(commentContextSourceKp) : null);
        C20684815ws.LJIILLIIL("click_upload_entrance", c2344009Gk.LIZ);
        Xp(this, EnumC1341680l1C.PHOTO, null, null, null, 14);
    }

    public abstract C1346920l9e Tp(EnumC1341680l1C enumC1341680l1C, CommentStickerStruct commentStickerStruct);

    public void dq() {
        LinearLayout linearLayout = this.LLJJIJIIJIL;
        if (linearLayout != null) {
            HandlerHook.viewPost(linearLayout, new ARunnableS121S0100000_21(this, 27));
        }
    }

    public void Up() {
        Aweme aweme = CommentContextSourceKt.aweme(kp());
        if (aweme == null || !C1354660lM8.LJIIIIZZ(aweme)) {
            Qp();
            return;
        }
        C1350920lG6.LJJLIIIJJI(CommentContextSourceKt.enterFrom(kp()), CommentContextSourceKt.aweme(kp()), true, sp().HQ2(), false, C1347720lAw.LJIIJJI(this.LLLFF));
        IAIPhotoCommentService iAIPhotoCommentService = (IAIPhotoCommentService) PluggableExtentionKt.pluggableSpi$default(IAIPhotoCommentService.class, false, false, false, 14, null);
        if (iAIPhotoCommentService != null) {
            iAIPhotoCommentService.LIZIZ(getContext(), this.LLJJIJIL, new C1216310hkz(CommentContextSourceKt.enterFrom(kp()), CommentContextSourceKt.aweme(kp()), false, this.LLLFF, 4), new InterfaceC1215160hj8() { // from class: X.0l1R
                @Override // X.InterfaceC1215160hj8
                public final void LIZIZ() {
                    this.LIZ.Qp();
                }

                @Override // X.InterfaceC1215160hj8
                public final void LIZ(boolean z) {
                    String strEnterFrom = CommentContextSourceKt.enterFrom(this.LIZ.kp());
                    Aweme aweme2 = CommentContextSourceKt.aweme(this.LIZ.kp());
                    boolean zHQ2 = this.LIZ.sp().HQ2();
                    C1347730lAx c1347730lAxLJIIIIZZ = C1347720lAw.LJIIIIZZ(this.LIZ.LLLFF);
                    c1347730lAxLJIIIIZZ.LJIILL = Integer.valueOf(!z ? 1 : 0);
                    C1350920lG6.LJJLIIIJJI(strEnterFrom, aweme2, true, zHQ2, false, c1347730lAxLJIIIIZZ);
                    if (z) {
                        BaseFakeInput.Xp(this.LIZ, EnumC1341680l1C.CREATE_IMAGE, null, null, null, 14);
                    }
                }
            });
        }
    }

    public final void aq() {
        List<AudioCommentModel> listXQ2;
        Editable editableLLLZZIL;
        Editable editableLLLZZIL2;
        Editable editableLLLZZIL3;
        Editable editableLLLZZIL4;
        Editable editableLLLZZIL5;
        Editable editableLLLZZIL6;
        CommentCommonModel commonModel;
        C1353500lKG c1353500lKG;
        Editable editableLLLZZIL7;
        List<AudioCommentModel> listXQ22;
        Editable editableLLLZZIL8;
        Editable editableLLLZZIL9;
        Editable editableLLLZZIL10;
        Editable editableLLLZZIL11;
        List<CommentImageModel> listCQ2;
        Editable editableLLLZZIL12;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C20642515q3.LJI(2131826734));
        sbLIZ.append(' ');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(C20642515q3.LJI(2131826735));
        sbLIZ2.append(' ');
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(C20642515q3.LJI(2131826733));
        sbLIZ3.append(' ');
        String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
        if (sp().LLJILJIL) {
            C1353500lKG c1353500lKG2 = this.LLJJIJI;
            if (c1353500lKG2 == null || (editableLLLZZIL11 = C2204961BRm.LLLZZIL(c1353500lKG2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaKbbdaD49xe/0lWmck1vanN0SfY25hH5gUcEME/B+h6KN/42rcIAr9Mzo", null))) == null || !a0.LJJLIIIJL(editableLLLZZIL11, strLIZIZ) || !((listCQ2 = sp().CQ2()) == null || listCQ2.isEmpty())) {
                C1353500lKG c1353500lKG3 = this.LLJJIJI;
                if (c1353500lKG3 != null && (editableLLLZZIL9 = C2204961BRm.LLLZZIL(c1353500lKG3, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaKbbdaD49xe/0lWmck1vanN0SfY25hH5gUcEME/B+h6KN/42rcIAr9Mzo", null))) != null && a0.LJJLIIIJL(editableLLLZZIL9, strLIZIZ2) && sp().GQ2() == null) {
                    C1353500lKG c1353500lKG4 = this.LLJJIJI;
                    if (c1353500lKG4 != null && (editableLLLZZIL10 = C2204961BRm.LLLZZIL(c1353500lKG4, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaKbbdaD49xe/0lWmck1vanN0SfY25hH5gUcEME/B+h6KN/42rcIAr9Mzo", null))) != null) {
                        editableLLLZZIL10.replace(0, strLIZIZ2.length(), "");
                    }
                    sp().LLJILJIL = false;
                }
            } else {
                C1353500lKG c1353500lKG5 = this.LLJJIJI;
                if (c1353500lKG5 != null && (editableLLLZZIL12 = C2204961BRm.LLLZZIL(c1353500lKG5, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaKbbdaD49xe/0lWmck1vanN0SfY25hH5gUcEME/B+h6KN/42rcIAr9Mzo", null))) != null) {
                    editableLLLZZIL12.replace(0, strLIZIZ.length(), "");
                }
                sp().LLJILJIL = false;
            }
        }
        if (sp().LLJILJILJ && (c1353500lKG = this.LLJJIJI) != null && (editableLLLZZIL7 = C2204961BRm.LLLZZIL(c1353500lKG, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaKbbdaD49xe/0lWmck1vanN0SfY25hH5gUcEME/B+h6KN/42rcIAr9Mzo", null))) != null && a0.LJJLIIIJL(editableLLLZZIL7, strLIZIZ3) && ((listXQ22 = sp().xQ2()) == null || listXQ22.isEmpty())) {
            C1353500lKG c1353500lKG6 = this.LLJJIJI;
            if (c1353500lKG6 != null && (editableLLLZZIL8 = C2204961BRm.LLLZZIL(c1353500lKG6, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaKbbdaD49xe/0lWmck1vanN0SfY25hH5gUcEME/B+h6KN/42rcIAr9Mzo", null))) != null) {
                editableLLLZZIL8.replace(0, strLIZIZ3.length(), "");
            }
            sp().LLJILJILJ = false;
        }
        if (!sp().LLJILJIL) {
            List<CommentImageModel> listCQ22 = sp().CQ2();
            if (listCQ22 != null && !listCQ22.isEmpty()) {
                CommentContextSource commentContextSourceKp = kp();
                if (!C1347740lAy.LIZ((commentContextSourceKp == null || (commonModel = commentContextSourceKp.getCommonModel()) == null) ? null : commonModel.aweme, false)) {
                    return;
                }
                C1353500lKG c1353500lKG7 = this.LLJJIJI;
                if (c1353500lKG7 != null && (editableLLLZZIL5 = C2204961BRm.LLLZZIL(c1353500lKG7, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaKbbdaD49xe/0lWmck1vanN0SfY25hH5gUcEME/B+h6KN/42rcIAr9Mzo", null))) != null && !a0.LJJLIIIJL(editableLLLZZIL5, strLIZIZ)) {
                    C1353500lKG c1353500lKG8 = this.LLJJIJI;
                    if (c1353500lKG8 != null && (editableLLLZZIL6 = C2204961BRm.LLLZZIL(c1353500lKG8, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaKbbdaD49xe/0lWmck1vanN0SfY25hH5gUcEME/B+h6KN/42rcIAr9Mzo", null))) != null) {
                        editableLLLZZIL6.insert(0, strLIZIZ);
                    }
                    sp().LLJILJIL = true;
                }
            } else if (sp().GQ2() != null) {
                if (!CommentWithStickerExp.LIZIZ()) {
                    return;
                }
                C1353500lKG c1353500lKG9 = this.LLJJIJI;
                if (c1353500lKG9 != null && (editableLLLZZIL3 = C2204961BRm.LLLZZIL(c1353500lKG9, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaKbbdaD49xe/0lWmck1vanN0SfY25hH5gUcEME/B+h6KN/42rcIAr9Mzo", null))) != null && !a0.LJJLIIIJL(editableLLLZZIL3, strLIZIZ2)) {
                    C1353500lKG c1353500lKG10 = this.LLJJIJI;
                    if (c1353500lKG10 != null && (editableLLLZZIL4 = C2204961BRm.LLLZZIL(c1353500lKG10, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaKbbdaD49xe/0lWmck1vanN0SfY25hH5gUcEME/B+h6KN/42rcIAr9Mzo", null))) != null) {
                        editableLLLZZIL4.insert(0, strLIZIZ2);
                    }
                    sp().LLJILJIL = true;
                }
            }
        }
        if (!sp().LLJILJILJ && (listXQ2 = sp().xQ2()) != null && !listXQ2.isEmpty()) {
            if (!C1345700l7g.LJFF(kp())) {
                return;
            }
            C1353500lKG c1353500lKG11 = this.LLJJIJI;
            if (c1353500lKG11 != null && (editableLLLZZIL = C2204961BRm.LLLZZIL(c1353500lKG11, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaKbbdaD49xe/0lWmck1vanN0SfY25hH5gUcEME/B+h6KN/42rcIAr9Mzo", null))) != null && !a0.LJJLIIIJL(editableLLLZZIL, strLIZIZ3)) {
                C1353500lKG c1353500lKG12 = this.LLJJIJI;
                if (c1353500lKG12 != null && (editableLLLZZIL2 = C2204961BRm.LLLZZIL(c1353500lKG12, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaKbbdaD49xe/0lWmck1vanN0SfY25hH5gUcEME/B+h6KN/42rcIAr9Mzo", null))) != null) {
                    editableLLLZZIL2.insert(0, strLIZIZ3);
                }
                sp().LLJILJILJ = true;
            }
        }
        C1353500lKG c1353500lKG13 = this.LLJJIJI;
        if (c1353500lKG13 != null) {
            c1353500lKG13.setSelection(c1353500lKG13.length());
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.BaseInputAssem, com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void onCreate() {
        super.onCreate();
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), ICommentPageReusedProtocol.class, C1697810uHb.LJIILJJIL(this));
        C1558520qew.LJII(C1558520qew.LJIIL(this), this, IKeyboardEditAbility.class, null, null);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void onDestroy() {
        InterfaceC737440SwI interfaceC737440SwI;
        CommentContextSource commentContextSourceKp;
        super.onDestroy();
        if (!C301010Br1.LIZ() && ((commentContextSourceKp = kp()) == null || !commentContextSourceKp.isRefactorTitlePanel())) {
            this.LLLFZ = null;
            this.LLLI = null;
            return;
        }
        C1353500lKG c1353500lKG = this.LLJJIJI;
        if (c1353500lKG != null) {
            c1353500lKG.removeTextChangedListener(this.LLLFZ);
        }
        AwS600S0100000_21 awS600S0100000_21 = this.LLLI;
        if (awS600S0100000_21 != null && (interfaceC737440SwI = this.LLLF) != null) {
            interfaceC737440SwI.Gl(awS600S0100000_21);
        }
        KeyboardVMV2 keyboardVMV2Sp = sp();
        CommentContextSource commentContextSourceKp2 = kp();
        keyboardVMV2Sp.WQ2(commentContextSourceKp2 != null ? CommentContextSourceKt.aweme(commentContextSourceKp2) : null, null, getInputServiceType());
    }

    /* JADX WARN: Removed duplicated region for block: B:95:0x0157  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Vp(com.ss.android.ugc.aweme.comment.model.CommentInputContent r14) {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.BaseFakeInput.Vp(com.ss.android.ugc.aweme.comment.model.CommentInputContent):void");
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.BaseInputAssem, com.ss.android.ugc.aweme.comment.api.ICommentPageReusedProtocol
    public void bT(Aweme aweme) {
        boolean z;
        C1353500lKG c1353500lKG;
        super.bT(aweme);
        if (!this.LLILZ) {
            return;
        }
        C1353500lKG c1353500lKG2 = this.LLJJIJI;
        Editable editableLLLZZIL = null;
        if (c1353500lKG2 != null) {
            editableLLLZZIL = C2204961BRm.LLLZZIL(c1353500lKG2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaKbbdaD49xe/0lWmck1vanN0SfY25hH5gUcEME/B+h6KN/42rcIAr9Mzo", null));
        }
        if (editableLLLZZIL != null && editableLLLZZIL.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z && (c1353500lKG = this.LLJJIJI) != null) {
            c1353500lKG.setText("");
        }
        C1341800l1O c1341800l1O = KeyboardVMV2.LLJJIJIL;
        CommentContextSource commentContextSourceKp = kp();
        c1341800l1O.getClass();
        fq(C1341800l1O.LIZ(commentContextSourceKp, aweme));
        sp().OQ2();
        KeyboardVMV2 keyboardVMV2Sp = sp();
        keyboardVMV2Sp.getClass();
        keyboardVMV2Sp.setState(AFwS259S0000000_21.get$arr$(440));
        keyboardVMV2Sp.LLILZ.LJIIIZ(-1);
        keyboardVMV2Sp.LLJJI = false;
        keyboardVMV2Sp.LLJJ = false;
        keyboardVMV2Sp.LLJJIII = "";
    }

    public void fq(EnumC1341660l1A enumC1341660l1A) {
        int i;
        SpannableStringBuilder spannableStringBuilderLIZLLL;
        if (this.LLLFFI == enumC1341660l1A) {
            return;
        }
        this.LLLFFI = enumC1341660l1A;
        TuxTextView tuxTextView = this.LLJZ;
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 8);
        }
        View view = this.LLJZIJLIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        C1353500lKG c1353500lKG = this.LLJJIJI;
        if (c1353500lKG != null) {
            c1353500lKG.setHint(mp(false));
        }
        LinearLayout linearLayout = this.LLJJIJIIJIL;
        if (linearLayout != null) {
            C786410Ut5.LJZL(8, linearLayout);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("base updateInputViewStatus  ");
        sbLIZ.append(enumC1341660l1A);
        C1344030l4z.LIZJ("CommentInputCheck", C2188811AlT.LIZIZ(sbLIZ));
        int i2 = C1340780kzk.LIZIZ[enumC1341660l1A.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            C1353500lKG c1353500lKG2 = this.LLJJIJI;
                            if (c1353500lKG2 != null) {
                                c1353500lKG2.setEnabled(false);
                            }
                            C1353500lKG c1353500lKG3 = this.LLJJIJI;
                            if (c1353500lKG3 != null) {
                                c1353500lKG3.setClickable(false);
                            }
                            View view2 = this.LLJJJJJIL;
                            if (view2 != null) {
                                view2.setEnabled(false);
                            }
                            View view3 = this.LLJJJJJIL;
                            if (view3 != null) {
                                view3.setClickable(false);
                                return;
                            }
                            return;
                        }
                        C1353500lKG c1353500lKG4 = this.LLJJIJI;
                        if (c1353500lKG4 != null) {
                            c1353500lKG4.setEnabled(true);
                        }
                        C1353500lKG c1353500lKG5 = this.LLJJIJI;
                        if (c1353500lKG5 != null) {
                            c1353500lKG5.setClickable(true);
                        }
                        dq();
                        View view4 = this.LLJJJJJIL;
                        if (view4 != null) {
                            view4.setEnabled(true);
                        }
                        View view5 = this.LLJJJJJIL;
                        if (view5 == null) {
                            return;
                        }
                        view5.setClickable(true);
                        return;
                    }
                    C1353500lKG c1353500lKG6 = this.LLJJIJI;
                    if (c1353500lKG6 != null) {
                        c1353500lKG6.setEnabled(false);
                    }
                    C1353500lKG c1353500lKG7 = this.LLJJIJI;
                    if (c1353500lKG7 != null) {
                        c1353500lKG7.setClickable(false);
                    }
                    View view6 = this.LLJJJJJIL;
                    if (view6 != null) {
                        view6.setEnabled(false);
                    }
                    View view7 = this.LLJJJJJIL;
                    if (view7 == null) {
                        return;
                    }
                    view7.setClickable(false);
                    return;
                }
                Wp(LJJIJL().getContext().getString(2131829170), false);
                return;
            }
            C1353500lKG c1353500lKG8 = this.LLJJIJI;
            if (c1353500lKG8 != null) {
                c1353500lKG8.setEnabled(false);
            }
            C1353500lKG c1353500lKG9 = this.LLJJIJI;
            if (c1353500lKG9 != null) {
                c1353500lKG9.setFocusable(false);
            }
            C1353500lKG c1353500lKG10 = this.LLJJIJI;
            if (c1353500lKG10 != null) {
                c1353500lKG10.setClickable(false);
            }
            LinearLayout linearLayout2 = this.LLJJIJIIJIL;
            if (linearLayout2 != null) {
                C786410Ut5.LJZL(0, linearLayout2);
            }
            LinearLayout linearLayout3 = this.LLJJIJIIJIL;
            if (linearLayout3 != null) {
                linearLayout3.setEnabled(false);
            }
            LinearLayout linearLayout4 = this.LLJJIJIIJIL;
            if (linearLayout4 != null) {
                linearLayout4.setClickable(false);
            }
            View view8 = this.LLJJJJJIL;
            if (view8 != null) {
                view8.setEnabled(false);
            }
            View view9 = this.LLJJJJJIL;
            if (view9 != null) {
                view9.setClickable(false);
            }
            View view10 = this.LLJJJJJIL;
            if (view10 != null) {
                view10.setFocusable(false);
            }
            View view11 = this.LLL;
            if (view11 == null) {
                return;
            }
            C786410Ut5.I7(new View.OnClickListener() { // from class: X.0l97
                @Override // android.view.View.OnClickListener
                public final void onClick(View view12) {
                    ComplianceServiceProvider.LJFF().LIZIZ("bottom_comment_box");
                }
            }, view11);
            return;
        }
        C1348710lCX.LIZ.getClass();
        if (C1348710lCX.LIZ()) {
            Context context = LJJIJL().getContext();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(C1348710lCX.LIZIZ(context));
            sbLIZ2.append(' ');
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            String string = context.getString(2131829026);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(strLIZIZ);
            sbLIZ3.append(string);
            spannableStringBuilderLIZLLL = new SpannableStringBuilder(C2188811AlT.LIZIZ(sbLIZ3));
            C786410Ut5.q2(spannableStringBuilderLIZLLL, new C1401770ma7(context, 2), strLIZIZ.length(), spannableStringBuilderLIZLLL.length(), 18);
            C786410Ut5.q2(spannableStringBuilderLIZLLL, new ForegroundColorSpan(C960203pA.LIZ(R.attr.a1n, context)), strLIZIZ.length(), spannableStringBuilderLIZLLL.length(), 18);
            C786410Ut5.q2(spannableStringBuilderLIZLLL, new StyleSpan(1), strLIZIZ.length(), spannableStringBuilderLIZLLL.length(), 18);
        } else {
            Context context2 = LJJIJL().getContext();
            if (this instanceof DetailBottomFakeInput) {
                i = R.attr.zl;
            } else {
                i = R.attr.a1k;
            }
            spannableStringBuilderLIZLLL = C1349280lDS.LIZLLL(i, context2);
        }
        Wp(spannableStringBuilderLIZLLL, true);
        C20684815ws.LJIILLIIL("tns_ags_float_comment_ban", new C2344009Gk().LIZ);
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.BaseInputAssem, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        boolean z;
        Aweme aweme;
        CommentCommonModel commonModel;
        CommentKeyboardModel keyboardModel;
        super.onViewCreated(view);
        C1346810l9T c1346810l9TLp = lp();
        if (!c1346810l9TLp.LJIJJLI) {
            z = true;
        } else {
            z = false;
        }
        c1346810l9TLp.LJIJJLI = true;
        if (z) {
            c1346810l9TLp.LIZLLL(c1346810l9TLp.LJIJI);
        }
        sp().LL = C1558520qew.LJIIL(this);
        sp().LLILLJJLI = new WeakReference<>(C724240Sb0.LJI(this));
        tp().LLILLJJLI = C1558520qew.LJIIL(this);
        tp().LLILLL = C724240Sb0.LJI(this);
        CommentContextSource commentContextSourceKp = kp();
        if (commentContextSourceKp != null && (keyboardModel = commentContextSourceKp.getKeyboardModel()) != null) {
            keyboardModel.setInputServiceType(getInputServiceType());
        }
        this.LLJZ = (TuxTextView) view.findViewById(R.id.e_q);
        this.LLL = view.findViewById(R.id.awt);
        this.LLJZIJLIL = view.findViewById(R.id.eaj);
        View view2 = this.LLJJJJJIL;
        if (view2 != null) {
            view2.clearFocus();
            view2.setOnTouchListener(new ATListenerS454S0100000_21(view2, 5));
        }
        View view3 = this.LLJJJJJIL;
        if (view3 != null) {
            C786410Ut5.I7(new AjS67S0100000_21(this, 0), view3);
        }
        C1353500lKG c1353500lKG = this.LLJJIJI;
        if (c1353500lKG != null) {
            c1353500lKG.clearFocus();
            c1353500lKG.setOnTouchListener(new ATListenerS454S0100000_21(c1353500lKG, 6));
        }
        C1353500lKG c1353500lKG2 = this.LLJJIJI;
        if (c1353500lKG2 != null) {
            C786410Ut5.I7(new AjS67S0100000_21(this, 1), c1353500lKG2);
        }
        TuxIconView tuxIconView = this.LLJJJIL;
        if (tuxIconView != null) {
            C786410Ut5.I7(new AjS67S0100000_21(this, 2), tuxIconView);
        }
        TuxIconView tuxIconView2 = this.LLJJJJ;
        if (tuxIconView2 != null) {
            C786410Ut5.I7(new AjS67S0100000_21(this, 3), tuxIconView2);
        }
        TuxIconView tuxIconView3 = this.LLJJJ;
        if (tuxIconView3 != null) {
            C786410Ut5.I7(new AjS67S0100000_21(this, 4), tuxIconView3);
        }
        View view4 = this.LLJJLIIIJLLLLLLLZ;
        if (view4 != null) {
            C786410Ut5.I7(new AjS67S0100000_21(this, 5), view4);
        }
        TuxIconView tuxIconView4 = this.LLJJIJIL;
        if (tuxIconView4 != null) {
            C786410Ut5.a9(tuxIconView4, new ACListenerS155S0100000_21(this, 22));
        }
        Aweme aweme2 = null;
        IToolsDebugGpService iToolsDebugGpService = (IToolsDebugGpService) PluggableExtentionKt.pluggableSpi$default(IToolsDebugGpService.class, false, false, false, 14, null);
        if (iToolsDebugGpService != null) {
            iToolsDebugGpService.isOpen();
        }
        C736680Sv4.LJIIIIZZ(this, sp(), new C2217381BqS() { // from class: X.0l99
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1346950l9h) obj).LLJI;
            }
        }, C736820SvI.LIZLLL(), new AwS635S0100000_21(this, 20), 4);
        C736680Sv4.LJIIIIZZ(this, sp(), new C2217381BqS() { // from class: X.0l98
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1346950l9h) obj).LLJL);
            }
        }, C736820SvI.LIZLLL(), new AwS635S0100000_21(this, 21), 4);
        C1402120mag c1402120mag = new C1402120mag(this, 19);
        this.LLLFZ = c1402120mag;
        C1353500lKG c1353500lKG3 = this.LLJJIJI;
        if (c1353500lKG3 != null) {
            c1353500lKG3.addTextChangedListener(c1402120mag);
        }
        C1341800l1O c1341800l1O = KeyboardVMV2.LLJJIJIL;
        CommentContextSource commentContextSourceKp2 = kp();
        CommentContextSource commentContextSourceKp3 = kp();
        Editable editable = null;
        if (commentContextSourceKp3 != null) {
            aweme = CommentContextSourceKt.aweme(commentContextSourceKp3);
        } else {
            aweme = null;
        }
        c1341800l1O.getClass();
        fq(C1341800l1O.LIZ(commentContextSourceKp2, aweme));
        C736680Sv4.LJIIIIZZ(this, sp(), new C2217381BqS() { // from class: X.0l9I
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1346950l9h) obj).LLJJIJI;
            }
        }, C736820SvI.LIZLLL(), new AwS635S0100000_21(this, 201), 4);
        C736680Sv4.LJIIIIZZ(this, tp(), new C2217381BqS() { // from class: X.0l9C
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C722650SWh) obj).LL;
            }
        }, C736820SvI.LIZLLL(), new AwS635S0100000_21(this, 203), 4);
        lp().LJFF();
        lp().LJ();
        CommentContextSource commentContextSourceKp4 = kp();
        if (commentContextSourceKp4 != null && (commonModel = commentContextSourceKp4.getCommonModel()) != null && commonModel.fragmentReCreated) {
            KeyboardVMV2 keyboardVMV2Sp = sp();
            CommentContextSource commentContextSourceKp5 = kp();
            if (commentContextSourceKp5 != null) {
                aweme2 = CommentContextSourceKt.aweme(commentContextSourceKp5);
            }
            CommentInputContent commentInputContentZQ2 = keyboardVMV2Sp.zQ2(aweme2, getInputServiceType());
            if (commentInputContentZQ2 != null) {
                editable = commentInputContentZQ2.text;
            }
            if (C041J.LIZ(editable)) {
                Vp(commentInputContentZQ2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Wp(java.lang.CharSequence r6, boolean r7) {
        /*
            r5 = this;
            android.view.View r0 = r5.LLJZIJLIL
            r1 = 8
            if (r0 == 0) goto L9
            X.C786410Ut5.LJLLLLLL(r1, r0)
        L9:
            if (r7 == 0) goto L22
            X.0lCX r0 = X.C1348710lCX.LIZ
            r0.getClass()
            boolean r0 = X.C1348710lCX.LIZ()
            if (r0 == 0) goto L22
            boolean r0 = r5 instanceof com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.DetailBottomFakeInput
            if (r0 == 0) goto L22
            com.bytedance.tux.input.TuxTextView r0 = r5.LLJZ
            if (r0 == 0) goto L21
            X.C786410Ut5.LLLLZLL(r0, r1)
        L21:
            return
        L22:
            com.bytedance.tux.input.TuxTextView r1 = r5.LLJZ
            if (r1 == 0) goto L21
            android.text.method.LinkMovementMethod r0 = new android.text.method.LinkMovementMethod
            r0.<init>()
            r1.setMovementMethod(r0)
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            boolean r0 = r3 instanceof android.widget.FrameLayout.LayoutParams
            if (r0 == 0) goto Lb5
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
        L38:
            r2 = 0
            if (r7 == 0) goto L9c
            X.0lCX r0 = X.C1348710lCX.LIZ
            r0.getClass()
            boolean r0 = X.C1348710lCX.LIZ()
            if (r0 == 0) goto L9c
            r0 = 3
            r1.setMaxLines(r0)
            r1.setMinHeight(r2)
            r1.setMinimumHeight(r2)
            r0 = 61
            r1.setTuxFont(r0)
            r4 = 12
            if (r3 == 0) goto L87
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            int r0 = X.C0HD5.LIZ(r1, r0)
            r3.setMarginStart(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            int r0 = X.C0HD5.LIZ(r1, r0)
            r3.setMarginEnd(r0)
            r0 = 20
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r0 = X.C0HD5.LIZ(r1, r0)
            r3.topMargin = r0
            r0 = 37
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r0 = X.C0HD5.LIZ(r1, r0)
            r3.bottomMargin = r0
        L87:
            X.C786410Ut5.R6(r1, r3)
            r0 = 17
            r1.setGravity(r0)
        L8f:
            X.C786410Ut5.LLLLZLL(r1, r2)
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L21
            r1.setText(r6)
            return
        L9c:
            if (r3 == 0) goto Lab
            r0 = 16
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r0 = X.C0HD5.LIZ(r1, r0)
            r3.setMarginStart(r0)
        Lab:
            X.C786410Ut5.R6(r1, r3)
            r0 = 8388627(0x800013, float:1.175497E-38)
            r1.setGravity(r0)
            goto L8f
        Lb5:
            r3 = 0
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.BaseFakeInput.Wp(java.lang.CharSequence, boolean):void");
    }

    public static void Xp(BaseFakeInput baseFakeInput, EnumC1341680l1C enumC1341680l1C, String str, String str2, CommentStickerStruct commentStickerStruct, int i) {
        Pair pair;
        Aweme aweme;
        String str3;
        Aweme aweme2;
        CommentCommonModel commonModel;
        CommentCommonModel commonModel2;
        String str4 = str;
        if ((i & 1) != 0) {
            enumC1341680l1C = EnumC1341680l1C.TEXT;
        }
        if ((i & 2) != 0) {
            str4 = "";
        }
        if ((i & 4) != 0) {
            str2 = "";
        }
        InterfaceC737440SwI interfaceC737440SwI = null;
        if ((i & 8) != 0) {
            commentStickerStruct = null;
        }
        baseFakeInput.getClass();
        if (baseFakeInput instanceof CommentPanelFakeInput) {
            ICommentListAssemAbility iCommentListAssemAbilityLIZLLL = C1345760l7m.LIZLLL(C724240Sb0.LJI(baseFakeInput), C1558520qew.LJIIL(baseFakeInput));
            if (iCommentListAssemAbilityLIZLLL != null) {
                iCommentListAssemAbilityLIZLLL.yE1(EnumC1341670l1B.SHOW_KEYBOARD);
            }
        }
        int i2 = C1340780kzk.LIZ[enumC1341680l1C.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            pair = new Pair(0, "");
                        } else {
                            pair = new Pair(4, "click_comment_at");
                        }
                    } else {
                        pair = new Pair(6, "click_comment_photo");
                    }
                } else {
                    pair = new Pair(2, "click_gift");
                }
            } else {
                pair = new Pair(3, "click_comment_emotion");
            }
        } else {
            pair = new Pair(0, "click_type_comment");
        }
        ((Number) pair.getFirst()).intValue();
        String str5 = (String) pair.getSecond();
        C19EG c19egLJIILLIIL = C1345700l7g.LJIILLIIL(baseFakeInput);
        CommentContextSource commentContextSourceKp = baseFakeInput.kp();
        if (commentContextSourceKp != null && (commonModel2 = commentContextSourceKp.getCommonModel()) != null) {
            aweme = commonModel2.aweme;
        } else {
            aweme = null;
        }
        CommentContextSource commentContextSourceKp2 = baseFakeInput.kp();
        if (commentContextSourceKp2 != null && (commonModel = commentContextSourceKp2.getCommonModel()) != null) {
            str3 = commonModel.enterFrom;
        } else {
            str3 = null;
        }
        if (!C0SYU.LIZIZ(c19egLJIILLIIL, aweme, str3, str5, baseFakeInput.kp())) {
            C1346920l9e c1346920l9eTp = baseFakeInput.Tp(enumC1341680l1C, commentStickerStruct);
            if (str2 != null && str2.length() > 0) {
                c1346920l9eTp.setPostMethod(str2);
            }
            CommentService.LIZ.getClass();
            CommentService commentServiceLIZ = C523420Kfs.LIZ();
            C19EG c19egLIZ = C724240Sb0.LIZ(baseFakeInput);
            Fragment fragmentLJI = C724240Sb0.LJI(baseFakeInput);
            CommentContextSource commentContextSourceKp3 = baseFakeInput.kp();
            if (commentContextSourceKp3 != null) {
                aweme2 = CommentContextSourceKt.aweme(commentContextSourceKp3);
            } else {
                aweme2 = null;
            }
            InterfaceC737440SwI interfaceC737440SwILJLJJL = commentServiceLIZ.LJLJJL(c19egLIZ, fragmentLJI, aweme2, baseFakeInput.LLLFF, CommentContextSourceKt.enterFrom(baseFakeInput.kp()), str4, null, c1346920l9eTp, baseFakeInput.kp());
            if (interfaceC737440SwILJLJJL != null) {
                AwS600S0100000_21 awS600S0100000_21 = new AwS600S0100000_21(baseFakeInput, 409);
                interfaceC737440SwILJLJJL.rn(awS600S0100000_21);
                baseFakeInput.LLLI = awS600S0100000_21;
                interfaceC737440SwILJLJJL.hr(AFwS259S0000000_21.get$arr$(446));
                interfaceC737440SwI = interfaceC737440SwILJLJJL;
            }
            baseFakeInput.LLLF = interfaceC737440SwI;
        }
    }
}
