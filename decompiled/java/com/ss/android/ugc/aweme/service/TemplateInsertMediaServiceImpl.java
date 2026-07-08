package com.ss.android.ugc.aweme.service;

import X.C0CHQ;
import X.C294050Bfn;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.interfaces.ITemplateInsertMediaService;
import com.ss.android.vesdk.VEUtils;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class TemplateInsertMediaServiceImpl implements ITemplateInsertMediaService {
    @Override // com.ss.android.ugc.aweme.interfaces.ITemplateInsertMediaService
    public final void LIZ(NLETrackSlot nLETrackSlot) {
        NLEResType resourceType;
        String resourceFile;
        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
        if (nLESegmentVideoDynamicCast != null) {
            NLEResourceNode resource = nLESegmentVideoDynamicCast.getResource();
            if (resource != null) {
                resourceType = resource.getResourceType();
            } else {
                resourceType = null;
            }
            if (resourceType == NLEResType.VIDEO) {
                NLEResourceNode resource2 = nLESegmentVideoDynamicCast.getResource();
                if (resource2 == null || (resourceFile = resource2.getResourceFile()) == null) {
                    resourceFile = "";
                }
                Boolean boolHasOriginAudioFromCache = C0CHQ.LIZ().LJIILL().hasOriginAudioFromCache(resourceFile);
                boolean z = true;
                boolean z2 = false;
                if (C294050Bfn.LIZ()) {
                    if (boolHasOriginAudioFromCache == null) {
                        List<VEUtils.VEAudioFileInfo> audioFileInfoForAllTracks = VEUtils.getAudioFileInfoForAllTracks(resourceFile);
                        if ((audioFileInfoForAllTracks instanceof Collection) && audioFileInfoForAllTracks.isEmpty()) {
                            z = false;
                            boolHasOriginAudioFromCache = Boolean.valueOf(z);
                        } else {
                            Iterator<VEUtils.VEAudioFileInfo> it2 = audioFileInfoForAllTracks.iterator();
                            while (it2.hasNext()) {
                                if (it2.next().duration != 0) {
                                    break;
                                }
                            }
                            z = false;
                            boolHasOriginAudioFromCache = Boolean.valueOf(z);
                        }
                    }
                } else if (boolHasOriginAudioFromCache == null) {
                    List<VEUtils.VEAudioFileInfo> audioFileInfoForAllTracks2 = VEUtils.getAudioFileInfoForAllTracks(resourceFile);
                    if (audioFileInfoForAllTracks2 == null || audioFileInfoForAllTracks2.isEmpty()) {
                        z2 = true;
                    }
                    boolHasOriginAudioFromCache = Boolean.valueOf(!z2);
                }
                NLEResourceAV nLEResourceAVDynamicCast = NLEResourceAV.dynamicCast((NLENode) nLESegmentVideoDynamicCast.getResource());
                if (nLEResourceAVDynamicCast != null) {
                    nLEResourceAVDynamicCast.setHasAudio(boolHasOriginAudioFromCache.booleanValue());
                }
                C0CHQ.LIZ().LJIILL().updateVideoOriginAudioCache(resourceFile);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static kotlin.Pair LIZJ(float r8, com.bytedance.ies.nle.editor_jni.NLETrackSlot r9) {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.service.TemplateInsertMediaServiceImpl.LIZJ(float, com.bytedance.ies.nle.editor_jni.NLETrackSlot):kotlin.Pair");
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x09ae A[PHI: r1
      0x09ae: PHI (r1v23 java.lang.String) = (r1v15 java.lang.String), (r1v20 java.lang.String) binds: [B:137:0x03f5, B:332:0x0916] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:369:0x09b9 A[PHI: r4
      0x09b9: PHI (r4v7 com.ss.android.vesdk.VEUtils$VEVideoFileInfo) = (r4v6 com.ss.android.vesdk.VEUtils$VEVideoFileInfo), (r4v8 com.ss.android.vesdk.VEUtils$VEVideoFileInfo) binds: [B:133:0x03e9, B:368:0x09b7] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.interfaces.ITemplateInsertMediaService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(java.lang.Integer r20, com.bytedance.ies.nle.editor_jni.NLETemplateModel r21, long r22, long r24, com.bytedance.ies.nle.editor_jni.NLETrackSlot r26) {
        /*
            Method dump skipped, instruction units count: 2527
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.service.TemplateInsertMediaServiceImpl.LIZIZ(java.lang.Integer, com.bytedance.ies.nle.editor_jni.NLETemplateModel, long, long, com.bytedance.ies.nle.editor_jni.NLETrackSlot):void");
    }
}
