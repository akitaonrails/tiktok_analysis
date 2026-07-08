package com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor;

import X.C01GW;
import X.C11JF;
import X.C1346550l93;
import X.C1353500lKG;
import X.C13LE;
import X.C1402120mag;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1697810uHb;
import X.C2217381BqS;
import X.C452501pT;
import X.C726120Se2;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentGroupChatPasteAssem extends UIContentAssem implements IKeyboardProtocol {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public C1353500lKG LLJ;
    public int LLJIJIL;
    public int LLJILJIL;
    public C11JF LLJILJILJ;
    public final C726120Se2 LLIZLLLIL = new C726120Se2();
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS565S0100000_21(this, 130));
    public final C1402120mag LLJILLL = new C1402120mag(this, 1);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CommentGroupChatPasteAssem.class, "commentContextSource", "getCommentContextSource()Lcom/ss/android/ugc/aweme/comment/model/CommentContextSource;", 0);
        C13LE.LIZ.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardProtocol
    public final void g20() {
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardProtocol
    public final void p50() {
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C11JF c11jf = this.LLJILJILJ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LLJILJILJ = null;
        C1353500lKG c1353500lKG = this.LLJ;
        if (c1353500lKG != null) {
            c1353500lKG.removeTextChangedListener(this.LLJILLL);
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
        this.LLJ = c1353500lKGZy1;
        if (c1353500lKGZy1 != null) {
            c1353500lKGZy1.addTextChangedListener(this.LLJILLL);
        }
    }
}
