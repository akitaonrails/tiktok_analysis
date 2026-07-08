package kotlin.jvm.internal;

import X.C09AY;
import X.C0L2U;
import X.C0LQY;
import X.C0M81;
import X.C0MPH;
import X.C0MRF;
import X.C0MWH;
import X.C0PEM;
import X.C1389890mGx;
import X.C13BV;
import X.C13LP;
import X.C1428470nHB;
import X.C1428520nHG;
import X.C1438570nXT;
import X.C1687150u0P;
import X.C19719612Di;
import X.C19EG;
import X.C1DFH;
import X.C2107308Nj;
import X.C2275181E3o;
import X.C2296808zG;
import X.C23250099c;
import X.C295710BiT;
import X.C528840Koc;
import X.C531080KsE;
import X.C537720L7a;
import X.C540330LHb;
import X.C548880Lfq;
import X.C563290M7j;
import X.C569450MVb;
import X.C572050Mc7;
import X.C572240McQ;
import X.C572850MdP;
import X.C786410Ut5;
import X.EnumC550780Liu;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo;
import com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.image.ui.ImageEditRootScene;
import com.ss.android.ugc.aweme.portrait.route.AIPortraitEnterParams;
import com.ss.android.ugc.aweme.portrait.tab.AIPortraitTabFragment;
import com.ss.android.ugc.aweme.portrait.tab.AIPortraitTabViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.texttoimage.choose.TextToImageChooseScene;
import com.ss.android.ugc.aweme.theater.common.AITheaterProfileEventModel;
import com.ss.android.ugc.aweme.theater.common.ContinueConfig;
import com.ss.android.ugc.aweme.theater.common.ProfileCustomConfig;
import com.ss.android.ugc.aweme.theater.common.SAALaunchParam;
import com.ss.android.ugc.aweme.theater.common.SkipConfig;
import com.ss.android.ugc.aweme.theater.service.AITheaterProfileService;
import com.ss.android.ugc.tools.view.uikit.factory.CreativeDialogWrapper;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes9.dex */
public class AwS126S0110000_8 extends C09AY implements Function0 {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS126S0110000_8 awS126S0110000_8) {
        CreativeDialogWrapper creativeDialogWrapper = ((C0L2U) awS126S0110000_8.l0).LIZLLL;
        if (creativeDialogWrapper != null) {
            creativeDialogWrapper.showCloseIcon(awS126S0110000_8.z1);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS126S0110000_8 awS126S0110000_8) {
        ImageEditRootScene imageEditRootScene = (ImageEditRootScene) awS126S0110000_8.l0;
        VideoPublishEditModel videoPublishEditModel = imageEditRootScene.LLJL;
        if (videoPublishEditModel == null) {
            videoPublishEditModel = null;
        }
        ImageAlbumData imageAlbumData = imageEditRootScene.LLJJL;
        if (imageAlbumData == null) {
            imageAlbumData = null;
        }
        videoPublishEditModel.setImageAlbumData(imageAlbumData);
        if (awS126S0110000_8.z1) {
            ImageEditRootScene imageEditRootScene2 = (ImageEditRootScene) awS126S0110000_8.l0;
            VideoPublishEditModel videoPublishEditModel2 = imageEditRootScene2.LLJL;
            if (videoPublishEditModel2 == null) {
                videoPublishEditModel2 = null;
            }
            imageEditRootScene2.LLLZLL(videoPublishEditModel2);
        }
        VideoPublishEditModel videoPublishEditModel3 = ((ImageEditRootScene) awS126S0110000_8.l0).LLJL;
        if (videoPublishEditModel3 == null) {
            videoPublishEditModel3 = null;
        }
        C1428470nHB.LIZJ(videoPublishEditModel3.creativeModel.draftInfoModel);
        new C1438570nXT("");
        VideoPublishEditModel videoPublishEditModel4 = ((ImageEditRootScene) awS126S0110000_8.l0).LLJL;
        if (videoPublishEditModel4 == null) {
            videoPublishEditModel4 = null;
        }
        C1438570nXT.LJ(videoPublishEditModel4, "save_draft").lastEditTime = System.currentTimeMillis();
        ImageEditRootScene imageEditRootScene3 = (ImageEditRootScene) awS126S0110000_8.l0;
        imageEditRootScene3.LLZIL = C0MPH.LIZLLL(imageEditRootScene3.requireActivity(), imageEditRootScene3.getString(2131846827));
        ImageEditRootScene.LLLZ(1105, true);
        VideoPublishEditModel videoPublishEditModel5 = ((ImageEditRootScene) awS126S0110000_8.l0).LLJL;
        if (videoPublishEditModel5 == null) {
            videoPublishEditModel5 = null;
        }
        C1428520nHG.LJLI(videoPublishEditModel5);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C540330LHb((ImageEditRootScene) awS126S0110000_8.l0, awS126S0110000_8.z1, null), 3);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS126S0110000_8 awS126S0110000_8) {
        ArrayList arrayList;
        int i;
        List listLJLLILLLL;
        List list = (List) awS126S0110000_8.l0;
        if (list != null && (listLJLLILLLL = C13LP.LJLLILLLL(list, new IntRange(0, 0))) != null) {
            arrayList = new ArrayList(listLJLLILLLL);
        } else {
            arrayList = null;
        }
        C537720L7a.LIZIZ.setValue(arrayList);
        if (awS126S0110000_8.z1) {
            i = 1;
        } else {
            i = 2;
        }
        C537720L7a.LIZ.setValue(Integer.valueOf(i));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS126S0110000_8 awS126S0110000_8) {
        Bundle extras;
        List<SingleImageData> arrayList;
        List<SingleImageData> imageList;
        C572850MdP c572850MdP = ((TextToImageChooseScene) awS126S0110000_8.l0).LLJLL;
        if (c572850MdP != null) {
            c572850MdP.iv();
        }
        if (!awS126S0110000_8.z1) {
            ((TextToImageChooseScene) awS126S0110000_8.l0).LLLLLL().LIZ(false);
        }
        TextToImageChooseScene textToImageChooseScene = (TextToImageChooseScene) awS126S0110000_8.l0;
        textToImageChooseScene.getEditModel().creativeModel.text2ImageModel.imageTaskList.clear();
        ImageAlbumData imageAlbumData = textToImageChooseScene.getEditModel().creativeModel.imageAlbumModel;
        if (imageAlbumData != null) {
            ImageAlbumData imageAlbumData2 = textToImageChooseScene.getEditModel().getImageAlbumData();
            if (imageAlbumData2 != null && (imageList = imageAlbumData2.getImageList()) != null) {
                arrayList = new ArrayList<>(imageList);
                C19719612Di.LJJIIJ(arrayList, AFwS239S0000000_8.get$arr$(137), true);
            } else {
                arrayList = C13BV.INSTANCE;
            }
            imageAlbumData.setImageList(arrayList);
        }
        C572240McQ c572240McQ = C572240McQ.LIZ;
        VideoPublishEditModel editModel = textToImageChooseScene.getEditModel();
        c572240McQ.getClass();
        C572240McQ.LIZJ(editModel);
        Intent intent = new Intent();
        C1428470nHB.LLIIZ(intent, textToImageChooseScene.getEditModel());
        if (C295710BiT.LIZ()) {
            C572050Mc7.LIZIZ(textToImageChooseScene.getEditModel());
        }
        if (textToImageChooseScene.LLLI) {
            intent.putExtra("direct_to_choose", true);
            Context context = (Context) textToImageChooseScene.LLLFF.getValue();
            try {
                extras = intent.getExtras();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                extras = null;
            }
            C0MWH.LJIILIIL(context, extras);
        }
        textToImageChooseScene.finish();
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS126S0110000_8 awS126S0110000_8) {
        if (awS126S0110000_8.z1) {
            ((C0M81) awS126S0110000_8.l0).LJIIL();
        }
        ((C0M81) awS126S0110000_8.l0).LJ();
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS126S0110000_8 awS126S0110000_8) {
        ((C0MRF) awS126S0110000_8.l0).LLLLIILL(false);
        if (awS126S0110000_8.z1) {
            ((C0MRF) awS126S0110000_8.l0).LLLLLIL(0, "");
            SmartImageView smartImageView = ((C0MRF) awS126S0110000_8.l0).LLLFF;
            if (smartImageView != null) {
                smartImageView.setBackgroundColor(-16777216);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$6(AwS126S0110000_8 awS126S0110000_8) {
        String str;
        String string;
        String str2;
        AIGC.RecallWay recallWay;
        AIPortraitTabFragment aIPortraitTabFragment = (AIPortraitTabFragment) awS126S0110000_8.l0;
        boolean z = awS126S0110000_8.z1;
        C19EG activity = aIPortraitTabFragment.getActivity();
        if (activity != null) {
            if (z) {
                C1389890mGx c1389890mGx = new C1389890mGx(activity);
                c1389890mGx.LJIIIZ(2131825806);
                c1389890mGx.LJIIJJI();
            } else {
                String strLIZ = C528840Koc.LIZ();
                AIPortraitTabViewModel aIPortraitTabViewModelPR = aIPortraitTabFragment.PR();
                aIPortraitTabViewModelPR.getClass();
                C1687150u0P c1687150u0P = C1687150u0P.LIZ;
                AIGCEntranceInfo aIGCEntranceInfoYQ2 = aIPortraitTabViewModelPR.yQ2();
                String str3 = aIPortraitTabViewModelPR.LLIZLLLIL;
                EnumC550780Liu enumC550780Liu = aIPortraitTabViewModelPR.LLJ;
                c1687150u0P.getClass();
                C548880Lfq c548880Lfq = C548880Lfq.LIZ;
                C2275181E3o c2275181E3o = C2275181E3o.LJII;
                AwS122S1100000_8 awS122S1100000_8 = new AwS122S1100000_8(str3, enumC550780Liu, 8);
                c548880Lfq.getClass();
                C548880Lfq.LIZLLL(c2275181E3o, aIGCEntranceInfoYQ2, awS122S1100000_8);
                aIPortraitTabViewModelPR.BQ2(strLIZ, false);
                AITheaterProfileService.LIZ.getClass();
                AITheaterProfileService aITheaterProfileServiceLIZ = C563290M7j.LIZ();
                if (aITheaterProfileServiceLIZ != null) {
                    SAALaunchParam sAALaunchParam = null;
                    Object[] objArr = 0;
                    Object[] objArr2 = 0;
                    C0LQY c0lqy = C0LQY.AI_PORTRAIT;
                    AIGCEntranceInfo aIGCEntranceInfo = aIPortraitTabFragment.LLJJ;
                    if (aIGCEntranceInfo != null) {
                        str = aIGCEntranceInfo.enterFrom;
                    } else {
                        str = null;
                    }
                    String str4 = "";
                    if (str == null) {
                        str = "";
                    }
                    if (aIGCEntranceInfo != null && (recallWay = aIGCEntranceInfo.recallWay) != null) {
                        string = recallWay.toString();
                    } else {
                        string = null;
                    }
                    AIGCEntranceInfo aIGCEntranceInfo2 = aIPortraitTabFragment.LLJJ;
                    if (aIGCEntranceInfo2 != null && (str2 = aIGCEntranceInfo2.shootWay) != null) {
                        str4 = str2;
                    }
                    AITheaterProfileEventModel aITheaterProfileEventModel = new AITheaterProfileEventModel(c0lqy, strLIZ, str, "ai_portrait_proactive_crt_create", string, str4, null, "ai_portrait", null, null, null, false, 3904);
                    Bundle bundleLIZIZ = new AIPortraitEnterParams(null, null, aIPortraitTabFragment.LLJJIII, aIPortraitTabFragment.LLJJ, aIPortraitTabFragment.LLJJI, false, null, null).LIZIZ();
                    C786410Ut5.LJJJI("extra_saa_scene_launch_mode", "SINGLE_TASK", bundleLIZIZ);
                    bundleLIZIZ.putBoolean("from_cameo_created_continue", true);
                    aITheaterProfileServiceLIZ.Y8(activity, new C531080KsE(true, "ai_theater_profile_intro", null, null, null, aITheaterProfileEventModel, false, false, true, new ProfileCustomConfig((SkipConfig) (objArr == true ? 1 : 0), new ContinueConfig("//ai_portrait/tab", bundleLIZIZ, sAALaunchParam, objArr2 == true ? 1 : 0, 12), 3), 220), null);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS126S0110000_8 awS126S0110000_8) {
        Function1<? super Boolean, Unit> function1 = ((C569450MVb) awS126S0110000_8.l0).LLJ;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(awS126S0110000_8.z1));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS126S0110000_8(C0M81 c0m81, int i) {
        super(0);
        this.$t = i;
        this.z1 = true;
        this.l0 = c0m81;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS126S0110000_8(C0L2U c0l2u, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0l2u;
        this.z1 = false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS126S0110000_8(C0MRF c0mrf, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c0mrf;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS126S0110000_8(C569450MVb c569450MVb, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = c569450MVb;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS126S0110000_8(ImageEditRootScene imageEditRootScene, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = imageEditRootScene;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS126S0110000_8(AIPortraitTabFragment aIPortraitTabFragment, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = aIPortraitTabFragment;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS126S0110000_8(TextToImageChooseScene textToImageChooseScene, boolean z, int i) {
        super(0);
        this.$t = i;
        this.l0 = textToImageChooseScene;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS126S0110000_8(List list, List<? extends AVMusic> list2, boolean z) {
        super(0);
        this.$t = z ? 1 : 0;
        this.l0 = list;
        this.z1 = list2;
    }
}
