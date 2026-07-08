package com.ss.ugc.android.editor.base.viewmodel;

import X.C01GW;
import X.C0E48;
import X.C0E55;
import X.C0E5G;
import X.C0EB9;
import X.C2327809Ae;
import X.C350390DoT;
import X.C350870DpF;
import X.C351080Dpa;
import X.C351120Dpe;
import X.C351220Dpo;
import X.C351230Dpp;
import X.C351510DqH;
import X.C351600DqQ;
import X.C351630DqT;
import X.C355010Dvv;
import X.C357250DzX;
import X.C452501pT;
import X.EnumC356070Dxd;
import X.EnumC357850E1f;
import X.InterfaceC349350Dmn;
import X.InterfaceC351200Dpm;
import X.InterfaceC351350Dq1;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.ugc.android.editor.core.api.params.MaskParam;
import com.ss.ugc.android.editor.core.utils.LiveDataBus;
import com.ss.ugc.android.editor.core.vm.BaseViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: loaded from: classes6.dex */
public final class CutViewModel extends BaseViewModel {
    public final C01GW volumeUpdate$delegate = C452501pT.LIZIZ(new AwS549S0100000_5(this, 958));
    public final C01GW slotSelectChangedEvent$delegate = C452501pT.LIZIZ(new AwS549S0100000_5(this, 955));
    public final C01GW trackSelectChangedEvent$delegate = C452501pT.LIZIZ(new AwS549S0100000_5(this, 956));
    public final C01GW volumeKeyframe$delegate = C452501pT.LIZIZ(new AwS549S0100000_5(this, 957));
    public final C01GW seekVideoPositionEvent$delegate = C452501pT.LIZIZ(new AwS549S0100000_5(this, 954));

    public final void cancelReverse() {
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        C0E48 c0e48 = this.editorContext;
        if (c0e48 == null || (interfaceC351350Dq1LLFII = c0e48.LLFII()) == null) {
            return;
        }
        interfaceC351350Dq1LLFII.LJJJJLI();
    }

    public final float getCurrentVolumeIntensity() {
        NLETrackSlot nLETrackSlotLLLLLLIL;
        float fLJLLLL;
        NLETrack nLETrackPt;
        Float fLJIIIIZZ;
        C0E48 c0e48 = this.editorContext;
        if (c0e48 == null || (nLETrackSlotLLLLLLIL = c0e48.LLLLLLIL()) == null) {
            return 0.0f;
        }
        if (!nLETrackSlotLLLLLLIL.getKeyframes().isEmpty()) {
            C351220Dpo.LLIFFJFJJ(nLETrackSlotLLLLLLIL);
            fLJLLLL = C351220Dpo.LJJLJLI(nLETrackSlotLLLLLLIL);
        } else {
            NLESegment mainSegment = nLETrackSlotLLLLLLIL.getMainSegment();
            fLJLLLL = mainSegment != null ? C351220Dpo.LJLLLL(mainSegment) : 0.0f;
        }
        C0E48 c0e482 = this.editorContext;
        if (c0e482 == null || (nLETrackPt = c0e482.Pt()) == null || !C351220Dpo.LLILL(nLETrackPt) || !nLETrackSlotLLLLLLIL.hasExtra("volume_before_enhance")) {
            return fLJLLLL;
        }
        if (!(!nLETrackSlotLLLLLLIL.getKeyframes().isEmpty()) && !C351220Dpo.LLIIIJ(nLETrackSlotLLLLLLIL)) {
            Float fLJIIIIZZ2 = C2327809Ae.LJIIIIZZ(nLETrackSlotLLLLLLIL.getExtra("volume_before_enhance"));
            return fLJIIIIZZ2 != null ? fLJIIIIZZ2.floatValue() : fLJLLLL;
        }
        if (!nLETrackSlotLLLLLLIL.hasExtra("volume_enhance_rate") || (fLJIIIIZZ = C2327809Ae.LJIIIIZZ(nLETrackSlotLLLLLLIL.getExtra("volume_enhance_rate"))) == null) {
            return fLJLLLL;
        }
        float fFloatValue = fLJIIIIZZ.floatValue();
        return fFloatValue != 0.0f ? C351220Dpo.LJJLJLI(nLETrackSlotLLLLLLIL) / fFloatValue : fLJLLLL;
    }

    public final float getSaveVolumeIntensity() {
        NLETrackSlot nLETrackSlotLLLLLLIL;
        String extra;
        Float fLJIIIIZZ;
        C0E48 c0e48 = this.editorContext;
        if (c0e48 == null || (nLETrackSlotLLLLLLIL = c0e48.LLLLLLIL()) == null || (extra = nLETrackSlotLLLLLLIL.getExtra("volume_intensity")) == null || (fLJIIIIZZ = C2327809Ae.LJIIIIZZ(extra)) == null) {
            return 1.0f;
        }
        return fLJIIIIZZ.floatValue();
    }

    public final MutableLiveData<Long> getSeekVideoPositionEvent() {
        return (MutableLiveData) this.seekVideoPositionEvent$delegate.getValue();
    }

    public final MutableLiveData<C351080Dpa> getSlotSelectChangedEvent() {
        return (MutableLiveData) this.slotSelectChangedEvent$delegate.getValue();
    }

    public final MutableLiveData<C351120Dpe> getTrackSelectChangedEvent() {
        return (MutableLiveData) this.trackSelectChangedEvent$delegate.getValue();
    }

    public final LiveData<C357250DzX> getVolumeKeyframe() {
        return (LiveData) this.volumeKeyframe$delegate.getValue();
    }

    public final MutableLiveData<C350390DoT> getVolumeUpdate() {
        return (MutableLiveData) this.volumeUpdate$delegate.getValue();
    }

    public final void mirror() {
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        C0E48 c0e48 = this.editorContext;
        if (c0e48 == null || (interfaceC351350Dq1LLFII = c0e48.LLFII()) == null) {
            return;
        }
        interfaceC351350Dq1LLFII.LLILZ(EnumC356070Dxd.DONE);
    }

    public final void restoreAllSlotsVolume() {
        VecNLETrackSPtr tracks;
        Float fLJIIIIZZ;
        C0E48 c0e48 = this.editorContext;
        if (c0e48 == null || (tracks = C350870DpF.LJI(c0e48).getTracks()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (NLETrack nLETrack : tracks) {
            if (nLETrack.getTrackType() == NLETrackType.AUDIO) {
                arrayList.add(nLETrack);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            for (NLETrackSlot nLETrackSlot : ((NLETrack) it2.next()).getSortedSlots()) {
                String extra = nLETrackSlot.getExtra("volume_intensity");
                C351220Dpo.LLLLLL(nLETrackSlot.getMainSegment(), (extra == null || (fLJIIIIZZ = C2327809Ae.LJIIIIZZ(extra)) == null) ? C351230Dpp.LIZ() ? 0.5f : 1.0f : fLJIIIIZZ.floatValue());
                C0E48 c0e482 = this.editorContext;
                if (c0e482 != null) {
                    C350870DpF.LIZ(c0e482, false);
                }
            }
        }
    }

    public final void rotate() {
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        C0E48 c0e48 = this.editorContext;
        if (c0e48 == null || (interfaceC351350Dq1LLFII = c0e48.LLFII()) == null) {
            return;
        }
        interfaceC351350Dq1LLFII.LJJJI(EnumC356070Dxd.DONE);
    }

    public final void slotCopy() {
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        C0E48 c0e48 = this.editorContext;
        if (c0e48 == null || (interfaceC351350Dq1LLFII = c0e48.LLFII()) == null || !interfaceC351350Dq1LLFII.LLIL(EnumC356070Dxd.DONE)) {
            return;
        }
        LiveDataBus.getInstance().with("key_mainViewModel", Integer.TYPE).postValue(7);
    }

    public final boolean splitClip() {
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        C0E55 player;
        C0E55 player2;
        C0E48 c0e48 = this.editorContext;
        if (c0e48 != null && (player2 = c0e48.getPlayer()) != null) {
            player2.pause(false);
        }
        C0E48 c0e482 = this.editorContext;
        if (c0e482 != null && (player = c0e482.getPlayer()) != null) {
            player.skipNextSeek(true);
        }
        C0E48 c0e483 = this.editorContext;
        if (c0e483 == null || (interfaceC351350Dq1LLFII = c0e483.LLFII()) == null) {
            return false;
        }
        return interfaceC351350Dq1LLFII.LJJJJLL(EnumC356070Dxd.DONE);
    }

    public final void slotReplace() {
        LiveDataBus.getInstance().with("key_mainViewModel", Integer.TYPE).postValue(8);
    }

    public final void adjustAfterVideoSpeed(long j) {
        NLETrack nLETrackPt;
        NLETrackSlot nLETrackSlotLLLLLLIL;
        C0E48 c0e48 = this.editorContext;
        if (c0e48 != null && (nLETrackPt = c0e48.Pt()) != null) {
            if (!nLETrackPt.hasExtra("track_extra_is_video_edit_speed")) {
                nLETrackPt.setExtra("track_extra_is_video_edit_speed", "true");
            }
            if (nLETrackPt.getMainTrack()) {
                c0e48.Rn().timeSort();
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
            if (((Boolean) C0E5G.LIZIZ(EnumC357850E1f.ENABLE_OPERATE_CAUSE_BLACK_SLOT, Boolean.TRUE)).booleanValue() || (nLETrackSlotLLLLLLIL = c0e48.LLLLLLIL()) == null) {
                return;
            }
            long maxEnd = c0e48.Rn().getMaxEnd();
            if (nLETrackSlotLLLLLLIL.getEndTime() <= maxEnd) {
                return;
            }
            long endTime = (long) ((nLETrackSlotLLLLLLIL.getEndTime() - maxEnd) * C351220Dpo.LJLILLLLZI(nLETrackSlotLLLLLLIL.getMainSegment()));
            nLETrackSlotLLLLLLIL.setEndTime(maxEnd);
            NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlotLLLLLLIL.getMainSegment());
            if (nLESegmentVideoDynamicCast == null) {
                return;
            }
            nLESegmentVideoDynamicCast.setTimeClipEnd(nLESegmentVideoDynamicCast.getTimeClipEnd() - endTime);
        }
    }

    public final void changeCanvasStyle(C351630DqT c351630DqT) {
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        C0E48 c0e48 = this.editorContext;
        if (c0e48 != null && (interfaceC351350Dq1LLFII = c0e48.LLFII()) != null) {
            interfaceC351350Dq1LLFII.LJLLJ(c351630DqT, EnumC356070Dxd.COMMIT, null);
        }
    }

    public final Unit reversePlay(InterfaceC351200Dpm interfaceC351200Dpm) {
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        C0E48 c0e48 = this.editorContext;
        if (c0e48 != null && (interfaceC351350Dq1LLFII = c0e48.LLFII()) != null) {
            interfaceC351350Dq1LLFII.LJJLI(interfaceC351200Dpm);
            return Unit.LIZ;
        }
        return null;
    }

    public final void saveVolumeIntensity(float f) {
        C0E48 c0e48 = this.editorContext;
        if (c0e48 != null) {
            String strValueOf = String.valueOf(f);
            NLETrackSlot nLETrackSlotLLLLLLIL = c0e48.LLLLLLIL();
            if (nLETrackSlotLLLLLLIL != null) {
                nLETrackSlotLLLLLLIL.setExtra("volume_intensity", strValueOf);
            }
        }
        C0E48 c0e482 = this.editorContext;
        if (c0e482 != null) {
            C350870DpF.LIZIZ(c0e482, true);
        }
    }

    private final void setSlotExtra(String str, String str2) {
        NLETrackSlot nLETrackSlotLLLLLLIL;
        C0E48 c0e48 = this.editorContext;
        if (c0e48 != null && (nLETrackSlotLLLLLLIL = c0e48.LLLLLLIL()) != null) {
            nLETrackSlotLLLLLLIL.setExtra(str, str2);
        }
    }

    public final void changeVolume(float f, EnumC356070Dxd enumC356070Dxd) {
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        C0E48 c0e48 = this.editorContext;
        if (c0e48 != null && (interfaceC351350Dq1LLFII = c0e48.LLFII()) != null) {
            interfaceC351350Dq1LLFII.changeVolume(f, enumC356070Dxd);
        }
    }

    public final boolean deleteClip(NLETrackSlot nLETrackSlot, EnumC356070Dxd enumC356070Dxd) {
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        C0E48 c0e48 = this.editorContext;
        if (c0e48 == null || (interfaceC351350Dq1LLFII = c0e48.LLFII()) == null) {
            return false;
        }
        Pair<NLETrack, NLETrackSlot> pairLLIIII = interfaceC351350Dq1LLFII.LLIIII(nLETrackSlot, enumC356070Dxd, true);
        C0E48 c0e482 = this.editorContext;
        if (c0e482 != null) {
            NLETrackType nLETrackType = NLETrackType.NONE;
            c0e482.S7().LIZIZ(new C0EB9(pairLLIIII.getFirst(), pairLLIIII.getSecond()), "delete_slot_event", false);
        }
        if (pairLLIIII.getFirst() == null || pairLLIIII.getSecond() == null) {
            return false;
        }
        return true;
    }

    public final void slotCrop(C355010Dvv c355010Dvv, Function1<? super NLETrackSlot, Unit> function1) {
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        NLETrackSlot nLETrackSlotLLLLLLIL;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII2;
        MaskParam maskParamLJJJJ;
        C0E48 c0e48;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII3;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII4;
        C0E48 c0e482 = this.editorContext;
        if (c0e482 != null && c0e482.LLLLLLIL() != null) {
            C0E48 c0e483 = this.editorContext;
            if (c0e483 != null && (nLETrackSlotLLLLLLIL = c0e483.LLLLLLIL()) != null) {
                nLETrackSlotLLLLLLIL.removeExtraWithKey("crop_matrix");
                nLETrackSlotLLLLLLIL.removeExtraWithKey("crop_slider_rotation");
                nLETrackSlotLLLLLLIL.removeExtraWithKey("crop_button_rotation");
                nLETrackSlotLLLLLLIL.removeExtraWithKey("crop_is_photo_cropped");
                nLETrackSlotLLLLLLIL.removeExtraWithKey("crop_mirror_x");
                C0E48 c0e484 = this.editorContext;
                if (c0e484 != null && (interfaceC351350Dq1LLFII4 = c0e484.LLFII()) != null) {
                    interfaceC351350Dq1LLFII4.LJLILLLLZI(nLETrackSlotLLLLLLIL);
                }
                C0E48 c0e485 = this.editorContext;
                if (c0e485 != null && (interfaceC351350Dq1LLFII2 = c0e485.LLFII()) != null && (maskParamLJJJJ = interfaceC351350Dq1LLFII2.LJJJJ(nLETrackSlotLLLLLLIL)) != null && (c0e48 = this.editorContext) != null && (interfaceC351350Dq1LLFII3 = c0e48.LLFII()) != null) {
                    interfaceC351350Dq1LLFII3.LJIIL(nLETrackSlotLLLLLLIL, maskParamLJJJJ);
                }
            }
            setSlotExtra("ep_crop_scale", String.valueOf(c355010Dvv.LJ));
            setSlotExtra("ep_crop_transX", String.valueOf(c355010Dvv.LJFF));
            setSlotExtra("ep_crop_transY", String.valueOf(c355010Dvv.LJI));
            setSlotExtra("ep_crop_degree", String.valueOf(c355010Dvv.LJII));
            setSlotExtra("ep_crop_ratio", String.valueOf(c355010Dvv.LJIIIIZZ));
            C0E48 c0e486 = this.editorContext;
            if (c0e486 != null && (interfaceC351350Dq1LLFII = c0e486.LLFII()) != null) {
                interfaceC351350Dq1LLFII.LLFII(new C351600DqQ(c355010Dvv.LIZ, c355010Dvv.LIZIZ, c355010Dvv.LIZJ, c355010Dvv.LIZLLL), EnumC356070Dxd.DONE, function1);
            }
        }
    }

    public final boolean splitClip(EnumC356070Dxd enumC356070Dxd, InterfaceC349350Dmn interfaceC349350Dmn) {
        C0E48 c0e48 = this.editorContext;
        if (c0e48 == null) {
            return false;
        }
        c0e48.getPlayer().pause(false);
        c0e48.getPlayer().skipNextSeek(true);
        return c0e48.LLFII().LJLLI(enumC356070Dxd, interfaceC349350Dmn);
    }
}
