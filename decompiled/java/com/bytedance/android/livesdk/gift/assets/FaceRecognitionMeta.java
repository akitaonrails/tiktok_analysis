package com.bytedance.android.livesdk.gift.assets;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class FaceRecognitionMeta {

    @C09CT("model_names")
    public String modelNames;

    @C09CT("requirement")
    public List<String> requirements;

    @C09CT("sdk_extra")
    public String sdkExtra;

    @C09CT("version")
    public String version;

    public FaceRecognitionMeta() {
        this(null, null, null, null);
    }

    public FaceRecognitionMeta(String str, List<String> list, String str2, String str3) {
        this.modelNames = str;
        this.requirements = list;
        this.sdkExtra = str2;
        this.version = str3;
    }
}
