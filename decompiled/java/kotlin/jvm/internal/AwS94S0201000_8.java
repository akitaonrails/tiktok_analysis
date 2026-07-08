package kotlin.jvm.internal;

import X.C09AY;
import X.C0L1B;
import X.C0L92;
import X.C0LAB;
import X.C0LRE;
import X.C0MV0;
import X.C0WZX;
import X.C1389890mGx;
import X.C1428470nHB;
import X.C19EG;
import X.C1AF0;
import X.C201955140j;
import X.C20622515mp;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2354709Kn;
import X.C522360KeA;
import X.C523870Kgb;
import X.C526910KlV;
import X.C549450Lgl;
import X.C551290Ljj;
import X.C553680Lna;
import X.C554100LoG;
import X.C555030Lpl;
import X.C555080Lpq;
import X.C562830M5p;
import X.C786410Ut5;
import X.EnumC562840M5q;
import X.InterfaceC549370Lgd;
import android.content.Intent;
import android.os.Parcelable;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCCameoDisplayInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.draft.model.DuetExtraInfo;
import com.ss.android.ugc.aweme.portrait.model.AIPortraitContextModel;
import com.ss.android.ugc.aweme.portrait.model.GenerateFailedInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.PreviewNextBtnState;
import com.ss.android.ugc.tools.view.uikit.factory.CreativeDialogWrapper;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public class AwS94S0201000_8 extends C09AY implements Function1 {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS94S0201000_8 awS94S0201000_8, Object obj) {
        MentionDataItem mentionDataItem = (MentionDataItem) obj;
        MentionDataItem mentionDataItem2 = (MentionDataItem) awS94S0201000_8.l0;
        String str = mentionDataItem2.uid;
        if (str == null) {
            str = "";
        }
        AIGCCameoDisplayInfo aIGCCameoDisplayInfo = new AIGCCameoDisplayInfo(str, C549450Lgl.LIZJ(mentionDataItem2), C0LRE.AFTER_MENTION, awS94S0201000_8.i2 + 1);
        InterfaceC549370Lgd interfaceC549370LgdH4 = ((C555030Lpl) awS94S0201000_8.l1).H4();
        if (interfaceC549370LgdH4 != null) {
            interfaceC549370LgdH4.cE(aIGCCameoDisplayInfo, Boolean.FALSE);
        }
        ((C555030Lpl) awS94S0201000_8.l1).T4(mentionDataItem, awS94S0201000_8.i2);
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS94S0201000_8 awS94S0201000_8, Object obj) {
        MentionDataItem mentionDataItem = (MentionDataItem) obj;
        MentionDataItem mentionDataItem2 = (MentionDataItem) awS94S0201000_8.l0;
        String str = mentionDataItem2.uid;
        if (str == null) {
            str = "";
        }
        AIGCCameoDisplayInfo aIGCCameoDisplayInfo = new AIGCCameoDisplayInfo(str, C549450Lgl.LIZJ(mentionDataItem2), C0LRE.AFTER_MENTION, awS94S0201000_8.i2 + 1);
        InterfaceC549370Lgd interfaceC549370LgdH4 = ((C555030Lpl) awS94S0201000_8.l1).H4();
        if (interfaceC549370LgdH4 != null) {
            interfaceC549370LgdH4.cE(aIGCCameoDisplayInfo, Boolean.FALSE);
        }
        ((C555030Lpl) awS94S0201000_8.l1).T4(mentionDataItem, awS94S0201000_8.i2);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS94S0201000_8 awS94S0201000_8, Object obj) {
        List<MentionDataItem> list;
        String str;
        C19EG activity;
        MentionDataItem mentionDataItem = (MentionDataItem) obj;
        MentionDataItem mentionDataItem2 = (MentionDataItem) awS94S0201000_8.l0;
        String str2 = mentionDataItem2.uid;
        if (str2 == null) {
            str2 = "";
        }
        ((C554100LoG) awS94S0201000_8.l1).x5().cE(new AIGCCameoDisplayInfo(str2, C549450Lgl.LIZJ(mentionDataItem2), C0LRE.UPON_INPUT, awS94S0201000_8.i2 + 1), Boolean.FALSE);
        ((C554100LoG) awS94S0201000_8.l1).LLJJJJJIL.setValue(new C551290Ljj((MentionDataItem) awS94S0201000_8.l0, false, Integer.valueOf(awS94S0201000_8.i2), 0, 26));
        C554100LoG c554100LoG = (C554100LoG) awS94S0201000_8.l1;
        if (c554100LoG.LLJLIL || (((list = c554100LoG.LLJL) != null && list.contains((MentionDataItem) awS94S0201000_8.l0)) || ((MentionDataItem) awS94S0201000_8.l0).cameoId == null)) {
            ((C554100LoG) awS94S0201000_8.l1).O4(mentionDataItem, Integer.valueOf(awS94S0201000_8.i2));
        } else {
            C555080Lpq textConfig$tools_ai_uikit_df_release = ((C554100LoG) awS94S0201000_8.l1).LLJILLL.getTextConfig$tools_ai_uikit_df_release();
            if (textConfig$tools_ai_uikit_df_release != null && (str = textConfig$tools_ai_uikit_df_release.LIZ) != null && (activity = ((C554100LoG) awS94S0201000_8.l1).getActivity()) != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(activity);
                c1389890mGx.LJIIJ(str);
                c1389890mGx.LJIIJJI();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS94S0201000_8 awS94S0201000_8, Object obj) throws Throwable {
        ArrayList<? extends Parcelable> arrayList = (ArrayList) obj;
        C522360KeA.LIZ(C523870Kgb.LIZIZ((Intent) awS94S0201000_8.l0, C0L92.SUCCESS, ""));
        C0L1B c0l1b = (C0L1B) awS94S0201000_8.l1;
        CreativeDialogWrapper creativeDialogWrapper = c0l1b.LLILLJJLI;
        if (creativeDialogWrapper != null) {
            creativeDialogWrapper.dismiss();
        }
        c0l1b.LLILLJJLI = null;
        ((Intent) awS94S0201000_8.l0).putParcelableArrayListExtra("photo_mode_add_media_data", arrayList);
        C2204961BRm.LLJJIJIL(awS94S0201000_8.i2, (Intent) awS94S0201000_8.l0, ((C0L1B) awS94S0201000_8.l1).LL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkj9dPSVF/XyG/+XDBbwJ/OleZzFPj3STx/CcnQISONy5E6PdvOUTORCnivW/nk/2UA==", null));
        ((C0L1B) awS94S0201000_8.l1).LL.finish();
        C20622515mp.LIZ(((C0L1B) awS94S0201000_8.l1).LL, R.anim.a8);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$4(AwS94S0201000_8 awS94S0201000_8, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i = awS94S0201000_8.i2;
        C562830M5p c562830M5p = (C562830M5p) awS94S0201000_8.l0;
        if (i == c562830M5p.LLJJJIL) {
            if (zBooleanValue) {
                c562830M5p.LLJJJ = EnumC562840M5q.LL;
                ViewGroup viewGroup = c562830M5p.LLJJI;
                if (viewGroup != null) {
                    C786410Ut5.LJLZ(8, viewGroup);
                }
                ViewGroup viewGroup2 = ((C562830M5p) awS94S0201000_8.l0).LLJILJIL;
                if (viewGroup2 != null) {
                    C786410Ut5.LJLZ(8, viewGroup2);
                }
                ViewGroup viewGroup3 = ((C562830M5p) awS94S0201000_8.l0).LLJJIJIIJIL;
                if (viewGroup3 != null) {
                    C786410Ut5.LJLZ(0, viewGroup3);
                }
            } else {
                ViewGroup viewGroup4 = c562830M5p.LLJJIJIIJIL;
                if (viewGroup4 != null) {
                    C786410Ut5.LJLZ(8, viewGroup4);
                }
                C562830M5p c562830M5p2 = (C562830M5p) awS94S0201000_8.l0;
                c562830M5p2.LLJJJ = EnumC562840M5q.LLILLL;
                c562830M5p2.S5((C553680Lna) awS94S0201000_8.l1);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$5(kotlin.jvm.internal.AwS94S0201000_8 r5, java.lang.Object r6) {
        /*
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r2 = r6.booleanValue()
            java.lang.Object r0 = r5.l0
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.PreviewNextBtnState r0 = (com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.PreviewNextBtnState) r0
            boolean r0 = r0.isClickable()
            r4 = r0 ^ 1
            java.lang.Object r3 = r5.l1
            X.0KlV r3 = (X.C526910KlV) r3
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChoosePhotoPreviewPageConfig r1 = r3.LLLLIILL
            boolean r0 = r1.nextRuleAdjustment
            if (r0 == 0) goto L85
            int r0 = r5.i2
            if (r0 != 0) goto L85
            boolean r0 = r1.isAutoCutAnchorMode
            if (r0 != 0) goto L85
            boolean r0 = r1.isAIGCAvatar
            if (r0 != 0) goto L85
        L26:
            r3.LLLZI(r2)
            java.lang.Object r3 = r5.l1
            X.0KlV r3 = (X.C526910KlV) r3
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChoosePhotoPreviewPageConfig r1 = r3.LLLLIILL
            boolean r0 = r1.isFromCutSame
            if (r0 != 0) goto L65
            boolean r0 = r1.isSoundSync
            if (r0 != 0) goto L65
            boolean r0 = r1.isUgcTemplate
            if (r0 != 0) goto L65
            X.01GW r0 = r3.LLLLZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L65
            java.lang.Object r0 = r5.l1
            X.0KlV r0 = (X.C526910KlV) r0
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChoosePhotoPreviewPageConfig r1 = r0.LLLLIILL
            boolean r0 = r1.isAutoCutAnchorMode
            if (r0 != 0) goto L65
            boolean r0 = r1.LIZJ()
            if (r0 != 0) goto L65
            java.lang.Object r0 = r5.l1
            X.0KlV r0 = (X.C526910KlV) r0
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChoosePhotoPreviewPageConfig r0 = r0.LLLLIILL
            int r1 = r0.chooseSceneMode
            r0 = 64
            if (r1 != r0) goto L82
        L65:
            java.lang.Object r0 = r5.l1
            X.0KlV r0 = (X.C526910KlV) r0
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChoosePhotoPreviewPageConfig r0 = r0.LLLLIILL
            int r0 = r0.chooseSceneMode
            boolean r0 = X.C529980KqS.LIZJ(r0)
            if (r0 != 0) goto L82
            java.lang.Object r0 = r5.l1
            X.0KlV r0 = (X.C526910KlV) r0
            android.widget.TextView r1 = r0.LLLLLJLJLL()
            if (r1 == 0) goto L82
            r0 = r2 ^ 1
            r1.setEnabled(r0)
        L82:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L85:
            r2 = r4
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS94S0201000_8.invoke$5(kotlin.jvm.internal.AwS94S0201000_8, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$6(AwS94S0201000_8 awS94S0201000_8, Object obj) {
        C0LAB c0lab = (C0LAB) obj;
        c0lab.LIZ(((CreativeModel) awS94S0201000_8.l0).draftInfoModel.isDraft ? 1 : 0, "is_draft");
        c0lab.LIZ(awS94S0201000_8.i2, "result");
        GenerateFailedInfo generateFailedInfo = ((AIPortraitContextModel) awS94S0201000_8.l1).generatingModel.failedInfo;
        if (generateFailedInfo != null) {
            c0lab.LIZ(generateFailedInfo.archResultCode, "result_code");
        }
        c0lab.LIZIZ(System.currentTimeMillis() - ((AIPortraitContextModel) awS94S0201000_8.l1).generatingModel.startTime, "cost_time");
        c0lab.LJ("action_type", ((AIPortraitContextModel) awS94S0201000_8.l1).mobParams.actionType);
        c0lab.LJ("creation_id", ((CreativeModel) awS94S0201000_8.l0).creativeInfo.getCreationId());
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS94S0201000_8 awS94S0201000_8, Object obj) {
        DuetExtraInfo duetExtraInfoCopy;
        AwemeDraft awemeDraft = (AwemeDraft) obj;
        if (((VideoPublishEditModel) awS94S0201000_8.l0).isDuet()) {
            DuetExtraInfo draftDuetExtraInfo = ((VideoPublishEditModel) awS94S0201000_8.l0).getDraftDuetExtraInfo();
            if (draftDuetExtraInfo != null) {
                duetExtraInfoCopy = draftDuetExtraInfo.copy(draftDuetExtraInfo.duetVideoPath, draftDuetExtraInfo.duetAudioPath, draftDuetExtraInfo.duetVideoWidth, draftDuetExtraInfo.duetVideoHeight, draftDuetExtraInfo.duetLayoutMode, draftDuetExtraInfo.duetLayoutDirection);
            } else {
                duetExtraInfoCopy = null;
            }
            awemeDraft.LJJJJIZL.duetExtraInfo = duetExtraInfoCopy;
        }
        if (C1428470nHB.LJJJJZI((VideoPublishEditModel) awS94S0201000_8.l0) && !C2354709Kn.LIZIZ(((VideoPublishEditModel) awS94S0201000_8.l0).getVideoCoverPath())) {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) awS94S0201000_8.l0;
            videoPublishEditModel.setVideoCoverPath(videoPublishEditModel.creativeModel.changeAvatarModel.coverPath);
            awemeDraft.LJJJJIZL.videoCoverPath = ((VideoPublishEditModel) awS94S0201000_8.l0).getVideoCoverPath();
        }
        awemeDraft.LJJJJIZL.publishStage = 50;
        awemeDraft.LIZLLL = "CHECK_POINT";
        C0MV0 c0mv0 = (C0MV0) awS94S0201000_8.l1;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("saveCheckPoint: wrote CHECK_POINT copy, creationId=");
        sbLIZ.append(awemeDraft.LIZ());
        sbLIZ.append(", draftPrimaryKey=");
        sbLIZ.append(awemeDraft.LIZJ());
        sbLIZ.append(", scene=");
        C0MV0 c0mv02 = (C0MV0) awS94S0201000_8.l1;
        int i = awS94S0201000_8.i2;
        c0mv02.getClass();
        sbLIZ.append(C0MV0.LJIJJ(i));
        C2188811AlT.LIZIZ(sbLIZ);
        c0mv0.getClass();
        if (awemeDraft.LJ == null) {
            awemeDraft.LJII = null;
        }
        if (C1428470nHB.LJJZZI((VideoPublishEditModel) awS94S0201000_8.l0) && !awemeDraft.LJIIL()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("photo mode image checkpoint save fail ");
            sbLIZ2.append(awemeDraft.LJJJJIZL.imageAlbumData);
            sbLIZ2.append(' ');
            sbLIZ2.append(awemeDraft.LJJJJIZL.creationMode);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            C201955140j.LJ(strLIZIZ);
            C1AF0.LIZJ(strLIZIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS94S0201000_8 awS94S0201000_8, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C0MV0 c0mv0 = (C0MV0) awS94S0201000_8.l0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("saveDraftOnV3PushShow: record saved preserveSegments=");
        sbLIZ.append(zBooleanValue);
        sbLIZ.append(", scene=");
        C0MV0 c0mv02 = (C0MV0) awS94S0201000_8.l0;
        int i = awS94S0201000_8.i2;
        c0mv02.getClass();
        sbLIZ.append(C0MV0.LJIJJ(i));
        C2188811AlT.LIZIZ(sbLIZ);
        c0mv0.getClass();
        ((Function0) awS94S0201000_8.l1).invoke();
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS94S0201000_8(int i, C553680Lna c553680Lna, C562830M5p c562830M5p, int i2) {
        super(1);
        this.$t = i2;
        this.i2 = i;
        this.l0 = c562830M5p;
        this.l1 = c553680Lna;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS94S0201000_8(C0MV0 c0mv0, C0MV0 c0mv02, int i, Function0<Unit> function0) {
        super(1);
        this.$t = function0;
        this.l0 = c0mv0;
        this.i2 = c0mv02;
        this.l1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS94S0201000_8(Intent intent, C0L1B c0l1b, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = intent;
        this.l1 = c0l1b;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS94S0201000_8(CreativeModel creativeModel, int i, AIPortraitContextModel aIPortraitContextModel, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = creativeModel;
        this.i2 = i;
        this.l1 = aIPortraitContextModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS94S0201000_8(MentionDataItem mentionDataItem, int i, C554100LoG c554100LoG, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = mentionDataItem;
        this.i2 = i;
        this.l1 = c554100LoG;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS94S0201000_8(MentionDataItem mentionDataItem, int i, C555030Lpl c555030Lpl, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = mentionDataItem;
        this.i2 = i;
        this.l1 = c555030Lpl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS94S0201000_8(VideoPublishEditModel videoPublishEditModel, C0MV0 c0mv0, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = videoPublishEditModel;
        this.l1 = c0mv0;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS94S0201000_8(PreviewNextBtnState previewNextBtnState, C526910KlV c526910KlV, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = previewNextBtnState;
        this.l1 = c526910KlV;
        this.i2 = i;
    }
}
