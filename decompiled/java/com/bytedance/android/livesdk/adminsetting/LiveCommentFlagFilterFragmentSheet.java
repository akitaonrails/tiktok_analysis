package com.bytedance.android.livesdk.adminsetting;

import X.C01GW;
import X.C0PEM;
import X.C0TZB;
import X.C1119170fEJ;
import X.C16F5;
import X.C1DFH;
import X.C20736316Cj;
import X.C20743516Fd;
import X.C2107308Nj;
import X.C21411818qq;
import X.C23250099c;
import X.C292401Bi;
import X.C416770GVv;
import X.C475510Ikn;
import X.C497740JfY;
import X.C750780Tci;
import X.C750800Tck;
import X.C758170Tod;
import X.C786410Ut5;
import X.C814420VxA;
import X.C817503Hh;
import Y.ACListenerS147S0100000_12;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveCommentFlagFilterFragmentSheet extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KSEhICEgLTE4HELIOSICE0ZgklPyoQJyghLCEnDiktLgk6JDEpOwkhKSIhLCEnGy0pLDs=";
    public C16F5 LLJLLL;
    public C21411818qq LLJZ;
    public final String LLJZIJLIL = "{icon}";
    public boolean LLL = true;
    public final C01GW LLLF = C292401Bi.LIZ(new AwS556S0100000_12(this, 113));
    public final C01GW LLLFF = C292401Bi.LIZ(new AwS556S0100000_12(this, 112));

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C758170Tod(R.attr.eo4, new ACListenerS147S0100000_12(this, 87)));
        c1119170fEJ.LJFF = arrayList;
        c1119170fEJ.LJI = false;
        return c1119170fEJ;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJLLL = null;
        this.LLJZ = null;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(0, null);
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void x1(int i) {
        C817503Hh c817503Hh = C817503Hh.LL;
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(c817503Hh, C2107308Nj.LIZ, null, new C750800Tck(this, null), 2);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Long lValueOf;
        long[] longArray;
        Boolean bool;
        super.onViewCreated(view, bundle);
        View viewFindViewById = this.LLJLLL;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.mp5);
            } else {
                viewFindViewById = null;
            }
            this.LLJLLL = (C16F5) viewFindViewById;
        }
        TextView textView = (TextView) viewFindViewById;
        C20743516Fd c20743516FdLIZLLL = C20736316Cj.LIZLLL(R.attr.dr8, getContext());
        if (c20743516FdLIZLLL != null) {
            c20743516FdLIZLLL.setTint(C20736316Cj.LIZIZ(R.attr.ezq, getContext()));
        }
        if (c20743516FdLIZLLL != null) {
            float f = 15;
            c20743516FdLIZLLL.setBounds(0, 0, C814420VxA.LIZIZ(C497740JfY.LIZIZ(f)), C814420VxA.LIZIZ(C497740JfY.LIZIZ(f)));
        }
        String string = getString(2131838720);
        boolean zBooleanValue = true;
        CharSequence charSequence = string;
        if (c20743516FdLIZLLL != null) {
            C416770GVv c416770GVv = new C416770GVv(c20743516FdLIZLLL);
            c416770GVv.LLILZ = C497740JfY.LJIIIZ(R.dimen.sv);
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(string, new String[]{this.LLJZIJLIL}, 0, 6);
            charSequence = string;
            if (listLJJLIIIJILLIZJL != null) {
                charSequence = string;
                if (listLJJLIIIJILLIZJL.size() == 2) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence) ListProtector.get(listLJJLIIIJILLIZJL, 0));
                    C786410Ut5.q2(spannableStringBuilder, c416770GVv, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 17);
                    spannableStringBuilder.append((CharSequence) ListProtector.get(listLJJLIIIJILLIZJL, 1));
                    charSequence = spannableStringBuilder;
                }
            }
        }
        textView.setText(charSequence);
        Bundle arguments = getArguments();
        if (arguments != null) {
            lValueOf = Long.valueOf(arguments.getLong("trigger"));
        } else {
            lValueOf = null;
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            longArray = arguments2.getLongArray("trigger_comment_id");
        } else {
            longArray = null;
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C750780Tci(this, lValueOf, longArray, null), 3);
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null && (bool = (Boolean) dataChannelLJ.gg0(C0TZB.class)) != null) {
            zBooleanValue = bool.booleanValue();
        }
        this.LLL = zBooleanValue;
        DataChannel dataChannelLJ2 = C475510Ikn.LJ(this);
        if (dataChannelLJ2 != null) {
            dataChannelLJ2.SX0(C0TZB.class, Boolean.FALSE);
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.gcr, viewGroup, false);
    }
}
