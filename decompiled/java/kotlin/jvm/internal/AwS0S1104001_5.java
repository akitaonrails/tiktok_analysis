package kotlin.jvm.internal;

import X.C098200Yq;
import X.C09AY;
import X.C13BV;
import X.C189200o6;
import X.C363400EMo;
import X.C363850EOh;
import X.C364650ERj;
import X.C7740030o;
import X.InterfaceC386690FEd;
import android.graphics.RectF;
import android.text.TextUtils;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.INLEStickerRuntime;
import com.bytedance.ies.nle.editor_jni.NLERectF;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tools.sticker.core.text.render.TextTemplateParams;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public class AwS0S1104001_5 extends C09AY implements Function0 {
    public final int $t;
    public float f6;
    public int i2;
    public int i3;
    public int i4;
    public int i5;
    public Object l1;
    public String s0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS0S1104001_5 awS0S1104001_5) {
        String infoStickerTemplateParams;
        Object c098200Yq;
        INLEMediaSession iNLEMediaSessionF1;
        INLEStickerRuntime stickerApi;
        InterfaceC386690FEd interfaceC386690FEd = ((C364650ERj) awS0S1104001_5.l1).LJIIJJI;
        if (interfaceC386690FEd != null && (iNLEMediaSessionF1 = interfaceC386690FEd.f1()) != null && (stickerApi = iNLEMediaSessionF1.getStickerApi()) != null) {
            infoStickerTemplateParams = stickerApi.getInfoStickerTemplateParams(awS0S1104001_5.s0);
        } else {
            infoStickerTemplateParams = null;
        }
        TextTemplateParams textTemplateParams = new TextTemplateParams(C13BV.INSTANCE, 0.0d, null, 0, 0.0f, 0.0d, null, null, 254, null);
        if (!TextUtils.isEmpty(infoStickerTemplateParams)) {
            try {
                c098200Yq = (TextTemplateParams) C7740030o.LIZ().getGson().LJII(infoStickerTemplateParams, TextTemplateParams.class);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            TextTemplateParams textTemplateParams2 = new TextTemplateParams(C13BV.INSTANCE, 0.0d, null, 0, 0.0f, 0.0d, null, null, 254, null);
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = textTemplateParams2;
            }
            textTemplateParams = (TextTemplateParams) c098200Yq;
        }
        List<Double> list = textTemplateParams.bounding_box;
        if (list.size() == 4 && ((Number) ListProtector.get(list, 3)).doubleValue() != ((Number) ListProtector.get(list, 1)).doubleValue() && ((Number) ListProtector.get(list, 0)).doubleValue() != ((Number) ListProtector.get(list, 2)).doubleValue()) {
            float scale = ((C364650ERj) awS0S1104001_5.l1).LJIILJJIL.LIZ.getScale();
            RectF rectF = new RectF();
            double d = scale;
            rectF.left = C363400EMo.LIZJ((float) (((Number) ListProtector.get(list, 0)).doubleValue() / d));
            rectF.top = C363400EMo.LIZLLL((float) (((Number) ListProtector.get(list, 3)).doubleValue() / d));
            rectF.right = C363400EMo.LIZJ((float) (((Number) ListProtector.get(list, 2)).doubleValue() / d));
            rectF.bottom = C363400EMo.LIZLLL((float) (((Number) ListProtector.get(list, 1)).doubleValue() / d));
            float f = rectF.left;
            float f2 = awS0S1104001_5.i2;
            ((C364650ERj) awS0S1104001_5.l1).LJIILJJIL.LIZLLL(new AwS0S0006003_5(awS0S1104001_5.i2, awS0S1104001_5.i3, f * f2, rectF.top * awS0S1104001_5.i3, (int) Math.abs((rectF.right - f) * f2), (int) Math.abs((rectF.bottom - rectF.top) * awS0S1104001_5.i3), awS0S1104001_5.i4, awS0S1104001_5.i5, awS0S1104001_5.f6, 1), true);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S1104001_5 awS0S1104001_5) {
        NLERectF nLERectF;
        INLEMediaSession iNLEMediaSessionF1;
        INLEStickerRuntime stickerApi;
        InterfaceC386690FEd interfaceC386690FEd = ((C363850EOh) awS0S1104001_5.l1).LJIIJJI;
        if (interfaceC386690FEd == null || (iNLEMediaSessionF1 = interfaceC386690FEd.f1()) == null || (stickerApi = iNLEMediaSessionF1.getStickerApi()) == null || (nLERectF = stickerApi.getInfoStickerBoundingBox(awS0S1104001_5.s0, false)) == null) {
            nLERectF = new NLERectF(0.0f, 0.0f, 0.0f, 0.0f);
        }
        if (nLERectF.getTop() != nLERectF.getBottom() && nLERectF.getLeft() != nLERectF.getRight()) {
            float scale = ((C363850EOh) awS0S1104001_5.l1).LJIILJJIL.LIZ.getScale();
            RectF rectF = new RectF();
            rectF.left = C363400EMo.LIZJ(nLERectF.getLeft() / scale);
            rectF.top = C363400EMo.LIZLLL(nLERectF.getTop() / scale);
            rectF.right = C363400EMo.LIZJ(nLERectF.getRight() / scale);
            rectF.bottom = C363400EMo.LIZLLL(nLERectF.getBottom() / scale);
            float f = rectF.left;
            float f2 = awS0S1104001_5.i2;
            ((C363850EOh) awS0S1104001_5.l1).LJIILJJIL.LIZLLL(new AwS0S0006003_5(awS0S1104001_5.i2, awS0S1104001_5.i3, f * f2, rectF.top * awS0S1104001_5.i3, (int) Math.abs((rectF.right - f) * f2), (int) Math.abs((rectF.bottom - rectF.top) * awS0S1104001_5.i3), awS0S1104001_5.i4, awS0S1104001_5.i5, awS0S1104001_5.f6, 2), true);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S1104001_5(C363850EOh c363850EOh, String str, int i, int i2, float f, int i3, int i4, int i5) {
        super(0);
        this.$t = i5;
        this.l1 = c363850EOh;
        this.s0 = str;
        this.i2 = i;
        this.i3 = i2;
        this.f6 = f;
        this.i4 = i3;
        this.i5 = i4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S1104001_5(C364650ERj c364650ERj, String str, int i, int i2, float f, int i3, int i4, int i5) {
        super(0);
        this.$t = i5;
        this.l1 = c364650ERj;
        this.s0 = str;
        this.i2 = i;
        this.i3 = i2;
        this.f6 = f;
        this.i4 = i3;
        this.i5 = i4;
    }
}
