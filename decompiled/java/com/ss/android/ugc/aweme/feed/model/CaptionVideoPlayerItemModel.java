package com.ss.android.ugc.aweme.feed.model;

import X.C09CT;
import X.C13BV;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class CaptionVideoPlayerItemModel implements Serializable {

    @C09CT("expire")
    public final long expire;

    @C09CT("format")
    public final String format;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final Integer id;

    @C09CT("language_id")
    public final int languageId;

    @C09CT("language")
    public final String languageName;

    @C09CT("sub_id")
    public final int subId;

    @C09CT("url")
    public final String url;

    @C09CT("url_list")
    public final List<String> urlList;

    public CaptionVideoPlayerItemModel() {
        this(null, null, 0, null, 0L, null, 0, null, 255, null);
    }

    public CaptionVideoPlayerItemModel(Integer num, String str, int i, String str2, long j, String str3, int i2, List<String> list) {
        this.id = num;
        this.languageName = str;
        this.languageId = i;
        this.url = str2;
        this.expire = j;
        this.format = str3;
        this.subId = i2;
        this.urlList = list;
    }

    public CaptionVideoPlayerItemModel(Integer num, String str, int i, String str2, long j, String str3, int i2, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : num, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? -1 : i, (i3 & 8) != 0 ? "" : str2, (i3 & 16) != 0 ? 0L : j, (i3 & 32) == 0 ? str3 : "", (i3 & 64) == 0 ? i2 : -1, (i3 & 128) != 0 ? C13BV.INSTANCE : list);
    }
}
