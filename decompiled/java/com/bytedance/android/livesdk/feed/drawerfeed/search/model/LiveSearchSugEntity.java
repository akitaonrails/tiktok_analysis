package com.bytedance.android.livesdk.feed.drawerfeed.search.model;

import X.C09CT;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class LiveSearchSugEntity {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;

    @C09CT("content")
    public String content;

    @C09CT("extra_info")
    public LiveSearchSugExtra extra;

    @C09CT("highlight_pos")
    public List<LiveSearchPosition> highLightPositions;

    @C09CT("word_record")
    public LiveSearchWord mWord;

    @C09CT("sug_type")
    public String sugType;

    public LiveSearchSugEntity() {
        this("", null, null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveSearchSugEntity)) {
            return false;
        }
        LiveSearchSugEntity liveSearchSugEntity = (LiveSearchSugEntity) obj;
        return Intrinsics.LJFF(this.sugType, liveSearchSugEntity.sugType) && Intrinsics.LJFF(this.content, liveSearchSugEntity.content) && Intrinsics.LJFF(this.highLightPositions, liveSearchSugEntity.highLightPositions) && Intrinsics.LJFF(this.mWord, liveSearchSugEntity.mWord) && Intrinsics.LJFF(this.extra, liveSearchSugEntity.extra) && Intrinsics.LJFF(this.LIZ, liveSearchSugEntity.LIZ) && Intrinsics.LJFF(this.LIZIZ, liveSearchSugEntity.LIZIZ) && Intrinsics.LJFF(this.LIZJ, liveSearchSugEntity.LIZJ) && Intrinsics.LJFF(this.LIZLLL, liveSearchSugEntity.LIZLLL);
    }

    public LiveSearchSugEntity(String str, String str2, List<LiveSearchPosition> list, LiveSearchWord liveSearchWord, LiveSearchSugExtra liveSearchSugExtra, String str3, String str4, String str5, String str6) {
        this.sugType = str;
        this.content = str2;
        this.highLightPositions = list;
        this.mWord = liveSearchWord;
        this.extra = liveSearchSugExtra;
        this.LIZ = str3;
        this.LIZIZ = str4;
        this.LIZJ = str5;
        this.LIZLLL = str6;
    }
}
