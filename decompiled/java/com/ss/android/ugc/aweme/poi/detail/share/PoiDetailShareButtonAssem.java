package com.ss.android.ugc.aweme.poi.detail.share;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C062S;
import X.C1174850gg7;
import X.C1181550gqv;
import X.C1183770guV;
import X.C1185120gwg;
import X.C1185160gwk;
import X.C1185180gwm;
import X.C13LP;
import X.C1559260qg8;
import X.C197039127h;
import X.C723590SZx;
import X.C786410Ut5;
import X.InterfaceC1181010gq3;
import X.InterfaceC1181670gr7;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiSlotComponent;
import com.ss.android.ugc.aweme.poi.detail.videolist.model.PoiDetailVideoListModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public final class PoiDetailShareButtonAssem extends PoiDetailBaseUiSlotComponent<Object> {
    public PoiListApi.PoiDetailResponse LLJJIJIIJIL;
    public C197039127h LLJJJ;
    public final C1559260qg8 LLJJIJI = new C1559260qg8(new C723590SZx(this, C062S.class, "PoiShareButtonHierarchyData"), checkSupervisorPrepared());
    public boolean LLJJIJIL = true;

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.e0y;
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiSlotComponent
    public final boolean lp(PoiListApi.PoiDetailResponse poiDetailResponse) {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiSlotComponent, com.ss.android.ugc.aweme.slash.component.BaseSlashSlotAssemComponent, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C197039127h c197039127h;
        super.onViewCreated(view);
        if (so()) {
            this.LLJJJ = (C197039127h) getContentView().findViewById(R.id.r1b);
            if (!((C062S) this.LLJJIJI.getValue()).LLILLJJLI && (c197039127h = this.LLJJJ) != null) {
                c197039127h.setButtonStartIcon(null);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.poi.detail.container.slash.component.PoiDetailBaseUiSlotComponent
    public final void op(final PoiListApi.PoiDetailResponse poiDetailResponse) {
        C1181550gqv c1181550gqvEr2;
        PoiDetailVideoListModel poiDetailVideoListModelLIZ;
        C1181550gqv c1181550gqvEr22;
        PoiDetailVideoListModel poiDetailVideoListModelLIZ2;
        this.LLJJIJIIJIL = poiDetailResponse;
        if (poiDetailResponse != null && C1183770guV.LIZ()) {
            long jLongValue = 0;
            List<Aweme> listLIZ = null;
            if (this.LLJJIJIL) {
                String poiId = kp().getPoiId();
                InterfaceC1181010gq3 interfaceC1181010gq3LIZ = C1174850gg7.LIZ(this);
                if (interfaceC1181010gq3LIZ != null && (c1181550gqvEr22 = interfaceC1181010gq3LIZ.Er2()) != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = ((LinkedHashMap) c1181550gqvEr22.LIZ).entrySet().iterator();
                    while (it2.hasNext()) {
                        Object value = ((Map.Entry) it2.next()).getValue();
                        if (value instanceof C1185120gwg) {
                            arrayList.add(value);
                        }
                    }
                    C1185120gwg c1185120gwg = (C1185120gwg) ((InterfaceC1181670gr7) C13LP.LJJJLL(arrayList));
                    if (c1185120gwg != null && (poiDetailVideoListModelLIZ2 = c1185120gwg.LIZ()) != null) {
                        listLIZ = poiDetailVideoListModelLIZ2.LIZ();
                    }
                }
                Long realFavoriteCnt = poiDetailResponse.getRealFavoriteCnt();
                if (realFavoriteCnt != null) {
                    jLongValue = realFavoriteCnt.longValue();
                }
                String strIsClaimedForMob = poiDetailResponse.isClaimedForMob();
                String strLIZIZ = kp().LIZIZ();
                if (strLIZIZ == null) {
                    strLIZIZ = kp().LJIIJJI();
                }
                C1185180gwm.LIZ(poiId, new C1185160gwk(strIsClaimedForMob, listLIZ, strLIZIZ, kp().LIZJ(), jLongValue, kp().LIZ()));
                this.LLJJIJIL = false;
                C197039127h c197039127h = this.LLJJJ;
                if (c197039127h != null) {
                    C786410Ut5.LLLLLLJ(c197039127h, 0);
                }
                C197039127h c197039127h2 = this.LLJJJ;
                if (c197039127h2 != null) {
                    C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0gwh
                        /* JADX WARN: Removed duplicated region for block: B:82:0x01ea  */
                        @Override // X.AbstractViewOnClickListenerC1637610siV
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void LIZ(android.view.View r53) throws org.json.JSONException {
                            /*
                                Method dump skipped, instruction units count: 1255
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C1185130gwh.LIZ(android.view.View):void");
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(300L);
                        }
                    }, c197039127h2);
                    return;
                }
                return;
            }
            C1185160gwk c1185160gwkLIZIZ = C1185180gwm.LIZIZ(kp().getPoiId());
            if (c1185160gwkLIZIZ != null) {
                String poiId2 = kp().getPoiId();
                List<Aweme> list = c1185160gwkLIZIZ.LIZIZ;
                if (list == null) {
                    InterfaceC1181010gq3 interfaceC1181010gq3LIZ2 = C1174850gg7.LIZ(this);
                    if (interfaceC1181010gq3LIZ2 != null && (c1181550gqvEr2 = interfaceC1181010gq3LIZ2.Er2()) != null) {
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it3 = ((LinkedHashMap) c1181550gqvEr2.LIZ).entrySet().iterator();
                        while (it3.hasNext()) {
                            Object value2 = ((Map.Entry) it3.next()).getValue();
                            if (value2 instanceof C1185120gwg) {
                                arrayList2.add(value2);
                            }
                        }
                        C1185120gwg c1185120gwg2 = (C1185120gwg) ((InterfaceC1181670gr7) C13LP.LJJJLL(arrayList2));
                        if (c1185120gwg2 != null && (poiDetailVideoListModelLIZ = c1185120gwg2.LIZ()) != null) {
                            listLIZ = poiDetailVideoListModelLIZ.LIZ();
                        }
                    }
                } else {
                    listLIZ = list;
                }
                Long realFavoriteCnt2 = poiDetailResponse.getRealFavoriteCnt();
                if (realFavoriteCnt2 != null) {
                    jLongValue = realFavoriteCnt2.longValue();
                }
                C1185180gwm.LIZ(poiId2, new C1185160gwk(poiDetailResponse.isClaimedForMob(), listLIZ, c1185160gwkLIZIZ.LIZLLL, c1185160gwkLIZIZ.LJ, jLongValue, c1185160gwkLIZIZ.LJFF));
            }
        }
    }
}
