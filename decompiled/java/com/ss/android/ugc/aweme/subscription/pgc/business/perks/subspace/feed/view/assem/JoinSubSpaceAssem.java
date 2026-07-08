package com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.feed.view.assem;

import X.AbstractC1387200mCc;
import X.C019F;
import X.C0HE8;
import X.C0K51;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C426930God;
import X.C5185020h;
import X.C520040KaQ;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.feed.vm.SubSpaceFeedVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS546S0100000_2;
import wh6.AbS360S0000000_7;
import wh6.AbS689S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class JoinSubSpaceAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public final AssemVMLazy LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(JoinSubSpaceAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/subscription/pgc/business/perks/subspace/feed/vm/SubSpaceFeedVM;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public JoinSubSpaceAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubSpaceFeedVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS546S0100000_2(c19719912DlLIZ, 832), AFwS237S0000000_7.get$arr$(220), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fi9;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final Context Eo(Context context) {
        Context contextLJIIJ;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ;
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if ((fragmentLJI != null && (abstractC1387200mCcLIZIZ = C520040KaQ.LIZIZ(fragmentLJI)) != null && (contextLJIIJ = abstractC1387200mCcLIZIZ.LJIIIIZZ()) != null) || (contextLJIIJ = C0K51.LJIIJ(context, false)) != null) {
            context = contextLJIIJ;
        }
        return C0HE8.LIZ(context);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        view.findViewById(R.id.m0c).setBackgroundColor(C426930God.LIZIZ(R.attr.f8i, view));
        view.findViewById(R.id.m0b).setBackgroundColor(C426930God.LIZIZ(R.attr.f_4, view));
        C786410Ut5.LJLLLLLL(8, view);
        C786410Ut5.I7(new AbS360S0000000_7(3), view);
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0Jtv
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C506350JtR) obj).LLILZIL;
            }
        }, null, new C5185020h(view, 38), 6);
        C736680Sv4.LJIIIIZZ(this, this.LLJJI.getValue(), new C2217381BqS() { // from class: X.0Jtx
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C506350JtR) obj).LLIZ;
            }
        }, null, new C5185020h(view, 39), 6);
        C786410Ut5.I7(new AbS689S0100000_7(this, 26), view.findViewById(R.id.crf));
        view.findViewById(R.id.m0e).setOnTouchListener(new View.OnTouchListener() { // from class: X.0K4K
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                C0JCX.LIZ(2131839625);
                return true;
            }
        });
    }
}
