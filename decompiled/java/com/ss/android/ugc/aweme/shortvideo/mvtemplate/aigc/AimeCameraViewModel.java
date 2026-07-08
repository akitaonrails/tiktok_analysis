package com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc;

import X.AnonymousClass0951;
import X.AnonymousClass0956;
import X.C09IC;
import X.C0HN0;
import X.C1684430tw1;
import X.C1684510tw9;
import X.C1697810uHb;
import X.C1BNE;
import X.C2252321DDq;
import X.C23250099c;
import X.C566110MIf;
import X.EnumC1684470tw5;
import X.InterfaceC1692950u9l;
import X.InterfaceC439810HMl;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: loaded from: classes26.dex */
public final class AimeCameraViewModel extends ViewModel {
    public static final List<EnumC1684470tw5> LLJILJILJ = C1697810uHb.LJIIJJI(EnumC1684470tw5.FRONT, EnumC1684470tw5.FRONT_COUNTDOWN, EnumC1684470tw5.FRONT_CAPTURE, EnumC1684470tw5.DONE);
    public final boolean LL;
    public final String LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;
    public final String LLILZIL;
    public final C2252321DDq LLILZLL;
    public final AnonymousClass0951 LLIZ;
    public final C2252321DDq LLIZLLLIL;
    public final AnonymousClass0951 LLJ;
    public InterfaceC1692950u9l LLJI;
    public AnonymousClass0956 LLJIJIL;
    public int LLJILJIL;

    public final void vQ2(InterfaceC439810HMl interfaceC439810HMl) {
        EnumC1684470tw5 enumC1684470tw5;
        Object value;
        EnumC1684470tw5 enumC1684470tw52 = ((C1684510tw9) this.LLILZLL.getValue()).LIZ;
        List<EnumC1684470tw5> list = LLJILJILJ;
        int iIndexOf = list.indexOf(enumC1684470tw52);
        if (iIndexOf != -1 && iIndexOf < list.size() - 1) {
            enumC1684470tw5 = (EnumC1684470tw5) ListProtector.get(list, iIndexOf + 1);
        } else {
            enumC1684470tw5 = (EnumC1684470tw5) ListProtector.get(list, 0);
        }
        C2252321DDq c2252321DDq = this.LLILZLL;
        do {
            value = c2252321DDq.getValue();
        } while (!c2252321DDq.compareAndSet(value, C1684510tw9.LIZ((C1684510tw9) value, enumC1684470tw5, null, 2)));
        EnumC1684470tw5 enumC1684470tw53 = EnumC1684470tw5.FRONT_COUNTDOWN;
        if (enumC1684470tw5 == enumC1684470tw53) {
            int i = this.LLJILJIL + 1;
            this.LLJILJIL = i;
            C566110MIf.LIZ.getClass();
            C566110MIf.LIZIZ(i);
        }
        if (enumC1684470tw5 != EnumC1684470tw5.DONE && enumC1684470tw5 != enumC1684470tw53) {
            AnonymousClass0956 anonymousClass0956 = this.LLJIJIL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            this.LLJIJIL = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C0HN0(interfaceC439810HMl, this, enumC1684470tw5, null), 3);
        }
    }

    public AimeCameraViewModel(String str, String str2, boolean z, boolean z2, boolean z3) {
        this.LL = z;
        this.LLILLJJLI = str;
        this.LLILLL = z2;
        this.LLILZ = z3;
        this.LLILZIL = str2;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(new C1684510tw9(EnumC1684470tw5.INIT, null));
        this.LLILZLL = c2252321DDqLIZ;
        this.LLIZ = C09IC.LIZIZ(c2252321DDqLIZ);
        C2252321DDq c2252321DDqLIZ2 = C1BNE.LIZ(new C1684430tw1(0));
        this.LLIZLLLIL = c2252321DDqLIZ2;
        this.LLJ = C09IC.LIZIZ(c2252321DDqLIZ2);
    }
}
