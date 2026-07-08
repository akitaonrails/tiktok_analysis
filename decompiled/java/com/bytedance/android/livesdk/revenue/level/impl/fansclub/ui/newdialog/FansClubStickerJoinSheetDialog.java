package com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialog;

import X.C1091700eW0;
import X.C1095570ecF;
import X.C19EH;
import X.C497740JfY;
import X.C786410Ut5;
import X.InterfaceC1095170ebb;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.uikit.setting.LiveSheetMigrationFansGroupGuideV2Setting;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public class FansClubStickerJoinSheetDialog extends LiveSheetFragment implements InterfaceC1095170ebb {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9OiA6LCEmLWsgLDk2JGslJD8/ZiMtHELIOSJzwwJDAuZzo6ZispPis6KSkjLmEVKSs/CiMmKhY4ICw4LTcGJiY9Gy0pLDsXISQgJig=";
    public final FansClubStickerJoinDialog LLJLLL = new FansClubStickerJoinDialog(true);
    public Integer LLJZ;

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        return 0;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int l5(Context context) {
        return -1;
    }

    @Override // X.InterfaceC1095170ebb
    public final void LP(int i) {
        this.LLJLLL.LLILZIL.LL = i;
    }

    @Override // X.InterfaceC1095170ebb
    public final void Rv(Map<String, ? extends Object> map) {
        this.LLJLLL.LLILZIL.LLILLJJLI = map;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(0, null);
        sheetOptions.cornerRadius = (int) C497740JfY.LIZIZ(12.0f);
        sheetOptions.draggable = LiveSheetMigrationFansGroupGuideV2Setting.INSTANCE.enablePullDownClose();
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View hS(LayoutInflater layoutInflater, C1095570ecF c1095570ecF) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        C786410Ut5.a6(frameLayout, layoutParams);
        FrameLayout frameLayout2 = new FrameLayout(layoutInflater.getContext());
        frameLayout2.addView(frameLayout);
        this.LLJLLL.LLJILJIL = frameLayout;
        return frameLayout2;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Integer num = this.LLJZ;
        if (num != null) {
            int iIntValue = num.intValue();
            C19EH c19ehLJIIJ = getParentFragmentManager().LJIIJ();
            FansClubStickerJoinDialog fansClubStickerJoinDialog = this.LLJLLL;
            fansClubStickerJoinDialog.mShowsDialog = false;
            c19ehLJIIJ.LIZJ(iIntValue, fansClubStickerJoinDialog, null);
            c19ehLJIIJ.LJIIJ();
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C1091700eW0 c1091700eW0 = new C1091700eW0(layoutInflater.getContext());
        c1091700eW0.setId(View.generateViewId());
        C786410Ut5.v6(c1091700eW0, new ViewGroup.LayoutParams(-1, -1));
        this.LLJZ = Integer.valueOf(c1091700eW0.getId());
        return c1091700eW0;
    }
}
