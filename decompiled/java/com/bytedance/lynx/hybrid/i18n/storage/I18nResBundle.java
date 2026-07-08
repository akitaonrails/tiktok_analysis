package com.bytedance.lynx.hybrid.i18n.storage;

import X.C08CX;
import X.C09CT;
import X.C2097608Jq;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes24.dex */
public final class I18nResBundle {

    @C09CT("content")
    public final Map<String, String> content;

    @C09CT("convert_map")
    public final Map<String, String> convertMap;

    @C09CT("gecko_channel")
    public final String geckoChannel;

    @C09CT("hash")
    public final String hash;

    @C09CT("language_tags")
    public final Set<String> languageTags;

    @C09CT("last_access")
    public final long lastAccess;

    @C09CT("last_update")
    public final long lastUpdate;

    @C09CT("public_path")
    public final String publicPath;

    public I18nResBundle() {
        this(null, null, null, null, null, 0L, null, 0L, 255, null);
    }

    public static I18nResBundle LIZ(I18nResBundle i18nResBundle, String str, String str2, Set set, Map map, long j, int i) {
        Map<String, String> map2;
        long j2;
        String str3 = str;
        long j3 = j;
        Set set2 = set;
        Map map3 = map;
        String str4 = str2;
        if ((i & 1) != 0) {
            str3 = i18nResBundle.publicPath;
        }
        if ((i & 2) != 0) {
            str4 = i18nResBundle.hash;
        }
        if ((i & 4) != 0) {
            set2 = i18nResBundle.languageTags;
        }
        String str5 = null;
        if ((i & 8) != 0) {
            map2 = i18nResBundle.convertMap;
        } else {
            map2 = null;
        }
        if ((i & 16) != 0) {
            map3 = i18nResBundle.content;
        }
        if ((i & 32) != 0) {
            j2 = i18nResBundle.lastAccess;
        } else {
            j2 = 0;
        }
        if ((i & 64) != 0) {
            str5 = i18nResBundle.geckoChannel;
        }
        if ((i & 128) != 0) {
            j3 = i18nResBundle.lastUpdate;
        }
        return new I18nResBundle(str3, str4, set2, map2, map3, j2, str5, j3);
    }

    public I18nResBundle(String str, String str2, Set<String> set, Map<String, String> map, Map<String, String> map2, long j, String str3, long j2) {
        this.publicPath = str;
        this.hash = str2;
        this.languageTags = set;
        this.convertMap = map;
        this.content = map2;
        this.lastAccess = j;
        this.geckoChannel = str3;
        this.lastUpdate = j2;
    }

    public I18nResBundle(String str, String str2, Set set, Map map, Map map2, long j, String str3, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? C08CX.INSTANCE : set, (i & 8) != 0 ? C2097608Jq.LJ() : map, (i & 16) != 0 ? C2097608Jq.LJ() : map2, (i & 32) != 0 ? 0L : j, (i & 64) == 0 ? str3 : "", (i & 128) == 0 ? j2 : 0L);
    }
}
