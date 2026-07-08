package kotlin.jvm.internal;

import X.AbstractC738140SxQ;
import X.C09AY;
import X.C0RBZ;
import X.C0RM9;
import X.C0RMA;
import X.C0RTC;
import X.C0SPB;
import X.C0SQR;
import X.C1210704oT;
import X.C191B;
import X.C191F;
import X.C191I;
import X.C191P;
import X.C191Y;
import X.C2188811AlT;
import X.EnumC721170SQp;
import X.InterfaceC445610Hdf;
import android.util.ArrayMap;
import android.view.View;
import androidx.fragment.app.SAFTikTokFragment;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryCurrentInfo;
import com.ss.android.ugc.aweme.story.feed.immersive.component.StoryHighlightsComponent;
import com.ss.android.ugc.aweme.story.feed.immersive.component.StoryHighlightsShareComponent;
import com.ss.android.ugc.aweme.story.feed.immersive.component.StorySelfBottomBarComponent;
import com.ss.android.ugc.aweme.ui.fragment.PostModeDetailRootFragment;
import com.ss.android.ugc.aweme.ui.view.PostModeNestHeaderComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public class AwS64S0210000_11 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS64S0210000_11 awS64S0210000_11, Object obj) {
        UserStoryCurrentInfo userStoryCurrentInfoCopy;
        UserStory userStory = (UserStory) obj;
        if (awS64S0210000_11.z2) {
            UserStoryCurrentInfo userStoryCurrentInfo = (UserStoryCurrentInfo) awS64S0210000_11.l0;
            userStoryCurrentInfoCopy = userStoryCurrentInfo.copy(userStoryCurrentInfo.currentIndex, userStoryCurrentInfo.currentStory, userStoryCurrentInfo.dispatchCode + 1);
        } else {
            userStoryCurrentInfoCopy = (UserStoryCurrentInfo) awS64S0210000_11.l0;
        }
        return userStory.copy(userStory.stories, userStory.totalCount, userStory.currentPosition, userStory.allViewed, userStory.minCursor, userStory.maxCursor, userStory.hasMoreAfter, userStory.hasMoreBefore, userStory.lastStoryCreatedAt, userStory.isPostStyle, userStory.metaDataList, userStory.userFilterStoryInfo, userStory.isStoryGuideCard, userStory.highlightSkylightUser, userStory.originTotalCount, userStoryCurrentInfoCopy, userStory.fakeSelfStoryCollection, userStory.fakeAwemeShell, ((UserStory) awS64S0210000_11.l1).getMaxViewedInfo(), userStory.firstUnViewedStoryIdx, userStory.shouldStartFromUnViewedStoryIdx, userStory.totalVV, userStory.unReadStoryAids, userStory.isFromRemote);
    }

    public static final Object invoke$1(AwS64S0210000_11 awS64S0210000_11, Object obj) {
        Assembler assembler = (Assembler) obj;
        assembler.MQ2((StorySelfBottomBarComponent) awS64S0210000_11.l0, new AwS590S0100000_11((View) awS64S0210000_11.l1, 216));
        if (!awS64S0210000_11.z2 && C1210704oT.LIZ()) {
            if (C1210704oT.LIZIZ()) {
                assembler.MQ2((StorySelfBottomBarComponent) awS64S0210000_11.l0, new AwS590S0100000_11((View) awS64S0210000_11.l1, 218));
            }
        } else {
            assembler.MQ2((StorySelfBottomBarComponent) awS64S0210000_11.l0, new AwS590S0100000_11((View) awS64S0210000_11.l1, 217));
        }
        if (C0RMA.LIZ(((StorySelfBottomBarComponent) awS64S0210000_11.l0).jm())) {
            assembler.MQ2((StorySelfBottomBarComponent) awS64S0210000_11.l0, new AwS590S0100000_11((View) awS64S0210000_11.l1, 219));
            ((C0RBZ) ((StorySelfBottomBarComponent) awS64S0210000_11.l0).LLJLLL.getValue()).LIZ(new InterfaceC445610Hdf() { // from class: X.0RLn
                public static final /* synthetic */ int LL = 0;

                @Override // X.InterfaceC445610Hdf
                public final C13IQ<? extends ReusedUIAssem<? extends C03H5>> getType() {
                    return C13LE.LIZ(StoryHighlightsComponent.class);
                }

                @Override // X.InterfaceC445610Hdf
                public final boolean Fc(VideoItemParams videoItemParams, C690870R8b c690870R8b) {
                    return C0RMA.LIZIZ(videoItemParams, c690870R8b);
                }
            });
        }
        if (C0RM9.LIZ(((StorySelfBottomBarComponent) awS64S0210000_11.l0).jm())) {
            if (!C1210704oT.LIZ()) {
                assembler.MQ2((StorySelfBottomBarComponent) awS64S0210000_11.l0, new AwS590S0100000_11((View) awS64S0210000_11.l1, 220));
                ((C0RBZ) ((StorySelfBottomBarComponent) awS64S0210000_11.l0).LLJLLL.getValue()).LIZ(new InterfaceC445610Hdf() { // from class: X.0RLo
                    public static final /* synthetic */ int LL = 0;

                    @Override // X.InterfaceC445610Hdf
                    public final C13IQ<? extends ReusedUIAssem<? extends C03H5>> getType() {
                        return C13LE.LIZ(StoryHighlightsShareComponent.class);
                    }

                    @Override // X.InterfaceC445610Hdf
                    public final boolean Fc(VideoItemParams videoItemParams, C690870R8b c690870R8b) {
                        return C0RM9.LIZIZ(videoItemParams, c690870R8b);
                    }
                });
            } else if (C1210704oT.LIZIZ()) {
                assembler.MQ2((StorySelfBottomBarComponent) awS64S0210000_11.l0, new AwS590S0100000_11((View) awS64S0210000_11.l1, 222));
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS64S0210000_11 awS64S0210000_11, Object obj) {
        ReusedAssem reusedAssem;
        AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) obj;
        if ((abstractC738140SxQ instanceof ReusedAssem) && (reusedAssem = (ReusedAssem) abstractC738140SxQ) != null) {
            ((C0RTC) awS64S0210000_11.l0).LJ(reusedAssem);
            if (awS64S0210000_11.z2) {
                reusedAssem.active = true;
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$3(kotlin.jvm.internal.AwS64S0210000_11 r31, java.lang.Object r32) {
        /*
            Method dump skipped, instruction units count: 1002
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS64S0210000_11.invoke$3(kotlin.jvm.internal.AwS64S0210000_11, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$4(AwS64S0210000_11 awS64S0210000_11, Object obj) {
        Integer numValueOf;
        PostModeDetailRootFragment postModeDetailRootFragment;
        ((Boolean) obj).booleanValue();
        if (awS64S0210000_11.z2) {
            IPhotoSlidesAbility iPhotoSlidesAbility = (IPhotoSlidesAbility) ((PostModeNestHeaderComponent) awS64S0210000_11.l0).LLZZLLIL.getValue();
            String aid = null;
            if (iPhotoSlidesAbility != null) {
                numValueOf = Integer.valueOf(iPhotoSlidesAbility.xt0());
            } else {
                numValueOf = null;
            }
            ArrayMap arrayMap = new ArrayMap();
            C191B c191b = new C191B();
            c191b.LJI(new C191I());
            c191b.LJI(new C191F(false));
            c191b.LJI(new C191Y());
            c191b.LJI(new C191P());
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            Aweme aweme = ((PostModeNestHeaderComponent) awS64S0210000_11.l0).LLILLL.LIZJ;
            if (aweme != null) {
                aid = aweme.getAid();
            }
            sbLIZ.append(aid);
            sbLIZ.append('_');
            sbLIZ.append(numValueOf);
            sbLIZ.append("_cover_photo");
            arrayMap.put(C2188811AlT.LIZIZ(sbLIZ), c191b);
            SAFTikTokFragment sAFTikTokFragmentLJIILLIIL = ((PostModeNestHeaderComponent) awS64S0210000_11.l0).LLILLL.LJIILLIIL();
            if ((sAFTikTokFragmentLJIILLIIL instanceof PostModeDetailRootFragment) && (postModeDetailRootFragment = (PostModeDetailRootFragment) sAFTikTokFragmentLJIILLIIL) != null) {
                postModeDetailRootFragment.iS(100, arrayMap);
            }
        }
        ((Function0) awS64S0210000_11.l1).invoke();
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS64S0210000_11(C0RTC c0rtc, C0RTC<Object> c0rtc2, AssemSupervisor assemSupervisor, boolean z) {
        super(1);
        this.$t = z ? 1 : 0;
        this.l0 = c0rtc;
        this.l1 = c0rtc2;
        this.z2 = assemSupervisor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS64S0210000_11(C0SQR c0sqr, EnumC721170SQp enumC721170SQp, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c0sqr;
        this.l1 = enumC721170SQp;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS64S0210000_11(StorySelfBottomBarComponent storySelfBottomBarComponent, boolean z, View view, int i) {
        super(1);
        this.$t = i;
        this.l0 = storySelfBottomBarComponent;
        this.z2 = z;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS64S0210000_11(boolean z, UserStoryCurrentInfo userStoryCurrentInfo, UserStory userStory, int i) {
        super(1);
        this.$t = i;
        this.z2 = z;
        this.l0 = userStoryCurrentInfo;
        this.l1 = userStory;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS64S0210000_11(boolean z, PostModeNestHeaderComponent postModeNestHeaderComponent, C0SPB c0spb, int i) {
        super(1);
        this.$t = i;
        this.z2 = z;
        this.l0 = postModeNestHeaderComponent;
        this.l1 = c0spb;
    }
}
