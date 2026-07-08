package com.ss.android.ugc.aweme.translation.service;

import X.AbstractC1361510lXB;
import X.AbstractC1604130rqV;
import X.AbstractC19483511Kn;
import X.AbstractC2126608Uu;
import X.AbstractC848400XPy;
import X.AnonymousClass1624;
import X.AnonymousClass1639;
import X.C00I7;
import X.C01GW;
import X.C03H5;
import X.C05RH;
import X.C05YD;
import X.C07K4;
import X.C08CX;
import X.C09S2;
import X.C0B80;
import X.C0BI0;
import X.C0BJA;
import X.C0BJB;
import X.C0BJD;
import X.C0CAL;
import X.C0CQT;
import X.C0N0Y;
import X.C0S5G;
import X.C0S5N;
import X.C0SBA;
import X.C0SBC;
import X.C0SBD;
import X.C0SCU;
import X.C0SKF;
import X.C0SKG;
import X.C0SQQ;
import X.C0SXF;
import X.C0SZC;
import X.C0XQ7;
import X.C1193404lg;
import X.C11IR;
import X.C11NZ;
import X.C11S5;
import X.C1227904rF;
import X.C123100dR;
import X.C1236630iHl;
import X.C1344390l5Z;
import X.C1381100m2m;
import X.C1383320m6M;
import X.C1389890mGx;
import X.C1390840mIU;
import X.C13BV;
import X.C13IQ;
import X.C13LE;
import X.C13LP;
import X.C13LQ;
import X.C1483410ohn;
import X.C1485670olR;
import X.C15438062q;
import X.C15442062u;
import X.C161C;
import X.C161D;
import X.C161F;
import X.C161I;
import X.C161J;
import X.C161K;
import X.C161L;
import X.C161N;
import X.C161O;
import X.C161Q;
import X.C161R;
import X.C1629806Zs;
import X.C162M;
import X.C163E;
import X.C163I;
import X.C1701940uOG;
import X.C1760006us;
import X.C1839820xye;
import X.C1869640ykk;
import X.C194349111v;
import X.C1954807lC;
import X.C19581011jE;
import X.C19581111jF;
import X.C19595011lU;
import X.C19719512Dh;
import X.C19EG;
import X.C1BNE;
import X.C1E8U;
import X.C1ER1;
import X.C20642515q3;
import X.C20700315zN;
import X.C20701315zX;
import X.C20702515zj;
import X.C20703515zt;
import X.C207118162y;
import X.C207128163i;
import X.C207134163o;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2252321DDq;
import X.C2511409sm;
import X.C2547709yd;
import X.C257560A7m;
import X.C257570A7n;
import X.C281410B1f;
import X.C281430B1h;
import X.C292360Bd4;
import X.C293260BeW;
import X.C294300BgC;
import X.C295340Bhs;
import X.C305430By9;
import X.C452501pT;
import X.C461740I8u;
import X.C582980Mtk;
import X.C603820NmG;
import X.C690990R8n;
import X.C704420Rk8;
import X.C705930RmZ;
import X.C710770RuN;
import X.C729510SjV;
import X.C746760TRa;
import X.C786410Ut5;
import X.C823050WQl;
import X.EnumC1153790g89;
import X.EnumC207101162h;
import X.EnumC634640Ous;
import X.EnumC715680S5m;
import X.EnumC993880byE;
import X.InterfaceC1254030ijp;
import X.InterfaceC1294060jmO;
import X.InterfaceC1339640kxu;
import X.InterfaceC1344290l5P;
import X.InterfaceC1346190l8T;
import X.InterfaceC1731706qJ;
import X.InterfaceC19582111jP;
import X.InterfaceC19594611lQ;
import X.InterfaceC346201Wa;
import X.InterfaceC386401eo;
import X.InterfaceC712990Rxx;
import Y.AfS32S1000000_2;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.cla.experiments.captions.ToastFrequencyConfig;
import com.ss.android.ugc.aweme.comment.model.CmtAudioStruct;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.editpost.ClientText;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.ss.android.ugc.aweme.feed.model.CaptionLanguage;
import com.ss.android.ugc.aweme.feed.model.CaptionModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.TranslationInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.service.ICaptionKevaService;
import com.ss.android.ugc.aweme.setting.services.ISettingService;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.TextStickerInfo;
import com.ss.android.ugc.aweme.tars.TarsInstConfig;
import com.ss.android.ugc.aweme.tars.TarsSharedInterface;
import com.ss.android.ugc.aweme.tars.business.TarsSceneConfig;
import com.ss.android.ugc.aweme.translation.delegates.ITranslationFeedbackDelegate;
import com.ss.android.ugc.aweme.translation.model.AutoDubbingStatusResponse;
import com.ss.android.ugc.aweme.translation.model.FeedbackReportInfoResponse;
import com.ss.android.ugc.aweme.translation.model.MultiTranslationResult;
import com.ss.android.ugc.aweme.translation.model.TranslationResult;
import com.ss.android.ugc.aweme.translation.ui.AutoDubbingConsumptionLabelAssemV1;
import com.ss.android.ugc.aweme.translation.ui.TranslationControlsAssem;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: loaded from: classes32.dex */
public final class TranslationServiceImpl implements ITranslationService {
    public final BPEAHandler LIZ;
    public final Map<String, EnumC715680S5m> LIZIZ;
    public final Map<EnumC207101162h, Set<String>> LIZJ;
    public final Map<EnumC207101162h, C1760006us> LIZLLL;
    public final C1193404lg LJ;
    public final Set<String> LJFF;
    public final C603820NmG<String, Integer> LJI;
    public final C603820NmG<String, Integer> LJII;
    public final ConcurrentHashMap<String, C710770RuN> LJIIIIZZ;
    public final C2252321DDq LJIIIZ;
    public boolean LJIIJ;
    public final Map<EnumC207101162h, Pair<C161Q<?>, Function1<Object, Unit>>> LJIIJJI;
    public final C01GW LJIIL;
    public final C01GW LJIILIIL;
    public final C01GW LJIILJJIL;

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJJIFFI(boolean z, boolean z2) {
        return !z && z2;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final void LJJLIIJ() {
        this.LJIIJ = false;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> LJLIL() {
        return C13LE.LIZ(TranslationControlsAssem.class);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final C13IQ<? extends ReusedUISlotAssem<? extends C03H5>> LLIIIJ() {
        return C13LE.LIZ(AutoDubbingConsumptionLabelAssemV1.class);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJJ() {
        this.LJ.getClass();
        C161I.LIZ.getClass();
        List<Integer> list = ((ToastFrequencyConfig) C161I.LIZJ.getValue()).seeOriginalFrequencies;
        long jLJJIZ = C746760TRa.LIZ().LJJIZ();
        int iLJJIJL = C746760TRa.LIZ().LJJIJL();
        if (list.size() != 5 || iLJJIJL > 4) {
            return false;
        }
        return System.currentTimeMillis() - jLJJIZ > TimeUnit.DAYS.toMillis((long) ((Number) ListProtector.get(list, iLJJIJL)).intValue());
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final void LJJJI() {
        ((LinkedHashMap) this.LJ.LIZIZ).clear();
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final InterfaceC346201Wa<String> LJJJJJ() {
        return new C1629806Zs(new C05RH(C20700315zN.LIZJ));
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final String LJJJJLL() {
        return ((ISettingService) this.LJIILIIL.getValue()).getAppLanguage();
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final void LJJLIIIJILLIZJL() {
        C1390840mIU.LIZ.storeBoolean("key_has_show_comment_translation_intro", true);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final ICLATranslatabilityService LJJLIIIJLLLLLLLZ() {
        return new CLATranslatabilityServiceImpl();
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final void LJJZ() {
        ((LinkedHashMap) this.LIZIZ).clear();
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final int LJLIIL() {
        return this.LJ.LIZ.size();
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJLJLJ() {
        this.LJ.getClass();
        C161I.LIZ.getClass();
        List<Integer> list = ((ToastFrequencyConfig) C161I.LIZJ.getValue()).seeTranslationFrequencies;
        int iLJIIIZ = C746760TRa.LIZ().LJIIIZ();
        long jLJ = C746760TRa.LIZ().LJ();
        if (list.size() != 5 || iLJIIIZ > 4) {
            return false;
        }
        return System.currentTimeMillis() - jLJ > TimeUnit.DAYS.toMillis((long) ((Number) ListProtector.get(list, iLJIIIZ)).intValue());
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final void LJLLL() {
        ((LinkedHashMap) this.LJ.LIZIZ).clear();
    }

    public final ITranslationKevaService LLILII() {
        return (ITranslationKevaService) this.LJIIL.getValue();
    }

    public TranslationServiceImpl() {
        HandlerThread handlerThread = new HandlerThread("CLAThread");
        handlerThread.start();
        this.LIZ = new BPEAHandler(C786410Ut5.W2(handlerThread));
        this.LIZIZ = new LinkedHashMap();
        this.LIZJ = new LinkedHashMap();
        this.LIZLLL = new LinkedHashMap();
        this.LJ = new C1193404lg();
        this.LJFF = Collections.newSetFromMap(new ConcurrentHashMap());
        this.LJI = new C603820NmG<>(10);
        this.LJII = new C603820NmG<>(10);
        this.LJIIIIZZ = new ConcurrentHashMap<>();
        this.LJIIIZ = C1BNE.LIZ(new C710770RuN(EnumC715680S5m.NOT_OVERWRITTEN, null));
        this.LJIIJJI = new LinkedHashMap();
        this.LJIIL = C452501pT.LIZIZ(new C161K());
        this.LJIILIIL = C452501pT.LIZIZ(new C161J());
        this.LJIILJJIL = C452501pT.LIZIZ(new C161L());
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJJLIIIJLJLI() {
        C1839820xye.LIZ().LJIIIIZZ().getClass();
        return C20700315zN.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final Map<String, Object> LJLI() {
        if (!C295340Bhs.LIZ()) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("feed_translation_reverse", Boolean.valueOf(C0BJD.LIZ()));
        linkedHashMap.put("fixed_caption_v2_consumer_group", C293260BeW.LIZ.toString());
        linkedHashMap.put("target_lang", LLIIZ());
        linkedHashMap.put("dnt_langs", C13LQ.LJJJ(LL(), ",", null, null, null, 62));
        linkedHashMap.put("master_translation_toggle_on", Boolean.valueOf(C746760TRa.LIZ().LJLILLLLZI()));
        linkedHashMap.put("comment_translation_toggle_on", Boolean.valueOf(C746760TRa.LIZ().LJJJLZIJ()));
        linkedHashMap.put("dm_translation_toggle_on", Boolean.valueOf(C746760TRa.LIZ().LJJIJIIJI()));
        linkedHashMap.put("sticker_translation_toggle_on", Boolean.valueOf(C746760TRa.LIZ().LJJJJI()));
        linkedHashMap.put("caption_on_for_native_language_videos", Boolean.valueOf(C746760TRa.LIZ().LIZIZ()));
        linkedHashMap.put("caption_on_for_foreign_language_videos", Boolean.valueOf(C746760TRa.LIZ().LJL()));
        linkedHashMap.put("auto_dubbing_consumption_toggle_on", Boolean.valueOf(C746760TRa.LIZ().LJI()));
        linkedHashMap.put("auto_dubbing_toggle_on", Boolean.valueOf(C746760TRa.LIZ().LJJJJJL()));
        linkedHashMap.put("has_user_manually_modified_dnt", Boolean.valueOf(LJJLIIIJLJLI()));
        return linkedHashMap;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final String[] LL() {
        C1839820xye.LIZ().LJIIIIZZ().getClass();
        String[] strArrLIZJ = C20700315zN.LIZJ();
        return strArrLIZJ == null ? new String[0] : strArrLIZJ;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final String LLIIZ() {
        boolean zLJI = MethodIDManager.LJI(202419);
        String strLIZ = C1839820xye.LIZ().LIZ();
        if (TextUtils.isEmpty(strLIZ)) {
            strLIZ = ((ISettingService) this.LJIILIIL.getValue()).getAppLanguage();
        } else if (u.LJIJI("zh-hans", strLIZ, true)) {
            strLIZ = "zh-Hans";
        } else if (u.LJIJI("zh-hant", strLIZ, true)) {
            strLIZ = "zh-Hant";
        } else if (u.LJIJI("fr-ca", strLIZ, true)) {
            strLIZ = "fr";
        } else if (strLIZ == null) {
            strLIZ = "";
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return strLIZ;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final ITranslationFeedbackDelegate LIZLLL() {
        return C161D.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final InterfaceC1344290l5P LJJLIIIJ() {
        return C163I.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final C05YD<C710770RuN> LJJLJ() {
        return this.LJIIIZ;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final Map<EnumC207101162h, Pair<C161Q<?>, Function1<Object, Unit>>> LLFF() {
        return this.LJIIJJI;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final Map<EnumC207101162h, C1760006us> LLIIIILZ() {
        return this.LIZLLL;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final C05YD<String> LLIIIZ() {
        return C20700315zN.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final Handler LLIILII() {
        return this.LIZ;
    }

    public static boolean LLIL(Comment comment) {
        String awemeId;
        ICaptionKevaService iCaptionKevaServiceLIZ = C746760TRa.LIZ();
        if (comment == null || (awemeId = comment.getAwemeId()) == null) {
            awemeId = "";
        }
        boolean zLJJIIJZLJL = iCaptionKevaServiceLIZ.LJJIIJZLJL(awemeId);
        if (!C746760TRa.LIZ().LJJJLZIJ() && !zLJJIIJZLJL) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final C11NZ<AutoDubbingStatusResponse> LIZIZ(String str) {
        C11NZ<AutoDubbingStatusResponse> c11nzLIZIZ;
        try {
            C161O c161oLIZ = C1236630iHl.LIZ();
            if (c161oLIZ == null || (c11nzLIZIZ = c161oLIZ.LIZIZ(str)) == null) {
                return C11IR.LL;
            }
            return c11nzLIZIZ;
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            return C11IR.LL;
        }
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final InterfaceC1339640kxu LJIIIIZZ(LifecycleCoroutineScope lifecycleCoroutineScope) {
        return new AnonymousClass1639(lifecycleCoroutineScope);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final C11NZ<TranslationResult> LJIIL(final String str) {
        C11NZ<TranslationResult> c11nzLJIIIIZZ;
        C161N c161n = C161N.LIZIZ;
        final String strLLIIZ = c161n.LLIIZ();
        final long jUptimeMillis = SystemClock.uptimeMillis();
        AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0idX
            @Override // X.InterfaceC1254030ijp
            public final void LIZ(final C11KY c11ky) {
                String str2;
                TarsSharedInterface tarsSharedInterface = (TarsSharedInterface) PluggableExtentionKt.pluggableSpi$default(TarsSharedInterface.class, false, false, false, 14, null);
                if (tarsSharedInterface != null) {
                    TarsSceneConfig tarsSceneConfig = (TarsSceneConfig) C1249880id8.LIZ.getValue();
                    if (tarsSceneConfig == null || (str2 = tarsSceneConfig.scene) == null) {
                        str2 = "";
                    }
                    C0Z0Y c0z0yLIZJ = tarsSharedInterface.LIZJ(str2, new TarsInstConfig(true));
                    if (c0z0yLIZJ != null) {
                        Map<String, ? extends Object> mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("param_origin_text", str), new Pair("param_target_language", strLLIIZ), new Pair("param_from_language", "current language"));
                        final long j = jUptimeMillis;
                        c0z0yLIZJ.LJIIIIZZ(mapLJIIIIZZ, new InterfaceC892690Z0h(j, c11ky) { // from class: X.11Ka
                            public final /* synthetic */ C0XWW<String> LIZ;

                            {
                                this.LIZ = c11ky;
                            }

                            @Override // X.InterfaceC892690Z0h
                            public final void LIZ(C882890YkJ c882890YkJ) {
                                Map<String, Object> map = c882890YkJ.LIZJ;
                                SystemClock.uptimeMillis();
                                if (c882890YkJ.LJ) {
                                    Object obj = ((LinkedHashMap) map).get("trans_result");
                                    if ((obj instanceof String) && obj != null) {
                                        ((C11KY) this.LIZ).onSuccess(obj);
                                    } else {
                                        ((C11KY) this.LIZ).onComplete();
                                    }
                                }
                                ((C11KY) this.LIZ).onComplete();
                            }
                        });
                    }
                }
            }
        }).LJIJJ(C11S5.LIZ()).LJIILL();
        String strLLIIZ2 = c161n.LLIIZ();
        try {
            C161O c161oLIZ = C1236630iHl.LIZ();
            if (c161oLIZ == null || (c11nzLJIIIIZZ = c161oLIZ.LJIIIIZZ(str, null, strLLIIZ2, null, 3)) == null) {
                c11nzLJIIIIZZ = C11IR.LL;
            }
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            AbstractC2126608Uu.getCompatibleException(e);
            c11nzLJIIIIZZ = C11IR.LL;
        }
        return c11nzLJIIIIZZ.LJJIJIIJIL(new AfS32S1000000_2(str, 0)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ());
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0081  */
    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIILIIL(com.ss.android.ugc.aweme.comment.model.Comment r5) {
        /*
            r4 = this;
            boolean r0 = X.C1339540kxk.LIZ(r5)
            java.lang.String r1 = "zh"
            r3 = 0
            if (r0 == 0) goto L6a
            if (r5 == 0) goto L68
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.getAliasAweme()
            if (r0 == 0) goto L68
            java.lang.String r0 = r0.getDescLanguage()
        L15:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r1)
            if (r0 != 0) goto L81
            if (r5 == 0) goto L7f
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.getAliasAweme()
            if (r0 == 0) goto L7f
            java.lang.String r1 = r0.getDescLanguage()
        L27:
            java.lang.String r0 = r4.LLIIZ()
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            r2 = 0
            if (r0 != 0) goto L67
            if (r5 == 0) goto L67
            java.lang.Boolean r1 = r5.isCommentTranslatable()
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L67
            java.lang.String r0 = r5.getCid()
            if (r0 == 0) goto L67
            java.lang.String r0 = r5.getText()
            boolean r0 = X.C123100dR.LIZ(r0)
            if (r0 != 0) goto L66
            boolean r0 = X.C1339540kxk.LIZ(r5)
            if (r0 == 0) goto L67
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.getAliasAweme()
            if (r0 == 0) goto L60
            java.lang.String r3 = r0.getDesc()
        L60:
            boolean r0 = X.C123100dR.LIZ(r3)
            if (r0 == 0) goto L67
        L66:
            r2 = 1
        L67:
            return r2
        L68:
            r0 = r3
            goto L15
        L6a:
            if (r5 == 0) goto L7d
            java.lang.String r0 = r5.getCommentLanguage()
        L70:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r1)
            if (r0 != 0) goto L81
            if (r5 == 0) goto L7f
            java.lang.String r1 = r5.getCommentLanguage()
            goto L27
        L7d:
            r0 = r3
            goto L70
        L7f:
            r1 = r3
            goto L27
        L81:
            java.lang.String r1 = "zh-Hans"
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.translation.service.TranslationServiceImpl.LJIILIIL(com.ss.android.ugc.aweme.comment.model.Comment):boolean");
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final String LJIIZILJ(Aweme aweme) {
        String photoTitleLanguageCode;
        if (aweme == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (!aweme.isPhotoTitleTranslatable() || (photoTitleLanguageCode = aweme.getPhotoTitleLanguageCode()) == null || photoTitleLanguageCode.length() == 0 || Intrinsics.LJFF(aweme.getPhotoTitleLanguageCode(), "un")) {
            arrayList.add(Integer.valueOf(C0CAL.NO_TRANSLATABLE_ELEMENT.getValue()));
        }
        if (Intrinsics.LJFF(LLIIZ(), aweme.getPhotoTitleLanguageCode())) {
            arrayList.add(Integer.valueOf(C0CAL.SAME_LANGUAGE.getValue()));
        }
        if ((!C281410B1f.LIZ()) || LJLZ(aweme)) {
            arrayList.add(Integer.valueOf(C0CAL.OTHER.getValue()));
        }
        return C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final int LJIJ(Aweme aweme) {
        Object next;
        String textStruct;
        List<InteractStickerStruct> interactStickerStructs = aweme.getInteractStickerStructs();
        String strLIZIZ = C161F.LIZIZ(aweme);
        ArrayList arrayList = new ArrayList();
        Iterator<InteractStickerStruct> it2 = interactStickerStructs.iterator();
        while (true) {
            next = null;
            if (!it2.hasNext()) {
                break;
            }
            InteractStickerStruct next2 = it2.next();
            if (next2.getType() == 18) {
                TextStickerInfo textInfo = next2.getTextInfo();
                if (textInfo != null) {
                    next = textInfo.srcLanguage;
                }
                if (Intrinsics.LJFF(next, strLIZIZ) && C123100dR.LIZ(next2.getTextStruct()) && (textStruct = next2.getTextStruct()) != null) {
                    arrayList.add(textStruct);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList2.add(Integer.valueOf(((String) it3.next()).length()));
        }
        Iterator it4 = arrayList2.iterator();
        if (it4.hasNext()) {
            next = it4.next();
            while (it4.hasNext()) {
                next = Integer.valueOf(((Number) next).intValue() + ((Number) it4.next()).intValue());
            }
        }
        Integer num = (Integer) next;
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJIJI(Aweme aweme) {
        String authorUid;
        if (!C0BJD.LIZ()) {
            String curUserId = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUserId();
            if (aweme == null || (authorUid = AwemeExtKt.getAuthorUid(aweme)) == null) {
                authorUid = "";
            }
            if (!curUserId.equals(authorUid)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJIJJ(Aweme aweme) {
        String authorUid;
        if (this.LJIIJ) {
            String curUserId = C0XQ7.LJFF().getCurUserId();
            if (aweme == null || (authorUid = AwemeExtKt.getAuthorUid(aweme)) == null) {
                authorUid = "";
            }
            if (curUserId.equals(authorUid)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final String LJJI(Aweme aweme) {
        if (aweme == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (C20702515zj.LIZ(aweme, null)) {
            arrayList.add(Integer.valueOf(EnumC1153790g89.USER_FILTER_LANGUAGE.getValue()));
        }
        C20703515zt.LIZ.getClass();
        if (!C20703515zt.LJIL(aweme)) {
            arrayList.add(Integer.valueOf(EnumC1153790g89.ELEMENT_CLOSED.getValue()));
        }
        return C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJII(com.ss.android.ugc.aweme.comment.model.Comment r5) {
        /*
            r4 = this;
            r3 = 0
            if (r5 != 0) goto L4
            return r3
        L4:
            boolean r0 = X.C1339540kxk.LIZ(r5)
            java.lang.String r1 = "zh"
            if (r0 == 0) goto L46
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.getAliasAweme()
            r2 = 0
            if (r0 == 0) goto L44
            java.lang.String r0 = r0.getDescLanguage()
        L17:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r1)
            if (r0 != 0) goto L55
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r5.getAliasAweme()
            if (r0 == 0) goto L27
            java.lang.String r2 = r0.getDescLanguage()
        L27:
            X.01GW r0 = r4.LJIILJJIL
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.translation.service.ITranslationService r0 = (com.ss.android.ugc.aweme.translation.service.ITranslationService) r0
            java.lang.String[] r1 = r0.LL()
            int r0 = r1.length
            if (r0 == 0) goto L43
            boolean r0 = X.C123100dR.LIZ(r2)
            if (r0 == 0) goto L43
            int r0 = X.C13LQ.LJJIJIIJI(r2, r1)
            if (r0 < 0) goto L43
            r3 = 1
        L43:
            return r3
        L44:
            r0 = r2
            goto L17
        L46:
            java.lang.String r0 = r5.getCommentLanguage()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r1)
            if (r0 != 0) goto L55
            java.lang.String r2 = r5.getCommentLanguage()
            goto L27
        L55:
            java.lang.String r2 = "zh-Hans"
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.translation.service.TranslationServiceImpl.LJJII(com.ss.android.ugc.aweme.comment.model.Comment):boolean");
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final void LJJIIJ(String str) {
        this.LJ.LIZ.add(str);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final Map<String, Object> LJJIIJZLJL(List<C19595011lU> list) {
        int translateTextSize;
        boolean z = false;
        int i = 0;
        int iMin = 24;
        for (C19595011lU c19595011lU : list) {
            if (c19595011lU.LIZIZ.getType() == 18) {
                InterfaceC19594611lQ interfaceC19594611lQ = c19595011lU.LIZJ;
                if (interfaceC19594611lQ instanceof C19581011jE) {
                    C19581111jF c19581111jF = ((C19581011jE) interfaceC19594611lQ).LJIIJ;
                    if (c19581111jF != null) {
                        translateTextSize = c19581111jF.getTranslateTextSize();
                    } else {
                        translateTextSize = 24;
                    }
                    iMin = Math.min(iMin, translateTextSize);
                    C19581111jF c19581111jF2 = ((C19581011jE) c19595011lU.LIZJ).LJIIJ;
                    if (c19581111jF2 != null && c19581111jF2.LLILZLL) {
                        i++;
                    }
                    z = true;
                }
            }
        }
        if (z) {
            return C2097608Jq.LJIIIIZZ(new Pair("background_reduced_cnt", Integer.valueOf(i)), new Pair("text_sticker_min_word_size", Integer.valueOf(iMin)));
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final String LJJIJIIJI(Aweme aweme) {
        if (aweme == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (((ArrayList) C161F.LIZ(aweme, aweme.getInteractStickerStructs())).isEmpty() || !aweme.isTextStickerTranslatable()) {
            arrayList.add(Integer.valueOf(C0CAL.NO_TRANSLATABLE_ELEMENT.getValue()));
        }
        if (Intrinsics.LJFF(LLIIZ(), C161F.LIZIZ(aweme))) {
            arrayList.add(Integer.valueOf(C0CAL.SAME_LANGUAGE.getValue()));
        }
        if (C0BI0.LIZ != 2 || LJLZ(aweme)) {
            arrayList.add(Integer.valueOf(C0CAL.OTHER.getValue()));
        }
        return C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJJIJIL(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        C01GW<AbstractC1604130rqV> c01gw = C207128163i.LJ;
        String aid = aweme.getAid();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("shouldAutoTranslate, awemeId: ");
        sbLIZ.append(aweme.getAid());
        sbLIZ.append(", isAutoTranslationEnable ");
        sbLIZ.append(LLILII().LIZ());
        sbLIZ.append(", getTranslationStatusOverrideValue ");
        sbLIZ.append(LJJZZI(aweme.getAid()));
        sbLIZ.append(", enabledElements ");
        ArrayList arrayList = new ArrayList();
        if (C0SCU.LIZ().LLFII(aweme, null)) {
            arrayList.add("desc");
        }
        if (C0SCU.LIZ().LJIILL(aweme, null, null)) {
            arrayList.add("caption");
        }
        if (C0SCU.LIZ().LJJJJL(aweme, null)) {
            arrayList.add("text_sticker");
        }
        if (C0SCU.LIZ().LLF(aweme, null)) {
            arrayList.add("photo_title");
        }
        if (C0SCU.LIZ().LJ(aweme, null)) {
            arrayList.add("photo_text");
        }
        if (C0SCU.LIZ().LJJIJ(aweme, null, null)) {
            arrayList.add("external_element");
        }
        sbLIZ.append(arrayList);
        C0SZC.LIZJ(aid, "auto_translate", C2188811AlT.LIZIZ(sbLIZ));
        if (!LLILII().LIZ() && LJJZZI(aweme.getAid()) != EnumC715680S5m.OVERRIDE_TO_TRANSLATED) {
            return false;
        }
        Boolean bool = Boolean.TRUE;
        if (!C0SCU.LIZ().LLFII(aweme, bool) && !C0SCU.LIZ().LJIILL(aweme, bool, null) && !C0SCU.LIZ().LJJJJL(aweme, bool) && !C0SCU.LIZ().LLF(aweme, bool) && !C0SCU.LIZ().LJ(aweme, bool) && !C0SCU.LIZ().LJJIJ(aweme, bool, null)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    @InterfaceC1294060jmO
    public final boolean LJJJ(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        return C0SQQ.LIZ.LJ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final int LJJJJI(Aweme aweme) {
        CaptionItemModel captionItemModelLJIIIIZZ;
        if (aweme == null || (captionItemModelLJIIIIZZ = C20703515zt.LJIIIIZZ(aweme)) == null) {
            return 0;
        }
        return (int) captionItemModelLJIIIIZZ.captionLength;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final String LJJJJJL(Aweme aweme) {
        if (aweme == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (C13LQ.LJIILLIIL(C0SKF.LIZJ(aweme), C0SCU.LIZ().LL())) {
            arrayList.add(Integer.valueOf(EnumC1153790g89.USER_FILTER_LANGUAGE.getValue()));
        }
        return C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJJJJLI(C207134163o c207134163o) {
        boolean zLIZ;
        if (c207134163o == null) {
            return false;
        }
        if (c207134163o.LIZ == EnumC207101162h.DIRECT_MESSAGE) {
            zLIZ = LLILII().LJFF();
        } else {
            zLIZ = LLILII().LIZ();
        }
        if (!zLIZ && !LJJLI(c207134163o)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJJJJZ(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        return C0SQQ.LIZ.LIZLLL(aweme);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final int LJJJLIIL(Aweme aweme) {
        if (aweme == null) {
            return 0;
        }
        String desc = aweme.getDesc();
        if (desc == null) {
            desc = "";
        }
        return C461740I8u.LIZ(desc, aweme.getTextExtra()).length();
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final Map<String, String> LJJJZ(TextExtraStruct textExtraStruct) {
        int type = textExtraStruct.getType();
        if (type != 0) {
            if (type != 1) {
                if (type == 5) {
                    return C2097608Jq.LJIIJ(new Pair("richTextType", "mention_video"), new Pair("richTextTranslatable", "false"));
                }
                return null;
            }
            return C2097608Jq.LJIIJ(new Pair("richTextType", "hashtag"), new Pair("richTextTranslatable", "false"));
        }
        int subtype = textExtraStruct.getSubtype();
        if (subtype == 1) {
            return C2097608Jq.LJIIJ(new Pair("richTextType", "duet"), new Pair("richTextTranslatable", "true"));
        }
        if (subtype == 2) {
            return C2097608Jq.LJIIJ(new Pair("richTextType", "reply_comment"), new Pair("richTextTranslatable", "true"));
        }
        if (subtype == 16) {
            return C2097608Jq.LJIIJ(new Pair("richTextType", "post_comment"), new Pair("richTextTranslatable", "true"));
        }
        if (subtype == 0) {
            String awemeId = textExtraStruct.getAwemeId();
            if (awemeId != null && awemeId.length() > 0) {
                return C2097608Jq.LJIIJ(new Pair("richTextType", "stitch"), new Pair("richTextTranslatable", "true"));
            }
            return C2097608Jq.LJIIJ(new Pair("richTextType", "mention_username"), new Pair("richTextTranslatable", "false"));
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJJL(Aweme aweme) {
        ClientText originalClientText;
        List<TextExtraStruct> list;
        if (aweme == null || (originalClientText = aweme.getOriginalClientText()) == null || (list = originalClientText.textExtra) == null) {
            return false;
        }
        return !list.isEmpty();
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJJLI(C207134163o c207134163o) {
        String str;
        if (c207134163o != null) {
            str = c207134163o.LIZJ;
        } else {
            str = null;
        }
        if (str == null) {
            return false;
        }
        Set set = (Set) ((LinkedHashMap) this.LIZJ).get(c207134163o.LIZ);
        if (set == null || !C13LP.LJJJJ(c207134163o.LIZJ, set)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJJLIIIIJ(Aweme aweme) {
        if (aweme == null || !LLILII().LIZ() || !LJJJJZ(aweme)) {
            return false;
        }
        if (C13LQ.LJJIJIIJI(C20701315zX.LIZ(aweme), LL()) >= 0) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJJLIIIJJIZ(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        return !C0SQQ.LIZ.LJIILL(aweme).isEmpty();
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJJLIL(Comment comment) {
        String asrText;
        boolean z;
        CmtAudioStruct audioStruct;
        String asrLang = null;
        if (comment != null && (audioStruct = comment.getAudioStruct()) != null) {
            asrText = audioStruct.getAsrText();
        } else {
            asrText = null;
            if (comment != null) {
            }
            if (asrText != null || asrText.length() == 0) {
                return false;
            }
            if (Intrinsics.LJFF(asrLang, "zh")) {
                asrLang = "zh-Hans";
            }
            C1839820xye.LIZ().LJIIIIZZ().getClass();
            String[] strArrLIZJ = C20700315zN.LIZJ();
            if (strArrLIZJ != null && C13LQ.LJJIJIIJI(asrLang, strArrLIZJ) >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!TextUtils.equals(LLIIZ(), asrLang) && !z) {
                return true;
            }
            return false;
        }
        CmtAudioStruct audioStruct2 = comment.getAudioStruct();
        if (audioStruct2 != null) {
            asrLang = audioStruct2.getAsrLang();
        }
        if (asrText != null) {
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJJLJLI(C207134163o c207134163o) {
        if (!C1E8U.LIZ() || c207134163o == null) {
            return false;
        }
        if (((LinkedHashMap) this.LIZLLL).get(c207134163o.LIZ) == null) {
            return false;
        }
        String str = c207134163o.LJ;
        if (str == null) {
            str = c207134163o.LJII;
        }
        if (Intrinsics.LJFF(str, "zh")) {
            str = "zh-Hans";
        }
        boolean zLJFF = Intrinsics.LJFF(str, LLIIZ());
        if (c207134163o.LIZJ == null || !C123100dR.LIZ(c207134163o.LIZLLL) || Intrinsics.LJFF(str, "un") || zLJFF || LJIJI(null)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final EnumC715680S5m LJJZZI(String str) {
        EnumC715680S5m enumC715680S5m;
        if (str != null && str.length() != 0) {
            C710770RuN c710770RuN = this.LJIIIIZZ.get(str);
            if (c710770RuN == null || (enumC715680S5m = c710770RuN.LIZ) == null) {
                return EnumC715680S5m.NOT_OVERWRITTEN;
            }
            return enumC715680S5m;
        }
        return EnumC715680S5m.NOT_OVERWRITTEN;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJLIIIL(Comment comment) {
        String commentLanguage;
        if (!LJIILIIL(comment)) {
            return false;
        }
        if (!LLIL(comment) && (!C0BJB.LIZ() || C2547709yd.LIZ)) {
            return false;
        }
        if (Intrinsics.LJFF(comment.getCommentLanguage(), "zh")) {
            commentLanguage = "zh-Hans";
        } else {
            commentLanguage = comment.getCommentLanguage();
        }
        C1839820xye.LIZ().LJIIIIZZ().getClass();
        String[] strArrLIZJ = C20700315zN.LIZJ();
        if (strArrLIZJ == null || C13LQ.LJJIJIIJI(commentLanguage, strArrLIZJ) < 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x014b  */
    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJLILLLLZI(com.ss.android.ugc.aweme.feed.model.Aweme r18) {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.translation.service.TranslationServiceImpl.LJLILLLLZI(com.ss.android.ugc.aweme.feed.model.Aweme):java.lang.String");
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final String LJLJI(Aweme aweme) {
        String descLanguage;
        if (aweme == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (!aweme.isDescTranslatable() || (descLanguage = aweme.getDescLanguage()) == null || descLanguage.length() == 0 || Intrinsics.LJFF(aweme.getDescLanguage(), "un")) {
            arrayList.add(Integer.valueOf(C0CAL.NO_TRANSLATABLE_ELEMENT.getValue()));
        }
        if (Intrinsics.LJFF(LLIIZ(), aweme.getDescLanguage())) {
            arrayList.add(Integer.valueOf(C0CAL.SAME_LANGUAGE.getValue()));
        }
        if (!(!LJLZ(aweme))) {
            arrayList.add(Integer.valueOf(C0CAL.OTHER.getValue()));
        }
        return C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final <T extends ReusedAssem<T> & C03H5 & InterfaceC712990Rxx<X>, X> InterfaceC1731706qJ<Object, AssemViewModel<C0S5G>> LJLJL(T t) {
        return new C704420Rk8(t);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJLJLLL(Aweme aweme) {
        if (aweme == null || !LLILII().LIZ() || !LJJJ(aweme) || C13LQ.LJIILLIIL(C0SKF.LIZJ(aweme), C0SCU.LIZ().LL())) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final void LJLL(EnumC207101162h enumC207101162h) {
        if (C1E8U.LIZ() && this.LIZLLL.containsKey(enumC207101162h)) {
            this.LIZLLL.remove(enumC207101162h);
            this.LIZJ.remove(enumC207101162h);
        }
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final void LJLLI(String str) {
        if (str != null) {
            try {
                C163E.LJIJ.remove(str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJLZ(Aweme aweme) {
        String aid = aweme.getAid();
        if (aid != null && aid.length() != 0 && !C0BJD.LIZ() && !C729510SjV.LJJ(aweme) && !AwemeBizExtKt.isSubAweme(aweme) && !C1383320m6M.LIZ(aweme)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final EnumC715680S5m LJZ(String str) {
        if (str == null) {
            return null;
        }
        return (EnumC715680S5m) ((LinkedHashMap) this.LIZIZ).get(str);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJZI(Aweme aweme) {
        if (aweme == null || !LLILII().LIZ() || !C746760TRa.LIZ().LJJJJI() || !LLIIII(aweme, true) || C161F.LJ(aweme)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJZL(String str) {
        C1839820xye.LIZ().LJIIIIZZ().getClass();
        String[] strArrLIZJ = C20700315zN.LIZJ();
        if (strArrLIZJ == null || C13LQ.LJJIJIIJI(str, strArrLIZJ) < 0) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final int LLFZ(Aweme aweme) {
        Object next;
        String textStruct;
        if (aweme == null || !C161F.LIZLLL(aweme.getInteractStickerStructs())) {
            return 0;
        }
        List<InteractStickerStruct> interactStickerStructs = aweme.getInteractStickerStructs();
        ArrayList arrayList = new ArrayList();
        Iterator<InteractStickerStruct> it2 = interactStickerStructs.iterator();
        while (true) {
            next = null;
            if (!it2.hasNext()) {
                break;
            }
            InteractStickerStruct next2 = it2.next();
            if (next2.getType() == 18 && C123100dR.LIZ(next2.getTextStruct()) && (textStruct = next2.getTextStruct()) != null) {
                arrayList.add(textStruct);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList2.add(Integer.valueOf(((String) it3.next()).length()));
        }
        Iterator it4 = arrayList2.iterator();
        if (it4.hasNext()) {
            next = it4.next();
            while (it4.hasNext()) {
                next = Integer.valueOf(((Number) next).intValue() + ((Number) it4.next()).intValue());
            }
        }
        Integer num = (Integer) next;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final int LLI(String str) {
        Set set = (Set) ((LinkedHashMap) this.LJ.LIZIZ).get(str);
        if (set != null) {
            return set.size();
        }
        return 0;
    }

    /* JADX WARN: Incorrect types in method signature: <T:Lcom/bytedance/assem/arch/reused/ReusedAssem<+LX/03H5;>;:LX/0Rxx<TITEM;>;ITEM:Ljava/lang/Object;>(TT;)LX/06qJ<Ljava/lang/Object;LX/0SBA;>; */
    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final InterfaceC1731706qJ LLIFFJFJJ(final ReusedAssem reusedAssem) {
        return new InterfaceC1731706qJ<Object, C0SBA>(reusedAssem) { // from class: X.0S5i
            public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLJJLI;
            public final C704420Rk8 LL;

            static {
                C2217381BqS c2217381BqS = new C2217381BqS(C715640S5i.class, "translationController", "getTranslationController()Lcom/ss/android/ugc/aweme/translation/viewmodel/ITranslationStatusControls;", 0);
                C13LE.LIZ.getClass();
                LLILLJJLI = new InterfaceC2217461Bqa[]{c2217381BqS};
            }

            /* JADX WARN: Incorrect types in method signature: (TT;)V */
            {
                this.LL = new C704420Rk8(reusedAssem);
            }

            @Override // X.InterfaceC1731706qJ
            public final C0SBA getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
                return ((InterfaceC715620S5g) this.LL.getValue(this, LLILLJJLI[0])).Dk();
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final Map<String, String> LLII(Aweme aweme) {
        ClientText originalClientText;
        List list;
        if (aweme == null || (originalClientText = aweme.getOriginalClientText()) == null || originalClientText.textExtra == null) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ClientText originalClientText2 = aweme.getOriginalClientText();
        if (originalClientText2 == null || (list = originalClientText2.textExtra) == null) {
            list = C13BV.INSTANCE;
        }
        Iterator it2 = list.iterator();
        boolean z = false;
        while (it2.hasNext()) {
            Map<String, String> mapLJJJZ = LJJJZ((TextExtraStruct) it2.next());
            if (mapLJJJZ != null) {
                LinkedHashMap linkedHashMap = (LinkedHashMap) mapLJJJZ;
                Object obj = linkedHashMap.get("richTextType");
                if (obj != null) {
                    linkedHashSet.add(obj);
                }
                if (Intrinsics.LJFF(linkedHashMap.get("richTextTranslatable"), "true")) {
                    z = true;
                }
            }
        }
        return C2097608Jq.LJIIJ(new Pair("richTextTypes", C13LP.LJJLIIIJ(linkedHashSet, ",", null, null, 0, null, null, 62)), new Pair("richTextTranslatable", String.valueOf(z)));
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final String LLIIL(Aweme aweme) {
        if (aweme == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (C161F.LJ(aweme)) {
            arrayList.add(Integer.valueOf(EnumC1153790g89.USER_FILTER_LANGUAGE.getValue()));
        }
        if (!C746760TRa.LIZ().LJJJJI()) {
            arrayList.add(Integer.valueOf(EnumC1153790g89.ELEMENT_TRANSLATION_CLOSED.getValue()));
        }
        return C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final void LLIILZL(EnumC207101162h enumC207101162h) {
        Set set = (Set) ((LinkedHashMap) this.LIZJ).get(enumC207101162h);
        if (set != null) {
            set.clear();
        }
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final C11NZ<FeedbackReportInfoResponse> LIZ(String str, String str2) {
        C11NZ<FeedbackReportInfoResponse> c11nzLIZ;
        try {
            C161O c161oLIZ = C1236630iHl.LIZ();
            if (c161oLIZ == null || (c11nzLIZ = c161oLIZ.LIZ(str, str2)) == null) {
                return C11IR.LL;
            }
            return c11nzLIZ;
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            return C11IR.LL;
        }
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJ(Aweme aweme, Boolean bool) {
        if (aweme == null) {
            return false;
        }
        return !C0SQQ.LIZ.LJIIIIZZ(aweme, bool).isEmpty();
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final C0SBA LJI(Fragment fragment, VideoItemParams videoItemParams) {
        if (!(videoItemParams instanceof VideoItemParams) || videoItemParams == null) {
            return null;
        }
        C207118162y c207118162y = new C207118162y(LifecycleOwnerKt.getLifecycleScope(fragment));
        c207118162y.LJJIIJ(videoItemParams, null, null);
        C1485670olR.LIZ().LJIJJ(videoItemParams.getAweme(), null, false, new WeakReference<>(fragment.getContext()), videoItemParams.mEventType);
        c207118162y.LJJII(videoItemParams.mEventType);
        return c207118162y;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final CaptionItemModel LJII(Aweme aweme, String str) {
        AnonymousClass1624.LJ.getClass();
        C1869640ykk c1869640ykk = (C1869640ykk) ((AbstractC1361510lXB) AnonymousClass1624.LJFF.getValue()).LIZLLL(aweme, str);
        if (c1869640ykk == null || !c1869640ykk.LIZLLL || c1869640ykk.LIZIZ == null) {
            return null;
        }
        int i = c1869640ykk.LIZ;
        ArrayList arrayList = new ArrayList();
        arrayList.add(c1869640ykk.LIZIZ);
        return new CaptionItemModel(null, c1869640ykk.LIZJ, 1L, c1869640ykk.LIZIZ, -1L, "webvtt", 0L, false, Boolean.TRUE, i, null, 0L, null, null, 0L, arrayList, null, null, null, 0L, 1014977, null);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final void LJIIIZ(EnumC715680S5m enumC715680S5m, String str) {
        if (str == null) {
            return;
        }
        this.LIZIZ.put(str, enumC715680S5m);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJIIJ(Aweme aweme, String str) {
        if (aweme == null) {
            return false;
        }
        AnonymousClass1624.LJ.getClass();
        if (((AbstractC1361510lXB) AnonymousClass1624.LJFF.getValue()).LIZLLL(aweme, str) == null) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final C11NZ LJIIJJI(String str, List list) {
        C11NZ<MultiTranslationResult> c11nzLIZJ;
        C1227904rF.LIZ.getClass();
        String strLJI = C1227904rF.LJI(list);
        try {
            C161O c161oLIZ = C1236630iHl.LIZ();
            if (c161oLIZ == null || (c11nzLIZJ = c161oLIZ.LIZJ(str, strLJI, 6)) == null) {
                return C11IR.LL;
            }
            return c11nzLIZJ;
        } catch (ExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
            AbstractC2126608Uu.getCompatibleException(e);
            return C11IR.LL;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0047  */
    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIILLIIL(com.ss.android.ugc.aweme.comment.model.Comment r7, X.EnumC715680S5m r8) {
        /*
            r6 = this;
            boolean r5 = r6.LJIILIIL(r7)
            int[] r1 = X.C0SBC.LIZ
            int r0 = r8.ordinal()
            r1 = r1[r0]
            r4 = 0
            r0 = 1
            if (r1 == r0) goto L47
            r0 = 2
            if (r1 == r0) goto L59
            r0 = 3
            if (r1 != r0) goto L5b
            boolean r3 = LLIL(r7)
            r2 = 0
            if (r7 == 0) goto L57
            java.lang.String r1 = r7.getCommentLanguage()
        L21:
            java.lang.String r0 = "zh"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L50
            java.lang.String r2 = "zh-Hans"
        L2b:
            com.ss.android.ugc.aweme.translation.service.ITranslationLangKevaService r0 = X.C1839820xye.LIZ()
            X.15zM r0 = r0.LJIIIIZZ()
            r0.getClass()
            java.lang.String[] r0 = X.C20700315zN.LIZJ()
            if (r0 == 0) goto L4e
            int r0 = X.C13LQ.LJJIJIIJI(r2, r0)
            if (r0 < 0) goto L4e
            r0 = 1
        L43:
            if (r3 == 0) goto L59
            if (r0 != 0) goto L59
        L47:
            r0 = 1
        L48:
            if (r5 == 0) goto L4d
            if (r0 == 0) goto L4d
            r4 = 1
        L4d:
            return r4
        L4e:
            r0 = 0
            goto L43
        L50:
            if (r7 == 0) goto L2b
            java.lang.String r2 = r7.getCommentLanguage()
            goto L2b
        L57:
            r1 = r2
            goto L21
        L59:
            r0 = 0
            goto L48
        L5b:
            X.07lC r0 = new X.07lC
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.translation.service.TranslationServiceImpl.LJIILLIIL(com.ss.android.ugc.aweme.comment.model.Comment, X.0S5m):boolean");
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final void LJIJJLI(Aweme aweme, boolean z) {
        if (aweme != null && ((ITranslationService) this.LJIILJJIL.getValue()).LJJIIZI(aweme, z)) {
            C746760TRa.LIZ().LJJLIIJ(aweme.getAid());
        }
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJJIII(Aweme aweme, C0S5N c0s5n) {
        if (!C281430B1h.LIZ() || aweme == null || c0s5n == null) {
            return false;
        }
        return Intrinsics.LJFF(aweme.getAid(), c0s5n.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJJIIZ(Aweme aweme, String str) {
        boolean zLJFF;
        boolean z;
        String str2;
        Map<String, String> map;
        Set<Map.Entry<String, String>> setEntrySet;
        CaptionModel captionModel;
        CaptionLanguage captionLanguage;
        if (aweme == null || C0BJD.LIZ()) {
            return false;
        }
        Video video = aweme.getVideo();
        if (video != null && (captionModel = video.getCaptionModel()) != null && (captionLanguage = captionModel.originalCaptionLanguage) != null) {
            zLJFF = Intrinsics.LJFF(captionLanguage.canTranslateRealtimeSkipTranslationLangCheck, Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        try {
            map = C07K4.LIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (map != null && (setEntrySet = map.entrySet()) != null && (!(setEntrySet instanceof Collection) || !setEntrySet.isEmpty())) {
            Iterator<T> it2 = setEntrySet.iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if ((entry.getKey() != null && u.LJIJI((String) entry.getKey(), str, true)) || (entry.getValue() != null && u.LJIJI((String) entry.getValue(), str, true))) {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        if (!zLJFF || !C1383320m6M.LIZIZ() || C20703515zt.LJIIIIZZ(aweme) == null) {
            return false;
        }
        CaptionItemModel captionItemModelLJIIIIZZ = C20703515zt.LJIIIIZZ(aweme);
        if (captionItemModelLJIIIIZZ != null) {
            str2 = captionItemModelLJIIIIZZ.languageCode;
        } else {
            str2 = null;
        }
        if (Intrinsics.LJFF(str, str2) || !z) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJJIIZI(Aweme aweme, boolean z) {
        boolean z2 = false;
        if (aweme == null) {
            return false;
        }
        if (C20703515zt.LJJIJIL(aweme, Boolean.valueOf(z)) && !C746760TRa.LIZ().LJIIL(aweme.getAid())) {
            z2 = true;
        }
        this.LJIIJ = z2;
        return z2;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final String LJJIJL(Aweme aweme, Map<EnumC207101162h, ? extends Pair<? extends C161Q<?>, ? extends Function1<Object, Unit>>> map) {
        if (aweme == null || !C305430By9.LIZ) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String strLLIIZ = LLIIZ();
        Collection<? extends Pair<? extends C161Q<?>, ? extends Function1<Object, Unit>>> collectionValues = map.values();
        if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
            Iterator<T> it2 = collectionValues.iterator();
            while (it2.hasNext()) {
                Pair pair = (Pair) it2.next();
                String strLIZJ = C161C.LIZJ(aweme, (C161Q) pair.getFirst());
                if (!((C161Q) pair.getFirst()).LJII(aweme) || strLIZJ.length() == 0 || Intrinsics.LJFF(strLIZJ, "un")) {
                    arrayList.add(Integer.valueOf(C0CAL.NO_TRANSLATABLE_ELEMENT.getValue()));
                    break;
                }
            }
        }
        Collection<? extends Pair<? extends C161Q<?>, ? extends Function1<Object, Unit>>> collectionValues2 = map.values();
        if (!(collectionValues2 instanceof Collection) || !collectionValues2.isEmpty()) {
            Iterator<T> it3 = collectionValues2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                if (Intrinsics.LJFF(C161C.LIZJ(aweme, (C161Q) ((Pair) it3.next()).getFirst()), strLLIIZ)) {
                    arrayList.add(Integer.valueOf(C0CAL.SAME_LANGUAGE.getValue()));
                    break;
                }
            }
        }
        if (!(!LJLZ(aweme))) {
            arrayList.add(Integer.valueOf(C0CAL.OTHER.getValue()));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(Integer.valueOf(C0CAL.OTHER.getValue()));
        }
        return C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00af  */
    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJIL(X.C207134163o r8, X.EnumC715680S5m r9) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.translation.service.TranslationServiceImpl.LJJIL(X.163o, X.0S5m):boolean");
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJJIZ(int i, Aweme aweme) {
        String authorUid;
        if (C2511409sm.LIZ) {
            return false;
        }
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        if (aweme != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid = null;
        }
        if (!C0BJA.LIZ(((AbstractC848400XPy) iAccountUserServiceLJFF).LIZJ(authorUid)) || !C0BJA.LIZIZ() || !C746760TRa.LIZ().LJJJLZIJ() || i < 2 || C1390840mIU.LIZ.getBoolean("key_has_show_comment_translation_intro", false)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final void LJJJIL(final int i, List list) {
        if (list != null && !list.isEmpty()) {
            if (((Boolean) C0B80.LIZ.getValue()).booleanValue()) {
                if (i != 0 && i != 4 && i != 8 && i != 2 && i != 1) {
                    return;
                }
            } else if (i != 0 && i != 4 && i != 8) {
                return;
            }
            final ArrayList arrayList = new ArrayList(list);
            C823050WQl.LIZIZ().execute(new Runnable() { // from class: X.161G
                /* JADX WARN: Removed duplicated region for block: B:36:0x00b1  */
                /* JADX WARN: Removed duplicated region for block: B:39:0x00c2  */
                /* JADX WARN: Removed duplicated region for block: B:50:0x00cb A[SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ() {
                    /*
                        Method dump skipped, instruction units count: 312
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C161G.LIZ():void");
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("TranslationServiceImpl@dece.reportFeedWithCLATranslation$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("TranslationServiceImpl@dece.reportFeedWithCLATranslation$1");
                }
            });
        }
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final String LJJJJ(Aweme aweme, String str) {
        String string;
        AnonymousClass1624.LJ.getClass();
        C1869640ykk c1869640ykk = (C1869640ykk) ((AbstractC1361510lXB) AnonymousClass1624.LJFF.getValue()).LIZLLL(aweme, str);
        if (c1869640ykk == null || !c1869640ykk.LIZLLL || (string = Integer.valueOf(c1869640ykk.LIZ).toString()) == null) {
            return "";
        }
        return string;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final void LJJJJIZL(Comment comment, boolean z) {
        String awemeId;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        if (comment != null && (awemeId = comment.getAwemeId()) != null && !C746760TRa.LIZ().LJJJJ().isManual()) {
            if (((Number) C294300BgC.LIZ.getValue()).intValue() == 1) {
                if (z && !C746760TRa.LIZ().LJJIIJZLJL(awemeId)) {
                    Integer numLIZJ = this.LJI.LIZJ(awemeId);
                    if (numLIZJ != null) {
                        iIntValue3 = numLIZJ.intValue();
                    } else {
                        iIntValue3 = 0;
                    }
                    int i = iIntValue3 + 1;
                    if (i == ((Number) C257570A7n.LIZ.getValue()).intValue()) {
                        this.LJI.LIZLLL(awemeId, 0);
                        C746760TRa.LIZ().LJLI(awemeId, true);
                        return;
                    } else {
                        this.LJI.LIZLLL(awemeId, Integer.valueOf(i));
                        return;
                    }
                }
                return;
            }
            if (!C294300BgC.LIZ()) {
                return;
            }
            if (z) {
                if (C746760TRa.LIZ().LJJJLZIJ()) {
                    return;
                }
                Integer numLIZJ2 = this.LJI.LIZJ(awemeId);
                if (numLIZJ2 != null) {
                    iIntValue2 = numLIZJ2.intValue();
                } else {
                    iIntValue2 = 0;
                }
                int i2 = iIntValue2 + 1;
                if (i2 == ((Number) C257570A7n.LIZ.getValue()).intValue()) {
                    this.LJI.LIZLLL(awemeId, 0);
                    C746760TRa.LIZ().LJLIL(Boolean.TRUE, new C1344390l5Z(EnumC993880byE.TRIGGER_BY_CLICK_SEE_TRANSLATION_SOMETIMES, comment.getCid(), comment.getRootCommentId(), null, 8));
                    return;
                } else {
                    this.LJI.LIZLLL(awemeId, Integer.valueOf(i2));
                    return;
                }
            }
            if (!C746760TRa.LIZ().LJJL() || !C746760TRa.LIZ().LJJJLZIJ()) {
                return;
            }
            Integer numLIZJ3 = this.LJII.LIZJ(awemeId);
            if (numLIZJ3 != null) {
                iIntValue = numLIZJ3.intValue();
            } else {
                iIntValue = 0;
            }
            int i3 = iIntValue + 1;
            if (i3 == ((Number) C257560A7m.LIZ.getValue()).intValue()) {
                this.LJII.LIZLLL(awemeId, 0);
                C746760TRa.LIZ().LJLIL(Boolean.FALSE, new C1344390l5Z(EnumC993880byE.TRIGGER_BY_CLICK_SEE_TRANSLATION_SOMETIMES, comment.getCid(), comment.getRootCommentId(), null, 8));
            } else {
                this.LJII.LIZLLL(awemeId, Integer.valueOf(i3));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJJJJL(Aweme aweme, Boolean bool) {
        if (aweme == null) {
            return false;
        }
        return C0SQQ.LIZ.LJI(aweme, bool);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final void LJJJJZI(EnumC715680S5m enumC715680S5m, String str) {
        if (str != null && str.length() != 0) {
            if (enumC715680S5m == EnumC715680S5m.NOT_OVERWRITTEN) {
                this.LJIIIIZZ.remove(str);
            } else {
                this.LJIIIIZZ.put(str, new C710770RuN(enumC715680S5m, str));
            }
            this.LJIIIZ.setValue(new C710770RuN(enumC715680S5m, str));
        }
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final void LJJJLZIJ(String str, String str2) {
        C1193404lg c1193404lg = this.LJ;
        Set<String> linkedHashSet = (Set) ((LinkedHashMap) c1193404lg.LIZIZ).get(str);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet<>();
        }
        linkedHashSet.add(str2);
        c1193404lg.LIZIZ.put(str, linkedHashSet);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final void LJJLIIIJJI(C207134163o c207134163o, boolean z) {
        String str;
        if (c207134163o != null && (str = c207134163o.LIZJ) != null) {
            if (z) {
                Set set = (Set) ((LinkedHashMap) this.LIZJ).get(c207134163o.LIZ);
                if (set != null) {
                    set.add(str);
                    return;
                }
                return;
            }
            Set set2 = (Set) ((LinkedHashMap) this.LIZJ).get(c207134163o.LIZ);
            if (set2 == null) {
                return;
            }
            set2.remove(str);
        }
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final String LJJLIIIJL(Aweme aweme, C161Q<?> c161q) {
        if (aweme == null || !C305430By9.LIZ) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (C13LQ.LJJIJIIJI(C161C.LIZJ(aweme, c161q), LL()) >= 0) {
            arrayList.add(Integer.valueOf(EnumC1153790g89.USER_FILTER_LANGUAGE.getValue()));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(Integer.valueOf(EnumC1153790g89.OTHER.getValue()));
        }
        return C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJJLL(Aweme aweme, C161Q c161q) {
        if (aweme == null || !C305430By9.LIZ) {
            return false;
        }
        return C0SQQ.LIZ.LIZIZ(aweme, c161q);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final C0SBA LJJZZIII(C19EG c19eg, VideoItemParams videoItemParams) {
        if (!(videoItemParams instanceof VideoItemParams) || videoItemParams == null) {
            return null;
        }
        C207118162y c207118162y = new C207118162y(LifecycleOwnerKt.getLifecycleScope(c19eg));
        c207118162y.LJJIIJ(videoItemParams, null, null);
        C1485670olR.LIZ().LJIJJ(videoItemParams.getAweme(), null, false, new WeakReference<>(c19eg), videoItemParams.mEventType);
        c207118162y.LJJII(videoItemParams.mEventType);
        return c207118162y;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJL(boolean z, boolean z2) {
        if (z && !z2 && LLILII().LIZ()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final C162M LJLJJI(EnumC634640Ous enumC634640Ous, String str) {
        EnumSet enumSetOf;
        C163E c163ePutIfAbsent;
        if (str == null || !C0SKG.LIZ.supportScenarios.contains(str)) {
            return null;
        }
        if (C292360Bd4.LIZ) {
            enumSetOf = EnumSet.of(EnumC207101162h.DESCRIPTION, EnumC207101162h.CAPTION, EnumC207101162h.PHOTO_TITLE);
        } else {
            enumSetOf = EnumSet.of(EnumC207101162h.DESCRIPTION, EnumC207101162h.CAPTION);
        }
        ConcurrentHashMap<String, C163E> concurrentHashMap = C163E.LJIJ;
        C163E c163e = concurrentHashMap.get(str);
        if (c163e == null && (c163ePutIfAbsent = concurrentHashMap.putIfAbsent(str, (c163e = new C163E(enumSetOf)))) != null) {
            c163e = c163ePutIfAbsent;
        }
        return c163e;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJLJJL(Aweme aweme, C161Q<?> c161q) {
        if (aweme == null) {
            return false;
        }
        boolean z = C305430By9.LIZ;
        if (!C305430By9.LIZ) {
            return false;
        }
        return C0SQQ.LIZ.LJIILIIL(aweme, c161q);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final void LJLJJLL(EnumC207101162h enumC207101162h, C1760006us c1760006us) {
        if (C1E8U.LIZ() && !this.LIZLLL.containsKey(enumC207101162h)) {
            this.LIZLLL.put(enumC207101162h, c1760006us);
            this.LIZJ.put(enumC207101162h, new LinkedHashSet());
        }
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final String LJLLILLLL(Aweme aweme, Map<EnumC207101162h, ? extends Pair<? extends C161Q<?>, ? extends Function1<Object, Unit>>> map) {
        if (aweme == null || !C305430By9.LIZ) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String[] strArrLL = LL();
        Collection<? extends Pair<? extends C161Q<?>, ? extends Function1<Object, Unit>>> collectionValues = map.values();
        if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
            Iterator<T> it2 = collectionValues.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (C13LQ.LJJIJIIJI(C161C.LIZJ(aweme, (C161Q) ((Pair) it2.next()).getFirst()), strArrLL) >= 0) {
                    arrayList.add(Integer.valueOf(EnumC1153790g89.USER_FILTER_LANGUAGE.getValue()));
                    break;
                }
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(Integer.valueOf(EnumC1153790g89.OTHER.getValue()));
        }
        return C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final String LJLLLLLL(Aweme aweme, C161Q<?> c161q) {
        if (aweme == null || !C305430By9.LIZ) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String strLIZJ = C161C.LIZJ(aweme, c161q);
        if (!c161q.LJII(aweme) || strLIZJ.length() == 0 || Intrinsics.LJFF(strLIZJ, "un")) {
            arrayList.add(Integer.valueOf(C0CAL.NO_TRANSLATABLE_ELEMENT.getValue()));
        }
        if (Intrinsics.LJFF(strLIZJ, LLIIZ())) {
            arrayList.add(Integer.valueOf(C0CAL.SAME_LANGUAGE.getValue()));
        }
        if (!(!LJLZ(aweme))) {
            arrayList.add(Integer.valueOf(C0CAL.OTHER.getValue()));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(Integer.valueOf(C0CAL.OTHER.getValue()));
        }
        return C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LLD(Aweme aweme, Map<EnumC207101162h, ? extends Pair<? extends C161Q<?>, ? extends Function1<Object, Unit>>> map) {
        if (aweme == null) {
            return false;
        }
        boolean z = C305430By9.LIZ;
        if (!C305430By9.LIZ) {
            return false;
        }
        return C0SQQ.LIZ.LJIIJ(aweme, map);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LLF(Aweme aweme, Boolean bool) {
        if (aweme == null) {
            return false;
        }
        return C0SQQ.LIZ.LIZJ(aweme, bool);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LLFFF(Aweme aweme, boolean z) {
        if (aweme == null) {
            return false;
        }
        return C0SQQ.LIZ.LJIIJJI(aweme, z);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LLFII(Aweme aweme, Boolean bool) {
        if (aweme == null) {
            return false;
        }
        return C0SQQ.LIZ.LJIILJJIL(aweme, bool);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LLIIII(Aweme aweme, boolean z) {
        if (aweme == null) {
            return false;
        }
        return C0SQQ.LIZ.LJIIL(aweme, z);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LLIIIL(Aweme aweme, String str) {
        if (aweme == null || C20702515zj.LIZJ(aweme, str) != null || !LJJIIZ(aweme, str)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final String LLIIJI(Comment comment, EnumC715680S5m enumC715680S5m) {
        String commentLanguage;
        boolean z;
        String awemeId;
        String commentLanguage2 = null;
        if (comment != null) {
            commentLanguage = comment.getCommentLanguage();
        } else {
            commentLanguage = null;
        }
        if (Intrinsics.LJFF(commentLanguage, "zh")) {
            commentLanguage2 = "zh-Hans";
        } else if (comment != null) {
            commentLanguage2 = comment.getCommentLanguage();
        }
        C1839820xye.LIZ().LJIIIIZZ().getClass();
        String[] strArrLIZJ = C20700315zN.LIZJ();
        if (strArrLIZJ != null && C13LQ.LJJIJIIJI(commentLanguage2, strArrLIZJ) >= 0) {
            z = true;
        } else {
            z = false;
        }
        ICaptionKevaService iCaptionKevaServiceLIZ = C746760TRa.LIZ();
        if (comment == null || (awemeId = comment.getAwemeId()) == null) {
            awemeId = "";
        }
        boolean zLJJIIJZLJL = iCaptionKevaServiceLIZ.LJJIIJZLJL(awemeId);
        boolean zLJJJLZIJ = C746760TRa.LIZ().LJJJLZIJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{isVideoCommentAutoTranslationOn=");
        sbLIZ.append(zLJJIIJZLJL);
        sbLIZ.append(", globalCommentToggleOn=");
        sbLIZ.append(zLJJJLZIJ);
        sbLIZ.append(", isWithinDNTLanguage=");
        sbLIZ.append(z);
        sbLIZ.append(", srcLang=");
        sbLIZ.append(commentLanguage2);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final ListenableFuture LLIIJLIL(String str, String str2) {
        return ((InterfaceC1346190l8T) C09S2.LIZJ(InterfaceC1346190l8T.class, C0CQT.LIZJ)).LIZ(str, str2, 4);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LIZJ(Aweme aweme, String str, String str2) {
        PhotoModeImageInfo photoModeImageInfo;
        TranslationInfo translationInfo;
        PhotoModeImageInfo photoModeImageInfo2;
        List<PhotoModeImageUrlModel> imageList;
        if (!C281430B1h.LIZ() || (photoModeImageInfo = aweme.getPhotoModeImageInfo()) == null || (translationInfo = photoModeImageInfo.getTranslationInfo()) == null || !translationInfo.translatable || ((ITranslationService) this.LJIILJJIL.getValue()).LJJLIIIJJIZ(aweme)) {
            return false;
        }
        if ((((ITranslationService) this.LJIILJJIL.getValue()).LJJZZI(aweme.getAid()) != EnumC715680S5m.OVERRIDE_TO_TRANSLATED && !LLILII().LIZ()) || (photoModeImageInfo2 = aweme.getPhotoModeImageInfo()) == null || (imageList = photoModeImageInfo2.getImageList()) == null || imageList.isEmpty()) {
            return false;
        }
        for (PhotoModeImageUrlModel photoModeImageUrlModel : imageList) {
            if (!Intrinsics.LJFF(photoModeImageUrlModel.ocrLanguage, str)) {
                if (C13LQ.LJJIJIIJI(photoModeImageUrlModel.ocrLanguage, LL()) < 0) {
                    Set<String> set = this.LJFF;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(aweme.getAid());
                    sbLIZ.append('_');
                    sbLIZ.append(str);
                    if (!set.add(C2188811AlT.LIZIZ(sbLIZ))) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJIILL(Aweme aweme, Boolean bool, Boolean bool2) {
        if (aweme == null) {
            return false;
        }
        return C0SQQ.LIZ.LIZ(aweme, bool, null, bool2);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final <DATA extends C161R> void LJIL(EnumC207101162h enumC207101162h, C161Q<DATA> c161q, Function1<? super DATA, Unit> function1) {
        if (C305430By9.LIZ) {
            Map<EnumC207101162h, Pair<C161Q<?>, Function1<Object, Unit>>> map = this.LJIIJJI;
            C19719512Dh.LJ(1, function1);
            map.put(enumC207101162h, new Pair<>(c161q, function1));
        }
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJJIJ(Aweme aweme, Boolean bool, Map<EnumC207101162h, ? extends Pair<? extends C161Q<?>, ? extends Function1<Object, Unit>>> map) {
        if (aweme == null) {
            return false;
        }
        boolean z = C305430By9.LIZ;
        if (!C305430By9.LIZ) {
            return false;
        }
        return C0SQQ.LIZ.LJFF(aweme, bool, map);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final C00I7 LJJIJIIJIL(WeakReference<Context> weakReference, Aweme aweme, String str) {
        String authorUid;
        String aid;
        String strValueOf;
        int iLJJIII;
        Integer numValueOf;
        Context context;
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        String str2 = "";
        if (aweme == null || (authorUid = AwemeExtKt.getAuthorUid(aweme)) == null) {
            authorUid = "";
        }
        boolean zLJFF = Intrinsics.LJFF(curUserId, authorUid);
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        if (str != null) {
            str2 = str;
        }
        String aid2 = null;
        if (aweme != null && aweme.getVideo() != null) {
            strValueOf = String.valueOf(aweme.getVideo().getDuration());
        } else {
            strValueOf = CardStruct.IStatusCode.DEFAULT;
        }
        String strLLIIZ = C161N.LIZIZ.LLIIZ();
        if (weakReference != null && (context = weakReference.get()) != null) {
            iLJJIII = C0SXF.LJJIII(context, aweme);
        } else {
            iLJJIII = 0;
        }
        if (aweme != null) {
            numValueOf = Integer.valueOf(aweme.getAwemeType());
        } else {
            numValueOf = null;
        }
        C0N0Y c0n0yLJLJJI = C1483410ohn.LJLJJI();
        if (aweme != null) {
            aid2 = aweme.getAid();
        }
        return new C00I7(aid, curUserId, authorUid, str2, strValueOf, strLLIIZ, zLJFF ? 1 : 0, iLJJIII, numValueOf, c0n0yLJLJJI.LJIIIIZZ(aid2));
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final void LJJIJLIJ(List<C19595011lU> list, boolean z, InterfaceC386401eo interfaceC386401eo) {
        C19581011jE c19581011jE;
        for (C19595011lU c19595011lU : (ArrayList) list) {
            if (c19595011lU.LIZIZ.getType() == 18) {
                InterfaceC19594611lQ interfaceC19594611lQ = c19595011lU.LIZJ;
                Long lValueOf = null;
                if ((interfaceC19594611lQ instanceof C19581011jE) && (c19581011jE = (C19581011jE) interfaceC19594611lQ) != null) {
                    if (interfaceC386401eo != null) {
                        lValueOf = Long.valueOf(interfaceC386401eo.LLL());
                    }
                    c19581011jE.LJJIFFI(lValueOf, z);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final boolean LJLLJ(Aweme aweme, C0SBD c0sbd, String str) {
        boolean z;
        if (aweme == null || (!C281410B1f.LIZ()) || !C582980Mtk.LIZIZ(aweme)) {
            return false;
        }
        if (Intrinsics.LJFF(str, "search_result") && C1ER1.LIZIZ.LLLLZIL()) {
            return false;
        }
        if (!LJJJJZ(aweme) && !LJJJ(aweme) && !LJJLIIIJJIZ(aweme)) {
            z = false;
        } else {
            z = true;
        }
        int i = C0SBC.LIZIZ[c0sbd.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i != 2 && i != 3) {
            throw new C1954807lC();
        }
        return z;
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final void LJLLLL(List<? extends Comment> list, Fragment fragment, String str) {
        if (list == null || fragment == null || str == null) {
            return;
        }
        String[] strArrLL = ((ITranslationService) this.LJIILJJIL.getValue()).LL();
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (!list.isEmpty()) {
            for (Comment comment : list) {
                if (C13LQ.LJIILLIIL(comment.getCommentLanguage(), strArrLL) && !Intrinsics.LJFF(curUserId, comment.getUser().getUid())) {
                    Keva keva = C1390840mIU.LIZ;
                    Set<String> stringSet = keva.getStringSet("key_has_shown_comment_dnt_toast", null);
                    if (stringSet == null || (stringSet.size() < 3 && !stringSet.contains(str))) {
                        C1389890mGx c1389890mGx = new C1389890mGx(fragment);
                        c1389890mGx.LJIIJ(C20642515q3.LJI(2131829255));
                        c1389890mGx.LJII(R.attr.a04);
                        c1389890mGx.LIZLLL(3000L);
                        c1389890mGx.LJIIJJI();
                        keva.storeStringSet("key_has_shown_comment_dnt_toast", C15442062u.LJIIIIZZ(str, keva.getStringSet("key_has_shown_comment_dnt_toast", C08CX.INSTANCE)));
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final C11NZ LJIILJJIL(long j, Aweme aweme, String str, String str2) {
        AnonymousClass1624.LJ.getClass();
        AnonymousClass1624.LJFF.getValue();
        C1381100m2m.LJII(aweme, str);
        return AnonymousClass1624.LJIILLIIL(j, str, aweme, str2, null, null);
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final void LJJJLL(List<C19595011lU> list, boolean z, InterfaceC386401eo interfaceC386401eo, HashMap<String, String> map) {
        Long lValueOf;
        for (C19595011lU c19595011lU : list) {
            if (c19595011lU.LIZIZ.getType() == 18) {
                if (z) {
                    C19581011jE c19581011jE = (C19581011jE) c19595011lU.LIZJ;
                    String str = map.get(c19595011lU.LIZIZ.getTextStruct());
                    if (str == null) {
                        str = "";
                    }
                    c19581011jE.LJIIL = str;
                }
                C19581011jE c19581011jE2 = (C19581011jE) c19595011lU.LIZJ;
                if (interfaceC386401eo != null) {
                    lValueOf = Long.valueOf(interfaceC386401eo.LLL());
                } else {
                    lValueOf = null;
                }
                c19581011jE2.LJJIFFI(lValueOf, z);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.translation.service.ITranslationService
    public final InterfaceC19594611lQ LJFF(Context context, C705930RmZ c705930RmZ, InteractStickerStruct interactStickerStruct, C194349111v c194349111v, InterfaceC386401eo interfaceC386401eo) {
        float f;
        C690990R8n c690990R8nLIZ = null;
        if (interactStickerStruct.getTextInfo() == null) {
            return null;
        }
        if (c705930RmZ != null) {
            InterfaceC19582111jP interfaceC19582111jP = c705930RmZ.LJIIL;
            if (interfaceC19582111jP != null) {
                c690990R8nLIZ = interfaceC19582111jP.LIZ();
            }
            float f2 = 0.0f;
            if (c705930RmZ != null) {
                if (c690990R8nLIZ != null) {
                    f = c690990R8nLIZ.LIZ;
                } else {
                    f = 0.0f;
                }
                c705930RmZ.LIZ = f;
                if (c690990R8nLIZ != null) {
                    f2 = c690990R8nLIZ.LIZIZ;
                }
                c705930RmZ.LIZIZ = f2;
            }
        }
        return new C19581011jE(interactStickerStruct.getType(), context, c194349111v, interactStickerStruct, c705930RmZ, interfaceC386401eo);
    }
}
