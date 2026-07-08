package com.bytedance.android.livesdk.broadcast.preview.widget.setting;

import X.C0IJT;
import X.C0UKZ;
import X.C474500IjA;
import X.C474650IjP;
import X.C475510Ikn;
import X.C497740JfY;
import X.C500260Jjc;
import X.C771530UOh;
import X.C772120UQo;
import X.C786410Ut5;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class PreviewPushGuidanceFragmentSheet extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KjcjKCswKTY4Zz8hLTMlLDh9HELIOSPywoLionZjYpPTs6JiJiGT02PiwpPh8mOy0LPCY3KSsvLAkhKSIhLCEnGy0pLDs=";
    public String LLJLLL = "";
    public String LLJZ = "";
    public String LLJZIJLIL = "";

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(3, null);
        return sheetOptions;
    }

    public final void uS(boolean z) {
        String str;
        String str2;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_encourage_guidance_panel");
        c474500IjALIZ.LJJII(String.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        if (z) {
            str = "click";
        } else {
            str = "show";
        }
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LJJII(this.LLJZIJLIL, "push_from");
        c474500IjALIZ.LJJII(this.LLJLLL, "push_label");
        c474500IjALIZ.LJJII(this.LLJZ, "rule_id");
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
        C772120UQo c772120UQo;
        super.onViewCreated(view, bundle);
        C500260Jjc.LJLIIIL(500L, view.findViewById(R.id.rng), new AwS591S0100000_12(this, 415));
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null && (c772120UQo = (C772120UQo) dataChannelLJ.gg0(C771530UOh.class)) != null) {
            String str = c772120UQo.LIZIZ;
            this.LLJLLL = str;
            this.LLJZ = c772120UQo.LIZJ;
            this.LLJZIJLIL = c772120UQo.LIZ;
            if (Intrinsics.LJFF(str, "live_encourage_new_followers")) {
                TextView textView = (TextView) view.findViewById(R.id.sis);
                if (textView != null) {
                    textView.setText(C497740JfY.LJIJI(2131855458));
                }
                LiveIconView liveIconView = (LiveIconView) view.findViewById(R.id.sin);
                if (liveIconView != null) {
                    liveIconView.setIconAttr(R.attr.elm);
                }
                TextView textView2 = (TextView) view.findViewById(R.id.sio);
                if (textView2 != null) {
                    textView2.setText(C497740JfY.LJIJI(2131855456));
                }
                TextView textView3 = (TextView) view.findViewById(R.id.sim);
                if (textView3 != null) {
                    textView3.setText(C497740JfY.LJIJI(2131855457));
                }
            }
        }
        C0UKZ.LLIIIZ.LIZJ(Boolean.TRUE);
        uS(false);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.hi2, viewGroup, false);
    }
}
