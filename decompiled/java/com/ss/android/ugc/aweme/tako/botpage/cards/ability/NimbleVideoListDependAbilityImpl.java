package com.ss.android.ugc.aweme.tako.botpage.cards.ability;

import X.C01GW;
import X.C05PU;
import X.C0B1N;
import X.C0PEM;
import X.C0PHT;
import X.C0R2W;
import X.C0R2X;
import X.C0R2Z;
import X.C13LC;
import X.C13LP;
import X.C15438062q;
import X.C1554610qYd;
import X.C1558520qew;
import X.C1697810uHb;
import X.C1847340yAm;
import X.C1847380yAq;
import X.C1857280yQo;
import X.C1857750yRZ;
import X.C1858660yT2;
import X.C1860820yWW;
import X.C1860930yWh;
import X.C1860990yWn;
import X.C1862330yYx;
import X.C1863850ybP;
import X.C1863920ybW;
import X.C1914507eh;
import X.C1920407fe;
import X.C1920507ff;
import X.C2097608Jq;
import X.C2296808zG;
import X.C23250099c;
import X.C298820BnU;
import X.C313940CSi;
import X.C326880Cre;
import X.C452501pT;
import X.C642420PHs;
import X.C689500R2u;
import X.C789500Uy4;
import X.InterfaceC1860950yWj;
import X.InterfaceC689490R2t;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleVideoListDependAbility;
import com.ss.android.ugc.aweme.nimblecard.tako.component.video.NimbleVideoItemAssem;
import com.ss.android.ugc.aweme.nimblecard.tako.component.video.NimbleVideoListAssem;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.ITakoHighLightAnimProtocol;
import com.ss.android.ugc.aweme.tako.botpage.cards.base.TakoAnswerBaseAssem;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPassExt;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoVideoItem;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.ss.android.ugc.aweme.tako.ui.TakoChatUIAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS155S0400000_27;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: loaded from: classes28.dex */
public final class NimbleVideoListDependAbilityImpl<T extends C1858660yT2> implements INimbleVideoListDependAbility {
    public final TakoAnswerBaseAssem<T> LL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS571S0100000_27(this, 695));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 696));
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 697));
    public NimbleVideoListDependAbilityImpl$registerVideoItemProtocol$1 LLILZIL;

    @Override // com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleVideoListDependAbility
    public final boolean Ad2() {
        Message messageYy1;
        String str = this.LL.Yy1().uuid;
        IMessageAbility iMessageAbility = (IMessageAbility) this.LLILLJJLI.getValue();
        if (iMessageAbility == null || (messageYy1 = iMessageAbility.DL1(str)) == null) {
            messageYy1 = this.LL.Yy1();
        }
        return C1857280yQo.LIZIZ(messageYy1);
    }

    @Override // com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleVideoListDependAbility
    public final void Gt() {
        ViewGroup viewGroupY4 = this.LL.Y4();
        if (viewGroupY4 != null) {
            viewGroupY4.performLongClick();
        }
    }

    @Override // com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleVideoListDependAbility
    public final RecyclerView.RecycledViewPool Nr() {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvCM;
        TakoChatUIAbility takoChatUIAbility = (TakoChatUIAbility) this.LLILLL.getValue();
        if (takoChatUIAbility == null || (viewOnAttachStateChangeListenerC20604515jvCM = takoChatUIAbility.cM()) == null) {
            return null;
        }
        return viewOnAttachStateChangeListenerC20604515jvCM.getRecycledViewPool();
    }

    @Override // com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleVideoListDependAbility
    public final String getMessageId() {
        return this.LL.Yy1().uuid;
    }

    @Override // com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleVideoListDependAbility
    public final List<TakoVideoItem> getVideoList() {
        TakoMixFeed takoMixFeedLJIIIZ = this.LL.Yy1().LJIIIZ();
        if (takoMixFeedLJIIIZ != null) {
            return takoMixFeedLJIIIZ.videoList;
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleVideoListDependAbility
    public final boolean isVisible() {
        Message messageYy1;
        TakoMixFeed takoMixFeedLJIIIZ;
        TakoPassExt takoPassExt;
        TakoAnswerBaseAssem<T> takoAnswerBaseAssem = this.LL;
        boolean z = false;
        if (takoAnswerBaseAssem != null && (messageYy1 = takoAnswerBaseAssem.Yy1()) != null && (takoMixFeedLJIIIZ = messageYy1.LJIIIZ()) != null && (takoPassExt = takoMixFeedLJIIIZ.ext) != null && takoPassExt.isBigVideo == 1) {
            z = true;
        }
        return !z;
    }

    @Override // com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleVideoListDependAbility
    public final void ma1() {
        C13LC<C1863920ybW> c13lcRg1;
        C1863920ybW c1863920ybW;
        C0PHT c0pht;
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) this.LLILZ.getValue();
        if (iTakoContextAbility == null || (c13lcRg1 = iTakoContextAbility.rg1()) == null || (c1863920ybW = (C1863920ybW) c13lcRg1.LIZIZ()) == null || (c0pht = c1863920ybW.LL) == null) {
            return;
        }
        c0pht.LIZJ = null;
        c0pht.LIZLLL = null;
        c0pht.LJ = null;
    }

    public NimbleVideoListDependAbilityImpl(TakoAnswerBaseAssem<T> takoAnswerBaseAssem) {
        this.LL = takoAnswerBaseAssem;
    }

    @Override // com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleVideoListDependAbility
    public final void CT0(final NimbleVideoListAssem nimbleVideoListAssem) {
        C1554610qYd.LIZJ(nimbleVideoListAssem, ITakoHighLightAnimProtocol.class, C1697810uHb.LJIILJJIL(new ITakoHighLightAnimProtocol() { // from class: com.ss.android.ugc.aweme.tako.botpage.cards.ability.NimbleVideoListDependAbilityImpl$registerVideoListProtocol$1
            @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.ITakoHighLightAnimProtocol
            public final int Lm0() {
                return 100;
            }

            @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.ITakoHighLightAnimProtocol
            public final boolean isClosed() {
                return true;
            }

            @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.ITakoHighLightAnimProtocol
            public final C05PU dz(int i) {
                Integer numValueOf;
                int iIntValue;
                LinearLayoutManager linearLayoutManager;
                C789500Uy4 c789500Uy4 = nimbleVideoListAssem.LLJLIL;
                View viewFindViewByPosition = null;
                if (c789500Uy4 == null) {
                    return null;
                }
                RecyclerView.LayoutManager layoutManager = c789500Uy4.getLayoutManager();
                if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                    numValueOf = Integer.valueOf(linearLayoutManager.findFirstCompletelyVisibleItemPosition());
                } else {
                    numValueOf = null;
                }
                RecyclerView.LayoutManager layoutManager2 = c789500Uy4.getLayoutManager();
                if (layoutManager2 != null) {
                    if (numValueOf != null) {
                        iIntValue = numValueOf.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    viewFindViewByPosition = layoutManager2.findViewByPosition(iIntValue);
                }
                return new C1847380yAq(c789500Uy4, i, viewFindViewByPosition, numValueOf, new Pair(Integer.valueOf(C1857750yRZ.LJ() / 2), Integer.valueOf(C1857750yRZ.LJ() / 2)));
            }

            @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.ITakoHighLightAnimProtocol
            public final boolean wv1(Message message, int i) {
                if (message != null) {
                    TakoMixFeed takoMixFeedLJIIIZ = message.LJIIIZ();
                    if (takoMixFeedLJIIIZ != null && takoMixFeedLJIIIZ.cardType == 3) {
                        return true;
                    }
                    TakoMixFeed takoMixFeedLJIIIZ2 = message.LJIIIZ();
                    if (takoMixFeedLJIIIZ2 != null && takoMixFeedLJIIIZ2.cardType == 13) {
                        return true;
                    }
                    if (message.msgType == 3 && !message.sender.isSelf) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
        }));
    }

    @Override // com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleVideoListDependAbility
    public final void GH(NimbleVideoItemAssem nimbleVideoItemAssem) {
        NimbleVideoListDependAbilityImpl$registerVideoItemProtocol$1 nimbleVideoListDependAbilityImpl$registerVideoItemProtocol$1 = this.LLILZIL;
        if (nimbleVideoListDependAbilityImpl$registerVideoItemProtocol$1 != null) {
            C1554610qYd.LIZLLL(nimbleVideoItemAssem, ITakoHighLightAnimProtocol.class, nimbleVideoListDependAbilityImpl$registerVideoItemProtocol$1);
        }
    }

    @Override // com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleVideoListDependAbility
    public final void JS1(View view) {
        view.setLayoutDirection(Ad2() ? 1 : 0);
    }

    @Override // com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleVideoListDependAbility
    public final void U62(List<? extends Aweme> list) {
        C0PHT c0pht;
        String str;
        C326880Cre c326880CreM50;
        C13LC<C1863920ybW> c13lcRg1;
        C1863920ybW c1863920ybW;
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) this.LLILZ.getValue();
        if (iTakoContextAbility == null || (c13lcRg1 = iTakoContextAbility.rg1()) == null || (c1863920ybW = (C1863920ybW) c13lcRg1.LIZIZ()) == null || (c0pht = c1863920ybW.LL) == null) {
            c0pht = new C0PHT(null, 511);
        }
        TakoAnswerBaseAssem<T> takoAnswerBaseAssem = this.LL;
        if (takoAnswerBaseAssem == null || (c326880CreM50 = takoAnswerBaseAssem.m50()) == null || (str = c326880CreM50.LLILLL.uuid) == null) {
            str = "";
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<? extends Aweme> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getAid());
        }
        C642420PHs.LIZIZ(c0pht, list, C1860820yWW.LIZIZ(str, arrayList.toString()));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0R2u] */
    @Override // com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleVideoListDependAbility
    public final C689500R2u Xo2(Object obj) {
        final InterfaceC689490R2t interfaceC689490R2t;
        if (!(obj instanceof InterfaceC689490R2t) || (interfaceC689490R2t = (InterfaceC689490R2t) obj) == null) {
            return null;
        }
        return new InterfaceC1860950yWj(interfaceC689490R2t, this) { // from class: X.0R2u
            public final List<TakoVideoItem> LL;
            public final String LLILLJJLI;
            public final Function2<View, InterfaceC665370Q7z, Unit> LLILLL;
            public final boolean LLILZ;
            public final C1920507ff LLILZIL;

            @Override // X.InterfaceC1860950yWj
            public final String LJIIIIZZ() {
                return this.LLILLJJLI;
            }

            @Override // X.InterfaceC1860950yWj
            public final boolean LJIILIIL() {
                return this.LLILZ;
            }

            @Override // X.InterfaceC1860950yWj
            public final Function2<View, InterfaceC665370Q7z, Unit> LJJ() {
                return this.LLILLL;
            }

            @Override // X.InterfaceC1860950yWj
            public final C1920507ff getUiConfig() {
                return this.LLILZIL;
            }

            @Override // X.InterfaceC1860950yWj
            public final List<TakoVideoItem> getVideoList() {
                return this.LL;
            }

            {
                this.LL = interfaceC689490R2t.getVideoList();
                this.LLILLJJLI = interfaceC689490R2t.LJIIIIZZ();
                this.LLILLL = interfaceC689490R2t.LJJ();
                interfaceC689490R2t.getMsg();
                this.LLILZ = interfaceC689490R2t.LJIILIIL();
                interfaceC689490R2t.LLJZIJLIL();
                this.LLILZIL = this.fy2(interfaceC689490R2t.LLJI());
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleVideoListDependAbility
    public final String ZA0(TakoVideoItem takoVideoItem) {
        boolean z;
        CharSequence charSequenceLIZIZ = C0R2Z.LIZIZ(takoVideoItem);
        if (((String) charSequenceLIZIZ).length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        String strLIZ = C0R2Z.LIZ(C1857750yRZ.LIZ, charSequenceLIZIZ);
        if (strLIZ.length() <= 0) {
            return null;
        }
        return strLIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.ss.android.ugc.aweme.tako.botpage.cards.ability.NimbleVideoListDependAbilityImpl$registerVideoItemProtocol$1] */
    @Override // com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleVideoListDependAbility
    public final void fW(final NimbleVideoItemAssem nimbleVideoItemAssem) {
        ?? r3 = new ITakoHighLightAnimProtocol() { // from class: com.ss.android.ugc.aweme.tako.botpage.cards.ability.NimbleVideoListDependAbilityImpl$registerVideoItemProtocol$1
            @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.ITakoHighLightAnimProtocol
            public final int Lm0() {
                return LSPassThroughRecordSizeConfig.DEFAULT;
            }

            @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.ITakoHighLightAnimProtocol
            public final boolean isClosed() {
                return true;
            }

            @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.ITakoHighLightAnimProtocol
            public final C05PU dz(int i) {
                return new C1847340yAm(nimbleVideoItemAssem.LJJIJL());
            }

            @Override // com.ss.android.ugc.aweme.tako.botpage.cards.base.ITakoHighLightAnimProtocol
            public final boolean wv1(Message message, int i) {
                TakoMixFeed takoMixFeedLJIIIZ;
                C1860930yWh c1860930yWh;
                if (message != null) {
                    TakoMixFeed takoMixFeedLJIIIZ2 = message.LJIIIZ();
                    if (((takoMixFeedLJIIIZ2 != null && takoMixFeedLJIIIZ2.cardType == 3) || (((takoMixFeedLJIIIZ = message.LJIIIZ()) != null && takoMixFeedLJIIIZ.cardType == 13) || (message.msgType == 3 && !message.sender.isSelf))) && (c1860930yWh = nimbleVideoItemAssem.LLJZ) != null && i == c1860930yWh.LL) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
        };
        this.LLILZIL = r3;
        C1554610qYd.LIZJ(nimbleVideoItemAssem, ITakoHighLightAnimProtocol.class, C1697810uHb.LJIILJJIL(r3));
    }

    @Override // com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleVideoListDependAbility
    public final C1920507ff fy2(Integer num) {
        int iLJFF;
        if (num != null) {
            iLJFF = num.intValue();
        } else {
            TakoChatUIAbility takoChatUIAbility = (TakoChatUIAbility) this.LLILLL.getValue();
            if (takoChatUIAbility != null) {
                takoChatUIAbility.Gx1();
            }
            iLJFF = C1857750yRZ.LJFF();
        }
        return new C1920507ff(new C1920407fe(iLJFF, C1857750yRZ.LIZLLL(), C1857750yRZ.LJ()), C1914507eh.LJ, true, 8);
    }

    @Override // com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleVideoListDependAbility
    public final Drawable jO(Context context) {
        return context.getDrawable(R.drawable.dez);
    }

    @Override // com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleVideoListDependAbility
    public final void n62(C1860930yWh c1860930yWh) {
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        String string;
        Integer numValueOf;
        String str;
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) this.LLILZ.getValue();
        if (iTakoContextAbility != null && (c13lcT71 = iTakoContextAbility.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
            Message messageYy1 = this.LL.Yy1();
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            String str2 = c1863850ybP.LL;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            String str4 = c1863850ybP.LLILLJJLI;
            if (str4 == null) {
                str4 = "";
            }
            String str5 = c1863850ybP.LLILZLL;
            if (str5 == null) {
                str5 = "";
            }
            String str6 = c1863850ybP.LLILZIL;
            if (str6 == null) {
                str6 = "";
            }
            String str7 = messageYy1.uuid;
            if (str7 == null) {
                str7 = "";
            }
            String strValueOf = String.valueOf(messageYy1.botId);
            long j = messageYy1.actionId;
            String str8 = messageYy1.subSessionId;
            String str9 = c1863850ybP.LLILLL;
            String strValueOf2 = String.valueOf(c1860930yWh.LL);
            String str10 = c1860930yWh.LLILLJJLI;
            String str11 = (String) C13LP.LJJJLL(c1860930yWh.LLILZ);
            if (str11 != null) {
                str3 = str11;
            }
            Integer numValueOf2 = null;
            TakoCardAbility takoCardAbility = (TakoCardAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), TakoCardAbility.class, null);
            if (takoCardAbility != null) {
                string = Integer.valueOf(takoCardAbility.t70()).toString();
            } else {
                string = null;
            }
            TakoMixFeed takoMixFeedLJIIIZ = this.LL.Yy1().LJIIIZ();
            if (takoMixFeedLJIIIZ != null) {
                numValueOf = Integer.valueOf(takoMixFeedLJIIIZ.cardType);
            } else {
                numValueOf = null;
            }
            String strLIZIZ = C0R2X.LIZIZ(numValueOf);
            boolean z = messageYy1.isMultiAnswer;
            if (z) {
                str = "multi_answer";
            } else {
                str = "default";
            }
            if (z) {
                numValueOf2 = Integer.valueOf(messageYy1.selectedAnswerIndex + 1);
            }
            String str12 = str2;
            String str13 = str4;
            C1862330yYx.LJJJJIZL(c1862330yYx, str12, str13, str7, str6, str5, c1863850ybP.LLIZ, strValueOf, Long.valueOf(j), str8, str9, "video", str10, string, strLIZIZ, str3, null, null, strValueOf2, str, numValueOf2, null, null, null, null, c1860930yWh.LLJIJIL, null, null, null, null, 1038319616);
        }
    }

    @Override // com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleVideoListDependAbility
    public final void ur1(C1860930yWh c1860930yWh) {
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) this.LLILZ.getValue();
        if (iTakoContextAbility != null && (c13lcT71 = iTakoContextAbility.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
            AwS155S0400000_27 awS155S0400000_27 = new AwS155S0400000_27(c1863850ybP, (C1863850ybP) this.LL.Yy1(), (Message) c1860930yWh, (C1860930yWh) this, 1);
            if ((C0B1N.LIZ() & 8) == 8) {
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C313940CSi(awS155S0400000_27, null), 3);
            } else {
                awS155S0400000_27.invoke();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleVideoListDependAbility
    public final boolean Yr1(TakoVideoItem takoVideoItem, Integer num) {
        Integer numValueOf;
        TakoMixFeed takoMixFeedLJIIIZ = this.LL.Yy1().LJIIIZ();
        if (takoMixFeedLJIIIZ != null) {
            numValueOf = Integer.valueOf(takoMixFeedLJIIIZ.cardType);
        } else {
            numValueOf = null;
        }
        if (!C13LP.LJJJJ(numValueOf, C1697810uHb.LJIIJJI(3, 201, 203, 13)) || num == null) {
            return false;
        }
        String string = C0R2Z.LIZIZ(takoVideoItem).toString();
        if (string == null) {
            string = "";
        }
        if (string.length() <= 0) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleVideoListDependAbility
    public final void te2(TakoVideoItem takoVideoItem, SmartImageView smartImageView) {
        Map<String, String> mapLJ;
        if (takoVideoItem == null) {
            return;
        }
        String string = null;
        smartImageView.setImageDrawable(null);
        TakoMixFeed takoMixFeedLJIIIZ = this.LL.Yy1().LJIIIZ();
        if (takoMixFeedLJIIIZ != null) {
            string = Integer.valueOf(takoMixFeedLJIIIZ.cardType).toString();
        }
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) this.LLILZ.getValue();
        if (iTakoContextAbility == null || (mapLJ = iTakoContextAbility.getCommonParams()) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        C1860990yWn.LIZ(smartImageView, takoVideoItem, string, mapLJ, null, C298820BnU.LIZJ);
    }

    @Override // com.ss.android.ugc.aweme.nimblecard.tako.api.INimbleVideoListDependAbility
    public final void oz2(String str, List<Pair<String, Long>> list, View view, Aweme aweme, List<TakoVideoItem> list2) {
        C0R2W.LIZ(C0R2W.LIZ, view, str, list, aweme, C1558520qew.LJIIL(this.LL), list2, null, null, 960);
    }
}
