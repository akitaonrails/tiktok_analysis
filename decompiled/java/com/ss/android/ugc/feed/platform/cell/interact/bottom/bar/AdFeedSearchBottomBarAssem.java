package com.ss.android.ugc.feed.platform.cell.interact.bottom.bar;

import X.C019F;
import X.C01GW;
import X.C13IQ;
import X.C13LE;
import X.C1558520qew;
import X.C1637806bA;
import X.C19719912Dl;
import X.C1A5L;
import X.C2189821An6;
import X.C2217381BqS;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C687700QyG;
import X.C688170Qz1;
import X.C688180Qz2;
import X.C688190Qz3;
import X.C724270Sb3;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C786410Ut5;
import X.EnumC700430Rdh;
import X.InterfaceC1146704e9;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoPlayViewModel;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.search.CommentSuggestWordList;
import com.ss.android.ugc.aweme.feed.model.search.SuggestWordStruct;
import com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent;
import com.ss.android.ugc.feed.platform.container.scope.VideoCellScope;
import com.zhiliaoapp.musically.R;
import g1c.AjS21S0300000_10;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AFwS293S0000000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class AdFeedSearchBottomBarAssem extends BaseCellSlotComponent<AdFeedSearchBottomBarAssem> implements InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLI;
    public ViewGroup LLJLLIL;
    public View LLJLLL;
    public View LLJZ;
    public C688190Qz3 LLJZIJLIL = new C688190Qz3();
    public final InterfaceC1731706qJ LLL;
    public final C01GW LLLF;
    public final C01GW LLLFF;
    public String LLLFFI;
    public boolean LLLFZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AdFeedSearchBottomBarAssem.class, "videoSearchCacheVM", "getVideoSearchCacheVM()Lcom/ss/android/ugc/feed/platform/cell/interact/bottom/bar/VideoSearchCacheVM;", 0);
        C13LE.LIZ.getClass();
        LLLI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public AdFeedSearchBottomBarAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(VideoSearchCacheVM.class);
        this.LLL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 906), null, AFwS241S0000000_10.get$arr$(382));
        this.LLLF = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoViewModel.class), AFwS241S0000000_10.get$arr$(383));
        this.LLLFF = C737910Sx3.LIZJ(this, C13LE.LIZ(VideoPlayViewModel.class), AFwS241S0000000_10.get$arr$(384));
        this.LLLFFI = "";
    }

    public final void Ep() {
        this.LLLFZ = false;
        ViewGroup viewGroup = this.LLJLLIL;
        ViewParent parent = viewGroup != null ? viewGroup.getParent() : null;
        View view = parent instanceof View ? (View) parent : null;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        ViewGroup viewGroup2 = this.LLJLLIL;
        if (viewGroup2 != null) {
            C786410Ut5.LJLZ(8, viewGroup2);
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC691660RBc
    public final void J1(int i, Aweme aweme) {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.b4z;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{VideoCellScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(VideoCellScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.InterfaceC712990Rxx
    public final void unBind() {
    }

    public final VideoSearchCacheVM Bp() {
        return (VideoSearchCacheVM) this.LLL.getValue(this, LLLI[0]);
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
    }

    public final void Fp(VideoItemParams videoItemParams) {
        String tabName;
        Object parent;
        CommentSuggestWordList commentSuggestWordList;
        List<SuggestWordStruct> suggestWords;
        String scene;
        View view;
        C2189821An6 c2189821An6;
        int i = AdFeedSearchBottomBarAssemTrigger.LLJLIL;
        C688190Qz3 c688190Qz3LJ = C688180Qz2.LJ(videoItemParams);
        boolean zLIZIZ = C688180Qz2.LIZIZ(c688190Qz3LJ, videoItemParams.getAweme());
        BaseFeedPageParams baseFeedPageParams = videoItemParams.baseFeedPageParams;
        if (baseFeedPageParams == null || (c2189821An6 = baseFeedPageParams.param) == null || (tabName = c2189821An6.getTabName()) == null) {
            tabName = "";
        }
        this.LLLFFI = tabName;
        ViewGroup viewGroup = this.LLJLLIL;
        if (viewGroup != null) {
            if (zLIZIZ) {
                this.LLLFZ = true;
                C786410Ut5.LJLZ(0, viewGroup);
                ViewGroup viewGroup2 = this.LLJLLIL;
                if (viewGroup2 != null) {
                    parent = viewGroup2.getParent();
                } else {
                    parent = null;
                }
                if ((parent instanceof View) && (view = (View) parent) != null) {
                    C786410Ut5.LJLLLLLL(0, view);
                }
                TextView textView = (TextView) viewGroup.findViewById(R.id.ubf);
                if (textView != null && (commentSuggestWordList = videoItemParams.getAweme().getCommentSuggestWordList()) != null && (suggestWords = commentSuggestWordList.getSuggestWords()) != null) {
                    for (SuggestWordStruct suggestWordStruct : suggestWords) {
                        if (suggestWordStruct != null) {
                            scene = suggestWordStruct.getScene();
                        } else {
                            scene = null;
                        }
                        if (Intrinsics.LJFF(scene, "feed_bar")) {
                            textView.setText(new SpannableStringBuilder().append((CharSequence) suggestWordStruct.getHintText()).append((CharSequence) c688190Qz3LJ.LIZJ));
                        }
                    }
                }
                ViewGroup viewGroup3 = this.LLJLLIL;
                if (viewGroup3 != null) {
                    setComponentClickStatusExperimental(viewGroup3, EnumC700430Rdh.POSITIVE);
                }
                ViewGroup viewGroup4 = this.LLJLLIL;
                if (viewGroup4 != null) {
                    C786410Ut5.I7(new AjS21S0300000_10(this, videoItemParams, c688190Qz3LJ, 0), viewGroup4);
                    return;
                }
                return;
            }
            Ep();
        }
    }

    @Override // com.ss.android.ugc.feed.platform.cell.BaseCellSlotComponent, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJLLIL = (ViewGroup) view.findViewById(R.id.ht1);
        view.findViewById(R.id.ubf);
        this.LLJLLL = view.findViewById(R.id.ubg);
        this.LLJZ = view.findViewById(R.id.f812u71);
        C2271391DvN.LIZ(this.LLJLLIL, (C1A5L) C2271381DvM.LJL.getValue());
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLF.getValue(), new C2217381BqS() { // from class: X.0RmG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLL;
            }
        }, null, AFwS293S0000000_10.get$arr$(34), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLF.getValue(), new C2217381BqS() { // from class: X.0RmH
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILZ;
            }
        }, null, AFwS293S0000000_10.get$arr$(35), 6);
        C736680Sv4.LJIIIIZZ(this, (AssemViewModel) this.LLLFF.getValue(), new C2217381BqS() { // from class: X.0RmF
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0RFV) obj).LLJJIJI;
            }
        }, C736820SvI.LJ(), AFwS293S0000000_10.get$arr$(36), 4);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(VideoItemParams videoItemParams) {
        Object obj;
        Object obj2;
        String aid;
        String aid2;
        VideoItemParams videoItemParams2 = videoItemParams;
        VideoSearchCacheVM videoSearchCacheVMBp = Bp();
        C724270Sb3 c724270Sb3 = this.LLJI;
        Object obj3 = null;
        if (c724270Sb3 != null) {
            obj = c724270Sb3.LL;
        } else {
            obj = null;
        }
        C688190Qz3 c688190Qz3VQ2 = videoSearchCacheVMBp.vQ2(((VideoItemParams) obj).getAweme().getAid());
        String str = "";
        if (c688190Qz3VQ2 != null) {
            if (!Intrinsics.LJFF(c688190Qz3VQ2.LIZIZ(), c688190Qz3VQ2.LIZJ)) {
                c688190Qz3VQ2.LIZLLL(0);
                VideoSearchCacheVM videoSearchCacheVMBp2 = Bp();
                C724270Sb3 c724270Sb32 = this.LLJI;
                if (c724270Sb32 != null) {
                    obj3 = c724270Sb32.LL;
                }
                Aweme aweme = ((VideoItemParams) obj3).getAweme();
                if (aweme != null && (aid2 = aweme.getAid()) != null) {
                    str = aid2;
                }
                videoSearchCacheVMBp2.xQ2(str, c688190Qz3VQ2);
            }
            this.LLJZIJLIL = c688190Qz3VQ2;
        } else {
            C688170Qz1 c688170Qz1 = FeedSearchBottomBarAssemTrigger.LLJLLIL;
            C724270Sb3 c724270Sb33 = this.LLJI;
            if (c724270Sb33 != null) {
                obj2 = c724270Sb33.LL;
            } else {
                obj2 = null;
            }
            c688170Qz1.getClass();
            this.LLJZIJLIL = C688170Qz1.LIZ(0, ((VideoItemParams) obj2).getAweme());
            VideoSearchCacheVM videoSearchCacheVMBp3 = Bp();
            C724270Sb3 c724270Sb34 = this.LLJI;
            if (c724270Sb34 != null) {
                obj3 = c724270Sb34.LL;
            }
            Aweme aweme2 = ((VideoItemParams) obj3).getAweme();
            if (aweme2 != null && (aid = aweme2.getAid()) != null) {
                str = aid;
            }
            videoSearchCacheVMBp3.xQ2(str, this.LLJZIJLIL);
        }
        int i = AdFeedSearchBottomBarAssemTrigger.LLJLIL;
        if (C688180Qz2.LIZLLL(videoItemParams2.getAweme())) {
            Fp(videoItemParams2);
        } else {
            Ep();
        }
    }
}
