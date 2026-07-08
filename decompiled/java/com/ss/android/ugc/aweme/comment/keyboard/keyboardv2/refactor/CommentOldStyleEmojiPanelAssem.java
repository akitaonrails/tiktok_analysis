package com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor;

import X.C01GW;
import X.C1346550l93;
import X.C1347610lAl;
import X.C1351950lHl;
import X.C1353500lKG;
import X.C1353700lKa;
import X.C13LE;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1697810uHb;
import X.C2217381BqS;
import X.C294400BgM;
import X.C295780Bia;
import X.C295880Bik;
import X.C449460Hjs;
import X.C449480Hju;
import X.C451440Hn4;
import X.C451450Hn5;
import X.C460000I2c;
import X.C726120Se2;
import X.InterfaceC2217461Bqa;
import X.InterfaceC460010I2d;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.emoji.model.Emoji;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentOldStyleEmojiPanelAssem extends UISlotAssem implements InterfaceC460010I2d, IKeyboardProtocol {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public C449460Hjs LLJJI;
    public final C726120Se2 LLJJIII = new C726120Se2();
    public C460000I2c LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CommentOldStyleEmojiPanelAssem.class, "commentContextSource", "getCommentContextSource()Lcom/ss/android/ugc/aweme/comment/model/CommentContextSource;", 0);
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

    @Override // com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardProtocol
    public final void p50() {
        C460000I2c c460000I2c = this.LLJJIJI;
        if (c460000I2c != null) {
            c460000I2c.LIZ = C1347610lAl.LIZIZ() ? (int) C1347610lAl.LIZ().maxInputLimit : C1353700lKa.LIZIZ();
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
        Context context;
        Resources resources;
        View view2;
        IKeyboardEditAbility iKeyboardEditAbilityLIZIZ = C1346550l93.LIZIZ(C1558520qew.LJIIL(this));
        if (iKeyboardEditAbilityLIZIZ != null && (c1353500lKGZy1 = iKeyboardEditAbilityLIZIZ.Zy1()) != null && (view = getSupervisor().LLJJIII) != null && (viewGroup = (ViewGroup) view.findViewById(this.LLIZ)) != null) {
            int iLIZIZ = C1347610lAl.LIZIZ() ? (int) C1347610lAl.LIZ().maxInputLimit : C1353700lKa.LIZIZ();
            C726120Se2 c726120Se2 = this.LLJJIII;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
            C460000I2c c460000I2c = new C460000I2c(c1353500lKGZy1, iLIZIZ, this, c726120Se2.LIZ(this));
            this.LLJJIJI = c460000I2c;
            C451450Hn5.LIZ();
            C449460Hjs c449460HjsLIZ = C449480Hju.LIZ(c460000I2c, viewGroup, C451440Hn4.LIZ(2));
            this.LLJJI = c449460HjsLIZ;
            if (C294400BgM.LIZ() && (context = getContext()) != null && (resources = context.getResources()) != null) {
                int dimension = (int) resources.getDimension(R.dimen.x3);
                C449460Hjs c449460Hjs = this.LLJJI;
                if (c449460Hjs != null && (view2 = c449460Hjs.LL) != null) {
                    C1351950lHl.LJIJI(dimension, view2);
                }
            }
            View view3 = c449460HjsLIZ.LL;
            if (view3 != null) {
                Zo(view3);
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
}
