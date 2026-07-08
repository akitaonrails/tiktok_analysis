package com.ss.android.ugc.aweme.services;

import X.AbstractC1387200mCc;
import X.AnonymousClass0958;
import X.C01GW;
import X.C099R;
import X.C09AX;
import X.C09DV;
import X.C0BMN;
import X.C0C64;
import X.C0ET4;
import X.C0LGM;
import X.C0MOA;
import X.C0MOZ;
import X.C0WZX;
import X.C1017903yT;
import X.C1388190mED;
import X.C1397950mTx;
import X.C1399570mWZ;
import X.C139V;
import X.C13LQ;
import X.C1439190nYT;
import X.C1443540nfU;
import X.C155000ia;
import X.C1631530sYh;
import X.C1651810t5P;
import X.C1659700tI8;
import X.C1906580ziK;
import X.C19A3;
import X.C19EG;
import X.C1C7U;
import X.C20622515mp;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C286960BMo;
import X.C297750Bll;
import X.C338630DPh;
import X.C452501pT;
import X.C539900LFk;
import X.C539960LFq;
import X.C577670MlB;
import X.C577680MlC;
import X.C577690MlD;
import X.C577710MlF;
import X.C577750MlJ;
import X.C577800MlO;
import X.C577820MlQ;
import X.C577830MlR;
import X.C577840MlS;
import X.C577850MlT;
import X.C577940Mlc;
import X.C577950Mld;
import X.C577960Mle;
import X.C577980Mlg;
import X.C578010Mlj;
import X.C578130Mlv;
import X.C579120MnW;
import X.C579470Mo5;
import X.C861730XrH;
import X.EnumC1642750sqn;
import X.EnumC1647570syZ;
import X.InterfaceC1364105Vn;
import X.InterfaceC1651990t5h;
import X.InterfaceC1675320thK;
import X.InterfaceC20597015ii;
import X.InterfaceC497601wk;
import X.InterfaceC533840Kwg;
import X.InterfaceC537150L4v;
import X.InterfaceC577910MlZ;
import X.InterfaceC578020Mlk;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.canvas.CanvasExtra;
import com.ss.android.ugc.aweme.canvas.CanvasGestureConfig;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.canvas.ForwardCanvasExtra;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.beauty.BeautifySegmentInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import dmt.av.video.SingleImageCoverBitmapData;
import java.util.LinkedHashMap;
import jgp.h;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS234S0300000_25;
import kotlin.jvm.internal.AwS374S0200000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.Intrinsics;
import lth.o;
import njp.a;

/* JADX INFO: loaded from: classes9.dex */
public final class InternalRecordServiceImpl implements InterfaceC577910MlZ {
    public final C01GW mMaxDurationResolver$delegate = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(112));

    @Override // X.InterfaceC577910MlZ
    public boolean shouldDropCurrentMusicFor3min(Object obj, ShortVideoContext shortVideoContext) {
        return false;
    }

    private final InternalMaxDurationResolverImpl getMMaxDurationResolver() {
        return (InternalMaxDurationResolverImpl) this.mMaxDurationResolver$delegate.getValue();
    }

    @Override // X.InterfaceC577910MlZ
    public InterfaceC578020Mlk getABService() {
        return new InterfaceC578020Mlk() { // from class: com.ss.android.ugc.aweme.services.InternalRecordServiceImpl.getABService.1
            public boolean enableEditProInNowTab() {
                return C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_editor_pro_enable_new_photo_canvas", true) == 1 && C338630DPh.LIZ();
            }

            @Override // X.InterfaceC578020Mlk
            public boolean getButtonPositionGoDownExperiment() {
                return C578130Mlv.LIZJ();
            }
        };
    }

    @Override // X.InterfaceC577910MlZ
    public InterfaceC533840Kwg getAlbumService() {
        return new AlbumServiceImpl();
    }

    @Override // X.InterfaceC577910MlZ
    public InterfaceC1675320thK getNowUIService() {
        return new NowUIServiceImpl();
    }

    @Override // X.InterfaceC577910MlZ
    public void preloadVESoAsync() {
        preloadVESoAsync(0L);
    }

    @Override // X.InterfaceC577910MlZ
    public boolean enable3MinRecord() {
        return C577980Mlg.LIZIZ();
    }

    @Override // X.InterfaceC577910MlZ
    public InterfaceC537150L4v getMaxDurationResolver() {
        return getMMaxDurationResolver();
    }

    @Override // X.InterfaceC577910MlZ
    public boolean isRecordingOrEditing() {
        Activity activityLIZIZ;
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        Activity activityLIZ = (abstractC1387200mCcLJ == null || (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) == null) ? null : C1388190mED.LIZ(activityLIZIZ);
        if (C577960Mle.LIZ(activityLIZ) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PublishParallel isRecordingOrEditing result: VideoRecordNewActivity ");
            sbLIZ.append(C20622515mp.LJIJ((C19EG) activityLIZ).getLifecycle().getCurrentState());
            C577950Mld.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            return true;
        }
        InterfaceC20597015ii interfaceC20597015iiLIZJ = C20622515mp.LIZJ(activityLIZ);
        if (!((interfaceC20597015iiLIZJ != null ? interfaceC20597015iiLIZJ.LC() : null) instanceof VideoEditContainerScene)) {
            return false;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("PublishParallel isRecordingOrEditing result: VEVideoPublishEditActivity ");
        sbLIZ2.append(C20622515mp.LJIJ((C19EG) activityLIZ).getLifecycle().getCurrentState());
        C577950Mld.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        return true;
    }

    @Override // X.InterfaceC577910MlZ
    public void preloadEffectModel() {
        o.LIZLLL();
        new h().run();
    }

    /* JADX INFO: renamed from: com.ss.android.ugc.aweme.services.InternalRecordServiceImpl$preloadVESoAsync$2, reason: invalid class name */
    @C09DV(c = "com.ss.android.ugc.aweme.services.InternalRecordServiceImpl$preloadVESoAsync$2", f = "InternalRecordServiceImpl.kt", l = {444}, m = "invokeSuspend")
    public final class AnonymousClass2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
        public final /* synthetic */ long $delayInMillis;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(long j, InterfaceC1364105Vn<? super AnonymousClass2> interfaceC1364105Vn) {
            super(2, interfaceC1364105Vn);
            this.$delayInMillis = j;
        }

        @Override // njp.a
        public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
            return new AnonymousClass2(this.$delayInMillis, interfaceC1364105Vn);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
        }

        @Override // njp.a
        public final Object invokeSuspend(Object obj) {
            C1C7U.LIZ("InternalRecordServiceImpl@a70c.preloadVESoAsync$2");
            Object objLJFF = C099R.LJFF();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                long j = this.$delayInMillis;
                if (j > 0) {
                    this.label = 1;
                    if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                        C1C7U.LIZIZ("InternalRecordServiceImpl@a70c.preloadVESoAsync$2");
                        return objLJFF;
                    }
                }
            }
            C0LGM.LIZ().preLoadVESo();
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("InternalRecordServiceImpl@a70c.preloadVESoAsync$2");
            return unit;
        }
    }

    public static Bundle INVOKEVIRTUAL_com_ss_android_ugc_aweme_services_InternalRecordServiceImpl_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    private final int getDefaultShootMode(ShortVideoContext shortVideoContext) {
        AVMusic aVMusicExtractAVMusic;
        int iIntValue;
        int i = shortVideoContext.cameraComponentModel.mRestoreType;
        if (i != 1) {
            if (i != 2) {
                if (shortVideoContext.isRestoreFromSaveInstance) {
                    return shortVideoContext.shootMode;
                }
                int iLIZIZ = rlf.a.LIZ.LIZIZ(shortVideoContext, new AwS552S0100000_8(shortVideoContext, 164));
                if (iLIZIZ != -1) {
                    return iLIZIZ;
                }
                C579470Mo5.LIZ.getClass();
                if (C579470Mo5.LIZJ(shortVideoContext)) {
                    return 16;
                }
                if ((C1399570mWZ.LIZ() && C578010Mlj.LIZ) || !C0C64.LJIILLIIL().LJIIIZ(31744, "studio_support_landing_tab_by_single_song", true, false)) {
                    return -1;
                }
                if (C13LQ.LJJIJIIJI(shortVideoContext.shootWay, new String[]{"single_song", "prop_page", "draft_again"}) < 0 || (aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(shortVideoContext.creativeModel.musicBuzModel)) == null) {
                    return -1;
                }
                long jLIZIZ = C579120MnW.LIZIZ(aVMusicExtractAVMusic);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(aVMusicExtractAVMusic.getMusicId());
                sbLIZ.append('_');
                sbLIZ.append(aVMusicExtractAVMusic.getMusicBeginTime());
                sbLIZ.append('_');
                sbLIZ.append(aVMusicExtractAVMusic.getMusicEndTime());
                sbLIZ.append('_');
                sbLIZ.append(aVMusicExtractAVMusic.getMusicStartFromCut());
                sbLIZ.append('_');
                sbLIZ.append(aVMusicExtractAVMusic.getMusicEndFromCut());
                Integer num = (Integer) ((LinkedHashMap) C579120MnW.LIZ).get(C2188811AlT.LIZIZ(sbLIZ));
                if (num != null && (iIntValue = num.intValue()) > 0 && Intrinsics.LJFF(shortVideoContext.shootWay, "draft_again") && !aVMusicExtractAVMusic.isLoopMusic()) {
                    jLIZIZ = Math.min(jLIZIZ, iIntValue);
                }
                if (jLIZIZ <= 15000) {
                    return 10;
                }
                if (jLIZIZ <= 60000) {
                    return 11;
                }
                return 18;
            }
            return C1439190nYT.LIZIZ().shootMode;
        }
        return shortVideoContext.shootMode;
    }

    private final String getDefaultShootTabTagOrigin(ShortVideoContext shortVideoContext) {
        return getDefaultTag(getDefaultShootMode(shortVideoContext), shortVideoContext);
    }

    private final String replace3minTo10min(String str) {
        if (((Boolean) C286960BMo.LIZ.getValue()).booleanValue() && C577940Mlc.LIZ() != 0) {
            C1631530sYh.LIZ.getClass();
            if (Intrinsics.LJFF(str, C1631530sYh.LIZLLL)) {
                return C1631530sYh.LJ;
            }
            return str;
        }
        return str;
    }

    @Override // X.InterfaceC577910MlZ
    public ShortVideoContext createShortVideoContext(Intent intent) {
        return C1443540nfU.LIZIZ(INVOKEVIRTUAL_com_ss_android_ugc_aweme_services_InternalRecordServiceImpl_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras(intent));
    }

    @Override // X.InterfaceC577910MlZ
    public Activity findActivityInstance(Class<? extends C19EG> cls) {
        Application application = o.LIZ;
        C139V c139v = C861730XrH.LIZ;
        if (c139v.LJ) {
            for (AbstractC1387200mCc abstractC1387200mCc : c139v.LIZ) {
                if (abstractC1387200mCc instanceof C1397950mTx) {
                    Activity activity = ((C1397950mTx) abstractC1387200mCc).LIZLLL;
                    if (TextUtils.equals(activity.getClass().getName(), cls.getName()) || TextUtils.equals(C2204961BRm.LJJIJIIJIL(activity.getComponentName(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPqncYuA1Tzm0Yzk6kBE1k+X89ld4owDTWPJYrpDeec=", null)), cls.getName())) {
                        return activity;
                    }
                }
            }
        }
        return null;
    }

    @Override // X.InterfaceC577910MlZ
    public String getDefaultShootTabTag(ShortVideoContext shortVideoContext) {
        return replace3minTo10min(getDefaultShootTabTagOrigin(shortVideoContext));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    @Override // X.InterfaceC577910MlZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void preloadVESoAsync(long r8) {
        /*
            r7 = this;
            X.13nc r0 = X.C0LGM.LIZ()
            com.ss.android.ugc.aweme.services.PreloadVESoStatus r1 = r0.LIZ
            com.ss.android.ugc.aweme.services.PreloadVESoStatus r0 = com.ss.android.ugc.aweme.services.PreloadVESoStatus.UNLOAD
            if (r1 == r0) goto Lb
            return
        Lb:
            java.lang.Class<com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService> r1 = com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService.class
            r2 = 0
            r5 = 14
            r6 = 0
            r3 = r2
            r4 = r2
            java.lang.Object r1 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r1, r2, r3, r4, r5, r6)
            com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService r1 = (com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService) r1
            if (r1 == 0) goto L51
            X.0XAv r0 = X.C844470XAv.LIZ
            r0.getClass()
            android.content.Context r0 = X.C844470XAv.LIZ()
            boolean r1 = r1.LJI(r0)
            r0 = 1
            if (r1 != r0) goto L51
        L2b:
            if (r0 != 0) goto L53
            X.01GW r0 = X.C282990B7h.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L50
            java.lang.Class<com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService> r1 = com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService.class
            r3 = r2
            r4 = r2
            java.lang.Object r2 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r1, r2, r3, r4, r5, r6)
            com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService r2 = (com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService) r2
            if (r2 == 0) goto L50
            kotlin.jvm.internal.AwS49S0000100_8 r1 = new kotlin.jvm.internal.AwS49S0000100_8
            r0 = 0
            r1.<init>(r8, r0)
            r2.LJIIIIZZ(r1, r6)
        L50:
            return
        L51:
            r0 = 0
            goto L2b
        L53:
            X.1DFB r0 = X.C0PEM.LIZJ
            X.054G r2 = X.C2296808zG.LIZ(r0)
            com.ss.android.ugc.aweme.services.InternalRecordServiceImpl$preloadVESoAsync$2 r1 = new com.ss.android.ugc.aweme.services.InternalRecordServiceImpl$preloadVESoAsync$2
            r1.<init>(r8, r6)
            r0 = 3
            X.C23250099c.LIZLLL(r2, r6, r6, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.services.InternalRecordServiceImpl.preloadVESoAsync(long):void");
    }

    @Override // X.InterfaceC577910MlZ
    public boolean shouldDisable10MinDraftRecord(VideoPublishEditModel videoPublishEditModel) {
        if (C577940Mlc.LIZ() == 0 && videoPublishEditModel.getOriginal() == 1 && videoPublishEditModel.getShootMode() == 18) {
            return true;
        }
        return false;
    }

    private final String getDefaultTag(int i, ShortVideoContext shortVideoContext) {
        EnumC1647570syZ enumC1647570syZ;
        if (i != 10) {
            if (i != 11) {
                if (i != 14) {
                    if (i != 16) {
                        if (i != 18) {
                            if (shortVideoContext.cameraComponentModel.mCurrentDurationMode) {
                                if (C577980Mlg.LIZIZ()) {
                                    enumC1647570syZ = EnumC1647570syZ.RECORD_COMBINE_180;
                                } else {
                                    enumC1647570syZ = EnumC1647570syZ.RECORD_COMBINE_60;
                                }
                                return enumC1647570syZ.getTag();
                            }
                            return EnumC1647570syZ.RECORD_COMBINE_15.getTag();
                        }
                        return EnumC1647570syZ.RECORD_COMBINE_600.getTag();
                    }
                    return EnumC1647570syZ.RECORD_NOW.getTag();
                }
                return EnumC1647570syZ.RECORD_COMBINE_180.getTag();
            }
            return EnumC1647570syZ.RECORD_COMBINE_60.getTag();
        }
        return EnumC1647570syZ.RECORD_COMBINE_15.getTag();
    }

    public Intent createPhotoCanvasGoNextIntent(C19EG c19eg, ShortVideoContext shortVideoContext) {
        C577690MlD c577690MlD = new C577690MlD(c19eg, shortVideoContext, false, null, null, System.currentTimeMillis(), -1);
        c577690MlD.LIZ();
        return C577680MlC.LIZ(c577690MlD);
    }

    @Override // X.InterfaceC577910MlZ
    public String getBottomTabTag(int i, ShortVideoContext shortVideoContext) {
        return getDefaultTag(i, shortVideoContext);
    }

    @Override // X.InterfaceC577910MlZ
    public int getTabNameResId(int i, ShortVideoContext shortVideoContext) {
        EnumC1647570syZ enumC1647570syZ;
        if (i != 10) {
            if (i != 11) {
                if (i != 14) {
                    if (i != 16) {
                        if (i != 18) {
                            if (shortVideoContext.cameraComponentModel.mCurrentDurationMode) {
                                if (C577980Mlg.LIZIZ()) {
                                    enumC1647570syZ = EnumC1647570syZ.RECORD_COMBINE_180;
                                } else {
                                    enumC1647570syZ = EnumC1647570syZ.RECORD_COMBINE_60;
                                }
                                return enumC1647570syZ.getNameResId();
                            }
                            return EnumC1647570syZ.RECORD_COMBINE_15.getNameResId();
                        }
                        return EnumC1647570syZ.RECORD_COMBINE_600.getNameResId();
                    }
                    if (C297750Bll.LIZ()) {
                        return 2131828279;
                    }
                    return 2131828278;
                }
                return EnumC1647570syZ.RECORD_COMBINE_180.getNameResId();
            }
            return EnumC1647570syZ.RECORD_COMBINE_60.getNameResId();
        }
        return EnumC1647570syZ.RECORD_COMBINE_15.getNameResId();
    }

    @Override // X.InterfaceC577910MlZ
    public void isAiVideoPhotoModeBackPressed(ShortVideoContext shortVideoContext, Activity activity) {
        C577670MlB c577670MlB = C577670MlB.LIZ;
        C577820MlQ c577820MlQ = new C577820MlQ(activity, new C577850MlT(shortVideoContext, true, ""));
        c577670MlB.getClass();
        C577670MlB.LIZ(c577820MlQ);
    }

    @Override // X.InterfaceC577910MlZ
    public void photoCanvasGoEditPage(C577710MlF c577710MlF, CanvasVideoData canvasVideoData, SingleImageCoverBitmapData singleImageCoverBitmapData) throws Throwable {
        C577670MlB.LIZ.getClass();
        C577670MlB.LJ(c577710MlF, canvasVideoData, singleImageCoverBitmapData);
    }

    public void registerOldPhotoToolbarComponent(C539960LFq c539960LFq, C19A3 c19a3, int i) {
        EnumC1642750sqn enumC1642750sqn = EnumC1642750sqn.IMMEDIATE;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("register component ");
        sbLIZ.append(C1651810t5P.class.getName());
        sbLIZ.append(" api ");
        sbLIZ.append(InterfaceC1651990t5h.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        c539960LFq.LIZ.LIZ(c539960LFq.LIZIZ, enumC1642750sqn, null, InterfaceC1651990t5h.class, C1651810t5P.class, new AwS234S0300000_25(new C0ET4(), c539960LFq, c19a3, 8));
    }

    @Override // X.InterfaceC577910MlZ
    public void goToPhotoEditInImageMode(C19EG c19eg, String str, ShortVideoContext shortVideoContext, FaceStickerBean faceStickerBean, BeautifySegmentInfo beautifySegmentInfo, int i, AIGCInfo aIGCInfo, Function1<? super Boolean, Unit> function1) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        SingleImageCoverBitmapData singleImageCoverBitmapData = new SingleImageCoverBitmapData(str, options.outWidth, System.currentTimeMillis(), 1, options.outWidth, options.outHeight, C1017903yT.LIZ(), false);
        if (C0BMN.LIZ()) {
            C577670MlB c577670MlB = C577670MlB.LIZ;
            C577830MlR c577830MlR = new C577830MlR(new C577750MlJ(c19eg, str, null, shortVideoContext, faceStickerBean, beautifySegmentInfo, i, aIGCInfo, function1), singleImageCoverBitmapData);
            c577670MlB.getClass();
            C577670MlB.LIZ(c577830MlR);
            return;
        }
        C577840MlS c577840MlS = new C577840MlS(new C577710MlF(c19eg, str, null, shortVideoContext, faceStickerBean, beautifySegmentInfo, i, false, null, null, null, function1));
        C0MOZ c0moz = new C0MOZ();
        c0moz.LIZ = str;
        CanvasVideoData canvasVideoDataLIZLLL = C0MOA.LIZLLL(c0moz, c577840MlS.LIZ.LIZJ);
        if (C539900LFk.LJI(shortVideoContext)) {
            canvasVideoDataLIZLLL.setExtra(new CanvasExtra(0, 0, 0, 0, 0, 0.15f, 20.0f, false, new CanvasGestureConfig(true, true, true, true, false, 2, false, false, false), new ForwardCanvasExtra(10, 0, null, -1, false, null, null, null, -12.0f, null, null, 8, false, 1), 1.0f, 0L, 0));
        }
        if (aIGCInfo != null) {
            canvasVideoDataLIZLLL.setAigcInfo(aIGCInfo);
        }
        canvasVideoDataLIZLLL.setNewGreenScreenEffectModel(shortVideoContext.creativeModel.newGreenScreenEffectModel.deepCopy());
        C577670MlB c577670MlB2 = C577670MlB.LIZ;
        C577800MlO c577800MlO = new C577800MlO(c577840MlS.LIZ, canvasVideoDataLIZLLL, singleImageCoverBitmapData);
        c577670MlB2.getClass();
        C577670MlB.LIZ(c577800MlO);
    }

    @Override // X.InterfaceC577910MlZ
    public void photoCanvasGoNext(C19EG c19eg, String str, ShortVideoContext shortVideoContext, FaceStickerBean faceStickerBean, boolean z, MediaModel mediaModel, Long l, Function1<? super Boolean, Unit> function1) {
        C577710MlF c577710MlF = new C577710MlF(c19eg, str, null, shortVideoContext, faceStickerBean, null, -1, z, null, mediaModel, l, new AwS374S0200000_8(c19eg, (C19EG) function1, (Function1<? super Boolean, Unit>) 40));
        C577670MlB c577670MlB = C577670MlB.LIZ;
        C577840MlS c577840MlS = new C577840MlS(c577710MlF);
        c577670MlB.getClass();
        C577670MlB.LIZ(c577840MlS);
    }

    @Override // X.InterfaceC577910MlZ
    public void goToEditForCanvasPhoto(C19EG c19eg, String str, ShortVideoContext shortVideoContext, FaceStickerBean faceStickerBean, BeautifySegmentInfo beautifySegmentInfo, int i, AIGCInfo aIGCInfo, boolean z, Function1<? super Boolean, Unit> function1) throws Throwable {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        SingleImageCoverBitmapData singleImageCoverBitmapData = new SingleImageCoverBitmapData(str, options.outWidth, System.currentTimeMillis(), 1, options.outWidth, options.outHeight, C1017903yT.LIZ(), false);
        C577840MlS c577840MlS = new C577840MlS(new C577710MlF(c19eg, str, null, shortVideoContext, faceStickerBean, beautifySegmentInfo, i, z, null, null, null, function1));
        C0MOZ c0moz = new C0MOZ();
        c0moz.LIZ = str;
        CanvasVideoData canvasVideoDataLIZLLL = C0MOA.LIZLLL(c0moz, c577840MlS.LIZ.LIZJ);
        if (C539900LFk.LJI(shortVideoContext)) {
            canvasVideoDataLIZLLL.setExtra(new CanvasExtra(0, 0, 0, 0, 0, 0.15f, 20.0f, false, new CanvasGestureConfig(true, true, true, true, false, 2, false, false, false), new ForwardCanvasExtra(10, 0, null, -1, false, null, null, null, -12.0f, null, null, 8, false, 1), 1.0f, 0L, 0));
        }
        if (aIGCInfo != null) {
            canvasVideoDataLIZLLL.setAigcInfo(aIGCInfo);
        }
        canvasVideoDataLIZLLL.setNewGreenScreenEffectModel(shortVideoContext.creativeModel.newGreenScreenEffectModel.deepCopy());
        C577670MlB c577670MlB = C577670MlB.LIZ;
        C577710MlF c577710MlF = c577840MlS.LIZ;
        c577670MlB.getClass();
        C577670MlB.LJ(c577710MlF, canvasVideoDataLIZLLL, singleImageCoverBitmapData);
    }
}
