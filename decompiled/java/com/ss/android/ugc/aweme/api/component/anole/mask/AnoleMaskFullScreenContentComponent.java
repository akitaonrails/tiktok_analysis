package com.ss.android.ugc.aweme.api.component.anole.mask;

import X.C01GW;
import X.C0RF0;
import X.C1049170dPP;
import X.C1056540dbI;
import X.C1837407Ho;
import X.C2188811AlT;
import X.C452501pT;
import X.C691740RBk;
import X.C692640REw;
import X.C693790RJh;
import X.C724270Sb3;
import X.C786410Ut5;
import X.EnumC696280RSw;
import X.InterfaceC1008930cMV;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.IAnoleManager;
import com.ss.android.ugc.aweme.api.IFeedService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS198S0000000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class AnoleMaskFullScreenContentComponent extends BaseCellSlotComponent<AnoleMaskFullScreenContentComponent> {
    public final C01GW LLJLLIL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(40));
    public Aweme LLJLLL;
    public C1049170dPP LLJZ;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.b_f;
    }

    public final InterfaceC1008930cMV Bp() {
        Aweme aweme;
        if (C692640REw.LIZ()) {
            aweme = this.LLJLLL;
        } else {
            C724270Sb3 c724270Sb3 = this.LLJI;
            aweme = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
        }
        if (!C1056540dbI.LIZJ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getFeedItemModule panel name = ");
            C0RF0 c0rf0 = jm().LIZLLL;
            sbLIZ.append(c0rf0 != null ? c0rf0.LJIIIZ : null);
            sbLIZ.append(",item.aweme = ");
            C724270Sb3 c724270Sb32 = this.LLJI;
            sbLIZ.append(((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme());
            C2188811AlT.LIZIZ(sbLIZ);
        } else if (C691740RBk.LIZ()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("getFeedItemModule panel name = ");
            C0RF0 c0rf02 = jm().LIZLLL;
            sbLIZ2.append(c0rf02 != null ? c0rf02.LJIIIZ : null);
            sbLIZ2.append(",item.aweme = ");
            C724270Sb3 c724270Sb33 = this.LLJI;
            sbLIZ2.append(((VideoItemParams) (c724270Sb33 != null ? c724270Sb33.LL : null)).getAweme());
            C2188811AlT.LIZIZ(sbLIZ2);
        }
        IFeedService iFeedService = (IFeedService) this.LLJLLIL.getValue();
        Context context = getContext();
        C0RF0 c0rf03 = jm().LIZLLL;
        return iFeedService.LIZJ(context, aweme, c0rf03 != null ? c0rf03.LJIIIZ : null, true);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void LJL() {
        C786410Ut5.LJLLLLLL(8, LJJIJL());
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        IAnoleManager iAnoleManagerRi;
        InterfaceC1008930cMV interfaceC1008930cMVBp = Bp();
        if (interfaceC1008930cMVBp != null && (iAnoleManagerRi = interfaceC1008930cMVBp.Ri()) != null) {
            iAnoleManagerRi.LJIIJJI(EnumC696280RSw.TT_FEED_MASK_FULL_SCREEN.getSlotName());
        }
        C1049170dPP c1049170dPP = this.LLJZ;
        if (c1049170dPP != null) {
            Aweme aweme = this.LLJLLL;
            C724270Sb3 c724270Sb3 = this.LLJI;
            c1049170dPP.LJJIIZI(aweme, ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme());
        }
        this.LLJLLL = null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        LJJIJL().setTag(EnumC696280RSw.TT_FEED_MASK_FULL_SCREEN.getSlotName());
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        C1049170dPP c1049170dPP;
        IAnoleManager iAnoleManagerRi;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        C1049170dPP c1049170dPP2;
        VideoItemParams videoItemParams2 = videoItemParams;
        Aweme aweme = this.LLJLLL;
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme)) {
            c1049170dPP = new C1049170dPP(EnumC696280RSw.TT_FEED_MASK_FULL_SCREEN.getSlotName(), aweme);
        } else {
            c1049170dPP = null;
        }
        this.LLJZ = c1049170dPP;
        if (C1837407Ho.LIZ()) {
            View viewLJJIJL = LJJIJL();
            if ((viewLJJIJL instanceof ViewGroup) && (viewGroup3 = (ViewGroup) viewLJJIJL) != null) {
                int childCount = viewGroup3.getChildCount();
                if (childCount > 0 && (c1049170dPP2 = this.LLJZ) != null) {
                    c1049170dPP2.LJJIIZ(childCount);
                }
                C786410Ut5.LJJJJI(viewGroup3);
            }
        }
        this.LLJLLL = videoItemParams2.getAweme();
        List<String> listLIZ = C693790RJh.LIZ(videoItemParams2.getAweme());
        EnumC696280RSw enumC696280RSw = EnumC696280RSw.TT_FEED_MASK_FULL_SCREEN;
        if (listLIZ.contains(enumC696280RSw.getSlotName()) && (LJJIJL() instanceof ViewGroup)) {
            View viewLJJIJL2 = LJJIJL();
            if ((viewLJJIJL2 instanceof ViewGroup) && (viewGroup2 = (ViewGroup) viewLJJIJL2) != null) {
                C786410Ut5.LJJJJI(viewGroup2);
            }
            InterfaceC1008930cMV interfaceC1008930cMVBp = Bp();
            if (interfaceC1008930cMVBp != null && (iAnoleManagerRi = interfaceC1008930cMVBp.Ri()) != null) {
                View viewLJJIJL3 = LJJIJL();
                if (viewLJJIJL3 instanceof ViewGroup) {
                    viewGroup = (ViewGroup) viewLJJIJL3;
                } else {
                    viewGroup = null;
                }
                iAnoleManagerRi.mount(viewGroup, enumC696280RSw.getSlotName(), null);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        C786410Ut5.LJLLLLLL(0, LJJIJL());
    }
}
