package com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor;

import X.C01GW;
import X.C1350650lFf;
import X.C13LE;
import X.C1558520qew;
import X.C2217381BqS;
import X.C295780Bia;
import X.C295880Bik;
import X.C723850SaN;
import X.C726120Se2;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.model.CommentKeyboardModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS600S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class SingleLineAreaBelowInputAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public LinearLayout LLJJI;
    public LinearLayout LLJJIII;
    public LinearLayout LLJJIJI;
    public final C726120Se2 LLJJIJIIJIL = new C726120Se2();

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SingleLineAreaBelowInputAssem.class, "contextSource", "getContextSource()Lcom/ss/android/ugc/aweme/comment/model/CommentContextSource;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.a4p;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public final boolean hp() {
        CommentKeyboardModel keyboardModel;
        C1350650lFf.LIZ.getClass();
        C726120Se2 c726120Se2 = this.LLJJIJIIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIL;
        boolean z = false;
        CommentContextSource commentContextSourceLIZ = c726120Se2.LIZ(this);
        if (commentContextSourceLIZ != null && (keyboardModel = commentContextSourceLIZ.getKeyboardModel()) != null && keyboardModel.isLandscapeMode()) {
            z = true;
        }
        return !z;
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
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

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJJIII = (LinearLayout) view.findViewById(R.id.rfb);
        this.LLJJI = (LinearLayout) view.findViewById(R.id.nak);
        this.LLJJIJI = (LinearLayout) view.findViewById(R.id.vc_);
        C723850SaN.LIZLLL(this, new AwS600S0100000_21(this, 65));
        if (hp()) {
            C786410Ut5.LJLLLLLL(0, LJJIJL());
            LinearLayout linearLayout = this.LLJJIJI;
            if (linearLayout == null) {
                linearLayout = null;
            }
            C786410Ut5.LJLLLLLL(0, linearLayout);
        }
    }
}
