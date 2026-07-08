package kotlin.jvm.internal;

import X.C09AY;
import X.C12BX;
import X.C12BY;
import X.C415650GRn;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes30.dex */
public class AwS41S0600000_29 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;

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

    public static final Object invoke$0(AwS41S0600000_29 awS41S0600000_29, Object obj) {
        Bitmap bitmapLIZ;
        Bitmap bitmap = (Bitmap) obj;
        C12BX c12bx = (C12BX) awS41S0600000_29.l2;
        View view = (View) awS41S0600000_29.l3;
        Function1 function1 = (Function1) awS41S0600000_29.l4;
        ImageView imageView = (ImageView) awS41S0600000_29.l5;
        C415650GRn c415650GRn = (C415650GRn) awS41S0600000_29.l0;
        Bitmap bitmap2 = (Bitmap) awS41S0600000_29.l1;
        if (bitmap != null) {
            bitmapLIZ = C12BY.LIZ(bitmap);
        } else {
            bitmapLIZ = null;
        }
        C12BY.LIZIZ(c12bx, view, function1, imageView, c415650GRn, bitmap2, bitmapLIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS41S0600000_29 awS41S0600000_29, Object obj) {
        Bitmap bitmapLIZ;
        Bitmap bitmap = (Bitmap) obj;
        C12BX c12bx = (C12BX) awS41S0600000_29.l2;
        View view = (View) awS41S0600000_29.l3;
        Function1 function1 = (Function1) awS41S0600000_29.l4;
        ImageView imageView = (ImageView) awS41S0600000_29.l5;
        C415650GRn c415650GRn = (C415650GRn) awS41S0600000_29.l0;
        Bitmap bitmap2 = (Bitmap) awS41S0600000_29.l1;
        if (bitmap != null) {
            bitmapLIZ = C12BY.LIZ(bitmap);
        } else {
            bitmapLIZ = null;
        }
        C12BY.LIZIZ(c12bx, view, function1, imageView, c415650GRn, bitmap2, bitmapLIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS41S0600000_29 awS41S0600000_29, Object obj) {
        Bitmap bitmapLIZ;
        Bitmap bitmap = (Bitmap) obj;
        C12BX c12bx = (C12BX) awS41S0600000_29.l2;
        View view = (View) awS41S0600000_29.l3;
        Function1 function1 = (Function1) awS41S0600000_29.l4;
        ImageView imageView = (ImageView) awS41S0600000_29.l5;
        C415650GRn c415650GRn = (C415650GRn) awS41S0600000_29.l0;
        Bitmap bitmap2 = (Bitmap) awS41S0600000_29.l1;
        if (bitmap != null) {
            bitmapLIZ = C12BY.LIZ(bitmap);
        } else {
            bitmapLIZ = null;
        }
        C12BY.LIZIZ(c12bx, view, function1, imageView, c415650GRn, bitmap2, bitmapLIZ);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS41S0600000_29(C415650GRn c415650GRn, C415650GRn c415650GRn2, Bitmap bitmap, C12BX c12bx, View view, Function1<? super Bitmap, Unit> function1, ImageView imageView) {
        super(1);
        this.$t = imageView;
        this.l0 = c415650GRn;
        this.l1 = c415650GRn2;
        this.l2 = bitmap;
        this.l3 = c12bx;
        this.l4 = view;
        this.l5 = function1;
    }
}
