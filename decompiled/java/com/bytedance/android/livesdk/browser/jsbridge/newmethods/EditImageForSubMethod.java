package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import X.AbstractC1835360xrS;
import X.AnonymousClass1676;
import X.AnonymousClass1677;
import X.C09CT;
import X.C09JN;
import X.C0L0G;
import X.C1161920gLG;
import X.C11NZ;
import X.C11S5;
import X.C1701940uOG;
import X.C19EG;
import X.C20689715xf;
import X.C207212166o;
import X.C2204771BQt;
import X.C259800zU;
import X.EnumC1782750wUb;
import X.EnumC207219166v;
import X.InterfaceC1487280oo2;
import Y.AfS165S0200000_31;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.browser.emote.CropEmoteFragment;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.EditImageForSubMethod;
import com.bytedance.android.livesdkapi.host.IHostSubscription;
import com.bytedance.android.livesdkapi.subscribe.emote.LiveSubMediaModel;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkFragment;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS645S0100000_31;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes32.dex */
public final class EditImageForSubMethod extends AbstractC1835360xrS<Params, Result> {
    public Params LLILZIL;
    public Fragment LLILZLL;
    public final C207212166o LLIZ = new AnonymousClass1676() { // from class: X.166o
        public final EditImageForSubMethod.Result LIZ = new EditImageForSubMethod.Result();

        @Override // X.AnonymousClass1676
        public final void LIZ() {
            this.LIZ.editStatus = 1;
            this.LIZIZ.LJIIJ(this.LIZ, null, null);
        }

        @Override // X.AnonymousClass1676
        public final void LIZIZ() {
            this.LIZ.editStatus = 2;
            this.LIZIZ.LJIIJ(this.LIZ, null, null);
        }

        @Override // X.AnonymousClass1676
        public final void LIZJ(C207221166x c207221166x) {
            Integer numValueOf;
            this.LIZ.editStatus = 0;
            EditImageForSubMethod editImageForSubMethod = this.LIZIZ;
            EditImageForSubMethod.Result result = this.LIZ;
            Bitmap bitmap = c207221166x.LIZIZ;
            LiveSubMediaModel liveSubMediaModel = c207221166x.LIZ;
            if (liveSubMediaModel != null) {
                numValueOf = Integer.valueOf(liveSubMediaModel.getWithTextSticker());
            } else {
                numValueOf = null;
            }
            editImageForSubMethod.LJIIJ(result, bitmap, numValueOf);
        }
    };

    public static final class Params {

        @C09CT("base64Data")
        public String base64;

        @C09CT("emotes_show_style")
        public int emotesShowStyle;

        @C09CT("logInfo")
        public Map<String, ? extends Object> logInfo = new HashMap();

        @C09CT("max_height")
        public int max_height;

        @C09CT("max_size")
        public int max_size;

        @C09CT("max_width")
        public int max_width;

        @C09CT("min_height")
        public int min_height;

        @C09CT("min_width")
        public int min_width;

        @C09CT("url")
        public String url;
    }

    public static final class Result {

        @C09CT("edit_status")
        public Integer editStatus = 0;

        @C09CT("tempFiles")
        public PhotoFile tempFiles;

        public static final class PhotoFile {

            @C09CT("base64Data")
            public String base64;

            @C09CT("path")
            public String path;

            @C09CT("size")
            public int size;

            @C09CT("with_text_sticker")
            public int withTextSticker;
        }
    }

    @Override // X.AbstractC1835360xrS
    public final void LJIIIZ() {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.166o] */
    public EditImageForSubMethod(SparkContext sparkContext) {
        Fragment next;
        Object objLJJIJLIJ = sparkContext.LJJIJLIJ();
        if (objLJJIJLIJ instanceof SparkPopup) {
            this.LLILZLL = (Fragment) objLJJIJLIJ;
            return;
        }
        if (!(objLJJIJLIJ instanceof C19EG)) {
            return;
        }
        Iterator<Fragment> it2 = ((C19EG) objLJJIJLIJ).getSupportFragmentManager().LJJLIIIJL().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next instanceof SparkFragment) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        this.LLILZLL = next;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [T, android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r0v14, types: [T, android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r0v18, types: [T, android.graphics.Bitmap] */
    @Override // X.AbstractC1835360xrS
    public final void LJII(Params params, C2204771BQt c2204771BQt) {
        Params params2 = params;
        this.LLILZIL = params2;
        String str = params2.base64;
        final String str2 = params2.url;
        final C259800zU c259800zU = new C259800zU();
        C259800zU c259800zU2 = new C259800zU();
        if (str != null) {
            if (u.LJJIIJZLJL(str, "data:image/jpg;base64,", false)) {
                String strLJJLIL = a0.LJJLIL(str, "data:image/jpg;base64,", str);
                byte[] bArrDecode = Base64.decode(strLJJLIL, 0);
                c259800zU.element = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                LJIIJJI(C20689715xf.LIZ(strLJJLIL), (Bitmap) c259800zU.element);
                return;
            }
            if (u.LJJIIJZLJL(str, "data:image/png;base64,", false)) {
                String strLJJLIL2 = a0.LJJLIL(str, "data:image/png;base64,", str);
                byte[] bArrDecode2 = Base64.decode(strLJJLIL2, 0);
                c259800zU.element = BitmapFactory.decodeByteArray(bArrDecode2, 0, bArrDecode2.length);
                LJIIJJI(C20689715xf.LIZ(strLJJLIL2), (Bitmap) c259800zU.element);
                return;
            }
            if (u.LJJIIJZLJL(str, "data:image/webp;base64,", false)) {
                String strLJJLIL3 = a0.LJJLIL(str, "data:image/webp;base64,", str);
                byte[] bArrDecode3 = Base64.decode(strLJJLIL3, 0);
                c259800zU.element = BitmapFactory.decodeByteArray(bArrDecode3, 0, bArrDecode3.length);
                LJIIJJI(C20689715xf.LIZ(strLJJLIL3), (Bitmap) c259800zU.element);
                return;
            }
        }
        if (str2 == null) {
            return;
        }
        C11NZ.LJJJJZ(0).LJL(C11S5.LIZ()).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0fBw
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                try {
                    C1515210pX5 c1515210pX5LIZLLL = C1515210pX5.LIZLLL();
                    String str3 = str2;
                    ArrayList arrayList = new ArrayList();
                    c1515210pX5LIZLLL.getClass();
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(((C1500860p9w) C1515210pX5.LIZ(str3, arrayList)).LIZ().LJ);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    C842030X1l.LIZ(byteArrayInputStream, byteArrayOutputStream);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    c259800zU.element = (T) BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
                    return c259800zU.element;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C20441214yg.LJI("EditImageForSubMethod", e);
                    return null;
                }
            }
        }).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS165S0200000_31(this, c259800zU2, 0), new C09JN() { // from class: X.00qS
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("EditImageForSubMethod@d1f7.startCropFragment$3");
                C20441214yg.LJI("EditImageForSubMethod", (Throwable) obj);
                C1C7U.LIZIZ("EditImageForSubMethod@d1f7.startCropFragment$3");
            }
        });
    }

    public final void LJIIJJI(CropEmoteFragment cropEmoteFragment, Bitmap bitmap) {
        FragmentManager fragmentManager;
        EnumC1782750wUb enumC1782750wUb;
        FragmentManager childFragmentManager;
        Params params = this.LLILZIL;
        if (params != null) {
            if (bitmap == null || bitmap.getWidth() * bitmap.getHeight() <= params.max_size) {
                int i = params.emotesShowStyle;
                if (i != 1 && i != 2) {
                    cropEmoteFragment.LLJILJIL = new AwS645S0100000_31(this, 16);
                    Fragment fragment = this.LLILZLL;
                    if (fragment != null && (childFragmentManager = fragment.getChildFragmentManager()) != null) {
                        cropEmoteFragment.show(childFragmentManager, "upload_photo");
                        return;
                    }
                    return;
                }
                Fragment fragment2 = this.LLILZLL;
                if (fragment2 == null || (fragmentManager = fragment2.getFragmentManager()) == null) {
                    return;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.putAll(params.logInfo);
                linkedHashMap.put("entrance", "edit");
                if (bitmap.getWidth() == bitmap.getHeight()) {
                    enumC1782750wUb = EnumC1782750wUb.XY_SCALE_TO_CENTER;
                } else {
                    enumC1782750wUb = EnumC1782750wUb.XY_MOVE_TO_CENTER;
                }
                EnumC207219166v enumC207219166v = EnumC207219166v.BITMAP;
                int i2 = params.emotesShowStyle;
                new C0L0G(params.min_width, params.min_height, params.max_width, params.max_height, params.max_size);
                ((IHostSubscription) C1161920gLG.LIZJ(IHostSubscription.class)).iQ1(new AnonymousClass1677(fragmentManager, enumC1782750wUb, enumC207219166v, i2, linkedHashMap, true, bitmap, null, null, this.LLIZ, 1792));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:43:0x00ec
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(com.bytedance.android.livesdk.browser.jsbridge.newmethods.EditImageForSubMethod.Result r12, android.graphics.Bitmap r13, java.lang.Integer r14) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.jsbridge.newmethods.EditImageForSubMethod.LJIIJ(com.bytedance.android.livesdk.browser.jsbridge.newmethods.EditImageForSubMethod$Result, android.graphics.Bitmap, java.lang.Integer):void");
    }
}
