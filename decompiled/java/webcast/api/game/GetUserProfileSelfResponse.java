package webcast.api.game;

import X.C09CT;
import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: loaded from: classes35.dex */
public final class GetUserProfileSelfResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("user")
        public User user;
    }

    public static final class User {

        @C09CT("avatar_large")
        public ImageModel avatarLarge;

        @C09CT("avatar_medium")
        public ImageModel avatarMedium;

        @C09CT("avatar_thumb")
        public ImageModel avatarThumb;

        @C09CT("total_favorited")
        public long totalFavorited;

        @C09CT("nick_name")
        public String nickName = "";

        @C09CT("signature")
        public String signature = "";

        @C09CT("unique_id")
        public String uniqueId = "";
    }
}
