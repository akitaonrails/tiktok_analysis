package com.ss.ugc.android.editor.track;

import X.EnumC368970EdL;
import X.InterfaceC1294060jmO;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;

/* JADX INFO: loaded from: classes6.dex */
@InterfaceC1294060jmO
public interface TrackPanelActionListener {
    boolean disableClip(NLETrackSlot nLETrackSlot);

    @InterfaceC1294060jmO
    NLETimeSpaceNode getSelectedKeyframe();

    void onAddResourceClick();

    void onAudioMuteClick(boolean z, boolean z2);

    @InterfaceC1294060jmO
    void onClip(EnumC368970EdL enumC368970EdL, EnumC368970EdL enumC368970EdL2, long j, long j2);

    @InterfaceC1294060jmO
    void onClipEnd(NLETrackSlot nLETrackSlot, long j, long j2, boolean z);

    void onClipMainToMinDuration();

    @InterfaceC1294060jmO
    void onClipStart(NLETrackSlot nLETrackSlot);

    @InterfaceC1294060jmO
    void onEditClipChange();

    @InterfaceC1294060jmO
    void onKeyframeSelected(NLETimeSpaceNode nLETimeSpaceNode);

    @InterfaceC1294060jmO
    void onMainTrackDragBegin();

    @InterfaceC1294060jmO
    void onMainTrackDragEnd(int i, int i2);

    @InterfaceC1294060jmO
    void onMainTrackMoveSlot(NLETrackSlot nLETrackSlot, int i, int i2);

    void onMove(int i, int i2, NLETrackSlot nLETrackSlot, long j, long j2, long j3, boolean z);

    void onMoveFail(NLETrackSlot nLETrackSlot);

    @InterfaceC1294060jmO
    void onScale(float f);

    @InterfaceC1294060jmO
    void onScaleBegin();

    @InterfaceC1294060jmO
    void onScaleEnd();

    @InterfaceC1294060jmO
    void onStartAndDuration(NLETrackSlot nLETrackSlot, long j, long j2, int i);

    @InterfaceC1294060jmO
    void onTransitionClick(NLETrackSlot nLETrackSlot, NLETrackSlot nLETrackSlot2);

    @InterfaceC1294060jmO
    void onUnableToSetTransition(int i);

    void onVideoPositionChanged(SeekInfo seekInfo);
}
