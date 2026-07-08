package ec;

import X.C1337240ku2;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C800330VaR;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.widget.Toast;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import dc.a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes21.dex */
public final class a {
    public static final boolean LIZ(dc.a aVar) {
        if (aVar instanceof a.c) {
            return Boolean.parseBoolean(aVar.LIZ);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getBoolean:Drawable unsupported ParamsType type: ");
        sbLIZ.append(aVar.LIZ);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final String LJ(String str) {
        int iLJJJJI = a0.LJJJJI(str, ":", 0, 6);
        if (iLJJJJI != -1) {
            return str.substring(iLJJJJI + 1);
        }
        return str;
    }

    public static final int LIZIZ(Context context, dc.a aVar) {
        boolean z = aVar instanceof a.b;
        if (z && Intrinsics.LJFF(((a.b) aVar).LIZIZ, "attr")) {
            return android.view.a.LIZIZ(CastIntegerProtector.parseInt(aVar.LIZ), context);
        }
        if ((aVar instanceof a.c) && u.LJJIIJZLJL(aVar.LIZ, "#", false)) {
            if (aVar.LIZ.length() >= 7) {
                return ColorProtector.parseColor(aVar.LIZ);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("color format must be like #FF0000 current is ");
            sbLIZ.append(aVar.LIZ);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (z) {
            a.b bVar = (a.b) aVar;
            if (bVar.LIZIZ.equals("color")) {
                return context.getResources().getColor(CastIntegerProtector.parseInt(aVar.LIZ));
            }
            if (u.LJJIIJZLJL(bVar.LIZIZ, "attr", false)) {
                TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{CastIntegerProtector.parseInt(aVar.LIZ)});
                int color = typedArrayObtainStyledAttributes.getColor(0, 0);
                typedArrayObtainStyledAttributes.recycle();
                return color;
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("getColor:Drawable unsupported ParamsType type: ");
        sbLIZ2.append(aVar.LIZ);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x008a, code lost:
    
        if (r1.equals("dip") != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009e, code lost:
    
        return android.util.TypedValue.applyDimension(1, com.bytedance.mt.protector.impl.string2number.CastFloatProtector.parseFloat(r7.LIZ), r6.getResources().getDisplayMetrics());
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a5, code lost:
    
        if (r1.equals("dp") != false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final float LIZJ(android.content.Context r6, dc.a r7) {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ec.a.LIZJ(android.content.Context, dc.a):float");
    }

    public static final Drawable LIZLLL(Context context, dc.a aVar) {
        if (aVar instanceof a.b) {
            a.b bVar = (a.b) aVar;
            if (!Intrinsics.LJFF(bVar.LIZIZ, "drawable") && !Intrinsics.LJFF(bVar.LIZIZ, "color")) {
                if (Intrinsics.LJFF(((a.b) aVar).LIZIZ, "attr")) {
                    TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{CastIntegerProtector.parseInt(aVar.LIZ)});
                    Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
                    typedArrayObtainStyledAttributes.recycle();
                    return drawable;
                }
            } else {
                int i = CastIntegerProtector.parseInt(aVar.LIZ);
                Drawable drawableLIZIZ = C800330VaR.LIZIZ(context, i);
                if (drawableLIZIZ != null) {
                    return drawableLIZIZ;
                }
                return context.getResources().getDrawable(i);
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getDrawable:Drawable unsupported ParamsType type: ");
        sbLIZ.append(aVar.LIZ);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LJFF(Context context, String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(" unsupported attr: ");
        sbLIZ.append(str2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (C1337240ku2.LIZ) {
            C786410Ut5.re(Toast.makeText(context, strLIZIZ, 1));
        }
        throw new IllegalArgumentException(strLIZIZ);
    }
}
