package com.ss.android.ugc.gamora.editorpro.capabilities.video.speed;

import X.AbstractC349500Dn2;
import X.C01GW;
import X.C0E1T;
import X.C0E47;
import X.C0E48;
import X.C0E5G;
import X.C0E5S;
import X.C0EBE;
import X.C0ECR;
import X.C0EG9;
import X.C0LAB;
import X.C13LP;
import X.C1664600tQ2;
import X.C1782380wU0;
import X.C1826520xdC;
import X.C19A3;
import X.C1DRG;
import X.C20632315oP;
import X.C20684815ws;
import X.C2188811AlT;
import X.C301800BsI;
import X.C306370Bzf;
import X.C346680DiU;
import X.C349470Dmz;
import X.C349510Dn3;
import X.C350110Do1;
import X.C350410DoV;
import X.C350740Dp2;
import X.C350870DpF;
import X.C351080Dpa;
import X.C351220Dpo;
import X.C351510DqH;
import X.C355090Dw3;
import X.C356700Dye;
import X.C357780E0y;
import X.C358740E4q;
import X.C361680EFy;
import X.C364210EPr;
import X.C418440Gaw;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1119280fEU;
import X.EnumC1119290fEV;
import X.EnumC357140DzM;
import X.EnumC357850E1f;
import X.InterfaceC1119310fEX;
import X.InterfaceC350750Dp3;
import X.InterfaceC360800ECo;
import X.InterfaceC364230EPt;
import Y.ACListenerS140S0100000_5;
import Y.AObserverS209S0100000_5;
import Y.ATListenerS439S0100000_5;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.als.FeatureAlsLogicContainer;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.INLEMediaSettings;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoAnimation;
import com.bytedance.ies.nle.editor_jni.VecNLEVideoAnimationSPtr;
import com.bytedance.scene.Scene;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.capabilities.video.speed.SpeedFragment;
import com.ss.android.ugc.gamora.editorpro.capabilities.video.speed.common.SpeedNormalFragment;
import com.ss.android.ugc.gamora.editorpro.capabilities.video.speed.common.SpeedViewModel;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment;
import com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.TTResourcePanelFragment;
import com.ss.ugc.android.editor.core.tracklinkage.TrackLinkageManagerProvider;
import com.zhiliaoapp.musically.R;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS234S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class SpeedFragment extends TTResourcePanelFragment<SpeedViewModel> {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiItJCAhKWspLSYnJzc8OyB9KyHELIOSQ8KC06JCw4ICogZjMlLSo8ZjY8LCo3ZhY8LCo3DjctLiI2JjE=";
    public C20632315oP LLLFFI;
    public ConstraintLayout LLLFZ;
    public ConstraintLayout LLLI;
    public FrameLayout LLLII;
    public FrameLayout LLLIIII;
    public C1826520xdC LLLIIIIL;
    public ConstraintLayout LLLIIIL;
    public C0E5S LLLIILIL;
    public InterfaceC360800ECo LLLILZ;
    public Long LLLILZJ;
    public Pair<Long, Long> LLLILZLLLI;
    public int LLLIZZ;
    public final C01GW LLLIIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 736));
    public final C01GW LLLIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 735));

    @Override // com.ss.ugc.android.editor.bottom.panel.BasePanelFragment
    public final int RR() {
        return R.layout.c2i;
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final String qS() {
        return "speed_panel";
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final ViewModel QS() {
        ConcurrentHashMap<String, InterfaceC364230EPt> concurrentHashMap = C364210EPr.LIZ;
        return C364210EPr.LIZIZ(SpeedViewModel.class);
    }

    public final ConstraintLayout jT() {
        View viewFindViewById = this.LLLI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.e1v) : null;
            this.LLLI = (ConstraintLayout) viewFindViewById;
        }
        return (ConstraintLayout) viewFindViewById;
    }

    public final FrameLayout kT() {
        View viewFindViewById = this.LLLII;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.pp_) : null;
            this.LLLII = (FrameLayout) viewFindViewById;
        }
        return (FrameLayout) viewFindViewById;
    }

    public final C1826520xdC lT() {
        View viewFindViewById = this.LLLIIIIL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.uju) : null;
            this.LLLIIIIL = (C1826520xdC) viewFindViewById;
        }
        return (C1826520xdC) viewFindViewById;
    }

    public final C0ECR mT() {
        return (C0ECR) this.LLLIIL.getValue();
    }

    public final C20632315oP nT() {
        View viewFindViewById = this.LLLFFI;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.viewPager) : null;
            this.LLLFFI = (C20632315oP) viewFindViewById;
        }
        return (C20632315oP) viewFindViewById;
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C0E5S c0e5s = this.LLLIILIL;
        if (c0e5s != null) {
            c0e5s.yV(AFwS234S0000000_5.get$arr$(327));
        }
        super.onDestroy();
    }

    public final void pT() {
        Pair<Long, Long> pairCopy$default;
        Long l = this.LLLILZJ;
        if (l != null) {
            long jCurrentTimeMillis = System.currentTimeMillis() - l.longValue();
            if (this.LLLIZZ == 0) {
                Pair<Long, Long> pair = this.LLLILZLLLI;
                pairCopy$default = Pair.copy$default(pair, Long.valueOf(pair.getFirst().longValue() + jCurrentTimeMillis), null, 2, null);
            } else {
                Pair<Long, Long> pair2 = this.LLLILZLLLI;
                pairCopy$default = Pair.copy$default(pair2, null, Long.valueOf(pair2.getSecond().longValue() + jCurrentTimeMillis), 1, null);
            }
            this.LLLILZLLLI = pairCopy$default;
        }
        this.LLLILZJ = Long.valueOf(System.currentTimeMillis());
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final boolean uS() {
        return ((Boolean) this.LLLIL.getValue()).booleanValue();
    }

    public SpeedFragment() {
        EditModelProvider.Companion.getClass();
        C0E1T.LIZ().getEditModel();
        this.LLLILZLLLI = new Pair<>(0L, 0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.bytedance.ies.nle.editor_jni.NLEEditor] */
    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final boolean FS() {
        AbstractC349500Dn2 businessTrackLinkageManager;
        INLEMediaSettings mediaSettingApi;
        SpeedNormalFragment speedNormalFragmentLLLJ = mT().LLLJ();
        C0E48 c0e48 = speedNormalFragmentLLLJ.LL;
        boolean z = false;
        if (c0e48 != null) {
            NLETrackSlot nLETrackSlotLLLLLLIL = c0e48.LLLLLLIL();
            if (nLETrackSlotLLLLLLIL != null && nLETrackSlotLLLLLLIL.getMainSegment().getType() != NLEResType.IMAGE) {
                nLETrackSlotLLLLLLIL.setExtra("is_editor_pro_speed_used", "true");
                float fLLIZLLLIL = c0e48.LLFII().LLIZLLLIL();
                long maxEnd = c0e48.Rn().getMaxEnd();
                C351510DqH c351510DqH = C351510DqH.LIZ;
                NLETrack nLETrack = null;
                C350740Dp2 c350740Dp2 = new C350740Dp2(Float.valueOf(fLLIZLLLIL), Boolean.TRUE, false, null);
                NLEModel nLEModelLJI = C350870DpF.LJI(c0e48);
                c351510DqH.getClass();
                ArrayList arrayList = new ArrayList();
                NLEModel nLEModelDynamicCast = NLEModel.dynamicCast(C350870DpF.LJI(c0e48).deepClone());
                for (NLETrackSlot nLETrackSlot : nLEModelLJI.getMainTrack().getSortedSlots()) {
                    if (nLETrackSlot != null) {
                        INLEMediaSession iNLEMediaSessionF1 = c0e48.f1();
                        if (iNLEMediaSessionF1 != null && (mediaSettingApi = iNLEMediaSessionF1.getMediaSettingApi()) != null) {
                            mediaSettingApi.setPreviewFps(30);
                        }
                        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
                        if (nLESegmentVideoDynamicCast != null) {
                            NLEResourceNode resource = nLESegmentVideoDynamicCast.getResource();
                            if ((resource != null ? resource.getResourceType() : nLETrack) != NLEResType.IMAGE) {
                                Float f = c350740Dp2.LIZ;
                                float fFloatValue = f != null ? f.floatValue() : nLESegmentVideoDynamicCast.getAbsSpeed();
                                Boolean bool = c350740Dp2.LIZIZ;
                                boolean zBooleanValue = bool != null ? bool.booleanValue() : nLESegmentVideoDynamicCast.getKeepTone();
                                NLETrackSlot nLETrackSlotDynamicCast = NLETrackSlot.dynamicCast(nLETrackSlot.deepClone());
                                if (!c350740Dp2.LIZJ) {
                                    c0e48.getPlayer().pause(z);
                                    long timeClipEnd = nLESegmentVideoDynamicCast.getTimeClipEnd() - nLESegmentVideoDynamicCast.getTimeClipStart();
                                    float f2 = timeClipEnd;
                                    float fLongValue = ((Number) C0E5G.LIZIZ(EnumC357850E1f.VIDEO_CLIP_MIN_DURATION, 100L)).longValue();
                                    if ((f2 / fFloatValue) / 1000.0f < fLongValue) {
                                        nLESegmentVideoDynamicCast.setAbsSpeed((f2 / 1000.0f) / fLongValue);
                                    } else {
                                        nLESegmentVideoDynamicCast.setAbsSpeed(fFloatValue);
                                    }
                                    long absSpeed = (long) (f2 / nLESegmentVideoDynamicCast.getAbsSpeed());
                                    nLETrackSlot.setEndTime(nLETrackSlot.getStartTime() + absSpeed);
                                    if (absSpeed < 200000) {
                                        nLETrackSlot.setEndTransition(null);
                                        NLETrackSlot nLETrackSlot2 = (NLETrackSlot) C13LP.LJJJLZIJ(c0e48.Rn().getSortedSlots().indexOf(nLETrackSlot) - 1, c0e48.Rn().getSortedSlots());
                                        if (nLETrackSlot2 != null) {
                                            nLETrackSlot2.setEndTransition(null);
                                        }
                                    }
                                    C351510DqH.LIZ.getClass();
                                    VecNLEVideoAnimationSPtr videoAnims = nLETrackSlot.getVideoAnims();
                                    if (videoAnims != null) {
                                        for (NLEVideoAnimation nLEVideoAnimation : videoAnims) {
                                            nLEVideoAnimation.setEndTime(nLEVideoAnimation.getStartTime() + ((long) ((nLEVideoAnimation.getEndTime() - nLEVideoAnimation.getStartTime()) / fFloatValue)));
                                        }
                                    }
                                    nLESegmentVideoDynamicCast.setKeepTone(zBooleanValue);
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("video slot apply speed：nleSpeed=");
                                    sbLIZ.append(fFloatValue);
                                    sbLIZ.append(", duration=");
                                    sbLIZ.append(timeClipEnd);
                                    sbLIZ.append(", endTime=");
                                    sbLIZ.append(nLETrackSlot.getEndTime());
                                    C355090Dw3.LIZIZ("NLE-Shadow", C2188811AlT.LIZIZ(sbLIZ));
                                    C350110Do1.LJIILJJIL(C350870DpF.LJI(c0e48), nLETrackSlot, c350740Dp2);
                                }
                                if (nLESegmentVideoDynamicCast.getCurveAveSpeed() != 1.0d) {
                                    nLESegmentVideoDynamicCast.clearSegCurveSpeedPoint();
                                    nLETrackSlot.removeExtraWithKey("ep_curve_speed_resource_id");
                                    nLETrackSlot.removeExtraWithKey("ep_curve_speed_name");
                                    nLETrackSlot.removeExtraWithKey("ep_curve_speed_english_name");
                                }
                                arrayList.add(new C349470Dmz(nLETrackSlotDynamicCast, nLETrackSlot, null, null, 28));
                                InterfaceC350750Dp3 interfaceC350750Dp3 = c350740Dp2.LIZLLL;
                                if (interfaceC350750Dp3 != null) {
                                    interfaceC350750Dp3.LIZ(fFloatValue, zBooleanValue);
                                }
                            }
                        }
                    }
                    z = false;
                    nLETrack = null;
                }
                TrackLinkageManagerProvider.Companion.getClass();
                TrackLinkageManagerProvider trackLinkageManagerProviderLIZ = C356700Dye.LIZ();
                if (trackLinkageManagerProviderLIZ != null && (businessTrackLinkageManager = trackLinkageManagerProviderLIZ.getBusinessTrackLinkageManager()) != null) {
                    c0e48.Rn().timeSort();
                    businessTrackLinkageManager.LIZJ(new C349510Dn3("speed_video", arrayList, nLEModelDynamicCast));
                }
                speedNormalFragmentLLLJ.aS().adjustAfterVideoSpeed(maxEnd, nLETrack);
                C350870DpF.LIZ(c0e48, false);
                VideoPublishEditModel videoPublishEditModelZR = speedNormalFragmentLLLJ.ZR();
                if (videoPublishEditModelZR != null) {
                    Float value = speedNormalFragmentLLLJ.aS().getSpeed().getValue();
                    float fFloatValue2 = value != null ? value.floatValue() : 1.0f;
                    DecimalFormat decimalFormat = new DecimalFormat("0.#");
                    decimalFormat.setRoundingMode(RoundingMode.FLOOR);
                    String str = decimalFormat.format(Float.valueOf(fFloatValue2));
                    C0LAB c0labLJFF = C361680EFy.LJFF(-1L, videoPublishEditModelZR, c0e48, new Pair(-1, -1));
                    c0labLJFF.LJ("track_type", C361680EFy.LJIL(c0e48));
                    c0labLJFF.LJ("rate", str);
                    C20684815ws.LJIILLIIL("click_speed_apply_to_all", c0labLJFF.LIZ);
                }
                speedNormalFragmentLLLJ.LLJ = true;
                speedNormalFragmentLLLJ.LLJI = true;
                if (!C301800BsI.LIZ()) {
                    return true;
                }
                C0E48 c0e482 = speedNormalFragmentLLLJ.LL;
                ?? LJI = nLETrack;
                if (c0e482 != null) {
                    LJI = c0e482.LLFII().LJI();
                }
                C350410DoV.LIZLLL(LJI, true, speedNormalFragmentLLLJ.VR(), true, true);
                return true;
            }
            speedNormalFragmentLLLJ.dS();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final void HS() {
        VideoPublishEditModel videoPublishEditModelZS;
        NLETrackSlot next;
        C0E48 c0e48;
        NLETrack trackBySlot;
        NLETrack trackBySlot2;
        if (((SpeedViewModel) wS()).getEditPanelVisible()) {
            return;
        }
        C0E48 c0e482 = this.LL;
        if (c0e482 != null && C351220Dpo.LLLILZ(c0e482)) {
            C0E48 c0e483 = this.LL;
            Integer numValueOf = null;
            NLETrackSlot nLETrackSlotLLLLLLIL = c0e483 != null ? c0e483.LLLLLLIL() : null;
            C0E48 c0e484 = this.LL;
            Integer numValueOf2 = (c0e484 == null || (trackBySlot2 = C350870DpF.LJI(c0e484).getTrackBySlot(nLETrackSlotLLLLLLIL)) == null) ? null : Integer.valueOf(trackBySlot2.getLayer());
            if (nLETrackSlotLLLLLLIL != null) {
                C0E48 c0e485 = this.LL;
                if (c0e485 != null) {
                    NLEModel nLEModelLJI = C350870DpF.LJI(c0e485);
                    String name = nLETrackSlotLLLLLLIL.getName();
                    Iterator<NLETrack> it2 = nLEModelLJI.getTracks().iterator();
                    loop0: while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        Iterator<NLETrackSlot> it3 = it2.next().getSlots().iterator();
                        while (it3.hasNext()) {
                            next = it3.next();
                            if (TextUtils.equals(next.getName(), name)) {
                                break loop0;
                            }
                        }
                    }
                } else {
                    next = null;
                }
                C0E48 c0e486 = this.LL;
                if (c0e486 != null && (trackBySlot = C350870DpF.LJI(c0e486).getTrackBySlot(next)) != null) {
                    numValueOf = Integer.valueOf(trackBySlot.getLayer());
                }
                if (!Intrinsics.LJFF(numValueOf, numValueOf2) && next != null && (c0e48 = this.LL) != null) {
                    c0e48.S7().LIZIZ(new C358740E4q(next, 0, null, false, 0, 250), "select_slot_event", false);
                }
            }
        }
        if (!C301800BsI.LIZ() && (videoPublishEditModelZS = ZS()) != null) {
            C0E48 c0e487 = this.LL;
            String curResourceEngName = ((SpeedViewModel) wS()).getCurResourceEngName();
            if (curResourceEngName == null) {
                curResourceEngName = "none";
            }
            Boolean bool = Boolean.FALSE;
            C361680EFy.LJJZ(videoPublishEditModelZS, c0e487, curResourceEngName, "cancel_curve_speed_spots", bool, bool);
        }
        super.HS();
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final void NS() {
        mT().LLLJ().bS();
        super.NS();
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.TTResourcePanelFragment, com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final void clearFromXmlViewCache() {
        super.clearFromXmlViewCache();
        this.LLLFFI = null;
        this.LLLFZ = null;
        this.LLLI = null;
        this.LLLII = null;
        this.LLLIIII = null;
        this.LLLIIIIL = null;
        this.LLLIIIL = null;
    }

    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.TTResourcePanelFragment, com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        clearFromXmlViewCache();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final void JS(boolean z) {
        C0E48 c0e48;
        NLETrackSlot nLETrackSlotLLLLLLIL;
        VideoPublishEditModel videoPublishEditModelZS;
        NLETrackSlot nLETrackSlotLLLLLLIL2;
        NLETrackSlot nLETrackSlotLLLLLLIL3;
        SpeedNormalFragment speedNormalFragmentLLLJ = mT().LLLJ();
        Float fValueOf = Float.valueOf(speedNormalFragmentLLLJ.LLIZLLLIL);
        Float value = speedNormalFragmentLLLJ.aS().getSpeed().getValue();
        if (value == null) {
            value = Float.valueOf(1.0f);
        }
        if ((!Intrinsics.LJFF(fValueOf, value) || speedNormalFragmentLLLJ.aS().isCurveSpeed()) && (c0e48 = speedNormalFragmentLLLJ.LL) != null && (nLETrackSlotLLLLLLIL = c0e48.LLLLLLIL()) != null && C346680DiU.LIZIZ(nLETrackSlotLLLLLLIL)) {
            nLETrackSlotLLLLLLIL.setExtra("is_editorpro_adjust_video_speed", "1");
        }
        speedNormalFragmentLLLJ.bS();
        C0E48 c0e482 = mT().LLLILZLLLI().LL;
        if (c0e482 != null && (nLETrackSlotLLLLLLIL3 = c0e482.LLLLLLIL()) != null && C351220Dpo.LJZI(nLETrackSlotLLLLLLIL3)) {
            nLETrackSlotLLLLLLIL3.setExtra("is_editor_pro_curve_speed_used", "true");
        }
        C0E48 c0e483 = this.LL;
        if (c0e483 != null && (nLETrackSlotLLLLLLIL2 = c0e483.LLLLLLIL()) != null) {
            pT();
            C361680EFy.LJLILLLLZI(nLETrackSlotLLLLLLIL2, "adjust_video_speed_duration", String.valueOf(C361680EFy.LJIJJ(nLETrackSlotLLLLLLIL2, "adjust_video_speed_duration") + this.LLLILZLLLI.getFirst().longValue()));
            C361680EFy.LJLILLLLZI(nLETrackSlotLLLLLLIL2, "adjust_video_curve_speed_duration", String.valueOf(C361680EFy.LJIJJ(nLETrackSlotLLLLLLIL2, "adjust_video_curve_speed_duration") + this.LLLILZLLLI.getSecond().longValue()));
        }
        if (!C301800BsI.LIZ() && z && (videoPublishEditModelZS = ZS()) != null) {
            C0E48 c0e484 = this.LL;
            String curResourceEngName = ((SpeedViewModel) wS()).getCurResourceEngName();
            if (curResourceEngName == null) {
                curResourceEngName = "none";
            }
            Boolean bool = Boolean.FALSE;
            C361680EFy.LJJZ(videoPublishEditModelZS, c0e484, curResourceEngName, "save_curve_speed_spots", bool, bool);
        }
        super.JS(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment
    public final void PS(EnumC357140DzM enumC357140DzM) {
        mT().LLLJ().aS().checkAbsSpeedAndTone();
        mT().LLLILZLLLI().bS(this.LL);
        lT().setSelectedAt(((SpeedViewModel) wS()).hasSelectedCurveSpeed() ? 1 : 0);
    }

    public final void oT(boolean z, boolean z2) {
        View viewFindViewById = null;
        if (z) {
            View view = this.LLLIIIL;
            if (view == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById = view2.findViewById(R.id.pp0);
                }
                this.LLLIIIL = (ConstraintLayout) viewFindViewById;
                view = viewFindViewById;
            }
            C786410Ut5.LJLLLLLL(0, view);
            if (C357780E0y.LIZ()) {
                if (z2) {
                    FrameLayout frameLayoutKT = kT();
                    if (frameLayoutKT != null) {
                        C786410Ut5.LJLLLLLL(0, frameLayoutKT);
                        return;
                    }
                    return;
                }
                FrameLayout frameLayoutKT2 = kT();
                if (frameLayoutKT2 == null) {
                    return;
                }
                C786410Ut5.LJLLLLLL(8, frameLayoutKT2);
                return;
            }
            if (z2) {
                C786410Ut5.LJLLLLLL(0, jT());
                return;
            } else {
                C786410Ut5.LJLLLLLL(8, jT());
                return;
            }
        }
        View view3 = this.LLLIIIL;
        if (view3 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById = view4.findViewById(R.id.pp0);
            }
            this.LLLIIIL = (ConstraintLayout) viewFindViewById;
            view3 = viewFindViewById;
        }
        C786410Ut5.LJLLLLLL(8, view3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.gamora.editorpro.framework.panel.legacy.fragment.DTResourcePanelFragment, com.ss.ugc.android.editor.bottom.panel.BasePanelFragment, com.ss.ugc.android.editor.bottom.panel.EditorContextFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C0E5S c0e5s;
        int i;
        float f;
        C0E48 c0e48;
        String str;
        ViewGroup.LayoutParams layoutParams;
        int i2;
        C19A3 c19a3;
        C1DRG c1drg;
        C19A3 c19a32;
        C1DRG c1drg2;
        super.onViewCreated(view, bundle);
        if (C0E47.LIZ()) {
            Scene sceneLIZ = C0EBE.LIZ(view);
            View viewFindViewById = null;
            ViewGroup.MarginLayoutParams marginLayoutParams = null;
            if ((sceneLIZ instanceof C19A3) && (c19a32 = (C19A3) sceneLIZ) != null && (c1drg2 = ((FeatureAlsLogicContainer) C1664600tQ2.LJ(c19a32)).LLJJI) != null) {
                c0e5s = (C0E5S) c1drg2.LJIIL(null, C0E5S.class);
            } else {
                c0e5s = null;
            }
            this.LLLIILIL = c0e5s;
            ((SpeedViewModel) wS()).initWithContext();
            Scene sceneLIZ2 = C0EBE.LIZ(view);
            if ((sceneLIZ2 instanceof C19A3) && (c19a3 = (C19A3) sceneLIZ2) != null && (c1drg = ((FeatureAlsLogicContainer) C1664600tQ2.LJ(c19a3)).LLJJI) != null) {
                this.LLLILZ = (InterfaceC360800ECo) c1drg.LJIIL(null, InterfaceC360800ECo.class);
            }
            nT().setAdapter(mT());
            nT().setUserInputEnabled(false);
            lT().setSize(EnumC1119290fEV.X_SMALL);
            lT().setMaterial(EnumC1119280fEU.THICK);
            lT().LIZ(new C1782380wU0(getString(2131848685), null, 30));
            lT().LIZ(new C1782380wU0(getString(2131848674), null, 30));
            lT().setOnSelectedChangeListener(new InterfaceC1119310fEX() { // from class: X.0ECQ
                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.InterfaceC1119310fEX
                public final void LIZ(int i3, boolean z) {
                    String str2;
                    String str3;
                    if (!z) {
                        return;
                    }
                    ((SpeedViewModel) this.LIZ.wS()).pausePlay();
                    this.LIZ.pT();
                    SpeedFragment speedFragment = this.LIZ;
                    speedFragment.LLLIZZ = i3;
                    speedFragment.nT().LJ(i3, true);
                    if (i3 == 0) {
                        str2 = "normal";
                    } else {
                        str2 = "curve";
                    }
                    VideoPublishEditModel videoPublishEditModelZS = this.LIZ.ZS();
                    if (videoPublishEditModelZS != null) {
                        SpeedFragment speedFragment2 = this.LIZ;
                        C0E48 c0e482 = speedFragment2.LL;
                        if (c0e482 != null && C351220Dpo.LLLILZ(c0e482)) {
                            str3 = "pip";
                        } else {
                            str3 = "video";
                        }
                        C0LAB c0labLJFF = C361680EFy.LJFF(-1L, videoPublishEditModelZS, speedFragment2.LL, new Pair(-1, -1));
                        c0labLJFF.LJ("is_editor_pro", "1");
                        c0labLJFF.LJ("tab", str2);
                        c0labLJFF.LJ("track_type", str3);
                        C20684815ws.LJIILLIIL("click_speed_entrance", c0labLJFF.LIZ);
                    }
                    if (i3 == 0) {
                        ((SpeedViewModel) this.LIZ.wS()).checkAbsSpeedAndTone();
                        if (((SpeedViewModel) this.LIZ.wS()).hasSelectedCurveSpeed()) {
                            SpeedNormalFragment.cS(this.LIZ.mT().LLLJ(), ((SpeedViewModel) this.LIZ.wS()).getSpeed().getValue(), ((SpeedViewModel) this.LIZ.wS()).getChangeTone().getValue());
                            return;
                        }
                        return;
                    }
                    this.LIZ.mT().LLLILZLLLI().bS(this.LIZ.LL);
                }
            });
            FrameLayout frameLayoutKT = kT();
            if (frameLayoutKT != null) {
                C0EG9.LIZ(frameLayoutKT, new AwS549S0100000_5(this, 1200));
            }
            C786410Ut5.Y7(jT(), new ACListenerS140S0100000_5(this, 129));
            View viewFindViewById2 = this.LLLIIII;
            if (viewFindViewById2 == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById2 = view2.findViewById(R.id.h3x);
                } else {
                    viewFindViewById2 = null;
                }
                this.LLLIIII = (FrameLayout) viewFindViewById2;
            }
            viewFindViewById2.setOnTouchListener(new ATListenerS439S0100000_5(this, 8));
            MutableLiveData<C351080Dpa> slotSelectChangedEvent = ((SpeedViewModel) wS()).getSlotSelectChangedEvent();
            if (slotSelectChangedEvent != null) {
                slotSelectChangedEvent.observe(getViewLifecycleOwner(), new AObserverS209S0100000_5(this, 151));
            }
            if (((SpeedViewModel) wS()).getCurveSpeedEnabled()) {
                zS();
                if (C357780E0y.LIZ()) {
                    FrameLayout frameLayout = (FrameLayout) oS();
                    if (frameLayout != null) {
                        C786410Ut5.LJZ(8, frameLayout);
                    }
                } else {
                    ConstraintLayout constraintLayoutNS = nS();
                    if (constraintLayoutNS != null) {
                        C786410Ut5.LL(8, constraintLayoutNS);
                    }
                }
                oT(true, C301800BsI.LIZ());
                if (C301800BsI.LIZ()) {
                    if (fT()) {
                        i2 = 166;
                    } else {
                        i2 = 180;
                    }
                    VS(i2);
                    eT();
                } else {
                    VS(200);
                    C20632315oP c20632315oPNT = nT();
                    if (c20632315oPNT != null) {
                        layoutParams = c20632315oPNT.getLayoutParams();
                    } else {
                        layoutParams = null;
                    }
                    if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                        marginLayoutParams.setMargins(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), 0, 0);
                    }
                    C20632315oP c20632315oPNT2 = nT();
                    if (c20632315oPNT2 != null) {
                        C786410Ut5.r6(c20632315oPNT2, marginLayoutParams);
                    }
                }
                C0E5S c0e5s2 = this.LLLIILIL;
                if (c0e5s2 != null) {
                    c0e5s2.yV(AFwS234S0000000_5.get$arr$(328));
                }
            } else {
                oT(false, false);
                C0E48 c0e482 = this.LL;
                if (c0e482 != null && C351220Dpo.LLLILZ(c0e482)) {
                    if (C301800BsI.LIZ()) {
                        f = 0.0f;
                    } else {
                        f = 15.0f;
                    }
                    View view3 = this.LLLFZ;
                    if (view3 == null) {
                        View view4 = getView();
                        if (view4 != null) {
                            viewFindViewById = view4.findViewById(R.id.vtz);
                        }
                        this.LLLFZ = (ConstraintLayout) viewFindViewById;
                        view3 = viewFindViewById;
                    }
                    DTResourcePanelFragment.VR(view3, f);
                    zS();
                } else {
                    LinearLayout linearLayoutBS = bS();
                    if (linearLayoutBS != null) {
                        C786410Ut5.LJZL(0, linearLayoutBS);
                    }
                }
                if (C301800BsI.LIZ()) {
                    US();
                    eT();
                    if (fT()) {
                        i = 166;
                    } else {
                        i = 180;
                    }
                    VS(i);
                }
            }
            if (!C301800BsI.LIZ()) {
                String string = getString(2131833398);
                TuxTextView tuxTextViewDS = dS();
                if (tuxTextViewDS != null) {
                    tuxTextViewDS.setText(string);
                }
            }
            VideoPublishEditModel videoPublishEditModelZS = ZS();
            if (videoPublishEditModelZS != null) {
                C0E48 c0e483 = this.LL;
                if (((SpeedViewModel) wS()).isCurveSpeed()) {
                    str = "curve";
                } else {
                    str = "normal";
                }
                C0LAB c0labLJFF = C361680EFy.LJFF(-1L, videoPublishEditModelZS, c0e483, new Pair(-1, -1));
                c0labLJFF.LJ("track_type", C361680EFy.LJIL(c0e483));
                c0labLJFF.LJ("tab", str);
                C20684815ws.LJIILLIIL("cut_speed_panel_show", c0labLJFF.LIZ);
            }
            if (((Boolean) C306370Bzf.LIZ.getValue()).booleanValue() && (c0e48 = this.LL) != null) {
                C350870DpF.LJI(c0e48).setThousandFps(30000L);
            }
        }
    }
}
