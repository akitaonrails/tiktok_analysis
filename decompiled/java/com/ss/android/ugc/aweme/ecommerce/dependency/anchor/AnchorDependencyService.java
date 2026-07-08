package com.ss.android.ugc.aweme.ecommerce.dependency.anchor;

import X.C04TD;
import X.C04UD;
import X.C1065100dp6;
import X.C1065330dpT;
import X.C1065340dpU;
import X.C2344009Gk;
import android.app.Dialog;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.anchor.service.AnchorStateServiceImpl;
import com.ss.android.ugc.aweme.base.IAnchorApiForEcommerce;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.anchor.IAnchorDependencyService;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public final class AnchorDependencyService implements IAnchorDependencyService {
    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.anchor.IAnchorDependencyService
    public boolean anchorInflaterOptEnable() {
        return false;
    }

    public void initService() {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.anchor.IAnchorDependencyService
    public void tryAnchorInflaterOptRecycleEnable(View view, int i, Function0<Unit> function0) {
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.anchor.IAnchorDependencyService
    public boolean getAnchorMobRefactorExpEnable() {
        return C04UD.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.anchor.IAnchorDependencyService
    public boolean isAnchorDialogPanelVisible() {
        return AnchorStateServiceImpl.LJII().isAnchorDialogPanelVisible();
    }

    public static IAnchorDependencyService createIAnchorDependencyServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(IAnchorDependencyService.class, z);
        if (objLIZ != null) {
            return (IAnchorDependencyService) objLIZ;
        }
        if (C04TD.LLZZ == null) {
            synchronized (IAnchorDependencyService.class) {
                if (C04TD.LLZZ == null) {
                    C04TD.LLZZ = new AnchorDependencyService();
                }
            }
        }
        return C04TD.LLZZ;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.anchor.IAnchorDependencyService
    public boolean containAnchors(List<Integer> list) {
        IAnchorApiForEcommerce iAnchorApiForEcommerce = (IAnchorApiForEcommerce) PluggableExtentionKt.pluggableSpi$default(IAnchorApiForEcommerce.class, false, false, false, 14, null);
        if (iAnchorApiForEcommerce != null) {
            return iAnchorApiForEcommerce.containAnchors(list);
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.anchor.IAnchorDependencyService
    public Integer getFollowStatus(Aweme aweme) {
        C1065340dpU.LIZ.getClass();
        return C1065340dpU.LIZ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.anchor.IAnchorDependencyService
    public JSONObject mobParamsParserGetJSONObject(C2344009Gk c2344009Gk) {
        return C1065330dpT.LIZLLL(c2344009Gk);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.anchor.IAnchorDependencyService
    public void setAnchorDialogClose(Dialog dialog, boolean z) {
        IAnchorApiForEcommerce iAnchorApiForEcommerce = (IAnchorApiForEcommerce) PluggableExtentionKt.pluggableSpi$default(IAnchorApiForEcommerce.class, false, false, false, 14, null);
        if (iAnchorApiForEcommerce != null) {
            iAnchorApiForEcommerce.LIZ(dialog);
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.anchor.IAnchorDependencyService
    public View commonAnchorItemProduceOne(ViewGroup viewGroup, Function0<Integer> function0, Function0<String> function02) {
        IAnchorApiForEcommerce iAnchorApiForEcommerce = (IAnchorApiForEcommerce) PluggableExtentionKt.pluggableSpi$default(IAnchorApiForEcommerce.class, false, false, false, 14, null);
        if (iAnchorApiForEcommerce != null) {
            return iAnchorApiForEcommerce.commonAnchorItemProduceOne(viewGroup, function0, function02);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.anchor.IAnchorDependencyService
    public C2344009Gk appendCommentLogParams(C2344009Gk c2344009Gk, Aweme aweme, AnchorCommonStruct anchorCommonStruct, boolean z) {
        String logExtra;
        String componentKey;
        String componentKey2;
        String aid;
        String componentKey3 = null;
        if (anchorCommonStruct != null) {
            logExtra = anchorCommonStruct.getLogExtra();
        } else {
            logExtra = null;
        }
        C1065100dp6 c1065100dp6 = new C1065100dp6(logExtra);
        if (c2344009Gk == null) {
            return null;
        }
        c2344009Gk.LIZJ(z ? 1 : 0, "multi_anchor");
        C1065330dpT.LIZ(c2344009Gk, "anchor_number", 1);
        if (anchorCommonStruct != null) {
            componentKey = anchorCommonStruct.getComponentKey();
        } else {
            componentKey = null;
        }
        C1065330dpT.LIZ(c2344009Gk, "component_key", componentKey);
        if (anchorCommonStruct != null) {
            componentKey2 = anchorCommonStruct.getComponentKey();
        } else {
            componentKey2 = null;
        }
        C1065330dpT.LIZ(c2344009Gk, "main_component_key", componentKey2);
        C1065330dpT.LIZ(c2344009Gk, "main_anchor_id", c1065100dp6.LIZ());
        C1065330dpT.LIZ(c2344009Gk, "main_anchor_name", c1065100dp6.LIZIZ());
        String strLJ = c1065100dp6.LJ();
        if (strLJ.length() == 0) {
            if (anchorCommonStruct != null) {
                strLJ = anchorCommonStruct.getComponentKey();
            } else {
                strLJ = null;
            }
        }
        C1065330dpT.LIZ(c2344009Gk, "main_anchor_type", strLJ);
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        C1065330dpT.LIZ(c2344009Gk, "group_id", aid);
        C1065330dpT.LIZ(c2344009Gk, "anchor_id", c1065100dp6.LJFF());
        C1065330dpT.LIZ(c2344009Gk, "anchor_name", c1065100dp6.LJI());
        String strLIZJ = c1065100dp6.LIZJ();
        if (strLIZJ.length() == 0) {
            if (anchorCommonStruct != null) {
                componentKey3 = anchorCommonStruct.getComponentKey();
            }
            strLIZJ = componentKey3;
        }
        C1065330dpT.LIZ(c2344009Gk, "anchor_type", strLIZJ);
        return c2344009Gk;
    }
}
