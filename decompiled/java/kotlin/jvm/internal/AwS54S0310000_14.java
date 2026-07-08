package kotlin.jvm.internal;

import X.C09AY;
import X.C0Y9G;
import X.C21646519nb;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import X.C877540Ybg;
import X.C878590YdN;
import X.C910370ZnX;
import X.InterfaceC878540YdI;
import X.InterfaceC878620YdQ;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import com.ss.android.ugc.aweme.im.message.template.component.GreetingCardInfoComponent;
import com.ss.android.ugc.aweme.social.thought.view.SocialThoughtBaseBubbleBackgroundView;
import com.ss.android.ugc.aweme.viewmodel.GreetingCardViewModel;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes15.dex */
public class AwS54S0310000_14 extends C09AY implements Function0 {
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
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS54S0310000_14 awS54S0310000_14) {
        Object next;
        Set<InterfaceC878620YdQ> set = ((C877540Ybg) awS54S0310000_14.l0).LJFF;
        if (set != null) {
            Iterator<T> it2 = set.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    ((InterfaceC878620YdQ) next).getType();
                    if (Intrinsics.LJFF("message_request_spam", "message_request_spam")) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            InterfaceC878620YdQ interfaceC878620YdQ = (InterfaceC878620YdQ) next;
            if (interfaceC878620YdQ != null) {
                boolean z = awS54S0310000_14.z3;
                List<C0Y9G> list = (List) awS54S0310000_14.l2;
                if (z) {
                    interfaceC878620YdQ.LJIIIZ(list);
                } else {
                    interfaceC878620YdQ.setDataSource(list);
                }
            }
        }
        C877540Ybg c877540Ybg = (C877540Ybg) awS54S0310000_14.l0;
        boolean z2 = c877540Ybg.LJI;
        c877540Ybg.LJI = false;
        CopyOnWriteArrayList<InterfaceC878540YdI> copyOnWriteArrayList = ((C878590YdN) awS54S0310000_14.l1).LJIILL().get((C877540Ybg) awS54S0310000_14.l0);
        if (copyOnWriteArrayList != null) {
            C878590YdN c878590YdN = (C878590YdN) awS54S0310000_14.l1;
            C877540Ybg c877540Ybg2 = (C877540Ybg) awS54S0310000_14.l0;
            Iterator<InterfaceC878540YdI> it3 = copyOnWriteArrayList.iterator();
            while (it3.hasNext()) {
                c878590YdN.LJIILLIIL(c877540Ybg2, it3.next(), z2);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS54S0310000_14 awS54S0310000_14) {
        ((C910370ZnX) awS54S0310000_14.l0).LJIIIIZZ((GreetingCardViewModel) awS54S0310000_14.l1, (GreetingCardInfoComponent) awS54S0310000_14.l2, awS54S0310000_14.z3);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(AwS54S0310000_14 awS54S0310000_14) {
        int shadowOutsetTopPx;
        int height;
        if (Intrinsics.LJFF(((C21646519nb) awS54S0310000_14.l0).LJIIL, (View) awS54S0310000_14.l1) && ((ViewGroup) awS54S0310000_14.l2).getVisibility() == 0) {
            View viewFindViewById = ((C21646519nb) awS54S0310000_14.l0).LIZ.getRootView().findViewById(R.id.dpq);
            int[] iArr = new int[2];
            if (viewFindViewById != null) {
                viewFindViewById.getLocationInWindow(iArr);
            }
            int[] iArr2 = new int[2];
            ((ViewGroup) awS54S0310000_14.l2).getLocationInWindow(iArr2);
            SocialThoughtBaseBubbleBackgroundView socialThoughtBaseBubbleBackgroundView = (SocialThoughtBaseBubbleBackgroundView) ((View) awS54S0310000_14.l1).findViewById(R.id.xty);
            int i = 0;
            if (socialThoughtBaseBubbleBackgroundView != null) {
                shadowOutsetTopPx = socialThoughtBaseBubbleBackgroundView.getShadowOutsetTopPx();
            } else {
                shadowOutsetTopPx = 0;
            }
            int i2 = iArr[1];
            if (viewFindViewById != null) {
                height = viewFindViewById.getHeight();
            } else {
                height = 0;
            }
            float f = (i2 + height) - iArr2[1];
            C786410Ut5.ed((View) awS54S0310000_14.l1, (f - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))) - shadowOutsetTopPx);
            View view = ((C21646519nb) awS54S0310000_14.l0).LJIILL;
            if (view != null) {
                C786410Ut5.ed(view, f);
            }
            ((C21646519nb) awS54S0310000_14.l0).LJIIIZ((View) awS54S0310000_14.l1);
            C786410Ut5.LJLLLLLL(0, (View) awS54S0310000_14.l1);
            C21646519nb c21646519nb = (C21646519nb) awS54S0310000_14.l0;
            View view2 = (View) awS54S0310000_14.l1;
            c21646519nb.getClass();
            int height2 = view2.getHeight() / 2;
            if (height2 >= 0) {
                i = height2;
            }
            c21646519nb.LJJIIJ = i;
            if (awS54S0310000_14.z3) {
                C786410Ut5.T4((View) awS54S0310000_14.l1, 1.0f);
                C21646519nb c21646519nb2 = (C21646519nb) awS54S0310000_14.l0;
                c21646519nb2.LJIIL(c21646519nb2.LJJIIJ);
            } else {
                C21646519nb c21646519nb3 = (C21646519nb) awS54S0310000_14.l0;
                View view3 = (View) awS54S0310000_14.l1;
                Pair<Float, Float> pairLJ = c21646519nb3.LJ(view3);
                float fFloatValue = pairLJ.getFirst().floatValue();
                float fFloatValue2 = pairLJ.getSecond().floatValue();
                view3.setPivotX(fFloatValue);
                view3.setPivotY(fFloatValue2);
                C786410Ut5.Ob(view3, 0.4f);
                C786410Ut5.pc(view3, 0.4f);
                C786410Ut5.T4(view3, 0.0f);
                view3.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(300L).setInterpolator(new DecelerateInterpolator()).start();
                C21646519nb c21646519nb4 = (C21646519nb) awS54S0310000_14.l0;
                c21646519nb4.LIZIZ(c21646519nb4.LJJIIJ, 300L);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS54S0310000_14(C878590YdN c878590YdN, C877540Ybg c877540Ybg, List list, int i) {
        super(0);
        this.$t = i;
        this.l0 = c877540Ybg;
        this.l1 = c878590YdN;
        this.z3 = false;
        this.l2 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS54S0310000_14(C910370ZnX c910370ZnX, GreetingCardViewModel greetingCardViewModel, GreetingCardInfoComponent greetingCardInfoComponent, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c910370ZnX;
        this.l1 = greetingCardViewModel;
        this.l2 = greetingCardInfoComponent;
        this.z3 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS54S0310000_14(C21646519nb c21646519nb, View view, ViewGroup viewGroup, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c21646519nb;
        this.l1 = view;
        this.l2 = viewGroup;
        this.z3 = z;
    }
}
