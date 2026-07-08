package kotlin.jvm.internal;

import X.C08HM;
import X.C09AY;
import X.C0ET4;
import X.C0L2H;
import X.C0LAB;
import X.C118300cf;
import X.C1397660mTU;
import X.C13LP;
import X.C1DRG;
import X.C2188811AlT;
import X.C389120FNm;
import X.C523280Kfe;
import X.C524940KiK;
import X.C524980KiO;
import X.C525130Kid;
import X.C526910KlV;
import X.C540280LGw;
import X.C540290LGx;
import X.C545510LaP;
import X.C550580Lia;
import X.C551030LjJ;
import X.C551070LjN;
import X.C551080LjO;
import X.C552620Lls;
import X.C552630Llt;
import X.C552650Llv;
import X.C559610Lx9;
import android.content.Context;
import android.os.SystemClock;
import com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC;
import com.ss.android.ugc.aweme.aikit.api.common.AIGCDraft;
import com.ss.android.ugc.aweme.aikit.api.common.task.CameoDraft;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCSocialModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.interfaces.ITemplateMusicService;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher;
import com.tts.oecverify.BdTuring;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes9.dex */
public class AwS93S1200000_8 extends C09AY implements Function1 {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS93S1200000_8 awS93S1200000_8, Object obj) {
        C525130Kid.LIZ((C0LAB) obj, ((C524980KiO) awS93S1200000_8.l1).getShortVideoContext().creativeModel.autoPickModel, awS93S1200000_8.s0, ((List) awS93S1200000_8.l2).size());
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS93S1200000_8 awS93S1200000_8, Object obj) {
        AVMusic aVMusic = (AVMusic) obj;
        if (aVMusic != null) {
            ShortVideoContext shortVideoContext = ((MvChoosePhotoScene) awS93S1200000_8.l1).shortVideoContext;
            if (shortVideoContext != null) {
                aVMusic.setMusicBeginTime(shortVideoContext.cameraComponentModel.mMusicStart);
                aVMusic.setMusicEndTime(shortVideoContext.cameraComponentModel.musicEndTime);
            }
            ((MvChoosePhotoScene) awS93S1200000_8.l1).avMusic = aVMusic;
            ITemplateMusicService iTemplateMusicServiceLIZ = C524940KiK.LIZ();
            if (iTemplateMusicServiceLIZ != null) {
                iTemplateMusicServiceLIZ.LIZ(aVMusic, awS93S1200000_8.s0);
            }
            ((MvChoosePhotoScene) awS93S1200000_8.l1).musicModel = C389120FNm.LIZ(aVMusic);
            if (!((MvChoosePhotoScene) awS93S1200000_8.l1).isUgcTemplateMode()) {
                MvChoosePhotoScene mvChoosePhotoScene = (MvChoosePhotoScene) awS93S1200000_8.l1;
                mvChoosePhotoScene.preDownloadMusicForPhotoImport(mvChoosePhotoScene.musicModel, (Function1) awS93S1200000_8.l2);
            } else {
                MvChoosePhotoScene mvChoosePhotoScene2 = (MvChoosePhotoScene) awS93S1200000_8.l1;
                mvChoosePhotoScene2.downloadMusic(mvChoosePhotoScene2.musicModel, (Function1) awS93S1200000_8.l2);
            }
        } else {
            Function1 function1 = (Function1) awS93S1200000_8.l2;
            if (function1 != null) {
                function1.invoke(Boolean.FALSE);
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS93S1200000_8 awS93S1200000_8, Object obj) {
        int i;
        ((Boolean) obj).booleanValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("");
        sbLIZ.append(System.currentTimeMillis());
        String strLIZJ = C08HM.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        C118300cf c118300cf = (C118300cf) awS93S1200000_8.l1;
        if (C540280LGw.LIZJ((Context) awS93S1200000_8.l2, C540280LGw.LIZ(awS93S1200000_8.s0), strLIZJ) == null) {
            i = -1;
        } else {
            i = 1;
        }
        c118300cf.element = i;
        return Integer.valueOf(((C118300cf) awS93S1200000_8.l1).element);
    }

    public static final Object invoke$11(AwS93S1200000_8 awS93S1200000_8, Object obj) {
        C551080LjO c551080LjO = (C551080LjO) obj;
        C551030LjJ.LIZJ(c551080LjO, (C545510LaP) awS93S1200000_8.l1, awS93S1200000_8.s0, new AwS587S0100000_8((C551070LjN) awS93S1200000_8.l2, 771));
        if (((C551070LjN) awS93S1200000_8.l2).LIZIZ.length() > 0) {
            c551080LjO.LIZ(C552650Llv.INSTANCE, new AwS552S0100000_8((C551070LjN) awS93S1200000_8.l2, 1132));
            c551080LjO.LIZ(C552630Llt.INSTANCE, new AwS552S0100000_8((C551070LjN) awS93S1200000_8.l2, 1133));
            c551080LjO.LIZ(C552620Lls.INSTANCE, new AwS552S0100000_8((C551070LjN) awS93S1200000_8.l2, 1134));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS93S1200000_8 awS93S1200000_8, Object obj) {
        String str;
        ((C1397660mTU) obj).LIZJ = true;
        ((Function0) awS93S1200000_8.l1).invoke();
        C540290LGx.LIZJ.storeBoolean("should_open_private_album_from_not_now", false);
        C523280Kfe c523280Kfe = C523280Kfe.LIZ;
        ShortVideoContext shortVideoContext = (ShortVideoContext) awS93S1200000_8.l2;
        if (shortVideoContext != null) {
            str = shortVideoContext.shootWay;
        } else {
            str = null;
        }
        C523280Kfe.LIZLLL(c523280Kfe, str, awS93S1200000_8.s0, "2");
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS93S1200000_8 awS93S1200000_8, Object obj) {
        String str;
        ((C1397660mTU) obj).LIZJ = true;
        ((Function0) awS93S1200000_8.l1).invoke();
        C540290LGx.LIZJ.storeBoolean("should_open_private_album_from_select_photos_cta", false);
        C523280Kfe c523280Kfe = C523280Kfe.LIZ;
        ShortVideoContext shortVideoContext = (ShortVideoContext) awS93S1200000_8.l2;
        if (shortVideoContext != null) {
            str = shortVideoContext.shootWay;
        } else {
            str = null;
        }
        C523280Kfe.LIZLLL(c523280Kfe, str, awS93S1200000_8.s0, "2");
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$4(AwS93S1200000_8 awS93S1200000_8, Object obj) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        C0L2H c0l2h = new C0L2H((C1DRG) obj, (Function0) awS93S1200000_8.l2, awS93S1200000_8.s0);
        ((C559610Lx9) awS93S1200000_8.l1).getClass();
        C559610Lx9.LIZ(c0l2h);
        c0l2h.afterInit$als_release(jUptimeMillis);
        return c0l2h;
    }

    public static final Object invoke$5(AwS93S1200000_8 awS93S1200000_8, Object obj) {
        String strLJJLIIIJ;
        String str;
        String value;
        List<String> list;
        C0LAB c0lab = (C0LAB) obj;
        c0lab.LJ("creation_id", awS93S1200000_8.s0);
        CameoDraft cameoDraft = (CameoDraft) awS93S1200000_8.l1;
        if (cameoDraft != null && (list = cameoDraft.cameoIds) != null) {
            strLJJLIIIJ = C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62);
        } else {
            strLJJLIIIJ = null;
        }
        c0lab.LJ("cameo_id_list", strLJJLIIIJ);
        CameoDraft cameoDraft2 = (CameoDraft) awS93S1200000_8.l1;
        String str2 = "";
        if (cameoDraft2 == null || (str = cameoDraft2.taskId) == null) {
            str = "";
        }
        c0lab.LJ("task_id", str);
        AIGC.RecallWay recallWay = ((AIGCDraft) awS93S1200000_8.l2).aigcEntranceInfo.recallWay;
        if (recallWay != null && (value = recallWay.getValue()) != null) {
            str2 = value;
        }
        c0lab.LJ("recall_way", str2);
        c0lab.LIZ(1, "is_draft");
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS93S1200000_8 awS93S1200000_8, Object obj) {
        String str = (String) obj;
        if (a0.LJJIIZI(str, ((AwemeDraft) awS93S1200000_8.l1).LIZ(), false) && !a0.LJJIIZI(str, awS93S1200000_8.s0, false)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(((AwemeDraft) awS93S1200000_8.l1).LIZIZ().getCreationId());
            sbLIZ.append('/');
            sbLIZ.append(((AwemeDraft) awS93S1200000_8.l1).LIZIZ().getVersion());
            if (a0.LJJIIZI(str, C2188811AlT.LIZIZ(sbLIZ), false)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(((AwemeDraft) awS93S1200000_8.l1).LIZIZ().getCreationId());
                sbLIZ2.append('/');
                sbLIZ2.append(((AwemeDraft) awS93S1200000_8.l1).LIZIZ().getVersion());
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(((CreativeInfo) awS93S1200000_8.l2).getCreationId());
                sbLIZ3.append('/');
                sbLIZ3.append(((CreativeInfo) awS93S1200000_8.l2).getVersion());
                return u.LJJIFFI(str, strLIZIZ, C2188811AlT.LIZIZ(sbLIZ3), false);
            }
            return u.LJJIFFI(str, ((AwemeDraft) awS93S1200000_8.l1).LIZ(), ((CreativeInfo) awS93S1200000_8.l2).getCreationId(), false);
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$7(kotlin.jvm.internal.AwS93S1200000_8 r4, java.lang.Object r5) {
        /*
            X.0LAB r5 = (X.C0LAB) r5
            java.lang.Object r0 = r4.l1
            X.0KlV r0 = (X.C526910KlV) r0
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r0.LLLJIL
            r3 = 0
            if (r0 == 0) goto L11
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
            if (r0 == 0) goto L11
            com.ss.android.ugc.aweme.creative.model.AutoPickModel r3 = r0.autoPickModel
        L11:
            r2 = 0
            if (r3 == 0) goto L2c
            java.lang.String r1 = r4.s0
            if (r1 == 0) goto L28
            java.lang.Object r0 = r4.l2
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L22
            int r2 = r0.size()
        L22:
            X.C525130Kid.LIZ(r5, r3, r1, r2)
        L25:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L28:
            java.lang.String r1 = r3.pickId
            if (r1 != 0) goto L2e
        L2c:
            java.lang.String r1 = ""
        L2e:
            int r0 = r1.length()
            if (r0 <= 0) goto L25
            java.lang.String r0 = "pick_id"
            r5.LJ(r0, r1)
            goto L25
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS93S1200000_8.invoke$7(kotlin.jvm.internal.AwS93S1200000_8, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$8(kotlin.jvm.internal.AwS93S1200000_8 r5, java.lang.Object r6) {
        /*
            X.0LAB r6 = (X.C0LAB) r6
            java.lang.Object r0 = r5.l1
            com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher$EnterParams r0 = (com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher.EnterParams) r0
            com.ss.android.ugc.aweme.creative.model.CreativeInfo r0 = r0.creativeInfo
            r4 = 0
            if (r0 == 0) goto L64
            java.lang.String r1 = r0.getCreationId()
        Lf:
            java.lang.String r0 = "creation_id"
            r6.LJ(r0, r1)
            java.lang.Object r0 = r5.l2
            com.ss.android.ugc.aweme.creative.model.aigc.AIGCSocialModel r0 = (com.ss.android.ugc.aweme.creative.model.aigc.AIGCSocialModel) r0
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L62
            java.util.List<com.ss.android.ugc.aweme.creative.model.common.MentionDataItem> r1 = r0.selfCameoInfo
            if (r1 == 0) goto L62
            X.0LgJ r0 = X.C549170LgJ.LIZ
            r0.getClass()
            boolean r0 = X.C549170LgJ.LIZIZ(r1)
            if (r0 != r3) goto L62
            r0 = 1
        L2c:
            r1 = r0 ^ 1
            java.lang.String r0 = "has_cameo"
            r6.LIZ(r1, r0)
            java.lang.Object r0 = r5.l1
            com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher$EnterParams r0 = (com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher.EnterParams) r0
            com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo r0 = r0.entranceInfo
            if (r0 == 0) goto L3d
            java.lang.String r4 = r0.enterFrom
        L3d:
            java.lang.String r0 = "enter_from"
            r6.LJ(r0, r4)
            java.lang.Object r0 = r5.l1
            com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher$EnterParams r0 = (com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher.EnterParams) r0
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
            if (r0 == 0) goto L53
            com.ss.android.ugc.aweme.creative.model.draft.DraftInfoModel r0 = r0.draftInfoModel
            if (r0 == 0) goto L53
            boolean r0 = r0.isDraft
            if (r0 != r3) goto L53
            r2 = 1
        L53:
            java.lang.String r0 = "is_draft"
            r6.LIZ(r2, r0)
            java.lang.String r1 = "action_method"
            java.lang.String r0 = r5.s0
            r6.LJ(r1, r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L62:
            r0 = 0
            goto L2c
        L64:
            r1 = r4
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS93S1200000_8.invoke$8(kotlin.jvm.internal.AwS93S1200000_8, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$9(kotlin.jvm.internal.AwS93S1200000_8 r4, java.lang.Object r5) {
        /*
            X.0LAB r5 = (X.C0LAB) r5
            java.lang.Object r0 = r4.l1
            com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher$EnterParams r0 = (com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher.EnterParams) r0
            com.ss.android.ugc.aweme.creative.model.CreativeInfo r0 = r0.creativeInfo
            r3 = 0
            if (r0 == 0) goto L68
            java.lang.String r1 = r0.getCreationId()
        Lf:
            java.lang.String r0 = "creation_id"
            r5.LJ(r0, r1)
            java.lang.Object r0 = r4.l2
            com.ss.android.ugc.aweme.creative.model.aigc.AIGCSocialModel r0 = (com.ss.android.ugc.aweme.creative.model.aigc.AIGCSocialModel) r0
            if (r0 == 0) goto L66
            java.util.List<com.ss.android.ugc.aweme.creative.model.common.MentionDataItem> r0 = r0.peerCameoInfo
            if (r0 == 0) goto L66
            java.lang.Object r0 = X.C13LP.LJJJLL(r0)
            com.ss.android.ugc.aweme.creative.model.common.MentionDataItem r0 = (com.ss.android.ugc.aweme.creative.model.common.MentionDataItem) r0
            if (r0 == 0) goto L66
            java.lang.String r1 = r0.uid
        L28:
            java.lang.String r0 = "profile_user_id"
            r5.LJ(r0, r1)
            java.lang.Object r0 = r4.l2
            com.ss.android.ugc.aweme.creative.model.aigc.AIGCSocialModel r0 = (com.ss.android.ugc.aweme.creative.model.aigc.AIGCSocialModel) r0
            r2 = 1
            if (r0 == 0) goto L64
            java.util.List<com.ss.android.ugc.aweme.creative.model.common.MentionDataItem> r1 = r0.selfCameoInfo
            if (r1 == 0) goto L64
            X.0LgJ r0 = X.C549170LgJ.LIZ
            r0.getClass()
            boolean r0 = X.C549170LgJ.LIZIZ(r1)
            if (r0 != r2) goto L64
            r0 = 1
        L44:
            r1 = r0 ^ 1
            java.lang.String r0 = "has_cameo"
            r5.LIZ(r1, r0)
            java.lang.Object r0 = r4.l1
            com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher$EnterParams r0 = (com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher.EnterParams) r0
            com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo r0 = r0.entranceInfo
            if (r0 == 0) goto L55
            java.lang.String r3 = r0.enterFrom
        L55:
            java.lang.String r0 = "enter_from"
            r5.LJ(r0, r3)
            java.lang.String r1 = "action_method"
            java.lang.String r0 = r4.s0
            r5.LJ(r1, r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L64:
            r0 = 0
            goto L44
        L66:
            r1 = r3
            goto L28
        L68:
            r1 = r3
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS93S1200000_8.invoke$9(kotlin.jvm.internal.AwS93S1200000_8, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS93S1200000_8(C118300cf c118300cf, String str, Context context, int i) {
        super(1);
        this.$t = i;
        this.l1 = c118300cf;
        this.s0 = str;
        this.l2 = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS93S1200000_8(C524980KiO c524980KiO, C524980KiO c524980KiO2, String str, List<? extends TikTokMediaModel> list) {
        super(1);
        this.$t = list;
        this.l1 = c524980KiO;
        this.s0 = c524980KiO2;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS93S1200000_8(C526910KlV c526910KlV, C526910KlV c526910KlV2, String str, List<? extends TikTokMediaModel> list) {
        super(1);
        this.$t = list;
        this.l1 = c526910KlV;
        this.s0 = c526910KlV2;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS93S1200000_8(C545510LaP c545510LaP, C545510LaP<C550580Lia<C551070LjN>> c545510LaP2, String str, C551070LjN c551070LjN) {
        super(1);
        this.$t = c551070LjN;
        this.l1 = c545510LaP;
        this.s0 = c545510LaP2;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS93S1200000_8(AwemeDraft awemeDraft, String str, CreativeInfo creativeInfo, int i) {
        super(1);
        this.$t = i;
        this.l1 = awemeDraft;
        this.s0 = str;
        this.l2 = creativeInfo;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS93S1200000_8(MvChoosePhotoScene mvChoosePhotoScene, MvChoosePhotoScene mvChoosePhotoScene2, String str, Function1<? super Boolean, Unit> function1) {
        super(1);
        this.$t = function1;
        this.l1 = mvChoosePhotoScene;
        this.s0 = mvChoosePhotoScene2;
        this.l2 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS93S1200000_8(IAITheaterCreationLauncher.EnterParams enterParams, AIGCSocialModel aIGCSocialModel, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = enterParams;
        this.l2 = aIGCSocialModel;
        this.s0 = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS93S1200000_8(String str, CameoDraft cameoDraft, AIGCDraft aIGCDraft, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l1 = cameoDraft;
        this.l2 = aIGCDraft;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS93S1200000_8(Function0 function0, Function0<Unit> function02, ShortVideoContext shortVideoContext, String str) {
        super(1);
        this.$t = str;
        this.l1 = function0;
        this.l2 = function02;
        this.s0 = shortVideoContext;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS93S1200000_8(C0ET4 c0et4, C559610Lx9 c559610Lx9, Function0 function0, String str, int i) {
        super(1);
        this.$t = i;
        this.l1 = c559610Lx9;
        this.l2 = function0;
        this.s0 = str;
    }
}
