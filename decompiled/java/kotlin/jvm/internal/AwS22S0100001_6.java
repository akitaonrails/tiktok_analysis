package kotlin.jvm.internal;

import X.C09AY;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.C817403Hg;
import Y.ARunnableS103S0100000_3;
import Y.ARunnableS75S0200000_6;
import android.graphics.Bitmap;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.shortvideo.album.EPAICreateSelectMaterialScene;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public class AwS22S0100001_6 extends C09AY implements Function1 {
    public final int $t;
    public float f1;
    public Object l0;

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

    public static final Object invoke$0(AwS22S0100001_6 awS22S0100001_6, Object obj) {
        ImageView imageView = (ImageView) obj;
        imageView.setTag(R.id.xce, Float.valueOf(awS22S0100001_6.f1));
        imageView.setImageBitmap((Bitmap) awS22S0100001_6.l0);
        imageView.invalidateOutline();
        HandlerHook.viewPost(imageView, new ARunnableS75S0200000_6(imageView, (Bitmap) awS22S0100001_6.l0, 4));
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS22S0100001_6 awS22S0100001_6, Object obj) {
        C786410Ut5.ed((View) obj, (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(7)) * awS22S0100001_6.f1) - ((C817403Hg) awS22S0100001_6.l0).element);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS22S0100001_6 awS22S0100001_6, Object obj) {
        ((View) obj).animate().translationY(awS22S0100001_6.f1).setDuration(50L).setInterpolator(new DecelerateInterpolator()).withEndAction(new ARunnableS103S0100000_3((EPAICreateSelectMaterialScene) awS22S0100001_6.l0, 163)).start();
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS22S0100001_6(float f, C817403Hg c817403Hg, int i) {
        super(1);
        this.$t = i;
        this.f1 = f;
        this.l0 = c817403Hg;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS22S0100001_6(float f, EPAICreateSelectMaterialScene ePAICreateSelectMaterialScene, int i) {
        super(1);
        this.$t = i;
        this.f1 = f;
        this.l0 = ePAICreateSelectMaterialScene;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS22S0100001_6(Bitmap bitmap, float f, int i) {
        super(1);
        this.$t = i;
        this.f1 = f;
        this.l0 = bitmap;
    }
}
