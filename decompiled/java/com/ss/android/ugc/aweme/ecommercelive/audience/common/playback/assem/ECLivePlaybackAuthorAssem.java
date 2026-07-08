package com.ss.android.ugc.aweme.ecommercelive.audience.common.playback.assem;

import X.C019F;
import X.C1155290gAZ;
import X.C13LE;
import X.C1559260qg8;
import X.C1580050rDf;
import X.C1637806bA;
import X.C1743690vTb;
import X.C19719912Dl;
import X.C19ME;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C723590SZx;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.playback.ECLivePlaybackViewModel;
import com.zhiliaoapp.musically.R;
import g1c.AjS69S0100000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class ECLivePlaybackAuthorAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public final AssemVMLazy LLIZLLLIL;
    public final C1559260qg8 LLJ;
    public SmartImageView LLJI;
    public TuxTextView LLJIJIL;
    public C1580050rDf LLJILJIL;
    public ConstraintLayout LLJILJILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ECLivePlaybackAuthorAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/ecommercelive/audience/common/playback/ECLivePlaybackViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ECLivePlaybackAuthorAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ECLivePlaybackViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 359), AFwS264S0000000_24.get$arr$(107), null, true);
        this.LLJ = new C1559260qg8(new C723590SZx(this, C1155290gAZ.class, "assem_enter_params"), checkSupervisorPrepared());
    }

    public final ECLivePlaybackViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        return (ECLivePlaybackViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        ViewGroup.LayoutParams layoutParams;
        C19ME c19me;
        super.onViewCreated(view);
        this.LLJI = (SmartImageView) view.findViewById(R.id.l5h);
        this.LLJIJIL = (TuxTextView) view.findViewById(R.id.z2b);
        this.LLJILJIL = (C1580050rDf) view.findViewById(R.id.cm7);
        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(R.id.bby);
        this.LLJILJILJ = constraintLayout;
        if (constraintLayout != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.e6);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(200));
            constraintLayout.setBackground(c384050F3z.LIZ(view.getContext()));
        }
        ConstraintLayout constraintLayout2 = this.LLJILJILJ;
        if (constraintLayout2 != null) {
            layoutParams = constraintLayout2.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if ((layoutParams instanceof C19ME) && (c19me = (C19ME) layoutParams) != null) {
            c19me.matchConstraintMaxWidth = C1743690vTb.LIZIZ() / 2;
        }
        Go().xQ2(new C2217381BqS() { // from class: X.0qww
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1569940qxM) obj).LLILLJJLI;
            }
        }, null, new AwS603S0100000_24(this, 552));
        Go().xQ2(new C2217381BqS() { // from class: X.0qwt
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1569940qxM) obj).LLILLL;
            }
        }, null, new AwS603S0100000_24(this, 553));
        Go().xQ2(new C2217381BqS() { // from class: X.0qwu
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1569940qxM) obj).LLIZ;
            }
        }, null, new AwS603S0100000_24(this, 554));
        C1580050rDf c1580050rDf = this.LLJILJIL;
        if (c1580050rDf != null) {
            C786410Ut5.I7(new AjS69S0100000_24(this, 6), c1580050rDf);
        }
    }
}
