package tikcast.api.anchor;

import X.C09CT;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class AboutMeUpdateRequest {

    @C09CT("input_content_list")
    public List<String> inputContentList;

    @C09CT("method_type")
    public int methodType;

    @C09CT("mock_room_id")
    public long mockRoomId;

    @C09CT("template_id")
    public String templateId = "";

    @C09CT("image_uri")
    public String imageUri = "";
}
