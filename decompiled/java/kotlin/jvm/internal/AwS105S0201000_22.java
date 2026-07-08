package kotlin.jvm.internal;

import X.C01TT;
import X.C09AY;
import X.C0CHQ;
import X.C0ET4;
import X.C0MJ9;
import X.C1397620mTQ;
import X.C1412020mqe;
import X.C1413450msx;
import X.C1417330mzD;
import X.C1419580n2q;
import X.C1419590n2r;
import X.C1422180n72;
import X.C1426540nE4;
import X.C1426590nE9;
import X.C1446920nkw;
import X.C1455260nyO;
import X.C1459640o5S;
import X.C1459730o5b;
import X.C1460600o70;
import X.C1460650o75;
import X.C1460740o7E;
import X.C1DRG;
import X.C1EOF;
import X.C2248481CzW;
import X.C259800zU;
import X.C559610Lx9;
import X.EnumC1461710o8n;
import X.InterfaceC1418610n1H;
import X.InterfaceC1422310n7F;
import X.InterfaceC1422570n7f;
import X.InterfaceC1652140t5w;
import android.os.SystemClock;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.autocut.s;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.ImageSynthesisResult;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.PublishImageModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import com.ss.android.ugc.tiktok.tools.performance.api.settings.LazyLoadEditLazyGroupPhase1;
import com.tts.oecverify.BdTuring;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public class AwS105S0201000_22 extends C09AY implements Function1 {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

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
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS105S0201000_22 awS105S0201000_22, Object obj) {
        String str;
        C1413450msx c1413450msx = C1413450msx.LIZ;
        C1426590nE9 c1426590nE9 = (C1426590nE9) awS105S0201000_22.l0;
        String str2 = c1426590nE9.LIZIZ;
        int i = awS105S0201000_22.i2;
        if (i != 4) {
            if (i != 8) {
                str = "enter";
            } else {
                str = "back_from_search_result";
            }
        } else {
            str = "back_from_typing";
        }
        String strValueOf = String.valueOf(c1426590nE9.LIZ);
        VideoPublishEditModel videoPublishEditModel = ((C1426540nE4) awS105S0201000_22.l1).LLJILLL;
        c1413450msx.getClass();
        C1413450msx.LJIJ(videoPublishEditModel, str2, str, strValueOf);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS105S0201000_22 awS105S0201000_22, Object obj) {
        float fFloatValue = ((Number) obj).floatValue();
        if (((C1417330mzD) awS105S0201000_22.l0).P8(awS105S0201000_22.i2, (C0MJ9) awS105S0201000_22.l1) < 1.0f) {
            C01TT.LIZLLL(new AwS1S0201001_22((C1417330mzD) awS105S0201000_22.l0, awS105S0201000_22.i2, (C0MJ9) awS105S0201000_22.l1, fFloatValue, 1));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS105S0201000_22 awS105S0201000_22, Object obj) {
        ((Boolean) obj).booleanValue();
        ImageAlbumData imageAlbumData = ((VideoPublishEditModel) awS105S0201000_22.l0).getImageAlbumData();
        if (imageAlbumData != null) {
            C1446920nkw.LIZIZ(((SingleImageData) ListProtector.get(imageAlbumData.getImageList(), awS105S0201000_22.i2)).getImageAIGCType(), ((PublishImageModel) awS105S0201000_22.l1).path);
            return Unit.LIZ;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final Object invoke$11(AwS105S0201000_22 awS105S0201000_22, Object obj) {
        TemplateCategoryData templateCategoryDataY8;
        ShortVideoContext shortVideoContext = (ShortVideoContext) obj;
        s sVar = s.LIZ;
        Asset asset = ((C1419590n2r) awS105S0201000_22.l0).LIZ;
        sVar.getClass();
        CutsameDataItem cutsameDataItemLJJLIIIJLJLI = s.LJJLIIIJLJLI(asset);
        if (cutsameDataItemLJJLIIIJLJLI != null) {
            C1422180n72 c1422180n72 = (C1422180n72) awS105S0201000_22.l1;
            int i = awS105S0201000_22.i2;
            C1419590n2r c1419590n2r = (C1419590n2r) awS105S0201000_22.l0;
            shortVideoContext.creativeModel.mvModel.isFromTemplateTabUseNow = true;
            InterfaceC1422570n7f interfaceC1422570n7f = c1422180n72.LIZ;
            if (interfaceC1422570n7f != null) {
                interfaceC1422570n7f.bA0(cutsameDataItemLJJLIIIJLJLI);
            }
            InterfaceC1422570n7f interfaceC1422570n7f2 = c1422180n72.LIZ;
            if (interfaceC1422570n7f2 != null && (templateCategoryDataY8 = interfaceC1422570n7f2.Y8()) != null) {
                C1419580n2q c1419580n2q = C1419580n2q.LIZ;
                InterfaceC1422310n7F interfaceC1422310n7F = c1422180n72.LIZJ;
                c1419580n2q.getClass();
                C1419580n2q.LJIILIIL(shortVideoContext, "mv_shoot_page", i, c1419590n2r, templateCategoryDataY8, true, interfaceC1422310n7F);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS105S0201000_22 awS105S0201000_22, Object obj) {
        C1459730o5b c1459730o5b = (C1459730o5b) obj;
        if (c1459730o5b.LIZJ == 0) {
            C1459640o5S c1459640o5S = (C1459640o5S) awS105S0201000_22.l0;
            C0CHQ.LIZ().getPublishService().LJJJJL(c1459640o5S.LL.getLifecycle(), new C1460600o70(new C1460650o75(c1459730o5b.LIZ, c1459730o5b.LIZIZ, c1459730o5b.LIZLLL, null, c1459730o5b.LJ), c1459640o5S.LJJIJIIJI(), awS105S0201000_22.i2, (InterfaceC1652140t5w) awS105S0201000_22.l1));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS105S0201000_22 awS105S0201000_22, Object obj) {
        float fFloatValue = ((Number) obj).floatValue();
        if (((C1417330mzD) awS105S0201000_22.l0).Fb(awS105S0201000_22.i2, (C0MJ9) awS105S0201000_22.l1) < 1.0f) {
            C01TT.LIZLLL(new AwS1S0201001_22((C1417330mzD) awS105S0201000_22.l0, awS105S0201000_22.i2, (C0MJ9) awS105S0201000_22.l1, fFloatValue, 2));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS105S0201000_22 awS105S0201000_22, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(2131829816, new AwS120S0101000_12(awS105S0201000_22.i2, (Function1) awS105S0201000_22.l0, 2));
        c1397620mTQ.LJII(2131829815, new AwS601S0100000_22((Function0) awS105S0201000_22.l1, (Function0<Unit>) 150));
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS105S0201000_22 awS105S0201000_22, Object obj) {
        float fFloatValue = ((Number) obj).floatValue();
        if (((C1417330mzD) awS105S0201000_22.l0).Fb(awS105S0201000_22.i2, (C0MJ9) awS105S0201000_22.l1) < 1.0f) {
            C01TT.LIZLLL(new AwS1S0201001_22((C1417330mzD) awS105S0201000_22.l0, awS105S0201000_22.i2, (C0MJ9) awS105S0201000_22.l1, fFloatValue, 3));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS105S0201000_22 awS105S0201000_22, Object obj) {
        float fFloatValue = ((Number) obj).floatValue();
        if (((C1417330mzD) awS105S0201000_22.l0).P8(awS105S0201000_22.i2, (C0MJ9) awS105S0201000_22.l1) < 1.0f) {
            C01TT.LIZLLL(new AwS1S0201001_22((C1417330mzD) awS105S0201000_22.l0, awS105S0201000_22.i2, (C0MJ9) awS105S0201000_22.l1, fFloatValue, 4));
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$6(AwS105S0201000_22 awS105S0201000_22, Object obj) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        C1455260nyO c1455260nyO = (C1455260nyO) awS105S0201000_22.l1;
        int i = awS105S0201000_22.i2;
        boolean z = LazyLoadEditLazyGroupPhase1.LIZ().enableLazySafeComponent;
        C1455260nyO c1455260nyO2 = (C1455260nyO) awS105S0201000_22.l1;
        C1460740o7E c1460740o7E = new C1460740o7E((C1DRG) obj, c1455260nyO, i, z, c1455260nyO2.w, new AwS601S0100000_22(c1455260nyO2, 354));
        ((C559610Lx9) awS105S0201000_22.l0).getClass();
        C559610Lx9.LIZ(c1460740o7E);
        c1460740o7E.afterInit$als_release(jUptimeMillis);
        return c1460740o7E;
    }

    public static final Object invoke$7(AwS105S0201000_22 awS105S0201000_22, Object obj) {
        ImageSynthesisResult imageSynthesisResult = (ImageSynthesisResult) obj;
        ((SingleImageData) awS105S0201000_22.l0).setSynthesisData(imageSynthesisResult);
        InterfaceC1418610n1H interfaceC1418610n1H = ((C1455260nyO) awS105S0201000_22.l1).LLZ;
        if (interfaceC1418610n1H != null) {
            interfaceC1418610n1H.BH2(awS105S0201000_22.i2, imageSynthesisResult);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS105S0201000_22 awS105S0201000_22, Object obj) {
        return C1412020mqe.LIZ((C1412020mqe) obj, false, null, null, (List) awS105S0201000_22.l0, new Pair(Integer.valueOf(awS105S0201000_22.i2), ((C259800zU) awS105S0201000_22.l1).element), 0.0f, false, 0, null, null, null, null, false, null, 16359);
    }

    public static final Object invoke$9(AwS105S0201000_22 awS105S0201000_22, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(awS105S0201000_22.i2, new AwS388S0200000_22((C2248481CzW) awS105S0201000_22.l0, (EnumC1461710o8n) awS105S0201000_22.l1, 144));
        c1397620mTQ.LJII(2131833383, new AwS388S0200000_22((C2248481CzW) awS105S0201000_22.l0, (EnumC1461710o8n) awS105S0201000_22.l1, 145));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS105S0201000_22(int i, C2248481CzW c2248481CzW, EnumC1461710o8n enumC1461710o8n, int i2) {
        super(1);
        this.$t = i2;
        this.i2 = i;
        this.l0 = c2248481CzW;
        this.l1 = enumC1461710o8n;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS105S0201000_22(int i, List list, C259800zU c259800zU, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = list;
        this.i2 = i;
        this.l1 = c259800zU;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS105S0201000_22(int i, Function0 function0, Function1 function1, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = function1;
        this.i2 = i;
        this.l1 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS105S0201000_22(C1417330mzD c1417330mzD, int i, C0MJ9 c0mj9, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c1417330mzD;
        this.i2 = i;
        this.l1 = c0mj9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS105S0201000_22(C1419590n2r c1419590n2r, C1422180n72 c1422180n72, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c1419590n2r;
        this.l1 = c1422180n72;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS105S0201000_22(C1426590nE9 c1426590nE9, int i, C1426540nE4 c1426540nE4, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c1426590nE9;
        this.i2 = i;
        this.l1 = c1426540nE4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS105S0201000_22(C1459640o5S c1459640o5S, int i, C1EOF c1eof, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c1459640o5S;
        this.i2 = i;
        this.l1 = c1eof;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS105S0201000_22(SingleImageData singleImageData, C1455260nyO c1455260nyO, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = singleImageData;
        this.l1 = c1455260nyO;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS105S0201000_22(VideoPublishEditModel videoPublishEditModel, int i, PublishImageModel publishImageModel, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = videoPublishEditModel;
        this.i2 = i;
        this.l1 = publishImageModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS105S0201000_22(C0ET4 c0et4, C559610Lx9 c559610Lx9, C1455260nyO c1455260nyO, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c559610Lx9;
        this.l1 = c1455260nyO;
        this.i2 = i;
    }
}
