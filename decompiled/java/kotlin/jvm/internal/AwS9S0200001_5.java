package kotlin.jvm.internal;

import X.C09AY;
import X.C348100Dkm;
import X.C348290Dl5;
import X.C364110EPh;
import X.C364260EPw;
import X.C375830EoP;
import X.EnumC356230Dxt;
import android.graphics.Rect;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.filter.FilterBean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public class AwS9S0200001_5 extends C09AY implements Function1 {
    public final int $t;
    public float f2;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS9S0200001_5 awS9S0200001_5, Object obj) {
        return C364260EPw.LIZ((C364260EPw) obj, null, false, null, false, new Pair(Integer.valueOf(((Rect) awS9S0200001_5.l0).right), Integer.valueOf(((Rect) awS9S0200001_5.l0).bottom)), false, new C364110EPh(awS9S0200001_5.f2, true, false), 0, null, new C375830EoP((NLETrackSlot) awS9S0200001_5.l1), null, null, null, null, null, null, null, null, false, null, null, null, null, 8388015);
    }

    public static final Object invoke$1(AwS9S0200001_5 awS9S0200001_5, Object obj) {
        C348100Dkm c348100Dkm = (C348100Dkm) obj;
        C348290Dl5 c348290Dl5 = new C348290Dl5(EnumC356230Dxt.COLOR_NO_COMPOSER);
        FilterBean filterBean = (FilterBean) awS9S0200001_5.l0;
        FilterBean filterBean2 = (FilterBean) awS9S0200001_5.l1;
        float f = awS9S0200001_5.f2;
        c348290Dl5.LIZIZ = filterBean.getFilterFolder();
        c348290Dl5.LJ = filterBean2.getFilterFolder();
        c348290Dl5.LJI = f;
        c348290Dl5.LJII = filterBean.getResId();
        String str = c348290Dl5.LIZIZ;
        if (str != null) {
            c348290Dl5.LIZJ = c348100Dkm.LJ().LIZ().getColorFilterIntensity(str);
        }
        String str2 = c348290Dl5.LJ;
        if (str2 != null) {
            c348290Dl5.LJFF = c348100Dkm.LJ().LIZ().getColorFilterIntensity(str2);
        }
        c348100Dkm.LJII().LJJJ(c348290Dl5);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS9S0200001_5(Rect rect, NLETrackSlot nLETrackSlot, float f, int i) {
        super(1);
        this.$t = i;
        this.l0 = rect;
        this.l1 = nLETrackSlot;
        this.f2 = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS9S0200001_5(FilterBean filterBean, FilterBean filterBean2, float f, int i) {
        super(1);
        this.$t = i;
        this.l0 = filterBean;
        this.l1 = filterBean2;
        this.f2 = f;
    }
}
