package com.ss.android.ugc.aweme.tako.multipletemplate.previewphoto;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C0L6X;
import X.C1322110kVd;
import X.C1336280ksU;
import X.C13LE;
import X.C1561230qjJ;
import X.C1602160rnK;
import X.C1853010yJv;
import X.C1862330yYx;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.InterfaceC20631915oL;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import android.widget.ImageView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.tako.multipletemplate.gallery.TakoPhotoChooseViewModel;
import com.ss.android.ugc.aweme.tako.multipletemplate.gallery.TikTokMediaModel;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS133S0101000_27;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes34.dex */
public final class PreviewImageCell extends PowerCell<C0L6X> implements InterfaceC20631915oL {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public final C01GW LL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 3502));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS577S0100000_33(this, 3512));
    public final AssemVMLazy LLILLL;
    public final boolean LLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(PreviewImageCell.class, "takoPhotoChooseViewModel", "getTakoPhotoChooseViewModel()Lcom/ss/android/ugc/aweme/tako/multipletemplate/gallery/TakoPhotoChooseViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC20631915oL
    public final void Z4() {
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.fqx;
    }

    public PreviewImageCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoPhotoChooseViewModel.class);
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 3518);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(250);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 3529), awS577S0100000_33, AFwS224S0000000_33.get$arr$(485), new AwS577S0100000_33((C03K6) this, 3503), new AwS577S0100000_33((C03K6) this, 3505), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3507), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 3509), null, new AwS577S0100000_33((C03K6) this, 3510));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 3504);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3506);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 3508);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 136));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 3511);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 3513);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 3514);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 3515);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 3516);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 3517), awS577S0100000_33, AFwS224S0000000_33.get$arr$(486), new AwS577S0100000_33((C03K6) this, 3519), new AwS577S0100000_33((C03K6) this, 3520), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 3521), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 3522), null, new AwS577S0100000_33((C03K6) this, 3523));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 3524), awS577S0100000_33, AFwS224S0000000_33.get$arr$(487), new AwS577S0100000_33((C03K6) this, 3525), new AwS577S0100000_33((C03K6) this, 3526), new AwS577S0100000_33((C03K6) this, 3527), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 3528));
        }
        this.LLILLL = assemVMLazy;
        C1561230qjJ.LIZ.getClass();
        this.LLILZ = C1561230qjJ.LIZ();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        if (this.LLILZ) {
            ImageView imageView = (ImageView) this.LLILLJJLI.getValue();
            int visibility = imageView.getVisibility();
            imageView.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, imageView);
            C786410Ut5.LLZZLLIL((C1322110kVd) this.LL.getValue(), 8);
            return;
        }
        C786410Ut5.LLZZLLIL((C1322110kVd) this.LL.getValue(), 0);
        ImageView imageView2 = (ImageView) this.LLILLJJLI.getValue();
        int visibility2 = imageView2.getVisibility();
        imageView2.setVisibility(8);
        C1602160rnK.LIZIZ(visibility2, 8, imageView2);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C0L6X c0l6x = (C0L6X) interfaceC1891350zJl;
        if (this.LLILZ) {
            C1336280ksU c1336280ksU = (C1336280ksU) this.LLILLJJLI.getValue();
            TikTokMediaModel tikTokMediaModel = c0l6x.LL;
            c1336280ksU.LIZJ();
            c1336280ksU.LL.reset();
            c1336280ksU.LLILLJJLI = 0;
            c1336280ksU.invalidate();
            I5(c1336280ksU, tikTokMediaModel, false);
            return;
        }
        I5((C1322110kVd) this.LL.getValue(), c0l6x.LL, false);
    }

    @Override // X.InterfaceC20631915oL
    public final void onPageSelected(int i) {
        String enterFrom;
        String enterMethod;
        String str;
        String str2;
        String str3;
        String pageSource;
        String mode;
        String modeSource;
        Map<String, String> commonMobParams;
        Map<String, String> commonMobParams2;
        Map<String, String> commonMobParams3;
        AssemVMLazy assemVMLazy = this.LLILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZIL;
        TakoPhotoChooseViewModel takoPhotoChooseViewModel = (TakoPhotoChooseViewModel) assemVMLazy.getValue();
        int position = takoPhotoChooseViewModel.getState().LL.getPosition();
        if (!takoPhotoChooseViewModel.LL && (position < 0 || position != i)) {
            return;
        }
        takoPhotoChooseViewModel.LL = true;
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        C1853010yJv c1853010yJv = takoPhotoChooseViewModel.LLJILJIL;
        String str4 = "";
        if (c1853010yJv == null || (enterFrom = c1853010yJv.getEnterFrom()) == null) {
            enterFrom = "";
        }
        C1853010yJv c1853010yJv2 = takoPhotoChooseViewModel.LLJILJIL;
        if (c1853010yJv2 == null || (enterMethod = c1853010yJv2.getEnterMethod()) == null) {
            enterMethod = "";
        }
        C1853010yJv c1853010yJv3 = takoPhotoChooseViewModel.LLJILJIL;
        if (c1853010yJv3 == null || (commonMobParams3 = c1853010yJv3.getCommonMobParams()) == null || (str = commonMobParams3.get("process_id")) == null) {
            str = "";
        }
        C1853010yJv c1853010yJv4 = takoPhotoChooseViewModel.LLJILJIL;
        if (c1853010yJv4 == null || (commonMobParams2 = c1853010yJv4.getCommonMobParams()) == null || (str2 = commonMobParams2.get("tako_session_id")) == null) {
            str2 = "";
        }
        C1853010yJv c1853010yJv5 = takoPhotoChooseViewModel.LLJILJIL;
        if (c1853010yJv5 == null || (commonMobParams = c1853010yJv5.getCommonMobParams()) == null || (str3 = commonMobParams.get("tako_chat_id")) == null) {
            str3 = "";
        }
        C1853010yJv c1853010yJv6 = takoPhotoChooseViewModel.LLJILJIL;
        if (c1853010yJv6 == null || (pageSource = c1853010yJv6.getPageSource()) == null) {
            pageSource = "";
        }
        C1853010yJv c1853010yJv7 = takoPhotoChooseViewModel.LLJILJIL;
        if (c1853010yJv7 != null) {
            mode = c1853010yJv7.getMode();
        } else {
            mode = null;
        }
        C1853010yJv c1853010yJv8 = takoPhotoChooseViewModel.LLJILJIL;
        if (c1853010yJv8 != null && (modeSource = c1853010yJv8.getModeSource()) != null) {
            str4 = modeSource;
        }
        C1862330yYx.LJJ(c1862330yYx, enterFrom, enterMethod, str, str2, str3, pageSource, "click_image", "", null, mode, str4, null, null, null, takoPhotoChooseViewModel.vQ2(true), 47360);
        takoPhotoChooseViewModel.withState(new AwS133S0101000_27(i, takoPhotoChooseViewModel, 5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Type inference failed for: r0v8, types: [REQUEST, X.0kbR] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void I5(X.C1322110kVd r7, com.ss.android.ugc.aweme.tako.multipletemplate.gallery.TikTokMediaModel r8, boolean r9) {
        /*
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.RGB_565
            X.0kTX r3 = X.C1322200kVm.LIZJ()
            java.lang.String r0 = r8.LJFF()
            if (r9 == 0) goto L8e
            if (r0 == 0) goto L14
            android.net.Uri r6 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)
            if (r6 != 0) goto L16
        L14:
            android.net.Uri r6 = android.net.Uri.EMPTY
        L16:
            java.lang.String r1 = r8.mimeType
            java.lang.String r0 = "image/heic"
            boolean r5 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            java.lang.String r1 = r8.thumbnail
            if (r1 == 0) goto L4b
            boolean r0 = kotlin.text.a0.LJJJIL(r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L4b
            android.net.Uri r0 = X.C2471909mP.LJIILIIL(r1)
            if (r0 == 0) goto L4b
            X.0kbQ r2 = X.C1325700kbQ.LIZLLL(r0)
            com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder r1 = new com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder
            r1.<init>()
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565
            r1.setBitmapConfig(r0)
            X.0khK r0 = new X.0khK
            r0.<init>(r1)
            r2.LJFF = r0
            X.0kbR r0 = r2.LIZ()
            if (r0 != 0) goto L6b
        L4b:
            X.0kbQ r2 = X.C1325700kbQ.LIZLLL(r6)
            com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder r1 = new com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder
            r1.<init>()
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565
            r1.setBitmapConfig(r0)
            X.0khK r0 = new X.0khK
            r0.<init>(r1)
            r2.LJFF = r0
            if (r5 == 0) goto L67
            r0 = 0
            r2.LJIILJJIL = r0
            r2.LJIILLIIL = r0
        L67:
            X.0kbR r0 = r2.LIZ()
        L6b:
            r3.LJ = r0
            X.0kbQ r2 = X.C1325700kbQ.LIZLLL(r6)
            com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder r1 = new com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder
            r1.<init>()
            r1.setBitmapConfig(r4)
            X.0khK r0 = new X.0khK
            r0.<init>(r1)
            r2.LJFF = r0
            X.0kbR r0 = r2.LIZ()
            r3.LIZLLL = r0
            X.0kTN r0 = r3.LIZ()
            r7.setController(r0)
            return
        L8e:
            android.net.Uri r6 = X.C2471909mP.LJIILIIL(r0)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.multipletemplate.previewphoto.PreviewImageCell.I5(X.0kVd, com.ss.android.ugc.aweme.tako.multipletemplate.gallery.TikTokMediaModel, boolean):void");
    }
}
