package com.ss.android.ugc.aweme.im.common.model;

import X.C08FF;
import X.C09CT;
import X.C1954807lC;
import X.C2254308sP;
import X.C455890HuF;
import X.C455900HuG;
import X.InterfaceC2044707zh;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;
import java.io.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class StickerSubType implements Serializable {

    @C09CT("2")
    public static final StickerSubType CUSTOMIZED;
    public static final C455900HuG Companion;

    @C09CT("1")
    public static final StickerSubType DEFAULT;
    public static final /* synthetic */ StickerSubType[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    @C09CT(CardStruct.IStatusCode.DEFAULT)
    public static final StickerSubType REGULAR;

    public static InterfaceC2044707zh<StickerSubType> getEntries() {
        return LLILLJJLI;
    }

    static {
        StickerSubType stickerSubType = new StickerSubType("REGULAR", 0);
        REGULAR = stickerSubType;
        StickerSubType stickerSubType2 = new StickerSubType(LivePreviewCTASmartDisplayManager.DEFAULT, 1);
        DEFAULT = stickerSubType2;
        StickerSubType stickerSubType3 = new StickerSubType("CUSTOMIZED", 2);
        CUSTOMIZED = stickerSubType3;
        StickerSubType[] stickerSubTypeArr = {stickerSubType, stickerSubType2, stickerSubType3};
        LL = stickerSubTypeArr;
        LLILLJJLI = new C2254308sP(stickerSubTypeArr);
        Companion = new C455900HuG();
    }

    public static StickerSubType[] values() {
        return (StickerSubType[]) LL.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = C455890HuF.LIZ[ordinal()];
        if (i == 1) {
            return CardStruct.IStatusCode.DEFAULT;
        }
        if (i == 2) {
            return "1";
        }
        if (i == 3) {
            return "2";
        }
        throw new C1954807lC();
    }

    public static StickerSubType valueOf(String str) {
        return (StickerSubType) C08FF.LIZ(StickerSubType.class, str);
    }

    public StickerSubType(String str, int i) {
    }
}
