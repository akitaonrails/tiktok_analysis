package com.bytedance.effectcreatormobile.ckeapi.api.facestretch;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class LocalFaceStretchData {
    public static final /* synthetic */ int LIZ = 0;

    @C09CT("local_face_stretch")
    public final List<FaceStretchData> localFaceStretch;

    public LocalFaceStretchData() {
        this(new ArrayList());
    }

    public LocalFaceStretchData(List<FaceStretchData> list) {
        this.localFaceStretch = list;
    }
}
