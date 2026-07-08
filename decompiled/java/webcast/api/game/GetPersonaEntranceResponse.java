package webcast.api.game;

import X.C09CT;
import com.bytedance.android.livesdk.game.model.PersonaAssetSet;
import com.bytedance.android.livesdk.game.model.PersonaCombine;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class GetPersonaEntranceResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("current_combine")
        public PersonaCombine currentCombine;

        @C09CT("is_has_applied")
        public boolean isHasApplied;

        @C09CT("is_has_new_generated")
        public boolean isHasNewGenerated;

        @C09CT("is_has_permission")
        public boolean isHasPermission;

        @C09CT("is_has_permission_v2")
        public boolean isHasPermissionV2;

        @C09CT("combines")
        public List<PersonaCombine> combines = new ArrayList();

        @C09CT("asset_sets")
        public List<PersonaAssetSet> assetSets = new ArrayList();
    }
}
