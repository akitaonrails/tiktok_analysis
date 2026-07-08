package com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.groupchat;

import X.C0PEM;
import X.C0WZX;
import X.C1241020iOq;
import X.C1346550l93;
import X.C1350740lFo;
import X.C1350920lG6;
import X.C1353500lKG;
import X.C1353540lKK;
import X.C13LE;
import X.C1554610qYd;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1697810uHb;
import X.C2204961BRm;
import X.C2217381BqS;
import X.C2296808zG;
import X.C23250099c;
import X.C426550Go1;
import X.C724240Sb0;
import X.C726120Se2;
import X.EnumC1241030iOr;
import X.EnumC1244100iTo;
import X.EnumC1348240lBm;
import X.InterfaceC1353620lKS;
import X.InterfaceC2217461Bqa;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardEditAbility;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardProtocol;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.groupchat.CommentGroupChatAssem;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.widgets.CommentGroupChatSpan;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentGroupChatAssem extends UIContentAssem implements IKeyboardProtocol, ICommentGroupChatAssemAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public C1353500lKG LLIZLLLIL;
    public final C726120Se2 LLJ = new C726120Se2();

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CommentGroupChatAssem.class, "commentContextSource", "getCommentContextSource()Lcom/ss/android/ugc/aweme/comment/model/CommentContextSource;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardProtocol
    public final void g20() {
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardProtocol
    public final void p50() {
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        if (C724240Sb0.LJI(this) != null) {
            C1558520qew.LJIIJJI(this, ICommentGroupChatAssemAbility.class, null);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, ICommentGroupChatAssemAbility.class, null, null);
        }
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C1353500lKG c1353500lKGZy1;
        super.onViewCreated(view);
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), IKeyboardProtocol.class, C1697810uHb.LJIILJJIL(this));
        IKeyboardEditAbility iKeyboardEditAbilityLIZIZ = C1346550l93.LIZIZ(C1558520qew.LJIIL(this));
        if (iKeyboardEditAbilityLIZIZ != null) {
            c1353500lKGZy1 = iKeyboardEditAbilityLIZIZ.Zy1();
        } else {
            c1353500lKGZy1 = null;
        }
        this.LLIZLLLIL = c1353500lKGZy1;
        if (c1353500lKGZy1 != null) {
            c1353500lKGZy1.setOnGroupChatOperateListener(new InterfaceC1353620lKS() { // from class: X.0lFn
                @Override // X.InterfaceC1353620lKS
                public final void LIZ(String str, String str2) {
                    C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
                    String value = EnumC1348240lBm.GROUP.getValue();
                    CommentGroupChatAssem commentGroupChatAssem = this.LIZ;
                    C726120Se2 c726120Se2 = commentGroupChatAssem.LLJ;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = CommentGroupChatAssem.LLJI;
                    CommentContextSource commentContextSourceLIZ = c726120Se2.LIZ(commentGroupChatAssem);
                    c1350920lG6.getClass();
                    if (commentContextSourceLIZ != null) {
                        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1241000iOo(commentContextSourceLIZ, value, "delete", str2, str, null), 3);
                    }
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.groupchat.ICommentGroupChatAssemAbility
    public final void jY(String str, long j, EnumC1244100iTo enumC1244100iTo) throws Throwable {
        int iMin;
        boolean z;
        C1350740lFo c1350740lFo;
        C1353500lKG c1353500lKG = this.LLIZLLLIL;
        if (c1353500lKG != null) {
            int selectionStart = c1353500lKG.getSelectionStart();
            Editable editableLLLZZIL = C2204961BRm.LLLZZIL(c1353500lKG, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaNbrAbTQoxKWZkWGIlFrPhITkr1TmevM=", null));
            if (editableLLLZZIL == null) {
                c1350740lFo = new C1350740lFo(EnumC1241030iOr.UNKNOWN, false);
            } else {
                EnumC1241030iOr enumC1241030iOr = EnumC1241030iOr.ADD;
                if (TextUtils.isEmpty(editableLLLZZIL)) {
                    z = true;
                    iMin = 0;
                } else {
                    int length = editableLLLZZIL.length();
                    CommentGroupChatSpan[] commentGroupChatSpanArr = (CommentGroupChatSpan[]) C1353540lKK.LIZJ(editableLLLZZIL, CommentGroupChatSpan.class);
                    if (commentGroupChatSpanArr != null && commentGroupChatSpanArr.length != 0) {
                        CommentGroupChatSpan commentGroupChatSpan = commentGroupChatSpanArr[0];
                        iMin = editableLLLZZIL.getSpanStart(commentGroupChatSpan);
                        c1353500lKG.LLJJIII = true;
                        editableLLLZZIL.delete(editableLLLZZIL.getSpanStart(commentGroupChatSpan), editableLLLZZIL.getSpanEnd(commentGroupChatSpan));
                        enumC1241030iOr = EnumC1241030iOr.REPLACE;
                        z = false;
                    } else {
                        iMin = Math.min(length, Math.max(0, selectionStart));
                        z = true;
                    }
                }
                SpannableString spannableStringLIZ = C426550Go1.LIZ(c1353500lKG.getContext(), str, c1353500lKG.LLIZLLLIL, j, enumC1244100iTo);
                if (iMin > 0 && z) {
                    editableLLLZZIL.insert(iMin, " ");
                    iMin++;
                }
                editableLLLZZIL.insert(iMin, spannableStringLIZ);
                if (z) {
                    int length2 = iMin + spannableStringLIZ.length();
                    int length3 = editableLLLZZIL.length();
                    if (length2 > length3) {
                        length2 = length3;
                    }
                    editableLLLZZIL.insert(length2, " ");
                }
                c1353500lKG.LLJJIII = false;
                c1350740lFo = new C1350740lFo(enumC1241030iOr, true);
            }
            if (c1350740lFo.LIZIZ) {
                C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
                String value = EnumC1348240lBm.GROUP.getValue();
                EnumC1241030iOr enumC1241030iOr2 = c1350740lFo.LIZ;
                String strValueOf = String.valueOf(j);
                C726120Se2 c726120Se2 = this.LLJ;
                InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
                CommentContextSource commentContextSourceLIZ = c726120Se2.LIZ(this);
                c1350920lG6.getClass();
                if (commentContextSourceLIZ != null) {
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1241020iOq(commentContextSourceLIZ, value, enumC1241030iOr2, enumC1244100iTo, strValueOf, null), 3);
                }
            }
        }
    }
}
