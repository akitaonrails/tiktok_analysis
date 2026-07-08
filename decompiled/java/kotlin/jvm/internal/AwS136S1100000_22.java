package kotlin.jvm.internal;

import X.C09AY;
import X.C0C64;
import X.C1416070mxB;
import X.C1416470mxp;
import X.C1418670n1N;
import X.C1422410n7P;
import X.C1424190nAH;
import X.C1454020nwO;
import X.C1454230nwj;
import X.C1457740o2O;
import X.C2097608Jq;
import X.C21665519qf;
import X.C21665719qh;
import X.C2477909nN;
import X.C375830EoP;
import X.C527950KnB;
import android.graphics.Bitmap;
import com.bytedance.ies.smartmovie.jni.PictureInfo;
import com.bytedance.ies.smartmovie.jni.SmartMovieJniJNI;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import java.nio.ByteBuffer;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public class AwS136S1100000_22 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS136S1100000_22 awS136S1100000_22, Object obj) {
        return C21665519qf.LIZ((C21665519qf) obj, null, null, null, new C375830EoP((C21665719qh) awS136S1100000_22.l1), null, awS136S1100000_22.s0, null, 703);
    }

    public static final Object invoke$1(AwS136S1100000_22 awS136S1100000_22, Object obj) {
        String str = awS136S1100000_22.s0;
        return C1454230nwj.LIZ((C1454230nwj) obj, str, ((C1454020nwO) awS136S1100000_22.l1).I7(str), null, null, 1951);
    }

    public static final Object invoke$2(AwS136S1100000_22 awS136S1100000_22, Object obj) {
        C1418670n1N c1418670n1N = (C1418670n1N) obj;
        C1416070mxB c1416070mxB = c1418670n1N.LJIJJ.get(((AutoCutThemeData) awS136S1100000_22.l1).uuid);
        if (c1416070mxB == null) {
            c1416070mxB = new C1416070mxB(0);
        }
        return C1418670n1N.LIZ(c1418670n1N, null, null, false, false, false, null, null, null, null, null, null, false, 0, C2097608Jq.LJIILIIL(c1418670n1N.LJIJJ, new Pair(awS136S1100000_22.s0, C1416070mxB.LIZ(c1416070mxB, null, null, true, 0.0f, 0.0f, 0.0f, false, 123))), false, 3145727);
    }

    public static final Object invoke$3(AwS136S1100000_22 awS136S1100000_22, Object obj) {
        C1418670n1N c1418670n1N = (C1418670n1N) obj;
        return C1418670n1N.LIZ(c1418670n1N, null, null, false, false, false, null, null, null, null, null, null, false, 0, C2097608Jq.LJIILIIL(c1418670n1N.LJIJJ, new Pair(awS136S1100000_22.s0, (C1416070mxB) awS136S1100000_22.l1)), false, 3145727);
    }

    public static final Object invoke$4(AwS136S1100000_22 awS136S1100000_22, Object obj) {
        C1422410n7P c1422410n7P = ((C1424190nAH) obj).LJFF;
        c1422410n7P.LJFF = awS136S1100000_22.s0;
        c1422410n7P.LJI = (Integer) awS136S1100000_22.l1;
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$5(kotlin.jvm.internal.AwS136S1100000_22 r15, java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS136S1100000_22.invoke$5(kotlin.jvm.internal.AwS136S1100000_22, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$6(AwS136S1100000_22 awS136S1100000_22, Object obj) throws Throwable {
        Bitmap.CompressFormat compressFormat;
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            PictureInfo pictureInfo = (PictureInfo) awS136S1100000_22.l1;
            String str = awS136S1100000_22.s0;
            SmartMovieJniJNI.PictureInfo_resizeWidth_set(pictureInfo.LIZJ, pictureInfo, bitmap.getWidth());
            SmartMovieJniJNI.PictureInfo_resizeHeight_set(pictureInfo.LIZJ, pictureInfo, bitmap.getHeight());
            if (SmartMovieJniJNI.UploadInfo_needFeature_get(pictureInfo.LIZ, pictureInfo)) {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bitmap.getByteCount());
                bitmap.copyPixelsToBuffer(byteBufferAllocate);
                SmartMovieJniJNI.PictureInfo_setData(pictureInfo.LIZJ, pictureInfo, byteBufferAllocate.array());
            } else {
                String strLJI = C527950KnB.LJI();
                if (!Intrinsics.LJFF(strLJI, "png") && Intrinsics.LJFF(strLJI, "webp")) {
                    compressFormat = Bitmap.CompressFormat.WEBP;
                } else {
                    compressFormat = Bitmap.CompressFormat.PNG;
                }
                C2477909nN.LJFF(bitmap, str, compressFormat, C0C64.LJIILLIIL().LJIJ(31744, 100, "autocut_frame_upload_quality", true));
                SmartMovieJniJNI.PictureInfo_resizePath_set(pictureInfo.LIZJ, pictureInfo, str);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS136S1100000_22 awS136S1100000_22, Object obj) {
        ((C1416470mxp) awS136S1100000_22.l1).LLIZLLLIL.remove(awS136S1100000_22.s0);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS136S1100000_22(C1416470mxp c1416470mxp, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1416470mxp;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS136S1100000_22(C1457740o2O c1457740o2O, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1457740o2O;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS136S1100000_22(C21665719qh c21665719qh, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c21665719qh;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS136S1100000_22(PictureInfo pictureInfo, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = pictureInfo;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS136S1100000_22(AutoCutThemeData autoCutThemeData, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = autoCutThemeData;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS136S1100000_22(String str, C1416070mxB c1416070mxB, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c1416070mxB;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS136S1100000_22(String str, C1454020nwO c1454020nwO, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = c1454020nwO;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS136S1100000_22(String str, Integer num, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = num;
    }
}
