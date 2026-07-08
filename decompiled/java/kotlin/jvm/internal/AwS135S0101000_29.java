package kotlin.jvm.internal;

import X.AbstractC19466111Dv;
import X.C004I;
import X.C09AY;
import X.C0FTJ;
import X.C11A3;
import X.C11A9;
import X.C1265190j1p;
import X.C1265420j2C;
import X.C12D5;
import X.C1644450stX;
import X.C1761680vwc;
import X.C1782830wUj;
import X.C19612011oE;
import X.C19649611uI;
import X.C19656711vR;
import X.C2272921Dxq;
import X.C375830EoP;
import X.C993750by1;
import X.InterfaceC1452170ntP;
import X.InterfaceC1891350zJl;
import Y.ARunnableS0S0100300_29;
import android.graphics.Rect;
import android.view.View;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.ss.android.ugc.aweme.creative.model.edit.ImageSynthesisResult;
import com.ss.android.ugc.aweme.ftc.countdown.FTCCountdownState;
import com.ss.android.ugc.aweme.model.api.data.ProfileNaviDataModel;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.countdown.CountdownState;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.shortvideo.editcut.EditAdjustClipsBottomViewState;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.view.ProfileNaviActivity;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviSwitcherViewModel;
import com.ss.android.ugc.profile.business.live.notificationlive.adapter.PushSettingFollowListAdapter;
import com.ss.android.ugc.profile.business.live.notificationpost.PostNotificationSettingsAdapter;
import com.ss.android.ugc.profile.business.live.notificationpost.PostNotificationStatus;
import com.tts.oecverify.BdTuring;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes30.dex */
public class AwS135S0101000_29 extends C09AY implements Function1 {
    public final int $t;
    public int i1;
    public Object l0;

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
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS135S0101000_29 awS135S0101000_29, Object obj) {
        View view = (View) obj;
        view.getHitRect((Rect) awS135S0101000_29.l0);
        return new Pair(Integer.valueOf(Math.abs(((Rect) awS135S0101000_29.l0).centerX() - awS135S0101000_29.i1)), view);
    }

    public static final Object invoke$1(AwS135S0101000_29 awS135S0101000_29, Object obj) {
        FTCCountdownState fTCCountdownState = (FTCCountdownState) obj;
        ((C11A3) awS135S0101000_29.l0).LLLILZ(awS135S0101000_29.i1, fTCCountdownState.getStartTime(), fTCCountdownState.getMaxDuration());
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS135S0101000_29 awS135S0101000_29, Object obj) {
        return C19656711vR.LIZ((C19656711vR) obj, awS135S0101000_29.i1, false, false, Boolean.FALSE, ((C19612011oE) awS135S0101000_29.l0).LJJIIJZLJL().getStartTime(), ((C19612011oE) awS135S0101000_29.l0).LJJIIJZLJL().getEndTime(), false, 0, false, 966);
    }

    public static final Object invoke$11(AwS135S0101000_29 awS135S0101000_29, Object obj) {
        return C19656711vR.LIZ((C19656711vR) obj, awS135S0101000_29.i1, false, false, Boolean.FALSE, ((C0FTJ) awS135S0101000_29.l0).LJJIIJZLJL().getStartTime(), ((C0FTJ) awS135S0101000_29.l0).LJJIIJZLJL().getEndTime(), false, 0, false, 966);
    }

    public static final Object invoke$12(AwS135S0101000_29 awS135S0101000_29, Object obj) {
        int i;
        int iIntValue = ((Number) obj).intValue();
        int i2 = awS135S0101000_29.i1;
        PushSettingFollowListAdapter pushSettingFollowListAdapter = (PushSettingFollowListAdapter) awS135S0101000_29.l0;
        boolean z = false;
        InterfaceC1891350zJl interfaceC1891350zJlLLLIIIIL = pushSettingFollowListAdapter.LLLIIIIL(iIntValue, false);
        if (interfaceC1891350zJlLLLIIIIL instanceof C993750by1) {
            i = ((C993750by1) interfaceC1891350zJlLLLIIIIL).LL;
        } else if (interfaceC1891350zJlLLLIIIIL instanceof C1265420j2C) {
            i = ((C1265420j2C) interfaceC1891350zJlLLLIIIIL).LL;
        } else if (interfaceC1891350zJlLLLIIIIL instanceof C1782830wUj) {
            i = ((C1782830wUj) interfaceC1891350zJlLLLIIIIL).LL;
        } else {
            i = 0;
        }
        if (i2 == i) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$13(AwS135S0101000_29 awS135S0101000_29, Object obj) {
        ((ProfileNaviSwitcherViewModel) ((ProfileNaviActivity) awS135S0101000_29.l0).LLIZLLLIL.getValue()).mR2((ProfileNaviDataModel) obj);
        ((ProfileNaviActivity) awS135S0101000_29.l0).LLLLZLLIL(awS135S0101000_29.i1, null);
        return Unit.LIZ;
    }

    public static final Object invoke$14(AwS135S0101000_29 awS135S0101000_29, Object obj) {
        int i;
        int iIntValue = ((Number) obj).intValue();
        int i2 = awS135S0101000_29.i1;
        PostNotificationSettingsAdapter postNotificationSettingsAdapter = (PostNotificationSettingsAdapter) awS135S0101000_29.l0;
        boolean z = false;
        InterfaceC1891350zJl interfaceC1891350zJlLLLIIIIL = postNotificationSettingsAdapter.LLLIIIIL(iIntValue, false);
        if (interfaceC1891350zJlLLLIIIIL instanceof C993750by1) {
            i = ((C993750by1) interfaceC1891350zJlLLLIIIIL).LL;
        } else if (interfaceC1891350zJlLLLIIIIL instanceof C1265420j2C) {
            i = ((C1265420j2C) interfaceC1891350zJlLLLIIIIL).LL;
        } else if (interfaceC1891350zJlLLLIIIIL instanceof C1782830wUj) {
            i = ((C1782830wUj) interfaceC1891350zJlLLLIIIIL).LL;
        } else {
            i = 0;
        }
        if (i2 == i) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$2(AwS135S0101000_29 awS135S0101000_29, Object obj) {
        return C19649611uI.LIZ((C19649611uI) obj, null, false, false, new C375830EoP(new Pair(Integer.valueOf(awS135S0101000_29.i1), (ImageSynthesisResult) awS135S0101000_29.l0)), 47);
    }

    public static final Object invoke$3(AwS135S0101000_29 awS135S0101000_29, Object obj) {
        CountdownState countdownState = (CountdownState) obj;
        C11A9 c11a9 = (C11A9) awS135S0101000_29.l0;
        long j = awS135S0101000_29.i1;
        long startTime = countdownState.getStartTime();
        long maxDuration = countdownState.getMaxDuration();
        SafeHandler safeHandler = c11a9.LLJJIJI;
        if (safeHandler == null) {
            safeHandler = null;
        }
        safeHandler.post(new ARunnableS0S0100300_29(c11a9, j, startTime, maxDuration, 1));
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS135S0101000_29 awS135S0101000_29, Object obj) {
        EditAdjustClipsBottomViewState editAdjustClipsBottomViewState = (EditAdjustClipsBottomViewState) obj;
        return editAdjustClipsBottomViewState.copy(editAdjustClipsBottomViewState.currentEditIndex, editAdjustClipsBottomViewState.currentEditOriginIndex, editAdjustClipsBottomViewState.currentTabIndex, editAdjustClipsBottomViewState.stickPointStatus, editAdjustClipsBottomViewState.isMusicSyncMode, editAdjustClipsBottomViewState.scale, editAdjustClipsBottomViewState.selectTime, editAdjustClipsBottomViewState.editState, editAdjustClipsBottomViewState.focusEditMode, new C1644450stX<>(new Pair(Integer.valueOf(awS135S0101000_29.i1), (VideoSegment) awS135S0101000_29.l0)), editAdjustClipsBottomViewState.updateVideoEvent, editAdjustClipsBottomViewState.restoreEditEvent, editAdjustClipsBottomViewState.addVideosEvent, editAdjustClipsBottomViewState.modeChangeEvent, editAdjustClipsBottomViewState.seekDoneEvent, editAdjustClipsBottomViewState.restoreMusicSyncEvent);
    }

    public static final Object invoke$5(AwS135S0101000_29 awS135S0101000_29, Object obj) {
        EditAdjustClipsBottomViewState editAdjustClipsBottomViewState = (EditAdjustClipsBottomViewState) obj;
        return editAdjustClipsBottomViewState.copy(editAdjustClipsBottomViewState.currentEditIndex, editAdjustClipsBottomViewState.currentEditOriginIndex, editAdjustClipsBottomViewState.currentTabIndex, editAdjustClipsBottomViewState.stickPointStatus, editAdjustClipsBottomViewState.isMusicSyncMode, editAdjustClipsBottomViewState.scale, editAdjustClipsBottomViewState.selectTime, editAdjustClipsBottomViewState.editState, editAdjustClipsBottomViewState.focusEditMode, editAdjustClipsBottomViewState.deleteVideoEvent, new C1644450stX<>(new Pair(Integer.valueOf(awS135S0101000_29.i1), (VideoSegment) awS135S0101000_29.l0)), editAdjustClipsBottomViewState.restoreEditEvent, editAdjustClipsBottomViewState.addVideosEvent, editAdjustClipsBottomViewState.modeChangeEvent, editAdjustClipsBottomViewState.seekDoneEvent, editAdjustClipsBottomViewState.restoreMusicSyncEvent);
    }

    public static final Object invoke$6(AwS135S0101000_29 awS135S0101000_29, Object obj) {
        return C12D5.LIZ((C12D5) obj, false, awS135S0101000_29.i1, ((InterfaceC1452170ntP) awS135S0101000_29.l0).getDuration(), false, false, 25);
    }

    public static final Object invoke$7(AwS135S0101000_29 awS135S0101000_29, Object obj) {
        ListMiddleware<PostNotificationStatus, InterfaceC1891350zJl, C1265190j1p> listMiddleware = ((PostNotificationSettingsAdapter.FriendOnlySwitchHolder) awS135S0101000_29.l0).V5().LLJIJIL;
        int i = awS135S0101000_29.i1;
        int size = ((PostNotificationStatus) obj).getListState().getList().size() - awS135S0101000_29.i1;
        listMiddleware.getClass();
        listMiddleware.LIZLLL().gR2(new AwS395S0200000_29(listMiddleware, new AwS36S0102000_29(size, i, (int) listMiddleware, (ListMiddleware<C004I, Object, C1761680vwc>) 2), 85));
        ((PostNotificationSettingsAdapter.FriendOnlySwitchHolder) awS135S0101000_29.l0).V5().LLJIJIL.refresh();
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS135S0101000_29 awS135S0101000_29, Object obj) {
        boolean z;
        float fFloatValue = ((Number) obj).floatValue();
        C2272921Dxq c2272921Dxq = (C2272921Dxq) awS135S0101000_29.l0;
        if (Math.abs(fFloatValue) > awS135S0101000_29.i1) {
            z = true;
        } else {
            z = false;
        }
        c2272921Dxq.LLJIJIL = z;
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS135S0101000_29 awS135S0101000_29, Object obj) {
        int iIntValue = awS135S0101000_29.i1 - ((Number) obj).intValue();
        AbstractC19466111Dv abstractC19466111Dv = (AbstractC19466111Dv) awS135S0101000_29.l0;
        abstractC19466111Dv.LLILLL = Math.max(abstractC19466111Dv.LLILLL, iIntValue);
        AbstractC19466111Dv abstractC19466111Dv2 = (AbstractC19466111Dv) awS135S0101000_29.l0;
        if (abstractC19466111Dv2.LLILLL > 0 && !abstractC19466111Dv2.LL) {
            abstractC19466111Dv2.LL = true;
            abstractC19466111Dv2.LIZ();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS135S0101000_29(int i, InterfaceC1452170ntP interfaceC1452170ntP, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = interfaceC1452170ntP;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS135S0101000_29(int i, AbstractC19466111Dv abstractC19466111Dv, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = abstractC19466111Dv;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS135S0101000_29(int i, Rect rect, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = rect;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS135S0101000_29(int i, ImageSynthesisResult imageSynthesisResult, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = imageSynthesisResult;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS135S0101000_29(int i, VideoSegment videoSegment, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = videoSegment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS135S0101000_29(int i, PushSettingFollowListAdapter pushSettingFollowListAdapter, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = pushSettingFollowListAdapter;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS135S0101000_29(int i, PostNotificationSettingsAdapter postNotificationSettingsAdapter, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = postNotificationSettingsAdapter;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS135S0101000_29(C0FTJ c0ftj, C0FTJ<? extends StickerModel> c0ftj2, int i) {
        super(1);
        this.$t = i;
        this.l0 = c0ftj;
        this.i1 = c0ftj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS135S0101000_29(C11A3 c11a3, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c11a3;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS135S0101000_29(C11A9 c11a9, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c11a9;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS135S0101000_29(C19612011oE c19612011oE, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c19612011oE;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS135S0101000_29(C2272921Dxq c2272921Dxq, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c2272921Dxq;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS135S0101000_29(ProfileNaviActivity profileNaviActivity, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = profileNaviActivity;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS135S0101000_29(PostNotificationSettingsAdapter.FriendOnlySwitchHolder friendOnlySwitchHolder, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = friendOnlySwitchHolder;
        this.i1 = i;
    }
}
