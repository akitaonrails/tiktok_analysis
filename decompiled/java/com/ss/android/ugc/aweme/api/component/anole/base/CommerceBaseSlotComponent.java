package com.ss.android.ugc.aweme.api.component.anole.base;

import X.C01GW;
import X.C0RF0;
import X.C1013700cUC;
import X.C1049170dPP;
import X.C1049180dPQ;
import X.C2188811AlT;
import X.C452501pT;
import X.C692640REw;
import X.C724270Sb3;
import X.C786410Ut5;
import X.InterfaceC1008930cMV;
import X.InterfaceC1014340cVE;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.IAnoleManager;
import com.ss.android.ugc.aweme.ad.feed.bottombar.UnderWaterBottomBannerAssem;
import com.ss.android.ugc.aweme.api.IFeedService;
import com.ss.android.ugc.aweme.api.component.anole.base.CommerceBaseSlotComponent;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentLayoutModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS124S0101000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public abstract class CommerceBaseSlotComponent extends BaseCellSlotComponent<CommerceBaseSlotComponent> {
    public final C01GW LLJLLIL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(38));
    public View LLJLLL;
    public boolean LLJZ;
    public Aweme LLJZIJLIL;
    public C1049170dPP LLL;

    public final void Ep() {
        IAnoleManager iAnoleManagerRi;
        this.LLJZ = false;
        InterfaceC1008930cMV interfaceC1008930cMVFp = Fp();
        if (interfaceC1008930cMVFp != null && (iAnoleManagerRi = interfaceC1008930cMVFp.Ri()) != null) {
            iAnoleManagerRi.LJIIJJI(Gp());
        }
        C1049170dPP c1049170dPP = this.LLL;
        if (c1049170dPP != null) {
            Aweme aweme = this.LLJZIJLIL;
            C724270Sb3 c724270Sb3 = this.LLJI;
            c1049170dPP.LJJIIZI(aweme, ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme());
        }
    }

    public abstract String Gp();

    public abstract int Ip();

    public void sQ(String str, String str2, View view, AnoleComponentLayoutModel anoleComponentLayoutModel) {
    }

    public final void Bp() {
        IAnoleManager iAnoleManagerRi;
        View view = this.LLJLLL;
        if (!(view instanceof ViewGroup) || this.LLJZ) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        Aweme aweme = this.LLJZIJLIL;
        C1049170dPP c1049170dPP = aweme != null ? new C1049170dPP(Gp(), aweme) : null;
        this.LLL = c1049170dPP;
        if (c1049170dPP != null) {
            int childCount = viewGroup != null ? viewGroup.getChildCount() : -1;
            C1049180dPQ.LIZ.getClass();
            c1049170dPP.logAd(C1049180dPQ.LIZJ, new AwS124S0101000_16(c1049170dPP, childCount, 2));
        }
        C1013700cUC.LIZIZ(viewGroup, this.LLJZIJLIL, Gp());
        if (C692640REw.LIZ() && viewGroup != null) {
            C786410Ut5.LJJJJI(viewGroup);
        }
        this.LLJZ = true;
        InterfaceC1008930cMV interfaceC1008930cMVFp = Fp();
        if (interfaceC1008930cMVFp == null || (iAnoleManagerRi = interfaceC1008930cMVFp.Ri()) == null) {
            return;
        }
        iAnoleManagerRi.mount((ViewGroup) this.LLJLLL, Gp(), new InterfaceC1014340cVE() { // from class: X.0REh
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
            public final void LJII() {
            }

            @Override // X.InterfaceC1014340cVE
            public final void LJJJIL() {
            }

            @Override // X.InterfaceC1014340cVE
            public final void LJ(String str, View view2, AnoleComponentLayoutModel anoleComponentLayoutModel) {
                CommerceBaseSlotComponent commerceBaseSlotComponent = this.LIZ;
                commerceBaseSlotComponent.sQ(commerceBaseSlotComponent.Gp(), str, view2, anoleComponentLayoutModel);
            }

            @Override // X.InterfaceC1014340cVE
            public final void LJI(String str, Integer num, Integer num2, Integer num3, Integer num4) {
                if (!Intrinsics.LJFF(str, this.LIZ.Gp())) {
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("changeContainerLayout slotID = ");
                sbLIZ.append(str);
                C2188811AlT.LIZIZ(sbLIZ);
                View viewLJJIJL = this.LIZ.LJJIJL();
                ViewGroup.LayoutParams layoutParams = viewLJJIJL.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    if (num != null) {
                        marginLayoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(num.intValue()))));
                    }
                    if (num2 != null) {
                        marginLayoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(num2.intValue()))));
                    }
                    if (num3 != null) {
                        marginLayoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(num3.intValue())));
                    }
                    if (num4 != null) {
                        marginLayoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(num4.intValue())));
                    }
                    C786410Ut5.W5(viewLJJIJL, marginLayoutParams);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        });
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public void unBind() {
        if (!(this instanceof UnderWaterBottomBannerAssem)) {
            Ep();
        }
        this.LLJZIJLIL = null;
    }

    public final InterfaceC1008930cMV Fp() {
        Aweme aweme;
        if (C692640REw.LIZ()) {
            aweme = this.LLJZIJLIL;
        } else {
            C724270Sb3 c724270Sb3 = this.LLJI;
            aweme = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getFeedItemModule panel name = ");
        C0RF0 c0rf0 = jm().LIZLLL;
        sbLIZ.append(c0rf0 != null ? c0rf0.LJIIIZ : null);
        sbLIZ.append(",item.aweme = ");
        C724270Sb3 c724270Sb32 = this.LLJI;
        sbLIZ.append(((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme());
        C2188811AlT.LIZIZ(sbLIZ);
        IFeedService iFeedService = (IFeedService) this.LLJLLIL.getValue();
        Context context = getContext();
        C0RF0 c0rf02 = jm().LIZLLL;
        return iFeedService.LIZJ(context, aweme, c0rf02 != null ? c0rf02.LJIIIZ : null, true);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public void Eo(View view) {
        Object obj;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        this.LLJZIJLIL = ((VideoItemParams) obj).getAweme();
        View viewFindViewById = LJJIJL().findViewById(Ip());
        this.LLJLLL = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setTag(Gp());
        }
        if (!(this instanceof UnderWaterBottomBannerAssem)) {
            Bp();
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: Jp, reason: merged with bridge method [inline-methods] */
    public void up(VideoItemParams videoItemParams) {
        this.LLJZIJLIL = videoItemParams.getAweme();
        if (!(this instanceof UnderWaterBottomBannerAssem)) {
            Bp();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        super.onViewCreated(view);
    }
}
