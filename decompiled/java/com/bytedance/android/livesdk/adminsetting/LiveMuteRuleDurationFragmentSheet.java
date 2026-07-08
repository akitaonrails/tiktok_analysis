package com.bytedance.android.livesdk.adminsetting;

import X.C01GW;
import X.C1115360f8A;
import X.C1115380f8C;
import X.C1119170fEJ;
import X.C1161920gLG;
import X.C16F5;
import X.C452501pT;
import X.C497740JfY;
import X.C758170Tod;
import X.C786410Ut5;
import Y.ACListenerS147S0100000_12;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.usermanage.IUserManageService;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS626S0100000_12;
import webcast.api.room.MuteRule;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveMuteRuleDurationFragmentSheet extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KSEhICEgLTE4HELIOSICE0ZgklPyoePTEpGzo/LQE5Oy4nISoiDz0yLygpJzsAICApPQ==";
    public C16F5 LLJLLL;
    public RecyclerView LLJZ;
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 128));
    public final C01GW LLL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 127));
    public final C01GW LLLF = C452501pT.LIZIZ(new AwS556S0100000_12(this, 129));
    public MuteRule LLLFF;
    public LiveSheetFragment LLLFFI;
    public boolean LLLFZ;

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        c1119170fEJ.LIZ(C497740JfY.LJIJI(2131837795));
        c1119170fEJ.LJI = false;
        c1119170fEJ.LJFF = Collections.singletonList(new C758170Tod(R.attr.eo4, new ACListenerS147S0100000_12(this, 116)));
        return c1119170fEJ;
    }

    public final C16F5 uS() {
        View viewFindViewById = this.LLJLLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.oyj) : null;
            this.LLJLLL = (C16F5) viewFindViewById;
        }
        return (C16F5) viewFindViewById;
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

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0TYA, com.bytedance.android.live.design.view.sheet.LiveSheetFragment] */
    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void x1(int i) {
        ?? r0;
        MuteRule muteRule = this.LLLFF;
        if (muteRule != null && (r0 = this.LLLFFI) != 0) {
            r0.Ju(muteRule);
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        Resources resources;
        super.onViewCreated(view, bundle);
        MuteRule muteRule = this.LLLFF;
        View viewFindViewById = null;
        if (muteRule != null && (str = muteRule.content) != null) {
            if (str.length() != 0 && !this.LLLFZ) {
                C786410Ut5.LLJJJJ(uS(), 0);
                String strLJIJJ = C497740JfY.LJIJJ(2131837827, str);
                C1115360f8A c1115360f8A = C1115380f8C.LIZ;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strLJIJJ);
                Context context = getContext();
                if (context != null) {
                    resources = context.getResources();
                } else {
                    resources = null;
                }
                C1115380f8C.LIZLLL(spannableStringBuilder, resources, this, new AwS626S0100000_12(this, 10));
            } else {
                C786410Ut5.LLJJJJ(uS(), 8);
            }
        }
        View view2 = this.LLJZ;
        if (view2 == null) {
            View view3 = getView();
            if (view3 != null) {
                viewFindViewById = view3.findViewById(R.id.oxx);
            }
            this.LLJZ = (RecyclerView) viewFindViewById;
            view2 = viewFindViewById;
        }
        ((RecyclerView) view2).setLayoutManager(new LinearLayoutManager(view.getContext()));
        ((IUserManageService) C1161920gLG.LIZJ(IUserManageService.class)).OP1(new AwS591S0100000_12(this, 153));
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.hf0, viewGroup, false);
    }
}
