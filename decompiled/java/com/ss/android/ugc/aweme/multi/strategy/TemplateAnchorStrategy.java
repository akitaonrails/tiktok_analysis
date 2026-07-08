package com.ss.android.ugc.aweme.multi.strategy;

import X.C08JS;
import X.C0B7Q;
import X.C0L9D;
import X.C123100dR;
import X.C1394230mNx;
import X.C1394330mO7;
import X.C1394340mO8;
import X.C1394430mOH;
import X.C1394440mOI;
import X.C1394480mOM;
import X.C1394490mON;
import X.C13BV;
import X.C13SZ;
import X.C1401830maD;
import X.C1449410nox;
import X.C15438062q;
import X.C201955140j;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C259800zU;
import X.C298980Bnk;
import X.C533100KvU;
import X.EnumC1412640mre;
import X.EnumC1430380nKG;
import android.app.Activity;
import android.content.Context;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.google.gson.p;
import com.ss.android.ugc.aweme.anchor.service.ITemplateAnchorStrategyService;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.MDPRecommendTemplateInfo;
import com.ss.android.ugc.aweme.creative.model.MusicInfo;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mob.record.IRecordMobService;
import com.ss.android.ugc.aweme.multi.strategy.TemplateAnchorStrategy;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicFusion;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.services.external.ui.EPTemplateInfo;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.TemplateSlot;
import com.ss.android.ugc.aweme.template.TemplateAnchorConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class TemplateAnchorStrategy implements ITemplateAnchorStrategyService {
    public static void LJ(TemplateAnchorConfig templateAnchorConfig) {
        String enterMethod;
        C1394230mNx c1394230mNx = C1394230mNx.LIZ;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("tt_template_id", templateAnchorConfig.getTemplateId());
        c2344009Gk.LJIIIIZZ("main_anchor_type", templateAnchorConfig.getMainAnchorType());
        c2344009Gk.LIZJ(templateAnchorConfig.getTemplateType(), "template_type");
        c2344009Gk.LJIIIIZZ("tt_template_type", templateAnchorConfig.getFollowedTemplateType());
        if (C123100dR.LIZ(templateAnchorConfig.getRelationEnterMethod())) {
            enterMethod = templateAnchorConfig.getRelationEnterMethod();
        } else {
            enterMethod = templateAnchorConfig.getEnterMethod();
        }
        c2344009Gk.LJIIIIZZ("enter_method", enterMethod);
        AnchorCommonStruct anchor = templateAnchorConfig.getAnchor();
        c1394230mNx.getClass();
        C1394230mNx.LIZ(c2344009Gk, anchor);
        MDPRecommendTemplateInfo mdpRecommendTemplateInfo = templateAnchorConfig.getMdpRecommendTemplateInfo();
        if (mdpRecommendTemplateInfo != null) {
            c2344009Gk.LJIIIIZZ("tt_template_group_id", mdpRecommendTemplateInfo.getTtTemplateGroupId());
            c2344009Gk.LJIIIIZZ("template_rec_reason", mdpRecommendTemplateInfo.getTemplateRecommendReason());
            c2344009Gk.LJ(mdpRecommendTemplateInfo.getTtTemplatePinType(), "tt_template_pin_type");
        }
        ((IRecordMobService) ServiceManager.get().getService(IRecordMobService.class)).LIZLLL(new C1449410nox(templateAnchorConfig.getCreativeInfo().getCreationId(), (String) C298980Bnk.LIZIZ(templateAnchorConfig.getShootWay(), "tt_template_anchor"), "template_page", templateAnchorConfig.getAwemeId(), null, null, null, null, 240), c2344009Gk.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.anchor.service.ITemplateAnchorStrategyService
    public final void LIZ(final Activity activity, final TemplateAnchorConfig templateAnchorConfig, final boolean z) {
        if (templateAnchorConfig == null) {
            return;
        }
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncService("template_detail", new SimpleServiceLoadCallback() { // from class: X.0mO6
            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
            public final void onLoad(AsyncAVService asyncAVService, long j) {
                asyncAVService.uiService().recordService().startTemplateAnchorAlbum(activity, templateAnchorConfig);
                if (z) {
                    TemplateAnchorStrategy templateAnchorStrategy = this;
                    TemplateAnchorConfig templateAnchorConfig2 = templateAnchorConfig;
                    templateAnchorStrategy.getClass();
                    TemplateAnchorStrategy.LJ(templateAnchorConfig2);
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r10v6, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v16, types: [T, X.13BV] */
    @Override // com.ss.android.ugc.aweme.anchor.service.ITemplateAnchorStrategyService
    public final TemplateAnchorConfig LIZLLL(AnchorCommonStruct anchorCommonStruct, Aweme aweme, String str, String str2, String str3) {
        MusicModel musicModelConvertToMusicModel;
        MusicFusion musicFusion;
        String str4;
        String str5;
        Boolean bool;
        MusicModel musicModelConvertToMusicModel2;
        MusicFusion musicFusion2;
        String str6;
        String str7;
        Boolean bool2;
        String strLJIL;
        String strLJIL2;
        int size;
        Boolean boolValueOf;
        MusicFusion musicFusion3;
        EnumC1412640mre enumC1412640mreLIZ;
        int iIntValue;
        Integer numValueOf;
        int type = anchorCommonStruct.getType();
        EnumC1412640mre enumC1412640mreLIZ2 = C1394480mOM.LIZ(anchorCommonStruct);
        C1394490mON c1394490mONLIZLLL = C1394440mOI.LIZLLL(anchorCommonStruct);
        String str8 = "";
        String str9 = "tt_template_anchor";
        if (type != EnumC1430380nKG.ANCHOR_UGC_TEMPLATE.getTYPE() && enumC1412640mreLIZ2 != EnumC1412640mre.UGC_TEMPLATE) {
            String str10 = "autocut_anchor";
            if (type != EnumC1430380nKG.ANCHOR_PUGC_TEMPLATE.getTYPE() && enumC1412640mreLIZ2 != EnumC1412640mre.PUGC_TEMPLATE) {
                boolean z = true;
                if (type == EnumC1430380nKG.ANCHOR_AUTO_CUT.getTYPE() || (C298980Bnk.LIZ() && C1394440mOI.LIZ(c1394490mONLIZLLL))) {
                    C259800zU c259800zU = new C259800zU();
                    c259800zU.element = C13BV.INSTANCE;
                    ArrayList arrayList = new ArrayList();
                    try {
                        new p();
                        n nVarLJIILIIL = p.LIZJ(anchorCommonStruct.getExtra()).LJIILIIL();
                        new p();
                        List listLJ = C08JS.LJ(TemplateSlot[].class, p.LIZJ(nVarLJIILIIL.LJJIIZ("nle_summary").LJIL()).LJIILIIL().LJJIIZ("slots").LJIL());
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj : listLJ) {
                            if (Intrinsics.LJFF(((TemplateSlot) obj).getType(), "video")) {
                                arrayList2.add(obj);
                            }
                        }
                        arrayList.addAll(arrayList2);
                        ?? arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            arrayList3.add(Float.valueOf((float) ((TemplateSlot) it2.next()).getDuration()));
                        }
                        c259800zU.element = arrayList3;
                        strLJIL2 = nVarLJIILIIL.LJJIIZ("music_id").LJIL();
                        try {
                            if (!((Boolean) C0B7Q.LIZ.getValue()).booleanValue()) {
                                strLJIL = "";
                            } else {
                                new p();
                                strLJIL = p.LIZJ(nVarLJIILIIL.LJJIIZ("nle_extra").LJIL()).LJIILIIL().LJJIIZ("ai_template_func_list").LJIL();
                            }
                        } catch (Exception e) {
                            e = e;
                            strLJIL = "";
                        }
                    } catch (Exception e2) {
                        e = e2;
                        strLJIL = "";
                        strLJIL2 = null;
                    }
                    try {
                        size = ((List) c259800zU.element).size();
                    } catch (Exception e3) {
                        e = e3;
                        TryCatchGuardChecker.doCheck(e);
                        String id = anchorCommonStruct.getId();
                        String strLIZIZ = C13SZ.LIZIZ(e);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("mobAutoCutAnchorParseData: success = ");
                        sbLIZ.append(false);
                        sbLIZ.append(", templateId = ");
                        sbLIZ.append(id);
                        sbLIZ.append(", errCode = ");
                        sbLIZ.append((Object) 1);
                        sbLIZ.append(", errMsg = ");
                        sbLIZ.append(strLIZIZ);
                        sbLIZ.append(", config = ");
                        sbLIZ.append((Object) null);
                        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("template_anchor_strategy ");
                        sbLIZ2.append(strLIZIZ2);
                        C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ2));
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        c2344009Gk.LIZJ(1, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
                        c2344009Gk.LJ(1, "error_code");
                        c2344009Gk.LJIIIIZZ("error_msg", strLIZIZ);
                        c2344009Gk.LJIIIIZZ("template_id", id);
                        c2344009Gk.LJIIIIZZ("music_id", null);
                        c2344009Gk.LJIIIIZZ("duration_list", null);
                        C20684815ws.LJIILLIIL("tool_performance_autocut_anchor_parse_data", c2344009Gk.LIZ);
                        size = 0;
                    }
                    if (!C1394330mO7.LIZ()) {
                        str9 = "autocut_anchor";
                    }
                    String aid = aweme.getAid();
                    if (aid != null) {
                        str8 = aid;
                    }
                    String id2 = anchorCommonStruct.getId();
                    try {
                        String schema = anchorCommonStruct.getSchema();
                        if (schema != null) {
                            boolValueOf = Boolean.FALSE;
                            try {
                                new p();
                                if (p.LIZJ(schema).LJIILIIL().LJJIIZ("is_commerce_autocut_music").LJIIJJI() != 1) {
                                    z = false;
                                }
                                boolValueOf = Boolean.valueOf(z);
                            } catch (Exception e4) {
                                e = e4;
                                TryCatchGuardChecker.doCheck(e);
                            }
                        } else {
                            boolValueOf = null;
                        }
                    } catch (Exception e5) {
                        e = e5;
                        boolValueOf = null;
                    }
                    List list = (List) c259800zU.element;
                    String dataFromExtra = anchorCommonStruct.getDataFromExtra("autocut_template_group_id", "");
                    int value = EnumC1412640mre.AUTOCUT_TEMPLATE.getValue();
                    C1394340mO8.LIZ.getClass();
                    Music music = aweme.getMusic();
                    if (music != null) {
                        musicFusion3 = music.getMusicFusion();
                    } else {
                        musicFusion3 = null;
                    }
                    return new TemplateAnchorConfig(str9, str8, id2, dataFromExtra, value, strLJIL2, 1, size, boolValueOf, list, arrayList, str, str2, str3, 0, anchorCommonStruct, null, new CreativeInfo(null, 0, null, 7, null), null, null, new EPTemplateInfo(false, null, 3, null), musicFusion3, null, null, null, null, strLJIL, null, null);
                }
                if (type == EnumC1430380nKG.MV_TEMPLATE.getTYPE() || (C298980Bnk.LIZ() && C1394440mOI.LIZIZ(c1394490mONLIZLLL))) {
                    String id3 = anchorCommonStruct.getId();
                    if (id3 == null || id3.length() == 0 || (enumC1412640mreLIZ = C1394480mOM.LIZ(anchorCommonStruct)) == null) {
                        return null;
                    }
                    int value2 = enumC1412640mreLIZ.getValue();
                    if (!C1394330mO7.LIZ()) {
                        str9 = "mv_page";
                    }
                    String aid2 = aweme.getAid();
                    if (aid2 != null) {
                        str8 = aid2;
                    }
                    try {
                        numValueOf = Integer.valueOf(CastIntegerProtector.parseInt(anchorCommonStruct.getDataFromExtra("source_id", "")));
                    } catch (Exception e6) {
                        TryCatchGuardChecker.doCheck(e6);
                    }
                    if (numValueOf == null) {
                        iIntValue = 0;
                    } else {
                        iIntValue = numValueOf.intValue();
                    }
                    return new TemplateAnchorConfig(str9, str8, id3, null, value2, null, 0, 0, Boolean.FALSE, null, null, str, str2, str3, iIntValue, anchorCommonStruct, null, new CreativeInfo(null, 0, null, 7, null), null, null, new EPTemplateInfo(false, null, 3, null), null, null, null, null, null, null, null, null);
                }
                C533100KvU.LIZ(C0L9D.HANDLE_ALBUM, "template_anchor_strategy openAlbum: parseAnchorData Fail");
                return null;
            }
            if (type != EnumC1430380nKG.ANCHOR_AUTO_CUT.getTYPE()) {
                str10 = null;
            }
            C1394430mOH<String, String, Boolean> c1394430mOHLJII = C1394340mO8.LJII(anchorCommonStruct);
            if (!C1394330mO7.LIZ()) {
                if (str10 == null) {
                    str9 = "pugc_template";
                } else {
                    str9 = str10;
                }
            }
            String aid3 = aweme.getAid();
            if (aid3 != null) {
                str8 = aid3;
            }
            String id4 = anchorCommonStruct.getId();
            String strLJIIJJI = C1394340mO8.LJIIJJI(anchorCommonStruct);
            int value3 = EnumC1412640mre.PUGC_TEMPLATE.getValue();
            Music music2 = aweme.getMusic();
            if (music2 != null) {
                musicModelConvertToMusicModel2 = music2.convertToMusicModel();
            } else {
                musicModelConvertToMusicModel2 = null;
            }
            EPTemplateInfo ePTemplateInfoLJIIJ = C1394340mO8.LJIIJ(anchorCommonStruct);
            C1394340mO8.LIZ.getClass();
            Music music3 = aweme.getMusic();
            if (music3 != null) {
                musicFusion2 = music3.getMusicFusion();
            } else {
                musicFusion2 = null;
            }
            MusicInfo musicInfoLJIIIZ = C1394340mO8.LJIIIZ(aweme);
            MusicInfo musicInfoLJIILIIL = C1394340mO8.LJIILIIL(anchorCommonStruct);
            String strLJIIIIZZ = C1394340mO8.LJIIIIZZ(anchorCommonStruct);
            if (c1394430mOHLJII != null) {
                str6 = c1394430mOHLJII.LIZ;
                str7 = c1394430mOHLJII.LIZIZ;
                bool2 = c1394430mOHLJII.LIZJ;
            } else {
                str6 = null;
                str7 = null;
                bool2 = null;
            }
            return new TemplateAnchorConfig(str9, str8, id4, null, value3, strLJIIJJI, 0, 0, bool2, null, null, str, str2, str3, 0, anchorCommonStruct, musicModelConvertToMusicModel2, new CreativeInfo(null, 0, null, 7, null), null, null, ePTemplateInfoLJIIJ, musicFusion2, musicInfoLJIIIZ, musicInfoLJIILIIL, null, null, strLJIIIIZZ, str7, str6);
        }
        C1394430mOH<String, String, Boolean> c1394430mOHLJII2 = C1394340mO8.LJII(anchorCommonStruct);
        if (!C1394330mO7.LIZ()) {
            str9 = "ugc_template";
        }
        String aid4 = aweme.getAid();
        if (aid4 != null) {
            str8 = aid4;
        }
        String id5 = anchorCommonStruct.getId();
        String strLJIIJJI2 = C1394340mO8.LJIIJJI(anchorCommonStruct);
        int value4 = EnumC1412640mre.UGC_TEMPLATE.getValue();
        Music music4 = aweme.getMusic();
        if (music4 != null) {
            musicModelConvertToMusicModel = music4.convertToMusicModel();
        } else {
            musicModelConvertToMusicModel = null;
        }
        EPTemplateInfo ePTemplateInfoLJIIJ2 = C1394340mO8.LJIIJ(anchorCommonStruct);
        C1394340mO8.LIZ.getClass();
        Music music5 = aweme.getMusic();
        if (music5 != null) {
            musicFusion = music5.getMusicFusion();
        } else {
            musicFusion = null;
        }
        if (c1394430mOHLJII2 != null) {
            str4 = c1394430mOHLJII2.LIZ;
            str5 = c1394430mOHLJII2.LIZIZ;
            bool = c1394430mOHLJII2.LIZJ;
        } else {
            str4 = null;
            str5 = null;
            bool = null;
        }
        return new TemplateAnchorConfig(str9, str8, id5, null, value4, strLJIIJJI2, 0, 0, bool, null, null, str, str2, str3, 0, anchorCommonStruct, musicModelConvertToMusicModel, new CreativeInfo(null, 0, null, 7, null), null, null, ePTemplateInfoLJIIJ2, musicFusion, null, null, null, null, null, str5, str4);
    }

    @Override // com.ss.android.ugc.aweme.anchor.service.ITemplateAnchorStrategyService
    public final void LIZIZ(Context context, AnchorCommonStruct anchorCommonStruct, Aweme aweme, String str, String str2, String str3, String str4, MDPRecommendTemplateInfo mDPRecommendTemplateInfo) {
        TemplateAnchorConfig templateAnchorConfigLIZLLL = LIZLLL(anchorCommonStruct, aweme, str, str2, str3);
        if (templateAnchorConfigLIZLLL == null) {
            return;
        }
        templateAnchorConfigLIZLLL.setMdpRecommendTemplateInfo(mDPRecommendTemplateInfo);
        templateAnchorConfigLIZLLL.setMainAnchorType(str4);
        templateAnchorConfigLIZLLL.setFollowedTemplateType(anchorCommonStruct.subType());
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "//template/detail");
        smartRouteBuildRoute.withParam("template_anchor_config", templateAnchorConfigLIZLLL);
        smartRouteBuildRoute.open();
    }

    @Override // com.ss.android.ugc.aweme.anchor.service.ITemplateAnchorStrategyService
    public final void LIZJ(Activity activity, AnchorCommonStruct anchorCommonStruct, Aweme aweme, String str, String str2, String str3, String str4, MDPRecommendTemplateInfo mDPRecommendTemplateInfo) {
        TemplateAnchorConfig templateAnchorConfigLIZLLL = LIZLLL(anchorCommonStruct, aweme, str, str2, str3);
        if (templateAnchorConfigLIZLLL == null) {
            return;
        }
        templateAnchorConfigLIZLLL.setMdpRecommendTemplateInfo(mDPRecommendTemplateInfo);
        anchorCommonStruct.getLogExtra();
        templateAnchorConfigLIZLLL.setMainAnchorType(str4);
        templateAnchorConfigLIZLLL.setFollowedTemplateType(anchorCommonStruct.subType());
        ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncService("template_detail", new C1401830maD(activity, templateAnchorConfigLIZLLL, this, 0));
    }
}
