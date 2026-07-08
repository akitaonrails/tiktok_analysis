package com.ss.android.ugc.tools.entry.anchor;

import X.C1388500mEi;
import X.C15438062q;
import X.C1727006pY;
import X.C19751912Pt;
import X.C19EG;
import X.InterfaceC21300818Xm;
import X.InterfaceC522520KeQ;
import android.content.Intent;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenConsumptionModel;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenModel;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenNode;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenNodeSrcInfo;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenPrompt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.tools.IAiChatFeatureService;
import java.util.ArrayList;
import java.util.UUID;
import kotlin.jvm.internal.AwS582S0100000_3;

/* JADX INFO: loaded from: classes33.dex */
public final class AiChatAnchorChosenResultImpl implements InterfaceC522520KeQ {
    public final C19EG LL;

    @Override // X.InterfaceC522520KeQ
    public final void LIZIZ(AwS582S0100000_3 awS582S0100000_3) {
    }

    @Override // X.InterfaceC522520KeQ
    public final void LJJLIIIJJIZ() {
    }

    public AiChatAnchorChosenResultImpl(C19EG c19eg) {
        this.LL = c19eg;
    }

    @Override // X.InterfaceC522520KeQ
    public final void LIZ(int i, int i2, Intent intent) {
        ArrayList<MediaModel> parcelableArrayListExtra;
        ShortVideoContext shortVideoContext;
        AIChatGenModel aIChatGenModel;
        AIChatGenConsumptionModel aIChatGenConsumptionModel;
        InterfaceC21300818Xm interfaceC21300818XmLIZ;
        if (i2 == -1 && (parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data")) != null && (shortVideoContext = (ShortVideoContext) intent.getParcelableExtra("key_short_video_context")) != null && (aIChatGenModel = shortVideoContext.creativeModel.aiChatGenModel) != null && (aIChatGenConsumptionModel = aIChatGenModel.consumptionModel) != null) {
            ArrayList<MediaModel> arrayList = new ArrayList(C15438062q.LJIJJ(parcelableArrayListExtra, 10));
            for (MediaModel mediaModel : parcelableArrayListExtra) {
                shortVideoContext.getCreationId();
                C1388500mEi.LIZIZ(mediaModel);
                arrayList.add(mediaModel);
            }
            AIChatGenPrompt aIChatGenPrompt = aIChatGenConsumptionModel.prompt;
            int i3 = aIChatGenConsumptionModel.originImageCount;
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            for (MediaModel mediaModel2 : arrayList) {
                arrayList2.add(new AIChatGenNodeSrcInfo(C1388500mEi.LIZ(mediaModel2), mediaModel2.width, mediaModel2.height));
            }
            AIChatGenNode aIChatGenNode = new AIChatGenNode(UUID.randomUUID().toString(), null, aIChatGenPrompt, arrayList2, Integer.valueOf(i3), null, null, null, null, null, null, 0, null, null, null, null, null, null, null);
            C19751912Pt c19751912Pt = C19751912Pt.LIZ;
            String creationId = shortVideoContext.creativeInfo.getCreationId();
            int size = arrayList.size();
            String str = aIChatGenConsumptionModel.enterMethod;
            C1727006pY.LIZ.getClass();
            int iLIZIZ = C1727006pY.LIZIZ();
            c19751912Pt.getClass();
            C19751912Pt.LIZIZ(creationId, size, "visual_poet_anchor", str, iLIZIZ, null, null);
            IAiChatFeatureService iAiChatFeatureService = (IAiChatFeatureService) PluggableExtentionKt.pluggableSpi$default(IAiChatFeatureService.class, false, false, false, 14, null);
            if (iAiChatFeatureService != null && (interfaceC21300818XmLIZ = iAiChatFeatureService.LIZ()) != null) {
                interfaceC21300818XmLIZ.LJFF(this.LL, aIChatGenConsumptionModel, aIChatGenNode, shortVideoContext.creativeInfo.getCreationId());
            }
            this.LL.getLifecycle().addObserver(new AiChatAnchorChosenResultImpl$onChosenResult$1(this));
        }
    }
}
