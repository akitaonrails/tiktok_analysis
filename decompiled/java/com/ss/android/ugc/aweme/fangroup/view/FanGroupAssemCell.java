package com.ss.android.ugc.aweme.fangroup.view;

import X.C019F;
import X.C01GW;
import X.C0I0B;
import X.C1229980i72;
import X.C1230940i8a;
import X.C1231050i8l;
import X.C13LE;
import X.C1529305yl;
import X.C1559260qg8;
import X.C1637806bA;
import X.C197039127h;
import X.C19719912Dl;
import X.C20684815ws;
import X.C2217381BqS;
import X.C418440Gaw;
import X.C452501pT;
import X.C723590SZx;
import X.C724750Sbp;
import X.C737910Sx3;
import X.C814420VxA;
import X.InterfaceC1587906Jp;
import X.InterfaceC1731706qJ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC712990Rxx;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.ss.android.ugc.aweme.fangroup.viewmodel.FanGroupListViewModel;
import com.ss.android.ugc.aweme.im.avatarloader.api.IDMAvatarLoader;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: loaded from: classes20.dex */
public final class FanGroupAssemCell extends ReusedUISlotAssem<FanGroupAssemCell> implements InterfaceC712990Rxx<C1230940i8a> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFFI;
    public final C1559260qg8 LLJJLIIIJLLLLLLLZ = new C1559260qg8(new C723590SZx(this, C1229980i72.class, null), checkSupervisorPrepared());
    public final InterfaceC1731706qJ LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C01GW LLJLLIL;
    public final C01GW LLJLLL;
    public final C01GW LLJZ;
    public final C01GW LLJZIJLIL;
    public final C01GW LLL;
    public final C01GW LLLF;
    public final C01GW LLLFF;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(FanGroupAssemCell.class, "vm", "getVm()Lcom/ss/android/ugc/aweme/fangroup/viewmodel/FanGroupListViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLFFI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public FanGroupAssemCell() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(FanGroupListViewModel.class);
        this.LLJL = C737910Sx3.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new AwS563S0100000_19(c19719912DlLIZ, 1424), null, AFwS257S0000000_19.get$arr$(156));
        this.LLJLIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1416));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1418));
        this.LLJLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1422));
        this.LLJLLIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1420));
        this.LLJLLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1419));
        this.LLJZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1417));
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1423));
        this.LLL = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1421));
        this.LLLF = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1425));
        this.LLLFF = C452501pT.LIZIZ(new AwS563S0100000_19(this, 1415));
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.ciu;
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final C1229980i72 sp() {
        return (C1229980i72) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public final C197039127h tp() {
        return (C197039127h) this.LLJZ.getValue();
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
        ((IDMAvatarLoader) this.LLLFF.getValue()).LIZ();
    }

    public final FanGroupListViewModel up() {
        return (FanGroupListViewModel) this.LLJL.getValue(this, LLLFFI[0]);
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Eo(View view) {
        FanGroupListViewModel fanGroupListViewModelUp = up();
        C1231050i8l c1231050i8l = (C1231050i8l) fanGroupListViewModelUp.LLILLJJLI.getValue();
        AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(fanGroupListViewModelUp, 2724);
        if (!c1231050i8l.LIZ) {
            c1231050i8l.LIZ = true;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("duration", C1529305yl.LIZ(Boolean.FALSE));
            linkedHashMap.putAll((Map) awS563S0100000_19.invoke());
            C0I0B.LJFF.LIZIZ();
            C20684815ws.LJIILLIIL("im_group_list_perf", linkedHashMap);
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        C1229980i72 c1229980i72Sp = sp();
        if (c1229980i72Sp != null) {
            int i = c1229980i72Sp.LLILLL;
            ((View) this.LLJLILLLLZIIL.getValue()).setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i))), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(i))), 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0209  */
    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(X.C1230940i8a r20) {
        /*
            Method dump skipped, instruction units count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.fangroup.view.FanGroupAssemCell.up(java.lang.Object):void");
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C1230940i8a c1230940i8a) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C1230940i8a c1230940i8a) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
        up(interfaceC1587906Jp);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void op(android.view.View r28, X.C1230940i8a r29, boolean r30) {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.fangroup.view.FanGroupAssemCell.op(android.view.View, X.0i8a, boolean):void");
    }
}
