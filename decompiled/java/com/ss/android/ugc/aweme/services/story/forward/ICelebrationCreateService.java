package com.ss.android.ugc.aweme.services.story.forward;

import X.InterfaceC1364105Vn;
import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public interface ICelebrationCreateService {
    boolean checkMaterialReady(int i, boolean z);

    boolean checkRenderVideoReady(int i);

    void clearKevaForDebug();

    HashMap<String, Object> getCelebrationMaterialInboxRequestParam();

    List<ForwardMedia> getForwardMediasAndCreateTemplateSegment(int i);

    Pair<String, String> getMaterialLocalPath(ForwardMedia forwardMedia, int i, String str);

    /* JADX INFO: renamed from: getRenderVideoInfo-IoAF18A, reason: not valid java name */
    Object mo315getRenderVideoInfoIoAF18A(int i);

    List<Integer> getTodayCelebrationList();

    boolean isEoYOngoingToday();

    void loadCelebrationMaterial(Context context, int i);

    void mobCelebrationPushStatus(int i, long j, long j2, int i2);

    void preloadCelebrationAndMaterial(Context context);

    void recordTodayExitCelebration(int i);

    Object reportCelebrationEvent(int i, int i2, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    Object syncRequestCelebrationMaterial(Context context, int i, int i2, int i3, boolean z, InterfaceC1364105Vn<? super RequestCelebrationMaterialResult> interfaceC1364105Vn);

    public static final class DefaultImpls {
        public static /* synthetic */ boolean checkMaterialReady$default(ICelebrationCreateService iCelebrationCreateService, int i, boolean z, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 2) != 0) {
                    z = false;
                }
                return iCelebrationCreateService.checkMaterialReady(i, z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkMaterialReady");
        }
    }
}
