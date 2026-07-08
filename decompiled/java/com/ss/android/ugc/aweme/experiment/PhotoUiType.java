package com.ss.android.ugc.aweme.experiment;

import X.C08FF;
import X.C09CT;
import X.C2254308sP;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class PhotoUiType {

    @C09CT("2")
    public static final PhotoUiType DOT_STYLE;
    public static final /* synthetic */ PhotoUiType[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    @C09CT(CardStruct.IStatusCode.DEFAULT)
    public static final PhotoUiType NO_SWIPE_OR_PINCH;

    @C09CT("1")
    public static final PhotoUiType STORY_LINES;

    public static InterfaceC2044707zh<PhotoUiType> getEntries() {
        return LLILLJJLI;
    }

    static {
        PhotoUiType photoUiType = new PhotoUiType("NO_SWIPE_OR_PINCH", 0);
        NO_SWIPE_OR_PINCH = photoUiType;
        PhotoUiType photoUiType2 = new PhotoUiType("STORY_LINES", 1);
        STORY_LINES = photoUiType2;
        PhotoUiType photoUiType3 = new PhotoUiType("DOT_STYLE", 2);
        DOT_STYLE = photoUiType3;
        PhotoUiType[] photoUiTypeArr = {photoUiType, photoUiType2, photoUiType3};
        LL = photoUiTypeArr;
        LLILLJJLI = new C2254308sP(photoUiTypeArr);
    }

    public static PhotoUiType[] values() {
        return (PhotoUiType[]) LL.clone();
    }

    public static PhotoUiType valueOf(String str) {
        return (PhotoUiType) C08FF.LIZ(PhotoUiType.class, str);
    }

    public PhotoUiType(String str, int i) {
    }
}
