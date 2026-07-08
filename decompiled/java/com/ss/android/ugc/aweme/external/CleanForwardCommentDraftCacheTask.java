package com.ss.android.ugc.aweme.external;

import X.C0CCZ;
import X.C0CHQ;
import X.C0MO4;
import X.C0VZ0;
import X.C15438062q;
import X.C558570LvT;
import X.C560950LzJ;
import X.C570330MYl;
import X.EnumC799870VZh;
import X.EnumC799980VZs;
import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class CleanForwardCommentDraftCacheTask implements C0CCZ {
    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ List finalizedBy() {
        return null;
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "CleanForwardCommentDraftCacheTask";
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ boolean meetTrigger() {
        return true;
    }

    @Override // X.C0CCZ
    public final /* synthetic */ boolean serialExecute() {
        return false;
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ int targetProcess() {
        return C0VZ0.LIZ();
    }

    @Override // X.InterfaceC800080Va2
    public final /* synthetic */ EnumC799980VZs triggerType() {
        return C0VZ0.LIZIZ(this);
    }

    @Override // X.C0CCZ
    public final EnumC799870VZh type() {
        return EnumC799870VZh.BOOT_FINISH;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        C0MO4 c0mo4 = C0MO4.LIZ;
        c0mo4.getClass();
        if (((String[]) C0MO4.LJ.getValue(c0mo4, C0MO4.LIZIZ[0])).length != 0) {
            ArrayList arrayList = new ArrayList();
            List<PublishModel> allPublishModel = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().getAllPublishModel();
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(allPublishModel, 10));
            Iterator<PublishModel> it2 = allPublishModel.iterator();
            while (it2.hasNext()) {
                arrayList2.add(it2.next().creationId);
            }
            for (String str : (String[]) C0MO4.LJ.getValue(c0mo4, C0MO4.LIZIZ[0])) {
                if (!((ArrayList) C0MO4.LIZLLL).contains(str) && !arrayList2.contains(str)) {
                    AwemeDraft awemeDraftLJI = C0CHQ.LIZ().LJI().LJIILJJIL().LJI(new C558570LvT(new CreativeInfo(str, 0, null, 6, null), false, false, false, 14));
                    if (awemeDraftLJI != null) {
                        C0CHQ.LIZ().LJI().LIZIZ().LJ(new C570330MYl(awemeDraftLJI, new C560950LzJ("clean comment forward draft cache", null, 2), false, null, null, 124), null);
                    }
                } else {
                    arrayList.add(str);
                }
            }
            C0MO4.LJ.setValue(c0mo4, C0MO4.LIZIZ[0], arrayList.toArray(new String[0]));
        }
    }
}
