package com.ss.android.ugc.aweme.creative.model.ailive;

import X.C040H;
import X.C09CT;
import X.C13LQ;
import X.C564490MBz;
import X.C786410Ut5;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.model.ailive.AIAliveRestoreData;
import com.ss.android.ugc.aweme.creative.model.ailive.AILivePhotoConsumptionModel;
import com.ss.android.ugc.aweme.creative.model.ailive.AILivePhotoModel;
import com.ss.android.ugc.aweme.creative.model.ailive.AILivePhotoSwitchFromImageModel;
import com.ss.android.ugc.aweme.creative.model.ailive.NewPromptPageModel;
import com.ss.android.ugc.aweme.creative.model.ailive.PageDataCache;
import com.ss.android.ugc.aweme.creative.model.ailive.ProgressModel;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptPageMobParam;
import com.ss.android.ugc.aweme.creative.model.ailive.RecommendMusicMobParams;
import com.ss.android.ugc.aweme.creative.model.ailive.TransitionModel;
import com.ss.android.ugc.aweme.creative.model.ailive.UsageStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class AILivePhotoModel implements Parcelable {

    @C040H
    public boolean aiLiveSwitch;

    @C040H
    public String aiLiveSwitchStyle;

    @C09CT("anchor_model")
    public AILivePhotoConsumptionModel consumptionModel;

    @C09CT("has_auto_show")
    public boolean hasAutoShow;

    @C09CT("initial_ai_livephoto_save_type")
    public Integer initialDraftSaveType;

    @C09CT("is_failure_recall")
    public boolean isFailureRecall;

    @C040H
    public ProgressModel lastFailProgressModel;

    @C09CT("last_progress_model")
    public ProgressModel lastStatus;

    @C040H
    public UsageStatus mobDraftStatus;

    @C09CT("mob_param")
    public PromptPageMobParam mobParam;

    @C040H
    public RecommendMusicMobParams musicMobParams;

    @C040H
    public boolean needAutoShow;

    @C09CT("need_repair_nle")
    public boolean needRepairNLE;

    @C09CT("new_prompt_page_model")
    public final NewPromptPageModel newPromptPageModel;

    @C09CT("origin_canvas_video_data")
    public CanvasVideoData originCanvasVideoData;

    @C040H
    public PageDataCache pageDataCache;

    @C09CT("progress_model")
    public ProgressModel progressModel;

    @C09CT("restore_data")
    public final AIAliveRestoreData restoreData;

    @C040H
    public int shootGuideType;

    @C040H
    public UsageStatus statusFromDraft;

    @C09CT("switch_from_image_model")
    public AILivePhotoSwitchFromImageModel switchFromImageModel;

    @C09CT("transition_model")
    public TransitionModel transitionModel;
    public static final C564490MBz Companion = new Object() { // from class: X.0MBz
    };
    public static final Parcelable.Creator<AILivePhotoModel> CREATOR = new Parcelable.Creator<AILivePhotoModel>() { // from class: X.0MBv
        @Override // android.os.Parcelable.Creator
        public final AILivePhotoModel createFromParcel(Parcel parcel) {
            ProgressModel progressModelCreateFromParcel;
            ProgressModel progressModelCreateFromParcel2;
            ProgressModel progressModelCreateFromParcel3;
            TransitionModel transitionModelCreateFromParcel;
            boolean z;
            boolean z2;
            Integer numValueOf;
            boolean z3;
            boolean z4;
            boolean z5;
            AILivePhotoSwitchFromImageModel aILivePhotoSwitchFromImageModelCreateFromParcel;
            RecommendMusicMobParams recommendMusicMobParamsCreateFromParcel = null;
            if (parcel.readInt() == 0) {
                progressModelCreateFromParcel = null;
            } else {
                progressModelCreateFromParcel = ProgressModel.CREATOR.createFromParcel(parcel);
            }
            ProgressModel progressModel = progressModelCreateFromParcel;
            if (parcel.readInt() == 0) {
                progressModelCreateFromParcel2 = null;
            } else {
                progressModelCreateFromParcel2 = ProgressModel.CREATOR.createFromParcel(parcel);
            }
            ProgressModel progressModel2 = progressModelCreateFromParcel2;
            if (parcel.readInt() == 0) {
                progressModelCreateFromParcel3 = null;
            } else {
                progressModelCreateFromParcel3 = ProgressModel.CREATOR.createFromParcel(parcel);
            }
            ProgressModel progressModel3 = progressModelCreateFromParcel3;
            AIAliveRestoreData aIAliveRestoreDataCreateFromParcel = AIAliveRestoreData.CREATOR.createFromParcel(parcel);
            CanvasVideoData canvasVideoData = (CanvasVideoData) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                transitionModelCreateFromParcel = null;
            } else {
                transitionModelCreateFromParcel = TransitionModel.CREATOR.createFromParcel(parcel);
            }
            TransitionModel transitionModel = transitionModelCreateFromParcel;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (parcel.readInt() == 0) {
                numValueOf = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
            }
            Parcelable.Creator<UsageStatus> creator = UsageStatus.CREATOR;
            UsageStatus usageStatusCreateFromParcel = creator.createFromParcel(parcel);
            UsageStatus usageStatusCreateFromParcel2 = creator.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            String string = parcel.readString();
            if (parcel.readInt() != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            int i = parcel.readInt();
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            AILivePhotoConsumptionModel aILivePhotoConsumptionModelCreateFromParcel = AILivePhotoConsumptionModel.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                aILivePhotoSwitchFromImageModelCreateFromParcel = null;
            } else {
                aILivePhotoSwitchFromImageModelCreateFromParcel = AILivePhotoSwitchFromImageModel.CREATOR.createFromParcel(parcel);
            }
            AILivePhotoSwitchFromImageModel aILivePhotoSwitchFromImageModel = aILivePhotoSwitchFromImageModelCreateFromParcel;
            PromptPageMobParam promptPageMobParamCreateFromParcel = PromptPageMobParam.CREATOR.createFromParcel(parcel);
            PageDataCache pageDataCacheCreateFromParcel = PageDataCache.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                recommendMusicMobParamsCreateFromParcel = RecommendMusicMobParams.CREATOR.createFromParcel(parcel);
            }
            return new AILivePhotoModel(progressModel, progressModel2, progressModel3, aIAliveRestoreDataCreateFromParcel, canvasVideoData, transitionModel, z, z2, numValueOf, usageStatusCreateFromParcel, usageStatusCreateFromParcel2, z3, string, z4, i, z5, aILivePhotoConsumptionModelCreateFromParcel, aILivePhotoSwitchFromImageModel, promptPageMobParamCreateFromParcel, pageDataCacheCreateFromParcel, recommendMusicMobParamsCreateFromParcel, NewPromptPageModel.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AILivePhotoModel[] newArray(int i) {
            return new AILivePhotoModel[i];
        }
    };

    public AILivePhotoModel() {
        this(null, null, null, new AIAliveRestoreData(null, null), null, null, false, false, null, UsageStatus.NOT_APPLY, UsageStatus.NOT_APPLY, false, null, false, 0, false, new AILivePhotoConsumptionModel(false, null, false, null, null, false), null, new PromptPageMobParam(0L, -1L, -1L, false, "", false, false, false, false, false, AILivePhotoRecallWay.NONE, false, false, null, null, 0, null, null, null), new PageDataCache(new PromptRequestState(null, null, false, null, 15, null), new PromptRequestState(null, null, false, null, 15, null), null, new PromptModel("", "", PromptType.NONE, "", "", "", false), false, false, false, false, false, null), null, new NewPromptPageModel(false));
    }

    public final boolean LJIIJJI() {
        return C13LQ.LJJIJIIJI(this.mobParam.recallWay, new AILivePhotoRecallWay[]{AILivePhotoRecallWay.INBOX, AILivePhotoRecallWay.IN_APP_PUSH, AILivePhotoRecallWay.OUT_APP_PUSH}) >= 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AILivePhotoModel)) {
            return false;
        }
        AILivePhotoModel aILivePhotoModel = (AILivePhotoModel) obj;
        return Intrinsics.LJFF(this.progressModel, aILivePhotoModel.progressModel) && Intrinsics.LJFF(this.lastStatus, aILivePhotoModel.lastStatus) && Intrinsics.LJFF(this.lastFailProgressModel, aILivePhotoModel.lastFailProgressModel) && Intrinsics.LJFF(this.restoreData, aILivePhotoModel.restoreData) && Intrinsics.LJFF(this.originCanvasVideoData, aILivePhotoModel.originCanvasVideoData) && Intrinsics.LJFF(this.transitionModel, aILivePhotoModel.transitionModel) && this.hasAutoShow == aILivePhotoModel.hasAutoShow && this.isFailureRecall == aILivePhotoModel.isFailureRecall && Intrinsics.LJFF(this.initialDraftSaveType, aILivePhotoModel.initialDraftSaveType) && this.mobDraftStatus == aILivePhotoModel.mobDraftStatus && this.statusFromDraft == aILivePhotoModel.statusFromDraft && this.needAutoShow == aILivePhotoModel.needAutoShow && Intrinsics.LJFF(this.aiLiveSwitchStyle, aILivePhotoModel.aiLiveSwitchStyle) && this.aiLiveSwitch == aILivePhotoModel.aiLiveSwitch && this.shootGuideType == aILivePhotoModel.shootGuideType && this.needRepairNLE == aILivePhotoModel.needRepairNLE && Intrinsics.LJFF(this.consumptionModel, aILivePhotoModel.consumptionModel) && Intrinsics.LJFF(this.switchFromImageModel, aILivePhotoModel.switchFromImageModel) && Intrinsics.LJFF(this.mobParam, aILivePhotoModel.mobParam) && Intrinsics.LJFF(this.pageDataCache, aILivePhotoModel.pageDataCache) && Intrinsics.LJFF(this.musicMobParams, aILivePhotoModel.musicMobParams) && Intrinsics.LJFF(this.newPromptPageModel, aILivePhotoModel.newPromptPageModel);
    }

    public final int hashCode() {
        ProgressModel progressModel = this.progressModel;
        int iHashCode = (progressModel == null ? 0 : progressModel.hashCode()) * 31;
        ProgressModel progressModel2 = this.lastStatus;
        int iHashCode2 = (iHashCode + (progressModel2 == null ? 0 : progressModel2.hashCode())) * 31;
        ProgressModel progressModel3 = this.lastFailProgressModel;
        int iHashCode3 = (((iHashCode2 + (progressModel3 == null ? 0 : progressModel3.hashCode())) * 31) + this.restoreData.hashCode()) * 31;
        CanvasVideoData canvasVideoData = this.originCanvasVideoData;
        int iHashCode4 = (iHashCode3 + (canvasVideoData == null ? 0 : canvasVideoData.hashCode())) * 31;
        TransitionModel transitionModel = this.transitionModel;
        int iHashCode5 = (((((iHashCode4 + (transitionModel == null ? 0 : transitionModel.hashCode())) * 31) + C786410Ut5.Z2(this.hasAutoShow)) * 31) + C786410Ut5.Z2(this.isFailureRecall)) * 31;
        Integer num = this.initialDraftSaveType;
        int iHashCode6 = (((((((iHashCode5 + (num == null ? 0 : num.hashCode())) * 31) + this.mobDraftStatus.hashCode()) * 31) + this.statusFromDraft.hashCode()) * 31) + C786410Ut5.Z2(this.needAutoShow)) * 31;
        String str = this.aiLiveSwitchStyle;
        int iHashCode7 = (((((((((iHashCode6 + (str == null ? 0 : str.hashCode())) * 31) + C786410Ut5.Z2(this.aiLiveSwitch)) * 31) + this.shootGuideType) * 31) + C786410Ut5.Z2(this.needRepairNLE)) * 31) + this.consumptionModel.hashCode()) * 31;
        AILivePhotoSwitchFromImageModel aILivePhotoSwitchFromImageModel = this.switchFromImageModel;
        int iHashCode8 = (((((iHashCode7 + (aILivePhotoSwitchFromImageModel == null ? 0 : aILivePhotoSwitchFromImageModel.hashCode())) * 31) + this.mobParam.hashCode()) * 31) + this.pageDataCache.hashCode()) * 31;
        RecommendMusicMobParams recommendMusicMobParams = this.musicMobParams;
        return ((iHashCode8 + (recommendMusicMobParams != null ? recommendMusicMobParams.hashCode() : 0)) * 31) + this.newPromptPageModel.hashCode();
    }

    public final String toString() {
        return "AILivePhotoModel(progressModel=" + this.progressModel + ", lastStatus=" + this.lastStatus + ", lastFailProgressModel=" + this.lastFailProgressModel + ", restoreData=" + this.restoreData + ", originCanvasVideoData=" + this.originCanvasVideoData + ", transitionModel=" + this.transitionModel + ", hasAutoShow=" + this.hasAutoShow + ", isFailureRecall=" + this.isFailureRecall + ", initialDraftSaveType=" + this.initialDraftSaveType + ", mobDraftStatus=" + this.mobDraftStatus + ", statusFromDraft=" + this.statusFromDraft + ", needAutoShow=" + this.needAutoShow + ", aiLiveSwitchStyle=" + this.aiLiveSwitchStyle + ", aiLiveSwitch=" + this.aiLiveSwitch + ", shootGuideType=" + this.shootGuideType + ", needRepairNLE=" + this.needRepairNLE + ", consumptionModel=" + this.consumptionModel + ", switchFromImageModel=" + this.switchFromImageModel + ", mobParam=" + this.mobParam + ", pageDataCache=" + this.pageDataCache + ", musicMobParams=" + this.musicMobParams + ", newPromptPageModel=" + this.newPromptPageModel + ')';
    }

    public final ProgressModel LIZIZ() {
        ProgressModel progressModel = this.progressModel;
        return progressModel == null ? new ProgressModel(UsageStatus.NOT_APPLY, null, null, null, "", "", 0, 0, null, "", 0L, null, -1L, 0) : progressModel;
    }

    public final String LIZLLL() {
        return this.mobParam.recallWay.getMobTag();
    }

    public final UsageStatus LJ() {
        UsageStatus usageStatus;
        ProgressModel progressModel = this.progressModel;
        return (progressModel == null || (usageStatus = progressModel.status) == null) ? UsageStatus.NOT_APPLY : usageStatus;
    }

    public final boolean LJIIL() {
        ProgressModel progressModel = this.lastStatus;
        if (progressModel == null) {
            return false;
        }
        if (progressModel.status != UsageStatus.SUCCESS_APPLY && progressModel.status != UsageStatus.SUCCESS_CANCEL) {
            return false;
        }
        this.progressModel = progressModel;
        this.lastStatus = null;
        return true;
    }

    public final String getTaskId() {
        ProgressModel progressModel = this.progressModel;
        if (progressModel != null) {
            return progressModel.taskId;
        }
        return null;
    }

    public final boolean LIZ() {
        return LJIIIZ() || LJII() || LJIIIIZZ();
    }

    public final PromptModel LIZJ() {
        PromptModel promptModel = LIZIZ().prompt;
        return promptModel == null ? new PromptModel("", "", PromptType.NONE, "", "", "", false) : promptModel;
    }

    public final boolean LJFF() {
        return LJ() == UsageStatus.SUCCESS_APPLY || LJ() == UsageStatus.SUCCESS_CANCEL;
    }

    public final boolean LJI() {
        return LJ() != UsageStatus.NOT_APPLY;
    }

    public final boolean LJII() {
        if (LJIIIZ()) {
            ProgressModel progressModel = this.lastStatus;
            if ((progressModel != null ? progressModel.status : null) == UsageStatus.SUCCESS_APPLY) {
                return true;
            }
        }
        return LJ() == UsageStatus.SUCCESS_APPLY;
    }

    public final boolean LJIIIIZZ() {
        return LJ() == UsageStatus.FAIL;
    }

    public final boolean LJIIIZ() {
        return LJ() == UsageStatus.LOADING;
    }

    public final boolean LJIIJ() {
        return LJ() == UsageStatus.LOADING;
    }

    public final boolean LJIIZILJ() {
        return LJ() == UsageStatus.SUCCESS_APPLY;
    }

    public final void LJIILIIL(AILivePhotoConsumptionModel aILivePhotoConsumptionModel) {
        this.consumptionModel = aILivePhotoConsumptionModel;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0009  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILJJIL(java.lang.String r3) {
        /*
            r2 = this;
            com.ss.android.ugc.aweme.creative.model.ailive.PromptPageMobParam r1 = r2.mobParam
            int r0 = r3.hashCode()
            switch(r0) {
                case -1184392185: goto L2f;
                case -1106640464: goto L24;
                case 95844769: goto L19;
                case 100344454: goto Le;
                default: goto L9;
            }
        L9:
            com.ss.android.ugc.aweme.creative.model.ailive.AILivePhotoRecallWay r0 = com.ss.android.ugc.aweme.creative.model.ailive.AILivePhotoRecallWay.NONE
        Lb:
            r1.recallWay = r0
            return
        Le:
            java.lang.String r0 = "inbox"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L9
            com.ss.android.ugc.aweme.creative.model.ailive.AILivePhotoRecallWay r0 = com.ss.android.ugc.aweme.creative.model.ailive.AILivePhotoRecallWay.INBOX
            goto Lb
        L19:
            java.lang.String r0 = "draft"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L9
            com.ss.android.ugc.aweme.creative.model.ailive.AILivePhotoRecallWay r0 = com.ss.android.ugc.aweme.creative.model.ailive.AILivePhotoRecallWay.DRAFT
            goto Lb
        L24:
            java.lang.String r0 = "out_app"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L9
            com.ss.android.ugc.aweme.creative.model.ailive.AILivePhotoRecallWay r0 = com.ss.android.ugc.aweme.creative.model.ailive.AILivePhotoRecallWay.OUT_APP_PUSH
            goto Lb
        L2f:
            java.lang.String r0 = "in_app"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L9
            com.ss.android.ugc.aweme.creative.model.ailive.AILivePhotoRecallWay r0 = com.ss.android.ugc.aweme.creative.model.ailive.AILivePhotoRecallWay.IN_APP_PUSH
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.creative.model.ailive.AILivePhotoModel.LJIILJJIL(java.lang.String):void");
    }

    public final void LJIILL(Function1<? super PromptPageMobParam, Unit> function1) {
        function1.invoke(this.mobParam);
    }

    public final void LJIILLIIL(Function1<? super PageDataCache, Unit> function1) {
        function1.invoke(this.pageDataCache);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ProgressModel progressModel = this.progressModel;
        if (progressModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            progressModel.writeToParcel(parcel, i);
        }
        ProgressModel progressModel2 = this.lastStatus;
        if (progressModel2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            progressModel2.writeToParcel(parcel, i);
        }
        ProgressModel progressModel3 = this.lastFailProgressModel;
        if (progressModel3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            progressModel3.writeToParcel(parcel, i);
        }
        this.restoreData.writeToParcel(parcel, i);
        parcel.writeSerializable(this.originCanvasVideoData);
        TransitionModel transitionModel = this.transitionModel;
        if (transitionModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            transitionModel.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.hasAutoShow ? 1 : 0);
        parcel.writeInt(this.isFailureRecall ? 1 : 0);
        Integer num = this.initialDraftSaveType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        this.mobDraftStatus.writeToParcel(parcel, i);
        this.statusFromDraft.writeToParcel(parcel, i);
        parcel.writeInt(this.needAutoShow ? 1 : 0);
        parcel.writeString(this.aiLiveSwitchStyle);
        parcel.writeInt(this.aiLiveSwitch ? 1 : 0);
        parcel.writeInt(this.shootGuideType);
        parcel.writeInt(this.needRepairNLE ? 1 : 0);
        this.consumptionModel.writeToParcel(parcel, i);
        AILivePhotoSwitchFromImageModel aILivePhotoSwitchFromImageModel = this.switchFromImageModel;
        if (aILivePhotoSwitchFromImageModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aILivePhotoSwitchFromImageModel.writeToParcel(parcel, i);
        }
        this.mobParam.writeToParcel(parcel, i);
        this.pageDataCache.writeToParcel(parcel, i);
        RecommendMusicMobParams recommendMusicMobParams = this.musicMobParams;
        if (recommendMusicMobParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(recommendMusicMobParams.startTime);
        }
        this.newPromptPageModel.writeToParcel(parcel, i);
    }

    public AILivePhotoModel(ProgressModel progressModel, ProgressModel progressModel2, ProgressModel progressModel3, AIAliveRestoreData aIAliveRestoreData, CanvasVideoData canvasVideoData, TransitionModel transitionModel, boolean z, boolean z2, Integer num, UsageStatus usageStatus, UsageStatus usageStatus2, boolean z3, String str, boolean z4, int i, boolean z5, AILivePhotoConsumptionModel aILivePhotoConsumptionModel, AILivePhotoSwitchFromImageModel aILivePhotoSwitchFromImageModel, PromptPageMobParam promptPageMobParam, PageDataCache pageDataCache, RecommendMusicMobParams recommendMusicMobParams, NewPromptPageModel newPromptPageModel) {
        this.progressModel = progressModel;
        this.lastStatus = progressModel2;
        this.lastFailProgressModel = progressModel3;
        this.restoreData = aIAliveRestoreData;
        this.originCanvasVideoData = canvasVideoData;
        this.transitionModel = transitionModel;
        this.hasAutoShow = z;
        this.isFailureRecall = z2;
        this.initialDraftSaveType = num;
        this.mobDraftStatus = usageStatus;
        this.statusFromDraft = usageStatus2;
        this.needAutoShow = z3;
        this.aiLiveSwitchStyle = str;
        this.aiLiveSwitch = z4;
        this.shootGuideType = i;
        this.needRepairNLE = z5;
        this.consumptionModel = aILivePhotoConsumptionModel;
        this.switchFromImageModel = aILivePhotoSwitchFromImageModel;
        this.mobParam = promptPageMobParam;
        this.pageDataCache = pageDataCache;
        this.musicMobParams = recommendMusicMobParams;
        this.newPromptPageModel = newPromptPageModel;
    }
}
