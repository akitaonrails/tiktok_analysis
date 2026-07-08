package com.ss.android.ugc.aweme.tako.otherpage.memory.ui;

import X.C07Q4;
import X.C0DSB;
import X.C0GZF;
import X.C0OM1;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C147Y;
import X.C1857690yRT;
import X.C197039127h;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C427690Gpr;
import X.C444890HcV;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC344240DeY;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS431S0200000_30;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.AwS609S0100000_30;
import kotlin.text.a0;
import wh6.AbS709S0100000_30;

/* JADX INFO: loaded from: classes31.dex */
public final class TakoMemoryGuideSheetFragment extends Fragment implements InterfaceC344240DeY {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjEtIiB9JzEkLD0jKSIpHELIOSZyI2JSo+MGEmIWsYKCQ8BSAhJj0qDzAlLSoAICApPQkhKSIhLCEn";
    public TakoEnterParams LL;
    public Boolean LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public final List<C147Y> LLILZIL = new ArrayList();
    public final C444890HcV LLILZLL;

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZJ(new AwS574S0100000_30(this, 255));
        c0om1.LIZIZ(c1251150ifB);
        return c0om1;
    }

    public TakoMemoryGuideSheetFragment() {
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.LIZ(112);
        this.LLILZLL = c444890HcV;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) view.findViewById(R.id.title);
        textView.setText(textView.getContext().getString(2131849695));
        TextView textView2 = (TextView) view.findViewById(R.id.ip2);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(textView2.getContext().getString(2131849686));
        MR(R.raw.icon_noticeboard, textView2.getContext(), spannableStringBuilder);
        textView2.setText(spannableStringBuilder);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.ioz);
        String string = tuxTextView.getContext().getString(2131849693);
        String strJ4 = C786410Ut5.j4(tuxTextView.getContext().getString(2131849685), Arrays.copyOf(new Object[]{string}, 1));
        tuxTextView.setMovementMethod(new LinkMovementMethod());
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(strJ4);
        int iLJJJ = a0.LJJJ(spannableStringBuilder2, string, 0, false, 6);
        if (C07Q4.LIZ()) {
            C1857690yRT.LIZJ(spannableStringBuilder2, iLJJJ, string.length() + iLJJJ, C1308910kAL.LIZJ(R.attr.a1n, tuxTextView.getContext()), this.LLILZLL.getTypeface(), new AwS609S0100000_30(this, 109));
        } else {
            C1857690yRT.LJ(spannableStringBuilder2, iLJJJ, iLJJJ + string.length(), C1308910kAL.LIZJ(R.attr.a1n, tuxTextView.getContext()), this.LLILZLL.getTypeface(), new AwS431S0200000_30(tuxTextView, this, 22));
        }
        tuxTextView.setText(spannableStringBuilder2);
        TextView textView3 = (TextView) view.findViewById(R.id.pox);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(textView3.getContext().getString(2131849688));
        MR(R.raw.icon_control, textView3.getContext(), spannableStringBuilder3);
        textView3.setText(spannableStringBuilder3);
        TextView textView4 = (TextView) view.findViewById(R.id.pop);
        try {
            textView4.setText(C786410Ut5.j4(textView4.getContext().getString(2131849687), Arrays.copyOf(new Object[]{textView4.getContext().getString(2131849694)}, 1)));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            textView4.setText(textView4.getContext().getString(2131849687));
        }
        Boolean bool = this.LLILLJJLI;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            C197039127h c197039127h = (C197039127h) view.findViewById(R.id.pks);
            C0DSB.LIZJ(c197039127h);
            TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.pi0);
            C0DSB.LIZJ(tuxTextView2);
            C427690Gpr.LJ(tuxTextView2, C418440Gaw.LIZIZ(10));
            if (zBooleanValue) {
                c197039127h.setText(c197039127h.getContext().getString(2131849689));
                C786410Ut5.U8(c197039127h, new AbS709S0100000_30(this, 1));
                tuxTextView2.setText(tuxTextView2.getContext().getString(2131849691));
                C786410Ut5.h9(tuxTextView2, new AbS709S0100000_30(this, 2));
            } else {
                c197039127h.setText(c197039127h.getContext().getString(2131849692));
                C786410Ut5.U8(c197039127h, new AbS709S0100000_30(this, 3));
                tuxTextView2.setText(tuxTextView2.getContext().getString(2131849690));
                C786410Ut5.h9(tuxTextView2, new AbS709S0100000_30(this, 4));
            }
        }
        Iterator it2 = ((ArrayList) this.LLILZIL).iterator();
        while (it2.hasNext()) {
            ((C147Y) it2.next()).onShow();
        }
    }

    public static void MR(int i, Context context, SpannableStringBuilder spannableStringBuilder) {
        spannableStringBuilder.insert(0, "*");
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = i;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
        tuxIconDrawableLIZ.setBounds(0, 0, tuxIconDrawableLIZ.LIZJ(), tuxIconDrawableLIZ.LIZIZ());
        C0GZF c0gzf = new C0GZF(tuxIconDrawableLIZ, 2);
        C0GZF.LIZJ(c0gzf, C426750GoL.LIZLLL(context), 0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), 22);
        C786410Ut5.q2(spannableStringBuilder, c0gzf, 0, 1, 33);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0086  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r6, android.view.ViewGroup r7, android.os.Bundle r8) {
        /*
            r5 = this;
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 0
            r0 = 33
            java.lang.String r2 = "tako_enter_param"
            if (r1 < r0) goto L73
            android.os.Bundle r1 = r5.getArguments()
            if (r1 == 0) goto L86
            java.lang.Class<com.ss.android.ugc.aweme.tako.model.TakoEnterParams> r0 = com.ss.android.ugc.aweme.tako.model.TakoEnterParams.class
            java.io.Serializable r1 = r1.getSerializable(r2, r0)
            com.ss.android.ugc.aweme.tako.model.TakoEnterParams r1 = (com.ss.android.ugc.aweme.tako.model.TakoEnterParams) r1
        L17:
            r5.LL = r1
            android.os.Bundle r0 = r5.getArguments()
            java.lang.String r4 = "is_memory_on"
            r2 = 0
            if (r0 == 0) goto L71
            boolean r1 = r0.containsKey(r4)
            r0 = 1
            if (r1 != r0) goto L71
        L29:
            if (r0 == 0) goto L6f
            r0 = r5
        L2c:
            if (r0 == 0) goto L3e
            android.os.Bundle r0 = r5.getArguments()
            if (r0 == 0) goto L6d
            boolean r0 = r0.getBoolean(r4)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L3c:
            r5.LLILLJJLI = r0
        L3e:
            android.os.Bundle r1 = r5.getArguments()
            if (r1 == 0) goto L6b
            java.lang.String r0 = "tako_session_id"
            java.lang.String r0 = r1.getString(r0)
        L4a:
            r5.LLILLL = r0
            android.os.Bundle r1 = r5.getArguments()
            if (r1 == 0) goto L69
            java.lang.String r0 = "tako_chat_id"
            java.lang.String r0 = r1.getString(r0)
        L58:
            r5.LLILZ = r0
            r0 = 2131566919(0x7f0d2147, float:1.8759393E38)
            android.view.View r2 = X.C786410Ut5.Td(r6, r0, r7, r2)
            boolean r0 = r2 instanceof android.view.View
            if (r0 != 0) goto L66
            r2 = r3
        L66:
            if (r2 == 0) goto La6
            goto L88
        L69:
            r0 = r3
            goto L58
        L6b:
            r0 = r3
            goto L4a
        L6d:
            r0 = r3
            goto L3c
        L6f:
            r0 = r3
            goto L2c
        L71:
            r0 = 0
            goto L29
        L73:
            android.os.Bundle r0 = r5.getArguments()
            if (r0 == 0) goto L84
            java.io.Serializable r1 = r0.getSerializable(r2)
        L7d:
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.tako.model.TakoEnterParams
            if (r0 == 0) goto L86
            com.ss.android.ugc.aweme.tako.model.TakoEnterParams r1 = (com.ss.android.ugc.aweme.tako.model.TakoEnterParams) r1
            goto L17
        L84:
            r1 = r3
            goto L7d
        L86:
            r1 = r3
            goto L17
        L88:
            androidx.lifecycle.LifecycleOwner r0 = r5.getViewLifecycleOwner()     // Catch: java.lang.Throwable -> Lac
            androidx.lifecycle.ViewTreeLifecycleOwner.set(r2, r0)     // Catch: java.lang.Throwable -> Lac
            androidx.lifecycle.ViewTreeViewModelStoreOwner.set(r2, r5)     // Catch: java.lang.Throwable -> Lac
            r0 = 2131400122(0x7f0a95ba, float:1.8421089E38)
            r2.setTag(r0, r5)     // Catch: java.lang.Throwable -> Lac
            X.19EG r1 = r5.getActivity()     // Catch: java.lang.Throwable -> Lac
            boolean r0 = r1 instanceof X.C19GS     // Catch: java.lang.Throwable -> Lac
            if (r0 == 0) goto La3
            r3 = r1
            X.19GS r3 = (X.C19GS) r3     // Catch: java.lang.Throwable -> Lac
        La3:
            X.C1685300txQ.LIZ(r3)     // Catch: java.lang.Throwable -> Lac
        La6:
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> Lac
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> Lac
            return r2
        Lac:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.otherpage.memory.ui.TakoMemoryGuideSheetFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
