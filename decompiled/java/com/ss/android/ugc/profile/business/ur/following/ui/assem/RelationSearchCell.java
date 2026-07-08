package com.ss.android.ugc.profile.business.ur.following.ui.assem;

import X.AbstractC848400XPy;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C0XQ7;
import X.C123100dR;
import X.C1246990iYT;
import X.C1247000iYU;
import X.C1247270iYv;
import X.C1247300iYy;
import X.C1247490iZH;
import X.C1253000iiA;
import X.C1253010iiB;
import X.C1260910iuv;
import X.C1264070j01;
import X.C1266300j3c;
import X.C1387050mCN;
import X.C13LE;
import X.C13LP;
import X.C1908030zkf;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2211751BhN;
import X.C2217381BqS;
import X.C259550AFd;
import X.C418440Gaw;
import X.C427660Gpo;
import X.C428150Gqb;
import X.C438710HIf;
import X.C452080Ho6;
import X.C452501pT;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1247010iYV;
import X.EnumC1247200iYo;
import X.EnumC1260920iuw;
import X.EnumC1260930iux;
import X.EnumC1387060mCO;
import X.EnumC428940Grs;
import X.InterfaceC1247150iYj;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import Y.ACListenerS122S0200000_19;
import Y.ACListenerS85S0300000_19;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.aweme.relation.label.RelationLabelTextView;
import com.ss.android.ugc.profile.business.ur.following.vm.RelationSearchVM;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS455S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public class RelationSearchCell<ITEM extends C1247270iYv> extends PowerCell<C1247270iYv> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILLL;
    public C427660Gpo LL;
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;
    public RelationLabelTextView LLILZ;
    public RelationButton LLILZIL;
    public TuxIconView LLILZLL;
    public final AssemVMLazy LLIZ;
    public final C01GW LLIZLLLIL;
    public TuxTextView LLJ;
    public TuxTextView LLJI;
    public TuxTextView LLJIJIL;
    public TuxTextView LLJILJIL;
    public final C01GW LLJILJILJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(RelationSearchCell.class, "searchVM", "getSearchVM()Lcom/ss/android/ugc/profile/business/ur/following/vm/RelationSearchVM;", 0);
        C13LE.LIZ.getClass();
        LLJILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public String L5() {
        return "more_action_sheet_follower";
    }

    public RelationSearchCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(RelationSearchVM.class);
        AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c19719912DlLIZ, 2350);
        AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(433);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS563S0100000_19(c19719912DlLIZ, 2334), awS563S0100000_19, AFwS207S0000000_19.get$arr$(446), new AwS563S0100000_19((C03K6) this, 2336), new AwS563S0100000_19((C03K6) this, 2338), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 2340), aFwS257S0000000_19, new AwS563S0100000_19((C03K6) this, 2342), null, new AwS563S0100000_19((C03K6) this, 2343));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS563S0100000_19 awS563S0100000_192 = new AwS563S0100000_19((C03K6) this, 2337);
            AwS563S0100000_19 awS563S0100000_193 = new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 2339);
            AwS563S0100000_19 awS563S0100000_194 = new AwS563S0100000_19(c19719912DlLIZ, 2341);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS420S0200000_19((InterfaceC451590HnJ) obj, awS563S0100000_192, 116));
            AwS563S0100000_19 awS563S0100000_195 = new AwS563S0100000_19(c01gwLIZIZ, 2344);
            AwS563S0100000_19 awS563S0100000_196 = new AwS563S0100000_19(c01gwLIZIZ, 2345);
            AwS563S0100000_19 awS563S0100000_197 = new AwS563S0100000_19(c01gwLIZIZ, 2346);
            AwS563S0100000_19 awS563S0100000_198 = new AwS563S0100000_19(c01gwLIZIZ, 2347);
            AwS563S0100000_19 awS563S0100000_199 = new AwS563S0100000_19(c01gwLIZIZ, 2348);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS563S0100000_194, awS563S0100000_19, new C452080Ho6(), awS563S0100000_195, awS563S0100000_196, awS563S0100000_193, aFwS257S0000000_19, awS563S0100000_197, awS563S0100000_198, awS563S0100000_199);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS563S0100000_19(c19719912DlLIZ, 2349), awS563S0100000_19, AFwS207S0000000_19.get$arr$(447), new AwS563S0100000_19((C03K6) this, 2351), new AwS563S0100000_19((C03K6) this, 2352), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 2353), aFwS257S0000000_19, new AwS563S0100000_19((C03K6) this, 2354), null, new AwS563S0100000_19((C03K6) this, 2355));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS563S0100000_19(c19719912DlLIZ, 2356), awS563S0100000_19, AFwS207S0000000_19.get$arr$(448), new AwS563S0100000_19((C03K6) this, 2329), new AwS563S0100000_19((C03K6) this, 2330), new AwS563S0100000_19((C03K6) this, 2332), aFwS257S0000000_19, null, null, new AwS563S0100000_19((C03K6) this, 2333));
        }
        this.LLIZ = assemVMLazy;
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS563S0100000_19((RelationSearchCell) this, 2331));
        this.LLJILJILJ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(445));
    }

    public final RelationSearchVM N5() {
        AssemVMLazy assemVMLazy = this.LLIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILLL;
        return (RelationSearchVM) assemVMLazy.getValue();
    }

    public final String getEnterFrom() {
        return (String) this.LLIZLLLIL.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C428150Gqb.LIZ(this.itemView, EnumC428940Grs.LIGHT_MASK, 0.0f);
        C2211751BhN.LIZ(this.itemView, new C1266300j3c(this, 1));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: R5, reason: merged with bridge method [inline-methods] */
    public void onBindItemView(C1247270iYv c1247270iYv) {
        String str;
        super.onBindItemView(c1247270iYv);
        User user = c1247270iYv.LL;
        C427660Gpo c427660Gpo = this.LL;
        if (c427660Gpo != null) {
            C427660Gpo.LJIIJJI(c427660Gpo, C438710HIf.LIZ(user.getAvatarThumb()), false, null, null, false, false, null, null, false, null, 1022);
        }
        TuxTextView tuxTextView = this.LLILLJJLI;
        if (tuxTextView != null) {
            tuxTextView.setText(c1247270iYv.LLILZ);
        }
        TuxTextView tuxTextView2 = this.LLILLL;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(user.getUniqueId());
        }
        boolean z = false;
        if (user.getMatchedFriendStruct() != null) {
            RelationLabelTextView relationLabelTextView = this.LLILZ;
            if (relationLabelTextView != null) {
                RelationLabelTextView.LJJJJL(relationLabelTextView, user.getMatchedFriendStruct(), C1264070j01.LJIIIIZZ);
            }
            RelationLabelTextView relationLabelTextView2 = this.LLILZ;
            if (relationLabelTextView2 != null) {
                C786410Ut5.v0(relationLabelTextView2, 0);
            }
        } else {
            RelationLabelTextView relationLabelTextView3 = this.LLILZ;
            if (relationLabelTextView3 != null) {
                C786410Ut5.v0(relationLabelTextView3, 8);
            }
        }
        if (Intrinsics.LJFF(user.getUid(), ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())) {
            RelationButton relationButton = this.LLILZIL;
            if (relationButton != null) {
                C786410Ut5.t0(relationButton, 8);
            }
        } else {
            RelationButton relationButton2 = this.LLILZIL;
            if (relationButton2 != null) {
                C786410Ut5.t0(relationButton2, 0);
            }
            RelationButton relationButton3 = this.LLILZIL;
            if (relationButton3 != null) {
                C1387050mCN c1387050mCN = new C1387050mCN(user);
                c1387050mCN.LJ = EnumC1387060mCO.MESSAGE;
                MatchedFriendStruct matchedFriendStruct = user.getMatchedFriendStruct();
                if (matchedFriendStruct != null && matchedFriendStruct.recType != null) {
                    z = true;
                }
                c1387050mCN.LJIIJ = z;
                c1387050mCN.LJJIIJZLJL = new AwS420S0200000_19((RelationSearchCell) this, (RelationSearchCell<C1247270iYv>) user, (User) 10);
                relationButton3.LLLLZIL(c1387050mCN.LIZ());
            }
            RelationButton relationButton4 = this.LLILZIL;
            if (relationButton4 != null) {
                relationButton4.setTracker(new AwS420S0200000_19((RelationSearchCell) this, (RelationSearchCell<C1247270iYv>) user, (User) 11));
            }
            RelationButton relationButton5 = this.LLILZIL;
            if (relationButton5 != null) {
                relationButton5.setFollowClickListener(new AwS455S0200000_19((RelationSearchCell) this, (RelationSearchCell<C1247270iYv>) user, (User) 1));
            }
        }
        TuxIconView tuxIconView = this.LLILZLL;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS85S0300000_19(this, user, c1247270iYv, 10));
        }
        C786410Ut5.I7(new ACListenerS122S0200000_19(this, user, 20), this.itemView);
        C1908030zkf.LJI(this.itemView.getContext(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), this.LLILLJJLI);
        if (C1247300iYy.LIZ() && ((Boolean) C259550AFd.LIZ.getValue()).booleanValue() && ((Boolean) this.LLJILJILJ.getValue()).booleanValue()) {
            int i = c1247270iYv.LLIZ;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        str = "default";
                    } else {
                        str = "substring";
                    }
                } else {
                    str = "post-del";
                }
            } else {
                str = "prefix";
            }
            TuxTextView tuxTextView3 = this.LLJ;
            if (tuxTextView3 != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("chunk:");
                sbLIZ.append(c1247270iYv.LLILZLL);
                tuxTextView3.setText(C2188811AlT.LIZIZ(sbLIZ));
            }
            TuxTextView tuxTextView4 = this.LLJI;
            if (tuxTextView4 != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("matcher:");
                sbLIZ2.append(str);
                tuxTextView4.setText(C2188811AlT.LIZIZ(sbLIZ2));
            }
            TuxTextView tuxTextView5 = this.LLJIJIL;
            if (tuxTextView5 != null) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("matchBy:");
                sbLIZ3.append(c1247270iYv.LLILLL);
                tuxTextView5.setText(C2188811AlT.LIZIZ(sbLIZ3));
            }
            TuxTextView tuxTextView6 = this.LLJILJIL;
            if (tuxTextView6 != null) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("score:");
                sbLIZ4.append(c1247270iYv.LLIZLLLIL);
                tuxTextView6.setText(C2188811AlT.LIZIZ(sbLIZ4));
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public View onCreateItemView(ViewGroup viewGroup) {
        int i;
        Context context;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.eib, viewGroup, false);
        this.LL = (C427660Gpo) viewTd.findViewById(R.id.bkz);
        this.LLILLJJLI = (TuxTextView) viewTd.findViewById(R.id.p9_);
        this.LLILLL = (TuxTextView) viewTd.findViewById(R.id.username);
        this.LLILZ = (RelationLabelTextView) viewTd.findViewById(R.id.t4q);
        this.LLILZIL = (RelationButton) viewTd.findViewById(R.id.t4m);
        TuxIconView tuxIconView = (TuxIconView) viewTd.findViewById(R.id.ol0);
        if (((C1253000iiA.LIZ() && (Intrinsics.LJFF(getEnterFrom(), EnumC1247200iYo.FANS.getMobString()) || Intrinsics.LJFF(getEnterFrom(), EnumC1247200iYo.FOLLOWING.getMobString()))) || Intrinsics.LJFF(getEnterFrom(), EnumC1247200iYo.FANS.getMobString())) && C1253010iiB.LIZJ.LJJIFFI()) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LLLLLLZZ(tuxIconView, i);
        this.LLILZLL = tuxIconView;
        if (C1247300iYy.LIZ() && ((Boolean) C259550AFd.LIZ.getValue()).booleanValue()) {
            ViewGroup viewGroup2 = (ViewGroup) viewTd.findViewById(R.id.l3k);
            if (((Boolean) this.LLJILJILJ.getValue()).booleanValue() && (context = getContext()) != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                C786410Ut5.d6(linearLayout, new ViewGroup.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(90)), -2));
                linearLayout.setBackgroundColor(ColorProtector.parseColor("#60000000"));
                linearLayout.setGravity(17);
                linearLayout.setPadding(0, 2, 0, 2);
                TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
                tuxTextView.setTextColorRes(R.attr.a1k);
                tuxTextView.setTuxFont(71);
                tuxTextView.setWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(90)));
                tuxTextView.setHeight(-2);
                tuxTextView.setMaxLines(1);
                tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(tuxTextView);
                this.LLJ = tuxTextView;
                TuxTextView tuxTextView2 = new TuxTextView(context, null, 6, 0);
                tuxTextView2.setTextColorRes(R.attr.a1k);
                tuxTextView2.setTuxFont(71);
                tuxTextView2.setWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(90)));
                tuxTextView2.setHeight(-2);
                tuxTextView2.setMaxLines(1);
                linearLayout.addView(tuxTextView2);
                this.LLJI = tuxTextView2;
                TuxTextView tuxTextView3 = new TuxTextView(context, null, 6, 0);
                tuxTextView3.setTextColorRes(R.attr.a1k);
                tuxTextView3.setTuxFont(71);
                tuxTextView3.setWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(90)));
                tuxTextView3.setHeight(-2);
                tuxTextView3.setMaxLines(1);
                linearLayout.addView(tuxTextView3);
                this.LLJIJIL = tuxTextView3;
                TuxTextView tuxTextView4 = new TuxTextView(context, null, 6, 0);
                tuxTextView4.setTextColorRes(R.attr.a1k);
                tuxTextView4.setTuxFont(71);
                tuxTextView4.setWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(90)));
                tuxTextView4.setHeight(-2);
                tuxTextView4.setMaxLines(1);
                tuxTextView4.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(tuxTextView4);
                this.LLJILJIL = tuxTextView4;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 17;
                viewGroup2.addView(linearLayout, 0, layoutParams);
            }
        }
        return viewTd;
    }

    public List<InterfaceC1247150iYj> I5(User user, View view) {
        EnumC1247010iYV enumC1247010iYV;
        EnumC1247010iYV enumC1247010iYV2;
        Integer numValueOf;
        int value;
        EnumC1247010iYV enumC1247010iYV3;
        EnumC1247010iYV enumC1247010iYV4;
        ArrayList arrayList = new ArrayList();
        Integer numValueOf2 = null;
        int value2 = 0;
        if (C1253000iiA.LIZ() && (user.getFollowStatus() == 1 || user.getFollowStatus() == 2 || user.getFollowStatus() == 4)) {
            C1247270iYv item = getItem();
            if (item != null && (enumC1247010iYV4 = item.LLILZIL) != null) {
                numValueOf = Integer.valueOf(enumC1247010iYV4.getValue());
            } else {
                numValueOf = null;
            }
            boolean zLIZLLL = C1247000iYU.LIZLLL(numValueOf, Integer.valueOf(user.getFollowStatus()));
            Context context = view.getContext();
            String strVQ2 = N5().vQ2();
            C1247270iYv item2 = getItem();
            if (item2 != null && (enumC1247010iYV3 = item2.LLILZIL) != null) {
                value = enumC1247010iYV3.getValue();
            } else {
                value = 0;
            }
            arrayList.add(new C1247490iZH(user, context, strVQ2, value, zLIZLLL));
        }
        Context context2 = view.getContext();
        String enterFrom = N5().getEnterFrom();
        RelationSearchVM relationSearchVMN5 = N5();
        String str = relationSearchVMN5.wQ2().LLILZ;
        boolean z = relationSearchVMN5.wQ2().LLILLL;
        if (!C123100dR.LIZ(str)) {
            if (z) {
                str = "personal_homepage";
            } else {
                str = "others_homepage";
            }
        }
        C1247270iYv item3 = getItem();
        if (item3 != null && (enumC1247010iYV2 = item3.LLILZIL) != null) {
            value2 = enumC1247010iYV2.getValue();
        }
        C1247270iYv item4 = getItem();
        if (item4 != null && (enumC1247010iYV = item4.LLILZIL) != null) {
            numValueOf2 = Integer.valueOf(enumC1247010iYV.getValue());
        }
        arrayList.add(new C1246990iYT(user, context2, enterFrom, str, value2, C1247000iYU.LIZLLL(numValueOf2, Integer.valueOf(user.getFollowStatus())) ? 1 : 0, new AwS420S0200000_19((RelationSearchCell) this, (RelationSearchCell<C1247270iYv>) user, (User) 115)));
        return C13LP.LLIIII(arrayList);
    }

    public final void P5(User user, EnumC1260930iux enumC1260930iux) {
        if (user.getMatchedFriendStruct() == null) {
            return;
        }
        C1260910iuv c1260910iuv = new C1260910iuv(0);
        c1260910iuv.LJJIJLIJ(getEnterFrom());
        c1260910iuv.LJJJJIZL("search_result");
        c1260910iuv.LJJLIIIJILLIZJL = EnumC1260920iuw.RELATION_LABEL;
        c1260910iuv.LJJJJLL();
        c1260910iuv.LJJLIIIJJI = enumC1260930iux;
        c1260910iuv.LJJJJZI(user);
        c1260910iuv.LJIILJJIL();
    }
}
