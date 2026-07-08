package com.ss.android.ugc.aweme.api.component.anole.base;

import X.C01GW;
import X.C0RF0;
import X.C1013700cUC;
import X.C1049170dPP;
import X.C1049180dPQ;
import X.C1837407Ho;
import X.C452501pT;
import X.C692540REm;
import X.C693790RJh;
import X.C724270Sb3;
import X.C786410Ut5;
import X.InterfaceC1008930cMV;
import X.InterfaceC1014340cVE;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.IAnoleManager;
import com.ss.android.ugc.aweme.api.IFeedService;
import com.ss.android.ugc.aweme.api.component.anole.base.CommerceBaseContentComponent;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentLayoutModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent;
import kotlin.jvm.internal.AwS124S0101000_16;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes12.dex */
public abstract class CommerceBaseContentComponent extends BaseCellContentComponent<CommerceBaseContentComponent> {
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(new C692540REm());
    public Aweme LLJJL;
    public C1049170dPP LLJJLIIIJLLLLLLLZ;

    public abstract String hp();

    public void sQ(String str, String str2, View view, AnoleComponentLayoutModel anoleComponentLayoutModel) {
    }

    static {
        new Object() { // from class: X.0REo
        };
    }

    private final InterfaceC1008930cMV ep() {
        IFeedService iFeedService = (IFeedService) this.LLJJJJLIIL.getValue();
        Context context = getContext();
        C0RF0 c0rf0 = jm().LIZLLL;
        return iFeedService.LIZJ(context, this.LLJJL, c0rf0 != null ? c0rf0.LJIIIZ : null, true);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellContentComponent, X.InterfaceC712990Rxx
    public final void unBind() {
        IAnoleManager iAnoleManagerRi;
        if (a0.LJJJIL(hp()) ? false : C693790RJh.LIZ(this.LLJJL).contains(hp())) {
            InterfaceC1008930cMV interfaceC1008930cMVEp = ep();
            if (interfaceC1008930cMVEp != null && (iAnoleManagerRi = interfaceC1008930cMVEp.Ri()) != null) {
                iAnoleManagerRi.LJIIJJI(hp());
            }
            C1049170dPP c1049170dPP = this.LLJJLIIIJLLLLLLLZ;
            if (c1049170dPP != null) {
                Aweme aweme = this.LLJJL;
                C724270Sb3 c724270Sb3 = this.LLJI;
                c1049170dPP.LJJIIZI(aweme, ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme());
            }
        }
        this.LLJJL = null;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        C1049170dPP c1049170dPP;
        IAnoleManager iAnoleManagerRi;
        int childCount;
        ViewGroup viewGroup;
        C1049170dPP c1049170dPP2;
        VideoItemParams videoItemParams2 = videoItemParams;
        Aweme aweme = videoItemParams2.getAweme();
        ViewGroup viewGroup2 = null;
        if (!AwemeExtKt.isAdTraffic(aweme)) {
            aweme = null;
        }
        if (aweme != null) {
            c1049170dPP = new C1049170dPP(hp(), aweme);
        } else {
            c1049170dPP = null;
        }
        this.LLJJLIIIJLLLLLLLZ = c1049170dPP;
        if (C1837407Ho.LIZ()) {
            View viewLJJIJL = LJJIJL();
            if ((viewLJJIJL instanceof ViewGroup) && (viewGroup = (ViewGroup) viewLJJIJL) != null) {
                int childCount2 = viewGroup.getChildCount();
                if (childCount2 > 0 && (c1049170dPP2 = this.LLJJLIIIJLLLLLLLZ) != null) {
                    c1049170dPP2.LJJIIZ(childCount2);
                }
                C786410Ut5.LJJJJI(viewGroup);
            }
        }
        this.LLJJL = videoItemParams2.getAweme();
        if (!a0.LJJJIL(hp()) && C693790RJh.LIZ(this.LLJJL).contains(hp())) {
            View viewLJJIJL2 = LJJIJL();
            if (viewLJJIJL2 instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) viewLJJIJL2;
            }
            C1049170dPP c1049170dPP3 = this.LLJJLIIIJLLLLLLLZ;
            if (c1049170dPP3 != null) {
                if (viewGroup2 != null) {
                    childCount = viewGroup2.getChildCount();
                } else {
                    childCount = -1;
                }
                C1049180dPQ.LIZ.getClass();
                c1049170dPP3.logAd(C1049180dPQ.LIZJ, new AwS124S0101000_16(c1049170dPP3, childCount, 2));
            }
            C1013700cUC.LIZIZ(viewGroup2, this.LLJJL, hp());
            if (viewGroup2 != null) {
                C786410Ut5.LJJJJI(viewGroup2);
            }
            InterfaceC1008930cMV interfaceC1008930cMVEp = ep();
            if (interfaceC1008930cMVEp != null && (iAnoleManagerRi = interfaceC1008930cMVEp.Ri()) != null) {
                iAnoleManagerRi.mount(viewGroup2, hp(), new InterfaceC1014340cVE() { // from class: X.0REn
                    @Override // X.InterfaceC1014340cVE
                    public final void LIZIZ() {
                    }

                    @Override // X.InterfaceC1014340cVE
                    public final void LIZJ() {
                    }

                    @Override // X.InterfaceC1014340cVE
                    public final void LIZLLL(boolean z) {
                    }

                    @Override // X.InterfaceC1014340cVE
                    public final void LJFF(boolean z) {
                    }

                    @Override // X.InterfaceC1014340cVE
                    public final void LJI(String str, Integer num, Integer num2, Integer num3, Integer num4) {
                    }

                    @Override // X.InterfaceC1014340cVE
                    public final void LJII() {
                    }

                    @Override // X.InterfaceC1014340cVE
                    public final void LJJJIL() {
                    }

                    @Override // X.InterfaceC1014340cVE
                    public final void LJ(String str, View view, AnoleComponentLayoutModel anoleComponentLayoutModel) {
                        CommerceBaseContentComponent commerceBaseContentComponent = this.LIZ;
                        commerceBaseContentComponent.sQ(commerceBaseContentComponent.hp(), str, view, anoleComponentLayoutModel);
                    }
                });
            }
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
    }
}
