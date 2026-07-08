package com.bytedance.android.livesdk.interaction.poll.selectpoll.widget;

import X.C0J1N;
import X.C1077930e9n;
import X.C1086660eNs;
import X.C1086690eNv;
import X.C1086830eO9;
import X.C11RD;
import X.C11RK;
import X.C1308910kAL;
import X.C1701940uOG;
import X.C1848410yCV;
import X.C20441214yg;
import X.C2211941Bhg;
import X.C2213981Bky;
import X.C494680Jac;
import X.C497740JfY;
import X.C500260Jjc;
import X.C752710Tfp;
import X.EnumC1086920eOI;
import X.InterfaceC1097170eep;
import Y.AObserverS221S0100000_17;
import Y.AfS186S0100000_17;
import Y.AfS4S0300100_17;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import avg.f;
import com.bytedance.android.live.ICommentService;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.poll.PollApi;
import com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.interaction.poll.selectpoll.LiveNormalPollViewModel;
import com.bytedance.android.livesdk.interaction.poll.selectpoll.SelectPollViewModel;
import com.bytedance.android.livesdk.interaction.poll.selectpoll.widget.NormalSelectPollWidget;
import com.bytedance.android.livesdk.livesetting.roomfunction.LivePollSetting;
import com.bytedance.android.livesdk.model.PollData;
import com.bytedance.android.livesdk.model.PollInfo;
import com.bytedance.android.livesdk.model.UserVoteInfo;
import com.bytedance.android.livesdk.model.VoteResponseData;
import com.bytedance.android.livesdk.model.message.PollMessage;
import com.bytedance.android.livesdk.model.message.PollOptionInfo;
import com.bytedance.android.livesdk.model.message.PollStartContent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.bytedance.ies.sdk.widgets.RecycleSource;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import mf.a;

/* JADX INFO: loaded from: classes18.dex */
public final class NormalSelectPollWidget extends AbsSelectPollWidget {
    public LiveNormalPollViewModel LLJJ;

    @Override // com.bytedance.android.livesdk.interaction.poll.selectpoll.widget.AbsSelectPollWidget, com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.AnimatableRecyclableWidget, com.bytedance.ies.sdk.widgets.IAnimatableWidget
    public final void animateShow() {
        ConstraintProperty constraintPropertyById;
        ConstraintProperty constraintPropertyById2;
        if (!(!this.LLIZ)) {
            super.animateShow();
            return;
        }
        LiveNormalPollViewModel liveNormalPollViewModel = this.LLJJ;
        if (liveNormalPollViewModel == null || liveNormalPollViewModel.LLJILJILJ == null) {
            z1(true);
            LayeredElementContext layeredElementContext = getLayeredElementContext();
            if (layeredElementContext != null && (constraintPropertyById = layeredElementContext.getConstraintPropertyById(getId())) != null) {
                constraintPropertyById.alpha(1.0f);
            }
            super.animateShow();
            return;
        }
        z1(false);
        LayeredElementContext layeredElementContext2 = getLayeredElementContext();
        if (layeredElementContext2 == null || (constraintPropertyById2 = layeredElementContext2.getConstraintPropertyById(getId())) == null) {
            return;
        }
        constraintPropertyById2.alpha(0.3f);
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.selectpoll.widget.AbsSelectPollWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        ConstraintProperty constraintPropertyById;
        ConstraintProperty constraintPropertyById2;
        if (C494680Jac.LJI(this.dataChannel)) {
            return;
        }
        super.show();
        SelectPollViewModel selectPollViewModel = this.LLJILJIL;
        if (selectPollViewModel != null) {
            selectPollViewModel.LLILLJJLI = EnumC1086920eOI.NORMAL;
        }
        if (!this.LLIZ) {
            LiveNormalPollViewModel liveNormalPollViewModel = this.LLJJ;
            if (liveNormalPollViewModel == null || liveNormalPollViewModel.LLJILJILJ == null) {
                z1(true);
                LayeredElementContext layeredElementContext = getLayeredElementContext();
                if (layeredElementContext == null || (constraintPropertyById = layeredElementContext.getConstraintPropertyById(getId())) == null) {
                    return;
                }
                constraintPropertyById.alpha(1.0f);
                return;
            }
            z1(false);
            LayeredElementContext layeredElementContext2 = getLayeredElementContext();
            if (layeredElementContext2 == null || (constraintPropertyById2 = layeredElementContext2.getConstraintPropertyById(getId())) == null) {
                return;
            }
            constraintPropertyById2.alpha(0.3f);
        }
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.selectpoll.widget.AbsSelectPollWidget
    public final void F1(long j) {
        C1086690eNv.LIZIZ(j, this.dataChannel, EnumC1086920eOI.NORMAL);
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.selectpoll.widget.AbsSelectPollWidget
    public final void D1(final long j, List list) {
        super.D1(j, list);
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                final PollOptionInfo pollOptionInfo = (PollOptionInfo) it2.next();
                if (pollOptionInfo != null) {
                    C1086660eNs c1086660eNs = new C1086660eNs(this.context);
                    c1086660eNs.setCircular(true);
                    if ((!this.LLIZ) && (!C497740JfY.LJIL())) {
                        c1086660eNs.setTag(pollOptionInfo);
                        Context context = c1086660eNs.getContext();
                        if (context != null) {
                            c1086660eNs.setStrokeWidth(C497740JfY.LIZIZ(1.0f));
                            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zj, context);
                            if (numLIZJ != null) {
                                c1086660eNs.setStrokeColor(ColorStateList.valueOf(numLIZJ.intValue()));
                            }
                        }
                    }
                    if (!C1086830eO9.LIZIZ(pollOptionInfo.displayContent)) {
                        c1086660eNs.setBgVisible(false);
                        c1086660eNs.setTextSize(14.0f);
                    } else {
                        c1086660eNs.setBgVisible(true);
                        c1086660eNs.setTextSize(12.0f);
                    }
                    c1086660eNs.setPollText(pollOptionInfo.displayContent);
                    if (!this.LLIZ) {
                        View.OnClickListener fVar = new View.OnClickListener() { // from class: X.0eNo
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                ConstraintProperty constraintPropertyById;
                                this.LL.z1(false);
                                LayeredElementContext layeredElementContext = this.LL.getLayeredElementContext();
                                if (layeredElementContext != null && (constraintPropertyById = layeredElementContext.getConstraintPropertyById(this.LL.getId())) != null) {
                                    constraintPropertyById.alpha(0.3f);
                                }
                                if (this.LL.dataChannel.gg0(RoomChannel.class) == null) {
                                    return;
                                }
                                NormalSelectPollWidget normalSelectPollWidget = this.LL;
                                PollOptionInfo pollOptionInfo2 = pollOptionInfo;
                                normalSelectPollWidget.LLILLL = pollOptionInfo2.displayContent;
                                normalSelectPollWidget.LLILZ = pollOptionInfo2.optionIndex;
                                long id = 0;
                                if (!(!normalSelectPollWidget.LLIZ)) {
                                    SelectPollViewModel selectPollViewModel = normalSelectPollWidget.LLJILJIL;
                                    if (selectPollViewModel != null) {
                                        Room room = (Room) normalSelectPollWidget.dataChannel.gg0(RoomChannel.class);
                                        if (room != null) {
                                            id = room.getId();
                                        }
                                        C500260Jjc.LJJJJJ(this.LL, null, new C478101tb(id, j, pollOptionInfo.optionIndex, selectPollViewModel, null), 3);
                                    }
                                } else {
                                    LiveNormalPollViewModel liveNormalPollViewModel = normalSelectPollWidget.LLJJ;
                                    if (liveNormalPollViewModel != null) {
                                        Room room2 = (Room) normalSelectPollWidget.dataChannel.gg0(RoomChannel.class);
                                        if (room2 != null) {
                                            id = room2.getId();
                                        }
                                        final long j2 = j;
                                        final PollOptionInfo pollOptionInfo3 = pollOptionInfo;
                                        NormalSelectPollWidget normalSelectPollWidget2 = this.LL;
                                        long j3 = normalSelectPollWidget2.LLJILJILJ;
                                        DataChannel dataChannel = normalSelectPollWidget2.dataChannel;
                                        liveNormalPollViewModel.LLJILJIL = -1;
                                        C480460Ism.LIZ().getClass();
                                        final long j4 = id;
                                        InterfaceC420801kM interfaceC420801kMLJJLL = ((PollApi) C480460Ism.LIZLLL(PollApi.class)).vote2(id, j2, pollOptionInfo3.optionIndex).LJIILIIL(new C0UO0()).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0eNn
                                            @Override // X.InterfaceC1487280oo2
                                            public final Object apply(Object obj) {
                                                ICommentService iCommentService;
                                                BaseResponse baseResponse = (BaseResponse) obj;
                                                VoteResponseData voteResponseData = (VoteResponseData) baseResponse.data;
                                                if (voteResponseData != null && !voteResponseData.commentBanned && (iCommentService = (ICommentService) C1161920gLG.LIZJ(ICommentService.class)) != null) {
                                                    long j5 = j4;
                                                    PollOptionInfo pollOptionInfo4 = pollOptionInfo3;
                                                    String str = pollOptionInfo4.displayContent;
                                                    ISendCommentEvent.Sender sender = ISendCommentEvent.Sender.POLL;
                                                    sender.getLogArgs().put("poll_id", String.valueOf(j2));
                                                    sender.getLogArgs().put("poll_selection", pollOptionInfo4.displayContent);
                                                    iCommentService.vF2(j5, str, null, 3, sender);
                                                }
                                                return baseResponse;
                                            }
                                        }).LJJLL(new AfS4S0300100_17(j3, liveNormalPollViewModel, dataChannel, pollOptionInfo3, 1), new AfS186S0100000_17(liveNormalPollViewModel, 72));
                                        liveNormalPollViewModel.LLJILJILJ = (C11JF) interfaceC420801kMLJJLL;
                                        liveNormalPollViewModel.LLJ.LIZ(interfaceC420801kMLJJLL);
                                    }
                                }
                                this.LL.x1();
                            }
                        };
                        if (C1848410yCV.LIZ) {
                            fVar = new f(fVar);
                        }
                        a aVar = new a(fVar);
                        if (C2213981Bky.LIZIZ.isOffline()) {
                            C2211941Bhg.LIZ.injectViewListener(c1086660eNs);
                        }
                        c1086660eNs.setOnClickListener(aVar);
                    }
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, ((Number) this.LLJ.getValue()).intValue());
                    layoutParams.setMarginStart(A1());
                    layoutParams.setMarginEnd(A1());
                    B1().addView(c1086660eNs, layoutParams);
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdk.interaction.poll.selectpoll.widget.AbsSelectPollWidget, com.bytedance.ies.sdk.widgets.configuration.LiveRecycleSourceWidget
    public final void onLoad(RecycleSource recycleSource, Object[] objArr) {
        C11RK<VoteResponseData> c11rk;
        C11RK<Throwable> c11rk2;
        NextLiveData<PollMessage> nextLiveData;
        PollMessage value;
        SelectPollViewModel selectPollViewModel;
        LiveData liveData;
        Room room;
        PollInfo pollInfo;
        PollData pollData;
        Room room2;
        PollInfo pollInfo2;
        PollData pollData2;
        List<PollOptionInfo> list;
        Room room3;
        PollInfo pollInfo3;
        PollData pollData3;
        PollInfo pollInfo4;
        PollData pollData4;
        PollInfo pollInfo5;
        UserVoteInfo userVoteInfo;
        LiveData liveData2;
        InterfaceC1097170eep interfaceC1097170eep;
        Fragment fragment;
        Fragment parentFragment;
        Integer num;
        super.onLoad(recycleSource, objArr);
        Boolean boolValueOf = null;
        if ((!this.LLIZ) && (interfaceC1097170eep = this.widgetCallback) != null && (fragment = interfaceC1097170eep.getFragment()) != null && (parentFragment = fragment.getParentFragment()) != null && parentFragment.isAdded()) {
            ViewModelProvider viewModelProviderOf = ViewModelProviders.of(parentFragment);
            DataChannel dataChannel = this.dataChannel;
            if (dataChannel != null) {
                num = (Integer) dataChannel.gg0(C752710Tfp.class);
            } else {
                num = null;
            }
            this.LLJJ = (LiveNormalPollViewModel) viewModelProviderOf.get(C1077930e9n.LIZ(num), LiveNormalPollViewModel.class);
        }
        SelectPollViewModel selectPollViewModel2 = this.LLJILJIL;
        if (selectPollViewModel2 != null && (liveData2 = (LiveData) selectPollViewModel2.LLILZ.getValue()) != null) {
            liveData2.observe(this, new AObserverS221S0100000_17(this, 17));
        }
        if (!(!this.LLIZ)) {
            Room room4 = this.LLJILLL;
            if (room4 != null && (pollInfo5 = room4.advancedPollInfo) != null && (userVoteInfo = pollInfo5.userVoteInfo) != null) {
                boolValueOf = Boolean.valueOf(userVoteInfo.hasVoted);
            }
            if (C500260Jjc.LJJIFFI(boolValueOf) && (room = this.LLJILLL) != null && (pollInfo = room.advancedPollInfo) != null && (pollData = pollInfo.pollData) != null && pollData.pollKind == EnumC1086920eOI.NORMAL.ordinal() && (room2 = this.LLJILLL) != null && (pollInfo2 = room2.advancedPollInfo) != null && (pollData2 = pollInfo2.pollData) != null && (list = pollData2.pollOptionList) != null && list.size() > 0 && (room3 = this.LLJILLL) != null && (pollInfo3 = room3.advancedPollInfo) != null && (pollData3 = pollInfo3.pollData) != null && pollData3.pollStatus == 1 && (pollInfo4 = room3.advancedPollInfo) != null && (pollData4 = pollInfo4.pollData) != null) {
                C1(pollData4);
            }
        }
        if (this.LLIZ) {
            this.LLILLJJLI = new PollStartContent();
            show();
            C20441214yg.LJIIIZ("ttlive_quick_poll", LivePollSetting.INSTANCE.getOptionListString());
        }
        if (!this.LLIZ) {
            LiveNormalPollViewModel liveNormalPollViewModel = this.LLJJ;
            if (liveNormalPollViewModel != null && (nextLiveData = liveNormalPollViewModel.LLILLJJLI) != null && (value = nextLiveData.getValue()) != null && (selectPollViewModel = this.LLJILJIL) != null && (liveData = (LiveData) selectPollViewModel.LLILZ.getValue()) != null) {
                liveData.postValue(value);
            }
            LiveNormalPollViewModel liveNormalPollViewModel2 = this.LLJJ;
            if (liveNormalPollViewModel2 != null && (c11rk2 = liveNormalPollViewModel2.LLJIJIL) != null) {
                ((C0J1N) c11rk2.LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LJ(this))).LIZJ(new AfS186S0100000_17(this, 58));
            }
            LiveNormalPollViewModel liveNormalPollViewModel3 = this.LLJJ;
            if (liveNormalPollViewModel3 != null && (c11rk = liveNormalPollViewModel3.LLJI) != null) {
                ((C0J1N) c11rk.LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LJ(this))).LIZJ(new AfS186S0100000_17(this, 59));
            }
        }
    }
}
