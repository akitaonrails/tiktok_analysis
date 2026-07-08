package com.ss.android.ugc.aweme.tako.botpage.components.video.videolist;

import X.AbstractC2211791BhR;
import X.C01GW;
import X.C05PU;
import X.C0B1N;
import X.C0R2X;
import X.C1196320hEk;
import X.C1322090kVb;
import X.C1331070kk5;
import X.C13LC;
import X.C13LP;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1819107An;
import X.C1819507Ar;
import X.C1847340yAm;
import X.C1860990yWn;
import X.C1862330yYx;
import X.C1863850ybP;
import X.C1E7C;
import X.C2097608Jq;
import X.C21146717pB;
import X.C2188811AlT;
import X.C2211631BhB;
import X.C2211751BhN;
import X.C298820BnU;
import X.C452501pT;
import X.C689590R3d;
import X.C689600R3e;
import X.C786410Ut5;
import X.InterfaceC665370Q7z;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.ITakoHighLightAnimProtocol;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS585S0100000_6;

/* JADX INFO: loaded from: classes11.dex */
public final class TakoVideoItemCell extends PowerCell<C689600R3e> implements ITakoHighLightAnimProtocol {
    public C689600R3e LL;
    public final Set<String> LLILLJJLI = new LinkedHashSet();
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 745));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 746));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 884));
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 887));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 748));
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 881));
    public final C01GW LLJ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 882));
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS550S0100000_6(this, 744));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 879));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 880));
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 885));
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 747));
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS554S0100000_10(this, 883));
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS554S0100000_10(this, 886));

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.ITakoHighLightAnimProtocol
    public final int Lm0() {
        return LSPassThroughRecordSizeConfig.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.ITakoHighLightAnimProtocol
    public final boolean isClosed() {
        return true;
    }

    public final TuxIconView N5() {
        return (TuxIconView) this.LLILZIL.getValue();
    }

    public final TakoCardAbility P5() {
        return (TakoCardAbility) this.LLILZ.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        C2211631BhB.LJ(this.itemView, new AwS585S0100000_6(this, 395));
        if (((Boolean) C1819507Ar.LIZ.getValue()).booleanValue()) {
            C1331070kk5 c1331070kk5 = (C1331070kk5) ((C1322090kVb) this.LLILZLL.getValue()).getHierarchy();
            if (c1331070kk5 != null) {
                c1331070kk5.LJIJ(null, 1);
            }
            C1331070kk5 c1331070kk52 = (C1331070kk5) ((C1322090kVb) this.LLILZLL.getValue()).getHierarchy();
            if (c1331070kk52 != null) {
                c1331070kk52.LJIJ(null, 5);
            }
        }
        if (C1819107An.LIZ()) {
            C2211751BhN.LIZ(this.itemView, (AbstractC2211791BhR) this.LLILLL.getValue());
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void unBind() {
        super.unBind();
        InterfaceC665370Q7z interfaceC665370Q7zLIZ = C1196320hEk.LIZ(this);
        if (interfaceC665370Q7zLIZ != null) {
            C1554610qYd.LIZLLL(interfaceC665370Q7zLIZ, ITakoHighLightAnimProtocol.class, this);
        }
    }

    public final void L5(C689600R3e c689600R3e) {
        String string;
        Map<String, String> mapLJ;
        ITakoContextAbility iTakoContextAbility;
        Message messageYy1;
        TakoMixFeed takoMixFeedLJIIIZ;
        if (!C1819107An.LIZ()) {
            ((C1322090kVb) this.LLILZLL.getValue()).setImageDrawable(null);
        }
        SmartImageView smartImageView = (SmartImageView) this.LLILZLL.getValue();
        TakoVideoItem takoVideoItem = c689600R3e.LLILLL;
        TakoCardAbility takoCardAbilityP5 = P5();
        if (takoCardAbilityP5 != null && (messageYy1 = takoCardAbilityP5.Yy1()) != null && (takoMixFeedLJIIIZ = messageYy1.LJIIIZ()) != null) {
            string = Integer.valueOf(takoMixFeedLJIIIZ.cardType).toString();
        } else {
            string = null;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLIZ = C1196320hEk.LIZ(this);
        if (interfaceC665370Q7zLIZ == null || (iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZ, ITakoContextAbility.class, null)) == null || (mapLJ = iTakoContextAbility.getCommonParams()) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        C1860990yWn.LIZ(smartImageView, takoVideoItem, string, mapLJ, null, C298820BnU.LIZJ);
    }

    public final void R5(C689600R3e c689600R3e) {
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        Message messageYy1;
        String str;
        Long lValueOf;
        String str2;
        Integer num;
        Integer num2;
        String string;
        Integer numValueOf;
        String str3;
        Integer numValueOf2;
        Integer num3;
        String str4;
        Message messageYy12;
        TakoCardAbility takoCardAbilityP5;
        Message messageYy13;
        Message messageYy14;
        Message messageYy15;
        TakoMixFeed takoMixFeedLJIIIZ;
        InterfaceC665370Q7z interfaceC665370Q7zLIZ = C1196320hEk.LIZ(this);
        if (interfaceC665370Q7zLIZ != null) {
            Long lValueOf2 = null;
            ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(interfaceC665370Q7zLIZ, ITakoContextAbility.class, null);
            if (iTakoContextAbility != null && (c13lcT71 = iTakoContextAbility.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
                TakoCardAbility takoCardAbilityP52 = P5();
                if (takoCardAbilityP52 != null) {
                    messageYy1 = takoCardAbilityP52.Yy1();
                } else {
                    messageYy1 = null;
                }
                C1862330yYx c1862330yYx = C1862330yYx.LIZ;
                String str5 = c1863850ybP.LL;
                String str6 = "";
                if (str5 == null) {
                    str5 = "";
                }
                String str7 = c1863850ybP.LLILLJJLI;
                if (str7 == null) {
                    str7 = "";
                }
                if (messageYy1 == null || (str = messageYy1.uuid) == null) {
                    str = "";
                }
                String str8 = c1863850ybP.LLILZIL;
                if (str8 == null) {
                    str8 = "";
                }
                String str9 = c1863850ybP.LLILZLL;
                if (str9 == null) {
                    str9 = "";
                }
                if (messageYy1 != null) {
                    lValueOf = Long.valueOf(messageYy1.botId);
                } else {
                    lValueOf = null;
                }
                String strValueOf = String.valueOf(lValueOf);
                if (messageYy1 != null) {
                    lValueOf2 = Long.valueOf(messageYy1.actionId);
                    str2 = messageYy1.subSessionId;
                } else {
                    str2 = null;
                }
                String str10 = c1863850ybP.LLILLL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c689600R3e.LLILZ);
                sbLIZ.append('_');
                sbLIZ.append(c689600R3e.LL);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                String str11 = c689600R3e.LLILLL.awemeId;
                int i = c689600R3e.LL;
                C689590R3d c689590R3d = c689600R3e.LLIZLLLIL;
                if (c689590R3d != null) {
                    num = c689590R3d.LIZ;
                    num2 = c689590R3d.LIZJ;
                } else {
                    num = null;
                    num2 = null;
                }
                TakoCardAbility takoCardAbilityP53 = P5();
                if (takoCardAbilityP53 != null) {
                    string = Integer.valueOf(takoCardAbilityP53.t70()).toString();
                } else {
                    string = null;
                }
                TakoCardAbility takoCardAbilityP54 = P5();
                if (takoCardAbilityP54 != null && (messageYy15 = takoCardAbilityP54.Yy1()) != null && (takoMixFeedLJIIIZ = messageYy15.LJIIIZ()) != null) {
                    numValueOf = Integer.valueOf(takoMixFeedLJIIIZ.cardType);
                } else {
                    numValueOf = null;
                }
                String strLIZIZ2 = C0R2X.LIZIZ(numValueOf);
                String str12 = (String) C13LP.LJJJLL(c689600R3e.LLILLL.cover.urlList);
                if (str12 != null) {
                    str6 = str12;
                }
                TakoCardAbility takoCardAbilityP55 = P5();
                if (takoCardAbilityP55 != null && (messageYy14 = takoCardAbilityP55.Yy1()) != null && messageYy14.isMultiAnswer) {
                    str3 = "multi_answer";
                } else {
                    str3 = "default";
                }
                TakoCardAbility takoCardAbilityP56 = P5();
                if (takoCardAbilityP56 != null && (messageYy12 = takoCardAbilityP56.Yy1()) != null && messageYy12.isMultiAnswer && (takoCardAbilityP5 = P5()) != null && (messageYy13 = takoCardAbilityP5.Yy1()) != null) {
                    numValueOf2 = Integer.valueOf(messageYy13.selectedAnswerIndex + 1);
                } else {
                    numValueOf2 = null;
                }
                TakoVideoItem takoVideoItem = c689600R3e.LLILLL;
                Integer num4 = takoVideoItem.awemeType;
                C689590R3d c689590R3d2 = c689600R3e.LLIZLLLIL;
                if (c689590R3d2 != null) {
                    num3 = c689590R3d2.LIZIZ;
                } else {
                    num3 = null;
                }
                String str13 = c1863850ybP.LLILZIL;
                if (messageYy1 != null) {
                    str4 = messageYy1.uuid;
                } else {
                    str4 = null;
                }
                String str14 = takoVideoItem.awemeId;
                c1862330yYx.getClass();
                String str15 = str2;
                C1862330yYx.LJJJJJ(c1862330yYx, str5, str7, str, str8, str9, c1863850ybP.LLIZ, strValueOf, lValueOf2, str15, str10, "video", str11, string, strLIZIZ2, str6, null, null, strLIZIZ, str3, numValueOf2, Integer.valueOf(i), num, num2, null, num4, null, num3, C1862330yYx.LIZ(str13, str4, str14), null, false, 1694728192);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.ITakoHighLightAnimProtocol
    public final C05PU dz(int i) {
        return new C1847340yAm(this.itemView);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0267  */
    @Override // com.bytedance.ies.powerlist.PowerCell
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindItemView(X.InterfaceC1891350zJl r11) {
        /*
            Method dump skipped, instruction units count: 1204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.botpage.components.video.videolist.TakoVideoItemCell.onBindItemView(X.0zJl):void");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        boolean z;
        if ((C0B1N.LIZ() & 4) == 4) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return C21146717pB.LIZIZ(viewGroup.getContext(), R.layout.fm8, viewGroup, false);
        }
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.fm8, viewGroup, false);
    }

    public final void I5(int i, int i2) {
        if (!((Boolean) C1E7C.LIZLLL.getValue()).booleanValue()) {
            ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = i2;
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = this.itemView.getLayoutParams();
        if (layoutParams2 == null) {
            C786410Ut5.W5(this.itemView, new ViewGroup.LayoutParams(i, i2));
        } else {
            if (layoutParams2.width == i && layoutParams2.height == i2) {
                return;
            }
            layoutParams2.width = i;
            layoutParams2.height = i2;
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.ITakoHighLightAnimProtocol
    public final boolean wv1(Message message, int i) {
        TakoMixFeed takoMixFeedLJIIIZ;
        C689600R3e item;
        if (message != null) {
            TakoMixFeed takoMixFeedLJIIIZ2 = message.LJIIIZ();
            if (((takoMixFeedLJIIIZ2 != null && takoMixFeedLJIIIZ2.cardType == 3) || (((takoMixFeedLJIIIZ = message.LJIIIZ()) != null && takoMixFeedLJIIIZ.cardType == 13) || (message.msgType == 3 && !message.sender.isSelf))) && (item = getItem()) != null && i == item.LL) {
                return true;
            }
            return false;
        }
        return false;
    }
}
