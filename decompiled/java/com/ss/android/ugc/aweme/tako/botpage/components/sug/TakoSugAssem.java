package com.ss.android.ugc.aweme.tako.botpage.components.sug;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C013C;
import X.C019F;
import X.C01GW;
import X.C1308910kAL;
import X.C13LC;
import X.C13LE;
import X.C13MK;
import X.C14J2;
import X.C1637806bA;
import X.C1856450yPT;
import X.C1858050yS3;
import X.C1862330yYx;
import X.C1863850ybP;
import X.C19719912Dl;
import X.C19EG;
import X.C201995141x;
import X.C20235214Fq;
import X.C2097608Jq;
import X.C21415018rM;
import X.C2211631BhB;
import X.C2217381BqS;
import X.C444830HcP;
import X.C452501pT;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tako.botpage.components.action.multiple.TakoMultipleSelectVM;
import com.ss.android.ugc.aweme.tako.botpage.components.sug.TakoSugAssem;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.ITakoScreenTypeAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSug;
import com.ss.android.ugc.aweme.tako.model.AIBotInfo;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS218S0000000_29;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.AwS609S0100000_30;

/* JADX INFO: loaded from: classes31.dex */
public final class TakoSugAssem extends ReusedUISlotAssem<TakoSugAssem> implements InterfaceC712990Rxx<C1858050yS3> {
    public static final C201995141x LLLIIL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIILIL;
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 507));
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 505));
    public final AssemVMLazy LLJLIL;
    public C1858050yS3 LLJLILLLLZIIL;
    public C21415018rM LLJLL;
    public TuxTextView LLJLLIL;
    public View LLJLLL;
    public View LLJZ;
    public TuxIconView LLJZIJLIL;
    public C14J2 LLL;
    public final C444830HcP LLLF;
    public int LLLFF;
    public final C01GW LLLFFI;
    public Map<String, String> LLLFZ;
    public long LLLI;
    public boolean LLLII;
    public final C01GW LLLIIII;
    public final C01GW LLLIIIIL;
    public final C01GW LLLIIIL;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.141x] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoSugAssem.class, "multipleSelectVM", "getMultipleSelectVM()Lcom/ss/android/ugc/aweme/tako/botpage/components/action/multiple/TakoMultipleSelectVM;", 0);
        C13LE.LIZ.getClass();
        LLLIILIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLLIIL = new Object() { // from class: X.141x
        };
    }

    public TakoSugAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoMultipleSelectVM.class);
        this.LLJLIL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS573S0100000_29(c19719912DlLIZ, 506), AFwS274S0000000_30.get$arr$(155), null, true);
        this.LLLF = new C444830HcP();
        this.LLLFFI = C452501pT.LIZIZ(new AwS574S0100000_30(this, 251));
        this.LLLIIII = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(232));
        this.LLLIIIIL = C452501pT.LIZIZ(new AwS574S0100000_30(this, 249));
        this.LLLIIIL = C452501pT.LIZIZ(new AwS574S0100000_30(this, 250));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.flv;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final boolean r41() {
        ITakoScreenTypeAbility iTakoScreenTypeAbility = (ITakoScreenTypeAbility) this.LLLFFI.getValue();
        return C13MK.LIZ(iTakoScreenTypeAbility != null ? Boolean.valueOf(iTakoScreenTypeAbility.r41()) : null);
    }

    public final float sp() {
        return ((Number) this.LLLIIII.getValue()).floatValue();
    }

    public final boolean up() {
        return ((Boolean) this.LLLIIIIL.getValue()).booleanValue();
    }

    public final ITakoContextAbility yp() {
        return (ITakoContextAbility) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public final void zp() {
        this.LLLI = System.currentTimeMillis();
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        Map<String, String> map = this.LLLFZ;
        ITakoContextAbility iTakoContextAbilityYp = yp();
        c1862330yYx.mobTikbotQuickInteractionShow(map, iTakoContextAbilityYp != null ? iTakoContextAbilityYp.getCommonParams() : null);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJLL = (C21415018rM) view.findViewById(R.id.xlj);
        this.LLJLLIL = (TuxTextView) view.findViewById(R.id.xma);
        this.LLL = (C14J2) view.findViewById(R.id.ety);
        this.LLJLLL = view.findViewById(R.id.view_card_divider);
        this.LLJZ = view.findViewById(R.id.view_card_out_divider);
        this.LLJZIJLIL = (TuxIconView) view.findViewById(R.id.jx0);
        final C013C c013c = new C013C();
        AssemVMLazy assemVMLazy = this.LLJLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLIILIL;
        ((TakoMultipleSelectVM) assemVMLazy.getValue()).GQ2(new AwS609S0100000_30(c013c, 106));
        final C14J2 c14j2 = this.LLL;
        if (c14j2 != null) {
            C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.147k
                @Override // X.AbstractViewOnClickListenerC1637610siV
                public final void LIZ(View view2) {
                    ITakoContextAbility iTakoContextAbilityYp;
                    long jCurrentTimeMillis;
                    if (view2 != null && !c013c.element) {
                        IMessageAbility iMessageAbility = (IMessageAbility) this.LLJL.getValue();
                        if (iMessageAbility != null && iMessageAbility.oj()) {
                            C1858050yS3 c1858050yS3 = this.LLJLILLLLZIIL;
                            InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
                            C14J2 c14j22 = c14j2;
                            TakoSugAssem takoSugAssem = this;
                            Map<String, String> mapTp = takoSugAssem.tp(takoSugAssem.LLJLILLLLZIIL);
                            if (this.LLLI > 0) {
                                jCurrentTimeMillis = System.currentTimeMillis() - this.LLLI;
                            } else {
                                jCurrentTimeMillis = 0;
                            }
                            C1858060yS4.LJ(c1858050yS3, interfaceC665370Q7zLJIIL, c14j22, null, mapTp, Long.valueOf(jCurrentTimeMillis), 4);
                            this.LLLI = 0L;
                            return;
                        }
                        TakoSugAssem takoSugAssem2 = this;
                        takoSugAssem2.getClass();
                        C19EG c19egLIZ = C724240Sb0.LIZ(takoSugAssem2);
                        if (c19egLIZ == null || (iTakoContextAbilityYp = takoSugAssem2.yp()) == null) {
                            return;
                        }
                        C0DQF c0dqf = C0DQF.LIZ;
                        View contentView = takoSugAssem2.getContentView();
                        Map<String, String> commonParams = iTakoContextAbilityYp.getCommonParams();
                        long j = ((C1863850ybP) iTakoContextAbilityYp.T71().LIZIZ()).LLJJ;
                        int i = ((C1863850ybP) iTakoContextAbilityYp.T71().LIZIZ()).LLJJI;
                        String str = ((C1863850ybP) iTakoContextAbilityYp.T71().LIZIZ()).LLJJIII;
                        if (str == null) {
                            str = "";
                        }
                        c0dqf.LJIIL(c19egLIZ, contentView, commonParams, new AIBotInfo(j, str, null, i, 0, 0, null, null, false, false, false, null, null, null, null, null, null, null, false, null, null, null, null, 8388596, null));
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(300L);
                }
            }, c14j2);
        }
        C2211631BhB.LJ(getContentView(), new AwS609S0100000_30(this, 141));
    }

    public final int op(int i) {
        Integer numLIZJ;
        C19EG c19egLIZ = C724240Sb0.LIZ(this);
        if (c19egLIZ != null && (numLIZJ = C1308910kAL.LIZJ(i, c19egLIZ)) != null) {
            return numLIZJ.intValue();
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:216:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0669  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x066e  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0674 A[PHI: r19
      0x0674: PHI (r19v2 int) = (r19v1 int), (r19v5 int) binds: [B:251:0x0670, B:215:0x0593] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0680 A[PHI: r14
      0x0680: PHI (r14v2 int) = (r14v1 int), (r14v4 int) binds: [B:257:0x067c, B:208:0x0581] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v17 */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(X.C1858050yS3 r24) {
        /*
            Method dump skipped, instruction units count: 1882
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.botpage.components.sug.TakoSugAssem.up(java.lang.Object):void");
    }

    public final Map<String, String> tp(C1856450yPT c1856450yPT) {
        TakoSug takoSug;
        String str;
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        if (c1856450yPT != null && (takoSug = c1856450yPT.LLILLJJLI) != null && takoSug.isFirstSug) {
            ITakoContextAbility iTakoContextAbilityYp = yp();
            if (iTakoContextAbilityYp != null && (c13lcT71 = iTakoContextAbilityYp.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
                str = c1863850ybP.LLILZIL;
            } else {
                str = null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C20235214Fq.LIZ.getClass();
            String strLIZJ = C20235214Fq.LIZJ(str);
            String str2 = "";
            if (strLIZJ == null) {
                strLIZJ = "";
            }
            linkedHashMap.put("group_id", strLIZJ);
            String strLIZLLL = C20235214Fq.LIZLLL(str);
            if (strLIZLLL != null) {
                str2 = strLIZLLL;
            }
            linkedHashMap.put("last_feed_group_id", str2);
            linkedHashMap.put("word_line_count", String.valueOf(this.LLLFF));
            return linkedHashMap;
        }
        return C2097608Jq.LJ();
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1858050yS3 c1858050yS3) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1858050yS3 c1858050yS3) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }
}
