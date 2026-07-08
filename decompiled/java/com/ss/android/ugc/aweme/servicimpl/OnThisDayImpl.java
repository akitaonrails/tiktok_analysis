package com.ss.android.ugc.aweme.servicimpl;

import X.AbstractC470910IdN;
import X.C0JEY;
import X.C0L3H;
import X.C0MMK;
import X.C0MQ1;
import X.C13BV;
import X.C13LE;
import X.C1439880nZa;
import X.C1443540nfU;
import X.C19EG;
import X.C1A6I;
import X.C536540L2m;
import X.C565650MGl;
import X.C566780MKu;
import X.C786410Ut5;
import X.EnumC485010J0h;
import X.InterfaceC522520KeQ;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.LiveData;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.creative.model.CelebrationData;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.services.onthisday.OnThisDayService;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.onthisday.material.MaterialSelectScene;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.onthisday.material.viewmodel.CombinedMaterialListViewModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class OnThisDayImpl implements OnThisDayService {
    @Override // com.ss.android.ugc.aweme.services.onthisday.OnThisDayService
    public final Class<?> getMaterialSelectSceneClass() {
        return MaterialSelectScene.class;
    }

    @Override // com.ss.android.ugc.aweme.services.onthisday.OnThisDayService
    public final void cleanUpMaterialSelectScene(Scene scene) {
        AbstractC470910IdN abstractC470910IdNLJIIJ;
        CombinedMaterialListViewModel combinedMaterialListViewModel = (CombinedMaterialListViewModel) C0JEY.LIZ(scene, C13LE.LIZ(CombinedMaterialListViewModel.class), new AwS551S0100000_7(scene, 416), null).getValue();
        C1A6I c1a6i = (C1A6I) ((LiveData) combinedMaterialListViewModel.LLILZIL.getValue()).getValue();
        if (c1a6i != null && (abstractC470910IdNLJIIJ = c1a6i.LJIIJ()) != null) {
            abstractC470910IdNLJIIJ.LIZJ();
        }
        combinedMaterialListViewModel.LLILLJJLI.setValue(EnumC485010J0h.INITIAL_LOADING);
        combinedMaterialListViewModel.LLILZLL.setValue(C13BV.INSTANCE);
        ((ArrayList) combinedMaterialListViewModel.LLIZLLLIL).clear();
        ((ArrayList) combinedMaterialListViewModel.LLJ).clear();
    }

    @Override // com.ss.android.ugc.aweme.services.onthisday.OnThisDayService
    public final Object createShortVideoContext(Bundle bundle) {
        return C1443540nfU.LIZIZ(bundle);
    }

    @Override // com.ss.android.ugc.aweme.services.onthisday.OnThisDayService
    public final Pair<Integer, Integer> getOutVideoSize(Object obj) {
        VideoPublishEditModel videoPublishEditModel;
        if (obj instanceof VideoPublishEditModel) {
            videoPublishEditModel = (VideoPublishEditModel) obj;
        } else {
            videoPublishEditModel = null;
        }
        if (videoPublishEditModel == null) {
            return new Pair<>(0, 0);
        }
        int[] iArrLJFF = C1439880nZa.LJFF(videoPublishEditModel);
        return new Pair<>(Integer.valueOf(iArrLJFF[0]), Integer.valueOf(iArrLJFF[1]));
    }

    @Override // com.ss.android.ugc.aweme.services.onthisday.OnThisDayService
    public final void insertChallengeIfNeed(Intent intent, CreativeModel creativeModel, Context context) {
        int iIntValue;
        Integer celebrationType;
        List list;
        List list2 = null;
        if (creativeModel.onThisDayData.isFromOnThisDay() && C566780MKu.LIZ(creativeModel)) {
            Serializable serializableExtra = intent.getSerializableExtra("challenge");
            if (serializableExtra instanceof List) {
                list = (List) serializableExtra;
            } else {
                list = null;
            }
            String string = context.getString(2131821884);
            if (list != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.LJFF(((AVChallenge) it2.next()).challengeName, string)) {
                        return;
                    }
                }
            }
            ArrayList arrayList = new ArrayList(list);
            AVChallenge aVChallenge = new AVChallenge();
            aVChallenge.challengeName = string;
            arrayList.add(aVChallenge);
            intent.putExtra("challenge", arrayList);
        }
        CelebrationData celebrationData = creativeModel.celebrationData;
        if (celebrationData != null && (celebrationType = celebrationData.getCelebrationType()) != null) {
            iIntValue = celebrationType.intValue();
        } else {
            iIntValue = 0;
        }
        if (C0MQ1.LIZJ(iIntValue)) {
            Serializable serializableExtra2 = intent.getSerializableExtra("challenge");
            if (serializableExtra2 instanceof List) {
                list2 = (List) serializableExtra2;
            }
            String string2 = context.getString(2131833996);
            if (list2 != null) {
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    if (Intrinsics.LJFF(((AVChallenge) it3.next()).challengeName, string2)) {
                        return;
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList(list2);
            AVChallenge aVChallenge2 = new AVChallenge();
            aVChallenge2.challengeName = string2;
            arrayList2.add(aVChallenge2);
            intent.putExtra("challenge", arrayList2);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.onthisday.OnThisDayService
    public final InterfaceC522520KeQ getMediaChosenResultProcess(int i, final C19EG c19eg, Object obj, final long j, final long j2) {
        if (i == 0) {
            return new C0L3H(c19eg);
        }
        final ShortVideoContext shortVideoContext = (ShortVideoContext) obj;
        return new C536540L2m(c19eg, shortVideoContext, j, j2) { // from class: X.0L2o
            public final ShortVideoContext LLILZLL;
            public final C0L3D LLIZ;

            @Override // X.C536540L2m
            public final InterfaceC533910Kwn LJ() {
                return this.LLIZ;
            }

            {
                super(c19eg, j, j2);
                this.LLILZLL = shortVideoContext;
                this.LLIZ = new C0L3D(c19eg, this.LLILZLL, j, j2);
            }

            @Override // X.C536540L2m
            public final Intent LIZLLL(Activity activity, ShortVideoContext shortVideoContext2, int i2, long j3, String str) {
                Intent intentLIZLLL = super.LIZLLL(activity, shortVideoContext2, i2, j3, str);
                intentLIZLLL.putExtra("extra_saa_scene_force_disable_translucent", true);
                intentLIZLLL.putExtra("shoot_way", shortVideoContext2.shootWay);
                return intentLIZLLL;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.services.onthisday.OnThisDayService
    public final void startMaterialSelectScene(Scene scene, Bundle bundle, C0MMK c0mmk, Object obj, int i, Integer num, int i2) {
        ShortVideoContext shortVideoContext;
        if (obj instanceof ShortVideoContext) {
            shortVideoContext = (ShortVideoContext) obj;
        } else {
            shortVideoContext = null;
        }
        C786410Ut5.LJJIZ(bundle, "forward_config", c0mmk);
        C786410Ut5.LJJIJL(bundle, "short_video_context", shortVideoContext);
        bundle.putInt("material_select_config_scene", i);
        bundle.putInt("celebration_type", i2);
        C565650MGl.LIZ(scene, bundle, num, i, i2);
    }

    @Override // com.ss.android.ugc.aweme.services.onthisday.OnThisDayService
    public final void startMaterialSelectScene(Scene scene, List<ForwardMedia> list, List<ForwardMedia> list2, C0MMK c0mmk, Object obj, int i, Integer num, int i2) {
        ShortVideoContext shortVideoContext;
        if (obj instanceof ShortVideoContext) {
            shortVideoContext = (ShortVideoContext) obj;
        } else {
            shortVideoContext = null;
        }
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIZ(bundle, "forward_media_list", (Serializable) list);
        C786410Ut5.LJJIZ(bundle, "forward_config", c0mmk);
        C786410Ut5.LJJIZ(bundle, "default_select_forward_media", (Serializable) list2);
        C786410Ut5.LJJIJL(bundle, "short_video_context", shortVideoContext);
        bundle.putInt("material_select_config_scene", i);
        bundle.putInt("celebration_type", i2);
        C565650MGl.LIZ(scene, bundle, num, i, i2);
    }
}
