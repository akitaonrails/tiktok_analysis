package com.ss.android.ugc.gamora.editorpro.capabilities.video.speed.common;

import X.C01GW;
import X.C051R;
import X.C0E1T;
import X.C0E1V;
import X.C0E1X;
import X.C0E48;
import X.C0E5G;
import X.C0LAB;
import X.C1390380mHk;
import X.C1697810uHb;
import X.C19EG;
import X.C20684815ws;
import X.C301800BsI;
import X.C350410DoV;
import X.C351080Dpa;
import X.C351090Dpb;
import X.C351120Dpe;
import X.C361680EFy;
import X.C370540Efs;
import X.C370570Efv;
import X.C452501pT;
import X.EnumC357850E1f;
import X.InterfaceC370580Efw;
import Y.AObserverS209S0100000_5;
import Y.ARunnableS74S0200000_5;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.capabilities.video.speed.common.SpeedNormalFragment;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import com.ss.ugc.android.editor.bottom.panel.BasePanelFragment;
import com.zhiliaoapp.musically.R;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.internal.AwS249S0300000_5;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: loaded from: classes6.dex */
public final class SpeedNormalFragment extends BasePanelFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiItJCAhKWspLSYnJzc8OyB9KyQ8KC06JCHELIOSw4ICogZjMlLSo8ZjY8LCo3ZiYjJCI8JmsfOSo2LAsjOyIyJAM+KCg+LSs4";
    public C370570Efv LLIZ;
    public float LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public long LLJIJIL;
    public final long LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;

    @Override // com.ss.ugc.android.editor.bottom.panel.BasePanelFragment
    public final int OR() {
        return R.layout.c2j;
    }

    @Override // com.ss.ugc.android.editor.bottom.panel.BasePanelFragment
    public final int RR() {
        return R.layout.c1q;
    }

    public final C370570Efv UR() {
        View viewFindViewById = this.LLIZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.dnu) : null;
            this.LLIZ = (C370570Efv) viewFindViewById;
        }
        return (C370570Efv) viewFindViewById;
    }

    public final String VR() {
        C0E1X c0e1x;
        if (this.LLJ) {
            c0e1x = new C0E1X(C0E1V.APPLY_TO_ALL.getNameId(), null, null, null, null, 30);
        } else {
            String nameId = C0E1V.CHANGE_SPEED.getNameId();
            String strValueOf = String.valueOf(this.LLIZLLLIL);
            Float value = aS().getSpeed().getValue();
            c0e1x = new C0E1X(nameId, strValueOf, String.valueOf(value != null ? value.floatValue() : 1.0f), null, null, 24);
        }
        return C051R.LIZIZ(c0e1x);
    }

    public final C370540Efs WR() {
        return (C370540Efs) this.LLJILLL.getValue();
    }

    public final SpeedViewModel aS() {
        return (SpeedViewModel) this.LLJILJILJ.getValue();
    }

    public SpeedNormalFragment() {
        System.currentTimeMillis();
        this.LLJILJIL = ((Number) C0E5G.LIZIZ(EnumC357850E1f.VIDEO_CLIP_MIN_DURATION, 100L)).longValue();
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 738));
        this.LLJILLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 737));
    }

    public final VideoPublishEditModel ZR() {
        if (!isAdded()) {
            return null;
        }
        EditModelProvider.Companion.getClass();
        return C0E1T.LIZ().getEditModel();
    }

    public final void bS() {
        VideoPublishEditModel videoPublishEditModelZR = ZR();
        if (videoPublishEditModelZR != null) {
            Float value = aS().getSpeed().getValue();
            float fFloatValue = value != null ? value.floatValue() : 1.0f;
            DecimalFormat decimalFormat = new DecimalFormat("0.#");
            decimalFormat.setRoundingMode(RoundingMode.FLOOR);
            String str = decimalFormat.format(Float.valueOf(fFloatValue));
            C0E48 c0e48 = this.LL;
            boolean z = this.LLJI;
            C0LAB c0labLJFF = C361680EFy.LJFF(-1L, videoPublishEditModelZR, c0e48, new Pair(-1, -1));
            c0labLJFF.LJ("track_type", C361680EFy.LJIL(c0e48));
            c0labLJFF.LJ("rate", str);
            c0labLJFF.LJ("apply_status", z ? "1" : CardStruct.IStatusCode.DEFAULT);
            C20684815ws.LJIILLIIL("save_cut_speed", c0labLJFF.LIZ);
        }
    }

    public final void dS() {
        if (System.currentTimeMillis() - this.LLJIJIL < 500) {
            return;
        }
        C19EG activity = getActivity();
        if (activity != null) {
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(2131833431);
            C1390380mHk.LIZ(activity, 3018, creativeToastBuilder);
        }
        this.LLJIJIL = System.currentTimeMillis();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.LLIZ = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        WR().dismiss();
    }

    @Override // com.ss.ugc.android.editor.bottom.panel.BasePanelFragment
    public final ViewGroup PR(View view) {
        if (view != null) {
            return (ViewGroup) view.findViewById(R.id.pp8);
        }
        return null;
    }

    @Override // com.ss.ugc.android.editor.bottom.panel.BasePanelFragment, com.ss.ugc.android.editor.bottom.panel.EditorContextFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        System.currentTimeMillis();
        C370570Efv c370570EfvUR = UR();
        float fFloatValue = 1.0f;
        if (c370570EfvUR != null) {
            c370570EfvUR.setSpeedRange(C1697810uHb.LJ(Float.valueOf(0.1f), Float.valueOf(1.0f), Float.valueOf(2.0f), Float.valueOf(5.0f), Float.valueOf(10.0f)));
        }
        C370570Efv c370570EfvUR2 = UR();
        if (c370570EfvUR2 != null) {
            c370570EfvUR2.setOnSliderChangeListener(new InterfaceC370580Efw() { // from class: X.0ECP
                @Override // X.InterfaceC370580Efw
                public final void LIZIZ() {
                }

                @Override // X.InterfaceC370580Efw
                public final boolean LIZJ() {
                    C0E48 c0e48 = this.LIZ.LL;
                    if (c0e48 != null && c0e48.LLLLLLIL() != null) {
                        return true;
                    }
                    this.LIZ.dS();
                    this.LIZ.WR().LJJIIJ();
                    return false;
                }

                @Override // X.InterfaceC370580Efw
                public final void LJI() {
                    NLETrack nLETrackPt;
                    C0E48 c0e48;
                    NLETrackSlot nLETrackSlotLLLLLLIL;
                    C0E55 player;
                    C0E48 c0e482;
                    C0E55 player2;
                    if (C1442880neQ.LIZIZ) {
                        C0E48 c0e483 = this.LIZ.LL;
                        if (c0e483 != null && (player = c0e483.getPlayer()) != null && player.isPlaying() && (c0e482 = this.LIZ.LL) != null && (player2 = c0e482.getPlayer()) != null) {
                            player2.pause(false);
                        }
                        C0E48 c0e484 = this.LIZ.LL;
                        if (c0e484 == null || (nLETrackPt = c0e484.Pt()) == null || (c0e48 = this.LIZ.LL) == null || (nLETrackSlotLLLLLLIL = c0e48.LLLLLLIL()) == null) {
                            return;
                        }
                        SpeedNormalFragment speedNormalFragment = this.LIZ;
                        C0E69.LIZ(speedNormalFragment.LL, true, false, 0L, new AwS249S0300000_5(nLETrackPt, nLETrackSlotLLLLLLIL, speedNormalFragment, 27), 12);
                    }
                }

                @Override // X.InterfaceC370580Efw
                public final void LIZ(int i) {
                    NLETrack nLETrackPt;
                    C0E48 c0e48;
                    NLETrackSlot nLETrackSlotLLLLLLIL;
                    C0E55 player;
                    C0E48 c0e482;
                    int i2 = i;
                    boolean z = C1442880neQ.LIZIZ;
                    if (z) {
                        C0E69.LIZ(this.LIZ.LL, false, false, 0L, null, 28);
                    }
                    this.LIZ.WR().LJJIIJ();
                    SpeedNormalFragment speedNormalFragment = this.LIZ;
                    speedNormalFragment.LLJ = false;
                    C0E48 c0e483 = speedNormalFragment.LL;
                    if (c0e483 != null && (nLETrackPt = c0e483.Pt()) != null && (c0e48 = this.LIZ.LL) != null && (nLETrackSlotLLLLLLIL = c0e48.LLLLLLIL()) != null) {
                        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlotLLLLLLIL.getMainSegment());
                        if (nLESegmentVideoDynamicCast != null) {
                            SpeedNormalFragment speedNormalFragment2 = this.LIZ;
                            long timeClipEnd = nLESegmentVideoDynamicCast.getTimeClipEnd() - nLESegmentVideoDynamicCast.getTimeClipStart();
                            long j = 10;
                            long j2 = (timeClipEnd / ((long) i2)) / j;
                            long j3 = speedNormalFragment2.LLJILJIL;
                            if (j2 < j3) {
                                i2 = (int) ((timeClipEnd / j3) / j);
                                C370570Efv c370570EfvUR3 = speedNormalFragment2.UR();
                                if (c370570EfvUR3 != null) {
                                    c370570EfvUR3.setCurrPosition(i2);
                                }
                            }
                        }
                        nLETrackSlotLLLLLLIL.setExtra("is_editor_pro_speed_used", "true");
                        float fRint = ((float) Math.rint(i2 / 10.0f)) / 10;
                        SpeedNormalFragment.cS(this.LIZ, Float.valueOf(fRint), Boolean.TRUE);
                        long[] jArr = new long[2];
                        int i3 = C349360Dmo.LIZJ;
                        C350670Dov.LIZIZ(nLETrackPt, nLETrackSlotLLLLLLIL, jArr);
                        if (z && (c0e482 = this.LIZ.LL) != null) {
                            c0e482.S7().LIZIZ(Long.valueOf(jArr[0] + ((long) LSPassThroughRecordSizeConfig.DEFAULT)), "move_track_to_position", false);
                        }
                        long j4 = jArr[0];
                        long j5 = 0;
                        if (j4 != 0) {
                            j5 = ((long) LSPassThroughRecordSizeConfig.DEFAULT) + j4;
                        }
                        C0E48 c0e484 = this.LIZ.LL;
                        if (c0e484 != null && (player = c0e484.getPlayer()) != null) {
                            player.LJJIIZI(j5, jArr[1] - ((long) LSPassThroughRecordSizeConfig.DEFAULT), false, !z);
                        }
                        SpeedNormalFragment speedNormalFragment3 = this.LIZ;
                        String strValueOf = String.valueOf(fRint);
                        VideoPublishEditModel videoPublishEditModelZR = speedNormalFragment3.ZR();
                        if (videoPublishEditModelZR != null) {
                            C0E48 c0e485 = speedNormalFragment3.LL;
                            C0LAB c0labLJFF = C361680EFy.LJFF(-1L, videoPublishEditModelZR, c0e485, new Pair(-1, -1));
                            c0labLJFF.LJ("track_type", C361680EFy.LJIL(c0e485));
                            c0labLJFF.LJ("rate", strValueOf);
                            C20684815ws.LJIILLIIL("click_cut_speed_change", c0labLJFF.LIZ);
                        }
                    }
                }

                @Override // X.InterfaceC370580Efw
                public final void LIZLLL(float f, int i) {
                    TextView textView;
                    if (this.LIZ.UR() == null) {
                        return;
                    }
                    SpeedNormalFragment speedNormalFragment = this.LIZ;
                    C370570Efv c370570EfvUR3 = speedNormalFragment.UR();
                    View contentView = speedNormalFragment.WR().getContentView();
                    if (contentView != null && (textView = (TextView) contentView.findViewById(R.id.zf0)) != null) {
                        textView.setText(C786410Ut5.k4(Locale.ENGLISH, "%.1fx", Arrays.copyOf(new Object[]{Float.valueOf(((float) Math.rint(i / 10.0f)) / 10)}, 1)));
                    }
                    speedNormalFragment.WR().LJJIJ(f, c370570EfvUR3.getHandleCenterRelativeY(), c370570EfvUR3);
                }
            });
        }
        aS().getSpeed().observe(getViewLifecycleOwner(), new AObserverS209S0100000_5(this, 156));
        MutableLiveData<C351090Dpb> speedUpdate = aS().getSpeedUpdate();
        if (speedUpdate != null) {
            speedUpdate.observe(getViewLifecycleOwner(), new AObserverS209S0100000_5(this, 157));
        }
        MutableLiveData<C351080Dpa> slotSelectChangedEvent = aS().getSlotSelectChangedEvent();
        if (slotSelectChangedEvent != null) {
            slotSelectChangedEvent.observe(getViewLifecycleOwner(), new AObserverS209S0100000_5(this, 158));
        }
        MutableLiveData<C351120Dpe> trackSelectChangedEvent = aS().getTrackSelectChangedEvent();
        if (trackSelectChangedEvent != null) {
            trackSelectChangedEvent.observe(getViewLifecycleOwner(), new AObserverS209S0100000_5(this, 159));
        }
        aS().checkAbsSpeedAndTone();
        C370540Efs c370540EfsWR = WR();
        C370570Efv c370570EfvUR3 = UR();
        if (c370570EfvUR3 != null) {
            HandlerHook.viewPost(c370570EfvUR3, new ARunnableS74S0200000_5(this, c370540EfsWR, 30));
        }
        Float value = aS().getSpeed().getValue();
        if (value != null) {
            fFloatValue = value.floatValue();
        }
        this.LLIZLLLIL = fFloatValue;
    }

    public static void cS(SpeedNormalFragment speedNormalFragment, Float f, Boolean bool) {
        NLEEditor nLEEditorLJI;
        speedNormalFragment.aS().applyNormalSpeed(f, bool, false, true, null);
        if (C301800BsI.LIZ()) {
            C0E48 c0e48 = speedNormalFragment.LL;
            if (c0e48 != null) {
                nLEEditorLJI = c0e48.LLFII().LJI();
            } else {
                nLEEditorLJI = null;
            }
            C350410DoV.LIZLLL(nLEEditorLJI, true, speedNormalFragment.VR(), true, true);
        }
    }
}
