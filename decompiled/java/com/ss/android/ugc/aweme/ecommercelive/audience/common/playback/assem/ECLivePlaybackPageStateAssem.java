package com.ss.android.ugc.aweme.ecommercelive.audience.common.playback.assem;

import X.C019F;
import X.C0HTI;
import X.C1390410mHn;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.graphics.Color;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.playback.ECLivePlaybackViewModel;
import com.zhiliaoapp.musically.R;
import g1c.AjS69S0100000_24;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: loaded from: classes25.dex */
public final class ECLivePlaybackPageStateAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public final AssemVMLazy LLIZLLLIL;
    public ConstraintLayout LLJ;
    public TuxIconView LLJI;
    public C1390410mHn LLJIJIL;
    public ImageView LLJILJIL;
    public TuxTextView LLJILJILJ;
    public TuxTextView LLJILLL;
    public TuxTextView LLJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ECLivePlaybackPageStateAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/ecommercelive/audience/common/playback/ECLivePlaybackViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ECLivePlaybackPageStateAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ECLivePlaybackViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 361), AFwS264S0000000_24.get$arr$(109), null, true);
    }

    public final ECLivePlaybackViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJI;
        return (ECLivePlaybackViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJ = (ConstraintLayout) view.findViewById(R.id.dup);
        this.LLJI = (TuxIconView) view.findViewById(R.id.l5y);
        this.LLJIJIL = (C1390410mHn) view.findViewById(R.id.nl7);
        this.LLJILJIL = (ImageView) view.findViewById(R.id.l69);
        this.LLJILJILJ = (TuxTextView) view.findViewById(R.id.z3t);
        this.LLJILLL = (TuxTextView) view.findViewById(R.id.z3q);
        this.LLJJ = (TuxTextView) view.findViewById(R.id.z61);
        ImageView imageView = this.LLJILJIL;
        if (imageView != null) {
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.n8;
            imageView.setImageDrawable(c0hti.LIZ(new ContextThemeWrapper(getContext(), R.style.y0)));
        }
        TuxTextView tuxTextView = this.LLJILJILJ;
        if (tuxTextView != null) {
            tuxTextView.setText(view.getContext().getString(2131832865));
        }
        TuxTextView tuxTextView2 = this.LLJILLL;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(view.getContext().getString(2131832864));
        }
        TuxTextView tuxTextView3 = this.LLJJ;
        if (tuxTextView3 != null) {
            tuxTextView3.setText(view.getContext().getString(2131832866));
        }
        TuxTextView tuxTextView4 = this.LLJJ;
        if (tuxTextView4 != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZ = Integer.valueOf(Color.argb(31, 255, 255, 255));
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(6));
            tuxTextView4.setBackground(c384050F3z.LIZ(view.getContext()));
        }
        Go().xQ2(new C2217381BqS() { // from class: X.0qwq
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1569940qxM) obj).LL;
            }
        }, null, new AwS603S0100000_24(this, 556));
        TuxIconView tuxIconView = this.LLJI;
        if (tuxIconView != null) {
            C786410Ut5.I7(new AjS69S0100000_24(this, 8), tuxIconView);
        }
        TuxTextView tuxTextView5 = this.LLJJ;
        if (tuxTextView5 != null) {
            C786410Ut5.I7(new AjS69S0100000_24(this, 9), tuxTextView5);
        }
    }
}
