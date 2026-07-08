package com.ss.android.ugc.aweme.inbox.filter;

import X.C08FF;
import X.C09CT;
import X.C13LQ;
import X.C2254308sP;
import X.C879720YfC;
import X.EnumC877300YbI;
import X.InterfaceC2044707zh;
import java.util.Set;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes15.dex */
public final class FilterTabType {

    @C09CT("ads")
    public static final FilterTabType AD;

    @C09CT("all")
    public static final FilterTabType ALL_FOR_BUSINESS;

    @C09CT("archive")
    public static final FilterTabType ARCHIVE;

    @C09CT("business")
    public static final FilterTabType BUSINESS;

    @C09CT("buyers")
    public static final FilterTabType BUYER;

    @C09CT("creator")
    public static final FilterTabType CREATOR;
    public static final C879720YfC Companion;

    @C09CT("following")
    public static final FilterTabType FOLLOWING;

    @C09CT("highLevelMember")
    public static final FilterTabType HIGH_LEVEL_MEMBER;

    @C09CT("leads")
    public static final FilterTabType LEAD;
    public static final /* synthetic */ FilterTabType[] LLILZ;
    public static final /* synthetic */ C2254308sP LLILZIL;

    @C09CT("longTimeFollower")
    public static final FilterTabType LONG_TIME_FOLLOWER;
    public static final Set<FilterTabType> NOT_DISPLAY_TAB_TYPE_SET;

    @C09CT("null")
    public static final FilterTabType NULL;

    @C09CT("oneWayFollower")
    public static final FilterTabType ONE_WAY_FOLLOWER;

    @C09CT("overall")
    public static final FilterTabType OVERALL;

    @C09CT("main")
    public static final FilterTabType PRIMARY;

    @C09CT("request")
    public static final FilterTabType REQUEST;

    @C09CT("other")
    public static final FilterTabType SECONDARY;

    @C09CT("service_plus")
    public static final FilterTabType SERVICE_PLUS;

    @C09CT("spam")
    public static final FilterTabType SPAM;

    @C09CT("starred")
    public static final FilterTabType STARRED;

    @C09CT("subscriber")
    public static final FilterTabType SUBSCRIBER;

    @C09CT("unanswered")
    public static final FilterTabType UNANSWERED;

    @C09CT("unread")
    public static final FilterTabType UNREAD;

    @C09CT("shareMuf")
    public static final FilterTabType WITH_MUTUAL_FRIEND;
    public final int LL;
    public final String LLILLJJLI;
    public final String LLILLL;

    public static InterfaceC2044707zh<FilterTabType> getEntries() {
        return LLILZIL;
    }

    static {
        FilterTabType filterTabType = new FilterTabType("NULL", 0, EnumC877300YbI.NULL.getValue(), "", "null");
        NULL = filterTabType;
        FilterTabType filterTabType2 = new FilterTabType("OVERALL", 1, EnumC877300YbI.ALL.getValue(), "", "overall");
        OVERALL = filterTabType2;
        FilterTabType filterTabType3 = new FilterTabType("PRIMARY", 2, EnumC877300YbI.PRIMARY.getValue(), "primary", "main");
        PRIMARY = filterTabType3;
        FilterTabType filterTabType4 = new FilterTabType("SECONDARY", 3, EnumC877300YbI.SECONDARY.getValue(), "secondary", "other");
        SECONDARY = filterTabType4;
        FilterTabType filterTabType5 = new FilterTabType("REQUEST", 4, 3, "request", "request");
        REQUEST = filterTabType5;
        FilterTabType filterTabType6 = new FilterTabType("FOLLOWING", 5, 4, "filter_following", "following");
        FOLLOWING = filterTabType6;
        FilterTabType filterTabType7 = new FilterTabType("CREATOR", 6, 5, "filter_creator", "creator");
        CREATOR = filterTabType7;
        FilterTabType filterTabType8 = new FilterTabType("BUSINESS", 7, 6, "filter_business", "business");
        BUSINESS = filterTabType8;
        FilterTabType filterTabType9 = new FilterTabType("LONG_TIME_FOLLOWER", 8, 7, "filter_long_time_follower", "longTimeFollower");
        LONG_TIME_FOLLOWER = filterTabType9;
        FilterTabType filterTabType10 = new FilterTabType("UNREAD", 9, 8, "filter_unread", "unread");
        UNREAD = filterTabType10;
        FilterTabType filterTabType11 = new FilterTabType("UNANSWERED", 10, 9, "filter_unanswered", "unanswered");
        UNANSWERED = filterTabType11;
        FilterTabType filterTabType12 = new FilterTabType("STARRED", 11, 10, "filter_starred", "starred");
        STARRED = filterTabType12;
        FilterTabType filterTabType13 = new FilterTabType("SPAM", 12, 11, "filter_spam", "spam");
        SPAM = filterTabType13;
        FilterTabType filterTabType14 = new FilterTabType("ALL_FOR_BUSINESS", 13, 12, "filter_all", "all");
        ALL_FOR_BUSINESS = filterTabType14;
        FilterTabType filterTabType15 = new FilterTabType("LEAD", 14, 13, "filter_leads", "leads");
        LEAD = filterTabType15;
        FilterTabType filterTabType16 = new FilterTabType("AD", 15, 14, "filter_ads", "ads");
        AD = filterTabType16;
        FilterTabType filterTabType17 = new FilterTabType("SUBSCRIBER", 16, 15, "filter_subscriber", "subscriber");
        SUBSCRIBER = filterTabType17;
        FilterTabType filterTabType18 = new FilterTabType("WITH_MUTUAL_FRIEND", 17, 16, "filter_with_mutual_friend", "shareMuf");
        WITH_MUTUAL_FRIEND = filterTabType18;
        FilterTabType filterTabType19 = new FilterTabType("ONE_WAY_FOLLOWER", 18, 17, "filter_one_way_follower", "oneWayFollower");
        ONE_WAY_FOLLOWER = filterTabType19;
        FilterTabType filterTabType20 = new FilterTabType("HIGH_LEVEL_MEMBER", 19, 18, "filter_high_level_member", "highLevelMember");
        HIGH_LEVEL_MEMBER = filterTabType20;
        FilterTabType filterTabType21 = new FilterTabType("ARCHIVE", 20, 19, "", "archive");
        ARCHIVE = filterTabType21;
        FilterTabType filterTabType22 = new FilterTabType("SERVICE_PLUS", 21, 20, "filter_service+", "service_plus");
        SERVICE_PLUS = filterTabType22;
        FilterTabType filterTabType23 = new FilterTabType("BUYER", 22, 21, "filter_buyers", "buyers");
        BUYER = filterTabType23;
        FilterTabType[] filterTabTypeArr = {filterTabType, filterTabType2, filterTabType3, filterTabType4, filterTabType5, filterTabType6, filterTabType7, filterTabType8, filterTabType9, filterTabType10, filterTabType11, filterTabType12, filterTabType13, filterTabType14, filterTabType15, filterTabType16, filterTabType17, filterTabType18, filterTabType19, filterTabType20, filterTabType21, filterTabType22, filterTabType23};
        LLILZ = filterTabTypeArr;
        LLILZIL = new C2254308sP(filterTabTypeArr);
        Companion = new C879720YfC();
        NOT_DISPLAY_TAB_TYPE_SET = C13LQ.LJLIIL(new FilterTabType[]{filterTabType2, filterTabType, filterTabType21});
    }

    public static FilterTabType[] values() {
        return (FilterTabType[]) LLILZ.clone();
    }

    public final String getMobValue() {
        return this.LLILLJJLI;
    }

    public final String getSerializedName() {
        return this.LLILLL;
    }

    public final int getValue() {
        return this.LL;
    }

    public static FilterTabType valueOf(String str) {
        return (FilterTabType) C08FF.LIZ(FilterTabType.class, str);
    }

    public FilterTabType(String str, int i, int i2, String str2, String str3) {
        this.LL = i2;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
    }
}
