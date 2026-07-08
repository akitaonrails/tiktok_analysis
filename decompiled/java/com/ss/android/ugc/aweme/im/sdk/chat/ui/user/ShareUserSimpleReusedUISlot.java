package com.ss.android.ugc.aweme.im.sdk.chat.ui.user;

import X.C01GW;
import X.C0I6Y;
import X.C11JF;
import X.C11NZ;
import X.C1322090kVb;
import X.C1331070kk5;
import X.C1331100kk8;
import X.C1383370m6R;
import X.C1477805qS;
import X.C1477905qT;
import X.C452501pT;
import X.C461530I7z;
import X.C462590ICb;
import X.C687700QyG;
import X.C723590SZx;
import X.C724270Sb3;
import X.C786410Ut5;
import X.C898900ZOe;
import X.C899700ZRg;
import X.InterfaceC1146704e9;
import X.InterfaceC1587906Jp;
import X.InterfaceC461380I7k;
import X.InterfaceC712990Rxx;
import X.InterfaceC899690ZRf;
import Y.ACListenerS141S0100000_6;
import Y.AfS171S0100000_2;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.im.common.scope.ChatRoomScope;
import com.ss.android.ugc.aweme.im.message.content.ShareUserContent;
import com.ss.android.ugc.aweme.im.message.content.adapter.BaseContentParserKt;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: loaded from: classes15.dex */
public final class ShareUserSimpleReusedUISlot extends ReusedUISlotAssem<ShareUserSimpleReusedUISlot> implements InterfaceC712990Rxx<InterfaceC899690ZRf>, InterfaceC1146704e9 {
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public C11JF LLJLLIL;
    public ShareUserContent LLJLLL;

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cm6;
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
        C11JF c11jf = this.LLJLLIL;
        if (c11jf != null) {
            c11jf.dispose();
        }
    }

    public final void op() {
        C11JF c11jf = this.LLJLLIL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        C724270Sb3 c724270Sb3 = this.LLJI;
        ShareUserContent shareUserContent = (ShareUserContent) BaseContentParserKt.getOrParseJsonContent(C0I6Y.LIZ((InterfaceC461380I7k) (c724270Sb3 != null ? c724270Sb3.LL : null)), ShareUserContent.class);
        this.LLJLLL = shareUserContent;
        this.LLJLLIL = (C11JF) C11NZ.LJIJJLI(new C1477905qT(shareUserContent, false, LifecycleOwnerKt.getLifecycleScope(this))).LJJLJLI(new AfS171S0100000_2(this, 15));
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
        C11JF c11jf = this.LLJLLIL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        C1477805qS.LIZ(this.LLJLLL);
    }

    public ShareUserSimpleReusedUISlot() {
        checkSupervisorPrepared();
        new C723590SZx(this, C898900ZOe.class, null);
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 957));
        this.LLJL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 956));
        this.LLJLIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 959));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 958));
        this.LLJLL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 955));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        View viewFindViewById = ((View) this.LLJJLIIIJLLLLLLLZ.getValue()).findViewById(R.id.dg4);
        if (viewFindViewById != null) {
            viewFindViewById.setBackgroundColor(C1383370m6R.LJFF(R.attr.a03));
        }
        C786410Ut5.I7(new ACListenerS141S0100000_6(this, 44), (View) this.LLJJLIIIJLLLLLLLZ.getValue());
        ((C1331070kk5) ((C1322090kVb) this.LLJL.getValue()).getHierarchy()).LJJIII(C1331100kk8.LIZ());
        int dimensionPixelSize = ((View) this.LLJL.getValue()).getResources().getDimensionPixelSize(R.dimen.a0l);
        ((View) this.LLJL.getValue()).setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final void up(InterfaceC899690ZRf interfaceC899690ZRf) {
        op();
        ((View) this.LLJJLIIIJLLLLLLLZ.getValue()).setBackground(C462590ICb.LIZIZ(interfaceC899690ZRf.LIZJ(), (View) this.LLJJLIIIJLLLLLLLZ.getValue()));
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(InterfaceC899690ZRf interfaceC899690ZRf) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(InterfaceC899690ZRf interfaceC899690ZRf) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        C899700ZRg c899700ZRg;
        InterfaceC899690ZRf interfaceC899690ZRf = (InterfaceC899690ZRf) interfaceC1587906Jp;
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
                if ((obj2 instanceof C899700ZRg) && (c899700ZRg = (C899700ZRg) obj2) != null) {
                    if (c899700ZRg.LIZ) {
                        op();
                    }
                    if (c899700ZRg.LIZIZ) {
                        ((View) this.LLJJLIIIJLLLLLLLZ.getValue()).setBackground(C462590ICb.LIZIZ(interfaceC899690ZRf.LIZJ(), (View) this.LLJJLIIIJLLLLLLLZ.getValue()));
                    }
                }
            }
            return;
        }
        op();
        ((View) this.LLJJLIIIJLLLLLLLZ.getValue()).setBackground(C462590ICb.LIZIZ(interfaceC899690ZRf.LIZJ(), (View) this.LLJJLIIIJLLLLLLLZ.getValue()));
    }
}
