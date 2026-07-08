package com.bytedance.android.livesdk.comp.impl.musicgift.ui.detail;

import X.C19EH;
import X.C1DUN;
import X.C497740JfY;
import X.C786410Ut5;
import X.EnumC1284920jXe;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes18.dex */
public final class MusicGiftDetailPageDialogFragment extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZyImOywvLiHELIOSY1PGs5IGE3LTEtICN9BTA/ICwUISM4DSonKSwgGS40LQElKCM8LwM+KCg+LSs4";
    public DataChannel LLJLLL;
    public C1DUN LLJZ;
    public MusicGiftDetailViewModel LLJZIJLIL;
    public boolean LLL;
    public boolean LLLF;
    public long LLLFF;

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        return 0;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        if (!this.LLL) {
            this.LLL = true;
            MusicGiftDetailViewModel musicGiftDetailViewModel = this.LLJZIJLIL;
            if (musicGiftDetailViewModel != null) {
                musicGiftDetailViewModel.LQ2();
            }
        }
        MusicGiftDetailViewModel musicGiftDetailViewModel2 = this.LLJZIJLIL;
        if (musicGiftDetailViewModel2 != null) {
            musicGiftDetailViewModel2.LLJZ = null;
        }
        C1DUN c1dun = this.LLJZ;
        if (c1dun != null) {
            c1dun.LIZLLL();
            c1dun.LLILLL = null;
            c1dun.LLJILLL = null;
            c1dun.LLJJ = null;
        }
        this.LLJZ = null;
        this.LLJZIJLIL = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        C1DUN c1dun = this.LLJZ;
        if (c1dun != null) {
            c1dun.LIZLLL();
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C1DUN c1dun = this.LLJZ;
        if (c1dun == null || c1dun.LLILZIL) {
            return;
        }
        c1dun.LLILZIL = true;
        c1dun.LL.setRenderMode(EnumC1284920jXe.WHEN_DIRTY);
        c1dun.LJ();
        c1dun.LJFF(true);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(3, null);
        sheetOptions.cornerRadius = (int) C497740JfY.LIZIZ(26.0f);
        sheetOptions.canceledOnTouchOutside = true;
        sheetOptions.draggable = true;
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            C19EH c19ehLJIIJ = getParentFragmentManager().LJIIJ();
            c19ehLJIIJ.LJIIZILJ(this);
            c19ehLJIIJ.LJIIJ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0110  */
    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r32, android.os.Bundle r33) {
        /*
            Method dump skipped, instruction units count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.comp.impl.musicgift.ui.detail.MusicGiftDetailPageDialogFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.hex, viewGroup, false);
    }
}
