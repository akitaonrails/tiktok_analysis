package com.ss.android.ugc.aweme.social.sendtodm;

import X.AbstractC2255721DQs;
import X.C01GW;
import X.C05YF;
import X.C09R3;
import X.C0I0B;
import X.C0LAB;
import X.C13BV;
import X.C13DA;
import X.C13LE;
import X.C13LP;
import X.C1408610ml9;
import X.C1413430msv;
import X.C1428470nHB;
import X.C1428630nHR;
import X.C1431800nMY;
import X.C1431840nMc;
import X.C1441980ncy;
import X.C14D2;
import X.C15438062q;
import X.C1599690rjL;
import X.C1664770tQJ;
import X.C1697810uHb;
import X.C19EG;
import X.C1DRG;
import X.C20622515mp;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C295010BhL;
import X.C452501pT;
import X.C564410MBr;
import X.C571330Max;
import X.C572310McX;
import X.C573570MeZ;
import X.InterfaceC1408520ml0;
import X.InterfaceC1428690nHX;
import X.InterfaceC1429470nIn;
import X.InterfaceC1431860nMe;
import X.InterfaceC1451050nrb;
import X.InterfaceC1452170ntP;
import X.InterfaceC1455680nz4;
import X.InterfaceC1460000o62;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC379610EuV;
import Y.AObserverS225S0100000_22;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.DMMediaModel;
import com.ss.android.ugc.aweme.creative.model.LandingModel;
import com.ss.android.ugc.aweme.creative.model.ailive.UsageStatus;
import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.draft.model.DraftEditTransferModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.sharepanel.api.IMSharePanelApi;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.services.dm.DMCreativeMobConstants;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editor.services.IDMCreativeEditService;
import com.ss.android.ugc.tools.IAiChatFeatureService;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS137S1200000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.AwS636S0100000_22;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes23.dex */
public final class MultiImageSendToDMComponent extends AbstractC2255721DQs<InterfaceC1431860nMe> implements InterfaceC1431860nMe, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public static final int LLJILJILJ;
    public final C1DRG LL;
    public final Activity LLILLJJLI;
    public final Scene LLILLL;
    public boolean LLJ;
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1460000o62.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1408520ml0.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1451050nrb.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1455680nz4.class, null);
    public final C01GW LLJI = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(181));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 381));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MultiImageSendToDMComponent.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(MultiImageSendToDMComponent.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(MultiImageSendToDMComponent.class, "saveAndPublishApiComponent", "getSaveAndPublishApiComponent()Lcom/ss/android/ugc/aweme/image/SaveAndPublishApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(MultiImageSendToDMComponent.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/image/preview/ImageEditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(MultiImageSendToDMComponent.class, "aiLivePhotoApi", "getAiLivePhotoApi()Lcom/ss/android/ugc/gamora/editor/ailive/AILivePhotoApi;", 0);
        c09r3.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
        LLJILJILJ = 8;
    }

    public InterfaceC1431860nMe Z1() {
        return this;
    }

    @Override // X.InterfaceC1431860nMe
    public String lw() {
        return "MultiImageSendToDMComponent";
    }

    @Override // X.InterfaceC1431860nMe
    public void p(String str) {
    }

    @Override // X.InterfaceC1431860nMe
    public void uu(String str) {
    }

    private final C1408610ml9 H2() {
        return (C1408610ml9) this.LLJIJIL.getValue();
    }

    private final InterfaceC1451050nrb w2() {
        return (InterfaceC1451050nrb) this.LLIZ.getValue(this, LLJILJIL[3]);
    }

    public final InterfaceC1460000o62 G2() {
        return (InterfaceC1460000o62) this.LLILZIL.getValue(this, LLJILJIL[1]);
    }

    @Override // X.InterfaceC1431860nMe
    public void MA0() {
        if (this.LLJ) {
            return;
        }
        this.LLJ = true;
        IMSharePanelApi.LIZ.getClass();
        C1599690rjL.LIZ().LJ().LIZIZ(null, C0I0B.LJFF.LIZIZ());
    }

    public final VideoPublishEditModel T2() {
        return (VideoPublishEditModel) this.LLILZ.getValue(this, LLJILJIL[0]);
    }

    public final InterfaceC1408520ml0 W2() {
        return (InterfaceC1408520ml0) this.LLILZLL.getValue(this, LLJILJIL[2]);
    }

    public final InterfaceC1455680nz4 X1() {
        return (InterfaceC1455680nz4) this.LLIZLLLIL.getValue(this, LLJILJIL[4]);
    }

    public final IDMCreativeEditService o2() {
        return (IDMCreativeEditService) this.LLJI.getValue();
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        LiveData<Unit> liveDataJS;
        LiveData<Unit> liveDataJf1;
        super.onCreate();
        InterfaceC1460000o62 interfaceC1460000o62G2 = G2();
        if (interfaceC1460000o62G2 != null && (liveDataJf1 = interfaceC1460000o62G2.jf1()) != null) {
            liveDataJf1.observe(this, new AObserverS225S0100000_22(this, 59));
        }
        getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.social.sendtodm.MultiImageSendToDMComponent.onCreate.2
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                MultiImageSendToDMComponent multiImageSendToDMComponent = MultiImageSendToDMComponent.this;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onStateChanged ");
                sbLIZ.append(event);
                multiImageSendToDMComponent.uu(C2188811AlT.LIZIZ(sbLIZ));
            }
        });
        InterfaceC1451050nrb interfaceC1451050nrbW2 = w2();
        if (interfaceC1451050nrbW2 == null || (liveDataJS = interfaceC1451050nrbW2.JS()) == null) {
            return;
        }
        liveDataJS.observe(this, new AObserverS225S0100000_22(this, 60));
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        Z1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public final void c3(TuxSheet tuxSheet) {
        C19EG c19eg;
        int i;
        Activity activity = this.LLILLJJLI;
        if (activity == null) {
            return;
        }
        T2().creativeModel.editSaveLocalModel.isFromDMPanel = true;
        T2().creativeModel.editSaveLocalModel.withSaveTypeOption = true;
        IDMCreativeEditService iDMCreativeEditServiceO2 = o2();
        if (iDMCreativeEditServiceO2 != null) {
            TuxSheet tuxSheetLIZJ = iDMCreativeEditServiceO2.LIZJ(activity, T2(), new AwS566S0100000_22(this, 382), new AwS566S0100000_22(this, 383), new AwS636S0100000_22(this, 15), new AwS601S0100000_22(tuxSheet, 246));
            Scene scene = this.LLILLL;
            Activity activity2 = this.LLILLJJLI;
            if (activity2 instanceof C19EG) {
                c19eg = (C19EG) activity2;
            } else {
                c19eg = null;
            }
            FragmentManager fragmentManagerLJIIJJI = C20622515mp.LJIIJJI(c19eg, scene);
            if (fragmentManagerLJIIJJI != null) {
                tuxSheetLIZJ.show(fragmentManagerLJIIJJI, "guide posting before save");
            }
            if (C1428470nHB.LJLIIL(T2()) && (!C573570MeZ.LIZ() || !C1428470nHB.LIZIZ(T2()))) {
                i = 1;
            } else {
                i = 0;
            }
            IDMCreativeEditService iDMCreativeEditServiceO22 = o2();
            if (iDMCreativeEditServiceO22 != null) {
                iDMCreativeEditServiceO22.LJI(1, i, T2(), "edit_page_save");
                return;
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<VideoPublishEditModel> i3(VideoPublishEditModel videoPublishEditModel) {
        List<SingleImageData> imageList;
        String realImportPath;
        String path;
        String path2;
        File fileLIZLLL;
        File fileLIZJ;
        File fileLJFF;
        Integer num;
        Object objLJJJLZIJ;
        Object objLJJJLZIJ2;
        Object objLJJJLZIJ3;
        List<SingleImageData> imageList2;
        SingleImageData singleImageData;
        ImportVideoInfo originAlbumImageData;
        ImageAlbumData imageAlbumData = videoPublishEditModel.getImageAlbumData();
        if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(imageList, 10));
            int i = 0;
            for (SingleImageData singleImageData2 : imageList) {
                int i2 = i + 1;
                String path3 = null;
                if (i >= 0) {
                    VideoPublishEditModel videoPublishEditModelMakeCopy = VideoPublishEditModel.makeCopy(videoPublishEditModel);
                    CreativeInfo creativeInfo = videoPublishEditModelMakeCopy.getCreativeInfo();
                    videoPublishEditModelMakeCopy.setCreativeInfo(creativeInfo.copy(UUID.randomUUID().toString(), creativeInfo.version, creativeInfo.sessionId));
                    videoPublishEditModelMakeCopy.setWorkspace(C14D2.LIZ(videoPublishEditModelMakeCopy.getCreativeInfo()));
                    ImageAlbumData imageAlbumData2 = (ImageAlbumData) C571330Max.LIZ(imageAlbumData);
                    imageAlbumData2.setImageList(Collections.singletonList(singleImageData2));
                    videoPublishEditModelMakeCopy.setImageAlbumData(imageAlbumData2);
                    CreativeModel creativeModel = videoPublishEditModelMakeCopy.creativeModel;
                    ImageAlbumData imageAlbumData3 = videoPublishEditModelMakeCopy.getImageAlbumData();
                    if (imageAlbumData3 == null || (imageList2 = imageAlbumData3.getImageList()) == null || (singleImageData = (SingleImageData) C13LP.LJJJLL(imageList2)) == null || (originAlbumImageData = singleImageData.getOriginAlbumImageData()) == null || (realImportPath = originAlbumImageData.getRealImportPath()) == null) {
                        realImportPath = "";
                    }
                    creativeModel.dmMediaModel = new DMMediaModel(2, realImportPath, "", "", false, true, true, null);
                    MvCreateVideoData mvCreateVideoData = videoPublishEditModelMakeCopy.getMvCreateVideoData();
                    if (mvCreateVideoData != null) {
                        ArrayList<String> arrayList2 = mvCreateVideoData.selectMediaList;
                        if (arrayList2 != null && (objLJJJLZIJ3 = C13LP.LJJJLZIJ(i, arrayList2)) != null) {
                            mvCreateVideoData.selectMediaList = C1697810uHb.LJ(objLJJJLZIJ3);
                        }
                        ArrayList<String> arrayList3 = mvCreateVideoData.srcSelectMediaList;
                        if (arrayList3 != null && (objLJJJLZIJ2 = C13LP.LJJJLZIJ(i, arrayList3)) != null) {
                            mvCreateVideoData.srcSelectMediaList = C1697810uHb.LJ(objLJJJLZIJ2);
                        }
                    }
                    ArrayList<ImportVideoInfo> importInfoList = videoPublishEditModelMakeCopy.getImportInfoList();
                    if (importInfoList != null && (objLJJJLZIJ = C13LP.LJJJLZIJ(i, importInfoList)) != null) {
                        videoPublishEditModelMakeCopy.setImportInfoList(C1697810uHb.LJ(objLJJJLZIJ));
                    }
                    ArrayList<Integer> segmentLoudness = videoPublishEditModelMakeCopy.getSegmentLoudness();
                    if (segmentLoudness != null && (num = (Integer) C13LP.LJJJLZIJ(i, segmentLoudness)) != null) {
                        videoPublishEditModelMakeCopy.setSegmentLoudness(C1697810uHb.LJ(Integer.valueOf(num.intValue())));
                    }
                    Workspace workspace = videoPublishEditModelMakeCopy.getWorkspace();
                    if (workspace != null && (fileLJFF = workspace.LJFF()) != null) {
                        path = fileLJFF.getPath();
                    } else {
                        path = null;
                    }
                    videoPublishEditModelMakeCopy.setOutputFile(path);
                    Workspace workspace2 = videoPublishEditModelMakeCopy.getWorkspace();
                    if (workspace2 != null && (fileLIZJ = workspace2.LIZJ()) != null) {
                        path2 = fileLIZJ.getPath();
                    } else {
                        path2 = null;
                    }
                    videoPublishEditModelMakeCopy.setEncodedAudioOutputFile(path2);
                    Workspace workspace3 = videoPublishEditModelMakeCopy.getWorkspace();
                    if (workspace3 != null && (fileLIZLLL = workspace3.LIZLLL()) != null) {
                        path3 = fileLIZLLL.getPath();
                    }
                    videoPublishEditModelMakeCopy.setParallelUploadOutputFile(path3);
                    DraftEditTransferModel draftEditTransferModel = videoPublishEditModelMakeCopy.draftEditTransferModel;
                    if (draftEditTransferModel != null) {
                        videoPublishEditModelMakeCopy.draftEditTransferModel = draftEditTransferModel.copy(videoPublishEditModelMakeCopy.getCreationId(), draftEditTransferModel.videoSegmentsCopy);
                    }
                    arrayList.add(videoPublishEditModelMakeCopy);
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }

    public final void m3(boolean z) {
        LiveData<InterfaceC1452170ntP> liveDataG;
        InterfaceC1452170ntP value;
        InterfaceC1451050nrb interfaceC1451050nrbW2 = w2();
        if (interfaceC1451050nrbW2 != null && (liveDataG = interfaceC1451050nrbW2.g()) != null && (value = liveDataG.getValue()) != null) {
            if (z) {
                value.play();
            } else {
                value.pause();
            }
        }
    }

    @Override // X.InterfaceC1431860nMe
    public void tJ0(boolean z) {
        String value;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        String str;
        LandingModel landingModel;
        LandingModel landingModel2;
        IDMCreativeEditService iDMCreativeEditServiceO2;
        uu("start shareToDM");
        if (z) {
            value = DMCreativeMobConstants.EnterMethod.MAIN_POSTING_CAMERA_ICON.getValue();
        } else {
            value = DMCreativeMobConstants.EnterMethod.DOWNLOAD_SHARE_PANEL_AUTO.getValue();
        }
        IDMCreativeEditService iDMCreativeEditServiceO22 = o2();
        if (iDMCreativeEditServiceO22 != null) {
            VideoPublishEditModel videoPublishEditModelT2 = T2();
            C13DA c13da = new C13DA();
            c13da.put("enter_method", value);
            c13da.put("enter_from", DMCreativeMobConstants.EnterFrom.VIDEO_EDIT_PAGE.getValue());
            iDMCreativeEditServiceO22.LJIIJ(videoPublishEditModelT2, c13da.build());
        }
        if (!jK1(this.LLILLJJLI, z, 0)) {
            return;
        }
        String str2 = null;
        Map<String, String> mapHh2 = hh2(z, value, null);
        String str3 = mapHh2.get("is_text_mode");
        if (str3 == null) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        if (!Intrinsics.LJFF(str3, "1") || (C1428470nHB.LLIIIILZ(T2()) && C295010BhL.LIZ())) {
            IDMCreativeEditService iDMCreativeEditServiceO23 = o2();
            if (iDMCreativeEditServiceO23 != null && iDMCreativeEditServiceO23.LJII(T2()) && (iDMCreativeEditServiceO2 = o2()) != null && iDMCreativeEditServiceO2.LJIIJJI()) {
                z2 = true;
            } else {
                z2 = false;
            }
            IMSharePanelApi.LIZ.getClass();
            InterfaceC1428690nHX interfaceC1428690nHXLIZ = C1599690rjL.LIZ().LIZ();
            Activity activity = this.LLILLJJLI;
            String str4 = T2().creativeModel.editSaveLocalModel.flowId;
            IDMCreativeEditService iDMCreativeEditServiceO24 = o2();
            if (iDMCreativeEditServiceO24 != null && iDMCreativeEditServiceO24.LIZ(T2())) {
                z3 = true;
            } else {
                z3 = false;
            }
            IDMCreativeEditService iDMCreativeEditServiceO25 = o2();
            if (iDMCreativeEditServiceO25 != null && iDMCreativeEditServiceO25.LIZIZ(T2())) {
                z4 = true;
            } else {
                z4 = false;
            }
            IDMCreativeEditService iDMCreativeEditServiceO26 = o2();
            if (iDMCreativeEditServiceO26 != null && !iDMCreativeEditServiceO26.LJIIIZ(T2())) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z8 = !z5;
            IDMCreativeEditService iDMCreativeEditServiceO27 = o2();
            if (iDMCreativeEditServiceO27 != null && iDMCreativeEditServiceO27.LIZLLL(T2(), null, null)) {
                z6 = true;
            } else {
                z6 = false;
            }
            IDMCreativeEditService iDMCreativeEditServiceO28 = o2();
            if (iDMCreativeEditServiceO28 != null && iDMCreativeEditServiceO28.LJ(T2())) {
                z7 = true;
            } else {
                z7 = false;
            }
            C1408610ml9 c1408610ml9H2 = H2();
            boolean zLIZJ = C573570MeZ.LIZJ(T2());
            boolean zLJJZZI = C1428470nHB.LJJZZI(T2());
            boolean zLIZIZ = C1441980ncy.LIZIZ(T2());
            CreativeModel creativeModel = T2().creativeModel;
            if (creativeModel != null && (landingModel2 = creativeModel.landingModel) != null) {
                str2 = landingModel2.landingTab;
            }
            boolean zLJFF = Intrinsics.LJFF("editor_tab", str2);
            CreativeModel creativeModel2 = T2().creativeModel;
            if (creativeModel2 == null || (landingModel = creativeModel2.landingModel) == null || (str = landingModel.dataComeFrom) == null) {
                str = "";
            }
            interfaceC1428690nHXLIZ.LIZ(activity, z, str4, z3, z4, z8, z2, z6, z7, mapHh2, c1408610ml9H2, false, UUID.randomUUID().toString(), "", "", zLIZJ, zLJFF, str, T2().creativeModel.editSaveLocalModel.isBackFromQuickPublish, zLJJZZI, zLIZIZ, new C1428630nHR(this));
            T2();
        }
    }

    public static String W1(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.InterfaceC1431860nMe
    public void Dt0(String str, Function1<? super Bitmap, Unit> function1) {
        C1431800nMY.LIZIZ(str, function1);
    }

    public MultiImageSendToDMComponent(C1DRG c1drg, Activity activity, Scene scene) {
        this.LL = c1drg;
        this.LLILLJJLI = activity;
        this.LLILLL = scene;
    }

    @Override // X.InterfaceC1431860nMe
    public Map<String, String> hh2(boolean z, String str, Function1<? super Map<String, String>, Unit> function1) {
        boolean z2;
        String str2;
        Intent intent;
        List<SingleImageData> imageList;
        int currentPreviewIndex;
        String string;
        InterfaceC1429470nIn interfaceC1429470nInLJFF;
        int i = 0;
        if (!jK1(this.LLILLJJLI, z, 0)) {
            return new LinkedHashMap();
        }
        T2().setShareToDM(true);
        boolean zLJJZZI = C1428470nHB.LJJZZI(T2());
        C13DA c13da = new C13DA();
        if (T2().getOriginal() != 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c13da.put("is_shoot_upload", str2);
        String stickerID = T2().getStickerID();
        String str3 = "";
        if (stickerID == null) {
            stickerID = "";
        }
        c13da.put("prop_id", stickerID);
        c13da.put("enter_from", DMCreativeMobConstants.EnterFrom.VIDEO_EDIT_PAGE.getValue());
        c13da.put("enter_method", str);
        String strW1 = null;
        IAiChatFeatureService iAiChatFeatureService = (IAiChatFeatureService) PluggableExtentionKt.pluggableSpi$default(IAiChatFeatureService.class, false, false, false, 14, null);
        if (iAiChatFeatureService != null && (interfaceC1429470nInLJFF = iAiChatFeatureService.LJFF()) != null && interfaceC1429470nInLJFF.LJFF(T2().creativeModel, T2().getPreviewInfo(), C1428470nHB.LJJZZI(T2()))) {
            c13da.put("is_visual_poet", "1");
        }
        Long l = T2().creativeModel.initialModel.dmCameraModel.effectTriggerMsgSentServerTime;
        if (l != null && (string = l.toString()) != null) {
            c13da.put("effect_trigger_msg_timestamp", string);
        }
        c13da.put("scenario", "multiple_photo_upload");
        c13da.putAll(C1413430msv.LJIIL(T2()));
        c13da.put("is_draft", String.valueOf(C1428470nHB.LJJJZ(T2()) ? 1 : 0));
        C0LAB c0lab = new C0LAB();
        C572310McX.LJ(T2(), c0lab);
        c13da.putAll(c0lab.LIZ);
        c13da.putAll(C1413430msv.LJIIIZ(T2()));
        C564410MBr c564410MBr = C564410MBr.LIZ;
        UsageStatus usageStatusLJ = T2().getAILivePhotoModel().LJ();
        c564410MBr.getClass();
        c13da.put("ai_livephoto_status", String.valueOf(C564410MBr.LIZLLL(usageStatusLJ)));
        String str4 = T2().mShootWay;
        if (str4 == null) {
            str4 = "";
        }
        c13da.put("shoot_way", str4);
        String shootEnterMethod = T2().getShootEnterMethod();
        if (shootEnterMethod != null) {
            str3 = shootEnterMethod;
        }
        c13da.put("shoot_enter_method", str3);
        VideoPublishEditModel videoPublishEditModelT2 = T2();
        ImageAlbumData imageAlbumData = videoPublishEditModelT2.creativeModel.imageAlbumModel;
        if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
            ImageAlbumData imageAlbumData2 = videoPublishEditModelT2.creativeModel.imageAlbumModel;
            if (imageAlbumData2 != null) {
                currentPreviewIndex = imageAlbumData2.getCurrentPreviewIndex();
            } else {
                currentPreviewIndex = 0;
            }
            SingleImageData singleImageData = (SingleImageData) C13LP.LJJJLZIJ(currentPreviewIndex, imageList);
            if (singleImageData != null && singleImageData.getCollageInfo() != null) {
                i = 1;
            }
        }
        c13da.put("is_collage_photo", String.valueOf(i));
        c13da.put("creation_id", T2().getCreationId());
        c13da.put("content_source", C1428470nHB.LJIILIIL(T2()));
        c13da.put("content_type", C1428470nHB.LJIILL(T2()));
        Map<String, String> mapBuild = c13da.build();
        Activity activity = this.LLILLJJLI;
        String str5 = null;
        if (activity != null && (intent = activity.getIntent()) != null) {
            strW1 = W1(intent, "enter_dm");
        }
        if (Intrinsics.LJFF(strW1, "system_share")) {
            str5 = "video_edit";
        }
        EventBus.LIZLLL().LJIJJLI(C1431840nMc.class);
        if (zLJJZZI) {
            uu("start share to dm in image mode");
            W2().lG2().invoke(new AwS137S1200000_22(this, (MultiImageSendToDMComponent) str5, (String) mapBuild, (Map<String, String>) 2));
        }
        return mapBuild;
    }

    @Override // X.InterfaceC1431860nMe
    public boolean jK1(Activity activity, boolean z, int i) {
        return C1431800nMY.LIZ(activity, z, i);
    }
}
