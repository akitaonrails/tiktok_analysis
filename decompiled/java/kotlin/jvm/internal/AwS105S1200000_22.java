package kotlin.jvm.internal;

import X.AbstractC1433380nP6;
import X.AbstractC1433570nPP;
import X.C09AY;
import X.C0EJ1;
import X.C0EPM;
import X.C1397620mTQ;
import X.C1398350mUb;
import X.C1404350meH;
import X.C1404360meI;
import X.C1423490n99;
import X.C1423740n9Y;
import X.C1432320nNO;
import X.C1439840nZW;
import X.C1443310nf7;
import X.C1452270ntZ;
import X.C1455430nyf;
import X.C1457270o1d;
import X.C201955140j;
import X.C2188811AlT;
import X.C2286708xd;
import X.C2475009mu;
import X.C296620Bjw;
import X.C383310F1d;
import X.EnumC1404340meG;
import X.ExecutorC527170Klv;
import X.InterfaceC1446740nke;
import X.InterfaceC1452170ntP;
import X.InterfaceC1635410sex;
import X.InterfaceC574560MgA;
import Y.ARunnableS55S0300000_22;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.ImageView;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.asve.recorder.effect.composer.ComposerInfo;
import com.ss.android.ugc.aweme.camera.core.api.effect.IMComposerInfo;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.AssetCategoryResponse;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.tts.oecverify.BdTuring;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public class AwS105S1200000_22 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
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
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS105S1200000_22 awS105S1200000_22, Object obj) {
        C1404360meI c1404360meI = (C1404360meI) awS105S1200000_22.l1;
        String str = ((ComposerInfo) obj).nodePath;
        int iIntValue = ((Integer) awS105S1200000_22.l2).intValue();
        c1404360meI.getClass();
        String strLIZIZ = C1404360meI.LIZIZ(iIntValue, str);
        C1404360meI c1404360meI2 = (C1404360meI) awS105S1200000_22.l1;
        String str2 = awS105S1200000_22.s0;
        int iIntValue2 = ((Integer) awS105S1200000_22.l2).intValue();
        c1404360meI2.getClass();
        return Boolean.valueOf(Intrinsics.LJFF(C1404360meI.LIZIZ(iIntValue2, str2), strLIZIZ));
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS105S1200000_22 awS105S1200000_22, Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap == null) {
            C1457270o1d c1457270o1d = C1457270o1d.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sharp preload failed for ");
            sbLIZ.append(awS105S1200000_22.s0);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c1457270o1d.getClass();
            C1457270o1d.LJ(strLIZIZ);
        } else if (!C1457270o1d.LIZIZ) {
            bitmap.recycle();
            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
            C1457270o1d.LIZ.getClass();
            C1457270o1d.LJ("sharp bitmap arrived after clear, recycled");
        } else {
            ExecutorC527170Klv.LLILLJJLI.execute(new ARunnableS55S0300000_22(bitmap, (InterfaceC1446740nke) awS105S1200000_22.l1, (ImageView) awS105S1200000_22.l2, 2));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS105S1200000_22 awS105S1200000_22, Object obj) {
        ((AbstractC1433570nPP) obj).onStageUpdate(awS105S1200000_22.s0, (AbstractC1433380nP6) awS105S1200000_22.l1, awS105S1200000_22.l2);
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS105S1200000_22 awS105S1200000_22, Object obj) {
        C1404350meH c1404350meH = (C1404350meH) awS105S1200000_22.l1;
        String str = ((IMComposerInfo) obj).nodePath;
        EnumC1404340meG enumC1404340meG = (EnumC1404340meG) awS105S1200000_22.l2;
        c1404350meH.getClass();
        String strLJI = C1404350meH.LJI(str, enumC1404340meG);
        C1404350meH c1404350meH2 = (C1404350meH) awS105S1200000_22.l1;
        String str2 = awS105S1200000_22.s0;
        EnumC1404340meG enumC1404340meG2 = (EnumC1404340meG) awS105S1200000_22.l2;
        c1404350meH2.getClass();
        return Boolean.valueOf(Intrinsics.LJFF(C1404350meH.LJI(str2, enumC1404340meG2), strLJI));
    }

    public static final Object invoke$2(AwS105S1200000_22 awS105S1200000_22, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(2131828407, new AwS105S1200000_22((C1455430nyf) awS105S1200000_22.l1, (C1455430nyf) awS105S1200000_22.s0, (String) awS105S1200000_22.l2, (Function0<Unit>) 3));
        c1397620mTQ.LJII(2131828405, new AwS105S1200000_22((C1455430nyf) awS105S1200000_22.l1, (C1455430nyf) awS105S1200000_22.s0, (String) awS105S1200000_22.l2, (Function0<Unit>) 4));
        c1397620mTQ.LJFF = true;
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS105S1200000_22 awS105S1200000_22, Object obj) {
        ((C1455430nyf) awS105S1200000_22.l1).LJIIJ.invoke(1);
        ((C1455430nyf) awS105S1200000_22.l1).LJIIIZ.LIZ();
        if (!((C1455430nyf) awS105S1200000_22.l1).LIZJ(awS105S1200000_22.s0)) {
            ((Function0) awS105S1200000_22.l2).invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS105S1200000_22 awS105S1200000_22, Object obj) {
        String strLIZJ;
        ((C1455430nyf) awS105S1200000_22.l1).LJIIJ.invoke(0);
        C383310F1d subtitleMusicChangeChecker = ((C1455430nyf) awS105S1200000_22.l1).LIZIZ.getSubtitleMusicChangeChecker();
        if (subtitleMusicChangeChecker != null) {
            subtitleMusicChangeChecker.getData(((C1455430nyf) awS105S1200000_22.l1).LIZIZ);
        }
        C1455430nyf c1455430nyf = (C1455430nyf) awS105S1200000_22.l1;
        C0EPM c0epm = c1455430nyf.LJIILIIL;
        if (c0epm != null) {
            NLEModel nLEModel = c1455430nyf.LJIILL;
            if (nLEModel != null) {
                strLIZJ = C0EJ1.LIZJ(nLEModel);
            } else {
                strLIZJ = null;
            }
            c0epm.LLLLZIL(strLIZJ);
        }
        if (!((C1455430nyf) awS105S1200000_22.l1).LIZJ(awS105S1200000_22.s0)) {
            ((Function0) awS105S1200000_22.l2).invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS105S1200000_22 awS105S1200000_22, Object obj) {
        InterfaceC574560MgA interfaceC574560MgA = (InterfaceC574560MgA) obj;
        InterfaceC1452170ntP interfaceC1452170ntP = ((C1432320nNO) awS105S1200000_22.l1).LIZJ;
        if (interfaceC1452170ntP == null) {
            return null;
        }
        return Boolean.valueOf(interfaceC1452170ntP.Qe(awS105S1200000_22.s0, null, (VEVideoEncodeSettings) awS105S1200000_22.l2, interfaceC574560MgA));
    }

    public static final Object invoke$6(AwS105S1200000_22 awS105S1200000_22, Object obj) throws Throwable {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap == null) {
            ((Function1) awS105S1200000_22.l1).invoke(null);
        } else {
            ((C1439840nZW) awS105S1200000_22.l2).getClass();
            if (!bitmap.isRecycled() && bitmap.getWidth() > 0 && bitmap.getHeight() > 0) {
                C1439840nZW c1439840nZW = (C1439840nZW) awS105S1200000_22.l2;
                c1439840nZW.LIZ.setTextSize((bitmap.getHeight() / 1280) * 24.0f);
                c1439840nZW.LJ = (int) (c1439840nZW.LIZ.getTextSize() * 1.9f);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                if (!C2286708xd.LIZJ(awS105S1200000_22.s0)) {
                    canvas.save();
                    canvas.restore();
                    ((Function1) awS105S1200000_22.l1).invoke(bitmapCreateBitmap);
                } else {
                    C1439840nZW c1439840nZW2 = (C1439840nZW) awS105S1200000_22.l2;
                    String str = awS105S1200000_22.s0;
                    AwS55S0500000_22 awS55S0500000_22 = new AwS55S0500000_22(c1439840nZW2, (C1439840nZW) bitmap, (Bitmap) canvas, (Canvas) awS105S1200000_22.l1, (Function1<? super Bitmap, Unit>) bitmapCreateBitmap, (Bitmap) 0);
                    c1439840nZW2.getClass();
                    C1439840nZW.LIZ(str, awS55S0500000_22);
                }
                C2475009mu.LJ(bitmap);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS105S1200000_22 awS105S1200000_22, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (C2286708xd.LIZJ(awS105S1200000_22.s0)) {
            C1443310nf7 c1443310nf7 = C1443310nf7.LIZIZ;
            if (!c1443310nf7.LIZLLL((VideoPublishEditModel) awS105S1200000_22.l1)) {
                c1443310nf7.LIZJ((VideoPublishEditModel) awS105S1200000_22.l1, awS105S1200000_22.s0);
            }
        }
        ((Function1) awS105S1200000_22.l2).invoke(Boolean.valueOf(zBooleanValue));
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS105S1200000_22 awS105S1200000_22, Object obj) {
        String str;
        int iIntValue = ((Number) obj).intValue();
        C1423490n99 c1423490n99 = (C1423490n99) awS105S1200000_22.l1;
        String str2 = awS105S1200000_22.s0;
        C1423740n9Y c1423740n9Y = (C1423740n9Y) awS105S1200000_22.l2;
        c1423490n99.getClass();
        try {
            if (C296620Bjw.LIZ()) {
                str = "tt_template__api";
            } else {
                str = "tt_template";
            }
            AssetCategoryResponse assetCategoryResponseLJJIIJ = ((InterfaceC1635410sex) c1423490n99.LIZLLL.getValue()).LJJIIJ(str, str2, iIntValue, c1423740n9Y.LIZ);
            C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("TemplateTabCategoryNewFetcher fetchAssetsFromCache: category = ");
            sbLIZ.append(str2);
            sbLIZ.append(", cursor = ");
            sbLIZ.append(iIntValue);
            sbLIZ.append(", num = ");
            sbLIZ.append(c1423740n9Y.LIZ);
            sbLIZ.append(", cache = ");
            sbLIZ.append(assetCategoryResponseLJJIIJ);
            C201955140j.LIZJ(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
            return assetCategoryResponseLJJIIJ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C201955140j.LJIIIZ(C1398350mUb.LIZIZ, "TemplateTabCategoryNewFetcher", "fetchAssetsFromCache failed by dirty cache", e);
            return null;
        }
    }

    public static final Object invoke$9(AwS105S1200000_22 awS105S1200000_22, Object obj) {
        C1452270ntZ c1452270ntZ = (C1452270ntZ) awS105S1200000_22.l1;
        for (Effect effect : (List) obj) {
            FilterBean filterBean = new FilterBean();
            filterBean.setId(effect.getEffectId());
            filterBean.setFilterFolder(effect.getUnzipPath());
            filterBean.setFilterFilePath(effect.getUnzipPath());
            filterBean.setResId(effect.getResourceId());
            filterBean.setExtra(effect.getExtra());
            float fLIZIZ = c1452270ntZ.LIZ.LIZIZ(filterBean);
            float fLIZIZ2 = c1452270ntZ.LIZIZ.LIZIZ(filterBean);
            if (fLIZIZ2 == c1452270ntZ.LIZIZ.LIZLLL(filterBean) && fLIZIZ2 != fLIZIZ) {
                c1452270ntZ.LIZIZ.LIZJ(filterBean, fLIZIZ);
            }
        }
        Keva keva = ((C1452270ntZ) awS105S1200000_22.l1).LIZLLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Edit_Filter_Data_2_Has_Migrated_");
        sbLIZ.append(awS105S1200000_22.s0);
        keva.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
        new AwS566S0100000_22((Function0) awS105S1200000_22.l2, (Function0<Boolean>) 1045).invoke();
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS105S1200000_22(C1404350meH c1404350meH, EnumC1404340meG enumC1404340meG, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1404350meH;
        this.l2 = enumC1404340meG;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS105S1200000_22(C1404360meI c1404360meI, Integer num, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1404360meI;
        this.l2 = num;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS105S1200000_22(C1423490n99 c1423490n99, String str, C1423740n9Y c1423740n9Y, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1423490n99;
        this.s0 = str;
        this.l2 = c1423740n9Y;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS105S1200000_22(C1432320nNO c1432320nNO, String str, VEVideoEncodeSettings vEVideoEncodeSettings, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1432320nNO;
        this.s0 = str;
        this.l2 = vEVideoEncodeSettings;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS105S1200000_22(C1452270ntZ c1452270ntZ, String str, AwS566S0100000_22 awS566S0100000_22, int i) {
        super(1);
        this.$t = i;
        this.l1 = c1452270ntZ;
        this.s0 = str;
        this.l2 = awS566S0100000_22;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS105S1200000_22(C1455430nyf c1455430nyf, C1455430nyf c1455430nyf2, String str, Function0<Unit> function0) {
        super(1);
        this.$t = function0;
        this.l1 = c1455430nyf;
        this.s0 = c1455430nyf2;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS105S1200000_22(ImageView imageView, InterfaceC1446740nke interfaceC1446740nke, String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = interfaceC1446740nke;
        this.l2 = imageView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS105S1200000_22(VideoPublishEditModel videoPublishEditModel, String str, Function1 function1, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = videoPublishEditModel;
        this.l2 = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS105S1200000_22(String str, AbstractC1433380nP6 abstractC1433380nP6, Object obj, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = abstractC1433380nP6;
        this.l2 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS105S1200000_22(AwS212S0300000_3 awS212S0300000_3, C1439840nZW c1439840nZW, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = awS212S0300000_3;
        this.l2 = c1439840nZW;
        this.s0 = str;
    }
}
