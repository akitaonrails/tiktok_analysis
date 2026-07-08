package com.ss.android.ugc.aweme.tako.botpage.components.flowmarkdown.assem;

import X.AbstractC21434218uS;
import X.C01GW;
import X.C07EI;
import X.C07IB;
import X.C07IH;
import X.C07QH;
import X.C07QJ;
import X.C0HCU;
import X.C0R2X;
import X.C118300cf;
import X.C123100dR;
import X.C1308910kAL;
import X.C13DV;
import X.C13LC;
import X.C13LP;
import X.C1556190qbB;
import X.C1558520qew;
import X.C1697820uHc;
import X.C1785140wYS;
import X.C1848410yCV;
import X.C1857120yQY;
import X.C1857750yRZ;
import X.C1859240yTy;
import X.C1859250yTz;
import X.C1859260yU0;
import X.C1859280yU2;
import X.C1859290yU3;
import X.C1859300yU4;
import X.C1859360yUA;
import X.C1859370yUB;
import X.C1859410yUF;
import X.C1859430yUH;
import X.C1859460yUK;
import X.C1859570yUV;
import X.C1859580yUW;
import X.C1859600yUY;
import X.C1859620yUa;
import X.C1859900yV2;
import X.C1861200yX8;
import X.C1863850ybP;
import X.C21382118m3;
import X.C21417018rg;
import X.C21419418s4;
import X.C2188811AlT;
import X.C2211941Bhg;
import X.C2213981Bky;
import X.C2273971DzX;
import X.C259800zU;
import X.C287270BNt;
import X.C418440Gaw;
import X.C437100HCa;
import X.C452501pT;
import X.C689230R1t;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1587906Jp;
import X.InterfaceC1785150wYT;
import X.InterfaceC1859200yTu;
import X.InterfaceC1859540yUS;
import X.InterfaceC1859630yUb;
import X.InterfaceC342000Daw;
import X.InterfaceC434180H0u;
import X.InterfaceC665370Q7z;
import X.InterfaceC712990Rxx;
import X.RunnableC1859420yUG;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import X.ViewOnAttachStateChangeListenerC2499909qv;
import X.ViewOnLongClickListenerC1864690ycl;
import X.ViewTreeObserverOnPreDrawListenerC337150DJp;
import Y.ACListenerS161S0100000_27;
import Y.ARunnableS17S1000000_27;
import Y.ARunnableS21S1300000_27;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import avg.f;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.botpage.components.flowmarkdown.TakoMixReusedContainer;
import com.ss.android.ugc.aweme.tako.botpage.components.flowmarkdown.handler.TakoDataCollectionTagHandler;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.MessageSender;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoAnyCard;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPlaceholderSource;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.ss.android.ugc.aweme.tako.ui.TakoChatUIAbility;
import com.zhiliaoapp.musically.R;
import defpackage.t2;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS111S1000000_27;
import kotlin.jvm.internal.AwS428S0200000_27;
import kotlin.jvm.internal.AwS462S0200000_27;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS63S1300000_27;
import kotlin.jvm.internal.AwS6S1500000_27;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import mf.a;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoNewMarkdownAssem extends ReusedUISlotAssem<TakoNewMarkdownAssem> implements InterfaceC712990Rxx<InterfaceC1859540yUS> {
    public String LLJL;
    public InterfaceC1859540yUS LLJLL;
    public View LLJLLIL;
    public C1859370yUB LLJLLL;
    public TuxTextView LLJZ;
    public FrameLayout LLJZIJLIL;
    public String LLL;
    public boolean LLLF;
    public final Map<String, Integer> LLJJLIIIJLLLLLLLZ = new LinkedHashMap();
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 849));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 777));

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fko;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final TakoCardAbility sp() {
        return (TakoCardAbility) this.LLJLIL.getValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        View contentView = getContentView();
        if ((contentView instanceof ViewGroup) && contentView != null) {
            contentView.setTag(R.id.o0p, null);
        }
        C1859370yUB c1859370yUB = this.LLJLLL;
        if (c1859370yUB != null) {
            c1859370yUB.LJJJJI();
        }
        if (C07IH.LIZ()) {
            String str = this.LLL;
            if (str != null) {
                C1859360yUA.LIZ.getClass();
                C1859360yUA.LIZJ(str);
                C1859360yUA.LIZLLL(str);
            }
            this.LLL = null;
        }
    }

    public static void op(Message message) {
        String string;
        if (!((Boolean) C287270BNt.LIZ.getValue()).booleanValue() || message == null) {
            return;
        }
        String str = message.replyUuid;
        t2.a aVar = t2.LIZ;
        int i = message.LIZIZ;
        aVar.getClass();
        String strLIZ = t2.a.LIZ(i);
        TakoMixFeed takoMixFeedLJIIIZ = message.LJIIIZ();
        if (takoMixFeedLJIIIZ != null) {
            string = Integer.valueOf(takoMixFeedLJIIIZ.cardType).toString();
        } else {
            string = null;
        }
        C1861200yX8.LIZ(str, strLIZ, string, 8);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJLLIL = view.findViewById(R.id.xa1);
        this.LLJZ = (TuxTextView) view.findViewById(R.id.w8k);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.erv);
        this.LLJZIJLIL = frameLayout;
        if (frameLayout != null) {
            frameLayout.setPaddingRelative(frameLayout.getPaddingStart(), frameLayout.getPaddingTop(), frameLayout.getPaddingEnd(), 0);
        }
        View view2 = this.LLJLLIL;
        if (view2 != null) {
            view2.setClickable(false);
            view2.setLongClickable(false);
        }
        C1859370yUB c1859370yUB = (C1859370yUB) view.findViewById(R.id.xa2);
        this.LLJLLL = c1859370yUB;
        if (c1859370yUB != null) {
            C1859900yV2.LIZIZ.LJFF(c1859370yUB.getContext(), c1859370yUB, 111, R.attr.a1h);
        }
        TakoCardAbility takoCardAbilitySp = sp();
        if (takoCardAbilitySp != null) {
            takoCardAbilitySp.hw(this.LLJLLL);
        }
        C1859370yUB c1859370yUB2 = this.LLJLLL;
        if (c1859370yUB2 != null) {
            ViewGroup.LayoutParams layoutParams = c1859370yUB2.getLayoutParams();
            layoutParams.width = -2;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1859370yUB2);
            c1859370yUB2.setLayoutParams(layoutParams);
        }
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: tp, reason: merged with bridge method [inline-methods] */
    public final void up(InterfaceC1859540yUS interfaceC1859540yUS) {
        Message messageYy1;
        boolean z;
        String str;
        String str2;
        boolean z2;
        String str3;
        boolean zLIZLLL;
        Integer numValueOf;
        Integer numValueOf2;
        Boolean boolValueOf;
        String strLJIIIIZZ;
        Integer numValueOf3;
        int iLIZIZ;
        int iLIZIZ2;
        boolean z3;
        final int i;
        Integer numValueOf4;
        C21419418s4 c21419418s4LIZ;
        String str4;
        C21419418s4 c21419418s4Remove;
        String str5;
        String str6;
        boolean z4;
        InterfaceC434180H0u interfaceC434180H0uNO;
        MessageSender messageSender;
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        String str7;
        InterfaceC342000Daw interfaceC342000DawRemove;
        String str8;
        String str9;
        String str10;
        C13LC<C1863850ybP> c13lcT712;
        C1863850ybP c1863850ybP2;
        int iLIZIZ3;
        Message messageYy12;
        TakoMixFeed takoMixFeedLJIIIZ;
        int i2;
        Boolean boolValueOf2;
        String str11;
        Message messageYy13;
        String str12;
        TakoPlaceholderSource takoPlaceholderSource;
        TakoAnyCard takoAnyCard;
        String str13;
        String str14;
        String str15;
        int i3;
        C1859370yUB c1859370yUB;
        String str16;
        String str17;
        int i4;
        this.LLJLL = interfaceC1859540yUS;
        this.LLLF = false;
        TuxTextView tuxTextView = this.LLJZ;
        if (tuxTextView != null) {
            if (C123100dR.LIZ(interfaceC1859540yUS.LIZIZ())) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            C786410Ut5.LJLLLLLL(i4, tuxTextView);
        }
        TuxTextView tuxTextView2 = this.LLJZ;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(interfaceC1859540yUS.LIZIZ());
        }
        if (interfaceC1859540yUS.LLIIJI()) {
            C1859370yUB c1859370yUB2 = this.LLJLLL;
            if (c1859370yUB2 != null) {
                c1859370yUB2.setText(interfaceC1859540yUS.getText());
            }
            int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            C1859370yUB c1859370yUB3 = this.LLJLLL;
            if (c1859370yUB3 != null) {
                C21382118m3.LJFF(c1859370yUB3, C814420VxA.LIZIZ(iLIZIZ4 * 1.5f));
                return;
            }
            return;
        }
        TakoCardAbility takoCardAbilitySp = sp();
        Long lValueOf = null;
        if (takoCardAbilitySp != null) {
            messageYy1 = takoCardAbilitySp.Yy1();
        } else {
            messageYy1 = null;
        }
        if (C07IH.LIZ()) {
            String str18 = this.LLL;
            if (str18 != null) {
                C1859360yUA.LIZ.getClass();
                C1859360yUA.LIZJ(str18);
            }
            this.LLL = null;
        }
        C1859370yUB c1859370yUB4 = this.LLJLLL;
        boolean z5 = true;
        if (c1859370yUB4 != null) {
            if (messageYy1 != null) {
                str16 = messageYy1.uuid;
            } else {
                str16 = null;
            }
            C1859410yUF c1859410yUF = c1859370yUB4.LLJJJJLIIL;
            Message message = c1859410yUF.LIZIZ;
            if (message != null && (str17 = message.uuid) != null && !Intrinsics.LJFF(str17, str16)) {
                if (c1859410yUF.LIZLLL) {
                    C1785140wYS.LJIIIIZZ(c1859410yUF.LJ, str17, true);
                } else {
                    C1785140wYS.LJIIIZ(str17, true);
                }
                RunnableC1859420yUG runnableC1859420yUG = c1859410yUF.LJIIJ;
                if (runnableC1859420yUG != null) {
                    c1859410yUF.LIZ.removeCallbacks(runnableC1859420yUG);
                }
                c1859410yUF.LJIIJ = null;
                c1859410yUF.LJIIIIZZ = false;
                c1859410yUF.LJIIJJI = null;
                c1859410yUF.LJIIL = null;
                c1859410yUF.LJIILIIL = null;
            }
        }
        if (messageYy1 != null && messageYy1.isMultiAnswer) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C07QJ.LIZ.getClass();
            if (C07QJ.LIZIZ() && !(interfaceC1859540yUS instanceof C1857120yQY)) {
                if (C1785140wYS.LIZJ(messageYy1.selectedAnswerIndex, messageYy1.uuid) && ((i3 = messageYy1.LIZIZ) == 5 || i3 == 4 || ((c1859370yUB = this.LLJLLL) != null && c1859370yUB.LJJJJLI(messageYy1.uuid)))) {
                    z2 = true;
                }
            }
            z2 = false;
        } else {
            C07QJ.LIZ.getClass();
            if (C07QJ.LIZIZ() && !(interfaceC1859540yUS instanceof C1857120yQY)) {
                if (messageYy1 != null) {
                    str = messageYy1.uuid;
                } else {
                    str = null;
                }
                if (C1785140wYS.LIZLLL(str)) {
                    if (messageYy1 == null || (messageYy1.LIZIZ != 5 && messageYy1.LIZIZ != 4)) {
                        C1859370yUB c1859370yUB5 = this.LLJLLL;
                        if (c1859370yUB5 != null) {
                            if (messageYy1 != null) {
                                str2 = messageYy1.uuid;
                            } else {
                                str2 = null;
                            }
                            if (c1859370yUB5.LJJJJLI(str2)) {
                            }
                        }
                    }
                    z2 = true;
                }
            }
            z2 = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onBind: isStreaming=");
        sbLIZ.append(z2);
        sbLIZ.append(" isMessageTyping:");
        if (messageYy1 != null && messageYy1.isMultiAnswer) {
            zLIZLLL = C1785140wYS.LIZJ(messageYy1.selectedAnswerIndex, messageYy1.uuid);
        } else {
            if (messageYy1 != null) {
                str3 = messageYy1.uuid;
            } else {
                str3 = null;
            }
            zLIZLLL = C1785140wYS.LIZLLL(str3);
        }
        sbLIZ.append(zLIZLLL);
        sbLIZ.append("msg?.clientStatus=");
        if (messageYy1 != null) {
            numValueOf = Integer.valueOf(messageYy1.LIZIZ);
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(" msg.effectiveAnswerStatus=");
        if (messageYy1 != null) {
            numValueOf2 = Integer.valueOf(messageYy1.LJFF());
        } else {
            numValueOf2 = null;
        }
        sbLIZ.append(numValueOf2);
        sbLIZ.append("isTyping=");
        C1859370yUB c1859370yUB6 = this.LLJLLL;
        if (c1859370yUB6 != null) {
            if (messageYy1 != null) {
                str15 = messageYy1.uuid;
            } else {
                str15 = null;
            }
            boolValueOf = Boolean.valueOf(c1859370yUB6.LJJJJLI(str15));
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        if (!z2 && messageYy1 != null && (str14 = messageYy1.uuid) != null && str14.length() != 0) {
            strLJIIIIZZ = C1859600yUY.LIZ.remove(str14);
        } else {
            strLJIIIIZZ = null;
        }
        if (C07EI.LIZ()) {
            if (messageYy1 != null) {
                str12 = messageYy1.uuid;
            } else {
                str12 = null;
            }
            if (!Intrinsics.LJFF(str12, this.LLJL)) {
                ((LinkedHashMap) this.LLJJLIIIJLLLLLLLZ).clear();
                if (messageYy1 != null) {
                    str13 = messageYy1.uuid;
                } else {
                    str13 = null;
                }
                this.LLJL = str13;
            }
            if (!this.LLJJLIIIJLLLLLLLZ.isEmpty()) {
                for (Map.Entry entry : ((LinkedHashMap) this.LLJJLIIIJLLLLLLLZ).entrySet()) {
                    Object key = entry.getKey();
                    int iIntValue = ((Number) entry.getValue()).intValue();
                    Map<String, TakoPlaceholderSource> mapLJIIZILJ = interfaceC1859540yUS.LJIIZILJ();
                    if (mapLJIIZILJ != null && (takoPlaceholderSource = mapLJIIZILJ.get(key)) != null && (takoAnyCard = takoPlaceholderSource.anyCard) != null) {
                        takoAnyCard.height = Integer.valueOf(iIntValue);
                    }
                }
            }
        }
        if (strLJIIIIZZ == null) {
            String text = interfaceC1859540yUS.getText();
            if (text == null) {
                text = "";
            }
            Map<String, TakoPlaceholderSource> mapLJIIZILJ2 = interfaceC1859540yUS.LJIIZILJ();
            InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
            int i5 = C1859250yTz.LIZ;
            TakoChatUIAbility takoChatUIAbility = (TakoChatUIAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL, TakoChatUIAbility.class, null);
            if (takoChatUIAbility != null) {
                boolValueOf2 = Boolean.valueOf(takoChatUIAbility.Gx1());
            } else {
                boolValueOf2 = null;
            }
            TakoCardAbility takoCardAbility = (TakoCardAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL, TakoCardAbility.class, null);
            if (takoCardAbility != null && (messageYy13 = takoCardAbility.Yy1()) != null) {
                str11 = messageYy13.uuid;
            } else {
                str11 = null;
            }
            strLJIIIIZZ = C1859250yTz.LJIIIIZZ(messageYy1, text, mapLJIIZILJ2, boolValueOf2, str11, z2, null, null);
        }
        String strLJIJJLI = interfaceC1859540yUS.LJIJJLI();
        if (strLJIJJLI == null) {
            strLJIJJLI = "";
        }
        String strLJJIFFI = u.LJJIFFI(strLJIIIIZZ, strLJIJJLI, "", false);
        C1859370yUB c1859370yUB7 = this.LLJLLL;
        if (c1859370yUB7 != null) {
            if (C123100dR.LIZ(strLJJIFFI)) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            C786410Ut5.LJLLLLLL(i2, c1859370yUB7);
        }
        TuxTextView tuxTextView3 = this.LLJZ;
        TakoCardAbility takoCardAbilitySp2 = sp();
        if (takoCardAbilitySp2 != null && (messageYy12 = takoCardAbilitySp2.Yy1()) != null && (takoMixFeedLJIIIZ = messageYy12.LJIIIZ()) != null) {
            numValueOf3 = Integer.valueOf(takoMixFeedLJIIIZ.cardType);
        } else {
            numValueOf3 = null;
        }
        if (C0R2X.LIZ(numValueOf3)) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        } else {
            iLIZIZ = 0;
        }
        C1857750yRZ.LJIILJJIL(iLIZIZ, tuxTextView3);
        if (C1859620yUa.LIZ()) {
            TuxTextView tuxTextView4 = this.LLJZ;
            if (tuxTextView4 != null) {
                tuxTextView4.setTuxFont(52);
            }
            TuxTextView tuxTextView5 = this.LLJZ;
            if (C123100dR.LIZ(strLJJIFFI)) {
                iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            } else {
                iLIZIZ3 = 0;
            }
            C1857750yRZ.LJIILL(iLIZIZ3, tuxTextView5);
        } else {
            TuxTextView tuxTextView6 = this.LLJZ;
            if (C123100dR.LIZ(strLJJIFFI)) {
                iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            } else {
                iLIZIZ2 = 0;
            }
            C1857750yRZ.LJIILL(iLIZIZ2, tuxTextView6);
        }
        C1859370yUB c1859370yUB8 = this.LLJLLL;
        if (c1859370yUB8 != null) {
            ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), ITakoContextAbility.class, null);
            if (iTakoContextAbility != null && (c13lcT712 = iTakoContextAbility.T71()) != null && (c1863850ybP2 = (C1863850ybP) c13lcT712.LIZIZ()) != null) {
                lValueOf = Long.valueOf(c1863850ybP2.LLJJ);
                numValueOf4 = Integer.valueOf(c1863850ybP2.LLJJI);
            } else {
                numValueOf4 = null;
            }
            if (z2) {
                z2 = true;
                C1859370yUB.LJJJJLL(c1859370yUB8, messageYy1, interfaceC1859540yUS.LJIIZILJ(), lValueOf, numValueOf4, strLJJIFFI, C1859250yTz.LIZ(c1859370yUB8, C1558520qew.LJIIL(this)), C1859250yTz.LIZJ(C1558520qew.LJIIL(this)), new C689230R1t(C1558520qew.LJIIL(this)), new C1859280yU2(C1558520qew.LJIIL(this)), new C1859260yU0(C1558520qew.LJIIL(this)), new C1859290yU3(C1558520qew.LJIIL(this)), new C1859300yU4(C1558520qew.LJIIL(this)), new AwS428S0200000_27(this, interfaceC1859540yUS, 31), new AwS462S0200000_27(this, messageYy1, 3), 28672);
                if (C07IH.LIZ() && messageYy1 != null && (str9 = messageYy1.uuid) != null && str9.length() != 0) {
                    C1859360yUA c1859360yUA = C1859360yUA.LIZ;
                    C1859410yUF typewriterManager = c1859370yUB8.getTypewriterManager();
                    c1859360yUA.getClass();
                    if (C07IH.LIZ()) {
                        if (!C1859360yUA.LJII) {
                            C1859360yUA.LJII = true;
                            ((ArrayList) C1785140wYS.LIZIZ).add(new InterfaceC1785150wYT() { // from class: X.0yUR
                                @Override // X.InterfaceC1785150wYT
                                public final void LIZ(String str19) {
                                    C786410Ut5.LJJZZIII(C1859360yUA.LIZIZ, new ARunnableS17S1000000_27(str19, 0));
                                }
                            });
                        }
                        if (C1859360yUA.LJFF && (str10 = C1859360yUA.LJ) != null && !Intrinsics.LJFF(str10, str9) && C1859360yUA.LIZJ.get(C1859360yUA.LJ) == typewriterManager) {
                            C1785140wYS.LJ(C1859360yUA.LJ, false);
                            C1859360yUA.LIZIZ.removeCallbacks(C1859360yUA.LJI);
                            typewriterManager.LJI();
                            C1859360yUA.LJFF = false;
                            C1859360yUA.LJ = null;
                        }
                        C1859360yUA.LIZJ.put(str9, typewriterManager);
                        if (C1859360yUA.LJFF && Intrinsics.LJFF(str9, C1859360yUA.LJ)) {
                            typewriterManager.LIZLLL();
                        }
                        C1859360yUA.LIZIZ();
                    }
                    AwS111S1000000_27 awS111S1000000_27 = new AwS111S1000000_27(str9, 2);
                    if (C07IH.LIZ()) {
                        C1859360yUA.LIZLLL.put(str9, new C1556190qbB(str9, awS111S1000000_27));
                    }
                    z3 = true;
                    this.LLL = str9;
                } else {
                    z3 = true;
                }
            } else {
                z2 = false;
                z3 = true;
                if (messageYy1 != null && (str7 = messageYy1.uuid) != null && (interfaceC342000DawRemove = C1859580yUW.LIZ.remove(str7)) != null) {
                    if (messageYy1 != null) {
                        str8 = messageYy1.uuid;
                    } else {
                        str8 = null;
                    }
                    Map<String, TakoPlaceholderSource> mapLJIIZILJ3 = interfaceC1859540yUS.LJIIZILJ();
                    C1859430yUH.LIZ(c1859370yUB8, interfaceC342000DawRemove, C1859250yTz.LIZJ(C1558520qew.LJIIL(this)), new C689230R1t(C1558520qew.LJIIL(this)), new C1859280yU2(C1558520qew.LJIIL(this)), new C1859260yU0(C1558520qew.LJIIL(this)), new C1859290yU3(C1558520qew.LJIIL(this)), new C1859300yU4(C1558520qew.LJIIL(this)));
                    if (((Boolean) C2273971DzX.LJIIJJI.getValue()).booleanValue()) {
                        this.LLLF = true;
                        HandlerHook.viewPost(c1859370yUB8, new ARunnableS21S1300000_27(c1859370yUB8, str8, this, mapLJIIZILJ3, 1));
                    }
                } else {
                    if (messageYy1 != null && (str4 = messageYy1.uuid) != null && (c21419418s4Remove = C1859570yUV.LIZ.remove(str4)) != null) {
                        List<AbstractC21434218uS> list = c21419418s4Remove.LIZJ;
                        InterfaceC665370Q7z interfaceC665370Q7zLJIIL2 = C1558520qew.LJIIL(this);
                        int i6 = C1859250yTz.LIZ;
                        Message messageYy14 = null;
                        TakoCardAbility takoCardAbility2 = (TakoCardAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL2, TakoCardAbility.class, null);
                        TakoChatUIAbility takoChatUIAbility2 = (TakoChatUIAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL2, TakoChatUIAbility.class, null);
                        ITakoContextAbility iTakoContextAbility2 = (ITakoContextAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL2, ITakoContextAbility.class, null);
                        if (takoCardAbility2 != null) {
                            messageYy14 = takoCardAbility2.Yy1();
                        }
                        if (takoChatUIAbility2 == null || !takoChatUIAbility2.Gx1()) {
                            z5 = false;
                        }
                        C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
                        Context context = c1859370yUB8.getContext();
                        if (iTakoContextAbility2 != null && (c13lcT71 = iTakoContextAbility2.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
                            str5 = c1863850ybP.LLILZIL;
                        } else {
                            str5 = null;
                        }
                        if (messageYy14 != null) {
                            str6 = messageYy14.uuid;
                        } else {
                            str6 = null;
                        }
                        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a0g, c1859370yUB8.getContext());
                        if (z5 || (messageYy14 != null && (messageSender = messageYy14.sender) != null && messageSender.isSelf)) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        c13dvLIZIZ.add(new C437100HCa(context, str5, str6, c1859370yUB8, numLIZJ, 0, z4));
                        c13dvLIZIZ.add(new C0HCU(c1859370yUB8));
                        c13dvLIZIZ.add(new C21417018rg(c1859370yUB8.getContext(), new AwS571S0100000_27(takoCardAbility2, 1102), new AwS571S0100000_27(takoCardAbility2, 1103), messageYy14));
                        C07QH.LIZ.getClass();
                        if (C07QH.LIZ()) {
                            if (takoCardAbility2 != null) {
                                interfaceC434180H0uNO = takoCardAbility2.nO();
                            } else {
                                interfaceC434180H0uNO = null;
                            }
                            c13dvLIZIZ.add(new TakoDataCollectionTagHandler(c1859370yUB8, interfaceC434180H0uNO));
                        }
                        c21419418s4LIZ = C21419418s4.LIZ(c21419418s4Remove, C13LP.LJLIL(C1697820uHc.LIZ(c13dvLIZIZ), list), 0, false, 0.0f, 0, 0, 0, null, null, null, null, null, null, false, null, 0, false, false, 0, false, null, null, false, null, null, null, false, false, false, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -5, 16777215);
                    } else {
                        c21419418s4LIZ = C1859250yTz.LIZ(c1859370yUB8, C1558520qew.LJIIL(this));
                    }
                    C1859900yV2.LIZIZ.LJIIIIZZ(c1859370yUB8, strLJJIFFI, c21419418s4LIZ, C1859250yTz.LIZJ(C1558520qew.LJIIL(this)), new C689230R1t(C1558520qew.LJIIL(this)), new C1859280yU2(C1558520qew.LJIIL(this)), new C1859260yU0(C1558520qew.LJIIL(this)), new C1859290yU3(C1558520qew.LJIIL(this)), new C1859300yU4(C1558520qew.LJIIL(this)));
                }
            }
            c1859370yUB8.setOnLongClickListener(new ViewOnLongClickListenerC1864690ycl(this, 6));
            View.OnClickListener aCListenerS161S0100000_27 = new ACListenerS161S0100000_27(this, 77);
            if (C1848410yCV.LIZ) {
                aCListenerS161S0100000_27 = new f(aCListenerS161S0100000_27);
            }
            a aVar = new a(aCListenerS161S0100000_27);
            if (C2213981Bky.LIZIZ.isOffline()) {
                C2211941Bhg.LIZ.injectViewListener(c1859370yUB8);
            }
            c1859370yUB8.setOnClickListener(aVar);
        } else {
            z3 = true;
        }
        if (!z2) {
            if (!(interfaceC1859540yUS instanceof C1857120yQY) && messageYy1 != null && messageYy1.isMultiAnswer) {
                String str19 = messageYy1.uuid;
                int i7 = messageYy1.selectedAnswerIndex;
                if (C1785140wYS.LIZJ(i7, str19)) {
                    C1785140wYS.LJIIIIZZ(i7, str19, z3);
                    IMessageAbility iMessageAbility = (IMessageAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IMessageAbility.class, null);
                    if (iMessageAbility != null) {
                        iMessageAbility.nX0(i7, str19);
                    }
                }
            }
            if (!(interfaceC1859540yUS instanceof C1857120yQY) && messageYy1 != null && messageYy1.LIZIZ == 6) {
                op(messageYy1);
            }
        }
        up(interfaceC1859540yUS.LJIIZILJ());
        if (!z2 && messageYy1 != null && !(this.LLJLL instanceof C1857120yQY)) {
            final String str20 = messageYy1.uuid;
            if (messageYy1.isMultiAnswer) {
                i = messageYy1.selectedAnswerIndex;
            } else {
                i = 0;
            }
            final C1859370yUB c1859370yUB9 = this.LLJLLL;
            if (c1859370yUB9 != null) {
                ViewTreeObserverOnPreDrawListenerC337150DJp.LIZ(c1859370yUB9, new Runnable() { // from class: X.0yUJ
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        IMessageAbility iMessageAbility2;
                        Message messageYy15;
                        C1C7U.LIZ("TakoNewMarkdownAssem@242a.notifyMarkdownRenderFinished$$inlined$doOnPreDraw$1");
                        try {
                            TakoCardAbility takoCardAbilitySp3 = this.sp();
                            if (Intrinsics.LJFF((takoCardAbilitySp3 == null || (messageYy15 = takoCardAbilitySp3.Yy1()) == null) ? null : messageYy15.uuid, str20) && (iMessageAbility2 = (IMessageAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this), IMessageAbility.class, null)) != null) {
                                iMessageAbility2.zN(i, str20);
                            }
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("TakoNewMarkdownAssem@242a.notifyMarkdownRenderFinished$$inlined$doOnPreDraw$1");
                    }
                });
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [T, X.0yUQ, java.lang.Object] */
    public final void up(Map<String, TakoPlaceholderSource> map) {
        SpannableStringBuilder spannableStringBuilder;
        InterfaceC1859200yTu interfaceC1859200yTuLIZ;
        final View viewLJJZZI;
        String str;
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
        Function0<? extends ReusedUIAssem<?>> function0;
        TakoCardAbility takoCardAbilitySp;
        Message messageYy1;
        TakoCardAbility takoCardAbilitySp2;
        Message messageYy12;
        InterfaceC342000Daw markdownContent;
        if (map == null) {
            return;
        }
        C1859370yUB c1859370yUB = this.LLJLLL;
        if (c1859370yUB == null || (markdownContent = c1859370yUB.getMarkdownContent()) == null || (spannableStringBuilder = markdownContent.LIZLLL()) == null) {
            spannableStringBuilder = new SpannableStringBuilder();
        }
        for (InterfaceC1859630yUb interfaceC1859630yUb : (InterfaceC1859630yUb[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), InterfaceC1859630yUb.class)) {
            String strLJII = C1859250yTz.LJII(interfaceC1859630yUb.LIZ(), FollowStatusChangeMethod.PARAM_UID);
            if (strLJII == null) {
                strLJII = "";
            }
            TakoPlaceholderSource takoPlaceholderSource = map.get(strLJII);
            if (takoPlaceholderSource != null || Intrinsics.LJFF(interfaceC1859630yUb.getDataType(), "create_button")) {
                FrameLayout frameLayout = this.LLJZIJLIL;
                if (frameLayout != null && (interfaceC1859200yTuLIZ = C1859460yUK.LIZ(frameLayout, spannableStringBuilder, interfaceC1859630yUb)) != null && (viewLJJZZI = interfaceC1859200yTuLIZ.LJJZZI()) != 0) {
                    if (this.LLLF && (takoCardAbilitySp2 = sp()) != null && (messageYy12 = takoCardAbilitySp2.Yy1()) != null) {
                        str = messageYy12.uuid;
                        if (str == null || !Intrinsics.LJFF(viewLJJZZI.getTag(R.id.xa6), str)) {
                        }
                    } else {
                        str = null;
                    }
                    if (!C07IB.LIZ() && (takoCardAbilitySp = sp()) != null && (messageYy1 = takoCardAbilitySp.Yy1()) != null && messageYy1.isMultiAnswer && (viewLJJZZI instanceof ViewGroup)) {
                        ViewGroup viewGroup = (ViewGroup) viewLJJZZI;
                        if (viewGroup.getChildCount() != 0) {
                            C786410Ut5.LJJJJI(viewGroup);
                        }
                    }
                    if (Intrinsics.LJFF(interfaceC1859630yUb.getDataType(), "lynx") || Intrinsics.LJFF(interfaceC1859630yUb.getDataType(), "nimble")) {
                        final AwS63S1300000_27 awS63S1300000_27 = new AwS63S1300000_27(takoPlaceholderSource, (TakoPlaceholderSource) this, (TakoNewMarkdownAssem) strLJII, (String) map, (Map<String, TakoPlaceholderSource>) 3);
                        ViewGroup.LayoutParams layoutParams = viewLJJZZI.getLayoutParams();
                        if (layoutParams != null) {
                            layoutParams.height = -2;
                            C786410Ut5.W5(viewLJJZZI, layoutParams);
                            final boolean zLIZ = C07EI.LIZ();
                            if (zLIZ) {
                                Object tag = viewLJJZZI.getTag(R.id.xa5);
                                if ((tag instanceof ViewTreeObserver.OnGlobalLayoutListener) && (onGlobalLayoutListener = (ViewTreeObserver.OnGlobalLayoutListener) tag) != null) {
                                    try {
                                        if (viewLJJZZI.getViewTreeObserver().isAlive()) {
                                            C786410Ut5.C3(viewLJJZZI.getViewTreeObserver(), onGlobalLayoutListener);
                                        }
                                    } catch (Exception e) {
                                        TryCatchGuardChecker.doCheck(e);
                                    }
                                }
                            }
                            final C118300cf c118300cf = new C118300cf();
                            c118300cf.element = -1;
                            C259800zU c259800zU = new C259800zU();
                            ?? r6 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: X.0yUQ
                                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                                public final void onGlobalLayout() {
                                    int iLIZJ = (int) C445120Hcs.LIZJ(Integer.valueOf(viewLJJZZI.getHeight()));
                                    if (zLIZ && iLIZJ == c118300cf.element) {
                                        return;
                                    }
                                    c118300cf.element = iLIZJ;
                                    awS63S1300000_27.invoke(Integer.valueOf(iLIZJ));
                                }
                            };
                            c259800zU.element = r6;
                            if (zLIZ) {
                                viewLJJZZI.setTag(R.id.xa5, r6);
                            }
                            viewLJJZZI.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC2499909qv(viewLJJZZI, c259800zU, 2));
                            if (viewLJJZZI.isAttachedToWindow() && viewLJJZZI.getViewTreeObserver().isAlive()) {
                                C786410Ut5.x3(viewLJJZZI.getViewTreeObserver(), (ViewTreeObserver.OnGlobalLayoutListener) c259800zU.element);
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        }
                    }
                    AwS6S1500000_27 awS6S1500000_27 = new AwS6S1500000_27(viewLJJZZI, takoPlaceholderSource, strLJII, this, spannableStringBuilder, interfaceC1859630yUb, 0);
                    C1859240yTy c1859240yTy = new C1859240yTy();
                    awS6S1500000_27.invoke(c1859240yTy);
                    View view = c1859240yTy.LIZ;
                    if (view != null && (function0 = c1859240yTy.LIZIZ) != null && c1859240yTy.LIZJ != null) {
                        TakoMixReusedContainer takoMixReusedContainer = new TakoMixReusedContainer(C724240Sb0.LIZ(this), this, view, getVAssemScope(), function0);
                        View view2 = c1859240yTy.LIZ;
                        if (view2 != null) {
                            takoMixReusedContainer.Sl0(view2, takoMixReusedContainer);
                        }
                        InterfaceC1587906Jp interfaceC1587906Jp = c1859240yTy.LIZJ;
                        if (interfaceC1587906Jp != null) {
                            takoMixReusedContainer.LLJJJJLIIL(0, interfaceC1587906Jp, null);
                        }
                    }
                    if (str != null) {
                        viewLJJZZI.setTag(R.id.xa6, str);
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC1859540yUS interfaceC1859540yUS) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC1859540yUS interfaceC1859540yUS) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
