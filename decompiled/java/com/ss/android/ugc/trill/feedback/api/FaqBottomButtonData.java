package com.ss.android.ugc.trill.feedback.api;

import X.C09CT;
import X.C0TU6;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class FaqBottomButtonData implements Serializable {
    public static final int $stable = 0;
    public static final C0TU6 Companion = new Object() { // from class: X.0TU6
    };
    public static final int TYPE_BOT = 1;
    public static final int TYPE_IM = 2;
    public static final int TYPE_SUBMIT = 3;

    @C09CT("btnTextStarlingKey")
    public final String btnTextStarlingKey;

    @C09CT("entranceType")
    public final Integer entranceType;

    @C09CT("icon")
    public final String icon;

    @C09CT("jumpUrl")
    public final String jumpUrl;

    @C09CT("position")
    public final String position;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FaqBottomButtonData)) {
            return false;
        }
        FaqBottomButtonData faqBottomButtonData = (FaqBottomButtonData) obj;
        return Intrinsics.LJFF(this.jumpUrl, faqBottomButtonData.jumpUrl) && Intrinsics.LJFF(this.btnTextStarlingKey, faqBottomButtonData.btnTextStarlingKey) && Intrinsics.LJFF(this.position, faqBottomButtonData.position) && Intrinsics.LJFF(this.icon, faqBottomButtonData.icon) && Intrinsics.LJFF(this.entranceType, faqBottomButtonData.entranceType);
    }

    public FaqBottomButtonData() {
        this("", "", "sticky", "", 1);
    }

    public FaqBottomButtonData(String str, String str2, String str3, String str4, Integer num) {
        this.jumpUrl = str;
        this.btnTextStarlingKey = str2;
        this.position = str3;
        this.icon = str4;
        this.entranceType = num;
    }
}
