package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.decorationtools;

import X.C019F;
import X.C01DP;
import X.C0GYF;
import X.C0JPZ;
import X.C12956055e;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1848410yCV;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C485600J2o;
import X.C491440JPa;
import X.C491450JPb;
import X.C500260Jjc;
import X.C723590SZx;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786820Utk;
import X.InterfaceC2217461Bqa;
import android.view.View;
import android.widget.SeekBar;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public final class TextSizeSliderAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public final AssemVMLazy LLIZLLLIL;
    public final C1559260qg8 LLJ;
    public C0GYF LLJI;
    public int LLJIJIL;
    public int LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TextSizeSliderAssem.class, "richTextStyleEditViewModel", "getRichTextStyleEditViewModel()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/growth/decoration/edit/decorationtools/RichTextStyleEditViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public TextSizeSliderAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(RichTextStyleEditViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C12956055e(c19719912DlLIZ), new C491450JPb(), null, true);
        this.LLJ = new C1559260qg8(new C723590SZx(this, C01DP.class, "FullCustomizedBoardHierarchyData"), checkSupervisorPrepared());
        this.LLJIJIL = 12;
        this.LLJILJIL = 40;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        view.findViewById(R.id.xqe);
        C0GYF c0gyf = (C0GYF) view.findViewById(R.id.xqd);
        this.LLJI = c0gyf;
        if (c0gyf != null) {
            C500260Jjc.LLFFF(c0gyf);
        }
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJILJ;
        C736680Sv4.LJIIIIZZ(this, assemVMLazy.getValue(), new C2217381BqS() { // from class: X.0xxl
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C2880019q) obj).LL;
            }
        }, null, new C491440JPa(this), 6);
        final C0GYF c0gyf2 = this.LLJI;
        if (c0gyf2 != null) {
            final C0JPZ c0jpz = new C0JPZ(this);
            final C485600J2o c485600J2o = new C485600J2o(this);
            SeekBar.OnSeekBarChangeListener c786820Utk = new SeekBar.OnSeekBarChangeListener() { // from class: X.0GgA
                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public final void onStartTrackingTouch(SeekBar seekBar) {
                    C0GYF c0gyf3 = c0gyf2;
                    c0gyf3.animate().translationX(0.0f).setDuration(c0gyf3.LLILLJJLI).setInterpolator(c0gyf3.LLILLL).start();
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public final void onStopTrackingTouch(SeekBar seekBar) {
                    C0GYF c0gyf3 = c0gyf2;
                    c0gyf3.animate().translationX(c0gyf3.LLILZ).setDuration(c0gyf3.LLILLJJLI).setInterpolator(c0gyf3.LLILLL).start();
                    c485600J2o.invoke(Integer.valueOf(seekBar.getProgress()));
                }

                @Override // android.widget.SeekBar.OnSeekBarChangeListener
                public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                    if (z) {
                        c0jpz.invoke(Integer.valueOf(i));
                    }
                }
            };
            if (C1848410yCV.LIZ) {
                c786820Utk = new C786820Utk(c786820Utk);
            }
            c0gyf2.setOnSeekBarChangeListener(c786820Utk);
        }
    }
}
