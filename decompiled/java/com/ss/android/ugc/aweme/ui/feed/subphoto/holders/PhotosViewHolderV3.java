package com.ss.android.ugc.aweme.ui.feed.subphoto.holders;

import X.C01GW;
import X.C0SLJ;
import X.C0SM0;
import X.C0SM1;
import X.C0SM7;
import X.C0SM8;
import X.C0SMS;
import X.C0SPL;
import X.C123100dR;
import X.C1351210lGZ;
import X.C13LP;
import X.C18039074r;
import X.C18042074u;
import X.C2188811AlT;
import X.C2344809Gs;
import X.C281430B1h;
import X.C298560Bn4;
import X.C339190DRl;
import X.C452501pT;
import X.C717470SCj;
import X.C719890SLr;
import X.C719940SLw;
import X.C719950SLx;
import X.C720360SNm;
import X.C721190SQr;
import X.EnumC719760SLe;
import X.InterfaceC469401sC;
import X.InterfaceC719460SKa;
import X.InterfaceC719500SKe;
import Y.ARunnableS22S0101000_11;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.experiment.ExpandVideoConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImage;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService;
import com.ss.android.ugc.aweme.model.SlidesImageLoadParams;
import com.ss.android.ugc.aweme.ui.feed.photos.assem.FeedPhotoSlidesAdapter$createAssemVHContainer$1;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public abstract class PhotosViewHolderV3 extends PhotoAssemViewHolder implements InterfaceC719460SKa {
    public final View LLILZIL;
    public final C0SLJ LLILZLL;
    public final C0SM7 LLIZ;
    public final ViewGroup LLIZLLLIL;
    public final C0SM8 LLJ;
    public final C0SM1 LLJI;
    public final Context LLJIJIL;
    public final C01GW LLJILJIL;
    public C719950SLx LLJILJILJ;
    public boolean LLJILLL;
    public Bitmap LLJJ;
    public SlidesImageLoadParams LLJJI;
    public Bitmap LLJJIII;
    public C0SM0 LLJJIJI;
    public int LLJJIJIIJIL;
    public int LLJJIJIL;
    public int LLJJJ;
    public ARunnableS22S0101000_11 LLJJJIL;
    public ARunnableS22S0101000_11 LLJJJJ;
    public final CopyOnWriteArrayList<SlidesImageLoadParams> LLJJJJJIL;
    public boolean LLJJJJLIIL;

    @Override // X.InterfaceC719460SKa
    public void LIZLLL(int i, int i2) {
    }

    @Override // X.InterfaceC719460SKa
    public FrameLayout LJ() {
        return null;
    }

    public void LJIIIIZZ(Drawable drawable) {
    }

    @Override // X.InterfaceC719460SKa
    public boolean LJIIIZ() {
        return false;
    }

    @Override // X.InterfaceC719460SKa
    public String LJIIJJI() {
        return null;
    }

    public final void LJIIZILJ() {
        this.LLJJ = null;
        this.LLJJI = null;
    }

    public abstract C0SMS LJIJJ();

    public boolean LJJII() {
        return false;
    }

    public abstract void LJJIIZ(Bitmap bitmap);

    public String LJJIJ() {
        return null;
    }

    @Override // X.InterfaceC719460SKa
    public View getImageView() {
        return null;
    }

    @Override // X.InterfaceC719460SKa
    public RectF I8() {
        return new RectF();
    }

    @Override // X.InterfaceC719460SKa
    public RectF LIZJ() {
        return new RectF();
    }

    @Override // X.InterfaceC719460SKa
    public final Bitmap LJIIL() {
        Bitmap bitmap = this.LLJJ;
        if (bitmap != null && (!bitmap.isRecycled())) {
            C721190SQr c721190SQr = C721190SQr.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PhotosViewHolderV3 ");
            sbLIZ.append(hashCode());
            sbLIZ.append(" getCurrentShownBitmap reuse: ");
            sbLIZ.append(bitmap.hashCode());
            C2188811AlT.LIZIZ(sbLIZ);
            c721190SQr.getClass();
            return bitmap;
        }
        Bitmap bitmapLJIJI = LJIJI();
        if (bitmapLJIJI == null) {
            return null;
        }
        this.LLJJ = bitmapLJIJI;
        C721190SQr c721190SQr2 = C721190SQr.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("PhotosViewHolderV3 ");
        sbLIZ2.append(hashCode());
        sbLIZ2.append(" getCurrentShownBitmap: ");
        sbLIZ2.append(bitmapLJIJI.hashCode());
        C2188811AlT.LIZIZ(sbLIZ2);
        c721190SQr2.getClass();
        return bitmapLJIJI;
    }

    @Override // X.InterfaceC719460SKa
    public final Bitmap LJIILIIL() {
        Bitmap bitmap = this.LLJJIII;
        if (bitmap == null || !(!bitmap.isRecycled())) {
            return null;
        }
        return bitmap;
    }

    public final Aweme LJIJ() {
        VideoItemParams videoItemParams;
        C719950SLx c719950SLx = this.LLJILJILJ;
        if (c719950SLx == null || (videoItemParams = c719950SLx.LLILLL) == null) {
            return null;
        }
        return videoItemParams.getAweme();
    }

    public Bitmap LJIJI() {
        Bitmap.Config config;
        Bitmap bitmap = this.LLJJ;
        if (bitmap == null || (config = bitmap.getConfig()) == null) {
            return null;
        }
        return bitmap.copy(config, false);
    }

    public final void LJJ() {
        if (this.LLJILLL) {
            return;
        }
        this.LLJILLL = true;
        if (C0SPL.LIZ()) {
            ExpandVideoConfig expandVideoConfig = (ExpandVideoConfig) C0SPL.LIZIZ.getValue();
            if (expandVideoConfig == null) {
                expandVideoConfig = C0SPL.LIZ;
            }
            if (expandVideoConfig.expandVibrationType == 1) {
                if (Build.VERSION.SDK_INT >= 29) {
                    ((C1351210lGZ) this.LLJILJIL.getValue()).LIZ();
                } else {
                    ((C1351210lGZ) this.LLJILJIL.getValue()).LIZIZ(85, 61);
                }
            }
        }
    }

    public boolean LJJI() {
        return this.LLJJIJIIJIL == -1 && this.LLJJIJIL == -1;
    }

    public boolean LJJIII() {
        return this.LLJJIJIIJIL == -1 && this.LLJJIJIL == -1;
    }

    public void LJJIIZI() {
        HandlerHook.viewRemoveCallbacks(this.LLILZIL, null);
        HandlerHook.viewRemoveCallbacks(this.LLILZIL, this.LLJJJIL);
        HandlerHook.viewRemoveCallbacks(this.LLILZIL, this.LLJJJJ);
    }

    public void LJJIJIL() {
        C0SMS c0smsLJIJJ;
        if (this.LLJJIJIIJIL != -1 || this.LLJILJILJ == null || (c0smsLJIJJ = LJIJJ()) == null) {
            return;
        }
        int i = C0SMS.LJJIIZ;
        c0smsLJIJJ.LJIIIZ(C0SM0.NONE);
    }

    @Override // X.InterfaceC719460SKa
    public final SlidesImageLoadParams LJII() {
        C0SMS c0smsLJIJJ = LJIJJ();
        SlidesImageLoadParams slidesImageLoadParams = c0smsLJIJJ != null ? c0smsLJIJJ.LJJIFFI : null;
        this.LLJJI = slidesImageLoadParams;
        return slidesImageLoadParams;
    }

    public void LJIL() {
        ((HomePageUIFrameService) ServiceManager.get().getService(HomePageUIFrameService.class)).setTitleTabVisibility(false);
        this.LLILZLL.N();
    }

    public final boolean LJJIFFI() {
        C0SMS c0smsLJIJJ = LJIJJ();
        return c0smsLJIJJ != null && c0smsLJIJJ.LJJII.LJIIIZ.getVisibility() == 0;
    }

    public final void LJJIIJZLJL() {
        C0SMS c0smsLJIJJ = LJIJJ();
        if (c0smsLJIJJ != null) {
            c0smsLJIJJ.LJIILLIIL = 0;
            c0smsLJIJJ.LJJII.LJ();
            C719940SLw c719940SLw = c0smsLJIJJ.LJIILL;
            if (c719940SLw != null) {
                c0smsLJIJJ.LJFF(c719940SLw.LIZ, c719940SLw.LIZIZ, c719940SLw.LIZJ, c719940SLw.LIZLLL, c719940SLw.LJ, c719940SLw.LJFF);
            }
        }
    }

    public void LJJIJLIJ() {
        C0SMS c0smsLJIJJ = LJIJJ();
        if (c0smsLJIJJ != null) {
            c0smsLJIJJ.LJIIIIZZ();
        }
        this.LLJILJILJ = null;
        this.LLJILLL = false;
        LJJIJIIJI(null, false, null);
        this.LLJJJJJIL.clear();
    }

    @Override // X.InterfaceC719460SKa
    public final String getImageUrl() {
        Boolean bool;
        UrlModel urlModel;
        String str;
        C0SMS c0smsLJIJJ = LJIJJ();
        String str2 = c0smsLJIJJ != null ? c0smsLJIJJ.LJIIIIZZ : null;
        if (C123100dR.LIZ(str2)) {
            return str2;
        }
        Aweme awemeLJIJ = LJIJ();
        if (awemeLJIJ != null) {
            int i = this.LLILLL;
            C719950SLx c719950SLx = this.LLJILJILJ;
            if (c719950SLx != null && (bool = c719950SLx.LLILZIL) != null) {
                bool.booleanValue();
                PhotoModeImage photoModeImageLJIILIIL = C720360SNm.LJIILIIL(awemeLJIJ, i, false);
                if (photoModeImageLJIILIIL != null) {
                    if (!C281430B1h.LIZ() || bool.booleanValue() || (urlModel = photoModeImageLJIILIIL.translatedUrlModel) == null) {
                        urlModel = photoModeImageLJIILIIL.urlModel;
                        if (urlModel != null) {
                        }
                    }
                    List<String> urlList = urlModel.getUrlList();
                    return (urlList == null || (str = (String) C13LP.LJJJLZIJ(0, urlList)) == null) ? "" : str;
                }
            }
        }
        return null;
    }

    @Override // X.InterfaceC719460SKa
    public final View LJI() {
        return this.LL;
    }

    @Override // X.InterfaceC719460SKa
    public final CopyOnWriteArrayList<SlidesImageLoadParams> LJIIJ() {
        return this.LLJJJJJIL;
    }

    public C0SM0 LJJIJIIJIL() {
        return C0SM0.NONE;
    }

    public InterfaceC469401sC LJIILLIIL(C719950SLx c719950SLx) {
        VideoItemParams videoItemParams;
        Aweme aweme;
        PhotoModeImage photoModeImageLJIILIIL;
        UrlModel urlModel;
        Integer numValueOf;
        Integer numValueOf2;
        C0SM1 c0sm1;
        Bitmap bitmapHC1;
        TuxTextView tuxTextView;
        if (Intrinsics.LJFF(c719950SLx, this.LLJILJILJ)) {
            return null;
        }
        LJJIJLIJ();
        this.LLJILJILJ = c719950SLx;
        if (this.LLIZ.SC()) {
            C0SM1 c0sm12 = this.LLJI;
            if (c0sm12 != null) {
                numValueOf = Integer.valueOf(c0sm12.Ve1());
            } else {
                numValueOf = null;
            }
            C719950SLx c719950SLx2 = this.LLJILJILJ;
            if (c719950SLx2 != null) {
                numValueOf2 = Integer.valueOf(c719950SLx2.LL);
            } else {
                numValueOf2 = null;
            }
            if (Intrinsics.LJFF(numValueOf, numValueOf2) && (c0sm1 = this.LLJI) != null && (bitmapHC1 = c0sm1.hC1()) != null && (!bitmapHC1.isRecycled())) {
                this.LLJJJJLIIL = true;
                LJJIJIIJI(bitmapHC1, true, this.LLJI.j90());
                C0SM1 c0sm13 = this.LLJI;
                if (c0sm13 != null) {
                    c0sm13.uQ1();
                }
                C0SMS c0smsLJIJJ = LJIJJ();
                if (c0smsLJIJJ != null) {
                    SlidesImageLoadParams slidesImageLoadParams = this.LLJJI;
                    c0smsLJIJJ.LJI = true;
                    C719890SLr c719890SLr = c0smsLJIJJ.LJJII;
                    c719890SLr.LIZJ();
                    C339190DRl.LIZIZ(c719890SLr.LJIIIZ);
                    if (C298560Bn4.LIZ() && (tuxTextView = c719890SLr.LJI) != null) {
                        C339190DRl.LIZIZ(tuxTextView);
                    }
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    c0smsLJIJJ.LJIIJJI = jElapsedRealtime;
                    if (slidesImageLoadParams == null) {
                        C2344809Gs.LIZLLL(6, "handle_local_bitmap", "empty slidesImageLoadParams");
                    } else {
                        SlidesImageLoadParams slidesImageLoadParamsLIZ = SlidesImageLoadParams.LIZ(slidesImageLoadParams, jElapsedRealtime, null, null, null, null, null, null, null, 0, null, null, 0, -2, 127);
                        InterfaceC719500SKe interfaceC719500SKe = c0smsLJIJJ.LIZIZ;
                        if (interfaceC719500SKe != null) {
                            interfaceC719500SKe.p2(slidesImageLoadParamsLIZ);
                        }
                    }
                }
                this.LLJI.qO0();
                C717470SCj.LIZ.getClass();
                if (C717470SCj.LJIIIIZZ == null) {
                    C717470SCj.LJIIIIZZ = Long.valueOf(System.currentTimeMillis() - C717470SCj.LJ);
                }
                return null;
            }
        }
        SystemClock.elapsedRealtime();
        if (c719950SLx != null && (videoItemParams = c719950SLx.LLILLL) != null && (aweme = videoItemParams.getAweme()) != null && (photoModeImageLJIILIIL = C720360SNm.LJIILIIL(aweme, this.LLILLL, false)) != null && (urlModel = photoModeImageLJIILIIL.urlModel) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("photoViewHolderV3 ----> ");
            sbLIZ.append(aweme.getAid());
            sbLIZ.append(", urlModel ");
            sbLIZ.append(urlModel.getUrlList());
            C2188811AlT.LIZIZ(sbLIZ);
        }
        C0SM0 c0sm0LJJIJIIJIL = LJJIJIIJIL();
        C0SMS c0smsLJIJJ2 = LJIJJ();
        if (c0smsLJIJJ2 != null) {
            c0smsLJIJJ2.LJFF(c719950SLx.LL, c719950SLx.LLILLJJLI, c719950SLx.LLILLL, c0sm0LJJIJIIJIL, this.LLJJJ, c719950SLx.LLILZIL);
        }
        return null;
    }

    public void LJJIIJ(int i) {
        C0SM8 c0sm8;
        LJJIIZI();
        if (LJJII() && (c0sm8 = this.LLJ) != null) {
            c0sm8.LIZLLL(i);
        }
        this.LLJJJIL = new ARunnableS22S0101000_11(i, this, 0);
        this.LLJJJJ = new ARunnableS22S0101000_11(i, this, 1);
        ARunnableS22S0101000_11 aRunnableS22S0101000_11 = this.LLJJJIL;
        if (aRunnableS22S0101000_11 != null) {
            HandlerHook.viewPostDelay(this.LLILZIL, aRunnableS22S0101000_11, ((Number) C18042074u.LIZ.getValue()).longValue());
        }
        ARunnableS22S0101000_11 aRunnableS22S0101000_112 = this.LLJJJJ;
        if (aRunnableS22S0101000_112 != null) {
            HandlerHook.viewPostDelay(this.LLILZIL, aRunnableS22S0101000_112, ((Number) C18039074r.LIZ.getValue()).longValue());
        }
    }

    public final void LJJIJIIJI(Bitmap bitmap, boolean z, SlidesImageLoadParams slidesImageLoadParams) {
        boolean z2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PhotoMode Bitmap is set position: ");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(" isSet: ");
        if (bitmap != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        sbLIZ.append(z2);
        sbLIZ.append(" isFullpage: ");
        sbLIZ.append(this.LLIZ.SC());
        sbLIZ.append(' ');
        C2188811AlT.LIZIZ(sbLIZ);
        if (bitmap != null) {
            this.LLJJ = bitmap;
            this.LLJJI = slidesImageLoadParams;
            this.LLJJIJIIJIL = bitmap.getWidth();
            this.LLJJIJIL = bitmap.getHeight();
            if (z) {
                LJJIIZ(bitmap);
                return;
            }
            return;
        }
        this.LLJJ = null;
        this.LLJJI = null;
        this.LLJJIJIIJIL = -1;
        this.LLJJIJIL = -1;
    }

    public void LJIJJLI(float f, boolean z, EnumC719760SLe enumC719760SLe, float f2, String str) {
        ((HomePageUIFrameService) ServiceManager.get().getService(HomePageUIFrameService.class)).setTitleTabVisibility(true);
        this.LLILZLL.w2(f, z, enumC719760SLe, f2, str, LJJIJ());
        if (C0SPL.LIZ()) {
            ExpandVideoConfig expandVideoConfig = (ExpandVideoConfig) C0SPL.LIZIZ.getValue();
            if (expandVideoConfig == null) {
                expandVideoConfig = C0SPL.LIZ;
            }
            if (expandVideoConfig.expandVibrationType == 2 && this.LLJILLL) {
                if (Build.VERSION.SDK_INT >= 29) {
                    ((C1351210lGZ) this.LLJILJIL.getValue()).LIZ();
                } else {
                    ((C1351210lGZ) this.LLJILJIL.getValue()).LIZIZ(85, 61);
                }
            }
        }
        this.LLJILLL = false;
    }

    public PhotosViewHolderV3(View view, C0SLJ c0slj, C0SM7 c0sm7, ViewGroup viewGroup, C0SM8 c0sm8, C0SM1 c0sm1, FeedPhotoSlidesAdapter$createAssemVHContainer$1 feedPhotoSlidesAdapter$createAssemVHContainer$1) {
        super(view, feedPhotoSlidesAdapter$createAssemVHContainer$1);
        this.LLILZIL = view;
        this.LLILZLL = c0slj;
        this.LLIZ = c0sm7;
        this.LLIZLLLIL = viewGroup;
        this.LLJ = c0sm8;
        this.LLJI = c0sm1;
        this.LLJIJIL = view.getContext();
        this.LLJILJIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 35));
        this.LLJJIJI = C0SM0.NONE;
        this.LLJJIJIIJIL = -1;
        this.LLJJIJIL = -1;
        this.LLJJJJJIL = new CopyOnWriteArrayList<>();
    }
}
