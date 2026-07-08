package webcast.data.multi_guest_play;

import X.C09CT;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class PlaybookTagInfo {

    @C09CT("tag_translated_name")
    public String tagTranslatedName = "";

    @C09CT("tag_type")
    public int tagType;

    public final int hashCode() {
        return (this.tagType * 31) + this.tagTranslatedName.hashCode();
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.LJFF(PlaybookTagInfo.class, cls)) {
            return false;
        }
        PlaybookTagInfo playbookTagInfo = (PlaybookTagInfo) obj;
        if (this.tagType == playbookTagInfo.tagType && Intrinsics.LJFF(this.tagTranslatedName, playbookTagInfo.tagTranslatedName)) {
            return true;
        }
        return false;
    }
}
