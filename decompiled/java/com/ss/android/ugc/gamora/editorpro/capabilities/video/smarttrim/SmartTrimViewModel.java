package com.ss.android.ugc.gamora.editorpro.capabilities.video.smarttrim;

import X.AbstractC349500Dn2;
import X.C0E48;
import X.C0EVZ;
import X.C13LP;
import X.C1697810uHb;
import X.C349470Dmz;
import X.C349510Dn3;
import X.C350110Do1;
import X.C350410DoV;
import X.C350870DpF;
import X.C351220Dpo;
import X.C351500DqG;
import X.C351510DqH;
import X.C356700Dye;
import X.C357280Dza;
import X.EnumC356070Dxd;
import X.InterfaceC355360DwU;
import X.InterfaceC361710EGb;
import android.util.Size;
import com.bytedance.als.ui.state.LiveState;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLERenderProxySegment;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ugc.android.editor.components.base.api.IPreviewService;
import com.ss.ugc.android.editor.core.tracklinkage.TrackLinkageManagerProvider;
import com.ss.ugc.android.editor.core.vm.BaseViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class SmartTrimViewModel extends BaseViewModel {
    public final void AQ2() {
        C0E48 c0e48 = this.editorContext;
        if (c0e48 == null) {
            return;
        }
        VecNLETrackSPtr tracks = C350870DpF.LJI(c0e48).getTracks();
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            NLETrack nLETrack2 = nLETrack;
            if (nLETrack2.getEnable() && C350870DpF.LJIIIIZZ(nLETrack2) == NLETrackType.AUDIO && !C351220Dpo.LLLII(nLETrack2) && !C351220Dpo.LLLLIILL(nLETrack2)) {
                arrayList.add(nLETrack);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((NLENode) it2.next()).setEnable(false);
        }
    }

    public final void BQ2(NLETrackSlot nLETrackSlot) {
        int iIndexOf;
        VecNLETrackSlotSPtr sortedSlots;
        NLEResType type;
        NLEResType type2;
        NLEResType type3;
        NLEResType type4;
        C0E48 c0e48 = this.editorContext;
        if (c0e48 == null || (iIndexOf = c0e48.Rn().getSortedSlots().indexOf(nLETrackSlot)) == -1) {
            return;
        }
        VecNLETrackSPtr tracks = C350870DpF.LJI(c0e48).getTracks();
        ArrayList<NLETrack> arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (!nLETrack.getMainTrack()) {
                arrayList.add(nLETrack);
            }
        }
        for (NLETrack nLETrack2 : arrayList) {
            for (NLETrackSlot nLETrackSlot2 : nLETrack2.getSortedSlots()) {
                TrackLinkageManagerProvider.Companion.getClass();
                AbstractC349500Dn2 businessTrackLinkageManager = C356700Dye.LIZ().getBusinessTrackLinkageManager();
                if (businessTrackLinkageManager != null) {
                    nLETrackSlot2.setExtra("is_linkage_slot_before_smart_trim", String.valueOf(businessTrackLinkageManager.LIZIZ(c0e48, nLETrackSlot2, nLETrackSlot, C350870DpF.LJI(c0e48))));
                }
                long j = 100000;
                if (nLETrackSlot2.getMeasuredEndTime() < nLETrackSlot.getStartTime() + j) {
                    nLETrack2.removeSlot(nLETrackSlot2);
                    NLESegment mainSegment = nLETrackSlot2.getMainSegment();
                    if (mainSegment != null) {
                        type2 = mainSegment.getType();
                    } else {
                        type2 = null;
                    }
                    if (type2 == NLEResType.TEXT_STICKER) {
                        C0EVZ.LIZJ(nLETrackSlot2, this.editorContext);
                    }
                } else if (nLETrackSlot2.getStartTime() >= nLETrackSlot.getStartTime()) {
                    if (nLETrackSlot2.getMeasuredEndTime() >= nLETrackSlot.getEndTime()) {
                        if (nLETrackSlot2.getStartTime() >= nLETrackSlot.getEndTime() - j) {
                            nLETrack2.removeSlot(nLETrackSlot2);
                            NLESegment mainSegment2 = nLETrackSlot2.getMainSegment();
                            if (mainSegment2 != null) {
                                type3 = mainSegment2.getType();
                            } else {
                                type3 = null;
                            }
                            if (type3 == NLEResType.TEXT_STICKER) {
                                C0EVZ.LIZJ(nLETrackSlot2, this.editorContext);
                            }
                        } else {
                            zQ2(nLETrackSlot.getEndTime(), nLETrackSlot2);
                            yQ2(nLETrack2, nLETrackSlot2, nLETrackSlot);
                        }
                    }
                } else {
                    long startTime = nLETrackSlot.getStartTime();
                    C0E48 c0e482 = this.editorContext;
                    if (c0e482 != null) {
                        c0e482.LLFII().LLJ(nLETrackSlot2, startTime - nLETrackSlot2.getStartTime(), nLETrackSlot2.getEndTime() - startTime, EnumC356070Dxd.NONE);
                        NLESegment mainSegment3 = nLETrackSlot2.getMainSegment();
                        if (mainSegment3 != null) {
                            type4 = mainSegment3.getType();
                        } else {
                            type4 = null;
                        }
                        if (type4 == NLEResType.TEXT_STICKER) {
                            C0EVZ.LIZ.LIZIZ(nLETrackSlot2, c0e482);
                        }
                    }
                    if (nLETrackSlot2.getMeasuredEndTime() >= nLETrackSlot.getEndTime()) {
                        zQ2(nLETrackSlot.getEndTime(), nLETrackSlot2);
                        yQ2(nLETrack2, nLETrackSlot2, nLETrackSlot);
                    }
                }
            }
        }
        long duration = 0;
        int i = 0;
        for (NLETrackSlot nLETrackSlot3 : c0e48.Rn().getSortedSlots()) {
            int i2 = i + 1;
            if (i >= 0) {
                NLETrackSlot nLETrackSlot4 = nLETrackSlot3;
                if (!Intrinsics.LJFF(nLETrackSlot4.getUUID(), nLETrackSlot.getUUID())) {
                    if (i < iIndexOf) {
                        duration += nLETrackSlot4.getDuration();
                    }
                    c0e48.Rn().removeSlot(nLETrackSlot4);
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        c0e48.Rn().timeSort();
        VecNLETrackSPtr tracks2 = C350870DpF.LJI(c0e48).getTracks();
        if (tracks2 != null) {
            ArrayList<NLETrack> arrayList2 = new ArrayList();
            for (NLETrack nLETrack3 : tracks2) {
                if (!nLETrack3.getMainTrack()) {
                    arrayList2.add(nLETrack3);
                }
            }
            for (NLETrack nLETrack4 : arrayList2) {
                if (nLETrack4 != null && (sortedSlots = nLETrack4.getSortedSlots()) != null) {
                    for (NLETrackSlot nLETrackSlot5 : sortedSlots) {
                        if (nLETrackSlot5 != null) {
                            nLETrackSlot5.setStartTime(nLETrackSlot5.getStartTime() - duration);
                            nLETrackSlot5.setEndTime(nLETrackSlot5.getEndTime() - duration);
                            NLESegment mainSegment4 = nLETrackSlot5.getMainSegment();
                            if (mainSegment4 != null) {
                                type = mainSegment4.getType();
                            } else {
                                type = null;
                            }
                            if (type == NLEResType.TEXT_STICKER) {
                                C0EVZ.LIZ.LIZIZ(nLETrackSlot5, c0e48);
                            }
                        }
                    }
                }
            }
        }
        C350410DoV.LIZ(c0e48.LLFII().LJI(), false, true);
    }

    public final void vQ2(InterfaceC355360DwU interfaceC355360DwU) {
        IPreviewService iPreviewServiceLIZ;
        InterfaceC361710EGb previewPanelApi;
        float width;
        Size sizeLIZJ;
        Size sizeLIZJ2;
        C0E48 c0e48 = this.editorContext;
        if (c0e48 != null && (iPreviewServiceLIZ = C357280Dza.LIZ()) != null && (previewPanelApi = iPreviewServiceLIZ.getPreviewPanelApi()) != null) {
            LiveState<Size> canvasSize = previewPanelApi.getCanvasSize();
            float height = -1.0f;
            if (canvasSize != null && (sizeLIZJ2 = canvasSize.LIZJ()) != null) {
                width = sizeLIZJ2.getWidth();
            } else {
                width = -1.0f;
            }
            LiveState<Size> canvasSize2 = previewPanelApi.getCanvasSize();
            if (canvasSize2 != null && (sizeLIZJ = canvasSize2.LIZJ()) != null) {
                height = sizeLIZJ.getHeight();
            }
            c0e48.LLFII().LJLJL(width, height, interfaceC355360DwU);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:167:0x0028, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void CQ2(java.util.ArrayList<X.C351480DqE> r43, boolean r44) {
        /*
            Method dump skipped, instruction units count: 1026
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editorpro.capabilities.video.smarttrim.SmartTrimViewModel.CQ2(java.util.ArrayList, boolean):void");
    }

    public final void xQ2(ArrayList arrayList, boolean z) {
        C0E48 c0e48 = this.editorContext;
        if (c0e48 == null) {
            return;
        }
        c0e48.LLFII().LLJILJILJ(z, arrayList, new C351500DqG(c0e48));
    }

    public final void zQ2(long j, NLETrackSlot nLETrackSlot) {
        NLEResType type;
        C0E48 c0e48 = this.editorContext;
        if (c0e48 == null) {
            return;
        }
        c0e48.LLFII().LLJ(nLETrackSlot, 0L, j - nLETrackSlot.getStartTime(), EnumC356070Dxd.NONE);
        NLESegment mainSegment = nLETrackSlot.getMainSegment();
        if (mainSegment != null) {
            type = mainSegment.getType();
        } else {
            type = null;
        }
        if (type == NLEResType.TEXT_STICKER) {
            C0EVZ.LIZ.LIZIZ(nLETrackSlot, c0e48);
        }
    }

    public final void yQ2(NLETrack nLETrack, NLETrackSlot nLETrackSlot, NLETrackSlot nLETrackSlot2) {
        NLEResType type;
        C0E48 c0e48 = this.editorContext;
        if (c0e48 == null) {
            return;
        }
        c0e48.LLFII().LLD(nLETrack.getLayer(), nLETrack.getLayer(), nLETrackSlot, nLETrackSlot.getStartTime() - nLETrackSlot2.getStartTime(), 0L, nLETrackSlot.getDuration(), false, EnumC356070Dxd.NONE);
        NLESegment mainSegment = nLETrackSlot.getMainSegment();
        if (mainSegment != null) {
            type = mainSegment.getType();
        } else {
            type = null;
        }
        if (type == NLEResType.TEXT_STICKER) {
            C0EVZ.LIZ.LIZIZ(nLETrackSlot, c0e48);
        }
    }

    public final void wQ2(NLETrackSlot nLETrackSlot, long j, long j2, boolean z, boolean z2) {
        NLETrackSlot renderProxy;
        NLESegment mainSegment;
        NLERenderProxySegment nLERenderProxySegmentDynamicCast;
        NLEResourceAV aVFile;
        C0E48 c0e48 = this.editorContext;
        if (c0e48 == null) {
            return;
        }
        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
        if (Math.abs(j2 - C351220Dpo.LLLLLLL(nLESegmentVideoDynamicCast.getTimeClipEnd() - nLESegmentVideoDynamicCast.getTimeClipStart())) < 3 && z) {
            return;
        }
        NLEModel nLEModelDynamicCast = NLEModel.dynamicCast(C350870DpF.LJI(c0e48).deepClone());
        NLETrackSlot nLETrackSlotDynamicCast = NLETrackSlot.dynamicCast(nLETrackSlot.deepClone());
        long j3 = LSPassThroughRecordSizeConfig.DEFAULT;
        long j4 = j * j3;
        nLESegmentVideoDynamicCast.setTimeClipStart(j4);
        nLESegmentVideoDynamicCast.setTimeClipEnd(((long) (j2 * C351220Dpo.LIZ(nLESegmentVideoDynamicCast) * LSPassThroughRecordSizeConfig.DEFAULT)) + j4);
        nLETrackSlot.setEndTime(nLETrackSlot.getStartTime() + nLESegmentVideoDynamicCast.getDuration());
        if (j2 < 200) {
            nLETrackSlot.setEndTransition(null);
            NLETrackSlot nLETrackSlot2 = (NLETrackSlot) C13LP.LJJJLZIJ(c0e48.Rn().getSortedSlots().indexOf(nLETrackSlot) - 1, c0e48.Rn().getSortedSlots());
            if (nLETrackSlot2 != null) {
                nLETrackSlot2.setEndTransition(null);
            }
        }
        if (C351220Dpo.LLJJIJIL(nLETrackSlot)) {
            C351510DqH.LIZ.getClass();
            if (C351510DqH.LJJIL(nLETrackSlot) && (renderProxy = nLETrackSlot.getRenderProxy()) != null && (mainSegment = renderProxy.getMainSegment()) != null && (nLERenderProxySegmentDynamicCast = NLERenderProxySegment.dynamicCast(mainSegment)) != null && (aVFile = nLERenderProxySegmentDynamicCast.getAVFile()) != null) {
                aVFile.setDuration((j2 * j3) + j4);
            }
            NLEResourceNode resource = nLESegmentVideoDynamicCast.getResource();
            if (resource != null) {
                resource.setDuration(j4 + (j2 * j3));
            }
        }
        c0e48.Rn().timeSort();
        C350110Do1.LJIIJ(nLESegmentVideoDynamicCast.getTimeClipStart(), C350870DpF.LJI(c0e48), nLESegmentVideoDynamicCast.getTimeClipEnd(), nLETrackSlot);
        if (z2) {
            TrackLinkageManagerProvider.Companion.getClass();
            AbstractC349500Dn2 businessTrackLinkageManager = C356700Dye.LIZ().getBusinessTrackLinkageManager();
            if (businessTrackLinkageManager != null) {
                businessTrackLinkageManager.LIZJ(new C349510Dn3("clip_video", C1697810uHb.LJ(new C349470Dmz(nLETrackSlotDynamicCast, nLETrackSlot, null, 1, 20)), nLEModelDynamicCast));
            }
        }
    }
}
