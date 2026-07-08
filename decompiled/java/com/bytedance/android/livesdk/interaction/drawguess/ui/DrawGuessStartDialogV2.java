package com.bytedance.android.livesdk.interaction.drawguess.ui;

import X.C1091700eW0;
import X.C19EH;
import X.C786410Ut5;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;

/* JADX INFO: loaded from: classes8.dex */
public final class DrawGuessStartDialogV2 extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9ISs4LD0yKzElHELIOSJiF9LDctPigmLTY/Zzo6ZgE+KDgUPSA/OhwnKTc4DSYyJCorH30=";
    public Integer LLJLLL;

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(0, null);
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Integer num = this.LLJLLL;
        if (num != null) {
            int iIntValue = num.intValue();
            C19EH c19ehLJIIJ = getParentFragmentManager().LJIIJ();
            DrawGuessStartDialog drawGuessStartDialog = new DrawGuessStartDialog();
            drawGuessStartDialog.mShowsDialog = false;
            c19ehLJIIJ.LIZJ(iIntValue, drawGuessStartDialog, null);
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
