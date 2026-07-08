package com.bytedance.android.livesdk.game.broadcast.speeddetector;

import X.C0TKK;
import X.C1119170fEJ;
import X.C1338270kvh;
import X.C16FS;
import X.C475510Ikn;
import X.C497740JfY;
import X.C786410Ut5;
import Y.ACListenerS147S0100000_12;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdk.comp.api.game.GamePreparationNetworkSpeedTipsDialogAlive;
import com.bytedance.android.livesdk.comp.api.game.GamePreparationPageDestroyEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: loaded from: classes13.dex */
public final class GamePreparationNetworkSpeedTipsDialog extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LyQhLGExOiotLSwyOzFiOj82HELIOSLSEoLDs2KzEjO2EUKSgpGT02OCQ+KDs6JysCLDskJzcnGj82LSEYID8gDCwtJSA0";
    public int LLJLLL = -1;
    public boolean LLJZ;

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        c1119170fEJ.LIZ(C497740JfY.LJIJI(2131844547));
        return c1119170fEJ;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null) {
            dataChannelLJ.zW(GamePreparationNetworkSpeedTipsDialogAlive.class, Boolean.FALSE);
        }
        Map<String, Object> map = C1338270kvh.LIZ;
        if (!this.LLJZ) {
            C0TKK.LJ(this.LLJLLL, "click", "cancel");
        }
        this.LLJZ = false;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(0, null);
        sheetOptions.cornerRadius = (int) C497740JfY.LIZIZ(12.0f);
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null) {
            dataChannelLJ.zW(GamePreparationNetworkSpeedTipsDialogAlive.class, Boolean.TRUE);
        }
        Map<String, Object> map = C1338270kvh.LIZ;
        this.LLJZ = false;
        Bundle arguments = getArguments();
        if (arguments != null) {
            i = arguments.getInt("enter_from");
        } else {
            i = -1;
        }
        this.LLJLLL = i;
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        getActivity();
        return layoutInflaterOnGetLayoutInflater;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null) {
            dataChannelLJ.BQ2(this, GamePreparationPageDestroyEvent.class, new AwS591S0100000_12(this, 988));
        }
        C16FS c16fs = (C16FS) view.findViewById(R.id.ypg);
        if (c16fs != null) {
            C786410Ut5.h8(c16fs, new ACListenerS147S0100000_12(this, 201));
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.g72, viewGroup, false);
    }
}
