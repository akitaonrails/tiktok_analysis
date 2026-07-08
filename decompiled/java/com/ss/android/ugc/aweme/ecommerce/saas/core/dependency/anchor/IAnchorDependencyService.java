package com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.anchor;

import X.C2344009Gk;
import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public interface IAnchorDependencyService extends IECommerceHostService {
    boolean anchorInflaterOptEnable();

    C2344009Gk appendCommentLogParams(C2344009Gk c2344009Gk, Aweme aweme, AnchorCommonStruct anchorCommonStruct, boolean z);

    View commonAnchorItemProduceOne(ViewGroup viewGroup, Function0<Integer> function0, Function0<String> function02);

    boolean containAnchors(List<Integer> list);

    boolean getAnchorMobRefactorExpEnable();

    Integer getFollowStatus(Aweme aweme);

    boolean isAnchorDialogPanelVisible();

    JSONObject mobParamsParserGetJSONObject(C2344009Gk c2344009Gk);

    void setAnchorDialogClose(Dialog dialog, boolean z);

    void tryAnchorInflaterOptRecycleEnable(View view, int i, Function0<Unit> function0);
}
