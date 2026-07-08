package com.ss.android.ugc.gamora.editorpro.capabilities.video.speed.common;

import X.C01GW;
import X.C0E1T;
import X.C0E1V;
import X.C0E1X;
import X.C0E48;
import X.C0E55;
import X.C0E5G;
import X.C1227904rF;
import X.C13BV;
import X.C13LP;
import X.C15438062q;
import X.C1889407ae;
import X.C1AF0;
import X.C288200BRi;
import X.C288210BRj;
import X.C301800BsI;
import X.C347000Dj0;
import X.C349940Dnk;
import X.C350110Do1;
import X.C350730Dp1;
import X.C350740Dp2;
import X.C350870DpF;
import X.C350890DpH;
import X.C351080Dpa;
import X.C351090Dpb;
import X.C351110Dpd;
import X.C351120Dpe;
import X.C351220Dpo;
import X.C351510DqH;
import X.C354130DuV;
import X.C358740E4q;
import X.C361680EFy;
import X.C363500EMy;
import X.C419990GdR;
import X.C452501pT;
import X.EnumC356070Dxd;
import X.EnumC356090Dxf;
import X.EnumC357850E1f;
import X.InterfaceC350750Dp3;
import X.InterfaceC351350Dq1;
import Y.AObserverS209S0100000_5;
import android.graphics.PointF;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.ies.nle.editor_jni.INLEListenerVideoOutput;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.INLEMediaSettings;
import com.bytedance.ies.nle.editor_jni.NLECurveSpeedCalculator;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEPoint;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLEPointSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import com.ss.ugc.android.editor.core.utils.LiveDataBus;
import com.ss.ugc.android.editor.core.vm.BaseViewModel;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class SpeedViewModel extends BaseViewModel {
    public ResourceItem currentResourceItem;
    public final Map<String, Pair<List<PointF>, String>> curveSpeedDefaultPointsEngNameMap;
    public boolean curveSpeedEnabled;
    public final VideoPublishEditModel editModel;
    public boolean editPanelVisible;
    public NLECurveSpeedCalculator nleCurveSpeedCalculator;
    public final Observer<Integer> pauseObserver;
    public final C01GW slotSelectChangedEvent$delegate;
    public long sourceOffsetBeforeEdit;
    public final C01GW speedUpdate$delegate;
    public final C01GW trackSelectChangedEvent$delegate;
    public final INLEListenerVideoOutput videoOutputListener;
    public static final C354130DuV Companion = new C354130DuV();
    public static final int $stable = 8;
    public final MutableLiveData<Float> playProgress = new MutableLiveData<>();
    public final MutableLiveData<Boolean> playState = new MutableLiveData<>();
    public final MutableLiveData<C1889407ae> curveSpeedInfo = new MutableLiveData<>();
    public final MutableLiveData<Float> speed = new MutableLiveData<>();
    public final MutableLiveData<Boolean> changeTone = new MutableLiveData<>();
    public boolean acceptPlayerProgress = true;

    public final void startPlay() {
        long[] jArr = new long[2];
        C0E48 c0e48 = this.editorContext;
        if (c0e48 != null) {
            c0e48.Bq(jArr);
            long jJh = c0e48.getPlayer().Jh();
            long j = jArr[1];
            long j2 = LSPassThroughRecordSizeConfig.DEFAULT;
            c0e48.getPlayer().LJJIIZI(jArr[0] + j2, jArr[1] - j2, false, jJh >= C351220Dpo.LLLLLLL((j - j2) - ((long) 99000)));
        }
    }

    private final void cancelCurveSpeed() {
        NLETrackSlot nLETrackSlotLLLLLLIL;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        C0E48 c0e48 = this.editorContext;
        if (c0e48 == null || (nLETrackSlotLLLLLLIL = c0e48.LLLLLLIL()) == null) {
            return;
        }
        long maxEnd = c0e48.Rn().getMaxEnd();
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII2 = c0e48.LLFII();
        EnumC356070Dxd enumC356070Dxd = EnumC356070Dxd.NONE;
        interfaceC351350Dq1LLFII2.LLFFF(nLETrackSlotLLLLLLIL, enumC356070Dxd);
        this.nleCurveSpeedCalculator = null;
        updateCurrentCurveSpeedInfo();
        NLEModel nLEModelLJI = C350870DpF.LJI(c0e48);
        C351510DqH c351510DqH = C351510DqH.LIZ;
        C0E48 c0e482 = this.editorContext;
        c351510DqH.getClass();
        NLETrackSlot nLETrackSlotLIZ = C350110Do1.LIZ(nLEModelLJI, nLETrackSlotLLLLLLIL);
        if (nLETrackSlotLIZ != null) {
            if (c0e482 != null && (interfaceC351350Dq1LLFII = c0e482.LLFII()) != null) {
                interfaceC351350Dq1LLFII.LLFFF(nLETrackSlotLIZ, enumC356070Dxd);
            }
            nLEModelLJI.setExtra("extra_key_realign_origin_slots", "true");
            C350110Do1.LJIILL(nLEModelLJI);
        }
        C350110Do1.LIZJ.getClass();
        NLETrackSlot nLETrackSlotLIZIZ = C347000Dj0.LIZIZ(nLEModelLJI, nLETrackSlotLLLLLLIL);
        if (nLETrackSlotLIZIZ != null) {
            c0e48.LLFII().LLFFF(nLETrackSlotLIZIZ, enumC356070Dxd);
            C350110Do1.LJII(nLEModelLJI);
        }
        NLETrack trackBySlot = nLEModelLJI.getTrackBySlot(nLETrackSlotLLLLLLIL);
        if (trackBySlot != null && C350870DpF.LJIIIIZZ(trackBySlot) == NLETrackType.VIDEO) {
            adjustAfterVideoSpeed(maxEnd, null);
        }
        nLETrackSlotLLLLLLIL.setExtra("ep_curve_speed_resource_id", "None");
        if (C301800BsI.LIZ()) {
            C350890DpH.LIZ(c0e48, new C0E1X(C0E1V.CHANGE_CURVE_SPEED.getNameId(), null, null, null, null, 30));
        } else {
            C0E48 c0e483 = this.editorContext;
            if (c0e483 != null) {
                C350870DpF.LIZ(c0e483, false);
            }
        }
        c0e48.getPlayer().LJIJJLI();
        c0e48.getPlayer().pause(false);
        c0e48.getPlayer().LJIJI(nLETrackSlotLLLLLLIL.getStartTime() + ((long) LSPassThroughRecordSizeConfig.DEFAULT), C351110Dpd.LIZ);
    }

    private final boolean isCurveSpeedEnableInPUGC() {
        if (!((Boolean) C288210BRj.LIZ.getValue()).booleanValue()) {
            return false;
        }
        C363500EMy c363500EMy = C363500EMy.LIZ;
        VideoPublishEditModel videoPublishEditModel = this.editModel;
        c363500EMy.getClass();
        return C363500EMy.LJIIJ(videoPublishEditModel);
    }

    public final void checkAbsSpeedAndTone() {
        C0E48 c0e48 = this.editorContext;
        if (c0e48 == null) {
            return;
        }
        float fLLIZLLLIL = c0e48.LLFII().LLIZLLLIL();
        if (!Intrinsics.LIZLLL(this.speed.getValue(), fLLIZLLLIL)) {
            this.speed.setValue(Float.valueOf(fLLIZLLLIL));
        }
        float fLLIILZL = c0e48.LLFII().LLIILZL();
        if (!Intrinsics.LIZLLL(this.speed.getValue(), fLLIILZL)) {
            this.speed.setValue(Float.valueOf(fLLIILZL));
        }
        boolean z = !c0e48.LLFII().LJLIIIL();
        if (Intrinsics.LJFF(this.changeTone.getValue(), Boolean.valueOf(z))) {
            return;
        }
        this.changeTone.setValue(Boolean.valueOf(z));
    }

    public final long dstDuration() {
        NLETrackSlot nLETrackSlotLLLLLLIL;
        NLESegment mainSegment;
        C0E48 c0e48 = this.editorContext;
        if (c0e48 == null || (nLETrackSlotLLLLLLIL = c0e48.LLLLLLIL()) == null || (mainSegment = nLETrackSlotLLLLLLIL.getMainSegment()) == null) {
            return 0L;
        }
        return mainSegment.getDuration();
    }

    public final String getCurResourceEngName() {
        ResourceItem resourceItem = this.currentResourceItem;
        if (resourceItem != null) {
            return getResourceEngName(resourceItem);
        }
        return null;
    }

    public final List<PointF> getCurrentCurveSpeedPoints() {
        NLETrackSlot nLETrackSlotLLLLLLIL;
        C0E48 c0e48 = this.editorContext;
        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) ((c0e48 == null || (nLETrackSlotLLLLLLIL = c0e48.LLLLLLIL()) == null) ? null : nLETrackSlotLLLLLLIL.getMainSegment()));
        if (nLESegmentVideoDynamicCast == null) {
            return C13BV.INSTANCE;
        }
        VecNLEPointSPtr segCurveSpeedPoints = nLESegmentVideoDynamicCast.getSegCurveSpeedPoints();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(segCurveSpeedPoints, 10));
        for (NLEPoint nLEPoint : segCurveSpeedPoints) {
            arrayList.add(new PointF(nLEPoint.getX(), nLEPoint.getY()));
        }
        if (!arrayList.isEmpty()) {
            NLECurveSpeedCalculator nLECurveSpeedCalculator = new NLECurveSpeedCalculator(nLESegmentVideoDynamicCast.getSeqCurveSpeedPoints());
            this.nleCurveSpeedCalculator = nLECurveSpeedCalculator;
            nLECurveSpeedCalculator.setSeqDuration(nLESegmentVideoDynamicCast.getDuration());
            return arrayList;
        }
        ResourceItem resourceItem = this.currentResourceItem;
        if (resourceItem == null) {
            return C13BV.INSTANCE;
        }
        List<PointF> resourceDefaultCurvePoints = getResourceDefaultCurvePoints(resourceItem);
        return resourceDefaultCurvePoints == null ? C13BV.INSTANCE : resourceDefaultCurvePoints;
    }

    public final String getCurrentCurveSpeedResId() {
        NLETrackSlot nLETrackSlotLLLLLLIL;
        String extra;
        C0E48 c0e48 = this.editorContext;
        return (c0e48 == null || (nLETrackSlotLLLLLLIL = c0e48.LLLLLLIL()) == null || !nLETrackSlotLLLLLLIL.hasExtra("ep_curve_speed_resource_id") || (extra = nLETrackSlotLLLLLLIL.getExtra("ep_curve_speed_resource_id")) == null) ? "" : extra;
    }

    public final MutableLiveData<C351080Dpa> getSlotSelectChangedEvent() {
        return (MutableLiveData) this.slotSelectChangedEvent$delegate.getValue();
    }

    public final MutableLiveData<C351090Dpb> getSpeedUpdate() {
        return (MutableLiveData) this.speedUpdate$delegate.getValue();
    }

    public final MutableLiveData<C351120Dpe> getTrackSelectChangedEvent() {
        return (MutableLiveData) this.trackSelectChangedEvent$delegate.getValue();
    }

    public final boolean hasSelectedCurveSpeed() {
        NLETrackSlot nLETrackSlotLLLLLLIL;
        C0E48 c0e48 = this.editorContext;
        return (c0e48 == null || (nLETrackSlotLLLLLLIL = c0e48.LLLLLLIL()) == null || !C351220Dpo.LJ(nLETrackSlotLLLLLLIL)) ? false : true;
    }

    public final void initWithContext() {
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        NLEModel nLEModelLLZ;
        C0E48 c0e48 = this.editorContext;
        if (c0e48 == null || (interfaceC351350Dq1LLFII = c0e48.LLFII()) == null || (nLEModelLLZ = interfaceC351350Dq1LLFII.LLZ()) == null) {
            return;
        }
        this.curveSpeedEnabled = ((Boolean) C288200BRi.LIZ.getValue()).booleanValue() || C361680EFy.LJJ(nLEModelLLZ) || isCurveSpeedEnableInPUGC();
    }

    public final boolean isCurveSpeed() {
        NLETrackSlot nLETrackSlotLLLLLLIL;
        C0E48 c0e48 = this.editorContext;
        return (c0e48 == null || (nLETrackSlotLLLLLLIL = c0e48.LLLLLLIL()) == null || !C351220Dpo.LJZ(nLETrackSlotLLLLLLIL)) ? false : true;
    }

    public final boolean isPlaying() {
        C0E55 player;
        C0E48 c0e48 = this.editorContext;
        if (c0e48 == null || (player = c0e48.getPlayer()) == null) {
            return false;
        }
        return player.isPlaying();
    }

    public final void onCurveSpeedClose() {
        this.curveSpeedDefaultPointsEngNameMap.clear();
        this.currentResourceItem = null;
        this.nleCurveSpeedCalculator = null;
        LiveDataBus.getInstance().with("key_mainViewModel", Integer.TYPE).removeObserver(this.pauseObserver);
    }

    public final void pausePlay() {
        C0E55 player;
        C0E48 c0e48 = this.editorContext;
        if (c0e48 != null && (player = c0e48.getPlayer()) != null) {
            player.pause(false);
        }
        this.acceptPlayerProgress = false;
    }

    public final List<PointF> resetCurveSpeed() {
        NLETrackSlot nLETrackSlotLLLLLLIL;
        ResourceItem resourceItem = this.currentResourceItem;
        if (resourceItem == null) {
            return C13BV.INSTANCE;
        }
        List<PointF> resourceDefaultCurvePoints = getResourceDefaultCurvePoints(resourceItem);
        if (resourceDefaultCurvePoints == null) {
            return C13BV.INSTANCE;
        }
        applyCurveSpeed(resourceDefaultCurvePoints);
        C0E48 c0e48 = this.editorContext;
        if (c0e48 != null) {
            C350870DpF.LIZ(c0e48, false);
        }
        C0E48 c0e482 = this.editorContext;
        if (c0e482 != null && (nLETrackSlotLLLLLLIL = c0e482.LLLLLLIL()) != null) {
            seekTo((nLETrackSlotLLLLLLIL.getStartTime() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) + 1, false);
        }
        return resourceDefaultCurvePoints;
    }

    public final void seekToPreviousPos() {
        NLETrackSlot nLETrackSlotLLLLLLIL;
        C0E55 player;
        C0E48 c0e48 = this.editorContext;
        if (c0e48 == null || (nLETrackSlotLLLLLLIL = c0e48.LLLLLLIL()) == null) {
            return;
        }
        long jSegDeltaToSeqDelta = segDeltaToSeqDelta(this.sourceOffsetBeforeEdit);
        C0E48 c0e482 = this.editorContext;
        if (c0e482 != null && (player = c0e482.getPlayer()) != null) {
            player.LJIJI(nLETrackSlotLLLLLLIL.getStartTime() + jSegDeltaToSeqDelta, C351110Dpd.LIZ);
        }
        this.sourceOffsetBeforeEdit = 0L;
    }

    public final long srcDuration() {
        NLETrackSlot nLETrackSlotLLLLLLIL;
        NLESegment mainSegment;
        NLESegmentVideo nLESegmentVideoDynamicCast;
        C0E48 c0e48 = this.editorContext;
        if (c0e48 == null || (nLETrackSlotLLLLLLIL = c0e48.LLLLLLIL()) == null || (mainSegment = nLETrackSlotLLLLLLIL.getMainSegment()) == null || (nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) mainSegment)) == null) {
            return 0L;
        }
        return nLESegmentVideoDynamicCast.getRawDuration();
    }

    public final void updateCurrentCurveSpeedInfo() {
        String name;
        MutableLiveData<C1889407ae> mutableLiveData = this.curveSpeedInfo;
        ResourceItem resourceItem = this.currentResourceItem;
        if (resourceItem == null || (name = resourceItem.getName()) == null) {
            name = "";
        }
        float fDstDuration = dstDuration();
        float f = LSPassThroughRecordSizeConfig.DEFAULT;
        mutableLiveData.setValue(new C1889407ae(Float.valueOf((fDstDuration / f) / f), Float.valueOf((srcDuration() / f) / f), name));
    }

    public SpeedViewModel() {
        EditModelProvider.Companion.getClass();
        this.editModel = C0E1T.LIZ().getEditModel();
        this.curveSpeedDefaultPointsEngNameMap = new LinkedHashMap();
        this.speedUpdate$delegate = C452501pT.LIZIZ(new AwS549S0100000_5(this, 740));
        this.slotSelectChangedEvent$delegate = C452501pT.LIZIZ(new AwS549S0100000_5(this, 739));
        this.trackSelectChangedEvent$delegate = C452501pT.LIZIZ(new AwS549S0100000_5(this, 741));
        this.pauseObserver = new AObserverS209S0100000_5(this, 81);
        this.videoOutputListener = new INLEListenerVideoOutput() { // from class: X.0Dw0
            @Override // com.bytedance.ies.nle.editor_jni.INLEListenerVideoOutput
            public final void onRefresh(int i, long j) {
                C354270Duj.LIZJ(0L, new C355020Dvw(this.LL, j, i));
            }
        };
    }

    public final boolean getAcceptPlayerProgress() {
        return this.acceptPlayerProgress;
    }

    public final MutableLiveData<Boolean> getChangeTone() {
        return this.changeTone;
    }

    public final ResourceItem getCurrentResourceItem() {
        return this.currentResourceItem;
    }

    public final boolean getCurveSpeedEnabled() {
        return this.curveSpeedEnabled;
    }

    public final MutableLiveData<C1889407ae> getCurveSpeedInfo() {
        return this.curveSpeedInfo;
    }

    public final boolean getEditPanelVisible() {
        return this.editPanelVisible;
    }

    public final MutableLiveData<Float> getPlayProgress() {
        return this.playProgress;
    }

    public final MutableLiveData<Boolean> getPlayState() {
        return this.playState;
    }

    public final MutableLiveData<Float> getSpeed() {
        return this.speed;
    }

    private final Pair<List<PointF>, String> extractResourceDefaultCurvePoints(ResourceItem resourceItem) {
        boolean z;
        String str = resourceItem.extra;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return new Pair<>(null, null);
        }
        try {
            C1227904rF c1227904rF = C1227904rF.LIZ;
            Type type = new TypeToken<List<? extends PointF>>() { // from class: X.0Dvz
            }.getType();
            String str2 = resourceItem.extra;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            String string = JSONObjectProtectorUtils.getString(new JSONObject(str2), "speed_points");
            String str4 = resourceItem.extra;
            if (str4 != null) {
                str3 = str4;
            }
            String string2 = JSONObjectProtectorUtils.getString(new JSONObject(str3), "english_name");
            c1227904rF.getClass();
            return new Pair<>(C1227904rF.LIZJ(string, type), string2);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
            return new Pair<>(null, null);
        }
    }

    private final List<PointF> getResourceDefaultCurvePoints(ResourceItem resourceItem) {
        if (this.curveSpeedDefaultPointsEngNameMap.get(resourceItem.getName()) == null) {
            this.curveSpeedDefaultPointsEngNameMap.put(resourceItem.getName(), extractResourceDefaultCurvePoints(resourceItem));
        }
        Pair<List<PointF>, String> pair = this.curveSpeedDefaultPointsEngNameMap.get(resourceItem.getName());
        if (pair != null) {
            return pair.getFirst();
        }
        return null;
    }

    private final void modifyExtraAfterAudioSpeed(NLETrack nLETrack) {
        if (Intrinsics.LJFF(nLETrack.getExtra("AudioTrackType"), "BGM")) {
            nLETrack.setExtra("AudioTrackType", "EDITOR_MUSIC");
        }
        if (!nLETrack.hasExtra("track_extra_is_audio_edit_speed")) {
            nLETrack.setExtra("track_extra_is_audio_edit_speed", "true");
        }
    }

    private final long segDeltaToSeqDelta(long j) {
        NLECurveSpeedCalculator nLECurveSpeedCalculator = this.nleCurveSpeedCalculator;
        if (nLECurveSpeedCalculator != null) {
            return nLECurveSpeedCalculator.segmentDelToSequenceDel(j);
        }
        return 1L;
    }

    public final void applyCurveSpeed(List<? extends PointF> list) {
        C0E48 c0e48;
        NLETrackSlot nLETrackSlotLLLLLLIL;
        NLESegmentVideo nLESegmentVideoDynamicCast;
        long maxEnd;
        NLETrackSlot nLETrackSlotLLLLLLIL2;
        NLETrack trackBySlot;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII2;
        NLETrack nLETrackRn;
        this.acceptPlayerProgress = false;
        ResourceItem resourceItem = this.currentResourceItem;
        if (resourceItem != null && (c0e48 = this.editorContext) != null && (nLETrackSlotLLLLLLIL = c0e48.LLLLLLIL()) != null && (nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlotLLLLLLIL.getMainSegment())) != null) {
            C0E48 c0e482 = this.editorContext;
            if (c0e482 != null && (nLETrackRn = c0e482.Rn()) != null) {
                maxEnd = nLETrackRn.getMaxEnd();
            } else {
                maxEnd = 0;
            }
            String name = resourceItem.getName();
            Companion.getClass();
            C350730Dp1 c350730Dp1 = new C350730Dp1(list, name, C354130DuV.LIZ(resourceItem), resourceItem.getResourceId(), EnumC356090Dxf.VIDEO);
            C0E48 c0e483 = this.editorContext;
            if (c0e483 != null && (interfaceC351350Dq1LLFII2 = c0e483.LLFII()) != null) {
                interfaceC351350Dq1LLFII2.LLIIJLIL(nLETrackSlotLLLLLLIL, c350730Dp1, EnumC356070Dxd.NONE);
            }
            nLETrackSlotLLLLLLIL.setExtra("is_editor_pro_speed_used", "true");
            if (!list.isEmpty()) {
                NLECurveSpeedCalculator nLECurveSpeedCalculator = new NLECurveSpeedCalculator(nLESegmentVideoDynamicCast.getSeqCurveSpeedPoints());
                this.nleCurveSpeedCalculator = nLECurveSpeedCalculator;
                nLECurveSpeedCalculator.setSeqDuration(nLETrackSlotLLLLLLIL.getDuration());
            }
            updateCurrentCurveSpeedInfo();
            C0E48 c0e484 = this.editorContext;
            if (c0e484 != null) {
                NLEModel nLEModelLJI = C350870DpF.LJI(c0e484);
                C351510DqH c351510DqH = C351510DqH.LIZ;
                C0E48 c0e485 = this.editorContext;
                String name2 = resourceItem.getName();
                c351510DqH.getClass();
                C351510DqH.LJIILIIL(c0e485, nLEModelLJI, nLETrackSlotLLLLLLIL, list, name2);
                C350110Do1.LIZJ.getClass();
                NLETrackSlot nLETrackSlotLIZIZ = C347000Dj0.LIZIZ(nLEModelLJI, nLETrackSlotLLLLLLIL);
                if (nLETrackSlotLIZIZ != null) {
                    C350730Dp1 c350730Dp12 = new C350730Dp1(list, resourceItem.getName(), EnumC356090Dxf.AUDIO);
                    C0E48 c0e486 = this.editorContext;
                    if (c0e486 != null && (interfaceC351350Dq1LLFII = c0e486.LLFII()) != null) {
                        interfaceC351350Dq1LLFII.LLIIJLIL(nLETrackSlotLIZIZ, c350730Dp12, EnumC356070Dxd.NONE);
                    }
                    C350110Do1.LJII(nLEModelLJI);
                }
                C0E48 c0e487 = this.editorContext;
                if (c0e487 != null && (nLETrackSlotLLLLLLIL2 = c0e487.LLLLLLIL()) != null && (trackBySlot = nLEModelLJI.getTrackBySlot(nLETrackSlotLLLLLLIL2)) != null && C350870DpF.LJIIIIZZ(trackBySlot) == NLETrackType.VIDEO) {
                    adjustAfterVideoSpeed(maxEnd, null);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void changeCurveSpeedEditPanelVisibility(boolean r7) {
        /*
            r6 = this;
            boolean r0 = r6.editPanelVisible
            if (r7 != r0) goto L5
            return
        L5:
            r6.editPanelVisible = r7
            if (r7 == 0) goto L78
            r6.pausePlay()
            r0 = 0
            r6.acceptPlayerProgress = r0
            X.0E48 r0 = r6.editorContext
            if (r0 == 0) goto L65
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r5 = r0.LLLLLLIL()
            if (r5 == 0) goto L65
            X.0E48 r0 = r6.editorContext
            if (r0 == 0) goto L75
            X.0E55 r0 = r0.getPlayer()
            if (r0 == 0) goto L75
            long r0 = r0.Jh()
            com.bytedance.ies.nle.editor_jni.NLECurveSpeedCalculator r4 = r6.nleCurveSpeedCalculator
            if (r4 == 0) goto L75
            long r2 = X.C351220Dpo.LLLLLLJ(r0)
            long r0 = r5.getStartTime()
            long r2 = r2 - r0
            long r0 = r4.sequenceDelToSegmentDel(r2)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            if (r0 == 0) goto L75
            long r0 = r0.longValue()
        L42:
            r6.sourceOffsetBeforeEdit = r0
            X.0E48 r0 = r6.editorContext
            if (r0 == 0) goto L5b
            X.0E55 r4 = r0.getPlayer()
            if (r4 == 0) goto L5b
            long r2 = r5.getStartTime()
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0
            long r2 = r2 + r0
            X.0Dpd r0 = X.C351110Dpd.LIZ
            r4.LJIJI(r2, r0)
        L5b:
            androidx.lifecycle.MutableLiveData<java.lang.Float> r1 = r6.playProgress
            r0 = 0
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r1.setValue(r0)
        L65:
            X.0E48 r0 = r6.editorContext
            if (r0 == 0) goto L74
            X.0E55 r1 = r0.getPlayer()
            if (r1 == 0) goto L74
            com.bytedance.ies.nle.editor_jni.INLEListenerVideoOutput r0 = r6.videoOutputListener
            r1.LJJ(r0)
        L74:
            return
        L75:
            r0 = 0
            goto L42
        L78:
            X.0E48 r0 = r6.editorContext
            if (r0 == 0) goto L74
            X.0E55 r1 = r0.getPlayer()
            if (r1 == 0) goto L74
            com.bytedance.ies.nle.editor_jni.INLEListenerVideoOutput r0 = r6.videoOutputListener
            r1.LJJIII(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editorpro.capabilities.video.speed.common.SpeedViewModel.changeCurveSpeedEditPanelVisibility(boolean):void");
    }

    public final String getResourceEngName(ResourceItem resourceItem) {
        if (this.curveSpeedDefaultPointsEngNameMap.get(resourceItem.getName()) == null) {
            this.curveSpeedDefaultPointsEngNameMap.put(resourceItem.getName(), extractResourceDefaultCurvePoints(resourceItem));
        }
        Pair<List<PointF>, String> pair = this.curveSpeedDefaultPointsEngNameMap.get(resourceItem.getName());
        if (pair != null) {
            return pair.getSecond();
        }
        return null;
    }

    public final void onCurveSpeedOpen(LifecycleOwner lifecycleOwner) {
        LiveDataBus.getInstance().with("key_mainViewModel", Integer.TYPE).observe(lifecycleOwner, this.pauseObserver);
    }

    public final void setAcceptPlayerProgress(boolean z) {
        this.acceptPlayerProgress = z;
    }

    public final void setCurveSpeedEnabled(boolean z) {
        this.curveSpeedEnabled = z;
    }

    public final void updateCurrentCurveSpeedInfoBySpeed(float f) {
        String name;
        MutableLiveData<C1889407ae> mutableLiveData = this.curveSpeedInfo;
        ResourceItem resourceItem = this.currentResourceItem;
        if (resourceItem == null || (name = resourceItem.getName()) == null) {
            name = "";
        }
        float f2 = LSPassThroughRecordSizeConfig.DEFAULT;
        mutableLiveData.setValue(new C1889407ae(Float.valueOf(((srcDuration() / f) / f2) / f2), Float.valueOf((srcDuration() / f2) / f2), name));
    }

    public final void updateCurvedSpeedResourceInfo(ResourceItem resourceItem) {
        this.currentResourceItem = resourceItem;
        updateCurrentCurveSpeedInfo();
    }

    private final void adjustAfterAudioSpeed(NLETrack nLETrack, NLETrackSlot nLETrackSlot) {
        C0E48 c0e48 = this.editorContext;
        if (c0e48 == null) {
            return;
        }
        NLETrackType nLETrackTypeLJIIIIZZ = C350870DpF.LJIIIIZZ(nLETrack);
        NLETrackType nLETrackType = NLETrackType.AUDIO;
        if (nLETrackTypeLJIIIIZZ == nLETrackType && !Intrinsics.LJFF(nLETrack.getExtra("AudioTrackType"), "ORIGIN")) {
            long measuredEndTime = nLETrackSlot.getMeasuredEndTime();
            long j = LSPassThroughRecordSizeConfig.DEFAULT;
            if (measuredEndTime / j > c0e48.Rn().getMeasuredEndTime() / j) {
                nLETrackSlot.setMeasuredEndTime(c0e48.Rn().getMeasuredEndTime());
                nLETrackSlot.setEndTime(c0e48.Rn().getMeasuredEndTime());
            }
            int size = nLETrack.getSortedSlots().size();
            int iIndexOf = nLETrack.getSortedSlots().indexOf(nLETrackSlot);
            if (iIndexOf >= 0 && iIndexOf < size - 1 && nLETrackSlot.getMeasuredEndTime() > nLETrack.getSortedSlots().get(iIndexOf + 1).getMeasuredStartTime()) {
                int layer = nLETrack.getLayer() + 1;
                C351510DqH c351510DqH = C351510DqH.LIZ;
                NLEModel nLEModelLJI = C350870DpF.LJI(c0e48);
                c351510DqH.getClass();
                nLETrack.removeSlot(nLETrackSlot);
                if (Intrinsics.LJFF(nLETrack.getExtra("AudioTrackType"), "BGM")) {
                    nLETrack.setExtra("AudioTrackType", "EDITOR_MUSIC");
                }
                NLETrack nLETrack2 = new NLETrack();
                nLETrack2.setMainTrack(false);
                nLETrack2.setExtra("track_type", "audio");
                nLETrack2.setExtraTrackType(nLETrackType);
                nLETrack2.setLayer(layer);
                nLETrack2.addSlot(nLETrackSlot);
                nLETrack2.setExtra("track_layer", String.valueOf(layer));
                List<NLETrack> listLJIJJ = C351220Dpo.LJIJJ(nLEModelLJI);
                ArrayList<NLETimeSpaceNode> arrayList = new ArrayList();
                for (Object obj : (ArrayList) listLJIJJ) {
                    if (((NLETimeSpaceNode) obj).getLayer() >= layer) {
                        arrayList.add(obj);
                    }
                }
                if (!arrayList.isEmpty()) {
                    for (NLETimeSpaceNode nLETimeSpaceNode : arrayList) {
                        nLETimeSpaceNode.setLayer(nLETimeSpaceNode.getLayer() + 1);
                    }
                }
                nLEModelLJI.addTrack(nLETrack2);
                c0e48.S7().LIZIZ(new C358740E4q(nLETrackSlot, 0, null, false, 0, 254), "select_slot_event", false);
            }
            NLESegmentAudio nLESegmentAudio = (NLESegmentAudio) NLESegmentAudio.class.getMethod("dynamicCast", NLENode.class).invoke(null, nLETrackSlot.getMainSegment());
            if (nLESegmentAudio != null) {
                long j2 = 2;
                if (nLESegmentAudio.getFadeInLength() > nLETrackSlot.getDuration() / j2) {
                    nLESegmentAudio.setFadeInLength(nLETrackSlot.getDuration() / j2);
                }
                if (nLESegmentAudio.getFadeOutLength() > nLETrackSlot.getDuration() / j2) {
                    nLESegmentAudio.setFadeOutLength(nLETrackSlot.getDuration() / j2);
                }
            }
        }
    }

    public final void adjustAfterVideoSpeed(long j, NLETrack nLETrack) {
        NLETrackSlot nLETrackSlotLLLLLLIL;
        long endTime;
        NLESegment mainSegment;
        NLETrack next;
        NLETrackSlot nLETrackSlot;
        C0E48 c0e48 = this.editorContext;
        if (c0e48 == null) {
            return;
        }
        if (nLETrack != null || (nLETrack = c0e48.Pt()) != null) {
            if (!nLETrack.hasExtra("track_extra_is_video_edit_speed")) {
                nLETrack.setExtra("track_extra_is_video_edit_speed", "true");
            }
            if (nLETrack.getMainTrack()) {
                c0e48.Rn().timeSort();
                if (!C349940Dnk.LIZ(c0e48, this.editModel)) {
                    C351510DqH c351510DqH = C351510DqH.LIZ;
                    NLEModel nLEModelLJI = C350870DpF.LJI(c0e48);
                    c351510DqH.getClass();
                    Iterator<NLETrack> it2 = nLEModelLJI.getTracks().iterator();
                    while (true) {
                        mainSegment = null;
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (C351220Dpo.LLILLL(next)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    NLETrack nLETrack2 = next;
                    if (nLETrack2 != null && nLETrack2.getSortedSlots().size() > 1) {
                        VecNLETrackSlotSPtr sortedSlots = nLETrack2.getSortedSlots();
                        if (sortedSlots != null) {
                            nLETrackSlot = (NLETrackSlot) C13LP.LJJJLL(sortedSlots);
                            if (nLETrackSlot != null) {
                                mainSegment = nLETrackSlot.getMainSegment();
                            }
                        } else {
                            nLETrackSlot = null;
                        }
                        NLESegmentAudio.dynamicCast(mainSegment);
                        if (nLETrackSlot != null && ((NLETimeSpaceNode) C13LP.LJJLIIIJJI(nLETrack2.getSortedSlots())).getEndTime() < nLEModelLJI.getMainTrack().getMaxEnd()) {
                            ((NLETimeSpaceNode) C13LP.LJJLIIIJJI(nLETrack2.getSortedSlots())).setEndTime(((NLETimeSpaceNode) C13LP.LJJLIIIJJI(nLETrack2.getSortedSlots())).getStartTime() + nLETrackSlot.getMainSegment().getResource().getDuration());
                            if (((NLETimeSpaceNode) C13LP.LJJLIIIJJI(nLETrack2.getSortedSlots())).getEndTime() < nLEModelLJI.getMainTrack().getMaxEnd()) {
                                while (((NLETimeSpaceNode) C13LP.LJJLIIIJJI(nLETrack2.getSortedSlots())).getEndTime() < nLEModelLJI.getMainTrack().getMaxEnd()) {
                                    NLENode nLENodeDeepClone = nLETrackSlot.deepClone(true);
                                    nLETrackSlot.setStartTime(((NLETimeSpaceNode) C13LP.LJJLIIIJJI(nLETrack2.getSortedSlots())).getEndTime());
                                    nLETrackSlot.setEndTime(nLETrackSlot.getStartTime() + nLETrackSlot.getMainSegment().getResource().getDuration());
                                    nLETrack2.addSlot(NLETrackSlot.dynamicCast(nLENodeDeepClone));
                                }
                            }
                            NLETimeSpaceNode nLETimeSpaceNode = (NLETimeSpaceNode) C13LP.LJJLIIIJL(nLETrack2.getSortedSlots());
                            if (nLETimeSpaceNode != null) {
                                nLETimeSpaceNode.setEndTime(nLEModelLJI.getMainTrack().getMaxEnd());
                            }
                        }
                    }
                }
                if (!((Boolean) C0E5G.LIZIZ(EnumC357850E1f.ENABLE_OPERATE_CAUSE_BLACK_SLOT, Boolean.TRUE)).booleanValue()) {
                    C351510DqH.LJIIIZ(C351510DqH.LIZ, c0e48);
                }
                if (c0e48.Rn().getMaxEnd() > j) {
                    C351510DqH.LIZ.getClass();
                    C351510DqH.LIZIZ(j, c0e48);
                    return;
                }
                return;
            }
            if (!((Boolean) C0E5G.LIZIZ(EnumC357850E1f.ENABLE_OPERATE_CAUSE_BLACK_SLOT, Boolean.TRUE)).booleanValue() && (nLETrackSlotLLLLLLIL = c0e48.LLLLLLIL()) != null) {
                long maxEnd = c0e48.Rn().getMaxEnd();
                if (nLETrackSlotLLLLLLIL.getEndTime() > maxEnd) {
                    float fLJLILLLLZI = C351220Dpo.LJLILLLLZI(nLETrackSlotLLLLLLIL.getMainSegment());
                    if (C351220Dpo.LJZ(nLETrackSlotLLLLLLIL)) {
                        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlotLLLLLLIL.getMainSegment());
                        if (nLESegmentVideoDynamicCast != null) {
                            NLECurveSpeedCalculator nLECurveSpeedCalculator = new NLECurveSpeedCalculator(nLESegmentVideoDynamicCast.getSeqCurveSpeedPoints());
                            nLECurveSpeedCalculator.setSeqDuration(nLETrackSlotLLLLLLIL.getDuration());
                            endTime = (nLESegmentVideoDynamicCast.getTimeClipEnd() - nLESegmentVideoDynamicCast.getTimeClipStart()) - ((long) ((maxEnd - nLETrackSlotLLLLLLIL.getStartTime()) * nLECurveSpeedCalculator.getAveCurveSpeedRatio()));
                        } else {
                            endTime = 0;
                        }
                    } else {
                        endTime = (long) ((nLETrackSlotLLLLLLIL.getEndTime() - maxEnd) * fLJLILLLLZI);
                    }
                    nLETrackSlotLLLLLLIL.setEndTime(maxEnd);
                    NLESegmentVideo nLESegmentVideoDynamicCast2 = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlotLLLLLLIL.getMainSegment());
                    if (nLESegmentVideoDynamicCast2 != null) {
                        nLESegmentVideoDynamicCast2.setTimeClipEnd(nLESegmentVideoDynamicCast2.getTimeClipEnd() - endTime);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        if (r0 == null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean applyCurveSpeedResource(com.ss.ugc.android.editor.base.resource.ResourceItem r11, X.C19EG r12) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editorpro.capabilities.video.speed.common.SpeedViewModel.applyCurveSpeedResource(com.ss.ugc.android.editor.base.resource.ResourceItem, X.19EG):boolean");
    }

    public final void seekTo(long j, boolean z) {
        C0E55 player;
        C0E48 c0e48 = this.editorContext;
        if (c0e48 != null && (player = c0e48.getPlayer()) != null) {
            player.LIZIZ(j);
        }
        if (z) {
            startPlay();
        }
    }

    public final void seekToFromSegDelta(float f, boolean z) {
        NLETrackSlot nLETrackSlotLLLLLLIL;
        C0E48 c0e48 = this.editorContext;
        if (c0e48 != null && (nLETrackSlotLLLLLLIL = c0e48.LLLLLLIL()) != null) {
            long jSegDeltaToSeqDelta = segDeltaToSeqDelta((long) (srcDuration() * f)) + nLETrackSlotLLLLLLIL.getStartTime();
            long startTime = nLETrackSlotLLLLLLIL.getStartTime();
            long j = LSPassThroughRecordSizeConfig.DEFAULT;
            seekTo(C351220Dpo.LLLLLLL(C419990GdR.LIZJ(jSegDeltaToSeqDelta, startTime + j, nLETrackSlotLLLLLLIL.getEndTime() - j)), z);
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.0Dvx] */
    public final void applyNormalSpeed(Float f, Boolean bool, boolean z, boolean z2, NLETrackSlot nLETrackSlot) {
        NLEResourceNode resource;
        NLEResType resourceType;
        INLEMediaSettings mediaSettingApi;
        C0E48 c0e48 = this.editorContext;
        if (c0e48 == null) {
            return;
        }
        if (nLETrackSlot == null && (nLETrackSlot = c0e48.LLLLLLIL()) == null) {
            return;
        }
        C351510DqH.LIZ.getClass();
        if (C351510DqH.LJJIL(nLETrackSlot)) {
            resource = C351510DqH.LJJIIJZLJL(nLETrackSlot);
        } else {
            NLESegment mainSegment = nLETrackSlot.getMainSegment();
            if (mainSegment != null) {
                resource = mainSegment.getResource();
            } else {
                return;
            }
        }
        if (resource != null && (resourceType = resource.getResourceType()) != null) {
            C350740Dp2 c350740Dp2 = new C350740Dp2(f, bool, z, new InterfaceC350750Dp3() { // from class: X.0Dvx
                @Override // X.InterfaceC350750Dp3
                public final void LIZ(float f2, boolean z3) {
                    this.LIZ.getSpeed().setValue(Float.valueOf(f2));
                    this.LIZ.getChangeTone().setValue(Boolean.valueOf(z3));
                }
            });
            long maxEnd = c0e48.Rn().getMaxEnd();
            if (!C351220Dpo.LLILII(nLETrackSlot) && resourceType != NLEResType.VIDEO) {
                if (resourceType != NLEResType.AUDIO && resourceType != NLEResType.ALGORITHM_AUDIO) {
                    return;
                } else {
                    c0e48.LLFII().LLILL(nLETrackSlot, c350740Dp2, EnumC356070Dxd.NONE);
                }
            } else {
                c0e48.LLFII().LJJJJJ(nLETrackSlot, c350740Dp2, EnumC356070Dxd.NONE);
            }
            NLETrack trackBySlot = C350870DpF.LJI(c0e48).getTrackBySlot(nLETrackSlot);
            if (trackBySlot != null) {
                if (C350870DpF.LJIIIIZZ(trackBySlot) == NLETrackType.AUDIO) {
                    modifyExtraAfterAudioSpeed(trackBySlot);
                    adjustAfterAudioSpeed(trackBySlot, nLETrackSlot);
                } else if (C350870DpF.LJIIIIZZ(trackBySlot) == NLETrackType.VIDEO || C351220Dpo.LLILII(nLETrackSlot)) {
                    NLETrack nLETrackPt = c0e48.Pt();
                    if (nLETrackPt != null) {
                        trackBySlot = nLETrackPt;
                    }
                    adjustAfterVideoSpeed(maxEnd, trackBySlot);
                }
            }
            if (z2) {
                C350870DpF.LIZ(c0e48, false);
            }
            INLEMediaSession iNLEMediaSessionF1 = c0e48.f1();
            if (iNLEMediaSessionF1 != null && (mediaSettingApi = iNLEMediaSessionF1.getMediaSettingApi()) != null) {
                mediaSettingApi.setPreviewFps(30, true);
            }
        }
    }
}
