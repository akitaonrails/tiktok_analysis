package kotlin.jvm.internal;

import X.C09AY;
import X.C09K6;
import X.C09K7;
import X.C0BP2;
import X.C1390380mHk;
import X.C1437010nUx;
import X.C1439840nZW;
import X.C1443990ngD;
import X.C1444000ngE;
import X.C1446990nl3;
import X.C19EG;
import X.C2475009mu;
import X.C306460Bzo;
import X.EnumC1446970nl1;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes23.dex */
public class AwS55S0500000_22 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS55S0500000_22 awS55S0500000_22, Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            C1439840nZW c1439840nZW = (C1439840nZW) awS55S0500000_22.l0;
            int height = ((Bitmap) awS55S0500000_22.l1).getHeight();
            if (!c1439840nZW.LIZLLL) {
                c1439840nZW.LIZIZ.setShader(new LinearGradient(0.0f, height - 300, 0.0f, height, 0, c1439840nZW.LIZJ, Shader.TileMode.CLAMP));
                c1439840nZW.LIZLLL = true;
            }
            ((Canvas) awS55S0500000_22.l2).drawRect(0.0f, ((Bitmap) awS55S0500000_22.l1).getHeight() - 300, ((Bitmap) awS55S0500000_22.l1).getWidth(), ((Bitmap) awS55S0500000_22.l1).getHeight(), ((C1439840nZW) awS55S0500000_22.l0).LIZIZ);
            Canvas canvas = (Canvas) awS55S0500000_22.l2;
            C1439840nZW c1439840nZW2 = (C1439840nZW) awS55S0500000_22.l0;
            Bitmap bitmap2 = (Bitmap) awS55S0500000_22.l1;
            canvas.drawBitmap(bitmap, (Rect) null, new Rect((int) ((bitmap2.getWidth() - (bitmap.getWidth() * (c1439840nZW2.LJ / bitmap.getHeight()))) - c1439840nZW2.LJFF), (bitmap2.getHeight() - c1439840nZW2.LJ) - c1439840nZW2.LJFF, bitmap2.getWidth() - c1439840nZW2.LJFF, bitmap2.getHeight() - c1439840nZW2.LJFF), (Paint) null);
            ((Canvas) awS55S0500000_22.l2).save();
            ((Canvas) awS55S0500000_22.l2).restore();
            ((Function1) awS55S0500000_22.l3).invoke((Bitmap) awS55S0500000_22.l4);
            C2475009mu.LJ(bitmap);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS55S0500000_22 awS55S0500000_22, Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            C09K7 c09k7 = (C09K7) awS55S0500000_22.l0;
            if (c09k7 != null) {
                c09k7.LJJLIIIJLLLLLLLZ(bitmap);
            }
            C1443990ngD c1443990ngD = C1443990ngD.LIZ;
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) awS55S0500000_22.l1;
            C1444000ngE c1444000ngE = (C1444000ngE) awS55S0500000_22.l2;
            C19EG c19eg = (C19EG) awS55S0500000_22.l3;
            c1443990ngD.getClass();
            C1443990ngD.LIZLLL(bitmap, videoPublishEditModel, c1444000ngE, c19eg, false);
        } else {
            if (C0BP2.LIZ()) {
                Activity activity = (Activity) ((WeakReference) awS55S0500000_22.l4).get();
                if (activity != null) {
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    creativeToastBuilder.messageRes(2131839098);
                    C1390380mHk.LIZ(activity, 2008, creativeToastBuilder);
                }
            } else {
                C19EG c19eg2 = (C19EG) awS55S0500000_22.l3;
                CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
                creativeToastBuilder2.messageRes(2131839098);
                C1390380mHk.LIZ(c19eg2, 2008, creativeToastBuilder2);
            }
            C09K7 c09k72 = (C09K7) awS55S0500000_22.l0;
            if (c09k72 != null) {
                c09k72.LJJLIIIJLLLLLLLZ(null);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS55S0500000_22 awS55S0500000_22, Object obj) {
        C1446990nl3 c1446990nl3 = (C1446990nl3) obj;
        c1446990nl3.LIZ(new AwS566S0100000_22((EnumC1446970nl1) awS55S0500000_22.l0, 1153));
        c1446990nl3.LIZ(new AwS566S0100000_22((EnumC1446970nl1) awS55S0500000_22.l1, 1155));
        c1446990nl3.LIZ(new AwS566S0100000_22((EnumC1446970nl1) awS55S0500000_22.l2, 1157));
        if (C1437010nUx.LIZ()) {
            c1446990nl3.LIZ(new AwS566S0100000_22((EnumC1446970nl1) awS55S0500000_22.l3, 1159));
        }
        if (C306460Bzo.LIZ()) {
            c1446990nl3.LIZ(new AwS566S0100000_22((EnumC1446970nl1) awS55S0500000_22.l4, 1161));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS55S0500000_22(C09K6 c09k6, VideoPublishEditModel videoPublishEditModel, C1444000ngE c1444000ngE, C19EG c19eg, WeakReference weakReference, int i) {
        super(1);
        this.$t = i;
        this.l0 = c09k6;
        this.l1 = videoPublishEditModel;
        this.l2 = c1444000ngE;
        this.l3 = c19eg;
        this.l4 = weakReference;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS55S0500000_22(C1439840nZW c1439840nZW, C1439840nZW c1439840nZW2, Bitmap bitmap, Canvas canvas, Function1<? super Bitmap, Unit> function1, Bitmap bitmap2) {
        super(1);
        this.$t = bitmap2;
        this.l0 = c1439840nZW;
        this.l1 = c1439840nZW2;
        this.l2 = bitmap;
        this.l3 = canvas;
        this.l4 = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS55S0500000_22(EnumC1446970nl1 enumC1446970nl1, EnumC1446970nl1 enumC1446970nl12, EnumC1446970nl1 enumC1446970nl13, EnumC1446970nl1 enumC1446970nl14, EnumC1446970nl1 enumC1446970nl15, int i) {
        super(1);
        this.$t = i;
        this.l0 = enumC1446970nl1;
        this.l1 = enumC1446970nl12;
        this.l2 = enumC1446970nl13;
        this.l3 = enumC1446970nl14;
        this.l4 = enumC1446970nl15;
    }
}
