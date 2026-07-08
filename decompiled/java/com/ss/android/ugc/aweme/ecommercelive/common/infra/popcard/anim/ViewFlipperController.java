package com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.anim;

import X.C13LP;
import X.C1619980sG4;
import X.C1697810uHb;
import X.C1C7U;
import X.C621740Oa4;
import X.C786410Ut5;
import Y.ALAdapterS11S0200000_16;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: loaded from: classes33.dex */
public final class ViewFlipperController {
    public int LIZLLL;
    public Function1<? super View, Unit> LJ;
    public final ViewFlipperController$handler$1 LJI;
    public final List<View> LIZ = new ArrayList();
    public long LIZIZ = 25000;
    public int LIZJ = 100000;
    public Function0<Boolean> LJFF = AFwS223S0000000_32.get$arr$(61);

    public final void LIZIZ() {
        this.LIZLLL = 0;
        removeMessages(101);
        ((ArrayList) this.LIZ).clear();
    }

    public final void LIZ() {
        int i;
        if (((ArrayList) this.LIZ).isEmpty() || (i = this.LIZJ) <= 0) {
            return;
        }
        this.LIZJ = i - 1;
        removeMessages(101);
        sendEmptyMessageDelayed(101, this.LIZIZ);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.anim.ViewFlipperController$handler$1] */
    public ViewFlipperController() {
        final Looper mainLooper = Looper.getMainLooper();
        this.LJI = new BPEAHandler(mainLooper) { // from class: com.ss.android.ugc.aweme.ecommercelive.common.infra.popcard.anim.ViewFlipperController$handler$1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                View view;
                View view2;
                int height;
                C1C7U.LIZ("ViewFlipperController@6b1a.handler$1");
                super.handleMessage(message);
                removeMessages(101);
                if (!this.LL.LJFF.invoke().booleanValue()) {
                    ViewFlipperController viewFlipperController = this.LL;
                    AwS576S0100000_32 awS576S0100000_32 = new AwS576S0100000_32(viewFlipperController, 174);
                    if (((ArrayList) viewFlipperController.LIZ).size() > 1 && (view = (View) C13LP.LJJJLZIJ(viewFlipperController.LIZLLL, viewFlipperController.LIZ)) != null) {
                        if (viewFlipperController.LIZLLL == ((ArrayList) viewFlipperController.LIZ).size() - 1) {
                            viewFlipperController.LIZLLL = 0;
                            view2 = (View) C13LP.LJJJLZIJ(0, viewFlipperController.LIZ);
                        } else {
                            int i = viewFlipperController.LIZLLL + 1;
                            viewFlipperController.LIZLLL = i;
                            view2 = (View) C13LP.LJJJLZIJ(i, viewFlipperController.LIZ);
                        }
                        if (view2 != null) {
                            Animator animatorLIZIZ = C621740Oa4.LIZIZ(0.0f, -view.getHeight(), view);
                            if (view2.getHeight() == 0) {
                                height = view.getHeight();
                            } else {
                                height = view2.getHeight();
                            }
                            Animator animatorLIZIZ2 = C621740Oa4.LIZIZ(height, 0.0f, view2);
                            animatorLIZIZ2.addListener(new ALAdapterS11S0200000_16(view2, awS576S0100000_32, 5));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(animatorLIZIZ, animatorLIZIZ2);
                            animatorSet.setInterpolator(C1619980sG4.LJIILIIL());
                            animatorSet.setDuration(250L);
                            animatorSet.start();
                        }
                    }
                    this.LL.LIZ();
                } else {
                    removeMessages(101);
                }
                C1C7U.LIZIZ("ViewFlipperController@6b1a.handler$1");
            }
        };
    }

    public final void LIZJ(List list) {
        LIZIZ();
        ((ArrayList) this.LIZ).clear();
        ((ArrayList) this.LIZ).addAll(list);
        int i = 0;
        for (Object obj : (ArrayList) this.LIZ) {
            int i2 = i + 1;
            if (i >= 0) {
                View view = (View) obj;
                if (i != 0) {
                    C786410Ut5.LJLLLLLL(4, view);
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }
}
