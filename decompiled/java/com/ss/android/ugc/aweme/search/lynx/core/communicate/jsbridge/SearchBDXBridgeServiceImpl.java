package com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge;

import X.AbstractC1549150qPp;
import X.C0DPL;
import X.C0O9A;
import X.C0Q03;
import X.C0Q0S;
import X.C0Q4S;
import X.C0Q7X;
import X.C0QEF;
import X.C0QF5;
import X.C0QF9;
import X.C0QGH;
import X.C0QGI;
import X.C0QGJ;
import X.C0QMT;
import X.C0QMU;
import X.C0QN7;
import X.C1054670dYH;
import X.C1064020dnM;
import X.C13BV;
import X.C1468605oy;
import X.C14E6;
import X.C1537480q70;
import X.C1543330qGR;
import X.C1544000qHW;
import X.C1697810uHb;
import X.C1800360wx0;
import X.C2188811AlT;
import X.C338550DOz;
import X.C627650Ojb;
import X.C651160PgQ;
import X.C651180PgS;
import X.C651220PgW;
import X.C651260Pga;
import X.C651270Pgb;
import X.C651450Pgt;
import X.C651470Pgv;
import X.C651520Ph0;
import X.C651950Phh;
import X.C652030Php;
import X.C652100Phw;
import X.C653980Pky;
import X.C662200PyE;
import X.C662320PyQ;
import X.C663410Q0l;
import X.C663490Q0t;
import X.C665610Q8x;
import X.C665840Q9u;
import X.C667300QFk;
import X.C667370QFr;
import X.C667420QFw;
import X.C667430QFx;
import X.C667440QFy;
import X.C679010QkF;
import X.C682480Qpq;
import X.C684410Qsx;
import X.C685670Quz;
import X.C685680Qv0;
import X.C687780QyO;
import X.C687830QyT;
import X.InterfaceC1531560pxS;
import X.InterfaceC644900PRg;
import X.InterfaceC667380QFs;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.ss.android.ugc.aweme.i18n.abtest.JSBAIMigrationSearchSettings;
import com.ss.android.ugc.aweme.i18n.xbridge.ISearchBDXBridgeService;
import com.ss.android.ugc.aweme.search.df.api.cointask.core.spi.ISearchCoinTaskBridgeMethodService;
import com.ss.android.ugc.aweme.search.df.api.survey.ISearchSurvey;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.SearchBDXBridgeServiceImpl;
import com.ss.android.ugc.aweme.search.lynx.xsearch.config.SearchEcomDecouplingChannelSettings;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class SearchBDXBridgeServiceImpl implements ISearchBDXBridgeService {
    @Override // com.ss.android.ugc.aweme.i18n.xbridge.ISearchBDXBridgeService
    public final List<Class<? extends AbstractC1549150qPp<?, ?>>> provideXBridgetIDLMethodList() {
        List<Class<? extends AbstractC1549150qPp<?, ?>>> listLIZ;
        JSBAIMigrationSearchSettings.JSBAIMigrationSearchModel jSBAIMigrationSearchModel;
        InterfaceC644900PRg interfaceC644900PRgLJFF;
        List<Class<? extends AbstractC1549150qPp<?, ?>>> listLIZIZ;
        List<Class<? extends AbstractC1549150qPp<?, ?>>> listLJIILJJIL = C1697810uHb.LJIILJJIL(C687780QyO.class, C651950Phh.class, C0QMU.class, C0QGJ.class, C0QMT.class, C687830QyT.class, C651260Pga.class, C1800360wx0.class, C627650Ojb.class, C651180PgS.class, C679010QkF.class, C662320PyQ.class, C14E6.class, C662200PyE.class, C0Q4S.class, C667440QFy.class, C651220PgW.class, C0QGH.class, C665610Q8x.class, C0QGI.class, C667420QFw.class, C651450Pgt.class, C651160PgQ.class, C651270Pgb.class, C665840Q9u.class, C651470Pgv.class, C0QN7.class, C663490Q0t.class, C0Q7X.class, C652100Phw.class, C338550DOz.class, C0DPL.class, C0O9A.class, C651520Ph0.class, C1468605oy.class, C652030Php.class);
        ISearchSurvey iSearchSurveyLIZ = C0QF5.LIZ();
        if (iSearchSurveyLIZ != null && (interfaceC644900PRgLJFF = iSearchSurveyLIZ.LJFF()) != null && (listLIZIZ = interfaceC644900PRgLJFF.LIZIZ()) != null) {
            listLJIILJJIL.addAll(listLIZIZ);
        }
        listLJIILJJIL.addAll(C682480Qpq.LIZ().provideXBridgetIDLMethodList());
        ISearchCoinTaskBridgeMethodService.LIZ.getClass();
        ISearchCoinTaskBridgeMethodService value = C667370QFr.LIZIZ.getValue();
        if (value == null || (listLIZ = value.LIZ()) == null) {
            listLIZ = C13BV.INSTANCE;
        }
        listLJIILJJIL.addAll(listLIZ);
        final ArrayList arrayList = new ArrayList();
        if (C1544000qHW.LJIIZILJ) {
            listLJIILJJIL.add(C667300QFk.class);
            listLJIILJJIL.add(C0QF9.class);
            listLJIILJJIL.add(C0Q03.class);
            listLJIILJJIL.add(C663410Q0l.class);
            listLJIILJJIL.add(C1064020dnM.class);
            listLJIILJJIL.add(C0QEF.class);
            listLJIILJJIL.add(C0Q0S.class);
            listLJIILJJIL.add(C684410Qsx.class);
            listLJIILJJIL.add(C653980Pky.class);
            listLJIILJJIL.add(C685670Quz.class);
            arrayList.add(C685680Qv0.class);
            ((ArrayList) C1054670dYH.LIZ).add(new InterfaceC667380QFs() { // from class: X.0QFp
                @Override // X.InterfaceC667380QFs
                public final List LIZ(InterfaceC1541990qEH interfaceC1541990qEH) {
                    SearchBDXBridgeServiceImpl searchBDXBridgeServiceImpl = this.LIZ;
                    C1537480q70 hybridContext = interfaceC1541990qEH.getHybridContext();
                    searchBDXBridgeServiceImpl.getClass();
                    if (SearchBDXBridgeServiceImpl.LIZ(hybridContext)) {
                        return arrayList;
                    }
                    return C13BV.INSTANCE;
                }
            });
        } else {
            if (C667430QFx.LIZ()) {
                jSBAIMigrationSearchModel = JSBAIMigrationSearchSettings.LIZ;
            } else {
                SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
                JSBAIMigrationSearchSettings.JSBAIMigrationSearchModel jSBAIMigrationSearchModel2 = JSBAIMigrationSearchSettings.LIZ;
                jSBAIMigrationSearchModel = (JSBAIMigrationSearchSettings.JSBAIMigrationSearchModel) settingsManagerLIZLLL.LJIIIIZZ("JSB_AI_Migration_Search", JSBAIMigrationSearchSettings.JSBAIMigrationSearchModel.class, jSBAIMigrationSearchModel2);
                if (jSBAIMigrationSearchModel == null) {
                    jSBAIMigrationSearchModel = jSBAIMigrationSearchModel2;
                }
            }
            C1543330qGR c1543330qGR = C1544000qHW.LJIILLIIL;
            long j = jSBAIMigrationSearchModel.enable ? 1L : 0L;
            if (jSBAIMigrationSearchModel.click_search_card) {
                j |= 2;
            }
            if (jSBAIMigrationSearchModel.deleteSearchHistory) {
                j |= 4;
            }
            if (jSBAIMigrationSearchModel.getSearchHistory) {
                j |= 8;
            }
            if (jSBAIMigrationSearchModel.musicCollectNotice) {
                j |= 16;
            }
            if (jSBAIMigrationSearchModel.openAlert) {
                j |= 32;
            }
            if (jSBAIMigrationSearchModel.open_live) {
                j |= 64;
            }
            if (jSBAIMigrationSearchModel.searchEnterLiveFlow) {
                j |= 128;
            }
            if (jSBAIMigrationSearchModel.searchLaunchChat) {
                j |= 256;
            }
            if (jSBAIMigrationSearchModel.userFollowNotice) {
                j |= 512;
            }
            if (jSBAIMigrationSearchModel.openSingleFeedbackSheet) {
                j |= 1024;
            }
            c1543330qGR.LIZLLL.setValue(c1543330qGR, C1543330qGR.LJIIIZ[3], Long.valueOf(j));
            if (jSBAIMigrationSearchModel.enable) {
                if (jSBAIMigrationSearchModel.musicCollectNotice) {
                    listLJIILJJIL.add(C667300QFk.class);
                }
                if (jSBAIMigrationSearchModel.getSearchHistory) {
                    listLJIILJJIL.add(C0QF9.class);
                }
                if (jSBAIMigrationSearchModel.click_search_card) {
                    listLJIILJJIL.add(C0Q03.class);
                }
                if (jSBAIMigrationSearchModel.userFollowNotice) {
                    listLJIILJJIL.add(C663410Q0l.class);
                }
                if (jSBAIMigrationSearchModel.searchLaunchChat) {
                    listLJIILJJIL.add(C1064020dnM.class);
                }
                if (jSBAIMigrationSearchModel.deleteSearchHistory) {
                    listLJIILJJIL.add(C0QEF.class);
                }
                if (jSBAIMigrationSearchModel.open_live) {
                    listLJIILJJIL.add(C0Q0S.class);
                }
                if (jSBAIMigrationSearchModel.openAlert) {
                    listLJIILJJIL.add(C684410Qsx.class);
                }
                if (jSBAIMigrationSearchModel.searchEnterLiveFlow) {
                    listLJIILJJIL.add(C653980Pky.class);
                }
                if (jSBAIMigrationSearchModel.openSingleFeedbackSheet) {
                    listLJIILJJIL.add(C685670Quz.class);
                    arrayList.add(C685680Qv0.class);
                }
                ((ArrayList) C1054670dYH.LIZ).add(new InterfaceC667380QFs() { // from class: X.0QFq
                    @Override // X.InterfaceC667380QFs
                    public final List LIZ(InterfaceC1541990qEH interfaceC1541990qEH) {
                        SearchBDXBridgeServiceImpl searchBDXBridgeServiceImpl = this.LIZ;
                        C1537480q70 hybridContext = interfaceC1541990qEH.getHybridContext();
                        searchBDXBridgeServiceImpl.getClass();
                        if (SearchBDXBridgeServiceImpl.LIZ(hybridContext)) {
                            return arrayList;
                        }
                        return C13BV.INSTANCE;
                    }
                });
                return listLJIILJJIL;
            }
        }
        return listLJIILJJIL;
    }

    public static boolean LIZ(C1537480q70 c1537480q70) {
        String channel;
        InterfaceC1531560pxS interfaceC1531560pxS;
        HybridSchemaParam hybridSchemaParamLIZJ;
        if (c1537480q70 != null && (interfaceC1531560pxS = c1537480q70.hybridParams) != null && (hybridSchemaParamLIZJ = interfaceC1531560pxS.LIZJ()) != null) {
            channel = hybridSchemaParamLIZJ.getChannel();
        } else {
            channel = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("channel: ");
        sbLIZ.append(channel);
        C2188811AlT.LIZIZ(sbLIZ);
        if (channel == null) {
            return false;
        }
        return SearchEcomDecouplingChannelSettings.LIZ(channel);
    }
}
