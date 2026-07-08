package com.ss.android.ugc.gamora.editorpro.capabilities.video.crop.common.logic;

import X.AbstractC565380MFk;
import X.AnonymousClass1951;
import X.C013C;
import X.C04TD;
import X.C0CNO;
import X.C0E1T;
import X.C0E48;
import X.C0E5G;
import X.C0E69;
import X.C0FX2;
import X.C13BV;
import X.C13LP;
import X.C15O7;
import X.C19EG;
import X.C214928199i;
import X.C259800zU;
import X.C346630DiP;
import X.C346780Die;
import X.C349070DmL;
import X.C350110Do1;
import X.C350870DpF;
import X.C351220Dpo;
import X.C351510DqH;
import X.C354090DuR;
import X.C354270Duj;
import X.C357280Dza;
import X.C363070ELh;
import X.C363110ELl;
import X.C375260EnU;
import X.C418440Gaw;
import X.C569760MWg;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC357850E1f;
import X.InterfaceC361710EGb;
import X.InterfaceC363130ELn;
import android.content.Intent;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.ies.nle.editor_jni.INLEListenerSeek;
import com.bytedance.ies.nle.editor_jni.INLEMattingRuntime;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.gamora.editorpro.capabilities.video.crop.VideoCropRootScene;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import com.ss.ugc.android.editor.components.base.api.IPreviewService;
import com.ss.ugc.android.editor.components.base.api.IVideoCropService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS18S0300100_5;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class VideoCropService implements IVideoCropService {
    public static final int $stable = 8;
    public String activityTag = "";
    public volatile boolean isCropPanelShowing;

    @Override // com.ss.ugc.android.editor.components.base.api.IVideoCropService
    public void processCropResult(C19EG c19eg, Intent intent) {
    }

    @Override // com.ss.ugc.android.editor.components.base.api.IVideoCropService
    public void startCrop(C19EG c19eg, NLETrackSlot nLETrackSlot) {
    }

    public static IVideoCropService createIVideoCropServicebyMonsterPlugin(boolean z) {
        Object objLIZ = C04TD.LIZ(IVideoCropService.class, z);
        if (objLIZ != null) {
            return (IVideoCropService) objLIZ;
        }
        if (C04TD.u6 == null) {
            synchronized (IVideoCropService.class) {
                if (C04TD.u6 == null) {
                    C04TD.u6 = new VideoCropService();
                }
            }
        }
        return C04TD.u6;
    }

    private final void preloadCropData(C0E48 c0e48, NLEModel nLEModel, long j) {
        INLEPlayer playerApi;
        INLEPlayer playerApi2;
        INLEMediaSession iNLEMediaSessionF1 = c0e48.f1();
        if (iNLEMediaSessionF1 != null) {
            iNLEMediaSessionF1.setDataSource(nLEModel);
        }
        INLEMediaSession iNLEMediaSessionF12 = c0e48.f1();
        if (iNLEMediaSessionF12 != null && (playerApi2 = iNLEMediaSessionF12.getPlayerApi()) != null) {
            playerApi2.prepare();
        }
        INLEMediaSession iNLEMediaSessionF13 = c0e48.f1();
        if (iNLEMediaSessionF13 != null && (playerApi = iNLEMediaSessionF13.getPlayerApi()) != null) {
            playerApi.seekTime(C351220Dpo.LLLLLLJ(j));
        }
    }

    private final void seek(C0E48 c0e48, long j, long j2, INLEListenerSeek iNLEListenerSeek) {
        C013C c013c = new C013C();
        c0e48.getPlayer().ba(j, new C0FX2(c013c, iNLEListenerSeek, 5));
        C354270Duj.LIZ(j2, new AwS406S0200000_5(c013c, iNLEListenerSeek, 66));
    }

    @Override // com.ss.ugc.android.editor.components.base.api.IVideoCropService
    public void startCrop(NavigationScene navigationScene, Scene scene, C19EG c19eg, NLETrackSlot nLETrackSlot, C0E48 c0e48, Function2<? super C363110ELl, ? super Function1<? super NLETrackSlot, Unit>, Unit> function2) {
        InterfaceC361710EGb previewPanelApi;
        SurfaceView surfaceViewLJIJJLI;
        ViewGroup viewGroup;
        long jQq;
        Pair<Integer, Integer> pair;
        if ((this.isCropPanelShowing && Intrinsics.LJFF(this.activityTag, String.valueOf(c19eg.hashCode()))) || c0e48 == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        IPreviewService iPreviewServiceLIZ = C357280Dza.LIZ();
        if (iPreviewServiceLIZ != null && (previewPanelApi = iPreviewServiceLIZ.getPreviewPanelApi()) != null && (surfaceViewLJIJJLI = previewPanelApi.LJIJJLI()) != null) {
            ViewParent parent = surfaceViewLJIJJLI.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                this.isCropPanelShowing = true;
                this.activityTag = String.valueOf(c19eg.hashCode());
                ViewGroup.LayoutParams layoutParams = surfaceViewLJIJJLI.getLayoutParams();
                int iIndexOfChild = viewGroup.indexOfChild(surfaceViewLJIJJLI);
                long jJh = c0e48.getPlayer().Jh();
                c0e48.getPlayer().LJJI();
                C0E69.LIZ(c0e48, true, false, 0L, new C363070ELh(surfaceViewLJIJJLI, viewGroup, nLETrackSlot, previewPanelApi, this, c19eg, navigationScene, scene, c0e48, jCurrentTimeMillis, iIndexOfChild, layoutParams, function2, jJh), 12);
                EditModelProvider.Companion.getClass();
                VideoPublishEditModel editModel = C0E1T.LIZ().getEditModel();
                if (editModel != null) {
                    EnumC357850E1f enumC357850E1f = EnumC357850E1f.ENABLE_MULTITHREADED_OPT;
                    Boolean bool = Boolean.FALSE;
                    if (((Boolean) C0E5G.LIZIZ(enumC357850E1f, bool)).booleanValue()) {
                        jQq = c0e48.getPlayer().qq();
                    } else {
                        jQq = -1;
                    }
                    if (((Boolean) C0E5G.LIZIZ(enumC357850E1f, bool)).booleanValue()) {
                        pair = u4.LJJII(C350870DpF.LJI(c0e48), false);
                    } else {
                        pair = new Pair<>(-1, -1);
                    }
                    C0CNO.LIZ(C15O7.LJI, new AwS18S0300100_5(jQq, editModel, c0e48, pair, 2));
                }
            }
        }
    }

    public static /* synthetic */ void seek$default(VideoCropService videoCropService, C0E48 c0e48, long j, long j2, INLEListenerSeek iNLEListenerSeek, int i, Object obj) {
        if ((i & 4) != 0) {
            j2 = 3000;
        }
        videoCropService.seek(c0e48, j, j2, iNLEListenerSeek);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r25v0, types: [com.bytedance.scene.navigation.NavigationScene] */
    /* JADX WARN: Type inference failed for: r7v2, types: [X.0ELk] */
    /* JADX WARN: Type inference failed for: r7v3, types: [X.0ELn] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v4, types: [T] */
    /* JADX WARN: Type inference failed for: r8v5 */
    public final void pushCropScene(C19EG c19eg, NavigationScene navigationScene, final Scene scene, final C0E48 c0e48, long j, final Function1<? super NLETrackSlot, Unit> function1, final Function2<? super C363110ELl, ? super Function1<? super NLETrackSlot, Unit>, Unit> function2) {
        long measuredStartTime;
        View view;
        List sortedSlots;
        NLENode nLENode;
        float f;
        NLESegment mainSegment;
        NLESegmentVideo nLESegmentVideoDynamicCast;
        INLEMattingRuntime mattingApi;
        NLETrack nLETrackPt = c0e48.Pt();
        final NLETrackSlot nLETrackSlotLLLLLLIL = c0e48.LLLLLLIL();
        if (nLETrackPt != null && nLETrackSlotLLLLLLIL != null) {
            INLEMediaSession iNLEMediaSessionLJIIIIZZ = C354090DuR.LJIIIIZZ(c0e48);
            if (iNLEMediaSessionLJIIIIZZ != null && (mattingApi = iNLEMediaSessionLJIIIIZZ.getMattingApi()) != null) {
                mattingApi.removeMattingListener();
            }
            final long jCurrentTimeMillis = System.currentTimeMillis();
            long jJh = c0e48.getPlayer().Jh();
            NLETrackSlot nLETrackSlotDynamicCast = NLETrackSlot.dynamicCast((NLENode) nLETrackSlotLLLLLLIL);
            if (nLETrackSlotDynamicCast != null && (mainSegment = nLETrackSlotDynamicCast.getMainSegment()) != null && (nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) mainSegment)) != null) {
                measuredStartTime = (long) ((jJh - (nLETrackSlotLLLLLLIL.getMeasuredStartTime() / ((long) LSPassThroughRecordSizeConfig.DEFAULT))) * nLESegmentVideoDynamicCast.getAbsSpeed());
            } else {
                measuredStartTime = 0;
            }
            NLEModel nLEModelDynamicCast = NLEModel.dynamicCast(C350870DpF.LJI(c0e48).deepClone(false));
            NLETrackSlot nLETrackSlotDynamicCast2 = NLETrackSlot.dynamicCast(nLETrackSlotLLLLLLIL.deepClone(false));
            C349070DmL.LIZ(nLEModelDynamicCast, nLETrackSlotDynamicCast2, true);
            nLETrackSlotDynamicCast2.clearVideoAnim();
            nLETrackSlotDynamicCast2.clearMask();
            nLETrackSlotDynamicCast2.clearSwingKeyframe();
            nLETrackSlotDynamicCast2.clearKeyframe();
            NLESegmentVideo nLESegmentVideoDynamicCast2 = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlotDynamicCast2.getMainSegment());
            ?? r8 = 0;
            if (nLESegmentVideoDynamicCast2 != null) {
                if (nLESegmentVideoDynamicCast2.getRewind()) {
                    f = -1.0f;
                } else {
                    f = 1.0f;
                }
                nLESegmentVideoDynamicCast2.setSpeed(f);
                nLESegmentVideoDynamicCast2.setAbsSpeed(1.0f);
                nLESegmentVideoDynamicCast2.clearSegCurveSpeedPoint();
                C351220Dpo.LLLLLIL(nLETrackSlotDynamicCast2);
                long timeClipEnd = nLESegmentVideoDynamicCast2.getTimeClipEnd() - nLESegmentVideoDynamicCast2.getTimeClipStart();
                nLETrackSlotDynamicCast2.setStartTime(0L);
                nLETrackSlotDynamicCast2.setEndTime(nLETrackSlotDynamicCast2.getStartTime() + timeClipEnd);
                nLETrackSlotDynamicCast2.setMainSegment(nLESegmentVideoDynamicCast2);
                Float fLJJJJJL = C351220Dpo.LJJJJJL(nLETrackSlotDynamicCast2, "ep_crop_scale", Float.valueOf(1.0f));
                if (fLJJJJJL != null) {
                    nLETrackSlotDynamicCast2.setScale(fLJJJJJL.floatValue());
                }
                Float fLJJJJJL2 = C351220Dpo.LJJJJJL(nLETrackSlotDynamicCast2, "ep_crop_transX", Float.valueOf(0.0f));
                if (fLJJJJJL2 != null) {
                    nLETrackSlotDynamicCast2.setTransformX(fLJJJJJL2.floatValue());
                }
                Float fLJJJJJL3 = C351220Dpo.LJJJJJL(nLETrackSlotDynamicCast2, "ep_crop_transY", Float.valueOf(0.0f));
                if (fLJJJJJL3 != null) {
                    nLETrackSlotDynamicCast2.setTransformY(fLJJJJJL3.floatValue());
                }
                Float fLJJJJJL4 = C351220Dpo.LJJJJJL(nLETrackSlotDynamicCast2, "ep_crop_degree", Float.valueOf(0.0f));
                if (fLJJJJJL4 != null) {
                    nLETrackSlotDynamicCast2.setRotation(fLJJJJJL4.floatValue());
                }
                nLESegmentVideoDynamicCast2.setCrop(null);
                nLESegmentVideoDynamicCast2.setClip(null);
                nLETrackSlotDynamicCast2.clearFilter();
                nLETrackSlotDynamicCast2.clearVideoEffect();
                C351510DqH.LIZ.getClass();
                C351510DqH.LJJJJ(nLESegmentVideoDynamicCast2);
            }
            NLETrack nLETrack = new NLETrack();
            nLETrack.setMainTrack(true);
            nLETrack.addSlot(nLETrackSlotDynamicCast2);
            nLETrack.setDuration(nLETrackSlotDynamicCast2.getDuration());
            C259800zU c259800zU = new C259800zU();
            if (nLETrackPt.getMainTrack() && C351220Dpo.LLI(nLETrackSlotDynamicCast2)) {
                NLETrack nLETrackLIZ = C346780Die.LIZ(nLEModelDynamicCast);
                if (nLETrackLIZ == null || (sortedSlots = nLETrackLIZ.getSortedSlots()) == null) {
                    sortedSlots = C13BV.INSTANCE;
                }
                VecNLETrackSlotSPtr sortedSlots2 = nLEModelDynamicCast.getMainTrack().getSortedSlots();
                ArrayList arrayList = new ArrayList();
                for (NLETrackSlot nLETrackSlot : sortedSlots2) {
                    if (C351220Dpo.LLI(nLETrackSlot)) {
                        arrayList.add(nLETrackSlot);
                    }
                }
                if (sortedSlots.size() == arrayList.size() && (nLENode = (NLENode) C13LP.LJJJLZIJ(arrayList.indexOf(nLETrackSlotLLLLLLIL), sortedSlots)) != null) {
                    NLETrackSlot nLETrackSlotDynamicCast3 = NLETrackSlot.dynamicCast(nLENode.deepClone(false));
                    if (nLETrackSlotDynamicCast3 != null) {
                        NLESegmentAudio.dynamicCast(nLETrackSlotDynamicCast3.getMainSegment()).setAbsSpeed(1.0f);
                        nLETrackSlotDynamicCast3.setStartTime(0L);
                        nLETrackSlotDynamicCast3.setEndTime(-2L);
                        r8 = nLETrackSlotDynamicCast3;
                    }
                    c259800zU.element = r8;
                }
            }
            nLEModelDynamicCast.clearTrack();
            nLEModelDynamicCast.addTrack(nLETrack);
            NLETrackSlot nLETrackSlot2 = (NLETrackSlot) c259800zU.element;
            if (nLETrackSlot2 != null) {
                NLETrack nLETrack2 = new NLETrack();
                nLETrack2.setMainTrack(false);
                nLETrack2.setExtra("track_type", "audio");
                nLETrack2.setExtraTrackType(NLETrackType.AUDIO);
                nLETrack2.setLayer(0);
                nLETrack2.setExtra("AudioTrackType", "ORIGIN");
                nLETrack2.addSlot(nLETrackSlot2);
                nLETrack2.setDuration(nLETrackSlot2.getDuration());
                nLEModelDynamicCast.addTrack(nLETrack2);
                C350110Do1.LJII(nLEModelDynamicCast);
            }
            Scene sceneLLLLIIIILLL = navigationScene.LLLLIIIILLL();
            if (sceneLLLLIIIILLL != null && (view = sceneLLLLIIIILLL.mView) != null) {
                nLEModelDynamicCast.setCanvasRatio(view.getMeasuredWidth() / (view.getMeasuredHeight() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(286))));
            }
            NLEEditor nLEEditorLIZ = C346630DiP.LIZ();
            nLEEditorLIZ.setModel(NLEModel.dynamicCast(nLEModelDynamicCast.deepClone(true)));
            nLEEditorLIZ.commit();
            nLEEditorLIZ.done();
            NLEModel model = nLEEditorLIZ.getModel();
            preloadCropData(c0e48, model, measuredStartTime);
            VideoCropRootScene videoCropRootScene = new VideoCropRootScene();
            Bundle bundle = new Bundle();
            C786410Ut5.LJJJI("extra_editor_pro_crop_nle_model", C375260EnU.LIZJ(model), bundle);
            bundle.putLong("extra_editor_pro_crop_seek_position", measuredStartTime);
            bundle.putLong("extra_crop_click_time", j);
            videoCropRootScene.mArguments = bundle;
            videoCropRootScene.LLJJL = c0e48;
            final ?? r7 = new InterfaceC363130ELn() { // from class: X.0ELk
                @Override // X.InterfaceC363130ELn
                public final void onResult(Object obj) {
                    C363110ELl c363110ELl;
                    C361680EFy.LJLILLLLZI(nLETrackSlotLLLLLLIL, "edit_crop_duration", String.valueOf(C361680EFy.LJIJJ(nLETrackSlotLLLLLLIL, "edit_crop_duration") + (System.currentTimeMillis() - jCurrentTimeMillis)));
                    if (obj instanceof C363110ELl) {
                        c363110ELl = (C363110ELl) obj;
                        if (c363110ELl != null) {
                            nLETrackSlotLLLLLLIL.setExtra("ep_crop_mode", String.valueOf(c363110ELl.LIZIZ));
                            if (c363110ELl.LIZ != null) {
                                nLETrackSlotLLLLLLIL.setExtra("is_editorpro_crop_video", "1");
                            }
                        }
                    } else {
                        c363110ELl = null;
                    }
                    CopyOnWriteArraySet<InterfaceC354120DuU> copyOnWriteArraySet = C354090DuR.LIZ;
                    C354090DuR.LJIIJ(c0e48);
                    function2.invoke(c363110ELl, new AwS584S0100000_5(function1, (Function1<? super NLETrackSlot, Unit>) 607));
                }
            };
            ?? r72 = r7;
            if (C214928199i.LIZIZ) {
                r72 = new AbstractC565380MFk(scene) { // from class: X.0ELm
                    @Override // X.InterfaceC363130ELn
                    public final void onResult(Object obj) {
                        r7.onResult(obj);
                    }
                };
            }
            C569760MWg c569760MWg = new C569760MWg();
            c569760MWg.LIZJ = new AnonymousClass1951(R.anim.a7, c19eg, R.anim.a6);
            c569760MWg.LIZIZ = r72;
            navigationScene.LLLLLLLLLL(videoCropRootScene, c569760MWg.LIZ());
            return;
        }
        this.isCropPanelShowing = false;
        C0E69.LIZ(c0e48, false, false, 0L, null, 28);
    }
}
