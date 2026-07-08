package com.ss.android.ugc.aweme.search.pages.result.pov.model;

import X.C09CT;
import X.C682720QqE;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class SourceFromEntities implements Serializable {
    public static final C682720QqE Companion = new Object() { // from class: X.0QqE
    };

    @C09CT("default_thumbnail_url")
    public final String defaultThumbnailUrl;

    @C09CT("display_avatar_count")
    public final Integer displayAvatarCount;

    @C09CT("entity_list")
    public final List<SourceFromEntity> entityList;

    @C09CT("total_count")
    public final Integer totalCount;

    @C09CT("wording")
    public final String wording;

    @C09CT("wording_options")
    public final WordingOptions wordingOptions;

    public final SourceFromEntities copy(String str, Integer num, Integer num2, List<SourceFromEntity> list, String str2, WordingOptions wordingOptions) {
        return new SourceFromEntities(str, num, num2, list, str2, wordingOptions);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SourceFromEntities)) {
            return false;
        }
        SourceFromEntities sourceFromEntities = (SourceFromEntities) obj;
        return Intrinsics.LJFF(this.wording, sourceFromEntities.wording) && Intrinsics.LJFF(this.displayAvatarCount, sourceFromEntities.displayAvatarCount) && Intrinsics.LJFF(this.totalCount, sourceFromEntities.totalCount) && Intrinsics.LJFF(this.entityList, sourceFromEntities.entityList) && Intrinsics.LJFF(this.defaultThumbnailUrl, sourceFromEntities.defaultThumbnailUrl) && Intrinsics.LJFF(this.wordingOptions, sourceFromEntities.wordingOptions);
    }

    public int hashCode() {
        String str = this.wording;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.displayAvatarCount;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.totalCount;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        List<SourceFromEntity> list = this.entityList;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.defaultThumbnailUrl;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        WordingOptions wordingOptions = this.wordingOptions;
        return iHashCode5 + (wordingOptions != null ? wordingOptions.hashCode() : 0);
    }

    public final int getDisplayAvatarNum() {
        List<SourceFromEntity> list = this.entityList;
        if (list == null) {
            return 0;
        }
        int size = list.size();
        Integer num = this.displayAvatarCount;
        int iIntValue = num != null ? num.intValue() : 3;
        return size > iIntValue ? iIntValue : size;
    }

    public final boolean getHasWording() {
        WordingOptions wordingOptions = this.wordingOptions;
        if (wordingOptions != null && wordingOptions.facepileLabel != null && wordingOptions.v1Subheader1 != null && wordingOptions.v3Subheader1 != null) {
            return true;
        }
        String str = this.wording;
        return (str == null || str.length() == 0) ? false : true;
    }

    public final int getTotalAvatarNum() {
        List<SourceFromEntity> list;
        Integer numValueOf = this.totalCount;
        if (numValueOf == null && ((list = this.entityList) == null || (numValueOf = Integer.valueOf(list.size())) == null)) {
            return 0;
        }
        return numValueOf.intValue();
    }

    public SourceFromEntities(String str, Integer num, Integer num2, List<SourceFromEntity> list, String str2, WordingOptions wordingOptions) {
        this.wording = str;
        this.displayAvatarCount = num;
        this.totalCount = num2;
        this.entityList = list;
        this.defaultThumbnailUrl = str2;
        this.wordingOptions = wordingOptions;
    }
}
