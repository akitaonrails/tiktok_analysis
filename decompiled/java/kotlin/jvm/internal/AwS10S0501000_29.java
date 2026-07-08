package kotlin.jvm.internal;

import X.C09AY;
import X.C19762612Tw;
import X.C20622515mp;
import X.C810503Ep;
import X.C810603Eq;
import X.InterfaceC1452170ntP;
import X.InterfaceC20597015ii;
import X.InterfaceC741260T5w;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.cover.MvChooseCoverBitmapCreator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes30.dex */
public class AwS10S0501000_29 extends C09AY implements Function0 {
    public final int $t;
    public int i5;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

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

    public static final Object invoke$0(AwS10S0501000_29 awS10S0501000_29) {
        MvChooseCoverBitmapCreator mvChooseCoverBitmapCreator = (MvChooseCoverBitmapCreator) awS10S0501000_29.l0;
        Context contextLJIIZILJ = C20622515mp.LJIIZILJ((InterfaceC20597015ii) awS10S0501000_29.l1, (Activity) awS10S0501000_29.l2);
        InterfaceC1452170ntP interfaceC1452170ntP = (InterfaceC1452170ntP) awS10S0501000_29.l3;
        int i = awS10S0501000_29.i5;
        final C810503Ep c810503Ep = (C810503Ep) awS10S0501000_29.l4;
        mvChooseCoverBitmapCreator.getBitmapList(contextLJIIZILJ, interfaceC1452170ntP, i, new InterfaceC741260T5w() { // from class: X.12T5
            @Override // X.InterfaceC741260T5w
            public final void LIZ(List<Bitmap> list) {
                c810503Ep.LLLFZ(list);
            }
        });
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS10S0501000_29 awS10S0501000_29) {
        MvChooseCoverBitmapCreator mvChooseCoverBitmapCreator = (MvChooseCoverBitmapCreator) awS10S0501000_29.l0;
        Context contextLJIIZILJ = C20622515mp.LJIIZILJ((InterfaceC20597015ii) awS10S0501000_29.l1, (Activity) awS10S0501000_29.l2);
        InterfaceC1452170ntP interfaceC1452170ntP = (InterfaceC1452170ntP) awS10S0501000_29.l3;
        int i = awS10S0501000_29.i5;
        final C810603Eq c810603Eq = (C810603Eq) awS10S0501000_29.l4;
        mvChooseCoverBitmapCreator.getBitmapList(contextLJIIZILJ, interfaceC1452170ntP, i, new InterfaceC741260T5w() { // from class: X.03Et
            @Override // X.InterfaceC741260T5w
            public final void LIZ(List<Bitmap> list) {
                c810603Eq.LLLFZ(list);
            }
        });
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS10S0501000_29 awS10S0501000_29) {
        Context contextLJIIZILJ;
        MvChooseCoverBitmapCreator mvChooseCoverBitmapCreator = (MvChooseCoverBitmapCreator) awS10S0501000_29.l0;
        Activity activity = (Activity) awS10S0501000_29.l1;
        if (activity != null) {
            contextLJIIZILJ = C20622515mp.LJIIZILJ((InterfaceC20597015ii) awS10S0501000_29.l3, activity);
        } else {
            contextLJIIZILJ = null;
        }
        InterfaceC1452170ntP interfaceC1452170ntP = ((C19762612Tw) awS10S0501000_29.l2).LLJILJIL;
        int i = awS10S0501000_29.i5;
        final C810503Ep c810503Ep = (C810503Ep) awS10S0501000_29.l4;
        mvChooseCoverBitmapCreator.getBitmapList(contextLJIIZILJ, interfaceC1452170ntP, i, new InterfaceC741260T5w() { // from class: X.12U1
            @Override // X.InterfaceC741260T5w
            public final void LIZ(List<Bitmap> list) {
                c810503Ep.LLLFZ(list);
            }
        });
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS10S0501000_29(MvChooseCoverBitmapCreator mvChooseCoverBitmapCreator, InterfaceC20597015ii interfaceC20597015ii, Activity activity, InterfaceC1452170ntP interfaceC1452170ntP, int i, C810503Ep c810503Ep, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = mvChooseCoverBitmapCreator;
        this.l1 = interfaceC20597015ii;
        this.l2 = activity;
        this.l3 = interfaceC1452170ntP;
        this.i5 = i;
        this.l4 = c810503Ep;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS10S0501000_29(MvChooseCoverBitmapCreator mvChooseCoverBitmapCreator, InterfaceC20597015ii interfaceC20597015ii, Activity activity, InterfaceC1452170ntP interfaceC1452170ntP, int i, C810603Eq c810603Eq, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = mvChooseCoverBitmapCreator;
        this.l1 = interfaceC20597015ii;
        this.l2 = activity;
        this.l3 = interfaceC1452170ntP;
        this.i5 = i;
        this.l4 = c810603Eq;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS10S0501000_29(MvChooseCoverBitmapCreator mvChooseCoverBitmapCreator, Activity activity, C19762612Tw c19762612Tw, int i, InterfaceC20597015ii interfaceC20597015ii, C810503Ep c810503Ep, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = mvChooseCoverBitmapCreator;
        this.l1 = activity;
        this.l2 = c19762612Tw;
        this.i5 = i;
        this.l3 = interfaceC20597015ii;
        this.l4 = c810503Ep;
    }
}
