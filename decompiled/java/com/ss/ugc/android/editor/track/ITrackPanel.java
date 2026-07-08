package com.ss.ugc.android.editor.track;

import X.C0E6E;
import X.C359640E8c;
import android.graphics.Bitmap;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoAnimation;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public interface ITrackPanel {
    public static final C359640E8c Companion = new Object() { // from class: X.0E8c
    };

    void adjustAnimation(NLEVideoAnimation nLEVideoAnimation);

    void compressSubTrack(boolean z);

    CurrentSlotInfo getCurrentSlotInfo();

    C0E6E getSelectTrackStyle(NLETrack nLETrack);

    void selectCurrentSlot(C0E6E c0e6e);

    void selectSlot(NLETrackSlot nLETrackSlot, C0E6E c0e6e);

    void setActionListener(TrackPanelActionListener trackPanelActionListener);

    void setActive(boolean z);

    void setCoverImage(Bitmap bitmap);

    void setSelectTrackStyle(C0E6E c0e6e);

    void startRecordAudio(long j, int i);

    void stopRecordAudio();

    void switchUIState(TrackShowType trackShowType);

    void unSelectCurrentSlot();

    void unSelectTransition();

    void updateNLEModel(NLEModel nLEModel, int i);

    void updatePlayState(PlayPositionState playPositionState, boolean z);

    void updateRecordWavePoint(List<Float> list);
}
