package kotlin.jvm.internal;

import X.AbstractC738140SxQ;
import X.AnonymousClass0956;
import X.C09AY;
import X.C0PEM;
import X.C1143850fs7;
import X.C1569450qwZ;
import X.C16F5;
import X.C1954807lC;
import X.C1A12;
import X.C1A14;
import X.C1A15;
import X.C1DFH;
import X.C2107308Nj;
import X.C500260Jjc;
import X.C786410Ut5;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.legal.LegalAssem;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.album.AlbumPreviewFragment;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.model.EcPhotoSearchAlbumVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import webcast.data.TPText;

/* JADX INFO: loaded from: classes34.dex */
public class AwS160S0110000_33 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS160S0110000_33(LegalAssem legalAssem, boolean z, int i) {
        super(2);
        this.$t = i;
        this.l0 = legalAssem;
        this.z1 = z;
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS160S0110000_33 awS160S0110000_33, Object obj, Object obj2) {
        AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) obj;
        C1A12 c1a12 = ((LegalAssem) awS160S0110000_33.l0).Oo().getState().LLILLJJLI;
        C500260Jjc.LJIILIIL((View) ((LegalAssem) awS160S0110000_33.l0).LLJILJILJ.getValue());
        int i = 0;
        SpannableStringBuilder spannableStringBuilderLIZLLL = null;
        switch (C1A15.LIZ[((C1A14) obj2).ordinal()]) {
            case 1:
                AnonymousClass0956 anonymousClass0956 = ((LegalAssem) awS160S0110000_33.l0).LLJ;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                C500260Jjc.LJIILIIL(((LegalAssem) awS160S0110000_33.l0).Jo());
                C500260Jjc.LJIILIIL(((LegalAssem) awS160S0110000_33.l0).Lo());
                break;
            case 2:
            case 3:
                AnonymousClass0956 anonymousClass09562 = ((LegalAssem) awS160S0110000_33.l0).LLJ;
                if (anonymousClass09562 != null) {
                    anonymousClass09562.LIZIZ(null);
                }
                LiveIconView liveIconViewLo = ((LegalAssem) awS160S0110000_33.l0).Lo();
                C786410Ut5.Db(liveIconViewLo, 180.0f);
                C786410Ut5.LLJJIJIL(liveIconViewLo, 0);
                ((LegalAssem) awS160S0110000_33.l0).Vo(c1a12);
                LegalAssem legalAssem = (LegalAssem) awS160S0110000_33.l0;
                if (legalAssem.LLJILLL) {
                    AnonymousClass0956 anonymousClass09563 = legalAssem.LLJ;
                    if (anonymousClass09563 != null) {
                        anonymousClass09563.LIZIZ(null);
                    }
                    LegalAssem legalAssem2 = (LegalAssem) awS160S0110000_33.l0;
                    C1DFH c1dfh = C0PEM.LIZ;
                    legalAssem2.LLJ = C500260Jjc.LJJJJJ(abstractC738140SxQ, C2107308Nj.LIZ, new C1569450qwZ(legalAssem2, null), 2);
                    ((LegalAssem) awS160S0110000_33.l0).Oo().yQ2();
                    ((LegalAssem) awS160S0110000_33.l0).LLJILLL = false;
                }
                break;
            case 4:
                AnonymousClass0956 anonymousClass09564 = ((LegalAssem) awS160S0110000_33.l0).LLJ;
                if (anonymousClass09564 != null) {
                    anonymousClass09564.LIZIZ(null);
                }
                LiveIconView liveIconViewLo2 = ((LegalAssem) awS160S0110000_33.l0).Lo();
                C786410Ut5.Db(liveIconViewLo2, 180.0f);
                C786410Ut5.LLJJIJIL(liveIconViewLo2, 0);
                ((LegalAssem) awS160S0110000_33.l0).ap(c1a12.LIZIZ, 2, C1A14.FOLD, c1a12);
                break;
            case 5:
                LiveIconView liveIconViewLo3 = ((LegalAssem) awS160S0110000_33.l0).Lo();
                C786410Ut5.Db(liveIconViewLo3, 0.0f);
                C786410Ut5.LLJJIJIL(liveIconViewLo3, 0);
                View view = (View) ((LegalAssem) awS160S0110000_33.l0).LLJILJILJ.getValue();
                if (awS160S0110000_33.z1) {
                    i = 8;
                }
                C786410Ut5.LJLLLLLL(i, view);
                LegalAssem legalAssem3 = (LegalAssem) awS160S0110000_33.l0;
                legalAssem3.Jo().setMaxLines(Integer.MAX_VALUE);
                legalAssem3.So(legalAssem3.Jo().getLineHeight() * 2);
                C16F5 c16f5Jo = legalAssem3.Jo();
                TPText tPText = c1a12.LIZ;
                if (tPText != null) {
                    spannableStringBuilderLIZLLL = C1143850fs7.LIZLLL(C1143850fs7.LIZ, tPText);
                }
                c16f5Jo.setText(spannableStringBuilderLIZLLL);
                ((LegalAssem) awS160S0110000_33.l0).ap(2, c1a12.LIZIZ, C1A14.UNFOLD, c1a12);
                break;
            case 6:
                AnonymousClass0956 anonymousClass09565 = ((LegalAssem) awS160S0110000_33.l0).LLJ;
                if (anonymousClass09565 != null) {
                    anonymousClass09565.LIZIZ(null);
                }
                ((LegalAssem) awS160S0110000_33.l0).Zo(c1a12);
                C500260Jjc.LJIILIIL(((LegalAssem) awS160S0110000_33.l0).Lo());
                break;
            default:
                throw new C1954807lC();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS160S0110000_33 awS160S0110000_33, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        AlbumPreviewFragment albumPreviewFragment = (AlbumPreviewFragment) awS160S0110000_33.l0;
        EcPhotoSearchAlbumVM ecPhotoSearchAlbumVM = albumPreviewFragment.LLJI;
        if (ecPhotoSearchAlbumVM != null) {
            ecPhotoSearchAlbumVM.wQ2(albumPreviewFragment.getContext(), new AwS13S0120000_33(awS160S0110000_33.z1, zBooleanValue, (AlbumPreviewFragment) awS160S0110000_33.l0, 1));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS160S0110000_33(AlbumPreviewFragment albumPreviewFragment, boolean z, int i) {
        super(2);
        this.$t = i;
        this.l0 = albumPreviewFragment;
        this.z1 = z;
    }
}
