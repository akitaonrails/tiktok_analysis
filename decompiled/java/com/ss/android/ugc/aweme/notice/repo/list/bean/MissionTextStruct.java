package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class MissionTextStruct {

    @C09CT("color")
    public final String color;

    @C09CT("font")
    public final String font;

    @C09CT("text")
    public final String text;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MissionTextStruct)) {
            return false;
        }
        MissionTextStruct missionTextStruct = (MissionTextStruct) obj;
        return Intrinsics.LJFF(this.text, missionTextStruct.text) && Intrinsics.LJFF(this.color, missionTextStruct.color) && Intrinsics.LJFF(this.font, missionTextStruct.font);
    }

    public int hashCode() {
        return (((this.text.hashCode() * 31) + this.color.hashCode()) * 31) + this.font.hashCode();
    }

    public MissionTextStruct() {
        this("", "", "");
    }

    public MissionTextStruct(String str, String str2, String str3) {
        this.text = str;
        this.color = str2;
        this.font = str3;
    }
}
