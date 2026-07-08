package com.ss.android.ugc.aweme.explore.assem.dm;

import X.C01GW;
import X.C03IT;
import X.C07MS;
import X.C1220000hqw;
import X.C1230860i8S;
import X.C1389890mGx;
import X.C13LE;
import X.C15T5;
import X.C15VN;
import X.C15VS;
import X.C15VZ;
import X.C1843500y4a;
import X.C1954807lC;
import X.C197039127h;
import X.C19EG;
import X.C21681819tI;
import X.C2188811AlT;
import X.C2493709pv;
import X.C384050F3z;
import X.C418440Gaw;
import X.C427660Gpo;
import X.C452070Ho5;
import X.C452501pT;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.EnumC1229960i70;
import X.InterfaceC1086510eNd;
import X.InterfaceC1891350zJl;
import Y.ARunnableS118S0100000_18;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.hox.Hox;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.explore.ability.ExploreManageTabAbility;
import com.ss.android.ugc.aweme.explore.ability.MiddleBridgeCellAbility;
import com.ss.android.ugc.aweme.explore.data.ExploreChatGroupStruct;
import com.ss.android.ugc.aweme.explore.data.ExploreCustomTopicResponse;
import com.ss.android.ugc.aweme.explore.topic.ExploreRecommendTopicBottomSheetFragment;
import com.ss.android.ugc.aweme.explore.vm.ExploreFeedImpressionManager;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AFwS258S0000000_20;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS147S0110000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS710S0100000_31;

/* JADX INFO: loaded from: classes32.dex */
public final class ExploreDMGroupCell extends PowerCell<C15T5> implements InterfaceC1086510eNd {
    public static final /* synthetic */ int LLJILLL = 0;
    public final /* synthetic */ C15VZ LL = new C15VZ();
    public C427660Gpo LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public TuxTextView LLILZLL;
    public C197039127h LLIZ;
    public final C736950SvV LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;

    @Override // X.InterfaceC1086510eNd
    public final void b1() {
        L5(true);
    }

    public final String I5() {
        C21681819tI c21681819tI;
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        return ((!(layoutParams instanceof C21681819tI) || (c21681819tI = (C21681819tI) layoutParams) == null) ? getLayoutPosition() : c21681819tI.LIZ()) % 2 == 0 ? "left" : "right";
    }

    @Override // X.InterfaceC1086510eNd
    public final float z4() {
        return this.LL.LL;
    }

    public ExploreDMGroupCell() {
        AwS575S0100000_31 awS575S0100000_31 = new AwS575S0100000_31(this, 618);
        this.LLIZLLLIL = new C736950SvV(C13LE.LIZ(ExploreFeedImpressionManager.class), awS575S0100000_31, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS276S0000000_31.get$arr$(91), null, null, null);
        this.LLJ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 621));
        this.LLJI = C452501pT.LIZIZ(new AwS575S0100000_31(this, 617));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 619));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS575S0100000_31(this, 620));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS575S0100000_31(this, 616));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View viewFindViewById = this.itemView.findViewById(R.id.hh0);
        if (viewFindViewById != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.zn);
            viewFindViewById.setBackground(c384050F3z.LIZ(this.itemView.getContext()));
        }
        this.LLILLJJLI = (C427660Gpo) this.itemView.findViewById(R.id.hh8);
        this.LLILLL = (TuxTextView) this.itemView.findViewById(R.id.zoe);
        this.LLILZ = (TuxTextView) this.itemView.findViewById(R.id.zod);
        this.LLILZIL = (TuxTextView) this.itemView.findViewById(R.id.zx_);
        this.LLILZLL = (TuxTextView) this.itemView.findViewById(R.id.zx9);
        C197039127h c197039127h = (C197039127h) this.itemView.findViewById(R.id.crd);
        this.LLIZ = c197039127h;
        if (c197039127h != null) {
            C786410Ut5.I7(new AbS710S0100000_31(this, 8), c197039127h);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        L5(false);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        super.onViewDetachedFromWindow();
    }

    public final void L5(boolean z) {
        C19EG currentActivity;
        Long l;
        ExploreCustomTopicResponse exploreCustomTopicResponseYB1;
        ExploreChatGroupStruct exploreChatGroupStruct;
        Long l2;
        String string = null;
        if (!C07MS.LIZ() || !(getCurrentFragment() instanceof ExploreRecommendTopicBottomSheetFragment)) {
            Fragment currentFragment = getCurrentFragment();
            if (currentFragment != null && (currentActivity = getCurrentActivity()) != null && currentFragment.isVisible() && Hox.LLJILJIL.LIZ(currentActivity).KQ2("homepage_explore")) {
                ExploreManageTabAbility exploreManageTabAbility = (ExploreManageTabAbility) this.LLJIJIL.getValue();
                if (exploreManageTabAbility != null && (exploreCustomTopicResponseYB1 = exploreManageTabAbility.yB1()) != null) {
                    l = exploreCustomTopicResponseYB1.topicId;
                } else {
                    l = null;
                }
                if (!Intrinsics.LJFF(l, this.LLJ.getValue())) {
                    return;
                }
            } else {
                return;
            }
        }
        if (z) {
            if (!this.LL.LIZ(this.itemView)) {
                return;
            }
        }
        ExploreFeedImpressionManager exploreFeedImpressionManager = (ExploreFeedImpressionManager) this.LLIZLLLIL.getValue();
        C15T5 item = getItem();
        if (item != null && (exploreChatGroupStruct = item.LL) != null && (l2 = exploreChatGroupStruct.groupId) != null) {
            string = l2.toString();
        }
        C15T5 item2 = getItem();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("card_index", String.valueOf(getLayoutPosition()));
        linkedHashMap.put("card_position", I5());
        AwS147S0110000_31 awS147S0110000_31 = new AwS147S0110000_31(this, z, 1);
        if (z) {
            exploreFeedImpressionManager.LL.LIZJ(string, item2, linkedHashMap, awS147S0110000_31);
        } else {
            exploreFeedImpressionManager.LLILLJJLI.LIZJ(string, item2, linkedHashMap, awS147S0110000_31);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        long jIntValue;
        C15T5 c15t5 = (C15T5) interfaceC1891350zJl;
        super.onBindItemView(c15t5);
        ExploreChatGroupStruct exploreChatGroupStruct = c15t5.LL;
        C427660Gpo c427660Gpo = this.LLILLJJLI;
        if (c427660Gpo != null) {
            C427660Gpo.LJIIJJI(c427660Gpo, new C03IT(Collections.singletonList(exploreChatGroupStruct.avatarUrl)), false, null, null, false, false, null, null, false, AFwS258S0000000_20.get$arr$(19), 510);
        }
        C427660Gpo c427660Gpo2 = this.LLILLJJLI;
        if (c427660Gpo2 != null) {
            c427660Gpo2.setSize(84);
        }
        String str = exploreChatGroupStruct.groupName;
        TuxTextView tuxTextView = this.LLILLL;
        if (tuxTextView != null) {
            tuxTextView.setText(str);
        }
        TuxTextView tuxTextView2 = this.LLILLL;
        if (tuxTextView2 != null) {
            HandlerHook.viewPost(tuxTextView2, new ARunnableS118S0100000_18(this, 85));
        }
        String str2 = exploreChatGroupStruct.groupDesc;
        if (str2 != null && str2.length() != 0) {
            TuxTextView tuxTextView3 = this.LLILZ;
            if (tuxTextView3 != null) {
                C786410Ut5.LLLLZLL(tuxTextView3, 0);
            }
            TuxTextView tuxTextView4 = this.LLILZ;
            if (tuxTextView4 != null) {
                tuxTextView4.setText(exploreChatGroupStruct.groupDesc);
            }
        } else {
            TuxTextView tuxTextView5 = this.LLILZ;
            if (tuxTextView5 != null) {
                C786410Ut5.LLLLZLL(tuxTextView5, 8);
            }
        }
        TuxTextView tuxTextView6 = this.LLILZIL;
        if (tuxTextView6 != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.itemView.getContext().getString(2131829887));
            sbLIZ.append((char) 183);
            tuxTextView6.setText(C2188811AlT.LIZIZ(sbLIZ));
        }
        TuxTextView tuxTextView7 = this.LLILZLL;
        if (tuxTextView7 != null) {
            Integer num = exploreChatGroupStruct.groupMemberCount;
            if (num != null) {
                jIntValue = num.intValue();
            } else {
                jIntValue = 0;
            }
            tuxTextView7.setText(C1843500y4a.LIZIZ(jIntValue));
        }
        C15VS c15vs = C15VN.Companion;
        C15VN chatGroupVerifyStatus = exploreChatGroupStruct.getChatGroupVerifyStatus();
        c15vs.getClass();
        N5(C15VS.LIZIZ(chatGroupVerifyStatus), false);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        C2493709pv c2493709pv = C2493709pv.LIZ;
        Context context = viewGroup.getContext();
        c2493709pv.getClass();
        return C2493709pv.LIZ(context, R.layout.c5a, viewGroup);
    }

    public final void N5(EnumC1229960i70 enumC1229960i70, boolean z) {
        MiddleBridgeCellAbility middleBridgeCellAbility;
        switch (C1230860i8S.LIZ[enumC1229960i70.ordinal()]) {
            case 1:
                C197039127h c197039127h = this.LLIZ;
                if (c197039127h != null) {
                    c197039127h.setText(this.itemView.getContext().getString(2131829889));
                }
                C197039127h c197039127h2 = this.LLIZ;
                if (c197039127h2 != null) {
                    c197039127h2.setEnabled(true);
                    return;
                }
                return;
            case 2:
                C197039127h c197039127h3 = this.LLIZ;
                if (c197039127h3 != null) {
                    c197039127h3.setText(this.itemView.getContext().getString(2131829890));
                }
                C197039127h c197039127h4 = this.LLIZ;
                if (c197039127h4 != null) {
                    c197039127h4.setEnabled(false);
                }
                if (z) {
                    C1389890mGx c1389890mGx = new C1389890mGx(this.itemView);
                    c1389890mGx.LJIIIZ(2131850551);
                    c1389890mGx.LJIIJJI();
                    return;
                }
                return;
            case 3:
                C197039127h c197039127h5 = this.LLIZ;
                if (c197039127h5 != null) {
                    c197039127h5.setText(this.itemView.getContext().getString(2131829888));
                }
                C197039127h c197039127h6 = this.LLIZ;
                if (c197039127h6 != null) {
                    c197039127h6.setEnabled(true);
                    return;
                }
                return;
            case 4:
            case 5:
                C15T5 item = getItem();
                if (item != null && (middleBridgeCellAbility = (MiddleBridgeCellAbility) this.LLJILJIL.getValue()) != null) {
                    middleBridgeCellAbility.Gs2(item);
                    return;
                }
                return;
            case 6:
                return;
            default:
                throw new C1954807lC();
        }
    }
}
