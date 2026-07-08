package com.ss.android.ugc.aweme.modeo.ttep.moderation;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class PreviewMaterialsModel {

    @C09CT("FullBody")
    public final List<String> body;

    @C09CT("Face")
    public final PMFaceVideo face;

    @C09CT("Hand")
    public final List<String> hand;

    public PreviewMaterialsModel(PMFaceVideo pMFaceVideo, List<String> list, List<String> list2) {
        this.face = pMFaceVideo;
        this.body = list;
        this.hand = list2;
    }
}
