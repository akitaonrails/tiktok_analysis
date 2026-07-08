package com.ss.android.ugc.aweme.story.feed.immersive.component;

import X.C01GW;
import X.C098200Yq;
import X.C0HTT;
import X.C0M9T;
import X.C0RF0;
import X.C0RSY;
import X.C0SED;
import X.C0SEI;
import X.C1189504l3;
import X.C11JF;
import X.C1210880hcE;
import X.C1246100iX2;
import X.C1308910kAL;
import X.C13BV;
import X.C13LE;
import X.C1440005kM;
import X.C14EU;
import X.C15438062q;
import X.C1558520qew;
import X.C1637806bA;
import X.C1701940uOG;
import X.C189200o6;
import X.C19719912Dl;
import X.C2177241AIw;
import X.C2177251AIx;
import X.C2189821An6;
import X.C2217381BqS;
import X.C298450Bmt;
import X.C330500CxU;
import X.C330530CxX;
import X.C330660Cxk;
import X.C330770Cxv;
import X.C331380Cyu;
import X.C339190DRl;
import X.C418440Gaw;
import X.C444960Hcc;
import X.C452501pT;
import X.C628500Oky;
import X.C630740Ooa;
import X.C693050RGl;
import X.C706480RnS;
import X.C718010SEl;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C729510SjV;
import X.C729980SkG;
import X.C730150SkX;
import X.C736680Sv4;
import X.C737030Svd;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC712090RwV;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC665370Q7z;
import Y.AfS147S0200000_11;
import android.content.Context;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.collection.collection.ability.IAdapterAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.friends.model.MutualUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.ability.StoryViewerEntranceBridgeAbility;
import com.ss.android.ugc.aweme.story.feed.immersive.vm.StoryViewerEntranceViewModel;
import com.ss.android.ugc.aweme.story.note.StoryNoteStatusChangeCallback;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AFwS294S0000000_11;
import kotlin.jvm.internal.AwS140S0400000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import wh6.AbS693S0100000_11;

/* JADX INFO: loaded from: classes12.dex */
public class StoryViewerEntranceComponent extends BaseCellSlotComponent<StoryViewerEntranceComponent> implements StoryViewerEntranceBridgeAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIIL;
    public TuxTextView LLJLLIL;
    public TuxIconView LLJLLL;
    public SmartImageView LLJZ;
    public ConstraintLayout LLJZIJLIL;
    public C330660Cxk LLL;
    public C11JF LLLF;
    public final C01GW LLLFF = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS243S0000000_11.get$arr$(391));
    public final InterfaceC1731706qJ LLLFFI;
    public final C630740Ooa LLLFZ;
    public final C630740Ooa LLLI;
    public final C630740Ooa LLLII;
    public final C01GW LLLIIII;
    public String LLLIIIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(StoryViewerEntranceComponent.class, "viewerEntranceVM", "getViewerEntranceVM()Lcom/ss/android/ugc/aweme/story/feed/immersive/vm/StoryViewerEntranceViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLIIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public StoryViewerEntranceComponent() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(StoryViewerEntranceViewModel.class);
        this.LLLFFI = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), null, C1637806bA.LIZ, new AwS555S0100000_11(c19719912DlLIZ, 729), null, AFwS243S0000000_11.get$arr$(390));
        this.LLLFZ = C628500Oky.LIZ(new AwS555S0100000_11(this, 730));
        this.LLLI = C628500Oky.LIZ(new AwS555S0100000_11(this, 731));
        this.LLLII = C628500Oky.LIZ(new AwS555S0100000_11(this, 727));
        this.LLLIIII = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(170));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fdh;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Co() {
        C706480RnS c706480RnS = C706480RnS.LIZ;
        AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(this, 728);
        c706480RnS.getClass();
        C706480RnS.LJII(this, "story_layout_viewer_entrance", true, awS555S0100000_11);
    }

    public final StoryViewerEntranceViewModel Fp() {
        return (StoryViewerEntranceViewModel) this.LLLFFI.getValue(this, LLLIIIL[0]);
    }

    public final void Ip() {
        Aweme aweme;
        Context context;
        C724270Sb3 c724270Sb3 = this.LLJI;
        VideoItemParams videoItemParams = (VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null);
        if (videoItemParams == null || (aweme = videoItemParams.getAweme()) == null || (context = getContext()) == null || !C0M9T.LIZ().enableViewerInsightOverlay || !C729980SkG.LJIIIIZZ(aweme)) {
            return;
        }
        C718010SEl c718010SEl = C718010SEl.LIZ;
        String aid = aweme.getAid();
        c718010SEl.getClass();
        String str = C718010SEl.LIZJ;
        if (str == null || !Intrinsics.LJFF(str, aid)) {
            return;
        }
        C718010SEl.LIZJ = null;
        BN(context, "top_cell_viewlist_hint", null);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        C11JF c11jf = this.LLLF;
        if (c11jf != null) {
            c11jf.dispose();
        }
        EventBus.LIZLLL().LJJI(this);
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLLII.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJIIJJI(interfaceC665370Q7z, StoryViewerEntranceBridgeAbility.class, null);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void ep() {
        Aweme aweme;
        C724270Sb3 c724270Sb3 = this.LLJI;
        VideoItemParams videoItemParams = (VideoItemParams) (c724270Sb3 != null ? c724270Sb3.LL : null);
        if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null && aweme.getAid() != null) {
            StoryViewerEntranceViewModel storyViewerEntranceViewModelFp = Fp();
            C724270Sb3 c724270Sb32 = this.LLJI;
            storyViewerEntranceViewModelFp.zQ2(((VideoItemParams) (c724270Sb32 != null ? c724270Sb32.LL : null)).getAweme());
        }
        Ip();
    }

    public final void Ep() {
        if (LJJIJL().getVisibility() == 0) {
            return;
        }
        C786410Ut5.T4(LJJIJL(), 0.0f);
        C339190DRl.LIZLLL(LJJIJL());
        LJJIJL().animate().alpha(1.0f).setDuration(150L).setInterpolator(new LinearInterpolator()).start();
    }

    public final boolean K22() {
        BaseFeedPageParams baseFeedPageParams;
        C2189821An6 c2189821An6;
        String from;
        C0RF0 c0rf0 = jm().LIZLLL;
        if (c0rf0 == null || (baseFeedPageParams = c0rf0.LJ) == null || (c2189821An6 = baseFeedPageParams.param) == null || (from = c2189821An6.getFrom()) == null || Intrinsics.LJFF(from, "STORY_ENTRANCE_DEFAULT")) {
            return true;
        }
        return Intrinsics.LJFF(from, "STORY_ENTRANCE_ARCHIVE") && !C1189504l3.LIZ();
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void mo() {
        try {
            C339190DRl.LIZLLL(LJJIJL());
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        InterfaceC665370Q7z interfaceC665370Q7z = (InterfaceC665370Q7z) this.LLLII.getValue();
        if (interfaceC665370Q7z != null) {
            C1558520qew.LJII(interfaceC665370Q7z, this, StoryViewerEntranceBridgeAbility.class, null, null);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUISlotAssem, com.bytedance.assem.arch.reused.ReusedAssem
    public final void oo() {
        try {
            C339190DRl.LIZIZ(LJJIJL());
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void Gp(int i) {
        Integer numLIZJ;
        TuxTextView tuxTextView = this.LLJLLIL;
        if (tuxTextView != null && (numLIZJ = C1308910kAL.LIZJ(i, tuxTextView.getContext())) != null) {
            tuxTextView.setTextColor(numLIZJ.intValue());
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJLLIL = (TuxTextView) view.findViewById(R.id.tv_viewer_count);
        this.LLJLLL = (TuxIconView) view.findViewById(R.id.jx_);
        this.LLJZ = (SmartImageView) view.findViewById(R.id.view_entrance_avatar_view);
        this.LLJZIJLIL = (ConstraintLayout) view.findViewById(R.id.dvq);
        C786410Ut5.I7(new AbS693S0100000_11(this, 13, 42), view);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLFF.getValue(), new C2217381BqS() { // from class: X.0S8Z
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLJJIJIL;
            }
        }, null, AFwS294S0000000_11.get$arr$(124), 6);
        C330530CxX c330530CxX = C330530CxX.LIZJ;
        hashCode();
        C330500CxU.LIZ();
        C736680Sv4.LJIIIIZZ(this, Fp(), new C2217381BqS() { // from class: X.0SEF
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C331380Cyu) obj).LL;
            }
        }, null, AFwS294S0000000_11.get$arr$(125), 6);
        EventBus.LIZLLL().LJIJJ(this);
    }

    @C14EU
    public final void onViewerListAwemeDeleted(C1210880hcE c1210880hcE) {
        Aweme aweme;
        String str;
        Object obj;
        C0HTT<C737030Svd> c0htt;
        if (!Intrinsics.LJFF(c1210880hcE.LIZIZ, "story_views_list_panel") || (aweme = c1210880hcE.LIZ) == null) {
            return;
        }
        if (C729510SjV.LJJIIZI(aweme)) {
            ((StoryNoteStatusChangeCallback) this.LLLIIII.getValue()).onStoryNoteDelete();
        }
        C0RF0 c0rf0 = jm().LIZLLL;
        Object obj2 = null;
        if (c0rf0 != null) {
            str = c0rf0.LJIIIZ;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, "story_archive")) {
            String aid = aweme.getAid();
            C724270Sb3 c724270Sb3 = this.LLJI;
            if (c724270Sb3 != null) {
                obj = c724270Sb3.LL;
            } else {
                obj = null;
            }
            if (Intrinsics.LJFF(aid, ((VideoItemParams) obj).getAweme().getAid())) {
                C0RF0 c0rf02 = jm().LIZLLL;
                if (c0rf02 != null && (c0htt = c0rf02.LIZIZ) != null) {
                    c0htt.LLIIL(new C737030Svd(60, new C0RSY(EnumC712090RwV.DELETE_ITEM, new C693050RGl(aweme, -1))));
                    return;
                }
                return;
            }
        }
        IAdapterAbility iAdapterAbility = (IAdapterAbility) this.LLLI.getValue();
        if (iAdapterAbility != null) {
            C724270Sb3 c724270Sb32 = this.LLJI;
            if (c724270Sb32 != null) {
                obj2 = c724270Sb32.LL;
            }
            String aid2 = aweme.getAid();
            if (aid2 == null) {
                aid2 = "";
            }
            iAdapterAbility.jd2(aid2);
        }
        C1440005kM.LIZ(new C737030Svd(2, aweme.getAid()));
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent
    /* JADX INFO: renamed from: op */
    public final boolean ur(VideoItemParams videoItemParams) {
        return C729980SkG.LJIIIIZZ(videoItemParams.getAweme());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void tp(VideoItemParams videoItemParams) {
        VideoItemParams videoItemParams2 = videoItemParams;
        if (!Intrinsics.LJFF(videoItemParams2.getAweme().getAid(), this.LLLIIIIL)) {
            String aid = videoItemParams2.getAweme().getAid();
            if (aid != null) {
                StoryViewerEntranceViewModel storyViewerEntranceViewModelFp = Fp();
                Aweme aweme = videoItemParams2.getAweme();
                storyViewerEntranceViewModelFp.getClass();
                C0SED c0sedWQ2 = StoryViewerEntranceViewModel.wQ2(aweme);
                String str = c0sedWQ2.LIZ;
                if (str != null) {
                    Jp(str, c0sedWQ2.LIZIZ, videoItemParams2.getAweme(), Long.valueOf(c0sedWQ2.LIZJ), c0sedWQ2.LIZLLL);
                } else {
                    Jp(aid, C13BV.INSTANCE, videoItemParams2.getAweme(), null, null);
                }
            }
            this.LLLIIIIL = videoItemParams2.getAweme().getAid();
            StoryViewerEntranceViewModel storyViewerEntranceViewModelFp2 = Fp();
            C331380Cyu c331380Cyu = (C331380Cyu) Fp().getState();
            storyViewerEntranceViewModelFp2.getClass();
            StoryViewerEntranceViewModel.yQ2(c331380Cyu, videoItemParams2);
            Fp().vQ2((C331380Cyu) Fp().getState(), videoItemParams2);
            Ip();
            Intrinsics.LJFF(this.LLLIIIIL, null);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(Object obj) {
        return ur((VideoItemParams) obj);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(39:0|2|(1:4)(1:70)|5|(35:7|(0)(1:15)|16|(2:18|(1:67)(1:22))|(1:24)|25|(1:27)(1:66)|28|(3:32|(1:34)(2:63|(0))|35)(0)|36|(25:38|(0)|41|(1:61)(1:45)|46|(5:50|(1:54)|55|(1:57)(1:60)|58)|59|119|71|74|(4:76|(1:78)(1:118)|79|(1:81))|82|(1:84)(1:117)|85|(1:87)(1:116)|88|(1:115)(1:92)|93|(1:95)|96|(1:98)|99|(5:101|(1:103)|104|(1:106)(1:114)|107)|108|(1:122)(2:112|113))(1:62)|40|41|(2:43|61)(0)|46|(3:48|50|(5:52|54|55|(0)(0)|58)(0))(0)|59|119|71|74|(0)|82|(0)(0)|85|(0)(0)|88|(2:90|115)(0)|93|(0)|96|(0)|99|(0)|108|(2:110|122)(1:121))(1:68)|69|16|(0)|(0)|25|(0)(0)|28|(4:30|32|(0)(0)|35)(0)|36|(0)(0)|40|41|(0)(0)|46|(0)(0)|59|119|71|74|(0)|82|(0)(0)|85|(0)(0)|88|(0)(0)|93|(0)|96|(0)|99|(0)|108|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0161, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0162, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r9);
        X.C189200o6.m2constructorimpl(new X.C098200Yq(r9));
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013e A[PHI: r12
      0x013e: PHI (r12v3 java.lang.String) = (r12v0 java.lang.String), (r12v4 java.lang.String) binds: [B:33:0x0077, B:31:0x0074] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f5  */
    /* JADX WARN: Type inference failed for: r0v12, types: [X.0SEE] */
    @Override // com.ss.android.ugc.aweme.story.ability.StoryViewerEntranceBridgeAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void BN(android.content.Context r22, java.lang.String r23, X.C330660Cxk r24) {
        /*
            Method dump skipped, instruction units count: 619
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.immersive.component.StoryViewerEntranceComponent.BN(android.content.Context, java.lang.String, X.0Cxk):void");
    }

    public final void Jp(String str, List<? extends User> list, Aweme aweme, Long l, Long l2) {
        Object obj;
        C11JF c11jf;
        if (str == null) {
            return;
        }
        C330770Cxv.LIZ.getClass();
        C0SEI c0seiLIZIZ = C330770Cxv.LIZIZ(aweme);
        List<? extends User> listSubList = list.subList(0, Math.min(list.size(), 3));
        AwS140S0400000_11 awS140S0400000_11 = new AwS140S0400000_11(this, l2, c0seiLIZIZ, l, 5);
        C724270Sb3 c724270Sb3 = this.LLJI;
        Object obj2 = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        if (Intrinsics.LJFF(str, ((VideoItemParams) obj).getAweme().getAid())) {
            if (listSubList != null && !listSubList.isEmpty()) {
                int size = listSubList.size();
                C724270Sb3 c724270Sb32 = this.LLJI;
                if (c724270Sb32 != null) {
                    obj2 = c724270Sb32.LL;
                }
                Aweme aweme2 = ((VideoItemParams) obj2).getAweme();
                if (!C298450Bmt.LIZ() || !C730150SkX.LIZIZ(aweme2) || size >= 3) {
                    Context context = getContext();
                    if (context == null) {
                        return;
                    }
                    C11JF c11jf2 = this.LLLF;
                    if (c11jf2 != null && !c11jf2.isDisposed() && (c11jf = this.LLLF) != null) {
                        c11jf.dispose();
                    }
                    int size2 = listSubList.size();
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listSubList, 10));
                    for (User user : listSubList) {
                        arrayList.add(new MutualUser(user.getSecUid(), user.getNickname(), user.getAvatarMedium(), user.getAvatarThumb(), user.getUid(), null));
                    }
                    this.LLLF = (C11JF) new C2177241AIw(context, C1246100iX2.LIZ(new MutualStruct(0, size2, arrayList, 0)), new C2177251AIx(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), null, 0, 3, 0.8f, 0.0f, 0, 0, Boolean.valueOf(C444960Hcc.LIZIZ()), null, true, true, false, null, 104252)).LIZLLL().LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS147S0200000_11(awS140S0400000_11, this, 0));
                    return;
                }
            }
            SmartImageView smartImageView = this.LLJZ;
            if (smartImageView != null) {
                C339190DRl.LIZIZ(smartImageView);
            }
            awS140S0400000_11.invoke();
            Ep();
        }
    }
}
