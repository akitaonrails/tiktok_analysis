package com.bytedance.android.livesdk.game.broadcast.fragment.dualdevice3;

import X.C01GW;
import X.C09JN;
import X.C0J1N;
import X.C0TDF;
import X.C0TDL;
import X.C1143680frq;
import X.C11RD;
import X.C16FS;
import X.C1701940uOG;
import X.C452501pT;
import X.C497740JfY;
import X.C500260Jjc;
import X.C786410Ut5;
import X.C960203pA;
import Y.ACListenerS116S0200000_12;
import Y.ACListenerS147S0100000_12;
import Y.AfS181S0100000_12;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class GameDualDeviceBeInvitedDialog extends LiveSheetFragment {
    public static Long LLLFF = null;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LyQhLGExOiotLSwyOzFiLz0yHELIOSLygpJzt9LDAtJSs2PiwvLHx9DyQhLAsmKSkILDk6KyAOLAY9Piw4LCsXISQgJig=";
    public final C01GW LLJLLL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 266));
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 264));
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 263));
    public final C01GW LLL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 262));
    public final C01GW LLLF = C452501pT.LIZIZ(new AwS556S0100000_12(this, 265));

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) view.findViewById(R.id.yvg);
        if (textView != null) {
            textView.setText(C497740JfY.LJIJJ(2131853796, this.LLL.getValue()));
        }
        View viewFindViewById = view.findViewById(R.id.yri);
        if (viewFindViewById != null) {
            if (C500260Jjc.LJJJI(Boolean.valueOf(C960203pA.LIZIZ(viewFindViewById.getContext())))) {
                str = "ttlive_dual_device_icon_be_invited_dark.png";
            } else {
                str = "ttlive_dual_device_icon_be_invited.png";
            }
            C1143680frq.LJ(viewFindViewById, "tiktok_live_game_demand_2", str, ImageView.ScaleType.CENTER_INSIDE);
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.ypi);
        if (imageView != null) {
            C786410Ut5.Q7(imageView, new ACListenerS147S0100000_12(this, 41));
        }
        C16FS c16fs = (C16FS) view.findViewById(R.id.yqj);
        if (c16fs != null) {
            c16fs.setMaxWidth(Integer.MAX_VALUE);
            C786410Ut5.h8(c16fs, new ACListenerS147S0100000_12(this, 42));
        }
        C16FS c16fs2 = (C16FS) view.findViewById(R.id.yqi);
        if (c16fs2 != null) {
            c16fs2.setMaxWidth(Integer.MAX_VALUE);
            C786410Ut5.h8(c16fs2, new ACListenerS116S0200000_12(this, c16fs2, 7));
        }
        C0TDL.LIZLLL(null, "shoot", "live_take_prepare", null);
        ((C0J1N) C0TDF.LIZJ().LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LIZLLL(this))).LIZ(new AfS181S0100000_12(this, 94), new C09JN() { // from class: X.0T6r
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("GameDualDeviceBeInvitedDialog@a4b3.onViewCreated$2");
                C20441214yg.LJ("GameDualDeviceBeInvitedDialog", Log.getStackTraceString((Throwable) obj));
                C1C7U.LIZIZ("GameDualDeviceBeInvitedDialog@a4b3.onViewCreated$2");
            }
        });
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.g5v, viewGroup, false);
    }
}
