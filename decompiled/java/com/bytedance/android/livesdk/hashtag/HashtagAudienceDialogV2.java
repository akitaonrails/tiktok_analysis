package com.bytedance.android.livesdk.hashtag;

import X.C1091700eW0;
import X.C1161920gLG;
import X.C19EH;
import X.C786410Ut5;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public final class HashtagAudienceDialogV2 extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9ICHELIOSQ/ITsyL2sEKDw7PCQrCDo3ISAiKioXISQgJigFeg==";
    public Integer LLJLLL;

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final int ZR() {
        return R.id.hto;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        if (((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).Nx()) {
            sheetOptions.LIZ(4, context);
        } else {
            sheetOptions.LIZ(2, null);
        }
        sheetOptions.draggable = true;
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Integer num = this.LLJLLL;
        if (num != null) {
            int iIntValue = num.intValue();
            C19EH c19ehLJIIJ = getParentFragmentManager().LJIIJ();
            HashtagAudienceDialog hashtagAudienceDialog = new HashtagAudienceDialog();
            hashtagAudienceDialog.mShowsDialog = false;
            c19ehLJIIJ.LIZJ(iIntValue, hashtagAudienceDialog, null);
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
