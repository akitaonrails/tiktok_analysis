package kotlin.jvm.internal;

import X.C09AY;
import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.icon.TuxIconView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes2.dex */
public class AwS64S0301000_1 extends C09AY implements Function0 {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

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

    public static final Object invoke$0(AwS64S0301000_1 awS64S0301000_1) {
        if (((View) awS64S0301000_1.l0).getWidth() > 0 && ((View) awS64S0301000_1.l0).getHeight() > 0) {
            ((View) awS64S0301000_1.l0).getHitRect((Rect) awS64S0301000_1.l1);
            int iWidth = (awS64S0301000_1.i3 - ((Rect) awS64S0301000_1.l1).width()) / 2;
            if (iWidth < 0) {
                iWidth = 0;
            }
            int iHeight = (awS64S0301000_1.i3 - ((Rect) awS64S0301000_1.l1).height()) / 2;
            if (iHeight < 0) {
                iHeight = 0;
            }
            if (iWidth > 0 || iHeight > 0) {
                ((Rect) awS64S0301000_1.l1).inset(-iWidth, -iHeight);
            }
            Rect rect = (Rect) awS64S0301000_1.l1;
            if (rect.left < 0) {
                rect.left = 0;
            }
            if (rect.top < 0) {
                rect.top = 0;
            }
            if (((ViewGroup) awS64S0301000_1.l2).getWidth() > 0 && ((Rect) awS64S0301000_1.l1).right > ((ViewGroup) awS64S0301000_1.l2).getWidth()) {
                ((Rect) awS64S0301000_1.l1).right = ((ViewGroup) awS64S0301000_1.l2).getWidth();
            }
            if (((ViewGroup) awS64S0301000_1.l2).getHeight() > 0 && ((Rect) awS64S0301000_1.l1).bottom > ((ViewGroup) awS64S0301000_1.l2).getHeight()) {
                ((Rect) awS64S0301000_1.l1).bottom = ((ViewGroup) awS64S0301000_1.l2).getHeight();
            }
            ((ViewGroup) awS64S0301000_1.l2).setTouchDelegate(new TouchDelegate(new Rect((Rect) awS64S0301000_1.l1), (View) awS64S0301000_1.l0));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS64S0301000_1 awS64S0301000_1) {
        if (((View) awS64S0301000_1.l0).getWidth() > 0 && ((View) awS64S0301000_1.l0).getHeight() > 0) {
            ((View) awS64S0301000_1.l0).getHitRect((Rect) awS64S0301000_1.l1);
            int iWidth = (awS64S0301000_1.i3 - ((Rect) awS64S0301000_1.l1).width()) / 2;
            if (iWidth < 0) {
                iWidth = 0;
            }
            int iHeight = (awS64S0301000_1.i3 - ((Rect) awS64S0301000_1.l1).height()) / 2;
            if (iHeight < 0) {
                iHeight = 0;
            }
            if (iWidth > 0 || iHeight > 0) {
                ((Rect) awS64S0301000_1.l1).inset(-iWidth, -iHeight);
            }
            Rect rect = (Rect) awS64S0301000_1.l1;
            if (rect.left < 0) {
                rect.left = 0;
            }
            if (rect.top < 0) {
                rect.top = 0;
            }
            if (((ViewGroup) awS64S0301000_1.l2).getWidth() > 0 && ((Rect) awS64S0301000_1.l1).right > ((ViewGroup) awS64S0301000_1.l2).getWidth()) {
                ((Rect) awS64S0301000_1.l1).right = ((ViewGroup) awS64S0301000_1.l2).getWidth();
            }
            if (((ViewGroup) awS64S0301000_1.l2).getHeight() > 0 && ((Rect) awS64S0301000_1.l1).bottom > ((ViewGroup) awS64S0301000_1.l2).getHeight()) {
                ((Rect) awS64S0301000_1.l1).bottom = ((ViewGroup) awS64S0301000_1.l2).getHeight();
            }
            ((ViewGroup) awS64S0301000_1.l2).setTouchDelegate(new TouchDelegate(new Rect((Rect) awS64S0301000_1.l1), (View) awS64S0301000_1.l0));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS64S0301000_1(TuxIconView tuxIconView, Rect rect, int i, ViewGroup viewGroup, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = tuxIconView;
        this.l1 = rect;
        this.i3 = i;
        this.l2 = viewGroup;
    }
}
