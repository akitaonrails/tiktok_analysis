package com.ss.android.ugc.aweme.tako.botpage.components.disclaimer.ui;

import X.C01GW;
import X.C0OM1;
import X.C0QSF;
import X.C1251150ifB;
import X.C1308910kAL;
import X.C1843207Ju;
import X.C1857680yRS;
import X.C1862280yYs;
import X.C197039127h;
import X.C2188811AlT;
import X.C259800zU;
import X.C418440Gaw;
import X.C427690Gpr;
import X.C444890HcV;
import X.C452501pT;
import X.C786410Ut5;
import X.InterfaceC1058150ddt;
import X.InterfaceC202128147a;
import X.InterfaceC344240DeY;
import Y.ACListenerS129S0200000_27;
import Y.ACListenerS164S0100000_30;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.tako.botpage.components.disclaimer.config.PlaceholderInfoModel;
import com.ss.android.ugc.aweme.tako.botpage.components.disclaimer.config.TakoDisclaimerWithTosConfigModel;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.AwS439S0200000_3;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.AwS617S0100000_3;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes31.dex */
public final class TakoDisclaimerWithTosFragment extends Fragment implements InterfaceC344240DeY, InterfaceC1058150ddt {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjEtIiB9Kio4OS40LWsvJiIjJyspJzHELIOSsgZiElOiw/KSwhLD19PSxiHS44JwElOiw/KSwhLD0EITEkHSAgDjctLiI2JjE=";
    public TakoEnterParams LL;
    public final List<InterfaceC202128147a> LLILLJJLI = new ArrayList();
    public final C444890HcV LLILLL;
    public final C01GW LLILZ;

    @Override // X.InterfaceC1058150ddt
    public final void LLLFFI(TuxSheet tuxSheet, float f) {
    }

    @Override // X.InterfaceC1058150ddt
    public final void LLLLIIIILLL(TuxSheet tuxSheet, int i) {
    }

    @Override // X.InterfaceC1058150ddt
    public final boolean onBackPress() {
        return true;
    }

    public final TakoDisclaimerWithTosConfigModel MR() {
        return (TakoDisclaimerWithTosConfigModel) this.LLILZ.getValue();
    }

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZJ(new AwS574S0100000_30(this, 242));
        c0om1.LIZIZ(c1251150ifB);
        return c0om1;
    }

    public TakoDisclaimerWithTosFragment() {
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.LIZ(62);
        this.LLILLL = c444890HcV;
        this.LLILZ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(116));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        int iLJ;
        CharSequence charSequenceNR;
        Integer numLIZ;
        super.onViewCreated(view, bundle);
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.c9o);
        Context context = tuxIconView.getContext();
        if (context != null && (numLIZ = C1308910kAL.LIZ(R.attr.g0d, context)) != null && numLIZ.intValue() == 0) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = !z;
        if (C0QSF.LIZ()) {
            iLJ = C1857680yRS.LIZ.LJ();
        } else if (z2) {
            iLJ = R.raw.icon_bitmap_tako_new_light;
        } else {
            iLJ = R.raw.icon_bitmap_tako_new_dark;
        }
        tuxIconView.setIconRes(iLJ);
        TextView textView = (TextView) view.findViewById(R.id.title);
        String strLIZJ = C1843207Ju.LIZJ();
        if (strLIZJ == null || strLIZJ.length() <= 0) {
            strLIZJ = textView.getContext().getString(2131828540);
        }
        String str = MR().titlePlaceholder;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('{');
        sbLIZ.append(str);
        sbLIZ.append('}');
        textView.setText(u.LJJIFFI(MR().title, C2188811AlT.LIZIZ(sbLIZ), strLIZJ, false));
        TextView textView2 = (TextView) view.findViewById(R.id.evo);
        textView2.setText(NR(MR().contentLearnMore, MR().placeholders, new AwS439S0200000_3(this, (TakoDisclaimerWithTosFragment) null, (Map<String, String>) 0)));
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        TextView textView3 = (TextView) view.findViewById(R.id.ewy);
        textView3.setText(NR(MR().contentTosAndPolicy, MR().placeholders, new AwS439S0200000_3(this, (TakoDisclaimerWithTosFragment) null, (Map<String, String>) 0)));
        textView3.setMovementMethod(LinkMovementMethod.getInstance());
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.eoq);
        C259800zU c259800zU = new C259800zU();
        if (C1862280yYs.LIZLLL(this.LL)) {
            charSequenceNR = MR().confirmButtonPassiveEntrance;
        } else {
            charSequenceNR = NR(MR().confirmButtonActiveEntrance, MR().placeholders, new AwS617S0100000_3(c259800zU, (C259800zU<String>) 2));
        }
        c197039127h.setText(charSequenceNR);
        C786410Ut5.U8(c197039127h, new ACListenerS129S0200000_27(c259800zU, this, 6));
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.t3_);
        tuxTextView.setText(MR().refuseButton);
        C786410Ut5.h9(tuxTextView, new ACListenerS164S0100000_30(this, 5));
        C427690Gpr.LJ(tuxTextView, C418440Gaw.LIZIZ(10));
        Iterator it2 = ((ArrayList) this.LLILLJJLI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC202128147a) it2.next()).onShow();
        }
    }

    public static CharSequence NR(CharSequence charSequence, Map map, Function2 function2) {
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('{');
            sbLIZ.append(str);
            sbLIZ.append('}');
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (a0.LJJIIZI(charSequence, strLIZIZ, false)) {
                strLIZIZ.toString();
                int iLJJJ = a0.LJJJ(charSequence, strLIZIZ, 0, false, 6);
                charSequence = new SpannableStringBuilder(charSequence).replace(iLJJJ, strLIZIZ.length() + iLJJJ, (CharSequence) ((PlaceholderInfoModel) entry.getValue()).transValue);
                CharSequence charSequence2 = (CharSequence) function2.invoke(entry.getValue(), charSequence);
                if (charSequence2 != null) {
                    charSequence = charSequence2;
                }
            }
        }
        return charSequence;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r5, android.view.ViewGroup r6, android.os.Bundle r7) {
        /*
            r4 = this;
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 0
            r0 = 33
            java.lang.String r2 = "tako_enter_param"
            if (r1 < r0) goto L29
            android.os.Bundle r1 = r4.getArguments()
            if (r1 == 0) goto L3c
            java.lang.Class<com.ss.android.ugc.aweme.tako.model.TakoEnterParams> r0 = com.ss.android.ugc.aweme.tako.model.TakoEnterParams.class
            java.io.Serializable r1 = r1.getSerializable(r2, r0)
            com.ss.android.ugc.aweme.tako.model.TakoEnterParams r1 = (com.ss.android.ugc.aweme.tako.model.TakoEnterParams) r1
        L17:
            r4.LL = r1
            r1 = 2131566918(0x7f0d2146, float:1.8759391E38)
            r0 = 0
            android.view.View r2 = X.C786410Ut5.Td(r5, r1, r6, r0)
            boolean r0 = r2 instanceof android.view.View
            if (r0 != 0) goto L26
            r2 = r3
        L26:
            if (r2 == 0) goto L5c
            goto L3e
        L29:
            android.os.Bundle r0 = r4.getArguments()
            if (r0 == 0) goto L3a
            java.io.Serializable r1 = r0.getSerializable(r2)
        L33:
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.tako.model.TakoEnterParams
            if (r0 == 0) goto L3c
            com.ss.android.ugc.aweme.tako.model.TakoEnterParams r1 = (com.ss.android.ugc.aweme.tako.model.TakoEnterParams) r1
            goto L17
        L3a:
            r1 = r3
            goto L33
        L3c:
            r1 = r3
            goto L17
        L3e:
            androidx.lifecycle.LifecycleOwner r0 = r4.getViewLifecycleOwner()     // Catch: java.lang.Throwable -> L62
            androidx.lifecycle.ViewTreeLifecycleOwner.set(r2, r0)     // Catch: java.lang.Throwable -> L62
            androidx.lifecycle.ViewTreeViewModelStoreOwner.set(r2, r4)     // Catch: java.lang.Throwable -> L62
            r0 = 2131400122(0x7f0a95ba, float:1.8421089E38)
            r2.setTag(r0, r4)     // Catch: java.lang.Throwable -> L62
            X.19EG r1 = r4.getActivity()     // Catch: java.lang.Throwable -> L62
            boolean r0 = r1 instanceof X.C19GS     // Catch: java.lang.Throwable -> L62
            if (r0 == 0) goto L59
            r3 = r1
            X.19GS r3 = (X.C19GS) r3     // Catch: java.lang.Throwable -> L62
        L59:
            X.C1685300txQ.LIZ(r3)     // Catch: java.lang.Throwable -> L62
        L5c:
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L62
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L62
            return r2
        L62:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.botpage.components.disclaimer.ui.TakoDisclaimerWithTosFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
