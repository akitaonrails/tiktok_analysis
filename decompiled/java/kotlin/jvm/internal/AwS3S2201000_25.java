package kotlin.jvm.internal;

import X.C09AY;
import X.C1308910kAL;
import X.C1670840ta6;
import X.C1826440xd4;
import X.C427350GpJ;
import X.C786410Ut5;
import X.EnumC19358310oP;
import X.EnumC21568119ax;
import Y.ACListenerS159S0100000_25;
import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes26.dex */
public class AwS3S2201000_25 extends C09AY implements Function1 {
    public final int $t;
    public int i4;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;

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

    public static final Object invoke$0(AwS3S2201000_25 awS3S2201000_25, Object obj) {
        int iIntValue;
        Context context = (Context) obj;
        C427350GpJ c427350GpJ = new C427350GpJ(context);
        List list = (List) awS3S2201000_25.l2;
        int i = awS3S2201000_25.i4;
        String str = awS3S2201000_25.s0;
        String str2 = awS3S2201000_25.s1;
        Function0 function0 = (Function0) awS3S2201000_25.l3;
        c427350GpJ.setBubbleShape(EnumC21568119ax.LEFT_BOTTOM_LARGE);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1f, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -1;
        }
        c427350GpJ.setFillColor(iIntValue);
        c427350GpJ.setBubbleAnchor(EnumC19358310oP.START_BOTTOM);
        c427350GpJ.setBodyMinWidthOverrideDp(108.0f);
        float f = c427350GpJ.getResources().getDisplayMetrics().density;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        int i2 = (int) (16 * f);
        int i3 = (int) (14 * f);
        linearLayout.setPadding(i2, i3, i2, i3);
        C1826440xd4 c1826440xd4 = new C1826440xd4(context, null, 6);
        c1826440xd4.setId(R.id.xtv);
        c1826440xd4.setFontStepOnOverflow(true);
        c1826440xd4.setMaxFontSize(21);
        c1826440xd4.setAutoSizeSteps(C1670840ta6.LIZ);
        c1826440xd4.setText(str);
        linearLayout.addView(c1826440xd4, new LinearLayout.LayoutParams(-2, -2));
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setId(R.id.xtw);
        tuxTextView.setTuxFont(91);
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1k, context);
        if (numLIZJ2 != null) {
            tuxTextView.setTextColor(numLIZJ2.intValue());
        }
        tuxTextView.setText(str2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = (int) (4 * f);
        linearLayout.addView(tuxTextView, layoutParams);
        c427350GpJ.addView(linearLayout, new FrameLayout.LayoutParams(-2, -2, 17));
        c427350GpJ.LJIIIIZZ(i, list);
        c427350GpJ.setOnLikeAreaClickListener(new ACListenerS159S0100000_25(function0, 56));
        return c427350GpJ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS3S2201000_25 awS3S2201000_25, Object obj) {
        ViewGroup viewGroup;
        C427350GpJ c427350GpJ = (C427350GpJ) obj;
        ViewParent parent = c427350GpJ.getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        int i = 0;
        if (viewGroup != null) {
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
        }
        TextView textView = (TextView) c427350GpJ.findViewById(R.id.xtv);
        if (textView != null) {
            textView.setText(awS3S2201000_25.s0);
        }
        TuxTextView tuxTextView = (TuxTextView) c427350GpJ.findViewById(R.id.xtw);
        if (tuxTextView != null) {
            String str = awS3S2201000_25.s1;
            tuxTextView.setText(str);
            if (str.length() == 0) {
                i = 8;
            }
            C786410Ut5.LLLLZLL(tuxTextView, i);
        }
        c427350GpJ.LJIIIIZZ(awS3S2201000_25.i4, (List) awS3S2201000_25.l2);
        c427350GpJ.setOnLikeAreaClickListener(new ACListenerS159S0100000_25((Function0) awS3S2201000_25.l3, 55));
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS3S2201000_25(int r3, java.lang.String r4, java.lang.String r5, java.util.List r6, kotlin.jvm.functions.Function0 r7, int r8) {
        /*
            r2 = this;
            r2.$t = r8
            if (r8 == 0) goto L14
            r1 = r2
            r1.s0 = r4
            r1.l2 = r6
            r1.i4 = r3
            r1.s1 = r5
            r1.l3 = r7
            r0 = 1
        L10:
            r1.<init>(r0)
            return
        L14:
            r1 = r2
            r1.l2 = r6
            r1.i4 = r3
            r1.s0 = r4
            r1.s1 = r5
            r1.l3 = r7
            r0 = 1
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS3S2201000_25.<init>(int, java.lang.String, java.lang.String, java.util.List, kotlin.jvm.functions.Function0, int):void");
    }
}
