package webcast.api.game;

import X.C09CT;
import com.bytedance.android.livesdk.game.model.PersonaAssetSet;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GetPersonaAssetsGalleryResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("asset_sets")
        public List<PersonaAssetSet> assetSets = new ArrayList();

        @C09CT("has_more")
        public boolean hasMore;

        @C09CT("total")
        public int total;
    }
}
