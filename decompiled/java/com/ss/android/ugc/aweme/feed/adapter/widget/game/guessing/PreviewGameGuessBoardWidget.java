package com.ss.android.ugc.aweme.feed.adapter.widget.game.guessing;

import X.C001A;
import X.C01TT;
import X.C0208004w;
import X.C1338270kvh;
import X.C13LP;
import X.C1ABT;
import X.C1ACA;
import X.C258000zC;
import X.C5182020e;
import X.C5183020f;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.game.model.GuessOptionStats;
import com.bytedance.android.livesdk.game.model.GuessOptions;
import com.bytedance.android.livesdk.game.model.GuessRankUserInfo;
import com.bytedance.android.livesdk.game.model.GuessRoundStats;
import com.bytedance.android.livesdk.game.model.GuessText;
import com.bytedance.android.livesdk.game.model.GuessWidget;
import com.bytedance.android.livesdk.model.message.GameGuessWidgetsMessage;
import com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget;
import com.ss.android.ugc.aweme.feed.model.live.GuessRound;
import com.ss.android.ugc.aweme.feed.model.live.GuessWidgets;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMListenerType;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class PreviewGameGuessBoardWidget extends LiveWatchPreviewWidget {
    public static final /* synthetic */ int LLJILJIL = 0;
    public GuessWidgets LLJ;
    public C258000zC LLJI;
    public final C0208004w LLJIJIL = new OnIMMessageListener() { // from class: X.004w
        @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
        public final String messageListenerBizTag() {
            return "Billboard_Preview";
        }

        @Override // com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener
        public final IMListenerType messageListenerType() {
            return IMListenerType.SYNC;
        }

        @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
        public final void onMessage(IMessage iMessage) {
            GuessWidgets guessWidgets;
            String str;
            String str2;
            long j;
            String str3;
            String str4;
            long j2;
            long j3;
            int i;
            String str5;
            long j4;
            String str6;
            long j5;
            String str7;
            String str8;
            String str9;
            String str10;
            GuessRoundStats guessRoundStats;
            List<GuessOptions> list;
            GuessText guessText;
            GuessText guessText2;
            GuessText guessText3;
            if (!(iMessage instanceof GameGuessWidgetsMessage)) {
                return;
            }
            Map<String, Object> map = C1338270kvh.LIZ;
            GuessWidgets guessWidgets2 = this.LL.LLJ;
            com.bytedance.android.livesdk.game.model.GuessWidgets guessWidgets3 = ((GameGuessWidgetsMessage) iMessage).guessWidgets;
            if (guessWidgets3 == null) {
                guessWidgets = null;
            } else {
                guessWidgets = new GuessWidgets();
                for (GuessWidget guessWidget : guessWidgets3.guessWidgets) {
                    List<com.ss.android.ugc.aweme.feed.model.live.GuessWidget> list2 = guessWidgets.guessWidgets;
                    com.ss.android.ugc.aweme.feed.model.live.GuessWidget guessWidget2 = new com.ss.android.ugc.aweme.feed.model.live.GuessWidget();
                    guessWidget2.versionId = guessWidget.versionId;
                    guessWidget2.totalBetMembers = guessWidget.totalBetMembers;
                    GuessRound guessRound = new GuessRound();
                    com.ss.android.ugc.aweme.feed.model.live.GuessText guessText4 = new com.ss.android.ugc.aweme.feed.model.live.GuessText();
                    com.bytedance.android.livesdk.game.model.GuessRound guessRound2 = guessWidget.guessRound;
                    String str11 = "";
                    if (guessRound2 == null || (guessText3 = guessRound2.title) == null || (str = guessText3.key) == null) {
                        str = "";
                    }
                    guessText4.key = str;
                    if (guessRound2 == null || (guessText2 = guessRound2.title) == null || (str2 = guessText2.desc) == null) {
                        str2 = "";
                    }
                    guessText4.desc = str2;
                    if (guessRound2 != null && (guessText = guessRound2.title) != null) {
                        j = guessText.type;
                    } else {
                        j = 0;
                    }
                    guessText4.type = j;
                    guessRound.title = guessText4;
                    if (guessRound2 == null || (str3 = guessRound2.roundIdStr) == null) {
                        str3 = "";
                    }
                    guessRound.roundIdStr = str3;
                    if (guessRound2 != null && (list = guessRound2.guessOptions) != null) {
                        for (GuessOptions guessOptions : list) {
                            List<com.ss.android.ugc.aweme.feed.model.live.GuessOptions> list3 = guessRound.guessOptions;
                            com.ss.android.ugc.aweme.feed.model.live.GuessOptions guessOptions2 = new com.ss.android.ugc.aweme.feed.model.live.GuessOptions();
                            GuessText guessText5 = guessOptions.text;
                            if (guessText5 != null) {
                                com.ss.android.ugc.aweme.feed.model.live.GuessText guessText6 = new com.ss.android.ugc.aweme.feed.model.live.GuessText();
                                guessText6.key = guessText5.key;
                                guessText6.desc = guessText5.desc;
                                guessText6.type = guessText5.type;
                                guessOptions2.text = guessText6;
                            }
                            GuessOptionStats guessOptionStats = guessOptions.guessOptionStats;
                            if (guessOptionStats != null) {
                                com.ss.android.ugc.aweme.feed.model.live.GuessOptionStats guessOptionStats2 = new com.ss.android.ugc.aweme.feed.model.live.GuessOptionStats();
                                guessOptionStats2.memberNum = guessOptionStats.memberNum;
                                guessOptionStats2.pointsNum = guessOptionStats.pointsNum;
                                guessOptionStats2.bonusOdds = guessOptionStats.bonusOdds;
                                guessOptions2.guessOptionStats = guessOptionStats2;
                            }
                            guessOptions2.serialNum = guessOptions.serialNum;
                            guessOptions2.optionIdStr = guessOptions.optionIdStr;
                            list3.add(guessOptions2);
                        }
                    }
                    com.bytedance.android.livesdk.game.model.GuessRound guessRound3 = guessWidget.guessRound;
                    if (guessRound3 == null || (str4 = guessRound3.winOption) == null) {
                        str4 = "";
                    }
                    guessRound.winOption = str4;
                    if (guessRound3 != null) {
                        j2 = guessRound3.startTime;
                    } else {
                        j2 = 0;
                    }
                    guessRound.startTime = j2;
                    if (guessRound3 != null) {
                        j3 = guessRound3.endTime;
                    } else {
                        j3 = 0;
                    }
                    guessRound.endTime = j3;
                    if (guessRound3 != null) {
                        i = guessRound3.guessStatus;
                    } else {
                        i = 0;
                    }
                    guessRound.guessStatus = i;
                    if (guessRound3 == null || (str5 = guessRound3.roomIdStr) == null) {
                        str5 = "";
                    }
                    guessRound.roomIdStr = str5;
                    if (guessRound3 != null) {
                        j4 = guessRound3.liveId;
                    } else {
                        j4 = 0;
                    }
                    guessRound.liveId = j4;
                    if (guessRound3 != null && (guessRoundStats = guessRound3.guessRoundStats) != null) {
                        com.ss.android.ugc.aweme.feed.model.live.GuessRoundStats guessRoundStats2 = new com.ss.android.ugc.aweme.feed.model.live.GuessRoundStats();
                        guessRoundStats2.memberNums = guessRoundStats.memberNums;
                        guessRoundStats2.pointsNum = guessRoundStats.pointsNum;
                        guessRoundStats2.pointsSplitNum = guessRoundStats.pointsSplitNum;
                        guessRoundStats2.pointsVotedToAnchor = guessRoundStats.pointsVotedToAnchor;
                        guessRoundStats2.totalMembersNums = guessRoundStats.totalMembersNums;
                        guessRound.guessRoundStats = guessRoundStats2;
                    }
                    com.bytedance.android.livesdk.game.model.GuessRound guessRound4 = guessWidget.guessRound;
                    if (guessRound4 == null || (str6 = guessRound4.correctedOption) == null) {
                        str6 = "";
                    }
                    guessRound.correctedOption = str6;
                    if (guessRound4 != null) {
                        j5 = guessRound4.serverTime;
                    } else {
                        j5 = 0;
                    }
                    guessRound.serverTime = j5;
                    if (guessRound4 == null || (str7 = guessRound4.anchorId) == null) {
                        str7 = "";
                    }
                    guessRound.anchorId = str7;
                    if (guessRound4 == null || (str8 = guessRound4.creatorId) == null) {
                        str8 = "";
                    }
                    guessRound.creatorId = str8;
                    if (guessRound4 == null || (str9 = guessRound4.operatorId) == null) {
                        str9 = "";
                    }
                    guessRound.operatorId = str9;
                    if (guessRound4 != null && (str10 = guessRound4.operatorName) != null) {
                        str11 = str10;
                    }
                    guessRound.operatorName = str11;
                    guessWidget2.guessRound = guessRound;
                    list2.add(guessWidget2);
                }
                for (GuessRankUserInfo guessRankUserInfo : guessWidgets3.userRank) {
                    List<com.ss.android.ugc.aweme.feed.model.live.GuessRankUserInfo> list4 = guessWidgets.userRank;
                    com.ss.android.ugc.aweme.feed.model.live.GuessRankUserInfo guessRankUserInfo2 = new com.ss.android.ugc.aweme.feed.model.live.GuessRankUserInfo();
                    guessRankUserInfo2.avatarUri = guessRankUserInfo.avatarUri;
                    list4.add(guessRankUserInfo2);
                }
            }
            this.LL.N1(guessWidgets2, guessWidgets);
        }
    };

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void H1() {
        IMessageManager iMessageManager;
        Map<String, Object> map = C1338270kvh.LIZ;
        C1ACA c1acaZ1 = z1();
        if (c1acaZ1 != null && (iMessageManager = c1acaZ1.LJJIIZ) != null) {
            iMessageManager.removeMessageListener((OnIMMessageListener) this.LLJIJIL);
        }
        C258000zC c258000zC = this.LLJI;
        if (c258000zC != null) {
            c258000zC.LIZLLL();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        Map<String, Object> map = C1338270kvh.LIZ;
        C258000zC c258000zC = this.LLJI;
        if (c258000zC != null) {
            c258000zC.LIZLLL();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void B1() {
        LiveRoomStruct liveRoomStruct;
        Integer numValueOf;
        LiveRoomStruct liveRoomStruct2;
        IMessageManager iMessageManager;
        LiveRoomStruct liveRoomStruct3;
        C1ACA c1acaZ1 = z1();
        Long lValueOf = (c1acaZ1 == null || (liveRoomStruct3 = c1acaZ1.LIZJ) == null) ? null : Long.valueOf(liveRoomStruct3.id);
        Map<String, Object> map = C1338270kvh.LIZ;
        C1ACA c1acaZ12 = z1();
        if (c1acaZ12 != null) {
            C1ABT.LJIILL(c1acaZ12);
        }
        C1ACA c1acaZ13 = z1();
        if (c1acaZ13 != null && (iMessageManager = c1acaZ13.LJJIIZ) != null) {
            iMessageManager.addMessageListener(C001A.GAME_GUESS_WIDGETS_MESSAGE.getIntType(), (OnIMMessageListener) this.LLJIJIL);
        }
        C1ACA c1acaZ14 = z1();
        this.LLJ = (c1acaZ14 == null || (liveRoomStruct2 = c1acaZ14.LIZJ) == null) ? null : liveRoomStruct2.guessWidgets;
        C258000zC c258000zC = this.LLJI;
        if (c258000zC != null) {
            c258000zC.LIZLLL();
        }
        C1ACA c1acaZ15 = z1();
        if (c1acaZ15 != null && (liveRoomStruct = c1acaZ15.LIZJ) != null && (numValueOf = Integer.valueOf(liveRoomStruct.liveRoomMode)) != null && numValueOf.intValue() != 4 && numValueOf.intValue() != 6) {
            numValueOf.intValue();
        }
        this.LLJI = new C258000zC(lValueOf);
        N1(null, this.LLJ);
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void F1() {
        Map<String, Object> map = C1338270kvh.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget
    public final void LJJIJIIJIL(int i) {
        super.LJJIJIIJIL(i);
        Map<String, Object> map = C1338270kvh.LIZ;
        C01TT.LIZIZ(100L, new C5182020e(this, 113));
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        Map<String, Object> map = C1338270kvh.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.feed.adapter.baseviewmodel.LiveWatchPreviewWidget, com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        super.onLoad(objArr);
        Map<String, Object> map = C1338270kvh.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean M1(com.ss.android.ugc.aweme.feed.model.live.GuessWidget r2, int r3) {
        /*
            r1 = 0
            if (r2 == 0) goto L17
            com.ss.android.ugc.aweme.feed.model.live.GuessRound r0 = r2.guessRound
            if (r0 == 0) goto Ld
            int r0 = r0.guessStatus
            if (r0 < 0) goto L16
            if (r2 == 0) goto L17
        Ld:
            com.ss.android.ugc.aweme.feed.model.live.GuessRound r0 = r2.guessRound
            if (r0 == 0) goto L17
            int r0 = r0.guessStatus
        L13:
            if (r0 > r3) goto L16
            r1 = 1
        L16:
            return r1
        L17:
            r0 = 0
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.adapter.widget.game.guessing.PreviewGameGuessBoardWidget.M1(com.ss.android.ugc.aweme.feed.model.live.GuessWidget, int):boolean");
    }

    public final synchronized void N1(GuessWidgets guessWidgets, GuessWidgets guessWidgets2) {
        ArrayList<com.ss.android.ugc.aweme.feed.model.live.GuessWidget> arrayList;
        List<com.ss.android.ugc.aweme.feed.model.live.GuessWidget> list;
        List<com.ss.android.ugc.aweme.feed.model.live.GuessRankUserInfo> list2;
        Map<String, Object> map = C1338270kvh.LIZ;
        if (guessWidgets2 != null) {
            GuessWidgets guessWidgets3 = this.LLJ;
            GuessWidgets guessWidgets4 = new GuessWidgets();
            if (guessWidgets3 != null && (list2 = guessWidgets3.userRank) != null) {
                guessWidgets4.userRank = list2;
            }
            this.LLJ = guessWidgets4;
            if (guessWidgets3 != null && (list = guessWidgets3.guessWidgets) != null) {
                arrayList = new ArrayList(list);
            } else {
                arrayList = new ArrayList();
            }
            boolean z = false;
            boolean z2 = false;
            for (com.ss.android.ugc.aweme.feed.model.live.GuessWidget guessWidget : C13LP.LLIIII(guessWidgets2.guessWidgets)) {
                C5183020f c5183020f = new C5183020f(guessWidget, 252);
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    com.ss.android.ugc.aweme.feed.model.live.GuessWidget guessWidget2 = (com.ss.android.ugc.aweme.feed.model.live.GuessWidget) it2.next();
                    if (((Boolean) c5183020f.invoke(guessWidget2)).booleanValue()) {
                        it2.remove();
                        if (guessWidget2 != null && guessWidget.versionId < guessWidget2.versionId) {
                            guessWidget = guessWidget2;
                        }
                    }
                }
                guessWidgets4.guessWidgets.add(guessWidget);
                if (!z && !M1(guessWidget, 0)) {
                    z = false;
                    if (!z2 && !M1(guessWidget, 1)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                } else {
                    z = true;
                    z2 = true;
                }
            }
            loop2: while (true) {
                boolean z3 = false;
                for (com.ss.android.ugc.aweme.feed.model.live.GuessWidget guessWidget3 : arrayList) {
                    GuessRound guessRound = guessWidget3.guessRound;
                    if (guessRound != null && guessRound.roundIdStr != null) {
                        guessWidgets4.guessWidgets.add(guessWidget3);
                    }
                    if (z3 || M1(guessWidget3, 1)) {
                        z3 = true;
                    }
                }
            }
            if (!guessWidgets2.userRank.isEmpty()) {
                guessWidgets4.userRank = guessWidgets2.userRank;
            }
            this.LLJ = guessWidgets4;
            Map<String, Object> map2 = C1338270kvh.LIZ;
            C258000zC c258000zC = this.LLJI;
            if (c258000zC != null) {
                c258000zC.LIZJ(guessWidgets4, guessWidgets);
            }
        }
    }
}
