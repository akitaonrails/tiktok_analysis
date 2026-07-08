package com.ss.android.ugc.aweme.poi.detail.videolist.limited;

import X.C1170350gYr;
import X.C1180320gow;
import X.C1185490gxH;
import X.C1187600h0g;
import X.C1188410h1z;
import X.C1189060h32;
import X.C13LE;
import X.C1558360qeg;
import X.C1606420ruC;
import X.C1607950rwf;
import X.C18JG;
import X.C2188811AlT;
import X.InterfaceC1184330gvP;
import X.InterfaceC665370Q7z;
import android.os.Bundle;
import android.util.LruCache;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.detail.videolist.ui.PoiVideoListItemCellFor2columns;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiLimitedVideoListCell extends PoiVideoListItemCellFor2columns {
    @Override // com.ss.android.ugc.aweme.poi.detail.videolist.ui.PoiVideoListItemCellFor2columns
    public final String N5() {
        return "limited";
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.videolist.ui.PoiVideoListItemCellFor2columns
    public final void L5(C1187600h0g c1187600h0g, PoiVideoListItemCellFor2columns poiVideoListItemCellFor2columns, View view, String str, String str2, Boolean bool, C1185490gxH c1185490gxH) {
        C1606420ruC c1606420ruCLIZ = C1607950rwf.LIZ(view, view.getWidth(), view.getHeight());
        LruCache<String, String> lruCache = C1180320gow.LIZ;
        C1180320gow.LIZIZ(c1187600h0g.LLILLJJLI.getAid(), c1187600h0g.LL);
        InterfaceC1184330gvP interfaceC1184330gvP = (InterfaceC1184330gvP) C1170350gYr.LIZIZ(poiVideoListItemCellFor2columns, C13LE.LIZ(InterfaceC1184330gvP.class));
        Bundle bundleLJFF = c1606420ruCLIZ.LJFF();
        Aweme aweme = c1187600h0g.LLILLJJLI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("c7535.d8692_i");
        sbLIZ.append(poiVideoListItemCellFor2columns.getBindingAdapterPosition());
        InterfaceC665370Q7z interfaceC665370Q7zLJFF = null;
        interfaceC1184330gvP.Oe(bundleLJFF, aweme, C18JG.LIZ(C2188811AlT.LIZIZ(sbLIZ), PageFinder.via(view), null), 50, "POI_LIMITED_VIDEO_LIST_ENTRANCE", "limited", null, 0, new LinkedHashMap(), null);
        Aweme aweme2 = c1187600h0g.LLILLJJLI;
        String str3 = c1187600h0g.LL;
        if (str3 == null) {
            str3 = "";
        }
        int adapterPosition = poiVideoListItemCellFor2columns.getAdapterPosition();
        PageFinder pageFinderVia = PageFinder.via(C1189060h32.LJIIJ(this));
        Fragment fragmentLJIIJ = C1189060h32.LJIIJ(this);
        if (fragmentLJIIJ != null) {
            interfaceC665370Q7zLJFF = C1558360qeg.LJFF(fragmentLJIIJ, null);
        }
        C1188410h1z.LIZIZ(aweme2, str3, adapterPosition, str, str2, bool, c1185490gxH, "limited", null, null, null, pageFinderVia, interfaceC665370Q7zLJFF, 3648);
    }
}
