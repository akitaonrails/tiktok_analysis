package com.ss.android.ugc.aweme.feed.model.story.highlights;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class StoryHighlightCollection implements Serializable {
    public static final Companion Companion = new Companion();

    @C09CT("aweme_ids")
    public final List<String> awemeIds;

    @C09CT("collection_cover_url")
    public final UrlModel collectionCoverUrl;

    @C09CT("collection_id")
    public final String collectionId;

    @C09CT("count")
    public final Integer count;

    @C09CT("cover_aweme_id")
    public final String coverAwemeId;

    @C09CT("cover_type")
    public final Integer coverType;

    @C09CT("title")
    public final String title;

    public static final class Companion {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes26.dex */
    public static final class CoverType {
        public static final /* synthetic */ InterfaceC2044707zh $ENTRIES;
        public static final /* synthetic */ CoverType[] $VALUES;
        public static final Companion Companion;
        public final int value;
        public static final CoverType UNKNOWN = new CoverType("UNKNOWN", 0, 0);
        public static final CoverType STORY_COVER = new CoverType("STORY_COVER", 1, 1);
        public static final CoverType EDITED_STORY_COVER = new CoverType("EDITED_STORY_COVER", 2, 2);
        public static final CoverType ALBUM_PHOTO = new CoverType("ALBUM_PHOTO", 3, 3);

        public static final /* synthetic */ CoverType[] $values() {
            return new CoverType[]{UNKNOWN, STORY_COVER, EDITED_STORY_COVER, ALBUM_PHOTO};
        }

        public static InterfaceC2044707zh<CoverType> getEntries() {
            return $ENTRIES;
        }

        static {
            CoverType[] coverTypeArr$values = $values();
            $VALUES = coverTypeArr$values;
            $ENTRIES = new C2254308sP(coverTypeArr$values);
            Companion = new Companion();
        }

        public static CoverType[] values() {
            return (CoverType[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }

        public static final class Companion {
            public final CoverType of(int i) {
                for (CoverType coverType : CoverType.values()) {
                    if (coverType.getValue() == i) {
                        return coverType;
                    }
                }
                return CoverType.UNKNOWN;
            }
        }

        public static CoverType valueOf(String str) {
            return (CoverType) C08FF.LIZ(CoverType.class, str);
        }

        public CoverType(String str, int i, int i2) {
            this.value = i2;
        }
    }

    public StoryHighlightCollection() {
        this("", null, null, null, null, null, null);
    }

    public final StoryHighlightCollection copy(String str, String str2, UrlModel urlModel, String str3, Integer num, List<String> list, Integer num2) {
        return new StoryHighlightCollection(str, str2, urlModel, str3, num, list, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryHighlightCollection)) {
            return false;
        }
        StoryHighlightCollection storyHighlightCollection = (StoryHighlightCollection) obj;
        return Intrinsics.LJFF(this.collectionId, storyHighlightCollection.collectionId) && Intrinsics.LJFF(this.title, storyHighlightCollection.title) && Intrinsics.LJFF(this.collectionCoverUrl, storyHighlightCollection.collectionCoverUrl) && Intrinsics.LJFF(this.coverAwemeId, storyHighlightCollection.coverAwemeId) && Intrinsics.LJFF(this.coverType, storyHighlightCollection.coverType) && Intrinsics.LJFF(this.awemeIds, storyHighlightCollection.awemeIds) && Intrinsics.LJFF(this.count, storyHighlightCollection.count);
    }

    public int hashCode() {
        int iHashCode = this.collectionId.hashCode() * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        UrlModel urlModel = this.collectionCoverUrl;
        int iHashCode3 = (iHashCode2 + (urlModel == null ? 0 : urlModel.hashCode())) * 31;
        String str2 = this.coverAwemeId;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.coverType;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        List<String> list = this.awemeIds;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.count;
        return iHashCode6 + (num2 != null ? num2.hashCode() : 0);
    }

    public final StoryHighlightCollection smartCopy(StoryHighlightCollection storyHighlightCollection) {
        if (!Intrinsics.LJFF(storyHighlightCollection.collectionId, this.collectionId)) {
            return this;
        }
        Integer num = storyHighlightCollection.count;
        if (num != null && num.intValue() == 0) {
            return null;
        }
        String str = storyHighlightCollection.title;
        if (str == null) {
            str = this.title;
        }
        UrlModel urlModel = storyHighlightCollection.collectionCoverUrl;
        if (urlModel == null) {
            urlModel = this.collectionCoverUrl;
        }
        String str2 = storyHighlightCollection.coverAwemeId;
        if (str2 == null) {
            str2 = this.coverAwemeId;
        }
        Integer num2 = storyHighlightCollection.coverType;
        if (num2 == null) {
            num2 = this.coverType;
        }
        List<String> list = storyHighlightCollection.awemeIds;
        if (list == null) {
            list = this.awemeIds;
        }
        Integer num3 = storyHighlightCollection.count;
        if (num3 == null) {
            num3 = this.count;
        }
        return copy(this.collectionId, str, urlModel, str2, num2, list, num3);
    }

    public StoryHighlightCollection(String str, String str2, UrlModel urlModel, String str3, Integer num, List<String> list, Integer num2) {
        this.collectionId = str;
        this.title = str2;
        this.collectionCoverUrl = urlModel;
        this.coverAwemeId = str3;
        this.coverType = num;
        this.awemeIds = list;
        this.count = num2;
    }
}
