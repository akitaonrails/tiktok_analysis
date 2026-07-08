package com.bytedance.android.livesdk.game.chatroom.drawer.category.assem;

import X.C011Z;
import X.C01D1;
import X.C09RD;
import X.C09RE;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C476560ImU;
import X.C476570ImV;
import X.C724240Sb0;
import X.C724750Sbp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC476580ImW;
import android.content.Context;
import android.os.Parcelable;
import android.view.ContextThemeWrapper;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.feed.api.FeedApi;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.livesdk.game.chatroom.drawer.category.GameDrawerCategoryViewModel;
import com.bytedance.android.livesdk.game.chatroom.drawer.category.ability.IAssemReportAbility;
import com.bytedance.android.livesdk.game.chatroom.drawer.category.ability.IDrawerCategoryFragmentAbility;
import com.bytedance.android.livesdk.game.chatroom.drawer.category.ability.IFragmentVisibleAbility;
import com.bytedance.android.livesdk.game.chatroom.drawer.category.ability.IMixCategoryAbility;
import com.bytedance.android.livesdk.livesetting.feed.FeedDrawMtSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestOptGuestDistributeStateSetting;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.model.FlareInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostWatch;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import webcast.api.game.GameDrawerCategory;

/* JADX INFO: loaded from: classes8.dex */
public abstract class BaseGameCategoryAssem extends UISlotAssem implements IAssemReportAbility {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public C476570ImV LLJJI;
    public RecyclerView LLJJIII;
    public final AssemVMLazy LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BaseGameCategoryAssem.class, "categoryViewModel", "getCategoryViewModel()Lcom/bytedance/android/livesdk/game/chatroom/drawer/category/GameDrawerCategoryViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public BaseGameCategoryAssem() {
        C01D1 c01d1 = C01D1.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(GameDrawerCategoryViewModel.class);
        this.LLJJIJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c01d1, C1637806bA.LIZ, new AwS551S0100000_7(c19719912DlLIZ, 62), AFwS237S0000000_7.get$arr$(27), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public int Co() {
        return R.layout.gm_;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onPause_isOnPauseEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onResume_isOnResumeEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    public abstract void ip();

    public abstract RecyclerView.LayoutManager kp(Context context);

    public abstract void lp();

    @Override // com.bytedance.android.livesdk.game.chatroom.drawer.category.ability.IAssemReportAbility
    public final void eE2() {
        RecyclerView recyclerView = this.LLJJIII;
        if (recyclerView == null) {
            return;
        }
        Iterator<View> it2 = new C09RD(recyclerView).iterator();
        while (true) {
            C09RE c09re = (C09RE) it2;
            if (!c09re.hasNext()) {
                return;
            }
            RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder((View) c09re.next());
            if (childViewHolder instanceof C476560ImU) {
                C476560ImU c476560ImU = (C476560ImU) childViewHolder;
                if (c476560ImU.LLILZ) {
                    c476560ImU.L5("show");
                }
            }
        }
    }

    public final GameDrawerCategoryViewModel hp() {
        AssemVMLazy assemVMLazy = this.LLJJIJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJJIJIIJIL;
        return (GameDrawerCategoryViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public void onDestroy() {
        super.onDestroy();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), IAssemReportAbility.class, null);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, IAssemReportAbility.class, null, null);
        }
    }

    @Override // X.AbstractC738140SxQ
    public final void onPause() {
        RecyclerView.LayoutManager layoutManager;
        super.onPause();
        GameDrawerCategoryViewModel gameDrawerCategoryViewModelHp = hp();
        RecyclerView recyclerView = this.LLJJIII;
        gameDrawerCategoryViewModelHp.LL = (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) ? null : layoutManager.onSaveInstanceState();
    }

    @Override // X.AbstractC738140SxQ
    public final void onResume() {
        RecyclerView recyclerView;
        RecyclerView.LayoutManager layoutManager;
        super.onResume();
        Parcelable parcelable = hp().LL;
        if (parcelable == null || (recyclerView = this.LLJJIII) == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        layoutManager.onRestoreInstanceState(parcelable);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final Context Eo(Context context) {
        return new ContextThemeWrapper(context, C011Z.LIZ.LJ());
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0IUC] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJJIII = (RecyclerView) view.findViewById(R.id.dik);
        C476570ImV c476570ImV = new C476570ImV(new InterfaceC476580ImW() { // from class: X.0IUC
            @Override // X.InterfaceC476580ImW
            public final boolean Fn() {
                IFragmentVisibleAbility iFragmentVisibleAbility = (IFragmentVisibleAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IFragmentVisibleAbility.class, null);
                if (iFragmentVisibleAbility != null) {
                    return iFragmentVisibleAbility.Fn();
                }
                return false;
            }

            @Override // X.InterfaceC476580ImW
            public final void LIZ(final int i, final GameDrawerCategory gameDrawerCategory, final View view2) {
                IDrawerCategoryFragmentAbility iDrawerCategoryFragmentAbility = (IDrawerCategoryFragmentAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IDrawerCategoryFragmentAbility.class, null);
                if (iDrawerCategoryFragmentAbility != null) {
                    iDrawerCategoryFragmentAbility.dG2();
                }
                final String url = FeedDrawMtSetting.INSTANCE.getValue().getUrl();
                final Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("related_live_tag", gameDrawerCategory.categoryType), new Pair("count", "16"), new Pair("game_label", gameDrawerCategory.categoryName), new Pair("game_tab_rank", String.valueOf(i + 1)), new Pair("game_tab_show_type", gameDrawerCategory.rankType), new Pair("has_new_game_label", String.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(gameDrawerCategory.labels.isEmpty() ^ true)) ? 1 : 0)), new Pair("live_window_mode", "small_picture"), new Pair("tab_type", "game"));
                String str = C467800IWc.LJIJ.LJIIIIZZ;
                C0IUA.LJJI = str;
                C0IUA.LJJ = str;
                if (str == null) {
                    str = "";
                }
                C0IUA.LJ("", str);
                final long jCurrentTimeMillis = System.currentTimeMillis();
                C480460Ism.LIZ().getClass();
                C11O8 c11o8LJJJLZIJ = ((FeedApi) C480460Ism.LIZLLL(FeedApi.class)).feed(url, 0L, "tikcast_game_drawer_inner_sub_feed_refresh", mapLJIIJ).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ());
                final AbstractC738140SxQ abstractC738140SxQ = this;
                c11o8LJJJLZIJ.LJJLL(new C09JN() { // from class: X.0IUB
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        EnterRoomConfig enterRoomConfig;
                        InterfaceC468260IXw interfaceC468260IXw;
                        Room room;
                        boolean z;
                        long[] jArr;
                        String str2;
                        String strLIZIZ;
                        boolean z2;
                        String str3;
                        boolean z3;
                        String strLIZ;
                        FlareInfo flareInfo;
                        FlareInfo flareInfo2;
                        String strRequestId;
                        Object obj2;
                        Object obj3;
                        Object objValueOf;
                        Object objValueOf2;
                        C1C7U.LIZ("CategoryAssemExtKt@dbcb.getCategoryAbility$1$enterRoom$dispose$1");
                        BaseListResponse baseListResponse = (BaseListResponse) obj;
                        List<T> list = baseListResponse.data;
                        if (list != null && !list.isEmpty()) {
                            IMixCategoryAbility iMixCategoryAbility = (IMixCategoryAbility) C1558520qew.LIZ(C1558520qew.LJIIL(abstractC738140SxQ), IMixCategoryAbility.class, null);
                            if (iMixCategoryAbility != null) {
                                iMixCategoryAbility.Vz0(view2);
                            }
                            GameDrawerCategory gameDrawerCategory2 = gameDrawerCategory;
                            int i2 = i;
                            FeedItem feedItem = (FeedItem) ListProtector.get(baseListResponse.data, 0);
                            if (feedItem != null) {
                                Object objLIZIZ = "live_cover";
                                Object objLIZ = "live_merge";
                                if (C466640IRq.LIZJ() != null) {
                                    if (C466640IRq.LIZJ().LIZ() != null) {
                                        objLIZ = C466640IRq.LIZJ().LIZ();
                                    }
                                    if (C466640IRq.LIZJ().LIZIZ() != null) {
                                        objLIZIZ = C466640IRq.LIZJ().LIZIZ();
                                    }
                                }
                                Room room2 = feedItem.getRoom();
                                if (room2 != null) {
                                    int i3 = !gameDrawerCategory2.labels.isEmpty() ? 1 : 0;
                                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_show");
                                    c474500IjALIZ.LJJII(gameDrawerCategory2.categoryName, "game_label");
                                    c474500IjALIZ.LJJII(Integer.valueOf(i3), "has_new_game_label");
                                    c474500IjALIZ.LJJII(gameDrawerCategory2.rankType, "game_tab_show_type");
                                    c474500IjALIZ.LJJII(Integer.valueOf(i2 + 1), "game_tab_rank");
                                    c474500IjALIZ.LJJII("small_picture", "live_window_mode");
                                    c474500IjALIZ.LJJII("game", "tab_type");
                                    c474500IjALIZ.LJJII(objLIZ, "enter_from_merge");
                                    c474500IjALIZ.LJJII(objLIZIZ, "enter_method");
                                    c474500IjALIZ.LJJII("click", "action_type");
                                    c474500IjALIZ.LJJII(Long.valueOf(room2.getId()), "room_id");
                                    c474500IjALIZ.LJJII(room2.getRequestId(), "request_id");
                                    User owner = room2.getOwner();
                                    if (owner != null) {
                                        obj2 = owner.followStatus;
                                    } else {
                                        obj2 = null;
                                    }
                                    c474500IjALIZ.LJJII(obj2, "follow_status");
                                    User owner2 = room2.getOwner();
                                    if (owner2 != null) {
                                        obj3 = owner2.followStatus;
                                    } else {
                                        obj3 = null;
                                    }
                                    c474500IjALIZ.LJJII(obj3, "initial_follow_status");
                                    c474500IjALIZ.LJJII(feedItem.resId, "request_id");
                                    c474500IjALIZ.LJJII("game", "from_drawer_tab");
                                    User owner3 = room2.getOwner();
                                    if (owner3 != null) {
                                        objValueOf = Long.valueOf(owner3.getId());
                                    } else {
                                        objValueOf = null;
                                    }
                                    c474500IjALIZ.LJJII(objValueOf, "anchor_id");
                                    User owner4 = room2.getOwner();
                                    if (owner4 != null) {
                                        objValueOf2 = Long.valueOf(owner4.getId());
                                    } else {
                                        objValueOf2 = null;
                                    }
                                    c474500IjALIZ.LJJII(objValueOf2, "actual_anchor_id");
                                    if (MultiGuestOptGuestDistributeStateSetting.INSTANCE.isEnable()) {
                                        c474500IjALIZ.LJJII(Integer.valueOf(C0IXN.LIZ()), "is_from_guest_distribute");
                                    }
                                    c474500IjALIZ.LIZ();
                                }
                            }
                            List<T> list2 = baseListResponse.data;
                            FeedExtra feedExtra = (FeedExtra) baseListResponse.extra;
                            String str4 = url;
                            long j = jCurrentTimeMillis;
                            if (list2 != null && !list2.isEmpty()) {
                                FeedItem feedItem2 = (FeedItem) ListProtector.get(list2, 0);
                                if (feedItem2 != null) {
                                    interfaceC468260IXw = feedItem2.item;
                                } else {
                                    interfaceC468260IXw = null;
                                }
                                if (interfaceC468260IXw instanceof Room) {
                                    room = (Room) interfaceC468260IXw;
                                } else {
                                    room = null;
                                }
                                if (feedItem2 != null) {
                                    z = feedItem2.isRecommendCard;
                                } else {
                                    z = false;
                                }
                                enterRoomConfig = new EnterRoomConfig();
                                C464330IIt.LIZLLL(room, enterRoomConfig);
                                EnterRoomConfig.LogData logData = enterRoomConfig.mLogData;
                                if (logData != null) {
                                    if (feedItem2 != null) {
                                        strRequestId = feedItem2.requestId();
                                    } else {
                                        strRequestId = null;
                                    }
                                    logData.requestId = strRequestId;
                                }
                                EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
                                if (roomsData != null) {
                                    if (feedItem2 != null && (flareInfo2 = feedItem2.flareInfo) != null) {
                                        z2 = flareInfo2.isFlare;
                                    } else {
                                        z2 = false;
                                    }
                                    roomsData.isShowFlare = z2;
                                    if (feedItem2 != null && (flareInfo = feedItem2.flareInfo) != null) {
                                        str3 = flareInfo.taskId;
                                    } else {
                                        str3 = null;
                                    }
                                    roomsData.flareTaskId = str3;
                                    if (feedItem2 != null) {
                                        z3 = feedItem2.isFresh;
                                    } else {
                                        z3 = false;
                                    }
                                    roomsData.isFresh = z3;
                                    roomsData.feedUrl = str4;
                                    roomsData.fromNewStyle = true;
                                    roomsData.windowMode = "small_picture";
                                    C466640IRq c466640IRqLIZJ = C466640IRq.LIZJ();
                                    if (c466640IRqLIZJ == null || (strLIZ = c466640IRqLIZJ.LIZ()) == null) {
                                        strLIZ = C0IUA.LJIILLIIL;
                                    }
                                    roomsData.enterFromMerge = strLIZ;
                                }
                                EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
                                if (roomsData2 != null) {
                                    C466640IRq c466640IRqLIZJ2 = C466640IRq.LIZJ();
                                    if (c466640IRqLIZJ2 == null || (strLIZIZ = c466640IRqLIZJ2.LIZIZ()) == null) {
                                        strLIZIZ = C0IUA.LJIIZILJ;
                                    }
                                    roomsData2.enterMethod = strLIZIZ;
                                }
                                EnterRoomConfig.RoomsData roomsData3 = enterRoomConfig.mRoomsData;
                                if (roomsData3 != null) {
                                    if (z) {
                                        str2 = "pop_card";
                                    } else {
                                        str2 = null;
                                    }
                                    roomsData3.enterFromMergeRecommend = str2;
                                    roomsData3.roomIds = new long[list2.size()];
                                }
                                EnterRoomConfig.RoomsData roomsData4 = enterRoomConfig.mRoomsData;
                                if (roomsData4 != null) {
                                    roomsData4.position = 0;
                                }
                                EnterRoomConfig.DrawParams drawParams = enterRoomConfig.drawParams;
                                if (drawParams != null) {
                                    drawParams.openLiveFromDrawer = true;
                                }
                                HashMap<Long, String> map = new HashMap<>();
                                int size = list2.size();
                                for (int i4 = 0; i4 < size; i4++) {
                                    FeedItem feedItem3 = (FeedItem) ListProtector.get(list2, i4);
                                    if (feedItem3 != null) {
                                        EnterRoomConfig.RoomsData roomsData5 = enterRoomConfig.mRoomsData;
                                        if (roomsData5 != null && (jArr = roomsData5.roomIds) != null) {
                                            jArr[i4] = feedItem3.getRoom().getId();
                                        }
                                        if (feedItem3.debugInfo != null) {
                                            map.put(Long.valueOf(feedItem3.getRoom().getId()), feedItem3.debugInfo);
                                        }
                                    }
                                }
                                EnterRoomConfig.RoomsData roomsData6 = enterRoomConfig.mRoomsData;
                                EnterRoomConfig.TimeStamp timeStamp = roomsData6.timeStamps;
                                if (timeStamp != null) {
                                    timeStamp.enterRoomStarTimeReal = j;
                                }
                                if (feedItem2 != null) {
                                    roomsData6.roomId = feedItem2.item.getId();
                                    FollowInfo followInfo = feedItem2.getRoom().getOwner().getFollowInfo();
                                    if (followInfo != null) {
                                        enterRoomConfig.mRoomsData.followStatus = String.valueOf(followInfo.getFollowStatus());
                                    }
                                }
                                EnterRoomConfig.RoomsData roomsData7 = enterRoomConfig.mRoomsData;
                                roomsData7.debugInfos = map;
                                roomsData7.oceanReqInfo = feedExtra.oceanReqInfo;
                                roomsData7.hasMoreExtra = Boolean.valueOf(feedExtra.hasMore);
                                EnterRoomConfig.RoomsData roomsData8 = enterRoomConfig.mRoomsData;
                                roomsData8.maxTimeExtra = feedExtra.maxTime;
                                roomsData8.unReadIdExtra = feedExtra.unreadExtra;
                                roomsData8.enterRoomScene = "outside_with_feed";
                                roomsData8.enterType = "click";
                                roomsData8.roomProviderType = 1;
                                roomsData8.dataFlowType = LSPassThroughRecordSizeConfig.DEFAULT;
                                roomsData8.fromDrawerTab = "game";
                                roomsData8.openLiveFromDrawerTab = "game";
                                Map<String, String> map2 = mapLJIIJ;
                                EnterRoomConfig.RoomsData roomsData9 = enterRoomConfig.mRoomsData;
                                Map<String, String> map3 = roomsData9.gameLiveExtra;
                                if (map3 == null) {
                                    roomsData9.gameLiveExtra = map2;
                                } else {
                                    map3.putAll(map2);
                                }
                            } else {
                                enterRoomConfig = null;
                            }
                            Context context = abstractC738140SxQ.getContext();
                            if (enterRoomConfig != null && context != null) {
                                ((IHostWatch) C1161920gLG.LIZJ(IHostWatch.class)).watchLive(context, enterRoomConfig);
                            }
                        } else {
                            C20441214yg.LJ("GameDrawerCategoryViewHolder", "response is null");
                            C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131840613));
                        }
                        C1C7U.LIZIZ("CategoryAssemExtKt@dbcb.getCategoryAbility$1$enterRoom$dispose$1");
                    }
                }, new C09JN() { // from class: X.0IUD
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("CategoryAssemExtKt@dbcb.getCategoryAbility$1$enterRoom$dispose$2");
                        C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131840613));
                        C20441214yg.LJI("GameDrawerCategoryViewHolder", (Throwable) obj);
                        C1C7U.LIZIZ("CategoryAssemExtKt@dbcb.getCategoryAbility$1$enterRoom$dispose$2");
                    }
                });
            }
        });
        this.LLJJI = c476570ImV;
        RecyclerView recyclerView = this.LLJJIII;
        if (recyclerView != null) {
            recyclerView.setAdapter(c476570ImV);
        }
        RecyclerView recyclerView2 = this.LLJJIII;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(kp(view.getContext()));
        }
        lp();
        ip();
        hp().vQ2(1);
    }
}
