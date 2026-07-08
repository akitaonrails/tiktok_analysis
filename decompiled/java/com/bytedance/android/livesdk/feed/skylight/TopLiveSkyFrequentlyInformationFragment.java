package com.bytedance.android.livesdk.feed.skylight;

import X.C1119170fEJ;
import X.C20736316Cj;
import X.C758170Tod;
import X.C786410Ut5;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class TopLiveSkyFrequentlyInformationFragment extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9LiApLWEgIzwgICg7HELIOSPGsYJj8fITMpGiQqDjcpODo2JjEgMAY9Lio+JC4nISoiDz0yLygpJzs=";

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        ArrayList arrayList = new ArrayList();
        C758170Tod c758170TodUR = UR();
        if (c758170TodUR != null) {
            arrayList.add(c758170TodUR);
        }
        c1119170fEJ.LJ = arrayList;
        return c1119170fEJ;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        return C20736316Cj.LIZIZ(R.attr.fx2, context);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.gco, viewGroup, false);
    }
}
