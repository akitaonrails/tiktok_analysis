package kotlin.jvm.internal;

import X.AbstractC21673619ry;
import X.C09AY;
import X.C118300cf;
import X.C1189590h3t;
import X.C1206260hUm;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1843500y4a;
import X.C18Z8;
import X.C19Y3;
import X.C19Y5;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2191641Aq2;
import X.C2191831AqL;
import X.C286530BKx;
import X.C296270BjN;
import X.C438710HIf;
import X.C786410Ut5;
import X.EnumC1181510gqr;
import Y.ARunnableS22S1200000_18;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hybrid.spark.raven.page.RavenFragment;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.favorites.business.FavoritesFragmentV2;
import com.ss.android.ugc.aweme.favorites.business.powerviewpager.FavoritePowerViewPagerViewModel;
import com.ss.android.ugc.aweme.favorites.profile.FavoriteInvalidVideosSharedVM;
import com.ss.android.ugc.aweme.favorites.profile.FavoriteSearchViewModel;
import com.ss.android.ugc.aweme.poi.detail.container.slash.PoiDetailSlashFragment;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes19.dex */
public class AwS134S1200000_18 extends C09AY implements Function0 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS134S1200000_18 awS134S1200000_18) {
        View view = ((PoiDetailSlashFragment) awS134S1200000_18.l1).getView();
        if (view != null) {
            HandlerHook.viewPostDelay(view, new ARunnableS22S1200000_18((PoiDetailSlashFragment) awS134S1200000_18.l1, awS134S1200000_18.s0, (C118300cf) awS134S1200000_18.l2, 5), 300L);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS134S1200000_18 awS134S1200000_18) {
        C1189590h3t c1189590h3t = (C1189590h3t) awS134S1200000_18.l1;
        UrlModel urlModel = (UrlModel) awS134S1200000_18.l2;
        SmartImageView smartImageView = c1189590h3t.LLILLJJLI;
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel));
        c1331670kl3LJIIIIZZ.LIZLLL("LocalServiceBrandLogo");
        c1331670kl3LJIIIIZZ.LJJ(smartImageView);
        C786410Ut5.h3(c1331670kl3LJIIIIZZ);
        ((C1189590h3t) awS134S1200000_18.l1).LLILLL.setText(awS134S1200000_18.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS134S1200000_18 awS134S1200000_18) {
        int iIntValue;
        String str;
        int iIntValue2;
        C19Y3 c19y3 = ((FavoritesFragmentV2) awS134S1200000_18.l1).LLILZ;
        C1206260hUm c1206260hUm = null;
        if (c19y3 == null) {
            c19y3 = null;
        }
        int tabCount = c19y3.getTabCount();
        for (int i = 0; i < tabCount; i++) {
            C19Y3 c19y32 = ((FavoritesFragmentV2) awS134S1200000_18.l1).LLILZ;
            if (c19y32 == null) {
                c19y32 = null;
            }
            C19Y5 c19y5LJIIIZ = c19y32.LJIIIZ(i);
            if (c19y5LJIIIZ != null) {
                FavoritesFragmentV2 favoritesFragmentV2 = (FavoritesFragmentV2) awS134S1200000_18.l1;
                C1206260hUm c1206260hUm2 = favoritesFragmentV2.LLILZLL;
                if (c1206260hUm2 == null) {
                    c1206260hUm2 = null;
                }
                Object obj = c19y5LJIIIZ.LIZ;
                if (!(obj instanceof String) || (str = (String) obj) == null) {
                    str = "";
                }
                Integer numLIZ = c1206260hUm2.LIZ(str);
                if (numLIZ != null) {
                    iIntValue2 = numLIZ.intValue();
                } else {
                    iIntValue2 = 0;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(favoritesFragmentV2.NR().xQ2(i));
                sbLIZ.append(' ');
                sbLIZ.append(C1843500y4a.LIZIZ(iIntValue2));
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                if (!TextUtils.equals(strLIZIZ, c19y5LJIIIZ.LIZJ)) {
                    c19y5LJIIIZ.LIZIZ(strLIZIZ);
                }
            }
        }
        FavoritePowerViewPagerViewModel favoritePowerViewPagerViewModelNR = ((FavoritesFragmentV2) awS134S1200000_18.l1).NR();
        C1206260hUm c1206260hUm3 = ((FavoritesFragmentV2) awS134S1200000_18.l1).LLILZLL;
        if (c1206260hUm3 == null) {
            c1206260hUm3 = null;
        }
        favoritePowerViewPagerViewModelNR.zQ2(c1206260hUm3);
        FavoritesFragmentV2 favoritesFragmentV22 = (FavoritesFragmentV2) awS134S1200000_18.l1;
        C1206260hUm c1206260hUm4 = favoritesFragmentV22.LLILZLL;
        if (c1206260hUm4 == null) {
            c1206260hUm4 = null;
        }
        Integer numLIZ2 = c1206260hUm4.LIZ("video");
        if (numLIZ2 != null) {
            int iIntValue3 = numLIZ2.intValue();
            FavoriteInvalidVideosSharedVM favoriteInvalidVideosSharedVM = (FavoriteInvalidVideosSharedVM) favoritesFragmentV22.LLJJJJJIL.getValue();
            if (favoriteInvalidVideosSharedVM != null) {
                favoriteInvalidVideosSharedVM.LLILLL.setValue(Integer.valueOf(iIntValue3));
            }
        }
        if (C296270BjN.LIZ()) {
            FavoriteSearchViewModel favoriteSearchViewModelRR = ((FavoritesFragmentV2) awS134S1200000_18.l1).RR();
            if (favoriteSearchViewModelRR != null) {
                C1206260hUm c1206260hUm5 = ((FavoritesFragmentV2) awS134S1200000_18.l1).LLILZLL;
                if (c1206260hUm5 != null) {
                    c1206260hUm = c1206260hUm5;
                }
                Integer numLIZ3 = c1206260hUm.LIZ("video");
                if (numLIZ3 != null) {
                    iIntValue = numLIZ3.intValue();
                } else {
                    iIntValue = 0;
                }
                favoriteSearchViewModelRR.LLJI = iIntValue;
            }
            ((FavoritesFragmentV2) awS134S1200000_18.l1).WR();
        }
        if (((Boolean) C286530BKx.LIZ.getValue()).booleanValue()) {
            C20684815ws.LJIILLIIL("enter_personal_favourite", FavoritesFragmentV2.SR(new Pair("enter_from", ((FavoritesFragmentV2) awS134S1200000_18.l1).LLILLL), new Pair("enter_method", ((FavoritesFragmentV2) awS134S1200000_18.l1).LLJJLIIIJLLLLLLLZ), new Pair("scene_id", (Integer) awS134S1200000_18.l2), new Pair("tab_name", awS134S1200000_18.s0), new Pair("tab_status", ((FavoritesFragmentV2) awS134S1200000_18.l1).NR().vQ2())));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS134S1200000_18 awS134S1200000_18) {
        FavoritesFragmentV2 favoritesFragmentV2 = (FavoritesFragmentV2) awS134S1200000_18.l1;
        C1206260hUm c1206260hUm = favoritesFragmentV2.LLILZLL;
        if (c1206260hUm == null) {
            c1206260hUm = null;
        }
        Integer numLIZ = c1206260hUm.LIZ("video");
        if (numLIZ != null) {
            int iIntValue = numLIZ.intValue();
            FavoriteInvalidVideosSharedVM favoriteInvalidVideosSharedVM = (FavoriteInvalidVideosSharedVM) favoritesFragmentV2.LLJJJJJIL.getValue();
            if (favoriteInvalidVideosSharedVM != null) {
                favoriteInvalidVideosSharedVM.LLILLL.setValue(Integer.valueOf(iIntValue));
            }
        }
        if (((Boolean) C286530BKx.LIZ.getValue()).booleanValue()) {
            C20684815ws.LJIILLIIL("enter_personal_favourite", FavoritesFragmentV2.SR(new Pair("enter_from", ((FavoritesFragmentV2) awS134S1200000_18.l1).LLILLL), new Pair("enter_method", ((FavoritesFragmentV2) awS134S1200000_18.l1).LLJJLIIIJLLLLLLLZ), new Pair("scene_id", (Integer) awS134S1200000_18.l2), new Pair("tab_name", awS134S1200000_18.s0), new Pair("tab_status", ((FavoritesFragmentV2) awS134S1200000_18.l1).NR().vQ2())));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS134S1200000_18 awS134S1200000_18) {
        Integer numValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("recreateBodyList complete reason=");
        sbLIZ.append(awS134S1200000_18.s0);
        sbLIZ.append(" visibility=");
        sbLIZ.append(((C18Z8) awS134S1200000_18.l1).getVisibility());
        sbLIZ.append(" alpha=");
        sbLIZ.append(((C18Z8) awS134S1200000_18.l1).getAlpha());
        sbLIZ.append(" adapterCount=");
        AbstractC21673619ry adapter = ((C18Z8) awS134S1200000_18.l1).getAdapter();
        if (adapter != null) {
            numValueOf = Integer.valueOf(adapter.getItemCount());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(" childCount=");
        sbLIZ.append(((C18Z8) awS134S1200000_18.l1).getChildCount());
        sbLIZ.append(' ');
        sbLIZ.append(((RavenFragment) awS134S1200000_18.l2).fT(null));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$5(AwS134S1200000_18 awS134S1200000_18) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append((C2191831AqL) awS134S1200000_18.l1);
        sbLIZ.append(" priority event: ");
        sbLIZ.append(awS134S1200000_18.s0);
        sbLIZ.append(" inserted with key: ");
        sbLIZ.append((C2191641Aq2) awS134S1200000_18.l2);
        sbLIZ.append('!');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$6(AwS134S1200000_18 awS134S1200000_18) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiDetailRefreshPlugin onError, throwable: ");
        sbLIZ.append((Throwable) awS134S1200000_18.l1);
        sbLIZ.append(", slashRequestType: ");
        sbLIZ.append((EnumC1181510gqr) awS134S1200000_18.l2);
        sbLIZ.append(", fromInstanceId: ");
        sbLIZ.append(awS134S1200000_18.s0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS134S1200000_18(C18Z8 c18z8, RavenFragment ravenFragment, int i) {
        super(0);
        this.$t = i;
        this.s0 = "performInsert supplement multi-handler";
        this.l1 = c18z8;
        this.l2 = ravenFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS134S1200000_18(C1189590h3t c1189590h3t, UrlModel urlModel, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = c1189590h3t;
        this.l2 = urlModel;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS134S1200000_18(C2191831AqL c2191831AqL, String str, C2191641Aq2 c2191641Aq2, int i) {
        super(0);
        this.$t = i;
        this.l1 = c2191831AqL;
        this.s0 = str;
        this.l2 = c2191641Aq2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS134S1200000_18(FavoritesFragmentV2 favoritesFragmentV2, Integer num, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = favoritesFragmentV2;
        this.l2 = num;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS134S1200000_18(PoiDetailSlashFragment poiDetailSlashFragment, String str, C118300cf c118300cf, int i) {
        super(0);
        this.$t = i;
        this.l1 = poiDetailSlashFragment;
        this.s0 = str;
        this.l2 = c118300cf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS134S1200000_18(Throwable th, EnumC1181510gqr enumC1181510gqr, String str, int i) {
        super(0);
        this.$t = i;
        this.l1 = th;
        this.l2 = enumC1181510gqr;
        this.s0 = str;
    }
}
