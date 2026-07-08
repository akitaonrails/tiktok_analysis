package com.ss.android.ugc.aweme.relation.feed.v4;

import X.AbstractC1223210hw7;
import X.C01D1;
import X.C01GW;
import X.C0AJF;
import X.C0HG1;
import X.C0SY5;
import X.C10KT;
import X.C10KU;
import X.C10KY;
import X.C10L6;
import X.C1261860iwS;
import X.C1389340mG4;
import X.C13LE;
import X.C1637806bA;
import X.C19228210Ki;
import X.C19229710Kx;
import X.C19719912Dl;
import X.C19EG;
import X.C1A5L;
import X.C2187451AjH;
import X.C2217381BqS;
import X.C2271381DvM;
import X.C2271391DvN;
import X.C418440Gaw;
import X.C452501pT;
import X.C487280J9a;
import X.C688970R0t;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C736820SvI;
import X.C744300THo;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1264300j0O;
import X.InterfaceC2217461Bqa;
import X.InterfaceC487330J9f;
import Y.ACListenerS130S0200000_28;
import Y.ACListenerS162S0100000_28;
import Y.AObserverS223S0100000_19;
import Y.ARunnableS36S0400000_28;
import Y.AfS197S0100000_28;
import Y.AsS52S0100000_26;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EdgeEffect;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeCardListAssem;
import com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeViewModel;
import com.ss.android.ugc.aweme.relation.label.RelationLabelTextView;
import com.ss.android.ugc.aweme.userservice.api.IUserService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AFwS315S0000000_28;
import kotlin.jvm.internal.AwS132S0101000_26;
import kotlin.jvm.internal.AwS34S0102000_26;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public final class RecSwipeCardListAssem extends ReusedUIContentAssem<RecSwipeCardListAssem> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFF;
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 516));
    public C10KT LLJJJJJIL;
    public final AssemVMLazy LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C10L6 LLJLIL;
    public String LLJLILLLLZIIL;
    public String LLJLL;
    public boolean LLJLLIL;
    public boolean LLJLLL;
    public boolean LLJZ;
    public boolean LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(RecSwipeCardListAssem.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/relation/feed/v4/RecSwipeViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLFF = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [X.10L6] */
    public RecSwipeCardListAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(RecSwipeViewModel.class);
        this.LLJJJJLIIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 1722), AFwS271S0000000_28.get$arr$(202), null, true);
        this.LLJJL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(343));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(344));
        this.LLJL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(346));
        this.LLJLIL = new InterfaceC487330J9f() { // from class: X.10L6
            @Override // X.InterfaceC487330J9f
            public final void onConfigurationChanged(Activity activity, Configuration configuration) {
                if (C19228210Ki.LIZJ()) {
                    ViewGroup.LayoutParams layoutParams = this.LL.LJJIJL().getLayoutParams();
                    layoutParams.height = C19228210Ki.LIZIZ(this.LL.getContext());
                    C786410Ut5.W5(this.LL.LJJIJL(), layoutParams);
                } else {
                    RecSwipeCardListAssem recSwipeCardListAssem = this.LL;
                    recSwipeCardListAssem.cp(recSwipeCardListAssem.LJJIJL().getLayoutParams());
                    C786410Ut5.W5(this.LL.LJJIJL(), this.LL.LJJIJL().getLayoutParams());
                }
                int i = C2187451AjH.LIZ;
                C10KT c10kt = this.LL.LLJJJJJIL;
                if (c10kt != null) {
                    c10kt.notifyDataSetChanged();
                }
            }
        };
        this.LLL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(345));
        this.LLLF = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1721));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Zo() {
        this.LLJLLL = true;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void ap() {
        this.LLJLLL = false;
        if (this.LLJLLIL && hp().LLJ) {
            this.LLJLLIL = false;
            int i = dp().LLILZIL + 1;
            C10KT c10kt = this.LLJJJJJIL;
            if (i < (c10kt != null ? c10kt.getItemCount() : 0)) {
                ep().smoothScrollToPosition(dp().LLILZIL + 1);
            }
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIContentAssem
    public final void Vo() {
        C487280J9a.LIZJ(this.LLJLIL);
        InterfaceC1264300j0O interfaceC1264300j0O = (InterfaceC1264300j0O) this.LLLF.getValue();
        if (interfaceC1264300j0O != null) {
            interfaceC1264300j0O.m6();
        }
    }

    public final RecSwipeGalleryLayoutManager dp() {
        return (RecSwipeGalleryLayoutManager) this.LLJJL.getValue();
    }

    public final RecyclerView ep() {
        return (RecyclerView) this.LLJJJJ.getValue();
    }

    public final RecSwipeViewModel hp() {
        AssemVMLazy assemVMLazy = this.LLJJJJLIIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLFF;
        return (RecSwipeViewModel) assemVMLazy.getValue();
    }

    public final void cp(ViewGroup.LayoutParams layoutParams) {
        Context context;
        if (!C19228210Ki.LIZJ() && (context = getContext()) != null) {
            layoutParams.height = ((C10KY) this.LLJL.getValue()).LIZIZ(context);
        }
    }

    public final List<C1261860iwS> ip(List<C1261860iwS> list) {
        ArrayList arrayList = new ArrayList();
        for (C1261860iwS c1261860iwS : list) {
            C1261860iwS c1261860iwS2 = c1261860iwS;
            hp();
            String str = this.LLJLL;
            if (str == null) {
                str = null;
            }
            if (!C19229710Kx.LIZJ(c1261860iwS2, str)) {
                arrayList.add(c1261860iwS);
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C10KT c10kt;
        LifecycleOwner lifecycleOwnerLIZIZ;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null) {
            C487280J9a.LIZ(c19egLIZ.hashCode(), this.LLJLIL);
        }
        if (C19228210Ki.LIZJ()) {
            ViewGroup.LayoutParams layoutParams = LJJIJL().getLayoutParams();
            layoutParams.height = C19228210Ki.LIZIZ(getContext());
            C786410Ut5.W5(LJJIJL(), layoutParams);
        } else {
            ViewGroup.LayoutParams layoutParams2 = LJJIJL().getLayoutParams();
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(320));
            int iLIZIZ2 = C1389340mG4.LIZJ(C724240Sb0.LIZ(this), null).LIZIZ - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80));
            if (iLIZIZ > iLIZIZ2) {
                iLIZIZ = iLIZIZ2;
            }
            layoutParams2.height = (int) (iLIZIZ * ((C10KU) this.LLL.getValue()).LIZJ);
            if (((Boolean) this.LLJJLIIIJLLLLLLLZ.getValue()).booleanValue()) {
                int i = C2187451AjH.LIZ;
                cp(layoutParams2);
            }
            C786410Ut5.W5(LJJIJL(), layoutParams2);
        }
        String str = hp().LLIZ;
        this.LLJLILLLLZIIL = str;
        if (str == null) {
            str = null;
        }
        String str2 = "homepage_hot";
        if (Intrinsics.LJFF(str, "homepage_hot")) {
            str2 = "no_fyp_feed";
        }
        this.LLJLL = str2;
        C2271391DvN.LIZ(ep(), (C1A5L) C2271381DvM.LLILII.getValue());
        dp().LJIIL(ep());
        dp().LLJILLL = new C744300THo();
        if (C19228210Ki.LIZJ()) {
            final RecSwipeViewModel recSwipeViewModelHp = hp();
            c10kt = new C10KT(recSwipeViewModelHp) { // from class: X.10KQ
                @Override // X.AbstractC438050HFr
                public final void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
                    C1261860iwS c1261860iwS;
                    int size;
                    boolean z;
                    C20731616Ao c20731616Ao;
                    MatchedFriendStruct matchedFriendStruct;
                    List<? extends Aweme> list;
                    List<C1261860iwS> data = getData();
                    String nickname = null;
                    if (data != null) {
                        c1261860iwS = (C1261860iwS) ListProtector.get(data, i2);
                    } else {
                        c1261860iwS = null;
                    }
                    if (c1261860iwS != null && (matchedFriendStruct = c1261860iwS.getMatchedFriendStruct()) != null && (list = matchedFriendStruct.awemeList) != null) {
                        size = list.size();
                    } else {
                        size = 0;
                    }
                    if (size > 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (C296530Bjn.LIZ()) {
                        TuxIconView tuxIconView = (TuxIconView) viewHolder.itemView.findViewById(R.id.kmh);
                        C786410Ut5.LLLLLLZZ(tuxIconView, 0);
                        C786410Ut5.a9(tuxIconView, new ACListenerS162S0100000_28(viewHolder, 111));
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onBindBasicViewHolder - nickanme ");
                    if (c1261860iwS != null) {
                        nickname = c1261860iwS.getNickname();
                    }
                    sbLIZ.append(nickname);
                    sbLIZ.append(", position ");
                    sbLIZ.append(i2);
                    C2188811AlT.LIZIZ(sbLIZ);
                    if (z) {
                        C786410Ut5.LJLLLLLL(0, viewHolder.itemView.findViewById(R.id.etx));
                        C786410Ut5.LJLLLLLL(8, viewHolder.itemView.findViewById(R.id.etz));
                        if (c1261860iwS != null) {
                            View view2 = viewHolder.itemView;
                            LLLII(c1261860iwS, view2, true);
                            LLLIIIIL(c1261860iwS, view2, true);
                            LLLIILIL(c1261860iwS, view2, true);
                            C10LK c10lk = (C10LK) view2.findViewById(R.id.ws8);
                            List<C1261860iwS> data2 = getData();
                            RecSwipeViewModel recSwipeViewModel = this.LL;
                            c10lk.LJIIIZ(c1261860iwS, data2, recSwipeViewModel.LLIZ, recSwipeViewModel, new AwS572S0100000_28(this, 792));
                            int i3 = C19227410Ka.LIZ[C19228210Ki.LIZ(view2.getContext()).ordinal()];
                            if (i3 != 1) {
                                if (i3 != 2) {
                                    if (i3 == 3) {
                                        c10lk.LJIIIIZZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(111)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(151)), C418440Gaw.LIZIZ(10), c10lk);
                                    } else {
                                        throw new C1954807lC();
                                    }
                                } else {
                                    c10lk.LJIIIIZZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(99)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(132)), C418440Gaw.LIZIZ(10), c10lk);
                                }
                            } else {
                                c10lk.LJIIIIZZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(89.67d))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(119.5d))), C418440Gaw.LIZIZ(10), c10lk);
                            }
                        }
                    } else {
                        C786410Ut5.LJLLLLLL(8, viewHolder.itemView.findViewById(R.id.etx));
                        C786410Ut5.LJLLLLLL(0, viewHolder.itemView.findViewById(R.id.etz));
                        if (c1261860iwS != null) {
                            View view3 = viewHolder.itemView;
                            LLLII(c1261860iwS, view3, false);
                            LLLIIIIL(c1261860iwS, view3, false);
                            LLLIILIL(c1261860iwS, view3, false);
                        }
                    }
                    if ((viewHolder instanceof C20731616Ao) && (c20731616Ao = (C20731616Ao) viewHolder) != null) {
                        c20731616Ao.LLILLJJLI = c1261860iwS;
                    }
                    RecSwipeViewModel recSwipeViewModel2 = this.LL;
                    int itemCount = getItemCount();
                    recSwipeViewModel2.getClass();
                    recSwipeViewModel2.withState(new AwS34S0102000_26(itemCount, i2, recSwipeViewModel2, 2));
                    C786410Ut5.I7(new ACListenerS130S0200000_28(this, c1261860iwS, 46), viewHolder.itemView);
                }

                @Override // X.AbstractC438050HFr
                public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i2) {
                    View viewTd;
                    if (LLLFZ() && C19228210Ki.LIZ(viewGroup.getContext()) == EnumC19227710Kd.WIDE) {
                        viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.fix, viewGroup, false);
                    } else {
                        viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.fiw, viewGroup, false);
                    }
                    C10KT.LLLI(viewTd);
                    C20731616Ao c20731616Ao = new C20731616Ao(viewTd, this.LL);
                    C2211751BhN.LIZ(c20731616Ao.itemView, new C19229110Kr(c20731616Ao, this));
                    return c20731616Ao;
                }

                public static void LLLIIIIL(C1261860iwS c1261860iwS, View view2, boolean z) {
                    TuxTextView tuxTextView;
                    if (z) {
                        tuxTextView = (TuxTextView) view2.findViewById(R.id.c0c);
                    } else {
                        tuxTextView = (TuxTextView) view2.findViewById(R.id.c0d);
                    }
                    C786410Ut5.B5(tuxTextView, 1.0f);
                    tuxTextView.setText(c1261860iwS.getNickname());
                }

                public final void LLLII(C1261860iwS c1261860iwS, View view2, boolean z) {
                    SmartImageView smartImageView;
                    if (z) {
                        smartImageView = (SmartImageView) view2.findViewById(R.id.bzp);
                    } else {
                        smartImageView = (SmartImageView) view2.findViewById(R.id.bzq);
                    }
                    C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(c1261860iwS.getAvatarMedium()));
                    c1331670kl3LJIIIIZZ.LJJ(smartImageView);
                    C1331750klB c1331750klB = new C1331750klB();
                    c1331750klB.LIZ = true;
                    c1331750klB.LIZJ = C475630Ikz.LIZIZ(R.attr.zj, view2.getContext());
                    c1331750klB.LIZIZ = C418440Gaw.LIZIZ(Double.valueOf(0.5d));
                    c1331670kl3LJIIIIZZ.LJJI = new C1331730kl9(c1331750klB);
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZ = R.raw.icon_color_default_avatar;
                    c1331670kl3LJIIIIZZ.LJJIIZI(c419910GdJ.LIZ(view2.getContext()));
                    C419910GdJ c419910GdJ2 = new C419910GdJ();
                    c419910GdJ2.LIZ = R.raw.icon_color_default_avatar;
                    c1331670kl3LJIIIIZZ.LJIL(c419910GdJ2.LIZ(view2.getContext()));
                    c1331670kl3LJIIIIZZ.LJJIIZ = EnumC714850S2h.SMALL;
                    C2177231AIv.LIZ(c1331670kl3LJIIIIZZ, this.LL.LLIZ, C10LT.AVATAR, "big_card", -1, "");
                }

                public final void LLLIILIL(C1261860iwS c1261860iwS, View view2, boolean z) {
                    boolean z2;
                    C786890Utr c786890Utr;
                    TuxIconView tuxIconView;
                    C1246110iX3 c1246110iX3LIZIZ;
                    int i2;
                    int marginStart;
                    int marginEnd;
                    int i3;
                    ViewGroup.MarginLayoutParams marginLayoutParams;
                    int i4;
                    int marginStart2;
                    int marginEnd2;
                    ViewGroup.MarginLayoutParams marginLayoutParams2;
                    int iLIZIZ3;
                    String[] strArr;
                    String strLJI;
                    List<String> list;
                    String[] strArr2;
                    String strLJI2;
                    List<String> list2;
                    int iLIZIZ4;
                    int iLIZIZ5;
                    String[] strArr3;
                    String strLJI3;
                    List<String> list3;
                    EnumC19227710Kd enumC19227710KdLIZ = C19228210Ki.LIZ(view2.getContext());
                    EnumC19227710Kd enumC19227710Kd = EnumC19227710Kd.WIDE;
                    int i5 = 0;
                    if (enumC19227710KdLIZ == enumC19227710Kd) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z) {
                        c786890Utr = (C786890Utr) view2.findViewById(R.id.zox);
                    } else {
                        c786890Utr = (C786890Utr) view2.findViewById(R.id.zoy);
                    }
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c786890Utr);
                    c786890Utr.setAlpha(0.6f);
                    if (z) {
                        tuxIconView = (TuxIconView) view2.findViewById(R.id.lja);
                    } else {
                        tuxIconView = (TuxIconView) view2.findViewById(R.id.ljb);
                    }
                    int i6 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("bindReason for ");
                    sbLIZ.append(c1261860iwS.getNickname());
                    C2188811AlT.LIZIZ(sbLIZ);
                    MatchedFriendStruct matchedFriendStruct = c1261860iwS.getMatchedFriendStruct();
                    if (matchedFriendStruct != null) {
                        c1246110iX3LIZIZ = C1246100iX2.LIZIZ(matchedFriendStruct);
                    } else {
                        c1246110iX3LIZIZ = null;
                    }
                    if (matchedFriendStruct != null) {
                        C1246110iX3 c1246110iX3LIZIZ2 = C1246100iX2.LIZIZ(matchedFriendStruct);
                        C1264020izw c1264020izwLIZJ = C1264000izu.LIZJ(matchedFriendStruct, C1264070j01.LJJI);
                        EnumC19227710Kd enumC19227710KdLIZ2 = C19228210Ki.LIZ(c786890Utr.getContext());
                        if (enumC19227710KdLIZ2 == enumC19227710Kd) {
                            c786890Utr.setTuxFont(52);
                        } else {
                            c786890Utr.setTuxFont(62);
                        }
                        if (c1246110iX3LIZIZ2 == null) {
                            int visibility = c786890Utr.getVisibility();
                            c786890Utr.setVisibility(0);
                            C1602160rnK.LIZIZ(visibility, 0, c786890Utr);
                            c786890Utr.setGravity(17);
                            ViewGroup.LayoutParams layoutParams3 = c786890Utr.getLayoutParams();
                            layoutParams3.width = -2;
                            C786410Ut5.l7(c786890Utr, layoutParams3);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                            Integer num = c1264020izwLIZJ.LIZJ;
                            if (num != null) {
                                int iIntValue = num.intValue();
                                C419910GdJ c419910GdJ = new C419910GdJ();
                                c419910GdJ.LIZ = iIntValue;
                                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                                c419910GdJ.LIZLLL = C1308910kAL.LIZJ(R.attr.a1k, c786890Utr.getContext());
                                TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(c786890Utr.getContext());
                                tuxIconDrawableLIZ.setBounds(0, 0, c419910GdJ.LIZIZ, c419910GdJ.LIZJ);
                                C419890GdH c419890GdH = new C419890GdH(tuxIconDrawableLIZ, 2);
                                spannableStringBuilder.append((CharSequence) " ");
                                C786410Ut5.q2(spannableStringBuilder, c419890GdH, 0, 1, 33);
                                spannableStringBuilder.append((CharSequence) "\u200a\u200a");
                            }
                            C1153800g8A c1153800g8A = c1264020izwLIZJ.LIZ;
                            if (c1153800g8A == null || (list3 = c1153800g8A.LIZIZ) == null || (strArr3 = (String[]) list3.toArray(new String[0])) == null) {
                                strArr3 = new String[0];
                            }
                            C1153800g8A c1153800g8A2 = c1264020izwLIZJ.LIZ;
                            if (c1153800g8A2 == null || (strLJI3 = c1153800g8A2.LIZ) == null) {
                                strLJI3 = C20642515q3.LJI(2131845714);
                            }
                            Object[] objArrCopyOf = Arrays.copyOf(strArr3, strArr3.length);
                            spannableStringBuilder.append((CharSequence) C786410Ut5.j4(strLJI3, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length)));
                            c786890Utr.setText(spannableStringBuilder.toString());
                        } else {
                            int visibility2 = c786890Utr.getVisibility();
                            c786890Utr.setVisibility(0);
                            C1602160rnK.LIZIZ(visibility2, 0, c786890Utr);
                            c786890Utr.setGravity(8388627);
                            ViewGroup.LayoutParams layoutParams4 = c786890Utr.getLayoutParams();
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("bind - avatarNum ");
                            sbLIZ2.append(c1246110iX3LIZIZ2.LIZIZ);
                            C2188811AlT.LIZIZ(sbLIZ2);
                            int i7 = c1246110iX3LIZIZ2.LIZIZ;
                            if (i7 != 0 && i7 != 1) {
                                if (i7 != 2) {
                                    int i8 = C10KZ.LIZ[enumC19227710KdLIZ2.ordinal()];
                                    if (i8 != 1) {
                                        if (i8 != 2) {
                                            if (i8 == 3) {
                                                iLIZIZ5 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(248));
                                            } else {
                                                throw new C1954807lC();
                                            }
                                        } else {
                                            iLIZIZ5 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(220));
                                        }
                                    } else {
                                        iLIZIZ5 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(198));
                                    }
                                    layoutParams4.width = iLIZIZ5;
                                    c786890Utr.setHyphenationFrequency(0);
                                    c786890Utr.setBreakStrategy(1);
                                    c786890Utr.setMaxLines(2);
                                    c786890Utr.setEllipsize(TextUtils.TruncateAt.END);
                                    C786410Ut5.l7(c786890Utr, layoutParams4);
                                } else {
                                    int i9 = C10KZ.LIZ[enumC19227710KdLIZ2.ordinal()];
                                    if (i9 != 1) {
                                        if (i9 != 2) {
                                            if (i9 == 3) {
                                                iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(254));
                                            } else {
                                                throw new C1954807lC();
                                            }
                                        } else {
                                            iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(226));
                                        }
                                    } else {
                                        iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(204));
                                    }
                                    layoutParams4.width = iLIZIZ4;
                                    c786890Utr.setHyphenationFrequency(0);
                                    c786890Utr.setBreakStrategy(1);
                                    c786890Utr.setMaxLines(2);
                                    c786890Utr.setEllipsize(TextUtils.TruncateAt.END);
                                    C786410Ut5.l7(c786890Utr, layoutParams4);
                                }
                            } else {
                                int i10 = C10KZ.LIZ[enumC19227710KdLIZ2.ordinal()];
                                if (i10 != 1) {
                                    if (i10 != 2) {
                                        if (i10 == 3) {
                                            iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(260));
                                        } else {
                                            throw new C1954807lC();
                                        }
                                    } else {
                                        iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(232));
                                    }
                                } else {
                                    iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(210));
                                }
                                c786890Utr.setMaxWidth(iLIZIZ3);
                                layoutParams4.width = -2;
                                C1153800g8A c1153800g8A3 = c1264020izwLIZJ.LIZ;
                                if (c1153800g8A3 == null || (list = c1153800g8A3.LIZIZ) == null || (strArr = (String[]) list.toArray(new String[0])) == null) {
                                    strArr = new String[0];
                                }
                                C1153800g8A c1153800g8A4 = c1264020izwLIZJ.LIZ;
                                if (c1153800g8A4 == null || (strLJI = c1153800g8A4.LIZ) == null) {
                                    strLJI = C20642515q3.LJI(2131845714);
                                }
                                Object[] objArrCopyOf2 = Arrays.copyOf(strArr, strArr.length);
                                c786890Utr.setText(C786410Ut5.j4(strLJI, Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length)));
                                c786890Utr.setHyphenationFrequency(2);
                                c786890Utr.setBreakStrategy(0);
                                C786410Ut5.l7(c786890Utr, layoutParams4);
                                HandlerHook.viewPost(c786890Utr, new ARunnableS36S0400000_28(c786890Utr, layoutParams4, enumC19227710KdLIZ2, c1264020izwLIZJ, 6));
                            }
                            C1153800g8A c1153800g8A5 = c1264020izwLIZJ.LIZ;
                            if (c1153800g8A5 == null || (list2 = c1153800g8A5.LIZIZ) == null || (strArr2 = (String[]) list2.toArray(new String[0])) == null) {
                                strArr2 = new String[0];
                            }
                            C1153800g8A c1153800g8A6 = c1264020izwLIZJ.LIZ;
                            if (c1153800g8A6 == null || (strLJI2 = c1153800g8A6.LIZ) == null) {
                                strLJI2 = C20642515q3.LJI(2131845714);
                            }
                            Object[] objArrCopyOf3 = Arrays.copyOf(strArr2, strArr2.length);
                            c786890Utr.setText(C786410Ut5.j4(strLJI2, Arrays.copyOf(objArrCopyOf3, objArrCopyOf3.length)));
                        }
                    }
                    if (c1246110iX3LIZIZ == null) {
                        C786410Ut5.LLLLLLZZ(tuxIconView, 8);
                        if (z) {
                            if (z2) {
                                i4 = 48;
                            } else {
                                i4 = 36;
                            }
                            int iLIZIZ6 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i4)));
                            View viewFindViewById = view2.findViewById(R.id.etx);
                            ViewGroup.LayoutParams layoutParams5 = viewFindViewById.getLayoutParams();
                            if (layoutParams5 instanceof ViewGroup.MarginLayoutParams) {
                                marginStart2 = ((ViewGroup.MarginLayoutParams) layoutParams5).getMarginStart();
                            } else {
                                marginStart2 = 0;
                            }
                            Integer numValueOf = Integer.valueOf(marginStart2);
                            Integer numValueOf2 = Integer.valueOf(iLIZIZ6);
                            ViewGroup.LayoutParams layoutParams6 = viewFindViewById.getLayoutParams();
                            if (layoutParams6 instanceof ViewGroup.MarginLayoutParams) {
                                marginEnd2 = ((ViewGroup.MarginLayoutParams) layoutParams6).getMarginEnd();
                            } else {
                                marginEnd2 = 0;
                            }
                            Integer numValueOf3 = Integer.valueOf(marginEnd2);
                            ViewGroup.LayoutParams layoutParams7 = viewFindViewById.getLayoutParams();
                            if ((layoutParams7 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams7) != null) {
                                i5 = marginLayoutParams2.bottomMargin;
                            }
                            C426750GoL.LJIIIZ(viewFindViewById, numValueOf, numValueOf2, numValueOf3, Integer.valueOf(i5), false, 16);
                            return;
                        }
                        return;
                    }
                    if (z) {
                        if (z2) {
                            i2 = 32;
                        } else {
                            i2 = 24;
                        }
                        int iLIZIZ7 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i2)));
                        View viewFindViewById2 = view2.findViewById(R.id.etx);
                        ViewGroup.LayoutParams layoutParams8 = viewFindViewById2.getLayoutParams();
                        if (layoutParams8 instanceof ViewGroup.MarginLayoutParams) {
                            marginStart = ((ViewGroup.MarginLayoutParams) layoutParams8).getMarginStart();
                        } else {
                            marginStart = 0;
                        }
                        Integer numValueOf4 = Integer.valueOf(marginStart);
                        Integer numValueOf5 = Integer.valueOf(iLIZIZ7);
                        ViewGroup.LayoutParams layoutParams9 = viewFindViewById2.getLayoutParams();
                        if (layoutParams9 instanceof ViewGroup.MarginLayoutParams) {
                            marginEnd = ((ViewGroup.MarginLayoutParams) layoutParams9).getMarginEnd();
                        } else {
                            marginEnd = 0;
                        }
                        Integer numValueOf6 = Integer.valueOf(marginEnd);
                        ViewGroup.LayoutParams layoutParams10 = viewFindViewById2.getLayoutParams();
                        if ((layoutParams10 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams10) != null) {
                            i3 = marginLayoutParams.bottomMargin;
                        } else {
                            i3 = 0;
                        }
                        C426750GoL.LJIIIZ(viewFindViewById2, numValueOf4, numValueOf5, numValueOf6, Integer.valueOf(i3), false, 16);
                    }
                    C786410Ut5.LLLLLLZZ(tuxIconView, 0);
                    C2177241AIw c2177241AIw = new C2177241AIw(view2.getContext(), c1246110iX3LIZIZ, new C2177251AIx(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), null, 0, 3, 0.0f, 0.0f, 0, 0, null, null, true, false, false, null, 122812));
                    tuxIconView.setImageBitmap(c2177241AIw.LIZ());
                    this.LLILLJJLI.LIZ(c2177241AIw.LIZIZ().LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS197S0100000_28(tuxIconView, 77)));
                }
            };
        } else {
            final RecSwipeViewModel recSwipeViewModelHp2 = hp();
            c10kt = new C10KT(recSwipeViewModelHp2) { // from class: X.10KS
                public int LLILZIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(320));
                public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(566));
                public final C01GW LLIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(567));

                @Override // X.AbstractC438050HFr
                public final void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
                    C1261860iwS c1261860iwS;
                    C20731616Ao c20731616Ao;
                    boolean z;
                    C19MB c19mb;
                    int i3;
                    boolean z2;
                    C1246110iX3 c1246110iX3LIZIZ;
                    List<? extends Aweme> list;
                    List<? extends Aweme> list2;
                    if (LLLFZ()) {
                        ViewGroup.LayoutParams layoutParams3 = viewHolder.itemView.getLayoutParams();
                        int iLIZJ = ((C10KY) this.LLIZ.getValue()).LIZJ(viewHolder.itemView.getContext());
                        layoutParams3.width = iLIZJ;
                        this.LLILZIL = (int) (((double) iLIZJ) * 1.33d);
                        C786410Ut5.W5(viewHolder.itemView, layoutParams3);
                        int iLIZIZ3 = ((layoutParams3.width - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) * 2)) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)) * 2)) / 3;
                        C10LK c10lk = (C10LK) viewHolder.itemView.findViewById(R.id.ws7);
                        C10LK c10lk2 = (C10LK) viewHolder.itemView.findViewById(R.id.ws7);
                        int i4 = C10LK.LLJL;
                        c10lk.LJIIIIZZ(iLIZIZ3, (iLIZIZ3 * 4) / 3, C418440Gaw.LIZIZ(10), c10lk2);
                        C10KT.LLLI(viewHolder.itemView);
                    }
                    if (C296530Bjn.LIZ()) {
                        TuxIconView tuxIconView = (TuxIconView) viewHolder.itemView.findViewById(R.id.kmh);
                        C786410Ut5.LLLLLLZZ(tuxIconView, 0);
                        C786410Ut5.a9(tuxIconView, new ACListenerS162S0100000_28(viewHolder, 104));
                    }
                    List<C1261860iwS> data = getData();
                    if (data != null) {
                        c1261860iwS = (C1261860iwS) ListProtector.get(data, i2);
                        if (c1261860iwS != null) {
                            View view2 = viewHolder.itemView;
                            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(c1261860iwS.getAvatarMedium()));
                            c1331670kl3LJIIIIZZ.LJJ((InterfaceC1334290kpH) view2.findViewById(R.id.bzo));
                            C419910GdJ c419910GdJ = new C419910GdJ();
                            c419910GdJ.LIZ = R.raw.icon_color_default_avatar;
                            c1331670kl3LJIIIIZZ.LJJIIZI(c419910GdJ.LIZ(view2.getContext()));
                            C419910GdJ c419910GdJ2 = new C419910GdJ();
                            c419910GdJ2.LIZ = R.raw.icon_color_default_avatar;
                            c1331670kl3LJIIIIZZ.LJIL(c419910GdJ2.LIZ(view2.getContext()));
                            c1331670kl3LJIIIIZZ.LJJIIZ = EnumC714850S2h.SMALL;
                            C2177231AIv.LIZ(c1331670kl3LJIIIIZZ, this.LL.LLIZ, C10LT.AVATAR, "big_card", -1, "");
                            MatchedFriendStruct matchedFriendStruct = c1261860iwS.getMatchedFriendStruct();
                            if (matchedFriendStruct != null && (list2 = matchedFriendStruct.awemeList) != null) {
                                z = !list2.isEmpty();
                            } else {
                                z = false;
                            }
                            C19MB c19mb2 = new C19MB();
                            ConstraintLayout constraintLayout = (ConstraintLayout) view2;
                            c19mb2.LJII(constraintLayout);
                            int i5 = C2187451AjH.LIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("[resizeAvatar] hasAwemeList = ");
                            sbLIZ.append(z);
                            C2188811AlT.LIZIZ(sbLIZ);
                            if (z) {
                                int i6 = (int) (this.LLILZIL * ((C10KU) this.LLILZLL.getValue()).LIZLLL);
                                c19mb2.LJIILJJIL(((C10KU) this.LLILZLL.getValue()).LIZ, R.id.bzo);
                                i3 = 3;
                                c19mb = c19mb2;
                                c19mb.LJIIIZ(R.id.bzo, 3, 0, 3, i6);
                            } else {
                                c19mb = c19mb2;
                                int i7 = (int) (this.LLILZIL * ((C10KU) this.LLILZLL.getValue()).LJ);
                                c19mb.LJIILJJIL(((C10KU) this.LLILZLL.getValue()).LIZIZ, R.id.bzo);
                                i3 = 3;
                                c19mb.LJIIIZ(R.id.bzo, 3, 0, 3, i7);
                            }
                            c19mb.LIZIZ(constraintLayout);
                            View view3 = viewHolder.itemView;
                            ((TextView) view3.findViewById(R.id.c0b)).setText(c1261860iwS.getNickname());
                            boolean zLIZLLL = C1A9E.LIZLLL();
                            int i8 = R.attr.ef;
                            if (zLIZLLL) {
                                ((TuxTextView) view3.findViewById(R.id.c0b)).setTextColorRes(R.attr.ef);
                            } else {
                                ((TuxTextView) view3.findViewById(R.id.c0b)).setTextColorRes(R.attr.a1h);
                            }
                            final View view4 = viewHolder.itemView;
                            if (C1A9E.LIZ().group > 5) {
                                MatchedFriendStruct matchedFriendStruct2 = c1261860iwS.getMatchedFriendStruct();
                                if (matchedFriendStruct2 != null && (list = matchedFriendStruct2.awemeList) != null && list.size() > 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (!C1A9E.LIZLLL()) {
                                    i8 = R.attr.a1k;
                                }
                                ((TuxTextView) view4.findViewById(R.id.tv_v_relation_text)).setTextColorRes(i8);
                                ((TuxTextView) view4.findViewById(R.id.zow)).setTextColorRes(i8);
                                if (matchedFriendStruct2 != null) {
                                    c1246110iX3LIZIZ = C1246100iX2.LIZIZ(matchedFriendStruct2);
                                } else {
                                    c1246110iX3LIZIZ = null;
                                }
                                if (z2) {
                                    View viewFindViewById = view4.findViewById(R.id.ymd);
                                    int visibility = viewFindViewById.getVisibility();
                                    viewFindViewById.setVisibility(0);
                                    C1602160rnK.LIZIZ(visibility, 0, viewFindViewById);
                                    View viewFindViewById2 = view4.findViewById(R.id.ynt);
                                    int visibility2 = viewFindViewById2.getVisibility();
                                    viewFindViewById2.setVisibility(8);
                                    C1602160rnK.LIZIZ(visibility2, 8, viewFindViewById2);
                                    view4.findViewById(R.id.zow).setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: X.10KV
                                        @Override // android.view.View.OnScrollChangeListener
                                        public final void onScrollChange(View view5, int i9, int i10, int i11, int i12) {
                                            if (i9 != 0 && i11 == 0) {
                                                view4.findViewById(R.id.zow).setScrollX(0);
                                            }
                                        }
                                    });
                                    if (c1246110iX3LIZIZ != null) {
                                        C786410Ut5.LLLLLLZZ((TuxIconView) view4.findViewById(R.id.lj_), 0);
                                        C2177241AIw c2177241AIw = new C2177241AIw(view4.getContext(), c1246110iX3LIZIZ, new C2177251AIx(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), null, 0, i3, 0.0f, 0.0f, 0, 0, null, null, false, false, false, null, 131004));
                                        ((AppCompatImageView) view4.findViewById(R.id.lj_)).setImageBitmap(c2177241AIw.LIZ());
                                        this.LLILLJJLI.LIZ(c2177241AIw.LIZIZ().LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new C516201zk(view4, 195)));
                                        ((TextView) view4.findViewById(R.id.zow)).setGravity(8388627);
                                    } else {
                                        C786410Ut5.LLLLLLZZ((TuxIconView) view4.findViewById(R.id.lj_), 8);
                                        ((TextView) view4.findViewById(R.id.zow)).setGravity(17);
                                    }
                                    RelationLabelTextView relationLabelTextView = (RelationLabelTextView) view4.findViewById(R.id.zow);
                                    ViewGroup.LayoutParams layoutParams4 = relationLabelTextView.getLayoutParams();
                                    layoutParams4.width = -2;
                                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(relationLabelTextView);
                                    relationLabelTextView.setLayoutParams(layoutParams4);
                                    relationLabelTextView.LJJJJJ(matchedFriendStruct2, C1264070j01.LJJI, new AwS550S0100000_6(relationLabelTextView, 1172));
                                } else {
                                    View viewFindViewById3 = view4.findViewById(R.id.ymd);
                                    int visibility3 = viewFindViewById3.getVisibility();
                                    viewFindViewById3.setVisibility(8);
                                    C1602160rnK.LIZIZ(visibility3, 8, viewFindViewById3);
                                    View viewFindViewById4 = view4.findViewById(R.id.ynt);
                                    int visibility4 = viewFindViewById4.getVisibility();
                                    viewFindViewById4.setVisibility(0);
                                    C1602160rnK.LIZIZ(visibility4, 0, viewFindViewById4);
                                    if (c1246110iX3LIZIZ != null) {
                                        C2177241AIw c2177241AIw2 = new C2177241AIw(view4.getContext(), c1246110iX3LIZIZ, new C2177251AIx(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), null, 0, i3, 0.0f, 0.0f, 0, 0, null, null, false, false, false, null, 131004));
                                        C786410Ut5.LLLLLLZZ((TuxIconView) view4.findViewById(R.id.lza), 0);
                                        ((AppCompatImageView) view4.findViewById(R.id.lza)).setImageBitmap(c2177241AIw2.LIZ());
                                        this.LLILLJJLI.LIZ(c2177241AIw2.LIZIZ().LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new C516201zk(view4, 196)));
                                        ((TextView) view4.findViewById(R.id.zow)).setGravity(8388627);
                                    } else {
                                        C786410Ut5.LLLLLLZZ((TuxIconView) view4.findViewById(R.id.lza), 8);
                                        ((TextView) view4.findViewById(R.id.zow)).setGravity(17);
                                    }
                                    RelationLabelTextView.LJJJJL((RelationLabelTextView) view4.findViewById(R.id.tv_v_relation_text), matchedFriendStruct2, C1264070j01.LJJI);
                                }
                                ((C1910890zpH) this.LLILLL.getValue()).LIZ("RecSwipeCardListAdapter", "user: " + c1261860iwS.getUid() + ", set relation label show");
                                RecSwipeViewModel recSwipeViewModel = this.LL;
                                String uid = c1261860iwS.getUid();
                                recSwipeViewModel.getClass();
                                if (C1264800j1C.LIZIZ()) {
                                    recSwipeViewModel.LLJI.put(uid, Boolean.TRUE);
                                } else {
                                    recSwipeViewModel.LLJI.put(uid, null);
                                }
                            }
                            C10LK c10lk3 = (C10LK) viewHolder.itemView.findViewById(R.id.ws7);
                            List<C1261860iwS> data2 = getData();
                            RecSwipeViewModel recSwipeViewModel2 = this.LL;
                            c10lk3.LJIIIZ(c1261860iwS, data2, recSwipeViewModel2.LLIZ, recSwipeViewModel2, new AwS572S0100000_28(this, 772));
                        }
                    } else {
                        c1261860iwS = null;
                    }
                    if ((viewHolder instanceof C20731616Ao) && (c20731616Ao = (C20731616Ao) viewHolder) != null) {
                        c20731616Ao.LLILLJJLI = c1261860iwS;
                    }
                    RecSwipeViewModel recSwipeViewModel3 = this.LL;
                    int itemCount = getItemCount();
                    recSwipeViewModel3.getClass();
                    recSwipeViewModel3.withState(new AwS34S0102000_26(itemCount, i2, recSwipeViewModel3, 2));
                    C786410Ut5.I7(new ACListenerS130S0200000_28(c1261860iwS, this, 43), viewHolder.itemView);
                }

                @Override // X.AbstractC438050HFr
                public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i2) {
                    View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.fiv, viewGroup, false);
                    View viewFindViewById = viewGroup.findViewById(R.id.wsb);
                    ViewGroup.LayoutParams layoutParams3 = viewTd.getLayoutParams();
                    if (LLLFZ()) {
                        layoutParams3.width = ((C10KY) this.LLIZ.getValue()).LIZJ(viewTd.getContext());
                    } else {
                        int measuredWidth = viewFindViewById.getMeasuredWidth() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80));
                        int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(320));
                        if (measuredWidth > iLIZIZ3) {
                            measuredWidth = iLIZIZ3;
                        }
                        layoutParams3.width = measuredWidth;
                    }
                    C786410Ut5.W5(viewTd, layoutParams3);
                    int iLIZIZ4 = ((layoutParams3.width - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) * 2)) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)) * 2)) / 3;
                    C10LK c10lk = (C10LK) viewTd.findViewById(R.id.ws7);
                    C10LK c10lk2 = (C10LK) viewTd.findViewById(R.id.ws7);
                    int i3 = C10LK.LLJL;
                    c10lk.LJIIIIZZ(iLIZIZ4, (iLIZIZ4 * 4) / 3, C418440Gaw.LIZIZ(10), c10lk2);
                    int iLIZIZ5 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(320));
                    int iLIZIZ6 = C1389340mG4.LIZJ(C1388190mED.LIZ(viewTd.getContext()), null).LIZIZ - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80));
                    if (iLIZIZ5 > iLIZIZ6) {
                        iLIZIZ5 = iLIZIZ6;
                    }
                    this.LLILZIL = (int) (iLIZIZ5 * ((C10KU) this.LLILZLL.getValue()).LIZJ);
                    C10KT.LLLI(viewTd);
                    C20731616Ao c20731616Ao = new C20731616Ao(viewTd, this.LL);
                    C2211751BhN.LIZ(c20731616Ao.itemView, new C19229110Kr(c20731616Ao, this));
                    return c20731616Ao;
                }
            };
        }
        c10kt.setShowFooter(false);
        ep().setAdapter(c10kt);
        this.LLJJJJJIL = c10kt;
        ep().setEdgeEffectFactory(new C688970R0t() { // from class: X.19d2
            @Override // X.C688970R0t
            public final EdgeEffect LIZ(final RecyclerView recyclerView, final int i2) {
                return new EdgeEffect(recyclerView.getContext()) { // from class: X.19cz
                    @Override // android.widget.EdgeEffect
                    public final void onRelease() {
                        super.onRelease();
                        RecyclerView recyclerView2 = recyclerView;
                        int childCount = recyclerView2.getChildCount();
                        for (int i3 = 0; i3 < childCount; i3++) {
                            RecyclerView.ViewHolder childViewHolder = recyclerView2.getChildViewHolder(recyclerView2.getChildAt(i3));
                            if (childViewHolder == null) {
                                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeRecyclerViewHolder");
                            }
                            ((C20731616Ao) childViewHolder).LL.LJIIIZ();
                        }
                    }

                    public final void LIZ(float f) {
                        int i3;
                        if (i2 == 2) {
                            i3 = -1;
                        } else {
                            i3 = 1;
                        }
                        float height = i3 * recyclerView.getHeight() * f * 0.2f;
                        RecyclerView recyclerView2 = recyclerView;
                        int childCount = recyclerView2.getChildCount();
                        for (int i4 = 0; i4 < childCount; i4++) {
                            RecyclerView.ViewHolder childViewHolder = recyclerView2.getChildViewHolder(recyclerView2.getChildAt(i4));
                            if (childViewHolder != null) {
                                C20731616Ao c20731616Ao = (C20731616Ao) childViewHolder;
                                c20731616Ao.LL.LIZLLL();
                                View view2 = c20731616Ao.itemView;
                                C786410Ut5.Jc(view2, view2.getTranslationX() + height);
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeRecyclerViewHolder");
                            }
                        }
                    }

                    @Override // android.widget.EdgeEffect
                    public final void onAbsorb(int i3) {
                        int i4;
                        super.onAbsorb(i3);
                        if (i2 == 2) {
                            i4 = -1;
                        } else {
                            i4 = 1;
                        }
                        float f = i4 * i3 * 0.5f;
                        RecyclerView recyclerView2 = recyclerView;
                        int childCount = recyclerView2.getChildCount();
                        for (int i5 = 0; i5 < childCount; i5++) {
                            RecyclerView.ViewHolder childViewHolder = recyclerView2.getChildViewHolder(recyclerView2.getChildAt(i5));
                            if (childViewHolder != null) {
                                C21616519il c21616519il = ((C20731616Ao) childViewHolder).LL;
                                c21616519il.LIZ = f;
                                c21616519il.LJIIIZ();
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.relation.feed.v4.RecSwipeRecyclerViewHolder");
                            }
                        }
                    }

                    @Override // android.widget.EdgeEffect
                    public final void onPull(float f) {
                        super.onPull(f);
                        LIZ(f);
                    }

                    @Override // android.widget.EdgeEffect
                    public final void onPull(float f, float f2) {
                        super.onPull(f, f2);
                        LIZ(f);
                    }
                };
            }
        });
        RecSwipeViewModel recSwipeViewModelHp3 = hp();
        String str3 = this.LLJLILLLLZIIL;
        if (str3 == null) {
            str3 = null;
        }
        CopyOnWriteArrayList<C1261860iwS> copyOnWriteArrayListLIZIZ = C19229710Kx.LIZIZ(recSwipeViewModelHp3, str3);
        C10KT c10kt2 = this.LLJJJJJIL;
        if (c10kt2 != null) {
            c10kt2.addData(copyOnWriteArrayListLIZIZ);
        }
        final String str4 = this.LLJLILLLLZIIL;
        if (str4 == null) {
            str4 = null;
        }
        final int size = copyOnWriteArrayListLIZIZ.size();
        new AbstractC1223210hw7(str4, size) { // from class: X.07sV
            public final String LIZIZ;
            public final int LIZJ;
            public final String LIZLLL = "big_card_empty_track";
            public final Map<String, String> LJ;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2000107sV)) {
                    return false;
                }
                C2000107sV c2000107sV = (C2000107sV) obj;
                return Intrinsics.LJFF(this.LIZIZ, c2000107sV.LIZIZ) && this.LIZJ == c2000107sV.LIZJ;
            }

            public final int hashCode() {
                return (this.LIZIZ.hashCode() * 31) + this.LIZJ;
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("BigCardEmptyUITrack(enterFrom=");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(", count=");
                sbLIZ.append(this.LIZJ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.AbstractC1223210hw7
            public final String LIZ() {
                return this.LIZLLL;
            }

            @Override // X.AbstractC1223210hw7
            public final Map<String, String> LIZIZ() {
                return this.LJ;
            }

            {
                this.LIZIZ = str4;
                this.LIZJ = size;
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", str4);
                c2344009Gk.LIZJ(size, "count");
                this.LJ = c2344009Gk.LIZ;
            }
        }.LIZLLL(null);
        if (((Boolean) C0AJF.LIZ.getValue()).booleanValue()) {
            RecSwipeViewModel recSwipeViewModelHp4 = hp();
            recSwipeViewModelHp4.withState(new AwS34S0102000_26(copyOnWriteArrayListLIZIZ.size(), 0, recSwipeViewModelHp4, 2));
        }
        dp().LLJJ = new C0HG1() { // from class: X.10L5
            @Override // X.C0HG1
            public final void LJLJJI(int i2) {
                List<C1261860iwS> data;
                C19EG c19egLIZ2;
                RecSwipeViewModel recSwipeViewModelHp5;
                Aweme aweme;
                C0T2Y c0t2y;
                Integer num;
                boolean zLJI = MethodIDManager.LJI(71918);
                C10KT c10kt3 = this.LIZ.LLJJJJJIL;
                if (c10kt3 != null && (data = c10kt3.getData()) != null) {
                    RecSwipeCardListAssem recSwipeCardListAssem = this.LIZ;
                    if (i2 >= 0 && i2 < data.size()) {
                        int i3 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onItemSelected - position ");
                        sbLIZ.append(i2);
                        C2188811AlT.LIZIZ(sbLIZ);
                        Object objLJJJLZIJ = C13LP.LJJJLZIJ(i2 + 5, data);
                        if (objLJJJLZIJ != null) {
                            recSwipeCardListAssem.hp().Xn1(Collections.singletonList(objLJJJLZIJ));
                        }
                        C1261860iwS c1261860iwS = (C1261860iwS) ListProtector.get(data, i2);
                        if (recSwipeCardListAssem.LLJZ || (num = recSwipeCardListAssem.hp().getState().LLIZ) == null || i2 != num.intValue() || !Intrinsics.LJFF(c1261860iwS, recSwipeCardListAssem.hp().getState().LLILLL)) {
                            recSwipeCardListAssem.LLJZ = false;
                            C19229710Kx.LJFF(recSwipeCardListAssem.hp(), (C1261860iwS) ListProtector.get(data, i2));
                            recSwipeCardListAssem.hp().setState(new AwS132S0101000_26(i2, c1261860iwS, 7));
                            if (recSwipeCardListAssem.LLJZIJLIL && (c19egLIZ2 = C724240Sb0.LIZ(recSwipeCardListAssem)) != null && (aweme = (recSwipeViewModelHp5 = recSwipeCardListAssem.hp()).LLILLJJLI) != null) {
                                if (c1261860iwS == null) {
                                    c1261860iwS = recSwipeViewModelHp5.getState().LLILLL;
                                }
                                aweme.setAuthor(c1261860iwS);
                                ComponentCallbacks componentCallbacksXQ2 = C486860J7k.LIZIZ(c19egLIZ2).xQ2("page_profile");
                                if ((componentCallbacksXQ2 instanceof C0T2Y) && (c0t2y = (C0T2Y) componentCallbacksXQ2) != null) {
                                    c0t2y.Y3(aweme);
                                }
                            }
                            if (i2 == 0) {
                                recSwipeCardListAssem.LLJZIJLIL = true;
                            }
                        }
                    }
                }
                if (zLJI) {
                    MethodIDManager.LJ();
                }
            }
        };
        AssemViewModel.asyncSubscribe$default(hp(), new C2217381BqS() { // from class: X.0vdo
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1713300uga) obj).LLILZ;
            }
        }, C736820SvI.LIZLLL(), null, null, new AwS607S0100000_28(this, 123), 12, null);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0ugc
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1713300uga) obj).LLILZLL;
            }
        }, C736820SvI.LIZLLL(), AFwS315S0000000_28.get$arr$(29), 4);
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0ugd
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1713300uga) obj).LLIZLLLIL;
            }
        }, C736820SvI.LIZLLL(), AFwS315S0000000_28.get$arr$(30), 4);
        ep().addOnScrollListener(new AsS52S0100000_26(this, 5));
        C736680Sv4.LJIIIIZZ(this, hp(), new C2217381BqS() { // from class: X.0ugb
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1713300uga) obj).LLJ;
            }
        }, null, AFwS315S0000000_28.get$arr$(28), 6);
        RecSwipeViewModel recSwipeViewModelHp5 = hp();
        Context context = getContext();
        if (context != null && (lifecycleOwnerLIZIZ = C0SY5.LIZIZ(context)) != null) {
            ((IUserService) ServiceManager.get().getService(IUserService.class)).LJI().observe(lifecycleOwnerLIZIZ, new AObserverS223S0100000_19(recSwipeViewModelHp5, 65));
        }
        InterfaceC1264300j0O interfaceC1264300j0O = (InterfaceC1264300j0O) this.LLLF.getValue();
        if (interfaceC1264300j0O != null) {
            interfaceC1264300j0O.dt1(ep());
        }
    }
}
