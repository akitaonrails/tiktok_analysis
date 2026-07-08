package kotlin.jvm.internal;

import X.AbstractC813200VvC;
import X.C013C;
import X.C09AY;
import X.C0WWO;
import X.C259800zU;
import android.app.Application;
import androidx.fragment.app.FragmentManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes14.dex */
public class AwS1S0610000_13 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;
    public boolean z6;

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

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$0(AwS1S0610000_13 awS1S0610000_13, Object obj) {
        FragmentManager fragmentManager;
        if (awS1S0610000_13.z6) {
            C0WWO.LIZIZ((C013C) awS1S0610000_13.l3, (C259800zU) awS1S0610000_13.l0, (C259800zU) awS1S0610000_13.l1, (Application) awS1S0610000_13.l2, (C259800zU) awS1S0610000_13.l4, (FragmentManager) awS1S0610000_13.l5);
        } else {
            AbstractC813200VvC abstractC813200VvC = (AbstractC813200VvC) ((C259800zU) awS1S0610000_13.l0).element;
            if (abstractC813200VvC != null && (fragmentManager = (FragmentManager) awS1S0610000_13.l5) != null) {
                fragmentManager.LLIILZL(abstractC813200VvC);
            }
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) ((C259800zU) awS1S0610000_13.l1).element;
            if (activityLifecycleCallbacks != null) {
                ((Application) awS1S0610000_13.l2).unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$1(AwS1S0610000_13 awS1S0610000_13, Object obj) {
        FragmentManager fragmentManager;
        if (awS1S0610000_13.z6) {
            C0WWO.LIZJ((C013C) awS1S0610000_13.l3, (C259800zU) awS1S0610000_13.l0, (C259800zU) awS1S0610000_13.l1, (Application) awS1S0610000_13.l2, (C259800zU) awS1S0610000_13.l4, (FragmentManager) awS1S0610000_13.l5);
        } else {
            AbstractC813200VvC abstractC813200VvC = (AbstractC813200VvC) ((C259800zU) awS1S0610000_13.l0).element;
            if (abstractC813200VvC != null && (fragmentManager = (FragmentManager) awS1S0610000_13.l5) != null) {
                fragmentManager.LLIILZL(abstractC813200VvC);
            }
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) ((C259800zU) awS1S0610000_13.l1).element;
            if (activityLifecycleCallbacks != null) {
                ((Application) awS1S0610000_13.l2).unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS1S0610000_13(boolean z, boolean z2, C259800zU<AbstractC813200VvC> c259800zU, C259800zU<Application.ActivityLifecycleCallbacks> c259800zU2, Application application, C013C c013c, C259800zU<Object> c259800zU3, FragmentManager fragmentManager) {
        super(1);
        this.$t = fragmentManager;
        this.z6 = z;
        this.l0 = z2;
        this.l1 = c259800zU;
        this.l2 = c259800zU2;
        this.l3 = application;
        this.l4 = c013c;
        this.l5 = c259800zU3;
    }
}
