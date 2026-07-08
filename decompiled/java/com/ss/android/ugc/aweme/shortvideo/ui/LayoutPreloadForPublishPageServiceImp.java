package com.ss.android.ugc.aweme.shortvideo.ui;

import X.C0C64;
import X.C0CHQ;
import X.C1361400lX0;
import X.C201955140j;
import X.C21146717pB;
import X.C2188811AlT;
import X.C297390BlB;
import X.C786410Ut5;
import X.C830690WiJ;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.MutableContextWrapper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import com.ss.android.ugc.aweme.services.optimization.ILayoutPreloadServiceForPublishPage;
import com.ss.android.ugc.aweme.services.optimization.PreloadContextReplaceHelper;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes15.dex */
public final class LayoutPreloadForPublishPageServiceImp implements ILayoutPreloadServiceForPublishPage {
    @Override // com.ss.android.ugc.aweme.services.optimization.ILayoutPreloadServiceForPublishPage
    public final void preloadLayoutFilesInToolsPage(Context context, CreativeModel creativeModel) {
        ContextWrapper c1361400lX0;
        String simpleName;
        Context baseContext;
        Context baseContext2;
        if (context == null) {
            return;
        }
        final int iLJIILL = C0CHQ.LIZ().getPublishService().LJIILL(context, creativeModel);
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_publish_preload_mutable_context", true, false)) {
            final C1361400lX0 c1361400lX02 = new C1361400lX0(context, iLJIILL);
            c1361400lX0 = new MutableContextWrapper(c1361400lX02, iLJIILL) { // from class: X.0J3l
                public final int LIZ;

                @Override // android.content.ContextWrapper
                public final void attachBaseContext(Context context2) {
                    if (NxRewordManager.LJIILIIL) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("attachBaseContextWrapper: ");
                        sbLIZ.append(Log.getStackTraceString(new Throwable(context2.toString())));
                        C2188811AlT.LIZIZ(sbLIZ);
                        context2 = new C817700W5w(context2, false);
                    }
                    super.attachBaseContext(context2);
                }

                @Override // android.content.MutableContextWrapper
                public final void setBaseContext(Context context2) {
                    super.setBaseContext(new C1361400lX0(context2, this.LIZ));
                }

                {
                    this.LIZ = iLJIILL;
                }
            };
        } else {
            c1361400lX0 = new C1361400lX0(context, iLJIILL);
        }
        C830690WiJ c830690WiJ = C830690WiJ.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PublishLayoutPreload: preloadContext class=");
        sbLIZ.append(c1361400lX0.getClass().getSimpleName());
        sbLIZ.append(", hashCode=");
        sbLIZ.append(c1361400lX0.hashCode());
        sbLIZ.append(", base=");
        boolean z = c1361400lX0 instanceof MutableContextWrapper;
        Integer numValueOf = null;
        if (z && (baseContext2 = c1361400lX0.getBaseContext()) != null) {
            simpleName = baseContext2.getClass().getSimpleName();
        } else {
            simpleName = null;
        }
        sbLIZ.append(simpleName);
        sbLIZ.append(", baseHash=");
        if (z && (baseContext = c1361400lX0.getBaseContext()) != null) {
            numValueOf = Integer.valueOf(baseContext.hashCode());
        }
        sbLIZ.append(numValueOf);
        C201955140j.LJIILJJIL(c830690WiJ, C2188811AlT.LIZIZ(sbLIZ));
        if (C297390BlB.LIZIZ()) {
            C201955140j.LJIILJJIL(c830690WiJ, "PublishLayoutPreload: preload publish root view");
            C21146717pB.LIZJ(c1361400lX0, R.layout.c9y);
        }
        if (C297390BlB.LIZ() == 3) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(R.layout.cxu));
            if (creativeModel.creationTypeModel.creationMode == 2) {
                arrayList.add(Integer.valueOf(R.layout.v8));
            }
            int iLJIIJJI = ((IPoiService) ServiceManager.get().getService(IPoiService.class)).LJIIJJI();
            if (iLJIIJJI > 0) {
                arrayList.add(Integer.valueOf(iLJIIJJI));
            }
            C201955140j.LJIILJJIL(c830690WiJ, "PublishLayoutPreload: preload publish sub view");
            C21146717pB.LJI(c1361400lX0, arrayList);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.optimization.ILayoutPreloadServiceForPublishPage
    public final View loadMainLayoutFiles(String str, Context context, LayoutInflater layoutInflater, int i, ViewGroup viewGroup, boolean z) {
        if (C297390BlB.LIZIZ()) {
            if (context != null) {
                C830690WiJ c830690WiJ = C830690WiJ.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PublishLayoutPreload: publish root view(");
                sbLIZ.append(str);
                sbLIZ.append(") inflates from Ultimate");
                C201955140j.LJIILJJIL(c830690WiJ, C2188811AlT.LIZIZ(sbLIZ));
                View viewLIZIZ = C21146717pB.LIZIZ(context, i, viewGroup, z);
                PreloadContextReplaceHelper.replaceAfterInflate(viewLIZIZ, context, z, viewGroup);
                return viewLIZIZ;
            }
            return C786410Ut5.Td(layoutInflater, i, viewGroup, z);
        }
        return C786410Ut5.Td(layoutInflater, i, viewGroup, z);
    }

    @Override // com.ss.android.ugc.aweme.services.optimization.ILayoutPreloadServiceForPublishPage
    public final View loadOtherLayoutFiles(String str, Context context, LayoutInflater layoutInflater, int i, ViewGroup viewGroup, boolean z) {
        if (C297390BlB.LIZ() == 3) {
            if (context != null) {
                C830690WiJ c830690WiJ = C830690WiJ.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PublishLayoutPreload: publish sub view(");
                sbLIZ.append(str);
                sbLIZ.append(") inflates from Ultimate");
                C201955140j.LJIILJJIL(c830690WiJ, C2188811AlT.LIZIZ(sbLIZ));
                View viewLIZIZ = C21146717pB.LIZIZ(context, i, viewGroup, z);
                PreloadContextReplaceHelper.replaceAfterInflate(viewLIZIZ, context, z, viewGroup);
                return viewLIZIZ;
            }
            return C786410Ut5.Td(layoutInflater, i, viewGroup, z);
        }
        return C786410Ut5.Td(layoutInflater, i, viewGroup, z);
    }
}
