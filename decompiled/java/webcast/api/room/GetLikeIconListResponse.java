package webcast.api.room;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GetLikeIconListResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("icons")
        public List<ImageModel> icons = new ArrayList();

        @C09CT("icons_self")
        public List<ImageModel> iconsSelf = new ArrayList();

        @C09CT("default_icons")
        public List<ImageModel> defaultIcons = new ArrayList();
    }
}
