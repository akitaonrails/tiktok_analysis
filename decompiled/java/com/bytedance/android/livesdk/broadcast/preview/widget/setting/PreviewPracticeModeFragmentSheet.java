package com.bytedance.android.livesdk.broadcast.preview.widget.setting;

import X.C0IJT;
import X.C474500IjA;
import X.C474650IjP;
import X.C500260Jjc;
import X.C770730ULf;
import X.C786410Ut5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class PreviewPracticeModeFragmentSheet extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KjcjKCswKTY4Zz8hLTMlLDh9HELIOSPywoLionZjYpPTs6JiJiGT02PiwpPh8hKSY4ICw2BSooLAkhKSIhLCEnGy0pLDs=";

    public final void uS(String str) {
        String str2;
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        String str3 = "1";
        if (C474650IjP.LIZ()) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str2, "is_new_anchor");
        if (!C474650IjP.LIZ()) {
            str3 = null;
        }
        c474500IjALIZ.LJJII(str3, "has_enter_trymode");
        C770730ULf.LIZLLL(c474500IjALIZ);
        c474500IjALIZ.LJJIJL();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        uS("livesdk_practice_icon_show");
        C500260Jjc.LJLIIIL(500L, view.findViewById(R.id.rng), new AwS591S0100000_12(this, 414));
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.hi5, viewGroup, false);
    }
}
