package com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor;

import X.AbstractC1347290lAF;
import X.C019F;
import X.C01GW;
import X.C09R3;
import X.C0I04;
import X.C1344030l4z;
import X.C1344460l5g;
import X.C1345700l7g;
import X.C1346550l93;
import X.C1347110l9x;
import X.C1347120l9y;
import X.C1351950lHl;
import X.C13LE;
import X.C14EU;
import X.C15O7;
import X.C1637806bA;
import X.C1637906bB;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C295780Bia;
import X.C295880Bik;
import X.C452230HoL;
import X.C452250HoN;
import X.C452501pT;
import X.C454010HrD;
import X.C454040HrG;
import X.C454060HrI;
import X.C622680Oba;
import X.C724750Sbp;
import X.C726120Se2;
import X.C736680Sv4;
import X.C736820SvI;
import X.C7851034v;
import X.InterfaceC2217461Bqa;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.emoji.common.emojipagev2.EmojiPanelShowingStateVM;
import com.zhiliaoapp.musically.R;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS23S0600000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS670S0100000_21;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentKeyboardMultiPanelAssem extends UISlotAssem implements C0I04 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJL;
    public final AssemVMLazy LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public AbstractC1347290lAF LLJJIJIIJIL;
    public final C726120Se2 LLJJIJIL;
    public int LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CommentKeyboardMultiPanelAssem.class, "emojiPanelShowingStateVM", "getEmojiPanelShowingStateVM()Lcom/ss/android/ugc/aweme/emoji/common/emojipagev2/EmojiPanelShowingStateVM;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(CommentKeyboardMultiPanelAssem.class, "commentContextSource", "getCommentContextSource()Lcom/ss/android/ugc/aweme/comment/model/CommentContextSource;", 0);
        c09r3.getClass();
        LLJL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public CommentKeyboardMultiPanelAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(EmojiPanelShowingStateVM.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS563S0100000_19(c19719912DlLIZ, 564), AFwS259S0000000_21.get$arr$(69), null, true);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(KeyboardVMV2.class);
        this.LLJJIII = C452501pT.LIZIZ(new AwS23S0600000_19(this, c19719912DlLIZ2, c1637906bB, new C452230HoL(c19719912DlLIZ2), new C452250HoN(), (Function0) null, 26));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS565S0100000_21(this, 131));
        this.LLJJIJIIJIL = C1347120l9y.LIZ;
        this.LLJJIJIL = new C726120Se2();
        this.LLJJJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 561));
        this.LLJJJJ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 562));
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 563));
        this.LLJJJJLIIL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(119));
        this.LLJJL = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(120));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(121));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.a3j;
    }

    public final CommentContextSource ip() {
        C726120Se2 c726120Se2 = this.LLJJIJIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJL;
        return c726120Se2.LIZ(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        super.onCreate();
        C622680Oba.LIZJ(this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        C622680Oba.LIZLLL(this);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentViewCreated() {
        super.onParentViewCreated();
    }

    @Override // X.C0I04
    public final void Cj(C454040HrG c454040HrG) {
        IKeyboardInputPanelAssemAbility iKeyboardInputPanelAssemAbilityLIZJ = C1346550l93.LIZJ(this);
        if (iKeyboardInputPanelAssemAbilityLIZJ != null) {
            iKeyboardInputPanelAssemAbilityLIZJ.Cj(c454040HrG);
        }
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final Context Eo(Context context) {
        C01GW c01gw = C295880Bik.LIZ;
        if (C295880Bik.LIZLLL) {
            C01GW c01gw2 = C295780Bia.LIZ;
            if (C295780Bia.LIZIZ) {
                return LJJIJL().getContext();
            }
        }
        super.Eo(context);
        return context;
    }

    @Override // X.C0I04
    public final void Hp(String str) {
        IKeyboardInputPanelAssemAbility iKeyboardInputPanelAssemAbilityLIZJ = C1346550l93.LIZJ(this);
        if (iKeyboardInputPanelAssemAbilityLIZJ != null) {
            iKeyboardInputPanelAssemAbilityLIZJ.Hp(str);
        }
    }

    @Override // X.C0I04
    public final void g7(C454060HrI c454060HrI) {
        IKeyboardInputPanelAssemAbility iKeyboardInputPanelAssemAbilityLIZJ = C1346550l93.LIZJ(this);
        if (iKeyboardInputPanelAssemAbilityLIZJ != null) {
            iKeyboardInputPanelAssemAbilityLIZJ.g7(c454060HrI);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x028f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void kp(X.AbstractC1347290lAF r18) {
        /*
            Method dump skipped, instruction units count: 899
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.CommentKeyboardMultiPanelAssem.kp(X.0lAF):void");
    }

    @Override // X.C0I04
    public final void lc(C454010HrD c454010HrD) {
        IKeyboardInputPanelAssemAbility iKeyboardInputPanelAssemAbilityLIZJ = C1346550l93.LIZJ(this);
        if (iKeyboardInputPanelAssemAbilityLIZJ != null) {
            iKeyboardInputPanelAssemAbilityLIZJ.lc(c454010HrD);
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onGiftContentHeightEvent(C7851034v c7851034v) {
        this.LLJJJ = c7851034v.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onGiftContentHeightEvent ");
        sbLIZ.append(this.LLJJJ);
        C1344030l4z.LIZJ("KeyboardMultiPanelAssem", C2188811AlT.LIZIZ(sbLIZ));
        kp(((KeyboardVMV2) this.LLJJIII.getValue()).wQ2());
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C1351950lHl.LJIJI(0, LJJIJL());
        C736680Sv4.LJIIIZ(this, (AssemViewModel) this.LLJJIII.getValue(), new C2217381BqS() { // from class: X.0l9k
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1346950l9h) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.0l9j
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C1346950l9h) obj).LLILLL);
            }
        }, C736820SvI.LIZLLL(), new AwS670S0100000_21(this, 3), 8);
    }

    @Override // X.C0I04
    public final void yd(KeyEvent keyEvent) {
        IKeyboardInputPanelAssemAbility iKeyboardInputPanelAssemAbilityLIZJ = C1346550l93.LIZJ(this);
        if (iKeyboardInputPanelAssemAbilityLIZJ != null) {
            iKeyboardInputPanelAssemAbilityLIZJ.yd(keyEvent);
        }
    }

    public final void hp(int i, int i2, AbstractC1347290lAF abstractC1347290lAF) {
        IKeyboardInputPanelAssemAbility iKeyboardInputPanelAssemAbilityLIZJ;
        if (i == i2 || i2 <= 0) {
            return;
        }
        if (i == 0) {
            Intrinsics.LJFF(abstractC1347290lAF, C1347110l9x.LIZ);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("changeMultiPanelHeight setHeight  ");
        sbLIZ.append(i);
        sbLIZ.append("  ");
        sbLIZ.append(i2);
        C2188811AlT.LIZIZ(sbLIZ);
        C1351950lHl.LJIJI(i2, LJJIJL());
        C1344460l5g.LIZ.getClass();
        C1344460l5g.LIZJ.LIZJ = System.currentTimeMillis();
        C15O7.LIZJ(new Callable() { // from class: X.0l8z
            @Override // java.util.concurrent.Callable
            public final Object call() throws JSONException {
                C1C7U.LIZ("CommentKeyboardPerfUtil@92ca.onOpenPanelEnd$1");
                C1344460l5g.LIZ.getClass();
                C1346520l90 c1346520l90 = C1344460l5g.LIZJ;
                long j = c1346520l90.LIZJ;
                if (j >= 0) {
                    long j2 = c1346520l90.LIZIZ;
                    if (j2 > 0 && j - j2 > 0) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("duration", c1346520l90.LIZJ - c1346520l90.LIZIZ);
                        long j3 = c1346520l90.LIZLLL;
                        if (j3 > 0) {
                            jSONObject.put("duration_with_a", j3 - c1346520l90.LIZIZ);
                        }
                        jSONObject.put("enter_from", c1346520l90.LJFF);
                        if (c1346520l90.LIZIZ > 0) {
                            long j4 = c1346520l90.LIZJ - c1346520l90.LIZ;
                            if (j4 > 0 && c1346520l90.LJI) {
                                jSONObject.put("auto_duration", j4);
                                long j5 = c1346520l90.LIZLLL;
                                if (j5 > 0) {
                                    jSONObject.put("auto_duration_with_a", j5 - c1346520l90.LIZ);
                                }
                            }
                        }
                        jSONObject.put("is_first_enter", C1344460l5g.LIZIZ ? 1 : 0);
                        jSONObject.put("panel_type", c1346520l90.LJ);
                        C20684815ws.LJIJ("input_panel_load_time", jSONObject);
                    }
                }
                c1346520l90.LIZ = -1L;
                c1346520l90.LIZJ = -1L;
                c1346520l90.LIZIZ = -1L;
                c1346520l90.LJ = "";
                c1346520l90.LJFF = "";
                c1346520l90.LJI = false;
                C1344460l5g.LIZIZ = false;
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("CommentKeyboardPerfUtil@92ca.onOpenPanelEnd$1");
                return unit;
            }
        });
        if (!C1345700l7g.LJIIIIZZ(ip()) && (iKeyboardInputPanelAssemAbilityLIZJ = C1346550l93.LIZJ(this)) != null) {
            iKeyboardInputPanelAssemAbilityLIZJ.m62(i2);
        }
    }
}
