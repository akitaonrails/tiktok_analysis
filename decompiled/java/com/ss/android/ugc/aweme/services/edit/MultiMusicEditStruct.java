package com.ss.android.ugc.aweme.services.edit;

import X.C09CT;
import X.C13BV;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
public final class MultiMusicEditStruct {

    @C09CT("multi_music_fusion_type")
    public final Integer multiMusicFusionType;

    @C09CT("music_list")
    public final List<MusicInfoStruct> musicList;

    public MultiMusicEditStruct() {
        this(null, null, 3, null);
    }

    public MultiMusicEditStruct(List<MusicInfoStruct> list, Integer num) {
        this.musicList = list;
        this.multiMusicFusionType = num;
    }

    public MultiMusicEditStruct(List list, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C13BV.INSTANCE : list, (i & 2) != 0 ? null : num);
    }
}
