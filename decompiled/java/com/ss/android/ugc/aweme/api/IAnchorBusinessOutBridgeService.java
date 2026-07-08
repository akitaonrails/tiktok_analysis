package com.ss.android.ugc.aweme.api;

import X.C1387380mCu;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.WikipediaInfo;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.external.ui.UgcTemplateAlbumConfig;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public interface IAnchorBusinessOutBridgeService {
    List<String> LIZ(AnchorCommonStruct anchorCommonStruct, String... strArr);

    void LIZIZ(Context context, WikipediaInfo wikipediaInfo, Map<String, String> map, Map<String, String> map2);

    boolean LIZJ();

    C1387380mCu LIZLLL(Aweme aweme);

    UgcTemplateAlbumConfig LJ(AnchorCommonStruct anchorCommonStruct, Aweme aweme, AsyncAVService asyncAVService);

    String LJFF(String str);

    C1387380mCu LJI(Aweme aweme);
}
