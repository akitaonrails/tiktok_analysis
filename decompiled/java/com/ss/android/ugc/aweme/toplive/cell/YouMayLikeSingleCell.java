package com.ss.android.ugc.aweme.toplive.cell;

import X.AbstractC482420Ivw;
import X.C03H8;
import X.C0JBN;
import X.C0KVU;
import X.C1308910kAL;
import X.C1324610kZf;
import X.C1389340mG4;
import X.C1699360uK6;
import X.C1819620xS4;
import X.C1850730yGF;
import X.C1ACD;
import X.C1AEY;
import X.C339190DRl;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C424620Gku;
import X.C481820Iuy;
import X.C482410Ivv;
import X.C482620IwG;
import X.C482710IwP;
import X.C482730IwR;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1913520ztW;
import X.InterfaceC2175541ACi;
import X.InterfaceC482720IwQ;
import X.InterfaceC482780IwW;
import Y.ACListenerS142S0100000_7;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.AuthenticationInfo;
import com.bytedance.android.livesdk.model.TopFrameSummary;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrl;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.toplive.cell.YouMayLikeSingleCell;
import com.ss.android.ugc.aweme.views.RoundedFrameLayout;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import org.json.JSONObject;
import webcast.api.feed.ToplivePageItem;

/* JADX INFO: loaded from: classes8.dex */
public final class YouMayLikeSingleCell extends ToplivePagePowerCell<C482410Ivv> implements C03H8, InterfaceC482720IwQ {
    public RemoteImageView LLILLJJLI;
    public FrameLayout LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public C424620Gku LLILZLL;
    public TuxTextView LLIZ;
    public RemoteImageView LLIZLLLIL;
    public TuxIconView LLJ;
    public View LLJI;
    public RoundedFrameLayout LLJIJIL;
    public C1ACD LLJILJIL;
    public InterfaceC482780IwW LLJILJILJ;
    public boolean LLJILLL;

    public YouMayLikeSingleCell() {
        super(true);
    }

    public final RoundedFrameLayout N5() {
        View viewFindViewById = this.LLJIJIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.i4w) : null;
            this.LLJIJIL = (RoundedFrameLayout) viewFindViewById;
        }
        return (RoundedFrameLayout) viewFindViewById;
    }

    public final RemoteImageView P5() {
        View viewFindViewById = this.LLILLJJLI;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.kgf) : null;
            this.LLILLJJLI = (RemoteImageView) viewFindViewById;
        }
        return (RemoteImageView) viewFindViewById;
    }

    public final TuxIconView R5() {
        View viewFindViewById = this.LLJ;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.lpc) : null;
            this.LLJ = (TuxIconView) viewFindViewById;
        }
        return (TuxIconView) viewFindViewById;
    }

    public final RemoteImageView S5() {
        View viewFindViewById = this.LLIZLLLIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.lpi) : null;
            this.LLIZLLLIL = (RemoteImageView) viewFindViewById;
        }
        return (RemoteImageView) viewFindViewById;
    }

    public final TuxTextView T5() {
        View viewFindViewById = this.LLILZIL;
        if (viewFindViewById == null) {
            View viewLJJIJL = LJJIJL();
            viewFindViewById = viewLJJIJL != null ? viewLJJIJL.findViewById(R.id.tv_title) : null;
            this.LLILZIL = (TuxTextView) viewFindViewById;
        }
        return (TuxTextView) viewFindViewById;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.toplive.cell.ToplivePagePowerCell
    public final void L5() {
        ToplivePageItem toplivePageItem;
        AbstractC482420Ivw abstractC482420Ivw = (AbstractC482420Ivw) getItem();
        if (abstractC482420Ivw == null || (toplivePageItem = abstractC482420Ivw.LL) == null) {
            return;
        }
        C481820Iuy c481820Iuy = C481820Iuy.LIZ;
        Room room = toplivePageItem.room;
        String str = toplivePageItem.enterMethod;
        AbstractC482420Ivw abstractC482420Ivw2 = (AbstractC482420Ivw) getItem();
        String str2 = abstractC482420Ivw2 != null ? abstractC482420Ivw2.LLILLL : null;
        c481820Iuy.getClass();
        C481820Iuy.LJ(room, str, str2);
    }

    @Override // X.InterfaceC482720IwQ
    public final void LJJL() {
        C339190DRl.LIZLLL(P5());
        V5(false);
        C1ACD c1acd = this.LLJILJIL;
        if (c1acd != null) {
            c1acd.LIZIZ();
        }
        C1ACD c1acd2 = this.LLJILJIL;
        if (c1acd2 != null) {
            c1acd2.LJJIJIL(null, true);
        }
        this.LLJILJIL = null;
        this.LLJILJILJ = null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C786410Ut5.I7(new ACListenerS142S0100000_7(this, 156), this.itemView);
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

    @Override // com.ss.android.ugc.aweme.toplive.cell.ToplivePagePowerCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: U5, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C482410Ivv c482410Ivv) {
        double d;
        Integer numLIZJ;
        String quantityString;
        String str;
        String str2;
        ImageModel avatarThumb;
        AuthenticationInfo authenticationInfo;
        ImageModel imageModel;
        Resources resources;
        User owner;
        User owner2;
        User owner3;
        StreamUrl streamUrl;
        super.onBindItemView(c482410Ivv);
        Room room = c482410Ivv.LL.room;
        if (room != null && (streamUrl = room.getStreamUrl()) != null && streamUrl.streamSizeWidth > streamUrl.streamSizeHeight) {
            d = 0.5625d;
        } else {
            d = 1.3333d;
        }
        View viewFindViewById = null;
        int iLIZIZ = C1389340mG4.LIZJ(this.itemView.getContext(), null).LIZIZ - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
        N5().getLayoutParams().width = iLIZIZ;
        N5().getLayoutParams().height = ((int) (((double) iLIZIZ) * d)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        Room room2 = c482410Ivv.LL.room;
        if (room2 != null) {
            C339190DRl.LIZLLL(P5());
            if (C482620IwG.LIZ(this.itemView.getContext())) {
                numLIZJ = C1308910kAL.LIZJ(R.attr.a03, this.itemView.getContext());
            } else {
                numLIZJ = C1308910kAL.LIZJ(R.attr.a02, this.itemView.getContext());
            }
            if (numLIZJ != null) {
                P5().setBackgroundColor(numLIZJ.intValue());
            }
            ImageModel cover = room2.getCover();
            if (cover != null || (((owner = room2.getOwner()) != null && (cover = owner.getAvatarLarge()) != null) || (((owner2 = room2.getOwner()) != null && (cover = owner2.getAvatarMedium()) != null) || ((owner3 = room2.getOwner()) != null && (cover = owner3.getAvatarThumb()) != null)))) {
                C1819620xS4.LIZ().LJIIIZ(cover).LJJI(P5());
            }
            View viewFindViewById2 = this.LLILLL;
            if (viewFindViewById2 == null) {
                View viewLJJIJL = LJJIJL();
                if (viewLJJIJL != null) {
                    viewFindViewById2 = viewLJJIJL.findViewById(R.id.i8u);
                } else {
                    viewFindViewById2 = null;
                }
                this.LLILLL = (FrameLayout) viewFindViewById2;
            }
            C786410Ut5.LJJJJIZL((FrameLayout) viewFindViewById2);
            View viewFindViewById3 = this.LLILZ;
            if (viewFindViewById3 == null) {
                View view = this.itemView;
                if (view != null) {
                    viewFindViewById3 = view.findViewById(R.id.tv_watch_count);
                } else {
                    viewFindViewById3 = null;
                }
                this.LLILZ = (TuxTextView) viewFindViewById3;
            }
            TextView textView = (TextView) viewFindViewById3;
            Context context = this.itemView.getContext();
            if (context != null && (resources = context.getResources()) != null) {
                quantityString = resources.getQuantityString(2131756011, room2.getUserCount(), C1850730yGF.LIZIZ(room2.getUserCount()));
            } else {
                quantityString = null;
            }
            textView.setText(quantityString);
            V5(false);
            C339190DRl.LIZLLL(T5());
            if (!TextUtils.isEmpty(room2.getTitle())) {
                T5().setText(room2.getTitle());
            } else {
                TopFrameSummary topFrameSummary = room2.topFrameSummary;
                if (topFrameSummary != null) {
                    str = topFrameSummary.title;
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    TuxTextView tuxTextViewT5 = T5();
                    TopFrameSummary topFrameSummary2 = room2.topFrameSummary;
                    if (topFrameSummary2 != null) {
                        str2 = topFrameSummary2.title;
                    } else {
                        str2 = null;
                    }
                    tuxTextViewT5.setText(str2);
                } else {
                    C339190DRl.LIZIZ(T5());
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
            C0JBN c0jbnLIZ = C1819620xS4.LIZ();
            User owner4 = room2.getOwner();
            if (owner4 != null) {
                avatarThumb = owner4.getAvatarThumb();
            } else {
                avatarThumb = null;
            }
            C1324610kZf c1324610kZfLJIIIZ = c0jbnLIZ.LJIIIZ(avatarThumb);
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
            c1324610kZfLJIIIZ.LJJI(viewFindViewById5);
            View view2 = this.LLIZ;
            if (view2 == null) {
                View view3 = this.itemView;
                if (view3 != null) {
                    viewFindViewById = view3.findViewById(R.id.zz3);
                }
                this.LLIZ = (TuxTextView) viewFindViewById;
                view2 = viewFindViewById;
            }
            ((TextView) view2).setText(C0KVU.LJ(room2.getOwner()));
            C339190DRl.LIZIZ(S5());
            User owner5 = room2.getOwner();
            if (owner5 != null && (authenticationInfo = owner5.getAuthenticationInfo()) != null && (imageModel = authenticationInfo.authenticationBadge) != null) {
                C339190DRl.LIZLLL(S5());
                C1819620xS4.LIZ().LJIIIZ(imageModel).LJJI(S5());
            }
            this.LLJILLL = false;
        }
    }

    public final void V5(boolean z) {
        int i;
        View viewFindViewById = null;
        if (z) {
            C339190DRl.LIZLLL(R5());
            View view = this.LLJI;
            if (view == null) {
                View viewLJJIJL = LJJIJL();
                if (viewLJJIJL != null) {
                    viewFindViewById = viewLJJIJL.findViewById(R.id.lpe);
                }
                this.LLJI = viewFindViewById;
                view = viewFindViewById;
            }
            C339190DRl.LIZLLL(view);
            TuxIconView tuxIconViewR5 = R5();
            C419910GdJ c419910GdJ = new C419910GdJ();
            if (C482710IwP.LLJI) {
                i = R.raw.icon_speaker_x_mark_ltr;
            } else {
                i = R.raw.icon_speaker_2_ltr;
            }
            c419910GdJ.LIZ = i;
            c419910GdJ.LJ = Integer.valueOf(R.attr.zi);
            tuxIconViewR5.setTuxIcon(c419910GdJ);
            C1ACD c1acd = this.LLJILJIL;
            if (c1acd != null) {
                c1acd.LJIILJJIL(C482710IwP.LLJI);
            }
            C786410Ut5.a9(R5(), new ACListenerS142S0100000_7(this, 157));
            return;
        }
        C339190DRl.LIZIZ(R5());
        View view2 = this.LLJI;
        if (view2 == null) {
            View viewLJJIJL2 = LJJIJL();
            if (viewLJJIJL2 != null) {
                viewFindViewById = viewLJJIJL2.findViewById(R.id.lpe);
            }
            this.LLJI = viewFindViewById;
            view2 = viewFindViewById;
        }
        C339190DRl.LIZIZ(view2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC482720IwQ
    public final boolean g1(Rect rect) {
        ToplivePageItem toplivePageItem;
        Room room;
        int i;
        AbstractC482420Ivw abstractC482420Ivw = (AbstractC482420Ivw) getItem();
        if (abstractC482420Ivw == null || (toplivePageItem = abstractC482420Ivw.LL) == null || (room = toplivePageItem.room) == null || this.LLJILLL || room.liveSubOnly == 1 || room.getStatus() == 4) {
            return false;
        }
        Rect rect2 = new Rect();
        N5().getGlobalVisibleRect(rect2);
        int height = N5().getHeight();
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
        if (height == 0 || (i * 1.0f) / height < 0.7f) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC482720IwQ
    public final void o1(C482730IwR c482730IwR) {
        ToplivePageItem toplivePageItem;
        Room room;
        String str;
        ToplivePageItem toplivePageItem2;
        LJJL();
        AbstractC482420Ivw abstractC482420Ivw = (AbstractC482420Ivw) getItem();
        if (abstractC482420Ivw != null && (toplivePageItem = abstractC482420Ivw.LL) != null && (room = toplivePageItem.room) != null) {
            this.LLJILJILJ = c482730IwR;
            C1ACD c1acdGenerateLivePlayHelper = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).generateLivePlayHelper(new InterfaceC2175541ACi() { // from class: X.0IwV
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
                public final void oe(String str2) {
                }

                @Override // X.InterfaceC2175541ACi
                public final void v() {
                    InterfaceC482780IwW interfaceC482780IwW = this.LL.LLJILJILJ;
                    if (interfaceC482780IwW != null) {
                        interfaceC482780IwW.LJLIIIL();
                    }
                    C339190DRl.LIZIZ(this.LL.P5());
                    this.LL.V5(true);
                    this.LL.getClass();
                }

                @Override // X.InterfaceC2175541ACi
                /* JADX INFO: renamed from: if */
                public final void mo29if(String str2) {
                    YouMayLikeSingleCell youMayLikeSingleCell = this.LL;
                    youMayLikeSingleCell.LLJILLL = true;
                    InterfaceC482780IwW interfaceC482780IwW = youMayLikeSingleCell.LLJILJILJ;
                    if (interfaceC482780IwW != null) {
                        interfaceC482780IwW.onPlayEnd();
                    }
                }

                @Override // X.InterfaceC2175541ACi
                public final void sk(String str2) {
                    Map<String, Map<String, String>> map;
                    Map<String, String> map2;
                    YouMayLikeSingleCell youMayLikeSingleCell = this.LL;
                    String str3 = null;
                    C945320ahu c945320ahu = new C945320ahu(null, str2);
                    youMayLikeSingleCell.getClass();
                    if (!C2093608Ic.LIZJ(new JSONObject(str2).optString("sub_only_live"), "1")) {
                        SeiAppData seiAppDataLJII = C969340bKe.LJII(c945320ahu);
                        if (seiAppDataLJII != null && (map = seiAppDataLJII.businessExtraInfo) != null && (map2 = map.get("sub_only_live")) != null) {
                            str3 = map2.get("sub_only_live");
                        }
                        if (!C2093608Ic.LIZJ(String.valueOf(str3), "1")) {
                            return;
                        }
                    }
                    YouMayLikeSingleCell youMayLikeSingleCell2 = this.LL;
                    youMayLikeSingleCell2.LLJILLL = true;
                    InterfaceC482780IwW interfaceC482780IwW = youMayLikeSingleCell2.LLJILJILJ;
                    if (interfaceC482780IwW != null) {
                        interfaceC482780IwW.onPlayEnd();
                    }
                }

                @Override // X.InterfaceC2175541ACi
                public final void w9(String str2) {
                    YouMayLikeSingleCell youMayLikeSingleCell = this.LL;
                    youMayLikeSingleCell.LLJILLL = true;
                    InterfaceC482780IwW interfaceC482780IwW = youMayLikeSingleCell.LLJILJILJ;
                    if (interfaceC482780IwW != null) {
                        interfaceC482780IwW.onPlayEnd();
                    }
                }
            }, EnumC1913520ztW.SEARCH);
            LiveRoomStruct liveRoomStructLIZIZ = C1AEY.LIZIZ(room);
            AbstractC482420Ivw abstractC482420Ivw2 = (AbstractC482420Ivw) getItem();
            View viewFindViewById = null;
            if (abstractC482420Ivw2 != null && (toplivePageItem2 = abstractC482420Ivw2.LL) != null) {
                str = toplivePageItem2.enterMethod;
            } else {
                str = null;
            }
            c1acdGenerateLivePlayHelper.LJIILIIL(new C1699360uK6("live_merge", str, "", null, false, true, 40));
            boolean z = C482710IwP.LLJI;
            View view = this.LLILLL;
            if (view == null) {
                View viewLJJIJL = LJJIJL();
                if (viewLJJIJL != null) {
                    viewFindViewById = viewLJJIJL.findViewById(R.id.i8u);
                }
                this.LLILLL = (FrameLayout) viewFindViewById;
                view = viewFindViewById;
            }
            c1acdGenerateLivePlayHelper.LJJIIJZLJL(z, liveRoomStructLIZIZ, (FrameLayout) view, false, null, "", false, null);
            this.LLJILJIL = c1acdGenerateLivePlayHelper;
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.dj4, viewGroup, false);
    }
}
