package webcast.data.multi_guest_play;

import X.C09CT;
import X.C786410Ut5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class PlaybookEditorInfo {

    @C09CT("editor_type")
    public String editorType = "";

    @C09CT("live_studio_editor_type")
    public String liveStudioEditorType = "";

    @C09CT("version")
    public long version;

    public final int hashCode() {
        return (((C786410Ut5.Y2(this.version) * 31) + this.editorType.hashCode()) * 31) + this.liveStudioEditorType.hashCode();
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
        if (!Intrinsics.LJFF(PlaybookEditorInfo.class, cls)) {
            return false;
        }
        PlaybookEditorInfo playbookEditorInfo = (PlaybookEditorInfo) obj;
        if (this.version == playbookEditorInfo.version && Intrinsics.LJFF(this.editorType, playbookEditorInfo.editorType) && Intrinsics.LJFF(this.liveStudioEditorType, playbookEditorInfo.liveStudioEditorType)) {
            return true;
        }
        return false;
    }
}
