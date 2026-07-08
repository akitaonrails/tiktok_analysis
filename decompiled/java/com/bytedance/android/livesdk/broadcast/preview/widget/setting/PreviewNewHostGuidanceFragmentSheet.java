package com.bytedance.android.livesdk.broadcast.preview.widget.setting;

import X.C0IJT;
import X.C474500IjA;
import X.C474650IjP;
import X.C500260Jjc;
import X.C786410Ut5;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdk.userservice.UserService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class PreviewNewHostGuidanceFragmentSheet extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KjcjKCswKTY4Zz8hLTMlLDh9PyHELIOSwoLionZjYpPTs6JiJiGT02PiwpPgE2Pw0jOjsUPSwoKCEwLQM+KCg+LSs4Gic2LTE=";

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(3, null);
        return sheetOptions;
    }

    public final void uS(String str) {
        String str2;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_encourage_guidance_panel");
        c474500IjALIZ.LJJII(String.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LJJII("outapp_push", "push_from");
        c474500IjALIZ.LJJII("live_encourage_get_access", "push_label");
        if (C474650IjP.LIZ()) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str2, "is_new_anchor");
        c474500IjALIZ.LJJIJL();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C500260Jjc.LJLIIIL(500L, view.findViewById(R.id.p6u), new AwS591S0100000_12(this, 412));
        C500260Jjc.LJLIIIL(500L, view.findViewById(R.id.p6v), new AwS591S0100000_12(this, 413));
        uS("show");
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.hhr, viewGroup, false);
    }
}
