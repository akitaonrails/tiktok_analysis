package com.bytedance.android.livesdk.interaction.drawguess.ui;

import X.C01GW;
import X.C0URX;
import X.C1091700eW0;
import X.C19EH;
import X.C452501pT;
import X.C475510Ikn;
import X.C786410Ut5;
import X.C946050aj5;
import X.C946060aj6;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdk.model.DrawGuessChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AwS551S0100000_7;

/* JADX INFO: loaded from: classes8.dex */
public final class DrawGuessNewStartDialogV2 extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9ISs4LD0yKzElJiHELIOSF9LDctPigmLTY/Zzo6ZgE+KDgUPSA/OgE2PxY4KD0nDCwtJSA0Hnc=";
    public Integer LLJLLL;
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 69));

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(0, null);
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final void mS(boolean z) {
        ((DrawGuessNewStartDialog) this.LLJZ.getValue()).u2(0, z);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void x1(int i) {
        C946060aj6 c946060aj6LIZ;
        C946050aj5 c946050aj5LIZIZ;
        C946060aj6 c946060aj6LIZ2;
        C946050aj5 c946050aj5LIZIZ2;
        if (((DrawGuessNewStartDialog) this.LLJZ.getValue()).LLJIJIL) {
            DataChannel dataChannelLJ = C475510Ikn.LJ(this);
            if (dataChannelLJ != null && (c946060aj6LIZ2 = C0URX.LIZ(dataChannelLJ, DrawGuessChannel.class)) != null && (c946050aj5LIZIZ2 = c946060aj6LIZ2.LIZIZ()) != null) {
                c946050aj5LIZIZ2.LIZIZ(1);
                return;
            }
            return;
        }
        DataChannel dataChannelLJ2 = C475510Ikn.LJ(this);
        if (dataChannelLJ2 == null || (c946060aj6LIZ = C0URX.LIZ(dataChannelLJ2, DrawGuessChannel.class)) == null || (c946050aj5LIZIZ = c946060aj6LIZ.LIZIZ()) == null) {
            return;
        }
        c946050aj5LIZIZ.LIZIZ(2);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Integer num = this.LLJLLL;
        if (num != null) {
            int iIntValue = num.intValue();
            C19EH c19ehLJIIJ = getParentFragmentManager().LJIIJ();
            c19ehLJIIJ.LIZJ(iIntValue, (Fragment) this.LLJZ.getValue(), null);
            c19ehLJIIJ.LJIIJ();
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C1091700eW0 c1091700eW0 = new C1091700eW0(layoutInflater.getContext());
        c1091700eW0.setId(View.generateViewId());
        C786410Ut5.v6(c1091700eW0, new ViewGroup.LayoutParams(-1, -1));
        this.LLJLLL = Integer.valueOf(c1091700eW0.getId());
        return c1091700eW0;
    }
}
