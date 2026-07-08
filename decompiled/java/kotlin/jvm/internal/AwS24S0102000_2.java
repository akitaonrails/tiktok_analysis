package kotlin.jvm.internal;

import X.C09AY;
import X.C1397620mTQ;
import X.C197039127h;
import X.C384050F3z;
import X.C418440Gaw;
import X.C814420VxA;
import X.InterfaceC2217461Bqa;
import Y.ARunnableS102S0100000_2;
import android.view.ViewGroup;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.im.streak.impl.pet.assem.StreakPetWidgetAssem;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public class AwS24S0102000_2 extends C09AY implements Function1 {
    public final int $t;
    public int i1;
    public int i2;
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
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS24S0102000_2(ARunnableS102S0100000_2 aRunnableS102S0100000_2, int i) {
        super(1);
        this.$t = i;
        this.i1 = R.string.s_u;
        this.i2 = R.string.f1_;
        this.l0 = aRunnableS102S0100000_2;
    }

    public static final Object invoke$0(AwS24S0102000_2 awS24S0102000_2, Object obj) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) obj;
        StreakPetWidgetAssem streakPetWidgetAssem = (StreakPetWidgetAssem) awS24S0102000_2.l0;
        int i = awS24S0102000_2.i1;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = StreakPetWidgetAssem.LLLII;
        marginLayoutParams.leftMargin = Math.min(Math.max(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(streakPetWidgetAssem.LLJJIII.left))), i), Math.max(0, (streakPetWidgetAssem.LJJIJL().getWidth() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(streakPetWidgetAssem.LLJJI.width)))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(streakPetWidgetAssem.LLJJIII.right)))));
        StreakPetWidgetAssem streakPetWidgetAssem2 = (StreakPetWidgetAssem) awS24S0102000_2.l0;
        marginLayoutParams.topMargin = Math.min(Math.max(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(streakPetWidgetAssem2.LLJJIII.top))), awS24S0102000_2.i2), Math.max(0, (streakPetWidgetAssem2.LJJIJL().getHeight() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(streakPetWidgetAssem2.LLJJI.width)))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(streakPetWidgetAssem2.LLJJIII.bottom)))));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS24S0102000_2 awS24S0102000_2, Object obj) {
        C197039127h c197039127h = (C197039127h) obj;
        int i = awS24S0102000_2.i2;
        C384050F3z c384050F3z = new C384050F3z();
        float fLIZIZ = C418440Gaw.LIZIZ(6);
        c384050F3z.LJIIIIZZ = Float.valueOf(fLIZIZ);
        c384050F3z.LJIIIZ = Float.valueOf(fLIZIZ);
        c384050F3z.LJIIJ = Float.valueOf(fLIZIZ);
        c384050F3z.LJIIJJI = Float.valueOf(fLIZIZ);
        c384050F3z.LIZIZ = Integer.valueOf(i);
        c197039127h.setBackground(c384050F3z.LIZ(((Scene) awS24S0102000_2.l0).requireActivity()));
        c197039127h.setTextColorRes(awS24S0102000_2.i1);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS24S0102000_2 awS24S0102000_2, Object obj) {
        C197039127h c197039127h = (C197039127h) obj;
        int i = awS24S0102000_2.i2;
        C384050F3z c384050F3z = new C384050F3z();
        float fLIZIZ = C418440Gaw.LIZIZ(5);
        c384050F3z.LJIIIIZZ = Float.valueOf(fLIZIZ);
        c384050F3z.LJIIIZ = Float.valueOf(fLIZIZ);
        c384050F3z.LJIIJ = Float.valueOf(fLIZIZ);
        c384050F3z.LJIIJJI = Float.valueOf(fLIZIZ);
        c384050F3z.LIZIZ = Integer.valueOf(i);
        c197039127h.setBackground(c384050F3z.LIZ(((Scene) awS24S0102000_2.l0).requireActivity()));
        c197039127h.setTextColorRes(awS24S0102000_2.i1);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS24S0102000_2 awS24S0102000_2, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LJFF(awS24S0102000_2.i1, new AwS581S0100000_2((Runnable) awS24S0102000_2.l0, 499));
        c1397620mTQ.LJII(awS24S0102000_2.i2, null);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS24S0102000_2(int i, int i2, StreakPetWidgetAssem streakPetWidgetAssem, int i3) {
        super(1);
        this.$t = i3;
        this.i1 = i;
        this.i2 = i2;
        this.l0 = streakPetWidgetAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS24S0102000_2(MvChoosePhotoScene mvChoosePhotoScene, int i, int i2, int i3) {
        super(1);
        this.$t = i3;
        this.l0 = mvChoosePhotoScene;
        this.i1 = i;
        this.i2 = i2;
    }
}
