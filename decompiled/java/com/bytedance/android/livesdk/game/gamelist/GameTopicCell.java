package com.bytedance.android.livesdk.game.gamelist;

import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C0230005s;
import X.C03IJ;
import X.C03K6;
import X.C0IJT;
import X.C0PEM;
import X.C1119920fFW;
import X.C12ES;
import X.C13LE;
import X.C13LP;
import X.C16F5;
import X.C19719912Dl;
import X.C1AZW;
import X.C1DFH;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23250099c;
import X.C426750GoL;
import X.C434240H1a;
import X.C439101nJ;
import X.C452080Ho6;
import X.C452501pT;
import X.C474500IjA;
import X.C497740JfY;
import X.C500260Jjc;
import X.C737910Sx3;
import X.C751980Tee;
import X.C786410Ut5;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC497601wk;
import Y.ACListenerS116S0200000_12;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import com.bytedance.android.livesdk.game.model.PartnershipGameEvent;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.AwS428S0200000_27;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes28.dex */
public final class GameTopicCell extends PowerCell<C0230005s> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public final AssemVMLazy LL;
    public boolean LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(GameTopicCell.class, "vm", "getVm()Lcom/bytedance/android/livesdk/game/gamelist/GameTopicListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public GameTopicCell() {
        AssemVMLazy assemVMLazy;
        Object obj = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(GameTopicListViewModel.class);
        AwS571S0100000_27 awS571S0100000_27 = new AwS571S0100000_27(c19719912DlLIZ, 186);
        AFwS269S0000000_27 aFwS269S0000000_27 = AFwS269S0000000_27.get$arr$(28);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS571S0100000_27(c19719912DlLIZ, 166), awS571S0100000_27, AFwS216S0000000_27.get$arr$(76), new AwS571S0100000_27((C03K6) this, 169), new AwS571S0100000_27((C03K6) this, 171), new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 173), aFwS269S0000000_27, new AwS571S0100000_27((C03K6) this, 175), null, new AwS571S0100000_27((C03K6) this, 176));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS571S0100000_27 awS571S0100000_272 = new AwS571S0100000_27((C03K6) this, 170);
            AwS571S0100000_27 awS571S0100000_273 = new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 172);
            AwS571S0100000_27 awS571S0100000_274 = new AwS571S0100000_27(c19719912DlLIZ, 174);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS428S0200000_27((InterfaceC451590HnJ) obj, awS571S0100000_272, 5));
            AwS571S0100000_27 awS571S0100000_275 = new AwS571S0100000_27(c01gwLIZIZ, 177);
            AwS571S0100000_27 awS571S0100000_276 = new AwS571S0100000_27(c01gwLIZIZ, 179);
            AwS571S0100000_27 awS571S0100000_277 = new AwS571S0100000_27(c01gwLIZIZ, 181);
            AwS571S0100000_27 awS571S0100000_278 = new AwS571S0100000_27(c01gwLIZIZ, 183);
            AwS571S0100000_27 awS571S0100000_279 = new AwS571S0100000_27(c01gwLIZIZ, 184);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS571S0100000_274, awS571S0100000_27, new C452080Ho6(), awS571S0100000_275, awS571S0100000_276, awS571S0100000_273, aFwS269S0000000_27, awS571S0100000_277, awS571S0100000_278, awS571S0100000_279);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS571S0100000_27(c19719912DlLIZ, 185), awS571S0100000_27, AFwS216S0000000_27.get$arr$(77), new AwS571S0100000_27((C03K6) this, 187), new AwS571S0100000_27((C03K6) this, 188), new AwS571S0100000_27((HasDefaultViewModelProviderFactory) this, 189), aFwS269S0000000_27, new AwS571S0100000_27((C03K6) this, 190), null, new AwS571S0100000_27((C03K6) this, 191));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS571S0100000_27(c19719912DlLIZ, 192), awS571S0100000_27, AFwS216S0000000_27.get$arr$(78), new AwS571S0100000_27((C03K6) this, 193), new AwS571S0100000_27((C03K6) this, 194), new AwS571S0100000_27((C03K6) this, 195), aFwS269S0000000_27, null, null, new AwS571S0100000_27((C03K6) this, 165));
        }
        this.LL = assemVMLazy;
        this.LLILLL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 167));
        this.LLILZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 180));
        this.LLILZIL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 168));
        this.LLILZLL = C452501pT.LIZIZ(new AwS571S0100000_27(this, 178));
        this.LLIZ = C452501pT.LIZIZ(new AwS571S0100000_27(this, 182));
        this.LLIZLLLIL = C452501pT.LIZIZ(AFwS216S0000000_27.get$arr$(75));
    }

    public final LinearLayout I5() {
        return (LinearLayout) this.LLILZIL.getValue();
    }

    public final C16F5 L5() {
        return (C16F5) this.LLILZ.getValue();
    }

    public final GameTopicListViewModel N5() {
        AssemVMLazy assemVMLazy = this.LL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJ;
        return (GameTopicListViewModel) assemVMLazy.getValue();
    }

    public final void R5(boolean z) {
        if (z) {
            C786410Ut5.LJZL(0, I5());
            ((TextView) this.LLILZLL.getValue()).setText(C497740JfY.LJIJI(2131840717));
        } else {
            C786410Ut5.LJZL(8, I5());
            ((TextView) this.LLILZLL.getValue()).setText(C497740JfY.LJIJI(2131841823));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        PartnershipGameEvent partnershipGameEvent;
        int i;
        PartnershipGameEvent next;
        GameTag gameTag = ((C0230005s) interfaceC1891350zJl).LL;
        HashSet<Long> hashSet = N5().LLIZLLLIL;
        String str = N5().LLILZLL;
        boolean z = N5().LLJILJILJ;
        List<GameTag> list = N5().LLJ;
        LiveMode liveMode = N5().LLILLL;
        List<PartnershipGameEvent> list2 = N5().LLILZIL;
        if (list2 != null) {
            Iterator<PartnershipGameEvent> it2 = list2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    long j = next.gameTagId;
                    Long l = gameTag.id;
                    if (l != null && j == l.longValue()) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            partnershipGameEvent = next;
        } else {
            partnershipGameEvent = null;
        }
        String str2 = gameTag.showName;
        if (str2 == null) {
            str2 = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str2);
        if (C500260Jjc.LJJIIZ(str) && str2.length() > 0) {
            int iLJJIJLIJ = a0.LJJIJLIJ(0, str2, str, true);
            if (iLJJIJLIJ > 0) {
                C1119920fFW.LJIIIIZZ(spannableStringBuilder, 0, iLJJIJLIJ, 34, 500);
            } else if (iLJJIJLIJ == 0) {
                C1119920fFW.LJIIIIZZ(spannableStringBuilder, str.length(), str2.length(), 34, 500);
            }
        }
        L5().setText(spannableStringBuilder);
        boolean selected = gameTag.getSelected();
        L5().setSelected(selected);
        C16F5 c16f5L5 = L5();
        if (selected) {
            i = R.style.a91;
        } else {
            i = R.style.a8z;
        }
        c16f5L5.LJJJI(i);
        if (!C13LP.LJJJJ(gameTag.id, hashSet)) {
            Long l2 = gameTag.id;
            if (l2 != null) {
                hashSet.add(Long.valueOf(l2.longValue()));
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_game_label_show");
            c474500IjALIZ.LJJII(this.LLIZLLLIL.getValue(), "anchor_id");
            C1AZW.LIZ.getClass();
            c474500IjALIZ.LJJII(C1AZW.LJ, "room_id");
            c474500IjALIZ.LJJII(liveMode.logStreamingType, "live_type");
            c474500IjALIZ.LJJII(gameTag.showName, "game_label");
            c474500IjALIZ.LJJII(gameTag.id, "game_label_id");
            c474500IjALIZ.LJJII(Integer.valueOf(gameTag.isNewGame ? 1 : 0), "is_new_game");
            c474500IjALIZ.LIZ();
        }
        if (partnershipGameEvent != null) {
            P5(true, partnershipGameEvent);
        } else {
            P5(false, null);
            if (C500260Jjc.LJJJI(Boolean.valueOf(gameTag.isNewGame))) {
                R5(true);
            } else {
                R5(false);
            }
        }
        InterfaceC497601wk assemVMScope = N5().getAssemVMScope();
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(assemVMScope, C2107308Nj.LIZ, null, new C434240H1a(this, null), 2);
        if (getBindingAdapterPosition() == 0 && !TextUtils.isEmpty(str) && (!z)) {
            if (C751980Tee.LIZIZ(list)) {
                ((TextView) this.LLIZ.getValue()).setText(C497740JfY.LJIJI(2131842807));
            } else {
                ((TextView) this.LLIZ.getValue()).setText(C497740JfY.LJIJI(2131842808));
            }
            C12ES.LJIILL(0, (View) this.LLIZ.getValue());
        } else {
            C439101nJ.LJI((View) this.LLIZ.getValue());
        }
        C786410Ut5.I7(new ACListenerS116S0200000_12(this, gameTag, 95), this.itemView);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gi0, viewGroup, false);
        if (C426750GoL.LJFF()) {
            viewTd.setLayoutDirection(1);
        }
        return viewTd;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P5(boolean r7, com.bytedance.android.livesdk.game.model.PartnershipGameEvent r8) {
        /*
            r6 = this;
            if (r7 == 0) goto L7b
            android.widget.LinearLayout r0 = r6.I5()
            int r0 = r0.getVisibility()
            r2 = 1
            r1 = 0
            if (r0 == 0) goto L84
            android.widget.LinearLayout r0 = r6.I5()
            X.C786410Ut5.LJZL(r1, r0)
            boolean r0 = r6.LLILLJJLI
            if (r0 != 0) goto L84
            r6.LLILLJJLI = r2
            if (r8 == 0) goto L40
            java.lang.String r0 = r8.gameIdStr     // Catch: java.lang.Exception -> L26
            if (r0 == 0) goto L40
            long r4 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r0)     // Catch: java.lang.Exception -> L26
            goto L42
        L26:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "gameId is not number in reportGameTagShowEvent, e:"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C20441214yg.LIZLLL(r0)
            r4 = -1
            goto L42
        L40:
            r4 = 0
        L42:
            java.lang.String r0 = "livesdk_gamepad_page_show"
            X.0IjA r3 = X.C0IJT.LIZ(r0)
            r3.LJIL()
            java.lang.String r1 = "page_from"
            java.lang.String r0 = "live_start"
            r3.LJJII(r0, r1)
            java.lang.String r1 = "page_name"
            java.lang.String r0 = "topic_show"
            r3.LJJII(r0, r1)
            r2 = 0
            if (r8 == 0) goto L79
            java.lang.String r1 = r8.gameName
        L5e:
            java.lang.String r0 = "game_name"
            r3.LJJII(r1, r0)
            java.lang.String r1 = "game_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r3.LJJII(r0, r1)
            if (r8 == 0) goto L70
            java.lang.String r2 = r8.taskIdStr
        L70:
            java.lang.String r0 = "game_task_id"
            r3.LJJII(r2, r0)
            r3.LIZ()
            return
        L79:
            r1 = r2
            goto L5e
        L7b:
            android.widget.LinearLayout r1 = r6.I5()
            r0 = 8
            X.C786410Ut5.LJZL(r0, r1)
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.game.gamelist.GameTopicCell.P5(boolean, com.bytedance.android.livesdk.game.model.PartnershipGameEvent):void");
    }
}
