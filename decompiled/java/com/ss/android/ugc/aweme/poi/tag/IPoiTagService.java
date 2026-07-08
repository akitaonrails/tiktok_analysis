package com.ss.android.ugc.aweme.poi.tag;

import X.C03D6;
import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.container.protocol.priority.VideoTagCategoryProtocol;
import java.util.HashMap;

/* JADX INFO: loaded from: classes12.dex */
public interface IPoiTagService {
    void appendPoiTagParamsIfHave(String str, HashMap<String, String> map, Aweme aweme);

    VideoTagCategoryProtocol getPoiTagTrigger();

    VideoTagCategoryProtocol getPoiTagTriggerV2();

    C03D6 getPoiTagView(Context context);

    boolean isPoiTagShow(String str, Aweme aweme);
}
