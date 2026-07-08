package com.ss.android.ugc.aweme.im.service.avatar;

import X.AbstractC1153360g7S;
import X.C0NYY;
import X.C0O26;
import X.C0ZE7;
import X.C0ZJ7;
import X.C1153350g7R;
import X.C11PQ;
import X.C11S5;
import X.C1256150inF;
import X.C1607300rvc;
import X.C1607310rvd;
import X.C1607350rvh;
import X.C429270GsP;
import X.C595660NXw;
import X.C595710NYb;
import X.C896480ZEw;
import X.C897370ZIh;
import X.C897490ZIt;
import X.EnumC1606090rtf;
import X.EnumC1607270rvZ;
import X.InterfaceC1605410rsZ;
import X.InterfaceC1606880ruw;
import X.InterfaceC1607380rvk;
import X.InterfaceC1608820ry4;
import X.InterfaceC1608830ry5;
import X.InterfaceC897330ZId;
import X.InterfaceC897380ZIi;
import Y.ACListenerS158S0100000_24;
import Y.AfS193S0100000_24;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.im.service.avatar.AvatarActiveDataAdapter;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class AvatarActiveDataAdapter implements InterfaceC1608820ry4<AbstractC1153360g7S, C1607310rvd>, InterfaceC1608830ry5<AbstractC1153360g7S, C1607310rvd> {
    public final C1607310rvd LL;
    public AvatarComponentView LLILLJJLI;
    public String LLILLL;
    public AbstractC1153360g7S LLILZ;
    public InterfaceC1607380rvk LLILZIL;
    public C595660NXw LLILZLL;
    public Object LLIZ;
    public final LifecycleEventObserver LLIZLLLIL = new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.im.service.avatar.AvatarActiveDataAdapter$onResumeObserver$1
        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            AvatarActiveDataAdapter avatarActiveDataAdapter;
            String str;
            if (event == Lifecycle.Event.ON_RESUME && (str = (avatarActiveDataAdapter = this.LL).LLILLL) != null) {
                C595710NYb c595710NYbLIZJ = C0O26.LIZJ(AFwS264S0000000_24.get$arr$(182), str);
                InterfaceC897380ZIi.LIZIZ.getClass();
                C595660NXw c595660NXwLIZIZ = C897370ZIh.LIZ().LIZIZ(c595710NYbLIZJ);
                InterfaceC1607380rvk interfaceC1607380rvk = avatarActiveDataAdapter.LLILZIL;
                if (interfaceC1607380rvk != null) {
                    interfaceC1607380rvk.LJIIZILJ(str, c595660NXwLIZIZ, EnumC1607270rvZ.ACTIVE, false, null);
                }
            }
        }
    };
    public final C1607350rvh LLJ = new C0NYY() { // from class: X.0rvh
        @Override // X.C0NYY
        public final Object k3(Map<String, C595660NXw> map, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
            String str;
            InterfaceC1607380rvk interfaceC1607380rvk;
            C0NXK c0nxk;
            String str2 = this.LL.LLILLL;
            if (str2 == null) {
                return Unit.LIZ;
            }
            C595660NXw c595660NXw = map.get(str2);
            if (c595660NXw == null) {
                return Unit.LIZ;
            }
            C595660NXw c595660NXw2 = this.LL.LLILZLL;
            if (c595660NXw2 != null && (c0nxk = c595660NXw2.LIZIZ) != null) {
                str = c0nxk.LIZ;
            } else {
                str = null;
            }
            if ((!Intrinsics.LJFF(C1607300rvc.LIZ(C896480ZEw.LIZIZ(c595660NXw)), this.LL.LLILZ) || !Intrinsics.LJFF(str2, str)) && (interfaceC1607380rvk = this.LL.LLILZIL) != null) {
                interfaceC1607380rvk.LJIIZILJ(str2, c595660NXw, EnumC1607270rvZ.ACTIVE, false, null);
            }
            return Unit.LIZ;
        }
    };

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0rvh] */
    public AvatarActiveDataAdapter(C1607310rvd c1607310rvd) {
        this.LL = c1607310rvd;
    }

    public final void LIZ(AbstractC1153360g7S abstractC1153360g7S) {
        C0ZE7 c0ze7;
        C0ZE7 c0ze72;
        C1607310rvd c1607310rvd = this.LL;
        if (c1607310rvd != null && c1607310rvd.LJFF) {
            return;
        }
        boolean z = abstractC1153360g7S instanceof C1153350g7R;
        AvatarComponentView avatarComponentView = this.LLILLJJLI;
        if (avatarComponentView != null) {
            C0ZJ7.LIZIZ(avatarComponentView, this.LLILLL, Boolean.valueOf(z));
        }
        C1607310rvd c1607310rvd2 = this.LL;
        if (c1607310rvd2 != null && (c0ze72 = c1607310rvd2.LJ) != null) {
            c0ze72.LJII = Boolean.valueOf(z);
            c0ze72.LIZJ = this.LLILLL;
        }
        C1607310rvd c1607310rvd3 = this.LL;
        if (c1607310rvd3 != null) {
            c0ze7 = c1607310rvd3.LJ;
        } else {
            c0ze7 = null;
        }
        C897490ZIt.LIZLLL(c0ze7);
    }

    @Override // X.InterfaceC1608830ry5
    public final InterfaceC1606880ruw LIZLLL(Object obj) {
        if (obj instanceof C429270GsP) {
            this.LLILZ = C1607300rvc.LIZ((C429270GsP) obj);
        }
        return this.LLILZ;
    }

    @Override // X.InterfaceC1608820ry4
    public final InterfaceC1606880ruw LJFF(Object obj) {
        C595660NXw c595660NXw;
        EnumC1606090rtf enumC1606090rtf;
        AvatarComponentView avatarComponentView;
        EnumC1606090rtf enumC1606090rtf2 = null;
        if (obj instanceof C595660NXw) {
            c595660NXw = (C595660NXw) obj;
        } else {
            c595660NXw = null;
        }
        AbstractC1153360g7S abstractC1153360g7SLIZ = C1607300rvc.LIZ(C896480ZEw.LIZIZ(c595660NXw));
        this.LLILZ = abstractC1153360g7SLIZ;
        C1607310rvd c1607310rvd = this.LL;
        if (c1607310rvd != null) {
            enumC1606090rtf = c1607310rvd.LIZ;
        } else {
            enumC1606090rtf = null;
        }
        EnumC1606090rtf enumC1606090rtf3 = EnumC1606090rtf.COMMENT;
        if (enumC1606090rtf == enumC1606090rtf3 && (avatarComponentView = this.LLILLJJLI) != null && C1256150inF.LIZIZ(avatarComponentView)) {
            LIZ(abstractC1153360g7SLIZ);
        }
        C1607310rvd c1607310rvd2 = this.LL;
        if (c1607310rvd2 != null) {
            enumC1606090rtf2 = c1607310rvd2.LIZ;
        }
        if (enumC1606090rtf2 != enumC1606090rtf3) {
            LIZ(abstractC1153360g7SLIZ);
        }
        return abstractC1153360g7SLIZ;
    }

    @Override // X.InterfaceC1608820ry4
    public final void LJ(AvatarComponentView avatarComponentView, final LifecycleOwner lifecycleOwner) {
        InterfaceC897330ZId interfaceC897330ZId;
        Lifecycle lifecycle;
        InterfaceC1605410rsZ avatarEventAbility;
        C11PQ c11pqLIZ;
        this.LLILLJJLI = avatarComponentView;
        C1607310rvd c1607310rvd = this.LL;
        if (c1607310rvd == null || !c1607310rvd.LJFF) {
            avatarComponentView.getClickListener().LIZ(1, new ACListenerS158S0100000_24(new AwS568S0100000_24(this, 646), 21));
        }
        C1607310rvd c1607310rvd2 = this.LL;
        if (c1607310rvd2 == null || !c1607310rvd2.LJI) {
            avatarComponentView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: X.0rvi
                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewAttachedToWindow(View view) {
                    InterfaceC897330ZId interfaceC897330ZId2;
                    Lifecycle lifecycle2;
                    LifecycleOwner lifecycleOwner2 = lifecycleOwner;
                    if (lifecycleOwner2 != null && (lifecycle2 = lifecycleOwner2.getLifecycle()) != null) {
                        lifecycle2.addObserver(this.LLIZLLLIL);
                    }
                    AvatarActiveDataAdapter avatarActiveDataAdapter = this;
                    C1607310rvd c1607310rvd3 = avatarActiveDataAdapter.LL;
                    if (c1607310rvd3 != null && (interfaceC897330ZId2 = c1607310rvd3.LJII) != null) {
                        interfaceC897330ZId2.LIZIZ(true, avatarActiveDataAdapter.LLJ);
                    }
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewDetachedFromWindow(View view) {
                    InterfaceC897330ZId interfaceC897330ZId2;
                    Lifecycle lifecycle2;
                    LifecycleOwner lifecycleOwner2 = lifecycleOwner;
                    if (lifecycleOwner2 != null && (lifecycle2 = lifecycleOwner2.getLifecycle()) != null) {
                        lifecycle2.removeObserver(this.LLIZLLLIL);
                    }
                    AvatarActiveDataAdapter avatarActiveDataAdapter = this;
                    C1607310rvd c1607310rvd3 = avatarActiveDataAdapter.LL;
                    if (c1607310rvd3 != null && (interfaceC897330ZId2 = c1607310rvd3.LJII) != null) {
                        interfaceC897330ZId2.LJIIJ(avatarActiveDataAdapter.LLJ);
                    }
                }
            });
            if (avatarComponentView.isAttachedToWindow()) {
                if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                    lifecycle.addObserver(this.LLIZLLLIL);
                }
                C1607310rvd c1607310rvd3 = this.LL;
                if (c1607310rvd3 != null && (interfaceC897330ZId = c1607310rvd3.LJII) != null) {
                    interfaceC897330ZId.LIZIZ(true, this.LLJ);
                }
            }
        }
        C1607310rvd c1607310rvd4 = this.LL;
        if ((c1607310rvd4 != null && c1607310rvd4.LJFF) || (avatarEventAbility = avatarComponentView.getAvatarEventAbility()) == null || (c11pqLIZ = avatarEventAbility.LIZ()) == null) {
            return;
        }
        c11pqLIZ.LJL(C11S5.LIZ()).LJJLJLI(new AfS193S0100000_24(this, 9));
    }

    @Override // X.InterfaceC1608820ry4
    public final void LIZJ(String str, InterfaceC1607380rvk interfaceC1607380rvk, Object obj) {
        this.LLILLL = str;
        this.LLILZIL = interfaceC1607380rvk;
        this.LLIZ = obj;
        C1607310rvd c1607310rvd = this.LL;
        if (c1607310rvd != null) {
            if (c1607310rvd.LJI) {
                return;
            }
            C0ZE7 c0ze7 = c1607310rvd.LJ;
            if (c0ze7 != null) {
                c0ze7.LIZJ = str;
            }
        }
        C595710NYb c595710NYbLIZJ = C0O26.LIZJ(AFwS264S0000000_24.get$arr$(183), str);
        InterfaceC897380ZIi.LIZIZ.getClass();
        C595660NXw c595660NXwLIZIZ = C897370ZIh.LIZ().LIZIZ(c595710NYbLIZJ);
        this.LLILZLL = c595660NXwLIZIZ;
        interfaceC1607380rvk.LJIIZILJ(str, c595660NXwLIZIZ, EnumC1607270rvZ.ACTIVE, false, null);
    }
}
