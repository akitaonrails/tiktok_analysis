package com.ss.android.ugc.aweme.tako.otherpage.feed.mainentrance.ui;

import X.C019F;
import X.C0PEM;
import X.C0RJN;
import X.C1389300mG0;
import X.C13LE;
import X.C14T5;
import X.C1637806bA;
import X.C19719912Dl;
import X.C1DFH;
import X.C2107308Nj;
import X.C2189821An6;
import X.C2217381BqS;
import X.C23250099c;
import X.C709520RsM;
import X.C709600RsU;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C737910Sx3;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.tako.otherpage.feed.mainentrance.videmodel.TakoFeedRightBottomEntranceFixedViewModel;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class TakoRightBottomFixedEntrance extends AbsTakoRightBottomEntrance<TakoRightBottomFixedEntrance> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLII;
    public final InterfaceC1731706qJ LLLI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoRightBottomFixedEntrance.class, "fixedVM", "getFixedVM()Lcom/ss/android/ugc/aweme/tako/otherpage/feed/mainentrance/videmodel/TakoFeedRightBottomEntranceFixedViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLII = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public TakoRightBottomFixedEntrance() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoFeedRightBottomEntranceFixedViewModel.class);
        this.LLLI = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS555S0100000_11(c19719912DlLIZ, 952), null, AFwS243S0000000_11.get$arr$(491));
    }

    public final TakoFeedRightBottomEntranceFixedViewModel Gp() {
        return (TakoFeedRightBottomEntranceFixedViewModel) this.LLLI.getValue(this, LLLII[0]);
    }

    @Override // com.ss.android.ugc.aweme.tako.otherpage.feed.mainentrance.ui.AbsTakoRightBottomEntrance
    /* JADX INFO: renamed from: Ep */
    public final void up(VideoItemParams videoItemParams) {
        Bp().vQ2(C709520RsM.LIZ(videoItemParams.getAweme(), C1389300mG0.LJFF(jm().LIZIZ())));
    }

    @Override // com.ss.android.ugc.aweme.tako.otherpage.feed.mainentrance.ui.AbsTakoRightBottomEntrance, com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C709600RsU(this, null), 2);
    }

    @Override // com.ss.android.ugc.aweme.tako.otherpage.feed.mainentrance.ui.AbsTakoRightBottomEntrance, X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(VideoItemParams videoItemParams) {
        up(videoItemParams);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        Object obj;
        if (C709520RsM.LIZ(aweme, C1389300mG0.LJFF(jm().LIZIZ()))) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            C2189821An6 c2189821An6 = null;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            Aweme aweme2 = ((VideoItemParams) obj).getAweme();
            C0RJN c0rjnLIZIZ = jm().LIZIZ();
            if (c0rjnLIZIZ != null) {
                c2189821An6 = c0rjnLIZIZ.LIZJ;
            }
            C14T5.LIZIZ(aweme2, c2189821An6);
        }
    }
}
