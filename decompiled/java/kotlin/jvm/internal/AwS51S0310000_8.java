package kotlin.jvm.internal;

import X.C09AY;
import X.C0MPW;
import X.C0MPY;
import X.C0PEM;
import X.C2296808zG;
import X.C23250099c;
import X.C581270Mqz;
import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedController;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes9.dex */
public class AwS51S0310000_8 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

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

    public static final Object invoke$0(AwS51S0310000_8 awS51S0310000_8) {
        ((VideoImageMixedController) awS51S0310000_8.l0).LJJLJLI((View) awS51S0310000_8.l1, (ArrayList) awS51S0310000_8.l2, awS51S0310000_8.z3);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS51S0310000_8 awS51S0310000_8) {
        ((C0MPY) awS51S0310000_8.l0).LLJILLL = C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), (CoroutineExceptionHandler) awS51S0310000_8.l1, null, new C0MPW((C0MPY) awS51S0310000_8.l0, awS51S0310000_8.z3, (Function1) awS51S0310000_8.l2, null), 2);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS51S0310000_8(C0MPY c0mpy, C581270Mqz c581270Mqz, boolean z, Function1 function1, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0mpy;
        this.l1 = c581270Mqz;
        this.z3 = z;
        this.l2 = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS51S0310000_8(VideoImageMixedController videoImageMixedController, VideoImageMixedController videoImageMixedController2, View view, ArrayList<TikTokMediaModel> arrayList, boolean z) {
        super(0);
        this.$t = z ? 1 : 0;
        this.l0 = videoImageMixedController;
        this.l1 = videoImageMixedController2;
        this.l2 = view;
        this.z3 = arrayList;
    }
}
