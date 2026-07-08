package com.ss.android.ugc.aweme.upvote.detail.whitebar;

import X.C013C;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C07NU;
import X.C09R3;
import X.C0BOU;
import X.C0HHT;
import X.C0PEM;
import X.C0RD6;
import X.C0RFV;
import X.C0RSD;
import X.C11NJ;
import X.C1358560lSQ;
import X.C1358700lSe;
import X.C1358720lSg;
import X.C1359730lUJ;
import X.C1359820lUS;
import X.C1359980lUi;
import X.C1359990lUj;
import X.C1360080lUs;
import X.C1360090lUt;
import X.C1360460lVU;
import X.C13LE;
import X.C1402270mav;
import X.C1558520qew;
import X.C1559260qg8;
import X.C1591220rVg;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2189821An6;
import X.C2217381BqS;
import X.C2296808zG;
import X.C23250099c;
import X.C259800zU;
import X.C287250BNr;
import X.C298720BnK;
import X.C420410Ge7;
import X.C420840Geo;
import X.C428890Grn;
import X.C429430Gsf;
import X.C452501pT;
import X.C570060MXk;
import X.C570110MXp;
import X.C597980Ncq;
import X.C694180RKu;
import X.C699500RcC;
import X.C700450Rdj;
import X.C720360SNm;
import X.C723580SZw;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736950SvV;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C897010ZGx;
import X.EnumC1359800lUQ;
import X.EnumC609120Nuo;
import X.InterfaceC1360060lUq;
import X.InterfaceC1554640qYg;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC609180Nuu;
import X.InterfaceC700000Rd0;
import X.InterfaceC701260Rf2;
import Y.AAListenerS332S0100000_21;
import Y.ARunnableS121S0100000_21;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.graphics.Rect;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.vcloud.strategy.StrategyCenter;
import com.ss.android.ugc.aweme.feed.adapter.AvoidUpvoteViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.StatePassingVM;
import com.ss.android.ugc.aweme.feed.assem.ability.IPanelUIAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.RecReasonEntry;
import com.ss.android.ugc.aweme.feed.model.RecReasonsStruct;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.upvote.PublishFrom;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.network.INetwork;
import com.ss.android.ugc.aweme.poi_api.service.IPoiService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.upvote.ability.IUpvoteGuideAbility;
import com.ss.android.ugc.aweme.upvote.ability.IViewPositionAbility;
import com.ss.android.ugc.aweme.upvote.detail.UpvoteListViewModelNew;
import com.ss.android.ugc.aweme.upvote.detail.input.RepostInputFragment;
import com.ss.android.ugc.aweme.upvote.detail.vm.RepostCacheVM;
import com.ss.android.ugc.aweme.upvote.detail.vm.RepostEventVMNew;
import com.ss.android.ugc.aweme.upvote.event.UpvotePublishExtraData;
import com.ss.android.ugc.aweme.upvote.event.UpvotePublishMobParam;
import com.ss.android.ugc.aweme.upvote.publish.UpvotePublishVM;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.InteractVideoTagAbility;
import com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AFwS305S0000000_21;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.jvm.internal.AwS59S1300000_21;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.AwS635S0100000_21;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public final class UpvoteVideoAssemNew extends BaseCellSlotComponent<UpvoteVideoAssemNew> implements ComponentPriorityProtocol, IUpvoteGuideAbility, IViewPositionAbility, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLLJI;
    public final C1559260qg8 LLJLLIL = new C1559260qg8(new C723580SZw(this, C1358560lSQ.class, null), checkSupervisorPrepared());
    public final C01GW LLJLLL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS259S0000000_21.get$arr$(275));
    public final InterfaceC1731706qJ LLJZ;
    public final C01GW LLJZIJLIL;
    public final InterfaceC1731706qJ LLL;
    public final C1360090lUt LLLF;
    public final C01GW LLLFF;
    public final C01GW LLLFFI;
    public final C01GW LLLFZ;
    public final C01GW LLLI;
    public boolean LLLII;
    public final C01GW LLLIIII;
    public final C01GW LLLIIIIL;
    public final C01GW LLLIIIL;
    public final C01GW LLLIIL;
    public final C01GW LLLIILIL;
    public final C01GW LLLIL;
    public final C01GW LLLILZ;
    public final InterfaceC1731706qJ LLLILZJ;
    public boolean LLLILZLLLI;
    public Long LLLIZZ;
    public Boolean LLLJ;
    public Boolean LLLJIL;
    public Boolean LLLJL;
    public Aweme LLLL;
    public boolean LLLLII;
    public final C01GW LLLLIIIILLL;
    public boolean LLLLIIL;
    public boolean LLLLIILL;
    public boolean LLLLIILLL;
    public boolean LLLLIL;
    public String LLLLILI;
    public final InterfaceC1731706qJ LLLLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(UpvoteVideoAssemNew.class, "statePassingVM", "getStatePassingVM()Lcom/ss/android/ugc/aweme/feed/assem/StatePassingVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(UpvoteVideoAssemNew.class, "avoidUpvoteVM", "getAvoidUpvoteVM()Lcom/ss/android/ugc/aweme/feed/adapter/AvoidUpvoteViewModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(UpvoteVideoAssemNew.class, "repostCacheVM", "getRepostCacheVM()Lcom/ss/android/ugc/aweme/upvote/detail/vm/RepostCacheVM;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(UpvoteVideoAssemNew.class, "upvoteAssemStateVM", "getUpvoteAssemStateVM()Lcom/ss/android/ugc/aweme/upvote/detail/whitebar/UpvoteAssemStateVM;", 0);
        c09r3.getClass();
        LLLLJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final void Bh2(boolean z) {
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String H3() {
        return "left_container_social_repost";
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final C699500RcC II() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void LJL() {
        this.LLLLIILL = false;
        qq();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.i6i;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean PT1() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final boolean Qm0() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Wp() {
        Long l;
        List<UpvoteStruct> listLIZ = Fp().LIZ();
        if (!this.LLJJIII || getContentView().getVisibility() != 0 || listLIZ == null || listLIZ.isEmpty()) {
            return;
        }
        UpvoteListViewModelNew upvoteListViewModelNewFp = Fp();
        if ((!upvoteListViewModelNewFp.LIZJ() || upvoteListViewModelNewFp.LIZ().size() != 1 || !Ip().LLILZ.LIZIZ) && (l = this.LLLIZZ) != null) {
            try {
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C597980Ncq(System.currentTimeMillis(), l.longValue(), this, null), 3);
            } finally {
                try {
                } catch (Throwable th) {
                }
            }
            this.LLLIZZ = null;
            this.LLLJ = null;
        }
        if (LJJIJL().getVisibility() == 0) {
            this.LLLJL = Boolean.TRUE;
        }
    }

    @Override // X.C0RJL
    public final boolean oh() {
        return false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* JADX INFO: renamed from: op */
    public final boolean ur(VideoItemParams videoItemParams) {
        return true;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == 550155379 || iHashCode == 1144784156) {
            return this;
        }
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC701260Rf2 vk() {
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final InterfaceC700000Rd0 wb1() {
        return null;
    }

    public UpvoteVideoAssemNew() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(StatePassingVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJZ = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS555S0100000_11(c19719912DlLIZ, 1132), null, AFwS259S0000000_21.get$arr$(278));
        this.LLJZIJLIL = C737910Sx3.LIZJ(this, C13LE.LIZ(RepostEventVMNew.class), AFwS259S0000000_21.get$arr$(276));
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(AvoidUpvoteViewModel.class);
        this.LLL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c0hht, c1637906bB, new AwS555S0100000_11(c19719912DlLIZ2, 1133), null, AFwS243S0000000_11.get$arr$(548));
        this.LLLF = new C1360090lUt();
        this.LLLFF = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1129));
        this.LLLFFI = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1126));
        this.LLLFZ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1130));
        this.LLLI = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1131));
        this.LLLIIII = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1128));
        this.LLLIIIIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1064));
        this.LLLIIIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1127));
        this.LLLIIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1125));
        this.LLLIILIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1066));
        this.LLLIL = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoPlayViewModel.class), AFwS259S0000000_21.get$arr$(277));
        this.LLLILZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1065));
        C19719912Dl c19719912DlLIZ3 = C13LE.LIZ(RepostCacheVM.class);
        this.LLLILZJ = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ3), c019f, c1637906bB, new AwS555S0100000_11(c19719912DlLIZ3, 1134), null, AFwS259S0000000_21.get$arr$(279));
        this.LLLLIIIILLL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(379));
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ4 = C13LE.LIZ(UpvoteAssemStateVM.class);
        this.LLLLJ = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ4), c01d1, c1637906bB, new AwS555S0100000_11(c19719912DlLIZ4, 1135), null, AFwS259S0000000_21.get$arr$(274));
    }

    public static void vq() {
        C1358720lSg.LIZ.getClass();
        long j = C1358720lSg.LIZIZ().getLong("key_repost_add_text_version_time", -1L);
        if (j != -1) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("addNoteVersionTime: ");
            sbLIZ.append(j);
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        long jLIZIZ = ((INetwork) ServiceManager.get().getService(INetwork.class)).LIZIZ();
        C1358720lSg.LIZIZ().storeLong("key_repost_add_text_version_time", jLIZIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("saveAddNoteVersionTime: ");
        sbLIZ2.append(jLIZIZ);
        C2188811AlT.LIZIZ(sbLIZ2);
    }

    public final AvoidUpvoteViewModel Ep() {
        return (AvoidUpvoteViewModel) this.LLL.getValue(this, LLLLJI[1]);
    }

    public final UpvoteListViewModelNew Fp() {
        return (UpvoteListViewModelNew) this.LLLIILIL.getValue();
    }

    public final RepostEventVMNew Ip() {
        return (RepostEventVMNew) this.LLJZIJLIL.getValue();
    }

    public final C1358560lSQ Jp() {
        return (C1358560lSQ) this.LLJLLIL.getValue();
    }

    public final C1359980lUi Qp() {
        if (this.LLJJIJI) {
            return (C1359980lUi) this.LLLILZ.getValue();
        }
        return null;
    }

    public final void Tp() {
        C013C c013c = new C013C();
        C736680Sv4.LJIJJ(Ep(), new AwS377S0200000_11(c013c, this, 141));
        if (c013c.element) {
            C724270Sb3 c724270Sb3 = this.LLJI;
            AwemeBizExtKt.setReplaceRecTagByRepost(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme(), true);
            Bp(0, C07NU.LIZ() ? EnumC609120Nuo.UPVOTE_INFO_NEW_STYLE : EnumC609120Nuo.UPVOTE_INFO);
            InteractVideoTagAbility interactVideoTagAbility = (InteractVideoTagAbility) this.LLLFZ.getValue();
            if (interactVideoTagAbility != null) {
                interactVideoTagAbility.MO2();
            }
        }
    }

    public final boolean Up() {
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (!Intrinsics.LJFF(((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).mFrom, "REPOSTED_LIST_ENTRANCE")) {
            C724270Sb3 c724270Sb32 = this.LLJI;
            if (!Intrinsics.LJFF(((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).mFrom, "REPOSTED_TIMELINE_ENTRANCE")) {
                return false;
            }
        }
        C724270Sb3 c724270Sb33 = this.LLJI;
        if (Intrinsics.LJFF(((VideoItemParams) (c724270Sb33 != null ? c724270Sb33.LL : null)).mEventType, "personal_homepage")) {
            return true;
        }
        C724270Sb3 c724270Sb34 = this.LLJI;
        return Intrinsics.LJFF(((VideoItemParams) (c724270Sb34 != null ? c724270Sb34.LL : null)).mEventType, "others_homepage");
    }

    public final void Xp() throws JSONException {
        String aid;
        C724270Sb3 c724270Sb3 = this.LLJI;
        Aweme aweme = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
        if (aweme == null || (aid = aweme.getAid()) == null || !Up()) {
            return;
        }
        if (LJJIJL().getVisibility() == 8 || !Intrinsics.LJFF(this.LLLJL, Boolean.TRUE)) {
            JSONObject jSONObject = new JSONObject();
            C724270Sb3 c724270Sb32 = this.LLJI;
            jSONObject.put("is_self", Intrinsics.LJFF(((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).mEventType, "personal_homepage") ? 1 : -1);
            jSONObject.put("group_id", aid);
            C20684815ws.LJIJ("video_without_repost", jSONObject);
        }
    }

    @Override // com.ss.android.ugc.aweme.upvote.ability.IViewPositionAbility
    public final Rect Zz() {
        if (!this.LLJJIII || LJJIJL().getVisibility() != 0) {
            return null;
        }
        int[] iArr = new int[2];
        LJJIJL().getLocationOnScreen(iArr);
        int i = iArr[0];
        return new Rect(i, iArr[1], LJJIJL().getWidth() + i, iArr[1] + LJJIJL().getHeight());
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (X.C698200Ra6.LIZJ(r0, null) == false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean aq() {
        /*
            r4 = this;
            X.0Sb3 r0 = r4.LLJI
            r2 = 0
            if (r0 == 0) goto L5a
            java.lang.Object r0 = r0.LL
        L7:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            boolean r0 = com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt.getReplaceRecTagByRepost(r0)
            r3 = 0
            if (r0 != 0) goto L53
            X.0Sb3 r0 = r4.LLJI
            if (r0 == 0) goto L58
            java.lang.Object r0 = r0.LL
        L1a:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            java.lang.String r1 = r0.mEventType
            java.lang.String r0 = "repost_feed"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L53
            X.0Sb3 r0 = r4.LLJI
            if (r0 == 0) goto L56
            java.lang.Object r0 = r0.LL
        L2c:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            androidx.fragment.app.Fragment r0 = r0.fragment
            boolean r0 = X.C1389300mG0.LJIILLIIL(r0)
            if (r0 != 0) goto L53
            boolean r0 = X.C1358180lRo.LIZLLL()
            if (r0 == 0) goto L5c
            X.0Ra6 r1 = X.C698200Ra6.LIZ
            X.0Sb3 r0 = r4.LLJI
            if (r0 == 0) goto L54
            java.lang.Object r0 = r0.LL
        L44:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            r1.getClass()
            boolean r0 = X.C698200Ra6.LIZJ(r0, r2)
            if (r0 != 0) goto L5c
        L53:
            return r3
        L54:
            r0 = r2
            goto L44
        L56:
            r0 = r2
            goto L2c
        L58:
            r0 = r2
            goto L1a
        L5a:
            r0 = r2
            goto L7
        L5c:
            X.013C r3 = new X.013C
            r3.<init>()
            com.ss.android.ugc.aweme.feed.adapter.AvoidUpvoteViewModel r2 = r4.Ep()
            kotlin.jvm.internal.AwS377S0200000_11 r1 = new kotlin.jvm.internal.AwS377S0200000_11
            r0 = 142(0x8e, float:1.99E-43)
            r1.<init>(r3, r4, r0)
            X.C736680Sv4.LJIJJ(r2, r1)
            boolean r0 = r3.element
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.upvote.detail.whitebar.UpvoteVideoAssemNew.aq():boolean");
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() throws JSONException {
        HomeTabAbility homeTabAbility;
        if (Intrinsics.LJFF(this.LLLJIL, Boolean.TRUE)) {
            this.LLLLIIL = false;
            qq();
        }
        if (this.LLLJIL != null || C1591220rVg.LIZLLL()) {
            Xp();
            ((C11NJ) this.LLLLIIIILLL.getValue()).LJ();
            if (!C1591220rVg.LIZLLL() || (homeTabAbility = (HomeTabAbility) this.LLLIIII.getValue()) == null) {
                return;
            }
            homeTabAbility.tx0((C1402270mav) this.LLLIIIIL.getValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void qq() {
        /*
            r7 = this;
            boolean r4 = r7.LLLLIILLL
            X.0lSQ r0 = r7.Jp()
            r3 = 0
            if (r0 == 0) goto Lc2
            java.lang.String r5 = r0.LLIZ
        Lb:
            r2 = 0
            if (r5 == 0) goto Lb9
            int r1 = r5.hashCode()
            r0 = -1271119582(0xffffffffb43c4122, float:-1.753256E-7)
            if (r1 == r0) goto L94
            r0 = -667094460(0xffffffffd83cf244, float:-8.3099484E14)
            if (r1 == r0) goto L6f
            r0 = 1691937916(0x64d8ec7c, float:3.2012298E22)
            if (r1 != r0) goto Lb9
            java.lang.String r0 = "homepage_hot"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto Lb9
            X.01GW r0 = r7.LLLIIII
            java.lang.Object r1 = r0.getValue()
            com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility r1 = (com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility) r1
            if (r1 == 0) goto L6d
            java.lang.String r0 = "For You"
            boolean r1 = r1.ft0(r0)
        L39:
            boolean r0 = r7.LLLLIIL
            if (r0 == 0) goto L44
            boolean r0 = r7.LLLLIILL
            if (r0 == 0) goto L44
            if (r1 == 0) goto L44
        L43:
            r2 = 1
        L44:
            if (r4 == 0) goto L68
            if (r2 != 0) goto L68
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r7.LLLL
            if (r6 == 0) goto L68
            X.0lSP r1 = X.C1358550lSP.LIZ
            X.0lSQ r0 = r7.Jp()
            if (r0 == 0) goto L6b
            java.lang.String r5 = r0.LLIZ
        L56:
            r1.getClass()
            X.1DFB r0 = X.C0PEM.LIZJ
            X.054G r4 = X.C2296808zG.LIZ(r0)
            X.0HA5 r1 = new X.0HA5
            r1.<init>(r6, r5, r3)
            r0 = 3
            X.C23250099c.LIZLLL(r4, r3, r3, r1, r0)
        L68:
            r7.LLLLIILLL = r2
            return
        L6b:
            r5 = r3
            goto L56
        L6d:
            r1 = 0
            goto L39
        L6f:
            java.lang.String r0 = "homepage_friends"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto Lb9
            X.01GW r0 = r7.LLLIIII
            java.lang.Object r1 = r0.getValue()
            com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility r1 = (com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility) r1
            if (r1 == 0) goto L92
            java.lang.String r0 = "FRIENDS_FEED"
            boolean r1 = r1.ft0(r0)
        L87:
            boolean r0 = r7.LLLLIIL
            if (r0 == 0) goto L44
            boolean r0 = r7.LLLLIILL
            if (r0 == 0) goto L44
            if (r1 == 0) goto L44
            goto L43
        L92:
            r1 = 0
            goto L87
        L94:
            java.lang.String r0 = "homepage_follow"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto Lb9
            X.01GW r0 = r7.LLLIIII
            java.lang.Object r1 = r0.getValue()
            com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility r1 = (com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility) r1
            if (r1 == 0) goto Lb7
            java.lang.String r0 = "Following"
            boolean r1 = r1.ft0(r0)
        Lac:
            boolean r0 = r7.LLLLIIL
            if (r0 == 0) goto L44
            boolean r0 = r7.LLLLIILL
            if (r0 == 0) goto L44
            if (r1 == 0) goto L44
            goto L43
        Lb7:
            r1 = 0
            goto Lac
        Lb9:
            boolean r0 = r7.LLLLIIL
            if (r0 == 0) goto L44
            boolean r0 = r7.LLLLIILL
            if (r0 == 0) goto L44
            goto L43
        Lc2:
            r5 = r3
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.upvote.detail.whitebar.UpvoteVideoAssemNew.qq():void");
    }

    public final void tq() {
        String tabName;
        C2189821An6 c2189821An6;
        if (!Ip().LLILZ.LJIILJJIL || !Vp()) {
            return;
        }
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (!(c19egLIZ instanceof C19GS) || c19egLIZ == null) {
            return;
        }
        C724270Sb3 c724270Sb3 = this.LLJI;
        Aweme aweme = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
        if (aweme == null) {
            return;
        }
        FragmentManager supportFragmentManager = c19egLIZ.getSupportFragmentManager();
        if (c19egLIZ.isDestroyed() || c19egLIZ.isFinishing() || supportFragmentManager.LJLJJI()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("openRepostNoteInputAfterLoad aborted: unsafe to show (isDestroyed=");
            sbLIZ.append(c19egLIZ.isDestroyed());
            sbLIZ.append(", isFinishing=");
            sbLIZ.append(c19egLIZ.isFinishing());
            sbLIZ.append(", isStateSaved=");
            sbLIZ.append(supportFragmentManager.LJLJJI());
            sbLIZ.append("), aid=");
            sbLIZ.append(aweme.getAid());
            C429430Gsf.LIZ("UpvoteVideoAssemNew", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("openRepostNoteInputAfterLoad hit: aid=");
        sbLIZ2.append(aweme.getAid());
        sbLIZ2.append(", pull up RepostInputFragment (input only, NOT opening repost panel)");
        C429430Gsf.LIZ("UpvoteVideoAssemNew", C2188811AlT.LIZIZ(sbLIZ2));
        String str = RepostInputFragment._pnsPageId;
        C1359730lUJ.LIZIZ(c19egLIZ);
        C429430Gsf.LIZ("UpvoteVideoAssemNew", "openRepostNoteInputAfterLoad perf enterMethod=repost_tab_guide_bubble");
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("enter_method", "click_repost_note_guide_bubble"), new Pair("publish_repost_text_enter_method", "repost_tab_guide_bubble"));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("openRepostNoteInputAfterLoad trackExtra=");
        sbLIZ3.append(mapLJIIIIZZ);
        C429430Gsf.LIZ("UpvoteVideoAssemNew", C2188811AlT.LIZIZ(sbLIZ3));
        try {
            C724270Sb3 c724270Sb32 = this.LLJI;
            String str2 = ((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).mEventType;
            if (str2 == null) {
                str2 = "";
            }
            C724270Sb3 c724270Sb33 = this.LLJI;
            BaseFeedPageParams baseFeedPageParams = ((VideoItemParams) (c724270Sb33 != null ? c724270Sb33.LL : null)).baseFeedPageParams;
            if (baseFeedPageParams == null || (c2189821An6 = baseFeedPageParams.param) == null || (tabName = c2189821An6.getTabName()) == null) {
                tabName = "";
            }
            try {
                C1359730lUJ.LIZ(aweme, true, str2, "click_repost_note_guide_bubble", null, tabName, EnumC1359800lUQ.AUTO_OPEN_BY_NOTE_GUIDE, null, null, null, null, null, null, mapLJIIIIZZ, 16208).show(supportFragmentManager, "REPOST_INPUT");
                Ip().LLILZ.LJIILJJIL = false;
            } catch (Throwable th) {
                th = th;
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("openRepostNoteInputAfterLoad show failed: ");
                sbLIZ4.append(th.getMessage());
                sbLIZ4.append(", aid=");
                sbLIZ4.append(aweme.getAid());
                C429430Gsf.LIZ("UpvoteVideoAssemNew", C2188811AlT.LIZIZ(sbLIZ4));
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.protocol.ComponentPriorityProtocol
    public final C700450Rdj vN0() {
        return new C700450Rdj(null, null, new AwS565S0100000_21(this, 1063), 3);
    }

    public final InterfaceC1360060lUq Gp() {
        C1358560lSQ c1358560lSQJp = Jp();
        if (c1358560lSQJp != null) {
            return c1358560lSQJp.LLJ;
        }
        return null;
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol
    public final String LLLII() {
        return C694180RKu.LIZ(this);
    }

    public final boolean Vp() {
        Aweme awemeAN;
        IPanelUIAbility iPanelUIAbility = (IPanelUIAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IPanelUIAbility.class, null);
        String aid = (iPanelUIAbility == null || (awemeAN = iPanelUIAbility.aN()) == null) ? null : awemeAN.getAid();
        C724270Sb3 c724270Sb3 = this.LLJI;
        Aweme aweme = ((VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null)).getAweme();
        return Intrinsics.LJFF(aid, aweme != null ? aweme.getAid() : null);
    }

    @Override // com.ss.android.ugc.aweme.upvote.ability.IUpvoteGuideAbility
    public final boolean f51() {
        return LJJIJL().getVisibility() == 0;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem, com.bytedance.assem.arch.reused.ReusedAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        this.LLLILZLLLI = false;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    @Override // com.ss.android.ugc.feed.platform.componentmanager.FcpComponentProtocol
    public final View xb() {
        return LJJIJL();
    }

    public static final UpvotePublishVM pq(C736950SvV<C1358700lSe, UpvotePublishVM> c736950SvV) {
        return (UpvotePublishVM) c736950SvV.getValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Eo(View view) {
        C1359980lUi c1359980lUiQp = Qp();
        if (c1359980lUiQp != null) {
            c1359980lUiQp.LJIILL = new AwS635S0100000_21(this, 105);
        }
        C1359980lUi c1359980lUiQp2 = Qp();
        if (c1359980lUiQp2 != null) {
            AwS565S0100000_21 awS565S0100000_21 = new AwS565S0100000_21(this, 1067);
            c1359980lUiQp2.LJIILLIIL = awS565S0100000_21;
            C1359990lUj c1359990lUj = c1359980lUiQp2.LJII;
            if (c1359990lUj != null) {
                c1359990lUj.setOnFollowRepostShow(awS565S0100000_21);
            }
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void LJLIIIL(int i) {
        this.LLLLIIL = false;
        qq();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void LLLI(int i) {
        this.LLLLIIL = true;
        qq();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC1565640qqQ
    public final void eventInit(C0RD6 c0rd6) {
        if (((Boolean) C0BOU.LIZ.getValue()).booleanValue()) {
            c0rd6.LIZIZ("event_component_clickable", new AwS600S0100000_21(this, 188));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void iq(boolean r36) {
        /*
            Method dump skipped, instruction units count: 998
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.upvote.detail.whitebar.UpvoteVideoAssemNew.iq(boolean):void");
    }

    public final void jq(final int i) {
        Object obj;
        String str;
        String aid;
        String str2;
        boolean z = true;
        Ip().LLILZ.LIZIZ = true;
        C724270Sb3 c724270Sb3 = this.LLJI;
        String aid2 = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        ((ArrayList) C1360080lUs.LIZ).add(((VideoItemParams) obj).getAweme().getAid());
        final C1359980lUi c1359980lUiQp = Qp();
        if (c1359980lUiQp != null) {
            c1359980lUiQp.LIZIZ();
            UpvoteListViewModelNew upvoteListViewModelNew = c1359980lUiQp.LIZIZ;
            c1359980lUiQp.LJIIIZ = upvoteListViewModelNew.LLILZ;
            final UpvoteList value = upvoteListViewModelNew.LIZIZ().getValue();
            if (i == 1) {
                str = "publish";
            } else if (i != 2) {
                str = "unknown";
            } else {
                str = "remove";
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("binding aid: ");
            Aweme aweme = c1359980lUiQp.LIZIZ.LLILZIL;
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            sbLIZ.append(aid);
            sbLIZ.append(", set info white bar after ");
            sbLIZ.append(str);
            C429430Gsf.LIZ("RepostPublishMonitor", C2188811AlT.LIZIZ(sbLIZ));
            if (value == null || (value.total < 1 && value.upvotes.isEmpty())) {
                C429430Gsf.LIZ("RepostPublishMonitor", "data is empty, white bar gone.");
                C428890Grn c428890Grn = c1359980lUiQp.LJI;
                if (c428890Grn != null) {
                    C786410Ut5.R1(c428890Grn, 8);
                }
                C1359990lUj c1359990lUj = c1359980lUiQp.LJII;
                if (c1359990lUj != null) {
                    C786410Ut5.p1(c1359990lUj, 8);
                }
                C1359990lUj c1359990lUj2 = c1359980lUiQp.LJII;
                if (c1359990lUj2 != null) {
                    c1359990lUj2.LJIJ();
                    return;
                }
                return;
            }
            ArrayList arrayList = new ArrayList();
            if (c1359980lUiQp.LJIIIIZZ == 1) {
                arrayList.add(C420410Ge7.LIZIZ(c1359980lUiQp.LJFF));
                if (i == 1) {
                    if (C1359820lUS.LIZJ(value)) {
                        str2 = "Text";
                    } else {
                        str2 = "SelfReposted";
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("binding aid: ");
                    Aweme aweme2 = c1359980lUiQp.LIZIZ.LLILZIL;
                    if (aweme2 != null) {
                        aid2 = aweme2.getAid();
                    }
                    sbLIZ2.append(aid2);
                    sbLIZ2.append(", white bar translation anim: prevElementType=Entrance(QUICK_UPVOTE) -> curElementType=");
                    sbLIZ2.append(str2);
                    sbLIZ2.append("(SUMMARY_LINK), extendedTriggerHit=true");
                    C429430Gsf.LIZ("RepostPublishMonitor", C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
            final C259800zU c259800zU = new C259800zU();
            c259800zU.element = "";
            if (i == 1) {
                arrayList.add(C420410Ge7.LIZ(c1359980lUiQp.LJI, c1359980lUiQp.LJIILL));
                c259800zU.element = "publish";
            } else if (i == 2 && value.total < 1) {
                arrayList.add(C420410Ge7.LIZIZ(c1359980lUiQp.LJI));
                c259800zU.element = "delete";
            }
            if (!C07NU.LIZ() || value.total <= 1 || i != 1) {
                z = false;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            if (!z && (!C0RSD.LIZ() || value.total <= 1)) {
                animatorSet.playSequentially(arrayList);
            } else {
                C428890Grn c428890Grn2 = c1359980lUiQp.LJI;
                if (c428890Grn2 != null) {
                    C786410Ut5.R1(c428890Grn2, 0);
                }
                C1359990lUj c1359990lUj3 = c1359980lUiQp.LJII;
                if (c1359990lUj3 != null) {
                    C786410Ut5.p1(c1359990lUj3, 0);
                }
            }
            animatorSet.addListener(new Animator.AnimatorListener() { // from class: X.0lUk
                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animator) {
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    AbstractC420810Gel curView;
                    AbstractC420810Gel nextView;
                    Integer numValueOf;
                    int i2;
                    String str3;
                    String str4;
                    boolean z2;
                    Integer numValueOf2;
                    int i3;
                    String str5;
                    List<C1360050lUp> list;
                    String str6;
                    C428890Grn c428890Grn3;
                    C428890Grn c428890Grn4;
                    boolean zLJFF = C1359720lUI.LJFF(c1359980lUiQp.LIZIZ.LLILZIL);
                    if (C263730AVf.LIZ()) {
                        C1359990lUj c1359990lUj4 = c1359980lUiQp.LJII;
                        UpvoteStruct upvoteStruct = null;
                        C1360050lUp c1360050lUp = null;
                        UpvoteStruct upvoteStruct2 = null;
                        if (c1359990lUj4 != null) {
                            curView = c1359990lUj4.getCurView();
                        } else {
                            curView = null;
                        }
                        if ((curView instanceof C428890Grn) && (c428890Grn4 = (C428890Grn) curView) != null) {
                            c428890Grn4.setFifaEasterEgg(zLJFF);
                        }
                        C1359990lUj c1359990lUj5 = c1359980lUiQp.LJII;
                        if (c1359990lUj5 != null && c1359990lUj5.LLJJJ) {
                            nextView = c1359990lUj5.getNextView();
                        } else {
                            nextView = null;
                        }
                        if ((nextView instanceof C428890Grn) && (c428890Grn3 = (C428890Grn) nextView) != null) {
                            c428890Grn3.setFifaEasterEgg(zLJFF);
                        }
                        int i4 = 0;
                        if (i == 1) {
                            C1359990lUj c1359990lUj6 = c1359980lUiQp.LJII;
                            if (c1359990lUj6 != null) {
                                C786410Ut5.p1(c1359990lUj6, 0);
                            }
                            C1359980lUi c1359980lUi = c1359980lUiQp;
                            c1359980lUi.LJIIIIZZ = 3;
                            C1359990lUj c1359990lUj7 = c1359980lUi.LJII;
                            if (c1359990lUj7 != null) {
                                UpvoteList upvoteList = value;
                                Aweme aweme3 = c1359980lUi.LIZIZ.LLILZIL;
                                String str7 = c1359980lUi.LIZJ;
                                boolean zLJI = MethodIDManager.LJI(71967);
                                if (aweme3 == null) {
                                    if (zLJI) {
                                        MethodIDManager.LJ();
                                        return;
                                    }
                                    return;
                                }
                                c1359990lUj7.LLJJIJIL = null;
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("onPublish. data=");
                                List<C1360050lUp> list2 = c1359990lUj7.LLJILJILJ;
                                if (list2 != null) {
                                    numValueOf2 = Integer.valueOf(list2.size());
                                } else {
                                    numValueOf2 = null;
                                }
                                sbLIZ3.append(numValueOf2);
                                sbLIZ3.append(", cur=");
                                sbLIZ3.append(c1359990lUj7.LLJILLL);
                                sbLIZ3.append(", nex=");
                                sbLIZ3.append(c1359990lUj7.LLJJ);
                                C2188811AlT.LIZIZ(sbLIZ3);
                                UpvoteStruct upvoteStructLIZJ = C1358940lT2.LIZJ(upvoteList);
                                if (upvoteStructLIZJ == null) {
                                    if (!zLJI) {
                                        return;
                                    }
                                    MethodIDManager.LJ();
                                    return;
                                }
                                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                sbLIZ4.append("binding aid: ");
                                sbLIZ4.append(aweme3.getAid());
                                sbLIZ4.append(", on publish, publish from: ");
                                sbLIZ4.append(upvoteStructLIZJ.publishFrom);
                                C429430Gsf.LIZ("RepostPublishMonitor", C2188811AlT.LIZIZ(sbLIZ4));
                                PublishFrom publishFrom = upvoteStructLIZJ.publishFrom;
                                if (publishFrom == null) {
                                    i3 = -1;
                                } else {
                                    i3 = C1358890lSx.LIZ[publishFrom.ordinal()];
                                }
                                String str8 = "";
                                if (i3 != 1) {
                                    if (i3 != 2) {
                                        List<C1360050lUp> list3 = c1359990lUj7.LLJILJILJ;
                                        if (list3 != null && !list3.isEmpty()) {
                                            List<C1360050lUp> list4 = c1359990lUj7.LLJILJILJ;
                                            if (list4 != null) {
                                                for (C1360050lUp c1360050lUp2 : list4) {
                                                    if (c1360050lUp2.LJFF) {
                                                        if (!C1359820lUS.LIZ(c1360050lUp2.LIZ)) {
                                                            C1359990lUj.LIZ(c1360050lUp2, C1359990lUj.LJIIIZ(aweme3, str7));
                                                            List<C1360050lUp> list5 = c1359990lUj7.LLJILJILJ;
                                                            if (list5 != null) {
                                                                for (C1360050lUp c1360050lUp3 : list5) {
                                                                    if (!c1360050lUp3.LJFF && !c1360050lUp3.LJIIJ && c1360050lUp3.LIZLLL == 1) {
                                                                        c1360050lUp3.LIZLLL = 0;
                                                                    }
                                                                }
                                                            }
                                                            if (c1359990lUj7.LJIILIIL(c1359990lUj7.LLJILJILJ)) {
                                                                List<C1360050lUp> list6 = c1359990lUj7.LLJILJILJ;
                                                                if (list6 != null) {
                                                                    C1359990lUj.LJIIJ(C1359990lUj.LJIIIZ(aweme3, str7), c1360050lUp2.LIZIZ, list6);
                                                                }
                                                                c1359990lUj7.LJIIZILJ(c1360050lUp2, upvoteList, 1, C1359990lUj.LJIIIZ(aweme3, str7));
                                                                c1359990lUj7.LJIILL(c1360050lUp2);
                                                                List<C1360050lUp> list7 = c1359990lUj7.LLJILJILJ;
                                                                if (list7 != null) {
                                                                    c1360050lUp = (C1360050lUp) C13LP.LJJJLZIJ(c1359990lUj7.LLJILLL, list7);
                                                                }
                                                                c1359990lUj7.LJIILJJIL(c1360050lUp);
                                                                if (C07NU.LIZ() && !c1359990lUj7.LLJJI) {
                                                                    c1359990lUj7.LJIJJ();
                                                                }
                                                            } else if (C07NU.LIZ()) {
                                                                List<C1360050lUp> list8 = c1359990lUj7.LLJILJILJ;
                                                                if (list8 != null) {
                                                                    C1359990lUj.LJIIJ(C1359990lUj.LJIIIZ(aweme3, str7), c1360050lUp2.LIZIZ, list8);
                                                                }
                                                                List<C1360050lUp> list9 = c1359990lUj7.LLJILJILJ;
                                                                if (list9 != null) {
                                                                    Iterator<C1360050lUp> it2 = list9.iterator();
                                                                    int i5 = 0;
                                                                    while (true) {
                                                                        if (!it2.hasNext()) {
                                                                            break;
                                                                        }
                                                                        if (it2.next().LJFF) {
                                                                            if (i5 >= 0) {
                                                                                i4 = i5;
                                                                            }
                                                                        } else {
                                                                            i5++;
                                                                        }
                                                                    }
                                                                }
                                                                if (c1359990lUj7.LLJJI) {
                                                                    HandlerHook.viewRemoveCallbacks(c1359990lUj7, c1359990lUj7.LLJJJJ);
                                                                    c1359990lUj7.LJJI(i4, true);
                                                                } else {
                                                                    c1359990lUj7.LJJI(i4, true);
                                                                    c1359990lUj7.LLJJ = i4 + 1;
                                                                    HandlerHook.viewRemoveCallbacks(c1359990lUj7, c1359990lUj7.LLJJJJ);
                                                                    HandlerHook.viewPostDelay(c1359990lUj7, c1359990lUj7.LLJJJJ, 2000L);
                                                                }
                                                            } else {
                                                                C1360050lUp c1360050lUp4 = new C1360050lUp(new ArrayList(c1360050lUp2.LIZ), c1360050lUp2.LIZIZ, c1360050lUp2.LIZJ, c1360050lUp2.LIZLLL, c1360050lUp2.LJ, false, c1360050lUp2.LJI, c1360050lUp2.LJII, c1360050lUp2.LJIIIIZZ, c1360050lUp2.LJIIIZ, c1360050lUp2.LJIIJ);
                                                                List<C1360050lUp> list10 = c1359990lUj7.LLJILJILJ;
                                                                if (list10 != null) {
                                                                    ListProtector.add(list10, c1359990lUj7.LLJJ, c1360050lUp4);
                                                                }
                                                                c1359990lUj7.LJJ();
                                                            }
                                                        }
                                                    }
                                                }
                                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                            }
                                        } else {
                                            c1359990lUj7.LJIJJLI(upvoteList, aweme3, str7);
                                            c1359990lUj7.LJJI(c1359990lUj7.LLJJ, true);
                                            c1359990lUj7.LLJJ++;
                                        }
                                    } else {
                                        List<C1360050lUp> list11 = c1359990lUj7.LLJILJILJ;
                                        if (list11 != null && !list11.isEmpty()) {
                                            List<C1360050lUp> list12 = c1359990lUj7.LLJILJILJ;
                                            if (list12 != null) {
                                                for (C1360050lUp c1360050lUp5 : list12) {
                                                    if (c1360050lUp5.LJFF) {
                                                        C1359990lUj.LIZ(c1360050lUp5, 0);
                                                        Iterator<UpvoteStruct> it3 = upvoteList.upvotes.iterator();
                                                        while (true) {
                                                            if (!it3.hasNext()) {
                                                                break;
                                                            }
                                                            UpvoteStruct next = it3.next();
                                                            if (C10EU.LJIILLIIL(next.user)) {
                                                                upvoteStruct2 = next;
                                                                break;
                                                            }
                                                        }
                                                        UpvoteStruct upvoteStruct3 = upvoteStruct2;
                                                        if (upvoteStruct3 != null && (str6 = upvoteStruct3.text) != null) {
                                                            str8 = str6;
                                                        }
                                                        C1360050lUp c1360050lUpLJFF = C1359990lUj.LJFF(str8);
                                                        C1359990lUj.LJIIJJI(c1359990lUj7.LLJILJILJ);
                                                        C1359990lUj.LJIIL(c1359990lUj7.LLJILJILJ);
                                                        List<C1360050lUp> list13 = c1359990lUj7.LLJILJILJ;
                                                        if (list13 != null) {
                                                            ListProtector.add(list13, c1359990lUj7.LLJJ, c1360050lUpLJFF);
                                                        }
                                                        c1359990lUj7.LLIZLLLIL = true;
                                                        c1359990lUj7.LJJ();
                                                    }
                                                }
                                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                            }
                                        } else {
                                            c1359990lUj7.LJIJJLI(upvoteList, aweme3, str7);
                                            if (((Number) C263810AVn.LIZ.getValue()).intValue() == 1 && (list = c1359990lUj7.LLJILJILJ) != null) {
                                                Iterator<C1360050lUp> it4 = list.iterator();
                                                int i6 = 0;
                                                while (true) {
                                                    if (!it4.hasNext()) {
                                                        break;
                                                    }
                                                    C1360050lUp next2 = it4.next();
                                                    if (next2.LJ && C1359820lUS.LIZ(next2.LIZ) && C703302op.LIZ(next2.LIZJ)) {
                                                        if (i6 >= 0) {
                                                            c1359990lUj7.LLIZLLLIL = true;
                                                            c1359990lUj7.LLJJ = i6;
                                                        }
                                                    } else {
                                                        i6++;
                                                    }
                                                }
                                            }
                                            c1359990lUj7.LJJI(c1359990lUj7.LLJJ, true);
                                            c1359990lUj7.LLJJ++;
                                        }
                                    }
                                } else {
                                    Iterator<UpvoteStruct> it5 = upvoteList.upvotes.iterator();
                                    while (true) {
                                        if (!it5.hasNext()) {
                                            break;
                                        }
                                        UpvoteStruct next3 = it5.next();
                                        if (C10EU.LJIILLIIL(next3.user)) {
                                            upvoteStruct = next3;
                                            break;
                                        }
                                    }
                                    UpvoteStruct upvoteStruct4 = upvoteStruct;
                                    if (upvoteStruct4 != null && (str5 = upvoteStruct4.text) != null) {
                                        str8 = str5;
                                    }
                                    c1359990lUj7.LJIILLIIL(str8);
                                }
                                if (!zLJI) {
                                    return;
                                }
                                MethodIDManager.LJ();
                                return;
                            }
                            return;
                        }
                        C1359990lUj c1359990lUj8 = c1359980lUiQp.LJII;
                        if (c1359990lUj8 == null) {
                            return;
                        }
                        UpvoteList upvoteList2 = value;
                        c1359990lUj8.LLJJIJIL = null;
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("onRemove. data=");
                        List<C1360050lUp> list14 = c1359990lUj8.LLJILJILJ;
                        if (list14 != null) {
                            numValueOf = Integer.valueOf(list14.size());
                        } else {
                            numValueOf = null;
                        }
                        sbLIZ5.append(numValueOf);
                        sbLIZ5.append(", cur=");
                        sbLIZ5.append(c1359990lUj8.LLJILLL);
                        sbLIZ5.append(", nex=");
                        sbLIZ5.append(c1359990lUj8.LLJJ);
                        C2188811AlT.LIZIZ(sbLIZ5);
                        List<C1360050lUp> list15 = c1359990lUj8.LLJILJILJ;
                        if (list15 == null) {
                            return;
                        }
                        if (C1359820lUS.LIZIZ(upvoteList2) && !C1359820lUS.LIZJ(upvoteList2)) {
                            C1359990lUj.LJIIJJI(list15);
                            C1360050lUp c1360050lUp6 = (C1360050lUp) C13LP.LJJJLZIJ(0, list15);
                            if (c1360050lUp6 != null) {
                                c1360050lUp6.LJ = true;
                                c1360050lUp6.LIZLLL = C1359990lUj.LJIIIZ(c1359990lUj8.LLILZ, c1359990lUj8.LLILZIL);
                            }
                            if (((C1360050lUp) ListProtector.get(list15, c1359990lUj8.LLJILLL)).LJ) {
                                return;
                            }
                            c1359990lUj8.LJJ();
                            return;
                        }
                        C1360050lUp c1360050lUp7 = (C1360050lUp) C13LP.LJJJLZIJ(0, list15);
                        if (c1360050lUp7 == null) {
                            return;
                        }
                        C1359990lUj.LJIIJJI(list15);
                        if (list15.isEmpty()) {
                            i2 = 0;
                        } else {
                            i2 = 0;
                            for (C1360050lUp c1360050lUp8 : list15) {
                                if (c1360050lUp8.LJ && C703302op.LIZ(c1360050lUp8.LIZJ) && (i2 = i2 + 1) < 0) {
                                    C1697810uHb.LJIJ();
                                    throw null;
                                }
                            }
                        }
                        if (c1360050lUp7.LJFF && C1359820lUS.LIZ(c1360050lUp7.LIZ)) {
                            C19719612Di.LJJIIJ(c1360050lUp7.LIZ, AFwS229S0000000_2.get$arr$(StrategyCenter.ENABLE_SMART_SERVICE), true);
                            long j = c1360050lUp7.LIZIZ - 1;
                            c1360050lUp7.LIZIZ = j;
                            c1360050lUp7.LIZLLL = 1;
                            c1360050lUp7.LJIIIIZZ = false;
                            if (j == 1 && i2 == 1) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            c1360050lUp7.LJ = z2;
                        }
                        for (C1360050lUp c1360050lUp9 : list15) {
                            if (!c1360050lUp9.LJFF && !c1360050lUp9.LJIIJ && ((str4 = c1360050lUp9.LIZJ) == null || str4.length() == 0)) {
                                c1360050lUp9.LJ = false;
                            }
                        }
                        if (c1360050lUp7.LIZIZ == 1 && c1360050lUp7.LIZLLL == 1) {
                            for (C1360050lUp c1360050lUp10 : list15) {
                                if (!c1360050lUp10.LJFF && !c1360050lUp10.LJIIJ && (str3 = c1360050lUp10.LIZJ) != null && str3.length() != 0) {
                                    c1360050lUp10.LIZLLL = 1;
                                }
                            }
                        }
                        C1359990lUj.LJIIJ(c1360050lUp7.LIZLLL, c1360050lUp7.LIZIZ, list15);
                        if (!((C1360050lUp) ListProtector.get(list15, c1359990lUj8.LLJILLL)).LJ) {
                            c1359990lUj8.LJJ();
                            return;
                        } else {
                            if (!c1359990lUj8.LJIILIIL(list15)) {
                                return;
                            }
                            c1359990lUj8.LJIIZILJ(c1360050lUp7, upvoteList2, 2, 1);
                            c1359990lUj8.LJIILJJIL((C1360050lUp) ListProtector.get(list15, c1359990lUj8.LLJILLL));
                            return;
                        }
                    }
                    C428890Grn c428890Grn5 = c1359980lUiQp.LJI;
                    if (c428890Grn5 == null) {
                        return;
                    }
                    c428890Grn5.setFifaEasterEgg(zLJFF);
                    c1359980lUiQp.LIZ(value, i);
                    c1359980lUiQp.LJIIIIZZ = c428890Grn5.getWhiteBarStyle();
                    InterfaceC1360060lUq interfaceC1360060lUq = c1359980lUiQp.LJ;
                    if (interfaceC1360060lUq == null) {
                        return;
                    }
                    interfaceC1360060lUq.LIZ((String) c259800zU.element);
                }
            });
            animatorSet.addListener(new AAListenerS332S0100000_21(c1359980lUiQp, 57));
            c1359980lUiQp.LJIILJJIL = animatorSet;
            animatorSet.start();
        }
    }

    @Override // com.ss.android.ugc.aweme.upvote.ability.IUpvoteGuideAbility
    public final void mH(boolean z) {
        C1359980lUi c1359980lUiQp = Qp();
        if (c1359980lUiQp != null) {
            c1359980lUiQp.LJFF(z);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        String str;
        try {
            C1360090lUt c1360090lUt = this.LLLF;
            C1358560lSQ c1358560lSQJp = Jp();
            if (c1358560lSQJp != null) {
                str = c1358560lSQJp.LLIZ;
            } else {
                str = null;
            }
            c1360090lUt.LIZ = str;
            C736680Sv4.LJIIIIZZ(this, (VideoViewModel) this.LLJLLL.getValue(), new C2217381BqS() { // from class: X.0NzB
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C709790Rsn) obj).LLILLL;
                }
            }, null, AFwS305S0000000_21.get$arr$(81), 6);
            C736680Sv4.LJIIIIZZ(this, (VideoViewModel) this.LLJLLL.getValue(), new C2217381BqS() { // from class: X.0Nkw
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C709790Rsn) obj).LLILZ;
                }
            }, null, AFwS305S0000000_21.get$arr$(82), 6);
            C736680Sv4.LJIIIIZZ(this, Ep(), new C2217381BqS() { // from class: X.0RYx
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C697100RWa) obj).LLILLJJLI;
                }
            }, null, AFwS305S0000000_21.get$arr$(83), 6);
            HandlerHook.viewPost(view, new ARunnableS121S0100000_21(this, 90));
            HomeTabAbility homeTabAbility = (HomeTabAbility) this.LLLIIII.getValue();
            if (homeTabAbility != null) {
                homeTabAbility.ao((C1402270mav) this.LLLIIIIL.getValue());
            }
            vq();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS121S0100000_21(th, 91));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(com.ss.android.ugc.aweme.feed.model.VideoItemParams r19) {
        /*
            Method dump skipped, instruction units count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.upvote.detail.whitebar.UpvoteVideoAssemNew.up(java.lang.Object):void");
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void wq(java.lang.String r22) {
        /*
            Method dump skipped, instruction units count: 809
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.upvote.detail.whitebar.UpvoteVideoAssemNew.wq(java.lang.String):void");
    }

    public final void Bp(int i, EnumC609120Nuo enumC609120Nuo) {
        Object obj;
        Object obj2;
        Object obj3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        C724270Sb3 c724270Sb3 = this.LLJI;
        Object obj4 = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        sbLIZ.append(((VideoItemParams) obj).getAweme().getAid());
        sbLIZ.append(", changeContainerViewVisibility: ");
        sbLIZ.append(i);
        C429430Gsf.LIZ("RepostTagMonitor", C2188811AlT.LIZIZ(sbLIZ));
        C786410Ut5.LJLLLLLL(i, LJJIJL());
        boolean z = false;
        if (i == 0) {
            AssemViewModel assemViewModel = (AssemViewModel) this.LLJZ.getValue(this, LLLLJI[0]);
            C724270Sb3 c724270Sb32 = this.LLJI;
            if (c724270Sb32 != null) {
                obj3 = c724270Sb32.LL;
            } else {
                obj3 = null;
            }
            C570060MXk c570060MXk = new C570060MXk(((VideoItemParams) obj3).getAweme().getAid(), new C570110MXp(enumC609120Nuo));
            assemViewModel.getClass();
            assemViewModel.setState(new AwS588S0100000_9(c570060MXk, 649));
        } else {
            AssemViewModel assemViewModel2 = (AssemViewModel) this.LLJZ.getValue(this, LLLLJI[0]);
            C724270Sb3 c724270Sb33 = this.LLJI;
            if (c724270Sb33 != null) {
                obj2 = c724270Sb33.LL;
            } else {
                obj2 = null;
            }
            C570060MXk c570060MXk2 = new C570060MXk(((VideoItemParams) obj2).getAweme().getAid(), new InterfaceC609180Nuu() { // from class: X.0Nuv
            });
            assemViewModel2.getClass();
            assemViewModel2.setState(new AwS588S0100000_9(c570060MXk2, 649));
        }
        if (C298720BnK.LIZ()) {
            AssemViewModel assemViewModel3 = (AssemViewModel) this.LLLLJ.getValue(this, LLLLJI[3]);
            C724270Sb3 c724270Sb34 = this.LLJI;
            if (c724270Sb34 != null) {
                obj4 = c724270Sb34.LL;
            }
            String aid = ((VideoItemParams) obj4).getAweme().getAid();
            if (i == 0) {
                z = true;
            }
            assemViewModel3.getClass();
            assemViewModel3.setState(new C897010ZGx(aid, z));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
        this.LLLL = aweme;
        this.LLLLIILL = true;
        this.LLLLIIL = true;
        qq();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void T6(int i, Aweme aweme) {
        String aid;
        C1359980lUi c1359980lUiQp;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (!Intrinsics.LJFF(Fp().LLILZ, aid) && (c1359980lUiQp = Qp()) != null) {
            c1359980lUiQp.LJIIIZ = null;
            c1359980lUiQp.LJIIIIZZ = 0;
            C428890Grn c428890Grn = c1359980lUiQp.LJI;
            if (c428890Grn != null) {
                C786410Ut5.R1(c428890Grn, 8);
            }
            C420840Geo c420840Geo = c1359980lUiQp.LJFF;
            if (c420840Geo != null) {
                C786410Ut5.q1(c420840Geo);
            }
            C1359990lUj c1359990lUj = c1359980lUiQp.LJII;
            if (c1359990lUj != null) {
                C786410Ut5.p1(c1359990lUj, 8);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x01f4, code lost:
    
        if (r1.length() == 0) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dq(com.ss.android.ugc.aweme.feed.model.VideoItemParams r29, boolean r30) {
        /*
            Method dump skipped, instruction units count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.upvote.detail.whitebar.UpvoteVideoAssemNew.dq(com.ss.android.ugc.aweme.feed.model.VideoItemParams, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0077  */
    @Override // com.ss.android.ugc.aweme.upvote.ability.IUpvoteGuideAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Bf0(java.lang.String r5, java.lang.String r6, boolean r7) {
        /*
            r4 = this;
            int r2 = r5.hashCode()
            r0 = -1321449942(0xffffffffb13c462a, float:-2.7397484E-9)
            r1 = 1
            if (r2 == r0) goto L66
            r0 = 3321751(0x32af97, float:4.654765E-39)
            if (r2 == r0) goto L55
            r0 = 3327652(0x32c6a4, float:4.663034E-39)
            if (r2 != r0) goto L77
            java.lang.String r0 = "loop"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L77
            com.ss.android.ugc.aweme.upvote.detail.vm.RepostEventVMNew r0 = r4.Ip()
            X.0cFu r0 = r0.LLILZ
            r0.LJII = r1
        L24:
            boolean r0 = r4.aq()
            r3 = 0
            if (r0 == 0) goto L31
            r0 = 8
            r4.Bp(r0, r3)
        L30:
            return
        L31:
            com.ss.android.ugc.aweme.upvote.detail.UpvoteListViewModelNew r0 = r4.Fp()
            java.lang.String r2 = r0.LLILZ
            X.0Sb3 r0 = r4.LLJI
            if (r0 == 0) goto L53
            java.lang.Object r0 = r0.LL
        L3d:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
            if (r0 == 0) goto L49
            java.lang.String r3 = r0.getAid()
        L49:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r3)
            if (r0 == 0) goto L30
            r4.lq(r5, r7, r1)
            return
        L53:
            r0 = r3
            goto L3d
        L55:
            java.lang.String r0 = "like"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L77
            com.ss.android.ugc.aweme.upvote.detail.vm.RepostEventVMNew r0 = r4.Ip()
            X.0cFu r0 = r0.LLILZ
            r0.LJFF = r1
            goto L24
        L66:
            java.lang.String r0 = "oneLoop"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L77
            com.ss.android.ugc.aweme.upvote.detail.vm.RepostEventVMNew r0 = r4.Ip()
            X.0cFu r0 = r0.LLILZ
            r0.LJI = r1
            goto L24
        L77:
            com.ss.android.ugc.aweme.upvote.detail.vm.RepostEventVMNew r0 = r4.Ip()
            X.0cFu r0 = r0.LLILZ
            r0.LJIIIIZZ = r5
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.upvote.detail.whitebar.UpvoteVideoAssemNew.Bf0(java.lang.String, java.lang.String, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void fq(String str, boolean z, Function1<? super Boolean, Unit> function1) {
        Object obj;
        Object obj2;
        String str2;
        Object obj3;
        String uid;
        Object obj4;
        String string;
        String str3;
        Object obj5;
        String string2;
        Object obj6;
        RecReasonEntry recReasonTag;
        Object obj7;
        RecReasonsStruct recReasonsStruct;
        Object obj8;
        boolean z2;
        String strLLIFFJFJJ;
        double dDoubleValue;
        Object obj9;
        String tabName;
        Object obj10;
        Object obj11;
        Object obj12;
        String requestId;
        C2189821An6 c2189821An6;
        C0RFV c0rfv;
        Double d;
        Object obj13;
        User author;
        User author2;
        Ip().LLILZ.LIZIZ = true;
        C724270Sb3 c724270Sb3 = this.LLJI;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        ((ArrayList) C1360080lUs.LIZ).add(((VideoItemParams) obj).getAweme().getAid());
        C724270Sb3 c724270Sb32 = this.LLJI;
        if (c724270Sb32 != null) {
            obj2 = c724270Sb32.LL;
        } else {
            obj2 = null;
        }
        String str4 = ((VideoItemParams) obj2).mEventType;
        if (z) {
            str2 = "quick_repost";
        } else {
            str2 = "button";
        }
        C724270Sb3 c724270Sb33 = this.LLJI;
        if (c724270Sb33 != null) {
            obj3 = c724270Sb33.LL;
        } else {
            obj3 = null;
        }
        Aweme aweme = ((VideoItemParams) obj3).getAweme();
        String str5 = "";
        if (aweme == null || (author2 = aweme.getAuthor()) == null || (uid = author2.getUid()) == null) {
            uid = "";
        }
        C724270Sb3 c724270Sb34 = this.LLJI;
        if (c724270Sb34 != null) {
            obj4 = c724270Sb34.LL;
        } else {
            obj4 = null;
        }
        Aweme aweme2 = ((VideoItemParams) obj4).getAweme();
        if (aweme2 == null || (author = aweme2.getAuthor()) == null || (string = Integer.valueOf(author.getFollowStatus()).toString()) == null) {
            string = "";
        }
        if (z) {
            str3 = "normal";
        } else {
            str3 = Ip().LLILZ.LJIIJ;
        }
        String str6 = Ip().LLILZ.LJIIL;
        if (str6 == null) {
            str6 = "";
        }
        boolean z3 = Ip().LLILZ.LJIIJJI;
        C724270Sb3 c724270Sb35 = this.LLJI;
        if (c724270Sb35 != null) {
            obj5 = c724270Sb35.LL;
        } else {
            obj5 = null;
        }
        Aweme aweme3 = ((VideoItemParams) obj5).getAweme();
        if (aweme3 == null || (string2 = Integer.valueOf(aweme3.getAwemeType()).toString()) == null) {
            string2 = "";
        }
        C724270Sb3 c724270Sb36 = this.LLJI;
        if (c724270Sb36 != null) {
            obj6 = c724270Sb36.LL;
        } else {
            obj6 = null;
        }
        Aweme aweme4 = ((VideoItemParams) obj6).getAweme();
        if (aweme4 != null) {
            recReasonTag = aweme4.getRecReasonTag();
        } else {
            recReasonTag = null;
        }
        C724270Sb3 c724270Sb37 = this.LLJI;
        if (c724270Sb37 != null) {
            obj7 = c724270Sb37.LL;
        } else {
            obj7 = null;
        }
        Aweme aweme5 = ((VideoItemParams) obj7).getAweme();
        if (aweme5 != null) {
            recReasonsStruct = aweme5.getRecReasonsStruct();
        } else {
            recReasonsStruct = null;
        }
        C724270Sb3 c724270Sb38 = this.LLJI;
        if (c724270Sb38 != null) {
            obj8 = c724270Sb38.LL;
        } else {
            obj8 = null;
        }
        Aweme aweme6 = ((VideoItemParams) obj8).getAweme();
        if (aweme6 != null && C720360SNm.LJI(aweme6)) {
            z2 = true;
        } else {
            z2 = false;
        }
        String str7 = null;
        IPoiService iPoiService = (IPoiService) PluggableExtentionKt.pluggableSpi$default(IPoiService.class, false, false, false, 14, null);
        if (iPoiService != null) {
            C724270Sb3 c724270Sb39 = this.LLJI;
            if (c724270Sb39 != null) {
                obj13 = c724270Sb39.LL;
            } else {
                obj13 = null;
            }
            strLLIFFJFJJ = iPoiService.LLIFFJFJJ(((VideoItemParams) obj13).getAweme());
        } else {
            strLLIFFJFJJ = null;
        }
        if (!z && (c0rfv = (C0RFV) ((AssemViewModel) this.LLLIL.getValue()).getState()) != null && (d = c0rfv.LLJJIII) != null) {
            dDoubleValue = d.doubleValue();
        } else {
            dDoubleValue = 0.0d;
        }
        boolean z4 = !this.LLLLIL;
        C724270Sb3 c724270Sb310 = this.LLJI;
        if (c724270Sb310 != null) {
            obj9 = c724270Sb310.LL;
        } else {
            obj9 = null;
        }
        BaseFeedPageParams baseFeedPageParams = ((VideoItemParams) obj9).baseFeedPageParams;
        if (baseFeedPageParams == null || (c2189821An6 = baseFeedPageParams.param) == null || (tabName = c2189821An6.getTabName()) == null) {
            tabName = "";
        }
        C724270Sb3 c724270Sb311 = this.LLJI;
        if (c724270Sb311 != null) {
            obj10 = c724270Sb311.LL;
        } else {
            obj10 = null;
        }
        Aweme aweme7 = ((VideoItemParams) obj10).getAweme();
        if (aweme7 != null && (requestId = aweme7.getRequestId()) != null) {
            str5 = requestId;
        }
        UpvotePublishMobParam upvotePublishMobParam = new UpvotePublishMobParam(str4, str2, str, uid, string, str3, str7, z3, str6, string2, z2, recReasonTag, recReasonsStruct, null == true ? 1 : 0, strLLIFFJFJJ, dDoubleValue, z4, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, 0, null == true ? 1 : 0, null == true ? 1 : 0, tabName, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, str5, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, null == true ? 1 : 0, -1088486688, 65023);
        C724270Sb3 c724270Sb312 = this.LLJI;
        if (c724270Sb312 != null) {
            obj11 = c724270Sb312.LL;
        } else {
            obj11 = null;
        }
        Aweme aweme8 = ((VideoItemParams) obj11).getAweme();
        C724270Sb3 c724270Sb313 = this.LLJI;
        if (c724270Sb313 != null) {
            obj12 = c724270Sb313.LL;
        } else {
            obj12 = null;
        }
        UpvotePublishExtraData upvotePublishExtraData = new UpvotePublishExtraData(aweme8, ((VideoItemParams) obj12).mPageType);
        C1360460lVU.LIZIZ.LJJJ(null, null, null, upvotePublishExtraData, upvotePublishMobParam, 0, str, null, null, null, null, null, new AwS59S1300000_21(upvotePublishExtraData, upvotePublishMobParam, str, function1, 3), true);
        if (!Ip().LLILZ.LJIIJJI && !C287250BNr.LIZ()) {
            if (Ip().LLILZ.LIZLLL) {
                Ip().LLILZ.getClass();
                C1358720lSg.LIZ.getClass();
                C1358720lSg.LIZIZ().storeInt(C1358720lSg.LIZ("digg_not_upvote_time_"), 0);
                if (C287250BNr.LIZIZ() == 1) {
                    C1358720lSg.LIZIZ().erase(C1358720lSg.LIZ("recorded_times"));
                    C1358720lSg.LIZIZ().erase(C1358720lSg.LIZ("recorded_time_stamp"));
                    return;
                }
                return;
            }
            if (Ip().LLILZ.LIZJ) {
                Ip().LLILZ.getClass();
                C1358720lSg.LIZ.getClass();
                C1358720lSg.LIZIZ().storeInt(C1358720lSg.LIZ("video_loop_not_upvote_time_"), 0);
                if (C287250BNr.LIZIZ() != 1) {
                    return;
                }
                C1358720lSg.LIZIZ().erase(C1358720lSg.LIZ("recorded_times"));
                C1358720lSg.LIZIZ().erase(C1358720lSg.LIZ("recorded_time_stamp"));
                return;
            }
            Ip().LLILZ.getClass();
            C1358720lSg.LIZ.getClass();
            C1358720lSg.LIZIZ().storeInt(C1358720lSg.LIZ("share_or_comment_upvote_time_"), C1358720lSg.LIZIZ().getInt(C1358720lSg.LIZ("share_or_comment_upvote_time_"), 0) + 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void lq(java.lang.String r7, boolean r8, boolean r9) {
        /*
            Method dump skipped, instruction units count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.upvote.detail.whitebar.UpvoteVideoAssemNew.lq(java.lang.String, boolean, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01f7 A[PHI: r11
      0x01f7: PHI (r11v2 boolean) = (r11v1 boolean), (r11v4 boolean), (r11v4 boolean), (r11v4 boolean) binds: [B:107:0x01f3, B:72:0x0124, B:74:0x012a, B:75:0x012c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0120 A[PHI: r11
      0x0120: PHI (r11v4 boolean) = (r11v1 boolean), (r11v6 boolean) binds: [B:107:0x01f3, B:70:0x011f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.fragment.app.DialogFragment] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v4, types: [T, androidx.fragment.app.DialogFragment, com.bytedance.tux.sheet.BaseSheet, com.bytedance.tux.sheet.sheet.TuxSheet] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void kq(com.ss.android.ugc.aweme.upvote.detail.whitebar.UpvoteVideoAssemNew r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.Long r25, java.lang.String r26, java.lang.String r27, boolean r28, boolean r29, int r30) {
        /*
            Method dump skipped, instruction units count: 509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.upvote.detail.whitebar.UpvoteVideoAssemNew.kq(com.ss.android.ugc.aweme.upvote.detail.whitebar.UpvoteVideoAssemNew, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, boolean, boolean, int):void");
    }
}
