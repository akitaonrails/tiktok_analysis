package com.ss.android.ugc.aweme.publish.service;

import X.AbstractC214814194y;
import X.AbstractC858320Xlm;
import X.C01GW;
import X.C09JN;
import X.C0CHQ;
import X.C0EMD;
import X.C0FNT;
import X.C0LH5;
import X.C0M2T;
import X.C0M5N;
import X.C0M5P;
import X.C0MY9;
import X.C11JF;
import X.C11NZ;
import X.C11S5;
import X.C13E8;
import X.C1402440mbC;
import X.C1402840mbq;
import X.C1403010mc7;
import X.C1416310mxZ;
import X.C1428470nHB;
import X.C1428550nHJ;
import X.C1429320nIY;
import X.C1431730nMR;
import X.C1431870nMf;
import X.C1432960nOQ;
import X.C1433530nPL;
import X.C1433730nPf;
import X.C1433740nPg;
import X.C1433920nPy;
import X.C1436220nTg;
import X.C1436230nTh;
import X.C1436310nTp;
import X.C1436350nTt;
import X.C1436420nU0;
import X.C1436430nU1;
import X.C1436450nU3;
import X.C1436460nU4;
import X.C1436470nU5;
import X.C1436490nU7;
import X.C1436500nU8;
import X.C1436510nU9;
import X.C1436520nUA;
import X.C1436530nUB;
import X.C1436540nUC;
import X.C1436550nUD;
import X.C1436560nUE;
import X.C1436570nUF;
import X.C1436580nUG;
import X.C1436590nUH;
import X.C1436600nUI;
import X.C1436650nUN;
import X.C1436830nUf;
import X.C1437510nVl;
import X.C1437830nWH;
import X.C1439030nYD;
import X.C1439880nZa;
import X.C1440230na9;
import X.C1440470naX;
import X.C1443030nef;
import X.C1443400nfG;
import X.C1444700nhM;
import X.C1463670oBx;
import X.C1512200pSE;
import X.C15438062q;
import X.C1697810uHb;
import X.C1701940uOG;
import X.C19719612Di;
import X.C19EG;
import X.C1B4F;
import X.C1BWL;
import X.C201955140j;
import X.C214728191q;
import X.C2188811AlT;
import X.C2222691Bz1;
import X.C262790ARp;
import X.C273240AnK;
import X.C273330AnT;
import X.C280740AzQ;
import X.C281030Azt;
import X.C452501pT;
import X.C538590LAj;
import X.C540290LGx;
import X.C540370LHf;
import X.C577950Mld;
import X.C580270MpN;
import X.C855380Xh2;
import X.C855520XhG;
import X.C855530XhH;
import X.C855550XhJ;
import X.C855610XhP;
import X.C855830Xhl;
import X.C856570Xix;
import X.C856610Xj1;
import X.C856960Xja;
import X.C857530XkV;
import X.C857760Xks;
import X.C857950XlB;
import X.C857960XlC;
import X.C858450Xlz;
import X.C859300XnM;
import X.C890750Ywz;
import X.C960203pA;
import X.InterfaceC1436400nTy;
import X.InterfaceC1439070nYH;
import X.InterfaceC1452170ntP;
import X.InterfaceC19305710fv;
import X.InterfaceC540360LHe;
import X.InterfaceC626120Oh8;
import Y.AObserverS225S0100000_22;
import Y.AfS191S0100000_22;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.creative.model.publish.CompileLevel;
import com.ss.android.ugc.aweme.creative.model.publish.PostPageModel;
import com.ss.android.ugc.aweme.creative.model.publish.PrePublishStatusModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.editpageprepublish.EditPagePrePublishController$tryStartEditPagePrePublish$3;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.shortvideo.ui.VEVideoPublishPreviewScene;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.aweme.wavepublish.experiment.EnableParallelPublishSchedulerV2Exp;
import com.ss.android.ugc.gamora.editorpro.guide.api.EditorProGuideTargetUserApi;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.Intrinsics;
import lth.o;

/* JADX INFO: loaded from: classes23.dex */
public final class InternalPublishServiceImpl implements InterfaceC1439070nYH {
    public final C01GW LIZ = C452501pT.LIZIZ(new C1436540nUC());
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C1436460nU4());
    public final C01GW LIZJ = C452501pT.LIZIZ(new C1436530nUB());
    public final C01GW LIZLLL = C452501pT.LIZIZ(new C1436420nU0());
    public final C01GW LJ = C452501pT.LIZIZ(new C1436550nUD());
    public final C01GW LJFF = C452501pT.LIZIZ(new C1436520nUA());
    public final C01GW LJI = C452501pT.LIZIZ(new C1436470nU5());
    public final C01GW LJII = C452501pT.LIZIZ(new C1436450nU3());
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(new C1436500nU8());
    public final C01GW LJIIIZ = C452501pT.LIZIZ(new C1436600nUI());
    public final C01GW LJIIJ = C452501pT.LIZIZ(new C1436510nU9());
    public final C01GW LJIIJJI = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(105));
    public final C01GW LJIIL = C452501pT.LIZIZ(new C1436580nUG());
    public final C01GW LJIILIIL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(104));
    public final C01GW LJIILJJIL = C452501pT.LIZIZ(new C1436490nU7());
    public final C01GW LJIILL = C452501pT.LIZIZ(new C1436590nUH());
    public final C01GW LJIILLIIL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(106));

    @Override // X.InterfaceC1439070nYH
    public final C1436570nUF LIZIZ() {
        return (C1436570nUF) this.LJIIJJI.getValue();
    }

    @Override // X.InterfaceC1439070nYH
    public final void LJI() {
        C1433730nPf c1433730nPf = C1433730nPf.LIZ;
        synchronized (C1433730nPf.class) {
            C1433740nPg c1433740nPg = C1433730nPf.LJFF;
            if (c1433740nPg.LJIIJJI()) {
                C577950Mld.LIZ("PublishScheduler continue markRecord");
                c1433740nPg.LJII();
            }
        }
    }

    @Override // X.InterfaceC1439070nYH
    public final boolean LJIIIIZZ() {
        C1512200pSE value = C1432960nOQ.LJ.getValue();
        if (value != null) {
            return value.LIZLLL();
        }
        return false;
    }

    @Override // X.InterfaceC1439070nYH
    public final C856570Xix LJIIJ() {
        return (C856570Xix) this.LJIILLIIL.getValue();
    }

    @Override // X.InterfaceC1439070nYH
    public final C856610Xj1 LJIIJJI() {
        return (C856610Xj1) this.LJIIIIZZ.getValue();
    }

    @Override // X.InterfaceC1439070nYH
    public final C1436830nUf LJIIL() {
        return (C1436830nUf) this.LJI.getValue();
    }

    @Override // X.InterfaceC1439070nYH
    public final void LJIIZILJ() {
        C1436310nTp.LIZ.getClass();
        C1436310nTp.LJIIJJI = null;
    }

    @Override // X.InterfaceC1439070nYH
    public final boolean LJIL() {
        C1436230nTh.LIZ.getClass();
        String str = C1436230nTh.LJ;
        if (str == null || str.length() == 0) {
            return false;
        }
        return C1433730nPf.LJIILLIIL(C1436230nTh.LJ);
    }

    @Override // X.InterfaceC1439070nYH
    public final C857760Xks LJJ() {
        return (C857760Xks) this.LJIILIIL.getValue();
    }

    @Override // X.InterfaceC1439070nYH
    public final C1431730nMR LJJIIZI() {
        return (C1431730nMR) this.LIZIZ.getValue();
    }

    @Override // X.InterfaceC1439070nYH
    public final boolean LJJIJ() {
        return ((Boolean) C273240AnK.LIZ.getValue()).booleanValue();
    }

    @Override // X.InterfaceC1439070nYH
    public final C1436560nUE LJJIJIIJI() {
        return (C1436560nUE) this.LJ.getValue();
    }

    @Override // X.InterfaceC1439070nYH
    public final C1444700nhM LJJIJIIJIL() {
        return (C1444700nhM) this.LIZJ.getValue();
    }

    @Override // X.InterfaceC1439070nYH
    public final void LJJIJIL() {
        C1436310nTp.LIZ.getClass();
        C1436310nTp.LJIIL = null;
    }

    @Override // X.InterfaceC1439070nYH
    public final C1433920nPy LJJJIL() {
        return (C1433920nPy) this.LIZLLL.getValue();
    }

    @Override // X.InterfaceC1439070nYH
    public final C0MY9 LJJJJI() {
        return (C0MY9) this.LJIILL.getValue();
    }

    @Override // X.InterfaceC1439070nYH
    public final List<String> LJJJJIZL() {
        ArrayList arrayList;
        C1433740nPg c1433740nPg = C1433730nPf.LJFF;
        synchronized (c1433740nPg) {
            arrayList = new ArrayList();
            Iterator<C1433530nPL> it2 = c1433740nPg.LIZ.iterator();
            while (it2.hasNext()) {
                String draftPrimaryKey = it2.next().LIZ.editModel.getDraftPrimaryKey();
                if (draftPrimaryKey == null) {
                    draftPrimaryKey = "";
                }
                arrayList.add(draftPrimaryKey);
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC1439070nYH
    public final C1436650nUN LJJJJJ() {
        return (C1436650nUN) this.LIZ.getValue();
    }

    @Override // X.InterfaceC1439070nYH
    public final C857950XlB LJJJJZ() {
        return (C857950XlB) this.LJIILJJIL.getValue();
    }

    @Override // X.InterfaceC1439070nYH
    public final C1431870nMf LJJJLL() {
        return (C1431870nMf) this.LJII.getValue();
    }

    @Override // X.InterfaceC1439070nYH
    public final boolean LJJL() {
        C1436230nTh.LIZ.getClass();
        String str = C1436230nTh.LJ;
        if (str == null || str.length() == 0) {
            return false;
        }
        return C1433730nPf.LJIIZILJ(C1436230nTh.LJ);
    }

    @Override // X.InterfaceC1439070nYH
    public final C1440230na9 LJJLIIIIJ() {
        return (C1440230na9) this.LJIIJ.getValue();
    }

    @Override // X.InterfaceC1439070nYH
    public final C1437510nVl LJJLIIIJ() {
        return (C1437510nVl) this.LJFF.getValue();
    }

    @Override // X.InterfaceC1439070nYH
    public final C214728191q LJJLIIIJLJLI() {
        return (C214728191q) this.LJIIL.getValue();
    }

    @Override // X.InterfaceC1439070nYH
    public final void LJJLJ() {
        C1436310nTp.LIZ.getClass();
        C1436310nTp.LJIIJ = null;
    }

    @Override // X.InterfaceC1439070nYH
    public final boolean LJJIII() {
        return C1433730nPf.LJIILL() > 0;
    }

    @Override // X.InterfaceC1439070nYH
    public final int LJJJJJL() {
        return C1433730nPf.LJIILL();
    }

    @Override // X.InterfaceC1439070nYH
    public final boolean LJJJZ() {
        return C855830Xhl.LIZ();
    }

    @Override // X.InterfaceC1439070nYH
    public final boolean LJJLIIIJLLLLLLLZ() {
        EnableParallelPublishSchedulerV2Exp.Config configLIZ = EnableParallelPublishSchedulerV2Exp.LIZ();
        return configLIZ.enable && configLIZ.enableFixProfileDraftNum;
    }

    @Override // X.InterfaceC1439070nYH
    public final void LIZ() {
        C1433730nPf.LJJII();
    }

    @Override // X.InterfaceC1439070nYH
    public final void LJIIIZ(Lifecycle lifecycle) {
        Lifecycle lifecycle2;
        C1436310nTp.LIZ.getClass();
        if (((Boolean) C273330AnT.LIZ.getValue()).booleanValue()) {
            WeakReference<Lifecycle> weakReference = C1436310nTp.LJII;
            if (weakReference != null) {
                lifecycle2 = weakReference.get();
            } else {
                lifecycle2 = null;
            }
            if (Intrinsics.LJFF(lifecycle2, lifecycle)) {
                C1436310nTp.LJIIIIZZ = null;
            }
        }
    }

    @Override // X.InterfaceC1439070nYH
    public final boolean LJIILJJIL(VideoPublishEditModel videoPublishEditModel) {
        AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(videoPublishEditModel.creativeModel.musicBuzModel);
        if (aVMusicExtractAVMusic != null && aVMusicExtractAVMusic.isPreventDownload()) {
            C0CHQ.LIZ().getRegionService().getClass();
            if (C2222691Bz1.LJIIIZ()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1439070nYH
    public final void LJIJ(VideoPublishEditModel videoPublishEditModel) {
        C1436230nTh c1436230nTh = C1436230nTh.LIZ;
        synchronized (C1436230nTh.class) {
            C1436230nTh.LIZ.getClass();
            if (!((Boolean) C1436230nTh.LJII(videoPublishEditModel).getFirst()).booleanValue()) {
                return;
            }
            if (C280740AzQ.LIZ() && C1436220nTg.LIZLLL(videoPublishEditModel)) {
                C1436230nTh.LIZJ(videoPublishEditModel, "choose local music");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a A[PHI: r1
      0x002a: PHI (r1v3 java.lang.String) = (r1v1 java.lang.String), (r1v4 java.lang.String) binds: [B:11:0x0023, B:9:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC1439070nYH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJ(X.InterfaceC1436400nTy r4) {
        /*
            r3 = this;
            X.0nTp r0 = X.C1436310nTp.LIZ
            r0.getClass()
            X.C1436310nTp.LJIIIZ = r4
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> r0 = X.C1436310nTp.LJFF
            java.lang.Object r1 = r0.getValue()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L29
            X.0nTy r2 = X.C1436310nTp.LJIIIZ
            if (r2 == 0) goto L29
            X.0nTt r0 = X.C1436310nTp.LIZJ
            if (r0 == 0) goto L21
            java.lang.String r1 = r0.LIZJ
            if (r1 != 0) goto L2a
        L21:
            java.lang.String r1 = ""
            if (r0 != 0) goto L2a
            r0 = 0
        L26:
            r2.e4(r0, r1)
        L29:
            return
        L2a:
            int r0 = r0.LJIIJJI
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.publish.service.InternalPublishServiceImpl.LJIJJ(X.0nTy):void");
    }

    @Override // X.InterfaceC1439070nYH
    public final int LJJI(VideoPublishEditModel videoPublishEditModel) {
        C855530XhH c855530XhH;
        if (C1428470nHB.LJJZZI(videoPublishEditModel)) {
            IAVPublishService iAVPublishService = C1429320nIY.LIZ;
            c855530XhH = new C855520XhG(C1428470nHB.LJJZZI(videoPublishEditModel));
        } else {
            c855530XhH = new C855530XhH();
        }
        return c855530XhH.LIZIZ() + C855380Xh2.LIZ;
    }

    @Override // X.InterfaceC1439070nYH
    public final void LJJIFFI(InterfaceC1436400nTy interfaceC1436400nTy) {
        C1436310nTp.LIZ.getClass();
        if (interfaceC1436400nTy == C1436310nTp.LJIIIZ) {
            C1436310nTp.LJIIIZ = null;
        }
    }

    @Override // X.InterfaceC1439070nYH
    public final boolean LJJII(VideoPublishEditModel videoPublishEditModel) {
        Pair<Integer, Integer> pairLJIIJJI;
        try {
            pairLJIIJJI = C580270MpN.LJIIJJI(videoPublishEditModel);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (pairLJIIJJI.getFirst().intValue() + pairLJIIJJI.getSecond().intValue() <= 1) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1439070nYH
    public final void LJJIIJ(AwS566S0100000_22 awS566S0100000_22) {
        C1436310nTp.LIZ.getClass();
        C1436310nTp.LIZLLL.remove(awS566S0100000_22);
    }

    @Override // X.InterfaceC1439070nYH
    public final void LJJIIJZLJL(final C890750Ywz c890750Ywz) {
        ((EditorProGuideTargetUserApi.Api) C0CHQ.LIZ().getNetworkService().createRetrofit(C0CHQ.LIZ().getNetworkService().getApiHost(), true, EditorProGuideTargetUserApi.Api.class)).requestIsEpGuideTargetUser(false, true).LJL(C11S5.LIZ()).LJJJLZIJ(C11S5.LIZ()).LIZIZ(new InterfaceC626120Oh8<EditorProGuideTargetUserApi.FetchIsEpGuideTargetUserResponse>() { // from class: X.0o5w
            @Override // X.InterfaceC626120Oh8
            public final void onComplete() {
            }

            @Override // X.InterfaceC626120Oh8
            public final void onError(Throwable th) {
            }

            @Override // X.InterfaceC626120Oh8
            public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
            }

            @Override // X.InterfaceC626120Oh8
            public final void onNext(EditorProGuideTargetUserApi.FetchIsEpGuideTargetUserResponse fetchIsEpGuideTargetUserResponse) {
                boolean zBooleanValue;
                EditorProGuideTargetUserApi.FetchIsEpGuideTargetUserResponse fetchIsEpGuideTargetUserResponse2 = fetchIsEpGuideTargetUserResponse;
                MutableLiveData<Boolean> mutableLiveData = C1459950o5x.LIZ;
                Boolean shouldShowSubToast = fetchIsEpGuideTargetUserResponse2.getShouldShowSubToast();
                boolean zBooleanValue2 = false;
                if (shouldShowSubToast != null) {
                    zBooleanValue = shouldShowSubToast.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                mutableLiveData.postValue(Boolean.valueOf(zBooleanValue));
                EditorProGuideTargetUserApi.AnsaPromptModuleResponse ansaPromptModule = fetchIsEpGuideTargetUserResponse2.getAnsaPromptModule();
                if (ansaPromptModule != null) {
                    InterfaceC1631630sYr<Boolean, String, String, String, Unit> interfaceC1631630sYr = c890750Ywz;
                    Boolean bool = ansaPromptModule.needPrompt;
                    if (bool != null) {
                        zBooleanValue2 = bool.booleanValue();
                    }
                    interfaceC1631630sYr.invoke(Boolean.valueOf(zBooleanValue2), ansaPromptModule.videoTitle, ansaPromptModule.videoCoverUri, ansaPromptModule.violationType);
                }
            }
        });
    }

    @Override // X.InterfaceC1439070nYH
    public final void LJJIIZ(VideoPublishEditModel videoPublishEditModel) {
        C1436230nTh c1436230nTh = C1436230nTh.LIZ;
        synchronized (C1436230nTh.class) {
            C1436230nTh.LIZ.getClass();
            if (!((Boolean) C1436230nTh.LJII(videoPublishEditModel).getFirst()).booleanValue()) {
                return;
            }
            if (C280740AzQ.LIZ()) {
                PrePublishStatusModel prePublishStatusModel = videoPublishEditModel.creativeModel.prePublishStatusModel;
                CompileLevel compileLevel = prePublishStatusModel.compileLevel;
                int i = prePublishStatusModel.musicStatusWhenStart;
                if (i == 1) {
                    if (compileLevel == CompileLevel.CLOUD_PROCESS_WITH_MUSIC) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("click choose music: ignore, music status=");
                        sbLIZ.append(i);
                        sbLIZ.append(", compileLevel=");
                        sbLIZ.append(compileLevel);
                        C859300XnM.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                        return;
                    }
                } else if (i == 0 && C1436230nTh.LIZIZ.contains(compileLevel)) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("click choose music: ignore, music status=");
                    sbLIZ2.append(i);
                    sbLIZ2.append(", compileLevel=");
                    sbLIZ2.append(compileLevel);
                    C859300XnM.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                    return;
                }
            }
            C1436230nTh.LIZJ(videoPublishEditModel, "click choose music");
        }
    }

    @Override // X.InterfaceC1439070nYH
    public final int LJJIJLIJ(int i) {
        if (i == 2) {
            return new C855520XhG(false).LIZIZ();
        }
        return new C855530XhH().LIZIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a A[PHI: r1
      0x002a: PHI (r1v3 java.lang.String) = (r1v1 java.lang.String), (r1v4 java.lang.String) binds: [B:11:0x0023, B:9:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC1439070nYH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIL(X.InterfaceC1436400nTy r4) {
        /*
            r3 = this;
            X.0nTp r0 = X.C1436310nTp.LIZ
            r0.getClass()
            X.C1436310nTp.LJIIJ = r4
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> r0 = X.C1436310nTp.LJFF
            java.lang.Object r1 = r0.getValue()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L29
            X.0nTy r2 = X.C1436310nTp.LJIIJ
            if (r2 == 0) goto L29
            X.0nTt r0 = X.C1436310nTp.LIZJ
            if (r0 == 0) goto L21
            java.lang.String r1 = r0.LIZJ
            if (r1 != 0) goto L2a
        L21:
            java.lang.String r1 = ""
            if (r0 != 0) goto L2a
            r0 = 0
        L26:
            r2.e4(r0, r1)
        L29:
            return
        L2a:
            int r0 = r0.LJIIJJI
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.publish.service.InternalPublishServiceImpl.LJJIL(X.0nTy):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a A[PHI: r1
      0x002a: PHI (r1v3 java.lang.String) = (r1v1 java.lang.String), (r1v4 java.lang.String) binds: [B:11:0x0023, B:9:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC1439070nYH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIZ(X.C336680DHu r4) {
        /*
            r3 = this;
            X.0nTp r0 = X.C1436310nTp.LIZ
            r0.getClass()
            X.C1436310nTp.LJIIJJI = r4
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> r0 = X.C1436310nTp.LJFF
            java.lang.Object r1 = r0.getValue()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L29
            X.0nTy r2 = X.C1436310nTp.LJIIJJI
            if (r2 == 0) goto L29
            X.0nTt r0 = X.C1436310nTp.LIZJ
            if (r0 == 0) goto L21
            java.lang.String r1 = r0.LIZJ
            if (r1 != 0) goto L2a
        L21:
            java.lang.String r1 = ""
            if (r0 != 0) goto L2a
            r0 = 0
        L26:
            r2.e4(r0, r1)
        L29:
            return
        L2a:
            int r0 = r0.LJIIJJI
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.publish.service.InternalPublishServiceImpl.LJJIZ(X.0DHu):void");
    }

    @Override // X.InterfaceC1439070nYH
    public final void LJJJJ(VideoPublishEditModel videoPublishEditModel) {
        List<AVTextExtraStruct> structList;
        C1437830nWH.LIZ.getClass();
        C858450Xlz c858450Xlz = new C858450Xlz(new C857960XlC(true, C855550XhJ.LIZ()));
        String title = videoPublishEditModel.getTitle();
        if (title != null && (structList = videoPublishEditModel.getStructList()) != null) {
            c858450Xlz.LJI(title, structList);
            C13E8 c13e8LIZ = c858450Xlz.LIZ();
            PostPageModel postPageModel = videoPublishEditModel.creativeModel.postPageModel;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(c13e8LIZ, 10));
            Iterator<E> it2 = c13e8LIZ.iterator();
            int i = 0;
            while (true) {
                Object next = null;
                if (it2.hasNext()) {
                    Object next2 = it2.next();
                    int i2 = i + 1;
                    if (i >= 0) {
                        arrayList.add(((AbstractC858320Xlm) next2).LJIILL(title));
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                } else {
                    Iterator it3 = arrayList.iterator();
                    if (it3.hasNext()) {
                        next = it3.next();
                        while (it3.hasNext()) {
                            String str = (String) it3.next();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append((String) next);
                            sbLIZ.append(str);
                            next = C2188811AlT.LIZIZ(sbLIZ);
                        }
                    }
                    String str2 = (String) next;
                    if (str2 == null) {
                        str2 = "";
                    }
                    postPageModel.markupCaption = str2;
                    PostPageModel postPageModel2 = videoPublishEditModel.creativeModel.postPageModel;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<E> it4 = c13e8LIZ.iterator();
                    while (it4.hasNext()) {
                        C19719612Di.LJJI(((AbstractC858320Xlm) it4.next()).LJI(), arrayList2);
                    }
                    postPageModel2.markupExtra = arrayList2;
                    return;
                }
            }
        }
    }

    @Override // X.InterfaceC1439070nYH
    public final void LJJJJLI(AwS566S0100000_22 awS566S0100000_22) {
        C1436310nTp.LIZ.getClass();
        C1436310nTp.LIZLLL.add(awS566S0100000_22);
    }

    @Override // X.InterfaceC1439070nYH
    public final boolean LJJJJLL(VideoPublishEditModel videoPublishEditModel) {
        C0EMD.LIZ.getClass();
        return C0EMD.LIZLLL(videoPublishEditModel);
    }

    @Override // X.InterfaceC1439070nYH
    public final boolean LJJJJZI(VideoPublishEditModel videoPublishEditModel) {
        C1439880nZa.LIZ.getClass();
        return C1439880nZa.LIZLLL(videoPublishEditModel);
    }

    @Override // X.InterfaceC1439070nYH
    public final void LJJLI(C19EG c19eg) {
        C1440470naX.LIZ.getClass();
        C1440470naX.LIZIZ = new ContextThemeWrapper(C1BWL.LIZ(), c19eg.getTheme());
    }

    @Override // X.InterfaceC1439070nYH
    public final void LJJLIIIJILLIZJL(String str) {
        C1436310nTp.LIZ.LIZ(str);
    }

    @Override // X.InterfaceC1439070nYH
    public final boolean LJJLIIIJJI(VideoPublishEditModel videoPublishEditModel) {
        return C855610XhP.LIZIZ(videoPublishEditModel);
    }

    @Override // X.InterfaceC1439070nYH
    public final List<AVTextExtraStruct> LJJLIIIJL(String str) {
        C1437830nWH.LIZ.getClass();
        return C1437830nWH.LIZ(str);
    }

    @Override // X.InterfaceC1439070nYH
    public final String LJJLIL(int i) {
        return C856960Xja.LIZ(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a A[PHI: r1
      0x002a: PHI (r1v3 java.lang.String) = (r1v1 java.lang.String), (r1v4 java.lang.String) binds: [B:11:0x0023, B:9:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC1439070nYH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLJLI(X.InterfaceC1436400nTy r4) {
        /*
            r3 = this;
            X.0nTp r0 = X.C1436310nTp.LIZ
            r0.getClass()
            X.C1436310nTp.LJIIL = r4
            androidx.lifecycle.MutableLiveData<java.lang.Boolean> r0 = X.C1436310nTp.LJFF
            java.lang.Object r1 = r0.getValue()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L29
            X.0nTy r2 = X.C1436310nTp.LJIIL
            if (r2 == 0) goto L29
            X.0nTt r0 = X.C1436310nTp.LIZJ
            if (r0 == 0) goto L21
            java.lang.String r1 = r0.LIZJ
            if (r1 != 0) goto L2a
        L21:
            java.lang.String r1 = ""
            if (r0 != 0) goto L2a
            r0 = 0
        L26:
            r2.e4(r0, r1)
        L29:
            return
        L2a:
            int r0 = r0.LJIIJJI
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.publish.service.InternalPublishServiceImpl.LJJLJLI(X.0nTy):void");
    }

    @Override // X.InterfaceC1439070nYH
    public final void LJII(C19EG c19eg, BaseShortVideoContext baseShortVideoContext) {
        C1437830nWH.LIZ.getClass();
        C1403010mc7.LIZ.getBridgeService().LJIIIZ(c19eg, baseShortVideoContext, C1B4F.LJIILL);
    }

    @Override // X.InterfaceC1439070nYH
    public final Pair<String, List<AVTextExtraStruct>> LJIILIIL(String str, List<AVTextExtraStruct> list) {
        C858450Xlz c858450Xlz = new C858450Xlz(new C857960XlC());
        c858450Xlz.LJI(str, list);
        C857530XkV c857530XkV = new C857530XkV(str, c858450Xlz.LIZ());
        return new Pair<>(c857530XkV.LIZIZ(), c857530XkV.LIZ());
    }

    @Override // X.InterfaceC1439070nYH
    public final int LJIILL(Context context, CreativeModel creativeModel) {
        if (creativeModel.creationTypeModel.creationMode == 2) {
            return R.style.mx;
        }
        if (C960203pA.LIZIZ(context)) {
            return R.style.y0;
        }
        return 0;
    }

    @Override // X.InterfaceC1439070nYH
    public final void LJJJJL(final Lifecycle lifecycle, InterfaceC1436400nTy interfaceC1436400nTy) {
        if (((Boolean) C273330AnT.LIZ.getValue()).booleanValue()) {
            C1436310nTp.LIZ.getClass();
            C1436310nTp.LJIILL(lifecycle, interfaceC1436400nTy);
        } else {
            C1436310nTp.LIZ.getClass();
            C1436310nTp.LJIILL(lifecycle, interfaceC1436400nTy);
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.publish.service.InternalPublishServiceImpl$setSaveLocalCallback$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    Lifecycle lifecycle2;
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        C1436310nTp c1436310nTp = C1436310nTp.LIZ;
                        Lifecycle lifecycle3 = lifecycleOwner.getLifecycle();
                        c1436310nTp.getClass();
                        WeakReference<Lifecycle> weakReference = C1436310nTp.LJII;
                        if (weakReference != null) {
                            lifecycle2 = weakReference.get();
                        } else {
                            lifecycle2 = null;
                        }
                        if (Intrinsics.LJFF(lifecycle2, lifecycle3)) {
                            C1436310nTp.LJIIIIZZ = null;
                        }
                        lifecycle.removeObserver(this);
                    }
                }
            });
        }
    }

    @Override // X.InterfaceC1439070nYH
    public final void LJJJLIIL(final LifecycleOwner lifecycleOwner, Function2<? super Boolean, ? super String, Unit> function2) {
        C1436310nTp.LIZ.getClass();
        C1436310nTp.LJFF.removeObservers(lifecycleOwner);
        C1436310nTp.LJFF.observe(lifecycleOwner, new AObserverS225S0100000_22(function2, 36));
        lifecycleOwner.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.publish.service.InternalPublishServiceImpl$observeIsSavingLocal$2
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    C1436310nTp.LIZ.getClass();
                    C1436310nTp.LJFF.removeObservers(lifecycleOwner);
                    lifecycleOwner.getLifecycle().removeObserver(this);
                }
            }
        });
    }

    @Override // X.InterfaceC1439070nYH
    public final boolean LJJLIIIJJIZ(VideoPublishEditModel videoPublishEditModel, boolean z) {
        boolean z2;
        String str;
        boolean z3;
        C1436310nTp.LIZ.getClass();
        if (C1433730nPf.LJIILL() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (ActivityStack.getValidTopActivity() != null) {
            String str2 = videoPublishEditModel.creativeModel.editSaveLocalModel.flowId;
            Boolean value = C1436310nTp.LJFF.getValue();
            C1436350nTt c1436350nTt = C1436310nTp.LIZJ;
            if (c1436350nTt != null) {
                str = c1436350nTt.LIZJ;
            } else {
                str = null;
            }
            boolean zLJFF = Intrinsics.LJFF(str2, str);
            if (Intrinsics.LJFF(value, Boolean.TRUE) && zLJFF) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean zLJJJLZIJ = C1416310mxZ.LJJJLZIJ(videoPublishEditModel, C1428550nHJ.LIZ());
            if (z2) {
                if (z) {
                    C1436310nTp.LIZLLL(2131846809, 1005);
                }
                C1436310nTp.LJIIIZ(videoPublishEditModel, 2);
            } else if (zLJJJLZIJ) {
                if (z) {
                    C1436310nTp.LIZLLL(2131821262, 1006);
                }
            } else {
                if (!z3) {
                    return true;
                }
                if (z) {
                    C1436310nTp.LIZLLL(2131846808, 1006);
                }
                C1436310nTp.LJIIIZ(videoPublishEditModel, 1);
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002d  */
    @Override // X.InterfaceC1439070nYH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJJLIIJ(X.C19EG r4, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r5) throws java.lang.Throwable {
        /*
            r3 = this;
            boolean r0 = X.C0CHB.LIZ()
            java.lang.String r2 = ""
            if (r0 == 0) goto L17
            X.0Xie r0 = X.C856380Xie.LIZ     // Catch: java.lang.RuntimeException -> L12
            r0.getClass()     // Catch: java.lang.RuntimeException -> L12
            java.lang.String r2 = X.C856380Xie.LIZ(r4, r5)     // Catch: java.lang.RuntimeException -> L12
            return r2
        L12:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r2
        L17:
            java.lang.String r0 = r5.getTitle()
            if (r0 == 0) goto L2d
            boolean r1 = X.C123100dR.LIZ(r0)
            r0 = 1
            if (r1 != r0) goto L2d
        L24:
            if (r0 == 0) goto L30
            java.lang.String r0 = r5.getTitle()
            if (r0 == 0) goto L2f
            return r0
        L2d:
            r0 = 0
            goto L24
        L2f:
            return r2
        L30:
            X.0Xie r0 = X.C856380Xie.LIZ     // Catch: java.lang.RuntimeException -> L3a
            r0.getClass()     // Catch: java.lang.RuntimeException -> L3a
            java.lang.String r2 = X.C856380Xie.LIZ(r4, r5)     // Catch: java.lang.RuntimeException -> L3a
            return r2
        L3a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.publish.service.InternalPublishServiceImpl.LJJLIIJ(X.19EG, com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel):java.lang.String");
    }

    @Override // X.InterfaceC1439070nYH
    public final void LJJLL(VideoPublishEditModel videoPublishEditModel, String str) {
        C1436230nTh.LIZJ(videoPublishEditModel, str);
    }

    @Override // X.InterfaceC1439070nYH
    public final void LJIJI(final InterfaceC1452170ntP interfaceC1452170ntP, final VideoPublishEditModel videoPublishEditModel, final boolean z) {
        C19EG c19eg;
        C1436310nTp c1436310nTp = C1436310nTp.LIZ;
        c1436310nTp.getClass();
        Activity validTopActivity = ActivityStack.getValidTopActivity();
        if ((validTopActivity instanceof C19EG) && (c19eg = (C19EG) validTopActivity) != null) {
            long jCurrentTimeMillis = System.currentTimeMillis() - C1436310nTp.LJI;
            if (jCurrentTimeMillis <= 1000) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("click too fast, time gap = ");
                sbLIZ.append(jCurrentTimeMillis);
                C1436310nTp.LJII(C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            C1436310nTp.LJI = System.currentTimeMillis();
            if (Build.VERSION.SDK_INT < 29) {
                C540290LGx.LJI(C540290LGx.LIZ, c19eg, new C0LH5() { // from class: X.0nTz
                    @Override // X.C0LH5
                    public final void LIZ(int[] iArr, String[] strArr) {
                        C1436310nTp.LJIILJJIL(C1436310nTp.LIZ, videoPublishEditModel, interfaceC1452170ntP, z, false, 8);
                    }
                }, new AwS566S0100000_22(videoPublishEditModel, 26), null, null, TokenCert.Companion.with("bpea-tools_request_storage_permission_edit_page_save_local"), 24);
            } else {
                C1436310nTp.LJIILJJIL(c1436310nTp, videoPublishEditModel, interfaceC1452170ntP, z, false, 8);
            }
        }
    }

    @Override // X.InterfaceC1439070nYH
    public final void LJJIJL(C19EG c19eg, VideoPublishEditModel videoPublishEditModel, boolean z) {
        C1439030nYD.LIZ.getClass();
        Bundle bundleLIZJ = C1439030nYD.LIZJ(videoPublishEditModel);
        if (z) {
            C0M5N c0m5n = C0M5N.LIZ;
            C0M5P c0m5p = new C0M5P(c19eg, bundleLIZJ, null);
            c0m5n.getClass();
            C0M5N.LIZ(c0m5p);
            return;
        }
        C1439030nYD.LJI(c19eg, C1439030nYD.LIZJ(videoPublishEditModel));
    }

    @Override // X.InterfaceC1439070nYH
    public final void LJJJLZIJ(String str, InterfaceC1452170ntP interfaceC1452170ntP, boolean z) {
        String str2;
        C1463670oBx c1463670oBx;
        boolean z2;
        C1436350nTt c1436350nTt;
        C1436310nTp.LIZ.getClass();
        C1436350nTt c1436350nTt2 = C1436310nTp.LIZJ;
        C1436350nTt c1436350nTtLIZ = null;
        if (c1436350nTt2 != null) {
            str2 = c1436350nTt2.LIZJ;
        } else {
            str2 = null;
        }
        if (Intrinsics.LJFF(str2, str) && (interfaceC1452170ntP instanceof C1463670oBx) && (c1463670oBx = (C1463670oBx) interfaceC1452170ntP) != null) {
            if (c1463670oBx.LIZJ().unorderEquals(c1436350nTt2.LJFF) && !z && (c1436350nTt = C1436310nTp.LIZJ) != null && !c1436350nTt.LJIIIZ) {
                z2 = false;
            } else {
                z2 = true;
            }
            C1436350nTt c1436350nTt3 = C1436310nTp.LIZJ;
            if (c1436350nTt3 != null) {
                c1436350nTtLIZ = C1436350nTt.LIZ(c1436350nTt3, null, z2, null, false, null, 0, 4087);
            }
            C1436310nTp.LIZJ = c1436350nTtLIZ;
        }
    }

    @Override // X.InterfaceC1439070nYH
    public final void LJIJJLI(final VideoPublishEditModel videoPublishEditModel, final C19EG c19eg, final Bundle bundle, VEVideoPublishPreviewScene vEVideoPublishPreviewScene) {
        C1443400nfG.LJIIZILJ(videoPublishEditModel);
        C1443030nef.LJII().LJIIL(videoPublishEditModel.getCreationId());
        videoPublishEditModel.creativeModel.draftInfoModel.saveDraftScene = "saveBeforePublish";
        C1402440mbC.LJIILLIIL(new C1402440mbC(), c19eg, videoPublishEditModel, false, vEVideoPublishPreviewScene, false, null, null, "video_preview_page", 448);
        C0M5N c0m5n = C0M5N.LIZ;
        C540370LHf c540370LHf = new C540370LHf(new C538590LAj(videoPublishEditModel, new C0M2T(false, "previewScene", null, 1, false, 28), false), new InterfaceC540360LHe() { // from class: X.0M5Q
            @Override // X.InterfaceC540360LHe
            public final Function1<AwemeDraft, Unit> LIZ() {
                return null;
            }

            @Override // X.InterfaceC540360LHe
            public final void LIZIZ(C540340LHc c540340LHc) {
                C560920LzG.LIZ(videoPublishEditModel, false, false);
                C0M5N c0m5n2 = C0M5N.LIZ;
                C0M5P c0m5p = new C0M5P(c19eg, bundle, null);
                c0m5n2.getClass();
                C0M5N.LIZ(c0m5p);
            }

            @Override // X.InterfaceC540360LHe
            public final void LIZJ(C540340LHc c540340LHc) {
                C560920LzG.LIZ(videoPublishEditModel, false, true);
                C0M5N c0m5n2 = C0M5N.LIZ;
                C0M5P c0m5p = new C0M5P(c19eg, bundle, null);
                c0m5n2.getClass();
                C0M5N.LIZ(c0m5p);
            }
        });
        c0m5n.getClass();
        C0M5N.LIZ(c540370LHf);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0094 A[Catch: all -> 0x0111, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0020, B:9:0x0037, B:11:0x0040, B:13:0x0046, B:15:0x004c, B:21:0x0059, B:22:0x005c, B:24:0x0062, B:26:0x0068, B:32:0x0078, B:34:0x0080, B:35:0x0082, B:37:0x0086, B:41:0x0094, B:43:0x009c, B:46:0x00a3, B:48:0x00a9, B:51:0x00bc, B:53:0x00c0, B:66:0x00fc, B:54:0x00c8, B:56:0x00ce, B:58:0x00d4, B:60:0x00da, B:61:0x00de, B:63:0x00e4, B:64:0x00ee, B:69:0x0103), top: B:75:0x0005 }] */
    @Override // X.InterfaceC1439070nYH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r6, android.content.Intent r7, X.InterfaceC1452170ntP r8, boolean r9) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.publish.service.InternalPublishServiceImpl.LJJJ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, android.content.Intent, X.0ntP, boolean):void");
    }

    @Override // X.InterfaceC1439070nYH
    public final void LJJJI(final AbstractC214814194y abstractC214814194y, final Activity activity, final VideoPublishEditModel videoPublishEditModel, final InterfaceC1452170ntP interfaceC1452170ntP) {
        Integer numValueOf;
        C1436230nTh c1436230nTh = C1436230nTh.LIZ;
        synchronized (C1436230nTh.class) {
            C1436310nTp.LIZ.getClass();
            C1436230nTh.LIZ.getClass();
            Pair pairLJII = C1436230nTh.LJII(videoPublishEditModel);
            boolean zBooleanValue = ((Boolean) pairLJII.getFirst()).booleanValue();
            String str = (String) pairLJII.getSecond();
            if (!zBooleanValue) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("ab close: ");
                sbLIZ.append(str);
                C1436230nTh.LJIIIZ(videoPublishEditModel, C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            C1436230nTh.LJFF = true;
            if (!C0FNT.LIZIZ(activity)) {
                C1436230nTh.LJIIIZ(videoPublishEditModel, "activity invalidate");
                return;
            }
            if (!C1436230nTh.LIZLLL(interfaceC1452170ntP, videoPublishEditModel)) {
                return;
            }
            if (((Boolean) C262790ARp.LIZ.getValue()).booleanValue()) {
                if (interfaceC1452170ntP == null) {
                    numValueOf = null;
                } else {
                    numValueOf = Integer.valueOf(interfaceC1452170ntP.getDuration());
                }
                if (C1436220nTg.LIZ(videoPublishEditModel, false) || u4.LJLIIL(u4.LJJIFFI(videoPublishEditModel, numValueOf))) {
                    C1436230nTh.LJIIIZ(videoPublishEditModel, "has edited before pre publish!");
                    return;
                }
            }
            C1436230nTh.LJI = (C11JF) C11NZ.LJLJJLL(C1436230nTh.LIZIZ(videoPublishEditModel), TimeUnit.MILLISECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0nTi
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:102:0x025c  */
                /* JADX WARN: Removed duplicated region for block: B:105:0x0264  */
                /* JADX WARN: Removed duplicated region for block: B:108:0x026c  */
                /* JADX WARN: Removed duplicated region for block: B:115:0x0303  */
                /* JADX WARN: Removed duplicated region for block: B:116:0x0306  */
                /* JADX WARN: Removed duplicated region for block: B:117:0x0309  */
                /* JADX WARN: Removed duplicated region for block: B:118:0x030c  */
                /* JADX WARN: Removed duplicated region for block: B:36:0x00b8  */
                /* JADX WARN: Removed duplicated region for block: B:61:0x0138  */
                /* JADX WARN: Removed duplicated region for block: B:81:0x01c2  */
                /* JADX WARN: Removed duplicated region for block: B:88:0x01e1  */
                /* JADX WARN: Removed duplicated region for block: B:91:0x01fa  */
                /* JADX WARN: Removed duplicated region for block: B:99:0x0254  */
                /* JADX WARN: Type inference failed for: r13v0 */
                /* JADX WARN: Type inference failed for: r13v1, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r13v2 */
                /* JADX WARN: Type inference failed for: r6v11 */
                /* JADX WARN: Type inference failed for: r6v12, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r6v17 */
                @Override // X.C09JN
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void accept(java.lang.Object r18) {
                    /*
                        Method dump skipped, instruction units count: 819
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1436240nTi.accept(java.lang.Object):void");
                }
            }, new AfS191S0100000_22(videoPublishEditModel, 1));
            if (((Boolean) C281030Azt.LIZ.getValue()).booleanValue()) {
                C201955140j.LIZIZ("EditPrePublishComponent", "no memory leak usage");
                abstractC214814194y.getLifecycle().addObserver(new EditPagePrePublishController$tryStartEditPagePrePublish$3());
            }
        }
    }

    @Override // X.InterfaceC1439070nYH
    public final void LJIILLIIL(C19EG c19eg, String str, C1402840mbq c1402840mbq, String str2, String str3) {
        C1437830nWH.LIZ.getClass();
        if (!o.LJIIZILJ.isLogin()) {
            final C1436430nU1 c1436430nU1 = new C1436430nU1(c19eg, str, c1402840mbq, str2, str3);
            o.LJIIZILJ.LJIIIIZZ(c19eg, "video_edit_page", "click_shoot", null, new InterfaceC19305710fv() { // from class: X.0nU6
                @Override // X.InterfaceC19305710fv
                public final void onCancel() {
                }

                @Override // X.InterfaceC19305710fv
                public final void onSuccess() {
                    c1436430nU1.invoke();
                }
            });
        } else {
            C1437830nWH.LIZIZ(c19eg, str, c1402840mbq, str2, str3);
        }
    }
}
