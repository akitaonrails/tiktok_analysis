package com.ss.android.ugc.aweme.creative.model;

import X.C040H;
import X.C09CT;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import java.util.List;

/* JADX INFO: loaded from: classes30.dex */
public final class TTSocialSegment {

    @C040H
    public VideoCutInfo LIZ;

    @C09CT("segment_path")
    public String path;

    @C09CT("social_friends_effect")
    public List<TTSocialFriendsEffect> socialFriendEffects;

    public TTSocialSegment() {
        this(null, null, null);
    }

    public TTSocialSegment(String str, VideoCutInfo videoCutInfo, List<TTSocialFriendsEffect> list) {
        this.path = str;
        this.LIZ = videoCutInfo;
        this.socialFriendEffects = list;
    }
}
