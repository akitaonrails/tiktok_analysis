package kotlin.jvm.internal;

import X.C09AY;
import X.C1AJP;
import X.C21661919q5;
import X.C21679619sw;
import X.C21679719sx;
import X.C2173271A3p;
import X.C2177071AIf;
import X.C2177161AIo;
import X.InterfaceC21662119q7;
import X.ViewTreeObserverOnPreDrawListenerC337150DJp;
import Y.ARunnableS102S0200000_33;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.base.widget.StickerContainerWidget;
import com.ss.android.ugc.aweme.ecommerce.base.sku.powercells.salepropselection.SkuImageSpecPowerCell;
import com.ss.android.ugc.aweme.ecommerce.base.sku.powercells.salepropselection.SkuImageWithTextCell;
import com.ss.android.ugc.aweme.live.sfv.special.LiveSfvSwipeGalleryLayoutManager;
import com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeGalleryLayoutManager;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.profile.business.ur.socialavatar.review.BackgroundGalleryLayoutManager;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes34.dex */
public class AwS170S0101000_33 extends C09AY implements Function0 {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS170S0101000_33 awS170S0101000_33) {
        if (awS170S0101000_33.i1 == 0) {
            BackgroundGalleryLayoutManager backgroundGalleryLayoutManager = (BackgroundGalleryLayoutManager) awS170S0101000_33.l0;
            backgroundGalleryLayoutManager.LLJIJIL = new C21679619sw(backgroundGalleryLayoutManager);
            C21679619sw c21679619sw = ((BackgroundGalleryLayoutManager) awS170S0101000_33.l0).LLJIJIL;
            if (c21679619sw != null) {
                return c21679619sw;
            }
        } else {
            BackgroundGalleryLayoutManager backgroundGalleryLayoutManager2 = (BackgroundGalleryLayoutManager) awS170S0101000_33.l0;
            backgroundGalleryLayoutManager2.LLJILJIL = new C21679719sx(backgroundGalleryLayoutManager2);
            C21679719sx c21679719sx = ((BackgroundGalleryLayoutManager) awS170S0101000_33.l0).LLJILJIL;
            if (c21679719sx != null) {
                return c21679719sx;
            }
        }
        return null;
    }

    public static final Object invoke$1(AwS170S0101000_33 awS170S0101000_33) {
        InterfaceC21662119q7 interfaceC21662119q7 = ((C21661919q5) awS170S0101000_33.l0).LLJILJIL;
        if (interfaceC21662119q7 != null) {
            interfaceC21662119q7.LIZLLL(awS170S0101000_33.i1);
        }
        C21661919q5 c21661919q5 = (C21661919q5) awS170S0101000_33.l0;
        FrameLayout frameLayout = c21661919q5.LLJILJILJ.LIZJ;
        if (frameLayout == null) {
            frameLayout = null;
        }
        ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(frameLayout, new ARunnableS102S0200000_33(c21661919q5, frameLayout, 28));
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS170S0101000_33 awS170S0101000_33) {
        C2177071AIf c2177071AIf = (C2177071AIf) awS170S0101000_33.l0;
        return Integer.valueOf((int) (((((double) c2177071AIf.LJ) - 0.5d) * ((double) c2177071AIf.LIZJ)) - ((double) awS170S0101000_33.i1)));
    }

    public static final Object invoke$2(AwS170S0101000_33 awS170S0101000_33) {
        ((C2173271A3p) awS170S0101000_33.l0).LJII();
        ((C2173271A3p) awS170S0101000_33.l0).LJIIJJI(awS170S0101000_33.i1, false);
        return Boolean.TRUE;
    }

    public static final Object invoke$3(AwS170S0101000_33 awS170S0101000_33) {
        SkuImageSpecPowerCell skuImageSpecPowerCell = (SkuImageSpecPowerCell) awS170S0101000_33.l0;
        if (skuImageSpecPowerCell.LLJJIJI != awS170S0101000_33.i1) {
            skuImageSpecPowerCell.LLJJIJI = skuImageSpecPowerCell.LLJJIII;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS170S0101000_33 awS170S0101000_33) {
        SkuImageWithTextCell skuImageWithTextCell = (SkuImageWithTextCell) awS170S0101000_33.l0;
        if (skuImageWithTextCell.LLJJIJI != awS170S0101000_33.i1) {
            skuImageWithTextCell.LLJJIJI = skuImageWithTextCell.LLJJIII;
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS170S0101000_33 awS170S0101000_33) {
        if (awS170S0101000_33.i1 == 0) {
            LiveSfvSwipeGalleryLayoutManager liveSfvSwipeGalleryLayoutManager = (LiveSfvSwipeGalleryLayoutManager) awS170S0101000_33.l0;
            C21679619sw c21679619sw = liveSfvSwipeGalleryLayoutManager.LLJI;
            if (c21679619sw == null) {
                C21679619sw c21679619sw2 = new C21679619sw(liveSfvSwipeGalleryLayoutManager);
                ((LiveSfvSwipeGalleryLayoutManager) awS170S0101000_33.l0).LLJI = c21679619sw2;
                return c21679619sw2;
            }
            return c21679619sw;
        }
        LiveSfvSwipeGalleryLayoutManager liveSfvSwipeGalleryLayoutManager2 = (LiveSfvSwipeGalleryLayoutManager) awS170S0101000_33.l0;
        C21679719sx c21679719sx = liveSfvSwipeGalleryLayoutManager2.LLJIJIL;
        if (c21679719sx != null) {
            return c21679719sx;
        }
        C21679719sx c21679719sx2 = new C21679719sx(liveSfvSwipeGalleryLayoutManager2);
        ((LiveSfvSwipeGalleryLayoutManager) awS170S0101000_33.l0).LLJIJIL = c21679719sx2;
        return c21679719sx2;
    }

    public static final Object invoke$6(AwS170S0101000_33 awS170S0101000_33) {
        if (awS170S0101000_33.i1 == 0) {
            RecSwipeGalleryLayoutManager recSwipeGalleryLayoutManager = (RecSwipeGalleryLayoutManager) awS170S0101000_33.l0;
            recSwipeGalleryLayoutManager.LLJIJIL = new C21679619sw(recSwipeGalleryLayoutManager);
            C21679619sw c21679619sw = ((RecSwipeGalleryLayoutManager) awS170S0101000_33.l0).LLJIJIL;
            if (c21679619sw != null) {
                return c21679619sw;
            }
        } else {
            RecSwipeGalleryLayoutManager recSwipeGalleryLayoutManager2 = (RecSwipeGalleryLayoutManager) awS170S0101000_33.l0;
            recSwipeGalleryLayoutManager2.LLJILJIL = new C21679719sx(recSwipeGalleryLayoutManager2);
            C21679719sx c21679719sx = ((RecSwipeGalleryLayoutManager) awS170S0101000_33.l0).LLJILJIL;
            if (c21679719sx != null) {
                return c21679719sx;
            }
        }
        return null;
    }

    public static final Object invoke$7(AwS170S0101000_33 awS170S0101000_33) {
        StickerContainerWidget stickerContainerWidget = (StickerContainerWidget) awS170S0101000_33.l0;
        int[] iArr = stickerContainerWidget.LLILLJJLI;
        iArr[1] = awS170S0101000_33.i1;
        C1AJP c1ajp = stickerContainerWidget.LLILZ;
        if (c1ajp != null) {
            c1ajp.LLJJJJJIL = iArr;
            c1ajp.j0();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS170S0101000_33 awS170S0101000_33) {
        return Integer.valueOf(((C2177071AIf) awS170S0101000_33.l0).LIZJ + (awS170S0101000_33.i1 * 2));
    }

    public static final Object invoke$9(AwS170S0101000_33 awS170S0101000_33) {
        int i = awS170S0101000_33.i1 * 2;
        C2177071AIf c2177071AIf = (C2177071AIf) awS170S0101000_33.l0;
        int i2 = c2177071AIf.LIZJ;
        int iIntValue = i + i2 + ((int) (i2 * c2177071AIf.LJ * (((Number) c2177071AIf.LJIJJ.getValue()).intValue() - 1)));
        if (C2177161AIo.LIZ[((C2177071AIf) awS170S0101000_33.l0).LJIIIZ.ordinal()] == 1 && ((C2177071AIf) awS170S0101000_33.l0).LJIIJ() != 0) {
            int iIntValue2 = iIntValue - ((Number) ((C2177071AIf) awS170S0101000_33.l0).LJIIZILJ.getValue()).intValue();
            C2177071AIf c2177071AIf2 = (C2177071AIf) awS170S0101000_33.l0;
            iIntValue = iIntValue2 + c2177071AIf2.LJIILL + c2177071AIf2.LJIILJJIL;
        }
        return Integer.valueOf(iIntValue);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS170S0101000_33(LiveSfvSwipeGalleryLayoutManager liveSfvSwipeGalleryLayoutManager, int i) {
        super(0);
        this.$t = i;
        this.i1 = 0;
        this.l0 = liveSfvSwipeGalleryLayoutManager;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS170S0101000_33(RecSwipeGalleryLayoutManager recSwipeGalleryLayoutManager, int i) {
        super(0);
        this.$t = i;
        this.i1 = 0;
        this.l0 = recSwipeGalleryLayoutManager;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS170S0101000_33(BackgroundGalleryLayoutManager backgroundGalleryLayoutManager, int i) {
        super(0);
        this.$t = i;
        this.i1 = 0;
        this.l0 = backgroundGalleryLayoutManager;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS170S0101000_33(int r3, X.C2177071AIf r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            switch(r5) {
                case 8: goto Lf;
                case 9: goto L5;
                case 10: goto Lf;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.i1 = r3
            r1.l0 = r4
            r0 = 0
        Lb:
            r1.<init>(r0)
            return
        Lf:
            r1 = r2
            r1.l0 = r4
            r1.i1 = r3
            r0 = 0
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS170S0101000_33.<init>(int, X.1AIf, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS170S0101000_33(C21661919q5 c21661919q5, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c21661919q5;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS170S0101000_33(C2173271A3p c2173271A3p, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c2173271A3p;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS170S0101000_33(StickerContainerWidget stickerContainerWidget, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = stickerContainerWidget;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS170S0101000_33(SkuImageSpecPowerCell skuImageSpecPowerCell, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = skuImageSpecPowerCell;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS170S0101000_33(SkuImageWithTextCell skuImageWithTextCell, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = skuImageWithTextCell;
        this.i1 = i;
    }
}
