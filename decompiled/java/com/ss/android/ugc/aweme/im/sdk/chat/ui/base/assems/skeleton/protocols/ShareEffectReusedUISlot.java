package com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.skeleton.protocols;

import X.C019F;
import X.C01GW;
import X.C0ID2;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1332130kln;
import X.C13LE;
import X.C1637806bA;
import X.C1843500y4a;
import X.C197039127h;
import X.C19719912Dl;
import X.C21627319kV;
import X.C2217381BqS;
import X.C438710HIf;
import X.C452501pT;
import X.C460270I3d;
import X.C460280I3e;
import X.C461530I7z;
import X.C462590ICb;
import X.C687700QyG;
import X.C724750Sbp;
import X.C786410Ut5;
import X.C869590Y9l;
import X.C893560Z3q;
import X.C896400ZEo;
import X.C900640ZUw;
import X.C900650ZUx;
import X.InterfaceC1146704e9;
import X.InterfaceC1587906Jp;
import X.InterfaceC2217461Bqa;
import X.InterfaceC460300I3g;
import X.InterfaceC712990Rxx;
import X.InterfaceC900630ZUv;
import Y.ACListenerS80S0300000_14;
import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.vcloud.strategy.StrategyCenter;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.quickinteraction.viewmodel.QuickChatViewModel;
import com.ss.android.ugc.aweme.views.RoundingCornerLayoutLL;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS585S0100000_6;

/* JADX INFO: loaded from: classes15.dex */
public final class ShareEffectReusedUISlot extends ReusedUISlotAssem<ShareEffectReusedUISlot> implements InterfaceC712990Rxx<InterfaceC900630ZUv>, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLLL;
    public final AssemVMLazy LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public TuxTextView LLJLILLLLZIIL;
    public TuxTextView LLJLL;
    public final C01GW LLJLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ShareEffectReusedUISlot.class, "quickChatViewModel", "getQuickChatViewModel()Lcom/ss/android/ugc/aweme/im/sdk/chat/feature/quickinteraction/viewmodel/QuickChatViewModel;", 0);
        C13LE.LIZ.getClass();
        LLJLLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public ShareEffectReusedUISlot() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(QuickChatViewModel.class);
        this.LLJJLIIIJLLLLLLLZ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS558S0100000_14(c19719912DlLIZ, 807), AFwS248S0000000_14.get$arr$(231), null, true);
        this.LLJL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 805));
        this.LLJLIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 806));
        this.LLJLLIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, StrategyCenter.ENABLE_SMART_SERVICE));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.ckm;
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
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        this.LLJLILLLLZIIL = (TuxTextView) view.findViewById(R.id.y3j);
        this.LLJLL = (TuxTextView) LJJIJL().findViewById(R.id.foa);
        ((C197039127h) this.LLJLLIL.getValue()).LJJJJL(new AwS585S0100000_6(this, 109));
    }

    public final void op(InterfaceC900630ZUv interfaceC900630ZUv) {
        ((RoundingCornerLayoutLL) this.LLJL.getValue()).setRoundingParams(interfaceC900630ZUv.LIZJ().LIZ);
        ((View) this.LLJL.getValue()).setBackground(C462590ICb.LIZIZ(interfaceC900630ZUv.LIZJ(), LJJIJL()));
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC900630ZUv interfaceC900630ZUv) {
        InterfaceC900630ZUv interfaceC900630ZUv2 = interfaceC900630ZUv;
        sp(interfaceC900630ZUv2.getContent(), interfaceC900630ZUv2.LLILII().LIZ.LIZ);
        op(interfaceC900630ZUv2);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC900630ZUv interfaceC900630ZUv) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC900630ZUv interfaceC900630ZUv) {
    }

    public final void sp(C900650ZUx c900650ZUx, C869590Y9l c869590Y9l) {
        Long lValueOf;
        String str;
        Map<String, String> ext;
        String str2;
        UrlModel urlModel;
        long jLongValue;
        Long l;
        Long l2;
        String str3;
        TuxTextView tuxTextView = this.LLJLILLLLZIIL;
        String str4 = "";
        if (tuxTextView != null) {
            if (c900650ZUx == null || (str3 = c900650ZUx.LIZIZ) == null) {
                str3 = "";
            }
            tuxTextView.setText(str3);
        }
        TuxTextView tuxTextView2 = this.LLJLL;
        if (tuxTextView2 != null) {
            C460270I3d c460270I3d = InterfaceC460300I3g.LIZ;
            long jLongValue2 = 0;
            if (c900650ZUx != null && (l2 = c900650ZUx.LIZJ) != null) {
                jLongValue = l2.longValue();
            } else {
                jLongValue = 0;
            }
            C21627319kV c21627319kVLIZJ = C21627319kV.LIZJ();
            if (c900650ZUx != null && (l = c900650ZUx.LIZJ) != null) {
                jLongValue2 = l.longValue();
            }
            C460280I3e c460280I3e = new C460280I3e(jLongValue, c21627319kVLIZJ.LJFF(C1843500y4a.LIZIZ(jLongValue2)));
            Context context = LJJIJL().getContext();
            c460270I3d.getClass();
            tuxTextView2.setText(C460270I3d.LIZ(c460280I3e, context));
        }
        if (c900650ZUx != null && (urlModel = c900650ZUx.LIZLLL) != null) {
            if (urlModel.getUrlList() != null && (!r2.isEmpty())) {
                C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel));
                c1331670kl3LJIIIIZZ.LJJ((SmartImageView) this.LLJLIL.getValue());
                C1332130kln.LJFF(c1331670kl3LJIIIIZZ, "effect", new C0ID2(this, 4), false, null, null, null, 60);
            } else {
                C786410Ut5.LLFF(0, (SmartImageView) this.LLJLIL.getValue());
            }
        }
        C893560Z3q c893560Z3q = C893560Z3q.LIZ;
        String conversationId = null;
        if (c869590Y9l != null) {
            lValueOf = Long.valueOf(c869590Y9l.getSender());
        } else {
            lValueOf = null;
        }
        if (c869590Y9l != null) {
            conversationId = c869590Y9l.getConversationId();
        }
        if (c900650ZUx == null || (str = c900650ZUx.LIZ) == null) {
            str = "";
        }
        if (c869590Y9l != null && (ext = c869590Y9l.getExt()) != null && (str2 = ext.get("a:src")) != null) {
            str4 = str2;
        }
        C893560Z3q.LIZJ(c893560Z3q, lValueOf, null, conversationId, "share_effect", null, str, false, false, false, false, str4, null, null, null, 63424);
        C786410Ut5.U8((C197039127h) this.LLJLLIL.getValue(), new ACListenerS80S0300000_14(c869590Y9l, c900650ZUx, this, 3));
        C786410Ut5.Oa((RoundingCornerLayoutLL) this.LLJL.getValue(), new ACListenerS80S0300000_14(c869590Y9l, c900650ZUx, this, 4));
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        C900640ZUw c900640ZUw;
        InterfaceC900630ZUv interfaceC900630ZUv = (InterfaceC900630ZUv) interfaceC1587906Jp;
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
                if ((obj2 instanceof C900640ZUw) && (c900640ZUw = (C900640ZUw) obj2) != null) {
                    if (c900640ZUw.LIZ) {
                        sp(interfaceC900630ZUv.getContent(), interfaceC900630ZUv.LLILII().LIZ.LIZ);
                    }
                    if (c900640ZUw.LIZIZ) {
                        op(interfaceC900630ZUv);
                    }
                }
            }
            return;
        }
        sp(interfaceC900630ZUv.getContent(), interfaceC900630ZUv.LLILII().LIZ.LIZ);
        op(interfaceC900630ZUv);
    }

    public static void tp(C900650ZUx c900650ZUx, C869590Y9l c869590Y9l, String str) {
        Long lValueOf;
        String str2;
        Map<String, String> ext;
        String str3;
        C893560Z3q c893560Z3q = C893560Z3q.LIZ;
        String conversationId = null;
        if (c869590Y9l != null) {
            lValueOf = Long.valueOf(c869590Y9l.getSender());
        } else {
            lValueOf = null;
        }
        if (c869590Y9l != null) {
            conversationId = c869590Y9l.getConversationId();
        }
        String str4 = "";
        if (c900650ZUx == null || (str2 = c900650ZUx.LIZ) == null) {
            str2 = "";
        }
        boolean zLJI = C896400ZEo.LJI(c869590Y9l);
        boolean zLJIIIZ = C896400ZEo.LJIIIZ(c869590Y9l);
        if (c869590Y9l != null && (ext = c869590Y9l.getExt()) != null && (str3 = ext.get("a:src")) != null) {
            str4 = str3;
        }
        C893560Z3q.LIZIZ(c893560Z3q, lValueOf, null, conversationId, "share_effect", "", str2, zLJI, zLJIIIZ, false, false, false, str, str4, null, null, 52992);
    }
}
