package com.ss.android.ugc.aweme.shortvideo;

import X.AbstractC19852312lt;
import X.AnonymousClass0956;
import X.C05WK;
import X.C086I;
import X.C0CHQ;
import X.C0EQL;
import X.C0HCK;
import X.C0LZD;
import X.C1390380mHk;
import X.C1398350mUb;
import X.C1426005i6;
import X.C1448790nnx;
import X.C1655760tBm;
import X.C19576911iZ;
import X.C19EG;
import X.C1DRG;
import X.C201955140j;
import X.C201967140v;
import X.C2093608Ic;
import X.C2188811AlT;
import X.C23250099c;
import X.C298330Bmh;
import X.C524780Ki4;
import X.C537970L7z;
import X.C538330L9j;
import X.C540720LIo;
import X.C554830LpR;
import X.C566050MHz;
import X.C571500MbE;
import X.C580090Mp5;
import X.C580130Mp9;
import X.C580200MpG;
import X.C786410Ut5;
import X.C856610Xj1;
import X.InterfaceC1648570t0B;
import X.InterfaceC1650140t2i;
import X.InterfaceC1656000tCA;
import X.InterfaceC2254081DKk;
import X.InterfaceC579700MoS;
import Y.AObjectS284S0200000_8;
import Y.AObjectS383S0100000_8;
import Y.AfS144S0200000_8;
import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.MicroAppModel;
import com.ss.android.ugc.aweme.creative.model.duet.DuetModel;
import com.ss.android.ugc.aweme.creative.model.duet.DuetUser;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProSchemeModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.creative.model.stitch.StitchUser;
import com.ss.android.ugc.aweme.discover.model.TaskMentionedUser;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogBuilder;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.autocut.lyricsrule.ILyricsRuleTemplatePreloadService;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.editorpro.n;
import com.ss.android.ugc.aweme.shortvideo.lyriceffect.LyricEffectAnchorRecordGate;
import com.ss.android.ugc.aweme.shortvideo.model.AVTextExtraStructHelper;
import com.ss.android.ugc.aweme.shortvideo.p1;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.aweme.shortvideo.util.j;
import com.ss.android.ugc.tools.view.uikit.factory.CreativeDialogWrapper;
import com.ss.android.vesdk.runtime.VEMem;
import com.tt.appbrandimpl.PublishExtra;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Pair;
import kotlin.jvm.internal.AwS587S0100000_8;
import lth.o;
import mn3.e0;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes9.dex */
public class p1 implements InterfaceC1650140t2i {
    public final InterfaceC2254081DKk LIZ;
    public final ShortVideoContextViewModel LIZIZ;
    public long LIZJ;
    public final C19EG LIZLLL;
    public final e0 LJ;
    public final InterfaceC1648570t0B LJFF;
    public final ShortVideoContext LJI;
    public final C580090Mp5 LJII;
    public final C1DRG LJIIIIZZ;
    public final List<InterfaceC579700MoS> LJIIIZ = new ArrayList();
    public final LyricEffectAnchorRecordGate LJIIJ;

    @Override // X.InterfaceC1650140t2i
    public final void LIZ(InterfaceC579700MoS interfaceC579700MoS) {
        ((ArrayList) this.LJIIIZ).add(interfaceC579700MoS);
    }

    @Override // X.InterfaceC1650140t2i
    public final void LIZIZ(C0LZD c0lzd) {
        EditorProSchemeModel editorProSchemeModel;
        boolean z;
        String str;
        Boolean bool = (Boolean) this.LIZIZ.LLILLJJLI.get("has_go_next");
        if (bool != null && bool.booleanValue()) {
            C201955140j.LJIILJJIL(C201967140v.LIZIZ, "VideoRecordActivity hasGoNext true return");
            return;
        }
        CameraComponentModel cameraComponentModel = this.LJI.cameraComponentModel;
        if (!cameraComponentModel.isRetakeMode && !cameraComponentModel.editorProRecordUsedForPip) {
            long jLIZIZ = C566050MHz.LIZIZ();
            if (this.LJI.LJJJJLL()) {
                jLIZIZ = 3000;
            }
            if (this.LJI.LJII() < jLIZIZ) {
                if (!this.LJI.LJJLL() && !this.LJI.LJJJJLL()) {
                    C19EG c19eg = this.LIZLLL;
                    CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                    creativeToastBuilder.messageRes(2131858171);
                    creativeToastBuilder.isTuxToastLegacy(true);
                    C1390380mHk.LIZ(c19eg, 3067, creativeToastBuilder);
                }
                if (this.LJI.LJJJJLL()) {
                    C19EG c19eg2 = this.LIZLLL;
                    CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
                    creativeToastBuilder2.messageRes(2131850549);
                    creativeToastBuilder2.isTuxToastLegacy(true);
                    C1390380mHk.LIZ(c19eg2, 3067, creativeToastBuilder2);
                }
                if (this.LJI.LJJLL()) {
                    C19EG c19eg3 = this.LIZLLL;
                    CreativeToastBuilder creativeToastBuilder3 = new CreativeToastBuilder();
                    creativeToastBuilder3.messageRes(2131858171);
                    creativeToastBuilder3.isTuxToastLegacy(true);
                    C1390380mHk.LIZ(c19eg3, 3067, creativeToastBuilder3);
                }
                this.LJFF.ko0(false);
                C1448790nnx.LIZ("record_error", "3", "is short");
                return;
            }
        }
        CreativeModel creativeModel = this.LJIIJ.LIZJ.creativeModel;
        if (creativeModel != null) {
            editorProSchemeModel = creativeModel.editorProSchemeModel;
        } else {
            editorProSchemeModel = null;
        }
        if (C537970L7z.LIZLLL(editorProSchemeModel)) {
            LyricEffectAnchorRecordGate lyricEffectAnchorRecordGate = this.LJIIJ;
            AObjectS284S0200000_8 aObjectS284S0200000_8 = new AObjectS284S0200000_8(this, c0lzd, 0);
            AObjectS383S0100000_8 aObjectS383S0100000_8 = new AObjectS383S0100000_8(this, 1);
            String strLIZJ = lyricEffectAnchorRecordGate.LIZJ();
            String strLIZLLL = lyricEffectAnchorRecordGate.LIZLLL();
            ILyricsRuleTemplatePreloadService iLyricsRuleTemplatePreloadService = (ILyricsRuleTemplatePreloadService) PluggableExtentionKt.pluggableSpi$default(ILyricsRuleTemplatePreloadService.class, false, false, false, 14, null);
            C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ENTRY musicId=");
            sbLIZ.append(strLIZJ);
            sbLIZ.append(" resourceId=");
            sbLIZ.append(strLIZLLL);
            sbLIZ.append(" hasService=");
            if (iLyricsRuleTemplatePreloadService != null) {
                z = true;
            } else {
                z = false;
            }
            sbLIZ.append(z);
            C1426005i6.LIZ(c1398350mUb, "Anchor.Record.Gate", C2188811AlT.LIZIZ(sbLIZ));
            if (strLIZJ != null && strLIZLLL != null && iLyricsRuleTemplatePreloadService != null) {
                AVMusic aVMusicLIZ = iLyricsRuleTemplatePreloadService.LIZ(strLIZJ, strLIZLLL);
                Pair<List<C0EQL>, C05WK> pairLJI = iLyricsRuleTemplatePreloadService.LJI(strLIZJ, strLIZLLL);
                if (aVMusicLIZ != null && pairLJI != null && !iLyricsRuleTemplatePreloadService.LIZJ(strLIZJ, strLIZLLL)) {
                    if (!lyricEffectAnchorRecordGate.LJ() && (str = aVMusicLIZ.path) != null && str.length() > 0) {
                        lyricEffectAnchorRecordGate.LIZ(aVMusicLIZ, str);
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("FAST-PATH key=");
                    sbLIZ2.append(strLIZJ);
                    sbLIZ2.append('#');
                    sbLIZ2.append(strLIZLLL);
                    C1426005i6.LIZ(c1398350mUb, "Anchor.Record.Gate", C2188811AlT.LIZIZ(sbLIZ2));
                    aObjectS284S0200000_8.invoke();
                    return;
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("SLOW-PATH-START key=");
                sbLIZ3.append(strLIZJ);
                sbLIZ3.append('#');
                sbLIZ3.append(strLIZLLL);
                sbLIZ3.append(" isPreloading=");
                sbLIZ3.append(iLyricsRuleTemplatePreloadService.LIZJ(strLIZJ, strLIZLLL));
                C1426005i6.LIZ(c1398350mUb, "Anchor.Record.Gate", C2188811AlT.LIZIZ(sbLIZ3));
                iLyricsRuleTemplatePreloadService.LJ(C786410Ut5.P3(lyricEffectAnchorRecordGate.LIZIZ), strLIZJ, strLIZLLL, null, null);
                CreativeLoadingDialog creativeLoadingDialogCreateLoadingDialog = lyricEffectAnchorRecordGate.LJ;
                if (creativeLoadingDialogCreateLoadingDialog == null) {
                    C19576911iZ c19576911iZ = C19576911iZ.LIZ;
                    C19EG c19eg4 = lyricEffectAnchorRecordGate.LIZIZ;
                    CreativeLoadingDialogBuilder creativeLoadingDialogBuilder = new CreativeLoadingDialogBuilder();
                    creativeLoadingDialogBuilder.showProgress(true);
                    creativeLoadingDialogBuilder.backCanCancel(false);
                    creativeLoadingDialogBuilder.cancelViewVisibleType(CreativeLoadingDialogBuilder.CancelType.VISIBLE_AFTER_5S);
                    creativeLoadingDialogBuilder.loadingMessage(lyricEffectAnchorRecordGate.LIZIZ.getString(R.string.txr));
                    creativeLoadingDialogBuilder.clickCancelListener(new AwS587S0100000_8(lyricEffectAnchorRecordGate, 118));
                    creativeLoadingDialogCreateLoadingDialog = c19576911iZ.createLoadingDialog(c19eg4, 1027, creativeLoadingDialogBuilder);
                    lyricEffectAnchorRecordGate.LJ = (CreativeDialogWrapper) creativeLoadingDialogCreateLoadingDialog;
                }
                ((CreativeDialogWrapper) creativeLoadingDialogCreateLoadingDialog).show();
                lyricEffectAnchorRecordGate.LJFF = 0;
                C786410Ut5.LJLIIL(200L, lyricEffectAnchorRecordGate.LIZLLL, lyricEffectAnchorRecordGate.LJII);
                AnonymousClass0956 anonymousClass0956 = lyricEffectAnchorRecordGate.LJI;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                lyricEffectAnchorRecordGate.LJI = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(lyricEffectAnchorRecordGate.LIZ), null, null, new C540720LIo(strLIZJ, strLIZLLL, lyricEffectAnchorRecordGate, aObjectS284S0200000_8, aObjectS383S0100000_8, iLyricsRuleTemplatePreloadService, null), 3);
                return;
            }
            C1426005i6.LIZ(c1398350mUb, "Anchor.Record.Gate", "BYPASS missing-context");
            aObjectS284S0200000_8.invoke();
            return;
        }
        LIZLLL(c0lzd);
    }

    public final void LIZLLL(C0LZD c0lzd) {
        for (int i = 0; i < ((ArrayList) this.LJIIIZ).size(); i++) {
            InterfaceC579700MoS interfaceC579700MoS = (InterfaceC579700MoS) ListProtector.get(this.LJIIIZ, i);
            if (interfaceC579700MoS.LIZ(c0lzd)) {
                C201955140j.LJIILJJIL(C201967140v.LIZIZ, "VideoRecordActivity interceptor handle return");
                if (interfaceC579700MoS instanceof n) {
                    this.LJFF.ko0(true);
                    this.LIZIZ.ko0(true);
                    return;
                } else {
                    this.LJFF.ko0(false);
                    return;
                }
            }
        }
        C201955140j.LJIILJJIL(C201967140v.LIZIZ, "VideoRecordActivity setHasGoNext true");
        this.LIZIZ.ko0(true);
        j jVar = C524780Ki4.LIZ;
        jVar.start("av_video_edit", "showProgressDialog");
        if (C298330Bmh.LIZ()) {
            jVar.start("av_video_editor_init", "showProgressDialog");
        }
        this.LIZJ = System.currentTimeMillis();
        if (this.LJI.LJJLL()) {
            this.LIZ.E4(this.LJI.cameraComponentModel.isMuted);
        }
        if (MusicBeanUtilKt.extractAVMusic(this.LJI.creativeModel.musicBuzModel) == null) {
            ShortVideoContext shortVideoContext = this.LJI;
            if (shortVideoContext.mIsFromDraft && shortVideoContext.creativeModel.musicBuzModel.isDraftMusicIllegal) {
                this.LIZ.E4(true);
            }
        }
        jVar.step("av_video_edit", "startConcat");
        C1655760tBm c1655760tBmQd1 = this.LJ.qd1();
        c1655760tBmQd1.LIZ = this.LJI.cameraComponentModel.mWorkspace.LIZIZ().getPath();
        c1655760tBmQd1.LIZIZ = this.LJI.cameraComponentModel.mWorkspace.LIZ().getPath();
        c1655760tBmQd1.LJ = this.LIZ.getMediaController();
        c1655760tBmQd1.LIZLLL = this.LJI.enableSingleSegmentConcatUseCopy;
        c1655760tBmQd1.LJI = !r1.LJJJJLL();
        c1655760tBmQd1.LJII = VEMem.getInstance().inLowMemMode();
        SettingsManager.LIZLLL().getClass();
        c1655760tBmQd1.LJFF = SettingsManager.LIZ("pre_release_gpu_resource", false);
        c1655760tBmQd1.LIZJ = C580200MpG.LIZ(this.LJI);
        c1655760tBmQd1.LIZ(new InterfaceC1656000tCA() { // from class: X.0MoB
            @Override // X.InterfaceC1656000tCA
            public final void LIZ(int i2, String str, String str2, String str3) {
                C11NZ c11nzLJJJLZIJ;
                p1 p1Var = this.LIZ;
                p1Var.getClass();
                C201967140v c201967140v = C201967140v.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("MultiEditLog: concat statusCode");
                sbLIZ.append(i2);
                C201955140j.LIZJ(c201967140v, C2188811AlT.LIZIZ(sbLIZ));
                C524780Ki4.LIZ.step("av_video_edit", "concatEnd");
                C579650MoN c579650MoN = new C579650MoN(str, str2, str3, i2);
                p1Var.LJFF.Ak().LIZ();
                C19482711Kf c19482711KfLJIJJLI = C11NZ.LJIJJLI(new C2325391G0r(p1Var.LJI, 0));
                ShortVideoContext shortVideoContext2 = p1Var.LJI;
                if (shortVideoContext2.LJJJJLL()) {
                    c11nzLJJJLZIJ = C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.0Lt2
                        @Override // X.InterfaceC1478005qU
                        public final void subscribe(C09AJ c09aj) {
                            C1C7U.LIZ("GoNextFactoryFactory@2bad.getMultiEditVideoStatusRecordData$1L");
                            c09aj.onNext(AbstractC19852312lt.absent());
                            c09aj.onComplete();
                            C1C7U.LIZIZ("GoNextFactoryFactory@2bad.getMultiEditVideoStatusRecordData$1L");
                        }
                    });
                } else {
                    c11nzLJJJLZIJ = C11NZ.LJIJJLI(new C581240Mqw(p1Var, shortVideoContext2, str3, 0)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ());
                }
                C11NZ.LJLLI(c19482711KfLJIJJLI, c11nzLJJJLZIJ, C11NZ.LJIJJLI(new C581220Mqu(p1Var, c579650MoN, 2)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()), new InterfaceC953020auK() { // from class: X.0MoR
                    @Override // X.InterfaceC953020auK
                    public final Object LIZ(Object obj, Object obj2, Object obj3) {
                        return new C579660MoO((AbstractC19852312lt) obj, (AbstractC19852312lt) obj2, obj3);
                    }
                }).LJJLL(new AfS144S0200000_8(p1Var, c579650MoN, 3), C2356409Le.LL);
            }
        });
    }

    public static void LJ(Context context, ShortVideoContext shortVideoContext) {
        String strLIZIZ;
        String strLIZIZ2;
        int iIndexOf;
        int length;
        String str;
        AVTextExtraStruct aVTextExtraStructCreateAtStruct;
        if (!TextUtils.isEmpty(shortVideoContext.title) && !C580130Mp9.LIZ(shortVideoContext.structList)) {
            return;
        }
        if (shortVideoContext.LJJJJLL()) {
            User fromUser = shortVideoContext.stitchContext.stitchParams.getFromUser();
            Objects.requireNonNull(fromUser);
            String awemeId = shortVideoContext.stitchContext.stitchParams.getAwemeId();
            shortVideoContext.creativeModel.stitchModel.stitchAuthor = new StitchUser(fromUser.getUid(), fromUser.getSecUid(), fromUser.getNickname(), fromUser.getUniqueId(), fromUser.getShortId());
            shortVideoContext.disableDeleteChain = true;
            CreativeModel creativeModel = shortVideoContext.creativeModel;
            creativeModel.postPageModel.captionModel.disableDeleteChain = true;
            creativeModel.stitchModel.videoId = awemeId;
            C0CHQ.LIZ().getPublishService().LJIIJJI();
            if (!C856610Xj1.LIZ(null)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(e3.g);
                sbLIZ.append(C0HCK.LIZ(fromUser));
                String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ);
                String string = context.getString(2131844956, strLIZIZ3);
                if (string.endsWith(strLIZIZ3)) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(string);
                    sbLIZ2.append(" ");
                    string = C2188811AlT.LIZIZ(sbLIZ2);
                }
                if (!string.endsWith(" ")) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(string);
                    sbLIZ3.append(" ");
                    string = C2188811AlT.LIZIZ(sbLIZ3);
                }
                int iIndexOf2 = string.indexOf(strLIZIZ3);
                int length2 = strLIZIZ3.length() + iIndexOf2;
                ArrayList arrayList = new ArrayList();
                AVTextExtraStruct aVTextExtraStructCreateDuetStruct = AVTextExtraStructHelper.createDuetStruct(iIndexOf2, length2, fromUser.getUid(), awemeId);
                arrayList.add(AVTextExtraStructHelper.createStitchChainBoundaryStruct(string));
                arrayList.add(aVTextExtraStructCreateDuetStruct);
                shortVideoContext.structList = arrayList;
                shortVideoContext.title = string;
                shortVideoContext.chain = string;
                return;
            }
            return;
        }
        if (shortVideoContext.LJJLL()) {
            User user = shortVideoContext.duetFromUser;
            String uid = "";
            if (user != null) {
                shortVideoContext.creativeModel.duetModel.duetAuthor = new DuetUser((String) AbstractC19852312lt.fromNullable(user.getUid()).or(""), (String) AbstractC19852312lt.fromNullable(user.getSecUid()).or(""), (String) AbstractC19852312lt.fromNullable(user.getNickname()).or(""), (String) AbstractC19852312lt.fromNullable(user.getUniqueId()).or(""), (String) AbstractC19852312lt.fromNullable(user.getShortId()).or(""));
            }
            shortVideoContext.disableDeleteChain = true;
            CreativeModel creativeModel2 = shortVideoContext.creativeModel;
            creativeModel2.postPageModel.captionModel.disableDeleteChain = true;
            DuetModel duetModel = creativeModel2.duetModel;
            DuetContext duetContext = shortVideoContext.cameraComponentModel.duetContext;
            duetModel.duetVideoId = duetContext.duetFromAwemeId;
            duetModel.duetHashtag = duetContext.duetFromChallengeName;
            C0CHQ.LIZ().getPublishService().LJIIJJI();
            String secUid = null;
            if (C856610Xj1.LIZ(null)) {
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            if (shortVideoContext.cameraComponentModel.recordMode == 1) {
                String strLIZ = C0HCK.LIZ(user);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("");
                sbLIZ4.append(context.getString(2131826982, strLIZ));
                strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ4);
                iIndexOf = strLIZIZ2.indexOf(strLIZ) - 1;
                length = iIndexOf + 1 + strLIZ.length();
                shortVideoContext.chain = strLIZIZ2;
                str = "";
            } else {
                if (user == null) {
                    strLIZIZ = "";
                } else {
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append(e3.g);
                    sbLIZ5.append(C0HCK.LIZ(user));
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ5);
                }
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("");
                sbLIZ6.append(context.getString(2131832477, strLIZIZ));
                String strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ6);
                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                sbLIZ7.append(strLIZIZ4);
                sbLIZ7.append(" ");
                strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ7);
                shortVideoContext.chain = strLIZIZ2;
                if (!TextUtils.isEmpty(shortVideoContext.cameraComponentModel.duetContext.duetFromChallengeName)) {
                    StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                    sbLIZ8.append(strLIZIZ2);
                    sbLIZ8.append("#");
                    sbLIZ8.append(shortVideoContext.cameraComponentModel.duetContext.duetFromChallengeName);
                    sbLIZ8.append(" ");
                    strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ8);
                }
                iIndexOf = strLIZIZ2.indexOf(strLIZIZ);
                length = strLIZIZ.length() + iIndexOf;
                str = shortVideoContext.cameraComponentModel.duetContext.duetFromAwemeId;
                if (str == null) {
                    if (user != null) {
                        uid = user.getUid();
                        secUid = user.getSecUid();
                    }
                }
                aVTextExtraStructCreateAtStruct = AVTextExtraStructHelper.createAtStruct(iIndexOf, length, uid, secUid);
                arrayList2.add(aVTextExtraStructCreateAtStruct);
                shortVideoContext.structList = arrayList2;
                shortVideoContext.title = strLIZIZ2;
                return;
            }
            if (user != null) {
                aVTextExtraStructCreateAtStruct = AVTextExtraStructHelper.createDuetStruct(iIndexOf, length, user.getUid(), str);
                arrayList2.add(AVTextExtraStructHelper.createDuetChainBoundaryStruct(strLIZIZ2));
            } else {
                aVTextExtraStructCreateAtStruct = AVTextExtraStructHelper.createAtStruct(iIndexOf, length, uid, secUid);
            }
            arrayList2.add(aVTextExtraStructCreateAtStruct);
            shortVideoContext.structList = arrayList2;
            shortVideoContext.title = strLIZIZ2;
            return;
        }
        MicroAppModel microAppModel = shortVideoContext.microAppModel;
        if (microAppModel == null || TextUtils.isEmpty(microAppModel.extra)) {
            return;
        }
        try {
            PublishExtra publishExtra = (PublishExtra) o.LIZIZ.LJII(shortVideoContext.microAppModel.extra, PublishExtra.class);
            if (publishExtra == null) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            if (!C086I.LIZIZ(publishExtra.hashTagList)) {
                for (String str2 : publishExtra.hashTagList) {
                    sb.append("#");
                    sb.append(str2);
                    sb.append(" ");
                }
            }
            String strJ4 = publishExtra.videoTitle;
            if (!C2093608Ic.LJ(strJ4)) {
                if (!C086I.LIZIZ(publishExtra.userList)) {
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    for (TaskMentionedUser taskMentionedUser : publishExtra.userList) {
                        StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                        sbLIZ9.append(e3.g);
                        sbLIZ9.append(taskMentionedUser.getNickname());
                        arrayList4.add(C2188811AlT.LIZIZ(sbLIZ9));
                        int iIndexOf3 = strJ4.indexOf(taskMentionedUser.getNickname()) - 1;
                        arrayList3.add(AVTextExtraStructHelper.createAtStruct(iIndexOf3, iIndexOf3 + 1 + taskMentionedUser.getNickname().length(), taskMentionedUser.getUserId(), taskMentionedUser.getSecUid()));
                    }
                    strJ4 = C786410Ut5.j4(strJ4, arrayList4.toArray());
                    shortVideoContext.structList = arrayList3;
                }
                sb.append(strJ4);
            }
            shortVideoContext.title = sb.toString();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData LJFF(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r12, java.lang.String r13) {
        /*
            Method dump skipped, instruction units count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.p1.LJFF(com.ss.android.ugc.aweme.shortvideo.ShortVideoContext, java.lang.String):com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData");
    }

    public static EditPreviewInfo LIZJ(ShortVideoContext shortVideoContext, MultiEditVideoStatusRecordData multiEditVideoStatusRecordData, String str, String str2) {
        EditPreviewInfo editPreviewInfoLIZ;
        if (multiEditVideoStatusRecordData != null && !shortVideoContext.LJJJJLL()) {
            editPreviewInfoLIZ = new C554830LpR(shortVideoContext.cameraComponentModel.mVideoWidth, d4.LJIIIIZZ(shortVideoContext), false, null, null, 252).LIZ(multiEditVideoStatusRecordData.curMultiEditVideoRecordData);
        } else {
            editPreviewInfoLIZ = new C538330L9j(shortVideoContext.cameraComponentModel.mVideoWidth, d4.LJIIIIZZ(shortVideoContext), 12).LIZ(new EditVideoSegment(str, str2, C571500MbE.LJIIJ(str)));
        }
        if (shortVideoContext.stitchContext.stitchParams != null) {
            for (File file : shortVideoContext.cameraComponentModel.mWorkspace.LL.Ym()) {
                shortVideoContext.stitchContext.stitchParams.getRecordVideoPathLists().add(file.getPath());
            }
            for (File file2 : shortVideoContext.cameraComponentModel.mWorkspace.LL.U4()) {
                shortVideoContext.stitchContext.stitchParams.getRecordVideoPathLists().add(file2.getPath());
            }
        }
        StitchParams stitchParams = shortVideoContext.stitchContext.stitchParams;
        if (stitchParams != null && stitchParams.getVideoSegment() != null) {
            ListProtector.add(editPreviewInfoLIZ.getVideoList(), 0, shortVideoContext.stitchContext.stitchParams.getVideoSegment());
            shortVideoContext.stitchContext.stitchParams.setConcatVideoPath(str);
            shortVideoContext.stitchContext.stitchParams.setConcatAudioPath(str2);
        }
        return editPreviewInfoLIZ;
    }

    public p1(LifecycleOwner lifecycleOwner, C19EG c19eg, e0 e0Var, InterfaceC1648570t0B interfaceC1648570t0B, ShortVideoContext shortVideoContext, C1DRG c1drg) {
        this.LIZLLL = c19eg;
        this.LJ = e0Var;
        this.LJFF = interfaceC1648570t0B;
        this.LIZ = e0Var.St2();
        this.LJI = shortVideoContext;
        this.LJIIIIZZ = c1drg;
        this.LJII = (C580090Mp5) c1drg.LJII(C580090Mp5.class, null);
        this.LIZIZ = (ShortVideoContextViewModel) ((ViewModelProvider) c1drg.LJII(ViewModelProvider.class, null)).get(ShortVideoContextViewModel.class);
        this.LJIIJ = new LyricEffectAnchorRecordGate(lifecycleOwner, c19eg, shortVideoContext);
    }
}
