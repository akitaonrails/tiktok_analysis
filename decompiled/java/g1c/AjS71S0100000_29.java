package g1c;

import X.AbstractViewOnClickListenerC420730Ged;
import X.C013C;
import X.C0OM1;
import X.C1251150ifB;
import X.C12YP;
import X.C1390920mIc;
import X.C1517140paC;
import X.C19471011Fs;
import X.C19471811Ga;
import X.C19471911Gb;
import X.C19675111yP;
import X.C19675711yV;
import X.C19676011yY;
import X.C19677511yn;
import X.C19677611yo;
import X.C2097608Jq;
import X.C259800zU;
import X.C675940QfI;
import X.C675950QfJ;
import X.C724240Sb0;
import X.C786410Ut5;
import android.content.Context;
import android.view.View;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.EcTakePhotoActivity;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.model.EcPhotoSearchAlbumVM;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.sysrecommend.SysRecommendAssem;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchBusinessEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS273S0300000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: loaded from: classes30.dex */
public class AjS71S0100000_29 extends AbstractViewOnClickListenerC420730Ged {
    public final int $t;
    public Object l0;

    @Override // X.AbstractViewOnClickListenerC420730Ged
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            case 3:
                LIZ$3(this, view);
                break;
            case 4:
                LIZ$4(this, view);
                break;
            case 5:
                LIZ$5(this, view);
                break;
            case 6:
                LIZ$6(this, view);
                break;
            case 7:
                LIZ$7(this, view);
                break;
            case 8:
                LIZ$8(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AjS71S0100000_29(Object obj, int i) {
        super(700L);
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(AjS71S0100000_29 ajS71S0100000_29, View view) {
        String str;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, ((SysRecommendAssem) ajS71S0100000_29.l0).LJJIJL());
            C19471811Ga.LIZ.getClass();
            C675950QfJ c675950QfJ = C675950QfJ.LIZ;
            c675950QfJ.getClass();
            C675950QfJ.LIZ().storeInt("recommend_module_show_count", 0);
            c675950QfJ.getClass();
            C675950QfJ.LIZ().storeLong("close_sys_recommend_recent_time", System.currentTimeMillis());
            PhotoSearchEnterParams photoSearchEnterParamsHp = ((SysRecommendAssem) ajS71S0100000_29.l0).hp();
            Pair[] pairArr = new Pair[2];
            PhotoSearchEnterParams photoSearchEnterParamsHp2 = ((SysRecommendAssem) ajS71S0100000_29.l0).hp();
            if (photoSearchEnterParamsHp2 == null || (photoSearchBusinessEnterParams = photoSearchEnterParamsHp2.businessParams) == null || (str = photoSearchBusinessEnterParams.photoSearchPreviousPage) == null) {
                str = "";
            }
            pairArr[0] = new Pair("current_page", str);
            pairArr[1] = new Pair("click_type", "close");
            C19676011yY.LIZ(photoSearchEnterParamsHp, C2097608Jq.LJIIJ(pairArr));
        }
    }

    public static final void LIZ$1(AjS71S0100000_29 ajS71S0100000_29, View view) {
        String str;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams;
        if (view != null && ((SysRecommendAssem) ajS71S0100000_29.l0).getContext() != null) {
            C19471811Ga.LIZ.getClass();
            C675950QfJ.LIZ.getClass();
            C675950QfJ.LIZ().storeInt("recommend_module_show_count", 0);
            EcPhotoSearchAlbumVM ecPhotoSearchAlbumVMLIZ = C19471911Gb.LIZ(C724240Sb0.LIZ((SysRecommendAssem) ajS71S0100000_29.l0));
            if (ecPhotoSearchAlbumVMLIZ != null) {
                ecPhotoSearchAlbumVMLIZ.xQ2(new AwS608S0100000_29((SysRecommendAssem) ajS71S0100000_29.l0, 87));
            }
            PhotoSearchEnterParams photoSearchEnterParamsHp = ((SysRecommendAssem) ajS71S0100000_29.l0).hp();
            Pair[] pairArr = new Pair[2];
            PhotoSearchEnterParams photoSearchEnterParamsHp2 = ((SysRecommendAssem) ajS71S0100000_29.l0).hp();
            if (photoSearchEnterParamsHp2 == null || (photoSearchBusinessEnterParams = photoSearchEnterParamsHp2.businessParams) == null || (str = photoSearchBusinessEnterParams.photoSearchPreviousPage) == null) {
                str = "";
            }
            pairArr[0] = new Pair("current_page", str);
            pairArr[1] = new Pair("click_type", "refresh");
            C19676011yY.LIZ(photoSearchEnterParamsHp, C2097608Jq.LJIIJ(pairArr));
        }
    }

    public static final void LIZ$2(AjS71S0100000_29 ajS71S0100000_29, View view) {
        String str;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams;
        if (view != null) {
            C19675111yP c19675111yP = (C19675111yP) ajS71S0100000_29.l0;
            EcPhotoSearchAlbumVM ecPhotoSearchAlbumVM = c19675111yP.LLILZIL;
            if (ecPhotoSearchAlbumVM != null) {
                ecPhotoSearchAlbumVM.xQ2(new AwS608S0100000_29(c19675111yP, 516));
            }
            PhotoSearchEnterParams photoSearchEnterParams = ((C19675111yP) ajS71S0100000_29.l0).LLILLJJLI;
            Pair[] pairArr = new Pair[2];
            if (photoSearchEnterParams == null || (photoSearchBusinessEnterParams = photoSearchEnterParams.businessParams) == null || (str = photoSearchBusinessEnterParams.photoSearchPreviousPage) == null) {
                str = "";
            }
            pairArr[0] = new Pair("current_page", str);
            pairArr[1] = new Pair("click_type", "refresh");
            C19676011yY.LIZ(photoSearchEnterParams, C2097608Jq.LJIIJ(pairArr));
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [T, androidx.fragment.app.DialogFragment, com.bytedance.tux.sheet.sheet.TuxSheet] */
    public static final void LIZ$3(AjS71S0100000_29 ajS71S0100000_29, View view) {
        if (view != null) {
            EcTakePhotoActivity ecTakePhotoActivity = (EcTakePhotoActivity) ajS71S0100000_29.l0;
            ecTakePhotoActivity.getClass();
            C1517140paC.LIZ.getClass();
            if (C1517140paC.LIZ()) {
                C259800zU c259800zU = new C259800zU();
                C013C c013c = new C013C();
                c013c.element = true;
                C19471011Fs c19471011Fs = new C19471011Fs(ecTakePhotoActivity, new AwS273S0300000_29(c013c, (C013C) c259800zU, (C259800zU<TuxSheet>) ecTakePhotoActivity, (EcTakePhotoActivity) 24));
                C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                C0OM1 c0om1 = new C0OM1();
                C1251150ifB c1251150ifB = new C1251150ifB();
                c1251150ifB.LIZLLL();
                c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
                c1251150ifB.LIZJ(new AwS573S0100000_29(c19471011Fs, 1042));
                c0om1.LIZIZ(c1251150ifB);
                TuxSheet tuxSheet = c1390920mIc.LIZ;
                tuxSheet.LLJJIJIL = c0om1;
                tuxSheet.LLJJJ = null;
                tuxSheet.LLILLJJLI = new C12YP(ecTakePhotoActivity, c013c, 1);
                tuxSheet.LLJLLL = false;
                c1390920mIc.LJIIIIZZ(0);
                ?? r2 = c1390920mIc.LIZ;
                r2.LLJJIII = c19471011Fs;
                c259800zU.element = r2;
                r2.show(ecTakePhotoActivity.getSupportFragmentManager(), "EcTakePhotoUserHelperDialog");
                C675940QfI.LIZJ("photo_search_help_panel_show", ecTakePhotoActivity.LLJJL, AFwS273S0000000_29.get$arr$(273));
            }
            C675940QfI.LIZJ("photo_search_help_click", ((EcTakePhotoActivity) ajS71S0100000_29.l0).LLJJL, AFwS273S0000000_29.get$arr$(275));
        }
    }

    public static final void LIZ$4(AjS71S0100000_29 ajS71S0100000_29, View view) {
        if (view != null) {
            ((EcTakePhotoActivity) ajS71S0100000_29.l0).U(false);
            C675940QfI.LIZJ("photo_search_flash_click", ((EcTakePhotoActivity) ajS71S0100000_29.l0).LLJJL, AFwS273S0000000_29.get$arr$(274));
        }
    }

    public static final void LIZ$5(AjS71S0100000_29 ajS71S0100000_29, View view) {
        if (view != null) {
            ((EcTakePhotoActivity) ajS71S0100000_29.l0).U(true);
            C675940QfI.LIZJ("photo_search_flash_click", ((EcTakePhotoActivity) ajS71S0100000_29.l0).LLJJL, AFwS273S0000000_29.get$arr$(274));
        }
    }

    public static final void LIZ$6(AjS71S0100000_29 ajS71S0100000_29, View view) {
        if (view != null) {
            ((C19677511yn) ajS71S0100000_29.l0).LLILZIL.invoke();
        }
    }

    public static final void LIZ$7(AjS71S0100000_29 ajS71S0100000_29, View view) {
        if (view != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C19677611yo c19677611yo = (C19677611yo) ajS71S0100000_29.l0;
            MediaModel mediaModel = c19677611yo.LLILZ;
            if (mediaModel != null) {
                c19677611yo.LLILLJJLI.invoke(mediaModel, Integer.valueOf(c19677611yo.LLILZIL), null, Long.valueOf(jCurrentTimeMillis));
            }
        }
    }

    public static final void LIZ$8(AjS71S0100000_29 ajS71S0100000_29, View view) {
        if (view != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C19675711yV c19675711yV = (C19675711yV) ajS71S0100000_29.l0;
            MediaModel mediaModel = c19675711yV.LLILZ;
            if (mediaModel != null) {
                c19675711yV.LLILLJJLI.invoke(mediaModel, Integer.valueOf(c19675711yV.LLILZIL), Long.valueOf(jCurrentTimeMillis), null);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AjS71S0100000_29(C19675111yP c19675111yP, Context context, int i) {
        super(700L);
        this.$t = i;
        this.l0 = c19675111yP;
    }
}
