package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.skeleton.slot;

import X.C019F;
import X.C01GW;
import X.C0I98;
import X.C0Y3I;
import X.C0Y3R;
import X.C0YNY;
import X.C0ZDX;
import X.C13LE;
import X.C1637806bA;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452501pT;
import X.C461300I7c;
import X.C461320I7e;
import X.C461530I7z;
import X.C603540Nlo;
import X.C687700QyG;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C869590Y9l;
import X.EnumC454500Hs0;
import X.InterfaceC1146704e9;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC461400I7m;
import X.InterfaceC712990Rxx;
import X.InterfaceC874680YTa;
import Y.ACListenerS110S0200000_6;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.message.template.component.GreetingCardInfoComponent;
import com.ss.android.ugc.aweme.viewmodel.GreetingCardViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class GreetingCardReusedUISlot extends ReusedUISlotAssem<GreetingCardReusedUISlot> implements InterfaceC712990Rxx<InterfaceC461400I7m>, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLIL;
    public final AssemVMLazy LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(GreetingCardReusedUISlot.class, "greetingCardVM", "getGreetingCardVM()Lcom/ss/android/ugc/aweme/viewmodel/GreetingCardViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public GreetingCardReusedUISlot() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(GreetingCardViewModel.class);
        this.LLJJLIIIJLLLLLLLZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS550S0100000_6(c19719912DlLIZ, 313), AFwS236S0000000_6.get$arr$(181), null, true);
        this.LLJL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 312));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cld;
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

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final SmartImageView sp() {
        return (SmartImageView) this.LLJL.getValue();
    }

    public final void op(InterfaceC461400I7m interfaceC461400I7m) {
        String strLIZIZ;
        String str;
        GreetingCardInfoComponent greetingCardInfoComponentLJI = C0ZDX.LJI(interfaceC461400I7m.LLILII().LIZ.LIZ);
        if (greetingCardInfoComponentLJI == null) {
            return;
        }
        boolean zLIZIZ = C461300I7c.LIZIZ(interfaceC461400I7m.LLILII().LIZ.LIZ, greetingCardInfoComponentLJI.status);
        if (zLIZIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(interfaceC461400I7m.LLILII().LIZ.LIZ.getMsgId());
            sbLIZ.append("|1");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(interfaceC461400I7m.LLILII().LIZ.LIZ.getMsgId());
            sbLIZ2.append("|0");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        if (Intrinsics.LJFF(sp().getTag(), strLIZIZ)) {
            return;
        }
        sp().setTag(strLIZIZ);
        C869590Y9l c869590Y9l = interfaceC461400I7m.LLILII().LIZ.LIZ;
        String str2 = greetingCardInfoComponentLJI.festiveId;
        AssemVMLazy assemVMLazy = this.LLJJLIIIJLLLLLLLZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLIL;
        UrlModel urlModelXQ2 = ((GreetingCardViewModel) assemVMLazy.getValue()).xQ2(str2, zLIZIZ);
        if (urlModelXQ2 != null) {
            boolean zLIZ = C461300I7c.LIZ(c869590Y9l, zLIZIZ);
            boolean zLIZJ = C0I98.LIZJ(sp(), urlModelXQ2, null, EnumC454500Hs0.GREETING_CARD.getCallerId(), sp().getWidth(), sp().getHeight(), zLIZ ? 1 : 0, 0, null, null, null, false, false, null, null, null, zLIZ, null, 786308);
            if (zLIZ && zLIZJ && C461300I7c.LIZ(c869590Y9l, zLIZIZ)) {
                if (zLIZIZ) {
                    str = "message_opened_animation_played";
                } else {
                    str = "message_closed_animation_played";
                }
                c869590Y9l.getLocalExt().put(str, "1");
                C603540Nlo.LIZ(C0YNY.LIZ(InterfaceC874680YTa.LIZ).LIZIZ(), c869590Y9l, str, new C0Y3R("1"), new C0Y3I("update greeting card message animated"));
            }
        }
        C786410Ut5.Q8(sp(), new ACListenerS110S0200000_6(this, interfaceC461400I7m, 7));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC461400I7m interfaceC461400I7m) {
        op(interfaceC461400I7m);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC461400I7m interfaceC461400I7m) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC461400I7m interfaceC461400I7m) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        C461320I7e c461320I7e;
        InterfaceC461400I7m interfaceC461400I7m = (InterfaceC461400I7m) interfaceC1587906Jp;
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
                if ((obj2 instanceof C461320I7e) && (c461320I7e = (C461320I7e) obj2) != null && c461320I7e.LIZ) {
                    op(interfaceC461400I7m);
                }
            }
            return;
        }
        op(interfaceC461400I7m);
    }
}
