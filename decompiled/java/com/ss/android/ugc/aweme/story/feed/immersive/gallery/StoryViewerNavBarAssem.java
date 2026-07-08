package com.ss.android.ugc.aweme.story.feed.immersive.gallery;

import X.C01D1;
import X.C0OM1;
import X.C0SEI;
import X.C1250250idj;
import X.C1308910kAL;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C285440BGs;
import X.C724750Sbp;
import X.C728910SiX;
import X.C730090SkR;
import X.C736680Sv4;
import X.C736820SvI;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.navigation.TuxNavBar;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS412S0200000_11;
import kotlin.jvm.internal.AwS447S0200000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryViewerNavBarAssem extends UIContentAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public final AssemVMLazy LLIZLLLIL;
    public TuxNavBar LLJ;
    public boolean LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(StoryViewerNavBarAssem.class, "viewListVM", "getViewListVM()Lcom/ss/android/ugc/aweme/story/feed/immersive/gallery/StoryViewerListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public StoryViewerNavBarAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(StoryViewerListViewModel.class);
        this.LLIZLLLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS555S0100000_11(c19719912DlLIZ, 887), AFwS243S0000000_11.get$arr$(462), null, true);
    }

    public final StoryViewerListViewModel Go() {
        AssemVMLazy assemVMLazy = this.LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJIJIL;
        return (StoryViewerListViewModel) assemVMLazy.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean Ho() {
        Aweme aweme;
        C728910SiX c728910SiX = ((C730090SkR) Go().getState()).LLILLJJLI;
        Long lValueOf = null;
        if (c728910SiX != null && (aweme = c728910SiX.LIZ) != null) {
            lValueOf = Long.valueOf(aweme.getCreateTime());
        }
        return C285440BGs.LIZ(lValueOf);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJ = (TuxNavBar) view.findViewById(R.id.p15);
        TuxNavBar tuxNavBar = this.LLJ;
        if (tuxNavBar != null) {
            C0OM1 c0om1 = new C0OM1();
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = view.getContext().getString(2131849017);
            c0om1.LIZJ = c1250250idj;
            tuxNavBar.setNavActions(c0om1);
        }
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.c3, view.getContext());
        if (numLIZJ != null) {
            int iIntValue = numLIZJ.intValue();
            TuxNavBar tuxNavBar2 = this.LLJ;
            if (tuxNavBar2 != null) {
                tuxNavBar2.setNavBackground(iIntValue);
            }
        }
        Context context = view.getContext();
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0SiZ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C730090SkR) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), new AwS447S0200000_11(this, context, 9), 4);
        C736680Sv4.LJIIIIZZ(this, Go(), new C2217381BqS() { // from class: X.0SiY
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C730090SkR) obj).LLILLJJLI;
            }
        }, null, new AwS447S0200000_11(this, context, 10), 6);
        AssemViewModel.asyncSubscribe$default(Go(), new C2217381BqS() { // from class: X.0Sid
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C730090SkR c730090SkR = (C730090SkR) obj;
                c730090SkR.getClass();
                return C627260Oiy.LIZLLL(c730090SkR);
            }
        }, null, null, new AwS412S0200000_11(this, context, 31), null, 22, null);
    }

    public final void Jo(Context context, long j, C0SEI c0sei) {
        int i;
        String quantityString;
        int i2;
        if (j <= 0) {
            if (Ho()) {
                i2 = c0sei.LJ;
            } else {
                i2 = c0sei.LIZIZ;
            }
            quantityString = context.getString(i2);
        } else {
            if (Ho()) {
                i = c0sei.LIZLLL;
            } else {
                i = c0sei.LIZ;
            }
            quantityString = context.getResources().getQuantityString(i, (int) j, Long.valueOf(j));
        }
        TuxNavBar tuxNavBar = this.LLJ;
        if (tuxNavBar != null) {
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = quantityString;
            tuxNavBar.LJIJJ(c1250250idj);
        }
    }
}
