package com.ss.android.ugc.aweme.tako.botpage.components.user;

import X.C019F;
import X.C01GW;
import X.C03IT;
import X.C09R3;
import X.C0DSB;
import X.C0HHT;
import X.C0PEM;
import X.C0R2X;
import X.C0R46;
import X.C1308910kAL;
import X.C1387050mCN;
import X.C13IQ;
import X.C13LC;
import X.C13LE;
import X.C1637806bA;
import X.C1637906bB;
import X.C1843500y4a;
import X.C1862330yYx;
import X.C1863850ybP;
import X.C1908030zkf;
import X.C19719912Dl;
import X.C19ME;
import X.C1DFH;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2296808zG;
import X.C23250099c;
import X.C325401Oa;
import X.C341940Daq;
import X.C384050F3z;
import X.C418440Gaw;
import X.C427660Gpo;
import X.C427690Gpr;
import X.C452501pT;
import X.C687390Qxl;
import X.C689330R2d;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C737910Sx3;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1587906Jp;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC689340R2e;
import X.InterfaceC712990Rxx;
import Y.ACListenerS114S0200000_10;
import Y.AObserverS214S0100000_10;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.BlockStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.botpage.components.action.multiple.TakoMultipleSelectVM;
import com.ss.android.ugc.aweme.tako.botpage.components.user.vm.TakoUserCardVM;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoBlockInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoCertInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoFollowInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPrivateInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoRelationInfo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoUserItem;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.ss.android.ugc.aweme.userservice.api.IUserService;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AFwS241S0000000_10;
import kotlin.jvm.internal.AwS446S0200000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class TakoUserAssem extends ReusedUISlotAssem<TakoUserAssem> implements InterfaceC712990Rxx<InterfaceC689340R2e> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIIL;
    public final int LLJJLIIIJLLLLLLLZ;
    public final InterfaceC1731706qJ LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;
    public int LLJLLL;
    public User LLJZ;
    public String LLJZIJLIL;
    public RelationButton LLL;
    public TuxTextView LLLF;
    public C427660Gpo LLLFF;
    public TuxTextView LLLFFI;
    public TuxTextView LLLFZ;
    public View LLLI;
    public boolean LLLII;
    public final InterfaceC1731706qJ LLLIIII;
    public final AObserverS214S0100000_10 LLLIIIIL;
    public final C01GW LLLIIIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoUserAssem.class, "userViewModel", "getUserViewModel()Lcom/ss/android/ugc/aweme/tako/botpage/components/user/vm/TakoUserCardVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(TakoUserAssem.class, "multipleSelectVM", "getMultipleSelectVM()Lcom/ss/android/ugc/aweme/tako/botpage/components/action/multiple/TakoMultipleSelectVM;", 0);
        c09r3.getClass();
        LLLIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public TakoUserAssem() {
        this((Object) null);
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final TakoCardAbility up() {
        return (TakoCardAbility) this.LLJLILLLLZIIL.getValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    public TakoUserAssem(int i) {
        this.LLJJLIIIJLLLLLLLZ = i;
        C0HHT c0hht = C0HHT.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoUserCardVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0hht, c1637906bB, new AwS554S0100000_10((C13IQ) c19719912DlLIZ, 859), null, AFwS241S0000000_10.get$arr$(373));
        this.LLJLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 858));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 861));
        this.LLJLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 862));
        this.LLJLLIL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(352));
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(TakoMultipleSelectVM.class);
        this.LLLIIII = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS554S0100000_10((C13IQ) c19719912DlLIZ2, 860), null, AFwS241S0000000_10.get$arr$(374));
        this.LLLIIIIL = new AObserverS214S0100000_10(this, 70);
        this.LLLIIIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 857));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        View viewFindViewById = view.findViewById(R.id.xd3);
        this.LLLI = viewFindViewById;
        if (viewFindViewById != null) {
            view = viewFindViewById;
        }
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZ = C1308910kAL.LIZ(R.attr.c3, view.getContext());
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(12));
        c384050F3z.LJ = C1308910kAL.LIZ(R.attr.a01, view.getContext());
        c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))));
        view.setBackground(c384050F3z.LIZ(view.getContext()));
        this.LLLFF = (C427660Gpo) view.findViewById(R.id.l5i);
        this.LLLFFI = (TuxTextView) view.findViewById(R.id.z4u);
        this.LLLFZ = (TuxTextView) view.findViewById(R.id.z7n);
        this.LLL = (RelationButton) view.findViewById(R.id.t4f);
        this.LLLF = (TuxTextView) view.findViewById(R.id.z41);
        StateListDrawable stateListDrawable = new StateListDrawable();
        C427660Gpo c427660Gpo = this.LLLFF;
        if (c427660Gpo == null) {
            c427660Gpo = null;
        }
        c427660Gpo.setForeground(stateListDrawable);
        C427690Gpr.LJII(view);
        NextLiveData<BlockStatus> nextLiveDataLJI = ((IUserService) this.LLJLLIL.getValue()).LJI();
        nextLiveDataLJI.removeObserver(this.LLLIIIIL);
        nextLiveDataLJI.observe(this, this.LLLIIIIL);
        ((TakoMultipleSelectVM) this.LLLIIII.getValue(this, LLLIIL[1])).GQ2(new AwS589S0100000_10(this, 438));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC689340R2e interfaceC689340R2e) {
        Long lValueOf;
        String uid;
        Long lValueOf2;
        String uid2;
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        String str;
        Long lValueOf3;
        String str2;
        String string;
        Integer numValueOf;
        String str3;
        Integer numValueOf2;
        Message messageYy1;
        TakoCardAbility takoCardAbilityUp;
        Message messageYy12;
        Message messageYy13;
        Message messageYy14;
        TakoMixFeed takoMixFeedLJIIIZ;
        String uid3;
        Message messageYy15;
        Message messageYy16;
        Message messageYy17;
        Message messageYy18;
        UrlModel avatarThumb;
        List<String> urlList;
        int i;
        InterfaceC689340R2e interfaceC689340R2e2 = interfaceC689340R2e;
        TakoUserItem user = interfaceC689340R2e2.getUser();
        if (user != null && user.userId != 0) {
            Long lValueOf4 = null;
            if (1 != 0) {
                TakoUserItem user2 = interfaceC689340R2e2.getUser();
                if (user2 != null) {
                    lValueOf = Long.valueOf(user2.userId);
                } else {
                    lValueOf = null;
                }
                String strValueOf = String.valueOf(lValueOf);
                User user3 = this.LLJZ;
                if (user3 != null) {
                    uid = user3.getUid();
                } else {
                    uid = null;
                }
                if (!Intrinsics.LJFF(strValueOf, uid) || !Intrinsics.LJFF(interfaceC689340R2e2.LJ(), this.LLJZIJLIL)) {
                    Object value = this.LLJL.getValue(this, LLLIIL[0]);
                    TakoUserItem user4 = interfaceC689340R2e2.getUser();
                    if (user4 != null) {
                        lValueOf2 = Long.valueOf(user4.userId);
                    } else {
                        lValueOf2 = null;
                    }
                    String strValueOf2 = String.valueOf(lValueOf2);
                    int i2 = this.LLJLLL;
                    AwS446S0200000_10 awS446S0200000_10 = new AwS446S0200000_10(this, interfaceC689340R2e2, 7);
                    value.getClass();
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C325401Oa(strValueOf2, awS446S0200000_10, i2, null), 3);
                }
                User user5 = TakoUserCardVM.LLILLJJLI.get(String.valueOf(user.userId));
                if (user5 == null) {
                    user5 = new User();
                    TakoUserItem user6 = interfaceC689340R2e2.getUser();
                    if (user6 != null) {
                        user5.setUid(String.valueOf(user6.userId));
                        user5.setNickname(user6.nickname);
                        user5.setUniqueId(user6.username);
                        UrlModel urlModel = new UrlModel();
                        urlModel.setUrlList(user6.avatar.urlList);
                        user5.setAvatarThumb(urlModel);
                        user5.setCustomVerify(user6.certInfo.customVerify);
                        user5.setFollowerCount(user6.relationInfo.followInfo.followerCount);
                        user5.setFollowStatus(user6.relationInfo.followInfo.followStatus);
                        user5.setFollowerStatus(user6.relationInfo.followInfo.followerStatus);
                        TakoBlockInfo takoBlockInfo = user6.relationInfo.blockInfo;
                        user5.isBlock = takoBlockInfo.isBlock;
                        user5.setBlocked(takoBlockInfo.isBlocked);
                        TakoBlockInfo takoBlockInfo2 = user6.relationInfo.blockInfo;
                        if (takoBlockInfo2.isBlock) {
                            if (takoBlockInfo2.isBlocked) {
                                i = 4;
                            } else {
                                i = 1;
                            }
                        } else if (takoBlockInfo2.isBlocked) {
                            i = 2;
                        } else {
                            i = 0;
                        }
                        user5.setBlockStatus(i);
                        user5.setPrivateAccount(user6.privateInfo.isPrivateAccount);
                    }
                }
                String strLJ = interfaceC689340R2e2.LJ();
                Integer numLJZL = interfaceC689340R2e2.LJZL();
                User user7 = this.LLJZ;
                if (user7 != null) {
                    uid2 = user7.getUid();
                } else {
                    uid2 = null;
                }
                boolean z = !Intrinsics.LJFF(uid2, user5.getUid());
                this.LLJZ = user5;
                this.LLJZIJLIL = strLJ;
                TuxTextView tuxTextView = this.LLLFFI;
                if (tuxTextView == null) {
                    tuxTextView = null;
                }
                tuxTextView.setText(user5.getNickname());
                Context context = getContext();
                String customVerify = user5.getCustomVerify();
                String enterpriseVerifyReason = user5.getEnterpriseVerifyReason();
                TuxTextView tuxTextView2 = this.LLLFFI;
                if (tuxTextView2 == null) {
                    tuxTextView2 = null;
                }
                C1908030zkf.LJI(context, customVerify, enterpriseVerifyReason, tuxTextView2);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('@');
                sbLIZ.append(user5.getUniqueId());
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                TuxTextView tuxTextView3 = this.LLLFZ;
                if (tuxTextView3 == null) {
                    tuxTextView3 = null;
                }
                tuxTextView3.setText(strLIZIZ);
                if (z && (avatarThumb = user5.getAvatarThumb()) != null && (urlList = avatarThumb.getUrlList()) != null) {
                    C427660Gpo c427660Gpo = this.LLLFF;
                    if (c427660Gpo == null) {
                        c427660Gpo = null;
                    }
                    C427660Gpo.LJIIJJI(c427660Gpo, new C03IT(urlList), false, new int[]{64, 64}, null, false, false, null, null, false, null, 1002);
                }
                tp(user5);
                LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C687390Qxl(this, user5, numLJZL, null), 2);
                C786410Ut5.I7(new ACListenerS114S0200000_10(this, user5, 14), LJJIJL());
                LJJIJL().setOnLongClickListener(new C0R46(this, 4));
                User user8 = this.LLJZ;
                ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) this.LLJLL.getValue();
                if (iTakoContextAbility != null && (c13lcT71 = iTakoContextAbility.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
                    C1862330yYx c1862330yYx = C1862330yYx.LIZ;
                    String str4 = c1863850ybP.LL;
                    String str5 = "";
                    if (str4 == null) {
                        str4 = "";
                    }
                    String str6 = c1863850ybP.LLILLJJLI;
                    if (str6 == null) {
                        str6 = "";
                    }
                    TakoCardAbility takoCardAbilityUp2 = up();
                    if (takoCardAbilityUp2 == null || (messageYy18 = takoCardAbilityUp2.Yy1()) == null || (str = messageYy18.uuid) == null) {
                        str = "";
                    }
                    String str7 = c1863850ybP.LLILZIL;
                    if (str7 == null) {
                        str7 = "";
                    }
                    String str8 = c1863850ybP.LLILZLL;
                    if (str8 == null) {
                        str8 = "";
                    }
                    TakoCardAbility takoCardAbilityUp3 = up();
                    if (takoCardAbilityUp3 != null && (messageYy17 = takoCardAbilityUp3.Yy1()) != null) {
                        lValueOf4 = Long.valueOf(messageYy17.botId);
                    }
                    String strValueOf3 = String.valueOf(lValueOf4);
                    TakoCardAbility takoCardAbilityUp4 = up();
                    if (takoCardAbilityUp4 != null && (messageYy16 = takoCardAbilityUp4.Yy1()) != null) {
                        lValueOf3 = Long.valueOf(messageYy16.actionId);
                    } else {
                        lValueOf3 = null;
                    }
                    TakoCardAbility takoCardAbilityUp5 = up();
                    if (takoCardAbilityUp5 != null && (messageYy15 = takoCardAbilityUp5.Yy1()) != null) {
                        str2 = messageYy15.subSessionId;
                    } else {
                        str2 = null;
                    }
                    String str9 = c1863850ybP.LLILLL;
                    if (user8 != null && (uid3 = user8.getUid()) != null) {
                        str5 = uid3;
                    }
                    TakoCardAbility takoCardAbilityUp6 = up();
                    if (takoCardAbilityUp6 != null) {
                        string = Integer.valueOf(takoCardAbilityUp6.t70()).toString();
                    } else {
                        string = null;
                    }
                    TakoCardAbility takoCardAbilityUp7 = up();
                    if (takoCardAbilityUp7 != null && (messageYy14 = takoCardAbilityUp7.Yy1()) != null && (takoMixFeedLJIIIZ = messageYy14.LJIIIZ()) != null) {
                        numValueOf = Integer.valueOf(takoMixFeedLJIIIZ.cardType);
                    } else {
                        numValueOf = null;
                    }
                    String strLIZIZ2 = C0R2X.LIZIZ(numValueOf);
                    TakoCardAbility takoCardAbilityUp8 = up();
                    if (takoCardAbilityUp8 != null && (messageYy13 = takoCardAbilityUp8.Yy1()) != null && messageYy13.isMultiAnswer) {
                        str3 = "multi_answer";
                    } else {
                        str3 = "default";
                    }
                    TakoCardAbility takoCardAbilityUp9 = up();
                    if (takoCardAbilityUp9 != null && (messageYy1 = takoCardAbilityUp9.Yy1()) != null && messageYy1.isMultiAnswer && (takoCardAbilityUp = up()) != null && (messageYy12 = takoCardAbilityUp.Yy1()) != null) {
                        numValueOf2 = Integer.valueOf(messageYy12.selectedAnswerIndex + 1);
                    } else {
                        numValueOf2 = null;
                    }
                    C1862330yYx.LJJJJJ(c1862330yYx, str4, str6, str, str7, str8, c1863850ybP.LLIZ, strValueOf3, lValueOf3, str2, str9, "user", str5, string, strLIZIZ2, null, null, null, null, str3, numValueOf2, null, null, null, null, null, null, null, null, null, false, 2145894400);
                }
                C0DSB.LIZJ(LJJIJL());
                return;
            }
        }
        C0DSB.LIZIZ(LJJIJL());
    }

    public final void sp(User user) {
        RelationButton relationButton = null;
        if (user != null && user.getFollowStatus() != -1) {
            RelationButton relationButton2 = this.LLL;
            if (relationButton2 == null) {
                relationButton2 = null;
            }
            C1387050mCN c1387050mCN = new C1387050mCN(user);
            c1387050mCN.LJIIJJI = C724240Sb0.LJI(this);
            c1387050mCN.LJIIL = C724240Sb0.LJI(this);
            relationButton2.LLLLZIL(c1387050mCN.LIZ());
            RelationButton relationButton3 = this.LLL;
            if (relationButton3 != null) {
                relationButton = relationButton3;
            }
            C0DSB.LIZJ(relationButton);
            return;
        }
        RelationButton relationButton4 = this.LLL;
        if (relationButton4 != null) {
            relationButton = relationButton4;
        }
        C0DSB.LIZIZ(relationButton);
    }

    public final void tp(User user) {
        boolean z;
        TuxTextView tuxTextView;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        TuxTextView tuxTextView2;
        Resources resources;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        if (user != null && user.isBlock) {
            z = true;
        } else {
            z = false;
        }
        String quantityString = null;
        TuxTextView tuxTextView3 = null;
        quantityString = null;
        if (z) {
            Context context = getContext();
            if (context != null) {
                TuxTextView tuxTextView4 = this.LLLF;
                if (tuxTextView4 == null) {
                    tuxTextView4 = null;
                }
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LIZ = C1308910kAL.LIZJ(R.attr.bv, context);
                c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
                tuxTextView4.setBackground(c384050F3z.LIZ(context));
            }
            TuxTextView tuxTextView5 = this.LLLF;
            if (tuxTextView5 == null) {
                tuxTextView5 = null;
            }
            ViewGroup.LayoutParams layoutParams = tuxTextView5.getLayoutParams();
            if ((layoutParams instanceof C19ME) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams2.topMargin = C341940Daq.LIZ(5.0d);
            } else {
                marginLayoutParams2 = null;
            }
            C786410Ut5.R6(tuxTextView5, marginLayoutParams2);
            TuxTextView tuxTextView6 = this.LLLF;
            if (tuxTextView6 == null) {
                tuxTextView6 = null;
            }
            int iLIZ = C341940Daq.LIZ(4.0d);
            TuxTextView tuxTextView7 = this.LLLF;
            if (tuxTextView7 == null) {
                tuxTextView7 = null;
            }
            int paddingTop = tuxTextView7.getPaddingTop();
            TuxTextView tuxTextView8 = this.LLLF;
            if (tuxTextView8 == null) {
                tuxTextView8 = null;
            }
            int paddingEnd = tuxTextView8.getPaddingEnd();
            TuxTextView tuxTextView9 = this.LLLF;
            if (tuxTextView9 == null) {
                tuxTextView9 = null;
            }
            tuxTextView6.setPadding(iLIZ, paddingTop, paddingEnd, tuxTextView9.getPaddingBottom());
            TuxTextView tuxTextView10 = this.LLLF;
            if (tuxTextView10 == null) {
                tuxTextView10 = null;
            }
            tuxTextView10.setTuxFont(61);
            TuxTextView tuxTextView11 = this.LLLF;
            if (tuxTextView11 == null) {
                tuxTextView11 = null;
            }
            tuxTextView11.setTextColorRes(R.attr.ef);
            TuxTextView tuxTextView12 = this.LLLF;
            if (tuxTextView12 == null) {
                tuxTextView12 = null;
            }
            tuxTextView12.setTuxFont(92);
            TuxTextView tuxTextView13 = this.LLLF;
            if (tuxTextView13 == null) {
                tuxTextView13 = null;
            }
            tuxTextView13.setTextColorRes(R.attr.ud);
            TuxTextView tuxTextView14 = this.LLLF;
            if (tuxTextView14 != null) {
                tuxTextView3 = tuxTextView14;
            }
            tuxTextView3.setText(2131847193);
            return;
        }
        TuxTextView tuxTextView15 = this.LLLF;
        if (tuxTextView15 == null) {
            tuxTextView15 = null;
        }
        tuxTextView15.setBackground(null);
        TuxTextView tuxTextView16 = this.LLLF;
        if (tuxTextView16 == null) {
            tuxTextView = null;
            tuxTextView16 = null;
        } else {
            tuxTextView = tuxTextView16;
        }
        ViewGroup.LayoutParams layoutParams2 = tuxTextView16.getLayoutParams();
        if ((layoutParams2 instanceof C19ME) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
            marginLayoutParams.topMargin = C341940Daq.LIZ(2.0d);
        } else {
            marginLayoutParams = null;
        }
        C786410Ut5.R6(tuxTextView, marginLayoutParams);
        TuxTextView tuxTextView17 = this.LLLF;
        if (tuxTextView17 == null) {
            tuxTextView17 = null;
        }
        tuxTextView17.setTextColorRes(R.attr.a1k);
        if (this.LLJJLIIIJLLLLLLLZ == R.layout.fm3) {
            TuxTextView tuxTextView18 = this.LLLF;
            if (tuxTextView18 == null) {
                tuxTextView18 = null;
            }
            tuxTextView18.setTuxFont(71);
        } else {
            TuxTextView tuxTextView19 = this.LLLF;
            if (tuxTextView19 == null) {
                tuxTextView2 = null;
                tuxTextView19 = null;
            } else {
                tuxTextView2 = tuxTextView19;
            }
            int paddingTop2 = tuxTextView19.getPaddingTop();
            TuxTextView tuxTextView20 = this.LLLF;
            if (tuxTextView20 == null) {
                tuxTextView20 = null;
            }
            int paddingEnd2 = tuxTextView20.getPaddingEnd();
            TuxTextView tuxTextView21 = this.LLLF;
            if (tuxTextView21 == null) {
                tuxTextView21 = null;
            }
            tuxTextView2.setPadding(0, paddingTop2, paddingEnd2, tuxTextView21.getPaddingBottom());
            TuxTextView tuxTextView22 = this.LLLF;
            if (tuxTextView22 == null) {
                tuxTextView22 = null;
            }
            tuxTextView22.setTuxFont(61);
        }
        if (user == null) {
            return;
        }
        int followerCount = user.getFollowerCount();
        String strLIZIZ = C1843500y4a.LIZIZ(followerCount);
        TuxTextView tuxTextView23 = this.LLLF;
        if (tuxTextView23 == null) {
            tuxTextView23 = null;
        }
        Context context2 = getContext();
        if (context2 != null && (resources = context2.getResources()) != null) {
            quantityString = resources.getQuantityString(2131755688, followerCount, strLIZIZ);
        }
        tuxTextView23.setText(quantityString);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC689340R2e interfaceC689340R2e) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC689340R2e interfaceC689340R2e) {
    }

    public /* synthetic */ TakoUserAssem(Object obj) {
        this(R.layout.fm2);
    }

    public static TakoUserItem yp(TakoUserItem takoUserItem, User user) {
        long j;
        try {
            j = CastLongProtector.parseLong(user.getUid());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            j = 0;
        }
        String nickname = user.getNickname();
        BaseImage baseImage = new BaseImage(null, null, user.getAvatarThumb().getUrlList(), null, user.getAvatarThumb().getWidth(), user.getAvatarThumb().getHeight(), null, null, null, null, null, null, null, null, null, 0, 0, null, 262091, null);
        String uniqueId = user.getUniqueId();
        TakoCertInfo takoCertInfo = takoUserItem.certInfo;
        TakoCertInfo takoCertInfo2 = new TakoCertInfo(takoCertInfo.isVerify, user.getCustomVerify());
        TakoRelationInfo takoRelationInfo = takoUserItem.relationInfo;
        TakoBlockInfo takoBlockInfo = new TakoBlockInfo(user.isBlock, user.isBlocked());
        TakoFollowInfo takoFollowInfo = new TakoFollowInfo(user.getFollowStatus(), user.getFollowerStatus(), user.getFollowerCount());
        takoRelationInfo.getClass();
        return new TakoUserItem(j, nickname, takoUserItem.description, baseImage, uniqueId, takoCertInfo2, new TakoRelationInfo(takoBlockInfo, takoFollowInfo), new TakoPrivateInfo(user.isAccuratePrivateAccount()));
    }

    public final void op(User user, boolean z) {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C689330R2d(this, user, z, null), 2);
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
