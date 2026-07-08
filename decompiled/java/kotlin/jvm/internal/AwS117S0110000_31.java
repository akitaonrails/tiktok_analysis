package kotlin.jvm.internal;

import X.C09AY;
import X.C1389890mGx;
import X.C16CA;
import X.C19319810iC;
import X.C20693115yD;
import X.C20693215yE;
import X.C20693415yG;
import X.C20694215yO;
import X.C20695315yZ;
import X.C20696315yj;
import X.C786410Ut5;
import X.C799570VYd;
import Y.ARunnableS131S0100000_31;
import com.ss.android.ugc.aweme.captionsheet.CaptionsPanelFragment;
import com.ss.android.ugc.aweme.ecommerce.base.selector.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.ecommerce.base.selector.viewmodel.ChooseMediaState;
import com.ss.android.ugc.aweme.explore.ability.ExploreManageTabAbility;
import com.ss.android.ugc.aweme.explore.assem.ExploreRecommendTopicListComponent;
import com.ss.android.ugc.aweme.explore.data.ExploreAwemeList;
import com.ss.android.ugc.aweme.explore.vm.ExploreFeedListViewModel;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes32.dex */
public class AwS117S0110000_31 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public boolean z1;

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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS117S0110000_31(List list, int i) {
        super(1);
        this.$t = i;
        this.l0 = list;
        this.z1 = false;
    }

    public static final Object invoke$0(AwS117S0110000_31 awS117S0110000_31, Object obj) {
        return C20693415yG.LJJIJL(((C20694215yO) awS117S0110000_31.l0).LIZIZ(), awS117S0110000_31.z1, false, false, false, 8190);
    }

    public static final Object invoke$1(AwS117S0110000_31 awS117S0110000_31, Object obj) {
        return C20693415yG.LJJIJL(((C20694215yO) awS117S0110000_31.l0).LIZIZ(), false, awS117S0110000_31.z1, false, false, 7679);
    }

    public static final Object invoke$2(AwS117S0110000_31 awS117S0110000_31, Object obj) {
        return C19319810iC.LJJIJL(((C20696315yj) awS117S0110000_31.l0).LIZIZ(), awS117S0110000_31.z1, null, null, false, null, false, false, false, false, null, false, 131070);
    }

    public static final Object invoke$3(AwS117S0110000_31 awS117S0110000_31, Object obj) {
        return C19319810iC.LJJIJL(((C20696315yj) awS117S0110000_31.l0).LIZIZ(), false, null, null, awS117S0110000_31.z1, null, false, false, false, false, null, false, 131063);
    }

    public static final Object invoke$4(AwS117S0110000_31 awS117S0110000_31, Object obj) {
        if (!awS117S0110000_31.z1) {
            ExploreManageTabAbility exploreManageTabAbilityVp = ((ExploreRecommendTopicListComponent) awS117S0110000_31.l0).Vp();
            if (exploreManageTabAbilityVp != null) {
                exploreManageTabAbilityVp.wK(((ExploreRecommendTopicListComponent) awS117S0110000_31.l0).Tp(), ((ExploreRecommendTopicListComponent) awS117S0110000_31.l0).Qp());
            }
            ExploreRecommendTopicListComponent exploreRecommendTopicListComponent = (ExploreRecommendTopicListComponent) awS117S0110000_31.l0;
            C1389890mGx c1389890mGx = new C1389890mGx(((ExploreRecommendTopicListComponent) awS117S0110000_31.l0).LJJIJL());
            c1389890mGx.LJIIJ(((ExploreRecommendTopicListComponent) awS117S0110000_31.l0).Jp().getString(2131829901));
            exploreRecommendTopicListComponent.LLLLIILL = c1389890mGx;
            C1389890mGx c1389890mGx2 = ((ExploreRecommendTopicListComponent) awS117S0110000_31.l0).LLLLIILL;
            if (c1389890mGx2 != null) {
                c1389890mGx2.LJIIJJI();
            }
            ((ExploreRecommendTopicListComponent) awS117S0110000_31.l0).tq();
        }
        ((ArrayList) ((ExploreRecommendTopicListComponent) awS117S0110000_31.l0).LLLJ).remove(obj);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS117S0110000_31 awS117S0110000_31, Object obj) {
        ((ExploreFeedListViewModel) awS117S0110000_31.l0).DQ2((ExploreAwemeList) obj, awS117S0110000_31.z1);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$6(AwS117S0110000_31 awS117S0110000_31, Object obj) {
        ((ExploreFeedListViewModel) awS117S0110000_31.l0).DQ2((ExploreAwemeList) obj, awS117S0110000_31.z1);
        C786410Ut5.LJLIIL(100L, C799570VYd.LIZJ(), new ARunnableS131S0100000_31((ExploreFeedListViewModel) awS117S0110000_31.l0, 61));
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS117S0110000_31 awS117S0110000_31, Object obj) {
        ChooseMediaState chooseMediaState = (ChooseMediaState) obj;
        return chooseMediaState.copy(chooseMediaState.previewMediaState, chooseMediaState.selectPhotoMedia, chooseMediaState.mediaListState, new C16CA((List<TikTokMediaModel>) awS117S0110000_31.l0, awS117S0110000_31.z1), chooseMediaState.previewDockerDelMediaState, chooseMediaState.previewDockerAddMediaState);
    }

    public static final Object invoke$8(AwS117S0110000_31 awS117S0110000_31, Object obj) {
        return C19319810iC.LJJIJL((C19319810iC) obj, false, ((CaptionsPanelFragment) awS117S0110000_31.l0).cS(awS117S0110000_31.z1), null, false, null, false, false, false, false, null, false, 131069);
    }

    public static final Object invoke$9(AwS117S0110000_31 awS117S0110000_31, Object obj) {
        return C20693115yD.LIZIZ(((C20693215yE) awS117S0110000_31.l0).LIZIZ(), awS117S0110000_31.z1, false, false, 119);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS117S0110000_31(C20693215yE c20693215yE, int i) {
        super(1);
        this.$t = i;
        this.l0 = c20693215yE;
        this.z1 = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS117S0110000_31(C20696315yj c20696315yj, int i) {
        super(1);
        this.$t = i;
        this.l0 = c20696315yj;
        this.z1 = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS117S0110000_31(C20694215yO c20694215yO, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c20694215yO;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS117S0110000_31(C20695315yZ c20695315yZ, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c20695315yZ;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS117S0110000_31(CaptionsPanelFragment captionsPanelFragment, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = captionsPanelFragment;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS117S0110000_31(ExploreFeedListViewModel exploreFeedListViewModel, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = exploreFeedListViewModel;
        this.z1 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS117S0110000_31(boolean z, ExploreRecommendTopicListComponent exploreRecommendTopicListComponent, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = exploreRecommendTopicListComponent;
    }
}
