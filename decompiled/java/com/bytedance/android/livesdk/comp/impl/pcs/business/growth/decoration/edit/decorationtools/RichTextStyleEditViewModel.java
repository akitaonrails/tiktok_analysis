package com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.decorationtools;

import X.C01DP;
import X.C01GW;
import X.C1559260qg8;
import X.C20441214yg;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C229200uY;
import X.C229500ub;
import X.C2876019m;
import X.C2878019o;
import X.C2879019p;
import X.C2880019q;
import X.C2883019t;
import X.C291001Au;
import X.C452501pT;
import X.C454590Hs9;
import X.C497740JfY;
import X.C814420VxA;
import X.InterfaceC0148002o;
import com.bytedance.android.livesdk.model.ColorBackground;
import com.bytedance.android.livesdk.model.EdgeInsets;
import com.bytedance.android.livesdk.model.RichTextStyle;
import com.bytedance.android.livesdk.model.StrokeStyle;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AwS127S1200000_11;

/* JADX INFO: loaded from: classes.dex */
public final class RichTextStyleEditViewModel extends AssemViewModel<C2880019q> {
    public final C1559260qg8 LL = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C01DP.class, (Class<Object>) "FullCustomizedBoardHierarchyData", (String) 13), true);
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new C2879019p());
    public final C01GW LLILLL = C452501pT.LIZIZ(new C2876019m(this));
    public final LinkedHashMap<Integer, Integer> LLILZ;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        C2883019t c2883019t = (C2883019t) this.LLILLJJLI.getValue();
        C2878019o c2878019oLJFF = c2883019t.LIZIZ.LJFF();
        if (c2878019oLJFF == null) {
            c2878019oLJFF = c2883019t.LIZ();
        }
        int i = c2878019oLJFF.LIZ;
        C2883019t c2883019t2 = (C2883019t) this.LLILLJJLI.getValue();
        C2878019o c2878019oLJFF2 = c2883019t2.LIZIZ.LJFF();
        if (c2878019oLJFF2 == null) {
            c2878019oLJFF2 = c2883019t2.LIZ();
        }
        return new C2880019q(new C291001Au(null), new C291001Au(null), i, c2878019oLJFF2.LIZIZ, new C291001Au(Boolean.FALSE), new Pair(1, Integer.valueOf(R.raw.icon_lines_left_aligned)));
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void wQ2() {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.edit.decorationtools.RichTextStyleEditViewModel.wQ2():void");
    }

    public RichTextStyleEditViewModel() {
        Pair[] pairArr = new Pair[3];
        boolean zLIZ = C454590Hs9.LIZ(C497740JfY.LJII());
        int i = R.raw.icon_lines_right_aligned;
        pairArr[0] = new Pair(1, Integer.valueOf(zLIZ ? R.raw.icon_lines_right_aligned : R.raw.icon_lines_left_aligned));
        pairArr[1] = new Pair(2, Integer.valueOf(R.raw.icon_lines_center_aligned));
        pairArr[2] = new Pair(3, Integer.valueOf(C454590Hs9.LIZ(C497740JfY.LJII()) ? R.raw.icon_lines_left_aligned : i));
        this.LLILZ = C2097608Jq.LJII(pairArr);
    }

    public final void vQ2(RichTextStyle richTextStyle, int i) {
        int i2;
        RichTextStyle richTextStyleLIZ;
        C229200uY c229200uY = getState().LLILLJJLI.LIZ;
        if (c229200uY != null && (richTextStyleLIZ = c229200uY.LIZ()) != null) {
            i2 = richTextStyleLIZ.fontSize;
        } else {
            i2 = 24;
        }
        float f = i2 / i;
        ColorBackground colorBackground = richTextStyle.colorBackground;
        if (colorBackground != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("debug stephen.choo font sizes: ");
            sbLIZ.append(i);
            sbLIZ.append(' ');
            sbLIZ.append(i2);
            sbLIZ.append(" radii: ");
            sbLIZ.append(colorBackground.radius);
            sbLIZ.append(' ');
            sbLIZ.append(C814420VxA.LIZIZ(colorBackground.radius * f));
            C20441214yg.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), "logs");
            colorBackground.radius *= f;
            EdgeInsets edgeInsets = colorBackground.padding;
            if (edgeInsets != null) {
                edgeInsets.top *= f;
                edgeInsets.bottom *= f;
                edgeInsets.right *= f;
                edgeInsets.left *= f;
            }
        }
    }

    public static void xQ2(RichTextStyleEditViewModel richTextStyleEditViewModel, Integer num, Integer num2, String str, StrokeStyle strokeStyle, String str2, ColorBackground colorBackground, EdgeInsets edgeInsets, boolean z, Float f, ColorBackground colorBackground2, Float f2, int i) {
        ColorBackground colorBackground3 = colorBackground2;
        Float f3 = f;
        boolean z2 = z;
        EdgeInsets edgeInsets2 = edgeInsets;
        ColorBackground colorBackground4 = colorBackground;
        String str3 = str2;
        StrokeStyle strokeStyle2 = strokeStyle;
        String str4 = str;
        Integer num3 = num2;
        Integer num4 = num;
        Float f4 = null;
        if ((i & 1) != 0) {
            num4 = null;
        }
        if ((i & 2) != 0) {
            num3 = null;
        }
        if ((i & 4) != 0) {
            str4 = null;
        }
        if ((i & 8) != 0) {
            strokeStyle2 = null;
        }
        if ((i & 16) != 0) {
            str3 = null;
        }
        if ((i & 32) != 0) {
            colorBackground4 = null;
        }
        if ((i & 64) != 0) {
            edgeInsets2 = null;
        }
        if ((i & 128) != 0) {
            z2 = false;
        }
        if ((i & 256) != 0) {
            f3 = null;
        }
        if ((i & 512) != 0) {
            colorBackground3 = null;
        }
        if ((i & 1024) == 0) {
            f4 = f2;
        }
        richTextStyleEditViewModel.getClass();
        richTextStyleEditViewModel.withState(new C229500ub(richTextStyleEditViewModel, z2, num3, num4, str4, strokeStyle2, str3, colorBackground4, colorBackground3, f4, edgeInsets2, f3));
    }
}
