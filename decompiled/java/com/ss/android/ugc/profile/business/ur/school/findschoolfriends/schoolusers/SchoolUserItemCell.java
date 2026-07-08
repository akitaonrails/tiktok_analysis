package com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolusers;

import X.C01GW;
import X.C09RD;
import X.C09RE;
import X.C0S1B;
import X.C0SY7;
import X.C10EU;
import X.C1245860iWe;
import X.C1245880iWg;
import X.C1261070ivB;
import X.C1261080ivC;
import X.C1261130ivH;
import X.C1261170ivL;
import X.C1262400ixK;
import X.C1264070j01;
import X.C1265740j2i;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1336205Ku;
import X.C1383370m6R;
import X.C1387050mCN;
import X.C13LN;
import X.C13LP;
import X.C1602160rnK;
import X.C1606750ruj;
import X.C1606770rul;
import X.C1608750rxx;
import X.C1908830zlx;
import X.C1908890zm3;
import X.C19ME;
import X.C20684815ws;
import X.C2097608Jq;
import X.C2097908Jt;
import X.C2187451AjH;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C339420DSi;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426230GnV;
import X.C426750GoL;
import X.C427690Gpr;
import X.C438710HIf;
import X.C452501pT;
import X.C737760Swo;
import X.C786410Ut5;
import X.C814420VxA;
import X.C948503nH;
import X.EnumC1231460i9Q;
import X.EnumC1245890iWh;
import X.EnumC1246000iWs;
import X.EnumC1261110ivF;
import X.EnumC1262370ixH;
import X.EnumC1387060mCO;
import X.EnumC1606080rte;
import X.EnumC338610DPf;
import X.EnumC714850S2h;
import X.InterfaceC1891350zJl;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.SchoolInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.util.IUserProfilePreload;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.aweme.relation.label.RelationLabelTextView;
import com.ss.android.ugc.aweme.relation.usercard.spi.IPostListVMService;
import com.ss.android.ugc.aweme.upvote.service.IRepostListVMService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS159S0101000_19;
import kotlin.jvm.internal.AwS390S0200000_24;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes20.dex */
public final class SchoolUserItemCell extends PowerCell<C339420DSi> {
    public TuxTextView LL;
    public RelationLabelTextView LLILLL;
    public TuxTextView LLILZIL;
    public TuxTextView LLIZ;
    public RelationButton LLJ;
    public AvatarComponentView LLJI;
    public C426230GnV LLJIJIL;
    public ConstraintLayout LLJILJILJ;
    public final boolean LLJL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(503));
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(504));
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(497));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(502));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(499));
    public final C01GW LLJILLL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(494));
    public final C01GW LLJJ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(491));
    public final C01GW LLJJI = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(492));
    public final C01GW LLJJIII = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(507));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(508));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(505));
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(506));
    public final C01GW LLJJJ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(500));
    public final C01GW LLJJJIL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(496));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(498));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(509));
    public final C01GW LLJJJJLIIL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(501));
    public final C01GW LLJJL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(495));
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(493));

    public final int L5() {
        return ((Number) this.LLJILJIL.getValue()).intValue();
    }

    public final int N5() {
        return ((Number) this.LLILLJJLI.getValue()).intValue();
    }

    public final int P5() {
        return ((Number) this.LLILZ.getValue()).intValue();
    }

    public SchoolUserItemCell() {
        C1261170ivL.LIZ.getClass();
        this.LLJL = C1261170ivL.LIZ();
    }

    public final boolean I5(User user) {
        if (user.getCanMessageFollowStatusList() == null || !(!r0.isEmpty()) || C1336205Ku.LIZJ().LIZJ()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v9 */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        boolean zBooleanValue;
        EnumC1245890iWh enumC1245890iWh;
        Integer numValueOf;
        List<? extends Aweme> list;
        C1261070ivB c1261070ivB;
        EnumC1245890iWh enumC1245890iWh2;
        boolean z;
        int size;
        Object obj;
        int size2;
        Object obj2;
        ViewGroup.LayoutParams layoutParams;
        IRepostListVMService iRepostListVMService;
        IPostListVMService iPostListVMService;
        boolean z2;
        boolean z3;
        C1261130ivH c1261130ivH;
        EnumC1261110ivF enumC1261110ivF;
        boolean z4;
        UrlModel cover;
        UrlModel cover2;
        List<String> urlList;
        C19ME c19me;
        int i;
        String string;
        boolean z5;
        ViewGroup.LayoutParams layoutParams2;
        C19ME c19me2;
        int iIntValue;
        int i2;
        int i3;
        boolean z6;
        ?? r12;
        String strLJIIJ;
        String strLJIIJ2;
        TuxTextView tuxTextView;
        int i4;
        SchoolInfo schoolInfo;
        Integer num;
        int iP5;
        ViewGroup.LayoutParams layoutParams3;
        C19ME c19me3;
        ViewGroup.LayoutParams layoutParams4;
        C19ME c19me4;
        final C339420DSi c339420DSi = (C339420DSi) interfaceC1891350zJl;
        TuxTextView tuxTextView2 = this.LL;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(c339420DSi.LL);
        }
        final User user = c339420DSi.LLILLJJLI;
        Context context = this.itemView.getContext();
        Boolean bool = c339420DSi.LLILLL;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        if (Intrinsics.LJFF(c339420DSi.LLILZ, Boolean.TRUE)) {
            enumC1245890iWh = EnumC1245890iWh.SEARCH_PAGE;
        } else {
            enumC1245890iWh = EnumC1245890iWh.DEFAULT_PAGE;
        }
        Boolean bool2 = c339420DSi.LLILLL;
        if (bool2 != null) {
            bool2.booleanValue();
        }
        Boolean bool3 = c339420DSi.LLILZ;
        List<? extends Aweme> list2 = null;
        if (bool3 != null) {
            numValueOf = Integer.valueOf(bool3.booleanValue() ? 1 : 0);
        } else {
            numValueOf = null;
        }
        LifecycleOwner lifecycleOwnerLIZ = C948503nH.LIZ(this.itemView);
        if (lifecycleOwnerLIZ == null) {
            c1261070ivB = new C1261070ivB(user, new ArrayList(), null, 508);
        } else {
            C426230GnV c426230GnV = this.LLJIJIL;
            if (c426230GnV != null) {
                int visibility = c426230GnV.getVisibility();
                c426230GnV.setVisibility(8);
                C1602160rnK.LIZIZ(visibility, 8, c426230GnV);
            }
            C426230GnV c426230GnV2 = this.LLJIJIL;
            if (c426230GnV2 != null) {
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(c426230GnV2, null);
                c426230GnV2.removeAllViews();
            }
            int i5 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setUpVideoCoverView User with nickname ");
            sbLIZ.append(user.getNickname());
            C2188811AlT.LIZIZ(sbLIZ);
            MatchedFriendStruct matchedFriendStruct = user.getMatchedFriendStruct();
            if (matchedFriendStruct != null) {
                list = matchedFriendStruct.awemeList;
            } else {
                list = null;
            }
            MatchedFriendStruct matchedFriendStruct2 = user.getMatchedFriendStruct();
            if (matchedFriendStruct2 != null) {
                list2 = matchedFriendStruct2.repostAwemeList;
            }
            ArrayList arrayList = new ArrayList();
            if (numValueOf != null && numValueOf.intValue() == 1) {
                enumC1245890iWh2 = EnumC1245890iWh.SEARCH_PAGE;
            } else {
                enumC1245890iWh2 = EnumC1245890iWh.DEFAULT_PAGE;
            }
            c1261070ivB = new C1261070ivB(user, arrayList, enumC1245890iWh2, 252);
            ArrayList arrayList2 = new ArrayList();
            if (list != null && !list.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            if (z && (list2 == null || list2.isEmpty())) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("obtainShowAwemeList User with nickname ");
                sbLIZ2.append(user.getNickname());
                sbLIZ2.append(", no video");
                C2188811AlT.LIZIZ(sbLIZ2);
            } else {
                if (list != null && !list.isEmpty()) {
                    if (list2 != null) {
                        size2 = list2.size();
                    } else {
                        size2 = 0;
                    }
                    int size3 = list.size();
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("obtainShowAwemeList User with nickname ");
                    sbLIZ3.append(user.getNickname());
                    sbLIZ3.append(", videoItems has size ");
                    sbLIZ3.append(Math.min(size3, 4));
                    C2188811AlT.LIZIZ(sbLIZ3);
                    if (size3 > 3) {
                        int iMin = Math.min(size3, 4);
                        for (int i6 = 0; i6 < iMin; i6++) {
                            Object obj3 = ListProtector.get(list, i6);
                            if (obj3 != null) {
                                arrayList2.add(obj3);
                            }
                        }
                        c1261070ivB.LIZJ = Math.min(size3, 4);
                        c1261070ivB.LIZLLL = 0;
                    } else {
                        for (int i7 = 0; i7 < size3; i7++) {
                            Object obj4 = ListProtector.get(list, i7);
                            if (obj4 != null) {
                                arrayList2.add(obj4);
                            }
                        }
                        int i8 = 4 - size3;
                        int iMin2 = Math.min(i8, size2);
                        for (int i9 = 0; i9 < iMin2; i9++) {
                            if (list2 != null && (obj2 = ListProtector.get(list2, i9)) != null) {
                                arrayList2.add(obj2);
                            }
                        }
                        int i10 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("obtainShowAwemeList User with nickname ");
                        sbLIZ4.append(user.getNickname());
                        sbLIZ4.append(", repostItems has size ");
                        sbLIZ4.append(Math.min(i8, size2));
                        C2188811AlT.LIZIZ(sbLIZ4);
                        c1261070ivB.LIZJ = size3;
                        c1261070ivB.LIZLLL = Math.min(i8, size2);
                    }
                } else {
                    if (list2 != null) {
                        size = list2.size();
                    } else {
                        size = 0;
                    }
                    int iMin3 = Math.min(4, size);
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("obtainShowAwemeList User with nickname ");
                    sbLIZ5.append(user.getNickname());
                    sbLIZ5.append(", all repost videoItems has size ");
                    sbLIZ5.append(iMin3);
                    C2188811AlT.LIZIZ(sbLIZ5);
                    for (int i11 = 0; i11 < iMin3; i11++) {
                        if (list2 != null && (obj = ListProtector.get(list2, i11)) != null) {
                            arrayList2.add(obj);
                        }
                    }
                    c1261070ivB.LIZJ = 0;
                    c1261070ivB.LIZLLL = iMin3;
                }
                c1261070ivB.LIZIZ = arrayList2;
            }
            if (c1261070ivB.LIZIZ.isEmpty()) {
                int i12 = C2187451AjH.LIZ;
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("setUpVideoCoverView User with nickname ");
                sbLIZ6.append(user.getNickname());
                sbLIZ6.append(", videoItems = null");
                C2188811AlT.LIZIZ(sbLIZ6);
            } else {
                C426230GnV c426230GnV3 = this.LLJIJIL;
                if (c426230GnV3 != null) {
                    int visibility2 = c426230GnV3.getVisibility();
                    c426230GnV3.setVisibility(0);
                    C1602160rnK.LIZIZ(visibility2, 0, c426230GnV3);
                }
                AvatarComponentView avatarComponentView = this.LLJI;
                if (avatarComponentView != null) {
                    layoutParams = avatarComponentView.getLayoutParams();
                } else {
                    layoutParams = null;
                }
                if ((layoutParams instanceof C19ME) && (c19me = (C19ME) layoutParams) != null) {
                    c19me.bottomToBottom = -1;
                    C426230GnV c426230GnV4 = this.LLJIJIL;
                    if (c426230GnV4 != null) {
                        c19me.bottomToTop = c426230GnV4.getId();
                    }
                }
                int i13 = C2187451AjH.LIZ;
                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                sbLIZ7.append("setUpVideoCoverView User with nickname ");
                sbLIZ7.append(user.getNickname());
                sbLIZ7.append(", videoItems as ");
                sbLIZ7.append(c1261070ivB.LIZJ);
                sbLIZ7.append(", repostItems as ");
                sbLIZ7.append(c1261070ivB.LIZLLL);
                sbLIZ7.append(", recUserVideoConfig.awemeList.size is ");
                sbLIZ7.append(c1261070ivB.LIZIZ.size());
                C2188811AlT.LIZIZ(sbLIZ7);
                int iMin4 = Math.min(c1261070ivB.LIZIZ.size(), 4);
                for (int i14 = 0; i14 < iMin4; i14++) {
                    C426230GnV c426230GnV5 = this.LLJIJIL;
                    if (c426230GnV5 != null) {
                        c426230GnV5.addView(new C1261130ivH(this.itemView.getContext(), null, 0));
                    }
                }
                C426230GnV c426230GnV6 = this.LLJIJIL;
                if (c426230GnV6 != null) {
                    int childCount = c426230GnV6.getChildCount();
                    List<? extends Aweme> list3 = c1261070ivB.LIZIZ;
                    int iMin5 = Math.min(4, list3.size());
                    EnumC1245890iWh enumC1245890iWh3 = c1261070ivB.LJ;
                    User user2 = c1261070ivB.LIZ;
                    if (user2.getStoryStatus() > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    String accurateRecType = user2.getAccurateRecType();
                    if (accurateRecType != null && (a0.LJJIIZI(accurateRecType, "1-", false) || a0.LJJIIZI(accurateRecType, "3-", false) || a0.LJJIIZI(accurateRecType, "6-", false))) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    int i15 = c1261070ivB.LIZJ + c1261070ivB.LIZLLL;
                    int i16 = 0;
                    do {
                        View childAt = c426230GnV6.getChildAt(i16);
                        if (!(childAt instanceof C1261130ivH) || (c1261130ivH = (C1261130ivH) childAt) == null) {
                            break;
                        }
                        int visibility3 = c1261130ivH.getVisibility();
                        c1261130ivH.setVisibility(0);
                        C1602160rnK.LIZIZ(visibility3, 0, c1261130ivH);
                        if (iMin5 <= 1) {
                            enumC1261110ivF = EnumC1261110ivF.SINGLE;
                        } else if (i16 == 0) {
                            enumC1261110ivF = EnumC1261110ivF.START;
                        } else if (i16 == iMin5 - 1) {
                            enumC1261110ivF = EnumC1261110ivF.END;
                        } else {
                            enumC1261110ivF = EnumC1261110ivF.MIDDLE;
                        }
                        c1261130ivH.LLILZ = enumC1261110ivF;
                        c1261130ivH.e0();
                        c1261130ivH.h0();
                        Aweme aweme = (Aweme) C13LP.LJJJLZIJ(i16, list3);
                        if (aweme != null) {
                            user2 = user2;
                            enumC1245890iWh3 = enumC1245890iWh3;
                            C1261080ivC c1261080ivC = new C1261080ivC(c1261130ivH, i16, c1261070ivB, aweme, z2, z3, user2, enumC1245890iWh3, i15, c426230GnV6);
                            c1261130ivH.e0();
                            Video video = aweme.getVideo();
                            if (video != null && (cover2 = video.getCover()) != null && (urlList = cover2.getUrlList()) != null && !urlList.isEmpty()) {
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                            sbLIZ8.append("FindSchoolFriendsListVideoCellRedesign bindVideoCover, hasInvalidUrl is ");
                            sbLIZ8.append(z4);
                            sbLIZ8.append(", aweme.video?.cover is ");
                            Video video2 = aweme.getVideo();
                            if (video2 != null) {
                                cover = video2.getCover();
                            } else {
                                cover = null;
                            }
                            sbLIZ8.append(cover);
                            C2188811AlT.LIZIZ(sbLIZ8);
                            if (z4) {
                                c1261130ivH.getVideoCardCoverFromXml().setActualImageResource(R.attr.zm);
                                c1261080ivC.invoke(Boolean.FALSE, "Aweme Cover URL empty");
                            } else {
                                C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(aweme.getVideo().getCover()));
                                c1331670kl3LJIIIIZZ.LJJ(c1261130ivH.getVideoCardCoverFromXml());
                                c1331670kl3LJIIIIZZ.LJJIIZI(C1308910kAL.LJ(R.attr.a03, c1261130ivH.getContext()));
                                c1331670kl3LJIIIIZZ.LIZLLL("FindSchoolFriendsListVideoCellRedesign");
                                c1331670kl3LJIIIIZZ.LJJIIZ = EnumC714850S2h.SMALL;
                                c1331670kl3LJIIIIZZ.LJIIJ(new C1265740j2i(c1261080ivC, c1261130ivH, 1));
                            }
                        } else {
                            C786410Ut5.Wa(c1261130ivH, new View.OnClickListener() { // from class: X.0ivK
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                }
                            });
                            int visibility4 = c1261130ivH.getVisibility();
                            c1261130ivH.setVisibility(8);
                            C1602160rnK.LIZIZ(visibility4, 8, c1261130ivH);
                        }
                        i16++;
                    } while (i16 < 4);
                    c1261070ivB.LIZ.isAccuratePrivateAccount();
                    int i17 = C2187451AjH.LIZ;
                    StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                    sbLIZ9.append("FindSchoolFriendsListVideoCoverLayout bind, childCount is ");
                    sbLIZ9.append(childCount);
                    sbLIZ9.append(", config.awemeList.size is ");
                    sbLIZ9.append(c1261070ivB.LIZIZ.size());
                    C2188811AlT.LIZIZ(sbLIZ9);
                    Iterator<View> it2 = new C09RD(c426230GnV6).iterator();
                    int i18 = 0;
                    while (true) {
                        C09RE c09re = (C09RE) it2;
                        if (!c09re.hasNext()) {
                            break;
                        }
                        Object next = c09re.next();
                        int i19 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                        sbLIZ10.append("FindSchoolFriendsListVideoCoverLayout bind, index is ");
                        sbLIZ10.append(i18);
                        sbLIZ10.append(", getChildAt(i) is ");
                        sbLIZ10.append(next);
                        C2188811AlT.LIZIZ(sbLIZ10);
                        i18++;
                    }
                    for (int i20 = 0; i20 < childCount; i20++) {
                        int i21 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                        sbLIZ11.append("FindSchoolFriendsListVideoCoverLayout bind, index is ");
                        sbLIZ11.append(i20);
                        sbLIZ11.append(", getChildAt(i) is ");
                        sbLIZ11.append(c426230GnV6.getChildAt(i20));
                        C2188811AlT.LIZIZ(sbLIZ11);
                    }
                    if (childCount > c1261070ivB.LIZIZ.size()) {
                        for (int size4 = c1261070ivB.LIZIZ.size(); size4 < childCount; size4++) {
                            C786410Ut5.LJLLLLLL(8, c426230GnV6.getChildAt(size4));
                        }
                    }
                }
                int value = EnumC1262370ixH.FIND_SCHOOL_FRIENDS_PAGE_REDESIGN.getValue();
                EnumC1262370ixH.Companion.getClass();
                EnumC1262370ixH enumC1262370ixHLIZ = C1262400ixK.LIZ(value);
                if (enumC1262370ixHLIZ != null && (iPostListVMService = (IPostListVMService) PluggableExtentionKt.pluggableSpi$default(IPostListVMService.class, false, false, false, 14, null)) != null) {
                    iPostListVMService.LIZ(lifecycleOwnerLIZ, user, enumC1262370ixHLIZ, C2097908Jt.LIZJ(new Pair("school_tab_name", EnumC338610DPf.USER.getValue())));
                }
                if (c1261070ivB.LIZLLL > 0 && (iRepostListVMService = (IRepostListVMService) PluggableExtentionKt.pluggableSpi$default(IRepostListVMService.class, false, false, false, 14, null)) != null) {
                    iRepostListVMService.LIZ(lifecycleOwnerLIZ, c1261070ivB.LIZ, EnumC1231460i9Q.SCHOOL_COMMUNITY_PAGE.getParamValue(), c1261070ivB.LIZ.getUid(), C2097908Jt.LIZJ(new Pair("school_tab_name", EnumC338610DPf.USER.getValue())));
                }
            }
        }
        final int i22 = c1261070ivB.LIZJ;
        final int i23 = c1261070ivB.LIZLLL;
        AvatarComponentView avatarComponentView2 = this.LLJI;
        if (avatarComponentView2 != null) {
            i = 8;
            C0S1B.LIZ(avatarComponentView2, user.getUid(), c339420DSi.LLILLJJLI, this, false, null, 56);
        } else {
            i = 8;
        }
        String accurateRecType2 = user.getAccurateRecType();
        if (accurateRecType2 != null && (a0.LJJIIZI(accurateRecType2, "0-", false) || a0.LJJIIZI(accurateRecType2, "1-", false) || a0.LJJIIZI(accurateRecType2, "3-", false) || a0.LJJIIZI(accurateRecType2, "6-", false))) {
            RelationLabelTextView relationLabelTextView = this.LLILLL;
            if (relationLabelTextView != null) {
                RelationLabelTextView.LJJJJL(relationLabelTextView, user.getMatchedFriendStruct(), C1264070j01.LIZ);
            }
            z5 = true;
            RelationLabelTextView relationLabelTextView2 = this.LLILLL;
            if (relationLabelTextView2 != null) {
                C786410Ut5.LJLLLLLL(0, relationLabelTextView2);
            }
            TuxTextView tuxTextView3 = this.LLILZIL;
            if (tuxTextView3 != null) {
                C786410Ut5.LJLLLLLL(i, tuxTextView3);
            }
            TuxTextView tuxTextView4 = this.LL;
            if (tuxTextView4 != null) {
                layoutParams4 = tuxTextView4.getLayoutParams();
            } else {
                layoutParams4 = null;
            }
            if ((layoutParams4 instanceof C19ME) && (c19me4 = (C19ME) layoutParams4) != null) {
                c19me4.bottomToTop = N5();
            }
            TuxTextView tuxTextView5 = this.LL;
            if (tuxTextView5 != null) {
                tuxTextView5.requestLayout();
            }
        } else {
            Integer num2 = c339420DSi.LLILZIL;
            if (num2 != null && num2.intValue() == 0) {
                if (user.signature.length() > 0) {
                    TuxTextView tuxTextView6 = this.LLILZIL;
                    if (tuxTextView6 != null) {
                        tuxTextView6.setText(u.LJJI(user.signature, '\n', ' ', false));
                    }
                } else {
                    TuxTextView tuxTextView7 = this.LLILZIL;
                    if (tuxTextView7 != null) {
                        StringBuilder sbLIZ12 = C2188811AlT.LIZ();
                        sbLIZ12.append('@');
                        sbLIZ12.append(C10EU.LIZJ(user));
                        tuxTextView7.setText(C2188811AlT.LIZIZ(sbLIZ12));
                    }
                }
            } else {
                TuxTextView tuxTextView8 = this.LLILZIL;
                if (tuxTextView8 != null) {
                    Integer num3 = c339420DSi.LLILZIL;
                    if (num3 != null) {
                        string = context.getString(num3.intValue());
                    } else {
                        string = null;
                    }
                    tuxTextView8.setText(string);
                }
            }
            z5 = false;
            RelationLabelTextView relationLabelTextView3 = this.LLILLL;
            if (relationLabelTextView3 != null) {
                C786410Ut5.LJLLLLLL(i, relationLabelTextView3);
            }
            TuxTextView tuxTextView9 = this.LLILZIL;
            if (tuxTextView9 != null) {
                C786410Ut5.LJLLLLLL(0, tuxTextView9);
            }
            TuxTextView tuxTextView10 = this.LL;
            if (tuxTextView10 != null) {
                layoutParams2 = tuxTextView10.getLayoutParams();
            } else {
                layoutParams2 = null;
            }
            if ((layoutParams2 instanceof C19ME) && (c19me2 = (C19ME) layoutParams2) != null) {
                c19me2.bottomToTop = P5();
            }
            TuxTextView tuxTextView11 = this.LL;
            if (tuxTextView11 != null) {
                tuxTextView11.requestLayout();
            }
        }
        if (this.LLJL) {
            if (z5) {
                iP5 = N5();
            } else {
                iP5 = P5();
            }
            TuxTextView tuxTextView12 = this.LLIZ;
            if (tuxTextView12 != null) {
                layoutParams3 = tuxTextView12.getLayoutParams();
            } else {
                layoutParams3 = null;
            }
            if ((layoutParams3 instanceof C19ME) && (c19me3 = (C19ME) layoutParams3) != null) {
                c19me3.topToBottom = iP5;
            }
            TuxTextView tuxTextView13 = this.LLIZ;
            if (tuxTextView13 != null) {
                tuxTextView13.requestLayout();
            }
            TuxTextView tuxTextView14 = this.LL;
            if (tuxTextView14 != null) {
                tuxTextView14.requestLayout();
            }
        }
        List<SchoolInfo> schoolInfo2 = user.getSchoolInfo();
        if (schoolInfo2 != null && (schoolInfo = (SchoolInfo) ListProtector.get(schoolInfo2, 0)) != null && (num = schoolInfo.graduateYear) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        if (this.LLJL) {
            if (iIntValue != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            TuxTextView tuxTextView15 = this.LLIZ;
            if (tuxTextView15 != null) {
                if (z6) {
                    i4 = 0;
                } else {
                    i4 = 8;
                }
                C786410Ut5.LJLLLLLL(i4, tuxTextView15);
            }
            if (z6 && (tuxTextView = this.LLIZ) != null) {
                r12 = 1;
                tuxTextView.setText(this.itemView.getContext().getString(2131828967, C13LN.LL(2, String.valueOf(iIntValue))));
            } else {
                r12 = 1;
            }
            C1387050mCN c1387050mCN = new C1387050mCN(user);
            c1387050mCN.LIZIZ = r12;
            c1387050mCN.LJIIJJI = C948503nH.LIZ(this.itemView);
            c1387050mCN.LJIIJ = false;
            c1387050mCN.LJJIIJ = r12;
            Pair[] pairArr = new Pair[2];
            C0SY7 c0sy7 = C0SY7.FOLLOW_MUTUAL;
            if (I5(user)) {
                strLJIIJ = C1383370m6R.LJIIJ(2131837236);
            } else {
                strLJIIJ = C1383370m6R.LJIIJ(R.string.hz7);
            }
            pairArr[0] = new Pair(c0sy7, new C1908890zm3(strLJIIJ, null));
            C0SY7 c0sy72 = C0SY7.FOLLOWED;
            if (I5(user)) {
                strLJIIJ2 = C1383370m6R.LJIIJ(2131837236);
            } else {
                strLJIIJ2 = C1383370m6R.LJIIJ(R.string.jrk);
            }
            pairArr[r12] = new Pair(c0sy72, new C1908890zm3(strLJIIJ2, null));
            c1387050mCN.LJII.putAll(C2097608Jq.LJIIIIZZ(pairArr));
            c1387050mCN.LJIJJ = I5(user);
            c1387050mCN.LJ = EnumC1387060mCO.MESSAGE;
            C1908830zlx c1908830zlxLIZ = c1387050mCN.LIZ();
            RelationButton relationButton = this.LLJ;
            if (relationButton != null) {
                relationButton.LLLLZIL(c1908830zlxLIZ);
            }
            RelationButton relationButton2 = this.LLJ;
            if (relationButton2 != null) {
                relationButton2.setTracker(new AwS159S0101000_19(enumC1245890iWh, zBooleanValue ? 1 : 0, 2));
            }
        }
        if (c339420DSi.LLILLJJLI.getStoryStatus() > 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (accurateRecType2 != null && (a0.LJJIIZI(accurateRecType2, "1-", false) || a0.LJJIIZI(accurateRecType2, "3-", false) || a0.LJJIIZI(accurateRecType2, "6-", false))) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        C1245880iWg c1245880iWg = C1245880iWg.LIZ;
        int followStatus = c339420DSi.LLILLJJLI.getFollowStatus();
        int followerStatus = c339420DSi.LLILLJJLI.getFollowerStatus();
        EnumC1246000iWs enumC1246000iWs = EnumC1246000iWs.SHOW;
        C1245860iWe c1245860iWe = new C1245860iWe(EnumC1231460i9Q.SCHOOL_COMMUNITY_PAGE, null, null);
        c1245880iWg.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        C1245880iWg.LIZ(c2344009Gk, c1245860iWe);
        c2344009Gk.LIZJ(i2, "has_story");
        c2344009Gk.LIZJ(i3, "has_relation_label");
        c2344009Gk.LIZJ(followStatus, "follow_status");
        c2344009Gk.LIZJ(followerStatus, "follower_status");
        c2344009Gk.LJIIIIZZ("enter_position", enumC1245890iWh.getParamValue());
        c2344009Gk.LJIIIIZZ("action_type", enumC1246000iWs.getParamValue());
        c2344009Gk.LIZJ(i22 + i23, "item_cnt");
        C20684815ws.LJIILLIIL("show_school_member", c2344009Gk.LIZ);
        View view = this.itemView;
        final boolean z7 = i2;
        final boolean z8 = i3;
        final EnumC1245890iWh enumC1245890iWh4 = enumC1245890iWh;
        final int i24 = zBooleanValue ? 1 : 0;
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.0iWi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                IUserProfilePreload iUserProfilePreload = (IUserProfilePreload) PluggableExtentionKt.pluggableSpi$default(IUserProfilePreload.class, false, false, false, 14, null);
                if (iUserProfilePreload != null) {
                    iUserProfilePreload.LIZ(user);
                }
                C1245880iWg.LIZJ(C1245880iWg.LIZ, z7, z8, c339420DSi.LLILLJJLI.getFollowStatus(), c339420DSi.LLILLJJLI.getFollowerStatus(), enumC1245890iWh4, i22 + i23, EnumC1246000iWs.ENTER_PROFILE);
                C0OFZ c0ofzLIZJ = new C0OFY(this.itemView.getContext(), "school_community_page", user.getUid(), user.getSecUid(), (String) null, 36).LIZJ(C2097608Jq.LJIIIIZZ(new Pair("enter_position", enumC1245890iWh4.getParamValue()), new Pair("is_filter_connection", Integer.valueOf(i24))));
                String recommendReason = user.getRecommendReason();
                C736420Sue c736420Sue = C1252610ihX.Companion;
                User user3 = user;
                c736420Sue.getClass();
                c0ofzLIZJ.LIZ(C2097608Jq.LJIIIIZZ(new Pair("enter_from", "school_community_page"), new Pair("extra_previous_page", "school_community_page"), new Pair("enter_method", "school_community_page"), new Pair("recommend_enter_profile_params", new C1252610ihX("school_community_page", null, null, recommendReason, C736420Sue.LIZ(user3), null, null, null, user.getRequestId(), null, "", null, null, null, null, null, false, null, null, null, null, false, null, false, null)))).LIZIZ(0, null);
            }
        }, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v6, types: [X.0GnV, android.view.View] */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        ViewGroup.LayoutParams layoutParams;
        int iL5;
        ConstraintLayout constraintLayout = new ConstraintLayout(viewGroup.getContext());
        if (this.LLJL) {
            layoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
            C426750GoL.LJIIL(constraintLayout, 0, Integer.valueOf(((Number) this.LLJJL.getValue()).intValue()), Integer.valueOf(((Number) this.LLJJJJ.getValue()).intValue()), Integer.valueOf(((Number) this.LLJJLIIIJLLLLLLLZ.getValue()).intValue()), 16);
        } else {
            layoutParams = new ViewGroup.LayoutParams(-1, ((Number) this.LLJILLL.getValue()).intValue());
        }
        C786410Ut5.m6(constraintLayout, layoutParams);
        C427690Gpr.LJ(constraintLayout, 0.0f);
        int iGenerateViewId = View.generateViewId();
        int iGenerateViewId2 = View.generateViewId();
        int iGenerateViewId3 = View.generateViewId();
        int iGenerateViewId4 = View.generateViewId();
        if (this.LLJL) {
            ConstraintLayout constraintLayout2 = new ConstraintLayout(viewGroup.getContext());
            constraintLayout2.setId(L5());
            this.LLJILJILJ = constraintLayout2;
            C19ME c19me = new C19ME(0, -2);
            c19me.startToEnd = iGenerateViewId;
            c19me.endToStart = ((Number) this.LLIZLLLIL.getValue()).intValue();
            c19me.topToTop = iGenerateViewId;
            c19me.bottomToBottom = iGenerateViewId;
            c19me.setMarginStart(((Number) this.LLJJIJI.getValue()).intValue());
            c19me.setMarginEnd(((Number) this.LLJJIJIL.getValue()).intValue());
            constraintLayout.addView(constraintLayout2, c19me);
        }
        AvatarComponentView avatarComponentView = new AvatarComponentView(viewGroup.getContext(), null, 14);
        avatarComponentView.setId(iGenerateViewId);
        C19ME c19me2 = new C19ME(-2, -2);
        c19me2.startToStart = 0;
        c19me2.topToTop = 0;
        c19me2.bottomToBottom = 0;
        if (this.LLJL) {
            iL5 = L5();
        } else {
            iL5 = iGenerateViewId2;
        }
        c19me2.endToStart = iL5;
        if (this.LLJL) {
            c19me2.setMarginStart(((Number) this.LLJJI.getValue()).intValue());
        }
        constraintLayout.addView(avatarComponentView, c19me2);
        C1608750rxx config = avatarComponentView.getConfig();
        new AwS390S0200000_24(this, constraintLayout, 59).invoke(config.LIZ);
        config.LIZJ(new C737760Swo(new C1606750ruj(EnumC1606080rte.SCHOOL_FRIENDS_LIST, new C1606770rul(null, null, null, null, null, null, null, null, null, 511), 4)));
        config.LIZIZ(AFwS257S0000000_19.get$arr$(460));
        avatarComponentView.LJFF(avatarComponentView.getConfig());
        this.LLJI = avatarComponentView;
        TuxTextView tuxTextView = new TuxTextView(viewGroup.getContext(), null, 6, 0);
        tuxTextView.setId(iGenerateViewId2);
        tuxTextView.setTuxFont(42);
        tuxTextView.setTextColorRes(R.attr.a1h);
        tuxTextView.setMaxLines(1);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        if (!this.LLJL) {
            C19ME c19me3 = new C19ME(-2, -2);
            c19me3.startToStart = 0;
            c19me3.topToTop = 0;
            c19me3.bottomToTop = N5();
            c19me3.endToEnd = 0;
            c19me3.setMarginStart(((Number) this.LLJJIII.getValue()).intValue());
            ((ViewGroup.MarginLayoutParams) c19me3).bottomMargin = ((Number) this.LLJJJ.getValue()).intValue();
            c19me3.setMarginEnd(((Number) this.LLJJIJIIJIL.getValue()).intValue());
            c19me3.verticalChainStyle = 2;
            c19me3.horizontalChainStyle = 2;
            c19me3.horizontalBias = 0.0f;
            c19me3.constrainedWidth = true;
            constraintLayout.addView(tuxTextView, c19me3);
        } else {
            tuxTextView.setTextAlignment(5);
            ConstraintLayout constraintLayout3 = this.LLJILJILJ;
            if (constraintLayout3 != null) {
                C19ME c19me4 = new C19ME(0, -2);
                c19me4.startToStart = 0;
                c19me4.endToEnd = 0;
                c19me4.topToTop = 0;
                c19me4.constrainedWidth = true;
                constraintLayout3.addView(tuxTextView, c19me4);
            }
        }
        this.LL = tuxTextView;
        RelationLabelTextView relationLabelTextView = new RelationLabelTextView(viewGroup.getContext(), null, 6);
        relationLabelTextView.setId(N5());
        relationLabelTextView.setTuxFont(61);
        relationLabelTextView.setTextColorRes(R.attr.a1k);
        if (!this.LLJL) {
            C19ME c19me5 = new C19ME(-2, -2);
            c19me5.startToStart = 0;
            c19me5.topToBottom = iGenerateViewId2;
            c19me5.bottomToBottom = 0;
            c19me5.verticalChainStyle = 2;
            c19me5.setMarginStart(((Number) this.LLJJIII.getValue()).intValue());
            c19me5.setMarginEnd(((Number) this.LLJJIJIIJIL.getValue()).intValue());
            c19me5.horizontalBias = 0.0f;
            constraintLayout.addView(relationLabelTextView, c19me5);
        } else {
            relationLabelTextView.setTextAlignment(5);
            ConstraintLayout constraintLayout4 = this.LLJILJILJ;
            if (constraintLayout4 != null) {
                C19ME c19me6 = new C19ME(0, -2);
                c19me6.startToStart = 0;
                c19me6.endToEnd = 0;
                c19me6.topToBottom = iGenerateViewId2;
                c19me6.bottomToTop = ((Number) this.LLILZLL.getValue()).intValue();
                ((ViewGroup.MarginLayoutParams) c19me6).topMargin = ((Number) this.LLJJJJLIIL.getValue()).intValue();
                c19me6.constrainedWidth = true;
                constraintLayout4.addView(relationLabelTextView, c19me6);
            }
        }
        this.LLILLL = relationLabelTextView;
        TuxTextView tuxTextView2 = new TuxTextView(viewGroup.getContext(), null, 6, 0);
        tuxTextView2.setId(P5());
        tuxTextView2.setTuxFont(61);
        tuxTextView2.setTextColorRes(R.attr.a1k);
        tuxTextView2.setMaxLines(1);
        tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
        if (this.LLJL) {
            tuxTextView2.setTextAlignment(5);
            ConstraintLayout constraintLayout5 = this.LLJILJILJ;
            if (constraintLayout5 != null) {
                C19ME c19me7 = new C19ME(0, -2);
                c19me7.startToStart = 0;
                c19me7.endToEnd = 0;
                c19me7.topToBottom = iGenerateViewId2;
                c19me7.bottomToTop = ((Number) this.LLILZLL.getValue()).intValue();
                ((ViewGroup.MarginLayoutParams) c19me7).topMargin = ((Number) this.LLJJJJLIIL.getValue()).intValue();
                c19me7.constrainedWidth = true;
                constraintLayout5.addView(tuxTextView2, c19me7);
            }
        } else {
            C19ME c19me8 = new C19ME(-2, -2);
            c19me8.startToStart = 0;
            c19me8.topToBottom = iGenerateViewId2;
            c19me8.endToEnd = 0;
            c19me8.bottomToBottom = 0;
            c19me8.setMarginStart(((Number) this.LLJJIII.getValue()).intValue());
            c19me8.setMarginEnd(((Number) this.LLJJIJIIJIL.getValue()).intValue());
            c19me8.verticalChainStyle = 2;
            c19me8.horizontalChainStyle = 2;
            c19me8.horizontalBias = 0.0f;
            c19me8.constrainedWidth = true;
            constraintLayout.addView(tuxTextView2, c19me8);
        }
        this.LLILZIL = tuxTextView2;
        if (this.LLJL) {
            TuxTextView tuxTextView3 = new TuxTextView(viewGroup.getContext(), null, 6, 0);
            tuxTextView3.setId(((Number) this.LLILZLL.getValue()).intValue());
            tuxTextView3.setTuxFont(61);
            tuxTextView3.setTextColorRes(R.attr.a1k);
            tuxTextView3.setMaxLines(1);
            tuxTextView3.setEllipsize(TextUtils.TruncateAt.END);
            ConstraintLayout constraintLayout6 = this.LLJILJILJ;
            if (constraintLayout6 != null) {
                C19ME c19me9 = new C19ME(0, -2);
                c19me9.startToStart = 0;
                c19me9.endToEnd = 0;
                c19me9.topToBottom = P5();
                ((ViewGroup.MarginLayoutParams) c19me9).topMargin = ((Number) this.LLJJJJLIIL.getValue()).intValue();
                c19me9.constrainedWidth = true;
                constraintLayout6.addView(tuxTextView3, c19me9);
            }
            this.LLIZ = tuxTextView3;
        }
        if (!this.LLJL) {
            ImageView imageView = new ImageView(viewGroup.getContext());
            imageView.setId(iGenerateViewId3);
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_chevron_right_ltr;
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
            imageView.setImageDrawable(c419910GdJ.LIZ(imageView.getContext()));
            C19ME c19me10 = new C19ME(-2, -2);
            c19me10.endToEnd = 0;
            c19me10.topToTop = 0;
            c19me10.bottomToBottom = 0;
            c19me10.setMarginStart(((Number) this.LLJJJIL.getValue()).intValue());
            c19me10.setMarginEnd(((Number) this.LLJJJIL.getValue()).intValue());
            constraintLayout.addView(imageView, c19me10);
        } else {
            RelationButton relationButton = new RelationButton(viewGroup.getContext(), (AttributeSet) null, 0, 14);
            relationButton.setId(((Number) this.LLIZLLLIL.getValue()).intValue());
            relationButton.setTuxFont(52);
            relationButton.setButtonSize(1);
            C19ME c19me11 = new C19ME(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(88)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28)));
            c19me11.endToEnd = 0;
            c19me11.topToTop = L5();
            c19me11.bottomToBottom = L5();
            constraintLayout.addView(relationButton, c19me11);
            this.LLJ = relationButton;
        }
        if (this.LLJL) {
            final Context context = viewGroup.getContext();
            ?? r5 = new ViewGroup(context) { // from class: X.0GnV
                @Override // android.view.View
                public final void onMeasure(int i, int i2) {
                    super.onMeasure(i, i2);
                    int size = (View.MeasureSpec.getSize(i) - (((int) C12ES.LIZJ(1.0f, getContext())) * 3)) / 4;
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                    int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                    Iterator<View> it2 = new C09RD(this).iterator();
                    while (it2.hasNext()) {
                        it2.next().measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    }
                    setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(size));
                }

                @Override // android.view.ViewGroup, android.view.View
                public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
                    int iLIZJ = (int) C12ES.LIZJ(1.0f, getContext());
                    int childCount = getChildCount();
                    int childCount2 = 0;
                    int measuredWidth = 0;
                    while (true) {
                        if (childCount2 < childCount) {
                            View childAt = getChildAt(childCount2);
                            if (childCount2 == 0) {
                                if (childAt.getMeasuredWidth() >= i3) {
                                    break;
                                }
                                childAt.layout(measuredWidth, 0, childAt.getMeasuredWidth() + measuredWidth, childAt.getMeasuredHeight());
                                measuredWidth += childAt.getMeasuredWidth();
                                childCount2++;
                            } else {
                                if (childAt.getMeasuredWidth() + measuredWidth + iLIZJ >= i3) {
                                    break;
                                }
                                int i5 = measuredWidth + iLIZJ;
                                childAt.layout(i5, 0, childAt.getMeasuredWidth() + measuredWidth + iLIZJ, childAt.getMeasuredHeight());
                                measuredWidth = i5;
                                measuredWidth += childAt.getMeasuredWidth();
                                childCount2++;
                            }
                        } else {
                            childCount2 = getChildCount() - 1;
                            break;
                        }
                    }
                    int childCount3 = (getChildCount() - childCount2) - 1;
                    RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
                    removeViewsInLayout(childCount2 + 1, childCount3);
                }
            };
            r5.setId(iGenerateViewId4);
            this.LLJIJIL = r5;
            C19ME c19me12 = new C19ME(0, -2);
            c19me12.startToStart = 0;
            c19me12.endToEnd = 0;
            c19me12.topToBottom = iGenerateViewId;
            c19me12.bottomToBottom = 0;
            c19me12.setMarginStart(((Number) this.LLJJJJ.getValue()).intValue());
            ((ViewGroup.MarginLayoutParams) c19me12).topMargin = ((Number) this.LLJJJJJIL.getValue()).intValue();
            constraintLayout.addView((View) r5, c19me12);
            C426230GnV c426230GnV = this.LLJIJIL;
            if (c426230GnV != null) {
                c426230GnV.requestLayout();
            }
        }
        return constraintLayout;
    }
}
