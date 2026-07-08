package com.ss.android.ugc.aweme.compliance.protection.routeraction;

import X.C018G;
import X.C098200Yq;
import X.C13LE;
import X.C1402840mbq;
import X.C189200o6;
import X.C2188811AlT;
import X.C257870A8r;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.router.route.IRouteAction;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.attributionlink.model.AttributionLinkStoryAnchorStruct;
import com.ss.android.ugc.aweme.composer.CreationComposerDsl;
import com.ss.android.ugc.aweme.composer.model.LinkShareData;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.services.external.IUIService;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS59S1000000_8;

/* JADX INFO: loaded from: classes9.dex */
public final class DigitalWellbeingShare2StoryAction implements IRouteAction {
    @Override // com.bytedance.router.route.IRouteAction
    public final Object open(Context context, String str, Bundle bundle) {
        Object c098200Yq;
        if (context != null && str != null && !((Boolean) C257870A8r.LIZ.getValue()).booleanValue()) {
            try {
                String strLIZIZ = C018G.LIZIZ(str, "image_path");
                String strLIZIZ2 = C018G.LIZIZ(str, "title");
                if (strLIZIZ2 == null) {
                    strLIZIZ2 = context.getString(2131837342);
                }
                String strLIZIZ3 = C018G.LIZIZ(str, "link");
                if (strLIZIZ3 == null) {
                    strLIZIZ3 = "aweme://roma_redirect/?spark_page=positive_reinforcement_home";
                }
                if (strLIZIZ != null && strLIZIZ.length() != 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("file://");
                    sbLIZ.append(strLIZIZ);
                    LIZ(context, strLIZIZ2, strLIZIZ3, C2188811AlT.LIZIZ(sbLIZ));
                }
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
        }
        return Unit.LIZ;
    }

    public static void LIZ(final Context context, String str, String str2, final String str3) {
        final C1402840mbq c1402840mbq = new C1402840mbq(new Bundle());
        c1402840mbq.attributionLinkStoryAnchorStruct = new AttributionLinkStoryAnchorStruct(str, str2, str);
        IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
        if (iExternalService != null) {
            iExternalService.asyncService(String.valueOf(C13LE.LIZ(DigitalWellbeingShare2StoryAction.class).LJI()), new SimpleServiceLoadCallback() { // from class: X.0Mib
                @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onLoad(AsyncAVService asyncAVService, long j) {
                    IUIService iUIServiceUiService = asyncAVService.uiService();
                    Context context2 = context;
                    CreationComposerDsl creationComposerDsl = new CreationComposerDsl();
                    C1402840mbq c1402840mbq2 = c1402840mbq;
                    String str4 = str3;
                    creationComposerDsl.basic(AFwS239S0000000_8.get$arr$(43));
                    creationComposerDsl.externalShareStory(new AwS59S1000000_8(str4, 6));
                    creationComposerDsl.setMusic(null);
                    creationComposerDsl.setLinkShare(new LinkShareData(EnumC567790MOr.PHOTO, c1402840mbq2, 1.0f, null, null));
                    iUIServiceUiService.startCreation(context2, creationComposerDsl);
                }
            });
        }
    }
}
