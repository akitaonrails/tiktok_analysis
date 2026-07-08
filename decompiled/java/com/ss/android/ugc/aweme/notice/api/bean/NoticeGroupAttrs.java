package com.ss.android.ugc.aweme.notice.api.bean;

import X.C09CT;
import X.C0ZAJ;
import X.C0ZBF;
import X.C0ZBI;
import X.EnumC624380OeK;

/* JADX INFO: loaded from: classes29.dex */
public final class NoticeGroupAttrs {

    @C09CT("point_show_time")
    public final Long aliveDuration;

    @C09CT("archive_type")
    public C0ZBI archiveType;

    @C09CT("clear_occasion")
    public EnumC624380OeK clearOccasion;

    @C09CT("is_from_notice")
    public final boolean isFromNotice;

    @C09CT("mute_type")
    public C0ZBF muteType;

    @C09CT("show_type")
    public C0ZAJ showType;

    public NoticeGroupAttrs() {
        this(EnumC624380OeK.Normal, C0ZAJ.ShowDefault, C0ZBF.UN_MUTE, null, true, C0ZBI.UN_ARCHIVE);
    }

    public static NoticeGroupAttrs LIZ(NoticeGroupAttrs noticeGroupAttrs) {
        EnumC624380OeK enumC624380OeK = noticeGroupAttrs.clearOccasion;
        C0ZAJ c0zaj = noticeGroupAttrs.showType;
        C0ZBF c0zbf = noticeGroupAttrs.muteType;
        Long l = noticeGroupAttrs.aliveDuration;
        boolean z = noticeGroupAttrs.isFromNotice;
        C0ZBI c0zbi = noticeGroupAttrs.archiveType;
        noticeGroupAttrs.getClass();
        return new NoticeGroupAttrs(enumC624380OeK, c0zaj, c0zbf, l, z, c0zbi);
    }

    public NoticeGroupAttrs(EnumC624380OeK enumC624380OeK, C0ZAJ c0zaj, C0ZBF c0zbf, Long l, boolean z, C0ZBI c0zbi) {
        this.clearOccasion = enumC624380OeK;
        this.showType = c0zaj;
        this.muteType = c0zbf;
        this.aliveDuration = l;
        this.isFromNotice = z;
        this.archiveType = c0zbi;
    }
}
