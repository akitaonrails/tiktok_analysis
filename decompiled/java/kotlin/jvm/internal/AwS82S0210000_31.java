package kotlin.jvm.internal;

import X.AbstractC20694715yT;
import X.AnonymousClass1562;
import X.C07MS;
import X.C09AY;
import X.C0C64;
import X.C0LAB;
import X.C13LP;
import X.C1428470nHB;
import X.C150D;
import X.C15438062q;
import X.C15F6;
import X.C15F9;
import X.C15SM;
import X.C15TM;
import X.C1841760y1m;
import X.C19719612Di;
import X.C2043407zU;
import X.C20441214yg;
import X.C204646155w;
import X.C20508815Mw;
import X.C20524315Sv;
import X.C20614415lW;
import X.C20684815ws;
import X.C20694815yU;
import X.C20694915yV;
import X.C2188811AlT;
import X.C5183020f;
import X.EnumC20527415Ua;
import X.InterfaceC20530715Vh;
import Y.ARunnableS75S0200000_6;
import android.text.Layout;
import com.bytedance.android.live.liveinteract.multihost.biz.viewmodel.InteractionTitleViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.commerce.tools.tcm.CommerceToolsTcmModel;
import com.ss.android.ugc.aweme.commerce.tools.tcm.model.BrandedContentSwitchStatus;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.OnThisDayData;
import com.ss.android.ugc.aweme.explore.assem.ExploreFeedCell;
import com.ss.android.ugc.aweme.explore.data.ExploreAwemeList;
import com.ss.android.ugc.aweme.explore.data.ExploreCustomTopicResponse;
import com.ss.android.ugc.aweme.explore.domian.ExploreCustomTopicDataSource;
import com.ss.android.ugc.aweme.explore.vm.ExploreFeedListViewModel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.story.userpanel.vm.StoryUserListContainerViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import lth.o;

/* JADX INFO: loaded from: classes32.dex */
public class AwS82S0210000_31 extends C09AY implements Function1 {
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
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS82S0210000_31 awS82S0210000_31, Object obj) {
        C0LAB c0lab = new C0LAB();
        C20508815Mw.LIZ.getClass();
        c0lab.LIZ(C20508815Mw.LIZIZ() ? 1 : 0, "is_tcm_creator");
        c0lab.LJ("user_id", o.LJIIZILJ.getCurrentUserID());
        C20684815ws.LJIILLIIL("ttcm_turnon_disclosure_setting_click_cancel", c0lab.LIZ);
        if (awS82S0210000_31.z2) {
            CommerceToolsTcmModel commerceToolsTcmModel = (CommerceToolsTcmModel) awS82S0210000_31.l0;
            if (commerceToolsTcmModel != null) {
                commerceToolsTcmModel.setBrandedContentSwitch(CardStruct.IStatusCode.DEFAULT);
            }
            CommerceToolsTcmModel commerceToolsTcmModel2 = (CommerceToolsTcmModel) awS82S0210000_31.l0;
            if (commerceToolsTcmModel2 != null) {
                commerceToolsTcmModel2.setTcmCampaignInfo(null);
            }
            ((BrandedContentSwitchStatus) awS82S0210000_31.l1).LL.setValue(CardStruct.IStatusCode.DEFAULT);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS82S0210000_31 awS82S0210000_31, Object obj) {
        Long l = (Long) obj;
        if (l != null) {
            String str = ExploreFeedListViewModel.LLJZIJLIL;
            TuxTextView tuxTextViewT6 = ((ExploreFeedCell) awS82S0210000_31.l0).T6();
            AwS8S1310000_31 awS8S1310000_31 = new AwS8S1310000_31((ExploreFeedCell) awS82S0210000_31.l0, (ExploreFeedCell) l, (Long) awS82S0210000_31.l1, (Map<String, String>) awS82S0210000_31.z2, (boolean) str, (String) 0);
            ((ExploreFeedCell) awS82S0210000_31.l0).getClass();
            if (!ExploreFeedCell.b7() && ((ExploreFeedCell) awS82S0210000_31.l0).getLayoutPosition() < 0) {
                awS8S1310000_31.invoke(null);
            } else {
                Layout layout = tuxTextViewT6.getLayout();
                if (layout == null) {
                    HandlerHook.viewPost(tuxTextViewT6, new ARunnableS75S0200000_6(awS8S1310000_31, layout, 36));
                } else {
                    awS8S1310000_31.invoke(layout);
                }
            }
            ((ExploreFeedCell) awS82S0210000_31.l0).LLJJL = null;
            if (ExploreFeedCell.b7()) {
                ((ExploreFeedCell) awS82S0210000_31.l0).LLJJLIIIJLLLLLLLZ = null;
            }
            ((InterfaceC20530715Vh) ((ExploreFeedCell) awS82S0210000_31.l0).LLL.getValue()).Gf(str, awS82S0210000_31.z2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS82S0210000_31 awS82S0210000_31, Object obj) {
        int size;
        C15SM c15sm = (C15SM) obj;
        EnumC20527415Ua enumC20527415Ua = ((ExploreAwemeList) awS82S0210000_31.l0).LLILLJJLI;
        EnumC20527415Ua enumC20527415Ua2 = EnumC20527415Ua.FIRST_LIGHT_WEIGHT;
        if (enumC20527415Ua == enumC20527415Ua2 || ((ExploreAwemeList) awS82S0210000_31.l0).LLILLJJLI == EnumC20527415Ua.SECOND_FULL_DATA) {
            c15sm.getClass();
            List<C150D> list = c15sm.getListState().LLILZ;
            if (list != null) {
                size = list.size() - 1;
            } else {
                size = 0;
            }
            List<C150D> listCQ2 = ((ExploreFeedListViewModel) awS82S0210000_31.l1).CQ2((ExploreAwemeList) awS82S0210000_31.l0, awS82S0210000_31.z2);
            if (!((ArrayList) listCQ2).isEmpty()) {
                ((ExploreFeedListViewModel) awS82S0210000_31.l1).listAddAllAt(size + 1, listCQ2);
            }
            if (C15TM.LIZ() && ((ExploreAwemeList) awS82S0210000_31.l0).LLILLJJLI == enumC20527415Ua2) {
                C2043407zU.LIZ();
            }
        }
        if (C07MS.LIZ()) {
            ExploreCustomTopicDataSource.Companion.getClass();
            CopyOnWriteArrayList<ExploreCustomTopicResponse> topicRAMResponse = C1841760y1m.LIZ.getTopicRAMResponse();
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(topicRAMResponse, 10));
            Iterator<ExploreCustomTopicResponse> it2 = topicRAMResponse.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().topicId);
            }
            Set setLLIIJI = C13LP.LLIIJI(arrayList);
            ExploreFeedListViewModel exploreFeedListViewModel = (ExploreFeedListViewModel) awS82S0210000_31.l1;
            AwS308S0300000_31 awS308S0300000_31 = new AwS308S0300000_31((ExploreAwemeList) awS82S0210000_31.l0, (ExploreAwemeList) exploreFeedListViewModel, (ExploreFeedListViewModel) setLLIIJI, (Set<Long>) 0);
            exploreFeedListViewModel.getClass();
            exploreFeedListViewModel.withState(new AwS397S0200000_31(exploreFeedListViewModel, (ExploreFeedListViewModel) awS308S0300000_31, (Function2<? super Integer, ? super C150D, Unit>) 81));
            C20524315Sv c20524315Sv = C20524315Sv.LL;
            ExploreAwemeList exploreAwemeList = (ExploreAwemeList) awS82S0210000_31.l0;
            c20524315Sv.getClass();
            C20524315Sv.LJFF(exploreAwemeList);
            C20524315Sv.LJI((ExploreAwemeList) awS82S0210000_31.l0);
        }
        if (((ExploreAwemeList) awS82S0210000_31.l0).LLILLJJLI == EnumC20527415Ua.FIRST_FULL_DATA) {
            AwS275S0300000_31 awS275S0300000_31 = new AwS275S0300000_31((IAwemeService) PluggableExtentionKt.pluggableSpi$default(IAwemeService.class, false, false, false, 14, null), (ExploreAwemeList) awS82S0210000_31.l0, (ExploreFeedListViewModel) awS82S0210000_31.l1, 23);
            if (C15TM.LIZIZ().mergeWaitCover) {
                C2043407zU.LIZJ(C15TM.LIZIZ().mergeWaitTimeoutMs, awS275S0300000_31);
            } else {
                awS275S0300000_31.invoke();
            }
            C20524315Sv c20524315Sv2 = C20524315Sv.LL;
            ExploreAwemeList exploreAwemeList2 = (ExploreAwemeList) awS82S0210000_31.l0;
            c20524315Sv2.getClass();
            C20524315Sv.LJFF(exploreAwemeList2);
            C20524315Sv.LJI((ExploreAwemeList) awS82S0210000_31.l0);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS82S0210000_31 awS82S0210000_31, Object obj) {
        CreativeModel creativeModel;
        OnThisDayData onThisDayData;
        AnonymousClass1562 anonymousClass1562 = (AnonymousClass1562) obj;
        boolean z = true;
        boolean z2 = !((VideoPublishEditModel) awS82S0210000_31.l0).creativeModel.onThisDayData.isInOnThisDayPreviewPage();
        C204646155w c204646155w = (C204646155w) awS82S0210000_31.l1;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) c204646155w.LLIZLLLIL.getValue(c204646155w, C204646155w.LLJJ[2]);
        boolean z3 = false;
        if (videoPublishEditModel != null) {
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_optimize_music_experience", true, false) && (creativeModel = videoPublishEditModel.creativeModel) != null && (onThisDayData = creativeModel.onThisDayData) != null && onThisDayData.isFromOnThisDay()) {
                z = true ^ c204646155w.LIZIZ().LJIIL;
            } else if (videoPublishEditModel.creativeModel.onThisDayData.isInOnThisDayPreviewPage() || (!C1428470nHB.LJJZZI(videoPublishEditModel) && (!C0C64.LJIILLIIL().LJIIIZ(31744, "studio_optimize_music_experience", true, false) || !c204646155w.LIZIZ().LJIIL))) {
            }
            z3 = z;
        }
        return AnonymousClass1562.LIZ(anonymousClass1562, false, false, z3, awS82S0210000_31.z2, z2, null, null, 99);
    }

    public static final Object invoke$4(AwS82S0210000_31 awS82S0210000_31, Object obj) {
        if (!Intrinsics.LJFF(((C15F9) obj).LLILLJJLI, (C15F6) awS82S0210000_31.l0) || awS82S0210000_31.z2) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("switchContentState , target = ");
            sbLIZ.append((C15F6) awS82S0210000_31.l0);
            sbLIZ.append(' ');
            C20441214yg.LIZIZ("TitleViewModel", C2188811AlT.LIZIZ(sbLIZ));
            ((InteractionTitleViewModel) awS82S0210000_31.l1).setState(new AwS610S0100000_31((C15F6) awS82S0210000_31.l0, 460));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS82S0210000_31 awS82S0210000_31, Object obj) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(((C20614415lW) obj).LLILLL.LIZ.LIZ);
        if (awS82S0210000_31.z2) {
            arrayList.add((User) awS82S0210000_31.l0);
        } else {
            C19719612Di.LJJIIJ(arrayList, new C5183020f((User) awS82S0210000_31.l0, 295), true);
        }
        ((StoryUserListContainerViewModel) awS82S0210000_31.l1).setState(new AwS610S0100000_31(arrayList, awS82S0210000_31.z2, (User) awS82S0210000_31.l0, 526));
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS82S0210000_31 awS82S0210000_31, Object obj) {
        AbstractC20694715yT abstractC20694715yT = (AbstractC20694715yT) obj;
        if (abstractC20694715yT instanceof C20694815yU) {
            C20694815yU c20694815yU = (C20694815yU) abstractC20694715yT;
            if (Intrinsics.LJFF(c20694815yU.LLJILJIL, ((C20694815yU) awS82S0210000_31.l0).LLJILJIL)) {
                return C20694815yU.LJ(c20694815yU, awS82S0210000_31.z2, (C20694915yV) awS82S0210000_31.l1, false, 7678);
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS82S0210000_31(C15F6 c15f6, boolean z, InteractionTitleViewModel interactionTitleViewModel, int i) {
        super(1);
        this.$t = i;
        this.l0 = c15f6;
        this.z2 = z;
        this.l1 = interactionTitleViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS82S0210000_31(C20694815yU c20694815yU, boolean z, C20694915yV c20694915yV, int i) {
        super(1);
        this.$t = i;
        this.l0 = c20694815yU;
        this.z2 = z;
        this.l1 = c20694915yV;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS82S0210000_31(ExploreFeedCell exploreFeedCell, Map map, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = exploreFeedCell;
        this.z2 = z;
        this.l1 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS82S0210000_31(ExploreAwemeList exploreAwemeList, ExploreFeedListViewModel exploreFeedListViewModel, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = exploreAwemeList;
        this.l1 = exploreFeedListViewModel;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS82S0210000_31(VideoPublishEditModel videoPublishEditModel, C204646155w c204646155w, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = videoPublishEditModel;
        this.l1 = c204646155w;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS82S0210000_31(boolean z, CommerceToolsTcmModel commerceToolsTcmModel, BrandedContentSwitchStatus brandedContentSwitchStatus, int i) {
        super(1);
        this.$t = i;
        this.z2 = z;
        this.l0 = commerceToolsTcmModel;
        this.l1 = brandedContentSwitchStatus;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS82S0210000_31(boolean z, User user, StoryUserListContainerViewModel storyUserListContainerViewModel, int i) {
        super(1);
        this.$t = i;
        this.z2 = z;
        this.l0 = user;
        this.l1 = storyUserListContainerViewModel;
    }
}
