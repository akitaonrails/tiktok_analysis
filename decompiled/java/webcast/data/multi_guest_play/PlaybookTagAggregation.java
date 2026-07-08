package webcast.data.multi_guest_play;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class PlaybookTagAggregation {

    @C09CT("playbook_first_level_tag_type")
    public int playbookFirstLevelTagType;

    @C09CT("first_level_tag_translated_name")
    public String firstLevelTagTranslatedName = "";

    @C09CT("tags")
    public List<PlaybookTagInfo> tags = new ArrayList();

    public final int hashCode() {
        return (((this.playbookFirstLevelTagType * 31) + this.firstLevelTagTranslatedName.hashCode()) * 31) + this.tags.hashCode();
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
        if (!Intrinsics.LJFF(PlaybookTagAggregation.class, cls)) {
            return false;
        }
        PlaybookTagAggregation playbookTagAggregation = (PlaybookTagAggregation) obj;
        if (this.playbookFirstLevelTagType == playbookTagAggregation.playbookFirstLevelTagType && Intrinsics.LJFF(this.firstLevelTagTranslatedName, playbookTagAggregation.firstLevelTagTranslatedName) && Intrinsics.LJFF(this.tags, playbookTagAggregation.tags)) {
            return true;
        }
        return false;
    }
}
