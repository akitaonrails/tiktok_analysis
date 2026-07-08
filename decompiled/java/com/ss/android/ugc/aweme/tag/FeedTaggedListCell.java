package com.ss.android.ugc.aweme.tag;

import X.AbstractC1386130mAt;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C10EU;
import X.C1243240iSQ;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1331730kl9;
import X.C1331750klB;
import X.C1360520lVa;
import X.C1387050mCN;
import X.C13LE;
import X.C1908030zkf;
import X.C19651011uW;
import X.C197039127h;
import X.C19719912Dl;
import X.C20642515q3;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C438710HIf;
import X.C444960Hcc;
import X.C452080Ho6;
import X.C452501pT;
import X.C735410St1;
import X.C735840Sti;
import X.C737470SwL;
import X.C737490SwN;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.ViewOnAttachStateChangeListenerC738770SyR;
import Y.ACListenerS115S0200000_11;
import Y.ACListenerS146S0100000_11;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.tag.TuxTag;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.aweme.tag.viewmodel.FeedTaggedListViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS412S0200000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.AwS625S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class FeedTaggedListCell extends PowerCell<C737490SwN> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public final AssemVMLazy LL;
    public final C01GW LLILLJJLI;
    public SmartImageView LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public TuxTextView LLILZLL;
    public RelationButton LLIZ;
    public C197039127h LLIZLLLIL;
    public TuxTag LLJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FeedTaggedListCell.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/tag/viewmodel/FeedTaggedListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public FeedTaggedListCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FeedTaggedListViewModel.class);
        AwS555S0100000_11 awS555S0100000_11 = new AwS555S0100000_11(c19719912DlLIZ, 927);
        AFwS243S0000000_11 aFwS243S0000000_11 = AFwS243S0000000_11.get$arr$(480);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS555S0100000_11(c19719912DlLIZ, 912), awS555S0100000_11, AFwS198S0000000_11.get$arr$(212), new AwS555S0100000_11((C03K6) this, 913), new AwS555S0100000_11((C03K6) this, 915), new AwS555S0100000_11((HasDefaultViewModelProviderFactory) this, 917), aFwS243S0000000_11, new AwS555S0100000_11((C03K6) this, 919), null, new AwS555S0100000_11((C03K6) this, 920));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS555S0100000_11 awS555S0100000_112 = new AwS555S0100000_11((C03K6) this, 914);
            AwS555S0100000_11 awS555S0100000_113 = new AwS555S0100000_11((HasDefaultViewModelProviderFactory) this, 916);
            AwS555S0100000_11 awS555S0100000_114 = new AwS555S0100000_11(c19719912DlLIZ, 918);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS412S0200000_11((InterfaceC451590HnJ) obj, awS555S0100000_112, 33));
            AwS555S0100000_11 awS555S0100000_115 = new AwS555S0100000_11(c01gwLIZIZ, 921);
            AwS555S0100000_11 awS555S0100000_116 = new AwS555S0100000_11(c01gwLIZIZ, 922);
            AwS555S0100000_11 awS555S0100000_117 = new AwS555S0100000_11(c01gwLIZIZ, 923);
            AwS555S0100000_11 awS555S0100000_118 = new AwS555S0100000_11(c01gwLIZIZ, 924);
            AwS555S0100000_11 awS555S0100000_119 = new AwS555S0100000_11(c01gwLIZIZ, 925);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS555S0100000_114, awS555S0100000_11, new C452080Ho6(), awS555S0100000_115, awS555S0100000_116, awS555S0100000_113, aFwS243S0000000_11, awS555S0100000_117, awS555S0100000_118, awS555S0100000_119);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS555S0100000_11(c19719912DlLIZ, 926), awS555S0100000_11, AFwS198S0000000_11.get$arr$(213), new AwS555S0100000_11((C03K6) this, 928), new AwS555S0100000_11((C03K6) this, 929), new AwS555S0100000_11((HasDefaultViewModelProviderFactory) this, 930), aFwS243S0000000_11, new AwS555S0100000_11((C03K6) this, 931), null, new AwS555S0100000_11((C03K6) this, 932));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS555S0100000_11(c19719912DlLIZ, 933), awS555S0100000_11, AFwS198S0000000_11.get$arr$(214), new AwS555S0100000_11((C03K6) this, 934), new AwS555S0100000_11((C03K6) this, 935), new AwS555S0100000_11((C03K6) this, 936), aFwS243S0000000_11, null, null, new AwS555S0100000_11((C03K6) this, 911));
        }
        this.LL = assemVMLazy;
        this.LLILLJJLI = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(211));
    }

    public final FeedTaggedListViewModel L5() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        return (FeedTaggedListViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        this.LLILLL = (SmartImageView) this.itemView.findViewById(R.id.bh8);
        this.LLILZ = (TuxTextView) this.itemView.findViewById(R.id.userTv);
        this.LLILZIL = (TuxTextView) this.itemView.findViewById(R.id.t4h);
        this.LLILZLL = (TuxTextView) this.itemView.findViewById(R.id.fmb);
        this.LLIZ = (RelationButton) this.itemView.findViewById(R.id.t4f);
        this.LLJ = (TuxTag) this.itemView.findViewById(R.id.bmg);
        C197039127h c197039127h = (C197039127h) this.itemView.findViewById(R.id.t5v);
        this.LLIZLLLIL = c197039127h;
        if (c197039127h == null) {
            c197039127h = null;
        }
        C786410Ut5.U8(c197039127h, new ACListenerS146S0100000_11(this, 34));
        TuxTextView tuxTextView = this.LLILZLL;
        (tuxTextView != null ? tuxTextView : null).setGravity(!C444960Hcc.LIZIZ() ? 3 : 5);
    }

    public final void I5(User user) {
        C737470SwL c737470SwL;
        String str;
        C737470SwL c737470SwL2;
        C737490SwN item = getItem();
        String str2 = "";
        if (item != null && (c737470SwL2 = item.LLILLJJLI) != null) {
            C735840Sti c735840Sti = C735840Sti.LIZ;
            C19651011uW c19651011uW = C19651011uW.LIZIZ;
            C735410St1 c735410St1 = new C735410St1();
            c735410St1.LJIJI(c737470SwL2.LIZ);
            String str3 = c737470SwL2.LIZIZ;
            if (str3 == null) {
                str3 = "";
            }
            c735410St1.LIZLLL = str3;
            c735410St1.LJJLIIIJILLIZJL = "tag";
            Object objLJIIIZ = c19651011uW.LJIIIZ(c737470SwL2.LIZ, c735410St1);
            Aweme aweme = c737470SwL2.LIZ;
            c735840Sti.getClass();
            C735840Sti.LIZIZ(aweme, objLJIIIZ);
            ((AbstractC1386130mAt) objLJIIIZ).LJIILJJIL();
        }
        Context context = this.itemView.getContext();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("aweme://user/profile/");
        sbLIZ.append(user.getUid());
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, C2188811AlT.LIZIZ(sbLIZ));
        smartRouteBuildRoute.withParam("sec_user_id", user.getSecUid());
        C737490SwN item2 = getItem();
        if (item2 != null && (c737470SwL = item2.LLILLJJLI) != null && (str = c737470SwL.LIZIZ) != null) {
            str2 = str;
        }
        smartRouteBuildRoute.withParam("enter_from", str2);
        smartRouteBuildRoute.open();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        boolean z;
        String authorUid;
        int i;
        TuxTag tuxTag;
        Aweme aweme;
        Aweme aweme2;
        AwemeCommerceStruct commerceVideoAuthInfo;
        C737490SwN c737490SwN = (C737490SwN) interfaceC1891350zJl;
        User user = c737490SwN.LL;
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(user.getAvatarThumb()));
        c1331670kl3LJIIIIZZ.LIZLLL("FeedTaggedListCell");
        SmartImageView smartImageView = this.LLILLL;
        C197039127h c197039127h = null;
        RelationButton relationButton = null;
        RelationButton relationButton2 = null;
        if (smartImageView == null) {
            smartImageView = null;
        }
        c1331670kl3LJIIIIZZ.LJJ(smartImageView);
        C1331750klB c1331750klB = new C1331750klB();
        c1331750klB.LIZ = true;
        c1331670kl3LJIIIIZZ.LJJI = new C1331730kl9(c1331750klB);
        c1331670kl3LJIIIIZZ.LIZLLL = true;
        C786410Ut5.h3(c1331670kl3LJIIIIZZ);
        SmartImageView smartImageView2 = this.LLILLL;
        if (smartImageView2 == null) {
            smartImageView2 = null;
        }
        C786410Ut5.Q8(smartImageView2, new ACListenerS115S0200000_11(this, user, 41));
        C786410Ut5.I7(new ACListenerS115S0200000_11(this, user, 42), this.itemView);
        TuxTextView tuxTextView = this.LLILZLL;
        if (tuxTextView == null) {
            tuxTextView = null;
        }
        C786410Ut5.LLLLZLL(tuxTextView, 0);
        TuxTextView tuxTextView2 = this.LLILZLL;
        if (tuxTextView2 == null) {
            tuxTextView2 = null;
        }
        C1360520lVa c1360520lVa = new C1360520lVa();
        L5();
        C1243240iSQ.LIZ.getClass();
        String uniqueId = user.getUniqueId();
        String str = "";
        if (uniqueId == null) {
            uniqueId = "";
        }
        c1360520lVa.LIZ.append((CharSequence) uniqueId);
        tuxTextView2.setText(c1360520lVa.LIZ);
        TuxTextView tuxTextView3 = this.LLILZ;
        if (tuxTextView3 == null) {
            tuxTextView3 = null;
        }
        C1360520lVa c1360520lVa2 = new C1360520lVa();
        L5();
        String nickname = user.getNickname();
        if (nickname != null) {
            str = nickname;
        }
        c1360520lVa2.LIZ.append((CharSequence) str);
        tuxTextView3.setText(c1360520lVa2.LIZ);
        Context context = this.itemView.getContext();
        String customVerify = user.getCustomVerify();
        String enterpriseVerifyReason = user.getEnterpriseVerifyReason();
        TuxTextView tuxTextView4 = this.LLILZ;
        if (tuxTextView4 == null) {
            tuxTextView4 = null;
        }
        C1908030zkf.LJI(context, customVerify, enterpriseVerifyReason, tuxTextView4);
        C737470SwL c737470SwL = c737490SwN.LLILLJJLI;
        if (c737470SwL != null && (aweme2 = c737470SwL.LIZ) != null && (commerceVideoAuthInfo = aweme2.getCommerceVideoAuthInfo()) != null && commerceVideoAuthInfo.isBrandedContent()) {
            z = true;
        } else {
            z = false;
        }
        TuxTextView tuxTextView5 = this.LLILZIL;
        if (tuxTextView5 == null) {
            tuxTextView5 = null;
        }
        if (user.getTaggedIsBA() && z) {
            tuxTextView5.setText(C20642515q3.LJI(2131849577));
            C786410Ut5.LLLLZLL(tuxTextView5, 0);
        } else if (user.getFollowStatus() == 2) {
            tuxTextView5.setText(C20642515q3.LJI(2131849150));
            C786410Ut5.LLLLZLL(tuxTextView5, 0);
        } else {
            C786410Ut5.LLLLZLL(tuxTextView5, 8);
        }
        C737470SwL c737470SwL2 = c737490SwN.LLILLJJLI;
        if (c737470SwL2 != null && (aweme = c737470SwL2.LIZ) != null) {
            authorUid = AwemeExtKt.getAuthorUid(aweme);
        } else {
            authorUid = null;
        }
        if (C10EU.LJIIZILJ(authorUid)) {
            TuxTag tuxTag2 = this.LLJ;
            if (tuxTag2 == null) {
                tuxTag2 = null;
            }
            if (user.showBAPendingTag() && z) {
                TuxTag tuxTag3 = this.LLJ;
                if (tuxTag3 == null) {
                    tuxTag = null;
                    tuxTag3 = null;
                } else {
                    tuxTag = tuxTag3;
                }
                int paddingRight = tuxTag3.getPaddingRight();
                TuxTag tuxTag4 = this.LLJ;
                if (tuxTag4 == null) {
                    tuxTag4 = null;
                }
                int paddingTop = tuxTag4.getPaddingTop();
                TuxTag tuxTag5 = this.LLJ;
                if (tuxTag5 == null) {
                    tuxTag5 = null;
                }
                tuxTag.setPadding(paddingRight, paddingTop, tuxTag5.getPaddingLeft(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1)));
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LLZLLIL(tuxTag2, i);
        }
        if (C10EU.LJIILLIIL(user)) {
            C197039127h c197039127h2 = this.LLIZLLLIL;
            if (c197039127h2 == null) {
                c197039127h2 = null;
            }
            C786410Ut5.LLLLLLJ(c197039127h2, 0);
            RelationButton relationButton3 = this.LLIZ;
            if (relationButton3 != null) {
                relationButton = relationButton3;
            }
            C786410Ut5.t0(relationButton, 4);
        } else if (user.getFollowStatus() != -1 && user.getFollowerStatus() != -1) {
            RelationButton relationButton4 = this.LLIZ;
            if (relationButton4 == null) {
                relationButton4 = null;
            }
            C786410Ut5.t0(relationButton4, 0);
            C197039127h c197039127h3 = this.LLIZLLLIL;
            if (c197039127h3 == null) {
                c197039127h3 = null;
            }
            C786410Ut5.LLLLLLJ(c197039127h3, 8);
            RelationButton relationButton5 = this.LLIZ;
            if (relationButton5 == null) {
                relationButton5 = null;
            }
            C1387050mCN c1387050mCN = new C1387050mCN(user);
            c1387050mCN.LJIIJ = true;
            relationButton5.LLLLZIL(c1387050mCN.LIZ());
            RelationButton relationButton6 = this.LLIZ;
            if (relationButton6 == null) {
                relationButton6 = null;
            }
            relationButton6.setFollowClickListener(new AwS625S0100000_11(this, 145));
            RelationButton relationButton7 = this.LLIZ;
            if (relationButton7 == null) {
                relationButton7 = null;
            }
            relationButton7.setDataChangeListener(new AwS590S0100000_11(c737490SwN, 533));
            RelationButton relationButton8 = this.LLIZ;
            if (relationButton8 != null) {
                relationButton2 = relationButton8;
            }
            relationButton2.setTracker(new AwS555S0100000_11(c737490SwN, 1605));
        } else {
            RelationButton relationButton9 = this.LLIZ;
            if (relationButton9 == null) {
                relationButton9 = null;
            }
            C786410Ut5.t0(relationButton9, 8);
            C197039127h c197039127h4 = this.LLIZLLLIL;
            if (c197039127h4 != null) {
                c197039127h = c197039127h4;
            }
            C786410Ut5.LLLLLLJ(c197039127h, 8);
        }
        this.itemView.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC738770SyR(c737490SwN, this, 1));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.dlh, viewGroup, false);
    }
}
