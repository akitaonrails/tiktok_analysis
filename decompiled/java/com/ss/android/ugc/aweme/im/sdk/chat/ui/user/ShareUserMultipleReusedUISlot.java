package com.ss.android.ugc.aweme.im.sdk.chat.ui.user;

import X.C01GW;
import X.C11JF;
import X.C11NZ;
import X.C1477805qS;
import X.C1477905qT;
import X.C1509305vX;
import X.C1559260qg8;
import X.C452501pT;
import X.C461530I7z;
import X.C461640I8k;
import X.C462590ICb;
import X.C462620ICe;
import X.C462730ICp;
import X.C687700QyG;
import X.C723590SZx;
import X.C786410Ut5;
import X.C898900ZOe;
import X.InterfaceC1146704e9;
import X.InterfaceC1587906Jp;
import X.InterfaceC462720ICo;
import X.InterfaceC712990Rxx;
import Y.ACListenerS141S0100000_6;
import Y.AfS183S0100000_14;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.message.content.ShareUserContent;
import com.ss.android.ugc.aweme.im.message.content.adapter.BaseContentParserKt;
import com.ss.android.ugc.aweme.views.RoundingCornerLayoutLL;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class ShareUserMultipleReusedUISlot extends ReusedUISlotAssem<ShareUserMultipleReusedUISlot> implements InterfaceC712990Rxx<InterfaceC462720ICo>, InterfaceC1146704e9 {
    public final C1559260qg8 LLJJLIIIJLLLLLLLZ = new C1559260qg8(new C723590SZx(this, C898900ZOe.class, null), checkSupervisorPrepared());
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 949));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 947));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 954));
    public final C01GW LLJLL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 950));
    public final C01GW LLJLLIL = C1509305vX.LIZ(new AwS558S0100000_14(this, 951));
    public final C01GW LLJLLL = C1509305vX.LIZ(new AwS558S0100000_14(this, 952));
    public final C01GW LLJZ = C1509305vX.LIZ(new AwS558S0100000_14(this, 953));
    public final C01GW LLJZIJLIL = C1509305vX.LIZ(new AwS558S0100000_14(this, 948));
    public final C01GW LLL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 946));
    public C11JF LLLF;
    public ShareUserContent LLLFF;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cm2;
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{ChatRoomScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ChatRoomScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final void cp() {
        C11JF c11jf = this.LLLF;
        if (c11jf != null) {
            c11jf.dispose();
        }
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
        C11JF c11jf = this.LLLF;
        if (c11jf != null) {
            c11jf.dispose();
        }
        C1477805qS.LIZ(this.LLLFF);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C786410Ut5.Oa((RoundingCornerLayoutLL) this.LLJL.getValue(), new ACListenerS141S0100000_6(this, 42));
        C786410Ut5.h9((TuxTextView) this.LLJZIJLIL.getValue(), new ACListenerS141S0100000_6(this, 43));
        C461640I8k.LIZ.LIZ(((C898900ZOe) this.LLJJLIIIJLLLLLLLZ.getValue()).LLILLL, (View) this.LLJL.getValue());
    }

    public final void op(InterfaceC462720ICo interfaceC462720ICo) {
        C11JF c11jf = this.LLLF;
        if (c11jf != null) {
            c11jf.dispose();
        }
        ShareUserContent shareUserContent = (ShareUserContent) BaseContentParserKt.getOrParseJsonContent(interfaceC462720ICo.LLILII().LIZ.LIZ, ShareUserContent.class);
        this.LLLFF = shareUserContent;
        this.LLLF = (C11JF) C11NZ.LJIJJLI(new C1477905qT(shareUserContent, true, LifecycleOwnerKt.getLifecycleScope(this))).LJJLJLI(new AfS183S0100000_14(this, 2));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC462720ICo interfaceC462720ICo) {
        InterfaceC462720ICo interfaceC462720ICo2 = interfaceC462720ICo;
        op(interfaceC462720ICo2);
        C462620ICe c462620ICeLIZJ = interfaceC462720ICo2.LIZJ();
        ((View) this.LLJL.getValue()).setBackground(C462590ICb.LIZIZ(c462620ICeLIZJ, (View) this.LLJL.getValue()));
        ((RoundingCornerLayoutLL) this.LLJL.getValue()).setRoundingParams(c462620ICeLIZJ.LIZ);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC462720ICo interfaceC462720ICo) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC462720ICo interfaceC462720ICo) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        C462730ICp c462730ICp;
        InterfaceC462720ICo interfaceC462720ICo = (InterfaceC462720ICo) interfaceC1587906Jp;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof C461530I7z) {
                    arrayList.add(obj);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object obj2 = ((C461530I7z) it2.next()).LIZIZ;
                if ((obj2 instanceof C462730ICp) && (c462730ICp = (C462730ICp) obj2) != null) {
                    if (c462730ICp.LIZ) {
                        op(interfaceC462720ICo);
                    }
                    if (c462730ICp.LIZIZ) {
                        C462620ICe c462620ICeLIZJ = interfaceC462720ICo.LIZJ();
                        ((View) this.LLJL.getValue()).setBackground(C462590ICb.LIZIZ(c462620ICeLIZJ, (View) this.LLJL.getValue()));
                        ((RoundingCornerLayoutLL) this.LLJL.getValue()).setRoundingParams(c462620ICeLIZJ.LIZ);
                    }
                }
            }
            return;
        }
        op(interfaceC462720ICo);
        C462620ICe c462620ICeLIZJ2 = interfaceC462720ICo.LIZJ();
        ((View) this.LLJL.getValue()).setBackground(C462590ICb.LIZIZ(c462620ICeLIZJ2, (View) this.LLJL.getValue()));
        ((RoundingCornerLayoutLL) this.LLJL.getValue()).setRoundingParams(c462620ICeLIZJ2.LIZ);
    }
}
