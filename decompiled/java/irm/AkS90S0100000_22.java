package irm;

import X.AbstractViewOnClickListenerC1173120gdK;
import X.C0CHQ;
import X.C0EYP;
import X.C0EZH;
import X.C0LAB;
import X.C0V0I;
import X.C1168780gWK;
import X.C1390380mHk;
import X.C1403960mde;
import X.C1409970mnL;
import X.C1415620mwS;
import X.C1418970n1r;
import X.C1421110n5J;
import X.C1421140n5M;
import X.C1426830nEX;
import X.C1427510nFd;
import X.C1443030nef;
import X.C1443400nfG;
import X.C1444940nhk;
import X.C1445410niV;
import X.C1447160nlK;
import X.C1447200nlO;
import X.C1447250nlT;
import X.C1448790nnx;
import X.C1450610nqt;
import X.C1453280nvC;
import X.C1453550nvd;
import X.C1453580nvg;
import X.C1456140nzo;
import X.C1457580o28;
import X.C1457700o2K;
import X.C1457720o2M;
import X.C1457830o2X;
import X.C1457870o2b;
import X.C1459630o5R;
import X.C1464300oCy;
import X.C1464390oD7;
import X.C1623740sM8;
import X.C1664740tQG;
import X.C201955140j;
import X.C20684815ws;
import X.C349930Dnj;
import X.C857680Xkk;
import X.EnumC359990E9l;
import X.InterfaceC1410010mnP;
import X.InterfaceC1417050myl;
import X.InterfaceC1419190n2D;
import X.InterfaceC1421120n5K;
import X.InterfaceC1426290nDf;
import X.InterfaceC1446740nke;
import X.InterfaceC1447490nlr;
import X.InterfaceC1451520nsM;
import X.InterfaceC1452170ntP;
import X.InterfaceC1453560nve;
import X.InterfaceC1455860nzM;
import X.InterfaceC1457250o1b;
import X.InterfaceC2217461Bqa;
import Y.AObjectS204S0300000_22;
import android.graphics.Bitmap;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAdjustInfo;
import com.ss.android.ugc.aweme.creative.model.edit.SingleAdjustInfo;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.publish.PublishCustomCoverModel;
import com.ss.android.ugc.aweme.discover.model.suggest.Word;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.ftc.pages.FTCChooseCoverFragment;
import com.ss.android.ugc.aweme.image.adjust.ImageAdjustViewModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.services.editeffect.ISearchSugHelper;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity;
import com.ss.android.ugc.aweme.shortvideo.vechoosecover.VEChooseVideoCoverFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS423S0200000_22;
import kotlin.jvm.internal.Intrinsics;
import lth.o;

/* JADX INFO: loaded from: classes23.dex */
public class AkS90S0100000_22 extends AbstractViewOnClickListenerC1173120gdK {
    public final int $t;
    public Object l0;

    @Override // X.AbstractViewOnClickListenerC1173120gdK
    public final void LIZ(View view) {
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
            case 5:
                LIZ$5(this, view);
                break;
            case 6:
                LIZ$6(this, view);
                break;
            case 7:
                LIZ$7(this, view);
                break;
            case 8:
                LIZ$8(this, view);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LIZ$9(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LIZ$10(this, view);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LIZ$11(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                LIZ$12(this, view);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                LIZ$13(this, view);
                break;
            case 14:
                LIZ$14(this, view);
                break;
            case 15:
                LIZ$15(this, view);
                break;
            case 16:
                LIZ$16(this, view);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                LIZ$17(this, view);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                LIZ$18(this, view);
                break;
            case 19:
                LIZ$19(this, view);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                LIZ$20(this, view);
                break;
            case 21:
                LIZ$21(this, view);
                break;
            case 22:
                LIZ$22(this, view);
                break;
            case 23:
                LIZ$23(this, view);
                break;
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                LIZ$24(this, view);
                break;
            case 25:
                LIZ$25(this, view);
                break;
            case 26:
                LIZ$26(this, view);
                break;
            case 27:
                LIZ$27(this, view);
                break;
            case 28:
                LIZ$28(this, view);
                break;
            case 29:
                LIZ$29(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public AkS90S0100000_22(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(AkS90S0100000_22 akS90S0100000_22, View view) {
        String str;
        String id;
        String strSugMobType;
        C1427510nFd c1427510nFd = (C1427510nFd) akS90S0100000_22.l0;
        SearchSugEntity searchSugEntity = c1427510nFd.LLILZIL;
        if (searchSugEntity != null) {
            InterfaceC1426290nDf interfaceC1426290nDf = c1427510nFd.LLILLJJLI;
            if (interfaceC1426290nDf != null) {
                ISearchSugHelper iSearchSugHelper = c1427510nFd.LLILLL;
                if (iSearchSugHelper != null && !iSearchSugHelper.isSugNoCache(searchSugEntity.LIZIZ)) {
                    str = "editing_effect_sug";
                } else {
                    str = "editing_effect_sug_cache";
                }
                String str2 = searchSugEntity.content;
                int i = c1427510nFd.LLILZLL;
                Word word = searchSugEntity.mWord;
                if (word != null) {
                    id = word.getId();
                } else {
                    id = null;
                }
                String str3 = c1427510nFd.LLIZ;
                ISearchSugHelper iSearchSugHelper2 = c1427510nFd.LLILLL;
                if (iSearchSugHelper2 == null || (strSugMobType = iSearchSugHelper2.sugMobType(c1427510nFd.LLILZIL)) == null) {
                    strSugMobType = "";
                }
                interfaceC1426290nDf.LIZIZ(new C1426830nEX(str, str2, id, str3, i, false, strSugMobType, searchSugEntity.LJI));
            }
            InterfaceC1426290nDf interfaceC1426290nDf2 = c1427510nFd.LLILLJJLI;
            if (interfaceC1426290nDf2 != null) {
                interfaceC1426290nDf2.LIZ(searchSugEntity);
            }
        }
    }

    public static final void LIZ$1(AkS90S0100000_22 akS90S0100000_22, View view) {
        InterfaceC1447490nlr interfaceC1447490nlr = ((FTCChooseCoverFragment) akS90S0100000_22.l0).LLJILJIL;
        InterfaceC1447490nlr interfaceC1447490nlr2 = null;
        if (interfaceC1447490nlr == null) {
            interfaceC1447490nlr = null;
        }
        VideoPublishEditModel videoPublishEditModelLJI = interfaceC1447490nlr.LJI();
        InterfaceC1447490nlr interfaceC1447490nlr3 = ((FTCChooseCoverFragment) akS90S0100000_22.l0).LLJILJIL;
        if (interfaceC1447490nlr3 != null) {
            interfaceC1447490nlr2 = interfaceC1447490nlr3;
        }
        InterfaceC1452170ntP interfaceC1452170ntPLLFII = interfaceC1447490nlr2.LLFII();
        C0CHQ.LIZ().LIZ().LIZJ(videoPublishEditModelLJI, interfaceC1452170ntPLLFII.getInitSize().width, interfaceC1452170ntPLLFII.getInitSize().height, !C1447200nlO.LIZ(videoPublishEditModelLJI.getVideoCoverStartTm(), ((FTCChooseCoverFragment) akS90S0100000_22.l0).LLJILJILJ / 1000.0f), false, false, true, new AwS423S0200000_22((FTCChooseCoverFragment) akS90S0100000_22.l0, videoPublishEditModelLJI, 11));
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", videoPublishEditModelLJI.getCreationId());
        c0lab.LJ("enter_from", "video_edit_page");
        c0lab.LJ("shoot_way", "direct_shoot");
        c0lab.LJ("shoot_entrance", "direct_shoot");
        C20684815ws.LJIILLIIL("save_cover_edit", c0lab.LIZ);
    }

    public static final void LIZ$10(AkS90S0100000_22 akS90S0100000_22, View view) {
        NLEModel nLEModelLLZ;
        InterfaceC1446740nke interfaceC1446740nke;
        Function0<Boolean> function0 = ((C1457830o2X) akS90S0100000_22.l0).LLJIJIL.LJIIL;
        Function0<Unit> function02 = null;
        if (function0 == null) {
            function0 = null;
        }
        if (!function0.invoke().booleanValue()) {
            return;
        }
        InterfaceC1455860nzM interfaceC1455860nzMLLLIILIL = ((C1457830o2X) akS90S0100000_22.l0).LLLIILIL();
        if ((interfaceC1455860nzMLLLIILIL instanceof InterfaceC1446740nke) && (interfaceC1446740nke = (InterfaceC1446740nke) interfaceC1455860nzMLLLIILIL) != null) {
            nLEModelLLZ = interfaceC1446740nke.LLZ();
        } else {
            nLEModelLLZ = null;
        }
        if (C349930Dnj.LIZ(((C1457830o2X) akS90S0100000_22.l0).LLLIL(), nLEModelLLZ, false) && ((C1457830o2X) akS90S0100000_22.l0).LLLIL().hasExtendMusic() && nLEModelLLZ != null && C349930Dnj.LJII(nLEModelLLZ) && u4.LJIIIIZZ(((C1457830o2X) akS90S0100000_22.l0).LLLIL())) {
            C1457830o2X c1457830o2X = (C1457830o2X) akS90S0100000_22.l0;
            C1664740tQG c1664740tQG = c1457830o2X.LLJJIJIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C1457830o2X.LLJLL;
            InterfaceC1417050myl interfaceC1417050myl = (InterfaceC1417050myl) c1664740tQG.getValue(c1457830o2X, interfaceC2217461BqaArr[4]);
            if (interfaceC1417050myl != null) {
                interfaceC1417050myl.Il2(null);
            }
            C1457830o2X c1457830o2X2 = (C1457830o2X) akS90S0100000_22.l0;
            C0EYP c0eyp = (C0EYP) c1457830o2X2.LLJJIJI.getValue(c1457830o2X2, interfaceC2217461BqaArr[2]);
            if (c0eyp != null) {
                c0eyp.Dy0((C1457830o2X) akS90S0100000_22.l0, new C0EZH(null, false, false, false, false, false, false, false, EnumC359990E9l.OPEN_MUSIC_FROM_EDITOR, false, false, false, null, false, false, 65023));
                return;
            }
            return;
        }
        C1457830o2X c1457830o2X3 = (C1457830o2X) akS90S0100000_22.l0;
        C1664740tQG c1664740tQG2 = c1457830o2X3.LLJJJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr2 = C1457830o2X.LLJLL;
        InterfaceC1419190n2D interfaceC1419190n2D = (InterfaceC1419190n2D) c1664740tQG2.getValue(c1457830o2X3, interfaceC2217461BqaArr2[5]);
        if (interfaceC1419190n2D != null) {
            interfaceC1419190n2D.Uu2();
        }
        C1457830o2X c1457830o2X4 = (C1457830o2X) akS90S0100000_22.l0;
        InterfaceC1451520nsM interfaceC1451520nsM = (InterfaceC1451520nsM) c1457830o2X4.LLJJIII.getValue(c1457830o2X4, interfaceC2217461BqaArr2[1]);
        if (interfaceC1451520nsM != null) {
            interfaceC1451520nsM.LLJL();
        }
        if (C1444940nhk.LJIIIIZZ(((C1457830o2X) akS90S0100000_22.l0).LLLIL().getCanvasVideoData())) {
            return;
        }
        if (C1444940nhk.LJIIJ(((C1457830o2X) akS90S0100000_22.l0).LLLIL().getCanvasVideoData())) {
            if (MusicBeanUtilKt.extractAVMusic(((C1457830o2X) akS90S0100000_22.l0).LLLIL().creativeModel.musicBuzModel) == null) {
                if (view != null) {
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    creativeToastBuilder.messageRes(2131847058);
                    creativeToastBuilder.isTuxToastLegacy(true);
                    C1390380mHk.LIZLLL(view, 3008, creativeToastBuilder);
                    return;
                }
                return;
            }
            InterfaceC1457250o1b interfaceC1457250o1b = (InterfaceC1457250o1b) ((C1457830o2X) akS90S0100000_22.l0).LLJJI.getValue();
            if (interfaceC1457250o1b == null) {
                return;
            }
            interfaceC1457250o1b.show();
            return;
        }
        C1443030nef.LJII().LJI = C857680Xkk.LIZIZ(((C1457830o2X) akS90S0100000_22.l0).LLLIL());
        Function0<Unit> function03 = ((C1457830o2X) akS90S0100000_22.l0).LLJIJIL.LJIIJ;
        if (function03 != null) {
            function02 = function03;
        }
        function02.invoke();
    }

    public static final void LIZ$11(AkS90S0100000_22 akS90S0100000_22, View view) {
        boolean z;
        Function0<Boolean> function0 = ((C1457830o2X) akS90S0100000_22.l0).LLJIJIL.LJIIL;
        if (function0 == null) {
            function0 = null;
        }
        if (!function0.invoke().booleanValue()) {
            return;
        }
        VideoPublishEditModel videoPublishEditModelLLLIL = ((C1457830o2X) akS90S0100000_22.l0).LLLIL();
        if (videoPublishEditModelLLLIL.isLinkShareWithPresetMusic() && videoPublishEditModelLLLIL.creativeModel.musicBuzModel.music == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (view != null) {
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.icon(R.raw.icon_music_note_s_alt_slash);
                creativeToastBuilder.iconColorRes(R.attr.a1h);
                creativeToastBuilder.messageRes(2131832473);
                creativeToastBuilder.duration(3000L);
                C1390380mHk.LIZLLL(view, 3008, creativeToastBuilder);
                return;
            }
            return;
        }
        if (view == null) {
            return;
        }
        CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
        creativeToastBuilder2.message(((C1457830o2X) akS90S0100000_22.l0).getResources().getText(2131847058).toString());
        creativeToastBuilder2.duration(3000L);
        C1390380mHk.LIZLLL(view, 3008, creativeToastBuilder2);
    }

    public static final void LIZ$12(AkS90S0100000_22 akS90S0100000_22, View view) {
        InterfaceC1421120n5K povPanelClickListener = ((C1421110n5J) akS90S0100000_22.l0).getPovPanelClickListener();
        if (povPanelClickListener != null) {
            C1421140n5M c1421140n5M = ((C1421110n5J) akS90S0100000_22.l0).LLJI;
            boolean z = false;
            if (c1421140n5M != null && c1421140n5M.LL != -1) {
                z = true;
            }
            povPanelClickListener.LIZLLL(z);
        }
    }

    public static final void LIZ$13(AkS90S0100000_22 akS90S0100000_22, View view) {
        InterfaceC1421120n5K povPanelClickListener = ((C1421110n5J) akS90S0100000_22.l0).getPovPanelClickListener();
        if (povPanelClickListener != null) {
            povPanelClickListener.LIZJ();
        }
    }

    public static final void LIZ$14(AkS90S0100000_22 akS90S0100000_22, View view) {
        InterfaceC1421120n5K povPanelClickListener = ((C1421110n5J) akS90S0100000_22.l0).getPovPanelClickListener();
        if (povPanelClickListener != null) {
            C1421140n5M c1421140n5M = ((C1421110n5J) akS90S0100000_22.l0).LLJI;
            boolean z = false;
            if (c1421140n5M != null && c1421140n5M.LL != -1) {
                z = true;
            }
            povPanelClickListener.LIZIZ(z);
        }
    }

    public static final void LIZ$15(AkS90S0100000_22 akS90S0100000_22, View view) {
        InterfaceC1421120n5K povPanelClickListener = ((C1421110n5J) akS90S0100000_22.l0).getPovPanelClickListener();
        if (povPanelClickListener != null) {
            C1421140n5M c1421140n5M = ((C1421110n5J) akS90S0100000_22.l0).LLJI;
            boolean z = false;
            if (c1421140n5M != null && c1421140n5M.LL != -1) {
                z = true;
            }
            povPanelClickListener.LIZ(z);
        }
    }

    public static final void LIZ$16(AkS90S0100000_22 akS90S0100000_22, View view) {
        ((C1457720o2M) akS90S0100000_22.l0).LLLII();
    }

    public static final void LIZ$17(AkS90S0100000_22 akS90S0100000_22, View view) {
        C1168780gWK c1168780gWK = (C1168780gWK) akS90S0100000_22.l0;
        if (((VideoPublishEditModel) c1168780gWK.LLJJI.getValue(c1168780gWK, C1168780gWK.LLJJIJIIJIL[0])).creativeModel.aigcMetadataModel.isAigcEffect) {
            ((C1623740sM8) ((C1168780gWK) akS90S0100000_22.l0).LLJJIJI.getValue()).onEvent(new C1457700o2K(new C0V0I(0)));
        }
        C1456140nzo.LIZ((InterfaceC1455860nzM) ((C1168780gWK) akS90S0100000_22.l0).LLJJIII.getValue(), false, 3);
    }

    public static final void LIZ$18(AkS90S0100000_22 akS90S0100000_22, View view) {
        ((C1457580o28) akS90S0100000_22.l0).LLLJ();
    }

    public static final void LIZ$19(AkS90S0100000_22 akS90S0100000_22, View view) {
        C1448790nnx.LIZJ("camera_start");
        ((C1457580o28) akS90S0100000_22.l0).LLLJ();
    }

    public static final void LIZ$2(AkS90S0100000_22 akS90S0100000_22, View view) {
        InterfaceC1410010mnP inspirationPanelClickListener = ((C1415620mwS) akS90S0100000_22.l0).getInspirationPanelClickListener();
        if (inspirationPanelClickListener != null) {
            inspirationPanelClickListener.LIZJ();
        }
    }

    public static final void LIZ$20(AkS90S0100000_22 akS90S0100000_22, View view) {
        ((C1459630o5R) akS90S0100000_22.l0).LLLII();
    }

    public static final void LIZ$21(AkS90S0100000_22 akS90S0100000_22, View view) {
        ImageAdjustInfo adjustInfo;
        C1453280nvC c1453280nvC = (C1453280nvC) akS90S0100000_22.l0;
        SingleImageData singleImageData = c1453280nvC.LLJLL;
        if (singleImageData != null && (adjustInfo = singleImageData.getAdjustInfo()) != null) {
            c1453280nvC.LLLIIIIL(adjustInfo.getAdjustMap());
        }
        c1453280nvC.LLLLII(false);
        C1403960mde c1403960mde = C1403960mde.LIZ;
        VideoPublishEditModel videoPublishEditModelLLLILZLLLI = ((C1453280nvC) akS90S0100000_22.l0).LLLILZLLLI();
        Map<String, SingleAdjustInfo> map = ((C1453280nvC) akS90S0100000_22.l0).LLJLLIL;
        c1403960mde.getClass();
        C0LAB c0labLIZJ = C1403960mde.LIZJ(videoPublishEditModelLLLILZLLLI);
        C1403960mde.LIZIZ(c0labLIZJ, map);
        C20684815ws.LJIILLIIL("adjust_cancel", c0labLIZJ.LIZ);
    }

    public static final void LIZ$22(AkS90S0100000_22 akS90S0100000_22, View view) {
        ImageAdjustInfo adjustInfo;
        C1453280nvC c1453280nvC = (C1453280nvC) akS90S0100000_22.l0;
        SingleImageData singleImageData = c1453280nvC.LLJLL;
        if (singleImageData != null && (adjustInfo = singleImageData.getAdjustInfo()) != null && (!Intrinsics.LJFF(adjustInfo.getAdjustMap(), c1453280nvC.LLJLLIL))) {
            adjustInfo.setAdjustMap(new LinkedHashMap(c1453280nvC.LLJLLIL));
            C1450610nqt c1450610nqt = c1453280nvC.LLL;
            if (c1450610nqt != null) {
                c1450610nqt.LJ = true;
            }
        }
        ((ImageAdjustViewModel) c1453280nvC.LLJL.getValue()).gM1();
        c1453280nvC.LLLLII(false);
        C1403960mde c1403960mde = C1403960mde.LIZ;
        VideoPublishEditModel videoPublishEditModelLLLILZLLLI = ((C1453280nvC) akS90S0100000_22.l0).LLLILZLLLI();
        Map<String, SingleAdjustInfo> map = ((C1453280nvC) akS90S0100000_22.l0).LLJLLIL;
        c1403960mde.getClass();
        C0LAB c0labLIZJ = C1403960mde.LIZJ(videoPublishEditModelLLLILZLLLI);
        C1403960mde.LIZIZ(c0labLIZJ, map);
        C20684815ws.LJIILLIIL("adjust_save", c0labLIZJ.LIZ);
    }

    public static final void LIZ$23(AkS90S0100000_22 akS90S0100000_22, View view) {
        C1453550nvd c1453550nvd = ((C1453280nvC) akS90S0100000_22.l0).LLJJJJ;
        if (!c1453550nvd.LIZ.isEmpty()) {
            C1453580nvg c1453580nvgRemoveLast = c1453550nvd.LIZ.removeLast();
            c1453550nvd.LIZIZ.addLast(c1453580nvgRemoveLast);
            InterfaceC1453560nve interfaceC1453560nve = c1453550nvd.LIZJ;
            if (interfaceC1453560nve != null) {
                interfaceC1453560nve.LIZ(c1453580nvgRemoveLast.LIZIZ, c1453580nvgRemoveLast.LIZ);
            }
            InterfaceC1453560nve interfaceC1453560nve2 = c1453550nvd.LIZJ;
            if (interfaceC1453560nve2 != null) {
                interfaceC1453560nve2.LIZIZ(c1453580nvgRemoveLast);
            }
        }
    }

    public static final void LIZ$24(AkS90S0100000_22 akS90S0100000_22, View view) {
        C1453550nvd c1453550nvd = ((C1453280nvC) akS90S0100000_22.l0).LLJJJJ;
        if (!c1453550nvd.LIZIZ.isEmpty()) {
            C1453580nvg c1453580nvgRemoveLast = c1453550nvd.LIZIZ.removeLast();
            c1453550nvd.LIZ.addLast(c1453580nvgRemoveLast);
            InterfaceC1453560nve interfaceC1453560nve = c1453550nvd.LIZJ;
            if (interfaceC1453560nve != null) {
                interfaceC1453560nve.LIZ(c1453580nvgRemoveLast.LIZJ, c1453580nvgRemoveLast.LIZ);
            }
            InterfaceC1453560nve interfaceC1453560nve2 = c1453550nvd.LIZJ;
            if (interfaceC1453560nve2 != null) {
                interfaceC1453560nve2.LIZJ(c1453580nvgRemoveLast);
            }
        }
    }

    public static final void LIZ$25(AkS90S0100000_22 akS90S0100000_22, View view) {
        C201955140j.LIZ("VEVideoPublishEditActivity nextStep OnClick");
        ((InterfaceC1455860nzM) ((C1464300oCy) akS90S0100000_22.l0).LLJILJILJ.getValue()).fA1();
    }

    public static final void LIZ$26(AkS90S0100000_22 akS90S0100000_22, View view) {
        C1456140nzo.LIZ((InterfaceC1455860nzM) ((C1464390oD7) akS90S0100000_22.l0).LLJJIJIL.getValue(), false, 3);
    }

    public static final void LIZ$27(AkS90S0100000_22 akS90S0100000_22, View view) {
        C1448790nnx.LIZJ("camera_start");
        C1456140nzo.LIZ((InterfaceC1455860nzM) ((C1464390oD7) akS90S0100000_22.l0).LLJJIJIL.getValue(), false, 3);
    }

    public static final void LIZ$28(AkS90S0100000_22 akS90S0100000_22, View view) {
        ((C1445410niV) akS90S0100000_22.l0).LLLLLLJ(false);
    }

    public static final void LIZ$29(AkS90S0100000_22 akS90S0100000_22, View view) {
        ((C1409970mnL) akS90S0100000_22.l0).LLLLIL().LIZ.invoke();
    }

    public static final void LIZ$3(AkS90S0100000_22 akS90S0100000_22, View view) {
        InterfaceC1410010mnP inspirationPanelClickListener = ((C1415620mwS) akS90S0100000_22.l0).getInspirationPanelClickListener();
        if (inspirationPanelClickListener != null) {
            inspirationPanelClickListener.LIZJ();
        }
    }

    public static final void LIZ$4(AkS90S0100000_22 akS90S0100000_22, View view) {
        InterfaceC1410010mnP inspirationPanelClickListener = ((C1415620mwS) akS90S0100000_22.l0).getInspirationPanelClickListener();
        if (inspirationPanelClickListener != null) {
            C1418970n1r c1418970n1r = ((C1415620mwS) akS90S0100000_22.l0).LLJJJ;
            boolean z = false;
            if (c1418970n1r != null && c1418970n1r.LL != -1) {
                z = true;
            }
            inspirationPanelClickListener.LIZIZ(z);
        }
    }

    public static final void LIZ$5(AkS90S0100000_22 akS90S0100000_22, View view) {
        InterfaceC1410010mnP inspirationPanelClickListener = ((C1415620mwS) akS90S0100000_22.l0).getInspirationPanelClickListener();
        if (inspirationPanelClickListener != null) {
            C1418970n1r c1418970n1r = ((C1415620mwS) akS90S0100000_22.l0).LLJJJ;
            boolean z = false;
            if (c1418970n1r != null && c1418970n1r.LL != -1) {
                z = true;
            }
            inspirationPanelClickListener.LIZ(z);
        }
    }

    public static final void LIZ$6(AkS90S0100000_22 akS90S0100000_22, View view) {
        PublishCustomCoverModel publishCustomCoverModelLJIIIIZZ = C1443400nfG.LJIIIIZZ(((VEChooseVideoCoverFragment) akS90S0100000_22.l0).LLJLL.LJI());
        if (publishCustomCoverModelLJIIIIZZ != null) {
            publishCustomCoverModelLJIIIIZZ.isCoverChangeFrame = ((VEChooseVideoCoverFragment) akS90S0100000_22.l0).PR() ? 1 : 0;
        }
        ((VEChooseVideoCoverFragment) akS90S0100000_22.l0).WR(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:154:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x033c  */
    /* JADX WARN: Type inference failed for: r1v12, types: [T, java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v18, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$7(final irm.AkS90S0100000_22 r25, android.view.View r26) {
        /*
            Method dump skipped, instruction units count: 872
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: irm.AkS90S0100000_22.LIZ$7(irm.AkS90S0100000_22, android.view.View):void");
    }

    public static final void LIZ$8(AkS90S0100000_22 akS90S0100000_22, View view) {
        Bitmap bitmapLLLZLZ;
        InterfaceC1452170ntP interfaceC1452170ntPLLFII;
        float showPreviewWidth;
        float showPreviewHeight;
        String nickname = o.LJIIZILJ.getCurrentUser().getNickname();
        UrlModel avatarMedium = o.LJIIZILJ.getCurrentUser().getAvatarMedium();
        if (avatarMedium != null && nickname != null) {
            List<String> urlList = avatarMedium.getUrlList();
            avatarMedium.setUrlList(urlList);
            String[] strArr = (String[]) urlList.toArray(new String[0]);
            VideoPublishEditModel videoPublishEditModelLJI = ((VEChooseVideoCoverFragment) akS90S0100000_22.l0).LLJLL.LJI();
            VEChooseVideoCoverFragment vEChooseVideoCoverFragment = (VEChooseVideoCoverFragment) akS90S0100000_22.l0;
            C1447160nlK c1447160nlK = new C1447160nlK(akS90S0100000_22, nickname, strArr, videoPublishEditModelLJI);
            vEChooseVideoCoverFragment.getClass();
            if (C1447250nlT.LIZJ()) {
                VideoPublishEditModel videoPublishEditModelLJI2 = vEChooseVideoCoverFragment.LLJLL.LJI();
                ChooseCoverActivity chooseCoverActivity = (ChooseCoverActivity) vEChooseVideoCoverFragment.getActivity();
                if (videoPublishEditModelLJI2 != null && chooseCoverActivity != null && (bitmapLLLZLZ = chooseCoverActivity.LLLZLZ()) != null && (interfaceC1452170ntPLLFII = vEChooseVideoCoverFragment.LLJLL.LLFII()) != null) {
                    boolean zLIZ = C1447250nlT.LIZ();
                    CoverPublishModel coverPublishModel = videoPublishEditModelLJI2.getCoverPublishModel();
                    if (zLIZ && coverPublishModel != null) {
                        showPreviewWidth = coverPublishModel.getCoverPreviewInfo().getShowPreviewWidth();
                    } else {
                        showPreviewWidth = interfaceC1452170ntPLLFII.getInitSize().width;
                        if (!zLIZ || coverPublishModel == null) {
                            showPreviewHeight = interfaceC1452170ntPLLFII.getInitSize().height;
                        }
                        C0CHQ.LIZ().LIZ().LIZJ(videoPublishEditModelLJI2, (int) showPreviewWidth, (int) showPreviewHeight, true, true, zLIZ, false, new AObjectS204S0300000_22(videoPublishEditModelLJI2, bitmapLLLZLZ, c1447160nlK, 2));
                    }
                    showPreviewHeight = coverPublishModel.getCoverPreviewInfo().getShowPreviewHeight();
                    C0CHQ.LIZ().LIZ().LIZJ(videoPublishEditModelLJI2, (int) showPreviewWidth, (int) showPreviewHeight, true, true, zLIZ, false, new AObjectS204S0300000_22(videoPublishEditModelLJI2, bitmapLLLZLZ, c1447160nlK, 2));
                }
            }
        }
    }

    public static final void LIZ$9(AkS90S0100000_22 akS90S0100000_22, View view) {
        C1457870o2b c1457870o2b;
        Function0<Boolean> function0 = ((C1457830o2X) akS90S0100000_22.l0).LLJIJIL.LJIIL;
        if (function0 == null) {
            function0 = null;
        }
        if (function0.invoke().booleanValue() && (c1457870o2b = ((C1457830o2X) akS90S0100000_22.l0).LLJIJIL.LJIILIIL) != null) {
            c1457870o2b.invoke();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AkS90S0100000_22(Object obj, int i, int i2) {
        super(600L);
        this.$t = i;
        this.l0 = obj;
    }
}
