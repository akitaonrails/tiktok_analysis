package com.ss.android.ugc.aweme.nimblecard.tako.model;

import X.C09CT;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes31.dex */
public final class CardData {

    @C09CT("cardVersion")
    public final String cardVersion;

    @C09CT("dslJson")
    public final TemplateData dslJson;

    @C09CT("fileName")
    public String fileName;

    @C09CT(FollowStatusChangeMethod.PARAM_UID)
    public final String id;

    @C09CT("source")
    public String source;

    @C09CT("starlingData")
    public final Map<String, Map<String, String>> starlingData;

    public CardData() {
        this(null, null, null, null, "", "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardData)) {
            return false;
        }
        CardData cardData = (CardData) obj;
        return Intrinsics.LJFF(this.id, cardData.id) && Intrinsics.LJFF(this.cardVersion, cardData.cardVersion) && Intrinsics.LJFF(this.dslJson, cardData.dslJson) && Intrinsics.LJFF(this.starlingData, cardData.starlingData) && Intrinsics.LJFF(this.source, cardData.source) && Intrinsics.LJFF(this.fileName, cardData.fileName);
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.cardVersion;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        TemplateData templateData = this.dslJson;
        int iHashCode3 = (iHashCode2 + (templateData == null ? 0 : templateData.hashCode())) * 31;
        Map<String, Map<String, String>> map = this.starlingData;
        return ((((iHashCode3 + (map != null ? map.hashCode() : 0)) * 31) + this.source.hashCode()) * 31) + this.fileName.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CardData(String str, String str2, TemplateData templateData, Map<String, ? extends Map<String, String>> map, String str3, String str4) {
        this.id = str;
        this.cardVersion = str2;
        this.dslJson = templateData;
        this.starlingData = map;
        this.source = str3;
        this.fileName = str4;
    }
}
