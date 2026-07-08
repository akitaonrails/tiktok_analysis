package com.ss.android.ugc.aweme.shortvideo.cut.videoedit;

import X.C0WIY;
import X.C12W6;
import X.C19763212Uc;
import X.C19764012Uk;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.cut.model.CutVideoContext;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import pyl.s;

/* JADX INFO: loaded from: classes30.dex */
public class VideoEditViewModel extends ViewModel {
    public boolean LL;
    public final MutableLiveData<Integer> LLILLJJLI = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LLILLL = new MutableLiveData<>();
    public final MutableLiveData<Float> LLILZ = new MutableLiveData<>();
    public final MutableLiveData<Long> LLILZIL = new MutableLiveData<>();
    public final MutableLiveData<Void> LLILZLL = new MutableLiveData<>();
    public final MutableLiveData<Void> LLIZ = new MutableLiveData<>();
    public final MutableLiveData<Void> LLIZLLLIL = new MutableLiveData<>();
    public final MutableLiveData<Void> LLJ = new MutableLiveData<>();
    public final MutableLiveData<Void> LLJI = new MutableLiveData<>();
    public final MutableLiveData<Void> LLJIJIL = new MutableLiveData<>();
    public final MutableLiveData<Void> LLJILJIL = new MutableLiveData<>();
    public final MutableLiveData<Void> LLJILJILJ = new MutableLiveData<>();
    public final MutableLiveData<Void> LLJILLL = new MutableLiveData<>();
    public final MutableLiveData<Float> LLJJ = new MutableLiveData<>();
    public final MutableLiveData<C0WIY<Integer, Integer>> LLJJI = new MutableLiveData<>();
    public final MutableLiveData<Void> LLJJIII = new MutableLiveData<>();
    public final MutableLiveData<Void> LLJJIJI = new MutableLiveData<>();
    public final MutableLiveData<VideoSegment> LLJJIJIIJIL = new MutableLiveData<>();
    public final MutableLiveData<Boolean> LLJJIJIL = new MutableLiveData<>();
    public final MutableLiveData<Void> LLJJJ = new MutableLiveData<>();
    public final MutableLiveData<Void> LLJJJIL = new MutableLiveData<>();
    public final MutableLiveData<Void> LLJJJJ = new MutableLiveData<>();
    public final MutableLiveData<CutVideoContext> LLJJJJJIL = new MutableLiveData<>();
    public final HashMap<String, Integer> LLJJJJLIIL = new HashMap<>();
    public final HashMap<String, Integer> LLJJL = new HashMap<>();
    public C19764012Uk LLJJLIIIJLLLLLLLZ;

    public final float CQ2() {
        return this.LLJJJJJIL.getValue().totalSpeed;
    }

    public final List<VideoSegment> DQ2() {
        return this.LLJJJJJIL.getValue().getVideoSegmentList();
    }

    public final boolean wQ2() {
        if (this.LLJJJJJIL.getValue() == null || this.LLJJJJJIL.getValue().getVideoSegmentList() == null || this.LLJJJJJIL.getValue().getVideoSegmentList().isEmpty()) {
            return false;
        }
        VideoSegment videoSegment = (VideoSegment) ListProtector.get(this.LLJJJJJIL.getValue().getVideoSegmentList(), 0);
        return videoSegment.width > 0 && videoSegment.height > 0;
    }

    public final List<VideoSegment> zQ2() {
        return this.LLJJJJJIL.getValue().getVideoSegmentList();
    }

    public final int AQ2(int i) {
        CutVideoContext value = this.LLJJJJJIL.getValue();
        if (value != null) {
            VideoSegment videoSegment = (VideoSegment) ListProtector.get(value.getVideoSegmentList(), i);
            if (this.LLJJJJLIIL.containsKey(videoSegment.LJFF(true))) {
                return this.LLJJJJLIIL.get(videoSegment.LJFF(true)).intValue();
            }
            return 0;
        }
        return 0;
    }

    public final VideoSegment BQ2(int i) {
        CutVideoContext value = this.LLJJJJJIL.getValue();
        if (value == null) {
            return null;
        }
        return (VideoSegment) ListProtector.get(value.getVideoSegmentList(), i);
    }

    public final void EQ2(float f) {
        this.LLILZ.setValue(Float.valueOf(f));
    }

    public final void FQ2(boolean z) {
        this.LLILLL.setValue(Boolean.valueOf(z));
    }

    public final void IQ2(List<VideoSegment> list) {
        CutVideoContext cutVideoContext = new CutVideoContext();
        cutVideoContext.setVideoSegmentList(list);
        cutVideoContext.totalSpeed = s.NORMAL.value();
        this.LLJJJJJIL.setValue(cutVideoContext);
    }

    public final void JQ2(int i) {
        this.LLILLJJLI.setValue(Integer.valueOf(i));
    }

    public final void vQ2(List<VideoSegment> list) {
        if (list != null && !list.isEmpty()) {
            CutVideoContext value = this.LLJJJJJIL.getValue();
            if (value != null) {
                value.getVideoSegmentList().addAll(list);
            }
            MutableLiveData<CutVideoContext> mutableLiveData = this.LLJJJJJIL;
            mutableLiveData.postValue(mutableLiveData.getValue());
        }
    }

    public final void xQ2(String str) {
        CutVideoContext value = this.LLJJJJJIL.getValue();
        if (value != null) {
            for (VideoSegment videoSegment : value.getVideoSegmentList()) {
                if (videoSegment.LJFF(true).equals(str)) {
                    videoSegment.isDeleted = true;
                    return;
                }
            }
        }
    }

    public final int yQ2(String str) {
        Iterator<VideoSegment> it2 = this.LLJJJJJIL.getValue().getVideoSegmentList().iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (it2.next().LJFF(true).equals(str)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final void GQ2(C19763212Uc c19763212Uc, int i) {
        C12W6 c12w6;
        CutVideoContext value = this.LLJJJJJIL.getValue();
        if (value != null) {
            VideoSegment videoSegment = (VideoSegment) ListProtector.get(value.getVideoSegmentList(), i);
            videoSegment.LJIIL(c19763212Uc.LIZLLL);
            long j = c19763212Uc.LIZ;
            if (videoSegment.LJIIIIZZ()) {
                videoSegment.stickPointVideoSegment.setVideoStart(j);
            } else {
                videoSegment.start = j;
            }
            videoSegment.LJIIJ(c19763212Uc.LIZIZ);
            videoSegment.rotate = c19763212Uc.LIZJ;
            C19764012Uk c19764012Uk = this.LLJJLIIIJLLLLLLLZ;
            if (c19764012Uk != null && (c12w6 = c19764012Uk.LIZ.LLJI) != null) {
                c12w6.LLLJ(videoSegment);
            }
        }
    }

    public final void HQ2(int i, int i2) {
        CutVideoContext value = this.LLJJJJJIL.getValue();
        if (value != null && !value.getVideoSegmentList().isEmpty()) {
            this.LLJJJJLIIL.put(((VideoSegment) ListProtector.get(value.getVideoSegmentList(), i)).LJFF(true), Integer.valueOf(i2));
        }
    }
}
