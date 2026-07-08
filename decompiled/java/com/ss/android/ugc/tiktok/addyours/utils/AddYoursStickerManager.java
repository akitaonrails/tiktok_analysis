package com.ss.android.ugc.tiktok.addyours.utils;

import X.C14EU;
import X.C1720106oR;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C737030Svd;
import android.util.LruCache;
import com.ss.android.ugc.aweme.addyours.model.AddYoursStickerStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.story.publish.ISocialPublishBridgeService;
import com.ss.android.ugc.aweme.story.publish.SocialPublishCallback;
import com.ss.android.ugc.tiktok.addyours.utils.AddYoursStickerManager;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS229S0000000_2;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: loaded from: classes4.dex */
public final class AddYoursStickerManager {
    public static final AddYoursStickerManager LIZ;
    public static final LruCache<Long, AddYoursStickerStruct> LIZIZ;
    public static final LruCache<String, AddYoursStickerStruct> LIZJ;

    static {
        AddYoursStickerManager addYoursStickerManager = new AddYoursStickerManager();
        LIZ = addYoursStickerManager;
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("AddYoursStickerManager", "observePublishStatus");
        ((ISocialPublishBridgeService) ServiceManager.get().getService(ISocialPublishBridgeService.class)).Kg(new SocialPublishCallback() { // from class: X.09QP
            @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
            public final void onPublishCanceled(PublishModel publishModel, AbstractC1433460nPE abstractC1433460nPE, Object obj) {
            }

            @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
            public final void onPublishFailed(PublishModel publishModel, C1434650nR9 c1434650nR9, String str) {
            }

            @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
            public final void onPublishProgress(int i2, C1434900nRY c1434900nRY) {
            }

            @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
            public final void onPublishStart(PublishModel publishModel) {
            }

            @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
            public final void onReadyToCreateAweme(PublishModel publishModel) {
            }

            @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
            public final void onReportPublish() {
            }

            @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
            public final void onSynthesisSuccess(PublishModel publishModel, String str) {
            }

            @Override // com.ss.android.ugc.aweme.story.publish.SocialPublishCallback
            public final void onPublishSuccess(PublishModel publishModel, CreateAwemeResponse createAwemeResponse) {
                String str;
                AddYoursStickerStruct addYoursStickerStruct;
                Long topicId;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("trigger by: onPublishSuccess, shootWay=");
                InteractStickerStruct interactStickerStruct = null;
                if (publishModel != null) {
                    str = publishModel.shootWay;
                } else {
                    str = null;
                }
                sbLIZ.append(str);
                C1720106oR.LJI("AddYoursStickerManager", C2188811AlT.LIZIZ(sbLIZ));
                AddYoursStickerManager addYoursStickerManager2 = AddYoursStickerManager.LIZ;
                Aweme aweme = createAwemeResponse.aweme;
                addYoursStickerManager2.getClass();
                int i2 = C2187451AjH.LIZ;
                C1720106oR.LJI("AddYoursStickerManager", "handleVideoPublish");
                List<InteractStickerStruct> interactStickerStructs = aweme.getInteractStickerStructs();
                if (interactStickerStructs != null) {
                    Iterator<InteractStickerStruct> it2 = interactStickerStructs.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        InteractStickerStruct next = it2.next();
                        if (next.getAddYoursStickerStruct() != null) {
                            interactStickerStruct = next;
                            break;
                        }
                    }
                    InteractStickerStruct interactStickerStruct2 = interactStickerStruct;
                    if (interactStickerStruct2 != null && (addYoursStickerStruct = interactStickerStruct2.getAddYoursStickerStruct()) != null && (topicId = addYoursStickerStruct.getTopicId()) != null) {
                        AddYoursStickerManager.LIZIZ.put(Long.valueOf(topicId.longValue()), addYoursStickerStruct);
                    }
                }
            }
        }, AFwS229S0000000_2.get$arr$(585));
        EventBus.LIZLLL().LJIJJ(addYoursStickerManager);
        LIZIZ = new LruCache<>(50);
        LIZJ = new LruCache<>(50);
    }

    @C14EU
    public final void onVideoEvent(C737030Svd c737030Svd) {
        Integer numValueOf;
        Object obj;
        AddYoursStickerStruct addYoursStickerStruct;
        Long topicId;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onVideoEvent, eventType=");
        InteractStickerStruct interactStickerStruct = null;
        if (c737030Svd != null) {
            numValueOf = Integer.valueOf(c737030Svd.LIZ);
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C1720106oR.LJI("AddYoursStickerManager", C2188811AlT.LIZIZ(sbLIZ));
        if (c737030Svd != null && (obj = c737030Svd.LIZIZ) != null && c737030Svd.LIZ == 2 && (obj instanceof Aweme)) {
            int i = C2187451AjH.LIZ;
            C1720106oR.LJI("AddYoursStickerManager", "handleVideoDelete by aweme with sticker");
            List<InteractStickerStruct> interactStickerStructs = ((Aweme) obj).getInteractStickerStructs();
            if (interactStickerStructs != null) {
                Iterator<InteractStickerStruct> it2 = interactStickerStructs.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    InteractStickerStruct next = it2.next();
                    if (next.getAddYoursStickerStruct() != null) {
                        interactStickerStruct = next;
                        break;
                    }
                }
                InteractStickerStruct interactStickerStruct2 = interactStickerStruct;
                if (interactStickerStruct2 != null && (addYoursStickerStruct = interactStickerStruct2.getAddYoursStickerStruct()) != null && (topicId = addYoursStickerStruct.getTopicId()) != null) {
                    LIZIZ.put(Long.valueOf(topicId.longValue()), addYoursStickerStruct);
                }
            }
        }
    }
}
