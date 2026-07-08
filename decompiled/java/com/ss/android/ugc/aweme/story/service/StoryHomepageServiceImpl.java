package com.ss.android.ugc.aweme.story.service;

import X.AbstractC1585770rMt;
import X.C0VSJ;
import X.C13LE;
import X.C1585060rLk;
import X.C1585730rMp;
import X.C1585740rMq;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C786410Ut5;
import X.C844470XAv;
import android.content.Context;
import com.ss.android.ugc.aweme.story.homepage.StoryHomepageService;
import com.ss.android.ugc.aweme.story.homepage.StoryToolBarIconAssem;

/* JADX INFO: loaded from: classes25.dex */
public final class StoryHomepageServiceImpl implements StoryHomepageService {
    /* JADX WARN: Type inference failed for: r0v0, types: [X.0rMq] */
    @Override // com.ss.android.ugc.aweme.story.homepage.StoryHomepageService
    public final C1585740rMq LIZ() {
        return new AbstractC1585770rMt() { // from class: X.0rMq
            public final C01GW LIZLLL = C452501pT.LIZIZ(new C1585750rMr());

            @Override // X.AbstractC1585770rMt
            public final InterfaceC1570900qyu LIZJ() {
                return (InterfaceC1570900qyu) this.LIZLLL.getValue();
            }

            @Override // X.AbstractC1585770rMt
            public final EnumC1584360rKc LIZIZ() {
                return EnumC1584360rKc.STORY_CAMERA;
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0rMp] */
    @Override // com.ss.android.ugc.aweme.story.homepage.StoryHomepageService
    public final C1585730rMp LIZJ() {
        return new AbstractC1585770rMt() { // from class: X.0rMp
            public final C01GW LIZLLL = C452501pT.LIZIZ(new C1585720rMo());

            @Override // X.AbstractC1585770rMt
            public final InterfaceC1570900qyu LIZJ() {
                return (InterfaceC1570900qyu) this.LIZLLL.getValue();
            }

            @Override // X.AbstractC1585770rMt
            public final EnumC1584360rKc LIZIZ() {
                return EnumC1584360rKc.STORY;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.story.homepage.StoryHomepageService
    public final C0VSJ LIZLLL() {
        C844470XAv.LIZ.getClass();
        return new C0VSJ(C786410Ut5.y2(C844470XAv.LIZ(), "story_shoot_cache"), "last_frame.jpg");
    }

    @Override // com.ss.android.ugc.aweme.story.homepage.StoryHomepageService
    public final C19719912Dl getToolBarAssem() {
        if (C1585060rLk.LIZIZ()) {
            return C13LE.LIZ(StoryToolBarIconAssem.class);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.story.homepage.StoryHomepageService
    public final C0VSJ LIZIZ(String str) {
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("story_shoot_cache/");
        sbLIZ.append(str);
        return new C0VSJ(C786410Ut5.y2(contextLIZ, C2188811AlT.LIZIZ(sbLIZ)), "story_camera_screen_shot_cache.webp");
    }
}
