package com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import X.C004I;
import X.C013C;
import X.C08XD;
import X.C1697810uHb;
import X.C201955140j;
import X.C2188811AlT;
import X.C273040An0;
import X.C525050KiV;
import X.C540060LGa;
import X.C552700Lm0;
import X.C786410Ut5;
import X.EnumC538230L8z;
import Y.AComparatorS27S0000000_8;
import Y.ARunnableS77S0200000_8;
import android.content.Context;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.mediachoose.helper.LivePhotoInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS122S1100000_8;
import kotlin.jvm.internal.AwS23S0010000_8;
import kotlin.jvm.internal.AwS374S0200000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.AwS96S0110000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class ChooseMediaViewModel extends BaseJediViewModel<ChooseMediaState> {
    public static final /* synthetic */ int LLJJJJ = 0;
    public TikTokMediaModel LLJ;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public TikTokMediaModel LLJJ;
    public boolean LLJJIJIL;
    public boolean LLJJJIL;
    public final ArrayList<TikTokMediaModel> LLILZIL = new ArrayList<>();
    public final ArrayList<TikTokMediaModel> LLILZLL = new ArrayList<>();
    public final ArrayList<TikTokMediaModel> LLIZ = new ArrayList<>();
    public final ArrayList<TikTokMediaModel> LLIZLLLIL = new ArrayList<>();
    public final ArrayList<TikTokMediaModel> LLJI = new ArrayList<>();
    public final ArrayList<TikTokMediaModel> LLJIJIL = new ArrayList<>();
    public final ArrayList<TikTokMediaModel> LLJILJIL = new ArrayList<>();
    public EnumC538230L8z LLJJI = EnumC538230L8z.MIXED;
    public final BPEAHandler LLJJIII = new BPEAHandler(Looper.getMainLooper());
    public String LLJJIJI = "tab";
    public String LLJJIJIIJIL = "tab";
    public String LLJJJ = "";

    public final ArrayList<TikTokMediaModel> nR2() {
        return lR2(this.LLIZLLLIL);
    }

    public final ArrayList<TikTokMediaModel> oR2() {
        ArrayList<TikTokMediaModel> arrayList = new ArrayList<>();
        arrayList.addAll(this.LLILZIL);
        return arrayList;
    }

    public final void rR2() {
        yR2(AFwS239S0000000_8.get$arr$(76));
    }

    public final void uR2() {
        yR2(new AwS23S0010000_8(3));
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    public final C004I zQ2() {
        return new ChooseMediaState(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 1048575, null);
    }

    @Override // com.bytedance.jedi.arch.JediViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LLJJIII.removeCallbacksAndMessages(null);
    }

    public static ArrayList lR2(List list) {
        TikTokMediaModel tikTokMediaModelLJIJ;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            TikTokMediaModel tikTokMediaModel = (TikTokMediaModel) it2.next();
            LivePhotoInfo livePhotoInfoCopy = null;
            try {
                MediaModel mediaModelClone = tikTokMediaModel.clone();
                if (mediaModelClone instanceof TikTokMediaModel) {
                    tikTokMediaModelLJIJ = (TikTokMediaModel) mediaModelClone;
                } else {
                    tikTokMediaModelLJIJ = null;
                }
                if (tikTokMediaModelLJIJ == null) {
                    tikTokMediaModelLJIJ = tikTokMediaModel.LJIJ();
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                tikTokMediaModelLJIJ = tikTokMediaModel.LJIJ();
            }
            tikTokMediaModelLJIJ.originLocalUriPath = tikTokMediaModel.originLocalUriPath;
            tikTokMediaModelLJIJ.mediaPickerAbsolutePath = tikTokMediaModel.mediaPickerAbsolutePath;
            tikTokMediaModelLJIJ.startTime = tikTokMediaModel.startTime;
            tikTokMediaModelLJIJ.endTime = tikTokMediaModel.endTime;
            tikTokMediaModelLJIJ.speed = tikTokMediaModel.speed;
            tikTokMediaModelLJIJ.selectIndex = tikTokMediaModel.selectIndex;
            tikTokMediaModelLJIJ.abRollIndex = tikTokMediaModel.abRollIndex;
            tikTokMediaModelLJIJ.mediaIndex = tikTokMediaModel.mediaIndex;
            tikTokMediaModelLJIJ.mediaRatio = tikTokMediaModel.mediaRatio;
            tikTokMediaModelLJIJ.clipDuration = tikTokMediaModel.clipDuration;
            tikTokMediaModelLJIJ.isFromRecord = tikTokMediaModel.isFromRecord;
            tikTokMediaModelLJIJ.canClip = tikTokMediaModel.canClip;
            tikTokMediaModelLJIJ.newFlag = tikTokMediaModel.newFlag;
            tikTokMediaModelLJIJ.selectionScenario = tikTokMediaModel.selectionScenario;
            tikTokMediaModelLJIJ.isLiveRecordingsGuide = tikTokMediaModel.isLiveRecordingsGuide;
            LivePhotoInfo livePhotoInfo = tikTokMediaModel.livePhotoInfo;
            if (livePhotoInfo != null) {
                livePhotoInfoCopy = livePhotoInfo.copy(livePhotoInfo.videoPath, livePhotoInfo.videoDuration, livePhotoInfo.livePhotoPreviewModeStr, livePhotoInfo.hasUserClickedIcon);
            }
            tikTokMediaModelLJIJ.livePhotoInfo = livePhotoInfoCopy;
            arrayList.add(tikTokMediaModelLJIJ);
        }
        return arrayList;
    }

    public final void Kw2(TikTokMediaModel tikTokMediaModel) {
        if (this.LLJJIJIL) {
            setStateImmediate(new AwS587S0100000_8(tikTokMediaModel, 125));
        } else {
            yR2(new AwS587S0100000_8(tikTokMediaModel, 126));
        }
    }

    public final boolean qR2(Context context) {
        return Intrinsics.LJFF(this.LLJJJ, C540060LGa.LIZJ(context));
    }

    public final void sR2(TikTokMediaModel tikTokMediaModel) {
        if (this.LLJJIJIL) {
            setStateImmediate(new AwS587S0100000_8(tikTokMediaModel, 121));
        } else {
            yR2(new AwS587S0100000_8(tikTokMediaModel, 122));
        }
    }

    public final void tR2(TikTokMediaModel tikTokMediaModel) {
        if (this.LLJJIJIL) {
            setStateImmediate(new AwS587S0100000_8(tikTokMediaModel, 123));
        } else {
            yR2(new AwS587S0100000_8(tikTokMediaModel, 124));
        }
    }

    public final void vR2(List<? extends TikTokMediaModel> list) {
        if (list.isEmpty()) {
            this.LLIZLLLIL.clear();
            yR2(AFwS239S0000000_8.get$arr$(90));
            return;
        }
        ArrayList arrayListLR2 = lR2(list);
        int i = 0;
        for (Object obj : arrayListLR2) {
            int i2 = i + 1;
            if (i >= 0) {
                TikTokMediaModel tikTokMediaModel = (TikTokMediaModel) obj;
                tikTokMediaModel.selectIndex = i2;
                tikTokMediaModel.mediaIndex = i;
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        this.LLIZLLLIL.clear();
        this.LLIZLLLIL.addAll(arrayListLR2);
        yR2(new AwS587S0100000_8(this, 127));
    }

    public final void wR2(List<? extends TikTokMediaModel> list) {
        yR2(new AwS374S0200000_8((List) list, (List<? extends TikTokMediaModel>) this, (ChooseMediaViewModel) 48));
    }

    public final void xR2(ArrayList<TikTokMediaModel> arrayList) {
        yR2(new AwS587S0100000_8((ArrayList) arrayList, (ArrayList<TikTokMediaModel>) 128));
    }

    public final void yR2(Function1<? super ChooseMediaState, ChooseMediaState> function1) {
        if (((Boolean) C273040An0.LIZ.getValue()).booleanValue()) {
            C786410Ut5.LJJZZIII(this.LLJJIII, new ARunnableS77S0200000_8(this, function1, 8));
        } else {
            setState(function1);
        }
    }

    public final void zR2(TikTokMediaModel tikTokMediaModel) {
        if (!tikTokMediaModel.LJIIJJI() || tikTokMediaModel.livePhotoInfo == null || !C525050KiV.LIZIZ(tikTokMediaModel, this.LLIZLLLIL)) {
            return;
        }
        yR2(new AwS587S0100000_8(this, 129));
    }

    public final void AR2(List<TikTokMediaModel> list, boolean z) {
        TikTokMediaModel tikTokMediaModel;
        if (this.LLJJJIL && (tikTokMediaModel = this.LLJ) != null) {
            if (list.isEmpty()) {
                list.add(tikTokMediaModel);
            } else {
                Iterator<TikTokMediaModel> it2 = list.iterator();
                int i = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (tikTokMediaModel.date >= it2.next().date) {
                        if (i >= 0) {
                            if (i <= list.size() - 1) {
                                ListProtector.add(list, i, tikTokMediaModel);
                            }
                        }
                    } else {
                        i++;
                    }
                }
                if (tikTokMediaModel.date > ((MediaModel) ListProtector.get(list, 0)).date) {
                    ListProtector.add(list, 0, tikTokMediaModel);
                } else {
                    list.add(tikTokMediaModel);
                }
            }
        }
        yR2(new AwS96S0110000_8((List) list, (List<TikTokMediaModel>) z, true));
        this.LLIZ.clear();
        this.LLIZ.addAll(list);
        if (this.LLJJI == EnumC538230L8z.ALL) {
            wR2(this.LLIZ);
        }
    }

    public final void BR2(List<? extends TikTokMediaModel> list, boolean z) {
        yR2(new AwS96S0110000_8((List) list, (List<TikTokMediaModel>) z, true));
        this.LLJI.clear();
        this.LLJI.addAll(list);
        if (this.LLJJI == EnumC538230L8z.LIVE_PHOTOS) {
            wR2(this.LLJI);
        }
    }

    public final void CR2(List<? extends TikTokMediaModel> list, boolean z) {
        if (z) {
            this.LLJILJIL.clear();
        }
        this.LLJILJIL.addAll(list);
        C552700Lm0 c552700Lm0 = C552700Lm0.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("incrementalUpdateLiveRecordingsMediaList: ");
        sbLIZ.append(list.size());
        sbLIZ.append(", ");
        sbLIZ.append(this.LLJILJIL.size());
        C201955140j.LIZLLL(c552700Lm0, "ChooseMediaVideModel", C2188811AlT.LIZIZ(sbLIZ));
        yR2(new AwS96S0110000_8(this, z, 9));
    }

    public final void DR2(List<? extends TikTokMediaModel> list, boolean z) {
        yR2(new AwS96S0110000_8((List) list, (List<TikTokMediaModel>) z, true));
        this.LLILZIL.clear();
        this.LLILZIL.addAll(list);
        if (this.LLJJI == EnumC538230L8z.PHOTOS) {
            wR2(this.LLILZIL);
        }
    }

    public final void ER2(String str, boolean z) {
        C013C c013c = new C013C();
        c013c.element = z;
        yR2(new AwS122S1100000_8(str, c013c, 3));
    }

    public final void pR2(List<? extends TikTokMediaModel> list, boolean z) {
        this.LLJIJIL.addAll(list);
        ArrayList<TikTokMediaModel> arrayList = this.LLJIJIL;
        if (arrayList.size() > 1) {
            C08XD.LJJ(arrayList, new AComparatorS27S0000000_8(2));
        }
        C552700Lm0 c552700Lm0 = C552700Lm0.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("incrementalUpdateAiContentMediaList: ");
        sbLIZ.append(list.size());
        sbLIZ.append(", ");
        sbLIZ.append(this.LLJIJIL.size());
        C201955140j.LIZLLL(c552700Lm0, "ChooseMediaVideModel", C2188811AlT.LIZIZ(sbLIZ));
        yR2(new AwS96S0110000_8(this, z, 3));
    }

    public static void mR2(ChooseMediaViewModel chooseMediaViewModel, long j, Iterable iterable, Iterable iterable2, int i) {
        if ((i & 2) != 0) {
            iterable = chooseMediaViewModel.LLIZ;
        }
        if ((i & 4) != 0) {
            iterable2 = chooseMediaViewModel.LLILZLL;
        }
        if (j > 0) {
            for (TikTokMediaModel tikTokMediaModel : iterable) {
                tikTokMediaModel.canClip = true;
                tikTokMediaModel.clipDuration = j;
            }
            for (TikTokMediaModel tikTokMediaModel2 : iterable2) {
                tikTokMediaModel2.canClip = true;
                tikTokMediaModel2.clipDuration = j;
            }
        }
    }
}
