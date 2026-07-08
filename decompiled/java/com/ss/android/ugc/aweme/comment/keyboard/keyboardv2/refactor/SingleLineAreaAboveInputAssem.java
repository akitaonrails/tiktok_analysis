package com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor;

import X.C01GW;
import X.C1347620lAm;
import X.C13LE;
import X.C1558520qew;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C295780Bia;
import X.C295880Bik;
import X.C452230HoL;
import X.C452250HoN;
import X.C452501pT;
import X.C726120Se2;
import X.C736680Sv4;
import X.C736820SvI;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.experiment.ReplyCommentUIOptConfig;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS303S0000000_19;
import kotlin.jvm.internal.AwS23S0600000_19;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.AwS635S0100000_21;

/* JADX INFO: loaded from: classes22.dex */
public final class SingleLineAreaAboveInputAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public TuxTextView LLJJI;
    public TuxTextView LLJJIII;
    public final C01GW LLJJIJI;
    public final C726120Se2 LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SingleLineAreaAboveInputAssem.class, "contextSource", "getContextSource()Lcom/ss/android/ugc/aweme/comment/model/CommentContextSource;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SingleLineAreaAboveInputAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(KeyboardVMV2.class);
        this.LLJJIJI = C452501pT.LIZIZ(new AwS23S0600000_19(this, c19719912DlLIZ, C1637806bA.LIZ, new C452230HoL(c19719912DlLIZ), new C452250HoN(), (Function0) null, 46));
        this.LLJJIJIIJIL = new C726120Se2();
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return ((ReplyCommentUIOptConfig) C1347620lAm.LIZIZ.getValue()).replyInfoStyle == 2 ? R.layout.a4r : R.layout.a4q;
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
        this.LLJJI = (TuxTextView) view.findViewById(R.id.t7l);
        this.LLJJIII = (TuxTextView) view.findViewById(R.id.t7m);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJIJI.getValue(), new C2217381BqS() { // from class: X.0hi0
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1346950l9h) obj).LLJJ);
            }
        }, null, AFwS303S0000000_19.get$arr$(14), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJIJI.getValue(), new C2217381BqS() { // from class: X.0lAc
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C1346950l9h) obj).LLJLL);
            }
        }, C736820SvI.LIZLLL(), new AwS633S0100000_19(this, 33), 4);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLJJIJI.getValue(), new C2217381BqS() { // from class: X.0lAb
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1346950l9h) obj).LLILZIL;
            }
        }, null, new AwS635S0100000_21(this, 44), 6);
    }
}
