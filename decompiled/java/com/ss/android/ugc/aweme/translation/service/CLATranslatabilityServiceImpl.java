package com.ss.android.ugc.aweme.translation.service;

import X.AbstractC848400XPy;
import X.C0BI0;
import X.C0SCU;
import X.C0SKF;
import X.C0XQ7;
import X.C123100dR;
import X.C13BV;
import X.C13LP;
import X.C13LQ;
import X.C15438062q;
import X.C161C;
import X.C161F;
import X.C161N;
import X.C161Q;
import X.C1697810uHb;
import X.C20701315zX;
import X.C20702515zj;
import X.C20703515zt;
import X.C281410B1f;
import X.C281430B1h;
import X.C305430By9;
import X.C582980Mtk;
import X.C746760TRa;
import X.EnumC207101162h;
import X.EnumC715680S5m;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.TranslationInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes32.dex */
public final class CLATranslatabilityServiceImpl implements ICLATranslatabilityService {
    public static String[] LJIJI() {
        C20703515zt.LIZ.getClass();
        return C20703515zt.LIZIZ.LL();
    }

    public final boolean LJIJJ() {
        return C746760TRa.LIZ().LJLILLLLZI();
    }

    public static List LJIJ(Aweme aweme) {
        TranslationInfo translationInfo;
        List<PhotoModeImageUrlModel> imageList;
        String str;
        TranslationInfo translationInfo2;
        C161N c161n = C161N.LIZIZ;
        if (c161n.LJLZ(aweme)) {
            return C13BV.INSTANCE;
        }
        if (!C582980Mtk.LIZIZ(aweme)) {
            return C13BV.INSTANCE;
        }
        PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
        int i = 0;
        if (photoModeImageInfo != null && (translationInfo = photoModeImageInfo.getTranslationInfo()) != null && translationInfo.translatable) {
            String strLLIIZ = c161n.LLIIZ();
            PhotoModeImageInfo photoModeImageInfo2 = aweme.getPhotoModeImageInfo();
            if (photoModeImageInfo2 != null && (imageList = photoModeImageInfo2.getImageList()) != null) {
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(imageList, 10));
                for (PhotoModeImageUrlModel photoModeImageUrlModel : imageList) {
                    int i2 = i + 1;
                    Integer numValueOf = null;
                    if (i >= 0) {
                        PhotoModeImageUrlModel photoModeImageUrlModel2 = photoModeImageUrlModel;
                        if (!Intrinsics.LJFF(photoModeImageUrlModel2.ocrLanguage, strLLIIZ) && photoModeImageUrlModel2.ocrLanguage != null && photoModeImageUrlModel2.translatedDisplayImage != null) {
                            PhotoModeImageInfo photoModeImageInfo3 = aweme.getPhotoModeImageInfo();
                            if (photoModeImageInfo3 != null && (translationInfo2 = photoModeImageInfo3.getTranslationInfo()) != null) {
                                str = translationInfo2.targetLanguage;
                            } else {
                                str = null;
                            }
                            if (Intrinsics.LJFF(str, strLLIIZ)) {
                                numValueOf = Integer.valueOf(i);
                            }
                        }
                        arrayList.add(numValueOf);
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                return C13LP.LJJJJLI(arrayList);
            }
            return C13BV.INSTANCE;
        }
        return C13BV.INSTANCE;
    }

    public static boolean LJIJJLI(String str) {
        if (C161N.LIZIZ.LJJZZI(str) != EnumC715680S5m.NOT_OVERWRITTEN) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ICLATranslatabilityService
    public final boolean LIZLLL(Aweme aweme) {
        C161N c161n = C161N.LIZIZ;
        if (!c161n.LJLZ(aweme) && !(!C281410B1f.LIZ()) && C582980Mtk.LIZIZ(aweme)) {
            String strLIZ = C20701315zX.LIZ(aweme);
            if (aweme.isPhotoTitleTranslatable() && !TextUtils.isEmpty(strLIZ) && !TextUtils.equals(c161n.LLIIZ(), strLIZ) && !Intrinsics.LJFF(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), AwemeExtKt.getAuthorUid(aweme))) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ICLATranslatabilityService
    public final boolean LJ(Aweme aweme) {
        C161N c161n = C161N.LIZIZ;
        if (!c161n.LJLZ(aweme)) {
            String strLIZJ = C0SKF.LIZJ(aweme);
            if ((!AwemeExtKt.isPhotoMode(aweme) || (!(!C281410B1f.LIZ()) && !Intrinsics.LJFF(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId(), AwemeExtKt.getAuthorUid(aweme)))) && aweme.isDescTranslatable() && !TextUtils.isEmpty(strLIZJ) && !TextUtils.equals(c161n.LLIIZ(), strLIZJ)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ICLATranslatabilityService
    public final List<Integer> LJIILL(Aweme aweme) {
        if (!C281430B1h.LIZ()) {
            return C13BV.INSTANCE;
        }
        return LJIJ(aweme);
    }

    public static boolean LJIILLIIL(Aweme aweme, C161Q c161q) {
        C161N c161n = C161N.LIZIZ;
        if (c161n.LJLZ(aweme)) {
            return false;
        }
        String strLIZJ = C161C.LIZJ(aweme, c161q);
        if (!C123100dR.LIZ(strLIZJ) || Intrinsics.LJFF(strLIZJ, c161n.LLIIZ()) || !c161q.LJII(aweme)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ICLATranslatabilityService
    public final boolean LIZIZ(Aweme aweme, C161Q c161q) {
        if (!C305430By9.LIZ) {
            return false;
        }
        if (LJIJJLI(aweme.getAid())) {
            if (C161N.LIZIZ.LJJZZI(aweme.getAid()) != EnumC715680S5m.OVERRIDE_TO_TRANSLATED || !LJIILIIL(aweme, c161q)) {
                return false;
            }
            return true;
        }
        return LJIIZILJ(aweme, null, null, c161q);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ICLATranslatabilityService
    public final boolean LIZJ(Aweme aweme, Boolean bool) {
        boolean zLJIJJ;
        if (LJIJJLI(aweme.getAid())) {
            if (C161N.LIZIZ.LJJZZI(aweme.getAid()) == EnumC715680S5m.OVERRIDE_TO_TRANSLATED && LIZLLL(aweme)) {
                return true;
            }
            return false;
        }
        if (!C281410B1f.LIZ()) {
            return false;
        }
        boolean zLJIILLIIL = C13LQ.LJIILLIIL(C20701315zX.LIZ(aweme), LJIJI());
        if (bool != null) {
            zLJIJJ = bool.booleanValue();
        } else {
            zLJIJJ = LJIJJ();
        }
        if (zLJIJJ && !zLJIILLIIL && LIZLLL(aweme)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ICLATranslatabilityService
    public final boolean LJI(Aweme aweme, Boolean bool) {
        boolean zLJIJJ;
        if (LJIJJLI(aweme.getAid())) {
            if (C161N.LIZIZ.LJJZZI(aweme.getAid()) != EnumC715680S5m.OVERRIDE_TO_TRANSLATED || !LJIIL(aweme, true)) {
                return false;
            }
            return true;
        }
        boolean zLJ = C161F.LJ(aweme);
        if (bool != null) {
            zLJIJJ = bool.booleanValue();
        } else {
            zLJIJJ = LJIJJ();
        }
        if (!zLJIJJ || !C746760TRa.LIZ().LJJJJI() || zLJ || !LJIIL(aweme, true)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ICLATranslatabilityService
    public final boolean LJII(int i, Aweme aweme) {
        return LJIILL(aweme).contains(Integer.valueOf(i));
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ICLATranslatabilityService
    public final List<Integer> LJIIIIZZ(Aweme aweme, Boolean bool) {
        boolean zLJIJJ;
        String str;
        List<PhotoModeImageUrlModel> imageList;
        PhotoModeImageUrlModel photoModeImageUrlModel;
        if (LJIJJLI(aweme.getAid())) {
            if (C161N.LIZIZ.LJJZZI(aweme.getAid()) == EnumC715680S5m.OVERRIDE_TO_TRANSLATED) {
                return LJIJ(aweme);
            }
            return C13BV.INSTANCE;
        }
        if (!C582980Mtk.LIZIZ(aweme)) {
            return C13BV.INSTANCE;
        }
        if (!C281430B1h.LIZ()) {
            return C13BV.INSTANCE;
        }
        if (bool != null) {
            zLJIJJ = bool.booleanValue();
        } else {
            zLJIJJ = LJIJJ();
        }
        if (!zLJIJJ) {
            return C13BV.INSTANCE;
        }
        String[] strArrLJIJI = LJIJI();
        List<Integer> listLJIILL = LJIILL(aweme);
        ArrayList arrayList = new ArrayList();
        for (Integer num : listLJIILL) {
            int iIntValue = num.intValue();
            PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
            if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null && (photoModeImageUrlModel = (PhotoModeImageUrlModel) C13LP.LJJJLZIJ(iIntValue, imageList)) != null) {
                str = photoModeImageUrlModel.ocrLanguage;
            } else {
                str = null;
            }
            if (!C13LQ.LJIILLIIL(str, strArrLJIJI)) {
                arrayList.add(num);
            }
        }
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ICLATranslatabilityService
    public final boolean LJIIJ(Aweme aweme, Map<EnumC207101162h, ? extends Pair<? extends C161Q<?>, ? extends Function1<Object, Unit>>> map) {
        if (!C305430By9.LIZ) {
            return false;
        }
        if (map == null) {
            map = C161N.LIZIZ.LLFF();
        }
        if (map.isEmpty()) {
            return false;
        }
        Iterator<Map.Entry<EnumC207101162h, ? extends Pair<? extends C161Q<?>, ? extends Function1<Object, Unit>>>> it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            if (LJIILLIIL(aweme, it2.next().getValue().getFirst())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ICLATranslatabilityService
    public final boolean LJIIJJI(Aweme aweme, boolean z) {
        Video video = aweme.getVideo();
        if (video != null && video.getCaptionModel() != null) {
            C161N c161n = C161N.LIZIZ;
            if (!c161n.LJLZ(aweme)) {
                if (!z) {
                    C20703515zt c20703515zt = C20703515zt.LIZ;
                    Boolean bool = Boolean.FALSE;
                    c20703515zt.getClass();
                    if (C20703515zt.LJJIIZI(aweme, bool)) {
                        return false;
                    }
                }
                if (C20702515zj.LIZLLL(aweme) != null || c161n.LJJIIZ(aweme, c161n.LLIIZ())) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ICLATranslatabilityService
    public final boolean LJIIL(Aweme aweme, boolean z) {
        if (aweme.getInteractStickerStructs() != null && C0BI0.LIZ == 2) {
            if (!C161N.LIZIZ.LJLZ(aweme) && !((ArrayList) C161F.LIZ(aweme, aweme.getInteractStickerStructs())).isEmpty() && aweme.isTextStickerTranslatable()) {
                if (!Intrinsics.LJFF(C161F.LIZIZ(aweme), r1.LLIIZ())) {
                    if (!z || C746760TRa.LIZ().LJJJJI()) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ICLATranslatabilityService
    public final boolean LJIILIIL(Aweme aweme, C161Q<?> c161q) {
        if (aweme == null || !C305430By9.LIZ) {
            return false;
        }
        return LJIILLIIL(aweme, c161q);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ICLATranslatabilityService
    public final boolean LJIILJJIL(Aweme aweme, Boolean bool) {
        boolean zLJIJJ;
        if (LJIJJLI(aweme.getAid())) {
            if (C161N.LIZIZ.LJJZZI(aweme.getAid()) != EnumC715680S5m.OVERRIDE_TO_TRANSLATED || !LJ(aweme)) {
                return false;
            }
            return true;
        }
        String[] strArrLJIJI = LJIJI();
        String strLIZJ = C0SKF.LIZJ(aweme);
        if (strArrLJIJI == null) {
            strArrLJIJI = C0SCU.LIZ().LL();
        }
        boolean zLJIILLIIL = C13LQ.LJIILLIIL(strLIZJ, strArrLJIJI);
        if (bool != null) {
            zLJIJJ = bool.booleanValue();
        } else {
            zLJIJJ = LJIJJ();
        }
        if (!zLJIJJ || zLJIILLIIL || !LJ(aweme)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ICLATranslatabilityService
    public final boolean LJFF(Aweme aweme, Boolean bool, Map<EnumC207101162h, ? extends Pair<? extends C161Q<?>, ? extends Function1<Object, Unit>>> map) {
        boolean zLJIJJ;
        if (!C305430By9.LIZ) {
            return false;
        }
        if (LJIJJLI(aweme.getAid())) {
            if (C161N.LIZIZ.LJJZZI(aweme.getAid()) != EnumC715680S5m.OVERRIDE_TO_TRANSLATED || !LJIIJ(aweme, map)) {
                return false;
            }
            return true;
        }
        if (map == null) {
            map = C161N.LIZIZ.LLFF();
        }
        String[] strArrLJIJI = LJIJI();
        if (bool != null) {
            zLJIJJ = bool.booleanValue();
        } else {
            zLJIJJ = LJIJJ();
        }
        if (map.isEmpty()) {
            return false;
        }
        Iterator<Map.Entry<EnumC207101162h, ? extends Pair<? extends C161Q<?>, ? extends Function1<Object, Unit>>>> it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            if (LJIIZILJ(aweme, Boolean.valueOf(zLJIJJ), strArrLJIJI, it2.next().getValue().getFirst())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ICLATranslatabilityService
    public final boolean LJIIIZ(int i, Aweme aweme, Boolean bool) {
        return LJIIIIZZ(aweme, bool).contains(Integer.valueOf(i));
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ICLATranslatabilityService
    public final boolean LIZ(Aweme aweme, Boolean bool, Boolean bool2, Boolean bool3) {
        boolean zLIZ;
        boolean zLJIJJ;
        if (LJIJJLI(aweme.getAid())) {
            if (C161N.LIZIZ.LJJZZI(aweme.getAid()) == EnumC715680S5m.OVERRIDE_TO_TRANSLATED && LJIIJJI(aweme, false)) {
                return true;
            }
            return false;
        }
        Boolean bool4 = Boolean.TRUE;
        if (Intrinsics.LJFF(bool3, bool4)) {
            zLIZ = false;
        } else {
            zLIZ = C20702515zj.LIZ(aweme, LJIJI());
        }
        if (bool != null) {
            zLJIJJ = bool.booleanValue();
        } else {
            zLJIJJ = LJIJJ();
        }
        if (zLJIJJ) {
            if ((Intrinsics.LJFF(bool2, bool4) || C746760TRa.LIZ().LJL()) && !zLIZ && LJIIJJI(aweme, false)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean LJIIZILJ(Aweme aweme, Boolean bool, String[] strArr, C161Q<?> c161q) {
        boolean zLJIJJ;
        if (strArr == null) {
            strArr = LJIJI();
        }
        boolean zLJIILLIIL = C13LQ.LJIILLIIL(C161C.LIZJ(aweme, c161q), strArr);
        if (bool != null) {
            zLJIJJ = bool.booleanValue();
        } else {
            zLJIJJ = LJIJJ();
        }
        if (zLJIJJ && !zLJIILLIIL && LJIILLIIL(aweme, c161q)) {
            c161q.LIZJ();
            return true;
        }
        return false;
    }
}
