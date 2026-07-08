package com.ss.android.ugc.aweme.relation.ffp.ui.search;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C0BLP;
import X.C0QB7;
import X.C0S1B;
import X.C1069890dwp;
import X.C1260910iuv;
import X.C1261050iv9;
import X.C1322110kVd;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1387050mCN;
import X.C13LE;
import X.C1606750ruj;
import X.C1606770rul;
import X.C1608750rxx;
import X.C1609500rzA;
import X.C1621010sHj;
import X.C1843500y4a;
import X.C19719912Dl;
import X.C20640015pe;
import X.C20642515q3;
import X.C2188811AlT;
import X.C2211751BhN;
import X.C2217381BqS;
import X.C2277891EDz;
import X.C337180DJs;
import X.C438710HIf;
import X.C452080Ho6;
import X.C452501pT;
import X.C684500Qt6;
import X.C737760Swo;
import X.C737910Sx3;
import X.C786410Ut5;
import X.EnumC1070050dx5;
import X.EnumC1260920iuw;
import X.EnumC1260930iux;
import X.EnumC1605470rsf;
import X.EnumC1606080rte;
import X.EnumC2274741E1w;
import X.EnumC714850S2h;
import X.InterfaceC1334290kpH;
import X.InterfaceC1398730mVD;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import Y.ACListenerS158S0100000_24;
import Y.ACListenerS58S1200000_19;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS603S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class SearchFriendCell extends PowerCell<C1261050iv9> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public final AssemVMLazy LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SearchFriendCell.class, "listVM", "getListVM()Lcom/ss/android/ugc/aweme/relation/ffp/ui/search/SearchFriendListVM;", 0);
        C13LE.LIZ.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.ca0;
    }

    public SearchFriendCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SearchFriendListVM.class);
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(c19719912DlLIZ, 871);
        AFwS264S0000000_24 aFwS264S0000000_24 = AFwS264S0000000_24.get$arr$(262);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS568S0100000_24(c19719912DlLIZ, 860), awS568S0100000_24, AFwS224S0000000_33.get$arr$(431), new AwS568S0100000_24((C03K6) this, 862), new AwS568S0100000_24((C03K6) this, 864), new AwS568S0100000_24((HasDefaultViewModelProviderFactory) this, 866), aFwS264S0000000_24, new AwS568S0100000_24((C03K6) this, 868), null, new AwS568S0100000_24((C03K6) this, 869));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS568S0100000_24 awS568S0100000_242 = new AwS568S0100000_24((C03K6) this, 863);
            AwS568S0100000_24 awS568S0100000_243 = new AwS568S0100000_24((HasDefaultViewModelProviderFactory) this, 865);
            AwS568S0100000_24 awS568S0100000_244 = new AwS568S0100000_24(c19719912DlLIZ, 867);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS568S0100000_242, 123));
            AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c01gwLIZIZ, 3135);
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33(c01gwLIZIZ, 3136);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33(c01gwLIZIZ, 3137);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c01gwLIZIZ, 3138);
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 3139);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS568S0100000_244, awS568S0100000_24, new C452080Ho6(), awS577S0100000_33, awS577S0100000_332, awS568S0100000_243, aFwS264S0000000_24, awS577S0100000_333, awS577S0100000_334, awS577S0100000_335);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS568S0100000_24(c19719912DlLIZ, 870), awS568S0100000_24, AFwS224S0000000_33.get$arr$(432), new AwS568S0100000_24((C03K6) this, 872), new AwS568S0100000_24((C03K6) this, 873), new AwS568S0100000_24((HasDefaultViewModelProviderFactory) this, 874), aFwS264S0000000_24, new AwS568S0100000_24((C03K6) this, 875), null, new AwS568S0100000_24((C03K6) this, 876));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS568S0100000_24(c19719912DlLIZ, 877), awS568S0100000_24, AFwS224S0000000_33.get$arr$(433), new AwS568S0100000_24((C03K6) this, 878), new AwS568S0100000_24((C03K6) this, 879), new AwS568S0100000_24((C03K6) this, 880), aFwS264S0000000_24, null, null, new AwS568S0100000_24((C03K6) this, 857));
        }
        this.LL = assemVMLazy;
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS568S0100000_24(this, 858));
        this.LLILLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 861));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C2211751BhN.LIZ(this.itemView, new C1621010sHj(this, 0));
        if (C0BLP.LIZIZ) {
            AvatarComponentView avatarComponentView = (AvatarComponentView) this.LLILLJJLI.getValue();
            C1608750rxx config = avatarComponentView.getConfig();
            new AwS603S0100000_24(this, 690).invoke(config.LIZ);
            config.LIZJ(new C737760Swo(new C1606750ruj(EnumC1606080rte.DEFAULT, (C1606770rul) null, 6)));
            new AwS598S0100000_19(this, 912).invoke(config.LIZJ);
            avatarComponentView.LJFF(avatarComponentView.getConfig());
            C337180DJs.LIZJ((View) this.LLILLJJLI.getValue());
            C337180DJs.LIZ(this.itemView.findViewById(R.id.i8g));
            ((AvatarComponentView) this.LLILLJJLI.getValue()).LIZ(1, new ACListenerS158S0100000_24(this, 126));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        int iIndexOf;
        boolean z;
        C1261050iv9 c1261050iv9 = (C1261050iv9) interfaceC1891350zJl;
        super.onBindItemView(c1261050iv9);
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZ;
        boolean z2 = false;
        List<C1261050iv9> list = ((C1069890dwp) assemVMLazy.getValue().getState()).LLILLJJLI;
        if (list != null) {
            iIndexOf = list.indexOf(c1261050iv9);
        } else {
            iIndexOf = -1;
        }
        String strValueOf = String.valueOf(iIndexOf);
        c1261050iv9.LLILLJJLI.put("rank", strValueOf);
        if (C0BLP.LIZIZ) {
            C0S1B.LIZ((AvatarComponentView) this.LLILLJJLI.getValue(), c1261050iv9.LL.getUid(), c1261050iv9.LL, this, true, new AwS598S0100000_19(c1261050iv9, 911), 8);
        } else {
            UrlModel urlModel = c1261050iv9.LLILLL;
            if (urlModel == null) {
                ((C1322110kVd) this.itemView.findViewById(R.id.bkz)).setActualImageResource(R.drawable.c5w);
            } else {
                C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel));
                c1331670kl3LJIIIIZZ.LJJ((InterfaceC1334290kpH) this.itemView.findViewById(R.id.bkz));
                c1331670kl3LJIIIIZZ.LJJIIZ(R.drawable.c5w);
                c1331670kl3LJIIIIZZ.LJIJJLI(R.drawable.c5w);
                c1331670kl3LJIIIIZZ.LJJIIZ = EnumC714850S2h.SMALL;
                C786410Ut5.h3(c1331670kl3LJIIIIZZ);
            }
            ((C1609500rzA) this.itemView.findViewById(R.id.i8g)).setMode(EnumC1605470rsf.NONE);
            InterfaceC1398730mVD interfaceC1398730mVD = (InterfaceC1398730mVD) this.LLILLL.getValue();
            if (interfaceC1398730mVD != null) {
                interfaceC1398730mVD.LIZLLL(c1261050iv9.LL);
            }
        }
        ((TextView) this.itemView.findViewById(R.id.p9b)).setText(c1261050iv9.LLILZ);
        ((TextView) this.itemView.findViewById(R.id.usernameTextView)).setText(c1261050iv9.LLILZIL);
        MatchedFriendStruct matchedFriendStruct = c1261050iv9.LLILZLL;
        if (matchedFriendStruct != null) {
            MutualStruct mutualStruct = matchedFriendStruct.mMutualStruct;
            if (mutualStruct != null && mutualStruct.total > 0) {
                z = true;
                C786410Ut5.LJLLLLLL(0, this.itemView.findViewById(R.id.oym));
                C786410Ut5.LJLLLLLL(8, this.itemView.findViewById(R.id.suu));
                ((C0QB7) this.itemView.findViewById(R.id.oym)).LIZ(mutualStruct, 4);
            } else {
                z = false;
                C786410Ut5.LJLLLLLL(8, this.itemView.findViewById(R.id.oym));
                C786410Ut5.LJLLLLLL(0, this.itemView.findViewById(R.id.suu));
                C2277891EDz.LIZIZ.LJIIL((TuxTextView) this.itemView.findViewById(R.id.suu), c1261050iv9.LL, null);
            }
            if (((C0QB7) this.itemView.findViewById(R.id.oym)).getTvDesc().getVisibility() == 0 && z) {
                ((C0QB7) this.itemView.findViewById(R.id.oym)).getTvDesc().setMaxLines(3);
            }
            C786410Ut5.LJLLLLLL(8, this.itemView.findViewById(R.id.pv1));
        } else {
            if (c1261050iv9.LLIZ == EnumC1070050dx5.MORE_FRIENDS) {
                StringBuilder sb = new StringBuilder();
                C20640015pe c20640015pe = C20640015pe.LIZ;
                User user = c1261050iv9.LL;
                c20640015pe.getClass();
                String strLJ = C20642515q3.LJ(2131755688, user.getFollowerCount(), C1843500y4a.LIZIZ(user.getFollowerCount()));
                if (strLJ != null && strLJ.length() != 0) {
                    sb.append(strLJ);
                }
                String strLIZ = C20640015pe.LIZ(c1261050iv9.LL);
                if (strLIZ != null && strLIZ.length() != 0) {
                    sb.append(" · ");
                    sb.append(strLIZ);
                }
                if (sb.length() == 0) {
                    C786410Ut5.LJLLLLLL(8, this.itemView.findViewById(R.id.pv1));
                } else {
                    ((TextView) this.itemView.findViewById(R.id.pv1)).setText(sb);
                    C786410Ut5.LJLLLLLL(0, this.itemView.findViewById(R.id.pv1));
                }
            } else {
                C786410Ut5.LJLLLLLL(8, this.itemView.findViewById(R.id.pv1));
            }
            C786410Ut5.LJLLLLLL(8, this.itemView.findViewById(R.id.oym));
            C786410Ut5.LJLLLLLL(8, this.itemView.findViewById(R.id.suu));
        }
        RelationButton relationButton = (RelationButton) this.itemView.findViewById(R.id.t4g);
        C1387050mCN c1387050mCN = new C1387050mCN(c1261050iv9.LL);
        c1387050mCN.LJFF = EnumC2274741E1w.TUX_NORMAL;
        c1387050mCN.LJIIJJI = getCurrentLifeCycleOwner();
        if (c1261050iv9.LLILZLL != null) {
            z2 = true;
        }
        c1387050mCN.LJIIJ = z2;
        relationButton.LLLLZIL(c1387050mCN.LIZ());
        ((RelationButton) this.itemView.findViewById(R.id.t4g)).setTracker(new AwS563S0100000_19(c1261050iv9, 3406));
        ((RelationButton) this.itemView.findViewById(R.id.t4g)).setFollowClickInterceptor(new C684500Qt6(this, c1261050iv9, null));
        C786410Ut5.I7(new ACListenerS58S1200000_19(c1261050iv9, this, strValueOf, 1), this.itemView);
    }

    public static void I5(C1261050iv9 c1261050iv9, EnumC1260930iux enumC1260930iux) {
        if (c1261050iv9.LLILZLL == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(c1261050iv9.LLILLJJLI);
        linkedHashMap.put("enter_from", "search_result");
        C1260910iuv c1260910iuv = new C1260910iuv(0);
        c1260910iuv.LJJJJZI(c1261050iv9.LL);
        c1260910iuv.LJJJJJ("find_friends_page");
        c1260910iuv.LJJLIIIJILLIZJL = EnumC1260920iuw.RELATION_LABEL;
        c1260910iuv.LJJJJLL();
        c1260910iuv.LJJLIIIJJI = enumC1260930iux;
        c1260910iuv.LIZIZ(linkedHashMap);
        c1260910iuv.LJIILJJIL();
    }
}
