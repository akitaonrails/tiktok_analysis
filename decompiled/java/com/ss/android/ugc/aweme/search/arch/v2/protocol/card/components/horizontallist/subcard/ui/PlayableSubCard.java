package com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.horizontallist.subcard.ui;

import X.C03H5;
import X.C0PCQ;
import X.C0QSJ;
import X.C1558420qem;
import X.C587060N0u;
import X.C650350Pf7;
import X.C650630PfZ;
import X.C655580PnY;
import X.C664400Q4g;
import X.C673150Qan;
import X.C687700QyG;
import X.InterfaceC1146704e9;
import X.InterfaceC1294060jmO;
import X.InterfaceC1891350zJl;
import X.InterfaceC584630MwP;
import X.InterfaceC648070PbR;
import X.InterfaceC657240PqE;
import X.InterfaceC658500PsG;
import X.InterfaceC659190PtN;
import X.InterfaceC665370Q7z;
import X.InterfaceC687730QyJ;
import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ext_power_list.AssemPowerCell;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.scope.SearchPlayerScope;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public abstract class PlayableSubCard<ASSEM extends ReusedUISlotAssem<? extends C03H5>, DATA extends InterfaceC657240PqE> extends AssemPowerCell<ASSEM, DATA> implements InterfaceC648070PbR, C0QSJ, InterfaceC1146704e9 {
    public final /* synthetic */ C650350Pf7 LLIZ = new C650350Pf7(null);
    public InterfaceC658500PsG LLIZLLLIL;

    @Override // X.InterfaceC648350Pbt
    public final boolean L0() {
        this.LLIZ.getClass();
        return true;
    }

    @Override // X.InterfaceC648350Pbt
    public final void LJJJLIIL() {
        this.LLIZ.LJJJLIIL();
    }

    @Override // X.InterfaceC648350Pbt
    public final void LJJLIIIJLLLLLLLZ() {
        this.LLIZ.LJJLIIIJLLLLLLLZ();
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean LLLLIIIILLL() {
        this.LLIZ.getClass();
        return true;
    }

    @Override // X.InterfaceC648350Pbt
    public final void LLZZZIL(C587060N0u c587060N0u) {
        this.LLIZ.getClass();
    }

    @Override // X.InterfaceC648350Pbt
    public final void Mu(C650630PfZ c650630PfZ) {
        this.LLIZ.Mu(c650630PfZ);
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean N1() {
        return this.LLIZ.N1();
    }

    @Override // X.InterfaceC648350Pbt
    public final void W0(long j, C587060N0u c587060N0u) {
        this.LLIZ.W0(j, c587060N0u);
    }

    @Override // X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        if (cls == InterfaceC658500PsG.class) {
            this.LLIZLLLIL = (InterfaceC658500PsG) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{SearchPlayerScope.class});
    }

    @Override // X.C0QSJ
    public final Object getAbility(Class cls) {
        if (cls == InterfaceC658500PsG.class) {
            return this.LLIZLLLIL;
        }
        return null;
    }

    @Override // X.InterfaceC648350Pbt
    public final View getDetectView() {
        return this.LLIZ.getDetectView();
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchPlayerScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC648350Pbt
    public final InterfaceC584630MwP getPreload() {
        this.LLIZ.getClass();
        return null;
    }

    @Override // X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(SearchPlayerScope.class);
        return arrayList;
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean isPlaying() {
        return this.LLIZ.isPlaying();
    }

    @Override // X.InterfaceC648350Pbt
    public final boolean l2() {
        this.LLIZ.getClass();
        return true;
    }

    @Override // X.InterfaceC650540PfQ
    public final boolean mm() {
        return this.LLIZ.mm();
    }

    @Override // X.C0QSJ
    public final void registerAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.InterfaceC648350Pbt
    public final void release() {
        this.LLIZ.getClass();
    }

    @Override // X.InterfaceC648350Pbt
    public final void setPlayMetrics(C664400Q4g c664400Q4g) {
        this.LLIZ.getClass();
    }

    @Override // X.InterfaceC648350Pbt
    public final void setPlayableLifecycleListener(InterfaceC659190PtN interfaceC659190PtN) {
        this.LLIZ.getClass();
    }

    @Override // X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        if (cls == InterfaceC658500PsG.class) {
            this.LLIZLLLIL = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // X.C0QSJ
    public final void unregisterAbilityLoadListener(InterfaceC687730QyJ interfaceC687730QyJ) {
    }

    @Override // X.InterfaceC648350Pbt
    public final void wp(C650630PfZ c650630PfZ) {
        this.LLIZ.wp(c650630PfZ);
    }

    @Override // X.InterfaceC648350Pbt
    public final Boolean z3() {
        this.LLIZ.getClass();
        return null;
    }

    @Override // X.InterfaceC648070PbR
    public final void H1() {
        this.LLIZ.LLILLJJLI = null;
    }

    @Override // X.InterfaceC648350Pbt
    public final String getDebugId() {
        C650350Pf7 c650350Pf7 = this.LLIZ;
        c650350Pf7.getClass();
        return C655580PnY.LIZ(c650350Pf7);
    }

    @Override // X.InterfaceC648350Pbt
    public final C0PCQ getPriority() {
        return this.LLIZ.LLILLL;
    }

    @Override // X.InterfaceC648350Pbt
    @InterfaceC1294060jmO
    public final View p0() {
        C650350Pf7 c650350Pf7 = this.LLIZ;
        c650350Pf7.getClass();
        return C655580PnY.LIZIZ(c650350Pf7);
    }

    @Override // X.InterfaceC648070PbR
    public final void LLILLIZIL(InterfaceC665370Q7z interfaceC665370Q7z) {
        this.LLIZ.LLILLJJLI = interfaceC665370Q7z;
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell
    /* JADX INFO: renamed from: N5 */
    public final void SN1(int i, InterfaceC1891350zJl interfaceC1891350zJl) {
        P5(interfaceC1891350zJl);
        this.LLIZ.LLILLJJLI = C1558420qem.LIZIZ(this);
    }

    @Override // com.bytedance.ext_power_list.AssemPowerCell, X.C0SMN
    public final void SN1(int i, Object obj) {
        P5((InterfaceC1891350zJl) obj);
        this.LLIZ.LLILLJJLI = C1558420qem.LIZIZ(this);
    }
}
