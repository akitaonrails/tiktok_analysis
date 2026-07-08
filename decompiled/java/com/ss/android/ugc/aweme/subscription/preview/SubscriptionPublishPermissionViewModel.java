package com.ss.android.ugc.aweme.subscription.preview;

import X.AbstractC1778000wMw;
import X.AbstractC1868600yj4;
import X.C10AI;
import X.C10AS;
import X.C10AU;
import X.C10AX;
import X.C10C0;
import X.C10C3;
import X.C10C4;
import X.C10C5;
import X.C10FS;
import X.C11NJ;
import X.C13LP;
import X.C1413370msp;
import X.C1428470nHB;
import X.C1447940nma;
import X.C1777980wMu;
import X.C1777990wMv;
import X.C1778010wMx;
import X.C1868580yj2;
import X.C1868590yj3;
import X.C1868610yj5;
import X.C19206410By;
import X.C19210910Dr;
import X.EnumC19206310Bx;
import Y.AfS197S0100000_28;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.creative.model.CMPreviewInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.PrivacySettingModel;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.SubOnlyPhotoPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.subscription.utils.SingleLiveData;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes29.dex */
public final class SubscriptionPublishPermissionViewModel extends ViewModel {
    public final C10C0 LL;
    public final C11NJ LLILLJJLI;
    public final MutableLiveData<C10C0> LLILLL;
    public final MutableLiveData<Boolean> LLILZ;
    public final MutableLiveData LLILZIL;
    public final SingleLiveData<C10C4> LLILZLL;
    public final SingleLiveData LLIZ;
    public final MutableLiveData<Boolean> LLIZLLLIL;
    public final MutableLiveData LLJ;
    public final MutableLiveData<AbstractC1778000wMw> LLJI;
    public final MutableLiveData LLJIJIL;
    public final SingleLiveData<Boolean> LLJILJIL;
    public final SingleLiveData LLJILJILJ;
    public final SingleLiveData<AbstractC1868600yj4> LLJILLL;
    public final SingleLiveData LLJJ;

    public SubscriptionPublishPermissionViewModel() {
        this(0);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        this.LLILLJJLI.LJ();
        super.onCleared();
    }

    public final C10C0 wQ2() {
        C10C0 value = this.LLILLL.getValue();
        return value == null ? this.LL : value;
    }

    public SubscriptionPublishPermissionViewModel(int i) {
        C10C0 c10c0 = new C10C0(0);
        this.LL = c10c0;
        this.LLILLJJLI = new C11NJ();
        this.LLILLL = new MutableLiveData<>(c10c0);
        Boolean bool = Boolean.FALSE;
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>(bool);
        this.LLILZ = mutableLiveData;
        this.LLILZIL = mutableLiveData;
        SingleLiveData<C10C4> singleLiveData = new SingleLiveData<>();
        this.LLILZLL = singleLiveData;
        this.LLIZ = singleLiveData;
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>(bool);
        this.LLIZLLLIL = mutableLiveData2;
        this.LLJ = mutableLiveData2;
        MutableLiveData<AbstractC1778000wMw> mutableLiveData3 = new MutableLiveData<>();
        this.LLJI = mutableLiveData3;
        this.LLJIJIL = mutableLiveData3;
        SingleLiveData<Boolean> singleLiveData2 = new SingleLiveData<>();
        this.LLJILJIL = singleLiveData2;
        this.LLJILJILJ = singleLiveData2;
        SingleLiveData<AbstractC1868600yj4> singleLiveData3 = new SingleLiveData<>();
        this.LLJILLL = singleLiveData3;
        this.LLJJ = singleLiveData3;
    }

    public static EnumC19206310Bx zQ2(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel != null) {
            if (videoPublishEditModel.getCreationMode() == 1) {
                return EnumC19206310Bx.VIDEO;
            }
            if (C1428470nHB.LJJZZI(videoPublishEditModel)) {
                return EnumC19206310Bx.PHOTO;
            }
        }
        return EnumC19206310Bx.OTHER;
    }

    public final void yQ2(EnumC19206310Bx enumC19206310Bx) {
        CreativeModel creativeModel;
        PrivacySettingModel privacySettingModel;
        CMPreviewInfo cMPreviewInfo;
        CreativeModel creativeModel2;
        PrivacySettingModel privacySettingModel2;
        CMPreviewInfo cMPreviewInfo2;
        CreativeModel creativeModel3;
        PrivacySettingModel privacySettingModel3;
        CMPreviewInfo cMPreviewInfo3;
        if (C19206410By.LIZ[enumC19206310Bx.ordinal()] == 1) {
            VideoPublishEditModel videoPublishEditModel = wQ2().LIZJ;
            if (videoPublishEditModel != null && (creativeModel3 = videoPublishEditModel.creativeModel) != null && (privacySettingModel3 = creativeModel3.privacySettingModel) != null && (cMPreviewInfo3 = privacySettingModel3.cmPreviewInfo) != null) {
                cMPreviewInfo3.isPreviewEnabled = false;
            }
            VideoPublishEditModel videoPublishEditModel2 = wQ2().LIZJ;
            if (videoPublishEditModel2 != null && (creativeModel2 = videoPublishEditModel2.creativeModel) != null && (privacySettingModel2 = creativeModel2.privacySettingModel) != null && (cMPreviewInfo2 = privacySettingModel2.cmPreviewInfo) != null) {
                cMPreviewInfo2.previewDurationTimeInMs = 0L;
            }
            VideoPublishEditModel videoPublishEditModel3 = wQ2().LIZJ;
            if (videoPublishEditModel3 != null && (creativeModel = videoPublishEditModel3.creativeModel) != null && (privacySettingModel = creativeModel.privacySettingModel) != null && (cMPreviewInfo = privacySettingModel.cmPreviewInfo) != null) {
                cMPreviewInfo.previewStartTimeInMs = 0L;
            }
        }
        this.LLJI.postValue(C1778010wMx.LIZ);
        this.LLJILLL.postValue(C1868610yj5.LIZ);
    }

    public final void xQ2(VideoPublishEditModel videoPublishEditModel, String str) {
        PrivacySettingModel privacySettingModel;
        long j;
        CMPreviewInfo cMPreviewInfo;
        CreativeModel creativeModel;
        int i = C19206410By.LIZ[zQ2(videoPublishEditModel).ordinal()];
        if (i != 1) {
            if (i != 2) {
                this.LLILZLL.postValue(C10C5.LIZ);
                return;
            } else if (wQ2().LIZ) {
                this.LLJILLL.postValue(new C1868580yj2(videoPublishEditModel, str));
                return;
            } else {
                this.LLILZLL.postValue(C10C3.LIZ);
                return;
            }
        }
        if (wQ2().LIZ) {
            if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null) {
                privacySettingModel = creativeModel.privacySettingModel;
            } else {
                privacySettingModel = null;
            }
            C10AI c10ai = C10AI.LIZ;
            if (privacySettingModel != null && (cMPreviewInfo = privacySettingModel.cmPreviewInfo) != null) {
                j = cMPreviewInfo.previewDurationTimeInMs;
            } else {
                j = 0;
            }
            c10ai.getClass();
            C10AI.LIZ(j, str);
            this.LLJILLL.postValue(new C1868590yj3(videoPublishEditModel, str));
            return;
        }
        this.LLILZLL.postValue(C10C5.LIZ);
    }

    public final void AQ2(boolean z, EnumC19206310Bx enumC19206310Bx, VideoPublishEditModel videoPublishEditModel) {
        C10C0 c10c0WQ2 = wQ2();
        c10c0WQ2.getClass();
        this.LLILLL.postValue(C10C0.LIZ(C10C0.LIZ(C10C0.LIZ(c10c0WQ2, z, null, null, 6), false, enumC19206310Bx, null, 5), false, null, videoPublishEditModel, 3));
        if (z) {
            MutableLiveData<Boolean> mutableLiveData = this.LLIZLLLIL;
            Boolean bool = Boolean.TRUE;
            mutableLiveData.postValue(bool);
            this.LLILLJJLI.LIZ(C19210910Dr.LIZ.LJJLJLI(new AfS197S0100000_28(this, 23)));
            Keva keva = C1413370msp.LIZ;
            if (keva.getBoolean("IS_FIRST_TIME_PERMISSION_PREVIEW_HIGHLIGHT", true)) {
                keva.storeBoolean("IS_FIRST_TIME_PERMISSION_PREVIEW_HIGHLIGHT", false);
                this.LLJILJIL.postValue(bool);
                return;
            }
            return;
        }
        this.LLIZLLLIL.postValue(Boolean.FALSE);
    }

    public final void vQ2(int i, VideoPublishEditModel videoPublishEditModel, String str) {
        List<SingleImageData> imageList;
        boolean z;
        Long lValueOf;
        long jLongValue;
        ImageAlbumData imageAlbumData;
        List<SingleImageData> imageList2;
        SingleImageData singleImageData;
        List<SingleImageData> imageList3;
        this.LLILZ.postValue(Boolean.FALSE);
        if (videoPublishEditModel == null) {
            return;
        }
        boolean z2 = true;
        boolean z3 = false;
        if (i == 4) {
            if (videoPublishEditModel.getCreationMode() != 1 && !C1428470nHB.LJJZZI(videoPublishEditModel)) {
                return;
            }
            this.LLILZ.postValue(Boolean.TRUE);
            int i2 = C19206410By.LIZ[zQ2(videoPublishEditModel).ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    ImageAlbumData imageAlbumData2 = videoPublishEditModel.getImageAlbumData();
                    if (imageAlbumData2 != null && (imageList3 = imageAlbumData2.getImageList()) != null && imageList3.size() >= 2) {
                        z3 = true;
                    }
                    boolean z4 = C1413370msp.LIZ.getBoolean("IS_PHOTO_PREVIEW_ON", true);
                    if (z4 && z3 && (imageAlbumData = videoPublishEditModel.getImageAlbumData()) != null && (imageList2 = imageAlbumData.getImageList()) != null && (singleImageData = (SingleImageData) C13LP.LJJJLL(imageList2)) != null) {
                        singleImageData.setSubOnlyPhotoPreviewInfo(new SubOnlyPhotoPreviewInfo(true));
                        C19210910Dr.LIZ(C10AX.LIZ);
                    }
                    EnumC19206310Bx enumC19206310Bx = EnumC19206310Bx.PHOTO;
                    AQ2(z3, enumC19206310Bx, videoPublishEditModel);
                    Set setLIZLLL = C1447940nma.LIZLLL(videoPublishEditModel);
                    if (z3 && z4 && (!setLIZLLL.isEmpty())) {
                        this.LLJI.postValue(new C1777990wMv(setLIZLLL.size()));
                        return;
                    } else {
                        yQ2(enumC19206310Bx);
                        return;
                    }
                }
                return;
            }
            if (C10FS.LIZLLL(videoPublishEditModel.getVideoLength()) >= 30.0f) {
                z = true;
            } else {
                z = false;
            }
            if (videoPublishEditModel.creativeModel.privacySettingModel.cmPreviewInfo == null && z) {
                CMPreviewInfo cMPreviewInfo = new CMPreviewInfo(0L, 10000L, true);
                videoPublishEditModel.creativeModel.privacySettingModel.cmPreviewInfo = cMPreviewInfo;
                C19210910Dr.LIZ(new C10AU(cMPreviewInfo));
            }
            EnumC19206310Bx enumC19206310Bx2 = EnumC19206310Bx.VIDEO;
            AQ2(z, enumC19206310Bx2, videoPublishEditModel);
            CMPreviewInfo cMPreviewInfo2 = videoPublishEditModel.creativeModel.privacySettingModel.cmPreviewInfo;
            if (cMPreviewInfo2 == null || !cMPreviewInfo2.isPreviewEnabled) {
                z2 = false;
            }
            long j = 0;
            if (z && z2) {
                if (cMPreviewInfo2 != null) {
                    lValueOf = Long.valueOf(cMPreviewInfo2.previewDurationTimeInMs);
                } else {
                    lValueOf = null;
                }
                MutableLiveData<AbstractC1778000wMw> mutableLiveData = this.LLJI;
                if (lValueOf != null) {
                    jLongValue = lValueOf.longValue();
                } else {
                    jLongValue = 0;
                }
                mutableLiveData.postValue(new C1777980wMu(jLongValue));
            } else {
                yQ2(enumC19206310Bx2);
            }
            C10AI c10ai = C10AI.LIZ;
            CMPreviewInfo cMPreviewInfo3 = videoPublishEditModel.creativeModel.privacySettingModel.cmPreviewInfo;
            if (cMPreviewInfo3 != null) {
                j = cMPreviewInfo3.previewDurationTimeInMs;
            }
            c10ai.getClass();
            C10AI.LIZIZ(j, str);
            return;
        }
        ImageAlbumData imageAlbumData3 = videoPublishEditModel.getImageAlbumData();
        if (imageAlbumData3 != null && (imageList = imageAlbumData3.getImageList()) != null) {
            Iterator<SingleImageData> it2 = imageList.iterator();
            while (it2.hasNext()) {
                it2.next().setSubOnlyPhotoPreviewInfo(new SubOnlyPhotoPreviewInfo(false));
            }
        }
        C19210910Dr.LIZ(C10AS.LIZ);
    }
}
