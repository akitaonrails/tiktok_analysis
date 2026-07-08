package kotlin.jvm.internal;

import X.AbstractC21332918e7;
import X.AbstractC21333318eB;
import X.C09AY;
import X.C1325860kbg;
import X.C2097608Jq;
import X.C21332218e0;
import X.C21332318e1;
import X.C21335518eX;
import X.C2188811AlT;
import X.InterfaceC21333118e9;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.text.BoringLayout;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes33.dex */
public class AwS22S0410000_32 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public boolean z4;

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

    public static final Object invoke$0(AwS22S0410000_32 awS22S0410000_32) {
        String strValueOf;
        Boolean boolValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" MynaTextLayoutBuilder#build() An exception occurs,wantWidth:");
        sbLIZ.append(((C21335518eX) awS22S0410000_32.l0).f224J);
        sbLIZ.append(",measureWidthCache:");
        sbLIZ.append(((C21335518eX) awS22S0410000_32.l0).R);
        sbLIZ.append(",text:");
        if (awS22S0410000_32.z4) {
            strValueOf = String.valueOf(((C21335518eX) awS22S0410000_32.l0).G);
        } else {
            strValueOf = "logText=false";
        }
        sbLIZ.append(strValueOf);
        sbLIZ.append(",alignment");
        sbLIZ.append(((C21335518eX) awS22S0410000_32.l0).N);
        sbLIZ.append(",ellipsize:");
        sbLIZ.append(((C21335518eX) awS22S0410000_32.l0).L);
        sbLIZ.append(",metrics:");
        sbLIZ.append((BoringLayout.Metrics) awS22S0410000_32.l1);
        sbLIZ.append(",fontSize:");
        sbLIZ.append(((C21335518eX) awS22S0410000_32.l0).I.getTextSize());
        sbLIZ.append(",isBold:");
        Typeface typeface = (Typeface) awS22S0410000_32.l2;
        Boolean boolValueOf2 = null;
        if (typeface != null) {
            boolValueOf = Boolean.valueOf(typeface.isBold());
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        sbLIZ.append(",isItalic:");
        Typeface typeface2 = (Typeface) awS22S0410000_32.l2;
        if (typeface2 != null) {
            boolValueOf2 = Boolean.valueOf(typeface2.isItalic());
        }
        sbLIZ.append(boolValueOf2);
        sbLIZ.append(",fontWeight:");
        sbLIZ.append((Integer) awS22S0410000_32.l3);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$1(AwS22S0410000_32 awS22S0410000_32) {
        long drawingTime = ((View) awS22S0410000_32.l0).getDrawingTime();
        int iSave = ((Canvas) awS22S0410000_32.l1).save();
        try {
            int iLJZL = ((C21332218e0) awS22S0410000_32.l2).LJZL();
            for (int i = 0; i < iLJZL; i++) {
                AbstractC21333318eB<?> abstractC21333318eBLJZI = ((C21332218e0) awS22S0410000_32.l2).LJZI(((InterfaceC21333118e9) awS22S0410000_32.l3).getChildDrawingOrder(iLJZL, i));
                if (abstractC21333318eBLJZI != null && !abstractC21333318eBLJZI.LJJJJLL()) {
                    if (abstractC21333318eBLJZI.LJIILL()) {
                        abstractC21333318eBLJZI.LJJIII((Canvas) awS22S0410000_32.l1);
                    } else if (((View) awS22S0410000_32.l0) instanceof AbstractC21332918e7) {
                        int iSave2 = ((Canvas) awS22S0410000_32.l1).save();
                        if (awS22S0410000_32.z4) {
                            Canvas canvas = (Canvas) awS22S0410000_32.l1;
                            C21332218e0 c21332218e0 = (C21332218e0) awS22S0410000_32.l2;
                            canvas.translate(-c21332218e0.f, -c21332218e0.g);
                        }
                        ((AbstractC21332918e7) ((View) awS22S0410000_32.l0)).drawChild((Canvas) awS22S0410000_32.l1, abstractC21333318eBLJZI.getView(), drawingTime);
                        ((Canvas) awS22S0410000_32.l1).restoreToCount(iSave2);
                    } else {
                        C1325860kbg.LIZIZ(null, new AwS576S0100000_32((C21332218e0) awS22S0410000_32.l2, 865), C2097608Jq.LJ());
                    }
                }
            }
        } finally {
            try {
            } catch (Throwable th) {
            }
        }
        ((Canvas) awS22S0410000_32.l1).restoreToCount(iSave);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS22S0410000_32(C21335518eX c21335518eX, boolean z, BoringLayout.Metrics metrics, Typeface typeface, Integer num, int i) {
        super(0);
        this.$t = i;
        this.l0 = c21335518eX;
        this.z4 = z;
        this.l1 = metrics;
        this.l2 = typeface;
        this.l3 = num;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS22S0410000_32(View view, Canvas canvas, C21332218e0 c21332218e0, C21332318e1 c21332318e1, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = view;
        this.l1 = canvas;
        this.l2 = c21332218e0;
        this.l3 = c21332318e1;
        this.z4 = z;
    }
}
