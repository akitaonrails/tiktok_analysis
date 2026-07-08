package com.ss.android.ugc.aweme.vibefeed.feed.topbar.assem;

import X.AbstractC738140SxQ;
import X.C019F;
import X.C01GW;
import X.C0P31;
import X.C1220000hqw;
import X.C1295960jpS;
import X.C1308910kAL;
import X.C13LE;
import X.C1559260qg8;
import X.C1575980r76;
import X.C1637806bA;
import X.C19659111vp;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2188921Ale;
import X.C2217381BqS;
import X.C384050F3z;
import X.C418440Gaw;
import X.C426750GoL;
import X.C451610HnL;
import X.C452070Ho5;
import X.C452501pT;
import X.C636770OyJ;
import X.C638560P2w;
import X.C723580SZw;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C736950SvV;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.vibefeed.feed.VibeDetailSharedVM;
import com.ss.android.ugc.aweme.vibefeed.feed.viewmodel.VibeFeedConsumeViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS226S0000000_35;
import kotlin.jvm.internal.AFwS283S0000000_35;
import kotlin.jvm.internal.AwS135S0201000_9;
import kotlin.jvm.internal.AwS410S0200000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;
import kotlin.jvm.internal.AwS658S0100000_9;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes10.dex */
public final class VibeFeedProgressInfoAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1599));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1600));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1601));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1605));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1602));
    public final AssemVMLazy LLJILJILJ;
    public final C736950SvV LLJILLL;
    public final C1559260qg8 LLJJ;
    public int LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(VibeFeedProgressInfoAssem.class, "consumeVM", "getConsumeVM()Lcom/ss/android/ugc/aweme/vibefeed/feed/viewmodel/VibeFeedConsumeViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public VibeFeedProgressInfoAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VibeFeedConsumeViewModel.class);
        this.LLJILJILJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS553S0100000_9(c19719912DlLIZ, 1603), AFwS283S0000000_35.get$arr$(99), null, true);
        AFwS226S0000000_35 aFwS226S0000000_35 = AFwS226S0000000_35.get$arr$(294);
        this.LLJILLL = new C736950SvV(C13LE.LIZ(VibeDetailSharedVM.class), aFwS226S0000000_35, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS283S0000000_35.get$arr$(100), new AwS553S0100000_9((AbstractC738140SxQ) this, 1604), new C451610HnL(this, true, true), new C723700Sa8(this));
        this.LLJJ = new C1559260qg8(new C723580SZw(this, C636770OyJ.class, null), checkSupervisorPrepared());
    }

    public final VibeFeedConsumeViewModel Ho() {
        AssemVMLazy assemVMLazy = this.LLJILJILJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIII;
        return (VibeFeedConsumeViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C1295960jpS c1295960jpS = (C1295960jpS) this.LLJI.getValue();
        if (c1295960jpS != null) {
            c1295960jpS.setAnimation(R.raw.tux_lottie_common_social_shared_progress);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.zj);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
            Drawable drawableLIZ = c384050F3z.LIZ(c1295960jpS.getContext());
            C19659111vp c19659111vp = new C19659111vp();
            c19659111vp.LIZLLL = 7.0f;
            c19659111vp.LJ = Integer.valueOf(R.attr.f511p1);
            c1295960jpS.setBackground(C426750GoL.LJIILIIL(drawableLIZ, c19659111vp.LIZ(c1295960jpS.getContext())));
            if (C426750GoL.LIZLLL(c1295960jpS.getContext())) {
                C786410Ut5.Wb(c1295960jpS, -1.0f);
            }
        }
        C736680Sv4.LJIIIZ(this, Ho(), new C2217381BqS() { // from class: X.0P41
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C0P3X) obj).LLILLJJLI);
            }
        }, new C2217381BqS() { // from class: X.0r5A
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0P3X) obj).LLILLL;
            }
        }, null, new AwS658S0100000_9(this, 19), 12);
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0P3q
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C0P3X) obj).LLILZ);
            }
        }, C736820SvI.LIZLLL(), new AwS623S0100000_9(this, 171), 4);
        AssemViewModel assemViewModel = (AssemViewModel) this.LLJILLL.getValue();
        getActualLifecycleOwner();
        assemViewModel.asyncSubscribe(new C2217381BqS() { // from class: X.0P42
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C0P3U c0p3u = (C0P3U) obj;
                c0p3u.getClass();
                return C627260Oiy.LIZLLL(c0p3u);
            }
        }, this, C736820SvI.LIZLLL(), new AwS588S0100000_9(this, 439), AFwS226S0000000_35.get$arr$(386), new AwS588S0100000_9(this, 440));
        C736680Sv4.LJIIIIZZ(this, Ho(), new C2217381BqS() { // from class: X.0P3Y
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0P3X) obj).LLJ;
            }
        }, null, new AwS623S0100000_9(this, 170), 6);
    }

    public final void Go(String str, boolean z, C638560P2w c638560P2w) {
        int iIntValue;
        int iIntValue2;
        long jLJIJ;
        if (str.length() != 0 && !C1575980r76.LJI(str)) {
            if (z) {
                C0P31 c0p31 = Ho().LLILZ;
                if (c0p31 != null) {
                    jLJIJ = c0p31.LJIJ(str);
                } else {
                    jLJIJ = 0;
                }
                TuxTextView tuxTextView = (TuxTextView) this.LLIZLLLIL.getValue();
                if (tuxTextView != null) {
                    String strLJII = C1575980r76.LJII(Long.valueOf(jLJIJ));
                    if (strLJII == null) {
                        strLJII = "";
                    }
                    tuxTextView.setText(strLJII);
                    LinearLayout linearLayout = (LinearLayout) this.LLJ.getValue();
                    if (linearLayout != null) {
                        C786410Ut5.LJZL(8, linearLayout);
                    }
                    C786410Ut5.LLLLZLL(tuxTextView, 0);
                    return;
                }
                return;
            }
            if (c638560P2w.LIZ <= 0) {
                return;
            }
            TuxTextView tuxTextView2 = (TuxTextView) this.LLIZLLLIL.getValue();
            if (tuxTextView2 != null) {
                C786410Ut5.LLLLZLL(tuxTextView2, 8);
            }
            LinearLayout linearLayout2 = (LinearLayout) this.LLJ.getValue();
            if (linearLayout2 != null) {
                C786410Ut5.LJZL(0, linearLayout2);
            }
            int i = this.LLJJI;
            this.LLJJI = c638560P2w.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[bindProgressBar] curConsumedCnt: ");
            sbLIZ.append(c638560P2w.LIZIZ);
            sbLIZ.append(", totalCnt: ");
            sbLIZ.append(c638560P2w.LIZ);
            sbLIZ.append(", curShowingConsumedCnt: ");
            sbLIZ.append(i);
            C2188811AlT.LIZIZ(sbLIZ);
            int i2 = this.LLJJI;
            if (i != i2) {
                if (i != 0 && i <= i2) {
                    C2188921Ale c2188921Ale = (C2188921Ale) this.LLJILJIL.getValue();
                    if (c2188921Ale != null) {
                        c2188921Ale.LIZIZ(new AwS135S0201000_9(this, i, c638560P2w, 2));
                    }
                } else {
                    C2188921Ale c2188921Ale2 = (C2188921Ale) this.LLJILJIL.getValue();
                    if (c2188921Ale2 != null) {
                        c2188921Ale2.LIZIZ(new AwS410S0200000_9(this, c638560P2w, 71));
                    }
                }
            }
            TextView textView = (TextView) this.LLJIJIL.getValue();
            if (textView == null) {
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(c638560P2w.LIZIZ);
            sbLIZ2.append('/');
            sbLIZ2.append(c638560P2w.LIZ);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            SpannableString spannableString = new SpannableString(strLIZIZ);
            int iLJJIZ = a0.LJJIZ(strLIZIZ, '/', 0, false, 6);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a0p, textView.getContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            C786410Ut5.p2(spannableString, new ForegroundColorSpan(iIntValue), 0, iLJJIZ, 33);
            C786410Ut5.p2(spannableString, new StyleSpan(1), 0, iLJJIZ, 33);
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.zl, textView.getContext());
            if (numLIZJ2 != null) {
                iIntValue2 = numLIZJ2.intValue();
            } else {
                iIntValue2 = 0;
            }
            C786410Ut5.p2(spannableString, new ForegroundColorSpan(iIntValue2), iLJJIZ, strLIZIZ.length(), 33);
            C786410Ut5.p2(spannableString, new StyleSpan(0), iLJJIZ, strLIZIZ.length(), 33);
            textView.setText(spannableString);
        }
    }
}
