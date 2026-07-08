package com.ss.android.ugc.aweme.story.feed.immersive.gallery;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C0I0B;
import X.C0RHP;
import X.C0ZE7;
import X.C0ZE8;
import X.C13LE;
import X.C1606750ruj;
import X.C1606770rul;
import X.C1607280rva;
import X.C1607300rvc;
import X.C1607310rvd;
import X.C1608750rxx;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C727350Sg1;
import X.C728910SiX;
import X.C729510SjV;
import X.C730090SkR;
import X.C730130SkV;
import X.C735840Sti;
import X.C737740Swm;
import X.C737760Swo;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C897370ZIh;
import X.EnumC1606080rte;
import X.EnumC1910440zoY;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC897380ZIi;
import Y.ACListenerS146S0100000_11;
import android.content.Context;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.aweme.story.model.StoryInteraction;
import com.ss.android.ugc.aweme.story.model.StoryInteractionUser;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS412S0200000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.AwS625S0100000_11;
import kotlin.jvm.internal.AwS62S1000000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class StoryViewerCell extends PowerCell<C730130SkV> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public AvatarComponentView LL;
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;
    public RelationButton LLILZ;
    public final AssemVMLazy LLILZIL;
    public boolean LLILZLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(StoryViewerCell.class, "viewerListVM", "getViewerListVM()Lcom/ss/android/ugc/aweme/story/feed/immersive/gallery/StoryViewerListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.fc2;
    }

    public StoryViewerCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(StoryViewerListViewModel.class);
        AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(c19719912DlLIZ, 864);
        AFwS243S0000000_11 aFwS243S0000000_11 = AFwS243S0000000_11.get$arr$(455);
        if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS555S0100000_11(c19719912DlLIZ, 849), awS555S0100000_11, AFwS198S0000000_11.get$arr$(187), new AwS555S0100000_11((C03K6) this, 850), new AwS555S0100000_11((C03K6) this, 852), new AwS555S0100000_11((HasDefaultViewModelProviderFactory) this, 854), aFwS243S0000000_11, new AwS555S0100000_11((C03K6) this, 856), null, new AwS555S0100000_11((C03K6) this, 857));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS555S0100000_11 awS555S0100000_112 = new AwS555S0100000_11((C03K6) this, 851);
            AwS555S0100000_11 awS555S0100000_113 = new AwS555S0100000_11((HasDefaultViewModelProviderFactory) this, 853);
            AwS555S0100000_11 awS555S0100000_114 = new AwS555S0100000_11(c19719912DlLIZ, 855);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS412S0200000_11((InterfaceC451590HnJ) obj, awS555S0100000_112, 30));
            AwS555S0100000_11 awS555S0100000_115 = new AwS555S0100000_11(c01gwLIZIZ, 858);
            AwS555S0100000_11 awS555S0100000_116 = new AwS555S0100000_11(c01gwLIZIZ, 859);
            AwS555S0100000_11 awS555S0100000_117 = new AwS555S0100000_11(c01gwLIZIZ, 860);
            AwS555S0100000_11 awS555S0100000_118 = new AwS555S0100000_11(c01gwLIZIZ, 861);
            AwS555S0100000_11 awS555S0100000_119 = new AwS555S0100000_11(c01gwLIZIZ, 862);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS555S0100000_114, awS555S0100000_11, new C452080Ho6(), awS555S0100000_115, awS555S0100000_116, awS555S0100000_113, aFwS243S0000000_11, awS555S0100000_117, awS555S0100000_118, awS555S0100000_119);
        } else if (Intrinsics.LJFF(obj, C019F.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS555S0100000_11(c19719912DlLIZ, 863), awS555S0100000_11, AFwS198S0000000_11.get$arr$(188), new AwS555S0100000_11((C03K6) this, 865), new AwS555S0100000_11((C03K6) this, 866), new AwS555S0100000_11((HasDefaultViewModelProviderFactory) this, 867), aFwS243S0000000_11, new AwS555S0100000_11((C03K6) this, 868), null, new AwS555S0100000_11((C03K6) this, 869));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS555S0100000_11(c19719912DlLIZ, 870), awS555S0100000_11, AFwS198S0000000_11.get$arr$(189), new AwS555S0100000_11((C03K6) this, 843), new AwS555S0100000_11((C03K6) this, 844), new AwS555S0100000_11((C03K6) this, 845), aFwS243S0000000_11, null, null, new AwS555S0100000_11((C03K6) this, 847));
        }
        this.LLILZIL = assemVMLazy;
    }

    public final StoryViewerListViewModel L5() {
        AssemVMLazy assemVMLazy = this.LLILZIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLIZ;
        return (StoryViewerListViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        String str;
        super.onItemViewCreated();
        C727350Sg1 c727350Sg1 = L5().LLILLL;
        if (c727350Sg1 == null || (str = c727350Sg1.feedEnterFrom) == null) {
            str = "";
        }
        AvatarComponentView avatarComponentView = (AvatarComponentView) this.itemView.findViewById(R.id.bkz);
        if (avatarComponentView != null) {
            C1608750rxx config = avatarComponentView.getConfig();
            new AwS590S0100000_11(this, 244).invoke(config.LIZ);
            C0ZE7 c0ze7 = new C0ZE7(getCurrentLifecycleOwner());
            c0ze7.LJFF = "profile";
            c0ze7.LIZIZ(EnumC1910440zoY.STORY_VIEW_LIST);
            config.LIZLLL(new C737760Swo(new C1606750ruj(EnumC1606080rte.STORY_VIEWS_LIST_PANEL, new C1606770rul(null, null, null, new AwS625S0100000_11(this, 66), new AwS555S0100000_11(this, 846), new AwS555S0100000_11(this, 848), null, null, null, 455), 4)), new C1607280rva(new C1607310rvd(null, c0ze7, false, false, L5().LLILLJJLI, 111)), new C737740Swm(0));
            new AwS62S1000000_11(str, 3).invoke(config.LIZJ);
            avatarComponentView.LJFF(avatarComponentView.getConfig());
        } else {
            avatarComponentView = null;
        }
        this.LL = avatarComponentView;
        this.LLILLJJLI = (TuxTextView) this.itemView.findViewById(R.id.p0w);
        this.LLILLL = (TuxTextView) this.itemView.findViewById(R.id.foa);
        this.LLILZ = (RelationButton) this.itemView.findViewById(R.id.t4l);
        C786410Ut5.I7(new ACListenerS146S0100000_11(this, 32), this.itemView);
    }

    public final void I5(StoryInteraction storyInteraction) {
        long j;
        int i;
        if (storyInteraction != null) {
            j = storyInteraction.flipCount;
        } else {
            j = 0;
        }
        boolean z = false;
        if (storyInteraction != null) {
            i = storyInteraction.type;
        } else {
            i = 0;
        }
        if (storyInteraction != null && storyInteraction.isUnlockedReveal()) {
            z = true;
        }
        if (z) {
            TuxTextView tuxTextView = this.LLILLL;
            if (tuxTextView != null) {
                tuxTextView.setTextColorRes(R.attr.a1k);
                return;
            }
            return;
        }
        if (j <= 0 && i == 1) {
            TuxTextView tuxTextView2 = this.LLILLL;
            if (tuxTextView2 == null) {
                return;
            }
            tuxTextView2.setTextColorRes(R.attr.a1h);
            return;
        }
        TuxTextView tuxTextView3 = this.LLILLL;
        if (tuxTextView3 == null) {
            return;
        }
        tuxTextView3.setTextColorRes(R.attr.a1k);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00fa  */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r19) {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryViewerCell.onBindItemView(X.0zJl):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void N5(Context context, String str) {
        StoryInteractionUser storyInteractionUser;
        User user;
        Boolean boolValueOf;
        Aweme aweme;
        String str2;
        String aid;
        String authorUid;
        String str3;
        int i;
        String str4;
        String str5;
        String str6;
        C730130SkV item = getItem();
        if (item != null && (storyInteractionUser = item.LL) != null && (user = storyInteractionUser.user) != null) {
            InterfaceC897380ZIi.LIZIZ.getClass();
            C0ZE8 c0ze8LJIIJJI = C897370ZIh.LIZ().LJIIJJI();
            C0ZE7 c0ze7 = new C0ZE7(getCurrentLifecycleOwner());
            c0ze7.LJFF = "profile";
            c0ze7.LIZIZ(EnumC1910440zoY.STORY_VIEW_LIST);
            c0ze7.LIZJ = user.getUid();
            AvatarComponentView avatarComponentView = this.LL;
            String str7 = null;
            if (avatarComponentView != null) {
                boolValueOf = Boolean.valueOf(C1607300rvc.LIZIZ(avatarComponentView));
            } else {
                boolValueOf = null;
            }
            c0ze7.LJII = boolValueOf;
            c0ze8LJIIJJI.LIZ(c0ze7, false, C0I0B.LJFF.LIZIZ());
            C728910SiX c728910SiX = ((C730090SkR) L5().getState()).LLILLJJLI;
            if (c728910SiX != null) {
                aweme = c728910SiX.LIZ;
            } else {
                aweme = null;
            }
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, "aweme://user/profile/");
            smartRouteBuildRoute.withParam("uid", user.getUid());
            smartRouteBuildRoute.withParam("sec_user_id", user.getSecUid());
            smartRouteBuildRoute.withParam("previous_page", "story_views_list_panel");
            C727350Sg1 c727350Sg1 = L5().LLILLL;
            if (c727350Sg1 != null) {
                str2 = c727350Sg1.feedEnterFrom;
            } else {
                str2 = null;
            }
            smartRouteBuildRoute.withParam("enter_from", str2);
            smartRouteBuildRoute.withParam("enter_method", str);
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            smartRouteBuildRoute.withParam("group_id", aid);
            if (aweme != null) {
                authorUid = AwemeExtKt.getAuthorUid(aweme);
            } else {
                authorUid = null;
            }
            smartRouteBuildRoute.withParam("author_id", authorUid);
            if (C729510SjV.LJJ(aweme)) {
                str3 = "story";
            } else {
                str3 = "post";
            }
            smartRouteBuildRoute.withParam("story_type", str3);
            smartRouteBuildRoute.open();
            C0RHP c0rhp = C0RHP.LIZ;
            C727350Sg1 c727350Sg12 = L5().LLILLL;
            if (c727350Sg12 != null) {
                i = c727350Sg12.feedPageType;
            } else {
                i = 0;
            }
            C727350Sg1 c727350Sg13 = L5().LLILLL;
            if (c727350Sg13 != null) {
                str4 = c727350Sg13.feedEnterFrom;
            } else {
                str4 = null;
            }
            C727350Sg1 c727350Sg14 = L5().LLILLL;
            if (c727350Sg14 != null) {
                str5 = c727350Sg14.feedFrom;
            } else {
                str5 = null;
            }
            C735840Sti c735840Sti = C735840Sti.LIZ;
            C727350Sg1 c727350Sg15 = L5().LLILLL;
            if (c727350Sg15 != null) {
                str6 = c727350Sg15.feedEnterFrom;
            } else {
                str6 = null;
            }
            C727350Sg1 c727350Sg16 = L5().LLILLL;
            if (c727350Sg16 != null) {
                str7 = c727350Sg16.feedFrom;
            }
            c735840Sti.getClass();
            String strLJIIJ = C735840Sti.LJIIJ(context, str6, str7);
            c0rhp.getClass();
            C0RHP.LIZ(context, aweme, i, str4, str5, str, strLJIIJ, "story_views_list_panel", user);
        }
    }
}
