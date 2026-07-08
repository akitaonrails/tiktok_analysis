package com.ss.android.ugc.aweme.story.feed.detail;

import X.C1620900sHY;
import X.C638920P4g;
import X.InterfaceC1255404vg;
import com.ss.android.ugc.aweme.IDetailPageOperatorService;
import java.util.HashMap;

/* JADX INFO: loaded from: classes25.dex */
public final class StoryDefaultOperatorServiceImpl implements IDetailPageOperatorService {
    @Override // com.ss.android.ugc.aweme.IDetailPageOperatorService
    public final HashMap<String, InterfaceC1255404vg> LIZ() {
        HashMap<String, InterfaceC1255404vg> map = new HashMap<>();
        map.put("STORY_ENTRANCE_DEFAULT", new C1620900sHY(2));
        map.put("STORY_ENTRANCE_COMMON", new C1620900sHY(3));
        C1620900sHY c1620900sHY = new C1620900sHY(9);
        map.put("STORY_ENTRANCE_WIDGET", c1620900sHY);
        map.put("STORY_ENTRANCE_NOTE", c1620900sHY);
        C1620900sHY c1620900sHY2 = new C1620900sHY(8);
        map.put("STORY_ENTRANCE_MINE", c1620900sHY2);
        map.put("STORY_ENTRANCE_OTHER", c1620900sHY2);
        map.put("STORY_ENTRANCE_AVATAR", c1620900sHY2);
        map.put("STORY_ENTRANCE_PREVIEW", c1620900sHY2);
        map.put("STORY_ENTRANCE_MUSIC_COVER_AVATAR", new C638920P4g(1));
        map.put("STORY_ENTRANCE_CELEBRATION", new C1620900sHY(4));
        map.put("STORY_ENTRANCE_OUT_PUSH", new C1620900sHY(5));
        map.put("STORY_TO_POST", new C1620900sHY(6));
        map.put("STORY_ENTRANCE_INNER_PUSH", new C1620900sHY(7));
        return map;
    }
}
