package wh6;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C01GW;
import X.C076T;
import X.C0DQF;
import X.C0FNV;
import X.C0IJT;
import X.C0PEM;
import X.C1119410fEh;
import X.C1161920gLG;
import X.C118300cf;
import X.C13LC;
import X.C14J2;
import X.C1558520qew;
import X.C1810690xDf;
import X.C1818207Ae;
import X.C1852560yJC;
import X.C1856050yOp;
import X.C1858040yS2;
import X.C1858060yS4;
import X.C1858070yS5;
import X.C1862330yYx;
import X.C1863850ybP;
import X.C1864200yby;
import X.C1888800zFe;
import X.C1888810zFf;
import X.C19EG;
import X.C1DFH;
import X.C20235014Fo;
import X.C2097608Jq;
import X.C2107308Nj;
import X.C2296808zG;
import X.C23250099c;
import X.C326960Crm;
import X.C474500IjA;
import X.C475510Ikn;
import X.C500260Jjc;
import X.C724240Sb0;
import X.C748880TZe;
import X.C780470UjV;
import X.DialogC780480UjW;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import android.app.Dialog;
import android.net.Uri;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.rank.impl.list.controller.RankListController;
import com.bytedance.android.live.rank.impl.list.controller.RankPageController;
import com.bytedance.android.live.rank.impl.list.controller.RankRootController;
import com.bytedance.android.live.rank.impl.list.fragment.list.RankListFragment;
import com.bytedance.android.live.rank.impl.list.viewmodel.RankListViewModel;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSug;
import com.ss.android.ugc.aweme.tako.experiment.TakoMiddlePageSugClickInterceptExperiment;
import com.ss.android.ugc.aweme.tako.model.AIBotInfo;
import com.ss.android.ugc.aweme.tako.multiconversation.sug.TakoMiddlePageSugAssem;
import com.ss.android.ugc.aweme.tako.otherpage.image.create.bottominput.TakoPhotoDisplayCell;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS606S0100000_27;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes28.dex */
public class AbS512S0200000_27 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.AbstractViewOnClickListenerC1637610siV
    public final void LIZ(View view) throws JSONException {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            case 3:
                LIZ$3(this, view);
                break;
            case 4:
                LIZ$4(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AbS512S0200000_27 abS512S0200000_27, View view) {
        if (view != null) {
            AssemVMLazy assemVMLazy = ((TakoPhotoDisplayCell) abS512S0200000_27.l0).LLILZ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = TakoPhotoDisplayCell.LLILZIL;
            assemVMLazy.getValue().setState(new AwS606S0100000_27((C1852560yJC) abS512S0200000_27.l1, 11));
        }
    }

    public static final void LIZ$1(AbS512S0200000_27 abS512S0200000_27, View view) throws JSONException {
        boolean z;
        Long lValueOf;
        Long lValueOf2;
        boolean z2;
        ITakoContextAbility iTakoContextAbilityUp;
        long j;
        C326960Crm c326960Crm;
        TakoSug takoSug;
        String str;
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        String str2;
        C13LC<C1864200yby> c13lcAp0;
        C1864200yby c1864200yby;
        C13LC<C1864200yby> c13lcAp02;
        C1864200yby c1864200yby2;
        String str3;
        Map<String, String> mapLJ;
        Map<String, String> commonParams;
        Map<String, String> commonParams2;
        int iIntValue;
        if (view != null && !((TakoMiddlePageSugAssem) abS512S0200000_27.l0).LLLI) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (((Number) C076T.LIZ.getValue()).intValue() == 1) {
                z = true;
            } else {
                z = false;
            }
            TakoMiddlePageSugAssem takoMiddlePageSugAssem = (TakoMiddlePageSugAssem) abS512S0200000_27.l0;
            long j2 = takoMiddlePageSugAssem.LLLFF;
            String str4 = null;
            if (j2 > 0) {
                lValueOf = Long.valueOf(takoMiddlePageSugAssem.LLLFFI - j2);
            } else if (z) {
                lValueOf = -1L;
            } else {
                lValueOf = null;
            }
            long j3 = ((TakoMiddlePageSugAssem) abS512S0200000_27.l0).LLLFF;
            if (j3 > 0) {
                lValueOf2 = Long.valueOf(jCurrentTimeMillis - j3);
            } else if (z) {
                lValueOf2 = -1L;
            } else {
                lValueOf2 = null;
            }
            if (lValueOf != null) {
                long jLongValue = lValueOf.longValue();
                C01GW c01gw = TakoMiddlePageSugClickInterceptExperiment.LIZIZ;
                if (((TakoMiddlePageSugClickInterceptExperiment.Config) c01gw.getValue()).enable == 1) {
                    Integer numValueOf = Integer.valueOf(((TakoMiddlePageSugClickInterceptExperiment.Config) c01gw.getValue()).thresholdMs);
                    if (numValueOf.intValue() > 0) {
                        iIntValue = numValueOf.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    if (jLongValue < iIntValue) {
                        return;
                    }
                }
            }
            IMessageAbility iMessageAbility = (IMessageAbility) ((TakoMiddlePageSugAssem) abS512S0200000_27.l0).LLJL.getValue();
            if (iMessageAbility != null && iMessageAbility.oj()) {
                z2 = true;
            } else {
                z2 = false;
            }
            String str5 = "";
            if (z2) {
                C1858040yS2 c1858040yS2 = ((TakoMiddlePageSugAssem) abS512S0200000_27.l0).LLJLIL;
                InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL((TakoMiddlePageSugAssem) abS512S0200000_27.l0);
                C14J2 c14j2 = (C14J2) abS512S0200000_27.l1;
                TakoMiddlePageSugAssem takoMiddlePageSugAssem2 = (TakoMiddlePageSugAssem) abS512S0200000_27.l0;
                Map mapLJIIL = C2097608Jq.LJIIL(takoMiddlePageSugAssem2.sp(takoMiddlePageSugAssem2.LLJLIL), ((TakoMiddlePageSugAssem) abS512S0200000_27.l0).op());
                long j4 = ((TakoMiddlePageSugAssem) abS512S0200000_27.l0).LLLF;
                if (j4 > 0) {
                    j = jCurrentTimeMillis - j4;
                } else {
                    j = 0;
                }
                C1858060yS4.LJ(c1858040yS2, interfaceC665370Q7zLJIIL, c14j2, null, mapLJIIL, Long.valueOf(j), 4);
                TakoMiddlePageSugAssem takoMiddlePageSugAssem3 = (TakoMiddlePageSugAssem) abS512S0200000_27.l0;
                takoMiddlePageSugAssem3.getClass();
                if (((Number) C1818207Ae.LIZ.getValue()).intValue() == 0 && lValueOf != null && lValueOf2 != null) {
                    ITakoContextAbility iTakoContextAbilityUp2 = takoMiddlePageSugAssem3.up();
                    if (iTakoContextAbilityUp2 != null && (commonParams2 = iTakoContextAbilityUp2.getCommonParams()) != null) {
                        str3 = (String) C1856050yOp.LIZIZ("process_id", commonParams2);
                    } else {
                        str3 = null;
                    }
                    C1858040yS2 c1858040yS22 = takoMiddlePageSugAssem3.LLJLIL;
                    if (c1858040yS22 != null) {
                        TakoSug takoSug2 = c1858040yS22.LLILLJJLI;
                        if (takoSug2 != null && takoSug2.sugShowType == 103) {
                            mapLJ = C1858060yS4.LIZ(c1858040yS22, str3, null);
                        } else {
                            mapLJ = C1858060yS4.LIZ(c1858040yS22, null, null);
                        }
                    } else {
                        mapLJ = C2097608Jq.LJ();
                    }
                    Map mapLJIIL2 = C2097608Jq.LJIIL(C2097608Jq.LJIIL(mapLJ, takoMiddlePageSugAssem3.sp(takoMiddlePageSugAssem3.LLJLIL)), takoMiddlePageSugAssem3.op());
                    C1862330yYx c1862330yYx = C1862330yYx.LIZ;
                    int i = takoMiddlePageSugAssem3.LLLFZ;
                    ITakoContextAbility iTakoContextAbilityUp3 = takoMiddlePageSugAssem3.up();
                    if (iTakoContextAbilityUp3 != null) {
                        commonParams = iTakoContextAbilityUp3.getCommonParams();
                    } else {
                        commonParams = null;
                    }
                    c1862330yYx.getClass();
                    C20235014Fo c20235014Fo = C1862330yYx.LIZLLL;
                    JSONObject jSONObject = new JSONObject();
                    C1862330yYx.LLII(jSONObject, commonParams);
                    C1862330yYx.LLII(jSONObject, mapLJIIL2);
                    jSONObject.put("click_count", i);
                    jSONObject.put("click_event_duration", lValueOf.longValue());
                    jSONObject.put("click_handle_duration", lValueOf2.longValue());
                    c20235014Fo.LIZIZ("tikbot_sug_mistouch_mob", jSONObject);
                }
                TakoMiddlePageSugAssem takoMiddlePageSugAssem4 = (TakoMiddlePageSugAssem) abS512S0200000_27.l0;
                takoMiddlePageSugAssem4.LLLF = 0L;
                takoMiddlePageSugAssem4.LLLFF = 0L;
                takoMiddlePageSugAssem4.LLLFFI = 0L;
                takoMiddlePageSugAssem4.LLLFZ = 0;
                C1858040yS2 c1858040yS23 = takoMiddlePageSugAssem4.LLJLIL;
                if (c1858040yS23 == null || (c326960Crm = c1858040yS23.LL) == null || (takoSug = c326960Crm.LLILLJJLI) == null || takoSug.LJIIL) {
                    return;
                }
                ITakoContextAbility iTakoContextAbilityUp4 = takoMiddlePageSugAssem4.up();
                if (iTakoContextAbilityUp4 == null || (c13lcAp02 = iTakoContextAbilityUp4.Ap0()) == null || (c1864200yby2 = (C1864200yby) c13lcAp02.LIZIZ()) == null || (str = c1864200yby2.LL) == null) {
                    str = "";
                }
                ITakoContextAbility iTakoContextAbilityUp5 = takoMiddlePageSugAssem4.up();
                if (iTakoContextAbilityUp5 != null && (c13lcAp0 = iTakoContextAbilityUp5.Ap0()) != null && (c1864200yby = (C1864200yby) c13lcAp0.LIZIZ()) != null) {
                    str4 = c1864200yby.LLILLJJLI;
                }
                ITakoContextAbility iTakoContextAbilityUp6 = takoMiddlePageSugAssem4.up();
                if (iTakoContextAbilityUp6 == null || (c13lcT71 = iTakoContextAbilityUp6.T71()) == null || (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) == null) {
                    return;
                }
                C1862330yYx c1862330yYx2 = C1862330yYx.LIZ;
                String str6 = c1863850ybP.LL;
                if (str6 == null) {
                    str6 = "";
                }
                String str7 = c1863850ybP.LLILLJJLI;
                if (str7 == null) {
                    str7 = "";
                }
                String str8 = c1863850ybP.LLILZIL;
                if (str8 == null) {
                    str8 = "";
                }
                if (C1858070yS5.LIZ(c1858040yS23.LLILLJJLI) != null) {
                    str2 = "after_feed";
                } else {
                    str2 = "general_sug";
                }
                String str9 = c1863850ybP.LLJ;
                if (str9 == null) {
                    str9 = "";
                }
                if (str4 != null) {
                    str5 = str4;
                }
                C1862330yYx.LJJZ(1536, c1862330yYx2, str6, str7, str8, str, c1863850ybP.LLIZ, str2, str9, str5, "click_recommendedword", null);
                return;
            }
            TakoMiddlePageSugAssem takoMiddlePageSugAssem5 = (TakoMiddlePageSugAssem) abS512S0200000_27.l0;
            takoMiddlePageSugAssem5.getClass();
            C19EG c19egLIZ = C724240Sb0.LIZ(takoMiddlePageSugAssem5);
            if (c19egLIZ == null || (iTakoContextAbilityUp = takoMiddlePageSugAssem5.up()) == null) {
                return;
            }
            C0DQF c0dqf = C0DQF.LIZ;
            View contentView = takoMiddlePageSugAssem5.getContentView();
            Map<String, String> commonParams3 = iTakoContextAbilityUp.getCommonParams();
            long j5 = ((C1863850ybP) iTakoContextAbilityUp.T71().LIZIZ()).LLJJ;
            int i2 = ((C1863850ybP) iTakoContextAbilityUp.T71().LIZIZ()).LLJJI;
            String str10 = ((C1863850ybP) iTakoContextAbilityUp.T71().LIZIZ()).LLJJIII;
            if (str10 != null) {
                str5 = str10;
            }
            c0dqf.LJIIL(c19egLIZ, contentView, commonParams3, new AIBotInfo(j5, str5, null, i2, 0, 0, null, null, false, false, false, null, null, null, null, null, null, null, false, null, null, null, null, 8388596, null));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$2(wh6.AbS512S0200000_27 r5, android.view.View r6) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wh6.AbS512S0200000_27.LIZ$2(wh6.AbS512S0200000_27, android.view.View):void");
    }

    public static final void LIZ$3(AbS512S0200000_27 abS512S0200000_27, View view) {
        if (view != null) {
            C1888810zFf c1888810zFf = (C1888810zFf) abS512S0200000_27.l0;
            List list = (List) abS512S0200000_27.l1;
            c1888810zFf.getClass();
            if (!list.isEmpty() && !c1888810zFf.LLJJ) {
                c1888810zFf.LLJJ = true;
                DialogC780480UjW dialogC780480UjWLIZ = new C780470UjV(c1888810zFf.LLILLJJLI.getContext()).LIZ();
                C0FNV.LIZJ(dialogC780480UjWLIZ);
                C118300cf c118300cf = new C118300cf();
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1888800zFe(list, c1888810zFf, dialogC780480UjWLIZ, c118300cf, null), 3);
            }
        }
    }

    public static final void LIZ$4(AbS512S0200000_27 abS512S0200000_27, View view) {
        DataChannel dataChannelLJ;
        Fragment fragment;
        Uri uriBuild;
        Window window;
        View decorView;
        RankListViewModel rankListViewModelLJIIIZ;
        Window window2;
        View decorView2;
        RankPageController rankPageController;
        RankRootController rankRootController;
        if (view != null && (dataChannelLJ = C475510Ikn.LJ((RankListFragment) abS512S0200000_27.l0)) != null && dataChannelLJ.gg0(C748880TZe.class) != null) {
            RankListController rankListController = ((RankListFragment) abS512S0200000_27.l0).LLILZIL;
            RankListV2Response.RankView rankView = null;
            if (rankListController != null && (rankPageController = rankListController.LLILZIL) != null && (rankRootController = rankPageController.LLILZLL) != null) {
                fragment = rankRootController.LLILLJJLI;
            } else {
                fragment = null;
            }
            if (fragment instanceof LiveDialogFragment) {
                Uri uri = UriProtector.parse(((RankListV2Response.BottomBarButton) abS512S0200000_27.l1).schemaUrl);
                int height = Integer.MIN_VALUE;
                if (UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "height") != null) {
                    Dialog dialog = ((DialogFragment) fragment).getDialog();
                    if (dialog != null && (window2 = dialog.getWindow()) != null && (decorView2 = window2.getDecorView()) != null) {
                        height = decorView2.getHeight();
                    }
                    uriBuild = C500260Jjc.LJJL(uri, "height", String.valueOf(height));
                } else {
                    Uri.Builder builderBuildUpon = uri.buildUpon();
                    Dialog dialog2 = ((DialogFragment) fragment).getDialog();
                    if (dialog2 != null && (window = dialog2.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                        height = decorView.getHeight();
                    }
                    uriBuild = builderBuildUpon.appendQueryParameter("height", String.valueOf(height)).build();
                }
                ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(((RankListFragment) abS512S0200000_27.l0).getContext(), uriBuild);
                DataChannel dataChannelLJ2 = C475510Ikn.LJ((RankListFragment) abS512S0200000_27.l0);
                RankTypeV2 rankTypeV2 = ((RankListFragment) abS512S0200000_27.l0).LLILLL.LIZIZ;
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_rank_sticker_entertance_click");
                c474500IjALIZ.LJIJJLI(dataChannelLJ2);
                C1119410fEh.LIZJ(c474500IjALIZ, dataChannelLJ2, rankTypeV2);
                c474500IjALIZ.LIZ();
                C1810690xDf c1810690xDf = C1810690xDf.LIZ;
                DataChannel dataChannelLJ3 = C475510Ikn.LJ((RankListFragment) abS512S0200000_27.l0);
                String str = ((RankListV2Response.BottomBarButton) abS512S0200000_27.l1).buttonType;
                RankListFragment rankListFragment = (RankListFragment) abS512S0200000_27.l0;
                String str2 = rankListFragment.LLILLL.LIZIZ.rankName;
                RankListController rankListController2 = rankListFragment.LLILZIL;
                if (rankListController2 != null && (rankListViewModelLJIIIZ = rankListController2.LJIIIZ()) != null) {
                    rankView = rankListViewModelLJIIIZ.LLILLJJLI;
                }
                c1810690xDf.getClass();
                C1810690xDf.LJIIJ(dataChannelLJ3, str, str2, "click", "", rankView);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS512S0200000_27(C1888810zFf c1888810zFf, List list, int i) {
        super(1000L);
        this.$t = i;
        this.l0 = c1888810zFf;
        this.l1 = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS512S0200000_27(Object obj, Object obj2, int i) {
        super(300L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
