package com.bytedance.android.livesdk.broadcast.settingpage;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1119170fEJ;
import X.C20736316Cj;
import X.C497740JfY;
import X.C758170Tod;
import X.C786410Ut5;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.BasePreviewSettingMainFragmentSheetInitializer;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class LivePreviewSettingGiftWrapperFragmentSheet extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KjcjKCswKTY4Zzw2PDElJygjHELIOSKSIpZwM6PiAcOyolISA7GionPCwiLgg6LjEbOy4jOCA+Dz0yLygpJzsAICApPQ==";
    public final BasePreviewSettingMainFragmentSheetInitializer LLJLLL;

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        c1119170fEJ.LIZ(C497740JfY.LJIJI(2131842837));
        c1119170fEJ.LJI = false;
        ArrayList arrayList = new ArrayList();
        C758170Tod c758170TodVR = VR();
        if (c758170TodVR != null) {
            arrayList.add(c758170TodVR);
        }
        c1119170fEJ.LJ = arrayList;
        return c1119170fEJ;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
    }

    public LivePreviewSettingGiftWrapperFragmentSheet(BasePreviewSettingMainFragmentSheetInitializer basePreviewSettingMainFragmentSheetInitializer) {
        this.LLJLLL = basePreviewSettingMainFragmentSheetInitializer;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        return C20736316Cj.LIZIZ(R.attr.ezn, context);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(0, null);
        sheetOptions.cornerRadius = (int) C497740JfY.LIZIZ(26.0f);
        sheetOptions.isClipChildren = true;
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) throws Throwable {
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10501, "com/bytedance/android/livesdk/broadcast/settingpage/LivePreviewSettingGiftWrapperFragmentSheet", "onHiddenChanged", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6Thf6sjOPGmeD+8Dh+RhdxezR2FkdvBVySIPEsJXc10Qk0qWQ4DaPXxV+AXOecXpFdmxZmlM7r8i+bpIzHUJwQ==", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.onHiddenChanged(z);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        BasePreviewSettingMainFragmentSheetInitializer basePreviewSettingMainFragmentSheetInitializer = this.LLJLLL;
        if (basePreviewSettingMainFragmentSheetInitializer != null) {
            basePreviewSettingMainFragmentSheetInitializer.LJIILL(view);
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.h6r, viewGroup, false);
    }
}
