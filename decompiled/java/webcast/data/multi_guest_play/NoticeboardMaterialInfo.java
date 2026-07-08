package webcast.data.multi_guest_play;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class NoticeboardMaterialInfo {

    @C09CT("text_box_count")
    public long textBoxCount;

    @C09CT("text_char_count")
    public long textCharCount;

    @C09CT("background_image_uri")
    public String backgroundImageUri = "";

    @C09CT("cover_image_uri")
    public String coverImageUri = "";

    @C09CT("config_json_uri")
    public String configJsonUri = "";

    @C09CT("title")
    public String title = "";

    @C09CT("starling_list")
    public List<String> starlingList = new ArrayList();

    @C09CT("thumb_cover_image_uri")
    public String thumbCoverImageUri = "";
}
