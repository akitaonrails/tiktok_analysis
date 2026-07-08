package com.bytedance.android.livesdk.impl.revenue.strategy.panel.rechargeconsumption.panels;

import X.C0IPC;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C814420VxA;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public abstract class AbsTaskDetailPanel extends LiveSheetFragment {
    public static boolean LLJLLL;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, X.InterfaceC513210KAt
    public final /* synthetic */ int getThemeOverlay(Context context) {
        return C0IPC.LIZ();
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment
    public final /* synthetic */ boolean isLight(Context context) {
        return true;
    }

    public abstract View uS(LayoutInflater layoutInflater, ViewGroup viewGroup);

    public abstract View wS(LayoutInflater layoutInflater, ViewGroup viewGroup);

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(3, null);
        sheetOptions.draggable = false;
        sheetOptions.cancelable = false;
        sheetOptions.cornerRadius = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void x1(int i) {
        LLJLLL = false;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        LLJLLL = true;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.g2b, viewGroup, false);
        ViewGroup viewGroup2 = (ViewGroup) viewTd.findViewById(R.id.d_r);
        viewGroup2.addView(uS(layoutInflater, viewGroup2));
        ViewGroup viewGroup3 = (ViewGroup) viewTd.findViewById(R.id.d_z);
        viewGroup3.addView(wS(layoutInflater, viewGroup3), 0);
        return viewTd;
    }
}
