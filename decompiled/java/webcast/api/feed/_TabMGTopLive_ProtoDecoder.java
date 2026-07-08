package webcast.api.feed;

import X.C0IMD;
import X.C1516680pZS;
import X.C1516700pZU;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class _TabMGTopLive_ProtoDecoder implements C0IMD<TabMGTopLive> {
    public static TabMGTopLive LIZLLL(C1516680pZS c1516680pZS) throws IOException {
        TabMGTopLive tabMGTopLive = new TabMGTopLive();
        tabMGTopLive.tabModule = new ArrayList();
        tabMGTopLive.playModule = new ArrayList();
        tabMGTopLive.interactionModule = new ArrayList();
        long jLIZJ = c1516680pZS.LIZJ();
        while (true) {
            int iLJI = c1516680pZS.LJI();
            if (iLJI != -1) {
                if (iLJI != 1) {
                    if (iLJI != 2) {
                        if (iLJI != 3) {
                            if (iLJI != 4) {
                                C1516700pZU.LJ(c1516680pZS);
                            } else {
                                tabMGTopLive.joinLiveBtn = _MGJoinLiveBtn_ProtoDecoder.LIZLLL(c1516680pZS);
                            }
                        } else {
                            tabMGTopLive.tabModule.add(_MGModuleTab_ProtoDecoder.LIZLLL(c1516680pZS));
                        }
                    } else {
                        tabMGTopLive.interactionModule.add(_MGModuleInteraction_ProtoDecoder.LIZLLL(c1516680pZS));
                    }
                } else {
                    tabMGTopLive.playModule.add(_MGModulePlay_ProtoDecoder.LIZLLL(c1516680pZS));
                }
            } else {
                c1516680pZS.LJ(jLIZJ);
                return tabMGTopLive;
            }
        }
    }

    public static void LJ(TabMGTopLive tabMGTopLive) {
        ImageModel imageModel;
        List<MGModulePlay> list = tabMGTopLive.playModule;
        if (list == null) {
            tabMGTopLive.playModule = new ArrayList();
        } else if (!list.isEmpty()) {
            for (MGModulePlay mGModulePlay : tabMGTopLive.playModule) {
                if (mGModulePlay != null && (imageModel = mGModulePlay.icon) != null) {
                    _ImageModel_ProtoDecoder.LJ(imageModel);
                }
            }
        }
        List<MGModuleInteraction> list2 = tabMGTopLive.interactionModule;
        if (list2 == null) {
            tabMGTopLive.interactionModule = new ArrayList();
        } else if (!list2.isEmpty()) {
            for (MGModuleInteraction mGModuleInteraction : tabMGTopLive.interactionModule) {
                if (mGModuleInteraction != null) {
                    _MGModuleInteraction_ProtoDecoder.LJ(mGModuleInteraction);
                }
            }
        }
        List<MGModuleTab> list3 = tabMGTopLive.tabModule;
        if (list3 == null) {
            tabMGTopLive.tabModule = new ArrayList();
        } else {
            if (list3.isEmpty()) {
                return;
            }
            Iterator<MGModuleTab> it2 = tabMGTopLive.tabModule.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Override // X.C0IMD
    public final void LIZ(TabMGTopLive tabMGTopLive) {
        LJ(tabMGTopLive);
    }

    @Override // X.C0IMD
    public final TabMGTopLive LIZJ(C1516680pZS c1516680pZS) {
        return LIZLLL(c1516680pZS);
    }

    @Override // X.C0IMD
    public final /* bridge */ /* synthetic */ void LIZIZ(C1516680pZS c1516680pZS, TabMGTopLive tabMGTopLive, List list) {
    }
}
