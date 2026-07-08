package com.ss.android.ugc.aweme.cell;

import X.C11G4;
import X.C127M;
import X.C19323610io;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import Y.ACListenerS162S0100000_28;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes29.dex */
public final class DisclosureCell extends TuxCell<C19323610io, C11G4> {
    public TuxSpinner LLILLJJLI;

    /* JADX WARN: Multi-variable type inference failed */
    public final View R5() {
        View view;
        C19323610io c19323610io = (C19323610io) getItem();
        if (c19323610io != null && (view = c19323610io.LLJJL) != null) {
            return view;
        }
        TuxSpinner tuxSpinner = this.LLILLJJLI;
        if (tuxSpinner == null) {
            return null;
        }
        return tuxSpinner;
    }

    @Override // com.ss.android.ugc.aweme.cell.TuxCell
    public final C127M N5(Context context) {
        TuxSpinner tuxSpinner = new TuxSpinner(context, null, 6, 0);
        tuxSpinner.LIZ(R.raw.icon_spinner_thin, R.attr.a1k);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        layoutParams.gravity = 17;
        C786410Ut5.X6(tuxSpinner, layoutParams);
        C786410Ut5.LLZILL(tuxSpinner, 8);
        this.LLILLJJLI = tuxSpinner;
        C11G4 c11g4 = new C11G4(context, null);
        c11g4.LJIILL(new ACListenerS162S0100000_28(this, 166));
        return c11g4;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d8  */
    @Override // com.ss.android.ugc.aweme.cell.TuxCell, com.ss.android.ugc.aweme.cell.BaseCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: S5, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.C19323610io r8) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.cell.DisclosureCell.onBindItemView(X.10io):void");
    }
}
