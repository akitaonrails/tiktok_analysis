package com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.ui;

import X.AnonymousClass0207;
import X.C01GW;
import X.C1202280hOM;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C13LE;
import X.C13LP;
import X.C166W;
import X.C1843500y4a;
import X.C1908030zkf;
import X.C2211631BhB;
import X.C2217381BqS;
import X.C301390Brd;
import X.C329900CwW;
import X.C329910CwX;
import X.C329920CwY;
import X.C337180DJs;
import X.C418440Gaw;
import X.C427690Gpr;
import X.C438710HIf;
import X.C452501pT;
import X.C657990PrR;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.repo.UserContent;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.R;
import irm.AkS76S0100000_4;
import java.util.List;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: loaded from: classes19.dex */
public final class SearchProsConsUserContentPowerCell extends PowerCell<C329910CwX> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
    public final C01GW LL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1467));
    public final C166W LLILLJJLI = new C166W(new AwS597S0100000_18((PowerCell) this, 557));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchProsConsUserContentPowerCell.class, "binding", "getBinding()Lcom/ss/android/ugc/aweme/search/databinding/SearchProsConsReviewItemPowerCellBinding;", 0);
        C13LE.LIZ.getClass();
        LLILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.f2n;
    }

    public final C1202280hOM I5() {
        C166W c166w = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLL;
        return (C1202280hOM) c166w.LIZ(this);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C427690Gpr.LJ(this.itemView, 0.0f);
        C786410Ut5.I7(new AkS76S0100000_4(this, 4), this.itemView);
        C2211631BhB.LJ(this.itemView, new AwS588S0100000_9(this, 377));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String customVerify;
        String enterpriseVerifyReason;
        String str;
        C329910CwX c329910CwX = (C329910CwX) interfaceC1891350zJl;
        I5().LLILLL.setText(c329910CwX.LL);
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(c329910CwX.LLILLL));
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        c1331670kl3LJIIIIZZ.LJIIJJI = iLIZIZ;
        c1331670kl3LJIIIIZZ.LJIIL = iLIZIZ2;
        c1331670kl3LJIIIIZZ.LJJ(I5().LLILLJJLI);
        c1331670kl3LJIIIIZZ.LJIIJJI();
        I5().LLJ.setText(c329910CwX.LLILZ);
        User author = c329910CwX.LLILLJJLI.getAuthor();
        if (author != null) {
            customVerify = author.getCustomVerify();
        } else {
            customVerify = null;
        }
        User author2 = c329910CwX.LLILLJJLI.getAuthor();
        if (author2 != null) {
            enterpriseVerifyReason = author2.getEnterpriseVerifyReason();
        } else {
            enterpriseVerifyReason = null;
        }
        if (C1908030zkf.LIZLLL(new UserVerify(null, customVerify, enterpriseVerifyReason, -1))) {
            C337180DJs.LIZJ(I5().LLJILJIL);
        } else {
            C337180DJs.LIZ(I5().LLJILJIL);
        }
        TuxTextView tuxTextView = I5().LLJIJIL;
        int i = C329900CwW.LIZ[c329910CwX.LLILZIL.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    str = "";
                } else {
                    str = "From comments";
                }
            } else {
                str = "From posts";
            }
        } else {
            str = "From videos";
        }
        tuxTextView.setText(str);
        if (c329910CwX.LLJ != null) {
            C337180DJs.LIZJ(I5().LLILZIL);
            C1331670kl3 c1331670kl3LJIIIIZZ2 = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(c329910CwX.LLJ));
            if (c329910CwX.LLILZIL == UserContent.SourceType.VIDEO) {
                int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(54));
                int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72));
                c1331670kl3LJIIIIZZ2.LJIIJJI = iLIZIZ3;
                c1331670kl3LJIIIIZZ2.LJIIL = iLIZIZ4;
                C337180DJs.LIZJ(I5().LLJI);
                C657990PrR.LIZJ(I5().LLILZ, AnonymousClass0207.get$arr$(67));
            } else {
                C337180DJs.LIZIZ(I5().LLJI);
                int iLIZIZ5 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(54));
                int iLIZIZ6 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(54));
                c1331670kl3LJIIIIZZ2.LJIIJJI = iLIZIZ5;
                c1331670kl3LJIIIIZZ2.LJIIL = iLIZIZ6;
                C657990PrR.LIZJ(I5().LLILZ, AnonymousClass0207.get$arr$(68));
            }
            c1331670kl3LJIIIIZZ2.LJJ(I5().LLILZ);
            c1331670kl3LJIIIIZZ2.LJIIJJI();
        } else {
            C337180DJs.LIZ(I5().LLILZIL);
        }
        L5(c329910CwX.LLIZLLLIL, c329910CwX.LLIZ);
        boolean z = c329910CwX.LLILZLL;
        if (C301390Brd.LIZ()) {
            if (z) {
                C337180DJs.LIZJ(I5().LLJIJIL);
                C337180DJs.LIZJ(I5().LLIZ);
            } else {
                C337180DJs.LIZ(I5().LLJIJIL);
                C337180DJs.LIZ(I5().LLIZ);
            }
        }
    }

    public final void L5(long j, boolean z) {
        if (z) {
            I5().LLIZLLLIL.setIconRes(R.raw.icon_heart_fill);
            I5().LLIZLLLIL.setTintColorRes(R.attr.ob);
        } else {
            I5().LLIZLLLIL.setIconRes(R.raw.icon_heart);
            I5().LLIZLLLIL.setTintColorRes(R.attr.a1j);
        }
        I5().LLILZLL.setText(C1843500y4a.LIZIZ(j));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        C329920CwY c329920CwY;
        Object objLJJJLL = C13LP.LJJJLL(list);
        if ((objLJJJLL instanceof C329920CwY) && (c329920CwY = (C329920CwY) objLJJJLL) != null) {
            L5(c329920CwY.LIZIZ, c329920CwY.LIZ);
        } else {
            super.onBindItemView(interfaceC1891350zJl, list);
        }
    }
}
