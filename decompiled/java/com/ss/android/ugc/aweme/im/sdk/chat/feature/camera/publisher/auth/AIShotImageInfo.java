package com.ss.android.ugc.aweme.im.sdk.chat.feature.camera.publisher.auth;

import X.C09CT;
import java.io.Serializable;

/* JADX INFO: loaded from: classes15.dex */
public final class AIShotImageInfo implements Serializable {
    public static final int $stable = 0;

    @C09CT("decrypt_key")
    public final String decryptKey;

    @C09CT("gender_probability")
    public final Float genderProbability;

    @C09CT("skin_tone")
    public final Integer skinTone;

    @C09CT("uri")
    public final String uri;

    public AIShotImageInfo(String str, String str2, Float f, Integer num) {
        this.uri = str;
        this.decryptKey = str2;
        this.genderProbability = f;
        this.skinTone = num;
    }
}
