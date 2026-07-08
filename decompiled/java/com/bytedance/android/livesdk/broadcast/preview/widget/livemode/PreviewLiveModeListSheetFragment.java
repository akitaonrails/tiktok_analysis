package com.bytedance.android.livesdk.broadcast.preview.widget.livemode;

import X.AbstractC21673619ry;
import X.C01GW;
import X.C1119170fEJ;
import X.C452501pT;
import X.C497740JfY;
import X.C5182020e;
import X.C786410Ut5;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes.dex */
public final class PreviewLiveModeListSheetFragment extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KjcjKCswKTY4Zz8hLTMlLDh9HELIOSPywoLionZiklPyo+JyEpZx8hLTMlLDgfITMpBCA3LQklOjsAICApPQkhKSIhLCEn";
    public RecyclerView LLJLLL;
    public final C01GW LLJZ = C452501pT.LIZIZ(new C5182020e(this, 78));

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        c1119170fEJ.LIZ(C497740JfY.LJIJI(2131857049));
        c1119170fEJ.LJI = false;
        return c1119170fEJ;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLJLLL = null;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(3, null);
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View viewFindViewById = this.LLJLLL;
        if (viewFindViewById == null) {
            View view2 = getView();
            if (view2 != null) {
                viewFindViewById = view2.findViewById(R.id.n22);
            } else {
                viewFindViewById = null;
            }
            this.LLJLLL = (RecyclerView) viewFindViewById;
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        recyclerView.setAdapter((AbstractC21673619ry) this.LLJZ.getValue());
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.gj9, viewGroup, false);
    }
}
