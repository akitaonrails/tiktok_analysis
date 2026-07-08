package com.ss.android.ugc.aweme.model;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class DramaContentType {

    @C09CT(CardStruct.IStatusCode.DEFAULT)
    public static final DramaContentType DRAMA_CONTENT_TYPE_FEED_CARD;

    @C09CT("1")
    public static final DramaContentType DRAMA_CONTENT_TYPE_VIDEO;
    public static final /* synthetic */ DramaContentType[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<DramaContentType> getEntries() {
        return LLILLL;
    }

    static {
        DramaContentType dramaContentType = new DramaContentType("DRAMA_CONTENT_TYPE_FEED_CARD", 0, 0);
        DRAMA_CONTENT_TYPE_FEED_CARD = dramaContentType;
        DramaContentType dramaContentType2 = new DramaContentType("DRAMA_CONTENT_TYPE_VIDEO", 1, 1);
        DRAMA_CONTENT_TYPE_VIDEO = dramaContentType2;
        DramaContentType[] dramaContentTypeArr = {dramaContentType, dramaContentType2};
        LLILLJJLI = dramaContentTypeArr;
        LLILLL = new C2254308sP(dramaContentTypeArr);
    }

    public static DramaContentType[] values() {
        return (DramaContentType[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static DramaContentType valueOf(String str) {
        return (DramaContentType) C08FF.LIZ(DramaContentType.class, str);
    }

    public DramaContentType(String str, int i, int i2) {
        this.LL = i2;
    }
}
