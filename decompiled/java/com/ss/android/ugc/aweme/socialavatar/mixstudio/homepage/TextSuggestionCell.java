package com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage;

import X.C01GW;
import X.C1272904yV;
import X.C1308910kAL;
import X.C13LE;
import X.C2217381BqS;
import X.C426750GoL;
import X.C440190HNx;
import X.C452501pT;
import X.C462960IDm;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import Y.ACListenerS110S0200000_6;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: loaded from: classes7.dex */
public final class TextSuggestionCell extends PowerCell<C1272904yV> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public TuxTextView LLILLJJLI;
    public final C462960IDm LL = new C462960IDm(this, 3);
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(258));
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(257));
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(259));
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(256));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TextSuggestionCell.class, "control", "getControl()Lcom/ss/android/ugc/aweme/socialavatar/mixstudio/homepage/TextSuggestionControl;", 0);
        C13LE.LIZ.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1272904yV c1272904yV = (C1272904yV) interfaceC1891350zJl;
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            tuxTextView.setText(c1272904yV.LL);
            C786410Ut5.h9(tuxTextView, new ACListenerS110S0200000_6(this, c1272904yV, 27));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        TuxTextView tuxTextView = new TuxTextView(viewGroup.getContext(), null, 6, 0);
        tuxTextView.setTuxFont(61);
        tuxTextView.setTextColorRes(R.attr.a1i);
        C426750GoL.LJIIL(tuxTextView, Integer.valueOf(((Number) this.LLILLL.getValue()).intValue()), Integer.valueOf(((Number) this.LLILZIL.getValue()).intValue()), Integer.valueOf(((Number) this.LLILLL.getValue()).intValue()), Integer.valueOf(((Number) this.LLILZIL.getValue()).intValue()), 16);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1f, tuxTextView.getContext());
        if (numLIZJ != null) {
            tuxTextView.setBackground(new C440190HNx(((Number) this.LLILZLL.getValue()).floatValue(), numLIZJ.intValue()));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        int iIntValue = ((Number) this.LLILZ.getValue()).intValue();
        marginLayoutParams.setMarginStart(iIntValue);
        marginLayoutParams.setMarginEnd(iIntValue);
        C786410Ut5.R6(tuxTextView, marginLayoutParams);
        this.LLILLJJLI = tuxTextView;
        return tuxTextView;
    }
}
