package com.bytedance.android.livesdk.adminsetting;

import X.C01GW;
import X.C0TYA;
import X.C0TYC;
import X.C1119170fEJ;
import X.C16F5;
import X.C452501pT;
import X.C497740JfY;
import X.C500060JjI;
import X.C510160Jza;
import X.C745220TLc;
import X.C751460Tdo;
import X.C758170Tod;
import X.C786180Usi;
import X.C786410Ut5;
import Y.ACListenerS147S0100000_12;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.jvm.internal.AwS556S0100000_12;
import webcast.api.room.MuteRule;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveMuteSuggestFragmentSheet extends LiveSheetFragment implements C0TYA {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KSEhICEgHELIOSLTE4ICE0ZgklPyoePTEpGjo0LyA/PQkhKSIhLCEnGy0pLDs=";
    public C16F5 LLJLLL;
    public C16F5 LLJZ;
    public C16F5 LLJZIJLIL;
    public C16F5 LLL;
    public LinearLayout LLLF;
    public C745220TLc LLLFF;
    public final MuteRule LLLFFI = new MuteRule();
    public final C01GW LLLFZ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 137));
    public final C01GW LLLI = C452501pT.LIZIZ(new AwS556S0100000_12(this, 136));
    public final C01GW LLLII = C452501pT.LIZIZ(new AwS556S0100000_12(this, 138));
    public final int LLLIIII = 4003189;

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C500060JjI cS() {
        C500060JjI c500060JjI = new C500060JjI();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C510160Jza(C497740JfY.LJIJI(2131837794), R.style.a7b, new C786180Usi(this, 3)));
        c500060JjI.LIZ(arrayList);
        return c500060JjI;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        c1119170fEJ.LJI = false;
        c1119170fEJ.LJFF = Collections.singletonList(new C758170Tod(R.attr.eo4, new ACListenerS147S0100000_12(this, 123)));
        return c1119170fEJ;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJLLL = null;
        this.LLJZ = null;
        this.LLJZIJLIL = null;
        this.LLL = null;
        this.LLLF = null;
    }

    @Override // X.C0TYA
    public final void Ju(MuteRule muteRule) {
        this.LLLFF = new C745220TLc(muteRule.durationSecond);
        View viewFindViewById = this.LLL;
        String strLIZIZ = null;
        if (viewFindViewById == null) {
            View view = getView();
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.oxu);
            } else {
                viewFindViewById = null;
            }
            this.LLL = (C16F5) viewFindViewById;
        }
        TextView textView = (TextView) viewFindViewById;
        if (textView != null) {
            C745220TLc c745220TLc = this.LLLFF;
            if (c745220TLc != null) {
                strLIZIZ = C0TYC.LIZIZ(c745220TLc);
            }
            textView.setText(strLIZIZ);
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(2, null);
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Long lValueOf;
        String strLIZIZ;
        String string;
        super.onViewCreated(view, bundle);
        this.LLLFF = C751460Tdo.LIZ();
        Bundle arguments = getArguments();
        View viewFindViewById = null;
        if (arguments != null) {
            lValueOf = Long.valueOf(arguments.getLong("userCnt", 0L));
        } else {
            lValueOf = null;
        }
        MuteRule muteRule = this.LLLFFI;
        muteRule.durationSecond = C751460Tdo.LIZ().LIZ;
        Bundle arguments2 = getArguments();
        String str = "";
        if (arguments2 != null && (string = arguments2.getString("content", "")) != null) {
            str = string;
        }
        muteRule.content = str;
        View viewFindViewById2 = this.LLJLLL;
        if (viewFindViewById2 == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById2 = view2.findViewById(R.id.title);
            } else {
                viewFindViewById2 = null;
            }
            this.LLJLLL = (C16F5) viewFindViewById2;
        }
        ((TextView) viewFindViewById2).setText(C497740JfY.LJIJJ(2131837808, this.LLLFFI.content));
        View viewFindViewById3 = this.LLJZ;
        if (viewFindViewById3 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById3 = view3.findViewById(R.id.pfh);
            } else {
                viewFindViewById3 = null;
            }
            this.LLJZ = (C16F5) viewFindViewById3;
        }
        ((TextView) viewFindViewById3).setText(C497740JfY.LJIJJ(2131837803, lValueOf, this.LLLFFI.content));
        View viewFindViewById4 = this.LLJZIJLIL;
        if (viewFindViewById4 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById4 = view4.findViewById(R.id.pfi);
            } else {
                viewFindViewById4 = null;
            }
            this.LLJZIJLIL = (C16F5) viewFindViewById4;
        }
        ((TextView) viewFindViewById4).setText(C497740JfY.LJIJI(2131837801));
        View viewFindViewById5 = this.LLL;
        if (viewFindViewById5 == null) {
            View view5 = getView();
            if (view5 != null) {
                viewFindViewById5 = view5.findViewById(R.id.oxu);
            } else {
                viewFindViewById5 = null;
            }
            this.LLL = (C16F5) viewFindViewById5;
        }
        TextView textView = (TextView) viewFindViewById5;
        C745220TLc c745220TLc = this.LLLFF;
        if (c745220TLc != null) {
            strLIZIZ = C0TYC.LIZIZ(c745220TLc);
        } else {
            strLIZIZ = null;
        }
        textView.setText(strLIZIZ);
        View view6 = this.LLLF;
        if (view6 == null) {
            View view7 = getView();
            if (view7 != null) {
                viewFindViewById = view7.findViewById(R.id.gq8);
            }
            this.LLLF = (LinearLayout) viewFindViewById;
            view6 = viewFindViewById;
        }
        C786410Ut5.R7((LinearLayout) view6, new ACListenerS147S0100000_12(this, 124));
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.fxo, viewGroup, false);
    }
}
