package com.ss.android.ugc.aweme.social.creation.mediapicker.ui;

import X.AbstractC848400XPy;
import X.AnonymousClass0950;
import X.C01GW;
import X.C05P0;
import X.C05UE;
import X.C06MT;
import X.C095G;
import X.C098200Yq;
import X.C09IC;
import X.C09IR;
import X.C09R3;
import X.C0C64;
import X.C0L0K;
import X.C0L2N;
import X.C0L76;
import X.C0LAB;
import X.C0LGY;
import X.C0LJA;
import X.C0LJB;
import X.C0LJE;
import X.C0LJI;
import X.C0M4M;
import X.C0M8Q;
import X.C0M8T;
import X.C0M96;
import X.C0MEB;
import X.C0MED;
import X.C0PEM;
import X.C0S12;
import X.C0XQ7;
import X.C11NJ;
import X.C1389880mGw;
import X.C13BV;
import X.C13FE;
import X.C13LE;
import X.C13LP;
import X.C1452640nuA;
import X.C1458370o3P;
import X.C15438062q;
import X.C1618440sDa;
import X.C1697810uHb;
import X.C189200o6;
import X.C1DEK;
import X.C1DFH;
import X.C201955140j;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C2217371BqR;
import X.C2252331DDr;
import X.C23203097h;
import X.C23212097q;
import X.C23213097r;
import X.C23250099c;
import X.C2341909Fp;
import X.C2471909mP;
import X.C2495709qF;
import X.C289260BVk;
import X.C291040Baw;
import X.C298040BmE;
import X.C298630BnB;
import X.C298680BnG;
import X.C306750C0r;
import X.C306760C0s;
import X.C439001nI;
import X.C452501pT;
import X.C522700Kei;
import X.C523280Kfe;
import X.C533730KwV;
import X.C533930Kwp;
import X.C536350L1t;
import X.C536380L1w;
import X.C540820LIy;
import X.C553680Lna;
import X.C562260M3k;
import X.C563490M8d;
import X.C563500M8e;
import X.C563530M8h;
import X.C563560M8k;
import X.C563580M8m;
import X.C563590M8n;
import X.C563600M8o;
import X.C563610M8p;
import X.C563620M8q;
import X.C580130Mp9;
import X.EnumC2252401DDy;
import X.EnumC562220M3g;
import X.EnumC563460M8a;
import X.InterfaceC2217461Bqa;
import X.InterfaceC2342209Fs;
import X.InterfaceC2471609mM;
import X.InterfaceC346201Wa;
import X.InterfaceC497601wk;
import X.InterfaceC536360L1u;
import Y.AComparatorS27S0000000_8;
import Y.ARunnableS102S0100000_2;
import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.CreativeFlowData;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.PUgcTemplateData;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel;
import com.ss.android.ugc.aweme.creative.model.live.LiveRecordModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.IAVDraftService;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.social.creation.api.mediapicker.EnterStoryParam;
import com.ss.android.ugc.aweme.social.creation.api.mediapicker.SocialMediaPickerConfig;
import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.medialoader.BasicMediaEngine;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.medialoader.MediaEngine;
import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.preview.PurePreviewMediaEngine;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class SocialMediaPickerViewModel extends AndroidViewModel {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLI;
    public final SocialMediaPickerConfig LL;
    public final C563530M8h LLILLJJLI;
    public final C563610M8p LLILLL;
    public EnterStoryParam LLILZ;
    public final MediaEngine LLILZIL;
    public final String LLILZLL;
    public final C563590M8n LLIZ;
    public final C563600M8o LLIZLLLIL;
    public C0M8Q LLJ;
    public final C05P0 LLJI;
    public final C05P0 LLJIJIL;
    public final C05P0 LLJILJIL;
    public final C05P0 LLJILJILJ;
    public final C05P0 LLJILLL;
    public final C05P0 LLJJ;
    public final C563560M8k LLJJI;
    public final C563560M8k LLJJIII;
    public final C05P0 LLJJIJI;
    public final C563560M8k LLJJIJIIJIL;
    public final C2252331DDr LLJJIJIL;
    public final AnonymousClass0950 LLJJJ;
    public final C1DEK LLJJJIL;
    public final InterfaceC346201Wa<C06MT> LLJJJJ;
    public final C2252331DDr LLJJJJJIL;
    public final AnonymousClass0950 LLJJJJLIIL;
    public C0LJI LLJJL;
    public final C05P0 LLJJLIIIJLLLLLLLZ;
    public final C05P0 LLJL;
    public final C05P0 LLJLIL;
    public final C05P0 LLJLILLLLZIIL;
    public final C05P0 LLJLL;
    public final C05P0 LLJLLIL;
    public final C563560M8k LLJLLL;
    public final C563560M8k LLJZ;
    public final C563560M8k LLJZIJLIL;
    public C536350L1t LLL;
    public final C01GW LLLF;
    public final C11NJ LLLFF;
    public final C01GW LLLFFI;
    public final Set<String> LLLFZ;

    static {
        C2217371BqR c2217371BqR = new C2217371BqR(SocialMediaPickerViewModel.class, "storyAlbumDraftCount", "getStoryAlbumDraftCount()I", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217371BqR c2217371BqR2 = new C2217371BqR(SocialMediaPickerViewModel.class, "storyAlbumDraftFreeUpSpace", "getStoryAlbumDraftFreeUpSpace()J", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR3 = new C2217371BqR(SocialMediaPickerViewModel.class, "onThisDayAwemes", "getOnThisDayAwemes()Ljava/util/List;", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR4 = new C2217371BqR(SocialMediaPickerViewModel.class, "lastHandledPermissionType", "getLastHandledPermissionType()Lcom/ss/android/ugc/aweme/social/creation/mediapicker/ui/SocialMediaPickerViewModel$MediaPermissionType;", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR5 = new C2217371BqR(SocialMediaPickerViewModel.class, "allowMediaReUpdate", "getAllowMediaReUpdate()Z", 0);
        c09r3.getClass();
        C2217371BqR c2217371BqR6 = new C2217371BqR(SocialMediaPickerViewModel.class, "hasEverLoaded", "getHasEverLoaded()Z", 0);
        c09r3.getClass();
        LLLI = new InterfaceC2217461Bqa[]{c2217371BqR, c2217371BqR2, c2217371BqR3, c2217371BqR4, c2217371BqR5, c2217371BqR6};
    }

    public static Pair MQ2() {
        IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
        if (iExternalService == null) {
            return new Pair(-1, -1L);
        }
        IAVDraftService iAVDraftServiceDraftService = iExternalService.draftService();
        C553680Lna c553680LnaQueryDraftsInfo = iAVDraftServiceDraftService.queryDraftsInfo(new C0M4M(true, false, EnumC562220M3g.NORMAL, (C562260M3k) null, true));
        if (!iExternalService.configService().avsettingsConfig().enableSaveDraftAfterPosting()) {
            return new Pair(Integer.valueOf(c553680LnaQueryDraftsInfo.LIZ), Long.valueOf(c553680LnaQueryDraftsInfo.LJFF));
        }
        C553680Lna c553680LnaQueryDraftsInfo2 = iAVDraftServiceDraftService.queryDraftsInfo(new C0M4M(true, false, EnumC562220M3g.POSTED, (C562260M3k) null, true));
        return new Pair(Integer.valueOf(c553680LnaQueryDraftsInfo.LIZ + c553680LnaQueryDraftsInfo2.LIZ), Long.valueOf(c553680LnaQueryDraftsInfo.LJFF + c553680LnaQueryDraftsInfo2.LJFF));
    }

    public final List<C0LJE> AQ2() {
        List<C0LJE> mediaTabList;
        SocialMediaPickerConfig.TabAreaUIConfig tabAreaUIConfig = this.LL.getTabAreaUIConfig();
        if (tabAreaUIConfig == null || (mediaTabList = tabAreaUIConfig.getMediaTabList()) == null) {
            return null;
        }
        return C13LP.LJLLLL(new AComparatorS27S0000000_8(7), mediaTabList);
    }

    public final boolean BQ2() {
        return ((Boolean) this.LLJIJIL.getValue()).booleanValue();
    }

    public final boolean CQ2() {
        return ((Boolean) this.LLJILJIL.getValue()).booleanValue();
    }

    public final C563490M8d DQ2() {
        return (C563490M8d) this.LLJLLIL.getValue();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void JQ2() {
        CreativeModel creativeModel;
        CreativeModel creativeModel2;
        PUgcTemplateData pUgcTemplateData;
        CreativeModel creativeModel3;
        MusicBuzModel musicBuzModel;
        Workspace workspace;
        CreativeModel creativeModel4;
        MusicBuzModel musicBuzModel2;
        MusicBuzModel musicBuzModel3;
        String str;
        CreativeFlowData creativeFlowData;
        CreativeModel creativeModel5;
        CreativeModel creativeModel6;
        C0M8Q c0m8q = this.LLJ;
        if (c0m8q != null) {
            List<SocMediaResource> list = xQ2().LIZ;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<SocMediaResource> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().tiktokMediaModel);
            }
            if (c0m8q.LIZLLL(arrayList)) {
                return;
            }
        }
        C536350L1t c536350L1t = this.LLL;
        if (c536350L1t != null) {
            List<SocMediaResource> list2 = xQ2().LIZ;
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
            Iterator<SocMediaResource> it3 = list2.iterator();
            while (it3.hasNext()) {
                arrayList2.add(it3.next().path);
            }
            C1458370o3P c1458370o3P = C1458370o3P.LIZ;
            String creationId = c536350L1t.LJIIIIZZ.getCreationId();
            c1458370o3P.getClass();
            if (C289260BVk.LIZIZ()) {
                C1458370o3P.LJJIJIIJIL(creationId, arrayList2);
            }
        }
        final C536350L1t c536350L1t2 = this.LLL;
        if (c536350L1t2 != null) {
            List<SocMediaResource> list3 = xQ2().LIZ;
            c536350L1t2.LJIIIIZZ(list3);
            ArrayList arrayList3 = new ArrayList();
            for (SocMediaResource socMediaResource : list3) {
                if (socMediaResource.LIZLLL()) {
                    arrayList3.add(socMediaResource);
                }
            }
            int size = arrayList3.size();
            int size2 = list3.size() - size;
            Iterator<SocMediaResource> it4 = list3.iterator();
            long j = 0;
            while (it4.hasNext()) {
                j += it4.next().durationMs;
            }
            List<InterfaceC2342209Fs> list4 = C2341909Fp.LIZ;
            C0LAB c0lab = new C0LAB();
            ShortVideoContext shortVideoContext = c536350L1t2.LJII;
            c0lab.LJ("creation_id", shortVideoContext != null ? shortVideoContext.getCreationId() : null);
            ShortVideoContext shortVideoContext2 = c536350L1t2.LJII;
            c0lab.LJ("shoot_way", shortVideoContext2 != null ? shortVideoContext2.shootWay : null);
            ShortVideoContext shortVideoContext3 = c536350L1t2.LJII;
            c0lab.LJ("content_source", shortVideoContext3 != null ? shortVideoContext3.enterFrom : null);
            ShortVideoContext shortVideoContext4 = c536350L1t2.LJII;
            c0lab.LJ("shoot_enter_from", shortVideoContext4 != null ? shortVideoContext4.enterFrom : null);
            ShortVideoContext shortVideoContext5 = c536350L1t2.LJII;
            c0lab.LJ("shoot_enter_method", shortVideoContext5 != null ? shortVideoContext5.enterMethod : null);
            c0lab.LIZ(c536350L1t2.LJIILJJIL ? 1 : 0, "is_upload_direct_enter");
            c0lab.LJ("content_type", c536350L1t2.LJIL);
            c0lab.LIZ(size2, "photo_cnt");
            c0lab.LIZ(size, "video_cnt");
            c0lab.LIZIZ(j, "duration_ms");
            c0lab.LIZ(0, "live_photo_cnt");
            c536350L1t2.LJ(c0lab);
            C2341909Fp.LIZ("upload_content_next", c0lab.LIZ);
            int i = 0;
            for (SocMediaResource socMediaResource2 : list3) {
                int i2 = i + 1;
                if (i < 0) {
                    C1697810uHb.LJIJI();
                    throw null;
                }
                TikTokMediaModel tikTokMediaModel = socMediaResource2.tiktokMediaModel;
                tikTokMediaModel.selectIndex = i2;
                tikTokMediaModel.copiedCount = 1;
                i = i2;
            }
            final ArrayList<MediaModel> arrayList4 = new ArrayList(C15438062q.LJIJJ(list3, 10));
            Iterator<SocMediaResource> it5 = list3.iterator();
            while (it5.hasNext()) {
                arrayList4.add(it5.next().tiktokMediaModel);
            }
            ShortVideoContext shortVideoContext6 = c536350L1t2.LJII;
            if (shortVideoContext6 != null && (creativeModel6 = shortVideoContext6.creativeModel) != null) {
                creativeModel6.autoCutModel = new AutoCutModel(null, null, null, null, 0, 0, false, false, null, null, null, null, 0, 0, false, null, null, null, null, null, null, null, null, null, 0, null, false, null, 0, 0, null, false, false, null, null, -1, 7, null);
            }
            ShortVideoContext shortVideoContext7 = c536350L1t2.LJII;
            if (shortVideoContext7 != null && (creativeModel5 = shortVideoContext7.creativeModel) != null) {
                creativeModel5.liveRecordModel = new LiveRecordModel(new ArrayList());
            }
            ShortVideoContext shortVideoContext8 = c536350L1t2.LJII;
            if (shortVideoContext8 != null && (creativeFlowData = shortVideoContext8.creativeFlowData) != null) {
                if (creativeFlowData.getEditorProModel() == null) {
                    creativeFlowData.setEditorProModel(new EditorProModel(false, null, false, false, "", false, 0L, null, null, false, new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), false, false, false, 0, false, false, false, false, 0, false, false, null, false, new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), false, -1, -1, "", false, false, null, null, new ArrayList(), null, new ArrayList(), new ArrayList(), new ArrayList(), new LinkedHashMap(), new ArrayList(), new ArrayList(), new ArrayList(), null, null, new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), null, new ArrayList(), new ConcurrentHashMap(), new ArrayList(), false, false, "", false, -1L, false, null));
                } else {
                    EditorProModel editorProModel = creativeFlowData.getEditorProModel();
                    if (editorProModel != null) {
                        editorProModel.setFromEditorProEntranceInAlbum(false);
                    }
                }
            }
            boolean zLIZ = C298040BmE.LIZ();
            for (MediaModel mediaModel : arrayList4) {
                if (mediaModel.LJIILJJIL()) {
                    if (zLIZ) {
                        HashMap mapLIZ = C23203097h.LIZ(mediaModel.LJFF());
                        if (mapLIZ != null && (str = (String) mapLIZ.get("live_info")) != null) {
                            mediaModel.liveInfo = str;
                        }
                    } else {
                        String str2 = TEVideoUtils.getMetaData(mediaModel.LJFF()).get("live_info");
                        if (str2 != null) {
                            mediaModel.liveInfo = str2;
                        }
                    }
                }
            }
            if (!C580130Mp9.LIZ(arrayList4)) {
                for (MediaModel mediaModel2 : arrayList4) {
                    if (mediaModel2.LJIILJJIL() && !C522700Kei.LIZ(mediaModel2)) {
                        ShortVideoContext shortVideoContext9 = c536350L1t2.LJII;
                        if (shortVideoContext9 != null && (((creativeModel = shortVideoContext9.creativeModel) != null && (musicBuzModel3 = creativeModel.musicBuzModel) != null && musicBuzModel3.isPhotoMvModeMusic) || ((creativeModel2 = shortVideoContext9.creativeModel) != null && (pUgcTemplateData = creativeModel2.pugcTemplateData) != null && pUgcTemplateData.isFromCreateTemplate && (creativeModel3 = shortVideoContext9.creativeModel) != null && (musicBuzModel = creativeModel3.musicBuzModel) != null && musicBuzModel.isFullSong))) {
                            CreativeModel creativeModel7 = shortVideoContext9.creativeModel;
                            C1452640nuA.LJ(creativeModel7 != null ? creativeModel7.musicBuzModel : null);
                            ShortVideoContext shortVideoContext10 = c536350L1t2.LJII;
                            if (shortVideoContext10 != null && (creativeModel4 = shortVideoContext10.creativeModel) != null && (musicBuzModel2 = creativeModel4.musicBuzModel) != null) {
                                MusicBeanUtilKt.updateAVMusic(musicBuzModel2, null);
                            }
                            ShortVideoContext shortVideoContext11 = c536350L1t2.LJII;
                            if (shortVideoContext11 != null && (workspace = shortVideoContext11.cameraComponentModel.mWorkspace) != null) {
                                workspace.wQ();
                            }
                        }
                        if (C2495709qF.LIZ()) {
                            c536350L1t2.LJII(arrayList4, false);
                            return;
                        }
                        C533730KwV c533730KwV = C533730KwV.LIZ;
                        InterfaceC2471609mM interfaceC2471609mM = new InterfaceC2471609mM() { // from class: X.0L1v
                            @Override // X.InterfaceC2471609mM
                            public final void LIZ(boolean z) {
                                if (z) {
                                    if (arrayList4.size() > 1) {
                                        InterfaceC536360L1u interfaceC536360L1u = c536350L1t2.LIZIZ;
                                        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                                        creativeToastBuilder.messageRes(2131857934);
                                        creativeToastBuilder.isTuxToastLegacy(true);
                                        interfaceC536360L1u.LLIIJI(creativeToastBuilder);
                                        return;
                                    }
                                    if (C2495709qF.LIZ()) {
                                        c536350L1t2.LJII(arrayList4, false);
                                        return;
                                    }
                                    InterfaceC536360L1u interfaceC536360L1u2 = c536350L1t2.LIZIZ;
                                    CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
                                    creativeToastBuilder2.messageRes(2131857936);
                                    creativeToastBuilder2.isTuxToastLegacy(true);
                                    interfaceC536360L1u2.LLIIJI(creativeToastBuilder2);
                                    return;
                                }
                                c536350L1t2.LJII(arrayList4, false);
                            }
                        };
                        c533730KwV.getClass();
                        C533730KwV.LIZ(arrayList4, interfaceC2471609mM);
                        return;
                    }
                }
            }
            c536350L1t2.LJII(arrayList4, false);
        }
    }

    public final void reset() {
        this.LLLFF.LJ();
        Iterator it2 = ((ArrayList) this.LLILLL.LIZ).iterator();
        while (it2.hasNext()) {
            ((Function0) it2.next()).invoke();
        }
        if (this.LLL != null) {
            C1458370o3P.LIZ.getClass();
            C1458370o3P.LJJIFFI(true);
        }
        C23213097r c23213097r = C23212097q.LIZ;
        synchronized (c23213097r) {
            try {
                c23213097r.evictAll();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final boolean wQ2() {
        return ((Boolean) this.LLJILLL.getValue()).booleanValue();
    }

    public final C0LJB xQ2() {
        return (C0LJB) this.LLJLILLLLZIIL.getValue();
    }

    public final C563590M8n zQ2() {
        return (C563590M8n) this.LLJLIL.getValue();
    }

    public final void HQ2() {
        C0LJB c0ljbXQ2 = xQ2();
        ArrayList arrayList = new ArrayList(xQ2().LIZ);
        try {
            arrayList.clear();
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        PQ2(C0LJB.LIZ(c0ljbXQ2, arrayList, 0, 2));
    }

    public final void NQ2() {
        if (!C306750C0r.LIZ()) {
            ((C13FE) this.LLJJIJI).setValue(Boolean.FALSE);
            return;
        }
        C439001nI c439001nI = C439001nI.LIZ;
        Keva keva = C439001nI.LIZIZ;
        c439001nI.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ALBUM_HAS_ON_THIS_DAY_");
        sbLIZ.append(C439001nI.LIZ());
        boolean z = false;
        boolean z2 = keva.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
        boolean zLIZLLL = C439001nI.LIZLLL();
        if (z2 && !zLIZLLL) {
            z = true;
        }
        ((C13FE) this.LLJJIJI).setValue(Boolean.valueOf(z));
        if (((Boolean) ((C13FE) this.LLJJIJI).getValue()).booleanValue()) {
            C1618440sDa.LIZIZ.LJJIL(new AwS587S0100000_8(this, 277));
        }
    }

    public final void OQ2() {
        IAVDraftService iAVDraftServiceDraftService;
        ExecutorService executorServiceDraftEntranceShowAndUpdateExecutor;
        if (!C291040Baw.LIZ()) {
            ((C13FE) this.LLJJ).setValue(Boolean.FALSE);
            return;
        }
        IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
        if (iExternalService == null || (iAVDraftServiceDraftService = iExternalService.draftService()) == null || (executorServiceDraftEntranceShowAndUpdateExecutor = iAVDraftServiceDraftService.draftEntranceShowAndUpdateExecutor()) == null) {
            return;
        }
        executorServiceDraftEntranceShowAndUpdateExecutor.execute(new ARunnableS102S0100000_2(this, 36));
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        reset();
        C563530M8h c563530M8h = this.LLILLJJLI;
        c563530M8h.LIZIZ = null;
        c563530M8h.LIZJ = null;
        c563530M8h.LIZLLL = null;
    }

    public final C0LJE yQ2() {
        C0LJE c0lje;
        List<C0LJE> listAQ2 = AQ2();
        return (listAQ2 == null || (c0lje = (C0LJE) C13LP.LJJJLL(listAQ2)) == null) ? C0LJE.IMAGE_AND_VIDEO : c0lje;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, java.lang.Boolean] */
    public final void FQ2(boolean z) {
        T t;
        boolean z2;
        C0LGY.LIZ.getClass();
        if (C0LGY.LJFF()) {
            t = EnumC563460M8a.LL;
        } else if (C0LGY.LJI()) {
            t = EnumC563460M8a.LLILLJJLI;
        } else {
            t = EnumC563460M8a.LLILLL;
        }
        C563560M8k c563560M8k = this.LLJLLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLI;
        if (t == c563560M8k.LIZIZ) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && (t != EnumC563460M8a.LLILLJJLI || !((Boolean) this.LLJZ.LIZIZ).booleanValue())) {
            return;
        }
        this.LLJLLL.LIZIZ = t;
        this.LLJZ.LIZIZ = Boolean.FALSE;
        InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(this);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(viewModelScope, C2107308Nj.LIZ.LLIILII(), null, new C0LJA(z, this, null), 2);
    }

    public final void IQ2(String str) {
        long jElapsedRealtime;
        ((C13FE) this.LLJILJIL).setValue(Boolean.FALSE);
        ((C13FE) this.LLJILJILJ).setValue(null);
        PQ2(C0LJB.LIZ(xQ2(), null, -1, 1));
        C0LJI c0lji = this.LLJJL;
        if (c0lji != null) {
            int size = xQ2().LIZ.size();
            Long lValueOf = Long.valueOf(c0lji.LJIIIZ);
            if (lValueOf.longValue() > 0) {
                jElapsedRealtime = SystemClock.elapsedRealtime() - lValueOf.longValue();
            } else {
                jElapsedRealtime = -1;
            }
            c0lji.LJIIIZ = 0L;
            List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (jElapsedRealtime > 0) {
                linkedHashMap.put("duration", String.valueOf(jElapsedRealtime));
            }
            linkedHashMap.put("content_cnt", String.valueOf(size));
            linkedHashMap.put("exit_type", str);
            linkedHashMap.put("is_story", "1");
            C2341909Fp.LIZ("tool_performance_content_preview", linkedHashMap);
        }
        C0M8Q c0m8q = this.LLJ;
        if (c0m8q != null) {
            c0m8q.LJIIJ();
        }
    }

    public final void LQ2(SocMediaResource socMediaResource) {
        boolean z;
        Activity activity = this.LLILLJJLI.LIZJ;
        if (activity == null) {
            return;
        }
        C0M8Q c0m8q = this.LLJ;
        if (c0m8q != null && c0m8q.LJIIIZ(socMediaResource.tiktokMediaModel)) {
            z = true;
        } else {
            z = false;
            if (!C536380L1w.LIZ(activity)) {
                return;
            }
        }
        InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(this);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(viewModelScope, C2107308Nj.LIZ.LLIILII(), null, new C0L2N(this, socMediaResource, activity, z, null), 2);
    }

    public final void PQ2(C0LJB c0ljb) {
        ((C13FE) this.LLJLILLLLZIIL).setValue(c0ljb);
    }

    public final void QQ2(String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        boolean z = false;
        if (wQ2()) {
            C201955140j.LIZLLL(C0L76.LIZIZ, "SocialMediaPickerViewModel", "disable multi select");
            Activity activity = this.LLILLJJLI.LIZJ;
            if (activity != null) {
                C1389880mGw c1389880mGw = new C1389880mGw(activity);
                c1389880mGw.LJIIIZ(C0MED.LIZ(C0MEB.ALBUM_TOAST_SELECT_PHOTO_ONLY, new Object[0]));
                c1389880mGw.LJIIJ();
                return;
            }
            return;
        }
        ((C13FE) this.LLJIJIL).setValue(Boolean.valueOf(!BQ2()));
        if (!BQ2()) {
            PQ2(C0LJB.LIZ(xQ2(), C13BV.INSTANCE, 0, 2));
            C1458370o3P.LIZ.getClass();
            C1458370o3P.LJJII();
        }
        C536350L1t c536350L1t = this.LLL;
        if (c536350L1t != null) {
            boolean zBQ2 = BQ2();
            List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
            C0LAB c0lab = new C0LAB();
            ShortVideoContext shortVideoContext = c536350L1t.LJII;
            String creationId = null;
            if (shortVideoContext != null) {
                str2 = shortVideoContext.enterFrom;
            } else {
                str2 = null;
            }
            c0lab.LJ("enter_from", str2);
            String str7 = c536350L1t.LJIILL;
            if (str7 == null || str7.length() == 0) {
                z = true;
            }
            String str8 = "";
            if (z) {
                ShortVideoContext shortVideoContext2 = c536350L1t.LJII;
                if (shortVideoContext2 == null || (str3 = shortVideoContext2.shootWay) == null) {
                    str3 = "";
                }
            } else {
                str3 = c536350L1t.LJIILL;
            }
            c0lab.LJ("shoot_way", str3);
            ShortVideoContext shortVideoContext3 = c536350L1t.LJII;
            if (shortVideoContext3 != null) {
                creationId = shortVideoContext3.getCreationId();
            }
            c0lab.LJ("creation_id", creationId);
            c0lab.LJ("content_source", "upload");
            c0lab.LJ("click_method", str);
            ShortVideoContext shortVideoContext4 = c536350L1t.LJII;
            if (shortVideoContext4 == null || (str4 = shortVideoContext4.enterMethod) == null) {
                str4 = "";
            }
            c0lab.LJ("shoot_enter_method", str4);
            ShortVideoContext shortVideoContext5 = c536350L1t.LJII;
            if (shortVideoContext5 != null && (str6 = shortVideoContext5.enterFrom) != null) {
                str8 = str6;
            }
            c0lab.LJ("shoot_enter_from", str8);
            if (zBQ2) {
                str5 = "on";
            } else {
                str5 = "off";
            }
            c0lab.LJ("to_status", str5);
            C2341909Fp.LIZ("click_multiple_select", c0lab.LIZ);
        }
    }

    public final boolean RQ2(SocMediaResource socMediaResource) {
        String enterFrom;
        EnterStoryParam enterStoryParam;
        Activity activity = this.LLILLJJLI.LIZJ;
        if (activity == null) {
            return false;
        }
        String strLJIJ = C2471909mP.LJIJ(socMediaResource.tiktokMediaModel);
        C536350L1t c536350L1t = this.LLL;
        if (c536350L1t == null || (enterStoryParam = c536350L1t.LIZ) == null || (enterFrom = enterStoryParam.getEnterFrom()) == null) {
            enterFrom = "";
        }
        return C0L0K.LIZIZ(activity, strLJIJ, enterFrom, false, 24);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:250:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x07c5 A[PHI: r4
      0x07c5: PHI (r4v39 boolean) = (r4v38 boolean), (r4v42 boolean), (r4v42 boolean) binds: [B:382:0x07c2, B:370:0x079f, B:372:0x07a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:525:0x0a95 A[PHI: r9
      0x0a95: PHI (r9v5 java.lang.String) = (r9v2 java.lang.String), (r9v6 java.lang.String) binds: [B:524:0x0a93, B:520:0x0a8c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, java.lang.Boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onEvent$social_creation_mediapicker_release(X.C0M8P r44) {
        /*
            Method dump skipped, instruction units count: 2893
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel.onEvent$social_creation_mediapicker_release(X.0M8P):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v27, types: [T, java.lang.Boolean] */
    public final void vQ2(List<C563580M8m> list) {
        C563580M8m next;
        C0LJI c0lji = this.LLJJL;
        if (c0lji != null && c0lji.LJII < 0) {
            c0lji.LJII = SystemClock.elapsedRealtime();
        }
        ((C13FE) this.LLJJLIIIJLLLLLLLZ).getValue().getClass();
        ((C13FE) this.LLJJLIIIJLLLLLLLZ).setValue(new C563600M8o(list));
        String str = zQ2().LIZ.LIZ;
        Iterator<C563580M8m> it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.LIZ, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C563580M8m c563580M8m = next;
        if (c563580M8m == null) {
            c563580M8m = (C563580M8m) C13LP.LJJJJZI(list);
        }
        ((C13FE) this.LLJLIL).setValue(C563590M8n.LIZ(zQ2(), c563580M8m, null, 2));
        C563560M8k c563560M8k = this.LLJZIJLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLI;
        if (!((Boolean) c563560M8k.LIZIZ).booleanValue()) {
            ((C13FE) this.LLJL).setValue(yQ2());
            PQ2(C0LJB.LIZ(xQ2(), new ArrayList(), 0, 2));
            this.LLJZIJLIL.LIZIZ = Boolean.TRUE;
        } else if (!Intrinsics.LJFF(c563580M8m.LIZ, str)) {
            ((C13FE) this.LLJL).setValue(yQ2());
        }
        C05P0 c05p0 = this.LLJI;
        Boolean bool = Boolean.FALSE;
        ((C13FE) c05p0).setValue(bool);
        ((C13FE) this.LLJLL).setValue(bool);
    }

    public SocialMediaPickerViewModel(SocialMediaPickerConfig socialMediaPickerConfig, C563530M8h c563530M8h) {
        MediaEngine basicMediaEngine;
        boolean z;
        String enterMethod;
        super(c563530M8h.LIZ);
        this.LL = socialMediaPickerConfig;
        this.LLILLJJLI = c563530M8h;
        C563610M8p c563610M8p = new C563610M8p();
        this.LLILLL = c563610M8p;
        if (1 == C0C64.LJIILLIIL().LJIJ(31744, 0, "story_album_use_compose_image", true)) {
            basicMediaEngine = new PurePreviewMediaEngine();
        } else {
            basicMediaEngine = new BasicMediaEngine();
        }
        this.LLILZIL = basicMediaEngine;
        String strLIZ = C05UE.LIZ(c563530M8h.LIZ);
        this.LLILZLL = strLIZ;
        int i = C540820LIy.LJI;
        C13BV c13bv = C13BV.INSTANCE;
        C563580M8m c563580M8m = new C563580M8m("&__socialCreationDefaultBucketId__&", strLIZ, c13bv, c13bv, c13bv);
        C563590M8n c563590M8n = new C563590M8n(c563580M8m, null);
        this.LLIZ = c563590M8n;
        C563600M8o c563600M8o = new C563600M8o(Collections.singletonList(c563580M8m));
        this.LLIZLLLIL = c563600M8o;
        C0LJB c0ljb = new C0LJB(new ArrayList(), -1);
        if (socialMediaPickerConfig.getHasStoryArchiveV2Entrance()) {
            C439001nI.LIZ.getClass();
            z = C439001nI.LIZIZ.getBoolean(C439001nI.LIZIZ(), false);
        } else {
            z = false;
        }
        EnterStoryParam enterStoryParam = this.LLILZ;
        String str = "";
        String enterFrom = (enterStoryParam == null || (enterFrom = enterStoryParam.getEnterFrom()) == null) ? "" : enterFrom;
        EnterStoryParam enterStoryParam2 = this.LLILZ;
        if (enterStoryParam2 != null && (enterMethod = enterStoryParam2.getEnterMethod()) != null) {
            str = enterMethod;
        }
        C563500M8e c563500M8e = new C563500M8e(C0M96.LIZ);
        C0M8T c0m8t = C0M8T.NONE;
        C563490M8d c563490M8d = new C563490M8d(z, enterFrom, str, c0m8t, c563500M8e);
        if (z) {
            if (C306760C0s.LIZ()) {
                c0m8t = C0M8T.MULTI_ENTRANCE;
            } else {
                c0m8t = C0M8T.TOP_BAR_ICON;
            }
        }
        C563490M8d c563490M8dLIZ = C563490M8d.LIZ(c563490M8d, false, c0m8t, 23);
        Boolean bool = Boolean.FALSE;
        this.LLJI = C563620M8q.LIZ(bool, c563610M8p);
        this.LLJIJIL = C563620M8q.LIZ(Boolean.valueOf(socialMediaPickerConfig.getSelectorStrategy().getEnableMultiSelectAtFirst()), c563610M8p);
        this.LLJILJIL = C563620M8q.LIZ(bool, c563610M8p);
        this.LLJILJILJ = C563620M8q.LIZ(null, c563610M8p);
        this.LLJILLL = C563620M8q.LIZ(bool, c563610M8p);
        this.LLJJ = C563620M8q.LIZ(bool, c563610M8p);
        this.LLJJI = new C563560M8k(0, c563610M8p);
        this.LLJJIII = new C563560M8k(0L, c563610M8p);
        this.LLJJIJI = C563620M8q.LIZ(bool, c563610M8p);
        this.LLJJIJIIJIL = new C563560M8k(null, c563610M8p);
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 0, null, 7);
        this.LLJJIJIL = c2252331DDrLIZIZ;
        this.LLJJJ = C09IC.LIZ(c2252331DDrLIZIZ);
        C1DEK c1dekLIZ = C095G.LIZ(-2, null, 6);
        this.LLJJJIL = c1dekLIZ;
        this.LLJJJJ = C09IC.LJJIIJ(c1dekLIZ);
        C2252331DDr c2252331DDrLIZ = C09IR.LIZ(0, 1, EnumC2252401DDy.DROP_OLDEST);
        this.LLJJJJJIL = c2252331DDrLIZ;
        this.LLJJJJLIIL = C09IC.LIZ(c2252331DDrLIZ);
        this.LLJJLIIIJLLLLLLLZ = C563620M8q.LIZ(c563600M8o, c563610M8p);
        this.LLJL = C563620M8q.LIZ(yQ2(), c563610M8p);
        this.LLJLIL = C563620M8q.LIZ(c563590M8n, c563610M8p);
        this.LLJLILLLLZIIL = C563620M8q.LIZ(c0ljb, c563610M8p);
        this.LLJLL = C563620M8q.LIZ(bool, c563610M8p);
        this.LLJLLIL = C563620M8q.LIZ(c563490M8dLIZ, c563610M8p);
        this.LLJLLL = new C563560M8k(null, c563610M8p);
        this.LLJZ = new C563560M8k(bool, c563610M8p);
        this.LLJZIJLIL = new C563560M8k(bool, c563610M8p);
        this.LLLF = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(196));
        this.LLLFF = new C11NJ();
        this.LLLFFI = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(195));
        this.LLLFZ = new LinkedHashSet();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void GQ2(int r10, java.lang.Boolean r11) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel.GQ2(int, java.lang.Boolean):void");
    }

    public final void KQ2(SocMediaResource socMediaResource, String str) {
        Object c098200Yq;
        Activity activity = this.LLILLJJLI.LIZJ;
        if (activity == null) {
            return;
        }
        C0M8Q c0m8q = this.LLJ;
        if ((c0m8q != null && c0m8q.LJIIIZ(socMediaResource.tiktokMediaModel)) || (C536380L1w.LIZ(activity) && !RQ2(socMediaResource))) {
            C0M8Q c0m8q2 = this.LLJ;
            if (c0m8q2 != null && c0m8q2.LJFF(socMediaResource.tiktokMediaModel)) {
                return;
            }
            if (!BQ2() && zQ2().LIZIZ != null) {
                QQ2("click_long_press_select");
            }
            ArrayList arrayList = new ArrayList(xQ2().LIZ);
            boolean zContains = arrayList.contains(socMediaResource);
            if (zContains) {
                try {
                    c098200Yq = Boolean.valueOf(arrayList.remove(socMediaResource));
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                C189200o6.m1boximpl(c098200Yq);
            } else {
                if (this.LL.getSelectorStrategy().getMaxSelectable() == 1) {
                    arrayList.clear();
                } else if (arrayList.size() >= this.LL.getSelectorStrategy().getMaxSelectable()) {
                    this.LLJJJJJIL.LIZJ(Unit.LIZ);
                    return;
                } else if (this.LL.getSelectorStrategy().getDisableMultiMediaTypeSelect() && !arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        if (((SocMediaResource) it2.next()).LIZJ() != socMediaResource.LIZJ()) {
                            return;
                        }
                    }
                }
                arrayList.add(socMediaResource);
                C536350L1t c536350L1t = this.LLL;
                if (c536350L1t != null) {
                    c536350L1t.LJFF(str);
                }
            }
            PQ2(C0LJB.LIZ(xQ2(), arrayList, 0, 2));
            C0M8Q c0m8q3 = this.LLJ;
            if (c0m8q3 != null) {
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(((SocMediaResource) it3.next()).tiktokMediaModel);
                }
                c0m8q3.LJIIIIZZ(arrayList2);
            }
            C536350L1t c536350L1t2 = this.LLL;
            if (c536350L1t2 != null) {
                c536350L1t2.LJIIIZ(socMediaResource, !zContains);
            }
        }
    }

    public final C536350L1t EQ2(Bundle bundle, EnterStoryParam enterStoryParam, InterfaceC536360L1u interfaceC536360L1u) {
        String creationId;
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        this.LLILZ = enterStoryParam;
        C536350L1t c536350L1t = new C536350L1t(bundle, enterStoryParam, interfaceC536360L1u, this);
        this.LLL = c536350L1t;
        c536350L1t.LJI = new AwS552S0100000_8(this, 362);
        boolean z2 = false;
        if (this.LL.getDefaultEnableAiLiveSwitch()) {
            GQ2(0, Boolean.TRUE);
        }
        C0LAB c0lab = new C0LAB();
        ShortVideoContext shortVideoContext = c536350L1t.LJII;
        if (shortVideoContext != null) {
            creationId = shortVideoContext.getCreationId();
        } else {
            creationId = null;
        }
        c0lab.LJ("creation_id", creationId);
        String str9 = c536350L1t.LJIILL;
        if (str9 != null && str9.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        String str10 = "";
        if (z) {
            ShortVideoContext shortVideoContext2 = c536350L1t.LJII;
            if (shortVideoContext2 == null || (str = shortVideoContext2.shootWay) == null) {
                str = "";
            }
        } else {
            str = c536350L1t.LJIILL;
        }
        c0lab.LJ("shoot_way", str);
        ShortVideoContext shortVideoContext3 = c536350L1t.LJII;
        if (shortVideoContext3 == null || (str2 = shortVideoContext3.enterMethod) == null) {
            str2 = "";
        }
        c0lab.LJ("shoot_enter_method", str2);
        ShortVideoContext shortVideoContext4 = c536350L1t.LJII;
        if (shortVideoContext4 != null && (str8 = shortVideoContext4.enterFrom) != null) {
            str10 = str8;
        }
        c0lab.LJ("shoot_enter_from", str10);
        c0lab.LIZ(c536350L1t.LJIILJJIL ? 1 : 0, "is_upload_direct_enter");
        ShortVideoContext shortVideoContext5 = c536350L1t.LJII;
        if (shortVideoContext5 != null && (str7 = shortVideoContext5.enterMethod) != null && C0S12.LIZLLL(str7)) {
            c0lab.LJ("content_source", "upload");
        }
        C523280Kfe.LIZ.getClass();
        C523280Kfe.LIZ(c0lab);
        String str11 = "1";
        if (((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab.LJ("is_login", str3);
        if (C533930Kwp.LIZLLL("android.permission.CAMERA")) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab.LJ("has_camera_permission", str4);
        if (C533930Kwp.LIZLLL("android.permission.RECORD_AUDIO")) {
            str5 = "1";
        } else {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab.LJ("has_microphone_permission", str5);
        ShortVideoContext shortVideoContext6 = c536350L1t.LJII;
        if (shortVideoContext6 != null && (str6 = shortVideoContext6.enterMethod) != null && C0S12.LIZLLL(str6)) {
            z2 = true;
        }
        if (!C523280Kfe.LIZJ(z2)) {
            str11 = CardStruct.IStatusCode.DEFAULT;
        }
        c0lab.LJ("is_private_access", str11);
        c0lab.LJ("story_archive_tab_name", enterStoryParam.getStoryArchiveTabName());
        if (C298680BnG.LIZ()) {
            c0lab.LIZ(C298630BnB.LIZ() ? 1 : 0, "if_key_sub_creator");
            if (enterStoryParam.isSubOnlyStory()) {
                c0lab.LJ("enter_from", "subscription_management_cell");
            }
        }
        c536350L1t.LJ(c0lab);
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZ("enter_upload_page", c0lab.LIZ);
        OQ2();
        NQ2();
        return c536350L1t;
    }
}
