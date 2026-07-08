package com.ss.android.ugc.aweme.lemon.impl;

import X.C098200Yq;
import X.C0AMF;
import X.C0CCZ;
import X.C0J80;
import X.C0OEE;
import X.C0RF0;
import X.C0SGG;
import X.C0SZL;
import X.C0TRR;
import X.C0WZX;
import X.C1052320dUU;
import X.C1065120dp8;
import X.C1065140dpA;
import X.C1065160dpC;
import X.C1065190dpF;
import X.C1065200dpG;
import X.C1065220dpI;
import X.C1065280dpO;
import X.C1065360dpW;
import X.C10G1;
import X.C1701330uNH;
import X.C189200o6;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2344009Gk;
import X.C2344809Gs;
import X.C786410Ut5;
import X.C824400WVq;
import X.InterfaceC1065240dpK;
import X.InterfaceC1065250dpL;
import X.InterfaceC1254080iju;
import X.InterfaceC691450RAh;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.router.util.Logger;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.api.ISandboxService;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.cardinsert.CardInsertResultInfo;
import com.ss.android.ugc.aweme.lemon.ILemonService;
import com.ss.android.ugc.aweme.lemon.card.Lemon8ServiceInitTask;
import com.ss.android.ugc.aweme.lemon.feed.ui.LemonGuideCardViewHolder;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.feed.platform.cardinsert.data.CardShowInfo;
import com.ss.android.ugc.feed.platform.cardinsert.data.CardTypeRequest;
import com.ss.android.ugc.feed.platform.cardinsert.data.FeedCardInsertData;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes17.dex */
public final class LemonServiceImpl implements ILemonService {
    @Override // com.ss.android.ugc.aweme.lemon.ILemonService
    public final C0SGG LJFF() {
        return C1065280dpO.LIZ(false);
    }

    @Override // com.ss.android.ugc.aweme.lemon.ILemonService
    public final void LJIIJ() {
        C1065280dpO.LIZ(true);
    }

    @Override // com.ss.android.ugc.aweme.lemon.ILemonService
    public final C0CCZ LIZJ() {
        return new Lemon8ServiceInitTask();
    }

    @Override // com.ss.android.ugc.aweme.lemon.ILemonService
    public final C0TRR LJ() {
        return new C0TRR() { // from class: X.0dUc
            @Override // X.C0TRR
            public final int LIZIZ() {
                return 0;
            }

            public static final CardInsertResultInfo LIZLLL(List list) {
                if (list != null && !list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        CardInsertResultInfo cardInsertResultInfo = (CardInsertResultInfo) it2.next();
                        if (cardInsertResultInfo.cardType == 9) {
                            return cardInsertResultInfo;
                        }
                    }
                    return null;
                }
                return null;
            }

            @Override // X.C0TRR
            public final List<CardTypeRequest> LIZJ(C0TRR c0trr, FeedCardInsertData feedCardInsertData, List<CardInsertResultInfo> list) {
                ArrayList arrayList;
                List<CardShowInfo> list2 = feedCardInsertData.showInfoList;
                if (list2 == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList();
                    int i = feedCardInsertData.LIZ;
                    for (CardShowInfo cardShowInfo : list2) {
                        if (cardShowInfo.ruleType == 0 && 9 == cardShowInfo.cardType) {
                            C1052320dUU.LIZ.getClass();
                            if (System.currentTimeMillis() - C1052420dUe.LIZ.getLong("fyp_big_card_not_interested_time", 0L) >= ((long) ((Number) C1052320dUU.LIZJ.getValue()).intValue()) * 60 * 60 * 1000) {
                                CardInsertResultInfo cardInsertResultInfoLIZLLL = LIZLLL(list);
                                C20550115b9 c20550115b9 = C20550115b9.LIZ;
                                Integer numValueOf = Integer.valueOf(i);
                                c20550115b9.getClass();
                                if (EnumC20550015b8.STATE_FREQ_SUCCESS == C20550115b9.LJIIL(c0trr, 9, numValueOf, cardShowInfo, cardInsertResultInfoLIZLLL)) {
                                    arrayList.add(new CardTypeRequest(9, "", ""));
                                }
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        return arrayList;
                    }
                }
                List<CardShowInfo> list3 = feedCardInsertData.showInfoList;
                if (list3 != null) {
                    final int i2 = feedCardInsertData.LIZ;
                    for (final CardShowInfo cardShowInfo2 : list3) {
                        if (cardShowInfo2.ruleType == 0 && 9 == cardShowInfo2.cardType) {
                            final CardInsertResultInfo cardInsertResultInfoLIZLLL2 = LIZLLL(list);
                            C692040RCo.LIZ.add(new C0RAI() { // from class: X.0dUd
                                @Override // X.C0RAI
                                public final void LIZ() {
                                    C20550115b9 c20550115b92 = C20550115b9.LIZ;
                                    int i3 = i2;
                                    CardShowInfo cardShowInfo3 = cardShowInfo2;
                                    CardInsertResultInfo cardInsertResultInfo = cardInsertResultInfoLIZLLL2;
                                    c20550115b92.getClass();
                                    C20550115b9.LJIIZILJ(9, i3, cardShowInfo3, cardInsertResultInfo);
                                    C692040RCo.LIZ.remove(this);
                                }
                            });
                        }
                    }
                }
                return arrayList;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.lemon.ILemonService
    public final InterfaceC1254080iju LJIIIIZZ() {
        return new InterfaceC1254080iju() { // from class: X.0dpD
            public Boolean LIZ;
            public boolean LIZIZ = true;

            @Override // X.InterfaceC1254080iju
            public final boolean LIZ() {
                C10G1.LIZ.getClass();
                return C10G1.LIZLLL(true);
            }

            {
                C0OEE c0oee = C0OEE.LIZ;
                if (C0OEE.LIZJ) {
                    LIZLLL(C0OEE.LIZLLL);
                    if (C0OEE.LIZJ) {
                        C0OEE.LIZJ = false;
                        C0OEE.LIZIZ.removeCallbacks(C0OEE.LJ);
                        if (EventBus.LIZLLL().LJIIJ(c0oee)) {
                            EventBus.LIZLLL().LJJI(c0oee);
                        }
                    }
                }
            }

            @Override // X.InterfaceC1254080iju
            public final void LIZIZ(final C0TGX c0tgx) {
                PopupManager.LJIIZILJ(new AbstractC20660815t0(c0tgx) { // from class: X.10G4
                    public final int LL = 610;

                    @Override // X.AbstractC20656215sG
                    public final boolean canShow() {
                        return true;
                    }

                    @Override // X.InterfaceC20660515sx
                    public final int getPriority() {
                        return this.LL;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
                    /* JADX WARN: Removed duplicated region for block: B:27:0x0092  */
                    /* JADX WARN: Removed duplicated region for block: B:30:0x00c7  */
                    /* JADX WARN: Removed duplicated region for block: B:45:0x014d  */
                    /* JADX WARN: Removed duplicated region for block: B:46:0x0150  */
                    /* JADX WARN: Removed duplicated region for block: B:69:0x0195  */
                    @Override // X.InterfaceC20659015si
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LJFF(X.C688120Qyw r18, X.C20656615sK r19) {
                        /*
                            Method dump skipped, instruction units count: 408
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C10G4.LJFF(X.0Qyw, X.15sK):void");
                    }
                }, new C1668306g5("profile_lemon8_popup_for_content_sync"));
            }

            @Override // X.InterfaceC1254080iju
            public final boolean LIZJ(boolean z) {
                boolean z2;
                if (!z) {
                    if (this.LIZIZ) {
                        this.LIZIZ = false;
                    } else if (!Intrinsics.LJFF(this.LIZ, Boolean.FALSE)) {
                        z2 = true;
                    }
                    z2 = false;
                } else {
                    z2 = false;
                }
                this.LIZ = Boolean.valueOf(z);
                if (z2) {
                    C10G1.LIZ.getClass();
                    if (C10G1.LIZLLL(false)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }

            @Override // X.InterfaceC1254080iju
            public final void LIZLLL(Object obj) {
                boolean z;
                long jCurrentTimeMillis;
                if (obj instanceof C1445970njP) {
                    C1445970njP c1445970njP = (C1445970njP) obj;
                    PublishModel publishModel = c1445970njP.LJIIJJI;
                    if (publishModel != null && publishModel.isStoryPublish) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (c1445970njP.LIZ == 10 && !z) {
                        if (publishModel != null) {
                            jCurrentTimeMillis = publishModel.LIZJ;
                        } else {
                            jCurrentTimeMillis = System.currentTimeMillis();
                        }
                        C10G1 c10g1 = C10G1.LIZ;
                        Long lValueOf = Long.valueOf(jCurrentTimeMillis);
                        c10g1.getClass();
                        C10G1.LIZJ = true;
                        C1065220dpI c1065220dpI = C1065220dpI.LIZ;
                        c1065220dpI.setFeature("has_publish_in_session", Boolean.TRUE);
                        C1065220dpI.LIZIZ = lValueOf;
                        c1065220dpI.setFeature("last_publish_interval", lValueOf, false);
                    }
                }
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.lemon.ILemonService
    public final void LJIIL() {
        C10G1.LIZ.getClass();
        C10G1.LIZJ = false;
        C1065220dpI c1065220dpI = C1065220dpI.LIZ;
        c1065220dpI.setFeature("has_publish_in_session", Boolean.FALSE);
        C1065220dpI.LIZIZ = null;
        c1065220dpI.setFeature("last_publish_interval", null, false);
        C10G1.LJ = false;
    }

    @Override // com.ss.android.ugc.aweme.lemon.ILemonService
    public final void LJIILIIL() {
        Keva.getRepo("feed_banner_lemon8").storeInt("key_one_circle_no_action_count", 0);
    }

    public LemonServiceImpl() {
        C0OEE.LIZJ = true;
        C786410Ut5.LJLIIL(200L, C0OEE.LIZIZ, C0OEE.LJ);
    }

    @Override // com.ss.android.ugc.aweme.lemon.ILemonService
    public final void LJII() {
        C0J80.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.lemon.ILemonService
    public final void LIZIZ(String str) {
        C1052320dUU.LIZ(C1052320dUU.LIZ);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0RAZ] */
    @Override // com.ss.android.ugc.aweme.lemon.ILemonService
    public final Object LIZLLL(InterfaceC691450RAh interfaceC691450RAh) {
        if (!(interfaceC691450RAh instanceof C0RF0)) {
            return null;
        }
        return new LemonGuideCardViewHolder((C0RF0) interfaceC691450RAh, new C0SZL<LemonGuideCardViewHolder, VideoItemParams>() { // from class: X.0RAZ
            @Override // X.C0SZL
            public final String LIZLLL(VideoItemParams videoItemParams) {
                String aid = videoItemParams.getAweme().getAid();
                if (aid == null) {
                    return "";
                }
                return aid;
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.lemon.ILemonService
    public final View LJIIIZ(Context context) {
        return C786410Ut5.Sd(R.layout.da8, C786410Ut5.ne(context), null);
    }

    @Override // com.ss.android.ugc.aweme.lemon.ILemonService
    public final void LJI(String str, String str2) {
        new Object() { // from class: X.0dpN
        }.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("block_reason", str);
        c2344009Gk.LJIIIIZZ("enter_group_id", str2);
        C20684815ws.LJIILLIIL("rd_lemon8_banner_block", c2344009Gk.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v8 */
    @Override // com.ss.android.ugc.aweme.lemon.ILemonService
    public final void LJIIJJI(final Activity activity, final Map<String, String> map) throws Throwable {
        ?? r8;
        Object c098200Yq;
        String str;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        String str2;
        String strLIZIZ;
        Object c098200Yq2;
        String str3 = C1065200dpG.LIZ().lemon8PkgName;
        AwS595S0100000_16 awS595S0100000_16 = new AwS595S0100000_16((Map) map, (Map<String, String>) 104);
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            awS595S0100000_16.invoke(e);
        }
        if (C786410Ut5.Y3(activity.getPackageManager(), str3, 1) != null) {
            r8 = 1;
        } else {
            r8 = 0;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[LemonServiceImpl] openApp isLemon8Installed = ");
        sbLIZ.append((boolean) r8);
        Logger.d("Lemon8AppIntro", C2188811AlT.LIZIZ(sbLIZ));
        C1065120dp8 c1065120dp8 = C1065120dp8.LIZ;
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        String str4 = (String) linkedHashMap.get("pid");
        String str5 = "";
        if (str4 == null) {
            str4 = "";
        }
        String str6 = (String) linkedHashMap.get("amp_extra");
        if (str6 == null) {
            str6 = "";
        }
        c1065120dp8.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ(Scene.SCENE_SERVICE, str4);
        c2344009Gk.LIZJ(r8, "is_installed");
        c2344009Gk.LJIIIIZZ("ampExtra", str6);
        C20684815ws.LJIILLIIL("lemon8_ug_is_lemon8_installed", c2344009Gk.LIZ);
        if (r8 != 0) {
            new Object() { // from class: X.0dpM
            };
            String str7 = (String) linkedHashMap.get("schema");
            if (str7 == null) {
                str7 = C1065200dpG.LIZ().lemon8DefaultSchema;
                z2 = true;
            } else {
                z2 = false;
            }
            String str8 = (String) linkedHashMap.get("pid");
            if (str8 == null) {
                str8 = "lemon8_intro_default";
                z3 = true;
            } else {
                z3 = false;
            }
            String str9 = (String) linkedHashMap.get("amp_extra");
            if (str9 == null) {
                z4 = true;
            } else {
                str5 = str9;
                z4 = false;
            }
            if (!z2 && !z3 && !z4) {
                str2 = str8;
            } else {
                str2 = str8;
                C1065120dp8.LIZJ(c1065120dp8, str8, "error_miss_param", null, Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z4), null, 136);
            }
            StringBuilder sb = new StringBuilder("pid=");
            sb.append(str2);
            sb.append("&amp_extra=");
            sb.append(Uri.encode(str5));
            if (str7.length() <= 0 || !u.LJJIIJZLJL(str7, C1065200dpG.LIZ().lemon8Schema, false)) {
                str2 = str2;
                C1065120dp8.LIZJ(c1065120dp8, str2, "error_schema_illegal", null, null, null, null, str7, 120);
                str7 = C1065200dpG.LIZ().lemon8DefaultSchema;
            }
            if (a0.LJJIIZI(str7, "?", false)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str7);
                sbLIZ2.append('&');
                sbLIZ2.append((Object) sb);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(str7);
                sbLIZ3.append('?');
                sbLIZ3.append((Object) sb);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("[DeeplinkOpenStrategy] finalSchema: ");
            sbLIZ4.append(strLIZIZ);
            Logger.d("Lemon8AppIntro", C2188811AlT.LIZIZ(sbLIZ4));
            try {
                Intent intent = new Intent("android.intent.action.VIEW", UriProtector.parse(strLIZIZ)).setPackage(C1065200dpG.LIZ().lemon8PkgName);
                ISandboxService iSandboxServiceLIZ = C824400WVq.LIZ();
                if (iSandboxServiceLIZ != null) {
                    iSandboxServiceLIZ.appendDataFlowId(intent, 1207962113);
                }
                RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(activity, intent, "Context_startActivity_1");
                C1701330uNH.LIZ(intent, activity);
                C2204961BRm.LJIILLIIL(activity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOatbpDAkjurH+WqEV2PXjx93UPQBTFpwl8oQpCiyhbkjm4HjTuplsWQ", null));
                c098200Yq2 = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq2 = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq2);
            if (thM5exceptionOrNullimpl != null) {
                C1065120dp8.LIZJ(C1065120dp8.LIZ, str2, "error_open_deeplink", thM5exceptionOrNullimpl.getMessage(), null, null, null, null, 240);
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("[DeeplinkOpenStrategy] openLemon8App start activity failed ");
                sbLIZ5.append(thM5exceptionOrNullimpl.getMessage());
                Logger.d("Lemon8AppIntro", C2188811AlT.LIZIZ(sbLIZ5));
                C2344809Gs.LJI(thM5exceptionOrNullimpl);
                return;
            }
            return;
        }
        boolean zBooleanValue = ((Boolean) C0AMF.LIZ.getValue()).booleanValue();
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("[LemonServiceImpl] openApp enableGpMiniCard = ");
        sbLIZ6.append(zBooleanValue);
        Logger.d("Lemon8AppIntro", C2188811AlT.LIZIZ(sbLIZ6));
        if (zBooleanValue) {
            Intent intentLIZ = C1065120dp8.LIZ(activity.getPackageName(), C1065200dpG.LIZ().marketUrl);
            try {
                if (intentLIZ.resolveActivity(activity.getPackageManager()) != null) {
                    z = true;
                } else {
                    z = false;
                }
                c098200Yq = Boolean.valueOf(z);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Boolean bool = Boolean.FALSE;
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = bool;
            }
            boolean zBooleanValue2 = ((Boolean) c098200Yq).booleanValue();
            Logger.d("Lemon8AppIntro", "[LemonServiceImpl] openApp canHandleGPMiniCard = " + zBooleanValue2);
            final String str10 = (String) linkedHashMap.get("amp_extra");
            C1065120dp8 c1065120dp82 = C1065120dp8.LIZ;
            String str11 = (String) linkedHashMap.get("pid");
            if (str11 == null) {
                str11 = "";
            }
            if (str10 == null) {
                str = "";
            } else {
                str = str10;
            }
            c1065120dp82.getClass();
            C1065120dp8.LJ(str11, str);
            if (zBooleanValue2) {
                C2344009Gk c2344009Gk2 = new C2344009Gk();
                c2344009Gk2.LJ(Boolean.TRUE, "is_use_card");
                C20684815ws.LJIILLIIL("lemon8_is_use_mini_card", c2344009Gk2.LIZ);
                new C1065160dpC(intentLIZ, new InterfaceC1065250dpL() { // from class: X.0dpJ
                    @Override // X.InterfaceC1065250dpL
                    public final String LIZ() {
                        return "lemon8_intro_default";
                    }

                    @Override // X.InterfaceC1065250dpL
                    public final String getScene() {
                        return "notice";
                    }
                }, new InterfaceC1065240dpK() { // from class: X.0dpB
                    @Override // X.InterfaceC1065240dpK
                    public final void LIZ() {
                        C1065120dp8 c1065120dp83 = C1065120dp8.LIZ;
                        String str12 = map.get("pid");
                        if (str12 == null) {
                            str12 = "";
                        }
                        String str13 = str10;
                        c1065120dp83.getClass();
                        C1065120dp8.LIZLLL("failure", str12, "open_error", str13);
                        new C1065140dpA();
                        C1065140dpA.LIZ(activity, map);
                    }

                    @Override // X.InterfaceC1065240dpK
                    public final void LIZIZ() {
                        C1065120dp8 c1065120dp83 = C1065120dp8.LIZ;
                        String str12 = map.get("pid");
                        if (str12 == null) {
                            str12 = "";
                        }
                        String str13 = str10;
                        c1065120dp83.getClass();
                        C1065120dp8.LIZLLL("success", str12, null, str13);
                    }
                }).LIZ(activity, map);
                return;
            }
            String str12 = (String) linkedHashMap.get("pid");
            if (str12 != null) {
                str5 = str12;
            }
            C1065120dp8.LIZLLL("failure", str5, "no_capability", str10);
            C2344009Gk c2344009Gk3 = new C2344009Gk();
            c2344009Gk3.LJ(bool, "is_use_card");
            C20684815ws.LJIILLIIL("lemon8_is_use_mini_card", c2344009Gk3.LIZ);
            new C1065140dpA();
            C1065140dpA.LIZ(activity, map);
            return;
        }
        new C1065140dpA();
        C1065140dpA.LIZ(activity, map);
    }

    @Override // com.ss.android.ugc.aweme.lemon.ILemonService
    public final void LIZ(Activity activity, C1065360dpW c1065360dpW, Map map, C1065190dpF c1065190dpF) throws Throwable {
        Object c098200Yq;
        boolean z;
        C1065120dp8 c1065120dp8 = C1065120dp8.LIZ;
        String packageName = activity.getPackageName();
        String str = C1065200dpG.LIZ().marketUrl;
        c1065120dp8.getClass();
        Intent intentLIZ = C1065120dp8.LIZ(packageName, str);
        try {
            if (intentLIZ.resolveActivity(activity.getPackageManager()) != null) {
                z = true;
            } else {
                z = false;
            }
            c098200Yq = Boolean.valueOf(z);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = Boolean.FALSE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = bool;
        }
        boolean zBooleanValue = ((Boolean) c098200Yq).booleanValue();
        C1065120dp8 c1065120dp82 = C1065120dp8.LIZ;
        LinkedHashMap linkedHashMap = (LinkedHashMap) map;
        String str2 = (String) linkedHashMap.get("pid");
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        String str4 = (String) linkedHashMap.get("amp_extra");
        if (str4 != null) {
            str3 = str4;
        }
        c1065120dp82.getClass();
        C1065120dp8.LJ(str2, str3);
        if (zBooleanValue) {
            new C1065160dpC(intentLIZ, c1065360dpW, c1065190dpF).LIZ(activity, map);
        } else {
            Logger.d("Lemon8AppIntro", "[downloadAppThroughGpMiniCard] can't resolve activity");
            c1065190dpF.LIZJ();
        }
    }
}
