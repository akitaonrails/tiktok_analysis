package com.ss.android.ugc.aweme.api.component.anole.full;

import X.C01GW;
import X.C0RF0;
import X.C1017070cZd;
import X.C1017180cZo;
import X.C1049170dPP;
import X.C1056540dbI;
import X.C1697810uHb;
import X.C1837407Ho;
import X.C2188811AlT;
import X.C452501pT;
import X.C691740RBk;
import X.C692640REw;
import X.C693790RJh;
import X.C724270Sb3;
import X.C738850SyZ;
import X.C738870Syb;
import X.C786410Ut5;
import X.EnumC696280RSw;
import X.InterfaceC1008930cMV;
import X.InterfaceC1014340cVE;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.IAnoleManager;
import com.ss.android.ugc.aweme.api.IFeedService;
import com.ss.android.ugc.aweme.api.component.CommerceInteractionAbility;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentLayoutModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertInfo;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AwS555S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public final class AnoleFullAboveInteractionContentComponent extends BaseCellSlotComponent<AnoleFullAboveInteractionContentComponent> {
    public final C01GW LLJLLIL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(39));
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 56));
    public Aweme LLJZ;
    public C1049170dPP LLJZIJLIL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.b7c;
    }

    public final String Ep() {
        CardInsertInfo cardInsertInfo;
        Integer numValueOf;
        AwemeRawAd awemeRawAd;
        Aweme aweme = this.LLJZ;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && C1017180cZo.LJIL(awemeRawAd)) {
            return EnumC696280RSw.TT_FEED_MULTI_SHOW_CARD.getSlotName();
        }
        Aweme aweme2 = this.LLJZ;
        if (aweme2 != null && (cardInsertInfo = aweme2.getCardInsertInfo()) != null && (numValueOf = Integer.valueOf(cardInsertInfo.getCardType())) != null) {
            if (numValueOf.intValue() == 13) {
                return EnumC696280RSw.TT_FEED_MULTI_SHOW_CARD.getSlotName();
            }
            if (numValueOf.intValue() == 55) {
                return EnumC696280RSw.TT_FEED_PLAYABLE_CARD.getSlotName();
            }
        }
        return EnumC696280RSw.FEED_ANOLE_ABOVE_INTERACTIVE_SLOT.getSlotName();
    }

    public final InterfaceC1008930cMV Bp() {
        Aweme aweme;
        if (C692640REw.LIZ()) {
            aweme = this.LLJZ;
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
        IAnoleManager iAnoleManagerRi2;
        InterfaceC1008930cMV interfaceC1008930cMVBp = Bp();
        if (interfaceC1008930cMVBp != null && (iAnoleManagerRi2 = interfaceC1008930cMVBp.Ri()) != null) {
            iAnoleManagerRi2.LJIIJJI(Ep());
        }
        InterfaceC1008930cMV interfaceC1008930cMVBp2 = Bp();
        if (interfaceC1008930cMVBp2 != null && (iAnoleManagerRi = interfaceC1008930cMVBp2.Ri()) != null) {
            iAnoleManagerRi.LJIIJJI(EnumC696280RSw.TT_FEED_ABOVE_INTERACTION_3D_FOREGROUND.getSlotName());
        }
        C1049170dPP c1049170dPP = this.LLJZIJLIL;
        if (c1049170dPP != null) {
            Aweme aweme = this.LLJZ;
            C724270Sb3 c724270Sb3 = this.LLJI;
            c1049170dPP.LJJIIZI(aweme, ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme());
        }
        this.LLJZ = null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        LJJIJL().setTag(Ep());
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        C1049170dPP c1049170dPP;
        IAnoleManager iAnoleManagerRi;
        IAnoleManager iAnoleManagerRi2;
        ViewGroup viewGroup;
        C1049170dPP c1049170dPP2;
        VideoItemParams videoItemParams2 = videoItemParams;
        Aweme aweme = videoItemParams2.getAweme();
        ViewGroup viewGroup2 = null;
        if (!AwemeExtKt.isAdTraffic(aweme)) {
            aweme = null;
        }
        if (aweme != null) {
            c1049170dPP = new C1049170dPP(Ep(), aweme);
        } else {
            c1049170dPP = null;
        }
        this.LLJZIJLIL = c1049170dPP;
        if (C1837407Ho.LIZ()) {
            View viewLJJIJL = LJJIJL();
            if ((viewLJJIJL instanceof ViewGroup) && (viewGroup = (ViewGroup) viewLJJIJL) != null) {
                Iterable c738870Syb = new C738870Syb(viewGroup, 1);
                if (!(c738870Syb instanceof Collection) || !((Collection) c738870Syb).isEmpty()) {
                    Iterator it2 = c738870Syb.iterator();
                    int i = 0;
                    while (true) {
                        C738850SyZ c738850SyZ = (C738850SyZ) it2;
                        if (c738850SyZ.hasNext()) {
                            if (((View) c738850SyZ.next()).getId() != R.id.ym1 && (i = i + 1) < 0) {
                                C1697810uHb.LJIJ();
                                throw null;
                            }
                        } else if (i > 0 && (c1049170dPP2 = this.LLJZIJLIL) != null) {
                            c1049170dPP2.LJJIIZ(i);
                        }
                    }
                }
                C786410Ut5.LJJJJI(viewGroup);
            }
        }
        this.LLJZ = videoItemParams2.getAweme();
        if ((C693790RJh.LIZ(videoItemParams2.getAweme()).contains(Ep()) || C693790RJh.LIZIZ(videoItemParams2.getAweme()).contains(Ep())) && (LJJIJL() instanceof ViewGroup)) {
            View viewLJJIJL2 = LJJIJL();
            if (viewLJJIJL2 instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) viewLJJIJL2;
            }
            if (C692640REw.LIZ() && viewGroup2 != null) {
                C786410Ut5.LJJJJI(viewGroup2);
            }
            final ViewGroup viewGroup3 = (ViewGroup) LJJIJL();
            final String strEp = Ep();
            InterfaceC1008930cMV interfaceC1008930cMVBp = Bp();
            if (interfaceC1008930cMVBp != null && (iAnoleManagerRi = interfaceC1008930cMVBp.Ri()) != null) {
                iAnoleManagerRi.mount(viewGroup3, strEp, new InterfaceC1014340cVE() { // from class: X.0REu
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
                    public final void LJI(String str, Integer num, Integer num2, Integer num3, Integer num4) {
                    }

                    @Override // X.InterfaceC1014340cVE
                    public final void LJII() {
                    }

                    @Override // X.InterfaceC1014340cVE
                    public final void LJJJIL() {
                    }

                    @Override // X.InterfaceC1014340cVE
                    public final void LJFF(boolean z) {
                        if (z) {
                            if (viewGroup3.getVisibility() == 0) {
                                viewGroup3.setTag(R.id.b62, 0);
                            }
                            C786410Ut5.LJLZ(8, viewGroup3);
                        } else {
                            Object tag = viewGroup3.getTag(R.id.b62);
                            if (tag != null) {
                                C786410Ut5.LJLZ(((Integer) tag).intValue(), viewGroup3);
                            }
                            viewGroup3.setTag(R.id.b62, null);
                        }
                    }

                    @Override // X.InterfaceC1014340cVE
                    public final void LJ(String str, View view, AnoleComponentLayoutModel anoleComponentLayoutModel) {
                        CommerceInteractionAbility commerceInteractionAbility = (CommerceInteractionAbility) this.LLJLLL.getValue();
                        if (commerceInteractionAbility != null) {
                            commerceInteractionAbility.sQ(strEp, str, view, anoleComponentLayoutModel);
                        }
                    }
                });
            }
        }
        Aweme aweme2 = videoItemParams2.getAweme();
        if (C1017070cZd.LJJJLL(aweme2)) {
            List<String> listLIZ = C693790RJh.LIZ(aweme2);
            EnumC696280RSw enumC696280RSw = EnumC696280RSw.TT_FEED_ABOVE_INTERACTION_3D_FOREGROUND;
            if (listLIZ.contains(enumC696280RSw.getSlotName()) && (LJJIJL() instanceof ViewGroup)) {
                final ViewGroup viewGroup4 = (ViewGroup) LJJIJL();
                final String slotName = enumC696280RSw.getSlotName();
                InterfaceC1008930cMV interfaceC1008930cMVBp2 = Bp();
                if (interfaceC1008930cMVBp2 != null && (iAnoleManagerRi2 = interfaceC1008930cMVBp2.Ri()) != null) {
                    iAnoleManagerRi2.mount(viewGroup4, slotName, new InterfaceC1014340cVE() { // from class: X.0REu
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
                        public final void LJI(String str, Integer num, Integer num2, Integer num3, Integer num4) {
                        }

                        @Override // X.InterfaceC1014340cVE
                        public final void LJII() {
                        }

                        @Override // X.InterfaceC1014340cVE
                        public final void LJJJIL() {
                        }

                        @Override // X.InterfaceC1014340cVE
                        public final void LJFF(boolean z) {
                            if (z) {
                                if (viewGroup4.getVisibility() == 0) {
                                    viewGroup4.setTag(R.id.b62, 0);
                                }
                                C786410Ut5.LJLZ(8, viewGroup4);
                            } else {
                                Object tag = viewGroup4.getTag(R.id.b62);
                                if (tag != null) {
                                    C786410Ut5.LJLZ(((Integer) tag).intValue(), viewGroup4);
                                }
                                viewGroup4.setTag(R.id.b62, null);
                            }
                        }

                        @Override // X.InterfaceC1014340cVE
                        public final void LJ(String str, View view, AnoleComponentLayoutModel anoleComponentLayoutModel) {
                            CommerceInteractionAbility commerceInteractionAbility = (CommerceInteractionAbility) this.LLJLLL.getValue();
                            if (commerceInteractionAbility != null) {
                                commerceInteractionAbility.sQ(slotName, str, view, anoleComponentLayoutModel);
                            }
                        }
                    });
                }
            }
        }
    }
}
