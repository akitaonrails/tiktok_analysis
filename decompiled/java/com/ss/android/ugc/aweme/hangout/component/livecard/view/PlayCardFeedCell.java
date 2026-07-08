package com.ss.android.ugc.aweme.hangout.component.livecard.view;

import X.C01GW;
import X.C098200Yq;
import X.C1161920gLG;
import X.C12ES;
import X.C13LP;
import X.C15438062q;
import X.C15CF;
import X.C189200o6;
import X.C19631511rN;
import X.C20441214yg;
import X.C2188811AlT;
import X.C439101nJ;
import X.C452501pT;
import X.C477500Io0;
import X.C477510Io1;
import X.C477860Ioa;
import X.C477870Iob;
import X.C479150Iqf;
import X.C479170Iqh;
import X.C500260Jjc;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestTopLiveParmasConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.OptimizeEnterRoomPipelineSetting;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserApplySettings;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserSettings;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS373S0200000_7;
import kotlin.jvm.internal.AwS408S0200000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.text.u;
import webcast.api.feed.MGModuleTab;
import webcast.data.CardTag;

/* JADX INFO: loaded from: classes8.dex */
public final class PlayCardFeedCell extends BaseMultiFeedPowerCell<C479150Iqf> {
    public static final /* synthetic */ int LLJ = 0;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public boolean LLIZLLLIL;

    public PlayCardFeedCell() {
        super(0);
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS551S0100000_7(this, 229));
        this.LLILLL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 230));
        this.LLILZ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 226));
        this.LLILZIL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 225));
        this.LLILZLL = C452501pT.LIZIZ(new AwS551S0100000_7(this, 227));
        this.LLIZ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 228));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.dir;
    }

    public final C15CF P5() {
        return (C15CF) this.LLILZIL.getValue();
    }

    public final C19631511rN R5() {
        return (C19631511rN) this.LLILZLL.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Long N5() {
        C479170Iqh c479170Iqh;
        Room room;
        User owner;
        long id;
        C479170Iqh c479170Iqh2;
        Room room2;
        C479170Iqh c479170Iqh3;
        Room room3;
        C479150Iqf c479150Iqf = (C479150Iqf) getItem();
        if (((c479150Iqf == null || (c479170Iqh3 = c479150Iqf.LLILLL) == null || (room3 = c479170Iqh3.LJFF) == null) ? 0L : room3.getOwnerUserId()) > 0) {
            C479150Iqf c479150Iqf2 = (C479150Iqf) getItem();
            if (c479150Iqf2 == null || (c479170Iqh2 = c479150Iqf2.LLILLL) == null || (room2 = c479170Iqh2.LJFF) == null) {
                return null;
            }
            id = room2.getOwnerUserId();
        } else {
            C479150Iqf c479150Iqf3 = (C479150Iqf) getItem();
            if (c479150Iqf3 == null || (c479170Iqh = c479150Iqf3.LLILLL) == null || (room = c479170Iqh.LJFF) == null || (owner = room.getOwner()) == null) {
                return null;
            }
            id = owner.getId();
        }
        return Long.valueOf(id);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String S5() {
        C479170Iqh c479170Iqh;
        MGModuleTab mGModuleTab;
        String str;
        String strLJJIFFI;
        C479150Iqf c479150Iqf = (C479150Iqf) getItem();
        return (c479150Iqf == null || (c479170Iqh = c479150Iqf.LLILLL) == null || (mGModuleTab = c479170Iqh.LJI) == null || (str = mGModuleTab.name) == null || (strLJJIFFI = u.LJJIFFI(str, "hangout_live_cell_", "", false)) == null) ? "all" : strLJJIFFI;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onDestroy() {
        R5().LIZIZ();
        P5().LIZ();
        super.onDestroy();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onStop() {
        R5().LIZIZ();
        P5().LIZ();
        super.onStop();
    }

    @Override // com.ss.android.ugc.aweme.hangout.component.livecard.view.BaseMultiFeedPowerCell, com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        R5().LJFF();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
        R5().LIZIZ();
        P5().LIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    @Override // com.ss.android.ugc.aweme.hangout.component.livecard.view.BaseMultiFeedPowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L5(java.lang.String r23) {
        /*
            Method dump skipped, instruction units count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.hangout.component.livecard.view.PlayCardFeedCell.L5(java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void T5(String str) {
        Integer numValueOf;
        Long lValueOf;
        String requestId;
        Integer numValueOf2;
        String str2;
        String str3;
        Map<String, String> map;
        C479170Iqh c479170Iqh;
        Room room;
        MultiLiveUserSettings multiLiveUserSettings;
        MultiLiveUserApplySettings multiLiveUserApplySettings;
        C479170Iqh c479170Iqh2;
        C479170Iqh c479170Iqh3;
        CardTag cardTag;
        C479170Iqh c479170Iqh4;
        Room room2;
        C479170Iqh c479170Iqh5;
        Room room3;
        C479170Iqh c479170Iqh6;
        C479170Iqh c479170Iqh7;
        Room room4;
        String strS5 = S5();
        C479150Iqf c479150Iqf = (C479150Iqf) getItem();
        if (c479150Iqf != null && (c479170Iqh7 = c479150Iqf.LLILLL) != null && (room4 = c479170Iqh7.LJFF) != null) {
            numValueOf = Integer.valueOf(C477860Ioa.LIZ(room4));
        } else {
            numValueOf = null;
        }
        Long lN5 = N5();
        C479150Iqf c479150Iqf2 = (C479150Iqf) getItem();
        if (c479150Iqf2 != null && (c479170Iqh6 = c479150Iqf2.LLILLL) != null) {
            lValueOf = Long.valueOf(c479170Iqh6.LIZ);
        } else {
            lValueOf = null;
        }
        C479150Iqf c479150Iqf3 = (C479150Iqf) getItem();
        if (c479150Iqf3 != null && (c479170Iqh5 = c479150Iqf3.LLILLL) != null && (room3 = c479170Iqh5.LJFF) != null) {
            requestId = room3.getRequestId();
        } else {
            requestId = null;
        }
        C479150Iqf c479150Iqf4 = (C479150Iqf) getItem();
        if (c479150Iqf4 != null && (c479170Iqh4 = c479150Iqf4.LLILLL) != null && (room2 = c479170Iqh4.LJFF) != null) {
            numValueOf2 = Integer.valueOf(room2.getUserCount());
        } else {
            numValueOf2 = null;
        }
        String strS52 = S5();
        C479150Iqf c479150Iqf5 = (C479150Iqf) getItem();
        if (c479150Iqf5 != null && (c479170Iqh3 = c479150Iqf5.LLILLL) != null && (cardTag = c479170Iqh3.LIZLLL) != null) {
            str2 = cardTag.text;
        } else {
            str2 = null;
        }
        C479150Iqf c479150Iqf6 = (C479150Iqf) getItem();
        if (c479150Iqf6 != null && (c479170Iqh2 = c479150Iqf6.LLILLL) != null) {
            str3 = c479170Iqh2.LIZIZ;
        } else {
            str3 = null;
        }
        Integer numValueOf3 = Integer.valueOf(getLayoutPosition() + 1);
        C479150Iqf c479150Iqf7 = (C479150Iqf) getItem();
        if (c479150Iqf7 != null && (c479170Iqh = c479150Iqf7.LLILLL) != null && (room = c479170Iqh.LJFF) != null && (multiLiveUserSettings = room.multiLiveUserSettings) != null && (multiLiveUserApplySettings = multiLiveUserSettings.multiLiveUserApplySettings) != null) {
            map = multiLiveUserApplySettings.extraInfo;
        } else {
            map = null;
        }
        C477860Ioa.LJIIIZ(new C477870Iob("play_card_feed", "live_cell", strS5, numValueOf, 1, lN5, lValueOf, requestId, numValueOf2, strS52, str2, str3, numValueOf3, null, map, 8192), str, null, 4);
    }

    @Override // com.ss.android.ugc.aweme.hangout.component.livecard.view.BaseMultiFeedPowerCell, com.bytedance.ies.powerlist.PowerCell
    /* JADX INFO: renamed from: U5, reason: merged with bridge method [inline-methods] */
    public final void onBindItemView(C479150Iqf c479150Iqf) {
        String str;
        String str2;
        Object c098200Yq;
        ImageModel avatarThumb;
        String str3;
        String str4;
        super.onBindItemView(c479150Iqf);
        R5().LIZIZ();
        R5().LJFF();
        CardTag cardTag = c479150Iqf.LLILLL.LIZJ;
        if (cardTag != null) {
            str = cardTag.text;
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            C439101nJ.LJI((View) this.LLIZ.getValue());
        } else {
            CardTag cardTag2 = c479150Iqf.LLILLL.LIZJ;
            if (cardTag2 != null) {
                C12ES.LJIILL(0, (View) this.LLIZ.getValue());
                if (!TextUtils.isEmpty(cardTag2.text)) {
                    ((TextView) this.LLILLJJLI.getValue()).setText(cardTag2.text);
                }
            }
        }
        if (!TextUtils.isEmpty(c479150Iqf.LLILLL.LIZIZ)) {
            ((TextView) this.LLILLL.getValue()).setText(c479150Iqf.LLILLL.LIZIZ);
        } else if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline()) {
            ((TextView) this.LLILLL.getValue()).setText("Server did not provide text");
        }
        CardTag cardTag3 = c479150Iqf.LLILLL.LIZLLL;
        if (cardTag3 != null) {
            str2 = cardTag3.text;
        } else {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            TextView textView = (TextView) this.LLILZ.getValue();
            CardTag cardTag4 = c479150Iqf.LLILLL.LIZLLL;
            if (cardTag4 != null) {
                str4 = cardTag4.text;
            } else {
                str4 = null;
            }
            textView.setText(str4);
        } else if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline()) {
            ((TextView) this.LLILZ.getValue()).setText("Server did not provide text");
        }
        try {
            CardTag cardTag5 = c479150Iqf.LLILLL.LIZLLL;
            if (cardTag5 != null && (str3 = cardTag5.textColor) != null) {
                c098200Yq = Integer.valueOf(Color.parseColor(str3));
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            ((TextView) this.LLILZ.getValue()).setTextColor(num.intValue());
        }
        List<User> list = c479150Iqf.LLILLL.LJ;
        if (list != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (User user : list) {
                if (user != null) {
                    avatarThumb = user.getAvatarThumb();
                } else {
                    avatarThumb = null;
                }
                arrayList.add(avatarThumb);
            }
            P5().setAvatars(arrayList);
        }
        P5().setOnViewClickListener(new AwS408S0200000_7(this, c479150Iqf, 15));
        P5().setScrollState(false);
        P5().setOnAddClickListener(new AwS408S0200000_7(this, c479150Iqf, 16));
        P5().setOnAvatarClickListener(new AwS408S0200000_7(this, c479150Iqf, 17));
        C500260Jjc.LJLIIIL(500L, this.itemView, new AwS373S0200000_7(this, c479150Iqf, 11));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC1906750zib
    public final void onResume(boolean z) {
        R5().LIZIZ();
        R5().LJFF();
        super.onResume(z);
    }

    public final void V5(C479150Iqf c479150Iqf, boolean z) {
        String feedCardEnterMethodV2;
        Long lValueOf;
        String requestId;
        String strLJJLIIIJ;
        Long lValueOf2;
        String requestId2;
        String strLJJLIIIJ2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("playCard clicked, roomId:");
        sbLIZ.append(c479150Iqf.LLILLL.LIZ);
        C20441214yg.LIZIZ("legolas", C2188811AlT.LIZIZ(sbLIZ));
        C479170Iqh c479170Iqh = c479150Iqf.LLILLL;
        Room room = c479170Iqh.LJFF;
        MGModuleTab mGModuleTab = c479170Iqh.LJI;
        if (mGModuleTab == null || (feedCardEnterMethodV2 = mGModuleTab.name) == null) {
            feedCardEnterMethodV2 = MultiGuestTopLiveParmasConfigSetting.INSTANCE.getFeedCardEnterMethodV2();
        }
        String str = null;
        if (OptimizeEnterRoomPipelineSetting.INSTANCE.enable() && room != null && room.getId() > 0) {
            C477500Io0 c477500Io0 = C477500Io0.LIZ;
            C479170Iqh c479170Iqh2 = c479150Iqf.LLILLL;
            long j = c479170Iqh2.LIZ;
            MGModuleTab mGModuleTab2 = c479170Iqh2.LJI;
            if (mGModuleTab2 != null) {
                lValueOf2 = Long.valueOf(mGModuleTab2.innerFeedMgAggId);
            } else {
                lValueOf2 = null;
            }
            Room room2 = c479150Iqf.LLILLL.LJFF;
            if (room2 != null) {
                requestId2 = room2.getRequestId();
            } else {
                requestId2 = null;
            }
            List<CardTag> list = c479150Iqf.LLILLL.LJIIJ;
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (CardTag cardTag : list) {
                    if (cardTag.key.length() > 0) {
                        arrayList.add(cardTag);
                    }
                }
                strLJJLIIIJ2 = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, AFwS237S0000000_7.get$arr$(82), 30);
            } else {
                strLJJLIIIJ2 = null;
            }
            CardTag cardTag2 = c479150Iqf.LLILLL.LIZLLL;
            if (cardTag2 != null) {
                str = cardTag2.key;
            }
            C477500Io0.LJIJI(c477500Io0, j, room, feedCardEnterMethodV2, lValueOf2, requestId2, z, new C477510Io1(strLJJLIIIJ2, str), null, null, null, null, null, null, null, null, 32640);
            return;
        }
        C477500Io0 c477500Io02 = C477500Io0.LIZ;
        C479170Iqh c479170Iqh3 = c479150Iqf.LLILLL;
        long j2 = c479170Iqh3.LIZ;
        MGModuleTab mGModuleTab3 = c479170Iqh3.LJI;
        if (mGModuleTab3 != null) {
            lValueOf = Long.valueOf(mGModuleTab3.innerFeedMgAggId);
        } else {
            lValueOf = null;
        }
        Room room3 = c479150Iqf.LLILLL.LJFF;
        if (room3 != null) {
            requestId = room3.getRequestId();
        } else {
            requestId = null;
        }
        List<CardTag> list2 = c479150Iqf.LLILLL.LJIIJ;
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList();
            for (CardTag cardTag3 : list2) {
                if (cardTag3.key.length() > 0) {
                    arrayList2.add(cardTag3);
                }
            }
            strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList2, ",", null, null, 0, null, AFwS237S0000000_7.get$arr$(83), 30);
        } else {
            strLJJLIIIJ = null;
        }
        CardTag cardTag4 = c479150Iqf.LLILLL.LIZLLL;
        if (cardTag4 != null) {
            str = cardTag4.key;
        }
        C477500Io0.LJ(c477500Io02, j2, room, feedCardEnterMethodV2, lValueOf, requestId, z, new C477510Io1(strLJJLIIIJ, str), 128);
    }
}
