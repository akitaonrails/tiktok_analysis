package kotlin.jvm.internal;

import X.C09AY;
import X.C0C64;
import X.C0LAB;
import X.C1428470nHB;
import X.C1449770npX;
import X.C1449780npY;
import X.C1450870nrJ;
import X.C1450940nrQ;
import X.C2341909Fp;
import X.C297700Blg;
import X.C426750GoL;
import X.C786410Ut5;
import X.C844470XAv;
import X.C857450XkN;
import X.InterfaceC1451100nrg;
import X.InterfaceC2342209Fs;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.StoryMultiImageParams;
import com.ss.android.ugc.aweme.creative.model.edit.crop.CropData;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public class AwS81S0500000_22 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS81S0500000_22 awS81S0500000_22) {
        Float fWM2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        ImageView.ScaleType scaleType;
        Bitmap bitmapLJIIJ;
        Integer num;
        List<SingleImageData> imageList;
        BitmapDrawable bitmapDrawable;
        float width = ((Bitmap) awS81S0500000_22.l0).getWidth() / ((Bitmap) awS81S0500000_22.l0).getHeight();
        StoryMultiImageParams storyMultiImageParams = ((C1450940nrQ) awS81S0500000_22.l1).LIZIZ.getEditImageInfo().getStoryMultiImageParams();
        InterfaceC1451100nrg interfaceC1451100nrg = ((C1450940nrQ) awS81S0500000_22.l1).LJIIIIZZ;
        Bitmap bitmap = null;
        if (interfaceC1451100nrg != null) {
            fWM2 = interfaceC1451100nrg.wM2(storyMultiImageParams);
        } else {
            fWM2 = null;
        }
        int size = 0;
        if (fWM2 != null) {
            z = true;
        } else {
            z = false;
        }
        CropData cropData = ((C1450940nrQ) awS81S0500000_22.l1).LIZIZ.getEditImageInfo().getCropData();
        if (cropData != null && cropData.isPhotoCropped()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z && storyMultiImageParams != null && storyMultiImageParams.getBgColorStart() != null && storyMultiImageParams.getCropScale() == null && z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean zLJIIJJI = ((C1450940nrQ) awS81S0500000_22.l1).LJIIJJI(width);
        if (z) {
            C1450940nrQ c1450940nrQ = (C1450940nrQ) awS81S0500000_22.l1;
            InterfaceC1451100nrg interfaceC1451100nrg2 = c1450940nrQ.LJIIIIZZ;
            if (interfaceC1451100nrg2 != null) {
                interfaceC1451100nrg2.N60(c1450940nrQ.LIZ, storyMultiImageParams);
            }
        } else {
            C1450940nrQ c1450940nrQ2 = (C1450940nrQ) awS81S0500000_22.l1;
            InterfaceC1451100nrg interfaceC1451100nrg3 = c1450940nrQ2.LJIIIIZZ;
            if (interfaceC1451100nrg3 != null) {
                interfaceC1451100nrg3.oG1(c1450940nrQ2.LIZ);
            }
            CropData cropData2 = ((C1450940nrQ) awS81S0500000_22.l1).LIZIZ.getEditImageInfo().getCropData();
            if (cropData2 != null && cropData2.isPhotoCropped()) {
                z4 = true;
            } else {
                z4 = false;
            }
            float ratio = ((C1450940nrQ) awS81S0500000_22.l1).LIZIZ.getEditImageInfo().getRatio();
            ImageView imageView = ((C1450940nrQ) awS81S0500000_22.l1).LIZ;
            if (z3) {
                scaleType = ImageView.ScaleType.FIT_CENTER;
            } else if (C0C64.LJIILLIIL().LJIIIZ(31744, "tools_creation_photo_edit_placeholder_scale_align_fix", true, true) && z4 && Math.abs(ratio - 0.5625f) < 1.0E-4f) {
                scaleType = ImageView.ScaleType.FIT_CENTER;
            } else if (zLJIIJJI || (C1450870nrJ.LJIIJ(width) && ((C1450940nrQ) awS81S0500000_22.l1).LIZIZ.getEditImageInfo().isFullScreen())) {
                scaleType = ImageView.ScaleType.CENTER_CROP;
            } else {
                scaleType = ImageView.ScaleType.FIT_CENTER;
            }
            imageView.setScaleType(scaleType);
            if (!z3 && width < C1450870nrJ.LJIIIZ() && ((C1450940nrQ) awS81S0500000_22.l1).LIZIZ.getEditImageInfo().getRatio() > 0.0f) {
                if (((C1450940nrQ) awS81S0500000_22.l1).LIZIZ.getEditImageInfo().getRatio() >= C1450870nrJ.LJIIIZ()) {
                    ((C1450940nrQ) awS81S0500000_22.l1).LIZ.setScaleType(ImageView.ScaleType.CENTER_CROP);
                }
                if (((C1450940nrQ) awS81S0500000_22.l1).LIZIZ.getEditImageInfo().getNeedCompileNle()) {
                    ((C1450940nrQ) awS81S0500000_22.l1).LIZ.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    float fLJIIIZ = C1450870nrJ.LJIIIZ();
                    if (fLJIIIZ > ((C1450940nrQ) awS81S0500000_22.l1).LIZIZ.getEditImageInfo().getRatio()) {
                        C844470XAv.LIZ.getClass();
                        int screenWidth = (int) (((ScreenUtils.getScreenWidth(C844470XAv.LIZ()) / fLJIIIZ) * (fLJIIIZ - ((C1450940nrQ) awS81S0500000_22.l1).LIZIZ.getEditImageInfo().getRatio())) / 2.0f);
                        C426750GoL.LJIIIZ(((C1450940nrQ) awS81S0500000_22.l1).LIZ, Integer.valueOf(screenWidth), null, Integer.valueOf(screenWidth), null, false, 26);
                    }
                }
            }
        }
        if (!((C1450940nrQ) awS81S0500000_22.l1).LIZIZ.getEditImageInfo().getNeedCompileNle()) {
            C426750GoL.LJIIIZ(((C1450940nrQ) awS81S0500000_22.l1).LIZ, 0, null, 0, null, false, 26);
        }
        Drawable drawable = ((C1450940nrQ) awS81S0500000_22.l1).LIZ.getDrawable();
        if ((drawable instanceof BitmapDrawable) && (bitmapDrawable = (BitmapDrawable) drawable) != null) {
            bitmap = bitmapDrawable.getBitmap();
        }
        if (C297700Blg.LIZ()) {
            bitmapLJIIJ = ((C1450940nrQ) awS81S0500000_22.l1).LJIIJ((Bitmap) awS81S0500000_22.l0);
        } else {
            bitmapLJIIJ = (Bitmap) awS81S0500000_22.l0;
        }
        ((C1450940nrQ) awS81S0500000_22.l1).LIZ.setImageBitmap(bitmapLJIIJ);
        C786410Ut5.LJZI(0, ((C1450940nrQ) awS81S0500000_22.l1).LIZ);
        if (bitmap != null) {
            bitmap.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
        }
        C1450940nrQ c1450940nrQ3 = (C1450940nrQ) awS81S0500000_22.l1;
        c1450940nrQ3.LJIILLIIL = true;
        c1450940nrQ3.LJIJ = false;
        if (((Long) awS81S0500000_22.l2) != null && (num = (Integer) awS81S0500000_22.l3) != null) {
            C857450XkN c857450XkN = C857450XkN.LIZ;
            VideoPublishEditModel videoPublishEditModel = c1450940nrQ3.LJII;
            int i = c1450940nrQ3.LIZLLL;
            int iIntValue = num.intValue();
            int width2 = ((Bitmap) awS81S0500000_22.l0).getWidth();
            int height = ((Bitmap) awS81S0500000_22.l0).getHeight();
            long jLongValue = ((Long) awS81S0500000_22.l2).longValue();
            boolean z5 = ((C1450940nrQ) awS81S0500000_22.l1).LJIILIIL;
            c857450XkN.getClass();
            List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("enter_from", "video_edit_page");
            c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
            c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
            c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
            c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
            ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
            if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
                size = imageList.size();
            }
            c0lab.LIZ(size, "pic_cnt");
            c0lab.LIZ(i + 1, "pic_location");
            c0lab.LIZ(iIntValue, "stage");
            c0lab.LIZ(width2, "width");
            c0lab.LIZ(height, "height");
            c0lab.LIZIZ(((long) width2) * ((long) height), "pixel_count");
            c0lab.LIZIZ(System.currentTimeMillis() - jLongValue, "duration");
            c0lab.LJFF("can_optimize", z5);
            C2341909Fp.LIZ("camera_multi_photo_image_load", c0lab.LIZ);
        }
        Function0 function0 = (Function0) awS81S0500000_22.l4;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS81S0500000_22 awS81S0500000_22) {
        ((C1449780npY) awS81S0500000_22.l0).LIZ.setServerRenderingCompleted(true);
        ((Function0) awS81S0500000_22.l1).invoke();
        ((Function1) awS81S0500000_22.l2).invoke("success");
        Effect effect = (Effect) awS81S0500000_22.l3;
        if (effect != null) {
            ((VideoPublishEditModel) awS81S0500000_22.l4).creativeModel.editEffectModel.defaultEffectList.add(effect);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS81S0500000_22(C1449780npY c1449780npY, Function0 function0, C1449770npX c1449770npX, Effect effect, VideoPublishEditModel videoPublishEditModel, int i) {
        super(0);
        this.$t = i;
        this.l0 = c1449780npY;
        this.l1 = function0;
        this.l2 = c1449770npX;
        this.l3 = effect;
        this.l4 = videoPublishEditModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS81S0500000_22(Bitmap bitmap, Bitmap bitmap2, C1450940nrQ c1450940nrQ, Long l, Integer num, Function0<Unit> function0) {
        super(0);
        this.$t = function0;
        this.l0 = bitmap;
        this.l1 = bitmap2;
        this.l2 = c1450940nrQ;
        this.l3 = l;
        this.l4 = num;
    }
}
