package com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.repo;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class UserContent {

    @C09CT("cid")
    public final Long cid;

    @C09CT("key_moment")
    public final Long keyMoment;

    @C09CT("popularity")
    public final Long popularity;

    @C09CT("source_show_style")
    public final Integer showSourceStyle;

    @C09CT("source_type")
    public final SourceType sourceType;

    @C09CT("sub_video_list")
    public final List<Aweme> subVideoList;

    @C09CT("text")
    public final String text;

    @C09CT("user_cover_url")
    public final UrlModel userCoverUrl;

    @C09CT("user_name")
    public final String userName;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class SourceType {

        @C09CT("2")
        public static final SourceType COMMENT;

        @C09CT(CardStruct.IStatusCode.DEFAULT)
        public static final SourceType INVALID;
        public static final /* synthetic */ SourceType[] LL;
        public static final /* synthetic */ C2254308sP LLILLJJLI;

        @C09CT("3")
        public static final SourceType PHOTO_TEXT;

        @C09CT("1")
        public static final SourceType VIDEO;

        public static InterfaceC2044707zh<SourceType> getEntries() {
            return LLILLJJLI;
        }

        static {
            SourceType sourceType = new SourceType("INVALID", 0);
            INVALID = sourceType;
            SourceType sourceType2 = new SourceType("VIDEO", 1);
            VIDEO = sourceType2;
            SourceType sourceType3 = new SourceType("COMMENT", 2);
            COMMENT = sourceType3;
            SourceType sourceType4 = new SourceType("PHOTO_TEXT", 3);
            PHOTO_TEXT = sourceType4;
            SourceType[] sourceTypeArr = {sourceType, sourceType2, sourceType3, sourceType4};
            LL = sourceTypeArr;
            LLILLJJLI = new C2254308sP(sourceTypeArr);
        }

        public static SourceType[] values() {
            return (SourceType[]) LL.clone();
        }

        public static SourceType valueOf(String str) {
            return (SourceType) C08FF.LIZ(SourceType.class, str);
        }

        public SourceType(String str, int i) {
        }
    }

    public UserContent() {
        this(null, null, null, null, null, null, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserContent(String str, List<? extends Aweme> list, SourceType sourceType, Integer num, Long l, UrlModel urlModel, String str2, Long l2, Long l3) {
        this.text = str;
        this.subVideoList = list;
        this.sourceType = sourceType;
        this.showSourceStyle = num;
        this.keyMoment = l;
        this.userCoverUrl = urlModel;
        this.userName = str2;
        this.popularity = l2;
        this.cid = l3;
    }
}
