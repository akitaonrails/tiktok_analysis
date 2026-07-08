package webcast.data.multi_guest_play;

import X.C09CT;
import X.C786410Ut5;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ConvertNoticeboardMaterialInfo {

    @C09CT("text_box_count")
    public long textBoxCount;

    @C09CT("text_char_count")
    public long textCharCount;

    @C09CT("background_image_url")
    public String backgroundImageUrl = "";

    @C09CT("cover_image_url")
    public String coverImageUrl = "";

    @C09CT("config_json_url")
    public String configJsonUrl = "";

    @C09CT("title")
    public String title = "";

    @C09CT("starling_map")
    public Map<String, String> starlingMap = new LinkedHashMap();

    @C09CT("thumb_cover_image_url")
    public String thumbCoverImageUrl = "";

    public final int hashCode() {
        return (((((((((((((this.backgroundImageUrl.hashCode() * 31) + this.coverImageUrl.hashCode()) * 31) + this.configJsonUrl.hashCode()) * 31) + this.title.hashCode()) * 31) + C786410Ut5.Y2(this.textCharCount)) * 31) + C786410Ut5.Y2(this.textBoxCount)) * 31) + this.starlingMap.hashCode()) * 31) + this.thumbCoverImageUrl.hashCode();
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
        if (!Intrinsics.LJFF(ConvertNoticeboardMaterialInfo.class, cls)) {
            return false;
        }
        ConvertNoticeboardMaterialInfo convertNoticeboardMaterialInfo = (ConvertNoticeboardMaterialInfo) obj;
        if (Intrinsics.LJFF(this.backgroundImageUrl, convertNoticeboardMaterialInfo.backgroundImageUrl) && Intrinsics.LJFF(this.coverImageUrl, convertNoticeboardMaterialInfo.coverImageUrl) && Intrinsics.LJFF(this.configJsonUrl, convertNoticeboardMaterialInfo.configJsonUrl) && Intrinsics.LJFF(this.title, convertNoticeboardMaterialInfo.title) && this.textCharCount == convertNoticeboardMaterialInfo.textCharCount && this.textBoxCount == convertNoticeboardMaterialInfo.textBoxCount && Intrinsics.LJFF(this.starlingMap, convertNoticeboardMaterialInfo.starlingMap) && Intrinsics.LJFF(this.thumbCoverImageUrl, convertNoticeboardMaterialInfo.thumbCoverImageUrl)) {
            return true;
        }
        return false;
    }
}
