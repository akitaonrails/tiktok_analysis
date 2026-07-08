package com.bytedance.android.livesdk.broadcast.preview.widget.setting;

import X.C1119170fEJ;
import X.C19EH;
import X.C20736316Cj;
import X.C497740JfY;
import X.C758170Tod;
import X.C786410Ut5;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveVisibleScopeSettingSheet extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KjcjKCswKTY4Zz8hLTMlLDHELIOSh9PywoLionZjYpPTs6JiJiBSYlLRMlOiYxJCAfKiAjLRYpPTs6JiIfISo2PA==";
    public DataChannel LLJLLL;
    public final int LLJZ = View.generateViewId();

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        c1119170fEJ.LIZ(C497740JfY.LJIJI(2131856078));
        c1119170fEJ.LJI = false;
        ArrayList arrayList = new ArrayList();
        C758170Tod c758170TodVR = VR();
        if (c758170TodVR != null) {
            arrayList.add(c758170TodVR);
        }
        c1119170fEJ.LJ = arrayList;
        return c1119170fEJ;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        return C20736316Cj.LIZIZ(R.attr.exw, context);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(0, null);
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
        int i = this.LLJZ;
        DataChannel dataChannel = this.LLJLLL;
        LiveVisibleScopeSettingFragment liveVisibleScopeSettingFragment = new LiveVisibleScopeSettingFragment();
        liveVisibleScopeSettingFragment.LL = dataChannel;
        liveVisibleScopeSettingFragment.LLILLJJLI = null;
        liveVisibleScopeSettingFragment.LLILLL = true;
        c19ehLJIIJ.LJIJ(i, liveVisibleScopeSettingFragment, null);
        c19ehLJIIJ.LJIIJJI();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        frameLayout.setId(this.LLJZ);
        C786410Ut5.a6(frameLayout, new ViewGroup.LayoutParams(-1, -2));
        return frameLayout;
    }
}
