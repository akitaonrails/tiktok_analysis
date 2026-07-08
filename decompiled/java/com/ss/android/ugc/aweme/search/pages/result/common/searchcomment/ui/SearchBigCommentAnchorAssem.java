package com.ss.android.ugc.aweme.search.pages.result.common.searchcomment.ui;

import X.C01GW;
import X.C0HHT;
import X.C0Q3E;
import X.C0R42;
import X.C1308910kAL;
import X.C13IQ;
import X.C13LE;
import X.C1637806bA;
import X.C1849520yEI;
import X.C1954807lC;
import X.C19719912Dl;
import X.C21565319aV;
import X.C2217381BqS;
import X.C284370BCp;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C452501pT;
import X.C467860IWi;
import X.C650240Pew;
import X.C659520Ptu;
import X.C659750PuH;
import X.C660430PvN;
import X.C660470PvR;
import X.C660540PvY;
import X.C660590Pvd;
import X.C660970PwF;
import X.C661190Pwb;
import X.C661350Pwr;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C737910Sx3;
import X.C814420VxA;
import X.EnumC660440PvO;
import X.InterfaceC1294060jmO;
import X.InterfaceC1587906Jp;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC650320Pf4;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.search.pages.result.common.searchcomment.viewmodel.SearchBigCommentAnchorViewModel;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchVideoPhotoCommentAnchorAssem;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS28S0000100_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS624S0100000_10;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchBigCommentAnchorAssem extends SearchVideoPhotoCommentAnchorAssem<InterfaceC1587906Jp> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIZZ;
    public final InterfaceC1731706qJ LLLIIIIL;
    public final int LLLIIIL;
    public TextView LLLIIL;
    public boolean LLLIILIL;
    public final C01GW LLLIL;
    public final C01GW LLLILZ;
    public final C01GW LLLILZJ;
    public final C0R42 LLLILZLLLI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchBigCommentAnchorAssem.class, "commentAnchorVM", "getCommentAnchorVM()Lcom/ss/android/ugc/aweme/search/pages/result/common/searchcomment/viewmodel/SearchBigCommentAnchorViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLIZZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public SearchBigCommentAnchorAssem() {
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchBigCommentAnchorViewModel.class);
        this.LLLIIIIL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, C1637806bA.LIZ, new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 500), null, AFwS241S0000000_10.get$arr$(216));
        this.LLLIIIL = R.id.u7g;
        this.LLLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 498));
        this.LLLILZ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 499));
        this.LLLILZJ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 497));
        this.LLLILZLLLI = new C0R42(this, 2);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchVideoPhotoCommentAnchorAssem
    public final void cp(Comment comment) {
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchVideoPhotoCommentAnchorAssem
    @InterfaceC1294060jmO
    public final void dp(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchVideoPhotoCommentAnchorAssem
    public final C660970PwF mp() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchVideoPhotoCommentAnchorAssem
    public final void op(View view) {
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchVideoPhotoCommentAnchorAssem
    /* JADX INFO: renamed from: Bp, reason: merged with bridge method [inline-methods] */
    public final SearchBigCommentAnchorViewModel ip() {
        return (SearchBigCommentAnchorViewModel) this.LLLIIIIL.getValue(this, LLLIZZ[0]);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchVideoPhotoCommentAnchorAssem
    public final List<InterfaceC650320Pf4<?>> lp() {
        return (List) this.LLLIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchVideoPhotoCommentAnchorAssem, com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        super.Vo();
        C1849520yEI c1849520yEI = this.LLJJJJJIL;
        if (c1849520yEI != null) {
            c1849520yEI.removeOnLayoutChangeListener(this.LLLILZLLLI);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchVideoPhotoCommentAnchorAssem
    public final void zp() {
        if (C284370BCp.LIZ()) {
            super.zp();
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchVideoPhotoCommentAnchorAssem
    public final int kp() {
        return this.LLLIIIL;
    }

    public final void Fp(EnumC660440PvO enumC660440PvO) {
        Context context;
        TextView textView;
        TextView textView2;
        ViewGroup viewGroup = this.LLJJL;
        if (viewGroup != null) {
            context = viewGroup.getContext();
        } else {
            context = null;
        }
        boolean zLIZ = C467860IWi.LIZ(context);
        int i = C660470PvR.LIZ[enumC660440PvO.ordinal()];
        if (i != 1) {
            if (i == 2) {
                ViewGroup viewGroup2 = this.LLJJL;
                if (viewGroup2 != null) {
                    viewGroup2.setBackgroundColor(Ap(true, Integer.valueOf(R.attr.zb)));
                }
                TextView textView3 = this.LLLIIL;
                if (textView3 != null) {
                    textView3.setTextColor(Ap(true, Integer.valueOf(R.attr.zi)));
                }
                C1849520yEI c1849520yEI = this.LLJJJJJIL;
                if (c1849520yEI != null) {
                    c1849520yEI.setTextColor(Ap(true, Integer.valueOf(R.attr.zi)));
                }
                C1849520yEI c1849520yEI2 = this.LLJJJJJIL;
                if (c1849520yEI2 != null) {
                    c1849520yEI2.setColorDigged(Ap(true, Integer.valueOf(R.attr.a1r)));
                }
                C1849520yEI c1849520yEI3 = this.LLJJJJJIL;
                if (c1849520yEI3 != null) {
                    c1849520yEI3.setColorDiggCount(Ap(true, Integer.valueOf(R.attr.zl)));
                }
                Context context2 = getContext();
                if (context2 != null && (textView2 = this.LLLIIL) != null) {
                    C661350Pwr.LJIIIZ(textView2, Ep(Ap(true, Integer.valueOf(R.attr.a1h)), context2), context2);
                    return;
                }
                return;
            }
            throw new C1954807lC();
        }
        ViewGroup viewGroup3 = this.LLJJL;
        if (viewGroup3 != null) {
            viewGroup3.setBackgroundColor(Ap(zLIZ, Integer.valueOf(R.attr.a1b)));
        }
        TextView textView4 = this.LLLIIL;
        if (textView4 != null) {
            textView4.setTextColor(Ap(zLIZ, Integer.valueOf(R.attr.a1h)));
        }
        C1849520yEI c1849520yEI4 = this.LLJJJJJIL;
        if (c1849520yEI4 != null) {
            c1849520yEI4.setTextColor(Ap(zLIZ, Integer.valueOf(R.attr.a1h)));
        }
        C1849520yEI c1849520yEI5 = this.LLJJJJJIL;
        if (c1849520yEI5 != null) {
            c1849520yEI5.setColorDigged(Ap(zLIZ, Integer.valueOf(R.attr.a1r)));
        }
        C1849520yEI c1849520yEI6 = this.LLJJJJJIL;
        if (c1849520yEI6 != null) {
            c1849520yEI6.setColorDiggCount(Ap(zLIZ, Integer.valueOf(R.attr.a1k)));
        }
        Context context3 = getContext();
        if (context3 == null || (textView = this.LLLIIL) == null) {
            return;
        }
        C661350Pwr.LJIIIZ(textView, Ep(Ap(zLIZ, Integer.valueOf(R.attr.a1h)), context3), context3);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchVideoPhotoCommentAnchorAssem
    public final void ep(View view) {
        this.LLJJL = (ViewGroup) view.findViewById(R.id.u7g);
        this.LLLIIL = (TextView) view.findViewById(R.id.u7i);
        this.LLJJJJJIL = (C1849520yEI) view.findViewById(R.id.u7h);
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchVideoPhotoCommentAnchorAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        ViewGroup viewGroup = this.LLJJL;
        if (viewGroup != null) {
            C21565319aV.LIZIZ(viewGroup, Float.valueOf(C418440Gaw.LIZIZ(6)), null, null, null, null, 30);
        }
        ViewGroup viewGroup2 = this.LLJJL;
        if (viewGroup2 != null) {
            C426750GoL.LJIIIZ(viewGroup2, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), false, 18);
        }
        C650240Pew c650240Pew = C650240Pew.LIZ;
        Context context = view.getContext();
        c650240Pew.getClass();
        int iLIZJ = C650240Pew.LIZJ(context) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
        C1849520yEI c1849520yEI = this.LLJJJJJIL;
        if (c1849520yEI != null) {
            c1849520yEI.setTextMaxWith(iLIZJ);
        }
        C1849520yEI c1849520yEI2 = this.LLJJJJJIL;
        if (c1849520yEI2 != null) {
            c1849520yEI2.setIsNeedQuote(true);
        }
        C1849520yEI c1849520yEI3 = this.LLJJJJJIL;
        if (c1849520yEI3 != null) {
            c1849520yEI3.setIsNeedImage(true);
        }
        C1849520yEI c1849520yEI4 = this.LLJJJJJIL;
        if (c1849520yEI4 != null) {
            c1849520yEI4.setIsNeedEndDiggCount(true);
        }
        C1849520yEI c1849520yEI5 = this.LLJJJJJIL;
        if (c1849520yEI5 != null) {
            c1849520yEI5.setIsNeedEndIcon(false);
        }
        C1849520yEI c1849520yEI6 = this.LLJJJJJIL;
        if (c1849520yEI6 != null) {
            c1849520yEI6.setNeedLayoutBuilderParams(false);
        }
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0Pwj
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C661190Pwb) obj).LLILZIL;
            }
        }, null, new AwS624S0100000_10(this, 99), 6);
        C736680Sv4.LJIIIIZZ(this, ip(), new C2217381BqS() { // from class: X.0Pwk
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C661190Pwb) obj).LLILLJJLI;
            }
        }, null, new AwS624S0100000_10(this, 100), 6);
        C1849520yEI c1849520yEI7 = this.LLJJJJJIL;
        if (c1849520yEI7 != null) {
            c1849520yEI7.addOnLayoutChangeListener(this.LLLILZLLLI);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchVideoPhotoCommentAnchorAssem, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(Object obj) {
        C659750PuH c659750PuH;
        C660430PvN c660430PvN;
        EnumC660440PvO enumC660440PvO;
        C660430PvN c660430PvN2;
        EnumC660440PvO enumC660440PvO2;
        InterfaceC1587906Jp interfaceC1587906Jp = (InterfaceC1587906Jp) obj;
        this.LLLIILIL = false;
        C659520Ptu c659520Ptu = null;
        if (interfaceC1587906Jp instanceof C659520Ptu) {
            c659520Ptu = (C659520Ptu) interfaceC1587906Jp;
        }
        if (c659520Ptu != null) {
            if (c659520Ptu.LLILLL instanceof C660590Pvd) {
                this.LLLIILIL = true;
                Object obj2 = c659520Ptu.LLILZ;
                if ((obj2 instanceof C660430PvN) && (c660430PvN2 = (C660430PvN) obj2) != null && (enumC660440PvO2 = c660430PvN2.LIZJ) != null) {
                    Fp(enumC660440PvO2);
                }
                ip().wQ2(c659520Ptu);
                ip().zQ2(true);
            } else {
                ip().zQ2(false);
            }
            this.LLJLL = c659520Ptu.LLILLJJLI;
        }
        if ((interfaceC1587906Jp instanceof C659750PuH) && (c659750PuH = (C659750PuH) interfaceC1587906Jp) != null) {
            if (c659750PuH.LLILLL instanceof C660540PvY) {
                this.LLLIILIL = true;
                Object obj3 = c659750PuH.LLILZ;
                if ((obj3 instanceof C660430PvN) && (c660430PvN = (C660430PvN) obj3) != null && (enumC660440PvO = c660430PvN.LIZJ) != null) {
                    Fp(enumC660440PvO);
                }
                ip().xQ2(c659750PuH);
                ip().zQ2(true);
            } else {
                ip().zQ2(false);
            }
            this.LLJLL = c659750PuH.LLILLJJLI.LJIIIIZZ;
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchVideoPhotoCommentAnchorAssem
    public final void sp(boolean z) {
        C661190Pwb state = ip().getState();
        if (C284370BCp.LIZ() && ip().LL != 0) {
            return;
        }
        if (!C284370BCp.LIZ() && state.LLIZLLLIL != 0) {
            return;
        }
        ip().vQ2(this.LLJLL, C0Q3E.LIZ(LJJIJL()));
        if (this.LLLIILIL) {
            ip().yQ2(1);
        }
    }

    @Override // com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchVideoPhotoCommentAnchorAssem
    public final void tp(boolean z) {
        C661190Pwb state = ip().getState();
        if (C284370BCp.LIZ() && ip().LL != 1) {
            return;
        }
        if (!C284370BCp.LIZ() && state.LLIZLLLIL != 1) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.LLLIILIL) {
            ip().yQ2(0);
            SearchBigCommentAnchorViewModel searchBigCommentAnchorViewModelIp = ip();
            searchBigCommentAnchorViewModelIp.getClass();
            searchBigCommentAnchorViewModelIp.setState(new AwS28S0000100_10(jCurrentTimeMillis, 3));
        }
    }

    public static TuxIconDrawable Ep(int i, Context context) {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_chevron_right_offset_ltr;
        c419910GdJ.LIZLLL = Integer.valueOf(i);
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
        tuxIconDrawableLIZ.setBounds(new Rect(0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14))));
        return tuxIconDrawableLIZ;
    }

    public final int Ap(boolean z, Integer num) {
        Integer numLIZJ;
        Integer numLIZJ2;
        if (num == null) {
            return 0;
        }
        num.intValue();
        if (z) {
            Context context = (Context) this.LLLILZJ.getValue();
            if (context == null || (numLIZJ2 = C1308910kAL.LIZJ(num.intValue(), context)) == null) {
                return 0;
            }
            return numLIZJ2.intValue();
        }
        Context context2 = (Context) this.LLLILZ.getValue();
        if (context2 == null || (numLIZJ = C1308910kAL.LIZJ(num.intValue(), context2)) == null) {
            return 0;
        }
        return numLIZJ.intValue();
    }
}
