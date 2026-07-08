package com.bytedance.android.livesdk.chatroom.interact.model;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _SearchBar_ProtoDecoder implements C0IMD<SearchBar> {
    public static SearchBar LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        SearchBar searchBar = new SearchBar();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        C1516700pZU.LJ(c1516680pZS);
                    } else {
                        searchBar.content = C1516700pZU.LIZLLL(c1516680pZS);
                    }
                } else {
                    searchBar.bgImage = _ImageModel_ProtoDecoder.LIZLLL(c1516680pZS);
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return searchBar;
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(SearchBar searchBar) {
        ImageModel imageModel = searchBar.bgImage;
        if (imageModel != null) {
            _ImageModel_ProtoDecoder.LJ(imageModel);
        }
    }

    @Override // X.C0IMD
    public final SearchBar LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, SearchBar searchBar, List list) {
    }
}
