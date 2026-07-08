package com.ss.android.ugc.aweme.story.feed.immersive.gallery;

import X.C01D1;
import X.C01GW;
import X.C1308910kAL;
import X.C13LE;
import X.C1559260qg8;
import X.C1637806bA;
import X.C1722300uv6;
import X.C1749280vcc;
import X.C19719912Dl;
import X.C20684815ws;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C419910GdJ;
import X.C452501pT;
import X.C723580SZw;
import X.C724750Sbp;
import X.C728960Sic;
import X.C729050Sil;
import X.C729220Sj2;
import X.C729510SjV;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.AwS625S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryViewerListStatusAssem extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJIL;
    public C1749280vcc LLJJI;
    public TuxSpinner LLJJIII;
    public View LLJJIJI;
    public final C1559260qg8 LLJJIJIIJIL = new C1559260qg8(new C723580SZw(this, C729050Sil.class, "STORY_VIEWER_LIST_HIERARCHY_DATA"), checkSupervisorPrepared());
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 885));
    public final AssemVMLazy LLJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(StoryViewerListStatusAssem.class, "viewListVM", "getViewListVM()Lcom/ss/android/ugc/aweme/story/feed/immersive/gallery/StoryViewerListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public StoryViewerListStatusAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(StoryViewerListViewModel.class);
        this.LLJJJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS555S0100000_11(c19719912DlLIZ, 886), AFwS243S0000000_11.get$arr$(460), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.fdk;
    }

    public final StoryViewerListViewModel hp() {
        AssemVMLazy assemVMLazy = this.LLJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJJIL;
        return (StoryViewerListViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C729220Sj2.LL.LJIIL("StoryViewerListStatusAssem");
    }

    public final void ip(boolean z) {
        if (z) {
            C1749280vcc c1749280vcc = this.LLJJI;
            if (c1749280vcc != null) {
                C786410Ut5.LLLZLZ(c1749280vcc, 0);
            }
            kp(false);
            return;
        }
        C1749280vcc c1749280vcc2 = this.LLJJI;
        if (c1749280vcc2 == null) {
            return;
        }
        C786410Ut5.LLLZLZ(c1749280vcc2, 8);
    }

    public final void kp(boolean z) {
        if (z) {
            View view = this.LLJJIJI;
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
            }
            TuxSpinner tuxSpinner = this.LLJJIII;
            if (tuxSpinner != null) {
                C786410Ut5.LLZILL(tuxSpinner, 0);
                return;
            }
            return;
        }
        View view2 = this.LLJJIJI;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(8, view2);
        }
        TuxSpinner tuxSpinner2 = this.LLJJIII;
        if (tuxSpinner2 == null) {
            return;
        }
        C786410Ut5.LLZILL(tuxSpinner2, 8);
    }

    public final void lp(Aweme aweme) {
        int i;
        C1749280vcc c1749280vcc = this.LLJJI;
        if (c1749280vcc == null) {
            return;
        }
        ip(true);
        if (C729510SjV.LJJIJIL(aweme)) {
            i = 2131849018;
        } else {
            i = 2131858137;
        }
        C1722300uv6 c1722300uv6 = new C1722300uv6();
        c1722300uv6.LJI = LJJIJL().getContext().getString(i);
        c1722300uv6.LJIIIIZZ = LJJIJL().getContext().getString(2131849021);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_large_no_video;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1p);
        c1722300uv6.LIZJ = 0;
        c1722300uv6.LIZIZ = c419910GdJ;
        c1722300uv6.LJIIIZ = new AwS585S0100000_6(aweme, 294);
        c1749280vcc.setStatus(c1722300uv6);
        c1749280vcc.setLayoutVariant(0);
        C20684815ws.LJIILLIIL("story_removed_hint_page_show", new C2344009Gk().LIZ);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Context context;
        Integer numLIZJ;
        super.onViewCreated(view);
        this.LLJJI = (C1749280vcc) view.findViewById(R.id.w28);
        this.LLJJIJI = view.findViewById(R.id.upload_ll);
        this.LLJJIII = (TuxSpinner) view.findViewById(R.id.upload_spinner);
        AssemViewModel.asyncSubscribe$default(hp(), new C2217381BqS() { // from class: X.0Skv
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                C730090SkR c730090SkR = (C730090SkR) obj;
                c730090SkR.getClass();
                return C627260Oiy.LIZLLL(c730090SkR);
            }
        }, null, new AwS377S0200000_11(this, view, 61), new AwS555S0100000_11(this, 884), new AwS590S0100000_11(this, 248), 2, null);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0Ske
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C730090SkR) obj).LLILLJJLI;
            }
        }, null, new AwS625S0100000_11(this, 70), 6);
        C729220Sj2.LL.LJII("StoryViewerListStatusAssem", (C728960Sic) this.LLJJIJIL.getValue());
        C729050Sil c729050Sil = (C729050Sil) this.LLJJIJIIJIL.getValue();
        if (c729050Sil != null && c729050Sil.LL && (context = getContext()) != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.bx, context)) != null) {
            int iIntValue = numLIZJ.intValue();
            C1749280vcc c1749280vcc = this.LLJJI;
            if (c1749280vcc != null) {
                c1749280vcc.setBackgroundColor(iIntValue);
            }
        }
    }
}
