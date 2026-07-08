package com.ss.android.ugc.aweme.story.service;

import X.C01GW;
import X.C04TD;
import X.C1697810uHb;
import X.C452501pT;
import com.ss.android.ugc.aweme.story.api.IStoryViewerListImService;
import java.util.List;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryViewerListImServiceImpl implements IStoryViewerListImService {
    public static final List<Integer> LIZIZ = C1697810uHb.LJIIJJI(1, 3);
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(680));

    public static IStoryViewerListImService LIZIZ() {
        Object objLIZ = C04TD.LIZ(IStoryViewerListImService.class, false);
        if (objLIZ != null) {
            return (IStoryViewerListImService) objLIZ;
        }
        if (C04TD.C5 == null) {
            synchronized (IStoryViewerListImService.class) {
                if (C04TD.C5 == null) {
                    C04TD.C5 = new StoryViewerListImServiceImpl();
                }
            }
        }
        return C04TD.C5;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    @Override // com.ss.android.ugc.aweme.story.api.IStoryViewerListImService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(java.util.List<com.ss.android.ugc.aweme.story.model.StoryInteractionUser> r29, X.InterfaceC1364105Vn<? super java.util.List<com.ss.android.ugc.aweme.story.model.StoryInteractionUser>> r30) {
        /*
            Method dump skipped, instruction units count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.service.StoryViewerListImServiceImpl.LIZ(java.util.List, X.05Vn):java.lang.Object");
    }
}
