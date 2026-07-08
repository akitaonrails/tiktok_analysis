package com.ss.android.ugc.aweme.toptab.ui;

import X.C03H8;
import X.C0JF0;
import X.C10EU;
import X.C1324840ka2;
import X.C1389340mG4;
import X.C13LP;
import X.C1699360uK6;
import X.C1ACD;
import X.C2344009Gk;
import X.C339190DRl;
import X.C343280Dd0;
import X.C419910GdJ;
import X.C423260Gii;
import X.C424620Gku;
import X.C482710IwP;
import X.C482730IwR;
import X.C486660J6q;
import X.C487710JAr;
import X.C786410Ut5;
import X.EnumC1913520ztW;
import X.InterfaceC1891350zJl;
import X.InterfaceC2175541ACi;
import X.InterfaceC482720IwQ;
import X.InterfaceC482780IwW;
import Y.ACListenerS142S0100000_7;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.live.FeedRoomTag;
import com.ss.android.ugc.aweme.feed.model.live.FeedRoomTagList;
import com.ss.android.ugc.aweme.feed.model.live.LiveAuthenticationInfo;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.TopFrameSummary;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.toptab.ui.LiveDualFeedCell;
import com.ss.android.ugc.aweme.views.RoundedFrameLayout;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveDualFeedCell extends PowerCell<C343280Dd0> implements C03H8, InterfaceC482720IwQ {
    public RemoteImageView LL;
    public FrameLayout LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public C424620Gku LLILZLL;
    public TuxTextView LLIZ;
    public RemoteImageView LLIZLLLIL;
    public TuxIconView LLJ;
    public RoundedFrameLayout LLJI;
    public C1ACD LLJIJIL;
    public InterfaceC482780IwW LLJILJIL;
    public boolean LLJILJILJ;

    public final RoundedFrameLayout I5() {
        View viewFindViewById = this.LLJI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.i4w) : null;
            this.LLJI = (RoundedFrameLayout) viewFindViewById;
        }
        return (RoundedFrameLayout) viewFindViewById;
    }

    public final RemoteImageView L5() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.kgf) : null;
            this.LL = (RemoteImageView) viewFindViewById;
        }
        return (RemoteImageView) viewFindViewById;
    }

    public final RemoteImageView N5() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.lpi) : null;
            this.LLIZLLLIL = (RemoteImageView) viewFindViewById;
        }
        return (RemoteImageView) viewFindViewById;
    }

    public final TuxTextView P5() {
        View viewFindViewById = this.LLILZ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.zb3) : null;
            this.LLILZ = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    public final TuxIconView R5() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.zb4) : null;
            this.LLJ = (TuxIconView) viewFindViewById;
        }
        return (TuxIconView) viewFindViewById;
    }

    public final TuxTextView S5() {
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.tv_title) : null;
            this.LLILZIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    @Override // X.InterfaceC482720IwQ
    public final void LJJL() {
        C339190DRl.LIZLLL(L5());
        U5(false);
        C1ACD c1acd = this.LLJIJIL;
        if (c1acd != null) {
            c1acd.LIZIZ();
        }
        C1ACD c1acd2 = this.LLJIJIL;
        if (c1acd2 != null) {
            c1acd2.LJJIJIL(null, true);
        }
        this.LLJIJIL = null;
        this.LLJILJIL = null;
    }

    public final void T5() {
        Aweme aweme;
        LiveRoomStruct newLiveRoomDataExt;
        C343280Dd0 item = getItem();
        if (item == null || (aweme = item.LL) == null || (newLiveRoomDataExt = AwemeExtKt.getNewLiveRoomDataExt(aweme)) == null) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from_merge", "homepage_live");
        c2344009Gk.LJIIIIZZ("action_type", "click");
        c2344009Gk.LJIIIIZZ("anchor_id", newLiveRoomDataExt.owner.getUid());
        c2344009Gk.LIZLLL(newLiveRoomDataExt.id, "room_id");
        c2344009Gk.LJIIIIZZ("enter_method", "live_cell");
        C487710JAr.LIZ.getClass();
        c2344009Gk.LIZJ(C487710JAr.LIZ(newLiveRoomDataExt), "follow_status");
        String str = newLiveRoomDataExt.liveReason;
        if (str == null) {
            str = "";
        }
        c2344009Gk.LJIIIIZZ("live_reason", str);
        c2344009Gk.LIZJ(getLayoutPosition(), "room_position");
        C486660J6q.LJIIJ(c2344009Gk.LIZ);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C786410Ut5.I7(new ACListenerS142S0100000_7(this, 158), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        T5();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        LJJL();
    }

    @Override // X.C03H8
    public final View LJJIJL() {
        return this.itemView;
    }

    public final void U5(boolean z) {
        int i;
        if (z) {
            C339190DRl.LIZLLL(R5());
            TuxIconView tuxIconViewR5 = R5();
            C419910GdJ c419910GdJ = new C419910GdJ();
            if (C482710IwP.LLJI) {
                i = R.raw.icon_speaker_x_mark_fill_ltr;
            } else {
                i = R.raw.icon_speaker_2_fill_ltr;
            }
            c419910GdJ.LIZ = i;
            c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
            tuxIconViewR5.setTuxIcon(c419910GdJ);
            C1ACD c1acd = this.LLJIJIL;
            if (c1acd != null) {
                c1acd.LJIILJJIL(C482710IwP.LLJI);
            }
            C786410Ut5.a9(R5(), new ACListenerS142S0100000_7(this, 159));
            return;
        }
        C339190DRl.LIZIZ(R5());
    }

    @Override // X.InterfaceC482720IwQ
    public final boolean g1(Rect rect) {
        Aweme aweme;
        LiveRoomStruct newLiveRoomDataExt;
        int i;
        C343280Dd0 item = getItem();
        if (item == null || (aweme = item.LL) == null || (newLiveRoomDataExt = AwemeExtKt.getNewLiveRoomDataExt(aweme)) == null || ((newLiveRoomDataExt.liveSubOnly == 1 && newLiveRoomDataExt.maxPreviewTime > 0) || C0JF0.LIZ(newLiveRoomDataExt.maskLayer, false) || newLiveRoomDataExt.isFinish() || this.LLJILJILJ)) {
            return false;
        }
        Rect rect2 = new Rect();
        I5().getGlobalVisibleRect(rect2);
        int height = I5().getHeight();
        int i2 = rect2.top;
        int i3 = rect.top;
        if (i2 < i3) {
            i = rect2.bottom - i3;
        } else {
            int i4 = rect2.bottom;
            int i5 = rect.bottom;
            if (i4 > i5) {
                i = i5 - i2;
            } else {
                i = i4 - i2;
            }
        }
        if (height == 0 || (i * 1.0f) / height < 0.95f) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC482720IwQ
    public final void o1(C482730IwR c482730IwR) {
        Aweme aweme;
        LiveRoomStruct newLiveRoomDataExt;
        LJJL();
        C343280Dd0 item = getItem();
        if (item != null && (aweme = item.LL) != null && (newLiveRoomDataExt = AwemeExtKt.getNewLiveRoomDataExt(aweme)) != null) {
            this.LLJILJIL = c482730IwR;
            C1ACD c1acdGenerateLivePlayHelper = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).generateLivePlayHelper(new InterfaceC2175541ACi() { // from class: X.0J5N
                @Override // X.InterfaceC2175541ACi
                public final Integer Dk() {
                    return null;
                }

                @Override // X.InterfaceC2175541ACi
                public final boolean LLILLIZIL() {
                    return false;
                }

                @Override // X.InterfaceC2175541ACi
                public final void LLLIL() {
                }

                @Override // X.InterfaceC2175541ACi
                public final void LLLLJ(EnumC1913550ztZ enumC1913550ztZ, Object obj) {
                }

                @Override // X.InterfaceC2175541ACi
                public final void LLLLLLIL() {
                }

                @Override // X.InterfaceC2175541ACi
                public final Object Md() {
                    return null;
                }

                @Override // X.InterfaceC2175541ACi
                public final void T5() {
                }

                @Override // X.InterfaceC2175541ACi
                public final void Th(int i, int i2, View view) {
                }

                @Override // X.InterfaceC2175541ACi
                public final boolean U1() {
                    return false;
                }

                @Override // X.InterfaceC2175541ACi
                public final boolean We() {
                    return false;
                }

                @Override // X.InterfaceC2175541ACi
                public final Object Y7() {
                    return null;
                }

                @Override // X.InterfaceC2175541ACi
                public final void o() {
                }

                @Override // X.InterfaceC2175541ACi
                public final void oc(C945320ahu c945320ahu) {
                }

                @Override // X.InterfaceC2175541ACi
                public final void oe(String str) {
                }

                @Override // X.InterfaceC2175541ACi
                public final void sk(String str) {
                }

                @Override // X.InterfaceC2175541ACi
                public final void v() {
                    Aweme aweme2;
                    LiveRoomStruct newLiveRoomDataExt2;
                    String str;
                    List<FeedRoomTag> list;
                    FeedRoomTag feedRoomTag;
                    InterfaceC482780IwW interfaceC482780IwW = this.LL.LLJILJIL;
                    if (interfaceC482780IwW != null) {
                        interfaceC482780IwW.LJLIIIL();
                    }
                    C339190DRl.LIZIZ(this.LL.L5());
                    this.LL.U5(true);
                    LiveDualFeedCell liveDualFeedCell = this.LL;
                    C343280Dd0 item2 = liveDualFeedCell.getItem();
                    if (item2 == null || (aweme2 = item2.LL) == null || (newLiveRoomDataExt2 = AwemeExtKt.getNewLiveRoomDataExt(aweme2)) == null) {
                        return;
                    }
                    C2344009Gk c2344009Gk = new C2344009Gk();
                    c2344009Gk.LJIIIIZZ("enter_from_merge", "homepage_live");
                    c2344009Gk.LJIIIIZZ("action_type", "click");
                    User user = newLiveRoomDataExt2.owner;
                    c2344009Gk.LJIIIIZZ("anchor_id", user != null ? user.getUid() : null);
                    c2344009Gk.LIZLLL(newLiveRoomDataExt2.id, "room_id");
                    c2344009Gk.LJIIIIZZ("enter_method", "live_cell");
                    C487710JAr.LIZ.getClass();
                    c2344009Gk.LIZJ(C487710JAr.LIZ(newLiveRoomDataExt2), "follow_status");
                    c2344009Gk.LIZJ(liveDualFeedCell.getLayoutPosition(), "room_position");
                    FeedRoomTagList feedRoomTagList = newLiveRoomDataExt2.feedRoomTagList;
                    if (feedRoomTagList == null || (list = feedRoomTagList.subTags) == null || (feedRoomTag = (FeedRoomTag) C13LP.LJJJLL(list)) == null || (str = feedRoomTag.content) == null) {
                        str = "";
                    }
                    c2344009Gk.LJIIIIZZ("label", str);
                    C20684815ws.LJIILLIIL("livesdk_livetab_cover_auto_play", c2344009Gk.LIZ);
                }

                @Override // X.InterfaceC2175541ACi
                /* JADX INFO: renamed from: if */
                public final void mo29if(String str) {
                    LiveDualFeedCell liveDualFeedCell = this.LL;
                    liveDualFeedCell.LLJILJILJ = true;
                    InterfaceC482780IwW interfaceC482780IwW = liveDualFeedCell.LLJILJIL;
                    if (interfaceC482780IwW != null) {
                        interfaceC482780IwW.onPlayEnd();
                    }
                }

                @Override // X.InterfaceC2175541ACi
                public final void w9(String str) {
                    LiveDualFeedCell liveDualFeedCell = this.LL;
                    liveDualFeedCell.LLJILJILJ = true;
                    InterfaceC482780IwW interfaceC482780IwW = liveDualFeedCell.LLJILJIL;
                    if (interfaceC482780IwW != null) {
                        interfaceC482780IwW.onPlayEnd();
                    }
                }
            }, EnumC1913520ztW.CLEAN);
            c1acdGenerateLivePlayHelper.LJIILIIL(new C1699360uK6("homepage_live", "live_cell", "", null, false, true, 40));
            boolean z = C482710IwP.LLJI;
            View viewFindViewById = this.LLILLJJLI;
            if (viewFindViewById == null) {
                View viewLJJIJL = LJJIJL();
                if (viewLJJIJL != null) {
                    viewFindViewById = viewLJJIJL.findViewById(R.id.i8u);
                } else {
                    viewFindViewById = null;
                }
                this.LLILLJJLI = (FrameLayout) viewFindViewById;
            }
            c1acdGenerateLivePlayHelper.LJJIIJZLJL(z, newLiveRoomDataExt, (FrameLayout) viewFindViewById, false, null, "", false, null);
            this.LLJIJIL = c1acdGenerateLivePlayHelper;
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String title;
        String title2;
        UrlModel avatarThumb;
        UrlModel authenticationBadge;
        List<FeedRoomTag> list;
        FeedRoomTag feedRoomTag;
        String str;
        C343280Dd0 c343280Dd0 = (C343280Dd0) interfaceC1891350zJl;
        super.onBindItemView(c343280Dd0);
        View viewFindViewById = null;
        int i = (C1389340mG4.LIZJ(this.itemView.getContext(), null).LIZIZ - (C423260Gii.LLILLL * 3)) / 2;
        I5().getLayoutParams().width = i;
        I5().getLayoutParams().height = (int) (((double) i) * 1.51d);
        LiveRoomStruct newLiveRoomDataExt = AwemeExtKt.getNewLiveRoomDataExt(c343280Dd0.LL);
        if (newLiveRoomDataExt != null) {
            C339190DRl.LIZLLL(L5());
            C1324840ka2.LJFF(L5(), newLiveRoomDataExt.roomCover);
            View viewFindViewById2 = this.LLILLJJLI;
            if (viewFindViewById2 == null) {
                View viewLJJIJL = LJJIJL();
                if (viewLJJIJL != null) {
                    viewFindViewById2 = viewLJJIJL.findViewById(R.id.i8u);
                } else {
                    viewFindViewById2 = null;
                }
                this.LLILLJJLI = (FrameLayout) viewFindViewById2;
            }
            C786410Ut5.LJJJJIZL((FrameLayout) viewFindViewById2);
            View viewFindViewById3 = this.LLILLL;
            if (viewFindViewById3 == null) {
                View view = this.itemView;
                if (view != null) {
                    viewFindViewById3 = view.findViewById(R.id.tv_watch_count);
                } else {
                    viewFindViewById3 = null;
                }
                this.LLILLL = (TuxTextView) viewFindViewById3;
            }
            ((TextView) viewFindViewById3).setText(newLiveRoomDataExt.getUserCountDes());
            C339190DRl.LIZIZ(P5());
            FeedRoomTagList feedRoomTagList = newLiveRoomDataExt.feedRoomTagList;
            if (feedRoomTagList != null && (list = feedRoomTagList.subTags) != null && (feedRoomTag = (FeedRoomTag) C13LP.LJJJLL(list)) != null && (str = feedRoomTag.content) != null && !TextUtils.isEmpty(str)) {
                C339190DRl.LIZLLL(P5());
                P5().setText(str);
            }
            U5(false);
            C339190DRl.LIZLLL(S5());
            if (!TextUtils.isEmpty(newLiveRoomDataExt.title)) {
                S5().setText(newLiveRoomDataExt.title);
            } else {
                TopFrameSummary topFrameSummary = newLiveRoomDataExt.topFrameSummary;
                if (topFrameSummary != null) {
                    title = topFrameSummary.getTitle();
                } else {
                    title = null;
                }
                if (!TextUtils.isEmpty(title)) {
                    TuxTextView tuxTextViewS5 = S5();
                    TopFrameSummary topFrameSummary2 = newLiveRoomDataExt.topFrameSummary;
                    if (topFrameSummary2 != null) {
                        title2 = topFrameSummary2.getTitle();
                    } else {
                        title2 = null;
                    }
                    tuxTextViewS5.setText(title2);
                } else {
                    C339190DRl.LIZIZ(S5());
                }
            }
            View viewFindViewById4 = this.LLILZLL;
            if (viewFindViewById4 == null) {
                View viewLJJIJL2 = LJJIJL();
                if (viewLJJIJL2 != null) {
                    viewFindViewById4 = viewLJJIJL2.findViewById(R.id.kg0);
                } else {
                    viewFindViewById4 = null;
                }
                this.LLILZLL = (C424620Gku) viewFindViewById4;
            }
            viewFindViewById4.setBackgroundResource(R.drawable.ela);
            View viewFindViewById5 = this.LLILZLL;
            if (viewFindViewById5 == null) {
                View viewLJJIJL3 = LJJIJL();
                if (viewLJJIJL3 != null) {
                    viewFindViewById5 = viewLJJIJL3.findViewById(R.id.kg0);
                } else {
                    viewFindViewById5 = null;
                }
                this.LLILZLL = (C424620Gku) viewFindViewById5;
            }
            RemoteImageView remoteImageView = (RemoteImageView) viewFindViewById5;
            User user = newLiveRoomDataExt.owner;
            if (user != null) {
                avatarThumb = user.getAvatarThumb();
            } else {
                avatarThumb = null;
            }
            C1324840ka2.LJFF(remoteImageView, avatarThumb);
            View view2 = this.LLIZ;
            if (view2 == null) {
                View view3 = this.itemView;
                if (view3 != null) {
                    viewFindViewById = view3.findViewById(R.id.zz3);
                }
                this.LLIZ = (TuxTextView) viewFindViewById;
                view2 = viewFindViewById;
            }
            ((TextView) view2).setText(C10EU.LIZIZ(newLiveRoomDataExt.owner, false));
            C339190DRl.LIZIZ(N5());
            LiveAuthenticationInfo liveAuthenticationInfo = newLiveRoomDataExt.owner.authenticationInfo;
            if (liveAuthenticationInfo != null && (authenticationBadge = liveAuthenticationInfo.getAuthenticationBadge()) != null) {
                C339190DRl.LIZLLL(N5());
                C1324840ka2.LJFF(N5(), authenticationBadge);
            }
            this.LLJILJILJ = false;
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.dj7, viewGroup, false);
    }
}
