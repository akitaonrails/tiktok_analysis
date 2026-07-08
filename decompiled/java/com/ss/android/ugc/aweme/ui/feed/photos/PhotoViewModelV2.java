package com.ss.android.ugc.aweme.ui.feed.photos;

import X.AbstractC848400XPy;
import X.C01GW;
import X.C0RV0;
import X.C0RV1;
import X.C0RV3;
import X.C0RVQ;
import X.C0RVR;
import X.C0S9P;
import X.C0SA5;
import X.C0SA6;
import X.C0SAA;
import X.C0SAB;
import X.C0SAC;
import X.C0SAD;
import X.C0SAE;
import X.C0SAH;
import X.C0SM7;
import X.C0ST8;
import X.C0XQ7;
import X.C1386360mBG;
import X.C13LP;
import X.C19EG;
import X.C1EE2;
import X.C2188811AlT;
import X.C270560Aj0;
import X.C276810At5;
import X.C277300Ats;
import X.C281390B1d;
import X.C294960BhG;
import X.C452501pT;
import X.C694950RNt;
import X.C696830RUz;
import X.C716110S7d;
import X.C716720S9m;
import X.C721190SQr;
import X.EnumC310600CFm;
import X.EnumC584570MwJ;
import X.InterfaceC0148002o;
import X.InterfaceC1294060jmO;
import X.InterfaceC694960RNu;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.commercialize.model.PhotoCarouselInfoStruct;
import com.ss.android.ugc.aweme.ecommerce.service.IECommercePhotoService;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.feed.platform.panel.autoscroll.IAutoAScrollAbility;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS21S1400000_11;
import kotlin.jvm.internal.AwS242S0000000_11;
import kotlin.jvm.internal.AwS26S0010000_11;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.AwS412S0200000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public class PhotoViewModelV2 extends FeedBaseViewModel<C0S9P> implements C0SM7 {
    public static final /* synthetic */ int LLJLILLLLZIIL = 0;
    public final C0SA6 LL;
    public final C0SAH LLILLJJLI;
    public VideoItemParams LLILLL;
    public int LLILZ;
    public boolean LLILZIL;
    public long LLILZLL;
    public boolean LLIZ;
    public long LLIZLLLIL;
    public long LLJ;
    public long LLJI;
    public AwS555S0100000_11 LLJIJIL;
    public String LLJILJIL;
    public final C0SAC LLJILJILJ;
    public final C0SA5 LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public Aweme LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public boolean LLJJJJ;
    public int LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final InterfaceC694960RNu LLJL;
    public final boolean LLJLIL;

    public PhotoViewModelV2() {
        this(null, 3);
    }

    public boolean DQ2() {
        return false;
    }

    @Override // X.C0SM7
    public final void M20() {
    }

    public final void PQ2() {
        this.LLJJIJI = true;
        setState(new C716110S7d());
        C0SA5 c0sa5 = this.LLJILLL;
        DQ2();
        if (c0sa5.LIZ()) {
            c0sa5.LJ = true;
            C721190SQr.LIZ.getClass();
        }
    }

    public final int AQ2() {
        Aweme aweme = this.LLJJIJIIJIL;
        if (aweme != null) {
            return C0ST8.LIZJ(aweme);
        }
        return 0;
    }

    public final void C81() {
        setState(new C0RVR());
    }

    public final boolean CQ2() {
        return this.LLJJIJIL || this.LLJJJ || this.LLJJJIL;
    }

    public final void KQ2() {
        setState(AFwS243S0000000_11.get$arr$(816));
    }

    public final void LJJIII() {
        setState(new C0RV1());
        this.LLJJJJ = false;
        this.LLJJL = false;
        this.LLJJI = false;
        setState(new C696830RUz(this));
        HQ2(EnumC310600CFm.DEFAULT);
        C0SAE c0saeLJLIIIL = C1EE2.LIZIZ.LJLIIIL();
        Aweme aweme = this.LLJJIJIIJIL;
        c0saeLJLIIIL.LIZ(aweme != null ? aweme.getAid() : null);
    }

    public final void LQ2() {
        setState(new C0RVQ());
    }

    public final void MQ2() {
        setState(AFwS243S0000000_11.get$arr$(507));
        withState(new AwS590S0100000_11(this, 283));
        C716720S9m.LIZ.getClass();
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        Keva keva = C716720S9m.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("photo_mode_user_has_swiped|");
        sbLIZ.append(curUserId);
        keva.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
    }

    public final void NQ2() {
        setState(new AwS242S0000000_11(2));
        withState(new AwS590S0100000_11(this, 284));
    }

    public final boolean VQ2() {
        String aid;
        if (this.LLJJIJIL || AQ2() <= 1) {
            return false;
        }
        C716720S9m.LIZ.getClass();
        if (C716720S9m.LIZ() >= ((Number) C277300Ats.LIZ.getValue()).intValue()) {
            return false;
        }
        Aweme aweme = this.LLJJIJIIJIL;
        if (aweme != null && (aid = aweme.getAid()) != null && aid.length() != 0) {
            String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            Keva keva = C716720S9m.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("photo_mode_post_has_shown_swipe_hint|");
            sbLIZ.append(aid);
            sbLIZ.append('|');
            sbLIZ.append(curUserId);
            if (keva.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C0S9P(0);
    }

    public final void wQ2() {
        setState(AFwS243S0000000_11.get$arr$(504));
    }

    public final void xQ2() {
        setState(AFwS243S0000000_11.get$arr$(505));
    }

    @Override // X.C0SM7
    public final boolean SC() {
        return DQ2();
    }

    public final boolean UQ2() {
        if (!VQ2()) {
            return false;
        }
        C716720S9m.LIZ.getClass();
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        Keva keva = C716720S9m.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("photo_mode_user_has_swiped|");
        sbLIZ.append(curUserId);
        if (keva.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false)) {
            return false;
        }
        return ((Boolean) C276810At5.LIZ.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0SM7
    public final boolean ew() {
        return ((C0S9P) getState()).LLILZLL;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LLJILLL.LIZIZ();
        if (C294960BhG.LIZ()) {
            ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJI(this.LLJILJILJ);
        }
    }

    @Override // X.C0SM7
    public final boolean um0() {
        return CQ2();
    }

    public final String yQ2() {
        if (DQ2()) {
            return this.LLJILJIL;
        }
        VideoItemParams videoItemParams = this.LLILLL;
        return Intrinsics.LJFF(videoItemParams != null ? videoItemParams.mEventType : null, "homepage_hot") ? "fyp" : "other";
    }

    public final int zQ2() {
        int iAQ2 = AQ2();
        int i = this.LLJJJJJIL;
        if (i != 0) {
            iAQ2 /= i;
        }
        if (iAQ2 <= 0) {
            return 1;
        }
        return iAQ2;
    }

    @Override // X.C0SM7
    public final boolean H5() {
        return this.LLJJIJI;
    }

    @Override // X.C0SM7
    @InterfaceC1294060jmO
    public final VideoItemParams d6() {
        return this.LLILLL;
    }

    @Override // X.C0SM7
    public final boolean ie() {
        return this.LLJJIJIL;
    }

    public static void JQ2(PhotoViewModelV2 photoViewModelV2) {
        photoViewModelV2.HQ2(EnumC310600CFm.DEFAULT);
        photoViewModelV2.setState(AFwS243S0000000_11.get$arr$(814));
        C0SA5 c0sa5 = photoViewModelV2.LLJILLL;
        c0sa5.LJIILLIIL = photoViewModelV2.LLILZLL;
        if (!photoViewModelV2.LLJJ) {
            c0sa5.LIZIZ();
        }
    }

    public final void BQ2(C19EG c19eg) {
        EnumC584570MwJ enumC584570MwJXo1;
        AwemeRawAd awemeRawAd;
        PhotoCarouselInfoStruct photoCarouselInfo;
        Integer carouselPlayType;
        int iIntValue;
        Aweme aweme;
        AwemeRawAd awemeRawAd2;
        PhotoCarouselInfoStruct photoCarouselInfo2;
        Integer carouselPlayType2;
        Aweme aweme2 = this.LLJJIJIIJIL;
        if (aweme2 != null && AwemeExtKt.isAdTraffic(aweme2)) {
            if (((Boolean) C270560Aj0.LIZ.getValue()).booleanValue() || ((aweme = this.LLJJIJIIJIL) != null && AwemeExtKt.isAdTraffic(aweme) && (awemeRawAd2 = aweme.getAwemeRawAd()) != null && (photoCarouselInfo2 = awemeRawAd2.getPhotoCarouselInfo()) != null && (carouselPlayType2 = photoCarouselInfo2.getCarouselPlayType()) != null && carouselPlayType2.intValue() == 2)) {
                Aweme aweme3 = this.LLJJIJIIJIL;
                if (aweme3 != null && AwemeExtKt.isAdTraffic(aweme3) && (awemeRawAd = aweme3.getAwemeRawAd()) != null && (photoCarouselInfo = awemeRawAd.getPhotoCarouselInfo()) != null && (carouselPlayType = photoCarouselInfo.getCarouselPlayType()) != null && ((iIntValue = carouselPlayType.intValue()) == 1 || iIntValue == 3)) {
                    setState(AFwS243S0000000_11.get$arr$(820));
                    return;
                }
                C81();
                if (!VQ2()) {
                    return;
                }
                setState(AFwS243S0000000_11.get$arr$(821));
                return;
            }
            setState(AFwS243S0000000_11.get$arr$(820));
            return;
        }
        IAutoAScrollAbility iAutoAScrollAbilityLIZIZ = C1386360mBG.LIZIZ(c19eg);
        if (iAutoAScrollAbilityLIZIZ != null) {
            enumC584570MwJXo1 = iAutoAScrollAbilityLIZIZ.xo1();
        } else {
            enumC584570MwJXo1 = null;
        }
        if (enumC584570MwJXo1 == EnumC584570MwJ.AUTO_SCROLL_STATE_START) {
            setState(AFwS243S0000000_11.get$arr$(820));
            return;
        }
        if (CQ2() || ((Boolean) C281390B1d.LIZ.getValue()).booleanValue()) {
            C81();
        } else {
            setState(AFwS243S0000000_11.get$arr$(820));
        }
        if (UQ2()) {
            setState(AFwS243S0000000_11.get$arr$(821));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0SM7
    public final boolean D21(int i) {
        if (i < 0 || ((C0S9P) getState()).LL != i) {
            return false;
        }
        return true;
    }

    public final void EQ2(int i) {
        String aid;
        setState(new C0RV3(this, i));
        C0SAE c0saeLJLIIIL = C1EE2.LIZIZ.LJLIIIL();
        Aweme aweme = this.LLJJIJIIJIL;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        c0saeLJLIIIL.LIZIZ(i, aid);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void FQ2(com.ss.android.ugc.aweme.feed.model.VideoItemParams r7) {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.feed.photos.PhotoViewModelV2.FQ2(com.ss.android.ugc.aweme.feed.model.VideoItemParams):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0168  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void GQ2(com.ss.android.ugc.aweme.model.SlidesImageLoadParams r39) {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.feed.photos.PhotoViewModelV2.GQ2(com.ss.android.ugc.aweme.model.SlidesImageLoadParams):void");
    }

    public void HQ2(EnumC310600CFm enumC310600CFm) {
        withState(new AwS377S0200000_11(this, enumC310600CFm, 67));
    }

    public final void OQ2(C19EG c19eg) {
        Integer num;
        C0SAA c0saaLIZ;
        int iIntValue;
        Integer num2;
        String str;
        setState(new C0RV0());
        this.LLJJJJ = true;
        ISearchService iSearchService = (ISearchService) PluggableExtentionKt.pluggableSpi$default(ISearchService.class, false, false, false, 14, null);
        if (iSearchService != null) {
            VideoItemParams videoItemParams = this.LLILLL;
            if (videoItemParams != null) {
                str = videoItemParams.mEventType;
            } else {
                str = null;
            }
            C0SAD c0sadLLZZJLIL = iSearchService.LLZZJLIL(str);
            if (c0sadLLZZJLIL != null) {
                c0sadLLZZJLIL.LIZJ(this.LLJJIJIIJIL);
            }
        }
        C0SAH c0sah = this.LLILLJJLI;
        if (c0sah.LJIILJJIL) {
            C0SAA c0saaLIZ2 = c0sah.LIZ();
            if (c0saaLIZ2 != null && c0saaLIZ2.LJIIJ && (c0saaLIZ = c0sah.LIZ()) != null) {
                C0SAA c0saa = new C0SAA(c0saaLIZ.LIZ, c0saaLIZ.LIZIZ, c0saaLIZ.LIZJ, c0saaLIZ.LIZLLL, 0L, true, c0saaLIZ.LJI, c0saaLIZ.LJII, c0saaLIZ.LJIIIIZZ, c0saaLIZ.LJIIIZ, c0saaLIZ.LJIIJ, null, c0saaLIZ.LJIIL, c0saaLIZ.LJIILIIL, c0saaLIZ.LJIILJJIL, c0saaLIZ.LJIILL, c0saaLIZ.LJIILLIIL);
                Map<Integer, C0SAA> map = c0sah.LJIIJJI;
                C0SAB c0sab = c0sah.LJIILL;
                if (c0sab != null && (num2 = c0sab.LIZ) != null) {
                    iIntValue = num2.intValue();
                } else {
                    iIntValue = 0;
                }
                map.put(Integer.valueOf(iIntValue), c0saa);
            }
            c0sah.LJIILJJIL = false;
        }
        ((LinkedHashMap) c0sah.LJ).clear();
        ((LinkedHashMap) c0sah.LJII).clear();
        ((LinkedHashMap) c0sah.LJFF).clear();
        ((LinkedHashMap) c0sah.LJI).clear();
        ((LinkedHashMap) c0sah.LJIIIIZZ).clear();
        ((LinkedHashMap) c0sah.LJIIIZ).clear();
        ((LinkedHashMap) c0sah.LJIIJ).clear();
        C0SAB c0sab2 = c0sah.LJIILL;
        if (c0sab2 != null && (num = c0sab2.LIZ) != null) {
            c0sah.LIZLLL(num.intValue());
        }
        c0sah.LJIIZILJ = false;
        C0SA5 c0sa5 = this.LLJILLL;
        c0sa5.LJ = c0sa5.LIZ();
        c0sa5.LIZLLL = true;
        BQ2(c19eg);
        this.LLJILLL.LIZJ(0L, 0L);
        this.LLIZLLLIL = System.currentTimeMillis();
        this.LLJ = -1L;
    }

    public final void QQ2(boolean z) {
        setState(new AwS590S0100000_11(this, 285));
        if (!z) {
            return;
        }
        setState(new AwS590S0100000_11(this, 286));
        if (this.LLJJJJLIIL) {
            withState(new AwS590S0100000_11(this, 287));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void RQ2(boolean z) {
        if (((C0S9P) getState()).LLJJJJLIIL != z) {
            setState(new AwS26S0010000_11(z, 5));
        }
    }

    public final void SQ2(boolean z) {
        setState(new AwS26S0010000_11(z, 6));
        if (z) {
            this.LLILLJJLI.LJIIZILJ = true;
        }
    }

    public final void TQ2(Function0<String> function0) {
        WeakReference<Function0<String>> weakReference;
        C0SA6 c0sa6 = this.LL;
        if (function0 != null) {
            c0sa6.getClass();
            weakReference = new WeakReference<>(function0);
        } else {
            weakReference = null;
        }
        c0sa6.LJIILL = weakReference;
    }

    @Override // X.C0SM7
    public final boolean fQ1(int i) {
        return ((Set) this.LLJJLIIIJLLLLLLLZ.getValue()).contains(Integer.valueOf(i));
    }

    public final void vQ2(int i) {
        C0SAH c0sah = this.LLILLJJLI;
        C0SAA c0saa = (C0SAA) ((LinkedHashMap) c0sah.LJIIJJI).get(Integer.valueOf(i));
        if (c0saa != null && c0saa.LJFF) {
            if (!c0sah.LJIIIZ.containsKey(Integer.valueOf(i))) {
                c0sah.LJIIIZ.put(Integer.valueOf(i), Boolean.TRUE);
                return;
            }
            return;
        }
        if (c0sah.LJIIJ.containsKey(Integer.valueOf(i))) {
            return;
        }
        c0sah.LJIIJ.put(Integer.valueOf(i), Boolean.TRUE);
    }

    public PhotoViewModelV2(C0SA6 c0sa6, int i) {
        C0SAH c0sah;
        c0sa6 = (i & 1) != 0 ? new C0SA6(false) : c0sa6;
        if ((i & 2) != 0) {
            c0sah = new C0SAH();
        } else {
            c0sah = null;
        }
        this.LL = c0sa6;
        this.LLILLJJLI = c0sah;
        this.LLILZ = -1;
        this.LLIZLLLIL = -1L;
        this.LLJ = -1L;
        this.LLJI = -1L;
        this.LLJILJIL = "";
        C0SAC c0sac = C0SAC.LL;
        this.LLJILJILJ = c0sac;
        C0SA5 c0sa5 = new C0SA5(new AwS555S0100000_11(this, 1658), new AwS555S0100000_11(this, 1659));
        c0sa5.LJIILIIL = new AwS412S0200000_11(c0sa5, this, 99);
        this.LLJILLL = c0sa5;
        this.LLJJJJJIL = 1;
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1659));
        IECommercePhotoService iECommercePhotoService = (IECommercePhotoService) C13LP.LJJJLIIL(ServiceManager.get().getServices(IECommercePhotoService.class));
        InterfaceC694960RNu interfaceC694960RNuLIZ = (iECommercePhotoService == null || (interfaceC694960RNuLIZ = iECommercePhotoService.LIZ()) == null) ? C694950RNt.LIZ : interfaceC694960RNuLIZ;
        this.LLJL = interfaceC694960RNuLIZ;
        this.LLJLIL = interfaceC694960RNuLIZ.LIZLLL();
        if (C294960BhG.LIZ()) {
            ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIILL(c0sac);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onPageSelected(int r6, boolean r7) {
        /*
            r5 = this;
            X.0SA7 r0 = new X.0SA7
            r0.<init>(r6, r5, r7)
            r5.withState(r0)
            X.0SAH r4 = r5.LLILLJJLI
            r4.LIZLLL(r6)
            if (r6 <= 0) goto L2d
            java.lang.Long r0 = r4.LJIIL
            if (r0 != 0) goto L2d
            X.0SAA r0 = r4.LIZ()
            r1 = 0
            if (r0 == 0) goto L2b
            java.lang.Long r0 = r0.LJIIJJI
            if (r0 == 0) goto L2b
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0.longValue()
            long r2 = r2 - r0
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
        L2b:
            r4.LJIIL = r1
        L2d:
            X.0SA5 r2 = r5.LLJILLL
            r2.getClass()
            X.1ER1 r3 = X.C1ER1.LIZIZ
            java.lang.String r0 = r2.LJI
            boolean r0 = r3.LJJJLL(r0)
            if (r0 == 0) goto L46
            java.lang.String r1 = r2.LJI
            java.lang.String r0 = ""
            java.util.Map r0 = r3.fetchSearchParams(r1, r0)
            r2.LJIILJJIL = r0
        L46:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r2.LJFF
            if (r0 == 0) goto L85
            int r0 = X.C0ST8.LIZJ(r0)
        L4e:
            r1 = 1
            int r0 = r0 - r1
            if (r6 != r0) goto L6b
            boolean r0 = r2.LJ
            if (r0 != 0) goto L5b
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r2.LIZ
            r0.invoke()
        L5b:
            r2.LJ = r1
        L5d:
            int r0 = r5.AQ2()
            int r0 = r0 - r1
            if (r6 != r0) goto L6a
            X.0SA5 r0 = r5.LLJILLL
            r0.LJ = r1
            r5.LLIZ = r1
        L6a:
            return
        L6b:
            if (r6 == 0) goto L79
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r2.LJFF
            if (r0 == 0) goto L83
            int r0 = X.C0ST8.LIZJ(r0)
        L75:
            int r0 = r0 + (-2)
            if (r6 != r0) goto L5d
        L79:
            boolean r0 = r2.LJ
            if (r0 == 0) goto L5d
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r2.LIZIZ
            r0.invoke()
            goto L5d
        L83:
            r0 = 0
            goto L75
        L85:
            r0 = 0
            goto L4e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ui.feed.photos.PhotoViewModelV2.onPageSelected(int, boolean):void");
    }

    public final void IQ2(Float f, Boolean bool, Float f2, String str) {
        setState(AFwS243S0000000_11.get$arr$(506));
        withState(new AwS21S1400000_11(this, f, bool, f2, str, 1));
    }
}
