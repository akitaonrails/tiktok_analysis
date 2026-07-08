package com.ss.android.ugc.aweme.theater.creation.generation.scene;

import X.AbstractC214814194y;
import X.C01GW;
import X.C0ET4;
import X.C0LOK;
import X.C0MXX;
import X.C13BV;
import X.C14K9;
import X.C1659700tI8;
import X.C1697810uHb;
import X.C1DRF;
import X.C2188811AlT;
import X.C452501pT;
import X.C539960LFq;
import X.C546890Lcd;
import X.C547670Ldt;
import X.C547860LeC;
import X.C547930LeJ;
import X.C547980LeO;
import X.C548370Lf1;
import X.C548430Lf7;
import X.C548470LfB;
import X.C548790Lfh;
import X.C549550Lgv;
import X.C549780LhI;
import X.C549790LhJ;
import X.C549800LhK;
import X.C549820LhM;
import X.C549840LhO;
import X.C549860LhQ;
import X.C550040Lhi;
import X.C555350LqH;
import X.C559610Lx9;
import X.C560750Lyz;
import X.C569160MTy;
import X.EnumC1642750sqn;
import X.InterfaceC546090LbL;
import X.InterfaceC548440Lf8;
import X.InterfaceC548460LfA;
import X.InterfaceC548570LfL;
import X.InterfaceC548750Lfd;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.ss.android.ugc.aweme.aigc.asynctask.experiment.aicreation.AITheaterGenerateConfigExp;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo;
import com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC;
import com.ss.android.ugc.aweme.aiuikit.api.pages.loading.AIGCLoadingScene;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCBusinessModelSet;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import com.ss.android.ugc.aweme.theater.model.AITheaterConsumptionModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterCreationModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterGenerationModel;
import com.ss.android.ugc.aweme.theater.model.AITheaterModel;
import com.ss.android.ugc.aweme.theater.service.IAITheaterCreationLauncher;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import jg5.AvS540S0100000_8;
import kotlin.Pair;
import kotlin.jvm.internal.AwS374S0200000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AITheaterGenerationRootScene extends AIGCLoadingScene {
    public final C01GW LLJZIJLIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 423));
    public final C0LOK LLL = C0LOK.LIZ;
    public final String LLLF = "AITheaterGenerationRootScene";

    @Override // com.ss.android.ugc.aweme.aiuikit.api.pages.loading.AIGCLoadingScene
    public final C549840LhO LLLLLLLZIL() {
        C549840LhO c549840LhO = new C549840LhO();
        c549840LhO.showDraftButton(!Intrinsics.LJFF(LLLLZ().entranceInfo != null ? r0.sceneName : null, AIGC.AICreationSceneName.DRAFT.INSTANCE));
        return c549840LhO;
    }

    @Override // com.ss.android.ugc.aweme.aiuikit.api.pages.loading.AIGCLoadingScene
    public final C549780LhI LLLLLLZ() {
        List<String> listLJIIJJI;
        AIGCBusinessModelSet aIGCBusinessModelSet;
        AITheaterModel aITheaterModel;
        AITheaterCreationModel creationModel;
        AITheaterGenerationModel aITheaterGenerationModel;
        C549780LhI c549780LhI = new C549780LhI();
        Pair<String, List<MentionDataItem>> pairLLLLZIL = LLLLZIL();
        c549780LhI.showRedDot(true);
        c549780LhI.showAvatarAnimation(true);
        c549780LhI.showTextRotation(true);
        C0MXX c0mxx = new C0MXX();
        List<MentionDataItem> second = pairLLLLZIL.getSecond();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = second.iterator();
        while (it2.hasNext()) {
            String str = ((MentionDataItem) it2.next()).iconUrl;
            if (str != null) {
                arrayList.add(str);
            }
        }
        c0mxx.avatars(arrayList);
        c0mxx.showLimit(3);
        c0mxx.showHollowContent(false);
        c549780LhI.avatarConfig(c0mxx);
        List<MentionDataItem> second2 = pairLLLLZIL.getSecond();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it3 = second2.iterator();
        while (it3.hasNext()) {
            String str2 = ((MentionDataItem) it3.next()).name;
            if (str2 != null) {
                arrayList2.add(str2);
            }
        }
        c549780LhI.usernames(arrayList2);
        int size = arrayList2.size();
        if (size == 1) {
            String[] strArr = (String[]) arrayList2.toArray(new String[0]);
            listLJIIJJI = C1697810uHb.LJIIJJI(getString(2131826189), getString(2131826190, Arrays.copyOf(strArr, strArr.length)), getString(2131826191));
        } else if (size != 2) {
            listLJIIJJI = C1697810uHb.LJIIJJI(getString(2131826195), getString(2131826196), getString(2131826197));
        } else {
            String[] strArr2 = (String[]) arrayList2.toArray(new String[0]);
            listLJIIJJI = C1697810uHb.LJIIJJI(getString(2131826192), getString(2131826193, Arrays.copyOf(strArr2, strArr2.length)), getString(2131826194));
        }
        c549780LhI.textRotationActions(listLJIIJJI);
        CreativeModel creativeModel = LLLLZ().creativeModel;
        if (creativeModel != null && (aIGCBusinessModelSet = creativeModel.aigcBusinessModel) != null && (aITheaterModel = aIGCBusinessModelSet.aiTheaterModel) != null && (creationModel = aITheaterModel.getCreationModel()) != null && (aITheaterGenerationModel = creationModel.generationModel) != null) {
            c549780LhI.startProgress(aITheaterGenerationModel.getProgress());
            C547670Ldt c547670Ldt = C547670Ldt.LIZ;
            Context contextRequireSceneContext = requireSceneContext();
            long jUs = aITheaterGenerationModel.us();
            long jT1 = aITheaterGenerationModel.T1();
            c547670Ldt.getClass();
            c549780LhI.startRemainTime(new Pair<>(Long.valueOf(aITheaterGenerationModel.us()), C547670Ldt.LIZJ(contextRequireSceneContext, jUs, jT1)));
        }
        return c549780LhI;
    }

    @Override // com.ss.android.ugc.aweme.aiuikit.api.pages.loading.AIGCLoadingScene
    public final C549820LhM LLLLLLZZ() {
        C549820LhM c549820LhM = new C549820LhM();
        AIGCEntranceInfo aIGCEntranceInfo = LLLLZ().entranceInfo;
        boolean z = !Intrinsics.LJFF(aIGCEntranceInfo != null ? aIGCEntranceInfo.sceneName : null, AIGC.AICreationSceneName.DRAFT.INSTANCE);
        c549820LhM.shouldShowRetentionDialog(z);
        if (z) {
            c549820LhM.retentionDialogTextConfig(new C555350LqH(C547930LeJ.LIZ(2131826213, new Object[0]), C547930LeJ.LIZ(2131826212, new Object[0]), C547930LeJ.LIZ(2131826210, new Object[0]), C547930LeJ.LIZ(2131826211, new Object[0])));
        }
        return c549820LhM;
    }

    @Override // com.ss.android.ugc.aweme.aiuikit.api.pages.loading.AIGCLoadingScene
    public final C549800LhK LLLLLZ() {
        C549800LhK c549800LhK = new C549800LhK();
        Pair<String, List<MentionDataItem>> pairLLLLZIL = LLLLZIL();
        C547860LeC.LIZ.getClass();
        String strLIZ = C547860LeC.LJI().LIZ(C548430Lf7.LIZ);
        c549800LhK.placeHolderDrawable(strLIZ != null ? Drawable.createFromPath(strLIZ) : null);
        AITheaterGenerateConfigExp.AITheaterGenerateConfig aITheaterGenerateConfigLIZ = AITheaterGenerateConfigExp.LIZ();
        c549800LhK.showOverlayLottie(!aITheaterGenerateConfigLIZ.disableLoadingPageLottie);
        String strLIZ2 = C547860LeC.LJI().LIZ(C549860LhQ.LIZIZ);
        if (strLIZ2 != null) {
            c549800LhK.lottieResFilePath(strLIZ2);
        }
        if (!aITheaterGenerateConfigLIZ.disableLoadingPagePlayVideo) {
            c549800LhK.videoUrl(pairLLLLZIL.getFirst());
        }
        return c549800LhK;
    }

    public final AITheaterModel LLLLLZL() {
        C569160MTy c569160MTy = C569160MTy.LIZ;
        IAITheaterCreationLauncher.EnterParams enterParamsLLLLZ = LLLLZ();
        c569160MTy.getClass();
        AITheaterModel aITheaterModel = C569160MTy.LIZ(enterParamsLLLLZ, false).aigcBusinessModel.aiTheaterModel;
        return aITheaterModel == null ? new AITheaterModel(null, null, null, null, 15, null) : aITheaterModel;
    }

    public final IAITheaterCreationLauncher.EnterParams LLLLZ() {
        return (IAITheaterCreationLauncher.EnterParams) this.LLJZIJLIL.getValue();
    }

    @Override // com.ss.android.ugc.aweme.aiuikit.api.pages.loading.AIGCLoadingScene
    public final InterfaceC548750Lfd LLLLLLL() {
        InterfaceC548750Lfd interfaceC548750LfdLIZ = C548790Lfh.LIZ(LLLLLZL(), LLLLZ());
        CreativeModel creativeModel = LLLLZ().creativeModel;
        if (creativeModel != null) {
            interfaceC548750LfdLIZ = C548790Lfh.LIZ(interfaceC548750LfdLIZ, new C549790LhJ(creativeModel));
        }
        if (interfaceC548750LfdLIZ != null) {
            return interfaceC548750LfdLIZ;
        }
        "Required value was null.".toString();
        throw new IllegalStateException("Required value was null.");
    }

    public final Pair<String, List<MentionDataItem>> LLLLZIL() {
        List<MentionDataItem> listLIZJ = C547980LeO.LIZJ(LLLLLZL());
        if (listLIZJ == null) {
            return new Pair<>(null, C13BV.INSTANCE);
        }
        AITheaterConsumptionModel aITheaterConsumptionModel = LLLLZ().consumptionModel;
        return new Pair<>(aITheaterConsumptionModel != null ? aITheaterConsumptionModel.videoUrl : null, listLIZJ);
    }

    @Override // com.ss.android.ugc.aweme.aiuikit.api.pages.base.AIGCBaseScene
    public final InterfaceC546090LbL LLLLLIL() {
        return this.LLL;
    }

    @Override // com.ss.android.ugc.aweme.aiuikit.api.pages.base.AIGCBaseScene
    public final String LLLLLL() {
        return this.LLLF;
    }

    @Override // com.ss.android.ugc.aweme.aiuikit.api.pages.loading.AIGCLoadingScene, com.ss.android.ugc.aweme.aiuikit.api.pages.base.AIGCBaseScene
    public final void LLLLJI(C539960LFq c539960LFq) {
        AIGC.AICreationSceneName aICreationSceneName;
        AIGCBusinessModelSet aIGCBusinessModelSet;
        AITheaterModel aITheaterModel;
        AITheaterCreationModel creationModel;
        super.LLLLJI(c539960LFq);
        View view = this.mView;
        if (!view.getFitsSystemWindows()) {
            C14K9.LJIJJ(view, C560750Lyz.LL);
        }
        EnumC1642750sqn enumC1642750sqn = EnumC1642750sqn.IMMEDIATE;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("register component ");
        sbLIZ.append(C548470LfB.class.getName());
        sbLIZ.append(" api ");
        sbLIZ.append(InterfaceC548570LfL.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        c539960LFq.LIZ.LIZ(c539960LFq.LIZIZ, enumC1642750sqn, null, InterfaceC548570LfL.class, C548470LfB.class, new AwS374S0200000_8(new C0ET4(), (C559610Lx9) c539960LFq, (AbstractC214814194y) this, 87));
        AIGCEntranceInfo aIGCEntranceInfo = LLLLZ().entranceInfo;
        if (aIGCEntranceInfo != null) {
            aICreationSceneName = aIGCEntranceInfo.sceneName;
        } else {
            aICreationSceneName = null;
        }
        if (!Intrinsics.LJFF(aICreationSceneName, AIGC.AICreationSceneName.DRAFT.INSTANCE)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("register component ");
            sbLIZ2.append(C548370Lf1.class.getName());
            sbLIZ2.append(" api ");
            sbLIZ2.append(InterfaceC548460LfA.class.getName());
            C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
            c539960LFq.LIZ.LIZ(c539960LFq.LIZIZ, enumC1642750sqn, null, InterfaceC548460LfA.class, C548370Lf1.class, new AwS374S0200000_8(new C0ET4(), (C559610Lx9) c539960LFq, this, 88));
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("register component ");
        sbLIZ3.append(C550040Lhi.class.getName());
        sbLIZ3.append(" api ");
        sbLIZ3.append(InterfaceC548440Lf8.class.getName());
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
        c539960LFq.LIZ.LIZ(c539960LFq.LIZIZ, enumC1642750sqn, null, InterfaceC548440Lf8.class, C550040Lhi.class, new AwS374S0200000_8(new C0ET4(), (C559610Lx9) c539960LFq, (AbstractC214814194y) this, 89));
        C569160MTy c569160MTy = C569160MTy.LIZ;
        IAITheaterCreationLauncher.EnterParams enterParamsLLLLZ = LLLLZ();
        c569160MTy.getClass();
        C569160MTy.LIZ(enterParamsLLLLZ, false);
        CreativeModel creativeModel = LLLLZ().creativeModel;
        if (creativeModel != null && (aIGCBusinessModelSet = creativeModel.aigcBusinessModel) != null && (aITheaterModel = aIGCBusinessModelSet.aiTheaterModel) != null && (creationModel = aITheaterModel.getCreationModel()) != null) {
            C546890Lcd.LIZ.getClass();
            C546890Lcd.LIZ().mw(c539960LFq, creationModel);
        }
    }

    @Override // com.ss.android.ugc.aweme.aiuikit.api.pages.base.AIGCBaseScene
    public final void LLLLL(C1DRF c1drf) {
        c1drf.LJFF(C549550Lgv.class, null, new AvS540S0100000_8(this, 169));
        c1drf.LJFF(InterfaceC548750Lfd.class, null, new AvS540S0100000_8(this, 170));
        c1drf.LJFF(IAITheaterCreationLauncher.EnterParams.class, null, new AvS540S0100000_8(this, 120));
        c1drf.LJFF(Context.class, null, new AvS540S0100000_8(this, 121));
    }
}
