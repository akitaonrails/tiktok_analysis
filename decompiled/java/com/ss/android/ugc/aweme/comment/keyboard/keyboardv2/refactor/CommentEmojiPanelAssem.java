package com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor;

import X.C01GW;
import X.C1345700l7g;
import X.C1346550l93;
import X.C1349270lDR;
import X.C1351950lHl;
import X.C1353500lKG;
import X.C1353700lKa;
import X.C13LE;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1697810uHb;
import X.C2217381BqS;
import X.C295780Bia;
import X.C295880Bik;
import X.C449530Hjz;
import X.C449560Hk2;
import X.C726120Se2;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC460010I2d;
import X.InterfaceC494301wD;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.comment.multipanel.EmojiInputViewImplV2;
import com.ss.android.ugc.aweme.emoji.model.Emoji;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentEmojiPanelAssem extends UISlotAssem implements InterfaceC460010I2d, IKeyboardCommentEmojiAssemAbility, IKeyboardProtocol, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public C449530Hjz LLJJI;
    public final C726120Se2 LLJJIII = new C726120Se2();
    public EmojiInputViewImplV2 LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CommentEmojiPanelAssem.class, "commentContextSource", "getCommentContextSource()Lcom/ss/android/ugc/aweme/comment/model/CommentContextSource;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fs2;
    }

    @Override // X.InterfaceC460010I2d
    public final void E0() {
    }

    @Override // X.InterfaceC460010I2d
    public final void Qu(Emoji emoji) {
    }

    @Override // X.InterfaceC460010I2d
    public final boolean RF() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardProtocol
    public final void g20() {
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC460010I2d
    public final void onEmojiClick(String str, int i, int i2) {
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1395943517) {
            return null;
        }
        return this;
    }

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardProtocol
    public final void p50() {
        EmojiInputViewImplV2 emojiInputViewImplV2 = this.LLJJIJI;
        if (emojiInputViewImplV2 != null) {
            emojiInputViewImplV2.LLILLJJLI = C1353700lKa.LIZIZ();
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
        C1554610qYd.LIZJ(C1558520qew.LJIIL(this), IKeyboardProtocol.class, C1697810uHb.LJIILJJIL(this));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem, com.bytedance.assem.arch.core.UIAssem
    public final void xo() {
        C1353500lKG c1353500lKGZy1;
        View view;
        ViewGroup viewGroup;
        int iLIZ;
        IKeyboardEditAbility iKeyboardEditAbilityLIZIZ = C1346550l93.LIZIZ(C1558520qew.LJIIL(this));
        if (iKeyboardEditAbilityLIZIZ != null && (c1353500lKGZy1 = iKeyboardEditAbilityLIZIZ.Zy1()) != null && (view = getSupervisor().LLJJIII) != null && (viewGroup = (ViewGroup) view.findViewById(this.LLIZ)) != null) {
            EmojiInputViewImplV2 emojiInputViewImplV2 = new EmojiInputViewImplV2(c1353500lKGZy1, C1353700lKa.LIZIZ(), this);
            this.LLJJIJI = emojiInputViewImplV2;
            C726120Se2 c726120Se2 = this.LLJJIII;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
            if (C1345700l7g.LJIIIIZZ(c726120Se2.LIZ(this))) {
                iLIZ = C1349270lDR.LJI;
                if (iLIZ <= 0) {
                    iLIZ = C1349270lDR.LIZJ(true);
                }
            } else {
                iLIZ = C1349270lDR.LIZ();
            }
            C449530Hjz c449530HjzLIZ = C449560Hk2.LIZ(emojiInputViewImplV2, viewGroup, this, iLIZ);
            this.LLJJI = c449530HjzLIZ;
            View view2 = c449530HjzLIZ.LL;
            if (view2 != null) {
                Zo(view2);
            }
        }
        super.xo();
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

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardCommentEmojiAssemAbility
    public final void iq2(int i) {
        C449530Hjz c449530Hjz = this.LLJJI;
        if (c449530Hjz != null && i > 0) {
            C1351950lHl.LJIJI(i, c449530Hjz.LL);
        }
    }
}
