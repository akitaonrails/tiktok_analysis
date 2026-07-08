package com.ss.android.ugc.aweme;

import X.C0LEI;
import X.C1067210dsV;
import X.C1387380mCu;
import X.C1394340mO8;
import X.C13BV;
import android.content.Context;
import com.ss.android.ugc.aweme.api.IAnchorBusinessOutBridgeService;
import com.ss.android.ugc.aweme.base.AnchorListManager;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.WikipediaInfo;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.external.ui.UgcTemplateAlbumConfig;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public final class AnchorBusinessOutBridgeServiceImpl implements IAnchorBusinessOutBridgeService {
    @Override // com.ss.android.ugc.aweme.api.IAnchorBusinessOutBridgeService
    public final boolean LIZJ() {
        AnchorListManager.LIZ.getClass();
        return AnchorListManager.LIZLLL.getBoolean("anchor_local_map_success", false) && AnchorListManager.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.api.IAnchorBusinessOutBridgeService
    public final C1387380mCu LIZLLL(Aweme aweme) {
        return C1394340mO8.LJIIZILJ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.api.IAnchorBusinessOutBridgeService
    public final String LJFF(String str) {
        C1394340mO8.LIZ.getClass();
        return C1394340mO8.LIZLLL(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d6  */
    @Override // com.ss.android.ugc.aweme.api.IAnchorBusinessOutBridgeService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1387380mCu LJI(com.ss.android.ugc.aweme.feed.model.Aweme r12) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.AnchorBusinessOutBridgeServiceImpl.LJI(com.ss.android.ugc.aweme.feed.model.Aweme):X.0mCu");
    }

    @Override // com.ss.android.ugc.aweme.api.IAnchorBusinessOutBridgeService
    public final List<String> LIZ(AnchorCommonStruct anchorCommonStruct, String... strArr) {
        if (anchorCommonStruct != null) {
            return C0LEI.LIZ(anchorCommonStruct, (String[]) Arrays.copyOf(strArr, strArr.length));
        }
        return C13BV.INSTANCE;
    }

    @Override // com.ss.android.ugc.aweme.api.IAnchorBusinessOutBridgeService
    public final UgcTemplateAlbumConfig LJ(AnchorCommonStruct anchorCommonStruct, Aweme aweme, AsyncAVService asyncAVService) {
        C1394340mO8.LIZ.getClass();
        return C1394340mO8.LJIILJJIL(anchorCommonStruct, aweme, "", "", "", asyncAVService);
    }

    @Override // com.ss.android.ugc.aweme.api.IAnchorBusinessOutBridgeService
    public final void LIZIZ(Context context, WikipediaInfo wikipediaInfo, Map<String, String> map, Map<String, String> map2) {
        C1067210dsV.LIZ(context, wikipediaInfo, map, map2);
    }
}
