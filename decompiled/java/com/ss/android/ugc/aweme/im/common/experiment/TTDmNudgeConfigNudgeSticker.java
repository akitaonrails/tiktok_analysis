package com.ss.android.ugc.aweme.im.common.experiment;

import X.C09CT;
import X.C2097608Jq;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes35.dex */
public final class TTDmNudgeConfigNudgeSticker {

    @C09CT("animate_type")
    public final String animate_type;

    @C09CT("animate_url")
    public final String animate_url;

    @C09CT("display_name")
    public final String display_name;

    @C09CT("display_name_lang")
    public final Map<String, String> display_name_lang;

    @C09CT("height")
    public final int height;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final long id;

    @C09CT("resource_id")
    public final long resource_id;

    @C09CT("static_type")
    public final String static_type;

    @C09CT("static_url")
    public final String static_url;

    @C09CT("width")
    public final int width;

    public TTDmNudgeConfigNudgeSticker() {
        this(null, null, null, null, 0, 0, 0L, 0L, null, null, 1023, null);
    }

    public TTDmNudgeConfigNudgeSticker(String str, String str2, String str3, Map<String, String> map, int i, int i2, long j, long j2, String str4, String str5) {
        this.animate_type = str;
        this.animate_url = str2;
        this.display_name = str3;
        this.display_name_lang = map;
        this.height = i;
        this.width = i2;
        this.id = j;
        this.resource_id = j2;
        this.static_type = str4;
        this.static_url = str5;
    }

    public TTDmNudgeConfigNudgeSticker(String str, String str2, String str3, Map map, int i, int i2, long j, long j2, String str4, String str5, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "webp" : str, (i3 & 2) != 0 ? "https://p16-tiktokcdn-com.akamaized.net/obj/im-resource-tiktok/6867821798952443013.webp" : str2, (i3 & 4) != 0 ? "nudge" : str3, (i3 & 8) != 0 ? C2097608Jq.LJIIIIZZ(new Pair("en", "nudge"), new Pair("local", "nudge")) : map, (i3 & 16) != 0 ? 336 : i, (i3 & 32) != 0 ? 204 : i2, (i3 & 64) != 0 ? 6867821798952443013L : j, (i3 & 128) != 0 ? 0L : j2, (i3 & 256) != 0 ? "png" : str4, (i3 & 512) != 0 ? "https://p16-tiktokcdn-com.akamaized.net/obj/im-resource-tiktok/6867821798952443013.png" : str5);
    }
}
