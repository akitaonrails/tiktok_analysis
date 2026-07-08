package kotlin.jvm.internal;

import X.AbstractC368670Ecr;
import X.C09AY;
import X.C0EPV;
import X.C0L7R;
import X.C353920DuA;
import X.C357320Dze;
import X.C358920E5i;
import X.C368010Ebn;
import X.C368220Ec8;
import X.C368230Ec9;
import X.C368880EdC;
import X.C368950EdJ;
import X.InterfaceC356810Dyp;
import X.ProgressDialogC1397790mTh;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.series.commonfeed.holder.MiniDramaDNUHighlightCard;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog;
import com.ss.android.ugc.gamora.editorpro.capabilities.text.tts.ui.TTSFragment;
import com.ss.android.ugc.tools.view.uikit.factory.CreativeDialogWrapper;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public class AwS145S0101000_5 extends C09AY implements Function0 {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS145S0101000_5 awS145S0101000_5) {
        View view = ((MiniDramaDNUHighlightCard) awS145S0101000_5.l0).V0;
        if (view != null) {
            final int i = awS145S0101000_5.i1;
            if (view.isLaidOut() && !view.isLayoutRequested()) {
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, view.getHeight(), new int[]{0, i, i}, new float[]{0.0f, 0.4f, 1.0f}, Shader.TileMode.CLAMP);
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
                shapeDrawable.getPaint().setShader(linearGradient);
                view.setBackground(shapeDrawable);
            } else {
                view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.0FN6
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                        view2.removeOnLayoutChangeListener(this);
                        float height = view2.getHeight();
                        int i10 = i;
                        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, height, new int[]{0, i10, i10}, new float[]{0.0f, 0.4f, 1.0f}, Shader.TileMode.CLAMP);
                        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new RectShape());
                        shapeDrawable2.getPaint().setShader(linearGradient2);
                        view2.setBackground(shapeDrawable2);
                    }
                });
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS145S0101000_5 awS145S0101000_5) {
        C0EPV c0epv = (C0EPV) awS145S0101000_5.l0;
        c0epv.LJI = awS145S0101000_5.i1;
        ProgressDialogC1397790mTh progressDialogC1397790mTh = c0epv.LJFF;
        if (progressDialogC1397790mTh != null && progressDialogC1397790mTh.isShowing()) {
            progressDialogC1397790mTh.setProgress(Math.min(((C0EPV) awS145S0101000_5.l0).LJI, 100));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS145S0101000_5 awS145S0101000_5) {
        ((C353920DuA) awS145S0101000_5.l0).LJI.onProgress(awS145S0101000_5.i1);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS145S0101000_5 awS145S0101000_5) {
        C0L7R c0l7r = (C0L7R) awS145S0101000_5.l0;
        c0l7r.LJIIL += awS145S0101000_5.i1;
        CreativeDialogWrapper creativeDialogWrapper = c0l7r.LJI;
        if (creativeDialogWrapper != null && creativeDialogWrapper.isShowing()) {
            CreativeLoadingDialog.DefaultImpls.updateProgress$default(creativeDialogWrapper, Math.min(((C0L7R) awS145S0101000_5.l0).LJIIL, 100), false, 2, null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS145S0101000_5 awS145S0101000_5) {
        ((C358920E5i) awS145S0101000_5.l0).LIZ.onSeekDone(awS145S0101000_5.i1);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS145S0101000_5 awS145S0101000_5) {
        C368230Ec9 c368230Ec9;
        if (awS145S0101000_5.i1 >= 0) {
            int size = ((ArrayList) ((C368880EdC) awS145S0101000_5.l0).LLJI).size();
            int i = awS145S0101000_5.i1;
            if (size > i && (c368230Ec9 = ((C368950EdJ) ListProtector.get(((C368880EdC) awS145S0101000_5.l0).LLJI, i)).LIZ.LLILLL) != null) {
                c368230Ec9.invalidate();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS145S0101000_5 awS145S0101000_5) {
        int size = View.MeasureSpec.getSize(awS145S0101000_5.i1);
        AbstractC368670Ecr abstractC368670Ecr = (AbstractC368670Ecr) awS145S0101000_5.l0;
        if (size == 0) {
            size = abstractC368670Ecr.getScreenWidth();
        }
        return Integer.valueOf(size);
    }

    public static final Object invoke$7(AwS145S0101000_5 awS145S0101000_5) {
        C368230Ec9 itemFrameViewFromXml;
        if (awS145S0101000_5.i1 >= 0) {
            int size = ((ArrayList) ((C368010Ebn) awS145S0101000_5.l0).LLILLJJLI).size();
            int i = awS145S0101000_5.i1;
            if (size > i && (itemFrameViewFromXml = ((C368220Ec8) ListProtector.get(((C368010Ebn) awS145S0101000_5.l0).LLILLJJLI, i)).getItemFrameViewFromXml()) != null) {
                itemFrameViewFromXml.invalidate();
            }
        }
        Function0<Unit> onSegmentsUpdated = ((C368010Ebn) awS145S0101000_5.l0).getOnSegmentsUpdated();
        if (onSegmentsUpdated != null) {
            onSegmentsUpdated.invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS145S0101000_5 awS145S0101000_5) {
        ProgressDialogC1397790mTh progressDialogC1397790mTh = ((TTSFragment) awS145S0101000_5.l0).LLLILZ;
        if (progressDialogC1397790mTh != null && progressDialogC1397790mTh.isShowing()) {
            progressDialogC1397790mTh.setProgress(Math.min(awS145S0101000_5.i1, 100));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS145S0101000_5 awS145S0101000_5) {
        InterfaceC356810Dyp interfaceC356810Dyp = ((C357320Dze) awS145S0101000_5.l0).LIZJ;
        if (interfaceC356810Dyp != null) {
            interfaceC356810Dyp.onProgress((int) (awS145S0101000_5.i1 * 0.95f));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS145S0101000_5(int i, C368010Ebn c368010Ebn, int i2) {
        super(0);
        this.$t = i2;
        this.i1 = i;
        this.l0 = c368010Ebn;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS145S0101000_5(int i, AbstractC368670Ecr abstractC368670Ecr, int i2) {
        super(0);
        this.$t = i2;
        this.i1 = i;
        this.l0 = abstractC368670Ecr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS145S0101000_5(int i, C368880EdC c368880EdC, int i2) {
        super(0);
        this.$t = i2;
        this.i1 = i;
        this.l0 = c368880EdC;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS145S0101000_5(C353920DuA c353920DuA, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c353920DuA;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS145S0101000_5(C357320Dze c357320Dze, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c357320Dze;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS145S0101000_5(C358920E5i c358920E5i, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c358920E5i;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS145S0101000_5(C0EPV c0epv, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c0epv;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS145S0101000_5(C0L7R c0l7r, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c0l7r;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS145S0101000_5(MiniDramaDNUHighlightCard miniDramaDNUHighlightCard, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = miniDramaDNUHighlightCard;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS145S0101000_5(TTSFragment tTSFragment, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = tTSFragment;
        this.i1 = i;
    }
}
