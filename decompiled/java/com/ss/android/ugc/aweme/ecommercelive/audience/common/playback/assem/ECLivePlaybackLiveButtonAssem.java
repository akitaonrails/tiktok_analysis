package com.ss.android.ugc.aweme.ecommercelive.audience.common.playback.assem;

import X.C019F;
import X.C0H9H;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C19MB;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC2217461Bqa;
import android.view.View;
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
public final class ECLivePlaybackLiveButtonAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public final AssemVMLazy LLIZLLLIL;
    public ConstraintLayout LLJ;
    public SmartImageView LLJI;
    public TuxTextView LLJIJIL;
    public ConstraintLayout LLJILJIL;
    public String LLJILJILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ECLivePlaybackLiveButtonAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/ecommercelive/audience/common/playback/ECLivePlaybackViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ECLivePlaybackLiveButtonAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ECLivePlaybackViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 360), AFwS264S0000000_24.get$arr$(108), null, true);
    }

    public final ECLivePlaybackViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        return (ECLivePlaybackViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJ = (ConstraintLayout) view.findViewById(R.id.tnd);
        this.LLJI = (SmartImageView) view.findViewById(R.id.l6r);
        this.LLJIJIL = (TuxTextView) view.findViewById(R.id.z4k);
        this.LLJILJIL = (ConstraintLayout) view.findViewById(R.id.iiv);
        ConstraintLayout constraintLayout = this.LLJ;
        if (constraintLayout != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.zj);
            c384050F3z.LJFF = Integer.valueOf(R.attr.zj);
            c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
            constraintLayout.setBackground(c384050F3z.LIZ(view.getContext()));
        }
        Go().xQ2(new C2217381BqS() { // from class: X.0qwx
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1569940qxM) obj).LLILZ;
            }
        }, null, new AwS603S0100000_24(this, 555));
        ConstraintLayout constraintLayout2 = this.LLJ;
        if (constraintLayout2 != null) {
            C786410Ut5.I7(new AjS69S0100000_24(this, 7), constraintLayout2);
        }
    }

    public static void Ho(ConstraintLayout constraintLayout, boolean z) {
        if (constraintLayout == null) {
            return;
        }
        C19MB c19mb = new C19MB();
        c19mb.LJII(constraintLayout);
        c19mb.LJI(R.id.dus, 4);
        if (z) {
            c19mb.LJIIIZ(R.id.dus, 4, R.id.tnd, 3, C0H9H.LIZIZ(20));
        } else {
            c19mb.LJIIIZ(R.id.dus, 4, 0, 4, C0H9H.LIZIZ(50));
        }
        c19mb.LIZIZ(constraintLayout);
    }
}
