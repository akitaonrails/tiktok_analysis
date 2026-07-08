package com.ss.android.ugc.profile.business.avatar;

import X.C09CT;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes20.dex */
public final class AvatarTrackerBaseParams implements Serializable {
    public static final int $stable = 8;

    @C09CT("avatar_upload_track_param")
    public final HashMap<String, String> params;

    public AvatarTrackerBaseParams(HashMap<String, String> map) {
        this.params = map;
    }
}
