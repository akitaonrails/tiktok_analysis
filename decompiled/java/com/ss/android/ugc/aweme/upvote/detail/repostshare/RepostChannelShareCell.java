package com.ss.android.ugc.aweme.upvote.detail.repostshare;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03H5;
import X.C03IJ;
import X.C03K6;
import X.C0M7Y;
import X.C0ZP4;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C1361400lX0;
import X.C1366480lfC;
import X.C1369440ljy;
import X.C1369530lk7;
import X.C1369580lkC;
import X.C1369610lkF;
import X.C1369870lkf;
import X.C1371430lnB;
import X.C1371590lnR;
import X.C1371600lnS;
import X.C1377850lxX;
import X.C1388190mED;
import X.C1389880mGw;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C208200rA;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C621180OYa;
import X.C736680Sv4;
import X.C736820SvI;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C946803n0;
import X.EnumC1369720lkQ;
import X.InterfaceC0148002o;
import X.InterfaceC1362720lZ8;
import X.InterfaceC1366490lfD;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724530SbT;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import Y.ACListenerS154S0100000_19;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.ShareService;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.improve.channel.CopyLinkChannel;
import com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS420S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS60S2100000_21;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public final class RepostChannelShareCell extends PowerCell<C208200rA> implements IRepostChannelShareAbility, InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public C1369580lkC LL;
    public C1371590lnR LLILLJJLI;
    public final AssemVMLazy LLILLL;
    public boolean LLILZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(RepostChannelShareCell.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/upvote/detail/repostshare/ShareRepostViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LL = (C1369580lkC) this.itemView.findViewById(R.id.t9y);
        Fragment fragmentLIZ = C946803n0.LIZ(this.itemView);
        if (fragmentLIZ != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLIZ, null), this, IRepostChannelShareAbility.class, null, null);
        }
        C786410Ut5.I7(new ACListenerS154S0100000_19(this, 136), this.itemView.findViewById(R.id.fuy));
        C736680Sv4.LJIIIIZZ(this, I5(), new C2217381BqS() { // from class: X.0hoO
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1159070gGf) obj).LLILLL;
            }
        }, C736820SvI.LIZLLL(), new AwS633S0100000_19(this, 96), 4);
    }

    public RepostChannelShareCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ShareRepostViewModel.class);
        AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(c19719912DlLIZ, 1915);
        AFwS257S0000000_19 aFwS257S0000000_19 = AFwS257S0000000_19.get$arr$(328);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS563S0100000_19(c19719912DlLIZ, 1900), awS563S0100000_19, AFwS207S0000000_19.get$arr$(329), new AwS563S0100000_19((C03K6) this, 1901), new AwS563S0100000_19((C03K6) this, 1903), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 1905), aFwS257S0000000_19, new AwS563S0100000_19((C03K6) this, 1907), null, new AwS563S0100000_19((C03K6) this, 1908));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS563S0100000_19 awS563S0100000_192 = new AwS563S0100000_19((C03K6) this, 1902);
            AwS563S0100000_19 awS563S0100000_193 = new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 1904);
            AwS563S0100000_19 awS563S0100000_194 = new AwS563S0100000_19(c19719912DlLIZ, 1906);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS420S0200000_19((InterfaceC451590HnJ) obj, awS563S0100000_192, 105));
            AwS563S0100000_19 awS563S0100000_195 = new AwS563S0100000_19(c01gwLIZIZ, 1909);
            AwS563S0100000_19 awS563S0100000_196 = new AwS563S0100000_19(c01gwLIZIZ, 1910);
            AwS563S0100000_19 awS563S0100000_197 = new AwS563S0100000_19(c01gwLIZIZ, 1911);
            AwS563S0100000_19 awS563S0100000_198 = new AwS563S0100000_19(c01gwLIZIZ, 1912);
            AwS563S0100000_19 awS563S0100000_199 = new AwS563S0100000_19(c01gwLIZIZ, 1913);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS563S0100000_194, awS563S0100000_19, new C452080Ho6(), awS563S0100000_195, awS563S0100000_196, awS563S0100000_193, aFwS257S0000000_19, awS563S0100000_197, awS563S0100000_198, awS563S0100000_199);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS563S0100000_19(c19719912DlLIZ, 1914), awS563S0100000_19, AFwS207S0000000_19.get$arr$(330), new AwS563S0100000_19((C03K6) this, 1916), new AwS563S0100000_19((C03K6) this, 1917), new AwS563S0100000_19((HasDefaultViewModelProviderFactory) this, 1918), aFwS257S0000000_19, new AwS563S0100000_19((C03K6) this, 1919), null, new AwS563S0100000_19((C03K6) this, 1920));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS563S0100000_19(c19719912DlLIZ, 1921), awS563S0100000_19, AFwS207S0000000_19.get$arr$(331), new AwS563S0100000_19((C03K6) this, 1922), new AwS563S0100000_19((C03K6) this, 1923), new AwS563S0100000_19((C03K6) this, 1924), aFwS257S0000000_19, null, null, new AwS563S0100000_19((C03K6) this, 1899));
        }
        this.LLILLL = assemVMLazy;
        this.LLILZ = true;
    }

    public final ShareRepostViewModel I5() {
        AssemVMLazy assemVMLazy = this.LLILLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILZIL;
        return (ShareRepostViewModel) assemVMLazy.getValue();
    }

    @Override // com.ss.android.ugc.aweme.upvote.detail.repostshare.IRepostChannelShareAbility
    public final C1371590lnR Z2() {
        return this.LLILLJJLI;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        ShareService shareService;
        AwemeSharePackage awemeSharePackageLJJJLIIL;
        int followStatus;
        C208200rA c208200rA = (C208200rA) interfaceC1891350zJl;
        super.onBindItemView(c208200rA);
        Activity activityLIZ = C1388190mED.LIZ(this.itemView.getContext());
        if (activityLIZ != null && c208200rA.LL != null && (shareService = (ShareService) PluggableExtentionKt.pluggableSpi$default(ShareService.class, false, false, false, 14, null)) != null && (awemeSharePackageLJJJLIIL = shareService.LJJJLIIL(1, this.itemView.getContext(), c208200rA.LL, I5().LL, I5().LLILLL, "repost_share_panel")) != null) {
            Bundle bundle = awemeSharePackageLJJJLIIL.extras;
            C786410Ut5.LJJJI("aid", c208200rA.LL.getAid(), bundle);
            C786410Ut5.LJJJI("item_id_string", c208200rA.LL.getAid(), bundle);
            C786410Ut5.LJJJI("author_id", AwemeExtKt.getAuthorUid(c208200rA.LL), bundle);
            User author = c208200rA.LL.getAuthor();
            if (author != null) {
                followStatus = author.getFollowStatus();
            } else {
                followStatus = 0;
            }
            bundle.putInt("follow_status", followStatus);
            final Aweme aweme = c208200rA.LL;
            C1371600lnS c1371600lnS = new C1371600lnS();
            c1371600lnS.LJJJJI = true;
            c1371600lnS.LJJIIJZLJL = false;
            c1371600lnS.LJJJI = true;
            c1371600lnS.LIZIZ(new RepostCopyLinkChannel());
            C621180OYa.LIZ.LJIILIIL(activityLIZ, c1371600lnS, true, false);
            c1371600lnS.LJJJJJ = R.style.ac5;
            c1371600lnS.LJJIIJ = awemeSharePackageLJJJLIIL;
            c1371600lnS.LJJIL = new InterfaceC1366490lfD() { // from class: X.0lMr
                @Override // X.InterfaceC1366490lfD
                public final void LIZIZ(Context context, BaseSharePackage baseSharePackage, InterfaceC1370310llN interfaceC1370310llN) {
                }

                @Override // X.InterfaceC1366490lfD
                public final void LIZJ(View view, C1371590lnR c1371590lnR, C1370190llB c1370190llB) {
                }

                @Override // X.InterfaceC1366490lfD
                public final void LIZLLL(Context context, BaseSharePackage baseSharePackage) {
                }

                @Override // X.InterfaceC1366490lfD
                public final void LJ(Context context, BaseSharePackage baseSharePackage) {
                }

                @Override // X.InterfaceC1366490lfD
                public final void LJFF(Context context, BaseSharePackage baseSharePackage, List list) {
                }

                @Override // X.InterfaceC1366490lfD
                public final void LJI(Context context, BaseSharePackage baseSharePackage) {
                    String string = baseSharePackage.extras.getString("share_platform", "");
                    if (string != null) {
                        a0.LJJJIL(string);
                    }
                }

                @Override // X.InterfaceC1361850lXj
                public final void LIZ(InterfaceC1369790lkX interfaceC1369790lkX, boolean z, BaseSharePackage baseSharePackage, Context context) {
                    String string;
                    String string2;
                    String string3;
                    int i;
                    String string4;
                    String string5;
                    Bundle bundle2;
                    String string6;
                    Bundle bundle3;
                    String string7;
                    Bundle bundle4;
                    Bundle bundle5;
                    Bundle bundle6;
                    Bundle bundle7;
                    Bundle bundle8;
                    Bundle bundle9;
                    Bundle bundle10;
                    C1358550lSP c1358550lSP = C1358550lSP.LIZ;
                    Aweme aweme2 = aweme;
                    String str = this.I5().LL;
                    String str2 = this.I5().LLILLL;
                    c1358550lSP.getClass();
                    if (z) {
                        C1357650lQx c1357650lQx = new C1357650lQx();
                        c1357650lQx.LJJLIIIJJI = interfaceC1369790lkX.key();
                        c1357650lQx.LIZLLL = str;
                        c1357650lQx.LJJZZIII = str2;
                        c1357650lQx.LJIJI(aweme2);
                        String string8 = null;
                        if (baseSharePackage != null && (bundle10 = baseSharePackage.extras) != null) {
                            string8 = bundle10.getString("share_url");
                        }
                        c1357650lQx.LJLJJLL = string8;
                        String aid = aweme2.getAid();
                        String str3 = "";
                        if (aid == null) {
                            aid = "";
                        }
                        c1357650lQx.LJJLIIIJ = aid;
                        c1357650lQx.LJJLIIIJILLIZJL = AwemeExtKt.getAuthorUid(aweme2);
                        c1357650lQx.LJJLIIIJJIZ = C621180OYa.LIZIZ.LJJLIIIJLLLLLLLZ(interfaceC1369790lkX.key()).ordinal();
                        if (baseSharePackage == null || (bundle9 = baseSharePackage.extras) == null || (string = bundle9.getString("share_form")) == null) {
                            string = "video_form";
                        }
                        c1357650lQx.LLFII = string;
                        if (baseSharePackage == null || (bundle8 = baseSharePackage.extras) == null || (string2 = bundle8.getString("now_type")) == null) {
                            string2 = "";
                        }
                        c1357650lQx.LJJLIIIJL = string2;
                        if (baseSharePackage == null || (bundle7 = baseSharePackage.extras) == null || (string3 = bundle7.getString("OG_type")) == null) {
                            string3 = "";
                        }
                        c1357650lQx.LJJLIIIJLJLI = string3;
                        if (baseSharePackage != null && (bundle6 = baseSharePackage.extras) != null) {
                            i = bundle6.getInt("is_today");
                        } else {
                            i = 1;
                        }
                        c1357650lQx.LJJLIIIJLLLLLLLZ = i;
                        if (baseSharePackage == null || (bundle5 = baseSharePackage.extras) == null || (string4 = bundle5.getString("is_self")) == null) {
                            string4 = "";
                        }
                        c1357650lQx.LJJLIL = string4;
                        if (baseSharePackage == null || (bundle4 = baseSharePackage.extras) == null || (string5 = bundle4.getString("privacy_setting")) == null) {
                            string5 = "";
                        }
                        c1357650lQx.LJJLJ = string5;
                        if (baseSharePackage != null && (bundle3 = baseSharePackage.extras) != null && (string7 = bundle3.getString("panel_source")) != null) {
                            str3 = string7;
                        }
                        c1357650lQx.LJL = str3;
                        if (baseSharePackage != null && (bundle2 = baseSharePackage.extras) != null && (string6 = bundle2.getString("panel_source_v2")) != null && (true ^ a0.LJJJIL(string6))) {
                            c1357650lQx.LJLI = a0.LJLIIIL(string6).toString();
                        }
                        C1359610lU7.LIZIZ(aweme2, c1357650lQx);
                        c1357650lQx.LJIILJJIL();
                        C0CNO.LIZLLL(0L, new AwS60S2100000_21(aweme2, interfaceC1369790lkX.key(), str, 1));
                        if (interfaceC1369790lkX.LJJIII()) {
                            C733420Spo.LIZLLL(interfaceC1369790lkX.key());
                        }
                    }
                }

                @Override // X.InterfaceC1361850lXj
                public final Object LJII(Context context, BaseSharePackage baseSharePackage, InterfaceC1369790lkX interfaceC1369790lkX, InterfaceC1364105Vn interfaceC1364105Vn) {
                    Unit unit = Unit.LIZ;
                    C099R.LJFF();
                    return unit;
                }
            };
            this.LLILLJJLI = new C1371590lnR(c1371600lnS);
            C1361400lX0 c1361400lX0LIZ = C1369530lk7.LIZ(this.itemView.getContext());
            C1371590lnR c1371590lnR = this.LLILLJJLI;
            if (c1371590lnR != null) {
                c1371590lnR.LIZIZ = EnumC1369720lkQ.COLLAPSE;
                C1369610lkF c1369610lkF = new C1369610lkF();
                c1369610lkF.LIZJ = false;
                c1369610lkF.LIZIZ = true;
                c1371590lnR.LJJLIIIJ = c1369610lkF;
                C1369580lkC c1369580lkC = this.LL;
                if (c1369580lkC != null) {
                    c1369580lkC.LLJJIII = c1371590lnR;
                    C1366480lfC.LIZIZ(c1371590lnR, c1369580lkC, "first_panel", c1361400lX0LIZ, new InterfaceC1362720lZ8() { // from class: X.0hoQ
                        @Override // X.InterfaceC1362720lZ8
                        public final void Ds(Function0<Unit> function0) {
                        }

                        @Override // X.InterfaceC1362720lZ8
                        public final void s1(int i) {
                        }

                        @Override // X.InterfaceC1362720lZ8
                        public final void F8(AbstractC343940De4 abstractC343940De4) {
                            this.LL.I5().vQ2();
                        }
                    });
                }
                if (this.LLILZ) {
                    ArrayList<JSONObject> arrayList = C1369870lkf.LIZ;
                    C1369870lkf.LJIJ(c1371590lnR);
                    C1369870lkf.LJIILL(c1371590lnR);
                    this.LLILZ = false;
                }
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(C1369530lk7.LIZ(viewGroup.getContext())), R.layout.i69, viewGroup, false);
    }

    /* JADX INFO: loaded from: classes22.dex */
    public static final class RepostCopyLinkChannel extends CopyLinkChannel {
        public RepostCopyLinkChannel() {
            super(false);
        }

        @Override // com.ss.android.ugc.aweme.share.improve.channel.CopyLinkChannel, com.ss.android.ugc.aweme.channel.share.model.PureLogicChannel, X.InterfaceC1369790lkX
        public final boolean LJJIFFI(C1371430lnB c1371430lnB, Context context, C0M7Y c0m7y) {
            String strLIZIZ;
            C19EG c19eg;
            FragmentManager supportFragmentManager;
            Fragment fragmentLJJJJZI;
            String str = c1371430lnB.LIZJ;
            if (str != null && str.length() != 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c1371430lnB.LIZJ);
                sbLIZ.append(' ');
                sbLIZ.append(c1371430lnB.LIZLLL);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                strLIZIZ = c1371430lnB.LIZLLL;
            }
            View viewLIZIZ = null;
            C1377850lxX c1377850lxX = new C1377850lxX(null, false, 3);
            Cert certLIZ = C1369440ljy.LIZ();
            if (c0m7y != null) {
                viewLIZIZ = c0m7y.LIZIZ();
            }
            c1377850lxX.LIZ(strLIZIZ, context, certLIZ, viewLIZIZ);
            Activity activityLIZ = C1388190mED.LIZ(context);
            if ((activityLIZ instanceof C19GS) && (c19eg = (C19EG) activityLIZ) != null && (supportFragmentManager = c19eg.getSupportFragmentManager()) != null && (fragmentLJJJJZI = supportFragmentManager.LJJJJZI("UpvotePanel")) != null) {
                C1389880mGw c1389880mGw = new C1389880mGw(fragmentLJJJJZI);
                c1389880mGw.LJIIIIZZ(2131829543);
                c1389880mGw.LJIIJ();
            }
            return true;
        }
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
