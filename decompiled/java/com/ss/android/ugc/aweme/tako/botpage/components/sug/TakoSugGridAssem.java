package com.ss.android.ugc.aweme.tako.botpage.components.sug;

import X.C013C;
import X.C019F;
import X.C01GW;
import X.C13LE;
import X.C14J2;
import X.C1637806bA;
import X.C1856050yOp;
import X.C1858050yS3;
import X.C1858060yS4;
import X.C1862330yYx;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C427690Gpr;
import X.C452501pT;
import X.C724750Sbp;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import X.ViewOnAttachStateChangeListenerC1864720yco;
import Y.ACListenerS129S0200000_27;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tako.botpage.components.action.multiple.TakoMultipleSelectVM;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoSugGridAssem extends ReusedUISlotAssem<TakoSugGridAssem> implements InterfaceC712990Rxx<C1858050yS3> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLL;
    public final C01GW LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1275));
    public final AssemVMLazy LLJL;
    public C1858050yS3 LLJLIL;
    public TuxTextView LLJLILLLLZIIL;
    public C14J2 LLJLL;
    public Map<String, String> LLJLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(TakoSugGridAssem.class, "multipleSelectVM", "getMultipleSelectVM()Lcom/ss/android/ugc/aweme/tako/botpage/components/action/multiple/TakoMultipleSelectVM;", 0);
        C13LE.LIZ.getClass();
        LLJLLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public TakoSugGridAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(TakoMultipleSelectVM.class);
        this.LLJL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS568S0100000_24(c19719912DlLIZ, 1274), AFwS264S0000000_24.get$arr$(436), null, true);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.flu;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) throws JSONException {
        Map<String, String> commonParams;
        this.LLJLILLLLZIIL = (TuxTextView) view.findViewById(R.id.wnf);
        this.LLJLL = (C14J2) view.findViewById(R.id.ety);
        C013C c013c = new C013C();
        AssemVMLazy assemVMLazy = this.LLJL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLLL;
        ((TakoMultipleSelectVM) assemVMLazy.getValue()).GQ2(new AwS606S0100000_27(c013c, 248));
        C14J2 c14j2 = this.LLJLL;
        if (c14j2 != null) {
            C786410Ut5.Da(c14j2, new ACListenerS129S0200000_27(this, c013c, 16));
        }
        View viewLJJIJL = LJJIJL();
        if (viewLJJIJL.isAttachedToWindow()) {
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            Map<String, String> map = this.LLJLLIL;
            ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) this.LLJJLIIIJLLLLLLLZ.getValue();
            if (iTakoContextAbility != null) {
                commonParams = iTakoContextAbility.getCommonParams();
            } else {
                commonParams = null;
            }
            c1862330yYx.mobTikbotQuickInteractionShow(map, commonParams);
            return;
        }
        viewLJJIJL.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1864720yco(viewLJJIJL, this, 1));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C1858050yS3 c1858050yS3) throws JSONException {
        Object objLIZIZ;
        Object objLIZIZ2;
        Map<String, String> commonParams;
        C1858050yS3 c1858050yS32 = c1858050yS3;
        this.LLJLIL = c1858050yS32;
        Map<String, String> map = this.LLJLLIL;
        if (map != null) {
            objLIZIZ = C1856050yOp.LIZIZ("query_message_id", map);
        } else {
            objLIZIZ = null;
        }
        Map<String, String> map2 = this.LLJLLIL;
        if (map2 != null) {
            objLIZIZ2 = C1856050yOp.LIZIZ("is_session_first_round", map2);
        } else {
            objLIZIZ2 = null;
        }
        boolean zLJFF = Intrinsics.LJFF(objLIZIZ2, "1");
        this.LLJLLIL = C1858060yS4.LIZ(c1858050yS32, null, null);
        if (!Intrinsics.LJFF(objLIZIZ, c1858050yS32.LLILLJJLI.replyUuid) && ((objLIZIZ != null || zLJFF) && c1858050yS32.LL.LLILLL == null)) {
            View viewLJJIJL = LJJIJL();
            if (viewLJJIJL.isAttachedToWindow()) {
                C1862330yYx c1862330yYx = C1862330yYx.LIZ;
                Map<String, String> map3 = this.LLJLLIL;
                ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) this.LLJJLIIIJLLLLLLLZ.getValue();
                if (iTakoContextAbility != null) {
                    commonParams = iTakoContextAbility.getCommonParams();
                } else {
                    commonParams = null;
                }
                c1862330yYx.mobTikbotQuickInteractionShow(map3, commonParams);
            } else {
                viewLJJIJL.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1864720yco(viewLJJIJL, this, 3));
            }
        }
        C14J2 c14j2 = this.LLJLL;
        if (c14j2 != null) {
            c14j2.setUI(new AwS606S0100000_27(this, 346));
        }
        TuxTextView tuxTextView = this.LLJLILLLLZIIL;
        if (tuxTextView != null) {
            tuxTextView.setText(c1858050yS32.LLILZ);
        }
        C14J2 c14j22 = this.LLJLL;
        if (c14j22 != null) {
            C427690Gpr.LJI(c14j22, null);
            c14j22.setForeground(null);
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1858050yS3 c1858050yS3) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1858050yS3 c1858050yS3) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) throws JSONException {
        up(interfaceC1587906Jp);
    }
}
