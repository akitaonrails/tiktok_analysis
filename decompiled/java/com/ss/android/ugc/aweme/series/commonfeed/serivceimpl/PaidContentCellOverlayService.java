package com.ss.android.ugc.aweme.series.commonfeed.serivceimpl;

import X.AbstractC1606710ruf;
import X.C04TD;
import X.C1612620s4C;
import X.C757070Tmr;
import X.InterfaceC1615720s9C;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.SeriesCategory;
import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.model.DramaExtraTrackingParams;
import com.ss.android.ugc.aweme.model.PurchaseOption;
import com.ss.android.ugc.aweme.model.UrlModel;
import com.ss.android.ugc.aweme.series.commonfeed.overlay.PaidContentOverlayV1;
import com.ss.android.ugc.aweme.service.IPaidContentCellOverlayService;
import com.ss.android.ugc.aweme.service.IPaidContentPanelAbility;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes25.dex */
public final class PaidContentCellOverlayService implements IPaidContentCellOverlayService {
    public static IPaidContentCellOverlayService LIZIZ() {
        Object objLIZ = C04TD.LIZ(IPaidContentCellOverlayService.class, false);
        if (objLIZ != null) {
            return (IPaidContentCellOverlayService) objLIZ;
        }
        if (C04TD.S3 == null) {
            synchronized (IPaidContentCellOverlayService.class) {
                if (C04TD.S3 == null) {
                    C04TD.S3 = new PaidContentCellOverlayService();
                }
            }
        }
        return C04TD.S3;
    }

    @Override // com.ss.android.ugc.aweme.service.IPaidContentCellOverlayService
    public final InterfaceC1615720s9C LIZ(int i, final BaseCellSlotComponent baseCellSlotComponent, boolean z) {
        if (z) {
            return new C1612620s4C(baseCellSlotComponent);
        }
        if (C757070Tmr.LIZ()) {
            return new AbstractC1606710ruf(baseCellSlotComponent) { // from class: X.0s4D
                public SmartImageView LLJI;
                public TuxTextView LLJIJIL;

                @Override // X.InterfaceC1615720s9C
                public final int LIZLLL() {
                    return R.layout.bhg;
                }

                @Override // X.AbstractC1606710ruf
                public final void LJIIIZ(boolean z2) {
                }

                @Override // X.InterfaceC1615720s9C
                public final void LIZIZ() {
                    String str;
                    C1612770s4R c1612770s4RG02;
                    String str2;
                    CollectionDetailModel collectionDetailModelZl0;
                    List<PurchaseOption> purchaseOption;
                    CollectionDetailModel collectionDetailModelZl02;
                    UrlModel urlModel;
                    List<String> urlList;
                    IPaidContentPanelAbility iPaidContentPanelAbilityLJIIIIZZ = LJIIIIZZ();
                    if (iPaidContentPanelAbilityLJIIIIZZ == null || (collectionDetailModelZl02 = iPaidContentPanelAbilityLJIIIIZZ.zl0()) == null || (urlModel = collectionDetailModelZl02.collectionCover) == null || (urlList = urlModel.getUrlList()) == null || (str = (String) C13LP.LJJJLL(urlList)) == null) {
                        str = "";
                    }
                    C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
                    c1331670kl3LJIIIZ.LJJ(this.LLJI);
                    C786410Ut5.h3(c1331670kl3LJIIIZ);
                    IPaidContentPanelAbility iPaidContentPanelAbilityLJIIIIZZ2 = LJIIIIZZ();
                    if (iPaidContentPanelAbilityLJIIIIZZ2 == null || (c1612770s4RG02 = iPaidContentPanelAbilityLJIIIIZZ2.g02()) == null) {
                        return;
                    }
                    C1612490s3z c1612490s3z = C1612490s3z.LJI;
                    IPaidContentPanelAbility iPaidContentPanelAbilityLJIIIIZZ3 = LJIIIIZZ();
                    CollectionDetailModel collectionDetailModelZl03 = iPaidContentPanelAbilityLJIIIIZZ3 != null ? iPaidContentPanelAbilityLJIIIIZZ3.zl0() : null;
                    Boolean boolValueOf = Boolean.valueOf(c1612770s4RG02.LIZ);
                    Boolean boolValueOf2 = Boolean.valueOf(c1612770s4RG02.LIZIZ);
                    Boolean boolValueOf3 = Boolean.valueOf(c1612770s4RG02.LIZJ);
                    Boolean boolValueOf4 = Boolean.valueOf(c1612770s4RG02.LIZLLL);
                    String str3 = c1612770s4RG02.LJ;
                    String key = c1612770s4RG02.LJFF.getKey();
                    Integer numValueOf = Integer.valueOf(c1612770s4RG02.LJI);
                    Boolean boolValueOf5 = Boolean.valueOf(c1612770s4RG02.LJII);
                    String str4 = c1612770s4RG02.LJIIIIZZ;
                    IPaidContentPanelAbility iPaidContentPanelAbilityLJIIIIZZ4 = LJIIIIZZ();
                    if (iPaidContentPanelAbilityLJIIIIZZ4 == null || (purchaseOption = iPaidContentPanelAbilityLJIIIIZZ4.getPurchaseOption()) == null || purchaseOption.isEmpty()) {
                        str2 = CardStruct.IStatusCode.DEFAULT;
                    } else {
                        Iterator<PurchaseOption> it2 = purchaseOption.iterator();
                        while (it2.hasNext()) {
                            if (it2.next().discountId != null) {
                                str2 = "1";
                                break;
                            }
                        }
                        str2 = CardStruct.IStatusCode.DEFAULT;
                    }
                    IPaidContentPanelAbility iPaidContentPanelAbilityLJIIIIZZ5 = LJIIIIZZ();
                    SeriesCategory seriesCategory = (iPaidContentPanelAbilityLJIIIIZZ5 == null || (collectionDetailModelZl0 = iPaidContentPanelAbilityLJIIIIZZ5.zl0()) == null) ? null : collectionDetailModelZl0.category;
                    C1612600s4A c1612600s4A = c1612770s4RG02.LJIIIZ;
                    Boolean bool = c1612770s4RG02.LJIIJ;
                    Boolean bool2 = c1612770s4RG02.LJIIJJI;
                    String str5 = c1612770s4RG02.LJIIL;
                    C1612570s47 c1612570s47 = c1612770s4RG02.LJIILIIL;
                    IPaidContentPanelAbility iPaidContentPanelAbilityLJIIIIZZ6 = LJIIIIZZ();
                    String seriesEnterEntrance = iPaidContentPanelAbilityLJIIIIZZ6 != null ? iPaidContentPanelAbilityLJIIIIZZ6.getSeriesEnterEntrance() : null;
                    DramaExtraTrackingParams dramaExtraTrackingParams = c1612770s4RG02.LJIILLIIL;
                    c1612490s3z.getClass();
                    C1612490s3z.LJJJLL(collectionDetailModelZl03, boolValueOf, boolValueOf2, boolValueOf3, boolValueOf4, str3, key, numValueOf, boolValueOf5, str4, str2, seriesCategory, c1612600s4A, bool, bool2, str5, c1612570s47, seriesEnterEntrance, "full", null, dramaExtraTrackingParams);
                }

                @Override // X.AbstractC1606710ruf, X.InterfaceC1615720s9C
                public final void onViewCreated(View view) {
                    ViewGroup.MarginLayoutParams marginLayoutParams;
                    ViewGroup.LayoutParams layoutParams;
                    ViewGroup.LayoutParams layoutParams2;
                    this.LLIZLLLIL = view;
                    this.LLJIJIL = (TuxTextView) view.findViewById(R.id.q03);
                    this.LLJI = (SmartImageView) view.findViewById(R.id.pzu);
                    if (C14LC.LJIIIZ) {
                        ((C20742216Eq) view.findViewById(R.id.pzy)).setGuidelinePercent(0.15f);
                        SmartImageView smartImageView = this.LLJI;
                        if (smartImageView != null && (layoutParams2 = smartImageView.getLayoutParams()) != null) {
                            layoutParams2.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(90));
                        }
                        SmartImageView smartImageView2 = this.LLJI;
                        if (smartImageView2 != null && (layoutParams = smartImageView2.getLayoutParams()) != null) {
                            layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(120));
                        }
                        TuxTextView tuxTextView = this.LLJIJIL;
                        ViewGroup.LayoutParams layoutParams3 = null;
                        if (tuxTextView != null) {
                            layoutParams3 = tuxTextView.getLayoutParams();
                        }
                        if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                            marginLayoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                        }
                    }
                }
            };
        }
        if (i != 0) {
            if (i != 1) {
                return new AbstractC1606710ruf(baseCellSlotComponent) { // from class: X.0r7j
                    public C197039127h LLJI;

                    @Override // X.InterfaceC1615720s9C
                    public final int LIZLLL() {
                        return R.layout.bhi;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:80:0x012a  */
                    @Override // X.InterfaceC1615720s9C
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LIZIZ() {
                        /*
                            Method dump skipped, instruction units count: 332
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C1576370r7j.LIZIZ():void");
                    }

                    @Override // X.AbstractC1606710ruf, X.InterfaceC1615720s9C
                    public final void LJFF() {
                        View view = this.LLIZLLLIL;
                        C339190DRl.LIZIZ(view != null ? view.findViewById(R.id.si7) : null);
                    }

                    @Override // X.AbstractC1606710ruf
                    public final void LJIIIZ(boolean z2) {
                        C197039127h c197039127h = this.LLJI;
                        if (c197039127h != null) {
                            c197039127h.setLoading(z2);
                        }
                        C197039127h c197039127h2 = this.LLJI;
                        if (c197039127h2 != null) {
                            c197039127h2.setClickable(!z2);
                        }
                    }
                };
            }
            return new PaidContentOverlayV1(baseCellSlotComponent);
        }
        return new AbstractC1606710ruf(baseCellSlotComponent) { // from class: X.0r7j
            public C197039127h LLJI;

            @Override // X.InterfaceC1615720s9C
            public final int LIZLLL() {
                return R.layout.bhi;
            }

            /* JADX WARN: Removed duplicated region for block: B:80:0x012a  */
            @Override // X.InterfaceC1615720s9C
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZIZ() {
                /*
                    Method dump skipped, instruction units count: 332
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1576370r7j.LIZIZ():void");
            }

            @Override // X.AbstractC1606710ruf, X.InterfaceC1615720s9C
            public final void LJFF() {
                View view = this.LLIZLLLIL;
                C339190DRl.LIZIZ(view != null ? view.findViewById(R.id.si7) : null);
            }

            @Override // X.AbstractC1606710ruf
            public final void LJIIIZ(boolean z2) {
                C197039127h c197039127h = this.LLJI;
                if (c197039127h != null) {
                    c197039127h.setLoading(z2);
                }
                C197039127h c197039127h2 = this.LLJI;
                if (c197039127h2 != null) {
                    c197039127h2.setClickable(!z2);
                }
            }
        };
    }
}
