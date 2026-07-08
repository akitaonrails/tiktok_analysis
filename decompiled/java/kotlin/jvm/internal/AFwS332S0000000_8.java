package kotlin.jvm.internal;

import X.C05JA;
import X.C09AY;
import X.C0LJ0;
import X.C0LNQ;
import X.C0LOD;
import X.C0LOG;
import X.C0LOL;
import X.C0M21;
import X.C0M22;
import X.C0PEM;
import X.C1388190mED;
import X.C1665790tRx;
import X.C1DFH;
import X.C2107308Nj;
import X.C2296808zG;
import X.C23250099c;
import X.C23271099x;
import X.C535700Kzg;
import X.C543920LUw;
import X.C546010LbD;
import X.C546340Lbk;
import X.C546380Lbo;
import X.C551590LkD;
import X.C551630LkH;
import X.C551760LkU;
import X.C551780LkW;
import X.C551940Lkm;
import X.C551950Lkn;
import X.C551980Lkq;
import X.C551990Lkr;
import X.C552000Lks;
import X.C552040Lkw;
import X.C552890LmJ;
import X.C570560MZi;
import X.InterfaceC1631620sYq;
import X.InterfaceC1680500tpg;
import X.InterfaceC1685750ty9;
import android.content.Context;
import androidx.compose.foundation.layout.c;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.aigc.graph.nodes.node.AIGCWorkflowDownloadConfig;
import com.ss.android.ugc.aweme.aigc.graph.nodes.node.AIGCWorkflowPollingConfig;
import com.ss.android.ugc.aweme.aigc.graph.nodes.node.AIGCWorkflowQuotaConfig;
import com.ss.android.ugc.aweme.aigc.graph.nodes.node.AIGCWorkflowServerConfig;
import com.ss.android.ugc.aweme.aigc.graph.nodes.node.I2VOfflineProcessingPostProcessingConfig;
import com.ss.android.ugc.aweme.aigc.graph.nodes.node.I2VOfflineProcessingTemplateDownloadConfig;
import com.ss.android.ugc.aweme.aigc.graph.spec.data.runtime.AIGCWorkflowNodeConfig;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo;
import com.ss.android.ugc.aweme.aikit.api.common.AIGCDraft;
import com.ss.android.ugc.aweme.aikit.api.common.task.CameoDraft;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.theater.model.AITheaterModel;
import com.tts.oecverify.BdTuring;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public class AFwS332S0000000_8 extends C09AY implements InterfaceC1631620sYq {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(21);
    public final int $t;

    public static AFwS332S0000000_8 get$arr$(int i) {
        AFwS332S0000000_8 aFwS332S0000000_8 = (AFwS332S0000000_8) arr$.get(i);
        if (aFwS332S0000000_8 != null) {
            return aFwS332S0000000_8;
        }
        arr$.compareAndSet(i, null, new AFwS332S0000000_8(i));
        return (AFwS332S0000000_8) arr$.get(i);
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            case 2:
                return invoke$2(this, obj, obj2, obj3);
            case 3:
                return invoke$3(this, obj, obj2, obj3);
            case 4:
                return invoke$4(this, obj, obj2, obj3);
            case 5:
                return invoke$5(this, obj, obj2, obj3);
            case 6:
                return invoke$6(this, obj, obj2, obj3);
            case 7:
                return invoke$7(this, obj, obj2, obj3);
            case 8:
                return invoke$8(this, obj, obj2, obj3);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj, obj2, obj3);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj, obj2, obj3);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj, obj2, obj3);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj, obj2, obj3);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj, obj2, obj3);
            case 14:
                return invoke$14(this, obj, obj2, obj3);
            case 15:
                return invoke$15(this, obj, obj2, obj3);
            case 16:
                return invoke$16(this, obj, obj2, obj3);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj, obj2, obj3);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj, obj2, obj3);
            case 19:
                return invoke$19(this, obj, obj2, obj3);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFwS332S0000000_8(int i) {
        super(3);
        this.$t = i;
    }

    public static final Object invoke$0(AFwS332S0000000_8 aFwS332S0000000_8, Object obj, Object obj2, Object obj3) {
        List<MediaModel> list;
        C535700Kzg c535700Kzg = (C535700Kzg) obj2;
        if (c535700Kzg == null || (list = c535700Kzg.LIZIZ) == null || list.isEmpty()) {
            return obj3;
        }
        return c535700Kzg;
    }

    public static final Object invoke$1(AFwS332S0000000_8 aFwS332S0000000_8, Object obj, Object obj2, Object obj3) {
        List<MediaModel> list;
        C535700Kzg c535700Kzg = (C535700Kzg) obj2;
        C535700Kzg c535700Kzg2 = (C535700Kzg) obj3;
        if (c535700Kzg == null || (list = c535700Kzg.LIZIZ) == null) {
            return null;
        }
        if (list.size() >= 30) {
            if (c535700Kzg2 == null) {
                return null;
            }
            return C535700Kzg.LIZ(c535700Kzg2, list.subList(0, 30));
        }
        if (c535700Kzg2 == null) {
            return null;
        }
        return C535700Kzg.LIZ(c535700Kzg2, list);
    }

    public static final Object invoke$10(AFwS332S0000000_8 aFwS332S0000000_8, Object obj, Object obj2, Object obj3) {
        String str = (String) obj;
        Serializable aIGCWorkflowQuotaConfig = (Serializable) obj2;
        AIGCWorkflowNodeConfig aIGCWorkflowNodeConfig = (AIGCWorkflowNodeConfig) obj3;
        if (!(aIGCWorkflowQuotaConfig instanceof AIGCWorkflowQuotaConfig) || aIGCWorkflowQuotaConfig == null) {
            aIGCWorkflowQuotaConfig = new AIGCWorkflowQuotaConfig(false, 0);
        }
        return new C552890LmJ(str, aIGCWorkflowQuotaConfig, aIGCWorkflowNodeConfig, new C552000Lks());
    }

    public static final Object invoke$11(AFwS332S0000000_8 aFwS332S0000000_8, Object obj, Object obj2, Object obj3) {
        String str = (String) obj;
        Serializable c551950Lkn = (Serializable) obj2;
        AIGCWorkflowNodeConfig aIGCWorkflowNodeConfig = (AIGCWorkflowNodeConfig) obj3;
        if (!(c551950Lkn instanceof C551950Lkn) || c551950Lkn == null) {
            c551950Lkn = new C551950Lkn();
        }
        return new C552890LmJ(str, c551950Lkn, aIGCWorkflowNodeConfig, new C551780LkW());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004d A[PHI: r7 r9 r10
      0x004d: PHI (r7v11 com.ss.android.ugc.aweme.theater.model.AITheaterModel) = 
      (r7v2 com.ss.android.ugc.aweme.theater.model.AITheaterModel)
      (r7v12 com.ss.android.ugc.aweme.theater.model.AITheaterModel)
     binds: [B:23:0x004b, B:19:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x004d: PHI (r9v19 java.lang.String) = (r9v1 java.lang.String), (r9v20 java.lang.String) binds: [B:23:0x004b, B:19:0x0041] A[DONT_GENERATE, DONT_INLINE]
      0x004d: PHI (r10v9 com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo) = 
      (r10v1 com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo)
      (r10v10 com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo)
     binds: [B:23:0x004b, B:19:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051 A[PHI: r7 r9 r10
      0x0051: PHI (r7v10 com.ss.android.ugc.aweme.theater.model.AITheaterModel) = 
      (r7v2 com.ss.android.ugc.aweme.theater.model.AITheaterModel)
      (r7v11 com.ss.android.ugc.aweme.theater.model.AITheaterModel)
     binds: [B:23:0x004b, B:25:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x0051: PHI (r9v18 java.lang.String) = (r9v1 java.lang.String), (r9v19 java.lang.String) binds: [B:23:0x004b, B:25:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x0051: PHI (r10v8 com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo) = 
      (r10v1 com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo)
      (r10v9 com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo)
     binds: [B:23:0x004b, B:25:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0057 A[PHI: r6 r7 r9 r10
      0x0057: PHI (r6v0 com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC$AICreationSceneName) = 
      (r6v7 com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC$AICreationSceneName)
      (r6v8 com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC$AICreationSceneName)
     binds: [B:27:0x0055, B:25:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x0057: PHI (r7v3 com.ss.android.ugc.aweme.theater.model.AITheaterModel) = 
      (r7v10 com.ss.android.ugc.aweme.theater.model.AITheaterModel)
      (r7v11 com.ss.android.ugc.aweme.theater.model.AITheaterModel)
     binds: [B:27:0x0055, B:25:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x0057: PHI (r9v3 java.lang.String) = (r9v18 java.lang.String), (r9v19 java.lang.String) binds: [B:27:0x0055, B:25:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x0057: PHI (r10v2 com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo) = 
      (r10v8 com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo)
      (r10v9 com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo)
     binds: [B:27:0x0055, B:25:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005b A[PHI: r6 r7 r9 r10
      0x005b: PHI (r6v6 com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC$AICreationSceneName) = 
      (r6v0 com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC$AICreationSceneName)
      (r6v7 com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC$AICreationSceneName)
     binds: [B:29:0x0059, B:27:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x005b: PHI (r7v9 com.ss.android.ugc.aweme.theater.model.AITheaterModel) = 
      (r7v3 com.ss.android.ugc.aweme.theater.model.AITheaterModel)
      (r7v10 com.ss.android.ugc.aweme.theater.model.AITheaterModel)
     binds: [B:29:0x0059, B:27:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x005b: PHI (r9v17 java.lang.String) = (r9v3 java.lang.String), (r9v18 java.lang.String) binds: [B:29:0x0059, B:27:0x0055] A[DONT_GENERATE, DONT_INLINE]
      0x005b: PHI (r10v7 com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo) = 
      (r10v2 com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo)
      (r10v8 com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo)
     binds: [B:29:0x0059, B:27:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$12(kotlin.jvm.internal.AFwS332S0000000_8 r228, java.lang.Object r229, java.lang.Object r230, java.lang.Object r231) {
        /*
            Method dump skipped, instruction units count: 839
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AFwS332S0000000_8.invoke$12(kotlin.jvm.internal.AFwS332S0000000_8, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$13(AFwS332S0000000_8 aFwS332S0000000_8, Object obj, Object obj2, Object obj3) {
        Context context = (Context) obj;
        AIGCDraft aIGCDraft = (AIGCDraft) obj2;
        AwemeDraft awemeDraft = (AwemeDraft) obj3;
        C546340Lbk.LIZ.getClass();
        AITheaterModel aITheaterModel = awemeDraft.LIZ.aigcBusinessModel.aiTheaterModel;
        if (aITheaterModel != null) {
            aITheaterModel.getExtraModel().noBackToDraftBox = true;
            aITheaterModel.getExtraModel().hasSetRecallWay = true;
            aITheaterModel.getContextModel().aigcEntranceInfo = AIGCEntranceInfo.LIZ(aITheaterModel.getContextModel().aigcEntranceInfo, null, null, 0, null, null, false, false, true, null, null, null, null, aIGCDraft.aigcEntranceInfo.recallWay, null, false, false, 1040127);
        }
        C546010LbD.LIZ(aIGCDraft, awemeDraft.LIZ, Boolean.TRUE);
        C570560MZi.LJFF(C1388190mED.LIZ(context), awemeDraft, 13, System.currentTimeMillis(), null);
        return Unit.LIZ;
    }

    public static final Object invoke$14(AFwS332S0000000_8 aFwS332S0000000_8, Object obj, Object obj2, Object obj3) {
        C0M22 c0m22LIZIZ;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        ((Boolean) obj3).booleanValue();
        if (!zBooleanValue && (c0m22LIZIZ = C0M21.LIZIZ()) != null) {
            new C05JA(c0m22LIZIZ).LIZ();
        }
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$15(AFwS332S0000000_8 aFwS332S0000000_8, Object obj, Object obj2, Object obj3) {
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$16(AFwS332S0000000_8 aFwS332S0000000_8, Object obj, Object obj2, Object obj3) {
        return Unit.LIZ;
    }

    public static final Object invoke$17(AFwS332S0000000_8 aFwS332S0000000_8, Object obj, Object obj2, Object obj3) throws Throwable {
        AwemeDraft awemeDraft;
        Context context = (Context) obj;
        AIGCDraft aIGCDraft = (AIGCDraft) obj3;
        C546380Lbo.LIZ.getClass();
        Object objLJ = C23250099c.LJ(C23271099x.INSTANCE, new C0LOD(aIGCDraft, null));
        if ((objLJ instanceof AwemeDraft) && (awemeDraft = (AwemeDraft) objLJ) != null) {
            C546380Lbo.LIZ(context, aIGCDraft, awemeDraft);
        } else {
            C0LOG.LIZ(context);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$18(AFwS332S0000000_8 aFwS332S0000000_8, Object obj, Object obj2, Object obj3) {
        C546380Lbo.LIZ.getClass();
        C546380Lbo.LIZ((Context) obj, (AIGCDraft) obj2, (AwemeDraft) obj3);
        return Unit.LIZ;
    }

    public static final Object invoke$19(AFwS332S0000000_8 aFwS332S0000000_8, Object obj, Object obj2, Object obj3) {
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C0LOL((Context) obj, (CameoDraft) obj2, (AIGCEntranceInfo) obj3, null), 3);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AFwS332S0000000_8 aFwS332S0000000_8, Object obj, Object obj2, Object obj3) {
        List<MediaModel> listSubList;
        C535700Kzg c535700Kzg = (C535700Kzg) obj2;
        C535700Kzg c535700Kzg2 = (C535700Kzg) obj3;
        int i = C0LJ0.LJIIIIZZ;
        if (c535700Kzg != null && (listSubList = c535700Kzg.LIZIZ) != null) {
            if (listSubList.size() >= i) {
                listSubList = listSubList.subList(0, i);
            }
            if (c535700Kzg2 != null) {
                return C535700Kzg.LIZ(c535700Kzg2, listSubList);
            }
            return null;
        }
        return null;
    }

    public static final Object invoke$20(AFwS332S0000000_8 aFwS332S0000000_8, Object obj, Object obj2, Object obj3) {
        InterfaceC1680500tpg interfaceC1680500tpg = (InterfaceC1680500tpg) obj2;
        if ((((Number) obj3).intValue() & 17) == 16 && interfaceC1680500tpg.LIZ()) {
            interfaceC1680500tpg.LIZJ();
        } else {
            C1665790tRx.LIZ(c.LJI(InterfaceC1685750ty9.LIZ, 16), interfaceC1680500tpg);
        }
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$3(AFwS332S0000000_8 aFwS332S0000000_8, Object obj, Object obj2, Object obj3) {
        return Unit.LIZ;
    }

    public static final Object invoke$4(AFwS332S0000000_8 aFwS332S0000000_8, Object obj, Object obj2, Object obj3) {
        String str = (String) obj;
        Serializable aIGCWorkflowServerConfig = (Serializable) obj2;
        AIGCWorkflowNodeConfig aIGCWorkflowNodeConfig = (AIGCWorkflowNodeConfig) obj3;
        if (!(aIGCWorkflowServerConfig instanceof AIGCWorkflowServerConfig) || aIGCWorkflowServerConfig == null) {
            aIGCWorkflowServerConfig = new AIGCWorkflowServerConfig(false);
        }
        return new C552890LmJ(str, aIGCWorkflowServerConfig, aIGCWorkflowNodeConfig, new C551980Lkq());
    }

    public static final Object invoke$5(AFwS332S0000000_8 aFwS332S0000000_8, Object obj, Object obj2, Object obj3) {
        String str = (String) obj;
        Serializable c551940Lkm = (Serializable) obj2;
        AIGCWorkflowNodeConfig aIGCWorkflowNodeConfig = (AIGCWorkflowNodeConfig) obj3;
        if (!(c551940Lkm instanceof C551940Lkm) || c551940Lkm == null) {
            c551940Lkm = new C551940Lkm();
        }
        return new C552890LmJ(str, c551940Lkm, aIGCWorkflowNodeConfig, new C551990Lkr());
    }

    public static final Object invoke$6(AFwS332S0000000_8 aFwS332S0000000_8, Object obj, Object obj2, Object obj3) {
        String str = (String) obj;
        Serializable aIGCWorkflowDownloadConfig = (Serializable) obj2;
        AIGCWorkflowNodeConfig aIGCWorkflowNodeConfig = (AIGCWorkflowNodeConfig) obj3;
        if (!(aIGCWorkflowDownloadConfig instanceof AIGCWorkflowDownloadConfig) || aIGCWorkflowDownloadConfig == null) {
            aIGCWorkflowDownloadConfig = new AIGCWorkflowDownloadConfig(null, 3, 3);
        }
        return new C552890LmJ(str, aIGCWorkflowDownloadConfig, aIGCWorkflowNodeConfig, new C552040Lkw());
    }

    public static final Object invoke$7(AFwS332S0000000_8 aFwS332S0000000_8, Object obj, Object obj2, Object obj3) {
        String str = (String) obj;
        Serializable aIGCWorkflowPollingConfig = (Serializable) obj2;
        AIGCWorkflowNodeConfig aIGCWorkflowNodeConfig = (AIGCWorkflowNodeConfig) obj3;
        if (!(aIGCWorkflowPollingConfig instanceof AIGCWorkflowPollingConfig) || aIGCWorkflowPollingConfig == null) {
            aIGCWorkflowPollingConfig = new AIGCWorkflowPollingConfig(Integer.valueOf((int) TimeUnit.MINUTES.toSeconds(C0LNQ.LIZ())), Integer.valueOf(C543920LUw.LIZ()), false);
        }
        return new C552890LmJ(str, aIGCWorkflowPollingConfig, aIGCWorkflowNodeConfig, new C551760LkU());
    }

    public static final Object invoke$8(AFwS332S0000000_8 aFwS332S0000000_8, Object obj, Object obj2, Object obj3) {
        String str = (String) obj;
        Serializable i2VOfflineProcessingTemplateDownloadConfig = (Serializable) obj2;
        AIGCWorkflowNodeConfig aIGCWorkflowNodeConfig = (AIGCWorkflowNodeConfig) obj3;
        if (!(i2VOfflineProcessingTemplateDownloadConfig instanceof I2VOfflineProcessingTemplateDownloadConfig) || i2VOfflineProcessingTemplateDownloadConfig == null) {
            i2VOfflineProcessingTemplateDownloadConfig = new I2VOfflineProcessingTemplateDownloadConfig(null);
        }
        return new C552890LmJ(str, i2VOfflineProcessingTemplateDownloadConfig, aIGCWorkflowNodeConfig, new C551630LkH());
    }

    public static final Object invoke$9(AFwS332S0000000_8 aFwS332S0000000_8, Object obj, Object obj2, Object obj3) {
        String str = (String) obj;
        Serializable i2VOfflineProcessingPostProcessingConfig = (Serializable) obj2;
        AIGCWorkflowNodeConfig aIGCWorkflowNodeConfig = (AIGCWorkflowNodeConfig) obj3;
        if (!(i2VOfflineProcessingPostProcessingConfig instanceof I2VOfflineProcessingPostProcessingConfig) || i2VOfflineProcessingPostProcessingConfig == null) {
            i2VOfflineProcessingPostProcessingConfig = new I2VOfflineProcessingPostProcessingConfig(null, true);
        }
        return new C552890LmJ(str, i2VOfflineProcessingPostProcessingConfig, aIGCWorkflowNodeConfig, new C551590LkD());
    }
}
