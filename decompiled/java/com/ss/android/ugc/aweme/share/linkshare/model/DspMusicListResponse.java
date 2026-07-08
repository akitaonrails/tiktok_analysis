package com.ss.android.ugc.aweme.share.linkshare.model;

import X.C09CT;
import X.EnumC626270OhN;
import com.ss.android.ugc.aweme.music.model.Music;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes10.dex */
public final class DspMusicListResponse {
    public EnumC626270OhN LIZ;

    @C09CT("status_code")
    public final int code;

    @C09CT("content_type")
    public Integer contentTypeInt;

    @C09CT("msg")
    public final String message;

    @C09CT("music_info")
    public Music music;

    @C09CT("title")
    public String title;

    /* JADX WARN: Multi-variable type inference failed */
    public DspMusicListResponse() {
        this(0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    public DspMusicListResponse(int i, String str, Music music, Integer num, String str2, EnumC626270OhN enumC626270OhN) {
        this.code = i;
        this.message = str;
        this.music = music;
        this.contentTypeInt = num;
        this.title = str2;
        this.LIZ = enumC626270OhN;
    }

    public /* synthetic */ DspMusicListResponse(int i, String str, Music music, Integer num, String str2, EnumC626270OhN enumC626270OhN, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : music, (i2 & 8) != 0 ? null : num, (i2 & 16) == 0 ? str2 : null, (i2 & 32) != 0 ? EnumC626270OhN.UNKNOWN : enumC626270OhN);
    }
}
