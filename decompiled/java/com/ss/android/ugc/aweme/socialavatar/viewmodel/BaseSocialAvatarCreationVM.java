package com.ss.android.ugc.aweme.socialavatar.viewmodel;

import X.AnonymousClass0951;
import X.C01GW;
import X.C054G;
import X.C09IC;
import X.C0HL2;
import X.C0HL4;
import X.C0HL5;
import X.C0HL8;
import X.C0HLC;
import X.C0HLI;
import X.C0HMP;
import X.C0PEM;
import X.C1696790uFx;
import X.C1BNE;
import X.C1DFH;
import X.C1DFK;
import X.C2107308Nj;
import X.C2252321DDq;
import X.C2296808zG;
import X.C23118094a;
import X.C23250099c;
import X.C332340D1c;
import X.C439660HLw;
import X.C443120HZe;
import X.C452501pT;
import X.EnumC439240HKg;
import X.EnumC439270HKj;
import X.EnumC439580HLo;
import X.InterfaceC332260D0u;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import androidx.lifecycle.ViewModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS620S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public abstract class BaseSocialAvatarCreationVM extends ViewModel {
    public final C0HL8 LL;
    public final C0HMP LLILLJJLI;
    public final C0HLI LLILLL;
    public final C054G LLILZ;
    public final C2252321DDq LLILZIL;
    public final AnonymousClass0951 LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public final C2252321DDq LLJ;
    public final AnonymousClass0951 LLJI;
    public final C2252321DDq LLJIJIL;
    public final AnonymousClass0951 LLJILJIL;
    public final C2252321DDq LLJILJILJ;
    public final AnonymousClass0951 LLJILLL;
    public final C2252321DDq LLJJ;
    public final AnonymousClass0951 LLJJI;
    public final C2252321DDq LLJJIII;
    public final AnonymousClass0951 LLJJIJI;
    public final C2252321DDq LLJJIJIIJIL;
    public final AnonymousClass0951 LLJJIJIL;
    public final C2252321DDq LLJJJ;
    public final AnonymousClass0951 LLJJJIL;
    public Rect LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public long LLJJL;
    public final AwS585S0100000_6 LLJJLIIIJLLLLLLLZ;
    public final AwS585S0100000_6 LLJL;
    public final AwS585S0100000_6 LLJLIL;
    public final AwS585S0100000_6 LLJLILLLLZIIL;
    public final AwS620S0100000_6 LLJLL;
    public boolean LLJLLIL;

    public void yQ2() {
    }

    public final String wQ2() {
        return (String) this.LLJJJJLIIL.getValue();
    }

    public final InterfaceC332260D0u<C0HLC> xQ2() {
        return (InterfaceC332260D0u) this.LLIZ.getValue();
    }

    public C0HL8 vQ2() {
        return this.LL;
    }

    public BaseSocialAvatarCreationVM(C0HL8 c0hl8) {
        C1696790uFx c1696790uFx;
        Bitmap bitmapDecodeByteArray;
        this.LL = c0hl8;
        C0HMP c0hmp = C0HMP.LIZ;
        this.LLILLJJLI = c0hmp;
        this.LLILLL = C0HLI.LIZ;
        C1DFK c1dfkLIZ = C23118094a.LIZ();
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLILZ = C2296808zG.LIZ(C2107308Nj.LIZ.plus(c1dfkLIZ));
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(new C0HL4(0));
        this.LLILZIL = c2252321DDqLIZ;
        this.LLILZLL = C09IC.LIZIZ(c2252321DDqLIZ);
        this.LLIZ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 712));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 713));
        C2252321DDq c2252321DDqLIZ2 = C1BNE.LIZ(new C439660HLw(0));
        this.LLJ = c2252321DDqLIZ2;
        this.LLJI = C09IC.LIZIZ(c2252321DDqLIZ2);
        C2252321DDq c2252321DDqLIZ3 = C1BNE.LIZ(new C0HL5(null, 7));
        this.LLJIJIL = c2252321DDqLIZ3;
        this.LLJILJIL = C09IC.LIZIZ(c2252321DDqLIZ3);
        C2252321DDq c2252321DDqLIZ4 = C1BNE.LIZ(new C0HL2(0));
        this.LLJILJILJ = c2252321DDqLIZ4;
        this.LLJILLL = C09IC.LIZIZ(c2252321DDqLIZ4);
        C2252321DDq c2252321DDqLIZ5 = C1BNE.LIZ(EnumC439270HKj.NONE);
        this.LLJJ = c2252321DDqLIZ5;
        this.LLJJI = C09IC.LIZIZ(c2252321DDqLIZ5);
        C2252321DDq c2252321DDqLIZ6 = C1BNE.LIZ(EnumC439240HKg.NONE);
        this.LLJJIII = c2252321DDqLIZ6;
        this.LLJJIJI = C09IC.LIZIZ(c2252321DDqLIZ6);
        c0hmp.getClass();
        byte[] bytes = C0HMP.LIZJ().getBytes(C0HMP.LJ("key_aimoji_image"), null);
        if (bytes != null && (bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bytes, 0, bytes.length)) != null) {
            c1696790uFx = new C1696790uFx(bitmapDecodeByteArray);
        } else {
            c1696790uFx = null;
        }
        C2252321DDq c2252321DDqLIZ7 = C1BNE.LIZ(c1696790uFx);
        this.LLJJIJIIJIL = c2252321DDqLIZ7;
        this.LLJJIJIL = C09IC.LIZIZ(c2252321DDqLIZ7);
        C2252321DDq c2252321DDqLIZ8 = C1BNE.LIZ(EnumC439580HLo.UNKNOWN);
        this.LLJJJ = c2252321DDqLIZ8;
        this.LLJJJIL = C09IC.LIZIZ(c2252321DDqLIZ8);
        this.LLJJJJJIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(330));
        this.LLJJJJLIIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(331));
        Boolean bool = Boolean.FALSE;
        C09IC.LIZIZ(C1BNE.LIZ(new C443120HZe(null, bool, bool)));
        this.LLJJLIIIJLLLLLLLZ = new AwS585S0100000_6(this, 194);
        this.LLJL = new AwS585S0100000_6(this, 197);
        this.LLJLIL = new AwS585S0100000_6(this, 195);
        this.LLJLILLLLZIIL = new AwS585S0100000_6(this, 196);
        this.LLJLL = new AwS620S0100000_6(this, 85);
    }

    public final void zQ2(InterfaceC332260D0u<C0HLC> interfaceC332260D0u, long j, Function1<? super C0HLC, C0HLC> function1) {
        C0HLC value;
        if (j > 0) {
            C23250099c.LIZLLL(this.LLILZ, null, null, new C332340D1c(j, interfaceC332260D0u, function1, null), 3);
        } else {
            do {
                value = interfaceC332260D0u.getValue();
            } while (!interfaceC332260D0u.compareAndSet(value, function1.invoke(value)));
        }
    }
}
