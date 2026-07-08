package com.ss.android.ugc.profile.business.user.creator.product;

import X.C1250210idf;
import X.C1541950qED;
import android.content.Context;
import android.view.View;
import com.bytedance.hybrid.spark.SparkContext;
import com.google.gson.n;
import com.ss.android.ugc.profile.business.profile.menu.business.content.business.base.Cell;
import com.ss.android.ugc.profile.business.profile.menu.business.content.business.base.CellBizBaseData;
import com.ss.android.ugc.profile.platform.base.data.Action;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.standard.protocol.component.ContentCellProtocol;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class ContentCellTiktokGoProtocol extends ContentCellProtocol {
    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final String getName() {
        return "content_section_cell_local_service_tiktok_go";
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.ProfilePlatformProtocol
    public final boolean LJII(View view) {
        List<Action> list;
        Action.RouterInfo router;
        String url;
        boolean z = this.LLJL;
        ProfileComponents profileComponents = this.LLJILJILJ;
        if (profileComponents != null && (list = profileComponents.actions) != null) {
            for (Action action : list) {
                if (Intrinsics.LJFF(action.getType(), "router") && (router = action.getRouter()) != null && (url = router.getUrl()) != null) {
                    SparkContext sparkContext = new SparkContext();
                    sparkContext.LJJLIIJ(url);
                    sparkContext.LJJJLZIJ(z ? 1 : 0, "has_show_reddot");
                    Context context = getContext();
                    if (context != null) {
                        C1541950qED.LIZJ.getClass();
                        new C1541950qED(context, sparkContext).LIZIZ();
                        return true;
                    }
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.ss.android.ugc.profile.platform.standard.protocol.component.ContentCellProtocol
    public final boolean LJLJLLL(n nVar) {
        n nVar2;
        Cell cell;
        ProfileComponents profileComponents = this.LLJILJILJ;
        if (profileComponents != null) {
            nVar2 = profileComponents.bizData;
        } else {
            nVar2 = null;
        }
        CellBizBaseData cellBizBaseData = (CellBizBaseData) C1250210idf.LIZ(String.valueOf(nVar2), CellBizBaseData.class);
        if (cellBizBaseData != null && (cell = cellBizBaseData.getCell()) != null) {
            return Intrinsics.LJFF(cell.getTailRedDot(), Boolean.TRUE);
        }
        return false;
    }
}
