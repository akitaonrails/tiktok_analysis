package kotlin.jvm.internal;

import X.AbstractC1439430nYr;
import X.AbstractC1439440nYs;
import X.C09AY;
import X.C13LP;
import X.C13LQ;
import X.C1440005kM;
import X.C2095008Iq;
import X.InterfaceC1631620sYq;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.tools.sticker.core.liveshare.LiveShareStickerModel;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public class AwS486S0200000_22 extends C09AY implements InterfaceC1631620sYq {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3);
            case 1:
                return invoke$1(this, obj, obj2, obj3);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS486S0200000_22(AbstractC1439430nYr abstractC1439430nYr, Function0 function0, int i) {
        super(3);
        this.$t = i;
        this.l0 = function0;
        this.l1 = abstractC1439430nYr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS486S0200000_22(AbstractC1439440nYs abstractC1439440nYs, AbstractC1439440nYs abstractC1439440nYs2, Function0<Unit> function0) {
        super(3);
        this.$t = function0;
        this.l0 = abstractC1439440nYs;
        this.l1 = abstractC1439440nYs2;
    }

    public static final Object invoke$0(AwS486S0200000_22 awS486S0200000_22, Object obj, Object obj2, Object obj3) {
        long jLongValue;
        Long lLJIILIIL;
        ((Boolean) obj).booleanValue();
        ((AbstractC1439440nYs) awS486S0200000_22.l0).m3();
        Function0 function0 = (Function0) awS486S0200000_22.l1;
        if (function0 != null) {
            function0.invoke();
        }
        if (((AbstractC1439440nYs) awS486S0200000_22.l0).o2().creativeModel.changeAvatarModel.isFromChangeAvatar && !((AbstractC1439440nYs) awS486S0200000_22.l0).o2().creativeModel.changeAvatarModel.isFromSocialAvatar && (((AbstractC1439440nYs) awS486S0200000_22.l0).o2().creativeModel.changeAvatarModel.isSingletonRecover || !((AbstractC1439440nYs) awS486S0200000_22.l0).o2().mIsFromDraft)) {
            ((AbstractC1439440nYs) awS486S0200000_22.l0).i3();
        } else if (C13LQ.LJJIJIIJI(((AbstractC1439440nYs) awS486S0200000_22.l0).o2().mShootWay, new String[]{"story_my_music_journey", "story_my_music_mysongs"}) >= 0) {
            ((AbstractC1439440nYs) awS486S0200000_22.l0).i3();
        } else {
            Integer landingBack = ((AbstractC1439440nYs) awS486S0200000_22.l0).o2().creativeModel.musicShareStoryData.getLandingBack();
            if (landingBack != null && landingBack.intValue() == 1) {
                ((AbstractC1439440nYs) awS486S0200000_22.l0).i3();
            } else if (((AbstractC1439440nYs) awS486S0200000_22.l0).o2().creativeModel.stickerModel.liveShareStickerModels.size() > 0) {
                ((AbstractC1439440nYs) awS486S0200000_22.l0).i3();
                LiveShareStickerModel liveShareStickerModel = (LiveShareStickerModel) C13LP.LJJJLL(((AbstractC1439440nYs) awS486S0200000_22.l0).o2().creativeModel.stickerModel.liveShareStickerModels);
                if (liveShareStickerModel != null) {
                    ILiveOuterService iLiveOuterService = (ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class);
                    String roomId = liveShareStickerModel.getRoomId();
                    if (roomId != null && (lLJIILIIL = C2095008Iq.LJIILIIL(roomId)) != null) {
                        jLongValue = lLJIILIIL.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    iLiveOuterService.c4(jLongValue, false, false);
                }
            } else if (u4.LJIILIIL(((AbstractC1439440nYs) awS486S0200000_22.l0).o2())) {
                ((AbstractC1439440nYs) awS486S0200000_22.l0).i3();
            } else if (u4.LJIILJJIL(((AbstractC1439440nYs) awS486S0200000_22.l0).o2()) && !((AbstractC1439440nYs) awS486S0200000_22.l0).o2().mIsFromDraft) {
                ((AbstractC1439440nYs) awS486S0200000_22.l0).i3();
                C1440005kM.LIZ(new IEvent() { // from class: X.0HSH
                    @Override // com.ss.android.ugc.governance.eventbus.IEvent
                    public final /* synthetic */ IEvent post() {
                        C1440005kM.LIZ(this);
                        return this;
                    }

                    @Override // com.ss.android.ugc.governance.eventbus.IEvent
                    public final /* synthetic */ IEvent postSticky() {
                        C1440005kM.LIZIZ(this);
                        return this;
                    }
                });
            } else if (((AbstractC1439440nYs) awS486S0200000_22.l0).o2().creativeModel.miniGameData != null || Intrinsics.LJFF(((AbstractC1439440nYs) awS486S0200000_22.l0).o2().getShootEnterMethod(), "digital_wellbeing_share")) {
                ((AbstractC1439440nYs) awS486S0200000_22.l0).i3();
            } else if (((AbstractC1439440nYs) awS486S0200000_22.l0).o2().creativeModel.storyModel.getLandToOriginPageAfterPublish()) {
                ((AbstractC1439440nYs) awS486S0200000_22.l0).B3();
            } else {
                ((AbstractC1439440nYs) awS486S0200000_22.l0).H3();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS486S0200000_22 awS486S0200000_22, Object obj, Object obj2, Object obj3) {
        ((Boolean) obj).booleanValue();
        Function0 function0 = (Function0) awS486S0200000_22.l0;
        if (function0 != null) {
            function0.invoke();
        }
        ((AbstractC1439430nYr) awS486S0200000_22.l1).m3();
        return Unit.LIZ;
    }
}
