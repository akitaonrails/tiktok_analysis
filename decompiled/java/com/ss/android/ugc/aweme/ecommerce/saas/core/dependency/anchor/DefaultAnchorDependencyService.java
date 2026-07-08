package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.anchor;

import X.C19719512Dh;
import X.C2344009Gk;
import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class DefaultAnchorDependencyService implements IAnchorDependencyService {
    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.anchor.IAnchorDependencyService
    public boolean anchorInflaterOptEnable() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.anchor.IAnchorDependencyService
    public C2344009Gk appendCommentLogParams(C2344009Gk c2344009Gk, Aweme aweme, AnchorCommonStruct anchorCommonStruct, boolean z) {
        return c2344009Gk;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.anchor.IAnchorDependencyService
    public View commonAnchorItemProduceOne(ViewGroup viewGroup, Function0<Integer> function0, Function0<String> function02) {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.anchor.IAnchorDependencyService
    public boolean containAnchors(List<Integer> list) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.anchor.IAnchorDependencyService
    public boolean getAnchorMobRefactorExpEnable() {
        return false;
    }

    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.anchor.IAnchorDependencyService
    public boolean isAnchorDialogPanelVisible() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.anchor.IAnchorDependencyService
    public void setAnchorDialogClose(Dialog dialog, boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.anchor.IAnchorDependencyService
    public void tryAnchorInflaterOptRecycleEnable(View view, int i, Function0<Unit> function0) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.anchor.IAnchorDependencyService
    public Integer getFollowStatus(Aweme aweme) {
        return -1;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.anchor.IAnchorDependencyService
    public JSONObject mobParamsParserGetJSONObject(C2344009Gk c2344009Gk) {
        Map<String, String> map;
        Map<String, String> map2 = null;
        if (c2344009Gk == null || (map = c2344009Gk.LIZ) == null) {
            return null;
        }
        if (C19719512Dh.LJII(map)) {
            map2 = map;
        }
        return new JSONObject(map2);
    }
}
