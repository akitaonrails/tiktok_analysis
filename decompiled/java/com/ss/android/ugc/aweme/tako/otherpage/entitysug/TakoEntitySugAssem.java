package com.ss.android.ugc.aweme.tako.otherpage.entitysug;

import X.C0R2Q;
import X.C13LC;
import X.C14J2;
import X.C1558520qew;
import X.C1856220yP6;
import X.C1862330yYx;
import X.C1863850ybP;
import X.C20235014Fo;
import X.C20627315nb;
import X.C427690Gpr;
import X.C597050NbL;
import X.C786410Ut5;
import X.InterfaceC1587906Jp;
import X.InterfaceC665370Q7z;
import X.InterfaceC712990Rxx;
import X.ViewOnLongClickListenerC1864620yce;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.zhiliaoapp.musically.R;
import irm.AkS94S0100000_27;
import java.util.List;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.AwS641S0100000_27;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes28.dex */
public final class TakoEntitySugAssem extends ReusedUISlotAssem<TakoEntitySugAssem> implements InterfaceC712990Rxx<C1856220yP6> {
    public C14J2 LLJJLIIIJLLLLLLLZ;
    public TuxTextView LLJL;
    public C20627315nb LLJLIL;
    public TuxIconView LLJLILLLLZIIL;
    public C1856220yP6 LLJLL;
    public String LLJLLIL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.fkm;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJJLIIIJLLLLLLLZ = (C14J2) view.findViewById(R.id.x76);
        C14J2 c14j2 = this.LLJJLIIIJLLLLLLLZ;
        if (c14j2 != null) {
            c14j2.setUI(new AwS606S0100000_27(this, 260));
        }
        C14J2 c14j22 = this.LLJJLIIIJLLLLLLLZ;
        if (c14j22 != null) {
            C427690Gpr.LJI(c14j22, new AwS641S0100000_27(c14j22, 67));
            C786410Ut5.I7(new AkS94S0100000_27(this, 20), c14j22);
            c14j22.setOnLongClickListener(new ViewOnLongClickListenerC1864620yce(this, c14j22, 6));
        }
        this.LLJLIL = (C20627315nb) view.findViewById(R.id.x78);
        this.LLJL = (TuxTextView) view.findViewById(R.id.x77);
        this.LLJLILLLLZIIL = (TuxIconView) view.findViewById(R.id.x75);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(C1856220yP6 c1856220yP6) throws JSONException {
        InterfaceC665370Q7z interfaceC665370Q7z;
        ITakoContextAbility iTakoContextAbility;
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        String str;
        C1856220yP6 c1856220yP62 = c1856220yP6;
        this.LLJLL = c1856220yP62;
        if (c1856220yP62.LLJ) {
            C20627315nb c20627315nb = this.LLJLIL;
            if (c20627315nb != null) {
                C786410Ut5.LLLZLL(c20627315nb, 0);
            }
            C20627315nb c20627315nb2 = this.LLJLIL;
            if (c20627315nb2 != null) {
                c20627315nb2.setLoading(true);
            }
            C14J2 c14j2 = this.LLJJLIIIJLLLLLLLZ;
            if (c14j2 != null) {
                C786410Ut5.c1(c14j2, 0);
            }
            TuxTextView tuxTextView = this.LLJL;
            if (tuxTextView != null) {
                C786410Ut5.LLLLZLL(tuxTextView, 8);
            }
            TuxIconView tuxIconView = this.LLJLILLLLZIIL;
            if (tuxIconView != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView, 8);
                return;
            }
            return;
        }
        C20627315nb c20627315nb3 = this.LLJLIL;
        if (c20627315nb3 != null) {
            C786410Ut5.LLLZLL(c20627315nb3, 8);
        }
        C20627315nb c20627315nb4 = this.LLJLIL;
        if (c20627315nb4 != null) {
            c20627315nb4.setLoading(false);
        }
        C14J2 c14j22 = this.LLJJLIIIJLLLLLLLZ;
        if (c14j22 != null) {
            C786410Ut5.c1(c14j22, 0);
        }
        TuxIconView tuxIconView2 = this.LLJLILLLLZIIL;
        if (tuxIconView2 != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView2, 0);
        }
        TuxTextView tuxTextView2 = this.LLJL;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(c1856220yP62.LLILLL);
        }
        TuxTextView tuxTextView3 = this.LLJL;
        if (tuxTextView3 != null) {
            C786410Ut5.LLLLZLL(tuxTextView3, 0);
        }
        String str2 = this.LLJLLIL;
        if ((str2 == null || str2.length() == 0 || !Intrinsics.LJFF(this.LLJLLIL, c1856220yP62.LLIZ)) && (interfaceC665370Q7z = c1856220yP62.LL) != null && (iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(interfaceC665370Q7z, ITakoContextAbility.class, null)) != null && (c13lcT71 = iTakoContextAbility.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            String str3 = c1863850ybP.LLILZIL;
            String str4 = c1863850ybP.LL;
            String str5 = c1863850ybP.LLILLJJLI;
            String str6 = c1856220yP62.LLIZ;
            String str7 = c1856220yP62.LLILLJJLI;
            String str8 = c1856220yP62.LLILLL;
            String str9 = c1863850ybP.LLILZLL;
            String str10 = "";
            if (str9 == null) {
                str9 = "";
            }
            String str11 = c1863850ybP.LLIZ;
            if (str11 != null) {
                str10 = str11;
            }
            int iLIZ = C0R2Q.LIZ(c1856220yP62.LLILZ);
            boolean z = c1856220yP62.LLIZLLLIL;
            C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
            c1862330yYx.getClass();
            if (z) {
                str = "tikbot_highlighted_word_context_show";
            } else {
                str = "tikbot_segmented_word_context_show";
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("process_id", str3);
            jSONObject.put("enter_from", str4);
            jSONObject.put("enter_method", str5);
            jSONObject.put("message_id", str6);
            jSONObject.put("word_content", str8);
            jSONObject.put("highlighted_word", str7);
            jSONObject.put("rank", iLIZ);
            jSONObject.put("tako_session_id", str9);
            if (str10.length() > 0) {
                jSONObject.put("tako_chat_id", str10);
            }
            c20235014FoLIZ.LIZIZ(str, jSONObject);
        }
        this.LLJLLIL = c1856220yP62.LLIZ;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1856220yP6 c1856220yP6) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1856220yP6 c1856220yP6) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) throws JSONException {
        up(interfaceC1587906Jp);
    }
}
