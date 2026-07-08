package irm;

import X.AbstractC529520Kpi;
import X.AbstractViewOnClickListenerC1173120gdK;
import X.C0L91;
import X.C0LAB;
import X.C0LGY;
import X.C0LGZ;
import X.C0M2E;
import X.C0M2O;
import X.C0MDX;
import X.C0MU2;
import X.C0MXN;
import X.C1397510mTF;
import X.C1397580mTM;
import X.C1428470nHB;
import X.C1443990ngD;
import X.C19EG;
import X.C1E3C;
import X.C20684815ws;
import X.C523790KgT;
import X.C523800KgU;
import X.C528260Kng;
import X.C548880Lfq;
import X.C548910Lft;
import X.C549720LhC;
import X.C555070Lpp;
import X.C565150MEn;
import X.C580270MpN;
import X.C985403tE;
import X.InterfaceC528100KnQ;
import X.InterfaceC540100LGe;
import X.InterfaceC548750Lfd;
import X.InterfaceC561590M0v;
import X.InterfaceC565110MEj;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ailivephoto.AILivePhotoSheetFragment;
import com.ss.android.ugc.aweme.aiuikit.impl.input.mentionpanel.scene.MentionPanelCell;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCSocialModel;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptType;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import com.ss.android.ugc.aweme.feed.model.AIAliveInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.services.external.IAILiveService;
import com.ss.android.ugc.aweme.services.external.OpenPostAlbumParams;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.shortvideo.ui.AutoDismissPermissionDialog;
import com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity;
import com.ss.android.ugc.aweme.shortvideo.vechoosecover.VEChooseVideoCoverFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.feed.immersive.component.bottombutton.aitheater.StoryAiTheaterButtonComponent;
import com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher;
import com.ss.android.ugc.aweme.theater.service.IAITheaterFeatureService;
import com.ss.android.ugc.aweme.theater.social.protocol.AITheaterSocialFakeGeneratingUISlotAssem;
import com.ss.android.ugc.aweme.theater.social.protocol.AITheaterSocialGeneratingReusedUISlot;
import com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxPageViewModel;
import com.ss.android.ugc.gamora.editor.ailive.repo.AILivePhotoPromptStruct;
import com.tts.oecverify.BdTuring;
import java.util.EnumSet;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS21S1101000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.AwS7S1301000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public class AkS53S0200000_8 extends AbstractViewOnClickListenerC1173120gdK {
    public final int $t;
    public Object l0;
    public Object l1;

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
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AkS53S0200000_8 akS53S0200000_8, View view) {
        InterfaceC528100KnQ interfaceC528100KnQ = ((AbstractC529520Kpi) akS53S0200000_8.l0).LLILZLL;
        if (interfaceC528100KnQ != null) {
            interfaceC528100KnQ.LIZIZ((TikTokMediaModel) akS53S0200000_8.l1);
        }
    }

    public static final void LIZ$1(AkS53S0200000_8 akS53S0200000_8, View view) {
        AIAliveInfo aIAliveInfo;
        String modelPrompt;
        String modelPrompt2;
        String promptType;
        C19EG activity;
        OpenPostAlbumParams openPostAlbumParams;
        OpenPostAlbumParams openPostAlbumParamsCopy;
        String modelPrompt3;
        String modelPrompt4;
        AIAliveInfo aIAliveInfo2;
        AILivePhotoPromptStruct aILivePhotoPromptStruct;
        InterfaceC565110MEj interfaceC565110MEj = (InterfaceC565110MEj) akS53S0200000_8.l0;
        FragmentManager supportFragmentManager = null;
        if (interfaceC565110MEj != null && (aILivePhotoPromptStruct = (AILivePhotoPromptStruct) interfaceC565110MEj.getInputResult()) != null) {
            aIAliveInfo = new AIAliveInfo(aILivePhotoPromptStruct.prompt, aILivePhotoPromptStruct.type, aILivePhotoPromptStruct.modelPrompt, aILivePhotoPromptStruct.modelReqKey, "");
            modelPrompt = aIAliveInfo.getModelPrompt();
        } else {
            aIAliveInfo = null;
            modelPrompt = null;
        }
        OpenPostAlbumParams openPostAlbumParams2 = ((AILivePhotoSheetFragment) akS53S0200000_8.l1).LLJ;
        if (openPostAlbumParams2 != null && (aIAliveInfo2 = openPostAlbumParams2.originAIAliveInfo) != null) {
            modelPrompt2 = aIAliveInfo2.getModelPrompt();
        } else {
            modelPrompt2 = null;
        }
        if (Intrinsics.LJFF(modelPrompt, modelPrompt2)) {
            promptType = PromptType.DEFAULT.getMobTag();
        } else if (aIAliveInfo != null) {
            promptType = aIAliveInfo.getPromptType();
        } else {
            promptType = null;
        }
        OpenPostAlbumParams openPostAlbumParams3 = ((AILivePhotoSheetFragment) akS53S0200000_8.l1).LLJ;
        if (openPostAlbumParams3 != null) {
            C565150MEn c565150MEn = C565150MEn.LIZ;
            AIAliveInfo aIAliveInfo3 = openPostAlbumParams3.aiAliveInfo;
            if (aIAliveInfo3 != null) {
                modelPrompt3 = aIAliveInfo3.getModelPrompt();
            } else {
                modelPrompt3 = null;
            }
            String str = openPostAlbumParams3.enterFrom;
            int i = ((AILivePhotoSheetFragment) akS53S0200000_8.l1).LLIZLLLIL;
            if (aIAliveInfo != null) {
                modelPrompt4 = aIAliveInfo.getModelPrompt();
            } else {
                modelPrompt4 = null;
            }
            c565150MEn.getClass();
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("origin_ai_alive_prompt", modelPrompt3);
            c0lab.LJ("enter_from", str);
            c0lab.LJ("follow_prompt_type", promptType);
            c0lab.LJ("prompt_text", modelPrompt4);
            if (C528260Kng.LIZ()) {
                c0lab.LIZ(i, "process_cnt");
            }
            C20684815ws.LJIILLIIL("ai_livephoto_anchor_guide_submit", c0lab.LIZ);
        }
        AILivePhotoSheetFragment aILivePhotoSheetFragment = (AILivePhotoSheetFragment) akS53S0200000_8.l1;
        aILivePhotoSheetFragment.LLJIJIL = true;
        IAILiveService iAILiveService = (IAILiveService) aILivePhotoSheetFragment.LLJILLL.getValue();
        if (iAILiveService != null && (activity = ((AILivePhotoSheetFragment) akS53S0200000_8.l1).getActivity()) != null && (openPostAlbumParams = ((AILivePhotoSheetFragment) akS53S0200000_8.l1).LLJ) != null && aIAliveInfo != null && (openPostAlbumParamsCopy = openPostAlbumParams.copy(openPostAlbumParams.enterMethod, aIAliveInfo, openPostAlbumParams.shootWay, openPostAlbumParams.enterFrom, true, openPostAlbumParams.originAIAliveInfo, openPostAlbumParams.music)) != null) {
            AILivePhotoSheetFragment aILivePhotoSheetFragment2 = (AILivePhotoSheetFragment) akS53S0200000_8.l1;
            C19EG activity2 = aILivePhotoSheetFragment2.getActivity();
            if (activity2 != null) {
                supportFragmentManager = activity2.getSupportFragmentManager();
            }
            IAILiveService.DefaultImpls.goPostAlbum$default(iAILiveService, activity, openPostAlbumParamsCopy, aILivePhotoSheetFragment2, supportFragmentManager, null, 16, null);
        }
    }

    public static final void LIZ$10(AkS53S0200000_8 akS53S0200000_8, View view) {
        String str;
        C0MU2 c0mu2 = C0MU2.LIZ;
        AIGCSocialModel aIGCSocialModel = (AIGCSocialModel) akS53S0200000_8.l0;
        c0mu2.getClass();
        IAITheaterCreationLauncher.EnterParams enterParamsLIZ = C0MU2.LIZ(aIGCSocialModel, true, null, true);
        C0MU2.LJI(enterParamsLIZ);
        AIGCSocialModel aIGCSocialModel2 = (AIGCSocialModel) akS53S0200000_8.l0;
        if (aIGCSocialModel2 != null) {
            str = aIGCSocialModel2.conversationId;
        } else {
            str = null;
        }
        C0MU2.LIZJ(1, str, "generate_aitheater_outdate_fail");
        ((AITheaterSocialGeneratingReusedUISlot) akS53S0200000_8.l1).zp(enterParamsLIZ);
    }

    public static final void LIZ$11(AkS53S0200000_8 akS53S0200000_8, View view) {
        String str;
        C0MU2 c0mu2 = C0MU2.LIZ;
        AIGCSocialModel aIGCSocialModel = (AIGCSocialModel) akS53S0200000_8.l0;
        c0mu2.getClass();
        IAITheaterCreationLauncher.EnterParams enterParamsLIZ = C0MU2.LIZ(aIGCSocialModel, true, null, true);
        C0MU2.LJI(enterParamsLIZ);
        AIGCSocialModel aIGCSocialModel2 = (AIGCSocialModel) akS53S0200000_8.l0;
        if (aIGCSocialModel2 != null) {
            str = aIGCSocialModel2.conversationId;
        } else {
            str = null;
        }
        C0MU2.LIZJ(1, str, "generate_aitheater_outdate_fail");
        ((AITheaterSocialGeneratingReusedUISlot) akS53S0200000_8.l1).zp(enterParamsLIZ);
    }

    public static final void LIZ$12(AkS53S0200000_8 akS53S0200000_8, View view) {
        ((C0MDX) akS53S0200000_8.l0).onClick((TuxIconView) akS53S0200000_8.l1);
    }

    public static final void LIZ$13(AkS53S0200000_8 akS53S0200000_8, View view) {
        IAITheaterCreationLauncher iAITheaterCreationLauncherLIZ;
        IAITheaterCreationLauncher.EnterParams enterParamsEp = ((StoryAiTheaterButtonComponent) akS53S0200000_8.l0).Ep((Aweme) akS53S0200000_8.l1);
        IAITheaterFeatureService.LIZ.getClass();
        IAITheaterFeatureService iAITheaterFeatureServiceLIZ = C549720LhC.LIZ();
        if (iAITheaterFeatureServiceLIZ != null && (iAITheaterCreationLauncherLIZ = iAITheaterFeatureServiceLIZ.LIZ()) != null) {
            Context context = ((StoryAiTheaterButtonComponent) akS53S0200000_8.l0).getContext();
            if (context != null) {
                iAITheaterCreationLauncherLIZ.LJFF(enterParamsEp, context, false);
            } else {
                return;
            }
        }
        C548880Lfq c548880Lfq = C548880Lfq.LIZ;
        C1E3C c1e3c = C1E3C.LJIIIIZZ;
        InterfaceC548750Lfd interfaceC548750LfdLIZ = C548910Lft.LIZ(enterParamsEp);
        AFwS239S0000000_8 aFwS239S0000000_8 = AFwS239S0000000_8.get$arr$(260);
        c548880Lfq.getClass();
        C548880Lfq.LIZLLL(c1e3c, interfaceC548750LfdLIZ, aFwS239S0000000_8);
    }

    public static final void LIZ$14(AkS53S0200000_8 akS53S0200000_8, View view) {
        C555070Lpp item = ((MentionPanelCell) akS53S0200000_8.l0).getItem();
        if (item != null) {
            item.LLILZIL.invoke((MentionDataItem) akS53S0200000_8.l1);
        }
    }

    public static final void LIZ$15(AkS53S0200000_8 akS53S0200000_8, View view) {
        ((C555070Lpp) akS53S0200000_8.l0).LLILZ.invoke((MentionDataItem) akS53S0200000_8.l1);
    }

    public static final void LIZ$16(AkS53S0200000_8 akS53S0200000_8, View view) {
        C555070Lpp item = ((MentionPanelCell) akS53S0200000_8.l0).getItem();
        if (item != null) {
            item.LLILZIL.invoke((MentionDataItem) akS53S0200000_8.l1);
        }
    }

    public static final void LIZ$17(AkS53S0200000_8 akS53S0200000_8, View view) {
        C555070Lpp item = ((MentionPanelCell) akS53S0200000_8.l0).getItem();
        if (item != null) {
            item.LLILZIL.invoke((MentionDataItem) akS53S0200000_8.l1);
        }
    }

    public static final void LIZ$18(AkS53S0200000_8 akS53S0200000_8, View view) {
        int iIntValue;
        long jLongValue;
        String enterFrom;
        MutableLiveData<Long> mutableLiveData;
        Long value;
        MutableLiveData<Integer> mutableLiveData2;
        Integer value2;
        DraftBoxPageViewModel draftBoxPageViewModel = ((C0M2O) akS53S0200000_8.l0).LIZ;
        if (draftBoxPageViewModel != null && (mutableLiveData2 = draftBoxPageViewModel.LLJ) != null && (value2 = mutableLiveData2.getValue()) != null) {
            iIntValue = value2.intValue();
        } else {
            iIntValue = 0;
        }
        DraftBoxPageViewModel draftBoxPageViewModel2 = ((C0M2O) akS53S0200000_8.l0).LIZ;
        if (draftBoxPageViewModel2 != null && (mutableLiveData = draftBoxPageViewModel2.LLIZLLLIL) != null && (value = mutableLiveData.getValue()) != null) {
            jLongValue = value.longValue();
        } else {
            jLongValue = 0;
        }
        C0M2E c0m2e = C0M2E.LIZ;
        Context context = (Context) akS53S0200000_8.l1;
        InterfaceC561590M0v interfaceC561590M0v = ((C0M2O) akS53S0200000_8.l0).LJFF;
        if (interfaceC561590M0v != null) {
            enterFrom = interfaceC561590M0v.getEnterFrom();
        } else {
            enterFrom = null;
        }
        AwS552S0100000_8 awS552S0100000_8 = new AwS552S0100000_8((C0M2O) akS53S0200000_8.l0, iIntValue, jLongValue, 1140);
        AFwS194S0000000_8 aFwS194S0000000_8 = AFwS194S0000000_8.get$arr$(639);
        AFwS194S0000000_8 aFwS194S0000000_82 = AFwS194S0000000_8.get$arr$(640);
        c0m2e.getClass();
        C0M2E.LIZIZ(iIntValue, "show", enterFrom);
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        c1397580mTM.LJI(context.getResources().getQuantityString(2131755279, iIntValue, Integer.valueOf(iIntValue)));
        c1397580mTM.LIZIZ(C0M2E.LIZ(iIntValue, jLongValue, context, enterFrom));
        C985403tE.LIZ(c1397580mTM, new AwS7S1301000_8(context, iIntValue, enterFrom, awS552S0100000_8, aFwS194S0000000_8, 1));
        c1397580mTM.LIZJ(new AwS21S1101000_8(enterFrom, iIntValue, aFwS194S0000000_82, 2));
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    public static final void LIZ$2(AkS53S0200000_8 akS53S0200000_8, View view) {
        String str;
        String contentSource;
        final C19EG c19egRequireActivity = ((VEChooseVideoCoverFragment) akS53S0200000_8.l1).requireActivity();
        final VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) akS53S0200000_8.l0;
        C523800KgU c523800KgU = new C523800KgU();
        c523800KgU.LIZJ = "bpea-tools_request_album_permission_choose_cover";
        c523800KgU.LIZIZ = "bpea-tools_request_album_permission_choose_cover_target33";
        c523800KgU.LIZ = "bpea-tools_request_album_permission_choose_cover_target34";
        C523790KgT c523790KgTLIZ = c523800KgU.LIZ();
        C0LGY c0lgy = C0LGY.LIZ;
        C0L91 c0l91 = C0L91.IMAGE_AND_VIDEO;
        InterfaceC540100LGe interfaceC540100LGe = new InterfaceC540100LGe() { // from class: X.0L5j
            @Override // X.InterfaceC540100LGe
            public final void LIZ(int[] iArr, String[] strArr) {
                C1443400nfG c1443400nfG = C1443400nfG.LIZ;
                C19EG c19eg = c19egRequireActivity;
                String string = c19eg.getString(2131849191);
                String string2 = c19egRequireActivity.getString(2131849190);
                c1443400nfG.getClass();
                C1397580mTM c1397580mTM = new C1397580mTM(c19eg);
                if (string != null) {
                    c1397580mTM.LJI(string);
                }
                c1397580mTM.LIZIZ(string2);
                c1397580mTM.LJII = false;
                C985403tE.LIZ(c1397580mTM, new AwS587S0100000_8(c19eg, 275));
                AutoDismissPermissionDialog autoDismissPermissionDialog = new AutoDismissPermissionDialog(c19eg, c1397580mTM);
                autoDismissPermissionDialog.LLILZ = AFwS239S0000000_8.get$arr$(119);
                autoDismissPermissionDialog.LIZ();
            }
        };
        C0LGZ c0lgz = new C0LGZ() { // from class: X.0L4y
            @Override // X.C0LGZ
            public final void LIZ(C0L9U c0l9u, String[] strArr, int[] iArr) {
                boolean z;
                boolean z2;
                String strName;
                String contentSource2;
                int i;
                C0L51 c0l51 = new C0L51() { // from class: X.0L50
                };
                EnumSet enumSetOf = EnumSet.of(EnumC1989207qk.PHOTO);
                C537190L4z c537190L4z = new C537190L4z(c0l51, enumSetOf);
                c537190L4z.LJ = 43;
                c537190L4z.LIZIZ = 1;
                c537190L4z.LIZJ = 1;
                c537190L4z.LJII = videoPublishEditModel.getCreativeInfo();
                c537190L4z.LJIIIIZZ = false;
                c537190L4z.LJIIIZ = 1;
                c537190L4z.LJIIJ = C0L9E.IMPORT_THEN_BACK;
                Iterator it2 = enumSetOf.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (Intrinsics.LJFF(((EnumC1989207qk) it2.next()).getMimeTypeName(), EnumC1989207qk.PHOTO.getMimeTypeName())) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                Iterator<T> it3 = c537190L4z.LIZ.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        if (Intrinsics.LJFF(((EnumC1989207qk) it3.next()).getMimeTypeName(), EnumC1989207qk.VIDEO.getMimeTypeName())) {
                            z2 = true;
                            break;
                        }
                    } else {
                        z2 = false;
                        break;
                    }
                }
                if (z) {
                    if (c537190L4z.LIZJ == 1) {
                        i = c537190L4z.LJFF | 1;
                    } else {
                        i = c537190L4z.LJFF | 2;
                    }
                    c537190L4z.LJFF = i;
                }
                if (z2) {
                    c537190L4z.LJFF |= 4;
                }
                Bundle bundle = new Bundle();
                bundle.putInt("key_choose_scene", c537190L4z.LJ);
                Iterator<T> it4 = c537190L4z.LIZ.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    if (Intrinsics.LJFF(((EnumC1989207qk) it4.next()).getMimeTypeName(), EnumC1989207qk.PHOTO.getMimeTypeName())) {
                        bundle.putInt("key_photo_select_min_count", c537190L4z.LIZIZ);
                        bundle.putInt("key_photo_select_max_count", c537190L4z.LIZJ);
                        break;
                    }
                }
                bundle.putInt("key_support_flag", c537190L4z.LJFF);
                C786410Ut5.LJJJI("key_mv_hint_text", c537190L4z.LJI, bundle);
                C786410Ut5.LJJIL(bundle, "selected_image_data", c537190L4z.LIZLLL);
                CreativeInfo creativeInfo = c537190L4z.LJII;
                if (creativeInfo != null) {
                    C537520L6g.LJFF(bundle, creativeInfo);
                }
                bundle.putLong("invoke_uploadpage_time", System.currentTimeMillis());
                bundle.putBoolean("key_enable_selected_medias_container_ui", c537190L4z.LJIIIIZZ);
                C0L9E c0l9e = c537190L4z.LJIIJ;
                if (c0l9e != null) {
                    strName = c0l9e.name();
                } else {
                    strName = null;
                }
                C786410Ut5.LJJJI("key_selected_medias_handler", strName, bundle);
                bundle.putInt("key_status_bar_theme", c537190L4z.LJIIIZ);
                C786410Ut5.LJJJI("shoot_way", videoPublishEditModel.mShootWay, bundle);
                C786410Ut5.LJJJI("creation_id", videoPublishEditModel.getCreationId(), bundle);
                C786410Ut5.LJJJI("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel), bundle);
                C786410Ut5.LJJJI("content_type", C1428470nHB.LJIILL(videoPublishEditModel), bundle);
                C786410Ut5.LJJJI("enter_from", "video_post_page", bundle);
                bundle.putBoolean("is_from_choose_cover", true);
                C786410Ut5.LJJJI("shoot_enter_from", C1428470nHB.LJJIIJ(videoPublishEditModel, false), bundle);
                C786410Ut5.LJJJI("shoot_enter_method", videoPublishEditModel.getShootEnterMethod(), bundle);
                C1660680tJi.LIZ().LJIIIZ(c19egRequireActivity, bundle, 10006, 10006);
                C1443990ngD c1443990ngD = C1443990ngD.LIZ;
                VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
                c1443990ngD.getClass();
                C0LAB c0lab = new C0LAB();
                c0lab.LJ("creation_id", videoPublishEditModel2.getCreationId());
                C580270MpN.LIZ(videoPublishEditModel2, c0lab, "edit_cover_page");
                c0lab.LJ("enter_from", "edit_cover_page");
                c0lab.LJ("shoot_way", videoPublishEditModel2.mShootWay);
                c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel2));
                AVETParameter avetParameter = videoPublishEditModel2.getAvetParameter();
                if (avetParameter == null || (contentSource2 = avetParameter.getContentSource()) == null) {
                    contentSource2 = "";
                }
                c0lab.LJ("content_source", contentSource2);
                C20684815ws.LJIILLIIL("enter_upload_cover_page", c0lab.LIZ);
                C528230Knd c528230KndLIZLLL = C534690Ky3.LIZLLL(videoPublishEditModel);
                c528230KndLIZLLL.LJI = C0L9O.VIDEO_POST_PAGE.getValue();
                c528230KndLIZLLL.LJII = EnumC538190L8v.CHANGE_COVER.getValue();
                C534690Ky3.LIZIZ(c528230KndLIZLLL);
            }
        };
        c0lgy.getClass();
        C0LGY.LJIIJ(c19egRequireActivity, c523790KgTLIZ.LIZ(), c0l91, interfaceC540100LGe, c0lgz);
        C1443990ngD c1443990ngD = C1443990ngD.LIZ;
        VideoPublishEditModel videoPublishEditModel2 = (VideoPublishEditModel) akS53S0200000_8.l0;
        C0L91 c0l912 = C0L91.IMAGE_AND_VIDEO;
        c0lgy.getClass();
        if (C0LGY.LIZIZ(c0l912)) {
            if (C0LGY.LJI()) {
                str = "2";
            } else {
                str = "1";
            }
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c1443990ngD.getClass();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", videoPublishEditModel2.getCreationId());
        C580270MpN.LIZ(videoPublishEditModel2, c0lab, "edit_cover_page");
        c0lab.LJ("shoot_way", videoPublishEditModel2.mShootWay);
        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel2));
        AVETParameter avetParameter = videoPublishEditModel2.getAvetParameter();
        if (avetParameter == null || (contentSource = avetParameter.getContentSource()) == null) {
            contentSource = "";
        }
        c0lab.LJ("content_source", contentSource);
        c0lab.LJ("is_albume_permission", str);
        C20684815ws.LJIILLIIL("click_upload_cover_entrance", c0lab.LIZ);
        ChooseCoverActivity chooseCoverActivity = (ChooseCoverActivity) ((VEChooseVideoCoverFragment) akS53S0200000_8.l1).getActivity();
        if (chooseCoverActivity != null) {
            chooseCoverActivity.LLJJJJJIL = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$3(irm.AkS53S0200000_8 r11, android.view.View r12) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: irm.AkS53S0200000_8.LIZ$3(irm.AkS53S0200000_8, android.view.View):void");
    }

    public static final void LIZ$4(AkS53S0200000_8 akS53S0200000_8, View view) {
        ((AITheaterSocialFakeGeneratingUISlotAssem) akS53S0200000_8.l0).yp(((C0MXN) akS53S0200000_8.l1).LLILLL);
    }

    public static final void LIZ$5(AkS53S0200000_8 akS53S0200000_8, View view) {
        ((AITheaterSocialFakeGeneratingUISlotAssem) akS53S0200000_8.l0).yp(((C0MXN) akS53S0200000_8.l1).LLILLL);
    }

    public static final void LIZ$6(AkS53S0200000_8 akS53S0200000_8, View view) {
        ((AITheaterSocialFakeGeneratingUISlotAssem) akS53S0200000_8.l0).zp((C0MXN) akS53S0200000_8.l1);
    }

    public static final void LIZ$7(AkS53S0200000_8 akS53S0200000_8, View view) {
        ((AITheaterSocialFakeGeneratingUISlotAssem) akS53S0200000_8.l0).zp((C0MXN) akS53S0200000_8.l1);
    }

    public static final void LIZ$8(AkS53S0200000_8 akS53S0200000_8, View view) {
        ((AITheaterSocialFakeGeneratingUISlotAssem) akS53S0200000_8.l0).yp(((C0MXN) akS53S0200000_8.l1).LLILLL);
    }

    public static final void LIZ$9(AkS53S0200000_8 akS53S0200000_8, View view) {
        ((AITheaterSocialFakeGeneratingUISlotAssem) akS53S0200000_8.l0).yp(((C0MXN) akS53S0200000_8.l1).LLILLL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AkS53S0200000_8(MentionPanelCell mentionPanelCell, MentionDataItem mentionDataItem, int i) {
        super(1000L);
        this.$t = i;
        switch (i) {
            case 14:
            case 16:
                this.l0 = mentionPanelCell;
                this.l1 = mentionDataItem;
                break;
            case 15:
            default:
                this.l0 = mentionPanelCell;
                this.l1 = mentionDataItem;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AkS53S0200000_8(AbstractC529520Kpi abstractC529520Kpi, TikTokMediaModel tikTokMediaModel, int i) {
        super(600L);
        this.$t = i;
        this.l0 = abstractC529520Kpi;
        this.l1 = tikTokMediaModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AkS53S0200000_8(InterfaceC565110MEj interfaceC565110MEj, AILivePhotoSheetFragment aILivePhotoSheetFragment, int i) {
        super(1000L);
        this.$t = i;
        this.l0 = interfaceC565110MEj;
        this.l1 = aILivePhotoSheetFragment;
    }

    public AkS53S0200000_8(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
