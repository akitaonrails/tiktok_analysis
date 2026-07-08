package kotlin.jvm.internal;

import X.AbstractC1347290lAF;
import X.C09AY;
import X.C0HXG;
import X.C0S9Q;
import X.C10EU;
import X.C1344030l4z;
import X.C1347110l9x;
import X.C1347120l9y;
import X.C1352050lHv;
import X.C1354820lMO;
import X.C1355960lOE;
import X.C1355990lOH;
import X.C1356160lOY;
import X.C1358490lSJ;
import X.C1358700lSe;
import X.C1358770lSl;
import X.C1364420lbs;
import X.C1375750lu9;
import X.C1389880mGw;
import X.C1389890mGx;
import X.C1ER1;
import X.C20271614Tq;
import X.C20684815ws;
import X.C2176211AEx;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C291001Au;
import X.C299060Bns;
import X.C641850PFn;
import X.EnumC1354770lMJ;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.NowKeyboardVM;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentPublishViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.input.DanmakuInputVM;
import com.ss.android.ugc.aweme.lemon.postmode.model.PostModeDetailParams;
import com.ss.android.ugc.aweme.lemon.postmode.ui.photo.model.PostModeFullPageViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.upvote.detail.panel.RepostPanelViewModel;
import com.ss.android.ugc.aweme.upvote.detail.panel.UpvotePanelFragment;
import com.ss.android.ugc.aweme.upvote.detail.replypanel.list.RepostInteractPanel;
import com.ss.android.ugc.aweme.upvote.detail.replypanel.vm.RepostInteractListViewModel;
import com.tts.oecverify.BdTuring;
import defpackage.RepostFeedEntranceVM;
import defpackage.a8;
import defpackage.b8;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public class AwS128S0101000_21 extends C09AY implements Function1 {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS128S0101000_21 awS128S0101000_21, Object obj) {
        boolean z;
        b8 b8Var = (b8) obj;
        if (((RepostFeedEntranceVM) awS128S0101000_21.l0).getState().LLILLJJLI == a8.BUTTON && awS128S0101000_21.i1 > ((RepostFeedEntranceVM) awS128S0101000_21.l0).LLILZIL) {
            z = true;
        } else {
            z = false;
        }
        return b8.LIZ(b8Var, null, a8.LIST, z, 1);
    }

    public static final Object invoke$1(AwS128S0101000_21 awS128S0101000_21, Object obj) {
        Fragment fragment = ((CommentPublishViewModel) awS128S0101000_21.l0).LLILLL;
        if (fragment != null) {
            int i = awS128S0101000_21.i1;
            if (!C299060Bns.LIZ() && !C2176211AEx.LIZJ()) {
                C1389890mGx c1389890mGx = new C1389890mGx(fragment);
                c1389890mGx.LJIIIZ(i);
                c1389890mGx.LJIIJJI();
            } else {
                C1389880mGw c1389880mGw = new C1389880mGw(fragment);
                c1389880mGw.LJIIIIZZ(i);
                c1389880mGw.LJIIJ();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS128S0101000_21 awS128S0101000_21, Object obj) {
        RepostPanelViewModel repostPanelViewModelVR = ((UpvotePanelFragment) awS128S0101000_21.l0).VR();
        int i = awS128S0101000_21.i1;
        UpvoteStruct upvoteStruct = ((C1358700lSe) obj).LLILZ;
        UpvoteList upvoteListLIZ = null;
        if (i != 0 && i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i == 5) {
                        UpvoteList upvoteList = repostPanelViewModelVR.LL;
                        if (upvoteList != null) {
                            C1358770lSl.LIZ.getClass();
                            upvoteListLIZ = C1358770lSl.LJI(upvoteList);
                        }
                        repostPanelViewModelVR.LL = upvoteListLIZ;
                        repostPanelViewModelVR.vQ2(upvoteListLIZ, false);
                    }
                } else if (upvoteStruct != null) {
                    UpvoteList upvoteList2 = repostPanelViewModelVR.LL;
                    if (upvoteList2 != null) {
                        C1358770lSl.LIZ.getClass();
                        upvoteListLIZ = C1358770lSl.LIZ(upvoteList2, upvoteStruct);
                    }
                    repostPanelViewModelVR.LL = upvoteListLIZ;
                    repostPanelViewModelVR.vQ2(upvoteListLIZ, false);
                }
            } else if (upvoteStruct == null) {
                UpvoteList upvoteList3 = repostPanelViewModelVR.LL;
                if (upvoteList3 != null) {
                    C1358770lSl.LIZ.getClass();
                    upvoteListLIZ = C1358770lSl.LJI(upvoteList3);
                }
                repostPanelViewModelVR.LL = upvoteListLIZ;
                repostPanelViewModelVR.vQ2(upvoteListLIZ, false);
            } else {
                UpvoteList upvoteList4 = repostPanelViewModelVR.LL;
                if (upvoteList4 != null) {
                    C1358770lSl.LIZ.getClass();
                    upvoteListLIZ = C1358770lSl.LIZ(upvoteList4, upvoteStruct);
                }
                repostPanelViewModelVR.LL = upvoteListLIZ;
                repostPanelViewModelVR.vQ2(upvoteListLIZ, false);
            }
        } else if (upvoteStruct != null) {
            UpvoteList upvoteList5 = repostPanelViewModelVR.LL;
            if (upvoteList5 != null) {
                C1358770lSl.LIZ.getClass();
                upvoteListLIZ = C1358770lSl.LIZ(upvoteList5, upvoteStruct);
            }
            repostPanelViewModelVR.LL = upvoteListLIZ;
            repostPanelViewModelVR.vQ2(upvoteListLIZ, false);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS128S0101000_21 awS128S0101000_21, Object obj) {
        return C1358490lSJ.LIZ((C1358490lSJ) obj, null, null, null, null, 0, new C291001Au(((Context) awS128S0101000_21.l0).getString(awS128S0101000_21.i1)), 0, 95);
    }

    public static final Object invoke$4(AwS128S0101000_21 awS128S0101000_21, Object obj) {
        return C20271614Tq.LIZ((C20271614Tq) obj, ((C1375750lu9) awS128S0101000_21.l0).LLILLL, "long_press", awS128S0101000_21.i1 + 1, "action", "default_story_icon", 3, 391533);
    }

    public static final Object invoke$5(AwS128S0101000_21 awS128S0101000_21, Object obj) {
        boolean z;
        String str;
        C20271614Tq c20271614Tq = (C20271614Tq) obj;
        C1364420lbs c1364420lbs = (C1364420lbs) awS128S0101000_21.l0;
        String str2 = c1364420lbs.LLILLJJLI;
        String strLIZ = c1364420lbs.LIZ();
        if (strLIZ != null && strLIZ.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        String str3 = "detail_page_share_panel";
        if (!z) {
            str = "detail_page_share_panel";
        } else {
            str = "click_share_button";
        }
        int i = awS128S0101000_21.i1 + 1;
        String strLIZ2 = ((C1364420lbs) awS128S0101000_21.l0).LIZ();
        if (strLIZ2 == null || strLIZ2.length() == 0) {
            str3 = "action";
        }
        return C20271614Tq.LIZ(c20271614Tq, str2, str, i, str3, "default_story_icon", 3, 391533);
    }

    public static final Object invoke$6(AwS128S0101000_21 awS128S0101000_21, Object obj) {
        RepostInteractListViewModel repostInteractListViewModelSR = ((RepostInteractPanel) awS128S0101000_21.l0).SR();
        int i = awS128S0101000_21.i1;
        UpvoteStruct upvoteStruct = ((C1358700lSe) obj).LLILZ;
        if (i != 0 && i != 1) {
            String uid = null;
            if (i != 2) {
                if (i != 4) {
                    if (i == 5) {
                        User userLIZ = C10EU.LIZ();
                        if (userLIZ != null) {
                            uid = userLIZ.getUid();
                        }
                        repostInteractListViewModelSR.xQ2(uid);
                    }
                } else if (upvoteStruct != null) {
                    repostInteractListViewModelSR.vQ2(upvoteStruct);
                }
            } else if (upvoteStruct == null) {
                User userLIZ2 = C10EU.LIZ();
                if (userLIZ2 != null) {
                    uid = userLIZ2.getUid();
                }
                repostInteractListViewModelSR.xQ2(uid);
            } else {
                repostInteractListViewModelSR.vQ2(upvoteStruct);
            }
        } else if (upvoteStruct != null) {
            repostInteractListViewModelSR.vQ2(upvoteStruct);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$7(AwS128S0101000_21 awS128S0101000_21, Object obj) {
        if (((C1354820lMO) obj).LL == EnumC1354770lMJ.SOFT_KEYBOARD) {
            DanmakuInputVM danmakuInputVM = (DanmakuInputVM) awS128S0101000_21.l0;
            danmakuInputVM.getClass();
            danmakuInputVM.setState(AFwS259S0000000_21.get$arr$(378));
        } else {
            ((DanmakuInputVM) awS128S0101000_21.l0).setState(new AwS34S0001000_21(awS128S0101000_21.i1, 7));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS128S0101000_21 awS128S0101000_21, Object obj) {
        C1352050lHv c1352050lHv = (C1352050lHv) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateSoftKeyboardState ");
        AbstractC1347290lAF abstractC1347290lAF = c1352050lHv.LLILZ;
        C1347110l9x c1347110l9x = C1347110l9x.LIZ;
        sbLIZ.append(Intrinsics.LJFF(abstractC1347290lAF, c1347110l9x));
        C1344030l4z.LIZJ("xjccccc", C2188811AlT.LIZIZ(sbLIZ));
        if (!Intrinsics.LJFF(c1352050lHv.LLILZ, c1347110l9x) && !Intrinsics.LJFF(c1352050lHv.LLILZ, C1347120l9y.LIZ)) {
            ((NowKeyboardVM) awS128S0101000_21.l0).setState(new AwS34S0001000_21(awS128S0101000_21.i1, 16));
        } else {
            ((NowKeyboardVM) awS128S0101000_21.l0).xQ2(C1347120l9y.LIZ, true);
            ((NowKeyboardVM) awS128S0101000_21.l0).setState(new AwS34S0001000_21(awS128S0101000_21.i1, 15));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(AwS128S0101000_21 awS128S0101000_21, Object obj) {
        boolean z;
        String str;
        String str2;
        C0S9Q c0s9q = (C0S9Q) obj;
        int i = c0s9q.LL;
        int i2 = awS128S0101000_21.i1;
        if (i != i2) {
            PostModeFullPageViewModel postModeFullPageViewModel = (PostModeFullPageViewModel) awS128S0101000_21.l0;
            postModeFullPageViewModel.getClass();
            postModeFullPageViewModel.setState(new AwS21S0001000_6(i2, 20));
            C1355990lOH c1355990lOH = ((PostModeFullPageViewModel) awS128S0101000_21.l0).LL;
            int i3 = awS128S0101000_21.i1;
            boolean z2 = c0s9q.LLILZ;
            boolean z3 = c0s9q.LLILZIL;
            if (z2 && i3 != c1355990lOH.LIZLLL) {
                z = true;
            } else {
                z = false;
            }
            Aweme aweme = c1355990lOH.LIZIZ;
            if (aweme != null && z3) {
                C1356160lOY c1356160lOY = C1356160lOY.LIZ;
                PostModeDetailParams postModeDetailParams = c1355990lOH.LIZJ;
                int iLIZ = C0HXG.LIZ(aweme);
                int i4 = i3 + 1;
                if (z && i3 <= c1355990lOH.LIZLLL) {
                    str = "left";
                } else {
                    str = "right";
                }
                c1356160lOY.getClass();
                C2344009Gk c2344009Gk = new C2344009Gk();
                C1355960lOE.LIZJ(c2344009Gk, postModeDetailParams);
                C1355960lOE.LIZLLL(c2344009Gk, aweme);
                C1355960lOE.LIZ(c2344009Gk, aweme);
                C1355960lOE.LJ(c2344009Gk, aweme);
                C1355960lOE.LIZIZ(c2344009Gk, aweme);
                c2344009Gk.LJFF("action_type", str);
                c2344009Gk.LJFF("enter_method", "manual_click");
                c2344009Gk.LIZJ(iLIZ, "pic_cnt");
                c2344009Gk.LIZJ(i4, "pic_location");
                C1ER1 c1er1 = C1ER1.LIZIZ;
                if (postModeDetailParams != null) {
                    str2 = postModeDetailParams.eventType;
                } else {
                    str2 = null;
                }
                C641850PFn.LIZ(c2344009Gk, c1er1.fetchSearchParams(str2, ""));
                C20684815ws.LJIILLIIL("multi_photo_slide", c2344009Gk.LIZ);
            }
            if (z) {
                c1355990lOH.LIZLLL = -1;
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS128S0101000_21(int i, PostModeFullPageViewModel postModeFullPageViewModel, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = postModeFullPageViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS128S0101000_21(RepostFeedEntranceVM repostFeedEntranceVM, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = repostFeedEntranceVM;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS128S0101000_21(C1364420lbs c1364420lbs, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c1364420lbs;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS128S0101000_21(C1375750lu9 c1375750lu9, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c1375750lu9;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS128S0101000_21(Context context, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = context;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS128S0101000_21(NowKeyboardVM nowKeyboardVM, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = nowKeyboardVM;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS128S0101000_21(CommentPublishViewModel commentPublishViewModel, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = commentPublishViewModel;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS128S0101000_21(DanmakuInputVM danmakuInputVM, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = danmakuInputVM;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS128S0101000_21(UpvotePanelFragment upvotePanelFragment, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = upvotePanelFragment;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS128S0101000_21(RepostInteractPanel repostInteractPanel, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = repostInteractPanel;
        this.i1 = i;
    }
}
