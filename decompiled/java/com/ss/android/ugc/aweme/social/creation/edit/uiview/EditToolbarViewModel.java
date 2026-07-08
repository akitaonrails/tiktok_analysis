package com.ss.android.ugc.aweme.social.creation.edit.uiview;

import X.AbstractC1678220tm0;
import X.C01GW;
import X.C05YD;
import X.C08CX;
import X.C09R3;
import X.C0C64;
import X.C0LEO;
import X.C13LE;
import X.C1402810mbn;
import X.C1428160nGg;
import X.C1660120tIo;
import X.C1660330tJ9;
import X.C1660340tJA;
import X.C1660360tJC;
import X.C1661820tLY;
import X.C1661900tLg;
import X.C1661930tLj;
import X.C1664750tQH;
import X.C1664770tQJ;
import X.C1683130ttv;
import X.C1BNE;
import X.C1DRG;
import X.C20684815ws;
import X.C2217381BqS;
import X.C2252321DDq;
import X.C289570BWp;
import X.C452501pT;
import X.EnumC992910bwf;
import X.InterfaceC1457610o2B;
import X.InterfaceC1461640o8g;
import X.InterfaceC1660130tIp;
import X.InterfaceC1660320tJ8;
import X.InterfaceC1664980tQe;
import X.InterfaceC1666580tTE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC332260D0u;
import X.InterfaceC379610EuV;
import androidx.lifecycle.ViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: loaded from: classes26.dex */
public final class EditToolbarViewModel extends ViewModel implements InterfaceC1666580tTE, InterfaceC379610EuV, InterfaceC1660320tJ8 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public final C1DRG LL;
    public final Function1<? super AbstractC1678220tm0, Unit> LLILLJJLI;
    public final Function1<? super C1661820tLY, Unit> LLILLL;
    public final C1660330tJ9 LLILZ;
    public final C1664750tQH LLJI;
    public final boolean LLJILJIL;
    public final C1664750tQH LLJILJILJ;
    public final C01GW LLJILLL;
    public final HashMap<AbstractC1678220tm0, InterfaceC1660130tIp<? extends AbstractC1678220tm0>> LLILZIL = new HashMap<>();
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 57));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 53));
    public final C2252321DDq LLIZLLLIL = C1BNE.LIZ(C08CX.INSTANCE);
    public final C2252321DDq LLJ = C1BNE.LIZ(new C1660340tJA(0));
    public final C01GW LLJIJIL = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(71));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(EditToolbarViewModel.class, "topUiApi", "getTopUiApi()Lcom/ss/android/ugc/gamora/editor/lightening/titlebar/BaseTitlebarApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(EditToolbarViewModel.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    @Override // X.InterfaceC1666580tTE
    public final C05YD<C1661820tLY> E90() {
        return (C05YD) this.LLJILLL.getValue();
    }

    public final C1683130ttv xQ2() {
        return new C1683130ttv(0.0f, ((InterfaceC1457610o2B) this.LLJI.getValue(this, LLJJ[0])).n2(), 0.0f, this.LLJILJIL ? ((Number) this.LLJIJIL.getValue()).floatValue() : C1428160nGg.LIZIZ + C0LEO.LIZ());
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    public final <T extends AbstractC1678220tm0> InterfaceC1660130tIp<T> vQ2(T t) {
        InterfaceC1660130tIp<T> interfaceC1660130tIp = (InterfaceC1660130tIp) this.LLILZIL.get(t);
        if (interfaceC1660130tIp == null) {
            return null;
        }
        return interfaceC1660130tIp;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final List<C1661930tLj<AbstractC1678220tm0, InterfaceC1461640o8g<? extends AbstractC1678220tm0>>> wQ2(EnumC992910bwf enumC992910bwf) {
        C05YD state;
        InterfaceC1461640o8g interfaceC1461640o8g;
        List<C1660120tIo<AbstractC1678220tm0>> list = this.LLILZ.LIZ;
        ArrayList<C1660120tIo> arrayList = new ArrayList();
        for (C1660120tIo<AbstractC1678220tm0> c1660120tIo : list) {
            if (c1660120tIo.LIZLLL == enumC992910bwf) {
                arrayList.add(c1660120tIo);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (C1660120tIo c1660120tIo2 : arrayList) {
            InterfaceC1664980tQe interfaceC1664980tQe = (InterfaceC1664980tQe) c1660120tIo2.LIZIZ.invoke();
            this.LLILZIL.put((AbstractC1678220tm0) c1660120tIo2.LIZ, (InterfaceC1660130tIp<? extends AbstractC1678220tm0>) c1660120tIo2.LIZJ.invoke(this.LL));
            InterfaceC1660130tIp interfaceC1660130tIpVQ2 = vQ2((AbstractC1678220tm0) c1660120tIo2.LIZ);
            if (interfaceC1660130tIpVQ2 != null && (state = interfaceC1660130tIpVQ2.getState()) != null && (interfaceC1461640o8g = (InterfaceC1461640o8g) state.getValue()) != null) {
                arrayList2.add(new C1661930tLj(c1660120tIo2.LIZ, interfaceC1461640o8g, interfaceC1664980tQe, new C1661900tLg(true, 6)));
            }
        }
        return arrayList2;
    }

    @Override // X.InterfaceC1660320tJ8
    public final void JM1(int i, Function2<? super C1661930tLj<AbstractC1678220tm0, InterfaceC1461640o8g<? extends AbstractC1678220tm0>>, ? super InterfaceC1660130tIp<AbstractC1678220tm0>, Unit> function2) {
        C1661930tLj<AbstractC1678220tm0, InterfaceC1461640o8g<? extends AbstractC1678220tm0>> c1661930tLj;
        C1661930tLj<AbstractC1678220tm0, InterfaceC1461640o8g<? extends AbstractC1678220tm0>> next;
        C1661820tLY value = E90().getValue();
        Iterator<C1661930tLj<AbstractC1678220tm0, InterfaceC1461640o8g<? extends AbstractC1678220tm0>>> it2 = value.LIZIZ.iterator();
        while (true) {
            c1661930tLj = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (((AbstractC1678220tm0) next.LIZ).LIZ == i) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C1661930tLj<AbstractC1678220tm0, InterfaceC1461640o8g<? extends AbstractC1678220tm0>> c1661930tLj2 = next;
        if (c1661930tLj2 == null) {
            Iterator<C1661930tLj<AbstractC1678220tm0, InterfaceC1461640o8g<? extends AbstractC1678220tm0>>> it3 = value.LIZJ.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                C1661930tLj<AbstractC1678220tm0, InterfaceC1461640o8g<? extends AbstractC1678220tm0>> next2 = it3.next();
                if (((AbstractC1678220tm0) next2.LIZ).LIZ == i) {
                    c1661930tLj = next2;
                    break;
                }
            }
            c1661930tLj2 = c1661930tLj;
            if (c1661930tLj2 == null) {
                return;
            }
        }
        InterfaceC1660130tIp interfaceC1660130tIpVQ2 = vQ2((AbstractC1678220tm0) c1661930tLj2.LIZ);
        if (interfaceC1660130tIpVQ2 != null) {
            function2.invoke(c1661930tLj2, interfaceC1660130tIpVQ2);
        }
    }

    @Override // X.InterfaceC1666580tTE
    public final void PC1(boolean z, boolean z2) {
        C2252321DDq c2252321DDq = this.LLJ;
        C1660340tJA c1660340tJA = (C1660340tJA) c2252321DDq.getValue();
        boolean z3 = c1660340tJA.LIZ;
        c1660340tJA.getClass();
        c2252321DDq.setValue(new C1660340tJA(z3, z, z2));
        C1402810mbn c1402810mbn = C1402810mbn.LIZ;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) this.LLJILJILJ.getValue(this, LLJJ[1]);
        c1402810mbn.getClass();
        C20684815ws.LJIILLIIL("click_expand_button", C1402810mbn.LIZ(videoPublishEditModel).LIZ);
    }

    public final void yQ2(int i, Function1<? super C1661930tLj<AbstractC1678220tm0, InterfaceC1461640o8g<? extends AbstractC1678220tm0>>, C1661930tLj<AbstractC1678220tm0, InterfaceC1461640o8g<? extends AbstractC1678220tm0>>> function1) {
        InterfaceC332260D0u interfaceC332260D0u = (InterfaceC332260D0u) this.LLILZLL.getValue();
        ArrayList arrayList = new ArrayList((Collection) ((InterfaceC332260D0u) this.LLILZLL.getValue()).getValue());
        zQ2(arrayList, i, function1);
        interfaceC332260D0u.setValue(arrayList);
        if (C289570BWp.LIZ()) {
            InterfaceC332260D0u interfaceC332260D0u2 = (InterfaceC332260D0u) this.LLIZ.getValue();
            ArrayList arrayList2 = new ArrayList((Collection) ((InterfaceC332260D0u) this.LLIZ.getValue()).getValue());
            zQ2(arrayList2, i, function1);
            interfaceC332260D0u2.setValue(arrayList2);
            return;
        }
        InterfaceC332260D0u interfaceC332260D0u3 = (InterfaceC332260D0u) this.LLIZ.getValue();
        Object value = ((InterfaceC332260D0u) this.LLIZ.getValue()).getValue();
        zQ2(new ArrayList((Collection) value), i, function1);
        interfaceC332260D0u3.setValue(value);
    }

    public EditToolbarViewModel(C1DRG c1drg, AwS604S0100000_25 awS604S0100000_25, C1660360tJC c1660360tJC) {
        this.LL = c1drg;
        this.LLILLJJLI = awS604S0100000_25;
        this.LLILLL = c1660360tJC;
        this.LLILZ = (C1660330tJ9) c1drg.LJII(C1660330tJ9.class, null);
        this.LLJI = C1664770tQJ.LIZ(c1drg, InterfaceC1457610o2B.class, null);
        this.LLJILJIL = C0C64.LJIILLIIL().LJIJ(31744, 0, "story_edit_compose_toolbar_opt", true) == 2;
        this.LLJILJILJ = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
        this.LLJILLL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 56));
    }

    public static void zQ2(List list, int i, Function1 function1) {
        Iterator it2 = ((ArrayList) list).iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            if (((AbstractC1678220tm0) ((C1661930tLj) it2.next()).LIZ).LIZ == i) {
                if (i2 > -1) {
                    ListProtector.set(list, i2, function1.invoke(ListProtector.get(list, i2)));
                    return;
                }
                return;
            }
            i2++;
        }
    }
}
